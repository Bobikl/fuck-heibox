package com.airbnb.lottie.value;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: LottieInterpolatedFloatValue.java */
/* JADX INFO: loaded from: classes6.dex */
public class c extends f<Float> {
    public c(Float f10, Float f11) {
        super(f10, f11);
    }

    public c(Float f10, Float f11, Interpolator interpolator) {
        super(f10, f11, interpolator);
    }

    @Override // com.airbnb.lottie.value.f, com.airbnb.lottie.value.j
    public /* bridge */ /* synthetic */ Object a(b bVar) {
        return super.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.value.f
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Float e(Float f10, Float f11, float f12) {
        return Float.valueOf(com.airbnb.lottie.utils.i.k(f10.floatValue(), f11.floatValue(), f12));
    }
}
