package xb;

import android.content.res.Resources;
import android.util.Log;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: BannerUtils.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f141181a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f141182b = "BVP";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int a(float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, null, changeQuickRedirect, true, c.f.Ah, new Class[]{Float.TYPE}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (int) ((f10 * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static int b(int i10) {
        return 500 - (500 % i10);
    }

    public static int c(int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        return (i10 + i11) % i11;
    }

    public static boolean d() {
        return f141181a;
    }

    public static void e(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.f.Ch, new Class[]{String.class}, Void.TYPE).isSupported && d()) {
            f(f141182b, str);
        }
    }

    public static void f(String str, String str2) {
        if (!PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, c.f.Bh, new Class[]{String.class, String.class}, Void.TYPE).isSupported && d()) {
            Log.e(str, str2);
        }
    }

    public static void g(boolean z10) {
        f141181a = z10;
    }
}
