package com.google.android.play.core.splitinstall;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class m0 implements com.google.android.play.core.splitinstall.internal.a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.core.splitinstall.internal.a1 f56360a;

    public m0(com.google.android.play.core.splitinstall.internal.a1 a1Var) {
        this.f56360a = a1Var;
    }

    @Override // com.google.android.play.core.splitinstall.internal.a1
    public final /* bridge */ /* synthetic */ Object zza() {
        Context contextA = ((l) this.f56360a).a();
        return new l0(contextA, contextA.getPackageName());
    }
}
