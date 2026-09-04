package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.util.o;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* JADX INFO: compiled from: ByteBufferGifDecoder.java */
/* JADX INFO: loaded from: classes6.dex */
public class a implements com.bumptech.glide.load.g<ByteBuffer, c> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f41659f = "BufferGifDecoder";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final C0341a f41660g = new C0341a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b f41661h = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f41662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<ImageHeaderParser> f41663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f41664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0341a f41665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.resource.gif.b f41666e;

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.gif.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ByteBufferGifDecoder.java */
    @j1
    public static class C0341a {
        C0341a() {
        }

        com.bumptech.glide.gifdecoder.a a(com.bumptech.glide.gifdecoder.a.InterfaceC0323a interfaceC0323a, com.bumptech.glide.gifdecoder.c cVar, ByteBuffer byteBuffer, int i10) {
            return new com.bumptech.glide.gifdecoder.f(interfaceC0323a, cVar, byteBuffer, i10);
        }
    }

    /* JADX INFO: compiled from: ByteBufferGifDecoder.java */
    @j1
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Queue<com.bumptech.glide.gifdecoder.d> f41667a = o.g(0);

        b() {
        }

        synchronized com.bumptech.glide.gifdecoder.d a(ByteBuffer byteBuffer) {
            com.bumptech.glide.gifdecoder.d dVarPoll;
            dVarPoll = this.f41667a.poll();
            if (dVarPoll == null) {
                dVarPoll = new com.bumptech.glide.gifdecoder.d();
            }
            return dVarPoll.q(byteBuffer);
        }

        synchronized void b(com.bumptech.glide.gifdecoder.d dVar) {
            dVar.a();
            this.f41667a.offer(dVar);
        }
    }

    public a(Context context) {
        this(context, Glide.e(context).n().g(), Glide.e(context).h(), Glide.e(context).g());
    }

    public a(Context context, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this(context, list, eVar, bVar, f41661h, f41660g);
    }

    @j1
    a(Context context, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar, b bVar2, C0341a c0341a) {
        this.f41662a = context.getApplicationContext();
        this.f41663b = list;
        this.f41665d = c0341a;
        this.f41666e = new com.bumptech.glide.load.resource.gif.b(eVar, bVar);
        this.f41664c = bVar2;
    }

    @p0
    private e c(ByteBuffer byteBuffer, int i10, int i11, com.bumptech.glide.gifdecoder.d dVar, com.bumptech.glide.load.f fVar) {
        long jB = com.bumptech.glide.util.i.b();
        try {
            com.bumptech.glide.gifdecoder.c cVarD = dVar.d();
            if (cVarD.b() > 0 && cVarD.c() == 0) {
                Bitmap.Config config = fVar.c(i.f41714a) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                com.bumptech.glide.gifdecoder.a aVarA = this.f41665d.a(this.f41666e, cVarD, byteBuffer, e(cVarD, i10, i11));
                aVarA.b(config);
                aVarA.j();
                Bitmap bitmapI = aVarA.i();
                if (bitmapI == null) {
                    return null;
                }
                return new e(new c(this.f41662a, aVarA, com.bumptech.glide.load.resource.c.c(), i10, i11, bitmapI));
            }
            return null;
        } finally {
            if (Log.isLoggable(f41659f, 2)) {
                Log.v(f41659f, "Decoded GIF from stream in " + com.bumptech.glide.util.i.a(jB));
            }
        }
    }

    private static int e(com.bumptech.glide.gifdecoder.c cVar, int i10, int i11) {
        int iMin = Math.min(cVar.a() / i11, cVar.d() / i10);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable(f41659f, 2) && iMax > 1) {
            Log.v(f41659f, "Downsampling GIF, sampleSize: " + iMax + ", target dimens: [" + i10 + "x" + i11 + "], actual dimens: [" + cVar.d() + "x" + cVar.a() + "]");
        }
        return iMax;
    }

    @Override // com.bumptech.glide.load.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public e b(@n0 ByteBuffer byteBuffer, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) {
        com.bumptech.glide.gifdecoder.d dVarA = this.f41664c.a(byteBuffer);
        try {
            return c(byteBuffer, i10, i11, dVarA, fVar);
        } finally {
            this.f41664c.b(dVarA);
        }
    }

    @Override // com.bumptech.glide.load.g
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(@n0 ByteBuffer byteBuffer, @n0 com.bumptech.glide.load.f fVar) throws IOException {
        return !((Boolean) fVar.c(i.f41715b)).booleanValue() && com.bumptech.glide.load.b.g(this.f41663b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }
}
