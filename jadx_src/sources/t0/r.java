package t0;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: FilledAutocompleteTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b{\bÀ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R \u0010\u0015\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0016\u0010\u000bR \u0010\u0017\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R \u0010#\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010\t\u001a\u0004\b$\u0010\u000bR\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006R\u0017\u0010'\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u0004\u001a\u0004\b(\u0010\u0006R \u0010)\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b)\u0010\t\u001a\u0004\b*\u0010\u000bR\u0017\u0010+\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010\u000e\u001a\u0004\b,\u0010\u0010R\u0017\u0010-\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u0004\u001a\u0004\b.\u0010\u0006R \u0010/\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b/\u0010\t\u001a\u0004\b0\u0010\u000bR\u0017\u00101\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\u0004\u001a\u0004\b2\u0010\u0006R\u0017\u00103\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\u0004\u001a\u0004\b4\u0010\u0006R\u0017\u00105\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006R\u0017\u00107\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010\u0004\u001a\u0004\b8\u0010\u0006R\u0017\u00109\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010\u0004\u001a\u0004\b:\u0010\u0006R\u0017\u0010;\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006R\u0017\u0010=\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010\u0004\u001a\u0004\b>\u0010\u0006R\u0017\u0010?\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010\u0004\u001a\u0004\b@\u0010\u0006R\u0017\u0010A\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010\u0004\u001a\u0004\bB\u0010\u0006R\u0017\u0010C\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010\u0004\u001a\u0004\bD\u0010\u0006R\u0017\u0010E\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010\u0004\u001a\u0004\bF\u0010\u0006R\u0017\u0010G\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010\u0004\u001a\u0004\bH\u0010\u0006R\u0017\u0010I\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u0010\u0004\u001a\u0004\bJ\u0010\u0006R\u0017\u0010K\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bK\u0010\u0004\u001a\u0004\bL\u0010\u0006R\u0017\u0010M\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bM\u0010\u0004\u001a\u0004\bN\u0010\u0006R\u0017\u0010O\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bO\u0010\u0004\u001a\u0004\bP\u0010\u0006R\u0017\u0010Q\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010\u0004\u001a\u0004\bR\u0010\u0006R\u0017\u0010S\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bS\u0010\u0004\u001a\u0004\bT\u0010\u0006R\u0017\u0010U\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bU\u0010\u0004\u001a\u0004\bV\u0010\u0006R\u0017\u0010W\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bW\u0010\u0004\u001a\u0004\bX\u0010\u0006R\u0017\u0010Y\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bY\u0010\u0004\u001a\u0004\bZ\u0010\u0006R\u0017\u0010[\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b[\u0010\u0004\u001a\u0004\b\\\u0010\u0006R\u0017\u0010]\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b]\u0010\u0004\u001a\u0004\b^\u0010\u0006R\u0017\u0010_\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b_\u0010\u0004\u001a\u0004\b`\u0010\u0006R\u0017\u0010a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\ba\u0010\u0004\u001a\u0004\bb\u0010\u0006R\u0017\u0010c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bc\u0010\u0004\u001a\u0004\bd\u0010\u0006R \u0010e\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\be\u0010\t\u001a\u0004\bf\u0010\u000bR\u0017\u0010g\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bg\u0010\u0004\u001a\u0004\bh\u0010\u0006R\u0017\u0010i\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bi\u0010\u0004\u001a\u0004\bj\u0010\u0006R\u0017\u0010k\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bk\u0010\u0004\u001a\u0004\bl\u0010\u0006R\u0017\u0010m\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bm\u0010\u0004\u001a\u0004\bn\u0010\u0006R\u0017\u0010o\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bo\u0010\u0004\u001a\u0004\bp\u0010\u0006R\u0017\u0010q\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bq\u0010\u0004\u001a\u0004\br\u0010\u0006R \u0010s\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bs\u0010\t\u001a\u0004\bt\u0010\u000bR\u0017\u0010u\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bu\u0010\u0004\u001a\u0004\bv\u0010\u0006R\u0017\u0010w\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bw\u0010\u0004\u001a\u0004\bx\u0010\u0006R\u0017\u0010y\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\by\u0010\u0004\u001a\u0004\bz\u0010\u0006R\u0017\u0010{\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b{\u0010\u0004\u001a\u0004\b|\u0010\u0006R\u0017\u0010}\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b}\u0010\u0004\u001a\u0004\b~\u0010\u0006R\u0018\u0010\u007f\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b\u007f\u0010\u0004\u001a\u0005\b\u0080\u0001\u0010\u0006R\u001a\u0010\u0081\u0001\u001a\u00020\u001a8\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\u001c\u001a\u0005\b\u0082\u0001\u0010\u001eR\u001a\u0010\u0083\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010\u0004\u001a\u0005\b\u0084\u0001\u0010\u0006R\u001a\u0010\u0085\u0001\u001a\u00020\u001a8\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\u001c\u001a\u0005\b\u0086\u0001\u0010\u001eR\u001a\u0010\u0087\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\u0004\u001a\u0005\b\u0088\u0001\u0010\u0006R#\u0010\u0089\u0001\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010\t\u001a\u0005\b\u008a\u0001\u0010\u000bR\u001a\u0010\u008b\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\u0004\u001a\u0005\b\u008c\u0001\u0010\u0006R\u001a\u0010\u008d\u0001\u001a\u00020\u001a8\u0006¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010\u001c\u001a\u0005\b\u008e\u0001\u0010\u001eR\u001a\u0010\u008f\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010\u0004\u001a\u0005\b\u0090\u0001\u0010\u0006R#\u0010\u0091\u0001\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010\t\u001a\u0005\b\u0092\u0001\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0095\u0001"}, d2 = {"Lt0/r;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "MenuContainerColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "y", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "Ls1/h;", "MenuContainerElevation", "F", ak.aD, "()F", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "MenuContainerShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", androidx.exifinterface.media.a.W4, "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "MenuContainerSurfaceTintLayerColor", "B", "MenuDividerColor", "C", "MenuDividerHeight", "D", "MenuListItemContainerHeight", androidx.exifinterface.media.a.S4, "MenuListItemLabelTextColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "MenuListItemLabelTextFont", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "G", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "MenuListItemSelectedContainerColor", "H", "TextFieldActiveIndicatorColor", "I", "TextFieldActiveIndicatorHeight", "J", "TextFieldCaretColor", "K", "TextFieldContainerColor", "L", "TextFieldContainerHeight", "M", "TextFieldContainerShape", "N", "TextFieldDisabledActiveIndicatorColor", "O", "TextFieldDisabledActiveIndicatorHeight", "P", "TextFieldDisabledContainerColor", "Q", "FieldDisabledInputTextColor", ak.av, "FieldDisabledLabelTextColor", "b", "TextFieldDisabledLeadingIconColor", "R", "FieldDisabledSupportingTextColor", ak.aF, "TextFieldDisabledTrailingIconColor", androidx.exifinterface.media.a.R4, "TextFieldErrorActiveIndicatorColor", androidx.exifinterface.media.a.f23244d5, "TextFieldErrorFocusActiveIndicatorColor", "U", "TextFieldErrorFocusCaretColor", androidx.exifinterface.media.a.X4, "FieldErrorFocusInputTextColor", "d", "FieldErrorFocusLabelTextColor", "e", "TextFieldErrorFocusLeadingIconColor", androidx.exifinterface.media.a.T4, "FieldErrorFocusSupportingTextColor", "f", "TextFieldErrorFocusTrailingIconColor", "X", "TextFieldErrorHoverActiveIndicatorColor", "Y", "FieldErrorHoverInputTextColor", "g", "FieldErrorHoverLabelTextColor", RXScreenCaptureService.KEY_HEIGHT, "TextFieldErrorHoverLeadingIconColor", "Z", "FieldErrorHoverSupportingTextColor", "i", "TextFieldErrorHoverTrailingIconColor", "a0", "FieldErrorInputTextColor", "j", "FieldErrorLabelTextColor", "k", "TextFieldErrorLeadingIconColor", "b0", "FieldErrorSupportingTextColor", "l", "TextFieldErrorTrailingIconColor", "c0", "TextFieldFocusActiveIndicatorColor", "d0", "TextFieldFocusActiveIndicatorHeight", "e0", "FieldFocusInputTextColor", "m", "FieldFocusLabelTextColor", "n", "TextFieldFocusLeadingIconColor", "f0", "FieldFocusSupportingTextColor", "o", "TextFieldFocusTrailingIconColor", "g0", "TextFieldHoverActiveIndicatorColor", "h0", "TextFieldHoverActiveIndicatorHeight", "i0", "FieldHoverInputTextColor", "p", "FieldHoverLabelTextColor", "q", "TextFieldHoverLeadingIconColor", "j0", "FieldHoverSupportingTextColor", "r", "TextFieldHoverTrailingIconColor", "k0", "FieldInputTextColor", ak.aB, "FieldInputTextFont", "t", "FieldLabelTextColor", ak.aG, "FieldLabelTextFont", "v", "TextFieldLeadingIconColor", "l0", "TextFieldLeadingIconSize", "m0", "FieldSupportingTextColor", RXScreenCaptureService.KEY_WIDTH, "FieldSupportingTextFont", "x", "TextFieldTrailingIconColor", "n0", "TextFieldTrailingIconSize", "o0", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class r {

    @dl.d
    private static final ColorSchemeKeyTokens A;
    public static final float B = 0.38f;

    @dl.d
    private static final ColorSchemeKeyTokens C;
    public static final float D = 0.38f;

    @dl.d
    private static final ColorSchemeKeyTokens E;
    public static final float F = 0.38f;

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

    @dl.d
    private static final ColorSchemeKeyTokens V;

    @dl.d
    private static final ColorSchemeKeyTokens W;

    @dl.d
    private static final ColorSchemeKeyTokens X;

    @dl.d
    private static final ColorSchemeKeyTokens Y;

    @dl.d
    private static final ColorSchemeKeyTokens Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final float f140238a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140240b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140242c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140244d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140246e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140247f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140248f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f140249g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140250g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f140251h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final float f140252h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140253i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140254i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final TypographyKeyTokens f140255j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140256j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140257k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140258k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140259l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140260l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float f140261m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140262m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140263n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140264n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140265o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    @dl.d
    private static final TypographyKeyTokens f140266o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final float f140267p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140268p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private static final ShapeKeyTokens f140269q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @dl.d
    private static final TypographyKeyTokens f140270q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140271r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140272r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final float f140273s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final float f140274s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final float f140275t = 0.38f;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140276t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140277u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @dl.d
    private static final TypographyKeyTokens f140278u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final float f140279v = 0.04f;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140280v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140281w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final float f140282w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final float f140283x = 0.38f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140284y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final float f140285z = 0.38f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final r f140237a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140239b = ColorSchemeKeyTokens.Surface;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f140241c = l.f139980a.c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final ShapeKeyTokens f140243d = ShapeKeyTokens.CornerExtraSmall;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140245e = ColorSchemeKeyTokens.SurfaceTint;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.SurfaceVariant;
        f140247f = colorSchemeKeyTokens;
        float f10 = (float) 1.0d;
        f140249g = s1.h.g(f10);
        f140251h = s1.h.g((float) 48.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        f140253i = colorSchemeKeyTokens2;
        f140255j = TypographyKeyTokens.LabelLarge;
        f140257k = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurfaceVariant;
        f140259l = colorSchemeKeyTokens3;
        f140261m = s1.h.g(f10);
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.Primary;
        f140263n = colorSchemeKeyTokens4;
        f140265o = colorSchemeKeyTokens;
        f140267p = s1.h.g((float) 56.0d);
        f140269q = ShapeKeyTokens.CornerExtraSmallTop;
        f140271r = colorSchemeKeyTokens2;
        f140273s = s1.h.g(f10);
        f140277u = colorSchemeKeyTokens2;
        f140281w = colorSchemeKeyTokens2;
        f140284y = colorSchemeKeyTokens2;
        A = colorSchemeKeyTokens2;
        C = colorSchemeKeyTokens2;
        E = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.Error;
        G = colorSchemeKeyTokens5;
        H = colorSchemeKeyTokens5;
        I = colorSchemeKeyTokens5;
        J = colorSchemeKeyTokens2;
        K = colorSchemeKeyTokens5;
        L = colorSchemeKeyTokens3;
        M = colorSchemeKeyTokens5;
        N = colorSchemeKeyTokens5;
        ColorSchemeKeyTokens colorSchemeKeyTokens6 = ColorSchemeKeyTokens.OnErrorContainer;
        O = colorSchemeKeyTokens6;
        P = colorSchemeKeyTokens2;
        Q = colorSchemeKeyTokens6;
        R = colorSchemeKeyTokens3;
        S = colorSchemeKeyTokens5;
        T = colorSchemeKeyTokens6;
        U = colorSchemeKeyTokens2;
        V = colorSchemeKeyTokens5;
        W = colorSchemeKeyTokens3;
        X = colorSchemeKeyTokens5;
        Y = colorSchemeKeyTokens5;
        Z = colorSchemeKeyTokens4;
        f140238a0 = s1.h.g((float) 2.0d);
        f140240b0 = colorSchemeKeyTokens2;
        f140242c0 = colorSchemeKeyTokens4;
        f140244d0 = colorSchemeKeyTokens3;
        f140246e0 = colorSchemeKeyTokens3;
        f140248f0 = colorSchemeKeyTokens3;
        f140250g0 = colorSchemeKeyTokens2;
        f140252h0 = s1.h.g(f10);
        f140254i0 = colorSchemeKeyTokens2;
        f140256j0 = colorSchemeKeyTokens3;
        f140258k0 = colorSchemeKeyTokens3;
        f140260l0 = colorSchemeKeyTokens3;
        f140262m0 = colorSchemeKeyTokens3;
        f140264n0 = colorSchemeKeyTokens2;
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.BodyLarge;
        f140266o0 = typographyKeyTokens;
        f140268p0 = colorSchemeKeyTokens3;
        f140270q0 = typographyKeyTokens;
        f140272r0 = colorSchemeKeyTokens3;
        f140274s0 = s1.h.g((float) 20.0d);
        f140276t0 = colorSchemeKeyTokens3;
        f140278u0 = TypographyKeyTokens.BodySmall;
        f140280v0 = colorSchemeKeyTokens3;
        f140282w0 = s1.h.g((float) 24.0d);
    }

    private r() {
    }

    @dl.d
    public final ShapeKeyTokens A() {
        return f140243d;
    }

    @dl.d
    public final ColorSchemeKeyTokens B() {
        return f140245e;
    }

    @dl.d
    public final ColorSchemeKeyTokens C() {
        return f140247f;
    }

    public final float D() {
        return f140249g;
    }

    public final float E() {
        return f140251h;
    }

    @dl.d
    public final ColorSchemeKeyTokens F() {
        return f140253i;
    }

    @dl.d
    public final TypographyKeyTokens G() {
        return f140255j;
    }

    @dl.d
    public final ColorSchemeKeyTokens H() {
        return f140257k;
    }

    @dl.d
    public final ColorSchemeKeyTokens I() {
        return f140259l;
    }

    public final float J() {
        return f140261m;
    }

    @dl.d
    public final ColorSchemeKeyTokens K() {
        return f140263n;
    }

    @dl.d
    public final ColorSchemeKeyTokens L() {
        return f140265o;
    }

    public final float M() {
        return f140267p;
    }

    @dl.d
    public final ShapeKeyTokens N() {
        return f140269q;
    }

    @dl.d
    public final ColorSchemeKeyTokens O() {
        return f140271r;
    }

    public final float P() {
        return f140273s;
    }

    @dl.d
    public final ColorSchemeKeyTokens Q() {
        return f140277u;
    }

    @dl.d
    public final ColorSchemeKeyTokens R() {
        return A;
    }

    @dl.d
    public final ColorSchemeKeyTokens S() {
        return E;
    }

    @dl.d
    public final ColorSchemeKeyTokens T() {
        return G;
    }

    @dl.d
    public final ColorSchemeKeyTokens U() {
        return H;
    }

    @dl.d
    public final ColorSchemeKeyTokens V() {
        return I;
    }

    @dl.d
    public final ColorSchemeKeyTokens W() {
        return L;
    }

    @dl.d
    public final ColorSchemeKeyTokens X() {
        return N;
    }

    @dl.d
    public final ColorSchemeKeyTokens Y() {
        return O;
    }

    @dl.d
    public final ColorSchemeKeyTokens Z() {
        return R;
    }

    @dl.d
    public final ColorSchemeKeyTokens a() {
        return f140281w;
    }

    @dl.d
    public final ColorSchemeKeyTokens a0() {
        return T;
    }

    @dl.d
    public final ColorSchemeKeyTokens b() {
        return f140284y;
    }

    @dl.d
    public final ColorSchemeKeyTokens b0() {
        return W;
    }

    @dl.d
    public final ColorSchemeKeyTokens c() {
        return C;
    }

    @dl.d
    public final ColorSchemeKeyTokens c0() {
        return Y;
    }

    @dl.d
    public final ColorSchemeKeyTokens d() {
        return J;
    }

    @dl.d
    public final ColorSchemeKeyTokens d0() {
        return Z;
    }

    @dl.d
    public final ColorSchemeKeyTokens e() {
        return K;
    }

    public final float e0() {
        return f140238a0;
    }

    @dl.d
    public final ColorSchemeKeyTokens f() {
        return M;
    }

    @dl.d
    public final ColorSchemeKeyTokens f0() {
        return f140244d0;
    }

    @dl.d
    public final ColorSchemeKeyTokens g() {
        return P;
    }

    @dl.d
    public final ColorSchemeKeyTokens g0() {
        return f140248f0;
    }

    @dl.d
    public final ColorSchemeKeyTokens h() {
        return Q;
    }

    @dl.d
    public final ColorSchemeKeyTokens h0() {
        return f140250g0;
    }

    @dl.d
    public final ColorSchemeKeyTokens i() {
        return S;
    }

    public final float i0() {
        return f140252h0;
    }

    @dl.d
    public final ColorSchemeKeyTokens j() {
        return U;
    }

    @dl.d
    public final ColorSchemeKeyTokens j0() {
        return f140258k0;
    }

    @dl.d
    public final ColorSchemeKeyTokens k() {
        return V;
    }

    @dl.d
    public final ColorSchemeKeyTokens k0() {
        return f140262m0;
    }

    @dl.d
    public final ColorSchemeKeyTokens l() {
        return X;
    }

    @dl.d
    public final ColorSchemeKeyTokens l0() {
        return f140272r0;
    }

    @dl.d
    public final ColorSchemeKeyTokens m() {
        return f140240b0;
    }

    public final float m0() {
        return f140274s0;
    }

    @dl.d
    public final ColorSchemeKeyTokens n() {
        return f140242c0;
    }

    @dl.d
    public final ColorSchemeKeyTokens n0() {
        return f140280v0;
    }

    @dl.d
    public final ColorSchemeKeyTokens o() {
        return f140246e0;
    }

    public final float o0() {
        return f140282w0;
    }

    @dl.d
    public final ColorSchemeKeyTokens p() {
        return f140254i0;
    }

    @dl.d
    public final ColorSchemeKeyTokens q() {
        return f140256j0;
    }

    @dl.d
    public final ColorSchemeKeyTokens r() {
        return f140260l0;
    }

    @dl.d
    public final ColorSchemeKeyTokens s() {
        return f140264n0;
    }

    @dl.d
    public final TypographyKeyTokens t() {
        return f140266o0;
    }

    @dl.d
    public final ColorSchemeKeyTokens u() {
        return f140268p0;
    }

    @dl.d
    public final TypographyKeyTokens v() {
        return f140270q0;
    }

    @dl.d
    public final ColorSchemeKeyTokens w() {
        return f140276t0;
    }

    @dl.d
    public final TypographyKeyTokens x() {
        return f140278u0;
    }

    @dl.d
    public final ColorSchemeKeyTokens y() {
        return f140239b;
    }

    public final float z() {
        return f140241c;
    }
}
