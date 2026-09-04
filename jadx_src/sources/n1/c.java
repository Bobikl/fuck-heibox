package n1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.compose.ui.text.android.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: IndentationFixSpan.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016Jp\u0010\u0017\u001a\u00020\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¨\u0006\u001a"}, d2 = {"Ln1/c;", "Landroid/text/style/LeadingMarginSpan;", "", "firstLine", "", "getLeadingMargin", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Paint;", "paint", com.google.android.exoplayer2.text.ttml.d.f49793l0, "dir", "top", "baseline", "bottom", "", "text", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "first", "Landroid/text/Layout;", com.google.android.exoplayer2.text.ttml.d.f49813w, "Lkotlin/b2;", "drawLeadingMargin", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
@androidx.compose.ui.text.android.g
public final class c implements LeadingMarginSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f131940b = 0;

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(@dl.e Canvas canvas, @dl.e Paint paint, int i10, int i11, int i12, int i13, int i14, @dl.e CharSequence charSequence, int i15, int i16, boolean z10, @dl.e Layout layout) {
        if (layout == null || paint == null) {
            return;
        }
        int lineForOffset = layout.getLineForOffset(i15);
        if (lineForOffset == layout.getLineCount() - 1 && w0.j(layout, lineForOffset)) {
            float fA = d.a(layout, lineForOffset, paint) + d.c(layout, lineForOffset, paint);
            if (fA == 0.0f) {
                return;
            }
            f0.m(canvas);
            canvas.translate(fA, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean firstLine) {
        return 0;
    }
}
