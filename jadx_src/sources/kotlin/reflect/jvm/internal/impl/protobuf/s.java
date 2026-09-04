package kotlin.reflect.jvm.internal.impl.protobuf;

import com.huawei.hms.framework.common.ContainerUtils;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: SmallSortedMap.java */
/* JADX INFO: loaded from: classes5.dex */
public class s<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f127390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<s<K, V>.c> f127391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<K, V> f127392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f127393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile s<K, V>.e f127394f;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* JADX INFO: compiled from: SmallSortedMap.java */
    public static final class a<FieldDescriptorType> extends s<FieldDescriptorType, Object> {
        a(int i10) {
            super(i10, null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.s
        public void n() {
            if (!l()) {
                for (int i10 = 0; i10 < i(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> entryH = h(i10);
                    if (((g.b) entryH.getKey()).H()) {
                        entryH.setValue(Collections.unmodifiableList((List) entryH.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : j()) {
                    if (((g.b) entry.getKey()).H()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.n();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.s, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((g.b) obj, obj2);
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Iterator<Object> f127395a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Iterable<Object> f127396b = new C1171b();

        /* JADX INFO: compiled from: SmallSortedMap.java */
        public static final class a implements Iterator<Object> {
            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.s$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SmallSortedMap.java */
        public static final class C1171b implements Iterable<Object> {
            C1171b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return b.f127395a;
            }
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) f127396b;
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class c implements Comparable<s<K, V>.c>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final K f127397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private V f127398c;

        c(K k10, V v10) {
            this.f127397b = k10;
            this.f127398c = v10;
        }

        c(s sVar, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        private boolean b(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(s<K, V>.c cVar) {
            return getKey().compareTo(cVar.getKey());
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f127397b;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b(this.f127397b, entry.getKey()) && b(this.f127398c, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f127398c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f127397b;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f127398c;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            s.this.f();
            V v11 = this.f127398c;
            this.f127398c = v10;
            return v11;
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f127397b);
            String strValueOf2 = String.valueOf(this.f127398c);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
            sb2.append(strValueOf);
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb2.append(strValueOf2);
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class d implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f127400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f127401c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f127402d;

        private d() {
            this.f127400b = -1;
        }

        /* synthetic */ d(s sVar, a aVar) {
            this();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f127402d == null) {
                this.f127402d = s.this.f127392d.entrySet().iterator();
            }
            return this.f127402d;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f127401c = true;
            int i10 = this.f127400b + 1;
            this.f127400b = i10;
            return i10 < s.this.f127391c.size() ? (Map.Entry) s.this.f127391c.get(this.f127400b) : a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f127400b + 1 < s.this.f127391c.size() || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f127401c) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f127401c = false;
            s.this.f();
            if (this.f127400b >= s.this.f127391c.size()) {
                a().remove();
                return;
            }
            s sVar = s.this;
            int i10 = this.f127400b;
            this.f127400b = i10 - 1;
            sVar.u(i10);
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class e extends AbstractSet<Map.Entry<K, V>> {
        private e() {
        }

        /* synthetic */ e(s sVar, a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            s.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            s.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = s.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d(s.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            s.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return s.this.size();
        }
    }

    private s(int i10) {
        this.f127390b = i10;
        this.f127391c = Collections.emptyList();
        this.f127392d = Collections.emptyMap();
    }

    /* synthetic */ s(int i10, a aVar) {
        this(i10);
    }

    private int e(K k10) {
        int size = this.f127391c.size() - 1;
        if (size >= 0) {
            int iCompareTo = k10.compareTo(this.f127391c.get(size).getKey());
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int iCompareTo2 = k10.compareTo(this.f127391c.get(i11).getKey());
            if (iCompareTo2 < 0) {
                size = i11 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i11;
                }
                i10 = i11 + 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f127393e) {
            throw new UnsupportedOperationException();
        }
    }

    private void g() {
        f();
        if (!this.f127391c.isEmpty() || (this.f127391c instanceof ArrayList)) {
            return;
        }
        this.f127391c = new ArrayList(this.f127390b);
    }

    private SortedMap<K, V> k() {
        f();
        if (this.f127392d.isEmpty() && !(this.f127392d instanceof TreeMap)) {
            this.f127392d = new TreeMap();
        }
        return (SortedMap) this.f127392d;
    }

    static <FieldDescriptorType extends g.b<FieldDescriptorType>> s<FieldDescriptorType, Object> p(int i10) {
        return new a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V u(int i10) {
        f();
        V value = this.f127391c.remove(i10).getValue();
        if (!this.f127392d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = k().entrySet().iterator();
            this.f127391c.add(new c(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        f();
        if (!this.f127391c.isEmpty()) {
            this.f127391c.clear();
        }
        if (this.f127392d.isEmpty()) {
            return;
        }
        this.f127392d.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f127392d.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f127394f == null) {
            this.f127394f = new e(this, null);
        }
        return this.f127394f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        return iE >= 0 ? this.f127391c.get(iE).getValue() : this.f127392d.get(comparable);
    }

    public Map.Entry<K, V> h(int i10) {
        return this.f127391c.get(i10);
    }

    public int i() {
        return this.f127391c.size();
    }

    public Iterable<Map.Entry<K, V>> j() {
        return this.f127392d.isEmpty() ? b.b() : this.f127392d.entrySet();
    }

    public boolean l() {
        return this.f127393e;
    }

    public void n() {
        if (this.f127393e) {
            return;
        }
        this.f127392d = this.f127392d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f127392d);
        this.f127393e = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public V put(K k10, V v10) {
        f();
        int iE = e(k10);
        if (iE >= 0) {
            return this.f127391c.get(iE).setValue(v10);
        }
        g();
        int i10 = -(iE + 1);
        if (i10 >= this.f127390b) {
            return k().put(k10, v10);
        }
        int size = this.f127391c.size();
        int i11 = this.f127390b;
        if (size == i11) {
            s<K, V>.c cVarRemove = this.f127391c.remove(i11 - 1);
            k().put(cVarRemove.getKey(), cVarRemove.getValue());
        }
        this.f127391c.add(i10, new c(k10, v10));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        if (iE >= 0) {
            return u(iE);
        }
        if (this.f127392d.isEmpty()) {
            return null;
        }
        return this.f127392d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f127391c.size() + this.f127392d.size();
    }
}
