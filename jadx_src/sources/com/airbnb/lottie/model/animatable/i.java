package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: AnimatableSplitDimensionPathValue.java */
/* JADX INFO: loaded from: classes6.dex */
public class i implements m<PointF, PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f37459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f37460b;

    public i(b bVar, b bVar2) {
        this.f37459a = bVar;
        this.f37460b = bVar2;
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public boolean p() {
        return this.f37459a.p() && this.f37460b.p();
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public com.airbnb.lottie.animation.keyframe.a<PointF, PointF> q() {
        return new com.airbnb.lottie.animation.keyframe.n(this.f37459a.q(), this.f37460b.q());
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public List<com.airbnb.lottie.value.a<PointF>> r() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
