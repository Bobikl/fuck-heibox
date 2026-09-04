package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.n0;
import com.bumptech.glide.Glide;
import java.security.MessageDigest;

/* JADX INFO: compiled from: DrawableTransformation.java */
/* JADX INFO: loaded from: classes6.dex */
public class q implements com.bumptech.glide.load.i<Drawable> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.i<Bitmap> f41590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f41591d;

    public q(com.bumptech.glide.load.i<Bitmap> iVar, boolean z10) {
        this.f41590c = iVar;
        this.f41591d = z10;
    }

    private com.bumptech.glide.load.engine.s<Drawable> d(Context context, com.bumptech.glide.load.engine.s<Bitmap> sVar) {
        return x.d(context.getResources(), sVar);
    }

    @Override // com.bumptech.glide.load.i
    @n0
    public com.bumptech.glide.load.engine.s<Drawable> a(@n0 Context context, @n0 com.bumptech.glide.load.engine.s<Drawable> sVar, int i10, int i11) {
        com.bumptech.glide.load.engine.bitmap_recycle.e eVarH = Glide.e(context).h();
        Drawable drawable = sVar.get();
        com.bumptech.glide.load.engine.s<Bitmap> sVarA = p.a(eVarH, drawable, i10, i11);
        if (sVarA != null) {
            com.bumptech.glide.load.engine.s<Bitmap> sVarA2 = this.f41590c.a(context, sVarA, i10, i11);
            if (!sVarA2.equals(sVarA)) {
                return d(context, sVarA2);
            }
            sVarA2.recycle();
            return sVar;
        }
        if (!this.f41591d) {
            return sVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // com.bumptech.glide.load.c
    public void b(@n0 MessageDigest messageDigest) {
        this.f41590c.b(messageDigest);
    }

    public com.bumptech.glide.load.i<BitmapDrawable> c() {
        return this;
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f41590c.equals(((q) obj).f41590c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return this.f41590c.hashCode();
    }
}
