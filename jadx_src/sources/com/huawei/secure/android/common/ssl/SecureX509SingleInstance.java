package com.huawei.secure.android.common.ssl;

import android.annotation.SuppressLint;
import android.content.Context;
import com.huawei.secure.android.common.ssl.util.BksUtil;
import com.huawei.secure.android.common.ssl.util.ContextUtil;
import com.huawei.secure.android.common.ssl.util.e;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;

/* JADX INFO: loaded from: classes7.dex */
public class SecureX509SingleInstance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62982a = "SecureX509SingleInstance";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile SecureX509TrustManager f62983b;

    private SecureX509SingleInstance() {
    }

    @SuppressLint({"NewApi"})
    public static SecureX509TrustManager getInstance(Context context) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (context == null) {
            throw new NullPointerException("context is null");
        }
        ContextUtil.setContext(context);
        if (f62983b == null) {
            synchronized (SecureX509SingleInstance.class) {
                if (f62983b == null) {
                    InputStream inputStreamOpen = null;
                    try {
                        inputStreamOpen = BksUtil.getFilesBksIS(context);
                    } catch (RuntimeException unused) {
                        e.b(f62982a, "get files bks error");
                    }
                    if (inputStreamOpen == null) {
                        e.c(f62982a, "get assets bks");
                        inputStreamOpen = context.getAssets().open("hmsrootcas.bks");
                    } else {
                        e.c(f62982a, "get files bks");
                    }
                    f62983b = new SecureX509TrustManager(inputStreamOpen, "");
                }
            }
        }
        e.a(f62982a, "SecureX509TrustManager getInstance: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
        return f62983b;
    }

    @Deprecated
    public static void updateBks(InputStream inputStream) {
        String str = f62982a;
        e.c(str, "update bks");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (inputStream != null && f62983b != null) {
            f62983b = new SecureX509TrustManager(inputStream, "");
            SecureSSLSocketFactory.a(f62983b);
            SecureApacheSSLSocketFactory.a(f62983b);
        }
        e.c(str, "SecureX509TrustManager update bks cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
    }

    public static void updateBks(InputStream inputStream, SecureRandom secureRandom) {
        String str = f62982a;
        e.c(str, "update bks");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (inputStream != null && f62983b != null) {
            f62983b = new SecureX509TrustManager(inputStream, "");
            SecureSSLSocketFactory.a(f62983b, secureRandom);
            SecureApacheSSLSocketFactory.a(f62983b, secureRandom);
        }
        e.c(str, "SecureX509TrustManager update bks cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
    }
}
