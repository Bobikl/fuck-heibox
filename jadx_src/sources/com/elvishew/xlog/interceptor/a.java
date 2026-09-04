package com.elvishew.xlog.interceptor;

/* JADX INFO: compiled from: AbstractFilterInterceptor.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a implements c {
    @Override // com.elvishew.xlog.interceptor.c
    public com.elvishew.xlog.c a(com.elvishew.xlog.c cVar) {
        if (b(cVar)) {
            return null;
        }
        return cVar;
    }

    protected abstract boolean b(com.elvishew.xlog.c cVar);
}
