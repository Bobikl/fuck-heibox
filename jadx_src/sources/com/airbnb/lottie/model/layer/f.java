package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.p0;
import com.airbnb.lottie.animation.keyframe.q;
import com.airbnb.lottie.j;
import com.airbnb.lottie.o;

/* JADX INFO: compiled from: SolidLayer.java */
/* JADX INFO: loaded from: classes6.dex */
public class f extends a {
    private final RectF F;
    private final Paint G;
    private final float[] H;
    private final Path I;
    private final Layer J;

    @p0
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> K;

    f(j jVar, Layer layer) {
        super(jVar, layer);
        this.F = new RectF();
        z3.a aVar = new z3.a();
        this.G = aVar;
        this.H = new float[8];
        this.I = new Path();
        this.J = layer;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(layer.o());
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.animation.content.e
    public void a(RectF rectF, Matrix matrix, boolean z10) {
        super.a(rectF, matrix, z10);
        this.F.set(0.0f, 0.0f, this.J.q(), this.J.p());
        this.f37625m.mapRect(this.F);
        rectF.set(this.F);
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.model.e
    public <T> void f(T t10, @p0 com.airbnb.lottie.value.j<T> jVar) {
        super.f(t10, jVar);
        if (t10 == o.K) {
            if (jVar == null) {
                this.K = null;
            } else {
                this.K = new q(jVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void t(Canvas canvas, Matrix matrix, int i10) {
        int iAlpha = Color.alpha(this.J.o());
        if (iAlpha == 0) {
            return;
        }
        int iIntValue = (int) ((i10 / 255.0f) * (((iAlpha / 255.0f) * (this.f37634v.h() == null ? 100 : this.f37634v.h().h().intValue())) / 100.0f) * 255.0f);
        this.G.setAlpha(iIntValue);
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.K;
        if (aVar != null) {
            this.G.setColorFilter(aVar.h());
        }
        if (iIntValue > 0) {
            float[] fArr = this.H;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.J.q();
            float[] fArr2 = this.H;
            fArr2[3] = 0.0f;
            fArr2[4] = this.J.q();
            this.H[5] = this.J.p();
            float[] fArr3 = this.H;
            fArr3[6] = 0.0f;
            fArr3[7] = this.J.p();
            matrix.mapPoints(this.H);
            this.I.reset();
            Path path = this.I;
            float[] fArr4 = this.H;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.I;
            float[] fArr5 = this.H;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.I;
            float[] fArr6 = this.H;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.I;
            float[] fArr7 = this.H;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.I;
            float[] fArr8 = this.H;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.I.close();
            canvas.drawPath(this.I, this.G);
        }
    }
}
