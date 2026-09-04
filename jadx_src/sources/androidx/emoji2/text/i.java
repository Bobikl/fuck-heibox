package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.RestrictTo;
import androidx.annotation.f0;
import androidx.annotation.n0;
import androidx.annotation.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: EmojiMetadata.java */
/* JADX INFO: loaded from: classes6.dex */
@androidx.annotation.d
@w0(19)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f23110d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f23111e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f23112f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ThreadLocal<androidx.emoji2.text.flatbuffer.n> f23113g = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final p f23115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f23116c = 0;

    /* JADX INFO: compiled from: EmojiMetadata.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    i(@n0 p pVar, @f0(from = 0) int i10) {
        this.f23115b = pVar;
        this.f23114a = i10;
    }

    private androidx.emoji2.text.flatbuffer.n h() {
        ThreadLocal<androidx.emoji2.text.flatbuffer.n> threadLocal = f23113g;
        androidx.emoji2.text.flatbuffer.n nVar = threadLocal.get();
        if (nVar == null) {
            nVar = new androidx.emoji2.text.flatbuffer.n();
            threadLocal.set(nVar);
        }
        this.f23115b.g().J(nVar, this.f23114a);
        return nVar;
    }

    public void a(@n0 Canvas canvas, float f10, float f11, @n0 Paint paint) {
        Typeface typefaceJ = this.f23115b.j();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceJ);
        canvas.drawText(this.f23115b.f(), this.f23114a * 2, 2, f10, f11, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i10) {
        return h().F(i10);
    }

    public int c() {
        return h().I();
    }

    public short d() {
        return h().L();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int e() {
        return this.f23116c;
    }

    public short f() {
        return h().S();
    }

    public int g() {
        return h().T();
    }

    public short i() {
        return h().U();
    }

    @n0
    public Typeface j() {
        return this.f23115b.j();
    }

    public short k() {
        return h().X();
    }

    public boolean l() {
        return h().O();
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    public void m() {
        this.f23116c = 0;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void n(boolean z10) {
        this.f23116c = z10 ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(g()));
        sb2.append(", codepoints:");
        int iC = c();
        for (int i10 = 0; i10 < iC; i10++) {
            sb2.append(Integer.toHexString(b(i10)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
