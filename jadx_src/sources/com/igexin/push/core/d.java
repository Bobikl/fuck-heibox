package com.igexin.push.core;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import com.igexin.assist.sdk.AssistPushConsts;
import com.igexin.push.config.SDKUrlConfig;
import com.igexin.push.core.bean.PushTaskBean;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static String A = null;
    public static String B = null;
    public static String C = null;
    public static long E = 0;
    public static String L = null;
    public static String P = null;
    public static String S = null;
    public static String T = null;
    public static String U = null;
    public static String V = null;
    public static long W = 0;
    public static String X = null;
    public static byte[] Y = null;
    public static boolean Z = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f63655a = "";
    private static Map<String, Integer> aA = null;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    public static boolean f63656aa = false;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    public static boolean f63657ab = false;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    public static Map<String, PushTaskBean> f63658ac = null;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    public static Map<String, Integer> f63659ad = null;

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    public static HashMap<String, Long> f63660ae = null;

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    public static String f63664ai = null;

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    public static long f63665aj = 0;

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    public static String f63666ak = null;

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    public static String f63667al = null;
    public static String am = null;
    public static String an = null;
    public static String ao = null;
    public static String ap = null;
    public static long aq = 0;
    public static boolean ar = false;
    public static int as = 0;
    public static int at = 0;
    public static byte[] au = null;
    public static String av = null;
    public static String az = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f63668b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f63669c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f63670d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Context f63671e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile boolean f63675i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static volatile boolean f63678l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile boolean f63679m;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static String f63685s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static String f63686t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static String f63687u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static String f63688v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static String f63690x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static String f63691y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static String f63692z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static AtomicBoolean f63672f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f63673g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile boolean f63674h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile boolean f63676j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static boolean f63677k = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f63680n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f63681o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f63682p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f63683q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static long f63684r = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static String f63689w = Build.MODEL;
    public static long D = -1;
    public static long F = -1;
    public static long G = 0;
    public static long H = 0;
    public static long I = 0;
    public static long J = 0;
    public static long K = 0;
    public static boolean M = com.igexin.push.config.o.f63450a.equals("debug");
    public static long N = 0;
    public static long O = 0;
    public static long Q = 0;
    public static int R = 0;

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    public static int f63661af = 0;

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    public static int f63662ag = 0;

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    public static int f63663ah = 0;
    public static String aw = "";
    public static String ax = "";
    public static String ay = "";
    private static String aB = "";

    public static int a(String str, boolean z10) {
        int iIntValue;
        synchronized (d.class) {
            if (aA.get(str) == null) {
                aA.put(str, 0);
            }
            iIntValue = aA.get(str).intValue();
            if (z10) {
                iIntValue--;
                aA.put(str, Integer.valueOf(iIntValue));
                if (iIntValue == 0) {
                    aA.remove(str);
                }
            }
        }
        return iIntValue;
    }

    public static String a() {
        return SDKUrlConfig.getConfigServiceUrl();
    }

    public static void a(long j10) {
        f63684r = j10;
        f63685s = com.igexin.a.b.a.a(String.valueOf(j10));
    }

    public static boolean a(Context context) {
        f63671e = context;
        f63669c = context.getPackageName();
        f63670d = com.igexin.push.util.d.c(context);
        az = "getui.permission.GetuiService." + f63669c;
        if (!d()) {
            com.igexin.a.a.c.b.a("CoreRuntimeInfo|parseManifests failed", new Object[0]);
            return false;
        }
        Y = com.igexin.a.b.a.a(f63655a + context.getPackageName()).getBytes();
        c();
        f63673g = com.igexin.push.util.a.h();
        f63658ac = new ConcurrentHashMap();
        f63659ad = new ConcurrentHashMap();
        f63660ae = new HashMap<>();
        f63675i = new com.igexin.sdk.a.d(context).c();
        aA = new HashMap();
        e();
        ar = true;
        com.igexin.a.a.c.b.a("CoreRuntimeInfo|getui sdk init success, isPushOn = " + f63675i, new Object[0]);
        return true;
    }

    public static boolean a(String str, Integer num, boolean z10) {
        synchronized (d.class) {
            int iIntValue = num.intValue();
            if (z10 && aA.get(str) != null && (iIntValue = aA.get(str).intValue() + num.intValue()) == 0) {
                aA.remove(str);
                return false;
            }
            aA.put(str, Integer.valueOf(iIntValue));
            return true;
        }
    }

    public static Boolean b() {
        return Boolean.valueOf(aB.equals(androidx.webkit.b.f28327e));
    }

    private static void c() {
        File[] fileArrListFiles;
        try {
            File file = new File("/sdcard/libs/");
            if (file.exists() && file.isFile()) {
                com.igexin.a.a.c.b.a("CoreRuntimeInfo|libs is file not directory, delete libs file ++++", new Object[0]);
                file.delete();
            }
            if (!file.exists() && !file.mkdir()) {
                com.igexin.a.a.c.b.a("CoreRuntimeInfo|create libs directory failed ++++++", new Object[0]);
            }
            f63671e.getFilesDir();
            try {
                File file2 = new File(CoreConsts.f63453c + "/system/tmp/local");
                if (file2.exists() && (fileArrListFiles = file2.listFiles(new e())) != null && fileArrListFiles.length > 0) {
                    for (File file3 : fileArrListFiles) {
                        file3.delete();
                    }
                }
            } catch (Throwable th2) {
                com.igexin.a.a.c.b.a("CoreRuntimeInfo|" + th2.toString(), new Object[0]);
            }
            V = f63671e.getFilesDir().getPath();
            T = "/sdcard/libs//" + f63669c + com.umeng.analytics.process.a.f105009d;
            U = "/sdcard/libs//com.igexin.sdk.deviceId.db";
            S = "/sdcard/libs//" + f63669c + ".properties";
            X = "/sdcard/libs//" + f63669c + ".bin";
        } catch (Throwable th3) {
            com.igexin.a.a.c.b.a("CoreRuntimeInfo|initFile exception = " + th3.toString(), new Object[0]);
        }
    }

    private static boolean d() {
        String strA = com.igexin.push.core.b.a.a(f63671e);
        if (TextUtils.isEmpty(strA)) {
            try {
                ApplicationInfo applicationInfo = f63671e.getPackageManager().getApplicationInfo(f63669c, 128);
                String strA2 = com.igexin.push.util.b.a(applicationInfo);
                if (applicationInfo != null && applicationInfo.metaData != null) {
                    if (TextUtils.isEmpty(strA2)) {
                        strA2 = applicationInfo.metaData.getString(AssistPushConsts.GETUI_APPID);
                    }
                    if (strA2 != null) {
                        strA2 = strA2.trim();
                    }
                    String string = applicationInfo.metaData.getString("GETUI_CUSTOM_TOKEN");
                    if (string != null) {
                        aB = string;
                    }
                }
                strA = strA2;
            } catch (Throwable th2) {
                com.igexin.a.a.c.b.a("CoreRuntimeInfo|get ApplicationInfo meta data exception :" + th2.toString(), new Object[0]);
                return false;
            }
        }
        if (TextUtils.isEmpty(strA)) {
            com.igexin.a.a.c.b.a("CoreRuntimeInfo|getui sdk init error, missing parm #####", new Object[0]);
            return false;
        }
        f63655a = strA;
        f63668b = SDKUrlConfig.getLocation();
        return true;
    }

    private static void e() {
        Cursor cursorA = null;
        try {
            cursorA = c.a().k().a("message", null, null, null, null);
            if (cursorA != null) {
                at = cursorA.getCount();
            }
            if (cursorA == null) {
                return;
            }
        } catch (Throwable unused) {
            if (cursorA == null) {
                return;
            }
        }
        cursorA.close();
    }
}
