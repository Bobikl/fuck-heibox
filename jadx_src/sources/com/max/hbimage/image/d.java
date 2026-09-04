package com.max.hbimage.image;

import android.graphics.Bitmap;
import androidx.annotation.n0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: CropTransformation.java */
/* JADX INFO: loaded from: classes10.dex */
public class d extends com.bumptech.glide.load.resource.bitmap.h {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f70438f = "com.frank.glide.transformations.CropTransformation";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f70439g = f70438f.getBytes(com.bumptech.glide.load.c.f40833b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f70440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f70441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f70442e;

    public d(int i10, int i11) {
        this(i10, i11, 1);
    }

    public d(int i10, int i11, int i12) {
        this.f70440c = i10;
        this.f70441d = i11;
        this.f70442e = i12;
    }

    @Override // com.bumptech.glide.load.c
    public void b(MessageDigest messageDigest) {
        if (PatchProxy.proxy(new Object[]{messageDigest}, this, changeQuickRedirect, false, bb.c.g.W6, new Class[]{MessageDigest.class}, Void.TYPE).isSupported) {
            return;
        }
        messageDigest.update(f70439g);
        messageDigest.update(ByteBuffer.allocate(4).putInt((((this.f70440c * 31) + this.f70441d) * 31) + this.f70442e).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.h
    public Bitmap c(@n0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @n0 Bitmap bitmap, int i10, int i11) {
        Object[] objArr = {eVar, bitmap, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.g.U6, new Class[]{com.bumptech.glide.load.engine.bitmap_recycle.e.class, Bitmap.class, cls, cls}, Bitmap.class);
        return patchProxyResultProxy.isSupported ? (Bitmap) patchProxyResultProxy.result : k.d(eVar, bitmap, this.f70440c, this.f70441d, this.f70442e);
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.g.V6, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f70440c == dVar.f70440c && this.f70441d == dVar.f70441d && this.f70442e == dVar.f70442e;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return (((this.f70440c * 31) + this.f70441d) * 31) + this.f70442e;
    }
}
