package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: ChainRun.java */
/* JADX INFO: loaded from: classes.dex */
public class c extends WidgetRun {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    ArrayList<WidgetRun> f18353k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f18354l;

    public c(ConstraintWidget constraintWidget, int i10) {
        super(constraintWidget);
        this.f18353k = new ArrayList<>();
        this.f18323f = i10;
        u();
    }

    private void u() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2 = this.f18319b;
        ConstraintWidget constraintWidgetV = constraintWidget2.V(this.f18323f);
        while (true) {
            ConstraintWidget constraintWidget3 = constraintWidgetV;
            constraintWidget = constraintWidget2;
            constraintWidget2 = constraintWidget3;
            if (constraintWidget2 == null) {
                break;
            } else {
                constraintWidgetV = constraintWidget2.V(this.f18323f);
            }
        }
        this.f18319b = constraintWidget;
        this.f18353k.add(constraintWidget.a0(this.f18323f));
        ConstraintWidget constraintWidgetR = constraintWidget.R(this.f18323f);
        while (constraintWidgetR != null) {
            this.f18353k.add(constraintWidgetR.a0(this.f18323f));
            constraintWidgetR = constraintWidgetR.R(this.f18323f);
        }
        for (WidgetRun widgetRun : this.f18353k) {
            int i10 = this.f18323f;
            if (i10 == 0) {
                widgetRun.f18319b.f18256c = this;
            } else if (i10 == 1) {
                widgetRun.f18319b.f18258d = this;
            }
        }
        if ((this.f18323f == 0 && ((androidx.constraintlayout.core.widgets.d) this.f18319b.U()).I2()) && this.f18353k.size() > 1) {
            ArrayList<WidgetRun> arrayList = this.f18353k;
            this.f18319b = arrayList.get(arrayList.size() - 1).f18319b;
        }
        this.f18354l = this.f18323f == 0 ? this.f18319b.G() : this.f18319b.f0();
    }

    private ConstraintWidget v() {
        for (int i10 = 0; i10 < this.f18353k.size(); i10++) {
            WidgetRun widgetRun = this.f18353k.get(i10);
            if (widgetRun.f18319b.i0() != 8) {
                return widgetRun.f18319b;
            }
        }
        return null;
    }

    private ConstraintWidget w() {
        for (int size = this.f18353k.size() - 1; size >= 0; size--) {
            WidgetRun widgetRun = this.f18353k.get(size);
            if (widgetRun.f18319b.i0() != 8) {
                return widgetRun.f18319b;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01be  */
    /* JADX WARN: Code duplicated, block: B:294:0x00f4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ec A[ADDED_TO_REGION] */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        boolean z10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        float f11;
        if (this.f18325h.f18315j && this.f18326i.f18315j) {
            ConstraintWidget constraintWidgetU = this.f18319b.U();
            boolean zI2 = constraintWidgetU instanceof androidx.constraintlayout.core.widgets.d ? ((androidx.constraintlayout.core.widgets.d) constraintWidgetU).I2() : false;
            int i23 = this.f18326i.f18312g - this.f18325h.f18312g;
            int size = this.f18353k.size();
            int i24 = 0;
            while (true) {
                i10 = -1;
                i11 = 8;
                if (i24 >= size) {
                    i24 = -1;
                    break;
                } else if (this.f18353k.get(i24).f18319b.i0() != 8) {
                    break;
                } else {
                    i24++;
                }
            }
            int i25 = size - 1;
            for (int i26 = i25; i26 >= 0; i26--) {
                if (this.f18353k.get(i26).f18319b.i0() != 8) {
                    i10 = i26;
                    break;
                }
            }
            int i27 = 0;
            while (true) {
                if (i27 >= 2) {
                    i12 = 0;
                    i13 = 0;
                    i14 = 0;
                    f10 = 0.0f;
                    break;
                }
                int i28 = 0;
                i13 = 0;
                i14 = 0;
                int i29 = 0;
                f10 = 0.0f;
                while (i28 < size) {
                    WidgetRun widgetRun = this.f18353k.get(i28);
                    if (widgetRun.f18319b.i0() != i11) {
                        i29++;
                        if (i28 > 0 && i28 >= i24) {
                            i13 += widgetRun.f18325h.f18311f;
                        }
                        f fVar = widgetRun.f18322e;
                        int i30 = fVar.f18312g;
                        boolean z11 = widgetRun.f18321d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (z11) {
                            int i31 = this.f18323f;
                            if (i31 == 0 && !widgetRun.f18319b.f18260e.f18322e.f18315j) {
                                return;
                            }
                            if (i31 == 1 && !widgetRun.f18319b.f18262f.f18322e.f18315j) {
                                return;
                            } else {
                                i21 = i30;
                            }
                        } else {
                            i21 = i30;
                            if (widgetRun.f18318a == 1 && i27 == 0) {
                                i22 = fVar.f18365m;
                                i14++;
                            } else {
                                if (fVar.f18315j) {
                                    i22 = i21;
                                }
                                if (z11) {
                                    i13 += i22;
                                } else {
                                    i14++;
                                    f11 = widgetRun.f18319b.M0[this.f18323f];
                                    if (f11 >= 0.0f) {
                                        f10 += f11;
                                    }
                                }
                                if (i28 >= i25 && i28 < i10) {
                                    i13 += -widgetRun.f18326i.f18311f;
                                }
                            }
                            z11 = true;
                            if (z11) {
                                i14++;
                                f11 = widgetRun.f18319b.M0[this.f18323f];
                                if (f11 >= 0.0f) {
                                    f10 += f11;
                                }
                            } else {
                                i13 += i22;
                            }
                            if (i28 >= i25) {
                            }
                        }
                        i22 = i21;
                        if (z11) {
                            i14++;
                            f11 = widgetRun.f18319b.M0[this.f18323f];
                            if (f11 >= 0.0f) {
                                f10 += f11;
                            }
                        } else {
                            i13 += i22;
                        }
                        if (i28 >= i25) {
                        }
                    }
                    i28++;
                    i11 = 8;
                }
                if (i13 < i23 || i14 == 0) {
                    i12 = i29;
                    break;
                } else {
                    i27++;
                    i11 = 8;
                }
            }
            int i32 = this.f18325h.f18312g;
            if (zI2) {
                i32 = this.f18326i.f18312g;
            }
            if (i13 > i23) {
                i32 = zI2 ? i32 + ((int) (((i13 - i23) / 2.0f) + 0.5f)) : i32 - ((int) (((i13 - i23) / 2.0f) + 0.5f));
            }
            if (i14 > 0) {
                float f12 = i23 - i13;
                int i33 = (int) ((f12 / i14) + 0.5f);
                int i34 = 0;
                int i35 = 0;
                while (i34 < size) {
                    WidgetRun widgetRun2 = this.f18353k.get(i34);
                    int i36 = i33;
                    int i37 = i13;
                    if (widgetRun2.f18319b.i0() != 8 && widgetRun2.f18321d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        f fVar2 = widgetRun2.f18322e;
                        if (fVar2.f18315j) {
                            zI2 = zI2;
                            i32 = i32;
                            f12 = f12;
                        } else {
                            int i38 = f10 > 0.0f ? (int) (((widgetRun2.f18319b.M0[this.f18323f] * f12) / f10) + 0.5f) : i36;
                            if (this.f18323f == 0) {
                                ConstraintWidget constraintWidget = widgetRun2.f18319b;
                                i20 = constraintWidget.A;
                                i19 = constraintWidget.f18302z;
                            } else {
                                ConstraintWidget constraintWidget2 = widgetRun2.f18319b;
                                int i39 = constraintWidget2.D;
                                i19 = constraintWidget2.C;
                                i20 = i39;
                            }
                            int iMax = Math.max(i19, widgetRun2.f18318a == 1 ? Math.min(i38, fVar2.f18365m) : i38);
                            if (i20 > 0) {
                                iMax = Math.min(i20, iMax);
                            }
                            if (iMax != i38) {
                                i35++;
                                i38 = iMax;
                            }
                            widgetRun2.f18322e.e(i38);
                        }
                    } else {
                        zI2 = zI2;
                        i32 = i32;
                        f12 = f12;
                    }
                    i34++;
                    i33 = i36;
                    i13 = i37;
                    i32 = i32;
                    f12 = f12;
                    zI2 = zI2;
                    i12 = i12;
                }
                z10 = zI2;
                i15 = i12;
                i16 = i32;
                int i40 = i13;
                if (i35 > 0) {
                    i14 -= i35;
                    int i41 = 0;
                    for (int i42 = 0; i42 < size; i42++) {
                        WidgetRun widgetRun3 = this.f18353k.get(i42);
                        if (widgetRun3.f18319b.i0() != 8) {
                            if (i42 > 0 && i42 >= i24) {
                                i41 += widgetRun3.f18325h.f18311f;
                            }
                            i41 += widgetRun3.f18322e.f18312g;
                            if (i42 < i25 && i42 < i10) {
                                i41 += -widgetRun3.f18326i.f18311f;
                            }
                        }
                    }
                    i13 = i41;
                } else {
                    i13 = i40;
                }
                i18 = 2;
                if (this.f18354l == 2 && i35 == 0) {
                    i17 = 0;
                    this.f18354l = 0;
                } else {
                    i17 = 0;
                }
            } else {
                z10 = zI2;
                i15 = i12;
                i16 = i32;
                i17 = 0;
                i18 = 2;
            }
            if (i13 > i23) {
                this.f18354l = i18;
            }
            if (i15 > 0 && i14 == 0 && i24 == i10) {
                this.f18354l = i18;
            }
            int i43 = this.f18354l;
            if (i43 == 1) {
                int i44 = i15;
                int i45 = i44 > 1 ? (i23 - i13) / (i44 - 1) : i44 == 1 ? (i23 - i13) / 2 : i17;
                if (i14 > 0) {
                    i45 = i17;
                }
                int i46 = i16;
                for (int i47 = i17; i47 < size; i47++) {
                    WidgetRun widgetRun4 = this.f18353k.get(z10 ? size - (i47 + 1) : i47);
                    if (widgetRun4.f18319b.i0() == 8) {
                        widgetRun4.f18325h.e(i46);
                        widgetRun4.f18326i.e(i46);
                    } else {
                        if (i47 > 0) {
                            i46 = z10 ? i46 - i45 : i46 + i45;
                        }
                        if (i47 > 0 && i47 >= i24) {
                            i46 = z10 ? i46 - widgetRun4.f18325h.f18311f : i46 + widgetRun4.f18325h.f18311f;
                        }
                        if (z10) {
                            widgetRun4.f18326i.e(i46);
                        } else {
                            widgetRun4.f18325h.e(i46);
                        }
                        f fVar3 = widgetRun4.f18322e;
                        int i48 = fVar3.f18312g;
                        if (widgetRun4.f18321d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun4.f18318a == 1) {
                            i48 = fVar3.f18365m;
                        }
                        i46 = z10 ? i46 - i48 : i46 + i48;
                        if (z10) {
                            widgetRun4.f18325h.e(i46);
                        } else {
                            widgetRun4.f18326i.e(i46);
                        }
                        widgetRun4.f18324g = true;
                        if (i47 < i25 && i47 < i10) {
                            i46 = z10 ? i46 - (-widgetRun4.f18326i.f18311f) : i46 + (-widgetRun4.f18326i.f18311f);
                        }
                    }
                }
                return;
            }
            int i49 = i15;
            if (i43 == 0) {
                int i50 = (i23 - i13) / (i49 + 1);
                if (i14 > 0) {
                    i50 = i17;
                }
                int i51 = i16;
                for (int i52 = i17; i52 < size; i52++) {
                    WidgetRun widgetRun5 = this.f18353k.get(z10 ? size - (i52 + 1) : i52);
                    if (widgetRun5.f18319b.i0() == 8) {
                        widgetRun5.f18325h.e(i51);
                        widgetRun5.f18326i.e(i51);
                    } else {
                        int i53 = z10 ? i51 - i50 : i51 + i50;
                        if (i52 > 0 && i52 >= i24) {
                            i53 = z10 ? i53 - widgetRun5.f18325h.f18311f : i53 + widgetRun5.f18325h.f18311f;
                        }
                        if (z10) {
                            widgetRun5.f18326i.e(i53);
                        } else {
                            widgetRun5.f18325h.e(i53);
                        }
                        f fVar4 = widgetRun5.f18322e;
                        int iMin = fVar4.f18312g;
                        if (widgetRun5.f18321d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun5.f18318a == 1) {
                            iMin = Math.min(iMin, fVar4.f18365m);
                        }
                        i51 = z10 ? i53 - iMin : i53 + iMin;
                        if (z10) {
                            widgetRun5.f18325h.e(i51);
                        } else {
                            widgetRun5.f18326i.e(i51);
                        }
                        if (i52 < i25 && i52 < i10) {
                            i51 = z10 ? i51 - (-widgetRun5.f18326i.f18311f) : i51 + (-widgetRun5.f18326i.f18311f);
                        }
                    }
                }
                return;
            }
            if (i43 == 2) {
                float fE = this.f18323f == 0 ? this.f18319b.E() : this.f18319b.d0();
                if (z10) {
                    fE = 1.0f - fE;
                }
                int i54 = (int) (((i23 - i13) * fE) + 0.5f);
                if (i54 < 0 || i14 > 0) {
                    i54 = i17;
                }
                int i55 = z10 ? i16 - i54 : i16 + i54;
                for (int i56 = i17; i56 < size; i56++) {
                    WidgetRun widgetRun6 = this.f18353k.get(z10 ? size - (i56 + 1) : i56);
                    if (widgetRun6.f18319b.i0() == 8) {
                        widgetRun6.f18325h.e(i55);
                        widgetRun6.f18326i.e(i55);
                    } else {
                        if (i56 > 0 && i56 >= i24) {
                            i55 = z10 ? i55 - widgetRun6.f18325h.f18311f : i55 + widgetRun6.f18325h.f18311f;
                        }
                        if (z10) {
                            widgetRun6.f18326i.e(i55);
                        } else {
                            widgetRun6.f18325h.e(i55);
                        }
                        f fVar5 = widgetRun6.f18322e;
                        int i57 = fVar5.f18312g;
                        if (widgetRun6.f18321d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun6.f18318a == 1) {
                            i57 = fVar5.f18365m;
                        }
                        i55 = z10 ? i55 - i57 : i55 + i57;
                        if (z10) {
                            widgetRun6.f18325h.e(i55);
                        } else {
                            widgetRun6.f18326i.e(i55);
                        }
                        if (i56 < i25 && i56 < i10) {
                            i55 = z10 ? i55 - (-widgetRun6.f18326i.f18311f) : i55 + (-widgetRun6.f18326i.f18311f);
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void d() {
        Iterator<WidgetRun> it = this.f18353k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.f18353k.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = this.f18353k.get(0).f18319b;
        ConstraintWidget constraintWidget2 = this.f18353k.get(size - 1).f18319b;
        if (this.f18323f == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.Q;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.S;
            DependencyNode dependencyNodeI = i(constraintAnchor, 0);
            int iG = constraintAnchor.g();
            ConstraintWidget constraintWidgetV = v();
            if (constraintWidgetV != null) {
                iG = constraintWidgetV.Q.g();
            }
            if (dependencyNodeI != null) {
                b(this.f18325h, dependencyNodeI, iG);
            }
            DependencyNode dependencyNodeI2 = i(constraintAnchor2, 0);
            int iG2 = constraintAnchor2.g();
            ConstraintWidget constraintWidgetW = w();
            if (constraintWidgetW != null) {
                iG2 = constraintWidgetW.S.g();
            }
            if (dependencyNodeI2 != null) {
                b(this.f18326i, dependencyNodeI2, -iG2);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.R;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.T;
            DependencyNode dependencyNodeI3 = i(constraintAnchor3, 1);
            int iG3 = constraintAnchor3.g();
            ConstraintWidget constraintWidgetV2 = v();
            if (constraintWidgetV2 != null) {
                iG3 = constraintWidgetV2.R.g();
            }
            if (dependencyNodeI3 != null) {
                b(this.f18325h, dependencyNodeI3, iG3);
            }
            DependencyNode dependencyNodeI4 = i(constraintAnchor4, 1);
            int iG4 = constraintAnchor4.g();
            ConstraintWidget constraintWidgetW2 = w();
            if (constraintWidgetW2 != null) {
                iG4 = constraintWidgetW2.T.g();
            }
            if (dependencyNodeI4 != null) {
                b(this.f18326i, dependencyNodeI4, -iG4);
            }
        }
        this.f18325h.f18306a = this;
        this.f18326i.f18306a = this;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void e() {
        for (int i10 = 0; i10 < this.f18353k.size(); i10++) {
            this.f18353k.get(i10).e();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void f() {
        this.f18320c = null;
        Iterator<WidgetRun> it = this.f18353k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public long j() {
        int size = this.f18353k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            WidgetRun widgetRun = this.f18353k.get(i10);
            j10 = j10 + ((long) widgetRun.f18325h.f18311f) + widgetRun.j() + ((long) widgetRun.f18326i.f18311f);
        }
        return j10;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void n() {
        this.f18325h.f18315j = false;
        this.f18326i.f18315j = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    boolean p() {
        int size = this.f18353k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f18353k.get(i10).p()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f18323f == 0 ? "horizontal : " : "vertical : ");
        for (WidgetRun widgetRun : this.f18353k) {
            sb2.append("<");
            sb2.append(widgetRun);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
