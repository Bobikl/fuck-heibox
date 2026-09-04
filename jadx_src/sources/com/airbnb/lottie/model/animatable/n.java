package com.airbnb.lottie.model.animatable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: BaseAnimatableValue.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class n<V, O> implements m<V, O> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List<com.airbnb.lottie.value.a<V>> f37474a;

    n(V v10) {
        this(Collections.singletonList(new com.airbnb.lottie.value.a(v10)));
    }

    n(List<com.airbnb.lottie.value.a<V>> list) {
        this.f37474a = list;
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public boolean p() {
        return this.f37474a.isEmpty() || (this.f37474a.size() == 1 && this.f37474a.get(0).h());
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public List<com.airbnb.lottie.value.a<V>> r() {
        return this.f37474a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f37474a.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.f37474a.toArray()));
        }
        return sb2.toString();
    }
}
