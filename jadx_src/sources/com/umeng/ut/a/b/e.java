package com.umeng.ut.a.b;

import android.net.SSLCertificateSocketFactory;
import android.os.Build;
import android.text.TextUtils;
import com.max.xiaoheihe.module.voice.HeyboxMicFragment;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes4.dex */
public class e extends SSLSocketFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f106422b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Method f106421a = null;
    private HostnameVerifier hostnameVerifier = HttpsURLConnection.getDefaultHostnameVerifier();

    public e(String str) {
        this.f106422b = str;
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
        com.umeng.ut.a.c.e.b("", "peerHost", this.f106422b, "host", str, HeyboxMicFragment.f93763y, Integer.valueOf(i10), "autoClose", Boolean.valueOf(z10));
        SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(0);
        if (Build.VERSION.SDK_INT < 24) {
            sSLCertificateSocketFactory.setTrustManagers(f.getTrustManagers());
        } else {
            sSLCertificateSocketFactory.setTrustManagers(c.getTrustManagers());
        }
        com.umeng.ut.a.c.e.m56a("", "createSocket");
        SSLSocket sSLSocket = (SSLSocket) sSLCertificateSocketFactory.createSocket(socket, this.f106422b, i10, true);
        com.umeng.ut.a.c.e.m56a("", "createSocket end");
        sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
        sSLCertificateSocketFactory.setHostname(sSLSocket, this.f106422b);
        SSLSession session = sSLSocket.getSession();
        if (this.hostnameVerifier.verify(this.f106422b, session)) {
            com.umeng.ut.a.c.e.b("", "SSLSession PeerHost", session.getPeerHost());
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: " + this.f106422b);
    }

    public boolean equals(Object obj) {
        if (TextUtils.isEmpty(this.f106422b) || !(obj instanceof e)) {
            return false;
        }
        String str = ((e) obj).f106422b;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f106422b.equals(str);
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
