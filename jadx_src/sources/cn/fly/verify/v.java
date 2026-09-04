package cn.fly.verify;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes6.dex */
public class v extends SSLSocketFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f37015b = {"TLSv1.2"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected SSLSocketFactory f37016a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f37017c;

    public v(SSLSocketFactory sSLSocketFactory) {
        HttpsURLConnection.getDefaultSSLSocketFactory();
        this.f37016a = sSLSocketFactory;
    }

    private Socket a(Socket socket) {
        this.f37017c = socket.getLocalAddress().getHostAddress();
        return socket;
    }

    public String a() {
        return this.f37017c;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        return a(this.f37016a.createSocket());
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10) throws IOException {
        return a(this.f37016a.createSocket(str, i10));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws IOException {
        return a(this.f37016a.createSocket(str, i10, inetAddress, i11));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10) throws IOException {
        return a(this.f37016a.createSocket(inetAddress, i10));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
        return a(this.f37016a.createSocket(inetAddress, i10, inetAddress2, i11));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        return a(this.f37016a.createSocket(socket, str, i10, z10));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.f37016a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.f37016a.getSupportedCipherSuites();
    }

    public String toString() {
        return "Tls12SocketFactory";
    }
}
