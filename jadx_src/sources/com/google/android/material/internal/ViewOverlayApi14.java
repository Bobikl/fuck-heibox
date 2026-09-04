package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.core.view.j1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class ViewOverlayApi14 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected OverlayViewGroup f54414a;

    @SuppressLint({"ViewConstructor", "PrivateApi"})
    public static class OverlayViewGroup extends ViewGroup {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static Method f54415g;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ViewGroup f54416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        View f54417c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ArrayList<Drawable> f54418d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ViewOverlayApi14 f54419e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f54420f;

        static {
            try {
                Class cls = Integer.TYPE;
                f54415g = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        OverlayViewGroup(Context context, ViewGroup viewGroup, View view, ViewOverlayApi14 viewOverlayApi14) {
            super(context);
            this.f54418d = null;
            this.f54416b = viewGroup;
            this.f54417c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f54419e = viewOverlayApi14;
        }

        private void c() {
            if (this.f54420f) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        private void d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f54418d;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f54420f = true;
                    this.f54416b.removeView(this);
                }
            }
        }

        private void e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f54416b.getLocationOnScreen(iArr2);
            this.f54417c.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public void a(Drawable drawable) {
            c();
            if (this.f54418d == null) {
                this.f54418d = new ArrayList<>();
            }
            if (this.f54418d.contains(drawable)) {
                return;
            }
            this.f54418d.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }

        public void b(View view) {
            c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.f54416b && viewGroup.getParent() != null && j1.O0(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f54416b.getLocationOnScreen(iArr2);
                    j1.e1(view, iArr[0] - iArr2[0]);
                    j1.f1(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f54416b.getLocationOnScreen(iArr);
            this.f54417c.getLocationOnScreen(iArr2);
            canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
            canvas.clipRect(new Rect(0, 0, this.f54417c.getWidth(), this.f54417c.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f54418d;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f54418d.get(i10).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected ViewParent f(int i10, int i11, Rect rect) {
            if (this.f54416b == null || f54415g == null) {
                return null;
            }
            try {
                e(new int[2]);
                f54415g.invoke(this.f54416b, Integer.valueOf(i10), Integer.valueOf(i11), rect);
                return null;
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
                return null;
            } catch (InvocationTargetException e11) {
                e11.printStackTrace();
                return null;
            }
        }

        public void g(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f54418d;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                d();
            }
        }

        public void h(View view) {
            super.removeView(view);
            d();
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f54416b == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f54416b == null) {
                invalidate(rect);
                return null;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            int[] iArr2 = new int[2];
            e(iArr2);
            rect.offset(iArr2[0], iArr2[1]);
            return super.invalidateChildInParent(iArr, rect);
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@n0 Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        }

        @Override // android.view.View
        protected boolean verifyDrawable(@n0 Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.f54418d) != null && arrayList.contains(drawable));
        }
    }

    ViewOverlayApi14(Context context, ViewGroup viewGroup, View view) {
        this.f54414a = new OverlayViewGroup(context, viewGroup, view, this);
    }

    static ViewOverlayApi14 e(View view) {
        ViewGroup viewGroupJ = j0.j(view);
        if (viewGroupJ == null) {
            return null;
        }
        int childCount = viewGroupJ.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroupJ.getChildAt(i10);
            if (childAt instanceof OverlayViewGroup) {
                return ((OverlayViewGroup) childAt).f54419e;
            }
        }
        return new e0(viewGroupJ.getContext(), viewGroupJ, view);
    }

    @Override // com.google.android.material.internal.i0
    public void a(@n0 Drawable drawable) {
        this.f54414a.g(drawable);
    }

    @Override // com.google.android.material.internal.i0
    public void b(@n0 Drawable drawable) {
        this.f54414a.a(drawable);
    }
}
