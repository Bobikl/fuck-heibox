package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.airbnb.lottie.j;
import com.airbnb.lottie.model.content.k;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: ShapeLayer.java */
/* JADX INFO: loaded from: classes6.dex */
public class e extends a {
    private final com.airbnb.lottie.animation.content.d F;
    private final b G;

    e(j jVar, Layer layer, b bVar) {
        super(jVar, layer);
        this.G = bVar;
        com.airbnb.lottie.animation.content.d dVar = new com.airbnb.lottie.animation.content.d(jVar, this, new k("__container", layer.n(), false));
        this.F = dVar;
        dVar.e(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.airbnb.lottie.model.layer.a
    protected void G(com.airbnb.lottie.model.d dVar, int i10, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        this.F.g(dVar, i10, list, dVar2);
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.animation.content.e
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        super.a(rectF, matrix, z10);
        this.F.a(rectF, this.f37625m, z10);
    }

    @Override // com.airbnb.lottie.model.layer.a
    void t(@n0 Canvas canvas, Matrix matrix, int i10) {
        this.F.c(canvas, matrix, i10);
    }

    @Override // com.airbnb.lottie.model.layer.a
    @p0
    public com.airbnb.lottie.model.content.a v() {
        com.airbnb.lottie.model.content.a aVarV = super.v();
        return aVarV != null ? aVarV : this.G.v();
    }

    @Override // com.airbnb.lottie.model.layer.a
    @p0
    public com.airbnb.lottie.parser.j x() {
        com.airbnb.lottie.parser.j jVarX = super.x();
        return jVarX != null ? jVarX : this.G.x();
    }
}
