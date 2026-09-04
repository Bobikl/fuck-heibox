package io.reactivex.internal.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class VolatileSizeArrayList<T> extends AtomicInteger implements List<T>, RandomAccess {
    private static final long serialVersionUID = 3972397474470203923L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList<T> f123864b;

    public VolatileSizeArrayList() {
        this.f123864b = new ArrayList<>();
    }

    public VolatileSizeArrayList(int i10) {
        this.f123864b = new ArrayList<>(i10);
    }

    @Override // java.util.List
    public void add(int i10, T t10) {
        this.f123864b.add(i10, t10);
        lazySet(this.f123864b.size());
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t10) {
        boolean zAdd = this.f123864b.add(t10);
        lazySet(this.f123864b.size());
        return zAdd;
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends T> collection) {
        boolean zAddAll = this.f123864b.addAll(i10, collection);
        lazySet(this.f123864b.size());
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        boolean zAddAll = this.f123864b.addAll(collection);
        lazySet(this.f123864b.size());
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f123864b.clear();
        lazySet(0);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f123864b.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f123864b.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return obj instanceof VolatileSizeArrayList ? this.f123864b.equals(((VolatileSizeArrayList) obj).f123864b) : this.f123864b.equals(obj);
    }

    @Override // java.util.List
    public T get(int i10) {
        return this.f123864b.get(i10);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f123864b.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f123864b.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return get() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return this.f123864b.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f123864b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return this.f123864b.listIterator();
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i10) {
        return this.f123864b.listIterator(i10);
    }

    @Override // java.util.List
    public T remove(int i10) {
        T tRemove = this.f123864b.remove(i10);
        lazySet(this.f123864b.size());
        return tRemove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        boolean zRemove = this.f123864b.remove(obj);
        lazySet(this.f123864b.size());
        return zRemove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        boolean zRemoveAll = this.f123864b.removeAll(collection);
        lazySet(this.f123864b.size());
        return zRemoveAll;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean zRetainAll = this.f123864b.retainAll(collection);
        lazySet(this.f123864b.size());
        return zRetainAll;
    }

    @Override // java.util.List
    public T set(int i10, T t10) {
        return this.f123864b.set(i10, t10);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return get();
    }

    @Override // java.util.List
    public List<T> subList(int i10, int i11) {
        return this.f123864b.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f123864b.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public <E> E[] toArray(E[] eArr) {
        return (E[]) this.f123864b.toArray(eArr);
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public String toString() {
        return this.f123864b.toString();
    }
}
