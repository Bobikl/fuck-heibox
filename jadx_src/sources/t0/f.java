package t0;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: ColorDarkTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b?\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b?\u0010@R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R \u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R \u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R \u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R \u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R \u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R \u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R \u0010\u001b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006R \u0010\u001d\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R \u0010\u001f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006R \u0010!\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R \u0010#\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R \u0010%\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006R \u0010'\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b'\u0010\u0004\u001a\u0004\b(\u0010\u0006R \u0010)\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R \u0010+\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b+\u0010\u0004\u001a\u0004\b,\u0010\u0006R \u0010-\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b-\u0010\u0004\u001a\u0004\b.\u0010\u0006R \u0010/\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R \u00101\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b1\u0010\u0004\u001a\u0004\b2\u0010\u0006R \u00103\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b3\u0010\u0004\u001a\u0004\b4\u0010\u0006R \u00105\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006R \u00107\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b7\u0010\u0004\u001a\u0004\b8\u0010\u0006R \u00109\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b9\u0010\u0004\u001a\u0004\b:\u0010\u0006R \u0010;\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006R \u0010=\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b=\u0010\u0004\u001a\u0004\b>\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, d2 = {"Lt0/f;", "", "Landroidx/compose/ui/graphics/l0;", "Background", "J", ak.av, "()J", "Error", "b", "ErrorContainer", ak.aF, "InverseOnSurface", "d", "InversePrimary", "e", "InverseSurface", "f", "OnBackground", "g", "OnError", RXScreenCaptureService.KEY_HEIGHT, "OnErrorContainer", "i", "OnPrimary", "j", "OnPrimaryContainer", "k", "OnSecondary", "l", "OnSecondaryContainer", "m", "OnSurface", "n", "OnSurfaceVariant", "o", "OnTertiary", "p", "OnTertiaryContainer", "q", "Outline", "r", "OutlineVariant", ak.aB, "Primary", "t", "PrimaryContainer", ak.aG, "Scrim", "v", "Secondary", RXScreenCaptureService.KEY_WIDTH, "SecondaryContainer", "x", "Surface", "y", "SurfaceTint", ak.aD, "SurfaceVariant", androidx.exifinterface.media.a.W4, "Tertiary", "B", "TertiaryContainer", "C", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class f {
    private static final long A;
    private static final long B;
    private static final long C;
    private static final long D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final f f139700a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f139701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f139702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f139703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f139704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f139705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f139706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f139707h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f139708i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f139709j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f139710k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f139711l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f139712m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f139713n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f139714o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f139715p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f139716q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f139717r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f139718s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f139719t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f139720u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final long f139721v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final long f139722w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final long f139723x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final long f139724y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final long f139725z;

    static {
        n0 n0Var = n0.f140087a;
        f139701b = n0Var.p();
        f139702c = n0Var.k();
        f139703d = n0Var.f();
        f139704e = n0Var.r();
        f139705f = n0Var.T();
        f139706g = n0Var.y();
        f139707h = n0Var.y();
        f139708i = n0Var.e();
        f139709j = n0Var.l();
        f139710k = n0Var.R();
        f139711l = n0Var.Y();
        f139712m = n0Var.e0();
        f139713n = n0Var.l0();
        f139714o = n0Var.y();
        f139715p = n0Var.K();
        f139716q = n0Var.r0();
        f139717r = n0Var.y0();
        f139718s = n0Var.I();
        f139719t = n0Var.F();
        long jX = n0Var.X();
        f139720u = jX;
        f139721v = n0Var.S();
        f139722w = n0Var.o();
        f139723x = n0Var.k0();
        f139724y = n0Var.f0();
        f139725z = n0Var.p();
        A = jX;
        B = n0Var.F();
        C = n0Var.x0();
        D = n0Var.s0();
    }

    private f() {
    }

    public final long A() {
        return B;
    }

    public final long B() {
        return C;
    }

    public final long C() {
        return D;
    }

    public final long a() {
        return f139701b;
    }

    public final long b() {
        return f139702c;
    }

    public final long c() {
        return f139703d;
    }

    public final long d() {
        return f139704e;
    }

    public final long e() {
        return f139705f;
    }

    public final long f() {
        return f139706g;
    }

    public final long g() {
        return f139707h;
    }

    public final long h() {
        return f139708i;
    }

    public final long i() {
        return f139709j;
    }

    public final long j() {
        return f139710k;
    }

    public final long k() {
        return f139711l;
    }

    public final long l() {
        return f139712m;
    }

    public final long m() {
        return f139713n;
    }

    public final long n() {
        return f139714o;
    }

    public final long o() {
        return f139715p;
    }

    public final long p() {
        return f139716q;
    }

    public final long q() {
        return f139717r;
    }

    public final long r() {
        return f139718s;
    }

    public final long s() {
        return f139719t;
    }

    public final long t() {
        return f139720u;
    }

    public final long u() {
        return f139721v;
    }

    public final long v() {
        return f139722w;
    }

    public final long w() {
        return f139723x;
    }

    public final long x() {
        return f139724y;
    }

    public final long y() {
        return f139725z;
    }

    public final long z() {
        return A;
    }
}
