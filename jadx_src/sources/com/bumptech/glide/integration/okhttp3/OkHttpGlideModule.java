package com.bumptech.glide.integration.okhttp3;

import android.content.Context;
import androidx.annotation.n0;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.model.h;
import java.io.InputStream;
import y6.c;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class OkHttpGlideModule implements c {
    @Override // y6.b
    public void a(@n0 Context context, @n0 com.bumptech.glide.c cVar) {
    }

    @Override // y6.f
    public void b(Context context, Glide glide, Registry registry) {
        registry.y(h.class, InputStream.class, new b.a());
    }
}
