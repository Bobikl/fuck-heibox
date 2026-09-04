package ne;

import android.annotation.TargetApi;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: LightStatusBarUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    private static void a(Activity activity, boolean z10, boolean z11) {
        Object[] objArr = {activity, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.f35053u, new Class[]{Activity.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (z10 && z11) {
            activity.getWindow().getDecorView().setSystemUiVisibility(256);
            return;
        }
        if (!z10 && !z11) {
            activity.getWindow().getDecorView().setSystemUiVisibility(1280);
        } else {
            if (z10 || !z11) {
                return;
            }
            activity.getWindow().getDecorView().setSystemUiVisibility(1280);
        }
    }

    @TargetApi(11)
    private static void b(Activity activity, boolean z10, boolean z11, boolean z12, boolean z13) {
        Object[] objArr = {activity, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0), new Byte(z13 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.f35031t, new Class[]{Activity.class, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        try {
            if (z12) {
                Window window = activity.getWindow();
                if (z10 && z11) {
                    if (z13) {
                        window.getDecorView().setSystemUiVisibility(8448);
                    } else {
                        window.getDecorView().setSystemUiVisibility(256);
                    }
                } else if (z10 || z11) {
                    if (z10 || !z11) {
                        return;
                    }
                    if (z13) {
                        window.getDecorView().setSystemUiVisibility(bb.c.k.ou);
                    } else {
                        window.getDecorView().setSystemUiVisibility(1280);
                    }
                } else if (z13) {
                    window.getDecorView().setSystemUiVisibility(bb.c.k.ou);
                } else {
                    window.getDecorView().setSystemUiVisibility(1280);
                }
            } else {
                View decorView = activity.getWindow().getDecorView();
                if (z13) {
                    decorView.setSystemUiVisibility(8192);
                } else {
                    decorView.setSystemUiVisibility(0);
                }
            }
        } catch (Exception unused) {
        }
    }

    private static boolean c(Activity activity, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = false;
        Object[] objArr = {activity, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0), new Byte(z13 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.f35009s, new Class[]{Activity.class, cls, cls, cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (activity == null) {
            return false;
        }
        a(activity, z10, z11);
        try {
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
            Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            int i10 = declaredField.getInt(null);
            int i11 = declaredField2.getInt(attributes);
            declaredField2.setInt(attributes, z13 ? i10 | i11 : (~i10) & i11);
            activity.getWindow().setAttributes(attributes);
            try {
                if (c.b() >= 7) {
                    b(activity, z10, z11, z12, z13);
                }
                return true;
            } catch (Exception unused) {
                z14 = true;
                b(activity, z10, z11, z12, z13);
                return z14;
            }
        } catch (Exception unused2) {
        }
    }

    public static void d(Activity activity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{activity, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.m.f34942p, new Class[]{Activity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        e(activity, false, false, false, z10);
    }

    public static void e(Activity activity, boolean z10, boolean z11, boolean z12, boolean z13) {
        Object[] objArr = {activity, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0), new Byte(z13 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.f34965q, new Class[]{Activity.class, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        int iC = c.c();
        if (iC == 1) {
            if (c.d() >= 7) {
                b(activity, z10, z11, z12, z13);
                return;
            } else {
                g(activity, z10, z11, z12, z13);
                return;
            }
        }
        if (iC == 2) {
            c(activity, z10, z11, z12, z13);
        } else {
            if (iC != 3) {
                return;
            }
            b(activity, z10, z11, z12, z13);
        }
    }

    public static void f(Activity activity, boolean z10, boolean z11, boolean z12, boolean z13) {
        Object[] objArr = {activity, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0), new Byte(z13 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.f34919o, new Class[]{Activity.class, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        e(activity, z10, z11, z12, z13);
    }

    private static boolean g(Activity activity, boolean z10, boolean z11, boolean z12, boolean z13) {
        Object[] objArr = {activity, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0), new Byte(z13 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.f34987r, new Class[]{Activity.class, cls, cls, cls, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        a(activity, z10, z11);
        Class<?> cls2 = activity.getWindow().getClass();
        try {
            Class<?> cls3 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i10 = cls3.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls3);
            Class<?> cls4 = Integer.TYPE;
            Method method = cls2.getMethod("setExtraFlags", cls4, cls4);
            Window window = activity.getWindow();
            Object[] objArr2 = new Object[2];
            objArr2[0] = Integer.valueOf(z13 ? i10 : 0);
            objArr2[1] = Integer.valueOf(i10);
            method.invoke(window, objArr2);
            return true;
        } catch (Exception unused) {
            b(activity, z10, z11, z12, z13);
            return false;
        }
    }
}
