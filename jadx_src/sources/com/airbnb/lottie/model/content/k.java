package com.airbnb.lottie.model.content;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: ShapeGroup.java */
/* JADX INFO: loaded from: classes6.dex */
public class k implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<c> f37572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f37573c;

    public k(String str, List<c> list, boolean z10) {
        this.f37571a = str;
        this.f37572b = list;
        this.f37573c = z10;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.a aVar) {
        return new com.airbnb.lottie.animation.content.d(jVar, aVar, this);
    }

    public List<c> b() {
        return this.f37572b;
    }

    public String c() {
        return this.f37571a;
    }

    public boolean d() {
        return this.f37573c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f37571a + "' Shapes: " + Arrays.toString(this.f37572b.toArray()) + '}';
    }
}
