package okhttp3.logging;

import com.alipay.zoloz.android.phone.mrpc.core.f;
import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.umeng.analytics.pro.ak;
import dl.d;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.e;
import okhttp3.p;
import okhttp3.t;
import xh.i;

/* JADX INFO: compiled from: LoggingEventListener.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001HB\u0011\b\u0002\u0012\u0006\u0010E\u001a\u00020B¢\u0006\u0004\bF\u0010GJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J&\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J&\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\fH\u0016J \u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rH\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001a\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J*\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J2\u0010\"\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010!\u001a\u00020 H\u0016J\u0018\u0010%\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0016J\u0018\u0010&\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0016J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010*\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(H\u0016J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010.\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0016J\u0018\u0010/\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0016J\u0010\u00100\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u00103\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00102\u001a\u000201H\u0016J\u0010\u00104\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0016J\u0018\u00106\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0016J\u0010\u00107\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u00108\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0016J\u0010\u00109\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010:\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00102\u001a\u000201H\u0016J\u0018\u0010;\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00102\u001a\u000201H\u0016J\u0010\u0010<\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010>\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010=\u001a\u000201H\u0016R\u0016\u0010A\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006I"}, d2 = {"Lokhttp3/logging/a;", "Lokhttp3/p;", "", "message", "Lkotlin/b2;", "b", "Lokhttp3/e;", "call", "callStart", "Lokhttp3/t;", "url", "proxySelectStart", "", "Ljava/net/Proxy;", "proxies", "proxySelectEnd", "domainName", "dnsStart", "Ljava/net/InetAddress;", "inetAddressList", "dnsEnd", "Ljava/net/InetSocketAddress;", "inetSocketAddress", WebviewFragment.A4, "connectStart", "secureConnectStart", "Lokhttp3/Handshake;", "handshake", "secureConnectEnd", "Lokhttp3/Protocol;", SwitchDetailActivity.P, "connectEnd", "Ljava/io/IOException;", "ioe", "connectFailed", "Lokhttp3/i;", f.f39665q, "connectionAcquired", "connectionReleased", "requestHeadersStart", "Lokhttp3/a0;", "request", "requestHeadersEnd", "requestBodyStart", "", "byteCount", "requestBodyEnd", "requestFailed", "responseHeadersStart", "Lokhttp3/c0;", "response", "responseHeadersEnd", "responseBodyStart", "responseBodyEnd", "responseFailed", "callEnd", "callFailed", qb.a.f138642e, "satisfactionFailure", "cacheHit", "cacheMiss", "cachedResponse", "cacheConditionalHit", "e", "J", "startNs", "Lokhttp3/logging/HttpLoggingInterceptor$a;", "f", "Lokhttp3/logging/HttpLoggingInterceptor$a;", "logger", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor$a;)V", ak.av, "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
public final class a extends p {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long startNs;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final HttpLoggingInterceptor.a logger;

    /* JADX INFO: renamed from: okhttp3.logging.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LoggingEventListener.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lokhttp3/logging/a$a;", "Lokhttp3/p$c;", "Lokhttp3/e;", "call", "Lokhttp3/p;", TopicHashtagWrapper.TYPE_CREATE, "Lokhttp3/logging/HttpLoggingInterceptor$a;", ak.av, "Lokhttp3/logging/HttpLoggingInterceptor$a;", "logger", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor$a;)V", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
    public static class C1218a implements p.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final HttpLoggingInterceptor.a logger;

        /* JADX WARN: Multi-variable type inference failed */
        @i
        public C1218a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @i
        public C1218a(@d HttpLoggingInterceptor.a logger) {
            f0.p(logger, "logger");
            this.logger = logger;
        }

        public /* synthetic */ C1218a(HttpLoggingInterceptor.a aVar, int i10, u uVar) {
            this((i10 & 1) != 0 ? HttpLoggingInterceptor.a.f132612a : aVar);
        }

        @Override // okhttp3.p.c
        @d
        public p create(@d e call) {
            f0.p(call, "call");
            return new a(this.logger, null);
        }
    }

    private a(HttpLoggingInterceptor.a aVar) {
        this.logger = aVar;
    }

    public /* synthetic */ a(HttpLoggingInterceptor.a aVar, u uVar) {
        this(aVar);
    }

    private final void b(String str) {
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.startNs);
        this.logger.log('[' + millis + " ms] " + str);
    }

    @Override // okhttp3.p
    public void cacheConditionalHit(@d e call, @d c0 cachedResponse) {
        f0.p(call, "call");
        f0.p(cachedResponse, "cachedResponse");
        b("cacheConditionalHit: " + cachedResponse);
    }

    @Override // okhttp3.p
    public void cacheHit(@d e call, @d c0 response) {
        f0.p(call, "call");
        f0.p(response, "response");
        b("cacheHit: " + response);
    }

    @Override // okhttp3.p
    public void cacheMiss(@d e call) {
        f0.p(call, "call");
        b("cacheMiss");
    }

    @Override // okhttp3.p
    public void callEnd(@d e call) {
        f0.p(call, "call");
        b("callEnd");
    }

    @Override // okhttp3.p
    public void callFailed(@d e call, @d IOException ioe) {
        f0.p(call, "call");
        f0.p(ioe, "ioe");
        b("callFailed: " + ioe);
    }

    @Override // okhttp3.p
    public void callStart(@d e call) {
        f0.p(call, "call");
        this.startNs = System.nanoTime();
        b("callStart: " + call.request());
    }

    @Override // okhttp3.p
    public void canceled(@d e call) {
        f0.p(call, "call");
        b(qb.a.f138642e);
    }

    @Override // okhttp3.p
    public void connectEnd(@d e call, @d InetSocketAddress inetSocketAddress, @d Proxy proxy, @dl.e Protocol protocol) {
        f0.p(call, "call");
        f0.p(inetSocketAddress, "inetSocketAddress");
        f0.p(proxy, "proxy");
        b("connectEnd: " + protocol);
    }

    @Override // okhttp3.p
    public void connectFailed(@d e call, @d InetSocketAddress inetSocketAddress, @d Proxy proxy, @dl.e Protocol protocol, @d IOException ioe) {
        f0.p(call, "call");
        f0.p(inetSocketAddress, "inetSocketAddress");
        f0.p(proxy, "proxy");
        f0.p(ioe, "ioe");
        b("connectFailed: " + protocol + ' ' + ioe);
    }

    @Override // okhttp3.p
    public void connectStart(@d e call, @d InetSocketAddress inetSocketAddress, @d Proxy proxy) {
        f0.p(call, "call");
        f0.p(inetSocketAddress, "inetSocketAddress");
        f0.p(proxy, "proxy");
        b("connectStart: " + inetSocketAddress + ' ' + proxy);
    }

    @Override // okhttp3.p
    public void connectionAcquired(@d e call, @d okhttp3.i connection) {
        f0.p(call, "call");
        f0.p(connection, "connection");
        b("connectionAcquired: " + connection);
    }

    @Override // okhttp3.p
    public void connectionReleased(@d e call, @d okhttp3.i connection) {
        f0.p(call, "call");
        f0.p(connection, "connection");
        b("connectionReleased");
    }

    @Override // okhttp3.p
    public void dnsEnd(@d e call, @d String domainName, @d List<? extends InetAddress> inetAddressList) {
        f0.p(call, "call");
        f0.p(domainName, "domainName");
        f0.p(inetAddressList, "inetAddressList");
        b("dnsEnd: " + inetAddressList);
    }

    @Override // okhttp3.p
    public void dnsStart(@d e call, @d String domainName) {
        f0.p(call, "call");
        f0.p(domainName, "domainName");
        b("dnsStart: " + domainName);
    }

    @Override // okhttp3.p
    public void proxySelectEnd(@d e call, @d t url, @d List<? extends Proxy> proxies) {
        f0.p(call, "call");
        f0.p(url, "url");
        f0.p(proxies, "proxies");
        b("proxySelectEnd: " + proxies);
    }

    @Override // okhttp3.p
    public void proxySelectStart(@d e call, @d t url) {
        f0.p(call, "call");
        f0.p(url, "url");
        b("proxySelectStart: " + url);
    }

    @Override // okhttp3.p
    public void requestBodyEnd(@d e call, long j10) {
        f0.p(call, "call");
        b("requestBodyEnd: byteCount=" + j10);
    }

    @Override // okhttp3.p
    public void requestBodyStart(@d e call) {
        f0.p(call, "call");
        b("requestBodyStart");
    }

    @Override // okhttp3.p
    public void requestFailed(@d e call, @d IOException ioe) {
        f0.p(call, "call");
        f0.p(ioe, "ioe");
        b("requestFailed: " + ioe);
    }

    @Override // okhttp3.p
    public void requestHeadersEnd(@d e call, @d a0 request) {
        f0.p(call, "call");
        f0.p(request, "request");
        b("requestHeadersEnd");
    }

    @Override // okhttp3.p
    public void requestHeadersStart(@d e call) {
        f0.p(call, "call");
        b("requestHeadersStart");
    }

    @Override // okhttp3.p
    public void responseBodyEnd(@d e call, long j10) {
        f0.p(call, "call");
        b("responseBodyEnd: byteCount=" + j10);
    }

    @Override // okhttp3.p
    public void responseBodyStart(@d e call) {
        f0.p(call, "call");
        b("responseBodyStart");
    }

    @Override // okhttp3.p
    public void responseFailed(@d e call, @d IOException ioe) {
        f0.p(call, "call");
        f0.p(ioe, "ioe");
        b("responseFailed: " + ioe);
    }

    @Override // okhttp3.p
    public void responseHeadersEnd(@d e call, @d c0 response) {
        f0.p(call, "call");
        f0.p(response, "response");
        b("responseHeadersEnd: " + response);
    }

    @Override // okhttp3.p
    public void responseHeadersStart(@d e call) {
        f0.p(call, "call");
        b("responseHeadersStart");
    }

    @Override // okhttp3.p
    public void satisfactionFailure(@d e call, @d c0 response) {
        f0.p(call, "call");
        f0.p(response, "response");
        b("satisfactionFailure: " + response);
    }

    @Override // okhttp3.p
    public void secureConnectEnd(@d e call, @dl.e Handshake handshake) {
        f0.p(call, "call");
        b("secureConnectEnd: " + handshake);
    }

    @Override // okhttp3.p
    public void secureConnectStart(@d e call) {
        f0.p(call, "call");
        b("secureConnectStart");
    }
}
