package t0;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: OutlinedAutocompleteTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\by\bÀ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R \u0010\u0015\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0016\u0010\u000bR \u0010\u0017\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R \u0010%\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\t\u001a\u0004\b&\u0010\u000bR\u0017\u0010'\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010\u000e\u001a\u0004\b(\u0010\u0010R\u0017\u0010)\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R\u0017\u0010+\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u0004\u001a\u0004\b,\u0010\u0006R\u0017\u0010-\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u0004\u001a\u0004\b.\u0010\u0006R\u0017\u0010/\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R \u00101\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b1\u0010\t\u001a\u0004\b2\u0010\u000bR\u0017\u00103\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\u0004\u001a\u0004\b4\u0010\u0006R\u0017\u00105\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006R\u0017\u00107\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010\u0004\u001a\u0004\b8\u0010\u0006R\u0017\u00109\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010\u0004\u001a\u0004\b:\u0010\u0006R\u0017\u0010;\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006R\u0017\u0010=\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010\u0004\u001a\u0004\b>\u0010\u0006R\u0017\u0010?\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010\u0004\u001a\u0004\b@\u0010\u0006R\u0017\u0010A\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010\u0004\u001a\u0004\bB\u0010\u0006R\u0017\u0010C\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010\u0004\u001a\u0004\bD\u0010\u0006R\u0017\u0010E\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010\u0004\u001a\u0004\bF\u0010\u0006R\u0017\u0010G\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010\u0004\u001a\u0004\bH\u0010\u0006R\u0017\u0010I\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u0010\u0004\u001a\u0004\bJ\u0010\u0006R\u0017\u0010K\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bK\u0010\u0004\u001a\u0004\bL\u0010\u0006R\u0017\u0010M\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bM\u0010\u0004\u001a\u0004\bN\u0010\u0006R\u0017\u0010O\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bO\u0010\u0004\u001a\u0004\bP\u0010\u0006R\u0017\u0010Q\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010\u0004\u001a\u0004\bR\u0010\u0006R\u0017\u0010S\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bS\u0010\u0004\u001a\u0004\bT\u0010\u0006R\u0017\u0010U\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bU\u0010\u0004\u001a\u0004\bV\u0010\u0006R\u0017\u0010W\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bW\u0010\u0004\u001a\u0004\bX\u0010\u0006R\u0017\u0010Y\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bY\u0010\u0004\u001a\u0004\bZ\u0010\u0006R\u0017\u0010[\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b[\u0010\u0004\u001a\u0004\b\\\u0010\u0006R\u0017\u0010]\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b]\u0010\u0004\u001a\u0004\b^\u0010\u0006R\u0017\u0010_\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b_\u0010\u0004\u001a\u0004\b`\u0010\u0006R\u0017\u0010a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\ba\u0010\u0004\u001a\u0004\bb\u0010\u0006R\u0017\u0010c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bc\u0010\u0004\u001a\u0004\bd\u0010\u0006R \u0010e\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\be\u0010\t\u001a\u0004\bf\u0010\u000bR\u0017\u0010g\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bg\u0010\u0004\u001a\u0004\bh\u0010\u0006R\u0017\u0010i\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bi\u0010\u0004\u001a\u0004\bj\u0010\u0006R\u0017\u0010k\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bk\u0010\u0004\u001a\u0004\bl\u0010\u0006R\u0017\u0010m\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bm\u0010\u0004\u001a\u0004\bn\u0010\u0006R\u0017\u0010o\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bo\u0010\u0004\u001a\u0004\bp\u0010\u0006R\u0017\u0010q\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bq\u0010\u0004\u001a\u0004\br\u0010\u0006R \u0010s\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bs\u0010\t\u001a\u0004\bt\u0010\u000bR\u0017\u0010u\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bu\u0010\u0004\u001a\u0004\bv\u0010\u0006R\u0017\u0010w\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bw\u0010\u0004\u001a\u0004\bx\u0010\u0006R\u0017\u0010y\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\by\u0010\u0004\u001a\u0004\bz\u0010\u0006R\u0017\u0010{\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b{\u0010\u001c\u001a\u0004\b|\u0010\u001eR\u0017\u0010}\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b}\u0010\u0004\u001a\u0004\b~\u0010\u0006R\u0018\u0010\u007f\u001a\u00020\u001a8\u0006¢\u0006\r\n\u0004\b\u007f\u0010\u001c\u001a\u0005\b\u0080\u0001\u0010\u001eR\u001a\u0010\u0081\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\u0004\u001a\u0005\b\u0082\u0001\u0010\u0006R#\u0010\u0083\u0001\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010\t\u001a\u0005\b\u0084\u0001\u0010\u000bR\u001a\u0010\u0085\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\u0004\u001a\u0005\b\u0086\u0001\u0010\u0006R#\u0010\u0087\u0001\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\t\u001a\u0005\b\u0088\u0001\u0010\u000bR\u001a\u0010\u0089\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010\u0004\u001a\u0005\b\u008a\u0001\u0010\u0006R\u001a\u0010\u008b\u0001\u001a\u00020\u001a8\u0006¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\u001c\u001a\u0005\b\u008c\u0001\u0010\u001eR\u001a\u0010\u008d\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010\u0004\u001a\u0005\b\u008e\u0001\u0010\u0006R#\u0010\u008f\u0001\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010\t\u001a\u0005\b\u0090\u0001\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0093\u0001"}, d2 = {"Lt0/i0;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "MenuContainerColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "y", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "Ls1/h;", "MenuContainerElevation", "F", ak.aD, "()F", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "MenuContainerShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", androidx.exifinterface.media.a.W4, "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "MenuContainerSurfaceTintLayerColor", "B", "MenuDividerColor", "C", "MenuDividerHeight", "D", "MenuListItemContainerHeight", androidx.exifinterface.media.a.S4, "MenuListItemLabelTextColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "MenuListItemLabelTextFont", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "G", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "MenuListItemSelectedContainerColor", "H", "TextFieldCaretColor", "I", "TextFieldContainerColor", "J", "TextFieldContainerHeight", "K", "TextFieldContainerShape", "L", "FieldDisabledInputTextColor", ak.av, "FieldDisabledLabelTextColor", "b", "TextFieldDisabledLeadingIconColor", "M", "TextFieldDisabledOutlineColor", "N", "TextFieldDisabledOutlineWidth", "O", "FieldDisabledSupportingTextColor", ak.aF, "TextFieldDisabledTrailingIconColor", "P", "TextFieldErrorFocusCaretColor", "Q", "FieldErrorFocusInputTextColor", "d", "FieldErrorFocusLabelTextColor", "e", "TextFieldErrorFocusLeadingIconColor", "R", "TextFieldErrorFocusOutlineColor", androidx.exifinterface.media.a.R4, "FieldErrorFocusSupportingTextColor", "f", "TextFieldErrorFocusTrailingIconColor", androidx.exifinterface.media.a.f23244d5, "FieldErrorHoverInputTextColor", "g", "FieldErrorHoverLabelTextColor", RXScreenCaptureService.KEY_HEIGHT, "TextFieldErrorHoverLeadingIconColor", "U", "TextFieldErrorHoverOutlineColor", androidx.exifinterface.media.a.X4, "FieldErrorHoverSupportingTextColor", "i", "TextFieldErrorHoverTrailingIconColor", androidx.exifinterface.media.a.T4, "FieldErrorInputTextColor", "j", "FieldErrorLabelTextColor", "k", "TextFieldErrorLeadingIconColor", "X", "TextFieldErrorOutlineColor", "Y", "FieldErrorSupportingTextColor", "l", "TextFieldErrorTrailingIconColor", "Z", "FieldFocusInputTextColor", "m", "FieldFocusLabelTextColor", "n", "TextFieldFocusLeadingIconColor", "a0", "TextFieldFocusOutlineColor", "b0", "TextFieldFocusOutlineWidth", "c0", "FieldFocusSupportingTextColor", "o", "TextFieldFocusTrailingIconColor", "d0", "FieldHoverInputTextColor", "p", "FieldHoverLabelTextColor", "q", "TextFieldHoverLeadingIconColor", "e0", "TextFieldHoverOutlineColor", "f0", "TextFieldHoverOutlineWidth", "g0", "FieldHoverSupportingTextColor", "r", "TextFieldHoverTrailingIconColor", "h0", "FieldInputTextColor", ak.aB, "FieldInputTextFont", "t", "FieldLabelTextColor", ak.aG, "FieldLabelTextFont", "v", "TextFieldLeadingIconColor", "i0", "TextFieldLeadingIconSize", "j0", "TextFieldOutlineColor", "k0", "TextFieldOutlineWidth", "l0", "FieldSupportingTextColor", RXScreenCaptureService.KEY_WIDTH, "FieldSupportingTextFont", "x", "TextFieldTrailingIconColor", "m0", "TextFieldTrailingIconSize", "n0", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class i0 {

    @dl.d
    private static final ColorSchemeKeyTokens A;
    public static final float B = 0.38f;

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
    private static final float Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139850a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139852b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139854c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final ShapeKeyTokens f139855d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139856d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139857e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139858e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139859f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139860f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f139861g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final float f139862g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f139863h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139864h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139865i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139866i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final TypographyKeyTokens f139867j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139868j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139869k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    @dl.d
    private static final TypographyKeyTokens f139870k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139871l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139872l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139873m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    @dl.d
    private static final TypographyKeyTokens f139874m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f139875n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139876n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final ShapeKeyTokens f139877o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final float f139878o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139879p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139880p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final float f139881q = 0.38f;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final float f139882q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139883r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139884r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final float f139885s = 0.38f;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @dl.d
    private static final TypographyKeyTokens f139886s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139887t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139888t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final float f139889u = 0.38f;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final float f139890u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139891v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final float f139892w = 0.12f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final float f139893x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139894y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final float f139895z = 0.38f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final i0 f139849a = new i0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139851b = ColorSchemeKeyTokens.Surface;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f139853c = l.f139980a.c();

    static {
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerExtraSmall;
        f139855d = shapeKeyTokens;
        f139857e = ColorSchemeKeyTokens.SurfaceTint;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.SurfaceVariant;
        f139859f = colorSchemeKeyTokens;
        float f10 = (float) 1.0d;
        f139861g = s1.h.g(f10);
        f139863h = s1.h.g((float) 48.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        f139865i = colorSchemeKeyTokens2;
        f139867j = TypographyKeyTokens.LabelLarge;
        f139869k = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.Primary;
        f139871l = colorSchemeKeyTokens3;
        f139873m = colorSchemeKeyTokens;
        f139875n = s1.h.g((float) 56.0d);
        f139877o = shapeKeyTokens;
        f139879p = colorSchemeKeyTokens2;
        f139883r = colorSchemeKeyTokens2;
        f139887t = colorSchemeKeyTokens2;
        f139891v = colorSchemeKeyTokens2;
        f139893x = s1.h.g(f10);
        f139894y = colorSchemeKeyTokens2;
        A = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.Error;
        C = colorSchemeKeyTokens4;
        D = colorSchemeKeyTokens2;
        E = colorSchemeKeyTokens4;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.OnSurfaceVariant;
        F = colorSchemeKeyTokens5;
        G = colorSchemeKeyTokens4;
        H = colorSchemeKeyTokens4;
        I = colorSchemeKeyTokens4;
        J = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens6 = ColorSchemeKeyTokens.OnErrorContainer;
        K = colorSchemeKeyTokens6;
        L = colorSchemeKeyTokens5;
        M = colorSchemeKeyTokens6;
        N = colorSchemeKeyTokens4;
        O = colorSchemeKeyTokens6;
        P = colorSchemeKeyTokens2;
        Q = colorSchemeKeyTokens4;
        R = colorSchemeKeyTokens5;
        S = colorSchemeKeyTokens4;
        T = colorSchemeKeyTokens4;
        U = colorSchemeKeyTokens4;
        V = colorSchemeKeyTokens2;
        W = colorSchemeKeyTokens3;
        X = colorSchemeKeyTokens5;
        Y = colorSchemeKeyTokens3;
        Z = s1.h.g((float) 2.0d);
        f139850a0 = colorSchemeKeyTokens5;
        f139852b0 = colorSchemeKeyTokens5;
        f139854c0 = colorSchemeKeyTokens2;
        f139856d0 = colorSchemeKeyTokens5;
        f139858e0 = colorSchemeKeyTokens5;
        f139860f0 = colorSchemeKeyTokens2;
        f139862g0 = s1.h.g(f10);
        f139864h0 = colorSchemeKeyTokens5;
        f139866i0 = colorSchemeKeyTokens5;
        f139868j0 = colorSchemeKeyTokens2;
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.BodyLarge;
        f139870k0 = typographyKeyTokens;
        f139872l0 = colorSchemeKeyTokens5;
        f139874m0 = typographyKeyTokens;
        f139876n0 = colorSchemeKeyTokens5;
        float f11 = (float) 24.0d;
        f139878o0 = s1.h.g(f11);
        f139880p0 = ColorSchemeKeyTokens.Outline;
        f139882q0 = s1.h.g(f10);
        f139884r0 = colorSchemeKeyTokens5;
        f139886s0 = TypographyKeyTokens.BodySmall;
        f139888t0 = colorSchemeKeyTokens5;
        f139890u0 = s1.h.g(f11);
    }

    private i0() {
    }

    @dl.d
    public final ShapeKeyTokens A() {
        return f139855d;
    }

    @dl.d
    public final ColorSchemeKeyTokens B() {
        return f139857e;
    }

    @dl.d
    public final ColorSchemeKeyTokens C() {
        return f139859f;
    }

    public final float D() {
        return f139861g;
    }

    public final float E() {
        return f139863h;
    }

    @dl.d
    public final ColorSchemeKeyTokens F() {
        return f139865i;
    }

    @dl.d
    public final TypographyKeyTokens G() {
        return f139867j;
    }

    @dl.d
    public final ColorSchemeKeyTokens H() {
        return f139869k;
    }

    @dl.d
    public final ColorSchemeKeyTokens I() {
        return f139871l;
    }

    @dl.d
    public final ColorSchemeKeyTokens J() {
        return f139873m;
    }

    public final float K() {
        return f139875n;
    }

    @dl.d
    public final ShapeKeyTokens L() {
        return f139877o;
    }

    @dl.d
    public final ColorSchemeKeyTokens M() {
        return f139887t;
    }

    @dl.d
    public final ColorSchemeKeyTokens N() {
        return f139891v;
    }

    public final float O() {
        return f139893x;
    }

    @dl.d
    public final ColorSchemeKeyTokens P() {
        return A;
    }

    @dl.d
    public final ColorSchemeKeyTokens Q() {
        return C;
    }

    @dl.d
    public final ColorSchemeKeyTokens R() {
        return F;
    }

    @dl.d
    public final ColorSchemeKeyTokens S() {
        return G;
    }

    @dl.d
    public final ColorSchemeKeyTokens T() {
        return I;
    }

    @dl.d
    public final ColorSchemeKeyTokens U() {
        return L;
    }

    @dl.d
    public final ColorSchemeKeyTokens V() {
        return M;
    }

    @dl.d
    public final ColorSchemeKeyTokens W() {
        return O;
    }

    @dl.d
    public final ColorSchemeKeyTokens X() {
        return R;
    }

    @dl.d
    public final ColorSchemeKeyTokens Y() {
        return S;
    }

    @dl.d
    public final ColorSchemeKeyTokens Z() {
        return U;
    }

    @dl.d
    public final ColorSchemeKeyTokens a() {
        return f139879p;
    }

    @dl.d
    public final ColorSchemeKeyTokens a0() {
        return X;
    }

    @dl.d
    public final ColorSchemeKeyTokens b() {
        return f139883r;
    }

    @dl.d
    public final ColorSchemeKeyTokens b0() {
        return Y;
    }

    @dl.d
    public final ColorSchemeKeyTokens c() {
        return f139894y;
    }

    public final float c0() {
        return Z;
    }

    @dl.d
    public final ColorSchemeKeyTokens d() {
        return D;
    }

    @dl.d
    public final ColorSchemeKeyTokens d0() {
        return f139852b0;
    }

    @dl.d
    public final ColorSchemeKeyTokens e() {
        return E;
    }

    @dl.d
    public final ColorSchemeKeyTokens e0() {
        return f139858e0;
    }

    @dl.d
    public final ColorSchemeKeyTokens f() {
        return H;
    }

    @dl.d
    public final ColorSchemeKeyTokens f0() {
        return f139860f0;
    }

    @dl.d
    public final ColorSchemeKeyTokens g() {
        return J;
    }

    public final float g0() {
        return f139862g0;
    }

    @dl.d
    public final ColorSchemeKeyTokens h() {
        return K;
    }

    @dl.d
    public final ColorSchemeKeyTokens h0() {
        return f139866i0;
    }

    @dl.d
    public final ColorSchemeKeyTokens i() {
        return N;
    }

    @dl.d
    public final ColorSchemeKeyTokens i0() {
        return f139876n0;
    }

    @dl.d
    public final ColorSchemeKeyTokens j() {
        return P;
    }

    public final float j0() {
        return f139878o0;
    }

    @dl.d
    public final ColorSchemeKeyTokens k() {
        return Q;
    }

    @dl.d
    public final ColorSchemeKeyTokens k0() {
        return f139880p0;
    }

    @dl.d
    public final ColorSchemeKeyTokens l() {
        return T;
    }

    public final float l0() {
        return f139882q0;
    }

    @dl.d
    public final ColorSchemeKeyTokens m() {
        return V;
    }

    @dl.d
    public final ColorSchemeKeyTokens m0() {
        return f139888t0;
    }

    @dl.d
    public final ColorSchemeKeyTokens n() {
        return W;
    }

    public final float n0() {
        return f139890u0;
    }

    @dl.d
    public final ColorSchemeKeyTokens o() {
        return f139850a0;
    }

    @dl.d
    public final ColorSchemeKeyTokens p() {
        return f139854c0;
    }

    @dl.d
    public final ColorSchemeKeyTokens q() {
        return f139856d0;
    }

    @dl.d
    public final ColorSchemeKeyTokens r() {
        return f139864h0;
    }

    @dl.d
    public final ColorSchemeKeyTokens s() {
        return f139868j0;
    }

    @dl.d
    public final TypographyKeyTokens t() {
        return f139870k0;
    }

    @dl.d
    public final ColorSchemeKeyTokens u() {
        return f139872l0;
    }

    @dl.d
    public final TypographyKeyTokens v() {
        return f139874m0;
    }

    @dl.d
    public final ColorSchemeKeyTokens w() {
        return f139884r0;
    }

    @dl.d
    public final TypographyKeyTokens x() {
        return f139886s0;
    }

    @dl.d
    public final ColorSchemeKeyTokens y() {
        return f139851b;
    }

    public final float z() {
        return f139853c;
    }
}
