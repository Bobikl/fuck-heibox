package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.d1;
import androidx.annotation.e1;
import androidx.annotation.f;
import androidx.annotation.h;
import androidx.annotation.l;
import androidx.annotation.l1;
import androidx.annotation.n;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.r;
import androidx.annotation.t0;
import androidx.annotation.v;
import androidx.core.graphics.drawable.d;
import androidx.core.graphics.drawable.p;
import androidx.core.graphics.f0;
import androidx.core.view.j1;
import com.google.android.material.animation.i;
import com.google.android.material.color.m;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.j0;
import com.google.android.material.internal.z;
import com.google.android.material.resources.c;
import com.google.android.material.shape.k;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: compiled from: ChipDrawable.java */
/* JADX INFO: loaded from: classes7.dex */
public class b extends k implements p, Drawable.Callback, z.b {

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    private static final boolean f53588m4 = false;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    private static final String f53590o4 = "http://schemas.android.com/apk/res-auto";

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    private static final int f53591p4 = 24;

    @p0
    private ColorStateList F;

    @p0
    private ColorStateList G;
    private float G2;
    private float G3;
    private float H;
    private float I;

    @p0
    private ColorStateList J;

    @n0
    private final Context J3;
    private float K;
    private final Paint K3;

    @p0
    private ColorStateList L;

    @p0
    private final Paint L3;

    @p0
    private CharSequence M;
    private final Paint.FontMetrics M3;
    private boolean N;
    private final RectF N3;

    @p0
    private Drawable O;
    private final PointF O3;

    @p0
    private ColorStateList P;
    private final Path P3;
    private float Q;

    @n0
    private final z Q3;
    private boolean R;

    @l
    private int R3;
    private boolean S;

    @l
    private int S3;

    @p0
    private Drawable T;

    @l
    private int T3;

    @p0
    private Drawable U;

    @l
    private int U3;

    @p0
    private ColorStateList V;

    @l
    private int V3;
    private float W;

    @l
    private int W3;

    @p0
    private CharSequence X;
    private boolean X3;
    private boolean Y;

    @l
    private int Y3;
    private boolean Z;
    private int Z3;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @p0
    private Drawable f53593a0;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    @p0
    private ColorFilter f53594a4;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @p0
    private ColorStateList f53595b0;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    @p0
    private PorterDuffColorFilter f53596b4;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @p0
    private i f53597c0;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    @p0
    private ColorStateList f53598c4;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    @p0
    private PorterDuff.Mode f53599d4;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    private int[] f53600e4;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private boolean f53601f4;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    @p0
    private ColorStateList f53602g4;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    @n0
    private WeakReference<a> f53603h4;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    private TextUtils.TruncateAt f53604i4;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    private boolean f53605j4;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    private int f53606k4;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    private boolean f53607l4;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @p0
    private i f53608p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private float f53609p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private float f53610p3;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private float f53611x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private float f53612x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private float f53613y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private float f53614y2;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    private static final int[] f53589n4 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    private static final ShapeDrawable f53592q4 = new ShapeDrawable(new OvalShape());

    /* JADX INFO: compiled from: ChipDrawable.java */
    public interface a {
        void a();
    }

    private b(@n0 Context context, AttributeSet attributeSet, @f int i10, @e1 int i11) {
        super(context, attributeSet, i10, i11);
        this.I = -1.0f;
        this.K3 = new Paint(1);
        this.M3 = new Paint.FontMetrics();
        this.N3 = new RectF();
        this.O3 = new PointF();
        this.P3 = new Path();
        this.Z3 = 255;
        this.f53599d4 = PorterDuff.Mode.SRC_IN;
        this.f53603h4 = new WeakReference<>(null);
        Z(context);
        this.J3 = context;
        z zVar = new z(this);
        this.Q3 = zVar;
        this.M = "";
        zVar.e().density = context.getResources().getDisplayMetrics().density;
        this.L3 = null;
        int[] iArr = f53589n4;
        setState(iArr);
        f3(iArr);
        this.f53605j4 = true;
        if (com.google.android.material.ripple.b.f54876a) {
            f53592q4.setTint(-1);
        }
    }

    private float G1() {
        Drawable drawable = this.X3 ? this.f53593a0 : this.O;
        float fCeil = this.Q;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(j0.g(this.J3, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    private float H1() {
        Drawable drawable = this.X3 ? this.f53593a0 : this.O;
        float f10 = this.Q;
        return (f10 > 0.0f || drawable == null) ? f10 : drawable.getIntrinsicWidth();
    }

    private boolean L3() {
        return this.Z && this.f53593a0 != null && this.X3;
    }

    private boolean M3() {
        return this.N && this.O != null;
    }

    private boolean N3() {
        return this.S && this.T != null;
    }

    private void O3(@p0 Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void P0(@p0 Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        d.m(drawable, d.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.T) {
            if (drawable.isStateful()) {
                drawable.setState(D1());
            }
            d.o(drawable, this.V);
            return;
        }
        Drawable drawable2 = this.O;
        if (drawable == drawable2 && this.R) {
            d.o(drawable2, this.P);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void P3() {
        this.f53602g4 = this.f53601f4 ? com.google.android.material.ripple.b.e(this.L) : null;
    }

    private void Q0(@n0 Rect rect, @n0 RectF rectF) {
        rectF.setEmpty();
        if (M3() || L3()) {
            float f10 = this.f53611x1 + this.f53613y1;
            float fH1 = H1();
            if (d.f(this) == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + fH1;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - fH1;
            }
            float fG1 = G1();
            float fExactCenterY = rect.exactCenterY() - (fG1 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fG1;
        }
    }

    @TargetApi(21)
    private void Q3() {
        this.U = new RippleDrawable(com.google.android.material.ripple.b.e(N1()), this.T, f53592q4);
    }

    private void S0(@n0 Rect rect, @n0 RectF rectF) {
        rectF.set(rect);
        if (N3()) {
            float f10 = this.G3 + this.f53610p3 + this.W + this.G2 + this.f53614y2;
            if (d.f(this) == 0) {
                rectF.right = rect.right - f10;
            } else {
                rectF.left = rect.left + f10;
            }
        }
    }

    private void T0(@n0 Rect rect, @n0 RectF rectF) {
        rectF.setEmpty();
        if (N3()) {
            float f10 = this.G3 + this.f53610p3;
            if (d.f(this) == 0) {
                float f11 = rect.right - f10;
                rectF.right = f11;
                rectF.left = f11 - this.W;
            } else {
                float f12 = rect.left + f10;
                rectF.left = f12;
                rectF.right = f12 + this.W;
            }
            float fExactCenterY = rect.exactCenterY();
            float f13 = this.W;
            float f14 = fExactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    @p0
    private ColorFilter T1() {
        ColorFilter colorFilter = this.f53594a4;
        return colorFilter != null ? colorFilter : this.f53596b4;
    }

    private void T2(@p0 ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            onStateChange(getState());
        }
    }

    private void U0(@n0 Rect rect, @n0 RectF rectF) {
        rectF.setEmpty();
        if (N3()) {
            float f10 = this.G3 + this.f53610p3 + this.W + this.G2 + this.f53614y2;
            if (d.f(this) == 0) {
                float f11 = rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i10 = rect.left;
                rectF.left = i10;
                rectF.right = i10 + f10;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean V1(@p0 int[] iArr, @f int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private void W0(@n0 Rect rect, @n0 RectF rectF) {
        rectF.setEmpty();
        if (this.M != null) {
            float fR0 = this.f53611x1 + R0() + this.f53612x2;
            float fV0 = this.G3 + V0() + this.f53614y2;
            if (d.f(this) == 0) {
                rectF.left = rect.left + fR0;
                rectF.right = rect.right - fV0;
            } else {
                rectF.left = rect.left + fV0;
                rectF.right = rect.right - fR0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private float X0() {
        this.Q3.e().getFontMetrics(this.M3);
        Paint.FontMetrics fontMetrics = this.M3;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private boolean Z0() {
        return this.Z && this.f53593a0 != null && this.Y;
    }

    @n0
    public static b a1(@n0 Context context, @p0 AttributeSet attributeSet, @f int i10, @e1 int i11) {
        b bVar = new b(context, attributeSet, i10, i11);
        bVar.i2(attributeSet, i10, i11);
        return bVar;
    }

    @n0
    public static b b1(@n0 Context context, @l1 int i10) {
        AttributeSet attributeSetG = e9.a.g(context, i10, "chip");
        int styleAttribute = attributeSetG.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = com.google.android.material.R.style.Widget_MaterialComponents_Chip_Entry;
        }
        return a1(context, attributeSetG, com.google.android.material.R.attr.chipStandaloneStyle, styleAttribute);
    }

    private void c1(@n0 Canvas canvas, @n0 Rect rect) {
        if (L3()) {
            Q0(rect, this.N3);
            RectF rectF = this.N3;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f53593a0.setBounds(0, 0, (int) this.N3.width(), (int) this.N3.height());
            this.f53593a0.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void d1(@n0 Canvas canvas, @n0 Rect rect) {
        if (this.f53607l4) {
            return;
        }
        this.K3.setColor(this.S3);
        this.K3.setStyle(Paint.Style.FILL);
        this.K3.setColorFilter(T1());
        this.N3.set(rect);
        canvas.drawRoundRect(this.N3, o1(), o1(), this.K3);
    }

    private void e1(@n0 Canvas canvas, @n0 Rect rect) {
        if (M3()) {
            Q0(rect, this.N3);
            RectF rectF = this.N3;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.O.setBounds(0, 0, (int) this.N3.width(), (int) this.N3.height());
            this.O.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void f1(@n0 Canvas canvas, @n0 Rect rect) {
        if (this.K <= 0.0f || this.f53607l4) {
            return;
        }
        this.K3.setColor(this.U3);
        this.K3.setStyle(Paint.Style.STROKE);
        if (!this.f53607l4) {
            this.K3.setColorFilter(T1());
        }
        RectF rectF = this.N3;
        float f10 = rect.left;
        float f11 = this.K;
        rectF.set(f10 + (f11 / 2.0f), rect.top + (f11 / 2.0f), rect.right - (f11 / 2.0f), rect.bottom - (f11 / 2.0f));
        float f12 = this.I - (this.K / 2.0f);
        canvas.drawRoundRect(this.N3, f12, f12, this.K3);
    }

    private static boolean f2(@p0 ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private void g1(@n0 Canvas canvas, @n0 Rect rect) {
        if (this.f53607l4) {
            return;
        }
        this.K3.setColor(this.R3);
        this.K3.setStyle(Paint.Style.FILL);
        this.N3.set(rect);
        canvas.drawRoundRect(this.N3, o1(), o1(), this.K3);
    }

    private static boolean g2(@p0 Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private void h1(@n0 Canvas canvas, @n0 Rect rect) {
        if (N3()) {
            T0(rect, this.N3);
            RectF rectF = this.N3;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.T.setBounds(0, 0, (int) this.N3.width(), (int) this.N3.height());
            if (com.google.android.material.ripple.b.f54876a) {
                this.U.setBounds(this.T.getBounds());
                this.U.jumpToCurrentState();
                this.U.draw(canvas);
            } else {
                this.T.draw(canvas);
            }
            canvas.translate(-f10, -f11);
        }
    }

    private static boolean h2(@p0 com.google.android.material.resources.d dVar) {
        return (dVar == null || dVar.i() == null || !dVar.i().isStateful()) ? false : true;
    }

    private void i1(@n0 Canvas canvas, @n0 Rect rect) {
        this.K3.setColor(this.V3);
        this.K3.setStyle(Paint.Style.FILL);
        this.N3.set(rect);
        if (!this.f53607l4) {
            canvas.drawRoundRect(this.N3, o1(), o1(), this.K3);
        } else {
            h(new RectF(rect), this.P3);
            super.q(canvas, this.K3, this.P3, v());
        }
    }

    private void i2(@p0 AttributeSet attributeSet, @f int i10, @e1 int i11) {
        TypedArray typedArrayK = c0.k(this.J3, attributeSet, com.google.android.material.R.styleable.C, i10, i11, new int[0]);
        this.f53607l4 = typedArrayK.hasValue(com.google.android.material.R.styleable.Chip_shapeAppearance);
        T2(c.a(this.J3, typedArrayK, com.google.android.material.R.styleable.Chip_chipSurfaceColor));
        v2(c.a(this.J3, typedArrayK, com.google.android.material.R.styleable.Chip_chipBackgroundColor));
        L2(typedArrayK.getDimension(com.google.android.material.R.styleable.Chip_chipMinHeight, 0.0f));
        int i12 = com.google.android.material.R.styleable.Chip_chipCornerRadius;
        if (typedArrayK.hasValue(i12)) {
            x2(typedArrayK.getDimension(i12, 0.0f));
        }
        P2(c.a(this.J3, typedArrayK, com.google.android.material.R.styleable.Chip_chipStrokeColor));
        R2(typedArrayK.getDimension(com.google.android.material.R.styleable.Chip_chipStrokeWidth, 0.0f));
        t3(c.a(this.J3, typedArrayK, com.google.android.material.R.styleable.Chip_rippleColor));
        y3(typedArrayK.getText(com.google.android.material.R.styleable.Chip_android_text));
        com.google.android.material.resources.d dVarG = c.g(this.J3, typedArrayK, com.google.android.material.R.styleable.Chip_android_textAppearance);
        dVarG.l(typedArrayK.getDimension(com.google.android.material.R.styleable.Chip_android_textSize, dVarG.j()));
        z3(dVarG);
        int i13 = typedArrayK.getInt(com.google.android.material.R.styleable.Chip_android_ellipsize, 0);
        if (i13 == 1) {
            l3(TextUtils.TruncateAt.START);
        } else if (i13 == 2) {
            l3(TextUtils.TruncateAt.MIDDLE);
        } else if (i13 == 3) {
            l3(TextUtils.TruncateAt.END);
        }
        K2(typedArrayK.getBoolean(com.google.android.material.R.styleable.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue(f53590o4, "chipIconEnabled") != null && attributeSet.getAttributeValue(f53590o4, "chipIconVisible") == null) {
            K2(typedArrayK.getBoolean(com.google.android.material.R.styleable.Chip_chipIconEnabled, false));
        }
        B2(c.e(this.J3, typedArrayK, com.google.android.material.R.styleable.Chip_chipIcon));
        int i14 = com.google.android.material.R.styleable.Chip_chipIconTint;
        if (typedArrayK.hasValue(i14)) {
            H2(c.a(this.J3, typedArrayK, i14));
        }
        F2(typedArrayK.getDimension(com.google.android.material.R.styleable.Chip_chipIconSize, -1.0f));
        j3(typedArrayK.getBoolean(com.google.android.material.R.styleable.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue(f53590o4, "closeIconEnabled") != null && attributeSet.getAttributeValue(f53590o4, "closeIconVisible") == null) {
            j3(typedArrayK.getBoolean(com.google.android.material.R.styleable.Chip_closeIconEnabled, false));
        }
        U2(c.e(this.J3, typedArrayK, com.google.android.material.R.styleable.Chip_closeIcon));
        g3(c.a(this.J3, typedArrayK, com.google.android.material.R.styleable.Chip_closeIconTint));
        b3(typedArrayK.getDimension(com.google.android.material.R.styleable.Chip_closeIconSize, 0.0f));
        l2(typedArrayK.getBoolean(com.google.android.material.R.styleable.Chip_android_checkable, false));
        u2(typedArrayK.getBoolean(com.google.android.material.R.styleable.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue(f53590o4, "checkedIconEnabled") != null && attributeSet.getAttributeValue(f53590o4, "checkedIconVisible") == null) {
            u2(typedArrayK.getBoolean(com.google.android.material.R.styleable.Chip_checkedIconEnabled, false));
        }
        n2(c.e(this.J3, typedArrayK, com.google.android.material.R.styleable.Chip_checkedIcon));
        int i15 = com.google.android.material.R.styleable.Chip_checkedIconTint;
        if (typedArrayK.hasValue(i15)) {
            r2(c.a(this.J3, typedArrayK, i15));
        }
        w3(i.c(this.J3, typedArrayK, com.google.android.material.R.styleable.Chip_showMotionSpec));
        m3(i.c(this.J3, typedArrayK, com.google.android.material.R.styleable.Chip_hideMotionSpec));
        N2(typedArrayK.getDimension(com.google.android.material.R.styleable.Chip_chipStartPadding, 0.0f));
        q3(typedArrayK.getDimension(com.google.android.material.R.styleable.Chip_iconStartPadding, 0.0f));
        o3(typedArrayK.getDimension(com.google.android.material.R.styleable.Chip_iconEndPadding, 0.0f));
        H3(typedArrayK.getDimension(com.google.android.material.R.styleable.Chip_textStartPadding, 0.0f));
        D3(typedArrayK.getDimension(com.google.android.material.R.styleable.Chip_textEndPadding, 0.0f));
        d3(typedArrayK.getDimension(com.google.android.material.R.styleable.Chip_closeIconStartPadding, 0.0f));
        Y2(typedArrayK.getDimension(com.google.android.material.R.styleable.Chip_closeIconEndPadding, 0.0f));
        z2(typedArrayK.getDimension(com.google.android.material.R.styleable.Chip_chipEndPadding, 0.0f));
        s3(typedArrayK.getDimensionPixelSize(com.google.android.material.R.styleable.Chip_android_maxWidth, Integer.MAX_VALUE));
        typedArrayK.recycle();
    }

    private void j1(@n0 Canvas canvas, @n0 Rect rect) {
        Paint paint = this.L3;
        if (paint != null) {
            paint.setColor(f0.B(j1.f21601t, 127));
            canvas.drawRect(rect, this.L3);
            if (M3() || L3()) {
                Q0(rect, this.N3);
                canvas.drawRect(this.N3, this.L3);
            }
            if (this.M != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.L3);
            }
            if (N3()) {
                T0(rect, this.N3);
                canvas.drawRect(this.N3, this.L3);
            }
            this.L3.setColor(f0.B(y1.a.f141526c, 127));
            S0(rect, this.N3);
            canvas.drawRect(this.N3, this.L3);
            this.L3.setColor(f0.B(-16711936, 127));
            U0(rect, this.N3);
            canvas.drawRect(this.N3, this.L3);
        }
    }

    private void k1(@n0 Canvas canvas, @n0 Rect rect) {
        if (this.M != null) {
            Paint.Align alignY0 = Y0(rect, this.O3);
            W0(rect, this.N3);
            if (this.Q3.d() != null) {
                this.Q3.e().drawableState = getState();
                this.Q3.k(this.J3);
            }
            this.Q3.e().setTextAlign(alignY0);
            int iSave = 0;
            boolean z10 = Math.round(this.Q3.f(P1().toString())) > Math.round(this.N3.width());
            if (z10) {
                iSave = canvas.save();
                canvas.clipRect(this.N3);
            }
            CharSequence charSequenceEllipsize = this.M;
            if (z10 && this.f53604i4 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.Q3.e(), this.N3.width(), this.f53604i4);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.O3;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.Q3.e());
            if (z10) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    private boolean k2(@n0 int[] iArr, @n0 int[] iArr2) {
        boolean z10;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.F;
        int iL = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.R3) : 0);
        boolean state = true;
        if (this.R3 != iL) {
            this.R3 = iL;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.G;
        int iL2 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.S3) : 0);
        if (this.S3 != iL2) {
            this.S3 = iL2;
            zOnStateChange = true;
        }
        int iN = m.n(iL, iL2);
        if ((this.T3 != iN) | (y() == null)) {
            this.T3 = iN;
            o0(ColorStateList.valueOf(iN));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.J;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.U3) : 0;
        if (this.U3 != colorForState) {
            this.U3 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f53602g4 == null || !com.google.android.material.ripple.b.f(iArr)) ? 0 : this.f53602g4.getColorForState(iArr, this.V3);
        if (this.V3 != colorForState2) {
            this.V3 = colorForState2;
            if (this.f53601f4) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.Q3.d() == null || this.Q3.d().i() == null) ? 0 : this.Q3.d().i().getColorForState(iArr, this.W3);
        if (this.W3 != colorForState3) {
            this.W3 = colorForState3;
            zOnStateChange = true;
        }
        boolean z11 = V1(getState(), R.attr.state_checked) && this.Y;
        if (this.X3 == z11 || this.f53593a0 == null) {
            z10 = false;
        } else {
            float fR0 = R0();
            this.X3 = z11;
            if (fR0 != R0()) {
                zOnStateChange = true;
                z10 = true;
            } else {
                z10 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f53598c4;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.Y3) : 0;
        if (this.Y3 != colorForState4) {
            this.Y3 = colorForState4;
            this.f53596b4 = e9.a.k(this, this.f53598c4, this.f53599d4);
        } else {
            state = zOnStateChange;
        }
        if (g2(this.O)) {
            state |= this.O.setState(iArr);
        }
        if (g2(this.f53593a0)) {
            state |= this.f53593a0.setState(iArr);
        }
        if (g2(this.T)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.T.setState(iArr3);
        }
        if (com.google.android.material.ripple.b.f54876a && g2(this.U)) {
            state |= this.U.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z10) {
            j2();
        }
        return state;
    }

    public float A1() {
        return this.f53610p3;
    }

    public void A2(@q int i10) {
        z2(this.J3.getResources().getDimension(i10));
    }

    public void A3(@e1 int i10) {
        z3(new com.google.android.material.resources.d(this.J3, i10));
    }

    public float B1() {
        return this.W;
    }

    public void B2(@p0 Drawable drawable) {
        Drawable drawableQ1 = q1();
        if (drawableQ1 != drawable) {
            float fR0 = R0();
            this.O = drawable != null ? d.r(drawable).mutate() : null;
            float fR1 = R0();
            O3(drawableQ1);
            if (M3()) {
                P0(this.O);
            }
            invalidateSelf();
            if (fR0 != fR1) {
                j2();
            }
        }
    }

    public void B3(@l int i10) {
        C3(ColorStateList.valueOf(i10));
    }

    public float C1() {
        return this.G2;
    }

    @Deprecated
    public void C2(boolean z10) {
        K2(z10);
    }

    public void C3(@p0 ColorStateList colorStateList) {
        com.google.android.material.resources.d dVarQ1 = Q1();
        if (dVarQ1 != null) {
            dVarQ1.k(colorStateList);
            invalidateSelf();
        }
    }

    @n0
    public int[] D1() {
        return this.f53600e4;
    }

    @Deprecated
    public void D2(@h int i10) {
        J2(i10);
    }

    public void D3(float f10) {
        if (this.f53614y2 != f10) {
            this.f53614y2 = f10;
            invalidateSelf();
            j2();
        }
    }

    @p0
    public ColorStateList E1() {
        return this.V;
    }

    public void E2(@v int i10) {
        B2(b0.a.b(this.J3, i10));
    }

    public void E3(@q int i10) {
        D3(this.J3.getResources().getDimension(i10));
    }

    public void F1(@n0 RectF rectF) {
        U0(getBounds(), rectF);
    }

    public void F2(float f10) {
        if (this.Q != f10) {
            float fR0 = R0();
            this.Q = f10;
            float fR1 = R0();
            invalidateSelf();
            if (fR0 != fR1) {
                j2();
            }
        }
    }

    public void F3(@d1 int i10) {
        y3(this.J3.getResources().getString(i10));
    }

    public void G2(@q int i10) {
        F2(this.J3.getResources().getDimension(i10));
    }

    public void G3(@r float f10) {
        com.google.android.material.resources.d dVarQ1 = Q1();
        if (dVarQ1 != null) {
            dVarQ1.l(f10);
            this.Q3.e().setTextSize(f10);
            a();
        }
    }

    public void H2(@p0 ColorStateList colorStateList) {
        this.R = true;
        if (this.P != colorStateList) {
            this.P = colorStateList;
            if (M3()) {
                d.o(this.O, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void H3(float f10) {
        if (this.f53612x2 != f10) {
            this.f53612x2 = f10;
            invalidateSelf();
            j2();
        }
    }

    public TextUtils.TruncateAt I1() {
        return this.f53604i4;
    }

    public void I2(@n int i10) {
        H2(b0.a.a(this.J3, i10));
    }

    public void I3(@q int i10) {
        H3(this.J3.getResources().getDimension(i10));
    }

    @p0
    public i J1() {
        return this.f53608p1;
    }

    public void J2(@h int i10) {
        K2(this.J3.getResources().getBoolean(i10));
    }

    public void J3(boolean z10) {
        if (this.f53601f4 != z10) {
            this.f53601f4 = z10;
            P3();
            onStateChange(getState());
        }
    }

    public float K1() {
        return this.f53609p2;
    }

    public void K2(boolean z10) {
        if (this.N != z10) {
            boolean zM3 = M3();
            this.N = z10;
            boolean zM4 = M3();
            if (zM3 != zM4) {
                if (zM4) {
                    P0(this.O);
                } else {
                    O3(this.O);
                }
                invalidateSelf();
                j2();
            }
        }
    }

    boolean K3() {
        return this.f53605j4;
    }

    public float L1() {
        return this.f53613y1;
    }

    public void L2(float f10) {
        if (this.H != f10) {
            this.H = f10;
            invalidateSelf();
            j2();
        }
    }

    @t0
    public int M1() {
        return this.f53606k4;
    }

    public void M2(@q int i10) {
        L2(this.J3.getResources().getDimension(i10));
    }

    @p0
    public ColorStateList N1() {
        return this.L;
    }

    public void N2(float f10) {
        if (this.f53611x1 != f10) {
            this.f53611x1 = f10;
            invalidateSelf();
            j2();
        }
    }

    @p0
    public i O1() {
        return this.f53597c0;
    }

    public void O2(@q int i10) {
        N2(this.J3.getResources().getDimension(i10));
    }

    @p0
    public CharSequence P1() {
        return this.M;
    }

    public void P2(@p0 ColorStateList colorStateList) {
        if (this.J != colorStateList) {
            this.J = colorStateList;
            if (this.f53607l4) {
                F0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    @p0
    public com.google.android.material.resources.d Q1() {
        return this.Q3.d();
    }

    public void Q2(@n int i10) {
        P2(b0.a.a(this.J3, i10));
    }

    float R0() {
        if (M3() || L3()) {
            return this.f53613y1 + H1() + this.f53609p2;
        }
        return 0.0f;
    }

    public float R1() {
        return this.f53614y2;
    }

    public void R2(float f10) {
        if (this.K != f10) {
            this.K = f10;
            this.K3.setStrokeWidth(f10);
            if (this.f53607l4) {
                super.I0(f10);
            }
            invalidateSelf();
        }
    }

    public float S1() {
        return this.f53612x2;
    }

    public void S2(@q int i10) {
        R2(this.J3.getResources().getDimension(i10));
    }

    public boolean U1() {
        return this.f53601f4;
    }

    public void U2(@p0 Drawable drawable) {
        Drawable drawableY1 = y1();
        if (drawableY1 != drawable) {
            float fV0 = V0();
            this.T = drawable != null ? d.r(drawable).mutate() : null;
            if (com.google.android.material.ripple.b.f54876a) {
                Q3();
            }
            float fV1 = V0();
            O3(drawableY1);
            if (N3()) {
                P0(this.T);
            }
            invalidateSelf();
            if (fV0 != fV1) {
                j2();
            }
        }
    }

    float V0() {
        if (N3()) {
            return this.G2 + this.W + this.f53610p3;
        }
        return 0.0f;
    }

    public void V2(@p0 CharSequence charSequence) {
        if (this.X != charSequence) {
            this.X = androidx.core.text.a.c().m(charSequence);
            invalidateSelf();
        }
    }

    public boolean W1() {
        return this.Y;
    }

    @Deprecated
    public void W2(boolean z10) {
        j3(z10);
    }

    @Deprecated
    public boolean X1() {
        return Y1();
    }

    @Deprecated
    public void X2(@h int i10) {
        i3(i10);
    }

    @n0
    Paint.Align Y0(@n0 Rect rect, @n0 PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.M != null) {
            float fR0 = this.f53611x1 + R0() + this.f53612x2;
            if (d.f(this) == 0) {
                pointF.x = rect.left + fR0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - fR0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - X0();
        }
        return align;
    }

    public boolean Y1() {
        return this.Z;
    }

    public void Y2(float f10) {
        if (this.f53610p3 != f10) {
            this.f53610p3 = f10;
            invalidateSelf();
            if (N3()) {
                j2();
            }
        }
    }

    @Deprecated
    public boolean Z1() {
        return a2();
    }

    public void Z2(@q int i10) {
        Y2(this.J3.getResources().getDimension(i10));
    }

    @Override // com.google.android.material.internal.z.b
    public void a() {
        j2();
        invalidateSelf();
    }

    public boolean a2() {
        return this.N;
    }

    public void a3(@v int i10) {
        U2(b0.a.b(this.J3, i10));
    }

    @Deprecated
    public boolean b2() {
        return d2();
    }

    public void b3(float f10) {
        if (this.W != f10) {
            this.W = f10;
            invalidateSelf();
            if (N3()) {
                j2();
            }
        }
    }

    public boolean c2() {
        return g2(this.T);
    }

    public void c3(@q int i10) {
        b3(this.J3.getResources().getDimension(i10));
    }

    public boolean d2() {
        return this.S;
    }

    public void d3(float f10) {
        if (this.G2 != f10) {
            this.G2 = f10;
            invalidateSelf();
            if (N3()) {
                j2();
            }
        }
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
    public void draw(@n0 Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i10 = this.Z3;
        int iA = i10 < 255 ? c9.a.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i10) : 0;
        g1(canvas, bounds);
        d1(canvas, bounds);
        if (this.f53607l4) {
            super.draw(canvas);
        }
        f1(canvas, bounds);
        i1(canvas, bounds);
        e1(canvas, bounds);
        c1(canvas, bounds);
        if (this.f53605j4) {
            k1(canvas, bounds);
        }
        h1(canvas, bounds);
        j1(canvas, bounds);
        if (this.Z3 < 255) {
            canvas.restoreToCount(iA);
        }
    }

    boolean e2() {
        return this.f53607l4;
    }

    public void e3(@q int i10) {
        d3(this.J3.getResources().getDimension(i10));
    }

    public boolean f3(@n0 int[] iArr) {
        if (Arrays.equals(this.f53600e4, iArr)) {
            return false;
        }
        this.f53600e4 = iArr;
        if (N3()) {
            return k2(getState(), iArr);
        }
        return false;
    }

    public void g3(@p0 ColorStateList colorStateList) {
        if (this.V != colorStateList) {
            this.V = colorStateList;
            if (N3()) {
                d.o(this.T, colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.Z3;
    }

    @Override // android.graphics.drawable.Drawable
    @p0
    public ColorFilter getColorFilter() {
        return this.f53594a4;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.H;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f53611x1 + R0() + this.f53612x2 + this.Q3.f(P1().toString()) + this.f53614y2 + V0() + this.G3), this.f53606k4);
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@n0 Outline outline) {
        if (this.f53607l4) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.I);
        } else {
            outline.setRoundRect(bounds, this.I);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public void h3(@n int i10) {
        g3(b0.a.a(this.J3, i10));
    }

    public void i3(@h int i10) {
        j3(this.J3.getResources().getBoolean(i10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@n0 Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return f2(this.F) || f2(this.G) || f2(this.J) || (this.f53601f4 && f2(this.f53602g4)) || h2(this.Q3.d()) || Z0() || g2(this.O) || g2(this.f53593a0) || f2(this.f53598c4);
    }

    protected void j2() {
        a aVar = this.f53603h4.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void j3(boolean z10) {
        if (this.S != z10) {
            boolean zN3 = N3();
            this.S = z10;
            boolean zN4 = N3();
            if (zN3 != zN4) {
                if (zN4) {
                    P0(this.T);
                } else {
                    O3(this.T);
                }
                invalidateSelf();
                j2();
            }
        }
    }

    public void k3(@p0 a aVar) {
        this.f53603h4 = new WeakReference<>(aVar);
    }

    @p0
    public Drawable l1() {
        return this.f53593a0;
    }

    public void l2(boolean z10) {
        if (this.Y != z10) {
            this.Y = z10;
            float fR0 = R0();
            if (!z10 && this.X3) {
                this.X3 = false;
            }
            float fR1 = R0();
            invalidateSelf();
            if (fR0 != fR1) {
                j2();
            }
        }
    }

    public void l3(@p0 TextUtils.TruncateAt truncateAt) {
        this.f53604i4 = truncateAt;
    }

    @p0
    public ColorStateList m1() {
        return this.f53595b0;
    }

    public void m2(@h int i10) {
        l2(this.J3.getResources().getBoolean(i10));
    }

    public void m3(@p0 i iVar) {
        this.f53608p1 = iVar;
    }

    @p0
    public ColorStateList n1() {
        return this.G;
    }

    public void n2(@p0 Drawable drawable) {
        if (this.f53593a0 != drawable) {
            float fR0 = R0();
            this.f53593a0 = drawable;
            float fR1 = R0();
            O3(this.f53593a0);
            P0(this.f53593a0);
            invalidateSelf();
            if (fR0 != fR1) {
                j2();
            }
        }
    }

    public void n3(@androidx.annotation.b int i10) {
        m3(i.d(this.J3, i10));
    }

    public float o1() {
        return this.f53607l4 ? S() : this.I;
    }

    @Deprecated
    public void o2(boolean z10) {
        u2(z10);
    }

    public void o3(float f10) {
        if (this.f53609p2 != f10) {
            float fR0 = R0();
            this.f53609p2 = f10;
            float fR1 = R0();
            invalidateSelf();
            if (fR0 != fR1) {
                j2();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (M3()) {
            zOnLayoutDirectionChanged |= d.m(this.O, i10);
        }
        if (L3()) {
            zOnLayoutDirectionChanged |= d.m(this.f53593a0, i10);
        }
        if (N3()) {
            zOnLayoutDirectionChanged |= d.m(this.T, i10);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        boolean zOnLevelChange = super.onLevelChange(i10);
        if (M3()) {
            zOnLevelChange |= this.O.setLevel(i10);
        }
        if (L3()) {
            zOnLevelChange |= this.f53593a0.setLevel(i10);
        }
        if (N3()) {
            zOnLevelChange |= this.T.setLevel(i10);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable, com.google.android.material.internal.z.b
    public boolean onStateChange(@n0 int[] iArr) {
        if (this.f53607l4) {
            super.onStateChange(iArr);
        }
        return k2(iArr, D1());
    }

    public float p1() {
        return this.G3;
    }

    @Deprecated
    public void p2(@h int i10) {
        u2(this.J3.getResources().getBoolean(i10));
    }

    public void p3(@q int i10) {
        o3(this.J3.getResources().getDimension(i10));
    }

    @p0
    public Drawable q1() {
        Drawable drawable = this.O;
        if (drawable != null) {
            return d.q(drawable);
        }
        return null;
    }

    public void q2(@v int i10) {
        n2(b0.a.b(this.J3, i10));
    }

    public void q3(float f10) {
        if (this.f53613y1 != f10) {
            float fR0 = R0();
            this.f53613y1 = f10;
            float fR1 = R0();
            invalidateSelf();
            if (fR0 != fR1) {
                j2();
            }
        }
    }

    public float r1() {
        return this.Q;
    }

    public void r2(@p0 ColorStateList colorStateList) {
        if (this.f53595b0 != colorStateList) {
            this.f53595b0 = colorStateList;
            if (Z0()) {
                d.o(this.f53593a0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void r3(@q int i10) {
        q3(this.J3.getResources().getDimension(i10));
    }

    @p0
    public ColorStateList s1() {
        return this.P;
    }

    public void s2(@n int i10) {
        r2(b0.a.a(this.J3, i10));
    }

    public void s3(@t0 int i10) {
        this.f53606k4 = i10;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@n0 Drawable drawable, @n0 Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.Z3 != i10) {
            this.Z3 = i10;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
    public void setColorFilter(@p0 ColorFilter colorFilter) {
        if (this.f53594a4 != colorFilter) {
            this.f53594a4 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTintList(@p0 ColorStateList colorStateList) {
        if (this.f53598c4 != colorStateList) {
            this.f53598c4 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTintMode(@n0 PorterDuff.Mode mode) {
        if (this.f53599d4 != mode) {
            this.f53599d4 = mode;
            this.f53596b4 = e9.a.k(this, this.f53598c4, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (M3()) {
            visible |= this.O.setVisible(z10, z11);
        }
        if (L3()) {
            visible |= this.f53593a0.setVisible(z10, z11);
        }
        if (N3()) {
            visible |= this.T.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public float t1() {
        return this.H;
    }

    public void t2(@h int i10) {
        u2(this.J3.getResources().getBoolean(i10));
    }

    public void t3(@p0 ColorStateList colorStateList) {
        if (this.L != colorStateList) {
            this.L = colorStateList;
            P3();
            onStateChange(getState());
        }
    }

    public float u1() {
        return this.f53611x1;
    }

    public void u2(boolean z10) {
        if (this.Z != z10) {
            boolean zL3 = L3();
            this.Z = z10;
            boolean zL4 = L3();
            if (zL3 != zL4) {
                if (zL4) {
                    P0(this.f53593a0);
                } else {
                    O3(this.f53593a0);
                }
                invalidateSelf();
                j2();
            }
        }
    }

    public void u3(@n int i10) {
        t3(b0.a.a(this.J3, i10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@n0 Drawable drawable, @n0 Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    @p0
    public ColorStateList v1() {
        return this.J;
    }

    public void v2(@p0 ColorStateList colorStateList) {
        if (this.G != colorStateList) {
            this.G = colorStateList;
            onStateChange(getState());
        }
    }

    void v3(boolean z10) {
        this.f53605j4 = z10;
    }

    public float w1() {
        return this.K;
    }

    public void w2(@n int i10) {
        v2(b0.a.a(this.J3, i10));
    }

    public void w3(@p0 i iVar) {
        this.f53597c0 = iVar;
    }

    public void x1(@n0 RectF rectF) {
        S0(getBounds(), rectF);
    }

    @Deprecated
    public void x2(float f10) {
        if (this.I != f10) {
            this.I = f10;
            setShapeAppearanceModel(getShapeAppearanceModel().w(f10));
        }
    }

    public void x3(@androidx.annotation.b int i10) {
        w3(i.d(this.J3, i10));
    }

    @p0
    public Drawable y1() {
        Drawable drawable = this.T;
        if (drawable != null) {
            return d.q(drawable);
        }
        return null;
    }

    @Deprecated
    public void y2(@q int i10) {
        x2(this.J3.getResources().getDimension(i10));
    }

    public void y3(@p0 CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.M, charSequence)) {
            return;
        }
        this.M = charSequence;
        this.Q3.j(true);
        invalidateSelf();
        j2();
    }

    @p0
    public CharSequence z1() {
        return this.X;
    }

    public void z2(float f10) {
        if (this.G3 != f10) {
            this.G3 = f10;
            invalidateSelf();
            j2();
        }
    }

    public void z3(@p0 com.google.android.material.resources.d dVar) {
        this.Q3.i(dVar, this.J3);
    }
}
