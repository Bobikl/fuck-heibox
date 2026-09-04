package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;

/* JADX INFO: compiled from: LayoutCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b7\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0007S\u0003\u0006\b\n\f\u000eB\t\b\u0002¢\u0006\u0004\b[\u0010\\R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0014\u0010\u001f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R\u0014\u0010!\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0004R\u0014\u0010#\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0004R\u0014\u0010%\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0004R\u0014\u0010'\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0004R\u0014\u0010)\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0004R\u0014\u0010+\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0004R\u0014\u0010-\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u0004R\u0014\u0010/\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u0004R\u0014\u00101\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u0004R\u0014\u00103\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\u0004R\u0014\u00105\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\u0004R\u0014\u00107\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\u0004R\u0014\u00109\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b8\u0010\u0004R\u0014\u0010=\u001a\u00020:8\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020:8\u0000X\u0080T¢\u0006\u0006\n\u0004\b>\u0010<R\u0014\u0010C\u001a\u00020@8\u0000X\u0080T¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b<\u0010\u0004R\u0014\u0010F\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\bE\u0010\u0004R\u0014\u0010H\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\bG\u0010\u0004R\u0014\u0010I\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0004R\u0014\u0010K\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\bJ\u0010\u0004R\u0014\u0010M\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\bL\u0010\u0004R\u0014\u0010O\u001a\u00020@8\u0000X\u0080T¢\u0006\u0006\n\u0004\bN\u0010BR\u001a\u0010U\u001a\u00020P8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u001a\u0010Z\u001a\u00020V8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\b\u0003\u0010Y¨\u0006]"}, d2 = {"Landroidx/compose/ui/text/android/h;", "", "", "b", "I", "ALIGN_NORMAL", ak.aF, "ALIGN_OPPOSITE", "d", "ALIGN_CENTER", "e", "ALIGN_LEFT", "f", "ALIGN_RIGHT", "g", "JUSTIFICATION_MODE_NONE", RXScreenCaptureService.KEY_HEIGHT, "JUSTIFICATION_MODE_INTER_WORD", "i", "HYPHENATION_FREQUENCY_NONE", "j", "HYPHENATION_FREQUENCY_NORMAL", "k", "HYPHENATION_FREQUENCY_NORMAL_FAST", "l", "BREAK_STRATEGY_SIMPLE", "m", "BREAK_STRATEGY_HIGH_QUALITY", "n", "BREAK_STRATEGY_BALANCED", "o", "LINE_BREAK_STYLE_NONE", "p", "LINE_BREAK_STYLE_LOOSE", "q", "LINE_BREAK_STYLE_NORMAL", "r", "LINE_BREAK_STYLE_STRICT", ak.aB, "LINE_BREAK_WORD_STYLE_NONE", "t", "LINE_BREAK_WORD_STYLE_PHRASE", ak.aG, "TEXT_DIRECTION_LTR", "v", "TEXT_DIRECTION_RTL", RXScreenCaptureService.KEY_WIDTH, "TEXT_DIRECTION_FIRST_STRONG_LTR", "x", "TEXT_DIRECTION_FIRST_STRONG_RTL", "y", "TEXT_DIRECTION_ANY_RTL_LTR", ak.aD, "TEXT_DIRECTION_LOCALE", androidx.exifinterface.media.a.W4, "DEFAULT_ALIGNMENT", "B", "DEFAULT_TEXT_DIRECTION", "", "C", "F", "DEFAULT_LINESPACING_MULTIPLIER", "D", "DEFAULT_LINESPACING_EXTRA", "", androidx.exifinterface.media.a.S4, "Z", "DEFAULT_INCLUDE_PADDING", "DEFAULT_MAX_LINES", "G", "DEFAULT_BREAK_STRATEGY", "H", "DEFAULT_LINE_BREAK_STYLE", "DEFAULT_LINE_BREAK_WORD_STYLE", "J", "DEFAULT_HYPHENATION_FREQUENCY", "K", "DEFAULT_JUSTIFICATION_MODE", "L", "DEFAULT_FALLBACK_LINE_SPACING", "Landroid/text/Layout$Alignment;", "M", "Landroid/text/Layout$Alignment;", ak.av, "()Landroid/text/Layout$Alignment;", "DEFAULT_LAYOUT_ALIGNMENT", "Landroid/text/TextDirectionHeuristic;", "N", "Landroid/text/TextDirectionHeuristic;", "()Landroid/text/TextDirectionHeuristic;", "DEFAULT_TEXT_DIRECTION_HEURISTIC", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
@androidx.compose.ui.text.android.g
public final class h {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public static final int DEFAULT_ALIGNMENT = 0;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public static final int DEFAULT_TEXT_DIRECTION = 2;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public static final float DEFAULT_LINESPACING_MULTIPLIER = 1.0f;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public static final float DEFAULT_LINESPACING_EXTRA = 0.0f;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public static final boolean DEFAULT_INCLUDE_PADDING = false;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public static final int DEFAULT_MAX_LINES = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public static final int DEFAULT_BREAK_STRATEGY = 0;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public static final int DEFAULT_LINE_BREAK_STYLE = 0;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public static final int DEFAULT_LINE_BREAK_WORD_STYLE = 0;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public static final int DEFAULT_HYPHENATION_FREQUENCY = 0;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public static final int DEFAULT_JUSTIFICATION_MODE = 0;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public static final boolean DEFAULT_FALLBACK_LINE_SPACING = true;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @dl.d
    private static final TextDirectionHeuristic DEFAULT_TEXT_DIRECTION_HEURISTIC;
    public static final int O;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final int ALIGN_NORMAL = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final int ALIGN_OPPOSITE = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final int ALIGN_CENTER = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final int ALIGN_LEFT = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final int ALIGN_RIGHT = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final int JUSTIFICATION_MODE_NONE = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final int JUSTIFICATION_MODE_INTER_WORD = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final int HYPHENATION_FREQUENCY_NONE = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final int HYPHENATION_FREQUENCY_NORMAL = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final int HYPHENATION_FREQUENCY_NORMAL_FAST = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final int BREAK_STRATEGY_SIMPLE = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public static final int BREAK_STRATEGY_HIGH_QUALITY = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final int BREAK_STRATEGY_BALANCED = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final int LINE_BREAK_STYLE_NONE = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final int LINE_BREAK_STYLE_LOOSE = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final int LINE_BREAK_STYLE_NORMAL = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public static final int LINE_BREAK_STYLE_STRICT = 3;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static final int LINE_BREAK_WORD_STYLE_NONE = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final int LINE_BREAK_WORD_STYLE_PHRASE = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public static final int TEXT_DIRECTION_LTR = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static final int TEXT_DIRECTION_RTL = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public static final int TEXT_DIRECTION_FIRST_STRONG_LTR = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public static final int TEXT_DIRECTION_FIRST_STRONG_RTL = 3;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public static final int TEXT_DIRECTION_ANY_RTL_LTR = 4;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    public static final int TEXT_DIRECTION_LOCALE = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final h f16314a = new h();

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @dl.d
    private static final Layout.Alignment DEFAULT_LAYOUT_ALIGNMENT = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: compiled from: LayoutCompat.kt */
    @mh.c(AnnotationRetention.SOURCE)
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/h$a;", "", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: compiled from: LayoutCompat.kt */
    @mh.c(AnnotationRetention.SOURCE)
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/h$b;", "", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX INFO: compiled from: LayoutCompat.kt */
    @mh.c(AnnotationRetention.SOURCE)
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/h$c;", "", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* JADX INFO: compiled from: LayoutCompat.kt */
    @mh.c(AnnotationRetention.SOURCE)
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/h$d;", "", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    /* JADX INFO: compiled from: LayoutCompat.kt */
    @mh.c(AnnotationRetention.SOURCE)
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/h$e;", "", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    /* JADX INFO: compiled from: LayoutCompat.kt */
    @mh.c(AnnotationRetention.SOURCE)
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/h$f;", "", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    /* JADX INFO: compiled from: LayoutCompat.kt */
    @mh.c(AnnotationRetention.SOURCE)
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/h$g;", "", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    @Retention(RetentionPolicy.SOURCE)
    public @interface g {
    }

    static {
        TextDirectionHeuristic FIRSTSTRONG_LTR = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        kotlin.jvm.internal.f0.o(FIRSTSTRONG_LTR, "FIRSTSTRONG_LTR");
        DEFAULT_TEXT_DIRECTION_HEURISTIC = FIRSTSTRONG_LTR;
        O = 8;
    }

    private h() {
    }

    @dl.d
    public final Layout.Alignment a() {
        return DEFAULT_LAYOUT_ALIGNMENT;
    }

    @dl.d
    public final TextDirectionHeuristic b() {
        return DEFAULT_TEXT_DIRECTION_HEURISTIC;
    }
}
