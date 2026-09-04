package com.umeng.analytics;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.pro.d;
import com.umeng.analytics.pro.i;
import com.umeng.analytics.pro.j;
import com.umeng.analytics.pro.k;
import com.umeng.analytics.pro.l;
import com.umeng.analytics.pro.m;
import com.umeng.analytics.pro.n;
import com.umeng.analytics.pro.o;
import com.umeng.analytics.pro.p;
import com.umeng.analytics.pro.s;
import com.umeng.analytics.pro.t;
import com.umeng.analytics.pro.u;
import com.umeng.analytics.pro.v;
import com.umeng.analytics.pro.y;
import com.umeng.common.ISysListener;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.microedition.khronos.opengles.GL10;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: InternalAgent.java */
/* JADX INFO: loaded from: classes4.dex */
public class b implements n, t {
    private static final String A = "umsp_2";
    private static final String B = "umsp_3";
    private static final String C = "umsp_4";
    private static final String D = "umsp_5";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f104344a = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f104345h = "sp_uapp";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f104346i = "prepp_uapp";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f104347o = 128;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f104348p = 256;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static String f104349q = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static String f104350r = "";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f104351s = "ekv_bl";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f104352t = "ekv_bl_ver";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f104353v = "ekv_wl";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f104354w = "ekv_wl_ver";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f104355z = "umsp_1";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ISysListener f104356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p f104357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private v f104358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private k f104359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private u f104360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private l f104361g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f104362j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile JSONObject f104363k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile JSONObject f104364l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile JSONObject f104365m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f104366n;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.umeng.analytics.filter.a f104367u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private com.umeng.analytics.filter.b f104368x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private m f104369y;

    /* JADX INFO: compiled from: InternalAgent.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f104370a = new b();

        private a() {
        }
    }

    static {
        Context appContext = UMGlobalContext.getAppContext();
        if (appContext != null) {
            f104344a = appContext.getApplicationContext();
        }
    }

    private b() {
        this.f104357c = new p();
        this.f104358d = new v();
        this.f104359e = new k();
        this.f104360f = u.a();
        this.f104361g = null;
        this.f104362j = false;
        this.f104363k = null;
        this.f104364l = null;
        this.f104365m = null;
        this.f104366n = false;
        this.f104367u = null;
        this.f104368x = null;
        this.f104369y = null;
        this.f104357c.a(this);
    }

    public static b a() {
        return a.f104370a;
    }

    private void a(Context context, String str, Map<String, Object> map, long j10, boolean z10) {
        try {
            if (context == null) {
                MLog.e("context is null in onEventNoCheck, please check!");
                return;
            }
            if (f104344a == null) {
                f104344a = context.getApplicationContext();
            }
            if (!this.f104362j || !this.f104366n) {
                a(f104344a);
            }
            if (c(str)) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> filter ekv [" + str + "].");
                return;
            }
            String string = "";
            if (this.f104363k == null) {
                this.f104363k = new JSONObject();
            } else {
                string = this.f104363k.toString();
            }
            s.a(f104344a).a(str, map, j10, string, z10);
        } catch (Throwable th2) {
            if (MLog.DEBUG) {
                MLog.e(th2);
            }
        }
    }

    private void a(String str, Object obj) {
        try {
            if (this.f104363k == null) {
                this.f104363k = new JSONObject();
            }
            int i10 = 0;
            if (!obj.getClass().isArray()) {
                if (!(obj instanceof List)) {
                    if ((obj instanceof String) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof Short)) {
                        this.f104363k.put(str, obj);
                        return;
                    }
                    return;
                }
                List list = (List) obj;
                JSONArray jSONArray = new JSONArray();
                while (i10 < list.size()) {
                    Object obj2 = list.get(i10);
                    if ((obj2 instanceof String) || (obj2 instanceof Long) || (obj2 instanceof Integer) || (obj2 instanceof Float) || (obj2 instanceof Double) || (obj2 instanceof Short)) {
                        jSONArray.put(list.get(i10));
                    }
                    i10++;
                }
                this.f104363k.put(str, jSONArray);
                return;
            }
            if (obj instanceof String[]) {
                String[] strArr = (String[]) obj;
                if (strArr.length > 10) {
                    return;
                }
                JSONArray jSONArray2 = new JSONArray();
                while (i10 < strArr.length) {
                    String str2 = strArr[i10];
                    if (str2 != null && !HelperUtils.checkStrLen(str2, 256)) {
                        jSONArray2.put(strArr[i10]);
                    }
                    i10++;
                }
                this.f104363k.put(str, jSONArray2);
                return;
            }
            if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                JSONArray jSONArray3 = new JSONArray();
                while (i10 < jArr.length) {
                    jSONArray3.put(jArr[i10]);
                    i10++;
                }
                this.f104363k.put(str, jSONArray3);
                return;
            }
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                JSONArray jSONArray4 = new JSONArray();
                while (i10 < iArr.length) {
                    jSONArray4.put(iArr[i10]);
                    i10++;
                }
                this.f104363k.put(str, jSONArray4);
                return;
            }
            if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                JSONArray jSONArray5 = new JSONArray();
                while (i10 < fArr.length) {
                    jSONArray5.put(fArr[i10]);
                    i10++;
                }
                this.f104363k.put(str, jSONArray5);
                return;
            }
            if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                JSONArray jSONArray6 = new JSONArray();
                while (i10 < dArr.length) {
                    jSONArray6.put(dArr[i10]);
                    i10++;
                }
                this.f104363k.put(str, jSONArray6);
                return;
            }
            if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                JSONArray jSONArray7 = new JSONArray();
                while (i10 < sArr.length) {
                    jSONArray7.put((int) sArr[i10]);
                    i10++;
                }
                this.f104363k.put(str, jSONArray7);
            }
        } catch (Throwable unused) {
        }
    }

    private boolean b(String str, Object obj) {
        int length;
        try {
            if (TextUtils.isEmpty(str)) {
                MLog.e("key is " + str + ", please check key, illegal");
                return false;
            }
            try {
                length = str.getBytes("UTF-8").length;
            } catch (UnsupportedEncodingException unused) {
                length = 0;
            }
            if (length > 128) {
                MLog.e("key length is " + length + ", please check key, illegal");
                return false;
            }
            if (obj instanceof String) {
                if (((String) obj).getBytes("UTF-8").length <= 256) {
                    return true;
                }
                MLog.e("value length is " + ((String) obj).getBytes("UTF-8").length + ", please check value, illegal");
                return false;
            }
            if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Float)) {
                return true;
            }
            MLog.e("value is " + obj + ", please check value, type illegal");
            return false;
        } catch (Throwable unused2) {
        }
    }

    private boolean c(String str) {
        if (this.f104367u.enabled() && this.f104367u.matchHit(str)) {
            return true;
        }
        if (!this.f104368x.enabled()) {
            return false;
        }
        if (!this.f104368x.matchHit(str)) {
            return true;
        }
        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> white list match! id = " + str);
        return false;
    }

    private void i(Context context) {
        try {
            if (context == null) {
                MLog.e("unexpected null context in getNativeSuperProperties");
                return;
            }
            if (f104344a == null) {
                f104344a = context.getApplicationContext();
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (this.f104363k == null) {
                this.f104363k = new JSONObject();
            }
            if (this.f104364l == null) {
                this.f104364l = new JSONObject();
            }
            String string = sharedPreferences.getString(f104346i, null);
            if (!TextUtils.isEmpty(string)) {
                try {
                    this.f104365m = new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            if (this.f104365m == null) {
                this.f104365m = new JSONObject();
            }
        } catch (Throwable unused2) {
        }
    }

    void a(double d10, double d11) {
        Context context = f104344a;
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.e("setLocation can not be called in child process");
            return;
        }
        if (AnalyticsConfig.f104321a == null) {
            AnalyticsConfig.f104321a = new double[2];
        }
        double[] dArr = AnalyticsConfig.f104321a;
        dArr[0] = d10;
        dArr[1] = d11;
    }

    void a(long j10) {
        Context context = f104344a;
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.e("setSessionContinueMillis can not be called in child process");
        } else {
            AnalyticsConfig.kContinueSessionMillis = j10;
            y.a().a(AnalyticsConfig.kContinueSessionMillis);
        }
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (f104344a == null) {
                f104344a = context.getApplicationContext();
            }
            if (this.f104367u == null) {
                com.umeng.analytics.filter.a aVar = new com.umeng.analytics.filter.a("ekv_bl", "ekv_bl_ver");
                this.f104367u = aVar;
                aVar.register(f104344a);
            }
            if (this.f104368x == null) {
                com.umeng.analytics.filter.b bVar = new com.umeng.analytics.filter.b("ekv_wl", "ekv_wl_ver");
                this.f104368x = bVar;
                bVar.register(f104344a);
            }
            if (UMUtils.isMainProgress(f104344a)) {
                if (!this.f104362j) {
                    this.f104362j = true;
                    i(f104344a);
                }
                synchronized (this) {
                    if (!this.f104366n) {
                        l lVarA = l.a(context);
                        this.f104361g = lVarA;
                        if (lVarA.a()) {
                            this.f104366n = true;
                        }
                        this.f104369y = m.a();
                        try {
                            m.a(context);
                            this.f104369y.a(this);
                        } catch (Throwable unused) {
                        }
                    }
                }
                if (UMConfigure.isDebugLog()) {
                    UMLog.mutlInfo(j.B, 3, "", null, null);
                }
                UMWorkDispatch.registerConnStateObserver(CoreProtocol.getInstance(f104344a));
            }
        } catch (Throwable unused2) {
        }
    }

    public void a(Context context, int i10) {
        if (context == null) {
            MLog.e("unexpected null context in setVerticalType");
            return;
        }
        if (f104344a == null) {
            f104344a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f104344a)) {
            MLog.e("setVerticalType can not be called in child process");
            return;
        }
        if (!this.f104362j || !this.f104366n) {
            a(f104344a);
        }
        AnalyticsConfig.a(f104344a, i10);
    }

    void a(Context context, MobclickAgent.EScenarioType eScenarioType) {
        if (context == null) {
            MLog.e("unexpected null context in setScenarioType");
            return;
        }
        if (f104344a == null) {
            f104344a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f104344a)) {
            MLog.e("setScenarioType can not be called in child process");
            return;
        }
        if (eScenarioType != null) {
            a(f104344a, eScenarioType.toValue());
        }
        if (this.f104362j && this.f104366n) {
            return;
        }
        a(f104344a);
    }

    void a(Context context, String str) {
        if (context == null) {
            UMLog.aq(j.f104849w, 0, "\\|");
            return;
        }
        if (f104344a == null) {
            f104344a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f104344a)) {
            MLog.e("reportError can not be called in child process");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            if (UMConfigure.isDebugLog()) {
                UMLog.aq(j.f104850x, 0, "\\|");
                return;
            }
            return;
        }
        try {
            if (!this.f104362j || !this.f104366n) {
                a(f104344a);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ts", System.currentTimeMillis());
            jSONObject.put(d.Q, 2);
            jSONObject.put(d.R, str);
            jSONObject.put("__ii", this.f104360f.c());
            Context context2 = f104344a;
            UMWorkDispatch.sendEvent(context2, 4106, CoreProtocol.getInstance(context2), jSONObject);
        } catch (Throwable th2) {
            if (MLog.DEBUG) {
                MLog.e(th2);
            }
        }
    }

    public synchronized void a(Context context, String str, Object obj) {
        int i10 = 0;
        try {
            if (context == null) {
                UMLog.aq(j.f104821af, 0, "\\|");
                return;
            }
            if (f104344a == null) {
                f104344a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f104344a)) {
                MLog.e("registerSuperProperty can not be called in child process");
                return;
            }
            if (!this.f104362j || !this.f104366n) {
                a(f104344a);
            }
            if (!TextUtils.isEmpty(str) && obj != null) {
                if (!str.equals(f104355z) && !str.equals(A) && !str.equals(B) && !str.equals(C) && !str.equals(D)) {
                    MLog.e("property name is " + str + ", please check key, must be correct!");
                    return;
                }
                if ((obj instanceof String) && !HelperUtils.checkStrLen(obj.toString(), 256)) {
                    MLog.e("property value is " + obj + ", please check value, lawless!");
                    return;
                }
                try {
                    if (this.f104363k == null) {
                        this.f104363k = new JSONObject();
                    }
                    if (!obj.getClass().isArray()) {
                        if (!(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Integer) && !(obj instanceof Float) && !(obj instanceof Double) && !(obj instanceof Short)) {
                            MLog.e("please check value, illegal type!");
                            return;
                        }
                        this.f104363k.put(str, obj);
                    } else if (obj instanceof String[]) {
                        String[] strArr = (String[]) obj;
                        if (strArr.length > 10) {
                            MLog.e("please check value, size is " + strArr.length + ", overstep 10!");
                            return;
                        }
                        JSONArray jSONArray = new JSONArray();
                        while (i10 < strArr.length) {
                            String str2 = strArr[i10];
                            if (str2 != null && HelperUtils.checkStrLen(str2, 256)) {
                                jSONArray.put(strArr[i10]);
                                i10++;
                            }
                            MLog.e("please check value, length is " + strArr[i10].length() + ", overlength 256!");
                            return;
                        }
                        this.f104363k.put(str, jSONArray);
                    } else if (obj instanceof long[]) {
                        long[] jArr = (long[]) obj;
                        if (jArr.length > 10) {
                            MLog.e("please check value, size is " + jArr.length + ", overstep 10!");
                            return;
                        }
                        JSONArray jSONArray2 = new JSONArray();
                        while (i10 < jArr.length) {
                            jSONArray2.put(jArr[i10]);
                            i10++;
                        }
                        this.f104363k.put(str, jSONArray2);
                    } else if (obj instanceof int[]) {
                        int[] iArr = (int[]) obj;
                        if (iArr.length > 10) {
                            MLog.e("please check value, size is " + iArr.length + ", overstep 10!");
                            return;
                        }
                        JSONArray jSONArray3 = new JSONArray();
                        while (i10 < iArr.length) {
                            jSONArray3.put(iArr[i10]);
                            i10++;
                        }
                        this.f104363k.put(str, jSONArray3);
                    } else if (obj instanceof float[]) {
                        float[] fArr = (float[]) obj;
                        if (fArr.length > 10) {
                            MLog.e("please check value, size is " + fArr.length + ", overstep 10!");
                            return;
                        }
                        JSONArray jSONArray4 = new JSONArray();
                        while (i10 < fArr.length) {
                            jSONArray4.put(fArr[i10]);
                            i10++;
                        }
                        this.f104363k.put(str, jSONArray4);
                    } else if (obj instanceof double[]) {
                        double[] dArr = (double[]) obj;
                        if (dArr.length > 10) {
                            MLog.e("please check value, size is " + dArr.length + ", overstep 10!");
                            return;
                        }
                        JSONArray jSONArray5 = new JSONArray();
                        while (i10 < dArr.length) {
                            jSONArray5.put(dArr[i10]);
                            i10++;
                        }
                        this.f104363k.put(str, jSONArray5);
                    } else {
                        if (!(obj instanceof short[])) {
                            MLog.e("please check value, illegal type!");
                            return;
                        }
                        short[] sArr = (short[]) obj;
                        if (sArr.length > 10) {
                            MLog.e("please check value, size is " + sArr.length + ", overstep 10!");
                            return;
                        }
                        JSONArray jSONArray6 = new JSONArray();
                        while (i10 < sArr.length) {
                            jSONArray6.put((int) sArr[i10]);
                            i10++;
                        }
                        this.f104363k.put(str, jSONArray6);
                    }
                } catch (Throwable unused) {
                }
                Context context2 = f104344a;
                UMWorkDispatch.sendEvent(context2, 8195, CoreProtocol.getInstance(context2), this.f104363k.toString());
                return;
            }
            UMLog.aq(j.f104822ag, 0, "\\|");
        } catch (Throwable unused2) {
        }
    }

    public void a(Context context, String str, String str2, long j10, int i10) {
        if (context == null) {
            return;
        }
        try {
            if (f104344a == null) {
                f104344a = context.getApplicationContext();
            }
            if (!this.f104362j || !this.f104366n) {
                a(f104344a);
            }
            if (c(str)) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> filter ekv [" + str + "].");
                return;
            }
            String string = "";
            if (this.f104363k == null) {
                this.f104363k = new JSONObject();
            } else {
                string = this.f104363k.toString();
            }
            s.a(f104344a).a(str, str2, j10, i10, string);
        } catch (Throwable th2) {
            if (MLog.DEBUG) {
                MLog.e(th2);
            }
        }
    }

    public void a(Context context, String str, HashMap<String, Object> map) {
        if (context == null) {
            return;
        }
        try {
            if (f104344a == null) {
                f104344a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f104344a)) {
                MLog.e("onGKVEvent can not be called in child process");
                return;
            }
            if (!this.f104362j || !this.f104366n) {
                a(f104344a);
            }
            String string = "";
            if (this.f104363k == null) {
                this.f104363k = new JSONObject();
            } else {
                string = this.f104363k.toString();
            }
            s.a(f104344a).a(str, map, string);
        } catch (Throwable th2) {
            if (MLog.DEBUG) {
                MLog.e(th2);
            }
        }
    }

    public void a(Context context, String str, Map<String, Object> map) {
        a(context, str, map, -1L, true);
    }

    void a(Context context, String str, Map<String, Object> map, long j10) {
        try {
            if (TextUtils.isEmpty(str)) {
                UMLog.aq(j.f104829c, 0, "\\|");
                return;
            }
            if (Arrays.asList(d.aF).contains(str)) {
                UMLog.aq(j.f104828b, 0, "\\|");
                return;
            }
            if (map.isEmpty()) {
                UMLog.aq(j.f104830d, 0, "\\|");
                return;
            }
            Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (Arrays.asList(d.aF).contains(it.next().getKey())) {
                    UMLog.aq(j.f104831e, 0, "\\|");
                    return;
                }
            }
            a(context, str, map, j10, false);
        } catch (Throwable th2) {
            if (MLog.DEBUG) {
                MLog.e(th2);
            }
        }
    }

    void a(Context context, Throwable th2) {
        if (context == null || th2 == null) {
            UMLog.aq(j.f104851y, 0, "\\|");
            return;
        }
        if (f104344a == null) {
            f104344a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f104344a)) {
            MLog.e("reportError can not be called in child process");
            return;
        }
        try {
            if (!this.f104362j || !this.f104366n) {
                a(f104344a);
            }
            a(f104344a, DataHelper.convertExceptionToString(th2));
        } catch (Exception e10) {
            if (MLog.DEBUG) {
                MLog.e(e10);
            }
        }
    }

    public synchronized void a(Context context, List<String> list) {
        try {
            if (context == null) {
                UMLog.aq(j.f104825aj, 0, "\\|");
                return;
            }
            if (f104344a == null) {
                f104344a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f104344a)) {
                MLog.e("setFirstLaunchEvent can not be called in child process");
                return;
            }
            if (!this.f104362j || !this.f104366n) {
                a(f104344a);
            }
            s.a(f104344a).a(list);
        } catch (Throwable th2) {
            MLog.e(th2);
        }
    }

    public synchronized void a(Context context, JSONObject jSONObject) {
        try {
            if (context == null) {
                UMLog.aq(j.f104827al, 0, "\\|");
                return;
            }
            if (f104344a == null) {
                f104344a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f104344a)) {
                MLog.e("registerPreProperties can not be called in child process");
                return;
            }
            if (!this.f104362j || !this.f104366n) {
                a(f104344a);
            }
            if (this.f104365m == null) {
                this.f104365m = new JSONObject();
            }
            if (jSONObject == null || jSONObject.length() <= 0) {
                UMLog.aq(j.am, 0, "\\|");
                return;
            }
            JSONObject jSONObject2 = null;
            try {
                jSONObject2 = new JSONObject(this.f104365m.toString());
            } catch (Exception unused) {
            }
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            Iterator<String> itKeys = jSONObject.keys();
            if (itKeys != null) {
                while (itKeys.hasNext()) {
                    try {
                        String string = itKeys.next().toString();
                        Object obj = jSONObject.get(string);
                        if (b(string, obj)) {
                            jSONObject2.put(string, obj);
                            if (jSONObject2.length() > 10) {
                                MLog.e("please check propertics, size overlength!");
                                return;
                            }
                            continue;
                        } else {
                            return;
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
            this.f104365m = jSONObject2;
            if (this.f104365m.length() > 0) {
                Context context2 = f104344a;
                UMWorkDispatch.sendEvent(context2, 8199, CoreProtocol.getInstance(context2), this.f104365m.toString());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void a(ISysListener iSysListener) {
        if (UMUtils.isMainProgress(f104344a)) {
            this.f104356b = iSysListener;
        } else {
            MLog.e("setSysListener can not be called in child process");
        }
    }

    public synchronized void a(Object obj) {
        try {
            Context context = f104344a;
            if (context == null) {
                return;
            }
            if (!UMUtils.isMainProgress(context)) {
                MLog.e("registerSuperPropertyByCoreProtocol can not be called in child process");
                return;
            }
            if (obj != null) {
                String str = (String) obj;
                SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(f104344a).edit();
                if (editorEdit != null && !TextUtils.isEmpty(str)) {
                    editorEdit.putString(f104345h, this.f104363k.toString()).commit();
                }
            }
        } catch (Throwable unused) {
        }
    }

    void a(String str) {
        if (!UMUtils.isMainProgress(f104344a)) {
            MLog.e("onPageStart can not be called in child process");
            return;
        }
        try {
            if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.LEGACY_AUTO) {
                this.f104358d.a(str);
            }
        } catch (Throwable unused) {
        }
    }

    void a(String str, String str2) {
        try {
            Context context = f104344a;
            if (context == null) {
                return;
            }
            if (!UMUtils.isMainProgress(context)) {
                MLog.e("onProfileSignIn can not be called in child process");
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(d.M, str);
            jSONObject.put("uid", str2);
            jSONObject.put("ts", jCurrentTimeMillis);
            Context context2 = f104344a;
            UMWorkDispatch.sendEvent(context2, 4101, CoreProtocol.getInstance(context2), jSONObject);
            Context context3 = f104344a;
            UMWorkDispatch.sendEvent(context3, 4356, CoreProtocol.getInstance(context3), jSONObject);
        } catch (Throwable th2) {
            if (MLog.DEBUG) {
                MLog.e(" Excepthon  in  onProfileSignIn", th2);
            }
        }
    }

    @Override // com.umeng.analytics.pro.t
    public void a(Throwable th2) {
        try {
            Context context = f104344a;
            if (context == null) {
                return;
            }
            if (!UMUtils.isMainProgress(context)) {
                MLog.e("onAppCrash can not be called in child process");
                return;
            }
            if (AnalyticsConfig.enable) {
                v vVar = this.f104358d;
                if (vVar != null) {
                    vVar.b();
                }
                l.a(f104344a, "onAppCrash");
                k kVar = this.f104359e;
                if (kVar != null) {
                    kVar.b();
                }
                l lVar = this.f104361g;
                if (lVar != null) {
                    lVar.c();
                }
                u uVar = this.f104360f;
                if (uVar != null) {
                    uVar.c(f104344a, Long.valueOf(System.currentTimeMillis()));
                }
                if (th2 != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("ts", System.currentTimeMillis());
                    jSONObject.put(d.Q, 1);
                    jSONObject.put(d.R, DataHelper.convertExceptionToString(th2));
                    i.a(f104344a).a(this.f104360f.c(), jSONObject.toString(), 1);
                }
                o.a(f104344a).d();
                v.a(f104344a);
                if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO) {
                    l.c(f104344a);
                }
                PreferenceWrapper.getDefault(f104344a).edit().commit();
            }
        } catch (Exception e10) {
            if (MLog.DEBUG) {
                MLog.e("Exception in onAppCrash", e10);
            }
        }
    }

    void a(GL10 gl10) {
        String[] gpu = UMUtils.getGPU(gl10);
        if (gpu.length == 2) {
            AnalyticsConfig.GPU_VENDER = gpu[0];
            AnalyticsConfig.GPU_RENDERER = gpu[1];
        }
    }

    void a(boolean z10) {
        Context context = f104344a;
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.e("setCatchUncaughtExceptions can not be called in child process");
        } else {
            if (AnalyticsConfig.CHANGE_CATCH_EXCEPTION_NOTALLOW) {
                return;
            }
            AnalyticsConfig.CATCH_EXCEPTION = z10;
        }
    }

    public JSONObject b() {
        return this.f104363k;
    }

    void b(Context context) {
        if (context == null) {
            MLog.e("unexpected null context in onResume");
            return;
        }
        if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO) {
            return;
        }
        if (f104344a == null) {
            f104344a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f104344a)) {
            MLog.e("onResume can not be called in child process");
            return;
        }
        if (UMConfigure.isDebugLog() && !(context instanceof Activity)) {
            UMLog.aq(j.f104841o, 2, "\\|");
        }
        try {
            if (!this.f104362j || !this.f104366n) {
                a(context);
            }
            if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.LEGACY_MANUAL) {
                this.f104359e.a(context.getClass().getName());
            }
            h();
            if (UMConfigure.isDebugLog() && (context instanceof Activity)) {
                f104349q = context.getClass().getName();
            }
        } catch (Throwable th2) {
            MLog.e("Exception occurred in Mobclick.onResume(). ", th2);
        }
    }

    public void b(Context context, String str) {
        try {
            if (context == null) {
                UMLog.aq(j.N, 0, "\\|");
                return;
            }
            if (f104344a == null) {
                f104344a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f104344a)) {
                MLog.e("onDeepLinkReceived can not be called in child process");
                return;
            }
            if (!this.f104362j || !this.f104366n) {
                a(f104344a);
            }
            if (TextUtils.isEmpty(str)) {
                UMLog.aq(j.O, 0, "\\|");
                return;
            }
            HashMap map = new HashMap();
            map.put(d.aE, str);
            a(f104344a, d.aD, (Map<String, Object>) map, -1L, false);
        } catch (Throwable th2) {
            if (MLog.DEBUG) {
                MLog.e(th2);
            }
        }
    }

    public synchronized void b(Object obj) {
        try {
            Context context = f104344a;
            if (context == null) {
                return;
            }
            if (!UMUtils.isMainProgress(context)) {
                MLog.e("updateNativePrePropertiesByCoreProtocol can not be called in child process");
                return;
            }
            SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(f104344a).edit();
            if (obj != null) {
                String str = (String) obj;
                if (editorEdit != null && !TextUtils.isEmpty(str)) {
                    editorEdit.putString(f104346i, str).commit();
                }
            } else if (editorEdit != null) {
                editorEdit.remove(f104346i).commit();
            }
        } catch (Throwable unused) {
        }
    }

    void b(String str) {
        if (!UMUtils.isMainProgress(f104344a)) {
            MLog.e("onPageEnd can not be called in child process");
            return;
        }
        try {
            if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.LEGACY_AUTO) {
                this.f104358d.b(str);
            }
        } catch (Throwable unused) {
        }
    }

    public JSONObject c() {
        return this.f104365m;
    }

    void c(Context context) {
        if (context == null) {
            UMLog.aq(j.f104842p, 0, "\\|");
            return;
        }
        if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO) {
            return;
        }
        if (f104344a == null) {
            f104344a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f104344a)) {
            MLog.e("onPause can not be called in child process");
            return;
        }
        if (UMConfigure.isDebugLog() && !(context instanceof Activity)) {
            UMLog.aq(j.f104843q, 2, "\\|");
        }
        try {
            if (!this.f104362j || !this.f104366n) {
                a(context);
            }
            if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.LEGACY_MANUAL) {
                this.f104359e.b(context.getClass().getName());
            }
            i();
        } catch (Throwable th2) {
            if (MLog.DEBUG) {
                MLog.e("Exception occurred in Mobclick.onRause(). ", th2);
            }
        }
        if (UMConfigure.isDebugLog() && (context instanceof Activity)) {
            f104350r = context.getClass().getName();
        }
    }

    void c(Context context, String str) {
        if (context == null) {
            UMLog.aq(j.f104852z, 0, "\\|");
            return;
        }
        if (f104344a == null) {
            f104344a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f104344a)) {
            MLog.e("setSecret can not be called in child process");
            return;
        }
        if (!this.f104362j || !this.f104366n) {
            a(f104344a);
        }
        AnalyticsConfig.a(f104344a, str);
    }

    public JSONObject d() {
        return this.f104364l;
    }

    void d(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (f104344a == null) {
                f104344a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f104344a)) {
                MLog.e("onKillProcess can not be called in child process");
                return;
            }
            l lVar = this.f104361g;
            if (lVar != null) {
                lVar.c();
            }
            l.a(context, "onKillProcess");
            k kVar = this.f104359e;
            if (kVar != null) {
                kVar.b();
            }
            v vVar = this.f104358d;
            if (vVar != null) {
                vVar.b();
            }
            Context context2 = f104344a;
            if (context2 != null) {
                u uVar = this.f104360f;
                if (uVar != null) {
                    uVar.c(context2, Long.valueOf(System.currentTimeMillis()));
                }
                o.a(f104344a).d();
                v.a(f104344a);
                if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO) {
                    l.c(f104344a);
                }
                PreferenceWrapper.getDefault(f104344a).edit().commit();
            }
        } catch (Throwable unused) {
        }
    }

    public synchronized void d(Context context, String str) {
        try {
            if (context == null) {
                UMLog.aq(j.f104823ah, 0, "\\|");
                return;
            }
            if (f104344a == null) {
                f104344a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f104344a)) {
                MLog.e("unregisterSuperProperty can not be called in child process");
                return;
            }
            if (!this.f104362j || !this.f104366n) {
                a(f104344a);
            }
            if (TextUtils.isEmpty(str)) {
                UMLog.aq(j.f104822ag, 0, "\\|");
                return;
            }
            if (!str.equals(f104355z) && !str.equals(A) && !str.equals(B) && !str.equals(C) && !str.equals(D)) {
                MLog.e("please check key or value, must be correct!");
                return;
            }
            if (this.f104363k == null) {
                this.f104363k = new JSONObject();
            }
            if (this.f104363k.has(str)) {
                this.f104363k.remove(str);
                Context context2 = f104344a;
                UMWorkDispatch.sendEvent(context2, 8197, CoreProtocol.getInstance(context2), str);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public synchronized Object e(Context context, String str) {
        try {
            if (context == null) {
                UMLog.aq(j.f104824ai, 0, "\\|");
                return null;
            }
            if (f104344a == null) {
                f104344a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f104344a)) {
                MLog.e("getSuperProperty can not be called in child process");
                return null;
            }
            if (TextUtils.isEmpty(str)) {
                UMLog.aq(j.f104822ag, 0, "\\|");
                return null;
            }
            if (!str.equals(f104355z) && !str.equals(A) && !str.equals(B) && !str.equals(C) && !str.equals(D)) {
                MLog.e("please check key or value, must be correct!");
                return null;
            }
            if (this.f104363k == null) {
                this.f104363k = new JSONObject();
            } else if (this.f104363k.has(str)) {
                return this.f104363k.opt(str);
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    public synchronized String e(Context context) {
        try {
            if (context == null) {
                UMLog.aq(j.f104824ai, 0, "\\|");
                return null;
            }
            if (f104344a == null) {
                f104344a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f104344a)) {
                MLog.e("getSuperProperties can not be called in child process");
                return null;
            }
            if (this.f104363k != null) {
                return this.f104363k.toString();
            }
            this.f104363k = new JSONObject();
            return null;
        } catch (Throwable unused) {
        }
    }

    public void e() {
        this.f104364l = null;
    }

    public String f() {
        if (UMUtils.isMainProgress(f104344a)) {
            return f104349q;
        }
        MLog.e("getOnResumedActivityName can not be called in child process");
        return null;
    }

    public synchronized void f(Context context) {
        try {
            if (context == null) {
                UMLog.aq(j.f104823ah, 0, "\\|");
                return;
            }
            if (f104344a == null) {
                f104344a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f104344a)) {
                MLog.e("clearSuperProperties can not be called in child process");
                return;
            }
            if (!this.f104362j || !this.f104366n) {
                a(f104344a);
            }
            this.f104363k = new JSONObject();
            Context context2 = f104344a;
            UMWorkDispatch.sendEvent(context2, 8196, CoreProtocol.getInstance(context2), null);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void f(Context context, String str) {
        try {
            if (context == null) {
                UMLog.aq(j.an, 0, "\\|");
                return;
            }
            if (f104344a == null) {
                f104344a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f104344a)) {
                MLog.e("unregisterPreProperty can not be called in child process");
                return;
            }
            if (!this.f104362j || !this.f104366n) {
                a(f104344a);
            }
            if (this.f104365m == null) {
                this.f104365m = new JSONObject();
            }
            if (str != null && str.length() > 0) {
                if (this.f104365m.has(str)) {
                    this.f104365m.remove(str);
                    Context context2 = f104344a;
                    UMWorkDispatch.sendEvent(context2, 8200, CoreProtocol.getInstance(context2), this.f104365m.toString());
                } else if (UMConfigure.isDebugLog()) {
                    UMLog.aq(j.ao, 0, "\\|");
                }
                return;
            }
            MLog.e("please check propertics, property is null!");
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public String g() {
        if (UMUtils.isMainProgress(f104344a)) {
            return f104350r;
        }
        MLog.e("getOnPausedActivityName can not be called in child process");
        return null;
    }

    public synchronized void g(Context context) {
        try {
            if (context == null) {
                UMLog.aq(j.ap, 0, "\\|");
                return;
            }
            if (f104344a == null) {
                f104344a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f104344a)) {
                MLog.e("clearPreProperties can not be called in child process");
                return;
            }
            if (!this.f104362j || !this.f104366n) {
                a(f104344a);
            }
            if (this.f104365m.length() > 0) {
                Context context2 = f104344a;
                UMWorkDispatch.sendEvent(context2, 8201, CoreProtocol.getInstance(context2), null);
            }
            this.f104365m = new JSONObject();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized JSONObject h(Context context) {
        try {
            if (context == null) {
                UMLog.aq(j.aq, 0, "\\|");
                return null;
            }
            if (f104344a == null) {
                f104344a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f104344a)) {
                MLog.e("getPreProperties can not be called in child process");
                return null;
            }
            if (!this.f104362j || !this.f104366n) {
                a(f104344a);
            }
            if (this.f104365m == null) {
                this.f104365m = new JSONObject();
            }
            JSONObject jSONObject = new JSONObject();
            if (this.f104365m.length() > 0) {
                try {
                    jSONObject = new JSONObject(this.f104365m.toString());
                } catch (JSONException unused) {
                }
            }
            return jSONObject;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void h() {
        try {
            Context context = f104344a;
            if (context != null) {
                if (!UMUtils.isMainProgress(context)) {
                    MLog.e("onStartSessionInternal can not be called in child process");
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                Context context2 = f104344a;
                UMWorkDispatch.sendEvent(context2, 4352, CoreProtocol.getInstance(context2), Long.valueOf(jCurrentTimeMillis));
                Context context3 = f104344a;
                UMWorkDispatch.sendEvent(context3, 4103, CoreProtocol.getInstance(context3), Long.valueOf(jCurrentTimeMillis));
            }
            ISysListener iSysListener = this.f104356b;
            if (iSysListener != null) {
                iSysListener.onAppResume();
            }
        } catch (Throwable unused) {
        }
    }

    public void i() {
        try {
            Context context = f104344a;
            if (context != null) {
                if (!UMUtils.isMainProgress(context)) {
                    MLog.e("onEndSessionInternal can not be called in child process");
                    return;
                }
                Context context2 = f104344a;
                UMWorkDispatch.sendEvent(context2, 4104, CoreProtocol.getInstance(context2), Long.valueOf(System.currentTimeMillis()));
                Context context3 = f104344a;
                UMWorkDispatch.sendEvent(context3, 4100, CoreProtocol.getInstance(context3), null);
                Context context4 = f104344a;
                UMWorkDispatch.sendEvent(context4, 4099, CoreProtocol.getInstance(context4), null);
                Context context5 = f104344a;
                UMWorkDispatch.sendEvent(context5, 4105, CoreProtocol.getInstance(context5), null);
            }
        } catch (Throwable unused) {
        }
        ISysListener iSysListener = this.f104356b;
        if (iSysListener != null) {
            iSysListener.onAppPause();
        }
    }

    void j() {
        try {
            Context context = f104344a;
            if (context == null) {
                return;
            }
            if (!UMUtils.isMainProgress(context)) {
                MLog.e("onProfileSignOff can not be called in child process");
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ts", jCurrentTimeMillis);
            Context context2 = f104344a;
            UMWorkDispatch.sendEvent(context2, 4102, CoreProtocol.getInstance(context2), jSONObject);
            Context context3 = f104344a;
            UMWorkDispatch.sendEvent(context3, 4356, CoreProtocol.getInstance(context3), jSONObject);
        } catch (Throwable th2) {
            if (MLog.DEBUG) {
                MLog.e(" Excepthon  in  onProfileSignOff", th2);
            }
        }
    }

    public synchronized void k() {
        try {
            Context context = f104344a;
            if (context == null) {
                return;
            }
            if (!UMUtils.isMainProgress(context)) {
                MLog.e("unregisterSuperPropertyByCoreProtocol can not be called in child process");
                return;
            }
            if (this.f104363k != null) {
                SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(f104344a).edit();
                editorEdit.putString(f104345h, this.f104363k.toString());
                editorEdit.commit();
            } else {
                this.f104363k = new JSONObject();
            }
        } catch (Throwable unused) {
        }
    }

    public synchronized JSONObject l() {
        Context context = f104344a;
        if (context == null) {
            return null;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.e("getSuperPropertiesJSONObject can not be called in child process");
            return null;
        }
        if (this.f104363k == null) {
            this.f104363k = new JSONObject();
        }
        return this.f104363k;
    }

    public synchronized void m() {
        try {
            Context context = f104344a;
            if (context != null) {
                if (!UMUtils.isMainProgress(context)) {
                    MLog.e("clearSuperPropertiesByCoreProtocol can not be called in child process");
                } else {
                    SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(f104344a).edit();
                    editorEdit.remove(f104345h);
                    editorEdit.commit();
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.umeng.analytics.pro.n
    public void n() {
        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onIntoBackground triggered.");
        if (AnalyticsConfig.enable && FieldManager.b()) {
            if (!FieldManager.allow(com.umeng.commonsdk.utils.b.D)) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> 退出发送策略: 云控控制字关闭。功能不生效");
            } else {
                if (UMWorkDispatch.eventHasExist(8210)) {
                    return;
                }
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> 退出时发送策略 被触发！");
                Context context = f104344a;
                UMWorkDispatch.sendEvent(context, 8210, CoreProtocol.getInstance(context), null);
            }
        }
    }
}
