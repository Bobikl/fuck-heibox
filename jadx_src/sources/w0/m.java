package w0;

import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PersistentOrderedMapContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0006\u001a\u00020\u0005H\u0096\u0002J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¨\u0006\f"}, d2 = {"Lw0/m;", "K", androidx.exifinterface.media.a.X4, "", "", "", "hasNext", ak.av, "Lw0/c;", "map", "<init>", "(Lw0/c;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class m<K, V> implements Iterator<Map.Entry<? extends K, ? extends V>>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final p<K, V> f140946b;

    public m(@dl.d c<K, V> map) {
        f0.p(map, "map");
        this.f140946b = new p<>(map.getF140926e(), map.u());
    }

    @Override // java.util.Iterator
    @dl.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b(this.f140946b.getF140949b(), this.f140946b.next().e());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f140946b.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
