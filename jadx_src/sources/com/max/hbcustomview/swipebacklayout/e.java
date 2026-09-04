package com.max.hbcustomview.swipebacklayout;

import android.app.Activity;
import android.app.ActivityOptions;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes10.dex */
public class e {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean a(View view, float f10, float f11, boolean z10) {
        Object[] objArr = {view, new Float(f10), new Float(f11), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        Class cls2 = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.f.Et, new Class[]{View.class, cls, cls, cls2}, cls2);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return (view == null || !e(view, f10, f11)) ? z10 : view.canScrollVertically(1);
    }

    public static boolean b(View view, float f10, float f11, boolean z10) {
        Object[] objArr = {view, new Float(f10), new Float(f11), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        Class cls2 = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.f.Gt, new Class[]{View.class, cls, cls, cls2}, cls2);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return (view == null || !e(view, f10, f11)) ? z10 : view.canScrollHorizontally(1);
    }

    public static boolean c(View view, float f10, float f11, boolean z10) {
        Object[] objArr = {view, new Float(f10), new Float(f11), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        Class cls2 = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.f.Ft, new Class[]{View.class, cls, cls, cls2}, cls2);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return (view == null || !e(view, f10, f11)) ? z10 : view.canScrollHorizontally(-1);
    }

    public static boolean d(View view, float f10, float f11, boolean z10) {
        Object[] objArr = {view, new Float(f10), new Float(f11), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        Class cls2 = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.f.Ct, new Class[]{View.class, cls, cls, cls2}, cls2);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (view == null || !e(view, f10, f11)) {
            return z10;
        }
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() instanceof FlexboxLayoutManager) {
                return view.canScrollVertically(-1) || l((FlexboxLayoutManager) recyclerView.getLayoutManager());
            }
        }
        return view.canScrollVertically(-1);
    }

    public static boolean e(View view, float f10, float f11) {
        Object[] objArr = {view, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.f.Lt, new Class[]{View.class, cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect.contains((int) f10, (int) f11);
    }

    public static boolean f(View view, float f10, float f11, int i10) {
        Object[] objArr = {view, new Float(f10), new Float(f11), new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.f.Mt, new Class[]{View.class, cls, cls, Integer.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        rect.left -= i10;
        rect.right += i10;
        rect.top -= i10;
        rect.bottom += i10;
        return rect.contains((int) f10, (int) f11);
    }

    public static void g(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, bb.c.f.Nt, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            Method declaredMethod = Activity.class.getDeclaredMethod("convertFromTranslucent", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(activity, new Object[0]);
        } catch (Throwable unused) {
        }
    }

    public static void h(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, bb.c.f.Ot, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        i(activity);
    }

    private static void i(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, bb.c.f.Qt, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            Method declaredMethod = Activity.class.getDeclaredMethod("getActivityOptions", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(activity, new Object[0]);
            Class<?> cls = null;
            for (Class<?> cls2 : Activity.class.getDeclaredClasses()) {
                if (cls2.getSimpleName().contains("TranslucentConversionListener")) {
                    cls = cls2;
                }
            }
            Method declaredMethod2 = Activity.class.getDeclaredMethod("convertToTranslucent", cls, ActivityOptions.class);
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(activity, null, objInvoke);
        } catch (Throwable unused) {
        }
    }

    private static void j(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, bb.c.f.Pt, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            Class<?> cls = null;
            for (Class<?> cls2 : Activity.class.getDeclaredClasses()) {
                if (cls2.getSimpleName().contains("TranslucentConversionListener")) {
                    cls = cls2;
                }
            }
            Method declaredMethod = Activity.class.getDeclaredMethod("convertToTranslucent", cls);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(activity, null);
        } catch (Throwable unused) {
        }
    }

    public static View k(ViewGroup viewGroup, boolean z10) {
        View viewK;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.f.Ht, new Class[]{ViewGroup.class, Boolean.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                if (z10) {
                    if (o(childAt)) {
                        return childAt;
                    }
                } else if (m(childAt)) {
                    return childAt;
                }
                if ((childAt instanceof ViewGroup) && (viewK = k((ViewGroup) childAt, z10)) != null) {
                    return viewK;
                }
            }
        }
        return null;
    }

    public static boolean l(FlexboxLayoutManager flexboxLayoutManager) {
        View viewFindViewByPosition;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{flexboxLayoutManager}, null, changeQuickRedirect, true, bb.c.f.Dt, new Class[]{FlexboxLayoutManager.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            if (flexboxLayoutManager.findFirstVisibleItemPosition() == 0 && (viewFindViewByPosition = flexboxLayoutManager.findViewByPosition(0)) != null) {
                return ic.a.f119343a.i(viewFindViewByPosition);
            }
        } catch (Throwable th2) {
            Log.e("isFirstViewCovered", "error: " + th2.getMessage());
        }
        return false;
    }

    public static boolean m(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.f.Kt, new Class[]{View.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return view != null && (view.canScrollHorizontally(1) || view.canScrollHorizontally(-1));
    }

    public static boolean n(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.f.It, new Class[]{View.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return o(view) || o(view);
    }

    public static boolean o(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.f.Jt, new Class[]{View.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return view != null && (view.canScrollVertically(1) || view.canScrollVertically(-1));
    }
}
