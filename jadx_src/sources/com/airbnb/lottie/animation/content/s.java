package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import androidx.annotation.p0;
import com.airbnb.lottie.model.content.ShapeStroke;

/* JADX INFO: compiled from: StrokeContent.java */
/* JADX INFO: loaded from: classes6.dex */
public class s extends a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.airbnb.lottie.model.layer.a f37239r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f37240s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f37241t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f37242u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @p0
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> f37243v;

    public s(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.a aVar, ShapeStroke shapeStroke) {
        super(jVar, aVar, shapeStroke.b().toPaintCap(), shapeStroke.e().toPaintJoin(), shapeStroke.g(), shapeStroke.i(), shapeStroke.j(), shapeStroke.f(), shapeStroke.d());
        this.f37239r = aVar;
        this.f37240s = shapeStroke.h();
        this.f37241t = shapeStroke.k();
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVarQ = shapeStroke.c().q();
        this.f37242u = aVarQ;
        aVarQ.a(this);
        aVar.i(aVarQ);
    }

    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.animation.content.e
    public void c(Canvas canvas, Matrix matrix, int i10) {
        if (this.f37241t) {
            return;
        }
        this.f37112i.setColor(((com.airbnb.lottie.animation.keyframe.b) this.f37242u).p());
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f37243v;
        if (aVar != null) {
            this.f37112i.setColorFilter(aVar.h());
        }
        super.c(canvas, matrix, i10);
    }

    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.model.e
    public <T> void f(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        super.f(t10, jVar);
        if (t10 == com.airbnb.lottie.o.f37651b) {
            this.f37242u.n(jVar);
            return;
        }
        if (t10 == com.airbnb.lottie.o.K) {
            com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f37243v;
            if (aVar != null) {
                this.f37239r.F(aVar);
            }
            if (jVar == null) {
                this.f37243v = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f37243v = qVar;
            qVar.a(this);
            this.f37239r.i(this.f37242u);
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f37240s;
    }
}
