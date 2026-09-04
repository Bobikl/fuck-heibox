package okhttp3;

import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.umeng.analytics.pro.ak;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: EventListener.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b&\u0018\u0000 @2\u00020\u0001:\u0002ABB\u0007¢\u0006\u0004\b>\u0010?J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J+\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0011\u0010\f\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\tH\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J+\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0011\u0010\u0012\u001a\r\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u000b0\tH\u0016J \u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\nH\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J*\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J2\u0010!\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016J\u0018\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0016J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010-\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H\u0016J\u0018\u0010.\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00102\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00101\u001a\u000200H\u0016J\u0010\u00103\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00104\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H\u0016J\u0018\u00105\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0010\u00106\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00107\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0010\u00108\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00109\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00101\u001a\u000200H\u0016J\u0018\u0010:\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00101\u001a\u000200H\u0016J\u0010\u0010;\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010=\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010<\u001a\u000200H\u0016¨\u0006C"}, d2 = {"Lokhttp3/p;", "", "Lokhttp3/e;", "call", "Lkotlin/b2;", "callStart", "Lokhttp3/t;", "url", "proxySelectStart", "", "Ljava/net/Proxy;", "Lxh/n;", "proxies", "proxySelectEnd", "", "domainName", "dnsStart", "Ljava/net/InetAddress;", "inetAddressList", "dnsEnd", "Ljava/net/InetSocketAddress;", "inetSocketAddress", WebviewFragment.A4, "connectStart", "secureConnectStart", "Lokhttp3/Handshake;", "handshake", "secureConnectEnd", "Lokhttp3/Protocol;", SwitchDetailActivity.P, "connectEnd", "Ljava/io/IOException;", "ioe", "connectFailed", "Lokhttp3/i;", com.alipay.zoloz.android.phone.mrpc.core.f.f39665q, "connectionAcquired", "connectionReleased", "requestHeadersStart", "Lokhttp3/a0;", "request", "requestHeadersEnd", "requestBodyStart", "", "byteCount", "requestBodyEnd", "requestFailed", "responseHeadersStart", "Lokhttp3/c0;", "response", "responseHeadersEnd", "responseBodyStart", "responseBodyEnd", "responseFailed", "callEnd", "callFailed", qb.a.f138642e, "satisfactionFailure", "cacheHit", "cacheMiss", "cachedResponse", "cacheConditionalHit", "<init>", "()V", "Companion", "b", ak.aF, "okhttp"}, k = 1, mv = {1, 4, 0})
public abstract class p {

    @dl.d
    @xh.e
    public static final p NONE = new a();

    /* JADX INFO: compiled from: EventListener.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okhttp3/p$a", "Lokhttp3/p;", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a extends p {
        a() {
        }
    }

    /* JADX INFO: compiled from: EventListener.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lokhttp3/p$c;", "", "Lokhttp3/e;", "call", "Lokhttp3/p;", TopicHashtagWrapper.TYPE_CREATE, "okhttp"}, k = 1, mv = {1, 4, 0})
    public interface c {
        @dl.d
        p create(@dl.d e call);
    }

    public void cacheConditionalHit(@dl.d e call, @dl.d c0 cachedResponse) {
        kotlin.jvm.internal.f0.p(call, "call");
        kotlin.jvm.internal.f0.p(cachedResponse, "cachedResponse");
    }

    public void cacheHit(@dl.d e call, @dl.d c0 response) {
        kotlin.jvm.internal.f0.p(call, "call");
        kotlin.jvm.internal.f0.p(response, "response");
    }

    public void cacheMiss(@dl.d e call) {
        kotlin.jvm.internal.f0.p(call, "call");
    }

    public void callEnd(@dl.d e call) {
        kotlin.jvm.internal.f0.p(call, "call");
    }

    public void callFailed(@dl.d e call, @dl.d IOException ioe) {
        kotlin.jvm.internal.f0.p(call, "call");
        kotlin.jvm.internal.f0.p(ioe, "ioe");
    }

    public void callStart(@dl.d e call) {
        kotlin.jvm.internal.f0.p(call, "call");
    }

    public void canceled(@dl.d e call) {
        kotlin.jvm.internal.f0.p(call, "call");
    }

    public void connectEnd(@dl.d e call, @dl.d InetSocketAddress inetSocketAddress, @dl.d Proxy proxy, @dl.e Protocol protocol) {
        kotlin.jvm.internal.f0.p(call, "call");
        kotlin.jvm.internal.f0.p(inetSocketAddress, "inetSocketAddress");
        kotlin.jvm.internal.f0.p(proxy, "proxy");
    }

    public void connectFailed(@dl.d e call, @dl.d InetSocketAddress inetSocketAddress, @dl.d Proxy proxy, @dl.e Protocol protocol, @dl.d IOException ioe) {
        kotlin.jvm.internal.f0.p(call, "call");
        kotlin.jvm.internal.f0.p(inetSocketAddress, "inetSocketAddress");
        kotlin.jvm.internal.f0.p(proxy, "proxy");
        kotlin.jvm.internal.f0.p(ioe, "ioe");
    }

    public void connectStart(@dl.d e call, @dl.d InetSocketAddress inetSocketAddress, @dl.d Proxy proxy) {
        kotlin.jvm.internal.f0.p(call, "call");
        kotlin.jvm.internal.f0.p(inetSocketAddress, "inetSocketAddress");
        kotlin.jvm.internal.f0.p(proxy, "proxy");
    }

    public void connectionAcquired(@dl.d e call, @dl.d i connection) {
        kotlin.jvm.internal.f0.p(call, "call");
        kotlin.jvm.internal.f0.p(connection, "connection");
    }

    public void connectionReleased(@dl.d e call, @dl.d i connection) {
        kotlin.jvm.internal.f0.p(call, "call");
        kotlin.jvm.internal.f0.p(connection, "connection");
    }

    public void dnsEnd(@dl.d e call, @dl.d String domainName, @dl.d List<InetAddress> inetAddressList) {
        kotlin.jvm.internal.f0.p(call, "call");
        kotlin.jvm.internal.f0.p(domainName, "domainName");
        kotlin.jvm.internal.f0.p(inetAddressList, "inetAddressList");
    }

    public void dnsStart(@dl.d e call, @dl.d String domainName) {
        kotlin.jvm.internal.f0.p(call, "call");
        kotlin.jvm.internal.f0.p(domainName, "domainName");
    }

    public void proxySelectEnd(@dl.d e call, @dl.d t url, @dl.d List<Proxy> proxies) {
        kotlin.jvm.internal.f0.p(call, "call");
        kotlin.jvm.internal.f0.p(url, "url");
        kotlin.jvm.internal.f0.p(proxies, "proxies");
    }

    public void proxySelectStart(@dl.d e call, @dl.d t url) {
        kotlin.jvm.internal.f0.p(call, "call");
        kotlin.jvm.internal.f0.p(url, "url");
    }

    public void requestBodyEnd(@dl.d e call, long j10) {
        kotlin.jvm.internal.f0.p(call, "call");
    }

    public void requestBodyStart(@dl.d e call) {
        kotlin.jvm.internal.f0.p(call, "call");
    }

    public void requestFailed(@dl.d e call, @dl.d IOException ioe) {
        kotlin.jvm.internal.f0.p(call, "call");
        kotlin.jvm.internal.f0.p(ioe, "ioe");
    }

    public void requestHeadersEnd(@dl.d e call, @dl.d a0 request) {
        kotlin.jvm.internal.f0.p(call, "call");
        kotlin.jvm.internal.f0.p(request, "request");
    }

    public void requestHeadersStart(@dl.d e call) {
        kotlin.jvm.internal.f0.p(call, "call");
    }

    public void responseBodyEnd(@dl.d e call, long j10) {
        kotlin.jvm.internal.f0.p(call, "call");
    }

    public void responseBodyStart(@dl.d e call) {
        kotlin.jvm.internal.f0.p(call, "call");
    }

    public void responseFailed(@dl.d e call, @dl.d IOException ioe) {
        kotlin.jvm.internal.f0.p(call, "call");
        kotlin.jvm.internal.f0.p(ioe, "ioe");
    }

    public void responseHeadersEnd(@dl.d e call, @dl.d c0 response) {
        kotlin.jvm.internal.f0.p(call, "call");
        kotlin.jvm.internal.f0.p(response, "response");
    }

    public void responseHeadersStart(@dl.d e call) {
        kotlin.jvm.internal.f0.p(call, "call");
    }

    public void satisfactionFailure(@dl.d e call, @dl.d c0 response) {
        kotlin.jvm.internal.f0.p(call, "call");
        kotlin.jvm.internal.f0.p(response, "response");
    }

    public void secureConnectEnd(@dl.d e call, @dl.e Handshake handshake) {
        kotlin.jvm.internal.f0.p(call, "call");
    }

    public void secureConnectStart(@dl.d e call) {
        kotlin.jvm.internal.f0.p(call, "call");
    }
}
