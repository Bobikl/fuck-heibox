package kotlin.reflect.jvm.internal.impl.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: collections.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    public static final <T> void a(@dl.d Collection<T> collection, @dl.e T t10) {
        f0.p(collection, "<this>");
        if (t10 != null) {
            collection.add(t10);
        }
    }

    private static final int b(int i10) {
        if (i10 < 3) {
            return 3;
        }
        return i10 + (i10 / 3) + 1;
    }

    @dl.d
    public static final <T> List<T> c(@dl.d ArrayList<T> arrayList) {
        f0.p(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        if (size == 1) {
            return s.k(CollectionsKt___CollectionsKt.w2(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    @dl.d
    public static final <K> Map<K, Integer> d(@dl.d Iterable<? extends K> iterable) {
        f0.p(iterable, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends K> it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i10));
            i10++;
        }
        return linkedHashMap;
    }

    @dl.d
    public static final <K, V> HashMap<K, V> e(int i10) {
        return new HashMap<>(b(i10));
    }

    @dl.d
    public static final <E> HashSet<E> f(int i10) {
        return new HashSet<>(b(i10));
    }

    @dl.d
    public static final <E> LinkedHashSet<E> g(int i10) {
        return new LinkedHashSet<>(b(i10));
    }
}
