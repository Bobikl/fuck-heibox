package com.bumptech.glide.load.data;

import androidx.annotation.n0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: DataRewinderRegistry.java */
/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e.a<?> f40845b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, e.a<?>> f40846a = new HashMap();

    /* JADX INFO: compiled from: DataRewinderRegistry.java */
    public class a implements e.a<Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.data.e.a
        @n0
        public Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.e.a
        @n0
        public e<Object> b(@n0 Object obj) {
            return new b(obj);
        }
    }

    /* JADX INFO: compiled from: DataRewinderRegistry.java */
    public static final class b implements e<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f40847a;

        b(@n0 Object obj) {
            this.f40847a = obj;
        }

        @Override // com.bumptech.glide.load.data.e
        @n0
        public Object a() {
            return this.f40847a;
        }

        @Override // com.bumptech.glide.load.data.e
        public void b() {
        }
    }

    @n0
    public synchronized <T> e<T> a(@n0 T t10) {
        e.a<?> aVar;
        com.bumptech.glide.util.m.e(t10);
        aVar = this.f40846a.get(t10.getClass());
        if (aVar == null) {
            for (e.a<?> aVar2 : this.f40846a.values()) {
                if (aVar2.a().isAssignableFrom(t10.getClass())) {
                    aVar = aVar2;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f40845b;
        }
        return (e<T>) aVar.b(t10);
    }

    public synchronized void b(@n0 e.a<?> aVar) {
        this.f40846a.put(aVar.a(), aVar);
    }
}
