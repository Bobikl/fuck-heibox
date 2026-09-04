package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes7.dex */
public class f extends a implements Callable<d> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f60831i = "f";

    public f(String str, int i10, c cVar, Context context, String str2, GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.c cVar2) {
        super(str, i10, cVar, context, str2, grsBaseInfo, cVar2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0149: MOVE (r6 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:62:0x0149 */
    @Override // java.util.concurrent.Callable
    public d call() throws Throwable {
        HttpURLConnection httpURLConnection;
        HttpsURLConnection httpsURLConnectionA;
        long j10;
        long jCurrentTimeMillis;
        String str = f60831i;
        Logger.i(str, "Post call execute");
        long jCurrentTimeMillis2 = 0;
        HttpURLConnection httpURLConnection2 = null;
        InputStream inputStream = null;
        byte[] bArr = null;
        try {
            try {
                try {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    try {
                        jCurrentTimeMillis2 = System.currentTimeMillis();
                        httpsURLConnectionA = com.huawei.hms.framework.network.grs.h.f.a.a(c(), a(), e());
                        try {
                            if (httpsURLConnectionA == null) {
                                Logger.w(str, "create HttpsURLConnection instance by url return null.");
                                if (httpsURLConnectionA != null) {
                                    try {
                                        httpsURLConnectionA.disconnect();
                                    } catch (RuntimeException unused) {
                                        Logger.w(f60831i, "RequestCallableV2 disconnect HttpsURLConnection catch RuntimeException");
                                    } catch (Throwable unused2) {
                                        Logger.w(f60831i, "RequestCallableV2 disconnect HttpsURLConnection catch Throwable");
                                    }
                                }
                                return null;
                            }
                            httpsURLConnectionA.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                            httpsURLConnectionA.setRequestProperty("Connection", "close");
                            httpsURLConnectionA.setRequestMethod("POST");
                            httpsURLConnectionA.setDoOutput(true);
                            httpsURLConnectionA.setDoInput(true);
                            String strA = b() != null ? b().a() : "";
                            if (TextUtils.isEmpty(strA)) {
                                strA = "&";
                            }
                            httpsURLConnectionA.setRequestProperty("If-None-Match", strA);
                            httpsURLConnectionA.connect();
                            com.huawei.hms.framework.network.grs.h.f.a.a(httpsURLConnectionA, f().a("services", ""));
                            int responseCode = httpsURLConnectionA.getResponseCode();
                            Logger.i(str, "httpsURLConnection result code:" + responseCode);
                            if (responseCode == 200) {
                                try {
                                    inputStream = httpsURLConnectionA.getInputStream();
                                    byte[] byteArray = IoUtils.toByteArray(inputStream);
                                    IoUtils.closeSecure(inputStream);
                                    bArr = byteArray;
                                } catch (Throwable th2) {
                                    IoUtils.closeSecure(inputStream);
                                    throw th2;
                                }
                            }
                            Map<String, List<String>> headerFields = httpsURLConnectionA.getHeaderFields();
                            httpsURLConnectionA.disconnect();
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                            jCurrentTimeMillis = System.currentTimeMillis();
                            this.f60790a = new d(responseCode, headerFields, bArr == null ? new byte[0] : bArr, jElapsedRealtime2 - jElapsedRealtime);
                            try {
                                httpsURLConnectionA.disconnect();
                            } catch (RuntimeException unused3) {
                                Logger.w(f60831i, "RequestCallableV2 disconnect HttpsURLConnection catch RuntimeException");
                            } catch (Throwable unused4) {
                                Logger.w(f60831i, "RequestCallableV2 disconnect HttpsURLConnection catch Throwable");
                            }
                            this.f60790a.b(c());
                            this.f60790a.a(d());
                            this.f60790a.b(jCurrentTimeMillis2);
                            this.f60790a.a(jCurrentTimeMillis);
                            if (b() != null) {
                                b().a(this.f60790a);
                            }
                            return this.f60790a;
                        } catch (IOException e10) {
                            e = e10;
                            long j11 = jCurrentTimeMillis2;
                            jCurrentTimeMillis2 = jElapsedRealtime;
                            j10 = j11;
                            long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                            jCurrentTimeMillis = System.currentTimeMillis();
                            Logger.w(f60831i, "RequestCallableV2 run task catch IOException", e);
                            this.f60790a = new d(e, jElapsedRealtime3 - jCurrentTimeMillis2);
                            if (httpsURLConnectionA != null) {
                                try {
                                    httpsURLConnectionA.disconnect();
                                } catch (RuntimeException unused5) {
                                    jCurrentTimeMillis2 = j10;
                                    Logger.w(f60831i, "RequestCallableV2 disconnect HttpsURLConnection catch RuntimeException");
                                } catch (Throwable unused6) {
                                    jCurrentTimeMillis2 = j10;
                                    Logger.w(f60831i, "RequestCallableV2 disconnect HttpsURLConnection catch Throwable");
                                }
                            }
                            jCurrentTimeMillis2 = j10;
                        }
                    } catch (IOException e11) {
                        e = e11;
                        httpsURLConnectionA = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (httpURLConnection2 != null) {
                        try {
                            httpURLConnection2.disconnect();
                        } catch (RuntimeException unused7) {
                            Logger.w(f60831i, "RequestCallableV2 disconnect HttpsURLConnection catch RuntimeException");
                        } catch (Throwable unused8) {
                            Logger.w(f60831i, "RequestCallableV2 disconnect HttpsURLConnection catch Throwable");
                        }
                    }
                    throw th;
                }
            } catch (IOException e12) {
                e = e12;
                httpsURLConnectionA = null;
                j10 = 0;
            }
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection2 = httpURLConnection;
        }
    }
}
