package com.billy.android.swipe.internal;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.widget.AbsListView;

/* JADX INFO: compiled from: ViewCompat.java */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f40503a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f40504b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f40505c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f40506d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f40507e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static ThreadLocal<Rect> f40508f;

    public static boolean a(AbsListView absListView, int i10) {
        return absListView.canScrollList(i10);
    }

    private static void b(View view, int i10) {
        view.offsetLeftAndRight(i10);
        if (view.getVisibility() == 0) {
            j(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                j((View) parent);
            }
        }
    }

    private static void c(View view, int i10) {
        view.offsetTopAndBottom(i10);
        if (view.getVisibility() == 0) {
            j(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                j((View) parent);
            }
        }
    }

    public static int d(int i10, int i11) {
        return Gravity.getAbsoluteGravity(i10, i11);
    }

    private static Rect e() {
        if (f40508f == null) {
            f40508f = new ThreadLocal<>();
        }
        Rect rect = f40508f.get();
        if (rect == null) {
            rect = new Rect();
            f40508f.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static int f(View view) {
        return view.getLayoutDirection();
    }

    public static void g(View view, int i10) {
        if (view == null || i10 == 0) {
            return;
        }
        view.offsetLeftAndRight(i10);
    }

    public static void h(View view, int i10) {
        if (view == null || i10 == 0) {
            return;
        }
        view.offsetTopAndBottom(i10);
    }

    public static void i(View view) {
        view.postInvalidateOnAnimation();
    }

    private static void j(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
}
