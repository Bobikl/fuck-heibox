package com.huawei.secure.android.common.ssl;

import android.content.Context;
import com.huawei.secure.android.common.ssl.util.BksUtil;
import com.huawei.secure.android.common.ssl.util.ContextUtil;
import com.huawei.secure.android.common.ssl.util.d;
import com.huawei.secure.android.common.ssl.util.e;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes7.dex */
public class SecureX509TrustManager implements X509TrustManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f62984c = "SX509TM";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f62985d = "hmsrootcas.bks";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f62986e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f62987f = "X509";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f62988g = "bks";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f62989h = "AndroidCAStore";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected List<X509TrustManager> f62990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private X509Certificate[] f62991b;

    public SecureX509TrustManager(Context context) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException, IllegalArgumentException {
        this(context, false);
    }

    public SecureX509TrustManager(Context context, boolean z10) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, IllegalArgumentException {
        this.f62990a = new ArrayList();
        if (context == null) {
            throw new IllegalArgumentException("context is null");
        }
        ContextUtil.setContext(context);
        if (z10) {
            a();
        }
        a(context);
        if (this.f62990a.isEmpty()) {
            throw new CertificateException("X509TrustManager is empty");
        }
    }

    public SecureX509TrustManager(InputStream inputStream, String str) throws IllegalArgumentException {
        this.f62990a = new ArrayList();
        a(inputStream, str);
    }

    public SecureX509TrustManager(InputStream inputStream, String str, boolean z10) throws IllegalArgumentException {
        this.f62990a = new ArrayList();
        if (z10) {
            a();
        }
        a(inputStream, str);
    }

    public SecureX509TrustManager(String str) throws IllegalArgumentException, FileNotFoundException {
        this(str, false);
    }

    public SecureX509TrustManager(String str, boolean z10) throws Throwable {
        FileInputStream fileInputStream;
        this.f62990a = new ArrayList();
        try {
            fileInputStream = new FileInputStream(str);
            try {
                a(fileInputStream, "");
                d.a((InputStream) fileInputStream);
                if (z10) {
                    a();
                }
            } catch (Throwable th2) {
                th = th2;
                d.a((InputStream) fileInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    private void a() {
        e.c(f62984c, "loadSystemCA");
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            KeyStore keyStore = KeyStore.getInstance(f62989h);
            keyStore.load(null, null);
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(f62987f);
            trustManagerFactory.init(keyStore);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            for (TrustManager trustManager : trustManagers) {
                if (trustManager instanceof X509TrustManager) {
                    this.f62990a.add((X509TrustManager) trustManager);
                }
            }
        } catch (IOException | NegativeArraySizeException | OutOfMemoryError | KeyStoreException | NoSuchAlgorithmException | CertificateException e10) {
            e.b(f62984c, "loadSystemCA: exception : " + e10.getMessage());
        }
        e.a(f62984c, "loadSystemCA: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
    }

    private void a(Context context) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        boolean z10;
        e.c(f62984c, "loadBksCA");
        long jCurrentTimeMillis = System.currentTimeMillis();
        InputStream filesBksIS = BksUtil.getFilesBksIS(context);
        if (filesBksIS != null) {
            try {
                e.c(f62984c, "get bks not from assets");
                a(filesBksIS);
            } catch (IOException | OutOfMemoryError | KeyStoreException | NoSuchAlgorithmException | CertificateException e10) {
                e.b(f62984c, "loadBksCA: exception : " + e10.getMessage());
                z10 = false;
            }
        }
        z10 = true;
        if (!z10 || filesBksIS == null) {
            e.c(f62984c, " get bks from assets ");
            a(context.getAssets().open("hmsrootcas.bks"));
        }
        e.a(f62984c, "loadBksCA: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
    }

    private void a(InputStream inputStream) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(f62987f);
            KeyStore keyStore = KeyStore.getInstance("bks");
            keyStore.load(inputStream, "".toCharArray());
            trustManagerFactory.init(keyStore);
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    this.f62990a.add((X509TrustManager) trustManager);
                }
            }
            d.a(inputStream);
        } catch (Throwable th2) {
            d.a(inputStream);
            throw th2;
        }
    }

    private void a(InputStream inputStream, String str) {
        if (inputStream == null || str == null) {
            throw new IllegalArgumentException("inputstream or trustPwd is null");
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(f62987f);
                KeyStore keyStore = KeyStore.getInstance("bks");
                keyStore.load(inputStream, str.toCharArray());
                trustManagerFactory.init(keyStore);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                for (TrustManager trustManager : trustManagers) {
                    if (trustManager instanceof X509TrustManager) {
                        this.f62990a.add((X509TrustManager) trustManager);
                    }
                }
                d.a(inputStream);
            } catch (Throwable th2) {
                d.a(inputStream);
                throw th2;
            }
        } catch (IOException | NegativeArraySizeException | OutOfMemoryError | KeyStoreException | NoSuchAlgorithmException | CertificateException e10) {
            e.b(f62984c, "loadInputStream: exception : " + e10.getMessage());
            d.a(inputStream);
        }
        e.a(f62984c, "loadInputStream: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        e.c(f62984c, "checkClientTrusted: ");
        Iterator<X509TrustManager> it = this.f62990a.iterator();
        while (it.hasNext()) {
            try {
                it.next().checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e10) {
                e.b(f62984c, "checkServerTrusted CertificateException" + e10.getMessage());
            }
        }
        throw new CertificateException("checkServerTrusted CertificateException");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        setChain(x509CertificateArr);
        e.c(f62984c, "checkServerTrusted begin,size=" + x509CertificateArr.length + ",authType=" + str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        int length = x509CertificateArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            X509Certificate x509Certificate = x509CertificateArr[i10];
            e.a(f62984c, "server ca chain: getSubjectDN is :" + x509Certificate.getSubjectDN());
            e.a(f62984c, "IssuerDN :" + x509Certificate.getIssuerDN());
            e.a(f62984c, "SerialNumber : " + x509Certificate.getSerialNumber());
        }
        int size = this.f62990a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                e.c(f62984c, "check server i=" + i11);
                X509TrustManager x509TrustManager = this.f62990a.get(i11);
                X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
                if (acceptedIssuers != null) {
                    e.c(f62984c, "client root ca size=" + acceptedIssuers.length);
                    for (int i12 = 0; i12 < acceptedIssuers.length; i12++) {
                        e.a(f62984c, "client root ca getIssuerDN :" + acceptedIssuers[i12].getIssuerDN());
                    }
                }
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                e.c(f62984c, "checkServerTrusted end, " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                return;
            } catch (CertificateException e10) {
                e.b(f62984c, "checkServerTrusted error :" + e10.getMessage() + " , time : " + i11);
                if (i11 == size - 1) {
                    if (x509CertificateArr.length > 0) {
                        e.b(f62984c, "root ca issuer : " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                    }
                    throw e10;
                }
            }
        }
        e.a(f62984c, "checkServerTrusted: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<X509TrustManager> it = this.f62990a.iterator();
            while (it.hasNext()) {
                arrayList.addAll(Arrays.asList(it.next().getAcceptedIssuers()));
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        } catch (Exception e10) {
            e.b(f62984c, "getAcceptedIssuers exception : " + e10.getMessage());
            return new X509Certificate[0];
        }
    }

    public X509Certificate[] getChain() {
        return this.f62991b;
    }

    public List<X509TrustManager> getX509TrustManagers() {
        return this.f62990a;
    }

    public void setChain(X509Certificate[] x509CertificateArr) {
        this.f62991b = x509CertificateArr;
    }

    public void setX509TrustManagers(List<X509TrustManager> list) {
        this.f62990a = list;
    }
}
