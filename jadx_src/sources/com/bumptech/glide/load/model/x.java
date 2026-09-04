package com.bumptech.glide.load.model;

import androidx.annotation.n0;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* JADX INFO: compiled from: UnitModelLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public class x<Model> implements o<Model, Model> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final x<?> f41446a = new x<>();

    /* JADX INFO: compiled from: UnitModelLoader.java */
    public static class a<Model> implements p<Model, Model> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a<?> f41447a = new a<>();

        @Deprecated
        public a() {
        }

        public static <T> a<T> a() {
            return (a<T>) f41447a;
        }

        @Override // com.bumptech.glide.load.model.p
        public void c() {
        }

        @Override // com.bumptech.glide.load.model.p
        @n0
        public o<Model, Model> d(s sVar) {
            return x.c();
        }
    }

    /* JADX INFO: compiled from: UnitModelLoader.java */
    public static class b<Model> implements com.bumptech.glide.load.data.d<Model> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Model f41448b;

        b(Model model) {
            this.f41448b = model;
        }

        @Override // com.bumptech.glide.load.data.d
        @n0
        public Class<Model> a() {
            return (Class<Model>) this.f41448b.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        @n0
        public DataSource c() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void d(@n0 Priority priority, @n0 com.bumptech.glide.load.data.d.a<? super Model> aVar) {
            aVar.e(this.f41448b);
        }
    }

    @Deprecated
    public x() {
    }

    public static <T> x<T> c() {
        return (x<T>) f41446a;
    }

    @Override // com.bumptech.glide.load.model.o
    public o.a<Model> a(@n0 Model model, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) {
        return new o.a<>(new com.bumptech.glide.signature.e(model), new b(model));
    }

    @Override // com.bumptech.glide.load.model.o
    public boolean b(@n0 Model model) {
        return true;
    }
}
