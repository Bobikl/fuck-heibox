package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.RestrictTo;
import androidx.annotation.k;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.core.graphics.drawable.d;
import androidx.core.view.j1;
import com.google.android.material.R;
import com.google.android.material.color.m;
import com.google.android.material.internal.j0;
import com.google.android.material.resources.c;
import com.google.android.material.ripple.b;
import com.google.android.material.shape.p;
import com.google.android.material.shape.t;

/* JADX INFO: compiled from: MaterialButtonHelper.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @k(api = 21)
    private static final boolean f53392u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final boolean f53393v = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaterialButton f53394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private p f53395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f53396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f53397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f53398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f53399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f53400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f53401h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private PorterDuff.Mode f53402i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private ColorStateList f53403j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private ColorStateList f53404k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private ColorStateList f53405l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private Drawable f53406m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f53410q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private LayerDrawable f53412s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f53413t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f53407n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f53408o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f53409p = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f53411r = true;

    a(MaterialButton materialButton, @n0 p pVar) {
        this.f53394a = materialButton;
        this.f53395b = pVar;
    }

    private void G(@r int i10, @r int i11) {
        int iK0 = j1.k0(this.f53394a);
        int paddingTop = this.f53394a.getPaddingTop();
        int iJ0 = j1.j0(this.f53394a);
        int paddingBottom = this.f53394a.getPaddingBottom();
        int i12 = this.f53398e;
        int i13 = this.f53399f;
        this.f53399f = i11;
        this.f53398e = i10;
        if (!this.f53408o) {
            H();
        }
        j1.d2(this.f53394a, iK0, (paddingTop + i10) - i12, iJ0, (paddingBottom + i11) - i13);
    }

    private void H() {
        this.f53394a.setInternalBackground(a());
        com.google.android.material.shape.k kVarF = f();
        if (kVarF != null) {
            kVarF.n0(this.f53413t);
            kVarF.setState(this.f53394a.getDrawableState());
        }
    }

    private void I(@n0 p pVar) {
        if (f53393v && !this.f53408o) {
            int iK0 = j1.k0(this.f53394a);
            int paddingTop = this.f53394a.getPaddingTop();
            int iJ0 = j1.j0(this.f53394a);
            int paddingBottom = this.f53394a.getPaddingBottom();
            H();
            j1.d2(this.f53394a, iK0, paddingTop, iJ0, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(pVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(pVar);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(pVar);
        }
    }

    private void K() {
        com.google.android.material.shape.k kVarF = f();
        com.google.android.material.shape.k kVarN = n();
        if (kVarF != null) {
            kVarF.E0(this.f53401h, this.f53404k);
            if (kVarN != null) {
                kVarN.D0(this.f53401h, this.f53407n ? m.d(this.f53394a, R.attr.colorSurface) : 0);
            }
        }
    }

    @n0
    private InsetDrawable L(Drawable drawable) {
        return new InsetDrawable(drawable, this.f53396c, this.f53398e, this.f53397d, this.f53399f);
    }

    private Drawable a() {
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k(this.f53395b);
        kVar.Z(this.f53394a.getContext());
        d.o(kVar, this.f53403j);
        PorterDuff.Mode mode = this.f53402i;
        if (mode != null) {
            d.p(kVar, mode);
        }
        kVar.E0(this.f53401h, this.f53404k);
        com.google.android.material.shape.k kVar2 = new com.google.android.material.shape.k(this.f53395b);
        kVar2.setTint(0);
        kVar2.D0(this.f53401h, this.f53407n ? m.d(this.f53394a, R.attr.colorSurface) : 0);
        if (f53392u) {
            com.google.android.material.shape.k kVar3 = new com.google.android.material.shape.k(this.f53395b);
            this.f53406m = kVar3;
            d.n(kVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(b.e(this.f53405l), L(new LayerDrawable(new Drawable[]{kVar2, kVar})), this.f53406m);
            this.f53412s = rippleDrawable;
            return rippleDrawable;
        }
        com.google.android.material.ripple.a aVar = new com.google.android.material.ripple.a(this.f53395b);
        this.f53406m = aVar;
        d.o(aVar, b.e(this.f53405l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{kVar2, kVar, this.f53406m});
        this.f53412s = layerDrawable;
        return L(layerDrawable);
    }

    @p0
    private com.google.android.material.shape.k g(boolean z10) {
        LayerDrawable layerDrawable = this.f53412s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f53392u ? (com.google.android.material.shape.k) ((LayerDrawable) ((InsetDrawable) this.f53412s.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0) : (com.google.android.material.shape.k) this.f53412s.getDrawable(!z10 ? 1 : 0);
    }

    @p0
    private com.google.android.material.shape.k n() {
        return g(true);
    }

    void A(boolean z10) {
        this.f53407n = z10;
        K();
    }

    void B(@p0 ColorStateList colorStateList) {
        if (this.f53404k != colorStateList) {
            this.f53404k = colorStateList;
            K();
        }
    }

    void C(int i10) {
        if (this.f53401h != i10) {
            this.f53401h = i10;
            K();
        }
    }

    void D(@p0 ColorStateList colorStateList) {
        if (this.f53403j != colorStateList) {
            this.f53403j = colorStateList;
            if (f() != null) {
                d.o(f(), this.f53403j);
            }
        }
    }

    void E(@p0 PorterDuff.Mode mode) {
        if (this.f53402i != mode) {
            this.f53402i = mode;
            if (f() == null || this.f53402i == null) {
                return;
            }
            d.p(f(), this.f53402i);
        }
    }

    void F(boolean z10) {
        this.f53411r = z10;
    }

    void J(int i10, int i11) {
        Drawable drawable = this.f53406m;
        if (drawable != null) {
            drawable.setBounds(this.f53396c, this.f53398e, i11 - this.f53397d, i10 - this.f53399f);
        }
    }

    int b() {
        return this.f53400g;
    }

    public int c() {
        return this.f53399f;
    }

    public int d() {
        return this.f53398e;
    }

    @p0
    public t e() {
        LayerDrawable layerDrawable = this.f53412s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f53412s.getNumberOfLayers() > 2 ? (t) this.f53412s.getDrawable(2) : (t) this.f53412s.getDrawable(1);
    }

    @p0
    com.google.android.material.shape.k f() {
        return g(false);
    }

    @p0
    ColorStateList h() {
        return this.f53405l;
    }

    @n0
    p i() {
        return this.f53395b;
    }

    @p0
    ColorStateList j() {
        return this.f53404k;
    }

    int k() {
        return this.f53401h;
    }

    ColorStateList l() {
        return this.f53403j;
    }

    PorterDuff.Mode m() {
        return this.f53402i;
    }

    boolean o() {
        return this.f53408o;
    }

    boolean p() {
        return this.f53410q;
    }

    boolean q() {
        return this.f53411r;
    }

    void r(@n0 TypedArray typedArray) {
        this.f53396c = typedArray.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetLeft, 0);
        this.f53397d = typedArray.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetRight, 0);
        this.f53398e = typedArray.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetTop, 0);
        this.f53399f = typedArray.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetBottom, 0);
        int i10 = R.styleable.MaterialButton_cornerRadius;
        if (typedArray.hasValue(i10)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i10, -1);
            this.f53400g = dimensionPixelSize;
            z(this.f53395b.w(dimensionPixelSize));
            this.f53409p = true;
        }
        this.f53401h = typedArray.getDimensionPixelSize(R.styleable.MaterialButton_strokeWidth, 0);
        this.f53402i = j0.r(typedArray.getInt(R.styleable.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f53403j = c.a(this.f53394a.getContext(), typedArray, R.styleable.MaterialButton_backgroundTint);
        this.f53404k = c.a(this.f53394a.getContext(), typedArray, R.styleable.MaterialButton_strokeColor);
        this.f53405l = c.a(this.f53394a.getContext(), typedArray, R.styleable.MaterialButton_rippleColor);
        this.f53410q = typedArray.getBoolean(R.styleable.MaterialButton_android_checkable, false);
        this.f53413t = typedArray.getDimensionPixelSize(R.styleable.MaterialButton_elevation, 0);
        this.f53411r = typedArray.getBoolean(R.styleable.MaterialButton_toggleCheckedStateOnClick, true);
        int iK0 = j1.k0(this.f53394a);
        int paddingTop = this.f53394a.getPaddingTop();
        int iJ0 = j1.j0(this.f53394a);
        int paddingBottom = this.f53394a.getPaddingBottom();
        if (typedArray.hasValue(R.styleable.MaterialButton_android_background)) {
            t();
        } else {
            H();
        }
        j1.d2(this.f53394a, iK0 + this.f53396c, paddingTop + this.f53398e, iJ0 + this.f53397d, paddingBottom + this.f53399f);
    }

    void s(int i10) {
        if (f() != null) {
            f().setTint(i10);
        }
    }

    void t() {
        this.f53408o = true;
        this.f53394a.setSupportBackgroundTintList(this.f53403j);
        this.f53394a.setSupportBackgroundTintMode(this.f53402i);
    }

    void u(boolean z10) {
        this.f53410q = z10;
    }

    void v(int i10) {
        if (this.f53409p && this.f53400g == i10) {
            return;
        }
        this.f53400g = i10;
        this.f53409p = true;
        z(this.f53395b.w(i10));
    }

    public void w(@r int i10) {
        G(this.f53398e, i10);
    }

    public void x(@r int i10) {
        G(i10, this.f53399f);
    }

    void y(@p0 ColorStateList colorStateList) {
        if (this.f53405l != colorStateList) {
            this.f53405l = colorStateList;
            boolean z10 = f53392u;
            if (z10 && (this.f53394a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f53394a.getBackground()).setColor(b.e(colorStateList));
            } else {
                if (z10 || !(this.f53394a.getBackground() instanceof com.google.android.material.ripple.a)) {
                    return;
                }
                ((com.google.android.material.ripple.a) this.f53394a.getBackground()).setTintList(b.e(colorStateList));
            }
        }
    }

    void z(@n0 p pVar) {
        this.f53395b = pVar;
        I(pVar);
    }
}
