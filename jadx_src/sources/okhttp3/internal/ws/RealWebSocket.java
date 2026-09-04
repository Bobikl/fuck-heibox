package okhttp3.internal.ws;

import com.google.android.gms.common.internal.s;
import com.google.common.net.c;
import com.igexin.assist.sdk.AssistPushConsts;
import com.max.hbwallet.bean.MallCouponObj;
import dl.d;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.text.u;
import l5.a;
import okhttp3.Protocol;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.e;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.p;
import okhttp3.z;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import z5.f;

/* JADX INFO: compiled from: RealWebSocket.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 r2\u00020\u00012\u00020\u0002:\u0005srtuvBA\u0012\u0006\u0010o\u001a\u00020n\u0012\u0006\u0010`\u001a\u00020\r\u0012\u0006\u0010c\u001a\u00020b\u0012\u0006\u0010h\u001a\u00020g\u0012\u0006\u0010j\u001a\u00020\u000f\u0012\b\u0010k\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010m\u001a\u00020\u000f¢\u0006\u0004\bp\u0010qJ\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012J!\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010 \u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eJ\u0006\u0010!\u001a\u00020\u000bJ\u0006\u0010\"\u001a\u00020\u0004J\u0016\u0010&\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$J\u0006\u0010'\u001a\u00020\u000bJ\u0006\u0010(\u001a\u00020\bJ\u0006\u0010)\u001a\u00020\bJ\u0006\u0010*\u001a\u00020\bJ\u0010\u0010,\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u001cH\u0016J\u0010\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u0006H\u0016J\u0010\u0010/\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u0006H\u0016J\u0010\u00100\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u0006H\u0016J\u0018\u00103\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\u001cH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u001cH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0006H\u0016J\u000e\u00104\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0006J\u001a\u00105\u001a\u00020\u00042\u0006\u00101\u001a\u00020\b2\b\u00102\u001a\u0004\u0018\u00010\u001cH\u0016J \u00105\u001a\u00020\u00042\u0006\u00101\u001a\u00020\b2\b\u00102\u001a\u0004\u0018\u00010\u001c2\u0006\u00106\u001a\u00020\u000fJ\u000f\u00109\u001a\u00020\u0004H\u0000¢\u0006\u0004\b7\u00108J\u000f\u0010<\u001a\u00020\u000bH\u0000¢\u0006\u0004\b:\u0010;J\u001c\u0010@\u001a\u00020\u000b2\n\u0010?\u001a\u00060=j\u0002`>2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015R\u0014\u0010A\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010P\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010BR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010RR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00060S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020V0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010UR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010XR\u0016\u0010Y\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010]\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010BR\u0016\u0010^\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010ZR\u0016\u0010(\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\\R\u0016\u0010)\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\\R\u0016\u0010*\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\\R\u0016\u0010_\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010ZR\u0014\u0010`\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u001a\u0010c\u001a\u00020b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010j\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010XR\u0018\u0010k\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010m\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010X¨\u0006w"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket;", "Lokhttp3/f0;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "Lokhttp3/internal/ws/WebSocketExtensions;", "", "isValid", "Lokio/ByteString;", "data", "", "formatOpcode", "send", "Lkotlin/b2;", "runWriter", "Lokhttp3/a0;", "request", "", "queueSize", "cancel", "Lokhttp3/z;", "client", "connect", "Lokhttp3/c0;", "response", "Lokhttp3/internal/connection/Exchange;", MallCouponObj.TYPE_EXCHANGE, "checkUpgradeSuccess$okhttp", "(Lokhttp3/c0;Lokhttp3/internal/connection/Exchange;)V", "checkUpgradeSuccess", "", "name", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "streams", "initReaderAndWriter", "loopReader", "processNextFrame", a.f130839h0, "Ljava/util/concurrent/TimeUnit;", "timeUnit", "awaitTermination", "tearDown", "sentPingCount", "receivedPingCount", "receivedPongCount", "text", "onReadMessage", "bytes", AssistPushConsts.MSG_TYPE_PAYLOAD, "onReadPing", "onReadPong", "code", "reason", "onReadClose", "pong", "close", "cancelAfterCloseMillis", "writeOneFrame$okhttp", "()Z", "writeOneFrame", "writePingFrame$okhttp", "()V", "writePingFrame", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "failWebSocket", "key", "Ljava/lang/String;", "Lokhttp3/e;", "call", "Lokhttp3/e;", "Lokhttp3/internal/concurrent/Task;", "writerTask", "Lokhttp3/internal/concurrent/Task;", "Lokhttp3/internal/ws/WebSocketReader;", "reader", "Lokhttp3/internal/ws/WebSocketReader;", "Lokhttp3/internal/ws/WebSocketWriter;", "writer", "Lokhttp3/internal/ws/WebSocketWriter;", "Lokhttp3/internal/concurrent/TaskQueue;", "taskQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "Ljava/util/ArrayDeque;", "pongQueue", "Ljava/util/ArrayDeque;", "", "messageAndCloseQueue", "J", "enqueuedClose", "Z", "receivedCloseCode", "I", "receivedCloseReason", f.f141859j, "awaitingPong", "originalRequest", "Lokhttp3/a0;", "Lokhttp3/g0;", s.a.f52543a, "Lokhttp3/g0;", "getListener$okhttp", "()Lokhttp3/g0;", "Ljava/util/Random;", "random", "Ljava/util/Random;", "pingIntervalMillis", "extensions", "Lokhttp3/internal/ws/WebSocketExtensions;", "minimumDeflateSize", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/a0;Lokhttp3/g0;Ljava/util/Random;JLokhttp3/internal/ws/WebSocketExtensions;J)V", "Companion", "Close", "Message", "Streams", "WriterTask", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class RealWebSocket implements f0, WebSocketReader.FrameCallback {
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private boolean awaitingPong;
    private e call;
    private boolean enqueuedClose;
    private WebSocketExtensions extensions;
    private boolean failed;
    private final String key;

    @d
    private final g0 listener;
    private final ArrayDeque<Object> messageAndCloseQueue;
    private long minimumDeflateSize;
    private String name;
    private final a0 originalRequest;
    private final long pingIntervalMillis;
    private final ArrayDeque<ByteString> pongQueue;
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private int receivedCloseCode;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private Streams streams;
    private TaskQueue taskQueue;
    private WebSocketWriter writer;
    private Task writerTask;
    private static final List<Protocol> ONLY_HTTP1 = kotlin.collections.s.k(Protocol.HTTP_1_1);

    /* JADX INFO: compiled from: RealWebSocket.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Close;", "", "code", "", "reason", "Lokio/ByteString;", "cancelAfterCloseMillis", "", "(ILokio/ByteString;J)V", "getCancelAfterCloseMillis", "()J", "getCode", "()I", "getReason", "()Lokio/ByteString;", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;

        @dl.e
        private final ByteString reason;

        public Close(int i10, @dl.e ByteString byteString, long j10) {
            this.code = i10;
            this.reason = byteString;
            this.cancelAfterCloseMillis = j10;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }

        public final int getCode() {
            return this.code;
        }

        @dl.e
        public final ByteString getReason() {
            return this.reason;
        }
    }

    /* JADX INFO: compiled from: RealWebSocket.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Message;", "", "formatOpcode", "", "data", "Lokio/ByteString;", "(ILokio/ByteString;)V", "getData", "()Lokio/ByteString;", "getFormatOpcode", "()I", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Message {

        @d
        private final ByteString data;
        private final int formatOpcode;

        public Message(int i10, @d ByteString data) {
            kotlin.jvm.internal.f0.p(data, "data");
            this.formatOpcode = i10;
            this.data = data;
        }

        @d
        public final ByteString getData() {
            return this.data;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }
    }

    /* JADX INFO: compiled from: RealWebSocket.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Streams;", "Ljava/io/Closeable;", "client", "", "source", "Lokio/BufferedSource;", "sink", "Lokio/BufferedSink;", "(ZLokio/BufferedSource;Lokio/BufferedSink;)V", "getClient", "()Z", "getSink", "()Lokio/BufferedSink;", "getSource", "()Lokio/BufferedSource;", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static abstract class Streams implements Closeable {
        private final boolean client;

        @d
        private final BufferedSink sink;

        @d
        private final BufferedSource source;

        public Streams(boolean z10, @d BufferedSource source, @d BufferedSink sink) {
            kotlin.jvm.internal.f0.p(source, "source");
            kotlin.jvm.internal.f0.p(sink, "sink");
            this.client = z10;
            this.source = source;
            this.sink = sink;
        }

        public final boolean getClient() {
            return this.client;
        }

        @d
        public final BufferedSink getSink() {
            return this.sink;
        }

        @d
        public final BufferedSource getSource() {
            return this.source;
        }
    }

    /* JADX INFO: compiled from: RealWebSocket.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$WriterTask;", "Lokhttp3/internal/concurrent/Task;", "(Lokhttp3/internal/ws/RealWebSocket;)V", "runOnce", "", "okhttp"}, k = 1, mv = {1, 4, 0})
    public final class WriterTask extends Task {
        public WriterTask() {
            super(RealWebSocket.this.name + " writer", false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            try {
                return RealWebSocket.this.writeOneFrame$okhttp() ? 0L : -1L;
            } catch (IOException e10) {
                RealWebSocket.this.failWebSocket(e10, null);
                return -1L;
            }
        }
    }

    public RealWebSocket(@d TaskRunner taskRunner, @d a0 originalRequest, @d g0 listener, @d Random random, long j10, @dl.e WebSocketExtensions webSocketExtensions, long j11) {
        kotlin.jvm.internal.f0.p(taskRunner, "taskRunner");
        kotlin.jvm.internal.f0.p(originalRequest, "originalRequest");
        kotlin.jvm.internal.f0.p(listener, "listener");
        kotlin.jvm.internal.f0.p(random, "random");
        this.originalRequest = originalRequest;
        this.listener = listener;
        this.random = random;
        this.pingIntervalMillis = j10;
        this.extensions = webSocketExtensions;
        this.minimumDeflateSize = j11;
        this.taskQueue = taskRunner.newQueue();
        this.pongQueue = new ArrayDeque<>();
        this.messageAndCloseQueue = new ArrayDeque<>();
        this.receivedCloseCode = -1;
        if (!kotlin.jvm.internal.f0.g("GET", originalRequest.m())) {
            throw new IllegalArgumentException(("Request must be GET: " + originalRequest.m()).toString());
        }
        ByteString.Companion companion = ByteString.INSTANCE;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        b2 b2Var = b2.f124493a;
        this.key = ByteString.Companion.of$default(companion, bArr, 0, 0, 3, null).base64();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValid(WebSocketExtensions webSocketExtensions) {
        if (webSocketExtensions.unknownValues || webSocketExtensions.clientMaxWindowBits != null) {
            return false;
        }
        Integer num = webSocketExtensions.serverMaxWindowBits;
        if (num == null) {
            return true;
        }
        int iIntValue = num.intValue();
        return 8 <= iIntValue && 15 >= iIntValue;
    }

    private final void runWriter() {
        if (!Util.assertionsEnabled || Thread.holdsLock(this)) {
            Task task = this.writerTask;
            if (task != null) {
                TaskQueue.schedule$default(this.taskQueue, task, 0L, 2, null);
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        kotlin.jvm.internal.f0.o(threadCurrentThread, "Thread.currentThread()");
        sb2.append(threadCurrentThread.getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    private final synchronized boolean send(ByteString data, int formatOpcode) {
        if (!this.failed && !this.enqueuedClose) {
            if (this.queueSize + ((long) data.size()) > MAX_QUEUE_SIZE) {
                close(1001, null);
                return false;
            }
            this.queueSize += (long) data.size();
            this.messageAndCloseQueue.add(new Message(formatOpcode, data));
            runWriter();
            return true;
        }
        return false;
    }

    public final void awaitTermination(long j10, @d TimeUnit timeUnit) throws InterruptedException {
        kotlin.jvm.internal.f0.p(timeUnit, "timeUnit");
        this.taskQueue.idleLatch().await(j10, timeUnit);
    }

    @Override // okhttp3.f0
    public void cancel() {
        e eVar = this.call;
        kotlin.jvm.internal.f0.m(eVar);
        eVar.cancel();
    }

    public final void checkUpgradeSuccess$okhttp(@d c0 response, @dl.e Exchange exchange) throws IOException {
        kotlin.jvm.internal.f0.p(response, "response");
        if (response.x() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.x() + ' ' + response.getMessage() + '\'');
        }
        String strJ = c0.J(response, "Connection", null, 2, null);
        if (!u.L1(c.N, strJ, true)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strJ + '\'');
        }
        String strJ2 = c0.J(response, c.N, null, 2, null);
        if (!u.L1("websocket", strJ2, true)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strJ2 + '\'');
        }
        String strJ3 = c0.J(response, c.P1, null, 2, null);
        String strBase64 = ByteString.INSTANCE.encodeUtf8(this.key + WebSocketProtocol.ACCEPT_MAGIC).sha1().base64();
        if (!(!kotlin.jvm.internal.f0.g(strBase64, strJ3))) {
            if (exchange == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strBase64 + "' but was '" + strJ3 + '\'');
    }

    @Override // okhttp3.f0
    public boolean close(int code, @dl.e String reason) {
        return close(code, reason, 60000L);
    }

    public final synchronized boolean close(int code, @dl.e String reason, long cancelAfterCloseMillis) {
        WebSocketProtocol.INSTANCE.validateCloseCode(code);
        ByteString byteStringEncodeUtf8 = null;
        if (reason != null) {
            byteStringEncodeUtf8 = ByteString.INSTANCE.encodeUtf8(reason);
            if (!(((long) byteStringEncodeUtf8.size()) <= 123)) {
                throw new IllegalArgumentException(("reason.size() > 123: " + reason).toString());
            }
        }
        if (!this.failed && !this.enqueuedClose) {
            this.enqueuedClose = true;
            this.messageAndCloseQueue.add(new Close(code, byteStringEncodeUtf8, cancelAfterCloseMillis));
            runWriter();
            return true;
        }
        return false;
    }

    public final void connect(@d z client) {
        kotlin.jvm.internal.f0.p(client, "client");
        if (this.originalRequest.i(c.Q1) != null) {
            failWebSocket(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        z zVarF = client.e0().r(p.NONE).f0(ONLY_HTTP1).f();
        final a0 a0VarB = this.originalRequest.n().n(c.N, "websocket").n("Connection", c.N).n(c.R1, this.key).n(c.T1, "13").n(c.Q1, "permessage-deflate").b();
        RealCall realCall = new RealCall(zVarF, a0VarB, true);
        this.call = realCall;
        kotlin.jvm.internal.f0.m(realCall);
        realCall.enqueue(new okhttp3.f() { // from class: okhttp3.internal.ws.RealWebSocket.connect.1
            @Override // okhttp3.f
            public void onFailure(@d e call, @d IOException e10) {
                kotlin.jvm.internal.f0.p(call, "call");
                kotlin.jvm.internal.f0.p(e10, "e");
                RealWebSocket.this.failWebSocket(e10, null);
            }

            @Override // okhttp3.f
            public void onResponse(@d e call, @d c0 response) throws IOException {
                kotlin.jvm.internal.f0.p(call, "call");
                kotlin.jvm.internal.f0.p(response, "response");
                Exchange exchange = response.getCom.max.hbwallet.bean.MallCouponObj.TYPE_EXCHANGE java.lang.String();
                try {
                    RealWebSocket.this.checkUpgradeSuccess$okhttp(response, exchange);
                    kotlin.jvm.internal.f0.m(exchange);
                    Streams streamsNewWebSocketStreams = exchange.newWebSocketStreams();
                    WebSocketExtensions webSocketExtensions = WebSocketExtensions.INSTANCE.parse(response.getHeaders());
                    RealWebSocket.this.extensions = webSocketExtensions;
                    if (!RealWebSocket.this.isValid(webSocketExtensions)) {
                        synchronized (RealWebSocket.this) {
                            RealWebSocket.this.messageAndCloseQueue.clear();
                            RealWebSocket.this.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    try {
                        RealWebSocket.this.initReaderAndWriter(Util.okHttpName + " WebSocket " + a0VarB.q().V(), streamsNewWebSocketStreams);
                        RealWebSocket.this.getListener().f(RealWebSocket.this, response);
                        RealWebSocket.this.loopReader();
                    } catch (Exception e10) {
                        RealWebSocket.this.failWebSocket(e10, null);
                    }
                } catch (IOException e11) {
                    if (exchange != null) {
                        exchange.webSocketUpgradeFailed();
                    }
                    RealWebSocket.this.failWebSocket(e11, response);
                    Util.closeQuietly(response);
                }
            }
        });
    }

    public final void failWebSocket(@d Exception e10, @dl.e c0 c0Var) {
        kotlin.jvm.internal.f0.p(e10, "e");
        synchronized (this) {
            if (this.failed) {
                return;
            }
            this.failed = true;
            Streams streams = this.streams;
            this.streams = null;
            WebSocketReader webSocketReader = this.reader;
            this.reader = null;
            WebSocketWriter webSocketWriter = this.writer;
            this.writer = null;
            this.taskQueue.shutdown();
            b2 b2Var = b2.f124493a;
            try {
                this.listener.c(this, e10, c0Var);
            } finally {
                if (streams != null) {
                    Util.closeQuietly(streams);
                }
                if (webSocketReader != null) {
                    Util.closeQuietly(webSocketReader);
                }
                if (webSocketWriter != null) {
                    Util.closeQuietly(webSocketWriter);
                }
            }
        }
    }

    @d
    /* JADX INFO: renamed from: getListener$okhttp, reason: from getter */
    public final g0 getListener() {
        return this.listener;
    }

    public final void initReaderAndWriter(@d final String name, @d final Streams streams) throws IOException {
        kotlin.jvm.internal.f0.p(name, "name");
        kotlin.jvm.internal.f0.p(streams, "streams");
        final WebSocketExtensions webSocketExtensions = this.extensions;
        kotlin.jvm.internal.f0.m(webSocketExtensions);
        synchronized (this) {
            this.name = name;
            this.streams = streams;
            this.writer = new WebSocketWriter(streams.getClient(), streams.getSink(), this.random, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(streams.getClient()), this.minimumDeflateSize);
            this.writerTask = new WriterTask();
            long j10 = this.pingIntervalMillis;
            if (j10 != 0) {
                final long nanos = TimeUnit.MILLISECONDS.toNanos(j10);
                final String str = name + " ping";
                this.taskQueue.schedule(new Task(str) { // from class: okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$$inlined$synchronized$lambda$1
                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        this.writePingFrame$okhttp();
                        return nanos;
                    }
                }, nanos);
            }
            if (!this.messageAndCloseQueue.isEmpty()) {
                runWriter();
            }
            b2 b2Var = b2.f124493a;
        }
        this.reader = new WebSocketReader(streams.getClient(), streams.getSource(), this, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(!streams.getClient()));
    }

    public final void loopReader() throws IOException {
        while (this.receivedCloseCode == -1) {
            WebSocketReader webSocketReader = this.reader;
            kotlin.jvm.internal.f0.m(webSocketReader);
            webSocketReader.processNextFrame();
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int i10, @d String reason) {
        Streams streams;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        kotlin.jvm.internal.f0.p(reason, "reason");
        boolean z10 = true;
        if (!(i10 != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        synchronized (this) {
            if (this.receivedCloseCode != -1) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException("already closed".toString());
            }
            this.receivedCloseCode = i10;
            this.receivedCloseReason = reason;
            streams = null;
            if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                Streams streams2 = this.streams;
                this.streams = null;
                webSocketReader = this.reader;
                this.reader = null;
                webSocketWriter = this.writer;
                this.writer = null;
                this.taskQueue.shutdown();
                streams = streams2;
            } else {
                webSocketReader = null;
                webSocketWriter = null;
            }
            b2 b2Var = b2.f124493a;
        }
        try {
            this.listener.b(this, i10, reason);
            if (streams != null) {
                this.listener.a(this, i10, reason);
            }
        } finally {
            if (streams != null) {
                Util.closeQuietly(streams);
            }
            if (webSocketReader != null) {
                Util.closeQuietly(webSocketReader);
            }
            if (webSocketWriter != null) {
                Util.closeQuietly(webSocketWriter);
            }
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(@d String text) throws IOException {
        kotlin.jvm.internal.f0.p(text, "text");
        this.listener.d(this, text);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(@d ByteString bytes) throws IOException {
        kotlin.jvm.internal.f0.p(bytes, "bytes");
        this.listener.e(this, bytes);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(@d ByteString payload) {
        kotlin.jvm.internal.f0.p(payload, "payload");
        if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
            this.pongQueue.add(payload);
            runWriter();
            this.receivedPingCount++;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(@d ByteString payload) {
        kotlin.jvm.internal.f0.p(payload, "payload");
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    public final synchronized boolean pong(@d ByteString payload) {
        kotlin.jvm.internal.f0.p(payload, "payload");
        if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
            this.pongQueue.add(payload);
            runWriter();
            return true;
        }
        return false;
    }

    public final boolean processNextFrame() throws IOException {
        try {
            WebSocketReader webSocketReader = this.reader;
            kotlin.jvm.internal.f0.m(webSocketReader);
            webSocketReader.processNextFrame();
            return this.receivedCloseCode == -1;
        } catch (Exception e10) {
            failWebSocket(e10, null);
            return false;
        }
    }

    @Override // okhttp3.f0
    public synchronized long queueSize() {
        return this.queueSize;
    }

    public final synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    public final synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    @Override // okhttp3.f0
    @d
    /* JADX INFO: renamed from: request, reason: from getter */
    public a0 getOriginalRequest() {
        return this.originalRequest;
    }

    @Override // okhttp3.f0
    public boolean send(@d String text) {
        kotlin.jvm.internal.f0.p(text, "text");
        return send(ByteString.INSTANCE.encodeUtf8(text), 1);
    }

    @Override // okhttp3.f0
    public boolean send(@d ByteString bytes) {
        kotlin.jvm.internal.f0.p(bytes, "bytes");
        return send(bytes, 2);
    }

    public final synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    public final void tearDown() throws InterruptedException {
        this.taskQueue.shutdown();
        this.taskQueue.idleLatch().await(10L, TimeUnit.SECONDS);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0173  */
    /* JADX WARN: Code duplicated, block: B:58:0x017e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0189  */
    /* JADX WARN: Code duplicated, block: B:76:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ce  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, okhttp3.internal.ws.WebSocketWriter] */
    /* JADX WARN: Type inference failed for: r1v13, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15, types: [T, okhttp3.internal.ws.RealWebSocket$Streams] */
    /* JADX WARN: Type inference failed for: r2v16, types: [T, okhttp3.internal.ws.WebSocketReader] */
    /* JADX WARN: Type inference failed for: r2v17, types: [T, okhttp3.internal.ws.WebSocketWriter] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v16, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [okio.ByteString] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean writeOneFrame$okhttp() throws Throwable {
        final Ref.ObjectRef objectRef;
        final Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Streams streams;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        Ref.ObjectRef objectRef5;
        Streams streams2;
        WebSocketReader webSocketReader2;
        WebSocketWriter webSocketWriter2;
        final Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
        objectRef6.f124891b = null;
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.f124889b = -1;
        final Ref.ObjectRef objectRef7 = new Ref.ObjectRef();
        objectRef7.f124891b = null;
        final Ref.ObjectRef objectRef8 = new Ref.ObjectRef();
        objectRef8.f124891b = null;
        Ref.ObjectRef objectRef9 = new Ref.ObjectRef();
        objectRef9.f124891b = null;
        Ref.ObjectRef objectRef10 = new Ref.ObjectRef();
        objectRef10.f124891b = null;
        synchronized (this) {
            if (this.failed) {
                return false;
            }
            final WebSocketWriter webSocketWriter3 = this.writer;
            final ByteString byteStringPoll = this.pongQueue.poll();
            if (byteStringPoll == null) {
                ?? Poll = this.messageAndCloseQueue.poll();
                objectRef6.f124891b = Poll;
                if (Poll instanceof Close) {
                    int i10 = this.receivedCloseCode;
                    intRef.f124889b = i10;
                    objectRef7.f124891b = this.receivedCloseReason;
                    if (i10 != -1) {
                        objectRef8.f124891b = this.streams;
                        this.streams = null;
                        objectRef9.f124891b = this.reader;
                        this.reader = null;
                        objectRef10.f124891b = this.writer;
                        this.writer = null;
                        this.taskQueue.shutdown();
                        objectRef = objectRef10;
                        objectRef2 = objectRef9;
                    } else {
                        T t10 = objectRef6.f124891b;
                        if (t10 == 0) {
                            throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close");
                        }
                        long cancelAfterCloseMillis = ((Close) t10).getCancelAfterCloseMillis();
                        TaskQueue taskQueue = this.taskQueue;
                        final String str = this.name + " cancel";
                        final boolean z10 = true;
                        objectRef = objectRef10;
                        objectRef2 = objectRef9;
                        taskQueue.schedule(new Task(str, z10) { // from class: okhttp3.internal.ws.RealWebSocket$writeOneFrame$$inlined$synchronized$lambda$1
                            @Override // okhttp3.internal.concurrent.Task
                            public long runOnce() {
                                this.cancel();
                                return -1L;
                            }
                        }, TimeUnit.MILLISECONDS.toNanos(cancelAfterCloseMillis));
                    }
                } else {
                    objectRef = objectRef10;
                    objectRef2 = objectRef9;
                    if (Poll == 0) {
                        return false;
                    }
                }
            } else {
                objectRef = objectRef10;
                objectRef2 = objectRef9;
            }
            b2 b2Var = b2.f124493a;
            Ref.ObjectRef objectRef11 = byteStringPoll;
            try {
                if (objectRef11 == 0) {
                    objectRef4 = webSocketWriter3;
                    T t11 = objectRef6.f124891b;
                    if (!(t11 instanceof Message)) {
                        objectRef3 = t11 instanceof Close;
                        try {
                            if (objectRef3 == 0) {
                                throw new AssertionError();
                            }
                            if (t11 == 0) {
                                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close");
                            }
                            Close close = (Close) t11;
                            kotlin.jvm.internal.f0.m(objectRef4);
                            objectRef4.writeClose(close.getCode(), close.getReason());
                            objectRef4 = objectRef8;
                            try {
                                Streams streams3 = (Streams) objectRef4.f124891b;
                                objectRef5 = objectRef4;
                                if (streams3 != null) {
                                    g0 g0Var = this.listener;
                                    int i11 = intRef.f124889b;
                                    String str2 = (String) objectRef7.f124891b;
                                    kotlin.jvm.internal.f0.m(str2);
                                    g0Var.a(this, i11, str2);
                                    objectRef5 = objectRef4;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                objectRef11 = objectRef;
                                objectRef3 = objectRef2;
                                streams = (Streams) objectRef4.f124891b;
                                if (streams != null) {
                                    Util.closeQuietly(streams);
                                }
                                webSocketReader = (WebSocketReader) objectRef3.f124891b;
                                if (webSocketReader != null) {
                                    Util.closeQuietly(webSocketReader);
                                }
                                webSocketWriter = (WebSocketWriter) objectRef11.f124891b;
                                if (webSocketWriter != null) {
                                    Util.closeQuietly(webSocketWriter);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        if (t11 == 0) {
                            throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Message");
                        }
                        Message message = (Message) t11;
                        kotlin.jvm.internal.f0.m(objectRef4);
                        objectRef4.writeMessageFrame(message.getFormatOpcode(), message.getData());
                        synchronized (this) {
                            this.queueSize -= (long) message.getData().size();
                        }
                    }
                    streams2 = (Streams) objectRef5.f124891b;
                    if (streams2 != null) {
                        Util.closeQuietly(streams2);
                    }
                    webSocketReader2 = (WebSocketReader) objectRef2.f124891b;
                    if (webSocketReader2 != null) {
                        Util.closeQuietly(webSocketReader2);
                    }
                    webSocketWriter2 = (WebSocketWriter) objectRef.f124891b;
                    if (webSocketWriter2 != null) {
                        Util.closeQuietly(webSocketWriter2);
                    }
                    return true;
                }
                kotlin.jvm.internal.f0.m(webSocketWriter3);
                webSocketWriter3.writePong(objectRef11);
                objectRef5 = objectRef8;
                streams2 = (Streams) objectRef5.f124891b;
                if (streams2 != null) {
                    Util.closeQuietly(streams2);
                }
                webSocketReader2 = (WebSocketReader) objectRef2.f124891b;
                if (webSocketReader2 != null) {
                    Util.closeQuietly(webSocketReader2);
                }
                webSocketWriter2 = (WebSocketWriter) objectRef.f124891b;
                if (webSocketWriter2 != null) {
                    Util.closeQuietly(webSocketWriter2);
                }
                return true;
            } catch (Throwable th4) {
                th = th4;
                objectRef11 = objectRef;
                objectRef3 = objectRef2;
                objectRef4 = objectRef8;
                streams = (Streams) objectRef4.f124891b;
                if (streams != null) {
                    Util.closeQuietly(streams);
                }
                webSocketReader = (WebSocketReader) objectRef3.f124891b;
                if (webSocketReader != null) {
                    Util.closeQuietly(webSocketReader);
                }
                webSocketWriter = (WebSocketWriter) objectRef11.f124891b;
                if (webSocketWriter != null) {
                    Util.closeQuietly(webSocketWriter);
                }
                throw th;
            }
        }
    }

    public final void writePingFrame$okhttp() {
        synchronized (this) {
            if (this.failed) {
                return;
            }
            WebSocketWriter webSocketWriter = this.writer;
            if (webSocketWriter != null) {
                int i10 = this.awaitingPong ? this.sentPingCount : -1;
                this.sentPingCount++;
                this.awaitingPong = true;
                b2 b2Var = b2.f124493a;
                if (i10 == -1) {
                    try {
                        webSocketWriter.writePing(ByteString.EMPTY);
                        return;
                    } catch (IOException e10) {
                        failWebSocket(e10, null);
                        return;
                    }
                }
                failWebSocket(new SocketTimeoutException("sent ping but didn't receive pong within " + this.pingIntervalMillis + "ms (after " + (i10 - 1) + " successful ping/pongs)"), null);
            }
        }
    }
}
