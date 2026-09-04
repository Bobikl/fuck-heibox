package w0;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PersistentOrderedMapContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003B+\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0006\u001a\u00020\u0005H\u0096\u0002J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lw0/p;", "K", androidx.exifinterface.media.a.X4, "", "Lw0/a;", "", "hasNext", ak.aF, "", "nextKey", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "e", "(Ljava/lang/Object;)V", "", UCropPlusActivity.ARG_INDEX, "I", ak.av, "()I", "d", "(I)V", "", "hashMap", "<init>", "(Ljava/lang/Object;Ljava/util/Map;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public class p<K, V> implements Iterator<a<V>>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private Object f140949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final Map<K, a<V>> f140950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f140951d;

    public p(@dl.e Object obj, @dl.d Map<K, a<V>> hashMap) {
        f0.p(hashMap, "hashMap");
        this.f140949b = obj;
        this.f140950c = hashMap;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF140951d() {
        return this.f140951d;
    }

    @dl.e
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Object getF140949b() {
        return this.f140949b;
    }

    @Override // java.util.Iterator
    @dl.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a<V> next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        a<V> aVar = this.f140950c.get(this.f140949b);
        if (aVar != null) {
            a<V> aVar2 = aVar;
            this.f140951d++;
            this.f140949b = aVar2.getF140921c();
            return aVar2;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.f140949b + ") has changed after it was added to the persistent map.");
    }

    public final void d(int i10) {
        this.f140951d = i10;
    }

    public final void e(@dl.e Object obj) {
        this.f140949b = obj;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f140951d < this.f140950c.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
