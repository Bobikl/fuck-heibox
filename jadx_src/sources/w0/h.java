package w0;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PersistentOrderedMapBuilderContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0005\u001a\u00020\u0004H\u0096\u0002J\u0010\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"Lw0/h;", "K", androidx.exifinterface.media.a.X4, "", "", "hasNext", "next", "()Ljava/lang/Object;", "Lkotlin/b2;", "remove", "Lw0/d;", "map", "<init>", "(Lw0/d;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class h<K, V> implements Iterator<K>, zh.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final i<K, V> f140936b;

    public h(@dl.d d<K, V> map) {
        f0.p(map, "map");
        this.f140936b = new i<>(map.getF140930c(), map);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f140936b.hasNext();
    }

    @Override // java.util.Iterator
    public K next() {
        this.f140936b.next();
        return (K) this.f140936b.getF140939d();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f140936b.remove();
    }
}
