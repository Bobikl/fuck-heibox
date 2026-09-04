package com.bumptech.glide.load.resource.transcode;

import androidx.annotation.n0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: TranscoderRegistry.java */
/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a<?, ?>> f41726a = new ArrayList();

    /* JADX INFO: compiled from: TranscoderRegistry.java */
    public static final class a<Z, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Class<Z> f41727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class<R> f41728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final e<Z, R> f41729c;

        a(@n0 Class<Z> cls, @n0 Class<R> cls2, @n0 e<Z, R> eVar) {
            this.f41727a = cls;
            this.f41728b = cls2;
            this.f41729c = eVar;
        }

        public boolean a(@n0 Class<?> cls, @n0 Class<?> cls2) {
            return this.f41727a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f41728b);
        }
    }

    @n0
    public synchronized <Z, R> e<Z, R> a(@n0 Class<Z> cls, @n0 Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.b();
        }
        for (a<?, ?> aVar : this.f41726a) {
            if (aVar.a(cls, cls2)) {
                return (e<Z, R>) aVar.f41729c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    @n0
    public synchronized <Z, R> List<Class<R>> b(@n0 Class<Z> cls, @n0 Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> aVar : this.f41726a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f41728b)) {
                arrayList.add(aVar.f41728b);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void c(@n0 Class<Z> cls, @n0 Class<R> cls2, @n0 e<Z, R> eVar) {
        this.f41726a.add(new a<>(cls, cls2, eVar));
    }
}
