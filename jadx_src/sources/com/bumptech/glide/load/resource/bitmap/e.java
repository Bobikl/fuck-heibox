package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: BitmapEncoder.java */
/* JADX INFO: loaded from: classes6.dex */
public class e implements com.bumptech.glide.load.h<Bitmap> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.bumptech.glide.load.e<Integer> f41553b = com.bumptech.glide.load.e.g("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.bumptech.glide.load.e<Bitmap.CompressFormat> f41554c = com.bumptech.glide.load.e.f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f41555d = "BitmapEncoder";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f41556a;

    @Deprecated
    public e() {
        this.f41556a = null;
    }

    public e(@n0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f41556a = bVar;
    }

    private Bitmap.CompressFormat d(Bitmap bitmap, com.bumptech.glide.load.f fVar) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) fVar.c(f41554c);
        if (compressFormat != null) {
            return compressFormat;
        }
        return bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // com.bumptech.glide.load.h
    @n0
    public EncodeStrategy b(@n0 com.bumptech.glide.load.f fVar) {
        return EncodeStrategy.TRANSFORMED;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0070 A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #2 {all -> 0x00c0, blocks: (B:3:0x0021, B:13:0x004d, B:29:0x006a, B:31:0x0070, B:35:0x00bc, B:36:0x00bf), top: B:46:0x0021 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x0070, please report this as an issue */
    @Override // com.bumptech.glide.load.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(@n0 com.bumptech.glide.load.engine.s<Bitmap> sVar, @n0 File file, @n0 com.bumptech.glide.load.f fVar) {
        Bitmap bitmap = sVar.get();
        Bitmap.CompressFormat compressFormatD = d(bitmap, fVar);
        com.bumptech.glide.util.pool.b.e("encode: [%dx%d] %s", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), compressFormatD);
        try {
            long jB = com.bumptech.glide.util.i.b();
            int iIntValue = ((Integer) fVar.c(f41553b)).intValue();
            boolean z10 = false;
            OutputStream cVar = null;
            try {
                try {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            cVar = this.f41556a != null ? new com.bumptech.glide.load.data.c(fileOutputStream, this.f41556a) : fileOutputStream;
                            bitmap.compress(compressFormatD, iIntValue, cVar);
                            cVar.close();
                            z10 = true;
                        } catch (IOException e10) {
                            e = e10;
                            cVar = fileOutputStream;
                            if (Log.isLoggable(f41555d, 3)) {
                                Log.d(f41555d, "Failed to encode Bitmap", e);
                            }
                            if (cVar != null) {
                            }
                            if (Log.isLoggable(f41555d, 2)) {
                                Log.v(f41555d, "Compressed with type: " + compressFormatD + " of size " + com.bumptech.glide.util.o.i(bitmap) + " in " + com.bumptech.glide.util.i.a(jB) + ", options format: " + fVar.c(f41554c) + ", hasAlpha: " + bitmap.hasAlpha());
                            }
                            com.bumptech.glide.util.pool.b.f();
                            return z10;
                        } catch (Throwable th2) {
                            th = th2;
                            cVar = fileOutputStream;
                            if (cVar != null) {
                                try {
                                    cVar.close();
                                } catch (IOException unused) {
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e11) {
                        e = e11;
                    }
                    cVar.close();
                } catch (IOException unused2) {
                }
                if (Log.isLoggable(f41555d, 2)) {
                    Log.v(f41555d, "Compressed with type: " + compressFormatD + " of size " + com.bumptech.glide.util.o.i(bitmap) + " in " + com.bumptech.glide.util.i.a(jB) + ", options format: " + fVar.c(f41554c) + ", hasAlpha: " + bitmap.hasAlpha());
                }
                com.bumptech.glide.util.pool.b.f();
                return z10;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            com.bumptech.glide.util.pool.b.f();
            throw th4;
        }
    }
}
