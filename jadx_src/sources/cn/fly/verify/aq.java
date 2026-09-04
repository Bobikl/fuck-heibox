package cn.fly.verify;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class aq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static gl f35763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static gl f35764b;

    static {
        try {
            gl glVar = new gl(ax.g());
            f35763a = glVar;
            glVar.a("FlyVerify_SPDB_V2", 1);
        } catch (Throwable unused) {
        }
    }

    public static String a() {
        return f35763a.a("udd");
    }

    public static void a(int i10) {
        f35763a.a("logSwitch", Integer.valueOf(i10));
    }

    public static void a(long j10) {
        f35763a.a("key_config_expire_time", Long.valueOf(j10));
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            f35763a.k("udd");
        } else {
            f35763a.a("udd", str);
        }
    }

    public static void a(ArrayList<String> arrayList) {
        if (arrayList == null) {
            f35763a.k("key_noup");
        } else {
            f35763a.a("key_noup", (Object) arrayList);
        }
    }

    public static void a(HashMap map) {
        if (map == null) {
            f35763a.k("key_config");
        } else {
            f35763a.a("key_config", (Object) map);
        }
    }

    public static void a(boolean z10) {
        f35763a.a("unknown_try", Boolean.valueOf(z10));
    }

    public static HashMap b() {
        Object objI = f35763a.i("key_config");
        if (objI != null) {
            return (HashMap) objI;
        }
        return null;
    }

    public static void b(int i10) {
        f35763a.a("key_oppo_net", Integer.valueOf(i10));
    }

    public static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            u().k("cache_log");
        } else {
            u().a("cache_log", str);
        }
    }

    public static void b(boolean z10) {
        f35763a.a("key_use_wo", Boolean.valueOf(z10));
    }

    public static void c(int i10) {
        f35763a.a("key_cache_type", Integer.valueOf(i10));
    }

    public static void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f35763a.a("key_dnc", str);
    }

    public static void c(boolean z10) {
        f35763a.a("key_auto_pre", Boolean.valueOf(z10));
    }

    public static boolean c() {
        return f35763a.a("unknown_try", false);
    }

    public static int d() {
        return f35763a.b("logSwitch", 1);
    }

    public static void d(int i10) {
        f35763a.a("auto_refresh", Integer.valueOf(i10));
    }

    public static void d(String str) {
        f35763a.a("factoryBlst", str);
    }

    public static String e() {
        String strA = u().a("cache_log");
        return TextUtils.isEmpty(strA) ? "" : strA;
    }

    public static void e(int i10) {
        f35763a.a("cmSwitchData", Integer.valueOf(i10));
    }

    public static void f(int i10) {
        f35763a.a("cuSwitchData", Integer.valueOf(i10));
    }

    public static boolean f() {
        try {
            File file = new File(ax.g().getFilesDir() + "/Pers/FlyVerify_LOG" + lg.a.f131412e + 1);
            if (!file.exists() || file.length() <= 209715200) {
                return false;
            }
            return file.delete();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String g() {
        String strA = f35763a.a("key_dnc");
        return TextUtils.isEmpty(strA) ? "" : strA;
    }

    public static void g(int i10) {
        f35763a.a("subIdEnable", Integer.valueOf(i10));
    }

    public static long h() {
        return f35763a.a("key_config_expire_time", 0L);
    }

    public static void h(int i10) {
        f35763a.a("subIdsEnable", Integer.valueOf(i10));
    }

    public static void i(int i10) {
        f35763a.a("slotsEnable", Integer.valueOf(i10));
    }

    public static boolean i() {
        return f35763a.a("key_preverify_success", false);
    }

    public static void j(int i10) {
        f35763a.a("operatorCode", Integer.valueOf(i10));
    }

    public static boolean j() {
        return f35763a.c("key_use_wo");
    }

    public static int k() {
        return f35763a.g("key_cache_type");
    }

    public static void k(int i10) {
        f35763a.a("switchTimeout", Integer.valueOf(i10));
    }

    public static int l() {
        return f35763a.b("auto_refresh", 1);
    }

    public static void l(int i10) {
        f35763a.a("ignoreSwitchError", Integer.valueOf(i10));
    }

    public static int m() {
        return f35763a.b("cmSwitchData", 1);
    }

    public static int n() {
        return f35763a.b("cuSwitchData", 1);
    }

    public static int o() {
        return f35763a.b("subIdEnable", 1);
    }

    public static int p() {
        return f35763a.b("subIdsEnable", 1);
    }

    public static int q() {
        return f35763a.b("slotsEnable", 1);
    }

    public static String r() {
        return f35763a.b("factoryBlst", (String) null);
    }

    public static int s() {
        return f35763a.b("operatorCode", 0);
    }

    public static int t() {
        return f35763a.b("ignoreSwitchError", 1);
    }

    private static gl u() {
        if (f35764b == null) {
            gl glVar = new gl(ax.g());
            f35764b = glVar;
            glVar.a("FlyVerify_LOG", 1);
        }
        return f35764b;
    }
}
