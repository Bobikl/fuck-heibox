package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.j1;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PaintExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a$\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002\u001a$\u0010\u000e\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0001\u001a,\u0010\u000f\u001a\u00020\t*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\u0002¨\u0006\u0010"}, d2 = {"Landroid/text/TextPaint;", "", "text", "", "startInclusive", "endExclusive", "Landroid/graphics/Rect;", ak.aF, "rect", "Lkotlin/b2;", ak.av, "Landroid/graphics/Paint;", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "d", "b", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class p {
    private static final void a(Rect rect, Rect rect2) {
        rect.right += rect2.width();
        rect.top = Math.min(rect.top, rect2.top);
        rect.bottom = Math.max(rect.bottom, rect2.bottom);
    }

    private static final void b(Paint paint, CharSequence charSequence, int i10, int i11, Rect rect) {
        if (Build.VERSION.SDK_INT >= 29) {
            o.a(paint, charSequence, i10, i11, rect);
        } else {
            paint.getTextBounds(charSequence.toString(), i10, i11, rect);
        }
    }

    @dl.d
    public static final Rect c(@dl.d TextPaint textPaint, @dl.d CharSequence text, int i10, int i11) {
        kotlin.jvm.internal.f0.p(textPaint, "<this>");
        kotlin.jvm.internal.f0.p(text, "text");
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            if (q.b(spanned, MetricAffectingSpan.class, i10, i11)) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i10 < i11) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i10, i11, MetricAffectingSpan.class);
                    MetricAffectingSpan[] spans = (MetricAffectingSpan[]) spanned.getSpans(i10, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    kotlin.jvm.internal.f0.o(spans, "spans");
                    for (MetricAffectingSpan metricAffectingSpan : spans) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    b(textPaint2, text, i10, iNextSpanTransition, rect2);
                    a(rect, rect2);
                    i10 = iNextSpanTransition;
                }
                return rect;
            }
        }
        return d(textPaint, text, i10, i11);
    }

    @j1
    @dl.d
    public static final Rect d(@dl.d Paint paint, @dl.d CharSequence text, int i10, int i11) {
        kotlin.jvm.internal.f0.p(paint, "<this>");
        kotlin.jvm.internal.f0.p(text, "text");
        Rect rect = new Rect();
        b(paint, text, i10, i11, rect);
        return rect;
    }
}
