package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u001aa\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002*\u0010\b\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a.\u0010\u0015\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a.\u0010\u0016\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a.\u0010\u0017\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a.\u0010\u0018\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001at\u0010\"\u001a\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u001d\u0010\u001c\u001a\u0019\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001a¢\u0006\u0002\b\u001b2\u001d\u0010\u001d\u001a\u0019\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001a¢\u0006\u0002\b\u001b2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0000H\u0002\u001aE\u0010$\u001a\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u001d\u0010#\u001a\u0019\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001a¢\u0006\u0002\b\u001b2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0002\u001ad\u0010&\u001a\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u001d\u0010#\u001a\u0019\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001a¢\u0006\u0002\b\u001b2\u001d\u0010\f\u001a\u0019\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001a¢\u0006\u0002\b\u001b2\u0006\u0010%\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0002\"\u001a\u0010*\u001a\u0004\u0018\u00010'*\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)\"\u001a\u0010.\u001a\u00020+*\u0004\u0018\u00010'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-\"\u001a\u00102\u001a\u00020/*\u0004\u0018\u00010'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101\"\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104\"\u001a\u00106\u001a\u00020/*\u0004\u0018\u00010'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00067"}, d2 = {"Landroidx/compose/foundation/layout/LayoutOrientation;", "orientation", "Lkotlin/Function5;", "", "", "Landroidx/compose/ui/unit/LayoutDirection;", "Ls1/e;", "Lkotlin/b2;", "arrangement", "Ls1/h;", "arrangementSpacing", "Landroidx/compose/foundation/layout/SizeMode;", "crossAxisSize", "Landroidx/compose/foundation/layout/q;", "crossAxisAlignment", "Landroidx/compose/ui/layout/i0;", "y", "(Landroidx/compose/foundation/layout/LayoutOrientation;Lyh/s;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/q;)Landroidx/compose/ui/layout/i0;", "Lkotlin/Function3;", "", "Landroidx/compose/ui/layout/m;", "d", ak.aF, "b", ak.av, "children", "Lkotlin/Function2;", "Lkotlin/t;", "intrinsicMainSize", "intrinsicCrossSize", "crossAxisAvailable", "mainAxisSpacing", "layoutOrientation", "intrinsicOrientation", RXScreenCaptureService.KEY_WIDTH, "mainAxisSize", "v", "mainAxisAvailable", ak.aG, "Landroidx/compose/foundation/layout/v0;", "r", "(Landroidx/compose/ui/layout/m;)Landroidx/compose/foundation/layout/v0;", "data", "", "t", "(Landroidx/compose/foundation/layout/v0;)F", "weight", "", ak.aB, "(Landroidx/compose/foundation/layout/v0;)Z", "fill", "q", "(Landroidx/compose/foundation/layout/v0;)Landroidx/compose/foundation/layout/q;", "x", "isRelative", "foundation-layout_release"}, k = 2, mv = {1, 7, 1})
public final class RowColumnImplKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int A(androidx.compose.ui.layout.e1 e1Var, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? e1Var.getWidth() : e1Var.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yh.q<List<? extends androidx.compose.ui.layout.m>, Integer, Integer, Integer> a(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.f5997a.a() : IntrinsicMeasureBlocks.f5997a.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yh.q<List<? extends androidx.compose.ui.layout.m>, Integer, Integer, Integer> b(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.f5997a.b() : IntrinsicMeasureBlocks.f5997a.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yh.q<List<? extends androidx.compose.ui.layout.m>, Integer, Integer, Integer> c(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.f5997a.c() : IntrinsicMeasureBlocks.f5997a.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yh.q<List<? extends androidx.compose.ui.layout.m>, Integer, Integer, Integer> d(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.f5997a.d() : IntrinsicMeasureBlocks.f5997a.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q q(RowColumnParentData v0Var) {
        if (v0Var != null) {
            return v0Var.f();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RowColumnParentData r(androidx.compose.ui.layout.m mVar) {
        Object objB = mVar.b();
        if (objB instanceof RowColumnParentData) {
            return (RowColumnParentData) objB;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(RowColumnParentData v0Var) {
        if (v0Var != null) {
            return v0Var.g();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float t(RowColumnParentData v0Var) {
        if (v0Var != null) {
            return v0Var.h();
        }
        return 0.0f;
    }

    private static final int u(List<? extends androidx.compose.ui.layout.m> list, yh.p<? super androidx.compose.ui.layout.m, ? super Integer, Integer> pVar, yh.p<? super androidx.compose.ui.layout.m, ? super Integer, Integer> pVar2, int i10, int i11) {
        int iMin = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        float f10 = 0.0f;
        int iMax = 0;
        for (int i12 = 0; i12 < size; i12++) {
            androidx.compose.ui.layout.m mVar = list.get(i12);
            float fT = t(r(mVar));
            if (fT == 0.0f) {
                int iMin2 = Math.min(pVar.invoke(mVar, Integer.MAX_VALUE).intValue(), i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, pVar2.invoke(mVar, Integer.valueOf(iMin2)).intValue());
            } else if (fT > 0.0f) {
                f10 += fT;
            }
        }
        int iL0 = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : di.d.L0(Math.max(i10 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            androidx.compose.ui.layout.m mVar2 = list.get(i13);
            float fT2 = t(r(mVar2));
            if (fT2 > 0.0f) {
                iMax = Math.max(iMax, pVar2.invoke(mVar2, Integer.valueOf(iL0 != Integer.MAX_VALUE ? di.d.L0(iL0 * fT2) : Integer.MAX_VALUE)).intValue());
            }
        }
        return iMax;
    }

    private static final int v(List<? extends androidx.compose.ui.layout.m> list, yh.p<? super androidx.compose.ui.layout.m, ? super Integer, Integer> pVar, int i10, int i11) {
        int size = list.size();
        float f10 = 0.0f;
        int i12 = 0;
        int iMax = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= size) {
                return di.d.L0(iMax * f10) + i13 + ((list.size() - 1) * i11);
            }
            androidx.compose.ui.layout.m mVar = list.get(i12);
            float fT = t(r(mVar));
            int iIntValue = pVar.invoke(mVar, Integer.valueOf(i10)).intValue();
            if (fT == 0.0f) {
                i13 += iIntValue;
            } else if (fT > 0.0f) {
                f10 += fT;
                iMax = Math.max(iMax, di.d.L0(iIntValue / fT));
            }
            i12++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int w(List<? extends androidx.compose.ui.layout.m> list, yh.p<? super androidx.compose.ui.layout.m, ? super Integer, Integer> pVar, yh.p<? super androidx.compose.ui.layout.m, ? super Integer, Integer> pVar2, int i10, int i11, LayoutOrientation layoutOrientation, LayoutOrientation layoutOrientation2) {
        return layoutOrientation == layoutOrientation2 ? v(list, pVar, i10, i11) : u(list, pVar2, pVar, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x(RowColumnParentData v0Var) {
        q qVarQ = q(v0Var);
        if (qVarQ != null) {
            return qVarQ.f();
        }
        return false;
    }

    @dl.d
    public static final androidx.compose.ui.layout.i0 y(@dl.d final LayoutOrientation orientation, @dl.d final yh.s<? super Integer, ? super int[], ? super LayoutDirection, ? super s1.e, ? super int[], b2> arrangement, final float f10, @dl.d final SizeMode crossAxisSize, @dl.d final q crossAxisAlignment) {
        kotlin.jvm.internal.f0.p(orientation, "orientation");
        kotlin.jvm.internal.f0.p(arrangement, "arrangement");
        kotlin.jvm.internal.f0.p(crossAxisSize, "crossAxisSize");
        kotlin.jvm.internal.f0.p(crossAxisAlignment, "crossAxisAlignment");
        return new androidx.compose.ui.layout.i0() { // from class: androidx.compose.foundation.layout.RowColumnImplKt$rowColumnMeasurePolicy$1
            @Override // androidx.compose.ui.layout.i0
            @dl.d
            public androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.l0 measure, @dl.d final List<? extends androidx.compose.ui.layout.g0> list, long j10) {
                int iMax;
                int iB;
                int iMax2;
                int i10;
                List<? extends androidx.compose.ui.layout.g0> measurables = list;
                kotlin.jvm.internal.f0.p(measure, "$this$measure");
                kotlin.jvm.internal.f0.p(measurables, "measurables");
                OrientationIndependentConstraints orientationIndependentConstraints = new OrientationIndependentConstraints(j10, orientation, null);
                int iE1 = measure.e1(f10);
                int size = list.size();
                final androidx.compose.ui.layout.e1[] e1VarArr = new androidx.compose.ui.layout.e1[size];
                int size2 = list.size();
                RowColumnParentData[] rowColumnParentDataArr = new RowColumnParentData[size2];
                for (int i11 = 0; i11 < size2; i11++) {
                    rowColumnParentDataArr[i11] = RowColumnImplKt.r(measurables.get(i11));
                }
                int size3 = list.size();
                int i12 = 0;
                int iMax3 = 0;
                int i13 = 0;
                int i14 = 0;
                int iA = 0;
                boolean z10 = false;
                float f11 = 0.0f;
                while (true) {
                    if (i13 >= size3) {
                        break;
                    }
                    androidx.compose.ui.layout.g0 g0Var = measurables.get(i13);
                    RowColumnParentData rowColumnParentData = rowColumnParentDataArr[i13];
                    float fT = RowColumnImplKt.t(rowColumnParentData);
                    if (fT > 0.0f) {
                        f11 += fT;
                        i14++;
                        i10 = i13;
                    } else {
                        int i15 = orientationIndependentConstraints.i();
                        i10 = i13;
                        androidx.compose.ui.layout.e1 e1VarZ1 = g0Var.z1(OrientationIndependentConstraints.f(orientationIndependentConstraints, 0, i15 != Integer.MAX_VALUE ? i15 - iA : Integer.MAX_VALUE, 0, 0, 8, null).n(orientation));
                        int iMin = Math.min(iE1, (i15 - iA) - RowColumnImplKt.A(e1VarZ1, orientation));
                        iA += RowColumnImplKt.A(e1VarZ1, orientation) + iMin;
                        iMax3 = Math.max(iMax3, RowColumnImplKt.z(e1VarZ1, orientation));
                        boolean z11 = z10 || RowColumnImplKt.x(rowColumnParentData);
                        e1VarArr[i10] = e1VarZ1;
                        i12 = iMin;
                        z10 = z11;
                    }
                    i13 = i10 + 1;
                    size3 = size3;
                    rowColumnParentDataArr = rowColumnParentDataArr;
                }
                int i16 = iMax3;
                final RowColumnParentData[] rowColumnParentDataArr2 = rowColumnParentDataArr;
                if (i14 == 0) {
                    iA -= i12;
                    iMax = i16;
                    iB = 0;
                } else {
                    int i17 = iE1 * (i14 - 1);
                    int iJ = (((f11 <= 0.0f || orientationIndependentConstraints.i() == Integer.MAX_VALUE) ? orientationIndependentConstraints.j() : orientationIndependentConstraints.i()) - iA) - i17;
                    float f12 = f11 > 0.0f ? iJ / f11 : 0.0f;
                    int iL0 = 0;
                    for (int i18 = 0; i18 < size2; i18++) {
                        iL0 += di.d.L0(RowColumnImplKt.t(rowColumnParentDataArr2[i18]) * f12);
                    }
                    int size4 = list.size();
                    int i19 = iJ - iL0;
                    iMax = i16;
                    int i20 = 0;
                    int iA2 = 0;
                    while (i20 < size4) {
                        if (e1VarArr[i20] == null) {
                            androidx.compose.ui.layout.g0 g0Var2 = measurables.get(i20);
                            RowColumnParentData rowColumnParentData2 = rowColumnParentDataArr2[i20];
                            float fT2 = RowColumnImplKt.t(rowColumnParentData2);
                            if (!(fT2 > 0.0f)) {
                                throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                            }
                            int iU = di.d.U(i19);
                            int i21 = i19 - iU;
                            int iMax4 = Math.max(0, di.d.L0(fT2 * f12) + iU);
                            androidx.compose.ui.layout.e1 e1VarZ2 = g0Var2.z1(new OrientationIndependentConstraints((!RowColumnImplKt.s(rowColumnParentData2) || iMax4 == Integer.MAX_VALUE) ? 0 : iMax4, iMax4, 0, orientationIndependentConstraints.g()).n(orientation));
                            iA2 += RowColumnImplKt.A(e1VarZ2, orientation);
                            iMax = Math.max(iMax, RowColumnImplKt.z(e1VarZ2, orientation));
                            boolean z12 = z10 || RowColumnImplKt.x(rowColumnParentData2);
                            e1VarArr[i20] = e1VarZ2;
                            z10 = z12;
                            i19 = i21;
                        } else {
                            size4 = size4;
                        }
                        i20++;
                        measurables = list;
                        f12 = f12;
                        size4 = size4;
                    }
                    iB = fi.u.B(iA2 + i17, orientationIndependentConstraints.i() - iA);
                }
                final Ref.IntRef intRef = new Ref.IntRef();
                if (z10) {
                    iMax2 = 0;
                    for (int i22 = 0; i22 < size; i22++) {
                        androidx.compose.ui.layout.e1 e1Var = e1VarArr[i22];
                        kotlin.jvm.internal.f0.m(e1Var);
                        q qVarQ = RowColumnImplKt.q(rowColumnParentDataArr2[i22]);
                        Integer numE = qVarQ != null ? qVarQ.e(e1Var) : null;
                        if (numE != null) {
                            int i23 = intRef.f124889b;
                            int iIntValue = numE.intValue();
                            if (iIntValue == Integer.MIN_VALUE) {
                                iIntValue = 0;
                            }
                            intRef.f124889b = Math.max(i23, iIntValue);
                            int iZ = RowColumnImplKt.z(e1Var, orientation);
                            LayoutOrientation layoutOrientation = orientation;
                            int iIntValue2 = numE.intValue();
                            if (iIntValue2 == Integer.MIN_VALUE) {
                                iIntValue2 = RowColumnImplKt.z(e1Var, layoutOrientation);
                            }
                            iMax2 = Math.max(iMax2, iZ - iIntValue2);
                        }
                    }
                } else {
                    iMax2 = 0;
                }
                final int iMax5 = Math.max(iA + iB, orientationIndependentConstraints.j());
                final int iMax6 = (orientationIndependentConstraints.g() == Integer.MAX_VALUE || crossAxisSize != SizeMode.Expand) ? Math.max(iMax, Math.max(orientationIndependentConstraints.h(), intRef.f124889b + iMax2)) : orientationIndependentConstraints.g();
                LayoutOrientation layoutOrientation2 = orientation;
                LayoutOrientation layoutOrientation3 = LayoutOrientation.Horizontal;
                int i24 = layoutOrientation2 == layoutOrientation3 ? iMax5 : iMax6;
                int i25 = layoutOrientation2 == layoutOrientation3 ? iMax6 : iMax5;
                int size5 = list.size();
                final int[] iArr = new int[size5];
                for (int i26 = 0; i26 < size5; i26++) {
                    iArr[i26] = 0;
                }
                final yh.s<Integer, int[], LayoutDirection, s1.e, int[], b2> sVar = arrangement;
                final LayoutOrientation layoutOrientation4 = orientation;
                final q qVar = crossAxisAlignment;
                return androidx.compose.ui.layout.k0.p(measure, i24, i25, null, new yh.l<androidx.compose.ui.layout.e1.a, b2>() { // from class: androidx.compose.foundation.layout.RowColumnImplKt$rowColumnMeasurePolicy$1$measure$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                        int[] iArr2;
                        kotlin.jvm.internal.f0.p(layout, "$this$layout");
                        int size6 = list.size();
                        int[] iArr3 = new int[size6];
                        int i27 = 0;
                        for (int i28 = 0; i28 < size6; i28++) {
                            androidx.compose.ui.layout.e1 e1Var2 = e1VarArr[i28];
                            kotlin.jvm.internal.f0.m(e1Var2);
                            iArr3[i28] = RowColumnImplKt.A(e1Var2, layoutOrientation4);
                        }
                        sVar.N0(Integer.valueOf(iMax5), iArr3, measure.getLayoutDirection(), measure, iArr);
                        androidx.compose.ui.layout.e1[] e1VarArr2 = e1VarArr;
                        RowColumnParentData[] rowColumnParentDataArr3 = rowColumnParentDataArr2;
                        q qVar2 = qVar;
                        int i29 = iMax6;
                        LayoutOrientation layoutOrientation5 = layoutOrientation4;
                        androidx.compose.ui.layout.l0 l0Var = measure;
                        Ref.IntRef intRef2 = intRef;
                        int[] iArr4 = iArr;
                        int length = e1VarArr2.length;
                        int i30 = 0;
                        while (i27 < length) {
                            androidx.compose.ui.layout.e1 e1Var3 = e1VarArr2[i27];
                            int i31 = i30 + 1;
                            kotlin.jvm.internal.f0.m(e1Var3);
                            q qVarQ2 = RowColumnImplKt.q(rowColumnParentDataArr3[i30]);
                            if (qVarQ2 == null) {
                                qVarQ2 = qVar2;
                            }
                            int iZ2 = i29 - RowColumnImplKt.z(e1Var3, layoutOrientation5);
                            LayoutOrientation layoutOrientation6 = LayoutOrientation.Horizontal;
                            androidx.compose.ui.layout.e1[] e1VarArr3 = e1VarArr2;
                            int i32 = length;
                            int iD = qVarQ2.d(iZ2, layoutOrientation5 == layoutOrientation6 ? LayoutDirection.Ltr : l0Var.getLayoutDirection(), e1Var3, intRef2.f124889b);
                            if (layoutOrientation5 == layoutOrientation6) {
                                iArr2 = iArr4;
                                androidx.compose.ui.layout.e1.a.p(layout, e1Var3, iArr4[i30], iD, 0.0f, 4, null);
                            } else {
                                iArr2 = iArr4;
                                androidx.compose.ui.layout.e1.a.p(layout, e1Var3, iD, iArr2[i30], 0.0f, 4, null);
                            }
                            i27++;
                            i30 = i31;
                            length = i32;
                            e1VarArr2 = e1VarArr3;
                            iArr4 = iArr2;
                        }
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                        a(aVar);
                        return b2.f124493a;
                    }
                }, 4, null);
            }

            @Override // androidx.compose.ui.layout.i0
            public int b(@dl.d androidx.compose.ui.layout.n nVar, @dl.d List<? extends androidx.compose.ui.layout.m> measurables, int i10) {
                kotlin.jvm.internal.f0.p(nVar, "<this>");
                kotlin.jvm.internal.f0.p(measurables, "measurables");
                return ((Number) RowColumnImplKt.c(orientation).invoke(measurables, Integer.valueOf(i10), Integer.valueOf(nVar.e1(f10)))).intValue();
            }

            @Override // androidx.compose.ui.layout.i0
            public int c(@dl.d androidx.compose.ui.layout.n nVar, @dl.d List<? extends androidx.compose.ui.layout.m> measurables, int i10) {
                kotlin.jvm.internal.f0.p(nVar, "<this>");
                kotlin.jvm.internal.f0.p(measurables, "measurables");
                return ((Number) RowColumnImplKt.d(orientation).invoke(measurables, Integer.valueOf(i10), Integer.valueOf(nVar.e1(f10)))).intValue();
            }

            @Override // androidx.compose.ui.layout.i0
            public int d(@dl.d androidx.compose.ui.layout.n nVar, @dl.d List<? extends androidx.compose.ui.layout.m> measurables, int i10) {
                kotlin.jvm.internal.f0.p(nVar, "<this>");
                kotlin.jvm.internal.f0.p(measurables, "measurables");
                return ((Number) RowColumnImplKt.a(orientation).invoke(measurables, Integer.valueOf(i10), Integer.valueOf(nVar.e1(f10)))).intValue();
            }

            @Override // androidx.compose.ui.layout.i0
            public int e(@dl.d androidx.compose.ui.layout.n nVar, @dl.d List<? extends androidx.compose.ui.layout.m> measurables, int i10) {
                kotlin.jvm.internal.f0.p(nVar, "<this>");
                kotlin.jvm.internal.f0.p(measurables, "measurables");
                return ((Number) RowColumnImplKt.b(orientation).invoke(measurables, Integer.valueOf(i10), Integer.valueOf(nVar.e1(f10)))).intValue();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int z(androidx.compose.ui.layout.e1 e1Var, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? e1Var.getHeight() : e1Var.getWidth();
    }
}
