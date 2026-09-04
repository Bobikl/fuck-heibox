package i0;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: LruHashMap.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final LinkedHashMap<K, V> f119209a;

    public d() {
        this(0, 0.0f, 3, null);
    }

    public d(int i10, float f10) {
        this.f119209a = new LinkedHashMap<>(i10, f10, true);
    }

    public /* synthetic */ d(int i10, float f10, int i11, u uVar) {
        this((i11 & 1) != 0 ? 16 : i10, (i11 & 2) != 0 ? 0.75f : f10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(@dl.d d<? extends K, V> original) {
        this(0, 0.0f, 3, null);
        f0.p(original, "original");
        for (Map.Entry<? extends K, V> entry : original.b()) {
            d(entry.getKey(), entry.getValue());
        }
    }

    @dl.e
    public final V a(@dl.d K key) {
        f0.p(key, "key");
        return this.f119209a.get(key);
    }

    @dl.d
    public final Set<Map.Entry<K, V>> b() {
        Set<Map.Entry<K, V>> setEntrySet = this.f119209a.entrySet();
        f0.o(setEntrySet, "map.entries");
        return setEntrySet;
    }

    public final boolean c() {
        return this.f119209a.isEmpty();
    }

    @dl.e
    public final V d(@dl.d K key, @dl.d V value) {
        f0.p(key, "key");
        f0.p(value, "value");
        return this.f119209a.put(key, value);
    }

    @dl.e
    public final V e(@dl.d K key) {
        f0.p(key, "key");
        return this.f119209a.remove(key);
    }
}
