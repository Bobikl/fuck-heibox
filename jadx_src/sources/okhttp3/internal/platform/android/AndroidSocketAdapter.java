package okhttp3.internal.platform.android;

import dl.d;
import dl.e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import lg.a;
import okhttp3.Protocol;
import okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.Platform;

/* JADX INFO: compiled from: AndroidSocketAdapter.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00040\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0014\u001a\n \u0012*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0015\u001a\n \u0012*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0017\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00040\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lokhttp3/internal/platform/android/AndroidSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "", "isSupported", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "matchesSocket", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "Lkotlin/b2;", "configureTlsExtensions", "getSelectedProtocol", "Ljava/lang/reflect/Method;", "setUseSessionTickets", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "setHostname", "getAlpnSelectedProtocol", "setAlpnProtocols", "Ljava/lang/Class;", "sslSocketClass", "Ljava/lang/Class;", "<init>", "(Ljava/lang/Class;)V", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
public class AndroidSocketAdapter implements SocketAdapter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    @d
    private static final DeferredSocketAdapter.Factory playProviderFactory;
    private final Method getAlpnSelectedProtocol;
    private final Method setAlpnProtocols;
    private final Method setHostname;
    private final Method setUseSessionTickets;
    private final Class<? super SSLSocket> sslSocketClass;

    /* JADX INFO: compiled from: AndroidSocketAdapter.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u000b0\nH\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/platform/android/AndroidSocketAdapter$Companion;", "", "()V", "playProviderFactory", "Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "getPlayProviderFactory", "()Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "build", "Lokhttp3/internal/platform/android/AndroidSocketAdapter;", "actualSSLSocketClass", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "factory", "packageName", "", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AndroidSocketAdapter build(Class<? super SSLSocket> actualSSLSocketClass) {
            Class<? super SSLSocket> superclass = actualSSLSocketClass;
            while (superclass != null && (!f0.g(superclass.getSimpleName(), "OpenSSLSocketImpl"))) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + actualSSLSocketClass);
                }
            }
            f0.m(superclass);
            return new AndroidSocketAdapter(superclass);
        }

        @d
        public final DeferredSocketAdapter.Factory factory(@d final String packageName) {
            f0.p(packageName, "packageName");
            return new DeferredSocketAdapter.Factory() { // from class: okhttp3.internal.platform.android.AndroidSocketAdapter$Companion$factory$1
                @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
                @d
                public SocketAdapter create(@d SSLSocket sslSocket) {
                    f0.p(sslSocket, "sslSocket");
                    return AndroidSocketAdapter.INSTANCE.build(sslSocket.getClass());
                }

                @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
                public boolean matchesSocket(@d SSLSocket sslSocket) {
                    f0.p(sslSocket, "sslSocket");
                    String name = sslSocket.getClass().getName();
                    f0.o(name, "sslSocket.javaClass.name");
                    return kotlin.text.u.v2(name, packageName + a.f131414g, false, 2, null);
                }
            };
        }

        @d
        public final DeferredSocketAdapter.Factory getPlayProviderFactory() {
            return AndroidSocketAdapter.playProviderFactory;
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        playProviderFactory = companion.factory("com.google.android.gms.org.conscrypt");
    }

    public AndroidSocketAdapter(@d Class<? super SSLSocket> sslSocketClass) throws NoSuchMethodException {
        f0.p(sslSocketClass, "sslSocketClass");
        this.sslSocketClass = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        f0.o(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.setUseSessionTickets = declaredMethod;
        this.setHostname = sslSocketClass.getMethod("setHostname", String.class);
        this.getAlpnSelectedProtocol = sslSocketClass.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.setAlpnProtocols = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public void configureTlsExtensions(@d SSLSocket sslSocket, @e String str, @d List<? extends Protocol> protocols) {
        f0.p(sslSocket, "sslSocket");
        f0.p(protocols, "protocols");
        if (matchesSocket(sslSocket)) {
            try {
                this.setUseSessionTickets.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.setHostname.invoke(sslSocket, str);
                }
                this.setAlpnProtocols.invoke(sslSocket, Platform.INSTANCE.concatLengthPrefixed(protocols));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    @e
    public String getSelectedProtocol(@d SSLSocket sslSocket) {
        f0.p(sslSocket, "sslSocket");
        if (!matchesSocket(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.getAlpnSelectedProtocol.invoke(sslSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            f0.o(charset, "StandardCharsets.UTF_8");
            return new String(bArr, charset);
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (NullPointerException e11) {
            if (f0.g(e11.getMessage(), "ssl == null")) {
                return null;
            }
            throw e11;
        } catch (InvocationTargetException e12) {
            throw new AssertionError(e12);
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
        return AndroidPlatform.INSTANCE.isSupported();
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocket(@d SSLSocket sslSocket) {
        f0.p(sslSocket, "sslSocket");
        return this.sslSocketClass.isInstance(sslSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocketFactory(@d SSLSocketFactory sslSocketFactory) {
        f0.p(sslSocketFactory, "sslSocketFactory");
        return SocketAdapter.DefaultImpls.matchesSocketFactory(this, sslSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    @e
    public X509TrustManager trustManager(@d SSLSocketFactory sslSocketFactory) {
        f0.p(sslSocketFactory, "sslSocketFactory");
        return SocketAdapter.DefaultImpls.trustManager(this, sslSocketFactory);
    }
}
