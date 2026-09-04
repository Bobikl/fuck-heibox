package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.transition.z;
import com.google.android.material.R;

/* JADX INFO: compiled from: MaterialFadeThrough.java */
/* JADX INFO: loaded from: classes7.dex */
public final class o extends q<e> {

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final float f55990p2 = 0.92f;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f55991x2 = R.attr.motionDurationLong1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f55992y2 = R.attr.motionEasingEmphasizedInterpolator;

    public o() {
        super(g1(), i1());
    }

    private static e g1() {
        return new e();
    }

    private static w i1() {
        r rVar = new r();
        rVar.o(false);
        rVar.l(f55990p2);
        return rVar;
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
        return f55991x2;
    }

    @Override // com.google.android.material.transition.q
    @androidx.annotation.f
    int X0(boolean z10) {
        return f55992y2;
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
}
