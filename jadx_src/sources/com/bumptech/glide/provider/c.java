package com.bumptech.glide.provider;

import androidx.annotation.p0;
import com.bumptech.glide.load.engine.g;
import com.bumptech.glide.load.engine.q;
import com.bumptech.glide.util.l;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: LoadPathCache.java */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final q<?, ?, ?> f41794c = new q<>(Object.class, Object.class, Object.class, Collections.singletonList(new g(Object.class, Object.class, Object.class, Collections.emptyList(), new com.bumptech.glide.load.resource.transcode.g(), null)), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.collection.a<l, q<?, ?, ?>> f41795a = new androidx.collection.a<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<l> f41796b = new AtomicReference<>();

    private l b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        l andSet = this.f41796b.getAndSet(null);
        if (andSet == null) {
            andSet = new l();
        }
        andSet.b(cls, cls2, cls3);
        return andSet;
    }

    @p0
    public <Data, TResource, Transcode> q<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        q<Data, TResource, Transcode> qVar;
        l lVarB = b(cls, cls2, cls3);
        synchronized (this.f41795a) {
            qVar = (q) this.f41795a.get(lVarB);
        }
        this.f41796b.set(lVarB);
        return qVar;
    }

    public boolean c(@p0 q<?, ?, ?> qVar) {
        return f41794c.equals(qVar);
    }

    public void d(Class<?> cls, Class<?> cls2, Class<?> cls3, @p0 q<?, ?, ?> qVar) {
        synchronized (this.f41795a) {
            androidx.collection.a<l, q<?, ?, ?>> aVar = this.f41795a;
            l lVar = new l(cls, cls2, cls3);
            if (qVar == null) {
                qVar = f41794c;
            }
            aVar.put(lVar, qVar);
        }
    }
}
