package okhttp3.internal.http2;

import com.alipay.zoloz.android.phone.mrpc.core.f;
import com.google.android.exoplayer2.source.rtsp.k0;
import com.google.android.exoplayer2.text.ttml.d;
import com.google.android.gms.common.internal.s;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import com.max.xiaoheihe.module.voice.HeyboxMicFragment;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.BaseMonitor;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import xh.e;
import xh.i;
import yh.a;

/* JADX INFO: compiled from: Http2Connection.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ²\u00012\u00020\u0001:\b³\u0001²\u0001´\u0001µ\u0001B\u0015\b\u0000\u0012\b\u0010¯\u0001\u001a\u00030®\u0001¢\u0006\u0006\b°\u0001\u0010±\u0001J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0006\u0010\u000f\u001a\u00020\u0002J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u0002J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007J\u001c\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007J-\u0010 \u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ(\u0010$\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010#\u001a\u00020\u0016J\u001f\u0010)\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010*\u001a\u00020%H\u0000¢\u0006\u0004\b+\u0010(J\u001f\u00100\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u0016H\u0000¢\u0006\u0004\b.\u0010/J\u001e\u00104\u001a\u00020\r2\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u0002J\u0006\u00105\u001a\u00020\rJ\u0006\u00104\u001a\u00020\rJ\u0006\u00106\u001a\u00020\rJ\u0006\u00107\u001a\u00020\rJ\u000e\u00108\u001a\u00020\r2\u0006\u0010*\u001a\u00020%J\b\u00109\u001a\u00020\rH\u0016J)\u00109\u001a\u00020\r2\u0006\u0010:\u001a\u00020%2\u0006\u0010;\u001a\u00020%2\b\u0010<\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b=\u0010>J\u001c\u0010B\u001a\u00020\r2\b\b\u0002\u0010?\u001a\u00020\u00072\b\b\u0002\u0010A\u001a\u00020@H\u0007J\u000e\u0010E\u001a\u00020\r2\u0006\u0010D\u001a\u00020CJ\u000e\u0010G\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\u0016J\u000f\u0010J\u001a\u00020\rH\u0000¢\u0006\u0004\bH\u0010IJ\u0017\u0010M\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0002H\u0000¢\u0006\u0004\bK\u0010LJ%\u0010P\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\bN\u0010OJ-\u0010T\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010Q\u001a\u00020\u0007H\u0000¢\u0006\u0004\bR\u0010SJ/\u0010Y\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010V\u001a\u00020U2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020\u0007H\u0000¢\u0006\u0004\bW\u0010XJ\u001f\u0010[\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\bZ\u0010(R\u001a\u0010\\\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001a\u0010a\u001a\u00020`8\u0000X\u0080\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR&\u0010f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u001a\u0010k\u001a\u00020j8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\"\u0010o\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\"\u0010u\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bu\u0010p\u001a\u0004\bv\u0010r\"\u0004\bw\u0010tR\u0016\u0010x\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010]R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010yR\u0014\u0010{\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010}\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010|R\u0014\u0010~\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010|R\u0017\u0010\u0080\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0019\u0010\u0082\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0019\u0010\u0084\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0083\u0001R\u0019\u0010\u0085\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0083\u0001R\u0019\u0010\u0086\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0083\u0001R\u0019\u0010\u0087\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0083\u0001R\u0019\u0010\u0088\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0083\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0083\u0001R\u001c\u0010\u008a\u0001\u001a\u00020C8\u0006¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R)\u0010\u008e\u0001\u001a\u00020C8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008b\u0001\u001a\u0006\b\u008f\u0001\u0010\u008d\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R*\u0010\u0093\u0001\u001a\u00020\u00162\u0007\u0010\u0092\u0001\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0083\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R*\u0010\u0096\u0001\u001a\u00020\u00162\u0007\u0010\u0092\u0001\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0083\u0001\u001a\u0006\b\u0097\u0001\u0010\u0095\u0001R*\u0010\u0098\u0001\u001a\u00020\u00162\u0007\u0010\u0092\u0001\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0083\u0001\u001a\u0006\b\u0099\u0001\u0010\u0095\u0001R*\u0010\u009a\u0001\u001a\u00020\u00162\u0007\u0010\u0092\u0001\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u0083\u0001\u001a\u0006\b\u009b\u0001\u0010\u0095\u0001R \u0010\u009d\u0001\u001a\u00030\u009c\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u001d\u0010¢\u0001\u001a\u00030¡\u00018\u0006¢\u0006\u0010\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R!\u0010§\u0001\u001a\u00070¦\u0001R\u00020\u00008\u0006¢\u0006\u0010\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001R\u001e\u0010¬\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020«\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001¨\u0006¶\u0001"}, d2 = {"Lokhttp3/internal/http2/Http2Connection;", "Ljava/io/Closeable;", "", "associatedStreamId", "", "Lokhttp3/internal/http2/Header;", "requestHeaders", "", "out", "Lokhttp3/internal/http2/Http2Stream;", "newStream", "Ljava/io/IOException;", "e", "Lkotlin/b2;", "failConnection", "openStreamCount", "id", "getStream", "streamId", "removeStream$okhttp", "(I)Lokhttp3/internal/http2/Http2Stream;", "removeStream", "", "read", "updateConnectionFlowControl$okhttp", "(J)V", "updateConnectionFlowControl", "pushStream", "outFinished", "alternating", "writeHeaders$okhttp", "(IZLjava/util/List;)V", "writeHeaders", "Lokio/Buffer;", "buffer", "byteCount", "writeData", "Lokhttp3/internal/http2/ErrorCode;", Constants.KEY_ERROR_CODE, "writeSynResetLater$okhttp", "(ILokhttp3/internal/http2/ErrorCode;)V", "writeSynResetLater", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "writeSynReset$okhttp", "writeSynReset", "unacknowledgedBytesRead", "writeWindowUpdateLater$okhttp", "(IJ)V", "writeWindowUpdateLater", com.taobao.aranger.constant.Constants.PARAM_REPLY, "payload1", "payload2", "writePing", "writePingAndAwaitPong", "awaitPong", "flush", "shutdown", "close", "connectionCode", "streamCode", "cause", "close$okhttp", "(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V", "sendConnectionPreface", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", d.f49798o0, "Lokhttp3/internal/http2/Settings;", "settings", "setSettings", "nowNs", "isHealthy", "sendDegradedPingLater$okhttp", "()V", "sendDegradedPingLater", "pushedStream$okhttp", "(I)Z", "pushedStream", "pushRequestLater$okhttp", "(ILjava/util/List;)V", "pushRequestLater", "inFinished", "pushHeadersLater$okhttp", "(ILjava/util/List;Z)V", "pushHeadersLater", "Lokio/BufferedSource;", "source", "pushDataLater$okhttp", "(ILokio/BufferedSource;IZ)V", "pushDataLater", "pushResetLater$okhttp", "pushResetLater", "client", "Z", "getClient$okhttp", "()Z", "Lokhttp3/internal/http2/Http2Connection$Listener;", s.a.f52543a, "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "", "streams", "Ljava/util/Map;", "getStreams$okhttp", "()Ljava/util/Map;", "", "connectionName", "Ljava/lang/String;", "getConnectionName$okhttp", "()Ljava/lang/String;", "lastGoodStreamId", "I", "getLastGoodStreamId$okhttp", "()I", "setLastGoodStreamId$okhttp", "(I)V", "nextStreamId", "getNextStreamId$okhttp", "setNextStreamId$okhttp", "isShutdown", "Lokhttp3/internal/concurrent/TaskRunner;", "Lokhttp3/internal/concurrent/TaskQueue;", "writerQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "pushQueue", "settingsListenerQueue", "Lokhttp3/internal/http2/PushObserver;", "pushObserver", "Lokhttp3/internal/http2/PushObserver;", "intervalPingsSent", "J", "intervalPongsReceived", "degradedPingsSent", "degradedPongsReceived", "awaitPingsSent", "awaitPongsReceived", "degradedPongDeadlineNs", "okHttpSettings", "Lokhttp3/internal/http2/Settings;", "getOkHttpSettings", "()Lokhttp3/internal/http2/Settings;", "peerSettings", "getPeerSettings", "setPeerSettings", "(Lokhttp3/internal/http2/Settings;)V", "<set-?>", "readBytesTotal", "getReadBytesTotal", "()J", "readBytesAcknowledged", "getReadBytesAcknowledged", "writeBytesTotal", "getWriteBytesTotal", "writeBytesMaximum", "getWriteBytesMaximum", "Ljava/net/Socket;", "socket", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "Lokhttp3/internal/http2/Http2Writer;", "writer", "Lokhttp3/internal/http2/Http2Writer;", "getWriter", "()Lokhttp3/internal/http2/Http2Writer;", "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "readerRunnable", "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "getReaderRunnable", "()Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "", "currentPushRequests", "Ljava/util/Set;", "Lokhttp3/internal/http2/Http2Connection$Builder;", "builder", "<init>", "(Lokhttp3/internal/http2/Http2Connection$Builder;)V", "Companion", "Builder", "Listener", "ReaderRunnable", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class Http2Connection implements Closeable {
    public static final int AWAIT_PING = 3;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @dl.d
    private static final Settings DEFAULT_SETTINGS;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    private final boolean client;

    @dl.d
    private final String connectionName;
    private final Set<Integer> currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    private boolean isShutdown;
    private int lastGoodStreamId;

    @dl.d
    private final Listener listener;
    private int nextStreamId;

    @dl.d
    private final Settings okHttpSettings;

    @dl.d
    private Settings peerSettings;
    private final PushObserver pushObserver;
    private final TaskQueue pushQueue;
    private long readBytesAcknowledged;
    private long readBytesTotal;

    @dl.d
    private final ReaderRunnable readerRunnable;
    private final TaskQueue settingsListenerQueue;

    @dl.d
    private final Socket socket;

    @dl.d
    private final Map<Integer, Http2Stream> streams;
    private final TaskRunner taskRunner;
    private long writeBytesMaximum;
    private long writeBytesTotal;

    @dl.d
    private final Http2Writer writer;
    private final TaskQueue writerQueue;

    /* JADX INFO: compiled from: Http2Connection.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u00107\u001a\u000208J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001eJ.\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\b\b\u0002\u00109\u001a\u00020\f2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u0010#\u001a\u00020$H\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020*X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u000200X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106¨\u0006:"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Builder;", "", "client", "", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "(ZLokhttp3/internal/concurrent/TaskRunner;)V", "getClient$okhttp", "()Z", "setClient$okhttp", "(Z)V", "connectionName", "", "getConnectionName$okhttp", "()Ljava/lang/String;", "setConnectionName$okhttp", "(Ljava/lang/String;)V", s.a.f52543a, "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "setListener$okhttp", "(Lokhttp3/internal/http2/Http2Connection$Listener;)V", "pingIntervalMillis", "", "getPingIntervalMillis$okhttp", "()I", "setPingIntervalMillis$okhttp", "(I)V", "pushObserver", "Lokhttp3/internal/http2/PushObserver;", "getPushObserver$okhttp", "()Lokhttp3/internal/http2/PushObserver;", "setPushObserver$okhttp", "(Lokhttp3/internal/http2/PushObserver;)V", "sink", "Lokio/BufferedSink;", "getSink$okhttp", "()Lokio/BufferedSink;", "setSink$okhttp", "(Lokio/BufferedSink;)V", "socket", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "setSocket$okhttp", "(Ljava/net/Socket;)V", "source", "Lokio/BufferedSource;", "getSource$okhttp", "()Lokio/BufferedSource;", "setSource$okhttp", "(Lokio/BufferedSource;)V", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;", "build", "Lokhttp3/internal/http2/Http2Connection;", "peerName", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Builder {
        private boolean client;

        @dl.d
        public String connectionName;

        @dl.d
        private Listener listener;
        private int pingIntervalMillis;

        @dl.d
        private PushObserver pushObserver;

        @dl.d
        public BufferedSink sink;

        @dl.d
        public Socket socket;

        @dl.d
        public BufferedSource source;

        @dl.d
        private final TaskRunner taskRunner;

        public Builder(boolean z10, @dl.d TaskRunner taskRunner) {
            f0.p(taskRunner, "taskRunner");
            this.client = z10;
            this.taskRunner = taskRunner;
            this.listener = Listener.REFUSE_INCOMING_STREAMS;
            this.pushObserver = PushObserver.CANCEL;
        }

        public static /* synthetic */ Builder socket$default(Builder builder, Socket socket, String str, BufferedSource bufferedSource, BufferedSink bufferedSink, int i10, Object obj) throws IOException {
            if ((i10 & 2) != 0) {
                str = Util.peerName(socket);
            }
            if ((i10 & 4) != 0) {
                bufferedSource = Okio.buffer(Okio.source(socket));
            }
            if ((i10 & 8) != 0) {
                bufferedSink = Okio.buffer(Okio.sink(socket));
            }
            return builder.socket(socket, str, bufferedSource, bufferedSink);
        }

        @dl.d
        public final Http2Connection build() {
            return new Http2Connection(this);
        }

        /* JADX INFO: renamed from: getClient$okhttp, reason: from getter */
        public final boolean getClient() {
            return this.client;
        }

        @dl.d
        public final String getConnectionName$okhttp() {
            String str = this.connectionName;
            if (str == null) {
                f0.S("connectionName");
            }
            return str;
        }

        @dl.d
        /* JADX INFO: renamed from: getListener$okhttp, reason: from getter */
        public final Listener getListener() {
            return this.listener;
        }

        /* JADX INFO: renamed from: getPingIntervalMillis$okhttp, reason: from getter */
        public final int getPingIntervalMillis() {
            return this.pingIntervalMillis;
        }

        @dl.d
        /* JADX INFO: renamed from: getPushObserver$okhttp, reason: from getter */
        public final PushObserver getPushObserver() {
            return this.pushObserver;
        }

        @dl.d
        public final BufferedSink getSink$okhttp() {
            BufferedSink bufferedSink = this.sink;
            if (bufferedSink == null) {
                f0.S("sink");
            }
            return bufferedSink;
        }

        @dl.d
        public final Socket getSocket$okhttp() {
            Socket socket = this.socket;
            if (socket == null) {
                f0.S("socket");
            }
            return socket;
        }

        @dl.d
        public final BufferedSource getSource$okhttp() {
            BufferedSource bufferedSource = this.source;
            if (bufferedSource == null) {
                f0.S("source");
            }
            return bufferedSource;
        }

        @dl.d
        /* JADX INFO: renamed from: getTaskRunner$okhttp, reason: from getter */
        public final TaskRunner getTaskRunner() {
            return this.taskRunner;
        }

        @dl.d
        public final Builder listener(@dl.d Listener listener) {
            f0.p(listener, "listener");
            this.listener = listener;
            return this;
        }

        @dl.d
        public final Builder pingIntervalMillis(int pingIntervalMillis) {
            this.pingIntervalMillis = pingIntervalMillis;
            return this;
        }

        @dl.d
        public final Builder pushObserver(@dl.d PushObserver pushObserver) {
            f0.p(pushObserver, "pushObserver");
            this.pushObserver = pushObserver;
            return this;
        }

        public final void setClient$okhttp(boolean z10) {
            this.client = z10;
        }

        public final void setConnectionName$okhttp(@dl.d String str) {
            f0.p(str, "<set-?>");
            this.connectionName = str;
        }

        public final void setListener$okhttp(@dl.d Listener listener) {
            f0.p(listener, "<set-?>");
            this.listener = listener;
        }

        public final void setPingIntervalMillis$okhttp(int i10) {
            this.pingIntervalMillis = i10;
        }

        public final void setPushObserver$okhttp(@dl.d PushObserver pushObserver) {
            f0.p(pushObserver, "<set-?>");
            this.pushObserver = pushObserver;
        }

        public final void setSink$okhttp(@dl.d BufferedSink bufferedSink) {
            f0.p(bufferedSink, "<set-?>");
            this.sink = bufferedSink;
        }

        public final void setSocket$okhttp(@dl.d Socket socket) {
            f0.p(socket, "<set-?>");
            this.socket = socket;
        }

        public final void setSource$okhttp(@dl.d BufferedSource bufferedSource) {
            f0.p(bufferedSource, "<set-?>");
            this.source = bufferedSource;
        }

        @dl.d
        @i
        public final Builder socket(@dl.d Socket socket) throws IOException {
            return socket$default(this, socket, null, null, null, 14, null);
        }

        @dl.d
        @i
        public final Builder socket(@dl.d Socket socket, @dl.d String str) throws IOException {
            return socket$default(this, socket, str, null, null, 12, null);
        }

        @dl.d
        @i
        public final Builder socket(@dl.d Socket socket, @dl.d String str, @dl.d BufferedSource bufferedSource) throws IOException {
            return socket$default(this, socket, str, bufferedSource, null, 8, null);
        }

        @dl.d
        @i
        public final Builder socket(@dl.d Socket socket, @dl.d String peerName, @dl.d BufferedSource source, @dl.d BufferedSink sink) throws IOException {
            String str;
            f0.p(socket, "socket");
            f0.p(peerName, "peerName");
            f0.p(source, "source");
            f0.p(sink, "sink");
            this.socket = socket;
            if (this.client) {
                str = Util.okHttpName + ' ' + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            this.connectionName = str;
            this.source = source;
            this.sink = sink;
            return this;
        }
    }

    /* JADX INFO: compiled from: Http2Connection.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Companion;", "", "()V", "AWAIT_PING", "", "DEFAULT_SETTINGS", "Lokhttp3/internal/http2/Settings;", "getDEFAULT_SETTINGS", "()Lokhttp3/internal/http2/Settings;", "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @dl.d
        public final Settings getDEFAULT_SETTINGS() {
            return Http2Connection.DEFAULT_SETTINGS;
        }
    }

    /* JADX INFO: compiled from: Http2Connection.kt */
    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener;", "", "Lokhttp3/internal/http2/Http2Stream;", "stream", "Lkotlin/b2;", "onStream", "Lokhttp3/internal/http2/Http2Connection;", f.f39665q, "Lokhttp3/internal/http2/Settings;", "settings", "onSettings", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static abstract class Listener {

        @dl.d
        @e
        public static final Listener REFUSE_INCOMING_STREAMS = new Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
            @Override // okhttp3.internal.http2.Http2Connection.Listener
            public void onStream(@dl.d Http2Stream stream) throws IOException {
                f0.p(stream, "stream");
                stream.close(ErrorCode.REFUSED_STREAM, null);
            }
        };

        public void onSettings(@dl.d Http2Connection connection, @dl.d Settings settings) {
            f0.p(connection, "connection");
            f0.p(settings, "settings");
        }

        public abstract void onStream(@dl.d Http2Stream http2Stream) throws IOException;
    }

    /* JADX INFO: compiled from: Http2Connection.kt */
    @Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0000\u0012\u0006\u00104\u001a\u000203¢\u0006\u0004\b8\u00109J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J.\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0016\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0016J \u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J \u0010!\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0018\u0010$\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\"H\u0016J(\u0010(\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0005H\u0016J&\u0010+\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J8\u00102\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020,2\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\"H\u0016R\u001a\u00104\u001a\u0002038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u0006:"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "Lokhttp3/internal/http2/Http2Reader$Handler;", "Lkotlin/Function0;", "Lkotlin/b2;", "invoke", "", "inFinished", "", "streamId", "Lokio/BufferedSource;", "source", k0.f48801p, "data", "associatedStreamId", "", "Lokhttp3/internal/http2/Header;", "headerBlock", "headers", "Lokhttp3/internal/http2/ErrorCode;", Constants.KEY_ERROR_CODE, "rstStream", "clearPrevious", "Lokhttp3/internal/http2/Settings;", "settings", "applyAndAckSettings", "ackSettings", BaseMonitor.COUNT_ACK, "payload1", "payload2", "ping", "lastGoodStreamId", "Lokio/ByteString;", "debugData", "goAway", "", "windowSizeIncrement", "windowUpdate", "streamDependency", "weight", "exclusive", "priority", "promisedStreamId", "requestHeaders", "pushPromise", "", "origin", SwitchDetailActivity.P, "host", HeyboxMicFragment.f93763y, "maxAge", "alternateService", "Lokhttp3/internal/http2/Http2Reader;", "reader", "Lokhttp3/internal/http2/Http2Reader;", "getReader$okhttp", "()Lokhttp3/internal/http2/Http2Reader;", "<init>", "(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Http2Reader;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public final class ReaderRunnable implements Http2Reader.Handler, a<b2> {

        @dl.d
        private final Http2Reader reader;
        final /* synthetic */ Http2Connection this$0;

        public ReaderRunnable(@dl.d Http2Connection http2Connection, Http2Reader reader) {
            f0.p(reader, "reader");
            this.this$0 = http2Connection;
            this.reader = reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ackSettings() {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void alternateService(int i10, @dl.d String origin, @dl.d ByteString protocol, @dl.d String host, int i11, long j10) {
            f0.p(origin, "origin");
            f0.p(protocol, "protocol");
            f0.p(host, "host");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, okhttp3.internal.http2.Settings] */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v15 */
        public final void applyAndAckSettings(final boolean z10, @dl.d final Settings settings) {
            Http2Connection http2Connection;
            ?? r10;
            T t10;
            f0.p(settings, "settings");
            final Ref.LongRef longRef = new Ref.LongRef();
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            synchronized (this.this$0.getWriter()) {
                Http2Connection http2Connection2 = this.this$0;
                synchronized (http2Connection2) {
                    try {
                        Settings peerSettings = this.this$0.getPeerSettings();
                        if (z10) {
                            r10 = settings;
                        } else {
                            Settings settings2 = new Settings();
                            settings2.merge(peerSettings);
                            settings2.merge(settings);
                            b2 b2Var = b2.f124493a;
                            r10 = settings2;
                        }
                        objectRef2.f124891b = r10;
                        long initialWindowSize = ((long) r10.getInitialWindowSize()) - ((long) peerSettings.getInitialWindowSize());
                        longRef.f124890b = initialWindowSize;
                        if (initialWindowSize == 0 || this.this$0.getStreams$okhttp().isEmpty()) {
                            t10 = 0;
                        } else {
                            Object[] array = this.this$0.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                            if (array == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                            }
                            t10 = (Http2Stream[]) array;
                        }
                        objectRef.f124891b = t10;
                        this.this$0.setPeerSettings((Settings) objectRef2.f124891b);
                        TaskQueue taskQueue = this.this$0.settingsListenerQueue;
                        final String str = this.this$0.getConnectionName() + " onSettings";
                        final boolean z11 = true;
                        http2Connection = http2Connection2;
                        try {
                            taskQueue.schedule(new Task(str, z11) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$$inlined$synchronized$lambda$1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // okhttp3.internal.concurrent.Task
                                public long runOnce() {
                                    this.this$0.getListener().onSettings(this.this$0, (Settings) objectRef2.f124891b);
                                    return -1L;
                                }
                            }, 0L);
                            b2 b2Var2 = b2.f124493a;
                            try {
                                this.this$0.getWriter().applyAndAckSettings((Settings) objectRef2.f124891b);
                            } catch (IOException e10) {
                                this.this$0.failConnection(e10);
                            }
                            b2 b2Var3 = b2.f124493a;
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        http2Connection = http2Connection2;
                    }
                }
            }
            T t11 = objectRef.f124891b;
            if (((Http2Stream[]) t11) != null) {
                Http2Stream[] http2StreamArr = (Http2Stream[]) t11;
                f0.m(http2StreamArr);
                for (Http2Stream http2Stream : http2StreamArr) {
                    synchronized (http2Stream) {
                        http2Stream.addBytesToWriteWindow(longRef.f124890b);
                        b2 b2Var4 = b2.f124493a;
                    }
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void data(boolean z10, int i10, @dl.d BufferedSource source, int i11) throws IOException {
            f0.p(source, "source");
            if (this.this$0.pushedStream$okhttp(i10)) {
                this.this$0.pushDataLater$okhttp(i10, source, i11, z10);
                return;
            }
            Http2Stream stream = this.this$0.getStream(i10);
            if (stream == null) {
                this.this$0.writeSynResetLater$okhttp(i10, ErrorCode.PROTOCOL_ERROR);
                long j10 = i11;
                this.this$0.updateConnectionFlowControl$okhttp(j10);
                source.skip(j10);
                return;
            }
            stream.receiveData(source, i11);
            if (z10) {
                stream.receiveHeaders(Util.EMPTY_HEADERS, true);
            }
        }

        @dl.d
        /* JADX INFO: renamed from: getReader$okhttp, reason: from getter */
        public final Http2Reader getReader() {
            return this.reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void goAway(int i10, @dl.d ErrorCode errorCode, @dl.d ByteString debugData) {
            int i11;
            Http2Stream[] http2StreamArr;
            f0.p(errorCode, "errorCode");
            f0.p(debugData, "debugData");
            debugData.size();
            synchronized (this.this$0) {
                Object[] array = this.this$0.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                http2StreamArr = (Http2Stream[]) array;
                this.this$0.isShutdown = true;
                b2 b2Var = b2.f124493a;
            }
            for (Http2Stream http2Stream : http2StreamArr) {
                if (http2Stream.getId() > i10 && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    this.this$0.removeStream$okhttp(http2Stream.getId());
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void headers(final boolean z10, final int i10, int i11, @dl.d final List<Header> headerBlock) {
            f0.p(headerBlock, "headerBlock");
            if (this.this$0.pushedStream$okhttp(i10)) {
                this.this$0.pushHeadersLater$okhttp(i10, headerBlock, z10);
                return;
            }
            synchronized (this.this$0) {
                final Http2Stream stream = this.this$0.getStream(i10);
                if (stream != null) {
                    b2 b2Var = b2.f124493a;
                    stream.receiveHeaders(Util.toHeaders(headerBlock), z10);
                    return;
                }
                if (this.this$0.isShutdown) {
                    return;
                }
                if (i10 <= this.this$0.getLastGoodStreamId()) {
                    return;
                }
                if (i10 % 2 == this.this$0.getNextStreamId() % 2) {
                    return;
                }
                final Http2Stream http2Stream = new Http2Stream(i10, this.this$0, false, z10, Util.toHeaders(headerBlock));
                this.this$0.setLastGoodStreamId$okhttp(i10);
                this.this$0.getStreams$okhttp().put(Integer.valueOf(i10), http2Stream);
                TaskQueue taskQueueNewQueue = this.this$0.taskRunner.newQueue();
                final String str = this.this$0.getConnectionName() + '[' + i10 + "] onStream";
                final boolean z11 = true;
                taskQueueNewQueue.schedule(new Task(str, z11) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$$inlined$synchronized$lambda$1
                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        try {
                            this.this$0.getListener().onStream(http2Stream);
                            return -1L;
                        } catch (IOException e10) {
                            Platform.INSTANCE.get().log("Http2Connection.Listener failure for " + this.this$0.getConnectionName(), 4, e10);
                            try {
                                http2Stream.close(ErrorCode.PROTOCOL_ERROR, e10);
                                return -1L;
                            } catch (IOException unused) {
                                return -1L;
                            }
                        }
                    }
                }, 0L);
            }
        }

        @Override // yh.a
        public /* bridge */ /* synthetic */ b2 invoke() throws Throwable {
            invoke2();
            return b2.f124493a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, okhttp3.internal.http2.Http2Reader] */
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2() throws Throwable {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                try {
                    this.reader.readConnectionPreface(this);
                    while (this.reader.nextFrame(false, this)) {
                    }
                    ErrorCode errorCode3 = ErrorCode.NO_ERROR;
                    try {
                        this.this$0.close$okhttp(errorCode3, ErrorCode.CANCEL, null);
                        errorCode = errorCode3;
                    } catch (IOException e11) {
                        e10 = e11;
                        ErrorCode errorCode4 = ErrorCode.PROTOCOL_ERROR;
                        Http2Connection http2Connection = this.this$0;
                        http2Connection.close$okhttp(errorCode4, errorCode4, e10);
                        errorCode = http2Connection;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.this$0.close$okhttp(errorCode, errorCode2, e10);
                    Util.closeQuietly(this.reader);
                    throw th;
                }
            } catch (IOException e12) {
                e10 = e12;
            } catch (Throwable th3) {
                th = th3;
                errorCode = errorCode2;
                this.this$0.close$okhttp(errorCode, errorCode2, e10);
                Util.closeQuietly(this.reader);
                throw th;
            }
            errorCode2 = this.reader;
            Util.closeQuietly((Closeable) errorCode2);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ping(boolean z10, final int i10, final int i11) {
            if (!z10) {
                TaskQueue taskQueue = this.this$0.writerQueue;
                final String str = this.this$0.getConnectionName() + " ping";
                final boolean z11 = true;
                taskQueue.schedule(new Task(str, z11) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$1
                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        this.this$0.writePing(true, i10, i11);
                        return -1L;
                    }
                }, 0L);
                return;
            }
            synchronized (this.this$0) {
                try {
                    if (i10 == 1) {
                        this.this$0.intervalPongsReceived++;
                    } else if (i10 != 2) {
                        if (i10 == 3) {
                            this.this$0.awaitPongsReceived++;
                            Http2Connection http2Connection = this.this$0;
                            if (http2Connection == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                            }
                            http2Connection.notifyAll();
                        }
                        b2 b2Var = b2.f124493a;
                    } else {
                        this.this$0.degradedPongsReceived++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void priority(int i10, int i11, int i12, boolean z10) {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void pushPromise(int i10, int i11, @dl.d List<Header> requestHeaders) {
            f0.p(requestHeaders, "requestHeaders");
            this.this$0.pushRequestLater$okhttp(i11, requestHeaders);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void rstStream(int i10, @dl.d ErrorCode errorCode) {
            f0.p(errorCode, "errorCode");
            if (this.this$0.pushedStream$okhttp(i10)) {
                this.this$0.pushResetLater$okhttp(i10, errorCode);
                return;
            }
            Http2Stream http2StreamRemoveStream$okhttp = this.this$0.removeStream$okhttp(i10);
            if (http2StreamRemoveStream$okhttp != null) {
                http2StreamRemoveStream$okhttp.receiveRstStream(errorCode);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void settings(final boolean z10, @dl.d final Settings settings) {
            f0.p(settings, "settings");
            TaskQueue taskQueue = this.this$0.writerQueue;
            final String str = this.this$0.getConnectionName() + " applyAndAckSettings";
            final boolean z11 = true;
            taskQueue.schedule(new Task(str, z11) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.applyAndAckSettings(z10, settings);
                    return -1L;
                }
            }, 0L);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void windowUpdate(int i10, long j10) {
            if (i10 != 0) {
                Http2Stream stream = this.this$0.getStream(i10);
                if (stream != null) {
                    synchronized (stream) {
                        stream.addBytesToWriteWindow(j10);
                        b2 b2Var = b2.f124493a;
                    }
                    return;
                }
                return;
            }
            synchronized (this.this$0) {
                Http2Connection http2Connection = this.this$0;
                http2Connection.writeBytesMaximum = http2Connection.getWriteBytesMaximum() + j10;
                Http2Connection http2Connection2 = this.this$0;
                if (http2Connection2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
                http2Connection2.notifyAll();
                b2 b2Var2 = b2.f124493a;
            }
        }
    }

    static {
        Settings settings = new Settings();
        settings.set(7, 65535);
        settings.set(5, 16384);
        DEFAULT_SETTINGS = settings;
    }

    public Http2Connection(@dl.d Builder builder) {
        f0.p(builder, "builder");
        boolean client = builder.getClient();
        this.client = client;
        this.listener = builder.getListener();
        this.streams = new LinkedHashMap();
        String connectionName$okhttp = builder.getConnectionName$okhttp();
        this.connectionName = connectionName$okhttp;
        this.nextStreamId = builder.getClient() ? 3 : 2;
        TaskRunner taskRunner = builder.getTaskRunner();
        this.taskRunner = taskRunner;
        TaskQueue taskQueueNewQueue = taskRunner.newQueue();
        this.writerQueue = taskQueueNewQueue;
        this.pushQueue = taskRunner.newQueue();
        this.settingsListenerQueue = taskRunner.newQueue();
        this.pushObserver = builder.getPushObserver();
        Settings settings = new Settings();
        if (builder.getClient()) {
            settings.set(7, 16777216);
        }
        b2 b2Var = b2.f124493a;
        this.okHttpSettings = settings;
        Settings settings2 = DEFAULT_SETTINGS;
        this.peerSettings = settings2;
        this.writeBytesMaximum = settings2.getInitialWindowSize();
        this.socket = builder.getSocket$okhttp();
        this.writer = new Http2Writer(builder.getSink$okhttp(), client);
        this.readerRunnable = new ReaderRunnable(this, new Http2Reader(builder.getSource$okhttp(), client));
        this.currentPushRequests = new LinkedHashSet();
        if (builder.getPingIntervalMillis() != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis());
            final String str = connectionName$okhttp + " ping";
            taskQueueNewQueue.schedule(new Task(str) { // from class: okhttp3.internal.http2.Http2Connection$$special$$inlined$schedule$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    boolean z10;
                    synchronized (this) {
                        if (this.intervalPongsReceived < this.intervalPingsSent) {
                            z10 = true;
                        } else {
                            this.intervalPingsSent++;
                            z10 = false;
                        }
                    }
                    if (z10) {
                        this.failConnection(null);
                        return -1L;
                    }
                    this.writePing(false, 1, 0);
                    return nanos;
                }
            }, nanos);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void failConnection(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        close$okhttp(errorCode, errorCode, iOException);
    }

    private final Http2Stream newStream(int associatedStreamId, List<Header> requestHeaders, boolean out) throws IOException {
        int i10;
        Http2Stream http2Stream;
        boolean z10;
        boolean z11 = !out;
        synchronized (this.writer) {
            synchronized (this) {
                if (this.nextStreamId > 1073741823) {
                    shutdown(ErrorCode.REFUSED_STREAM);
                }
                if (this.isShutdown) {
                    throw new ConnectionShutdownException();
                }
                i10 = this.nextStreamId;
                this.nextStreamId = i10 + 2;
                http2Stream = new Http2Stream(i10, this, z11, false, null);
                z10 = !out || this.writeBytesTotal >= this.writeBytesMaximum || http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum();
                if (http2Stream.isOpen()) {
                    this.streams.put(Integer.valueOf(i10), http2Stream);
                }
                b2 b2Var = b2.f124493a;
            }
            if (associatedStreamId == 0) {
                this.writer.headers(z11, i10, requestHeaders);
            } else {
                if (!(true ^ this.client)) {
                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs".toString());
                }
                this.writer.pushPromise(associatedStreamId, i10, requestHeaders);
            }
        }
        if (z10) {
            this.writer.flush();
        }
        return http2Stream;
    }

    public static /* synthetic */ void start$default(Http2Connection http2Connection, boolean z10, TaskRunner taskRunner, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            taskRunner = TaskRunner.INSTANCE;
        }
        http2Connection.start(z10, taskRunner);
    }

    public final synchronized void awaitPong() throws InterruptedException {
        while (this.awaitPongsReceived < this.awaitPingsSent) {
            wait();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void close$okhttp(@dl.d ErrorCode connectionCode, @dl.d ErrorCode streamCode, @dl.e IOException cause) {
        int i10;
        f0.p(connectionCode, "connectionCode");
        f0.p(streamCode, "streamCode");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            f0.o(threadCurrentThread, "Thread.currentThread()");
            sb2.append(threadCurrentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        try {
            shutdown(connectionCode);
        } catch (IOException unused) {
        }
        Http2Stream[] http2StreamArr = null;
        synchronized (this) {
            if (!this.streams.isEmpty()) {
                Object[] array = this.streams.values().toArray(new Http2Stream[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                http2StreamArr = (Http2Stream[]) array;
                this.streams.clear();
            }
            b2 b2Var = b2.f124493a;
        }
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.close(streamCode, cause);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.writer.close();
        } catch (IOException unused3) {
        }
        try {
            this.socket.close();
        } catch (IOException unused4) {
        }
        this.writerQueue.shutdown();
        this.pushQueue.shutdown();
        this.settingsListenerQueue.shutdown();
    }

    public final void flush() throws IOException {
        this.writer.flush();
    }

    /* JADX INFO: renamed from: getClient$okhttp, reason: from getter */
    public final boolean getClient() {
        return this.client;
    }

    @dl.d
    /* JADX INFO: renamed from: getConnectionName$okhttp, reason: from getter */
    public final String getConnectionName() {
        return this.connectionName;
    }

    /* JADX INFO: renamed from: getLastGoodStreamId$okhttp, reason: from getter */
    public final int getLastGoodStreamId() {
        return this.lastGoodStreamId;
    }

    @dl.d
    /* JADX INFO: renamed from: getListener$okhttp, reason: from getter */
    public final Listener getListener() {
        return this.listener;
    }

    /* JADX INFO: renamed from: getNextStreamId$okhttp, reason: from getter */
    public final int getNextStreamId() {
        return this.nextStreamId;
    }

    @dl.d
    public final Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }

    @dl.d
    public final Settings getPeerSettings() {
        return this.peerSettings;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    @dl.d
    public final ReaderRunnable getReaderRunnable() {
        return this.readerRunnable;
    }

    @dl.d
    /* JADX INFO: renamed from: getSocket$okhttp, reason: from getter */
    public final Socket getSocket() {
        return this.socket;
    }

    @dl.e
    public final synchronized Http2Stream getStream(int id2) {
        return this.streams.get(Integer.valueOf(id2));
    }

    @dl.d
    public final Map<Integer, Http2Stream> getStreams$okhttp() {
        return this.streams;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    @dl.d
    public final Http2Writer getWriter() {
        return this.writer;
    }

    public final synchronized boolean isHealthy(long nowNs) {
        if (this.isShutdown) {
            return false;
        }
        return this.degradedPongsReceived >= this.degradedPingsSent || nowNs < this.degradedPongDeadlineNs;
    }

    @dl.d
    public final Http2Stream newStream(@dl.d List<Header> requestHeaders, boolean out) throws IOException {
        f0.p(requestHeaders, "requestHeaders");
        return newStream(0, requestHeaders, out);
    }

    public final synchronized int openStreamCount() {
        return this.streams.size();
    }

    public final void pushDataLater$okhttp(final int streamId, @dl.d BufferedSource source, final int byteCount, final boolean inFinished) throws IOException {
        f0.p(source, "source");
        final Buffer buffer = new Buffer();
        long j10 = byteCount;
        source.require(j10);
        source.read(buffer, j10);
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + '[' + streamId + "] onData";
        final boolean z10 = true;
        taskQueue.schedule(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    boolean zOnData = this.pushObserver.onData(streamId, buffer, byteCount, inFinished);
                    if (zOnData) {
                        this.getWriter().rstStream(streamId, ErrorCode.CANCEL);
                    }
                    if (!zOnData && !inFinished) {
                        return -1L;
                    }
                    synchronized (this) {
                        this.currentPushRequests.remove(Integer.valueOf(streamId));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void pushHeadersLater$okhttp(final int streamId, @dl.d final List<Header> requestHeaders, final boolean inFinished) {
        f0.p(requestHeaders, "requestHeaders");
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + '[' + streamId + "] onHeaders";
        final boolean z10 = true;
        taskQueue.schedule(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                boolean zOnHeaders = this.pushObserver.onHeaders(streamId, requestHeaders, inFinished);
                if (zOnHeaders) {
                    try {
                        this.getWriter().rstStream(streamId, ErrorCode.CANCEL);
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
                if (!zOnHeaders && !inFinished) {
                    return -1L;
                }
                synchronized (this) {
                    this.currentPushRequests.remove(Integer.valueOf(streamId));
                }
                return -1L;
            }
        }, 0L);
    }

    public final void pushRequestLater$okhttp(final int streamId, @dl.d final List<Header> requestHeaders) {
        f0.p(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.currentPushRequests.contains(Integer.valueOf(streamId))) {
                writeSynResetLater$okhttp(streamId, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(Integer.valueOf(streamId));
            TaskQueue taskQueue = this.pushQueue;
            final String str = this.connectionName + '[' + streamId + "] onRequest";
            final boolean z10 = true;
            taskQueue.schedule(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    if (!this.pushObserver.onRequest(streamId, requestHeaders)) {
                        return -1L;
                    }
                    try {
                        this.getWriter().rstStream(streamId, ErrorCode.CANCEL);
                        synchronized (this) {
                            this.currentPushRequests.remove(Integer.valueOf(streamId));
                        }
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }, 0L);
        }
    }

    public final void pushResetLater$okhttp(final int streamId, @dl.d final ErrorCode errorCode) {
        f0.p(errorCode, "errorCode");
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + '[' + streamId + "] onReset";
        final boolean z10 = true;
        taskQueue.schedule(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                this.pushObserver.onReset(streamId, errorCode);
                synchronized (this) {
                    this.currentPushRequests.remove(Integer.valueOf(streamId));
                    b2 b2Var = b2.f124493a;
                }
                return -1L;
            }
        }, 0L);
    }

    @dl.d
    public final Http2Stream pushStream(int associatedStreamId, @dl.d List<Header> requestHeaders, boolean out) throws IOException {
        f0.p(requestHeaders, "requestHeaders");
        if (!this.client) {
            return newStream(associatedStreamId, requestHeaders, out);
        }
        throw new IllegalStateException("Client cannot push requests.".toString());
    }

    public final boolean pushedStream$okhttp(int streamId) {
        return streamId != 0 && (streamId & 1) == 0;
    }

    @dl.e
    public final synchronized Http2Stream removeStream$okhttp(int streamId) {
        Http2Stream http2StreamRemove;
        http2StreamRemove = this.streams.remove(Integer.valueOf(streamId));
        notifyAll();
        return http2StreamRemove;
    }

    public final void sendDegradedPingLater$okhttp() {
        synchronized (this) {
            long j10 = this.degradedPongsReceived;
            long j11 = this.degradedPingsSent;
            if (j10 < j11) {
                return;
            }
            this.degradedPingsSent = j11 + 1;
            this.degradedPongDeadlineNs = System.nanoTime() + ((long) 1000000000);
            b2 b2Var = b2.f124493a;
            TaskQueue taskQueue = this.writerQueue;
            final String str = this.connectionName + " ping";
            final boolean z10 = true;
            taskQueue.schedule(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.writePing(false, 2, 0);
                    return -1L;
                }
            }, 0L);
        }
    }

    public final void setLastGoodStreamId$okhttp(int i10) {
        this.lastGoodStreamId = i10;
    }

    public final void setNextStreamId$okhttp(int i10) {
        this.nextStreamId = i10;
    }

    public final void setPeerSettings(@dl.d Settings settings) {
        f0.p(settings, "<set-?>");
        this.peerSettings = settings;
    }

    public final void setSettings(@dl.d Settings settings) throws IOException {
        f0.p(settings, "settings");
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    throw new ConnectionShutdownException();
                }
                this.okHttpSettings.merge(settings);
                b2 b2Var = b2.f124493a;
            }
            this.writer.settings(settings);
        }
    }

    public final void shutdown(@dl.d ErrorCode statusCode) throws IOException {
        f0.p(statusCode, "statusCode");
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                int i10 = this.lastGoodStreamId;
                b2 b2Var = b2.f124493a;
                this.writer.goAway(i10, statusCode, Util.EMPTY_BYTE_ARRAY);
            }
        }
    }

    @i
    public final void start() throws IOException {
        start$default(this, false, null, 3, null);
    }

    @i
    public final void start(boolean z10) throws IOException {
        start$default(this, z10, null, 2, null);
    }

    @i
    public final void start(boolean z10, @dl.d TaskRunner taskRunner) throws IOException {
        f0.p(taskRunner, "taskRunner");
        if (z10) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            int initialWindowSize = this.okHttpSettings.getInitialWindowSize();
            if (initialWindowSize != 65535) {
                this.writer.windowUpdate(0, initialWindowSize - 65535);
            }
        }
        TaskQueue taskQueueNewQueue = taskRunner.newQueue();
        String str = this.connectionName;
        taskQueueNewQueue.schedule(new TaskQueue.AnonymousClass1(this.readerRunnable, str, true, str, true), 0L);
    }

    public final synchronized void updateConnectionFlowControl$okhttp(long read) {
        long j10 = this.readBytesTotal + read;
        this.readBytesTotal = j10;
        long j11 = j10 - this.readBytesAcknowledged;
        if (j11 >= this.okHttpSettings.getInitialWindowSize() / 2) {
            writeWindowUpdateLater$okhttp(0, j11);
            this.readBytesAcknowledged += j11;
        }
    }

    public final void writeData(int i10, boolean z10, @dl.e Buffer buffer, long j10) throws IOException {
        long j11;
        long j12;
        int iMin;
        long j13;
        if (j10 == 0) {
            this.writer.data(z10, i10, buffer, 0);
            return;
        }
        while (j10 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        j11 = this.writeBytesTotal;
                        j12 = this.writeBytesMaximum;
                        if (j11 >= j12) {
                            if (!this.streams.containsKey(Integer.valueOf(i10))) {
                                throw new IOException("stream closed");
                            }
                            wait();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                    throw th;
                }
                iMin = Math.min((int) Math.min(j10, j12 - j11), this.writer.getMaxFrameSize());
                j13 = iMin;
                this.writeBytesTotal += j13;
                b2 b2Var = b2.f124493a;
            }
            j10 -= j13;
            this.writer.data(z10 && j10 == 0, i10, buffer, iMin);
        }
    }

    public final void writeHeaders$okhttp(int streamId, boolean outFinished, @dl.d List<Header> alternating) throws IOException {
        f0.p(alternating, "alternating");
        this.writer.headers(outFinished, streamId, alternating);
    }

    public final void writePing() throws InterruptedException {
        synchronized (this) {
            this.awaitPingsSent++;
        }
        writePing(false, 3, 1330343787);
    }

    public final void writePing(boolean z10, int i10, int i11) {
        try {
            this.writer.ping(z10, i10, i11);
        } catch (IOException e10) {
            failConnection(e10);
        }
    }

    public final void writePingAndAwaitPong() throws InterruptedException {
        writePing();
        awaitPong();
    }

    public final void writeSynReset$okhttp(int streamId, @dl.d ErrorCode statusCode) throws IOException {
        f0.p(statusCode, "statusCode");
        this.writer.rstStream(streamId, statusCode);
    }

    public final void writeSynResetLater$okhttp(final int streamId, @dl.d final ErrorCode errorCode) {
        f0.p(errorCode, "errorCode");
        TaskQueue taskQueue = this.writerQueue;
        final String str = this.connectionName + '[' + streamId + "] writeSynReset";
        final boolean z10 = true;
        taskQueue.schedule(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    this.writeSynReset$okhttp(streamId, errorCode);
                    return -1L;
                } catch (IOException e10) {
                    this.failConnection(e10);
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void writeWindowUpdateLater$okhttp(final int streamId, final long unacknowledgedBytesRead) {
        TaskQueue taskQueue = this.writerQueue;
        final String str = this.connectionName + '[' + streamId + "] windowUpdate";
        final boolean z10 = true;
        taskQueue.schedule(new Task(str, z10) { // from class: okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    this.getWriter().windowUpdate(streamId, unacknowledgedBytesRead);
                    return -1L;
                } catch (IOException e10) {
                    this.failConnection(e10);
                    return -1L;
                }
            }
        }, 0L);
    }
}
