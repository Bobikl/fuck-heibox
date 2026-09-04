package com.airbnb.lottie.model.content;

import com.airbnb.lottie.animation.content.r;

/* JADX INFO: compiled from: ShapePath.java */
/* JADX INFO: loaded from: classes6.dex */
public class l implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f37575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.h f37576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f37577d;

    public l(String str, int i10, com.airbnb.lottie.model.animatable.h hVar, boolean z10) {
        this.f37574a = str;
        this.f37575b = i10;
        this.f37576c = hVar;
        this.f37577d = z10;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.a aVar) {
        return new r(jVar, aVar, this);
    }

    public String b() {
        return this.f37574a;
    }

    public com.airbnb.lottie.model.animatable.h c() {
        return this.f37576c;
    }

    public boolean d() {
        return this.f37577d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f37574a + ", index=" + this.f37575b + '}';
    }
}
