package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.transition.z;
import com.google.android.material.R;

/* JADX INFO: compiled from: MaterialFade.java */
/* JADX INFO: loaded from: classes7.dex */
public final class n extends q<d> {

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final float f55986p2 = 0.8f;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final float f55988x2 = 0.3f;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f55989y2 = R.attr.motionDurationMedium4;

    @androidx.annotation.f
    private static final int G2 = R.attr.motionDurationShort3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f55987p3 = R.attr.motionEasingEmphasizedDecelerateInterpolator;

    @androidx.annotation.f
    private static final int G3 = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    public n() {
        super(g1(), i1());
    }

    private static d g1() {
        d dVar = new d();
        dVar.e(0.3f);
        return dVar;
    }

    private static w i1() {
        r rVar = new r();
        rVar.o(false);
        rVar.l(f55986p2);
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
    @n0
    TimeInterpolator V0(boolean z10) {
        return com.google.android.material.animation.b.f52896a;
    }

    @Override // com.google.android.material.transition.q
    @androidx.annotation.f
    int W0(boolean z10) {
        return z10 ? f55989y2 : G2;
    }

    @Override // com.google.android.material.transition.q
    @androidx.annotation.f
    int X0(boolean z10) {
        return z10 ? f55987p3 : G3;
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
