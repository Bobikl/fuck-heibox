package com.tekartik.sqflite;

import androidx.annotation.p0;

/* JADX INFO: compiled from: DatabaseTask.java */
/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final k f98675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Runnable f98676b;

    l(k kVar, Runnable runnable) {
        this.f98675a = kVar;
        this.f98676b = runnable;
    }

    public Integer a() {
        k kVar = this.f98675a;
        if (kVar != null) {
            return Integer.valueOf(kVar.a());
        }
        return null;
    }

    public boolean b() {
        k kVar = this.f98675a;
        return kVar != null && kVar.b();
    }
}
