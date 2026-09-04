package oi;

import dl.e;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: TargetPlatform.kt */
/* JADX INFO: loaded from: classes5.dex */
public class c implements Collection<b>, zh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Set<b> f132321b;

    public boolean a(@dl.d b element) {
        f0.p(element, "element");
        return this.f132321b.contains(element);
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(b bVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends b> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @dl.d
    public final Set<b> b() {
        return this.f132321b;
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof b) {
            return a((b) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@dl.d Collection<? extends Object> elements) {
        f0.p(elements, "elements");
        return this.f132321b.containsAll(elements);
    }

    public int e() {
        return this.f132321b.size();
    }

    @Override // java.util.Collection
    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && f0.g(this.f132321b, ((c) obj).f132321b);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f132321b.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f132321b.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @dl.d
    public Iterator<b> iterator() {
        return this.f132321b.iterator();
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
    public boolean removeIf(Predicate<? super b> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return e();
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
        return a.a(this);
    }
}
