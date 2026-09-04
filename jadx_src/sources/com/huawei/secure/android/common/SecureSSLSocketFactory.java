package com.huawei.secure.android.common;

import android.content.Context;
import com.huawei.secure.android.common.ssl.SSLUtil;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
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
    public static final X509HostnameVerifier BROWSER_COMPATIBLE_HOSTNAME_VERIFIER = new BrowserCompatHostnameVerifier();
    public static final X509HostnameVerifier STRICT_HOSTNAME_VERIFIER = new StrictHostnameVerifier();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile SecureSSLSocketFactory f62803c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SSLContext f62804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f62805b;

    private SecureSSLSocketFactory(Context context, SecureRandom secureRandom) throws IllegalAccessException, NoSuchAlgorithmException, IOException, KeyManagementException, CertificateException, KeyStoreException {
        this.f62804a = null;
        this.f62805b = context;
        this.f62804a = SSLUtil.setSSLContext();
        this.f62804a.init(null, new X509TrustManager[]{new SecureX509TrustManager(this.f62805b)}, secureRandom);
    }

    @Deprecated
    public SecureSSLSocketFactory(InputStream inputStream, String str) throws NoSuchAlgorithmException, IOException, KeyManagementException, CertificateException, KeyStoreException {
        this.f62804a = null;
        this.f62804a = SSLUtil.setSSLContext();
        this.f62804a.init(null, new X509TrustManager[]{new HiCloudX509TrustManager(inputStream, str)}, null);
    }

    @Deprecated
    public SecureSSLSocketFactory(InputStream inputStream, String str, SecureRandom secureRandom) throws NoSuchAlgorithmException, IOException, KeyManagementException, CertificateException, KeyStoreException {
        this.f62804a = null;
        this.f62804a = SSLUtil.setSSLContext();
        this.f62804a.init(null, new X509TrustManager[]{new HiCloudX509TrustManager(inputStream, str)}, secureRandom);
    }

    private void a(Socket socket) {
        SSLSocket sSLSocket = (SSLSocket) socket;
        SSLUtil.setEnabledProtocols(sSLSocket);
        SSLUtil.setEnableSafeCipherSuites(sSLSocket);
    }

    @Deprecated
    public static SecureSSLSocketFactory getInstance(Context context) throws IllegalAccessException, NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException, KeyManagementException {
        if (f62803c == null) {
            synchronized (SecureSSLSocketFactory.class) {
                if (f62803c == null) {
                    f62803c = new SecureSSLSocketFactory(context, (SecureRandom) null);
                }
            }
        }
        return f62803c;
    }

    @Deprecated
    public static SecureSSLSocketFactory getInstance(Context context, SecureRandom secureRandom) throws IllegalAccessException, NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException, KeyManagementException {
        if (f62803c == null) {
            synchronized (SecureSSLSocketFactory.class) {
                if (f62803c == null) {
                    f62803c = new SecureSSLSocketFactory(context, secureRandom);
                }
            }
        }
        return f62803c;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10) throws IOException {
        Socket socketCreateSocket = this.f62804a.getSocketFactory().createSocket(str, i10);
        if (socketCreateSocket instanceof SSLSocket) {
            a(socketCreateSocket);
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
        Socket socketCreateSocket = this.f62804a.getSocketFactory().createSocket(socket, str, i10, z10);
        if (socketCreateSocket instanceof SSLSocket) {
            a(socketCreateSocket);
        }
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return new String[0];
    }
}
