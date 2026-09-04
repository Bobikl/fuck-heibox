package com.google.android.material.card;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import androidx.annotation.e1;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.annotation.w0;
import androidx.annotation.x;
import androidx.core.graphics.drawable.d;
import androidx.core.view.j1;
import androidx.core.view.n;
import com.google.android.material.R;
import com.google.android.material.color.m;
import com.google.android.material.resources.c;
import com.google.android.material.shape.f;
import com.google.android.material.shape.g;
import com.google.android.material.shape.k;
import com.google.android.material.shape.o;
import com.google.android.material.shape.p;

/* JADX INFO: compiled from: MaterialCardViewHelper.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class b {
    private static final double A = Math.cos(Math.toRadians(45.0d));
    private static final float B = 1.5f;
    private static final int C = 2;
    private static final Drawable D;
    public static final int E = 300;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f53430z = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final MaterialCardView f53431a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    private final k f53433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    private final k f53434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @r
    private int f53435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @r
    private int f53436f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f53437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @r
    private int f53438h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private Drawable f53439i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private Drawable f53440j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private ColorStateList f53441k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private ColorStateList f53442l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private p f53443m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private ColorStateList f53444n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @p0
    private Drawable f53445o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private LayerDrawable f53446p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @p0
    private k f53447q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @p0
    private k f53448r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f53450t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @p0
    private ValueAnimator f53451u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final TimeInterpolator f53452v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f53453w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f53454x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final Rect f53432b = new Rect();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f53449s = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f53455y = 0.0f;

    /* JADX INFO: compiled from: MaterialCardViewHelper.java */
    public class a extends InsetDrawable {
        a(Drawable drawable, int i10, int i11, int i12, int i13) {
            super(drawable, i10, i11, i12, i13);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        D = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public b(@n0 MaterialCardView materialCardView, AttributeSet attributeSet, int i10, @e1 int i11) {
        this.f53431a = materialCardView;
        k kVar = new k(materialCardView.getContext(), attributeSet, i10, i11);
        this.f53433c = kVar;
        kVar.Z(materialCardView.getContext());
        kVar.v0(-12303292);
        p.b bVarV = kVar.getShapeAppearanceModel().v();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, R.styleable.A, i10, R.style.CardView);
        int i12 = R.styleable.CardView_cardCornerRadius;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            bVarV.o(typedArrayObtainStyledAttributes.getDimension(i12, 0.0f));
        }
        this.f53434d = new k();
        Z(bVarV.m());
        this.f53452v = i9.a.g(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, com.google.android.material.animation.b.f52896a);
        this.f53453w = i9.a.f(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.f53454x = i9.a.f(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    @n0
    private Drawable D(Drawable drawable) {
        int iCeil;
        int i10;
        if (this.f53431a.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil(f());
            iCeil = (int) Math.ceil(e());
            i10 = iCeil2;
        } else {
            iCeil = 0;
            i10 = 0;
        }
        return new a(drawable, iCeil, i10, iCeil, i10);
    }

    private boolean G() {
        return (this.f53437g & 80) == 80;
    }

    private boolean H() {
        return (this.f53437g & n.f21702c) == 8388613;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f53440j.setAlpha((int) (255.0f * fFloatValue));
        this.f53455y = fFloatValue;
    }

    private float c() {
        return Math.max(Math.max(d(this.f53443m.q(), this.f53433c.S()), d(this.f53443m.s(), this.f53433c.T())), Math.max(d(this.f53443m.k(), this.f53433c.u()), d(this.f53443m.i(), this.f53433c.t())));
    }

    private float d(f fVar, float f10) {
        if (fVar instanceof o) {
            return (float) ((1.0d - A) * ((double) f10));
        }
        if (fVar instanceof g) {
            return f10 / 2.0f;
        }
        return 0.0f;
    }

    private boolean d0() {
        return this.f53431a.getPreventCornerOverlap() && !g();
    }

    private float e() {
        return this.f53431a.getMaxCardElevation() + (e0() ? c() : 0.0f);
    }

    private boolean e0() {
        return this.f53431a.getPreventCornerOverlap() && g() && this.f53431a.getUseCompatPadding();
    }

    private float f() {
        return (this.f53431a.getMaxCardElevation() * B) + (e0() ? c() : 0.0f);
    }

    private boolean g() {
        return this.f53433c.e0();
    }

    @n0
    private Drawable h() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        k kVarJ = j();
        this.f53447q = kVarJ;
        kVarJ.o0(this.f53441k);
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, this.f53447q);
        return stateListDrawable;
    }

    @n0
    private Drawable i() {
        if (!com.google.android.material.ripple.b.f54876a) {
            return h();
        }
        this.f53448r = j();
        return new RippleDrawable(this.f53441k, null, this.f53448r);
    }

    private void i0(Drawable drawable) {
        if (this.f53431a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f53431a.getForeground()).setDrawable(drawable);
        } else {
            this.f53431a.setForeground(D(drawable));
        }
    }

    @n0
    private k j() {
        return new k(this.f53443m);
    }

    private void k0() {
        Drawable drawable;
        if (com.google.android.material.ripple.b.f54876a && (drawable = this.f53445o) != null) {
            ((RippleDrawable) drawable).setColor(this.f53441k);
            return;
        }
        k kVar = this.f53447q;
        if (kVar != null) {
            kVar.o0(this.f53441k);
        }
    }

    @n0
    private Drawable t() {
        if (this.f53445o == null) {
            this.f53445o = i();
        }
        if (this.f53446p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f53445o, this.f53434d, this.f53440j});
            this.f53446p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f53446p;
    }

    private float v() {
        if (this.f53431a.getPreventCornerOverlap() && this.f53431a.getUseCompatPadding()) {
            return (float) ((1.0d - A) * ((double) this.f53431a.getCardViewRadius()));
        }
        return 0.0f;
    }

    @p0
    ColorStateList A() {
        return this.f53444n;
    }

    @r
    int B() {
        return this.f53438h;
    }

    @n0
    Rect C() {
        return this.f53432b;
    }

    boolean E() {
        return this.f53449s;
    }

    boolean F() {
        return this.f53450t;
    }

    void J(@n0 TypedArray typedArray) {
        ColorStateList colorStateListA = c.a(this.f53431a.getContext(), typedArray, R.styleable.MaterialCardView_strokeColor);
        this.f53444n = colorStateListA;
        if (colorStateListA == null) {
            this.f53444n = ColorStateList.valueOf(-1);
        }
        this.f53438h = typedArray.getDimensionPixelSize(R.styleable.MaterialCardView_strokeWidth, 0);
        boolean z10 = typedArray.getBoolean(R.styleable.MaterialCardView_android_checkable, false);
        this.f53450t = z10;
        this.f53431a.setLongClickable(z10);
        this.f53442l = c.a(this.f53431a.getContext(), typedArray, R.styleable.MaterialCardView_checkedIconTint);
        R(c.e(this.f53431a.getContext(), typedArray, R.styleable.MaterialCardView_checkedIcon));
        U(typedArray.getDimensionPixelSize(R.styleable.MaterialCardView_checkedIconSize, 0));
        T(typedArray.getDimensionPixelSize(R.styleable.MaterialCardView_checkedIconMargin, 0));
        this.f53437g = typedArray.getInteger(R.styleable.MaterialCardView_checkedIconGravity, 8388661);
        ColorStateList colorStateListA2 = c.a(this.f53431a.getContext(), typedArray, R.styleable.MaterialCardView_rippleColor);
        this.f53441k = colorStateListA2;
        if (colorStateListA2 == null) {
            this.f53441k = ColorStateList.valueOf(m.d(this.f53431a, R.attr.colorControlHighlight));
        }
        N(c.a(this.f53431a.getContext(), typedArray, R.styleable.MaterialCardView_cardForegroundColor));
        k0();
        h0();
        l0();
        this.f53431a.setBackgroundInternal(D(this.f53433c));
        Drawable drawableT = this.f53431a.isClickable() ? t() : this.f53434d;
        this.f53439i = drawableT;
        this.f53431a.setForeground(D(drawableT));
    }

    void K(int i10, int i11) {
        int iCeil;
        int i12;
        int i13;
        if (this.f53446p != null) {
            int iCeil2 = 0;
            if (this.f53431a.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(f() * 2.0f);
                iCeil2 = (int) Math.ceil(e() * 2.0f);
            } else {
                iCeil = 0;
            }
            int i14 = H() ? ((i10 - this.f53435e) - this.f53436f) - iCeil2 : this.f53435e;
            int i15 = G() ? this.f53435e : ((i11 - this.f53435e) - this.f53436f) - iCeil;
            int i16 = H() ? this.f53435e : ((i10 - this.f53435e) - this.f53436f) - iCeil2;
            int i17 = G() ? ((i11 - this.f53435e) - this.f53436f) - iCeil : this.f53435e;
            if (j1.Z(this.f53431a) == 1) {
                i13 = i16;
                i12 = i14;
            } else {
                i12 = i16;
                i13 = i14;
            }
            this.f53446p.setLayerInset(2, i13, i17, i12, i15);
        }
    }

    void L(boolean z10) {
        this.f53449s = z10;
    }

    void M(ColorStateList colorStateList) {
        this.f53433c.o0(colorStateList);
    }

    void N(@p0 ColorStateList colorStateList) {
        k kVar = this.f53434d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        kVar.o0(colorStateList);
    }

    void O(boolean z10) {
        this.f53450t = z10;
    }

    public void P(boolean z10) {
        Q(z10, false);
    }

    public void Q(boolean z10, boolean z11) {
        Drawable drawable = this.f53440j;
        if (drawable != null) {
            if (z11) {
                b(z10);
            } else {
                drawable.setAlpha(z10 ? 255 : 0);
                this.f53455y = z10 ? 1.0f : 0.0f;
            }
        }
    }

    void R(@p0 Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = d.r(drawable).mutate();
            this.f53440j = drawableMutate;
            d.o(drawableMutate, this.f53442l);
            P(this.f53431a.isChecked());
        } else {
            this.f53440j = D;
        }
        LayerDrawable layerDrawable = this.f53446p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f53440j);
        }
    }

    void S(int i10) {
        this.f53437g = i10;
        K(this.f53431a.getMeasuredWidth(), this.f53431a.getMeasuredHeight());
    }

    void T(@r int i10) {
        this.f53435e = i10;
    }

    void U(@r int i10) {
        this.f53436f = i10;
    }

    void V(@p0 ColorStateList colorStateList) {
        this.f53442l = colorStateList;
        Drawable drawable = this.f53440j;
        if (drawable != null) {
            d.o(drawable, colorStateList);
        }
    }

    void W(float f10) {
        Z(this.f53443m.w(f10));
        this.f53439i.invalidateSelf();
        if (e0() || d0()) {
            g0();
        }
        if (e0()) {
            j0();
        }
    }

    void X(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        this.f53433c.p0(f10);
        k kVar = this.f53434d;
        if (kVar != null) {
            kVar.p0(f10);
        }
        k kVar2 = this.f53448r;
        if (kVar2 != null) {
            kVar2.p0(f10);
        }
    }

    void Y(@p0 ColorStateList colorStateList) {
        this.f53441k = colorStateList;
        k0();
    }

    void Z(@n0 p pVar) {
        this.f53443m = pVar;
        this.f53433c.setShapeAppearanceModel(pVar);
        k kVar = this.f53433c;
        kVar.u0(!kVar.e0());
        k kVar2 = this.f53434d;
        if (kVar2 != null) {
            kVar2.setShapeAppearanceModel(pVar);
        }
        k kVar3 = this.f53448r;
        if (kVar3 != null) {
            kVar3.setShapeAppearanceModel(pVar);
        }
        k kVar4 = this.f53447q;
        if (kVar4 != null) {
            kVar4.setShapeAppearanceModel(pVar);
        }
    }

    void a0(ColorStateList colorStateList) {
        if (this.f53444n == colorStateList) {
            return;
        }
        this.f53444n = colorStateList;
        l0();
    }

    public void b(boolean z10) {
        float f10 = z10 ? 1.0f : 0.0f;
        float f11 = z10 ? 1.0f - this.f53455y : this.f53455y;
        ValueAnimator valueAnimator = this.f53451u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f53451u = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f53455y, f10);
        this.f53451u = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.card.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f53429b.I(valueAnimator2);
            }
        });
        this.f53451u.setInterpolator(this.f53452v);
        this.f53451u.setDuration((long) ((z10 ? this.f53453w : this.f53454x) * f11));
        this.f53451u.start();
    }

    void b0(@r int i10) {
        if (i10 == this.f53438h) {
            return;
        }
        this.f53438h = i10;
        l0();
    }

    void c0(int i10, int i11, int i12, int i13) {
        this.f53432b.set(i10, i11, i12, i13);
        g0();
    }

    void f0() {
        Drawable drawable = this.f53439i;
        Drawable drawableT = this.f53431a.isClickable() ? t() : this.f53434d;
        this.f53439i = drawableT;
        if (drawable != drawableT) {
            i0(drawableT);
        }
    }

    void g0() {
        int iC = (int) ((d0() || e0() ? c() : 0.0f) - v());
        MaterialCardView materialCardView = this.f53431a;
        Rect rect = this.f53432b;
        materialCardView.l(rect.left + iC, rect.top + iC, rect.right + iC, rect.bottom + iC);
    }

    void h0() {
        this.f53433c.n0(this.f53431a.getCardElevation());
    }

    void j0() {
        if (!E()) {
            this.f53431a.setBackgroundInternal(D(this.f53433c));
        }
        this.f53431a.setForeground(D(this.f53439i));
    }

    @w0(api = 23)
    void k() {
        Drawable drawable = this.f53445o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i10 = bounds.bottom;
            this.f53445o.setBounds(bounds.left, bounds.top, bounds.right, i10 - 1);
            this.f53445o.setBounds(bounds.left, bounds.top, bounds.right, i10);
        }
    }

    @n0
    k l() {
        return this.f53433c;
    }

    void l0() {
        this.f53434d.E0(this.f53438h, this.f53444n);
    }

    ColorStateList m() {
        return this.f53433c.y();
    }

    ColorStateList n() {
        return this.f53434d.y();
    }

    @p0
    Drawable o() {
        return this.f53440j;
    }

    int p() {
        return this.f53437g;
    }

    @r
    int q() {
        return this.f53435e;
    }

    @r
    int r() {
        return this.f53436f;
    }

    @p0
    ColorStateList s() {
        return this.f53442l;
    }

    float u() {
        return this.f53433c.S();
    }

    @x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a)
    float w() {
        return this.f53433c.z();
    }

    @p0
    ColorStateList x() {
        return this.f53441k;
    }

    p y() {
        return this.f53443m;
    }

    @l
    int z() {
        ColorStateList colorStateList = this.f53444n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }
}
