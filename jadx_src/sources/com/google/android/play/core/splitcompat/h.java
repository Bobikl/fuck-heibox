package com.google.android.play.core.splitcompat;

import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class h implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f56204a;

    h(i iVar) {
        this.f56204a = iVar;
    }

    @Override // com.google.android.play.core.splitcompat.m
    public final void a(n nVar, File file, boolean z10) throws IOException {
        this.f56204a.f56206b.add(file);
        if (z10) {
            return;
        }
        this.f56204a.f56207c.set(false);
    }
}
