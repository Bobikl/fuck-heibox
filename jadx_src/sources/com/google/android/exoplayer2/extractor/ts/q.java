package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.util.u0;
import java.util.Collections;

/* JADX INFO: compiled from: H265Reader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class q implements m {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f46060o = "H265Reader";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f46061p = 9;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f46062q = 16;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f46063r = 21;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f46064s = 32;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f46065t = 33;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f46066u = 34;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f46067v = 35;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f46068w = 39;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f46069x = 40;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f46070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.exoplayer2.extractor.e0 f46072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f46073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f46074e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f46081l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean[] f46075f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final u f46076g = new u(32, 128);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final u f46077h = new u(33, 128);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final u f46078i = new u(34, 128);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final u f46079j = new u(39, 128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final u f46080k = new u(40, 128);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f46082m = com.google.android.exoplayer2.j.f46377b;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e0 f46083n = new com.google.android.exoplayer2.util.e0();

    /* JADX INFO: compiled from: H265Reader.java */
    public static final class a {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int f46084n = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.google.android.exoplayer2.extractor.e0 f46085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f46086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f46087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f46088d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f46089e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f46090f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f46091g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f46092h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f46093i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f46094j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f46095k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f46096l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f46097m;

        public a(com.google.android.exoplayer2.extractor.e0 e0Var) {
            this.f46085a = e0Var;
        }

        private static boolean b(int i10) {
            return (32 <= i10 && i10 <= 35) || i10 == 39;
        }

        private static boolean c(int i10) {
            return i10 < 32 || i10 == 40;
        }

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
        private void d(int i10) {
            long j10 = this.f46096l;
            if (j10 == com.google.android.exoplayer2.j.f46377b) {
                return;
            }
            boolean z10 = this.f46097m;
            this.f46085a.e(j10, z10 ? 1 : 0, (int) (this.f46086b - this.f46095k), i10, null);
        }

        public void a(long j10, int i10, boolean z10) {
            if (this.f46094j && this.f46091g) {
                this.f46097m = this.f46087c;
                this.f46094j = false;
            } else if (this.f46092h || this.f46091g) {
                if (z10 && this.f46093i) {
                    d(i10 + ((int) (j10 - this.f46086b)));
                }
                this.f46095k = this.f46086b;
                this.f46096l = this.f46089e;
                this.f46097m = this.f46087c;
                this.f46093i = true;
            }
        }

        public void e(byte[] bArr, int i10, int i11) {
            if (this.f46090f) {
                int i12 = this.f46088d;
                int i13 = (i10 + 2) - i12;
                if (i13 >= i11) {
                    this.f46088d = i12 + (i11 - i10);
                } else {
                    this.f46091g = (bArr[i13] & 128) != 0;
                    this.f46090f = false;
                }
            }
        }

        public void f() {
            this.f46090f = false;
            this.f46091g = false;
            this.f46092h = false;
            this.f46093i = false;
            this.f46094j = false;
        }

        public void g(long j10, int i10, int i11, long j11, boolean z10) {
            this.f46091g = false;
            this.f46092h = false;
            this.f46089e = j11;
            this.f46088d = 0;
            this.f46086b = j10;
            if (!c(i11)) {
                if (this.f46093i && !this.f46094j) {
                    if (z10) {
                        d(i10);
                    }
                    this.f46093i = false;
                }
                if (b(i11)) {
                    this.f46092h = !this.f46094j;
                    this.f46094j = true;
                }
            }
            boolean z11 = i11 >= 16 && i11 <= 21;
            this.f46087c = z11;
            this.f46090f = z11 || i11 <= 9;
        }
    }

    public q(d0 d0Var) {
        this.f46070a = d0Var;
    }

    @mk.d({"output", "sampleReader"})
    private void a() {
        com.google.android.exoplayer2.util.a.k(this.f46072c);
        u0.k(this.f46073d);
    }

    @mk.m({"output", "sampleReader"})
    private void g(long j10, int i10, int i11, long j11) {
        this.f46073d.a(j10, i10, this.f46074e);
        if (!this.f46074e) {
            this.f46076g.b(i11);
            this.f46077h.b(i11);
            this.f46078i.b(i11);
            if (this.f46076g.c() && this.f46077h.c() && this.f46078i.c()) {
                this.f46072c.d(i(this.f46071b, this.f46076g, this.f46077h, this.f46078i));
                this.f46074e = true;
            }
        }
        if (this.f46079j.b(i11)) {
            u uVar = this.f46079j;
            this.f46083n.Q(this.f46079j.f46150d, com.google.android.exoplayer2.util.z.q(uVar.f46150d, uVar.f46151e));
            this.f46083n.T(5);
            this.f46070a.a(j11, this.f46083n);
        }
        if (this.f46080k.b(i11)) {
            u uVar2 = this.f46080k;
            this.f46083n.Q(this.f46080k.f46150d, com.google.android.exoplayer2.util.z.q(uVar2.f46150d, uVar2.f46151e));
            this.f46083n.T(5);
            this.f46070a.a(j11, this.f46083n);
        }
    }

    @mk.m({"sampleReader"})
    private void h(byte[] bArr, int i10, int i11) {
        this.f46073d.e(bArr, i10, i11);
        if (!this.f46074e) {
            this.f46076g.a(bArr, i10, i11);
            this.f46077h.a(bArr, i10, i11);
            this.f46078i.a(bArr, i10, i11);
        }
        this.f46079j.a(bArr, i10, i11);
        this.f46080k.a(bArr, i10, i11);
    }

    private static a2 i(@p0 String str, u uVar, u uVar2, u uVar3) {
        int i10 = uVar.f46151e;
        byte[] bArr = new byte[uVar2.f46151e + i10 + uVar3.f46151e];
        System.arraycopy(uVar.f46150d, 0, bArr, 0, i10);
        System.arraycopy(uVar2.f46150d, 0, bArr, uVar.f46151e, uVar2.f46151e);
        System.arraycopy(uVar3.f46150d, 0, bArr, uVar.f46151e + uVar2.f46151e, uVar3.f46151e);
        com.google.android.exoplayer2.util.f0 f0Var = new com.google.android.exoplayer2.util.f0(uVar2.f46150d, 0, uVar2.f46151e);
        f0Var.l(44);
        int iE = f0Var.e(3);
        f0Var.k();
        int iE2 = f0Var.e(2);
        boolean zD = f0Var.d();
        int iE3 = f0Var.e(5);
        int i11 = 0;
        for (int i12 = 0; i12 < 32; i12++) {
            if (f0Var.d()) {
                i11 |= 1 << i12;
            }
        }
        int[] iArr = new int[6];
        for (int i13 = 0; i13 < 6; i13++) {
            iArr[i13] = f0Var.e(8);
        }
        int iE4 = f0Var.e(8);
        int i14 = 0;
        for (int i15 = 0; i15 < iE; i15++) {
            if (f0Var.d()) {
                i14 += 89;
            }
            if (f0Var.d()) {
                i14 += 8;
            }
        }
        f0Var.l(i14);
        if (iE > 0) {
            f0Var.l((8 - iE) * 2);
        }
        f0Var.h();
        int iH = f0Var.h();
        if (iH == 3) {
            f0Var.k();
        }
        int iH2 = f0Var.h();
        int iH3 = f0Var.h();
        if (f0Var.d()) {
            int iH4 = f0Var.h();
            int iH5 = f0Var.h();
            int iH6 = f0Var.h();
            int iH7 = f0Var.h();
            iH2 -= ((iH == 1 || iH == 2) ? 2 : 1) * (iH4 + iH5);
            iH3 -= (iH == 1 ? 2 : 1) * (iH6 + iH7);
        }
        f0Var.h();
        f0Var.h();
        int iH8 = f0Var.h();
        for (int i16 = f0Var.d() ? 0 : iE; i16 <= iE; i16++) {
            f0Var.h();
            f0Var.h();
            f0Var.h();
        }
        f0Var.h();
        f0Var.h();
        f0Var.h();
        f0Var.h();
        f0Var.h();
        f0Var.h();
        if (f0Var.d() && f0Var.d()) {
            j(f0Var);
        }
        f0Var.l(2);
        if (f0Var.d()) {
            f0Var.l(8);
            f0Var.h();
            f0Var.h();
            f0Var.k();
        }
        k(f0Var);
        if (f0Var.d()) {
            for (int i17 = 0; i17 < f0Var.h(); i17++) {
                f0Var.l(iH8 + 4 + 1);
            }
        }
        f0Var.l(2);
        float f10 = 1.0f;
        if (f0Var.d()) {
            if (f0Var.d()) {
                int iE5 = f0Var.e(8);
                if (iE5 == 255) {
                    int iE6 = f0Var.e(16);
                    int iE7 = f0Var.e(16);
                    if (iE6 != 0 && iE7 != 0) {
                        f10 = iE6 / iE7;
                    }
                } else {
                    float[] fArr = com.google.android.exoplayer2.util.z.f51620d;
                    if (iE5 < fArr.length) {
                        f10 = fArr[iE5];
                    } else {
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("Unexpected aspect_ratio_idc value: ");
                        sb2.append(iE5);
                        com.google.android.exoplayer2.util.u.m(f46060o, sb2.toString());
                    }
                }
            }
            if (f0Var.d()) {
                f0Var.k();
            }
            if (f0Var.d()) {
                f0Var.l(4);
                if (f0Var.d()) {
                    f0Var.l(24);
                }
            }
            if (f0Var.d()) {
                f0Var.h();
                f0Var.h();
            }
            f0Var.k();
            if (f0Var.d()) {
                iH3 *= 2;
            }
        }
        return new a2.b().S(str).e0("video/hevc").I(com.google.android.exoplayer2.util.f.c(iE2, zD, iE3, i11, iArr, iE4)).j0(iH2).Q(iH3).a0(f10).T(Collections.singletonList(bArr)).E();
    }

    private static void j(com.google.android.exoplayer2.util.f0 f0Var) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (f0Var.d()) {
                    int iMin = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        f0Var.g();
                    }
                    for (int i13 = 0; i13 < iMin; i13++) {
                        f0Var.g();
                    }
                } else {
                    f0Var.h();
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    private static void k(com.google.android.exoplayer2.util.f0 f0Var) {
        int iH = f0Var.h();
        boolean zD = false;
        int i10 = 0;
        for (int i11 = 0; i11 < iH; i11++) {
            if (i11 != 0) {
                zD = f0Var.d();
            }
            if (zD) {
                f0Var.k();
                f0Var.h();
                for (int i12 = 0; i12 <= i10; i12++) {
                    if (f0Var.d()) {
                        f0Var.k();
                    }
                }
            } else {
                int iH2 = f0Var.h();
                int iH3 = f0Var.h();
                int i13 = iH2 + iH3;
                for (int i14 = 0; i14 < iH2; i14++) {
                    f0Var.h();
                    f0Var.k();
                }
                for (int i15 = 0; i15 < iH3; i15++) {
                    f0Var.h();
                    f0Var.k();
                }
                i10 = i13;
            }
        }
    }

    @mk.m({"sampleReader"})
    private void l(long j10, int i10, int i11, long j11) {
        this.f46073d.g(j10, i10, i11, j11, this.f46074e);
        if (!this.f46074e) {
            this.f46076g.e(i11);
            this.f46077h.e(i11);
            this.f46078i.e(i11);
        }
        this.f46079j.e(i11);
        this.f46080k.e(i11);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void b() {
        this.f46081l = 0L;
        this.f46082m = com.google.android.exoplayer2.j.f46377b;
        com.google.android.exoplayer2.util.z.a(this.f46075f);
        this.f46076g.d();
        this.f46077h.d();
        this.f46078i.d();
        this.f46079j.d();
        this.f46080k.d();
        a aVar = this.f46073d;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void c(com.google.android.exoplayer2.util.e0 e0Var) {
        a();
        while (e0Var.a() > 0) {
            int iE = e0Var.e();
            int iF = e0Var.f();
            byte[] bArrD = e0Var.d();
            this.f46081l += (long) e0Var.a();
            this.f46072c.c(e0Var, e0Var.a());
            while (iE < iF) {
                int iC = com.google.android.exoplayer2.util.z.c(bArrD, iE, iF, this.f46075f);
                if (iC == iF) {
                    h(bArrD, iE, iF);
                    return;
                }
                int iE2 = com.google.android.exoplayer2.util.z.e(bArrD, iC);
                int i10 = iC - iE;
                if (i10 > 0) {
                    h(bArrD, iE, iC);
                }
                int i11 = iF - iC;
                long j10 = this.f46081l - ((long) i11);
                g(j10, i11, i10 < 0 ? -i10 : 0, this.f46082m);
                l(j10, i11, iE2, this.f46082m);
                iE = iC + 3;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void d() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void e(long j10, int i10) {
        if (j10 != com.google.android.exoplayer2.j.f46377b) {
            this.f46082m = j10;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void f(com.google.android.exoplayer2.extractor.m mVar, i0.e eVar) {
        eVar.a();
        this.f46071b = eVar.b();
        com.google.android.exoplayer2.extractor.e0 e0VarB = mVar.b(eVar.c(), 2);
        this.f46072c = e0VarB;
        this.f46073d = new a(e0VarB);
        this.f46070a.b(mVar, eVar);
    }
}
