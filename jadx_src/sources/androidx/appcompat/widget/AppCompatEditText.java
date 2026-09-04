package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.view.j1;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatEditText extends EditText implements androidx.core.view.g1, androidx.core.view.b1, d0, androidx.core.widget.c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f2410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f2411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f2412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.core.widget.z f2413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    private final g f2414f;

    public AppCompatEditText(@androidx.annotation.n0 Context context) {
        this(context, null);
    }

    public AppCompatEditText(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public AppCompatEditText(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(u0.b(context), attributeSet, i10);
        s0.a(this, getContext());
        c cVar = new c(this);
        this.f2410b = cVar;
        cVar.e(attributeSet, i10);
        p pVar = new p(this);
        this.f2411c = pVar;
        pVar.m(attributeSet, i10);
        pVar.b();
        this.f2412d = new o(this);
        this.f2413e = new androidx.core.widget.z();
        g gVar = new g(this);
        this.f2414f = gVar;
        gVar.d(attributeSet, i10);
        b(gVar);
    }

    @Override // androidx.core.view.b1
    @androidx.annotation.p0
    public androidx.core.view.e a(@androidx.annotation.n0 androidx.core.view.e eVar) {
        return this.f2413e.a(this, eVar);
    }

    void b(g gVar) {
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
        c cVar = this.f2410b;
        if (cVar != null) {
            cVar.b();
        }
        p pVar = this.f2411c;
        if (pVar != null) {
            pVar.b();
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
        c cVar = this.f2410b;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        c cVar = this.f2410b;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.c0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2411c.j();
    }

    @Override // androidx.core.widget.c0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2411c.k();
    }

    @Override // android.widget.EditText, android.widget.TextView
    @androidx.annotation.p0
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    @androidx.annotation.n0
    @androidx.annotation.w0(api = 26)
    public TextClassifier getTextClassifier() {
        o oVar;
        return (Build.VERSION.SDK_INT >= 28 || (oVar = this.f2412d) == null) ? super.getTextClassifier() : oVar.a();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean isEmojiCompatEnabled() {
        return this.f2414f.c();
    }

    @Override // android.widget.TextView, android.view.View
    @androidx.annotation.p0
    public InputConnection onCreateInputConnection(@androidx.annotation.n0 EditorInfo editorInfo) {
        String[] strArrH0;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f2411c.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        InputConnection inputConnectionA = i.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionA != null && Build.VERSION.SDK_INT <= 30 && (strArrH0 = j1.h0(this)) != null) {
            androidx.core.view.inputmethod.e.h(editorInfo, strArrH0);
            inputConnectionA = androidx.core.view.inputmethod.g.d(this, inputConnectionA, editorInfo);
        }
        return this.f2414f.e(inputConnectionA, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (m.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (m.b(this, i10)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.p0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        c cVar = this.f2410b;
        if (cVar != null) {
            cVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.v int i10) {
        super.setBackgroundResource(i10);
        c cVar = this.f2410b;
        if (cVar != null) {
            cVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@androidx.annotation.p0 Drawable drawable, @androidx.annotation.p0 Drawable drawable2, @androidx.annotation.p0 Drawable drawable3, @androidx.annotation.p0 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f2411c;
        if (pVar != null) {
            pVar.p();
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.w0(17)
    public void setCompoundDrawablesRelative(@androidx.annotation.p0 Drawable drawable, @androidx.annotation.p0 Drawable drawable2, @androidx.annotation.p0 Drawable drawable3, @androidx.annotation.p0 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        p pVar = this.f2411c;
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
        this.f2414f.f(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@androidx.annotation.p0 KeyListener keyListener) {
        super.setKeyListener(this.f2414f.a(keyListener));
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        c cVar = this.f2410b;
        if (cVar != null) {
            cVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        c cVar = this.f2410b;
        if (cVar != null) {
            cVar.j(mode);
        }
    }

    @Override // androidx.core.widget.c0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        this.f2411c.w(colorStateList);
        this.f2411c.b();
    }

    @Override // androidx.core.widget.c0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        this.f2411c.x(mode);
        this.f2411c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        p pVar = this.f2411c;
        if (pVar != null) {
            pVar.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.w0(api = 26)
    public void setTextClassifier(@androidx.annotation.p0 TextClassifier textClassifier) {
        o oVar;
        if (Build.VERSION.SDK_INT >= 28 || (oVar = this.f2412d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            oVar.b(textClassifier);
        }
    }
}
