package kotlin.collections;

import java.util.List;

/* JADX INFO: compiled from: ReversedViews.kt */
/* JADX INFO: loaded from: classes5.dex */
public class y extends x {
    @dl.d
    public static final <T> List<T> W0(@dl.d List<? extends T> list) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        return new z0(list);
    }

    @dl.d
    @xh.h(name = "asReversedMutable")
    public static final <T> List<T> X0(@dl.d List<T> list) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        return new y0(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Y0(List<?> list, int i10) {
        if (new fi.l(0, CollectionsKt__CollectionsKt.G(list)).s(i10)) {
            return CollectionsKt__CollectionsKt.G(list) - i10;
        }
        throw new IndexOutOfBoundsException("Element index " + i10 + " must be in range [" + new fi.l(0, CollectionsKt__CollectionsKt.G(list)) + "].");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Z0(List<?> list, int i10) {
        if (new fi.l(0, list.size()).s(i10)) {
            return list.size() - i10;
        }
        throw new IndexOutOfBoundsException("Position index " + i10 + " must be in range [" + new fi.l(0, list.size()) + "].");
    }
}
