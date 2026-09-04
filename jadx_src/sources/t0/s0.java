package t0;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: SliderTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u001a\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bM\u0010NR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R \u0010\u0015\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006R \u0010\u001d\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001e\u0010\u000bR \u0010\u001f\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\t\u001a\u0004\b \u0010\u000bR\u0017\u0010!\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b!\u0010\u000e\u001a\u0004\b\"\u0010\u0010R \u0010#\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010\t\u001a\u0004\b$\u0010\u000bR\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006R\u0017\u0010'\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u0004\u001a\u0004\b(\u0010\u0006R \u0010)\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b)\u0010\t\u001a\u0004\b*\u0010\u000bR\u0017\u0010+\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010\u000e\u001a\u0004\b,\u0010\u0010R\u0017\u0010-\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u0004\u001a\u0004\b.\u0010\u0006R \u0010/\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b/\u0010\t\u001a\u0004\b0\u0010\u000bR \u00101\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b1\u0010\t\u001a\u0004\b2\u0010\u000bR\u0017\u00103\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\u0004\u001a\u0004\b4\u0010\u0006R\u0017\u00106\u001a\u0002058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010:\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010\u0004\u001a\u0004\b;\u0010\u0006R \u0010<\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b<\u0010\t\u001a\u0004\b=\u0010\u000bR \u0010>\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b>\u0010\t\u001a\u0004\b\t\u0010\u000bR\u0017\u0010?\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010\u0004\u001a\u0004\b@\u0010\u0006R \u0010A\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bA\u0010\t\u001a\u0004\bB\u0010\u000bR\u0017\u0010C\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010\u0004\u001a\u0004\bD\u0010\u0006R\u0017\u0010E\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bE\u0010\u000e\u001a\u0004\bF\u0010\u0010R \u0010G\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bG\u0010\t\u001a\u0004\bH\u0010\u000bR\u0017\u0010I\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u0010\u0004\u001a\u0004\bJ\u0010\u0006R\u0017\u0010K\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bK\u0010\u0004\u001a\u0004\bL\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006O"}, d2 = {"Lt0/s0;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveTrackColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", ak.av, "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "Ls1/h;", "ActiveTrackHeight", "F", "b", "()F", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ActiveTrackShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", ak.aF, "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "DisabledActiveTrackColor", "d", "DisabledHandleColor", "e", "DisabledHandleElevation", "f", "DisabledInactiveTrackColor", "g", "FocusHandleColor", RXScreenCaptureService.KEY_HEIGHT, "HandleColor", "i", "HandleElevation", "j", "HandleHeight", "k", "HandleShape", "l", "HandleWidth", "m", "HoverHandleColor", "n", "InactiveTrackColor", "o", "InactiveTrackHeight", "p", "InactiveTrackShape", "q", "LabelContainerColor", "r", "LabelContainerElevation", ak.aB, "LabelContainerHeight", "t", "LabelTextColor", ak.aG, "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LabelTextFont", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "v", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "PressedHandleColor", "y", "StateLayerSize", ak.aD, "TrackElevation", "OverlapHandleOutlineColor", RXScreenCaptureService.KEY_WIDTH, "OverlapHandleOutlineWidth", "x", "TickMarksActiveContainerColor", androidx.exifinterface.media.a.W4, "TickMarksContainerShape", "B", "TickMarksContainerSize", "C", "TickMarksDisabledContainerColor", "D", "TickMarksInactiveContainerColor", androidx.exifinterface.media.a.S4, "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class s0 {

    @dl.d
    private static final ColorSchemeKeyTokens A;
    private static final float B;
    private static final float C;

    @dl.d
    private static final ColorSchemeKeyTokens D;
    private static final float E;

    @dl.d
    private static final ColorSchemeKeyTokens F;
    public static final float G = 0.38f;

    @dl.d
    private static final ShapeKeyTokens H;
    private static final float I;

    @dl.d
    private static final ColorSchemeKeyTokens J;
    public static final float K = 0.38f;

    @dl.d
    private static final ColorSchemeKeyTokens L;
    public static final float M = 0.38f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final s0 f140323a = new s0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f140325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final ShapeKeyTokens f140326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f140328f = 0.38f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f140330h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f140331i = 0.38f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140332j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f140333k = 0.12f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140334l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140335m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f140336n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float f140337o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final ShapeKeyTokens f140338p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final float f140339q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140340r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140341s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f140342t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private static final ShapeKeyTokens f140343u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140344v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final float f140345w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final float f140346x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140347y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private static final TypographyKeyTokens f140348z;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        f140324b = colorSchemeKeyTokens;
        float f10 = (float) 4.0d;
        f140325c = s1.h.g(f10);
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        f140326d = shapeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        f140327e = colorSchemeKeyTokens2;
        f140329g = colorSchemeKeyTokens2;
        l lVar = l.f139980a;
        f140330h = lVar.a();
        f140332j = colorSchemeKeyTokens2;
        f140334l = colorSchemeKeyTokens;
        f140335m = colorSchemeKeyTokens;
        f140336n = lVar.b();
        float f11 = (float) 20.0d;
        f140337o = s1.h.g(f11);
        f140338p = shapeKeyTokens;
        f140339q = s1.h.g(f11);
        f140340r = colorSchemeKeyTokens;
        f140341s = ColorSchemeKeyTokens.SurfaceVariant;
        f140342t = s1.h.g(f10);
        f140343u = shapeKeyTokens;
        f140344v = colorSchemeKeyTokens;
        f140345w = lVar.a();
        f140346x = s1.h.g((float) 28.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnPrimary;
        f140347y = colorSchemeKeyTokens3;
        f140348z = TypographyKeyTokens.LabelMedium;
        A = colorSchemeKeyTokens;
        B = s1.h.g((float) 40.0d);
        C = lVar.a();
        D = colorSchemeKeyTokens3;
        E = s1.h.g((float) 1.0d);
        F = colorSchemeKeyTokens3;
        H = shapeKeyTokens;
        I = s1.h.g((float) 2.0d);
        J = colorSchemeKeyTokens2;
        L = ColorSchemeKeyTokens.OnSurfaceVariant;
    }

    private s0() {
    }

    @dl.d
    public final ColorSchemeKeyTokens A() {
        return F;
    }

    @dl.d
    public final ShapeKeyTokens B() {
        return H;
    }

    public final float C() {
        return I;
    }

    @dl.d
    public final ColorSchemeKeyTokens D() {
        return J;
    }

    @dl.d
    public final ColorSchemeKeyTokens E() {
        return L;
    }

    public final float F() {
        return C;
    }

    @dl.d
    public final ColorSchemeKeyTokens a() {
        return f140324b;
    }

    public final float b() {
        return f140325c;
    }

    @dl.d
    public final ShapeKeyTokens c() {
        return f140326d;
    }

    @dl.d
    public final ColorSchemeKeyTokens d() {
        return f140327e;
    }

    @dl.d
    public final ColorSchemeKeyTokens e() {
        return f140329g;
    }

    public final float f() {
        return f140330h;
    }

    @dl.d
    public final ColorSchemeKeyTokens g() {
        return f140332j;
    }

    @dl.d
    public final ColorSchemeKeyTokens h() {
        return f140334l;
    }

    @dl.d
    public final ColorSchemeKeyTokens i() {
        return f140335m;
    }

    public final float j() {
        return f140336n;
    }

    public final float k() {
        return f140337o;
    }

    @dl.d
    public final ShapeKeyTokens l() {
        return f140338p;
    }

    public final float m() {
        return f140339q;
    }

    @dl.d
    public final ColorSchemeKeyTokens n() {
        return f140340r;
    }

    @dl.d
    public final ColorSchemeKeyTokens o() {
        return f140341s;
    }

    public final float p() {
        return f140342t;
    }

    @dl.d
    public final ShapeKeyTokens q() {
        return f140343u;
    }

    @dl.d
    public final ColorSchemeKeyTokens r() {
        return f140344v;
    }

    public final float s() {
        return f140345w;
    }

    public final float t() {
        return f140346x;
    }

    @dl.d
    public final ColorSchemeKeyTokens u() {
        return f140347y;
    }

    @dl.d
    public final TypographyKeyTokens v() {
        return f140348z;
    }

    @dl.d
    public final ColorSchemeKeyTokens w() {
        return D;
    }

    public final float x() {
        return E;
    }

    @dl.d
    public final ColorSchemeKeyTokens y() {
        return A;
    }

    public final float z() {
        return B;
    }
}
