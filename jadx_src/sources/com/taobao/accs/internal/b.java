package com.taobao.accs.internal;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.taobao.accs.c f98288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ACCSManagerImpl f98289b;

    b(ACCSManagerImpl aCCSManagerImpl, com.taobao.accs.c cVar) {
        this.f98289b = aCCSManagerImpl;
        this.f98288a = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.taobao.accs.c cVar = this.f98288a;
        if (cVar != null) {
            cVar.a(true, false);
        }
    }
}
