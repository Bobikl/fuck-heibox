package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.R;
import com.google.android.material.internal.c0;

/* JADX INFO: loaded from: classes7.dex */
public class TextInputEditText extends AppCompatEditText {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Rect f55570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f55571h;

    public TextInputEditText(@n0 Context context) {
        this(context, null);
    }

    public TextInputEditText(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public TextInputEditText(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(j9.a.c(context, attributeSet, i10, 0), attributeSet, i10);
        this.f55570g = new Rect();
        TypedArray typedArrayK = c0.k(context, attributeSet, R.styleable.A1, i10, R.style.Widget_Design_TextInputEditText, new int[0]);
        setTextInputLayoutFocusedRectEnabled(typedArrayK.getBoolean(R.styleable.TextInputEditText_textInputLayoutFocusedRectEnabled, false));
        typedArrayK.recycle();
    }

    @n0
    private String c(@n0 TextInputLayout textInputLayout) {
        Editable text = getText();
        CharSequence hint = textInputLayout.getHint();
        boolean z10 = !TextUtils.isEmpty(text);
        String str = "";
        String string = TextUtils.isEmpty(hint) ^ true ? hint.toString() : "";
        if (!z10) {
            return !TextUtils.isEmpty(string) ? string : "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) text);
        if (!TextUtils.isEmpty(string)) {
            str = ", " + string;
        }
        sb2.append(str);
        return sb2.toString();
    }

    private boolean e(@p0 TextInputLayout textInputLayout) {
        return textInputLayout != null && this.f55571h;
    }

    @p0
    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    @p0
    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public boolean d() {
        return this.f55571h;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(@p0 Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!e(textInputLayout) || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.f55570g);
        rect.bottom = this.f55570g.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(@p0 Rect rect, @p0 Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        return e(textInputLayout) ? textInputLayout.getGlobalVisibleRect(rect, point) : super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.widget.TextView
    @p0
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.a0()) ? super.getHint() : textInputLayout.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.a0() && super.getHint() == null && com.google.android.material.internal.l.c()) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    @p0
    public InputConnection onCreateInputConnection(@n0 EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@n0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(@p0 Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!e(textInputLayout) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.f55570g.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.f55570g);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z10) {
        this.f55571h = z10;
    }
}
