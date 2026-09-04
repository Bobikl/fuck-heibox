package com.tekartik.sqflite.operation;

/* JADX INFO: compiled from: QueuedOperation.java */
/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final e f98699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Runnable f98700b;

    public h(e eVar, Runnable runnable) {
        this.f98699a = eVar;
        this.f98700b = runnable;
    }

    public void a() {
        this.f98700b.run();
    }
}
