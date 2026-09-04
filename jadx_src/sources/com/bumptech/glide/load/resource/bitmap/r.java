package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.n0;
import androidx.annotation.w0;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ExifInterfaceImageHeaderParser.java */
/* JADX INFO: loaded from: classes6.dex */
@w0(27)
public final class r implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int a(@n0 ByteBuffer byteBuffer, @n0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        return c(com.bumptech.glide.util.a.g(byteBuffer), bVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @n0
    public ImageHeaderParser.ImageType b(@n0 InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int c(@n0 InputStream inputStream, @n0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        int iL = new androidx.exifinterface.media.a(inputStream).l(androidx.exifinterface.media.a.C, 1);
        if (iL == 0) {
            return -1;
        }
        return iL;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @n0
    public ImageHeaderParser.ImageType d(@n0 ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
