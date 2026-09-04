package com.google.common.collect;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public final class CartesianList<E> extends AbstractList<List<E>> implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient ImmutableList<List<E>> f57102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient int[] f57103c;

    CartesianList(ImmutableList<List<E>> immutableList) {
        this.f57102b = immutableList;
        int[] iArr = new int[immutableList.size() + 1];
        iArr[immutableList.size()] = 1;
        try {
            for (int size = immutableList.size() - 1; size >= 0; size--) {
                iArr[size] = com.google.common.math.f.d(iArr[size + 1], immutableList.get(size).size());
            }
            this.f57103c = iArr;
        } catch (ArithmeticException unused) {
            throw new IllegalArgumentException("Cartesian product too large; must have size at most Integer.MAX_VALUE");
        }
    }

    static <E> List<List<E>> e(List<? extends List<? extends E>> list) {
        ImmutableList.a aVar = new ImmutableList.a(list.size());
        Iterator<? extends List<? extends E>> it = list.iterator();
        while (it.hasNext()) {
            ImmutableList immutableListV = ImmutableList.v(it.next());
            if (immutableListV.isEmpty()) {
                return ImmutableList.B();
            }
            aVar.a(immutableListV);
        }
        return new CartesianList(aVar.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int h(int i10, int i11) {
        return (i10 / this.f57103c[i11 + 1]) % this.f57102b.get(i11).size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(@CheckForNull Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        if (list.size() != this.f57102b.size()) {
            return false;
        }
        Iterator<E> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (!this.f57102b.get(i10).contains(it.next())) {
                return false;
            }
            i10++;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public ImmutableList<E> get(final int i10) {
        com.google.common.base.w.C(i10, size());
        return new ImmutableList<E>() { // from class: com.google.common.collect.CartesianList.1
            @Override // java.util.List
            public E get(int i11) {
                com.google.common.base.w.C(i11, size());
                return (E) ((List) CartesianList.this.f57102b.get(i11)).get(CartesianList.this.h(i10, i11));
            }

            @Override // com.google.common.collect.ImmutableCollection
            boolean i() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return CartesianList.this.f57102b.size();
            }
        };
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(@CheckForNull Object obj) {
        if (!(obj instanceof List)) {
            return -1;
        }
        List list = (List) obj;
        if (list.size() != this.f57102b.size()) {
            return -1;
        }
        ListIterator<E> listIterator = list.listIterator();
        int i10 = 0;
        while (listIterator.hasNext()) {
            int iNextIndex = listIterator.nextIndex();
            int iIndexOf = this.f57102b.get(iNextIndex).indexOf(listIterator.next());
            if (iIndexOf == -1) {
                return -1;
            }
            i10 += iIndexOf * this.f57103c[iNextIndex + 1];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(@CheckForNull Object obj) {
        if (!(obj instanceof List)) {
            return -1;
        }
        List list = (List) obj;
        if (list.size() != this.f57102b.size()) {
            return -1;
        }
        ListIterator<E> listIterator = list.listIterator();
        int i10 = 0;
        while (listIterator.hasNext()) {
            int iNextIndex = listIterator.nextIndex();
            int iLastIndexOf = this.f57102b.get(iNextIndex).lastIndexOf(listIterator.next());
            if (iLastIndexOf == -1) {
                return -1;
            }
            i10 += iLastIndexOf * this.f57103c[iNextIndex + 1];
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f57103c[0];
    }
}
