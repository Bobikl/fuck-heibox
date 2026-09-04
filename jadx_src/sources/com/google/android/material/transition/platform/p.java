package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.android.material.R;

/* JADX INFO: compiled from: MaterialFadeThrough.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(21)
public final class p extends r<e> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f56120e = 0.92f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f56121f = R.attr.motionDurationLong1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f56122g = R.attr.motionEasingEmphasizedInterpolator;

    public p() {
        super(m(), n());
    }

    private static e m() {
        return new e();
    }

    private static x n() {
        s sVar = new s();
        sVar.o(false);
        sVar.l(f56120e);
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
    @androidx.annotation.f
    int f(boolean z10) {
        return f56121f;
    }

    @Override // com.google.android.material.transition.platform.r
    @androidx.annotation.f
    int g(boolean z10) {
        return f56122g;
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
