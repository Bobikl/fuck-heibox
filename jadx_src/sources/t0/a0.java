package t0;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: InputChipTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\bX\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bo\u0010pR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R \u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010 \u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b \u0010\u0010\u001a\u0004\b!\u0010\u0012R\u0017\u0010\"\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\"\u0010\u0010\u001a\u0004\b#\u0010\u0012R\u0017\u0010$\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b$\u0010\u0010\u001a\u0004\b%\u0010\u0012R\u0017\u0010&\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b&\u0010\u0010\u001a\u0004\b'\u0010\u0012R \u0010(\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b(\u0010\u0004\u001a\u0004\b)\u0010\u0006R\u0017\u0010*\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b*\u0010\u0010\u001a\u0004\b+\u0010\u0012R\u0017\u0010,\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b,\u0010\u0010\u001a\u0004\b\u0004\u0010\u0012R\u0017\u0010-\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b-\u0010\u0010\u001a\u0004\b.\u0010\u0012R\u0017\u0010/\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b/\u0010\u0010\u001a\u0004\b0\u0010\u0012R\u0017\u00101\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b1\u0010\u0010\u001a\u0004\b2\u0010\u0012R\u0017\u00103\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b3\u0010\u0010\u001a\u0004\b4\u0010\u0012R\u0017\u00105\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b5\u0010\u0010\u001a\u0004\b6\u0010\u0012R \u00107\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b7\u0010\u0004\u001a\u0004\b8\u0010\u0006R\u0017\u00109\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b9\u0010\u0010\u001a\u0004\b:\u0010\u0012R\u0017\u0010;\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b;\u0010\u000b\u001a\u0004\b<\u0010\rR \u0010=\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b=\u0010\u0004\u001a\u0004\b>\u0010\u0006R\u0017\u0010?\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b?\u0010\u0010\u001a\u0004\b@\u0010\u0012R \u0010A\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bA\u0010\u0004\u001a\u0004\bB\u0010\u0006R\u0017\u0010C\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bC\u0010\u0010\u001a\u0004\bD\u0010\u0012R\u0017\u0010E\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bE\u0010\u0010\u001a\u0004\bF\u0010\u0012R\u0017\u0010G\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bG\u0010\u0010\u001a\u0004\bH\u0010\u0012R\u0017\u0010I\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bI\u0010\u0010\u001a\u0004\bJ\u0010\u0012R\u0017\u0010K\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bK\u0010\u0010\u001a\u0004\bL\u0010\u0012R\u0017\u0010M\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bM\u0010\u0010\u001a\u0004\bN\u0010\u0012R\u0017\u0010O\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bO\u0010\u0010\u001a\u0004\bP\u0010\u0012R\u0017\u0010Q\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bQ\u0010\u0010\u001a\u0004\bR\u0010\u0012R\u0017\u0010S\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bS\u0010\u0010\u001a\u0004\bT\u0010\u0012R\u0017\u0010U\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bU\u0010\u0010\u001a\u0004\bV\u0010\u0012R\u0017\u0010W\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bW\u0010\u0010\u001a\u0004\bX\u0010\u0012R\u0017\u0010Y\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bY\u0010\u0010\u001a\u0004\bZ\u0010\u0012R\u0017\u0010[\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b[\u0010\u0010\u001a\u0004\b\\\u0010\u0012R\u0017\u0010]\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b]\u0010\u0010\u001a\u0004\b^\u0010\u0012R\u0017\u0010_\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b_\u0010\u0010\u001a\u0004\b`\u0010\u0012R\u0017\u0010a\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\ba\u0010\u0010\u001a\u0004\bb\u0010\u0012R \u0010c\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bc\u0010\u0004\u001a\u0004\bd\u0010\u0006R\u0017\u0010e\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\be\u0010\u0010\u001a\u0004\bf\u0010\u0012R\u0017\u0010g\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bg\u0010\u0010\u001a\u0004\bh\u0010\u0012R\u0017\u0010i\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bi\u0010\u0010\u001a\u0004\bj\u0010\u0012R\u0017\u0010k\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bk\u0010\u0010\u001a\u0004\bl\u0010\u0012R\u0017\u0010m\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bm\u0010\u0010\u001a\u0004\bn\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006q"}, d2 = {"Lt0/a0;", "", "Ls1/h;", "ContainerElevation", "F", ak.aF, "()F", "ContainerHeight", "d", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "e", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "DisabledLabelTextColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "f", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "DisabledSelectedContainerColor", RXScreenCaptureService.KEY_HEIGHT, "DisabledUnselectedOutlineColor", "j", "DraggedContainerElevation", "k", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LabelTextFont", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "l", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "SelectedContainerColor", "n", "SelectedDraggedLabelTextColor", "o", "SelectedFocusLabelTextColor", "r", "SelectedHoverLabelTextColor", ak.aG, "SelectedLabelTextColor", "x", "SelectedOutlineWidth", ak.aD, "SelectedPressedLabelTextColor", androidx.exifinterface.media.a.W4, "UnselectedDraggedLabelTextColor", "UnselectedFocusLabelTextColor", "I", "UnselectedFocusOutlineColor", "K", "UnselectedHoverLabelTextColor", "M", "UnselectedLabelTextColor", "P", "UnselectedOutlineColor", "R", "UnselectedOutlineWidth", androidx.exifinterface.media.a.R4, "UnselectedPressedLabelTextColor", androidx.exifinterface.media.a.f23244d5, "AvatarShape", ak.av, "AvatarSize", "b", "DisabledLeadingIconColor", "g", "LeadingIconSize", "m", "SelectedDraggedLeadingIconColor", "p", "SelectedFocusLeadingIconColor", ak.aB, "SelectedHoverLeadingIconColor", "v", "SelectedLeadingIconColor", "y", "SelectedPressedLeadingIconColor", "B", "UnselectedDraggedLeadingIconColor", "G", "UnselectedFocusLeadingIconColor", "J", "UnselectedHoverLeadingIconColor", "N", "UnselectedLeadingIconColor", "Q", "UnselectedPressedLeadingIconColor", "U", "DisabledTrailingIconColor", "i", "SelectedDraggedTrailingIconColor", "q", "SelectedFocusTrailingIconColor", "t", "SelectedHoverTrailingIconColor", RXScreenCaptureService.KEY_WIDTH, "SelectedPressedTrailingIconColor", "C", "SelectedTrailingIconColor", "D", "TrailingIconSize", androidx.exifinterface.media.a.S4, "UnselectedDraggedTrailingIconColor", "H", "UnselectedFocusTrailingIconColor", "L", "UnselectedHoverTrailingIconColor", "O", "UnselectedPressedTrailingIconColor", androidx.exifinterface.media.a.X4, "UnselectedTrailingIconColor", androidx.exifinterface.media.a.T4, "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class a0 {

    @dl.d
    private static final ColorSchemeKeyTokens A;

    @dl.d
    private static final ShapeKeyTokens B;
    private static final float C;
    public static final float D = 0.38f;

    @dl.d
    private static final ColorSchemeKeyTokens E;
    public static final float F = 0.38f;
    private static final float G;

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
    public static final float S = 0.38f;

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
    private static final float Y;

    @dl.d
    private static final ColorSchemeKeyTokens Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a0 f139431a = new a0();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139432a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f139433b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139434b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f139435c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139436c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final ShapeKeyTokens f139437d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139438d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f139440f = 0.38f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f139442h = 0.12f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139443i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f139444j = 0.12f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f139445k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final TypographyKeyTokens f139446l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139447m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139448n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139449o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139450p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139451q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final float f139452r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139453s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139454t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139455u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139456v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139457w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139458x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139459y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final float f139460z;

    static {
        l lVar = l.f139980a;
        f139433b = lVar.a();
        f139435c = s1.h.g((float) 32.0d);
        f139437d = ShapeKeyTokens.CornerSmall;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        f139439e = colorSchemeKeyTokens;
        f139441g = colorSchemeKeyTokens;
        f139443i = colorSchemeKeyTokens;
        f139445k = lVar.e();
        f139446l = TypographyKeyTokens.LabelLarge;
        f139447m = ColorSchemeKeyTokens.SecondaryContainer;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSecondaryContainer;
        f139448n = colorSchemeKeyTokens2;
        f139449o = colorSchemeKeyTokens2;
        f139450p = colorSchemeKeyTokens2;
        f139451q = colorSchemeKeyTokens2;
        f139452r = s1.h.g((float) 0.0d);
        f139453s = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurfaceVariant;
        f139454t = colorSchemeKeyTokens3;
        f139455u = colorSchemeKeyTokens3;
        f139456v = colorSchemeKeyTokens3;
        f139457w = colorSchemeKeyTokens3;
        f139458x = colorSchemeKeyTokens3;
        f139459y = ColorSchemeKeyTokens.Outline;
        f139460z = s1.h.g((float) 1.0d);
        A = colorSchemeKeyTokens3;
        B = ShapeKeyTokens.CornerFull;
        C = s1.h.g((float) 24.0d);
        E = colorSchemeKeyTokens;
        float f10 = (float) 18.0d;
        G = s1.h.g(f10);
        H = colorSchemeKeyTokens2;
        I = colorSchemeKeyTokens2;
        J = colorSchemeKeyTokens2;
        K = colorSchemeKeyTokens2;
        L = colorSchemeKeyTokens2;
        M = colorSchemeKeyTokens3;
        N = colorSchemeKeyTokens3;
        O = colorSchemeKeyTokens3;
        P = colorSchemeKeyTokens3;
        Q = colorSchemeKeyTokens3;
        R = colorSchemeKeyTokens;
        T = colorSchemeKeyTokens2;
        U = colorSchemeKeyTokens2;
        V = colorSchemeKeyTokens2;
        W = colorSchemeKeyTokens2;
        X = colorSchemeKeyTokens2;
        Y = s1.h.g(f10);
        Z = colorSchemeKeyTokens3;
        f139432a0 = colorSchemeKeyTokens3;
        f139434b0 = colorSchemeKeyTokens3;
        f139436c0 = colorSchemeKeyTokens3;
        f139438d0 = colorSchemeKeyTokens3;
    }

    private a0() {
    }

    @dl.d
    public final ColorSchemeKeyTokens A() {
        return f139453s;
    }

    @dl.d
    public final ColorSchemeKeyTokens B() {
        return L;
    }

    @dl.d
    public final ColorSchemeKeyTokens C() {
        return W;
    }

    @dl.d
    public final ColorSchemeKeyTokens D() {
        return X;
    }

    public final float E() {
        return Y;
    }

    @dl.d
    public final ColorSchemeKeyTokens F() {
        return f139454t;
    }

    @dl.d
    public final ColorSchemeKeyTokens G() {
        return M;
    }

    @dl.d
    public final ColorSchemeKeyTokens H() {
        return Z;
    }

    @dl.d
    public final ColorSchemeKeyTokens I() {
        return f139455u;
    }

    @dl.d
    public final ColorSchemeKeyTokens J() {
        return N;
    }

    @dl.d
    public final ColorSchemeKeyTokens K() {
        return f139456v;
    }

    @dl.d
    public final ColorSchemeKeyTokens L() {
        return f139432a0;
    }

    @dl.d
    public final ColorSchemeKeyTokens M() {
        return f139457w;
    }

    @dl.d
    public final ColorSchemeKeyTokens N() {
        return O;
    }

    @dl.d
    public final ColorSchemeKeyTokens O() {
        return f139434b0;
    }

    @dl.d
    public final ColorSchemeKeyTokens P() {
        return f139458x;
    }

    @dl.d
    public final ColorSchemeKeyTokens Q() {
        return P;
    }

    @dl.d
    public final ColorSchemeKeyTokens R() {
        return f139459y;
    }

    public final float S() {
        return f139460z;
    }

    @dl.d
    public final ColorSchemeKeyTokens T() {
        return A;
    }

    @dl.d
    public final ColorSchemeKeyTokens U() {
        return Q;
    }

    @dl.d
    public final ColorSchemeKeyTokens V() {
        return f139436c0;
    }

    @dl.d
    public final ColorSchemeKeyTokens W() {
        return f139438d0;
    }

    @dl.d
    public final ShapeKeyTokens a() {
        return B;
    }

    public final float b() {
        return C;
    }

    public final float c() {
        return f139433b;
    }

    public final float d() {
        return f139435c;
    }

    @dl.d
    public final ShapeKeyTokens e() {
        return f139437d;
    }

    @dl.d
    public final ColorSchemeKeyTokens f() {
        return f139439e;
    }

    @dl.d
    public final ColorSchemeKeyTokens g() {
        return E;
    }

    @dl.d
    public final ColorSchemeKeyTokens h() {
        return f139441g;
    }

    @dl.d
    public final ColorSchemeKeyTokens i() {
        return R;
    }

    @dl.d
    public final ColorSchemeKeyTokens j() {
        return f139443i;
    }

    public final float k() {
        return f139445k;
    }

    @dl.d
    public final TypographyKeyTokens l() {
        return f139446l;
    }

    public final float m() {
        return G;
    }

    @dl.d
    public final ColorSchemeKeyTokens n() {
        return f139447m;
    }

    @dl.d
    public final ColorSchemeKeyTokens o() {
        return f139448n;
    }

    @dl.d
    public final ColorSchemeKeyTokens p() {
        return H;
    }

    @dl.d
    public final ColorSchemeKeyTokens q() {
        return T;
    }

    @dl.d
    public final ColorSchemeKeyTokens r() {
        return f139449o;
    }

    @dl.d
    public final ColorSchemeKeyTokens s() {
        return I;
    }

    @dl.d
    public final ColorSchemeKeyTokens t() {
        return U;
    }

    @dl.d
    public final ColorSchemeKeyTokens u() {
        return f139450p;
    }

    @dl.d
    public final ColorSchemeKeyTokens v() {
        return J;
    }

    @dl.d
    public final ColorSchemeKeyTokens w() {
        return V;
    }

    @dl.d
    public final ColorSchemeKeyTokens x() {
        return f139451q;
    }

    @dl.d
    public final ColorSchemeKeyTokens y() {
        return K;
    }

    public final float z() {
        return f139452r;
    }
}
