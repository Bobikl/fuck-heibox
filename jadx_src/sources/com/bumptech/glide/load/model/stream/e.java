package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.p;
import com.bumptech.glide.load.model.s;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import java.io.InputStream;

/* JADX INFO: compiled from: MediaStoreVideoThumbLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public class e implements o<Uri, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f41410a;

    /* JADX INFO: compiled from: MediaStoreVideoThumbLoader.java */
    public static class a implements p<Uri, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f41411a;

        public a(Context context) {
            this.f41411a = context;
        }

        @Override // com.bumptech.glide.load.model.p
        public void c() {
        }

        @Override // com.bumptech.glide.load.model.p
        @n0
        public o<Uri, InputStream> d(s sVar) {
            return new e(this.f41411a);
        }
    }

    public e(Context context) {
        this.f41410a = context.getApplicationContext();
    }

    private boolean e(com.bumptech.glide.load.f fVar) {
        Long l10 = (Long) fVar.c(VideoDecoder.f41512g);
        return l10 != null && l10.longValue() == -1;
    }

    @Override // com.bumptech.glide.load.model.o
    @p0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> a(@n0 Uri uri, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) {
        if (com.bumptech.glide.load.data.mediastore.b.e(i10, i11) && e(fVar)) {
            return new o.a<>(new com.bumptech.glide.signature.e(uri), com.bumptech.glide.load.data.mediastore.c.g(this.f41410a, uri));
        }
        return null;
    }

    @Override // com.bumptech.glide.load.model.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@n0 Uri uri) {
        return com.bumptech.glide.load.data.mediastore.b.d(uri);
    }
}
