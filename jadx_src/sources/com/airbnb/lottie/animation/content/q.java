package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: RepeaterContent.java */
/* JADX INFO: loaded from: classes6.dex */
public class q implements e, n, j, com.airbnb.lottie.animation.keyframe.a.b, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Matrix f37222a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f37223b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.j f37224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.layer.a f37225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f37226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f37227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f37228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f37229h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.p f37230i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d f37231j;

    public q(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.content.h hVar) {
        this.f37224c = jVar;
        this.f37225d = aVar;
        this.f37226e = hVar.c();
        this.f37227f = hVar.f();
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarQ = hVar.b().q();
        this.f37228g = aVarQ;
        aVar.i(aVarQ);
        aVarQ.a(this);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVarQ2 = hVar.d().q();
        this.f37229h = aVarQ2;
        aVar.i(aVarQ2);
        aVarQ2.a(this);
        com.airbnb.lottie.animation.keyframe.p pVarB = hVar.e().b();
        this.f37230i = pVarB;
        pVarB.a(aVar);
        pVarB.b(this);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        this.f37231j.a(rectF, matrix, z10);
    }

    @Override // com.airbnb.lottie.animation.content.j
    public void b(ListIterator<c> listIterator) {
        if (this.f37231j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f37231j = new d(this.f37224c, this.f37225d, "Repeater", this.f37227f, arrayList, null);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void c(Canvas canvas, Matrix matrix, int i10) {
        float fFloatValue = this.f37228g.h().floatValue();
        float fFloatValue2 = this.f37229h.h().floatValue();
        float fFloatValue3 = this.f37230i.i().h().floatValue() / 100.0f;
        float fFloatValue4 = this.f37230i.e().h().floatValue() / 100.0f;
        for (int i11 = ((int) fFloatValue) - 1; i11 >= 0; i11--) {
            this.f37222a.set(matrix);
            float f10 = i11;
            this.f37222a.preConcat(this.f37230i.g(f10 + fFloatValue2));
            this.f37231j.c(canvas, this.f37222a, (int) (i10 * com.airbnb.lottie.utils.i.k(fFloatValue3, fFloatValue4, f10 / fFloatValue)));
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void d() {
        this.f37224c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void e(List<c> list, List<c> list2) {
        this.f37231j.e(list, list2);
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void f(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        if (this.f37230i.c(t10, jVar)) {
            return;
        }
        if (t10 == com.airbnb.lottie.o.f37670u) {
            this.f37228g.n(jVar);
        } else if (t10 == com.airbnb.lottie.o.f37671v) {
            this.f37229h.n(jVar);
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void g(com.airbnb.lottie.model.d dVar, int i10, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        com.airbnb.lottie.utils.i.m(dVar, i10, list, dVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f37226e;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path getPath() {
        Path path = this.f37231j.getPath();
        this.f37223b.reset();
        float fFloatValue = this.f37228g.h().floatValue();
        float fFloatValue2 = this.f37229h.h().floatValue();
        for (int i10 = ((int) fFloatValue) - 1; i10 >= 0; i10--) {
            this.f37222a.set(this.f37230i.g(i10 + fFloatValue2));
            this.f37223b.addPath(path, this.f37222a);
        }
        return this.f37223b;
    }
}
