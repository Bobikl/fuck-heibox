package t0;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: ListTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b<\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bi\u0010jR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R \u0010\u0019\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006R\u0017\u0010'\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u0004\u001a\u0004\b(\u0010\u0006R\u0017\u0010)\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R\u0017\u0010+\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u0004\u001a\u0004\b,\u0010\u0006R\u0017\u0010-\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u0004\u001a\u0004\b.\u0010\u0006R\u0017\u00100\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u00104\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b4\u0010\t\u001a\u0004\b5\u0010\u000bR\u0017\u00106\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\u0004\u001a\u0004\b7\u0010\u0006R\u0017\u00108\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\u0004\u001a\u0004\b9\u0010\u0006R\u0017\u0010:\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b:\u00101\u001a\u0004\b;\u00103R\u0017\u0010<\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b<\u0010\u0010\u001a\u0004\b=\u0010\u0012R \u0010>\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b>\u0010\t\u001a\u0004\b?\u0010\u000bR\u0017\u0010@\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u0010\u0004\u001a\u0004\bA\u0010\u0006R \u0010B\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bB\u0010\t\u001a\u0004\bC\u0010\u000bR \u0010D\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bD\u0010\t\u001a\u0004\bE\u0010\u000bR\u0017\u0010F\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bF\u0010\u0010\u001a\u0004\bG\u0010\u0012R \u0010H\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bH\u0010\t\u001a\u0004\bI\u0010\u000bR\u0017\u0010J\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bJ\u0010\u0010\u001a\u0004\bK\u0010\u0012R \u0010L\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bL\u0010\t\u001a\u0004\b\t\u0010\u000bR\u0017\u0010M\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bM\u0010\u0004\u001a\u0004\bN\u0010\u0006R\u0017\u0010O\u001a\u00020/8\u0006¢\u0006\f\n\u0004\bO\u00101\u001a\u0004\bP\u00103R\u0017\u0010Q\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010\u0004\u001a\u0004\bR\u0010\u0006R\u0017\u0010S\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bS\u0010\u0004\u001a\u0004\bT\u0010\u0006R\u0017\u0010U\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bU\u0010\u0004\u001a\u0004\bV\u0010\u0006R\u0017\u0010W\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bW\u0010\u0004\u001a\u0004\bX\u0010\u0006R \u0010Y\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bY\u0010\t\u001a\u0004\bZ\u0010\u000bR\u0017\u0010[\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b[\u0010\u0004\u001a\u0004\b\\\u0010\u0006R\u0017\u0010]\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b]\u00101\u001a\u0004\b^\u00103R\u0017\u0010_\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b_\u0010\u0004\u001a\u0004\b`\u0010\u0006R \u0010a\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\ba\u0010\t\u001a\u0004\bb\u0010\u000bR\u0017\u0010c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bc\u0010\u0004\u001a\u0004\bd\u0010\u0006R\u0017\u0010e\u001a\u00020/8\u0006¢\u0006\f\n\u0004\be\u00101\u001a\u0004\bf\u00103R\u0017\u0010g\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bg\u0010\u0004\u001a\u0004\bh\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006k"}, d2 = {"Lt0/c0;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ListItemContainerColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", ak.av, "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "Ls1/h;", "ListItemContainerElevation", "F", "b", "()F", "ListItemContainerHeight", ak.aF, "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ListItemContainerShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "d", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ListItemDisabledLabelTextColor", "e", "ListItemDisabledLeadingIconColor", "f", "ListItemDisabledTrailingIconColor", "g", "ListItemDraggedContainerElevation", RXScreenCaptureService.KEY_HEIGHT, "ListItemDraggedLabelTextColor", "i", "ListItemDraggedLeadingIconColor", "j", "ListItemDraggedTrailingIconColor", "k", "ListItemFocusLabelTextColor", "l", "ListItemFocusLeadingIconColor", "m", "ListItemFocusTrailingIconColor", "n", "ListItemHoverLabelTextColor", "o", "ListItemHoverLeadingIconColor", "p", "ListItemHoverTrailingIconColor", "q", "ListItemLabelTextColor", "r", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "ListItemLabelTextFont", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", ak.aB, "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "ListItemLargeLeadingVideoHeight", "t", "ListItemLeadingAvatarColor", ak.aG, "ListItemLeadingAvatarLabelColor", "v", "ListItemLeadingAvatarLabelFont", RXScreenCaptureService.KEY_WIDTH, "ListItemLeadingAvatarShape", "x", "ListItemLeadingAvatarSize", "y", "ListItemLeadingIconColor", ak.aD, "ListItemLeadingIconSize", androidx.exifinterface.media.a.W4, "ListItemLeadingImageHeight", "B", "ListItemLeadingImageShape", "C", "ListItemLeadingImageWidth", "D", "ListItemLeadingVideoShape", androidx.exifinterface.media.a.S4, "ListItemLeadingVideoWidth", "ListItemOverlineColor", "G", "ListItemOverlineFont", "H", "ListItemPressedLabelTextColor", "I", "ListItemPressedLeadingIconColor", "J", "ListItemPressedTrailingIconColor", "K", "ListItemSelectedTrailingIconColor", "L", "ListItemSmallLeadingVideoHeight", "M", "ListItemSupportingTextColor", "N", "ListItemSupportingTextFont", "O", "ListItemTrailingIconColor", "P", "ListItemTrailingIconSize", "Q", "ListItemTrailingSupportingTextColor", "R", "ListItemTrailingSupportingTextFont", androidx.exifinterface.media.a.R4, "ListItemUnselectedTrailingIconColor", androidx.exifinterface.media.a.f23244d5, "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class c0 {

    @dl.d
    private static final TypographyKeyTokens A;

    @dl.d
    private static final ShapeKeyTokens B;
    private static final float C;

    @dl.d
    private static final ColorSchemeKeyTokens D;
    private static final float E;
    private static final float F;

    @dl.d
    private static final ShapeKeyTokens G;
    private static final float H;

    @dl.d
    private static final ShapeKeyTokens I;
    private static final float J;

    @dl.d
    private static final ColorSchemeKeyTokens K;

    @dl.d
    private static final TypographyKeyTokens L;

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
    private static final TypographyKeyTokens S;

    @dl.d
    private static final ColorSchemeKeyTokens T;
    private static final float U;

    @dl.d
    private static final ColorSchemeKeyTokens V;

    @dl.d
    private static final TypographyKeyTokens W;

    @dl.d
    private static final ColorSchemeKeyTokens X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final c0 f139515a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139516b = ColorSchemeKeyTokens.Surface;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f139517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f139518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final ShapeKeyTokens f139519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139520f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f139521g = 0.3f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139522h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f139523i = 0.38f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139524j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f139525k = 0.38f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float f139526l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139527m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139528n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139529o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139530p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139531q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139532r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139533s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139534t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139535u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139536v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private static final TypographyKeyTokens f139537w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final float f139538x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139539y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139540z;

    static {
        l lVar = l.f139980a;
        f139517c = lVar.a();
        float f10 = (float) 56.0d;
        f139518d = s1.h.g(f10);
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerNone;
        f139519e = shapeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        f139520f = colorSchemeKeyTokens;
        f139522h = colorSchemeKeyTokens;
        f139524j = colorSchemeKeyTokens;
        f139526l = lVar.e();
        f139527m = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurfaceVariant;
        f139528n = colorSchemeKeyTokens2;
        f139529o = colorSchemeKeyTokens2;
        f139530p = colorSchemeKeyTokens;
        f139531q = colorSchemeKeyTokens2;
        f139532r = colorSchemeKeyTokens2;
        f139533s = colorSchemeKeyTokens;
        f139534t = colorSchemeKeyTokens2;
        f139535u = colorSchemeKeyTokens2;
        f139536v = colorSchemeKeyTokens;
        f139537w = TypographyKeyTokens.BodyLarge;
        f139538x = s1.h.g((float) 69.0d);
        f139539y = ColorSchemeKeyTokens.PrimaryContainer;
        f139540z = ColorSchemeKeyTokens.OnPrimaryContainer;
        A = TypographyKeyTokens.TitleMedium;
        B = ShapeKeyTokens.CornerFull;
        C = s1.h.g((float) 40.0d);
        D = colorSchemeKeyTokens2;
        E = s1.h.g((float) 18.0d);
        F = s1.h.g(f10);
        G = shapeKeyTokens;
        H = s1.h.g(f10);
        I = shapeKeyTokens;
        J = s1.h.g((float) 100.0d);
        K = colorSchemeKeyTokens2;
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.LabelSmall;
        L = typographyKeyTokens;
        M = colorSchemeKeyTokens;
        N = colorSchemeKeyTokens2;
        O = colorSchemeKeyTokens2;
        P = ColorSchemeKeyTokens.Primary;
        Q = s1.h.g(f10);
        R = colorSchemeKeyTokens2;
        S = TypographyKeyTokens.BodyMedium;
        T = colorSchemeKeyTokens2;
        U = s1.h.g((float) 24.0d);
        V = colorSchemeKeyTokens2;
        W = typographyKeyTokens;
        X = colorSchemeKeyTokens;
    }

    private c0() {
    }

    public final float A() {
        return E;
    }

    public final float B() {
        return F;
    }

    @dl.d
    public final ShapeKeyTokens C() {
        return G;
    }

    public final float D() {
        return H;
    }

    @dl.d
    public final ShapeKeyTokens E() {
        return I;
    }

    public final float F() {
        return J;
    }

    @dl.d
    public final ColorSchemeKeyTokens G() {
        return K;
    }

    @dl.d
    public final TypographyKeyTokens H() {
        return L;
    }

    @dl.d
    public final ColorSchemeKeyTokens I() {
        return M;
    }

    @dl.d
    public final ColorSchemeKeyTokens J() {
        return N;
    }

    @dl.d
    public final ColorSchemeKeyTokens K() {
        return O;
    }

    @dl.d
    public final ColorSchemeKeyTokens L() {
        return P;
    }

    public final float M() {
        return Q;
    }

    @dl.d
    public final ColorSchemeKeyTokens N() {
        return R;
    }

    @dl.d
    public final TypographyKeyTokens O() {
        return S;
    }

    @dl.d
    public final ColorSchemeKeyTokens P() {
        return T;
    }

    public final float Q() {
        return U;
    }

    @dl.d
    public final ColorSchemeKeyTokens R() {
        return V;
    }

    @dl.d
    public final TypographyKeyTokens S() {
        return W;
    }

    @dl.d
    public final ColorSchemeKeyTokens T() {
        return X;
    }

    @dl.d
    public final ColorSchemeKeyTokens a() {
        return f139516b;
    }

    public final float b() {
        return f139517c;
    }

    public final float c() {
        return f139518d;
    }

    @dl.d
    public final ShapeKeyTokens d() {
        return f139519e;
    }

    @dl.d
    public final ColorSchemeKeyTokens e() {
        return f139520f;
    }

    @dl.d
    public final ColorSchemeKeyTokens f() {
        return f139522h;
    }

    @dl.d
    public final ColorSchemeKeyTokens g() {
        return f139524j;
    }

    public final float h() {
        return f139526l;
    }

    @dl.d
    public final ColorSchemeKeyTokens i() {
        return f139527m;
    }

    @dl.d
    public final ColorSchemeKeyTokens j() {
        return f139528n;
    }

    @dl.d
    public final ColorSchemeKeyTokens k() {
        return f139529o;
    }

    @dl.d
    public final ColorSchemeKeyTokens l() {
        return f139530p;
    }

    @dl.d
    public final ColorSchemeKeyTokens m() {
        return f139531q;
    }

    @dl.d
    public final ColorSchemeKeyTokens n() {
        return f139532r;
    }

    @dl.d
    public final ColorSchemeKeyTokens o() {
        return f139533s;
    }

    @dl.d
    public final ColorSchemeKeyTokens p() {
        return f139534t;
    }

    @dl.d
    public final ColorSchemeKeyTokens q() {
        return f139535u;
    }

    @dl.d
    public final ColorSchemeKeyTokens r() {
        return f139536v;
    }

    @dl.d
    public final TypographyKeyTokens s() {
        return f139537w;
    }

    public final float t() {
        return f139538x;
    }

    @dl.d
    public final ColorSchemeKeyTokens u() {
        return f139539y;
    }

    @dl.d
    public final ColorSchemeKeyTokens v() {
        return f139540z;
    }

    @dl.d
    public final TypographyKeyTokens w() {
        return A;
    }

    @dl.d
    public final ShapeKeyTokens x() {
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
