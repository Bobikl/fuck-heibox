package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import androidx.annotation.n0;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.s;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: StreamGifDecoder.java */
/* JADX INFO: loaded from: classes6.dex */
public class j implements com.bumptech.glide.load.g<InputStream, c> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f41716d = "StreamGifDecoder";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ImageHeaderParser> f41717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.g<ByteBuffer, c> f41718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f41719c;

    public j(List<ImageHeaderParser> list, com.bumptech.glide.load.g<ByteBuffer, c> gVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f41717a = list;
        this.f41718b = gVar;
        this.f41719c = bVar;
    }

    private static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (IOException e10) {
            if (!Log.isLoggable(f41716d, 5)) {
                return null;
            }
            Log.w(f41716d, "Error reading data from stream", e10);
            return null;
        }
    }

    @Override // com.bumptech.glide.load.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public s<c> b(@n0 InputStream inputStream, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) throws IOException {
        byte[] bArrE = e(inputStream);
        if (bArrE == null) {
            return null;
        }
        return this.f41718b.b(ByteBuffer.wrap(bArrE), i10, i11, fVar);
    }

    @Override // com.bumptech.glide.load.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@n0 InputStream inputStream, @n0 com.bumptech.glide.load.f fVar) throws IOException {
        return !((Boolean) fVar.c(i.f41715b)).booleanValue() && com.bumptech.glide.load.b.f(this.f41717a, inputStream, this.f41719c) == ImageHeaderParser.ImageType.GIF;
    }
}
