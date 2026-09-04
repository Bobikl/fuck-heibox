package androidx.compose.runtime.snapshots;

import com.umeng.analytics.pro.ak;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: SnapshotStateMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004B5\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0096\u0002¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/snapshots/w;", "K", androidx.exifinterface.media.a.X4, "Landroidx/compose/runtime/snapshots/x;", "", "", "r", "Landroidx/compose/runtime/snapshots/t;", "map", "", "", "iterator", "<init>", "(Landroidx/compose/runtime/snapshots/t;Ljava/util/Iterator;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class w<K, V> extends x<K, V> implements Iterator<Map.Entry<K, V>>, zh.d {

    /* JADX INFO: compiled from: SnapshotStateMap.kt */
    @Metadata(bv = {}, d1 = {"\u0000\r\n\u0000\n\u0002\u0010'\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0017\u0010\u0003\u001a\u00028\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\"\u0010\u000e\u001a\u00028\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"androidx/compose/runtime/snapshots/w$a", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "b", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", ak.aF, "getValue", ak.av, "(Ljava/lang/Object;)V", "value", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements Map.Entry<K, V>, zh.g.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final K key;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private V value;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ w<K, V> f13284d;

        a(w<K, V> wVar) {
            this.f13284d = wVar;
            Map.Entry<K, V> entryD = wVar.d();
            kotlin.jvm.internal.f0.m(entryD);
            this.key = entryD.getKey();
            Map.Entry<K, V> entryD2 = wVar.d();
            kotlin.jvm.internal.f0.m(entryD2);
            this.value = entryD2.getValue();
        }

        public void a(V v10) {
            this.value = v10;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Map.Entry
        public V setValue(V newValue) {
            w<K, V> wVar = this.f13284d;
            if (wVar.g().i() != ((x) wVar).modification) {
                throw new ConcurrentModificationException();
            }
            V v10 = (V) getValue();
            wVar.g().put(getKey(), newValue);
            a(newValue);
            return v10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@dl.d t<K, V> map, @dl.d Iterator<? extends Map.Entry<? extends K, ? extends V>> iterator) {
        super(map, iterator);
        kotlin.jvm.internal.f0.p(map, "map");
        kotlin.jvm.internal.f0.p(iterator, "iterator");
    }

    @Override // java.util.Iterator
    @dl.d
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        c();
        if (d() != null) {
            return new a(this);
        }
        throw new IllegalStateException();
    }
}
