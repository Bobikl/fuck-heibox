package com.umeng.commonsdk.statistics.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.l;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: NetworkHelper.java */
/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f105380e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f105381f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f105382g = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f105383a = "10.0.0.172";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f105384b = 80;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f105385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f105386d;

    public c(Context context) {
        this.f105385c = context;
    }

    private void a() {
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(this.f105385c, "domain_p", "");
        String strImprintProperty2 = UMEnvelopeBuild.imprintProperty(this.f105385c, "domain_s", "");
        if (!TextUtils.isEmpty(strImprintProperty)) {
            UMServerURL.DEFAULT_URL = DataHelper.assembleURL(strImprintProperty);
        }
        if (!TextUtils.isEmpty(strImprintProperty2)) {
            UMServerURL.SECONDARY_URL = DataHelper.assembleURL(strImprintProperty2);
        }
        AnalyticsConstants.APPLOG_URL_LIST = new String[]{UMServerURL.DEFAULT_URL, UMServerURL.SECONDARY_URL};
    }

    private void b() {
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(this.f105385c, "domain_p", "");
        String strImprintProperty2 = UMEnvelopeBuild.imprintProperty(this.f105385c, "domain_s", "");
        if (!TextUtils.isEmpty(strImprintProperty)) {
            UMServerURL.DEFAULT_URL = DataHelper.assembleURL(strImprintProperty);
        }
        if (!TextUtils.isEmpty(strImprintProperty2)) {
            UMServerURL.SECONDARY_URL = DataHelper.assembleURL(strImprintProperty2);
        }
        String strImprintProperty3 = UMEnvelopeBuild.imprintProperty(this.f105385c, "oversea_domain_p", "");
        String strImprintProperty4 = UMEnvelopeBuild.imprintProperty(this.f105385c, "oversea_domain_s", "");
        if (!TextUtils.isEmpty(strImprintProperty3)) {
            UMServerURL.OVERSEA_DEFAULT_URL = DataHelper.assembleURL(strImprintProperty3);
        }
        if (!TextUtils.isEmpty(strImprintProperty4)) {
            UMServerURL.OVERSEA_SECONDARY_URL = DataHelper.assembleURL(strImprintProperty4);
        }
        AnalyticsConstants.APPLOG_URL_LIST = new String[]{UMServerURL.OVERSEA_DEFAULT_URL, UMServerURL.OVERSEA_SECONDARY_URL};
        if (TextUtils.isEmpty(com.umeng.commonsdk.statistics.b.f105277b)) {
            return;
        }
        if (com.umeng.commonsdk.statistics.b.f105277b.startsWith("460") || com.umeng.commonsdk.statistics.b.f105277b.startsWith("461")) {
            AnalyticsConstants.APPLOG_URL_LIST = new String[]{UMServerURL.DEFAULT_URL, UMServerURL.SECONDARY_URL};
        }
    }

    private void c() {
        if (f105382g) {
            return;
        }
        ImprintHandler.getImprintService(this.f105385c).registImprintCallback(AnalyticsConstants.CFG_FIELD_KEY, new UMImprintChangeCallback() { // from class: com.umeng.commonsdk.statistics.internal.c.1
            @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
            public void onImprintValueChanged(String str, String str2) {
                if (FieldManager.b()) {
                    FieldManager.a().a(c.this.f105385c, str2);
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> apply imprint change and exit: key=" + str + "; value= " + str2);
                    UMWorkDispatch.sendEvent(c.this.f105385c, com.umeng.commonsdk.internal.a.f105213w, com.umeng.commonsdk.internal.b.a(c.this.f105385c).a(), null);
                }
            }
        });
        f105382g = true;
    }

    private void d() {
        if (f105381f) {
            return;
        }
        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 注册零号报文 imprint 应答处理回调。");
        ImprintHandler.getImprintService(this.f105385c).registPreProcessCallback(AnalyticsConstants.ZERO_RESPONSE_FLAG, new UMImprintPreProcessCallback() { // from class: com.umeng.commonsdk.statistics.internal.c.2
            @Override // com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback
            public boolean onPreProcessImprintKey(String str, String str2) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> onImprintValueChanged: key=" + str + "; value= " + str2);
                FieldManager.a().a(c.this.f105385c);
                UMWorkDispatch.sendEvent(c.this.f105385c, com.umeng.commonsdk.internal.a.f105209s, com.umeng.commonsdk.internal.b.a(c.this.f105385c).a(), null);
                ImprintHandler.getImprintService(c.this.f105385c).a(AnalyticsConstants.ZERO_RESPONSE_FLAG);
                return true;
            }
        });
        ImprintHandler.getImprintService(this.f105385c).registImprintCallback(AnalyticsConstants.CFG_FIELD_KEY, new UMImprintChangeCallback() { // from class: com.umeng.commonsdk.statistics.internal.c.3
            @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
            public void onImprintValueChanged(String str, String str2) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> first onImprintValueChanged: key=" + str + "; value= " + str2);
                FieldManager.a().a(c.this.f105385c, str2);
                UMWorkDispatch.sendEvent(c.this.f105385c, com.umeng.commonsdk.internal.a.f105209s, com.umeng.commonsdk.internal.b.a(c.this.f105385c).a(), null);
                if (FieldManager.allow(com.umeng.commonsdk.utils.b.E)) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> recv zcfg response: foregound count timer enabled.");
                    if (!UMWorkDispatch.eventHasExist()) {
                        UMWorkDispatch.sendEventEx(c.this.f105385c, 8213, CoreProtocol.getInstance(c.this.f105385c), null, 0L);
                    }
                }
                if (FieldManager.allow(com.umeng.commonsdk.utils.b.F)) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> recv zcfg response: FirstResumeTrigger enabled.");
                    l.a(c.this.f105385c).b(c.this.f105385c);
                }
                ImprintHandler.getImprintService(c.this.f105385c).unregistImprintCallback(AnalyticsConstants.CFG_FIELD_KEY, this);
            }
        });
        f105381f = true;
    }

    private boolean e() {
        NetworkInfo activeNetworkInfo;
        String extraInfo;
        if (this.f105385c.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", this.f105385c.getPackageName()) != 0) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f105385c.getSystemService("connectivity");
            return (!DeviceConfig.checkPermission(this.f105385c, "android.permission.ACCESS_NETWORK_STATE") || connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() == 1 || (extraInfo = activeNetworkInfo.getExtraInfo()) == null || (!extraInfo.equals("cmwap") && !extraInfo.equals("3gwap") && !extraInfo.equals("uniwap"))) ? false : true;
        } catch (Throwable th2) {
            UMCrashManager.reportCrash(this.f105385c, th2);
        }
    }

    public void a(b bVar) {
        this.f105386d = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0179: IF  (r6 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:87:0x0185, block:B:82:0x0179 */
    public byte[] a(byte[] bArr, String str) {
        HttpsURLConnection httpsURLConnection;
        OutputStream outputStream;
        OutputStream outputStream2;
        try {
            try {
                b bVar = this.f105386d;
                if (bVar != null) {
                    bVar.onRequestStart();
                }
                if (e()) {
                    httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.f105383a, this.f105384b)));
                } else {
                    httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
                }
                try {
                    boolean z10 = true;
                    if (!f105380e) {
                        httpsURLConnection.setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
                        SSLContext sSLContext = SSLContext.getInstance("TLS");
                        sSLContext.init(null, null, new SecureRandom());
                        httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
                        f105380e = true;
                    }
                    httpsURLConnection.setRequestProperty("X-Umeng-UTC", String.valueOf(System.currentTimeMillis()));
                    httpsURLConnection.setRequestProperty("X-Umeng-Sdk", a.a(this.f105385c).b());
                    httpsURLConnection.setRequestProperty("Content-Type", a.a(this.f105385c).a());
                    httpsURLConnection.setRequestProperty("Msg-Type", "envelope/json");
                    httpsURLConnection.setRequestProperty("X-Umeng-Pro-Ver", "1.0.0");
                    httpsURLConnection.setConnectTimeout(30000);
                    httpsURLConnection.setReadTimeout(30000);
                    httpsURLConnection.setRequestMethod("POST");
                    httpsURLConnection.setDoOutput(true);
                    httpsURLConnection.setDoInput(true);
                    httpsURLConnection.setUseCaches(false);
                    outputStream = httpsURLConnection.getOutputStream();
                    try {
                        outputStream.write(bArr);
                        outputStream.flush();
                        httpsURLConnection.connect();
                        b bVar2 = this.f105386d;
                        if (bVar2 != null) {
                            bVar2.onRequestEnd();
                        }
                        int responseCode = httpsURLConnection.getResponseCode();
                        String headerField = httpsURLConnection.getHeaderField("Content-Type");
                        if (TextUtils.isEmpty(headerField) || !headerField.equalsIgnoreCase("application/thrift")) {
                            z10 = false;
                        }
                        boolean z11 = AnalyticsConstants.UM_DEBUG;
                        if (responseCode != 200 || !z10) {
                            try {
                                outputStream.close();
                            } catch (Exception e10) {
                                UMCrashManager.reportCrash(this.f105385c, e10);
                            }
                            try {
                                httpsURLConnection.getInputStream().close();
                            } catch (IOException unused) {
                            }
                            httpsURLConnection.disconnect();
                            return null;
                        }
                        InputStream inputStream = httpsURLConnection.getInputStream();
                        try {
                            byte[] streamToByteArray = HelperUtils.readStreamToByteArray(inputStream);
                            HelperUtils.safeClose(inputStream);
                            try {
                                outputStream.close();
                            } catch (Exception e11) {
                                UMCrashManager.reportCrash(this.f105385c, e11);
                            }
                            try {
                                httpsURLConnection.getInputStream().close();
                            } catch (IOException unused2) {
                            }
                            httpsURLConnection.disconnect();
                            return streamToByteArray;
                        } catch (Throwable th2) {
                            HelperUtils.safeClose(inputStream);
                            throw th2;
                        }
                    } catch (UnknownHostException unused3) {
                        UMLog.aq("A_10200", 2, "\\|");
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Exception e12) {
                                UMCrashManager.reportCrash(this.f105385c, e12);
                            }
                        }
                        if (httpsURLConnection != null) {
                            try {
                                httpsURLConnection.getInputStream().close();
                            } catch (IOException unused4) {
                            }
                            httpsURLConnection.disconnect();
                        }
                        return null;
                    } catch (SSLHandshakeException unused5) {
                        UMLog.aq("A_10201", 2, "\\|");
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Exception e13) {
                                UMCrashManager.reportCrash(this.f105385c, e13);
                            }
                        }
                        if (httpsURLConnection != null) {
                            try {
                                httpsURLConnection.getInputStream().close();
                            } catch (IOException unused6) {
                            }
                            httpsURLConnection.disconnect();
                        }
                        return null;
                    } catch (Throwable unused7) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Exception e14) {
                                UMCrashManager.reportCrash(this.f105385c, e14);
                            }
                        }
                        if (httpsURLConnection != null) {
                            try {
                                httpsURLConnection.getInputStream().close();
                            } catch (IOException unused8) {
                            }
                            httpsURLConnection.disconnect();
                        }
                        return null;
                    }
                } catch (UnknownHostException unused9) {
                    outputStream = null;
                } catch (SSLHandshakeException unused10) {
                    outputStream = null;
                } catch (Throwable unused11) {
                    outputStream = null;
                }
            } catch (Throwable th3) {
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (Exception e15) {
                        UMCrashManager.reportCrash(this.f105385c, e15);
                    }
                }
                if (str == 0) {
                    throw th3;
                }
                try {
                    str.getInputStream().close();
                } catch (IOException unused12) {
                }
                str.disconnect();
                throw th3;
            }
        } catch (UnknownHostException unused13) {
            httpsURLConnection = null;
            outputStream = null;
        } catch (SSLHandshakeException unused14) {
            httpsURLConnection = null;
            outputStream = null;
        } catch (Throwable unused15) {
            httpsURLConnection = null;
            outputStream = null;
        }
    }

    public byte[] a(byte[] bArr, boolean z10, boolean z11, String str) {
        if (SdkVersion.SDK_TYPE == 0) {
            a();
        } else {
            UMServerURL.DEFAULT_URL = UMServerURL.OVERSEA_DEFAULT_URL;
            UMServerURL.SECONDARY_URL = UMServerURL.OVERSEA_SECONDARY_URL;
            b();
        }
        int i10 = 0;
        byte[] bArrA = null;
        while (true) {
            String[] strArr = AnalyticsConstants.APPLOG_URL_LIST;
            if (i10 >= strArr.length) {
                break;
            }
            String str2 = strArr[i10];
            if (z11) {
                d();
            } else {
                c();
            }
            bArrA = a(bArr, str2 + File.separator + str);
            if (bArrA != null) {
                b bVar = this.f105386d;
                if (bVar == null) {
                    break;
                }
                bVar.onRequestSucceed(z10);
                break;
            }
            b bVar2 = this.f105386d;
            if (bVar2 != null) {
                bVar2.onRequestFailed();
            }
            i10++;
        }
        return bArrA;
    }
}
