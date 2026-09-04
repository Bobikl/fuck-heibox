package com.google.common.collect;

import com.google.common.base.Predicates;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public class StandardTable<R, C, V> extends com.google.common.collect.i<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @h1
    final Map<R, Map<C, V>> f57895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @h1
    final com.google.common.base.c0<? extends Map<C, V>> f57896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @CheckForNull
    private transient Set<C> f57897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @CheckForNull
    private transient Map<R, Map<C, V>> f57898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @CheckForNull
    private transient StandardTable<R, C, V>.f f57899h;

    public class b implements Iterator<u2.a<R, C, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Iterator<Map.Entry<R, Map<C, V>>> f57900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        Map.Entry<R, Map<C, V>> f57901c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Iterator<Map.Entry<C, V>> f57902d;

        private b() {
            this.f57900b = StandardTable.this.f57895d.entrySet().iterator();
            this.f57902d = Iterators.w();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u2.a<R, C, V> next() {
            if (!this.f57902d.hasNext()) {
                Map.Entry<R, Map<C, V>> next = this.f57900b.next();
                this.f57901c = next;
                this.f57902d = next.getValue().entrySet().iterator();
            }
            Objects.requireNonNull(this.f57901c);
            Map.Entry<C, V> next2 = this.f57902d.next();
            return Tables.c(this.f57901c.getKey(), next2.getKey(), next2.getValue());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f57900b.hasNext() || this.f57902d.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f57902d.remove();
            Map.Entry<R, Map<C, V>> entry = this.f57901c;
            Objects.requireNonNull(entry);
            if (entry.getValue().isEmpty()) {
                this.f57900b.remove();
                this.f57901c = null;
            }
        }
    }

    public class c extends Maps.n0<R, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final C f57904e;

        public class a extends Sets.j<Map.Entry<R, V>> {
            private a() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                c.this.d(Predicates.c());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return StandardTable.this.i(entry.getKey(), c.this.f57904e, entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                c cVar = c.this;
                return !StandardTable.this.Z(cVar.f57904e);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<R, V>> iterator() {
                return new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@CheckForNull Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return StandardTable.this.o(entry.getKey(), c.this.f57904e, entry.getValue());
            }

            @Override // com.google.common.collect.Sets.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return c.this.d(Predicates.q(Predicates.n(collection)));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Iterator<Map<C, V>> it = StandardTable.this.f57895d.values().iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    if (it.next().containsKey(c.this.f57904e)) {
                        i10++;
                    }
                }
                return i10;
            }
        }

        public class b extends AbstractIterator<Map.Entry<R, V>> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final Iterator<Map.Entry<R, Map<C, V>>> f57907d;

            public class a extends com.google.common.collect.b<R, V> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Map.Entry f57909b;

                a(Map.Entry entry) {
                    this.f57909b = entry;
                }

                @Override // com.google.common.collect.b, java.util.Map.Entry
                public R getKey() {
                    return (R) this.f57909b.getKey();
                }

                @Override // com.google.common.collect.b, java.util.Map.Entry
                public V getValue() {
                    return (V) ((Map) this.f57909b.getValue()).get(c.this.f57904e);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.collect.b, java.util.Map.Entry
                public V setValue(V v10) {
                    return (V) t1.a(((Map) this.f57909b.getValue()).put(c.this.f57904e, com.google.common.base.w.E(v10)));
                }
            }

            private b() {
                this.f57907d = StandardTable.this.f57895d.entrySet().iterator();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<R, V> a() {
                while (this.f57907d.hasNext()) {
                    Map.Entry<R, Map<C, V>> next = this.f57907d.next();
                    if (next.getValue().containsKey(c.this.f57904e)) {
                        return new a(next);
                    }
                }
                return b();
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.StandardTable$c$c, reason: collision with other inner class name */
        public class C0459c extends Maps.z<R, V> {
            C0459c() {
                super(c.this);
            }

            @Override // com.google.common.collect.Maps.z, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                c cVar = c.this;
                return StandardTable.this.h0(obj, cVar.f57904e);
            }

            @Override // com.google.common.collect.Maps.z, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@CheckForNull Object obj) {
                c cVar = c.this;
                return StandardTable.this.remove(obj, cVar.f57904e) != null;
            }

            @Override // com.google.common.collect.Sets.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return c.this.d(Maps.U(Predicates.q(Predicates.n(collection))));
            }
        }

        public class d extends Maps.m0<R, V> {
            d() {
                super(c.this);
            }

            @Override // com.google.common.collect.Maps.m0, java.util.AbstractCollection, java.util.Collection
            public boolean remove(@CheckForNull Object obj) {
                return obj != null && c.this.d(Maps.Q0(Predicates.m(obj)));
            }

            @Override // com.google.common.collect.Maps.m0, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                return c.this.d(Maps.Q0(Predicates.n(collection)));
            }

            @Override // com.google.common.collect.Maps.m0, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                return c.this.d(Maps.Q0(Predicates.q(Predicates.n(collection))));
            }
        }

        c(C c10) {
            this.f57904e = (C) com.google.common.base.w.E(c10);
        }

        @Override // com.google.common.collect.Maps.n0
        Set<Map.Entry<R, V>> a() {
            return new a();
        }

        @Override // com.google.common.collect.Maps.n0
        /* JADX INFO: renamed from: b */
        Set<R> g() {
            return new C0459c();
        }

        @Override // com.google.common.collect.Maps.n0
        Collection<V> c() {
            return new d();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return StandardTable.this.h0(obj, this.f57904e);
        }

        @s9.a
        boolean d(com.google.common.base.x<? super Map.Entry<R, V>> xVar) {
            Iterator<Map.Entry<R, Map<C, V>>> it = StandardTable.this.f57895d.entrySet().iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                Map.Entry<R, Map<C, V>> next = it.next();
                Map<C, V> value = next.getValue();
                V v10 = value.get(this.f57904e);
                if (v10 != null && xVar.apply(Maps.O(next.getKey(), v10))) {
                    value.remove(this.f57904e);
                    z10 = true;
                    if (value.isEmpty()) {
                        it.remove();
                    }
                }
            }
            return z10;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V get(@CheckForNull Object obj) {
            return (V) StandardTable.this.Y(obj, this.f57904e);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V put(R r10, V v10) {
            return (V) StandardTable.this.d0(r10, this.f57904e, v10);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V remove(@CheckForNull Object obj) {
            return (V) StandardTable.this.remove(obj, this.f57904e);
        }
    }

    public class d extends AbstractIterator<C> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Map<C, V> f57913d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Iterator<Map<C, V>> f57914e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Iterator<Map.Entry<C, V>> f57915f;

        private d() {
            this.f57913d = StandardTable.this.f57896e.get();
            this.f57914e = StandardTable.this.f57895d.values().iterator();
            this.f57915f = Iterators.u();
        }

        @Override // com.google.common.collect.AbstractIterator
        @CheckForNull
        protected C a() {
            while (true) {
                if (this.f57915f.hasNext()) {
                    Map.Entry<C, V> next = this.f57915f.next();
                    if (!this.f57913d.containsKey(next.getKey())) {
                        this.f57913d.put(next.getKey(), next.getValue());
                        return next.getKey();
                    }
                } else {
                    if (!this.f57914e.hasNext()) {
                        return b();
                    }
                    this.f57915f = this.f57914e.next().entrySet().iterator();
                }
            }
        }
    }

    public class e extends StandardTable<R, C, V>.i<C> {
        private e() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return StandardTable.this.Z(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<C> iterator() {
            return StandardTable.this.k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            boolean z10 = false;
            if (obj == null) {
                return false;
            }
            Iterator<Map<C, V>> it = StandardTable.this.f57895d.values().iterator();
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (next.keySet().remove(obj)) {
                    z10 = true;
                    if (next.isEmpty()) {
                        it.remove();
                    }
                }
            }
            return z10;
        }

        @Override // com.google.common.collect.Sets.j, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            com.google.common.base.w.E(collection);
            Iterator<Map<C, V>> it = StandardTable.this.f57895d.values().iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (Iterators.V(next.keySet().iterator(), collection)) {
                    z10 = true;
                    if (next.isEmpty()) {
                        it.remove();
                    }
                }
            }
            return z10;
        }

        @Override // com.google.common.collect.Sets.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            com.google.common.base.w.E(collection);
            Iterator<Map<C, V>> it = StandardTable.this.f57895d.values().iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (next.keySet().retainAll(collection)) {
                    z10 = true;
                    if (next.isEmpty()) {
                        it.remove();
                    }
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return Iterators.Z(iterator());
        }
    }

    public class f extends Maps.n0<C, Map<R, V>> {

        public class a extends StandardTable<R, C, V>.i<Map.Entry<C, Map<R, V>>> {

            /* JADX INFO: renamed from: com.google.common.collect.StandardTable$f$a$a, reason: collision with other inner class name */
            public class C0460a implements com.google.common.base.n<C, Map<R, V>> {
                C0460a() {
                }

                @Override // com.google.common.base.n
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Map<R, V> apply(C c10) {
                    return StandardTable.this.b0(c10);
                }
            }

            a() {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!StandardTable.this.Z(entry.getKey())) {
                    return false;
                }
                Map<R, V> map = f.this.get(entry.getKey());
                Objects.requireNonNull(map);
                return map.equals(entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<C, Map<R, V>>> iterator() {
                return Maps.m(StandardTable.this.y0(), new C0460a());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@CheckForNull Object obj) {
                if (!contains(obj) || !(obj instanceof Map.Entry)) {
                    return false;
                }
                StandardTable.this.n(((Map.Entry) obj).getKey());
                return true;
            }

            @Override // com.google.common.collect.Sets.j, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                com.google.common.base.w.E(collection);
                return Sets.J(this, collection.iterator());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.Sets.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                com.google.common.base.w.E(collection);
                boolean z10 = false;
                for (Object obj : Lists.s(StandardTable.this.y0().iterator())) {
                    if (!collection.contains(Maps.O(obj, StandardTable.this.b0(obj)))) {
                        StandardTable.this.n(obj);
                        z10 = true;
                    }
                }
                return z10;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return StandardTable.this.y0().size();
            }
        }

        public class b extends Maps.m0<C, Map<R, V>> {
            b() {
                super(f.this);
            }

            @Override // com.google.common.collect.Maps.m0, java.util.AbstractCollection, java.util.Collection
            public boolean remove(@CheckForNull Object obj) {
                for (Map.Entry<C, Map<R, V>> entry : f.this.entrySet()) {
                    if (entry.getValue().equals(obj)) {
                        StandardTable.this.n(entry.getKey());
                        return true;
                    }
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.Maps.m0, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                com.google.common.base.w.E(collection);
                boolean z10 = false;
                for (Object obj : Lists.s(StandardTable.this.y0().iterator())) {
                    if (collection.contains(StandardTable.this.b0(obj))) {
                        StandardTable.this.n(obj);
                        z10 = true;
                    }
                }
                return z10;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.Maps.m0, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                com.google.common.base.w.E(collection);
                boolean z10 = false;
                for (Object obj : Lists.s(StandardTable.this.y0().iterator())) {
                    if (!collection.contains(StandardTable.this.b0(obj))) {
                        StandardTable.this.n(obj);
                        z10 = true;
                    }
                }
                return z10;
            }
        }

        private f() {
        }

        @Override // com.google.common.collect.Maps.n0
        public Set<Map.Entry<C, Map<R, V>>> a() {
            return new a();
        }

        @Override // com.google.common.collect.Maps.n0
        Collection<Map<R, V>> c() {
            return new b();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return StandardTable.this.Z(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map<R, V> get(@CheckForNull Object obj) {
            if (!StandardTable.this.Z(obj)) {
                return null;
            }
            StandardTable standardTable = StandardTable.this;
            Objects.requireNonNull(obj);
            return standardTable.b0(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map<R, V> remove(@CheckForNull Object obj) {
            if (StandardTable.this.Z(obj)) {
                return StandardTable.this.n(obj);
            }
            return null;
        }

        @Override // com.google.common.collect.Maps.n0, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet */
        public Set<C> h() {
            return StandardTable.this.y0();
        }
    }

    public class g extends Maps.y<C, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final R f57922b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        Map<C, V> f57923c;

        public class a implements Iterator<Map.Entry<C, V>> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Iterator f57925b;

            a(Iterator it) {
                this.f57925b = it;
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<C, V> next() {
                return g.this.e((Map.Entry) this.f57925b.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f57925b.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f57925b.remove();
                g.this.c();
            }
        }

        public class b extends t0<C, V> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Map.Entry f57927b;

            b(g gVar, Map.Entry entry) {
                this.f57927b = entry;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.t0, com.google.common.collect.y0
            /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
            public Map.Entry<C, V> X0() {
                return this.f57927b;
            }

            @Override // com.google.common.collect.t0, java.util.Map.Entry
            public boolean equals(@CheckForNull Object obj) {
                return J0(obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.t0, java.util.Map.Entry
            public V setValue(V v10) {
                return (V) super.setValue(com.google.common.base.w.E(v10));
            }
        }

        g(R r10) {
            this.f57922b = (R) com.google.common.base.w.E(r10);
        }

        @Override // com.google.common.collect.Maps.y
        Iterator<Map.Entry<C, V>> a() {
            d();
            Map<C, V> map = this.f57923c;
            return map == null ? Iterators.w() : new a(map.entrySet().iterator());
        }

        @CheckForNull
        Map<C, V> b() {
            return StandardTable.this.f57895d.get(this.f57922b);
        }

        void c() {
            d();
            Map<C, V> map = this.f57923c;
            if (map == null || !map.isEmpty()) {
                return;
            }
            StandardTable.this.f57895d.remove(this.f57922b);
            this.f57923c = null;
        }

        @Override // com.google.common.collect.Maps.y, java.util.AbstractMap, java.util.Map
        public void clear() {
            d();
            Map<C, V> map = this.f57923c;
            if (map != null) {
                map.clear();
            }
            c();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            Map<C, V> map;
            d();
            return (obj == null || (map = this.f57923c) == null || !Maps.o0(map, obj)) ? false : true;
        }

        final void d() {
            Map<C, V> map = this.f57923c;
            if (map == null || (map.isEmpty() && StandardTable.this.f57895d.containsKey(this.f57922b))) {
                this.f57923c = b();
            }
        }

        Map.Entry<C, V> e(Map.Entry<C, V> entry) {
            return new b(this, entry);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V get(@CheckForNull Object obj) {
            Map<C, V> map;
            d();
            if (obj == null || (map = this.f57923c) == null) {
                return null;
            }
            return (V) Maps.p0(map, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V put(C c10, V v10) {
            com.google.common.base.w.E(c10);
            com.google.common.base.w.E(v10);
            Map<C, V> map = this.f57923c;
            return (map == null || map.isEmpty()) ? (V) StandardTable.this.d0(this.f57922b, c10, v10) : this.f57923c.put(c10, v10);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V remove(@CheckForNull Object obj) {
            d();
            Map<C, V> map = this.f57923c;
            if (map == null) {
                return null;
            }
            V v10 = (V) Maps.q0(map, obj);
            c();
            return v10;
        }

        @Override // com.google.common.collect.Maps.y, java.util.AbstractMap, java.util.Map
        public int size() {
            d();
            Map<C, V> map = this.f57923c;
            if (map == null) {
                return 0;
            }
            return map.size();
        }
    }

    public class h extends Maps.n0<R, Map<C, V>> {

        public class a extends StandardTable<R, C, V>.i<Map.Entry<R, Map<C, V>>> {

            /* JADX INFO: renamed from: com.google.common.collect.StandardTable$h$a$a, reason: collision with other inner class name */
            public class C0461a implements com.google.common.base.n<R, Map<C, V>> {
                C0461a() {
                }

                @Override // com.google.common.base.n
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Map<C, V> apply(R r10) {
                    return StandardTable.this.E0(r10);
                }
            }

            a() {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return entry.getKey() != null && (entry.getValue() instanceof Map) && o.j(StandardTable.this.f57895d.entrySet(), entry);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<R, Map<C, V>>> iterator() {
                return Maps.m(StandardTable.this.f57895d.keySet(), new C0461a());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@CheckForNull Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return entry.getKey() != null && (entry.getValue() instanceof Map) && StandardTable.this.f57895d.entrySet().remove(entry);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return StandardTable.this.f57895d.size();
            }
        }

        h() {
        }

        @Override // com.google.common.collect.Maps.n0
        protected Set<Map.Entry<R, Map<C, V>>> a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return StandardTable.this.A0(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map<C, V> get(@CheckForNull Object obj) {
            if (!StandardTable.this.A0(obj)) {
                return null;
            }
            StandardTable standardTable = StandardTable.this;
            Objects.requireNonNull(obj);
            return standardTable.E0(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map<C, V> remove(@CheckForNull Object obj) {
            if (obj == null) {
                return null;
            }
            return StandardTable.this.f57895d.remove(obj);
        }
    }

    public abstract class i<T> extends Sets.j<T> {
        private i() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            StandardTable.this.f57895d.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return StandardTable.this.f57895d.isEmpty();
        }
    }

    StandardTable(Map<R, Map<C, V>> map, com.google.common.base.c0<? extends Map<C, V>> c0Var) {
        this.f57895d = map;
        this.f57896e = c0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i(@CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3) {
        return obj3 != null && obj3.equals(Y(obj, obj2));
    }

    private Map<C, V> m(R r10) {
        Map<C, V> map = this.f57895d.get(r10);
        if (map != null) {
            return map;
        }
        Map<C, V> map2 = this.f57896e.get();
        this.f57895d.put(r10, map2);
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @s9.a
    public Map<R, V> n(@CheckForNull Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<R, Map<C, V>>> it = this.f57895d.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<R, Map<C, V>> next = it.next();
            V vRemove = next.getValue().remove(obj);
            if (vRemove != null) {
                linkedHashMap.put(next.getKey(), vRemove);
                if (next.getValue().isEmpty()) {
                    it.remove();
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o(@CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3) {
        if (!i(obj, obj2, obj3)) {
            return false;
        }
        remove(obj, obj2);
        return true;
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    public boolean A0(@CheckForNull Object obj) {
        return obj != null && Maps.o0(this.f57895d, obj);
    }

    @Override // com.google.common.collect.u2
    public Map<C, V> E0(R r10) {
        return new g(r10);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    @CheckForNull
    public V Y(@CheckForNull Object obj, @CheckForNull Object obj2) {
        if (obj == null || obj2 == null) {
            return null;
        }
        return (V) super.Y(obj, obj2);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    public boolean Z(@CheckForNull Object obj) {
        if (obj == null) {
            return false;
        }
        Iterator<Map<C, V>> it = this.f57895d.values().iterator();
        while (it.hasNext()) {
            if (Maps.o0(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.i
    Iterator<u2.a<R, C, V>> a() {
        return new b();
    }

    @Override // com.google.common.collect.u2
    public Map<C, Map<R, V>> a0() {
        StandardTable<R, C, V>.f fVar = this.f57899h;
        if (fVar != null) {
            return fVar;
        }
        StandardTable<R, C, V>.f fVar2 = new f();
        this.f57899h = fVar2;
        return fVar2;
    }

    @Override // com.google.common.collect.u2
    public Map<R, V> b0(C c10) {
        return new c(c10);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    public void clear() {
        this.f57895d.clear();
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    public boolean containsValue(@CheckForNull Object obj) {
        return obj != null && super.containsValue(obj);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    @s9.a
    @CheckForNull
    public V d0(R r10, C c10, V v10) {
        com.google.common.base.w.E(r10);
        com.google.common.base.w.E(c10);
        com.google.common.base.w.E(v10);
        return m(r10).put(c10, v10);
    }

    @Override // com.google.common.collect.u2
    public Map<R, Map<C, V>> h() {
        Map<R, Map<C, V>> map = this.f57898g;
        if (map != null) {
            return map;
        }
        Map<R, Map<C, V>> mapL = l();
        this.f57898g = mapL;
        return mapL;
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    public boolean h0(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return (obj == null || obj2 == null || !super.h0(obj, obj2)) ? false : true;
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    public boolean isEmpty() {
        return this.f57895d.isEmpty();
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    public Set<R> j() {
        return h().keySet();
    }

    Iterator<C> k() {
        return new d();
    }

    Map<R, Map<C, V>> l() {
        return new h();
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    @s9.a
    @CheckForNull
    public V remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Map map;
        if (obj == null || obj2 == null || (map = (Map) Maps.p0(this.f57895d, obj)) == null) {
            return null;
        }
        V v10 = (V) map.remove(obj2);
        if (map.isEmpty()) {
            this.f57895d.remove(obj);
        }
        return v10;
    }

    @Override // com.google.common.collect.u2
    public int size() {
        Iterator<Map<C, V>> it = this.f57895d.values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    public Set<u2.a<R, C, V>> v0() {
        return super.v0();
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    public Collection<V> values() {
        return super.values();
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    public Set<C> y0() {
        Set<C> set = this.f57897f;
        if (set != null) {
            return set;
        }
        e eVar = new e();
        this.f57897f = eVar;
        return eVar;
    }
}
