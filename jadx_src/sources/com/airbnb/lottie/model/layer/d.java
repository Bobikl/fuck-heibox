package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.j;

/* JADX INFO: compiled from: NullLayer.java */
/* JADX INFO: loaded from: classes6.dex */
public class d extends a {
    d(j jVar, Layer layer) {
        super(jVar, layer);
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.animation.content.e
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        super.a(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // com.airbnb.lottie.model.layer.a
    void t(Canvas canvas, Matrix matrix, int i10) {
    }
}
