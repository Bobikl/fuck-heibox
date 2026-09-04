package com.bumptech.glide.integration.okhttp3;

import android.content.Context;
import androidx.annotation.n0;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.model.h;
import java.io.InputStream;
import s6.c;
import y6.d;

/* JADX INFO: compiled from: OkHttpLibraryGlideModule.java */
/* JADX INFO: loaded from: classes6.dex */
@c
public final class a extends d {
    @Override // y6.d, y6.f
    public void b(@n0 Context context, @n0 Glide glide, @n0 Registry registry) {
        registry.y(h.class, InputStream.class, new b.a());
    }
}
