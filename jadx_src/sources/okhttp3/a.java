package okhttp3;

import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.taobao.accs.utl.BaseMonitor;
import com.umeng.analytics.pro.ak;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.s0;
import okhttp3.internal.Util;

/* JADX INFO: compiled from: Address.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b&\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010M\u001a\u00020+\u0012\u0006\u0010N\u001a\u00020&\u0012\u0006\u00107\u001a\u00020\u0005\u0012\u0006\u0010:\u001a\u00020\b\u0012\b\u0010=\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010@\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010C\u001a\u0004\u0018\u00010 \u0012\u0006\u0010F\u001a\u00020\u000b\u0012\b\u0010I\u001a\u0004\u0018\u00010\u0017\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e\u0012\u0006\u0010L\u001a\u00020\u0014¢\u0006\u0004\bO\u0010PJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010!\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0004\b!\u0010\"J\u0013\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010'\u001a\u00020&H\u0016J\u0017\u0010)\u001a\u00020$2\u0006\u0010(\u001a\u00020\u0000H\u0000¢\u0006\u0004\b)\u0010*J\b\u0010,\u001a\u00020+H\u0016R\u0017\u0010/\u001a\u00020\u00028G¢\u0006\f\n\u0004\b!\u0010-\u001a\u0004\b.\u0010\u0004R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8G¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\b1\u0010\u0011R\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e8G¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b3\u0010\u0011R\u0017\u00107\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u001e\u00105\u001a\u0004\b6\u0010\u0007R\u0017\u0010:\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\b9\u0010\nR\u0019\u0010=\u001a\u0004\u0018\u00010\u001a8\u0007¢\u0006\f\n\u0004\b\u0018\u0010;\u001a\u0004\b<\u0010\u001cR\u0019\u0010@\u001a\u0004\u0018\u00010\u001d8\u0007¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010\u001fR\u0019\u0010C\u001a\u0004\u0018\u00010 8\u0007¢\u0006\f\n\u0004\b\u0015\u0010A\u001a\u0004\bB\u0010\"R\u0017\u0010F\u001a\u00020\u000b8\u0007¢\u0006\f\n\u0004\b\t\u0010D\u001a\u0004\bE\u0010\rR\u0019\u0010I\u001a\u0004\u0018\u00010\u00178\u0007¢\u0006\f\n\u0004\b\u001b\u0010G\u001a\u0004\bH\u0010\u0019R\u0017\u0010L\u001a\u00020\u00148\u0007¢\u0006\f\n\u0004\b\u0003\u0010J\u001a\u0004\bK\u0010\u0016¨\u0006Q"}, d2 = {"Lokhttp3/a;", "", "Lokhttp3/t;", "k", "()Lokhttp3/t;", "Lokhttp3/o;", ak.aF, "()Lokhttp3/o;", "Ljavax/net/SocketFactory;", "i", "()Ljavax/net/SocketFactory;", "Lokhttp3/b;", "g", "()Lokhttp3/b;", "", "Lokhttp3/Protocol;", "e", "()Ljava/util/List;", "Lokhttp3/k;", "b", "Ljava/net/ProxySelector;", RXScreenCaptureService.KEY_HEIGHT, "()Ljava/net/ProxySelector;", "Ljava/net/Proxy;", "f", "()Ljava/net/Proxy;", "Ljavax/net/ssl/SSLSocketFactory;", "j", "()Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/HostnameVerifier;", "d", "()Ljavax/net/ssl/HostnameVerifier;", "Lokhttp3/CertificatePinner;", ak.av, "()Lokhttp3/CertificatePinner;", "other", "", "equals", "", "hashCode", "that", "o", "(Lokhttp3/a;)Z", "", "toString", "Lokhttp3/t;", RXScreenCaptureService.KEY_WIDTH, "url", "Ljava/util/List;", "q", "protocols", "m", "connectionSpecs", "Lokhttp3/o;", "n", BaseMonitor.COUNT_POINT_DNS, "Ljavax/net/SocketFactory;", ak.aG, "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "v", "sslSocketFactory", "Ljavax/net/ssl/HostnameVerifier;", "p", "hostnameVerifier", "Lokhttp3/CertificatePinner;", "l", "certificatePinner", "Lokhttp3/b;", ak.aB, "proxyAuthenticator", "Ljava/net/Proxy;", "r", WebviewFragment.A4, "Ljava/net/ProxySelector;", "t", "proxySelector", "uriHost", "uriPort", "<init>", "(Ljava/lang/String;ILokhttp3/o;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lokhttp3/CertificatePinner;Lokhttp3/b;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final t url;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<Protocol> protocols;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<k> connectionSpecs;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final o dns;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final SocketFactory socketFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final SSLSocketFactory sslSocketFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final HostnameVerifier hostnameVerifier;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final CertificatePinner certificatePinner;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final b proxyAuthenticator;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final Proxy proxy;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final ProxySelector proxySelector;

    public a(@dl.d String uriHost, int i10, @dl.d o dns, @dl.d SocketFactory socketFactory, @dl.e SSLSocketFactory sSLSocketFactory, @dl.e HostnameVerifier hostnameVerifier, @dl.e CertificatePinner certificatePinner, @dl.d b proxyAuthenticator, @dl.e Proxy proxy, @dl.d List<? extends Protocol> protocols, @dl.d List<k> connectionSpecs, @dl.d ProxySelector proxySelector) {
        kotlin.jvm.internal.f0.p(uriHost, "uriHost");
        kotlin.jvm.internal.f0.p(dns, "dns");
        kotlin.jvm.internal.f0.p(socketFactory, "socketFactory");
        kotlin.jvm.internal.f0.p(proxyAuthenticator, "proxyAuthenticator");
        kotlin.jvm.internal.f0.p(protocols, "protocols");
        kotlin.jvm.internal.f0.p(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.f0.p(proxySelector, "proxySelector");
        this.dns = dns;
        this.socketFactory = socketFactory;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
        this.certificatePinner = certificatePinner;
        this.proxyAuthenticator = proxyAuthenticator;
        this.proxy = proxy;
        this.proxySelector = proxySelector;
        this.url = new t.a().M(sSLSocketFactory != null ? "https" : "http").x(uriHost).D(i10).h();
        this.protocols = Util.toImmutableList(protocols);
        this.connectionSpecs = Util.toImmutableList(connectionSpecs);
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "certificatePinner", imports = {}))
    @xh.h(name = "-deprecated_certificatePinner")
    @dl.e
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CertificatePinner getCertificatePinner() {
        return this.certificatePinner;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "connectionSpecs", imports = {}))
    @xh.h(name = "-deprecated_connectionSpecs")
    public final List<k> b() {
        return this.connectionSpecs;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = BaseMonitor.COUNT_POINT_DNS, imports = {}))
    @xh.h(name = "-deprecated_dns")
    /* JADX INFO: renamed from: c, reason: from getter */
    public final o getDns() {
        return this.dns;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "hostnameVerifier", imports = {}))
    @xh.h(name = "-deprecated_hostnameVerifier")
    @dl.e
    /* JADX INFO: renamed from: d, reason: from getter */
    public final HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "protocols", imports = {}))
    @xh.h(name = "-deprecated_protocols")
    public final List<Protocol> e() {
        return this.protocols;
    }

    public boolean equals(@dl.e Object other) {
        if (other instanceof a) {
            a aVar = (a) other;
            if (kotlin.jvm.internal.f0.g(this.url, aVar.url) && o(aVar)) {
                return true;
            }
        }
        return false;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = WebviewFragment.A4, imports = {}))
    @xh.h(name = "-deprecated_proxy")
    @dl.e
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "proxyAuthenticator", imports = {}))
    @xh.h(name = "-deprecated_proxyAuthenticator")
    /* JADX INFO: renamed from: g, reason: from getter */
    public final b getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "proxySelector", imports = {}))
    @xh.h(name = "-deprecated_proxySelector")
    /* JADX INFO: renamed from: h, reason: from getter */
    public final ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    public int hashCode() {
        return ((((((((((((((((((bb.c.b.f30674h7 + this.url.hashCode()) * 31) + this.dns.hashCode()) * 31) + this.proxyAuthenticator.hashCode()) * 31) + this.protocols.hashCode()) * 31) + this.connectionSpecs.hashCode()) * 31) + this.proxySelector.hashCode()) * 31) + Objects.hashCode(this.proxy)) * 31) + Objects.hashCode(this.sslSocketFactory)) * 31) + Objects.hashCode(this.hostnameVerifier)) * 31) + Objects.hashCode(this.certificatePinner);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "socketFactory", imports = {}))
    @xh.h(name = "-deprecated_socketFactory")
    /* JADX INFO: renamed from: i, reason: from getter */
    public final SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "sslSocketFactory", imports = {}))
    @xh.h(name = "-deprecated_sslSocketFactory")
    @dl.e
    /* JADX INFO: renamed from: j, reason: from getter */
    public final SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "url", imports = {}))
    @xh.h(name = "-deprecated_url")
    /* JADX INFO: renamed from: k, reason: from getter */
    public final t getUrl() {
        return this.url;
    }

    @xh.h(name = "certificatePinner")
    @dl.e
    public final CertificatePinner l() {
        return this.certificatePinner;
    }

    @dl.d
    @xh.h(name = "connectionSpecs")
    public final List<k> m() {
        return this.connectionSpecs;
    }

    @dl.d
    @xh.h(name = BaseMonitor.COUNT_POINT_DNS)
    public final o n() {
        return this.dns;
    }

    public final boolean o(@dl.d a that) {
        kotlin.jvm.internal.f0.p(that, "that");
        return kotlin.jvm.internal.f0.g(this.dns, that.dns) && kotlin.jvm.internal.f0.g(this.proxyAuthenticator, that.proxyAuthenticator) && kotlin.jvm.internal.f0.g(this.protocols, that.protocols) && kotlin.jvm.internal.f0.g(this.connectionSpecs, that.connectionSpecs) && kotlin.jvm.internal.f0.g(this.proxySelector, that.proxySelector) && kotlin.jvm.internal.f0.g(this.proxy, that.proxy) && kotlin.jvm.internal.f0.g(this.sslSocketFactory, that.sslSocketFactory) && kotlin.jvm.internal.f0.g(this.hostnameVerifier, that.hostnameVerifier) && kotlin.jvm.internal.f0.g(this.certificatePinner, that.certificatePinner) && this.url.getCom.max.xiaoheihe.module.voice.HeyboxMicFragment.y java.lang.String() == that.url.getCom.max.xiaoheihe.module.voice.HeyboxMicFragment.y java.lang.String();
    }

    @xh.h(name = "hostnameVerifier")
    @dl.e
    public final HostnameVerifier p() {
        return this.hostnameVerifier;
    }

    @dl.d
    @xh.h(name = "protocols")
    public final List<Protocol> q() {
        return this.protocols;
    }

    @xh.h(name = WebviewFragment.A4)
    @dl.e
    public final Proxy r() {
        return this.proxy;
    }

    @dl.d
    @xh.h(name = "proxyAuthenticator")
    public final b s() {
        return this.proxyAuthenticator;
    }

    @dl.d
    @xh.h(name = "proxySelector")
    public final ProxySelector t() {
        return this.proxySelector;
    }

    @dl.d
    public String toString() {
        StringBuilder sb2;
        Object obj;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Address{");
        sb3.append(this.url.getHost());
        sb3.append(':');
        sb3.append(this.url.getCom.max.xiaoheihe.module.voice.HeyboxMicFragment.y java.lang.String());
        sb3.append(", ");
        if (this.proxy != null) {
            sb2 = new StringBuilder();
            sb2.append("proxy=");
            obj = this.proxy;
        } else {
            sb2 = new StringBuilder();
            sb2.append("proxySelector=");
            obj = this.proxySelector;
        }
        sb2.append(obj);
        sb3.append(sb2.toString());
        sb3.append(z5.g.f141884d);
        return sb3.toString();
    }

    @dl.d
    @xh.h(name = "socketFactory")
    public final SocketFactory u() {
        return this.socketFactory;
    }

    @xh.h(name = "sslSocketFactory")
    @dl.e
    public final SSLSocketFactory v() {
        return this.sslSocketFactory;
    }

    @dl.d
    @xh.h(name = "url")
    public final t w() {
        return this.url;
    }
}
