package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.R;

/* JADX INFO: compiled from: AppCompatEmojiTextHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final TextView f2816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    private final androidx.emoji2.viewsintegration.f f2817b;

    h(@androidx.annotation.n0 TextView textView) {
        this.f2816a = textView;
        this.f2817b = new androidx.emoji2.viewsintegration.f(textView, false);
    }

    @androidx.annotation.n0
    InputFilter[] a(@androidx.annotation.n0 InputFilter[] inputFilterArr) {
        return this.f2817b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f2817b.b();
    }

    void c(@androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f2816a.getContext().obtainStyledAttributes(attributeSet, R.styleable.f1579l, i10, 0);
        try {
            int i11 = R.styleable.AppCompatTextView_emojiCompatEnabled;
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(i11) ? typedArrayObtainStyledAttributes.getBoolean(i11, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    void d(boolean z10) {
        this.f2817b.c(z10);
    }

    void e(boolean z10) {
        this.f2817b.d(z10);
    }

    @androidx.annotation.p0
    public TransformationMethod f(@androidx.annotation.p0 TransformationMethod transformationMethod) {
        return this.f2817b.f(transformationMethod);
    }
}
