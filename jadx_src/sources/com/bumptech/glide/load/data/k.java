package com.bumptech.glide.load.data;

import androidx.annotation.n0;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: InputStreamRewinder.java */
/* JADX INFO: loaded from: classes6.dex */
public final class k implements e<InputStream> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f40865b = 5242880;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RecyclableBufferedInputStream f40866a;

    /* JADX INFO: compiled from: InputStreamRewinder.java */
    public static final class a implements e.a<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.engine.bitmap_recycle.b f40867a;

        public a(com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f40867a = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @n0
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @n0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e<InputStream> b(InputStream inputStream) {
            return new k(inputStream, this.f40867a);
        }
    }

    public k(InputStream inputStream, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, bVar);
        this.f40866a = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
        this.f40866a.release();
    }

    public void c() {
        this.f40866a.b();
    }

    @Override // com.bumptech.glide.load.data.e
    @n0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream a() throws IOException {
        this.f40866a.reset();
        return this.f40866a;
    }
}
