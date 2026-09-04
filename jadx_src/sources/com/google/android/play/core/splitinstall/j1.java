package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class j1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f56341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f56342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f56343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ k1 f56344e;

    j1(k1 k1Var, f fVar, int i10, int i11) {
        this.f56344e = k1Var;
        this.f56341b = fVar;
        this.f56342c = i10;
        this.f56343d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k1 k1Var = this.f56344e;
        f fVar = this.f56341b;
        k1Var.l(new h(fVar.h(), this.f56342c, this.f56343d, fVar.a(), fVar.j(), fVar.l(), fVar.k(), fVar.g(), fVar.m()));
    }
}
