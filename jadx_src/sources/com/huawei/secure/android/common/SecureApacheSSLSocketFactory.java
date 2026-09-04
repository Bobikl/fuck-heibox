package com.huawei.secure.android.common;

import android.content.Context;
import com.huawei.secure.android.common.ssl.SSLUtil;
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
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class SecureApacheSSLSocketFactory extends SSLSocketFactory {
    public static final X509HostnameVerifier BROWSER_COMPATIBLE_HOSTNAME_VERIFIER = new BrowserCompatHostnameVerifier();
    public static final X509HostnameVerifier STRICT_HOSTNAME_VERIFIER = new StrictHostnameVerifier();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile SecureApacheSSLSocketFactory f62800c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SSLContext f62801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f62802b;

    private SecureApacheSSLSocketFactory(KeyStore keyStore) throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyManagementException, KeyStoreException {
        super(keyStore);
    }

    private SecureApacheSSLSocketFactory(KeyStore keyStore, Context context, SecureRandom secureRandom) throws IllegalAccessException, NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyManagementException, KeyStoreException, CertificateException {
        super(keyStore);
        this.f62802b = context;
        this.f62801a = SSLUtil.setSSLContext();
        this.f62801a.init(null, new X509TrustManager[]{new SecureX509TrustManager(this.f62802b)}, secureRandom);
    }

    @Deprecated
    public SecureApacheSSLSocketFactory(KeyStore keyStore, InputStream inputStream, String str) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyManagementException, KeyStoreException, CertificateException {
        super(keyStore);
        this.f62801a = SSLUtil.setSSLContext();
        this.f62801a.init(null, new X509TrustManager[]{new HiCloudX509TrustManager(inputStream, str)}, null);
    }

    @Deprecated
    public SecureApacheSSLSocketFactory(KeyStore keyStore, InputStream inputStream, String str, SecureRandom secureRandom) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyManagementException, KeyStoreException, CertificateException {
        super(keyStore);
        this.f62801a = SSLUtil.setSSLContext();
        this.f62801a.init(null, new X509TrustManager[]{new HiCloudX509TrustManager(inputStream, str)}, secureRandom);
    }

    private void a(Socket socket) {
        SSLSocket sSLSocket = (SSLSocket) socket;
        SSLUtil.setEnabledProtocols(sSLSocket);
        SSLUtil.setEnableSafeCipherSuites(sSLSocket);
    }

    @Deprecated
    public static SecureApacheSSLSocketFactory getInstance(KeyStore keyStore, Context context) throws IllegalAccessException, NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyManagementException, KeyStoreException, CertificateException {
        if (f62800c == null) {
            synchronized (SecureApacheSSLSocketFactory.class) {
                if (f62800c == null) {
                    f62800c = new SecureApacheSSLSocketFactory(keyStore, context, (SecureRandom) null);
                }
            }
        }
        return f62800c;
    }

    @Deprecated
    public static SecureApacheSSLSocketFactory getInstance(KeyStore keyStore, Context context, SecureRandom secureRandom) throws IllegalAccessException, NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyManagementException, KeyStoreException, CertificateException {
        if (f62800c == null) {
            synchronized (SecureApacheSSLSocketFactory.class) {
                if (f62800c == null) {
                    f62800c = new SecureApacheSSLSocketFactory(keyStore, context, secureRandom);
                }
            }
        }
        return f62800c;
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.SocketFactory
    public Socket createSocket() throws IOException {
        Socket socketCreateSocket = this.f62801a.getSocketFactory().createSocket();
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.LayeredSocketFactory
    public Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        Socket socketCreateSocket = this.f62801a.getSocketFactory().createSocket(socket, str, i10, z10);
        a(socketCreateSocket);
        return socketCreateSocket;
    }
}
