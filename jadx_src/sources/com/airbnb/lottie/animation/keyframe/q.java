package com.airbnb.lottie.animation.keyframe;

import androidx.annotation.p0;
import java.util.Collections;

/* JADX INFO: compiled from: ValueCallbackKeyframeAnimation.java */
/* JADX INFO: loaded from: classes6.dex */
public class q<K, A> extends a<K, A> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.value.b<A> f37309i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final A f37310j;

    public q(com.airbnb.lottie.value.j<A> jVar) {
        this(jVar, null);
    }

    public q(com.airbnb.lottie.value.j<A> jVar, @p0 A a10) {
        super(Collections.emptyList());
        this.f37309i = new com.airbnb.lottie.value.b<>();
        n(jVar);
        this.f37310j = a10;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    float c() {
        return 1.0f;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public A h() {
        com.airbnb.lottie.value.j<A> jVar = this.f37255e;
        A a10 = this.f37310j;
        return jVar.b(0.0f, 0.0f, a10, a10, f(), f(), f());
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    A i(com.airbnb.lottie.value.a<K> aVar, float f10) {
        return h();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public void k() {
        if (this.f37255e != null) {
            super.k();
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public void m(float f10) {
        this.f37254d = f10;
    }
}
