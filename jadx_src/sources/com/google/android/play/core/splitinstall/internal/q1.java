package com.google.android.play.core.splitinstall.internal;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class q1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private final com.google.android.gms.tasks.l f56318b;

    q1() {
        this.f56318b = null;
    }

    public q1(@androidx.annotation.p0 com.google.android.gms.tasks.l lVar) {
        this.f56318b = lVar;
    }

    @androidx.annotation.p0
    final com.google.android.gms.tasks.l a() {
        return this.f56318b;
    }

    public final void b(Exception exc) {
        com.google.android.gms.tasks.l lVar = this.f56318b;
        if (lVar != null) {
            lVar.d(exc);
        }
    }

    protected abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            c();
        } catch (Exception e10) {
            b(e10);
        }
    }
}
