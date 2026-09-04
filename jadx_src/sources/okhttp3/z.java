package okhttp3;

import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.taobao.accs.utl.BaseMonitor;
import com.umeng.analytics.pro.ak;
import java.net.Proxy;
import java.net.ProxySelector;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.s0;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: compiled from: OkHttpClient.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 i2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\t\rB\u0014\b\u0000\u0012\u0007\u0010§\u0001\u001a\u00020\u000e¢\u0006\u0006\b¨\u0001\u0010©\u0001B\u000b\b\u0016¢\u0006\u0006\b¨\u0001\u0010ª\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0007¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001eH\u0007¢\u0006\u0004\b$\u0010 J\u000f\u0010%\u001a\u00020\u001eH\u0007¢\u0006\u0004\b%\u0010 J\u000f\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b'\u0010(J\u0011\u0010*\u001a\u0004\u0018\u00010)H\u0007¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b-\u0010.J\u0011\u00100\u001a\u0004\u0018\u00010/H\u0007¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u000202H\u0007¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020!H\u0007¢\u0006\u0004\b5\u0010#J\u000f\u00107\u001a\u000206H\u0007¢\u0006\u0004\b7\u00108J\u000f\u0010:\u001a\u000209H\u0007¢\u0006\u0004\b:\u0010;J\u0015\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u0016H\u0007¢\u0006\u0004\b=\u0010\u0019J\u0015\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u0016H\u0007¢\u0006\u0004\b?\u0010\u0019J\u000f\u0010A\u001a\u00020@H\u0007¢\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020CH\u0007¢\u0006\u0004\bD\u0010EJ\u000f\u0010G\u001a\u00020FH\u0007¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020FH\u0007¢\u0006\u0004\bI\u0010HJ\u000f\u0010J\u001a\u00020FH\u0007¢\u0006\u0004\bJ\u0010HJ\u000f\u0010K\u001a\u00020FH\u0007¢\u0006\u0004\bK\u0010HJ\u000f\u0010L\u001a\u00020FH\u0007¢\u0006\u0004\bL\u0010HR\u0017\u0010O\u001a\u00020\u00108G¢\u0006\f\n\u0004\b\r\u0010M\u001a\u0004\bN\u0010\u0012R\u0017\u0010R\u001a\u00020\u00138G¢\u0006\f\n\u0004\b\"\u0010P\u001a\u0004\bQ\u0010\u0015R\u001d\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168G¢\u0006\f\n\u0004\b*\u0010S\u001a\u0004\bT\u0010\u0019R\u001d\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168G¢\u0006\f\n\u0004\bG\u0010S\u001a\u0004\bV\u0010\u0019R\u0017\u0010Z\u001a\u00020\u001b8G¢\u0006\f\n\u0004\bD\u0010X\u001a\u0004\bY\u0010\u001dR\u0017\u0010]\u001a\u00020\u001e8G¢\u0006\f\n\u0004\bI\u0010[\u001a\u0004\b\\\u0010 R\u0017\u0010`\u001a\u00020!8G¢\u0006\f\n\u0004\b\u0014\u0010^\u001a\u0004\b_\u0010#R\u0017\u0010b\u001a\u00020\u001e8G¢\u0006\f\n\u0004\b=\u0010[\u001a\u0004\ba\u0010 R\u0017\u0010d\u001a\u00020\u001e8G¢\u0006\f\n\u0004\b'\u0010[\u001a\u0004\bc\u0010 R\u0017\u0010g\u001a\u00020&8G¢\u0006\f\n\u0004\b\u0011\u0010e\u001a\u0004\bf\u0010(R\u0019\u0010j\u001a\u0004\u0018\u00010)8G¢\u0006\f\n\u0004\b-\u0010h\u001a\u0004\bi\u0010+R\u0017\u0010m\u001a\u00020,8G¢\u0006\f\n\u0004\b\u001c\u0010k\u001a\u0004\bl\u0010.R\u0019\u0010p\u001a\u0004\u0018\u00010/8G¢\u0006\f\n\u0004\b$\u0010n\u001a\u0004\bo\u00101R\u0017\u0010s\u001a\u0002028G¢\u0006\f\n\u0004\b%\u0010q\u001a\u0004\br\u00104R\u0017\u0010u\u001a\u00020!8G¢\u0006\f\n\u0004\bA\u0010^\u001a\u0004\bt\u0010#R\u0017\u0010x\u001a\u0002068G¢\u0006\f\n\u0004\b\u0018\u0010v\u001a\u0004\bw\u00108R\u0016\u0010z\u001a\u0004\u0018\u0001098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010yR\u0019\u0010\u007f\u001a\u0004\u0018\u00010{8G¢\u0006\f\n\u0004\bL\u0010|\u001a\u0004\b}\u0010~R\u001f\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020<0\u00168G¢\u0006\r\n\u0004\b?\u0010S\u001a\u0005\b\u0080\u0001\u0010\u0019R\u001f\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020>0\u00168G¢\u0006\r\n\u0004\b0\u0010S\u001a\u0005\b\u0082\u0001\u0010\u0019R\u0019\u0010\u0085\u0001\u001a\u00020@8G¢\u0006\r\n\u0005\b5\u0010\u0084\u0001\u001a\u0004\b[\u0010BR\u001a\u0010\u0088\u0001\u001a\u00020C8G¢\u0006\u000e\n\u0005\b3\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010ER\u001e\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u0089\u00018G¢\u0006\u000f\n\u0005\bJ\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001a\u0010\u0090\u0001\u001a\u00020F8G¢\u0006\u000e\n\u0005\b\u001f\u0010\u008e\u0001\u001a\u0005\b\u008f\u0001\u0010HR\u001a\u0010\u0092\u0001\u001a\u00020F8G¢\u0006\u000e\n\u0005\b7\u0010\u008e\u0001\u001a\u0005\b\u0091\u0001\u0010HR\u001b\u0010\u0095\u0001\u001a\u00020F8G¢\u0006\u000f\n\u0006\b\u0093\u0001\u0010\u008e\u0001\u001a\u0005\b\u0094\u0001\u0010HR\u001a\u0010\u0097\u0001\u001a\u00020F8G¢\u0006\u000e\n\u0005\b:\u0010\u008e\u0001\u001a\u0005\b\u0096\u0001\u0010HR\u001a\u0010\u0099\u0001\u001a\u00020F8G¢\u0006\u000e\n\u0005\bK\u0010\u008e\u0001\u001a\u0005\b\u0098\u0001\u0010HR\u001d\u0010\u009e\u0001\u001a\u00030\u009a\u00018G¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010\u008f\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001d\u0010¤\u0001\u001a\u00030\u009f\u00018\u0006¢\u0006\u0010\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R\u0013\u0010¦\u0001\u001a\u0002098G¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010;¨\u0006«\u0001"}, d2 = {"Lokhttp3/z;", "", "Lokhttp3/e$a;", "Lokhttp3/f0$a;", "Lkotlin/b2;", "o0", "Lokhttp3/a0;", "request", "Lokhttp3/e;", ak.av, "Lokhttp3/g0;", com.google.android.gms.common.internal.s.a.f52543a, "Lokhttp3/f0;", "b", "Lokhttp3/z$a;", "e0", "Lokhttp3/n;", "k", "()Lokhttp3/n;", "Lokhttp3/j;", RXScreenCaptureService.KEY_HEIGHT, "()Lokhttp3/j;", "", "Lokhttp3/u;", "q", "()Ljava/util/List;", "r", "Lokhttp3/p$c;", "m", "()Lokhttp3/p$c;", "", "y", "()Z", "Lokhttp3/b;", ak.aF, "()Lokhttp3/b;", "n", "o", "Lokhttp3/l;", "j", "()Lokhttp3/l;", "Lokhttp3/c;", "d", "()Lokhttp3/c;", "Lokhttp3/o;", "l", "()Lokhttp3/o;", "Ljava/net/Proxy;", ak.aG, "()Ljava/net/Proxy;", "Ljava/net/ProxySelector;", RXScreenCaptureService.KEY_WIDTH, "()Ljava/net/ProxySelector;", "v", "Ljavax/net/SocketFactory;", ak.aD, "()Ljavax/net/SocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "B", "()Ljavax/net/ssl/SSLSocketFactory;", "Lokhttp3/k;", "i", "Lokhttp3/Protocol;", "t", "Ljavax/net/ssl/HostnameVerifier;", "p", "()Ljavax/net/ssl/HostnameVerifier;", "Lokhttp3/CertificatePinner;", "f", "()Lokhttp3/CertificatePinner;", "", "e", "()I", "g", "x", "C", ak.aB, "Lokhttp3/n;", androidx.exifinterface.media.a.R4, "dispatcher", "Lokhttp3/j;", "P", "connectionPool", "Ljava/util/List;", "b0", "interceptors", "d0", "networkInterceptors", "Lokhttp3/p$c;", "U", "eventListenerFactory", "Z", "l0", "retryOnConnectionFailure", "Lokhttp3/b;", "G", "authenticator", androidx.exifinterface.media.a.X4, "followRedirects", "X", "followSslRedirects", "Lokhttp3/l;", "R", "cookieJar", "Lokhttp3/c;", "H", "cache", "Lokhttp3/o;", androidx.exifinterface.media.a.f23244d5, BaseMonitor.COUNT_POINT_DNS, "Ljava/net/Proxy;", "h0", WebviewFragment.A4, "Ljava/net/ProxySelector;", "j0", "proxySelector", "i0", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "m0", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactoryOrNull", "Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/X509TrustManager;", "q0", "()Ljavax/net/ssl/X509TrustManager;", "x509TrustManager", "Q", "connectionSpecs", "g0", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lokhttp3/CertificatePinner;", "M", "certificatePinner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "K", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "I", "J", "callTimeoutMillis", "O", "connectTimeoutMillis", androidx.exifinterface.media.a.W4, "k0", "readTimeoutMillis", "p0", "writeTimeoutMillis", "f0", "pingIntervalMillis", "", "D", "c0", "()J", "minWebSocketMessageToCompress", "Lokhttp3/internal/connection/RouteDatabase;", androidx.exifinterface.media.a.S4, "Lokhttp3/internal/connection/RouteDatabase;", "Y", "()Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "n0", "sslSocketFactory", "builder", "<init>", "(Lokhttp3/z$a;)V", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
public class z implements Cloneable, e.a, f0.a {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final int readTimeoutMillis;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final int writeTimeoutMillis;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final int pingIntervalMillis;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final long minWebSocketMessageToCompress;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @dl.d
    private final RouteDatabase routeDatabase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final n dispatcher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final j connectionPool;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<u> interceptors;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<u> networkInterceptors;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final p.c eventListenerFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean retryOnConnectionFailure;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final b authenticator;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean followRedirects;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean followSslRedirects;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final l cookieJar;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final c cache;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final o dns;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final Proxy proxy;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final ProxySelector proxySelector;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final b proxyAuthenticator;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final SocketFactory socketFactory;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final SSLSocketFactory sslSocketFactoryOrNull;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final X509TrustManager x509TrustManager;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<k> connectionSpecs;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<Protocol> protocols;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final HostnameVerifier hostnameVerifier;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final CertificatePinner certificatePinner;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final CertificateChainCleaner certificateChainCleaner;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final int callTimeoutMillis;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final int connectTimeoutMillis;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @dl.d
    private static final List<Protocol> F = Util.immutableListOf(Protocol.HTTP_2, Protocol.HTTP_1_1);

    @dl.d
    private static final List<k> G = Util.immutableListOf(k.f132594h, k.f132596j);

    /* JADX INFO: compiled from: OkHttpClient.kt */
    @Metadata(bv = {}, d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b_\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bè\u0001\u0010é\u0001B\u0014\b\u0010\u0012\u0007\u0010ê\u0001\u001a\u00020c¢\u0006\u0006\bè\u0001\u0010ë\u0001J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\tJ8\u0010\u0014\u001a\u00020\u00002#\b\u0004\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\rH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\tJ8\u0010\u0018\u001a\u00020\u00002#\b\u0004\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\rH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0015J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001cJ\u000e\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u001fJ\u000e\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u001fJ\u000e\u0010+\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)J\u0010\u0010.\u001a\u00020\u00002\b\u0010-\u001a\u0004\u0018\u00010,J\u000e\u00101\u001a\u00020\u00002\u0006\u00100\u001a\u00020/J\u0010\u00104\u001a\u00020\u00002\b\u00103\u001a\u0004\u0018\u000102J\u000e\u00107\u001a\u00020\u00002\u0006\u00106\u001a\u000205J\u000e\u00109\u001a\u00020\u00002\u0006\u00108\u001a\u00020\"J\u000e\u0010<\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:J\u0010\u0010?\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=H\u0007J\u0016\u0010B\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=2\u0006\u0010A\u001a\u00020@J\u0014\u0010F\u001a\u00020\u00002\f\u0010E\u001a\b\u0012\u0004\u0012\u00020D0CJ\u0014\u0010I\u001a\u00020\u00002\f\u0010H\u001a\b\u0012\u0004\u0012\u00020G0CJ\u000e\u0010L\u001a\u00020\u00002\u0006\u0010K\u001a\u00020JJ\u000e\u0010O\u001a\u00020\u00002\u0006\u0010N\u001a\u00020MJ\u0016\u0010T\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020P2\u0006\u0010S\u001a\u00020RJ\u0010\u0010W\u001a\u00020\u00002\u0006\u0010V\u001a\u00020UH\u0007J\u0016\u0010X\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020P2\u0006\u0010S\u001a\u00020RJ\u0010\u0010Y\u001a\u00020\u00002\u0006\u0010V\u001a\u00020UH\u0007J\u0016\u0010Z\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020P2\u0006\u0010S\u001a\u00020RJ\u0010\u0010[\u001a\u00020\u00002\u0006\u0010V\u001a\u00020UH\u0007J\u0016\u0010\\\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020P2\u0006\u0010S\u001a\u00020RJ\u0010\u0010]\u001a\u00020\u00002\u0006\u0010V\u001a\u00020UH\u0007J\u0016\u0010_\u001a\u00020\u00002\u0006\u0010^\u001a\u00020P2\u0006\u0010S\u001a\u00020RJ\u0010\u0010`\u001a\u00020\u00002\u0006\u0010V\u001a\u00020UH\u0007J\u000e\u0010b\u001a\u00020\u00002\u0006\u0010a\u001a\u00020PJ\u0006\u0010d\u001a\u00020cR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010\u0006\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR \u0010r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010o\u001a\u0004\bp\u0010qR \u0010t\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010o\u001a\u0004\bs\u0010qR\"\u0010\u001d\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\"\u0010 \u001a\u00020\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bd\u0010L\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R%\u0010#\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b.\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R$\u0010%\u001a\u00020\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\bT\u0010L\u001a\u0005\b\u0083\u0001\u0010{\"\u0005\b\u0084\u0001\u0010}R%\u0010\u0087\u0001\u001a\u00020\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\bW\u0010L\u001a\u0005\b\u0085\u0001\u0010{\"\u0005\b\u0086\u0001\u0010}R'\u0010*\u001a\u00020)8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bO\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R)\u0010-\u001a\u0004\u0018\u00010,8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bX\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R'\u00100\u001a\u00020/8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bY\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R)\u00103\u001a\u0004\u0018\u0001028\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u0007\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R)\u00106\u001a\u0004\u0018\u0001058\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bF\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R&\u00108\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0004\b+\u0010~\u001a\u0006\b¡\u0001\u0010\u0080\u0001\"\u0006\b¢\u0001\u0010\u0082\u0001R'\u0010;\u001a\u00020:8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u0004\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R*\u0010\u00ad\u0001\u001a\u0004\u0018\u00010=8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b1\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R*\u0010³\u0001\u001a\u0004\u0018\u00010@8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u001b\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R+\u0010E\u001a\b\u0012\u0004\u0012\u00020D0C8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b\u001e\u0010o\u001a\u0005\b´\u0001\u0010q\"\u0006\bµ\u0001\u0010¶\u0001R+\u0010H\u001a\b\u0012\u0004\u0012\u00020G0C8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b&\u0010o\u001a\u0005\b·\u0001\u0010q\"\u0006\b¸\u0001\u0010¶\u0001R'\u0010K\u001a\u00020J8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b(\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R'\u0010N\u001a\u00020M8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R,\u0010É\u0001\u001a\u0005\u0018\u00010Ã\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010Ä\u0001\u001a\u0006\bÅ\u0001\u0010Æ\u0001\"\u0006\bÇ\u0001\u0010È\u0001R*\u0010Ï\u0001\u001a\u00030Ê\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bË\u0001\u0010\u0085\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001\"\u0006\bÍ\u0001\u0010Î\u0001R*\u0010Ò\u0001\u001a\u00030Ê\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÅ\u0001\u0010\u0085\u0001\u001a\u0006\bÐ\u0001\u0010Ì\u0001\"\u0006\bÑ\u0001\u0010Î\u0001R*\u0010Õ\u0001\u001a\u00030Ê\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¿\u0001\u0010\u0085\u0001\u001a\u0006\bÓ\u0001\u0010Ì\u0001\"\u0006\bÔ\u0001\u0010Î\u0001R*\u0010Ø\u0001\u001a\u00030Ê\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÐ\u0001\u0010\u0085\u0001\u001a\u0006\bÖ\u0001\u0010Ì\u0001\"\u0006\b×\u0001\u0010Î\u0001R)\u0010Û\u0001\u001a\u00030Ê\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bk\u0010\u0085\u0001\u001a\u0006\bÙ\u0001\u0010Ì\u0001\"\u0006\bÚ\u0001\u0010Î\u0001R)\u0010à\u0001\u001a\u00020P8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b´\u0001\u0010º\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001\"\u0006\bÞ\u0001\u0010ß\u0001R,\u0010ç\u0001\u001a\u0005\u0018\u00010á\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010â\u0001\u001a\u0006\bã\u0001\u0010ä\u0001\"\u0006\bå\u0001\u0010æ\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006ì\u0001"}, d2 = {"Lokhttp3/z$a;", "", "Lokhttp3/n;", "dispatcher", "p", "Lokhttp3/j;", "connectionPool", "m", "", "Lokhttp3/u;", "a0", "interceptor", ak.aF, "Lkotlin/Function1;", "Lokhttp3/u$a;", "Lkotlin/m0;", "name", "chain", "Lokhttp3/c0;", "block", ak.av, "(Lyh/l;)Lokhttp3/z$a;", "c0", "d", "b", "Lokhttp3/p;", "eventListener", "r", "Lokhttp3/p$c;", "eventListenerFactory", ak.aB, "", "retryOnConnectionFailure", "l0", "Lokhttp3/b;", "authenticator", "e", "followRedirects", "t", "followProtocolRedirects", ak.aG, "Lokhttp3/l;", "cookieJar", "o", "Lokhttp3/c;", "cache", "g", "Lokhttp3/o;", BaseMonitor.COUNT_POINT_DNS, "q", "Ljava/net/Proxy;", WebviewFragment.A4, "g0", "Ljava/net/ProxySelector;", "proxySelector", "i0", "proxyAuthenticator", "h0", "Ljavax/net/SocketFactory;", "socketFactory", "O0", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "P0", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Q0", "", "Lokhttp3/k;", "connectionSpecs", "n", "Lokhttp3/Protocol;", "protocols", "f0", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Z", "Lokhttp3/CertificatePinner;", "certificatePinner", "j", "", l5.a.f130839h0, "Ljava/util/concurrent/TimeUnit;", "unit", RXScreenCaptureService.KEY_HEIGHT, "Ljava/time/Duration;", "duration", "i", "k", "l", "j0", "k0", "R0", "S0", ak.aT, "d0", "e0", "bytes", "b0", "Lokhttp3/z;", "f", "Lokhttp3/n;", androidx.exifinterface.media.a.S4, "()Lokhttp3/n;", "v0", "(Lokhttp3/n;)V", "Lokhttp3/j;", "B", "()Lokhttp3/j;", "s0", "(Lokhttp3/j;)V", "Ljava/util/List;", "K", "()Ljava/util/List;", "interceptors", "M", "networkInterceptors", "Lokhttp3/p$c;", "G", "()Lokhttp3/p$c;", "x0", "(Lokhttp3/p$c;)V", androidx.exifinterface.media.a.f23244d5, "()Z", "I0", "(Z)V", "Lokhttp3/b;", "v", "()Lokhttp3/b;", "m0", "(Lokhttp3/b;)V", "H", "y0", "I", "z0", "followSslRedirects", "Lokhttp3/l;", "D", "()Lokhttp3/l;", "u0", "(Lokhttp3/l;)V", "Lokhttp3/c;", RXScreenCaptureService.KEY_WIDTH, "()Lokhttp3/c;", "n0", "(Lokhttp3/c;)V", "Lokhttp3/o;", "F", "()Lokhttp3/o;", "w0", "(Lokhttp3/o;)V", "Ljava/net/Proxy;", "P", "()Ljava/net/Proxy;", "E0", "(Ljava/net/Proxy;)V", "Ljava/net/ProxySelector;", "R", "()Ljava/net/ProxySelector;", "G0", "(Ljava/net/ProxySelector;)V", "Q", "F0", "Ljavax/net/SocketFactory;", androidx.exifinterface.media.a.X4, "()Ljavax/net/SocketFactory;", "K0", "(Ljavax/net/SocketFactory;)V", "Ljavax/net/ssl/SSLSocketFactory;", androidx.exifinterface.media.a.T4, "()Ljavax/net/ssl/SSLSocketFactory;", "L0", "(Ljavax/net/ssl/SSLSocketFactory;)V", "sslSocketFactoryOrNull", "Ljavax/net/ssl/X509TrustManager;", "Y", "()Ljavax/net/ssl/X509TrustManager;", "N0", "(Ljavax/net/ssl/X509TrustManager;)V", "x509TrustManagerOrNull", "C", "t0", "(Ljava/util/List;)V", "O", "D0", "Ljavax/net/ssl/HostnameVerifier;", "J", "()Ljavax/net/ssl/HostnameVerifier;", "A0", "(Ljavax/net/ssl/HostnameVerifier;)V", "Lokhttp3/CertificatePinner;", ak.aD, "()Lokhttp3/CertificatePinner;", "q0", "(Lokhttp3/CertificatePinner;)V", "Lokhttp3/internal/tls/CertificateChainCleaner;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "y", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "p0", "(Lokhttp3/internal/tls/CertificateChainCleaner;)V", "certificateChainCleaner", "", "x", "()I", "o0", "(I)V", "callTimeout", androidx.exifinterface.media.a.W4, "r0", "connectTimeout", androidx.exifinterface.media.a.R4, "H0", "readTimeout", "X", "M0", "writeTimeout", "N", "C0", "pingInterval", "L", "()J", "B0", "(J)V", "minWebSocketMessageToCompress", "Lokhttp3/internal/connection/RouteDatabase;", "Lokhttp3/internal/connection/RouteDatabase;", "U", "()Lokhttp3/internal/connection/RouteDatabase;", "J0", "(Lokhttp3/internal/connection/RouteDatabase;)V", "routeDatabase", "<init>", "()V", "okHttpClient", "(Lokhttp3/z;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        private int writeTimeout;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        private int pingInterval;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata */
        private long minWebSocketMessageToCompress;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata */
        @dl.e
        private RouteDatabase routeDatabase;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private n dispatcher;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private j connectionPool;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final List<u> interceptors;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final List<u> networkInterceptors;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private p.c eventListenerFactory;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean retryOnConnectionFailure;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private okhttp3.b authenticator;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean followRedirects;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private boolean followSslRedirects;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private l cookieJar;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private c cache;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private o dns;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private Proxy proxy;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private ProxySelector proxySelector;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private okhttp3.b proxyAuthenticator;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private SocketFactory socketFactory;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private SSLSocketFactory sslSocketFactoryOrNull;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private X509TrustManager x509TrustManagerOrNull;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private List<k> connectionSpecs;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private List<? extends Protocol> protocols;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private HostnameVerifier hostnameVerifier;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private CertificatePinner certificatePinner;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private CertificateChainCleaner certificateChainCleaner;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
        private int callTimeout;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
        private int connectTimeout;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
        private int readTimeout;

        /* JADX INFO: renamed from: okhttp3.z$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: OkHttpClient.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lokhttp3/u$a;", "chain", "Lokhttp3/c0;", "intercept", "(Lokhttp3/u$a;)Lokhttp3/c0;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        public static final class C1221a implements u {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ yh.l f132771a;

            public C1221a(yh.l lVar) {
                this.f132771a = lVar;
            }

            @Override // okhttp3.u
            @dl.d
            public final c0 intercept(@dl.d u.a chain) {
                kotlin.jvm.internal.f0.p(chain, "chain");
                return (c0) this.f132771a.invoke(chain);
            }
        }

        /* JADX INFO: compiled from: OkHttpClient.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lokhttp3/u$a;", "chain", "Lokhttp3/c0;", "intercept", "(Lokhttp3/u$a;)Lokhttp3/c0;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        public static final class b implements u {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ yh.l f132772a;

            public b(yh.l lVar) {
                this.f132772a = lVar;
            }

            @Override // okhttp3.u
            @dl.d
            public final c0 intercept(@dl.d u.a chain) {
                kotlin.jvm.internal.f0.p(chain, "chain");
                return (c0) this.f132772a.invoke(chain);
            }
        }

        public a() {
            this.dispatcher = new n();
            this.connectionPool = new j();
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.eventListenerFactory = Util.asFactory(p.NONE);
            this.retryOnConnectionFailure = true;
            okhttp3.b bVar = okhttp3.b.f132372a;
            this.authenticator = bVar;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = l.f132606a;
            this.dns = o.f132626a;
            this.proxyAuthenticator = bVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            kotlin.jvm.internal.f0.o(socketFactory, "SocketFactory.getDefault()");
            this.socketFactory = socketFactory;
            Companion companion = z.INSTANCE;
            this.connectionSpecs = companion.a();
            this.protocols = companion.b();
            this.hostnameVerifier = OkHostnameVerifier.INSTANCE;
            this.certificatePinner = CertificatePinner.f132322c;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.minWebSocketMessageToCompress = 1024L;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@dl.d z okHttpClient) {
            this();
            kotlin.jvm.internal.f0.p(okHttpClient, "okHttpClient");
            this.dispatcher = okHttpClient.getDispatcher();
            this.connectionPool = okHttpClient.getConnectionPool();
            kotlin.collections.x.n0(this.interceptors, okHttpClient.b0());
            kotlin.collections.x.n0(this.networkInterceptors, okHttpClient.d0());
            this.eventListenerFactory = okHttpClient.getEventListenerFactory();
            this.retryOnConnectionFailure = okHttpClient.getRetryOnConnectionFailure();
            this.authenticator = okHttpClient.getAuthenticator();
            this.followRedirects = okHttpClient.getFollowRedirects();
            this.followSslRedirects = okHttpClient.getFollowSslRedirects();
            this.cookieJar = okHttpClient.getCookieJar();
            this.cache = okHttpClient.getCache();
            this.dns = okHttpClient.getDns();
            this.proxy = okHttpClient.getProxy();
            this.proxySelector = okHttpClient.getProxySelector();
            this.proxyAuthenticator = okHttpClient.getProxyAuthenticator();
            this.socketFactory = okHttpClient.getSocketFactory();
            this.sslSocketFactoryOrNull = okHttpClient.sslSocketFactoryOrNull;
            this.x509TrustManagerOrNull = okHttpClient.getX509TrustManager();
            this.connectionSpecs = okHttpClient.Q();
            this.protocols = okHttpClient.g0();
            this.hostnameVerifier = okHttpClient.getHostnameVerifier();
            this.certificatePinner = okHttpClient.getCertificatePinner();
            this.certificateChainCleaner = okHttpClient.getCertificateChainCleaner();
            this.callTimeout = okHttpClient.getCallTimeoutMillis();
            this.connectTimeout = okHttpClient.getConnectTimeoutMillis();
            this.readTimeout = okHttpClient.getReadTimeoutMillis();
            this.writeTimeout = okHttpClient.p0();
            this.pingInterval = okHttpClient.getPingIntervalMillis();
            this.minWebSocketMessageToCompress = okHttpClient.getMinWebSocketMessageToCompress();
            this.routeDatabase = okHttpClient.getRouteDatabase();
        }

        /* JADX INFO: renamed from: A, reason: from getter */
        public final int getConnectTimeout() {
            return this.connectTimeout;
        }

        public final void A0(@dl.d HostnameVerifier hostnameVerifier) {
            kotlin.jvm.internal.f0.p(hostnameVerifier, "<set-?>");
            this.hostnameVerifier = hostnameVerifier;
        }

        @dl.d
        /* JADX INFO: renamed from: B, reason: from getter */
        public final j getConnectionPool() {
            return this.connectionPool;
        }

        public final void B0(long j10) {
            this.minWebSocketMessageToCompress = j10;
        }

        @dl.d
        public final List<k> C() {
            return this.connectionSpecs;
        }

        public final void C0(int i10) {
            this.pingInterval = i10;
        }

        @dl.d
        /* JADX INFO: renamed from: D, reason: from getter */
        public final l getCookieJar() {
            return this.cookieJar;
        }

        public final void D0(@dl.d List<? extends Protocol> list) {
            kotlin.jvm.internal.f0.p(list, "<set-?>");
            this.protocols = list;
        }

        @dl.d
        /* JADX INFO: renamed from: E, reason: from getter */
        public final n getDispatcher() {
            return this.dispatcher;
        }

        public final void E0(@dl.e Proxy proxy) {
            this.proxy = proxy;
        }

        @dl.d
        /* JADX INFO: renamed from: F, reason: from getter */
        public final o getDns() {
            return this.dns;
        }

        public final void F0(@dl.d okhttp3.b bVar) {
            kotlin.jvm.internal.f0.p(bVar, "<set-?>");
            this.proxyAuthenticator = bVar;
        }

        @dl.d
        /* JADX INFO: renamed from: G, reason: from getter */
        public final p.c getEventListenerFactory() {
            return this.eventListenerFactory;
        }

        public final void G0(@dl.e ProxySelector proxySelector) {
            this.proxySelector = proxySelector;
        }

        /* JADX INFO: renamed from: H, reason: from getter */
        public final boolean getFollowRedirects() {
            return this.followRedirects;
        }

        public final void H0(int i10) {
            this.readTimeout = i10;
        }

        /* JADX INFO: renamed from: I, reason: from getter */
        public final boolean getFollowSslRedirects() {
            return this.followSslRedirects;
        }

        public final void I0(boolean z10) {
            this.retryOnConnectionFailure = z10;
        }

        @dl.d
        /* JADX INFO: renamed from: J, reason: from getter */
        public final HostnameVerifier getHostnameVerifier() {
            return this.hostnameVerifier;
        }

        public final void J0(@dl.e RouteDatabase routeDatabase) {
            this.routeDatabase = routeDatabase;
        }

        @dl.d
        public final List<u> K() {
            return this.interceptors;
        }

        public final void K0(@dl.d SocketFactory socketFactory) {
            kotlin.jvm.internal.f0.p(socketFactory, "<set-?>");
            this.socketFactory = socketFactory;
        }

        /* JADX INFO: renamed from: L, reason: from getter */
        public final long getMinWebSocketMessageToCompress() {
            return this.minWebSocketMessageToCompress;
        }

        public final void L0(@dl.e SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactoryOrNull = sSLSocketFactory;
        }

        @dl.d
        public final List<u> M() {
            return this.networkInterceptors;
        }

        public final void M0(int i10) {
            this.writeTimeout = i10;
        }

        /* JADX INFO: renamed from: N, reason: from getter */
        public final int getPingInterval() {
            return this.pingInterval;
        }

        public final void N0(@dl.e X509TrustManager x509TrustManager) {
            this.x509TrustManagerOrNull = x509TrustManager;
        }

        @dl.d
        public final List<Protocol> O() {
            return this.protocols;
        }

        @dl.d
        public final a O0(@dl.d SocketFactory socketFactory) {
            kotlin.jvm.internal.f0.p(socketFactory, "socketFactory");
            if (!(!(socketFactory instanceof SSLSocketFactory))) {
                throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory".toString());
            }
            if (!kotlin.jvm.internal.f0.g(socketFactory, this.socketFactory)) {
                this.routeDatabase = null;
            }
            this.socketFactory = socketFactory;
            return this;
        }

        @dl.e
        /* JADX INFO: renamed from: P, reason: from getter */
        public final Proxy getProxy() {
            return this.proxy;
        }

        @dl.d
        @kotlin.k(level = DeprecationLevel.ERROR, message = "Use the sslSocketFactory overload that accepts a X509TrustManager.")
        public final a P0(@dl.d SSLSocketFactory sslSocketFactory) {
            kotlin.jvm.internal.f0.p(sslSocketFactory, "sslSocketFactory");
            if (!kotlin.jvm.internal.f0.g(sslSocketFactory, this.sslSocketFactoryOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sslSocketFactory;
            Platform.Companion companion = Platform.INSTANCE;
            X509TrustManager x509TrustManagerTrustManager = companion.get().trustManager(sslSocketFactory);
            if (x509TrustManagerTrustManager != null) {
                this.x509TrustManagerOrNull = x509TrustManagerTrustManager;
                Platform platform = companion.get();
                X509TrustManager x509TrustManager = this.x509TrustManagerOrNull;
                kotlin.jvm.internal.f0.m(x509TrustManager);
                this.certificateChainCleaner = platform.buildCertificateChainCleaner(x509TrustManager);
                return this;
            }
            throw new IllegalStateException("Unable to extract the trust manager on " + companion.get() + ", sslSocketFactory is " + sslSocketFactory.getClass());
        }

        @dl.d
        /* JADX INFO: renamed from: Q, reason: from getter */
        public final okhttp3.b getProxyAuthenticator() {
            return this.proxyAuthenticator;
        }

        @dl.d
        public final a Q0(@dl.d SSLSocketFactory sslSocketFactory, @dl.d X509TrustManager trustManager) {
            kotlin.jvm.internal.f0.p(sslSocketFactory, "sslSocketFactory");
            kotlin.jvm.internal.f0.p(trustManager, "trustManager");
            if ((!kotlin.jvm.internal.f0.g(sslSocketFactory, this.sslSocketFactoryOrNull)) || (!kotlin.jvm.internal.f0.g(trustManager, this.x509TrustManagerOrNull))) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sslSocketFactory;
            this.certificateChainCleaner = CertificateChainCleaner.INSTANCE.get(trustManager);
            this.x509TrustManagerOrNull = trustManager;
            return this;
        }

        @dl.e
        /* JADX INFO: renamed from: R, reason: from getter */
        public final ProxySelector getProxySelector() {
            return this.proxySelector;
        }

        @dl.d
        public final a R0(long timeout, @dl.d TimeUnit unit) {
            kotlin.jvm.internal.f0.p(unit, "unit");
            this.writeTimeout = Util.checkDuration(l5.a.f130839h0, timeout, unit);
            return this;
        }

        /* JADX INFO: renamed from: S, reason: from getter */
        public final int getReadTimeout() {
            return this.readTimeout;
        }

        @dl.d
        @IgnoreJRERequirement
        public final a S0(@dl.d Duration duration) {
            kotlin.jvm.internal.f0.p(duration, "duration");
            R0(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /* JADX INFO: renamed from: T, reason: from getter */
        public final boolean getRetryOnConnectionFailure() {
            return this.retryOnConnectionFailure;
        }

        @dl.e
        /* JADX INFO: renamed from: U, reason: from getter */
        public final RouteDatabase getRouteDatabase() {
            return this.routeDatabase;
        }

        @dl.d
        /* JADX INFO: renamed from: V, reason: from getter */
        public final SocketFactory getSocketFactory() {
            return this.socketFactory;
        }

        @dl.e
        /* JADX INFO: renamed from: W, reason: from getter */
        public final SSLSocketFactory getSslSocketFactoryOrNull() {
            return this.sslSocketFactoryOrNull;
        }

        /* JADX INFO: renamed from: X, reason: from getter */
        public final int getWriteTimeout() {
            return this.writeTimeout;
        }

        @dl.e
        /* JADX INFO: renamed from: Y, reason: from getter */
        public final X509TrustManager getX509TrustManagerOrNull() {
            return this.x509TrustManagerOrNull;
        }

        @dl.d
        public final a Z(@dl.d HostnameVerifier hostnameVerifier) {
            kotlin.jvm.internal.f0.p(hostnameVerifier, "hostnameVerifier");
            if (!kotlin.jvm.internal.f0.g(hostnameVerifier, this.hostnameVerifier)) {
                this.routeDatabase = null;
            }
            this.hostnameVerifier = hostnameVerifier;
            return this;
        }

        @dl.d
        @xh.h(name = "-addInterceptor")
        public final a a(@dl.d yh.l<? super u.a, c0> block) {
            kotlin.jvm.internal.f0.p(block, "block");
            return c(new C1221a(block));
        }

        @dl.d
        public final List<u> a0() {
            return this.interceptors;
        }

        @dl.d
        @xh.h(name = "-addNetworkInterceptor")
        public final a b(@dl.d yh.l<? super u.a, c0> block) {
            kotlin.jvm.internal.f0.p(block, "block");
            return d(new b(block));
        }

        @dl.d
        public final a b0(long bytes) {
            if (bytes >= 0) {
                this.minWebSocketMessageToCompress = bytes;
                return this;
            }
            throw new IllegalArgumentException(("minWebSocketMessageToCompress must be positive: " + bytes).toString());
        }

        @dl.d
        public final a c(@dl.d u interceptor) {
            kotlin.jvm.internal.f0.p(interceptor, "interceptor");
            this.interceptors.add(interceptor);
            return this;
        }

        @dl.d
        public final List<u> c0() {
            return this.networkInterceptors;
        }

        @dl.d
        public final a d(@dl.d u interceptor) {
            kotlin.jvm.internal.f0.p(interceptor, "interceptor");
            this.networkInterceptors.add(interceptor);
            return this;
        }

        @dl.d
        public final a d0(long interval, @dl.d TimeUnit unit) {
            kotlin.jvm.internal.f0.p(unit, "unit");
            this.pingInterval = Util.checkDuration(ak.aT, interval, unit);
            return this;
        }

        @dl.d
        public final a e(@dl.d okhttp3.b authenticator) {
            kotlin.jvm.internal.f0.p(authenticator, "authenticator");
            this.authenticator = authenticator;
            return this;
        }

        @dl.d
        @IgnoreJRERequirement
        public final a e0(@dl.d Duration duration) {
            kotlin.jvm.internal.f0.p(duration, "duration");
            d0(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @dl.d
        public final z f() {
            return new z(this);
        }

        @dl.d
        public final a f0(@dl.d List<? extends Protocol> protocols) {
            kotlin.jvm.internal.f0.p(protocols, "protocols");
            List listT5 = CollectionsKt___CollectionsKt.T5(protocols);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!(listT5.contains(protocol) || listT5.contains(Protocol.HTTP_1_1))) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + listT5).toString());
            }
            if (!(!listT5.contains(protocol) || listT5.size() <= 1)) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + listT5).toString());
            }
            if (!(!listT5.contains(Protocol.HTTP_1_0))) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + listT5).toString());
            }
            if (!(!listT5.contains(null))) {
                throw new IllegalArgumentException("protocols must not contain null".toString());
            }
            listT5.remove(Protocol.SPDY_3);
            if (!kotlin.jvm.internal.f0.g(listT5, this.protocols)) {
                this.routeDatabase = null;
            }
            List<? extends Protocol> listUnmodifiableList = Collections.unmodifiableList(listT5);
            kotlin.jvm.internal.f0.o(listUnmodifiableList, "Collections.unmodifiableList(protocolsCopy)");
            this.protocols = listUnmodifiableList;
            return this;
        }

        @dl.d
        public final a g(@dl.e c cache) {
            this.cache = cache;
            return this;
        }

        @dl.d
        public final a g0(@dl.e Proxy proxy) {
            if (!kotlin.jvm.internal.f0.g(proxy, this.proxy)) {
                this.routeDatabase = null;
            }
            this.proxy = proxy;
            return this;
        }

        @dl.d
        public final a h(long timeout, @dl.d TimeUnit unit) {
            kotlin.jvm.internal.f0.p(unit, "unit");
            this.callTimeout = Util.checkDuration(l5.a.f130839h0, timeout, unit);
            return this;
        }

        @dl.d
        public final a h0(@dl.d okhttp3.b proxyAuthenticator) {
            kotlin.jvm.internal.f0.p(proxyAuthenticator, "proxyAuthenticator");
            if (!kotlin.jvm.internal.f0.g(proxyAuthenticator, this.proxyAuthenticator)) {
                this.routeDatabase = null;
            }
            this.proxyAuthenticator = proxyAuthenticator;
            return this;
        }

        @dl.d
        @IgnoreJRERequirement
        public final a i(@dl.d Duration duration) {
            kotlin.jvm.internal.f0.p(duration, "duration");
            h(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @dl.d
        public final a i0(@dl.d ProxySelector proxySelector) {
            kotlin.jvm.internal.f0.p(proxySelector, "proxySelector");
            if (!kotlin.jvm.internal.f0.g(proxySelector, this.proxySelector)) {
                this.routeDatabase = null;
            }
            this.proxySelector = proxySelector;
            return this;
        }

        @dl.d
        public final a j(@dl.d CertificatePinner certificatePinner) {
            kotlin.jvm.internal.f0.p(certificatePinner, "certificatePinner");
            if (!kotlin.jvm.internal.f0.g(certificatePinner, this.certificatePinner)) {
                this.routeDatabase = null;
            }
            this.certificatePinner = certificatePinner;
            return this;
        }

        @dl.d
        public final a j0(long timeout, @dl.d TimeUnit unit) {
            kotlin.jvm.internal.f0.p(unit, "unit");
            this.readTimeout = Util.checkDuration(l5.a.f130839h0, timeout, unit);
            return this;
        }

        @dl.d
        public final a k(long timeout, @dl.d TimeUnit unit) {
            kotlin.jvm.internal.f0.p(unit, "unit");
            this.connectTimeout = Util.checkDuration(l5.a.f130839h0, timeout, unit);
            return this;
        }

        @dl.d
        @IgnoreJRERequirement
        public final a k0(@dl.d Duration duration) {
            kotlin.jvm.internal.f0.p(duration, "duration");
            j0(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @dl.d
        @IgnoreJRERequirement
        public final a l(@dl.d Duration duration) {
            kotlin.jvm.internal.f0.p(duration, "duration");
            k(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @dl.d
        public final a l0(boolean retryOnConnectionFailure) {
            this.retryOnConnectionFailure = retryOnConnectionFailure;
            return this;
        }

        @dl.d
        public final a m(@dl.d j connectionPool) {
            kotlin.jvm.internal.f0.p(connectionPool, "connectionPool");
            this.connectionPool = connectionPool;
            return this;
        }

        public final void m0(@dl.d okhttp3.b bVar) {
            kotlin.jvm.internal.f0.p(bVar, "<set-?>");
            this.authenticator = bVar;
        }

        @dl.d
        public final a n(@dl.d List<k> connectionSpecs) {
            kotlin.jvm.internal.f0.p(connectionSpecs, "connectionSpecs");
            if (!kotlin.jvm.internal.f0.g(connectionSpecs, this.connectionSpecs)) {
                this.routeDatabase = null;
            }
            this.connectionSpecs = Util.toImmutableList(connectionSpecs);
            return this;
        }

        public final void n0(@dl.e c cVar) {
            this.cache = cVar;
        }

        @dl.d
        public final a o(@dl.d l cookieJar) {
            kotlin.jvm.internal.f0.p(cookieJar, "cookieJar");
            this.cookieJar = cookieJar;
            return this;
        }

        public final void o0(int i10) {
            this.callTimeout = i10;
        }

        @dl.d
        public final a p(@dl.d n dispatcher) {
            kotlin.jvm.internal.f0.p(dispatcher, "dispatcher");
            this.dispatcher = dispatcher;
            return this;
        }

        public final void p0(@dl.e CertificateChainCleaner certificateChainCleaner) {
            this.certificateChainCleaner = certificateChainCleaner;
        }

        @dl.d
        public final a q(@dl.d o dns) {
            kotlin.jvm.internal.f0.p(dns, "dns");
            if (!kotlin.jvm.internal.f0.g(dns, this.dns)) {
                this.routeDatabase = null;
            }
            this.dns = dns;
            return this;
        }

        public final void q0(@dl.d CertificatePinner certificatePinner) {
            kotlin.jvm.internal.f0.p(certificatePinner, "<set-?>");
            this.certificatePinner = certificatePinner;
        }

        @dl.d
        public final a r(@dl.d p eventListener) {
            kotlin.jvm.internal.f0.p(eventListener, "eventListener");
            this.eventListenerFactory = Util.asFactory(eventListener);
            return this;
        }

        public final void r0(int i10) {
            this.connectTimeout = i10;
        }

        @dl.d
        public final a s(@dl.d p.c eventListenerFactory) {
            kotlin.jvm.internal.f0.p(eventListenerFactory, "eventListenerFactory");
            this.eventListenerFactory = eventListenerFactory;
            return this;
        }

        public final void s0(@dl.d j jVar) {
            kotlin.jvm.internal.f0.p(jVar, "<set-?>");
            this.connectionPool = jVar;
        }

        @dl.d
        public final a t(boolean followRedirects) {
            this.followRedirects = followRedirects;
            return this;
        }

        public final void t0(@dl.d List<k> list) {
            kotlin.jvm.internal.f0.p(list, "<set-?>");
            this.connectionSpecs = list;
        }

        @dl.d
        public final a u(boolean followProtocolRedirects) {
            this.followSslRedirects = followProtocolRedirects;
            return this;
        }

        public final void u0(@dl.d l lVar) {
            kotlin.jvm.internal.f0.p(lVar, "<set-?>");
            this.cookieJar = lVar;
        }

        @dl.d
        /* JADX INFO: renamed from: v, reason: from getter */
        public final okhttp3.b getAuthenticator() {
            return this.authenticator;
        }

        public final void v0(@dl.d n nVar) {
            kotlin.jvm.internal.f0.p(nVar, "<set-?>");
            this.dispatcher = nVar;
        }

        @dl.e
        /* JADX INFO: renamed from: w, reason: from getter */
        public final c getCache() {
            return this.cache;
        }

        public final void w0(@dl.d o oVar) {
            kotlin.jvm.internal.f0.p(oVar, "<set-?>");
            this.dns = oVar;
        }

        /* JADX INFO: renamed from: x, reason: from getter */
        public final int getCallTimeout() {
            return this.callTimeout;
        }

        public final void x0(@dl.d p.c cVar) {
            kotlin.jvm.internal.f0.p(cVar, "<set-?>");
            this.eventListenerFactory = cVar;
        }

        @dl.e
        /* JADX INFO: renamed from: y, reason: from getter */
        public final CertificateChainCleaner getCertificateChainCleaner() {
            return this.certificateChainCleaner;
        }

        public final void y0(boolean z10) {
            this.followRedirects = z10;
        }

        @dl.d
        /* JADX INFO: renamed from: z, reason: from getter */
        public final CertificatePinner getCertificatePinner() {
            return this.certificatePinner;
        }

        public final void z0(boolean z10) {
            this.followSslRedirects = z10;
        }
    }

    /* JADX INFO: renamed from: okhttp3.z$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: OkHttpClient.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007¨\u0006\r"}, d2 = {"Lokhttp3/z$b;", "", "", "Lokhttp3/Protocol;", "DEFAULT_PROTOCOLS", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lokhttp3/k;", "DEFAULT_CONNECTION_SPECS", ak.av, "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final List<k> a() {
            return z.G;
        }

        @dl.d
        public final List<Protocol> b() {
            return z.F;
        }
    }

    public z() {
        this(new a());
    }

    public z(@dl.d a builder) {
        ProxySelector proxySelector;
        kotlin.jvm.internal.f0.p(builder, "builder");
        this.dispatcher = builder.getDispatcher();
        this.connectionPool = builder.getConnectionPool();
        this.interceptors = Util.toImmutableList(builder.K());
        this.networkInterceptors = Util.toImmutableList(builder.M());
        this.eventListenerFactory = builder.getEventListenerFactory();
        this.retryOnConnectionFailure = builder.getRetryOnConnectionFailure();
        this.authenticator = builder.getAuthenticator();
        this.followRedirects = builder.getFollowRedirects();
        this.followSslRedirects = builder.getFollowSslRedirects();
        this.cookieJar = builder.getCookieJar();
        this.cache = builder.getCache();
        this.dns = builder.getDns();
        this.proxy = builder.getProxy();
        if (builder.getProxy() != null) {
            proxySelector = NullProxySelector.INSTANCE;
        } else {
            proxySelector = builder.getProxySelector();
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = NullProxySelector.INSTANCE;
            }
        }
        this.proxySelector = proxySelector;
        this.proxyAuthenticator = builder.getProxyAuthenticator();
        this.socketFactory = builder.getSocketFactory();
        List<k> listC = builder.C();
        this.connectionSpecs = listC;
        this.protocols = builder.O();
        this.hostnameVerifier = builder.getHostnameVerifier();
        this.callTimeoutMillis = builder.getCallTimeout();
        this.connectTimeoutMillis = builder.getConnectTimeout();
        this.readTimeoutMillis = builder.getReadTimeout();
        this.writeTimeoutMillis = builder.getWriteTimeout();
        this.pingIntervalMillis = builder.getPingInterval();
        this.minWebSocketMessageToCompress = builder.getMinWebSocketMessageToCompress();
        RouteDatabase routeDatabase = builder.getRouteDatabase();
        this.routeDatabase = routeDatabase == null ? new RouteDatabase() : routeDatabase;
        boolean z10 = true;
        if (!(listC instanceof Collection) || !listC.isEmpty()) {
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                if (((k) it.next()).getIsTls()) {
                    z10 = false;
                    break;
                }
            }
        }
        if (z10) {
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = CertificatePinner.f132322c;
        } else if (builder.getSslSocketFactoryOrNull() != null) {
            this.sslSocketFactoryOrNull = builder.getSslSocketFactoryOrNull();
            CertificateChainCleaner certificateChainCleaner = builder.getCertificateChainCleaner();
            kotlin.jvm.internal.f0.m(certificateChainCleaner);
            this.certificateChainCleaner = certificateChainCleaner;
            X509TrustManager x509TrustManagerOrNull = builder.getX509TrustManagerOrNull();
            kotlin.jvm.internal.f0.m(x509TrustManagerOrNull);
            this.x509TrustManager = x509TrustManagerOrNull;
            CertificatePinner certificatePinner = builder.getCertificatePinner();
            kotlin.jvm.internal.f0.m(certificateChainCleaner);
            this.certificatePinner = certificatePinner.j(certificateChainCleaner);
        } else {
            Platform.Companion companion = Platform.INSTANCE;
            X509TrustManager x509TrustManagerPlatformTrustManager = companion.get().platformTrustManager();
            this.x509TrustManager = x509TrustManagerPlatformTrustManager;
            Platform platform = companion.get();
            kotlin.jvm.internal.f0.m(x509TrustManagerPlatformTrustManager);
            this.sslSocketFactoryOrNull = platform.newSslSocketFactory(x509TrustManagerPlatformTrustManager);
            CertificateChainCleaner.Companion companion2 = CertificateChainCleaner.INSTANCE;
            kotlin.jvm.internal.f0.m(x509TrustManagerPlatformTrustManager);
            CertificateChainCleaner certificateChainCleaner2 = companion2.get(x509TrustManagerPlatformTrustManager);
            this.certificateChainCleaner = certificateChainCleaner2;
            CertificatePinner certificatePinner2 = builder.getCertificatePinner();
            kotlin.jvm.internal.f0.m(certificateChainCleaner2);
            this.certificatePinner = certificatePinner2.j(certificateChainCleaner2);
        }
        o0();
    }

    private final void o0() {
        boolean z10;
        List<u> list = this.interceptors;
        if (list == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if (!(!list.contains(null))) {
            throw new IllegalStateException(("Null interceptor: " + this.interceptors).toString());
        }
        List<u> list2 = this.networkInterceptors;
        if (list2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if (!(!list2.contains(null))) {
            throw new IllegalStateException(("Null network interceptor: " + this.networkInterceptors).toString());
        }
        List<k> list3 = this.connectionSpecs;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                } else if (((k) it.next()).getIsTls()) {
                    z10 = false;
                    break;
                }
            }
        } else {
            z10 = true;
            break;
        }
        if (!z10) {
            if (this.sslSocketFactoryOrNull == null) {
                throw new IllegalStateException("sslSocketFactory == null".toString());
            }
            if (this.certificateChainCleaner == null) {
                throw new IllegalStateException("certificateChainCleaner == null".toString());
            }
            if (this.x509TrustManager == null) {
                throw new IllegalStateException("x509TrustManager == null".toString());
            }
            return;
        }
        if (!(this.sslSocketFactoryOrNull == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.certificateChainCleaner == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.x509TrustManager == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!kotlin.jvm.internal.f0.g(this.certificatePinner, CertificatePinner.f132322c)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "sslSocketFactory", imports = {}))
    @xh.h(name = "-deprecated_sslSocketFactory")
    public final SSLSocketFactory B() {
        return n0();
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "writeTimeoutMillis", imports = {}))
    @xh.h(name = "-deprecated_writeTimeoutMillis")
    /* JADX INFO: renamed from: C, reason: from getter */
    public final int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @dl.d
    @xh.h(name = "authenticator")
    /* JADX INFO: renamed from: G, reason: from getter */
    public final b getAuthenticator() {
        return this.authenticator;
    }

    @xh.h(name = "cache")
    @dl.e
    /* JADX INFO: renamed from: H, reason: from getter */
    public final c getCache() {
        return this.cache;
    }

    @xh.h(name = "callTimeoutMillis")
    /* JADX INFO: renamed from: J, reason: from getter */
    public final int getCallTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    @xh.h(name = "certificateChainCleaner")
    @dl.e
    /* JADX INFO: renamed from: K, reason: from getter */
    public final CertificateChainCleaner getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    @dl.d
    @xh.h(name = "certificatePinner")
    /* JADX INFO: renamed from: M, reason: from getter */
    public final CertificatePinner getCertificatePinner() {
        return this.certificatePinner;
    }

    @xh.h(name = "connectTimeoutMillis")
    /* JADX INFO: renamed from: O, reason: from getter */
    public final int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @dl.d
    @xh.h(name = "connectionPool")
    /* JADX INFO: renamed from: P, reason: from getter */
    public final j getConnectionPool() {
        return this.connectionPool;
    }

    @dl.d
    @xh.h(name = "connectionSpecs")
    public final List<k> Q() {
        return this.connectionSpecs;
    }

    @dl.d
    @xh.h(name = "cookieJar")
    /* JADX INFO: renamed from: R, reason: from getter */
    public final l getCookieJar() {
        return this.cookieJar;
    }

    @dl.d
    @xh.h(name = "dispatcher")
    /* JADX INFO: renamed from: S, reason: from getter */
    public final n getDispatcher() {
        return this.dispatcher;
    }

    @dl.d
    @xh.h(name = BaseMonitor.COUNT_POINT_DNS)
    /* JADX INFO: renamed from: T, reason: from getter */
    public final o getDns() {
        return this.dns;
    }

    @dl.d
    @xh.h(name = "eventListenerFactory")
    /* JADX INFO: renamed from: U, reason: from getter */
    public final p.c getEventListenerFactory() {
        return this.eventListenerFactory;
    }

    @xh.h(name = "followRedirects")
    /* JADX INFO: renamed from: V, reason: from getter */
    public final boolean getFollowRedirects() {
        return this.followRedirects;
    }

    @xh.h(name = "followSslRedirects")
    /* JADX INFO: renamed from: X, reason: from getter */
    public final boolean getFollowSslRedirects() {
        return this.followSslRedirects;
    }

    @dl.d
    /* JADX INFO: renamed from: Y, reason: from getter */
    public final RouteDatabase getRouteDatabase() {
        return this.routeDatabase;
    }

    @dl.d
    @xh.h(name = "hostnameVerifier")
    /* JADX INFO: renamed from: Z, reason: from getter */
    public final HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    @Override // okhttp3.e.a
    @dl.d
    public e a(@dl.d a0 request) {
        kotlin.jvm.internal.f0.p(request, "request");
        return new RealCall(this, request, false);
    }

    @Override // okhttp3.f0.a
    @dl.d
    public f0 b(@dl.d a0 request, @dl.d g0 listener) {
        kotlin.jvm.internal.f0.p(request, "request");
        kotlin.jvm.internal.f0.p(listener, "listener");
        RealWebSocket realWebSocket = new RealWebSocket(TaskRunner.INSTANCE, request, listener, new Random(), this.pingIntervalMillis, null, this.minWebSocketMessageToCompress);
        realWebSocket.connect(this);
        return realWebSocket;
    }

    @dl.d
    @xh.h(name = "interceptors")
    public final List<u> b0() {
        return this.interceptors;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "authenticator", imports = {}))
    @xh.h(name = "-deprecated_authenticator")
    public final b c() {
        return this.authenticator;
    }

    @xh.h(name = "minWebSocketMessageToCompress")
    /* JADX INFO: renamed from: c0, reason: from getter */
    public final long getMinWebSocketMessageToCompress() {
        return this.minWebSocketMessageToCompress;
    }

    @dl.d
    public Object clone() {
        return super.clone();
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "cache", imports = {}))
    @xh.h(name = "-deprecated_cache")
    @dl.e
    public final c d() {
        return this.cache;
    }

    @dl.d
    @xh.h(name = "networkInterceptors")
    public final List<u> d0() {
        return this.networkInterceptors;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "callTimeoutMillis", imports = {}))
    @xh.h(name = "-deprecated_callTimeoutMillis")
    public final int e() {
        return this.callTimeoutMillis;
    }

    @dl.d
    public a e0() {
        return new a(this);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "certificatePinner", imports = {}))
    @xh.h(name = "-deprecated_certificatePinner")
    public final CertificatePinner f() {
        return this.certificatePinner;
    }

    @xh.h(name = "pingIntervalMillis")
    /* JADX INFO: renamed from: f0, reason: from getter */
    public final int getPingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "connectTimeoutMillis", imports = {}))
    @xh.h(name = "-deprecated_connectTimeoutMillis")
    public final int g() {
        return this.connectTimeoutMillis;
    }

    @dl.d
    @xh.h(name = "protocols")
    public final List<Protocol> g0() {
        return this.protocols;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "connectionPool", imports = {}))
    @xh.h(name = "-deprecated_connectionPool")
    public final j h() {
        return this.connectionPool;
    }

    @xh.h(name = WebviewFragment.A4)
    @dl.e
    /* JADX INFO: renamed from: h0, reason: from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "connectionSpecs", imports = {}))
    @xh.h(name = "-deprecated_connectionSpecs")
    public final List<k> i() {
        return this.connectionSpecs;
    }

    @dl.d
    @xh.h(name = "proxyAuthenticator")
    /* JADX INFO: renamed from: i0, reason: from getter */
    public final b getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "cookieJar", imports = {}))
    @xh.h(name = "-deprecated_cookieJar")
    public final l j() {
        return this.cookieJar;
    }

    @dl.d
    @xh.h(name = "proxySelector")
    /* JADX INFO: renamed from: j0, reason: from getter */
    public final ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "dispatcher", imports = {}))
    @xh.h(name = "-deprecated_dispatcher")
    public final n k() {
        return this.dispatcher;
    }

    @xh.h(name = "readTimeoutMillis")
    /* JADX INFO: renamed from: k0, reason: from getter */
    public final int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = BaseMonitor.COUNT_POINT_DNS, imports = {}))
    @xh.h(name = "-deprecated_dns")
    public final o l() {
        return this.dns;
    }

    @xh.h(name = "retryOnConnectionFailure")
    /* JADX INFO: renamed from: l0, reason: from getter */
    public final boolean getRetryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "eventListenerFactory", imports = {}))
    @xh.h(name = "-deprecated_eventListenerFactory")
    public final p.c m() {
        return this.eventListenerFactory;
    }

    @dl.d
    @xh.h(name = "socketFactory")
    /* JADX INFO: renamed from: m0, reason: from getter */
    public final SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "followRedirects", imports = {}))
    @xh.h(name = "-deprecated_followRedirects")
    public final boolean n() {
        return this.followRedirects;
    }

    @dl.d
    @xh.h(name = "sslSocketFactory")
    public final SSLSocketFactory n0() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "followSslRedirects", imports = {}))
    @xh.h(name = "-deprecated_followSslRedirects")
    public final boolean o() {
        return this.followSslRedirects;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "hostnameVerifier", imports = {}))
    @xh.h(name = "-deprecated_hostnameVerifier")
    public final HostnameVerifier p() {
        return this.hostnameVerifier;
    }

    @xh.h(name = "writeTimeoutMillis")
    public final int p0() {
        return this.writeTimeoutMillis;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "interceptors", imports = {}))
    @xh.h(name = "-deprecated_interceptors")
    public final List<u> q() {
        return this.interceptors;
    }

    @xh.h(name = "x509TrustManager")
    @dl.e
    /* JADX INFO: renamed from: q0, reason: from getter */
    public final X509TrustManager getX509TrustManager() {
        return this.x509TrustManager;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "networkInterceptors", imports = {}))
    @xh.h(name = "-deprecated_networkInterceptors")
    public final List<u> r() {
        return this.networkInterceptors;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "pingIntervalMillis", imports = {}))
    @xh.h(name = "-deprecated_pingIntervalMillis")
    public final int s() {
        return this.pingIntervalMillis;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "protocols", imports = {}))
    @xh.h(name = "-deprecated_protocols")
    public final List<Protocol> t() {
        return this.protocols;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = WebviewFragment.A4, imports = {}))
    @xh.h(name = "-deprecated_proxy")
    @dl.e
    public final Proxy u() {
        return this.proxy;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "proxyAuthenticator", imports = {}))
    @xh.h(name = "-deprecated_proxyAuthenticator")
    public final b v() {
        return this.proxyAuthenticator;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "proxySelector", imports = {}))
    @xh.h(name = "-deprecated_proxySelector")
    public final ProxySelector w() {
        return this.proxySelector;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "readTimeoutMillis", imports = {}))
    @xh.h(name = "-deprecated_readTimeoutMillis")
    public final int x() {
        return this.readTimeoutMillis;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "retryOnConnectionFailure", imports = {}))
    @xh.h(name = "-deprecated_retryOnConnectionFailure")
    public final boolean y() {
        return this.retryOnConnectionFailure;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "socketFactory", imports = {}))
    @xh.h(name = "-deprecated_socketFactory")
    public final SocketFactory z() {
        return this.socketFactory;
    }
}
