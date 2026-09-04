package com.lzy.okgo.https;

import com.huawei.hms.feature.dynamic.f.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import la.d;

/* JADX INFO: compiled from: HttpsUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static X509TrustManager f64727a = new C0524a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static HostnameVerifier f64728b = new b();
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: com.lzy.okgo.https.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HttpsUtils.java */
    public class C0524a implements X509TrustManager {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0524a() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            if (PatchProxy.proxy(new Object[]{x509CertificateArr, str}, this, changeQuickRedirect, false, bb.c.b.X7, new Class[]{X509Certificate[].class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            try {
                x509CertificateArr[0].checkValidity();
            } catch (Exception unused) {
                throw new CertificateException("Certificate not valid or trusted.");
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    /* JADX INFO: compiled from: HttpsUtils.java */
    public class b implements HostnameVerifier {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    /* JADX INFO: compiled from: HttpsUtils.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SSLSocketFactory f64729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public X509TrustManager f64730b;
    }

    private static X509TrustManager a(TrustManager[] trustManagerArr) {
        for (TrustManager trustManager : trustManagerArr) {
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        return null;
    }

    public static c b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.b.P7, new Class[0], c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : g(null, null, null, new InputStream[0]);
    }

    public static c c(InputStream inputStream, String str, X509TrustManager x509TrustManager) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inputStream, str, x509TrustManager}, null, changeQuickRedirect, true, bb.c.b.T7, new Class[]{InputStream.class, String.class, X509TrustManager.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : g(x509TrustManager, inputStream, str, new InputStream[0]);
    }

    public static c d(InputStream inputStream, String str, InputStream... inputStreamArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inputStream, str, inputStreamArr}, null, changeQuickRedirect, true, bb.c.b.S7, new Class[]{InputStream.class, String.class, InputStream[].class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : g(null, inputStream, str, inputStreamArr);
    }

    public static c e(X509TrustManager x509TrustManager) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{x509TrustManager}, null, changeQuickRedirect, true, bb.c.b.Q7, new Class[]{X509TrustManager.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : g(x509TrustManager, null, null, new InputStream[0]);
    }

    public static c f(InputStream... inputStreamArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inputStreamArr}, null, changeQuickRedirect, true, bb.c.b.R7, new Class[]{InputStream[].class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : g(null, null, null, inputStreamArr);
    }

    private static c g(X509TrustManager x509TrustManager, InputStream inputStream, String str, InputStream... inputStreamArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{x509TrustManager, inputStream, str, inputStreamArr}, null, changeQuickRedirect, true, bb.c.b.U7, new Class[]{X509TrustManager.class, InputStream.class, String.class, InputStream[].class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        c cVar = new c();
        try {
            KeyManager[] keyManagerArrH = h(inputStream, str);
            TrustManager[] trustManagerArrI = i(inputStreamArr);
            if (x509TrustManager == null) {
                x509TrustManager = trustManagerArrI != null ? a(trustManagerArrI) : f64727a;
            }
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(keyManagerArrH, new TrustManager[]{x509TrustManager}, null);
            cVar.f64729a = sSLContext.getSocketFactory();
            cVar.f64730b = x509TrustManager;
            return cVar;
        } catch (KeyManagementException e10) {
            throw new AssertionError(e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new AssertionError(e11);
        }
    }

    private static KeyManager[] h(InputStream inputStream, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inputStream, str}, null, changeQuickRedirect, true, bb.c.b.V7, new Class[]{InputStream.class, String.class}, KeyManager[].class);
        if (patchProxyResultProxy.isSupported) {
            return (KeyManager[]) patchProxyResultProxy.result;
        }
        if (inputStream != null && str != null) {
            try {
                KeyStore keyStore = KeyStore.getInstance("BKS");
                keyStore.load(inputStream, str.toCharArray());
                KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                keyManagerFactory.init(keyStore, str.toCharArray());
                return keyManagerFactory.getKeyManagers();
            } catch (Exception e10) {
                d.i(e10);
            }
        }
        return null;
    }

    private static TrustManager[] i(InputStream... inputStreamArr) {
        int i10 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inputStreamArr}, null, changeQuickRedirect, true, bb.c.b.W7, new Class[]{InputStream[].class}, TrustManager[].class);
        if (patchProxyResultProxy.isSupported) {
            return (TrustManager[]) patchProxyResultProxy.result;
        }
        if (inputStreamArr != null && inputStreamArr.length > 0) {
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance(e.f60731b);
                KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                keyStore.load(null);
                int length = inputStreamArr.length;
                int i11 = 0;
                while (i10 < length) {
                    InputStream inputStream = inputStreamArr[i10];
                    int i12 = i11 + 1;
                    keyStore.setCertificateEntry(Integer.toString(i11), certificateFactory.generateCertificate(inputStream));
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e10) {
                            d.i(e10);
                        }
                    }
                    i10++;
                    i11 = i12;
                }
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(keyStore);
                return trustManagerFactory.getTrustManagers();
            } catch (Exception e11) {
                d.i(e11);
            }
        }
        return null;
    }
}
