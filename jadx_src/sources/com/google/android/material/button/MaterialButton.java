package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.annotation.t0;
import androidx.annotation.v;
import androidx.annotation.w0;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.d;
import androidx.core.view.j1;
import androidx.core.view.n;
import androidx.core.widget.q;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.j0;
import com.google.android.material.shape.l;
import com.google.android.material.shape.p;
import com.google.android.material.shape.t;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes7.dex */
public class MaterialButton extends AppCompatButton implements Checkable, t {
    private static final String A = "MaterialButton";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f53351u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f53352v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f53353w = 3;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f53354x = 4;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f53355y = 16;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f53356z = 32;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    private final com.google.android.material.button.a f53357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    private final LinkedHashSet<b> f53358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private c f53359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private PorterDuff.Mode f53360h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private ColorStateList f53361i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private Drawable f53362j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private String f53363k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @t0
    private int f53364l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @t0
    private int f53365m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @t0
    private int f53366n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @t0
    private int f53367o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f53368p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f53369q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f53370r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int[] f53349s = {R.attr.state_checkable};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int[] f53350t = {R.attr.state_checked};
    private static final int B = com.google.android.material.R.style.Widget_MaterialComponents_Button;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f53371b;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @n0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@n0 Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @n0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@n0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @n0
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(@n0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            a(parcel);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void a(@n0 Parcel parcel) {
            this.f53371b = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@n0 Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f53371b ? 1 : 0);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public interface b {
        void a(MaterialButton materialButton, boolean z10);
    }

    public interface c {
        void a(MaterialButton materialButton, boolean z10);
    }

    public MaterialButton(@n0 Context context) {
        this(context, null);
    }

    public MaterialButton(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.materialButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = B;
        super(j9.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f53358f = new LinkedHashSet<>();
        this.f53368p = false;
        this.f53369q = false;
        Context context2 = getContext();
        TypedArray typedArrayK = c0.k(context2, attributeSet, com.google.android.material.R.styleable.f52882v0, i10, i11, new int[0]);
        this.f53367o = typedArrayK.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialButton_iconPadding, 0);
        this.f53360h = j0.r(typedArrayK.getInt(com.google.android.material.R.styleable.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f53361i = com.google.android.material.resources.c.a(getContext(), typedArrayK, com.google.android.material.R.styleable.MaterialButton_iconTint);
        this.f53362j = com.google.android.material.resources.c.e(getContext(), typedArrayK, com.google.android.material.R.styleable.MaterialButton_icon);
        this.f53370r = typedArrayK.getInteger(com.google.android.material.R.styleable.MaterialButton_iconGravity, 1);
        this.f53364l = typedArrayK.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialButton_iconSize, 0);
        com.google.android.material.button.a aVar = new com.google.android.material.button.a(this, p.e(context2, attributeSet, i10, i11).m());
        this.f53357e = aVar;
        aVar.r(typedArrayK);
        typedArrayK.recycle();
        setCompoundDrawablePadding(this.f53367o);
        l(this.f53362j != null);
    }

    private boolean d() {
        int i10 = this.f53370r;
        return i10 == 3 || i10 == 4;
    }

    private boolean e() {
        int i10 = this.f53370r;
        return i10 == 1 || i10 == 2;
    }

    private boolean f() {
        int i10 = this.f53370r;
        return i10 == 16 || i10 == 32;
    }

    private boolean g() {
        return j1.Z(this) == 1;
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & n.f21703d;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(fMax);
    }

    private boolean i() {
        com.google.android.material.button.a aVar = this.f53357e;
        return (aVar == null || aVar.o()) ? false : true;
    }

    private void k() {
        if (e()) {
            q.w(this, this.f53362j, null, null, null);
        } else if (d()) {
            q.w(this, null, null, this.f53362j, null);
        } else if (f()) {
            q.w(this, null, this.f53362j, null, null);
        }
    }

    private void l(boolean z10) {
        Drawable drawable = this.f53362j;
        boolean z11 = true;
        if (drawable != null) {
            Drawable drawableMutate = d.r(drawable).mutate();
            this.f53362j = drawableMutate;
            d.o(drawableMutate, this.f53361i);
            PorterDuff.Mode mode = this.f53360h;
            if (mode != null) {
                d.p(this.f53362j, mode);
            }
            int intrinsicWidth = this.f53364l;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f53362j.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f53364l;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f53362j.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f53362j;
            int i10 = this.f53365m;
            int i11 = this.f53366n;
            drawable2.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.f53362j.setVisible(true, z10);
        }
        if (z10) {
            k();
            return;
        }
        Drawable[] drawableArrH = q.h(this);
        Drawable drawable3 = drawableArrH[0];
        Drawable drawable4 = drawableArrH[1];
        Drawable drawable5 = drawableArrH[2];
        if ((!e() || drawable3 == this.f53362j) && ((!d() || drawable5 == this.f53362j) && (!f() || drawable4 == this.f53362j))) {
            z11 = false;
        }
        if (z11) {
            k();
        }
    }

    private void m(int i10, int i11) {
        if (this.f53362j == null || getLayout() == null) {
            return;
        }
        if (!e() && !d()) {
            if (f()) {
                this.f53365m = 0;
                if (this.f53370r == 16) {
                    this.f53366n = 0;
                    l(false);
                    return;
                }
                int intrinsicHeight = this.f53364l;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f53362j.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f53367o) - getPaddingBottom()) / 2);
                if (this.f53366n != iMax) {
                    this.f53366n = iMax;
                    l(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f53366n = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i12 = this.f53370r;
        if (i12 == 1 || i12 == 3 || ((i12 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i12 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f53365m = 0;
            l(false);
            return;
        }
        int intrinsicWidth = this.f53364l;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f53362j.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i10 - getTextLayoutWidth()) - j1.j0(this)) - intrinsicWidth) - this.f53367o) - j1.k0(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (g() != (this.f53370r == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f53365m != textLayoutWidth) {
            this.f53365m = textLayoutWidth;
            l(false);
        }
    }

    public void a(@n0 b bVar) {
        this.f53358f.add(bVar);
    }

    public void b() {
        this.f53358f.clear();
    }

    public boolean c() {
        com.google.android.material.button.a aVar = this.f53357e;
        return aVar != null && aVar.p();
    }

    @n0
    String getA11yClassName() {
        if (TextUtils.isEmpty(this.f53363k)) {
            return (c() ? CompoundButton.class : Button.class).getName();
        }
        return this.f53363k;
    }

    @Override // android.view.View
    @p0
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    @p0
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @t0
    public int getCornerRadius() {
        if (i()) {
            return this.f53357e.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f53362j;
    }

    public int getIconGravity() {
        return this.f53370r;
    }

    @t0
    public int getIconPadding() {
        return this.f53367o;
    }

    @t0
    public int getIconSize() {
        return this.f53364l;
    }

    public ColorStateList getIconTint() {
        return this.f53361i;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f53360h;
    }

    @r
    public int getInsetBottom() {
        return this.f53357e.c();
    }

    @r
    public int getInsetTop() {
        return this.f53357e.d();
    }

    @p0
    public ColorStateList getRippleColor() {
        if (i()) {
            return this.f53357e.h();
        }
        return null;
    }

    @Override // com.google.android.material.shape.t
    @n0
    public p getShapeAppearanceModel() {
        if (i()) {
            return this.f53357e.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (i()) {
            return this.f53357e.j();
        }
        return null;
    }

    @t0
    public int getStrokeWidth() {
        if (i()) {
            return this.f53357e.k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @p0
    public ColorStateList getSupportBackgroundTintList() {
        return i() ? this.f53357e.l() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @p0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return i() ? this.f53357e.m() : super.getSupportBackgroundTintMode();
    }

    public boolean h() {
        return this.f53357e.q();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f53368p;
    }

    public void j(@n0 b bVar) {
        this.f53358f.remove(bVar);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (i()) {
            l.f(this, this.f53357e.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (c()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f53349s);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f53350t);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(@n0 AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(@n0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(c());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        m(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@p0 Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.f53371b);
    }

    @Override // android.widget.TextView, android.view.View
    @n0
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f53371b = this.f53368p;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        m(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f53357e.q()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f53362j != null) {
            if (this.f53362j.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    void setA11yClassName(@p0 String str) {
        this.f53363k = str;
    }

    @Override // android.view.View
    public void setBackground(@n0 Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(@androidx.annotation.l int i10) {
        if (i()) {
            this.f53357e.s(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@n0 Drawable drawable) {
        if (!i()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w(A, "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f53357e.t();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(@v int i10) {
        setBackgroundDrawable(i10 != 0 ? b0.a.b(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@p0 ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@p0 PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (i()) {
            this.f53357e.u(z10);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (c() && isEnabled() && this.f53368p != z10) {
            this.f53368p = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).p(this, this.f53368p);
            }
            if (this.f53369q) {
                return;
            }
            this.f53369q = true;
            Iterator<b> it = this.f53358f.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.f53368p);
            }
            this.f53369q = false;
        }
    }

    public void setCornerRadius(@t0 int i10) {
        if (i()) {
            this.f53357e.v(i10);
        }
    }

    public void setCornerRadiusResource(@androidx.annotation.q int i10) {
        if (i()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    @w0(21)
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (i()) {
            this.f53357e.f().n0(f10);
        }
    }

    public void setIcon(@p0 Drawable drawable) {
        if (this.f53362j != drawable) {
            this.f53362j = drawable;
            l(true);
            m(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f53370r != i10) {
            this.f53370r = i10;
            m(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(@t0 int i10) {
        if (this.f53367o != i10) {
            this.f53367o = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(@v int i10) {
        setIcon(i10 != 0 ? b0.a.b(getContext(), i10) : null);
    }

    public void setIconSize(@t0 int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f53364l != i10) {
            this.f53364l = i10;
            l(true);
        }
    }

    public void setIconTint(@p0 ColorStateList colorStateList) {
        if (this.f53361i != colorStateList) {
            this.f53361i = colorStateList;
            l(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f53360h != mode) {
            this.f53360h = mode;
            l(false);
        }
    }

    public void setIconTintResource(@androidx.annotation.n int i10) {
        setIconTint(b0.a.a(getContext(), i10));
    }

    public void setInsetBottom(@r int i10) {
        this.f53357e.w(i10);
    }

    public void setInsetTop(@r int i10) {
        this.f53357e.x(i10);
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(@p0 c cVar) {
        this.f53359g = cVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        c cVar = this.f53359g;
        if (cVar != null) {
            cVar.a(this, z10);
        }
        super.setPressed(z10);
    }

    public void setRippleColor(@p0 ColorStateList colorStateList) {
        if (i()) {
            this.f53357e.y(colorStateList);
        }
    }

    public void setRippleColorResource(@androidx.annotation.n int i10) {
        if (i()) {
            setRippleColor(b0.a.a(getContext(), i10));
        }
    }

    @Override // com.google.android.material.shape.t
    public void setShapeAppearanceModel(@n0 p pVar) {
        if (!i()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f53357e.z(pVar);
    }

    void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (i()) {
            this.f53357e.A(z10);
        }
    }

    public void setStrokeColor(@p0 ColorStateList colorStateList) {
        if (i()) {
            this.f53357e.B(colorStateList);
        }
    }

    public void setStrokeColorResource(@androidx.annotation.n int i10) {
        if (i()) {
            setStrokeColor(b0.a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(@t0 int i10) {
        if (i()) {
            this.f53357e.C(i10);
        }
    }

    public void setStrokeWidthResource(@androidx.annotation.q int i10) {
        if (i()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@p0 ColorStateList colorStateList) {
        if (i()) {
            this.f53357e.D(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@p0 PorterDuff.Mode mode) {
        if (i()) {
            this.f53357e.E(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    @w0(17)
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        m(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f53357e.F(z10);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f53368p);
    }
}
