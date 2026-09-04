package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import com.umeng.analytics.pro.ak;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PersistentHashMapBuilderContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B+\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\u0013\u001a\u00028\u0000\u0012\u0006\u0010\u0012\u001a\u00028\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00028\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/c;", "K", androidx.exifinterface.media.a.X4, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/b;", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/i;", "d", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/i;", "parentIterator", "e", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", ak.av, "(Ljava/lang/Object;)V", "value", "key", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/i;Ljava/lang/Object;Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class c<K, V> extends b<K, V> implements Map.Entry<K, V>, zh.g.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final i<K, V> parentIterator;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private V value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@dl.d i<K, V> parentIterator, K k10, V v10) {
        super(k10, v10);
        f0.p(parentIterator, "parentIterator");
        this.parentIterator = parentIterator;
        this.value = v10;
    }

    public void a(V v10) {
        this.value = v10;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b, java.util.Map.Entry
    public V getValue() {
        return this.value;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b, java.util.Map.Entry
    public V setValue(V newValue) {
        V value = getValue();
        a(newValue);
        this.parentIterator.b(getKey(), newValue);
        return value;
    }
}
