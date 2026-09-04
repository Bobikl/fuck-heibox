package com.bumptech.glide.load.model;

import android.util.Log;
import androidx.annotation.n0;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ByteBufferEncoder.java */
/* JADX INFO: loaded from: classes6.dex */
public class c implements com.bumptech.glide.load.a<ByteBuffer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f41320a = "ByteBufferEncoder";

    @Override // com.bumptech.glide.load.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(@n0 ByteBuffer byteBuffer, @n0 File file, @n0 com.bumptech.glide.load.f fVar) throws Throwable {
        try {
            com.bumptech.glide.util.a.f(byteBuffer, file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable(f41320a, 3)) {
                Log.d(f41320a, "Failed to write data", e10);
            }
            return false;
        }
    }
}
