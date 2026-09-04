package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.android.material.transition.platform.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: MaterialVisibility.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(21)
public abstract class r<P extends x> extends Visibility {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P f56130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private x f56131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<x> f56132d = new ArrayList();

    protected r(P p10, @p0 x xVar) {
        this.f56130b = p10;
        this.f56131c = xVar;
    }

    private static void b(List<Animator> list, @p0 x xVar, ViewGroup viewGroup, View view, boolean z10) {
        if (xVar == null) {
            return;
        }
        Animator animatorB = z10 ? xVar.b(viewGroup, view) : xVar.a(viewGroup, view);
        if (animatorB != null) {
            list.add(animatorB);
        }
    }

    private Animator d(@n0 ViewGroup viewGroup, @n0 View view, boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        b(arrayList, this.f56130b, viewGroup, view, z10);
        b(arrayList, this.f56131c, viewGroup, view, z10);
        Iterator<x> it = this.f56132d.iterator();
        while (it.hasNext()) {
            b(arrayList, it.next(), viewGroup, view, z10);
        }
        j(viewGroup.getContext(), z10);
        com.google.android.material.animation.c.a(animatorSet, arrayList);
        return animatorSet;
    }

    private void j(@n0 Context context, boolean z10) {
        w.s(this, context, f(z10));
        w.t(this, context, g(z10), e(z10));
    }

    public void a(@n0 x xVar) {
        this.f56132d.add(xVar);
    }

    public void c() {
        this.f56132d.clear();
    }

    @n0
    TimeInterpolator e(boolean z10) {
        return com.google.android.material.animation.b.f52897b;
    }

    @androidx.annotation.f
    int f(boolean z10) {
        return 0;
    }

    @androidx.annotation.f
    int g(boolean z10) {
        return 0;
    }

    @n0
    public P h() {
        return this.f56130b;
    }

    @p0
    public x i() {
        return this.f56131c;
    }

    public boolean k(@n0 x xVar) {
        return this.f56132d.remove(xVar);
    }

    public void l(@p0 x xVar) {
        this.f56131c = xVar;
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return d(viewGroup, view, true);
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return d(viewGroup, view, false);
    }
}
