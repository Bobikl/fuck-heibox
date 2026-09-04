package androidx.emoji2.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.annotation.n0;
import androidx.annotation.w0;
import java.util.stream.IntStream;

/* JADX INFO: compiled from: UnprecomputeTextOnModificationSpannable.java */
/* JADX INFO: loaded from: classes6.dex */
public class u implements Spannable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23184b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    private Spannable f23185c;

    /* JADX INFO: compiled from: UnprecomputeTextOnModificationSpannable.java */
    @w0(24)
    public static class a {
        private a() {
        }

        static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* JADX INFO: compiled from: UnprecomputeTextOnModificationSpannable.java */
    public static class b {
        b() {
        }

        boolean a(CharSequence charSequence) {
            return charSequence instanceof androidx.core.text.l;
        }
    }

    /* JADX INFO: compiled from: UnprecomputeTextOnModificationSpannable.java */
    @w0(28)
    public static class c extends b {
        c() {
        }

        @Override // androidx.emoji2.text.u.b
        boolean a(CharSequence charSequence) {
            return (charSequence instanceof PrecomputedText) || (charSequence instanceof androidx.core.text.l);
        }
    }

    u(@n0 Spannable spannable) {
        this.f23185c = spannable;
    }

    u(@n0 Spanned spanned) {
        this.f23185c = new SpannableString(spanned);
    }

    u(@n0 CharSequence charSequence) {
        this.f23185c = new SpannableString(charSequence);
    }

    private void a() {
        Spannable spannable = this.f23185c;
        if (!this.f23184b && c().a(spannable)) {
            this.f23185c = new SpannableString(spannable);
        }
        this.f23184b = true;
    }

    static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    Spannable b() {
        return this.f23185c;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f23185c.charAt(i10);
    }

    @Override // java.lang.CharSequence
    @n0
    @w0(api = 24)
    public IntStream chars() {
        return a.a(this.f23185c);
    }

    @Override // java.lang.CharSequence
    @n0
    @w0(api = 24)
    public IntStream codePoints() {
        return a.b(this.f23185c);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f23185c.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f23185c.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f23185c.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return (T[]) this.f23185c.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f23185c.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f23185c.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.f23185c.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f23185c.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    @n0
    public CharSequence subSequence(int i10, int i11) {
        return this.f23185c.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    @n0
    public String toString() {
        return this.f23185c.toString();
    }
}
