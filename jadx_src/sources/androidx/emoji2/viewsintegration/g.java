package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.annotation.RestrictTo;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: EmojiTextWatcher.java */
/* JADX INFO: loaded from: classes6.dex */
@w0(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class g implements TextWatcher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EditText f23207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f23208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.emoji2.text.f.AbstractC0166f f23209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23210e = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23211f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f23212g = true;

    /* JADX INFO: compiled from: EmojiTextWatcher.java */
    @w0(19)
    public static class a extends androidx.emoji2.text.f.AbstractC0166f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Reference<EditText> f23213a;

        a(EditText editText) {
            this.f23213a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.f.AbstractC0166f
        public void b() {
            super.b();
            g.e(this.f23213a.get(), 1);
        }
    }

    g(EditText editText, boolean z10) {
        this.f23207b = editText;
        this.f23208c = z10;
    }

    private androidx.emoji2.text.f.AbstractC0166f b() {
        if (this.f23209d == null) {
            this.f23209d = new a(this.f23207b);
        }
        return this.f23209d;
    }

    static void e(@p0 EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.f.b().u(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean i() {
        return (this.f23212g && (this.f23208c || androidx.emoji2.text.f.n())) ? false : true;
    }

    int a() {
        return this.f23211f;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    int c() {
        return this.f23210e;
    }

    public boolean d() {
        return this.f23212g;
    }

    void f(int i10) {
        this.f23211f = i10;
    }

    public void g(boolean z10) {
        if (this.f23212g != z10) {
            if (this.f23209d != null) {
                androidx.emoji2.text.f.b().C(this.f23209d);
            }
            this.f23212g = z10;
            if (z10) {
                e(this.f23207b, androidx.emoji2.text.f.b().f());
            }
        }
    }

    void h(int i10) {
        this.f23210e = i10;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.f23207b.isInEditMode() || i() || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iF = androidx.emoji2.text.f.b().f();
        if (iF != 0) {
            if (iF == 1) {
                androidx.emoji2.text.f.b().x((Spannable) charSequence, i10, i10 + i12, this.f23210e, this.f23211f);
                return;
            } else if (iF != 3) {
                return;
            }
        }
        androidx.emoji2.text.f.b().y(b());
    }
}
