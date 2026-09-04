package com.bumptech.glide.load.engine;

import androidx.annotation.n0;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: compiled from: EngineKey.java */
/* JADX INFO: loaded from: classes6.dex */
public class l implements com.bumptech.glide.load.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f41217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f41218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f41219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Class<?> f41220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class<?> f41221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.load.c f41222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<Class<?>, com.bumptech.glide.load.i<?>> f41223i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.bumptech.glide.load.f f41224j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f41225k;

    l(Object obj, com.bumptech.glide.load.c cVar, int i10, int i11, Map<Class<?>, com.bumptech.glide.load.i<?>> map, Class<?> cls, Class<?> cls2, com.bumptech.glide.load.f fVar) {
        this.f41217c = com.bumptech.glide.util.m.e(obj);
        this.f41222h = (com.bumptech.glide.load.c) com.bumptech.glide.util.m.f(cVar, "Signature must not be null");
        this.f41218d = i10;
        this.f41219e = i11;
        this.f41223i = (Map) com.bumptech.glide.util.m.e(map);
        this.f41220f = (Class) com.bumptech.glide.util.m.f(cls, "Resource class must not be null");
        this.f41221g = (Class) com.bumptech.glide.util.m.f(cls2, "Transcode class must not be null");
        this.f41224j = (com.bumptech.glide.load.f) com.bumptech.glide.util.m.e(fVar);
    }

    @Override // com.bumptech.glide.load.c
    public void b(@n0 MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f41217c.equals(lVar.f41217c) && this.f41222h.equals(lVar.f41222h) && this.f41219e == lVar.f41219e && this.f41218d == lVar.f41218d && this.f41223i.equals(lVar.f41223i) && this.f41220f.equals(lVar.f41220f) && this.f41221g.equals(lVar.f41221g) && this.f41224j.equals(lVar.f41224j);
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        if (this.f41225k == 0) {
            int iHashCode = this.f41217c.hashCode();
            this.f41225k = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f41222h.hashCode()) * 31) + this.f41218d) * 31) + this.f41219e;
            this.f41225k = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.f41223i.hashCode();
            this.f41225k = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f41220f.hashCode();
            this.f41225k = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f41221g.hashCode();
            this.f41225k = iHashCode5;
            this.f41225k = (iHashCode5 * 31) + this.f41224j.hashCode();
        }
        return this.f41225k;
    }

    public String toString() {
        return "EngineKey{model=" + this.f41217c + ", width=" + this.f41218d + ", height=" + this.f41219e + ", resourceClass=" + this.f41220f + ", transcodeClass=" + this.f41221g + ", signature=" + this.f41222h + ", hashCode=" + this.f41225k + ", transformations=" + this.f41223i + ", options=" + this.f41224j + '}';
    }
}
