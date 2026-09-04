package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.process.UMProcessDBDatasSender;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.lang.reflect.Method;
import org.json.JSONObject;

/* JADX INFO: compiled from: SessionTracker.java */
/* JADX INFO: loaded from: classes4.dex */
public class u implements y.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f104960a = "session_start_time";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f104961b = "session_end_time";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f104962c = "session_id";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f104963d = "pre_session_id";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f104964e = "a_start_time";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f104965f = "a_end_time";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f104966g = "fg_count";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f104967h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static Context f104968i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f104969j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static long f104970k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static boolean f104971l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static long f104972m;

    /* JADX INFO: compiled from: SessionTracker.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final u f104973a = new u();

        private a() {
        }
    }

    private u() {
        y.a().a(this);
    }

    public static long a(Context context) {
        try {
            return PreferenceWrapper.getDefault(context).getLong(f104966g, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static u a() {
        return a.f104973a;
    }

    private void a(Context context, String str, long j10, long j11, long j12) {
        if (TextUtils.isEmpty(f104967h)) {
            f104967h = y.a().a(f104968i);
        }
        if (TextUtils.isEmpty(str) || str.equals(f104967h)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(e.d.a.f104769g, j11);
            jSONObject.put(e.d.a.f104770h, j12);
            JSONObject jSONObjectB = com.umeng.analytics.b.a().b();
            if (jSONObjectB != null && jSONObjectB.length() > 0) {
                jSONObject.put("__sp", jSONObjectB);
            }
            JSONObject jSONObjectC = com.umeng.analytics.b.a().c();
            if (jSONObjectC != null && jSONObjectC.length() > 0) {
                jSONObject.put("__pp", jSONObjectC);
            }
            i.a(context).a(f104967h, jSONObject, i.a.END);
        } catch (Exception unused) {
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__e", j10);
            i.a(context).a(str, jSONObject2, i.a.BEGIN);
            if (FieldManager.allow(com.umeng.commonsdk.utils.b.E)) {
                f104972m = j12;
                d(context);
                Context context2 = f104968i;
                UMWorkDispatch.sendEventEx(context2, 8213, CoreProtocol.getInstance(context2), null, 0L);
            }
        } catch (Exception unused2) {
        }
        f104967h = str;
    }

    private void a(String str, long j10) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f104968i);
        if (sharedPreferences == null) {
            return;
        }
        long j11 = sharedPreferences.getLong(f104961b, 0L);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__ii", str);
            jSONObject.put("__e", j10);
            jSONObject.put(e.d.a.f104769g, j11);
            double[] location = AnalyticsConfig.getLocation();
            if (location != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("lat", location[0]);
                jSONObject2.put("lng", location[1]);
                jSONObject2.put("ts", System.currentTimeMillis());
                jSONObject.put(e.d.a.f104767e, jSONObject2);
            }
            Class<?> cls = Class.forName("android.net.TrafficStats");
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("getUidRxBytes", cls2);
            Method method2 = cls.getMethod("getUidTxBytes", cls2);
            int i10 = f104968i.getApplicationInfo().uid;
            if (i10 == -1) {
                return;
            }
            long jLongValue = ((Long) method.invoke(null, Integer.valueOf(i10))).longValue();
            long jLongValue2 = ((Long) method2.invoke(null, Integer.valueOf(i10))).longValue();
            if (jLongValue > 0 && jLongValue2 > 0) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(d.H, jLongValue);
                jSONObject3.put(d.G, jLongValue2);
                jSONObject.put(e.d.a.f104766d, jSONObject3);
            }
            i.a(f104968i).a(str, jSONObject, i.a.NEWSESSION);
            v.a(f104968i);
            l.c(f104968i);
        } catch (Throwable unused) {
        }
    }

    public static void b(Context context) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f104968i);
        if (sharedPreferences != null) {
            long j10 = sharedPreferences.getLong(f104966g, 0L);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (editorEdit != null) {
                editorEdit.putLong(f104966g, j10 + 1);
                editorEdit.commit();
            }
        }
    }

    private void d(Context context) {
        try {
            SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(context).edit();
            editorEdit.putLong(f104966g, 0L);
            editorEdit.commit();
        } catch (Throwable unused) {
        }
    }

    private String e(Context context) {
        if (f104968i == null && context != null) {
            f104968i = context.getApplicationContext();
        }
        String strD = y.a().d(f104968i);
        try {
            f(context);
            o.a(f104968i).d((Object) null);
        } catch (Throwable unused) {
        }
        return strD;
    }

    private void f(Context context) {
        o.a(context).b(context);
        o.a(context).d();
    }

    public String a(Context context, long j10, boolean z10) {
        String strB = y.a().b(context);
        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onInstantSessionInternal: current session id = " + strB);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__e", j10);
            JSONObject jSONObjectB = com.umeng.analytics.b.a().b();
            if (jSONObjectB != null && jSONObjectB.length() > 0) {
                jSONObject.put("__sp", jSONObjectB);
            }
            JSONObject jSONObjectC = com.umeng.analytics.b.a().c();
            if (jSONObjectC != null && jSONObjectC.length() > 0) {
                jSONObject.put("__pp", jSONObjectC);
            }
            i.a(context).a(strB, jSONObject, i.a.INSTANTSESSIONBEGIN);
            o.a(context).a(jSONObject, z10);
        } catch (Throwable unused) {
        }
        return strB;
    }

    public void a(Context context, long j10) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f104968i);
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
            return;
        }
        editorEdit.putLong(f104960a, j10);
        editorEdit.commit();
    }

    public void a(Context context, Object obj) {
        SharedPreferences.Editor editorEdit;
        try {
            if (f104968i == null && context != null) {
                f104968i = context.getApplicationContext();
            }
            long jLongValue = ((Long) obj).longValue();
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f104968i);
            if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
                return;
            }
            String string = sharedPreferences.getString(d.az, "");
            String appVersionName = UMUtils.getAppVersionName(f104968i);
            if (TextUtils.isEmpty(string)) {
                editorEdit.putInt("versioncode", Integer.parseInt(UMUtils.getAppVersionCode(context)));
                editorEdit.putString(d.az, appVersionName);
                editorEdit.commit();
            } else if (!string.equals(appVersionName)) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onStartSessionInternal: upgrade version: " + string + "-> " + appVersionName);
                int i10 = sharedPreferences.getInt("versioncode", 0);
                String string2 = sharedPreferences.getString("pre_date", "");
                String string3 = sharedPreferences.getString("pre_version", "");
                String string4 = sharedPreferences.getString(d.az, "");
                editorEdit.putInt("versioncode", Integer.parseInt(UMUtils.getAppVersionCode(context)));
                editorEdit.putString(d.az, appVersionName);
                editorEdit.putString("vers_date", string2);
                editorEdit.putString("vers_pre_version", string3);
                editorEdit.putString("cur_version", string4);
                editorEdit.putInt("vers_code", i10);
                editorEdit.putString("vers_name", string);
                editorEdit.commit();
                if (f104971l) {
                    f104971l = false;
                }
                if (f104969j) {
                    f104969j = false;
                    b(f104968i, jLongValue, true);
                    b(f104968i, jLongValue);
                    return;
                }
                return;
            }
            if (f104969j) {
                f104969j = false;
                if (f104971l) {
                    f104971l = false;
                }
                f104967h = e(context);
                MLog.d("创建新会话: " + f104967h);
                UMRTLog.i(UMRTLog.RTLOG_TAG, "mSessionChanged flag has been set, Start new session: " + f104967h);
                return;
            }
            f104967h = sharedPreferences.getString("session_id", null);
            editorEdit.putLong(f104964e, jLongValue);
            editorEdit.putLong(f104965f, 0L);
            editorEdit.commit();
            MLog.d("延续上一个会话: " + f104967h);
            UMRTLog.i(UMRTLog.RTLOG_TAG, "Extend current session: " + f104967h);
            if (f104971l) {
                f104971l = false;
                if (FieldManager.allow(com.umeng.commonsdk.utils.b.E)) {
                    Context context2 = f104968i;
                    UMWorkDispatch.sendEventEx(context2, 8213, CoreProtocol.getInstance(context2), null, 0L);
                }
            }
            f(context);
            o.a(f104968i).a(false);
        } catch (Throwable unused) {
        }
    }

    @Override // com.umeng.analytics.pro.y.a
    public void a(String str, long j10, long j11, long j12) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(str, j10);
    }

    @Override // com.umeng.analytics.pro.y.a
    public void a(String str, String str2, long j10, long j11, long j12) {
        a(f104968i, str2, j10, j11, j12);
        UMRTLog.i(UMRTLog.RTLOG_TAG, "saveSessionToDB: complete");
        if (AnalyticsConstants.SUB_PROCESS_EVENT) {
            Context context = f104968i;
            UMWorkDispatch.sendEvent(context, UMProcessDBDatasSender.UM_PROCESS_EVENT_KEY, UMProcessDBDatasSender.getInstance(context), Long.valueOf(System.currentTimeMillis()));
        }
    }

    public String b() {
        return f104967h;
    }

    public void b(Context context, long j10) {
        if (PreferenceWrapper.getDefault(context) == null) {
            return;
        }
        try {
            o.a(f104968i).c((Object) null);
        } catch (Throwable unused) {
        }
    }

    public void b(Context context, Object obj) {
        try {
            if (f104968i == null) {
                f104968i = UMGlobalContext.getAppContext(context);
            }
            long jCurrentTimeMillis = obj == null ? System.currentTimeMillis() : ((Long) obj).longValue();
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f104968i);
            if (sharedPreferences == null) {
                return;
            }
            f104970k = sharedPreferences.getLong(f104965f, 0L);
            UMRTLog.i(UMRTLog.RTLOG_TAG, "------>>> lastActivityEndTime: " + f104970k);
            String string = sharedPreferences.getString(d.az, "");
            String appVersionName = UMUtils.getAppVersionName(f104968i);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (editorEdit == null) {
                return;
            }
            if (TextUtils.isEmpty(string) || string.equals(appVersionName)) {
                if (!y.a().e(f104968i)) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> less then 30 sec from last session, do nothing.");
                    f104969j = false;
                    return;
                }
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> More then 30 sec from last session.");
                f104969j = true;
                editorEdit.putLong(f104960a, jCurrentTimeMillis);
                editorEdit.commit();
                a(f104968i, jCurrentTimeMillis, false);
                return;
            }
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> requestNewInstantSessionIf: version upgrade");
            editorEdit.putLong(f104960a, jCurrentTimeMillis);
            editorEdit.commit();
            o.a(f104968i).a((Object) null, true);
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> force generate new session: session id = " + y.a().c(f104968i));
            f104969j = true;
            a(f104968i, jCurrentTimeMillis, true);
        } catch (Throwable unused) {
        }
    }

    public boolean b(Context context, long j10, boolean z10) {
        String strA;
        long j11;
        boolean z11 = false;
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (sharedPreferences == null || (strA = y.a().a(f104968i)) == null) {
                return false;
            }
            long j12 = sharedPreferences.getLong(f104964e, 0L);
            long j13 = sharedPreferences.getLong(f104965f, 0L);
            if (j12 > 0 && j13 == 0) {
                z11 = true;
                if (z10) {
                    j11 = f104970k;
                    if (j11 == 0) {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "------>>> lastActivityEndTime = 0, In-app upgrade, use currentTime: = " + j10);
                        j11 = j10;
                    } else {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "------>>> lastActivityEndTime != 0, app upgrade, use lastActivityEndTime: = " + f104970k);
                    }
                    c(f104968i, Long.valueOf(j11));
                } else {
                    c(f104968i, Long.valueOf(j10));
                    j11 = j10;
                }
                JSONObject jSONObject = new JSONObject();
                if (z10) {
                    jSONObject.put(e.d.a.f104769g, j11);
                } else {
                    jSONObject.put(e.d.a.f104769g, j10);
                }
                JSONObject jSONObjectB = com.umeng.analytics.b.a().b();
                if (jSONObjectB != null && jSONObjectB.length() > 0) {
                    jSONObject.put("__sp", jSONObjectB);
                }
                JSONObject jSONObjectC = com.umeng.analytics.b.a().c();
                if (jSONObjectC != null && jSONObjectC.length() > 0) {
                    jSONObject.put("__pp", jSONObjectC);
                }
                if (FieldManager.allow(com.umeng.commonsdk.utils.b.E)) {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>*** foregroundCount = " + f104972m);
                    jSONObject.put(e.d.a.f104770h, f104972m);
                    f104972m = 0L;
                } else {
                    jSONObject.put(e.d.a.f104770h, 0L);
                }
                i.a(context).a(strA, jSONObject, i.a.END);
                o.a(f104968i).e();
            }
        } catch (Throwable unused) {
        }
        return z11;
    }

    public String c() {
        return c(f104968i);
    }

    public String c(Context context) {
        try {
            if (f104967h == null) {
                return PreferenceWrapper.getDefault(context).getString("session_id", null);
            }
        } catch (Throwable unused) {
        }
        return f104967h;
    }

    public void c(Context context, Object obj) {
        try {
            if (f104968i == null && context != null) {
                f104968i = context.getApplicationContext();
            }
            long jLongValue = ((Long) obj).longValue();
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (sharedPreferences == null) {
                return;
            }
            if (sharedPreferences.getLong(f104964e, 0L) == 0) {
                MLog.e("onPause called before onResume");
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onEndSessionInternal: write activity end time = " + jLongValue);
            editorEdit.putLong(f104965f, jLongValue);
            editorEdit.putLong(f104961b, jLongValue);
            editorEdit.commit();
        } catch (Throwable unused) {
        }
    }
}
