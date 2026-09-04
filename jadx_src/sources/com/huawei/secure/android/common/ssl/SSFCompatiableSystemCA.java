package com.huawei.secure.android.common.ssl;

import android.content.Context;
import com.huawei.secure.android.common.ssl.util.ContextUtil;
import com.huawei.secure.android.common.ssl.util.e;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes7.dex */
public class SSFCompatiableSystemCA extends SSLSocketFactory {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f62932i = SSFCompatiableSystemCA.class.getSimpleName();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile SSFCompatiableSystemCA f62933j = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SSLContext f62934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SSLSocket f62935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f62936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String[] f62937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private X509TrustManager f62938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String[] f62939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String[] f62940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String[] f62941h;

    private SSFCompatiableSystemCA(Context context, SecureRandom secureRandom) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException, KeyManagementException {
        this.f62934a = null;
        this.f62935b = null;
        if (context == null) {
            e.b(f62932i, "SecureSSLSocketFactory: context is null");
            return;
        }
        setContext(context);
        setSslContext(SSLUtil.setSSLContext());
        SecureX509TrustManager sSFSecureX509SingleInstance = SSFSecureX509SingleInstance.getInstance(context);
        this.f62938e = sSFSecureX509SingleInstance;
        this.f62934a.init(null, new X509TrustManager[]{sSFSecureX509SingleInstance}, secureRandom);
    }

    @Deprecated
    public SSFCompatiableSystemCA(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException, IllegalArgumentException {
        this.f62934a = null;
        this.f62935b = null;
        this.f62934a = SSLUtil.setSSLContext();
        setX509TrustManager(x509TrustManager);
        this.f62934a.init(null, new X509TrustManager[]{x509TrustManager}, null);
    }

    public SSFCompatiableSystemCA(X509TrustManager x509TrustManager, SecureRandom secureRandom) throws NoSuchAlgorithmException, KeyManagementException, IllegalArgumentException {
        this.f62934a = null;
        this.f62935b = null;
        this.f62934a = SSLUtil.setSSLContext();
        setX509TrustManager(x509TrustManager);
        this.f62934a.init(null, new X509TrustManager[]{x509TrustManager}, secureRandom);
    }

    private void a(Socket socket) {
        boolean z10;
        boolean z11 = true;
        if (com.huawei.secure.android.common.ssl.util.a.a(this.f62941h)) {
            z10 = false;
        } else {
            e.c(f62932i, "set protocols");
            SSLUtil.setEnabledProtocols((SSLSocket) socket, this.f62941h);
            z10 = true;
        }
        if (com.huawei.secure.android.common.ssl.util.a.a(this.f62940g) && com.huawei.secure.android.common.ssl.util.a.a(this.f62939f)) {
            z11 = false;
        } else {
            e.c(f62932i, "set white cipher or black cipher");
            SSLSocket sSLSocket = (SSLSocket) socket;
            SSLUtil.setEnabledProtocols(sSLSocket);
            if (com.huawei.secure.android.common.ssl.util.a.a(this.f62940g)) {
                SSLUtil.setBlackListCipherSuites(sSLSocket, this.f62939f);
            } else {
                SSLUtil.setWhiteListCipherSuites(sSLSocket, this.f62940g);
            }
        }
        if (!z10) {
            e.c(f62932i, "set default protocols");
            SSLUtil.setEnabledProtocols((SSLSocket) socket);
        }
        if (z11) {
            return;
        }
        e.c(f62932i, "set default cipher suites");
        SSLUtil.setEnableSafeCipherSuites((SSLSocket) socket);
    }

    @Deprecated
    static void a(X509TrustManager x509TrustManager) {
        e.c(f62932i, "ssfc update socket factory trust manager");
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            f62933j = new SSFCompatiableSystemCA(x509TrustManager);
        } catch (KeyManagementException unused) {
            e.b(f62932i, "KeyManagementException");
        } catch (NoSuchAlgorithmException unused2) {
            e.b(f62932i, "NoSuchAlgorithmException");
        }
        e.a(f62932i, "SSF system ca update: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
    }

    static void a(X509TrustManager x509TrustManager, SecureRandom secureRandom) {
        e.c(f62932i, "ssfc update socket factory trust manager");
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            f62933j = new SSFCompatiableSystemCA(x509TrustManager, secureRandom);
        } catch (KeyManagementException unused) {
            e.b(f62932i, "KeyManagementException");
        } catch (NoSuchAlgorithmException unused2) {
            e.b(f62932i, "NoSuchAlgorithmException");
        }
        e.a(f62932i, "SSF system ca update: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
    }

    @Deprecated
    public static SSFCompatiableSystemCA getInstance(Context context) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException, KeyManagementException, IllegalArgumentException {
        ContextUtil.setContext(context);
        if (f62933j == null) {
            synchronized (SSFCompatiableSystemCA.class) {
                if (f62933j == null) {
                    f62933j = new SSFCompatiableSystemCA(context, (SecureRandom) null);
                }
            }
        }
        if (f62933j.f62936c == null && context != null) {
            f62933j.setContext(context);
        }
        return f62933j;
    }

    public static SSFCompatiableSystemCA getInstance(Context context, SecureRandom secureRandom) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException, KeyManagementException, IllegalArgumentException {
        ContextUtil.setContext(context);
        if (f62933j == null) {
            synchronized (SSFCompatiableSystemCA.class) {
                if (f62933j == null) {
                    f62933j = new SSFCompatiableSystemCA(context, secureRandom);
                }
            }
        }
        if (f62933j.f62936c == null && context != null) {
            f62933j.setContext(context);
        }
        return f62933j;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10) throws IOException {
        e.c(f62932i, "createSocket: host , port");
        Socket socketCreateSocket = this.f62934a.getSocketFactory().createSocket(str, i10);
        if (socketCreateSocket instanceof SSLSocket) {
            a(socketCreateSocket);
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            this.f62935b = sSLSocket;
            this.f62937d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws IOException {
        return createSocket(str, i10);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i10);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i10);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        e.c(f62932i, "createSocket: s , host , port , autoClose");
        Socket socketCreateSocket = this.f62934a.getSocketFactory().createSocket(socket, str, i10, z10);
        if (socketCreateSocket instanceof SSLSocket) {
            a(socketCreateSocket);
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            this.f62935b = sSLSocket;
            this.f62937d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }

    public String[] getBlackCiphers() {
        return this.f62939f;
    }

    public X509Certificate[] getChain() {
        X509TrustManager x509TrustManager = this.f62938e;
        return x509TrustManager instanceof SecureX509TrustManager ? ((SecureX509TrustManager) x509TrustManager).getChain() : new X509Certificate[0];
    }

    public Context getContext() {
        return this.f62936c;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    public String[] getProtocols() {
        return this.f62941h;
    }

    public SSLContext getSslContext() {
        return this.f62934a;
    }

    public SSLSocket getSslSocket() {
        return this.f62935b;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] strArr = this.f62937d;
        return strArr != null ? strArr : new String[0];
    }

    public String[] getWhiteCiphers() {
        return this.f62940g;
    }

    public X509TrustManager getX509TrustManager() {
        return this.f62938e;
    }

    public void setBlackCiphers(String[] strArr) {
        this.f62939f = strArr;
    }

    public void setContext(Context context) {
        this.f62936c = context.getApplicationContext();
    }

    public void setProtocols(String[] strArr) {
        this.f62941h = strArr;
    }

    public void setSslContext(SSLContext sSLContext) {
        this.f62934a = sSLContext;
    }

    public void setWhiteCiphers(String[] strArr) {
        this.f62940g = strArr;
    }

    public void setX509TrustManager(X509TrustManager x509TrustManager) {
        this.f62938e = x509TrustManager;
    }
}
