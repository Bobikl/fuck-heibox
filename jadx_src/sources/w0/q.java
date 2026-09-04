package w0;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractCollection;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PersistentOrderedMapContentViews.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0096\u0002R\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lw0/q;", "K", androidx.exifinterface.media.a.X4, "Lu0/b;", "Lkotlin/collections/AbstractCollection;", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "iterator", "", "getSize", "()I", UiKitSpanObj.TYPE_SIZE, "Lw0/c;", "map", "<init>", "(Lw0/c;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class q<K, V> extends AbstractCollection<V> implements u0.b<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final c<K, V> f140952b;

    public q(@dl.d c<K, V> map) {
        f0.p(map, "map");
        this.f140952b = map;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return this.f140952b.containsValue(element);
    }

    @Override // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f140952b.size();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @dl.d
    public Iterator<V> iterator() {
        return new r(this.f140952b);
    }
}
