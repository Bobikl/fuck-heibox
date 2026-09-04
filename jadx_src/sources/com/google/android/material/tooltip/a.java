package com.google.android.material.tooltip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.annotation.d1;
import androidx.annotation.e1;
import androidx.annotation.f;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.annotation.x;
import androidx.core.graphics.f0;
import com.google.android.material.R;
import com.google.android.material.animation.b;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.z;
import com.google.android.material.resources.c;
import com.google.android.material.resources.d;
import com.google.android.material.shape.h;
import com.google.android.material.shape.j;
import com.google.android.material.shape.k;
import com.google.android.material.shape.m;

/* JADX INFO: compiled from: TooltipDrawable.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class a extends k implements z.b {

    @e1
    private static final int W = R.style.Widget_MaterialComponents_Tooltip;

    @f
    private static final int X = R.attr.tooltipStyle;

    @p0
    private CharSequence F;

    @n0
    private final Context G;

    @p0
    private final Paint.FontMetrics H;

    @n0
    private final z I;

    @n0
    private final View.OnLayoutChangeListener J;

    @n0
    private final Rect K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private float R;
    private float S;
    private final float T;
    private float U;
    private float V;

    /* JADX INFO: renamed from: com.google.android.material.tooltip.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TooltipDrawable.java */
    public class ViewOnLayoutChangeListenerC0433a implements View.OnLayoutChangeListener {
        ViewOnLayoutChangeListenerC0433a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            a.this.r1(view);
        }
    }

    private a(@n0 Context context, AttributeSet attributeSet, @f int i10, @e1 int i11) {
        super(context, attributeSet, i10, i11);
        this.H = new Paint.FontMetrics();
        z zVar = new z(this);
        this.I = zVar;
        this.J = new ViewOnLayoutChangeListenerC0433a();
        this.K = new Rect();
        this.R = 1.0f;
        this.S = 1.0f;
        this.T = 0.5f;
        this.U = 0.5f;
        this.V = 1.0f;
        this.G = context;
        zVar.e().density = context.getResources().getDisplayMetrics().density;
        zVar.e().setTextAlign(Paint.Align.CENTER);
    }

    private float Q0() {
        int i10;
        if (((this.K.right - getBounds().right) - this.Q) - this.O < 0) {
            i10 = ((this.K.right - getBounds().right) - this.Q) - this.O;
        } else {
            if (((this.K.left - getBounds().left) - this.Q) + this.O <= 0) {
                return 0.0f;
            }
            i10 = ((this.K.left - getBounds().left) - this.Q) + this.O;
        }
        return i10;
    }

    private float R0() {
        this.I.e().getFontMetrics(this.H);
        Paint.FontMetrics fontMetrics = this.H;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private float S0(@n0 Rect rect) {
        return rect.centerY() - R0();
    }

    @n0
    public static a T0(@n0 Context context) {
        return V0(context, null, X, W);
    }

    @n0
    public static a U0(@n0 Context context, @p0 AttributeSet attributeSet) {
        return V0(context, attributeSet, X, W);
    }

    @n0
    public static a V0(@n0 Context context, @p0 AttributeSet attributeSet, @f int i10, @e1 int i11) {
        a aVar = new a(context, attributeSet, i10, i11);
        aVar.g1(attributeSet, i10, i11);
        return aVar;
    }

    private h W0() {
        float f10 = -Q0();
        float fWidth = ((float) (((double) getBounds().width()) - (((double) this.P) * Math.sqrt(2.0d)))) / 2.0f;
        return new m(new j(this.P), Math.min(Math.max(f10, -fWidth), fWidth));
    }

    private void Y0(@n0 Canvas canvas) {
        if (this.F == null) {
            return;
        }
        Rect bounds = getBounds();
        int iS0 = (int) S0(bounds);
        if (this.I.d() != null) {
            this.I.e().drawableState = getState();
            this.I.k(this.G);
            this.I.e().setAlpha((int) (this.V * 255.0f));
        }
        CharSequence charSequence = this.F;
        canvas.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), iS0, this.I.e());
    }

    private float f1() {
        CharSequence charSequence = this.F;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.I.f(charSequence.toString());
    }

    private void g1(@p0 AttributeSet attributeSet, @f int i10, @e1 int i11) {
        TypedArray typedArrayK = c0.k(this.G, attributeSet, R.styleable.E1, i10, i11, new int[0]);
        this.P = this.G.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
        setShapeAppearanceModel(getShapeAppearanceModel().v().t(W0()).m());
        m1(typedArrayK.getText(R.styleable.Tooltip_android_text));
        d dVarG = c.g(this.G, typedArrayK, R.styleable.Tooltip_android_textAppearance);
        if (dVarG != null) {
            int i12 = R.styleable.Tooltip_android_textColor;
            if (typedArrayK.hasValue(i12)) {
                dVarG.k(c.a(this.G, typedArrayK, i12));
            }
        }
        n1(dVarG);
        o0(ColorStateList.valueOf(typedArrayK.getColor(R.styleable.Tooltip_backgroundTint, com.google.android.material.color.m.n(f0.B(com.google.android.material.color.m.c(this.G, android.R.attr.colorBackground, a.class.getCanonicalName()), bb.c.b.f30985v1), f0.B(com.google.android.material.color.m.c(this.G, R.attr.colorOnBackground, a.class.getCanonicalName()), 153)))));
        F0(ColorStateList.valueOf(com.google.android.material.color.m.c(this.G, R.attr.colorSurface, a.class.getCanonicalName())));
        this.L = typedArrayK.getDimensionPixelSize(R.styleable.Tooltip_android_padding, 0);
        this.M = typedArrayK.getDimensionPixelSize(R.styleable.Tooltip_android_minWidth, 0);
        this.N = typedArrayK.getDimensionPixelSize(R.styleable.Tooltip_android_minHeight, 0);
        this.O = typedArrayK.getDimensionPixelSize(R.styleable.Tooltip_android_layout_margin, 0);
        typedArrayK.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r1(@n0 View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.Q = iArr[0];
        view.getWindowVisibleDisplayFrame(this.K);
    }

    public void X0(@p0 View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.J);
    }

    public int Z0() {
        return this.O;
    }

    @Override // com.google.android.material.internal.z.b
    public void a() {
        invalidateSelf();
    }

    public int a1() {
        return this.N;
    }

    public int b1() {
        return this.M;
    }

    @p0
    public CharSequence c1() {
        return this.F;
    }

    @p0
    public d d1() {
        return this.I.d();
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
    public void draw(@n0 Canvas canvas) {
        canvas.save();
        float fQ0 = Q0();
        float f10 = (float) (-((((double) this.P) * Math.sqrt(2.0d)) - ((double) this.P)));
        canvas.scale(this.R, this.S, getBounds().left + (getBounds().width() * 0.5f), getBounds().top + (getBounds().height() * this.U));
        canvas.translate(fQ0, f10);
        super.draw(canvas);
        Y0(canvas);
        canvas.restore();
    }

    public int e1() {
        return this.L;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.I.e().getTextSize(), this.N);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.L * 2) + f1(), this.M);
    }

    public void h1(@t0 int i10) {
        this.O = i10;
        invalidateSelf();
    }

    public void i1(@t0 int i10) {
        this.N = i10;
        invalidateSelf();
    }

    public void j1(@t0 int i10) {
        this.M = i10;
        invalidateSelf();
    }

    public void k1(@p0 View view) {
        if (view == null) {
            return;
        }
        r1(view);
        view.addOnLayoutChangeListener(this.J);
    }

    public void l1(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        this.U = 1.2f;
        this.R = f10;
        this.S = f10;
        this.V = b.b(0.0f, 1.0f, 0.19f, 1.0f, f10);
        invalidateSelf();
    }

    public void m1(@p0 CharSequence charSequence) {
        if (TextUtils.equals(this.F, charSequence)) {
            return;
        }
        this.F = charSequence;
        this.I.j(true);
        invalidateSelf();
    }

    public void n1(@p0 d dVar) {
        this.I.i(dVar, this.G);
    }

    public void o1(@e1 int i10) {
        n1(new d(this.G, i10));
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setShapeAppearanceModel(getShapeAppearanceModel().v().t(W0()).m());
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable, com.google.android.material.internal.z.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void p1(@t0 int i10) {
        this.L = i10;
        invalidateSelf();
    }

    public void q1(@d1 int i10) {
        m1(this.G.getResources().getString(i10));
    }
}
