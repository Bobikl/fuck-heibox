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

/* JADX INFO: loaded from: classes7.dex */
public class SecureSSLSocketFactoryNew extends SSLSocketFactory {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f62972i = "SSLFNew";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile SecureSSLSocketFactoryNew f62973j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected SSLContext f62974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected SSLSocket f62975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f62976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String[] f62977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected X509TrustManager f62978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String[] f62979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String[] f62980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected String[] f62981h;

    private SecureSSLSocketFactoryNew(Context context, SecureRandom secureRandom) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException, KeyManagementException {
        this.f62974a = null;
        this.f62975b = null;
        if (context == null) {
            e.b(f62972i, "SecureSSLSocketFactory: context is null");
            return;
        }
        setContext(context);
        setSslContext(SSLUtil.setSSLContext());
        SecureX509TrustManager secureX509SingleInstance = SecureX509SingleInstance.getInstance(context);
        this.f62978e = secureX509SingleInstance;
        this.f62974a.init(null, new X509TrustManager[]{secureX509SingleInstance}, secureRandom);
    }

    @Deprecated
    public SecureSSLSocketFactoryNew(InputStream inputStream, String str) throws NoSuchAlgorithmException, IOException, KeyManagementException, CertificateException, KeyStoreException, IllegalArgumentException {
        this.f62974a = null;
        this.f62975b = null;
        this.f62974a = SSLUtil.setSSLContext();
        HiCloudX509TrustManager hiCloudX509TrustManager = new HiCloudX509TrustManager(inputStream, str);
        setX509TrustManager(hiCloudX509TrustManager);
        this.f62974a.init(null, new X509TrustManager[]{hiCloudX509TrustManager}, null);
    }

    public SecureSSLSocketFactoryNew(InputStream inputStream, String str, SecureRandom secureRandom) throws NoSuchAlgorithmException, IOException, KeyManagementException, CertificateException, KeyStoreException, IllegalArgumentException {
        this.f62974a = null;
        this.f62975b = null;
        this.f62974a = SSLUtil.setSSLContext();
        HiCloudX509TrustManager hiCloudX509TrustManager = new HiCloudX509TrustManager(inputStream, str);
        setX509TrustManager(hiCloudX509TrustManager);
        this.f62974a.init(null, new X509TrustManager[]{hiCloudX509TrustManager}, secureRandom);
    }

    @Deprecated
    public SecureSSLSocketFactoryNew(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException, IllegalArgumentException {
        this.f62974a = null;
        this.f62975b = null;
        this.f62974a = SSLUtil.setSSLContext();
        setX509TrustManager(x509TrustManager);
        this.f62974a.init(null, new X509TrustManager[]{x509TrustManager}, null);
    }

    public SecureSSLSocketFactoryNew(X509TrustManager x509TrustManager, SecureRandom secureRandom) throws NoSuchAlgorithmException, KeyManagementException, IllegalArgumentException {
        this.f62974a = null;
        this.f62975b = null;
        this.f62974a = SSLUtil.setSSLContext();
        setX509TrustManager(x509TrustManager);
        this.f62974a.init(null, new X509TrustManager[]{x509TrustManager}, secureRandom);
    }

    private void a(Socket socket) {
        boolean z10;
        boolean z11 = true;
        if (com.huawei.secure.android.common.ssl.util.a.a(this.f62981h)) {
            z10 = false;
        } else {
            e.c(f62972i, "set protocols");
            SSLUtil.setEnabledProtocols((SSLSocket) socket, this.f62981h);
            z10 = true;
        }
        if (com.huawei.secure.android.common.ssl.util.a.a(this.f62980g) && com.huawei.secure.android.common.ssl.util.a.a(this.f62979f)) {
            z11 = false;
        } else {
            e.c(f62972i, "set cipher");
            SSLSocket sSLSocket = (SSLSocket) socket;
            SSLUtil.setEnabledProtocols(sSLSocket);
            if (com.huawei.secure.android.common.ssl.util.a.a(this.f62980g)) {
                SSLUtil.setBlackListCipherSuites(sSLSocket, this.f62979f);
            } else {
                SSLUtil.setWhiteListCipherSuites(sSLSocket, this.f62980g);
            }
        }
        if (!z10) {
            e.c(f62972i, "set default protocols");
            SSLUtil.setEnabledProtocols((SSLSocket) socket);
        }
        if (z11) {
            return;
        }
        e.c(f62972i, "set default cipher");
        SSLUtil.setEnableSafeCipherSuites((SSLSocket) socket);
    }

    @Deprecated
    public static SecureSSLSocketFactoryNew getInstance(Context context) throws IllegalAccessException, NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException, KeyManagementException, IllegalArgumentException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ContextUtil.setContext(context);
        if (f62973j == null) {
            synchronized (SecureSSLSocketFactoryNew.class) {
                if (f62973j == null) {
                    f62973j = new SecureSSLSocketFactoryNew(context, (SecureRandom) null);
                }
            }
        }
        if (f62973j.f62976c == null && context != null) {
            f62973j.setContext(context);
        }
        e.a(f62972i, "getInstance: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
        return f62973j;
    }

    public static SecureSSLSocketFactoryNew getInstance(Context context, SecureRandom secureRandom) throws IllegalAccessException, NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException, KeyManagementException, IllegalArgumentException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ContextUtil.setContext(context);
        if (f62973j == null) {
            synchronized (SecureSSLSocketFactoryNew.class) {
                if (f62973j == null) {
                    f62973j = new SecureSSLSocketFactoryNew(context, secureRandom);
                }
            }
        }
        if (f62973j.f62976c == null && context != null) {
            f62973j.setContext(context);
        }
        e.a(f62972i, "getInstance: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
        return f62973j;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10) throws IOException {
        e.c(f62972i, "createSocket: host , port");
        Socket socketCreateSocket = this.f62974a.getSocketFactory().createSocket(str, i10);
        if (socketCreateSocket instanceof SSLSocket) {
            a(socketCreateSocket);
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            this.f62975b = sSLSocket;
            this.f62977d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
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
        e.c(f62972i, "createSocket");
        Socket socketCreateSocket = this.f62974a.getSocketFactory().createSocket(socket, str, i10, z10);
        if (socketCreateSocket instanceof SSLSocket) {
            a(socketCreateSocket);
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            this.f62975b = sSLSocket;
            this.f62977d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }

    public String[] getBlackCiphers() {
        return this.f62979f;
    }

    public X509Certificate[] getChain() {
        X509TrustManager x509TrustManager = this.f62978e;
        return x509TrustManager instanceof SecureX509TrustManager ? ((SecureX509TrustManager) x509TrustManager).getChain() : new X509Certificate[0];
    }

    public Context getContext() {
        return this.f62976c;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    public String[] getProtocols() {
        return this.f62981h;
    }

    public SSLContext getSslContext() {
        return this.f62974a;
    }

    public SSLSocket getSslSocket() {
        return this.f62975b;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] strArr = this.f62977d;
        return strArr != null ? strArr : new String[0];
    }

    public String[] getWhiteCiphers() {
        return this.f62980g;
    }

    public X509TrustManager getX509TrustManager() {
        return this.f62978e;
    }

    public void setBlackCiphers(String[] strArr) {
        this.f62979f = strArr;
    }

    public void setContext(Context context) {
        this.f62976c = context.getApplicationContext();
    }

    public void setProtocols(String[] strArr) {
        this.f62981h = strArr;
    }

    public void setSslContext(SSLContext sSLContext) {
        this.f62974a = sSLContext;
    }

    public void setWhiteCiphers(String[] strArr) {
        this.f62980g = strArr;
    }

    public void setX509TrustManager(X509TrustManager x509TrustManager) {
        this.f62978e = x509TrustManager;
    }
}
