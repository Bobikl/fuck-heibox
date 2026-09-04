package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: EmojiInputFilter.java */
/* JADX INFO: loaded from: classes6.dex */
@w0(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class d implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f23196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.emoji2.text.f.AbstractC0166f f23197b;

    /* JADX INFO: compiled from: EmojiInputFilter.java */
    @w0(19)
    public static class a extends androidx.emoji2.text.f.AbstractC0166f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Reference<TextView> f23198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Reference<d> f23199b;

        a(TextView textView, d dVar) {
            this.f23198a = new WeakReference(textView);
            this.f23199b = new WeakReference(dVar);
        }

        private boolean c(@p0 TextView textView, @p0 InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.f.AbstractC0166f
        public void b() {
            CharSequence text;
            CharSequence charSequenceU;
            super.b();
            TextView textView = this.f23198a.get();
            if (c(textView, this.f23199b.get()) && textView.isAttachedToWindow() && text != (charSequenceU = androidx.emoji2.text.f.b().u((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(charSequenceU);
                int selectionEnd = Selection.getSelectionEnd(charSequenceU);
                textView.setText(charSequenceU);
                if (charSequenceU instanceof Spannable) {
                    d.b((Spannable) charSequenceU, selectionStart, selectionEnd);
                }
            }
        }
    }

    d(@n0 TextView textView) {
        this.f23196a = textView;
    }

    private androidx.emoji2.text.f.AbstractC0166f a() {
        if (this.f23197b == null) {
            this.f23197b = new a(this.f23196a, this);
        }
        return this.f23197b;
    }

    static void b(Spannable spannable, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0) {
            Selection.setSelection(spannable, i10, i11);
        } else if (i10 >= 0) {
            Selection.setSelection(spannable, i10);
        } else if (i11 >= 0) {
            Selection.setSelection(spannable, i11);
        }
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (this.f23196a.isInEditMode()) {
            return charSequence;
        }
        int iF = androidx.emoji2.text.f.b().f();
        if (iF != 0) {
            boolean z10 = true;
            if (iF == 1) {
                if (i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == this.f23196a.getText()) {
                    z10 = false;
                }
                if (!z10 || charSequence == null) {
                    return charSequence;
                }
                if (i10 != 0 || i11 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return androidx.emoji2.text.f.b().v(charSequence, 0, charSequence.length());
            }
            if (iF != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.f.b().y(a());
        return charSequence;
    }
}
