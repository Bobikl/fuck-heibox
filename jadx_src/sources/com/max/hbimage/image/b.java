package com.max.hbimage.image;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.n0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: BlurTransformation.java */
/* JADX INFO: loaded from: classes10.dex */
public class b extends com.bumptech.glide.load.resource.bitmap.h {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f70433f = "com.frank.glide.transformations.BlurTransformation";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f70434g = f70433f.getBytes(com.bumptech.glide.load.c.f40833b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f70435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f70436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f70437e;

    public b(Context context) {
        this(context, 20);
    }

    public b(Context context, int i10) {
        this(context, i10, 1);
    }

    public b(Context context, int i10, int i11) {
        this.f70435c = context;
        this.f70436d = i10;
        this.f70437e = i11;
    }

    @Override // com.bumptech.glide.load.c
    public void b(MessageDigest messageDigest) {
        if (PatchProxy.proxy(new Object[]{messageDigest}, this, changeQuickRedirect, false, bb.c.g.M6, new Class[]{MessageDigest.class}, Void.TYPE).isSupported) {
            return;
        }
        messageDigest.update(f70434g);
        messageDigest.update(ByteBuffer.allocate(4).putInt((this.f70436d * 31) + this.f70437e).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.h
    public Bitmap c(@n0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @n0 Bitmap bitmap, int i10, int i11) {
        Object[] objArr = {eVar, bitmap, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.g.J6, new Class[]{com.bumptech.glide.load.engine.bitmap_recycle.e.class, Bitmap.class, cls, cls}, Bitmap.class);
        return patchProxyResultProxy.isSupported ? (Bitmap) patchProxyResultProxy.result : k.b(eVar, bitmap, this.f70435c, this.f70436d, this.f70437e);
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.g.K6, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f70436d == bVar.f70436d && this.f70437e == bVar.f70437e;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.L6, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (-1268272858) + (this.f70436d * 31) + this.f70437e;
    }
}
