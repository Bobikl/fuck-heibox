package ye;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AndroidSystemUtil.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f141789a = new a();
    public static ChangeQuickRedirect changeQuickRedirect;

    private a() {
    }

    @e
    public final Activity a(@e Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.m.op, new Class[]{Context.class}, Activity.class);
        if (patchProxyResultProxy.isSupported) {
            return (Activity) patchProxyResultProxy.result;
        }
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @e
    public final AppCompatActivity b(@e Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.m.np, new Class[]{Context.class}, AppCompatActivity.class);
        if (patchProxyResultProxy.isSupported) {
            return (AppCompatActivity) patchProxyResultProxy.result;
        }
        if (context == null) {
            return null;
        }
        if (context instanceof AppCompatActivity) {
            return (AppCompatActivity) context;
        }
        if (context instanceof androidx.appcompat.view.d) {
            return b(((androidx.appcompat.view.d) context).getBaseContext());
        }
        return null;
    }

    @e
    public final LifecycleCoroutineScope c(@e Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.m.pp, new Class[]{Context.class}, LifecycleCoroutineScope.class);
        if (patchProxyResultProxy.isSupported) {
            return (LifecycleCoroutineScope) patchProxyResultProxy.result;
        }
        if (context == 0) {
            return null;
        }
        if (context instanceof AppCompatActivity) {
            return z.a((y) context);
        }
        if (context instanceof Fragment) {
            y viewLifecycleOwner = ((Fragment) context).getViewLifecycleOwner();
            f0.o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            return z.a(viewLifecycleOwner);
        }
        if (context instanceof y) {
            return z.a((y) context);
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final int d(@e Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.m.mp, new Class[]{Context.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (b(context) != null) {
            AppCompatActivity appCompatActivityB = b(context);
            if (appCompatActivityB != null) {
                return appCompatActivityB.getRequestedOrientation();
            }
            return 0;
        }
        Activity activityA = a(context);
        if (activityA != null) {
            return activityA.getRequestedOrientation();
        }
        return 0;
    }

    public final void e(@e Context context, int i10) {
        if (PatchProxy.proxy(new Object[]{context, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.lp, new Class[]{Context.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (b(context) != null) {
            AppCompatActivity appCompatActivityB = b(context);
            if (appCompatActivityB == null) {
                return;
            }
            appCompatActivityB.setRequestedOrientation(i10);
            return;
        }
        Activity activityA = a(context);
        if (activityA == null) {
            return;
        }
        activityA.setRequestedOrientation(i10);
    }
}
