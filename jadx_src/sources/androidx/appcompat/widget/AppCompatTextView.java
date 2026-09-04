package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView implements androidx.core.view.g1, androidx.core.widget.c0, androidx.core.widget.b, d0 {
    private final c mBackgroundTintHelper;

    @androidx.annotation.n0
    private h mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;

    @androidx.annotation.p0
    private Future<androidx.core.text.l> mPrecomputedTextFuture;
    private final o mTextClassifierHelper;
    private final p mTextHelper;

    public AppCompatTextView(@androidx.annotation.n0 Context context) {
        this(context, null);
    }

    public AppCompatTextView(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public AppCompatTextView(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(u0.b(context), attributeSet, i10);
        this.mIsSetTypefaceProcessing = false;
        s0.a(this, getContext());
        c cVar = new c(this);
        this.mBackgroundTintHelper = cVar;
        cVar.e(attributeSet, i10);
        p pVar = new p(this);
        this.mTextHelper = pVar;
        pVar.m(attributeSet, i10);
        pVar.b();
        this.mTextClassifierHelper = new o(this);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<androidx.core.text.l> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                androidx.core.widget.q.D(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @androidx.annotation.n0
    private h getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new h(this);
        }
        return this.mEmojiTextViewHelper;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        c cVar = this.mBackgroundTintHelper;
        if (cVar != null) {
            cVar.b();
        }
        p pVar = this.mTextHelper;
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
        p pVar = this.mTextHelper;
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
        p pVar = this.mTextHelper;
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
        p pVar = this.mTextHelper;
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
        p pVar = this.mTextHelper;
        return pVar != null ? pVar.h() : new int[0];
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @SuppressLint({"WrongConstant"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        if (androidx.core.widget.b.f21920t0) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        p pVar = this.mTextHelper;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.q.i(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.q.j(this);
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public ColorStateList getSupportBackgroundTintList() {
        c cVar = this.mBackgroundTintHelper;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        c cVar = this.mBackgroundTintHelper;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.c0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.j();
    }

    @Override // androidx.core.widget.c0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.p0
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    @Override // android.widget.TextView
    @androidx.annotation.n0
    @androidx.annotation.w0(api = 26)
    public TextClassifier getTextClassifier() {
        o oVar;
        return (Build.VERSION.SDK_INT >= 28 || (oVar = this.mTextClassifierHelper) == null) ? super.getTextClassifier() : oVar.a();
    }

    @androidx.annotation.n0
    public androidx.core.text.l.a getTextMetricsParamsCompat() {
        return androidx.core.widget.q.o(this);
    }

    @Override // androidx.appcompat.widget.d0
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        return i.a(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        p pVar = this.mTextHelper;
        if (pVar != null) {
            pVar.o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        p pVar = this.mTextHelper;
        if (pVar == null || androidx.core.widget.b.f21920t0 || !pVar.l()) {
            return;
        }
        this.mTextHelper.c();
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
        p pVar = this.mTextHelper;
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
        p pVar = this.mTextHelper;
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
        p pVar = this.mTextHelper;
        if (pVar != null) {
            pVar.v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.p0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        c cVar = this.mBackgroundTintHelper;
        if (cVar != null) {
            cVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.v int i10) {
        super.setBackgroundResource(i10);
        c cVar = this.mBackgroundTintHelper;
        if (cVar != null) {
            cVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@androidx.annotation.p0 Drawable drawable, @androidx.annotation.p0 Drawable drawable2, @androidx.annotation.p0 Drawable drawable3, @androidx.annotation.p0 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        p pVar = this.mTextHelper;
        if (pVar != null) {
            pVar.p();
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.w0(17)
    public void setCompoundDrawablesRelative(@androidx.annotation.p0 Drawable drawable, @androidx.annotation.p0 Drawable drawable2, @androidx.annotation.p0 Drawable drawable3, @androidx.annotation.p0 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        p pVar = this.mTextHelper;
        if (pVar != null) {
            pVar.p();
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.w0(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? b0.a.b(context, i10) : null, i11 != 0 ? b0.a.b(context, i11) : null, i12 != 0 ? b0.a.b(context, i12) : null, i13 != 0 ? b0.a.b(context, i13) : null);
        p pVar = this.mTextHelper;
        if (pVar != null) {
            pVar.p();
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.w0(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@androidx.annotation.p0 Drawable drawable, @androidx.annotation.p0 Drawable drawable2, @androidx.annotation.p0 Drawable drawable3, @androidx.annotation.p0 Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        p pVar = this.mTextHelper;
        if (pVar != null) {
            pVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? b0.a.b(context, i10) : null, i11 != 0 ? b0.a.b(context, i11) : null, i12 != 0 ? b0.a.b(context, i12) : null, i13 != 0 ? b0.a.b(context, i13) : null);
        p pVar = this.mTextHelper;
        if (pVar != null) {
            pVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@androidx.annotation.p0 Drawable drawable, @androidx.annotation.p0 Drawable drawable2, @androidx.annotation.p0 Drawable drawable3, @androidx.annotation.p0 Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        p pVar = this.mTextHelper;
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

    @Override // android.widget.TextView
    public void setFilters(@androidx.annotation.n0 InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(@androidx.annotation.f0(from = 0) @androidx.annotation.t0 int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i10);
        } else {
            androidx.core.widget.q.A(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(@androidx.annotation.f0(from = 0) @androidx.annotation.t0 int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i10);
        } else {
            androidx.core.widget.q.B(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(@androidx.annotation.f0(from = 0) @androidx.annotation.t0 int i10) {
        androidx.core.widget.q.C(this, i10);
    }

    public void setPrecomputedText(@androidx.annotation.n0 androidx.core.text.l lVar) {
        androidx.core.widget.q.D(this, lVar);
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        c cVar = this.mBackgroundTintHelper;
        if (cVar != null) {
            cVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.g1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        c cVar = this.mBackgroundTintHelper;
        if (cVar != null) {
            cVar.j(mode);
        }
    }

    @Override // androidx.core.widget.c0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@androidx.annotation.p0 ColorStateList colorStateList) {
        this.mTextHelper.w(colorStateList);
        this.mTextHelper.b();
    }

    @Override // androidx.core.widget.c0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@androidx.annotation.p0 PorterDuff.Mode mode) {
        this.mTextHelper.x(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        p pVar = this.mTextHelper;
        if (pVar != null) {
            pVar.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.w0(api = 26)
    public void setTextClassifier(@androidx.annotation.p0 TextClassifier textClassifier) {
        o oVar;
        if (Build.VERSION.SDK_INT >= 28 || (oVar = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            oVar.b(textClassifier);
        }
    }

    public void setTextFuture(@androidx.annotation.p0 Future<androidx.core.text.l> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@androidx.annotation.n0 androidx.core.text.l.a aVar) {
        androidx.core.widget.q.F(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (androidx.core.widget.b.f21920t0) {
            super.setTextSize(i10, f10);
            return;
        }
        p pVar = this.mTextHelper;
        if (pVar != null) {
            pVar.A(i10, f10);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(@androidx.annotation.p0 Typeface typeface, int i10) {
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        Typeface typefaceB = null;
        if (typeface != null && i10 > 0) {
            typefaceB = androidx.core.graphics.w0.b(getContext(), typeface, i10);
        }
        this.mIsSetTypefaceProcessing = true;
        if (typefaceB != null) {
            typeface = typefaceB;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }
}
