package com.bumptech.glide.load.model;

import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: ModelLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public interface o<Model, Data> {

    /* JADX INFO: compiled from: ModelLoader.java */
    public static class a<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.load.c f41378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<com.bumptech.glide.load.c> f41379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.d<Data> f41380c;

        public a(@n0 com.bumptech.glide.load.c cVar, @n0 com.bumptech.glide.load.data.d<Data> dVar) {
            this(cVar, Collections.emptyList(), dVar);
        }

        public a(@n0 com.bumptech.glide.load.c cVar, @n0 List<com.bumptech.glide.load.c> list, @n0 com.bumptech.glide.load.data.d<Data> dVar) {
            this.f41378a = (com.bumptech.glide.load.c) com.bumptech.glide.util.m.e(cVar);
            this.f41379b = (List) com.bumptech.glide.util.m.e(list);
            this.f41380c = (com.bumptech.glide.load.data.d) com.bumptech.glide.util.m.e(dVar);
        }
    }

    @p0
    a<Data> a(@n0 Model model, int i10, int i11, @n0 com.bumptech.glide.load.f fVar);

    boolean b(@n0 Model model);
}
