package com.bumptech.glide.load;

import androidx.annotation.n0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public interface ImageHeaderParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f40819a = -1;

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);

        private final boolean hasAlpha;

        ImageType(boolean z10) {
            this.hasAlpha = z10;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }

        public boolean isWebp() {
            int i10 = a.f40820a[ordinal()];
            return i10 == 1 || i10 == 2 || i10 == 3;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40820a;

        static {
            int[] iArr = new int[ImageType.values().length];
            f40820a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40820a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40820a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    int a(@n0 ByteBuffer byteBuffer, @n0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException;

    @n0
    ImageType b(@n0 InputStream inputStream) throws IOException;

    int c(@n0 InputStream inputStream, @n0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException;

    @n0
    ImageType d(@n0 ByteBuffer byteBuffer) throws IOException;
}
