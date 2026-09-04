package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.DeprecationLevel;
import kotlin.e2;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: MutableCollections.kt */
/* JADX INFO: loaded from: classes5.dex */
public class x extends w {
    @sh.f
    private static final <T> void A0(Collection<? super T> collection, T[] elements) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        p0(collection, elements);
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "Use removeAt(index) instead.", replaceWith = @kotlin.s0(expression = "removeAt(index)", imports = {}))
    @sh.f
    private static final <T> T B0(List<T> list, int i10) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        return list.remove(i10);
    }

    @sh.f
    private static final <T> boolean C0(Collection<? extends T> collection, T t10) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        return kotlin.jvm.internal.w0.a(collection).remove(t10);
    }

    public static final <T> boolean D0(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        return r0(iterable, predicate, true);
    }

    public static final <T> boolean E0(@dl.d Collection<? super T> collection, @dl.d Iterable<? extends T> elements) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        return collection.removeAll(q0(elements));
    }

    @sh.f
    private static final <T> boolean F0(Collection<? extends T> collection, Collection<? extends T> elements) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        return kotlin.jvm.internal.w0.a(collection).removeAll(elements);
    }

    public static final <T> boolean G0(@dl.d Collection<? super T> collection, @dl.d kotlin.sequences.m<? extends T> elements) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        List listC3 = SequencesKt___SequencesKt.c3(elements);
        return (listC3.isEmpty() ^ true) && collection.removeAll(listC3);
    }

    public static final <T> boolean H0(@dl.d Collection<? super T> collection, @dl.d T[] elements) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        return ((elements.length == 0) ^ true) && collection.removeAll(m.t(elements));
    }

    public static final <T> boolean I0(@dl.d List<T> list, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        return s0(list, predicate, true);
    }

    @kotlin.u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    public static final <T> T J0(@dl.d List<T> list) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final <T> T K0(@dl.d List<T> list) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    @kotlin.u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    public static final <T> T L0(@dl.d List<T> list) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(CollectionsKt__CollectionsKt.G(list));
    }

    @kotlin.u0(version = "1.4")
    @dl.e
    @e2(markerClass = {kotlin.q.class})
    public static final <T> T M0(@dl.d List<T> list) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(CollectionsKt__CollectionsKt.G(list));
    }

    public static final <T> boolean N0(@dl.d Iterable<? extends T> iterable, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        return r0(iterable, predicate, false);
    }

    public static final <T> boolean O0(@dl.d Collection<? super T> collection, @dl.d Iterable<? extends T> elements) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        return collection.retainAll(q0(elements));
    }

    @sh.f
    private static final <T> boolean P0(Collection<? extends T> collection, Collection<? extends T> elements) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        return kotlin.jvm.internal.w0.a(collection).retainAll(elements);
    }

    public static final <T> boolean Q0(@dl.d Collection<? super T> collection, @dl.d kotlin.sequences.m<? extends T> elements) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        List listC3 = SequencesKt___SequencesKt.c3(elements);
        return listC3.isEmpty() ^ true ? collection.retainAll(listC3) : T0(collection);
    }

    public static final <T> boolean R0(@dl.d Collection<? super T> collection, @dl.d T[] elements) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        return (elements.length == 0) ^ true ? collection.retainAll(m.t(elements)) : T0(collection);
    }

    public static final <T> boolean S0(@dl.d List<T> list, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        return s0(list, predicate, false);
    }

    private static final boolean T0(Collection<?> collection) {
        boolean z10 = !collection.isEmpty();
        collection.clear();
        return z10;
    }

    public static final <T> boolean n0(@dl.d Collection<? super T> collection, @dl.d Iterable<? extends T> elements) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        boolean z10 = false;
        Iterator<? extends T> it = elements.iterator();
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public static final <T> boolean o0(@dl.d Collection<? super T> collection, @dl.d kotlin.sequences.m<? extends T> elements) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        Iterator<? extends T> it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public static final <T> boolean p0(@dl.d Collection<? super T> collection, @dl.d T[] elements) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        return collection.addAll(m.t(elements));
    }

    @dl.d
    public static final <T> Collection<T> q0(@dl.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : CollectionsKt___CollectionsKt.Q5(iterable);
    }

    private static final <T> boolean r0(Iterable<? extends T> iterable, yh.l<? super T, Boolean> lVar, boolean z10) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (lVar.invoke(it.next()).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    private static final <T> boolean s0(List<T> list, yh.l<? super T, Boolean> lVar, boolean z10) {
        if (!(list instanceof RandomAccess)) {
            kotlin.jvm.internal.f0.n(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return r0(kotlin.jvm.internal.w0.c(list), lVar, z10);
        }
        k0 it = new fi.l(0, CollectionsKt__CollectionsKt.G(list)).iterator();
        int i10 = 0;
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            T t10 = list.get(iNextInt);
            if (lVar.invoke(t10).booleanValue() != z10) {
                if (i10 != iNextInt) {
                    list.set(i10, t10);
                }
                i10++;
            }
        }
        if (i10 >= list.size()) {
            return false;
        }
        int iG = CollectionsKt__CollectionsKt.G(list);
        if (i10 > iG) {
            return true;
        }
        while (true) {
            list.remove(iG);
            if (iG == i10) {
                return true;
            }
            iG--;
        }
    }

    @sh.f
    private static final <T> void t0(Collection<? super T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        E0(collection, elements);
    }

    @sh.f
    private static final <T> void u0(Collection<? super T> collection, T t10) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        collection.remove(t10);
    }

    @sh.f
    private static final <T> void v0(Collection<? super T> collection, kotlin.sequences.m<? extends T> elements) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        G0(collection, elements);
    }

    @sh.f
    private static final <T> void w0(Collection<? super T> collection, T[] elements) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        H0(collection, elements);
    }

    @sh.f
    private static final <T> void x0(Collection<? super T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        n0(collection, elements);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @sh.f
    private static final <T> void y0(Collection<? super T> collection, T t10) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        collection.add(t10);
    }

    @sh.f
    private static final <T> void z0(Collection<? super T> collection, kotlin.sequences.m<? extends T> elements) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        kotlin.jvm.internal.f0.p(elements, "elements");
        o0(collection, elements);
    }
}
