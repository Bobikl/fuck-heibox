package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.p0;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.List;

/* JADX INFO: compiled from: PolystarContent.java */
/* JADX INFO: loaded from: classes6.dex */
public class o implements n, com.airbnb.lottie.animation.keyframe.a.b, k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float f37195o = 0.47829f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final float f37196p = 0.25f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f37198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.j f37199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PolystarShape.Type f37200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f37201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f37202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> f37203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f37204h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f37205i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f37206j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f37207k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f37208l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f37210n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f37197a = new Path();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private b f37209m = new b();

    /* JADX INFO: compiled from: PolystarContent.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37211a;

        static {
            int[] iArr = new int[PolystarShape.Type.values().length];
            f37211a = iArr;
            try {
                iArr[PolystarShape.Type.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37211a[PolystarShape.Type.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public o(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.a aVar, PolystarShape polystarShape) {
        this.f37199c = jVar;
        this.f37198b = polystarShape.d();
        PolystarShape.Type typeJ = polystarShape.j();
        this.f37200d = typeJ;
        this.f37201e = polystarShape.k();
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarQ = polystarShape.g().q();
        this.f37202f = aVarQ;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> aVarQ2 = polystarShape.h().q();
        this.f37203g = aVarQ2;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarQ3 = polystarShape.i().q();
        this.f37204h = aVarQ3;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarQ4 = polystarShape.e().q();
        this.f37206j = aVarQ4;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarQ5 = polystarShape.f().q();
        this.f37208l = aVarQ5;
        PolystarShape.Type type = PolystarShape.Type.STAR;
        if (typeJ == type) {
            this.f37205i = polystarShape.b().q();
            this.f37207k = polystarShape.c().q();
        } else {
            this.f37205i = null;
            this.f37207k = null;
        }
        aVar.i(aVarQ);
        aVar.i(aVarQ2);
        aVar.i(aVarQ3);
        aVar.i(aVarQ4);
        aVar.i(aVarQ5);
        if (typeJ == type) {
            aVar.i(this.f37205i);
            aVar.i(this.f37207k);
        }
        aVarQ.a(this);
        aVarQ2.a(this);
        aVarQ3.a(this);
        aVarQ4.a(this);
        aVarQ5.a(this);
        if (typeJ == type) {
            this.f37205i.a(this);
            this.f37207k.a(this);
        }
    }

    private void b() {
        int iFloor = (int) Math.floor(this.f37202f.h().floatValue());
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar = this.f37204h;
        double radians = Math.toRadians((aVar == null ? 0.0d : aVar.h().floatValue()) - 90.0d);
        double d10 = iFloor;
        float fFloatValue = this.f37208l.h().floatValue() / 100.0f;
        float fFloatValue2 = this.f37206j.h().floatValue();
        double d11 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d11);
        float fSin = (float) (Math.sin(radians) * d11);
        this.f37197a.moveTo(fCos, fSin);
        double d12 = (float) (6.283185307179586d / d10);
        double d13 = radians + d12;
        double dCeil = Math.ceil(d10);
        int i10 = 0;
        while (i10 < dCeil) {
            float fCos2 = (float) (Math.cos(d13) * d11);
            double d14 = dCeil;
            float fSin2 = (float) (d11 * Math.sin(d13));
            if (fFloatValue != 0.0f) {
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                double dAtan3 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan3);
                float fSin4 = (float) Math.sin(dAtan3);
                float f10 = fFloatValue2 * fFloatValue * f37196p;
                this.f37197a.cubicTo(fCos - (fCos3 * f10), fSin - (fSin3 * f10), fCos2 + (fCos4 * f10), fSin2 + (f10 * fSin4), fCos2, fSin2);
            } else {
                this.f37197a.lineTo(fCos2, fSin2);
            }
            d13 += d12;
            i10++;
            fSin = fSin2;
            fCos = fCos2;
            dCeil = d14;
            d11 = d11;
            d12 = d12;
        }
        PointF pointFH = this.f37203g.h();
        this.f37197a.offset(pointFH.x, pointFH.y);
        this.f37197a.close();
    }

    private void h() {
        double d10;
        float fCos;
        float fSin;
        float f10;
        float f11;
        float fFloatValue = this.f37202f.h().floatValue();
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar = this.f37204h;
        double radians = Math.toRadians((aVar == null ? 0.0d : aVar.h().floatValue()) - 90.0d);
        double d11 = fFloatValue;
        float f12 = (float) (6.283185307179586d / d11);
        float f13 = f12 / 2.0f;
        float f14 = fFloatValue - ((int) fFloatValue);
        if (f14 != 0.0f) {
            radians += (double) ((1.0f - f14) * f13);
        }
        float fFloatValue2 = this.f37206j.h().floatValue();
        float fFloatValue3 = this.f37205i.h().floatValue();
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar2 = this.f37207k;
        float fFloatValue4 = aVar2 != null ? aVar2.h().floatValue() / 100.0f : 0.0f;
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar3 = this.f37208l;
        float fFloatValue5 = aVar3 != null ? aVar3.h().floatValue() / 100.0f : 0.0f;
        if (f14 != 0.0f) {
            f10 = ((fFloatValue2 - fFloatValue3) * f14) + fFloatValue3;
            double d12 = f10;
            fCos = (float) (d12 * Math.cos(radians));
            fSin = (float) (d12 * Math.sin(radians));
            this.f37197a.moveTo(fCos, fSin);
            d10 = radians + ((double) ((f12 * f14) / 2.0f));
        } else {
            double d13 = fFloatValue2;
            float fCos2 = (float) (Math.cos(radians) * d13);
            float fSin2 = (float) (d13 * Math.sin(radians));
            this.f37197a.moveTo(fCos2, fSin2);
            d10 = radians + ((double) f13);
            fCos = fCos2;
            fSin = fSin2;
            f10 = 0.0f;
        }
        double dCeil = Math.ceil(d11) * 2.0d;
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            double d14 = i10;
            if (d14 >= dCeil) {
                PointF pointFH = this.f37203g.h();
                this.f37197a.offset(pointFH.x, pointFH.y);
                this.f37197a.close();
                return;
            }
            float f15 = z10 ? fFloatValue2 : fFloatValue3;
            float f16 = (f10 == 0.0f || d14 != dCeil - 2.0d) ? f13 : (f12 * f14) / 2.0f;
            double d15 = (f10 == 0.0f || d14 != dCeil - 1.0d) ? f15 : f10;
            double d16 = dCeil;
            float fCos3 = (float) (d15 * Math.cos(d10));
            float fSin3 = (float) (d15 * Math.sin(d10));
            if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                this.f37197a.lineTo(fCos3, fSin3);
                f11 = fFloatValue4;
            } else {
                f11 = fFloatValue4;
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan2);
                float fSin4 = (float) Math.sin(dAtan2);
                double dAtan3 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                float fCos5 = (float) Math.cos(dAtan3);
                float fSin5 = (float) Math.sin(dAtan3);
                float f17 = z10 ? f11 : fFloatValue5;
                float f18 = z10 ? fFloatValue5 : f11;
                float f19 = z10 ? fFloatValue3 : fFloatValue2;
                float f20 = z10 ? fFloatValue2 : fFloatValue3;
                float f21 = f19 * f17 * f37195o;
                float f22 = fCos4 * f21;
                float f23 = f21 * fSin4;
                float f24 = f20 * f18 * f37195o;
                float f25 = fCos5 * f24;
                float f26 = f24 * fSin5;
                if (f14 != 0.0f) {
                    if (i10 == 0) {
                        f22 *= f14;
                        f23 *= f14;
                    } else if (d14 == d16 - 1.0d) {
                        f25 *= f14;
                        f26 *= f14;
                    }
                }
                this.f37197a.cubicTo(fCos - f22, fSin - f23, fCos3 + f25, fSin3 + f26, fCos3, fSin3);
            }
            d10 += (double) f16;
            z10 = !z10;
            i10++;
            fCos = fCos3;
            fSin = fSin3;
            fFloatValue4 = f11;
            f10 = f10;
            f13 = f13;
            f12 = f12;
            dCeil = d16;
        }
    }

    private void i() {
        this.f37210n = false;
        this.f37199c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void d() {
        i();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void e(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof t) {
                t tVar = (t) cVar;
                if (tVar.i() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f37209m.a(tVar);
                    tVar.b(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void f(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar;
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar2;
        if (t10 == com.airbnb.lottie.o.f37672w) {
            this.f37202f.n(jVar);
            return;
        }
        if (t10 == com.airbnb.lottie.o.f37673x) {
            this.f37204h.n(jVar);
            return;
        }
        if (t10 == com.airbnb.lottie.o.f37663n) {
            this.f37203g.n(jVar);
            return;
        }
        if (t10 == com.airbnb.lottie.o.f37674y && (aVar2 = this.f37205i) != null) {
            aVar2.n(jVar);
            return;
        }
        if (t10 == com.airbnb.lottie.o.f37675z) {
            this.f37206j.n(jVar);
            return;
        }
        if (t10 == com.airbnb.lottie.o.A && (aVar = this.f37207k) != null) {
            aVar.n(jVar);
        } else if (t10 == com.airbnb.lottie.o.B) {
            this.f37208l.n(jVar);
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void g(com.airbnb.lottie.model.d dVar, int i10, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        com.airbnb.lottie.utils.i.m(dVar, i10, list, dVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f37198b;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path getPath() {
        if (this.f37210n) {
            return this.f37197a;
        }
        this.f37197a.reset();
        if (this.f37201e) {
            this.f37210n = true;
            return this.f37197a;
        }
        int i10 = a.f37211a[this.f37200d.ordinal()];
        if (i10 == 1) {
            h();
        } else if (i10 == 2) {
            b();
        }
        this.f37197a.close();
        this.f37209m.b(this.f37197a);
        this.f37210n = true;
        return this.f37197a;
    }
}
