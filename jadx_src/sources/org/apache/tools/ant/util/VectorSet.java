package org.apache.tools.ant.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.Vector;

/* JADX INFO: loaded from: classes5.dex */
public final class VectorSet<E> extends Vector<E> {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet<E> f136721b;

    public VectorSet() {
        this.f136721b = new HashSet<>();
    }

    public VectorSet(int i10) {
        super(i10);
        this.f136721b = new HashSet<>();
    }

    public VectorSet(int i10, int i11) {
        super(i10, i11);
        this.f136721b = new HashSet<>();
    }

    public VectorSet(Collection<? extends E> collection) {
        this.f136721b = new HashSet<>();
        if (collection != null) {
            addAll(collection);
        }
    }

    private synchronized void a(int i10, E e10) {
        if (this.f136721b.add(e10)) {
            int size = size();
            ensureCapacity(size + 1);
            if (i10 != size) {
                Object[] objArr = ((Vector) this).elementData;
                System.arraycopy(objArr, i10, objArr, i10 + 1, size - i10);
            }
            ((Vector) this).elementData[i10] = e10;
            ((Vector) this).elementCount++;
        }
    }

    private synchronized boolean b(Object obj) {
        if (!this.f136721b.remove(obj)) {
            return false;
        }
        int iIndexOf = indexOf(obj);
        Object[] objArr = ((Vector) this).elementData;
        if (iIndexOf < objArr.length - 1) {
            System.arraycopy(objArr, iIndexOf + 1, objArr, iIndexOf, (objArr.length - iIndexOf) - 1);
        }
        ((Vector) this).elementCount--;
        return true;
    }

    @Override // java.util.Vector, java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        a(i10, e10);
    }

    @Override // java.util.Vector, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public synchronized boolean add(E e10) {
        if (this.f136721b.contains(e10)) {
            return false;
        }
        a(size(), e10);
        return true;
    }

    @Override // java.util.Vector, java.util.AbstractList, java.util.List
    public synchronized boolean addAll(int i10, Collection<? extends E> collection) {
        LinkedList linkedList = new LinkedList();
        for (E e10 : collection) {
            if (this.f136721b.add(e10)) {
                linkedList.add(e10);
            }
        }
        if (linkedList.isEmpty()) {
            return false;
        }
        int size = size();
        ensureCapacity(linkedList.size() + size);
        if (i10 != size) {
            Object[] objArr = ((Vector) this).elementData;
            System.arraycopy(objArr, i10, objArr, linkedList.size() + i10, size - i10);
        }
        Iterator<E> it = linkedList.iterator();
        while (it.hasNext()) {
            ((Vector) this).elementData[i10] = it.next();
            i10++;
        }
        ((Vector) this).elementCount += linkedList.size();
        return true;
    }

    @Override // java.util.Vector, java.util.AbstractCollection, java.util.Collection, java.util.List
    public synchronized boolean addAll(Collection<? extends E> collection) {
        boolean zAdd;
        zAdd = false;
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Vector
    public synchronized void addElement(E e10) {
        a(size(), e10);
    }

    @Override // java.util.Vector, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public synchronized void clear() {
        super.clear();
        this.f136721b.clear();
    }

    @Override // java.util.Vector
    public Object clone() {
        VectorSet vectorSet = (VectorSet) super.clone();
        vectorSet.f136721b.addAll(this.f136721b);
        return vectorSet;
    }

    @Override // java.util.Vector, java.util.AbstractCollection, java.util.Collection, java.util.List
    public synchronized boolean contains(Object obj) {
        return this.f136721b.contains(obj);
    }

    @Override // java.util.Vector, java.util.AbstractCollection, java.util.Collection, java.util.List
    public synchronized boolean containsAll(Collection<?> collection) {
        return this.f136721b.containsAll(collection);
    }

    @Override // java.util.Vector
    public void insertElementAt(E e10, int i10) {
        a(i10, e10);
    }

    @Override // java.util.Vector, java.util.AbstractList, java.util.List
    public synchronized E remove(int i10) {
        E e10;
        e10 = get(i10);
        remove(e10);
        return e10;
    }

    @Override // java.util.Vector, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        return b(obj);
    }

    @Override // java.util.Vector, java.util.AbstractCollection, java.util.Collection, java.util.List
    public synchronized boolean removeAll(Collection<?> collection) {
        boolean zRemove;
        zRemove = false;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Vector
    public synchronized void removeAllElements() {
        this.f136721b.clear();
        super.removeAllElements();
    }

    @Override // java.util.Vector
    public boolean removeElement(Object obj) {
        return b(obj);
    }

    @Override // java.util.Vector
    public synchronized void removeElementAt(int i10) {
        remove(get(i10));
    }

    @Override // java.util.Vector, java.util.AbstractList
    public synchronized void removeRange(int i10, int i11) {
        while (i11 > i10) {
            i11--;
            remove(i11);
        }
    }

    @Override // java.util.Vector, java.util.AbstractCollection, java.util.Collection, java.util.List
    public synchronized boolean retainAll(Collection<?> collection) {
        if (!(collection instanceof Set)) {
            collection = new HashSet((Collection<? extends Object>) collection);
        }
        LinkedList linkedList = new LinkedList();
        for (E e10 : this) {
            if (!collection.contains(e10)) {
                linkedList.addLast(e10);
            }
        }
        if (linkedList.isEmpty()) {
            return false;
        }
        removeAll(linkedList);
        return true;
    }

    @Override // java.util.Vector, java.util.AbstractList, java.util.List
    public synchronized E set(int i10, E e10) {
        E e11;
        e11 = get(i10);
        if (this.f136721b.add(e10)) {
            ((Vector) this).elementData[i10] = e10;
            this.f136721b.remove(e11);
        } else {
            int iIndexOf = indexOf(e10);
            remove(e10);
            remove(e11);
            if (iIndexOf <= i10) {
                i10--;
            }
            add(i10, e10);
        }
        return e11;
    }

    @Override // java.util.Vector
    public void setElementAt(E e10, int i10) {
        set(i10, e10);
    }
}
