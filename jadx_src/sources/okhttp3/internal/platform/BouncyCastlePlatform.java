package okhttp3.internal.platform;

import com.umeng.analytics.pro.d;
import dl.e;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import okhttp3.Protocol;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* JADX INFO: compiled from: BouncyCastlePlatform.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J-\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\u0010\u001a\r\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f0\rH\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/platform/BouncyCastlePlatform;", "Lokhttp3/internal/platform/Platform;", "Ljavax/net/ssl/SSLContext;", "newSSLContext", "Ljavax/net/ssl/X509TrustManager;", "platformTrustManager", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "trustManager", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/Protocol;", "Lxh/n;", "protocols", "Lkotlin/b2;", "configureTlsExtensions", "getSelectedProtocol", "Ljava/security/Provider;", d.M, "Ljava/security/Provider;", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class BouncyCastlePlatform extends Platform {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final boolean isSupported;
    private final Provider provider;

    /* JADX INFO: compiled from: BouncyCastlePlatform.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005¨\u0006\b"}, d2 = {"Lokhttp3/internal/platform/BouncyCastlePlatform$Companion;", "", "()V", "isSupported", "", "()Z", "buildIfSupported", "Lokhttp3/internal/platform/BouncyCastlePlatform;", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @e
        public final BouncyCastlePlatform buildIfSupported() {
            u uVar = null;
            if (isSupported()) {
                return new BouncyCastlePlatform(uVar);
            }
            return null;
        }

        public final boolean isSupported() {
            return BouncyCastlePlatform.isSupported;
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        boolean z10 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, companion.getClass().getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        isSupported = z10;
    }

    private BouncyCastlePlatform() {
        this.provider = new BouncyCastleJsseProvider();
    }

    public /* synthetic */ BouncyCastlePlatform(u uVar) {
        this();
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(@dl.d SSLSocket sslSocket, @e String str, @dl.d List<Protocol> protocols) {
        f0.p(sslSocket, "sslSocket");
        f0.p(protocols, "protocols");
        if (!(sslSocket instanceof BCSSLSocket)) {
            super.configureTlsExtensions(sslSocket, str, protocols);
            return;
        }
        BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
        BCSSLParameters sslParameters = bCSSLSocket.getParameters();
        List<String> listAlpnProtocolNames = Platform.INSTANCE.alpnProtocolNames(protocols);
        f0.o(sslParameters, "sslParameters");
        Object[] array = listAlpnProtocolNames.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        sslParameters.setApplicationProtocols((String[]) array);
        bCSSLSocket.setParameters(sslParameters);
    }

    @Override // okhttp3.internal.platform.Platform
    @e
    public String getSelectedProtocol(@dl.d SSLSocket sslSocket) {
        f0.p(sslSocket, "sslSocket");
        if (!(sslSocket instanceof BCSSLSocket)) {
            return super.getSelectedProtocol(sslSocket);
        }
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // okhttp3.internal.platform.Platform
    @dl.d
    public SSLContext newSSLContext() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.provider);
        f0.o(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // okhttp3.internal.platform.Platform
    @dl.d
    public X509TrustManager platformTrustManager() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        TrustManagerFactory factory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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

    @Override // okhttp3.internal.platform.Platform
    @e
    public X509TrustManager trustManager(@dl.d SSLSocketFactory sslSocketFactory) {
        f0.p(sslSocketFactory, "sslSocketFactory");
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported with BouncyCastle");
    }
}
