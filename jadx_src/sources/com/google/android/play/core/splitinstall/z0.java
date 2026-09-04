package com.google.android.play.core.splitinstall;

import android.app.Activity;
import android.content.IntentSender;
import androidx.activity.result.IntentSenderRequest;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class z0 implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.core.splitinstall.internal.w0 f56478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.core.splitinstall.internal.w0 f56479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.core.splitinstall.internal.w0 f56480c;

    z0(com.google.android.play.core.splitinstall.internal.w0 w0Var, com.google.android.play.core.splitinstall.internal.w0 w0Var2, com.google.android.play.core.splitinstall.internal.w0 w0Var3) {
        this.f56478a = w0Var;
        this.f56479b = w0Var2;
        this.f56480c = w0Var3;
    }

    private final c r() {
        return this.f56480c.zza() != null ? (c) this.f56479b.zza() : (c) this.f56478a.zza();
    }

    @Override // com.google.android.play.core.splitinstall.c
    @androidx.annotation.n0
    public final com.google.android.gms.tasks.k<Void> a(List<Locale> list) {
        return r().a(list);
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final com.google.android.gms.tasks.k<Integer> b(@androidx.annotation.n0 e eVar) {
        return r().b(eVar);
    }

    @Override // com.google.android.play.core.splitinstall.c
    @androidx.annotation.n0
    public final com.google.android.gms.tasks.k<Void> c(List<String> list) {
        return r().c(list);
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final boolean d(@androidx.annotation.n0 f fVar, @androidx.annotation.n0 androidx.activity.result.g<IntentSenderRequest> gVar) {
        return r().d(fVar, gVar);
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final void e(@androidx.annotation.n0 g gVar) {
        r().e(gVar);
    }

    @Override // com.google.android.play.core.splitinstall.c
    @androidx.annotation.n0
    public final com.google.android.gms.tasks.k<Void> f(List<String> list) {
        return r().f(list);
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final void g(@androidx.annotation.n0 g gVar) {
        r().g(gVar);
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final void h(@androidx.annotation.n0 g gVar) {
        r().h(gVar);
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final void i(@androidx.annotation.n0 g gVar) {
        r().i(gVar);
    }

    @Override // com.google.android.play.core.splitinstall.c
    @androidx.annotation.n0
    public final Set<String> j() {
        return r().j();
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final boolean k(@androidx.annotation.n0 f fVar, @androidx.annotation.n0 Activity activity, int i10) throws IntentSender.SendIntentException {
        return r().k(fVar, activity, i10);
    }

    @Override // com.google.android.play.core.splitinstall.c
    @androidx.annotation.n0
    public final com.google.android.gms.tasks.k<Void> l(List<Locale> list) {
        return r().l(list);
    }

    @Override // com.google.android.play.core.splitinstall.c
    @androidx.annotation.n0
    public final com.google.android.gms.tasks.k<Void> m(int i10) {
        return r().m(i10);
    }

    @Override // com.google.android.play.core.splitinstall.c
    @androidx.annotation.n0
    public final com.google.android.gms.tasks.k<List<f>> n() {
        return r().n();
    }

    @Override // com.google.android.play.core.splitinstall.c
    public final boolean o(@androidx.annotation.n0 f fVar, @androidx.annotation.n0 com.google.android.play.core.common.a aVar, int i10) throws IntentSender.SendIntentException {
        return r().o(fVar, aVar, i10);
    }

    @Override // com.google.android.play.core.splitinstall.c
    @androidx.annotation.n0
    public final com.google.android.gms.tasks.k<f> p(int i10) {
        return r().p(i10);
    }

    @Override // com.google.android.play.core.splitinstall.c
    @androidx.annotation.n0
    public final Set<String> q() {
        return r().q();
    }
}
