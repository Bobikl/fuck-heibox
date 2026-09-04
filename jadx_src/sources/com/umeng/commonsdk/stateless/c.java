package com.umeng.commonsdk.stateless;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.umeng.analytics.pro.ak;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.ULog;
import java.io.File;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.security.SecureRandom;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: UMSLNetWorkSenderHelper.java */
/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f105267a = "10.0.0.172";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f105268b = 80;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f105269c;

    public c(Context context) {
        this.f105269c = context;
    }

    private void a() {
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(this.f105269c, "sl_domain_p", "");
        if (TextUtils.isEmpty(strImprintProperty)) {
            return;
        }
        a.f105250i = DataHelper.assembleStatelessURL(strImprintProperty);
    }

    private void b() {
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(this.f105269c, "sl_domain_p", "");
        String strImprintProperty2 = UMEnvelopeBuild.imprintProperty(this.f105269c, "oversea_sl_domain_p", "");
        if (!TextUtils.isEmpty(strImprintProperty)) {
            a.f105249h = DataHelper.assembleStatelessURL(strImprintProperty);
        }
        if (!TextUtils.isEmpty(strImprintProperty2)) {
            a.f105252k = DataHelper.assembleStatelessURL(strImprintProperty2);
        }
        a.f105250i = a.f105252k;
        if (TextUtils.isEmpty(com.umeng.commonsdk.statistics.b.f105277b)) {
            return;
        }
        if (com.umeng.commonsdk.statistics.b.f105277b.startsWith("460") || com.umeng.commonsdk.statistics.b.f105277b.startsWith("461")) {
            a.f105250i = a.f105249h;
        }
    }

    private boolean c() {
        NetworkInfo activeNetworkInfo;
        String extraInfo;
        Context context = this.f105269c;
        if (context == null || context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", this.f105269c.getPackageName()) != 0) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f105269c.getSystemService("connectivity");
            return (!DeviceConfig.checkPermission(this.f105269c, "android.permission.ACCESS_NETWORK_STATE") || connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() == 1 || (extraInfo = activeNetworkInfo.getExtraInfo()) == null || (!extraInfo.equals("cmwap") && !extraInfo.equals("3gwap") && !extraInfo.equals("uniwap"))) ? false : true;
        } catch (Throwable th2) {
            UMCrashManager.reportCrash(this.f105269c, th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v13, types: [java.net.HttpURLConnection, java.net.URLConnection, javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.StringBuilder] */
    public boolean a(byte[] bArr, String str, String str2, String str3) {
        boolean z10 = false;
        if (bArr == null || str == null) {
            ULog.i("walle", "[stateless] sendMessage, envelopeByte == null || path == null ");
            return false;
        }
        if (SdkVersion.SDK_TYPE == 0) {
            a();
        } else {
            a.f105249h = a.f105252k;
            b();
        }
        String str4 = a.f105250i;
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        ?? r13 = str2;
        if (zIsEmpty) {
            r13 = str4;
        }
        OutputStream outputStream = null;
        try {
            try {
                if (c()) {
                    r13 = (HttpsURLConnection) new URL(r13 + File.separator + str).openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.f105267a, this.f105268b)));
                } else {
                    r13 = (HttpsURLConnection) new URL(r13 + File.separator + str).openConnection();
                }
                try {
                    r13.setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
                    SSLContext sSLContext = SSLContext.getInstance("TLS");
                    sSLContext.init(null, null, new SecureRandom());
                    r13.setSSLSocketFactory(sSLContext.getSocketFactory());
                    r13.setRequestProperty("X-Umeng-UTC", String.valueOf(System.currentTimeMillis()));
                    r13.setRequestProperty("Msg-Type", "envelope/json");
                    r13.setRequestProperty("Content-Type", ak.aP + str3);
                    r13.setConnectTimeout(30000);
                    r13.setReadTimeout(30000);
                    r13.setRequestMethod("POST");
                    r13.setDoOutput(true);
                    r13.setDoInput(true);
                    r13.setUseCaches(false);
                    outputStream = r13.getOutputStream();
                    outputStream.write(bArr);
                    outputStream.flush();
                    r13.connect();
                    if (r13.getResponseCode() == 200) {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> send stateless message success : " + a.f105250i + "/" + str);
                        z10 = true;
                    }
                    try {
                        outputStream.close();
                    } catch (Exception unused) {
                    }
                } catch (SSLHandshakeException e10) {
                    e = e10;
                    MLog.e("SSLHandshakeException, Failed to send message.", e);
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Exception unused2) {
                        }
                    }
                    if (r13 != 0) {
                    }
                    return z10;
                } catch (Throwable th2) {
                    th = th2;
                    MLog.e("Exception,Failed to send message.", th);
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Exception unused3) {
                        }
                    }
                    if (r13 != 0) {
                    }
                    return z10;
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Exception unused4) {
                    }
                }
                if (r13 == 0) {
                    throw th3;
                }
                try {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> stateless: disconnect connection.");
                    r13.disconnect();
                    throw th3;
                } catch (Throwable unused5) {
                    throw th3;
                }
            }
        } catch (SSLHandshakeException e11) {
            e = e11;
            r13 = 0;
        } catch (Throwable th4) {
            th = th4;
            r13 = 0;
        }
        try {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> stateless: disconnect connection.");
            r13.disconnect();
        } catch (Throwable unused6) {
        }
        return z10;
    }
}
