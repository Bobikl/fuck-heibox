package com.google.android.play.core.splitcompat;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f56205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Set f56206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AtomicBoolean f56207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ o f56208d;

    i(o oVar, u uVar, Set set, AtomicBoolean atomicBoolean) {
        this.f56208d = oVar;
        this.f56205a = uVar;
        this.f56206b = set;
        this.f56207c = atomicBoolean;
    }

    @Override // com.google.android.play.core.splitcompat.l
    public final void a(ZipFile zipFile, Set set) throws IOException {
        this.f56208d.f(this.f56205a, set, new h(this));
    }
}
