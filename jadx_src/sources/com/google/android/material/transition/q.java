package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.transition.Visibility;
import androidx.transition.z;
import com.google.android.material.transition.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: MaterialVisibility.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class q<P extends w> extends Visibility {

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private final P f56160p1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @p0
    private w f56161x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private final List<w> f56162y1 = new ArrayList();

    protected q(P p10, @p0 w wVar) {
        this.f56160p1 = p10;
        this.f56161x1 = wVar;
    }

    private static void S0(List<Animator> list, @p0 w wVar, ViewGroup viewGroup, View view, boolean z10) {
        if (wVar == null) {
            return;
        }
        Animator animatorB = z10 ? wVar.b(viewGroup, view) : wVar.a(viewGroup, view);
        if (animatorB != null) {
            list.add(animatorB);
        }
    }

    private Animator U0(@n0 ViewGroup viewGroup, @n0 View view, boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        S0(arrayList, this.f56160p1, viewGroup, view, z10);
        S0(arrayList, this.f56161x1, viewGroup, view, z10);
        Iterator<w> it = this.f56162y1.iterator();
        while (it.hasNext()) {
            S0(arrayList, it.next(), viewGroup, view, z10);
        }
        c1(viewGroup.getContext(), z10);
        com.google.android.material.animation.c.a(animatorSet, arrayList);
        return animatorSet;
    }

    private void c1(@n0 Context context, boolean z10) {
        v.s(this, context, W0(z10));
        v.t(this, context, X0(z10), V0(z10));
    }

    @Override // androidx.transition.Visibility
    public Animator M0(ViewGroup viewGroup, View view, z zVar, z zVar2) {
        return U0(viewGroup, view, true);
    }

    @Override // androidx.transition.Visibility
    public Animator O0(ViewGroup viewGroup, View view, z zVar, z zVar2) {
        return U0(viewGroup, view, false);
    }

    public void R0(@n0 w wVar) {
        this.f56162y1.add(wVar);
    }

    public void T0() {
        this.f56162y1.clear();
    }

    @n0
    TimeInterpolator V0(boolean z10) {
        return com.google.android.material.animation.b.f52897b;
    }

    @androidx.annotation.f
    int W0(boolean z10) {
        return 0;
    }

    @androidx.annotation.f
    int X0(boolean z10) {
        return 0;
    }

    @n0
    public P Y0() {
        return this.f56160p1;
    }

    @p0
    public w Z0() {
        return this.f56161x1;
    }

    public boolean d1(@n0 w wVar) {
        return this.f56162y1.remove(wVar);
    }

    public void e1(@p0 w wVar) {
        this.f56161x1 = wVar;
    }
}
