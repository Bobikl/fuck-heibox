package t0;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: CheckboxTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\b*\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bo\u0010pR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006R \u0010\u000e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R \u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u0017\u0010\u0019\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\u001d\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u001f\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b \u0010\u0014R \u0010!\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R\u0017\u0010#\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b#\u0010\u0012\u001a\u0004\b$\u0010\u0014R\u0017\u0010%\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b%\u0010\u0012\u001a\u0004\b&\u0010\u0014R \u0010'\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b'\u0010\u0004\u001a\u0004\b(\u0010\u0006R\u0017\u0010)\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b)\u0010\u0012\u001a\u0004\b*\u0010\u0014R\u0017\u0010+\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b+\u0010\u0012\u001a\u0004\b,\u0010\u0014R\u0017\u0010-\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b-\u0010\u0012\u001a\u0004\b.\u0010\u0014R \u0010/\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R\u0017\u00101\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b1\u0010\u0012\u001a\u0004\b2\u0010\u0014R\u0017\u00103\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b3\u0010\u0012\u001a\u0004\b4\u0010\u0014R \u00105\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006R\u0017\u00107\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b7\u0010\u0012\u001a\u0004\b8\u0010\u0014R\u0017\u00109\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b9\u0010\u0012\u001a\u0004\b:\u0010\u0014R \u0010;\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006R\u0017\u0010=\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b=\u0010\u0012\u001a\u0004\b>\u0010\u0014R \u0010?\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b?\u0010\u0004\u001a\u0004\b@\u0010\u0006R\u0017\u0010A\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bA\u0010\u0012\u001a\u0004\bB\u0010\u0014R\u0017\u0010C\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bC\u0010\u0012\u001a\u0004\bD\u0010\u0014R \u0010E\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bE\u0010\u0004\u001a\u0004\bF\u0010\u0006R\u0017\u0010H\u001a\u00020G8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR \u0010L\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bL\u0010\u0004\u001a\u0004\b\u0004\u0010\u0006R\u0017\u0010M\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bM\u0010\u0012\u001a\u0004\bN\u0010\u0014R \u0010O\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bO\u0010\u0004\u001a\u0004\bP\u0010\u0006R\u0017\u0010Q\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bQ\u0010\u0012\u001a\u0004\bR\u0010\u0014R \u0010S\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bS\u0010\u0004\u001a\u0004\bT\u0010\u0006R\u0017\u0010U\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bU\u0010\u0012\u001a\u0004\bV\u0010\u0014R \u0010W\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bW\u0010\u0004\u001a\u0004\bX\u0010\u0006R\u0017\u0010Y\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bY\u0010\u0012\u001a\u0004\bZ\u0010\u0014R\u0017\u0010[\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b[\u0010\u0012\u001a\u0004\b\\\u0010\u0014R \u0010]\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b]\u0010\u0004\u001a\u0004\b^\u0010\u0006R\u0017\u0010_\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b_\u0010\u0012\u001a\u0004\b`\u0010\u0014R \u0010a\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\ba\u0010\u0004\u001a\u0004\bb\u0010\u0006R\u0017\u0010c\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bc\u0010\u0012\u001a\u0004\bd\u0010\u0014R \u0010e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\be\u0010\u0004\u001a\u0004\bf\u0010\u0006R\u0017\u0010g\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bg\u0010\u0012\u001a\u0004\bh\u0010\u0014R \u0010i\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bi\u0010\u0004\u001a\u0004\bj\u0010\u0006R\u0017\u0010k\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bk\u0010\u0012\u001a\u0004\bl\u0010\u0014R \u0010m\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bm\u0010\u0004\u001a\u0004\bn\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006q"}, d2 = {"Lt0/d;", "", "Ls1/h;", "ContainerHeight", "F", ak.av, "()F", "Landroidx/compose/foundation/shape/n;", "ContainerShape", "Landroidx/compose/foundation/shape/n;", "b", "()Landroidx/compose/foundation/shape/n;", "ContainerWidth", ak.aF, "IconSize", "d", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "SelectedContainerColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "e", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "SelectedDisabledContainerColor", "f", "SelectedDisabledContainerOutlineWidth", "g", "SelectedDisabledIconColor", RXScreenCaptureService.KEY_HEIGHT, "SelectedErrorContainerColor", "i", "SelectedErrorFocusContainerColor", "j", "SelectedErrorFocusIconColor", "k", "SelectedErrorFocusOutlineWidth", "l", "SelectedErrorHoverContainerColor", "m", "SelectedErrorHoverIconColor", "n", "SelectedErrorHoverOutlineWidth", "o", "SelectedErrorIconColor", "p", "SelectedErrorPressedContainerColor", "q", "SelectedErrorPressedIconColor", "r", "SelectedErrorPressedOutlineWidth", ak.aB, "SelectedFocusContainerColor", "t", "SelectedFocusIconColor", ak.aG, "SelectedFocusOutlineWidth", "v", "SelectedHoverContainerColor", RXScreenCaptureService.KEY_WIDTH, "SelectedHoverIconColor", "x", "SelectedHoverOutlineWidth", "y", "SelectedIconColor", ak.aD, "SelectedOutlineWidth", androidx.exifinterface.media.a.W4, "SelectedPressedContainerColor", "B", "SelectedPressedIconColor", "C", "SelectedPressedOutlineWidth", "D", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "StateLayerShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", androidx.exifinterface.media.a.S4, "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "StateLayerSize", "UnselectedDisabledOutlineColor", "G", "UnselectedDisabledOutlineWidth", "H", "UnselectedErrorFocusOutlineColor", "I", "UnselectedErrorFocusOutlineWidth", "J", "UnselectedErrorHoverOutlineColor", "K", "UnselectedErrorHoverOutlineWidth", "L", "UnselectedErrorOutlineColor", "M", "UnselectedErrorPressedOutlineColor", "N", "UnselectedErrorPressedOutlineWidth", "O", "UnselectedFocusOutlineColor", "P", "UnselectedFocusOutlineWidth", "Q", "UnselectedHoverOutlineColor", "R", "UnselectedHoverOutlineWidth", androidx.exifinterface.media.a.R4, "UnselectedOutlineColor", androidx.exifinterface.media.a.f23244d5, "UnselectedOutlineWidth", "U", "UnselectedPressedOutlineColor", androidx.exifinterface.media.a.X4, "UnselectedPressedOutlineWidth", androidx.exifinterface.media.a.T4, "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class d {
    private static final float A;

    @dl.d
    private static final ColorSchemeKeyTokens B;
    private static final float C;

    @dl.d
    private static final ColorSchemeKeyTokens D;

    @dl.d
    private static final ColorSchemeKeyTokens E;
    private static final float F;

    @dl.d
    private static final ShapeKeyTokens G;
    private static final float H;
    public static final float I = 0.38f;

    @dl.d
    private static final ColorSchemeKeyTokens J;
    private static final float K;

    @dl.d
    private static final ColorSchemeKeyTokens L;
    private static final float M;

    @dl.d
    private static final ColorSchemeKeyTokens N;
    private static final float O;

    @dl.d
    private static final ColorSchemeKeyTokens P;

    @dl.d
    private static final ColorSchemeKeyTokens Q;
    private static final float R;

    @dl.d
    private static final ColorSchemeKeyTokens S;
    private static final float T;

    @dl.d
    private static final ColorSchemeKeyTokens U;
    private static final float V;

    @dl.d
    private static final ColorSchemeKeyTokens W;
    private static final float X;

    @dl.d
    private static final ColorSchemeKeyTokens Y;
    private static final float Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final d f139591a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f139592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final RoundedCornerShape f139593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f139594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f139595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139597g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f139598h = 0.38f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f139599i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139600j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139601k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139602l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139603m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f139604n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139605o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139606p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final float f139607q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139608r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139609s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139610t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final float f139611u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139612v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139613w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final float f139614x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139615y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private static final ColorSchemeKeyTokens f139616z;

    static {
        float f10 = (float) 18.0d;
        f139592b = s1.h.g(f10);
        float f11 = (float) 2.0d;
        f139593c = androidx.compose.foundation.shape.o.h(s1.h.g(f11));
        f139594d = s1.h.g(f10);
        f139595e = s1.h.g(f10);
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        f139596f = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        f139597g = colorSchemeKeyTokens2;
        float f12 = (float) 0.0d;
        f139599i = s1.h.g(f12);
        f139600j = ColorSchemeKeyTokens.Surface;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.Error;
        f139601k = colorSchemeKeyTokens3;
        f139602l = colorSchemeKeyTokens3;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.OnError;
        f139603m = colorSchemeKeyTokens4;
        f139604n = s1.h.g(f12);
        f139605o = colorSchemeKeyTokens3;
        f139606p = colorSchemeKeyTokens4;
        f139607q = s1.h.g(f12);
        f139608r = colorSchemeKeyTokens4;
        f139609s = colorSchemeKeyTokens3;
        f139610t = colorSchemeKeyTokens4;
        f139611u = s1.h.g(f12);
        f139612v = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.OnPrimary;
        f139613w = colorSchemeKeyTokens5;
        f139614x = s1.h.g(f12);
        f139615y = colorSchemeKeyTokens;
        f139616z = colorSchemeKeyTokens5;
        A = s1.h.g(f12);
        B = colorSchemeKeyTokens5;
        C = s1.h.g(f12);
        D = colorSchemeKeyTokens;
        E = colorSchemeKeyTokens5;
        F = s1.h.g(f12);
        G = ShapeKeyTokens.CornerFull;
        H = s1.h.g((float) 40.0d);
        J = colorSchemeKeyTokens2;
        K = s1.h.g(f11);
        L = colorSchemeKeyTokens3;
        M = s1.h.g(f11);
        N = colorSchemeKeyTokens3;
        O = s1.h.g(f11);
        P = colorSchemeKeyTokens3;
        Q = colorSchemeKeyTokens3;
        R = s1.h.g(f11);
        S = colorSchemeKeyTokens2;
        T = s1.h.g(f11);
        U = colorSchemeKeyTokens2;
        V = s1.h.g(f11);
        W = ColorSchemeKeyTokens.OnSurfaceVariant;
        X = s1.h.g(f11);
        Y = colorSchemeKeyTokens2;
        Z = s1.h.g(f11);
    }

    private d() {
    }

    public final float A() {
        return C;
    }

    @dl.d
    public final ColorSchemeKeyTokens B() {
        return D;
    }

    @dl.d
    public final ColorSchemeKeyTokens C() {
        return E;
    }

    public final float D() {
        return F;
    }

    @dl.d
    public final ShapeKeyTokens E() {
        return G;
    }

    public final float F() {
        return H;
    }

    @dl.d
    public final ColorSchemeKeyTokens G() {
        return J;
    }

    public final float H() {
        return K;
    }

    @dl.d
    public final ColorSchemeKeyTokens I() {
        return L;
    }

    public final float J() {
        return M;
    }

    @dl.d
    public final ColorSchemeKeyTokens K() {
        return N;
    }

    public final float L() {
        return O;
    }

    @dl.d
    public final ColorSchemeKeyTokens M() {
        return P;
    }

    @dl.d
    public final ColorSchemeKeyTokens N() {
        return Q;
    }

    public final float O() {
        return R;
    }

    @dl.d
    public final ColorSchemeKeyTokens P() {
        return S;
    }

    public final float Q() {
        return T;
    }

    @dl.d
    public final ColorSchemeKeyTokens R() {
        return U;
    }

    public final float S() {
        return V;
    }

    @dl.d
    public final ColorSchemeKeyTokens T() {
        return W;
    }

    public final float U() {
        return X;
    }

    @dl.d
    public final ColorSchemeKeyTokens V() {
        return Y;
    }

    public final float W() {
        return Z;
    }

    public final float a() {
        return f139592b;
    }

    @dl.d
    public final RoundedCornerShape b() {
        return f139593c;
    }

    public final float c() {
        return f139594d;
    }

    public final float d() {
        return f139595e;
    }

    @dl.d
    public final ColorSchemeKeyTokens e() {
        return f139596f;
    }

    @dl.d
    public final ColorSchemeKeyTokens f() {
        return f139597g;
    }

    public final float g() {
        return f139599i;
    }

    @dl.d
    public final ColorSchemeKeyTokens h() {
        return f139600j;
    }

    @dl.d
    public final ColorSchemeKeyTokens i() {
        return f139601k;
    }

    @dl.d
    public final ColorSchemeKeyTokens j() {
        return f139602l;
    }

    @dl.d
    public final ColorSchemeKeyTokens k() {
        return f139603m;
    }

    public final float l() {
        return f139604n;
    }

    @dl.d
    public final ColorSchemeKeyTokens m() {
        return f139605o;
    }

    @dl.d
    public final ColorSchemeKeyTokens n() {
        return f139606p;
    }

    public final float o() {
        return f139607q;
    }

    @dl.d
    public final ColorSchemeKeyTokens p() {
        return f139608r;
    }

    @dl.d
    public final ColorSchemeKeyTokens q() {
        return f139609s;
    }

    @dl.d
    public final ColorSchemeKeyTokens r() {
        return f139610t;
    }

    public final float s() {
        return f139611u;
    }

    @dl.d
    public final ColorSchemeKeyTokens t() {
        return f139612v;
    }

    @dl.d
    public final ColorSchemeKeyTokens u() {
        return f139613w;
    }

    public final float v() {
        return f139614x;
    }

    @dl.d
    public final ColorSchemeKeyTokens w() {
        return f139615y;
    }

    @dl.d
    public final ColorSchemeKeyTokens x() {
        return f139616z;
    }

    public final float y() {
        return A;
    }

    @dl.d
    public final ColorSchemeKeyTokens z() {
        return B;
    }
}
