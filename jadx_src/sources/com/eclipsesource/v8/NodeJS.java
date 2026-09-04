package com.eclipsesource.v8;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes6.dex */
public class NodeJS {
    private static final String GLOBAL = "global";
    private static final String NEXT_TICK = "nextTick";
    private static final String NODE = "node";
    private static final String PROCESS = "process";
    private static final String STARTUP_CALLBACK = "__run";
    private static final String STARTUP_SCRIPT = "global.__run(require, exports, module, __filename, __dirname);";
    private static final String STARTUP_SCRIPT_NAME = "startup";
    private static final String TMP_JS_EXT = ".js.tmp";
    private static final String VERSIONS = "versions";
    private String nodeVersion = null;
    private V8Function require;

    /* JADX INFO: renamed from: v8, reason: collision with root package name */
    private V8 f42405v8;

    private NodeJS(V8 v10) {
        this.f42405v8 = v10;
    }

    public static NodeJS createNodeJS() {
        return createNodeJS(null);
    }

    public static NodeJS createNodeJS(File file) throws Throwable {
        V8 v8CreateV8Runtime = V8.createV8Runtime(GLOBAL);
        NodeJS nodeJS = new NodeJS(v8CreateV8Runtime);
        v8CreateV8Runtime.registerJavaMethod(new JavaVoidCallback() { // from class: com.eclipsesource.v8.NodeJS.1
            @Override // com.eclipsesource.v8.JavaVoidCallback
            public void invoke(V8Object v8Object, V8Array v8Array) {
                V8Function v8Function = (V8Function) v8Array.get(0);
                try {
                    NodeJS.this.init(v8Function.twin());
                } finally {
                    v8Function.close();
                }
            }
        }, STARTUP_CALLBACK);
        try {
            File fileCreateTemporaryScriptFile = createTemporaryScriptFile(STARTUP_SCRIPT, STARTUP_SCRIPT_NAME);
            try {
                v8CreateV8Runtime.createNodeRuntime(fileCreateTemporaryScriptFile.getAbsolutePath());
                fileCreateTemporaryScriptFile.delete();
                if (file != null) {
                    nodeJS.exec(file);
                }
                return nodeJS;
            } catch (Throwable th2) {
                fileCreateTemporaryScriptFile.delete();
                throw th2;
            }
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private V8Function createScriptExecutionCallback(final File file) {
        return new V8Function(this.f42405v8, new JavaCallback() { // from class: com.eclipsesource.v8.NodeJS.2
            @Override // com.eclipsesource.v8.JavaCallback
            public Object invoke(V8Object v8Object, V8Array v8Array) {
                V8Array v8Array2 = new V8Array(NodeJS.this.f42405v8);
                try {
                    v8Array2.push(file.getAbsolutePath());
                    return NodeJS.this.require.call(null, v8Array2);
                } finally {
                    v8Array2.close();
                }
            }
        });
    }

    private static File createTemporaryScriptFile(String str, String str2) throws IOException {
        File fileCreateTempFile = File.createTempFile(str2, TMP_JS_EXT);
        PrintWriter printWriter = new PrintWriter(fileCreateTempFile, "UTF-8");
        try {
            printWriter.print(str);
            return fileCreateTempFile;
        } finally {
            printWriter.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void init(V8Function v8Function) {
        this.require = v8Function;
    }

    private void safeRelease(Releasable releasable) {
        if (releasable != null) {
            releasable.release();
        }
    }

    public void exec(File file) throws Throwable {
        V8Array v8Array;
        Throwable th2;
        V8Object object;
        V8Function v8FunctionCreateScriptExecutionCallback = createScriptExecutionCallback(file);
        try {
            object = this.f42405v8.getObject("process");
            try {
                v8Array = new V8Array(this.f42405v8);
                try {
                    v8Array.push((V8Value) v8FunctionCreateScriptExecutionCallback);
                    object.executeObjectFunction(NEXT_TICK, v8Array);
                    safeRelease(object);
                    safeRelease(v8Array);
                    safeRelease(v8FunctionCreateScriptExecutionCallback);
                } catch (Throwable th3) {
                    th2 = th3;
                    safeRelease(object);
                    safeRelease(v8Array);
                    safeRelease(v8FunctionCreateScriptExecutionCallback);
                    throw th2;
                }
            } catch (Throwable th4) {
                v8Array = null;
                th2 = th4;
            }
        } catch (Throwable th5) {
            v8Array = null;
            th2 = th5;
            object = null;
        }
    }

    public String getNodeVersion() throws Throwable {
        Releasable releasable;
        String str = this.nodeVersion;
        if (str != null) {
            return str;
        }
        V8Object object = null;
        try {
            V8Object object2 = this.f42405v8.getObject("process");
            try {
                object = object2.getObject(VERSIONS);
                this.nodeVersion = object.getString(NODE);
                safeRelease(object2);
                safeRelease(object);
                return this.nodeVersion;
            } catch (Throwable th2) {
                th = th2;
                releasable = object;
                object = object2;
                safeRelease(object);
                safeRelease(releasable);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            releasable = null;
        }
    }

    public V8 getRuntime() {
        return this.f42405v8;
    }

    public boolean handleMessage() {
        this.f42405v8.checkThread();
        return this.f42405v8.pumpMessageLoop();
    }

    public boolean isRunning() {
        this.f42405v8.checkThread();
        return this.f42405v8.isRunning();
    }

    public void release() {
        this.f42405v8.checkThread();
        if (!this.require.isReleased()) {
            this.require.close();
        }
        if (this.f42405v8.isReleased()) {
            return;
        }
        this.f42405v8.close();
    }

    public V8Object require(File file) {
        this.f42405v8.checkThread();
        V8Array v8Array = new V8Array(this.f42405v8);
        try {
            v8Array.push(file.getAbsolutePath());
            return (V8Object) this.require.call(null, v8Array);
        } finally {
            v8Array.close();
        }
    }
}
