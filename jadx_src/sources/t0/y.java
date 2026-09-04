package t0;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: FilterChipTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b2\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bq\u0010rR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R \u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R \u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R\u0017\u0010\u0017\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010R \u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R \u0010\u001b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006R \u0010\u001d\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R \u0010\u001f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006R\u0017\u0010!\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b!\u0010\u000e\u001a\u0004\b\"\u0010\u0010R\u0017\u0010#\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b#\u0010\u000e\u001a\u0004\b$\u0010\u0010R \u0010%\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006R\u0017\u0010'\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010\u000e\u001a\u0004\b(\u0010\u0010R\u0017\u0010)\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b)\u0010\u000e\u001a\u0004\b*\u0010\u0010R\u0017\u0010+\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010\u000e\u001a\u0004\b,\u0010\u0010R \u0010-\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b-\u0010\u0004\u001a\u0004\b.\u0010\u0006R \u0010/\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R \u00101\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b1\u0010\u0004\u001a\u0004\b2\u0010\u0006R \u00103\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b3\u0010\u0004\u001a\u0004\b4\u0010\u0006R \u00105\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006R\u0017\u00107\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b7\u0010\u000e\u001a\u0004\b8\u0010\u0010R \u00109\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b9\u0010\u0004\u001a\u0004\b:\u0010\u0006R\u0017\u0010;\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b;\u0010\u000e\u001a\u0004\b<\u0010\u0010R \u0010=\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b=\u0010\u0004\u001a\u0004\b>\u0010\u0006R \u0010?\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b?\u0010\u0004\u001a\u0004\b@\u0010\u0006R\u0017\u0010B\u001a\u00020A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010F\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bF\u0010\u000e\u001a\u0004\b\u0004\u0010\u0010R\u0017\u0010G\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bG\u0010\u000e\u001a\u0004\bH\u0010\u0010R\u0017\u0010I\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bI\u0010\u000e\u001a\u0004\bJ\u0010\u0010R\u0017\u0010K\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bK\u0010\u000e\u001a\u0004\bL\u0010\u0010R\u0017\u0010M\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bM\u0010\u000e\u001a\u0004\bN\u0010\u0010R\u0017\u0010O\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bO\u0010\u000e\u001a\u0004\bP\u0010\u0010R\u0017\u0010Q\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bQ\u0010\u000e\u001a\u0004\bR\u0010\u0010R\u0017\u0010S\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bS\u0010\u000e\u001a\u0004\bT\u0010\u0010R\u0017\u0010U\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bU\u0010\u000e\u001a\u0004\bV\u0010\u0010R\u0017\u0010W\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bW\u0010\u000e\u001a\u0004\bX\u0010\u0010R\u0017\u0010Y\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bY\u0010\u000e\u001a\u0004\bZ\u0010\u0010R \u0010[\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b[\u0010\u0004\u001a\u0004\b\\\u0010\u0006R\u0017\u0010]\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b]\u0010\u000e\u001a\u0004\b^\u0010\u0010R\u0017\u0010_\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b_\u0010\u000e\u001a\u0004\b`\u0010\u0010R\u0017\u0010a\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\ba\u0010\u000e\u001a\u0004\bb\u0010\u0010R\u0017\u0010c\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bc\u0010\u000e\u001a\u0004\bd\u0010\u0010R\u0017\u0010e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\be\u0010\u000e\u001a\u0004\bf\u0010\u0010R\u0017\u0010g\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bg\u0010\u000e\u001a\u0004\bh\u0010\u0010R\u0017\u0010i\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bi\u0010\u000e\u001a\u0004\bj\u0010\u0010R\u0017\u0010k\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bk\u0010\u000e\u001a\u0004\bl\u0010\u0010R\u0017\u0010m\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bm\u0010\u000e\u001a\u0004\bn\u0010\u0010R\u0017\u0010o\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bo\u0010\u000e\u001a\u0004\bp\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006s"}, d2 = {"Lt0/y;", "", "Ls1/h;", "ContainerHeight", "F", ak.av, "()F", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "b", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerSurfaceTintLayerColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", ak.aF, "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "DisabledLabelTextColor", "e", "DraggedContainerElevation", "f", "ElevatedContainerElevation", "g", "ElevatedDisabledContainerColor", RXScreenCaptureService.KEY_HEIGHT, "ElevatedDisabledContainerElevation", "i", "ElevatedFocusContainerElevation", "j", "ElevatedHoverContainerElevation", "k", "ElevatedPressedContainerElevation", "l", "ElevatedSelectedContainerColor", "m", "ElevatedUnselectedContainerColor", "n", "FlatContainerElevation", "o", "FlatDisabledSelectedContainerColor", "p", "FlatDisabledUnselectedOutlineColor", "q", "FlatSelectedContainerColor", "r", "FlatSelectedFocusContainerElevation", ak.aB, "FlatSelectedHoverContainerElevation", "t", "FlatSelectedOutlineWidth", ak.aG, "FlatSelectedPressedContainerElevation", "v", "FlatUnselectedFocusContainerElevation", RXScreenCaptureService.KEY_WIDTH, "FlatUnselectedFocusOutlineColor", "x", "FlatUnselectedHoverContainerElevation", "y", "FlatUnselectedOutlineColor", ak.aD, "FlatUnselectedOutlineWidth", androidx.exifinterface.media.a.W4, "FlatUnselectedPressedContainerElevation", "B", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LabelTextFont", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "D", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "SelectedDraggedLabelTextColor", "SelectedFocusLabelTextColor", "H", "SelectedHoverLabelTextColor", "J", "SelectedLabelTextColor", "L", "SelectedPressedLabelTextColor", "N", "UnselectedDraggedLabelTextColor", "P", "UnselectedFocusLabelTextColor", "R", "UnselectedHoverLabelTextColor", androidx.exifinterface.media.a.f23244d5, "UnselectedLabelTextColor", androidx.exifinterface.media.a.X4, "UnselectedPressedLabelTextColor", "X", "DisabledIconColor", "d", "IconSize", "C", "SelectedDraggedIconColor", androidx.exifinterface.media.a.S4, "SelectedFocusIconColor", "G", "SelectedHoverIconColor", "I", "SelectedIconColor", "K", "SelectedPressedIconColor", "M", "UnselectedDraggedIconColor", "O", "UnselectedFocusIconColor", "Q", "UnselectedHoverIconColor", androidx.exifinterface.media.a.R4, "UnselectedIconColor", "U", "UnselectedPressedIconColor", androidx.exifinterface.media.a.T4, "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class y {
    private static final float A;

    @dl.d
    private static final ColorSchemeKeyTokens B;
    private static final float C;

    @dl.d
    private static final ColorSchemeKeyTokens D;
    private static final float E;
    private static final float F;

    @dl.d
    private static final TypographyKeyTokens G;

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
    private static final float T;

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
    @dl.d
    private static final ColorSchemeKeyTokens f140574a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140576b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140578c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140580d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f140582f = 0.38f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f140583g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f140584h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140585i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f140586j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f140587k = 0.12f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float f140588l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float f140589m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f140590n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140591o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140592p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final float f140593q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140594r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final float f140595s = 0.12f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140596t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final float f140597u = 0.12f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140598v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final float f140599w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final float f140600x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final float f140601y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final float f140602z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final y f140573a = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f140575b = s1.h.g((float) 32.0d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final ShapeKeyTokens f140577c = ShapeKeyTokens.CornerSmall;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140579d = ColorSchemeKeyTokens.SurfaceTint;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        f140581e = colorSchemeKeyTokens;
        l lVar = l.f139980a;
        f140583g = lVar.e();
        f140584h = lVar.b();
        f140585i = colorSchemeKeyTokens;
        f140586j = lVar.a();
        f140588l = lVar.b();
        f140589m = lVar.c();
        f140590n = lVar.b();
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.SecondaryContainer;
        f140591o = colorSchemeKeyTokens2;
        f140592p = ColorSchemeKeyTokens.Surface;
        f140593q = lVar.a();
        f140594r = colorSchemeKeyTokens;
        f140596t = colorSchemeKeyTokens;
        f140598v = colorSchemeKeyTokens2;
        f140599w = lVar.a();
        f140600x = lVar.b();
        f140601y = s1.h.g((float) 0.0d);
        f140602z = lVar.a();
        A = lVar.a();
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurfaceVariant;
        B = colorSchemeKeyTokens3;
        C = lVar.a();
        D = ColorSchemeKeyTokens.Outline;
        E = s1.h.g((float) 1.0d);
        F = lVar.a();
        G = TypographyKeyTokens.LabelLarge;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.OnSecondaryContainer;
        H = colorSchemeKeyTokens4;
        I = colorSchemeKeyTokens4;
        J = colorSchemeKeyTokens4;
        K = colorSchemeKeyTokens4;
        L = colorSchemeKeyTokens4;
        M = colorSchemeKeyTokens3;
        N = colorSchemeKeyTokens3;
        O = colorSchemeKeyTokens3;
        P = colorSchemeKeyTokens3;
        Q = colorSchemeKeyTokens3;
        R = colorSchemeKeyTokens;
        T = s1.h.g((float) 18.0d);
        U = colorSchemeKeyTokens4;
        V = colorSchemeKeyTokens4;
        W = colorSchemeKeyTokens4;
        X = colorSchemeKeyTokens4;
        Y = colorSchemeKeyTokens4;
        Z = colorSchemeKeyTokens3;
        f140574a0 = colorSchemeKeyTokens3;
        f140576b0 = colorSchemeKeyTokens3;
        f140578c0 = colorSchemeKeyTokens3;
        f140580d0 = colorSchemeKeyTokens3;
    }

    private y() {
    }

    public final float A() {
        return E;
    }

    public final float B() {
        return F;
    }

    public final float C() {
        return T;
    }

    @dl.d
    public final TypographyKeyTokens D() {
        return G;
    }

    @dl.d
    public final ColorSchemeKeyTokens E() {
        return U;
    }

    @dl.d
    public final ColorSchemeKeyTokens F() {
        return H;
    }

    @dl.d
    public final ColorSchemeKeyTokens G() {
        return V;
    }

    @dl.d
    public final ColorSchemeKeyTokens H() {
        return I;
    }

    @dl.d
    public final ColorSchemeKeyTokens I() {
        return W;
    }

    @dl.d
    public final ColorSchemeKeyTokens J() {
        return J;
    }

    @dl.d
    public final ColorSchemeKeyTokens K() {
        return X;
    }

    @dl.d
    public final ColorSchemeKeyTokens L() {
        return K;
    }

    @dl.d
    public final ColorSchemeKeyTokens M() {
        return Y;
    }

    @dl.d
    public final ColorSchemeKeyTokens N() {
        return L;
    }

    @dl.d
    public final ColorSchemeKeyTokens O() {
        return Z;
    }

    @dl.d
    public final ColorSchemeKeyTokens P() {
        return M;
    }

    @dl.d
    public final ColorSchemeKeyTokens Q() {
        return f140574a0;
    }

    @dl.d
    public final ColorSchemeKeyTokens R() {
        return N;
    }

    @dl.d
    public final ColorSchemeKeyTokens S() {
        return f140576b0;
    }

    @dl.d
    public final ColorSchemeKeyTokens T() {
        return O;
    }

    @dl.d
    public final ColorSchemeKeyTokens U() {
        return f140578c0;
    }

    @dl.d
    public final ColorSchemeKeyTokens V() {
        return P;
    }

    @dl.d
    public final ColorSchemeKeyTokens W() {
        return f140580d0;
    }

    @dl.d
    public final ColorSchemeKeyTokens X() {
        return Q;
    }

    public final float a() {
        return f140575b;
    }

    @dl.d
    public final ShapeKeyTokens b() {
        return f140577c;
    }

    @dl.d
    public final ColorSchemeKeyTokens c() {
        return f140579d;
    }

    @dl.d
    public final ColorSchemeKeyTokens d() {
        return R;
    }

    @dl.d
    public final ColorSchemeKeyTokens e() {
        return f140581e;
    }

    public final float f() {
        return f140583g;
    }

    public final float g() {
        return f140584h;
    }

    @dl.d
    public final ColorSchemeKeyTokens h() {
        return f140585i;
    }

    public final float i() {
        return f140586j;
    }

    public final float j() {
        return f140588l;
    }

    public final float k() {
        return f140589m;
    }

    public final float l() {
        return f140590n;
    }

    @dl.d
    public final ColorSchemeKeyTokens m() {
        return f140591o;
    }

    @dl.d
    public final ColorSchemeKeyTokens n() {
        return f140592p;
    }

    public final float o() {
        return f140593q;
    }

    @dl.d
    public final ColorSchemeKeyTokens p() {
        return f140594r;
    }

    @dl.d
    public final ColorSchemeKeyTokens q() {
        return f140596t;
    }

    @dl.d
    public final ColorSchemeKeyTokens r() {
        return f140598v;
    }

    public final float s() {
        return f140599w;
    }

    public final float t() {
        return f140600x;
    }

    public final float u() {
        return f140601y;
    }

    public final float v() {
        return f140602z;
    }

    public final float w() {
        return A;
    }

    @dl.d
    public final ColorSchemeKeyTokens x() {
        return B;
    }

    public final float y() {
        return C;
    }

    @dl.d
    public final ColorSchemeKeyTokens z() {
        return D;
    }
}
