package com.google.common.collect;

import com.google.common.base.Predicates;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@u
public final class Sets {

    public static final class CartesianSet<E> extends h0<List<E>> implements Set<List<E>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final transient ImmutableList<ImmutableSet<E>> f57845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient CartesianList<E> f57846c;

        private CartesianSet(ImmutableList<ImmutableSet<E>> immutableList, CartesianList<E> cartesianList) {
            this.f57845b = immutableList;
            this.f57846c = cartesianList;
        }

        static <E> Set<List<E>> X0(List<? extends Set<? extends E>> list) {
            ImmutableList.a aVar = new ImmutableList.a(list.size());
            Iterator<? extends Set<? extends E>> it = list.iterator();
            while (it.hasNext()) {
                ImmutableSet immutableSetW = ImmutableSet.w(it.next());
                if (immutableSetW.isEmpty()) {
                    return ImmutableSet.D();
                }
                aVar.a(immutableSetW);
            }
            final ImmutableList<E> immutableListE = aVar.e();
            return new CartesianSet(immutableListE, new CartesianList(new ImmutableList<List<E>>() { // from class: com.google.common.collect.Sets.CartesianSet.1
                @Override // java.util.List
                /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
                public List<E> get(int i10) {
                    return ((ImmutableSet) immutableListE.get(i10)).a();
                }

                @Override // com.google.common.collect.ImmutableCollection
                boolean i() {
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return immutableListE.size();
                }
            }));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.h0, com.google.common.collect.y0
        /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
        public Collection<List<E>> X0() {
            return this.f57846c;
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (list.size() != this.f57845b.size()) {
                return false;
            }
            Iterator<E> it = list.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (!this.f57845b.get(i10).contains(it.next())) {
                    return false;
                }
                i10++;
            }
            return true;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@CheckForNull Object obj) {
            return obj instanceof CartesianSet ? this.f57845b.equals(((CartesianSet) obj).f57845b) : super.equals(obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            int i10 = 1;
            int size = size() - 1;
            for (int i11 = 0; i11 < this.f57845b.size(); i11++) {
                size = ~(~(size * 31));
            }
            b3<ImmutableSet<E>> it = this.f57845b.iterator();
            while (it.hasNext()) {
                ImmutableSet<E> next = it.next();
                i10 = ~(~((i10 * 31) + ((size() / next.size()) * next.hashCode())));
            }
            return ~(~(i10 + size));
        }
    }

    public static final class UnmodifiableNavigableSet<E> extends e1<E> implements NavigableSet<E>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final NavigableSet<E> f57848b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final SortedSet<E> f57849c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        private transient UnmodifiableNavigableSet<E> f57850d;

        UnmodifiableNavigableSet(NavigableSet<E> navigableSet) {
            this.f57848b = (NavigableSet) com.google.common.base.w.E(navigableSet);
            this.f57849c = Collections.unmodifiableSortedSet(navigableSet);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.e1, com.google.common.collect.a1
        /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public SortedSet<E> X0() {
            return this.f57849c;
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E ceiling(@x1 E e10) {
            return this.f57848b.ceiling(e10);
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return Iterators.f0(this.f57848b.descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            UnmodifiableNavigableSet<E> unmodifiableNavigableSet = this.f57850d;
            if (unmodifiableNavigableSet != null) {
                return unmodifiableNavigableSet;
            }
            UnmodifiableNavigableSet<E> unmodifiableNavigableSet2 = new UnmodifiableNavigableSet<>(this.f57848b.descendingSet());
            this.f57850d = unmodifiableNavigableSet2;
            unmodifiableNavigableSet2.f57850d = this;
            return unmodifiableNavigableSet2;
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E floor(@x1 E e10) {
            return this.f57848b.floor(e10);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@x1 E e10, boolean z10) {
            return Sets.O(this.f57848b.headSet(e10, z10));
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E higher(@x1 E e10) {
            return this.f57848b.higher(e10);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E lower(@x1 E e10) {
            return this.f57848b.lower(e10);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E pollFirst() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E pollLast() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@x1 E e10, boolean z10, @x1 E e11, boolean z11) {
            return Sets.O(this.f57848b.subSet(e10, z10, e11, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@x1 E e10, boolean z10) {
            return Sets.O(this.f57848b.tailSet(e10, z10));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    public class a<E> extends l<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f57851b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set f57852c;

        /* JADX INFO: renamed from: com.google.common.collect.Sets$a$a, reason: collision with other inner class name */
        public class C0456a extends AbstractIterator<E> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final Iterator<? extends E> f57853d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final Iterator<? extends E> f57854e;

            C0456a() {
                this.f57853d = a.this.f57851b.iterator();
                this.f57854e = a.this.f57852c.iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            protected E a() {
                if (this.f57853d.hasNext()) {
                    return this.f57853d.next();
                }
                while (this.f57854e.hasNext()) {
                    E next = this.f57854e.next();
                    if (!a.this.f57851b.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super(null);
            this.f57851b = set;
            this.f57852c = set2;
        }

        @Override // com.google.common.collect.Sets.l
        public <S extends Set<E>> S a(S s10) {
            s10.addAll(this.f57851b);
            s10.addAll(this.f57852c);
            return s10;
        }

        @Override // com.google.common.collect.Sets.l
        public ImmutableSet<E> b() {
            return new ImmutableSet.a().c(this.f57851b).c(this.f57852c).e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return this.f57851b.contains(obj) || this.f57852c.contains(obj);
        }

        @Override // com.google.common.collect.Sets.l, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public b3<E> iterator() {
            return new C0456a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f57851b.isEmpty() && this.f57852c.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f57851b.size();
            Iterator<E> it = this.f57852c.iterator();
            while (it.hasNext()) {
                if (!this.f57851b.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    public class b<E> extends l<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f57856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set f57857c;

        public class a extends AbstractIterator<E> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final Iterator<E> f57858d;

            a() {
                this.f57858d = b.this.f57856b.iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            protected E a() {
                while (this.f57858d.hasNext()) {
                    E next = this.f57858d.next();
                    if (b.this.f57857c.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Set set, Set set2) {
            super(null);
            this.f57856b = set;
            this.f57857c = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return this.f57856b.contains(obj) && this.f57857c.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f57856b.containsAll(collection) && this.f57857c.containsAll(collection);
        }

        @Override // com.google.common.collect.Sets.l, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: e */
        public b3<E> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f57857c, this.f57856b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f57856b.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (this.f57857c.contains(it.next())) {
                    i10++;
                }
            }
            return i10;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    public class c<E> extends l<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f57860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set f57861c;

        public class a extends AbstractIterator<E> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final Iterator<E> f57862d;

            a() {
                this.f57862d = c.this.f57860b.iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            protected E a() {
                while (this.f57862d.hasNext()) {
                    E next = this.f57862d.next();
                    if (!c.this.f57861c.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Set set, Set set2) {
            super(null);
            this.f57860b = set;
            this.f57861c = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return this.f57860b.contains(obj) && !this.f57861c.contains(obj);
        }

        @Override // com.google.common.collect.Sets.l, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: e */
        public b3<E> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f57861c.containsAll(this.f57860b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f57860b.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (!this.f57861c.contains(it.next())) {
                    i10++;
                }
            }
            return i10;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    public class d<E> extends l<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f57864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set f57865c;

        public class a extends AbstractIterator<E> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Iterator f57866d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Iterator f57867e;

            a(Iterator it, Iterator it2) {
                this.f57866d = it;
                this.f57867e = it2;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public E a() {
                while (this.f57866d.hasNext()) {
                    E e10 = (E) this.f57866d.next();
                    if (!d.this.f57865c.contains(e10)) {
                        return e10;
                    }
                }
                while (this.f57867e.hasNext()) {
                    E e11 = (E) this.f57867e.next();
                    if (!d.this.f57864b.contains(e11)) {
                        return e11;
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Set set, Set set2) {
            super(null);
            this.f57864b = set;
            this.f57865c = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return this.f57865c.contains(obj) ^ this.f57864b.contains(obj);
        }

        @Override // com.google.common.collect.Sets.l, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: e */
        public b3<E> iterator() {
            return new a(this.f57864b.iterator(), this.f57865c.iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f57864b.equals(this.f57865c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f57864b.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (!this.f57865c.contains(it.next())) {
                    i10++;
                }
            }
            Iterator<E> it2 = this.f57865c.iterator();
            while (it2.hasNext()) {
                if (!this.f57864b.contains(it2.next())) {
                    i10++;
                }
            }
            return i10;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    public class e<E> extends AbstractSet<Set<E>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f57869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ImmutableMap f57870c;

        public class a extends AbstractIterator<Set<E>> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final BitSet f57871d;

            /* JADX INFO: renamed from: com.google.common.collect.Sets$e$a$a, reason: collision with other inner class name */
            public class C0457a extends AbstractSet<E> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ BitSet f57873b;

                /* JADX INFO: renamed from: com.google.common.collect.Sets$e$a$a$a, reason: collision with other inner class name */
                public class C0458a extends AbstractIterator<E> {

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    int f57875d = -1;

                    C0458a() {
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    @CheckForNull
                    protected E a() {
                        int iNextSetBit = C0457a.this.f57873b.nextSetBit(this.f57875d + 1);
                        this.f57875d = iNextSetBit;
                        return iNextSetBit == -1 ? b() : e.this.f57870c.keySet().a().get(this.f57875d);
                    }
                }

                C0457a(BitSet bitSet) {
                    this.f57873b = bitSet;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean contains(@CheckForNull Object obj) {
                    Integer num = (Integer) e.this.f57870c.get(obj);
                    return num != null && this.f57873b.get(num.intValue());
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<E> iterator() {
                    return new C0458a();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return e.this.f57869b;
                }
            }

            a() {
                this.f57871d = new BitSet(e.this.f57870c.size());
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Set<E> a() {
                if (this.f57871d.isEmpty()) {
                    this.f57871d.set(0, e.this.f57869b);
                } else {
                    int iNextSetBit = this.f57871d.nextSetBit(0);
                    int iNextClearBit = this.f57871d.nextClearBit(iNextSetBit);
                    if (iNextClearBit == e.this.f57870c.size()) {
                        return b();
                    }
                    int i10 = (iNextClearBit - iNextSetBit) - 1;
                    this.f57871d.set(0, i10);
                    this.f57871d.clear(i10, iNextClearBit);
                    this.f57871d.set(iNextClearBit);
                }
                return new C0457a((BitSet) this.f57871d.clone());
            }
        }

        e(int i10, ImmutableMap immutableMap) {
            this.f57869b = i10;
            this.f57870c = immutableMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            return set.size() == this.f57869b && this.f57870c.keySet().containsAll(set);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<E>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return com.google.common.math.f.a(this.f57870c.size(), this.f57869b);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            String strValueOf = String.valueOf(this.f57870c.keySet());
            int i10 = this.f57869b;
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 32);
            sb2.append("Sets.combinations(");
            sb2.append(strValueOf);
            sb2.append(", ");
            sb2.append(i10);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @o9.c
    public static class f<E> extends x0<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final NavigableSet<E> f57877b;

        f(NavigableSet<E> navigableSet) {
            this.f57877b = navigableSet;
        }

        private static <T> Ordering<T> w1(Comparator<T> comparator) {
            return Ordering.i(comparator).E();
        }

        @Override // com.google.common.collect.x0, java.util.NavigableSet
        @CheckForNull
        public E ceiling(@x1 E e10) {
            return this.f57877b.floor(e10);
        }

        @Override // com.google.common.collect.e1, java.util.SortedSet
        public Comparator<? super E> comparator() {
            Comparator<? super E> comparator = this.f57877b.comparator();
            return comparator == null ? Ordering.z().E() : w1(comparator);
        }

        @Override // com.google.common.collect.x0, java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return this.f57877b.iterator();
        }

        @Override // com.google.common.collect.x0, java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return this.f57877b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.x0, com.google.common.collect.e1
        /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<E> H0() {
            return this.f57877b;
        }

        @Override // com.google.common.collect.e1, java.util.SortedSet
        @x1
        public E first() {
            return this.f57877b.last();
        }

        @Override // com.google.common.collect.x0, java.util.NavigableSet
        @CheckForNull
        public E floor(@x1 E e10) {
            return this.f57877b.ceiling(e10);
        }

        @Override // com.google.common.collect.x0, java.util.NavigableSet
        public NavigableSet<E> headSet(@x1 E e10, boolean z10) {
            return this.f57877b.tailSet(e10, z10).descendingSet();
        }

        @Override // com.google.common.collect.e1, java.util.SortedSet
        public SortedSet<E> headSet(@x1 E e10) {
            return m1(e10);
        }

        @Override // com.google.common.collect.x0, java.util.NavigableSet
        @CheckForNull
        public E higher(@x1 E e10) {
            return this.f57877b.lower(e10);
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return this.f57877b.descendingIterator();
        }

        @Override // com.google.common.collect.e1, java.util.SortedSet
        @x1
        public E last() {
            return this.f57877b.first();
        }

        @Override // com.google.common.collect.x0, java.util.NavigableSet
        @CheckForNull
        public E lower(@x1 E e10) {
            return this.f57877b.higher(e10);
        }

        @Override // com.google.common.collect.x0, java.util.NavigableSet
        @CheckForNull
        public E pollFirst() {
            return this.f57877b.pollLast();
        }

        @Override // com.google.common.collect.x0, java.util.NavigableSet
        @CheckForNull
        public E pollLast() {
            return this.f57877b.pollFirst();
        }

        @Override // com.google.common.collect.x0, java.util.NavigableSet
        public NavigableSet<E> subSet(@x1 E e10, boolean z10, @x1 E e11, boolean z11) {
            return this.f57877b.subSet(e11, z11, e10, z10).descendingSet();
        }

        @Override // com.google.common.collect.e1, java.util.SortedSet
        public SortedSet<E> subSet(@x1 E e10, @x1 E e11) {
            return c1(e10, e11);
        }

        @Override // com.google.common.collect.x0, java.util.NavigableSet
        public NavigableSet<E> tailSet(@x1 E e10, boolean z10) {
            return this.f57877b.headSet(e10, z10).descendingSet();
        }

        @Override // com.google.common.collect.e1, java.util.SortedSet
        public SortedSet<E> tailSet(@x1 E e10) {
            return v1(e10);
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return U0();
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) V0(tArr);
        }

        @Override // com.google.common.collect.y0
        public String toString() {
            return W0();
        }
    }

    @o9.c
    public static class g<E> extends i<E> implements NavigableSet<E> {
        g(NavigableSet<E> navigableSet, com.google.common.base.x<? super E> xVar) {
            super(navigableSet, xVar);
        }

        NavigableSet<E> b() {
            return (NavigableSet) this.f58114b;
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E ceiling(@x1 E e10) {
            return (E) l1.r(b().tailSet(e10, true), this.f58115c, null);
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return Iterators.x(b().descendingIterator(), this.f58115c);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return Sets.h(b().descendingSet(), this.f58115c);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E floor(@x1 E e10) {
            return (E) Iterators.A(b().headSet(e10, true).descendingIterator(), this.f58115c, null);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@x1 E e10, boolean z10) {
            return Sets.h(b().headSet(e10, z10), this.f58115c);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E higher(@x1 E e10) {
            return (E) l1.r(b().tailSet(e10, false), this.f58115c, null);
        }

        @Override // com.google.common.collect.Sets.i, java.util.SortedSet
        @x1
        public E last() {
            return (E) Iterators.z(b().descendingIterator(), this.f58115c);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E lower(@x1 E e10) {
            return (E) Iterators.A(b().headSet(e10, false).descendingIterator(), this.f58115c, null);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E pollFirst() {
            return (E) l1.I(b(), this.f58115c);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E pollLast() {
            return (E) l1.I(b().descendingSet(), this.f58115c);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@x1 E e10, boolean z10, @x1 E e11, boolean z11) {
            return Sets.h(b().subSet(e10, z10, e11, z11), this.f58115c);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@x1 E e10, boolean z10) {
            return Sets.h(b().tailSet(e10, z10), this.f58115c);
        }
    }

    public static class h<E> extends o.a<E> implements Set<E> {
        h(Set<E> set, com.google.common.base.x<? super E> xVar) {
            super(set, xVar);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@CheckForNull Object obj) {
            return Sets.g(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.k(this);
        }
    }

    public static class i<E> extends h<E> implements SortedSet<E> {
        i(SortedSet<E> sortedSet, com.google.common.base.x<? super E> xVar) {
            super(sortedSet, xVar);
        }

        @Override // java.util.SortedSet
        @CheckForNull
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f58114b).comparator();
        }

        @Override // java.util.SortedSet
        @x1
        public E first() {
            return (E) Iterators.z(this.f58114b.iterator(), this.f58115c);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(@x1 E e10) {
            return new i(((SortedSet) this.f58114b).headSet(e10), this.f58115c);
        }

        @x1
        public E last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f58114b;
            while (true) {
                E e10 = (Object) sortedSetHeadSet.last();
                if (this.f58115c.apply(e10)) {
                    return e10;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(e10);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(@x1 E e10, @x1 E e11) {
            return new i(((SortedSet) this.f58114b).subSet(e10, e11), this.f58115c);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(@x1 E e10) {
            return new i(((SortedSet) this.f58114b).tailSet(e10), this.f58115c);
        }
    }

    public static abstract class j<E> extends AbstractSet<E> {
        j() {
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return Sets.I(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) com.google.common.base.w.E(collection));
        }
    }

    public static final class k<E> extends AbstractSet<Set<E>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ImmutableMap<E, Integer> f57878b;

        public class a extends com.google.common.collect.a<Set<E>> {
            a(int i10) {
                super(i10);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Set<E> a(int i10) {
                return new m(k.this.f57878b, i10);
            }
        }

        k(Set<E> set) {
            com.google.common.base.w.k(set.size() <= 30, "Too many elements to create power set: %s > 30", set.size());
            this.f57878b = Maps.Q(set);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Set)) {
                return false;
            }
            return this.f57878b.keySet().containsAll((Set) obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@CheckForNull Object obj) {
            return obj instanceof k ? this.f57878b.keySet().equals(((k) obj).f57878b.keySet()) : super.equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return this.f57878b.keySet().hashCode() << (this.f57878b.size() - 1);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<E>> iterator() {
            return new a(size());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return 1 << this.f57878b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            String strValueOf = String.valueOf(this.f57878b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 10);
            sb2.append("powerSet(");
            sb2.append(strValueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static abstract class l<E> extends AbstractSet<E> {
        private l() {
        }

        /* synthetic */ l(a aVar) {
            this();
        }

        @s9.a
        public <S extends Set<E>> S a(S s10) {
            s10.addAll(this);
            return s10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @s9.a
        @s9.e("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean add(@x1 E e10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @s9.a
        @s9.e("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        public ImmutableSet<E> b() {
            return ImmutableSet.w(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @s9.e("Always throws UnsupportedOperationException")
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: e */
        public abstract b3<E> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @s9.a
        @s9.e("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean remove(@CheckForNull Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @s9.a
        @s9.e("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @s9.a
        @s9.e("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
    }

    public static final class m<E> extends AbstractSet<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ImmutableMap<E, Integer> f57880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f57881c;

        public class a extends b3<E> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final ImmutableList<E> f57882b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f57883c;

            a() {
                this.f57882b = m.this.f57880b.keySet().a();
                this.f57883c = m.this.f57881c;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f57883c != 0;
            }

            @Override // java.util.Iterator
            public E next() {
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(this.f57883c);
                if (iNumberOfTrailingZeros == 32) {
                    throw new NoSuchElementException();
                }
                this.f57883c &= ~(1 << iNumberOfTrailingZeros);
                return this.f57882b.get(iNumberOfTrailingZeros);
            }
        }

        m(ImmutableMap<E, Integer> immutableMap, int i10) {
            this.f57880b = immutableMap;
            this.f57881c = i10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            Integer num = this.f57880b.get(obj);
            if (num != null) {
                if (((1 << num.intValue()) & this.f57881c) != 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return Integer.bitCount(this.f57881c);
        }
    }

    private Sets() {
    }

    public static <E> LinkedHashSet<E> A() {
        return new LinkedHashSet<>();
    }

    public static <E> LinkedHashSet<E> B(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet<>((Collection) iterable);
        }
        LinkedHashSet<E> linkedHashSetA = A();
        l1.a(linkedHashSetA, iterable);
        return linkedHashSetA;
    }

    public static <E> LinkedHashSet<E> C(int i10) {
        return new LinkedHashSet<>(Maps.o(i10));
    }

    @Deprecated
    public static <E> Set<E> D(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }

    public static <E extends Comparable> TreeSet<E> E() {
        return new TreeSet<>();
    }

    public static <E extends Comparable> TreeSet<E> F(Iterable<? extends E> iterable) {
        TreeSet<E> treeSetE = E();
        l1.a(treeSetE, iterable);
        return treeSetE;
    }

    public static <E> TreeSet<E> G(Comparator<? super E> comparator) {
        return new TreeSet<>((Comparator) com.google.common.base.w.E(comparator));
    }

    @o9.b(serializable = false)
    public static <E> Set<Set<E>> H(Set<E> set) {
        return new k(set);
    }

    static boolean I(Set<?> set, Collection<?> collection) {
        com.google.common.base.w.E(collection);
        if (collection instanceof s1) {
            collection = ((s1) collection).c();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? J(set, collection.iterator()) : Iterators.V(set.iterator(), collection);
    }

    static boolean J(Set<?> set, Iterator<?> it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o9.a
    @o9.c
    public static <K extends Comparable<? super K>> NavigableSet<K> K(NavigableSet<K> navigableSet, Range<K> range) {
        if (navigableSet.comparator() != null && navigableSet.comparator() != Ordering.z() && range.q() && range.r()) {
            com.google.common.base.w.e(navigableSet.comparator().compare(range.y(), range.K()) <= 0, "set is using a custom comparator which is inconsistent with the natural ordering.");
        }
        if (range.q() && range.r()) {
            Comparable comparableY = range.y();
            BoundType boundTypeX = range.x();
            BoundType boundType = BoundType.CLOSED;
            return navigableSet.subSet(comparableY, boundTypeX == boundType, range.K(), range.J() == boundType);
        }
        if (range.q()) {
            return navigableSet.tailSet(range.y(), range.x() == BoundType.CLOSED);
        }
        if (range.r()) {
            return navigableSet.headSet(range.K(), range.J() == BoundType.CLOSED);
        }
        return (NavigableSet) com.google.common.base.w.E(navigableSet);
    }

    public static <E> l<E> L(Set<? extends E> set, Set<? extends E> set2) {
        com.google.common.base.w.F(set, "set1");
        com.google.common.base.w.F(set2, "set2");
        return new d(set, set2);
    }

    @o9.c
    public static <E> NavigableSet<E> M(NavigableSet<E> navigableSet) {
        return Synchronized.q(navigableSet);
    }

    public static <E> l<E> N(Set<? extends E> set, Set<? extends E> set2) {
        com.google.common.base.w.F(set, "set1");
        com.google.common.base.w.F(set2, "set2");
        return new a(set, set2);
    }

    public static <E> NavigableSet<E> O(NavigableSet<E> navigableSet) {
        return ((navigableSet instanceof ImmutableCollection) || (navigableSet instanceof UnmodifiableNavigableSet)) ? navigableSet : new UnmodifiableNavigableSet(navigableSet);
    }

    public static <B> Set<List<B>> a(List<? extends Set<? extends B>> list) {
        return CartesianSet.X0(list);
    }

    @SafeVarargs
    public static <B> Set<List<B>> b(Set<? extends B>... setArr) {
        return a(Arrays.asList(setArr));
    }

    @o9.a
    public static <E> Set<Set<E>> c(Set<E> set, int i10) {
        ImmutableMap immutableMapQ = Maps.Q(set);
        n.b(i10, UiKitSpanObj.TYPE_SIZE);
        com.google.common.base.w.m(i10 <= immutableMapQ.size(), "size (%s) must be <= set.size() (%s)", i10, immutableMapQ.size());
        if (i10 == 0) {
            return ImmutableSet.E(ImmutableSet.D());
        }
        return i10 == immutableMapQ.size() ? ImmutableSet.E(immutableMapQ.keySet()) : new e(i10, immutableMapQ);
    }

    public static <E extends Enum<E>> EnumSet<E> d(Collection<E> collection) {
        if (collection instanceof EnumSet) {
            return EnumSet.complementOf((EnumSet) collection);
        }
        com.google.common.base.w.e(!collection.isEmpty(), "collection is empty; use the other version of this method");
        return o(collection, collection.iterator().next().getDeclaringClass());
    }

    public static <E extends Enum<E>> EnumSet<E> e(Collection<E> collection, Class<E> cls) {
        com.google.common.base.w.E(collection);
        return collection instanceof EnumSet ? EnumSet.complementOf((EnumSet) collection) : o(collection, cls);
    }

    public static <E> l<E> f(Set<E> set, Set<?> set2) {
        com.google.common.base.w.F(set, "set1");
        com.google.common.base.w.F(set2, "set2");
        return new c(set, set2);
    }

    static boolean g(Set<?> set, @CheckForNull Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o9.c
    public static <E> NavigableSet<E> h(NavigableSet<E> navigableSet, com.google.common.base.x<? super E> xVar) {
        if (!(navigableSet instanceof h)) {
            return new g((NavigableSet) com.google.common.base.w.E(navigableSet), (com.google.common.base.x) com.google.common.base.w.E(xVar));
        }
        h hVar = (h) navigableSet;
        return new g((NavigableSet) hVar.f58114b, Predicates.d(hVar.f58115c, xVar));
    }

    public static <E> Set<E> i(Set<E> set, com.google.common.base.x<? super E> xVar) {
        if (set instanceof SortedSet) {
            return j((SortedSet) set, xVar);
        }
        if (!(set instanceof h)) {
            return new h((Set) com.google.common.base.w.E(set), (com.google.common.base.x) com.google.common.base.w.E(xVar));
        }
        h hVar = (h) set;
        return new h((Set) hVar.f58114b, Predicates.d(hVar.f58115c, xVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> SortedSet<E> j(SortedSet<E> sortedSet, com.google.common.base.x<? super E> xVar) {
        if (!(sortedSet instanceof h)) {
            return new i((SortedSet) com.google.common.base.w.E(sortedSet), (com.google.common.base.x) com.google.common.base.w.E(xVar));
        }
        h hVar = (h) sortedSet;
        return new i((SortedSet) hVar.f58114b, Predicates.d(hVar.f58115c, xVar));
    }

    static int k(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    @o9.b(serializable = true)
    public static <E extends Enum<E>> ImmutableSet<E> l(E e10, E... eArr) {
        return ImmutableEnumSet.N(EnumSet.of((Enum) e10, (Enum[]) eArr));
    }

    @o9.b(serializable = true)
    public static <E extends Enum<E>> ImmutableSet<E> m(Iterable<E> iterable) {
        if (iterable instanceof ImmutableEnumSet) {
            return (ImmutableEnumSet) iterable;
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            return collection.isEmpty() ? ImmutableSet.D() : ImmutableEnumSet.N(EnumSet.copyOf(collection));
        }
        Iterator<E> it = iterable.iterator();
        if (!it.hasNext()) {
            return ImmutableSet.D();
        }
        EnumSet enumSetOf = EnumSet.of((Enum) it.next());
        Iterators.a(enumSetOf, it);
        return ImmutableEnumSet.N(enumSetOf);
    }

    public static <E> l<E> n(Set<E> set, Set<?> set2) {
        com.google.common.base.w.F(set, "set1");
        com.google.common.base.w.F(set2, "set2");
        return new b(set, set2);
    }

    private static <E extends Enum<E>> EnumSet<E> o(Collection<E> collection, Class<E> cls) {
        EnumSet<E> enumSetAllOf = EnumSet.allOf(cls);
        enumSetAllOf.removeAll(collection);
        return enumSetAllOf;
    }

    public static <E> Set<E> p() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static <E> Set<E> q(Iterable<? extends E> iterable) {
        Set<E> setP = p();
        l1.a(setP, iterable);
        return setP;
    }

    @o9.c
    public static <E> CopyOnWriteArraySet<E> r() {
        return new CopyOnWriteArraySet<>();
    }

    @o9.c
    public static <E> CopyOnWriteArraySet<E> s(Iterable<? extends E> iterable) {
        return new CopyOnWriteArraySet<>(iterable instanceof Collection ? (Collection) iterable : Lists.r(iterable));
    }

    public static <E extends Enum<E>> EnumSet<E> t(Iterable<E> iterable, Class<E> cls) {
        EnumSet<E> enumSetNoneOf = EnumSet.noneOf(cls);
        l1.a(enumSetNoneOf, iterable);
        return enumSetNoneOf;
    }

    public static <E> HashSet<E> u() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> v(Iterable<? extends E> iterable) {
        return iterable instanceof Collection ? new HashSet<>((Collection) iterable) : w(iterable.iterator());
    }

    public static <E> HashSet<E> w(Iterator<? extends E> it) {
        HashSet<E> hashSetU = u();
        Iterators.a(hashSetU, it);
        return hashSetU;
    }

    public static <E> HashSet<E> x(E... eArr) {
        HashSet<E> hashSetY = y(eArr.length);
        Collections.addAll(hashSetY, eArr);
        return hashSetY;
    }

    public static <E> HashSet<E> y(int i10) {
        return new HashSet<>(Maps.o(i10));
    }

    public static <E> Set<E> z() {
        return Collections.newSetFromMap(Maps.b0());
    }
}
