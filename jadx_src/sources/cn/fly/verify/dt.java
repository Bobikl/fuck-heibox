package cn.fly.verify;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class dt {
    public static boolean a() {
        List list = (List) by.b(ec.a("003JdgbiUa"), (Object) null);
        if (list != null) {
            list.contains(ec.a("003<bibg9b"));
        }
        return az.a().d();
    }

    private static boolean a(String str) {
        List list = (List) by.a(ec.a("003Cdgbi?a"), (Object) null);
        return list == null || list.contains(str);
    }

    public static boolean b() {
        return a(ec.a("003beb"));
    }

    public static boolean c() {
        return a(ec.a("003.debg[b"));
    }

    public static boolean d() {
        return a(ec.a("003^deOeb"));
    }

    public static boolean e() {
        return a(ec.a("002eb")) && az.a().c();
    }

    public static boolean f() {
        return a(ec.a("003Ybi)eb")) && az.a().c();
    }

    public static boolean g() {
        return a(ec.a("003FcdbiFb")) && az.a().c();
    }

    public static boolean h() {
        return a(ec.a("0037dddgPb"));
    }

    public static boolean i() {
        return a("na");
    }

    public static boolean j() {
        return SystemClock.elapsedRealtime() - ba.a().c() <= ((long) ((Integer) by.a(ec.a("003.dgbg)g"), 600)).intValue()) * 1000;
    }
}
