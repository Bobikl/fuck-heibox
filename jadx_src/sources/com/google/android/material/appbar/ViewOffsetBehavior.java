package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.n0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes7.dex */
public class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private i f53042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f53043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f53044h;

    public ViewOffsetBehavior() {
        this.f53043g = 0;
        this.f53044h = 0;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53043g = 0;
        this.f53044h = 0;
    }

    public int J() {
        i iVar = this.f53042f;
        if (iVar != null) {
            return iVar.d();
        }
        return 0;
    }

    public int K() {
        i iVar = this.f53042f;
        if (iVar != null) {
            return iVar.e();
        }
        return 0;
    }

    public boolean L() {
        i iVar = this.f53042f;
        return iVar != null && iVar.f();
    }

    public boolean M() {
        i iVar = this.f53042f;
        return iVar != null && iVar.g();
    }

    protected void N(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, int i10) {
        coordinatorLayout.K(v10, i10);
    }

    public void O(boolean z10) {
        i iVar = this.f53042f;
        if (iVar != null) {
            iVar.i(z10);
        }
    }

    public boolean P(int i10) {
        i iVar = this.f53042f;
        if (iVar != null) {
            return iVar.j(i10);
        }
        this.f53044h = i10;
        return false;
    }

    public boolean Q(int i10) {
        i iVar = this.f53042f;
        if (iVar != null) {
            return iVar.k(i10);
        }
        this.f53043g = i10;
        return false;
    }

    public void R(boolean z10) {
        i iVar = this.f53042f;
        if (iVar != null) {
            iVar.l(z10);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean p(@n0 CoordinatorLayout coordinatorLayout, @n0 V v10, int i10) {
        N(coordinatorLayout, v10, i10);
        if (this.f53042f == null) {
            this.f53042f = new i(v10);
        }
        this.f53042f.h();
        this.f53042f.a();
        int i11 = this.f53043g;
        if (i11 != 0) {
            this.f53042f.k(i11);
            this.f53043g = 0;
        }
        int i12 = this.f53044h;
        if (i12 == 0) {
            return true;
        }
        this.f53042f.j(i12);
        this.f53044h = 0;
        return true;
    }
}
