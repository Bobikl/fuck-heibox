package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.animation.content.o;

/* JADX INFO: loaded from: classes6.dex */
public class PolystarShape implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type f37494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f37495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.m<PointF, PointF> f37496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f37497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f37498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f37499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f37500h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f37501i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f37502j;

    public enum Type {
        STAR(1),
        POLYGON(2);

        private final int value;

        Type(int i10) {
            this.value = i10;
        }

        public static Type forValue(int i10) {
            for (Type type : values()) {
                if (type.value == i10) {
                    return type;
                }
            }
            return null;
        }
    }

    public PolystarShape(String str, Type type, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar, com.airbnb.lottie.model.animatable.b bVar2, com.airbnb.lottie.model.animatable.b bVar3, com.airbnb.lottie.model.animatable.b bVar4, com.airbnb.lottie.model.animatable.b bVar5, com.airbnb.lottie.model.animatable.b bVar6, boolean z10) {
        this.f37493a = str;
        this.f37494b = type;
        this.f37495c = bVar;
        this.f37496d = mVar;
        this.f37497e = bVar2;
        this.f37498f = bVar3;
        this.f37499g = bVar4;
        this.f37500h = bVar5;
        this.f37501i = bVar6;
        this.f37502j = z10;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.a aVar) {
        return new o(jVar, aVar, this);
    }

    public com.airbnb.lottie.model.animatable.b b() {
        return this.f37498f;
    }

    public com.airbnb.lottie.model.animatable.b c() {
        return this.f37500h;
    }

    public String d() {
        return this.f37493a;
    }

    public com.airbnb.lottie.model.animatable.b e() {
        return this.f37499g;
    }

    public com.airbnb.lottie.model.animatable.b f() {
        return this.f37501i;
    }

    public com.airbnb.lottie.model.animatable.b g() {
        return this.f37495c;
    }

    public com.airbnb.lottie.model.animatable.m<PointF, PointF> h() {
        return this.f37496d;
    }

    public com.airbnb.lottie.model.animatable.b i() {
        return this.f37497e;
    }

    public Type j() {
        return this.f37494b;
    }

    public boolean k() {
        return this.f37502j;
    }
}
