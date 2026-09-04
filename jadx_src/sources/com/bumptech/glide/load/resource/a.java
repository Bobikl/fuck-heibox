package com.bumptech.glide.load.resource;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import androidx.annotation.n0;
import androidx.annotation.w0;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.o;
import com.bumptech.glide.load.resource.bitmap.u;

/* JADX INFO: compiled from: DefaultOnHeaderDecodedListener.java */
/* JADX INFO: loaded from: classes6.dex */
@w0(api = 28)
public final class a implements ImageDecoder.OnHeaderDecodedListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f41456h = "ImageDecoder";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f41457a = u.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f41459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final DecodeFormat f41460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final DownsampleStrategy f41461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f41462f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final PreferredColorSpace f41463g;

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DefaultOnHeaderDecodedListener.java */
    public class C0338a implements ImageDecoder.OnPartialImageListener {
        C0338a() {
        }

        public boolean onPartialImage(@n0 ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public a(int i10, int i11, @n0 f fVar) {
        this.f41458b = i10;
        this.f41459c = i11;
        this.f41460d = (DecodeFormat) fVar.c(o.f41572g);
        this.f41461e = (DownsampleStrategy) fVar.c(DownsampleStrategy.f41501h);
        e<Boolean> eVar = o.f41576k;
        this.f41462f = fVar.c(eVar) != null && ((Boolean) fVar.c(eVar)).booleanValue();
        this.f41463g = (PreferredColorSpace) fVar.c(o.f41573h);
    }

    public void onHeaderDecoded(@n0 ImageDecoder imageDecoder, @n0 ImageDecoder.ImageInfo imageInfo, @n0 ImageDecoder.Source source) {
        boolean z10 = false;
        if (this.f41457a.g(this.f41458b, this.f41459c, this.f41462f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f41460d == DecodeFormat.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C0338a());
        Size size = imageInfo.getSize();
        int width = this.f41458b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f41459c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.f41461e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(size.getHeight() * fB);
        if (Log.isLoggable(f41456h, 2)) {
            Log.v(f41456h, "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fB);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        PreferredColorSpace preferredColorSpace = this.f41463g;
        if (preferredColorSpace != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 28) {
                if (i10 >= 26) {
                    imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
                }
            } else {
                if (preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z10 = true;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(z10 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            }
        }
    }
}
