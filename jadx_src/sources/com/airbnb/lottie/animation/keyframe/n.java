package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import androidx.annotation.p0;
import java.util.Collections;

/* JADX INFO: compiled from: SplitDimensionPathKeyframeAnimation.java */
/* JADX INFO: loaded from: classes6.dex */
public class n extends a<PointF, PointF> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final PointF f37289i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final PointF f37290j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a<Float, Float> f37291k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final a<Float, Float> f37292l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    protected com.airbnb.lottie.value.j<Float> f37293m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    protected com.airbnb.lottie.value.j<Float> f37294n;

    public n(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.f37289i = new PointF();
        this.f37290j = new PointF();
        this.f37291k = aVar;
        this.f37292l = aVar2;
        m(f());
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public void m(float f10) {
        this.f37291k.m(f10);
        this.f37292l.m(f10);
        this.f37289i.set(this.f37291k.h().floatValue(), this.f37292l.h().floatValue());
        for (int i10 = 0; i10 < this.f37251a.size(); i10++) {
            this.f37251a.get(i10).d();
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public PointF h() {
        return i(null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF i(com.airbnb.lottie.value.a<PointF> aVar, float f10) {
        Float fB;
        com.airbnb.lottie.value.a<Float> aVarB;
        com.airbnb.lottie.value.a<Float> aVarB2;
        Float fB2 = null;
        if (this.f37293m == null || (aVarB2 = this.f37291k.b()) == null) {
            fB = null;
        } else {
            float fD = this.f37291k.d();
            Float f11 = aVarB2.f37860h;
            com.airbnb.lottie.value.j<Float> jVar = this.f37293m;
            float f12 = aVarB2.f37859g;
            fB = jVar.b(f12, f11 == null ? f12 : f11.floatValue(), aVarB2.f37854b, aVarB2.f37855c, f10, f10, fD);
        }
        if (this.f37294n != null && (aVarB = this.f37292l.b()) != null) {
            float fD2 = this.f37292l.d();
            Float f13 = aVarB.f37860h;
            com.airbnb.lottie.value.j<Float> jVar2 = this.f37294n;
            float f14 = aVarB.f37859g;
            fB2 = jVar2.b(f14, f13 == null ? f14 : f13.floatValue(), aVarB.f37854b, aVarB.f37855c, f10, f10, fD2);
        }
        if (fB == null) {
            this.f37290j.set(this.f37289i.x, 0.0f);
        } else {
            this.f37290j.set(fB.floatValue(), 0.0f);
        }
        if (fB2 == null) {
            PointF pointF = this.f37290j;
            pointF.set(pointF.x, this.f37289i.y);
        } else {
            PointF pointF2 = this.f37290j;
            pointF2.set(pointF2.x, fB2.floatValue());
        }
        return this.f37290j;
    }

    public void r(@p0 com.airbnb.lottie.value.j<Float> jVar) {
        com.airbnb.lottie.value.j<Float> jVar2 = this.f37293m;
        if (jVar2 != null) {
            jVar2.c(null);
        }
        this.f37293m = jVar;
        if (jVar != null) {
            jVar.c(this);
        }
    }

    public void s(@p0 com.airbnb.lottie.value.j<Float> jVar) {
        com.airbnb.lottie.value.j<Float> jVar2 = this.f37294n;
        if (jVar2 != null) {
            jVar2.c(null);
        }
        this.f37294n = jVar;
        if (jVar != null) {
            jVar.c(this);
        }
    }
}
