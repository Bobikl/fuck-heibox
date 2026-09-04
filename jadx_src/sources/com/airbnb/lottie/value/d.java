package com.airbnb.lottie.value;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: LottieInterpolatedIntegerValue.java */
/* JADX INFO: loaded from: classes6.dex */
public class d extends f<Integer> {
    public d(Integer num, Integer num2) {
        super(num, num2);
    }

    public d(Integer num, Integer num2, Interpolator interpolator) {
        super(num, num2, interpolator);
    }

    @Override // com.airbnb.lottie.value.f, com.airbnb.lottie.value.j
    public /* bridge */ /* synthetic */ Object a(b bVar) {
        return super.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.value.f
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Integer e(Integer num, Integer num2, float f10) {
        return Integer.valueOf(com.airbnb.lottie.utils.i.l(num.intValue(), num2.intValue(), f10));
    }
}
