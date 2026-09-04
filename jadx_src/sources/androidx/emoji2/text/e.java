package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.core.graphics.j0;

/* JADX INFO: compiled from: DefaultGlyphChecker.java */
/* JADX INFO: loaded from: classes6.dex */
@androidx.annotation.d
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class e implements f.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f22944b = 10;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ThreadLocal<StringBuilder> f22945c = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextPaint f22946a;

    e() {
        TextPaint textPaint = new TextPaint();
        this.f22946a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    private static StringBuilder b() {
        ThreadLocal<StringBuilder> threadLocal = f22945c;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    @Override // androidx.emoji2.text.f.e
    public boolean a(@n0 CharSequence charSequence, int i10, int i11, int i12) {
        StringBuilder sbB = b();
        sbB.setLength(0);
        while (i10 < i11) {
            sbB.append(charSequence.charAt(i10));
            i10++;
        }
        return j0.a(this.f22946a, sbB.toString());
    }
}
