package com.google.android.material.transition;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: MaskEvaluator.java */
/* JADX INFO: loaded from: classes7.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f55917a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f55918b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Path f55919c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.material.shape.q f55920d = com.google.android.material.shape.q.k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.material.shape.p f55921e;

    j() {
    }

    void a(Canvas canvas) {
        canvas.clipPath(this.f55917a);
    }

    void b(float f10, com.google.android.material.shape.p pVar, com.google.android.material.shape.p pVar2, RectF rectF, RectF rectF2, RectF rectF3, l.e eVar) {
        com.google.android.material.shape.p pVarQ = v.q(pVar, pVar2, rectF, rectF3, eVar.d(), eVar.c(), f10);
        this.f55921e = pVarQ;
        this.f55920d.d(pVarQ, 1.0f, rectF2, this.f55918b);
        this.f55920d.d(this.f55921e, 1.0f, rectF3, this.f55919c);
        this.f55917a.op(this.f55918b, this.f55919c, Path.Op.UNION);
    }

    com.google.android.material.shape.p c() {
        return this.f55921e;
    }

    Path d() {
        return this.f55917a;
    }
}
