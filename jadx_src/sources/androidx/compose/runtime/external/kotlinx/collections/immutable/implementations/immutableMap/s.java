package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractCollection;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PersistentHashMapContentViews.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0096\u0002R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/s;", "K", androidx.exifinterface.media.a.X4, "Lu0/b;", "Lkotlin/collections/AbstractCollection;", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "iterator", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "b", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "map", "", "getSize", "()I", UiKitSpanObj.TYPE_SIZE, "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class s<K, V> extends AbstractCollection<V> implements u0.b<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final d<K, V> map;

    public s(@dl.d d<K, V> map) {
        f0.p(map, "map");
        this.map = map;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return this.map.containsValue(element);
    }

    @Override // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.map.size();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @dl.d
    public Iterator<V> iterator() {
        return new t(this.map.u());
    }
}
