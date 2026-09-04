package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* JADX INFO: compiled from: BasicMeasure.java */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f18329d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f18330e = 30;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f18331f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f18332g = 1073741824;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f18333h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f18334i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f18335j = -2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f18336k = -3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<ConstraintWidget> f18337a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f18338b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.d f18339c;

    /* JADX INFO: compiled from: BasicMeasure.java */
    public static class a {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static int f18340k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static int f18341l = 1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static int f18342m = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f18343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f18344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18345c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f18346d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f18347e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f18348f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f18349g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f18350h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f18351i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f18352j;
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BasicMeasure.java */
    public interface InterfaceC0110b {
        void a();

        void b(ConstraintWidget constraintWidget, a aVar);
    }

    public b(androidx.constraintlayout.core.widgets.d dVar) {
        this.f18339c = dVar;
    }

    private boolean a(InterfaceC0110b interfaceC0110b, ConstraintWidget constraintWidget, int i10) {
        this.f18338b.f18343a = constraintWidget.H();
        this.f18338b.f18344b = constraintWidget.g0();
        this.f18338b.f18345c = constraintWidget.j0();
        this.f18338b.f18346d = constraintWidget.D();
        a aVar = this.f18338b;
        aVar.f18351i = false;
        aVar.f18352j = i10;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.f18343a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z10 = dimensionBehaviour == dimensionBehaviour2;
        boolean z11 = aVar.f18344b == dimensionBehaviour2;
        boolean z12 = z10 && constraintWidget.f18263f0 > 0.0f;
        boolean z13 = z11 && constraintWidget.f18263f0 > 0.0f;
        if (z12 && constraintWidget.f18300y[0] == 4) {
            aVar.f18343a = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z13 && constraintWidget.f18300y[1] == 4) {
            aVar.f18344b = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        interfaceC0110b.b(constraintWidget, aVar);
        constraintWidget.W1(this.f18338b.f18347e);
        constraintWidget.s1(this.f18338b.f18348f);
        constraintWidget.r1(this.f18338b.f18350h);
        constraintWidget.a1(this.f18338b.f18349g);
        a aVar2 = this.f18338b;
        aVar2.f18352j = a.f18340k;
        return aVar2.f18351i;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0098 A[PHI: r10
  0x0098: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:32:0x0062, B:34:0x0068, B:36:0x006c, B:54:0x0095, B:52:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    private void b(androidx.constraintlayout.core.widgets.d dVar) {
        boolean z10;
        k kVar;
        m mVar;
        int size = dVar.f18505z1.size();
        boolean zM2 = dVar.M2(64);
        InterfaceC0110b interfaceC0110bA2 = dVar.A2();
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = dVar.f18505z1.get(i10);
            if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.f) && !(constraintWidget instanceof androidx.constraintlayout.core.widgets.a) && !constraintWidget.A0() && (!zM2 || (kVar = constraintWidget.f18260e) == null || (mVar = constraintWidget.f18262f) == null || !kVar.f18322e.f18315j || !mVar.f18322e.f18315j)) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviourZ = constraintWidget.z(0);
                ConstraintWidget.DimensionBehaviour dimensionBehaviourZ2 = constraintWidget.z(1);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                boolean z11 = dimensionBehaviourZ == dimensionBehaviour && constraintWidget.f18296w != 1 && dimensionBehaviourZ2 == dimensionBehaviour && constraintWidget.f18298x != 1;
                if (!z11 && dVar.M2(1) && !(constraintWidget instanceof androidx.constraintlayout.core.widgets.l)) {
                    if (dimensionBehaviourZ == dimensionBehaviour && constraintWidget.f18296w == 0 && dimensionBehaviourZ2 != dimensionBehaviour && !constraintWidget.x0()) {
                        z11 = true;
                    }
                    if (dimensionBehaviourZ2 == dimensionBehaviour && constraintWidget.f18298x == 0 && dimensionBehaviourZ != dimensionBehaviour && !constraintWidget.x0()) {
                        z11 = true;
                    }
                    z10 = (!(dimensionBehaviourZ == dimensionBehaviour || dimensionBehaviourZ2 == dimensionBehaviour) || constraintWidget.f18263f0 <= 0.0f) ? z11 : true;
                }
                if (!z10) {
                    a(interfaceC0110bA2, constraintWidget, a.f18340k);
                    androidx.constraintlayout.core.f fVar = dVar.F1;
                    if (fVar != null) {
                        fVar.f17338c++;
                    }
                }
            }
        }
        interfaceC0110bA2.a();
    }

    private void c(androidx.constraintlayout.core.widgets.d dVar, String str, int i10, int i11, int i12) {
        int iQ = dVar.Q();
        int iP = dVar.P();
        dVar.J1(0);
        dVar.I1(0);
        dVar.W1(i11);
        dVar.s1(i12);
        dVar.J1(iQ);
        dVar.I1(iP);
        this.f18339c.R2(i10);
        this.f18339c.h2();
    }

    public long d(androidx.constraintlayout.core.widgets.d dVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean zX2;
        int i19;
        int i20;
        boolean z10;
        int i21;
        InterfaceC0110b interfaceC0110b;
        boolean z11;
        androidx.constraintlayout.core.f fVar;
        InterfaceC0110b interfaceC0110bA2 = dVar.A2();
        int size = dVar.f18505z1.size();
        int iJ0 = dVar.j0();
        int iD = dVar.D();
        boolean zB = androidx.constraintlayout.core.widgets.i.b(i10, 128);
        boolean z12 = zB || androidx.constraintlayout.core.widgets.i.b(i10, 64);
        if (z12) {
            for (int i22 = 0; i22 < size; i22++) {
                ConstraintWidget constraintWidget = dVar.f18505z1.get(i22);
                ConstraintWidget.DimensionBehaviour dimensionBehaviourH = constraintWidget.H();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                boolean z13 = (dimensionBehaviourH == dimensionBehaviour) && (constraintWidget.g0() == dimensionBehaviour) && constraintWidget.A() > 0.0f;
                if ((constraintWidget.x0() && z13) || ((constraintWidget.z0() && z13) || (constraintWidget instanceof androidx.constraintlayout.core.widgets.l) || constraintWidget.x0() || constraintWidget.z0())) {
                    z12 = false;
                    break;
                }
            }
        }
        if (z12 && (fVar = androidx.constraintlayout.core.e.C) != null) {
            fVar.f17340e++;
        }
        boolean z14 = z12 & ((i13 == 1073741824 && i15 == 1073741824) || zB);
        int i23 = 2;
        if (z14) {
            int iMin = Math.min(dVar.O(), i14);
            int iMin2 = Math.min(dVar.N(), i16);
            if (i13 == 1073741824 && dVar.j0() != iMin) {
                dVar.W1(iMin);
                dVar.F2();
            }
            if (i15 == 1073741824 && dVar.D() != iMin2) {
                dVar.s1(iMin2);
                dVar.F2();
            }
            if (i13 == 1073741824 && i15 == 1073741824) {
                zX2 = dVar.v2(zB);
                i19 = 2;
            } else {
                boolean zW2 = dVar.w2(zB);
                if (i13 == 1073741824) {
                    zW2 &= dVar.x2(zB, 0);
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                if (i15 == 1073741824) {
                    zX2 = dVar.x2(zB, 1) & zW2;
                    i19++;
                } else {
                    zX2 = zW2;
                }
            }
            if (zX2) {
                dVar.c2(i13 == 1073741824, i15 == 1073741824);
            }
        } else {
            zX2 = false;
            i19 = 0;
        }
        if (zX2 && i19 == 2) {
            return 0L;
        }
        int iB2 = dVar.B2();
        if (size > 0) {
            b(dVar);
        }
        e(dVar);
        int size2 = this.f18337a.size();
        if (size > 0) {
            c(dVar, "First pass", 0, iJ0, iD);
        }
        if (size2 > 0) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviourH2 = dVar.H();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            boolean z15 = dimensionBehaviourH2 == dimensionBehaviour2;
            boolean z16 = dVar.g0() == dimensionBehaviour2;
            int iMax = Math.max(dVar.j0(), this.f18339c.Q());
            int iMax2 = Math.max(dVar.D(), this.f18339c.P());
            int i24 = 0;
            boolean zS2 = false;
            while (i24 < size2) {
                ConstraintWidget constraintWidget2 = this.f18337a.get(i24);
                if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.l) {
                    int iJ1 = constraintWidget2.j0();
                    int iD2 = constraintWidget2.D();
                    boolean zA = a(interfaceC0110bA2, constraintWidget2, a.f18341l) | zS2;
                    androidx.constraintlayout.core.f fVar2 = dVar.F1;
                    if (fVar2 != null) {
                        fVar2.f17339d++;
                    }
                    int iJ2 = constraintWidget2.j0();
                    int iD3 = constraintWidget2.D();
                    if (iJ2 != iJ1) {
                        constraintWidget2.W1(iJ2);
                        if (z15 && constraintWidget2.X() > iMax) {
                            iMax = Math.max(iMax, constraintWidget2.X() + constraintWidget2.r(ConstraintAnchor.Type.RIGHT).g());
                        }
                        z11 = true;
                    } else {
                        z11 = zA;
                    }
                    if (iD3 != iD2) {
                        constraintWidget2.s1(iD3);
                        if (z16 && constraintWidget2.v() > iMax2) {
                            iMax2 = Math.max(iMax2, constraintWidget2.v() + constraintWidget2.r(ConstraintAnchor.Type.BOTTOM).g());
                        }
                        z11 = true;
                    }
                    zS2 = z11 | ((androidx.constraintlayout.core.widgets.l) constraintWidget2).s2();
                }
                i24++;
                iB2 = iB2;
                iD = iD;
                iJ0 = iJ0;
                i23 = 2;
            }
            int i25 = iB2;
            int i26 = iJ0;
            int i27 = iD;
            int i28 = i23;
            int i29 = 0;
            while (i29 < i28) {
                int i30 = 0;
                while (i30 < size2) {
                    ConstraintWidget constraintWidget3 = this.f18337a.get(i30);
                    if (((constraintWidget3 instanceof androidx.constraintlayout.core.widgets.g) && !(constraintWidget3 instanceof androidx.constraintlayout.core.widgets.l)) || (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.f) || constraintWidget3.i0() == 8 || ((z14 && constraintWidget3.f18260e.f18322e.f18315j && constraintWidget3.f18262f.f18322e.f18315j) || (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.l))) {
                        z10 = z14;
                        i21 = size2;
                        interfaceC0110b = interfaceC0110bA2;
                    } else {
                        int iJ3 = constraintWidget3.j0();
                        int iD4 = constraintWidget3.D();
                        int iT = constraintWidget3.t();
                        int i31 = a.f18341l;
                        z10 = z14;
                        if (i29 == 1) {
                            i31 = a.f18342m;
                        }
                        boolean zA2 = a(interfaceC0110bA2, constraintWidget3, i31) | zS2;
                        androidx.constraintlayout.core.f fVar3 = dVar.F1;
                        i21 = size2;
                        interfaceC0110b = interfaceC0110bA2;
                        if (fVar3 != null) {
                            fVar3.f17339d++;
                        }
                        int iJ4 = constraintWidget3.j0();
                        int iD5 = constraintWidget3.D();
                        if (iJ4 != iJ3) {
                            constraintWidget3.W1(iJ4);
                            if (z15 && constraintWidget3.X() > iMax) {
                                iMax = Math.max(iMax, constraintWidget3.X() + constraintWidget3.r(ConstraintAnchor.Type.RIGHT).g());
                            }
                            zA2 = true;
                        }
                        if (iD5 != iD4) {
                            constraintWidget3.s1(iD5);
                            if (z16 && constraintWidget3.v() > iMax2) {
                                iMax2 = Math.max(iMax2, constraintWidget3.v() + constraintWidget3.r(ConstraintAnchor.Type.BOTTOM).g());
                            }
                            zA2 = true;
                        }
                        zS2 = (!constraintWidget3.n0() || iT == constraintWidget3.t()) ? zA2 : true;
                    }
                    i30++;
                    interfaceC0110bA2 = interfaceC0110b;
                    z14 = z10;
                    size2 = i21;
                }
                boolean z17 = z14;
                int i32 = size2;
                InterfaceC0110b interfaceC0110b2 = interfaceC0110bA2;
                if (!zS2) {
                    break;
                }
                i29++;
                c(dVar, "intermediate pass", i29, i26, i27);
                interfaceC0110bA2 = interfaceC0110b2;
                z14 = z17;
                size2 = i32;
                i28 = 2;
                zS2 = false;
            }
            i20 = i25;
        } else {
            i20 = iB2;
        }
        dVar.P2(i20);
        return 0L;
    }

    public void e(androidx.constraintlayout.core.widgets.d dVar) {
        this.f18337a.clear();
        int size = dVar.f18505z1.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = dVar.f18505z1.get(i10);
            ConstraintWidget.DimensionBehaviour dimensionBehaviourH = constraintWidget.H();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviourH == dimensionBehaviour || constraintWidget.g0() == dimensionBehaviour) {
                this.f18337a.add(constraintWidget);
            }
        }
        dVar.F2();
    }
}
