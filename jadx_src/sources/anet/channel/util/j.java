package anet.channel.util;

import android.net.SSLCertificateSocketFactory;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class j extends SSLSocketFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30018a = "awcn.TlsSniSocketFactory";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Method f30019b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f30020c;

    public j(String str) {
        this.f30020c = str;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10) throws IOException {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws IOException {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10) throws IOException {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
        return null;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        if (this.f30020c == null) {
            this.f30020c = str;
        }
        if (ALog.isPrintLog(1)) {
            ALog.i("awcn.TlsSniSocketFactory", "customized createSocket", null, "host", this.f30020c);
        }
        InetAddress inetAddress = socket.getInetAddress();
        if (z10) {
            socket.close();
        }
        SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(0);
        SSLSocket sSLSocket = (SSLSocket) sSLCertificateSocketFactory.createSocket(inetAddress, i10);
        sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
        sSLCertificateSocketFactory.setHostname(sSLSocket, this.f30020c);
        SSLSession session = sSLSocket.getSession();
        if (ALog.isPrintLog(1)) {
            ALog.d("awcn.TlsSniSocketFactory", null, null, "SSLSession PeerHost", session.getPeerHost());
        }
        return sSLSocket;
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
