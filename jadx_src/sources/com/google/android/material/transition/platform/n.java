package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: MaterialElevationScale.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(21)
public final class n extends r<s> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f56112f = 0.85f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f56113e;

    public n(boolean z10) {
        super(m(z10), n());
        this.f56113e = z10;
    }

    private static s m(boolean z10) {
        s sVar = new s(z10);
        sVar.m(0.85f);
        sVar.l(0.85f);
        return sVar;
    }

    private static x n() {
        return new d();
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

    public boolean o() {
        return this.f56113e;
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
