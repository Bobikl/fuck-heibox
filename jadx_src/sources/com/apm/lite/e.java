package com.apm.lite;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import com.apm.lite.runtime.ConfigManager;
import com.apm.lite.runtime.i;
import com.apm.lite.runtime.q;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f39899a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Application f39900b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f39901c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f39902d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static com.apm.lite.runtime.d f39903e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile ConcurrentHashMap<Integer, String> f39906h;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static volatile String f39911m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static ConfigManager f39904f = new ConfigManager();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static a f39905g = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static q f39907i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile String f39908j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Object f39909k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static volatile int f39910l = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f39912n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static boolean f39913o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static boolean f39914p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static boolean f39915q = true;

    public static com.apm.lite.runtime.d a() {
        if (f39903e == null) {
            f39903e = i.a(f39899a);
        }
        return f39903e;
    }

    public static String b(long j10, CrashType crashType, boolean z10, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j10);
        sb2.append(lg.a.f131412e);
        sb2.append(crashType.getName());
        sb2.append('_');
        sb2.append(l());
        sb2.append('_');
        sb2.append(z10 ? "oom_" : "normal_");
        sb2.append(p());
        sb2.append('_');
        sb2.append(z11 ? "ignore_" : "normal_");
        sb2.append(Long.toHexString(new Random().nextLong()));
        sb2.append("G");
        return sb2.toString();
    }

    public static void c(Application application, Context context) {
        if (f39900b == null) {
            f39901c = System.currentTimeMillis();
            f39899a = context;
            f39900b = application;
            f39908j = Long.toHexString(new Random().nextLong()) + "G";
        }
    }

    public static void d(com.apm.lite.runtime.d dVar) {
        f39903e = dVar;
    }

    public static void e(boolean z10) {
        f39913o = z10;
    }

    public static a f() {
        return f39905g;
    }

    public static void g(boolean z10) {
        f39914p = z10;
    }

    public static q h() {
        if (f39907i == null) {
            synchronized (e.class) {
                f39907i = new q(f39899a);
            }
        }
        return f39907i;
    }

    public static void i(boolean z10) {
        f39915q = z10;
    }

    public static boolean j() {
        return o().isDebugMode() && t().contains("local_test");
    }

    public static String k() {
        return l() + '_' + Long.toHexString(new Random().nextLong()) + "G";
    }

    public static String l() {
        if (f39908j == null) {
            synchronized (f39909k) {
                if (f39908j == null) {
                    f39908j = Long.toHexString(new Random().nextLong()) + "U";
                }
            }
        }
        return f39908j;
    }

    public static Context m() {
        return f39899a;
    }

    public static Application n() {
        return f39900b;
    }

    public static ConfigManager o() {
        return f39904f;
    }

    public static long p() {
        return f39901c;
    }

    public static String q() {
        return "default";
    }

    public static int r() {
        return f39912n;
    }

    public static boolean s() {
        return f39902d;
    }

    public static String t() {
        Object obj = a().b().get("channel");
        return obj == null ? "unknown" : String.valueOf(obj);
    }

    public static ConcurrentHashMap<Integer, String> u() {
        return f39906h;
    }

    public static int v() {
        return f39910l;
    }

    public static String w() {
        return f39911m;
    }

    public static boolean x() {
        return f39914p;
    }

    public static boolean y() {
        return f39915q;
    }

    public static boolean z() {
        return f39913o;
    }
}
