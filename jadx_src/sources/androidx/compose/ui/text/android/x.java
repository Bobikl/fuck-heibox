package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: StaticLayoutFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)JØ\u0001\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u00042\b\b\u0003\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001dJ\u0016\u0010#\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u0016R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, d2 = {"Landroidx/compose/ui/text/android/x;", "", "", "text", "", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "Landroid/text/TextPaint;", "paint", "width", "Landroid/text/TextDirectionHeuristic;", "textDir", "Landroid/text/Layout$Alignment;", "alignment", "maxLines", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "ellipsizedWidth", "", "lineSpacingMultiplier", "lineSpacingExtra", "justificationMode", "", "includePadding", "useFallbackLineSpacing", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "", "leftIndents", "rightIndents", "Landroid/text/StaticLayout;", ak.av, com.google.android.exoplayer2.text.ttml.d.f49813w, ak.aF, "Landroidx/compose/ui/text/android/z;", "b", "Landroidx/compose/ui/text/android/z;", "delegate", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final x f16357a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final z delegate = new r();

    private x() {
    }

    @dl.d
    public final StaticLayout a(@dl.d CharSequence text, int start, int end, @dl.d TextPaint paint, int width, @dl.d TextDirectionHeuristic textDir, @dl.d Layout.Alignment alignment, @androidx.annotation.f0(from = 0) int maxLines, @dl.e TextUtils.TruncateAt ellipsize, @androidx.annotation.f0(from = 0) int ellipsizedWidth, @androidx.annotation.x(from = 0.0d) float lineSpacingMultiplier, float lineSpacingExtra, int justificationMode, boolean includePadding, boolean useFallbackLineSpacing, int breakStrategy, int lineBreakStyle, int lineBreakWordStyle, int hyphenationFrequency, @dl.e int[] leftIndents, @dl.e int[] rightIndents) {
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(paint, "paint");
        kotlin.jvm.internal.f0.p(textDir, "textDir");
        kotlin.jvm.internal.f0.p(alignment, "alignment");
        return delegate.a(new b0(text, start, end, paint, width, textDir, alignment, maxLines, ellipsize, ellipsizedWidth, lineSpacingMultiplier, lineSpacingExtra, justificationMode, includePadding, useFallbackLineSpacing, breakStrategy, lineBreakStyle, lineBreakWordStyle, hyphenationFrequency, leftIndents, rightIndents));
    }

    public final boolean c(@dl.d StaticLayout layout, boolean useFallbackLineSpacing) {
        kotlin.jvm.internal.f0.p(layout, "layout");
        return delegate.b(layout, useFallbackLineSpacing);
    }
}
