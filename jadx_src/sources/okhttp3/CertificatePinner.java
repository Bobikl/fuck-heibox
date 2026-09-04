package okhttp3;

import com.tencent.qcloud.core.auth.AuthConstants;
import com.tencent.qcloud.core.util.IOUtils;
import com.umeng.analytics.pro.ak;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.w0;
import kotlin.s0;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.tls.CertificateChainCleaner;
import okio.ByteString;

/* JADX INFO: compiled from: CertificatePinner.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b\n\u0018\u0000 \u00122\u00020\u0001:\u0003\b\u000f\fB#\b\u0000\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u001c\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b$\u0010%J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J+\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\tH\u0000¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u000e\"\u00020\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0016R\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u001c8\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lokhttp3/CertificatePinner;", "", "", "hostname", "", "Ljava/security/cert/Certificate;", "peerCertificates", "Lkotlin/b2;", ak.av, "Lkotlin/Function0;", "Ljava/security/cert/X509Certificate;", "cleanedPeerCertificatesFn", ak.aF, "(Ljava/lang/String;Lyh/a;)V", "", "b", "(Ljava/lang/String;[Ljava/security/cert/Certificate;)V", "Lokhttp3/CertificatePinner$c;", "d", "Lokhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "j", "(Lokhttp3/internal/tls/CertificateChainCleaner;)Lokhttp3/CertificatePinner;", "other", "", "equals", "", "hashCode", "", "Ljava/util/Set;", "f", "()Ljava/util/Set;", "pins", "Lokhttp3/internal/tls/CertificateChainCleaner;", "e", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "<init>", "(Ljava/util/Set;Lokhttp3/internal/tls/CertificateChainCleaner;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class CertificatePinner {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Set<c> pins;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final CertificateChainCleaner certificateChainCleaner;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final CertificatePinner f132322c = new a().b();

    /* JADX INFO: compiled from: CertificatePinner.kt */
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\"\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\t\u001a\u00020\bR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lokhttp3/CertificatePinner$a;", "", "", org.apache.tools.ant.types.selectors.m.f136546u, "", "pins", ak.av, "(Ljava/lang/String;[Ljava/lang/String;)Lokhttp3/CertificatePinner$a;", "Lokhttp3/CertificatePinner;", "b", "", "Lokhttp3/CertificatePinner$c;", "Ljava/util/List;", ak.aF, "()Ljava/util/List;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final List<c> pins = new ArrayList();

        @dl.d
        public final a a(@dl.d String pattern, @dl.d String... pins) {
            kotlin.jvm.internal.f0.p(pattern, "pattern");
            kotlin.jvm.internal.f0.p(pins, "pins");
            for (String str : pins) {
                this.pins.add(new c(pattern, str));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @dl.d
        public final CertificatePinner b() {
            return new CertificatePinner(CollectionsKt___CollectionsKt.V5(this.pins), null, 2, 0 == true ? 1 : 0);
        }

        @dl.d
        public final List<c> c() {
            return this.pins;
        }
    }

    /* JADX INFO: renamed from: okhttp3.CertificatePinner$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: CertificatePinner.kt */
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007J\f\u0010\u0005\u001a\u00020\u0003*\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lokhttp3/CertificatePinner$b;", "", "Ljava/security/cert/X509Certificate;", "Lokio/ByteString;", "b", ak.aF, "Ljava/security/cert/Certificate;", "certificate", "", ak.av, "Lokhttp3/CertificatePinner;", "DEFAULT", "Lokhttp3/CertificatePinner;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final String a(@dl.d Certificate certificate) {
            kotlin.jvm.internal.f0.p(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
            }
            return "sha256/" + c((X509Certificate) certificate).base64();
        }

        @dl.d
        @xh.m
        public final ByteString b(@dl.d X509Certificate sha1Hash) {
            kotlin.jvm.internal.f0.p(sha1Hash, "$this$sha1Hash");
            ByteString.Companion companion = ByteString.INSTANCE;
            PublicKey publicKey = sha1Hash.getPublicKey();
            kotlin.jvm.internal.f0.o(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            kotlin.jvm.internal.f0.o(encoded, "publicKey.encoded");
            return ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha1();
        }

        @dl.d
        @xh.m
        public final ByteString c(@dl.d X509Certificate sha256Hash) {
            kotlin.jvm.internal.f0.p(sha256Hash, "$this$sha256Hash");
            ByteString.Companion companion = ByteString.INSTANCE;
            PublicKey publicKey = sha256Hash.getPublicKey();
            kotlin.jvm.internal.f0.o(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            kotlin.jvm.internal.f0.o(encoded, "publicKey.encoded");
            return ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha256();
        }
    }

    /* JADX INFO: compiled from: CertificatePinner.kt */
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0013\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u000e\u0010\u0017¨\u0006\u001c"}, d2 = {"Lokhttp3/CertificatePinner$c;", "", "", "hostname", "", "e", "Ljava/security/cert/X509Certificate;", "certificate", "d", "toString", "other", "equals", "", "hashCode", ak.av, "Ljava/lang/String;", ak.aF, "()Ljava/lang/String;", org.apache.tools.ant.types.selectors.m.f136546u, "b", "hashAlgorithm", "Lokio/ByteString;", "Lokio/ByteString;", "()Lokio/ByteString;", "hash", "pin", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final String pattern;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final String hashAlgorithm;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final ByteString hash;

        public c(@dl.d String pattern, @dl.d String pin) {
            kotlin.jvm.internal.f0.p(pattern, "pattern");
            kotlin.jvm.internal.f0.p(pin, "pin");
            if (!((kotlin.text.u.v2(pattern, "*.", false, 2, null) && StringsKt__StringsKt.s3(pattern, androidx.webkit.b.f28327e, 1, false, 4, null) == -1) || (kotlin.text.u.v2(pattern, "**.", false, 2, null) && StringsKt__StringsKt.s3(pattern, androidx.webkit.b.f28327e, 2, false, 4, null) == -1) || StringsKt__StringsKt.s3(pattern, androidx.webkit.b.f28327e, 0, false, 6, null) == -1)) {
                throw new IllegalArgumentException(("Unexpected pattern: " + pattern).toString());
            }
            String canonicalHost = HostnamesKt.toCanonicalHost(pattern);
            if (canonicalHost == null) {
                throw new IllegalArgumentException("Invalid pattern: " + pattern);
            }
            this.pattern = canonicalHost;
            if (kotlin.text.u.v2(pin, "sha1/", false, 2, null)) {
                this.hashAlgorithm = AuthConstants.SHA1;
                ByteString.Companion companion = ByteString.INSTANCE;
                String strSubstring = pin.substring(5);
                kotlin.jvm.internal.f0.o(strSubstring, "(this as java.lang.String).substring(startIndex)");
                ByteString byteStringDecodeBase64 = companion.decodeBase64(strSubstring);
                if (byteStringDecodeBase64 != null) {
                    this.hash = byteStringDecodeBase64;
                    return;
                }
                throw new IllegalArgumentException("Invalid pin hash: " + pin);
            }
            if (!kotlin.text.u.v2(pin, "sha256/", false, 2, null)) {
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + pin);
            }
            this.hashAlgorithm = "sha256";
            ByteString.Companion companion2 = ByteString.INSTANCE;
            String strSubstring2 = pin.substring(7);
            kotlin.jvm.internal.f0.o(strSubstring2, "(this as java.lang.String).substring(startIndex)");
            ByteString byteStringDecodeBase65 = companion2.decodeBase64(strSubstring2);
            if (byteStringDecodeBase65 != null) {
                this.hash = byteStringDecodeBase65;
                return;
            }
            throw new IllegalArgumentException("Invalid pin hash: " + pin);
        }

        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ByteString getHash() {
            return this.hash;
        }

        @dl.d
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        @dl.d
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPattern() {
            return this.pattern;
        }

        public final boolean d(@dl.d X509Certificate certificate) {
            kotlin.jvm.internal.f0.p(certificate, "certificate");
            String str = this.hashAlgorithm;
            int iHashCode = str.hashCode();
            if (iHashCode != -903629273) {
                if (iHashCode == 3528965 && str.equals(AuthConstants.SHA1)) {
                    return kotlin.jvm.internal.f0.g(this.hash, CertificatePinner.INSTANCE.b(certificate));
                }
            } else if (str.equals("sha256")) {
                return kotlin.jvm.internal.f0.g(this.hash, CertificatePinner.INSTANCE.c(certificate));
            }
            return false;
        }

        public final boolean e(@dl.d String hostname) {
            kotlin.jvm.internal.f0.p(hostname, "hostname");
            if (kotlin.text.u.v2(this.pattern, "**.", false, 2, null)) {
                int length = this.pattern.length() - 3;
                int length2 = hostname.length() - length;
                if (!kotlin.text.u.g2(hostname, hostname.length() - length, this.pattern, 3, length, false, 16, null)) {
                    return false;
                }
                if (length2 != 0 && hostname.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else {
                if (!kotlin.text.u.v2(this.pattern, "*.", false, 2, null)) {
                    return kotlin.jvm.internal.f0.g(hostname, this.pattern);
                }
                int length3 = this.pattern.length() - 1;
                int length4 = hostname.length() - length3;
                if (!kotlin.text.u.g2(hostname, hostname.length() - length3, this.pattern, 1, length3, false, 16, null) || StringsKt__StringsKt.F3(hostname, lg.a.f131414g, length4 - 1, false, 4, null) != -1) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return ((kotlin.jvm.internal.f0.g(this.pattern, cVar.pattern) ^ true) || (kotlin.jvm.internal.f0.g(this.hashAlgorithm, cVar.hashAlgorithm) ^ true) || (kotlin.jvm.internal.f0.g(this.hash, cVar.hash) ^ true)) ? false : true;
        }

        public int hashCode() {
            return (((this.pattern.hashCode() * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }

        @dl.d
        public String toString() {
            return this.hashAlgorithm + IOUtils.DIR_SEPARATOR_UNIX + this.hash.base64();
        }
    }

    public CertificatePinner(@dl.d Set<c> pins, @dl.e CertificateChainCleaner certificateChainCleaner) {
        kotlin.jvm.internal.f0.p(pins, "pins");
        this.pins = pins;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i10, kotlin.jvm.internal.u uVar) {
        this(set, (i10 & 2) != 0 ? null : certificateChainCleaner);
    }

    @dl.d
    @xh.m
    public static final String g(@dl.d Certificate certificate) {
        return INSTANCE.a(certificate);
    }

    @dl.d
    @xh.m
    public static final ByteString h(@dl.d X509Certificate x509Certificate) {
        return INSTANCE.b(x509Certificate);
    }

    @dl.d
    @xh.m
    public static final ByteString i(@dl.d X509Certificate x509Certificate) {
        return INSTANCE.c(x509Certificate);
    }

    public final void a(@dl.d final String hostname, @dl.d final List<? extends Certificate> peerCertificates) throws SSLPeerUnverifiedException {
        kotlin.jvm.internal.f0.p(hostname, "hostname");
        kotlin.jvm.internal.f0.p(peerCertificates, "peerCertificates");
        c(hostname, new yh.a<List<? extends X509Certificate>>() { // from class: okhttp3.CertificatePinner$check$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            public final List<? extends X509Certificate> invoke() {
                List<Certificate> listClean;
                CertificateChainCleaner certificateChainCleaner = this.f132330b.getCertificateChainCleaner();
                if (certificateChainCleaner == null || (listClean = certificateChainCleaner.clean(peerCertificates, hostname)) == null) {
                    listClean = peerCertificates;
                }
                ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listClean, 10));
                for (Certificate certificate : listClean) {
                    if (certificate == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            }
        });
    }

    @kotlin.k(message = "replaced with {@link #check(String, List)}.", replaceWith = @s0(expression = "check(hostname, peerCertificates.toList())", imports = {}))
    public final void b(@dl.d String hostname, @dl.d Certificate... peerCertificates) throws SSLPeerUnverifiedException {
        kotlin.jvm.internal.f0.p(hostname, "hostname");
        kotlin.jvm.internal.f0.p(peerCertificates, "peerCertificates");
        a(hostname, ArraysKt___ArraysKt.kz(peerCertificates));
    }

    public final void c(@dl.d String hostname, @dl.d yh.a<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        kotlin.jvm.internal.f0.p(hostname, "hostname");
        kotlin.jvm.internal.f0.p(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List<c> listD = d(hostname);
        if (listD.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> listInvoke = cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : listInvoke) {
            ByteString byteStringC = null;
            ByteString byteStringB = null;
            for (c cVar : listD) {
                String hashAlgorithm = cVar.getHashAlgorithm();
                int iHashCode = hashAlgorithm.hashCode();
                if (iHashCode != -903629273) {
                    if (iHashCode != 3528965 || !hashAlgorithm.equals(AuthConstants.SHA1)) {
                        throw new AssertionError("unsupported hashAlgorithm: " + cVar.getHashAlgorithm());
                    }
                    if (byteStringB == null) {
                        byteStringB = INSTANCE.b(x509Certificate);
                    }
                    if (kotlin.jvm.internal.f0.g(cVar.getHash(), byteStringB)) {
                        return;
                    }
                } else {
                    if (!hashAlgorithm.equals("sha256")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + cVar.getHashAlgorithm());
                    }
                    if (byteStringC == null) {
                        byteStringC = INSTANCE.c(x509Certificate);
                    }
                    if (kotlin.jvm.internal.f0.g(cVar.getHash(), byteStringC)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate pinning failure!");
        sb2.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : listInvoke) {
            sb2.append("\n    ");
            sb2.append(INSTANCE.a(x509Certificate2));
            sb2.append(": ");
            Principal subjectDN = x509Certificate2.getSubjectDN();
            kotlin.jvm.internal.f0.o(subjectDN, "element.subjectDN");
            sb2.append(subjectDN.getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(hostname);
        sb2.append(":");
        for (c cVar2 : listD) {
            sb2.append("\n    ");
            sb2.append(cVar2);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    @dl.d
    public final List<c> d(@dl.d String hostname) {
        kotlin.jvm.internal.f0.p(hostname, "hostname");
        Set<c> set = this.pins;
        List<c> listE = CollectionsKt__CollectionsKt.E();
        for (Object obj : set) {
            if (((c) obj).e(hostname)) {
                if (listE.isEmpty()) {
                    listE = new ArrayList<>();
                }
                w0.g(listE).add(obj);
            }
        }
        return listE;
    }

    @dl.e
    /* JADX INFO: renamed from: e, reason: from getter */
    public final CertificateChainCleaner getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    public boolean equals(@dl.e Object other) {
        if (other instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) other;
            if (kotlin.jvm.internal.f0.g(certificatePinner.pins, this.pins) && kotlin.jvm.internal.f0.g(certificatePinner.certificateChainCleaner, this.certificateChainCleaner)) {
                return true;
            }
        }
        return false;
    }

    @dl.d
    public final Set<c> f() {
        return this.pins;
    }

    public int hashCode() {
        int iHashCode = (bb.c.b.jq + this.pins.hashCode()) * 41;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        return iHashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }

    @dl.d
    public final CertificatePinner j(@dl.d CertificateChainCleaner certificateChainCleaner) {
        kotlin.jvm.internal.f0.p(certificateChainCleaner, "certificateChainCleaner");
        return kotlin.jvm.internal.f0.g(this.certificateChainCleaner, certificateChainCleaner) ? this : new CertificatePinner(this.pins, certificateChainCleaner);
    }
}
