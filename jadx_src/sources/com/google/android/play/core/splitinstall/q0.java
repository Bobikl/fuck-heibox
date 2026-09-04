package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k f56368a;

    private q0() {
    }

    /* synthetic */ q0(i0 i0Var) {
    }

    public final q0 a(k kVar) {
        this.f56368a = kVar;
        return this;
    }

    public final c1 b() {
        k kVar = this.f56368a;
        if (kVar != null) {
            return new s0(kVar, null);
        }
        throw new IllegalStateException(String.valueOf(k.class.getCanonicalName()).concat(" must be set"));
    }
}
