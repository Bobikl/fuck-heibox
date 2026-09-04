package com.tekartik.sqflite;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: compiled from: DatabaseWorker.java */
/* JADX INFO: loaded from: classes4.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f98679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f98680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HandlerThread f98681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Handler f98682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Runnable f98683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private l f98684f;

    n(String str, int i10) {
        this.f98679a = str;
        this.f98680b = i10;
    }

    boolean b() {
        l lVar = this.f98684f;
        return lVar != null && lVar.b();
    }

    Integer d() {
        l lVar = this.f98684f;
        if (lVar != null) {
            return lVar.a();
        }
        return null;
    }

    void e(final l lVar) {
        this.f98682d.post(new Runnable() { // from class: com.tekartik.sqflite.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f98677b.c(lVar);
            }
        });
    }

    synchronized void f() {
        HandlerThread handlerThread = this.f98681c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f98681c = null;
            this.f98682d = null;
        }
    }

    synchronized void g(Runnable runnable) {
        HandlerThread handlerThread = new HandlerThread(this.f98679a, this.f98680b);
        this.f98681c = handlerThread;
        handlerThread.start();
        this.f98682d = new Handler(this.f98681c.getLooper());
        this.f98683e = runnable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void c(l lVar) {
        lVar.f98676b.run();
        this.f98684f = lVar;
        this.f98683e.run();
    }
}
