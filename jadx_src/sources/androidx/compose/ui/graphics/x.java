package androidx.compose.ui.graphics;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: BlendMode.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u000f2\u00020\u0001:\u0001\fB\u0014\b\u0000\u0012\u0006\u0010\r\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0003\u0088\u0001\r\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/graphics/x;", "", "", "I", "(I)Ljava/lang/String;", "", "H", "(I)I", "other", "", "F", "(ILjava/lang/Object;)Z", ak.av, "value", androidx.exifinterface.media.a.S4, "b", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f14409c = E(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f14410d = E(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f14411e = E(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f14412f = E(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f14413g = E(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f14414h = E(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f14415i = E(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f14416j = E(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f14417k = E(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f14418l = E(9);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f14419m = E(10);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f14420n = E(11);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f14421o = E(12);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f14422p = E(13);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f14423q = E(14);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f14424r = E(15);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f14425s = E(16);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f14426t = E(17);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f14427u = E(18);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f14428v = E(19);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f14429w = E(20);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f14430x = E(21);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f14431y = E(22);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f14432z = E(23);
    private static final int A = E(24);
    private static final int B = E(25);
    private static final int C = E(26);
    private static final int D = E(27);
    private static final int E = E(28);

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.x$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: BlendMode.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b?\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b?\u0010@R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R \u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R \u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R \u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R \u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R \u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R \u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R \u0010\u001b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006R \u0010\u001d\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R \u0010\u001f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006R \u0010!\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R \u0010#\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R \u0010%\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006R \u0010'\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b'\u0010\u0004\u001a\u0004\b(\u0010\u0006R \u0010)\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R \u0010+\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b+\u0010\u0004\u001a\u0004\b,\u0010\u0006R \u0010-\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b-\u0010\u0004\u001a\u0004\b.\u0010\u0006R \u0010/\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R \u00101\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b1\u0010\u0004\u001a\u0004\b2\u0010\u0006R \u00103\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b3\u0010\u0004\u001a\u0004\b4\u0010\u0006R \u00105\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006R \u00107\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b7\u0010\u0004\u001a\u0004\b8\u0010\u0006R \u00109\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b9\u0010\u0004\u001a\u0004\b:\u0010\u0006R \u0010;\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006R \u0010=\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b=\u0010\u0004\u001a\u0004\b>\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, d2 = {"Landroidx/compose/ui/graphics/x$a;", "", "Landroidx/compose/ui/graphics/x;", "Clear", "I", ak.av, "()I", "Src", "x", "Dst", "g", "SrcOver", "B", "DstOver", "k", "SrcIn", ak.aD, "DstIn", "i", "SrcOut", androidx.exifinterface.media.a.W4, "DstOut", "j", "SrcAtop", "y", "DstAtop", RXScreenCaptureService.KEY_HEIGHT, "Xor", "C", "Plus", "t", "Modulate", "q", "Screen", "v", "Overlay", ak.aB, "Darken", "e", "Lighten", "o", "ColorDodge", "d", "ColorBurn", ak.aF, "Hardlight", "m", "Softlight", RXScreenCaptureService.KEY_WIDTH, "Difference", "f", "Exclusion", "l", "Multiply", "r", "Hue", "n", androidx.exifinterface.media.a.f23304l1, ak.aG, "Color", "b", "Luminosity", "p", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final int A() {
            return x.f14416j;
        }

        public final int B() {
            return x.f14412f;
        }

        public final int C() {
            return x.f14420n;
        }

        public final int a() {
            return x.f14409c;
        }

        public final int b() {
            return x.D;
        }

        public final int c() {
            return x.f14428v;
        }

        public final int d() {
            return x.f14427u;
        }

        public final int e() {
            return x.f14425s;
        }

        public final int f() {
            return x.f14431y;
        }

        public final int g() {
            return x.f14411e;
        }

        public final int h() {
            return x.f14419m;
        }

        public final int i() {
            return x.f14415i;
        }

        public final int j() {
            return x.f14417k;
        }

        public final int k() {
            return x.f14413g;
        }

        public final int l() {
            return x.f14432z;
        }

        public final int m() {
            return x.f14429w;
        }

        public final int n() {
            return x.B;
        }

        public final int o() {
            return x.f14426t;
        }

        public final int p() {
            return x.E;
        }

        public final int q() {
            return x.f14422p;
        }

        public final int r() {
            return x.A;
        }

        public final int s() {
            return x.f14424r;
        }

        public final int t() {
            return x.f14421o;
        }

        public final int u() {
            return x.C;
        }

        public final int v() {
            return x.f14423q;
        }

        public final int w() {
            return x.f14430x;
        }

        public final int x() {
            return x.f14410d;
        }

        public final int y() {
            return x.f14418l;
        }

        public final int z() {
            return x.f14414h;
        }
    }

    private /* synthetic */ x(int i10) {
        this.value = i10;
    }

    public static final /* synthetic */ x D(int i10) {
        return new x(i10);
    }

    public static int E(int i10) {
        return i10;
    }

    public static boolean F(int i10, Object obj) {
        return (obj instanceof x) && i10 == ((x) obj).getValue();
    }

    public static final boolean G(int i10, int i11) {
        return i10 == i11;
    }

    public static int H(int i10) {
        return i10;
    }

    @dl.d
    public static String I(int i10) {
        if (G(i10, f14409c)) {
            return "Clear";
        }
        if (G(i10, f14410d)) {
            return "Src";
        }
        if (G(i10, f14411e)) {
            return "Dst";
        }
        if (G(i10, f14412f)) {
            return "SrcOver";
        }
        if (G(i10, f14413g)) {
            return "DstOver";
        }
        if (G(i10, f14414h)) {
            return "SrcIn";
        }
        if (G(i10, f14415i)) {
            return "DstIn";
        }
        if (G(i10, f14416j)) {
            return "SrcOut";
        }
        if (G(i10, f14417k)) {
            return "DstOut";
        }
        if (G(i10, f14418l)) {
            return "SrcAtop";
        }
        if (G(i10, f14419m)) {
            return "DstAtop";
        }
        if (G(i10, f14420n)) {
            return "Xor";
        }
        if (G(i10, f14421o)) {
            return "Plus";
        }
        if (G(i10, f14422p)) {
            return "Modulate";
        }
        if (G(i10, f14423q)) {
            return "Screen";
        }
        if (G(i10, f14424r)) {
            return "Overlay";
        }
        if (G(i10, f14425s)) {
            return "Darken";
        }
        if (G(i10, f14426t)) {
            return "Lighten";
        }
        if (G(i10, f14427u)) {
            return "ColorDodge";
        }
        if (G(i10, f14428v)) {
            return "ColorBurn";
        }
        if (G(i10, f14429w)) {
            return "HardLight";
        }
        if (G(i10, f14430x)) {
            return "Softlight";
        }
        if (G(i10, f14431y)) {
            return "Difference";
        }
        if (G(i10, f14432z)) {
            return "Exclusion";
        }
        if (G(i10, A)) {
            return "Multiply";
        }
        if (G(i10, B)) {
            return "Hue";
        }
        if (G(i10, C)) {
            return androidx.exifinterface.media.a.f23304l1;
        }
        if (G(i10, D)) {
            return "Color";
        }
        return G(i10, E) ? "Luminosity" : "Unknown";
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return F(this.value, obj);
    }

    public int hashCode() {
        return H(this.value);
    }

    @dl.d
    public String toString() {
        return I(this.value);
    }
}
