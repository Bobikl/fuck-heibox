package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: compiled from: Iterables.kt */
/* JADX INFO: loaded from: classes5.dex */
public class t extends CollectionsKt__CollectionsKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Iterables.kt */
    public static final class a<T> implements Iterable<T>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.a<Iterator<T>> f124639b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(yh.a<? extends Iterator<? extends T>> aVar) {
            this.f124639b = aVar;
        }

        @Override // java.lang.Iterable
        @dl.d
        public Iterator<T> iterator() {
            return this.f124639b.invoke();
        }
    }

    @sh.f
    private static final <T> Iterable<T> X(yh.a<? extends Iterator<? extends T>> iterator) {
        kotlin.jvm.internal.f0.p(iterator, "iterator");
        return new a(iterator);
    }

    @kotlin.r0
    public static final <T> int Y(@dl.d Iterable<? extends T> iterable, int i10) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }

    @kotlin.r0
    @dl.e
    public static final <T> Integer Z(@dl.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    @dl.d
    public static final <T> List<T> a0(@dl.d Iterable<? extends Iterable<? extends T>> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            x.n0(arrayList, it.next());
        }
        return arrayList;
    }

    @dl.d
    public static final <T, R> Pair<List<T>, List<R>> b0(@dl.d Iterable<? extends Pair<? extends T, ? extends R>> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        int iY = Y(iterable, 10);
        ArrayList arrayList = new ArrayList(iY);
        ArrayList arrayList2 = new ArrayList(iY);
        for (Pair<? extends T, ? extends R> pair : iterable) {
            arrayList.add(pair.e());
            arrayList2.add(pair.f());
        }
        return kotlin.c1.a(arrayList, arrayList2);
    }
}
