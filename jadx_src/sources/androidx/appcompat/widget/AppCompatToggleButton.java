package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatToggleButton extends ToggleButton implements androidx.core.view.g1, d0, androidx.core.widget.c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f2459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f2460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h f2461d;

    public AppCompatToggleButton(@androidx.annotation.n0 Context context) {
        this(context, null);
    }

    public AppCompatToggleButton(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public AppCompatToggleButton(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        s0.a(this, getContext());
        c cVar = new c(this);
        this.f2459b = cVar;
        cVar.e(attributeSet, i10);
        p pVar = new p(this);
        this.f2460c = pVar;
        pVar.m(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @androidx.annotation.n0
    private h getEmojiTextViewHelper() {
        if (this.f2461d == null) {
            this.f2461d = new h(this);
        }
        return this.f2461d;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        c cVar = this.f2459b;
        if (cVar != null) {
            cVar.b();
        }
        p pVar = this.f2460c;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public ColorStateList getSupportBackgroundTintList() {
        c cVar = this.f2459b;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        c cVar = this.f2459b;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.c0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2460c.j();
    }

    @Override // androidx.core.widget.c0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2460c.k();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(@androidx.annotation.p0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        c cVar = this.f2459b;
        if (cVar != null) {
            cVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.v int i10) {
        super.setBackgroundResource(i10);
        c cVar = this.f2459b;
        if (cVar != null) {
            cVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@androidx.annotation.p0 Drawable drawable, @androidx.annotation.p0 Drawable drawable2, @androidx.annotation.p0 Drawable drawable3, @androidx.annotation.p0 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f2460c;
        if (pVar != null) {
            pVar.p();
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.w0(17)
    public void setCompoundDrawablesRelative(@androidx.annotation.p0 Drawable drawable, @androidx.annotation.p0 Drawable drawable2, @androidx.annotation.p0 Drawable drawable3, @androidx.annotation.p0 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f2460c;
        if (pVar != null) {
            pVar.p();
        }
    }

    @Override // androidx.appcompat.widget.d0
    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(@androidx.annotation.n0 InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        c cVar = this.f2459b;
        if (cVar != null) {
            cVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        c cVar = this.f2459b;
        if (cVar != null) {
            cVar.j(mode);
        }
    }

    @Override // androidx.core.widget.c0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        this.f2460c.w(colorStateList);
        this.f2460c.b();
    }

    @Override // androidx.core.widget.c0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        this.f2460c.x(mode);
        this.f2460c.b();
    }
}
