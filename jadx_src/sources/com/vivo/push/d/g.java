package com.vivo.push.d;

/* JADX INFO: compiled from: OnClearCacheReceiveTask.java */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends z {
    g(com.vivo.push.o oVar) {
        super(oVar);
    }

    @Override // com.vivo.push.l
    protected final void a(com.vivo.push.o oVar) {
        com.vivo.push.util.p.d("OnClearCacheTask", "delete push info " + this.f106610a.getPackageName());
        com.vivo.push.util.y.b(this.f106610a).a();
    }
}
