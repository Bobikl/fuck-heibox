package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.annotation.RequiresOptIn;
import androidx.annotation.RestrictTo;
import androidx.annotation.w0;
import java.util.Locale;

/* JADX INFO: compiled from: BuildCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"CompileTimeConstant"})
    @androidx.annotation.k(extension = 30)
    public static final int f20947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"CompileTimeConstant"})
    @androidx.annotation.k(extension = 31)
    public static final int f20948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SuppressLint({"CompileTimeConstant"})
    @androidx.annotation.k(extension = 33)
    public static final int f20949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"CompileTimeConstant"})
    @androidx.annotation.k(extension = 1000000)
    public static final int f20950d;

    /* JADX INFO: renamed from: androidx.core.os.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BuildCompat.java */
    @w0(30)
    public static final class C0135a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f20951a = SdkExtensions.getExtensionVersion(30);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f20952b = SdkExtensions.getExtensionVersion(31);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f20953c = SdkExtensions.getExtensionVersion(33);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f20954d = SdkExtensions.getExtensionVersion(1000000);

        private C0135a() {
        }
    }

    /* JADX INFO: compiled from: BuildCompat.java */
    @RequiresOptIn
    public @interface b {
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f20947a = i10 >= 30 ? C0135a.f20951a : 0;
        f20948b = i10 >= 30 ? C0135a.f20952b : 0;
        f20949c = i10 >= 30 ? C0135a.f20953c : 0;
        f20950d = i10 >= 30 ? C0135a.f20954d : 0;
    }

    private a() {
    }

    @androidx.annotation.k(api = 24)
    @Deprecated
    public static boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @androidx.annotation.k(api = 25)
    @Deprecated
    public static boolean b() {
        return Build.VERSION.SDK_INT >= 25;
    }

    @androidx.annotation.k(api = 26)
    @Deprecated
    public static boolean c() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @androidx.annotation.k(api = 27)
    @Deprecated
    public static boolean d() {
        return Build.VERSION.SDK_INT >= 27;
    }

    @androidx.annotation.k(api = 28)
    @Deprecated
    public static boolean e() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    protected static boolean f(@androidx.annotation.n0 String str, @androidx.annotation.n0 String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    @androidx.annotation.k(api = 29)
    @Deprecated
    public static boolean g() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @androidx.annotation.k(api = 30)
    @Deprecated
    public static boolean h() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @SuppressLint({"RestrictedApi"})
    @androidx.annotation.k(api = 31, codename = androidx.exifinterface.media.a.R4)
    @Deprecated
    public static boolean i() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 31 || (i10 >= 30 && f(androidx.exifinterface.media.a.R4, Build.VERSION.CODENAME));
    }

    @b
    @androidx.annotation.k(api = 32, codename = "Sv2")
    @Deprecated
    public static boolean j() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 32 || (i10 >= 31 && f("Sv2", Build.VERSION.CODENAME));
    }

    @b
    @androidx.annotation.k(api = 33, codename = "Tiramisu")
    public static boolean k() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 33 || (i10 >= 32 && f("Tiramisu", Build.VERSION.CODENAME));
    }

    @b
    @androidx.annotation.k(codename = "UpsideDownCake")
    public static boolean l() {
        return Build.VERSION.SDK_INT >= 33 && f("UpsideDownCake", Build.VERSION.CODENAME);
    }
}
