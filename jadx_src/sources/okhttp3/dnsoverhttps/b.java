package okhttp3.dnsoverhttps;

import ad.e;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.taobao.accs.utl.BaseMonitor;
import com.umeng.analytics.pro.ak;
import dl.d;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import okhttp3.Protocol;
import okhttp3.a0;
import okhttp3.b0;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.f;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okhttp3.o;
import okhttp3.t;
import okhttp3.v;
import okhttp3.z;
import okio.ByteString;
import xh.h;

/* JADX INFO: compiled from: DnsOverHttps.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u0000 \u00162\u00020\u0001:\u000256B9\b\u0000\u0012\u0006\u0010\"\u001a\u00020\u001e\u0012\u0006\u0010'\u001a\u00020#\u0012\u0006\u0010,\u001a\u00020(\u0012\u0006\u0010.\u001a\u00020(\u0012\u0006\u00100\u001a\u00020(\u0012\u0006\u00102\u001a\u00020(¢\u0006\u0004\b3\u00104J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002JF\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0010\u0010\r\u001a\f\u0012\b\u0012\u00060\u000bj\u0002`\f0\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J>\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0010\u0010\r\u001a\f\u0012\b\u0012\u00060\u000bj\u0002`\f0\u0007H\u0002J8\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0010\u0010\r\u001a\f\u0012\b\u0012\u00060\u000bj\u0002`\f0\u0007H\u0002J(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\r\u001a\f\u0012\b\u0012\u00060\u000bj\u0002`\f0\u0004H\u0002J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0018\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\"\u001a\u00020\u001e8\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010'\u001a\u00020#8\u0007¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010,\u001a\u00020(8\u0007¢\u0006\f\n\u0004\b \u0010)\u001a\u0004\b*\u0010+R\u0017\u0010.\u001a\u00020(8\u0007¢\u0006\f\n\u0004\b\u0013\u0010)\u001a\u0004\b-\u0010+R\u0017\u00100\u001a\u00020(8\u0007¢\u0006\f\n\u0004\b\u001a\u0010)\u001a\u0004\b/\u0010+R\u0017\u00102\u001a\u00020(8\u0007¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b1\u0010+¨\u00067"}, d2 = {"Lokhttp3/dnsoverhttps/b;", "Lokhttp3/o;", "", "hostname", "", "Ljava/net/InetAddress;", "i", "", "Lokhttp3/e;", "networkRequests", "results", "Ljava/lang/Exception;", "Lkotlin/Exception;", "failures", "", "type", "Lkotlin/b2;", "d", "responses", "f", "Lokhttp3/c0;", "response", "k", "o", "Lokhttp3/a0;", "request", "g", "l", ak.aF, "lookup", "Lokhttp3/z;", "Lokhttp3/z;", "e", "()Lokhttp3/z;", "client", "Lokhttp3/t;", "Lokhttp3/t;", "p", "()Lokhttp3/t;", "url", "", "Z", RXScreenCaptureService.KEY_HEIGHT, "()Z", "includeIPv6", "j", e.f1248a, "m", "resolvePrivateAddresses", "n", "resolvePublicAddresses", "<init>", "(Lokhttp3/z;Lokhttp3/t;ZZZZ)V", ak.av, "b", "okhttp-dnsoverhttps"}, k = 1, mv = {1, 4, 0})
public final class b implements o {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f132485j = 65536;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d
    private final z client;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d
    private final t url;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean includeIPv6;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean post;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean resolvePrivateAddresses;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean resolvePublicAddresses;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @d
    private static final v f132484i = v.INSTANCE.c("application/dns-message");

    /* JADX INFO: compiled from: DnsOverHttps.kt */
    @Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b<\u0010=J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\nJ\u0016\u0010\u0016\u001a\u00020\u00002\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013J!\u0010\u0018\u001a\u00020\u00002\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0017\"\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\r\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010'\u001a\u0004\b,\u0010)\"\u0004\b-\u0010+R\"\u0010\u001b\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u00104\u001a\u0004\b.\u00105\"\u0004\b6\u00107R\"\u0010\u000f\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010'\u001a\u0004\b8\u0010)\"\u0004\b9\u0010+R\"\u0010\u0011\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b:\u0010)\"\u0004\b;\u0010+¨\u0006>"}, d2 = {"Lokhttp3/dnsoverhttps/b$a;", "", "Lokhttp3/dnsoverhttps/b;", ak.aF, "Lokhttp3/z;", "client", "d", "Lokhttp3/t;", "url", ak.aD, "", "includeIPv6", "m", e.f1248a, "n", "resolvePrivateAddresses", "o", "resolvePublicAddresses", "p", "", "Ljava/net/InetAddress;", "bootstrapDnsHosts", ak.av, "", "b", "([Ljava/net/InetAddress;)Lokhttp3/dnsoverhttps/b$a;", "Lokhttp3/o;", "systemDns", "y", "Lokhttp3/z;", "f", "()Lokhttp3/z;", "r", "(Lokhttp3/z;)V", "Lokhttp3/t;", "l", "()Lokhttp3/t;", "x", "(Lokhttp3/t;)V", "Z", "g", "()Z", ak.aB, "(Z)V", RXScreenCaptureService.KEY_HEIGHT, "t", "e", "Lokhttp3/o;", "k", "()Lokhttp3/o;", RXScreenCaptureService.KEY_WIDTH, "(Lokhttp3/o;)V", "Ljava/util/List;", "()Ljava/util/List;", "q", "(Ljava/util/List;)V", "i", ak.aG, "j", "v", "<init>", "()V", "okhttp-dnsoverhttps"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private z client;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private t url;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean post;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private List<? extends InetAddress> bootstrapDnsHosts;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private boolean resolvePrivateAddresses;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean includeIPv6 = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @d
        private o systemDns = o.f132626a;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean resolvePublicAddresses = true;

        @d
        public final a a(@dl.e List<? extends InetAddress> bootstrapDnsHosts) {
            this.bootstrapDnsHosts = bootstrapDnsHosts;
            return this;
        }

        @d
        public final a b(@d InetAddress... bootstrapDnsHosts) {
            f0.p(bootstrapDnsHosts, "bootstrapDnsHosts");
            return a(ArraysKt___ArraysKt.kz(bootstrapDnsHosts));
        }

        @d
        public final b c() {
            z zVar = this.client;
            if (zVar == null) {
                throw new NullPointerException("client not set");
            }
            z zVarF = zVar.e0().q(b.INSTANCE.b(this)).f();
            t tVar = this.url;
            if (tVar != null) {
                return new b(zVarF, tVar, this.includeIPv6, this.post, this.resolvePrivateAddresses, this.resolvePublicAddresses);
            }
            throw new IllegalStateException("url not set".toString());
        }

        @d
        public final a d(@d z client) {
            f0.p(client, "client");
            this.client = client;
            return this;
        }

        @dl.e
        public final List<InetAddress> e() {
            return this.bootstrapDnsHosts;
        }

        @dl.e
        /* JADX INFO: renamed from: f, reason: from getter */
        public final z getClient() {
            return this.client;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getIncludeIPv6() {
            return this.includeIPv6;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getPost() {
            return this.post;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getResolvePrivateAddresses() {
            return this.resolvePrivateAddresses;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getResolvePublicAddresses() {
            return this.resolvePublicAddresses;
        }

        @d
        /* JADX INFO: renamed from: k, reason: from getter */
        public final o getSystemDns() {
            return this.systemDns;
        }

        @dl.e
        /* JADX INFO: renamed from: l, reason: from getter */
        public final t getUrl() {
            return this.url;
        }

        @d
        public final a m(boolean includeIPv6) {
            this.includeIPv6 = includeIPv6;
            return this;
        }

        @d
        public final a n(boolean post) {
            this.post = post;
            return this;
        }

        @d
        public final a o(boolean resolvePrivateAddresses) {
            this.resolvePrivateAddresses = resolvePrivateAddresses;
            return this;
        }

        @d
        public final a p(boolean resolvePublicAddresses) {
            this.resolvePublicAddresses = resolvePublicAddresses;
            return this;
        }

        public final void q(@dl.e List<? extends InetAddress> list) {
            this.bootstrapDnsHosts = list;
        }

        public final void r(@dl.e z zVar) {
            this.client = zVar;
        }

        public final void s(boolean z10) {
            this.includeIPv6 = z10;
        }

        public final void t(boolean z10) {
            this.post = z10;
        }

        public final void u(boolean z10) {
            this.resolvePrivateAddresses = z10;
        }

        public final void v(boolean z10) {
            this.resolvePublicAddresses = z10;
        }

        public final void w(@d o oVar) {
            f0.p(oVar, "<set-?>");
            this.systemDns = oVar;
        }

        public final void x(@dl.e t tVar) {
            this.url = tVar;
        }

        @d
        public final a y(@d o systemDns) {
            f0.p(systemDns, "systemDns");
            this.systemDns = systemDns;
            return this;
        }

        @d
        public final a z(@d t url) {
            f0.p(url, "url");
            this.url = url;
            return this;
        }
    }

    /* JADX INFO: renamed from: okhttp3.dnsoverhttps.b$b, reason: collision with other inner class name and from kotlin metadata */
    /* JADX INFO: compiled from: DnsOverHttps.kt */
    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lokhttp3/dnsoverhttps/b$b;", "", "Lokhttp3/dnsoverhttps/b$a;", "builder", "Lokhttp3/o;", "b", "", "host", "", "d", "(Ljava/lang/String;)Z", "Lokhttp3/v;", "DNS_MESSAGE", "Lokhttp3/v;", ak.aF, "()Lokhttp3/v;", "", "MAX_RESPONSE_SIZE", "I", "<init>", "()V", "okhttp-dnsoverhttps"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final o b(a builder) {
            List<InetAddress> listE = builder.e();
            if (listE == null) {
                return builder.getSystemDns();
            }
            t url = builder.getUrl();
            f0.m(url);
            return new okhttp3.dnsoverhttps.a(url.getHost(), listE);
        }

        @d
        public final v c() {
            return b.f132484i;
        }

        public final boolean d(@d String host) {
            f0.p(host, "host");
            return PublicSuffixDatabase.INSTANCE.get().getEffectiveTldPlusOne(host) == null;
        }
    }

    /* JADX INFO: compiled from: DnsOverHttps.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"okhttp3/dnsoverhttps/b$c", "Lokhttp3/f;", "Lokhttp3/e;", "call", "Ljava/io/IOException;", "e", "Lkotlin/b2;", "onFailure", "Lokhttp3/c0;", "response", "onResponse", "okhttp-dnsoverhttps"}, k = 1, mv = {1, 4, 0})
    public static final class c implements f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f132502c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f132503d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f132504e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f132505f;

        c(List list, CountDownLatch countDownLatch, String str, List list2) {
            this.f132502c = list;
            this.f132503d = countDownLatch;
            this.f132504e = str;
            this.f132505f = list2;
        }

        @Override // okhttp3.f
        public void onFailure(@d okhttp3.e call, @d IOException e10) {
            f0.p(call, "call");
            f0.p(e10, "e");
            synchronized (this.f132502c) {
                this.f132502c.add(e10);
            }
            this.f132503d.countDown();
        }

        @Override // okhttp3.f
        public void onResponse(@d okhttp3.e call, @d c0 response) {
            f0.p(call, "call");
            f0.p(response, "response");
            b.this.k(response, this.f132504e, this.f132505f, this.f132502c);
            this.f132503d.countDown();
        }
    }

    public b(@d z client, @d t url, boolean z10, boolean z11, boolean z12, boolean z13) {
        f0.p(client, "client");
        f0.p(url, "url");
        this.client = client;
        this.url = url;
        this.includeIPv6 = z10;
        this.post = z11;
        this.resolvePrivateAddresses = z12;
        this.resolvePublicAddresses = z13;
    }

    private final a0 c(String hostname, int type) {
        a0.a aVar = new a0.a();
        v vVar = f132484i;
        a0.a aVarN = aVar.n("Accept", vVar.getMediaType());
        ByteString byteStringB = okhttp3.dnsoverhttps.c.f132512g.b(hostname, type);
        if (this.post) {
            aVarN.D(this.url).r(b0.INSTANCE.i(byteStringB, vVar));
        } else {
            aVarN.D(this.url.H().g(BaseMonitor.COUNT_POINT_DNS, kotlin.text.u.l2(byteStringB.base64Url(), ContainerUtils.KEY_VALUE_DELIMITER, "", false, 4, null)).h());
        }
        return aVarN.b();
    }

    private final void d(String str, List<okhttp3.e> list, List<InetAddress> list2, List<Exception> list3, int i10) {
        a0 a0VarC = c(str, i10);
        c0 c0VarG = g(a0VarC);
        if (c0VarG != null) {
            k(c0VarG, str, list2, list3);
        } else {
            list.add(this.client.a(a0VarC));
        }
    }

    private final void f(String str, List<? extends okhttp3.e> list, List<InetAddress> list2, List<Exception> list3) {
        CountDownLatch countDownLatch = new CountDownLatch(list.size());
        Iterator<? extends okhttp3.e> it = list.iterator();
        while (it.hasNext()) {
            it.next().enqueue(new c(list3, countDownLatch, str, list2));
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            list3.add(e10);
        }
    }

    private final c0 g(a0 request) {
        if (this.post || this.client.getCache() == null) {
            return null;
        }
        try {
            c0 c0VarExecute = this.client.a(request.n().c(new okhttp3.d.a().j().a()).b()).execute();
            if (c0VarExecute.x() != 504) {
                return c0VarExecute;
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    private final List<InetAddress> i(String hostname) throws UnknownHostException {
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(2);
        ArrayList arrayList3 = new ArrayList(5);
        d(hostname, arrayList, arrayList3, arrayList2, 1);
        if (this.includeIPv6) {
            d(hostname, arrayList, arrayList3, arrayList2, 28);
        }
        f(hostname, arrayList, arrayList3, arrayList2);
        return arrayList3.isEmpty() ^ true ? arrayList3 : o(hostname, arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(c0 c0Var, String str, List<InetAddress> list, List<Exception> list2) {
        try {
            List<InetAddress> listL = l(str, c0Var);
            synchronized (list) {
                list.addAll(listL);
            }
        } catch (Exception e10) {
            synchronized (list2) {
                list2.add(e10);
            }
        }
    }

    private final List<InetAddress> l(String hostname, c0 response) throws Exception {
        if (response.s() == null && response.getCom.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity.P java.lang.String() != Protocol.HTTP_2) {
            Platform.log$default(Platform.INSTANCE.get(), "Incorrect protocol: " + response.getCom.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity.P java.lang.String(), 5, null, 4, null);
        }
        try {
            if (!response.c1()) {
                throw new IOException("response: " + response.x() + " " + response.getMessage());
            }
            d0 d0VarQ = response.q();
            f0.m(d0VarQ);
            if (d0VarQ.getContentLength() <= 65536) {
                List<InetAddress> listA = okhttp3.dnsoverhttps.c.f132512g.a(hostname, d0VarQ.getBodySource().readByteString());
                kotlin.io.b.a(response, null);
                return listA;
            }
            throw new IOException("response size exceeds limit (65536 bytes): " + d0VarQ.getContentLength() + " bytes");
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.b.a(response, th2);
                throw th3;
            }
        }
    }

    private final List<InetAddress> o(String hostname, List<? extends Exception> failures) throws Exception {
        if (failures.isEmpty()) {
            throw new UnknownHostException(hostname);
        }
        Exception exc = failures.get(0);
        if (exc instanceof UnknownHostException) {
            throw exc;
        }
        UnknownHostException unknownHostException = new UnknownHostException(hostname);
        unknownHostException.initCause(exc);
        int size = failures.size();
        for (int i10 = 1; i10 < size; i10++) {
            kotlin.o.a(unknownHostException, failures.get(i10));
        }
        throw unknownHostException;
    }

    @d
    @h(name = "client")
    /* JADX INFO: renamed from: e, reason: from getter */
    public final z getClient() {
        return this.client;
    }

    @h(name = "includeIPv6")
    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIncludeIPv6() {
        return this.includeIPv6;
    }

    @h(name = e.f1248a)
    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getPost() {
        return this.post;
    }

    @Override // okhttp3.o
    @d
    public List<InetAddress> lookup(@d String hostname) throws UnknownHostException {
        f0.p(hostname, "hostname");
        if (!this.resolvePrivateAddresses || !this.resolvePublicAddresses) {
            boolean zD = INSTANCE.d(hostname);
            if (zD && !this.resolvePrivateAddresses) {
                throw new UnknownHostException("private hosts not resolved");
            }
            if (!zD && !this.resolvePublicAddresses) {
                throw new UnknownHostException("public hosts not resolved");
            }
        }
        return i(hostname);
    }

    @h(name = "resolvePrivateAddresses")
    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getResolvePrivateAddresses() {
        return this.resolvePrivateAddresses;
    }

    @h(name = "resolvePublicAddresses")
    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getResolvePublicAddresses() {
        return this.resolvePublicAddresses;
    }

    @d
    @h(name = "url")
    /* JADX INFO: renamed from: p, reason: from getter */
    public final t getUrl() {
        return this.url;
    }
}
