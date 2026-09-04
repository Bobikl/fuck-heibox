package com.max.hbcustomview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.b1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.j1;
import androidx.core.view.t0;
import androidx.core.view.u0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes10.dex */
public class NestedScrollCoordinatorLayout extends CoordinatorLayout implements t0 {
    private static final String I = NestedScrollCoordinatorLayout.class.getSimpleName();
    public static final int J = 0;
    public static final int K = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private u0 G;
    private DummyBehavior H;

    public static class DummyBehavior<DummyView extends View> extends CoordinatorLayout.Behavior<DummyView> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f68546f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int[] f68547g = new int[2];

        DummyBehavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean E(@n0 CoordinatorLayout coordinatorLayout, @n0 DummyView dummyview, @n0 View view, @n0 View view2, int i10, int i11) {
            Object[] objArr = {coordinatorLayout, dummyview, view, view2, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32373k8, new Class[]{CoordinatorLayout.class, View.class, View.class, View.class, cls, cls}, Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : ((NestedScrollCoordinatorLayout) coordinatorLayout).startNestedScroll(i10);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void G(@n0 CoordinatorLayout coordinatorLayout, @n0 DummyView dummyview, @n0 View view, int i10) {
            if (PatchProxy.proxy(new Object[]{coordinatorLayout, dummyview, view, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32396l8, new Class[]{CoordinatorLayout.class, View.class, View.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            ((NestedScrollCoordinatorLayout) coordinatorLayout).stopNestedScroll();
        }

        void J(int i10) {
            this.f68546f = i10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean s(@n0 CoordinatorLayout coordinatorLayout, @n0 DummyView dummyview, @n0 View view, float f10, float f11) {
            Object[] objArr = {coordinatorLayout, dummyview, view, new Float(f10), new Float(f11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Float.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32442n8, new Class[]{CoordinatorLayout.class, View.class, View.class, cls, cls}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            boolean zDispatchNestedPreFling = ((NestedScrollCoordinatorLayout) coordinatorLayout).dispatchNestedPreFling(f10, f11);
            if (this.f68546f == 1) {
                return zDispatchNestedPreFling;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void u(@n0 CoordinatorLayout coordinatorLayout, @n0 DummyView dummyview, @n0 View view, int i10, int i11, @n0 int[] iArr, int i12) {
            Object[] objArr = {coordinatorLayout, dummyview, view, new Integer(i10), new Integer(i11), iArr, new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32419m8, new Class[]{CoordinatorLayout.class, View.class, View.class, cls, cls, int[].class, cls}, Void.TYPE).isSupported) {
                return;
            }
            NestedScrollCoordinatorLayout nestedScrollCoordinatorLayout = (NestedScrollCoordinatorLayout) coordinatorLayout;
            int i13 = this.f68546f;
            if (i13 == 1) {
                nestedScrollCoordinatorLayout.dispatchNestedPreScroll(i10, i11, iArr, null);
            } else if (i13 == 0) {
                int[] iArr2 = this.f68547g;
                iArr2[0] = iArr[0];
                iArr2[1] = iArr[1];
                nestedScrollCoordinatorLayout.dispatchNestedPreScroll(i10, i11, iArr2, null);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public NestedScrollCoordinatorLayout(Context context) {
        super(context);
        b0();
    }

    public NestedScrollCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b0();
    }

    public NestedScrollCoordinatorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b0();
    }

    private void b0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Z7, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.G = new u0(this);
        setNestedScrollingEnabled(true);
        View view = new View(getContext());
        this.H = new DummyBehavior();
        j1.N1(view, j1.R(this));
        view.setFitsSystemWindows(false);
        CoordinatorLayout.f fVar = new CoordinatorLayout.f(-1, -1);
        fVar.q(this.H);
        addView(view, fVar);
    }

    @Override // android.view.View, androidx.core.view.t0
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        Object[] objArr = {new Float(f10), new Float(f11), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        Class cls2 = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32327i8, new Class[]{cls, cls, cls2}, cls2);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.G.a(f10, f11, z10);
    }

    @Override // android.view.View, androidx.core.view.t0
    public boolean dispatchNestedPreFling(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32350j8, new Class[]{cls, cls}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.G.b(f10, f11);
    }

    @Override // android.view.View, androidx.core.view.t0
    public boolean dispatchNestedPreScroll(int i10, int i11, @b1(2) @p0 int[] iArr, @b1(2) @p0 int[] iArr2) {
        Object[] objArr = {new Integer(i10), new Integer(i11), iArr, iArr2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32304h8, new Class[]{cls, cls, int[].class, int[].class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.G.c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.t0
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, @b1(2) @p0 int[] iArr) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13), iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32281g8, new Class[]{cls, cls, cls, cls, int[].class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.G.f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View, androidx.core.view.t0
    public boolean hasNestedScrollingParent() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32258f8, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.G.k();
    }

    @Override // android.view.View, androidx.core.view.t0
    public boolean isNestedScrollingEnabled() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32188c8, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.G.m();
    }

    @Override // android.view.View, androidx.core.view.t0
    public void setNestedScrollingEnabled(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.f32165b8, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.G.p(z10);
    }

    public void setPassMode(int i10) {
        DummyBehavior dummyBehavior;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32142a8, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (dummyBehavior = this.H) == null) {
            return;
        }
        dummyBehavior.J(i10);
    }

    @Override // android.view.View, androidx.core.view.t0
    public boolean startNestedScroll(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32212d8, new Class[]{Integer.TYPE}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.G.r(i10);
    }

    @Override // android.view.View, androidx.core.view.t0
    public void stopNestedScroll() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32235e8, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.G.t();
    }
}
