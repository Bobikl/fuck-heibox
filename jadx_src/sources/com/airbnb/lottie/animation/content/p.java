package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.p0;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.List;

/* JADX INFO: compiled from: RectangleContent.java */
/* JADX INFO: loaded from: classes6.dex */
public class p implements com.airbnb.lottie.animation.keyframe.a.b, k, n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f37214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f37215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.j f37216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> f37217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> f37218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f37219h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f37221j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f37212a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f37213b = new RectF();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b f37220i = new b();

    public p(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.g gVar) {
        this.f37214c = gVar.c();
        this.f37215d = gVar.f();
        this.f37216e = jVar;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> aVarQ = gVar.d().q();
        this.f37217f = aVarQ;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> aVarQ2 = gVar.e().q();
        this.f37218g = aVarQ2;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarQ3 = gVar.b().q();
        this.f37219h = aVarQ3;
        aVar.i(aVarQ);
        aVar.i(aVarQ2);
        aVar.i(aVarQ3);
        aVarQ.a(this);
        aVarQ2.a(this);
        aVarQ3.a(this);
    }

    private void b() {
        this.f37221j = false;
        this.f37216e.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void d() {
        b();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void e(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof t) {
                t tVar = (t) cVar;
                if (tVar.i() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f37220i.a(tVar);
                    tVar.b(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void f(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        if (t10 == com.airbnb.lottie.o.f37661l) {
            this.f37218g.n(jVar);
        } else if (t10 == com.airbnb.lottie.o.f37663n) {
            this.f37217f.n(jVar);
        } else if (t10 == com.airbnb.lottie.o.f37662m) {
            this.f37219h.n(jVar);
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void g(com.airbnb.lottie.model.d dVar, int i10, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        com.airbnb.lottie.utils.i.m(dVar, i10, list, dVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f37214c;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path getPath() {
        if (this.f37221j) {
            return this.f37212a;
        }
        this.f37212a.reset();
        if (this.f37215d) {
            this.f37221j = true;
            return this.f37212a;
        }
        PointF pointFH = this.f37218g.h();
        float f10 = pointFH.x / 2.0f;
        float f11 = pointFH.y / 2.0f;
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar = this.f37219h;
        float fP = aVar == null ? 0.0f : ((com.airbnb.lottie.animation.keyframe.d) aVar).p();
        float fMin = Math.min(f10, f11);
        if (fP > fMin) {
            fP = fMin;
        }
        PointF pointFH2 = this.f37217f.h();
        this.f37212a.moveTo(pointFH2.x + f10, (pointFH2.y - f11) + fP);
        this.f37212a.lineTo(pointFH2.x + f10, (pointFH2.y + f11) - fP);
        if (fP > 0.0f) {
            RectF rectF = this.f37213b;
            float f12 = pointFH2.x;
            float f13 = fP * 2.0f;
            float f14 = pointFH2.y;
            rectF.set((f12 + f10) - f13, (f14 + f11) - f13, f12 + f10, f14 + f11);
            this.f37212a.arcTo(this.f37213b, 0.0f, 90.0f, false);
        }
        this.f37212a.lineTo((pointFH2.x - f10) + fP, pointFH2.y + f11);
        if (fP > 0.0f) {
            RectF rectF2 = this.f37213b;
            float f15 = pointFH2.x;
            float f16 = pointFH2.y;
            float f17 = fP * 2.0f;
            rectF2.set(f15 - f10, (f16 + f11) - f17, (f15 - f10) + f17, f16 + f11);
            this.f37212a.arcTo(this.f37213b, 90.0f, 90.0f, false);
        }
        this.f37212a.lineTo(pointFH2.x - f10, (pointFH2.y - f11) + fP);
        if (fP > 0.0f) {
            RectF rectF3 = this.f37213b;
            float f18 = pointFH2.x;
            float f19 = pointFH2.y;
            float f20 = fP * 2.0f;
            rectF3.set(f18 - f10, f19 - f11, (f18 - f10) + f20, (f19 - f11) + f20);
            this.f37212a.arcTo(this.f37213b, 180.0f, 90.0f, false);
        }
        this.f37212a.lineTo((pointFH2.x + f10) - fP, pointFH2.y - f11);
        if (fP > 0.0f) {
            RectF rectF4 = this.f37213b;
            float f21 = pointFH2.x;
            float f22 = fP * 2.0f;
            float f23 = pointFH2.y;
            rectF4.set((f21 + f10) - f22, f23 - f11, f21 + f10, (f23 - f11) + f22);
            this.f37212a.arcTo(this.f37213b, 270.0f, 90.0f, false);
        }
        this.f37212a.close();
        this.f37220i.b(this.f37212a);
        this.f37221j = true;
        return this.f37212a;
    }
}
