package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.splitinstall.internal.n1;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class i1 implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f56256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Intent f56257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Context f56258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ k1 f56259d;

    i1(k1 k1Var, f fVar, Intent intent, Context context) {
        this.f56259d = k1Var;
        this.f56256a = fVar;
        this.f56257b = intent;
        this.f56258c = context;
    }

    @Override // com.google.android.play.core.splitinstall.t0
    public final void a(@l9.a int i10) {
        k1 k1Var = this.f56259d;
        k1Var.f56349g.post(new j1(k1Var, this.f56256a, 6, i10));
    }

    @Override // com.google.android.play.core.splitinstall.t0
    public final void y() {
        if (this.f56257b.getBooleanExtra("triggered_from_app_after_verification", false)) {
            ((n1) this.f56259d).f56310a.b("Splits copied and verified more than once.", new Object[0]);
        } else {
            this.f56257b.putExtra("triggered_from_app_after_verification", true);
            this.f56258c.sendBroadcast(this.f56257b);
        }
    }

    @Override // com.google.android.play.core.splitinstall.t0
    public final void zza() {
        k1 k1Var = this.f56259d;
        k1Var.f56349g.post(new j1(k1Var, this.f56256a, 5, 0));
    }
}
