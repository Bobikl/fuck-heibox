package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: compiled from: TypeMappingMode.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class x {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    public static final a f126562k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final x f126563l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final x f126564m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final x f126565n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final x f126566o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final x f126567p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final x f126568q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final x f126569r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final x f126570s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final x f126571t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f126572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f126573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f126574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f126575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f126576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private final x f126577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f126578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private final x f126579h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private final x f126580i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f126581j;

    /* JADX INFO: compiled from: TypeMappingMode.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: TypeMappingMode.kt */
    public final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f126582a;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f126582a = iArr;
        }
    }

    static {
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        x xVar = null;
        boolean z14 = false;
        x xVar2 = null;
        x xVar3 = null;
        boolean z15 = false;
        kotlin.jvm.internal.u uVar = null;
        x xVar4 = new x(z10, false, z11, z12, z13, xVar, z14, xVar2, xVar3, z15, 1023, uVar);
        f126563l = xVar4;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = false;
        boolean z21 = false;
        x xVar5 = null;
        x xVar6 = null;
        boolean z22 = true;
        kotlin.jvm.internal.u uVar2 = null;
        x xVar7 = new x(z16, z17, z18, z19, z20, null, z21, xVar5, xVar6, z22, 511, uVar2);
        f126564m = xVar7;
        f126565n = new x(z10, true, z11, z12, z13, xVar, z14, xVar2, xVar3, z15, 1021, uVar);
        int i10 = bb.c.b.f30521ag;
        f126566o = new x(z10, false, z11, z12, z13, xVar4, z14, xVar2, xVar3, z15, i10, uVar);
        f126567p = new x(z16, z17, z18, z19, z20, xVar7, z21, xVar5, xVar6, z22, bb.c.b.f30696i6, uVar2);
        f126568q = new x(z10, true, z11, z12, z13, xVar4, z14, xVar2, xVar3, z15, i10, uVar);
        boolean z23 = false;
        boolean z24 = true;
        f126569r = new x(z10, z23, z11, z24, z13, xVar4, z14, xVar2, xVar3, z15, bb.c.b.Vf, uVar);
        f126570s = new x(z10, z23, z11, z24, z13, xVar4, z14, xVar2, xVar3, z15, bb.c.b.Je, uVar);
        f126571t = new x(z10, z23, true, false, z13, xVar4, z14, xVar2, xVar3, z15, bb.c.b.Wf, uVar);
    }

    public x() {
        this(false, false, false, false, false, null, false, null, null, false, 1023, null);
    }

    public x(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, @dl.e x xVar, boolean z15, @dl.e x xVar2, @dl.e x xVar3, boolean z16) {
        this.f126572a = z10;
        this.f126573b = z11;
        this.f126574c = z12;
        this.f126575d = z13;
        this.f126576e = z14;
        this.f126577f = xVar;
        this.f126578g = z15;
        this.f126579h = xVar2;
        this.f126580i = xVar3;
        this.f126581j = z16;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ x(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, x xVar, boolean z15, x xVar2, x xVar3, boolean z16, int i10, kotlin.jvm.internal.u uVar) {
        boolean z17 = (i10 & 1) != 0 ? true : z10;
        boolean z18 = (i10 & 2) != 0 ? true : z11;
        boolean z19 = (i10 & 4) != 0 ? false : z12;
        boolean z20 = (i10 & 8) != 0 ? false : z13;
        boolean z21 = (i10 & 16) != 0 ? false : z14;
        x xVar4 = (i10 & 32) != 0 ? null : xVar;
        this(z17, z18, z19, z20, z21, xVar4, (i10 & 64) == 0 ? z15 : true, (i10 & 128) != 0 ? xVar4 : xVar2, (i10 & 256) != 0 ? xVar4 : xVar3, (i10 & 512) == 0 ? z16 : false);
    }

    public final boolean a() {
        return this.f126578g;
    }

    public final boolean b() {
        return this.f126581j;
    }

    public final boolean c() {
        return this.f126573b;
    }

    public final boolean d() {
        return this.f126572a;
    }

    public final boolean e() {
        return this.f126574c;
    }

    @dl.d
    public final x f(@dl.d Variance effectiveVariance, boolean z10) {
        f0.p(effectiveVariance, "effectiveVariance");
        if (!z10 || !this.f126574c) {
            int i10 = b.f126582a[effectiveVariance.ordinal()];
            if (i10 == 1) {
                x xVar = this.f126579h;
                if (xVar != null) {
                    return xVar;
                }
            } else if (i10 != 2) {
                x xVar2 = this.f126577f;
                if (xVar2 != null) {
                    return xVar2;
                }
            } else {
                x xVar3 = this.f126580i;
                if (xVar3 != null) {
                    return xVar3;
                }
            }
        }
        return this;
    }

    @dl.d
    public final x g() {
        return new x(this.f126572a, true, this.f126574c, this.f126575d, this.f126576e, this.f126577f, this.f126578g, this.f126579h, this.f126580i, false, 512, null);
    }
}
