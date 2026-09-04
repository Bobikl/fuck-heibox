package com.google.android.material.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;

/* JADX INFO: compiled from: DescendantOffsetUtils.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<Matrix> f54488a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<RectF> f54489b = new ThreadLocal<>();

    public static void a(@n0 ViewGroup viewGroup, @n0 View view, @n0 Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        c(viewGroup, view, rect);
    }

    private static void b(ViewParent viewParent, @n0 View view, @n0 Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            b(viewParent, view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }

    public static void c(@n0 ViewGroup viewGroup, @n0 View view, @n0 Rect rect) {
        ThreadLocal<Matrix> threadLocal = f54488a;
        Matrix matrix = threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        b(viewGroup, view, matrix);
        ThreadLocal<RectF> threadLocal2 = f54489b;
        RectF rectF = threadLocal2.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
