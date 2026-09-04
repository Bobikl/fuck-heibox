package com.taobao.accs.net;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ v f98388a;

    x(v vVar) {
        this.f98388a = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f98388a.o();
        if (this.f98388a.I != null) {
            this.f98388a.I.setCloseReason("shut down");
        }
        synchronized (this.f98388a.f98375u) {
            try {
                this.f98388a.f98375u.notifyAll();
            } catch (Exception unused) {
            }
        }
    }
}
