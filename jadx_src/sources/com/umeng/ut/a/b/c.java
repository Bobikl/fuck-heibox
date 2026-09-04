package com.umeng.ut.a.b;

import android.annotation.TargetApi;
import java.net.Socket;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes4.dex */
@TargetApi(24)
public class c extends X509ExtendedTrustManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static TrustManager[] f106419a;

    c() {
    }

    static synchronized TrustManager[] getTrustManagers() {
        if (f106419a == null) {
            f106419a = new TrustManager[]{new c()};
        }
        return f106419a;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        com.umeng.ut.a.c.e.m56a("UtExtendTrustManager", "checkClientTrusted1");
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        com.umeng.ut.a.c.e.m56a("UtExtendTrustManager", "checkClientTrusted2");
        if (x509CertificateArr == null || x509CertificateArr.length == 0) {
            throw new IllegalArgumentException("parameter is not used");
        }
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("parameter is not used");
        }
        try {
            x509CertificateArr[0].checkValidity();
        } catch (Exception unused) {
            throw new CertificateException("Certificate not valid or trusted.");
        }
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        com.umeng.ut.a.c.e.m56a("UtExtendTrustManager", "checkClientTrusted3");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        com.umeng.ut.a.c.e.m56a("UtExtendTrustManager", "checkServerTrusted1");
        if (x509CertificateArr == null || x509CertificateArr.length <= 0) {
            throw new IllegalArgumentException("checkServerTrusted: X509Certificate array is null");
        }
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
            trustManagerFactory.init((KeyStore) null);
            if (trustManagerFactory.getTrustManagers() != null) {
                for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                    try {
                        ((X509TrustManager) trustManager).checkServerTrusted(x509CertificateArr, str);
                    } catch (CertificateException e10) {
                        for (Throwable cause = e10; cause != null; cause = cause.getCause()) {
                            if ((cause instanceof CertificateExpiredException) || (cause instanceof CertificateNotYetValidException)) {
                                return;
                            }
                        }
                        throw e10;
                    }
                }
            }
        } catch (KeyStoreException e11) {
            throw new CertificateException(e11);
        } catch (NoSuchAlgorithmException e12) {
            throw new CertificateException(e12);
        }
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        com.umeng.ut.a.c.e.m56a("UtExtendTrustManager", "checkServerTrusted2");
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        com.umeng.ut.a.c.e.m56a("UtExtendTrustManager", "checkServerTrusted3");
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
