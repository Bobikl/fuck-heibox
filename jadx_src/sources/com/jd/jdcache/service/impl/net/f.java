package com.jd.jdcache.service.impl.net;

import android.os.Build;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: SSLUtils.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class f extends SSLSocketFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final a f64285b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final String[] f64286c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private SSLSocketFactory f64287a;

    /* JADX INFO: compiled from: SSLUtils.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(Socket socket) {
            if (socket instanceof SSLSocket) {
                ((SSLSocket) socket).setEnabledProtocols(f.f64286c);
            }
        }
    }

    static {
        f64286c = Build.VERSION.SDK_INT >= 26 ? new String[]{"TLSv1", "TLSv1.1", "TLSv1.2"} : new String[]{"SSLv3", "TLSv1", "TLSv1.1", "TLSv1.2"};
    }

    public f() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, new SecureRandom());
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            f0.m(socketFactory);
            this.f64287a = socketFactory;
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }

    public f(@dl.d SSLSocketFactory factory) {
        f0.p(factory, "factory");
        this.f64287a = factory;
    }

    @Override // javax.net.SocketFactory
    @dl.d
    public Socket createSocket() throws IOException {
        Socket socketCreateSocket = this.f64287a.createSocket();
        a aVar = f64285b;
        f0.m(socketCreateSocket);
        aVar.b(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    @dl.d
    public Socket createSocket(@dl.d String host, int i10) throws IOException {
        f0.p(host, "host");
        Socket socketCreateSocket = this.f64287a.createSocket(host, i10);
        a aVar = f64285b;
        f0.m(socketCreateSocket);
        aVar.b(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    @dl.d
    public Socket createSocket(@dl.d String host, int i10, @dl.d InetAddress localHost, int i11) throws IOException {
        f0.p(host, "host");
        f0.p(localHost, "localHost");
        Socket socketCreateSocket = this.f64287a.createSocket(host, i10, localHost, i11);
        a aVar = f64285b;
        f0.m(socketCreateSocket);
        aVar.b(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    @dl.d
    public Socket createSocket(@dl.d InetAddress host, int i10) throws IOException {
        f0.p(host, "host");
        Socket socketCreateSocket = this.f64287a.createSocket(host, i10);
        a aVar = f64285b;
        f0.m(socketCreateSocket);
        aVar.b(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    @dl.d
    public Socket createSocket(@dl.d InetAddress address, int i10, @dl.d InetAddress localAddress, int i11) throws IOException {
        f0.p(address, "address");
        f0.p(localAddress, "localAddress");
        Socket socketCreateSocket = this.f64287a.createSocket(address, i10, localAddress, i11);
        a aVar = f64285b;
        f0.m(socketCreateSocket);
        aVar.b(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    @dl.d
    public Socket createSocket(@dl.d Socket s10, @dl.d String host, int i10, boolean z10) throws IOException {
        f0.p(s10, "s");
        f0.p(host, "host");
        Socket socketCreateSocket = this.f64287a.createSocket(s10, host, i10, z10);
        a aVar = f64285b;
        f0.m(socketCreateSocket);
        aVar.b(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    @dl.d
    public String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.f64287a.getDefaultCipherSuites();
        f0.o(defaultCipherSuites, "getDefaultCipherSuites(...)");
        return defaultCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    @dl.d
    public String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.f64287a.getSupportedCipherSuites();
        f0.o(supportedCipherSuites, "getSupportedCipherSuites(...)");
        return supportedCipherSuites;
    }
}
