package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.view.j1;

/* JADX INFO: compiled from: CollapsingTextHelper.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class b {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final String f54431v0 = "CollapsingTextHelper";

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final String f54432w0 = "…";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private static final float f54433x0 = 0.5f;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final boolean f54434y0 = false;
    private Typeface A;
    private Typeface B;
    private Typeface C;
    private com.google.android.material.resources.a D;
    private com.google.android.material.resources.a E;

    @p0
    private CharSequence G;

    @p0
    private CharSequence H;
    private boolean I;
    private boolean K;

    @p0
    private Bitmap L;
    private Paint M;
    private float N;
    private float O;
    private float P;
    private float Q;
    private float R;
    private int S;
    private int[] T;
    private boolean U;

    @n0
    private final TextPaint V;

    @n0
    private final TextPaint W;
    private TimeInterpolator X;
    private TimeInterpolator Y;
    private float Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f54436a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private float f54437a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f54438b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private float f54439b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f54440c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private ColorStateList f54441c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f54442d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private float f54443d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f54444e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private float f54445e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f54446f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private float f54447f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    private final Rect f54448g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private ColorStateList f54449g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    private final Rect f54450h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private float f54451h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    private final RectF f54452i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private float f54453i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private float f54455j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private StaticLayout f54457k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private float f54459l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private float f54461m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ColorStateList f54462n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private float f54463n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ColorStateList f54464o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private CharSequence f54465o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f54466p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f54468q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f54470r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f54472s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f54474t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @p0
    private y f54475t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f54476u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f54477v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Typeface f54478w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Typeface f54479x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Typeface f54480y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Typeface f54481z;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final boolean f54430u0 = false;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    @n0
    private static final Paint f54435z0 = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f54454j = 16;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f54456k = 16;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f54458l = 15.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f54460m = 15.0f;
    private TextUtils.TruncateAt F = TextUtils.TruncateAt.END;
    private boolean J = true;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f54467p0 = 1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private float f54469q0 = 0.0f;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private float f54471r0 = 1.0f;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f54473s0 = StaticLayoutBuilderCompat.f54389o;

    /* JADX INFO: compiled from: CollapsingTextHelper.java */
    public class a implements com.google.android.material.resources.a.InterfaceC0428a {
        a() {
        }

        @Override // com.google.android.material.resources.a.InterfaceC0428a
        public void a(Typeface typeface) {
            b.this.n0(typeface);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CollapsingTextHelper.java */
    public class C0426b implements com.google.android.material.resources.a.InterfaceC0428a {
        C0426b() {
        }

        @Override // com.google.android.material.resources.a.InterfaceC0428a
        public void a(Typeface typeface) {
            b.this.y0(typeface);
        }
    }

    public b(View view) {
        this.f54436a = view;
        TextPaint textPaint = new TextPaint(129);
        this.V = textPaint;
        this.W = new TextPaint(textPaint);
        this.f54450h = new Rect();
        this.f54448g = new Rect();
        this.f54452i = new RectF();
        this.f54444e = e();
        a0(view.getContext().getResources().getConfiguration());
    }

    private void E0(float f10) {
        h(f10);
        boolean z10 = f54430u0 && this.N != 1.0f;
        this.K = z10;
        if (z10) {
            n();
        }
        j1.n1(this.f54436a);
    }

    private Layout.Alignment N() {
        int iD = androidx.core.view.n.d(this.f54454j, this.I ? 1 : 0) & 7;
        if (iD == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (iD != 5) {
            return this.I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return this.I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
    }

    private void Q(@n0 TextPaint textPaint) {
        textPaint.setTextSize(this.f54460m);
        textPaint.setTypeface(this.f54478w);
        textPaint.setLetterSpacing(this.f54451h0);
    }

    private boolean Q0() {
        return this.f54467p0 > 1 && (!this.I || this.f54440c) && !this.K;
    }

    private void R(@n0 TextPaint textPaint) {
        textPaint.setTextSize(this.f54458l);
        textPaint.setTypeface(this.f54481z);
        textPaint.setLetterSpacing(this.f54453i0);
    }

    private void T(float f10) {
        if (this.f54440c) {
            this.f54452i.set(f10 < this.f54444e ? this.f54448g : this.f54450h);
            return;
        }
        this.f54452i.left = Z(this.f54448g.left, this.f54450h.left, f10, this.X);
        this.f54452i.top = Z(this.f54468q, this.f54470r, f10, this.X);
        this.f54452i.right = Z(this.f54448g.right, this.f54450h.right, f10, this.X);
        this.f54452i.bottom = Z(this.f54448g.bottom, this.f54450h.bottom, f10, this.X);
    }

    private static boolean U(float f10, float f11) {
        return Math.abs(f10 - f11) < 1.0E-5f;
    }

    private boolean V() {
        return j1.Z(this.f54436a) == 1;
    }

    private boolean Y(@n0 CharSequence charSequence, boolean z10) {
        return (z10 ? androidx.core.text.r.f21161d : androidx.core.text.r.f21160c).isRtl(charSequence, 0, charSequence.length());
    }

    private static float Z(float f10, float f11, float f12, @p0 TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return com.google.android.material.animation.b.a(f10, f11, f12);
    }

    @androidx.annotation.l
    private static int a(@androidx.annotation.l int i10, @androidx.annotation.l int i11, @androidx.annotation.x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), Math.round((Color.red(i10) * f11) + (Color.red(i11) * f10)), Math.round((Color.green(i10) * f11) + (Color.green(i11) * f10)), Math.round((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    private void b(boolean z10) {
        StaticLayout staticLayout;
        i(1.0f, z10);
        CharSequence charSequence = this.H;
        if (charSequence != null && (staticLayout = this.f54457k0) != null) {
            this.f54465o0 = TextUtils.ellipsize(charSequence, this.V, staticLayout.getWidth(), this.F);
        }
        CharSequence charSequence2 = this.f54465o0;
        float fB0 = 0.0f;
        if (charSequence2 != null) {
            this.f54459l0 = b0(this.V, charSequence2);
        } else {
            this.f54459l0 = 0.0f;
        }
        int iD = androidx.core.view.n.d(this.f54456k, this.I ? 1 : 0);
        int i10 = iD & 112;
        if (i10 == 48) {
            this.f54470r = this.f54450h.top;
        } else if (i10 != 80) {
            this.f54470r = this.f54450h.centerY() - ((this.V.descent() - this.V.ascent()) / 2.0f);
        } else {
            this.f54470r = this.f54450h.bottom + this.V.ascent();
        }
        int i11 = iD & androidx.core.view.n.f21703d;
        if (i11 == 1) {
            this.f54474t = this.f54450h.centerX() - (this.f54459l0 / 2.0f);
        } else if (i11 != 5) {
            this.f54474t = this.f54450h.left;
        } else {
            this.f54474t = this.f54450h.right - this.f54459l0;
        }
        i(0.0f, z10);
        StaticLayout staticLayout2 = this.f54457k0;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.f54457k0;
        if (staticLayout3 == null || this.f54467p0 <= 1) {
            CharSequence charSequence3 = this.H;
            if (charSequence3 != null) {
                fB0 = b0(this.V, charSequence3);
            }
        } else {
            fB0 = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f54457k0;
        this.f54466p = staticLayout4 != null ? staticLayout4.getLineCount() : 0;
        int iD2 = androidx.core.view.n.d(this.f54454j, this.I ? 1 : 0);
        int i12 = iD2 & 112;
        if (i12 == 48) {
            this.f54468q = this.f54448g.top;
        } else if (i12 != 80) {
            this.f54468q = this.f54448g.centerY() - (height / 2.0f);
        } else {
            this.f54468q = (this.f54448g.bottom - height) + this.V.descent();
        }
        int i13 = iD2 & androidx.core.view.n.f21703d;
        if (i13 == 1) {
            this.f54472s = this.f54448g.centerX() - (fB0 / 2.0f);
        } else if (i13 != 5) {
            this.f54472s = this.f54448g.left;
        } else {
            this.f54472s = this.f54448g.right - fB0;
        }
        j();
        E0(this.f54438b);
    }

    private float b0(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private void c() {
        g(this.f54438b);
    }

    private float d(@androidx.annotation.x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        float f11 = this.f54444e;
        return f10 <= f11 ? com.google.android.material.animation.b.b(1.0f, 0.0f, this.f54442d, f11, f10) : com.google.android.material.animation.b.b(0.0f, 1.0f, f11, 1.0f, f10);
    }

    private float e() {
        float f10 = this.f54442d;
        return f10 + ((1.0f - f10) * 0.5f);
    }

    private static boolean e0(@n0 Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    private boolean f(@n0 CharSequence charSequence) {
        boolean zV = V();
        return this.J ? Y(charSequence, zV) : zV;
    }

    private void g(float f10) {
        float f11;
        T(f10);
        if (!this.f54440c) {
            this.f54476u = Z(this.f54472s, this.f54474t, f10, this.X);
            this.f54477v = Z(this.f54468q, this.f54470r, f10, this.X);
            E0(f10);
            f11 = f10;
        } else if (f10 < this.f54444e) {
            this.f54476u = this.f54472s;
            this.f54477v = this.f54468q;
            E0(0.0f);
            f11 = 0.0f;
        } else {
            this.f54476u = this.f54474t;
            this.f54477v = this.f54470r - Math.max(0, this.f54446f);
            E0(1.0f);
            f11 = 1.0f;
        }
        TimeInterpolator timeInterpolator = com.google.android.material.animation.b.f52897b;
        j0(1.0f - Z(0.0f, 1.0f, 1.0f - f10, timeInterpolator));
        u0(Z(1.0f, 0.0f, f10, timeInterpolator));
        if (this.f54464o != this.f54462n) {
            this.V.setColor(a(y(), w(), f11));
        } else {
            this.V.setColor(w());
        }
        float f12 = this.f54451h0;
        float f13 = this.f54453i0;
        if (f12 != f13) {
            this.V.setLetterSpacing(Z(f13, f12, f10, timeInterpolator));
        } else {
            this.V.setLetterSpacing(f12);
        }
        this.P = Z(this.f54443d0, this.Z, f10, null);
        this.Q = Z(this.f54445e0, this.f54437a0, f10, null);
        this.R = Z(this.f54447f0, this.f54439b0, f10, null);
        int iA = a(x(this.f54449g0), x(this.f54441c0), f10);
        this.S = iA;
        this.V.setShadowLayer(this.P, this.Q, this.R, iA);
        if (this.f54440c) {
            this.V.setAlpha((int) (d(f10) * this.V.getAlpha()));
        }
        j1.n1(this.f54436a);
    }

    private void h(float f10) {
        i(f10, false);
    }

    private void i(float f10, boolean z10) {
        float f11;
        float f12;
        Typeface typeface;
        if (this.G == null) {
            return;
        }
        float fWidth = this.f54450h.width();
        float fWidth2 = this.f54448g.width();
        if (U(f10, 1.0f)) {
            f11 = this.f54460m;
            f12 = this.f54451h0;
            this.N = 1.0f;
            typeface = this.f54478w;
        } else {
            float f13 = this.f54458l;
            float f14 = this.f54453i0;
            Typeface typeface2 = this.f54481z;
            if (U(f10, 0.0f)) {
                this.N = 1.0f;
            } else {
                this.N = Z(this.f54458l, this.f54460m, f10, this.Y) / this.f54458l;
            }
            float f15 = this.f54460m / this.f54458l;
            fWidth = (!z10 && fWidth2 * f15 > fWidth) ? Math.min(fWidth / f15, fWidth2) : fWidth2;
            f11 = f13;
            f12 = f14;
            typeface = typeface2;
        }
        boolean z11 = false;
        if (fWidth > 0.0f) {
            boolean z12 = this.O != f11;
            boolean z13 = this.f54455j0 != f12;
            boolean z14 = this.C != typeface;
            StaticLayout staticLayout = this.f54457k0;
            boolean z15 = z12 || z13 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z14 || this.U;
            this.O = f11;
            this.f54455j0 = f12;
            this.C = typeface;
            this.U = false;
            this.V.setLinearText(this.N != 1.0f);
            z11 = z15;
        }
        if (this.H == null || z11) {
            this.V.setTextSize(this.O);
            this.V.setTypeface(this.C);
            this.V.setLetterSpacing(this.f54455j0);
            this.I = f(this.G);
            StaticLayout staticLayoutK = k(Q0() ? this.f54467p0 : 1, fWidth, this.I);
            this.f54457k0 = staticLayoutK;
            this.H = staticLayoutK.getText();
        }
    }

    private void j() {
        Bitmap bitmap = this.L;
        if (bitmap != null) {
            bitmap.recycle();
            this.L = null;
        }
    }

    private void j0(float f10) {
        this.f54461m0 = f10;
        j1.n1(this.f54436a);
    }

    private StaticLayout k(int i10, float f10, boolean z10) {
        StaticLayout staticLayoutA;
        try {
            staticLayoutA = StaticLayoutBuilderCompat.c(this.G, this.V, (int) f10).e(this.F).i(z10).d(i10 == 1 ? Layout.Alignment.ALIGN_NORMAL : N()).h(false).k(i10).j(this.f54469q0, this.f54471r0).g(this.f54473s0).m(this.f54475t0).a();
        } catch (StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException e10) {
            Log.e(f54431v0, e10.getCause().getMessage(), e10);
            staticLayoutA = null;
        }
        return (StaticLayout) androidx.core.util.o.l(staticLayoutA);
    }

    private void m(@n0 Canvas canvas, float f10, float f11) {
        int alpha = this.V.getAlpha();
        canvas.translate(f10, f11);
        if (!this.f54440c) {
            this.V.setAlpha((int) (this.f54463n0 * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.V;
                textPaint.setShadowLayer(this.P, this.Q, this.R, com.google.android.material.color.m.a(this.S, textPaint.getAlpha()));
            }
            this.f54457k0.draw(canvas);
        }
        if (!this.f54440c) {
            this.V.setAlpha((int) (this.f54461m0 * alpha));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            TextPaint textPaint2 = this.V;
            textPaint2.setShadowLayer(this.P, this.Q, this.R, com.google.android.material.color.m.a(this.S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f54457k0.getLineBaseline(0);
        CharSequence charSequence = this.f54465o0;
        float f12 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, this.V);
        if (i10 >= 31) {
            this.V.setShadowLayer(this.P, this.Q, this.R, this.S);
        }
        if (this.f54440c) {
            return;
        }
        String strTrim = this.f54465o0.toString().trim();
        if (strTrim.endsWith(f54432w0)) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.V.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f54457k0.getLineEnd(0), str.length()), 0.0f, f12, (Paint) this.V);
    }

    private void n() {
        if (this.L != null || this.f54448g.isEmpty() || TextUtils.isEmpty(this.H)) {
            return;
        }
        g(0.0f);
        int width = this.f54457k0.getWidth();
        int height = this.f54457k0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f54457k0.draw(new Canvas(this.L));
        if (this.M == null) {
            this.M = new Paint(3);
        }
    }

    private boolean o0(Typeface typeface) {
        com.google.android.material.resources.a aVar = this.E;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f54480y == typeface) {
            return false;
        }
        this.f54480y = typeface;
        Typeface typefaceB = com.google.android.material.resources.h.b(this.f54436a.getContext().getResources().getConfiguration(), typeface);
        this.f54479x = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f54480y;
        }
        this.f54478w = typefaceB;
        return true;
    }

    private float s(int i10, int i11) {
        if (i11 == 17 || (i11 & 7) == 1) {
            return (i10 / 2.0f) - (this.f54459l0 / 2.0f);
        }
        if ((i11 & androidx.core.view.n.f21702c) == 8388613 || (i11 & 5) == 5) {
            return this.I ? this.f54450h.left : this.f54450h.right - this.f54459l0;
        }
        return this.I ? this.f54450h.right - this.f54459l0 : this.f54450h.left;
    }

    private float t(@n0 RectF rectF, int i10, int i11) {
        if (i11 == 17 || (i11 & 7) == 1) {
            return (i10 / 2.0f) + (this.f54459l0 / 2.0f);
        }
        if ((i11 & androidx.core.view.n.f21702c) == 8388613 || (i11 & 5) == 5) {
            return this.I ? rectF.left + this.f54459l0 : this.f54450h.right;
        }
        return this.I ? this.f54450h.right : rectF.left + this.f54459l0;
    }

    private void u0(float f10) {
        this.f54463n0 = f10;
        j1.n1(this.f54436a);
    }

    @androidx.annotation.l
    private int x(@p0 ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.T;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    @androidx.annotation.l
    private int y() {
        return x(this.f54462n);
    }

    private boolean z0(Typeface typeface) {
        com.google.android.material.resources.a aVar = this.D;
        if (aVar != null) {
            aVar.c();
        }
        if (this.B == typeface) {
            return false;
        }
        this.B = typeface;
        Typeface typefaceB = com.google.android.material.resources.h.b(this.f54436a.getContext().getResources().getConfiguration(), typeface);
        this.A = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.B;
        }
        this.f54481z = typefaceB;
        return true;
    }

    public ColorStateList A() {
        return this.f54462n;
    }

    public void A0(float f10) {
        float fD = a2.a.d(f10, 0.0f, 1.0f);
        if (fD != this.f54438b) {
            this.f54438b = fD;
            c();
        }
    }

    public float B() {
        R(this.W);
        return (-this.W.ascent()) + this.W.descent();
    }

    public void B0(boolean z10) {
        this.f54440c = z10;
    }

    public int C() {
        return this.f54454j;
    }

    public void C0(float f10) {
        this.f54442d = f10;
        this.f54444e = e();
    }

    public float D() {
        R(this.W);
        return -this.W.ascent();
    }

    @w0(23)
    public void D0(int i10) {
        this.f54473s0 = i10;
    }

    public float E() {
        return this.f54458l;
    }

    public Typeface F() {
        Typeface typeface = this.f54481z;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    @w0(23)
    public void F0(float f10) {
        this.f54469q0 = f10;
    }

    public float G() {
        return this.f54438b;
    }

    @w0(23)
    public void G0(@androidx.annotation.x(from = 0.0d) float f10) {
        this.f54471r0 = f10;
    }

    public float H() {
        return this.f54444e;
    }

    public void H0(int i10) {
        if (i10 != this.f54467p0) {
            this.f54467p0 = i10;
            j();
            c0();
        }
    }

    @w0(23)
    public int I() {
        return this.f54473s0;
    }

    public void I0(TimeInterpolator timeInterpolator) {
        this.X = timeInterpolator;
        c0();
    }

    public int J() {
        StaticLayout staticLayout = this.f54457k0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public void J0(boolean z10) {
        this.J = z10;
    }

    @w0(23)
    public float K() {
        return this.f54457k0.getSpacingAdd();
    }

    public final boolean K0(int[] iArr) {
        this.T = iArr;
        if (!X()) {
            return false;
        }
        c0();
        return true;
    }

    @w0(23)
    public float L() {
        return this.f54457k0.getSpacingMultiplier();
    }

    @w0(23)
    public void L0(@p0 y yVar) {
        if (this.f54475t0 != yVar) {
            this.f54475t0 = yVar;
            d0(true);
        }
    }

    public int M() {
        return this.f54467p0;
    }

    public void M0(@p0 CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.G, charSequence)) {
            this.G = charSequence;
            this.H = null;
            j();
            c0();
        }
    }

    public void N0(TimeInterpolator timeInterpolator) {
        this.Y = timeInterpolator;
        c0();
    }

    @p0
    public TimeInterpolator O() {
        return this.X;
    }

    public void O0(@n0 TextUtils.TruncateAt truncateAt) {
        this.F = truncateAt;
        c0();
    }

    @p0
    public CharSequence P() {
        return this.G;
    }

    public void P0(Typeface typeface) {
        boolean zO0 = o0(typeface);
        boolean zZ0 = z0(typeface);
        if (zO0 || zZ0) {
            c0();
        }
    }

    @n0
    public TextUtils.TruncateAt S() {
        return this.F;
    }

    public boolean W() {
        return this.J;
    }

    public final boolean X() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f54464o;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f54462n) != null && colorStateList.isStateful());
    }

    public void a0(@n0 Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f54480y;
            if (typeface != null) {
                this.f54479x = com.google.android.material.resources.h.b(configuration, typeface);
            }
            Typeface typeface2 = this.B;
            if (typeface2 != null) {
                this.A = com.google.android.material.resources.h.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f54479x;
            if (typeface3 == null) {
                typeface3 = this.f54480y;
            }
            this.f54478w = typeface3;
            Typeface typeface4 = this.A;
            if (typeface4 == null) {
                typeface4 = this.B;
            }
            this.f54481z = typeface4;
            d0(true);
        }
    }

    public void c0() {
        d0(false);
    }

    public void d0(boolean z10) {
        if ((this.f54436a.getHeight() <= 0 || this.f54436a.getWidth() <= 0) && !z10) {
            return;
        }
        b(z10);
        c();
    }

    public void f0(@p0 ColorStateList colorStateList) {
        if (this.f54464o == colorStateList && this.f54462n == colorStateList) {
            return;
        }
        this.f54464o = colorStateList;
        this.f54462n = colorStateList;
        c0();
    }

    public void g0(int i10, int i11, int i12, int i13) {
        if (e0(this.f54450h, i10, i11, i12, i13)) {
            return;
        }
        this.f54450h.set(i10, i11, i12, i13);
        this.U = true;
    }

    public void h0(@n0 Rect rect) {
        g0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void i0(int i10) {
        com.google.android.material.resources.d dVar = new com.google.android.material.resources.d(this.f54436a.getContext(), i10);
        if (dVar.i() != null) {
            this.f54464o = dVar.i();
        }
        if (dVar.j() != 0.0f) {
            this.f54460m = dVar.j();
        }
        ColorStateList colorStateList = dVar.f54851c;
        if (colorStateList != null) {
            this.f54441c0 = colorStateList;
        }
        this.f54437a0 = dVar.f54856h;
        this.f54439b0 = dVar.f54857i;
        this.Z = dVar.f54858j;
        this.f54451h0 = dVar.f54860l;
        com.google.android.material.resources.a aVar = this.E;
        if (aVar != null) {
            aVar.c();
        }
        this.E = new com.google.android.material.resources.a(new a(), dVar.e());
        dVar.h(this.f54436a.getContext(), this.E);
        c0();
    }

    public void k0(ColorStateList colorStateList) {
        if (this.f54464o != colorStateList) {
            this.f54464o = colorStateList;
            c0();
        }
    }

    public void l(@n0 Canvas canvas) {
        int iSave = canvas.save();
        if (this.H == null || this.f54452i.width() <= 0.0f || this.f54452i.height() <= 0.0f) {
            return;
        }
        this.V.setTextSize(this.O);
        float f10 = this.f54476u;
        float f11 = this.f54477v;
        boolean z10 = this.K && this.L != null;
        float f12 = this.N;
        if (f12 != 1.0f && !this.f54440c) {
            canvas.scale(f12, f12, f10, f11);
        }
        if (z10) {
            canvas.drawBitmap(this.L, f10, f11, this.M);
            canvas.restoreToCount(iSave);
            return;
        }
        if (!Q0() || (this.f54440c && this.f54438b <= this.f54444e)) {
            canvas.translate(f10, f11);
            this.f54457k0.draw(canvas);
        } else {
            m(canvas, this.f54476u - this.f54457k0.getLineStart(0), f11);
        }
        canvas.restoreToCount(iSave);
    }

    public void l0(int i10) {
        if (this.f54456k != i10) {
            this.f54456k = i10;
            c0();
        }
    }

    public void m0(float f10) {
        if (this.f54460m != f10) {
            this.f54460m = f10;
            c0();
        }
    }

    public void n0(Typeface typeface) {
        if (o0(typeface)) {
            c0();
        }
    }

    public void o(@n0 RectF rectF, int i10, int i11) {
        this.I = f(this.G);
        rectF.left = Math.max(s(i10, i11), this.f54450h.left);
        rectF.top = this.f54450h.top;
        rectF.right = Math.min(t(rectF, i10, i11), this.f54450h.right);
        rectF.bottom = this.f54450h.top + r();
    }

    public ColorStateList p() {
        return this.f54464o;
    }

    public void p0(int i10) {
        this.f54446f = i10;
    }

    public int q() {
        return this.f54456k;
    }

    public void q0(int i10, int i11, int i12, int i13) {
        if (e0(this.f54448g, i10, i11, i12, i13)) {
            return;
        }
        this.f54448g.set(i10, i11, i12, i13);
        this.U = true;
    }

    public float r() {
        Q(this.W);
        return -this.W.ascent();
    }

    public void r0(@n0 Rect rect) {
        q0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void s0(float f10) {
        if (this.f54453i0 != f10) {
            this.f54453i0 = f10;
            c0();
        }
    }

    public void t0(int i10) {
        com.google.android.material.resources.d dVar = new com.google.android.material.resources.d(this.f54436a.getContext(), i10);
        if (dVar.i() != null) {
            this.f54462n = dVar.i();
        }
        if (dVar.j() != 0.0f) {
            this.f54458l = dVar.j();
        }
        ColorStateList colorStateList = dVar.f54851c;
        if (colorStateList != null) {
            this.f54449g0 = colorStateList;
        }
        this.f54445e0 = dVar.f54856h;
        this.f54447f0 = dVar.f54857i;
        this.f54443d0 = dVar.f54858j;
        this.f54453i0 = dVar.f54860l;
        com.google.android.material.resources.a aVar = this.D;
        if (aVar != null) {
            aVar.c();
        }
        this.D = new com.google.android.material.resources.a(new C0426b(), dVar.e());
        dVar.h(this.f54436a.getContext(), this.D);
        c0();
    }

    public float u() {
        return this.f54460m;
    }

    public Typeface v() {
        Typeface typeface = this.f54478w;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public void v0(ColorStateList colorStateList) {
        if (this.f54462n != colorStateList) {
            this.f54462n = colorStateList;
            c0();
        }
    }

    @androidx.annotation.l
    public int w() {
        return x(this.f54464o);
    }

    public void w0(int i10) {
        if (this.f54454j != i10) {
            this.f54454j = i10;
            c0();
        }
    }

    public void x0(float f10) {
        if (this.f54458l != f10) {
            this.f54458l = f10;
            c0();
        }
    }

    public void y0(Typeface typeface) {
        if (z0(typeface)) {
            c0();
        }
    }

    public int z() {
        return this.f54466p;
    }
}
