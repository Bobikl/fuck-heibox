package com.airbnb.lottie.animation.keyframe;

import java.util.List;

/* JADX INFO: compiled from: GradientColorKeyframeAnimation.java */
/* JADX INFO: loaded from: classes6.dex */
public class e extends g<com.airbnb.lottie.model.content.d> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.model.content.d f37275i;

    public e(List<com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.d>> list) {
        super(list);
        com.airbnb.lottie.model.content.d dVar = list.get(0).f37854b;
        int iC = dVar != null ? dVar.c() : 0;
        this.f37275i = new com.airbnb.lottie.model.content.d(new float[iC], new int[iC]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.model.content.d i(com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.d> aVar, float f10) {
        this.f37275i.d(aVar.f37854b, aVar.f37855c, f10);
        return this.f37275i;
    }
}
