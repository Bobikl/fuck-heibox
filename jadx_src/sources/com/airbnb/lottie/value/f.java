package com.airbnb.lottie.value;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: compiled from: LottieInterpolatedValue.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class f<T> extends j<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final T f37877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final T f37878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Interpolator f37879f;

    f(T t10, T t11) {
        this(t10, t11, new LinearInterpolator());
    }

    f(T t10, T t11, Interpolator interpolator) {
        this.f37877d = t10;
        this.f37878e = t11;
        this.f37879f = interpolator;
    }

    @Override // com.airbnb.lottie.value.j
    public T a(b<T> bVar) {
        return e(this.f37877d, this.f37878e, this.f37879f.getInterpolation(bVar.e()));
    }

    abstract T e(T t10, T t11, float f10);
}
