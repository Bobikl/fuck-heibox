package com.huawei.secure.android.common.ssl;

import android.content.Context;
import com.huawei.secure.android.common.ssl.util.ContextUtil;
import com.huawei.secure.android.common.ssl.util.e;
import java.io.IOException;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes7.dex */
public class SASFCompatiableSystemCA extends SSLSocketFactory {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f62922i = SASFCompatiableSystemCA.class.getSimpleName();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile SASFCompatiableSystemCA f62923j = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SSLContext f62924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SSLSocket f62925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f62926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String[] f62927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private X509TrustManager f62928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String[] f62929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String[] f62930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String[] f62931h;

    private SASFCompatiableSystemCA(KeyStore keyStore) throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyManagementException, KeyStoreException {
        super(keyStore);
        this.f62925b = null;
    }

    private SASFCompatiableSystemCA(KeyStore keyStore, Context context, SecureRandom secureRandom) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, CertificateException, KeyStoreException, KeyManagementException, IllegalArgumentException {
        super(keyStore);
        this.f62925b = null;
        if (context == null) {
            e.b(f62922i, "SecureSSLSocketFactory: context is null");
            return;
        }
        setContext(context);
        setSslContext(SSLUtil.setSSLContext());
        SecureX509TrustManager sSFSecureX509SingleInstance = SSFSecureX509SingleInstance.getInstance(context);
        this.f62928e = sSFSecureX509SingleInstance;
        this.f62924a.init(null, new X509TrustManager[]{sSFSecureX509SingleInstance}, secureRandom);
    }

    @Deprecated
    public SASFCompatiableSystemCA(KeyStore keyStore, X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyManagementException, KeyStoreException, IllegalArgumentException {
        super(keyStore);
        this.f62925b = null;
        this.f62924a = SSLUtil.setSSLContext();
        setX509TrustManager(x509TrustManager);
        this.f62924a.init(null, new X509TrustManager[]{x509TrustManager}, null);
    }

    public SASFCompatiableSystemCA(KeyStore keyStore, X509TrustManager x509TrustManager, SecureRandom secureRandom) throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyManagementException, KeyStoreException, IllegalArgumentException {
        super(keyStore);
        this.f62925b = null;
        this.f62924a = SSLUtil.setSSLContext();
        setX509TrustManager(x509TrustManager);
        this.f62924a.init(null, new X509TrustManager[]{x509TrustManager}, secureRandom);
    }

    private void a(Socket socket) {
        boolean z10;
        boolean z11 = true;
        if (com.huawei.secure.android.common.ssl.util.a.a(this.f62931h)) {
            z10 = false;
        } else {
            e.c(f62922i, "set protocols");
            SSLUtil.setEnabledProtocols((SSLSocket) socket, this.f62931h);
            z10 = true;
        }
        if (com.huawei.secure.android.common.ssl.util.a.a(this.f62930g) && com.huawei.secure.android.common.ssl.util.a.a(this.f62929f)) {
            z11 = false;
        } else {
            e.c(f62922i, "set white cipher or black cipher");
            SSLSocket sSLSocket = (SSLSocket) socket;
            SSLUtil.setEnabledProtocols(sSLSocket);
            if (com.huawei.secure.android.common.ssl.util.a.a(this.f62930g)) {
                SSLUtil.setBlackListCipherSuites(sSLSocket, this.f62929f);
            } else {
                SSLUtil.setWhiteListCipherSuites(sSLSocket, this.f62930g);
            }
        }
        if (!z10) {
            e.c(f62922i, "set default protocols");
            SSLUtil.setEnabledProtocols((SSLSocket) socket);
        }
        if (z11) {
            return;
        }
        e.c(f62922i, "set default cipher suites");
        SSLUtil.setEnableSafeCipherSuites((SSLSocket) socket);
    }

    @Deprecated
    static void a(X509TrustManager x509TrustManager) {
        e.c(f62922i, "sasfc update socket factory trust manager");
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            f62923j = new SASFCompatiableSystemCA(null, x509TrustManager);
        } catch (KeyManagementException unused) {
            e.b(f62922i, "KeyManagementException");
        } catch (KeyStoreException unused2) {
            e.b(f62922i, "KeyStoreException");
        } catch (NoSuchAlgorithmException unused3) {
            e.b(f62922i, "NoSuchAlgorithmException");
        } catch (UnrecoverableKeyException unused4) {
            e.b(f62922i, "UnrecoverableKeyException");
        }
        e.a(f62922i, "sasf system ca update: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
    }

    static void a(X509TrustManager x509TrustManager, SecureRandom secureRandom) {
        e.c(f62922i, "sasfc update socket factory trust manager");
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            f62923j = new SASFCompatiableSystemCA((KeyStore) null, x509TrustManager, secureRandom);
        } catch (KeyManagementException unused) {
            e.b(f62922i, "KeyManagementException");
        } catch (KeyStoreException unused2) {
            e.b(f62922i, "KeyStoreException");
        } catch (NoSuchAlgorithmException unused3) {
            e.b(f62922i, "NoSuchAlgorithmException");
        } catch (UnrecoverableKeyException unused4) {
            e.b(f62922i, "UnrecoverableKeyException");
        }
        e.a(f62922i, "sasf system ca update: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
    }

    @Deprecated
    public static SASFCompatiableSystemCA getInstance(KeyStore keyStore, Context context) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyManagementException, KeyStoreException, CertificateException, IllegalArgumentException {
        ContextUtil.setContext(context);
        if (f62923j == null) {
            synchronized (SecureApacheSSLSocketFactory.class) {
                if (f62923j == null) {
                    f62923j = new SASFCompatiableSystemCA(keyStore, context, (SecureRandom) null);
                }
            }
        }
        return f62923j;
    }

    public static SASFCompatiableSystemCA getInstance(KeyStore keyStore, Context context, SecureRandom secureRandom) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyManagementException, KeyStoreException, CertificateException, IllegalArgumentException {
        ContextUtil.setContext(context);
        if (f62923j == null) {
            synchronized (SecureApacheSSLSocketFactory.class) {
                if (f62923j == null) {
                    f62923j = new SASFCompatiableSystemCA(keyStore, context, secureRandom);
                }
            }
        }
        return f62923j;
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.SocketFactory
    public Socket createSocket() throws IOException {
        e.c(f62922i, "createSocket: ");
        Socket socketCreateSocket = this.f62924a.getSocketFactory().createSocket();
        if (socketCreateSocket instanceof SSLSocket) {
            a(socketCreateSocket);
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            this.f62925b = sSLSocket;
            this.f62927d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.LayeredSocketFactory
    public Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        e.c(f62922i, "createSocket: socket host port autoClose");
        Socket socketCreateSocket = this.f62924a.getSocketFactory().createSocket(socket, str, i10, z10);
        if (socketCreateSocket instanceof SSLSocket) {
            a(socketCreateSocket);
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            this.f62925b = sSLSocket;
            this.f62927d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }

    public String[] getBlackCiphers() {
        return this.f62929f;
    }

    public X509Certificate[] getChain() {
        X509TrustManager x509TrustManager = this.f62928e;
        return x509TrustManager instanceof SecureX509TrustManager ? ((SecureX509TrustManager) x509TrustManager).getChain() : new X509Certificate[0];
    }

    public Context getContext() {
        return this.f62926c;
    }

    public String[] getProtocols() {
        return this.f62931h;
    }

    public SSLContext getSslContext() {
        return this.f62924a;
    }

    public SSLSocket getSslSocket() {
        return this.f62925b;
    }

    public String[] getSupportedCipherSuites() {
        String[] strArr = this.f62927d;
        return strArr != null ? strArr : new String[0];
    }

    public String[] getWhiteCiphers() {
        return this.f62930g;
    }

    public X509TrustManager getX509TrustManager() {
        return this.f62928e;
    }

    public void setBlackCiphers(String[] strArr) {
        this.f62929f = strArr;
    }

    public void setContext(Context context) {
        this.f62926c = context.getApplicationContext();
    }

    public void setProtocols(String[] strArr) {
        this.f62931h = strArr;
    }

    public void setSslContext(SSLContext sSLContext) {
        this.f62924a = sSLContext;
    }

    public void setSslSocket(SSLSocket sSLSocket) {
        this.f62925b = sSLSocket;
    }

    public void setWhiteCiphers(String[] strArr) {
        this.f62930g = strArr;
    }

    public void setX509TrustManager(X509TrustManager x509TrustManager) {
        this.f62928e = x509TrustManager;
    }
}
