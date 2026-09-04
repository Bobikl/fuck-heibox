package t0;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: OutlinedTextFieldTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bU\n\u0002\u0018\u0002\n\u0002\b!\bÀ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R \u0010\u0019\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006R\u0017\u0010'\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u0004\u001a\u0004\b(\u0010\u0006R\u0017\u0010)\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R\u0017\u0010+\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u0004\u001a\u0004\b,\u0010\u0006R\u0017\u0010-\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u0004\u001a\u0004\b.\u0010\u0006R\u0017\u0010/\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R\u0017\u00101\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\u0004\u001a\u0004\b2\u0010\u0006R\u0017\u00103\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\u0004\u001a\u0004\b4\u0010\u0006R\u0017\u00105\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006R\u0017\u00107\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010\u0004\u001a\u0004\b8\u0010\u0006R\u0017\u00109\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010\u0004\u001a\u0004\b:\u0010\u0006R\u0017\u0010;\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006R\u0017\u0010=\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010\u0004\u001a\u0004\b>\u0010\u0006R\u0017\u0010?\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010\u0004\u001a\u0004\b@\u0010\u0006R\u0017\u0010A\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010\u0004\u001a\u0004\bB\u0010\u0006R\u0017\u0010C\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010\u0004\u001a\u0004\bD\u0010\u0006R\u0017\u0010E\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010\u0004\u001a\u0004\bF\u0010\u0006R\u0017\u0010G\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010\u0004\u001a\u0004\bH\u0010\u0006R\u0017\u0010I\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010J\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010\u0004\u001a\u0004\bK\u0010\u0006R \u0010L\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bL\u0010\t\u001a\u0004\bM\u0010\u000bR\u0017\u0010N\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bN\u0010\u0004\u001a\u0004\bO\u0010\u0006R\u0017\u0010P\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bP\u0010\u0004\u001a\u0004\bQ\u0010\u0006R\u0017\u0010R\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bR\u0010\u0004\u001a\u0004\bS\u0010\u0006R\u0017\u0010T\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bT\u0010\u0004\u001a\u0004\bU\u0010\u0006R\u0017\u0010V\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bV\u0010\u0004\u001a\u0004\bW\u0010\u0006R\u0017\u0010X\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bX\u0010\u0004\u001a\u0004\bY\u0010\u0006R \u0010Z\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bZ\u0010\t\u001a\u0004\b[\u0010\u000bR\u0017\u0010\\\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\\\u0010\u0004\u001a\u0004\b]\u0010\u0006R\u0017\u0010^\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b^\u0010\u0004\u001a\u0004\b_\u0010\u0006R\u0017\u0010`\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b`\u0010\u0004\u001a\u0004\ba\u0010\u0006R\u0017\u0010c\u001a\u00020b8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0017\u0010g\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bg\u0010\u0004\u001a\u0004\bh\u0010\u0006R\u0017\u0010i\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bi\u0010\u0004\u001a\u0004\bj\u0010\u0006R\u0017\u0010k\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bk\u0010\u0004\u001a\u0004\bl\u0010\u0006R\u0017\u0010m\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bm\u0010\u0004\u001a\u0004\bn\u0010\u0006R\u0017\u0010o\u001a\u00020b8\u0006¢\u0006\f\n\u0004\bo\u0010d\u001a\u0004\bp\u0010fR\u0017\u0010q\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bq\u0010\u0004\u001a\u0004\br\u0010\u0006R \u0010s\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bs\u0010\t\u001a\u0004\bt\u0010\u000bR\u0017\u0010u\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bu\u0010\u0004\u001a\u0004\bv\u0010\u0006R \u0010w\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bw\u0010\t\u001a\u0004\bx\u0010\u000bR\u0017\u0010y\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\by\u0010\u0004\u001a\u0004\bz\u0010\u0006R\u0017\u0010{\u001a\u00020b8\u0006¢\u0006\f\n\u0004\b{\u0010d\u001a\u0004\b|\u0010fR\u0017\u0010}\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b}\u0010\u0004\u001a\u0004\b~\u0010\u0006R!\u0010\u007f\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\r\n\u0004\b\u007f\u0010\t\u001a\u0005\b\u0080\u0001\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0083\u0001"}, d2 = {"Lt0/m0;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "CaretColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", ak.av, "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "Ls1/h;", "ContainerHeight", "F", "b", "()F", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", ak.aF, "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "DisabledInputColor", "d", "DisabledLabelColor", "e", "DisabledLeadingIconColor", "f", "DisabledOutlineColor", "g", "DisabledOutlineWidth", RXScreenCaptureService.KEY_HEIGHT, "DisabledSupportingColor", "i", "DisabledTrailingIconColor", "j", "ErrorFocusCaretColor", "k", "ErrorFocusInputColor", "l", "ErrorFocusLabelColor", "m", "ErrorFocusLeadingIconColor", "n", "ErrorFocusOutlineColor", "o", "ErrorFocusSupportingColor", "p", "ErrorFocusTrailingIconColor", "q", "ErrorHoverInputColor", "r", "ErrorHoverLabelColor", ak.aB, "ErrorHoverLeadingIconColor", "t", "ErrorHoverOutlineColor", ak.aG, "ErrorHoverSupportingColor", "v", "ErrorHoverTrailingIconColor", RXScreenCaptureService.KEY_WIDTH, "ErrorInputColor", "x", "ErrorLabelColor", "y", "ErrorLeadingIconColor", ak.aD, "ErrorOutlineColor", androidx.exifinterface.media.a.W4, "ErrorSupportingColor", "B", "ErrorTrailingIconColor", "C", "FocusInputColor", "D", "FocusLabelColor", androidx.exifinterface.media.a.S4, "FocusLeadingIconColor", "FocusOutlineColor", "G", "FocusOutlineWidth", "H", "FocusSupportingColor", "I", "FocusTrailingIconColor", "J", "HoverInputColor", "K", "HoverLabelColor", "L", "HoverLeadingIconColor", "M", "HoverOutlineColor", "N", "HoverOutlineWidth", "O", "HoverSupportingColor", "P", "HoverTrailingIconColor", "Q", "InputColor", "R", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "InputFont", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", androidx.exifinterface.media.a.R4, "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "InputPlaceholderColor", androidx.exifinterface.media.a.f23244d5, "InputPrefixColor", "U", "InputSuffixColor", androidx.exifinterface.media.a.X4, "LabelColor", androidx.exifinterface.media.a.T4, "LabelFont", "X", "LeadingIconColor", "Y", "LeadingIconSize", "Z", "OutlineColor", "a0", "OutlineWidth", "b0", "SupportingColor", "c0", "SupportingFont", "d0", "TrailingIconColor", "e0", "TrailingIconSize", "f0", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class m0 {

    @dl.d
    private static final ColorSchemeKeyTokens A;

    @dl.d
    private static final ColorSchemeKeyTokens B;

    @dl.d
    private static final ColorSchemeKeyTokens C;

    @dl.d
    private static final ColorSchemeKeyTokens D;

    @dl.d
    private static final ColorSchemeKeyTokens E;

    @dl.d
    private static final ColorSchemeKeyTokens F;

    @dl.d
    private static final ColorSchemeKeyTokens G;

    @dl.d
    private static final ColorSchemeKeyTokens H;

    @dl.d
    private static final ColorSchemeKeyTokens I;

    @dl.d
    private static final ColorSchemeKeyTokens J;

    @dl.d
    private static final ColorSchemeKeyTokens K;

    @dl.d
    private static final ColorSchemeKeyTokens L;

    @dl.d
    private static final ColorSchemeKeyTokens M;

    @dl.d
    private static final ColorSchemeKeyTokens N;
    private static final float O;

    @dl.d
    private static final ColorSchemeKeyTokens P;

    @dl.d
    private static final ColorSchemeKeyTokens Q;

    @dl.d
    private static final ColorSchemeKeyTokens R;

    @dl.d
    private static final ColorSchemeKeyTokens S;

    @dl.d
    private static final ColorSchemeKeyTokens T;

    @dl.d
    private static final ColorSchemeKeyTokens U;
    private static final float V;

    @dl.d
    private static final ColorSchemeKeyTokens W;

    @dl.d
    private static final ColorSchemeKeyTokens X;

    @dl.d
    private static final ColorSchemeKeyTokens Y;

    @dl.d
    private static final TypographyKeyTokens Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final m0 f140030a = new m0();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140031a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140032b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140033b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f140034c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140035c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final ShapeKeyTokens f140036d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140037d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140038e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @dl.d
    private static final TypographyKeyTokens f140039e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f140040f = 0.38f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140041f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140042g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final float f140043g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f140044h = 0.38f;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140045h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140046i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final float f140047i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f140048j = 0.38f;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140049j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140050k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    @dl.d
    private static final TypographyKeyTokens f140051k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f140052l = 0.12f;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140053l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float f140054m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final float f140055m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140056n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final float f140057o = 0.38f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140058p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final float f140059q = 0.38f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140060r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140061s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140062t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140063u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140064v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140065w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140066x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140067y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140068z;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        f140032b = colorSchemeKeyTokens;
        f140034c = s1.h.g((float) 56.0d);
        f140036d = ShapeKeyTokens.CornerExtraSmall;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        f140038e = colorSchemeKeyTokens2;
        f140042g = colorSchemeKeyTokens2;
        f140046i = colorSchemeKeyTokens2;
        f140050k = colorSchemeKeyTokens2;
        float f10 = (float) 1.0d;
        f140054m = s1.h.g(f10);
        f140056n = colorSchemeKeyTokens2;
        f140058p = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.Error;
        f140060r = colorSchemeKeyTokens3;
        f140061s = colorSchemeKeyTokens2;
        f140062t = colorSchemeKeyTokens3;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.OnSurfaceVariant;
        f140063u = colorSchemeKeyTokens4;
        f140064v = colorSchemeKeyTokens3;
        f140065w = colorSchemeKeyTokens3;
        f140066x = colorSchemeKeyTokens3;
        f140067y = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.OnErrorContainer;
        f140068z = colorSchemeKeyTokens5;
        A = colorSchemeKeyTokens4;
        B = colorSchemeKeyTokens5;
        C = colorSchemeKeyTokens3;
        D = colorSchemeKeyTokens5;
        E = colorSchemeKeyTokens2;
        F = colorSchemeKeyTokens3;
        G = colorSchemeKeyTokens4;
        H = colorSchemeKeyTokens3;
        I = colorSchemeKeyTokens3;
        J = colorSchemeKeyTokens3;
        K = colorSchemeKeyTokens2;
        L = colorSchemeKeyTokens;
        M = colorSchemeKeyTokens4;
        N = colorSchemeKeyTokens;
        O = s1.h.g((float) 2.0d);
        P = colorSchemeKeyTokens4;
        Q = colorSchemeKeyTokens4;
        R = colorSchemeKeyTokens2;
        S = colorSchemeKeyTokens2;
        T = colorSchemeKeyTokens4;
        U = colorSchemeKeyTokens2;
        V = s1.h.g(f10);
        W = colorSchemeKeyTokens4;
        X = colorSchemeKeyTokens4;
        Y = colorSchemeKeyTokens2;
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.BodyLarge;
        Z = typographyKeyTokens;
        f140031a0 = colorSchemeKeyTokens4;
        f140033b0 = colorSchemeKeyTokens4;
        f140035c0 = colorSchemeKeyTokens4;
        f140037d0 = colorSchemeKeyTokens4;
        f140039e0 = typographyKeyTokens;
        f140041f0 = colorSchemeKeyTokens4;
        float f11 = (float) 24.0d;
        f140043g0 = s1.h.g(f11);
        f140045h0 = ColorSchemeKeyTokens.Outline;
        f140047i0 = s1.h.g(f10);
        f140049j0 = colorSchemeKeyTokens4;
        f140051k0 = TypographyKeyTokens.BodySmall;
        f140053l0 = colorSchemeKeyTokens4;
        f140055m0 = s1.h.g(f11);
    }

    private m0() {
    }

    @dl.d
    public final ColorSchemeKeyTokens A() {
        return H;
    }

    @dl.d
    public final ColorSchemeKeyTokens B() {
        return I;
    }

    @dl.d
    public final ColorSchemeKeyTokens C() {
        return J;
    }

    @dl.d
    public final ColorSchemeKeyTokens D() {
        return K;
    }

    @dl.d
    public final ColorSchemeKeyTokens E() {
        return L;
    }

    @dl.d
    public final ColorSchemeKeyTokens F() {
        return M;
    }

    @dl.d
    public final ColorSchemeKeyTokens G() {
        return N;
    }

    public final float H() {
        return O;
    }

    @dl.d
    public final ColorSchemeKeyTokens I() {
        return P;
    }

    @dl.d
    public final ColorSchemeKeyTokens J() {
        return Q;
    }

    @dl.d
    public final ColorSchemeKeyTokens K() {
        return R;
    }

    @dl.d
    public final ColorSchemeKeyTokens L() {
        return S;
    }

    @dl.d
    public final ColorSchemeKeyTokens M() {
        return T;
    }

    @dl.d
    public final ColorSchemeKeyTokens N() {
        return U;
    }

    public final float O() {
        return V;
    }

    @dl.d
    public final ColorSchemeKeyTokens P() {
        return W;
    }

    @dl.d
    public final ColorSchemeKeyTokens Q() {
        return X;
    }

    @dl.d
    public final ColorSchemeKeyTokens R() {
        return Y;
    }

    @dl.d
    public final TypographyKeyTokens S() {
        return Z;
    }

    @dl.d
    public final ColorSchemeKeyTokens T() {
        return f140031a0;
    }

    @dl.d
    public final ColorSchemeKeyTokens U() {
        return f140033b0;
    }

    @dl.d
    public final ColorSchemeKeyTokens V() {
        return f140035c0;
    }

    @dl.d
    public final ColorSchemeKeyTokens W() {
        return f140037d0;
    }

    @dl.d
    public final TypographyKeyTokens X() {
        return f140039e0;
    }

    @dl.d
    public final ColorSchemeKeyTokens Y() {
        return f140041f0;
    }

    public final float Z() {
        return f140043g0;
    }

    @dl.d
    public final ColorSchemeKeyTokens a() {
        return f140032b;
    }

    @dl.d
    public final ColorSchemeKeyTokens a0() {
        return f140045h0;
    }

    public final float b() {
        return f140034c;
    }

    public final float b0() {
        return f140047i0;
    }

    @dl.d
    public final ShapeKeyTokens c() {
        return f140036d;
    }

    @dl.d
    public final ColorSchemeKeyTokens c0() {
        return f140049j0;
    }

    @dl.d
    public final ColorSchemeKeyTokens d() {
        return f140038e;
    }

    @dl.d
    public final TypographyKeyTokens d0() {
        return f140051k0;
    }

    @dl.d
    public final ColorSchemeKeyTokens e() {
        return f140042g;
    }

    @dl.d
    public final ColorSchemeKeyTokens e0() {
        return f140053l0;
    }

    @dl.d
    public final ColorSchemeKeyTokens f() {
        return f140046i;
    }

    public final float f0() {
        return f140055m0;
    }

    @dl.d
    public final ColorSchemeKeyTokens g() {
        return f140050k;
    }

    public final float h() {
        return f140054m;
    }

    @dl.d
    public final ColorSchemeKeyTokens i() {
        return f140056n;
    }

    @dl.d
    public final ColorSchemeKeyTokens j() {
        return f140058p;
    }

    @dl.d
    public final ColorSchemeKeyTokens k() {
        return f140060r;
    }

    @dl.d
    public final ColorSchemeKeyTokens l() {
        return f140061s;
    }

    @dl.d
    public final ColorSchemeKeyTokens m() {
        return f140062t;
    }

    @dl.d
    public final ColorSchemeKeyTokens n() {
        return f140063u;
    }

    @dl.d
    public final ColorSchemeKeyTokens o() {
        return f140064v;
    }

    @dl.d
    public final ColorSchemeKeyTokens p() {
        return f140065w;
    }

    @dl.d
    public final ColorSchemeKeyTokens q() {
        return f140066x;
    }

    @dl.d
    public final ColorSchemeKeyTokens r() {
        return f140067y;
    }

    @dl.d
    public final ColorSchemeKeyTokens s() {
        return f140068z;
    }

    @dl.d
    public final ColorSchemeKeyTokens t() {
        return A;
    }

    @dl.d
    public final ColorSchemeKeyTokens u() {
        return B;
    }

    @dl.d
    public final ColorSchemeKeyTokens v() {
        return C;
    }

    @dl.d
    public final ColorSchemeKeyTokens w() {
        return D;
    }

    @dl.d
    public final ColorSchemeKeyTokens x() {
        return E;
    }

    @dl.d
    public final ColorSchemeKeyTokens y() {
        return F;
    }

    @dl.d
    public final ColorSchemeKeyTokens z() {
        return G;
    }
}
