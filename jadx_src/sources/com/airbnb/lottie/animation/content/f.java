package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.p0;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.List;

/* JADX INFO: compiled from: EllipseContent.java */
/* JADX INFO: loaded from: classes6.dex */
public class f implements n, com.airbnb.lottie.animation.keyframe.a.b, k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f37135i = 0.55228f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f37137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.j f37138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> f37139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> f37140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.content.b f37141f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f37143h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f37136a = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f37142g = new b();

    public f(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.b bVar) {
        this.f37137b = bVar.b();
        this.f37138c = jVar;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> aVarQ = bVar.d().q();
        this.f37139d = aVarQ;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> aVarQ2 = bVar.c().q();
        this.f37140e = aVarQ2;
        this.f37141f = bVar;
        aVar.i(aVarQ);
        aVar.i(aVarQ2);
        aVarQ.a(this);
        aVarQ2.a(this);
    }

    private void b() {
        this.f37143h = false;
        this.f37138c.invalidateSelf();
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
                    this.f37142g.a(tVar);
                    tVar.b(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void f(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        if (t10 == com.airbnb.lottie.o.f37660k) {
            this.f37139d.n(jVar);
        } else if (t10 == com.airbnb.lottie.o.f37663n) {
            this.f37140e.n(jVar);
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void g(com.airbnb.lottie.model.d dVar, int i10, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        com.airbnb.lottie.utils.i.m(dVar, i10, list, dVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f37137b;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path getPath() {
        if (this.f37143h) {
            return this.f37136a;
        }
        this.f37136a.reset();
        if (this.f37141f.e()) {
            this.f37143h = true;
            return this.f37136a;
        }
        PointF pointFH = this.f37139d.h();
        float f10 = pointFH.x / 2.0f;
        float f11 = pointFH.y / 2.0f;
        float f12 = f10 * f37135i;
        float f13 = f37135i * f11;
        this.f37136a.reset();
        if (this.f37141f.f()) {
            float f14 = -f11;
            this.f37136a.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            this.f37136a.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            this.f37136a.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f19 = f12 + 0.0f;
            this.f37136a.cubicTo(f19, f11, f10, f18, f10, 0.0f);
            this.f37136a.cubicTo(f10, f17, f19, f14, 0.0f, f14);
        } else {
            float f20 = -f11;
            this.f37136a.moveTo(0.0f, f20);
            float f21 = f12 + 0.0f;
            float f22 = 0.0f - f13;
            this.f37136a.cubicTo(f21, f20, f10, f22, f10, 0.0f);
            float f23 = f13 + 0.0f;
            this.f37136a.cubicTo(f10, f23, f21, f11, 0.0f, f11);
            float f24 = 0.0f - f12;
            float f25 = -f10;
            this.f37136a.cubicTo(f24, f11, f25, f23, f25, 0.0f);
            this.f37136a.cubicTo(f25, f22, f24, f20, 0.0f, f20);
        }
        PointF pointFH2 = this.f37140e.h();
        this.f37136a.offset(pointFH2.x, pointFH2.y);
        this.f37136a.close();
        this.f37142g.b(this.f37136a);
        this.f37143h = true;
        return this.f37136a;
    }
}
