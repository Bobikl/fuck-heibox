package androidx.compose.runtime.snapshots;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: SnapshotStateMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B5\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/snapshots/y;", "K", androidx.exifinterface.media.a.X4, "Landroidx/compose/runtime/snapshots/x;", "", "next", "()Ljava/lang/Object;", "Landroidx/compose/runtime/snapshots/t;", "map", "", "", "iterator", "<init>", "(Landroidx/compose/runtime/snapshots/t;Ljava/util/Iterator;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class y<K, V> extends x<K, V> implements Iterator<K>, zh.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@dl.d t<K, V> map, @dl.d Iterator<? extends Map.Entry<? extends K, ? extends V>> iterator) {
        super(map, iterator);
        kotlin.jvm.internal.f0.p(map, "map");
        kotlin.jvm.internal.f0.p(iterator, "iterator");
    }

    @Override // java.util.Iterator
    public K next() {
        Map.Entry<K, V> entryI = i();
        if (entryI == null) {
            throw new IllegalStateException();
        }
        c();
        return entryI.getKey();
    }
}
