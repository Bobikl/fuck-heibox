package com.eclipsesource.v8.debug;

import com.eclipsesource.v8.JavaVoidCallback;
import com.eclipsesource.v8.Releasable;
import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Function;
import com.eclipsesource.v8.V8Object;
import com.eclipsesource.v8.V8Value;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class V8DebugServer {
    private static final String DEBUG_BREAK_HANDLER = "__j2v8_debug_handler";
    public static String DEBUG_OBJECT_NAME = "__j2v8_Debug";
    private static final String HEADER_EMBEDDING_HOST = "Embedding-Host: ";
    private static final String HEADER_PROTOCOL_VERSION = "Protocol-Version: ";
    private static final String HEADER_TYPE = "Type: ";
    private static final String HEADER_V8_VERSION = "V8-Version: ";
    private static final String J2V8_VERSION = "4.0.0";
    private static final String MAKE_BREAK_EVENT = "__j2v8_MakeBreakEvent";
    private static final String MAKE_COMPILE_EVENT = "__j2v8_MakeCompileEvent";
    private static final int PROTOCOL_BUFFER_SIZE = 4096;
    private static final Charset PROTOCOL_CHARSET;
    private static final byte[] PROTOCOL_CONTENT_LENGTH_BYTES;
    private static final String PROTOCOL_CONTENT_LENGTH_HEADER = "Content-Length:";
    private static final String PROTOCOL_EOL = "\r\n";
    private static final byte[] PROTOCOL_EOL_BYTES;
    private static final String PROTOCOL_VERSION = "1";
    private static final String SET_LISTENER = "setListener";
    private static final String V8_DEBUG_OBJECT = "Debug";
    private static final String V8_VERSION = "4.10.253";
    private Socket client;
    private V8Object debugObject;
    private V8Object runningStateDcp;
    private V8 runtime;
    private ServerSocket server;
    private V8Object stoppedStateDcp;
    private boolean waitForConnection;
    private Object clientLock = new Object();
    private boolean traceCommunication = false;
    private List<String> requests = new LinkedList();

    public class ClientLoop implements Runnable {
        private int from;

        private ClientLoop() {
        }

        private int indexOf(byte[] bArr, byte[] bArr2, int i10, int i11) {
            int length = bArr.length;
            while (i10 < i11) {
                for (int i12 = 0; i12 <= length; i12++) {
                    if (i12 == length) {
                        return i10;
                    }
                    int i13 = i10 + i12;
                    if (i13 >= i11 || bArr2[i13] != bArr[i12]) {
                        break;
                    }
                }
                i10++;
            }
            return -1;
        }

        private byte[] join(byte[] bArr, byte[] bArr2, int i10, int i11) {
            byte[] bArr3 = new byte[bArr.length + i11];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            System.arraycopy(bArr2, i10, bArr3, bArr.length, i11);
            return bArr3;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0032 A[PHI: r8
  0x0032: PHI (r8v3 int) = (r8v2 int), (r8v7 int) binds: [B:10:0x0029, B:12:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:18:0x003b A[PHI: r6
  0x003b: PHI (r6v3 boolean) = (r6v2 boolean), (r6v10 boolean) binds: [B:14:0x0032, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:20:0x0054  */
        /* JADX WARN: Code duplicated, block: B:38:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        private void processClientRequests() throws IOException {
            InputStream inputStream;
            String str;
            byte[] bArr = new byte[0];
            byte[] bArr2 = new byte[4096];
            synchronized (V8DebugServer.this.clientLock) {
                inputStream = V8DebugServer.this.client.getInputStream();
            }
            int i10 = 0;
            boolean zSkipToolInfo = false;
            byte[] bArrJoin = bArr;
            int contentLength = -1;
            while (true) {
                int i11 = inputStream.read(bArr2, i10, 4096 - i10);
                if (i11 <= 0) {
                    return;
                }
                int i12 = i11 + i10;
                this.from = 0;
                do {
                    if (contentLength < 0) {
                        contentLength = readContentLength(bArr2, i12);
                        if (contentLength < 0) {
                            break;
                        }
                        if (!zSkipToolInfo) {
                            int iMin = Math.min(contentLength - bArrJoin.length, i12 - this.from);
                            bArrJoin = join(bArrJoin, bArr2, this.from, iMin);
                            this.from += iMin;
                            if (bArrJoin.length == contentLength) {
                                str = new String(bArrJoin, V8DebugServer.PROTOCOL_CHARSET);
                                synchronized (V8DebugServer.this.requests) {
                                    V8DebugServer.this.requests.add(str);
                                    zSkipToolInfo = false;
                                    bArrJoin = bArr;
                                    contentLength = -1;
                                }
                            }
                        } else {
                            int iMin2 = Math.min(contentLength - bArrJoin.length, i12 - this.from);
                            bArrJoin = join(bArrJoin, bArr2, this.from, iMin2);
                            this.from += iMin2;
                            if (bArrJoin.length == contentLength) {
                                str = new String(bArrJoin, V8DebugServer.PROTOCOL_CHARSET);
                                synchronized (V8DebugServer.this.requests) {
                                    V8DebugServer.this.requests.add(str);
                                    zSkipToolInfo = false;
                                    bArrJoin = bArr;
                                    contentLength = -1;
                                }
                            }
                        }
                    } else {
                        if (!zSkipToolInfo && !(zSkipToolInfo = skipToolInfo(bArr2, i12))) {
                            break;
                        }
                        int iMin3 = Math.min(contentLength - bArrJoin.length, i12 - this.from);
                        bArrJoin = join(bArrJoin, bArr2, this.from, iMin3);
                        this.from += iMin3;
                        if (bArrJoin.length == contentLength) {
                            str = new String(bArrJoin, V8DebugServer.PROTOCOL_CHARSET);
                            synchronized (V8DebugServer.this.requests) {
                                V8DebugServer.this.requests.add(str);
                            }
                            zSkipToolInfo = false;
                            bArrJoin = bArr;
                            contentLength = -1;
                        }
                    }
                } while (this.from < i12);
                int i13 = this.from;
                if (i13 < i12) {
                    System.arraycopy(bArr2, i13, bArr2, 0, i12 - i13);
                    i10 = i12 - this.from;
                } else {
                    i10 = 0;
                }
            }
        }

        private int readContentLength(byte[] bArr, int i10) throws IOException {
            int length;
            int iIndexOf;
            int iIndexOf2 = indexOf(V8DebugServer.PROTOCOL_CONTENT_LENGTH_BYTES, bArr, this.from, i10);
            if (iIndexOf2 < 0 || (iIndexOf = indexOf(V8DebugServer.PROTOCOL_EOL_BYTES, bArr, (length = iIndexOf2 + V8DebugServer.PROTOCOL_CONTENT_LENGTH_BYTES.length), i10)) < 0) {
                return -1;
            }
            String str = new String(bArr, length, iIndexOf - length, V8DebugServer.PROTOCOL_CHARSET);
            try {
                int i11 = Integer.parseInt(str.trim());
                this.from = iIndexOf + V8DebugServer.PROTOCOL_EOL_BYTES.length;
                return i11;
            } catch (Exception unused) {
                throw new IOException("Invalid content length header: '" + str + "' in message" + new String(bArr, V8DebugServer.PROTOCOL_CHARSET));
            }
        }

        private boolean skipToolInfo(byte[] bArr, int i10) {
            int iIndexOf = indexOf(V8DebugServer.PROTOCOL_EOL_BYTES, bArr, this.from, i10);
            if (iIndexOf < 0) {
                return false;
            }
            this.from = iIndexOf + V8DebugServer.PROTOCOL_EOL_BYTES.length;
            return true;
        }

        private void startHandshake() throws IOException {
            V8DebugServer.this.sendMessage(V8DebugServer.HEADER_V8_VERSION + V8DebugServer.V8_VERSION + "\r\n" + V8DebugServer.HEADER_PROTOCOL_VERSION + "1\r\n" + V8DebugServer.HEADER_EMBEDDING_HOST + "j2v8 " + V8DebugServer.J2V8_VERSION + "\r\n" + V8DebugServer.HEADER_TYPE + "connect\r\n", "");
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    Socket socketAccept = V8DebugServer.this.server.accept();
                    socketAccept.setTcpNoDelay(true);
                    synchronized (V8DebugServer.this.clientLock) {
                        try {
                            V8DebugServer.this.client = socketAccept;
                            V8DebugServer.this.waitForConnection = false;
                            V8DebugServer.this.clientLock.notifyAll();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    startHandshake();
                    processClientRequests();
                } catch (Exception e10) {
                    synchronized (V8DebugServer.this.clientLock) {
                        if (V8DebugServer.this.client != null) {
                            try {
                                V8DebugServer.this.client.close();
                            } catch (IOException unused) {
                            }
                            V8DebugServer.this.client = null;
                        }
                        V8DebugServer.this.logError(e10);
                    }
                }
            }
        }
    }

    public class EventHandler implements JavaVoidCallback {
        private EventHandler() {
        }

        private void safeRelease(Releasable releasable) {
            if (releasable != null) {
                releasable.release();
            }
        }

        @Override // com.eclipsesource.v8.JavaVoidCallback
        public void invoke(V8Object v8Object, V8Array v8Array) throws Throwable {
            if (v8Array == null || v8Array.isUndefined()) {
                return;
            }
            V8Object v8Object2 = null;
            try {
                int integer = v8Array.getInteger(0);
                V8Object object = v8Array.getObject(1);
                try {
                    V8Object object2 = v8Array.getObject(2);
                    if (V8DebugServer.this.traceCommunication) {
                        String str = "unknown";
                        switch (integer) {
                            case 1:
                                str = "Break";
                                break;
                            case 2:
                                str = "Exception";
                                break;
                            case 3:
                                str = "NewFunction";
                                break;
                            case 4:
                                str = "BeforeCompile";
                                break;
                            case 5:
                                str = "AfterCompile";
                                break;
                            case 6:
                                str = "CompileError";
                                break;
                            case 7:
                                str = "PromiseEvent";
                                break;
                            case 8:
                                str = "AsyncTaskEvent";
                                break;
                        }
                        System.out.println("V8 has emmitted an event of type " + str);
                    }
                    if (!V8DebugServer.this.isConnected()) {
                        safeRelease(object);
                        safeRelease(object2);
                        return;
                    }
                    if (integer == 1) {
                        V8DebugServer.this.enterBreakLoop(object, object2);
                    } else if (integer == 5 || integer == 6) {
                        V8DebugServer.this.sendCompileEvent(object2);
                    }
                    safeRelease(object);
                    safeRelease(object2);
                } catch (Exception e10) {
                    e = e10;
                    v8Object2 = object;
                    try {
                        V8DebugServer.this.logError(e);
                        safeRelease(v8Object2);
                        safeRelease(null);
                    } catch (Throwable th2) {
                        th = th2;
                        safeRelease(v8Object2);
                        safeRelease(v8Object2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    v8Object2 = null;
                    v8Object2 = object;
                    safeRelease(v8Object2);
                    safeRelease(v8Object2);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            } catch (Throwable th4) {
                th = th4;
                v8Object2 = null;
            }
        }
    }

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        PROTOCOL_CHARSET = charsetForName;
        PROTOCOL_EOL_BYTES = "\r\n".getBytes(charsetForName);
        PROTOCOL_CONTENT_LENGTH_BYTES = PROTOCOL_CONTENT_LENGTH_HEADER.getBytes(charsetForName);
    }

    public V8DebugServer(V8 v10, int i10, boolean z10) {
        this.runtime = v10;
        this.waitForConnection = z10;
        V8Object object = v10.getObject(DEBUG_OBJECT_NAME);
        if (object == null) {
            System.err.println("Cannot initialize debugger server - global debug object not found.");
            return;
        }
        try {
            this.debugObject = object.getObject(V8_DEBUG_OBJECT);
            object.close();
            v10.executeVoidScript("(function() {\n " + DEBUG_OBJECT_NAME + ".Debug. " + MAKE_BREAK_EVENT + " = function (break_id,breakpoints_hit) {\n  return new " + DEBUG_OBJECT_NAME + ".BreakEvent(break_id,breakpoints_hit);\n }\n " + DEBUG_OBJECT_NAME + ".Debug. " + MAKE_COMPILE_EVENT + " = function(script,type) {\n  var scripts = " + DEBUG_OBJECT_NAME + ".Debug.scripts()\n  for (var i in scripts) {\n   if (scripts[i].id == script.id()) {\n     return new " + DEBUG_OBJECT_NAME + ".CompileEvent(scripts[i], type);\n   }\n  }\n  return {toJSONProtocol: function() {return ''}}\n }\n})()");
            try {
                this.server = new ServerSocket(i10);
            } catch (Exception e10) {
                logError(e10);
            }
        } catch (Throwable th2) {
            object.close();
            throw th2;
        }
    }

    public static void configureV8ForDebugging() {
        try {
            V8.setFlags("-expose-debug-as=" + DEBUG_OBJECT_NAME);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enterBreakLoop(V8Object v8Object, V8Object v8Object2) throws IOException {
        V8Object v8ObjectExecuteObjectFunction;
        try {
            V8Array v8Array = new V8Array(this.runtime);
            try {
                v8Array.push(false);
                this.stoppedStateDcp = v8Object.executeObjectFunction("debugCommandProcessor", v8Array);
                v8Array.close();
                int integer = v8Object.getInteger("break_id");
                V8Array array = v8Object2.getArray("break_points_hit_");
                V8Array v8Array2 = new V8Array(this.runtime);
                try {
                    v8Array2.push(integer);
                    v8Array2.push((V8Value) array);
                    v8ObjectExecuteObjectFunction = this.debugObject.executeObjectFunction(MAKE_BREAK_EVENT, v8Array2);
                    try {
                        String strExecuteStringFunction = v8ObjectExecuteObjectFunction.executeStringFunction("toJSONProtocol", null);
                        if (this.traceCommunication) {
                            System.out.println("Sending event (Break):\n" + strExecuteStringFunction);
                        }
                        sendJson(strExecuteStringFunction);
                        v8Array2.close();
                        array.close();
                        v8ObjectExecuteObjectFunction.close();
                        while (isConnected() && !this.stoppedStateDcp.executeBooleanFunction("isRunning", null)) {
                            try {
                                processRequests(10L);
                            } catch (InterruptedException unused) {
                            }
                        }
                        this.stoppedStateDcp.close();
                        this.stoppedStateDcp = null;
                    } catch (Throwable th2) {
                        th = th2;
                        v8Array2.close();
                        array.close();
                        if (v8ObjectExecuteObjectFunction != null) {
                            v8ObjectExecuteObjectFunction.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    v8ObjectExecuteObjectFunction = null;
                }
            } catch (Throwable th4) {
                v8Array.close();
                throw th4;
            }
        } catch (Throwable th5) {
            this.stoppedStateDcp.close();
            this.stoppedStateDcp = null;
            throw th5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isConnected() {
        boolean z10;
        Socket socket;
        synchronized (this.clientLock) {
            z10 = (this.server == null || (socket = this.client) == null || !socket.isConnected()) ? false : true;
        }
        return z10;
    }

    private void processRequest(String str) throws IOException {
        if (this.traceCommunication) {
            System.out.println("Got message: \n" + str.substring(0, Math.min(str.length(), 1000)));
        }
        V8Array v8Array = new V8Array(this.runtime);
        v8Array.push(str);
        V8Object v8Object = this.stoppedStateDcp;
        if (v8Object == null) {
            v8Object = this.runningStateDcp;
        }
        String string = v8Object.executeFunction("processDebugJSONRequest", v8Array).toString();
        if (this.stoppedStateDcp == null && string.contains("\"running\":false")) {
            string = string.replace("\"running\":false", "\"running\":true").replace("\"success\":true", "\"success\":false").replace("{\"", "{\"message\":\"Client requested suspension is not supported on J2V8.\",\"");
            v8Object.add("running_", true);
        }
        if (this.traceCommunication) {
            System.out.println("Returning response: \n" + string.substring(0, Math.min(string.length(), 1000)));
        }
        sendJson(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendCompileEvent(V8Object v8Object) throws Throwable {
        Throwable th2;
        V8Object v8ObjectExecuteObjectFunction;
        if (!isConnected()) {
            return;
        }
        int integer = v8Object.getInteger("type_");
        V8Object object = v8Object.getObject("script_");
        V8Array v8Array = new V8Array(this.runtime);
        try {
            v8Array.push((V8Value) object);
            v8Array.push(integer);
            v8ObjectExecuteObjectFunction = this.debugObject.executeObjectFunction(MAKE_COMPILE_EVENT, v8Array);
            try {
                String strExecuteStringFunction = v8ObjectExecuteObjectFunction.executeStringFunction("toJSONProtocol", null);
                if (this.traceCommunication) {
                    System.out.println("Sending event (CompileEvent):\n" + strExecuteStringFunction.substring(0, Math.min(strExecuteStringFunction.length(), 1000)));
                }
                if (strExecuteStringFunction.length() > 0) {
                    sendJson(strExecuteStringFunction);
                }
                v8Array.close();
                object.close();
                v8ObjectExecuteObjectFunction.close();
            } catch (Throwable th3) {
                th2 = th3;
                v8Array.close();
                object.close();
                if (v8ObjectExecuteObjectFunction != null) {
                    v8ObjectExecuteObjectFunction.close();
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            v8ObjectExecuteObjectFunction = null;
        }
    }

    private void sendJson(String str) throws IOException {
        sendMessage("", str.replace("\\/", "/"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendMessage(String str, String str2) throws IOException {
        synchronized (this.clientLock) {
            if (!isConnected()) {
                throw new IOException("There is no connected client.");
            }
            Charset charset = PROTOCOL_CHARSET;
            byte[] bytes = str2.getBytes(charset);
            this.client.getOutputStream().write((str + PROTOCOL_CONTENT_LENGTH_HEADER + Integer.toString(bytes.length) + "\r\n\r\n").getBytes(charset));
            if (bytes.length > 0) {
                this.client.getOutputStream().write(bytes);
            }
        }
    }

    private void setupEventHandler() throws Throwable {
        V8Array v8Array;
        Throwable th2;
        V8Function v8Function;
        this.debugObject.registerJavaMethod(new EventHandler(), DEBUG_BREAK_HANDLER);
        try {
            v8Function = (V8Function) this.debugObject.getObject(DEBUG_BREAK_HANDLER);
            try {
                v8Array = new V8Array(this.runtime);
                try {
                    v8Array.push((V8Value) v8Function);
                    this.debugObject.executeFunction(SET_LISTENER, v8Array);
                    if (v8Function != null && !v8Function.isReleased()) {
                        v8Function.close();
                    }
                    if (v8Array.isReleased()) {
                        return;
                    }
                    v8Array.close();
                } catch (Throwable th3) {
                    th2 = th3;
                    if (v8Function != null && !v8Function.isReleased()) {
                        v8Function.close();
                    }
                    if (v8Array != null && !v8Array.isReleased()) {
                        v8Array.close();
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                v8Array = null;
                th2 = th4;
            }
        } catch (Throwable th5) {
            v8Array = null;
            th2 = th5;
            v8Function = null;
        }
    }

    public int getPort() {
        ServerSocket serverSocket = this.server;
        if (serverSocket == null || !serverSocket.isBound()) {
            return -1;
        }
        return this.server.getLocalPort();
    }

    protected void logError(Throwable th2) {
        th2.printStackTrace();
    }

    public void processRequests(long j10) throws InterruptedException {
        String[] strArr;
        if (this.server == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (true) {
            synchronized (this.requests) {
                List<String> list = this.requests;
                strArr = (String[]) list.toArray(new String[list.size()]);
                this.requests.clear();
            }
            for (String str : strArr) {
                try {
                    processRequest(str);
                } catch (Exception e10) {
                    logError(e10);
                }
            }
            if (strArr.length <= 0) {
                if (j10 > 0) {
                    Thread.sleep(10L);
                }
                if (j10 <= 0 || jCurrentTimeMillis + j10 <= System.currentTimeMillis()) {
                    return;
                }
            }
        }
    }

    public void setTraceCommunication(boolean z10) {
        this.traceCommunication = z10;
    }

    public void start() throws Throwable {
        if (this.server == null) {
            return;
        }
        boolean z10 = this.waitForConnection;
        Thread thread = new Thread(new ClientLoop(), "J2V8 Debugger Server");
        thread.setDaemon(true);
        thread.start();
        setupEventHandler();
        this.runningStateDcp = this.runtime.executeObjectScript("(function() {return new " + DEBUG_OBJECT_NAME + ".DebugCommandProcessor(null, true)})()");
        if (z10) {
            synchronized (this.clientLock) {
                while (this.waitForConnection) {
                    try {
                        this.clientLock.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
            try {
                processRequests(100L);
            } catch (InterruptedException unused2) {
            }
        }
    }

    public void stop() {
        try {
            this.server.close();
            synchronized (this.clientLock) {
                Socket socket = this.client;
                if (socket != null) {
                    socket.close();
                    this.client = null;
                }
            }
        } catch (IOException e10) {
            logError(e10);
        }
        V8Object v8Object = this.runningStateDcp;
        if (v8Object != null) {
            v8Object.close();
            this.runningStateDcp = null;
        }
        V8Object v8Object2 = this.debugObject;
        if (v8Object2 != null) {
            v8Object2.close();
            this.debugObject = null;
        }
        V8Object v8Object3 = this.stoppedStateDcp;
        if (v8Object3 != null) {
            v8Object3.close();
            this.stoppedStateDcp = null;
        }
    }
}
