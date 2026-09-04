package com.billy.android.swipe;

import android.app.Activity;
import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: SmartSwipe.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f40311a;

    /* JADX INFO: compiled from: SmartSwipe.java */
    public interface a {
        SmartSwipeWrapper a(Context context);
    }

    static {
        try {
            if (g("com.billy.android.swipe.androidx.WrapperFactory")) {
                return;
            }
            g("com.billy.android.swipe.support.WrapperFactory");
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private static SmartSwipeWrapper a(Context context) {
        SmartSwipeWrapper smartSwipeWrapperA;
        a aVar = f40311a;
        return (aVar == null || (smartSwipeWrapperA = aVar.a(context)) == null) ? new SmartSwipeWrapper(context) : smartSwipeWrapperA;
    }

    public static int b(int i10, Context context) {
        return (int) TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    private static void c(SmartSwipeWrapper smartSwipeWrapper, boolean z10, int i10) {
        if (smartSwipeWrapper != null) {
            smartSwipeWrapper.enableDirection(i10, z10);
        }
    }

    public static double d(double d10, double d11, double d12) {
        return Math.max(d11, Math.min(d10, d12));
    }

    public static float e(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static int f(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    private static boolean g(String str) {
        try {
            Object objNewInstance = Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(objNewInstance instanceof a)) {
                return true;
            }
            j((a) objNewInstance);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static SmartSwipeWrapper h(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        for (View viewFindViewById = decorView.findViewById(android.R.id.content); viewFindViewById != null && viewFindViewById != decorView; viewFindViewById = (View) viewFindViewById.getParent()) {
            if (viewFindViewById.getParent() instanceof SmartSwipeWrapper) {
                return (SmartSwipeWrapper) viewFindViewById.getParent();
            }
        }
        return null;
    }

    public static SmartSwipeWrapper i(View view) {
        if (view.getParent() instanceof SmartSwipeWrapper) {
            return (SmartSwipeWrapper) view.getParent();
        }
        return null;
    }

    public static void j(a aVar) {
        f40311a = aVar;
    }

    public static void k(Activity activity, boolean z10, int i10) {
        c(h(activity), z10, i10);
    }

    public static void l(View view, boolean z10, int i10) {
        c(i(view), z10, i10);
    }

    public static SmartSwipeWrapper m(Activity activity) {
        SmartSwipeWrapper smartSwipeWrapperH = h(activity);
        if (smartSwipeWrapperH != null) {
            return smartSwipeWrapperH;
        }
        View decorView = activity.getWindow().getDecorView();
        if (decorView instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) decorView;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.findViewById(android.R.id.content) != null) {
                    return o(childAt);
                }
            }
        }
        return o(decorView.findViewById(android.R.id.content));
    }

    public static SmartSwipeWrapper n(Activity activity, int i10) {
        View viewFindViewById;
        if (activity == null || (viewFindViewById = activity.findViewById(i10)) == null) {
            return null;
        }
        return o(viewFindViewById);
    }

    public static SmartSwipeWrapper o(View view) {
        SmartSwipeWrapper smartSwipeWrapperA;
        SmartSwipeWrapper smartSwipeWrapperI = i(view);
        if (smartSwipeWrapperI != null) {
            return smartSwipeWrapperI;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (view.getParent() != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            smartSwipeWrapperA = a(view.getContext());
            int iIndexOfChild = viewGroup.indexOfChild(view);
            viewGroup.removeView(view);
            viewGroup.addView(smartSwipeWrapperA, iIndexOfChild, layoutParams);
        } else {
            smartSwipeWrapperA = a(view.getContext());
            if (layoutParams != null) {
                smartSwipeWrapperA.setLayoutParams(layoutParams);
            }
        }
        smartSwipeWrapperA.setContentView(view);
        return smartSwipeWrapperA;
    }
}
