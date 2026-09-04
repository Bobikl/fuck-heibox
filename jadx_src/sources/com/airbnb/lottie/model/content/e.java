package com.airbnb.lottie.model.content;

import android.graphics.Path;
import androidx.annotation.p0;

/* JADX INFO: compiled from: GradientFill.java */
/* JADX INFO: loaded from: classes6.dex */
public class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GradientType f37529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path.FillType f37530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.c f37531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.d f37532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.f f37533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.f f37534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f37535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private final com.airbnb.lottie.model.animatable.b f37536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private final com.airbnb.lottie.model.animatable.b f37537i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f37538j;

    public e(String str, GradientType gradientType, Path.FillType fillType, com.airbnb.lottie.model.animatable.c cVar, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.f fVar, com.airbnb.lottie.model.animatable.f fVar2, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.b bVar2, boolean z10) {
        this.f37529a = gradientType;
        this.f37530b = fillType;
        this.f37531c = cVar;
        this.f37532d = dVar;
        this.f37533e = fVar;
        this.f37534f = fVar2;
        this.f37535g = str;
        this.f37536h = bVar;
        this.f37537i = bVar2;
        this.f37538j = z10;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.a aVar) {
        return new com.airbnb.lottie.animation.content.h(jVar, aVar, this);
    }

    public com.airbnb.lottie.model.animatable.f b() {
        return this.f37534f;
    }

    public Path.FillType c() {
        return this.f37530b;
    }

    public com.airbnb.lottie.model.animatable.c d() {
        return this.f37531c;
    }

    public GradientType e() {
        return this.f37529a;
    }

    @p0
    com.airbnb.lottie.model.animatable.b f() {
        return this.f37537i;
    }

    @p0
    com.airbnb.lottie.model.animatable.b g() {
        return this.f37536h;
    }

    public String h() {
        return this.f37535g;
    }

    public com.airbnb.lottie.model.animatable.d i() {
        return this.f37532d;
    }

    public com.airbnb.lottie.model.animatable.f j() {
        return this.f37533e;
    }

    public boolean k() {
        return this.f37538j;
    }
}
