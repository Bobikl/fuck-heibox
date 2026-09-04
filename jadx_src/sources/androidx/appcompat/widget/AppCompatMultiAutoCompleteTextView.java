package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView implements androidx.core.view.g1, d0, androidx.core.widget.c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f2418e = {R.attr.popupBackground};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f2419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f2420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    private final g f2421d;

    public AppCompatMultiAutoCompleteTextView(@androidx.annotation.n0 Context context) {
        this(context, null);
    }

    public AppCompatMultiAutoCompleteTextView(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.autoCompleteTextViewStyle);
    }

    public AppCompatMultiAutoCompleteTextView(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(u0.b(context), attributeSet, i10);
        s0.a(this, getContext());
        x0 x0VarG = x0.G(getContext(), attributeSet, f2418e, i10, 0);
        if (x0VarG.C(0)) {
            setDropDownBackgroundDrawable(x0VarG.h(0));
        }
        x0VarG.I();
        c cVar = new c(this);
        this.f2419b = cVar;
        cVar.e(attributeSet, i10);
        p pVar = new p(this);
        this.f2420c = pVar;
        pVar.m(attributeSet, i10);
        pVar.b();
        g gVar = new g(this);
        this.f2421d = gVar;
        gVar.d(attributeSet, i10);
        a(gVar);
    }

    void a(g gVar) {
        KeyListener keyListener = getKeyListener();
        if (gVar.b(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA = gVar.a(keyListener);
            if (keyListenerA == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerA);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        c cVar = this.f2419b;
        if (cVar != null) {
            cVar.b();
        }
        p pVar = this.f2420c;
        if (pVar != null) {
            pVar.b();
        }
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public ColorStateList getSupportBackgroundTintList() {
        c cVar = this.f2419b;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        c cVar = this.f2419b;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.c0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2420c.j();
    }

    @Override // androidx.core.widget.c0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2420c.k();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean isEmojiCompatEnabled() {
        return this.f2421d.c();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f2421d.e(i.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.p0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        c cVar = this.f2419b;
        if (cVar != null) {
            cVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.v int i10) {
        super.setBackgroundResource(i10);
        c cVar = this.f2419b;
        if (cVar != null) {
            cVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@androidx.annotation.p0 Drawable drawable, @androidx.annotation.p0 Drawable drawable2, @androidx.annotation.p0 Drawable drawable3, @androidx.annotation.p0 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f2420c;
        if (pVar != null) {
            pVar.p();
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.w0(17)
    public void setCompoundDrawablesRelative(@androidx.annotation.p0 Drawable drawable, @androidx.annotation.p0 Drawable drawable2, @androidx.annotation.p0 Drawable drawable3, @androidx.annotation.p0 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f2420c;
        if (pVar != null) {
            pVar.p();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(@androidx.annotation.v int i10) {
        setDropDownBackgroundDrawable(b0.a.b(getContext(), i10));
    }

    @Override // androidx.appcompat.widget.d0
    public void setEmojiCompatEnabled(boolean z10) {
        this.f2421d.f(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@androidx.annotation.p0 KeyListener keyListener) {
        super.setKeyListener(this.f2421d.a(keyListener));
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        c cVar = this.f2419b;
        if (cVar != null) {
            cVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        c cVar = this.f2419b;
        if (cVar != null) {
            cVar.j(mode);
        }
    }

    @Override // androidx.core.widget.c0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        this.f2420c.w(colorStateList);
        this.f2420c.b();
    }

    @Override // androidx.core.widget.c0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        this.f2420c.x(mode);
        this.f2420c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        p pVar = this.f2420c;
        if (pVar != null) {
            pVar.q(context, i10);
        }
    }
}
