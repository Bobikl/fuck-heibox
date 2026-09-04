package androidx.collection;

import kotlin.Pair;

/* JADX INFO: compiled from: ArrayMap.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    @dl.d
    public static final <K, V> a<K, V> a() {
        return new a<>();
    }

    @dl.d
    public static final <K, V> a<K, V> b(@dl.d Pair<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.f0.p(pairs, "pairs");
        a<K, V> aVar = new a<>(pairs.length);
        for (Pair<? extends K, ? extends V> pair : pairs) {
            aVar.put(pair.e(), pair.f());
        }
        return aVar;
    }
}
