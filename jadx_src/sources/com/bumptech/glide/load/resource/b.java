package com.bumptech.glide.load.resource;

import androidx.annotation.n0;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.util.m;

/* JADX INFO: compiled from: SimpleResource.java */
/* JADX INFO: loaded from: classes6.dex */
public class b<T> implements s<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final T f41465b;

    public b(@n0 T t10) {
        this.f41465b = (T) m.e(t10);
    }

    @Override // com.bumptech.glide.load.engine.s
    public final int a() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.s
    @n0
    public Class<T> b() {
        return (Class<T>) this.f41465b.getClass();
    }

    @Override // com.bumptech.glide.load.engine.s
    @n0
    public final T get() {
        return this.f41465b;
    }

    @Override // com.bumptech.glide.load.engine.s
    public void recycle() {
    }
}
