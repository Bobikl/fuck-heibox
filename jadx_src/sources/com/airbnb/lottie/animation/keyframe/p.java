package com.airbnb.lottie.animation.keyframe;

import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.Collections;

/* JADX INFO: compiled from: TransformKeyframeAnimation.java */
/* JADX INFO: loaded from: classes6.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Matrix f37295a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix f37296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f37297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Matrix f37298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float[] f37299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    private a<PointF, PointF> f37300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    private a<?, PointF> f37301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    private a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> f37302h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    private a<Float, Float> f37303i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @n0
    private a<Integer, Integer> f37304j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private d f37305k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private d f37306l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private a<?, Float> f37307m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private a<?, Float> f37308n;

    public p(com.airbnb.lottie.model.animatable.l lVar) {
        this.f37300f = lVar.c() == null ? null : lVar.c().q();
        this.f37301g = lVar.f() == null ? null : lVar.f().q();
        this.f37302h = lVar.h() == null ? null : lVar.h().q();
        this.f37303i = lVar.g() == null ? null : lVar.g().q();
        d dVar = lVar.i() == null ? null : (d) lVar.i().q();
        this.f37305k = dVar;
        if (dVar != null) {
            this.f37296b = new Matrix();
            this.f37297c = new Matrix();
            this.f37298d = new Matrix();
            this.f37299e = new float[9];
        } else {
            this.f37296b = null;
            this.f37297c = null;
            this.f37298d = null;
            this.f37299e = null;
        }
        this.f37306l = lVar.j() == null ? null : (d) lVar.j().q();
        if (lVar.e() != null) {
            this.f37304j = lVar.e().q();
        }
        if (lVar.k() != null) {
            this.f37307m = lVar.k().q();
        } else {
            this.f37307m = null;
        }
        if (lVar.d() != null) {
            this.f37308n = lVar.d().q();
        } else {
            this.f37308n = null;
        }
    }

    private void d() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f37299e[i10] = 0.0f;
        }
    }

    public void a(com.airbnb.lottie.model.layer.a aVar) {
        aVar.i(this.f37304j);
        aVar.i(this.f37307m);
        aVar.i(this.f37308n);
        aVar.i(this.f37300f);
        aVar.i(this.f37301g);
        aVar.i(this.f37302h);
        aVar.i(this.f37303i);
        aVar.i(this.f37305k);
        aVar.i(this.f37306l);
    }

    public void b(a.b bVar) {
        a<Integer, Integer> aVar = this.f37304j;
        if (aVar != null) {
            aVar.a(bVar);
        }
        a<?, Float> aVar2 = this.f37307m;
        if (aVar2 != null) {
            aVar2.a(bVar);
        }
        a<?, Float> aVar3 = this.f37308n;
        if (aVar3 != null) {
            aVar3.a(bVar);
        }
        a<PointF, PointF> aVar4 = this.f37300f;
        if (aVar4 != null) {
            aVar4.a(bVar);
        }
        a<?, PointF> aVar5 = this.f37301g;
        if (aVar5 != null) {
            aVar5.a(bVar);
        }
        a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar6 = this.f37302h;
        if (aVar6 != null) {
            aVar6.a(bVar);
        }
        a<Float, Float> aVar7 = this.f37303i;
        if (aVar7 != null) {
            aVar7.a(bVar);
        }
        d dVar = this.f37305k;
        if (dVar != null) {
            dVar.a(bVar);
        }
        d dVar2 = this.f37306l;
        if (dVar2 != null) {
            dVar2.a(bVar);
        }
    }

    public <T> boolean c(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        d dVar;
        d dVar2;
        a<?, Float> aVar;
        a<?, Float> aVar2;
        if (t10 == com.airbnb.lottie.o.f37655f) {
            a<PointF, PointF> aVar3 = this.f37300f;
            if (aVar3 == null) {
                this.f37300f = new q(jVar, new PointF());
                return true;
            }
            aVar3.n(jVar);
            return true;
        }
        if (t10 == com.airbnb.lottie.o.f37656g) {
            a<?, PointF> aVar4 = this.f37301g;
            if (aVar4 == null) {
                this.f37301g = new q(jVar, new PointF());
                return true;
            }
            aVar4.n(jVar);
            return true;
        }
        if (t10 == com.airbnb.lottie.o.f37657h) {
            a<?, PointF> aVar5 = this.f37301g;
            if (aVar5 instanceof n) {
                ((n) aVar5).r(jVar);
                return true;
            }
        }
        if (t10 == com.airbnb.lottie.o.f37658i) {
            a<?, PointF> aVar6 = this.f37301g;
            if (aVar6 instanceof n) {
                ((n) aVar6).s(jVar);
                return true;
            }
        }
        if (t10 == com.airbnb.lottie.o.f37664o) {
            a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar7 = this.f37302h;
            if (aVar7 == null) {
                this.f37302h = new q(jVar, new com.airbnb.lottie.value.k());
                return true;
            }
            aVar7.n(jVar);
            return true;
        }
        if (t10 == com.airbnb.lottie.o.f37665p) {
            a<Float, Float> aVar8 = this.f37303i;
            if (aVar8 == null) {
                this.f37303i = new q(jVar, Float.valueOf(0.0f));
                return true;
            }
            aVar8.n(jVar);
            return true;
        }
        if (t10 == com.airbnb.lottie.o.f37652c) {
            a<Integer, Integer> aVar9 = this.f37304j;
            if (aVar9 == null) {
                this.f37304j = new q(jVar, 100);
                return true;
            }
            aVar9.n(jVar);
            return true;
        }
        if (t10 == com.airbnb.lottie.o.C && (aVar2 = this.f37307m) != null) {
            if (aVar2 == null) {
                this.f37307m = new q(jVar, 100);
                return true;
            }
            aVar2.n(jVar);
            return true;
        }
        if (t10 == com.airbnb.lottie.o.D && (aVar = this.f37308n) != null) {
            if (aVar == null) {
                this.f37308n = new q(jVar, 100);
                return true;
            }
            aVar.n(jVar);
            return true;
        }
        if (t10 == com.airbnb.lottie.o.f37666q && (dVar2 = this.f37305k) != null) {
            if (dVar2 == null) {
                this.f37305k = new d(Collections.singletonList(new com.airbnb.lottie.value.a(Float.valueOf(0.0f))));
            }
            this.f37305k.n(jVar);
            return true;
        }
        if (t10 != com.airbnb.lottie.o.f37667r || (dVar = this.f37306l) == null) {
            return false;
        }
        if (dVar == null) {
            this.f37306l = new d(Collections.singletonList(new com.airbnb.lottie.value.a(Float.valueOf(0.0f))));
        }
        this.f37306l.n(jVar);
        return true;
    }

    @p0
    public a<?, Float> e() {
        return this.f37308n;
    }

    public Matrix f() {
        this.f37295a.reset();
        a<?, PointF> aVar = this.f37301g;
        if (aVar != null) {
            PointF pointFH = aVar.h();
            float f10 = pointFH.x;
            if (f10 != 0.0f || pointFH.y != 0.0f) {
                this.f37295a.preTranslate(f10, pointFH.y);
            }
        }
        a<Float, Float> aVar2 = this.f37303i;
        if (aVar2 != null) {
            float fFloatValue = aVar2 instanceof q ? aVar2.h().floatValue() : ((d) aVar2).p();
            if (fFloatValue != 0.0f) {
                this.f37295a.preRotate(fFloatValue);
            }
        }
        if (this.f37305k != null) {
            d dVar = this.f37306l;
            float fCos = dVar == null ? 0.0f : (float) Math.cos(Math.toRadians((-dVar.p()) + 90.0f));
            d dVar2 = this.f37306l;
            float fSin = dVar2 == null ? 1.0f : (float) Math.sin(Math.toRadians((-dVar2.p()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(this.f37305k.p()));
            d();
            float[] fArr = this.f37299e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f11 = -fSin;
            fArr[3] = f11;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.f37296b.setValues(fArr);
            d();
            float[] fArr2 = this.f37299e;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f37297c.setValues(fArr2);
            d();
            float[] fArr3 = this.f37299e;
            fArr3[0] = fCos;
            fArr3[1] = f11;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.f37298d.setValues(fArr3);
            this.f37297c.preConcat(this.f37296b);
            this.f37298d.preConcat(this.f37297c);
            this.f37295a.preConcat(this.f37298d);
        }
        a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar3 = this.f37302h;
        if (aVar3 != null) {
            com.airbnb.lottie.value.k kVarH = aVar3.h();
            if (kVarH.b() != 1.0f || kVarH.c() != 1.0f) {
                this.f37295a.preScale(kVarH.b(), kVarH.c());
            }
        }
        a<PointF, PointF> aVar4 = this.f37300f;
        if (aVar4 != null) {
            PointF pointFH2 = aVar4.h();
            float f12 = pointFH2.x;
            if (f12 != 0.0f || pointFH2.y != 0.0f) {
                this.f37295a.preTranslate(-f12, -pointFH2.y);
            }
        }
        return this.f37295a;
    }

    public Matrix g(float f10) {
        a<?, PointF> aVar = this.f37301g;
        PointF pointFH = aVar == null ? null : aVar.h();
        a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar2 = this.f37302h;
        com.airbnb.lottie.value.k kVarH = aVar2 == null ? null : aVar2.h();
        this.f37295a.reset();
        if (pointFH != null) {
            this.f37295a.preTranslate(pointFH.x * f10, pointFH.y * f10);
        }
        if (kVarH != null) {
            double d10 = f10;
            this.f37295a.preScale((float) Math.pow(kVarH.b(), d10), (float) Math.pow(kVarH.c(), d10));
        }
        a<Float, Float> aVar3 = this.f37303i;
        if (aVar3 != null) {
            float fFloatValue = aVar3.h().floatValue();
            a<PointF, PointF> aVar4 = this.f37300f;
            PointF pointFH2 = aVar4 != null ? aVar4.h() : null;
            this.f37295a.preRotate(fFloatValue * f10, pointFH2 == null ? 0.0f : pointFH2.x, pointFH2 != null ? pointFH2.y : 0.0f);
        }
        return this.f37295a;
    }

    @p0
    public a<?, Integer> h() {
        return this.f37304j;
    }

    @p0
    public a<?, Float> i() {
        return this.f37307m;
    }

    public void j(float f10) {
        a<Integer, Integer> aVar = this.f37304j;
        if (aVar != null) {
            aVar.m(f10);
        }
        a<?, Float> aVar2 = this.f37307m;
        if (aVar2 != null) {
            aVar2.m(f10);
        }
        a<?, Float> aVar3 = this.f37308n;
        if (aVar3 != null) {
            aVar3.m(f10);
        }
        a<PointF, PointF> aVar4 = this.f37300f;
        if (aVar4 != null) {
            aVar4.m(f10);
        }
        a<?, PointF> aVar5 = this.f37301g;
        if (aVar5 != null) {
            aVar5.m(f10);
        }
        a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar6 = this.f37302h;
        if (aVar6 != null) {
            aVar6.m(f10);
        }
        a<Float, Float> aVar7 = this.f37303i;
        if (aVar7 != null) {
            aVar7.m(f10);
        }
        d dVar = this.f37305k;
        if (dVar != null) {
            dVar.m(f10);
        }
        d dVar2 = this.f37306l;
        if (dVar2 != null) {
            dVar2.m(f10);
        }
    }
}
