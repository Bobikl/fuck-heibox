package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: FillContent.java */
/* JADX INFO: loaded from: classes6.dex */
public class g implements e, com.airbnb.lottie.animation.keyframe.a.b, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f37144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f37145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.layer.a f37146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f37147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f37148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<n> f37149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f37150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f37151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> f37152i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.airbnb.lottie.j f37153j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> f37154k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    float f37155l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.animation.keyframe.c f37156m;

    public g(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.j jVar2) {
        Path path = new Path();
        this.f37144a = path;
        this.f37145b = new z3.a(1);
        this.f37149f = new ArrayList();
        this.f37146c = aVar;
        this.f37147d = jVar2.d();
        this.f37148e = jVar2.f();
        this.f37153j = jVar;
        if (aVar.v() != null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarQ = aVar.v().a().q();
            this.f37154k = aVarQ;
            aVarQ.a(this);
            aVar.i(this.f37154k);
        }
        if (aVar.x() != null) {
            this.f37156m = new com.airbnb.lottie.animation.keyframe.c(this, aVar, aVar.x());
        }
        if (jVar2.b() == null || jVar2.e() == null) {
            this.f37150g = null;
            this.f37151h = null;
            return;
        }
        path.setFillType(jVar2.c());
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVarQ2 = jVar2.b().q();
        this.f37150g = aVarQ2;
        aVarQ2.a(this);
        aVar.i(aVarQ2);
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVarQ3 = jVar2.e().q();
        this.f37151h = aVarQ3;
        aVarQ3.a(this);
        aVar.i(aVarQ3);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        this.f37144a.reset();
        for (int i10 = 0; i10 < this.f37149f.size(); i10++) {
            this.f37144a.addPath(this.f37149f.get(i10).getPath(), matrix);
        }
        this.f37144a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void c(Canvas canvas, Matrix matrix, int i10) {
        if (this.f37148e) {
            return;
        }
        com.airbnb.lottie.e.a("FillContent#draw");
        this.f37145b.setColor(((com.airbnb.lottie.animation.keyframe.b) this.f37150g).p());
        this.f37145b.setAlpha(com.airbnb.lottie.utils.i.d((int) ((((i10 / 255.0f) * this.f37151h.h().intValue()) / 100.0f) * 255.0f), 0, 255));
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f37152i;
        if (aVar != null) {
            this.f37145b.setColorFilter(aVar.h());
        }
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f37154k;
        if (aVar2 != null) {
            float fFloatValue = aVar2.h().floatValue();
            if (fFloatValue == 0.0f) {
                this.f37145b.setMaskFilter(null);
            } else if (fFloatValue != this.f37155l) {
                this.f37145b.setMaskFilter(this.f37146c.w(fFloatValue));
            }
            this.f37155l = fFloatValue;
        }
        com.airbnb.lottie.animation.keyframe.c cVar = this.f37156m;
        if (cVar != null) {
            cVar.a(this.f37145b);
        }
        this.f37144a.reset();
        for (int i11 = 0; i11 < this.f37149f.size(); i11++) {
            this.f37144a.addPath(this.f37149f.get(i11).getPath(), matrix);
        }
        canvas.drawPath(this.f37144a, this.f37145b);
        com.airbnb.lottie.e.b("FillContent#draw");
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void d() {
        this.f37153j.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void e(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = list2.get(i10);
            if (cVar instanceof n) {
                this.f37149f.add((n) cVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void f(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.animation.keyframe.c cVar;
        com.airbnb.lottie.animation.keyframe.c cVar2;
        com.airbnb.lottie.animation.keyframe.c cVar3;
        com.airbnb.lottie.animation.keyframe.c cVar4;
        com.airbnb.lottie.animation.keyframe.c cVar5;
        if (t10 == com.airbnb.lottie.o.f37650a) {
            this.f37150g.n(jVar);
            return;
        }
        if (t10 == com.airbnb.lottie.o.f37653d) {
            this.f37151h.n(jVar);
            return;
        }
        if (t10 == com.airbnb.lottie.o.K) {
            com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f37152i;
            if (aVar != null) {
                this.f37146c.F(aVar);
            }
            if (jVar == null) {
                this.f37152i = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f37152i = qVar;
            qVar.a(this);
            this.f37146c.i(this.f37152i);
            return;
        }
        if (t10 == com.airbnb.lottie.o.f37659j) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f37154k;
            if (aVar2 != null) {
                aVar2.n(jVar);
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar2 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f37154k = qVar2;
            qVar2.a(this);
            this.f37146c.i(this.f37154k);
            return;
        }
        if (t10 == com.airbnb.lottie.o.f37654e && (cVar5 = this.f37156m) != null) {
            cVar5.b(jVar);
            return;
        }
        if (t10 == com.airbnb.lottie.o.G && (cVar4 = this.f37156m) != null) {
            cVar4.f(jVar);
            return;
        }
        if (t10 == com.airbnb.lottie.o.H && (cVar3 = this.f37156m) != null) {
            cVar3.c(jVar);
            return;
        }
        if (t10 == com.airbnb.lottie.o.I && (cVar2 = this.f37156m) != null) {
            cVar2.e(jVar);
        } else {
            if (t10 != com.airbnb.lottie.o.J || (cVar = this.f37156m) == null) {
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
        return this.f37147d;
    }
}
