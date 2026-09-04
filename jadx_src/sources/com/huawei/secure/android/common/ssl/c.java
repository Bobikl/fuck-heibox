package com.huawei.secure.android.common.ssl;

import android.content.Context;
import com.huawei.secure.android.common.ssl.util.ContextUtil;
import com.huawei.secure.android.common.ssl.util.e;
import com.huawei.secure.android.common.ssl.util.h;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes7.dex */
public class c implements X509TrustManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f63014c = "WebViewX509TrustManger";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private X509Certificate f63015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<X509TrustManager> f63016b = new ArrayList();

    public c(Context context) {
        if (context == null) {
            throw new NullPointerException("WebViewX509TrustManger context is null");
        }
        ContextUtil.setContext(context);
        X509Certificate x509CertificateB = new h(context).b();
        this.f63015a = x509CertificateB;
        if (x509CertificateB == null) {
            throw new NullPointerException("WebViewX509TrustManger cannot get cbg root ca");
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        e.c(f63014c, "checkClientTrusted");
        if (this.f63016b.isEmpty()) {
            throw new CertificateException("checkClientTrusted CertificateException");
        }
        this.f63016b.get(0).checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        e.c(f63014c, "checkServerTrusted");
        boolean zA = false;
        for (int i10 = 0; i10 < x509CertificateArr.length; i10++) {
            e.a(f63014c, "checkServerTrusted " + i10 + " : " + x509CertificateArr[i10].getIssuerDN().getName());
        }
        X509Certificate[] x509CertificateArr2 = new X509Certificate[x509CertificateArr.length];
        for (int i11 = 0; i11 < x509CertificateArr.length; i11++) {
            x509CertificateArr2[i11] = x509CertificateArr[(x509CertificateArr.length - 1) - i11];
        }
        CertificateException e10 = new CertificateException("CBG root CA CertificateException");
        try {
            zA = com.huawei.secure.android.common.ssl.util.b.a(this.f63015a, x509CertificateArr2);
        } catch (InvalidKeyException e11) {
            e.b(f63014c, "checkServerTrusted InvalidKeyException: " + e11.getMessage());
        } catch (NoSuchAlgorithmException e12) {
            e.b(f63014c, "checkServerTrusted NoSuchAlgorithmException: " + e12.getMessage());
        } catch (NoSuchProviderException e13) {
            e.b(f63014c, "checkServerTrusted NoSuchProviderException: " + e13.getMessage());
        } catch (SignatureException e14) {
            e.b(f63014c, "checkServerTrusted SignatureException: " + e14.getMessage());
        } catch (CertificateException e15) {
            e10 = e15;
            e.b(f63014c, "checkServerTrusted CertificateException: " + e10.getMessage());
        }
        if (!zA) {
            throw e10;
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<X509TrustManager> it = this.f63016b.iterator();
            while (it.hasNext()) {
                arrayList.addAll(Arrays.asList(it.next().getAcceptedIssuers()));
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        } catch (Exception e10) {
            e.b(f63014c, "getAcceptedIssuers exception : " + e10.getMessage());
            return new X509Certificate[0];
        }
    }
}
