package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: Direct.java */
/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f18366a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f18367b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f18369d = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static b.a f18368c = new b.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f18370e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f18371f = 0;

    private static boolean a(int i10, ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourH = constraintWidget.H();
        ConstraintWidget.DimensionBehaviour dimensionBehaviourG0 = constraintWidget.g0();
        androidx.constraintlayout.core.widgets.d dVar = constraintWidget.U() != null ? (androidx.constraintlayout.core.widgets.d) constraintWidget.U() : null;
        if (dVar != null) {
            dVar.H();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (dVar != null) {
            dVar.g0();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
        boolean z10 = dimensionBehaviourH == dimensionBehaviour5 || constraintWidget.C0() || dimensionBehaviourH == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviourH == (dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.f18296w == 0 && constraintWidget.f18263f0 == 0.0f && constraintWidget.o0(0)) || (dimensionBehaviourH == dimensionBehaviour2 && constraintWidget.f18296w == 1 && constraintWidget.r0(0, constraintWidget.j0()));
        boolean z11 = dimensionBehaviourG0 == dimensionBehaviour5 || constraintWidget.D0() || dimensionBehaviourG0 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviourG0 == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.f18298x == 0 && constraintWidget.f18263f0 == 0.0f && constraintWidget.o0(1)) || (dimensionBehaviourH == dimensionBehaviour && constraintWidget.f18298x == 1 && constraintWidget.r0(1, constraintWidget.D()));
        if (constraintWidget.f18263f0 <= 0.0f || !(z10 || z11)) {
            return z10 && z11;
        }
        return true;
    }

    private static void b(int i10, ConstraintWidget constraintWidget, b.InterfaceC0110b interfaceC0110b, boolean z10) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        ConstraintAnchor constraintAnchor5;
        if (constraintWidget.v0()) {
            return;
        }
        f18370e++;
        if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.d) && constraintWidget.B0()) {
            int i11 = i10 + 1;
            if (a(i11, constraintWidget)) {
                androidx.constraintlayout.core.widgets.d.L2(i11, constraintWidget, interfaceC0110b, new b.a(), b.a.f18340k);
            }
        }
        ConstraintAnchor constraintAnchorR = constraintWidget.r(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor constraintAnchorR2 = constraintWidget.r(ConstraintAnchor.Type.RIGHT);
        int iF = constraintAnchorR.f();
        int iF2 = constraintAnchorR2.f();
        if (constraintAnchorR.e() != null && constraintAnchorR.o()) {
            Iterator<ConstraintAnchor> it = constraintAnchorR.e().iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.f18220d;
                int i12 = i10 + 1;
                boolean zA = a(i12, constraintWidget2);
                if (constraintWidget2.B0() && zA) {
                    androidx.constraintlayout.core.widgets.d.L2(i12, constraintWidget2, interfaceC0110b, new b.a(), b.a.f18340k);
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviourH = constraintWidget2.H();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourH != dimensionBehaviour || zA) {
                    if (!constraintWidget2.B0()) {
                        ConstraintAnchor constraintAnchor6 = constraintWidget2.Q;
                        if (next == constraintAnchor6 && constraintWidget2.S.f18222f == null) {
                            int iG = constraintAnchor6.g() + iF;
                            constraintWidget2.k1(iG, constraintWidget2.j0() + iG);
                            b(i12, constraintWidget2, interfaceC0110b, z10);
                        } else {
                            ConstraintAnchor constraintAnchor7 = constraintWidget2.S;
                            if (next == constraintAnchor7 && constraintAnchor6.f18222f == null) {
                                int iG2 = iF - constraintAnchor7.g();
                                constraintWidget2.k1(iG2 - constraintWidget2.j0(), iG2);
                                b(i12, constraintWidget2, interfaceC0110b, z10);
                            } else if (next == constraintAnchor6 && (constraintAnchor3 = constraintAnchor7.f18222f) != null && constraintAnchor3.o() && !constraintWidget2.x0()) {
                                f(i12, interfaceC0110b, constraintWidget2, z10);
                            }
                        }
                    }
                } else if (constraintWidget2.H() == dimensionBehaviour && constraintWidget2.A >= 0 && constraintWidget2.f18302z >= 0 && (constraintWidget2.i0() == 8 || (constraintWidget2.f18296w == 0 && constraintWidget2.A() == 0.0f))) {
                    if (!constraintWidget2.x0() && !constraintWidget2.A0()) {
                        if (((next == constraintWidget2.Q && (constraintAnchor5 = constraintWidget2.S.f18222f) != null && constraintAnchor5.o()) || (next == constraintWidget2.S && (constraintAnchor4 = constraintWidget2.Q.f18222f) != null && constraintAnchor4.o())) && !constraintWidget2.x0()) {
                            g(i12, constraintWidget, interfaceC0110b, constraintWidget2, z10);
                        }
                    }
                }
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
            return;
        }
        if (constraintAnchorR2.e() != null && constraintAnchorR2.o()) {
            Iterator<ConstraintAnchor> it2 = constraintAnchorR2.e().iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.f18220d;
                int i13 = i10 + 1;
                boolean zA2 = a(i13, constraintWidget3);
                if (constraintWidget3.B0() && zA2) {
                    androidx.constraintlayout.core.widgets.d.L2(i13, constraintWidget3, interfaceC0110b, new b.a(), b.a.f18340k);
                }
                boolean z11 = (next2 == constraintWidget3.Q && (constraintAnchor2 = constraintWidget3.S.f18222f) != null && constraintAnchor2.o()) || (next2 == constraintWidget3.S && (constraintAnchor = constraintWidget3.Q.f18222f) != null && constraintAnchor.o());
                ConstraintWidget.DimensionBehaviour dimensionBehaviourH2 = constraintWidget3.H();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourH2 != dimensionBehaviour2 || zA2) {
                    if (!constraintWidget3.B0()) {
                        ConstraintAnchor constraintAnchor8 = constraintWidget3.Q;
                        if (next2 == constraintAnchor8 && constraintWidget3.S.f18222f == null) {
                            int iG3 = constraintAnchor8.g() + iF2;
                            constraintWidget3.k1(iG3, constraintWidget3.j0() + iG3);
                            b(i13, constraintWidget3, interfaceC0110b, z10);
                        } else {
                            ConstraintAnchor constraintAnchor9 = constraintWidget3.S;
                            if (next2 == constraintAnchor9 && constraintAnchor8.f18222f == null) {
                                int iG4 = iF2 - constraintAnchor9.g();
                                constraintWidget3.k1(iG4 - constraintWidget3.j0(), iG4);
                                b(i13, constraintWidget3, interfaceC0110b, z10);
                            } else if (z11 && !constraintWidget3.x0()) {
                                f(i13, interfaceC0110b, constraintWidget3, z10);
                            }
                        }
                    }
                } else if (constraintWidget3.H() == dimensionBehaviour2 && constraintWidget3.A >= 0 && constraintWidget3.f18302z >= 0 && (constraintWidget3.i0() == 8 || (constraintWidget3.f18296w == 0 && constraintWidget3.A() == 0.0f))) {
                    if (!constraintWidget3.x0() && !constraintWidget3.A0() && z11 && !constraintWidget3.x0()) {
                        g(i13, constraintWidget, interfaceC0110b, constraintWidget3, z10);
                    }
                }
            }
        }
        constraintWidget.J0();
    }

    public static String c(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
        sb2.append("+-(" + i10 + ") ");
        return sb2.toString();
    }

    private static void d(int i10, androidx.constraintlayout.core.widgets.a aVar, b.InterfaceC0110b interfaceC0110b, int i11, boolean z10) {
        if (aVar.g2()) {
            if (i11 == 0) {
                b(i10 + 1, aVar, interfaceC0110b, z10);
            } else {
                k(i10 + 1, aVar, interfaceC0110b);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:107:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:112:0x01dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x01df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x01e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:116:0x0204  */
    /* JADX WARN: Code duplicated, block: B:118:0x0225 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:120:0x0227 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:78:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0122  */
    /* JADX WARN: Code duplicated, block: B:80:0x0127  */
    /* JADX WARN: Code duplicated, block: B:83:0x0135  */
    /* JADX WARN: Code duplicated, block: B:84:0x013e  */
    /* JADX WARN: Code duplicated, block: B:87:0x014f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0151  */
    /* JADX WARN: Code duplicated, block: B:90:0x0157  */
    /* JADX WARN: Code duplicated, block: B:92:0x015f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0161  */
    /* JADX WARN: Code duplicated, block: B:94:0x016c  */
    /* JADX WARN: Code duplicated, block: B:96:0x017a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0185  */
    /* JADX WARN: Code duplicated, block: B:99:0x019a  */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    public static boolean e(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.core.e eVar, int i10, int i11, androidx.constraintlayout.core.widgets.c cVar, boolean z10, boolean z11, boolean z12) {
        int iF;
        int iF2;
        int iF3;
        int i12;
        int iG;
        ConstraintWidget constraintWidget;
        boolean z13;
        ?? r10;
        int iG2;
        int iD;
        ConstraintAnchor constraintAnchor;
        ConstraintWidget constraintWidget2;
        ConstraintAnchor constraintAnchor2;
        float fD0;
        int i13;
        if (z12) {
            return false;
        }
        if (i10 == 0) {
            if (!dVar.C0()) {
                return false;
            }
        } else if (!dVar.D0()) {
            return false;
        }
        boolean zI2 = dVar.I2();
        ConstraintWidget constraintWidgetC = cVar.c();
        ConstraintWidget constraintWidgetG = cVar.g();
        ConstraintWidget constraintWidgetE = cVar.e();
        ConstraintWidget constraintWidgetI = cVar.i();
        ConstraintWidget constraintWidgetF = cVar.f();
        ConstraintAnchor constraintAnchor3 = constraintWidgetC.Y[i11];
        int i14 = i11 + 1;
        ConstraintAnchor constraintAnchor4 = constraintWidgetG.Y[i14];
        ConstraintAnchor constraintAnchor5 = constraintAnchor3.f18222f;
        if (constraintAnchor5 == null || constraintAnchor4.f18222f == null || !constraintAnchor5.o() || !constraintAnchor4.f18222f.o() || constraintWidgetE == null || constraintWidgetI == null || (iF3 = (iF2 = constraintAnchor4.f18222f.f() - constraintWidgetI.Y[i14].g()) - (iF = constraintAnchor3.f18222f.f() + constraintWidgetE.Y[i11].g())) <= 0) {
            return false;
        }
        b.a aVar = new b.a();
        boolean z14 = false;
        int i15 = 0;
        int i16 = 0;
        int iG3 = 0;
        ConstraintWidget constraintWidget3 = constraintWidgetC;
        while (true) {
            ConstraintWidget constraintWidget4 = null;
            if (z14) {
                ConstraintWidget constraintWidget5 = constraintWidgetC;
                if (i15 == 0 || i15 != i16 || iF3 < iG3) {
                    return false;
                }
                int i17 = iF3 - iG3;
                if (!z10) {
                    if (z11 && i15 > 2) {
                        i12 = 1;
                        i17 = (i17 / i15) - 1;
                    }
                    if (i15 == i12) {
                        if (i10 == 0) {
                            fD0 = constraintWidgetF.E();
                        } else {
                            fD0 = constraintWidgetF.d0();
                        }
                        i13 = (int) (iF + 0.5f + (i17 * fD0));
                        if (i10 == 0) {
                            constraintWidgetE.k1(i13, constraintWidgetE.j0() + i13);
                        } else {
                            constraintWidgetE.n1(i13, constraintWidgetE.D() + i13);
                        }
                        b(1, constraintWidgetE, dVar.A2(), zI2);
                        return true;
                    }
                    if (z10) {
                        if (z11) {
                            return true;
                        }
                        if (i15 == 2) {
                            return false;
                        }
                        if (i10 == 0) {
                            constraintWidgetE.k1(iF, constraintWidgetE.j0() + iF);
                            constraintWidgetI.k1(iF2 - constraintWidgetI.j0(), iF2);
                            b(1, constraintWidgetE, dVar.A2(), zI2);
                            b(1, constraintWidgetI, dVar.A2(), zI2);
                            return true;
                        }
                        constraintWidgetE.n1(iF, constraintWidgetE.D() + iF);
                        constraintWidgetI.n1(iF2 - constraintWidgetI.D(), iF2);
                        k(1, constraintWidgetE, dVar.A2());
                        k(1, constraintWidgetI, dVar.A2());
                        return true;
                    }
                    iG = iF + i17;
                    constraintWidget = constraintWidget5;
                    z13 = false;
                    while (!z13) {
                        if (constraintWidget.i0() == 8) {
                            iG2 = iG + constraintWidget.Y[i11].g();
                            if (i10 == 0) {
                                r10 = i12;
                                constraintWidget.k1(iG2, constraintWidget.j0() + iG2);
                                b(1, constraintWidget, dVar.A2(), zI2);
                                iD = constraintWidget.j0();
                            } else {
                                r10 = i12;
                                constraintWidget.n1(iG2, constraintWidget.D() + iG2);
                                k(1, constraintWidget, dVar.A2());
                                iD = constraintWidget.D();
                            }
                            iG = iG2 + iD + constraintWidget.Y[i14].g() + i17;
                        } else if (i10 == 0) {
                            constraintWidget.k1(iG, iG);
                            b(r10, constraintWidget, dVar.A2(), zI2);
                        } else {
                            constraintWidget.n1(iG, iG);
                            k(r10, constraintWidget, dVar.A2());
                        }
                        constraintWidget.g(eVar, false);
                        constraintAnchor = constraintWidget.Y[i14].f18222f;
                        if (constraintAnchor != null) {
                            constraintWidget2 = constraintAnchor.f18220d;
                            constraintAnchor2 = constraintWidget2.Y[i11].f18222f;
                            if (constraintAnchor2 != null || constraintAnchor2.f18220d != constraintWidget) {
                                constraintWidget2 = null;
                            }
                        } else {
                            constraintWidget2 = null;
                        }
                        if (constraintWidget2 != null) {
                            constraintWidget = constraintWidget2;
                        } else {
                            z13 = true;
                        }
                        r10 = 1;
                    }
                    r10 = i12;
                    return r10;
                }
                i17 /= i15 + 1;
                i12 = 1;
                if (i15 == i12) {
                    if (i10 == 0) {
                        fD0 = constraintWidgetF.E();
                    } else {
                        fD0 = constraintWidgetF.d0();
                    }
                    i13 = (int) (iF + 0.5f + (i17 * fD0));
                    if (i10 == 0) {
                        constraintWidgetE.k1(i13, constraintWidgetE.j0() + i13);
                    } else {
                        constraintWidgetE.n1(i13, constraintWidgetE.D() + i13);
                    }
                    b(1, constraintWidgetE, dVar.A2(), zI2);
                    return true;
                }
                if (z10) {
                    if (z11) {
                        return true;
                    }
                    if (i15 == 2) {
                        return false;
                    }
                    if (i10 == 0) {
                        constraintWidgetE.k1(iF, constraintWidgetE.j0() + iF);
                        constraintWidgetI.k1(iF2 - constraintWidgetI.j0(), iF2);
                        b(1, constraintWidgetE, dVar.A2(), zI2);
                        b(1, constraintWidgetI, dVar.A2(), zI2);
                        return true;
                    }
                    constraintWidgetE.n1(iF, constraintWidgetE.D() + iF);
                    constraintWidgetI.n1(iF2 - constraintWidgetI.D(), iF2);
                    k(1, constraintWidgetE, dVar.A2());
                    k(1, constraintWidgetI, dVar.A2());
                    return true;
                }
                iG = iF + i17;
                constraintWidget = constraintWidget5;
                z13 = false;
                while (!z13) {
                    if (constraintWidget.i0() == 8) {
                        iG2 = iG + constraintWidget.Y[i11].g();
                        if (i10 == 0) {
                            r10 = i12;
                            constraintWidget.k1(iG2, constraintWidget.j0() + iG2);
                            b(1, constraintWidget, dVar.A2(), zI2);
                            iD = constraintWidget.j0();
                        } else {
                            r10 = i12;
                            constraintWidget.n1(iG2, constraintWidget.D() + iG2);
                            k(1, constraintWidget, dVar.A2());
                            iD = constraintWidget.D();
                        }
                        iG = iG2 + iD + constraintWidget.Y[i14].g() + i17;
                    } else if (i10 == 0) {
                        constraintWidget.k1(iG, iG);
                        b(r10, constraintWidget, dVar.A2(), zI2);
                    } else {
                        constraintWidget.n1(iG, iG);
                        k(r10, constraintWidget, dVar.A2());
                    }
                    constraintWidget.g(eVar, false);
                    constraintAnchor = constraintWidget.Y[i14].f18222f;
                    if (constraintAnchor != null) {
                        constraintWidget2 = constraintAnchor.f18220d;
                        constraintAnchor2 = constraintWidget2.Y[i11].f18222f;
                        if (constraintAnchor2 != null) {
                            constraintWidget2 = null;
                        } else {
                            constraintWidget2 = null;
                        }
                    } else {
                        constraintWidget2 = null;
                    }
                    if (constraintWidget2 != null) {
                        constraintWidget = constraintWidget2;
                    } else {
                        z13 = true;
                    }
                    r10 = 1;
                }
                r10 = i12;
                return r10;
            }
            if (!a(1, constraintWidget3)) {
                return false;
            }
            ConstraintWidget constraintWidget6 = constraintWidgetC;
            if (constraintWidget3.f18255b0[i10] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                return false;
            }
            if (constraintWidget3.B0()) {
                androidx.constraintlayout.core.widgets.d.L2(1, constraintWidget3, dVar.A2(), aVar, b.a.f18340k);
            }
            iG3 = iG3 + constraintWidget3.Y[i11].g() + (i10 == 0 ? constraintWidget3.j0() : constraintWidget3.D()) + constraintWidget3.Y[i14].g();
            i16++;
            if (constraintWidget3.i0() != 8) {
                i15++;
            }
            ConstraintAnchor constraintAnchor6 = constraintWidget3.Y[i14].f18222f;
            if (constraintAnchor6 != null) {
                ConstraintWidget constraintWidget7 = constraintAnchor6.f18220d;
                ConstraintAnchor constraintAnchor7 = constraintWidget7.Y[i11].f18222f;
                if (constraintAnchor7 != null && constraintAnchor7.f18220d == constraintWidget3) {
                    constraintWidget4 = constraintWidget7;
                }
            }
            if (constraintWidget4 != null) {
                constraintWidget3 = constraintWidget4;
                z14 = z14;
            } else {
                z14 = true;
            }
            constraintWidgetC = constraintWidget6;
        }
    }

    private static void f(int i10, b.InterfaceC0110b interfaceC0110b, ConstraintWidget constraintWidget, boolean z10) {
        float fE = constraintWidget.E();
        int iF = constraintWidget.Q.f18222f.f();
        int iF2 = constraintWidget.S.f18222f.f();
        int iG = constraintWidget.Q.g() + iF;
        int iG2 = iF2 - constraintWidget.S.g();
        if (iF == iF2) {
            fE = 0.5f;
        } else {
            iF = iG;
            iF2 = iG2;
        }
        int iJ0 = constraintWidget.j0();
        int i11 = (iF2 - iF) - iJ0;
        if (iF > iF2) {
            i11 = (iF - iF2) - iJ0;
        }
        int i12 = ((int) (i11 > 0 ? (fE * i11) + 0.5f : fE * i11)) + iF;
        int i13 = i12 + iJ0;
        if (iF > iF2) {
            i13 = i12 - iJ0;
        }
        constraintWidget.k1(i12, i13);
        b(i10 + 1, constraintWidget, interfaceC0110b, z10);
    }

    private static void g(int i10, ConstraintWidget constraintWidget, b.InterfaceC0110b interfaceC0110b, ConstraintWidget constraintWidget2, boolean z10) {
        float fE = constraintWidget2.E();
        int iF = constraintWidget2.Q.f18222f.f() + constraintWidget2.Q.g();
        int iF2 = constraintWidget2.S.f18222f.f() - constraintWidget2.S.g();
        if (iF2 >= iF) {
            int iJ0 = constraintWidget2.j0();
            if (constraintWidget2.i0() != 8) {
                int i11 = constraintWidget2.f18296w;
                if (i11 == 2) {
                    iJ0 = (int) (constraintWidget2.E() * 0.5f * (constraintWidget instanceof androidx.constraintlayout.core.widgets.d ? constraintWidget.j0() : constraintWidget.U().j0()));
                } else if (i11 == 0) {
                    iJ0 = iF2 - iF;
                }
                iJ0 = Math.max(constraintWidget2.f18302z, iJ0);
                int i12 = constraintWidget2.A;
                if (i12 > 0) {
                    iJ0 = Math.min(i12, iJ0);
                }
            }
            int i13 = iF + ((int) ((fE * ((iF2 - iF) - iJ0)) + 0.5f));
            constraintWidget2.k1(i13, iJ0 + i13);
            b(i10 + 1, constraintWidget2, interfaceC0110b, z10);
        }
    }

    private static void h(int i10, b.InterfaceC0110b interfaceC0110b, ConstraintWidget constraintWidget) {
        float fD0 = constraintWidget.d0();
        int iF = constraintWidget.R.f18222f.f();
        int iF2 = constraintWidget.T.f18222f.f();
        int iG = constraintWidget.R.g() + iF;
        int iG2 = iF2 - constraintWidget.T.g();
        if (iF == iF2) {
            fD0 = 0.5f;
        } else {
            iF = iG;
            iF2 = iG2;
        }
        int iD = constraintWidget.D();
        int i11 = (iF2 - iF) - iD;
        if (iF > iF2) {
            i11 = (iF - iF2) - iD;
        }
        int i12 = (int) (i11 > 0 ? (fD0 * i11) + 0.5f : fD0 * i11);
        int i13 = iF + i12;
        int i14 = i13 + iD;
        if (iF > iF2) {
            i13 = iF - i12;
            i14 = i13 - iD;
        }
        constraintWidget.n1(i13, i14);
        k(i10 + 1, constraintWidget, interfaceC0110b);
    }

    private static void i(int i10, ConstraintWidget constraintWidget, b.InterfaceC0110b interfaceC0110b, ConstraintWidget constraintWidget2) {
        float fD0 = constraintWidget2.d0();
        int iF = constraintWidget2.R.f18222f.f() + constraintWidget2.R.g();
        int iF2 = constraintWidget2.T.f18222f.f() - constraintWidget2.T.g();
        if (iF2 >= iF) {
            int iD = constraintWidget2.D();
            if (constraintWidget2.i0() != 8) {
                int i11 = constraintWidget2.f18298x;
                if (i11 == 2) {
                    iD = (int) (fD0 * 0.5f * (constraintWidget instanceof androidx.constraintlayout.core.widgets.d ? constraintWidget.D() : constraintWidget.U().D()));
                } else if (i11 == 0) {
                    iD = iF2 - iF;
                }
                iD = Math.max(constraintWidget2.C, iD);
                int i12 = constraintWidget2.D;
                if (i12 > 0) {
                    iD = Math.min(i12, iD);
                }
            }
            int i13 = iF + ((int) ((fD0 * ((iF2 - iF) - iD)) + 0.5f));
            constraintWidget2.n1(i13, iD + i13);
            k(i10 + 1, constraintWidget2, interfaceC0110b);
        }
    }

    public static void j(androidx.constraintlayout.core.widgets.d dVar, b.InterfaceC0110b interfaceC0110b) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviourH = dVar.H();
        ConstraintWidget.DimensionBehaviour dimensionBehaviourG0 = dVar.g0();
        f18370e = 0;
        f18371f = 0;
        dVar.R0();
        ArrayList<ConstraintWidget> arrayListF2 = dVar.f2();
        int size = arrayListF2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayListF2.get(i10).R0();
        }
        boolean zI2 = dVar.I2();
        if (dimensionBehaviourH == ConstraintWidget.DimensionBehaviour.FIXED) {
            dVar.k1(0, dVar.j0());
        } else {
            dVar.l1(0);
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            ConstraintWidget constraintWidget = arrayListF2.get(i11);
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
                androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) constraintWidget;
                if (fVar.g2() == 1) {
                    if (fVar.h2() != -1) {
                        fVar.p2(fVar.h2());
                    } else if (fVar.j2() != -1 && dVar.C0()) {
                        fVar.p2(dVar.j0() - fVar.j2());
                    } else if (dVar.C0()) {
                        fVar.p2((int) ((fVar.k2() * dVar.j0()) + 0.5f));
                    }
                    z10 = true;
                }
            } else if ((constraintWidget instanceof androidx.constraintlayout.core.widgets.a) && ((androidx.constraintlayout.core.widgets.a) constraintWidget).l2() == 0) {
                z11 = true;
            }
        }
        if (z10) {
            for (int i12 = 0; i12 < size; i12++) {
                ConstraintWidget constraintWidget2 = arrayListF2.get(i12);
                if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.f) {
                    androidx.constraintlayout.core.widgets.f fVar2 = (androidx.constraintlayout.core.widgets.f) constraintWidget2;
                    if (fVar2.g2() == 1) {
                        b(0, fVar2, interfaceC0110b, zI2);
                    }
                }
            }
        }
        b(0, dVar, interfaceC0110b, zI2);
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                ConstraintWidget constraintWidget3 = arrayListF2.get(i13);
                if (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.a) {
                    androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) constraintWidget3;
                    if (aVar.l2() == 0) {
                        d(0, aVar, interfaceC0110b, 0, zI2);
                    }
                }
            }
        }
        if (dimensionBehaviourG0 == ConstraintWidget.DimensionBehaviour.FIXED) {
            dVar.n1(0, dVar.D());
        } else {
            dVar.m1(0);
        }
        boolean z12 = false;
        boolean z13 = false;
        for (int i14 = 0; i14 < size; i14++) {
            ConstraintWidget constraintWidget4 = arrayListF2.get(i14);
            if (constraintWidget4 instanceof androidx.constraintlayout.core.widgets.f) {
                androidx.constraintlayout.core.widgets.f fVar3 = (androidx.constraintlayout.core.widgets.f) constraintWidget4;
                if (fVar3.g2() == 0) {
                    if (fVar3.h2() != -1) {
                        fVar3.p2(fVar3.h2());
                    } else if (fVar3.j2() != -1 && dVar.D0()) {
                        fVar3.p2(dVar.D() - fVar3.j2());
                    } else if (dVar.D0()) {
                        fVar3.p2((int) ((fVar3.k2() * dVar.D()) + 0.5f));
                    }
                    z12 = true;
                }
            } else if ((constraintWidget4 instanceof androidx.constraintlayout.core.widgets.a) && ((androidx.constraintlayout.core.widgets.a) constraintWidget4).l2() == 1) {
                z13 = true;
            }
        }
        if (z12) {
            for (int i15 = 0; i15 < size; i15++) {
                ConstraintWidget constraintWidget5 = arrayListF2.get(i15);
                if (constraintWidget5 instanceof androidx.constraintlayout.core.widgets.f) {
                    androidx.constraintlayout.core.widgets.f fVar4 = (androidx.constraintlayout.core.widgets.f) constraintWidget5;
                    if (fVar4.g2() == 0) {
                        k(1, fVar4, interfaceC0110b);
                    }
                }
            }
        }
        k(0, dVar, interfaceC0110b);
        if (z13) {
            for (int i16 = 0; i16 < size; i16++) {
                ConstraintWidget constraintWidget6 = arrayListF2.get(i16);
                if (constraintWidget6 instanceof androidx.constraintlayout.core.widgets.a) {
                    androidx.constraintlayout.core.widgets.a aVar2 = (androidx.constraintlayout.core.widgets.a) constraintWidget6;
                    if (aVar2.l2() == 1) {
                        d(0, aVar2, interfaceC0110b, 1, zI2);
                    }
                }
            }
        }
        for (int i17 = 0; i17 < size; i17++) {
            ConstraintWidget constraintWidget7 = arrayListF2.get(i17);
            if (constraintWidget7.B0() && a(0, constraintWidget7)) {
                androidx.constraintlayout.core.widgets.d.L2(0, constraintWidget7, interfaceC0110b, f18368c, b.a.f18340k);
                if (!(constraintWidget7 instanceof androidx.constraintlayout.core.widgets.f)) {
                    b(0, constraintWidget7, interfaceC0110b, zI2);
                    k(0, constraintWidget7, interfaceC0110b);
                } else if (((androidx.constraintlayout.core.widgets.f) constraintWidget7).g2() == 0) {
                    k(0, constraintWidget7, interfaceC0110b);
                } else {
                    b(0, constraintWidget7, interfaceC0110b, zI2);
                }
            }
        }
    }

    private static void k(int i10, ConstraintWidget constraintWidget, b.InterfaceC0110b interfaceC0110b) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        ConstraintAnchor constraintAnchor5;
        if (constraintWidget.H0()) {
            return;
        }
        f18371f++;
        if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.d) && constraintWidget.B0()) {
            int i11 = i10 + 1;
            if (a(i11, constraintWidget)) {
                androidx.constraintlayout.core.widgets.d.L2(i11, constraintWidget, interfaceC0110b, new b.a(), b.a.f18340k);
            }
        }
        ConstraintAnchor constraintAnchorR = constraintWidget.r(ConstraintAnchor.Type.TOP);
        ConstraintAnchor constraintAnchorR2 = constraintWidget.r(ConstraintAnchor.Type.BOTTOM);
        int iF = constraintAnchorR.f();
        int iF2 = constraintAnchorR2.f();
        if (constraintAnchorR.e() != null && constraintAnchorR.o()) {
            Iterator<ConstraintAnchor> it = constraintAnchorR.e().iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.f18220d;
                int i12 = i10 + 1;
                boolean zA = a(i12, constraintWidget2);
                if (constraintWidget2.B0() && zA) {
                    androidx.constraintlayout.core.widgets.d.L2(i12, constraintWidget2, interfaceC0110b, new b.a(), b.a.f18340k);
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviourG0 = constraintWidget2.g0();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourG0 != dimensionBehaviour || zA) {
                    if (!constraintWidget2.B0()) {
                        ConstraintAnchor constraintAnchor6 = constraintWidget2.R;
                        if (next == constraintAnchor6 && constraintWidget2.T.f18222f == null) {
                            int iG = constraintAnchor6.g() + iF;
                            constraintWidget2.n1(iG, constraintWidget2.D() + iG);
                            k(i12, constraintWidget2, interfaceC0110b);
                        } else {
                            ConstraintAnchor constraintAnchor7 = constraintWidget2.T;
                            if (next == constraintAnchor7 && constraintAnchor7.f18222f == null) {
                                int iG2 = iF - constraintAnchor7.g();
                                constraintWidget2.n1(iG2 - constraintWidget2.D(), iG2);
                                k(i12, constraintWidget2, interfaceC0110b);
                            } else if (next == constraintAnchor6 && (constraintAnchor3 = constraintAnchor7.f18222f) != null && constraintAnchor3.o()) {
                                h(i12, interfaceC0110b, constraintWidget2);
                            }
                        }
                    }
                } else if (constraintWidget2.g0() == dimensionBehaviour && constraintWidget2.D >= 0 && constraintWidget2.C >= 0 && (constraintWidget2.i0() == 8 || (constraintWidget2.f18298x == 0 && constraintWidget2.A() == 0.0f))) {
                    if (!constraintWidget2.z0() && !constraintWidget2.A0()) {
                        if (((next == constraintWidget2.R && (constraintAnchor5 = constraintWidget2.T.f18222f) != null && constraintAnchor5.o()) || (next == constraintWidget2.T && (constraintAnchor4 = constraintWidget2.R.f18222f) != null && constraintAnchor4.o())) && !constraintWidget2.z0()) {
                            i(i12, constraintWidget, interfaceC0110b, constraintWidget2);
                        }
                    }
                }
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
            return;
        }
        if (constraintAnchorR2.e() != null && constraintAnchorR2.o()) {
            Iterator<ConstraintAnchor> it2 = constraintAnchorR2.e().iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.f18220d;
                int i13 = i10 + 1;
                boolean zA2 = a(i13, constraintWidget3);
                if (constraintWidget3.B0() && zA2) {
                    androidx.constraintlayout.core.widgets.d.L2(i13, constraintWidget3, interfaceC0110b, new b.a(), b.a.f18340k);
                }
                boolean z10 = (next2 == constraintWidget3.R && (constraintAnchor2 = constraintWidget3.T.f18222f) != null && constraintAnchor2.o()) || (next2 == constraintWidget3.T && (constraintAnchor = constraintWidget3.R.f18222f) != null && constraintAnchor.o());
                ConstraintWidget.DimensionBehaviour dimensionBehaviourG1 = constraintWidget3.g0();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourG1 != dimensionBehaviour2 || zA2) {
                    if (!constraintWidget3.B0()) {
                        ConstraintAnchor constraintAnchor8 = constraintWidget3.R;
                        if (next2 == constraintAnchor8 && constraintWidget3.T.f18222f == null) {
                            int iG3 = constraintAnchor8.g() + iF2;
                            constraintWidget3.n1(iG3, constraintWidget3.D() + iG3);
                            k(i13, constraintWidget3, interfaceC0110b);
                        } else {
                            ConstraintAnchor constraintAnchor9 = constraintWidget3.T;
                            if (next2 == constraintAnchor9 && constraintAnchor8.f18222f == null) {
                                int iG4 = iF2 - constraintAnchor9.g();
                                constraintWidget3.n1(iG4 - constraintWidget3.D(), iG4);
                                k(i13, constraintWidget3, interfaceC0110b);
                            } else if (z10 && !constraintWidget3.z0()) {
                                h(i13, interfaceC0110b, constraintWidget3);
                            }
                        }
                    }
                } else if (constraintWidget3.g0() == dimensionBehaviour2 && constraintWidget3.D >= 0 && constraintWidget3.C >= 0 && (constraintWidget3.i0() == 8 || (constraintWidget3.f18298x == 0 && constraintWidget3.A() == 0.0f))) {
                    if (!constraintWidget3.z0() && !constraintWidget3.A0() && z10 && !constraintWidget3.z0()) {
                        i(i13, constraintWidget, interfaceC0110b, constraintWidget3);
                    }
                }
            }
        }
        ConstraintAnchor constraintAnchorR3 = constraintWidget.r(ConstraintAnchor.Type.BASELINE);
        if (constraintAnchorR3.e() != null && constraintAnchorR3.o()) {
            int iF3 = constraintAnchorR3.f();
            for (ConstraintAnchor constraintAnchor10 : constraintAnchorR3.e()) {
                ConstraintWidget constraintWidget4 = constraintAnchor10.f18220d;
                int i14 = i10 + 1;
                boolean zA3 = a(i14, constraintWidget4);
                if (constraintWidget4.B0() && zA3) {
                    androidx.constraintlayout.core.widgets.d.L2(i14, constraintWidget4, interfaceC0110b, new b.a(), b.a.f18340k);
                }
                if (constraintWidget4.g0() != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || zA3) {
                    if (!constraintWidget4.B0() && constraintAnchor10 == constraintWidget4.U) {
                        constraintWidget4.i1(constraintAnchor10.g() + iF3);
                        k(i14, constraintWidget4, interfaceC0110b);
                    }
                }
            }
        }
        constraintWidget.K0();
    }
}
