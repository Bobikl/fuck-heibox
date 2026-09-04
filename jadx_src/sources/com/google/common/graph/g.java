package com.google.common.graph;

import com.google.common.base.Optional;

/* JADX INFO: compiled from: AbstractGraphBuilder.java */
/* JADX INFO: loaded from: classes7.dex */
@t
public abstract class g<N> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f58375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f58376b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ElementOrder<N> f58377c = ElementOrder.d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ElementOrder<N> f58378d = ElementOrder.i();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Optional<Integer> f58379e = Optional.a();

    g(boolean z10) {
        this.f58375a = z10;
    }
}
