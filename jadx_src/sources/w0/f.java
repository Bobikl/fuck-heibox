package w0;

import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PersistentOrderedMapBuilderContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0006\u001a\u00020\u0005H\u0096\u0002J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"Lw0/f;", "K", androidx.exifinterface.media.a.X4, "", "", "", "hasNext", ak.av, "Lkotlin/b2;", "remove", "Lw0/d;", "map", "<init>", "(Lw0/d;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class f<K, V> implements Iterator<Map.Entry<K, V>>, zh.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final i<K, V> f140934b;

    public f(@dl.d d<K, V> map) {
        f0.p(map, "map");
        this.f140934b = new i<>(map.getF140930c(), map);
    }

    @Override // java.util.Iterator
    @dl.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        return new b(this.f140934b.d().g(), this.f140934b.getF140939d(), this.f140934b.next());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f140934b.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f140934b.remove();
    }
}
