package com.bumptech.glide.load.data;

import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* JADX INFO: compiled from: DataFetcher.java */
/* JADX INFO: loaded from: classes6.dex */
public interface d<T> {

    /* JADX INFO: compiled from: DataFetcher.java */
    public interface a<T> {
        void e(@p0 T t10);

        void f(@n0 Exception exc);
    }

    @n0
    Class<T> a();

    void b();

    @n0
    DataSource c();

    void cancel();

    void d(@n0 Priority priority, @n0 a<? super T> aVar);
}
