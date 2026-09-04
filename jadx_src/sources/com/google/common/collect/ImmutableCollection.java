package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@s9.f("Use ImmutableList.of or another implementation")
@u
public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object[] f57267b = new Object[0];

    public static abstract class a<E> extends b<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object[] f57268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f57269c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f57270d;

        a(int i10) {
            n.b(i10, "initialCapacity");
            this.f57268b = new Object[i10];
            this.f57269c = 0;
        }

        private void i(int i10) {
            Object[] objArr = this.f57268b;
            if (objArr.length < i10) {
                this.f57268b = Arrays.copyOf(objArr, b.f(objArr.length, i10));
                this.f57270d = false;
            } else if (this.f57270d) {
                this.f57268b = (Object[]) objArr.clone();
                this.f57270d = false;
            }
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        @s9.a
        public b<E> b(E... eArr) {
            h(eArr, eArr.length);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        @s9.a
        public b<E> c(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                i(this.f57269c + collection.size());
                if (collection instanceof ImmutableCollection) {
                    this.f57269c = ((ImmutableCollection) collection).b(this.f57268b, this.f57269c);
                    return this;
                }
            }
            super.c(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        @s9.a
        public a<E> g(E e10) {
            com.google.common.base.w.E(e10);
            i(this.f57269c + 1);
            Object[] objArr = this.f57268b;
            int i10 = this.f57269c;
            this.f57269c = i10 + 1;
            objArr[i10] = e10;
            return this;
        }

        final void h(Object[] objArr, int i10) {
            u1.c(objArr, i10);
            i(this.f57269c + i10);
            System.arraycopy(objArr, 0, this.f57268b, this.f57269c, i10);
            this.f57269c += i10;
        }
    }

    @s9.f
    public static abstract class b<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f57271a = 4;

        b() {
        }

        static int f(int i10, int i11) {
            if (i11 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i10 + (i10 >> 1) + 1;
            if (iHighestOneBit < i11) {
                iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        @s9.a
        /* JADX INFO: renamed from: a */
        public abstract b<E> g(E e10);

        @s9.a
        public b<E> b(E... eArr) {
            for (E e10 : eArr) {
                g(e10);
            }
            return this;
        }

        @s9.a
        public b<E> c(Iterable<? extends E> iterable) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                g(it.next());
            }
            return this;
        }

        @s9.a
        public b<E> d(Iterator<? extends E> it) {
            while (it.hasNext()) {
                g(it.next());
            }
            return this;
        }

        public abstract ImmutableCollection<E> e();
    }

    ImmutableCollection() {
    }

    public ImmutableList<E> a() {
        return isEmpty() ? ImmutableList.B() : ImmutableList.m(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @s9.a
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @s9.a
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @s9.a
    int b(Object[] objArr, int i10) {
        b3<E> it = iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(@CheckForNull Object obj);

    @CheckForNull
    Object[] e() {
        return null;
    }

    int g() {
        throw new UnsupportedOperationException();
    }

    int h() {
        throw new UnsupportedOperationException();
    }

    abstract boolean i();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.j2
    /* JADX INFO: renamed from: j */
    public abstract b3<E> iterator();

    Object l() {
        return new ImmutableList.SerializedForm(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @s9.a
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @s9.a
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @s9.a
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f57267b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @s9.a
    public final <T> T[] toArray(T[] tArr) {
        com.google.common.base.w.E(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] objArrE = e();
            if (objArrE != null) {
                return (T[]) z1.b(objArrE, h(), g(), tArr);
            }
            tArr = (T[]) u1.j(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        b(tArr, 0);
        return tArr;
    }
}
