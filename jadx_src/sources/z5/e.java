package z5;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static m4.a.InterfaceC1200a f141857a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f141858b = "alipaysdk";

    public static String a(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return String.format("[%s][%s]", str, str2);
    }

    public static void b(String str) {
        try {
            m4.a.InterfaceC1200a interfaceC1200a = f141857a;
            if (interfaceC1200a != null) {
                interfaceC1200a.a(String.format("[AlipaySDK] %s %s", new SimpleDateFormat("hh:mm:ss.SSS", Locale.getDefault()).format(new Date()), str));
            }
        } catch (Throwable unused) {
        }
    }

    public static void c(String str, String str2, Throwable th2) {
        b(a(str, str2) + " " + f(th2));
    }

    public static void d(Throwable th2) {
        if (th2 == null) {
            return;
        }
        try {
            b(f(th2));
        } catch (Throwable unused) {
        }
    }

    public static void e(m4.a.InterfaceC1200a interfaceC1200a) {
        f141857a = interfaceC1200a;
    }

    public static String f(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void g(String str, String str2) {
        b(a(str, str2));
    }

    public static void h(String str, String str2) {
        b(a(str, str2));
    }

    public static void i(String str, String str2) {
        b(a(str, str2));
    }

    public static void j(String str, String str2) {
        b(a(str, str2));
    }
}
