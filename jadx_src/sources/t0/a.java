package t0;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AssistChipTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0017\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bJ\u0010KR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R \u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u0017\u0010\u0015\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010R \u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R\u0017\u0010\u001b\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010R \u0010\u001d\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R \u0010\u001f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006R \u0010!\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R \u0010#\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R \u0010%\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006R\u0017\u0010'\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010\u000e\u001a\u0004\b(\u0010\u0010R\u0017\u0010)\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b)\u0010\u000e\u001a\u0004\b*\u0010\u0010R\u0017\u0010+\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010\u000e\u001a\u0004\b,\u0010\u0010R \u0010-\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b-\u0010\u0004\u001a\u0004\b.\u0010\u0006R\u0017\u0010/\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b/\u0010\u000e\u001a\u0004\b0\u0010\u0010R\u0017\u00101\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b1\u0010\u000e\u001a\u0004\b2\u0010\u0010R\u0017\u00103\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b3\u0010\u000e\u001a\u0004\b4\u0010\u0010R\u0017\u00106\u001a\u0002058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010:\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b:\u0010\u000e\u001a\u0004\b;\u0010\u0010R\u0017\u0010<\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b<\u0010\u000e\u001a\u0004\b=\u0010\u0010R\u0017\u0010>\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b>\u0010\u000e\u001a\u0004\b?\u0010\u0010R\u0017\u0010@\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b@\u0010\u000e\u001a\u0004\bA\u0010\u0010R\u0017\u0010B\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bB\u0010\u000e\u001a\u0004\bC\u0010\u0010R\u0017\u0010D\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bD\u0010\u000e\u001a\u0004\bE\u0010\u0010R \u0010F\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bF\u0010\u0004\u001a\u0004\bG\u0010\u0006R\u0017\u0010H\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bH\u0010\u000e\u001a\u0004\bI\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006L"}, d2 = {"Lt0/a;", "", "Ls1/h;", "ContainerHeight", "F", ak.av, "()F", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "b", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerSurfaceTintLayerColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", ak.aF, "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "DisabledLabelTextColor", "e", "DraggedContainerElevation", "f", "DraggedLabelTextColor", RXScreenCaptureService.KEY_HEIGHT, "ElevatedContainerColor", "i", "ElevatedContainerElevation", "j", "ElevatedDisabledContainerColor", "k", "ElevatedDisabledContainerElevation", "l", "ElevatedFocusContainerElevation", "m", "ElevatedHoverContainerElevation", "n", "ElevatedPressedContainerElevation", "o", "FlatContainerElevation", "p", "FlatDisabledOutlineColor", "q", "FlatFocusOutlineColor", "r", "FlatOutlineColor", ak.aB, "FlatOutlineWidth", "t", "FocusLabelTextColor", "v", "HoverLabelTextColor", "x", "LabelTextColor", androidx.exifinterface.media.a.W4, "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LabelTextFont", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "B", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "PressedLabelTextColor", "D", "DisabledIconColor", "d", "DraggedIconColor", "g", "FocusIconColor", ak.aG, "HoverIconColor", RXScreenCaptureService.KEY_WIDTH, "IconColor", "y", "IconSize", ak.aD, "PressedIconColor", "C", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class a {

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
    public static final a f139405a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f139406b = s1.h.g((float) 32.0d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final ShapeKeyTokens f139407c = ShapeKeyTokens.CornerSmall;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139408d = ColorSchemeKeyTokens.SurfaceTint;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f139410f = 0.38f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f139411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139412h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139413i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f139414j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139415k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float f139416l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float f139417m = 0.12f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f139418n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float f139419o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final float f139420p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final float f139421q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139422r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final float f139423s = 0.12f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139424t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139425u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final float f139426v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139427w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139428x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139429y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private static final TypographyKeyTokens f139430z;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        f139409e = colorSchemeKeyTokens;
        l lVar = l.f139980a;
        f139411g = lVar.e();
        f139412h = colorSchemeKeyTokens;
        f139413i = ColorSchemeKeyTokens.Surface;
        f139414j = lVar.b();
        f139415k = colorSchemeKeyTokens;
        f139416l = lVar.a();
        f139418n = lVar.b();
        f139419o = lVar.c();
        f139420p = lVar.b();
        f139421q = lVar.a();
        f139422r = colorSchemeKeyTokens;
        f139424t = colorSchemeKeyTokens;
        f139425u = ColorSchemeKeyTokens.Outline;
        f139426v = s1.h.g((float) 1.0d);
        f139427w = colorSchemeKeyTokens;
        f139428x = colorSchemeKeyTokens;
        f139429y = colorSchemeKeyTokens;
        f139430z = TypographyKeyTokens.LabelLarge;
        A = colorSchemeKeyTokens;
        B = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.Primary;
        D = colorSchemeKeyTokens2;
        E = colorSchemeKeyTokens2;
        F = colorSchemeKeyTokens2;
        G = colorSchemeKeyTokens2;
        H = s1.h.g((float) 18.0d);
        I = colorSchemeKeyTokens2;
    }

    private a() {
    }

    @dl.d
    public final ColorSchemeKeyTokens A() {
        return f139429y;
    }

    @dl.d
    public final TypographyKeyTokens B() {
        return f139430z;
    }

    @dl.d
    public final ColorSchemeKeyTokens C() {
        return I;
    }

    @dl.d
    public final ColorSchemeKeyTokens D() {
        return A;
    }

    public final float a() {
        return f139406b;
    }

    @dl.d
    public final ShapeKeyTokens b() {
        return f139407c;
    }

    @dl.d
    public final ColorSchemeKeyTokens c() {
        return f139408d;
    }

    @dl.d
    public final ColorSchemeKeyTokens d() {
        return B;
    }

    @dl.d
    public final ColorSchemeKeyTokens e() {
        return f139409e;
    }

    public final float f() {
        return f139411g;
    }

    @dl.d
    public final ColorSchemeKeyTokens g() {
        return D;
    }

    @dl.d
    public final ColorSchemeKeyTokens h() {
        return f139412h;
    }

    @dl.d
    public final ColorSchemeKeyTokens i() {
        return f139413i;
    }

    public final float j() {
        return f139414j;
    }

    @dl.d
    public final ColorSchemeKeyTokens k() {
        return f139415k;
    }

    public final float l() {
        return f139416l;
    }

    public final float m() {
        return f139418n;
    }

    public final float n() {
        return f139419o;
    }

    public final float o() {
        return f139420p;
    }

    public final float p() {
        return f139421q;
    }

    @dl.d
    public final ColorSchemeKeyTokens q() {
        return f139422r;
    }

    @dl.d
    public final ColorSchemeKeyTokens r() {
        return f139424t;
    }

    @dl.d
    public final ColorSchemeKeyTokens s() {
        return f139425u;
    }

    public final float t() {
        return f139426v;
    }

    @dl.d
    public final ColorSchemeKeyTokens u() {
        return E;
    }

    @dl.d
    public final ColorSchemeKeyTokens v() {
        return f139427w;
    }

    @dl.d
    public final ColorSchemeKeyTokens w() {
        return F;
    }

    @dl.d
    public final ColorSchemeKeyTokens x() {
        return f139428x;
    }

    @dl.d
    public final ColorSchemeKeyTokens y() {
        return G;
    }

    public final float z() {
        return H;
    }
}
