package androidx.emoji2.viewsintegration;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: EmojiTransformationMethod.java */
/* JADX INFO: loaded from: classes6.dex */
@w0(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class h implements TransformationMethod {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final TransformationMethod f23214b;

    h(@p0 TransformationMethod transformationMethod) {
        this.f23214b = transformationMethod;
    }

    public TransformationMethod a() {
        return this.f23214b;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(@p0 CharSequence charSequence, @n0 View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f23214b;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || androidx.emoji2.text.f.b().f() != 1) ? charSequence : androidx.emoji2.text.f.b().u(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i10, Rect rect) {
        TransformationMethod transformationMethod = this.f23214b;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z10, i10, rect);
        }
    }
}
