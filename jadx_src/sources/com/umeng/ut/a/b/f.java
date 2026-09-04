package com.umeng.ut.a.b;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes4.dex */
public class f implements X509TrustManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static TrustManager[] f106423a;

    f() {
    }

    static synchronized TrustManager[] getTrustManagers() {
        if (f106423a == null) {
            f106423a = new TrustManager[]{new f()};
        }
        return f106423a;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
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

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
