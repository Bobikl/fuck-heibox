package com.google.android.play.core.splitinstall;

import java.io.File;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class m implements com.google.android.play.core.splitinstall.internal.a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.core.splitinstall.internal.a1 f56359a;

    public m(com.google.android.play.core.splitinstall.internal.a1 a1Var) {
        this.f56359a = a1Var;
    }

    @Override // com.google.android.play.core.splitinstall.internal.a1
    @androidx.annotation.p0
    public final /* bridge */ /* synthetic */ Object zza() {
        File file = (File) this.f56359a.zza();
        if (file == null) {
            return null;
        }
        return com.google.android.play.core.splitinstall.testing.d.a(file);
    }
}
