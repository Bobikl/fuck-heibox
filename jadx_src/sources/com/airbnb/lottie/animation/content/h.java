package com.airbnb.lottie.animation.content;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.collection.x0;
import com.airbnb.lottie.model.content.GradientType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: GradientFillContent.java */
/* JADX INFO: loaded from: classes6.dex */
public class h implements e, com.airbnb.lottie.animation.keyframe.a.b, k {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f37157v = 32;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final String f37158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f37159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.layer.a f37160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x0<LinearGradient> f37161d = new x0<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x0<RadialGradient> f37162e = new x0<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Path f37163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f37164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final RectF f37165h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<n> f37166i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final GradientType f37167j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.d, com.airbnb.lottie.model.content.d> f37168k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f37169l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> f37170m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> f37171n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> f37172o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.animation.keyframe.q f37173p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.airbnb.lottie.j f37174q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f37175r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> f37176s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    float f37177t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.animation.keyframe.c f37178u;

    public h(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.e eVar) {
        Path path = new Path();
        this.f37163f = path;
        this.f37164g = new z3.a(1);
        this.f37165h = new RectF();
        this.f37166i = new ArrayList();
        this.f37177t = 0.0f;
        this.f37160c = aVar;
        this.f37158a = eVar.h();
        this.f37159b = eVar.k();
        this.f37174q = jVar;
        this.f37167j = eVar.e();
        path.setFillType(eVar.c());
        this.f37175r = (int) (jVar.x().d() / 32.0f);
        com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.d, com.airbnb.lottie.model.content.d> aVarQ = eVar.d().q();
        this.f37168k = aVarQ;
        aVarQ.a(this);
        aVar.i(aVarQ);
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVarQ2 = eVar.i().q();
        this.f37169l = aVarQ2;
        aVarQ2.a(this);
        aVar.i(aVarQ2);
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> aVarQ3 = eVar.j().q();
        this.f37170m = aVarQ3;
        aVarQ3.a(this);
        aVar.i(aVarQ3);
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> aVarQ4 = eVar.b().q();
        this.f37171n = aVarQ4;
        aVarQ4.a(this);
        aVar.i(aVarQ4);
        if (aVar.v() != null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarQ5 = aVar.v().a().q();
            this.f37176s = aVarQ5;
            aVarQ5.a(this);
            aVar.i(this.f37176s);
        }
        if (aVar.x() != null) {
            this.f37178u = new com.airbnb.lottie.animation.keyframe.c(this, aVar, aVar.x());
        }
    }

    private int[] b(int[] iArr) {
        com.airbnb.lottie.animation.keyframe.q qVar = this.f37173p;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.h();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    private int h() {
        int iRound = Math.round(this.f37170m.f() * this.f37175r);
        int iRound2 = Math.round(this.f37171n.f() * this.f37175r);
        int iRound3 = Math.round(this.f37168k.f() * this.f37175r);
        int i10 = iRound != 0 ? bb.c.b.f30674h7 * iRound : 17;
        if (iRound2 != 0) {
            i10 = i10 * 31 * iRound2;
        }
        return iRound3 != 0 ? i10 * 31 * iRound3 : i10;
    }

    private LinearGradient i() {
        long jH = h();
        LinearGradient linearGradientG = this.f37161d.g(jH);
        if (linearGradientG != null) {
            return linearGradientG;
        }
        PointF pointFH = this.f37170m.h();
        PointF pointFH2 = this.f37171n.h();
        com.airbnb.lottie.model.content.d dVarH = this.f37168k.h();
        LinearGradient linearGradient = new LinearGradient(pointFH.x, pointFH.y, pointFH2.x, pointFH2.y, b(dVarH.a()), dVarH.b(), Shader.TileMode.CLAMP);
        this.f37161d.m(jH, linearGradient);
        return linearGradient;
    }

    private RadialGradient j() {
        long jH = h();
        RadialGradient radialGradientG = this.f37162e.g(jH);
        if (radialGradientG != null) {
            return radialGradientG;
        }
        PointF pointFH = this.f37170m.h();
        PointF pointFH2 = this.f37171n.h();
        com.airbnb.lottie.model.content.d dVarH = this.f37168k.h();
        int[] iArrB = b(dVarH.a());
        float[] fArrB = dVarH.b();
        float f10 = pointFH.x;
        float f11 = pointFH.y;
        float fHypot = (float) Math.hypot(pointFH2.x - f10, pointFH2.y - f11);
        if (fHypot <= 0.0f) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient = new RadialGradient(f10, f11, fHypot, iArrB, fArrB, Shader.TileMode.CLAMP);
        this.f37162e.m(jH, radialGradient);
        return radialGradient;
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        this.f37163f.reset();
        for (int i10 = 0; i10 < this.f37166i.size(); i10++) {
            this.f37163f.addPath(this.f37166i.get(i10).getPath(), matrix);
        }
        this.f37163f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void c(Canvas canvas, Matrix matrix, int i10) {
        if (this.f37159b) {
            return;
        }
        com.airbnb.lottie.e.a("GradientFillContent#draw");
        this.f37163f.reset();
        for (int i11 = 0; i11 < this.f37166i.size(); i11++) {
            this.f37163f.addPath(this.f37166i.get(i11).getPath(), matrix);
        }
        this.f37163f.computeBounds(this.f37165h, false);
        Shader shaderI = this.f37167j == GradientType.LINEAR ? i() : j();
        shaderI.setLocalMatrix(matrix);
        this.f37164g.setShader(shaderI);
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f37172o;
        if (aVar != null) {
            this.f37164g.setColorFilter(aVar.h());
        }
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f37176s;
        if (aVar2 != null) {
            float fFloatValue = aVar2.h().floatValue();
            if (fFloatValue == 0.0f) {
                this.f37164g.setMaskFilter(null);
            } else if (fFloatValue != this.f37177t) {
                this.f37164g.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f37177t = fFloatValue;
        }
        com.airbnb.lottie.animation.keyframe.c cVar = this.f37178u;
        if (cVar != null) {
            cVar.a(this.f37164g);
        }
        this.f37164g.setAlpha(com.airbnb.lottie.utils.i.d((int) ((((i10 / 255.0f) * this.f37169l.h().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f37163f, this.f37164g);
        com.airbnb.lottie.e.b("GradientFillContent#draw");
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void d() {
        this.f37174q.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void e(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = list2.get(i10);
            if (cVar instanceof n) {
                this.f37166i.add((n) cVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.model.e
    public <T> void f(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.animation.keyframe.c cVar;
        com.airbnb.lottie.animation.keyframe.c cVar2;
        com.airbnb.lottie.animation.keyframe.c cVar3;
        com.airbnb.lottie.animation.keyframe.c cVar4;
        com.airbnb.lottie.animation.keyframe.c cVar5;
        if (t10 == com.airbnb.lottie.o.f37653d) {
            this.f37169l.n(jVar);
            return;
        }
        if (t10 == com.airbnb.lottie.o.K) {
            com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f37172o;
            if (aVar != null) {
                this.f37160c.F(aVar);
            }
            if (jVar == null) {
                this.f37172o = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f37172o = qVar;
            qVar.a(this);
            this.f37160c.i(this.f37172o);
            return;
        }
        if (t10 == com.airbnb.lottie.o.L) {
            com.airbnb.lottie.animation.keyframe.q qVar2 = this.f37173p;
            if (qVar2 != null) {
                this.f37160c.F(qVar2);
            }
            if (jVar == null) {
                this.f37173p = null;
                return;
            }
            this.f37161d.b();
            this.f37162e.b();
            com.airbnb.lottie.animation.keyframe.q qVar3 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f37173p = qVar3;
            qVar3.a(this);
            this.f37160c.i(this.f37173p);
            return;
        }
        if (t10 == com.airbnb.lottie.o.f37659j) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f37176s;
            if (aVar2 != null) {
                aVar2.n(jVar);
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar4 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f37176s = qVar4;
            qVar4.a(this);
            this.f37160c.i(this.f37176s);
            return;
        }
        if (t10 == com.airbnb.lottie.o.f37654e && (cVar5 = this.f37178u) != null) {
            cVar5.b(jVar);
            return;
        }
        if (t10 == com.airbnb.lottie.o.G && (cVar4 = this.f37178u) != null) {
            cVar4.f(jVar);
            return;
        }
        if (t10 == com.airbnb.lottie.o.H && (cVar3 = this.f37178u) != null) {
            cVar3.c(jVar);
            return;
        }
        if (t10 == com.airbnb.lottie.o.I && (cVar2 = this.f37178u) != null) {
            cVar2.e(jVar);
        } else {
            if (t10 != com.airbnb.lottie.o.J || (cVar = this.f37178u) == null) {
                return;
            }
            cVar.g(jVar);
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void g(com.airbnb.lottie.model.d dVar, int i10, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        com.airbnb.lottie.utils.i.m(dVar, i10, list, dVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f37158a;
    }
}
