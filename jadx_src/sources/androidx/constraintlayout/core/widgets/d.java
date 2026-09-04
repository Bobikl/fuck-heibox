package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: ConstraintWidgetContainer.java */
/* JADX INFO: loaded from: classes.dex */
public class d extends m {

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    private static final int f18430f2 = 8;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    private static final boolean f18431g2 = false;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    private static final boolean f18432h2 = false;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    static final boolean f18433i2 = false;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    static int f18434j2;
    androidx.constraintlayout.core.widgets.analyzer.b A1;
    public androidx.constraintlayout.core.widgets.analyzer.e B1;
    private int C1;
    protected androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0110b D1;
    private boolean E1;
    public androidx.constraintlayout.core.f F1;
    protected androidx.constraintlayout.core.e G1;
    int H1;
    int I1;
    int J1;
    int K1;
    public int L1;
    public int M1;
    c[] N1;
    c[] O1;
    public boolean P1;
    public boolean Q1;
    public boolean R1;
    public int S1;
    public int T1;
    private int U1;
    public boolean V1;
    private boolean W1;
    private boolean X1;
    int Y1;
    private WeakReference<ConstraintAnchor> Z1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    private WeakReference<ConstraintAnchor> f18435a2;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    private WeakReference<ConstraintAnchor> f18436b2;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    private WeakReference<ConstraintAnchor> f18437c2;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    HashSet<ConstraintWidget> f18438d2;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.b.a f18439e2;

    public d() {
        this.A1 = new androidx.constraintlayout.core.widgets.analyzer.b(this);
        this.B1 = new androidx.constraintlayout.core.widgets.analyzer.e(this);
        this.D1 = null;
        this.E1 = false;
        this.G1 = new androidx.constraintlayout.core.e();
        this.L1 = 0;
        this.M1 = 0;
        this.N1 = new c[4];
        this.O1 = new c[4];
        this.P1 = false;
        this.Q1 = false;
        this.R1 = false;
        this.S1 = 0;
        this.T1 = 0;
        this.U1 = 257;
        this.V1 = false;
        this.W1 = false;
        this.X1 = false;
        this.Y1 = 0;
        this.Z1 = null;
        this.f18435a2 = null;
        this.f18436b2 = null;
        this.f18437c2 = null;
        this.f18438d2 = new HashSet<>();
        this.f18439e2 = new androidx.constraintlayout.core.widgets.analyzer.b.a();
    }

    public d(int i10, int i11) {
        super(i10, i11);
        this.A1 = new androidx.constraintlayout.core.widgets.analyzer.b(this);
        this.B1 = new androidx.constraintlayout.core.widgets.analyzer.e(this);
        this.D1 = null;
        this.E1 = false;
        this.G1 = new androidx.constraintlayout.core.e();
        this.L1 = 0;
        this.M1 = 0;
        this.N1 = new c[4];
        this.O1 = new c[4];
        this.P1 = false;
        this.Q1 = false;
        this.R1 = false;
        this.S1 = 0;
        this.T1 = 0;
        this.U1 = 257;
        this.V1 = false;
        this.W1 = false;
        this.X1 = false;
        this.Y1 = 0;
        this.Z1 = null;
        this.f18435a2 = null;
        this.f18436b2 = null;
        this.f18437c2 = null;
        this.f18438d2 = new HashSet<>();
        this.f18439e2 = new androidx.constraintlayout.core.widgets.analyzer.b.a();
    }

    public d(int i10, int i11, int i12, int i13) {
        super(i10, i11, i12, i13);
        this.A1 = new androidx.constraintlayout.core.widgets.analyzer.b(this);
        this.B1 = new androidx.constraintlayout.core.widgets.analyzer.e(this);
        this.D1 = null;
        this.E1 = false;
        this.G1 = new androidx.constraintlayout.core.e();
        this.L1 = 0;
        this.M1 = 0;
        this.N1 = new c[4];
        this.O1 = new c[4];
        this.P1 = false;
        this.Q1 = false;
        this.R1 = false;
        this.S1 = 0;
        this.T1 = 0;
        this.U1 = 257;
        this.V1 = false;
        this.W1 = false;
        this.X1 = false;
        this.Y1 = 0;
        this.Z1 = null;
        this.f18435a2 = null;
        this.f18436b2 = null;
        this.f18437c2 = null;
        this.f18438d2 = new HashSet<>();
        this.f18439e2 = new androidx.constraintlayout.core.widgets.analyzer.b.a();
    }

    public d(String str, int i10, int i11) {
        super(i10, i11);
        this.A1 = new androidx.constraintlayout.core.widgets.analyzer.b(this);
        this.B1 = new androidx.constraintlayout.core.widgets.analyzer.e(this);
        this.D1 = null;
        this.E1 = false;
        this.G1 = new androidx.constraintlayout.core.e();
        this.L1 = 0;
        this.M1 = 0;
        this.N1 = new c[4];
        this.O1 = new c[4];
        this.P1 = false;
        this.Q1 = false;
        this.R1 = false;
        this.S1 = 0;
        this.T1 = 0;
        this.U1 = 257;
        this.V1 = false;
        this.W1 = false;
        this.X1 = false;
        this.Y1 = 0;
        this.Z1 = null;
        this.f18435a2 = null;
        this.f18436b2 = null;
        this.f18437c2 = null;
        this.f18438d2 = new HashSet<>();
        this.f18439e2 = new androidx.constraintlayout.core.widgets.analyzer.b.a();
        d1(str);
    }

    public static boolean L2(int i10, ConstraintWidget constraintWidget, androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0110b interfaceC0110b, androidx.constraintlayout.core.widgets.analyzer.b.a aVar, int i11) {
        int i12;
        int i13;
        if (interfaceC0110b == null) {
            return false;
        }
        if (constraintWidget.i0() == 8 || (constraintWidget instanceof f) || (constraintWidget instanceof a)) {
            aVar.f18347e = 0;
            aVar.f18348f = 0;
            return false;
        }
        aVar.f18343a = constraintWidget.H();
        aVar.f18344b = constraintWidget.g0();
        aVar.f18345c = constraintWidget.j0();
        aVar.f18346d = constraintWidget.D();
        aVar.f18351i = false;
        aVar.f18352j = i11;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.f18343a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z10 = dimensionBehaviour == dimensionBehaviour2;
        boolean z11 = aVar.f18344b == dimensionBehaviour2;
        boolean z12 = z10 && constraintWidget.f18263f0 > 0.0f;
        boolean z13 = z11 && constraintWidget.f18263f0 > 0.0f;
        if (z10 && constraintWidget.o0(0) && constraintWidget.f18296w == 0 && !z12) {
            aVar.f18343a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z11 && constraintWidget.f18298x == 0) {
                aVar.f18343a = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z10 = false;
        }
        if (z11 && constraintWidget.o0(1) && constraintWidget.f18298x == 0 && !z13) {
            aVar.f18344b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z10 && constraintWidget.f18296w == 0) {
                aVar.f18344b = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z11 = false;
        }
        if (constraintWidget.C0()) {
            aVar.f18343a = ConstraintWidget.DimensionBehaviour.FIXED;
            z10 = false;
        }
        if (constraintWidget.D0()) {
            aVar.f18344b = ConstraintWidget.DimensionBehaviour.FIXED;
            z11 = false;
        }
        if (z12) {
            if (constraintWidget.f18300y[0] == 4) {
                aVar.f18343a = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z11) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = aVar.f18344b;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour3 == dimensionBehaviour4) {
                    i13 = aVar.f18346d;
                } else {
                    aVar.f18343a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    interfaceC0110b.b(constraintWidget, aVar);
                    i13 = aVar.f18348f;
                }
                aVar.f18343a = dimensionBehaviour4;
                aVar.f18345c = (int) (constraintWidget.A() * i13);
            }
        }
        if (z13) {
            if (constraintWidget.f18300y[1] == 4) {
                aVar.f18344b = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z10) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = aVar.f18343a;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour5 == dimensionBehaviour6) {
                    i12 = aVar.f18345c;
                } else {
                    aVar.f18344b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    interfaceC0110b.b(constraintWidget, aVar);
                    i12 = aVar.f18347e;
                }
                aVar.f18344b = dimensionBehaviour6;
                if (constraintWidget.B() == -1) {
                    aVar.f18346d = (int) (i12 / constraintWidget.A());
                } else {
                    aVar.f18346d = (int) (constraintWidget.A() * i12);
                }
            }
        }
        interfaceC0110b.b(constraintWidget, aVar);
        constraintWidget.W1(aVar.f18347e);
        constraintWidget.s1(aVar.f18348f);
        constraintWidget.r1(aVar.f18350h);
        constraintWidget.a1(aVar.f18349g);
        aVar.f18352j = androidx.constraintlayout.core.widgets.analyzer.b.a.f18340k;
        return aVar.f18351i;
    }

    private void N2() {
        this.L1 = 0;
        this.M1 = 0;
    }

    private void m2(ConstraintWidget constraintWidget) {
        int i10 = this.L1 + 1;
        c[] cVarArr = this.O1;
        if (i10 >= cVarArr.length) {
            this.O1 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.O1[this.L1] = new c(constraintWidget, 0, I2());
        this.L1++;
    }

    private void p2(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.G1.i(solverVariable, this.G1.u(constraintAnchor), 0, 5);
    }

    private void q2(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.G1.i(this.G1.u(constraintAnchor), solverVariable, 0, 5);
    }

    private void r2(ConstraintWidget constraintWidget) {
        int i10 = this.M1 + 1;
        c[] cVarArr = this.N1;
        if (i10 >= cVarArr.length) {
            this.N1 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.N1[this.M1] = new c(constraintWidget, 1, I2());
        this.M1++;
    }

    public androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0110b A2() {
        return this.D1;
    }

    public int B2() {
        return this.U1;
    }

    public androidx.constraintlayout.core.e C2() {
        return this.G1;
    }

    public ArrayList<f> D2() {
        ArrayList<f> arrayList = new ArrayList<>();
        int size = this.f18505z1.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = this.f18505z1.get(i10);
            if (constraintWidget instanceof f) {
                f fVar = (f) constraintWidget;
                if (fVar.g2() == 1) {
                    arrayList.add(fVar);
                }
            }
        }
        return arrayList;
    }

    public boolean E2() {
        return false;
    }

    public void F2() {
        this.B1.o();
    }

    public void G2() {
        this.B1.p();
    }

    public boolean H2() {
        return this.X1;
    }

    public boolean I2() {
        return this.E1;
    }

    public boolean J2() {
        return this.W1;
    }

    public long K2(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.H1 = i17;
        this.I1 = i18;
        return this.A1.d(this, i10, i17, i18, i11, i12, i13, i14, i15, i16);
    }

    public boolean M2(int i10) {
        return (this.U1 & i10) == i10;
    }

    @Override // androidx.constraintlayout.core.widgets.m, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void N0() {
        this.G1.Y();
        this.H1 = 0;
        this.J1 = 0;
        this.I1 = 0;
        this.K1 = 0;
        this.V1 = false;
        super.N0();
    }

    public void O2(androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0110b interfaceC0110b) {
        this.D1 = interfaceC0110b;
        this.B1.u(interfaceC0110b);
    }

    public void P2(int i10) {
        this.U1 = i10;
        androidx.constraintlayout.core.e.f17313v = M2(512);
    }

    public void Q2(int i10, int i11, int i12, int i13) {
        this.H1 = i10;
        this.I1 = i11;
        this.J1 = i12;
        this.K1 = i13;
    }

    public void R2(int i10) {
        this.C1 = i10;
    }

    public void S2(boolean z10) {
        this.E1 = z10;
    }

    public boolean T2(androidx.constraintlayout.core.e eVar, boolean[] zArr) {
        zArr[2] = false;
        boolean zM2 = M2(64);
        d2(eVar, zM2);
        int size = this.f18505z1.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = this.f18505z1.get(i10);
            constraintWidget.d2(eVar, zM2);
            if (constraintWidget.q0()) {
                z10 = true;
            }
        }
        return z10;
    }

    public void U2() {
        this.A1.e(this);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String c0() {
        return "ConstraintLayout";
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void c2(boolean z10, boolean z11) {
        super.c2(z10, z11);
        int size = this.f18505z1.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f18505z1.get(i10).c2(z10, z11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:155:0x0314 A[PHI: r2 r16
  0x0314: PHI (r2v15 ??) = (r2v14 ??), (r2v19 ??), (r2v19 ??), (r2v19 ??) binds: [B:142:0x02d5, B:150:0x02fa, B:151:0x02fc, B:153:0x0302] A[DONT_GENERATE, DONT_INLINE]
  0x0314: PHI (r16v4 boolean) = (r16v3 boolean), (r16v5 boolean), (r16v5 boolean), (r16v5 boolean) binds: [B:142:0x02d5, B:150:0x02fa, B:151:0x02fc, B:153:0x0302] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // androidx.constraintlayout.core.widgets.m
    public void h2() {
        int i10;
        int i11;
        boolean z10;
        boolean zT2;
        boolean z11;
        ?? r10;
        ?? r11;
        ?? r13;
        boolean z12;
        int i12;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        int i13 = 0;
        this.f18267h0 = 0;
        this.f18269i0 = 0;
        this.W1 = false;
        this.X1 = false;
        int size = this.f18505z1.size();
        int iMax = Math.max(0, j0());
        int iMax2 = Math.max(0, D());
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = this.f18255b0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[0];
        androidx.constraintlayout.core.f fVar = this.F1;
        if (fVar != null) {
            fVar.P++;
        }
        if (this.C1 == 0 && i.b(this.U1, 1)) {
            androidx.constraintlayout.core.widgets.analyzer.g.j(this, A2());
            for (int i14 = 0; i14 < size; i14++) {
                ConstraintWidget constraintWidget = this.f18505z1.get(i14);
                if (constraintWidget.B0() && !(constraintWidget instanceof f) && !(constraintWidget instanceof a) && !(constraintWidget instanceof l) && !constraintWidget.A0()) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourZ = constraintWidget.z(0);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourZ2 = constraintWidget.z(1);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (!(dimensionBehaviourZ == dimensionBehaviour4 && constraintWidget.f18296w != 1 && dimensionBehaviourZ2 == dimensionBehaviour4 && constraintWidget.f18298x != 1)) {
                        L2(0, constraintWidget, this.D1, new androidx.constraintlayout.core.widgets.analyzer.b.a(), androidx.constraintlayout.core.widgets.analyzer.b.a.f18340k);
                    }
                }
            }
        }
        if (size <= 2 || !((dimensionBehaviour3 == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour2 == dimensionBehaviour) && i.b(this.U1, 1024) && androidx.constraintlayout.core.widgets.analyzer.h.c(this, A2()))) {
            i10 = iMax2;
            i11 = iMax;
            z10 = false;
        } else {
            if (dimensionBehaviour3 == dimensionBehaviour) {
                if (iMax >= j0() || iMax <= 0) {
                    iMax = j0();
                } else {
                    W1(iMax);
                    this.W1 = true;
                }
            }
            if (dimensionBehaviour2 == dimensionBehaviour) {
                if (iMax2 >= D() || iMax2 <= 0) {
                    iMax2 = D();
                } else {
                    s1(iMax2);
                    this.X1 = true;
                }
            }
            i10 = iMax2;
            i11 = iMax;
            z10 = true;
        }
        boolean z13 = M2(64) || M2(128);
        androidx.constraintlayout.core.e eVar = this.G1;
        eVar.f17325h = false;
        eVar.f17326i = false;
        if (this.U1 != 0 && z13) {
            eVar.f17326i = true;
        }
        ArrayList<ConstraintWidget> arrayList = this.f18505z1;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourH = H();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z14 = dimensionBehaviourH == dimensionBehaviour5 || g0() == dimensionBehaviour5;
        N2();
        for (int i15 = 0; i15 < size; i15++) {
            ConstraintWidget constraintWidget2 = this.f18505z1.get(i15);
            if (constraintWidget2 instanceof m) {
                ((m) constraintWidget2).h2();
            }
        }
        boolean zM2 = M2(64);
        ?? r14 = z10;
        int i16 = 0;
        boolean zL2 = true;
        while (zL2) {
            int i17 = i16 + 1;
            try {
                this.G1.Y();
                N2();
                o(this.G1);
                for (int i18 = i13; i18 < size; i18++) {
                    this.f18505z1.get(i18).o(this.G1);
                }
                zL2 = l2(this.G1);
                WeakReference<ConstraintAnchor> weakReference = this.Z1;
                if (weakReference != null && weakReference.get() != null) {
                    q2(this.Z1.get(), this.G1.u(this.R));
                    this.Z1 = null;
                }
                WeakReference<ConstraintAnchor> weakReference2 = this.f18436b2;
                if (weakReference2 != null && weakReference2.get() != null) {
                    p2(this.f18436b2.get(), this.G1.u(this.T));
                    this.f18436b2 = null;
                }
                WeakReference<ConstraintAnchor> weakReference3 = this.f18435a2;
                if (weakReference3 != null && weakReference3.get() != null) {
                    q2(this.f18435a2.get(), this.G1.u(this.Q));
                    this.f18435a2 = null;
                }
                WeakReference<ConstraintAnchor> weakReference4 = this.f18437c2;
                if (weakReference4 != null && weakReference4.get() != null) {
                    p2(this.f18437c2.get(), this.G1.u(this.S));
                    this.f18437c2 = null;
                }
                if (zL2) {
                    this.G1.T();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                System.out.println("EXCEPTION : " + e10);
            }
            if (zL2) {
                zT2 = T2(this.G1, i.f18497n);
            } else {
                d2(this.G1, zM2);
                for (int i19 = 0; i19 < size; i19++) {
                    this.f18505z1.get(i19).d2(this.G1, zM2);
                }
                zT2 = false;
            }
            if (z14 && i17 < 8 && i.f18497n[2]) {
                int i20 = 0;
                int iMax3 = 0;
                int iMax4 = 0;
                while (i20 < size) {
                    ConstraintWidget constraintWidget3 = this.f18505z1.get(i20);
                    iMax4 = Math.max(iMax4, constraintWidget3.f18267h0 + constraintWidget3.j0());
                    iMax3 = Math.max(iMax3, constraintWidget3.f18269i0 + constraintWidget3.D());
                    i20++;
                    zT2 = zT2;
                }
                z11 = zT2;
                int iMax5 = Math.max(this.f18281o0, iMax4);
                int iMax6 = Math.max(this.f18283p0, iMax3);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                r14 = r14;
                if (dimensionBehaviour3 == dimensionBehaviour6 && j0() < iMax5) {
                    r14 = r14;
                    W1(iMax5);
                    this.f18255b0[0] = dimensionBehaviour6;
                    r14 = 1;
                    z11 = true;
                }
                if (dimensionBehaviour2 == dimensionBehaviour6 && D() < iMax6) {
                    s1(iMax6);
                    this.f18255b0[1] = dimensionBehaviour6;
                    r14 = 1;
                    z11 = true;
                }
            } else {
                z11 = zT2;
            }
            int iMax7 = Math.max(this.f18281o0, j0());
            ?? r15 = r14;
            if (iMax7 > j0()) {
                W1(iMax7);
                this.f18255b0[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                r15 = 1;
                z11 = true;
            }
            int iMax8 = Math.max(this.f18283p0, D());
            if (iMax8 > D()) {
                s1(iMax8);
                r10 = 1;
                this.f18255b0[1] = ConstraintWidget.DimensionBehaviour.FIXED;
                r11 = 1;
                z11 = true;
            } else {
                r10 = 1;
                r11 = r15;
            }
            if (r11 == 0) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = this.f18255b0[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour7 == dimensionBehaviour8 && i11 > 0) {
                    r11 = r11;
                    if (j0() > i11) {
                        this.W1 = r10;
                        this.f18255b0[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                        W1(i11);
                        ?? r12 = r10;
                        z11 = r12 == true ? 1 : 0;
                        r11 = r12;
                    }
                }
                r11 = r11;
                r11 = r11;
                if (this.f18255b0[r10] != dimensionBehaviour8 || i10 <= 0 || D() <= i10) {
                    r13 = r11;
                    z12 = z11;
                    i12 = 8;
                } else {
                    this.X1 = r10;
                    this.f18255b0[r10] = ConstraintWidget.DimensionBehaviour.FIXED;
                    s1(i10);
                    i12 = 8;
                    z12 = true;
                    r13 = 1;
                }
            } else {
                r13 = r11;
                z12 = z11;
                i12 = 8;
            }
            zL2 = i17 > i12 ? false : z12;
            i16 = i17;
            i13 = 0;
            r14 = r13;
        }
        this.f18505z1 = arrayList;
        if (r14 != 0) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = this.f18255b0;
            dimensionBehaviourArr2[0] = dimensionBehaviour3;
            dimensionBehaviourArr2[1] = dimensionBehaviour2;
        }
        S0(this.G1.G());
    }

    void k2(ConstraintWidget constraintWidget, int i10) {
        if (i10 == 0) {
            m2(constraintWidget);
        } else if (i10 == 1) {
            r2(constraintWidget);
        }
    }

    public boolean l2(androidx.constraintlayout.core.e eVar) {
        boolean zM2 = M2(64);
        g(eVar, zM2);
        int size = this.f18505z1.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = this.f18505z1.get(i10);
            constraintWidget.A1(0, false);
            constraintWidget.A1(1, false);
            if (constraintWidget instanceof a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                ConstraintWidget constraintWidget2 = this.f18505z1.get(i11);
                if (constraintWidget2 instanceof a) {
                    ((a) constraintWidget2).m2();
                }
            }
        }
        this.f18438d2.clear();
        for (int i12 = 0; i12 < size; i12++) {
            ConstraintWidget constraintWidget3 = this.f18505z1.get(i12);
            if (constraintWidget3.f()) {
                if (constraintWidget3 instanceof l) {
                    this.f18438d2.add(constraintWidget3);
                } else {
                    constraintWidget3.g(eVar, zM2);
                }
            }
        }
        while (this.f18438d2.size() > 0) {
            int size2 = this.f18438d2.size();
            Iterator<ConstraintWidget> it = this.f18438d2.iterator();
            while (it.hasNext()) {
                l lVar = (l) it.next();
                if (lVar.i2(this.f18438d2)) {
                    lVar.g(eVar, zM2);
                    this.f18438d2.remove(lVar);
                    break;
                }
            }
            if (size2 == this.f18438d2.size()) {
                Iterator<ConstraintWidget> it2 = this.f18438d2.iterator();
                while (it2.hasNext()) {
                    it2.next().g(eVar, zM2);
                }
                this.f18438d2.clear();
            }
        }
        if (androidx.constraintlayout.core.e.f17313v) {
            HashSet<ConstraintWidget> hashSet = new HashSet<>();
            for (int i13 = 0; i13 < size; i13++) {
                ConstraintWidget constraintWidget4 = this.f18505z1.get(i13);
                if (!constraintWidget4.f()) {
                    hashSet.add(constraintWidget4);
                }
            }
            e(this, eVar, hashSet, H() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT ? 0 : 1, false);
            for (ConstraintWidget constraintWidget5 : hashSet) {
                i.a(this, eVar, constraintWidget5);
                constraintWidget5.g(eVar, zM2);
            }
        } else {
            for (int i14 = 0; i14 < size; i14++) {
                ConstraintWidget constraintWidget6 = this.f18505z1.get(i14);
                if (constraintWidget6 instanceof d) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget6.f18255b0;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.x1(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.S1(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    constraintWidget6.g(eVar, zM2);
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.x1(dimensionBehaviour);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.S1(dimensionBehaviour2);
                    }
                } else {
                    i.a(this, eVar, constraintWidget6);
                    if (!constraintWidget6.f()) {
                        constraintWidget6.g(eVar, zM2);
                    }
                }
            }
        }
        if (this.L1 > 0) {
            b.b(this, eVar, null, 0);
        }
        if (this.M1 > 0) {
            b.b(this, eVar, null, 1);
        }
        return true;
    }

    public void n2(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f18437c2;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.f() > this.f18437c2.get().f()) {
            this.f18437c2 = new WeakReference<>(constraintAnchor);
        }
    }

    public void o2(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f18435a2;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.f() > this.f18435a2.get().f()) {
            this.f18435a2 = new WeakReference<>(constraintAnchor);
        }
    }

    void s2(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f18436b2;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.f() > this.f18436b2.get().f()) {
            this.f18436b2 = new WeakReference<>(constraintAnchor);
        }
    }

    void t2(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.Z1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.f() > this.Z1.get().f()) {
            this.Z1 = new WeakReference<>(constraintAnchor);
        }
    }

    public void u2() {
        this.B1.f(H(), g0());
    }

    public boolean v2(boolean z10) {
        return this.B1.g(z10);
    }

    public boolean w2(boolean z10) {
        return this.B1.h(z10);
    }

    public boolean x2(boolean z10, int i10) {
        return this.B1.i(z10, i10);
    }

    public void y2(androidx.constraintlayout.core.f fVar) {
        this.F1 = fVar;
        this.G1.F(fVar);
    }

    public ArrayList<f> z2() {
        ArrayList<f> arrayList = new ArrayList<>();
        int size = this.f18505z1.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = this.f18505z1.get(i10);
            if (constraintWidget instanceof f) {
                f fVar = (f) constraintWidget;
                if (fVar.g2() == 0) {
                    arrayList.add(fVar);
                }
            }
        }
        return arrayList;
    }
}
