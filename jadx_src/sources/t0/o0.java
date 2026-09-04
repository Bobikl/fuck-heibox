package t0;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PrimaryNavigationTabTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bI\u0010JR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R \u0010\u0013\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000bR \u0010\u0015\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0004\u001a\u0004\b\u001d\u0010\u0006R \u0010\u001e\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001e\u0010\t\u001a\u0004\b\u001f\u0010\u000bR\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0006R\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010\u0006R\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0004\u001a\u0004\b%\u0010\u0006R\u0017\u0010&\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u0004\u001a\u0004\b'\u0010\u0006R \u0010(\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b(\u0010\t\u001a\u0004\b)\u0010\u000bR \u0010*\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b*\u0010\t\u001a\u0004\b+\u0010\u000bR\u0017\u0010,\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006R\u0017\u0010.\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u0004\u001a\u0004\b/\u0010\u0006R\u0017\u00100\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u0004\u001a\u0004\b1\u0010\u0006R\u0017\u00102\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u0004\u001a\u0004\b3\u0010\u0006R\u0017\u00104\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010\u0004\u001a\u0004\b5\u0010\u0006R\u0017\u00106\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\u0004\u001a\u0004\b7\u0010\u0006R\u0017\u00108\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\u0004\u001a\u0004\b9\u0010\u0006R\u0017\u0010:\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010\u0004\u001a\u0004\b;\u0010\u0006R\u0017\u0010<\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010\u0004\u001a\u0004\b=\u0010\u0006R\u0017\u0010>\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010\u0004\u001a\u0004\b?\u0010\u0006R\u0017\u0010@\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u0010\u0004\u001a\u0004\bA\u0010\u0006R\u0017\u0010B\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010\u0004\u001a\u0004\bC\u0010\u0006R\u0017\u0010E\u001a\u00020D8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006K"}, d2 = {"Lt0/o0;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveIndicatorColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "f", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "Ls1/h;", "ActiveIndicatorHeight", "F", "g", "()F", "Landroidx/compose/foundation/shape/n;", "ActiveIndicatorShape", "Landroidx/compose/foundation/shape/n;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/compose/foundation/shape/n;", "ContainerColor", "l", "ContainerElevation", "m", "ContainerHeight", "n", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "o", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "DividerColor", "p", "DividerHeight", "q", "ActiveFocusIconColor", ak.av, "ActiveHoverIconColor", ak.aF, "ActiveIconColor", "e", "ActivePressedIconColor", "j", "IconAndLabelTextContainerHeight", "r", "IconSize", ak.aB, "InactiveFocusIconColor", "t", "InactiveHoverIconColor", "v", "InactiveIconColor", "x", "InactivePressedIconColor", ak.aD, "ActiveFocusLabelTextColor", "b", "ActiveHoverLabelTextColor", "d", "ActiveLabelTextColor", "i", "ActivePressedLabelTextColor", "k", "InactiveFocusLabelTextColor", ak.aG, "InactiveHoverLabelTextColor", RXScreenCaptureService.KEY_WIDTH, "InactiveLabelTextColor", "y", "InactivePressedLabelTextColor", androidx.exifinterface.media.a.W4, "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LabelTextFont", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "B", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class o0 {

    @dl.d
    private static final ColorSchemeKeyTokens A;

    @dl.d
    private static final ColorSchemeKeyTokens B;

    @dl.d
    private static final TypographyKeyTokens C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final o0 f140157a = new o0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f140159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final RoundedCornerShape f140160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f140162f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f140163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final ShapeKeyTokens f140164h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140165i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f140166j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140167k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140168l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140169m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140170n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float f140171o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final float f140172p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140173q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140174r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140175s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140176t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140177u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140178v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140179w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140180x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140181y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140182z;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        f140158b = colorSchemeKeyTokens;
        float f10 = (float) 3.0d;
        f140159c = s1.h.g(f10);
        f140160d = androidx.compose.foundation.shape.o.h(s1.h.g(f10));
        f140161e = ColorSchemeKeyTokens.Surface;
        f140162f = l.f139980a.a();
        f140163g = s1.h.g((float) 48.0d);
        f140164h = ShapeKeyTokens.CornerNone;
        f140165i = ColorSchemeKeyTokens.SurfaceVariant;
        f140166j = s1.h.g((float) 1.0d);
        f140167k = colorSchemeKeyTokens;
        f140168l = colorSchemeKeyTokens;
        f140169m = colorSchemeKeyTokens;
        f140170n = colorSchemeKeyTokens;
        f140171o = s1.h.g((float) 64.0d);
        f140172p = s1.h.g((float) 24.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        f140173q = colorSchemeKeyTokens2;
        f140174r = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurfaceVariant;
        f140175s = colorSchemeKeyTokens3;
        f140176t = colorSchemeKeyTokens2;
        f140177u = colorSchemeKeyTokens;
        f140178v = colorSchemeKeyTokens;
        f140179w = colorSchemeKeyTokens;
        f140180x = colorSchemeKeyTokens;
        f140181y = colorSchemeKeyTokens2;
        f140182z = colorSchemeKeyTokens2;
        A = colorSchemeKeyTokens3;
        B = colorSchemeKeyTokens2;
        C = TypographyKeyTokens.TitleSmall;
    }

    private o0() {
    }

    @dl.d
    public final ColorSchemeKeyTokens A() {
        return B;
    }

    @dl.d
    public final TypographyKeyTokens B() {
        return C;
    }

    @dl.d
    public final ColorSchemeKeyTokens a() {
        return f140167k;
    }

    @dl.d
    public final ColorSchemeKeyTokens b() {
        return f140177u;
    }

    @dl.d
    public final ColorSchemeKeyTokens c() {
        return f140168l;
    }

    @dl.d
    public final ColorSchemeKeyTokens d() {
        return f140178v;
    }

    @dl.d
    public final ColorSchemeKeyTokens e() {
        return f140169m;
    }

    @dl.d
    public final ColorSchemeKeyTokens f() {
        return f140158b;
    }

    public final float g() {
        return f140159c;
    }

    @dl.d
    public final RoundedCornerShape h() {
        return f140160d;
    }

    @dl.d
    public final ColorSchemeKeyTokens i() {
        return f140179w;
    }

    @dl.d
    public final ColorSchemeKeyTokens j() {
        return f140170n;
    }

    @dl.d
    public final ColorSchemeKeyTokens k() {
        return f140180x;
    }

    @dl.d
    public final ColorSchemeKeyTokens l() {
        return f140161e;
    }

    public final float m() {
        return f140162f;
    }

    public final float n() {
        return f140163g;
    }

    @dl.d
    public final ShapeKeyTokens o() {
        return f140164h;
    }

    @dl.d
    public final ColorSchemeKeyTokens p() {
        return f140165i;
    }

    public final float q() {
        return f140166j;
    }

    public final float r() {
        return f140171o;
    }

    public final float s() {
        return f140172p;
    }

    @dl.d
    public final ColorSchemeKeyTokens t() {
        return f140173q;
    }

    @dl.d
    public final ColorSchemeKeyTokens u() {
        return f140181y;
    }

    @dl.d
    public final ColorSchemeKeyTokens v() {
        return f140174r;
    }

    @dl.d
    public final ColorSchemeKeyTokens w() {
        return f140182z;
    }

    @dl.d
    public final ColorSchemeKeyTokens x() {
        return f140175s;
    }

    @dl.d
    public final ColorSchemeKeyTokens y() {
        return A;
    }

    @dl.d
    public final ColorSchemeKeyTokens z() {
        return f140176t;
    }
}
