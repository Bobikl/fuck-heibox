package com.bumptech.glide.signature;

import androidx.annotation.n0;
import androidx.annotation.p0;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: MediaStoreSignature.java */
/* JADX INFO: loaded from: classes6.dex */
public class d implements com.bumptech.glide.load.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    private final String f41970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f41971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f41972e;

    public d(@p0 String str, long j10, int i10) {
        this.f41970c = str == null ? "" : str;
        this.f41971d = j10;
        this.f41972e = i10;
    }

    @Override // com.bumptech.glide.load.c
    public void b(@n0 MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.f41971d).putInt(this.f41972e).array());
        messageDigest.update(this.f41970c.getBytes(com.bumptech.glide.load.c.f40833b));
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f41971d == dVar.f41971d && this.f41972e == dVar.f41972e && this.f41970c.equals(dVar.f41970c);
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        int iHashCode = this.f41970c.hashCode() * 31;
        long j10 = this.f41971d;
        return ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f41972e;
    }
}
