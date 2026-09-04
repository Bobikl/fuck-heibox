package com.airbnb.lottie.value;

import androidx.annotation.RestrictTo;
import androidx.annotation.p0;

/* JADX INFO: compiled from: LottieValueCallback.java */
/* JADX INFO: loaded from: classes6.dex */
public class j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b<T> f37881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.animation.keyframe.a<?, ?> f37882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    protected T f37883c;

    public j() {
        this.f37881a = new b<>();
        this.f37883c = null;
    }

    public j(@p0 T t10) {
        this.f37881a = new b<>();
        this.f37883c = t10;
    }

    @p0
    public T a(b<T> bVar) {
        return this.f37883c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @p0
    public final T b(float f10, float f11, T t10, T t11, float f12, float f13, float f14) {
        return a(this.f37881a.h(f10, f11, t10, t11, f12, f13, f14));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void c(@p0 com.airbnb.lottie.animation.keyframe.a<?, ?> aVar) {
        this.f37882b = aVar;
    }

    public final void d(@p0 T t10) {
        this.f37883c = t10;
        com.airbnb.lottie.animation.keyframe.a<?, ?> aVar = this.f37882b;
        if (aVar != null) {
            aVar.k();
        }
    }
}
