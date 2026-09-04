package t0;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: MenuTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b#\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b>\u0010?R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R \u0010\u0013\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006R\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010\u0006R\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0004\u001a\u0004\b%\u0010\u0006R\u0017\u0010&\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u0004\u001a\u0004\b'\u0010\u0006R\u0017\u0010(\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u0004\u001a\u0004\b)\u0010\u0006R\u0017\u0010*\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u0004\u001a\u0004\b+\u0010\u0006R\u0017\u0010,\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006R \u0010.\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b.\u0010\t\u001a\u0004\b/\u0010\u000bR\u0017\u00100\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u0004\u001a\u0004\b1\u0010\u0006R\u0017\u00102\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u0004\u001a\u0004\b3\u0010\u0006R\u0017\u00104\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010\u0004\u001a\u0004\b5\u0010\u0006R\u0017\u00106\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\u0004\u001a\u0004\b7\u0010\u0006R\u0017\u00108\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\u0004\u001a\u0004\b9\u0010\u0006R\u0017\u0010:\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010\u0004\u001a\u0004\b;\u0010\u0006R \u0010<\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b<\u0010\t\u001a\u0004\b=\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006@"}, d2 = {"Lt0/d0;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", ak.av, "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "Ls1/h;", "ContainerElevation", "F", "b", "()F", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", ak.aF, "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerSurfaceTintLayerColor", "d", "ListItemContainerHeight", "e", "ListItemDisabledLabelTextColor", "f", "ListItemFocusLabelTextColor", "i", "ListItemHoverLabelTextColor", "j", "ListItemLabelTextColor", "k", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "ListItemLabelTextFont", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "l", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "ListItemPressedLabelTextColor", "r", "ListItemSelectedContainerColor", ak.aB, "ListItemDisabledLeadingIconColor", "g", "ListItemLeadingFocusIconColor", "m", "ListItemLeadingHoverIconColor", "n", "ListItemLeadingIconColor", "o", "ListItemLeadingIconSize", "p", "ListItemLeadingPressedIconColor", "q", "ListItemDisabledTrailingIconColor", RXScreenCaptureService.KEY_HEIGHT, "ListItemTrailingFocusIconColor", "t", "ListItemTrailingHoverIconColor", ak.aG, "ListItemTrailingPressedIconColor", "x", "ListItemTrailingIconColor", "v", "ListItemTrailingIconSize", RXScreenCaptureService.KEY_WIDTH, "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class d0 {

    @dl.d
    private static final ColorSchemeKeyTokens A;
    private static final float B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final d0 f139617a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139618b = ColorSchemeKeyTokens.Surface;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f139619c = l.f139980a.c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final ShapeKeyTokens f139620d = ShapeKeyTokens.CornerExtraSmall;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139621e = ColorSchemeKeyTokens.SurfaceTint;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f139622f = s1.h.g((float) 48.0d);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f139624h = 0.38f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139626j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139627k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final TypographyKeyTokens f139628l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139629m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139630n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139631o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final float f139632p = 0.38f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139633q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139634r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139635s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f139636t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139637u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139638v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final float f139639w = 0.38f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139640x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139641y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139642z;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        f139623g = colorSchemeKeyTokens;
        f139625i = colorSchemeKeyTokens;
        f139626j = colorSchemeKeyTokens;
        f139627k = colorSchemeKeyTokens;
        f139628l = TypographyKeyTokens.LabelLarge;
        f139629m = colorSchemeKeyTokens;
        f139630n = ColorSchemeKeyTokens.SurfaceVariant;
        f139631o = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurfaceVariant;
        f139633q = colorSchemeKeyTokens2;
        f139634r = colorSchemeKeyTokens2;
        f139635s = colorSchemeKeyTokens2;
        float f10 = (float) 24.0d;
        f139636t = s1.h.g(f10);
        f139637u = colorSchemeKeyTokens2;
        f139638v = colorSchemeKeyTokens;
        f139640x = colorSchemeKeyTokens2;
        f139641y = colorSchemeKeyTokens2;
        f139642z = colorSchemeKeyTokens2;
        A = colorSchemeKeyTokens2;
        B = s1.h.g(f10);
    }

    private d0() {
    }

    @dl.d
    public final ColorSchemeKeyTokens a() {
        return f139618b;
    }

    public final float b() {
        return f139619c;
    }

    @dl.d
    public final ShapeKeyTokens c() {
        return f139620d;
    }

    @dl.d
    public final ColorSchemeKeyTokens d() {
        return f139621e;
    }

    public final float e() {
        return f139622f;
    }

    @dl.d
    public final ColorSchemeKeyTokens f() {
        return f139623g;
    }

    @dl.d
    public final ColorSchemeKeyTokens g() {
        return f139631o;
    }

    @dl.d
    public final ColorSchemeKeyTokens h() {
        return f139638v;
    }

    @dl.d
    public final ColorSchemeKeyTokens i() {
        return f139625i;
    }

    @dl.d
    public final ColorSchemeKeyTokens j() {
        return f139626j;
    }

    @dl.d
    public final ColorSchemeKeyTokens k() {
        return f139627k;
    }

    @dl.d
    public final TypographyKeyTokens l() {
        return f139628l;
    }

    @dl.d
    public final ColorSchemeKeyTokens m() {
        return f139633q;
    }

    @dl.d
    public final ColorSchemeKeyTokens n() {
        return f139634r;
    }

    @dl.d
    public final ColorSchemeKeyTokens o() {
        return f139635s;
    }

    public final float p() {
        return f139636t;
    }

    @dl.d
    public final ColorSchemeKeyTokens q() {
        return f139637u;
    }

    @dl.d
    public final ColorSchemeKeyTokens r() {
        return f139629m;
    }

    @dl.d
    public final ColorSchemeKeyTokens s() {
        return f139630n;
    }

    @dl.d
    public final ColorSchemeKeyTokens t() {
        return f139640x;
    }

    @dl.d
    public final ColorSchemeKeyTokens u() {
        return f139641y;
    }

    @dl.d
    public final ColorSchemeKeyTokens v() {
        return A;
    }

    public final float w() {
        return B;
    }

    @dl.d
    public final ColorSchemeKeyTokens x() {
        return f139642z;
    }
}
