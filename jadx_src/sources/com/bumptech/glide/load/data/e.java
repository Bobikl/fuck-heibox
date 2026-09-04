package com.bumptech.glide.load.data;

import androidx.annotation.n0;
import java.io.IOException;

/* JADX INFO: compiled from: DataRewinder.java */
/* JADX INFO: loaded from: classes6.dex */
public interface e<T> {

    /* JADX INFO: compiled from: DataRewinder.java */
    public interface a<T> {
        @n0
        Class<T> a();

        @n0
        e<T> b(@n0 T t10);
    }

    @n0
    T a() throws IOException;

    void b();
}
