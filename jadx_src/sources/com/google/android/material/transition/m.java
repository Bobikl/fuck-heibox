package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.transition.z;

/* JADX INFO: compiled from: MaterialElevationScale.java */
/* JADX INFO: loaded from: classes7.dex */
public final class m extends q<r> {

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final float f55984x2 = 0.85f;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private final boolean f55985p2;

    public m(boolean z10) {
        super(g1(z10), i1());
        this.f55985p2 = z10;
    }

    private static r g1(boolean z10) {
        r rVar = new r(z10);
        rVar.m(0.85f);
        rVar.l(0.85f);
        return rVar;
    }

    private static w i1() {
        return new d();
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

    public boolean j1() {
        return this.f55985p2;
    }
}
