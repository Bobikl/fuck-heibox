package com.google.common.collect;

import com.google.common.base.Predicates;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: TreeRangeMap.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.a
@o9.c
@u
public final class z2<K extends Comparable, V> implements b2<K, V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b2<Comparable<?>, Object> f58226c = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NavigableMap<Cut<K>, c<K, V>> f58227b = Maps.f0();

    /* JADX INFO: compiled from: TreeRangeMap.java */
    public class a implements b2<Comparable<?>, Object> {
        a() {
        }

        @Override // com.google.common.collect.b2
        public void b(Range<Comparable<?>> range) {
            com.google.common.base.w.E(range);
        }

        @Override // com.google.common.collect.b2
        public Range<Comparable<?>> c() {
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.b2
        public void clear() {
        }

        @Override // com.google.common.collect.b2
        public b2<Comparable<?>, Object> d(Range<Comparable<?>> range) {
            com.google.common.base.w.E(range);
            return this;
        }

        @Override // com.google.common.collect.b2
        public Map<Range<Comparable<?>>, Object> e() {
            return Collections.emptyMap();
        }

        @Override // com.google.common.collect.b2
        @CheckForNull
        public Map.Entry<Range<Comparable<?>>, Object> f(Comparable<?> comparable) {
            return null;
        }

        @Override // com.google.common.collect.b2
        public Map<Range<Comparable<?>>, Object> g() {
            return Collections.emptyMap();
        }

        @Override // com.google.common.collect.b2
        public void h(b2<Comparable<?>, Object> b2Var) {
            if (!b2Var.e().isEmpty()) {
                throw new IllegalArgumentException("Cannot putAll(nonEmptyRangeMap) into an empty subRangeMap");
            }
        }

        @Override // com.google.common.collect.b2
        public void i(Range<Comparable<?>> range, Object obj) {
            com.google.common.base.w.E(range);
            String strValueOf = String.valueOf(range);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 46);
            sb2.append("Cannot insert range ");
            sb2.append(strValueOf);
            sb2.append(" into an empty subRangeMap");
            throw new IllegalArgumentException(sb2.toString());
        }

        @Override // com.google.common.collect.b2
        @CheckForNull
        public Object j(Comparable<?> comparable) {
            return null;
        }

        @Override // com.google.common.collect.b2
        public void k(Range<Comparable<?>> range, Object obj) {
            com.google.common.base.w.E(range);
            String strValueOf = String.valueOf(range);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 46);
            sb2.append("Cannot insert range ");
            sb2.append(strValueOf);
            sb2.append(" into an empty subRangeMap");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* JADX INFO: compiled from: TreeRangeMap.java */
    public final class b extends Maps.y<Range<K>, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Iterable<Map.Entry<Range<K>, V>> f58228b;

        b(Iterable<c<K, V>> iterable) {
            this.f58228b = iterable;
        }

        @Override // com.google.common.collect.Maps.y
        Iterator<Map.Entry<Range<K>, V>> a() {
            return this.f58228b.iterator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return get(obj) != null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V get(@CheckForNull Object obj) {
            if (!(obj instanceof Range)) {
                return null;
            }
            Range range = (Range) obj;
            c cVar = (c) z2.this.f58227b.get(range.f57775b);
            if (cVar == null || !cVar.getKey().equals(range)) {
                return null;
            }
            return (V) cVar.getValue();
        }

        @Override // com.google.common.collect.Maps.y, java.util.AbstractMap, java.util.Map
        public int size() {
            return z2.this.f58227b.size();
        }
    }

    /* JADX INFO: compiled from: TreeRangeMap.java */
    public static final class c<K extends Comparable, V> extends com.google.common.collect.b<Range<K>, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Range<K> f58230b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final V f58231c;

        c(Cut<K> cut, Cut<K> cut2, V v10) {
            this(Range.k(cut, cut2), v10);
        }

        c(Range<K> range, V v10) {
            this.f58230b = range;
            this.f58231c = v10;
        }

        public boolean c(K k10) {
            return this.f58230b.i(k10);
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Range<K> getKey() {
            return this.f58230b;
        }

        Cut<K> f() {
            return (Cut<K>) this.f58230b.f57775b;
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public V getValue() {
            return this.f58231c;
        }

        Cut<K> h() {
            return (Cut<K>) this.f58230b.f57776c;
        }
    }

    /* JADX INFO: compiled from: TreeRangeMap.java */
    public class d implements b2<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Range<K> f58232b;

        /* JADX INFO: compiled from: TreeRangeMap.java */
        public class a extends z2<K, V>.d.b {

            /* JADX INFO: renamed from: com.google.common.collect.z2$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: TreeRangeMap.java */
            public class C0468a extends AbstractIterator<Map.Entry<Range<K>, V>> {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ Iterator f58235d;

                C0468a(Iterator it) {
                    this.f58235d = it;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public Map.Entry<Range<K>, V> a() {
                    if (!this.f58235d.hasNext()) {
                        return (Map.Entry) b();
                    }
                    c cVar = (c) this.f58235d.next();
                    return cVar.h().compareTo(d.this.f58232b.f57775b) <= 0 ? (Map.Entry) b() : Maps.O(cVar.getKey().s(d.this.f58232b), cVar.getValue());
                }
            }

            a() {
                super();
            }

            @Override // com.google.common.collect.z2.d.b
            Iterator<Map.Entry<Range<K>, V>> b() {
                return d.this.f58232b.u() ? Iterators.u() : new C0468a(z2.this.f58227b.headMap(d.this.f58232b.f57776c, false).descendingMap().values().iterator());
            }
        }

        /* JADX INFO: compiled from: TreeRangeMap.java */
        public class b extends AbstractMap<Range<K>, V> {

            /* JADX INFO: compiled from: TreeRangeMap.java */
            public class a extends Maps.z<Range<K>, V> {
                a(Map map) {
                    super(map);
                }

                @Override // com.google.common.collect.Maps.z, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean remove(@CheckForNull Object obj) {
                    return b.this.remove(obj) != null;
                }

                @Override // com.google.common.collect.Sets.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection<?> collection) {
                    return b.this.c(Predicates.h(Predicates.q(Predicates.n(collection)), Maps.R()));
                }
            }

            /* JADX INFO: renamed from: com.google.common.collect.z2$d$b$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: TreeRangeMap.java */
            public class C0469b extends Maps.q<Range<K>, V> {
                C0469b() {
                }

                @Override // com.google.common.collect.Maps.q
                Map<Range<K>, V> h() {
                    return b.this;
                }

                @Override // com.google.common.collect.Maps.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean isEmpty() {
                    return !iterator().hasNext();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<Map.Entry<Range<K>, V>> iterator() {
                    return b.this.b();
                }

                @Override // com.google.common.collect.Maps.q, com.google.common.collect.Sets.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection<?> collection) {
                    return b.this.c(Predicates.q(Predicates.n(collection)));
                }

                @Override // com.google.common.collect.Maps.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return Iterators.Z(iterator());
                }
            }

            /* JADX INFO: compiled from: TreeRangeMap.java */
            public class c extends AbstractIterator<Map.Entry<Range<K>, V>> {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ Iterator f58240d;

                c(Iterator it) {
                    this.f58240d = it;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public Map.Entry<Range<K>, V> a() {
                    while (this.f58240d.hasNext()) {
                        c cVar = (c) this.f58240d.next();
                        if (cVar.f().compareTo(d.this.f58232b.f57776c) >= 0) {
                            return (Map.Entry) b();
                        }
                        if (cVar.h().compareTo(d.this.f58232b.f57775b) > 0) {
                            return Maps.O(cVar.getKey().s(d.this.f58232b), cVar.getValue());
                        }
                    }
                    return (Map.Entry) b();
                }
            }

            /* JADX INFO: renamed from: com.google.common.collect.z2$d$b$d, reason: collision with other inner class name */
            /* JADX INFO: compiled from: TreeRangeMap.java */
            public class C0470d extends Maps.m0<Range<K>, V> {
                C0470d(Map map) {
                    super(map);
                }

                @Override // com.google.common.collect.Maps.m0, java.util.AbstractCollection, java.util.Collection
                public boolean removeAll(Collection<?> collection) {
                    return b.this.c(Predicates.h(Predicates.n(collection), Maps.N0()));
                }

                @Override // com.google.common.collect.Maps.m0, java.util.AbstractCollection, java.util.Collection
                public boolean retainAll(Collection<?> collection) {
                    return b.this.c(Predicates.h(Predicates.q(Predicates.n(collection)), Maps.N0()));
                }
            }

            b() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean c(com.google.common.base.x<? super Map.Entry<Range<K>, V>> xVar) {
                ArrayList arrayListQ = Lists.q();
                for (Map.Entry<Range<K>, V> entry : entrySet()) {
                    if (xVar.apply(entry)) {
                        arrayListQ.add(entry.getKey());
                    }
                }
                Iterator it = arrayListQ.iterator();
                while (it.hasNext()) {
                    z2.this.b((Range) it.next());
                }
                return !arrayListQ.isEmpty();
            }

            Iterator<Map.Entry<Range<K>, V>> b() {
                if (d.this.f58232b.u()) {
                    return Iterators.u();
                }
                return new c(z2.this.f58227b.tailMap((Cut) com.google.common.base.q.a((Cut) z2.this.f58227b.floorKey(d.this.f58232b.f57775b), d.this.f58232b.f57775b), true).values().iterator());
            }

            @Override // java.util.AbstractMap, java.util.Map
            public void clear() {
                d.this.clear();
            }

            @Override // java.util.AbstractMap, java.util.Map
            public boolean containsKey(@CheckForNull Object obj) {
                return get(obj) != null;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Set<Map.Entry<Range<K>, V>> entrySet() {
                return new C0469b();
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.util.AbstractMap, java.util.Map
            @CheckForNull
            public V get(@CheckForNull Object obj) {
                c cVar;
                try {
                    if (obj instanceof Range) {
                        Range range = (Range) obj;
                        if (d.this.f58232b.n(range) && !range.u()) {
                            if (range.f57775b.compareTo(d.this.f58232b.f57775b) == 0) {
                                Map.Entry entryFloorEntry = z2.this.f58227b.floorEntry(range.f57775b);
                                cVar = entryFloorEntry != null ? (c) entryFloorEntry.getValue() : null;
                            } else {
                                cVar = (c) z2.this.f58227b.get(range.f57775b);
                            }
                            if (cVar != null && cVar.getKey().t(d.this.f58232b) && cVar.getKey().s(d.this.f58232b).equals(range)) {
                                return (V) cVar.getValue();
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Set<Range<K>> keySet() {
                return new a(this);
            }

            @Override // java.util.AbstractMap, java.util.Map
            @CheckForNull
            public V remove(@CheckForNull Object obj) {
                V v10 = (V) get(obj);
                if (v10 == null) {
                    return null;
                }
                Objects.requireNonNull(obj);
                z2.this.b((Range) obj);
                return v10;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Collection<V> values() {
                return new C0470d(this);
            }
        }

        d(Range<K> range) {
            this.f58232b = range;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.b2
        public void b(Range<K> range) {
            if (range.t(this.f58232b)) {
                z2.this.b(range.s(this.f58232b));
            }
        }

        @Override // com.google.common.collect.b2
        public Range<K> c() {
            Cut cut;
            Map.Entry entryFloorEntry = z2.this.f58227b.floorEntry(this.f58232b.f57775b);
            if (entryFloorEntry == null || ((c) entryFloorEntry.getValue()).h().compareTo(this.f58232b.f57775b) <= 0) {
                cut = (Cut) z2.this.f58227b.ceilingKey(this.f58232b.f57775b);
                if (cut == null || cut.compareTo(this.f58232b.f57776c) >= 0) {
                    throw new NoSuchElementException();
                }
            } else {
                cut = this.f58232b.f57775b;
            }
            Map.Entry entryLowerEntry = z2.this.f58227b.lowerEntry(this.f58232b.f57776c);
            if (entryLowerEntry != null) {
                return Range.k(cut, ((c) entryLowerEntry.getValue()).h().compareTo(this.f58232b.f57776c) >= 0 ? this.f58232b.f57776c : ((c) entryLowerEntry.getValue()).h());
            }
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.b2
        public void clear() {
            z2.this.b(this.f58232b);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.b2
        public b2<K, V> d(Range<K> range) {
            return !range.t(this.f58232b) ? z2.this.q() : z2.this.d(range.s(this.f58232b));
        }

        @Override // com.google.common.collect.b2
        public Map<Range<K>, V> e() {
            return new b();
        }

        @Override // com.google.common.collect.b2
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof b2) {
                return e().equals(((b2) obj).e());
            }
            return false;
        }

        @Override // com.google.common.collect.b2
        @CheckForNull
        public Map.Entry<Range<K>, V> f(K k10) {
            Map.Entry<Range<K>, V> entryF;
            if (!this.f58232b.i(k10) || (entryF = z2.this.f(k10)) == null) {
                return null;
            }
            return Maps.O(entryF.getKey().s(this.f58232b), entryF.getValue());
        }

        @Override // com.google.common.collect.b2
        public Map<Range<K>, V> g() {
            return new a();
        }

        @Override // com.google.common.collect.b2
        public void h(b2<K, V> b2Var) {
            if (b2Var.e().isEmpty()) {
                return;
            }
            Range<K> rangeC = b2Var.c();
            com.google.common.base.w.y(this.f58232b.n(rangeC), "Cannot putAll rangeMap with span %s into a subRangeMap(%s)", rangeC, this.f58232b);
            z2.this.h(b2Var);
        }

        @Override // com.google.common.collect.b2
        public int hashCode() {
            return e().hashCode();
        }

        @Override // com.google.common.collect.b2
        public void i(Range<K> range, V v10) {
            if (z2.this.f58227b.isEmpty() || !this.f58232b.n(range)) {
                k(range, v10);
            } else {
                k(z2.this.o(range, com.google.common.base.w.E(v10)).s(this.f58232b), v10);
            }
        }

        @Override // com.google.common.collect.b2
        @CheckForNull
        public V j(K k10) {
            if (this.f58232b.i(k10)) {
                return (V) z2.this.j(k10);
            }
            return null;
        }

        @Override // com.google.common.collect.b2
        public void k(Range<K> range, V v10) {
            com.google.common.base.w.y(this.f58232b.n(range), "Cannot put range %s into a subRangeMap(%s)", range, this.f58232b);
            z2.this.k(range, v10);
        }

        @Override // com.google.common.collect.b2
        public String toString() {
            return e().toString();
        }
    }

    private z2() {
    }

    private static <K extends Comparable, V> Range<K> n(Range<K> range, V v10, @CheckForNull Map.Entry<Cut<K>, c<K, V>> entry) {
        return (entry != null && entry.getValue().getKey().t(range) && entry.getValue().getValue().equals(v10)) ? (Range<K>) range.F(entry.getValue().getKey()) : range;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public Range<K> o(Range<K> range, V v10) {
        return n(n(range, v10, this.f58227b.lowerEntry((Cut<K>) range.f57775b)), v10, this.f58227b.floorEntry((Cut<K>) range.f57776c));
    }

    public static <K extends Comparable, V> z2<K, V> p() {
        return new z2<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b2<K, V> q() {
        return f58226c;
    }

    private void r(Cut<K> cut, Cut<K> cut2, V v10) {
        this.f58227b.put(cut, new c<>(cut, cut2, v10));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.common.collect.b2
    public void b(Range<K> range) {
        if (range.u()) {
            return;
        }
        Map.Entry<Cut<K>, c<K, V>> entryLowerEntry = this.f58227b.lowerEntry((Cut<K>) range.f57775b);
        if (entryLowerEntry != null) {
            c<K, V> value = entryLowerEntry.getValue();
            if (value.h().compareTo(range.f57775b) > 0) {
                if (value.h().compareTo(range.f57776c) > 0) {
                    r(range.f57776c, value.h(), entryLowerEntry.getValue().getValue());
                }
                r(value.f(), range.f57775b, entryLowerEntry.getValue().getValue());
            }
        }
        Map.Entry<Cut<K>, c<K, V>> entryLowerEntry2 = this.f58227b.lowerEntry((Cut<K>) range.f57776c);
        if (entryLowerEntry2 != null) {
            c<K, V> value2 = entryLowerEntry2.getValue();
            if (value2.h().compareTo(range.f57776c) > 0) {
                r(range.f57776c, value2.h(), entryLowerEntry2.getValue().getValue());
            }
        }
        this.f58227b.subMap((Cut<K>) range.f57775b, (Cut<K>) range.f57776c).clear();
    }

    @Override // com.google.common.collect.b2
    public Range<K> c() {
        Map.Entry<Cut<K>, c<K, V>> entryFirstEntry = this.f58227b.firstEntry();
        Map.Entry<Cut<K>, c<K, V>> entryLastEntry = this.f58227b.lastEntry();
        if (entryFirstEntry == null || entryLastEntry == null) {
            throw new NoSuchElementException();
        }
        return Range.k(entryFirstEntry.getValue().getKey().f57775b, entryLastEntry.getValue().getKey().f57776c);
    }

    @Override // com.google.common.collect.b2
    public void clear() {
        this.f58227b.clear();
    }

    @Override // com.google.common.collect.b2
    public b2<K, V> d(Range<K> range) {
        return range.equals(Range.a()) ? this : new d(range);
    }

    @Override // com.google.common.collect.b2
    public Map<Range<K>, V> e() {
        return new b(this.f58227b.values());
    }

    @Override // com.google.common.collect.b2
    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof b2) {
            return e().equals(((b2) obj).e());
        }
        return false;
    }

    @Override // com.google.common.collect.b2
    @CheckForNull
    public Map.Entry<Range<K>, V> f(K k10) {
        Map.Entry<Cut<K>, c<K, V>> entryFloorEntry = this.f58227b.floorEntry(Cut.d(k10));
        if (entryFloorEntry == null || !entryFloorEntry.getValue().c(k10)) {
            return null;
        }
        return entryFloorEntry.getValue();
    }

    @Override // com.google.common.collect.b2
    public Map<Range<K>, V> g() {
        return new b(this.f58227b.descendingMap().values());
    }

    @Override // com.google.common.collect.b2
    public void h(b2<K, V> b2Var) {
        for (Map.Entry<Range<K>, V> entry : b2Var.e().entrySet()) {
            k(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.collect.b2
    public int hashCode() {
        return e().hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.b2
    public void i(Range<K> range, V v10) {
        if (this.f58227b.isEmpty()) {
            k(range, v10);
        } else {
            k(o(range, com.google.common.base.w.E(v10)), v10);
        }
    }

    @Override // com.google.common.collect.b2
    @CheckForNull
    public V j(K k10) {
        Map.Entry<Range<K>, V> entryF = f(k10);
        if (entryF == null) {
            return null;
        }
        return entryF.getValue();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.common.collect.b2
    public void k(Range<K> range, V v10) {
        if (range.u()) {
            return;
        }
        com.google.common.base.w.E(v10);
        b(range);
        this.f58227b.put((Cut<K>) range.f57775b, new c<>(range, v10));
    }

    @Override // com.google.common.collect.b2
    public String toString() {
        return this.f58227b.values().toString();
    }
}
