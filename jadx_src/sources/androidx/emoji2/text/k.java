package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: EmojiSpan.java */
/* JADX INFO: loaded from: classes6.dex */
@w0(19)
public abstract class k extends ReplacementSpan {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    private final i f23137c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint.FontMetricsInt f23136b = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private short f23138d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private short f23139e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f23140f = 1.0f;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    k(@n0 i iVar) {
        androidx.core.util.o.m(iVar, "metadata cannot be null");
        this.f23137c = iVar;
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    public final int a() {
        return this.f23139e;
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    public final int b() {
        return c().g();
    }

    @n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final i c() {
        return this.f23137c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    final float d() {
        return this.f23140f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    final int e() {
        return this.f23138d;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@n0 Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, @p0 Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f23136b);
        Paint.FontMetricsInt fontMetricsInt2 = this.f23136b;
        this.f23140f = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f23137c.f();
        this.f23139e = (short) (this.f23137c.f() * this.f23140f);
        short sK = (short) (this.f23137c.k() * this.f23140f);
        this.f23138d = sK;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f23136b;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sK;
    }
}
