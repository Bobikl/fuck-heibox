package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.f1;
import com.google.android.play.core.splitinstall.internal.a1;
import com.google.android.play.core.splitinstall.internal.x0;
import java.io.File;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class w implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a1 f56453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a1 f56454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a1 f56455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a1 f56456d;

    public w(a1 a1Var, a1 a1Var2, a1 a1Var3, a1 a1Var4) {
        this.f56453a = a1Var;
        this.f56454b = a1Var2;
        this.f56455c = a1Var3;
        this.f56456d = a1Var4;
    }

    @Override // com.google.android.play.core.splitinstall.internal.a1
    public final /* bridge */ /* synthetic */ Object zza() {
        return new a(((com.google.android.play.core.splitinstall.l) this.f56453a).a(), (File) this.f56454b.zza(), (f1) this.f56455c.zza(), x0.a(this.f56456d));
    }
}
