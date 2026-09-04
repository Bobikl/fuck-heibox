package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: MaterialSharedAxis.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(21)
public final class q extends r<x> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f56123g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f56124h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f56125i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f56126j = R.attr.motionDurationLong1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f56127k = R.attr.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f56128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f56129f;

    /* JADX INFO: compiled from: MaterialSharedAxis.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface a {
    }

    public q(int i10, boolean z10) {
        super(m(i10, z10), n());
        this.f56128e = i10;
        this.f56129f = z10;
    }

    private static x m(int i10, boolean z10) {
        if (i10 == 0) {
            return new t(z10 ? androidx.core.view.n.f21702c : androidx.core.view.n.f21701b);
        }
        if (i10 == 1) {
            return new t(z10 ? 80 : 48);
        }
        if (i10 == 2) {
            return new s(z10);
        }
        throw new IllegalArgumentException("Invalid axis: " + i10);
    }

    private static x n() {
        return new e();
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
        return f56126j;
    }

    @Override // com.google.android.material.transition.platform.r
    @androidx.annotation.f
    int g(boolean z10) {
        return f56127k;
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

    public int o() {
        return this.f56128e;
    }

    @Override // com.google.android.material.transition.platform.r, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // com.google.android.material.transition.platform.r, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }

    public boolean p() {
        return this.f56129f;
    }
}
