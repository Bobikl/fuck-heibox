package com.max.xiaoheihe.module.account.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes9.dex */
public class SVBehavior extends AppBarLayout.Behavior {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f79290z;

    public SVBehavior() {
        this.f79290z = true;
    }

    public SVBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f79290z = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public /* bridge */ /* synthetic */ boolean D(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{coordinatorLayout, view, view2, view3, new Integer(i10)}, this, changeQuickRedirect, false, 25424, new Class[]{CoordinatorLayout.class, View.class, View.class, View.class, Integer.TYPE}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : S0(coordinatorLayout, (AppBarLayout) view, view2, view3, i10);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.Behavior, com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public /* bridge */ /* synthetic */ boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{coordinatorLayout, view, motionEvent}, this, changeQuickRedirect, false, 25422, new Class[]{CoordinatorLayout.class, View.class, MotionEvent.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : T0(coordinatorLayout, (AppBarLayout) view, motionEvent);
    }

    public void R0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13) {
        Object[] objArr = {coordinatorLayout, appBarLayout, view, new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (!PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 25420, new Class[]{CoordinatorLayout.class, AppBarLayout.class, View.class, cls, cls, cls, cls}, Void.TYPE).isSupported && this.f79290z) {
            super.v(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13);
        }
    }

    public boolean S0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{coordinatorLayout, appBarLayout, view, view2, new Integer(i10)}, this, changeQuickRedirect, false, 25419, new Class[]{CoordinatorLayout.class, AppBarLayout.class, View.class, View.class, Integer.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this.f79290z) {
            return super.D(coordinatorLayout, appBarLayout, view, view2, i10);
        }
        return false;
    }

    public boolean T0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{coordinatorLayout, appBarLayout, motionEvent}, this, changeQuickRedirect, false, 25421, new Class[]{CoordinatorLayout.class, AppBarLayout.class, MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.f79290z && super.H(coordinatorLayout, appBarLayout, motionEvent);
    }

    public SVBehavior U0(boolean z10) {
        this.f79290z = z10;
        return this;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public /* bridge */ /* synthetic */ void v(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13) {
        Object[] objArr = {coordinatorLayout, view, view2, new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 25423, new Class[]{CoordinatorLayout.class, View.class, View.class, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        R0(coordinatorLayout, (AppBarLayout) view, view2, i10, i11, i12, i13);
    }
}
