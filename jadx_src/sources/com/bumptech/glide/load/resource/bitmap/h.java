package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.n0;
import com.bumptech.glide.Glide;

/* JADX INFO: compiled from: BitmapTransformation.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class h implements com.bumptech.glide.load.i<Bitmap> {
    @Override // com.bumptech.glide.load.i
    @n0
    public final com.bumptech.glide.load.engine.s<Bitmap> a(@n0 Context context, @n0 com.bumptech.glide.load.engine.s<Bitmap> sVar, int i10, int i11) {
        if (!com.bumptech.glide.util.o.x(i10, i11)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        com.bumptech.glide.load.engine.bitmap_recycle.e eVarH = Glide.e(context).h();
        Bitmap bitmap = sVar.get();
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getWidth();
        }
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(eVarH, bitmap, i10, i11);
        return bitmap.equals(bitmapC) ? sVar : g.d(bitmapC, eVarH);
    }

    protected abstract Bitmap c(@n0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @n0 Bitmap bitmap, int i10, int i11);
}
