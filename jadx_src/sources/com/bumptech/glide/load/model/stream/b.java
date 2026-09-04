package com.bumptech.glide.load.model.stream;

import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.load.data.j;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.p;
import com.bumptech.glide.load.model.s;
import java.io.InputStream;

/* JADX INFO: compiled from: HttpGlideUrlLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public class b implements o<com.bumptech.glide.load.model.h, InputStream> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.bumptech.glide.load.e<Integer> f41405b = com.bumptech.glide.load.e.g("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final n<com.bumptech.glide.load.model.h, com.bumptech.glide.load.model.h> f41406a;

    /* JADX INFO: compiled from: HttpGlideUrlLoader.java */
    public static class a implements p<com.bumptech.glide.load.model.h, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n<com.bumptech.glide.load.model.h, com.bumptech.glide.load.model.h> f41407a = new n<>(500);

        @Override // com.bumptech.glide.load.model.p
        public void c() {
        }

        @Override // com.bumptech.glide.load.model.p
        @n0
        public o<com.bumptech.glide.load.model.h, InputStream> d(s sVar) {
            return new b(this.f41407a);
        }
    }

    public b() {
        this(null);
    }

    public b(@p0 n<com.bumptech.glide.load.model.h, com.bumptech.glide.load.model.h> nVar) {
        this.f41406a = nVar;
    }

    @Override // com.bumptech.glide.load.model.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> a(@n0 com.bumptech.glide.load.model.h hVar, int i10, int i11, @n0 com.bumptech.glide.load.f fVar) {
        n<com.bumptech.glide.load.model.h, com.bumptech.glide.load.model.h> nVar = this.f41406a;
        if (nVar != null) {
            com.bumptech.glide.load.model.h hVarB = nVar.b(hVar, 0, 0);
            if (hVarB == null) {
                this.f41406a.c(hVar, 0, 0, hVar);
            } else {
                hVar = hVarB;
            }
        }
        return new o.a<>(hVar, new j(hVar, ((Integer) fVar.c(f41405b)).intValue()));
    }

    @Override // com.bumptech.glide.load.model.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@n0 com.bumptech.glide.load.model.h hVar) {
        return true;
    }
}
