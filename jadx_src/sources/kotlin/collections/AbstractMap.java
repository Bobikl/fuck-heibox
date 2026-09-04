package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: AbstractMap.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.u0(version = "1.1")
public abstract class AbstractMap<K, V> implements Map<K, V>, zh.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final a f124495d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private volatile Set<? extends K> f124496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private volatile Collection<? extends V> f124497c;

    /* JADX INFO: compiled from: AbstractMap.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final boolean a(@dl.d Map.Entry<?, ?> e10, @dl.e Object obj) {
            kotlin.jvm.internal.f0.p(e10, "e");
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return kotlin.jvm.internal.f0.g(e10.getKey(), entry.getKey()) && kotlin.jvm.internal.f0.g(e10.getValue(), entry.getValue());
        }

        public final int b(@dl.d Map.Entry<?, ?> e10) {
            kotlin.jvm.internal.f0.p(e10, "e");
            Object key = e10.getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            Object value = e10.getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @dl.d
        public final String c(@dl.d Map.Entry<?, ?> e10) {
            kotlin.jvm.internal.f0.p(e10, "e");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e10.getKey());
            sb2.append(n5.a.f132013h);
            sb2.append(e10.getValue());
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: AbstractMap.kt */
    public static final class b extends g<K> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractMap<K, V> f124498c;

        /* JADX INFO: compiled from: AbstractMap.kt */
        public static final class a implements Iterator<K>, zh.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Iterator<Map.Entry<K, V>> f124499b;

            /* JADX WARN: Multi-variable type inference failed */
            a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f124499b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f124499b.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                return this.f124499b.next().getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(AbstractMap<K, ? extends V> abstractMap) {
            this.f124498c = abstractMap;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.f124498c.containsKey(obj);
        }

        @Override // kotlin.collections.AbstractCollection
        public int getSize() {
            return this.f124498c.size();
        }

        @Override // kotlin.collections.g, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        @dl.d
        public Iterator<K> iterator() {
            return new a(this.f124498c.entrySet().iterator());
        }
    }

    /* JADX INFO: compiled from: AbstractMap.kt */
    public static final class c extends AbstractCollection<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractMap<K, V> f124500b;

        /* JADX INFO: compiled from: AbstractMap.kt */
        public static final class a implements Iterator<V>, zh.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Iterator<Map.Entry<K, V>> f124501b;

            /* JADX WARN: Multi-variable type inference failed */
            a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f124501b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f124501b.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                return this.f124501b.next().getValue();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(AbstractMap<K, ? extends V> abstractMap) {
            this.f124500b = abstractMap;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.f124500b.containsValue(obj);
        }

        @Override // kotlin.collections.AbstractCollection
        public int getSize() {
            return this.f124500b.size();
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        @dl.d
        public Iterator<V> iterator() {
            return new a(this.f124500b.entrySet().iterator());
        }
    }

    protected AbstractMap() {
    }

    private final Map.Entry<K, V> h(K k10) {
        Object next;
        Iterator<T> it = entrySet().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (kotlin.jvm.internal.f0.g(((Map.Entry) next).getKey(), k10)) {
                return (Map.Entry) next;
            }
        }
        next = null;
        return (Map.Entry) next;
    }

    private final String i(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String j(Map.Entry<? extends K, ? extends V> entry) {
        return i(entry.getKey()) + n5.a.f132013h + i(entry.getValue());
    }

    public final boolean b(@dl.e Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        kotlin.jvm.internal.f0.n(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        V v10 = get(key);
        if (!kotlin.jvm.internal.f0.g(value, v10)) {
            return false;
        }
        if (v10 != null) {
            return true;
        }
        kotlin.jvm.internal.f0.n(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
        return containsKey(key);
    }

    public abstract Set c();

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return h(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> setEntrySet = entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.f0.g(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @dl.d
    public Set<K> d() {
        if (this.f124496b == null) {
            this.f124496b = new b(this);
        }
        Set<? extends K> set = this.f124496b;
        kotlin.jvm.internal.f0.m(set);
        return set;
    }

    /* JADX INFO: renamed from: e */
    public int getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() {
        return entrySet().size();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return c();
    }

    @Override // java.util.Map
    public boolean equals(@dl.e Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (!b((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    @dl.d
    public Collection<V> g() {
        if (this.f124497c == null) {
            this.f124497c = new c(this);
        }
        Collection<? extends V> collection = this.f124497c;
        kotlin.jvm.internal.f0.m(collection);
        return collection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @dl.e
    public V get(Object obj) {
        Map.Entry<K, V> entryH = h(obj);
        if (entryH != null) {
            return entryH.getValue();
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return d();
    }

    @Override // java.util.Map, u0.i
    public V put(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, u0.i
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
    }

    @dl.d
    public String toString() {
        return CollectionsKt___CollectionsKt.h3(entrySet(), ", ", "{", z5.g.f141884d, 0, null, new yh.l<Map.Entry<? extends K, ? extends V>, CharSequence>(this) { // from class: kotlin.collections.AbstractMap.toString.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractMap<K, V> f124502b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.f124502b = this;
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(@dl.d Map.Entry<? extends K, ? extends V> it) {
                kotlin.jvm.internal.f0.p(it, "it");
                return this.f124502b.j(it);
            }
        }, 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return g();
    }
}
