package okhttp3.internal.platform;

import dl.d;
import dl.e;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import okhttp3.Protocol;
import okhttp3.internal.Util;
import okhttp3.internal.platform.android.AndroidLog;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import okhttp3.z;
import okio.Buffer;
import xh.m;

/* JADX INFO: compiled from: Platform.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 02\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b.\u0010/J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J-\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0011\u0010\u0011\u001a\r\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u00100\u000eH\u0016J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J \u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J&\u0010!\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u001a2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010#\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010\u00012\u0006\u0010$\u001a\u00020\u0002H\u0016J\u001a\u0010'\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u0016J\u0010\u0010)\u001a\u00020(2\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010+\u001a\u00020*2\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010,\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010-\u001a\u00020\u0002H\u0016¨\u00061"}, d2 = {"Lokhttp3/internal/platform/Platform;", "", "", "getPrefix", "Ljavax/net/ssl/SSLContext;", "newSSLContext", "Ljavax/net/ssl/X509TrustManager;", "platformTrustManager", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "trustManager", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "hostname", "", "Lokhttp3/Protocol;", "Lxh/n;", "protocols", "Lkotlin/b2;", "configureTlsExtensions", "afterHandshake", "getSelectedProtocol", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "connectSocket", "message", "level", "", "t", "log", "", "isCleartextTrafficPermitted", "closer", "getStackTraceForCloseable", "stackTrace", "logCloseableLeak", "Lokhttp3/internal/tls/CertificateChainCleaner;", "buildCertificateChainCleaner", "Lokhttp3/internal/tls/TrustRootIndex;", "buildTrustRootIndex", "newSslSocketFactory", "toString", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
public class Platform {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final int INFO = 4;
    public static final int WARN = 5;
    private static final Logger logger;
    private static volatile Platform platform;

    /* JADX INFO: compiled from: Platform.kt */
    @Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0002J\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0014\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u0014\u0010\u0012\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001d\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001f¨\u0006\""}, d2 = {"Lokhttp3/internal/platform/Platform$Companion;", "", "Lokhttp3/internal/platform/Platform;", "findPlatform", "findAndroidPlatform", "findJvmPlatform", "get", "platform", "Lkotlin/b2;", "resetForTests", "", "Lokhttp3/Protocol;", "protocols", "", "alpnProtocolNames", "", "concatLengthPrefixed", "", "isConscryptPreferred", "()Z", "isOpenJSSEPreferred", "isBouncyCastlePreferred", "isAndroid", "", "INFO", "I", "WARN", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "Lokhttp3/internal/platform/Platform;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private final Platform findAndroidPlatform() {
            AndroidLog.INSTANCE.enable();
            Platform platformBuildIfSupported = Android10Platform.INSTANCE.buildIfSupported();
            if (platformBuildIfSupported != null) {
                return platformBuildIfSupported;
            }
            Platform platformBuildIfSupported2 = AndroidPlatform.Companion.buildIfSupported();
            f0.m(platformBuildIfSupported2);
            return platformBuildIfSupported2;
        }

        private final Platform findJvmPlatform() {
            OpenJSSEPlatform openJSSEPlatformBuildIfSupported;
            BouncyCastlePlatform bouncyCastlePlatformBuildIfSupported;
            ConscryptPlatform conscryptPlatformBuildIfSupported;
            if (isConscryptPreferred() && (conscryptPlatformBuildIfSupported = ConscryptPlatform.INSTANCE.buildIfSupported()) != null) {
                return conscryptPlatformBuildIfSupported;
            }
            if (isBouncyCastlePreferred() && (bouncyCastlePlatformBuildIfSupported = BouncyCastlePlatform.INSTANCE.buildIfSupported()) != null) {
                return bouncyCastlePlatformBuildIfSupported;
            }
            if (isOpenJSSEPreferred() && (openJSSEPlatformBuildIfSupported = OpenJSSEPlatform.INSTANCE.buildIfSupported()) != null) {
                return openJSSEPlatformBuildIfSupported;
            }
            Jdk9Platform jdk9PlatformBuildIfSupported = Jdk9Platform.INSTANCE.buildIfSupported();
            if (jdk9PlatformBuildIfSupported != null) {
                return jdk9PlatformBuildIfSupported;
            }
            Platform platformBuildIfSupported = Jdk8WithJettyBootPlatform.INSTANCE.buildIfSupported();
            return platformBuildIfSupported != null ? platformBuildIfSupported : new Platform();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Platform findPlatform() {
            return isAndroid() ? findAndroidPlatform() : findJvmPlatform();
        }

        private final boolean isBouncyCastlePreferred() {
            Provider provider = Security.getProviders()[0];
            f0.o(provider, "Security.getProviders()[0]");
            return f0.g("BC", provider.getName());
        }

        private final boolean isConscryptPreferred() {
            Provider provider = Security.getProviders()[0];
            f0.o(provider, "Security.getProviders()[0]");
            return f0.g("Conscrypt", provider.getName());
        }

        private final boolean isOpenJSSEPreferred() {
            Provider provider = Security.getProviders()[0];
            f0.o(provider, "Security.getProviders()[0]");
            return f0.g("OpenJSSE", provider.getName());
        }

        public static /* synthetic */ void resetForTests$default(Companion companion, Platform platform, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                platform = companion.findPlatform();
            }
            companion.resetForTests(platform);
        }

        @d
        public final List<String> alpnProtocolNames(@d List<? extends Protocol> protocols) {
            f0.p(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(t.Y(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Protocol) it.next()).getProtocol());
            }
            return arrayList2;
        }

        @d
        public final byte[] concatLengthPrefixed(@d List<? extends Protocol> protocols) {
            f0.p(protocols, "protocols");
            Buffer buffer = new Buffer();
            for (String str : alpnProtocolNames(protocols)) {
                buffer.writeByte(str.length());
                buffer.writeUtf8(str);
            }
            return buffer.readByteArray();
        }

        @d
        @m
        public final Platform get() {
            return Platform.platform;
        }

        public final boolean isAndroid() {
            return f0.g("Dalvik", System.getProperty("java.vm.name"));
        }

        public final void resetForTests(@d Platform platform) {
            f0.p(platform, "platform");
            Platform.platform = platform;
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        platform = companion.findPlatform();
        logger = Logger.getLogger(z.class.getName());
    }

    @d
    @m
    public static final Platform get() {
        return INSTANCE.get();
    }

    public static /* synthetic */ void log$default(Platform platform2, String str, int i10, Throwable th2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i11 & 2) != 0) {
            i10 = 4;
        }
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        platform2.log(str, i10, th2);
    }

    public void afterHandshake(@d SSLSocket sslSocket) {
        f0.p(sslSocket, "sslSocket");
    }

    @d
    public CertificateChainCleaner buildCertificateChainCleaner(@d X509TrustManager trustManager) {
        f0.p(trustManager, "trustManager");
        return new BasicCertificateChainCleaner(buildTrustRootIndex(trustManager));
    }

    @d
    public TrustRootIndex buildTrustRootIndex(@d X509TrustManager trustManager) {
        f0.p(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        f0.o(acceptedIssuers, "trustManager.acceptedIssuers");
        return new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void configureTlsExtensions(@d SSLSocket sslSocket, @e String str, @d List<Protocol> protocols) {
        f0.p(sslSocket, "sslSocket");
        f0.p(protocols, "protocols");
    }

    public void connectSocket(@d Socket socket, @d InetSocketAddress address, int i10) throws IOException {
        f0.p(socket, "socket");
        f0.p(address, "address");
        socket.connect(address, i10);
    }

    @d
    public final String getPrefix() {
        return "OkHttp";
    }

    @e
    public String getSelectedProtocol(@d SSLSocket sslSocket) {
        f0.p(sslSocket, "sslSocket");
        return null;
    }

    @e
    public Object getStackTraceForCloseable(@d String closer) {
        f0.p(closer, "closer");
        if (logger.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    public boolean isCleartextTrafficPermitted(@d String hostname) {
        f0.p(hostname, "hostname");
        return true;
    }

    public void log(@d String message, int i10, @e Throwable th2) {
        f0.p(message, "message");
        logger.log(i10 == 5 ? Level.WARNING : Level.INFO, message, th2);
    }

    public void logCloseableLeak(@d String message, @e Object obj) {
        f0.p(message, "message");
        if (obj == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        log(message, 5, (Throwable) obj);
    }

    @d
    public SSLContext newSSLContext() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        f0.o(sSLContext, "SSLContext.getInstance(\"TLS\")");
        return sSLContext;
    }

    @d
    public SSLSocketFactory newSslSocketFactory(@d X509TrustManager trustManager) {
        f0.p(trustManager, "trustManager");
        try {
            SSLContext sSLContextNewSSLContext = newSSLContext();
            sSLContextNewSSLContext.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextNewSSLContext.getSocketFactory();
            f0.o(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    @d
    public X509TrustManager platformTrustManager() {
        TrustManagerFactory factory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        factory.init((KeyStore) null);
        f0.o(factory, "factory");
        TrustManager[] trustManagers = factory.getTrustManagers();
        f0.m(trustManagers);
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        f0.o(string, "java.util.Arrays.toString(this)");
        sb2.append(string);
        throw new IllegalStateException(sb2.toString().toString());
    }

    @d
    public String toString() {
        String simpleName = getClass().getSimpleName();
        f0.o(simpleName, "javaClass.simpleName");
        return simpleName;
    }

    @e
    public X509TrustManager trustManager(@d SSLSocketFactory sslSocketFactory) {
        f0.p(sslSocketFactory, "sslSocketFactory");
        try {
            Class<?> sslContextClass = Class.forName("sun.security.ssl.SSLContextImpl");
            f0.o(sslContextClass, "sslContextClass");
            Object fieldOrNull = Util.readFieldOrNull(sslSocketFactory, sslContextClass, com.umeng.analytics.pro.d.R);
            if (fieldOrNull != null) {
                return (X509TrustManager) Util.readFieldOrNull(fieldOrNull, X509TrustManager.class, "trustManager");
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
