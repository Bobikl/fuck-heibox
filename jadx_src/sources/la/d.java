package la;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: OkLogger.java */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f130927a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f130928b = "OkGo";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void a(String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.f30886qc, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        b(f130928b, str);
    }

    public static void b(String str, String str2) {
        if (!PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.b.f30908rc, new Class[]{String.class, String.class}, Void.TYPE).isSupported && f130927a) {
            Log.d(str, str2);
        }
    }

    public static void c(String str, boolean z10) {
        f130928b = str;
        f130927a = z10;
    }

    public static void d(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.b.f30817nc, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        c(f130928b, z10);
    }

    public static void e(String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.f31018wc, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f(f130928b, str);
    }

    public static void f(String str, String str2) {
        if (!PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.b.f31040xc, new Class[]{String.class, String.class}, Void.TYPE).isSupported && f130927a) {
            Log.e(str, str2);
        }
    }

    public static void g(String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.f30930sc, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        h(f130928b, str);
    }

    public static void h(String str, String str2) {
        if (!PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.b.f30952tc, new Class[]{String.class, String.class}, Void.TYPE).isSupported && f130927a) {
            Log.i(str, str2);
        }
    }

    public static void i(Throwable th2) {
        if (PatchProxy.proxy(new Object[]{th2}, null, changeQuickRedirect, true, bb.c.b.f31062yc, new Class[]{Throwable.class}, Void.TYPE).isSupported || !f130927a || th2 == null) {
            return;
        }
        th2.printStackTrace();
    }

    public static void j(String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.f30840oc, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        k(f130928b, str);
    }

    public static void k(String str, String str2) {
        if (!PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.b.f30863pc, new Class[]{String.class, String.class}, Void.TYPE).isSupported && f130927a) {
            Log.v(str, str2);
        }
    }

    public static void l(String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 800, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        m(f130928b, str);
    }

    public static void m(String str, String str2) {
        if (!PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, bb.c.b.f30996vc, new Class[]{String.class, String.class}, Void.TYPE).isSupported && f130927a) {
            Log.w(str, str2);
        }
    }
}
