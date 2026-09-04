package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: StaticLayoutFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010#\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020\b\u0012\b\u0010+\u001a\u0004\u0018\u00010'\u0012\u0006\u0010-\u001a\u00020\b\u0012\u0006\u00103\u001a\u00020.\u0012\u0006\u00105\u001a\u00020.\u0012\u0006\u00106\u001a\u00020\b\u0012\u0006\u0010:\u001a\u000207\u0012\u0006\u0010<\u001a\u000207\u0012\u0006\u0010>\u001a\u00020\b\u0012\u0006\u0010?\u001a\u00020\b\u0012\u0006\u0010@\u001a\u00020\b\u0012\u0006\u0010A\u001a\u00020\b\u0012\b\u0010E\u001a\u0004\u0018\u00010B\u0012\b\u0010F\u001a\u0004\u0018\u00010B¢\u0006\u0004\bG\u0010HR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010#\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0003\u0010\"R\u0017\u0010&\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010\n\u001a\u0004\b%\u0010\fR\u0019\u0010+\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u000e\u0010*R\u0017\u0010-\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b,\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0017\u00103\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u00105\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b4\u00102R\u0017\u00106\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b1\u0010\n\u001a\u0004\b$\u0010\fR\u0017\u0010:\u001a\u0002078\u0006¢\u0006\f\n\u0004\b%\u00108\u001a\u0004\b \u00109R\u0017\u0010<\u001a\u0002078\u0006¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\b;\u00109R\u0017\u0010>\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b=\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010?\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b,\u0010\fR\u0017\u0010@\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b/\u0010\fR\u0017\u0010A\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001a\u0010\fR\u0019\u0010E\u001a\u0004\u0018\u00010B8\u0006¢\u0006\f\n\u0004\b;\u0010C\u001a\u0004\b(\u0010DR\u0019\u0010F\u001a\u0004\u0018\u00010B8\u0006¢\u0006\f\n\u0004\b\u0017\u0010C\u001a\u0004\b=\u0010D¨\u0006I"}, d2 = {"Landroidx/compose/ui/text/android/b0;", "", "", ak.av, "Ljava/lang/CharSequence;", "r", "()Ljava/lang/CharSequence;", "text", "", "b", "I", "q", "()I", com.google.android.exoplayer2.text.ttml.d.f49798o0, ak.aF, "e", com.google.android.exoplayer2.text.ttml.d.f49800p0, "Landroid/text/TextPaint;", "d", "Landroid/text/TextPaint;", "o", "()Landroid/text/TextPaint;", "paint", ak.aG, "width", "Landroid/text/TextDirectionHeuristic;", "f", "Landroid/text/TextDirectionHeuristic;", ak.aB, "()Landroid/text/TextDirectionHeuristic;", "textDir", "Landroid/text/Layout$Alignment;", "g", "Landroid/text/Layout$Alignment;", "()Landroid/text/Layout$Alignment;", "alignment", RXScreenCaptureService.KEY_HEIGHT, "n", "maxLines", "Landroid/text/TextUtils$TruncateAt;", "i", "Landroid/text/TextUtils$TruncateAt;", "()Landroid/text/TextUtils$TruncateAt;", "ellipsize", "j", "ellipsizedWidth", "", "k", "F", "m", "()F", "lineSpacingMultiplier", "l", "lineSpacingExtra", "justificationMode", "", "Z", "()Z", "includePadding", "t", "useFallbackLineSpacing", "p", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "", "[I", "()[I", "leftIndents", "rightIndents", "<init>", "(Ljava/lang/CharSequence;IILandroid/text/TextPaint;ILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IFFIZZIIII[I[I)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final CharSequence text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int start;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int end;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final TextPaint paint;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int width;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final TextDirectionHeuristic textDir;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Layout.Alignment alignment;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final TextUtils.TruncateAt ellipsize;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int ellipsizedWidth;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final float lineSpacingMultiplier;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final float lineSpacingExtra;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final int justificationMode;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean includePadding;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final boolean useFallbackLineSpacing;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final int breakStrategy;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final int lineBreakStyle;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final int lineBreakWordStyle;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final int hyphenationFrequency;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final int[] leftIndents;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final int[] rightIndents;

    public b0(@dl.d CharSequence text, int i10, int i11, @dl.d TextPaint paint, int i12, @dl.d TextDirectionHeuristic textDir, @dl.d Layout.Alignment alignment, int i13, @dl.e TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int i18, int i19, @dl.e int[] iArr, @dl.e int[] iArr2) {
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(paint, "paint");
        kotlin.jvm.internal.f0.p(textDir, "textDir");
        kotlin.jvm.internal.f0.p(alignment, "alignment");
        this.text = text;
        this.start = i10;
        this.end = i11;
        this.paint = paint;
        this.width = i12;
        this.textDir = textDir;
        this.alignment = alignment;
        this.maxLines = i13;
        this.ellipsize = truncateAt;
        this.ellipsizedWidth = i14;
        this.lineSpacingMultiplier = f10;
        this.lineSpacingExtra = f11;
        this.justificationMode = i15;
        this.includePadding = z10;
        this.useFallbackLineSpacing = z11;
        this.breakStrategy = i16;
        this.lineBreakStyle = i17;
        this.lineBreakWordStyle = i18;
        this.hyphenationFrequency = i19;
        this.leftIndents = iArr;
        this.rightIndents = iArr2;
        if (!(i10 >= 0 && i10 <= i11)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i11 >= 0 && i11 <= text.length())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i13 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i12 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i14 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(f10 >= 0.0f)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public /* synthetic */ b0(CharSequence charSequence, int i10, int i11, TextPaint textPaint, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int i18, int i19, int[] iArr, int[] iArr2, int i20, kotlin.jvm.internal.u uVar) {
        this(charSequence, (i20 & 2) != 0 ? 0 : i10, i11, textPaint, i12, textDirectionHeuristic, alignment, i13, truncateAt, i14, f10, f11, i15, z10, z11, i16, i17, i18, i19, iArr, iArr2);
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Layout.Alignment getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getBreakStrategy() {
        return this.breakStrategy;
    }

    @dl.e
    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextUtils.TruncateAt getEllipsize() {
        return this.ellipsize;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getEllipsizedWidth() {
        return this.ellipsizedWidth;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getHyphenationFrequency() {
        return this.hyphenationFrequency;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getJustificationMode() {
        return this.justificationMode;
    }

    @dl.e
    /* JADX INFO: renamed from: i, reason: from getter */
    public final int[] getLeftIndents() {
        return this.leftIndents;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getLineBreakStyle() {
        return this.lineBreakStyle;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getLineBreakWordStyle() {
        return this.lineBreakWordStyle;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final float getLineSpacingExtra() {
        return this.lineSpacingExtra;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final float getLineSpacingMultiplier() {
        return this.lineSpacingMultiplier;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    @dl.d
    /* JADX INFO: renamed from: o, reason: from getter */
    public final TextPaint getPaint() {
        return this.paint;
    }

    @dl.e
    /* JADX INFO: renamed from: p, reason: from getter */
    public final int[] getRightIndents() {
        return this.rightIndents;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    @dl.d
    /* JADX INFO: renamed from: r, reason: from getter */
    public final CharSequence getText() {
        return this.text;
    }

    @dl.d
    /* JADX INFO: renamed from: s, reason: from getter */
    public final TextDirectionHeuristic getTextDir() {
        return this.textDir;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getUseFallbackLineSpacing() {
        return this.useFallbackLineSpacing;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final int getWidth() {
        return this.width;
    }
}
