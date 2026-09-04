package com.google.android.material.checkbox;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.annotation.RestrictTo;
import androidx.annotation.d1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.v;
import androidx.annotation.w0;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.x0;
import com.google.android.material.R;
import com.google.android.material.color.m;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.j0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import z5.g;

/* JADX INFO: loaded from: classes7.dex */
public class MaterialCheckBox extends AppCompatCheckBox {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 2;
    private static final int[] E;
    private static final int[][] F;

    @SuppressLint({"DiscouragedApi"})
    private static final int G;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    private final LinkedHashSet<d> f53528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    private final LinkedHashSet<c> f53529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private ColorStateList f53530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f53531i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f53532j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f53533k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private CharSequence f53534l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private Drawable f53535m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private Drawable f53536n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f53537o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    ColorStateList f53538p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @p0
    ColorStateList f53539q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @n0
    private PorterDuff.Mode f53540r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f53541s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int[] f53542t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f53543u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @p0
    private CharSequence f53544v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @p0
    private CompoundButton.OnCheckedChangeListener f53545w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @p0
    private final androidx.vectordrawable.graphics.drawable.c f53546x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.b.a f53547y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f53527z = R.style.Widget_MaterialComponents_CompoundButton_CheckBox;
    private static final int[] D = {R.attr.state_indeterminate};

    public static class SavedState extends View.BaseSavedState {

        @n0
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f53548b;

        public class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f53548b = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }

        /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @n0
        private String a() {
            int i10 = this.f53548b;
            if (i10 != 1) {
                return i10 != 2 ? "unchecked" : "indeterminate";
            }
            return "checked";
        }

        @n0
        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + a() + g.f141884d;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Integer.valueOf(this.f53548b));
        }
    }

    public class a extends androidx.vectordrawable.graphics.drawable.b.a {
        a() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b.a
        public void b(Drawable drawable) {
            super.b(drawable);
            ColorStateList colorStateList = MaterialCheckBox.this.f53538p;
            if (colorStateList != null) {
                androidx.core.graphics.drawable.d.o(drawable, colorStateList);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.b.a
        public void c(Drawable drawable) {
            super.c(drawable);
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f53538p;
            if (colorStateList != null) {
                androidx.core.graphics.drawable.d.n(drawable, colorStateList.getColorForState(materialCheckBox.f53542t, MaterialCheckBox.this.f53538p.getDefaultColor()));
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface b {
    }

    public interface c {
        void a(@n0 MaterialCheckBox materialCheckBox, int i10);
    }

    public interface d {
        void a(@n0 MaterialCheckBox materialCheckBox, boolean z10);
    }

    static {
        int i10 = R.attr.state_error;
        E = new int[]{i10};
        F = new int[][]{new int[]{android.R.attr.state_enabled, i10}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
        G = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    public MaterialCheckBox(Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = f53527z;
        super(j9.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f53528f = new LinkedHashSet<>();
        this.f53529g = new LinkedHashSet<>();
        this.f53546x = androidx.vectordrawable.graphics.drawable.c.d(getContext(), R.drawable.mtrl_checkbox_button_checked_unchecked);
        this.f53547y = new a();
        Context context2 = getContext();
        this.f53535m = androidx.core.widget.d.a(this);
        this.f53538p = getSuperButtonTintList();
        setSupportButtonTintList(null);
        x0 x0VarL = c0.l(context2, attributeSet, R.styleable.A0, i10, i11, new int[0]);
        this.f53536n = x0VarL.h(R.styleable.MaterialCheckBox_buttonIcon);
        if (this.f53535m != null && c0.h(context2) && h(x0VarL)) {
            super.setButtonDrawable((Drawable) null);
            this.f53535m = b0.a.b(context2, R.drawable.mtrl_checkbox_button);
            this.f53537o = true;
            if (this.f53536n == null) {
                this.f53536n = b0.a.b(context2, R.drawable.mtrl_checkbox_button_icon);
            }
        }
        this.f53539q = com.google.android.material.resources.c.b(context2, x0VarL, R.styleable.MaterialCheckBox_buttonIconTint);
        this.f53540r = j0.r(x0VarL.o(R.styleable.MaterialCheckBox_buttonIconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f53531i = x0VarL.a(R.styleable.MaterialCheckBox_useMaterialThemeColors, false);
        this.f53532j = x0VarL.a(R.styleable.MaterialCheckBox_centerIfNoTextEnabled, true);
        this.f53533k = x0VarL.a(R.styleable.MaterialCheckBox_errorShown, false);
        this.f53534l = x0VarL.x(R.styleable.MaterialCheckBox_errorAccessibilityLabel);
        int i12 = R.styleable.MaterialCheckBox_checkedState;
        if (x0VarL.C(i12)) {
            setCheckedState(x0VarL.o(i12, 0));
        }
        x0VarL.I();
        m();
    }

    @n0
    private String getButtonStateDescription() {
        int i10 = this.f53541s;
        if (i10 == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        return i10 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f53530h == null) {
            int[][] iArr = F;
            int[] iArr2 = new int[iArr.length];
            int iD = m.d(this, R.attr.colorControlActivated);
            int iD2 = m.d(this, R.attr.colorError);
            int iD3 = m.d(this, R.attr.colorSurface);
            int iD4 = m.d(this, R.attr.colorOnSurface);
            iArr2[0] = m.o(iD3, iD2, 1.0f);
            iArr2[1] = m.o(iD3, iD, 1.0f);
            iArr2[2] = m.o(iD3, iD4, 0.54f);
            iArr2[3] = m.o(iD3, iD4, 0.38f);
            iArr2[4] = m.o(iD3, iD4, 0.38f);
            this.f53530h = new ColorStateList(iArr, iArr2);
        }
        return this.f53530h;
    }

    @p0
    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f53538p;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private boolean h(x0 x0Var) {
        return x0Var.u(R.styleable.MaterialCheckBox_android_button, 0) == G && x0Var.u(R.styleable.MaterialCheckBox_buttonCompat, 0) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        this.f53536n.jumpToCurrentState();
    }

    private void m() {
        this.f53535m = e9.a.c(this.f53535m, this.f53538p, androidx.core.widget.d.c(this));
        this.f53536n = e9.a.c(this.f53536n, this.f53539q, this.f53540r);
        q();
        r();
        super.setButtonDrawable(e9.a.a(this.f53535m, this.f53536n));
        refreshDrawableState();
    }

    private void p() {
        if (Build.VERSION.SDK_INT < 30 || this.f53544v != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    private void q() {
        androidx.vectordrawable.graphics.drawable.c cVar;
        if (this.f53537o) {
            androidx.vectordrawable.graphics.drawable.c cVar2 = this.f53546x;
            if (cVar2 != null) {
                cVar2.b(this.f53547y);
                this.f53546x.c(this.f53547y);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable = this.f53535m;
                if (!(drawable instanceof AnimatedStateListDrawable) || (cVar = this.f53546x) == null) {
                    return;
                }
                int i10 = R.id.checked;
                int i11 = R.id.unchecked;
                ((AnimatedStateListDrawable) drawable).addTransition(i10, i11, cVar, false);
                ((AnimatedStateListDrawable) this.f53535m).addTransition(R.id.indeterminate, i11, this.f53546x, false);
            }
        }
    }

    private void r() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f53535m;
        if (drawable != null && (colorStateList2 = this.f53538p) != null) {
            androidx.core.graphics.drawable.d.o(drawable, colorStateList2);
        }
        Drawable drawable2 = this.f53536n;
        if (drawable2 == null || (colorStateList = this.f53539q) == null) {
            return;
        }
        androidx.core.graphics.drawable.d.o(drawable2, colorStateList);
    }

    private void s() {
    }

    public void d(@n0 c cVar) {
        this.f53529g.add(cVar);
    }

    public void e(@n0 d dVar) {
        this.f53528f.add(dVar);
    }

    public void f() {
        this.f53529g.clear();
    }

    public void g() {
        this.f53528f.clear();
    }

    @Override // android.widget.CompoundButton
    @p0
    public Drawable getButtonDrawable() {
        return this.f53535m;
    }

    @p0
    public Drawable getButtonIconDrawable() {
        return this.f53536n;
    }

    @p0
    public ColorStateList getButtonIconTintList() {
        return this.f53539q;
    }

    @n0
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f53540r;
    }

    @Override // android.widget.CompoundButton
    @p0
    public ColorStateList getButtonTintList() {
        return this.f53538p;
    }

    public int getCheckedState() {
        return this.f53541s;
    }

    @p0
    public CharSequence getErrorAccessibilityLabel() {
        return this.f53534l;
    }

    public boolean i() {
        return this.f53532j;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f53541s == 1;
    }

    public boolean j() {
        return this.f53533k;
    }

    public boolean k() {
        return this.f53531i;
    }

    public void n(@n0 c cVar) {
        this.f53529g.remove(cVar);
    }

    public void o(@n0 d dVar) {
        this.f53528f.remove(dVar);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f53531i && this.f53538p == null && this.f53539q == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, D);
        }
        if (j()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, E);
        }
        this.f53542t = e9.a.e(iArrOnCreateDrawableState);
        s();
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.f53532j || !TextUtils.isEmpty(getText()) || (drawableA = androidx.core.widget.d.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (j0.q(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            androidx.core.graphics.drawable.d.l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@p0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && j()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f53534l));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@p0 Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.f53548b);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    @p0
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f53548b = getCheckedState();
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(@v int i10) {
        setButtonDrawable(b0.a.b(getContext(), i10));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(@p0 Drawable drawable) {
        this.f53535m = drawable;
        this.f53537o = false;
        m();
    }

    public void setButtonIconDrawable(@p0 Drawable drawable) {
        this.f53536n = drawable;
        m();
    }

    public void setButtonIconDrawableResource(@v int i10) {
        setButtonIconDrawable(b0.a.b(getContext(), i10));
    }

    public void setButtonIconTintList(@p0 ColorStateList colorStateList) {
        if (this.f53539q == colorStateList) {
            return;
        }
        this.f53539q = colorStateList;
        m();
    }

    public void setButtonIconTintMode(@n0 PorterDuff.Mode mode) {
        if (this.f53540r == mode) {
            return;
        }
        this.f53540r = mode;
        m();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(@p0 ColorStateList colorStateList) {
        if (this.f53538p == colorStateList) {
            return;
        }
        this.f53538p = colorStateList;
        m();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(@p0 PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f53532j = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f53541s != i10) {
            this.f53541s = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            p();
            if (this.f53543u) {
                return;
            }
            this.f53543u = true;
            LinkedHashSet<c> linkedHashSet = this.f53529g;
            if (linkedHashSet != null) {
                Iterator<c> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a(this, this.f53541s);
                }
            }
            if (this.f53541s != 2 && (onCheckedChangeListener = this.f53545w) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f53543u = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        s();
    }

    public void setErrorAccessibilityLabel(@p0 CharSequence charSequence) {
        this.f53534l = charSequence;
    }

    public void setErrorAccessibilityLabelResource(@d1 int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.f53533k == z10) {
            return;
        }
        this.f53533k = z10;
        refreshDrawableState();
        Iterator<d> it = this.f53528f.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.f53533k);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@p0 CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f53545w = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    @w0(30)
    public void setStateDescription(@p0 CharSequence charSequence) {
        this.f53544v = charSequence;
        if (charSequence == null) {
            p();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f53531i = z10;
        if (z10) {
            androidx.core.widget.d.d(this, getMaterialThemeColorsTintList());
        } else {
            androidx.core.widget.d.d(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }
}
