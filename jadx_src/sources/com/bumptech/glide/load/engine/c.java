package com.bumptech.glide.load.engine;

import androidx.annotation.n0;
import java.security.MessageDigest;

/* JADX INFO: compiled from: DataCacheKey.java */
/* JADX INFO: loaded from: classes6.dex */
public final class c implements com.bumptech.glide.load.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.c f41032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.load.c f41033d;

    c(com.bumptech.glide.load.c cVar, com.bumptech.glide.load.c cVar2) {
        this.f41032c = cVar;
        this.f41033d = cVar2;
    }

    @Override // com.bumptech.glide.load.c
    public void b(@n0 MessageDigest messageDigest) {
        this.f41032c.b(messageDigest);
        this.f41033d.b(messageDigest);
    }

    com.bumptech.glide.load.c c() {
        return this.f41032c;
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f41032c.equals(cVar.f41032c) && this.f41033d.equals(cVar.f41033d);
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return (this.f41032c.hashCode() * 31) + this.f41033d.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f41032c + ", signature=" + this.f41033d + '}';
    }
}
