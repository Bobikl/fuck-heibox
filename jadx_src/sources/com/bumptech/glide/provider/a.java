package com.bumptech.glide.provider;

import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: EncoderRegistry.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<C0344a<?>> f41790a = new ArrayList();

    /* JADX INFO: renamed from: com.bumptech.glide.provider.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EncoderRegistry.java */
    public static final class C0344a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<T> f41791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final com.bumptech.glide.load.a<T> f41792b;

        C0344a(@n0 Class<T> cls, @n0 com.bumptech.glide.load.a<T> aVar) {
            this.f41791a = cls;
            this.f41792b = aVar;
        }

        boolean a(@n0 Class<?> cls) {
            return this.f41791a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void a(@n0 Class<T> cls, @n0 com.bumptech.glide.load.a<T> aVar) {
        this.f41790a.add(new C0344a<>(cls, aVar));
    }

    @p0
    public synchronized <T> com.bumptech.glide.load.a<T> b(@n0 Class<T> cls) {
        for (C0344a<?> c0344a : this.f41790a) {
            if (c0344a.a(cls)) {
                return (com.bumptech.glide.load.a<T>) c0344a.f41792b;
            }
        }
        return null;
    }

    public synchronized <T> void c(@n0 Class<T> cls, @n0 com.bumptech.glide.load.a<T> aVar) {
        this.f41790a.add(0, new C0344a<>(cls, aVar));
    }
}
