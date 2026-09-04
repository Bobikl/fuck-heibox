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
public class SSFSecureX509SingleInstance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62942a = "SSFSecureX509SingleInstance";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile SecureX509TrustManager f62943b;

    private SSFSecureX509SingleInstance() {
    }

    @SuppressLint({"NewApi"})
    public static SecureX509TrustManager getInstance(Context context) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException {
        if (context == null) {
            throw new NullPointerException("context is null");
        }
        ContextUtil.setContext(context);
        if (f62943b == null) {
            synchronized (SSFSecureX509SingleInstance.class) {
                if (f62943b == null) {
                    InputStream filesBksIS = BksUtil.getFilesBksIS(context);
                    if (filesBksIS == null) {
                        e.c(f62942a, "get assets bks");
                        filesBksIS = context.getAssets().open("hmsrootcas.bks");
                    } else {
                        e.c(f62942a, "get files bks");
                    }
                    f62943b = new SecureX509TrustManager(filesBksIS, "", true);
                }
            }
        }
        return f62943b;
    }

    @Deprecated
    public static void updateBks(InputStream inputStream) {
        String str = f62942a;
        e.c(str, "update bks");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (inputStream != null && f62943b != null) {
            f62943b = new SecureX509TrustManager(inputStream, "", true);
            e.a(str, "updateBks: new SecureX509TrustManager cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
            SSFCompatiableSystemCA.a(f62943b);
            SASFCompatiableSystemCA.a(f62943b);
        }
        e.a(str, "update bks cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
    }

    public static void updateBks(InputStream inputStream, SecureRandom secureRandom) {
        String str = f62942a;
        e.c(str, "update bks");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (inputStream != null && f62943b != null) {
            f62943b = new SecureX509TrustManager(inputStream, "", true);
            e.a(str, "updateBks: new SecureX509TrustManager cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
            SSFCompatiableSystemCA.a(f62943b, secureRandom);
            SASFCompatiableSystemCA.a(f62943b, secureRandom);
        }
        e.a(str, "update bks cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
    }
}
