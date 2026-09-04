package com.bumptech.glide.load.engine.cache;

import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.load.engine.s;

/* JADX INFO: compiled from: MemoryCache.java */
/* JADX INFO: loaded from: classes6.dex */
public interface j {

    /* JADX INFO: compiled from: MemoryCache.java */
    public interface a {
        void d(@n0 s<?> sVar);
    }

    void a(int i10);

    void b();

    void c(float f10);

    long d();

    @p0
    s<?> e(@n0 com.bumptech.glide.load.c cVar, @p0 s<?> sVar);

    @p0
    s<?> f(@n0 com.bumptech.glide.load.c cVar);

    void g(@n0 a aVar);

    long getMaxSize();
}
