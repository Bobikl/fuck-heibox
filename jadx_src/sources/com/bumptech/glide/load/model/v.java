package com.bumptech.glide.load.model;

import android.util.Log;
import androidx.annotation.n0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: StreamEncoder.java */
/* JADX INFO: loaded from: classes6.dex */
public class v implements com.bumptech.glide.load.a<InputStream> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f41443b = "StreamEncoder";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f41444a;

    public v(com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f41444a = bVar;
    }

    @Override // com.bumptech.glide.load.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(@n0 InputStream inputStream, @n0 File file, @n0 com.bumptech.glide.load.f fVar) throws Throwable {
        byte[] bArr = (byte[]) this.f41444a.c(65536, byte[].class);
        boolean z10 = false;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    while (true) {
                        try {
                            int i10 = inputStream.read(bArr);
                            if (i10 == -1) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, i10);
                        } catch (IOException e10) {
                            e = e10;
                            fileOutputStream = fileOutputStream2;
                            if (Log.isLoggable(f41443b, 3)) {
                                Log.d(f41443b, "Failed to encode data onto the OutputStream", e);
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            this.f41444a.put(bArr);
                            return z10;
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                            this.f41444a.put(bArr);
                            throw th;
                        }
                    }
                    fileOutputStream2.close();
                    z10 = true;
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            } catch (IOException e11) {
                e = e11;
            }
            this.f41444a.put(bArr);
            return z10;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
