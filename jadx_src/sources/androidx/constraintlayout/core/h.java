package androidx.constraintlayout.core;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: PriorityGoalRow.java */
/* JADX INFO: loaded from: classes.dex */
public class h extends androidx.constraintlayout.core.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float f17365o = 1.0E-4f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final boolean f17366p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final int f17367q = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f17368i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SolverVariable[] f17369j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private SolverVariable[] f17370k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f17371l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    b f17372m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    c f17373n;

    /* JADX INFO: compiled from: PriorityGoalRow.java */
    public class a implements Comparator<SolverVariable> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(SolverVariable solverVariable, SolverVariable solverVariable2) {
            return solverVariable.f17266d - solverVariable2.f17266d;
        }
    }

    /* JADX INFO: compiled from: PriorityGoalRow.java */
    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        SolverVariable f17375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        h f17376b;

        public b(h hVar) {
            this.f17376b = hVar;
        }

        public void a(SolverVariable solverVariable) {
            for (int i10 = 0; i10 < 9; i10++) {
                float[] fArr = this.f17375a.f17272j;
                float f10 = fArr[i10] + solverVariable.f17272j[i10];
                fArr[i10] = f10;
                if (Math.abs(f10) < 1.0E-4f) {
                    this.f17375a.f17272j[i10] = 0.0f;
                }
            }
        }

        public boolean b(SolverVariable solverVariable, float f10) {
            boolean z10 = true;
            if (!this.f17375a.f17264b) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float f11 = solverVariable.f17272j[i10];
                    if (f11 != 0.0f) {
                        float f12 = f11 * f10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        this.f17375a.f17272j[i10] = f12;
                    } else {
                        this.f17375a.f17272j[i10] = 0.0f;
                    }
                }
                return true;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float[] fArr = this.f17375a.f17272j;
                float f13 = fArr[i11] + (solverVariable.f17272j[i11] * f10);
                fArr[i11] = f13;
                if (Math.abs(f13) < 1.0E-4f) {
                    this.f17375a.f17272j[i11] = 0.0f;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                h.this.J(this.f17375a);
            }
            return false;
        }

        public void c(SolverVariable solverVariable) {
            this.f17375a = solverVariable;
        }

        public final boolean d() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f17375a.f17272j[i10];
                if (f10 > 0.0f) {
                    return false;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean e() {
            for (int i10 = 0; i10 < 9; i10++) {
                if (this.f17375a.f17272j[i10] != 0.0f) {
                    return false;
                }
            }
            return true;
        }

        public final boolean f(SolverVariable solverVariable) {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = solverVariable.f17272j[i10];
                float f11 = this.f17375a.f17272j[i10];
                if (f11 != f10) {
                    if (f11 < f10) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void g() {
            Arrays.fill(this.f17375a.f17272j, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f17375a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f17375a.f17272j[i10] + " ";
                }
            }
            return str + "] " + this.f17375a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f17368i = 128;
        this.f17369j = new SolverVariable[128];
        this.f17370k = new SolverVariable[128];
        this.f17371l = 0;
        this.f17372m = new b(this);
        this.f17373n = cVar;
    }

    private final void I(SolverVariable solverVariable) {
        int i10;
        int i11 = this.f17371l + 1;
        SolverVariable[] solverVariableArr = this.f17369j;
        if (i11 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.f17369j = solverVariableArr2;
            this.f17370k = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.f17369j;
        int i12 = this.f17371l;
        solverVariableArr3[i12] = solverVariable;
        int i13 = i12 + 1;
        this.f17371l = i13;
        if (i13 > 1 && solverVariableArr3[i13 - 1].f17266d > solverVariable.f17266d) {
            int i14 = 0;
            while (true) {
                i10 = this.f17371l;
                if (i14 >= i10) {
                    break;
                }
                this.f17370k[i14] = this.f17369j[i14];
                i14++;
            }
            Arrays.sort(this.f17370k, 0, i10, new a());
            for (int i15 = 0; i15 < this.f17371l; i15++) {
                this.f17369j[i15] = this.f17370k[i15];
            }
        }
        solverVariable.f17264b = true;
        solverVariable.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(SolverVariable solverVariable) {
        int i10 = 0;
        while (i10 < this.f17371l) {
            if (this.f17369j[i10] == solverVariable) {
                while (true) {
                    int i11 = this.f17371l;
                    if (i10 >= i11 - 1) {
                        this.f17371l = i11 - 1;
                        solverVariable.f17264b = false;
                        return;
                    } else {
                        SolverVariable[] solverVariableArr = this.f17369j;
                        int i12 = i10 + 1;
                        solverVariableArr[i10] = solverVariableArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.e.a
    public void b(e eVar, androidx.constraintlayout.core.b bVar, boolean z10) {
        SolverVariable solverVariable = bVar.f17299a;
        if (solverVariable == null) {
            return;
        }
        androidx.constraintlayout.core.b.a aVar = bVar.f17303e;
        int iD = aVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            SolverVariable solverVariableG = aVar.g(i10);
            float fQ = aVar.q(i10);
            this.f17372m.c(solverVariableG);
            if (this.f17372m.b(solverVariable, fQ)) {
                I(solverVariableG);
            }
            this.f17300b += bVar.f17300b * fQ;
        }
        J(solverVariable);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.e.a
    public SolverVariable c(e eVar, boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f17371l; i11++) {
            SolverVariable solverVariable = this.f17369j[i11];
            if (!zArr[solverVariable.f17266d]) {
                this.f17372m.c(solverVariable);
                if (i10 == -1) {
                    if (this.f17372m.d()) {
                        i10 = i11;
                    }
                } else if (this.f17372m.f(this.f17369j[i10])) {
                    i10 = i11;
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f17369j[i10];
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.e.a
    public void clear() {
        this.f17371l = 0;
        this.f17300b = 0.0f;
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.e.a
    public void f(SolverVariable solverVariable) {
        this.f17372m.c(solverVariable);
        this.f17372m.g();
        solverVariable.f17272j[solverVariable.f17268f] = 1.0f;
        I(solverVariable);
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.e.a
    public boolean isEmpty() {
        return this.f17371l == 0;
    }

    @Override // androidx.constraintlayout.core.b
    public String toString() {
        String str = " goal -> (" + this.f17300b + ") : ";
        for (int i10 = 0; i10 < this.f17371l; i10++) {
            this.f17372m.c(this.f17369j[i10]);
            str = str + this.f17372m + " ";
        }
        return str;
    }
}
