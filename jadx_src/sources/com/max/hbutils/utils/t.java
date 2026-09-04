package com.max.hbutils.utils;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.annotation.f0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.g3;
import androidx.core.view.j1;
import androidx.drawerlayout.widget.DrawerLayout;
import com.max.hbutils.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import io.reactivex.b0;
import io.reactivex.c0;
import io.reactivex.z;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: compiled from: StatusBarUtil.java */
/* JADX INFO: loaded from: classes13.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f73580a = 112;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f73581b = R.id.statusbarutil_fake_status_bar_view;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f73582c = R.id.statusbarutil_translucent_view;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f73583d = -123;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f73584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f73585f;

    /* JADX INFO: compiled from: StatusBarUtil.java */
    public class a implements c0<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Window f73586a;

        /* JADX INFO: renamed from: com.max.hbutils.utils.t$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: StatusBarUtil.java */
        public class RunnableC0591a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f73587b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b0 f73588c;

            RunnableC0591a(View view, b0 b0Var) {
                this.f73587b = view;
                this.f73588c = b0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindowInsets rootWindowInsets;
                boolean z10 = false;
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.ps, new Class[0], Void.TYPE).isSupported || (rootWindowInsets = this.f73587b.getRootWindowInsets()) == null) {
                    return;
                }
                DisplayCutout displayCutout = rootWindowInsets.getDisplayCutout();
                List<Rect> boundingRects = displayCutout != null ? displayCutout.getBoundingRects() : null;
                b0 b0Var = this.f73588c;
                if (boundingRects != null && !boundingRects.isEmpty()) {
                    z10 = true;
                }
                b0Var.onNext(Boolean.valueOf(z10));
                this.f73588c.onComplete();
            }
        }

        a(Window window) {
            this.f73586a = window;
        }

        @Override // io.reactivex.c0
        public void a(b0<Boolean> b0Var) throws Exception {
            if (PatchProxy.proxy(new Object[]{b0Var}, this, changeQuickRedirect, false, bb.c.k.os, new Class[]{b0.class}, Void.TYPE).isSupported) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                View decorView = this.f73586a.getDecorView();
                decorView.post(new RunnableC0591a(decorView, b0Var));
                return;
            }
            String strC = o.c();
            if ("Xiaomi".equals(strC)) {
                b0Var.onNext(Boolean.valueOf(vd.e.c(this.f73586a.getContext())));
            } else if (o.f73558d.equals(strC)) {
                b0Var.onNext(Boolean.valueOf(vd.a.b(this.f73586a.getContext())));
            } else if (o.f73559e.equals(strC)) {
                b0Var.onNext(Boolean.valueOf(vd.b.a(this.f73586a.getContext())));
            } else if (o.f73560f.equals(strC)) {
                b0Var.onNext(Boolean.valueOf(vd.d.a(this.f73586a.getContext())));
            } else if (o.f73561g.equals(strC)) {
                b0Var.onNext(Boolean.valueOf(vd.c.a(this.f73586a.getContext())));
            } else {
                b0Var.onNext(Boolean.FALSE);
            }
            b0Var.onComplete();
        }
    }

    /* JADX INFO: compiled from: StatusBarUtil.java */
    public class b implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CoordinatorLayout f73590b;

        b(CoordinatorLayout coordinatorLayout) {
            this.f73590b = coordinatorLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.qs, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f73590b.requestLayout();
        }
    }

    public static void A(Activity activity, @androidx.annotation.l int i10, @f0(from = 0, to = 255) int i11) {
        Object[] objArr = {activity, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.Cr, new Class[]{Activity.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        activity.getWindow().addFlags(Integer.MIN_VALUE);
        activity.getWindow().clearFlags(67108864);
        activity.getWindow().setStatusBarColor(e(i10, i11));
    }

    @Deprecated
    public static void B(Activity activity, @androidx.annotation.l int i10) {
        i0(activity);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(android.R.id.content);
        View viewFindViewById = viewGroup.findViewById(f73581b);
        if (viewFindViewById != null) {
            if (viewFindViewById.getVisibility() == 8) {
                viewFindViewById.setVisibility(0);
            }
            viewFindViewById.setBackgroundColor(i10);
        } else {
            viewGroup.addView(h(activity, i10));
        }
        O(activity);
    }

    public static void C(Activity activity, DrawerLayout drawerLayout, @androidx.annotation.l int i10) {
        if (PatchProxy.proxy(new Object[]{activity, drawerLayout, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.Kr, new Class[]{Activity.class, DrawerLayout.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        D(activity, drawerLayout, i10, 112);
    }

    public static void D(Activity activity, DrawerLayout drawerLayout, @androidx.annotation.l int i10, @f0(from = 0, to = 255) int i11) {
        Object[] objArr = {activity, drawerLayout, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.Mr, new Class[]{Activity.class, DrawerLayout.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        activity.getWindow().addFlags(Integer.MIN_VALUE);
        activity.getWindow().clearFlags(67108864);
        activity.getWindow().setStatusBarColor(0);
        ViewGroup viewGroup = (ViewGroup) drawerLayout.getChildAt(0);
        View viewFindViewById = viewGroup.findViewById(f73581b);
        if (viewFindViewById != null) {
            if (viewFindViewById.getVisibility() == 8) {
                viewFindViewById.setVisibility(0);
            }
            viewFindViewById.setBackgroundColor(i10);
        } else {
            viewGroup.addView(h(activity, i10), 0);
        }
        if (!(viewGroup instanceof LinearLayout) && viewGroup.getChildAt(1) != null) {
            viewGroup.getChildAt(1).setPadding(viewGroup.getPaddingLeft(), p(activity) + viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
        }
        K(drawerLayout, viewGroup);
        d(activity, i11);
    }

    @Deprecated
    public static void E(Activity activity, DrawerLayout drawerLayout, @androidx.annotation.l int i10) {
        activity.getWindow().addFlags(67108864);
        ViewGroup viewGroup = (ViewGroup) drawerLayout.getChildAt(0);
        View viewFindViewById = viewGroup.findViewById(f73581b);
        if (viewFindViewById != null) {
            if (viewFindViewById.getVisibility() == 8) {
                viewFindViewById.setVisibility(0);
            }
            viewFindViewById.setBackgroundColor(e(i10, 112));
        } else {
            viewGroup.addView(h(activity, i10), 0);
        }
        if (!(viewGroup instanceof LinearLayout) && viewGroup.getChildAt(1) != null) {
            viewGroup.getChildAt(1).setPadding(0, p(activity), 0, 0);
        }
        K(drawerLayout, viewGroup);
    }

    public static void F(Activity activity, int i10) {
        if (PatchProxy.proxy(new Object[]{activity, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.Dr, new Class[]{Activity.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        G(activity, i10, 112);
    }

    public static void G(Activity activity, @androidx.annotation.l int i10, @f0(from = 0, to = 255) int i11) {
        Object[] objArr = {activity, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.Er, new Class[]{Activity.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(android.R.id.content);
        View childAt = viewGroup.getChildAt(0);
        int iP = p(activity);
        if (childAt == null || !(childAt instanceof CoordinatorLayout)) {
            viewGroup.setPadding(0, iP, 0, 0);
            viewGroup.setBackgroundColor(e(i10, i11));
        } else {
            ((CoordinatorLayout) childAt).setStatusBarBackgroundColor(e(i10, i11));
        }
        g0(activity);
    }

    public static void H(Activity activity, @androidx.annotation.l int i10) {
        if (PatchProxy.proxy(new Object[]{activity, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.Fr, new Class[]{Activity.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        A(activity, i10, 0);
    }

    public static void I(Activity activity, DrawerLayout drawerLayout, @androidx.annotation.l int i10) {
        if (PatchProxy.proxy(new Object[]{activity, drawerLayout, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.Lr, new Class[]{Activity.class, DrawerLayout.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        D(activity, drawerLayout, i10, 0);
    }

    public static void J(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, bb.c.k.kr, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        if (M(activity, true)) {
            A(activity, activity.getResources().getColor(R.color.appbar_bg_color), 0);
        } else {
            z(activity, activity.getResources().getColor(R.color.appbar_bg_color));
        }
    }

    private static void K(DrawerLayout drawerLayout, ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{drawerLayout, viewGroup}, null, changeQuickRedirect, true, bb.c.k.Nr, new Class[]{DrawerLayout.class, ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) drawerLayout.getChildAt(1);
        drawerLayout.setFitsSystemWindows(false);
        viewGroup.setFitsSystemWindows(false);
        viewGroup.setClipToPadding(true);
        viewGroup2.setFitsSystemWindows(false);
    }

    public static boolean L(Window window, boolean z10) {
        Object[] objArr = {window, new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.or, new Class[]{Window.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Log.d("StatusBarUtil", "setLightNavigationBarMode, light = " + z10);
        g3.a(window, window.getDecorView()).h(z10);
        return true;
    }

    public static boolean M(Activity activity, boolean z10) {
        Object[] objArr = {activity, new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.mr, new Class[]{Activity.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        ob.a aVar = ob.a.f132240a;
        if (ob.a.b().m(activity)) {
            z10 = false;
        }
        if (!a(activity.getWindow(), !z10)) {
            b(activity.getWindow(), z10);
        }
        Log.d("StatusBarUtil", "setLightStatusBarMode, light = " + z10);
        g3.a(activity.getWindow(), activity.getWindow().getDecorView()).i(z10);
        return true;
    }

    public static boolean N(Window window, boolean z10) {
        Object[] objArr = {window, new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.nr, new Class[]{Window.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!a(window, !z10)) {
            b(window, z10);
        }
        Log.d("StatusBarUtil", "setLightStatusBarMode, light = " + z10);
        g3.a(window, window.getDecorView()).i(z10);
        return true;
    }

    private static void O(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, bb.c.k.fs, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(android.R.id.content);
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof ViewGroup) {
                childAt.setFitsSystemWindows(true);
                ((ViewGroup) childAt).setClipToPadding(true);
            }
        }
    }

    public static void P(Activity activity, int i10) {
        if (PatchProxy.proxy(new Object[]{activity, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.vr, new Class[]{Activity.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        activity.getWindow().getDecorView().setSystemUiVisibility(i10);
    }

    public static void Q(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, bb.c.k.Gr, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        R(activity, 112);
    }

    public static void R(Activity activity, @f0(from = 0, to = 255) int i10) {
        if (PatchProxy.proxy(new Object[]{activity, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.Hr, new Class[]{Activity.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        c0(activity);
        d(activity, i10);
    }

    @Deprecated
    public static void S(Activity activity) {
        activity.getWindow().addFlags(67108864);
        O(activity);
    }

    public static void T(Activity activity, @f0(from = 0, to = 255) int i10) {
        if (PatchProxy.proxy(new Object[]{activity, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.Ir, new Class[]{Activity.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        i0(activity);
        d(activity, i10);
    }

    public static void U(Activity activity, DrawerLayout drawerLayout) {
        if (PatchProxy.proxy(new Object[]{activity, drawerLayout}, null, changeQuickRedirect, true, bb.c.k.Or, new Class[]{Activity.class, DrawerLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        V(activity, drawerLayout, 112);
    }

    public static void V(Activity activity, DrawerLayout drawerLayout, @f0(from = 0, to = 255) int i10) {
        if (PatchProxy.proxy(new Object[]{activity, drawerLayout, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.Pr, new Class[]{Activity.class, DrawerLayout.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        d0(activity, drawerLayout);
        d(activity, i10);
    }

    @Deprecated
    public static void W(Activity activity, DrawerLayout drawerLayout) {
        activity.getWindow().addFlags(67108864);
        ViewGroup viewGroup = (ViewGroup) drawerLayout.getChildAt(0);
        viewGroup.setFitsSystemWindows(true);
        viewGroup.setClipToPadding(true);
        ((ViewGroup) drawerLayout.getChildAt(1)).setFitsSystemWindows(false);
        drawerLayout.setFitsSystemWindows(false);
    }

    public static void X(Activity activity, @f0(from = 0, to = 255) int i10, View view) {
        if (PatchProxy.proxy(new Object[]{activity, new Integer(i10), view}, null, changeQuickRedirect, true, bb.c.k.Tr, new Class[]{Activity.class, Integer.TYPE, View.class}, Void.TYPE).isSupported) {
            return;
        }
        g0(activity);
        d(activity, i10);
        if (view != null) {
            Object tag = view.getTag(f73583d);
            if (tag == null || !((Boolean) tag).booleanValue()) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin + p(activity), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                view.setTag(f73583d, Boolean.TRUE);
            }
        }
    }

    public static void Y(Activity activity, View view) {
        if (PatchProxy.proxy(new Object[]{activity, view}, null, changeQuickRedirect, true, bb.c.k.Sr, new Class[]{Activity.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        X(activity, 112, view);
    }

    public static void Z(Activity activity, @f0(from = 0, to = 255) int i10, View view) {
        if (PatchProxy.proxy(new Object[]{activity, new Integer(i10), view}, null, changeQuickRedirect, true, bb.c.k.Xr, new Class[]{Activity.class, Integer.TYPE, View.class}, Void.TYPE).isSupported) {
            return;
        }
        X(activity, i10, view);
    }

    private static boolean a(Window window, boolean z10) {
        Object[] objArr = {window, new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.pr, new Class[]{Window.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (window == null) {
            return false;
        }
        try {
            WindowManager.LayoutParams attributes = window.getAttributes();
            Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
            Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            int i10 = declaredField.getInt(null);
            int i11 = declaredField2.getInt(attributes);
            declaredField2.setInt(attributes, z10 ? i11 | i10 : (~i10) & i11);
            window.setAttributes(attributes);
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static void a0(Activity activity, View view) {
        if (PatchProxy.proxy(new Object[]{activity, view}, null, changeQuickRedirect, true, bb.c.k.Vr, new Class[]{Activity.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        Z(activity, 112, view);
    }

    private static boolean b(Window window, boolean z10) {
        Object[] objArr = {window, new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.qr, new Class[]{Window.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (window == null) {
            return false;
        }
        Class<?> cls2 = window.getClass();
        try {
            Class<?> cls3 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i10 = cls3.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls3);
            Class<?> cls4 = Integer.TYPE;
            Method method = cls2.getMethod("setExtraFlags", cls4, cls4);
            if (z10) {
                method.invoke(window, Integer.valueOf(i10), Integer.valueOf(i10));
            } else {
                method.invoke(window, 0, Integer.valueOf(i10));
            }
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static void b0(Activity activity, @f0(from = 0, to = 255) int i10, View view) {
        if (PatchProxy.proxy(new Object[]{activity, new Integer(i10), view}, null, changeQuickRedirect, true, bb.c.k.Ur, new Class[]{Activity.class, Integer.TYPE, View.class}, Void.TYPE).isSupported) {
            return;
        }
        g0(activity);
        d(activity, i10);
        if (view != null) {
            Object tag = view.getTag(f73583d);
            if (tag == null || !((Boolean) tag).booleanValue()) {
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + p(activity), view.getPaddingRight(), view.getPaddingBottom());
                view.setTag(f73583d, Boolean.TRUE);
            }
        }
    }

    public static void c(int i10, @n0 ViewGroup viewGroup, @p0 View view) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), viewGroup, view}, null, changeQuickRedirect, true, bb.c.k.Yr, new Class[]{Integer.TYPE, ViewGroup.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = viewGroup.findViewById(f73581b);
        Context context = viewGroup.getContext();
        if (viewFindViewById != null) {
            if (viewFindViewById.getVisibility() == 8) {
                viewFindViewById.setVisibility(0);
            }
            viewFindViewById.setBackgroundColor(i10);
        } else {
            viewGroup.addView(j(context, i10), 0);
        }
        if (view != null) {
            Object tag = view.getTag(f73583d);
            if (tag == null || !((Boolean) tag).booleanValue()) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin + p(context), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                view.setTag(f73583d, Boolean.TRUE);
            }
        }
    }

    public static void c0(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, bb.c.k.Jr, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        i0(activity);
        O(activity);
    }

    private static void d(Activity activity, @f0(from = 0, to = 255) int i10) {
        if (PatchProxy.proxy(new Object[]{activity, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.cs, new Class[]{Activity.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(android.R.id.content);
        View viewFindViewById = viewGroup.findViewById(f73582c);
        if (viewFindViewById == null) {
            viewGroup.addView(j(activity, Color.argb(i10, 0, 0, 0)));
            return;
        }
        if (viewFindViewById.getVisibility() == 8) {
            viewFindViewById.setVisibility(0);
        }
        viewFindViewById.setBackgroundColor(Color.argb(i10, 0, 0, 0));
    }

    public static void d0(Activity activity, DrawerLayout drawerLayout) {
        if (PatchProxy.proxy(new Object[]{activity, drawerLayout}, null, changeQuickRedirect, true, bb.c.k.Qr, new Class[]{Activity.class, DrawerLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        activity.getWindow().addFlags(Integer.MIN_VALUE);
        activity.getWindow().clearFlags(67108864);
        activity.getWindow().setStatusBarColor(0);
        ViewGroup viewGroup = (ViewGroup) drawerLayout.getChildAt(0);
        if (!(viewGroup instanceof LinearLayout) && viewGroup.getChildAt(1) != null) {
            viewGroup.getChildAt(1).setPadding(0, p(activity), 0, 0);
        }
        K(drawerLayout, viewGroup);
    }

    private static int e(@androidx.annotation.l int i10, int i11) {
        if (i11 == 0) {
            return i10;
        }
        float f10 = 1.0f - (i11 / 255.0f);
        return ((int) (((double) ((i10 & 255) * f10)) + 0.5d)) | (((int) (((double) (((i10 >> 16) & 255) * f10)) + 0.5d)) << 16) | j1.f21601t | (((int) (((double) (((i10 >> 8) & 255) * f10)) + 0.5d)) << 8);
    }

    public static void e0(Activity activity, View view) {
        if (PatchProxy.proxy(new Object[]{activity, view}, null, changeQuickRedirect, true, bb.c.k.Rr, new Class[]{Activity.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        X(activity, 0, view);
    }

    @TargetApi(19)
    private static void f(Activity activity) {
        ViewGroup viewGroup;
        View viewFindViewById;
        if (PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, bb.c.k.bs, new Class[]{Activity.class}, Void.TYPE).isSupported || (viewFindViewById = (viewGroup = (ViewGroup) activity.getWindow().getDecorView()).findViewById(f73581b)) == null) {
            return;
        }
        viewGroup.removeView(viewFindViewById);
        ((ViewGroup) ((ViewGroup) activity.findViewById(android.R.id.content)).getChildAt(0)).setPadding(0, 0, 0, 0);
    }

    public static void f0(Activity activity, View view) {
        if (PatchProxy.proxy(new Object[]{activity, view}, null, changeQuickRedirect, true, bb.c.k.Wr, new Class[]{Activity.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        Z(activity, 0, view);
    }

    public static void g(Window window) {
        if (PatchProxy.proxy(new Object[]{window}, null, changeQuickRedirect, true, bb.c.k.zr, new Class[]{Window.class}, Void.TYPE).isSupported) {
            return;
        }
        window.getDecorView().setSystemUiVisibility(bb.c.f.Yh);
    }

    private static void g0(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, bb.c.k.gs, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        activity.getWindow().setStatusBarColor(0);
        activity.getWindow().getDecorView().setSystemUiVisibility(1280);
    }

    private static View h(Activity activity, @androidx.annotation.l int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.ds, new Class[]{Activity.class, Integer.TYPE}, View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : i(activity, i10, 0);
    }

    public static void h0(Window window) {
        if (PatchProxy.proxy(new Object[]{window}, null, changeQuickRedirect, true, bb.c.k.yr, new Class[]{Window.class}, Void.TYPE).isSupported) {
            return;
        }
        window.setStatusBarColor(0);
        window.getDecorView().setSystemUiVisibility(1280);
    }

    private static View i(Activity activity, @androidx.annotation.l int i10, int i11) {
        Object[] objArr = {activity, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.es, new Class[]{Activity.class, cls, cls}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = new View(activity);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, p(activity)));
        view.setBackgroundColor(e(i10, i11));
        view.setId(f73581b);
        return view;
    }

    @TargetApi(19)
    private static void i0(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, bb.c.k.hs, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        activity.getWindow().addFlags(Integer.MIN_VALUE);
        activity.getWindow().clearFlags(67108864);
        activity.getWindow().addFlags(134217728);
        activity.getWindow().setStatusBarColor(0);
    }

    public static View j(Context context, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.is, new Class[]{Context.class, Integer.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, p(context)));
        view.setBackgroundColor(i10);
        view.setId(f73582c);
        return view;
    }

    public static void k(Context context) {
        if (!PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.k.rr, new Class[]{Context.class}, Void.TYPE).isSupported && (context instanceof Activity)) {
            Activity activity = (Activity) context;
            activity.getWindow().getDecorView().setSystemUiVisibility(1280);
            activity.getWindow().setStatusBarColor(0);
        }
    }

    public static void l(Activity activity) {
        if (!PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, bb.c.k.sr, new Class[]{Activity.class}, Void.TYPE).isSupported && Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            activity.getWindow().setAttributes(attributes);
        }
    }

    public static int m(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.k.js, new Class[]{Context.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : p(context);
    }

    public static int n(Activity activity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, bb.c.k.lr, new Class[]{Activity.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : activity.getResources().getColor(R.color.background_layer_2_color);
    }

    public static int o(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.k.ns, new Class[]{Context.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    public static int p(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.k.ks, new Class[]{Context.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int i10 = f73584e;
        if (i10 > 0) {
            return i10;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
        f73584e = dimensionPixelSize;
        return dimensionPixelSize;
    }

    public static int q(Activity activity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, bb.c.k.xr, new Class[]{Activity.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : activity.getWindow().getDecorView().getSystemUiVisibility();
    }

    public static z<Boolean> r(Window window) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{window}, null, changeQuickRedirect, true, bb.c.k.Ar, new Class[]{Window.class}, z.class);
        return patchProxyResultProxy.isSupported ? (z) patchProxyResultProxy.result : z.q1(new a(window));
    }

    public static void s(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, bb.c.k.as, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        View viewFindViewById = viewGroup.findViewById(f73581b);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        View viewFindViewById2 = viewGroup.findViewById(f73582c);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
    }

    public static void t(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, bb.c.k.ls, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        u(activity.getWindow());
    }

    public static void u(Window window) {
        if (PatchProxy.proxy(new Object[]{window}, null, changeQuickRedirect, true, bb.c.k.ms, new Class[]{Window.class}, Void.TYPE).isSupported) {
            return;
        }
        window.clearFlags(201326592);
        window.getDecorView().setSystemUiVisibility(bb.c.b.zv);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
    }

    public static int v(Activity activity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, bb.c.k.tr, new Class[]{Activity.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : w(activity.getWindow());
    }

    public static int w(Window window) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{window}, null, changeQuickRedirect, true, bb.c.k.ur, new Class[]{Window.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(bb.c.f.Sr);
        return systemUiVisibility;
    }

    public static boolean x(Activity activity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, bb.c.k.wr, new Class[]{Activity.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return (q(activity) & 1024) == 1024;
    }

    public static void y(@n0 ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, null, changeQuickRedirect, true, bb.c.k.Zr, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = viewGroup.findViewById(f73581b);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        View viewFindViewById2 = viewGroup.findViewById(f73582c);
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    public static void z(Activity activity, @androidx.annotation.l int i10) {
        if (PatchProxy.proxy(new Object[]{activity, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.Br, new Class[]{Activity.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        A(activity, i10, 112);
    }
}
