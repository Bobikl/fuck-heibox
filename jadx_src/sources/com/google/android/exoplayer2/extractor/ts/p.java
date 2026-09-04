package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.util.u0;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: H264Reader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class p implements m {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f46001p = 6;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f46002q = 7;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f46003r = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f46004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f46005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f46006c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f46010g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f46012i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.android.exoplayer2.extractor.e0 f46013j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private b f46014k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f46015l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f46017n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean[] f46011h = new boolean[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u f46007d = new u(7, 128);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u f46008e = new u(8, 128);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final u f46009f = new u(6, 128);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f46016m = com.google.android.exoplayer2.j.f46377b;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e0 f46018o = new com.google.android.exoplayer2.util.e0();

    /* JADX INFO: compiled from: H264Reader.java */
    public static final class b {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final int f46019s = 128;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final int f46020t = 1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final int f46021u = 2;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final int f46022v = 5;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final int f46023w = 9;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.google.android.exoplayer2.extractor.e0 f46024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f46025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f46026c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final SparseArray<com.google.android.exoplayer2.util.z.c> f46027d = new SparseArray<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final SparseArray<com.google.android.exoplayer2.util.z.b> f46028e = new SparseArray<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final com.google.android.exoplayer2.util.f0 f46029f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte[] f46030g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f46031h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f46032i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f46033j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f46034k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f46035l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private a f46036m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private a f46037n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f46038o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private long f46039p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private long f46040q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f46041r;

        /* JADX INFO: compiled from: H264Reader.java */
        public static final class a {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private static final int f46042q = 2;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private static final int f46043r = 7;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f46044a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f46045b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @p0
            private com.google.android.exoplayer2.util.z.c f46046c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f46047d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f46048e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f46049f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f46050g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f46051h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f46052i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private boolean f46053j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private boolean f46054k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private int f46055l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private int f46056m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private int f46057n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private int f46058o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private int f46059p;

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean c(a aVar) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                if (!this.f46044a) {
                    return false;
                }
                if (!aVar.f46044a) {
                    return true;
                }
                com.google.android.exoplayer2.util.z.c cVar = (com.google.android.exoplayer2.util.z.c) com.google.android.exoplayer2.util.a.k(this.f46046c);
                com.google.android.exoplayer2.util.z.c cVar2 = (com.google.android.exoplayer2.util.z.c) com.google.android.exoplayer2.util.a.k(aVar.f46046c);
                return (this.f46049f == aVar.f46049f && this.f46050g == aVar.f46050g && this.f46051h == aVar.f46051h && (!this.f46052i || !aVar.f46052i || this.f46053j == aVar.f46053j) && (((i10 = this.f46047d) == (i11 = aVar.f46047d) || (i10 != 0 && i11 != 0)) && (((i12 = cVar.f51649k) != 0 || cVar2.f51649k != 0 || (this.f46056m == aVar.f46056m && this.f46057n == aVar.f46057n)) && ((i12 != 1 || cVar2.f51649k != 1 || (this.f46058o == aVar.f46058o && this.f46059p == aVar.f46059p)) && (z10 = this.f46054k) == aVar.f46054k && (!z10 || this.f46055l == aVar.f46055l))))) ? false : true;
            }

            public void b() {
                this.f46045b = false;
                this.f46044a = false;
            }

            public boolean d() {
                int i10;
                return this.f46045b && ((i10 = this.f46048e) == 7 || i10 == 2);
            }

            public void e(com.google.android.exoplayer2.util.z.c cVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f46046c = cVar;
                this.f46047d = i10;
                this.f46048e = i11;
                this.f46049f = i12;
                this.f46050g = i13;
                this.f46051h = z10;
                this.f46052i = z11;
                this.f46053j = z12;
                this.f46054k = z13;
                this.f46055l = i14;
                this.f46056m = i15;
                this.f46057n = i16;
                this.f46058o = i17;
                this.f46059p = i18;
                this.f46044a = true;
                this.f46045b = true;
            }

            public void f(int i10) {
                this.f46048e = i10;
                this.f46045b = true;
            }
        }

        public b(com.google.android.exoplayer2.extractor.e0 e0Var, boolean z10, boolean z11) {
            this.f46024a = e0Var;
            this.f46025b = z10;
            this.f46026c = z11;
            this.f46036m = new a();
            this.f46037n = new a();
            byte[] bArr = new byte[128];
            this.f46030g = bArr;
            this.f46029f = new com.google.android.exoplayer2.util.f0(bArr, 0, 0);
            g();
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
            long j10 = this.f46040q;
            if (j10 == com.google.android.exoplayer2.j.f46377b) {
                return;
            }
            boolean z10 = this.f46041r;
            this.f46024a.e(j10, z10 ? 1 : 0, (int) (this.f46033j - this.f46039p), i10, null);
        }

        /* JADX WARN: Code duplicated, block: B:53:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:54:0x0102  */
        /* JADX WARN: Code duplicated, block: B:56:0x0106  */
        /* JADX WARN: Code duplicated, block: B:58:0x010e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:59:0x010f  */
        /* JADX WARN: Code duplicated, block: B:60:0x0118  */
        /* JADX WARN: Code duplicated, block: B:63:0x011e  */
        /* JADX WARN: Code duplicated, block: B:65:0x0128 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:66:0x0129  */
        /* JADX WARN: Code duplicated, block: B:74:0x0152  */
        public void a(byte[] bArr, int i10, int i11) {
            boolean z10;
            boolean z11;
            boolean zD;
            boolean z12;
            int iH;
            int i12;
            int i13;
            int iG;
            int i14;
            int iG2;
            int iE;
            if (this.f46034k) {
                int i15 = i11 - i10;
                byte[] bArr2 = this.f46030g;
                int length = bArr2.length;
                int i16 = this.f46031h;
                if (length < i16 + i15) {
                    this.f46030g = Arrays.copyOf(bArr2, (i16 + i15) * 2);
                }
                System.arraycopy(bArr, i10, this.f46030g, this.f46031h, i15);
                int i17 = this.f46031h + i15;
                this.f46031h = i17;
                this.f46029f.i(this.f46030g, 0, i17);
                if (this.f46029f.b(8)) {
                    this.f46029f.k();
                    int iE2 = this.f46029f.e(2);
                    this.f46029f.l(5);
                    if (this.f46029f.c()) {
                        this.f46029f.h();
                        if (this.f46029f.c()) {
                            int iH2 = this.f46029f.h();
                            if (!this.f46026c) {
                                this.f46034k = false;
                                this.f46037n.f(iH2);
                                return;
                            }
                            if (this.f46029f.c()) {
                                int iH3 = this.f46029f.h();
                                if (this.f46028e.indexOfKey(iH3) < 0) {
                                    this.f46034k = false;
                                    return;
                                }
                                com.google.android.exoplayer2.util.z.b bVar = this.f46028e.get(iH3);
                                com.google.android.exoplayer2.util.z.c cVar = this.f46027d.get(bVar.f51637b);
                                if (cVar.f51646h) {
                                    if (!this.f46029f.b(2)) {
                                        return;
                                    } else {
                                        this.f46029f.l(2);
                                    }
                                }
                                if (this.f46029f.b(cVar.f51648j)) {
                                    int iE3 = this.f46029f.e(cVar.f51648j);
                                    if (!cVar.f51647i) {
                                        if (this.f46029f.b(1)) {
                                            boolean zD2 = this.f46029f.d();
                                            if (!zD2) {
                                                z10 = zD2;
                                                z11 = false;
                                            } else {
                                                if (!this.f46029f.b(1)) {
                                                    return;
                                                }
                                                z10 = zD2;
                                                z11 = true;
                                                zD = this.f46029f.d();
                                            }
                                            if (this.f46032i == 5) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            if (z12) {
                                                iH = 0;
                                            } else if (!this.f46029f.c()) {
                                                return;
                                            } else {
                                                iH = this.f46029f.h();
                                            }
                                            i12 = cVar.f51649k;
                                            if (i12 != 0) {
                                                if (this.f46029f.b(cVar.f51650l)) {
                                                    iE = this.f46029f.e(cVar.f51650l);
                                                    if (bVar.f51638c || z10) {
                                                        i13 = iE;
                                                        iG = 0;
                                                    } else {
                                                        if (!this.f46029f.c()) {
                                                            return;
                                                        }
                                                        iG = this.f46029f.g();
                                                        i13 = iE;
                                                        i14 = 0;
                                                    }
                                                    iG2 = i14;
                                                    this.f46037n.e(cVar, iE2, iH2, iE3, iH3, z10, z11, zD, z12, iH, i13, iG, i14, iG2);
                                                    this.f46034k = false;
                                                }
                                                return;
                                            }
                                            if (i12 == 1 || cVar.f51651m) {
                                                i13 = 0;
                                                iG = 0;
                                            } else {
                                                if (!this.f46029f.c()) {
                                                    return;
                                                }
                                                int iG3 = this.f46029f.g();
                                                if (!bVar.f51638c || z10) {
                                                    i14 = iG3;
                                                    i13 = 0;
                                                    iG = 0;
                                                    iG2 = 0;
                                                } else {
                                                    if (!this.f46029f.c()) {
                                                        return;
                                                    }
                                                    iG2 = this.f46029f.g();
                                                    i14 = iG3;
                                                    i13 = 0;
                                                    iG = 0;
                                                }
                                            }
                                            this.f46037n.e(cVar, iE2, iH2, iE3, iH3, z10, z11, zD, z12, iH, i13, iG, i14, iG2);
                                            this.f46034k = false;
                                            i14 = iG;
                                            iG2 = i14;
                                            this.f46037n.e(cVar, iE2, iH2, iE3, iH3, z10, z11, zD, z12, iH, i13, iG, i14, iG2);
                                            this.f46034k = false;
                                        }
                                        return;
                                    }
                                    z10 = false;
                                    z11 = false;
                                    zD = z11;
                                    if (this.f46032i == 5) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        iH = 0;
                                    } else if (!this.f46029f.c()) {
                                        return;
                                    } else {
                                        iH = this.f46029f.h();
                                    }
                                    i12 = cVar.f51649k;
                                    if (i12 != 0) {
                                        if (i12 == 1) {
                                        }
                                        i13 = 0;
                                        iG = 0;
                                    } else {
                                        if (this.f46029f.b(cVar.f51650l)) {
                                            return;
                                        }
                                        iE = this.f46029f.e(cVar.f51650l);
                                        if (bVar.f51638c) {
                                        }
                                        i13 = iE;
                                        iG = 0;
                                    }
                                    i14 = iG;
                                    iG2 = i14;
                                    this.f46037n.e(cVar, iE2, iH2, iE3, iH3, z10, z11, zD, z12, iH, i13, iG, i14, iG2);
                                    this.f46034k = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        public boolean b(long j10, int i10, boolean z10, boolean z11) {
            boolean z12 = false;
            if (this.f46032i == 9 || (this.f46026c && this.f46037n.c(this.f46036m))) {
                if (z10 && this.f46038o) {
                    d(i10 + ((int) (j10 - this.f46033j)));
                }
                this.f46039p = this.f46033j;
                this.f46040q = this.f46035l;
                this.f46041r = false;
                this.f46038o = true;
            }
            if (this.f46025b) {
                z11 = this.f46037n.d();
            }
            boolean z13 = this.f46041r;
            int i11 = this.f46032i;
            if (i11 == 5 || (z11 && i11 == 1)) {
                z12 = true;
            }
            boolean z14 = z13 | z12;
            this.f46041r = z14;
            return z14;
        }

        public boolean c() {
            return this.f46026c;
        }

        public void e(com.google.android.exoplayer2.util.z.b bVar) {
            this.f46028e.append(bVar.f51636a, bVar);
        }

        public void f(com.google.android.exoplayer2.util.z.c cVar) {
            this.f46027d.append(cVar.f51642d, cVar);
        }

        public void g() {
            this.f46034k = false;
            this.f46038o = false;
            this.f46037n.b();
        }

        public void h(long j10, int i10, long j11) {
            this.f46032i = i10;
            this.f46035l = j11;
            this.f46033j = j10;
            if (!this.f46025b || i10 != 1) {
                if (!this.f46026c) {
                    return;
                }
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            }
            a aVar = this.f46036m;
            this.f46036m = this.f46037n;
            this.f46037n = aVar;
            aVar.b();
            this.f46031h = 0;
            this.f46034k = true;
        }
    }

    public p(d0 d0Var, boolean z10, boolean z11) {
        this.f46004a = d0Var;
        this.f46005b = z10;
        this.f46006c = z11;
    }

    @mk.d({"output", "sampleReader"})
    private void a() {
        com.google.android.exoplayer2.util.a.k(this.f46013j);
        u0.k(this.f46014k);
    }

    @mk.m({"output", "sampleReader"})
    private void g(long j10, int i10, int i11, long j11) {
        if (!this.f46015l || this.f46014k.c()) {
            this.f46007d.b(i11);
            this.f46008e.b(i11);
            if (this.f46015l) {
                if (this.f46007d.c()) {
                    u uVar = this.f46007d;
                    this.f46014k.f(com.google.android.exoplayer2.util.z.l(uVar.f46150d, 3, uVar.f46151e));
                    this.f46007d.d();
                } else if (this.f46008e.c()) {
                    u uVar2 = this.f46008e;
                    this.f46014k.e(com.google.android.exoplayer2.util.z.j(uVar2.f46150d, 3, uVar2.f46151e));
                    this.f46008e.d();
                }
            } else if (this.f46007d.c() && this.f46008e.c()) {
                ArrayList arrayList = new ArrayList();
                u uVar3 = this.f46007d;
                arrayList.add(Arrays.copyOf(uVar3.f46150d, uVar3.f46151e));
                u uVar4 = this.f46008e;
                arrayList.add(Arrays.copyOf(uVar4.f46150d, uVar4.f46151e));
                u uVar5 = this.f46007d;
                com.google.android.exoplayer2.util.z.c cVarL = com.google.android.exoplayer2.util.z.l(uVar5.f46150d, 3, uVar5.f46151e);
                u uVar6 = this.f46008e;
                com.google.android.exoplayer2.util.z.b bVarJ = com.google.android.exoplayer2.util.z.j(uVar6.f46150d, 3, uVar6.f46151e);
                this.f46013j.d(new a2.b().S(this.f46012i).e0("video/avc").I(com.google.android.exoplayer2.util.f.a(cVarL.f51639a, cVarL.f51640b, cVarL.f51641c)).j0(cVarL.f51643e).Q(cVarL.f51644f).a0(cVarL.f51645g).T(arrayList).E());
                this.f46015l = true;
                this.f46014k.f(cVarL);
                this.f46014k.e(bVarJ);
                this.f46007d.d();
                this.f46008e.d();
            }
        }
        if (this.f46009f.b(i11)) {
            u uVar7 = this.f46009f;
            this.f46018o.Q(this.f46009f.f46150d, com.google.android.exoplayer2.util.z.q(uVar7.f46150d, uVar7.f46151e));
            this.f46018o.S(4);
            this.f46004a.a(j11, this.f46018o);
        }
        if (this.f46014k.b(j10, i10, this.f46015l, this.f46017n)) {
            this.f46017n = false;
        }
    }

    @mk.m({"sampleReader"})
    private void h(byte[] bArr, int i10, int i11) {
        if (!this.f46015l || this.f46014k.c()) {
            this.f46007d.a(bArr, i10, i11);
            this.f46008e.a(bArr, i10, i11);
        }
        this.f46009f.a(bArr, i10, i11);
        this.f46014k.a(bArr, i10, i11);
    }

    @mk.m({"sampleReader"})
    private void i(long j10, int i10, long j11) {
        if (!this.f46015l || this.f46014k.c()) {
            this.f46007d.e(i10);
            this.f46008e.e(i10);
        }
        this.f46009f.e(i10);
        this.f46014k.h(j10, i10, j11);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void b() {
        this.f46010g = 0L;
        this.f46017n = false;
        this.f46016m = com.google.android.exoplayer2.j.f46377b;
        com.google.android.exoplayer2.util.z.a(this.f46011h);
        this.f46007d.d();
        this.f46008e.d();
        this.f46009f.d();
        b bVar = this.f46014k;
        if (bVar != null) {
            bVar.g();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void c(com.google.android.exoplayer2.util.e0 e0Var) {
        a();
        int iE = e0Var.e();
        int iF = e0Var.f();
        byte[] bArrD = e0Var.d();
        this.f46010g += (long) e0Var.a();
        this.f46013j.c(e0Var, e0Var.a());
        while (true) {
            int iC = com.google.android.exoplayer2.util.z.c(bArrD, iE, iF, this.f46011h);
            if (iC == iF) {
                h(bArrD, iE, iF);
                return;
            }
            int iF2 = com.google.android.exoplayer2.util.z.f(bArrD, iC);
            int i10 = iC - iE;
            if (i10 > 0) {
                h(bArrD, iE, iC);
            }
            int i11 = iF - iC;
            long j10 = this.f46010g - ((long) i11);
            g(j10, i11, i10 < 0 ? -i10 : 0, this.f46016m);
            i(j10, iF2, this.f46016m);
            iE = iC + 3;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void d() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void e(long j10, int i10) {
        if (j10 != com.google.android.exoplayer2.j.f46377b) {
            this.f46016m = j10;
        }
        this.f46017n |= (i10 & 2) != 0;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void f(com.google.android.exoplayer2.extractor.m mVar, i0.e eVar) {
        eVar.a();
        this.f46012i = eVar.b();
        com.google.android.exoplayer2.extractor.e0 e0VarB = mVar.b(eVar.c(), 2);
        this.f46013j = e0VarB;
        this.f46014k = new b(e0VarB, this.f46005b, this.f46006c);
        this.f46004a.b(mVar, eVar);
    }
}
