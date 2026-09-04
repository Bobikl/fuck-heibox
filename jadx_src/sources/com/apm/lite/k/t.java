package com.apm.lite.k;

import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final CharSequence f40077a = "sony";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final CharSequence f40078b = "amigo";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final CharSequence f40079c = "funtouch";

    public static String a() {
        if (d.f()) {
            return k();
        }
        if (d.h()) {
            return m();
        }
        if (n()) {
            return o();
        }
        String strL = l();
        if (!TextUtils.isEmpty(strL)) {
            return strL;
        }
        if (f()) {
            return e();
        }
        if (g()) {
            return h();
        }
        if (d()) {
            return c();
        }
        String strI = i();
        return !TextUtils.isEmpty(strI) ? strI : Build.DISPLAY;
    }

    private static String b(String str) {
        String line = "";
        BufferedReader bufferedReader = null;
        try {
            Process processExec = Runtime.getRuntime().exec("getprop " + str);
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(processExec.getInputStream()), 1024);
            try {
                line = bufferedReader2.readLine();
                processExec.destroy();
                k.a(bufferedReader2);
                return line;
            } catch (Throwable unused) {
                bufferedReader = bufferedReader2;
                k.a(bufferedReader);
                return line;
            }
        } catch (Throwable unused2) {
        }
    }

    public static String c() {
        return b("ro.build.uiversion") + lg.a.f131412e + Build.DISPLAY;
    }

    public static boolean d() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        return lowerCase.contains("360") || lowerCase.contains("qiku");
    }

    public static String e() {
        return b("ro.vivo.os.build.display.id") + lg.a.f131412e + b("ro.vivo.product.version");
    }

    public static boolean f() {
        String strB = b("ro.vivo.os.build.display.id");
        return !TextUtils.isEmpty(strB) && strB.toLowerCase(Locale.getDefault()).contains(f40079c);
    }

    public static boolean g() {
        String str = Build.DISPLAY;
        return !TextUtils.isEmpty(str) && str.toLowerCase(Locale.getDefault()).contains(f40078b);
    }

    public static String h() {
        return Build.DISPLAY + lg.a.f131412e + b("ro.gn.sv.version");
    }

    public static String i() {
        if (!j()) {
            return "";
        }
        return "eui_" + b("ro.letv.release.version") + lg.a.f131412e + Build.DISPLAY;
    }

    public static boolean j() {
        return !TextUtils.isEmpty(b("ro.letv.release.version"));
    }

    public static String k() {
        if (!d.f()) {
            return "";
        }
        return "miui_" + b("ro.miui.ui.version.name") + lg.a.f131412e + Build.VERSION.INCREMENTAL;
    }

    public static String l() {
        String strA = d.a();
        if (strA == null || !strA.toLowerCase(Locale.getDefault()).contains("emotionui")) {
            return "";
        }
        return strA + lg.a.f131412e + Build.DISPLAY;
    }

    public static String m() {
        String str = Build.DISPLAY;
        return (str == null || !str.toLowerCase(Locale.getDefault()).contains("flyme")) ? "" : str;
    }

    public static boolean n() {
        String str = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.toLowerCase(Locale.getDefault()).contains("oppo");
    }

    public static String o() {
        if (!n()) {
            return "";
        }
        return "coloros_" + b("ro.build.version.opporom") + lg.a.f131412e + Build.DISPLAY;
    }
}
