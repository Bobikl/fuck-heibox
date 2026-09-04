package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import androidx.annotation.n0;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.s;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: GifDrawableEncoder.java */
/* JADX INFO: loaded from: classes6.dex */
public class d implements com.bumptech.glide.load.h<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f41685a = "GifEncoder";

    @Override // com.bumptech.glide.load.h
    @n0
    public EncodeStrategy b(@n0 com.bumptech.glide.load.f fVar) {
        return EncodeStrategy.SOURCE;
    }

    @Override // com.bumptech.glide.load.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(@n0 s<c> sVar, @n0 File file, @n0 com.bumptech.glide.load.f fVar) throws Throwable {
        try {
            com.bumptech.glide.util.a.f(sVar.get().e(), file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable(f41685a, 5)) {
                Log.w(f41685a, "Failed to encode GIF drawable data", e10);
            }
            return false;
        }
    }
}
