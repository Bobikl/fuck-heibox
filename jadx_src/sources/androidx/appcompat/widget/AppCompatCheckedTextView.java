package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView implements androidx.core.widget.a0, androidx.core.view.g1, d0, androidx.core.widget.c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f2406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f2407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p f2408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    private h f2409e;

    public AppCompatCheckedTextView(@androidx.annotation.n0 Context context) {
        this(context, null);
    }

    public AppCompatCheckedTextView(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    public AppCompatCheckedTextView(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(u0.b(context), attributeSet, i10);
        s0.a(this, getContext());
        p pVar = new p(this);
        this.f2408d = pVar;
        pVar.m(attributeSet, i10);
        pVar.b();
        c cVar = new c(this);
        this.f2407c = cVar;
        cVar.e(attributeSet, i10);
        d dVar = new d(this);
        this.f2406b = dVar;
        dVar.d(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @androidx.annotation.n0
    private h getEmojiTextViewHelper() {
        if (this.f2409e == null) {
            this.f2409e = new h(this);
        }
        return this.f2409e;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.f2408d;
        if (pVar != null) {
            pVar.b();
        }
        c cVar = this.f2407c;
        if (cVar != null) {
            cVar.b();
        }
        d dVar = this.f2406b;
        if (dVar != null) {
            dVar.a();
        }
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
        c cVar = this.f2407c;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        c cVar = this.f2407c;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.a0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public ColorStateList getSupportCheckMarkTintList() {
        d dVar = this.f2406b;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    @Override // androidx.core.widget.a0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        d dVar = this.f2406b;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    @Override // androidx.core.widget.c0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2408d.j();
    }

    @Override // androidx.core.widget.c0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2408d.k();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.TextView, android.view.View
    @androidx.annotation.p0
    public InputConnection onCreateInputConnection(@androidx.annotation.n0 EditorInfo editorInfo) {
        return i.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.p0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        c cVar = this.f2407c;
        if (cVar != null) {
            cVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.v int i10) {
        super.setBackgroundResource(i10);
        c cVar = this.f2407c;
        if (cVar != null) {
            cVar.g(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@androidx.annotation.v int i10) {
        setCheckMarkDrawable(b0.a.b(getContext(), i10));
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@androidx.annotation.p0 Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        d dVar = this.f2406b;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@androidx.annotation.p0 Drawable drawable, @androidx.annotation.p0 Drawable drawable2, @androidx.annotation.p0 Drawable drawable3, @androidx.annotation.p0 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f2408d;
        if (pVar != null) {
            pVar.p();
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.w0(17)
    public void setCompoundDrawablesRelative(@androidx.annotation.p0 Drawable drawable, @androidx.annotation.p0 Drawable drawable2, @androidx.annotation.p0 Drawable drawable3, @androidx.annotation.p0 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f2408d;
        if (pVar != null) {
            pVar.p();
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

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        c cVar = this.f2407c;
        if (cVar != null) {
            cVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        c cVar = this.f2407c;
        if (cVar != null) {
            cVar.j(mode);
        }
    }

    @Override // androidx.core.widget.a0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCheckMarkTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        d dVar = this.f2406b;
        if (dVar != null) {
            dVar.f(colorStateList);
        }
    }

    @Override // androidx.core.widget.a0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCheckMarkTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        d dVar = this.f2406b;
        if (dVar != null) {
            dVar.g(mode);
        }
    }

    @Override // androidx.core.widget.c0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        this.f2408d.w(colorStateList);
        this.f2408d.b();
    }

    @Override // androidx.core.widget.c0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        this.f2408d.x(mode);
        this.f2408d.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(@androidx.annotation.n0 Context context, int i10) {
        super.setTextAppearance(context, i10);
        p pVar = this.f2408d;
        if (pVar != null) {
            pVar.q(context, i10);
        }
    }
}
