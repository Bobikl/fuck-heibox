package com.google.android.material.transition.platform;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.w0;

/* JADX INFO: compiled from: MaskEvaluator.java */
/* JADX INFO: loaded from: classes7.dex */
@w0(21)
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f56029a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f56030b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Path f56031c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.material.shape.q f56032d = com.google.android.material.shape.q.k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.material.shape.p f56033e;

    j() {
    }

    void a(Canvas canvas) {
        canvas.clipPath(this.f56029a);
    }

    void b(float f10, com.google.android.material.shape.p pVar, com.google.android.material.shape.p pVar2, RectF rectF, RectF rectF2, RectF rectF3, l.e eVar) {
        com.google.android.material.shape.p pVarQ = w.q(pVar, pVar2, rectF, rectF3, eVar.d(), eVar.c(), f10);
        this.f56033e = pVarQ;
        this.f56032d.d(pVarQ, 1.0f, rectF2, this.f56030b);
        this.f56032d.d(this.f56033e, 1.0f, rectF3, this.f56031c);
        this.f56029a.op(this.f56030b, this.f56031c, Path.Op.UNION);
    }

    com.google.android.material.shape.p c() {
        return this.f56033e;
    }

    Path d() {
        return this.f56029a;
    }
}
