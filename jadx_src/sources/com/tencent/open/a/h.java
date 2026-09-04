package com.tencent.open.a;

import com.tencent.open.log.SLog;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class h extends SSLSocketFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SSLSocketFactory f101025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TrustManager[] f101026b;

    public h() throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        TrustManager[] trustManagerArrB = b();
        this.f101026b = trustManagerArrB;
        sSLContext.init(null, trustManagerArrB, null);
        this.f101025a = sSLContext.getSocketFactory();
    }

    private Socket a(Socket socket) {
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
        }
        return socket;
    }

    private TrustManager[] b() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                return trustManagers;
            }
            SLog.e("openSDK_LOG.Tls2SupportedSocketFactory", "Unexpected default trust managers: " + Arrays.toString(trustManagers));
            return null;
        } catch (GeneralSecurityException unused) {
            SLog.e("openSDK_LOG.Tls2SupportedSocketFactory", "The system has no TLS. Just give up.");
            return null;
        }
    }

    public TrustManager a() {
        TrustManager[] trustManagerArr = this.f101026b;
        if (trustManagerArr == null || trustManagerArr.length <= 0) {
            return null;
        }
        return trustManagerArr[0];
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10) throws IOException {
        return a(this.f101025a.createSocket(str, i10));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws IOException {
        return a(this.f101025a.createSocket(str, i10, inetAddress, i11));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10) throws IOException {
        return a(this.f101025a.createSocket(inetAddress, i10));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
        return a(this.f101025a.createSocket(inetAddress, i10, inetAddress2, i11));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        return a(this.f101025a.createSocket(socket, str, i10, z10));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.f101025a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.f101025a.getSupportedCipherSuites();
    }
}
