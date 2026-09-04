package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button implements androidx.core.view.g1, androidx.core.widget.b, androidx.core.widget.c0, d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f2399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f2400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    private h f2401d;

    public AppCompatButton(@androidx.annotation.n0 Context context) {
        this(context, null);
    }

    public AppCompatButton(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public AppCompatButton(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(u0.b(context), attributeSet, i10);
        s0.a(this, getContext());
        c cVar = new c(this);
        this.f2399b = cVar;
        cVar.e(attributeSet, i10);
        p pVar = new p(this);
        this.f2400c = pVar;
        pVar.m(attributeSet, i10);
        pVar.b();
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @androidx.annotation.n0
    private h getEmojiTextViewHelper() {
        if (this.f2401d == null) {
            this.f2401d = new h(this);
        }
        return this.f2401d;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        c cVar = this.f2399b;
        if (cVar != null) {
            cVar.b();
        }
        p pVar = this.f2400c;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.b.f21920t0) {
            return super.getAutoSizeMaxTextSize();
        }
        p pVar = this.f2400c;
        if (pVar != null) {
            return pVar.e();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        if (androidx.core.widget.b.f21920t0) {
            return super.getAutoSizeMinTextSize();
        }
        p pVar = this.f2400c;
        if (pVar != null) {
            return pVar.f();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        if (androidx.core.widget.b.f21920t0) {
            return super.getAutoSizeStepGranularity();
        }
        p pVar = this.f2400c;
        if (pVar != null) {
            return pVar.g();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        if (androidx.core.widget.b.f21920t0) {
            return super.getAutoSizeTextAvailableSizes();
        }
        p pVar = this.f2400c;
        return pVar != null ? pVar.h() : new int[0];
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @SuppressLint({"WrongConstant"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        if (androidx.core.widget.b.f21920t0) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        p pVar = this.f2400c;
        if (pVar != null) {
            return pVar.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    @androidx.annotation.p0
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.q.G(super.getCustomSelectionActionModeCallback());
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public ColorStateList getSupportBackgroundTintList() {
        c cVar = this.f2399b;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        c cVar = this.f2399b;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.c0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2400c.j();
    }

    @Override // androidx.core.widget.c0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2400c.k();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        p pVar = this.f2400c;
        if (pVar != null) {
            pVar.o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        p pVar = this.f2400c;
        if (pVar == null || androidx.core.widget.b.f21920t0 || !pVar.l()) {
            return;
        }
        this.f2400c.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (androidx.core.widget.b.f21920t0) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        p pVar = this.f2400c;
        if (pVar != null) {
            pVar.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@androidx.annotation.n0 int[] iArr, int i10) throws IllegalArgumentException {
        if (androidx.core.widget.b.f21920t0) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        p pVar = this.f2400c;
        if (pVar != null) {
            pVar.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (androidx.core.widget.b.f21920t0) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        p pVar = this.f2400c;
        if (pVar != null) {
            pVar.v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.p0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        c cVar = this.f2399b;
        if (cVar != null) {
            cVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.v int i10) {
        super.setBackgroundResource(i10);
        c cVar = this.f2399b;
        if (cVar != null) {
            cVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@androidx.annotation.p0 ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.q.H(this, callback));
    }

    @Override // androidx.appcompat.widget.d0
    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(@androidx.annotation.n0 InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        p pVar = this.f2400c;
        if (pVar != null) {
            pVar.s(z10);
        }
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        c cVar = this.f2399b;
        if (cVar != null) {
            cVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        c cVar = this.f2399b;
        if (cVar != null) {
            cVar.j(mode);
        }
    }

    @Override // androidx.core.widget.c0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        this.f2400c.w(colorStateList);
        this.f2400c.b();
    }

    @Override // androidx.core.widget.c0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        this.f2400c.x(mode);
        this.f2400c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        p pVar = this.f2400c;
        if (pVar != null) {
            pVar.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (androidx.core.widget.b.f21920t0) {
            super.setTextSize(i10, f10);
            return;
        }
        p pVar = this.f2400c;
        if (pVar != null) {
            pVar.A(i10, f10);
        }
    }
}
