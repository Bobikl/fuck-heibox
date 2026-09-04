package com.max.hbimage.image;

import android.graphics.Bitmap;
import androidx.annotation.n0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: RoundedCornersTransformation.java */
/* JADX INFO: loaded from: classes10.dex */
public class s extends com.bumptech.glide.load.resource.bitmap.h {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f70496f = "com.frank.glide.transformations.RoundedCornersTransformation";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f70497g = f70496f.getBytes(com.bumptech.glide.load.c.f40833b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f70498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f70499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f70500e;

    public s(int i10, int i11) {
        this(i10, i11, 0);
    }

    public s(int i10, int i11, int i12) {
        this.f70498c = i10;
        this.f70499d = i11;
        this.f70500e = i12;
    }

    @Override // com.bumptech.glide.load.c
    public void b(MessageDigest messageDigest) {
        if (PatchProxy.proxy(new Object[]{messageDigest}, this, changeQuickRedirect, false, bb.c.g.Xd, new Class[]{MessageDigest.class}, Void.TYPE).isSupported) {
            return;
        }
        messageDigest.update(f70497g);
        messageDigest.update(ByteBuffer.allocate(4).putInt((((this.f70498c * 31) + this.f70499d) * 31) + this.f70500e).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.h
    public Bitmap c(@n0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @n0 Bitmap bitmap, int i10, int i11) {
        Object[] objArr = {eVar, bitmap, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.g.Ud, new Class[]{com.bumptech.glide.load.engine.bitmap_recycle.e.class, Bitmap.class, cls, cls}, Bitmap.class);
        return patchProxyResultProxy.isSupported ? (Bitmap) patchProxyResultProxy.result : k.m(eVar, bitmap, this.f70498c, this.f70499d, this.f70500e);
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.g.Vd, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return this.f70498c == sVar.f70498c && this.f70499d == sVar.f70499d && this.f70500e == sVar.f70500e;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Wd, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (-1198211824) + (((this.f70498c * 31) + this.f70499d) * 31) + this.f70500e;
    }
}
