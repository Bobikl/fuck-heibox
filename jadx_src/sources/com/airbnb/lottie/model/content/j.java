package com.airbnb.lottie.model.content;

import android.graphics.Path;
import androidx.annotation.p0;

/* JADX INFO: compiled from: ShapeFill.java */
/* JADX INFO: loaded from: classes6.dex */
public class j implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f37565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path.FillType f37566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f37567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private final com.airbnb.lottie.model.animatable.a f37568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private final com.airbnb.lottie.model.animatable.d f37569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f37570f;

    public j(String str, boolean z10, Path.FillType fillType, @p0 com.airbnb.lottie.model.animatable.a aVar, @p0 com.airbnb.lottie.model.animatable.d dVar, boolean z11) {
        this.f37567c = str;
        this.f37565a = z10;
        this.f37566b = fillType;
        this.f37568d = aVar;
        this.f37569e = dVar;
        this.f37570f = z11;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.a aVar) {
        return new com.airbnb.lottie.animation.content.g(jVar, aVar, this);
    }

    @p0
    public com.airbnb.lottie.model.animatable.a b() {
        return this.f37568d;
    }

    public Path.FillType c() {
        return this.f37566b;
    }

    public String d() {
        return this.f37567c;
    }

    @p0
    public com.airbnb.lottie.model.animatable.d e() {
        return this.f37569e;
    }

    public boolean f() {
        return this.f37570f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f37565a + '}';
    }
}
