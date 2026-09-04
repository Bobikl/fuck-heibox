package t0;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: ColorLightTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b?\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b?\u0010@R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R \u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R \u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R \u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R \u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R \u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R \u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R \u0010\u001b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006R \u0010\u001d\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R \u0010\u001f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006R \u0010!\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R \u0010#\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R \u0010%\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006R \u0010'\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b'\u0010\u0004\u001a\u0004\b(\u0010\u0006R \u0010)\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R \u0010+\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b+\u0010\u0004\u001a\u0004\b,\u0010\u0006R \u0010-\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b-\u0010\u0004\u001a\u0004\b.\u0010\u0006R \u0010/\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R \u00101\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b1\u0010\u0004\u001a\u0004\b2\u0010\u0006R \u00103\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b3\u0010\u0004\u001a\u0004\b4\u0010\u0006R \u00105\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006R \u00107\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b7\u0010\u0004\u001a\u0004\b8\u0010\u0006R \u00109\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b9\u0010\u0004\u001a\u0004\b:\u0010\u0006R \u0010;\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006R \u0010=\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b=\u0010\u0004\u001a\u0004\b>\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, d2 = {"Lt0/g;", "", "Landroidx/compose/ui/graphics/l0;", "Background", "J", ak.av, "()J", "Error", "b", "ErrorContainer", ak.aF, "InverseOnSurface", "d", "InversePrimary", "e", "InverseSurface", "f", "OnBackground", "g", "OnError", RXScreenCaptureService.KEY_HEIGHT, "OnErrorContainer", "i", "OnPrimary", "j", "OnPrimaryContainer", "k", "OnSecondary", "l", "OnSecondaryContainer", "m", "OnSurface", "n", "OnSurfaceVariant", "o", "OnTertiary", "p", "OnTertiaryContainer", "q", "Outline", "r", "OutlineVariant", ak.aB, "Primary", "t", "PrimaryContainer", ak.aG, "Scrim", "v", "Secondary", RXScreenCaptureService.KEY_WIDTH, "SecondaryContainer", "x", "Surface", "y", "SurfaceTint", ak.aD, "SurfaceVariant", androidx.exifinterface.media.a.W4, "Tertiary", "B", "TertiaryContainer", "C", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class g {
    private static final long A;
    private static final long B;
    private static final long C;
    private static final long D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final g f139752a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f139753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f139754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f139755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f139756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f139757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f139758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f139759h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f139760i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f139761j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f139762k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f139763l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f139764m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f139765n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f139766o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f139767p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f139768q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f139769r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f139770s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f139771t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f139772u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final long f139773v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final long f139774w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final long f139775x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final long f139776y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final long f139777z;

    static {
        n0 n0Var = n0.f140087a;
        f139753b = n0Var.A();
        f139754c = n0Var.g();
        f139755d = n0Var.l();
        f139756e = n0Var.z();
        f139757f = n0Var.X();
        f139758g = n0Var.r();
        f139759h = n0Var.p();
        f139760i = n0Var.d();
        f139761j = n0Var.c();
        f139762k = n0Var.Q();
        f139763l = n0Var.P();
        f139764m = n0Var.d0();
        f139765n = n0Var.c0();
        f139766o = n0Var.p();
        f139767p = n0Var.F();
        f139768q = n0Var.q0();
        f139769r = n0Var.p0();
        f139770s = n0Var.H();
        f139771t = n0Var.K();
        long jT = n0Var.T();
        f139772u = jT;
        f139773v = n0Var.Y();
        f139774w = n0Var.o();
        f139775x = n0Var.g0();
        f139776y = n0Var.l0();
        f139777z = n0Var.A();
        A = jT;
        B = n0Var.L();
        C = n0Var.t0();
        D = n0Var.y0();
    }

    private g() {
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
        return f139753b;
    }

    public final long b() {
        return f139754c;
    }

    public final long c() {
        return f139755d;
    }

    public final long d() {
        return f139756e;
    }

    public final long e() {
        return f139757f;
    }

    public final long f() {
        return f139758g;
    }

    public final long g() {
        return f139759h;
    }

    public final long h() {
        return f139760i;
    }

    public final long i() {
        return f139761j;
    }

    public final long j() {
        return f139762k;
    }

    public final long k() {
        return f139763l;
    }

    public final long l() {
        return f139764m;
    }

    public final long m() {
        return f139765n;
    }

    public final long n() {
        return f139766o;
    }

    public final long o() {
        return f139767p;
    }

    public final long p() {
        return f139768q;
    }

    public final long q() {
        return f139769r;
    }

    public final long r() {
        return f139770s;
    }

    public final long s() {
        return f139771t;
    }

    public final long t() {
        return f139772u;
    }

    public final long u() {
        return f139773v;
    }

    public final long v() {
        return f139774w;
    }

    public final long w() {
        return f139775x;
    }

    public final long x() {
        return f139776y;
    }

    public final long y() {
        return f139777z;
    }

    public final long z() {
        return A;
    }
}
