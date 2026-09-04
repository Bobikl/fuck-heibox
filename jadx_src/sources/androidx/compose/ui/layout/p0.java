package androidx.compose.ui.layout;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: MultiContentMeasurePolicy.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p0 {
    public static int a(q0 q0Var, @dl.d n nVar, @dl.d List measurables, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list = (List) measurables.get(i11);
            ArrayList arrayList2 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(new e((m) list.get(i12), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
            }
            arrayList.add(arrayList2);
        }
        return q0Var.a(new o(nVar, nVar.getLayoutDirection()), arrayList, s1.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public static int b(q0 q0Var, @dl.d n nVar, @dl.d List measurables, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list = (List) measurables.get(i11);
            ArrayList arrayList2 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(new e((m) list.get(i12), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
            }
            arrayList.add(arrayList2);
        }
        return q0Var.a(new o(nVar, nVar.getLayoutDirection()), arrayList, s1.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    public static int c(q0 q0Var, @dl.d n nVar, @dl.d List measurables, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list = (List) measurables.get(i11);
            ArrayList arrayList2 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(new e((m) list.get(i12), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
            }
            arrayList.add(arrayList2);
        }
        return q0Var.a(new o(nVar, nVar.getLayoutDirection()), arrayList, s1.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public static int d(q0 q0Var, @dl.d n nVar, @dl.d List measurables, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list = (List) measurables.get(i11);
            ArrayList arrayList2 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(new e((m) list.get(i12), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
            }
            arrayList.add(arrayList2);
        }
        return q0Var.a(new o(nVar, nVar.getLayoutDirection()), arrayList, s1.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }
}
