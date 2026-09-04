package w0;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PersistentOrderedMapContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0005\u001a\u00020\u0004H\u0096\u0002J\u0010\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lw0/o;", "K", androidx.exifinterface.media.a.X4, "", "", "hasNext", "next", "()Ljava/lang/Object;", "Lw0/c;", "map", "<init>", "(Lw0/c;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class o<K, V> implements Iterator<K>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final p<K, V> f140948b;

    public o(@dl.d c<K, V> map) {
        f0.p(map, "map");
        this.f140948b = new p<>(map.getF140926e(), map.u());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f140948b.hasNext();
    }

    @Override // java.util.Iterator
    public K next() {
        K k10 = (K) this.f140948b.getF140949b();
        this.f140948b.next();
        return k10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
