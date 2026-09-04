package t0;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: NavigationDrawerTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\"\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bO\u0010PR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R \u0010\u0012\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R\u0017\u0010#\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u001aR\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006R\u0017\u0010'\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b(\u0010\u001aR\u0017\u0010)\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R \u0010+\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b+\u0010\u0013\u001a\u0004\b,\u0010\u0015R\u0017\u0010-\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u0004\u001a\u0004\b.\u0010\u0006R\u0017\u00100\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u00104\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b4\u0010\u0013\u001a\u0004\b5\u0010\u0015R\u0017\u00106\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\u0004\u001a\u0004\b7\u0010\u0006R\u0017\u00108\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\u0004\u001a\u0004\b9\u0010\u0006R\u0017\u0010:\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010\u0004\u001a\u0004\b;\u0010\u0006R\u0017\u0010<\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010\u0004\u001a\u0004\b=\u0010\u0006R\u0017\u0010>\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010\u0004\u001a\u0004\b?\u0010\u0006R\u0017\u0010@\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u0010\u0004\u001a\u0004\bA\u0010\u0006R\u0017\u0010B\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010\u0004\u001a\u0004\bC\u0010\u0006R\u0017\u0010D\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u0010\u0004\u001a\u0004\bE\u0010\u0006R\u0017\u0010F\u001a\u00020/8\u0006¢\u0006\f\n\u0004\bF\u00101\u001a\u0004\bG\u00103R\u0017\u0010H\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u0010\u0004\u001a\u0004\bI\u0010\u0006R\u0017\u0010J\u001a\u00020/8\u0006¢\u0006\f\n\u0004\bJ\u00101\u001a\u0004\bK\u00103R \u0010L\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bL\u0010\u0013\u001a\u0004\b\u0013\u0010\u0015R \u0010M\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bM\u0010\u0013\u001a\u0004\bN\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Q"}, d2 = {"Lt0/g0;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveFocusIconColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", ak.av, "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveFocusLabelTextColor", "b", "ActiveHoverIconColor", ak.aF, "ActiveHoverLabelTextColor", "d", "ActiveIconColor", "e", "ActiveIndicatorColor", "f", "Ls1/h;", "ActiveIndicatorHeight", "F", "g", "()F", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ActiveIndicatorShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ActiveIndicatorWidth", "i", "ActiveLabelTextColor", "j", "ActivePressedIconColor", "k", "ActivePressedLabelTextColor", "l", "BottomContainerShape", "m", "ContainerColor", "n", "ContainerShape", "o", "ContainerSurfaceTintLayerColor", "p", "ContainerWidth", "q", "HeadlineColor", "r", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "HeadlineFont", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", ak.aB, "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "IconSize", "t", "InactiveFocusIconColor", ak.aG, "InactiveFocusLabelTextColor", "v", "InactiveHoverIconColor", RXScreenCaptureService.KEY_WIDTH, "InactiveHoverLabelTextColor", "x", "InactiveIconColor", "y", "InactiveLabelTextColor", ak.aD, "InactivePressedIconColor", androidx.exifinterface.media.a.W4, "InactivePressedLabelTextColor", "B", "LabelTextFont", "C", "LargeBadgeLabelColor", "D", "LargeBadgeLabelFont", androidx.exifinterface.media.a.S4, "ModalContainerElevation", "StandardContainerElevation", "G", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class g0 {

    @dl.d
    private static final ColorSchemeKeyTokens A;

    @dl.d
    private static final ColorSchemeKeyTokens B;

    @dl.d
    private static final ColorSchemeKeyTokens C;

    @dl.d
    private static final ColorSchemeKeyTokens D;

    @dl.d
    private static final TypographyKeyTokens E;

    @dl.d
    private static final ColorSchemeKeyTokens F;

    @dl.d
    private static final TypographyKeyTokens G;
    private static final float H;
    private static final float I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final g0 f139778a = new g0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139783f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139784g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f139785h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final ShapeKeyTokens f139786i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f139787j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139788k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139789l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139790m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final ShapeKeyTokens f139791n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139792o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final float f139793p = 100.0f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private static final ShapeKeyTokens f139794q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139795r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final float f139796s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139797t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private static final TypographyKeyTokens f139798u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final float f139799v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139800w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139801x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139802y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139803z;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSecondaryContainer;
        f139779b = colorSchemeKeyTokens;
        f139780c = colorSchemeKeyTokens;
        f139781d = colorSchemeKeyTokens;
        f139782e = colorSchemeKeyTokens;
        f139783f = colorSchemeKeyTokens;
        f139784g = ColorSchemeKeyTokens.SecondaryContainer;
        f139785h = s1.h.g((float) 56.0d);
        f139786i = ShapeKeyTokens.CornerFull;
        f139787j = s1.h.g((float) 336.0d);
        f139788k = colorSchemeKeyTokens;
        f139789l = colorSchemeKeyTokens;
        f139790m = colorSchemeKeyTokens;
        f139791n = ShapeKeyTokens.CornerLargeTop;
        f139792o = ColorSchemeKeyTokens.Surface;
        f139794q = ShapeKeyTokens.CornerLargeEnd;
        f139795r = ColorSchemeKeyTokens.SurfaceTint;
        f139796s = s1.h.g((float) 360.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurfaceVariant;
        f139797t = colorSchemeKeyTokens2;
        f139798u = TypographyKeyTokens.TitleSmall;
        f139799v = s1.h.g((float) 24.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurface;
        f139800w = colorSchemeKeyTokens3;
        f139801x = colorSchemeKeyTokens3;
        f139802y = colorSchemeKeyTokens3;
        f139803z = colorSchemeKeyTokens3;
        A = colorSchemeKeyTokens2;
        B = colorSchemeKeyTokens2;
        C = colorSchemeKeyTokens3;
        D = colorSchemeKeyTokens3;
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.LabelLarge;
        E = typographyKeyTokens;
        F = colorSchemeKeyTokens2;
        G = typographyKeyTokens;
        l lVar = l.f139980a;
        H = lVar.b();
        I = lVar.a();
    }

    private g0() {
    }

    @dl.d
    public final ColorSchemeKeyTokens A() {
        return C;
    }

    @dl.d
    public final ColorSchemeKeyTokens B() {
        return D;
    }

    @dl.d
    public final TypographyKeyTokens C() {
        return E;
    }

    @dl.d
    public final ColorSchemeKeyTokens D() {
        return F;
    }

    @dl.d
    public final TypographyKeyTokens E() {
        return G;
    }

    public final float F() {
        return H;
    }

    public final float G() {
        return I;
    }

    @dl.d
    public final ColorSchemeKeyTokens a() {
        return f139779b;
    }

    @dl.d
    public final ColorSchemeKeyTokens b() {
        return f139780c;
    }

    @dl.d
    public final ColorSchemeKeyTokens c() {
        return f139781d;
    }

    @dl.d
    public final ColorSchemeKeyTokens d() {
        return f139782e;
    }

    @dl.d
    public final ColorSchemeKeyTokens e() {
        return f139783f;
    }

    @dl.d
    public final ColorSchemeKeyTokens f() {
        return f139784g;
    }

    public final float g() {
        return f139785h;
    }

    @dl.d
    public final ShapeKeyTokens h() {
        return f139786i;
    }

    public final float i() {
        return f139787j;
    }

    @dl.d
    public final ColorSchemeKeyTokens j() {
        return f139788k;
    }

    @dl.d
    public final ColorSchemeKeyTokens k() {
        return f139789l;
    }

    @dl.d
    public final ColorSchemeKeyTokens l() {
        return f139790m;
    }

    @dl.d
    public final ShapeKeyTokens m() {
        return f139791n;
    }

    @dl.d
    public final ColorSchemeKeyTokens n() {
        return f139792o;
    }

    @dl.d
    public final ShapeKeyTokens o() {
        return f139794q;
    }

    @dl.d
    public final ColorSchemeKeyTokens p() {
        return f139795r;
    }

    public final float q() {
        return f139796s;
    }

    @dl.d
    public final ColorSchemeKeyTokens r() {
        return f139797t;
    }

    @dl.d
    public final TypographyKeyTokens s() {
        return f139798u;
    }

    public final float t() {
        return f139799v;
    }

    @dl.d
    public final ColorSchemeKeyTokens u() {
        return f139800w;
    }

    @dl.d
    public final ColorSchemeKeyTokens v() {
        return f139801x;
    }

    @dl.d
    public final ColorSchemeKeyTokens w() {
        return f139802y;
    }

    @dl.d
    public final ColorSchemeKeyTokens x() {
        return f139803z;
    }

    @dl.d
    public final ColorSchemeKeyTokens y() {
        return A;
    }

    @dl.d
    public final ColorSchemeKeyTokens z() {
        return B;
    }
}
