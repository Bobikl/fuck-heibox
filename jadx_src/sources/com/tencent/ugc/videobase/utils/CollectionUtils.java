package com.tencent.ugc.videobase.utils;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class CollectionUtils {
    public static boolean containsAny(Collection<?> collection, Collection<?> collection2) {
        if (collection.size() < collection2.size()) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (collection2.contains(it.next())) {
                    return true;
                }
            }
            return false;
        }
        Iterator<?> it2 = collection2.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static <T> boolean isEmpty(T[] tArr) {
        return tArr == null || tArr.length == 0;
    }
}
