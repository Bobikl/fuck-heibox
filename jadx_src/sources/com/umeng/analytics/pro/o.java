package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.process.UMProcessDBHelper;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.ReportPolicy;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.noise.ABTest;
import com.umeng.commonsdk.statistics.noise.Defcon;
import com.umeng.commonsdk.utils.JSONArraySortUtil;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.umcrash.UMCrashUtils;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: CoreProtocolImpl.java */
/* JADX INFO: loaded from: classes4.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f104880a = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f104881l = "first_activate_time";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f104882m = "ana_is_f";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f104883n = "thtstart";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f104884o = "dstk_last_time";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f104885p = "dstk_cnt";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f104886q = "gkvc";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f104887r = "ekvc";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f104888t = "-1";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f104889x = "com.umeng.umcrash.UMCrashUtils";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static Class<?> f104890y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static Method f104891z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f104892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SharedPreferences f104893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f104894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f104895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f104896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private JSONArray f104897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f104898h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f104899i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f104900j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f104901k;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final long f104902s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f104903u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f104904v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Object f104905w;

    /* JADX INFO: compiled from: CoreProtocolImpl.java */
    public static class a {
        public static final int A = 8211;
        public static final int B = 8212;
        public static final int C = 8213;
        public static final int D = 8214;
        public static final int E = 8215;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f104906a = 4097;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f104907b = 4098;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f104908c = 4099;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f104909d = 4100;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f104910e = 4101;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f104911f = 4102;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f104912g = 4103;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f104913h = 4104;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f104914i = 4105;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f104915j = 4106;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f104916k = 4352;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f104917l = 4353;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f104918m = 4354;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f104919n = 4355;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f104920o = 4356;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f104921p = 8193;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f104922q = 8194;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f104923r = 8195;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f104924s = 8196;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f104925t = 8197;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f104926u = 8199;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f104927v = 8200;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f104928w = 8201;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f104929x = 8208;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int f104930y = 8209;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final int f104931z = 8210;
    }

    /* JADX INFO: compiled from: CoreProtocolImpl.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final o f104932a = new o();

        private b() {
        }
    }

    /* JADX INFO: compiled from: CoreProtocolImpl.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ReportPolicy.ReportStrategy f104933a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f104934b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f104935c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f104936d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f104937e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ABTest f104938f;

        public c() {
            this.f104938f = null;
            this.f104938f = ABTest.getService(o.f104880a);
        }

        private ReportPolicy.ReportStrategy b(int i10, int i11) {
            if (i10 == 0) {
                ReportPolicy.ReportStrategy reportStrategy = this.f104933a;
                return reportStrategy instanceof ReportPolicy.ReportRealtime ? reportStrategy : new ReportPolicy.ReportRealtime();
            }
            if (i10 == 1) {
                ReportPolicy.ReportStrategy reportStrategy2 = this.f104933a;
                return reportStrategy2 instanceof ReportPolicy.ReportAtLaunch ? reportStrategy2 : new ReportPolicy.ReportAtLaunch();
            }
            if (i10 == 4) {
                ReportPolicy.ReportStrategy reportStrategy3 = this.f104933a;
                return reportStrategy3 instanceof ReportPolicy.ReportDaily ? reportStrategy3 : new ReportPolicy.ReportDaily(StatTracer.getInstance(o.f104880a));
            }
            if (i10 == 5) {
                ReportPolicy.ReportStrategy reportStrategy4 = this.f104933a;
                return reportStrategy4 instanceof ReportPolicy.ReportWifiOnly ? reportStrategy4 : new ReportPolicy.ReportWifiOnly(o.f104880a);
            }
            if (i10 == 6) {
                ReportPolicy.ReportStrategy reportStrategy5 = this.f104933a;
                if (!(reportStrategy5 instanceof ReportPolicy.ReportByInterval)) {
                    return new ReportPolicy.ReportByInterval(StatTracer.getInstance(o.f104880a), i11);
                }
                ((ReportPolicy.ReportByInterval) reportStrategy5).setReportInterval(i11);
                return reportStrategy5;
            }
            if (i10 == 8) {
                ReportPolicy.ReportStrategy reportStrategy6 = this.f104933a;
                return reportStrategy6 instanceof ReportPolicy.SmartPolicy ? reportStrategy6 : new ReportPolicy.SmartPolicy(StatTracer.getInstance(o.f104880a));
            }
            if (i10 != 11) {
                ReportPolicy.ReportStrategy reportStrategy7 = this.f104933a;
                return reportStrategy7 instanceof ReportPolicy.ReportAtLaunch ? reportStrategy7 : new ReportPolicy.ReportAtLaunch();
            }
            ReportPolicy.ReportStrategy reportStrategy8 = this.f104933a;
            if (reportStrategy8 instanceof ReportPolicy.ReportQuasiRealtime) {
                ((ReportPolicy.ReportQuasiRealtime) reportStrategy8).setReportInterval(i11);
                return reportStrategy8;
            }
            ReportPolicy.ReportQuasiRealtime reportQuasiRealtime = new ReportPolicy.ReportQuasiRealtime();
            reportQuasiRealtime.setReportInterval(i11);
            return reportQuasiRealtime;
        }

        public int a(int i10) {
            int iIntValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(o.f104880a, "test_report_interval", "-1")).intValue();
            return (iIntValue == -1 || iIntValue < 90 || iIntValue > 86400) ? i10 : iIntValue * 1000;
        }

        public void a() {
            try {
                int[] iArrA = a(-1, -1);
                this.f104934b = iArrA[0];
                this.f104935c = iArrA[1];
            } catch (Throwable unused) {
            }
        }

        public int[] a(int i10, int i11) {
            int iIntValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(o.f104880a, "report_policy", "-1")).intValue();
            int iIntValue2 = Integer.valueOf(UMEnvelopeBuild.imprintProperty(o.f104880a, "report_interval", "-1")).intValue();
            if (iIntValue == -1 || !ReportPolicy.isValid(iIntValue)) {
                return new int[]{i10, i11};
            }
            if (6 == iIntValue) {
                if (iIntValue2 == -1 || iIntValue2 < 90 || iIntValue2 > 86400) {
                    iIntValue2 = 90;
                }
                return new int[]{iIntValue, iIntValue2 * 1000};
            }
            if (11 != iIntValue) {
                return new int[]{i10, i11};
            }
            if (iIntValue2 == -1 || iIntValue2 < 15 || iIntValue2 > 3600) {
                iIntValue2 = 15;
            }
            return new int[]{iIntValue, iIntValue2 * 1000};
        }

        protected void b() {
            int iA;
            Defcon service = Defcon.getService(o.f104880a);
            if (service.isOpen()) {
                ReportPolicy.ReportStrategy reportStrategy = this.f104933a;
                this.f104933a = (reportStrategy instanceof ReportPolicy.DefconPolicy) && reportStrategy.isValid() ? this.f104933a : new ReportPolicy.DefconPolicy(StatTracer.getInstance(o.f104880a), service);
            } else {
                boolean z10 = Integer.valueOf(UMEnvelopeBuild.imprintProperty(o.f104880a, "integrated_test", "-1")).intValue() == 1;
                if (UMConfigure.isDebugLog() && z10 && !MLog.DEBUG) {
                    UMLog.mutlInfo(j.K, 3, "\\|", null, null);
                }
                if (MLog.DEBUG && z10) {
                    this.f104933a = new ReportPolicy.DebugPolicy(StatTracer.getInstance(o.f104880a));
                } else if (this.f104938f.isInTest() && "RPT".equals(this.f104938f.getTestName())) {
                    if (this.f104938f.getTestPolicy() == 6) {
                        if (Integer.valueOf(UMEnvelopeBuild.imprintProperty(o.f104880a, "test_report_interval", "-1")).intValue() != -1) {
                            iA = a(90000);
                        } else {
                            iA = this.f104935c;
                            if (iA <= 0) {
                                iA = this.f104937e;
                            }
                        }
                    } else {
                        iA = 0;
                    }
                    this.f104933a = b(this.f104938f.getTestPolicy(), iA);
                } else {
                    int i10 = this.f104936d;
                    int i11 = this.f104937e;
                    int i12 = this.f104934b;
                    if (i12 != -1) {
                        i11 = this.f104935c;
                        i10 = i12;
                    }
                    this.f104933a = b(i10, i11);
                }
            }
            if (UMConfigure.isDebugLog()) {
                try {
                    ReportPolicy.ReportStrategy reportStrategy2 = this.f104933a;
                    if (reportStrategy2 instanceof ReportPolicy.ReportAtLaunch) {
                        UMLog.mutlInfo(j.I, 3, "", null, null);
                    } else if (reportStrategy2 instanceof ReportPolicy.ReportByInterval) {
                        UMLog.mutlInfo(j.J, 3, "", new String[]{"@"}, new String[]{String.valueOf(((ReportPolicy.ReportByInterval) reportStrategy2).getReportInterval() / 1000)});
                    } else if (reportStrategy2 instanceof ReportPolicy.DebugPolicy) {
                        UMLog.mutlInfo(j.L, 3, "", null, null);
                    } else if (reportStrategy2 instanceof ReportPolicy.ReportQuasiRealtime) {
                        String[] strArr = {String.valueOf(((ReportPolicy.ReportQuasiRealtime) reportStrategy2).getReportInterval() / 1000)};
                        UMLog uMLog = UMConfigure.umDebugLog;
                        UMLog.mutlInfo(j.M, 3, "", new String[]{"@"}, strArr);
                    } else {
                        boolean z11 = reportStrategy2 instanceof ReportPolicy.DefconPolicy;
                    }
                } catch (Throwable unused) {
                }
            }
        }

        public ReportPolicy.ReportStrategy c() {
            b();
            return this.f104933a;
        }
    }

    /* JADX INFO: compiled from: CoreProtocolImpl.java */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map<String, Object> f104939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f104940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f104941c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f104942d;

        private d() {
            this.f104939a = null;
            this.f104940b = null;
            this.f104941c = null;
            this.f104942d = 0L;
        }

        public d(String str, Map<String, Object> map, String str2, long j10) {
            this.f104939a = map;
            this.f104940b = str;
            this.f104942d = j10;
            this.f104941c = str2;
        }

        public Map<String, Object> a() {
            return this.f104939a;
        }

        public String b() {
            return this.f104941c;
        }

        public String c() {
            return this.f104940b;
        }

        public long d() {
            return this.f104942d;
        }
    }

    static {
        h();
    }

    private o() {
        this.f104892b = null;
        this.f104893c = null;
        this.f104894d = null;
        this.f104895e = null;
        this.f104896f = 10;
        this.f104897g = new JSONArray();
        this.f104898h = 5000;
        this.f104899i = 0;
        this.f104900j = 0;
        this.f104901k = 0L;
        this.f104902s = 28800000L;
        this.f104903u = false;
        this.f104904v = false;
        this.f104905w = new Object();
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f104880a);
            this.f104901k = sharedPreferences.getLong(f104883n, 0L);
            this.f104899i = sharedPreferences.getInt(f104886q, 0);
            this.f104900j = sharedPreferences.getInt(f104887r, 0);
            this.f104892b = new c();
        } catch (Throwable unused) {
        }
    }

    public static o a(Context context) {
        if (f104880a == null && context != null) {
            f104880a = context.getApplicationContext();
        }
        return b.f104932a;
    }

    private JSONObject a(JSONObject jSONObject, long j10) {
        try {
            if (q.a(jSONObject) <= j10) {
                return jSONObject;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("header");
            jSONObject2.put(com.umeng.analytics.pro.d.aB, q.a(jSONObject));
            jSONObject.put("header", jSONObject2);
            return q.a(f104880a, j10, jSONObject);
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    private void a(String str, String str2) {
        Method method;
        Class<?> cls = f104890y;
        if (cls == null || (method = f104891z) == null) {
            return;
        }
        try {
            method.invoke(cls, str, str2);
        } catch (Throwable unused) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> reflect call setPuidAndProvider method of crash lib failed.");
        }
    }

    private boolean a(long j10, int i10) {
        if (j10 == 0) {
            return true;
        }
        if (System.currentTimeMillis() - j10 <= 28800000) {
            return i10 < 5000;
        }
        o();
        return true;
    }

    private boolean a(JSONArray jSONArray) {
        int length = jSONArray.length();
        List listAsList = Arrays.asList("$$_onUMengEnterForeground", "$$_onUMengEnterBackground", "$$_onUMengEnterForegroundInitError");
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i11);
                if (jSONObjectOptJSONObject != null && listAsList.contains(jSONObjectOptJSONObject.optString("id"))) {
                    i10++;
                }
            } catch (Throwable unused) {
            }
        }
        return i10 >= length;
    }

    private boolean a(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ekv");
        int length = jSONArrayOptJSONArray.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(itKeys.next());
                    if (jSONArrayOptJSONArray2 != null && a(jSONArrayOptJSONArray2)) {
                        i10++;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return i10 >= length;
    }

    private JSONObject b(JSONObject jSONObject, long j10) {
        try {
            if (q.a(jSONObject) <= j10) {
                return jSONObject;
            }
            jSONObject = null;
            i.a(f104880a).a(true, false);
            i.a(f104880a).b();
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> Instant session packet overload !!! ");
            return null;
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    private void b(JSONObject jSONObject) {
        JSONObject jSONObjectF;
        if (i.a(UMGlobalContext.getAppContext(f104880a)).c() || (jSONObjectF = i.a(UMGlobalContext.getAppContext(f104880a)).f()) == null) {
            return;
        }
        String strOptString = jSONObjectF.optString("__av");
        String strOptString2 = jSONObjectF.optString("__vc");
        try {
            if (TextUtils.isEmpty(strOptString)) {
                jSONObject.put("app_version", UMUtils.getAppVersionName(f104880a));
            } else {
                jSONObject.put("app_version", strOptString);
            }
            if (TextUtils.isEmpty(strOptString2)) {
                jSONObject.put("version_code", UMUtils.getAppVersionCode(f104880a));
            } else {
                jSONObject.put("version_code", strOptString2);
            }
        } catch (Throwable unused) {
        }
    }

    private void c(JSONObject jSONObject) {
        try {
            if (i.a(f104880a).e()) {
                jSONObject.put("app_version", UMUtils.getAppVersionName(f104880a));
                jSONObject.put("version_code", UMUtils.getAppVersionCode(f104880a));
                return;
            }
            JSONObject jSONObjectG = i.a(f104880a).g();
            if (jSONObjectG != null) {
                String strOptString = jSONObjectG.optString("__av");
                String strOptString2 = jSONObjectG.optString("__vc");
                if (TextUtils.isEmpty(strOptString)) {
                    jSONObject.put("app_version", UMUtils.getAppVersionName(f104880a));
                } else {
                    jSONObject.put("app_version", strOptString);
                }
                if (TextUtils.isEmpty(strOptString2)) {
                    jSONObject.put("version_code", UMUtils.getAppVersionCode(f104880a));
                } else {
                    jSONObject.put("version_code", strOptString2);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private boolean c(boolean z10) {
        if (s() || AnalyticsConfig.isRealTimeDebugMode()) {
            return true;
        }
        if (this.f104892b == null) {
            this.f104892b = new c();
        }
        this.f104892b.a();
        ReportPolicy.ReportStrategy reportStrategyC = this.f104892b.c();
        boolean zShouldSendMessage = reportStrategyC.shouldSendMessage(z10);
        if (zShouldSendMessage) {
            if (((reportStrategyC instanceof ReportPolicy.ReportByInterval) || (reportStrategyC instanceof ReportPolicy.DebugPolicy) || (reportStrategyC instanceof ReportPolicy.ReportQuasiRealtime)) && p()) {
                d();
            }
            if ((reportStrategyC instanceof ReportPolicy.DefconPolicy) && p()) {
                d();
            }
            if (UMConfigure.isDebugLog()) {
                MLog.d("数据发送策略 : " + reportStrategyC.getClass().getSimpleName());
            }
        }
        return zShouldSendMessage;
    }

    private void d(JSONObject jSONObject) {
        String str;
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.length() <= 0) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has("analytics")) {
                JSONObject jSONObject4 = jSONObject.getJSONObject("analytics");
                if (jSONObject4.has("ekv")) {
                    str = "version_code";
                    jSONObject3.put("ekv", jSONObject4.getJSONArray("ekv"));
                    if (jSONObject3.length() > 0) {
                        if (AnalyticsConfig.isRealTimeDebugMode()) {
                            MLog.d("[埋点验证模式]事件:" + jSONObject3.toString());
                        } else {
                            MLog.d("事件:" + jSONObject3.toString());
                        }
                        jSONObject3 = new JSONObject();
                    }
                } else {
                    str = "version_code";
                }
                if (jSONObject4.has(com.umeng.analytics.pro.d.T)) {
                    jSONObject3.put(com.umeng.analytics.pro.d.T, jSONObject4.getJSONArray(com.umeng.analytics.pro.d.T));
                    if (jSONObject3.length() > 0) {
                        if (AnalyticsConfig.isRealTimeDebugMode()) {
                            MLog.d("[埋点验证模式]游戏事件:" + jSONObject3.toString());
                        } else {
                            MLog.d("游戏事件:" + jSONObject3.toString());
                        }
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has("error")) {
                    jSONObject3.put("error", jSONObject4.getJSONArray("error"));
                    if (jSONObject3.length() > 0) {
                        if (AnalyticsConfig.isRealTimeDebugMode()) {
                            MLog.d("[埋点验证模式]错误:" + jSONObject3.toString());
                        } else {
                            MLog.d("错误:" + jSONObject3.toString());
                        }
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has(com.umeng.analytics.pro.d.f104707n)) {
                    JSONArray jSONArray = jSONObject4.getJSONArray(com.umeng.analytics.pro.d.f104707n);
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject5 = jSONArray.getJSONObject(i10);
                        if (jSONObject5 != null && jSONObject5.length() > 0) {
                            if (jSONObject5.has(com.umeng.analytics.pro.d.f104714u)) {
                                jSONObject5.remove(com.umeng.analytics.pro.d.f104714u);
                            }
                            jSONArray2.put(jSONObject5);
                        }
                    }
                    jSONObject3.put(com.umeng.analytics.pro.d.f104707n, jSONArray2);
                    if (jSONObject3.length() > 0) {
                        if (AnalyticsConfig.isRealTimeDebugMode()) {
                            MLog.d("[埋点验证模式]会话:" + jSONObject3.toString());
                        } else {
                            MLog.d("会话:" + jSONObject3.toString());
                        }
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has(com.umeng.analytics.pro.d.I)) {
                    jSONObject3.put(com.umeng.analytics.pro.d.I, jSONObject4.getJSONObject(com.umeng.analytics.pro.d.I));
                }
                if (jSONObject4.has(com.umeng.analytics.pro.d.L)) {
                    jSONObject3.put(com.umeng.analytics.pro.d.L, jSONObject4.getJSONObject(com.umeng.analytics.pro.d.L));
                    if (jSONObject3.length() > 0) {
                        if (AnalyticsConfig.isRealTimeDebugMode()) {
                            MLog.d("[埋点验证模式]账号:" + jSONObject3.toString());
                        } else {
                            MLog.d("账号:" + jSONObject3.toString());
                        }
                        jSONObject3 = new JSONObject();
                    }
                }
            } else {
                str = "version_code";
            }
            if (jSONObject.has("dplus")) {
                jSONObject3.put("dplus", jSONObject.getJSONObject("dplus"));
            }
            if (jSONObject.has("header") && jSONObject.has("header") && (jSONObject2 = jSONObject.getJSONObject("header")) != null && jSONObject2.length() > 0) {
                if (jSONObject2.has("sdk_version")) {
                    jSONObject3.put("sdk_version", jSONObject2.getString("sdk_version"));
                }
                if (jSONObject2.has("device_id")) {
                    jSONObject3.put("device_id", jSONObject2.getString("device_id"));
                }
                if (jSONObject2.has("device_model")) {
                    jSONObject3.put("device_model", jSONObject2.getString("device_model"));
                }
                String str2 = str;
                if (jSONObject2.has(str2)) {
                    jSONObject3.put("version", jSONObject2.getInt(str2));
                }
                if (jSONObject2.has("appkey")) {
                    jSONObject3.put("appkey", jSONObject2.getString("appkey"));
                }
                if (jSONObject2.has("channel")) {
                    jSONObject3.put("channel", jSONObject2.getString("channel"));
                }
                if (jSONObject3.length() > 0) {
                    MLog.d("基础信息:" + jSONObject3.toString());
                    jSONObject3 = new JSONObject();
                }
            }
            jSONObject3.length();
        } catch (Throwable th2) {
            MLog.e(th2);
        }
    }

    private boolean d(boolean z10) {
        if (this.f104892b == null) {
            this.f104892b = new c();
        }
        ReportPolicy.ReportStrategy reportStrategyC = this.f104892b.c();
        if (reportStrategyC instanceof ReportPolicy.DefconPolicy) {
            return z10 ? ((ReportPolicy.DefconPolicy) reportStrategyC).shouldSendMessageByInstant() : reportStrategyC.shouldSendMessage(false);
        }
        return true;
    }

    private void e(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (2050 == jSONObject.getInt("__t")) {
                if (!a(this.f104901k, this.f104899i)) {
                    return;
                } else {
                    this.f104899i++;
                }
            } else if (2049 == jSONObject.getInt("__t")) {
                if (!a(this.f104901k, this.f104900j)) {
                    return;
                } else {
                    this.f104900j++;
                }
            }
            if (AnalyticsConfig.isRealTimeDebugMode()) {
                if (this.f104897g == null) {
                    this.f104897g = new JSONArray();
                }
                this.f104897g.put(jSONObject);
                i.a(f104880a).a(this.f104897g);
                this.f104897g = new JSONArray();
                return;
            }
            if (this.f104897g.length() >= this.f104896f) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>>*** 超过10个事件，事件落库。");
                i.a(f104880a).a(this.f104897g);
                this.f104897g = new JSONArray();
            }
            if (this.f104901k == 0) {
                this.f104901k = System.currentTimeMillis();
            }
            this.f104897g.put(jSONObject);
        } catch (Throwable th2) {
            MLog.e(th2);
        }
    }

    private void e(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.length() <= 0) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has("analytics")) {
                JSONObject jSONObject4 = jSONObject.getJSONObject("analytics");
                if (jSONObject4.has(com.umeng.analytics.pro.d.f104707n)) {
                    JSONArray jSONArray = jSONObject4.getJSONArray(com.umeng.analytics.pro.d.f104707n);
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject5 = jSONArray.getJSONObject(i10);
                        if (jSONObject5 != null && jSONObject5.length() > 0) {
                            jSONArray2.put(jSONObject5);
                        }
                    }
                    jSONObject3.put(com.umeng.analytics.pro.d.f104707n, jSONArray2);
                    if (jSONObject3.length() > 0) {
                        MLog.d("本次启动会话:" + jSONObject3.toString());
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has(com.umeng.analytics.pro.d.L)) {
                    jSONObject3.put(com.umeng.analytics.pro.d.L, jSONObject4.getJSONObject(com.umeng.analytics.pro.d.L));
                    if (jSONObject3.length() > 0) {
                        MLog.d("本次启动账号:" + jSONObject3.toString());
                        jSONObject3 = new JSONObject();
                    }
                }
            }
            if (jSONObject.has("header") && jSONObject.has("header") && (jSONObject2 = jSONObject.getJSONObject("header")) != null && jSONObject2.length() > 0) {
                if (jSONObject2.has("sdk_version")) {
                    jSONObject3.put("sdk_version", jSONObject2.getString("sdk_version"));
                }
                if (jSONObject2.has("device_id")) {
                    jSONObject3.put("device_id", jSONObject2.getString("device_id"));
                }
                if (jSONObject2.has("device_model")) {
                    jSONObject3.put("device_model", jSONObject2.getString("device_model"));
                }
                if (jSONObject2.has("version_code")) {
                    jSONObject3.put("version", jSONObject2.getInt("version_code"));
                }
                if (jSONObject2.has("appkey")) {
                    jSONObject3.put("appkey", jSONObject2.getString("appkey"));
                }
                if (jSONObject2.has("channel")) {
                    jSONObject3.put("channel", jSONObject2.getString("channel"));
                }
                if (jSONObject3.length() > 0) {
                    MLog.d("本次启动基础信息:" + jSONObject3.toString());
                    jSONObject3 = new JSONObject();
                }
            }
            jSONObject3.length();
        } catch (Throwable th2) {
            MLog.e(th2);
        }
    }

    private void f(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject != null && jSONObject.length() > 0) {
                long j10 = jSONObject.getLong("ts");
                b(f104880a);
                d();
                String[] strArrA = com.umeng.analytics.c.a(f104880a);
                if (strArrA == null || TextUtils.isEmpty(strArrA[0]) || TextUtils.isEmpty(strArrA[1])) {
                    return;
                }
                u.a().a(f104880a, j10);
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onProfileSignIn: force generate new session: session id = " + y.a().c(f104880a));
                boolean zB = u.a().b(f104880a, j10, false);
                com.umeng.analytics.c.b(f104880a);
                u.a().a(f104880a, j10, true);
                if (zB) {
                    u.a().b(f104880a, j10);
                }
            }
        } catch (Throwable th2) {
            if (MLog.DEBUG) {
                MLog.e(" Excepthon  in  onProfileSignOff", th2);
            }
        }
    }

    private void f(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        try {
            if (!jSONObject.getJSONObject("header").has(com.umeng.analytics.pro.d.aB)) {
                if (jSONObject.has("content")) {
                    jSONObject = jSONObject.getJSONObject("content");
                }
                if (jSONObject.has("analytics") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("analytics")) != null && jSONObjectOptJSONObject.length() > 0 && jSONObjectOptJSONObject.has(com.umeng.analytics.pro.d.f104707n)) {
                    i.a(f104880a).a(true, false);
                }
                i.a(f104880a).b();
                return;
            }
            if (jSONObject.has("content")) {
                jSONObject = jSONObject.getJSONObject("content");
            }
            if (jSONObject.has("analytics")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("analytics");
                if (jSONObject2.has(com.umeng.analytics.pro.d.f104707n) && (jSONObjectOptJSONObject2 = jSONObject2.getJSONArray(com.umeng.analytics.pro.d.f104707n).optJSONObject(0)) != null) {
                    String strOptString = jSONObjectOptJSONObject2.optString("id");
                    if (!TextUtils.isEmpty(strOptString)) {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> removeAllInstantData: really delete instant session data");
                        i.a(f104880a).b(strOptString);
                    }
                }
            }
            i.a(f104880a).b();
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> removeAllInstantData: send INSTANT_SESSION_START_CONTINUE event because OVERSIZE.");
            Context context = f104880a;
            UMWorkDispatch.sendEvent(context, 4353, CoreProtocol.getInstance(context), null);
        } catch (Exception unused) {
        }
    }

    private void g(Object obj) {
        try {
            b(f104880a);
            d();
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject != null && jSONObject.length() > 0) {
                String string = jSONObject.getString(com.umeng.analytics.pro.d.M);
                String string2 = jSONObject.getString("uid");
                long j10 = jSONObject.getLong("ts");
                String[] strArrA = com.umeng.analytics.c.a(f104880a);
                if (strArrA != null && string.equals(strArrA[0]) && string2.equals(strArrA[1])) {
                    return;
                }
                u.a().a(f104880a, j10);
                String strC = y.a().c(f104880a);
                boolean zB = u.a().b(f104880a, j10, false);
                com.umeng.analytics.c.a(f104880a, string, string2);
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onProfileSignIn: force generate new session: session id = " + strC);
                u.a().a(f104880a, j10, true);
                if (zB) {
                    u.a().b(f104880a, j10);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void g(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        try {
            if (jSONObject.getJSONObject("header").has(com.umeng.analytics.pro.d.aB)) {
                if (jSONObject.has("content")) {
                    jSONObject = jSONObject.getJSONObject("content");
                }
                if (jSONObject.has("analytics")) {
                    if (!jSONObject.getJSONObject("analytics").has(com.umeng.analytics.pro.d.f104707n)) {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> Error, Should not go to this branch.");
                        return;
                    }
                    i.a(f104880a).i();
                    i.a(f104880a).h();
                    i.a(f104880a).b(true, false);
                    i.a(f104880a).a();
                    return;
                }
                return;
            }
            if (jSONObject.has("content")) {
                jSONObject = jSONObject.getJSONObject("content");
            }
            if (jSONObject.has("analytics") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("analytics")) != null && jSONObjectOptJSONObject.length() > 0) {
                if (jSONObjectOptJSONObject.has(com.umeng.analytics.pro.d.f104707n)) {
                    i.a(f104880a).b(true, false);
                }
                if (jSONObjectOptJSONObject.has("ekv") || jSONObjectOptJSONObject.has(com.umeng.analytics.pro.d.T)) {
                    i.a(f104880a).h();
                }
                if (jSONObjectOptJSONObject.has("error")) {
                    i.a(f104880a).i();
                }
            }
            i.a(f104880a).a();
        } catch (Exception unused) {
        }
    }

    private static void h() {
        try {
            f104890y = UMCrashUtils.class;
            Method declaredMethod = UMCrashUtils.class.getDeclaredMethod("setPuidAndProvider", String.class, String.class);
            if (declaredMethod != null) {
                f104891z = declaredMethod;
            }
        } catch (Throwable unused) {
        }
    }

    private void h(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject == null || jSONObject.length() <= 0 || !jSONObject.has("__ii")) {
                return;
            }
            String strOptString = jSONObject.optString("__ii");
            jSONObject.remove("__ii");
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            i.a(f104880a).a(strOptString, obj.toString(), 2);
        } catch (Throwable unused) {
        }
    }

    private void i() {
        JSONObject jSONObjectB = b(UMEnvelopeBuild.maxDataSpace(f104880a));
        if (jSONObjectB == null || jSONObjectB.length() < 1) {
            return;
        }
        JSONObject jSONObject = (JSONObject) jSONObjectB.opt("header");
        JSONObject jSONObject2 = (JSONObject) jSONObjectB.opt("content");
        if (f104880a == null || jSONObject == null || jSONObject2 == null) {
            return;
        }
        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> constructInstantMessage: request build envelope.");
        JSONObject jSONObjectBuildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(f104880a, jSONObject, jSONObject2);
        if (jSONObjectBuildEnvelopeWithExtHeader != null) {
            try {
                if (jSONObjectBuildEnvelopeWithExtHeader.has("exception")) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "Build envelope error code: " + jSONObjectBuildEnvelopeWithExtHeader.getInt("exception"));
                }
            } catch (Throwable unused) {
            }
            if (UMConfigure.isDebugLog()) {
                e(jSONObjectBuildEnvelopeWithExtHeader);
            }
            b((Object) jSONObjectBuildEnvelopeWithExtHeader);
        }
    }

    private void j() {
        JSONObject jSONObjectBuildEnvelopeWithExtHeader;
        JSONObject jSONObjectA = a(UMEnvelopeBuild.maxDataSpace(f104880a));
        if (jSONObjectA == null || jSONObjectA.length() < 1) {
            return;
        }
        JSONObject jSONObject = (JSONObject) jSONObjectA.opt("header");
        JSONObject jSONObject2 = (JSONObject) jSONObjectA.opt("content");
        Context context = f104880a;
        if (context == null || jSONObject == null || jSONObject2 == null || (jSONObjectBuildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(context, jSONObject, jSONObject2)) == null) {
            return;
        }
        try {
            if (jSONObjectBuildEnvelopeWithExtHeader.has("exception")) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "Build envelope error code: " + jSONObjectBuildEnvelopeWithExtHeader.getInt("exception"));
            }
        } catch (Throwable unused) {
        }
        if (UMConfigure.isDebugLog()) {
            d(jSONObjectBuildEnvelopeWithExtHeader);
        }
        a((Object) jSONObjectBuildEnvelopeWithExtHeader);
    }

    private JSONObject k() {
        JSONObject jSONObjectL = l();
        if (jSONObjectL != null) {
            try {
                jSONObjectL.put("st", "1");
            } catch (Throwable unused) {
            }
        }
        return jSONObjectL;
    }

    private JSONObject l() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            if (AnalyticsConfig.mWrapperType != null && (str = AnalyticsConfig.mWrapperVersion) != null) {
                jSONObject.put("wrapper_version", str);
                jSONObject.put("wrapper_type", AnalyticsConfig.mWrapperType);
            }
            int verticalType = AnalyticsConfig.getVerticalType(f104880a);
            jSONObject.put(com.umeng.analytics.pro.d.f104702i, verticalType);
            String str2 = "9.4.4+000";
            if (verticalType == 1) {
                String gameSdkVersion = AnalyticsConfig.getGameSdkVersion(f104880a);
                if (!TextUtils.isEmpty(gameSdkVersion)) {
                    str2 = gameSdkVersion;
                }
                jSONObject.put("sdk_version", str2);
            } else {
                jSONObject.put("sdk_version", "9.4.4+000");
            }
            String strMD5 = HelperUtils.MD5(AnalyticsConfig.getSecretKey(f104880a));
            if (!TextUtils.isEmpty(strMD5)) {
                jSONObject.put("secret", strMD5);
            }
            String strImprintProperty = UMEnvelopeBuild.imprintProperty(f104880a, "pr_ve", null);
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f104880a);
            String strImprintProperty2 = UMEnvelopeBuild.imprintProperty(f104880a, com.umeng.analytics.pro.d.an, "");
            if (!TextUtils.isEmpty(strImprintProperty2)) {
                if (AnalyticsConfig.CLEAR_EKV_BL) {
                    jSONObject.put(com.umeng.analytics.pro.d.ap, "");
                } else {
                    jSONObject.put(com.umeng.analytics.pro.d.ap, strImprintProperty2);
                }
            }
            String strImprintProperty3 = UMEnvelopeBuild.imprintProperty(f104880a, com.umeng.analytics.pro.d.ao, "");
            if (!TextUtils.isEmpty(strImprintProperty3)) {
                if (AnalyticsConfig.CLEAR_EKV_WL) {
                    jSONObject.put(com.umeng.analytics.pro.d.aq, "");
                } else {
                    jSONObject.put(com.umeng.analytics.pro.d.aq, strImprintProperty3);
                }
            }
            jSONObject.put(com.umeng.analytics.pro.d.f104690ah, "1.0.0");
            if (s()) {
                jSONObject.put(com.umeng.analytics.pro.d.f104692aj, "1");
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putLong(f104882m, 0L).commit();
                }
            }
            jSONObject.put(com.umeng.analytics.pro.d.f104705l, m());
            jSONObject.put(com.umeng.analytics.pro.d.f104706m, n());
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString("vers_name", "");
                if (!TextUtils.isEmpty(string)) {
                    String str3 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    if (TextUtils.isEmpty(strImprintProperty)) {
                        jSONObject.put(com.umeng.analytics.pro.d.f104705l, sharedPreferences.getString("vers_pre_version", "0"));
                        jSONObject.put(com.umeng.analytics.pro.d.f104706m, sharedPreferences.getString("vers_date", str3));
                    }
                    sharedPreferences.edit().putString("pre_version", string).putString("cur_version", DeviceConfig.getAppVersionName(f104880a)).putString("pre_date", str3).remove("vers_name").remove("vers_code").remove("vers_date").remove("vers_pre_version").commit();
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return jSONObject;
    }

    private String m() {
        String strImprintProperty = null;
        try {
            strImprintProperty = UMEnvelopeBuild.imprintProperty(f104880a, "pr_ve", null);
            if (TextUtils.isEmpty(strImprintProperty)) {
                if (!TextUtils.isEmpty(this.f104894d)) {
                    return this.f104894d;
                }
                if (this.f104893c == null) {
                    this.f104893c = PreferenceWrapper.getDefault(f104880a);
                }
                String string = this.f104893c.getString("pre_version", "");
                String appVersionName = DeviceConfig.getAppVersionName(f104880a);
                if (TextUtils.isEmpty(string)) {
                    this.f104893c.edit().putString("pre_version", "0").putString("cur_version", appVersionName).commit();
                    strImprintProperty = "0";
                } else {
                    String string2 = this.f104893c.getString("cur_version", "");
                    if (appVersionName.equals(string2)) {
                        strImprintProperty = string;
                    } else {
                        this.f104893c.edit().putString("pre_version", string2).putString("cur_version", appVersionName).commit();
                        strImprintProperty = string2;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        this.f104894d = strImprintProperty;
        return strImprintProperty;
    }

    private String n() {
        String strImprintProperty = null;
        try {
            strImprintProperty = UMEnvelopeBuild.imprintProperty(f104880a, "ud_da", null);
            if (TextUtils.isEmpty(strImprintProperty)) {
                if (!TextUtils.isEmpty(this.f104895e)) {
                    return this.f104895e;
                }
                if (this.f104893c == null) {
                    this.f104893c = PreferenceWrapper.getDefault(f104880a);
                }
                String string = this.f104893c.getString("pre_date", "");
                if (TextUtils.isEmpty(string)) {
                    string = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    this.f104893c.edit().putString("pre_date", string).commit();
                } else {
                    String str = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    if (!string.equals(str)) {
                        this.f104893c.edit().putString("pre_date", str).commit();
                        strImprintProperty = str;
                    }
                }
                strImprintProperty = string;
            }
        } catch (Throwable unused) {
        }
        this.f104895e = strImprintProperty;
        return strImprintProperty;
    }

    private void o() {
        try {
            this.f104899i = 0;
            this.f104900j = 0;
            this.f104901k = System.currentTimeMillis();
            PreferenceWrapper.getDefault(f104880a).edit().putLong(f104884o, System.currentTimeMillis()).putInt(f104885p, 0).commit();
        } catch (Throwable unused) {
        }
    }

    private boolean p() {
        try {
            if (!TextUtils.isEmpty(u.a().b())) {
                b(f104880a);
            }
            if (this.f104897g.length() <= 0) {
                return false;
            }
            for (int i10 = 0; i10 < this.f104897g.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = this.f104897g.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                    String strOptString = jSONObjectOptJSONObject.optString("__i");
                    if (TextUtils.isEmpty(strOptString) || "-1".equals(strOptString)) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    private void q() {
        if (this.f104897g.length() > 0) {
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < this.f104897g.length(); i10++) {
                try {
                    JSONObject jSONObject = this.f104897g.getJSONObject(i10);
                    if (jSONObject == null || jSONObject.length() <= 0) {
                        jSONArray.put(jSONObject);
                    } else {
                        String strOptString = jSONObject.optString("__i");
                        String str = "-1";
                        if (TextUtils.isEmpty(strOptString) || "-1".equals(strOptString)) {
                            String strB = u.a().b();
                            if (!TextUtils.isEmpty(strB)) {
                                str = strB;
                            }
                            jSONObject.put("__i", str);
                        }
                        jSONArray.put(jSONObject);
                    }
                } catch (Throwable unused) {
                }
            }
            this.f104897g = jSONArray;
        }
    }

    private void r() {
        Context context;
        SharedPreferences sharedPreferences;
        try {
            if (!s() || (context = f104880a) == null || (sharedPreferences = PreferenceWrapper.getDefault(context)) == null || sharedPreferences.getLong(f104881l, 0L) != 0) {
                return;
            }
            sharedPreferences.edit().putLong(f104881l, System.currentTimeMillis()).commit();
        } catch (Throwable unused) {
        }
    }

    private boolean s() {
        SharedPreferences sharedPreferences;
        try {
            Context context = f104880a;
            return (context == null || (sharedPreferences = PreferenceWrapper.getDefault(context)) == null || sharedPreferences.getLong(f104882m, -1L) == 0) ? false : true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public JSONObject a(long j10) {
        if (TextUtils.isEmpty(y.a().d(f104880a))) {
            return null;
        }
        JSONObject jSONObjectB = b(false);
        int iA = r.a().a(f104880a);
        if (jSONObjectB.length() > 0) {
            if (jSONObjectB.length() == 1) {
                if (jSONObjectB.optJSONObject(com.umeng.analytics.pro.d.L) != null && iA != 3) {
                    return null;
                }
                if (!TextUtils.isEmpty(jSONObjectB.optString("userlevel")) && iA != 3) {
                    return null;
                }
            } else if (jSONObjectB.length() == 2 && jSONObjectB.optJSONObject(com.umeng.analytics.pro.d.L) != null && !TextUtils.isEmpty(jSONObjectB.optString("userlevel")) && iA != 3) {
                return null;
            }
            String strOptString = jSONObjectB.optString(com.umeng.analytics.pro.d.f104707n);
            String strOptString2 = jSONObjectB.optString(com.umeng.analytics.pro.d.T);
            String strOptString3 = jSONObjectB.optString("ekv");
            if (TextUtils.isEmpty(strOptString) && TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3) && a(jSONObjectB)) {
                return null;
            }
        } else if (iA != 3) {
            return null;
        }
        JSONObject jSONObjectL = l();
        if (jSONObjectL != null) {
            c(jSONObjectL);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (iA == 3) {
                jSONObject2.put("analytics", new JSONObject());
            } else if (jSONObjectB.length() > 0) {
                jSONObject2.put("analytics", jSONObjectB);
            }
            if (jSONObjectL != null && jSONObjectL.length() > 0) {
                jSONObject.put("header", jSONObjectL);
            }
            if (jSONObject2.length() > 0) {
                jSONObject.put("content", jSONObject2);
            }
            return a(jSONObject, j10);
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    public void a() {
        if (f104880a != null) {
            synchronized (this.f104905w) {
                if (this.f104903u) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> network is now available, rebuild instant session data packet.");
                    Context context = f104880a;
                    UMWorkDispatch.sendEvent(context, 4353, CoreProtocol.getInstance(context), null);
                }
            }
            synchronized (this.f104905w) {
                if (this.f104904v) {
                    Context context2 = f104880a;
                    UMWorkDispatch.sendEvent(context2, 4354, CoreProtocol.getInstance(context2), null);
                }
            }
        }
    }

    public void a(Object obj) {
        if (obj != null) {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.length() > 0 && (!jSONObject.has("exception") || 101 != jSONObject.getInt("exception"))) {
                    g(jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void a(Object obj, int i10) {
        if (AnalyticsConfig.enable) {
            try {
                switch (i10) {
                    case 4097:
                        if (!UMUtils.isMainProgress(f104880a)) {
                            UMProcessDBHelper.getInstance(f104880a).insertEventsInSubProcess(UMFrUtils.getSubProcessName(f104880a), new JSONArray().put(obj));
                            return;
                        }
                        if (obj != null) {
                            e(obj);
                        }
                        if ("-1".equals(((JSONObject) obj).optString("__i"))) {
                            return;
                        }
                        a(false);
                        return;
                    case 4098:
                        if (obj != null) {
                            e(obj);
                        }
                        if ("-1".equals(((JSONObject) obj).optString("__i"))) {
                            return;
                        }
                        a(false);
                        return;
                    case 4099:
                        v.a(f104880a);
                        return;
                    case 4100:
                        l.c(f104880a);
                        return;
                    case 4101:
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> PROFILE_SIGNIN");
                        a((Object) null, true);
                        g(obj);
                        return;
                    case 4102:
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> PROFILE_SIGNOFF");
                        a((Object) null, true);
                        f(obj);
                        return;
                    case 4103:
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> START_SESSION");
                        u.a().a(f104880a, obj);
                        synchronized (this.f104905w) {
                            this.f104904v = true;
                            break;
                        }
                        return;
                    case 4104:
                        u.a().c(f104880a, obj);
                        return;
                    case 4105:
                        d();
                        return;
                    case 4106:
                        h(obj);
                        return;
                    default:
                        switch (i10) {
                            case 4352:
                                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> INSTANT_SESSION_START");
                                u.a().b(f104880a, obj);
                                synchronized (this.f104905w) {
                                    this.f104903u = true;
                                    break;
                                }
                                return;
                            case 4353:
                                a(obj, true);
                                return;
                            case 4354:
                                c();
                                return;
                            case 4355:
                                if (!UMUtils.isMainProgress(f104880a)) {
                                    UMProcessDBHelper.getInstance(f104880a).insertEventsInSubProcess(UMFrUtils.getSubProcessName(f104880a), new JSONArray().put(obj));
                                    return;
                                } else {
                                    if (obj != null) {
                                        e(obj);
                                        d();
                                        return;
                                    }
                                    return;
                                }
                            case 4356:
                                if (obj == null || f104890y == null || f104891z == null) {
                                    return;
                                }
                                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> PROFILE_CHANGE_NOTIFY");
                                String string = "";
                                String string2 = "";
                                if (obj instanceof JSONObject) {
                                    JSONObject jSONObject = (JSONObject) obj;
                                    if (jSONObject.has("uid") && jSONObject.has(com.umeng.analytics.pro.d.M)) {
                                        string = jSONObject.getString(com.umeng.analytics.pro.d.M);
                                        string2 = jSONObject.getString("uid");
                                    }
                                    a(string2, string);
                                    return;
                                }
                                return;
                            default:
                                switch (i10) {
                                    case 8195:
                                        com.umeng.analytics.b.a().a(obj);
                                        return;
                                    case 8196:
                                        com.umeng.analytics.b.a().m();
                                        return;
                                    case 8197:
                                        com.umeng.analytics.b.a().k();
                                        return;
                                    default:
                                        switch (i10) {
                                            case 8199:
                                            case 8200:
                                                com.umeng.analytics.b.a().b(obj);
                                                return;
                                            case 8201:
                                                com.umeng.analytics.b.a().b((Object) null);
                                                return;
                                            default:
                                                switch (i10) {
                                                    case 8208:
                                                        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> receive DELAY_BUILD_ENVELOPE event.");
                                                        Context context = f104880a;
                                                        UMWorkDispatch.sendEvent(context, 8209, CoreProtocol.getInstance(context), null);
                                                        Context context2 = f104880a;
                                                        UMWorkDispatch.sendEvent(context2, 4354, CoreProtocol.getInstance(context2), null);
                                                        return;
                                                    case 8209:
                                                        a(obj, false);
                                                        return;
                                                    case 8210:
                                                        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> recv BUILD_ENVELOPE_IMMEDIATELY.");
                                                        if (!UMUtils.isMainProgress(f104880a) || (this.f104892b.c() instanceof ReportPolicy.ReportQuasiRealtime)) {
                                                            return;
                                                        }
                                                        a(true);
                                                        return;
                                                    default:
                                                        switch (i10) {
                                                            case 8213:
                                                                if (FieldManager.allow(com.umeng.commonsdk.utils.b.E)) {
                                                                    if (DeviceConfig.getGlobleActivity(f104880a) != null) {
                                                                        u.b(f104880a);
                                                                    }
                                                                    Context context3 = f104880a;
                                                                    UMWorkDispatch.sendEventEx(context3, 8213, CoreProtocol.getInstance(context3), null, 5000L);
                                                                    return;
                                                                }
                                                                return;
                                                            case 8214:
                                                                if (obj != null && (obj instanceof JSONObject)) {
                                                                    String strOptString = ((JSONObject) obj).optString(AnalyticsConfig.RTD_START_TIME);
                                                                    String strOptString2 = ((JSONObject) obj).optString("period");
                                                                    String strOptString3 = ((JSONObject) obj).optString("debugkey");
                                                                    if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || TextUtils.isEmpty(strOptString3)) {
                                                                        return;
                                                                    }
                                                                    com.umeng.common.b.a(f104880a, AnalyticsConfig.RTD_SP_FILE, AnalyticsConfig.RTD_START_TIME, strOptString);
                                                                    com.umeng.common.b.a(f104880a, AnalyticsConfig.RTD_SP_FILE, "period", strOptString2);
                                                                    com.umeng.common.b.a(f104880a, AnalyticsConfig.RTD_SP_FILE, "debugkey", strOptString3);
                                                                    return;
                                                                }
                                                                return;
                                                            case 8215:
                                                                com.umeng.common.b.a(f104880a, AnalyticsConfig.RTD_SP_FILE);
                                                                return;
                                                            default:
                                                                return;
                                                        }
                                                }
                                        }
                                }
                        }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void a(Object obj, boolean z10) {
        if (z10) {
            if (d(true)) {
                i();
            }
        } else if (UMEnvelopeBuild.isOnline(f104880a) && d(true)) {
            i();
        }
    }

    public void a(boolean z10) {
        if (c(z10)) {
            if (!(this.f104892b.c() instanceof ReportPolicy.ReportQuasiRealtime)) {
                if (UMEnvelopeBuild.isReadyBuild(f104880a, UMLogDataProtocol.UMBusinessType.U_APP)) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> constructMessage()");
                    j();
                    return;
                }
                return;
            }
            if (z10) {
                if (UMEnvelopeBuild.isOnline(f104880a)) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> send session start in policy ReportQuasiRealtime.");
                    j();
                    return;
                }
                return;
            }
            if (UMEnvelopeBuild.isReadyBuild(f104880a, UMLogDataProtocol.UMBusinessType.U_APP)) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> send normal data in policy ReportQuasiRealtime.");
                j();
            }
        }
    }

    public JSONObject b(long j10) {
        if (TextUtils.isEmpty(y.a().d(UMGlobalContext.getAppContext(f104880a)))) {
            return null;
        }
        JSONObject jSONObjectB = i.a(UMGlobalContext.getAppContext(f104880a)).b(false);
        String[] strArrA = com.umeng.analytics.c.a(f104880a);
        if (strArrA != null && !TextUtils.isEmpty(strArrA[0]) && !TextUtils.isEmpty(strArrA[1])) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(com.umeng.analytics.pro.d.M, strArrA[0]);
                jSONObject.put(com.umeng.analytics.pro.d.N, strArrA[1]);
                if (jSONObject.length() > 0) {
                    jSONObjectB.put(com.umeng.analytics.pro.d.L, jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
        int iA = r.a().a(f104880a);
        if (jSONObjectB.length() == 1 && jSONObjectB.optJSONObject(com.umeng.analytics.pro.d.L) != null && iA != 3) {
            return null;
        }
        r.a().b(jSONObjectB, f104880a);
        if (jSONObjectB.length() <= 0 && iA != 3) {
            return null;
        }
        JSONObject jSONObjectK = k();
        if (jSONObjectK != null) {
            b(jSONObjectK);
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            if (iA == 3) {
                jSONObject3.put("analytics", new JSONObject());
            } else if (jSONObjectB.length() > 0) {
                jSONObject3.put("analytics", jSONObjectB);
            }
            if (jSONObjectK != null && jSONObjectK.length() > 0) {
                jSONObject2.put("header", jSONObjectK);
            }
            if (jSONObject3.length() > 0) {
                jSONObject2.put("content", jSONObject3);
            }
            return b(jSONObject2, j10);
        } catch (Throwable unused2) {
            return jSONObject2;
        }
    }

    public JSONObject b(boolean z10) {
        JSONArray jSONArray;
        JSONObject jSONObjectA = null;
        try {
            jSONObjectA = i.a(f104880a).a(z10);
            if (jSONObjectA == null) {
                jSONObjectA = new JSONObject();
            } else {
                try {
                    boolean zHas = jSONObjectA.has(com.umeng.analytics.pro.d.f104707n);
                    jSONObjectA = jSONObjectA;
                    if (zHas) {
                        JSONArray jSONArray2 = jSONObjectA.getJSONArray(com.umeng.analytics.pro.d.f104707n);
                        JSONArray jSONArray3 = new JSONArray();
                        int i10 = 0;
                        while (i10 < jSONArray2.length()) {
                            JSONObject jSONObject = (JSONObject) jSONArray2.get(i10);
                            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("pages");
                            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(com.umeng.analytics.pro.d.f104714u);
                            if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 != null) {
                                jSONObject.put("pages", jSONArrayOptJSONArray2);
                                jSONObject.remove(com.umeng.analytics.pro.d.f104714u);
                            }
                            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray2 != null) {
                                ArrayList arrayList = new ArrayList();
                                for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                                    arrayList.add((JSONObject) jSONArrayOptJSONArray.get(i11));
                                }
                                for (int i12 = 0; i12 < jSONArrayOptJSONArray2.length(); i12++) {
                                    arrayList.add((JSONObject) jSONArrayOptJSONArray2.get(i12));
                                }
                                JSONArraySortUtil jSONArraySortUtil = new JSONArraySortUtil();
                                jSONArraySortUtil.setCompareKey(com.umeng.analytics.pro.d.f104717x);
                                Collections.sort(arrayList, jSONArraySortUtil);
                                JSONArray jSONArray4 = new JSONArray();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    jSONArray4.put((JSONObject) it.next());
                                }
                                jSONObject.put("pages", jSONArray4);
                                jSONObject.remove(com.umeng.analytics.pro.d.f104714u);
                            }
                            if (jSONObject.has("pages")) {
                                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("pages");
                                int i13 = 0;
                                while (i13 < jSONArrayOptJSONArray3.length()) {
                                    JSONObject jSONObject2 = jSONArrayOptJSONArray3.getJSONObject(i13);
                                    if (jSONObject2.has(com.umeng.analytics.pro.d.f104717x)) {
                                        jSONObject2.put("ts", jSONObject2.getLong(com.umeng.analytics.pro.d.f104717x));
                                        jSONObject2.remove(com.umeng.analytics.pro.d.f104717x);
                                    }
                                    i13++;
                                    jSONArray2 = jSONArray2;
                                }
                                jSONArray = jSONArray2;
                                jSONObject.put("pages", jSONArrayOptJSONArray3);
                                jSONObject.put(com.umeng.analytics.pro.d.f104719z, jSONArrayOptJSONArray3.length());
                            } else {
                                jSONArray = jSONArray2;
                                jSONObject.put(com.umeng.analytics.pro.d.f104719z, 0);
                            }
                            jSONArray3.put(jSONObject);
                            i10++;
                            jSONArray2 = jSONArray;
                        }
                        jSONObjectA.put(com.umeng.analytics.pro.d.f104707n, jSONArray3);
                        jSONObjectA = jSONObjectA;
                    }
                } catch (Exception e10) {
                    MLog.e("merge pages error");
                    e10.printStackTrace();
                    jSONObjectA = jSONObjectA;
                }
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f104880a);
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString("userlevel", "");
                if (!TextUtils.isEmpty(string)) {
                    jSONObjectA.put("userlevel", string);
                }
            }
            String[] strArrA = com.umeng.analytics.c.a(f104880a);
            if (strArrA != null && !TextUtils.isEmpty(strArrA[0]) && !TextUtils.isEmpty(strArrA[1])) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(com.umeng.analytics.pro.d.M, strArrA[0]);
                jSONObject3.put(com.umeng.analytics.pro.d.N, strArrA[1]);
                if (jSONObject3.length() > 0) {
                    jSONObjectA.put(com.umeng.analytics.pro.d.L, jSONObject3);
                }
            }
            if (ABTest.getService(f104880a).isInTest()) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put(ABTest.getService(f104880a).getTestName(), ABTest.getService(f104880a).getGroupInfo());
                jSONObjectA.put(com.umeng.analytics.pro.d.K, jSONObject4);
            }
            r.a().a(jSONObjectA, f104880a);
        } catch (Throwable unused) {
        }
        return jSONObjectA;
    }

    public void b() {
    }

    public void b(Context context) {
        try {
            i.a(context).d();
            q();
        } catch (Throwable unused) {
        }
    }

    public void b(Object obj) {
        if (obj != null) {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.length() > 0 && (!jSONObject.has("exception") || 101 != jSONObject.getInt("exception"))) {
                    f(jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void c() {
        b(f104880a);
        d();
        a(true);
    }

    public void c(Object obj) {
        b(f104880a);
        d();
        if (d(false)) {
            j();
        }
    }

    public void d() {
        try {
            if (this.f104897g.length() > 0) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>>*** flushMemoryData: 事件落库。");
                i.a(f104880a).a(this.f104897g);
                this.f104897g = new JSONArray();
            }
            PreferenceWrapper.getDefault(f104880a).edit().putLong(f104883n, this.f104901k).putInt(f104886q, this.f104899i).putInt(f104887r, this.f104900j).commit();
        } catch (Throwable unused) {
        }
    }

    public void d(Object obj) {
        r();
        m();
        n();
        a(true);
    }

    public void e() {
        if (d(false)) {
            j();
        }
    }

    public long f() {
        SharedPreferences sharedPreferences;
        long jCurrentTimeMillis = 0;
        try {
            Context context = f104880a;
            if (context == null || (sharedPreferences = PreferenceWrapper.getDefault(context)) == null) {
                return 0L;
            }
            long j10 = sharedPreferences.getLong(f104881l, 0L);
            if (j10 == 0) {
                try {
                    jCurrentTimeMillis = System.currentTimeMillis();
                    sharedPreferences.edit().putLong(f104881l, jCurrentTimeMillis).commit();
                    return jCurrentTimeMillis;
                } catch (Throwable unused) {
                }
            }
            return j10;
        } catch (Throwable unused2) {
            return jCurrentTimeMillis;
        }
    }
}
