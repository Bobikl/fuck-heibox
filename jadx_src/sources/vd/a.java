package vd;

import android.content.Context;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HwNotchSizeUtil.java */
/* JADX INFO: loaded from: classes13.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f140876a = 65536;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int[] a(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.k.Wv, new Class[]{Context.class}, int[].class);
        if (patchProxyResultProxy.isSupported) {
            return (int[]) patchProxyResultProxy.result;
        }
        int[] iArr = {0, 0};
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return (int[]) clsLoadClass.getMethod("getNotchSize", new Class[0]).invoke(clsLoadClass, new Object[0]);
        } catch (Exception e10) {
            e10.printStackTrace();
            return iArr;
        }
    }

    public static boolean b(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.k.Vv, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) clsLoadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(clsLoadClass, new Object[0])).booleanValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static void c(Window window) {
        if (PatchProxy.proxy(new Object[]{window}, null, changeQuickRedirect, true, bb.c.k.Xv, new Class[]{Window.class}, Void.TYPE).isSupported || window == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        try {
            Class<?> cls = Class.forName("com.huawei.android.view.LayoutParamsEx");
            cls.getMethod("addHwFlags", Integer.TYPE).invoke(cls.getConstructor(ViewGroup.LayoutParams.class).newInstance(attributes), 65536);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void d(Window window) {
        if (PatchProxy.proxy(new Object[]{window}, null, changeQuickRedirect, true, bb.c.k.Yv, new Class[]{Window.class}, Void.TYPE).isSupported || window == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        try {
            Class<?> cls = Class.forName("com.huawei.android.view.LayoutParamsEx");
            cls.getMethod("clearHwFlags", Integer.TYPE).invoke(cls.getConstructor(ViewGroup.LayoutParams.class).newInstance(attributes), 65536);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
