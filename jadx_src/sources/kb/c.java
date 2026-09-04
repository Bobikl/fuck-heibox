package kb;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import com.max.hbutils.utils.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import xh.h;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncom/max/hbcommon/component/inappnotification/utils/Utils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
@h(name = "Utils")
public final class c {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final int a(@d Activity activity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, bb.c.e.f31728c1, new Class[]{Activity.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(activity, "<this>");
        ActionBar actionBar = activity.getActionBar();
        return actionBar != null ? actionBar.getHeight() : b(activity, 56.0f);
    }

    public static final int b(@d Context context, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Float(f10)}, null, changeQuickRedirect, true, bb.c.e.f31694a1, new Class[]{Context.class, Float.TYPE}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(context, "<this>");
        return (int) TypedValue.applyDimension(1, f10, context.getResources().getDisplayMetrics());
    }

    public static final int c(@d View view, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, new Float(f10)}, null, changeQuickRedirect, true, bb.c.e.f31745d1, new Class[]{View.class, Float.TYPE}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(view, "<this>");
        Context context = view.getContext();
        f0.o(context, "getContext(...)");
        return b(context, f10);
    }

    @d
    public static final LayoutInflater d(@d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.e.Z0, new Class[]{Context.class}, LayoutInflater.class);
        if (patchProxyResultProxy.isSupported) {
            return (LayoutInflater) patchProxyResultProxy.result;
        }
        f0.p(context, "<this>");
        if (context instanceof Activity) {
            LayoutInflater layoutInflater = ((Activity) context).getLayoutInflater();
            f0.m(layoutInflater);
            return layoutInflater;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        f0.m(layoutInflaterFrom);
        return layoutInflaterFrom;
    }

    @e
    public static final Object e(@d WindowManager windowManager, @e View view, @d WindowManager.LayoutParams layoutParams) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{windowManager, view, layoutParams}, null, changeQuickRedirect, true, bb.c.e.f31796g1, new Class[]{WindowManager.class, View.class, WindowManager.LayoutParams.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        f0.p(windowManager, "<this>");
        f0.p(layoutParams, "layoutParams");
        if (view != null) {
            try {
                windowManager.addView(view, layoutParams);
            } catch (Exception unused) {
                return b2.f124493a;
            }
        } else {
            view = null;
        }
        return view;
    }

    @e
    public static final Object f(@d WindowManager windowManager, @e View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{windowManager, view}, null, changeQuickRedirect, true, bb.c.e.f31779f1, new Class[]{WindowManager.class, View.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        f0.p(windowManager, "<this>");
        if (view != null) {
            try {
                windowManager.removeViewImmediate(view);
            } catch (Exception unused) {
                return b2.f124493a;
            }
        } else {
            view = null;
        }
        return view;
    }

    @e
    public static final Object g(@d WindowManager windowManager, @e View view, @d WindowManager.LayoutParams layoutParams) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{windowManager, view, layoutParams}, null, changeQuickRedirect, true, bb.c.e.f31813h1, new Class[]{WindowManager.class, View.class, WindowManager.LayoutParams.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        f0.p(windowManager, "<this>");
        f0.p(layoutParams, "layoutParams");
        if (view != null) {
            try {
                windowManager.updateViewLayout(view, layoutParams);
            } catch (Exception unused) {
                return b2.f124493a;
            }
        } else {
            view = null;
        }
        return view;
    }

    public static final int h(@d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.e.f31711b1, new Class[]{Context.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(context, "<this>");
        return t.p(context);
    }

    @d
    public static final WindowManager i(@d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.e.Y0, new Class[]{Context.class}, WindowManager.class);
        if (patchProxyResultProxy.isSupported) {
            return (WindowManager) patchProxyResultProxy.result;
        }
        f0.p(context, "<this>");
        Object systemService = context.getSystemService("window");
        f0.n(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        return (WindowManager) systemService;
    }

    @d
    public static final WindowManager j(@d View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.f31762e1, new Class[]{View.class}, WindowManager.class);
        if (patchProxyResultProxy.isSupported) {
            return (WindowManager) patchProxyResultProxy.result;
        }
        f0.p(view, "<this>");
        Context context = view.getContext();
        f0.o(context, "getContext(...)");
        return i(context);
    }
}
