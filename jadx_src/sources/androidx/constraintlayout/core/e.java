package androidx.constraintlayout.core;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: LinearSystem.java */
/* JADX INFO: loaded from: classes.dex */
public class e {
    public static boolean A = false;
    private static int B = 1000;
    public static f C = null;
    public static long D = 0;
    public static long E = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final boolean f17309r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final boolean f17310s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final boolean f17311t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final boolean f17312u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f17313v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static boolean f17314w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static boolean f17315x = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static boolean f17316y = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static boolean f17317z = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f17321d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    androidx.constraintlayout.core.b[] f17324g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final c f17331n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private a f17334q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17318a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f17319b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<String, SolverVariable> f17320c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f17322e = 32;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f17323f = 32;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17325h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17326i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean[] f17327j = new boolean[32];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f17328k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f17329l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f17330m = 32;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private SolverVariable[] f17332o = new SolverVariable[B];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f17333p = 0;

    /* JADX INFO: compiled from: LinearSystem.java */
    public interface a {
        void a(e eVar, SolverVariable solverVariable, boolean z10);

        void b(e eVar, androidx.constraintlayout.core.b bVar, boolean z10);

        SolverVariable c(e eVar, boolean[] zArr);

        void clear();

        void d(e eVar);

        void e(a aVar);

        void f(SolverVariable solverVariable);

        SolverVariable getKey();

        boolean isEmpty();
    }

    /* JADX INFO: compiled from: LinearSystem.java */
    public class b extends androidx.constraintlayout.core.b {
        public b(c cVar) {
            this.f17303e = new i(this, cVar);
        }
    }

    public e() {
        this.f17324g = null;
        this.f17324g = new androidx.constraintlayout.core.b[32];
        W();
        c cVar = new c();
        this.f17331n = cVar;
        this.f17321d = new h(cVar);
        if (A) {
            this.f17334q = new b(cVar);
        } else {
            this.f17334q = new androidx.constraintlayout.core.b(cVar);
        }
    }

    private void A() {
        B();
        String str = "";
        for (int i10 = 0; i10 < this.f17329l; i10++) {
            str = (str + this.f17324g[i10]) + "\n";
        }
        System.out.println(str + this.f17321d + "\n");
    }

    private void B() {
        System.out.println("Display Rows (" + this.f17329l + "x" + this.f17328k + ")\n");
    }

    private int E(a aVar) throws Exception {
        boolean z10;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f17329l) {
                z10 = false;
                break;
            }
            androidx.constraintlayout.core.b bVar = this.f17324g[i10];
            if (bVar.f17299a.f17273k != SolverVariable.Type.UNRESTRICTED && bVar.f17300b < 0.0f) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (!z10) {
            return 0;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            f fVar = C;
            if (fVar != null) {
                fVar.f17350o++;
            }
            i11++;
            float f10 = Float.MAX_VALUE;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            for (int i15 = 0; i15 < this.f17329l; i15++) {
                androidx.constraintlayout.core.b bVar2 = this.f17324g[i15];
                if (bVar2.f17299a.f17273k != SolverVariable.Type.UNRESTRICTED && !bVar2.f17304f && bVar2.f17300b < 0.0f) {
                    int i16 = 9;
                    if (f17317z) {
                        int iD = bVar2.f17303e.d();
                        int i17 = 0;
                        while (i17 < iD) {
                            SolverVariable solverVariableG = bVar2.f17303e.g(i17);
                            float fI = bVar2.f17303e.i(solverVariableG);
                            if (fI > 0.0f) {
                                int i18 = 0;
                                while (i18 < i16) {
                                    float f11 = solverVariableG.f17271i[i18] / fI;
                                    if ((f11 < f10 && i18 == i14) || i18 > i14) {
                                        i13 = solverVariableG.f17266d;
                                        i14 = i18;
                                        i12 = i15;
                                        f10 = f11;
                                    }
                                    i18++;
                                    i16 = 9;
                                }
                            }
                            i17++;
                            i16 = 9;
                        }
                    } else {
                        for (int i19 = 1; i19 < this.f17328k; i19++) {
                            SolverVariable solverVariable = this.f17331n.f17308d[i19];
                            float fI2 = bVar2.f17303e.i(solverVariable);
                            if (fI2 > 0.0f) {
                                for (int i20 = 0; i20 < 9; i20++) {
                                    float f12 = solverVariable.f17271i[i20] / fI2;
                                    if ((f12 < f10 && i20 == i14) || i20 > i14) {
                                        i13 = i19;
                                        i14 = i20;
                                        i12 = i15;
                                        f10 = f12;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i12 != -1) {
                androidx.constraintlayout.core.b bVar3 = this.f17324g[i12];
                bVar3.f17299a.f17267e = -1;
                f fVar2 = C;
                if (fVar2 != null) {
                    fVar2.f17349n++;
                }
                bVar3.C(this.f17331n.f17308d[i13]);
                SolverVariable solverVariable2 = bVar3.f17299a;
                solverVariable2.f17267e = i12;
                solverVariable2.n(this, bVar3);
            } else {
                z11 = true;
            }
            if (i11 > this.f17328k / 2) {
                z11 = true;
            }
        }
        return i11;
    }

    private String H(int i10) {
        int i11 = i10 * 4;
        int i12 = i11 / 1024;
        int i13 = i12 / 1024;
        if (i13 > 0) {
            return "" + i13 + " Mb";
        }
        if (i12 > 0) {
            return "" + i12 + " Kb";
        }
        return "" + i11 + " bytes";
    }

    private String I(int i10) {
        if (i10 == 1) {
            return "LOW";
        }
        if (i10 == 2) {
            return "MEDIUM";
        }
        if (i10 == 3) {
            return "HIGH";
        }
        if (i10 == 4) {
            return "HIGHEST";
        }
        if (i10 == 5) {
            return "EQUALITY";
        }
        if (i10 == 8) {
            return "FIXED";
        }
        return i10 == 6 ? "BARRIER" : "NONE";
    }

    public static f L() {
        return C;
    }

    private void S() {
        int i10 = this.f17322e * 2;
        this.f17322e = i10;
        this.f17324g = (androidx.constraintlayout.core.b[]) Arrays.copyOf(this.f17324g, i10);
        c cVar = this.f17331n;
        cVar.f17308d = (SolverVariable[]) Arrays.copyOf(cVar.f17308d, this.f17322e);
        int i11 = this.f17322e;
        this.f17327j = new boolean[i11];
        this.f17323f = i11;
        this.f17330m = i11;
        f fVar = C;
        if (fVar != null) {
            fVar.f17343h++;
            fVar.f17355t = Math.max(fVar.f17355t, i11);
            f fVar2 = C;
            fVar2.J = fVar2.f17355t;
        }
    }

    private final int V(a aVar, boolean z10) {
        f fVar = C;
        if (fVar != null) {
            fVar.f17347l++;
        }
        for (int i10 = 0; i10 < this.f17328k; i10++) {
            this.f17327j[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            f fVar2 = C;
            if (fVar2 != null) {
                fVar2.f17348m++;
            }
            i11++;
            if (i11 >= this.f17328k * 2) {
                return i11;
            }
            if (aVar.getKey() != null) {
                this.f17327j[aVar.getKey().f17266d] = true;
            }
            SolverVariable solverVariableC = aVar.c(this, this.f17327j);
            if (solverVariableC != null) {
                boolean[] zArr = this.f17327j;
                int i12 = solverVariableC.f17266d;
                if (zArr[i12]) {
                    return i11;
                }
                zArr[i12] = true;
            }
            if (solverVariableC != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f17329l; i14++) {
                    androidx.constraintlayout.core.b bVar = this.f17324g[i14];
                    if (bVar.f17299a.f17273k != SolverVariable.Type.UNRESTRICTED && !bVar.f17304f && bVar.y(solverVariableC)) {
                        float fI = bVar.f17303e.i(solverVariableC);
                        if (fI < 0.0f) {
                            float f11 = (-bVar.f17300b) / fI;
                            if (f11 < f10) {
                                i13 = i14;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    androidx.constraintlayout.core.b bVar2 = this.f17324g[i13];
                    bVar2.f17299a.f17267e = -1;
                    f fVar3 = C;
                    if (fVar3 != null) {
                        fVar3.f17349n++;
                    }
                    bVar2.C(solverVariableC);
                    SolverVariable solverVariable = bVar2.f17299a;
                    solverVariable.f17267e = i13;
                    solverVariable.n(this, bVar2);
                }
            } else {
                z11 = true;
            }
        }
        return i11;
    }

    private void W() {
        int i10 = 0;
        if (A) {
            while (i10 < this.f17329l) {
                androidx.constraintlayout.core.b bVar = this.f17324g[i10];
                if (bVar != null) {
                    this.f17331n.f17305a.b(bVar);
                }
                this.f17324g[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f17329l) {
            androidx.constraintlayout.core.b bVar2 = this.f17324g[i10];
            if (bVar2 != null) {
                this.f17331n.f17306b.b(bVar2);
            }
            this.f17324g[i10] = null;
            i10++;
        }
    }

    private SolverVariable a(SolverVariable.Type type, String str) {
        SolverVariable solverVariableA = this.f17331n.f17307c.a();
        if (solverVariableA == null) {
            solverVariableA = new SolverVariable(type, str);
            solverVariableA.l(type, str);
        } else {
            solverVariableA.h();
            solverVariableA.l(type, str);
        }
        int i10 = this.f17333p;
        int i11 = B;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            B = i12;
            this.f17332o = (SolverVariable[]) Arrays.copyOf(this.f17332o, i12);
        }
        SolverVariable[] solverVariableArr = this.f17332o;
        int i13 = this.f17333p;
        this.f17333p = i13 + 1;
        solverVariableArr[i13] = solverVariableA;
        return solverVariableA;
    }

    private void g(androidx.constraintlayout.core.b bVar) {
        bVar.g(this, 0);
    }

    private final void m(androidx.constraintlayout.core.b bVar) {
        int i10;
        if (f17315x && bVar.f17304f) {
            bVar.f17299a.i(this, bVar.f17300b);
        } else {
            androidx.constraintlayout.core.b[] bVarArr = this.f17324g;
            int i11 = this.f17329l;
            bVarArr[i11] = bVar;
            SolverVariable solverVariable = bVar.f17299a;
            solverVariable.f17267e = i11;
            this.f17329l = i11 + 1;
            solverVariable.n(this, bVar);
        }
        if (f17315x && this.f17318a) {
            int i12 = 0;
            while (i12 < this.f17329l) {
                if (this.f17324g[i12] == null) {
                    System.out.println("WTF");
                }
                androidx.constraintlayout.core.b bVar2 = this.f17324g[i12];
                if (bVar2 != null && bVar2.f17304f) {
                    bVar2.f17299a.i(this, bVar2.f17300b);
                    if (A) {
                        this.f17331n.f17305a.b(bVar2);
                    } else {
                        this.f17331n.f17306b.b(bVar2);
                    }
                    this.f17324g[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f17329l;
                        if (i13 >= i10) {
                            break;
                        }
                        androidx.constraintlayout.core.b[] bVarArr2 = this.f17324g;
                        int i15 = i13 - 1;
                        androidx.constraintlayout.core.b bVar3 = bVarArr2[i13];
                        bVarArr2[i15] = bVar3;
                        SolverVariable solverVariable2 = bVar3.f17299a;
                        if (solverVariable2.f17267e == i13) {
                            solverVariable2.f17267e = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f17324g[i14] = null;
                    }
                    this.f17329l = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f17318a = false;
        }
    }

    private void n(androidx.constraintlayout.core.b bVar, int i10) {
        o(bVar, i10, 0);
    }

    private void r() {
        for (int i10 = 0; i10 < this.f17329l; i10++) {
            androidx.constraintlayout.core.b bVar = this.f17324g[i10];
            bVar.f17299a.f17269g = bVar.f17300b;
        }
    }

    public static androidx.constraintlayout.core.b w(e eVar, SolverVariable solverVariable, SolverVariable solverVariable2, float f10) {
        return eVar.v().m(solverVariable, solverVariable2, f10);
    }

    private SolverVariable y(String str, SolverVariable.Type type) {
        f fVar = C;
        if (fVar != null) {
            fVar.f17351p++;
        }
        if (this.f17328k + 1 >= this.f17323f) {
            S();
        }
        SolverVariable solverVariableA = a(type, null);
        solverVariableA.j(str);
        int i10 = this.f17319b + 1;
        this.f17319b = i10;
        this.f17328k++;
        solverVariableA.f17266d = i10;
        if (this.f17320c == null) {
            this.f17320c = new HashMap<>();
        }
        this.f17320c.put(str, solverVariableA);
        this.f17331n.f17308d[this.f17319b] = solverVariableA;
        return solverVariableA;
    }

    void C() {
        int iE = 0;
        for (int i10 = 0; i10 < this.f17322e; i10++) {
            androidx.constraintlayout.core.b bVar = this.f17324g[i10];
            if (bVar != null) {
                iE += bVar.E();
            }
        }
        int iE2 = 0;
        for (int i11 = 0; i11 < this.f17329l; i11++) {
            androidx.constraintlayout.core.b bVar2 = this.f17324g[i11];
            if (bVar2 != null) {
                iE2 += bVar2.E();
            }
        }
        PrintStream printStream = System.out;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Linear System -> Table size: ");
        sb2.append(this.f17322e);
        sb2.append(" (");
        int i12 = this.f17322e;
        sb2.append(H(i12 * i12));
        sb2.append(") -- row sizes: ");
        sb2.append(H(iE));
        sb2.append(", actual size: ");
        sb2.append(H(iE2));
        sb2.append(" rows: ");
        sb2.append(this.f17329l);
        sb2.append("/");
        sb2.append(this.f17330m);
        sb2.append(" cols: ");
        sb2.append(this.f17328k);
        sb2.append("/");
        sb2.append(this.f17323f);
        sb2.append(" ");
        sb2.append(0);
        sb2.append(" occupied cells, ");
        sb2.append(H(0));
        printStream.println(sb2.toString());
    }

    public void D() {
        B();
        String str = "";
        for (int i10 = 0; i10 < this.f17329l; i10++) {
            if (this.f17324g[i10].f17299a.f17273k == SolverVariable.Type.UNRESTRICTED) {
                str = (str + this.f17324g[i10].F()) + "\n";
            }
        }
        System.out.println(str + this.f17321d + "\n");
    }

    public void F(f fVar) {
        C = fVar;
    }

    public c G() {
        return this.f17331n;
    }

    a J() {
        return this.f17321d;
    }

    public int K() {
        int iE = 0;
        for (int i10 = 0; i10 < this.f17329l; i10++) {
            androidx.constraintlayout.core.b bVar = this.f17324g[i10];
            if (bVar != null) {
                iE += bVar.E();
            }
        }
        return iE;
    }

    public int M() {
        return this.f17329l;
    }

    public int N() {
        return this.f17319b;
    }

    public int O(Object obj) {
        SolverVariable solverVariableJ = ((ConstraintAnchor) obj).j();
        if (solverVariableJ != null) {
            return (int) (solverVariableJ.f17269g + 0.5f);
        }
        return 0;
    }

    androidx.constraintlayout.core.b P(int i10) {
        return this.f17324g[i10];
    }

    float Q(String str) {
        SolverVariable solverVariableR = R(str, SolverVariable.Type.UNRESTRICTED);
        if (solverVariableR == null) {
            return 0.0f;
        }
        return solverVariableR.f17269g;
    }

    SolverVariable R(String str, SolverVariable.Type type) {
        if (this.f17320c == null) {
            this.f17320c = new HashMap<>();
        }
        SolverVariable solverVariable = this.f17320c.get(str);
        return solverVariable == null ? y(str, type) : solverVariable;
    }

    public void T() throws Exception {
        f fVar = C;
        if (fVar != null) {
            fVar.f17344i++;
        }
        if (this.f17321d.isEmpty()) {
            r();
            return;
        }
        if (!this.f17325h && !this.f17326i) {
            U(this.f17321d);
            return;
        }
        f fVar2 = C;
        if (fVar2 != null) {
            fVar2.f17357v++;
        }
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f17329l) {
                z10 = true;
                break;
            } else if (!this.f17324g[i10].f17304f) {
                break;
            } else {
                i10++;
            }
        }
        if (!z10) {
            U(this.f17321d);
            return;
        }
        f fVar3 = C;
        if (fVar3 != null) {
            fVar3.f17356u++;
        }
        r();
    }

    void U(a aVar) throws Exception {
        f fVar = C;
        if (fVar != null) {
            fVar.f17361z++;
            fVar.A = Math.max(fVar.A, this.f17328k);
            f fVar2 = C;
            fVar2.B = Math.max(fVar2.B, this.f17329l);
        }
        E(aVar);
        V(aVar, false);
        r();
    }

    public void X(androidx.constraintlayout.core.b bVar) {
        SolverVariable solverVariable;
        int i10;
        if (!bVar.f17304f || (solverVariable = bVar.f17299a) == null) {
            return;
        }
        int i11 = solverVariable.f17267e;
        if (i11 != -1) {
            while (true) {
                i10 = this.f17329l;
                if (i11 >= i10 - 1) {
                    break;
                }
                androidx.constraintlayout.core.b[] bVarArr = this.f17324g;
                int i12 = i11 + 1;
                androidx.constraintlayout.core.b bVar2 = bVarArr[i12];
                SolverVariable solverVariable2 = bVar2.f17299a;
                if (solverVariable2.f17267e == i12) {
                    solverVariable2.f17267e = i11;
                }
                bVarArr[i11] = bVar2;
                i11 = i12;
            }
            this.f17329l = i10 - 1;
        }
        SolverVariable solverVariable3 = bVar.f17299a;
        if (!solverVariable3.f17270h) {
            solverVariable3.i(this, bVar.f17300b);
        }
        if (A) {
            this.f17331n.f17305a.b(bVar);
        } else {
            this.f17331n.f17306b.b(bVar);
        }
    }

    public void Y() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f17331n;
            SolverVariable[] solverVariableArr = cVar.f17308d;
            if (i10 >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i10];
            if (solverVariable != null) {
                solverVariable.h();
            }
            i10++;
        }
        cVar.f17307c.c(this.f17332o, this.f17333p);
        this.f17333p = 0;
        Arrays.fill(this.f17331n.f17308d, (Object) null);
        HashMap<String, SolverVariable> map = this.f17320c;
        if (map != null) {
            map.clear();
        }
        this.f17319b = 0;
        this.f17321d.clear();
        this.f17328k = 1;
        for (int i11 = 0; i11 < this.f17329l; i11++) {
            androidx.constraintlayout.core.b bVar = this.f17324g[i11];
            if (bVar != null) {
                bVar.f17301c = false;
            }
        }
        W();
        this.f17329l = 0;
        if (A) {
            this.f17334q = new b(this.f17331n);
        } else {
            this.f17334q = new androidx.constraintlayout.core.b(this.f17331n);
        }
    }

    public void b(ConstraintWidget constraintWidget, ConstraintWidget constraintWidget2, float f10, int i10) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
        SolverVariable solverVariableU = u(constraintWidget.r(type));
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
        SolverVariable solverVariableU2 = u(constraintWidget.r(type2));
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
        SolverVariable solverVariableU3 = u(constraintWidget.r(type3));
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
        SolverVariable solverVariableU4 = u(constraintWidget.r(type4));
        SolverVariable solverVariableU5 = u(constraintWidget2.r(type));
        SolverVariable solverVariableU6 = u(constraintWidget2.r(type2));
        SolverVariable solverVariableU7 = u(constraintWidget2.r(type3));
        SolverVariable solverVariableU8 = u(constraintWidget2.r(type4));
        androidx.constraintlayout.core.b bVarV = v();
        double d10 = f10;
        double d11 = i10;
        bVarV.v(solverVariableU2, solverVariableU4, solverVariableU6, solverVariableU8, (float) (Math.sin(d10) * d11));
        d(bVarV);
        androidx.constraintlayout.core.b bVarV2 = v();
        bVarV2.v(solverVariableU, solverVariableU3, solverVariableU5, solverVariableU7, (float) (Math.cos(d10) * d11));
        d(bVarV2);
    }

    public void c(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, float f10, SolverVariable solverVariable3, SolverVariable solverVariable4, int i11, int i12) {
        androidx.constraintlayout.core.b bVarV = v();
        bVarV.k(solverVariable, solverVariable2, i10, f10, solverVariable3, solverVariable4, i11);
        if (i12 != 8) {
            bVarV.g(this, i12);
        }
        d(bVarV);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0098  */
    public void d(androidx.constraintlayout.core.b bVar) {
        SolverVariable solverVariableA;
        if (bVar == null) {
            return;
        }
        f fVar = C;
        if (fVar != null) {
            fVar.f17345j++;
            if (bVar.f17304f) {
                fVar.f17346k++;
            }
        }
        boolean z10 = true;
        if (this.f17329l + 1 >= this.f17330m || this.f17328k + 1 >= this.f17323f) {
            S();
        }
        boolean z11 = false;
        if (!bVar.f17304f) {
            bVar.d(this);
            if (bVar.isEmpty()) {
                return;
            }
            bVar.w();
            if (bVar.i(this)) {
                SolverVariable solverVariableT = t();
                bVar.f17299a = solverVariableT;
                int i10 = this.f17329l;
                m(bVar);
                if (this.f17329l == i10 + 1) {
                    this.f17334q.e(bVar);
                    V(this.f17334q, true);
                    if (solverVariableT.f17267e == -1) {
                        if (bVar.f17299a == solverVariableT && (solverVariableA = bVar.A(solverVariableT)) != null) {
                            f fVar2 = C;
                            if (fVar2 != null) {
                                fVar2.f17349n++;
                            }
                            bVar.C(solverVariableA);
                        }
                        if (!bVar.f17304f) {
                            bVar.f17299a.n(this, bVar);
                        }
                        if (A) {
                            this.f17331n.f17305a.b(bVar);
                        } else {
                            this.f17331n.f17306b.b(bVar);
                        }
                        this.f17329l--;
                    }
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (!bVar.x()) {
                return;
            } else {
                z11 = z10;
            }
        }
        if (z11) {
            return;
        }
        m(bVar);
    }

    public androidx.constraintlayout.core.b e(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, int i11) {
        if (f17314w && i11 == 8 && solverVariable2.f17270h && solverVariable.f17267e == -1) {
            solverVariable.i(this, solverVariable2.f17269g + i10);
            return null;
        }
        androidx.constraintlayout.core.b bVarV = v();
        bVarV.r(solverVariable, solverVariable2, i10);
        if (i11 != 8) {
            bVarV.g(this, i11);
        }
        d(bVarV);
        return bVarV;
    }

    public void f(SolverVariable solverVariable, int i10) {
        if (f17314w && solverVariable.f17267e == -1) {
            float f10 = i10;
            solverVariable.i(this, f10);
            for (int i11 = 0; i11 < this.f17319b + 1; i11++) {
                SolverVariable solverVariable2 = this.f17331n.f17308d[i11];
                if (solverVariable2 != null && solverVariable2.f17277o && solverVariable2.f17278p == solverVariable.f17266d) {
                    solverVariable2.i(this, solverVariable2.f17279q + f10);
                }
            }
            return;
        }
        int i12 = solverVariable.f17267e;
        if (i12 == -1) {
            androidx.constraintlayout.core.b bVarV = v();
            bVarV.l(solverVariable, i10);
            d(bVarV);
            return;
        }
        androidx.constraintlayout.core.b bVar = this.f17324g[i12];
        if (bVar.f17304f) {
            bVar.f17300b = i10;
            return;
        }
        if (bVar.f17303e.d() == 0) {
            bVar.f17304f = true;
            bVar.f17300b = i10;
        } else {
            androidx.constraintlayout.core.b bVarV2 = v();
            bVarV2.q(solverVariable, i10);
            d(bVarV2);
        }
    }

    public void h(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, boolean z10) {
        androidx.constraintlayout.core.b bVarV = v();
        SolverVariable solverVariableX = x();
        solverVariableX.f17268f = 0;
        bVarV.t(solverVariable, solverVariable2, solverVariableX, i10);
        d(bVarV);
    }

    public void i(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, int i11) {
        androidx.constraintlayout.core.b bVarV = v();
        SolverVariable solverVariableX = x();
        solverVariableX.f17268f = 0;
        bVarV.t(solverVariable, solverVariable2, solverVariableX, i10);
        if (i11 != 8) {
            o(bVarV, (int) (bVarV.f17303e.i(solverVariableX) * (-1.0f)), i11);
        }
        d(bVarV);
    }

    public void j(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, boolean z10) {
        androidx.constraintlayout.core.b bVarV = v();
        SolverVariable solverVariableX = x();
        solverVariableX.f17268f = 0;
        bVarV.u(solverVariable, solverVariable2, solverVariableX, i10);
        d(bVarV);
    }

    public void k(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, int i11) {
        androidx.constraintlayout.core.b bVarV = v();
        SolverVariable solverVariableX = x();
        solverVariableX.f17268f = 0;
        bVarV.u(solverVariable, solverVariable2, solverVariableX, i10);
        if (i11 != 8) {
            o(bVarV, (int) (bVarV.f17303e.i(solverVariableX) * (-1.0f)), i11);
        }
        d(bVarV);
    }

    public void l(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f10, int i10) {
        androidx.constraintlayout.core.b bVarV = v();
        bVarV.n(solverVariable, solverVariable2, solverVariable3, solverVariable4, f10);
        if (i10 != 8) {
            bVarV.g(this, i10);
        }
        d(bVarV);
    }

    void o(androidx.constraintlayout.core.b bVar, int i10, int i11) {
        bVar.h(s(i11, null), i10);
    }

    public void p(SolverVariable solverVariable, SolverVariable solverVariable2, int i10) {
        if (solverVariable.f17267e != -1 || i10 != 0) {
            e(solverVariable, solverVariable2, i10, 8);
            return;
        }
        if (solverVariable2.f17277o) {
            solverVariable2 = this.f17331n.f17308d[solverVariable2.f17278p];
        }
        if (solverVariable.f17277o) {
            SolverVariable solverVariable3 = this.f17331n.f17308d[solverVariable.f17278p];
        } else {
            solverVariable.k(this, solverVariable2, 0.0f);
        }
    }

    final void q() {
        int i10;
        int i11 = 0;
        while (i11 < this.f17329l) {
            androidx.constraintlayout.core.b bVar = this.f17324g[i11];
            if (bVar.f17303e.d() == 0) {
                bVar.f17304f = true;
            }
            if (bVar.f17304f) {
                SolverVariable solverVariable = bVar.f17299a;
                solverVariable.f17269g = bVar.f17300b;
                solverVariable.g(bVar);
                int i12 = i11;
                while (true) {
                    i10 = this.f17329l;
                    if (i12 >= i10 - 1) {
                        break;
                    }
                    androidx.constraintlayout.core.b[] bVarArr = this.f17324g;
                    int i13 = i12 + 1;
                    bVarArr[i12] = bVarArr[i13];
                    i12 = i13;
                }
                this.f17324g[i10 - 1] = null;
                this.f17329l = i10 - 1;
                i11--;
                if (A) {
                    this.f17331n.f17305a.b(bVar);
                } else {
                    this.f17331n.f17306b.b(bVar);
                }
            }
            i11++;
        }
    }

    public SolverVariable s(int i10, String str) {
        f fVar = C;
        if (fVar != null) {
            fVar.f17352q++;
        }
        if (this.f17328k + 1 >= this.f17323f) {
            S();
        }
        SolverVariable solverVariableA = a(SolverVariable.Type.ERROR, str);
        int i11 = this.f17319b + 1;
        this.f17319b = i11;
        this.f17328k++;
        solverVariableA.f17266d = i11;
        solverVariableA.f17268f = i10;
        this.f17331n.f17308d[i11] = solverVariableA;
        this.f17321d.f(solverVariableA);
        return solverVariableA;
    }

    public SolverVariable t() {
        f fVar = C;
        if (fVar != null) {
            fVar.f17354s++;
        }
        if (this.f17328k + 1 >= this.f17323f) {
            S();
        }
        SolverVariable solverVariableA = a(SolverVariable.Type.SLACK, null);
        int i10 = this.f17319b + 1;
        this.f17319b = i10;
        this.f17328k++;
        solverVariableA.f17266d = i10;
        this.f17331n.f17308d[i10] = solverVariableA;
        return solverVariableA;
    }

    public SolverVariable u(Object obj) {
        SolverVariable solverVariableJ = null;
        if (obj == null) {
            return null;
        }
        if (this.f17328k + 1 >= this.f17323f) {
            S();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariableJ = constraintAnchor.j();
            if (solverVariableJ == null) {
                constraintAnchor.z(this.f17331n);
                solverVariableJ = constraintAnchor.j();
            }
            int i10 = solverVariableJ.f17266d;
            if (i10 == -1 || i10 > this.f17319b || this.f17331n.f17308d[i10] == null) {
                if (i10 != -1) {
                    solverVariableJ.h();
                }
                int i11 = this.f17319b + 1;
                this.f17319b = i11;
                this.f17328k++;
                solverVariableJ.f17266d = i11;
                solverVariableJ.f17273k = SolverVariable.Type.UNRESTRICTED;
                this.f17331n.f17308d[i11] = solverVariableJ;
            }
        }
        return solverVariableJ;
    }

    public androidx.constraintlayout.core.b v() {
        androidx.constraintlayout.core.b bVarA;
        if (A) {
            bVarA = this.f17331n.f17305a.a();
            if (bVarA == null) {
                bVarA = new b(this.f17331n);
                E++;
            } else {
                bVarA.D();
            }
        } else {
            bVarA = this.f17331n.f17306b.a();
            if (bVarA == null) {
                bVarA = new androidx.constraintlayout.core.b(this.f17331n);
                D++;
            } else {
                bVarA.D();
            }
        }
        SolverVariable.f();
        return bVarA;
    }

    public SolverVariable x() {
        f fVar = C;
        if (fVar != null) {
            fVar.f17353r++;
        }
        if (this.f17328k + 1 >= this.f17323f) {
            S();
        }
        SolverVariable solverVariableA = a(SolverVariable.Type.SLACK, null);
        int i10 = this.f17319b + 1;
        this.f17319b = i10;
        this.f17328k++;
        solverVariableA.f17266d = i10;
        this.f17331n.f17308d[i10] = solverVariableA;
        return solverVariableA;
    }

    public void z() {
        B();
        String str = " num vars " + this.f17319b + "\n";
        for (int i10 = 0; i10 < this.f17319b + 1; i10++) {
            SolverVariable solverVariable = this.f17331n.f17308d[i10];
            if (solverVariable != null && solverVariable.f17270h) {
                str = str + " $[" + i10 + "] => " + solverVariable + " = " + solverVariable.f17269g + "\n";
            }
        }
        String str2 = str + "\n";
        for (int i11 = 0; i11 < this.f17319b + 1; i11++) {
            SolverVariable[] solverVariableArr = this.f17331n.f17308d;
            SolverVariable solverVariable2 = solverVariableArr[i11];
            if (solverVariable2 != null && solverVariable2.f17277o) {
                str2 = str2 + " ~[" + i11 + "] => " + solverVariable2 + " = " + solverVariableArr[solverVariable2.f17278p] + " + " + solverVariable2.f17279q + "\n";
            }
        }
        String str3 = str2 + "\n\n #  ";
        for (int i12 = 0; i12 < this.f17329l; i12++) {
            str3 = (str3 + this.f17324g[i12].F()) + "\n #  ";
        }
        if (this.f17321d != null) {
            str3 = str3 + "Goal: " + this.f17321d + "\n";
        }
        System.out.println(str3);
    }
}
