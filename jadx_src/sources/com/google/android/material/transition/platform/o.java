package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.android.material.R;

/* JADX INFO: compiled from: MaterialFade.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(21)
public final class o extends r<d> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f56114e = 0.8f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f56115f = 0.3f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f56116g = R.attr.motionDurationMedium4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f56117h = R.attr.motionDurationShort3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f56118i = R.attr.motionEasingEmphasizedDecelerateInterpolator;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f56119j = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    public o() {
        super(m(), n());
    }

    private static d m() {
        d dVar = new d();
        dVar.e(0.3f);
        return dVar;
    }

    private static x n() {
        s sVar = new s();
        sVar.o(false);
        sVar.l(f56114e);
        return sVar;
    }

    @Override // com.google.android.material.transition.platform.r
    public /* bridge */ /* synthetic */ void a(@n0 x xVar) {
        super.a(xVar);
    }

    @Override // com.google.android.material.transition.platform.r
    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.material.transition.platform.r
    @n0
    TimeInterpolator e(boolean z10) {
        return com.google.android.material.animation.b.f52896a;
    }

    @Override // com.google.android.material.transition.platform.r
    @androidx.annotation.f
    int f(boolean z10) {
        return z10 ? f56116g : f56117h;
    }

    @Override // com.google.android.material.transition.platform.r
    @androidx.annotation.f
    int g(boolean z10) {
        return z10 ? f56118i : f56119j;
    }

    @Override // com.google.android.material.transition.platform.r
    @n0
    public /* bridge */ /* synthetic */ x h() {
        return super.h();
    }

    @Override // com.google.android.material.transition.platform.r
    @p0
    public /* bridge */ /* synthetic */ x i() {
        return super.i();
    }

    @Override // com.google.android.material.transition.platform.r
    public /* bridge */ /* synthetic */ boolean k(@n0 x xVar) {
        return super.k(xVar);
    }

    @Override // com.google.android.material.transition.platform.r
    public /* bridge */ /* synthetic */ void l(@p0 x xVar) {
        super.l(xVar);
    }

    @Override // com.google.android.material.transition.platform.r, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // com.google.android.material.transition.platform.r, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }
}
