package com.lzy.okgo.cache.policy;

import com.lzy.okgo.cache.CacheEntity;
import okhttp3.c0;

/* JADX INFO: compiled from: CachePolicy.java */
/* JADX INFO: loaded from: classes6.dex */
public interface b<T> {
    void b(com.lzy.okgo.model.b<T> bVar);

    void c(com.lzy.okgo.model.b<T> bVar);

    void cancel();

    okhttp3.e d() throws Throwable;

    CacheEntity<T> e();

    void f(CacheEntity<T> cacheEntity, ia.c<T> cVar);

    com.lzy.okgo.model.b<T> g(CacheEntity<T> cacheEntity);

    boolean h(okhttp3.e eVar, c0 c0Var);

    boolean isCanceled();

    boolean isExecuted();
}
