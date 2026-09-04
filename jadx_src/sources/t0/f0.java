package t0;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: NavigationBarTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bD\u0010ER\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R \u0010\u0012\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R \u0010%\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\u0013\u001a\u0004\b&\u0010\u0015R \u0010'\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b'\u0010\u0013\u001a\u0004\b(\u0010\u0015R\u0017\u0010)\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b)\u0010\u0018\u001a\u0004\b*\u0010\u001aR\u0017\u0010+\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u0004\u001a\u0004\b,\u0010\u0006R \u0010-\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b-\u0010\u0013\u001a\u0004\b.\u0010\u0015R\u0017\u0010/\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R\u0017\u00101\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\u0004\u001a\u0004\b2\u0010\u0006R\u0017\u00103\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\u0004\u001a\u0004\b4\u0010\u0006R\u0017\u00105\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006R\u0017\u00107\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010\u0004\u001a\u0004\b8\u0010\u0006R\u0017\u00109\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010\u0004\u001a\u0004\b:\u0010\u0006R\u0017\u0010;\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006R\u0017\u0010=\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010\u0004\u001a\u0004\b>\u0010\u0006R\u0017\u0010@\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006F"}, d2 = {"Lt0/f0;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveFocusIconColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", ak.av, "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveFocusLabelTextColor", "b", "ActiveHoverIconColor", ak.aF, "ActiveHoverLabelTextColor", "d", "ActiveIconColor", "e", "ActiveIndicatorColor", "f", "Ls1/h;", "ActiveIndicatorHeight", "F", "g", "()F", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ActiveIndicatorShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ActiveIndicatorWidth", "i", "ActiveLabelTextColor", "j", "ActivePressedIconColor", "k", "ActivePressedLabelTextColor", "l", "ContainerColor", "m", "ContainerElevation", "n", "ContainerHeight", "o", "ContainerShape", "p", "ContainerSurfaceTintLayerColor", "q", "IconSize", "r", "InactiveFocusIconColor", ak.aB, "InactiveFocusLabelTextColor", "t", "InactiveHoverIconColor", ak.aG, "InactiveHoverLabelTextColor", "v", "InactiveIconColor", RXScreenCaptureService.KEY_WIDTH, "InactiveLabelTextColor", "x", "InactivePressedIconColor", "y", "InactivePressedLabelTextColor", ak.aD, "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LabelTextFont", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", androidx.exifinterface.media.a.W4, "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class f0 {

    @dl.d
    private static final ColorSchemeKeyTokens A;

    @dl.d
    private static final TypographyKeyTokens B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final f0 f139726a = new f0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f139733h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final ShapeKeyTokens f139734i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f139735j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139736k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139737l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139738m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139739n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float f139740o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final float f139741p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private static final ShapeKeyTokens f139742q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139743r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final float f139744s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139745t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139746u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139747v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139748w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139749x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139750y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139751z;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSecondaryContainer;
        f139727b = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        f139728c = colorSchemeKeyTokens2;
        f139729d = colorSchemeKeyTokens;
        f139730e = colorSchemeKeyTokens2;
        f139731f = colorSchemeKeyTokens;
        f139732g = ColorSchemeKeyTokens.SecondaryContainer;
        f139733h = s1.h.g((float) 32.0d);
        f139734i = ShapeKeyTokens.CornerFull;
        f139735j = s1.h.g((float) 64.0d);
        f139736k = colorSchemeKeyTokens2;
        f139737l = colorSchemeKeyTokens;
        f139738m = colorSchemeKeyTokens2;
        f139739n = ColorSchemeKeyTokens.Surface;
        f139740o = l.f139980a.c();
        f139741p = s1.h.g((float) 80.0d);
        f139742q = ShapeKeyTokens.CornerNone;
        f139743r = ColorSchemeKeyTokens.SurfaceTint;
        f139744s = s1.h.g((float) 24.0d);
        f139745t = colorSchemeKeyTokens2;
        f139746u = colorSchemeKeyTokens2;
        f139747v = colorSchemeKeyTokens2;
        f139748w = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurfaceVariant;
        f139749x = colorSchemeKeyTokens3;
        f139750y = colorSchemeKeyTokens3;
        f139751z = colorSchemeKeyTokens2;
        A = colorSchemeKeyTokens2;
        B = TypographyKeyTokens.LabelMedium;
    }

    private f0() {
    }

    @dl.d
    public final TypographyKeyTokens A() {
        return B;
    }

    @dl.d
    public final ColorSchemeKeyTokens a() {
        return f139727b;
    }

    @dl.d
    public final ColorSchemeKeyTokens b() {
        return f139728c;
    }

    @dl.d
    public final ColorSchemeKeyTokens c() {
        return f139729d;
    }

    @dl.d
    public final ColorSchemeKeyTokens d() {
        return f139730e;
    }

    @dl.d
    public final ColorSchemeKeyTokens e() {
        return f139731f;
    }

    @dl.d
    public final ColorSchemeKeyTokens f() {
        return f139732g;
    }

    public final float g() {
        return f139733h;
    }

    @dl.d
    public final ShapeKeyTokens h() {
        return f139734i;
    }

    public final float i() {
        return f139735j;
    }

    @dl.d
    public final ColorSchemeKeyTokens j() {
        return f139736k;
    }

    @dl.d
    public final ColorSchemeKeyTokens k() {
        return f139737l;
    }

    @dl.d
    public final ColorSchemeKeyTokens l() {
        return f139738m;
    }

    @dl.d
    public final ColorSchemeKeyTokens m() {
        return f139739n;
    }

    public final float n() {
        return f139740o;
    }

    public final float o() {
        return f139741p;
    }

    @dl.d
    public final ShapeKeyTokens p() {
        return f139742q;
    }

    @dl.d
    public final ColorSchemeKeyTokens q() {
        return f139743r;
    }

    public final float r() {
        return f139744s;
    }

    @dl.d
    public final ColorSchemeKeyTokens s() {
        return f139745t;
    }

    @dl.d
    public final ColorSchemeKeyTokens t() {
        return f139746u;
    }

    @dl.d
    public final ColorSchemeKeyTokens u() {
        return f139747v;
    }

    @dl.d
    public final ColorSchemeKeyTokens v() {
        return f139748w;
    }

    @dl.d
    public final ColorSchemeKeyTokens w() {
        return f139749x;
    }

    @dl.d
    public final ColorSchemeKeyTokens x() {
        return f139750y;
    }

    @dl.d
    public final ColorSchemeKeyTokens y() {
        return f139751z;
    }

    @dl.d
    public final ColorSchemeKeyTokens z() {
        return A;
    }
}
