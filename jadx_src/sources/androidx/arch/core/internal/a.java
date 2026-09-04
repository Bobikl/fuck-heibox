package androidx.arch.core.internal;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: FastSafeIterableMap.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class a<K, V> extends b<K, V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap<K, b.c<K, V>> f3006f = new HashMap<>();

    @Override // androidx.arch.core.internal.b
    @p0
    protected b.c<K, V> b(K k10) {
        return this.f3006f.get(k10);
    }

    public boolean contains(K k10) {
        return this.f3006f.containsKey(k10);
    }

    @Override // androidx.arch.core.internal.b
    public V i(@n0 K k10, @n0 V v10) {
        b.c<K, V> cVarB = b(k10);
        if (cVarB != null) {
            return cVarB.f3012c;
        }
        this.f3006f.put(k10, h(k10, v10));
        return null;
    }

    @Override // androidx.arch.core.internal.b
    public V j(@n0 K k10) {
        V v10 = (V) super.j(k10);
        this.f3006f.remove(k10);
        return v10;
    }

    @p0
    public Map.Entry<K, V> l(K k10) {
        if (contains(k10)) {
            return this.f3006f.get(k10).f3014e;
        }
        return null;
    }
}
