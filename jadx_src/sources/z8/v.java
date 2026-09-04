package z8;

import android.os.Build;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
@d0
public final class v {
    private v() {
    }

    @v8.a
    @androidx.annotation.k(api = 11)
    public static boolean a() {
        return true;
    }

    @v8.a
    @androidx.annotation.k(api = 12)
    public static boolean b() {
        return true;
    }

    @v8.a
    @androidx.annotation.k(api = 14)
    public static boolean c() {
        return true;
    }

    @v8.a
    @androidx.annotation.k(api = 15)
    public static boolean d() {
        return true;
    }

    @v8.a
    @androidx.annotation.k(api = 16)
    public static boolean e() {
        return true;
    }

    @v8.a
    @androidx.annotation.k(api = 17)
    public static boolean f() {
        return true;
    }

    @v8.a
    @androidx.annotation.k(api = 18)
    public static boolean g() {
        return true;
    }

    @v8.a
    @androidx.annotation.k(api = 19)
    public static boolean h() {
        return true;
    }

    @v8.a
    @androidx.annotation.k(api = 20)
    public static boolean i() {
        return true;
    }

    @v8.a
    @androidx.annotation.k(api = 21)
    public static boolean j() {
        return true;
    }

    @v8.a
    @androidx.annotation.k(api = 22)
    public static boolean k() {
        return true;
    }

    @v8.a
    @androidx.annotation.k(api = 23)
    public static boolean l() {
        return true;
    }

    @v8.a
    @androidx.annotation.k(api = 24)
    public static boolean m() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @v8.a
    @androidx.annotation.k(api = 26)
    public static boolean n() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @v8.a
    @androidx.annotation.k(api = 28)
    public static boolean o() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @v8.a
    @androidx.annotation.k(api = 29)
    public static boolean p() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @v8.a
    @androidx.annotation.k(api = 30)
    public static boolean q() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @v8.a
    @androidx.annotation.k(api = 31)
    public static boolean r() {
        return Build.VERSION.SDK_INT >= 31;
    }

    @v8.a
    @androidx.annotation.k(api = 32)
    public static boolean s() {
        return Build.VERSION.SDK_INT >= 32;
    }

    @v8.a
    @androidx.annotation.k(api = 33)
    public static boolean t() {
        return Build.VERSION.SDK_INT >= 33 || Build.VERSION.CODENAME.charAt(0) == 'T';
    }

    @v8.a
    @androidx.annotation.k(api = 33, codename = "UpsideDownCake")
    public static boolean u() {
        if (t()) {
            return androidx.core.os.a.l();
        }
        return false;
    }
}
