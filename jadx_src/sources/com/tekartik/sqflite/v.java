package com.tekartik.sqflite;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: compiled from: DatabaseWorkerPool.java */
/* JADX INFO: loaded from: classes4.dex */
public class v implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f98713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f98714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HandlerThread f98715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Handler f98716d;

    v(String str, int i10) {
        this.f98713a = str;
        this.f98714b = i10;
    }

    @Override // com.tekartik.sqflite.p
    public void a(l lVar) {
        this.f98716d.post(lVar.f98676b);
    }

    @Override // com.tekartik.sqflite.p
    public void b() {
        HandlerThread handlerThread = this.f98715c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f98715c = null;
            this.f98716d = null;
        }
    }

    @Override // com.tekartik.sqflite.p
    public /* synthetic */ void c(j jVar, Runnable runnable) {
        o.a(this, jVar, runnable);
    }

    @Override // com.tekartik.sqflite.p
    public void start() {
        HandlerThread handlerThread = new HandlerThread(this.f98713a, this.f98714b);
        this.f98715c = handlerThread;
        handlerThread.start();
        this.f98716d = new Handler(this.f98715c.getLooper());
    }
}
