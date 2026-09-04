package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import androidx.core.view.j1;

/* JADX INFO: compiled from: SubtitlePainter.java */
/* JADX INFO: loaded from: classes7.dex */
public final class q0 {
    private static final String K = "SubtitlePainter";
    private static final float L = 0.125f;
    private int A;
    private int B;
    private int C;
    private int D;
    private StaticLayout E;
    private StaticLayout F;
    private int G;
    private int H;
    private int I;
    private Rect J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f50793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f50794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f50795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f50796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f50797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TextPaint f50798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f50799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f50800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private CharSequence f50801i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private Layout.Alignment f50802j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private Bitmap f50803k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f50804l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f50805m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f50806n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f50807o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f50808p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f50809q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f50810r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f50811s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f50812t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f50813u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f50814v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f50815w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f50816x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f50817y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f50818z;

    public q0(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{android.R.attr.lineSpacingExtra, android.R.attr.lineSpacingMultiplier}, 0, 0);
        this.f50797e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f50796d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f50793a = fRound;
        this.f50794b = fRound;
        this.f50795c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f50798f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f50799g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f50800h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    private static boolean a(@androidx.annotation.p0 CharSequence charSequence, @androidx.annotation.p0 CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    @mk.m({"cueBitmap", "bitmapRect"})
    private void c(Canvas canvas) {
        canvas.drawBitmap(this.f50803k, (Rect) null, this.J, this.f50800h);
    }

    private void d(Canvas canvas, boolean z10) {
        if (z10) {
            e(canvas);
            return;
        }
        com.google.android.exoplayer2.util.a.g(this.J);
        com.google.android.exoplayer2.util.a.g(this.f50803k);
        c(canvas);
    }

    private void e(Canvas canvas) {
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.f50813u) > 0) {
            this.f50799g.setColor(this.f50813u);
            canvas.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), this.f50799g);
        }
        int i10 = this.f50815w;
        if (i10 == 1) {
            this.f50798f.setStrokeJoin(Paint.Join.ROUND);
            this.f50798f.setStrokeWidth(this.f50793a);
            this.f50798f.setColor(this.f50814v);
            this.f50798f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i10 == 2) {
            TextPaint textPaint = this.f50798f;
            float f10 = this.f50794b;
            float f11 = this.f50795c;
            textPaint.setShadowLayer(f10, f11, f11, this.f50814v);
        } else if (i10 == 3 || i10 == 4) {
            boolean z10 = i10 == 3;
            int i11 = z10 ? -1 : this.f50814v;
            int i12 = z10 ? this.f50814v : -1;
            float f12 = this.f50794b / 2.0f;
            this.f50798f.setColor(this.f50811s);
            this.f50798f.setStyle(Paint.Style.FILL);
            float f13 = -f12;
            this.f50798f.setShadowLayer(this.f50794b, f13, f13, i11);
            staticLayout2.draw(canvas);
            this.f50798f.setShadowLayer(this.f50794b, f12, f12, i12);
        }
        this.f50798f.setColor(this.f50811s);
        this.f50798f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f50798f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(iSave);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056  */
    /* JADX WARN: Code duplicated, block: B:16:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    @mk.m({"cueBitmap"})
    private void f() {
        float f10;
        int i10;
        float f11;
        Bitmap bitmap = this.f50803k;
        int i11 = this.C;
        int i12 = this.A;
        int i13 = this.D;
        int i14 = this.B;
        float f12 = i11 - i12;
        float f13 = i12 + (this.f50807o * f12);
        float f14 = i13 - i14;
        float f15 = i14 + (this.f50804l * f14);
        int iRound = Math.round(f12 * this.f50809q);
        float f16 = this.f50810r;
        int iRound2 = f16 != -3.4028235E38f ? Math.round(f14 * f16) : Math.round(iRound * (bitmap.getHeight() / bitmap.getWidth()));
        int i15 = this.f50808p;
        if (i15 != 2) {
            if (i15 == 1) {
                f10 = iRound / 2;
            }
            int iRound3 = Math.round(f13);
            i10 = this.f50806n;
            if (i10 == 2) {
                if (i10 == 1) {
                    f11 = iRound2 / 2;
                }
                int iRound4 = Math.round(f15);
                this.J = new Rect(iRound3, iRound4, iRound + iRound3, iRound2 + iRound4);
            }
            f11 = iRound2;
            f15 -= f11;
            int iRound5 = Math.round(f15);
            this.J = new Rect(iRound3, iRound5, iRound + iRound3, iRound2 + iRound5);
        }
        f10 = iRound;
        f13 -= f10;
        int iRound6 = Math.round(f13);
        i10 = this.f50806n;
        if (i10 == 2) {
            if (i10 == 1) {
                f11 = iRound2 / 2;
            }
            int iRound7 = Math.round(f15);
            this.J = new Rect(iRound6, iRound7, iRound + iRound6, iRound2 + iRound7);
        }
        f11 = iRound2;
        f15 -= f11;
        int iRound8 = Math.round(f15);
        this.J = new Rect(iRound6, iRound8, iRound + iRound6, iRound2 + iRound8);
    }

    @mk.m({"cueText"})
    private void g() {
        int i10;
        int i11;
        int iMax;
        int iMin;
        int iRound;
        int i12;
        CharSequence charSequence = this.f50801i;
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(this.f50801i);
        int i13 = this.C - this.A;
        int i14 = this.D - this.B;
        this.f50798f.setTextSize(this.f50816x);
        int i15 = (int) ((this.f50816x * L) + 0.5f);
        int i16 = i15 * 2;
        int i17 = i13 - i16;
        float f10 = this.f50809q;
        if (f10 != -3.4028235E38f) {
            i17 = (int) (i17 * f10);
        }
        int i18 = i17;
        if (i18 <= 0) {
            com.google.android.exoplayer2.util.u.m(K, "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        if (this.f50817y > 0.0f) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) this.f50817y), 0, spannableStringBuilder.length(), 16711680);
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        if (this.f50815w == 1) {
            for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ForegroundColorSpan.class)) {
                spannableStringBuilder2.removeSpan(foregroundColorSpan);
            }
        }
        if (Color.alpha(this.f50812t) > 0) {
            int i19 = this.f50815w;
            if (i19 == 0 || i19 == 2) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f50812t), 0, spannableStringBuilder.length(), 16711680);
            } else {
                spannableStringBuilder2.setSpan(new BackgroundColorSpan(this.f50812t), 0, spannableStringBuilder2.length(), 16711680);
            }
        }
        Layout.Alignment alignment = this.f50802j;
        if (alignment == null) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, this.f50798f, i18, alignment2, this.f50796d, this.f50797e, true);
        this.E = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.E.getLineCount();
        int iMax2 = 0;
        for (int i20 = 0; i20 < lineCount; i20++) {
            iMax2 = Math.max((int) Math.ceil(this.E.getLineWidth(i20)), iMax2);
        }
        if (this.f50809q == -3.4028235E38f || iMax2 >= i18) {
            i18 = iMax2;
        }
        int i21 = i18 + i16;
        float f11 = this.f50807o;
        if (f11 != -3.4028235E38f) {
            int iRound2 = Math.round(i13 * f11);
            int i22 = this.A;
            int i23 = iRound2 + i22;
            int i24 = this.f50808p;
            i10 = 1;
            if (i24 != 1) {
                i11 = 2;
                if (i24 == 2) {
                    i23 -= i21;
                }
            } else {
                i11 = 2;
                i23 = ((i23 * 2) - i21) / 2;
            }
            iMax = Math.max(i23, i22);
            iMin = Math.min(i21 + iMax, this.C);
        } else {
            i10 = 1;
            i11 = 2;
            iMax = ((i13 - i21) / 2) + this.A;
            iMin = iMax + i21;
        }
        int i25 = iMin - iMax;
        if (i25 <= 0) {
            com.google.android.exoplayer2.util.u.m(K, "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f12 = this.f50804l;
        if (f12 != -3.4028235E38f) {
            if (this.f50805m == 0) {
                iRound = Math.round(i14 * f12) + this.B;
                int i26 = this.f50806n;
                if (i26 == i11) {
                    iRound -= height;
                } else if (i26 == i10) {
                    iRound = ((iRound * 2) - height) / i11;
                }
            } else {
                int lineBottom = this.E.getLineBottom(0) - this.E.getLineTop(0);
                float f13 = this.f50804l;
                if (f13 >= 0.0f) {
                    iRound = Math.round(f13 * lineBottom) + this.B;
                } else {
                    iRound = Math.round((f13 + 1.0f) * lineBottom) + this.D;
                    iRound -= height;
                }
            }
            int i27 = iRound + height;
            int i28 = this.D;
            if (i27 <= i28) {
                int i29 = this.B;
                if (iRound < i29) {
                    i12 = i29;
                }
                this.E = new StaticLayout(spannableStringBuilder, this.f50798f, i25, alignment2, this.f50796d, this.f50797e, true);
                this.F = new StaticLayout(spannableStringBuilder2, this.f50798f, i25, alignment2, this.f50796d, this.f50797e, true);
                this.G = iMax;
                this.H = i12;
                this.I = i15;
            }
            iRound = i28 - height;
        } else {
            iRound = (this.D - height) - ((int) (i14 * this.f50818z));
        }
        i12 = iRound;
        this.E = new StaticLayout(spannableStringBuilder, this.f50798f, i25, alignment2, this.f50796d, this.f50797e, true);
        this.F = new StaticLayout(spannableStringBuilder2, this.f50798f, i25, alignment2, this.f50796d, this.f50797e, true);
        this.G = iMax;
        this.H = i12;
        this.I = i15;
    }

    public void b(com.google.android.exoplayer2.text.b bVar, e eVar, float f10, float f11, float f12, Canvas canvas, int i10, int i11, int i12, int i13) {
        boolean z10 = bVar.f49376e == null;
        int i14 = j1.f21601t;
        if (z10) {
            if (TextUtils.isEmpty(bVar.f49373b)) {
                return;
            } else {
                i14 = bVar.f49384m ? bVar.f49385n : eVar.f50720c;
            }
        }
        if (a(this.f50801i, bVar.f49373b) && com.google.android.exoplayer2.util.u0.c(this.f50802j, bVar.f49374c) && this.f50803k == bVar.f49376e && this.f50804l == bVar.f49377f && this.f50805m == bVar.f49378g && com.google.android.exoplayer2.util.u0.c(Integer.valueOf(this.f50806n), Integer.valueOf(bVar.f49379h)) && this.f50807o == bVar.f49380i && com.google.android.exoplayer2.util.u0.c(Integer.valueOf(this.f50808p), Integer.valueOf(bVar.f49381j)) && this.f50809q == bVar.f49382k && this.f50810r == bVar.f49383l && this.f50811s == eVar.f50718a && this.f50812t == eVar.f50719b && this.f50813u == i14 && this.f50815w == eVar.f50721d && this.f50814v == eVar.f50722e && com.google.android.exoplayer2.util.u0.c(this.f50798f.getTypeface(), eVar.f50723f) && this.f50816x == f10 && this.f50817y == f11 && this.f50818z == f12 && this.A == i10 && this.B == i11 && this.C == i12 && this.D == i13) {
            d(canvas, z10);
            return;
        }
        this.f50801i = bVar.f49373b;
        this.f50802j = bVar.f49374c;
        this.f50803k = bVar.f49376e;
        this.f50804l = bVar.f49377f;
        this.f50805m = bVar.f49378g;
        this.f50806n = bVar.f49379h;
        this.f50807o = bVar.f49380i;
        this.f50808p = bVar.f49381j;
        this.f50809q = bVar.f49382k;
        this.f50810r = bVar.f49383l;
        this.f50811s = eVar.f50718a;
        this.f50812t = eVar.f50719b;
        this.f50813u = i14;
        this.f50815w = eVar.f50721d;
        this.f50814v = eVar.f50722e;
        this.f50798f.setTypeface(eVar.f50723f);
        this.f50816x = f10;
        this.f50817y = f11;
        this.f50818z = f12;
        this.A = i10;
        this.B = i11;
        this.C = i12;
        this.D = i13;
        if (z10) {
            com.google.android.exoplayer2.util.a.g(this.f50801i);
            g();
        } else {
            com.google.android.exoplayer2.util.a.g(this.f50803k);
            f();
        }
        d(canvas, z10);
    }
}
