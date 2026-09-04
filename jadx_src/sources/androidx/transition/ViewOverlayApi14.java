package androidx.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.RestrictTo;
import androidx.core.view.j1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class ViewOverlayApi14 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected OverlayViewGroup f27796a;

    public static class OverlayViewGroup extends ViewGroup {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static Method f27797g;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ViewGroup f27798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        View f27799c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ArrayList<Drawable> f27800d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ViewOverlayApi14 f27801e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f27802f;

        static {
            try {
                Class cls = Integer.TYPE;
                f27797g = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        OverlayViewGroup(Context context, ViewGroup viewGroup, View view, ViewOverlayApi14 viewOverlayApi14) {
            super(context);
            this.f27800d = null;
            this.f27798b = viewGroup;
            this.f27799c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f27801e = viewOverlayApi14;
        }

        private void c() {
            if (this.f27802f) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        private void d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f27800d;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f27802f = true;
                    this.f27798b.removeView(this);
                }
            }
        }

        private void e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f27798b.getLocationOnScreen(iArr2);
            this.f27799c.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public void a(Drawable drawable) {
            c();
            if (this.f27800d == null) {
                this.f27800d = new ArrayList<>();
            }
            if (this.f27800d.contains(drawable)) {
                return;
            }
            this.f27800d.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }

        public void b(View view) {
            c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.f27798b && viewGroup.getParent() != null && j1.O0(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f27798b.getLocationOnScreen(iArr2);
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
            this.f27798b.getLocationOnScreen(iArr);
            this.f27799c.getLocationOnScreen(iArr2);
            canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
            canvas.clipRect(new Rect(0, 0, this.f27799c.getWidth(), this.f27799c.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f27800d;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f27800d.get(i10).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected ViewParent f(int i10, int i11, Rect rect) {
            if (this.f27798b == null || f27797g == null) {
                return null;
            }
            try {
                e(new int[2]);
                f27797g.invoke(this.f27798b, Integer.valueOf(i10), Integer.valueOf(i11), rect);
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
            ArrayList<Drawable> arrayList = this.f27800d;
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
            if (this.f27798b == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f27798b == null) {
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
        public void invalidateDrawable(@androidx.annotation.n0 Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        }

        @Override // android.view.View
        protected boolean verifyDrawable(@androidx.annotation.n0 Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.f27800d) != null && arrayList.contains(drawable));
        }
    }

    ViewOverlayApi14(Context context, ViewGroup viewGroup, View view) {
        this.f27796a = new OverlayViewGroup(context, viewGroup, view, this);
    }

    static ViewOverlayApi14 e(View view) {
        ViewGroup viewGroupF = f(view);
        if (viewGroupF == null) {
            return null;
        }
        int childCount = viewGroupF.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroupF.getChildAt(i10);
            if (childAt instanceof OverlayViewGroup) {
                return ((OverlayViewGroup) childAt).f27801e;
            }
        }
        return new c0(viewGroupF.getContext(), viewGroupF, view);
    }

    static ViewGroup f(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    @Override // androidx.transition.k0
    public void a(@androidx.annotation.n0 Drawable drawable) {
        this.f27796a.g(drawable);
    }

    @Override // androidx.transition.k0
    public void b(@androidx.annotation.n0 Drawable drawable) {
        this.f27796a.a(drawable);
    }
}
