package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.annotation.d1;
import androidx.annotation.e1;
import androidx.annotation.h;
import androidx.annotation.n;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.r;
import androidx.annotation.t0;
import androidx.annotation.v;
import androidx.annotation.w0;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.accessibility.a0;
import androidx.core.view.j1;
import com.google.android.material.R;
import com.google.android.material.animation.i;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.j0;
import com.google.android.material.internal.m;
import com.google.android.material.resources.d;
import com.google.android.material.resources.f;
import com.google.android.material.shape.l;
import com.google.android.material.shape.p;
import com.google.android.material.shape.t;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class Chip extends AppCompatCheckBox implements com.google.android.material.chip.b.a, t, m<Chip> {
    private static final int A = 0;
    private static final int B = 1;
    private static final String F = "http://schemas.android.com/apk/res/android";
    private static final int G = 48;
    private static final String H = "android.widget.Button";
    private static final String I = "android.widget.RadioButton";
    private static final String J = "android.view.View";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f53551y = "Chip";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private com.google.android.material.chip.b f53553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private InsetDrawable f53554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private RippleDrawable f53555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private View.OnClickListener f53556i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private CompoundButton.OnCheckedChangeListener f53557j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private m.a<Chip> f53558k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f53559l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f53560m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f53561n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f53562o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f53563p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f53564q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @r(unit = 1)
    private int f53565r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    private CharSequence f53566s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @n0
    private final c f53567t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f53568u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Rect f53569v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final RectF f53570w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final f f53571x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f53552z = R.style.Widget_MaterialComponents_Chip_Action;
    private static final Rect C = new Rect();
    private static final int[] D = {android.R.attr.state_selected};
    private static final int[] E = {android.R.attr.state_checkable};

    public class a extends f {
        a() {
        }

        @Override // com.google.android.material.resources.f
        public void a(int i10) {
        }

        @Override // com.google.android.material.resources.f
        public void b(@n0 Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            chip.setText(chip.f53553f.K3() ? Chip.this.f53553f.P1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    public class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, @n0 Outline outline) {
            if (Chip.this.f53553f != null) {
                Chip.this.f53553f.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    public class c extends androidx.customview.widget.a {
        c(Chip chip) {
            super(chip);
        }

        @Override // androidx.customview.widget.a
        protected boolean A(int i10, int i11, Bundle bundle) {
            if (i11 != 16) {
                return false;
            }
            if (i10 == 0) {
                return Chip.this.performClick();
            }
            if (i10 == 1) {
                return Chip.this.z();
            }
            return false;
        }

        @Override // androidx.customview.widget.a
        protected void D(@n0 a0 a0Var) {
            a0Var.Z0(Chip.this.r());
            a0Var.c1(Chip.this.isClickable());
            a0Var.b1(Chip.this.getAccessibilityClassName());
            a0Var.S1(Chip.this.getText());
        }

        @Override // androidx.customview.widget.a
        protected void E(int i10, @n0 a0 a0Var) {
            if (i10 != 1) {
                a0Var.f1("");
                a0Var.W0(Chip.C);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                a0Var.f1(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                Context context = Chip.this.getContext();
                int i11 = R.string.mtrl_chip_close_icon_content_description;
                Object[] objArr = new Object[1];
                objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                a0Var.f1(context.getString(i11, objArr).trim());
            }
            a0Var.W0(Chip.this.getCloseIconTouchBoundsInt());
            a0Var.b(a0.a.f21380j);
            a0Var.l1(Chip.this.isEnabled());
        }

        @Override // androidx.customview.widget.a
        protected void F(int i10, boolean z10) {
            if (i10 == 1) {
                Chip.this.f53562o = z10;
                Chip.this.refreshDrawableState();
            }
        }

        @Override // androidx.customview.widget.a
        protected int p(float f10, float f11) {
            return (Chip.this.n() && Chip.this.getCloseIconTouchBounds().contains(f10, f11)) ? 1 : 0;
        }

        @Override // androidx.customview.widget.a
        protected void q(@n0 List<Integer> list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.x() && Chip.this.f53556i != null) {
                list.add(1);
            }
        }
    }

    public Chip(Context context) {
        this(context, null);
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f53552z;
        super(j9.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f53569v = new Rect();
        this.f53570w = new RectF();
        this.f53571x = new a();
        Context context2 = getContext();
        I(attributeSet);
        com.google.android.material.chip.b bVarA1 = com.google.android.material.chip.b.a1(context2, attributeSet, i10, i11);
        o(context2, attributeSet, i10);
        setChipDrawable(bVarA1);
        bVarA1.n0(j1.R(this));
        TypedArray typedArrayK = c0.k(context2, attributeSet, R.styleable.C, i10, i11, new int[0]);
        boolean zHasValue = typedArrayK.hasValue(R.styleable.Chip_shapeAppearance);
        typedArrayK.recycle();
        this.f53567t = new c(this);
        D();
        if (!zHasValue) {
            p();
        }
        setChecked(this.f53559l);
        setText(bVarA1.P1());
        setEllipsize(bVarA1.I1());
        H();
        if (!this.f53553f.K3()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        G();
        if (B()) {
            setMinHeight(this.f53565r);
        }
        this.f53564q = j1.Z(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.google.android.material.chip.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                this.f53587b.y(compoundButton, z10);
            }
        });
    }

    private void A() {
        if (this.f53554g != null) {
            this.f53554g = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            E();
        }
    }

    private void C(@p0 com.google.android.material.chip.b bVar) {
        if (bVar != null) {
            bVar.k3(null);
        }
    }

    private void D() {
        if (n() && x() && this.f53556i != null) {
            j1.B1(this, this.f53567t);
            this.f53568u = true;
        } else {
            j1.B1(this, null);
            this.f53568u = false;
        }
    }

    private void E() {
        if (com.google.android.material.ripple.b.f54876a) {
            F();
            return;
        }
        this.f53553f.J3(true);
        j1.I1(this, getBackgroundDrawable());
        G();
        m();
    }

    private void F() {
        this.f53555h = new RippleDrawable(com.google.android.material.ripple.b.e(this.f53553f.N1()), getBackgroundDrawable(), null);
        this.f53553f.J3(false);
        j1.I1(this, this.f53555h);
        G();
    }

    private void G() {
        com.google.android.material.chip.b bVar;
        if (TextUtils.isEmpty(getText()) || (bVar = this.f53553f) == null) {
            return;
        }
        int iP1 = (int) (bVar.p1() + this.f53553f.R1() + this.f53553f.V0());
        int iU1 = (int) (this.f53553f.u1() + this.f53553f.S1() + this.f53553f.R0());
        if (this.f53554g != null) {
            Rect rect = new Rect();
            this.f53554g.getPadding(rect);
            iU1 += rect.left;
            iP1 += rect.right;
        }
        j1.d2(this, iU1, getPaddingTop(), iP1, getPaddingBottom());
    }

    private void H() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            paint.drawableState = bVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.f53571x);
        }
    }

    private void I(@p0 AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue(F, UiKitSpanObj.TYPE_BACKGROUND) != null) {
            Log.w(f53551y, "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue(F, "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue(F, "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue(F, "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue(F, "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue(F, "singleLine", true) || attributeSet.getAttributeIntValue(F, "lines", 1) != 1 || attributeSet.getAttributeIntValue(F, "minLines", 1) != 1 || attributeSet.getAttributeIntValue(F, "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue(F, "gravity", 8388627) != 8388627) {
            Log.w(f53551y, "Chip text must be vertically center and start aligned");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n0
    public RectF getCloseIconTouchBounds() {
        this.f53570w.setEmpty();
        if (n() && this.f53556i != null) {
            this.f53553f.F1(this.f53570w);
        }
        return this.f53570w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n0
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f53569v.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f53569v;
    }

    @p0
    private d getTextAppearance() {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            return bVar.Q1();
        }
        return null;
    }

    private void j(@n0 com.google.android.material.chip.b bVar) {
        bVar.k3(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    @n0
    private int[] k() {
        ?? IsEnabled = isEnabled();
        int i10 = IsEnabled;
        if (this.f53562o) {
            i10 = IsEnabled + 1;
        }
        int i11 = i10;
        if (this.f53561n) {
            i11 = i10 + 1;
        }
        int i12 = i11;
        if (this.f53560m) {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (isChecked()) {
            i13 = i12 + 1;
        }
        int[] iArr = new int[i13];
        int i14 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i14 = 1;
        }
        if (this.f53562o) {
            iArr[i14] = 16842908;
            i14++;
        }
        if (this.f53561n) {
            iArr[i14] = 16843623;
            i14++;
        }
        if (this.f53560m) {
            iArr[i14] = 16842919;
            i14++;
        }
        if (isChecked()) {
            iArr[i14] = 16842913;
        }
        return iArr;
    }

    private void m() {
        if (getBackgroundDrawable() == this.f53554g && this.f53553f.getCallback() == null) {
            this.f53553f.setCallback(this.f53554g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        com.google.android.material.chip.b bVar = this.f53553f;
        return (bVar == null || bVar.y1() == null) ? false : true;
    }

    private void o(Context context, @p0 AttributeSet attributeSet, int i10) {
        TypedArray typedArrayK = c0.k(context, attributeSet, R.styleable.C, i10, f53552z, new int[0]);
        this.f53563p = typedArrayK.getBoolean(R.styleable.Chip_ensureMinTouchTargetSize, false);
        this.f53565r = (int) Math.ceil(typedArrayK.getDimension(R.styleable.Chip_chipMinTouchTargetSize, (float) Math.ceil(j0.g(getContext(), 48))));
        typedArrayK.recycle();
    }

    private void p() {
        setOutlineProvider(new b());
    }

    private void q(int i10, int i11, int i12, int i13) {
        this.f53554g = new InsetDrawable((Drawable) this.f53553f, i10, i11, i12, i13);
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f53561n != z10) {
            this.f53561n = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f53560m != z10) {
            this.f53560m = z10;
            refreshDrawableState();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(CompoundButton compoundButton, boolean z10) {
        m.a<Chip> aVar = this.f53558k;
        if (aVar != null) {
            aVar.a(this, z10);
        }
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f53557j;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
        }
    }

    public boolean B() {
        return this.f53563p;
    }

    @Override // com.google.android.material.chip.b.a
    public void a() {
        l(this.f53565r);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(@n0 MotionEvent motionEvent) {
        if (this.f53568u) {
            return this.f53567t.i(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f53568u) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f53567t.j(keyEvent) || this.f53567t.o() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.b bVar = this.f53553f;
        if ((bVar == null || !bVar.c2()) ? false : this.f53553f.f3(k())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @n0
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f53566s)) {
            return this.f53566s;
        }
        if (!r()) {
            return isClickable() ? H : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).l()) ? I : H;
    }

    @p0
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f53554g;
        return insetDrawable == null ? this.f53553f : insetDrawable;
    }

    @p0
    public Drawable getCheckedIcon() {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            return bVar.l1();
        }
        return null;
    }

    @p0
    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            return bVar.m1();
        }
        return null;
    }

    @p0
    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            return bVar.n1();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            return Math.max(0.0f, bVar.o1());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f53553f;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            return bVar.p1();
        }
        return 0.0f;
    }

    @p0
    public Drawable getChipIcon() {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            return bVar.q1();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            return bVar.r1();
        }
        return 0.0f;
    }

    @p0
    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            return bVar.s1();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            return bVar.t1();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            return bVar.u1();
        }
        return 0.0f;
    }

    @p0
    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            return bVar.v1();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            return bVar.w1();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @p0
    public Drawable getCloseIcon() {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            return bVar.y1();
        }
        return null;
    }

    @p0
    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            return bVar.z1();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            return bVar.A1();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            return bVar.B1();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            return bVar.C1();
        }
        return 0.0f;
    }

    @p0
    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            return bVar.E1();
        }
        return null;
    }

    @Override // android.widget.TextView
    @p0
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            return bVar.I1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(@n0 Rect rect) {
        if (this.f53568u && (this.f53567t.o() == 1 || this.f53567t.k() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    @p0
    public i getHideMotionSpec() {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            return bVar.J1();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            return bVar.K1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            return bVar.L1();
        }
        return 0.0f;
    }

    @p0
    public ColorStateList getRippleColor() {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            return bVar.N1();
        }
        return null;
    }

    @Override // com.google.android.material.shape.t
    @n0
    public p getShapeAppearanceModel() {
        return this.f53553f.getShapeAppearanceModel();
    }

    @p0
    public i getShowMotionSpec() {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            return bVar.O1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            return bVar.R1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            return bVar.S1();
        }
        return 0.0f;
    }

    public boolean l(@r int i10) {
        this.f53565r = i10;
        if (!B()) {
            if (this.f53554g != null) {
                A();
            } else {
                E();
            }
            return false;
        }
        int iMax = Math.max(0, i10 - this.f53553f.getIntrinsicHeight());
        int iMax2 = Math.max(0, i10 - this.f53553f.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f53554g != null) {
                A();
            } else {
                E();
            }
            return false;
        }
        int i11 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i12 = iMax > 0 ? iMax / 2 : 0;
        if (this.f53554g != null) {
            Rect rect = new Rect();
            this.f53554g.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                E();
                return true;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        q(i11, i12, i11, i12);
        E();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        l.f(this, this.f53553f);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, D);
        }
        if (r()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, E);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f53568u) {
            this.f53567t.z(z10, i10, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(@n0 MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@n0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            a0.g2(accessibilityNodeInfo).e1(a0.e.h(chipGroup.b(this), 1, chipGroup.c() ? chipGroup.i(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    @p0
    public PointerIcon onResolvePointerIcon(@n0 MotionEvent motionEvent, int i10) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f53564q != i10) {
            this.f53564q = i10;
            G();
        }
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@n0 MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.f53560m) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z10 = true;
                }
                z10 = false;
            } else {
                if (this.f53560m) {
                    z();
                    z10 = true;
                }
                setCloseIconPressed(false);
            }
            z10 = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z10 = true;
        } else {
            z10 = false;
        }
        return z10 || super.onTouchEvent(motionEvent);
    }

    public boolean r() {
        com.google.android.material.chip.b bVar = this.f53553f;
        return bVar != null && bVar.W1();
    }

    @Deprecated
    public boolean s() {
        return t();
    }

    public void setAccessibilityClassName(@p0 CharSequence charSequence) {
        this.f53566s = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f53555h) {
            super.setBackground(drawable);
        } else {
            Log.w(f53551y, "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w(f53551y, "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f53555h) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w(f53551y, "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w(f53551y, "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@p0 ColorStateList colorStateList) {
        Log.w(f53551y, "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@p0 PorterDuff.Mode mode) {
        Log.w(f53551y, "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.l2(z10);
        }
    }

    public void setCheckableResource(@h int i10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.m2(i10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar == null) {
            this.f53559l = z10;
        } else if (bVar.W1()) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(@p0 Drawable drawable) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.n2(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@h int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(@v int i10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.q2(i10);
        }
    }

    public void setCheckedIconTint(@p0 ColorStateList colorStateList) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.r2(colorStateList);
        }
    }

    public void setCheckedIconTintResource(@n int i10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.s2(i10);
        }
    }

    public void setCheckedIconVisible(@h int i10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.t2(i10);
        }
    }

    public void setCheckedIconVisible(boolean z10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.u2(z10);
        }
    }

    public void setChipBackgroundColor(@p0 ColorStateList colorStateList) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.v2(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(@n int i10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.w2(i10);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.x2(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@q int i10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.y2(i10);
        }
    }

    public void setChipDrawable(@n0 com.google.android.material.chip.b bVar) {
        com.google.android.material.chip.b bVar2 = this.f53553f;
        if (bVar2 != bVar) {
            C(bVar2);
            this.f53553f = bVar;
            bVar.v3(false);
            j(this.f53553f);
            l(this.f53565r);
        }
    }

    public void setChipEndPadding(float f10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.z2(f10);
        }
    }

    public void setChipEndPaddingResource(@q int i10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.A2(i10);
        }
    }

    public void setChipIcon(@p0 Drawable drawable) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.B2(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(@h int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(@v int i10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.E2(i10);
        }
    }

    public void setChipIconSize(float f10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.F2(f10);
        }
    }

    public void setChipIconSizeResource(@q int i10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.G2(i10);
        }
    }

    public void setChipIconTint(@p0 ColorStateList colorStateList) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.H2(colorStateList);
        }
    }

    public void setChipIconTintResource(@n int i10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.I2(i10);
        }
    }

    public void setChipIconVisible(@h int i10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.J2(i10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.K2(z10);
        }
    }

    public void setChipMinHeight(float f10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.L2(f10);
        }
    }

    public void setChipMinHeightResource(@q int i10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.M2(i10);
        }
    }

    public void setChipStartPadding(float f10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.N2(f10);
        }
    }

    public void setChipStartPaddingResource(@q int i10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.O2(i10);
        }
    }

    public void setChipStrokeColor(@p0 ColorStateList colorStateList) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.P2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(@n int i10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.Q2(i10);
        }
    }

    public void setChipStrokeWidth(float f10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.R2(f10);
        }
    }

    public void setChipStrokeWidthResource(@q int i10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.S2(i10);
        }
    }

    @Deprecated
    public void setChipText(@p0 CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(@d1 int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(@p0 Drawable drawable) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.U2(drawable);
        }
        D();
    }

    public void setCloseIconContentDescription(@p0 CharSequence charSequence) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.V2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@h int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.Y2(f10);
        }
    }

    public void setCloseIconEndPaddingResource(@q int i10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.Z2(i10);
        }
    }

    public void setCloseIconResource(@v int i10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.a3(i10);
        }
        D();
    }

    public void setCloseIconSize(float f10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.b3(f10);
        }
    }

    public void setCloseIconSizeResource(@q int i10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.c3(i10);
        }
    }

    public void setCloseIconStartPadding(float f10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.d3(f10);
        }
    }

    public void setCloseIconStartPaddingResource(@q int i10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.e3(i10);
        }
    }

    public void setCloseIconTint(@p0 ColorStateList colorStateList) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.g3(colorStateList);
        }
    }

    public void setCloseIconTintResource(@n int i10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.h3(i10);
        }
    }

    public void setCloseIconVisible(@h int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    public void setCloseIconVisible(boolean z10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.j3(z10);
        }
        D();
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawables(@p0 Drawable drawable, @p0 Drawable drawable2, @p0 Drawable drawable3, @p0 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    @w0(17)
    public void setCompoundDrawablesRelative(@p0 Drawable drawable, @p0 Drawable drawable2, @p0 Drawable drawable3, @p0 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@p0 Drawable drawable, @p0 Drawable drawable2, @p0 Drawable drawable3, @p0 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@p0 Drawable drawable, @p0 Drawable drawable2, @p0 Drawable drawable3, @p0 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.view.View
    @w0(21)
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.n0(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f53553f == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.l3(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f53563p = z10;
        l(this.f53565r);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w(f53551y, "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(@p0 i iVar) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.m3(iVar);
        }
    }

    public void setHideMotionSpecResource(@androidx.annotation.b int i10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.n3(i10);
        }
    }

    public void setIconEndPadding(float f10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.o3(f10);
        }
    }

    public void setIconEndPaddingResource(@q int i10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.p3(i10);
        }
    }

    public void setIconStartPadding(float f10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.q3(f10);
        }
    }

    public void setIconStartPaddingResource(@q int i10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.r3(i10);
        }
    }

    @Override // com.google.android.material.internal.m
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setInternalOnCheckedChangeListener(@p0 m.a<Chip> aVar) {
        this.f53558k = aVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f53553f == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(@t0 int i10) {
        super.setMaxWidth(i10);
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.s3(i10);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i10);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@p0 CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f53557j = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f53556i = onClickListener;
        D();
    }

    public void setRippleColor(@p0 ColorStateList colorStateList) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.t3(colorStateList);
        }
        if (this.f53553f.U1()) {
            return;
        }
        F();
    }

    public void setRippleColorResource(@n int i10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.u3(i10);
            if (this.f53553f.U1()) {
                return;
            }
            F();
        }
    }

    @Override // com.google.android.material.shape.t
    public void setShapeAppearanceModel(@n0 p pVar) {
        this.f53553f.setShapeAppearanceModel(pVar);
    }

    public void setShowMotionSpec(@p0 i iVar) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.w3(iVar);
        }
    }

    public void setShowMotionSpecResource(@androidx.annotation.b int i10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.x3(i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (!z10) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z10);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(bVar.K3() ? null : charSequence, bufferType);
        com.google.android.material.chip.b bVar2 = this.f53553f;
        if (bVar2 != null) {
            bVar2.y3(charSequence);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.A3(i10);
        }
        H();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.A3(i10);
        }
        H();
    }

    public void setTextAppearance(@p0 d dVar) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.z3(dVar);
        }
        H();
    }

    public void setTextAppearanceResource(@e1 int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.D3(f10);
        }
    }

    public void setTextEndPaddingResource(@q int i10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.E3(i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.G3(TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics()));
        }
        H();
    }

    public void setTextStartPadding(float f10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.H3(f10);
        }
    }

    public void setTextStartPaddingResource(@q int i10) {
        com.google.android.material.chip.b bVar = this.f53553f;
        if (bVar != null) {
            bVar.I3(i10);
        }
    }

    public boolean t() {
        com.google.android.material.chip.b bVar = this.f53553f;
        return bVar != null && bVar.Y1();
    }

    @Deprecated
    public boolean u() {
        return v();
    }

    public boolean v() {
        com.google.android.material.chip.b bVar = this.f53553f;
        return bVar != null && bVar.a2();
    }

    @Deprecated
    public boolean w() {
        return x();
    }

    public boolean x() {
        com.google.android.material.chip.b bVar = this.f53553f;
        return bVar != null && bVar.d2();
    }

    @androidx.annotation.i
    public boolean z() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f53556i;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        if (this.f53568u) {
            this.f53567t.L(1, 1);
        }
        return z10;
    }
}
