package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: AnimatablePathValue.java */
/* JADX INFO: loaded from: classes6.dex */
public class e implements m<PointF, PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<com.airbnb.lottie.value.a<PointF>> f37458a;

    public e() {
        this.f37458a = Collections.singletonList(new com.airbnb.lottie.value.a(new PointF(0.0f, 0.0f)));
    }

    public e(List<com.airbnb.lottie.value.a<PointF>> list) {
        this.f37458a = list;
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public boolean p() {
        return this.f37458a.size() == 1 && this.f37458a.get(0).h();
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public com.airbnb.lottie.animation.keyframe.a<PointF, PointF> q() {
        return this.f37458a.get(0).h() ? new com.airbnb.lottie.animation.keyframe.k(this.f37458a) : new com.airbnb.lottie.animation.keyframe.j(this.f37458a);
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public List<com.airbnb.lottie.value.a<PointF>> r() {
        return this.f37458a;
    }
}
