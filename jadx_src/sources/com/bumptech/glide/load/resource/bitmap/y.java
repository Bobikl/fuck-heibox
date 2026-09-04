package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.io.IOException;

/* JADX INFO: compiled from: ParcelFileDescriptorBitmapDecoder.java */
/* JADX INFO: loaded from: classes6.dex */
@w0(21)
public final class y implements com.bumptech.glide.load.g<ParcelFileDescriptor, Bitmap> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f41631b = 536870912;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f41632a;

    public y(o oVar) {
        this.f41632a = oVar;
    }

    private boolean e(@n0 ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }

    @Override // com.bumptech.glide.load.g
    @p0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.s<Bitmap> b(@n0 ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) throws IOException {
        return this.f41632a.d(parcelFileDescriptor, i10, i11, fVar);
    }

    @Override // com.bumptech.glide.load.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@n0 ParcelFileDescriptor parcelFileDescriptor, @n0 com.bumptech.glide.load.f fVar) {
        return e(parcelFileDescriptor) && this.f41632a.r(parcelFileDescriptor);
    }
}
