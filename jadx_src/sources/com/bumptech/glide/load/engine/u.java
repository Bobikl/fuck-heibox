package com.bumptech.glide.load.engine;

import androidx.annotation.n0;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: ResourceCacheKey.java */
/* JADX INFO: loaded from: classes6.dex */
public final class u implements com.bumptech.glide.load.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final com.bumptech.glide.util.j<Class<?>, byte[]> f41285k = new com.bumptech.glide.util.j<>(50);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f41286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.load.c f41287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.c f41288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f41289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f41290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Class<?> f41291h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.bumptech.glide.load.f f41292i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.bumptech.glide.load.i<?> f41293j;

    u(com.bumptech.glide.load.engine.bitmap_recycle.b bVar, com.bumptech.glide.load.c cVar, com.bumptech.glide.load.c cVar2, int i10, int i11, com.bumptech.glide.load.i<?> iVar, Class<?> cls, com.bumptech.glide.load.f fVar) {
        this.f41286c = bVar;
        this.f41287d = cVar;
        this.f41288e = cVar2;
        this.f41289f = i10;
        this.f41290g = i11;
        this.f41293j = iVar;
        this.f41291h = cls;
        this.f41292i = fVar;
    }

    private byte[] c() {
        com.bumptech.glide.util.j<Class<?>, byte[]> jVar = f41285k;
        byte[] bArrJ = jVar.j(this.f41291h);
        if (bArrJ != null) {
            return bArrJ;
        }
        byte[] bytes = this.f41291h.getName().getBytes(com.bumptech.glide.load.c.f40833b);
        jVar.n(this.f41291h, bytes);
        return bytes;
    }

    @Override // com.bumptech.glide.load.c
    public void b(@n0 MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f41286c.d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f41289f).putInt(this.f41290g).array();
        this.f41288e.b(messageDigest);
        this.f41287d.b(messageDigest);
        messageDigest.update(bArr);
        com.bumptech.glide.load.i<?> iVar = this.f41293j;
        if (iVar != null) {
            iVar.b(messageDigest);
        }
        this.f41292i.b(messageDigest);
        messageDigest.update(c());
        this.f41286c.put(bArr);
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f41290g == uVar.f41290g && this.f41289f == uVar.f41289f && com.bumptech.glide.util.o.e(this.f41293j, uVar.f41293j) && this.f41291h.equals(uVar.f41291h) && this.f41287d.equals(uVar.f41287d) && this.f41288e.equals(uVar.f41288e) && this.f41292i.equals(uVar.f41292i);
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        int iHashCode = (((((this.f41287d.hashCode() * 31) + this.f41288e.hashCode()) * 31) + this.f41289f) * 31) + this.f41290g;
        com.bumptech.glide.load.i<?> iVar = this.f41293j;
        if (iVar != null) {
            iHashCode = (iHashCode * 31) + iVar.hashCode();
        }
        return (((iHashCode * 31) + this.f41291h.hashCode()) * 31) + this.f41292i.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f41287d + ", signature=" + this.f41288e + ", width=" + this.f41289f + ", height=" + this.f41290g + ", decodedResourceClass=" + this.f41291h + ", transformation='" + this.f41293j + "', options=" + this.f41292i + '}';
    }
}
