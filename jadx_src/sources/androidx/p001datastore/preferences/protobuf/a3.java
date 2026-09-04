package androidx.p001datastore.preferences.protobuf;

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
/* JADX INFO: loaded from: classes6.dex */
public class a3<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<a3<K, V>.e> f22374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<K, V> f22375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile a3<K, V>.g f22377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<K, V> f22378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile a3<K, V>.c f22379h;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* JADX INFO: compiled from: SmallSortedMap.java */
    public static final class a<FieldDescriptorType> extends a3<FieldDescriptorType, Object> {
        a(int i10) {
            super(i10, null);
        }

        @Override // androidx.p001datastore.preferences.protobuf.a3, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((y0.c) obj, obj2);
        }

        @Override // androidx.p001datastore.preferences.protobuf.a3
        public void v() {
            if (!u()) {
                for (int i10 = 0; i10 < k(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> entryJ = j(i10);
                    if (((y0.c) entryJ.getKey()).H()) {
                        entryJ.setValue(Collections.unmodifiableList((List) entryJ.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : n()) {
                    if (((y0.c) entry.getKey()).H()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.v();
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class b implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f22380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f22381c;

        private b() {
            this.f22380b = a3.this.f22374c.size();
        }

        /* synthetic */ b(a3 a3Var, a aVar) {
            this();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f22381c == null) {
                this.f22381c = a3.this.f22378g.entrySet().iterator();
            }
            return this.f22381c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (a().hasNext()) {
                return a().next();
            }
            List list = a3.this.f22374c;
            int i10 = this.f22380b - 1;
            this.f22380b = i10;
            return (Map.Entry) list.get(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f22380b;
            return (i10 > 0 && i10 <= a3.this.f22374c.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class c extends a3<K, V>.g {
        private c() {
            super(a3.this, null);
        }

        /* synthetic */ c(a3 a3Var, a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.a3.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(a3.this, null);
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Iterator<Object> f22384a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Iterable<Object> f22385b = new b();

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

        /* JADX INFO: compiled from: SmallSortedMap.java */
        public static final class b implements Iterable<Object> {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.f22384a;
            }
        }

        private d() {
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) f22385b;
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class e implements Map.Entry<K, V>, Comparable<a3<K, V>.e> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final K f22386b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private V f22387c;

        e(K k10, V v10) {
            this.f22386b = k10;
            this.f22387c = v10;
        }

        e(a3 a3Var, Map.Entry<K, V> entry) {
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
        public int compareTo(a3<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f22386b;
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
            return b(this.f22386b, entry.getKey()) && b(this.f22387c, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f22387c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f22386b;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f22387c;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            a3.this.g();
            V v11 = this.f22387c;
            this.f22387c = v10;
            return v11;
        }

        public String toString() {
            return this.f22386b + ContainerUtils.KEY_VALUE_DELIMITER + this.f22387c;
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class f implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f22389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f22390c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f22391d;

        private f() {
            this.f22389b = -1;
        }

        /* synthetic */ f(a3 a3Var, a aVar) {
            this();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f22391d == null) {
                this.f22391d = a3.this.f22375d.entrySet().iterator();
            }
            return this.f22391d;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f22390c = true;
            int i10 = this.f22389b + 1;
            this.f22389b = i10;
            return i10 < a3.this.f22374c.size() ? (Map.Entry) a3.this.f22374c.get(this.f22389b) : a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f22389b + 1 >= a3.this.f22374c.size()) {
                return !a3.this.f22375d.isEmpty() && a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f22390c) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f22390c = false;
            a3.this.g();
            if (this.f22389b >= a3.this.f22374c.size()) {
                a().remove();
                return;
            }
            a3 a3Var = a3.this;
            int i10 = this.f22389b;
            this.f22389b = i10 - 1;
            a3Var.z(i10);
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class g extends AbstractSet<Map.Entry<K, V>> {
        private g() {
        }

        /* synthetic */ g(a3 a3Var, a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            a3.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = a3.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(a3.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            a3.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a3.this.size();
        }
    }

    private a3(int i10) {
        this.f22373b = i10;
        this.f22374c = Collections.emptyList();
        this.f22375d = Collections.emptyMap();
        this.f22378g = Collections.emptyMap();
    }

    /* synthetic */ a3(int i10, a aVar) {
        this(i10);
    }

    private int f(K k10) {
        int size = this.f22374c.size() - 1;
        if (size >= 0) {
            int iCompareTo = k10.compareTo(this.f22374c.get(size).getKey());
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
            int iCompareTo2 = k10.compareTo(this.f22374c.get(i11).getKey());
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
    public void g() {
        if (this.f22376e) {
            throw new UnsupportedOperationException();
        }
    }

    private void i() {
        g();
        if (!this.f22374c.isEmpty() || (this.f22374c instanceof ArrayList)) {
            return;
        }
        this.f22374c = new ArrayList(this.f22373b);
    }

    private SortedMap<K, V> r() {
        g();
        if (this.f22375d.isEmpty() && !(this.f22375d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f22375d = treeMap;
            this.f22378g = treeMap.descendingMap();
        }
        return (SortedMap) this.f22375d;
    }

    static <FieldDescriptorType extends y0.c<FieldDescriptorType>> a3<FieldDescriptorType, Object> w(int i10) {
        return new a(i10);
    }

    static <K extends Comparable<K>, V> a3<K, V> x(int i10) {
        return new a3<>(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V z(int i10) {
        g();
        V value = this.f22374c.remove(i10).getValue();
        if (!this.f22375d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = r().entrySet().iterator();
            this.f22374c.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f22374c.isEmpty()) {
            this.f22374c.clear();
        }
        if (this.f22375d.isEmpty()) {
            return;
        }
        this.f22375d.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f22375d.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f22377f == null) {
            this.f22377f = new g(this, null);
        }
        return this.f22377f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3)) {
            return super.equals(obj);
        }
        a3 a3Var = (a3) obj;
        int size = size();
        if (size != a3Var.size()) {
            return false;
        }
        int iK = k();
        if (iK != a3Var.k()) {
            return entrySet().equals(a3Var.entrySet());
        }
        for (int i10 = 0; i10 < iK; i10++) {
            if (!j(i10).equals(a3Var.j(i10))) {
                return false;
            }
        }
        if (iK != size) {
            return this.f22375d.equals(a3Var.f22375d);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        return iF >= 0 ? this.f22374c.get(iF).getValue() : this.f22375d.get(comparable);
    }

    Set<Map.Entry<K, V>> h() {
        if (this.f22379h == null) {
            this.f22379h = new c(this, null);
        }
        return this.f22379h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iK = k();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iK; i10++) {
            iHashCode += this.f22374c.get(i10).hashCode();
        }
        return l() > 0 ? iHashCode + this.f22375d.hashCode() : iHashCode;
    }

    public Map.Entry<K, V> j(int i10) {
        return this.f22374c.get(i10);
    }

    public int k() {
        return this.f22374c.size();
    }

    public int l() {
        return this.f22375d.size();
    }

    public Iterable<Map.Entry<K, V>> n() {
        return this.f22375d.isEmpty() ? d.b() : this.f22375d.entrySet();
    }

    Iterable<Map.Entry<K, V>> p() {
        return this.f22378g.isEmpty() ? d.b() : this.f22378g.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        if (iF >= 0) {
            return z(iF);
        }
        if (this.f22375d.isEmpty()) {
            return null;
        }
        return this.f22375d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f22374c.size() + this.f22375d.size();
    }

    public boolean u() {
        return this.f22376e;
    }

    public void v() {
        if (this.f22376e) {
            return;
        }
        this.f22375d = this.f22375d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f22375d);
        this.f22378g = this.f22378g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f22378g);
        this.f22376e = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public V put(K k10, V v10) {
        g();
        int iF = f(k10);
        if (iF >= 0) {
            return this.f22374c.get(iF).setValue(v10);
        }
        i();
        int i10 = -(iF + 1);
        if (i10 >= this.f22373b) {
            return r().put(k10, v10);
        }
        int size = this.f22374c.size();
        int i11 = this.f22373b;
        if (size == i11) {
            a3<K, V>.e eVarRemove = this.f22374c.remove(i11 - 1);
            r().put(eVarRemove.getKey(), eVarRemove.getValue());
        }
        this.f22374c.add(i10, new e(k10, v10));
        return null;
    }
}
