package com.airbnb.lottie.model.content;

import com.airbnb.lottie.animation.content.t;

/* JADX INFO: loaded from: classes6.dex */
public class ShapeTrimPath implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type f37516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f37517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f37518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f37519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f37520f;

    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static Type forId(int i10) {
            if (i10 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i10 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i10);
        }
    }

    public ShapeTrimPath(String str, Type type, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.b bVar2, com.airbnb.lottie.model.animatable.b bVar3, boolean z10) {
        this.f37515a = str;
        this.f37516b = type;
        this.f37517c = bVar;
        this.f37518d = bVar2;
        this.f37519e = bVar3;
        this.f37520f = z10;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.a aVar) {
        return new t(aVar, this);
    }

    public com.airbnb.lottie.model.animatable.b b() {
        return this.f37518d;
    }

    public String c() {
        return this.f37515a;
    }

    public com.airbnb.lottie.model.animatable.b d() {
        return this.f37519e;
    }

    public com.airbnb.lottie.model.animatable.b e() {
        return this.f37517c;
    }

    public Type f() {
        return this.f37516b;
    }

    public boolean g() {
        return this.f37520f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f37517c + ", end: " + this.f37518d + ", offset: " + this.f37519e + z5.g.f141884d;
    }
}
