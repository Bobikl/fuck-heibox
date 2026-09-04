package com.bumptech.glide.util;

/* JADX INFO: compiled from: GlideSuppliers.java */
/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: GlideSuppliers.java */
    public class a<T> implements b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile T f41996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f41997b;

        a(b bVar) {
            this.f41997b = bVar;
        }

        @Override // com.bumptech.glide.util.h.b
        public T get() {
            if (this.f41996a == null) {
                synchronized (this) {
                    if (this.f41996a == null) {
                        this.f41996a = (T) m.e(this.f41997b.get());
                    }
                }
            }
            return this.f41996a;
        }
    }

    /* JADX INFO: compiled from: GlideSuppliers.java */
    public interface b<T> {
        T get();
    }

    private h() {
    }

    public static <T> b<T> a(b<T> bVar) {
        return new a(bVar);
    }
}
