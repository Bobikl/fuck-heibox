package com.airbnb.lottie.model.content;

import androidx.annotation.p0;
import com.airbnb.lottie.animation.content.q;

/* JADX INFO: compiled from: Repeater.java */
/* JADX INFO: loaded from: classes6.dex */
public class h implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f37558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f37559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.l f37560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f37561e;

    public h(String str, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.b bVar2, com.airbnb.lottie.model.animatable.l lVar, boolean z10) {
        this.f37557a = str;
        this.f37558b = bVar;
        this.f37559c = bVar2;
        this.f37560d = lVar;
        this.f37561e = z10;
    }

    @Override // com.airbnb.lottie.model.content.c
    @p0
    public com.airbnb.lottie.animation.content.c a(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.a aVar) {
        return new q(jVar, aVar, this);
    }

    public com.airbnb.lottie.model.animatable.b b() {
        return this.f37558b;
    }

    public String c() {
        return this.f37557a;
    }

    public com.airbnb.lottie.model.animatable.b d() {
        return this.f37559c;
    }

    public com.airbnb.lottie.model.animatable.l e() {
        return this.f37560d;
    }

    public boolean f() {
        return this.f37561e;
    }
}
