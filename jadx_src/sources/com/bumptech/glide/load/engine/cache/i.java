package com.bumptech.glide.load.engine.cache;

import android.annotation.SuppressLint;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.load.engine.s;

/* JADX INFO: compiled from: LruResourceCache.java */
/* JADX INFO: loaded from: classes6.dex */
public class i extends com.bumptech.glide.util.j<com.bumptech.glide.load.c, s<?>> implements j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private j.a f41062e;

    public i(long j10) {
        super(j10);
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    @SuppressLint({"InlinedApi"})
    public void a(int i10) {
        if (i10 >= 40) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            p(getMaxSize() / 2);
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    @p0
    public /* bridge */ /* synthetic */ s e(@n0 com.bumptech.glide.load.c cVar, @p0 s sVar) {
        return (s) super.n(cVar, sVar);
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    @p0
    public /* bridge */ /* synthetic */ s f(@n0 com.bumptech.glide.load.c cVar) {
        return (s) super.o(cVar);
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    public void g(@n0 j.a aVar) {
        this.f41062e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.util.j
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public int l(@p0 s<?> sVar) {
        return sVar == null ? super.l(null) : sVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.util.j
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void m(@n0 com.bumptech.glide.load.c cVar, @p0 s<?> sVar) {
        j.a aVar = this.f41062e;
        if (aVar == null || sVar == null) {
            return;
        }
        aVar.d(sVar);
    }
}
