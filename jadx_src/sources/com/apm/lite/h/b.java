package com.apm.lite.h;

import android.os.Build;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes6.dex */
public class b extends SSLSocketFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f39965b = {"TLSv1", "TLSv1.1", "TLSv1.2", "TLSv1.3"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f39966c = {"TLSv1", "TLSv1.1", "TLSv1.2"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SSLSocketFactory f39967a;

    public b(SSLSocketFactory sSLSocketFactory) {
        this.f39967a = sSLSocketFactory;
    }

    private Socket a(Socket socket) {
        if (socket instanceof SSLSocket) {
            if (Build.VERSION.SDK_INT >= 29) {
                ((SSLSocket) socket).setEnabledProtocols(f39965b);
            } else {
                ((SSLSocket) socket).setEnabledProtocols(f39966c);
            }
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10) {
        return a(this.f39967a.createSocket(str, i10));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) {
        return a(this.f39967a.createSocket(str, i10, inetAddress, i11));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10) {
        return a(this.f39967a.createSocket(inetAddress, i10));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) {
        return a(this.f39967a.createSocket(inetAddress, i10, inetAddress2, i11));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i10, boolean z10) {
        return a(this.f39967a.createSocket(socket, str, i10, z10));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.f39967a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.f39967a.getSupportedCipherSuites();
    }
}
