package com.huawei.secure.android.common.ssl;

import android.content.Context;
import com.huawei.secure.android.common.ssl.util.ContextUtil;
import com.huawei.secure.android.common.ssl.util.e;
import java.io.IOException;
import java.io.InputStream;
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
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class SecureSSLSocketFactory extends SSLSocketFactory {

    @Deprecated
    public static final X509HostnameVerifier BROWSER_COMPATIBLE_HOSTNAME_VERIFIER = new BrowserCompatHostnameVerifier();

    @Deprecated
    public static final X509HostnameVerifier STRICT_HOSTNAME_VERIFIER = new StrictHostnameVerifier();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f62962i = SecureSSLSocketFactory.class.getSimpleName();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile SecureSSLSocketFactory f62963j = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SSLContext f62964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SSLSocket f62965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f62966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String[] f62967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private X509TrustManager f62968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String[] f62969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String[] f62970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String[] f62971h;

    private SecureSSLSocketFactory(Context context, SecureRandom secureRandom) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException, KeyManagementException {
        this.f62964a = null;
        this.f62965b = null;
        if (context == null) {
            e.b(f62962i, "SecureSSLSocketFactory: context is null");
            return;
        }
        setContext(context);
        setSslContext(SSLUtil.setSSLContext());
        SecureX509TrustManager secureX509SingleInstance = SecureX509SingleInstance.getInstance(context);
        this.f62968e = secureX509SingleInstance;
        this.f62964a.init(null, new X509TrustManager[]{secureX509SingleInstance}, secureRandom);
    }

    @Deprecated
    public SecureSSLSocketFactory(InputStream inputStream, String str) throws NoSuchAlgorithmException, IOException, KeyManagementException, CertificateException, KeyStoreException, IllegalArgumentException {
        this.f62964a = null;
        this.f62965b = null;
        this.f62964a = SSLUtil.setSSLContext();
        HiCloudX509TrustManager hiCloudX509TrustManager = new HiCloudX509TrustManager(inputStream, str);
        setX509TrustManager(hiCloudX509TrustManager);
        this.f62964a.init(null, new X509TrustManager[]{hiCloudX509TrustManager}, null);
    }

    public SecureSSLSocketFactory(InputStream inputStream, String str, SecureRandom secureRandom) throws NoSuchAlgorithmException, IOException, KeyManagementException, CertificateException, KeyStoreException, IllegalArgumentException {
        this.f62964a = null;
        this.f62965b = null;
        this.f62964a = SSLUtil.setSSLContext();
        HiCloudX509TrustManager hiCloudX509TrustManager = new HiCloudX509TrustManager(inputStream, str);
        setX509TrustManager(hiCloudX509TrustManager);
        this.f62964a.init(null, new X509TrustManager[]{hiCloudX509TrustManager}, secureRandom);
    }

    @Deprecated
    public SecureSSLSocketFactory(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException, IllegalArgumentException {
        this.f62964a = null;
        this.f62965b = null;
        this.f62964a = SSLUtil.setSSLContext();
        setX509TrustManager(x509TrustManager);
        this.f62964a.init(null, new X509TrustManager[]{x509TrustManager}, null);
    }

    public SecureSSLSocketFactory(X509TrustManager x509TrustManager, SecureRandom secureRandom) throws NoSuchAlgorithmException, KeyManagementException, IllegalArgumentException {
        this.f62964a = null;
        this.f62965b = null;
        this.f62964a = SSLUtil.setSSLContext();
        setX509TrustManager(x509TrustManager);
        this.f62964a.init(null, new X509TrustManager[]{x509TrustManager}, secureRandom);
    }

    private void a(Socket socket) {
        boolean z10;
        boolean z11 = true;
        if (com.huawei.secure.android.common.ssl.util.a.a(this.f62971h)) {
            z10 = false;
        } else {
            e.c(f62962i, "set protocols");
            SSLUtil.setEnabledProtocols((SSLSocket) socket, this.f62971h);
            z10 = true;
        }
        if (com.huawei.secure.android.common.ssl.util.a.a(this.f62970g) && com.huawei.secure.android.common.ssl.util.a.a(this.f62969f)) {
            z11 = false;
        } else {
            e.c(f62962i, "set white cipher or black cipher");
            SSLSocket sSLSocket = (SSLSocket) socket;
            SSLUtil.setEnabledProtocols(sSLSocket);
            if (com.huawei.secure.android.common.ssl.util.a.a(this.f62970g)) {
                SSLUtil.setBlackListCipherSuites(sSLSocket, this.f62969f);
            } else {
                SSLUtil.setWhiteListCipherSuites(sSLSocket, this.f62970g);
            }
        }
        if (!z10) {
            e.c(f62962i, "set default protocols");
            SSLUtil.setEnabledProtocols((SSLSocket) socket);
        }
        if (z11) {
            return;
        }
        e.c(f62962i, "set default cipher suites");
        SSLUtil.setEnableSafeCipherSuites((SSLSocket) socket);
    }

    @Deprecated
    static void a(X509TrustManager x509TrustManager) {
        e.c(f62962i, "ssf update socket factory trust manager");
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            f62963j = new SecureSSLSocketFactory(x509TrustManager);
        } catch (KeyManagementException unused) {
            e.b(f62962i, "KeyManagementException");
        } catch (NoSuchAlgorithmException unused2) {
            e.b(f62962i, "NoSuchAlgorithmException");
        }
        e.a(f62962i, "update: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
    }

    static void a(X509TrustManager x509TrustManager, SecureRandom secureRandom) {
        e.c(f62962i, "ssf update socket factory trust manager");
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            f62963j = new SecureSSLSocketFactory(x509TrustManager, secureRandom);
        } catch (KeyManagementException unused) {
            e.b(f62962i, "KeyManagementException");
        } catch (NoSuchAlgorithmException unused2) {
            e.b(f62962i, "NoSuchAlgorithmException");
        }
        e.a(f62962i, "update: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
    }

    @Deprecated
    public static SecureSSLSocketFactory getInstance(Context context) throws IllegalAccessException, NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException, KeyManagementException, IllegalArgumentException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ContextUtil.setContext(context);
        if (f62963j == null) {
            synchronized (SecureSSLSocketFactory.class) {
                if (f62963j == null) {
                    f62963j = new SecureSSLSocketFactory(context, (SecureRandom) null);
                }
            }
        }
        if (f62963j.f62966c == null && context != null) {
            f62963j.setContext(context);
        }
        e.a(f62962i, "getInstance: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
        return f62963j;
    }

    public static SecureSSLSocketFactory getInstance(Context context, SecureRandom secureRandom) throws IllegalAccessException, NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException, KeyManagementException, IllegalArgumentException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ContextUtil.setContext(context);
        if (f62963j == null) {
            synchronized (SecureSSLSocketFactory.class) {
                if (f62963j == null) {
                    f62963j = new SecureSSLSocketFactory(context, secureRandom);
                }
            }
        }
        if (f62963j.f62966c == null && context != null) {
            f62963j.setContext(context);
        }
        e.a(f62962i, "getInstance: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
        return f62963j;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10) throws IOException {
        e.c(f62962i, "createSocket: host , port");
        Socket socketCreateSocket = this.f62964a.getSocketFactory().createSocket(str, i10);
        if (socketCreateSocket instanceof SSLSocket) {
            a(socketCreateSocket);
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            this.f62965b = sSLSocket;
            this.f62967d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
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
        e.c(f62962i, "createSocket s host port autoClose");
        Socket socketCreateSocket = this.f62964a.getSocketFactory().createSocket(socket, str, i10, z10);
        if (socketCreateSocket instanceof SSLSocket) {
            a(socketCreateSocket);
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            this.f62965b = sSLSocket;
            this.f62967d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }

    public String[] getBlackCiphers() {
        return this.f62969f;
    }

    public X509Certificate[] getChain() {
        X509TrustManager x509TrustManager = this.f62968e;
        return x509TrustManager instanceof SecureX509TrustManager ? ((SecureX509TrustManager) x509TrustManager).getChain() : new X509Certificate[0];
    }

    public Context getContext() {
        return this.f62966c;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    public String[] getProtocols() {
        return this.f62971h;
    }

    public SSLContext getSslContext() {
        return this.f62964a;
    }

    public SSLSocket getSslSocket() {
        return this.f62965b;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] strArr = this.f62967d;
        return strArr != null ? strArr : new String[0];
    }

    public String[] getWhiteCiphers() {
        return this.f62970g;
    }

    public X509TrustManager getX509TrustManager() {
        return this.f62968e;
    }

    public void setBlackCiphers(String[] strArr) {
        this.f62969f = strArr;
    }

    public void setContext(Context context) {
        this.f62966c = context.getApplicationContext();
    }

    public void setProtocols(String[] strArr) {
        this.f62971h = strArr;
    }

    public void setSslContext(SSLContext sSLContext) {
        this.f62964a = sSLContext;
    }

    public void setWhiteCiphers(String[] strArr) {
        this.f62970g = strArr;
    }

    public void setX509TrustManager(X509TrustManager x509TrustManager) {
        this.f62968e = x509TrustManager;
    }
}
