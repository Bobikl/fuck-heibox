package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.n0;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.p;
import com.bumptech.glide.load.model.s;
import java.io.InputStream;

/* JADX INFO: compiled from: MediaStoreImageThumbLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public class d implements o<Uri, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f41408a;

    /* JADX INFO: compiled from: MediaStoreImageThumbLoader.java */
    public static class a implements p<Uri, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f41409a;

        public a(Context context) {
            this.f41409a = context;
        }

        @Override // com.bumptech.glide.load.model.p
        public void c() {
        }

        @Override // com.bumptech.glide.load.model.p
        @n0
        public o<Uri, InputStream> d(s sVar) {
            return new d(this.f41409a);
        }
    }

    public d(Context context) {
        this.f41408a = context.getApplicationContext();
    }

    @Override // com.bumptech.glide.load.model.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> a(@n0 Uri uri, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) {
        if (com.bumptech.glide.load.data.mediastore.b.e(i10, i11)) {
            return new o.a<>(new com.bumptech.glide.signature.e(uri), com.bumptech.glide.load.data.mediastore.c.f(this.f41408a, uri));
        }
        return null;
    }

    @Override // com.bumptech.glide.load.model.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@n0 Uri uri) {
        return com.bumptech.glide.load.data.mediastore.b.b(uri);
    }
}
