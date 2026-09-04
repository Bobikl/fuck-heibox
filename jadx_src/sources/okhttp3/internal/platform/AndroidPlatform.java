package okhttp3.internal.platform;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import dl.d;
import dl.e;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import okhttp3.Protocol;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.CloseGuard;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.platform.android.StandardAndroidSocketAdapter;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;

/* JADX INFO: compiled from: AndroidPlatform.kt */
/* JADX INFO: loaded from: classes5.dex */
@SuppressSignatureCheck
@Metadata(bv = {}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0002,-B\u0007¢\u0006\u0004\b*\u0010+J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J-\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0011\u0010\u0015\u001a\r\u0012\t\u0012\u00070\u0013¢\u0006\u0002\b\u00140\u0012H\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u001a\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010!\u001a\u00020 2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010#\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\fH\u0016R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006."}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform;", "Lokhttp3/internal/platform/Platform;", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "Lkotlin/b2;", "connectSocket", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/Protocol;", "Lxh/n;", "protocols", "configureTlsExtensions", "getSelectedProtocol", "closer", "", "getStackTraceForCloseable", "message", "stackTrace", "logCloseableLeak", "", "isCleartextTrafficPermitted", "Lokhttp3/internal/tls/CertificateChainCleaner;", "buildCertificateChainCleaner", "Lokhttp3/internal/tls/TrustRootIndex;", "buildTrustRootIndex", "Lokhttp3/internal/platform/android/SocketAdapter;", "socketAdapters", "Ljava/util/List;", "Lokhttp3/internal/platform/android/CloseGuard;", "closeGuard", "Lokhttp3/internal/platform/android/CloseGuard;", "<init>", "()V", "Companion", "CustomTrustRootIndex", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class AndroidPlatform extends Platform {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final boolean isSupported;
    private final CloseGuard closeGuard;
    private final List<SocketAdapter> socketAdapters;

    /* JADX INFO: compiled from: AndroidPlatform.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005¨\u0006\b"}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform$Companion;", "", "()V", "isSupported", "", "()Z", "buildIfSupported", "Lokhttp3/internal/platform/Platform;", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @e
        public final Platform buildIfSupported() {
            if (isSupported()) {
                return new AndroidPlatform();
            }
            return null;
        }

        public final boolean isSupported() {
            return AndroidPlatform.isSupported;
        }
    }

    /* JADX INFO: compiled from: AndroidPlatform.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0003HÂ\u0003J\t\u0010\b\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform$CustomTrustRootIndex;", "Lokhttp3/internal/tls/TrustRootIndex;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "findByIssuerAndSignatureMethod", "Ljava/lang/reflect/Method;", "(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V", "component1", "component2", "copy", "equals", "", "other", "", "findByIssuerAndSignature", "Ljava/security/cert/X509Certificate;", "cert", "hashCode", "", "toString", "", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final /* data */ class CustomTrustRootIndex implements TrustRootIndex {
        private final Method findByIssuerAndSignatureMethod;
        private final X509TrustManager trustManager;

        public CustomTrustRootIndex(@d X509TrustManager trustManager, @d Method findByIssuerAndSignatureMethod) {
            f0.p(trustManager, "trustManager");
            f0.p(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.trustManager = trustManager;
            this.findByIssuerAndSignatureMethod = findByIssuerAndSignatureMethod;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        private final X509TrustManager getTrustManager() {
            return this.trustManager;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        private final Method getFindByIssuerAndSignatureMethod() {
            return this.findByIssuerAndSignatureMethod;
        }

        public static /* synthetic */ CustomTrustRootIndex copy$default(CustomTrustRootIndex customTrustRootIndex, X509TrustManager x509TrustManager, Method method, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                x509TrustManager = customTrustRootIndex.trustManager;
            }
            if ((i10 & 2) != 0) {
                method = customTrustRootIndex.findByIssuerAndSignatureMethod;
            }
            return customTrustRootIndex.copy(x509TrustManager, method);
        }

        @d
        public final CustomTrustRootIndex copy(@d X509TrustManager trustManager, @d Method findByIssuerAndSignatureMethod) {
            f0.p(trustManager, "trustManager");
            f0.p(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            return new CustomTrustRootIndex(trustManager, findByIssuerAndSignatureMethod);
        }

        public boolean equals(@e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomTrustRootIndex)) {
                return false;
            }
            CustomTrustRootIndex customTrustRootIndex = (CustomTrustRootIndex) other;
            return f0.g(this.trustManager, customTrustRootIndex.trustManager) && f0.g(this.findByIssuerAndSignatureMethod, customTrustRootIndex.findByIssuerAndSignatureMethod);
        }

        @Override // okhttp3.internal.tls.TrustRootIndex
        @e
        public X509Certificate findByIssuerAndSignature(@d X509Certificate cert) {
            f0.p(cert, "cert");
            try {
                Object objInvoke = this.findByIssuerAndSignatureMethod.invoke(this.trustManager, cert);
                if (objInvoke != null) {
                    return ((TrustAnchor) objInvoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public int hashCode() {
            X509TrustManager x509TrustManager = this.trustManager;
            int iHashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.findByIssuerAndSignatureMethod;
            return iHashCode + (method != null ? method.hashCode() : 0);
        }

        @d
        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.trustManager + ", findByIssuerAndSignatureMethod=" + this.findByIssuerAndSignatureMethod + ")";
        }
    }

    static {
        boolean z10 = false;
        if (Platform.INSTANCE.isAndroid() && Build.VERSION.SDK_INT < 30) {
            z10 = true;
        }
        isSupported = z10;
    }

    public AndroidPlatform() {
        List listN = CollectionsKt__CollectionsKt.N(StandardAndroidSocketAdapter.Companion.buildIfSupported$default(StandardAndroidSocketAdapter.INSTANCE, null, 1, null), new DeferredSocketAdapter(AndroidSocketAdapter.INSTANCE.getPlayProviderFactory()), new DeferredSocketAdapter(ConscryptSocketAdapter.INSTANCE.getFactory()), new DeferredSocketAdapter(BouncyCastleSocketAdapter.INSTANCE.getFactory()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listN) {
            if (((SocketAdapter) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.socketAdapters = arrayList;
        this.closeGuard = CloseGuard.INSTANCE.get();
    }

    @Override // okhttp3.internal.platform.Platform
    @d
    public CertificateChainCleaner buildCertificateChainCleaner(@d X509TrustManager trustManager) {
        f0.p(trustManager, "trustManager");
        AndroidCertificateChainCleaner androidCertificateChainCleanerBuildIfSupported = AndroidCertificateChainCleaner.INSTANCE.buildIfSupported(trustManager);
        return androidCertificateChainCleanerBuildIfSupported != null ? androidCertificateChainCleanerBuildIfSupported : super.buildCertificateChainCleaner(trustManager);
    }

    @Override // okhttp3.internal.platform.Platform
    @d
    public TrustRootIndex buildTrustRootIndex(@d X509TrustManager trustManager) {
        f0.p(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            f0.o(method, "method");
            method.setAccessible(true);
            return new CustomTrustRootIndex(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.buildTrustRootIndex(trustManager);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(@d SSLSocket sslSocket, @e String str, @d List<Protocol> protocols) {
        Object next;
        f0.p(sslSocket, "sslSocket");
        f0.p(protocols, "protocols");
        Iterator<T> it = this.socketAdapters.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((SocketAdapter) next).matchesSocket(sslSocket));
        SocketAdapter socketAdapter = (SocketAdapter) next;
        if (socketAdapter != null) {
            socketAdapter.configureTlsExtensions(sslSocket, str, protocols);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void connectSocket(@d Socket socket, @d InetSocketAddress address, int i10) throws IOException {
        f0.p(socket, "socket");
        f0.p(address, "address");
        try {
            socket.connect(address, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    @e
    public String getSelectedProtocol(@d SSLSocket sslSocket) {
        Object next;
        f0.p(sslSocket, "sslSocket");
        Iterator<T> it = this.socketAdapters.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((SocketAdapter) next).matchesSocket(sslSocket));
        SocketAdapter socketAdapter = (SocketAdapter) next;
        if (socketAdapter != null) {
            return socketAdapter.getSelectedProtocol(sslSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.Platform
    @e
    public Object getStackTraceForCloseable(@d String closer) {
        f0.p(closer, "closer");
        return this.closeGuard.createAndOpen(closer);
    }

    @Override // okhttp3.internal.platform.Platform
    public boolean isCleartextTrafficPermitted(@d String hostname) {
        f0.p(hostname, "hostname");
        if (Build.VERSION.SDK_INT >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
        }
        NetworkSecurityPolicy networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
        f0.o(networkSecurityPolicy, "NetworkSecurityPolicy.getInstance()");
        return networkSecurityPolicy.isCleartextTrafficPermitted();
    }

    @Override // okhttp3.internal.platform.Platform
    public void logCloseableLeak(@d String message, @e Object obj) {
        f0.p(message, "message");
        if (this.closeGuard.warnIfOpen(obj)) {
            return;
        }
        Platform.log$default(this, message, 5, null, 4, null);
    }

    @Override // okhttp3.internal.platform.Platform
    @e
    public X509TrustManager trustManager(@d SSLSocketFactory sslSocketFactory) {
        Object next;
        f0.p(sslSocketFactory, "sslSocketFactory");
        Iterator<T> it = this.socketAdapters.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((SocketAdapter) next).matchesSocketFactory(sslSocketFactory));
        SocketAdapter socketAdapter = (SocketAdapter) next;
        if (socketAdapter != null) {
            return socketAdapter.trustManager(sslSocketFactory);
        }
        return null;
    }
}
