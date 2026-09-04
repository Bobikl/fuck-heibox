package n1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.t0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LetterSpacingSpanPx.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Ln1/f;", "Landroid/text/style/MetricAffectingSpan;", "Landroid/text/TextPaint;", "Lkotlin/b2;", "b", "textPaint", "updateDrawState", "updateMeasureState", "", "letterSpacing", "F", ak.av, "()F", "<init>", "(F)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
@androidx.compose.ui.text.android.g
public final class f extends MetricAffectingSpan {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f131945c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f131946b;

    public f(@t0 float f10) {
        this.f131946b = f10;
    }

    private final void b(TextPaint textPaint) {
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (textSize == 0.0f) {
            return;
        }
        textPaint.setLetterSpacing(this.f131946b / textSize);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getF131946b() {
        return this.f131946b;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@dl.d TextPaint textPaint) {
        f0.p(textPaint, "textPaint");
        b(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@dl.d TextPaint textPaint) {
        f0.p(textPaint, "textPaint");
        b(textPaint);
    }
}
