package com.bumptech.glide.load;

import androidx.annotation.n0;
import androidx.annotation.p0;
import java.security.MessageDigest;

/* JADX INFO: compiled from: Options.java */
/* JADX INFO: loaded from: classes6.dex */
public final class f implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.collection.a<e<?>, Object> f41307c = new com.bumptech.glide.util.b();

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void g(@n0 e<T> eVar, @n0 Object obj, @n0 MessageDigest messageDigest) {
        eVar.h(obj, messageDigest);
    }

    @Override // com.bumptech.glide.load.c
    public void b(@n0 MessageDigest messageDigest) {
        for (int i10 = 0; i10 < this.f41307c.size(); i10++) {
            g(this.f41307c.g(i10), this.f41307c.k(i10), messageDigest);
        }
    }

    @p0
    public <T> T c(@n0 e<T> eVar) {
        return this.f41307c.containsKey(eVar) ? (T) this.f41307c.get(eVar) : eVar.d();
    }

    public void d(@n0 f fVar) {
        this.f41307c.h(fVar.f41307c);
    }

    public f e(@n0 e<?> eVar) {
        this.f41307c.remove(eVar);
        return this;
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f41307c.equals(((f) obj).f41307c);
        }
        return false;
    }

    @n0
    public <T> f f(@n0 e<T> eVar, @n0 T t10) {
        this.f41307c.put(eVar, t10);
        return this;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return this.f41307c.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f41307c + '}';
    }
}
