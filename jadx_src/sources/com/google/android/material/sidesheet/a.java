package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;

/* JADX INFO: compiled from: RightSheetDelegate.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SideSheetBehavior<? extends View> f55241a;

    a(@n0 SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f55241a = sideSheetBehavior;
    }

    private boolean k(@n0 View view) {
        return view.getLeft() > (e() - d()) / 2;
    }

    private boolean l(float f10, float f11) {
        return g.a(f10, f11) && f11 > ((float) this.f55241a.o0());
    }

    @Override // com.google.android.material.sidesheet.d
    int a(@n0 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.d
    float b(int i10) {
        float fE = e();
        return (fE - i10) / (fE - d());
    }

    @Override // com.google.android.material.sidesheet.d
    int c(@n0 View view, float f10, float f11) {
        if (f10 >= 0.0f) {
            if (i(view, f10)) {
                if (l(f10, f11) || k(view)) {
                    return 5;
                }
            } else {
                if (f10 != 0.0f && g.a(f10, f11)) {
                    return 5;
                }
                int left = view.getLeft();
                if (Math.abs(left - d()) >= Math.abs(left - e())) {
                    return 5;
                }
            }
        }
        return 3;
    }

    @Override // com.google.android.material.sidesheet.d
    int d() {
        return Math.max(0, (e() - this.f55241a.e0()) - this.f55241a.k0());
    }

    @Override // com.google.android.material.sidesheet.d
    int e() {
        return this.f55241a.n0();
    }

    @Override // com.google.android.material.sidesheet.d
    <V extends View> int f(@n0 V v10) {
        return v10.getLeft() - this.f55241a.k0();
    }

    @Override // com.google.android.material.sidesheet.d
    int g() {
        return 0;
    }

    @Override // com.google.android.material.sidesheet.d
    boolean h(View view, int i10, boolean z10) {
        int iM0 = this.f55241a.m0(i10);
        androidx.customview.widget.d dVarP0 = this.f55241a.p0();
        return dVarP0 != null && (!z10 ? !dVarP0.X(view, iM0, view.getTop()) : !dVarP0.V(iM0, view.getTop()));
    }

    @Override // com.google.android.material.sidesheet.d
    boolean i(@n0 View view, float f10) {
        return Math.abs(((float) view.getRight()) + (f10 * this.f55241a.i0())) > this.f55241a.j0();
    }

    @Override // com.google.android.material.sidesheet.d
    void j(@n0 ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        int iN0 = this.f55241a.n0();
        if (i10 <= iN0) {
            marginLayoutParams.rightMargin = iN0 - i10;
        }
    }
}
