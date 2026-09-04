package com.google.android.play.core.splitinstall;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public enum zzo implements u0 {
    INSTANCE;

    private static final AtomicReference zzb = new AtomicReference(null);

    @Override // com.google.android.play.core.splitinstall.u0
    @androidx.annotation.p0
    public final v0 zza() {
        return (v0) zzb.get();
    }

    public final void zzb(v0 v0Var) {
        zzb.set(v0Var);
    }
}
