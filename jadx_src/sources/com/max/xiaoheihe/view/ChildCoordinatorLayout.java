package com.max.xiaoheihe.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.j1;
import androidx.core.view.r0;
import androidx.core.view.u0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ChildCoordinatorLayout.kt */
/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class ChildCoordinatorLayout extends CoordinatorLayout implements r0 {
    public static final int H = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private u0 G;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @xh.i
    public ChildCoordinatorLayout(@dl.d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @xh.i
    public ChildCoordinatorLayout(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @xh.i
    public ChildCoordinatorLayout(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        b0();
    }

    public /* synthetic */ ChildCoordinatorLayout(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void b0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49384, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        u0 u0Var = new u0(this);
        this.G = u0Var;
        u0Var.p(true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.v0
    public void G(@dl.d View target, int i10, int i11, int i12, int i13, int i14) {
        Object[] objArr = {target, new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13), new Integer(i14)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49397, new Class[]{View.class, cls, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(target, "target");
        int[] iArr = {i, i};
        target.getLocationInWindow(iArr);
        int i15 = iArr[0];
        int i16 = iArr[1];
        super.G(target, i10, i11, i12, i13, i14);
        target.getLocationInWindow(iArr);
        int i17 = iArr[0] - i15;
        int i18 = iArr[1] - i16;
        dispatchNestedScroll(i10, i11, i12 + i17, i13 + i18, null, i14);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.v0
    public void O(@dl.d View target, int i10, int i11, @dl.d int[] consumed, int i12) {
        Object[] objArr = {target, new Integer(i10), new Integer(i11), consumed, new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49396, new Class[]{View.class, cls, cls, int[].class, cls}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(target, "target");
        f0.p(consumed, "consumed");
        dispatchNestedPreScroll(i10, i11, iArr, null, i12);
        consumed[0] = consumed[0] + iArr[0];
        consumed[1] = consumed[1] + iArr[1];
        int[] iArr = {0, 0};
        super.O(target, i10 - consumed[0], i11 - consumed[1], iArr, i12);
        consumed[0] = consumed[0] + iArr[0];
        consumed[1] = consumed[1] + iArr[1];
    }

    @Override // android.view.View, androidx.core.view.t0
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        Object[] objArr = {new Float(f10), new Float(f11), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        Class cls2 = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49393, new Class[]{cls, cls, cls2}, cls2);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        u0 u0Var = this.G;
        if (u0Var == null) {
            f0.S("childHelper");
            u0Var = null;
        }
        return u0Var.a(f10, f11, z10);
    }

    @Override // android.view.View, androidx.core.view.t0
    public boolean dispatchNestedPreFling(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49392, new Class[]{cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        u0 u0Var = this.G;
        if (u0Var == null) {
            f0.S("childHelper");
            u0Var = null;
        }
        return u0Var.b(f10, f11);
    }

    @Override // androidx.core.view.r0
    public boolean dispatchNestedPreScroll(int i10, int i11, @dl.e int[] iArr, @dl.e int[] iArr2, int i12) {
        Object[] objArr = {new Integer(i10), new Integer(i11), iArr, iArr2, new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49391, new Class[]{cls, cls, int[].class, int[].class, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        u0 u0Var = this.G;
        if (u0Var == null) {
            f0.S("childHelper");
            u0Var = null;
        }
        return u0Var.d(i10, i11, iArr, iArr2, i12);
    }

    @Override // androidx.core.view.r0
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, @dl.e int[] iArr, int i14) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13), iArr, new Integer(i14)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49390, new Class[]{cls, cls, cls, cls, int[].class, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        u0 u0Var = this.G;
        if (u0Var == null) {
            f0.S("childHelper");
            u0Var = null;
        }
        return u0Var.g(i10, i11, i12, i13, iArr, i14);
    }

    @Override // androidx.core.view.r0
    public boolean hasNestedScrollingParent(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49389, new Class[]{Integer.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        u0 u0Var = this.G;
        if (u0Var == null) {
            f0.S("childHelper");
            u0Var = null;
        }
        return u0Var.k();
    }

    @Override // android.view.View, androidx.core.view.t0
    public boolean isNestedScrollingEnabled() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49386, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        u0 u0Var = this.G;
        if (u0Var == null) {
            f0.S("childHelper");
            u0Var = null;
        }
        return u0Var.m();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.v0
    public boolean j0(@dl.d View child, @dl.d View target, int i10, int i11) {
        Object[] objArr = {child, target, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49394, new Class[]{View.class, View.class, cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(child, "child");
        f0.p(target, "target");
        if (i11 == 0) {
            stopNestedScroll(1);
            j1.H2(child, 1);
        }
        return startNestedScroll(i10, i11) || super.j0(child, target, i10, i11);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.v0
    public void k(@dl.d View target, int i10) {
        if (PatchProxy.proxy(new Object[]{target, new Integer(i10)}, this, changeQuickRedirect, false, 49395, new Class[]{View.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(target, "target");
        super.k(target, i10);
        stopNestedScroll(i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public boolean onNestedFling(@dl.d View target, float f10, float f11, boolean z10) {
        Object[] objArr = {target, new Float(f10), new Float(f11), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        Class cls2 = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49399, new Class[]{View.class, cls, cls, cls2}, cls2);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(target, "target");
        return dispatchNestedFling(f10, f11, z10) || super.onNestedFling(target, f10, f11, z10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public boolean onNestedPreFling(@dl.d View target, float f10, float f11) {
        Object[] objArr = {target, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49398, new Class[]{View.class, cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(target, "target");
        return dispatchNestedPreFling(f10, f11) || super.onNestedPreFling(target, f10, f11);
    }

    @Override // android.view.View, androidx.core.view.t0
    public void setNestedScrollingEnabled(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 49385, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        u0 u0Var = this.G;
        if (u0Var == null) {
            f0.S("childHelper");
            u0Var = null;
        }
        u0Var.p(z10);
    }

    @Override // androidx.core.view.r0
    public boolean startNestedScroll(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49387, new Class[]{cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        u0 u0Var = this.G;
        if (u0Var == null) {
            f0.S("childHelper");
            u0Var = null;
        }
        return u0Var.s(i10, i11);
    }

    @Override // androidx.core.view.r0
    public void stopNestedScroll(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49388, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        u0 u0Var = this.G;
        if (u0Var == null) {
            f0.S("childHelper");
            u0Var = null;
        }
        u0Var.u(i10);
    }
}
