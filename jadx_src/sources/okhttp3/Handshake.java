package okhttp3;

import com.umeng.analytics.pro.ak;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.s0;
import okhttp3.internal.Util;

/* JADX INFO: compiled from: Handshake.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001/B;\b\u0000\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0005\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0012\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0+¢\u0006\u0004\b-\u0010.J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u000f\u0010\u000bJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016R!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\b8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u0017\u0010\u001d\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u0004R\u0017\u0010 \u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001f\u0010\u0007R\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010\u000bR\u0018\u0010&\u001a\u00020\u0016*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0013\u0010(\u001a\u0004\u0018\u00010\f8G¢\u0006\u0006\u001a\u0004\b'\u0010\u000eR\u0013\u0010*\u001a\u0004\u0018\u00010\f8G¢\u0006\u0006\u001a\u0004\b)\u0010\u000e¨\u00060"}, d2 = {"Lokhttp3/Handshake;", "", "Lokhttp3/TlsVersion;", "f", "()Lokhttp3/TlsVersion;", "Lokhttp3/h;", ak.av, "()Lokhttp3/h;", "", "Ljava/security/cert/Certificate;", "d", "()Ljava/util/List;", "Ljava/security/Principal;", "e", "()Ljava/security/Principal;", "b", ak.aF, "other", "", "equals", "", "hashCode", "", "toString", "Lkotlin/z;", "m", "peerCertificates", "Lokhttp3/TlsVersion;", "o", "tlsVersion", "Lokhttp3/h;", "g", "cipherSuite", "Ljava/util/List;", "k", "localCertificates", "j", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "name", "n", "peerPrincipal", "l", "localPrincipal", "Lkotlin/Function0;", "peerCertificatesFn", "<init>", "(Lokhttp3/TlsVersion;Lokhttp3/h;Ljava/util/List;Lyh/a;)V", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class Handshake {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlin.z peerCertificates;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final TlsVersion tlsVersion;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final h cipherSuite;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<Certificate> localCertificates;

    /* JADX INFO: compiled from: Handshake.kt */
    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004*\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\nJ4\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004H\u0007¨\u0006\u0016"}, d2 = {"Lokhttp3/Handshake$Companion;", "", "", "Ljava/security/cert/Certificate;", "", "d", "([Ljava/security/cert/Certificate;)Ljava/util/List;", "Ljavax/net/ssl/SSLSession;", "Lokhttp3/Handshake;", "b", "(Ljavax/net/ssl/SSLSession;)Lokhttp3/Handshake;", "sslSession", ak.av, "Lokhttp3/TlsVersion;", "tlsVersion", "Lokhttp3/h;", "cipherSuite", "peerCertificates", "localCertificates", ak.aF, "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        private final List<Certificate> d(Certificate[] certificateArr) {
            return certificateArr != null ? Util.immutableListOf((Certificate[]) Arrays.copyOf(certificateArr, certificateArr.length)) : CollectionsKt__CollectionsKt.E();
        }

        @dl.d
        @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @s0(expression = "sslSession.handshake()", imports = {}))
        @xh.h(name = "-deprecated_get")
        public final Handshake a(@dl.d SSLSession sslSession) throws IOException {
            kotlin.jvm.internal.f0.p(sslSession, "sslSession");
            return b(sslSession);
        }

        @dl.d
        @xh.h(name = "get")
        @xh.m
        public final Handshake b(@dl.d SSLSession handshake) throws IOException {
            final List<Certificate> listE;
            kotlin.jvm.internal.f0.p(handshake, "$this$handshake");
            String cipherSuite = handshake.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            int iHashCode = cipherSuite.hashCode();
            if (iHashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : iHashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            h hVarB = h.INSTANCE.b(cipherSuite);
            String protocol = handshake.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            if (kotlin.jvm.internal.f0.g("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion tlsVersionA = TlsVersion.INSTANCE.a(protocol);
            try {
                listE = d(handshake.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listE = CollectionsKt__CollectionsKt.E();
            }
            return new Handshake(tlsVersionA, hVarB, d(handshake.getLocalCertificates()), new yh.a<List<? extends Certificate>>() { // from class: okhttp3.Handshake$Companion$handshake$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                public final List<? extends Certificate> invoke() {
                    return listE;
                }
            });
        }

        @dl.d
        @xh.m
        public final Handshake c(@dl.d TlsVersion tlsVersion, @dl.d h cipherSuite, @dl.d List<? extends Certificate> peerCertificates, @dl.d List<? extends Certificate> localCertificates) {
            kotlin.jvm.internal.f0.p(tlsVersion, "tlsVersion");
            kotlin.jvm.internal.f0.p(cipherSuite, "cipherSuite");
            kotlin.jvm.internal.f0.p(peerCertificates, "peerCertificates");
            kotlin.jvm.internal.f0.p(localCertificates, "localCertificates");
            final List immutableList = Util.toImmutableList(peerCertificates);
            return new Handshake(tlsVersion, cipherSuite, Util.toImmutableList(localCertificates), new yh.a<List<? extends Certificate>>() { // from class: okhttp3.Handshake$Companion$get$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                public final List<? extends Certificate> invoke() {
                    return immutableList;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Handshake(@dl.d TlsVersion tlsVersion, @dl.d h cipherSuite, @dl.d List<? extends Certificate> localCertificates, @dl.d final yh.a<? extends List<? extends Certificate>> peerCertificatesFn) {
        kotlin.jvm.internal.f0.p(tlsVersion, "tlsVersion");
        kotlin.jvm.internal.f0.p(cipherSuite, "cipherSuite");
        kotlin.jvm.internal.f0.p(localCertificates, "localCertificates");
        kotlin.jvm.internal.f0.p(peerCertificatesFn, "peerCertificatesFn");
        this.tlsVersion = tlsVersion;
        this.cipherSuite = cipherSuite;
        this.localCertificates = localCertificates;
        this.peerCertificates = kotlin.b0.c(new yh.a<List<? extends Certificate>>() { // from class: okhttp3.Handshake$peerCertificates$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            public final List<? extends Certificate> invoke() {
                try {
                    return (List) peerCertificatesFn.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return CollectionsKt__CollectionsKt.E();
                }
            }
        });
    }

    @dl.d
    @xh.h(name = "get")
    @xh.m
    public static final Handshake h(@dl.d SSLSession sSLSession) throws IOException {
        return INSTANCE.b(sSLSession);
    }

    @dl.d
    @xh.m
    public static final Handshake i(@dl.d TlsVersion tlsVersion, @dl.d h hVar, @dl.d List<? extends Certificate> list, @dl.d List<? extends Certificate> list2) {
        return INSTANCE.c(tlsVersion, hVar, list, list2);
    }

    private final String j(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        kotlin.jvm.internal.f0.o(type, "type");
        return type;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "cipherSuite", imports = {}))
    @xh.h(name = "-deprecated_cipherSuite")
    /* JADX INFO: renamed from: a, reason: from getter */
    public final h getCipherSuite() {
        return this.cipherSuite;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "localCertificates", imports = {}))
    @xh.h(name = "-deprecated_localCertificates")
    public final List<Certificate> b() {
        return this.localCertificates;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "localPrincipal", imports = {}))
    @xh.h(name = "-deprecated_localPrincipal")
    @dl.e
    public final Principal c() {
        return l();
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "peerCertificates", imports = {}))
    @xh.h(name = "-deprecated_peerCertificates")
    public final List<Certificate> d() {
        return m();
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "peerPrincipal", imports = {}))
    @xh.h(name = "-deprecated_peerPrincipal")
    @dl.e
    public final Principal e() {
        return n();
    }

    public boolean equals(@dl.e Object other) {
        if (other instanceof Handshake) {
            Handshake handshake = (Handshake) other;
            if (handshake.tlsVersion == this.tlsVersion && kotlin.jvm.internal.f0.g(handshake.cipherSuite, this.cipherSuite) && kotlin.jvm.internal.f0.g(handshake.m(), m()) && kotlin.jvm.internal.f0.g(handshake.localCertificates, this.localCertificates)) {
                return true;
            }
        }
        return false;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "tlsVersion", imports = {}))
    @xh.h(name = "-deprecated_tlsVersion")
    /* JADX INFO: renamed from: f, reason: from getter */
    public final TlsVersion getTlsVersion() {
        return this.tlsVersion;
    }

    @dl.d
    @xh.h(name = "cipherSuite")
    public final h g() {
        return this.cipherSuite;
    }

    public int hashCode() {
        return ((((((bb.c.b.f30674h7 + this.tlsVersion.hashCode()) * 31) + this.cipherSuite.hashCode()) * 31) + m().hashCode()) * 31) + this.localCertificates.hashCode();
    }

    @dl.d
    @xh.h(name = "localCertificates")
    public final List<Certificate> k() {
        return this.localCertificates;
    }

    @xh.h(name = "localPrincipal")
    @dl.e
    public final Principal l() {
        Object objB2 = CollectionsKt___CollectionsKt.B2(this.localCertificates);
        if (!(objB2 instanceof X509Certificate)) {
            objB2 = null;
        }
        X509Certificate x509Certificate = (X509Certificate) objB2;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @dl.d
    @xh.h(name = "peerCertificates")
    public final List<Certificate> m() {
        return (List) this.peerCertificates.getValue();
    }

    @xh.h(name = "peerPrincipal")
    @dl.e
    public final Principal n() {
        Object objB2 = CollectionsKt___CollectionsKt.B2(m());
        if (!(objB2 instanceof X509Certificate)) {
            objB2 = null;
        }
        X509Certificate x509Certificate = (X509Certificate) objB2;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @dl.d
    @xh.h(name = "tlsVersion")
    public final TlsVersion o() {
        return this.tlsVersion;
    }

    @dl.d
    public String toString() {
        List<Certificate> listM = m();
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listM, 10));
        Iterator<T> it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(j((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Handshake{");
        sb2.append("tlsVersion=");
        sb2.append(this.tlsVersion);
        sb2.append(' ');
        sb2.append("cipherSuite=");
        sb2.append(this.cipherSuite);
        sb2.append(' ');
        sb2.append("peerCertificates=");
        sb2.append(string);
        sb2.append(' ');
        sb2.append("localCertificates=");
        List<Certificate> list = this.localCertificates;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.t.Y(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(j((Certificate) it2.next()));
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
