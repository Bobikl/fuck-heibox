package com.google.android.play.core.splitinstall;

import java.io.File;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class s0 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s0 f56370a = this;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.core.splitinstall.internal.a1 f56371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.core.splitinstall.internal.a1 f56372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.core.splitinstall.internal.a1 f56373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.play.core.splitinstall.internal.a1 f56374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.play.core.splitinstall.internal.a1 f56375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.play.core.splitinstall.internal.a1 f56376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.play.core.splitinstall.internal.a1 f56377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.play.core.splitinstall.internal.a1 f56378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.play.core.splitinstall.internal.a1 f56379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.play.core.splitinstall.internal.a1 f56380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.android.play.core.splitinstall.internal.a1 f56381l;

    /* synthetic */ s0(k kVar, r0 r0Var) {
        l lVar = new l(kVar);
        this.f56371b = lVar;
        com.google.android.play.core.splitinstall.internal.a1 a1VarB = com.google.android.play.core.splitinstall.internal.x0.b(new m0(lVar));
        this.f56372c = a1VarB;
        com.google.android.play.core.splitinstall.internal.a1 a1VarB2 = com.google.android.play.core.splitinstall.internal.x0.b(new o(kVar));
        this.f56373d = a1VarB2;
        com.google.android.play.core.splitinstall.internal.a1 a1VarB3 = com.google.android.play.core.splitinstall.internal.x0.b(new g1(lVar));
        this.f56374e = a1VarB3;
        com.google.android.play.core.splitinstall.internal.a1 a1VarB4 = com.google.android.play.core.splitinstall.internal.x0.b(new o0(lVar));
        this.f56375f = a1VarB4;
        com.google.android.play.core.splitinstall.internal.a1 a1VarB5 = com.google.android.play.core.splitinstall.internal.x0.b(new j(a1VarB, a1VarB2, a1VarB3, a1VarB4));
        this.f56376g = a1VarB5;
        com.google.android.play.core.splitinstall.internal.a1 a1VarB6 = com.google.android.play.core.splitinstall.internal.x0.b(new n(lVar));
        this.f56377h = a1VarB6;
        m mVar = new m(a1VarB6);
        this.f56378i = mVar;
        com.google.android.play.core.splitinstall.internal.a1 a1VarB7 = com.google.android.play.core.splitinstall.internal.x0.b(new com.google.android.play.core.splitinstall.testing.w(lVar, a1VarB6, a1VarB3, mVar));
        this.f56379j = a1VarB7;
        com.google.android.play.core.splitinstall.internal.a1 a1VarB8 = com.google.android.play.core.splitinstall.internal.x0.b(new a1(a1VarB5, a1VarB7, a1VarB6));
        this.f56380k = a1VarB8;
        this.f56381l = com.google.android.play.core.splitinstall.internal.x0.b(new p(kVar, a1VarB8));
    }

    @Override // com.google.android.play.core.splitinstall.c1
    public final File A() {
        return (File) this.f56377h.zza();
    }

    @Override // com.google.android.play.core.splitinstall.c1
    public final c zza() {
        return (c) this.f56381l.zza();
    }
}
