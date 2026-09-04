package com.bumptech.glide.load.engine.cache;

import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.load.engine.s;

/* JADX INFO: compiled from: MemoryCacheAdapter.java */
/* JADX INFO: loaded from: classes6.dex */
public class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j.a f41063a;

    @Override // com.bumptech.glide.load.engine.cache.j
    public void a(int i10) {
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    public void b() {
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    public void c(float f10) {
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    public long d() {
        return 0L;
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    @p0
    public s<?> e(@n0 com.bumptech.glide.load.c cVar, @p0 s<?> sVar) {
        if (sVar == null) {
            return null;
        }
        this.f41063a.d(sVar);
        return null;
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    @p0
    public s<?> f(@n0 com.bumptech.glide.load.c cVar) {
        return null;
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    public void g(@n0 j.a aVar) {
        this.f41063a = aVar;
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    public long getMaxSize() {
        return 0L;
    }
}
