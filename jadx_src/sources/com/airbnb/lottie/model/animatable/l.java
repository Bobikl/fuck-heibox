package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import androidx.annotation.p0;
import com.airbnb.lottie.animation.keyframe.p;

/* JADX INFO: compiled from: AnimatableTransform.java */
/* JADX INFO: loaded from: classes6.dex */
public class l implements com.airbnb.lottie.animation.content.m, com.airbnb.lottie.model.content.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final e f37465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final m<PointF, PointF> f37466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private final g f37467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private final b f37468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private final d f37469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private final b f37470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private final b f37471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private final b f37472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private final b f37473i;

    public l() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public l(@p0 e eVar, @p0 m<PointF, PointF> mVar, @p0 g gVar, @p0 b bVar, @p0 d dVar, @p0 b bVar2, @p0 b bVar3, @p0 b bVar4, @p0 b bVar5) {
        this.f37465a = eVar;
        this.f37466b = mVar;
        this.f37467c = gVar;
        this.f37468d = bVar;
        this.f37469e = dVar;
        this.f37472h = bVar2;
        this.f37473i = bVar3;
        this.f37470f = bVar4;
        this.f37471g = bVar5;
    }

    @Override // com.airbnb.lottie.model.content.c
    @p0
    public com.airbnb.lottie.animation.content.c a(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.a aVar) {
        return null;
    }

    public p b() {
        return new p(this);
    }

    @p0
    public e c() {
        return this.f37465a;
    }

    @p0
    public b d() {
        return this.f37473i;
    }

    @p0
    public d e() {
        return this.f37469e;
    }

    @p0
    public m<PointF, PointF> f() {
        return this.f37466b;
    }

    @p0
    public b g() {
        return this.f37468d;
    }

    @p0
    public g h() {
        return this.f37467c;
    }

    @p0
    public b i() {
        return this.f37470f;
    }

    @p0
    public b j() {
        return this.f37471g;
    }

    @p0
    public b k() {
        return this.f37472h;
    }
}
