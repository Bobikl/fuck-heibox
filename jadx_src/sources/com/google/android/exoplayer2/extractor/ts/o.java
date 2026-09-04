package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.util.u0;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: H263Reader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class o implements m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f45959l = "H263Reader";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f45960m = 176;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f45961n = 178;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f45962o = 179;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f45963p = 181;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f45964q = 182;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f45965r = 31;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f45966s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float[] f45967t = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f45968u = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final k0 f45969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final com.google.android.exoplayer2.util.e0 f45970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean[] f45971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f45972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private final u f45973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f45974f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f45975g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f45976h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.google.android.exoplayer2.extractor.e0 f45977i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f45978j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f45979k;

    /* JADX INFO: compiled from: H263Reader.java */
    public static final class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final byte[] f45980f = {0, 0, 1};

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f45981g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f45982h = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f45983i = 2;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f45984j = 3;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f45985k = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f45986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f45987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f45988c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f45989d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f45990e;

        public a(int i10) {
            this.f45990e = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f45986a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f45990e;
                int length = bArr2.length;
                int i13 = this.f45988c;
                if (length < i13 + i12) {
                    this.f45990e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f45990e, this.f45988c, i12);
                this.f45988c += i12;
            }
        }

        public boolean b(int i10, int i11) {
            int i12 = this.f45987b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i10 == 179 || i10 == 181) {
                                this.f45988c -= i11;
                                this.f45986a = false;
                                return true;
                            }
                        } else if ((i10 & 240) != 32) {
                            com.google.android.exoplayer2.util.u.m(o.f45959l, "Unexpected start code value");
                            c();
                        } else {
                            this.f45989d = this.f45988c;
                            this.f45987b = 4;
                        }
                    } else if (i10 > 31) {
                        com.google.android.exoplayer2.util.u.m(o.f45959l, "Unexpected start code value");
                        c();
                    } else {
                        this.f45987b = 3;
                    }
                } else if (i10 != 181) {
                    com.google.android.exoplayer2.util.u.m(o.f45959l, "Unexpected start code value");
                    c();
                } else {
                    this.f45987b = 2;
                }
            } else if (i10 == 176) {
                this.f45987b = 1;
                this.f45986a = true;
            }
            byte[] bArr = f45980f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f45986a = false;
            this.f45988c = 0;
            this.f45987b = 0;
        }
    }

    /* JADX INFO: compiled from: H263Reader.java */
    public static final class b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f45991i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f45992j = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.google.android.exoplayer2.extractor.e0 f45993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f45994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f45995c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f45996d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f45997e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f45998f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f45999g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f46000h;

        public b(com.google.android.exoplayer2.extractor.e0 e0Var) {
            this.f45993a = e0Var;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f45995c) {
                int i12 = this.f45998f;
                int i13 = (i10 + 1) - i12;
                if (i13 >= i11) {
                    this.f45998f = i12 + (i11 - i10);
                } else {
                    this.f45996d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f45995c = false;
                }
            }
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
        public void b(long j10, int i10, boolean z10) {
            if (this.f45997e == 182 && z10 && this.f45994b) {
                long j11 = this.f46000h;
                if (j11 != com.google.android.exoplayer2.j.f46377b) {
                    this.f45993a.e(j11, this.f45996d ? 1 : 0, (int) (j10 - this.f45999g), i10, null);
                }
            }
            if (this.f45997e != 179) {
                this.f45999g = j10;
            }
        }

        public void c(int i10, long j10) {
            this.f45997e = i10;
            this.f45996d = false;
            this.f45994b = i10 == 182 || i10 == 179;
            this.f45995c = i10 == 182;
            this.f45998f = 0;
            this.f46000h = j10;
        }

        public void d() {
            this.f45994b = false;
            this.f45995c = false;
            this.f45996d = false;
            this.f45997e = -1;
        }
    }

    public o() {
        this(null);
    }

    o(@p0 k0 k0Var) {
        this.f45969a = k0Var;
        this.f45971c = new boolean[4];
        this.f45972d = new a(128);
        this.f45979k = com.google.android.exoplayer2.j.f46377b;
        if (k0Var != null) {
            this.f45973e = new u(178, 128);
            this.f45970b = new com.google.android.exoplayer2.util.e0();
        } else {
            this.f45973e = null;
            this.f45970b = null;
        }
    }

    private static a2 a(a aVar, int i10, String str) {
        byte[] bArrCopyOf = Arrays.copyOf(aVar.f45990e, aVar.f45988c);
        com.google.android.exoplayer2.util.d0 d0Var = new com.google.android.exoplayer2.util.d0(bArrCopyOf);
        d0Var.t(i10);
        d0Var.t(4);
        d0Var.r();
        d0Var.s(8);
        if (d0Var.g()) {
            d0Var.s(4);
            d0Var.s(3);
        }
        int iH = d0Var.h(4);
        float f10 = 1.0f;
        if (iH == 15) {
            int iH2 = d0Var.h(8);
            int iH3 = d0Var.h(8);
            if (iH3 == 0) {
                com.google.android.exoplayer2.util.u.m(f45959l, "Invalid aspect ratio");
            } else {
                f10 = iH2 / iH3;
            }
        } else {
            float[] fArr = f45967t;
            if (iH < fArr.length) {
                f10 = fArr[iH];
            } else {
                com.google.android.exoplayer2.util.u.m(f45959l, "Invalid aspect ratio");
            }
        }
        if (d0Var.g()) {
            d0Var.s(2);
            d0Var.s(1);
            if (d0Var.g()) {
                d0Var.s(15);
                d0Var.r();
                d0Var.s(15);
                d0Var.r();
                d0Var.s(15);
                d0Var.r();
                d0Var.s(3);
                d0Var.s(11);
                d0Var.r();
                d0Var.s(15);
                d0Var.r();
            }
        }
        if (d0Var.h(2) != 0) {
            com.google.android.exoplayer2.util.u.m(f45959l, "Unhandled video object layer shape");
        }
        d0Var.r();
        int iH4 = d0Var.h(16);
        d0Var.r();
        if (d0Var.g()) {
            if (iH4 == 0) {
                com.google.android.exoplayer2.util.u.m(f45959l, "Invalid vop_increment_time_resolution");
            } else {
                int i11 = 0;
                for (int i12 = iH4 - 1; i12 > 0; i12 >>= 1) {
                    i11++;
                }
                d0Var.s(i11);
            }
        }
        d0Var.r();
        int iH5 = d0Var.h(13);
        d0Var.r();
        int iH6 = d0Var.h(13);
        d0Var.r();
        d0Var.r();
        return new a2.b().S(str).e0(com.google.android.exoplayer2.util.y.f51590p).j0(iH5).Q(iH6).a0(f10).T(Collections.singletonList(bArrCopyOf)).E();
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void b() {
        com.google.android.exoplayer2.util.z.a(this.f45971c);
        this.f45972d.c();
        b bVar = this.f45974f;
        if (bVar != null) {
            bVar.d();
        }
        u uVar = this.f45973e;
        if (uVar != null) {
            uVar.d();
        }
        this.f45975g = 0L;
        this.f45979k = com.google.android.exoplayer2.j.f46377b;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void c(com.google.android.exoplayer2.util.e0 e0Var) {
        com.google.android.exoplayer2.util.a.k(this.f45974f);
        com.google.android.exoplayer2.util.a.k(this.f45977i);
        int iE = e0Var.e();
        int iF = e0Var.f();
        byte[] bArrD = e0Var.d();
        this.f45975g += (long) e0Var.a();
        this.f45977i.c(e0Var, e0Var.a());
        while (true) {
            int iC = com.google.android.exoplayer2.util.z.c(bArrD, iE, iF, this.f45971c);
            if (iC == iF) {
                break;
            }
            int i10 = iC + 3;
            int i11 = e0Var.d()[i10] & 255;
            int i12 = iC - iE;
            int i13 = 0;
            if (!this.f45978j) {
                if (i12 > 0) {
                    this.f45972d.a(bArrD, iE, iC);
                }
                if (this.f45972d.b(i11, i12 < 0 ? -i12 : 0)) {
                    com.google.android.exoplayer2.extractor.e0 e0Var2 = this.f45977i;
                    a aVar = this.f45972d;
                    e0Var2.d(a(aVar, aVar.f45989d, (String) com.google.android.exoplayer2.util.a.g(this.f45976h)));
                    this.f45978j = true;
                }
            }
            this.f45974f.a(bArrD, iE, iC);
            u uVar = this.f45973e;
            if (uVar != null) {
                if (i12 > 0) {
                    uVar.a(bArrD, iE, iC);
                } else {
                    i13 = -i12;
                }
                if (this.f45973e.b(i13)) {
                    u uVar2 = this.f45973e;
                    ((com.google.android.exoplayer2.util.e0) u0.k(this.f45970b)).Q(this.f45973e.f46150d, com.google.android.exoplayer2.util.z.q(uVar2.f46150d, uVar2.f46151e));
                    ((k0) u0.k(this.f45969a)).a(this.f45979k, this.f45970b);
                }
                if (i11 == 178 && e0Var.d()[iC + 2] == 1) {
                    this.f45973e.e(i11);
                }
            }
            int i14 = iF - iC;
            this.f45974f.b(this.f45975g - ((long) i14), i14, this.f45978j);
            this.f45974f.c(i11, this.f45979k);
            iE = i10;
        }
        if (!this.f45978j) {
            this.f45972d.a(bArrD, iE, iF);
        }
        this.f45974f.a(bArrD, iE, iF);
        u uVar3 = this.f45973e;
        if (uVar3 != null) {
            uVar3.a(bArrD, iE, iF);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void d() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void e(long j10, int i10) {
        if (j10 != com.google.android.exoplayer2.j.f46377b) {
            this.f45979k = j10;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.m
    public void f(com.google.android.exoplayer2.extractor.m mVar, i0.e eVar) {
        eVar.a();
        this.f45976h = eVar.b();
        com.google.android.exoplayer2.extractor.e0 e0VarB = mVar.b(eVar.c(), 2);
        this.f45977i = e0VarB;
        this.f45974f = new b(e0VarB);
        k0 k0Var = this.f45969a;
        if (k0Var != null) {
            k0Var.b(mVar, eVar);
        }
    }
}
