package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.DataSource;

/* JADX INFO: compiled from: ViewPropertyAnimationFactory.java */
/* JADX INFO: loaded from: classes6.dex */
public class i<R> implements g<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j.a f41961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j<R> f41962b;

    public i(j.a aVar) {
        this.f41961a = aVar;
    }

    @Override // com.bumptech.glide.request.transition.g
    public f<R> a(DataSource dataSource, boolean z10) {
        if (dataSource == DataSource.MEMORY_CACHE || !z10) {
            return e.b();
        }
        if (this.f41962b == null) {
            this.f41962b = new j<>(this.f41961a);
        }
        return this.f41962b;
    }
}
