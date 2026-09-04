package com.vivo.push.d;

/* JADX INFO: compiled from: OnDispatcherReceiveTask.java */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends z {
    k(com.vivo.push.o oVar) {
        super(oVar);
    }

    @Override // com.vivo.push.l
    protected final void a(com.vivo.push.o oVar) {
        com.vivo.push.b.l lVar = (com.vivo.push.b.l) oVar;
        int iD = lVar.d();
        int iE = lVar.e();
        com.vivo.push.util.w.b().a("key_dispatch_environment", iD);
        com.vivo.push.util.w.b().a("key_dispatch_area", iE);
    }
}
