package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import kotlin.DeprecationLevel;
import kotlin.NotImplementedError;

/* JADX INFO: compiled from: MutableCollectionsJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
public class w extends v {
    @kotlin.u0(version = "1.2")
    @sh.f
    private static final <T> void g0(List<T> list, T t10) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        Collections.fill(list, t10);
    }

    @kotlin.u0(version = "1.2")
    @sh.f
    private static final <T> void h0(List<T> list) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        Collections.shuffle(list);
    }

    @kotlin.u0(version = "1.2")
    @sh.f
    private static final <T> void i0(List<T> list, Random random) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(random, "random");
        Collections.shuffle(list, random);
    }

    public static final <T extends Comparable<? super T>> void j0(@dl.d List<T> list) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "Use sortWith(comparator) instead.", replaceWith = @kotlin.s0(expression = "this.sortWith(comparator)", imports = {}))
    @sh.f
    private static final <T> void k0(List<T> list, Comparator<? super T> comparator) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        throw new NotImplementedError(null, 1, null);
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "Use sortWith(Comparator(comparison)) instead.", replaceWith = @kotlin.s0(expression = "this.sortWith(Comparator(comparison))", imports = {}))
    @sh.f
    private static final <T> void l0(List<T> list, yh.p<? super T, ? super T, Integer> comparison) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(comparison, "comparison");
        throw new NotImplementedError(null, 1, null);
    }

    public static final <T> void m0(@dl.d List<T> list, @dl.d Comparator<? super T> comparator) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
