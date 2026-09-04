package v0;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import dl.e;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: ReadOnlyCollectionAdapters.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0001J\t\u0010\n\u001a\u00020\u0005H\u0096\u0001J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096\u0003J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0016\u001a\u00020\u00108\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lv0/a;", androidx.exifinterface.media.a.S4, "Lu0/b;", "", "element", "", "contains", "(Ljava/lang/Object;)Z", "elements", "containsAll", "isEmpty", "", "iterator", "", "other", "equals", "", "hashCode", "", "toString", ak.av, "()I", UiKitSpanObj.TYPE_SIZE, "impl", "<init>", "(Ljava/util/Collection;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public class a<E> implements u0.b<E>, Collection<E>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Collection<E> f140811b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@dl.d Collection<? extends E> impl) {
        f0.p(impl, "impl");
        this.f140811b = impl;
    }

    public int a() {
        return this.f140811b.size();
    }

    @Override // java.util.Collection
    public boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object element) {
        return this.f140811b.contains(element);
    }

    @Override // java.util.Collection
    public boolean containsAll(@dl.d Collection<? extends Object> elements) {
        f0.p(elements, "elements");
        return this.f140811b.containsAll(elements);
    }

    @Override // java.util.Collection
    public boolean equals(@e Object other) {
        return this.f140811b.equals(other);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f140811b.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f140811b.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @dl.d
    public Iterator<E> iterator() {
        return this.f140811b.iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return t.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        f0.p(array, "array");
        return (T[]) t.b(this, array);
    }

    @dl.d
    public String toString() {
        return this.f140811b.toString();
    }
}
