package com.vivo.push.d;

import com.vivo.push.cache.ClientConfigManagerImpl;

/* JADX INFO: compiled from: InitTask.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends com.vivo.push.l {
    c(com.vivo.push.o oVar) {
        super(oVar);
    }

    @Override // com.vivo.push.l
    protected final void a(com.vivo.push.o oVar) {
        com.vivo.push.util.p.a(ClientConfigManagerImpl.getInstance(this.f106610a).isDebug());
    }
}
