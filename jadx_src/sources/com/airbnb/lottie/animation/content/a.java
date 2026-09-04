package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import androidx.annotation.p0;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: BaseStrokeContent.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a implements com.airbnb.lottie.animation.keyframe.a.b, k, e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.j f37108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final com.airbnb.lottie.model.layer.a f37109f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f37111h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Paint f37112i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f37113j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Integer> f37114k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<com.airbnb.lottie.animation.keyframe.a<?, Float>> f37115l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f37116m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> f37117n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> f37118o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f37119p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.animation.keyframe.c f37120q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PathMeasure f37104a = new PathMeasure();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f37105b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Path f37106c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RectF f37107d = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<b> f37110g = new ArrayList();

    /* JADX INFO: compiled from: BaseStrokeContent.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<n> f37121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private final t f37122b;

        private b(@p0 t tVar) {
            this.f37121a = new ArrayList();
            this.f37122b = tVar;
        }
    }

    a(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.a aVar, Paint.Cap cap, Paint.Join join, float f10, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.b bVar, List<com.airbnb.lottie.model.animatable.b> list, com.airbnb.lottie.model.animatable.b bVar2) {
        z3.a aVar2 = new z3.a(1);
        this.f37112i = aVar2;
        this.f37119p = 0.0f;
        this.f37108e = jVar;
        this.f37109f = aVar;
        aVar2.setStyle(Paint.Style.STROKE);
        aVar2.setStrokeCap(cap);
        aVar2.setStrokeJoin(join);
        aVar2.setStrokeMiter(f10);
        this.f37114k = dVar.q();
        this.f37113j = bVar.q();
        if (bVar2 == null) {
            this.f37116m = null;
        } else {
            this.f37116m = bVar2.q();
        }
        this.f37115l = new ArrayList(list.size());
        this.f37111h = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f37115l.add(list.get(i10).q());
        }
        aVar.i(this.f37114k);
        aVar.i(this.f37113j);
        for (int i11 = 0; i11 < this.f37115l.size(); i11++) {
            aVar.i(this.f37115l.get(i11));
        }
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar3 = this.f37116m;
        if (aVar3 != null) {
            aVar.i(aVar3);
        }
        this.f37114k.a(this);
        this.f37113j.a(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.f37115l.get(i12).a(this);
        }
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar4 = this.f37116m;
        if (aVar4 != null) {
            aVar4.a(this);
        }
        if (aVar.v() != null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarQ = aVar.v().a().q();
            this.f37118o = aVarQ;
            aVarQ.a(this);
            aVar.i(this.f37118o);
        }
        if (aVar.x() != null) {
            this.f37120q = new com.airbnb.lottie.animation.keyframe.c(this, aVar, aVar.x());
        }
    }

    private void b(Matrix matrix) {
        com.airbnb.lottie.e.a("StrokeContent#applyDashPattern");
        if (this.f37115l.isEmpty()) {
            com.airbnb.lottie.e.b("StrokeContent#applyDashPattern");
            return;
        }
        float fG = com.airbnb.lottie.utils.j.g(matrix);
        for (int i10 = 0; i10 < this.f37115l.size(); i10++) {
            this.f37111h[i10] = this.f37115l.get(i10).h().floatValue();
            if (i10 % 2 == 0) {
                float[] fArr = this.f37111h;
                if (fArr[i10] < 1.0f) {
                    fArr[i10] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f37111h;
                if (fArr2[i10] < 0.1f) {
                    fArr2[i10] = 0.1f;
                }
            }
            float[] fArr3 = this.f37111h;
            fArr3[i10] = fArr3[i10] * fG;
        }
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar = this.f37116m;
        this.f37112i.setPathEffect(new DashPathEffect(this.f37111h, aVar == null ? 0.0f : fG * aVar.h().floatValue()));
        com.airbnb.lottie.e.b("StrokeContent#applyDashPattern");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00f6  */
    private void h(Canvas canvas, b bVar, Matrix matrix) {
        float f10;
        com.airbnb.lottie.e.a("StrokeContent#applyTrimPath");
        if (bVar.f37122b == null) {
            com.airbnb.lottie.e.b("StrokeContent#applyTrimPath");
            return;
        }
        this.f37105b.reset();
        for (int size = bVar.f37121a.size() - 1; size >= 0; size--) {
            this.f37105b.addPath(((n) bVar.f37121a.get(size)).getPath(), matrix);
        }
        this.f37104a.setPath(this.f37105b, false);
        float length = this.f37104a.getLength();
        while (this.f37104a.nextContour()) {
            length += this.f37104a.getLength();
        }
        float fFloatValue = (bVar.f37122b.g().h().floatValue() * length) / 360.0f;
        float fFloatValue2 = ((bVar.f37122b.h().h().floatValue() * length) / 100.0f) + fFloatValue;
        float fFloatValue3 = ((bVar.f37122b.f().h().floatValue() * length) / 100.0f) + fFloatValue;
        float f11 = 0.0f;
        for (int size2 = bVar.f37121a.size() - 1; size2 >= 0; size2--) {
            this.f37106c.set(((n) bVar.f37121a.get(size2)).getPath());
            this.f37106c.transform(matrix);
            this.f37104a.setPath(this.f37106c, false);
            float length2 = this.f37104a.getLength();
            if (fFloatValue3 > length) {
                float f12 = fFloatValue3 - length;
                if (f12 >= f11 + length2 || f11 >= f12) {
                    f10 = f11 + length2;
                    if (f10 < fFloatValue2 && f11 <= fFloatValue3) {
                        if (f10 > fFloatValue3 || fFloatValue2 >= f11) {
                            com.airbnb.lottie.utils.j.a(this.f37106c, fFloatValue2 < f11 ? 0.0f : (fFloatValue2 - f11) / length2, fFloatValue3 <= f10 ? (fFloatValue3 - f11) / length2 : 1.0f, 0.0f);
                            canvas.drawPath(this.f37106c, this.f37112i);
                        } else {
                            canvas.drawPath(this.f37106c, this.f37112i);
                        }
                    }
                } else {
                    com.airbnb.lottie.utils.j.a(this.f37106c, fFloatValue2 > length ? (fFloatValue2 - length) / length2 : 0.0f, Math.min(f12 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f37106c, this.f37112i);
                }
            } else {
                f10 = f11 + length2;
                if (f10 < fFloatValue2) {
                }
            }
            f11 += length2;
        }
        com.airbnb.lottie.e.b("StrokeContent#applyTrimPath");
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        com.airbnb.lottie.e.a("StrokeContent#getBounds");
        this.f37105b.reset();
        for (int i10 = 0; i10 < this.f37110g.size(); i10++) {
            b bVar = this.f37110g.get(i10);
            for (int i11 = 0; i11 < bVar.f37121a.size(); i11++) {
                this.f37105b.addPath(((n) bVar.f37121a.get(i11)).getPath(), matrix);
            }
        }
        this.f37105b.computeBounds(this.f37107d, false);
        float fP = ((com.airbnb.lottie.animation.keyframe.d) this.f37113j).p();
        RectF rectF2 = this.f37107d;
        float f10 = fP / 2.0f;
        rectF2.set(rectF2.left - f10, rectF2.top - f10, rectF2.right + f10, rectF2.bottom + f10);
        rectF.set(this.f37107d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.airbnb.lottie.e.b("StrokeContent#getBounds");
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void c(Canvas canvas, Matrix matrix, int i10) {
        com.airbnb.lottie.e.a("StrokeContent#draw");
        if (com.airbnb.lottie.utils.j.h(matrix)) {
            com.airbnb.lottie.e.b("StrokeContent#draw");
            return;
        }
        this.f37112i.setAlpha(com.airbnb.lottie.utils.i.d((int) ((((i10 / 255.0f) * ((com.airbnb.lottie.animation.keyframe.f) this.f37114k).p()) / 100.0f) * 255.0f), 0, 255));
        this.f37112i.setStrokeWidth(((com.airbnb.lottie.animation.keyframe.d) this.f37113j).p() * com.airbnb.lottie.utils.j.g(matrix));
        if (this.f37112i.getStrokeWidth() <= 0.0f) {
            com.airbnb.lottie.e.b("StrokeContent#draw");
            return;
        }
        b(matrix);
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f37117n;
        if (aVar != null) {
            this.f37112i.setColorFilter(aVar.h());
        }
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f37118o;
        if (aVar2 != null) {
            float fFloatValue = aVar2.h().floatValue();
            if (fFloatValue == 0.0f) {
                this.f37112i.setMaskFilter(null);
            } else if (fFloatValue != this.f37119p) {
                this.f37112i.setMaskFilter(this.f37109f.w(fFloatValue));
            }
            this.f37119p = fFloatValue;
        }
        com.airbnb.lottie.animation.keyframe.c cVar = this.f37120q;
        if (cVar != null) {
            cVar.a(this.f37112i);
        }
        for (int i11 = 0; i11 < this.f37110g.size(); i11++) {
            b bVar = this.f37110g.get(i11);
            if (bVar.f37122b != null) {
                h(canvas, bVar, matrix);
            } else {
                com.airbnb.lottie.e.a("StrokeContent#buildPath");
                this.f37105b.reset();
                for (int size = bVar.f37121a.size() - 1; size >= 0; size--) {
                    this.f37105b.addPath(((n) bVar.f37121a.get(size)).getPath(), matrix);
                }
                com.airbnb.lottie.e.b("StrokeContent#buildPath");
                com.airbnb.lottie.e.a("StrokeContent#drawPath");
                canvas.drawPath(this.f37105b, this.f37112i);
                com.airbnb.lottie.e.b("StrokeContent#drawPath");
            }
        }
        com.airbnb.lottie.e.b("StrokeContent#draw");
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void d() {
        this.f37108e.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069 A[SYNTHETIC] */
    @Override // com.airbnb.lottie.animation.content.c
    public void e(List<c> list, List<c> list2) {
        t tVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof t) {
                t tVar2 = (t) cVar;
                if (tVar2.i() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    tVar = tVar2;
                }
            }
        }
        if (tVar != null) {
            tVar.b(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            c cVar2 = list2.get(size2);
            if (cVar2 instanceof t) {
                t tVar3 = (t) cVar2;
                if (tVar3.i() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f37110g.add(bVar);
                    }
                    bVar = new b(tVar3);
                    tVar3.b(this);
                } else if (!(cVar2 instanceof n)) {
                    if (bVar == null) {
                        bVar = new b(tVar);
                    }
                    bVar.f37121a.add((n) cVar2);
                }
            } else if (!(cVar2 instanceof n)) {
                if (bVar == null) {
                    bVar = new b(tVar);
                }
                bVar.f37121a.add((n) cVar2);
            }
        }
        if (bVar != null) {
            this.f37110g.add(bVar);
        }
    }

    @Override // com.airbnb.lottie.model.e
    @androidx.annotation.i
    public <T> void f(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.animation.keyframe.c cVar;
        com.airbnb.lottie.animation.keyframe.c cVar2;
        com.airbnb.lottie.animation.keyframe.c cVar3;
        com.airbnb.lottie.animation.keyframe.c cVar4;
        com.airbnb.lottie.animation.keyframe.c cVar5;
        if (t10 == com.airbnb.lottie.o.f37653d) {
            this.f37114k.n(jVar);
            return;
        }
        if (t10 == com.airbnb.lottie.o.f37668s) {
            this.f37113j.n(jVar);
            return;
        }
        if (t10 == com.airbnb.lottie.o.K) {
            com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f37117n;
            if (aVar != null) {
                this.f37109f.F(aVar);
            }
            if (jVar == null) {
                this.f37117n = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f37117n = qVar;
            qVar.a(this);
            this.f37109f.i(this.f37117n);
            return;
        }
        if (t10 == com.airbnb.lottie.o.f37659j) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f37118o;
            if (aVar2 != null) {
                aVar2.n(jVar);
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar2 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f37118o = qVar2;
            qVar2.a(this);
            this.f37109f.i(this.f37118o);
            return;
        }
        if (t10 == com.airbnb.lottie.o.f37654e && (cVar5 = this.f37120q) != null) {
            cVar5.b(jVar);
            return;
        }
        if (t10 == com.airbnb.lottie.o.G && (cVar4 = this.f37120q) != null) {
            cVar4.f(jVar);
            return;
        }
        if (t10 == com.airbnb.lottie.o.H && (cVar3 = this.f37120q) != null) {
            cVar3.c(jVar);
            return;
        }
        if (t10 == com.airbnb.lottie.o.I && (cVar2 = this.f37120q) != null) {
            cVar2.e(jVar);
        } else {
            if (t10 != com.airbnb.lottie.o.J || (cVar = this.f37120q) == null) {
                return;
            }
            cVar.g(jVar);
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void g(com.airbnb.lottie.model.d dVar, int i10, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        com.airbnb.lottie.utils.i.m(dVar, i10, list, dVar2, this);
    }
}
