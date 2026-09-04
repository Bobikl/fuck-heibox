package com.jd.jdcache.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import yh.l;

/* JADX INFO: compiled from: CollectionHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nCollectionHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionHelper.kt\ncom/jd/jdcache/util/CollectionHelperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,22:1\n1855#2,2:23\n*S KotlinDebug\n*F\n+ 1 CollectionHelper.kt\ncom/jd/jdcache/util/CollectionHelperKt\n*L\n13#1:23,2\n*E\n"})
public final class a {
    public static final /* synthetic */ <K, V, M extends Map<K, V>> M a(Collection<? extends V> collection, l<? super V, ? extends K> getKey) {
        f0.p(getKey, "getKey");
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        f0.y(4, "M");
        M m10 = (M) Map.class.newInstance();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            a.a.a.a.d.p.d.c.d dVar = (Object) it.next();
            K kInvoke = getKey.invoke(dVar);
            if (kInvoke != null) {
                f0.m(m10);
                m10.put(kInvoke, dVar);
            }
        }
        return m10;
    }
}
