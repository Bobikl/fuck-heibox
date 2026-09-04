package com.bumptech.glide.load.engine;

import androidx.annotation.j1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: Jobs.java */
/* JADX INFO: loaded from: classes6.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<com.bumptech.glide.load.c, j<?>> f41233a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<com.bumptech.glide.load.c, j<?>> f41234b = new HashMap();

    p() {
    }

    private Map<com.bumptech.glide.load.c, j<?>> c(boolean z10) {
        return z10 ? this.f41234b : this.f41233a;
    }

    j<?> a(com.bumptech.glide.load.c cVar, boolean z10) {
        return c(z10).get(cVar);
    }

    @j1
    Map<com.bumptech.glide.load.c, j<?>> b() {
        return Collections.unmodifiableMap(this.f41233a);
    }

    void d(com.bumptech.glide.load.c cVar, j<?> jVar) {
        c(jVar.q()).put(cVar, jVar);
    }

    void e(com.bumptech.glide.load.c cVar, j<?> jVar) {
        Map<com.bumptech.glide.load.c, j<?>> mapC = c(jVar.q());
        if (jVar.equals(mapC.get(cVar))) {
            mapC.remove(cVar);
        }
    }
}
