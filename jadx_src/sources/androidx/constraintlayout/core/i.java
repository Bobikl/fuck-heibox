package androidx.constraintlayout.core;

import java.util.Arrays;

/* JADX INFO: compiled from: SolverVariableValues.java */
/* JADX INFO: loaded from: classes.dex */
public class i implements b.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final boolean f17378n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final boolean f17379o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static float f17380p = 0.001f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17381a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f17382b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f17383c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f17384d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int[] f17385e = new int[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int[] f17386f = new int[16];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float[] f17387g = new float[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int[] f17388h = new int[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int[] f17389i = new int[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f17390j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f17391k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b f17392l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final c f17393m;

    i(b bVar, c cVar) {
        this.f17392l = bVar;
        this.f17393m = cVar;
        clear();
    }

    private void a(SolverVariable solverVariable, int i10) {
        int[] iArr;
        int i11 = solverVariable.f17266d % this.f17383c;
        int[] iArr2 = this.f17384d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f17385e;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                } else {
                    i12 = i13;
                }
            }
            iArr[i12] = i10;
        }
        this.f17385e[i10] = -1;
    }

    private void b(int i10, SolverVariable solverVariable, float f10) {
        this.f17386f[i10] = solverVariable.f17266d;
        this.f17387g[i10] = f10;
        this.f17388h[i10] = -1;
        this.f17389i[i10] = -1;
        solverVariable.a(this.f17392l);
        solverVariable.f17276n++;
        this.f17390j++;
    }

    private void c() {
        for (int i10 = 0; i10 < this.f17383c; i10++) {
            if (this.f17384d[i10] != -1) {
                String str = hashCode() + " hash [" + i10 + "] => ";
                int i11 = this.f17384d[i10];
                boolean z10 = false;
                while (!z10) {
                    str = str + " " + this.f17386f[i11];
                    int i12 = this.f17385e[i11];
                    if (i12 != -1) {
                        i11 = i12;
                    } else {
                        z10 = true;
                    }
                }
                System.out.println(str);
            }
        }
    }

    private int r() {
        for (int i10 = 0; i10 < this.f17382b; i10++) {
            if (this.f17386f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    private void s() {
        int i10 = this.f17382b * 2;
        this.f17386f = Arrays.copyOf(this.f17386f, i10);
        this.f17387g = Arrays.copyOf(this.f17387g, i10);
        this.f17388h = Arrays.copyOf(this.f17388h, i10);
        this.f17389i = Arrays.copyOf(this.f17389i, i10);
        this.f17385e = Arrays.copyOf(this.f17385e, i10);
        for (int i11 = this.f17382b; i11 < i10; i11++) {
            this.f17386f[i11] = -1;
            this.f17385e[i11] = -1;
        }
        this.f17382b = i10;
    }

    private void t(int i10, SolverVariable solverVariable, float f10) {
        int iR = r();
        b(iR, solverVariable, f10);
        if (i10 != -1) {
            this.f17388h[iR] = i10;
            int[] iArr = this.f17389i;
            iArr[iR] = iArr[i10];
            iArr[i10] = iR;
        } else {
            this.f17388h[iR] = -1;
            if (this.f17390j > 0) {
                this.f17389i[iR] = this.f17391k;
                this.f17391k = iR;
            } else {
                this.f17389i[iR] = -1;
            }
        }
        int i11 = this.f17389i[iR];
        if (i11 != -1) {
            this.f17388h[i11] = iR;
        }
        a(solverVariable, iR);
    }

    private void u(SolverVariable solverVariable) {
        int[] iArr;
        int i10;
        int i11 = solverVariable.f17266d;
        int i12 = i11 % this.f17383c;
        int[] iArr2 = this.f17384d;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            return;
        }
        if (this.f17386f[i13] == i11) {
            int[] iArr3 = this.f17385e;
            iArr2[i12] = iArr3[i13];
            iArr3[i13] = -1;
            return;
        }
        while (true) {
            iArr = this.f17385e;
            i10 = iArr[i13];
            if (i10 == -1 || this.f17386f[i10] == i11) {
                break;
            } else {
                i13 = i10;
            }
        }
        if (i10 == -1 || this.f17386f[i10] != i11) {
            return;
        }
        iArr[i13] = iArr[i10];
        iArr[i10] = -1;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void clear() {
        int i10 = this.f17390j;
        for (int i11 = 0; i11 < i10; i11++) {
            SolverVariable solverVariableG = g(i11);
            if (solverVariableG != null) {
                solverVariableG.g(this.f17392l);
            }
        }
        for (int i12 = 0; i12 < this.f17382b; i12++) {
            this.f17386f[i12] = -1;
            this.f17385e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f17383c; i13++) {
            this.f17384d[i13] = -1;
        }
        this.f17390j = 0;
        this.f17391k = -1;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int d() {
        return this.f17390j;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int e(SolverVariable solverVariable) {
        if (this.f17390j != 0 && solverVariable != null) {
            int i10 = solverVariable.f17266d;
            int i11 = this.f17384d[i10 % this.f17383c];
            if (i11 == -1) {
                return -1;
            }
            if (this.f17386f[i11] == i10) {
                return i11;
            }
            do {
                i11 = this.f17385e[i11];
                if (i11 == -1) {
                    break;
                }
            } while (this.f17386f[i11] != i10);
            if (i11 != -1 && this.f17386f[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.b.a
    public boolean f(SolverVariable solverVariable) {
        return e(solverVariable) != -1;
    }

    @Override // androidx.constraintlayout.core.b.a
    public SolverVariable g(int i10) {
        int i11 = this.f17390j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f17391k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f17393m.f17308d[this.f17386f[i12]];
            }
            i12 = this.f17389i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void h(SolverVariable solverVariable, float f10) {
        float f11 = f17380p;
        if (f10 > (-f11) && f10 < f11) {
            m(solverVariable, true);
            return;
        }
        if (this.f17390j == 0) {
            b(0, solverVariable, f10);
            a(solverVariable, 0);
            this.f17391k = 0;
            return;
        }
        int iE = e(solverVariable);
        if (iE != -1) {
            this.f17387g[iE] = f10;
            return;
        }
        if (this.f17390j + 1 >= this.f17382b) {
            s();
        }
        int i10 = this.f17390j;
        int i11 = this.f17391k;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = this.f17386f[i11];
            int i15 = solverVariable.f17266d;
            if (i14 == i15) {
                this.f17387g[i11] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i11;
            }
            i11 = this.f17389i[i11];
            if (i11 == -1) {
                break;
            }
        }
        t(i12, solverVariable, f10);
    }

    @Override // androidx.constraintlayout.core.b.a
    public float i(SolverVariable solverVariable) {
        int iE = e(solverVariable);
        if (iE != -1) {
            return this.f17387g[iE];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void j(float f10) {
        int i10 = this.f17390j;
        int i11 = this.f17391k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f17387g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f17389i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public void k(SolverVariable solverVariable, float f10, boolean z10) {
        float f11 = f17380p;
        if (f10 <= (-f11) || f10 >= f11) {
            int iE = e(solverVariable);
            if (iE == -1) {
                h(solverVariable, f10);
                return;
            }
            float[] fArr = this.f17387g;
            float f12 = fArr[iE] + f10;
            fArr[iE] = f12;
            float f13 = f17380p;
            if (f12 <= (-f13) || f12 >= f13) {
                return;
            }
            fArr[iE] = 0.0f;
            m(solverVariable, z10);
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public void l() {
        int i10 = this.f17390j;
        int i11 = this.f17391k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f17387g;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f17389i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public float m(SolverVariable solverVariable, boolean z10) {
        int iE = e(solverVariable);
        if (iE == -1) {
            return 0.0f;
        }
        u(solverVariable);
        float f10 = this.f17387g[iE];
        if (this.f17391k == iE) {
            this.f17391k = this.f17389i[iE];
        }
        this.f17386f[iE] = -1;
        int[] iArr = this.f17388h;
        int i10 = iArr[iE];
        if (i10 != -1) {
            int[] iArr2 = this.f17389i;
            iArr2[i10] = iArr2[iE];
        }
        int i11 = this.f17389i[iE];
        if (i11 != -1) {
            iArr[i11] = iArr[iE];
        }
        this.f17390j--;
        solverVariable.f17276n--;
        if (z10) {
            solverVariable.g(this.f17392l);
        }
        return f10;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int n() {
        return 0;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void o() {
        int i10 = this.f17390j;
        System.out.print("{ ");
        for (int i11 = 0; i11 < i10; i11++) {
            SolverVariable solverVariableG = g(i11);
            if (solverVariableG != null) {
                System.out.print(solverVariableG + " = " + q(i11) + " ");
            }
        }
        System.out.println(" }");
    }

    @Override // androidx.constraintlayout.core.b.a
    public float p(b bVar, boolean z10) {
        float fI = i(bVar.f17299a);
        m(bVar.f17299a, z10);
        i iVar = (i) bVar.f17303e;
        int iD = iVar.d();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iD) {
            int i12 = iVar.f17386f[i11];
            if (i12 != -1) {
                k(this.f17393m.f17308d[i12], iVar.f17387g[i11] * fI, z10);
                i10++;
            }
            i11++;
        }
        return fI;
    }

    @Override // androidx.constraintlayout.core.b.a
    public float q(int i10) {
        int i11 = this.f17390j;
        int i12 = this.f17391k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f17387g[i12];
            }
            i12 = this.f17389i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i10 = this.f17390j;
        for (int i11 = 0; i11 < i10; i11++) {
            SolverVariable solverVariableG = g(i11);
            if (solverVariableG != null) {
                String str2 = str + solverVariableG + " = " + q(i11) + " ";
                int iE = e(solverVariableG);
                String str3 = str2 + "[p: ";
                String str4 = (this.f17388h[iE] != -1 ? str3 + this.f17393m.f17308d[this.f17386f[this.f17388h[iE]]] : str3 + "none") + ", n: ";
                str = (this.f17389i[iE] != -1 ? str4 + this.f17393m.f17308d[this.f17386f[this.f17389i[iE]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
