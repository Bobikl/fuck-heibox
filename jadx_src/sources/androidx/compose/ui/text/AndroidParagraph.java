package androidx.compose.ui.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.j1;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.l1;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: AndroidParagraph.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B,\u0012\u0006\u0010Y\u001a\u00020T\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010a\u001a\u00020:\u0012\u0006\u0010d\u001a\u00020bø\u0001\u0001¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001B|\b\u0016\u0012\b\u0010\u0094\u0001\u001a\u00030\u0093\u0001\u0012\b\u0010\u0096\u0001\u001a\u00030\u0095\u0001\u0012\u0015\u0010\u0099\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0098\u00010\u0097\u00010n\u0012\u0015\u0010\u009b\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u009a\u00010\u0097\u00010n\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010a\u001a\u00020:\u0012\u0006\u0010d\u001a\u00020b\u0012\b\u0010\u009d\u0001\u001a\u00030\u009c\u0001\u0012\b\u0010\u009f\u0001\u001a\u00030\u009e\u0001ø\u0001\u0001¢\u0006\u0006\b\u0091\u0001\u0010 \u0001J\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002JJ\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u001d\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u000bH\u0016J+\u0010%\u001a\u00020\t2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&J\u0018\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000bH\u0016J\u0010\u0010+\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u000bH\u0016J \u0010,\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u000bH\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u000bH\u0016J\u0010\u00100\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u000bH\u0016J\u0010\u00101\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u000bH\u0016J\u0017\u00102\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u000bH\u0000¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u000bH\u0000¢\u0006\u0004\b4\u00103J\u0017\u00105\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u000bH\u0000¢\u0006\u0004\b5\u00103J\u0010\u00106\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u000bH\u0016J\u0010\u00107\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u000bH\u0016J\u0010\u00108\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u000bH\u0016J\u0010\u00109\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000bH\u0016J\u0018\u0010<\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020:H\u0016J\u0010\u0010=\u001a\u00020:2\u0006\u0010.\u001a\u00020\u000bH\u0016J\u0010\u0010>\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000bH\u0016J\u0018\u0010@\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020:H\u0016J\u0010\u0010B\u001a\u00020A2\u0006\u0010\u001d\u001a\u00020\u000bH\u0016J\u0010\u0010C\u001a\u00020A2\u0006\u0010\u001d\u001a\u00020\u000bH\u0016J9\u0010J\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010E\u001a\u00020D2\b\u0010G\u001a\u0004\u0018\u00010F2\b\u0010I\u001a\u0004\u0018\u00010HH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bJ\u0010KJC\u0010N\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010E\u001a\u00020D2\b\u0010G\u001a\u0004\u0018\u00010F2\b\u0010I\u001a\u0004\u0018\u00010H2\b\u0010M\u001a\u0004\u0018\u00010LH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bN\u0010OJ>\u0010S\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020P2\u0006\u0010R\u001a\u00020\u00162\b\u0010G\u001a\u0004\u0018\u00010F2\b\u0010I\u001a\u0004\u0018\u00010H2\b\u0010M\u001a\u0004\u0018\u00010LH\u0016R\u0017\u0010Y\u001a\u00020T8\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u0017\u0010a\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b\u001f\u0010^\u001a\u0004\b_\u0010`R \u0010d\u001a\u00020b8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bS\u0010_\u001a\u0004\b[\u0010cR\u0014\u0010f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010eR \u0010m\u001a\u00020g8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b1\u0010h\u0012\u0004\bk\u0010l\u001a\u0004\bi\u0010jR\"\u0010r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010o\u001a\u0004\bp\u0010qR\u001b\u0010x\u001a\u00020s8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR\u0014\u0010{\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010}\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010zR\u0014\u0010~\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010zR\u0014\u0010\u007f\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010zR\u0015\u0010\u0080\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010zR\u0016\u0010\u0082\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010zR\u0016\u0010\u0084\u0001\u001a\u00020:8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010`R\u001f\u0010\u0089\u0001\u001a\u00030\u0085\u00018@X\u0081\u0004¢\u0006\u000f\u0012\u0005\b\u0088\u0001\u0010l\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0016\u0010\u008b\u0001\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010]R\u001f\u0010\u0090\u0001\u001a\u00030\u008c\u00018@X\u0081\u0004¢\u0006\u000f\u0012\u0005\b\u008f\u0001\u0010l\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006¡\u0001"}, d2 = {"Landroidx/compose/ui/text/AndroidParagraph;", "Landroidx/compose/ui/text/n;", "Landroidx/compose/ui/text/android/TextLayout;", "", "Lq1/a;", "P", "(Landroidx/compose/ui/text/android/TextLayout;)[Lq1/a;", "Landroidx/compose/ui/graphics/d0;", "canvas", "Lkotlin/b2;", androidx.exifinterface.media.a.X4, "", "alignment", "justificationMode", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "maxLines", "hyphens", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", androidx.exifinterface.media.a.S4, "", "vertical", "m", "Lb1/f;", CommonNetImpl.POSITION, "i", "(J)I", androidx.constraintlayout.core.motion.utils.w.c.R, "Lb1/i;", ak.aF, "Landroidx/compose/ui/text/o0;", com.google.android.exoplayer2.source.rtsp.k0.f48802q, "", "array", "arrayStart", "F", "(J[FI)V", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "Landroidx/compose/ui/graphics/l1;", ak.aG, "p", "g", "(I)J", "lineIndex", "n", ak.aB, "f", "K", "(I)F", "L", "M", "o", "l", "B", "j", "", "visibleEnd", "k", "q", "y", "usePrimaryDirection", "v", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "e", ak.aD, "Landroidx/compose/ui/graphics/l0;", "color", "Landroidx/compose/ui/graphics/e2;", "shadow", "Landroidx/compose/ui/text/style/i;", com.google.android.exoplayer2.text.ttml.d.P, "C", "(Landroidx/compose/ui/graphics/d0;JLandroidx/compose/ui/graphics/e2;Landroidx/compose/ui/text/style/i;)V", "Landroidx/compose/ui/graphics/drawscope/j;", "drawStyle", RXScreenCaptureService.KEY_WIDTH, "(Landroidx/compose/ui/graphics/d0;JLandroidx/compose/ui/graphics/e2;Landroidx/compose/ui/text/style/i;Landroidx/compose/ui/graphics/drawscope/j;)V", "Landroidx/compose/ui/graphics/a0;", "brush", "alpha", "d", "Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", ak.av, "Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "O", "()Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "paragraphIntrinsics", "b", "I", "N", "()I", "Z", "J", "()Z", "ellipsis", "Ls1/b;", "()J", "constraints", "Landroidx/compose/ui/text/android/TextLayout;", com.google.android.exoplayer2.text.ttml.d.f49813w, "", "Ljava/lang/CharSequence;", "G", "()Ljava/lang/CharSequence;", "getCharSequence$ui_text_release$annotations", "()V", "charSequence", "", "Ljava/util/List;", androidx.exifinterface.media.a.W4, "()Ljava/util/List;", "placeholderRects", "Lm1/a;", RXScreenCaptureService.KEY_HEIGHT, "Lkotlin/z;", "U", "()Lm1/a;", "wordBoundary", "getWidth", "()F", "width", "getHeight", "height", "maxIntrinsicWidth", "minIntrinsicWidth", "firstBaseline", "x", "lastBaseline", "t", "didExceedMaxLines", "Ljava/util/Locale;", "Q", "()Ljava/util/Locale;", "getTextLocale$ui_text_release$annotations", "textLocale", "r", "lineCount", "Landroidx/compose/ui/text/platform/l;", androidx.exifinterface.media.a.R4, "()Landroidx/compose/ui/text/platform/l;", "getTextPaint$ui_text_release$annotations", "textPaint", "<init>", "(Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;IZJLkotlin/jvm/internal/u;)V", "", "text", "Landroidx/compose/ui/text/q0;", "style", "Landroidx/compose/ui/text/d$b;", "Landroidx/compose/ui/text/d0;", "spanStyles", "Landroidx/compose/ui/text/w;", "placeholders", "Landroidx/compose/ui/text/font/v$b;", "fontFamilyResolver", "Ls1/e;", "density", "(Ljava/lang/String;Landroidx/compose/ui/text/q0;Ljava/util/List;Ljava/util/List;IZJLandroidx/compose/ui/text/font/v$b;Ls1/e;Lkotlin/jvm/internal/u;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class AndroidParagraph implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AndroidParagraphIntrinsics paragraphIntrinsics;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean ellipsis;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long constraints;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final TextLayout layout;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final CharSequence charSequence;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<b1.i> placeholderRects;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlin.z wordBoundary;

    /* JADX INFO: compiled from: AndroidParagraph.android.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16166a;

        static {
            int[] iArr = new int[ResolvedTextDirection.values().length];
            iArr[ResolvedTextDirection.Ltr.ordinal()] = 1;
            iArr[ResolvedTextDirection.Rtl.ordinal()] = 2;
            f16166a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    private AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i10, boolean z10, long j10) {
        List<b1.i> listE;
        b1.i iVar;
        float fV;
        float fO;
        int iB;
        float fC;
        float fB;
        float fO2;
        this.paragraphIntrinsics = androidParagraphIntrinsics;
        this.maxLines = i10;
        this.ellipsis = z10;
        this.constraints = j10;
        if ((s1.b.q(j10) == 0 && s1.b.r(j10) == 0) != true) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        if ((i10 >= 1) != true) {
            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
        }
        TextStyle style = androidParagraphIntrinsics.getStyle();
        this.charSequence = b.k(style, z10) ? b.i(androidParagraphIntrinsics.getCharSequence()) : androidParagraphIntrinsics.getCharSequence();
        int iL = b.l(style.I());
        androidx.compose.ui.text.style.h hVarI = style.I();
        boolean zJ = hVarI == null ? false : androidx.compose.ui.text.style.h.j(hVarI.getValue(), androidx.compose.ui.text.style.h.INSTANCE.c());
        int iN = b.n(style.getParagraphStyle().getHyphens());
        LineBreak lineBreakZ = style.z();
        int iM = b.m(lineBreakZ != null ? LineBreak.b.d(lineBreakZ.getStrategy()) : null);
        LineBreak lineBreakZ2 = style.z();
        int iO = b.o(lineBreakZ2 != null ? LineBreak.c.e(lineBreakZ2.getStrictness()) : null);
        LineBreak lineBreakZ3 = style.z();
        int iP = b.p(lineBreakZ3 != null ? LineBreak.d.c(lineBreakZ3.getWordBreak()) : null);
        TextUtils.TruncateAt truncateAt = z10 ? TextUtils.TruncateAt.END : null;
        TextLayout textLayoutE = E(iL, zJ ? 1 : 0, truncateAt, i10, iN, iM, iO, iP);
        if (!z10 || textLayoutE.g() <= s1.b.o(j10) || i10 <= 1) {
            this.layout = textLayoutE;
        } else {
            int iJ = b.j(textLayoutE, s1.b.o(j10));
            if (iJ >= 0 && iJ != i10) {
                textLayoutE = E(iL, zJ ? 1 : 0, truncateAt, fi.u.u(iJ, 1), iN, iM, iO, iP);
            }
            this.layout = textLayoutE;
        }
        S().f(style.n(), b1.n.a(getWidth(), getHeight()), style.j());
        for (q1.a aVar : P(this.layout)) {
            aVar.d(b1.m.c(b1.n.a(getWidth(), getHeight())));
        }
        CharSequence charSequence = this.charSequence;
        if (charSequence instanceof Spanned) {
            Object[] spans = ((Spanned) charSequence).getSpans(0, charSequence.length(), n1.j.class);
            kotlin.jvm.internal.f0.o(spans, "getSpans(0, length, PlaceholderSpan::class.java)");
            ArrayList arrayList = new ArrayList(spans.length);
            for (Object obj : spans) {
                n1.j jVar = (n1.j) obj;
                Spanned spanned = (Spanned) charSequence;
                int spanStart = spanned.getSpanStart(jVar);
                int spanEnd = spanned.getSpanEnd(jVar);
                int iV = this.layout.v(spanStart);
                ?? r10 = iV >= this.maxLines;
                ?? r11 = this.layout.s(iV) > 0 && spanEnd > this.layout.t(iV);
                ?? r12 = spanEnd > this.layout.u(iV);
                if (r11 == true || r12 == true || r10 == true) {
                    iVar = null;
                } else {
                    int i11 = a.f16166a[z(spanStart).ordinal()];
                    if (i11 == 1) {
                        fV = v(spanStart, true);
                    } else {
                        if (i11 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fV = v(spanStart, true) - jVar.d();
                    }
                    float fD = jVar.d() + fV;
                    TextLayout textLayout = this.layout;
                    switch (jVar.getF131979g()) {
                        case 0:
                            fO = textLayout.o(iV);
                            iB = jVar.b();
                            fC = fO - iB;
                            iVar = new b1.i(fV, fC, fD, jVar.b() + fC);
                            break;
                        case 1:
                            fC = textLayout.C(iV);
                            iVar = new b1.i(fV, fC, fD, jVar.b() + fC);
                            break;
                        case 2:
                            fO = textLayout.p(iV);
                            iB = jVar.b();
                            fC = fO - iB;
                            iVar = new b1.i(fV, fC, fD, jVar.b() + fC);
                            break;
                        case 3:
                            fC = ((textLayout.C(iV) + textLayout.p(iV)) - jVar.b()) / 2;
                            iVar = new b1.i(fV, fC, fD, jVar.b() + fC);
                            break;
                        case 4:
                            fB = jVar.a().ascent;
                            fO2 = textLayout.o(iV);
                            fC = fB + fO2;
                            iVar = new b1.i(fV, fC, fD, jVar.b() + fC);
                            break;
                        case 5:
                            fC = (jVar.a().descent + textLayout.o(iV)) - jVar.b();
                            iVar = new b1.i(fV, fC, fD, jVar.b() + fC);
                            break;
                        case 6:
                            Paint.FontMetricsInt fontMetricsIntA = jVar.a();
                            fB = ((fontMetricsIntA.ascent + fontMetricsIntA.descent) - jVar.b()) / 2;
                            fO2 = textLayout.o(iV);
                            fC = fB + fO2;
                            iVar = new b1.i(fV, fC, fD, jVar.b() + fC);
                            break;
                        default:
                            throw new IllegalStateException("unexpected verticalAlignment");
                    }
                }
                arrayList.add(iVar);
            }
            listE = arrayList;
        } else {
            listE = CollectionsKt__CollectionsKt.E();
        }
        this.placeholderRects = listE;
        this.wordBoundary = kotlin.b0.b(LazyThreadSafetyMode.NONE, new yh.a<m1.a>() { // from class: androidx.compose.ui.text.AndroidParagraph$wordBoundary$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final m1.a invoke() {
                return new m1.a(this.f16167b.Q(), this.f16167b.layout.O());
            }
        });
    }

    public /* synthetic */ AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i10, boolean z10, long j10, kotlin.jvm.internal.u uVar) {
        this(androidParagraphIntrinsics, i10, z10, j10);
    }

    private AndroidParagraph(String str, TextStyle textStyle, List<d.Range<SpanStyle>> list, List<d.Range<Placeholder>> list2, int i10, boolean z10, long j10, androidx.compose.ui.text.font.v.b bVar, s1.e eVar) {
        this(new AndroidParagraphIntrinsics(str, textStyle, list, list2, bVar, eVar), i10, z10, j10, null);
    }

    public /* synthetic */ AndroidParagraph(String str, TextStyle textStyle, List list, List list2, int i10, boolean z10, long j10, androidx.compose.ui.text.font.v.b bVar, s1.e eVar, kotlin.jvm.internal.u uVar) {
        this(str, textStyle, list, list2, i10, z10, j10, bVar, eVar);
    }

    private final TextLayout E(int alignment, int justificationMode, TextUtils.TruncateAt ellipsize, int maxLines, int hyphens, int breakStrategy, int lineBreakStyle, int lineBreakWordStyle) {
        return new TextLayout(this.charSequence, getWidth(), S(), alignment, ellipsize, this.paragraphIntrinsics.getTextDirectionHeuristic(), 1.0f, 0.0f, androidx.compose.ui.text.platform.f.b(this.paragraphIntrinsics.getStyle()), true, maxLines, breakStrategy, lineBreakStyle, lineBreakWordStyle, hyphens, justificationMode, null, null, this.paragraphIntrinsics.getLayoutIntrinsics(), 196736, null);
    }

    @j1
    public static /* synthetic */ void H() {
    }

    private final q1.a[] P(TextLayout textLayout) {
        if (!(textLayout.O() instanceof Spanned)) {
            return new q1.a[0];
        }
        CharSequence charSequenceO = textLayout.O();
        kotlin.jvm.internal.f0.n(charSequenceO, "null cannot be cast to non-null type android.text.Spanned");
        q1.a[] brushSpans = (q1.a[]) ((Spanned) charSequenceO).getSpans(0, textLayout.O().length(), q1.a.class);
        kotlin.jvm.internal.f0.o(brushSpans, "brushSpans");
        return brushSpans.length == 0 ? new q1.a[0] : brushSpans;
    }

    @j1
    public static /* synthetic */ void R() {
    }

    @j1
    public static /* synthetic */ void T() {
    }

    private final m1.a U() {
        return (m1.a) this.wordBoundary.getValue();
    }

    private final void V(androidx.compose.ui.graphics.d0 d0Var) {
        Canvas canvasD = androidx.compose.ui.graphics.c.d(d0Var);
        if (t()) {
            canvasD.save();
            canvasD.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.layout.U(canvasD);
        if (t()) {
            canvasD.restore();
        }
    }

    @Override // androidx.compose.ui.text.n
    @dl.d
    public List<b1.i> A() {
        return this.placeholderRects;
    }

    @Override // androidx.compose.ui.text.n
    public float B(int lineIndex) {
        return this.layout.E(lineIndex);
    }

    @Override // androidx.compose.ui.text.n
    public void C(@dl.d androidx.compose.ui.graphics.d0 canvas, long color, @dl.e Shadow shadow, @dl.e androidx.compose.ui.text.style.i textDecoration) {
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        androidx.compose.ui.text.platform.l lVarS = S();
        lVarS.i(color);
        lVarS.k(shadow);
        lVarS.l(textDecoration);
        V(canvas);
    }

    public final void F(long range, @dl.d float[] array, int arrayStart) {
        kotlin.jvm.internal.f0.p(array, "array");
        this.layout.a(o0.l(range), o0.k(range), array, arrayStart);
    }

    @dl.d
    /* JADX INFO: renamed from: G, reason: from getter */
    public final CharSequence getCharSequence() {
        return this.charSequence;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final long getConstraints() {
        return this.constraints;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final boolean getEllipsis() {
        return this.ellipsis;
    }

    public final float K(int lineIndex) {
        return this.layout.n(lineIndex);
    }

    public final float L(int lineIndex) {
        return this.layout.o(lineIndex);
    }

    public final float M(int lineIndex) {
        return this.layout.r(lineIndex);
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    @dl.d
    /* JADX INFO: renamed from: O, reason: from getter */
    public final AndroidParagraphIntrinsics getParagraphIntrinsics() {
        return this.paragraphIntrinsics;
    }

    @dl.d
    public final Locale Q() {
        Locale textLocale = this.paragraphIntrinsics.getTextPaint().getTextLocale();
        kotlin.jvm.internal.f0.o(textLocale, "paragraphIntrinsics.textPaint.textLocale");
        return textLocale;
    }

    @dl.d
    public final androidx.compose.ui.text.platform.l S() {
        return this.paragraphIntrinsics.getTextPaint();
    }

    @Override // androidx.compose.ui.text.n
    public float a() {
        return this.paragraphIntrinsics.a();
    }

    @Override // androidx.compose.ui.text.n
    public float b() {
        return this.paragraphIntrinsics.b();
    }

    @Override // androidx.compose.ui.text.n
    @dl.d
    public b1.i c(int offset) {
        RectF rectFD = this.layout.d(offset);
        return new b1.i(rectFD.left, rectFD.top, rectFD.right, rectFD.bottom);
    }

    @Override // androidx.compose.ui.text.n
    public void d(@dl.d androidx.compose.ui.graphics.d0 canvas, @dl.d androidx.compose.ui.graphics.a0 brush, float f10, @dl.e Shadow shadow, @dl.e androidx.compose.ui.text.style.i iVar, @dl.e androidx.compose.ui.graphics.drawscope.j jVar) {
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        kotlin.jvm.internal.f0.p(brush, "brush");
        androidx.compose.ui.text.platform.l lVarS = S();
        lVarS.f(brush, b1.n.a(getWidth(), getHeight()), f10);
        lVarS.k(shadow);
        lVarS.l(iVar);
        lVarS.j(jVar);
        V(canvas);
    }

    @Override // androidx.compose.ui.text.n
    @dl.d
    public ResolvedTextDirection e(int offset) {
        return this.layout.I(this.layout.v(offset)) == 1 ? ResolvedTextDirection.Ltr : ResolvedTextDirection.Rtl;
    }

    @Override // androidx.compose.ui.text.n
    public float f(int lineIndex) {
        return this.layout.C(lineIndex);
    }

    @Override // androidx.compose.ui.text.n
    public long g(int offset) {
        return p0.b(U().b(offset), U().a(offset));
    }

    @Override // androidx.compose.ui.text.n
    public float getHeight() {
        return this.layout.g();
    }

    @Override // androidx.compose.ui.text.n
    public float getWidth() {
        return s1.b.p(this.constraints);
    }

    @Override // androidx.compose.ui.text.n
    public float h() {
        return L(0);
    }

    @Override // androidx.compose.ui.text.n
    public int i(long position) {
        return this.layout.H(this.layout.w((int) b1.f.r(position)), b1.f.p(position));
    }

    @Override // androidx.compose.ui.text.n
    public int j(int lineIndex) {
        return this.layout.B(lineIndex);
    }

    @Override // androidx.compose.ui.text.n
    public int k(int lineIndex, boolean visibleEnd) {
        return visibleEnd ? this.layout.D(lineIndex) : this.layout.u(lineIndex);
    }

    @Override // androidx.compose.ui.text.n
    public float l(int lineIndex) {
        return this.layout.x(lineIndex);
    }

    @Override // androidx.compose.ui.text.n
    public int m(float vertical) {
        return this.layout.w((int) vertical);
    }

    @Override // androidx.compose.ui.text.n
    public float n(int lineIndex) {
        return this.layout.z(lineIndex);
    }

    @Override // androidx.compose.ui.text.n
    public float o(int lineIndex) {
        return this.layout.p(lineIndex);
    }

    @Override // androidx.compose.ui.text.n
    @dl.d
    public b1.i p(int offset) {
        if (offset >= 0 && offset <= this.charSequence.length()) {
            float fK = TextLayout.K(this.layout, offset, false, 2, null);
            int iV = this.layout.v(offset);
            return new b1.i(fK, this.layout.C(iV), fK, this.layout.p(iV));
        }
        throw new AssertionError("offset(" + offset + ") is out of bounds (0," + this.charSequence.length());
    }

    @Override // androidx.compose.ui.text.n
    public boolean q(int lineIndex) {
        return this.layout.S(lineIndex);
    }

    @Override // androidx.compose.ui.text.n
    public int r() {
        return this.layout.getLineCount();
    }

    @Override // androidx.compose.ui.text.n
    public float s(int lineIndex) {
        return this.layout.A(lineIndex);
    }

    @Override // androidx.compose.ui.text.n
    public boolean t() {
        return this.layout.getDidExceedMaxLines();
    }

    @Override // androidx.compose.ui.text.n
    @dl.d
    public l1 u(int start, int end) {
        boolean z10 = false;
        if (start >= 0 && start <= end) {
            z10 = true;
        }
        if (z10 && end <= this.charSequence.length()) {
            Path path = new Path();
            this.layout.N(start, end, path);
            return androidx.compose.ui.graphics.o.c(path);
        }
        throw new AssertionError("Start(" + start + ") or End(" + end + ") is out of Range(0.." + this.charSequence.length() + "), or start > end!");
    }

    @Override // androidx.compose.ui.text.n
    public float v(int offset, boolean usePrimaryDirection) {
        return usePrimaryDirection ? TextLayout.K(this.layout, offset, false, 2, null) : TextLayout.M(this.layout, offset, false, 2, null);
    }

    @Override // androidx.compose.ui.text.n
    public void w(@dl.d androidx.compose.ui.graphics.d0 canvas, long color, @dl.e Shadow shadow, @dl.e androidx.compose.ui.text.style.i textDecoration, @dl.e androidx.compose.ui.graphics.drawscope.j drawStyle) {
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        androidx.compose.ui.text.platform.l lVarS = S();
        lVarS.i(color);
        lVarS.k(shadow);
        lVarS.l(textDecoration);
        lVarS.j(drawStyle);
        V(canvas);
    }

    @Override // androidx.compose.ui.text.n
    public float x() {
        return L(r() - 1);
    }

    @Override // androidx.compose.ui.text.n
    public int y(int offset) {
        return this.layout.v(offset);
    }

    @Override // androidx.compose.ui.text.n
    @dl.d
    public ResolvedTextDirection z(int offset) {
        return this.layout.T(offset) ? ResolvedTextDirection.Rtl : ResolvedTextDirection.Ltr;
    }
}
