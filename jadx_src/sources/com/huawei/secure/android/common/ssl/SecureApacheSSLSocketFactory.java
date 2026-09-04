package com.huawei.secure.android.common.ssl;

import android.content.Context;
import com.huawei.secure.android.common.ssl.util.ContextUtil;
import com.huawei.secure.android.common.ssl.util.e;
import java.io.IOException;
import java.io.InputStream;
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
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;

/* JADX INFO: loaded from: classes7.dex */
public class SecureApacheSSLSocketFactory extends SSLSocketFactory {
    public static final X509HostnameVerifier BROWSER_COMPATIBLE_HOSTNAME_VERIFIER = new BrowserCompatHostnameVerifier();
    public static final X509HostnameVerifier STRICT_HOSTNAME_VERIFIER = new StrictHostnameVerifier();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f62952i = SecureApacheSSLSocketFactory.class.getSimpleName();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile SecureApacheSSLSocketFactory f62953j = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SSLContext f62954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SSLSocket f62955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f62956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String[] f62957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private X509TrustManager f62958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String[] f62959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String[] f62960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String[] f62961h;

    private SecureApacheSSLSocketFactory(KeyStore keyStore) throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyManagementException, KeyStoreException {
        super(keyStore);
        this.f62955b = null;
    }

    private SecureApacheSSLSocketFactory(KeyStore keyStore, Context context, SecureRandom secureRandom) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, CertificateException, KeyStoreException, KeyManagementException, IllegalArgumentException {
        super(keyStore);
        this.f62955b = null;
        if (context == null) {
            e.b(f62952i, "SecureSSLSocketFactory: context is null");
            return;
        }
        setContext(context);
        setSslContext(SSLUtil.setSSLContext());
        SecureX509TrustManager secureX509SingleInstance = SecureX509SingleInstance.getInstance(context);
        this.f62958e = secureX509SingleInstance;
        this.f62954a.init(null, new X509TrustManager[]{secureX509SingleInstance}, secureRandom);
    }

    @Deprecated
    public SecureApacheSSLSocketFactory(KeyStore keyStore, InputStream inputStream, String str) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyManagementException, KeyStoreException, CertificateException, IllegalArgumentException {
        super(keyStore);
        this.f62955b = null;
        this.f62954a = SSLUtil.setSSLContext();
        HiCloudX509TrustManager hiCloudX509TrustManager = new HiCloudX509TrustManager(inputStream, str);
        setX509TrustManager(hiCloudX509TrustManager);
        this.f62954a.init(null, new X509TrustManager[]{hiCloudX509TrustManager}, null);
    }

    public SecureApacheSSLSocketFactory(KeyStore keyStore, InputStream inputStream, String str, SecureRandom secureRandom) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyManagementException, KeyStoreException, CertificateException, IllegalArgumentException {
        super(keyStore);
        this.f62955b = null;
        this.f62954a = SSLUtil.setSSLContext();
        HiCloudX509TrustManager hiCloudX509TrustManager = new HiCloudX509TrustManager(inputStream, str);
        setX509TrustManager(hiCloudX509TrustManager);
        this.f62954a.init(null, new X509TrustManager[]{hiCloudX509TrustManager}, secureRandom);
    }

    @Deprecated
    public SecureApacheSSLSocketFactory(KeyStore keyStore, X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyManagementException, KeyStoreException, CertificateException, IllegalArgumentException {
        super(keyStore);
        this.f62955b = null;
        this.f62954a = SSLUtil.setSSLContext();
        setX509TrustManager(x509TrustManager);
        this.f62954a.init(null, new X509TrustManager[]{x509TrustManager}, null);
    }

    public SecureApacheSSLSocketFactory(KeyStore keyStore, X509TrustManager x509TrustManager, SecureRandom secureRandom) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyManagementException, KeyStoreException, CertificateException, IllegalArgumentException {
        super(keyStore);
        this.f62955b = null;
        this.f62954a = SSLUtil.setSSLContext();
        setX509TrustManager(x509TrustManager);
        this.f62954a.init(null, new X509TrustManager[]{x509TrustManager}, secureRandom);
    }

    private void a(Socket socket) {
        boolean z10;
        boolean z11 = true;
        if (com.huawei.secure.android.common.ssl.util.a.a(this.f62961h)) {
            z10 = false;
        } else {
            e.c(f62952i, "set protocols");
            SSLUtil.setEnabledProtocols((SSLSocket) socket, this.f62961h);
            z10 = true;
        }
        if (com.huawei.secure.android.common.ssl.util.a.a(this.f62960g) && com.huawei.secure.android.common.ssl.util.a.a(this.f62959f)) {
            z11 = false;
        } else {
            e.c(f62952i, "set white cipher or black cipher");
            SSLSocket sSLSocket = (SSLSocket) socket;
            SSLUtil.setEnabledProtocols(sSLSocket);
            if (com.huawei.secure.android.common.ssl.util.a.a(this.f62960g)) {
                SSLUtil.setBlackListCipherSuites(sSLSocket, this.f62959f);
            } else {
                SSLUtil.setWhiteListCipherSuites(sSLSocket, this.f62960g);
            }
        }
        if (!z10) {
            e.c(f62952i, "set default protocols");
            SSLUtil.setEnabledProtocols((SSLSocket) socket);
        }
        if (z11) {
            return;
        }
        e.c(f62952i, "set default cipher suites");
        SSLUtil.setEnableSafeCipherSuites((SSLSocket) socket);
    }

    @Deprecated
    static void a(X509TrustManager x509TrustManager) {
        e.c(f62952i, "sasf update socket factory trust manager");
        try {
            f62953j = new SecureApacheSSLSocketFactory(null, x509TrustManager);
        } catch (IOException unused) {
            e.b(f62952i, "IOException");
        } catch (KeyManagementException unused2) {
            e.b(f62952i, "KeyManagementException");
        } catch (KeyStoreException unused3) {
            e.b(f62952i, "KeyStoreException");
        } catch (NoSuchAlgorithmException unused4) {
            e.b(f62952i, "NoSuchAlgorithmException");
        } catch (UnrecoverableKeyException unused5) {
            e.b(f62952i, "UnrecoverableKeyException");
        } catch (CertificateException unused6) {
            e.b(f62952i, "CertificateException");
        }
    }

    static void a(X509TrustManager x509TrustManager, SecureRandom secureRandom) {
        e.c(f62952i, "sasf update socket factory trust manager");
        try {
            f62953j = new SecureApacheSSLSocketFactory((KeyStore) null, x509TrustManager, secureRandom);
        } catch (IOException unused) {
            e.b(f62952i, "IOException");
        } catch (KeyManagementException unused2) {
            e.b(f62952i, "KeyManagementException");
        } catch (KeyStoreException unused3) {
            e.b(f62952i, "KeyStoreException");
        } catch (NoSuchAlgorithmException unused4) {
            e.b(f62952i, "NoSuchAlgorithmException");
        } catch (UnrecoverableKeyException unused5) {
            e.b(f62952i, "UnrecoverableKeyException");
        } catch (CertificateException unused6) {
            e.b(f62952i, "CertificateException");
        }
    }

    @Deprecated
    public static SecureApacheSSLSocketFactory getInstance(KeyStore keyStore, Context context) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyManagementException, KeyStoreException, CertificateException, IllegalArgumentException {
        ContextUtil.setContext(context);
        if (f62953j == null) {
            synchronized (SecureApacheSSLSocketFactory.class) {
                if (f62953j == null) {
                    f62953j = new SecureApacheSSLSocketFactory(keyStore, context, (SecureRandom) null);
                }
            }
        }
        return f62953j;
    }

    public static SecureApacheSSLSocketFactory getInstance(KeyStore keyStore, Context context, SecureRandom secureRandom) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyManagementException, KeyStoreException, CertificateException, IllegalArgumentException {
        ContextUtil.setContext(context);
        if (f62953j == null) {
            synchronized (SecureApacheSSLSocketFactory.class) {
                if (f62953j == null) {
                    f62953j = new SecureApacheSSLSocketFactory(keyStore, context, secureRandom);
                }
            }
        }
        return f62953j;
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.SocketFactory
    public Socket createSocket() throws IOException {
        e.c(f62952i, "createSocket: ");
        Socket socketCreateSocket = this.f62954a.getSocketFactory().createSocket();
        if (socketCreateSocket instanceof SSLSocket) {
            a(socketCreateSocket);
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            this.f62955b = sSLSocket;
            this.f62957d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.LayeredSocketFactory
    public Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        e.c(f62952i, "createSocket: socket host port autoClose");
        Socket socketCreateSocket = this.f62954a.getSocketFactory().createSocket(socket, str, i10, z10);
        if (socketCreateSocket instanceof SSLSocket) {
            a(socketCreateSocket);
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            this.f62955b = sSLSocket;
            this.f62957d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }

    public String[] getBlackCiphers() {
        return this.f62959f;
    }

    public X509Certificate[] getChain() {
        X509TrustManager x509TrustManager = this.f62958e;
        return x509TrustManager instanceof SecureX509TrustManager ? ((SecureX509TrustManager) x509TrustManager).getChain() : new X509Certificate[0];
    }

    public Context getContext() {
        return this.f62956c;
    }

    public String[] getProtocols() {
        return this.f62961h;
    }

    public SSLContext getSslContext() {
        return this.f62954a;
    }

    public SSLSocket getSslSocket() {
        return this.f62955b;
    }

    public String[] getSupportedCipherSuites() {
        String[] strArr = this.f62957d;
        return strArr != null ? strArr : new String[0];
    }

    public String[] getWhiteCiphers() {
        return this.f62960g;
    }

    public X509TrustManager getX509TrustManager() {
        return this.f62958e;
    }

    public void setBlackCiphers(String[] strArr) {
        this.f62959f = strArr;
    }

    public void setContext(Context context) {
        this.f62956c = context.getApplicationContext();
    }

    public void setProtocols(String[] strArr) {
        this.f62961h = strArr;
    }

    public void setSslContext(SSLContext sSLContext) {
        this.f62954a = sSLContext;
    }

    public void setSslSocket(SSLSocket sSLSocket) {
        this.f62955b = sSLSocket;
    }

    public void setWhiteCiphers(String[] strArr) {
        this.f62960g = strArr;
    }

    public void setX509TrustManager(X509TrustManager x509TrustManager) {
        this.f62958e = x509TrustManager;
    }
}
