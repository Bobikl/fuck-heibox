package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import com.umeng.analytics.pro.ak;
import java.text.BreakIterator;
import java.util.Comparator;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: compiled from: LayoutIntrinsics.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a \u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002H\u0002¨\u0006\u000b"}, d2 = {"", "text", "Landroid/text/TextPaint;", "paint", "", ak.aF, "desiredWidth", "charSequence", "textPaint", "", "e", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class m {
    public static final float c(@dl.d CharSequence text, @dl.d TextPaint paint) {
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(paint, "paint");
        BreakIterator lineInstance = BreakIterator.getLineInstance(paint.getTextLocale());
        int i10 = 0;
        lineInstance.setText(new e(text, 0, text.length()));
        PriorityQueue<Pair> priorityQueue = new PriorityQueue(10, new Comparator() { // from class: androidx.compose.ui.text.android.l
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return m.d((Pair) obj, (Pair) obj2);
            }
        });
        int next = lineInstance.next();
        while (true) {
            int i11 = i10;
            i10 = next;
            if (i10 == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i11), Integer.valueOf(i10)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.f()).intValue() - ((Number) pair.e()).intValue() < i10 - i11) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i11), Integer.valueOf(i10)));
                }
            }
            next = lineInstance.next();
        }
        float fMax = 0.0f;
        for (Pair pair2 : priorityQueue) {
            fMax = Math.max(fMax, Layout.getDesiredWidth(text, ((Number) pair2.a()).intValue(), ((Number) pair2.b()).intValue(), paint));
        }
        return fMax;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(Pair pair, Pair pair2) {
        return (((Number) pair.f()).intValue() - ((Number) pair.e()).intValue()) - (((Number) pair2.f()).intValue() - ((Number) pair2.e()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(float f10, CharSequence charSequence, TextPaint textPaint) {
        if (!(f10 == 0.0f) && (charSequence instanceof Spanned)) {
            if (!(textPaint.getLetterSpacing() == 0.0f)) {
                return true;
            }
            Spanned spanned = (Spanned) charSequence;
            if (q.a(spanned, n1.f.class) || q.a(spanned, n1.e.class)) {
                return true;
            }
        }
        return false;
    }
}
