package t0;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: NavigationRailTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0014\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bO\u0010PR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R \u0010\u0012\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R \u0010%\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\u0013\u001a\u0004\b&\u0010\u0015R\u0017\u0010'\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b(\u0010\u001aR \u0010)\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b)\u0010\u0013\u001a\u0004\b*\u0010\u0015R \u0010+\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b+\u0010\u0013\u001a\u0004\b,\u0010\u0015R\u0017\u0010-\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u0004\u001a\u0004\b.\u0010\u0006R\u0017\u0010/\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R\u0017\u00101\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\u0004\u001a\u0004\b2\u0010\u0006R\u0017\u00103\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\u0004\u001a\u0004\b4\u0010\u0006R\u0017\u00105\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006R\u0017\u00107\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010\u0004\u001a\u0004\b8\u0010\u0006R\u0017\u00109\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010\u0004\u001a\u0004\b:\u0010\u0006R\u0017\u0010;\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006R\u0017\u0010>\u001a\u00020=8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010B\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010\u0004\u001a\u0004\bC\u0010\u0006R\u0017\u0010D\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u0010\u0004\u001a\u0004\bE\u0010\u0006R\u0017\u0010F\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010\u0004\u001a\u0004\bG\u0010\u0006R \u0010H\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bH\u0010\u0013\u001a\u0004\bI\u0010\u0015R\u0017\u0010J\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010\u0004\u001a\u0004\bK\u0010\u0006R \u0010L\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bL\u0010\u0013\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010M\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bM\u0010\u0018\u001a\u0004\bN\u0010\u001a\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Q"}, d2 = {"Lt0/h0;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveFocusIconColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", ak.av, "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveFocusLabelTextColor", "b", "ActiveHoverIconColor", ak.aF, "ActiveHoverLabelTextColor", "d", "ActiveIconColor", "e", "ActiveIndicatorColor", "f", "Ls1/h;", "ActiveIndicatorHeight", "F", "g", "()F", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ActiveIndicatorShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ActiveIndicatorWidth", "i", "ActiveLabelTextColor", "j", "ActivePressedIconColor", "k", "ActivePressedLabelTextColor", "l", "ContainerColor", "m", "ContainerElevation", "n", "ContainerShape", "o", "ContainerWidth", "p", "IconSize", "q", "InactiveFocusIconColor", "r", "InactiveFocusLabelTextColor", ak.aB, "InactiveHoverIconColor", "t", "InactiveHoverLabelTextColor", ak.aG, "InactiveIconColor", "v", "InactiveLabelTextColor", RXScreenCaptureService.KEY_WIDTH, "InactivePressedIconColor", "x", "InactivePressedLabelTextColor", "y", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LabelTextFont", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", ak.aD, "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "MenuFocusIconColor", androidx.exifinterface.media.a.W4, "MenuHoverIconColor", "B", "MenuIconColor", "C", "MenuIconSize", "D", "MenuPressedIconColor", androidx.exifinterface.media.a.S4, "NoLabelActiveIndicatorHeight", "NoLabelActiveIndicatorShape", "G", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class h0 {

    @dl.d
    private static final TypographyKeyTokens A;

    @dl.d
    private static final ColorSchemeKeyTokens B;

    @dl.d
    private static final ColorSchemeKeyTokens C;

    @dl.d
    private static final ColorSchemeKeyTokens D;
    private static final float E;

    @dl.d
    private static final ColorSchemeKeyTokens F;
    private static final float G;

    @dl.d
    private static final ShapeKeyTokens H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final h0 f139820a = new h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f139827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final ShapeKeyTokens f139828i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f139829j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139830k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139831l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139832m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139833n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float f139834o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final ShapeKeyTokens f139835p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final float f139836q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final float f139837r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139838s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139839t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139840u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139841v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139842w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139843x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139844y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139845z;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSecondaryContainer;
        f139821b = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        f139822c = colorSchemeKeyTokens2;
        f139823d = colorSchemeKeyTokens;
        f139824e = colorSchemeKeyTokens2;
        f139825f = colorSchemeKeyTokens;
        f139826g = ColorSchemeKeyTokens.SecondaryContainer;
        f139827h = s1.h.g((float) 32.0d);
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        f139828i = shapeKeyTokens;
        float f10 = (float) 56.0d;
        f139829j = s1.h.g(f10);
        f139830k = colorSchemeKeyTokens2;
        f139831l = colorSchemeKeyTokens;
        f139832m = colorSchemeKeyTokens2;
        f139833n = ColorSchemeKeyTokens.Surface;
        f139834o = l.f139980a.a();
        f139835p = ShapeKeyTokens.CornerNone;
        f139836q = s1.h.g((float) 80.0d);
        float f11 = (float) 24.0d;
        f139837r = s1.h.g(f11);
        f139838s = colorSchemeKeyTokens2;
        f139839t = colorSchemeKeyTokens2;
        f139840u = colorSchemeKeyTokens2;
        f139841v = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurfaceVariant;
        f139842w = colorSchemeKeyTokens3;
        f139843x = colorSchemeKeyTokens3;
        f139844y = colorSchemeKeyTokens2;
        f139845z = colorSchemeKeyTokens2;
        A = TypographyKeyTokens.LabelMedium;
        B = colorSchemeKeyTokens2;
        C = colorSchemeKeyTokens2;
        D = colorSchemeKeyTokens3;
        E = s1.h.g(f11);
        F = colorSchemeKeyTokens2;
        G = s1.h.g(f10);
        H = shapeKeyTokens;
    }

    private h0() {
    }

    @dl.d
    public final ColorSchemeKeyTokens A() {
        return B;
    }

    @dl.d
    public final ColorSchemeKeyTokens B() {
        return C;
    }

    @dl.d
    public final ColorSchemeKeyTokens C() {
        return D;
    }

    public final float D() {
        return E;
    }

    @dl.d
    public final ColorSchemeKeyTokens E() {
        return F;
    }

    public final float F() {
        return G;
    }

    @dl.d
    public final ShapeKeyTokens G() {
        return H;
    }

    @dl.d
    public final ColorSchemeKeyTokens a() {
        return f139821b;
    }

    @dl.d
    public final ColorSchemeKeyTokens b() {
        return f139822c;
    }

    @dl.d
    public final ColorSchemeKeyTokens c() {
        return f139823d;
    }

    @dl.d
    public final ColorSchemeKeyTokens d() {
        return f139824e;
    }

    @dl.d
    public final ColorSchemeKeyTokens e() {
        return f139825f;
    }

    @dl.d
    public final ColorSchemeKeyTokens f() {
        return f139826g;
    }

    public final float g() {
        return f139827h;
    }

    @dl.d
    public final ShapeKeyTokens h() {
        return f139828i;
    }

    public final float i() {
        return f139829j;
    }

    @dl.d
    public final ColorSchemeKeyTokens j() {
        return f139830k;
    }

    @dl.d
    public final ColorSchemeKeyTokens k() {
        return f139831l;
    }

    @dl.d
    public final ColorSchemeKeyTokens l() {
        return f139832m;
    }

    @dl.d
    public final ColorSchemeKeyTokens m() {
        return f139833n;
    }

    public final float n() {
        return f139834o;
    }

    @dl.d
    public final ShapeKeyTokens o() {
        return f139835p;
    }

    public final float p() {
        return f139836q;
    }

    public final float q() {
        return f139837r;
    }

    @dl.d
    public final ColorSchemeKeyTokens r() {
        return f139838s;
    }

    @dl.d
    public final ColorSchemeKeyTokens s() {
        return f139839t;
    }

    @dl.d
    public final ColorSchemeKeyTokens t() {
        return f139840u;
    }

    @dl.d
    public final ColorSchemeKeyTokens u() {
        return f139841v;
    }

    @dl.d
    public final ColorSchemeKeyTokens v() {
        return f139842w;
    }

    @dl.d
    public final ColorSchemeKeyTokens w() {
        return f139843x;
    }

    @dl.d
    public final ColorSchemeKeyTokens x() {
        return f139844y;
    }

    @dl.d
    public final ColorSchemeKeyTokens y() {
        return f139845z;
    }

    @dl.d
    public final TypographyKeyTokens z() {
        return A;
    }
}
