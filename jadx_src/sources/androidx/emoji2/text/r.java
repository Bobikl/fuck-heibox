package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import androidx.annotation.RestrictTo;
import androidx.annotation.f0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: TypefaceEmojiSpan.java */
/* JADX INFO: loaded from: classes6.dex */
@w0(19)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class r extends k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private static Paint f23183g;

    public r(@n0 i iVar) {
        super(iVar);
    }

    @n0
    private static Paint f() {
        if (f23183g == null) {
            TextPaint textPaint = new TextPaint();
            f23183g = textPaint;
            textPaint.setColor(f.b().e());
            f23183g.setStyle(Paint.Style.FILL);
        }
        return f23183g;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@n0 Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, @f0(from = 0) int i10, @f0(from = 0) int i11, float f10, int i12, int i13, int i14, @n0 Paint paint) {
        if (f.b().o()) {
            canvas.drawRect(f10, i12, f10 + e(), i14, f());
        }
        c().a(canvas, f10, i13, paint);
    }
}
