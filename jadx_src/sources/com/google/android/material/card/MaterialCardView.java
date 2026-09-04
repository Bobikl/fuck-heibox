package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.l;
import androidx.annotation.n;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.r;
import androidx.annotation.v;
import androidx.annotation.x;
import androidx.cardview.widget.CardView;
import com.google.android.material.color.utilities.d;
import com.google.android.material.internal.c0;
import com.google.android.material.shape.p;
import com.google.android.material.shape.t;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes7.dex */
public class MaterialCardView extends CardView implements Checkable, t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int[] f53414p = {R.attr.state_checkable};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int[] f53415q = {R.attr.state_checked};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f53416r = {com.google.android.material.R.attr.state_dragged};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f53417s = com.google.android.material.R.style.Widget_MaterialComponents_CardView;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f53418t = "MaterialCardView";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f53419u = "androidx.cardview.widget.CardView";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f53420v = 8388659;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f53421w = 8388691;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f53422x = 8388661;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f53423y = 8388693;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @n0
    private final com.google.android.material.card.b f53424k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f53425l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f53426m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f53427n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private b f53428o;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public interface b {
        void a(MaterialCardView materialCardView, boolean z10);
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.materialCardViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f53417s;
        super(j9.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f53426m = false;
        this.f53427n = false;
        this.f53425l = true;
        TypedArray typedArrayK = c0.k(getContext(), attributeSet, com.google.android.material.R.styleable.f52894z0, i10, i11, new int[0]);
        com.google.android.material.card.b bVar = new com.google.android.material.card.b(this, attributeSet, i10, i11);
        this.f53424k = bVar;
        bVar.M(super.getCardBackgroundColor());
        bVar.c0(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        bVar.J(typedArrayK);
        typedArrayK.recycle();
    }

    @n0
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f53424k.l().getBounds());
        return rectF;
    }

    private void i() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f53424k.k();
        }
    }

    @Override // androidx.cardview.widget.CardView
    @n0
    public ColorStateList getCardBackgroundColor() {
        return this.f53424k.m();
    }

    @n0
    public ColorStateList getCardForegroundColor() {
        return this.f53424k.n();
    }

    float getCardViewRadius() {
        return super.getRadius();
    }

    @p0
    public Drawable getCheckedIcon() {
        return this.f53424k.o();
    }

    public int getCheckedIconGravity() {
        return this.f53424k.p();
    }

    @r
    public int getCheckedIconMargin() {
        return this.f53424k.q();
    }

    @r
    public int getCheckedIconSize() {
        return this.f53424k.r();
    }

    @p0
    public ColorStateList getCheckedIconTint() {
        return this.f53424k.s();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f53424k.C().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f53424k.C().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f53424k.C().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f53424k.C().top;
    }

    @x(from = 0.0d, to = d.f53848a)
    public float getProgress() {
        return this.f53424k.w();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f53424k.u();
    }

    public ColorStateList getRippleColor() {
        return this.f53424k.x();
    }

    @Override // com.google.android.material.shape.t
    @n0
    public p getShapeAppearanceModel() {
        return this.f53424k.y();
    }

    @l
    @Deprecated
    public int getStrokeColor() {
        return this.f53424k.z();
    }

    @p0
    public ColorStateList getStrokeColorStateList() {
        return this.f53424k.A();
    }

    @r
    public int getStrokeWidth() {
        return this.f53424k.B();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f53426m;
    }

    public boolean j() {
        com.google.android.material.card.b bVar = this.f53424k;
        return bVar != null && bVar.F();
    }

    public boolean k() {
        return this.f53427n;
    }

    void l(int i10, int i11, int i12, int i13) {
        super.setContentPadding(i10, i11, i12, i13);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.l.f(this, this.f53424k.l());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        if (j()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f53414p);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f53415q);
        }
        if (k()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f53416r);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(@n0 AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(f53419u);
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@n0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(f53419u);
        accessibilityNodeInfo.setCheckable(j());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f53424k.K(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f53425l) {
            if (!this.f53424k.E()) {
                Log.i(f53418t, "Setting a custom background is not supported.");
                this.f53424k.L(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@l int i10) {
        this.f53424k.M(ColorStateList.valueOf(i10));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@p0 ColorStateList colorStateList) {
        this.f53424k.M(colorStateList);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        this.f53424k.h0();
    }

    public void setCardForegroundColor(@p0 ColorStateList colorStateList) {
        this.f53424k.N(colorStateList);
    }

    public void setCheckable(boolean z10) {
        this.f53424k.O(z10);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f53426m != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(@p0 Drawable drawable) {
        this.f53424k.R(drawable);
    }

    public void setCheckedIconGravity(int i10) {
        if (this.f53424k.p() != i10) {
            this.f53424k.S(i10);
        }
    }

    public void setCheckedIconMargin(@r int i10) {
        this.f53424k.T(i10);
    }

    public void setCheckedIconMarginResource(@q int i10) {
        if (i10 != -1) {
            this.f53424k.T(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCheckedIconResource(@v int i10) {
        this.f53424k.R(b0.a.b(getContext(), i10));
    }

    public void setCheckedIconSize(@r int i10) {
        this.f53424k.U(i10);
    }

    public void setCheckedIconSizeResource(@q int i10) {
        if (i10 != 0) {
            this.f53424k.U(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCheckedIconTint(@p0 ColorStateList colorStateList) {
        this.f53424k.V(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        super.setClickable(z10);
        com.google.android.material.card.b bVar = this.f53424k;
        if (bVar != null) {
            bVar.f0();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setContentPadding(int i10, int i11, int i12, int i13) {
        this.f53424k.c0(i10, i11, i12, i13);
    }

    public void setDragged(boolean z10) {
        if (this.f53427n != z10) {
            this.f53427n = z10;
            refreshDrawableState();
            i();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        this.f53424k.j0();
    }

    public void setOnCheckedChangeListener(@p0 b bVar) {
        this.f53428o = bVar;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        this.f53424k.j0();
        this.f53424k.g0();
    }

    public void setProgress(@x(from = 0.0d, to = d.f53848a) float f10) {
        this.f53424k.X(f10);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f10) {
        super.setRadius(f10);
        this.f53424k.W(f10);
    }

    public void setRippleColor(@p0 ColorStateList colorStateList) {
        this.f53424k.Y(colorStateList);
    }

    public void setRippleColorResource(@n int i10) {
        this.f53424k.Y(b0.a.a(getContext(), i10));
    }

    @Override // com.google.android.material.shape.t
    public void setShapeAppearanceModel(@n0 p pVar) {
        setClipToOutline(pVar.u(getBoundsAsRectF()));
        this.f53424k.Z(pVar);
    }

    public void setStrokeColor(@l int i10) {
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f53424k.a0(colorStateList);
        invalidate();
    }

    public void setStrokeWidth(@r int i10) {
        this.f53424k.b0(i10);
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        this.f53424k.j0();
        this.f53424k.g0();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (j() && isEnabled()) {
            this.f53426m = !this.f53426m;
            refreshDrawableState();
            i();
            this.f53424k.Q(this.f53426m, true);
            b bVar = this.f53428o;
            if (bVar != null) {
                bVar.a(this, this.f53426m);
            }
        }
    }
}
