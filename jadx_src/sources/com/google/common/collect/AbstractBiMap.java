package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@u
public abstract class AbstractBiMap<K, V> extends s0<K, V> implements l<K, V>, Serializable {

    @o9.c
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Map<K, V> f57013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @u9.f
    transient AbstractBiMap<V, K> f57014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @CheckForNull
    private transient Set<K> f57015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @CheckForNull
    private transient Set<V> f57016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @CheckForNull
    private transient Set<Map.Entry<K, V>> f57017f;

    public static class Inverse<K, V> extends AbstractBiMap<K, V> {

        @o9.c
        private static final long serialVersionUID = 0;

        Inverse(Map<K, V> map, AbstractBiMap<V, K> abstractBiMap) {
            super(map, abstractBiMap, null);
        }

        @o9.c
        private void q1(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            o1((AbstractBiMap) objectInputStream.readObject());
        }

        @o9.c
        private void s1(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(i0());
        }

        @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.s0, com.google.common.collect.y0
        /* JADX INFO: renamed from: G0 */
        protected /* bridge */ /* synthetic */ Object H0() {
            return super.H0();
        }

        @Override // com.google.common.collect.AbstractBiMap
        @x1
        K a1(@x1 K k10) {
            return this.f57014c.b1(k10);
        }

        @Override // com.google.common.collect.AbstractBiMap
        @x1
        V b1(@x1 V v10) {
            return this.f57014c.a1(v10);
        }

        @o9.c
        Object r1() {
            return i0().i0();
        }

        @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.s0, java.util.Map, com.google.common.collect.l
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }
    }

    public class a implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        Map.Entry<K, V> f57018b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterator f57019c;

        a(Iterator it) {
            this.f57019c = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> entry = (Map.Entry) this.f57019c.next();
            this.f57018b = entry;
            return new b(entry);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f57019c.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            Map.Entry<K, V> entry = this.f57018b;
            if (entry == null) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            V value = entry.getValue();
            this.f57019c.remove();
            AbstractBiMap.this.h1(value);
            this.f57018b = null;
        }
    }

    public class b extends t0<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map.Entry<K, V> f57021b;

        b(Map.Entry<K, V> entry) {
            this.f57021b = entry;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.t0, com.google.common.collect.y0
        public Map.Entry<K, V> H0() {
            return this.f57021b;
        }

        @Override // com.google.common.collect.t0, java.util.Map.Entry
        public V setValue(V v10) {
            AbstractBiMap.this.b1(v10);
            com.google.common.base.w.h0(AbstractBiMap.this.entrySet().contains(this), "entry no longer in map");
            if (com.google.common.base.s.a(v10, getValue())) {
                return v10;
            }
            com.google.common.base.w.u(!AbstractBiMap.this.containsValue(v10), "value already present: %s", v10);
            V value = this.f57021b.setValue(v10);
            com.google.common.base.w.h0(com.google.common.base.s.a(v10, AbstractBiMap.this.get(getKey())), "entry no longer in map");
            AbstractBiMap.this.p1(getKey(), true, value, v10);
            return value;
        }
    }

    public class c extends a1<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Set<Map.Entry<K, V>> f57023b;

        private c() {
            this.f57023b = AbstractBiMap.this.f57013b.entrySet();
        }

        /* synthetic */ c(AbstractBiMap abstractBiMap, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.a1, com.google.common.collect.h0
        /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
        public Set<Map.Entry<K, V>> H0() {
            return this.f57023b;
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Set
        public void clear() {
            AbstractBiMap.this.clear();
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return Maps.p(H0(), obj);
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return O0(collection);
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return AbstractBiMap.this.c1();
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            if (!this.f57023b.contains(obj) || !(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            ((AbstractBiMap) AbstractBiMap.this.f57014c).f57013b.remove(entry.getValue());
            this.f57023b.remove(entry);
            return true;
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return S0(collection);
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return T0(collection);
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return U0();
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) V0(tArr);
        }
    }

    public class d extends a1<K> {
        private d() {
        }

        /* synthetic */ d(AbstractBiMap abstractBiMap, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.a1, com.google.common.collect.h0
        /* JADX INFO: renamed from: X0 */
        public Set<K> H0() {
            return AbstractBiMap.this.f57013b.keySet();
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Set
        public void clear() {
            AbstractBiMap.this.clear();
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return Maps.S(AbstractBiMap.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            if (!contains(obj)) {
                return false;
            }
            AbstractBiMap.this.g1(obj);
            return true;
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return S0(collection);
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return T0(collection);
        }
    }

    public class e extends a1<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Set<V> f57026b;

        private e() {
            this.f57026b = AbstractBiMap.this.f57014c.keySet();
        }

        /* synthetic */ e(AbstractBiMap abstractBiMap, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.a1, com.google.common.collect.h0
        /* JADX INFO: renamed from: X0 */
        public Set<V> H0() {
            return this.f57026b;
        }

        @Override // com.google.common.collect.h0, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return Maps.O0(AbstractBiMap.this.entrySet().iterator());
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

    private AbstractBiMap(Map<K, V> map, AbstractBiMap<V, K> abstractBiMap) {
        this.f57013b = map;
        this.f57014c = abstractBiMap;
    }

    /* synthetic */ AbstractBiMap(Map map, AbstractBiMap abstractBiMap, a aVar) {
        this(map, abstractBiMap);
    }

    AbstractBiMap(Map<K, V> map, Map<V, K> map2) {
        m1(map, map2);
    }

    @CheckForNull
    private V f1(@x1 K k10, @x1 V v10, boolean z10) {
        a1(k10);
        b1(v10);
        boolean zContainsKey = containsKey(k10);
        if (zContainsKey && com.google.common.base.s.a(v10, get(k10))) {
            return v10;
        }
        if (z10) {
            i0().remove(v10);
        } else {
            com.google.common.base.w.u(!containsValue(v10), "value already present: %s", v10);
        }
        V vPut = this.f57013b.put(k10, v10);
        p1(k10, zContainsKey, vPut, v10);
        return vPut;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @x1
    @s9.a
    public V g1(@CheckForNull Object obj) {
        V v10 = (V) t1.a(this.f57013b.remove(obj));
        h1(v10);
        return v10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h1(@x1 V v10) {
        this.f57014c.f57013b.remove(v10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void p1(@x1 K k10, boolean z10, @CheckForNull V v10, @x1 V v11) {
        if (z10) {
            h1(t1.a(v10));
        }
        this.f57014c.f57013b.put(v11, k10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.s0, com.google.common.collect.y0
    public Map<K, V> H0() {
        return this.f57013b;
    }

    @Override // com.google.common.collect.l
    @s9.a
    @CheckForNull
    public V R(@x1 K k10, @x1 V v10) {
        return f1(k10, v10, true);
    }

    @x1
    @s9.a
    K a1(@x1 K k10) {
        return k10;
    }

    @x1
    @s9.a
    V b1(@x1 V v10) {
        return v10;
    }

    Iterator<Map.Entry<K, V>> c1() {
        return new a(this.f57013b.entrySet().iterator());
    }

    @Override // com.google.common.collect.s0, java.util.Map
    public void clear() {
        this.f57013b.clear();
        this.f57014c.f57013b.clear();
    }

    @Override // com.google.common.collect.s0, java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        return this.f57014c.containsKey(obj);
    }

    AbstractBiMap<V, K> e1(Map<V, K> map) {
        return new Inverse(map, this);
    }

    @Override // com.google.common.collect.s0, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f57017f;
        if (set != null) {
            return set;
        }
        c cVar = new c(this, null);
        this.f57017f = cVar;
        return cVar;
    }

    @Override // com.google.common.collect.l
    public l<V, K> i0() {
        return this.f57014c;
    }

    @Override // com.google.common.collect.s0, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f57015d;
        if (set != null) {
            return set;
        }
        d dVar = new d(this, null);
        this.f57015d = dVar;
        return dVar;
    }

    void m1(Map<K, V> map, Map<V, K> map2) {
        com.google.common.base.w.g0(this.f57013b == null);
        com.google.common.base.w.g0(this.f57014c == null);
        com.google.common.base.w.d(map.isEmpty());
        com.google.common.base.w.d(map2.isEmpty());
        com.google.common.base.w.d(map != map2);
        this.f57013b = map;
        this.f57014c = e1(map2);
    }

    void o1(AbstractBiMap<V, K> abstractBiMap) {
        this.f57014c = abstractBiMap;
    }

    @Override // com.google.common.collect.s0, java.util.Map, com.google.common.collect.l
    @s9.a
    @CheckForNull
    public V put(@x1 K k10, @x1 V v10) {
        return f1(k10, v10, false);
    }

    @Override // com.google.common.collect.s0, java.util.Map, com.google.common.collect.l
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.collect.s0, java.util.Map
    @s9.a
    @CheckForNull
    public V remove(@CheckForNull Object obj) {
        if (containsKey(obj)) {
            return g1(obj);
        }
        return null;
    }

    @Override // com.google.common.collect.s0, java.util.Map, com.google.common.collect.l
    public Set<V> values() {
        Set<V> set = this.f57016e;
        if (set != null) {
            return set;
        }
        e eVar = new e(this, null);
        this.f57016e = eVar;
        return eVar;
    }
}
