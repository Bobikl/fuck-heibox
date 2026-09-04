package kotlinx.serialization.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class j0<K, V> extends e1<K, V, Map<K, ? extends V>, HashMap<K, V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final kotlinx.serialization.descriptors.f f130710c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(@dl.d kotlinx.serialization.g<K> kSerializer, @dl.d kotlinx.serialization.g<V> vSerializer) {
        super(kSerializer, vSerializer, null);
        kotlin.jvm.internal.f0.p(kSerializer, "kSerializer");
        kotlin.jvm.internal.f0.p(vSerializer, "vSerializer");
        this.f130710c = new i0(kSerializer.a(), vSerializer.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(@dl.d Map<K, ? extends V> map) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        return map.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.e1
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void t(@dl.d HashMap<K, V> map, int i10, K k10, V v10) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        map.put(k10, v10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @dl.d
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public HashMap<K, V> p(@dl.d Map<K, ? extends V> map) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        HashMap<K, V> map2 = map instanceof HashMap ? (HashMap) map : null;
        return map2 == null ? new HashMap<>(map) : map2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @dl.d
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public Map<K, V> q(@dl.d HashMap<K, V> map) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        return map;
    }

    @Override // kotlinx.serialization.internal.e1, kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
    @dl.d
    public kotlinx.serialization.descriptors.f a() {
        return this.f130710c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @dl.d
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public HashMap<K, V> f() {
        return new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public int g(@dl.d HashMap<K, V> map) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        return map.size() * 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void h(@dl.d HashMap<K, V> map, int i10) {
        kotlin.jvm.internal.f0.p(map, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @dl.d
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Iterator<Map.Entry<K, V>> i(@dl.d Map<K, ? extends V> map) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        return map.entrySet().iterator();
    }
}
