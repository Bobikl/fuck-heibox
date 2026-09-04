package com.bumptech.glide.provider;

import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.util.l;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ModelToResourceClassCache.java */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<l> f41797a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.collection.a<l, List<Class<?>>> f41798b = new androidx.collection.a<>();

    public void a() {
        synchronized (this.f41798b) {
            this.f41798b.clear();
        }
    }

    @p0
    public List<Class<?>> b(@n0 Class<?> cls, @n0 Class<?> cls2, @n0 Class<?> cls3) {
        List<Class<?>> list;
        l andSet = this.f41797a.getAndSet(null);
        if (andSet == null) {
            andSet = new l(cls, cls2, cls3);
        } else {
            andSet.b(cls, cls2, cls3);
        }
        synchronized (this.f41798b) {
            list = this.f41798b.get(andSet);
        }
        this.f41797a.set(andSet);
        return list;
    }

    public void c(@n0 Class<?> cls, @n0 Class<?> cls2, @n0 Class<?> cls3, @n0 List<Class<?>> list) {
        synchronized (this.f41798b) {
            this.f41798b.put(new l(cls, cls2, cls3), list);
        }
    }
}
