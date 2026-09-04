package androidx.compose.ui.layout;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: MeasurePolicy.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0 {
    public static int a(i0 i0Var, @dl.d n nVar, @dl.d List measurables, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new e((m) measurables.get(i11), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
        }
        return i0Var.a(new o(nVar, nVar.getLayoutDirection()), arrayList, s1.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public static int b(i0 i0Var, @dl.d n nVar, @dl.d List measurables, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new e((m) measurables.get(i11), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
        }
        return i0Var.a(new o(nVar, nVar.getLayoutDirection()), arrayList, s1.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    public static int c(i0 i0Var, @dl.d n nVar, @dl.d List measurables, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new e((m) measurables.get(i11), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
        }
        return i0Var.a(new o(nVar, nVar.getLayoutDirection()), arrayList, s1.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public static int d(i0 i0Var, @dl.d n nVar, @dl.d List measurables, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new e((m) measurables.get(i11), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
        }
        return i0Var.a(new o(nVar, nVar.getLayoutDirection()), arrayList, s1.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }
}
