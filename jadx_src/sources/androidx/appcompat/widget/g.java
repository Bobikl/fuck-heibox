package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.appcompat.R;

/* JADX INFO: compiled from: AppCompatEmojiEditTextHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final EditText f2811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    private final androidx.emoji2.viewsintegration.a f2812b;

    g(@androidx.annotation.n0 EditText editText) {
        this.f2811a = editText;
        this.f2812b = new androidx.emoji2.viewsintegration.a(editText, false);
    }

    @androidx.annotation.p0
    KeyListener a(@androidx.annotation.p0 KeyListener keyListener) {
        return b(keyListener) ? this.f2812b.b(keyListener) : keyListener;
    }

    boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    boolean c() {
        return this.f2812b.d();
    }

    void d(@androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f2811a.getContext().obtainStyledAttributes(attributeSet, R.styleable.f1579l, i10, 0);
        try {
            int i11 = R.styleable.AppCompatTextView_emojiCompatEnabled;
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(i11) ? typedArrayObtainStyledAttributes.getBoolean(i11, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            f(z10);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @androidx.annotation.p0
    InputConnection e(@androidx.annotation.p0 InputConnection inputConnection, @androidx.annotation.n0 EditorInfo editorInfo) {
        return this.f2812b.e(inputConnection, editorInfo);
    }

    void f(boolean z10) {
        this.f2812b.g(z10);
    }
}
