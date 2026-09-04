package t0;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: FilledTextFieldTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\bW\n\u0002\u0018\u0002\n\u0002\b\u001d\bÀ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0010\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R \u0010\u0019\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006R\u0017\u0010'\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u0004\u001a\u0004\b(\u0010\u0006R\u0017\u0010)\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R\u0017\u0010+\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u0004\u001a\u0004\b,\u0010\u0006R\u0017\u0010-\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u0004\u001a\u0004\b.\u0010\u0006R\u0017\u0010/\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R\u0017\u00101\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\u0004\u001a\u0004\b2\u0010\u0006R\u0017\u00103\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\u0004\u001a\u0004\b4\u0010\u0006R\u0017\u00105\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006R\u0017\u00107\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010\u0004\u001a\u0004\b8\u0010\u0006R\u0017\u00109\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010\u0004\u001a\u0004\b:\u0010\u0006R\u0017\u0010;\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006R\u0017\u0010=\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010\u0004\u001a\u0004\b>\u0010\u0006R\u0017\u0010?\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010\u0004\u001a\u0004\b@\u0010\u0006R\u0017\u0010A\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010\u0004\u001a\u0004\bB\u0010\u0006R\u0017\u0010C\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010\u0004\u001a\u0004\bD\u0010\u0006R\u0017\u0010E\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010\u0004\u001a\u0004\bF\u0010\u0006R\u0017\u0010G\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010\u0004\u001a\u0004\bH\u0010\u0006R\u0017\u0010I\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010J\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010\u0004\u001a\u0004\bK\u0010\u0006R\u0017\u0010L\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bL\u0010\u0004\u001a\u0004\bM\u0010\u0006R \u0010N\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bN\u0010\t\u001a\u0004\bO\u0010\u000bR\u0017\u0010P\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bP\u0010\u0004\u001a\u0004\bQ\u0010\u0006R\u0017\u0010R\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bR\u0010\u0004\u001a\u0004\bS\u0010\u0006R\u0017\u0010T\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bT\u0010\u0004\u001a\u0004\bU\u0010\u0006R\u0017\u0010V\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bV\u0010\u0004\u001a\u0004\bW\u0010\u0006R\u0017\u0010X\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bX\u0010\u0004\u001a\u0004\bY\u0010\u0006R\u0017\u0010Z\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bZ\u0010\u0004\u001a\u0004\b[\u0010\u0006R \u0010\\\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\\\u0010\t\u001a\u0004\b]\u0010\u000bR\u0017\u0010^\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b^\u0010\u0004\u001a\u0004\b_\u0010\u0006R\u0017\u0010`\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b`\u0010\u0004\u001a\u0004\ba\u0010\u0006R\u0017\u0010b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bb\u0010\u0004\u001a\u0004\bc\u0010\u0006R\u0017\u0010d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bd\u0010\u0004\u001a\u0004\be\u0010\u0006R\u0017\u0010f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bf\u0010\u0004\u001a\u0004\bg\u0010\u0006R\u0017\u0010h\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bh\u0010\u0004\u001a\u0004\bi\u0010\u0006R\u0017\u0010k\u001a\u00020j8\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0017\u0010o\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bo\u0010\u0004\u001a\u0004\bp\u0010\u0006R\u0017\u0010q\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bq\u0010\u0004\u001a\u0004\br\u0010\u0006R\u0017\u0010s\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bs\u0010\u0004\u001a\u0004\bt\u0010\u0006R\u0017\u0010u\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bu\u0010\u0004\u001a\u0004\bv\u0010\u0006R\u0017\u0010w\u001a\u00020j8\u0006¢\u0006\f\n\u0004\bw\u0010l\u001a\u0004\bx\u0010nR\u0017\u0010y\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\by\u0010\u0004\u001a\u0004\bz\u0010\u0006R \u0010{\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b{\u0010\t\u001a\u0004\b|\u0010\u000bR\u0017\u0010}\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b}\u0010\u0004\u001a\u0004\b~\u0010\u0006R\u0018\u0010\u007f\u001a\u00020j8\u0006¢\u0006\r\n\u0004\b\u007f\u0010l\u001a\u0005\b\u0080\u0001\u0010nR\u001a\u0010\u0081\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\u0004\u001a\u0005\b\u0082\u0001\u0010\u0006R#\u0010\u0083\u0001\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010\t\u001a\u0005\b\u0084\u0001\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0087\u0001"}, d2 = {"Lt0/v;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveIndicatorColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", ak.av, "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "Ls1/h;", "ActiveIndicatorHeight", "F", "b", "()F", "CaretColor", ak.aF, "ContainerColor", "d", "ContainerHeight", "e", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "f", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "DisabledActiveIndicatorColor", "g", "DisabledActiveIndicatorHeight", RXScreenCaptureService.KEY_HEIGHT, "DisabledContainerColor", "i", "DisabledInputColor", "j", "DisabledLabelColor", "k", "DisabledLeadingIconColor", "l", "DisabledSupportingColor", "m", "DisabledTrailingIconColor", "n", "ErrorActiveIndicatorColor", "o", "ErrorFocusActiveIndicatorColor", "p", "ErrorFocusCaretColor", "q", "ErrorFocusInputColor", "r", "ErrorFocusLabelColor", ak.aB, "ErrorFocusLeadingIconColor", "t", "ErrorFocusSupportingColor", ak.aG, "ErrorFocusTrailingIconColor", "v", "ErrorHoverActiveIndicatorColor", RXScreenCaptureService.KEY_WIDTH, "ErrorHoverInputColor", "x", "ErrorHoverLabelColor", "y", "ErrorHoverLeadingIconColor", ak.aD, "ErrorHoverSupportingColor", androidx.exifinterface.media.a.W4, "ErrorHoverTrailingIconColor", "B", "ErrorInputColor", "C", "ErrorLabelColor", "D", "ErrorLeadingIconColor", androidx.exifinterface.media.a.S4, "ErrorSupportingColor", "ErrorTrailingIconColor", "G", "FocusActiveIndicatorColor", "H", "FocusActiveIndicatorHeight", "I", "FocusInputColor", "J", "FocusLabelColor", "K", "FocusLeadingIconColor", "L", "FocusSupportingColor", "M", "FocusTrailingIconColor", "N", "HoverActiveIndicatorColor", "O", "HoverActiveIndicatorHeight", "P", "HoverInputColor", "Q", "HoverLabelColor", "R", "HoverLeadingIconColor", androidx.exifinterface.media.a.R4, "HoverSupportingColor", androidx.exifinterface.media.a.f23244d5, "HoverTrailingIconColor", "U", "InputColor", androidx.exifinterface.media.a.X4, "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "InputFont", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", androidx.exifinterface.media.a.T4, "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "InputPlaceholderColor", "X", "InputPrefixColor", "Y", "InputSuffixColor", "Z", "LabelColor", "a0", "LabelFont", "b0", "LeadingIconColor", "c0", "LeadingIconSize", "d0", "SupportingColor", "e0", "SupportingFont", "f0", "TrailingIconColor", "g0", "TrailingIconSize", "h0", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class v {

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

    @dl.d
    private static final ColorSchemeKeyTokens O;

    @dl.d
    private static final ColorSchemeKeyTokens P;
    private static final float Q;

    @dl.d
    private static final ColorSchemeKeyTokens R;

    @dl.d
    private static final ColorSchemeKeyTokens S;

    @dl.d
    private static final ColorSchemeKeyTokens T;

    @dl.d
    private static final ColorSchemeKeyTokens U;

    @dl.d
    private static final ColorSchemeKeyTokens V;

    @dl.d
    private static final ColorSchemeKeyTokens W;
    private static final float X;

    @dl.d
    private static final ColorSchemeKeyTokens Y;

    @dl.d
    private static final ColorSchemeKeyTokens Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final v f140408a = new v();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140409a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140410b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140411b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f140412c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140413c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140414d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140415d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140416e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @dl.d
    private static final TypographyKeyTokens f140417e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f140418f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140419f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final ShapeKeyTokens f140420g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140421g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140422h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140423h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f140424i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140425i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f140426j = 0.38f;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    @dl.d
    private static final TypographyKeyTokens f140427j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140428k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140429k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f140430l = 0.04f;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final float f140431l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140432m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140433m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final float f140434n = 0.38f;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    @dl.d
    private static final TypographyKeyTokens f140435n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140436o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140437o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final float f140438p = 0.38f;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final float f140439p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140440q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final float f140441r = 0.38f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140442s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final float f140443t = 0.38f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140444u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final float f140445v = 0.38f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140446w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140447x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140448y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140449z;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurfaceVariant;
        f140410b = colorSchemeKeyTokens;
        float f10 = (float) 1.0d;
        f140412c = s1.h.g(f10);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.Primary;
        f140414d = colorSchemeKeyTokens2;
        f140416e = ColorSchemeKeyTokens.SurfaceVariant;
        f140418f = s1.h.g((float) 56.0d);
        f140420g = ShapeKeyTokens.CornerExtraSmallTop;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurface;
        f140422h = colorSchemeKeyTokens3;
        f140424i = s1.h.g(f10);
        f140428k = colorSchemeKeyTokens3;
        f140432m = colorSchemeKeyTokens3;
        f140436o = colorSchemeKeyTokens3;
        f140440q = colorSchemeKeyTokens3;
        f140442s = colorSchemeKeyTokens3;
        f140444u = colorSchemeKeyTokens3;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.Error;
        f140446w = colorSchemeKeyTokens4;
        f140447x = colorSchemeKeyTokens4;
        f140448y = colorSchemeKeyTokens4;
        f140449z = colorSchemeKeyTokens3;
        A = colorSchemeKeyTokens4;
        B = colorSchemeKeyTokens;
        C = colorSchemeKeyTokens4;
        D = colorSchemeKeyTokens4;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.OnErrorContainer;
        E = colorSchemeKeyTokens5;
        F = colorSchemeKeyTokens3;
        G = colorSchemeKeyTokens5;
        H = colorSchemeKeyTokens;
        I = colorSchemeKeyTokens4;
        J = colorSchemeKeyTokens5;
        K = colorSchemeKeyTokens3;
        L = colorSchemeKeyTokens4;
        M = colorSchemeKeyTokens;
        N = colorSchemeKeyTokens4;
        O = colorSchemeKeyTokens4;
        P = colorSchemeKeyTokens2;
        Q = s1.h.g((float) 2.0d);
        R = colorSchemeKeyTokens3;
        S = colorSchemeKeyTokens2;
        T = colorSchemeKeyTokens;
        U = colorSchemeKeyTokens;
        V = colorSchemeKeyTokens;
        W = colorSchemeKeyTokens3;
        X = s1.h.g(f10);
        Y = colorSchemeKeyTokens3;
        Z = colorSchemeKeyTokens;
        f140409a0 = colorSchemeKeyTokens;
        f140411b0 = colorSchemeKeyTokens;
        f140413c0 = colorSchemeKeyTokens;
        f140415d0 = colorSchemeKeyTokens3;
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.BodyLarge;
        f140417e0 = typographyKeyTokens;
        f140419f0 = colorSchemeKeyTokens;
        f140421g0 = colorSchemeKeyTokens;
        f140423h0 = colorSchemeKeyTokens;
        f140425i0 = colorSchemeKeyTokens;
        f140427j0 = typographyKeyTokens;
        f140429k0 = colorSchemeKeyTokens;
        f140431l0 = s1.h.g((float) 20.0d);
        f140433m0 = colorSchemeKeyTokens;
        f140435n0 = TypographyKeyTokens.BodySmall;
        f140437o0 = colorSchemeKeyTokens;
        f140439p0 = s1.h.g((float) 24.0d);
    }

    private v() {
    }

    @dl.d
    public final ColorSchemeKeyTokens A() {
        return I;
    }

    @dl.d
    public final ColorSchemeKeyTokens B() {
        return J;
    }

    @dl.d
    public final ColorSchemeKeyTokens C() {
        return K;
    }

    @dl.d
    public final ColorSchemeKeyTokens D() {
        return L;
    }

    @dl.d
    public final ColorSchemeKeyTokens E() {
        return M;
    }

    @dl.d
    public final ColorSchemeKeyTokens F() {
        return N;
    }

    @dl.d
    public final ColorSchemeKeyTokens G() {
        return O;
    }

    @dl.d
    public final ColorSchemeKeyTokens H() {
        return P;
    }

    public final float I() {
        return Q;
    }

    @dl.d
    public final ColorSchemeKeyTokens J() {
        return R;
    }

    @dl.d
    public final ColorSchemeKeyTokens K() {
        return S;
    }

    @dl.d
    public final ColorSchemeKeyTokens L() {
        return T;
    }

    @dl.d
    public final ColorSchemeKeyTokens M() {
        return U;
    }

    @dl.d
    public final ColorSchemeKeyTokens N() {
        return V;
    }

    @dl.d
    public final ColorSchemeKeyTokens O() {
        return W;
    }

    public final float P() {
        return X;
    }

    @dl.d
    public final ColorSchemeKeyTokens Q() {
        return Y;
    }

    @dl.d
    public final ColorSchemeKeyTokens R() {
        return Z;
    }

    @dl.d
    public final ColorSchemeKeyTokens S() {
        return f140409a0;
    }

    @dl.d
    public final ColorSchemeKeyTokens T() {
        return f140411b0;
    }

    @dl.d
    public final ColorSchemeKeyTokens U() {
        return f140413c0;
    }

    @dl.d
    public final ColorSchemeKeyTokens V() {
        return f140415d0;
    }

    @dl.d
    public final TypographyKeyTokens W() {
        return f140417e0;
    }

    @dl.d
    public final ColorSchemeKeyTokens X() {
        return f140419f0;
    }

    @dl.d
    public final ColorSchemeKeyTokens Y() {
        return f140421g0;
    }

    @dl.d
    public final ColorSchemeKeyTokens Z() {
        return f140423h0;
    }

    @dl.d
    public final ColorSchemeKeyTokens a() {
        return f140410b;
    }

    @dl.d
    public final ColorSchemeKeyTokens a0() {
        return f140425i0;
    }

    public final float b() {
        return f140412c;
    }

    @dl.d
    public final TypographyKeyTokens b0() {
        return f140427j0;
    }

    @dl.d
    public final ColorSchemeKeyTokens c() {
        return f140414d;
    }

    @dl.d
    public final ColorSchemeKeyTokens c0() {
        return f140429k0;
    }

    @dl.d
    public final ColorSchemeKeyTokens d() {
        return f140416e;
    }

    public final float d0() {
        return f140431l0;
    }

    public final float e() {
        return f140418f;
    }

    @dl.d
    public final ColorSchemeKeyTokens e0() {
        return f140433m0;
    }

    @dl.d
    public final ShapeKeyTokens f() {
        return f140420g;
    }

    @dl.d
    public final TypographyKeyTokens f0() {
        return f140435n0;
    }

    @dl.d
    public final ColorSchemeKeyTokens g() {
        return f140422h;
    }

    @dl.d
    public final ColorSchemeKeyTokens g0() {
        return f140437o0;
    }

    public final float h() {
        return f140424i;
    }

    public final float h0() {
        return f140439p0;
    }

    @dl.d
    public final ColorSchemeKeyTokens i() {
        return f140428k;
    }

    @dl.d
    public final ColorSchemeKeyTokens j() {
        return f140432m;
    }

    @dl.d
    public final ColorSchemeKeyTokens k() {
        return f140436o;
    }

    @dl.d
    public final ColorSchemeKeyTokens l() {
        return f140440q;
    }

    @dl.d
    public final ColorSchemeKeyTokens m() {
        return f140442s;
    }

    @dl.d
    public final ColorSchemeKeyTokens n() {
        return f140444u;
    }

    @dl.d
    public final ColorSchemeKeyTokens o() {
        return f140446w;
    }

    @dl.d
    public final ColorSchemeKeyTokens p() {
        return f140447x;
    }

    @dl.d
    public final ColorSchemeKeyTokens q() {
        return f140448y;
    }

    @dl.d
    public final ColorSchemeKeyTokens r() {
        return f140449z;
    }

    @dl.d
    public final ColorSchemeKeyTokens s() {
        return A;
    }

    @dl.d
    public final ColorSchemeKeyTokens t() {
        return B;
    }

    @dl.d
    public final ColorSchemeKeyTokens u() {
        return C;
    }

    @dl.d
    public final ColorSchemeKeyTokens v() {
        return D;
    }

    @dl.d
    public final ColorSchemeKeyTokens w() {
        return E;
    }

    @dl.d
    public final ColorSchemeKeyTokens x() {
        return F;
    }

    @dl.d
    public final ColorSchemeKeyTokens y() {
        return G;
    }

    @dl.d
    public final ColorSchemeKeyTokens z() {
        return H;
    }
}
