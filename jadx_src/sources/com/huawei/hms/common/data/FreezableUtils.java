package com.huawei.hms.common.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.jsoup.parser.ParseErrorList;

/* JADX INFO: loaded from: classes7.dex */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        return freezeIterable(arrayList);
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        return freezeIterable(Arrays.asList(eArr));
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        ParseErrorList parseErrorList = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            parseErrorList.add(it.next().freeze());
        }
        return parseErrorList;
    }
}
