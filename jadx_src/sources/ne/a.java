package ne;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.j1;
import androidx.core.view.n;
import com.max.mediaselector.lib.utils.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: ImmersiveManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f132074a = "TAG_FAKE_STATUS_BAR_VIEW";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f132075b = "TAG_MARGIN_ADDED";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f132076c = "TAG_NAVIGATION_BAR_VIEW";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void a(AppCompatActivity appCompatActivity, int i10, int i11, boolean z10) {
        Object[] objArr = {appCompatActivity, new Integer(i10), new Integer(i11), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.f34781i, new Class[]{AppCompatActivity.class, cls, cls, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        b(appCompatActivity, false, false, i10, i11, z10);
    }

    public static void b(AppCompatActivity appCompatActivity, boolean z10, boolean z11, int i10, int i11, boolean z12) {
        boolean z13 = true;
        Object[] objArr = {appCompatActivity, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i10), new Integer(i11), new Byte(z12 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        Class cls2 = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.f34804j, new Class[]{AppCompatActivity.class, cls, cls, cls2, cls2, cls}, Void.TYPE).isSupported) {
            return;
        }
        try {
            Window window = appCompatActivity.getWindow();
            if (z10 && z11) {
                window.clearFlags(201326592);
                b.e(appCompatActivity, true, true, i10 == 0, z12);
                window.addFlags(Integer.MIN_VALUE);
            } else if (!z10 && !z11) {
                window.requestFeature(1);
                window.clearFlags(201326592);
                if (i10 != 0) {
                    z13 = false;
                }
                b.e(appCompatActivity, false, false, z13, z12);
                window.addFlags(Integer.MIN_VALUE);
            } else {
                if (z10) {
                    return;
                }
                window.requestFeature(1);
                window.clearFlags(201326592);
                b.e(appCompatActivity, false, true, i10 == 0, z12);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setStatusBarColor(i10);
            window.setNavigationBarColor(i11);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static void c(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, bb.c.m.f34850l, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        Window window = activity.getWindow();
        window.addFlags(67108864);
        e(activity);
        if (h.l(activity)) {
            window.addFlags(134217728);
            d(activity);
        }
    }

    private static void d(Activity activity) {
        FrameLayout.LayoutParams layoutParams;
        if (PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, bb.c.m.f34896n, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        Window window = activity.getWindow();
        View viewFindViewWithTag = window.getDecorView().findViewWithTag(f132076c);
        if (viewFindViewWithTag == null) {
            viewFindViewWithTag = new View(activity);
            viewFindViewWithTag.setTag(f132076c);
            ((ViewGroup) window.getDecorView()).addView(viewFindViewWithTag);
        }
        if (h.m(activity)) {
            layoutParams = new FrameLayout.LayoutParams(-1, h.c(activity));
            layoutParams.gravity = 80;
        } else {
            layoutParams = new FrameLayout.LayoutParams(h.d(activity), -1);
            layoutParams.gravity = n.f21702c;
        }
        viewFindViewWithTag.setLayoutParams(layoutParams);
        viewFindViewWithTag.setBackgroundColor(0);
        viewFindViewWithTag.setVisibility(0);
    }

    private static void e(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, bb.c.m.f34873m, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        Window window = activity.getWindow();
        View viewFindViewWithTag = window.getDecorView().findViewWithTag(f132074a);
        if (viewFindViewWithTag == null) {
            viewFindViewWithTag = new View(activity);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, h.j(activity));
            layoutParams.gravity = 48;
            viewFindViewWithTag.setLayoutParams(layoutParams);
            viewFindViewWithTag.setVisibility(0);
            viewFindViewWithTag.setTag(f132075b);
            ((ViewGroup) window.getDecorView()).addView(viewFindViewWithTag);
        }
        viewFindViewWithTag.setBackgroundColor(0);
    }

    public static void f(Activity activity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{activity, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.m.f34827k, new Class[]{Activity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Window window = activity.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.clearFlags(67108864);
        window.setStatusBarColor(0);
        View decorView = window.getDecorView();
        if (z10) {
            decorView.setSystemUiVisibility(bb.c.k.ou);
        } else {
            window.getDecorView().setSystemUiVisibility(1280);
        }
        View childAt = ((ViewGroup) window.findViewById(R.id.content)).getChildAt(0);
        if (childAt != null) {
            childAt.setFitsSystemWindows(false);
            j1.v1(childAt);
        }
    }
}
