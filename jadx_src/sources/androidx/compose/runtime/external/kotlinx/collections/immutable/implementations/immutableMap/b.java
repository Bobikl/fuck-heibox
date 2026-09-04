package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import com.umeng.analytics.pro.ak;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PersistentHashMapContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0017\u0012\u0006\u0010\u0010\u001a\u00028\u0000\u0012\u0006\u0010\u0013\u001a\u00028\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u001a\u0010\u0010\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00028\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/b;", "K", androidx.exifinterface.media.a.X4, "", "", "hashCode", "", "other", "", "equals", "", "toString", "b", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", ak.aF, "getValue", "value", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public class b<K, V> implements Map.Entry<K, V>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final K key;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final V value;

    public b(K k10, V v10) {
        this.key = k10;
        this.value = v10;
    }

    @Override // java.util.Map.Entry
    public boolean equals(@dl.e Object other) {
        Map.Entry entry = other instanceof Map.Entry ? (Map.Entry) other : null;
        return entry != null && f0.g(entry.getKey(), getKey()) && f0.g(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        V value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public V setValue(V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @dl.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append(n5.a.f132013h);
        sb2.append(getValue());
        return sb2.toString();
    }
}
