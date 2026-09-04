package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.animation.content.p;

/* JADX INFO: compiled from: RectangleShape.java */
/* JADX INFO: loaded from: classes6.dex */
public class g implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.m<PointF, PointF> f37553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.m<PointF, PointF> f37554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f37555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f37556e;

    public g(String str, com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar, com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar2, com.airbnb.lottie.model.animatable.b bVar, boolean z10) {
        this.f37552a = str;
        this.f37553b = mVar;
        this.f37554c = mVar2;
        this.f37555d = bVar;
        this.f37556e = z10;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.a aVar) {
        return new p(jVar, aVar, this);
    }

    public com.airbnb.lottie.model.animatable.b b() {
        return this.f37555d;
    }

    public String c() {
        return this.f37552a;
    }

    public com.airbnb.lottie.model.animatable.m<PointF, PointF> d() {
        return this.f37553b;
    }

    public com.airbnb.lottie.model.animatable.m<PointF, PointF> e() {
        return this.f37554c;
    }

    public boolean f() {
        return this.f37556e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f37553b + ", size=" + this.f37554c + '}';
    }
}
