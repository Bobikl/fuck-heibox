package com.billy.android.swipe.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.view.View;
import androidx.core.view.j1;

/* JADX INFO: loaded from: classes6.dex */
public class ScrimView extends View {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static float f40441l = 1.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static float f40442m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f40444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Rect f40445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f40446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f40447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f40448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Paint f40449h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Rect f40450i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f40451j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f40452k;

    public ScrimView(Context context) {
        super(context);
        this.f40443b = 60;
        this.f40445d = new Rect();
        this.f40450i = new Rect();
        this.f40451j = Integer.MIN_VALUE;
        Paint paint = new Paint();
        this.f40444c = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f40449h = paint2;
        paint2.setDither(true);
        this.f40449h.setAntiAlias(true);
    }

    public int getShadowColor() {
        return this.f40451j;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f40446e != 0) {
            canvas.drawRect(this.f40445d, this.f40444c);
        }
        if (this.f40443b <= 0 || this.f40451j == 0 || (this.f40448g & 15) <= 0) {
            return;
        }
        canvas.save();
        int i10 = this.f40452k;
        if (i10 == 2) {
            canvas.translate(this.f40445d.right - this.f40443b, 0.0f);
        } else if (i10 == 8) {
            canvas.translate(0.0f, this.f40445d.bottom - this.f40443b);
        }
        canvas.clipRect(this.f40450i);
        canvas.drawPaint(this.f40449h);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Rect rect = this.f40445d;
        rect.right = i10;
        rect.bottom = i11;
    }

    public void setDirection(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16;
        int i17;
        this.f40448g = i10;
        this.f40451j = i11;
        this.f40452k = i12;
        int i18 = i13;
        this.f40443b = i18;
        if (i11 == 0) {
            return;
        }
        int i19 = 0;
        boolean z10 = true;
        if (i12 == 1 || i12 == 2) {
            i16 = i15;
            i17 = i16;
        } else {
            if (i12 != 4 && i12 != 8) {
                return;
            }
            i16 = i18;
            i17 = 0;
            i18 = i14;
        }
        Rect rect = this.f40450i;
        rect.right = i18;
        rect.bottom = i16;
        int i20 = (i11 & j1.f21601t) >>> 24;
        float[] fArr = new float[31];
        int[] iArr = new int[31];
        boolean z11 = i12 == 1 || i12 == 4;
        for (int i21 = 0; i21 <= 30; i21++) {
            fArr[i21] = (i21 * 1.0f) / 30;
        }
        for (int i22 = 0; i22 <= 30; i22++) {
            float f10 = fArr[z11 ? 30 - i22 : i22];
            iArr[i22] = (((int) ((i20 * f10) * f10)) << 24) | (this.f40451j & 16777215);
        }
        if (i10 != 1 && i10 != 2) {
            z10 = false;
        }
        if (z10) {
            i16 >>= 1;
            i17 = i16;
        } else {
            i19 = i18 >> 1;
            i18 = i19;
        }
        this.f40449h.setShader(new LinearGradient(i19, i17, i18, i16, iArr, fArr, Shader.TileMode.CLAMP));
    }

    public void setProgress(float f10) {
        this.f40444c.setColor((((int) (this.f40447f * com.billy.android.swipe.b.e(f10, f40442m, f40441l))) << 24) | (this.f40446e & 16777215));
    }

    public void setScrimColor(int i10) {
        this.f40446e = i10;
        this.f40447f = (i10 & j1.f21601t) >>> 24;
    }
}
