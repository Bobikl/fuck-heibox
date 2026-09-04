package ye;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.h0;
import androidx.core.view.b4;
import androidx.core.view.g3;
import androidx.core.view.j1;
import androidx.core.view.n3;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: DisplayUtil.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final b f141790a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private static Handler f141791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f141792c;
    public static ChangeQuickRedirect changeQuickRedirect;

    private b() {
    }

    private final Window j(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.m.Dp, new Class[]{Context.class}, Window.class);
        if (patchProxyResultProxy.isSupported) {
            return (Window) patchProxyResultProxy.result;
        }
        a aVar = a.f141789a;
        if (aVar.b(context) != null) {
            AppCompatActivity appCompatActivityB = aVar.b(context);
            if (appCompatActivityB != null) {
                return appCompatActivityB.getWindow();
            }
            return null;
        }
        Activity activityA = aVar.a(context);
        if (activityA != null) {
            return activityA.getWindow();
        }
        return null;
    }

    private final void q() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.Ip, new Class[0], Void.TYPE).isSupported && f141791b == null) {
            if (!f0.g(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                Looper.prepare();
            }
            f141791b = new Handler();
        }
    }

    public final int a(@dl.d Context context, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Float(f10)}, this, changeQuickRedirect, false, bb.c.m.wp, new Class[]{Context.class, Float.TYPE}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(context, "context");
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @e
    public final Handler b() {
        return f141791b;
    }

    public final int c(@dl.d View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.m.rp, new Class[]{View.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(view, "view");
        n3 n3VarO0 = j1.o0(view);
        h0 h0VarF = n3VarO0 != null ? n3VarO0.f(n3.m.g()) : null;
        if (h0VarF != null) {
            return h0VarF.f20745d;
        }
        Context context = view.getContext();
        f0.o(context, "getContext(...)");
        return d(context);
    }

    public final int d(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.m.tp, new Class[]{Context.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(context, "context");
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    public final int e(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.m.zp, new Class[]{Context.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(context, "context");
        Object systemService = context.getSystemService("window");
        f0.n(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public final int f(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.m.yp, new Class[]{Context.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(context, "context");
        Object systemService = context.getSystemService("window");
        f0.n(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public final int g(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.m.qp, new Class[]{Context.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(context, "context");
        if (f141792c <= 0) {
            f141792c = context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
        }
        return f141792c;
    }

    public final int h(@dl.d View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.m.vp, new Class[]{View.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(view, "view");
        if (view.getHeight() > 0) {
            return view.getHeight();
        }
        if (view.getLayoutParams() != null && view.getLayoutParams().height > 0) {
            return view.getLayoutParams().height;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    public final int i(@dl.d View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.m.up, new Class[]{View.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(view, "view");
        if (view.getWidth() > 0) {
            return view.getWidth();
        }
        if (view.getLayoutParams() != null && view.getLayoutParams().width > 0) {
            return view.getLayoutParams().width;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredWidth();
    }

    public final void k(@dl.d Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, bb.c.m.Hp, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        Window window = activity.getWindow();
        g3.c(window, false);
        b4 b4VarA = g3.a(window, window.getDecorView());
        b4VarA.d(n3.m.h());
        b4VarA.j(2);
    }

    @SuppressLint({"RestrictedApi"})
    public final void l(@e Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.m.Bp, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        a aVar = a.f141789a;
        if (aVar.b(context) != null) {
            AppCompatActivity appCompatActivityB = aVar.b(context);
            ActionBar supportActionBar = appCompatActivityB != null ? appCompatActivityB.getSupportActionBar() : null;
            if (supportActionBar != null) {
                supportActionBar.t0(false);
                supportActionBar.B();
            }
        }
        Window windowJ = j(context);
        if (windowJ != null) {
            windowJ.setFlags(1024, 1024);
        }
    }

    public final void m(@dl.d Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, bb.c.m.Fp, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        Window window = activity.getWindow();
        g3.c(window, false);
        b4 b4VarA = g3.a(window, window.getDecorView());
        b4VarA.d(n3.m.i());
        b4VarA.j(2);
    }

    public final void n(@dl.d Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, bb.c.m.Ep, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        activity.getWindow().getDecorView().setSystemUiVisibility(bb.c.e.f31901m5);
    }

    public final int o(@dl.d Activity activity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, bb.c.m.Kp, new Class[]{Activity.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(activity, "activity");
        View decorView = activity.getWindow().getDecorView();
        f0.o(decorView, "getDecorView(...)");
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(bb.c.f.Sr);
        return systemUiVisibility;
    }

    public final void p(@dl.d Activity activity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{activity, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.Ap, new Class[]{Activity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        b4 b4VarB0 = j1.B0(activity.getWindow().getDecorView());
        if (b4VarB0 == null) {
            return;
        }
        b4VarB0.i(z10);
    }

    public final int r(@dl.d Context context, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Float(f10)}, this, changeQuickRedirect, false, bb.c.m.xp, new Class[]{Context.class, Float.TYPE}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(context, "context");
        return (int) ((f10 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void s(@e Handler handler) {
        f141791b = handler;
    }

    public final void t(@dl.d Activity activity, int i10) {
        if (PatchProxy.proxy(new Object[]{activity, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.sp, new Class[]{Activity.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        activity.getWindow().setStatusBarColor(i10);
    }

    public final void u(@e Window window) {
        if (PatchProxy.proxy(new Object[]{window}, this, changeQuickRedirect, false, bb.c.m.Jp, new Class[]{Window.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.m(window);
        window.setStatusBarColor(0);
        window.getDecorView().setSystemUiVisibility(1280);
    }

    @SuppressLint({"RestrictedApi"})
    public final void v(@e Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.m.Cp, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        a aVar = a.f141789a;
        if (aVar.b(context) != null) {
            AppCompatActivity appCompatActivityB = aVar.b(context);
            ActionBar supportActionBar = appCompatActivityB != null ? appCompatActivityB.getSupportActionBar() : null;
            if (supportActionBar != null) {
                supportActionBar.t0(false);
                supportActionBar.B0();
            }
        }
        Window windowJ = j(context);
        if (windowJ != null) {
            windowJ.clearFlags(1024);
        }
    }

    public final void w(@dl.d Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, bb.c.m.Gp, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        g3.c(activity.getWindow(), true);
        g3.a(activity.getWindow(), activity.getWindow().getDecorView()).k(n3.m.i());
    }
}
