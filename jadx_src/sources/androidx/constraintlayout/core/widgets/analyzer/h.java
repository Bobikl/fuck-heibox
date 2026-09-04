package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: Grouping.java */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f18372a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f18373b = false;

    public static n a(ConstraintWidget constraintWidget, int i10, ArrayList<n> arrayList, n nVar) {
        int iF2;
        int i11 = i10 == 0 ? constraintWidget.R0 : constraintWidget.S0;
        if (i11 != -1 && (nVar == null || i11 != nVar.f18393b)) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                n nVar2 = arrayList.get(i12);
                if (nVar2.f() == i11) {
                    if (nVar != null) {
                        nVar.m(i10, nVar2);
                        arrayList.remove(nVar);
                    }
                    nVar = nVar2;
                    break;
                }
            }
        } else if (i11 != -1) {
            return nVar;
        }
        if (nVar == null) {
            if ((constraintWidget instanceof androidx.constraintlayout.core.widgets.h) && (iF2 = ((androidx.constraintlayout.core.widgets.h) constraintWidget).f2(i10)) != -1) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    n nVar3 = arrayList.get(i13);
                    if (nVar3.f() == iF2) {
                        nVar = nVar3;
                        break;
                    }
                }
            }
            if (nVar == null) {
                nVar = new n(i10);
            }
            arrayList.add(nVar);
        }
        if (nVar.a(constraintWidget)) {
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
                androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) constraintWidget;
                fVar.f2().d(fVar.g2() == 0 ? 1 : 0, arrayList, nVar);
            }
            if (i10 == 0) {
                constraintWidget.R0 = nVar.f();
                constraintWidget.Q.d(i10, arrayList, nVar);
                constraintWidget.S.d(i10, arrayList, nVar);
            } else {
                constraintWidget.S0 = nVar.f();
                constraintWidget.R.d(i10, arrayList, nVar);
                constraintWidget.U.d(i10, arrayList, nVar);
                constraintWidget.T.d(i10, arrayList, nVar);
            }
            constraintWidget.X.d(i10, arrayList, nVar);
        }
        return nVar;
    }

    private static n b(ArrayList<n> arrayList, int i10) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = arrayList.get(i11);
            if (i10 == nVar.f18393b) {
                return nVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:179:0x0356  */
    public static boolean c(androidx.constraintlayout.core.widgets.d dVar, b.InterfaceC0110b interfaceC0110b) {
        n nVar;
        boolean z10;
        boolean z11;
        n nVar2;
        ArrayList<ConstraintWidget> arrayListF2 = dVar.f2();
        int size = arrayListF2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            ConstraintWidget constraintWidget = arrayListF2.get(i11);
            if (!d(dVar.H(), dVar.g0(), constraintWidget.H(), constraintWidget.g0()) || (constraintWidget instanceof androidx.constraintlayout.core.widgets.e)) {
                return false;
            }
        }
        androidx.constraintlayout.core.f fVar = dVar.F1;
        if (fVar != null) {
            fVar.Q++;
        }
        int i12 = 0;
        ArrayList arrayList = null;
        ArrayList<androidx.constraintlayout.core.widgets.h> arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList<androidx.constraintlayout.core.widgets.h> arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        while (i12 < size) {
            ConstraintWidget constraintWidget2 = arrayListF2.get(i12);
            if (!d(dVar.H(), dVar.g0(), constraintWidget2.H(), constraintWidget2.g0())) {
                androidx.constraintlayout.core.widgets.d.L2(i10, constraintWidget2, interfaceC0110b, dVar.f18439e2, b.a.f18340k);
            }
            boolean z12 = constraintWidget2 instanceof androidx.constraintlayout.core.widgets.f;
            if (z12) {
                androidx.constraintlayout.core.widgets.f fVar2 = (androidx.constraintlayout.core.widgets.f) constraintWidget2;
                if (fVar2.g2() == 0) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(fVar2);
                }
                if (fVar2.g2() == 1) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(fVar2);
                }
            }
            if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.h) {
                if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.a) {
                    androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) constraintWidget2;
                    if (aVar.l2() == 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(aVar);
                    }
                    if (aVar.l2() == 1) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(aVar);
                    }
                } else {
                    androidx.constraintlayout.core.widgets.h hVar = (androidx.constraintlayout.core.widgets.h) constraintWidget2;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(hVar);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(hVar);
                }
            }
            if (constraintWidget2.Q.f18222f == null && constraintWidget2.S.f18222f == null && !z12 && !(constraintWidget2 instanceof androidx.constraintlayout.core.widgets.a)) {
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                arrayList5.add(constraintWidget2);
            }
            if (constraintWidget2.R.f18222f == null && constraintWidget2.T.f18222f == null && constraintWidget2.U.f18222f == null && !z12 && !(constraintWidget2 instanceof androidx.constraintlayout.core.widgets.a)) {
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(constraintWidget2);
            }
            i12++;
            i10 = 0;
        }
        ArrayList<n> arrayList7 = new ArrayList<>();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a((androidx.constraintlayout.core.widgets.f) it.next(), 0, arrayList7, null);
            }
        }
        int i13 = 0;
        n nVar3 = null;
        if (arrayList2 != null) {
            for (androidx.constraintlayout.core.widgets.h hVar2 : arrayList2) {
                n nVarA = a(hVar2, i13, arrayList7, nVar3);
                hVar2.e2(arrayList7, i13, nVarA);
                nVarA.c(arrayList7);
                i13 = 0;
                nVar3 = null;
            }
        }
        ConstraintAnchor constraintAnchorR = dVar.r(ConstraintAnchor.Type.LEFT);
        if (constraintAnchorR.e() != null) {
            Iterator<ConstraintAnchor> it2 = constraintAnchorR.e().iterator();
            while (it2.hasNext()) {
                a(it2.next().f18220d, 0, arrayList7, null);
            }
        }
        ConstraintAnchor constraintAnchorR2 = dVar.r(ConstraintAnchor.Type.RIGHT);
        if (constraintAnchorR2.e() != null) {
            Iterator<ConstraintAnchor> it3 = constraintAnchorR2.e().iterator();
            while (it3.hasNext()) {
                a(it3.next().f18220d, 0, arrayList7, null);
            }
        }
        ConstraintAnchor constraintAnchorR3 = dVar.r(ConstraintAnchor.Type.CENTER);
        if (constraintAnchorR3.e() != null) {
            Iterator<ConstraintAnchor> it4 = constraintAnchorR3.e().iterator();
            while (it4.hasNext()) {
                a(it4.next().f18220d, 0, arrayList7, null);
            }
        }
        n nVar4 = null;
        if (arrayList5 != null) {
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                a((ConstraintWidget) it5.next(), 0, arrayList7, null);
            }
        }
        if (arrayList3 != null) {
            Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                a((androidx.constraintlayout.core.widgets.f) it6.next(), 1, arrayList7, null);
            }
        }
        int i14 = 1;
        if (arrayList4 != null) {
            for (androidx.constraintlayout.core.widgets.h hVar3 : arrayList4) {
                n nVarA2 = a(hVar3, i14, arrayList7, nVar4);
                hVar3.e2(arrayList7, i14, nVarA2);
                nVarA2.c(arrayList7);
                i14 = 1;
                nVar4 = null;
            }
        }
        ConstraintAnchor constraintAnchorR4 = dVar.r(ConstraintAnchor.Type.TOP);
        if (constraintAnchorR4.e() != null) {
            Iterator<ConstraintAnchor> it7 = constraintAnchorR4.e().iterator();
            while (it7.hasNext()) {
                a(it7.next().f18220d, 1, arrayList7, null);
            }
        }
        ConstraintAnchor constraintAnchorR5 = dVar.r(ConstraintAnchor.Type.BASELINE);
        if (constraintAnchorR5.e() != null) {
            Iterator<ConstraintAnchor> it8 = constraintAnchorR5.e().iterator();
            while (it8.hasNext()) {
                a(it8.next().f18220d, 1, arrayList7, null);
            }
        }
        ConstraintAnchor constraintAnchorR6 = dVar.r(ConstraintAnchor.Type.BOTTOM);
        if (constraintAnchorR6.e() != null) {
            Iterator<ConstraintAnchor> it9 = constraintAnchorR6.e().iterator();
            while (it9.hasNext()) {
                a(it9.next().f18220d, 1, arrayList7, null);
            }
        }
        ConstraintAnchor constraintAnchorR7 = dVar.r(ConstraintAnchor.Type.CENTER);
        if (constraintAnchorR7.e() != null) {
            Iterator<ConstraintAnchor> it10 = constraintAnchorR7.e().iterator();
            while (it10.hasNext()) {
                a(it10.next().f18220d, 1, arrayList7, null);
            }
        }
        if (arrayList6 != null) {
            Iterator it11 = arrayList6.iterator();
            while (it11.hasNext()) {
                a((ConstraintWidget) it11.next(), 1, arrayList7, null);
            }
        }
        for (int i15 = 0; i15 < size; i15++) {
            ConstraintWidget constraintWidget3 = arrayListF2.get(i15);
            if (constraintWidget3.M0()) {
                n nVarB = b(arrayList7, constraintWidget3.R0);
                n nVarB2 = b(arrayList7, constraintWidget3.S0);
                if (nVarB != null && nVarB2 != null) {
                    nVarB.m(0, nVarB2);
                    nVarB2.o(2);
                    arrayList7.remove(nVarB);
                }
            }
        }
        if (arrayList7.size() <= 1) {
            return false;
        }
        if (dVar.H() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
            nVar = null;
            int i16 = 0;
            for (n nVar5 : arrayList7) {
                if (nVar5.g() != 1) {
                    nVar5.n(false);
                    int iL = nVar5.l(dVar.C2(), 0);
                    if (iL > i16) {
                        nVar = nVar5;
                        i16 = iL;
                    }
                }
            }
            if (nVar != null) {
                dVar.x1(ConstraintWidget.DimensionBehaviour.FIXED);
                dVar.W1(i16);
                nVar.n(true);
            } else {
                nVar = null;
            }
        } else {
            nVar = null;
        }
        if (dVar.g0() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
            n nVar6 = null;
            int i17 = 0;
            for (n nVar7 : arrayList7) {
                if (nVar7.g() != 0) {
                    nVar7.n(false);
                    int iL2 = nVar7.l(dVar.C2(), 1);
                    if (iL2 > i17) {
                        nVar6 = nVar7;
                        i17 = iL2;
                    }
                }
            }
            z10 = false;
            z11 = true;
            if (nVar6 != null) {
                dVar.S1(ConstraintWidget.DimensionBehaviour.FIXED);
                dVar.s1(i17);
                nVar6.n(true);
                nVar2 = nVar6;
            }
            return (nVar == null || nVar2 != null) ? z11 : z10;
        }
        z10 = false;
        z11 = true;
        nVar2 = null;
        if (nVar == null) {
        }
    }

    public static boolean d(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.FIXED;
        return (dimensionBehaviour3 == dimensionBehaviour7 || dimensionBehaviour3 == (dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour != dimensionBehaviour6)) || (dimensionBehaviour4 == dimensionBehaviour7 || dimensionBehaviour4 == (dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour2 != dimensionBehaviour5));
    }
}
