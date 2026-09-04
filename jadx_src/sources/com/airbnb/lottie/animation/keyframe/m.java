package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: compiled from: ShapeKeyframeAnimation.java */
/* JADX INFO: loaded from: classes6.dex */
public class m extends a<com.airbnb.lottie.model.content.i, Path> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.model.content.i f37287i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Path f37288j;

    public m(List<com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.i>> list) {
        super(list);
        this.f37287i = new com.airbnb.lottie.model.content.i();
        this.f37288j = new Path();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Path i(com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.i> aVar, float f10) {
        this.f37287i.c(aVar.f37854b, aVar.f37855c, f10);
        com.airbnb.lottie.utils.i.i(this.f37287i, this.f37288j);
        return this.f37288j;
    }
}
