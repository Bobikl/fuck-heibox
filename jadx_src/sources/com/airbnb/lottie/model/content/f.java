package com.airbnb.lottie.model.content;

import androidx.annotation.p0;
import java.util.List;

/* JADX INFO: compiled from: GradientStroke.java */
/* JADX INFO: loaded from: classes6.dex */
public class f implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GradientType f37540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.c f37541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.d f37542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.f f37543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.f f37544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f37545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ShapeStroke.LineCapType f37546h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ShapeStroke.LineJoinType f37547i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f37548j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<com.airbnb.lottie.model.animatable.b> f37549k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private final com.airbnb.lottie.model.animatable.b f37550l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f37551m;

    public f(String str, GradientType gradientType, com.airbnb.lottie.model.animatable.c cVar, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.f fVar, com.airbnb.lottie.model.animatable.f fVar2, com.airbnb.lottie.model.animatable.b bVar, ShapeStroke.LineCapType lineCapType, ShapeStroke.LineJoinType lineJoinType, float f10, List<com.airbnb.lottie.model.animatable.b> list, @p0 com.airbnb.lottie.model.animatable.b bVar2, boolean z10) {
        this.f37539a = str;
        this.f37540b = gradientType;
        this.f37541c = cVar;
        this.f37542d = dVar;
        this.f37543e = fVar;
        this.f37544f = fVar2;
        this.f37545g = bVar;
        this.f37546h = lineCapType;
        this.f37547i = lineJoinType;
        this.f37548j = f10;
        this.f37549k = list;
        this.f37550l = bVar2;
        this.f37551m = z10;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.a aVar) {
        return new com.airbnb.lottie.animation.content.i(jVar, aVar, this);
    }

    public ShapeStroke.LineCapType b() {
        return this.f37546h;
    }

    @p0
    public com.airbnb.lottie.model.animatable.b c() {
        return this.f37550l;
    }

    public com.airbnb.lottie.model.animatable.f d() {
        return this.f37544f;
    }

    public com.airbnb.lottie.model.animatable.c e() {
        return this.f37541c;
    }

    public GradientType f() {
        return this.f37540b;
    }

    public ShapeStroke.LineJoinType g() {
        return this.f37547i;
    }

    public List<com.airbnb.lottie.model.animatable.b> h() {
        return this.f37549k;
    }

    public float i() {
        return this.f37548j;
    }

    public String j() {
        return this.f37539a;
    }

    public com.airbnb.lottie.model.animatable.d k() {
        return this.f37542d;
    }

    public com.airbnb.lottie.model.animatable.f l() {
        return this.f37543e;
    }

    public com.airbnb.lottie.model.animatable.b m() {
        return this.f37545g;
    }

    public boolean n() {
        return this.f37551m;
    }
}
