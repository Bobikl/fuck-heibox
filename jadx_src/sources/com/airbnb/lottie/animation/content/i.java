package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.p0;
import androidx.collection.x0;
import com.airbnb.lottie.model.content.GradientType;

/* JADX INFO: compiled from: GradientStrokeContent.java */
/* JADX INFO: loaded from: classes6.dex */
public class i extends a {
    private static final int C = 32;
    private final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> A;

    @p0
    private com.airbnb.lottie.animation.keyframe.q B;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f37179r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f37180s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final x0<LinearGradient> f37181t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final x0<RadialGradient> f37182u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final RectF f37183v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final GradientType f37184w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f37185x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.d, com.airbnb.lottie.model.content.d> f37186y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> f37187z;

    public i(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.f fVar) {
        super(jVar, aVar, fVar.b().toPaintCap(), fVar.g().toPaintJoin(), fVar.i(), fVar.k(), fVar.m(), fVar.h(), fVar.c());
        this.f37181t = new x0<>();
        this.f37182u = new x0<>();
        this.f37183v = new RectF();
        this.f37179r = fVar.j();
        this.f37184w = fVar.f();
        this.f37180s = fVar.n();
        this.f37185x = (int) (jVar.x().d() / 32.0f);
        com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.d, com.airbnb.lottie.model.content.d> aVarQ = fVar.e().q();
        this.f37186y = aVarQ;
        aVarQ.a(this);
        aVar.i(aVarQ);
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> aVarQ2 = fVar.l().q();
        this.f37187z = aVarQ2;
        aVarQ2.a(this);
        aVar.i(aVarQ2);
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> aVarQ3 = fVar.d().q();
        this.A = aVarQ3;
        aVarQ3.a(this);
        aVar.i(aVarQ3);
    }

    private int[] i(int[] iArr) {
        com.airbnb.lottie.animation.keyframe.q qVar = this.B;
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

    private int j() {
        int iRound = Math.round(this.f37187z.f() * this.f37185x);
        int iRound2 = Math.round(this.A.f() * this.f37185x);
        int iRound3 = Math.round(this.f37186y.f() * this.f37185x);
        int i10 = iRound != 0 ? bb.c.b.f30674h7 * iRound : 17;
        if (iRound2 != 0) {
            i10 = i10 * 31 * iRound2;
        }
        return iRound3 != 0 ? i10 * 31 * iRound3 : i10;
    }

    private LinearGradient k() {
        long j10 = j();
        LinearGradient linearGradientG = this.f37181t.g(j10);
        if (linearGradientG != null) {
            return linearGradientG;
        }
        PointF pointFH = this.f37187z.h();
        PointF pointFH2 = this.A.h();
        com.airbnb.lottie.model.content.d dVarH = this.f37186y.h();
        LinearGradient linearGradient = new LinearGradient(pointFH.x, pointFH.y, pointFH2.x, pointFH2.y, i(dVarH.a()), dVarH.b(), Shader.TileMode.CLAMP);
        this.f37181t.m(j10, linearGradient);
        return linearGradient;
    }

    private RadialGradient l() {
        long j10 = j();
        RadialGradient radialGradientG = this.f37182u.g(j10);
        if (radialGradientG != null) {
            return radialGradientG;
        }
        PointF pointFH = this.f37187z.h();
        PointF pointFH2 = this.A.h();
        com.airbnb.lottie.model.content.d dVarH = this.f37186y.h();
        int[] iArrI = i(dVarH.a());
        float[] fArrB = dVarH.b();
        float f10 = pointFH.x;
        float f11 = pointFH.y;
        RadialGradient radialGradient = new RadialGradient(f10, f11, (float) Math.hypot(pointFH2.x - f10, pointFH2.y - f11), iArrI, fArrB, Shader.TileMode.CLAMP);
        this.f37182u.m(j10, radialGradient);
        return radialGradient;
    }

    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.animation.content.e
    public void c(Canvas canvas, Matrix matrix, int i10) {
        if (this.f37180s) {
            return;
        }
        a(this.f37183v, matrix, false);
        Shader shaderK = this.f37184w == GradientType.LINEAR ? k() : l();
        shaderK.setLocalMatrix(matrix);
        this.f37112i.setShader(shaderK);
        super.c(canvas, matrix, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.model.e
    public <T> void f(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        super.f(t10, jVar);
        if (t10 == com.airbnb.lottie.o.L) {
            com.airbnb.lottie.animation.keyframe.q qVar = this.B;
            if (qVar != null) {
                this.f37109f.F(qVar);
            }
            if (jVar == null) {
                this.B = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar2 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.B = qVar2;
            qVar2.a(this);
            this.f37109f.i(this.B);
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f37179r;
    }
}
