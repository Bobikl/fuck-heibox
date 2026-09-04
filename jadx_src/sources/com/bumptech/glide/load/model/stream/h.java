package com.bumptech.glide.load.model.stream;

import androidx.annotation.n0;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.p;
import com.bumptech.glide.load.model.s;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: compiled from: UrlLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public class h implements o<URL, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o<com.bumptech.glide.load.model.h, InputStream> f41429a;

    /* JADX INFO: compiled from: UrlLoader.java */
    public static class a implements p<URL, InputStream> {
        @Override // com.bumptech.glide.load.model.p
        public void c() {
        }

        @Override // com.bumptech.glide.load.model.p
        @n0
        public o<URL, InputStream> d(s sVar) {
            return new h(sVar.d(com.bumptech.glide.load.model.h.class, InputStream.class));
        }
    }

    public h(o<com.bumptech.glide.load.model.h, InputStream> oVar) {
        this.f41429a = oVar;
    }

    @Override // com.bumptech.glide.load.model.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> a(@n0 URL url, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) {
        return this.f41429a.a(new com.bumptech.glide.load.model.h(url), i10, i11, fVar);
    }

    @Override // com.bumptech.glide.load.model.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@n0 URL url) {
        return true;
    }
}
