package androidx.constraintlayout.core;

import java.util.Arrays;

/* JADX INFO: compiled from: ArrayLinkedVariables.java */
/* JADX INFO: loaded from: classes.dex */
public class a implements b.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final boolean f17282l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final int f17283m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final boolean f17284n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static float f17285o = 0.001f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f17287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final c f17288c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f17286a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f17289d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SolverVariable f17290e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f17291f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int[] f17292g = new int[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float[] f17293h = new float[8];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f17294i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f17295j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f17296k = false;

    a(b bVar, c cVar) {
        this.f17287b = bVar;
        this.f17288c = cVar;
    }

    public int a() {
        return this.f17294i;
    }

    public final int b(int i10) {
        return this.f17291f[i10];
    }

    public final int c(int i10) {
        return this.f17292g[i10];
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void clear() {
        int i10 = this.f17294i;
        for (int i11 = 0; i10 != -1 && i11 < this.f17286a; i11++) {
            SolverVariable solverVariable = this.f17288c.f17308d[this.f17291f[i10]];
            if (solverVariable != null) {
                solverVariable.g(this.f17287b);
            }
            i10 = this.f17292g[i10];
        }
        this.f17294i = -1;
        this.f17295j = -1;
        this.f17296k = false;
        this.f17286a = 0;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int d() {
        return this.f17286a;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int e(SolverVariable solverVariable) {
        int i10 = this.f17294i;
        if (i10 == -1) {
            return -1;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f17286a; i11++) {
            if (this.f17291f[i10] == solverVariable.f17266d) {
                return i10;
            }
            i10 = this.f17292g[i10];
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.b.a
    public boolean f(SolverVariable solverVariable) {
        int i10 = this.f17294i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f17286a; i11++) {
            if (this.f17291f[i10] == solverVariable.f17266d) {
                return true;
            }
            i10 = this.f17292g[i10];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.b.a
    public SolverVariable g(int i10) {
        int i11 = this.f17294i;
        for (int i12 = 0; i11 != -1 && i12 < this.f17286a; i12++) {
            if (i12 == i10) {
                return this.f17288c.f17308d[this.f17291f[i11]];
            }
            i11 = this.f17292g[i11];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void h(SolverVariable solverVariable, float f10) {
        if (f10 == 0.0f) {
            m(solverVariable, true);
            return;
        }
        int i10 = this.f17294i;
        if (i10 == -1) {
            this.f17294i = 0;
            this.f17293h[0] = f10;
            this.f17291f[0] = solverVariable.f17266d;
            this.f17292g[0] = -1;
            solverVariable.f17276n++;
            solverVariable.a(this.f17287b);
            this.f17286a++;
            if (this.f17296k) {
                return;
            }
            int i11 = this.f17295j + 1;
            this.f17295j = i11;
            int[] iArr = this.f17291f;
            if (i11 >= iArr.length) {
                this.f17296k = true;
                this.f17295j = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f17286a; i13++) {
            int i14 = this.f17291f[i10];
            int i15 = solverVariable.f17266d;
            if (i14 == i15) {
                this.f17293h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f17292g[i10];
        }
        int length = this.f17295j;
        int i16 = length + 1;
        if (this.f17296k) {
            int[] iArr2 = this.f17291f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f17291f;
        if (length >= iArr3.length && this.f17286a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f17291f;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    length = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f17291f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f17289d * 2;
            this.f17289d = i18;
            this.f17296k = false;
            this.f17295j = length - 1;
            this.f17293h = Arrays.copyOf(this.f17293h, i18);
            this.f17291f = Arrays.copyOf(this.f17291f, this.f17289d);
            this.f17292g = Arrays.copyOf(this.f17292g, this.f17289d);
        }
        this.f17291f[length] = solverVariable.f17266d;
        this.f17293h[length] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f17292g;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f17292g[length] = this.f17294i;
            this.f17294i = length;
        }
        solverVariable.f17276n++;
        solverVariable.a(this.f17287b);
        int i19 = this.f17286a + 1;
        this.f17286a = i19;
        if (!this.f17296k) {
            this.f17295j++;
        }
        int[] iArr7 = this.f17291f;
        if (i19 >= iArr7.length) {
            this.f17296k = true;
        }
        if (this.f17295j >= iArr7.length) {
            this.f17296k = true;
            this.f17295j = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float i(SolverVariable solverVariable) {
        int i10 = this.f17294i;
        for (int i11 = 0; i10 != -1 && i11 < this.f17286a; i11++) {
            if (this.f17291f[i10] == solverVariable.f17266d) {
                return this.f17293h[i10];
            }
            i10 = this.f17292g[i10];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void j(float f10) {
        int i10 = this.f17294i;
        for (int i11 = 0; i10 != -1 && i11 < this.f17286a; i11++) {
            float[] fArr = this.f17293h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f17292g[i10];
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public void k(SolverVariable solverVariable, float f10, boolean z10) {
        float f11 = f17285o;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f17294i;
            if (i10 == -1) {
                this.f17294i = 0;
                this.f17293h[0] = f10;
                this.f17291f[0] = solverVariable.f17266d;
                this.f17292g[0] = -1;
                solverVariable.f17276n++;
                solverVariable.a(this.f17287b);
                this.f17286a++;
                if (this.f17296k) {
                    return;
                }
                int i11 = this.f17295j + 1;
                this.f17295j = i11;
                int[] iArr = this.f17291f;
                if (i11 >= iArr.length) {
                    this.f17296k = true;
                    this.f17295j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f17286a; i13++) {
                int i14 = this.f17291f[i10];
                int i15 = solverVariable.f17266d;
                if (i14 == i15) {
                    float[] fArr = this.f17293h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f17285o;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f17294i) {
                            this.f17294i = this.f17292g[i10];
                        } else {
                            int[] iArr2 = this.f17292g;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            solverVariable.g(this.f17287b);
                        }
                        if (this.f17296k) {
                            this.f17295j = i10;
                        }
                        solverVariable.f17276n--;
                        this.f17286a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f17292g[i10];
            }
            int length = this.f17295j;
            int i16 = length + 1;
            if (this.f17296k) {
                int[] iArr3 = this.f17291f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f17291f;
            if (length >= iArr4.length && this.f17286a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f17291f;
                    if (i17 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i17] == -1) {
                        length = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f17291f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f17289d * 2;
                this.f17289d = i18;
                this.f17296k = false;
                this.f17295j = length - 1;
                this.f17293h = Arrays.copyOf(this.f17293h, i18);
                this.f17291f = Arrays.copyOf(this.f17291f, this.f17289d);
                this.f17292g = Arrays.copyOf(this.f17292g, this.f17289d);
            }
            this.f17291f[length] = solverVariable.f17266d;
            this.f17293h[length] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f17292g;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f17292g[length] = this.f17294i;
                this.f17294i = length;
            }
            solverVariable.f17276n++;
            solverVariable.a(this.f17287b);
            this.f17286a++;
            if (!this.f17296k) {
                this.f17295j++;
            }
            int i19 = this.f17295j;
            int[] iArr8 = this.f17291f;
            if (i19 >= iArr8.length) {
                this.f17296k = true;
                this.f17295j = iArr8.length - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public void l() {
        int i10 = this.f17294i;
        for (int i11 = 0; i10 != -1 && i11 < this.f17286a; i11++) {
            float[] fArr = this.f17293h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f17292g[i10];
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float m(SolverVariable solverVariable, boolean z10) {
        if (this.f17290e == solverVariable) {
            this.f17290e = null;
        }
        int i10 = this.f17294i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f17286a) {
            if (this.f17291f[i10] == solverVariable.f17266d) {
                if (i10 == this.f17294i) {
                    this.f17294i = this.f17292g[i10];
                } else {
                    int[] iArr = this.f17292g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    solverVariable.g(this.f17287b);
                }
                solverVariable.f17276n--;
                this.f17286a--;
                this.f17291f[i10] = -1;
                if (this.f17296k) {
                    this.f17295j = i10;
                }
                return this.f17293h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f17292g[i10];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public int n() {
        return (this.f17291f.length * 4 * 3) + 0 + 36;
    }

    @Override // androidx.constraintlayout.core.b.a
    public void o() {
        int i10 = this.f17286a;
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
        b.a aVar = bVar.f17303e;
        int iD = aVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            SolverVariable solverVariableG = aVar.g(i10);
            k(solverVariableG, aVar.i(solverVariableG) * fI, z10);
        }
        return fI;
    }

    @Override // androidx.constraintlayout.core.b.a
    public float q(int i10) {
        int i11 = this.f17294i;
        for (int i12 = 0; i11 != -1 && i12 < this.f17286a; i12++) {
            if (i12 == i10) {
                return this.f17293h[i11];
            }
            i11 = this.f17292g[i11];
        }
        return 0.0f;
    }

    SolverVariable r() {
        SolverVariable solverVariable = this.f17290e;
        if (solverVariable != null) {
            return solverVariable;
        }
        int i10 = this.f17294i;
        SolverVariable solverVariable2 = null;
        for (int i11 = 0; i10 != -1 && i11 < this.f17286a; i11++) {
            if (this.f17293h[i10] < 0.0f) {
                SolverVariable solverVariable3 = this.f17288c.f17308d[this.f17291f[i10]];
                if (solverVariable2 == null || solverVariable2.f17268f < solverVariable3.f17268f) {
                    solverVariable2 = solverVariable3;
                }
            }
            i10 = this.f17292g[i10];
        }
        return solverVariable2;
    }

    public final float s(int i10) {
        return this.f17293h[i10];
    }

    boolean t() {
        int i10 = this.f17294i;
        for (int i11 = 0; i10 != -1 && i11 < this.f17286a; i11++) {
            if (this.f17293h[i10] > 0.0f) {
                return true;
            }
            i10 = this.f17292g[i10];
        }
        return false;
    }

    public String toString() {
        int i10 = this.f17294i;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f17286a; i11++) {
            str = ((str + " -> ") + this.f17293h[i10] + " : ") + this.f17288c.f17308d[this.f17291f[i10]];
            i10 = this.f17292g[i10];
        }
        return str;
    }
}
