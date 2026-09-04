package ne;

import android.os.Build;
import android.text.TextUtils;
import com.max.mediaselector.lib.utils.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: RomUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f132077a = {"samsung"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f132078b = "unknown";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Integer f132079c;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: RomUtils.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f132080a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f132081b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f132082c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f132083d = 4;
    }

    private static String a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.E, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            String str = Build.BRAND;
            return !TextUtils.isEmpty(str) ? str.toLowerCase() : "unknown";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public static int b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.f35119x, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = Build.DISPLAY;
        if (TextUtils.isEmpty(str) || !str.contains("Flyme")) {
            return 0;
        }
        return l(str.replaceAll("Flyme", "").replaceAll("OS", "").replaceAll(" ", "").substring(0, 1));
    }

    public static int c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.f35075v, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Integer num = f132079c;
        if (num != null) {
            return num.intValue();
        }
        if (i()) {
            Integer num2 = 1;
            f132079c = num2;
            return num2.intValue();
        }
        if (h()) {
            Integer num3 = 2;
            f132079c = num3;
            return num3.intValue();
        }
        if (g()) {
            Integer num4 = 3;
            f132079c = num4;
            return num4.intValue();
        }
        Integer num5 = 4;
        f132079c = num5;
        return num5.intValue();
    }

    public static int d() throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.f35163z, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String strF = f();
        if (!TextUtils.isEmpty(strF)) {
            try {
                return u.h(strF);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return 0;
    }

    private static String e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.D, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            String str = Build.MANUFACTURER;
            return !TextUtils.isEmpty(str) ? str.toLowerCase() : "unknown";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    private static String f() throws Throwable {
        BufferedReader bufferedReader;
        Throwable th2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.A, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ro.miui.ui.version.code").getInputStream()), 1024);
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                try {
                    bufferedReader.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
                return line;
            } catch (IOException unused) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                }
                return null;
            } catch (Throwable th3) {
                th2 = th3;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                }
                throw th2;
            }
        } catch (IOException unused2) {
            bufferedReader = null;
        } catch (Throwable th4) {
            bufferedReader = null;
            th2 = th4;
        }
    }

    private static boolean g() {
        return true;
    }

    private static boolean h() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.f35097w, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return b() >= 4;
    }

    private static boolean i() throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.f35141y, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        String strF = f();
        if (!TextUtils.isEmpty(strF)) {
            try {
                if (u.h(strF) >= 4) {
                    return true;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return false;
    }

    private static boolean j(String str, String str2, String... strArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, strArr}, null, changeQuickRedirect, true, bb.c.m.C, new Class[]{String.class, String.class, String[].class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        for (String str3 : strArr) {
            if (str.contains(str3) || str2.contains(str3)) {
                return true;
            }
        }
        return false;
    }

    public static boolean k() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.B, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : j(a(), e(), f132077a);
    }

    public static int l(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.m.F, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (Pattern.compile("^[-\\+]?[\\d]+$").matcher(str).matches()) {
            return u.h(str);
        }
        return 0;
    }
}
