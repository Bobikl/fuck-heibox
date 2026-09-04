package com.google.android.material.shadow;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.graphics.f0;
import androidx.core.view.j1;

/* JADX INFO: compiled from: ShadowRenderer.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f55041i = 68;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f55042j = 20;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f55043k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f55044l = new int[3];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float[] f55045m = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f55046n = new int[4];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float[] f55047o = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final Paint f55048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final Paint f55049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    private final Paint f55050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f55051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f55052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f55053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Path f55054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f55055h;

    public b() {
        this(j1.f21601t);
    }

    public b(int i10) {
        this.f55054g = new Path();
        Paint paint = new Paint();
        this.f55055h = paint;
        this.f55048a = new Paint();
        e(i10);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f55049b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f55050c = new Paint(paint2);
    }

    public void a(@n0 Canvas canvas, @p0 Matrix matrix, @n0 RectF rectF, int i10, float f10, float f11) {
        boolean z10 = f11 < 0.0f;
        Path path = this.f55054g;
        if (z10) {
            int[] iArr = f55046n;
            iArr[0] = 0;
            iArr[1] = this.f55053f;
            iArr[2] = this.f55052e;
            iArr[3] = this.f55051d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f10, f11);
            path.close();
            float f12 = -i10;
            rectF.inset(f12, f12);
            int[] iArr2 = f55046n;
            iArr2[0] = 0;
            iArr2[1] = this.f55051d;
            iArr2[2] = this.f55052e;
            iArr2[3] = this.f55053f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f13 = 1.0f - (i10 / fWidth);
        float[] fArr = f55047o;
        fArr[1] = f13;
        fArr[2] = ((1.0f - f13) / 2.0f) + f13;
        this.f55049b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f55046n, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f55055h);
        }
        canvas.drawArc(rectF, f10, f11, true, this.f55049b);
        canvas.restore();
    }

    public void b(@n0 Canvas canvas, @p0 Matrix matrix, @n0 RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = f55044l;
        iArr[0] = this.f55053f;
        iArr[1] = this.f55052e;
        iArr[2] = this.f55051d;
        Paint paint = this.f55050c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f55045m, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f55050c);
        canvas.restore();
    }

    public void c(@n0 Canvas canvas, @p0 Matrix matrix, @n0 RectF rectF, int i10, float f10, float f11, @n0 float[] fArr) {
        if (f11 > 0.0f) {
            f10 += f11;
            f11 = -f11;
        }
        a(canvas, matrix, rectF, i10, f10, f11);
        Path path = this.f55054g;
        path.rewind();
        path.moveTo(fArr[0], fArr[1]);
        path.arcTo(rectF, f10, f11);
        path.close();
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        canvas.drawPath(path, this.f55055h);
        canvas.drawPath(path, this.f55048a);
        canvas.restore();
    }

    @n0
    public Paint d() {
        return this.f55048a;
    }

    public void e(int i10) {
        this.f55051d = f0.B(i10, 68);
        this.f55052e = f0.B(i10, 20);
        this.f55053f = f0.B(i10, 0);
        this.f55048a.setColor(this.f55051d);
    }
}
