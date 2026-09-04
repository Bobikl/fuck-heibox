package com.efs.sdk.launch;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.efs.sdk.base.Constants;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.integrationtesting.IntegrationTestingUtil;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
import com.umeng.umcrash.UMCrash;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f42625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f42626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f42627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f42628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f42629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f42630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f42631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f42632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static long f42633i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static long f42634j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f42635k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static List<EfsJSONLog> f42636l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static Map<String, Long[]> f42637m = new HashMap();

    public static void a(Activity activity, String str, boolean z10) {
        long jCurrentTimeMillis;
        Context applicationContext;
        String name;
        int i10;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long jCurrentTimeMillis2;
        if (TextUtils.equals(str, LaunchManager.PAGE_ON_CREATE)) {
            if (z10) {
                if (LaunchManager.isDebug) {
                    Log.i("LaunchTrace", "onCreate");
                }
                f42628d = System.currentTimeMillis();
                return;
            }
            return;
        }
        if (TextUtils.equals(str, LaunchManager.PAGE_ON_RE_START)) {
            if (z10 && f42635k == 0) {
                if (LaunchManager.isDebug) {
                    Log.i("LaunchTrace", "onRestart");
                }
                f42629e = System.currentTimeMillis();
                f42631g = true;
                return;
            }
            return;
        }
        if (TextUtils.equals(str, LaunchManager.PAGE_ON_START)) {
            if (z10) {
                if (LaunchManager.isDebug) {
                    Log.i("LaunchTrace", "onStart");
                }
                f42635k++;
                f42632h = true;
                return;
            }
            return;
        }
        if (!TextUtils.equals(str, LaunchManager.PAGE_ON_RESUME)) {
            if (TextUtils.equals(str, LaunchManager.PAGE_ON_STOP) && z10) {
                if (LaunchManager.isDebug) {
                    Log.i("LaunchTrace", "onStop");
                }
                f42635k--;
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        if (LaunchManager.isDebug) {
            Log.i("LaunchTrace", "onResume");
        }
        if (f42630f) {
            f42630f = false;
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            long j18 = jCurrentTimeMillis3 - f42627c;
            if (LaunchManager.isDebug) {
                Log.i("LaunchTrace", "loadTime is ".concat(String.valueOf(j18)));
            }
            long j19 = jCurrentTimeMillis3 - f42625a;
            if (LaunchManager.isDebug) {
                Log.i("LaunchTrace", "======>>>>>> coldTime is ".concat(String.valueOf(j19)));
            }
            int i11 = !c.d(activity.getApplicationContext()) ? 1 : 0;
            if (LaunchManager.isDebug) {
                Log.i("LaunchTrace", "type is ".concat(String.valueOf(i11)));
            }
            a(activity.getApplicationContext(), i11, activity.getClass().getName(), j19, f42625a, f42626b, f42633i, f42627c, f42634j, jCurrentTimeMillis3, j18, 0L, 0L, f42637m);
        } else if (f42635k == 1) {
            if (f42631g) {
                f42631g = false;
                jCurrentTimeMillis2 = System.currentTimeMillis() - f42629e;
                if (LaunchManager.isDebug) {
                    Log.i("LaunchTrace", "======>>>>>> hotTime is ".concat(String.valueOf(jCurrentTimeMillis2)));
                }
                applicationContext = activity.getApplicationContext();
                name = activity.getClass().getName();
                i10 = 2;
                j10 = 0;
                j11 = 0;
                j12 = 0;
                j13 = 0;
                j14 = 0;
                j15 = 0;
                j16 = 0;
                j17 = 0;
                jCurrentTimeMillis = 0;
            } else if (f42632h) {
                jCurrentTimeMillis = System.currentTimeMillis() - f42628d;
                if (LaunchManager.isDebug) {
                    Log.i("LaunchTrace", "======>>>>>> warmTime is ".concat(String.valueOf(jCurrentTimeMillis)));
                }
                applicationContext = activity.getApplicationContext();
                name = activity.getClass().getName();
                i10 = 3;
                j10 = 0;
                j11 = 0;
                j12 = 0;
                j13 = 0;
                j14 = 0;
                j15 = 0;
                j16 = 0;
                j17 = 0;
                jCurrentTimeMillis2 = 0;
            }
            a(applicationContext, i10, name, j10, j11, j12, j13, j14, j15, j16, j17, jCurrentTimeMillis2, jCurrentTimeMillis, f42637m);
        }
        f42632h = false;
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0365  */
    /* JADX WARN: Code duplicated, block: B:177:? A[RETURN, SYNTHETIC] */
    private static void a(Context context, int i10, String str, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, Map<String, Long[]> map) {
        int i11;
        List<EfsJSONLog> list;
        StringBuilder sb2;
        String strGenerateString;
        Object objValueOf;
        if (!LaunchManager.isInit()) {
            if (i10 == 0) {
                if (LaunchManager.isDebug) {
                    Log.i("LaunchTrace", "no init, local cache cold launch, type is 0 !");
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("w_type", i10);
                    jSONObject.put("w_url", str);
                    jSONObject.put("l_version", "0.0.6.umeng");
                    jSONObject.put("wl_avgv", j10);
                    jSONObject.put("wd_init", j11);
                    jSONObject.put("wd_inittm", j12);
                    jSONObject.put("wl_init", j13);
                    jSONObject.put("wd_build", j12);
                    jSONObject.put("wd_buildtm", j14);
                    jSONObject.put("wl_build", j15);
                    jSONObject.put("wd_page", j14);
                    jSONObject.put("wd_pagetm", j16);
                    jSONObject.put("wl_page", j17);
                    if (map != null && !map.isEmpty()) {
                        JSONObject jSONObject2 = new JSONObject();
                        for (Map.Entry<String, Long[]> entry : map.entrySet()) {
                            String key = entry.getKey();
                            Long[] value = entry.getValue();
                            if (key != null && value != null) {
                                JSONArray jSONArray = new JSONArray();
                                jSONArray.put(value[0]);
                                jSONArray.put(value[1]);
                                jSONObject2.put(key, jSONArray);
                            }
                        }
                        jSONObject.put("userExtra", jSONObject2);
                    }
                    c.a(context, jSONObject.toString());
                    if (LaunchManager.isDebug) {
                        Log.i("LaunchTrace", "no init, cache first launch, content is " + jSONObject.toString());
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    return;
                }
            }
            if (LaunchManager.isDebug) {
                Log.i("LaunchTrace", "no init, cache launch, type is ".concat(String.valueOf(i10)));
            }
            EfsJSONLog efsJSONLog = new EfsJSONLog(Constants.LOG_TYPE_STARTPERF);
            efsJSONLog.put("w_type", Integer.valueOf(i10));
            efsJSONLog.put("w_url", str);
            efsJSONLog.put("l_version", "0.0.6.umeng");
            if (i10 == 1) {
                efsJSONLog.put("wl_avgv", Long.valueOf(j10));
                efsJSONLog.put("wd_init", Long.valueOf(j11));
                efsJSONLog.put("wd_inittm", Long.valueOf(j12));
                efsJSONLog.put("wl_init", Long.valueOf(j13));
                efsJSONLog.put("wd_build", Long.valueOf(j12));
                efsJSONLog.put("wd_buildtm", Long.valueOf(j14));
                efsJSONLog.put("wl_build", Long.valueOf(j15));
                efsJSONLog.put("wd_page", Long.valueOf(j14));
                efsJSONLog.put("wd_pagetm", Long.valueOf(j16));
                efsJSONLog.put("wl_page", Long.valueOf(j17));
                if (map != null && !map.isEmpty()) {
                    JSONObject jSONObject3 = new JSONObject();
                    for (Map.Entry<String, Long[]> entry2 : map.entrySet()) {
                        String key2 = entry2.getKey();
                        Long[] value2 = entry2.getValue();
                        if (key2 != null && value2 != null) {
                            try {
                                JSONArray jSONArray2 = new JSONArray();
                                try {
                                    jSONArray2.put(value2[0]);
                                    jSONArray2.put(value2[1]);
                                    jSONObject3.put(key2, jSONArray2);
                                } catch (Throwable unused) {
                                }
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                    efsJSONLog.put("userExtra", jSONObject3);
                }
            } else {
                if (i10 == 2) {
                    efsJSONLog.put("wl_avgv", Long.valueOf(j18));
                } else {
                    i11 = 3;
                    if (i10 == 3) {
                        efsJSONLog.put("wl_avgv", Long.valueOf(j19));
                    }
                }
                list = f42636l;
                if (list != null || list.size() >= i11) {
                    if (LaunchManager.isDebug) {
                        Log.i("LaunchTrace", "cache launch size over!");
                        return;
                    }
                    return;
                } else {
                    f42636l.add(efsJSONLog);
                    if (!LaunchManager.isDebug) {
                        return;
                    }
                    sb2 = new StringBuilder("cache launch report --->>> ");
                    strGenerateString = efsJSONLog.generateString();
                }
            }
            i11 = 3;
            list = f42636l;
            if (list != null) {
            }
            if (LaunchManager.isDebug) {
                Log.i("LaunchTrace", "cache launch size over!");
                return;
            }
            return;
        }
        LaunchConfigManager launchConfigManager = LaunchManager.getLaunchConfigManager();
        if ((launchConfigManager == null || !launchConfigManager.enableTracer()) && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
            if (LaunchManager.isDebug) {
                Log.i("LaunchTrace", "launch --->>> config no init or enable is false");
                return;
            }
            return;
        }
        EfsJSONLog efsJSONLog2 = new EfsJSONLog(Constants.LOG_TYPE_STARTPERF);
        efsJSONLog2.put("w_type", Integer.valueOf(i10));
        efsJSONLog2.put("w_url", str);
        efsJSONLog2.put("l_version", "0.0.6.umeng");
        if (i10 == 0 || i10 == 1) {
            efsJSONLog2.put("wl_avgv", Long.valueOf(j10));
            efsJSONLog2.put("wd_init", Long.valueOf(j11));
            efsJSONLog2.put("wd_inittm", Long.valueOf(j12));
            efsJSONLog2.put("wl_init", Long.valueOf(j13));
            efsJSONLog2.put("wd_build", Long.valueOf(j12));
            efsJSONLog2.put("wd_buildtm", Long.valueOf(j14));
            efsJSONLog2.put("wl_build", Long.valueOf(j15));
            efsJSONLog2.put("wd_page", Long.valueOf(j14));
            efsJSONLog2.put("wd_pagetm", Long.valueOf(j16));
            efsJSONLog2.put("wl_page", Long.valueOf(j17));
            if (map != null && !map.isEmpty()) {
                JSONObject jSONObject4 = new JSONObject();
                for (Map.Entry<String, Long[]> entry3 : map.entrySet()) {
                    String key3 = entry3.getKey();
                    Long[] value3 = entry3.getValue();
                    if (key3 != null && value3 != null) {
                        JSONArray jSONArray3 = new JSONArray();
                        jSONArray3.put(value3[0]);
                        jSONArray3.put(value3[1]);
                        jSONObject4.put(key3, jSONArray3);
                    }
                }
                efsJSONLog2.put("userExtra", jSONObject4);
            }
        } else {
            if (i10 == 2) {
                objValueOf = Long.valueOf(j18);
            } else if (i10 == 3) {
                objValueOf = Long.valueOf(j19);
            }
            efsJSONLog2.put("wl_avgv", objValueOf);
        }
        String strA = c.a(context);
        if (LaunchManager.isDebug) {
            Log.i("LaunchTrace", "umid is ".concat(String.valueOf(strA)));
        }
        if (strA != null && !TextUtils.isEmpty(strA)) {
            if (LaunchManager.isDebug) {
                Log.i("LaunchTrace", "send current launch report --->>> " + efsJSONLog2.generateString());
            }
            EfsReporter reporter = LaunchManager.getReporter();
            if (reporter != null) {
                reporter.send(efsJSONLog2);
                return;
            }
            return;
        }
        List<EfsJSONLog> list2 = f42636l;
        if (list2 == null || list2.size() >= 3) {
            if (LaunchManager.isDebug) {
                Log.i("LaunchTrace", "cache launch size over!");
                return;
            }
            return;
        } else {
            f42636l.add(efsJSONLog2);
            if (!LaunchManager.isDebug) {
                return;
            }
            sb2 = new StringBuilder("cache launch report --->>> ");
            strGenerateString = efsJSONLog2.generateString();
        }
        sb2.append(strGenerateString);
        Log.i("LaunchTrace", sb2.toString());
    }

    public static void a(Context context, String str) {
        if (LaunchManager.isDebug) {
            Log.i("LaunchTrace", "begin sendLaunchCache");
        }
        if (str == null || TextUtils.isEmpty(str)) {
            str = c.a(context);
        }
        if (str == null || TextUtils.isEmpty(str)) {
            return;
        }
        HashMap map = new HashMap(1);
        map.put(UMCrash.KEY_HEADER_UMID, str);
        if (LaunchManager.getReporter() != null) {
            LaunchManager.getReporter().addPublicParams(map);
        }
        String strB = c.b(context);
        if (strB != null && !TextUtils.isEmpty(strB)) {
            try {
                JSONObject jSONObject = new JSONObject(strB);
                jSONObject.put(UMCrash.KEY_HEADER_UMID, str);
                if (a(jSONObject)) {
                    c.c(context);
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        List<EfsJSONLog> list = f42636l;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (EfsJSONLog efsJSONLog : f42636l) {
            if (efsJSONLog != null) {
                if (LaunchManager.isDebug) {
                    Log.i("LaunchTrace", "send cache launch report --->>> " + efsJSONLog.generateString());
                }
                EfsReporter reporter = LaunchManager.getReporter();
                if (reporter != null) {
                    reporter.send(efsJSONLog);
                }
            }
        }
        f42636l.clear();
        f42636l = null;
    }

    public static void a(String str, long j10) {
        Map<String, Long[]> map = f42637m;
        if (map == null || map.containsKey(str) || f42637m.size() >= 10) {
            if (LaunchManager.isDebug) {
                Log.e("LaunchTrace", "--->>> method name already exists or over quantity !");
            }
        } else {
            Long[] lArr = new Long[2];
            lArr[0] = Long.valueOf(j10);
            f42637m.put(str, lArr);
        }
    }

    public static void a(String str, boolean z10) {
        if (TextUtils.equals(str, LaunchManager.APP_CONSTRUCT)) {
            return;
        }
        if (!TextUtils.equals(str, LaunchManager.APP_ATTACH_BASE_CONTEXT)) {
            if (!TextUtils.equals(str, LaunchManager.APP_ON_CREATE) || z10) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            f42627c = jCurrentTimeMillis;
            f42634j = jCurrentTimeMillis - f42626b;
            if (LaunchManager.isDebug) {
                Log.i("LaunchTrace", "buildTime is " + f42634j);
                return;
            }
            return;
        }
        if (z10) {
            f42625a = System.currentTimeMillis();
            f42630f = true;
            return;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        f42626b = jCurrentTimeMillis2;
        f42633i = jCurrentTimeMillis2 - f42625a;
        if (LaunchManager.isDebug) {
            Log.i("LaunchTrace", "initTime is " + f42633i);
        }
    }

    private static boolean a(JSONObject jSONObject) {
        try {
            EfsJSONLog efsJSONLog = new EfsJSONLog(Constants.LOG_TYPE_STARTPERF);
            efsJSONLog.put("w_type", jSONObject.opt("w_type"));
            efsJSONLog.put("w_url", jSONObject.opt("w_url"));
            efsJSONLog.put("l_version", jSONObject.opt("l_version"));
            efsJSONLog.put("wl_avgv", jSONObject.opt("wl_avgv"));
            efsJSONLog.put("wd_init", jSONObject.opt("wd_init"));
            efsJSONLog.put("wd_inittm", jSONObject.opt("wd_inittm"));
            efsJSONLog.put("wl_init", jSONObject.opt("wl_init"));
            efsJSONLog.put("wd_build", jSONObject.opt("wd_build"));
            efsJSONLog.put("wd_buildtm", jSONObject.opt("wd_buildtm"));
            efsJSONLog.put("wl_build", jSONObject.opt("wl_build"));
            efsJSONLog.put("wd_page", jSONObject.opt("wd_page"));
            efsJSONLog.put("wd_pagetm", jSONObject.opt("wd_pagetm"));
            efsJSONLog.put("wl_page", jSONObject.opt("wl_page"));
            efsJSONLog.put("userExtra", jSONObject.opt("userExtra"));
            if (LaunchManager.isDebug) {
                Log.i("LaunchTrace", "send cache cold launch report --->>> " + efsJSONLog.generateString());
            }
            EfsReporter reporter = LaunchManager.getReporter();
            if (reporter == null) {
                return false;
            }
            reporter.send(efsJSONLog);
            return true;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }

    public static void b(String str, long j10) {
        Map<String, Long[]> map = f42637m;
        if (map == null || !map.containsKey(str)) {
            if (LaunchManager.isDebug) {
                Log.e("LaunchTrace", "--->>> method name non-existent or over quantity !");
            }
        } else {
            Long[] lArr = f42637m.get(str);
            lArr[1] = Long.valueOf(j10);
            f42637m.put(str, lArr);
        }
    }
}
