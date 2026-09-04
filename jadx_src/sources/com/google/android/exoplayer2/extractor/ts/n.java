package com.google.android.exoplayer2.extractor.ts;

import android.util.Pair;
import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.util.u0;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: H262Reader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class n implements m {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f45932q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f45933r = 179;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f45934s = 181;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f45935t = 184;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f45936u = 178;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final double[] f45937v = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.exoplayer2.extractor.e0 f45939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private final k0 f45940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private final com.google.android.exoplayer2.util.e0 f45941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private final u f45942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean[] f45943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f45944g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f45945h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f45946i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f45947j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f45948k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f45949l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f45950m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f45951n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f45952o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f45953p;

    /* JADX INFO: compiled from: H262Reader.java */
    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final byte[] f45954e = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f45955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f45956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f45957c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f45958d;

        public a(int i10) {
            this.f45958d = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f45955a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f45958d;
                int length = bArr2.length;
                int i13 = this.f45956b;
                if (length < i13 + i12) {
                    this.f45958d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f45958d, this.f45956b, i12);
                this.f45956b += i12;
            }
        }

        public boolean b(int i10, int i11) {
            if (this.f45955a) {
                int i12 = this.f45956b - i11;
                this.f45956b = i12;
                if (this.f45957c != 0 || i10 != 181) {
                    this.f45955a = false;
                    return true;
                }
                this.f45957c = i12;
            } else if (i10 == 179) {
                this.f45955a = true;
            }
            byte[] bArr = f45954e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f45955a = false;
            this.f45956b = 0;
            this.f45957c = 0;
        }
    }

    public n() {
        this(null);
    }

    n(@p0 k0 k0Var) {
        this.f45940c = k0Var;
        this.f45943f = new boolean[4];
        this.f45944g = new a(128);
        if (k0Var != null) {
            this.f45942e = new u(178, 128);
            this.f45941d = new com.google.android.exoplayer2.util.e0();
        } else {
            this.f45942e = null;
            this.f45941d = null;
        }
        this.f45949l = com.google.android.exoplayer2.j.f46377b;
        this.f45951n = com.google.android.exoplayer2.j.f46377b;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0075  */
    /* JADX WARN: Code duplicated, block: B:16:0x007a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0089  */
    private static Pair<a2, Long> a(a aVar, String str) {
        float f10;
        int i10;
        float f11;
        long j10;
        int i11;
        double[] dArr;
        double d10;
        int i12;
        int i13;
        byte[] bArrCopyOf = Arrays.copyOf(aVar.f45958d, aVar.f45956b);
        int i14 = bArrCopyOf[4] & 255;
        int i15 = bArrCopyOf[5] & 255;
        int i16 = (i14 << 4) | (i15 >> 4);
        int i17 = ((i15 & 15) << 8) | (bArrCopyOf[6] & 255);
        int i18 = (bArrCopyOf[7] & 240) >> 4;
        if (i18 == 2) {
            f10 = i17 * 4;
            i10 = i16 * 3;
        } else {
            if (i18 != 3) {
                if (i18 != 4) {
                    f11 = 1.0f;
                } else {
                    f10 = i17 * 121;
                    i10 = i16 * 100;
                }
                a2 a2VarE = new a2.b().S(str).e0(com.google.android.exoplayer2.util.y.f51596s).j0(i16).Q(i17).a0(f11).T(Collections.singletonList(bArrCopyOf)).E();
                j10 = 0;
                i11 = (bArrCopyOf[7] & 15) - 1;
                if (i11 >= 0) {
                    dArr = f45937v;
                    if (i11 < dArr.length) {
                        d10 = dArr[i11];
                        byte b10 = bArrCopyOf[aVar.f45957c + 9];
                        i12 = (b10 & 96) >> 5;
                        i13 = b10 & 31;
                        if (i12 != i13) {
                            d10 *= (((double) i12) + 1.0d) / ((double) (i13 + 1));
                        }
                        j10 = (long) (1000000.0d / d10);
                    }
                }
                return Pair.create(a2VarE, Long.valueOf(j10));
            }
            f10 = i17 * 16;
            i10 = i16 * 9;
        }
        f11 = f10 / i10;
        a2 a2VarE2 = new a2.b().S(str).e0(com.google.android.exoplayer2.util.y.f51596s).j0(i16).Q(i17).a0(f11).T(Collections.singletonList(bArrCopyOf)).E();
        j10 = 0;
        i11 = (bArrCopyOf[7] & 15) - 1;
        if (i11 >= 0) {
            dArr = f45937v;
            if (i11 < dArr.length) {
                d10 = dArr[i11];
                byte b11 = bArrCopyOf[aVar.f45957c + 9];
                i12 = (b11 & 96) >> 5;
                i13 = b11 & 31;
                if (i12 != i13) {
                    d10 *= (((double) i12) + 1.0d) / ((double) (i13 + 1));
                }
                j10 = (long) (1000000.0d / d10);
            }
        }
        return Pair.create(a2VarE2, Long.valueOf(j10));
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void b() {
        com.google.android.exoplayer2.util.z.a(this.f45943f);
        this.f45944g.c();
        u uVar = this.f45942e;
        if (uVar != null) {
            uVar.d();
        }
        this.f45945h = 0L;
        this.f45946i = false;
        this.f45949l = com.google.android.exoplayer2.j.f46377b;
        this.f45951n = com.google.android.exoplayer2.j.f46377b;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0112  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void c(com.google.android.exoplayer2.util.e0 e0Var) {
        boolean z10;
        int i10;
        com.google.android.exoplayer2.util.a.k(this.f45939b);
        int iE = e0Var.e();
        int iF = e0Var.f();
        byte[] bArrD = e0Var.d();
        this.f45945h += (long) e0Var.a();
        this.f45939b.c(e0Var, e0Var.a());
        while (true) {
            int iC = com.google.android.exoplayer2.util.z.c(bArrD, iE, iF, this.f45943f);
            if (iC == iF) {
                break;
            }
            int i11 = iC + 3;
            int i12 = e0Var.d()[i11] & 255;
            int i13 = iC - iE;
            if (!this.f45947j) {
                if (i13 > 0) {
                    this.f45944g.a(bArrD, iE, iC);
                }
                if (this.f45944g.b(i12, i13 < 0 ? -i13 : 0)) {
                    Pair<a2, Long> pairA = a(this.f45944g, (String) com.google.android.exoplayer2.util.a.g(this.f45938a));
                    this.f45939b.d((a2) pairA.first);
                    this.f45948k = ((Long) pairA.second).longValue();
                    this.f45947j = true;
                }
            }
            u uVar = this.f45942e;
            if (uVar != null) {
                if (i13 > 0) {
                    uVar.a(bArrD, iE, iC);
                    i10 = 0;
                } else {
                    i10 = -i13;
                }
                if (this.f45942e.b(i10)) {
                    u uVar2 = this.f45942e;
                    ((com.google.android.exoplayer2.util.e0) u0.k(this.f45941d)).Q(this.f45942e.f46150d, com.google.android.exoplayer2.util.z.q(uVar2.f46150d, uVar2.f46151e));
                    ((k0) u0.k(this.f45940c)).a(this.f45951n, this.f45941d);
                }
                if (i12 == 178 && e0Var.d()[iC + 2] == 1) {
                    this.f45942e.e(i12);
                }
            }
            if (i12 == 0 || i12 == 179) {
                int i14 = iF - iC;
                if (this.f45953p && this.f45947j) {
                    long j10 = this.f45951n;
                    if (j10 != com.google.android.exoplayer2.j.f46377b) {
                        this.f45939b.e(j10, this.f45952o ? 1 : 0, ((int) (this.f45945h - this.f45950m)) - i14, i14, null);
                    }
                }
                if (!this.f45946i || this.f45953p) {
                    this.f45950m = this.f45945h - ((long) i14);
                    long j11 = this.f45949l;
                    if (j11 == com.google.android.exoplayer2.j.f46377b) {
                        long j12 = this.f45951n;
                        j11 = j12 != com.google.android.exoplayer2.j.f46377b ? j12 + this.f45948k : -9223372036854775807L;
                    }
                    this.f45951n = j11;
                    this.f45952o = false;
                    this.f45949l = com.google.android.exoplayer2.j.f46377b;
                    z10 = true;
                    this.f45946i = true;
                } else {
                    z10 = true;
                }
                this.f45953p = i12 == 0 ? z10 : false;
            } else if (i12 == 184) {
                this.f45952o = true;
            }
            iE = i11;
        }
        if (!this.f45947j) {
            this.f45944g.a(bArrD, iE, iF);
        }
        u uVar3 = this.f45942e;
        if (uVar3 != null) {
            uVar3.a(bArrD, iE, iF);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void d() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void e(long j10, int i10) {
        this.f45949l = j10;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void f(com.google.android.exoplayer2.extractor.m mVar, i0.e eVar) {
        eVar.a();
        this.f45938a = eVar.b();
        this.f45939b = mVar.b(eVar.c(), 2);
        k0 k0Var = this.f45940c;
        if (k0Var != null) {
            k0Var.b(mVar, eVar);
        }
    }
}
