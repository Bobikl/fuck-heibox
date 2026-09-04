package com.airbnb.lottie.value;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: LottieInterpolatedPointValue.java */
/* JADX INFO: loaded from: classes6.dex */
public class e extends f<PointF> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final PointF f37876g;

    public e(PointF pointF, PointF pointF2) {
        super(pointF, pointF2);
        this.f37876g = new PointF();
    }

    public e(PointF pointF, PointF pointF2, Interpolator interpolator) {
        super(pointF, pointF2, interpolator);
        this.f37876g = new PointF();
    }

    @Override // com.airbnb.lottie.value.f, com.airbnb.lottie.value.j
    public /* bridge */ /* synthetic */ Object a(b bVar) {
        return super.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.value.f
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public PointF e(PointF pointF, PointF pointF2, float f10) {
        this.f37876g.set(com.airbnb.lottie.utils.i.k(pointF.x, pointF2.x, f10), com.airbnb.lottie.utils.i.k(pointF.y, pointF2.y, f10));
        return this.f37876g;
    }
}
