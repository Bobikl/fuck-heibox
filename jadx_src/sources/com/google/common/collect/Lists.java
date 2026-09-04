package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@u
public final class Lists {

    public static class OnePlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @x1
        final E f57522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final E[] f57523c;

        OnePlusArrayList(@x1 E e10, E[] eArr) {
            this.f57522b = e10;
            this.f57523c = (E[]) ((Object[]) com.google.common.base.w.E(eArr));
        }

        @Override // java.util.AbstractList, java.util.List
        @x1
        public E get(int i10) {
            com.google.common.base.w.C(i10, size());
            return i10 == 0 ? this.f57522b : this.f57523c[i10 - 1];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return com.google.common.math.f.t(this.f57523c.length, 1);
        }
    }

    public static final class StringAsImmutableList extends ImmutableList<Character> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f57524d;

        StringAsImmutableList(String str) {
            this.f57524d = str;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        /* JADX INFO: renamed from: X */
        public ImmutableList<Character> subList(int i10, int i11) {
            com.google.common.base.w.f0(i10, i11, size());
            return Lists.g(this.f57524d.substring(i10, i11));
        }

        @Override // java.util.List
        /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
        public Character get(int i10) {
            com.google.common.base.w.C(i10, size());
            return Character.valueOf(this.f57524d.charAt(i10));
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean i() {
            return false;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            if (obj instanceof Character) {
                return this.f57524d.indexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            if (obj instanceof Character) {
                return this.f57524d.lastIndexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f57524d.length();
        }
    }

    public static class TransformingRandomAccessList<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final List<F> f57525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final com.google.common.base.n<? super F, ? extends T> f57526c;

        public class a extends x2<F, T> {
            a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // com.google.common.collect.w2
            T a(F f10) {
                return TransformingRandomAccessList.this.f57526c.apply(f10);
            }
        }

        TransformingRandomAccessList(List<F> list, com.google.common.base.n<? super F, ? extends T> nVar) {
            this.f57525b = (List) com.google.common.base.w.E(list);
            this.f57526c = (com.google.common.base.n) com.google.common.base.w.E(nVar);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f57525b.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        @x1
        public T get(int i10) {
            return this.f57526c.apply(this.f57525b.get(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f57525b.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i10) {
            return new a(this.f57525b.listIterator(i10));
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i10) {
            return this.f57526c.apply(this.f57525b.remove(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f57525b.size();
        }
    }

    public static class TransformingSequentialList<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final List<F> f57528b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final com.google.common.base.n<? super F, ? extends T> f57529c;

        public class a extends x2<F, T> {
            a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // com.google.common.collect.w2
            @x1
            T a(@x1 F f10) {
                return TransformingSequentialList.this.f57529c.apply(f10);
            }
        }

        TransformingSequentialList(List<F> list, com.google.common.base.n<? super F, ? extends T> nVar) {
            this.f57528b = (List) com.google.common.base.w.E(list);
            this.f57529c = (com.google.common.base.n) com.google.common.base.w.E(nVar);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f57528b.clear();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i10) {
            return new a(this.f57528b.listIterator(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f57528b.size();
        }
    }

    public static class TwoPlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @x1
        final E f57531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @x1
        final E f57532c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final E[] f57533d;

        TwoPlusArrayList(@x1 E e10, @x1 E e11, E[] eArr) {
            this.f57531b = e10;
            this.f57532c = e11;
            this.f57533d = (E[]) ((Object[]) com.google.common.base.w.E(eArr));
        }

        @Override // java.util.AbstractList, java.util.List
        @x1
        public E get(int i10) {
            if (i10 == 0) {
                return this.f57531b;
            }
            if (i10 == 1) {
                return this.f57532c;
            }
            com.google.common.base.w.C(i10, size());
            return this.f57533d[i10 - 2];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return com.google.common.math.f.t(this.f57533d.length, 2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    public class a<E> extends f<E> {
        private static final long serialVersionUID = 0;

        a(List list) {
            super(list);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int i10) {
            return this.f57534b.listIterator(i10);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    public class b<E> extends c<E> {
        private static final long serialVersionUID = 0;

        b(List list) {
            super(list);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int i10) {
            return this.f57534b.listIterator(i10);
        }
    }

    public static class c<E> extends AbstractList<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final List<E> f57534b;

        c(List<E> list) {
            this.f57534b = (List) com.google.common.base.w.E(list);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i10, @x1 E e10) {
            this.f57534b.add(i10, e10);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i10, Collection<? extends E> collection) {
            return this.f57534b.addAll(i10, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return this.f57534b.contains(obj);
        }

        @Override // java.util.AbstractList, java.util.List
        @x1
        public E get(int i10) {
            return this.f57534b.get(i10);
        }

        @Override // java.util.AbstractList, java.util.List
        @x1
        public E remove(int i10) {
            return this.f57534b.remove(i10);
        }

        @Override // java.util.AbstractList, java.util.List
        @x1
        public E set(int i10, @x1 E e10) {
            return this.f57534b.set(i10, e10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f57534b.size();
        }
    }

    public static final class d extends AbstractList<Character> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CharSequence f57535b;

        d(CharSequence charSequence) {
            this.f57535b = charSequence;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Character get(int i10) {
            com.google.common.base.w.C(i10, size());
            return Character.valueOf(this.f57535b.charAt(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f57535b.length();
        }
    }

    public static class e<T> extends AbstractList<List<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final List<T> f57536b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f57537c;

        e(List<T> list, int i10) {
            this.f57536b = list;
            this.f57537c = i10;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> get(int i10) {
            com.google.common.base.w.C(i10, size());
            int i11 = this.f57537c;
            int i12 = i10 * i11;
            return this.f57536b.subList(i12, Math.min(i11 + i12, this.f57536b.size()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f57536b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return com.google.common.math.f.g(this.f57536b.size(), this.f57537c, RoundingMode.CEILING);
        }
    }

    public static class f<E> extends c<E> implements RandomAccess {
        f(List<E> list) {
            super(list);
        }
    }

    public static class g<T> extends e<T> implements RandomAccess {
        g(List<T> list, int i10) {
            super(list, i10);
        }
    }

    public static class h<T> extends i<T> implements RandomAccess {
        h(List<T> list) {
            super(list);
        }
    }

    public static class i<T> extends AbstractList<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<T> f57538b;

        public class a implements ListIterator<T> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            boolean f57539b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ListIterator f57540c;

            a(ListIterator listIterator) {
                this.f57540c = listIterator;
            }

            @Override // java.util.ListIterator
            public void add(@x1 T t10) {
                this.f57540c.add(t10);
                this.f57540c.previous();
                this.f57539b = false;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f57540c.hasPrevious();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f57540c.hasNext();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            @x1
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f57539b = true;
                return (T) this.f57540c.previous();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return i.this.g(this.f57540c.nextIndex());
            }

            @Override // java.util.ListIterator
            @x1
            public T previous() {
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f57539b = true;
                return (T) this.f57540c.next();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return nextIndex() - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                n.e(this.f57539b);
                this.f57540c.remove();
                this.f57539b = false;
            }

            @Override // java.util.ListIterator
            public void set(@x1 T t10) {
                com.google.common.base.w.g0(this.f57539b);
                this.f57540c.set(t10);
            }
        }

        i(List<T> list) {
            this.f57538b = (List) com.google.common.base.w.E(list);
        }

        private int e(int i10) {
            int size = size();
            com.google.common.base.w.C(i10, size);
            return (size - 1) - i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int g(int i10) {
            int size = size();
            com.google.common.base.w.d0(i10, size);
            return size - i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i10, @x1 T t10) {
            this.f57538b.add(g(i10), t10);
        }

        List<T> b() {
            return this.f57538b;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f57538b.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        @x1
        public T get(int i10) {
            return this.f57538b.get(e(i10));
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i10) {
            return new a(this.f57538b.listIterator(g(i10)));
        }

        @Override // java.util.AbstractList, java.util.List
        @x1
        public T remove(int i10) {
            return this.f57538b.remove(e(i10));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i10, int i11) {
            subList(i10, i11).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        @x1
        public T set(int i10, @x1 T t10) {
            return this.f57538b.set(e(i10), t10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f57538b.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> subList(int i10, int i11) {
            com.google.common.base.w.f0(i10, i11, size());
            return Lists.B(this.f57538b.subList(g(i11), g(i10)));
        }
    }

    private Lists() {
    }

    public static <T> List<List<T>> A(List<T> list, int i10) {
        com.google.common.base.w.E(list);
        com.google.common.base.w.d(i10 > 0);
        return list instanceof RandomAccess ? new g(list, i10) : new e(list, i10);
    }

    public static <T> List<T> B(List<T> list) {
        if (list instanceof ImmutableList) {
            return ((ImmutableList) list).U();
        }
        if (list instanceof i) {
            return ((i) list).b();
        }
        return list instanceof RandomAccess ? new h(list) : new i(list);
    }

    static <E> List<E> C(List<E> list, int i10, int i11) {
        return (list instanceof RandomAccess ? new a(list) : new b(list)).subList(i10, i11);
    }

    public static <F, T> List<T> D(List<F> list, com.google.common.base.n<? super F, ? extends T> nVar) {
        return list instanceof RandomAccess ? new TransformingRandomAccessList(list, nVar) : new TransformingSequentialList(list, nVar);
    }

    static <E> boolean a(List<E> list, int i10, Iterable<? extends E> iterable) {
        ListIterator<E> listIterator = list.listIterator(i10);
        Iterator<? extends E> it = iterable.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            listIterator.add(it.next());
            z10 = true;
        }
        return z10;
    }

    public static <E> List<E> b(@x1 E e10, @x1 E e11, E[] eArr) {
        return new TwoPlusArrayList(e10, e11, eArr);
    }

    public static <E> List<E> c(@x1 E e10, E[] eArr) {
        return new OnePlusArrayList(e10, eArr);
    }

    public static <B> List<List<B>> d(List<? extends List<? extends B>> list) {
        return CartesianList.e(list);
    }

    @SafeVarargs
    public static <B> List<List<B>> e(List<? extends B>... listArr) {
        return d(Arrays.asList(listArr));
    }

    static <T> List<T> f(Iterable<T> iterable) {
        return (List) iterable;
    }

    public static ImmutableList<Character> g(String str) {
        return new StringAsImmutableList((String) com.google.common.base.w.E(str));
    }

    @o9.a
    public static List<Character> h(CharSequence charSequence) {
        return new d((CharSequence) com.google.common.base.w.E(charSequence));
    }

    @o9.d
    static int i(int i10) {
        n.b(i10, "arraySize");
        return Ints.x(((long) i10) + 5 + ((long) (i10 / 10)));
    }

    static boolean j(List<?> list, @CheckForNull Object obj) {
        if (obj == com.google.common.base.w.E(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return Iterators.t(list.iterator(), list2.iterator());
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!com.google.common.base.s.a(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    static int k(List<?> list) {
        Iterator<?> it = list.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~((i10 * 31) + (next == null ? 0 : next.hashCode())));
        }
        return i10;
    }

    static int l(List<?> list, @CheckForNull Object obj) {
        if (list instanceof RandomAccess) {
            return m(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (com.google.common.base.s.a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    private static int m(List<?> list, @CheckForNull Object obj) {
        int size = list.size();
        int i10 = 0;
        if (obj == null) {
            while (i10 < size) {
                if (list.get(i10) == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        while (i10 < size) {
            if (obj.equals(list.get(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    static int n(List<?> list, @CheckForNull Object obj) {
        if (list instanceof RandomAccess) {
            return o(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (com.google.common.base.s.a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int o(List<?> list, @CheckForNull Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    static <E> ListIterator<E> p(List<E> list, int i10) {
        return new c(list).listIterator(i10);
    }

    @o9.b(serializable = true)
    public static <E> ArrayList<E> q() {
        return new ArrayList<>();
    }

    @o9.b(serializable = true)
    public static <E> ArrayList<E> r(Iterable<? extends E> iterable) {
        com.google.common.base.w.E(iterable);
        return iterable instanceof Collection ? new ArrayList<>((Collection) iterable) : s(iterable.iterator());
    }

    @o9.b(serializable = true)
    public static <E> ArrayList<E> s(Iterator<? extends E> it) {
        ArrayList<E> arrayListQ = q();
        Iterators.a(arrayListQ, it);
        return arrayListQ;
    }

    @SafeVarargs
    @o9.b(serializable = true)
    public static <E> ArrayList<E> t(E... eArr) {
        com.google.common.base.w.E(eArr);
        ArrayList<E> arrayList = new ArrayList<>(i(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    @o9.b(serializable = true)
    public static <E> ArrayList<E> u(int i10) {
        n.b(i10, "initialArraySize");
        return new ArrayList<>(i10);
    }

    @o9.b(serializable = true)
    public static <E> ArrayList<E> v(int i10) {
        return new ArrayList<>(i(i10));
    }

    @o9.c
    public static <E> CopyOnWriteArrayList<E> w() {
        return new CopyOnWriteArrayList<>();
    }

    @o9.c
    public static <E> CopyOnWriteArrayList<E> x(Iterable<? extends E> iterable) {
        return new CopyOnWriteArrayList<>(iterable instanceof Collection ? (Collection) iterable : r(iterable));
    }

    @o9.b(serializable = true)
    public static <E> LinkedList<E> y() {
        return new LinkedList<>();
    }

    @o9.b(serializable = true)
    public static <E> LinkedList<E> z(Iterable<? extends E> iterable) {
        LinkedList<E> linkedListY = y();
        l1.a(linkedListY, iterable);
        return linkedListY;
    }
}
