package okhttp3.internal.connection;

import com.alipay.zoloz.android.phone.mrpc.core.f;
import com.google.common.net.c;
import com.max.hbwallet.bean.MallCouponObj;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import dl.d;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.text.StringsKt__IndentKt;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.a;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.e;
import okhttp3.e0;
import okhttp3.i;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.k;
import okhttp3.p;
import okhttp3.t;
import okhttp3.z;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Timeout;

/* JADX INFO: compiled from: RealConnection.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u008e\u00012\u00020\u00012\u00020\u0002:\u0002\u008e\u0001B\u001b\u0012\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001\u0012\u0006\u0010@\u001a\u00020\u001b¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J(\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J(\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J*\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0016\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0018\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010!\u001a\u00020 H\u0002J\u000f\u0010%\u001a\u00020\u000bH\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010'\u001a\u00020\u000bH\u0000¢\u0006\u0004\b&\u0010$J\u000f\u0010)\u001a\u00020\u000bH\u0000¢\u0006\u0004\b(\u0010$J>\u0010+\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ'\u00101\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020,2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0000¢\u0006\u0004\b/\u00100J\u001f\u00109\u001a\u0002062\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0000¢\u0006\u0004\b7\u00108J\u0017\u0010?\u001a\u00020<2\u0006\u0010;\u001a\u00020:H\u0000¢\u0006\u0004\b=\u0010>J\b\u0010@\u001a\u00020\u001bH\u0016J\u0006\u0010A\u001a\u00020\u000bJ\b\u0010C\u001a\u00020BH\u0016J\u000e\u0010E\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020\u001dJ\u0010\u0010H\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020FH\u0016J\u0018\u0010M\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020KH\u0016J\n\u0010!\u001a\u0004\u0018\u00010 H\u0016J'\u0010S\u001a\u00020\u000b2\u0006\u00103\u001a\u0002022\u0006\u0010N\u001a\u00020\u001b2\u0006\u0010P\u001a\u00020OH\u0000¢\u0006\u0004\bQ\u0010RJ!\u0010X\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010OH\u0000¢\u0006\u0004\bV\u0010WJ\b\u0010Z\u001a\u00020YH\u0016J\b\u0010\\\u001a\u00020[H\u0016R\u0018\u0010]\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010^R\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010_R\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010`R\u0018\u0010a\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010d\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010g\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\"\u0010%\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u0016\u0010'\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010iR\"\u0010n\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u0016\u0010t\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010oR\u0016\u0010u\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010oR\u0016\u0010v\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010oR#\u0010y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0x0w8\u0006¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R&\u0010~\u001a\u00020}8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001d\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0006¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0015\u0010@\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b@\u0010\u0089\u0001R\u0016\u0010\u008b\u0001\u001a\u00020\u001d8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010k¨\u0006\u008f\u0001"}, d2 = {"Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/http2/Http2Connection$Listener;", "Lokhttp3/i;", "", "connectTimeout", "readTimeout", "writeTimeout", "Lokhttp3/e;", "call", "Lokhttp3/p;", "eventListener", "Lkotlin/b2;", "connectTunnel", "connectSocket", "Lokhttp3/internal/connection/ConnectionSpecSelector;", "connectionSpecSelector", "pingIntervalMillis", "establishProtocol", "startHttp2", "connectTls", "Lokhttp3/a0;", "tunnelRequest", "Lokhttp3/t;", "url", "createTunnel", "createTunnelRequest", "", "Lokhttp3/e0;", "candidates", "", "routeMatchesAny", "supportsUrl", "Lokhttp3/Handshake;", "handshake", "certificateSupportHost", "noNewExchanges$okhttp", "()V", "noNewExchanges", "noCoalescedConnections$okhttp", "noCoalescedConnections", "incrementSuccessCount$okhttp", "incrementSuccessCount", "connectionRetryEnabled", "connect", "Lokhttp3/a;", "address", "routes", "isEligible$okhttp", "(Lokhttp3/a;Ljava/util/List;)Z", "isEligible", "Lokhttp3/z;", "client", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "Lokhttp3/internal/http/ExchangeCodec;", "newCodec$okhttp", "(Lokhttp3/z;Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/internal/http/ExchangeCodec;", "newCodec", "Lokhttp3/internal/connection/Exchange;", MallCouponObj.TYPE_EXCHANGE, "Lokhttp3/internal/ws/RealWebSocket$Streams;", "newWebSocketStreams$okhttp", "(Lokhttp3/internal/connection/Exchange;)Lokhttp3/internal/ws/RealWebSocket$Streams;", "newWebSocketStreams", "route", "cancel", "Ljava/net/Socket;", "socket", "doExtensiveChecks", "isHealthy", "Lokhttp3/internal/http2/Http2Stream;", "stream", "onStream", "Lokhttp3/internal/http2/Http2Connection;", f.f39665q, "Lokhttp3/internal/http2/Settings;", "settings", "onSettings", "failedRoute", "Ljava/io/IOException;", "failure", "connectFailed$okhttp", "(Lokhttp3/z;Lokhttp3/e0;Ljava/io/IOException;)V", "connectFailed", "Lokhttp3/internal/connection/RealCall;", "e", "trackFailure$okhttp", "(Lokhttp3/internal/connection/RealCall;Ljava/io/IOException;)V", "trackFailure", "Lokhttp3/Protocol;", SwitchDetailActivity.P, "", "toString", "rawSocket", "Ljava/net/Socket;", "Lokhttp3/Handshake;", "Lokhttp3/Protocol;", "http2Connection", "Lokhttp3/internal/http2/Http2Connection;", "Lokio/BufferedSource;", "source", "Lokio/BufferedSource;", "Lokio/BufferedSink;", "sink", "Lokio/BufferedSink;", "Z", "getNoNewExchanges", "()Z", "setNoNewExchanges", "(Z)V", "routeFailureCount", "I", "getRouteFailureCount$okhttp", "()I", "setRouteFailureCount$okhttp", "(I)V", "successCount", "refusedStreamCount", "allocationLimit", "", "Ljava/lang/ref/Reference;", "calls", "Ljava/util/List;", "getCalls", "()Ljava/util/List;", "", "idleAtNs", "J", "getIdleAtNs$okhttp", "()J", "setIdleAtNs$okhttp", "(J)V", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "getConnectionPool", "()Lokhttp3/internal/connection/RealConnectionPool;", "Lokhttp3/e0;", "isMultiplexed$okhttp", "isMultiplexed", "<init>", "(Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/e0;)V", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class RealConnection extends Http2Connection.Listener implements i {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final long IDLE_CONNECTION_HEALTHY_NS = 10000000000L;
    private static final int MAX_TUNNEL_ATTEMPTS = 21;
    private static final String NPE_THROW_WITH_NULL = "throw with null exception";
    private int allocationLimit;

    @d
    private final List<Reference<RealCall>> calls;

    @d
    private final RealConnectionPool connectionPool;
    private Handshake handshake;
    private Http2Connection http2Connection;
    private long idleAtNs;
    private boolean noCoalescedConnections;
    private boolean noNewExchanges;
    private Protocol protocol;
    private Socket rawSocket;
    private int refusedStreamCount;
    private final e0 route;
    private int routeFailureCount;
    private BufferedSink sink;
    private Socket socket;
    private BufferedSource source;
    private int successCount;

    /* JADX INFO: compiled from: RealConnection.kt */
    @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bR\u0014\u0010\f\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/connection/RealConnection$Companion;", "", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/e0;", "route", "Ljava/net/Socket;", "socket", "", "idleAtNs", "Lokhttp3/internal/connection/RealConnection;", "newTestConnection", "IDLE_CONNECTION_HEALTHY_NS", "J", "", "MAX_TUNNEL_ATTEMPTS", "I", "", "NPE_THROW_WITH_NULL", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @d
        public final RealConnection newTestConnection(@d RealConnectionPool connectionPool, @d e0 route, @d Socket socket, long idleAtNs) {
            f0.p(connectionPool, "connectionPool");
            f0.p(route, "route");
            f0.p(socket, "socket");
            RealConnection realConnection = new RealConnection(connectionPool, route);
            realConnection.socket = socket;
            realConnection.setIdleAtNs$okhttp(idleAtNs);
            return realConnection;
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
        }
    }

    public RealConnection(@d RealConnectionPool connectionPool, @d e0 route) {
        f0.p(connectionPool, "connectionPool");
        f0.p(route, "route");
        this.connectionPool = connectionPool;
        this.route = route;
        this.allocationLimit = 1;
        this.calls = new ArrayList();
        this.idleAtNs = Long.MAX_VALUE;
    }

    private final boolean certificateSupportHost(t url, Handshake handshake) {
        List<Certificate> listM = handshake.m();
        if (!listM.isEmpty()) {
            OkHostnameVerifier okHostnameVerifier = OkHostnameVerifier.INSTANCE;
            String host = url.getHost();
            Certificate certificate = listM.get(0);
            if (certificate == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
            if (okHostnameVerifier.verify(host, (X509Certificate) certificate)) {
                return true;
            }
        }
        return false;
    }

    private final void connectSocket(int i10, int i11, e eVar, p pVar) throws IOException {
        Socket socket;
        int i12;
        Proxy proxyE = this.route.e();
        a aVarD = this.route.d();
        Proxy.Type type = proxyE.type();
        if (type != null && ((i12 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) == 1 || i12 == 2)) {
            socket = aVarD.u().createSocket();
            f0.m(socket);
        } else {
            socket = new Socket(proxyE);
        }
        this.rawSocket = socket;
        pVar.connectStart(eVar, this.route.g(), proxyE);
        socket.setSoTimeout(i11);
        try {
            Platform.INSTANCE.get().connectSocket(socket, this.route.g(), i10);
            try {
                this.source = Okio.buffer(Okio.source(socket));
                this.sink = Okio.buffer(Okio.sink(socket));
            } catch (NullPointerException e10) {
                if (f0.g(e10.getMessage(), NPE_THROW_WITH_NULL)) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.route.g());
            connectException.initCause(e11);
            throw connectException;
        }
    }

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
    private final void connectTls(ConnectionSpecSelector connectionSpecSelector) throws Throwable {
        final a aVarD = this.route.d();
        SSLSocketFactory sSLSocketFactoryV = aVarD.v();
        SSLSocket sSLSocket = null;
        try {
            f0.m(sSLSocketFactoryV);
            Socket socketCreateSocket = sSLSocketFactoryV.createSocket(this.rawSocket, aVarD.w().getHost(), aVarD.w().getCom.max.xiaoheihe.module.voice.HeyboxMicFragment.y java.lang.String(), true);
            if (socketCreateSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                k kVarConfigureSecureSocket = connectionSpecSelector.configureSecureSocket(sSLSocket2);
                if (kVarConfigureSecureSocket.k()) {
                    Platform.INSTANCE.get().configureTlsExtensions(sSLSocket2, aVarD.w().getHost(), aVarD.q());
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                Handshake.Companion companion = Handshake.INSTANCE;
                f0.o(sslSocketSession, "sslSocketSession");
                final Handshake handshakeB = companion.b(sslSocketSession);
                HostnameVerifier hostnameVerifierP = aVarD.p();
                f0.m(hostnameVerifierP);
                if (hostnameVerifierP.verify(aVarD.w().getHost(), sslSocketSession)) {
                    final CertificatePinner certificatePinnerL = aVarD.l();
                    f0.m(certificatePinnerL);
                    this.handshake = new Handshake(handshakeB.o(), handshakeB.g(), handshakeB.k(), new yh.a<List<? extends Certificate>>() { // from class: okhttp3.internal.connection.RealConnection.connectTls.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @d
                        public final List<? extends Certificate> invoke() {
                            CertificateChainCleaner certificateChainCleanerE = certificatePinnerL.getCertificateChainCleaner();
                            f0.m(certificateChainCleanerE);
                            return certificateChainCleanerE.clean(handshakeB.m(), aVarD.w().getHost());
                        }
                    });
                    certificatePinnerL.c(aVarD.w().getHost(), new yh.a<List<? extends X509Certificate>>() { // from class: okhttp3.internal.connection.RealConnection.connectTls.2
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @d
                        public final List<? extends X509Certificate> invoke() {
                            Handshake handshake = RealConnection.this.handshake;
                            f0.m(handshake);
                            List<Certificate> listM = handshake.m();
                            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listM, 10));
                            for (Certificate certificate : listM) {
                                if (certificate == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                                }
                                arrayList.add((X509Certificate) certificate);
                            }
                            return arrayList;
                        }
                    });
                    String selectedProtocol = kVarConfigureSecureSocket.k() ? Platform.INSTANCE.get().getSelectedProtocol(sSLSocket2) : null;
                    this.socket = sSLSocket2;
                    this.source = Okio.buffer(Okio.source(sSLSocket2));
                    this.sink = Okio.buffer(Okio.sink(sSLSocket2));
                    this.protocol = selectedProtocol != null ? Protocol.INSTANCE.a(selectedProtocol) : Protocol.HTTP_1_1;
                    Platform.INSTANCE.get().afterHandshake(sSLSocket2);
                    return;
                }
                List<Certificate> listM = handshakeB.m();
                if (!(!listM.isEmpty())) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVarD.w().getHost() + " not verified (no certificates)");
                }
                Certificate certificate = listM.get(0);
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
                X509Certificate x509Certificate = (X509Certificate) certificate;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\n              |Hostname ");
                sb2.append(aVarD.w().getHost());
                sb2.append(" not verified:\n              |    certificate: ");
                sb2.append(CertificatePinner.INSTANCE.a(x509Certificate));
                sb2.append("\n              |    DN: ");
                Principal subjectDN = x509Certificate.getSubjectDN();
                f0.o(subjectDN, "cert.subjectDN");
                sb2.append(subjectDN.getName());
                sb2.append("\n              |    subjectAltNames: ");
                sb2.append(OkHostnameVerifier.INSTANCE.allSubjectAltNames(x509Certificate));
                sb2.append("\n              ");
                throw new SSLPeerUnverifiedException(StringsKt__IndentKt.r(sb2.toString(), null, 1, null));
            } catch (Throwable th2) {
                th = th2;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    Platform.INSTANCE.get().afterHandshake(sSLSocket);
                }
                if (sSLSocket != null) {
                    Util.closeQuietly((Socket) sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private final void connectTunnel(int i10, int i11, int i12, e eVar, p pVar) throws IOException {
        a0 a0VarCreateTunnelRequest = createTunnelRequest();
        t tVarQ = a0VarCreateTunnelRequest.q();
        for (int i13 = 0; i13 < 21; i13++) {
            connectSocket(i10, i11, eVar, pVar);
            a0VarCreateTunnelRequest = createTunnel(i11, i12, a0VarCreateTunnelRequest, tVarQ);
            if (a0VarCreateTunnelRequest == null) {
                return;
            }
            Socket socket = this.rawSocket;
            if (socket != null) {
                Util.closeQuietly(socket);
            }
            this.rawSocket = null;
            this.sink = null;
            this.source = null;
            pVar.connectEnd(eVar, this.route.g(), this.route.e(), null);
        }
    }

    private final a0 createTunnel(int readTimeout, int writeTimeout, a0 tunnelRequest, t url) throws IOException {
        String str = "CONNECT " + Util.toHostHeader(url, true) + " HTTP/1.1";
        while (true) {
            BufferedSource bufferedSource = this.source;
            f0.m(bufferedSource);
            BufferedSink bufferedSink = this.sink;
            f0.m(bufferedSink);
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, bufferedSource, bufferedSink);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            bufferedSource.getTimeout().timeout(readTimeout, timeUnit);
            bufferedSink.getTimeout().timeout(writeTimeout, timeUnit);
            http1ExchangeCodec.writeRequest(tunnelRequest.k(), str);
            http1ExchangeCodec.finishRequest();
            c0.a responseHeaders = http1ExchangeCodec.readResponseHeaders(false);
            f0.m(responseHeaders);
            c0 c0VarC = responseHeaders.E(tunnelRequest).c();
            http1ExchangeCodec.skipConnectBody(c0VarC);
            int iX = c0VarC.x();
            if (iX == 200) {
                if (bufferedSource.getBuffer().exhausted() && bufferedSink.getBuffer().exhausted()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iX != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + c0VarC.x());
            }
            a0 a0VarAuthenticate = this.route.d().s().authenticate(this.route, c0VarC);
            if (a0VarAuthenticate == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (kotlin.text.u.L1("close", c0.J(c0VarC, "Connection", null, 2, null), true)) {
                return a0VarAuthenticate;
            }
            tunnelRequest = a0VarAuthenticate;
        }
    }

    private final a0 createTunnelRequest() throws IOException {
        a0 a0VarB = new a0.a().D(this.route.d().w()).p("CONNECT", null).n("Host", Util.toHostHeader(this.route.d().w(), true)).n("Proxy-Connection", c.f58866u0).n("User-Agent", Util.userAgent).b();
        a0 a0VarAuthenticate = this.route.d().s().authenticate(this.route, new c0.a().E(a0VarB).B(Protocol.HTTP_1_1).g(407).y("Preemptive Authenticate").b(Util.EMPTY_RESPONSE).F(-1L).C(-1L).v("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return a0VarAuthenticate != null ? a0VarAuthenticate : a0VarB;
    }

    private final void establishProtocol(ConnectionSpecSelector connectionSpecSelector, int i10, e eVar, p pVar) throws Throwable {
        if (this.route.d().v() != null) {
            pVar.secureConnectStart(eVar);
            connectTls(connectionSpecSelector);
            pVar.secureConnectEnd(eVar, this.handshake);
            if (this.protocol == Protocol.HTTP_2) {
                startHttp2(i10);
                return;
            }
            return;
        }
        List<Protocol> listQ = this.route.d().q();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        if (!listQ.contains(protocol)) {
            this.socket = this.rawSocket;
            this.protocol = Protocol.HTTP_1_1;
        } else {
            this.socket = this.rawSocket;
            this.protocol = protocol;
            startHttp2(i10);
        }
    }

    private final boolean routeMatchesAny(List<e0> candidates) {
        if (!(candidates instanceof Collection) || !candidates.isEmpty()) {
            for (e0 e0Var : candidates) {
                if (e0Var.e().type() == Proxy.Type.DIRECT && this.route.e().type() == Proxy.Type.DIRECT && f0.g(this.route.g(), e0Var.g())) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void startHttp2(int i10) throws IOException {
        Socket socket = this.socket;
        f0.m(socket);
        BufferedSource bufferedSource = this.source;
        f0.m(bufferedSource);
        BufferedSink bufferedSink = this.sink;
        f0.m(bufferedSink);
        socket.setSoTimeout(0);
        Http2Connection http2ConnectionBuild = new Http2Connection.Builder(true, TaskRunner.INSTANCE).socket(socket, this.route.d().w().getHost(), bufferedSource, bufferedSink).listener(this).pingIntervalMillis(i10).build();
        this.http2Connection = http2ConnectionBuild;
        this.allocationLimit = Http2Connection.INSTANCE.getDEFAULT_SETTINGS().getMaxConcurrentStreams();
        Http2Connection.start$default(http2ConnectionBuild, false, null, 3, null);
    }

    private final boolean supportsUrl(t url) {
        Handshake handshake;
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            f0.o(threadCurrentThread, "Thread.currentThread()");
            sb2.append(threadCurrentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        t tVarW = this.route.d().w();
        if (url.getCom.max.xiaoheihe.module.voice.HeyboxMicFragment.y java.lang.String() != tVarW.getCom.max.xiaoheihe.module.voice.HeyboxMicFragment.y java.lang.String()) {
            return false;
        }
        if (f0.g(url.getHost(), tVarW.getHost())) {
            return true;
        }
        if (this.noCoalescedConnections || (handshake = this.handshake) == null) {
            return false;
        }
        f0.m(handshake);
        return certificateSupportHost(url, handshake);
    }

    public final void cancel() {
        Socket socket = this.rawSocket;
        if (socket != null) {
            Util.closeQuietly(socket);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0108  */
    /* JADX WARN: Code duplicated, block: B:52:0x010f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0139  */
    /* JADX WARN: Code duplicated, block: B:56:0x013f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0144  */
    /* JADX WARN: Code duplicated, block: B:74:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[LOOP:0: B:68:0x009a->B:76:?, LOOP_END, SYNTHETIC] */
    public final void connect(int i10, int i11, int i12, int i13, boolean z10, @d e call, @d p eventListener) throws Throwable {
        Socket socket;
        Socket socket2;
        f0.p(call, "call");
        f0.p(eventListener, "eventListener");
        if (!(this.protocol == null)) {
            throw new IllegalStateException("already connected".toString());
        }
        List<k> listM = this.route.d().m();
        ConnectionSpecSelector connectionSpecSelector = new ConnectionSpecSelector(listM);
        if (this.route.d().v() == null) {
            if (!listM.contains(k.f132596j)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String host = this.route.d().w().getHost();
            if (!Platform.INSTANCE.get().isCleartextTrafficPermitted(host)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication to " + host + " not permitted by network security policy"));
            }
        } else if (this.route.d().q().contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException = null;
        while (true) {
            try {
                if (this.route.f()) {
                    connectTunnel(i10, i11, i12, call, eventListener);
                    if (this.rawSocket == null) {
                        break;
                    }
                } else {
                    try {
                        connectSocket(i10, i11, call, eventListener);
                    } catch (IOException e10) {
                        e = e10;
                        socket = this.socket;
                        if (socket != null) {
                            Util.closeQuietly(socket);
                        }
                        socket2 = this.rawSocket;
                        if (socket2 != null) {
                            Util.closeQuietly(socket2);
                        }
                        this.socket = null;
                        this.rawSocket = null;
                        this.source = null;
                        this.sink = null;
                        this.handshake = null;
                        this.protocol = null;
                        this.http2Connection = null;
                        this.allocationLimit = 1;
                        eventListener.connectFailed(call, this.route.g(), this.route.e(), null, e);
                        if (routeException == null) {
                            routeException = new RouteException(e);
                        } else {
                            routeException.addConnectException(e);
                        }
                        if (z10) {
                            throw routeException;
                        }
                        if (connectionSpecSelector.connectionFailed(e)) {
                            throw routeException;
                        }
                    }
                }
                try {
                    establishProtocol(connectionSpecSelector, i13, call, eventListener);
                    eventListener.connectEnd(call, this.route.g(), this.route.e(), this.protocol);
                    break;
                } catch (IOException e11) {
                    e = e11;
                    socket = this.socket;
                    if (socket != null) {
                        Util.closeQuietly(socket);
                    }
                    socket2 = this.rawSocket;
                    if (socket2 != null) {
                        Util.closeQuietly(socket2);
                    }
                    this.socket = null;
                    this.rawSocket = null;
                    this.source = null;
                    this.sink = null;
                    this.handshake = null;
                    this.protocol = null;
                    this.http2Connection = null;
                    this.allocationLimit = 1;
                    eventListener.connectFailed(call, this.route.g(), this.route.e(), null, e);
                    if (routeException == null) {
                        routeException = new RouteException(e);
                    } else {
                        routeException.addConnectException(e);
                    }
                    if (z10) {
                        throw routeException;
                    }
                    if (connectionSpecSelector.connectionFailed(e)) {
                        throw routeException;
                    }
                }
            } catch (IOException e12) {
                e = e12;
            }
        }
        if (this.route.f() && this.rawSocket == null) {
            throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.idleAtNs = System.nanoTime();
    }

    public final void connectFailed$okhttp(@d z client, @d e0 failedRoute, @d IOException failure) {
        f0.p(client, "client");
        f0.p(failedRoute, "failedRoute");
        f0.p(failure, "failure");
        if (failedRoute.e().type() != Proxy.Type.DIRECT) {
            a aVarD = failedRoute.d();
            aVarD.t().connectFailed(aVarD.w().Z(), failedRoute.e().address(), failure);
        }
        client.getRouteDatabase().failed(failedRoute);
    }

    @d
    public final List<Reference<RealCall>> getCalls() {
        return this.calls;
    }

    @d
    public final RealConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    /* JADX INFO: renamed from: getIdleAtNs$okhttp, reason: from getter */
    public final long getIdleAtNs() {
        return this.idleAtNs;
    }

    public final boolean getNoNewExchanges() {
        return this.noNewExchanges;
    }

    /* JADX INFO: renamed from: getRouteFailureCount$okhttp, reason: from getter */
    public final int getRouteFailureCount() {
        return this.routeFailureCount;
    }

    @Override // okhttp3.i
    @dl.e
    /* JADX INFO: renamed from: handshake, reason: from getter */
    public Handshake getHandshake() {
        return this.handshake;
    }

    public final synchronized void incrementSuccessCount$okhttp() {
        this.successCount++;
    }

    public final boolean isEligible$okhttp(@d a address, @dl.e List<e0> routes) {
        f0.p(address, "address");
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            f0.o(threadCurrentThread, "Thread.currentThread()");
            sb2.append(threadCurrentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        if (this.calls.size() >= this.allocationLimit || this.noNewExchanges || !this.route.d().o(address)) {
            return false;
        }
        if (f0.g(address.w().getHost(), getRoute().d().w().getHost())) {
            return true;
        }
        if (this.http2Connection == null || routes == null || !routeMatchesAny(routes) || address.p() != OkHostnameVerifier.INSTANCE || !supportsUrl(address.w())) {
            return false;
        }
        try {
            CertificatePinner certificatePinnerL = address.l();
            f0.m(certificatePinnerL);
            String host = address.w().getHost();
            Handshake handshake = getHandshake();
            f0.m(handshake);
            certificatePinnerL.a(host, handshake.m());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean isHealthy(boolean doExtensiveChecks) {
        long j10;
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
        long jNanoTime = System.nanoTime();
        Socket socket = this.rawSocket;
        f0.m(socket);
        Socket socket2 = this.socket;
        f0.m(socket2);
        BufferedSource bufferedSource = this.source;
        f0.m(bufferedSource);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.http2Connection;
        if (http2Connection != null) {
            return http2Connection.isHealthy(jNanoTime);
        }
        synchronized (this) {
            j10 = jNanoTime - this.idleAtNs;
        }
        if (j10 < IDLE_CONNECTION_HEALTHY_NS || !doExtensiveChecks) {
            return true;
        }
        return Util.isHealthy(socket2, bufferedSource);
    }

    public final boolean isMultiplexed$okhttp() {
        return this.http2Connection != null;
    }

    @d
    public final ExchangeCodec newCodec$okhttp(@d z client, @d RealInterceptorChain chain) throws SocketException {
        f0.p(client, "client");
        f0.p(chain, "chain");
        Socket socket = this.socket;
        f0.m(socket);
        BufferedSource bufferedSource = this.source;
        f0.m(bufferedSource);
        BufferedSink bufferedSink = this.sink;
        f0.m(bufferedSink);
        Http2Connection http2Connection = this.http2Connection;
        if (http2Connection != null) {
            return new Http2ExchangeCodec(client, this, chain, http2Connection);
        }
        socket.setSoTimeout(chain.readTimeoutMillis());
        Timeout timeout = bufferedSource.getTimeout();
        long readTimeoutMillis$okhttp = chain.getReadTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.timeout(readTimeoutMillis$okhttp, timeUnit);
        bufferedSink.getTimeout().timeout(chain.getWriteTimeoutMillis(), timeUnit);
        return new Http1ExchangeCodec(client, this, bufferedSource, bufferedSink);
    }

    @d
    public final RealWebSocket.Streams newWebSocketStreams$okhttp(@d final Exchange exchange) throws SocketException {
        f0.p(exchange, "exchange");
        Socket socket = this.socket;
        f0.m(socket);
        final BufferedSource bufferedSource = this.source;
        f0.m(bufferedSource);
        final BufferedSink bufferedSink = this.sink;
        f0.m(bufferedSink);
        socket.setSoTimeout(0);
        noNewExchanges$okhttp();
        final boolean z10 = true;
        return new RealWebSocket.Streams(z10, bufferedSource, bufferedSink) { // from class: okhttp3.internal.connection.RealConnection$newWebSocketStreams$1
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                exchange.bodyComplete(-1L, true, true, null);
            }
        };
    }

    public final synchronized void noCoalescedConnections$okhttp() {
        this.noCoalescedConnections = true;
    }

    public final synchronized void noNewExchanges$okhttp() {
        this.noNewExchanges = true;
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public synchronized void onSettings(@d Http2Connection connection, @d Settings settings) {
        f0.p(connection, "connection");
        f0.p(settings, "settings");
        this.allocationLimit = settings.getMaxConcurrentStreams();
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onStream(@d Http2Stream stream) throws IOException {
        f0.p(stream, "stream");
        stream.close(ErrorCode.REFUSED_STREAM, null);
    }

    @Override // okhttp3.i
    @d
    public Protocol protocol() {
        Protocol protocol = this.protocol;
        f0.m(protocol);
        return protocol;
    }

    @Override // okhttp3.i
    @d
    /* JADX INFO: renamed from: route, reason: from getter */
    public e0 getRoute() {
        return this.route;
    }

    public final void setIdleAtNs$okhttp(long j10) {
        this.idleAtNs = j10;
    }

    public final void setNoNewExchanges(boolean z10) {
        this.noNewExchanges = z10;
    }

    public final void setRouteFailureCount$okhttp(int i10) {
        this.routeFailureCount = i10;
    }

    @Override // okhttp3.i
    @d
    public Socket socket() {
        Socket socket = this.socket;
        f0.m(socket);
        return socket;
    }

    @d
    public String toString() {
        Object objG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(this.route.d().w().getHost());
        sb2.append(':');
        sb2.append(this.route.d().w().getCom.max.xiaoheihe.module.voice.HeyboxMicFragment.y java.lang.String());
        sb2.append(',');
        sb2.append(" proxy=");
        sb2.append(this.route.e());
        sb2.append(" hostAddress=");
        sb2.append(this.route.g());
        sb2.append(" cipherSuite=");
        Handshake handshake = this.handshake;
        if (handshake == null || (objG = handshake.g()) == null) {
            objG = "none";
        }
        sb2.append(objG);
        sb2.append(" protocol=");
        sb2.append(this.protocol);
        sb2.append('}');
        return sb2.toString();
    }

    public final synchronized void trackFailure$okhttp(@d RealCall call, @dl.e IOException e10) {
        f0.p(call, "call");
        if (e10 instanceof StreamResetException) {
            if (((StreamResetException) e10).errorCode == ErrorCode.REFUSED_STREAM) {
                int i10 = this.refusedStreamCount + 1;
                this.refusedStreamCount = i10;
                if (i10 > 1) {
                    this.noNewExchanges = true;
                    this.routeFailureCount++;
                }
            } else if (((StreamResetException) e10).errorCode != ErrorCode.CANCEL || !call.getCanceled()) {
                this.noNewExchanges = true;
                this.routeFailureCount++;
            }
        } else if (!isMultiplexed$okhttp() || (e10 instanceof ConnectionShutdownException)) {
            this.noNewExchanges = true;
            if (this.successCount == 0) {
                if (e10 != null) {
                    connectFailed$okhttp(call.getClient(), this.route, e10);
                }
                this.routeFailureCount++;
            }
        }
    }
}
