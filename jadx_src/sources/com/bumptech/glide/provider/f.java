package com.bumptech.glide.provider;

import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.load.h;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ResourceEncoderRegistry.java */
/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a<?>> f41804a = new ArrayList();

    /* JADX INFO: compiled from: ResourceEncoderRegistry.java */
    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<T> f41805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final h<T> f41806b;

        a(@n0 Class<T> cls, @n0 h<T> hVar) {
            this.f41805a = cls;
            this.f41806b = hVar;
        }

        boolean a(@n0 Class<?> cls) {
            return this.f41805a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void a(@n0 Class<Z> cls, @n0 h<Z> hVar) {
        this.f41804a.add(new a<>(cls, hVar));
    }

    @p0
    public synchronized <Z> h<Z> b(@n0 Class<Z> cls) {
        int size = this.f41804a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a<?> aVar = this.f41804a.get(i10);
            if (aVar.a(cls)) {
                return (h<Z>) aVar.f41806b;
            }
        }
        return null;
    }

    public synchronized <Z> void c(@n0 Class<Z> cls, @n0 h<Z> hVar) {
        this.f41804a.add(0, new a<>(cls, hVar));
    }
}
