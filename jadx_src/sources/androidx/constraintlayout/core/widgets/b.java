package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;

/* JADX INFO: compiled from: Chain.java */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f18406a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f18407b = false;

    /* JADX WARN: Code duplicated, block: B:101:0x016e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0171  */
    /* JADX WARN: Code duplicated, block: B:105:0x0177  */
    /* JADX WARN: Code duplicated, block: B:107:0x0198  */
    /* JADX WARN: Code duplicated, block: B:202:0x034c  */
    /* JADX WARN: Code duplicated, block: B:222:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[PHI: r8 r16
  0x0044: PHI (r8v3 boolean) = (r8v1 boolean), (r8v45 boolean) binds: [B:24:0x0042, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x0044: PHI (r16v3 boolean) = (r16v1 boolean), (r16v8 boolean) binds: [B:24:0x0042, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0046 A[PHI: r8 r16
  0x0046: PHI (r8v43 boolean) = (r8v1 boolean), (r8v45 boolean) binds: [B:24:0x0042, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x0046: PHI (r16v6 boolean) = (r16v1 boolean), (r16v8 boolean) binds: [B:24:0x0042, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:325:0x03a5 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r38v0, types: [androidx.constraintlayout.core.e] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29, types: [androidx.constraintlayout.core.SolverVariable] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    static void a(d dVar, androidx.constraintlayout.core.e eVar, int i10, int i11, c cVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        Object obj;
        int i12;
        int i13;
        ConstraintAnchor constraintAnchor;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        ConstraintAnchor constraintAnchor2;
        SolverVariable solverVariable3;
        ?? r10;
        SolverVariable solverVariable4;
        int size;
        ConstraintAnchor constraintAnchor3;
        int i14;
        int i15 = i10;
        ConstraintWidget constraintWidget = cVar.f18408a;
        ConstraintWidget constraintWidget2 = cVar.f18410c;
        ConstraintWidget constraintWidget3 = cVar.f18409b;
        ConstraintWidget constraintWidget4 = cVar.f18411d;
        ConstraintWidget constraintWidget5 = cVar.f18412e;
        float f10 = cVar.f18418k;
        boolean z13 = dVar.f18255b0[i15] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (i15 == 0) {
            int i16 = constraintWidget5.I0;
            z10 = i16 == 0;
            z11 = i16 == 1;
            if (i16 == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
        } else {
            int i17 = constraintWidget5.J0;
            z10 = i17 == 0;
            z11 = i17 == 1;
            if (i17 == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
        }
        boolean z14 = z11;
        boolean z15 = false;
        boolean z16 = z10;
        ?? r11 = constraintWidget;
        while (true) {
            obj = null;
            if (z15) {
                break;
            }
            ConstraintAnchor constraintAnchor4 = r11.Y[i11];
            int i18 = z12 ? 1 : 4;
            int iG = constraintAnchor4.g();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = r11.f18255b0[i15];
            float f11 = f10;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            boolean z17 = dimensionBehaviour == dimensionBehaviour2 && r11.f18300y[i15] == 0;
            ConstraintAnchor constraintAnchor5 = constraintAnchor4.f18222f;
            if (constraintAnchor5 != null && r11 != constraintWidget) {
                iG += constraintAnchor5.g();
            }
            int i19 = iG;
            if (z12 && r11 != constraintWidget && r11 != constraintWidget3) {
                i18 = 8;
            }
            ConstraintAnchor constraintAnchor6 = constraintAnchor4.f18222f;
            if (constraintAnchor6 != null) {
                if (r11 == constraintWidget3) {
                    eVar.i(constraintAnchor4.f18225i, constraintAnchor6.f18225i, i19, 6);
                } else {
                    eVar.i(constraintAnchor4.f18225i, constraintAnchor6.f18225i, i19, 8);
                }
                if (z17 && !z12) {
                    i18 = 5;
                }
                eVar.e(constraintAnchor4.f18225i, constraintAnchor4.f18222f.f18225i, i19, (r11 == constraintWidget3 && z12 && r11.w0(i15)) ? 5 : i18);
            } else {
                constraintWidget = constraintWidget;
            }
            if (z13) {
                if (r11.i0() == 8 || r11.f18255b0[i15] != dimensionBehaviour2) {
                    i14 = 0;
                } else {
                    ConstraintAnchor[] constraintAnchorArr = r11.Y;
                    i14 = 0;
                    eVar.i(constraintAnchorArr[i11 + 1].f18225i, constraintAnchorArr[i11].f18225i, 0, 5);
                }
                eVar.i(r11.Y[i11].f18225i, dVar.Y[i11].f18225i, i14, 8);
            }
            ConstraintAnchor constraintAnchor7 = r11.Y[i11 + 1].f18222f;
            if (constraintAnchor7 != null) {
                ConstraintWidget constraintWidget6 = constraintAnchor7.f18220d;
                ConstraintAnchor constraintAnchor8 = constraintWidget6.Y[i11].f18222f;
                if (constraintAnchor8 != null && constraintAnchor8.f18220d == r11) {
                    obj = constraintWidget6;
                }
            }
            if (obj != null) {
                r11 = obj;
                z15 = z15;
            } else {
                z15 = true;
            }
            constraintWidget5 = constraintWidget5;
            f10 = f11;
            constraintWidget = constraintWidget;
            r11 = r11;
        }
        ConstraintWidget constraintWidget7 = constraintWidget5;
        float f12 = f10;
        ConstraintWidget constraintWidget8 = constraintWidget;
        if (constraintWidget4 != null) {
            int i20 = i11 + 1;
            if (constraintWidget2.Y[i20].f18222f != null) {
                ConstraintAnchor constraintAnchor9 = constraintWidget4.Y[i20];
                if ((constraintWidget4.f18255b0[i15] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget4.f18300y[i15] == 0) && !z12) {
                    ConstraintAnchor constraintAnchor10 = constraintAnchor9.f18222f;
                    if (constraintAnchor10.f18220d == dVar) {
                        eVar.e(constraintAnchor9.f18225i, constraintAnchor10.f18225i, -constraintAnchor9.g(), 5);
                    } else if (z12) {
                        constraintAnchor3 = constraintAnchor9.f18222f;
                        if (constraintAnchor3.f18220d == dVar) {
                            eVar.e(constraintAnchor9.f18225i, constraintAnchor3.f18225i, -constraintAnchor9.g(), 4);
                        }
                    }
                } else if (z12) {
                    constraintAnchor3 = constraintAnchor9.f18222f;
                    if (constraintAnchor3.f18220d == dVar) {
                        eVar.e(constraintAnchor9.f18225i, constraintAnchor3.f18225i, -constraintAnchor9.g(), 4);
                    }
                }
                eVar.k(constraintAnchor9.f18225i, constraintWidget2.Y[i20].f18222f.f18225i, -constraintAnchor9.g(), 6);
            }
        }
        if (z13) {
            int i21 = i11 + 1;
            SolverVariable solverVariable5 = dVar.Y[i21].f18225i;
            ConstraintAnchor constraintAnchor11 = constraintWidget2.Y[i21];
            eVar.i(solverVariable5, constraintAnchor11.f18225i, constraintAnchor11.g(), 8);
        }
        ArrayList<ConstraintWidget> arrayList = cVar.f18415h;
        if (arrayList != null && (size = arrayList.size()) > 1) {
            float f13 = (!cVar.f18425r || cVar.f18427t) ? f12 : cVar.f18417j;
            float f14 = 0.0f;
            float f15 = 0.0f;
            ConstraintWidget constraintWidget9 = null;
            int i22 = 0;
            while (i22 < size) {
                ConstraintWidget constraintWidget10 = arrayList.get(i22);
                float f16 = constraintWidget10.M0[i15];
                if (f16 < f14) {
                    if (cVar.f18427t) {
                        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget10.Y;
                        eVar.e(constraintAnchorArr2[i11 + 1].f18225i, constraintAnchorArr2[i11].f18225i, 0, 4);
                    } else {
                        f16 = 1.0f;
                        f14 = 0.0f;
                    }
                    arrayList = arrayList;
                    size = size;
                    i22++;
                    size = size;
                    arrayList = arrayList;
                    f14 = 0.0f;
                }
                if (f16 == f14) {
                    ConstraintAnchor[] constraintAnchorArr3 = constraintWidget10.Y;
                    eVar.e(constraintAnchorArr3[i11 + 1].f18225i, constraintAnchorArr3[i11].f18225i, 0, 8);
                    arrayList = arrayList;
                    size = size;
                } else {
                    if (constraintWidget9 != null) {
                        ConstraintAnchor[] constraintAnchorArr4 = constraintWidget9.Y;
                        SolverVariable solverVariable6 = constraintAnchorArr4[i11].f18225i;
                        int i23 = i11 + 1;
                        SolverVariable solverVariable7 = constraintAnchorArr4[i23].f18225i;
                        ConstraintAnchor[] constraintAnchorArr5 = constraintWidget10.Y;
                        SolverVariable solverVariable8 = constraintAnchorArr5[i11].f18225i;
                        SolverVariable solverVariable9 = constraintAnchorArr5[i23].f18225i;
                        androidx.constraintlayout.core.b bVarV = eVar.v();
                        bVarV.p(f15, f13, f16, solverVariable6, solverVariable7, solverVariable8, solverVariable9);
                        eVar.d(bVarV);
                    }
                    constraintWidget9 = constraintWidget10;
                    f15 = f16;
                }
                i22++;
                size = size;
                arrayList = arrayList;
                f14 = 0.0f;
            }
        }
        if (constraintWidget3 != null && (constraintWidget3 == constraintWidget4 || z12)) {
            ConstraintAnchor constraintAnchor12 = constraintWidget8.Y[i11];
            int i24 = i11 + 1;
            ConstraintAnchor constraintAnchor13 = constraintWidget2.Y[i24];
            ConstraintAnchor constraintAnchor14 = constraintAnchor12.f18222f;
            SolverVariable solverVariable10 = constraintAnchor14 != null ? constraintAnchor14.f18225i : null;
            ConstraintAnchor constraintAnchor15 = constraintAnchor13.f18222f;
            SolverVariable solverVariable11 = constraintAnchor15 != null ? constraintAnchor15.f18225i : null;
            ConstraintAnchor constraintAnchor16 = constraintWidget3.Y[i11];
            if (constraintWidget4 != null) {
                constraintAnchor13 = constraintWidget4.Y[i24];
            }
            if (solverVariable10 != null && solverVariable11 != null) {
                eVar.c(constraintAnchor16.f18225i, solverVariable10, constraintAnchor16.g(), i15 == 0 ? constraintWidget7.f18285q0 : constraintWidget7.f18287r0, solverVariable11, constraintAnchor13.f18225i, constraintAnchor13.g(), 7);
            }
        } else if (!z16 || constraintWidget3 == null) {
            int i25 = 8;
            if (z14 && constraintWidget3 != null) {
                int i26 = cVar.f18417j;
                boolean z18 = i26 > 0 && cVar.f18416i == i26;
                ConstraintWidget constraintWidget11 = constraintWidget3;
                ConstraintWidget constraintWidget12 = constraintWidget11;
                while (constraintWidget12 != null) {
                    ConstraintWidget constraintWidget13 = constraintWidget12.O0[i15];
                    while (constraintWidget13 != null && constraintWidget13.i0() == i25) {
                        constraintWidget13 = constraintWidget13.O0[i15];
                    }
                    if (constraintWidget12 == constraintWidget3 || constraintWidget12 == constraintWidget4 || constraintWidget13 == null) {
                        constraintWidget11 = constraintWidget11;
                        i13 = i25;
                    } else {
                        ConstraintWidget constraintWidget14 = constraintWidget13 == constraintWidget4 ? null : constraintWidget13;
                        ConstraintAnchor constraintAnchor17 = constraintWidget12.Y[i11];
                        SolverVariable solverVariable12 = constraintAnchor17.f18225i;
                        ConstraintAnchor constraintAnchor18 = constraintAnchor17.f18222f;
                        if (constraintAnchor18 != null) {
                            SolverVariable solverVariable13 = constraintAnchor18.f18225i;
                        }
                        int i27 = i11 + 1;
                        SolverVariable solverVariable14 = constraintWidget11.Y[i27].f18225i;
                        int iG2 = constraintAnchor17.g();
                        int iG3 = constraintWidget12.Y[i27].g();
                        if (constraintWidget14 != null) {
                            constraintAnchor = constraintWidget14.Y[i11];
                            SolverVariable solverVariable15 = constraintAnchor.f18225i;
                            ConstraintAnchor constraintAnchor19 = constraintAnchor.f18222f;
                            solverVariable2 = constraintAnchor19 != null ? constraintAnchor19.f18225i : null;
                            solverVariable = solverVariable15;
                        } else {
                            constraintAnchor = constraintWidget4.Y[i11];
                            solverVariable = constraintAnchor != null ? constraintAnchor.f18225i : null;
                            solverVariable2 = constraintWidget12.Y[i27].f18225i;
                        }
                        if (constraintAnchor != null) {
                            iG3 += constraintAnchor.g();
                        }
                        int i28 = iG3;
                        int iG4 = constraintWidget11.Y[i27].g() + iG2;
                        int i29 = z18 ? 8 : 4;
                        if (solverVariable12 == null || solverVariable14 == null || solverVariable == null || solverVariable2 == null) {
                            i13 = 8;
                        } else {
                            i13 = 8;
                            eVar.c(solverVariable12, solverVariable14, iG4, 0.5f, solverVariable, solverVariable2, i28, i29);
                        }
                        constraintWidget13 = constraintWidget14;
                    }
                    constraintWidget11 = constraintWidget12.i0() != i13 ? constraintWidget12 : constraintWidget11;
                    constraintWidget12 = constraintWidget13;
                    i25 = i13;
                    i15 = i10;
                }
                ConstraintAnchor constraintAnchor20 = constraintWidget3.Y[i11];
                ConstraintAnchor constraintAnchor21 = constraintWidget8.Y[i11].f18222f;
                int i30 = i11 + 1;
                ConstraintAnchor constraintAnchor22 = constraintWidget4.Y[i30];
                ConstraintAnchor constraintAnchor23 = constraintWidget2.Y[i30].f18222f;
                if (constraintAnchor21 == null) {
                    i12 = 5;
                } else if (constraintWidget3 != constraintWidget4) {
                    i12 = 5;
                    eVar.e(constraintAnchor20.f18225i, constraintAnchor21.f18225i, constraintAnchor20.g(), 5);
                } else {
                    i12 = 5;
                    if (constraintAnchor23 != null) {
                        eVar.c(constraintAnchor20.f18225i, constraintAnchor21.f18225i, constraintAnchor20.g(), 0.5f, constraintAnchor22.f18225i, constraintAnchor23.f18225i, constraintAnchor22.g(), 5);
                    }
                }
                if (constraintAnchor23 != null && constraintWidget3 != constraintWidget4) {
                    eVar.e(constraintAnchor22.f18225i, constraintAnchor23.f18225i, -constraintAnchor22.g(), i12);
                }
            }
        } else {
            int i31 = cVar.f18417j;
            boolean z19 = i31 > 0 && cVar.f18416i == i31;
            ConstraintWidget constraintWidget15 = constraintWidget3;
            ConstraintWidget constraintWidget16 = constraintWidget15;
            while (constraintWidget16 != null) {
                ConstraintWidget constraintWidget17 = constraintWidget16.O0[i15];
                while (constraintWidget17 != null && constraintWidget17.i0() == 8) {
                    constraintWidget17 = constraintWidget17.O0[i15];
                }
                if (constraintWidget17 != null || constraintWidget16 == constraintWidget4) {
                    ConstraintAnchor constraintAnchor24 = constraintWidget16.Y[i11];
                    SolverVariable solverVariable16 = constraintAnchor24.f18225i;
                    ConstraintAnchor constraintAnchor25 = constraintAnchor24.f18222f;
                    SolverVariable solverVariable17 = constraintAnchor25 != null ? constraintAnchor25.f18225i : null;
                    if (constraintWidget15 != constraintWidget16) {
                        solverVariable17 = constraintWidget15.Y[i11 + 1].f18225i;
                    } else if (constraintWidget16 == constraintWidget3) {
                        ConstraintAnchor constraintAnchor26 = constraintWidget8.Y[i11].f18222f;
                        solverVariable17 = constraintAnchor26 != null ? constraintAnchor26.f18225i : null;
                    }
                    int iG5 = constraintAnchor24.g();
                    int i32 = i11 + 1;
                    int iG6 = constraintWidget16.Y[i32].g();
                    if (constraintWidget17 != null) {
                        constraintAnchor2 = constraintWidget17.Y[i11];
                        solverVariable3 = constraintAnchor2.f18225i;
                    } else {
                        constraintAnchor2 = constraintWidget2.Y[i32].f18222f;
                        if (constraintAnchor2 != null) {
                            solverVariable3 = constraintAnchor2.f18225i;
                        } else {
                            solverVariable3 = null;
                        }
                        SolverVariable solverVariable18 = constraintWidget16.Y[i32].f18225i;
                        if (constraintAnchor2 != null) {
                            iG6 += constraintAnchor2.g();
                        }
                        int iG7 = iG5 + constraintWidget15.Y[i32].g();
                        if (solverVariable16 == null && solverVariable17 != null && solverVariable3 != null && solverVariable18 != null) {
                            if (constraintWidget16 == constraintWidget3) {
                                iG7 = constraintWidget3.Y[i11].g();
                            }
                            constraintWidget17 = constraintWidget17;
                            eVar.c(solverVariable16, solverVariable17, iG7, 0.5f, solverVariable3, solverVariable18, constraintWidget16 == constraintWidget4 ? constraintWidget4.Y[i32].g() : iG6, z19 ? 8 : 5);
                        }
                        if (constraintWidget16.i0() != 8) {
                            constraintWidget16 = constraintWidget15;
                        }
                        constraintWidget15 = constraintWidget16;
                        constraintWidget16 = constraintWidget17;
                    }
                    SolverVariable solverVariable19 = constraintWidget16.Y[i32].f18225i;
                    if (constraintAnchor2 != null) {
                        iG6 += constraintAnchor2.g();
                    }
                    int iG8 = iG5 + constraintWidget15.Y[i32].g();
                    if (solverVariable16 == null) {
                    }
                }
                if (constraintWidget16.i0() != 8) {
                    constraintWidget16 = constraintWidget15;
                }
                constraintWidget15 = constraintWidget16;
                constraintWidget16 = constraintWidget17;
            }
        }
        if ((!z16 && !z14) || constraintWidget3 == null || constraintWidget3 == constraintWidget4) {
            return;
        }
        ConstraintAnchor[] constraintAnchorArr6 = constraintWidget3.Y;
        ConstraintAnchor constraintAnchor27 = constraintAnchorArr6[i11];
        if (constraintWidget4 == null) {
            constraintWidget4 = constraintWidget3;
        }
        int i33 = i11 + 1;
        ConstraintAnchor constraintAnchor28 = constraintWidget4.Y[i33];
        ConstraintAnchor constraintAnchor29 = constraintAnchor27.f18222f;
        SolverVariable solverVariable20 = constraintAnchor29 != null ? constraintAnchor29.f18225i : null;
        ConstraintAnchor constraintAnchor30 = constraintAnchor28.f18222f;
        if (constraintAnchor30 != null) {
            solverVariable4 = constraintAnchor30.f18225i;
        } else {
            r10 = 0;
        }
        if (constraintWidget2 != constraintWidget4) {
            ConstraintAnchor constraintAnchor31 = constraintWidget2.Y[i33].f18222f;
            if (constraintAnchor31 != null) {
                r10 = solverVariable4;
                obj = constraintAnchor31.f18225i;
            }
            r10 = solverVariable4;
            r10 = obj;
        }
        if (constraintWidget3 == constraintWidget4) {
            constraintAnchor28 = constraintAnchorArr6[i33];
        }
        if (solverVariable20 == null || r10 == 0) {
            return;
        }
        eVar.c(constraintAnchor27.f18225i, solverVariable20, constraintAnchor27.g(), 0.5f, r10, constraintAnchor28.f18225i, constraintWidget4.Y[i33].g(), 5);
    }

    public static void b(d dVar, androidx.constraintlayout.core.e eVar, ArrayList<ConstraintWidget> arrayList, int i10) {
        c[] cVarArr;
        int i11;
        int i12;
        if (i10 == 0) {
            i12 = dVar.L1;
            cVarArr = dVar.O1;
            i11 = 0;
        } else {
            int i13 = dVar.M1;
            cVarArr = dVar.N1;
            i11 = 2;
            i12 = i13;
        }
        for (int i14 = 0; i14 < i12; i14++) {
            c cVar = cVarArr[i14];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.f18408a)) {
                a(dVar, eVar, i10, i11, cVar);
            }
        }
    }
}
