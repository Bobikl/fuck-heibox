package x0;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PersistentOrderedSetIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0006\u001a\u00020\u0005H\u0096\u0002J\u0010\u0010\u0007\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lx0/d;", androidx.exifinterface.media.a.S4, "", "Lkotlin/b2;", ak.av, "", "hasNext", "next", "()Ljava/lang/Object;", "", "Lx0/a;", "map", "Ljava/util/Map;", ak.aF, "()Ljava/util/Map;", "", UCropPlusActivity.ARG_INDEX, "I", "b", "()I", "d", "(I)V", "", "nextElement", "<init>", "(Ljava/lang/Object;Ljava/util/Map;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public class d<E> implements Iterator<E>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private Object f141057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final Map<E, a> f141058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f141059d;

    public d(@dl.e Object obj, @dl.d Map<E, a> map) {
        f0.p(map, "map");
        this.f141057b = obj;
        this.f141058c = map;
    }

    private final void a() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF141059d() {
        return this.f141059d;
    }

    @dl.d
    public final Map<E, a> c() {
        return this.f141058c;
    }

    public final void d(int i10) {
        this.f141059d = i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f141059d < this.f141058c.size();
    }

    @Override // java.util.Iterator
    public E next() {
        a();
        E e10 = (E) this.f141057b;
        this.f141059d++;
        a aVar = this.f141058c.get(e10);
        if (aVar != null) {
            this.f141057b = aVar.getF141047b();
            return e10;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + e10 + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
