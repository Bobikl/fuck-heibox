package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.n0;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.util.m;
import java.security.MessageDigest;

/* JADX INFO: compiled from: GifDrawableTransformation.java */
/* JADX INFO: loaded from: classes6.dex */
public class f implements com.bumptech.glide.load.i<c> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.i<Bitmap> f41686c;

    public f(com.bumptech.glide.load.i<Bitmap> iVar) {
        this.f41686c = (com.bumptech.glide.load.i) m.e(iVar);
    }

    @Override // com.bumptech.glide.load.i
    @n0
    public s<c> a(@n0 Context context, @n0 s<c> sVar, int i10, int i11) {
        c cVar = sVar.get();
        s<Bitmap> gVar = new com.bumptech.glide.load.resource.bitmap.g(cVar.g(), Glide.e(context).h());
        s<Bitmap> sVarA = this.f41686c.a(context, gVar, i10, i11);
        if (!gVar.equals(sVarA)) {
            gVar.recycle();
        }
        cVar.q(this.f41686c, sVarA.get());
        return sVar;
    }

    @Override // com.bumptech.glide.load.c
    public void b(@n0 MessageDigest messageDigest) {
        this.f41686c.b(messageDigest);
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f41686c.equals(((f) obj).f41686c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return this.f41686c.hashCode();
    }
}
