package com.bumptech.glide.load.engine;

import androidx.annotation.p0;
import com.bumptech.glide.load.DataSource;

/* JADX INFO: compiled from: DataFetcherGenerator.java */
/* JADX INFO: loaded from: classes6.dex */
public interface e {

    /* JADX INFO: compiled from: DataFetcherGenerator.java */
    public interface a {
        void b(com.bumptech.glide.load.c cVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource);

        void c();

        void d(com.bumptech.glide.load.c cVar, @p0 Object obj, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource, com.bumptech.glide.load.c cVar2);
    }

    boolean a();

    void cancel();
}
