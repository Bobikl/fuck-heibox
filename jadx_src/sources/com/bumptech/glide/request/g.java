package com.bumptech.glide.request;

import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.target.p;

/* JADX INFO: compiled from: RequestListener.java */
/* JADX INFO: loaded from: classes6.dex */
public interface g<R> {
    boolean a(@p0 GlideException glideException, @p0 Object obj, @n0 p<R> pVar, boolean z10);

    boolean b(@n0 R r10, @n0 Object obj, p<R> pVar, @n0 DataSource dataSource, boolean z10);
}
