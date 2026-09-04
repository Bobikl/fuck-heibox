package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.transition.z;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: MaterialSharedAxis.java */
/* JADX INFO: loaded from: classes7.dex */
public final class p extends q<w> {
    public static final int G2 = 1;

    @androidx.annotation.f
    private static final int G3 = R.attr.motionDurationLong1;

    @androidx.annotation.f
    private static final int J3 = R.attr.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public static final int f55993p3 = 2;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public static final int f55994y2 = 0;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private final int f55995p2;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final boolean f55996x2;

    /* JADX INFO: compiled from: MaterialSharedAxis.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface a {
    }

    public p(int i10, boolean z10) {
        super(g1(i10, z10), i1());
        this.f55995p2 = i10;
        this.f55996x2 = z10;
    }

    private static w g1(int i10, boolean z10) {
        if (i10 == 0) {
            return new s(z10 ? androidx.core.view.n.f21702c : androidx.core.view.n.f21701b);
        }
        if (i10 == 1) {
            return new s(z10 ? 80 : 48);
        }
        if (i10 == 2) {
            return new r(z10);
        }
        throw new IllegalArgumentException("Invalid axis: " + i10);
    }

    private static w i1() {
        return new e();
    }

    @Override // com.google.android.material.transition.q, androidx.transition.Visibility
    public /* bridge */ /* synthetic */ Animator M0(ViewGroup viewGroup, View view, z zVar, z zVar2) {
        return super.M0(viewGroup, view, zVar, zVar2);
    }

    @Override // com.google.android.material.transition.q, androidx.transition.Visibility
    public /* bridge */ /* synthetic */ Animator O0(ViewGroup viewGroup, View view, z zVar, z zVar2) {
        return super.O0(viewGroup, view, zVar, zVar2);
    }

    @Override // com.google.android.material.transition.q
    public /* bridge */ /* synthetic */ void R0(@n0 w wVar) {
        super.R0(wVar);
    }

    @Override // com.google.android.material.transition.q
    public /* bridge */ /* synthetic */ void T0() {
        super.T0();
    }

    @Override // com.google.android.material.transition.q
    @androidx.annotation.f
    int W0(boolean z10) {
        return G3;
    }

    @Override // com.google.android.material.transition.q
    @androidx.annotation.f
    int X0(boolean z10) {
        return J3;
    }

    @Override // com.google.android.material.transition.q
    @n0
    public /* bridge */ /* synthetic */ w Y0() {
        return super.Y0();
    }

    @Override // com.google.android.material.transition.q
    @p0
    public /* bridge */ /* synthetic */ w Z0() {
        return super.Z0();
    }

    @Override // com.google.android.material.transition.q
    public /* bridge */ /* synthetic */ boolean d1(@n0 w wVar) {
        return super.d1(wVar);
    }

    @Override // com.google.android.material.transition.q
    public /* bridge */ /* synthetic */ void e1(@p0 w wVar) {
        super.e1(wVar);
    }

    public int j1() {
        return this.f55995p2;
    }

    public boolean k1() {
        return this.f55996x2;
    }
}
