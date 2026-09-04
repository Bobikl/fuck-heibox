package com.vivo.push;

/* JADX INFO: compiled from: PushClientManager.java */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f106608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f106609b;

    k(e eVar, String str) {
        this.f106609b = eVar;
        this.f106608a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e.a aVarD = this.f106609b.d(this.f106608a);
        if (aVarD != null) {
            aVarD.a(1003, new Object[0]);
        }
    }
}
