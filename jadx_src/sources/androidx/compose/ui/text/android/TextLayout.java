package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.j1;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: compiled from: TextLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BÐ\u0001\u0012\u0006\u0010s\u001a\u00020n\u0012\b\b\u0002\u0010t\u001a\u00020\u0004\u0012\u0006\u0010v\u001a\u00020u\u0012\b\b\u0002\u0010w\u001a\u00020\u0002\u0012\n\b\u0002\u0010y\u001a\u0004\u0018\u00010x\u0012\b\b\u0002\u0010z\u001a\u00020\u0002\u0012\b\b\u0002\u0010{\u001a\u00020\u0004\u0012\b\b\u0003\u0010|\u001a\u00020\u0004\u0012\b\b\u0002\u00107\u001a\u00020\u0013\u0012\b\b\u0002\u0010:\u001a\u00020\u0013\u0012\b\b\u0002\u0010}\u001a\u00020\u0002\u0012\b\b\u0002\u0010~\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u007f\u001a\u00020\u0002\u0012\t\b\u0002\u0010\u0080\u0001\u001a\u00020\u0002\u0012\t\b\u0002\u0010\u0081\u0001\u001a\u00020\u0002\u0012\t\b\u0002\u0010\u0082\u0001\u001a\u00020\u0002\u0012\f\b\u0002\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u0001\u0012\f\b\u0002\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0083\u0001\u0012\b\b\u0002\u0010@\u001a\u00020;¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002J\u0016\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0004J\u0018\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u0013J\u0018\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u0013J\u000e\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002J\u000e\u0010 \u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0002J\u000e\u0010!\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$J&\u0010-\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0002J\u000e\u0010/\u001a\u00020.2\u0006\u0010\u001b\u001a\u00020\u0002J\u000e\u00102\u001a\u00020&2\u0006\u00101\u001a\u000200J\u000f\u00103\u001a\u00020\u0013H\u0000¢\u0006\u0004\b3\u00104R\u0017\u00107\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b-\u00105\u001a\u0004\b6\u00104R\u0017\u0010:\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b9\u00104R\u0017\u0010@\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010B\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b/\u00105\u001a\u0004\bA\u00104R \u0010I\u001a\u00020C8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010D\u0012\u0004\bG\u0010H\u001a\u0004\bE\u0010FR\u0017\u0010L\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010!\u001a\u0004\bJ\u0010KR \u0010P\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bM\u0010!\u0012\u0004\bO\u0010H\u001a\u0004\bN\u0010KR \u0010R\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010!\u0012\u0004\bQ\u0010H\u001a\u0004\b8\u0010KR\u0014\u0010T\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010SR\u0014\u0010U\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010SR\u0014\u0010W\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u00105R\u0016\u0010[\u001a\u0004\u0018\u00010X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\\\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010!R\u0014\u0010_\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010^R\u001b\u0010c\u001a\u00020`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010a\u001a\u0004\bY\u0010bR\u0011\u0010e\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bS\u0010dR\u0011\u0010g\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bf\u0010dR\u001d\u0010j\u001a\b\u0012\u0004\u0012\u00020i0h8\u0006¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u0011\u0010q\u001a\u00020n8F¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0011\u0010r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bM\u0010K¨\u0006\u0088\u0001"}, d2 = {"Landroidx/compose/ui/text/android/TextLayout;", "", "", "line", "", RXScreenCaptureService.KEY_HEIGHT, "lineIndex", ak.aD, androidx.exifinterface.media.a.W4, "C", "p", "n", "o", "r", "x", androidx.exifinterface.media.a.S4, "B", ak.aG, "D", "", androidx.exifinterface.media.a.R4, "t", ak.aB, "vertical", RXScreenCaptureService.KEY_WIDTH, "horizontal", "H", androidx.constraintlayout.core.motion.utils.w.c.R, "upstream", "J", "L", "v", androidx.exifinterface.media.a.f23244d5, "I", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "Landroid/graphics/Path;", "dest", "Lkotlin/b2;", "N", "startOffset", "endOffset", "", "array", "arrayStart", ak.av, "Landroid/graphics/RectF;", "d", "Landroid/graphics/Canvas;", "canvas", "U", "R", "()Z", "Z", "i", "includePadding", "b", "f", "fallbackLineSpacing", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", ak.aF, "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "m", "()Landroidx/compose/ui/text/android/LayoutIntrinsics;", "layoutIntrinsics", "e", "didExceedMaxLines", "Landroid/text/Layout;", "Landroid/text/Layout;", "j", "()Landroid/text/Layout;", "getLayout$annotations", "()V", com.google.android.exoplayer2.text.ttml.d.f49813w, "q", "()I", "lineCount", "g", "P", "getTopPadding$ui_text_release$annotations", "topPadding", "getBottomPadding$ui_text_release$annotations", "bottomPadding", "F", "leftPadding", "rightPadding", "k", "isBoringLayout", "Landroid/graphics/Paint$FontMetricsInt;", "l", "Landroid/graphics/Paint$FontMetricsInt;", "lastLineFontMetrics", "lastLineExtra", "Landroidx/compose/ui/text/android/v0;", "Landroidx/compose/ui/text/android/v0;", "textCanvas", "Landroidx/compose/ui/text/android/j;", "Lkotlin/z;", "()Landroidx/compose/ui/text/android/j;", "layoutHelper", "()F", "maxIntrinsicWidth", "G", "minIntrinsicWidth", "", "Ln1/h;", "lineHeightSpans", "[Ln1/h;", "y", "()[Ln1/h;", "", "O", "()Ljava/lang/CharSequence;", "text", "height", "charSequence", "width", "Landroid/text/TextPaint;", "textPaint", "alignment", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "textDirectionHeuristic", "lineSpacingMultiplier", "lineSpacingExtra", "maxLines", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "justificationMode", "", "leftIndents", "rightIndents", "<init>", "(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZZIIIIII[I[ILandroidx/compose/ui/text/android/LayoutIntrinsics;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
@g
public final class TextLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f16261q = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean includePadding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean fallbackLineSpacing;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LayoutIntrinsics layoutIntrinsics;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean didExceedMaxLines;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Layout layout;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int lineCount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int topPadding;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int bottomPadding;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final float leftPadding;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final float rightPadding;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final boolean isBoringLayout;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final Paint.FontMetricsInt lastLineFontMetrics;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final int lastLineExtra;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final n1.h[] f16275n;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final v0 textCanvas;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlin.z layoutHelper;

    public TextLayout(@dl.d CharSequence charSequence, float f10, @dl.d TextPaint textPaint, int i10, @dl.e TextUtils.TruncateAt truncateAt, int i11, float f11, @androidx.annotation.t0 float f12, boolean z10, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, @dl.e int[] iArr, @dl.e int[] iArr2, @dl.d LayoutIntrinsics layoutIntrinsics) {
        boolean z12;
        boolean z13;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutA;
        kotlin.jvm.internal.f0.p(charSequence, "charSequence");
        kotlin.jvm.internal.f0.p(textPaint, "textPaint");
        kotlin.jvm.internal.f0.p(layoutIntrinsics, "layoutIntrinsics");
        this.includePadding = z10;
        this.fallbackLineSpacing = z11;
        this.layoutIntrinsics = layoutIntrinsics;
        this.textCanvas = new v0();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicH = w0.h(i11);
        Layout.Alignment alignmentA = d0.f16304a.a(i10);
        boolean z14 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, n1.a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsA = layoutIntrinsics.a();
            double d10 = f10;
            int iCeil = (int) Math.ceil(d10);
            if (metricsA == null || layoutIntrinsics.b() > f10 || z14) {
                z12 = true;
                this.isBoringLayout = false;
                z13 = false;
                textDirectionHeuristic = textDirectionHeuristicH;
                layoutA = x.f16357a.a(charSequence, 0, charSequence.length(), textPaint, iCeil, textDirectionHeuristicH, alignmentA, i12, truncateAt, (int) Math.ceil(d10), f11, f12, i17, z10, z11, i13, i14, i15, i16, iArr, iArr2);
            } else {
                this.isBoringLayout = true;
                z12 = true;
                layoutA = c.f16302a.a(charSequence, textPaint, iCeil, metricsA, alignmentA, z10, z11, truncateAt, iCeil);
                z13 = false;
                textDirectionHeuristic = textDirectionHeuristicH;
            }
            this.layout = layoutA;
            Trace.endSection();
            int iMin = Math.min(layoutA.getLineCount(), i12);
            this.lineCount = iMin;
            this.didExceedMaxLines = (iMin >= i12 && (layoutA.getEllipsisCount(iMin + (-1)) > 0 || layoutA.getLineEnd(iMin + (-1)) != charSequence.length())) ? z12 : z13;
            Pair pairI = w0.i(this);
            n1.h[] hVarArrG = w0.g(this);
            this.f16275n = hVarArrG;
            Pair pairF = w0.f(this, hVarArrG);
            this.topPadding = Math.max(((Number) pairI.e()).intValue(), ((Number) pairF.e()).intValue());
            this.bottomPadding = Math.max(((Number) pairI.f()).intValue(), ((Number) pairF.f()).intValue());
            Pair pairE = w0.e(this, textPaint, textDirectionHeuristic, hVarArrG);
            this.lastLineFontMetrics = (Paint.FontMetricsInt) pairE.e();
            this.lastLineExtra = ((Number) pairE.f()).intValue();
            this.leftPadding = n1.d.b(layoutA, iMin - 1, null, 2, null);
            this.rightPadding = n1.d.d(layoutA, iMin - 1, null, 2, null);
            this.layoutHelper = kotlin.b0.b(LazyThreadSafetyMode.NONE, new yh.a<j>() { // from class: androidx.compose.ui.text.android.TextLayout$layoutHelper$2
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final j invoke() {
                    return new j(this.f16278b.getLayout());
                }
            });
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextLayout(CharSequence charSequence, float f10, TextPaint textPaint, int i10, TextUtils.TruncateAt truncateAt, int i11, float f11, float f12, boolean z10, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, LayoutIntrinsics layoutIntrinsics, int i18, kotlin.jvm.internal.u uVar) {
        float f13 = (i18 & 2) != 0 ? 0.0f : f10;
        int i19 = (i18 & 8) != 0 ? 0 : i10;
        TextUtils.TruncateAt truncateAt2 = (i18 & 16) != 0 ? null : truncateAt;
        int i20 = (i18 & 32) != 0 ? 2 : i11;
        this(charSequence, f13, textPaint, i19, truncateAt2, i20, (i18 & 64) != 0 ? 1.0f : f11, (i18 & 128) != 0 ? 0.0f : f12, (i18 & 256) != 0 ? false : z10, (i18 & 512) != 0 ? true : z11, (i18 & 1024) != 0 ? Integer.MAX_VALUE : i12, (i18 & 2048) != 0 ? 0 : i13, (i18 & 4096) != 0 ? 0 : i14, (i18 & 8192) != 0 ? 0 : i15, (i18 & 16384) != 0 ? 0 : i16, (32768 & i18) != 0 ? 0 : i17, (65536 & i18) != 0 ? null : iArr, (131072 & i18) != 0 ? null : iArr2, (i18 & 262144) != 0 ? new LayoutIntrinsics(charSequence, textPaint, i20) : layoutIntrinsics);
    }

    public static /* synthetic */ float K(TextLayout textLayout, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return textLayout.J(i10, z10);
    }

    public static /* synthetic */ float M(TextLayout textLayout, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return textLayout.L(i10, z10);
    }

    @j1
    public static /* synthetic */ void Q() {
    }

    @j1
    public static /* synthetic */ void c() {
    }

    private final float h(int line) {
        if (line == this.lineCount - 1) {
            return this.leftPadding + this.rightPadding;
        }
        return 0.0f;
    }

    @j1
    public static /* synthetic */ void k() {
    }

    private final j l() {
        return (j) this.layoutHelper.getValue();
    }

    public final float A(int lineIndex) {
        return this.layout.getLineRight(lineIndex) + (lineIndex == this.lineCount + (-1) ? this.rightPadding : 0.0f);
    }

    public final int B(int lineIndex) {
        return this.layout.getLineStart(lineIndex);
    }

    public final float C(int line) {
        return this.layout.getLineTop(line) + (line == 0 ? 0 : this.topPadding);
    }

    public final int D(int lineIndex) {
        if (this.layout.getEllipsisStart(lineIndex) == 0) {
            return this.layout.getLineVisibleEnd(lineIndex);
        }
        return this.layout.getEllipsisStart(lineIndex) + this.layout.getLineStart(lineIndex);
    }

    public final float E(int lineIndex) {
        return this.layout.getLineWidth(lineIndex);
    }

    public final float F() {
        return this.layoutIntrinsics.b();
    }

    public final float G() {
        return this.layoutIntrinsics.c();
    }

    public final int H(int line, float horizontal) {
        return this.layout.getOffsetForHorizontal(line, horizontal + ((-1) * h(line)));
    }

    public final int I(int line) {
        return this.layout.getParagraphDirection(line);
    }

    public final float J(int offset, boolean upstream) {
        return l().c(offset, true, upstream) + h(v(offset));
    }

    public final float L(int offset, boolean upstream) {
        return l().c(offset, false, upstream) + h(v(offset));
    }

    public final void N(int i10, int i11, @dl.d Path dest) {
        kotlin.jvm.internal.f0.p(dest, "dest");
        this.layout.getSelectionPath(i10, i11, dest);
        if (this.topPadding == 0 || dest.isEmpty()) {
            return;
        }
        dest.offset(0.0f, this.topPadding);
    }

    @dl.d
    public final CharSequence O() {
        CharSequence text = this.layout.getText();
        kotlin.jvm.internal.f0.o(text, "layout.text");
        return text;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final int getTopPadding() {
        return this.topPadding;
    }

    public final boolean R() {
        if (this.isBoringLayout) {
            c cVar = c.f16302a;
            Layout layout = this.layout;
            kotlin.jvm.internal.f0.n(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return cVar.c((BoringLayout) layout);
        }
        x xVar = x.f16357a;
        Layout layout2 = this.layout;
        kotlin.jvm.internal.f0.n(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return xVar.c((StaticLayout) layout2, this.fallbackLineSpacing);
    }

    public final boolean S(int lineIndex) {
        return w0.j(this.layout, lineIndex);
    }

    public final boolean T(int offset) {
        return this.layout.isRtlCharAt(offset);
    }

    public final void U(@dl.d Canvas canvas) {
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        int i10 = this.topPadding;
        if (i10 != 0) {
            canvas.translate(0.0f, i10);
        }
        this.textCanvas.a(canvas);
        this.layout.draw(this.textCanvas);
        int i11 = this.topPadding;
        if (i11 != 0) {
            canvas.translate(0.0f, (-1) * i11);
        }
    }

    public final void a(int i10, int i11, @dl.d float[] array, int i12) {
        float fE;
        float f10;
        kotlin.jvm.internal.f0.p(array, "array");
        int length = O().length();
        int i13 = 1;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("startOffset must be > 0".toString());
        }
        if (!(i10 < length)) {
            throw new IllegalArgumentException("startOffset must be less than text length".toString());
        }
        if (!(i11 > i10)) {
            throw new IllegalArgumentException("endOffset must be greater than startOffset".toString());
        }
        if (!(i11 <= length)) {
            throw new IllegalArgumentException("endOffset must be smaller or equal to text length".toString());
        }
        if (!(array.length - i12 >= (i11 - i10) * 4)) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4".toString());
        }
        int iV = v(i10);
        int iV2 = v(i11 - 1);
        f fVar = new f(this);
        if (iV > iV2) {
            return;
        }
        int i14 = iV;
        int i15 = i12;
        while (true) {
            int iB = B(i14);
            int iU = u(i14);
            int iMin = Math.min(i11, iU);
            float fC = C(i14);
            float fP = p(i14);
            int i16 = I(i14) == i13 ? i13 : 0;
            int i17 = i16 ^ 1;
            for (int iMax = Math.max(i10, iB); iMax < iMin; iMax++) {
                boolean zT = T(iMax);
                if (i16 != 0 && !zT) {
                    fE = fVar.c(iMax);
                    f10 = fVar.d(iMax + 1);
                } else if (i16 != 0 && zT) {
                    f10 = fVar.e(iMax);
                    fE = fVar.f(iMax + 1);
                } else if (i17 == 0 || !zT) {
                    fE = fVar.e(iMax);
                    f10 = fVar.f(iMax + 1);
                } else {
                    f10 = fVar.c(iMax);
                    fE = fVar.d(iMax + 1);
                }
                array[i15] = fE;
                array[i15 + 1] = fC;
                array[i15 + 2] = f10;
                array[i15 + 3] = fP;
                i15 += 4;
            }
            if (i14 == iV2) {
                return;
            }
            i14++;
            i13 = 1;
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    @dl.d
    public final RectF d(int offset) {
        float fL;
        float fL2;
        float fJ;
        float fJ2;
        int iV = v(offset);
        float fC = C(iV);
        float fP = p(iV);
        boolean z10 = I(iV) == 1;
        boolean zIsRtlCharAt = this.layout.isRtlCharAt(offset);
        if (!z10 || zIsRtlCharAt) {
            if (z10 && zIsRtlCharAt) {
                fJ = L(offset, false);
                fJ2 = L(offset + 1, true);
            } else if (zIsRtlCharAt) {
                fJ = J(offset, false);
                fJ2 = J(offset + 1, true);
            } else {
                fL = L(offset, false);
                fL2 = L(offset + 1, true);
            }
            float f10 = fJ;
            fL = fJ2;
            fL2 = f10;
        } else {
            fL = J(offset, false);
            fL2 = J(offset + 1, true);
        }
        return new RectF(fL, fC, fL2, fP);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getFallbackLineSpacing() {
        return this.fallbackLineSpacing;
    }

    public final int g() {
        return (this.didExceedMaxLines ? this.layout.getLineBottom(this.lineCount - 1) : this.layout.getHeight()) + this.topPadding + this.bottomPadding + this.lastLineExtra;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    @dl.d
    /* JADX INFO: renamed from: j, reason: from getter */
    public final Layout getLayout() {
        return this.layout;
    }

    @dl.d
    /* JADX INFO: renamed from: m, reason: from getter */
    public final LayoutIntrinsics getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    public final float n(int line) {
        Paint.FontMetricsInt fontMetricsInt;
        return (line != this.lineCount + (-1) || (fontMetricsInt = this.lastLineFontMetrics) == null) ? this.layout.getLineAscent(line) : fontMetricsInt.ascent;
    }

    public final float o(int line) {
        return this.topPadding + ((line != this.lineCount + (-1) || this.lastLineFontMetrics == null) ? this.layout.getLineBaseline(line) : C(line) - this.lastLineFontMetrics.ascent);
    }

    public final float p(int line) {
        if (line != this.lineCount - 1 || this.lastLineFontMetrics == null) {
            return this.topPadding + this.layout.getLineBottom(line) + (line == this.lineCount + (-1) ? this.bottomPadding : 0);
        }
        return this.layout.getLineBottom(line - 1) + this.lastLineFontMetrics.bottom;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getLineCount() {
        return this.lineCount;
    }

    public final float r(int line) {
        Paint.FontMetricsInt fontMetricsInt;
        return (line != this.lineCount + (-1) || (fontMetricsInt = this.lastLineFontMetrics) == null) ? this.layout.getLineDescent(line) : fontMetricsInt.descent;
    }

    public final int s(int lineIndex) {
        return this.layout.getEllipsisCount(lineIndex);
    }

    public final int t(int lineIndex) {
        return this.layout.getEllipsisStart(lineIndex);
    }

    public final int u(int lineIndex) {
        return this.layout.getEllipsisStart(lineIndex) == 0 ? this.layout.getLineEnd(lineIndex) : this.layout.getText().length();
    }

    public final int v(int offset) {
        return this.layout.getLineForOffset(offset);
    }

    public final int w(int vertical) {
        return this.layout.getLineForVertical(this.topPadding + vertical);
    }

    public final float x(int lineIndex) {
        return p(lineIndex) - C(lineIndex);
    }

    @dl.d
    /* JADX INFO: renamed from: y, reason: from getter */
    public final n1.h[] getF16275n() {
        return this.f16275n;
    }

    public final float z(int lineIndex) {
        return this.layout.getLineLeft(lineIndex) + (lineIndex == this.lineCount + (-1) ? this.leftPadding : 0.0f);
    }
}
