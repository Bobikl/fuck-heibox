package com.airbnb.lottie.animation.keyframe;

import android.graphics.Color;
import android.graphics.Paint;
import androidx.annotation.p0;

/* JADX INFO: compiled from: DropShadowKeyframeAnimation.java */
/* JADX INFO: loaded from: classes6.dex */
public class c implements com.airbnb.lottie.animation.keyframe.a.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final double f37265h = 0.017453292519943295d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a.b f37266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f37267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f37268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f37269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f37270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f37271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f37272g = true;

    /* JADX INFO: compiled from: DropShadowKeyframeAnimation.java */
    public class a extends com.airbnb.lottie.value.j<Float> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.value.j f37273d;

        a(com.airbnb.lottie.value.j jVar) {
            this.f37273d = jVar;
        }

        @Override // com.airbnb.lottie.value.j
        @p0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Float a(com.airbnb.lottie.value.b<Float> bVar) {
            Float f10 = (Float) this.f37273d.a(bVar);
            if (f10 == null) {
                return null;
            }
            return Float.valueOf(f10.floatValue() * 2.55f);
        }
    }

    public c(com.airbnb.lottie.animation.keyframe.a.b bVar, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.parser.j jVar) {
        this.f37266a = bVar;
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVarQ = jVar.a().q();
        this.f37267b = aVarQ;
        aVarQ.a(this);
        aVar.i(aVarQ);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarQ2 = jVar.d().q();
        this.f37268c = aVarQ2;
        aVarQ2.a(this);
        aVar.i(aVarQ2);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarQ3 = jVar.b().q();
        this.f37269d = aVarQ3;
        aVarQ3.a(this);
        aVar.i(aVarQ3);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarQ4 = jVar.c().q();
        this.f37270e = aVarQ4;
        aVarQ4.a(this);
        aVar.i(aVarQ4);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarQ5 = jVar.e().q();
        this.f37271f = aVarQ5;
        aVarQ5.a(this);
        aVar.i(aVarQ5);
    }

    public void a(Paint paint) {
        if (this.f37272g) {
            this.f37272g = false;
            double dFloatValue = ((double) this.f37269d.h().floatValue()) * 0.017453292519943295d;
            float fFloatValue = this.f37270e.h().floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = this.f37267b.h().intValue();
            paint.setShadowLayer(this.f37271f.h().floatValue(), fSin, fCos, Color.argb(Math.round(this.f37268c.h().floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }

    public void b(@p0 com.airbnb.lottie.value.j<Integer> jVar) {
        this.f37267b.n(jVar);
    }

    public void c(@p0 com.airbnb.lottie.value.j<Float> jVar) {
        this.f37269d.n(jVar);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void d() {
        this.f37272g = true;
        this.f37266a.d();
    }

    public void e(@p0 com.airbnb.lottie.value.j<Float> jVar) {
        this.f37270e.n(jVar);
    }

    public void f(@p0 com.airbnb.lottie.value.j<Float> jVar) {
        if (jVar == null) {
            this.f37268c.n(null);
        } else {
            this.f37268c.n(new a(jVar));
        }
    }

    public void g(@p0 com.airbnb.lottie.value.j<Float> jVar) {
        this.f37271f.n(jVar);
    }
}
