package com.airbnb.lottie.model.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.airbnb.lottie.animation.keyframe.q;
import com.airbnb.lottie.j;
import com.airbnb.lottie.o;

/* JADX INFO: compiled from: ImageLayer.java */
/* JADX INFO: loaded from: classes6.dex */
public class c extends a {
    private final Paint F;
    private final Rect G;
    private final Rect H;

    @p0
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> I;

    @p0
    private com.airbnb.lottie.animation.keyframe.a<Bitmap, Bitmap> J;

    c(j jVar, Layer layer) {
        super(jVar, layer);
        this.F = new z3.a(3);
        this.G = new Rect();
        this.H = new Rect();
    }

    @p0
    private Bitmap N() {
        Bitmap bitmapH;
        com.airbnb.lottie.animation.keyframe.a<Bitmap, Bitmap> aVar = this.J;
        return (aVar == null || (bitmapH = aVar.h()) == null) ? this.f37626n.B(this.f37627o.m()) : bitmapH;
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.animation.content.e
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        super.a(rectF, matrix, z10);
        Bitmap bitmapN = N();
        if (bitmapN != null) {
            rectF.set(0.0f, 0.0f, bitmapN.getWidth() * com.airbnb.lottie.utils.j.e(), bitmapN.getHeight() * com.airbnb.lottie.utils.j.e());
            this.f37625m.mapRect(rectF);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.model.e
    public <T> void f(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        super.f(t10, jVar);
        if (t10 == o.K) {
            if (jVar == null) {
                this.I = null;
                return;
            } else {
                this.I = new q(jVar);
                return;
            }
        }
        if (t10 == o.N) {
            if (jVar == null) {
                this.J = null;
            } else {
                this.J = new q(jVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void t(@n0 Canvas canvas, Matrix matrix, int i10) {
        Bitmap bitmapN = N();
        if (bitmapN == null || bitmapN.isRecycled()) {
            return;
        }
        float fE = com.airbnb.lottie.utils.j.e();
        this.F.setAlpha(i10);
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.I;
        if (aVar != null) {
            this.F.setColorFilter(aVar.h());
        }
        canvas.save();
        canvas.concat(matrix);
        this.G.set(0, 0, bitmapN.getWidth(), bitmapN.getHeight());
        this.H.set(0, 0, (int) (bitmapN.getWidth() * fE), (int) (bitmapN.getHeight() * fE));
        canvas.drawBitmap(bitmapN, this.G, this.H, this.F);
        canvas.restore();
    }
}
