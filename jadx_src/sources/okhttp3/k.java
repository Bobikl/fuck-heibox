package okhttp3;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.s0;
import okhttp3.internal.Util;

/* JADX INFO: compiled from: ConnectionSpec.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u000b\u0018\u0000 \u001d2\u00020\u0001:\u0002\t\rB9\b\u0000\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001f\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001f¢\u0006\u0004\b(\u0010)J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0017\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0002J\u0013\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016R\u0017\u0010\u001c\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\u001e\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001d\u0010\u000eR\u001c\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 R\u001c\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u0019\u0010%\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078G¢\u0006\u0006\u001a\u0004\b$\u0010\nR\u0019\u0010'\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00078G¢\u0006\u0006\u001a\u0004\b&\u0010\n¨\u0006*"}, d2 = {"Lokhttp3/k;", "", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "isFallback", "j", "", "Lokhttp3/h;", ak.av, "()Ljava/util/List;", "Lokhttp3/TlsVersion;", ak.aF, "b", "()Z", "Lkotlin/b2;", "f", "(Ljavax/net/ssl/SSLSocket;Z)V", "socket", RXScreenCaptureService.KEY_HEIGHT, "other", "equals", "", "hashCode", "", "toString", "Z", "i", "isTls", "k", "supportsTlsExtensions", "", "[Ljava/lang/String;", "cipherSuitesAsString", "d", "tlsVersionsAsString", "g", "cipherSuites", "l", "tlsVersions", "<init>", "(ZZ[Ljava/lang/String;[Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final h[] f132591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final h[] f132592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final k f132593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final k f132594h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final k f132595i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final k f132596j;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isTls;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean supportsTlsExtensions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String[] cipherSuitesAsString;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String[] tlsVersionsAsString;

    /* JADX INFO: compiled from: ConnectionSpec.kt */
    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b%\u0010\u001aB\u0011\b\u0016\u0012\u0006\u0010&\u001a\u00020\u0014¢\u0006\u0004\b%\u0010'J\u0006\u0010\u0002\u001a\u00020\u0000J!\u0010\u0006\u001a\u00020\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\t\u001a\u00020\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0003\"\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u000b\u001a\u00020\u0000J!\u0010\u000e\u001a\u00020\u00002\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0003\"\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\u00002\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0003\"\u00020\b¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\u0006\u0010\u0015\u001a\u00020\u0014R\"\u0010\u001b\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\"\u0010\u0012\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0016\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001a¨\u0006("}, d2 = {"Lokhttp3/k$a;", "", ak.av, "", "Lokhttp3/h;", "cipherSuites", "e", "([Lokhttp3/h;)Lokhttp3/k$a;", "", "d", "([Ljava/lang/String;)Lokhttp3/k$a;", "b", "Lokhttp3/TlsVersion;", "tlsVersions", "p", "([Lokhttp3/TlsVersion;)Lokhttp3/k$a;", "o", "", "supportsTlsExtensions", "n", "Lokhttp3/k;", ak.aF, "Z", RXScreenCaptureService.KEY_HEIGHT, "()Z", "l", "(Z)V", "tls", "[Ljava/lang/String;", "f", "()[Ljava/lang/String;", "j", "([Ljava/lang/String;)V", "i", "m", "g", "k", "<init>", "connectionSpec", "(Lokhttp3/k;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean tls;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private String[] cipherSuites;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private String[] tlsVersions;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean supportsTlsExtensions;

        public a(@dl.d k connectionSpec) {
            kotlin.jvm.internal.f0.p(connectionSpec, "connectionSpec");
            this.tls = connectionSpec.getIsTls();
            this.cipherSuites = connectionSpec.cipherSuitesAsString;
            this.tlsVersions = connectionSpec.tlsVersionsAsString;
            this.supportsTlsExtensions = connectionSpec.k();
        }

        public a(boolean z10) {
            this.tls = z10;
        }

        @dl.d
        public final a a() {
            if (!this.tls) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            this.cipherSuites = null;
            return this;
        }

        @dl.d
        public final a b() {
            if (!this.tls) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            this.tlsVersions = null;
            return this;
        }

        @dl.d
        public final k c() {
            return new k(this.tls, this.supportsTlsExtensions, this.cipherSuites, this.tlsVersions);
        }

        @dl.d
        public final a d(@dl.d String... cipherSuites) throws CloneNotSupportedException {
            kotlin.jvm.internal.f0.p(cipherSuites, "cipherSuites");
            if (!this.tls) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (!(!(cipherSuites.length == 0))) {
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            Object objClone = cipherSuites.clone();
            if (objClone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            this.cipherSuites = (String[]) objClone;
            return this;
        }

        @dl.d
        public final a e(@dl.d h... cipherSuites) {
            kotlin.jvm.internal.f0.p(cipherSuites, "cipherSuites");
            if (!this.tls) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (h hVar : cipherSuites) {
                arrayList.add(hVar.e());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            return d((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @dl.e
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String[] getCipherSuites() {
            return this.cipherSuites;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getSupportsTlsExtensions() {
            return this.supportsTlsExtensions;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getTls() {
            return this.tls;
        }

        @dl.e
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String[] getTlsVersions() {
            return this.tlsVersions;
        }

        public final void j(@dl.e String[] strArr) {
            this.cipherSuites = strArr;
        }

        public final void k(boolean z10) {
            this.supportsTlsExtensions = z10;
        }

        public final void l(boolean z10) {
            this.tls = z10;
        }

        public final void m(@dl.e String[] strArr) {
            this.tlsVersions = strArr;
        }

        @dl.d
        @kotlin.k(message = "since OkHttp 3.13 all TLS-connections are expected to support TLS extensions.\nIn a future release setting this to true will be unnecessary and setting it to false\nwill have no effect.")
        public final a n(boolean supportsTlsExtensions) {
            if (!this.tls) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            this.supportsTlsExtensions = supportsTlsExtensions;
            return this;
        }

        @dl.d
        public final a o(@dl.d String... tlsVersions) throws CloneNotSupportedException {
            kotlin.jvm.internal.f0.p(tlsVersions, "tlsVersions");
            if (!this.tls) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (!(!(tlsVersions.length == 0))) {
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            Object objClone = tlsVersions.clone();
            if (objClone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            this.tlsVersions = (String[]) objClone;
            return this;
        }

        @dl.d
        public final a p(@dl.d TlsVersion... tlsVersions) {
            kotlin.jvm.internal.f0.p(tlsVersions, "tlsVersions");
            if (!this.tls) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (TlsVersion tlsVersion : tlsVersions) {
                arrayList.add(tlsVersion.javaName());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            return o((String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    static {
        h hVar = h.f132558n1;
        h hVar2 = h.f132561o1;
        h hVar3 = h.f132564p1;
        h hVar4 = h.Z0;
        h hVar5 = h.f132528d1;
        h hVar6 = h.f132519a1;
        h hVar7 = h.f132531e1;
        h hVar8 = h.f132549k1;
        h hVar9 = h.f132546j1;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9};
        f132591e = hVarArr;
        h[] hVarArr2 = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, h.K0, h.L0, h.f132542i0, h.f132545j0, h.G, h.K, h.f132547k};
        f132592f = hVarArr2;
        a aVarE = new a(true).e((h[]) Arrays.copyOf(hVarArr, hVarArr.length));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        f132593g = aVarE.p(tlsVersion, tlsVersion2).n(true).c();
        f132594h = new a(true).e((h[]) Arrays.copyOf(hVarArr2, hVarArr2.length)).p(tlsVersion, tlsVersion2).n(true).c();
        f132595i = new a(true).e((h[]) Arrays.copyOf(hVarArr2, hVarArr2.length)).p(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).n(true).c();
        f132596j = new a(false).c();
    }

    public k(boolean z10, boolean z11, @dl.e String[] strArr, @dl.e String[] strArr2) {
        this.isTls = z10;
        this.supportsTlsExtensions = z11;
        this.cipherSuitesAsString = strArr;
        this.tlsVersionsAsString = strArr2;
    }

    private final k j(SSLSocket sslSocket, boolean isFallback) throws CloneNotSupportedException {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        if (this.cipherSuitesAsString != null) {
            String[] enabledCipherSuites = sslSocket.getEnabledCipherSuites();
            kotlin.jvm.internal.f0.o(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = Util.intersect(enabledCipherSuites, this.cipherSuitesAsString, h.INSTANCE.c());
        } else {
            cipherSuitesIntersection = sslSocket.getEnabledCipherSuites();
        }
        if (this.tlsVersionsAsString != null) {
            String[] enabledProtocols = sslSocket.getEnabledProtocols();
            kotlin.jvm.internal.f0.o(enabledProtocols, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = Util.intersect(enabledProtocols, this.tlsVersionsAsString, kotlin.comparisons.g.q());
        } else {
            tlsVersionsIntersection = sslSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        kotlin.jvm.internal.f0.o(supportedCipherSuites, "supportedCipherSuites");
        int iIndexOf = Util.indexOf(supportedCipherSuites, "TLS_FALLBACK_SCSV", h.INSTANCE.c());
        if (isFallback && iIndexOf != -1) {
            kotlin.jvm.internal.f0.o(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[iIndexOf];
            kotlin.jvm.internal.f0.o(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = Util.concat(cipherSuitesIntersection, str);
        }
        a aVar = new a(this);
        kotlin.jvm.internal.f0.o(cipherSuitesIntersection, "cipherSuitesIntersection");
        a aVarD = aVar.d((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        kotlin.jvm.internal.f0.o(tlsVersionsIntersection, "tlsVersionsIntersection");
        return aVarD.o((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).c();
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "cipherSuites", imports = {}))
    @xh.h(name = "-deprecated_cipherSuites")
    @dl.e
    public final List<h> a() {
        return g();
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "supportsTlsExtensions", imports = {}))
    @xh.h(name = "-deprecated_supportsTlsExtensions")
    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getSupportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "tlsVersions", imports = {}))
    @xh.h(name = "-deprecated_tlsVersions")
    @dl.e
    public final List<TlsVersion> c() {
        return l();
    }

    public boolean equals(@dl.e Object other) {
        if (!(other instanceof k)) {
            return false;
        }
        if (other == this) {
            return true;
        }
        boolean z10 = this.isTls;
        k kVar = (k) other;
        if (z10 != kVar.isTls) {
            return false;
        }
        return !z10 || (Arrays.equals(this.cipherSuitesAsString, kVar.cipherSuitesAsString) && Arrays.equals(this.tlsVersionsAsString, kVar.tlsVersionsAsString) && this.supportsTlsExtensions == kVar.supportsTlsExtensions);
    }

    public final void f(@dl.d SSLSocket sslSocket, boolean isFallback) throws CloneNotSupportedException {
        kotlin.jvm.internal.f0.p(sslSocket, "sslSocket");
        k kVarJ = j(sslSocket, isFallback);
        if (kVarJ.l() != null) {
            sslSocket.setEnabledProtocols(kVarJ.tlsVersionsAsString);
        }
        if (kVarJ.g() != null) {
            sslSocket.setEnabledCipherSuites(kVarJ.cipherSuitesAsString);
        }
    }

    @xh.h(name = "cipherSuites")
    @dl.e
    public final List<h> g() {
        String[] strArr = this.cipherSuitesAsString;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(h.INSTANCE.b(str));
        }
        return CollectionsKt___CollectionsKt.Q5(arrayList);
    }

    public final boolean h(@dl.d SSLSocket socket) {
        kotlin.jvm.internal.f0.p(socket, "socket");
        if (!this.isTls) {
            return false;
        }
        String[] strArr = this.tlsVersionsAsString;
        if (strArr != null && !Util.hasIntersection(strArr, socket.getEnabledProtocols(), kotlin.comparisons.g.q())) {
            return false;
        }
        String[] strArr2 = this.cipherSuitesAsString;
        return strArr2 == null || Util.hasIntersection(strArr2, socket.getEnabledCipherSuites(), h.INSTANCE.c());
    }

    public int hashCode() {
        if (!this.isTls) {
            return 17;
        }
        String[] strArr = this.cipherSuitesAsString;
        int iHashCode = (bb.c.b.f30674h7 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.tlsVersionsAsString;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.supportsTlsExtensions ? 1 : 0);
    }

    @xh.h(name = "isTls")
    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsTls() {
        return this.isTls;
    }

    @xh.h(name = "supportsTlsExtensions")
    public final boolean k() {
        return this.supportsTlsExtensions;
    }

    @xh.h(name = "tlsVersions")
    @dl.e
    public final List<TlsVersion> l() {
        String[] strArr = this.tlsVersionsAsString;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(TlsVersion.INSTANCE.a(str));
        }
        return CollectionsKt___CollectionsKt.Q5(arrayList);
    }

    @dl.d
    public String toString() {
        if (!this.isTls) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(g(), "[all enabled]") + ", tlsVersions=" + Objects.toString(l(), "[all enabled]") + ", supportsTlsExtensions=" + this.supportsTlsExtensions + ')';
    }
}
