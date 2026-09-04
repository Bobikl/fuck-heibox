package com.bumptech.glide.load.resource.drawable;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.n0;
import androidx.annotation.w0;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.util.o;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: AnimatedWebpDecoder.java */
/* JADX INFO: loaded from: classes6.dex */
@w0(28)
@Deprecated
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ImageHeaderParser> f41642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f41643b;

    /* JADX INFO: compiled from: AnimatedWebpDecoder.java */
    public static final class a implements s<Drawable> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f41644c = 2;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AnimatedImageDrawable f41645b;

        a(AnimatedImageDrawable animatedImageDrawable) {
            this.f41645b = animatedImageDrawable;
        }

        @Override // com.bumptech.glide.load.engine.s
        public int a() {
            return this.f41645b.getIntrinsicWidth() * this.f41645b.getIntrinsicHeight() * o.j(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // com.bumptech.glide.load.engine.s
        @n0
        public Class<Drawable> b() {
            return Drawable.class;
        }

        @Override // com.bumptech.glide.load.engine.s
        @n0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f41645b;
        }

        @Override // com.bumptech.glide.load.engine.s
        public void recycle() {
            this.f41645b.stop();
            this.f41645b.clearAnimationCallbacks();
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.drawable.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AnimatedWebpDecoder.java */
    public static final class C0340b implements com.bumptech.glide.load.g<ByteBuffer, Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f41646a;

        C0340b(b bVar) {
            this.f41646a = bVar;
        }

        @Override // com.bumptech.glide.load.g
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public s<Drawable> b(@n0 ByteBuffer byteBuffer, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) throws IOException {
            return this.f41646a.b(ImageDecoder.createSource(byteBuffer), i10, i11, fVar);
        }

        @Override // com.bumptech.glide.load.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(@n0 ByteBuffer byteBuffer, @n0 com.bumptech.glide.load.f fVar) throws IOException {
            return this.f41646a.d(byteBuffer);
        }
    }

    /* JADX INFO: compiled from: AnimatedWebpDecoder.java */
    public static final class c implements com.bumptech.glide.load.g<InputStream, Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f41647a;

        c(b bVar) {
            this.f41647a = bVar;
        }

        @Override // com.bumptech.glide.load.g
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public s<Drawable> b(@n0 InputStream inputStream, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) throws IOException {
            return this.f41647a.b(ImageDecoder.createSource(com.bumptech.glide.util.a.b(inputStream)), i10, i11, fVar);
        }

        @Override // com.bumptech.glide.load.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(@n0 InputStream inputStream, @n0 com.bumptech.glide.load.f fVar) throws IOException {
            return this.f41647a.c(inputStream);
        }
    }

    private b(List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f41642a = list;
        this.f41643b = bVar;
    }

    public static com.bumptech.glide.load.g<ByteBuffer, Drawable> a(List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        return new C0340b(new b(list, bVar));
    }

    private boolean e(ImageHeaderParser.ImageType imageType) {
        return imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP;
    }

    public static com.bumptech.glide.load.g<InputStream, Drawable> f(List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        return new c(new b(list, bVar));
    }

    s<Drawable> b(@n0 ImageDecoder.Source source, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new com.bumptech.glide.load.resource.a(i10, i11, fVar));
        if (drawableDecodeDrawable instanceof AnimatedImageDrawable) {
            return new a((AnimatedImageDrawable) drawableDecodeDrawable);
        }
        throw new IOException("Received unexpected drawable type for animated webp, failing: " + drawableDecodeDrawable);
    }

    boolean c(InputStream inputStream) throws IOException {
        return e(com.bumptech.glide.load.b.f(this.f41642a, inputStream, this.f41643b));
    }

    boolean d(ByteBuffer byteBuffer) throws IOException {
        return e(com.bumptech.glide.load.b.g(this.f41642a, byteBuffer));
    }
}
