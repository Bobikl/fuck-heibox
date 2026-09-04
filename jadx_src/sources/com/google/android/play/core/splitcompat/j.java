package com.google.android.play.core.splitcompat;

import java.io.IOException;
import java.util.Set;
import java.util.zip.ZipFile;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Set f56209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f56210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ o f56211c;

    j(o oVar, Set set, u uVar) {
        this.f56211c = oVar;
        this.f56209a = set;
        this.f56210b = uVar;
    }

    @Override // com.google.android.play.core.splitcompat.l
    public final void a(ZipFile zipFile, Set set) throws IOException {
        this.f56209a.addAll(o.a(this.f56211c, set, this.f56210b, zipFile));
    }
}
