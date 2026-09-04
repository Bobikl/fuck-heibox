package com.scwang.smartrefresh.layout.util;

import android.content.res.Resources;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.annotation.n0;
import androidx.core.view.f1;
import androidx.core.view.t0;
import androidx.core.view.x0;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: compiled from: SmartUtil.java */
/* JADX INFO: loaded from: classes8.dex */
public class b implements Interpolator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f96793b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f96794c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static float f96795d = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f96796e = 8.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f96797f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f96798g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f96799a;

    static {
        float fL = 1.0f / l(1.0f);
        f96797f = fL;
        f96798g = 1.0f - (fL * l(1.0f));
    }

    public b(int i10) {
        this.f96799a = i10;
    }

    public static boolean a(@n0 View view, PointF pointF, boolean z10) {
        if (c(view, 1) && view.getVisibility() == 0) {
            return false;
        }
        if ((view instanceof ViewGroup) && pointF != null && !g(view)) {
            ViewGroup viewGroup = (ViewGroup) view;
            PointF pointF2 = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount - 1);
                if (h(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    if ("fixed".equals(childAt.getTag()) || "fixed-top".equals(childAt.getTag())) {
                        return false;
                    }
                    pointF.offset(pointF2.x, pointF2.y);
                    boolean zA = a(childAt, pointF, z10);
                    pointF.offset(-pointF2.x, -pointF2.y);
                    return zA;
                }
            }
        }
        return z10 || c(view, -1);
    }

    public static boolean b(@n0 View view, PointF pointF) {
        if (c(view, -1) && view.getVisibility() == 0) {
            return false;
        }
        if (!(view instanceof ViewGroup) || pointF == null) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        PointF pointF2 = new PointF();
        for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount - 1);
            if (h(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                if ("fixed".equals(childAt.getTag()) || "fixed-bottom".equals(childAt.getTag())) {
                    return false;
                }
                pointF.offset(pointF2.x, pointF2.y);
                boolean zB = b(childAt, pointF);
                pointF.offset(-pointF2.x, -pointF2.y);
                return zB;
            }
        }
        return true;
    }

    public static boolean c(@n0 View view, int i10) {
        return view.canScrollVertically(i10);
    }

    public static int d(float f10) {
        return (int) ((f10 * f96795d) + 0.5f);
    }

    public static void e(View view, int i10) {
        if (view instanceof ScrollView) {
            ((ScrollView) view).fling(i10);
            return;
        }
        if (view instanceof AbsListView) {
            ((AbsListView) view).fling(i10);
            return;
        }
        if (view instanceof WebView) {
            ((WebView) view).flingScroll(0, i10);
        } else if (view instanceof NestedScrollView) {
            ((NestedScrollView) view).o(i10);
        } else if (view instanceof RecyclerView) {
            ((RecyclerView) view).fling(0, i10);
        }
    }

    public static boolean f(View view) {
        return g(view) || (view instanceof ViewPager) || (view instanceof x0);
    }

    public static boolean g(View view) {
        return (view instanceof AbsListView) || (view instanceof ScrollView) || (view instanceof f1) || (view instanceof WebView) || (view instanceof t0);
    }

    public static boolean h(@n0 View view, @n0 View view2, float f10, float f11, PointF pointF) {
        if (view2.getVisibility() != 0) {
            return false;
        }
        float[] fArr = {f10, f11};
        fArr[0] = (view.getScrollX() - view2.getLeft()) + f10;
        float scrollY = fArr[1] + (view.getScrollY() - view2.getTop());
        fArr[1] = scrollY;
        float f12 = fArr[0];
        boolean z10 = f12 >= 0.0f && scrollY >= 0.0f && f12 < ((float) view2.getWidth()) && fArr[1] < ((float) view2.getHeight());
        if (z10 && pointF != null) {
            pointF.set(fArr[0] - f10, fArr[1] - f11);
        }
        return z10;
    }

    public static int i(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i10 = layoutParams.height;
        view.measure(childMeasureSpec, i10 > 0 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    public static float j(int i10) {
        return i10 / f96795d;
    }

    public static void k(@n0 AbsListView absListView, int i10) {
        absListView.scrollListBy(i10);
    }

    private static float l(float f10) {
        float f11 = f10 * 8.0f;
        return f11 < 1.0f ? f11 - (1.0f - ((float) Math.exp(-f11))) : ((1.0f - ((float) Math.exp(1.0f - f11))) * 0.63212055f) + 0.36787945f;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (this.f96799a == f96794c) {
            float f11 = 1.0f - f10;
            return 1.0f - (f11 * f11);
        }
        float fL = f96797f * l(f10);
        return fL > 0.0f ? fL + f96798g : fL;
    }
}
