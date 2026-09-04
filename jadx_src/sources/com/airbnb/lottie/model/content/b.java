package com.airbnb.lottie.model.content;

import android.graphics.PointF;

/* JADX INFO: compiled from: CircleShape.java */
/* JADX INFO: loaded from: classes6.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.m<PointF, PointF> f37523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.f f37524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f37525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f37526e;

    public b(String str, com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar, com.airbnb.lottie.model.animatable.f fVar, boolean z10, boolean z11) {
        this.f37522a = str;
        this.f37523b = mVar;
        this.f37524c = fVar;
        this.f37525d = z10;
        this.f37526e = z11;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.a aVar) {
        return new com.airbnb.lottie.animation.content.f(jVar, aVar, this);
    }

    public String b() {
        return this.f37522a;
    }

    public com.airbnb.lottie.model.animatable.m<PointF, PointF> c() {
        return this.f37523b;
    }

    public com.airbnb.lottie.model.animatable.f d() {
        return this.f37524c;
    }

    public boolean e() {
        return this.f37526e;
    }

    public boolean f() {
        return this.f37525d;
    }
}
