package t0;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: SwitchTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\\\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\br\u0010sR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0019\u001a\u00020\u00188\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001d\u001a\u00020\u00188\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006R \u0010'\u001a\u00020\u00188\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b(\u0010\u001cR \u0010)\u001a\u00020\u00188\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b)\u0010\u001a\u001a\u0004\b*\u0010\u001cR\u0017\u0010+\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u0004\u001a\u0004\b,\u0010\u0006R\u0017\u0010-\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u0004\u001a\u0004\b.\u0010\u0006R\u0017\u0010/\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R\u0017\u00101\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\u0004\u001a\u0004\b2\u0010\u0006R \u00103\u001a\u00020\u00188\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b3\u0010\u001a\u001a\u0004\b4\u0010\u001cR\u0017\u00105\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006R\u0017\u00107\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010\u0004\u001a\u0004\b8\u0010\u0006R\u0017\u00109\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010\u0004\u001a\u0004\b:\u0010\u0006R\u0017\u0010;\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006R\u0017\u0010=\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b=\u0010\u0015\u001a\u0004\b>\u0010\u0017R \u0010?\u001a\u00020\u00188\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b?\u0010\u001a\u001a\u0004\b@\u0010\u001cR \u0010A\u001a\u00020\u00188\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bA\u0010\u001a\u001a\u0004\bB\u0010\u001cR \u0010C\u001a\u00020\u00188\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bC\u0010\u001a\u001a\u0004\bD\u0010\u001cR\u0017\u0010E\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bE\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R \u0010F\u001a\u00020\u00188\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bF\u0010\u001a\u001a\u0004\bG\u0010\u001cR\u0017\u0010H\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u0010\u0004\u001a\u0004\bI\u0010\u0006R\u0017\u0010J\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010\u0004\u001a\u0004\bK\u0010\u0006R\u0017\u0010L\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bL\u0010\u0004\u001a\u0004\bM\u0010\u0006R\u0017\u0010N\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bN\u0010\u0004\u001a\u0004\bO\u0010\u0006R\u0017\u0010P\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bP\u0010\u0004\u001a\u0004\bQ\u0010\u0006R \u0010R\u001a\u00020\u00188\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bR\u0010\u001a\u001a\u0004\bS\u0010\u001cR \u0010T\u001a\u00020\u00188\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bT\u0010\u001a\u001a\u0004\bU\u0010\u001cR\u0017\u0010V\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bV\u0010\u0004\u001a\u0004\bW\u0010\u0006R\u0017\u0010X\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bX\u0010\u0004\u001a\u0004\bY\u0010\u0006R\u0017\u0010Z\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bZ\u0010\u0004\u001a\u0004\b[\u0010\u0006R\u0017\u0010\\\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\\\u0010\u0004\u001a\u0004\b]\u0010\u0006R\u0017\u0010^\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b^\u0010\u0004\u001a\u0004\b_\u0010\u0006R \u0010`\u001a\u00020\u00188\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b`\u0010\u001a\u001a\u0004\ba\u0010\u001cR\u0017\u0010b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bb\u0010\u0004\u001a\u0004\bc\u0010\u0006R\u0017\u0010d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bd\u0010\u0004\u001a\u0004\be\u0010\u0006R\u0017\u0010f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bf\u0010\u0004\u001a\u0004\bg\u0010\u0006R\u0017\u0010h\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bh\u0010\u0004\u001a\u0004\bi\u0010\u0006R\u0017\u0010j\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bj\u0010\u0004\u001a\u0004\bk\u0010\u0006R\u0017\u0010l\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bl\u0010\u0004\u001a\u0004\bm\u0010\u0006R \u0010n\u001a\u00020\u00188\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bn\u0010\u001a\u001a\u0004\bo\u0010\u001cR \u0010p\u001a\u00020\u00188\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bp\u0010\u001a\u001a\u0004\bq\u0010\u001c\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006t"}, d2 = {"Lt0/w0;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "DisabledSelectedHandleColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", ak.av, "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "DisabledSelectedIconColor", "b", "DisabledSelectedTrackColor", ak.aF, "DisabledUnselectedHandleColor", "d", "DisabledUnselectedIconColor", "e", "DisabledUnselectedTrackColor", "f", "DisabledUnselectedTrackOutlineColor", "g", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "HandleShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "Ls1/h;", "PressedHandleHeight", "F", "k", "()F", "PressedHandleWidth", "l", "SelectedFocusHandleColor", "m", "SelectedFocusIconColor", "n", "SelectedFocusTrackColor", "o", "SelectedHandleColor", "p", "SelectedHandleHeight", "q", "SelectedHandleWidth", "r", "SelectedHoverHandleColor", ak.aB, "SelectedHoverIconColor", "t", "SelectedHoverTrackColor", ak.aG, "SelectedIconColor", "v", "SelectedIconSize", RXScreenCaptureService.KEY_WIDTH, "SelectedPressedHandleColor", "x", "SelectedPressedIconColor", "y", "SelectedPressedTrackColor", ak.aD, "SelectedTrackColor", androidx.exifinterface.media.a.W4, "StateLayerShape", "B", "StateLayerSize", "C", "TrackHeight", "D", "TrackOutlineWidth", androidx.exifinterface.media.a.S4, "TrackShape", "TrackWidth", "G", "UnselectedFocusHandleColor", "H", "UnselectedFocusIconColor", "I", "UnselectedFocusTrackColor", "J", "UnselectedFocusTrackOutlineColor", "K", "UnselectedHandleColor", "L", "UnselectedHandleHeight", "M", "UnselectedHandleWidth", "N", "UnselectedHoverHandleColor", "O", "UnselectedHoverIconColor", "P", "UnselectedHoverTrackColor", "Q", "UnselectedHoverTrackOutlineColor", "R", "UnselectedIconColor", androidx.exifinterface.media.a.R4, "UnselectedIconSize", androidx.exifinterface.media.a.f23244d5, "UnselectedPressedHandleColor", "U", "UnselectedPressedIconColor", androidx.exifinterface.media.a.X4, "UnselectedPressedTrackColor", androidx.exifinterface.media.a.T4, "UnselectedPressedTrackOutlineColor", "X", "UnselectedTrackColor", "Y", "UnselectedTrackOutlineColor", "Z", "IconHandleHeight", "i", "IconHandleWidth", "j", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class w0 {
    private static final float A;

    @dl.d
    private static final ColorSchemeKeyTokens B;

    @dl.d
    private static final ColorSchemeKeyTokens C;

    @dl.d
    private static final ColorSchemeKeyTokens D;

    @dl.d
    private static final ColorSchemeKeyTokens E;

    @dl.d
    private static final ShapeKeyTokens F;
    private static final float G;
    private static final float H;
    private static final float I;

    @dl.d
    private static final ShapeKeyTokens J;
    private static final float K;

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
    private static final float Q;
    private static final float R;

    @dl.d
    private static final ColorSchemeKeyTokens S;

    @dl.d
    private static final ColorSchemeKeyTokens T;

    @dl.d
    private static final ColorSchemeKeyTokens U;

    @dl.d
    private static final ColorSchemeKeyTokens V;

    @dl.d
    private static final ColorSchemeKeyTokens W;
    private static final float X;

    @dl.d
    private static final ColorSchemeKeyTokens Y;

    @dl.d
    private static final ColorSchemeKeyTokens Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140502a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140504b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f140505c = 1.0f;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140506c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140507d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140508d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f140509e = 0.38f;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final float f140510e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140511f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final float f140512f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f140513g = 0.12f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140514h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f140515i = 0.38f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140516j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f140517k = 0.38f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140518l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140519m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final ShapeKeyTokens f140520n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float f140521o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final float f140522p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140523q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140524r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140525s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140526t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final float f140527u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final float f140528v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140529w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140530x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140531y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140532z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final w0 f140501a = new w0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f140503b = ColorSchemeKeyTokens.Surface;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        f140507d = colorSchemeKeyTokens;
        f140511f = colorSchemeKeyTokens;
        f140514h = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.SurfaceVariant;
        f140516j = colorSchemeKeyTokens2;
        f140518l = colorSchemeKeyTokens2;
        f140519m = colorSchemeKeyTokens;
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        f140520n = shapeKeyTokens;
        float f10 = (float) 28.0d;
        f140521o = s1.h.g(f10);
        f140522p = s1.h.g(f10);
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.PrimaryContainer;
        f140523q = colorSchemeKeyTokens3;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.OnPrimaryContainer;
        f140524r = colorSchemeKeyTokens4;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.Primary;
        f140525s = colorSchemeKeyTokens5;
        f140526t = ColorSchemeKeyTokens.OnPrimary;
        float f11 = (float) 24.0d;
        f140527u = s1.h.g(f11);
        f140528v = s1.h.g(f11);
        f140529w = colorSchemeKeyTokens3;
        f140530x = colorSchemeKeyTokens4;
        f140531y = colorSchemeKeyTokens5;
        f140532z = colorSchemeKeyTokens4;
        float f12 = (float) 16.0d;
        A = s1.h.g(f12);
        B = colorSchemeKeyTokens3;
        C = colorSchemeKeyTokens4;
        D = colorSchemeKeyTokens5;
        E = colorSchemeKeyTokens5;
        F = shapeKeyTokens;
        G = s1.h.g((float) 40.0d);
        H = s1.h.g((float) 32.0d);
        I = s1.h.g((float) 2.0d);
        J = shapeKeyTokens;
        K = s1.h.g((float) 52.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens6 = ColorSchemeKeyTokens.OnSurfaceVariant;
        L = colorSchemeKeyTokens6;
        M = colorSchemeKeyTokens2;
        N = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens7 = ColorSchemeKeyTokens.Outline;
        O = colorSchemeKeyTokens7;
        P = colorSchemeKeyTokens7;
        Q = s1.h.g(f12);
        R = s1.h.g(f12);
        S = colorSchemeKeyTokens6;
        T = colorSchemeKeyTokens2;
        U = colorSchemeKeyTokens2;
        V = colorSchemeKeyTokens7;
        W = colorSchemeKeyTokens2;
        X = s1.h.g(f12);
        Y = colorSchemeKeyTokens6;
        Z = colorSchemeKeyTokens2;
        f140502a0 = colorSchemeKeyTokens2;
        f140504b0 = colorSchemeKeyTokens7;
        f140506c0 = colorSchemeKeyTokens2;
        f140508d0 = colorSchemeKeyTokens7;
        f140510e0 = s1.h.g(f11);
        f140512f0 = s1.h.g(f11);
    }

    private w0() {
    }

    @dl.d
    public final ColorSchemeKeyTokens A() {
        return E;
    }

    @dl.d
    public final ShapeKeyTokens B() {
        return F;
    }

    public final float C() {
        return G;
    }

    public final float D() {
        return H;
    }

    public final float E() {
        return I;
    }

    @dl.d
    public final ShapeKeyTokens F() {
        return J;
    }

    public final float G() {
        return K;
    }

    @dl.d
    public final ColorSchemeKeyTokens H() {
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

    public final float N() {
        return R;
    }

    @dl.d
    public final ColorSchemeKeyTokens O() {
        return S;
    }

    @dl.d
    public final ColorSchemeKeyTokens P() {
        return T;
    }

    @dl.d
    public final ColorSchemeKeyTokens Q() {
        return U;
    }

    @dl.d
    public final ColorSchemeKeyTokens R() {
        return V;
    }

    @dl.d
    public final ColorSchemeKeyTokens S() {
        return W;
    }

    public final float T() {
        return X;
    }

    @dl.d
    public final ColorSchemeKeyTokens U() {
        return Y;
    }

    @dl.d
    public final ColorSchemeKeyTokens V() {
        return Z;
    }

    @dl.d
    public final ColorSchemeKeyTokens W() {
        return f140502a0;
    }

    @dl.d
    public final ColorSchemeKeyTokens X() {
        return f140504b0;
    }

    @dl.d
    public final ColorSchemeKeyTokens Y() {
        return f140506c0;
    }

    @dl.d
    public final ColorSchemeKeyTokens Z() {
        return f140508d0;
    }

    @dl.d
    public final ColorSchemeKeyTokens a() {
        return f140503b;
    }

    @dl.d
    public final ColorSchemeKeyTokens b() {
        return f140507d;
    }

    @dl.d
    public final ColorSchemeKeyTokens c() {
        return f140511f;
    }

    @dl.d
    public final ColorSchemeKeyTokens d() {
        return f140514h;
    }

    @dl.d
    public final ColorSchemeKeyTokens e() {
        return f140516j;
    }

    @dl.d
    public final ColorSchemeKeyTokens f() {
        return f140518l;
    }

    @dl.d
    public final ColorSchemeKeyTokens g() {
        return f140519m;
    }

    @dl.d
    public final ShapeKeyTokens h() {
        return f140520n;
    }

    public final float i() {
        return f140510e0;
    }

    public final float j() {
        return f140512f0;
    }

    public final float k() {
        return f140521o;
    }

    public final float l() {
        return f140522p;
    }

    @dl.d
    public final ColorSchemeKeyTokens m() {
        return f140523q;
    }

    @dl.d
    public final ColorSchemeKeyTokens n() {
        return f140524r;
    }

    @dl.d
    public final ColorSchemeKeyTokens o() {
        return f140525s;
    }

    @dl.d
    public final ColorSchemeKeyTokens p() {
        return f140526t;
    }

    public final float q() {
        return f140527u;
    }

    public final float r() {
        return f140528v;
    }

    @dl.d
    public final ColorSchemeKeyTokens s() {
        return f140529w;
    }

    @dl.d
    public final ColorSchemeKeyTokens t() {
        return f140530x;
    }

    @dl.d
    public final ColorSchemeKeyTokens u() {
        return f140531y;
    }

    @dl.d
    public final ColorSchemeKeyTokens v() {
        return f140532z;
    }

    public final float w() {
        return A;
    }

    @dl.d
    public final ColorSchemeKeyTokens x() {
        return B;
    }

    @dl.d
    public final ColorSchemeKeyTokens y() {
        return C;
    }

    @dl.d
    public final ColorSchemeKeyTokens z() {
        return D;
    }
}
