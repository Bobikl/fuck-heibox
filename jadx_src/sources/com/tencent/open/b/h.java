package com.tencent.open.b;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.utils.i;
import com.tencent.open.utils.l;
import com.tencent.open.utils.m;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.io.IOException;
import java.io.Serializable;
import java.net.SocketTimeoutException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static h f101052a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected HandlerThread f101056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected Handler f101057f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Random f101053b = new SecureRandom();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected List<Serializable> f101055d = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected List<Serializable> f101054c = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected Executor f101058g = l.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected Executor f101059h = l.b();

    private h() {
        this.f101056e = null;
        if (this.f101056e == null) {
            HandlerThread handlerThread = new HandlerThread("opensdk.report.handlerthread", 10);
            this.f101056e = handlerThread;
            handlerThread.start();
        }
        if (!this.f101056e.isAlive() || this.f101056e.getLooper() == null) {
            return;
        }
        this.f101057f = new Handler(this.f101056e.getLooper()) { // from class: com.tencent.open.b.h.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i10 = message.what;
                if (i10 == 1000) {
                    h.this.b();
                } else if (i10 == 1001) {
                    h.this.d();
                }
                super.handleMessage(message);
            }
        };
    }

    public static synchronized h a() {
        if (f101052a == null) {
            f101052a = new h();
        }
        return f101052a;
    }

    protected int a(int i10) {
        if (i10 == 0) {
            int iA = i.a(com.tencent.open.utils.g.a(), (String) null).a("Common_CGIReportFrequencySuccess");
            if (iA == 0) {
                return 10;
            }
            return iA;
        }
        int iA2 = i.a(com.tencent.open.utils.g.a(), (String) null).a("Common_CGIReportFrequencyFailed");
        if (iA2 == 0) {
            return 100;
        }
        return iA2;
    }

    public void a(final Bundle bundle, String str, final boolean z10) {
        if (bundle == null) {
            return;
        }
        SLog.v("openSDK_LOG.ReportManager", "-->reportVia, bundle: " + bundle.toString());
        if (a("report_via", str) || z10) {
            this.f101058g.execute(new Runnable() { // from class: com.tencent.open.b.h.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("uin", Constants.DEFAULT_UIN);
                        bundle2.putString("platform", "1");
                        bundle2.putString("os_ver", Build.VERSION.RELEASE);
                        bundle2.putString(CommonNetImpl.POSITION, "");
                        bundle2.putString(ad.c.f1243w, a.a(com.tencent.open.utils.g.a()));
                        bundle2.putString(ak.N, d.a());
                        bundle2.putString("resolution", d.a(com.tencent.open.utils.g.a()));
                        bundle2.putString("apn", a.b(com.tencent.open.utils.g.a()));
                        bundle2.putString(Constants.PARAM_MODEL_NAME, com.tencent.open.utils.f.a().c(com.tencent.open.utils.g.a()));
                        bundle2.putString(ak.M, TimeZone.getDefault().getID());
                        bundle2.putString("sdk_ver", Constants.SDK_VERSION);
                        bundle2.putString("qz_ver", m.d(com.tencent.open.utils.g.a(), Constants.PACKAGE_QZONE));
                        bundle2.putString(Constants.PARAM_QQ_VER, m.c(com.tencent.open.utils.g.a(), "com.tencent.mobileqq"));
                        bundle2.putString("qua", m.e(com.tencent.open.utils.g.a(), com.tencent.open.utils.g.b()));
                        bundle2.putString("packagename", com.tencent.open.utils.g.b());
                        bundle2.putString(Constants.PARAM_APP_VER, m.d(com.tencent.open.utils.g.a(), com.tencent.open.utils.g.b()));
                        Bundle bundle3 = bundle;
                        if (bundle3 != null) {
                            bundle2.putAll(bundle3);
                        }
                        h.this.f101055d.add(new c(bundle2));
                        int size = h.this.f101055d.size();
                        int iA = i.a(com.tencent.open.utils.g.a(), (String) null).a("Agent_ReportTimeInterval");
                        if (iA == 0) {
                            iA = 10000;
                        }
                        if (!h.this.a("report_via", size) && !z10) {
                            if (h.this.f101057f.hasMessages(1001)) {
                                return;
                            }
                            Message messageObtain = Message.obtain();
                            messageObtain.what = 1001;
                            h.this.f101057f.sendMessageDelayed(messageObtain, iA);
                            return;
                        }
                        h.this.d();
                        h.this.f101057f.removeMessages(1001);
                    } catch (Exception e10) {
                        SLog.e("openSDK_LOG.ReportManager", "--> reporVia, exception in sub thread.", e10);
                    }
                }
            });
        }
    }

    public void a(String str, long j10, long j11, long j12, int i10) {
        a(str, j10, j11, j12, i10, "", false);
    }

    public void a(String str, long j10, long j11, long j12, int i10, String str2, boolean z10) {
        SLog.v("openSDK_LOG.ReportManager", "-->reportCgi, command: " + str + " | startTime: " + j10 + " | reqSize:" + j11 + " | rspSize: " + j12 + " | responseCode: " + i10 + " | detail: " + str2);
    }

    public void a(final String str, final Map<String, String> map) {
        if (m.b(com.tencent.open.utils.g.a())) {
            l.b(new Runnable() { // from class: com.tencent.open.b.h.4
                @Override // java.lang.Runnable
                public void run() {
                    int i10 = 0;
                    try {
                        int iA = f.a();
                        if (iA == 0) {
                            iA = 3;
                        }
                        SLog.d("openSDK_LOG.ReportManager", "-->httpRequest, retryCount: " + iA);
                        do {
                            i10++;
                            try {
                                SLog.i("openSDK_LOG.ReportManager", "-->httpRequest, statusCode: " + com.tencent.open.a.f.a().a(str, map).d());
                                break;
                            } catch (SocketTimeoutException e10) {
                                SLog.e("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest SocketTimeoutException:", e10);
                            } catch (Exception e11) {
                                SLog.e("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest Exception:", e11);
                                break;
                            }
                        } while (i10 < iA);
                    } catch (Exception e12) {
                        SLog.e("openSDK_LOG.ReportManager", "-->httpRequest, exception in serial executor:", e12);
                    }
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d A[PHI: r0
  0x001d: PHI (r0v9 int) = (r0v6 int), (r0v12 int) binds: [B:11:0x0036, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    protected boolean a(String str, int i10) {
        int iA;
        int i11 = 5;
        if (str.equals("report_cgi")) {
            iA = i.a(com.tencent.open.utils.g.a(), (String) null).a("Common_CGIReportMaxcount");
            if (iA != 0) {
                i11 = iA;
            }
        } else if (str.equals("report_via")) {
            iA = i.a(com.tencent.open.utils.g.a(), (String) null).a("Agent_ReportBatchCount");
            if (iA != 0) {
                i11 = iA;
            }
        } else {
            i11 = 0;
        }
        SLog.d("openSDK_LOG.ReportManager", "-->availableCount, report: " + str + " | dataSize: " + i10 + " | maxcount: " + i11);
        return i10 >= i11;
    }

    protected boolean a(String str, String str2) {
        int iA;
        SLog.d("openSDK_LOG.ReportManager", "-->availableFrequency, report: " + str + " | ext: " + str2);
        boolean z10 = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int i10 = 100;
        if (!str.equals("report_cgi")) {
            if (str.equals("report_via")) {
                iA = f.a(str2);
                if (this.f101053b.nextInt(100) < iA) {
                    i10 = iA;
                    z10 = true;
                }
            }
            SLog.d("openSDK_LOG.ReportManager", "-->availableFrequency, result: " + z10 + " | frequency: " + i10);
            return z10;
        }
        try {
            iA = a(Integer.parseInt(str2));
            if (this.f101053b.nextInt(100) < iA) {
                z10 = true;
            }
        } catch (Exception unused) {
            return false;
        }
        i10 = iA;
        SLog.d("openSDK_LOG.ReportManager", "-->availableFrequency, result: " + z10 + " | frequency: " + i10);
        return z10;
    }

    protected void b() {
    }

    protected Map<String, String> c() {
        List<Serializable> listB = g.b("report_via");
        if (listB != null) {
            this.f101055d.addAll(listB);
        }
        SLog.d("openSDK_LOG.ReportManager", "-->prepareViaData, mViaList size: " + this.f101055d.size());
        if (this.f101055d.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Serializable serializable : this.f101055d) {
            JSONObject jSONObject = new JSONObject();
            c cVar = (c) serializable;
            for (String str : cVar.f101048a.keySet()) {
                try {
                    String str2 = cVar.f101048a.get(str);
                    if (str2 == null) {
                        str2 = "";
                    }
                    jSONObject.put(str, str2);
                } catch (JSONException e10) {
                    SLog.e("openSDK_LOG.ReportManager", "-->prepareViaData, put bundle to json array exception", e10);
                }
            }
            jSONArray.put(jSONObject);
        }
        SLog.v("openSDK_LOG.ReportManager", "-->prepareViaData, JSONArray array: " + jSONArray.toString());
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("data", jSONArray);
            HashMap map = new HashMap();
            map.put("data", jSONObject2.toString());
            return map;
        } catch (JSONException e11) {
            SLog.e("openSDK_LOG.ReportManager", "-->prepareViaData, put bundle to json array exception", e11);
            return null;
        }
    }

    protected void d() {
        if (m.b(com.tencent.open.utils.g.a())) {
            this.f101058g.execute(new Runnable() { // from class: com.tencent.open.b.h.3
                @Override // java.lang.Runnable
                public void run() {
                    int i10;
                    long j10;
                    long jB;
                    long j11;
                    long j12;
                    long j13;
                    boolean z10;
                    int i11;
                    try {
                        Map<String, String> mapC = h.this.c();
                        if (mapC == null) {
                            return;
                        }
                        SLog.d("openSDK_LOG.ReportManager", "-->doReportVia, params: " + mapC.toString());
                        int iA = f.a();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i12 = 0;
                        int errorCodeFromException = 0;
                        while (true) {
                            int i13 = i12 + 1;
                            try {
                                try {
                                    com.tencent.open.a.g gVarB = com.tencent.open.a.f.a().b("https://appsupport.qq.com/cgi-bin/appstage/mstats_batch_report", mapC);
                                    SLog.i("openSDK_LOG.ReportManager", "-->reportVia: statusCode " + gVarB.d());
                                    JSONObject jSONObjectD = m.d(gVarB.a());
                                    long jC = (long) gVarB.c();
                                    i10 = i13;
                                    jB = gVarB.b();
                                    try {
                                        try {
                                            if (gVarB.d() != 200) {
                                                errorCodeFromException = gVarB.d();
                                                j11 = jElapsedRealtime;
                                                j12 = jB;
                                                j13 = jC;
                                                z10 = false;
                                            } else {
                                                try {
                                                    i11 = jSONObjectD.getInt("ret");
                                                } catch (JSONException unused) {
                                                    i11 = -4;
                                                }
                                                if (i11 == 0 || jB != 0) {
                                                    j11 = jElapsedRealtime;
                                                    j12 = jB;
                                                    j13 = jC;
                                                    z10 = true;
                                                } else {
                                                    j10 = jC;
                                                    i12 = i10;
                                                    if (i12 >= iA) {
                                                        j11 = jElapsedRealtime;
                                                        j12 = jB;
                                                        j13 = j10;
                                                        z10 = false;
                                                    }
                                                }
                                            }
                                        } catch (JSONException unused2) {
                                            j10 = 0;
                                            jB = 0;
                                            i12 = i10;
                                            errorCodeFromException = -4;
                                        }
                                    } catch (SocketTimeoutException unused3) {
                                        j10 = 0;
                                        jElapsedRealtime = SystemClock.elapsedRealtime();
                                        errorCodeFromException = -8;
                                        jB = j10;
                                    } catch (IOException e10) {
                                        e = e10;
                                        j10 = 0;
                                        errorCodeFromException = HttpUtils.getErrorCodeFromException(e);
                                        jB = j10;
                                    }
                                } catch (Exception unused4) {
                                    j10 = 0;
                                    errorCodeFromException = -6;
                                    i12 = iA;
                                    jB = 0;
                                }
                            } catch (SocketTimeoutException unused5) {
                                i10 = i13;
                            } catch (IOException e11) {
                                e = e11;
                                i10 = i13;
                            } catch (JSONException unused6) {
                                i10 = i13;
                            }
                            h.this.a("mapp_apptrace_sdk", j11, j13, j12, errorCodeFromException, null, false);
                            if (z10) {
                                g.a("report_via");
                            } else {
                                g.a("report_via", h.this.f101055d);
                            }
                            h.this.f101055d.clear();
                            SLog.i("openSDK_LOG.ReportManager", "-->doReportVia, uploadSuccess: " + z10 + " resultCode: " + errorCodeFromException);
                            return;
                        }
                    } catch (Exception e12) {
                        SLog.e("openSDK_LOG.ReportManager", "-->doReportVia, exception in serial executor.", e12);
                    }
                }
            });
        }
    }
}
