package t0;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: SuggestionChipTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0017\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bJ\u0010KR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R \u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u0017\u0010\u0015\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010R \u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R\u0017\u0010\u001b\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010R \u0010\u001d\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R \u0010\u001f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006R \u0010!\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R \u0010#\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R \u0010%\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006R\u0017\u0010'\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010\u000e\u001a\u0004\b(\u0010\u0010R\u0017\u0010)\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b)\u0010\u000e\u001a\u0004\b*\u0010\u0010R\u0017\u0010+\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010\u000e\u001a\u0004\b,\u0010\u0010R \u0010-\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b-\u0010\u0004\u001a\u0004\b.\u0010\u0006R\u0017\u0010/\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b/\u0010\u000e\u001a\u0004\b0\u0010\u0010R\u0017\u00101\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b1\u0010\u000e\u001a\u0004\b2\u0010\u0010R\u0017\u00103\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b3\u0010\u000e\u001a\u0004\b4\u0010\u0010R\u0017\u00106\u001a\u0002058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010:\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b:\u0010\u000e\u001a\u0004\b;\u0010\u0010R\u0017\u0010<\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b<\u0010\u000e\u001a\u0004\b=\u0010\u0010R\u0017\u0010>\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b>\u0010\u000e\u001a\u0004\b?\u0010\u0010R\u0017\u0010@\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b@\u0010\u000e\u001a\u0004\bA\u0010\u0010R\u0017\u0010B\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bB\u0010\u000e\u001a\u0004\bC\u0010\u0010R\u0017\u0010D\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bD\u0010\u000e\u001a\u0004\bE\u0010\u0010R \u0010F\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bF\u0010\u0004\u001a\u0004\bG\u0010\u0006R\u0017\u0010H\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bH\u0010\u000e\u001a\u0004\bI\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006L"}, d2 = {"Lt0/v0;", "", "Ls1/h;", "ContainerHeight", "F", ak.av, "()F", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "b", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerSurfaceTintLayerColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", ak.aF, "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "DisabledLabelTextColor", "d", "DraggedContainerElevation", "f", "DraggedLabelTextColor", "g", "ElevatedContainerColor", "i", "ElevatedContainerElevation", "j", "ElevatedDisabledContainerColor", "k", "ElevatedDisabledContainerElevation", "l", "ElevatedFocusContainerElevation", "m", "ElevatedHoverContainerElevation", "n", "ElevatedPressedContainerElevation", "o", "FlatContainerElevation", "p", "FlatDisabledOutlineColor", "q", "FlatFocusOutlineColor", "r", "FlatOutlineColor", ak.aB, "FlatOutlineWidth", "t", "FocusLabelTextColor", ak.aG, "HoverLabelTextColor", RXScreenCaptureService.KEY_WIDTH, "LabelTextColor", "y", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LabelTextFont", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", ak.aD, "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "PressedLabelTextColor", "C", "DisabledLeadingIconColor", "e", "DraggedLeadingIconColor", RXScreenCaptureService.KEY_HEIGHT, "FocusLeadingIconColor", "v", "HoverLeadingIconColor", "x", "LeadingIconColor", androidx.exifinterface.media.a.W4, "LeadingIconSize", "B", "PressedLeadingIconColor", "D", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class v0 {

    @dl.d
    private static final ColorSchemeKeyTokens A;

    @dl.d
    private static final ColorSchemeKeyTokens B;
    public static final float C = 0.38f;

    @dl.d
    private static final ColorSchemeKeyTokens D;

    @dl.d
    private static final ColorSchemeKeyTokens E;

    @dl.d
    private static final ColorSchemeKeyTokens F;

    @dl.d
    private static final ColorSchemeKeyTokens G;
    private static final float H;

    @dl.d
    private static final ColorSchemeKeyTokens I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final v0 f140450a = new v0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f140451b = s1.h.g((float) 32.0d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final ShapeKeyTokens f140452c = ShapeKeyTokens.CornerSmall;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140453d = ColorSchemeKeyTokens.SurfaceTint;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f140455f = 0.38f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f140456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140458i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f140459j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140460k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float f140461l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float f140462m = 0.12f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f140463n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float f140464o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final float f140465p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final float f140466q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140467r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final float f140468s = 0.12f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140469t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140470u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final float f140471v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140472w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140473x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140474y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private static final TypographyKeyTokens f140475z;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        f140454e = colorSchemeKeyTokens;
        l lVar = l.f139980a;
        f140456g = lVar.e();
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurfaceVariant;
        f140457h = colorSchemeKeyTokens2;
        f140458i = ColorSchemeKeyTokens.Surface;
        f140459j = lVar.b();
        f140460k = colorSchemeKeyTokens;
        f140461l = lVar.a();
        f140463n = lVar.b();
        f140464o = lVar.c();
        f140465p = lVar.b();
        f140466q = lVar.a();
        f140467r = colorSchemeKeyTokens;
        f140469t = colorSchemeKeyTokens2;
        f140470u = ColorSchemeKeyTokens.Outline;
        f140471v = s1.h.g((float) 1.0d);
        f140472w = colorSchemeKeyTokens2;
        f140473x = colorSchemeKeyTokens2;
        f140474y = colorSchemeKeyTokens2;
        f140475z = TypographyKeyTokens.LabelLarge;
        A = colorSchemeKeyTokens2;
        B = colorSchemeKeyTokens;
        D = colorSchemeKeyTokens2;
        E = colorSchemeKeyTokens2;
        F = colorSchemeKeyTokens2;
        G = colorSchemeKeyTokens2;
        H = s1.h.g((float) 18.0d);
        I = colorSchemeKeyTokens2;
    }

    private v0() {
    }

    @dl.d
    public final ColorSchemeKeyTokens A() {
        return G;
    }

    public final float B() {
        return H;
    }

    @dl.d
    public final ColorSchemeKeyTokens C() {
        return A;
    }

    @dl.d
    public final ColorSchemeKeyTokens D() {
        return I;
    }

    public final float a() {
        return f140451b;
    }

    @dl.d
    public final ShapeKeyTokens b() {
        return f140452c;
    }

    @dl.d
    public final ColorSchemeKeyTokens c() {
        return f140453d;
    }

    @dl.d
    public final ColorSchemeKeyTokens d() {
        return f140454e;
    }

    @dl.d
    public final ColorSchemeKeyTokens e() {
        return B;
    }

    public final float f() {
        return f140456g;
    }

    @dl.d
    public final ColorSchemeKeyTokens g() {
        return f140457h;
    }

    @dl.d
    public final ColorSchemeKeyTokens h() {
        return D;
    }

    @dl.d
    public final ColorSchemeKeyTokens i() {
        return f140458i;
    }

    public final float j() {
        return f140459j;
    }

    @dl.d
    public final ColorSchemeKeyTokens k() {
        return f140460k;
    }

    public final float l() {
        return f140461l;
    }

    public final float m() {
        return f140463n;
    }

    public final float n() {
        return f140464o;
    }

    public final float o() {
        return f140465p;
    }

    public final float p() {
        return f140466q;
    }

    @dl.d
    public final ColorSchemeKeyTokens q() {
        return f140467r;
    }

    @dl.d
    public final ColorSchemeKeyTokens r() {
        return f140469t;
    }

    @dl.d
    public final ColorSchemeKeyTokens s() {
        return f140470u;
    }

    public final float t() {
        return f140471v;
    }

    @dl.d
    public final ColorSchemeKeyTokens u() {
        return f140472w;
    }

    @dl.d
    public final ColorSchemeKeyTokens v() {
        return E;
    }

    @dl.d
    public final ColorSchemeKeyTokens w() {
        return f140473x;
    }

    @dl.d
    public final ColorSchemeKeyTokens x() {
        return F;
    }

    @dl.d
    public final ColorSchemeKeyTokens y() {
        return f140474y;
    }

    @dl.d
    public final TypographyKeyTokens z() {
        return f140475z;
    }
}
