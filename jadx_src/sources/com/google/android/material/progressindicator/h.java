package com.google.android.material.progressindicator;

import android.animation.Animator;
import androidx.annotation.n0;

/* JADX INFO: compiled from: IndeterminateAnimatorDelegate.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class h<T extends Animator> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected i f54803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final float[] f54804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int[] f54805c;

    protected h(int i10) {
        this.f54804b = new float[i10 * 2];
        this.f54805c = new int[i10];
    }

    abstract void a();

    protected float b(int i10, int i11, int i12) {
        return (i10 - i11) / i12;
    }

    public abstract void c();

    public abstract void d(@n0 androidx.vectordrawable.graphics.drawable.b.a aVar);

    protected void e(@n0 i iVar) {
        this.f54803a = iVar;
    }

    abstract void f();

    abstract void g();

    public abstract void h();
}
