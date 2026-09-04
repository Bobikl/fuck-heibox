package ic;

import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ViewUtil.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final a f119343a = new a();
    public static ChangeQuickRedirect changeQuickRedirect;

    private a() {
    }

    public static /* synthetic */ boolean h(a aVar, View view, int i10, int i11, Object obj) {
        Object[] objArr = {aVar, view, new Integer(i10), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.f.ov, new Class[]{a.class, View.class, cls, cls, Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if ((i11 & 2) != 0) {
            i10 = Integer.MIN_VALUE;
        }
        return aVar.g(view, i10);
    }

    private final boolean j(View view, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, new Integer(i10)}, this, changeQuickRedirect, false, c.f.pv, new Class[]{View.class, Integer.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return i10 == Integer.MIN_VALUE || iArr[1] + view.getMeasuredHeight() > i10;
    }

    public final int a(@d Context context, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Float(f10)}, this, changeQuickRedirect, false, c.f.gv, new Class[]{Context.class, Float.TYPE}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(context, "context");
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final int b(@d Context context, int i10) {
        Object[] objArr = {context, new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.hv, new Class[]{Context.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(context, "context");
        return (int) ((i10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final int c(@d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, c.f.lv, new Class[]{Context.class}, Integer.TYPE);
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

    public final int d(@d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, c.f.kv, new Class[]{Context.class}, Integer.TYPE);
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

    public final int e(@d View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, c.f.iv, new Class[]{View.class}, Integer.TYPE);
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

    public final int f(@d View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, c.f.jv, new Class[]{View.class}, Integer.TYPE);
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

    public final boolean g(@e View view, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, new Integer(i10)}, this, changeQuickRedirect, false, c.f.nv, new Class[]{View.class, Integer.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return view != null && view.getGlobalVisibleRect(new Rect()) && f119343a.j(view, i10);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    public final boolean i(@e View view) {
        boolean z10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, c.f.mv, new Class[]{View.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (view != null) {
            Rect rect = new Rect();
            boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
            int i10 = rect.top;
            if (i10 == 0 && rect.bottom == 0 && rect.left == 0 && rect.right == 0) {
                z10 = true;
            } else {
                boolean z11 = rect.bottom - i10 >= view.getMeasuredHeight();
                boolean z12 = rect.right - rect.left >= view.getMeasuredWidth();
                if (globalVisibleRect && z11 && z12) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                return true;
            }
        }
        return false;
    }
}
