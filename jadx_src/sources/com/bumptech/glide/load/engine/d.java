package com.bumptech.glide.load.engine;

import androidx.annotation.n0;
import java.io.File;

/* JADX INFO: compiled from: DataCacheWriter.java */
/* JADX INFO: loaded from: classes6.dex */
public class d<DataType> implements com.bumptech.glide.load.engine.cache.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.a<DataType> f41090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DataType f41091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.f f41092c;

    d(com.bumptech.glide.load.a<DataType> aVar, DataType datatype, com.bumptech.glide.load.f fVar) {
        this.f41090a = aVar;
        this.f41091b = datatype;
        this.f41092c = fVar;
    }

    @Override // com.bumptech.glide.load.engine.cache.a.b
    public boolean a(@n0 File file) {
        return this.f41090a.a(this.f41091b, file, this.f41092c);
    }
}
