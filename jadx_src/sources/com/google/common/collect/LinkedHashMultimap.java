package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true, serializable = true)
@u
public final class LinkedHashMultimap<K, V> extends LinkedHashMultimapGwtSerializationDependencies<K, V> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f57460k = 16;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f57461l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @o9.d
    static final double f57462m = 1.0d;

    @o9.c
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @o9.d
    transient int f57463i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private transient ValueEntry<K, V> f57464j;

    @o9.d
    public static final class ValueEntry<K, V> extends ImmutableEntry<K, V> implements c<K, V> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f57465d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @CheckForNull
        ValueEntry<K, V> f57466e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @CheckForNull
        c<K, V> f57467f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @CheckForNull
        c<K, V> f57468g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @CheckForNull
        ValueEntry<K, V> f57469h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @CheckForNull
        ValueEntry<K, V> f57470i;

        ValueEntry(@x1 K k10, @x1 V v10, int i10, @CheckForNull ValueEntry<K, V> valueEntry) {
            super(k10, v10);
            this.f57465d = i10;
            this.f57466e = valueEntry;
        }

        static <K, V> ValueEntry<K, V> h() {
            return new ValueEntry<>(null, null, 0, null);
        }

        @Override // com.google.common.collect.LinkedHashMultimap.c
        public c<K, V> a() {
            c<K, V> cVar = this.f57467f;
            Objects.requireNonNull(cVar);
            return cVar;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.c
        public void b(c<K, V> cVar) {
            this.f57468g = cVar;
        }

        public ValueEntry<K, V> c() {
            ValueEntry<K, V> valueEntry = this.f57469h;
            Objects.requireNonNull(valueEntry);
            return valueEntry;
        }

        public ValueEntry<K, V> d() {
            ValueEntry<K, V> valueEntry = this.f57470i;
            Objects.requireNonNull(valueEntry);
            return valueEntry;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.c
        public void e(c<K, V> cVar) {
            this.f57467f = cVar;
        }

        boolean f(@CheckForNull Object obj, int i10) {
            return this.f57465d == i10 && com.google.common.base.s.a(getValue(), obj);
        }

        @Override // com.google.common.collect.LinkedHashMultimap.c
        public c<K, V> g() {
            c<K, V> cVar = this.f57468g;
            Objects.requireNonNull(cVar);
            return cVar;
        }

        public void i(ValueEntry<K, V> valueEntry) {
            this.f57469h = valueEntry;
        }

        public void j(ValueEntry<K, V> valueEntry) {
            this.f57470i = valueEntry;
        }
    }

    public class a implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ValueEntry<K, V> f57471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        ValueEntry<K, V> f57472c;

        a() {
            this.f57471b = LinkedHashMultimap.this.f57464j.d();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            ValueEntry<K, V> valueEntry = this.f57471b;
            this.f57472c = valueEntry;
            this.f57471b = valueEntry.d();
            return valueEntry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f57471b != LinkedHashMultimap.this.f57464j;
        }

        @Override // java.util.Iterator
        public void remove() {
            com.google.common.base.w.h0(this.f57472c != null, "no calls to next() since the last call to remove()");
            LinkedHashMultimap.this.remove(this.f57472c.getKey(), this.f57472c.getValue());
            this.f57472c = null;
        }
    }

    @o9.d
    public final class b extends Sets.j<V> implements c<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @x1
        private final K f57474b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @o9.d
        ValueEntry<K, V>[] f57475c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f57476d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f57477e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c<K, V> f57478f = this;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private c<K, V> f57479g = this;

        public class a implements Iterator<V> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            c<K, V> f57481b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @CheckForNull
            ValueEntry<K, V> f57482c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f57483d;

            a() {
                this.f57481b = b.this.f57478f;
                this.f57483d = b.this.f57477e;
            }

            private void a() {
                if (b.this.f57477e != this.f57483d) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                a();
                return this.f57481b != b.this;
            }

            @Override // java.util.Iterator
            @x1
            public V next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                ValueEntry<K, V> valueEntry = (ValueEntry) this.f57481b;
                V value = valueEntry.getValue();
                this.f57482c = valueEntry;
                this.f57481b = valueEntry.g();
                return value;
            }

            @Override // java.util.Iterator
            public void remove() {
                a();
                com.google.common.base.w.h0(this.f57482c != null, "no calls to next() since the last call to remove()");
                b.this.remove(this.f57482c.getValue());
                this.f57483d = b.this.f57477e;
                this.f57482c = null;
            }
        }

        b(K k10, int i10) {
            this.f57474b = k10;
            this.f57475c = new ValueEntry[i1.a(i10, 1.0d)];
        }

        private int j() {
            return this.f57475c.length - 1;
        }

        private void l() {
            if (i1.b(this.f57476d, this.f57475c.length, 1.0d)) {
                int length = this.f57475c.length * 2;
                ValueEntry<K, V>[] valueEntryArr = new ValueEntry[length];
                this.f57475c = valueEntryArr;
                int i10 = length - 1;
                for (c<K, V> cVarG = this.f57478f; cVarG != this; cVarG = cVarG.g()) {
                    ValueEntry<K, V> valueEntry = (ValueEntry) cVarG;
                    int i11 = valueEntry.f57465d & i10;
                    valueEntry.f57466e = valueEntryArr[i11];
                    valueEntryArr[i11] = valueEntry;
                }
            }
        }

        @Override // com.google.common.collect.LinkedHashMultimap.c
        public c<K, V> a() {
            return this.f57479g;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(@x1 V v10) {
            int iD = i1.d(v10);
            int iJ = j() & iD;
            ValueEntry<K, V> valueEntry = this.f57475c[iJ];
            for (ValueEntry<K, V> valueEntry2 = valueEntry; valueEntry2 != null; valueEntry2 = valueEntry2.f57466e) {
                if (valueEntry2.f(v10, iD)) {
                    return false;
                }
            }
            ValueEntry<K, V> valueEntry3 = new ValueEntry<>(this.f57474b, v10, iD, valueEntry);
            LinkedHashMultimap.X(this.f57479g, valueEntry3);
            LinkedHashMultimap.X(valueEntry3, this);
            LinkedHashMultimap.W(LinkedHashMultimap.this.f57464j.c(), valueEntry3);
            LinkedHashMultimap.W(valueEntry3, LinkedHashMultimap.this.f57464j);
            this.f57475c[iJ] = valueEntry3;
            this.f57476d++;
            this.f57477e++;
            l();
            return true;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.c
        public void b(c<K, V> cVar) {
            this.f57478f = cVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Arrays.fill(this.f57475c, (Object) null);
            this.f57476d = 0;
            for (c<K, V> cVarG = this.f57478f; cVarG != this; cVarG = cVarG.g()) {
                LinkedHashMultimap.S((ValueEntry) cVarG);
            }
            LinkedHashMultimap.X(this, this);
            this.f57477e++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            int iD = i1.d(obj);
            for (ValueEntry<K, V> valueEntry = this.f57475c[j() & iD]; valueEntry != null; valueEntry = valueEntry.f57466e) {
                if (valueEntry.f(obj, iD)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.c
        public void e(c<K, V> cVar) {
            this.f57479g = cVar;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.c
        public c<K, V> g() {
            return this.f57478f;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @s9.a
        public boolean remove(@CheckForNull Object obj) {
            int iD = i1.d(obj);
            int iJ = j() & iD;
            ValueEntry<K, V> valueEntry = null;
            for (ValueEntry<K, V> valueEntry2 = this.f57475c[iJ]; valueEntry2 != null; valueEntry2 = valueEntry2.f57466e) {
                if (valueEntry2.f(obj, iD)) {
                    if (valueEntry == null) {
                        this.f57475c[iJ] = valueEntry2.f57466e;
                    } else {
                        valueEntry.f57466e = valueEntry2.f57466e;
                    }
                    LinkedHashMultimap.T(valueEntry2);
                    LinkedHashMultimap.S(valueEntry2);
                    this.f57476d--;
                    this.f57477e++;
                    return true;
                }
                valueEntry = valueEntry2;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f57476d;
        }
    }

    public interface c<K, V> {
        c<K, V> a();

        void b(c<K, V> cVar);

        void e(c<K, V> cVar);

        c<K, V> g();
    }

    private LinkedHashMultimap(int i10, int i11) {
        super(z1.f(i10));
        this.f57463i = 2;
        n.b(i11, "expectedValuesPerKey");
        this.f57463i = i11;
        ValueEntry<K, V> valueEntryH = ValueEntry.h();
        this.f57464j = valueEntryH;
        W(valueEntryH, valueEntryH);
    }

    public static <K, V> LinkedHashMultimap<K, V> P() {
        return new LinkedHashMultimap<>(16, 2);
    }

    public static <K, V> LinkedHashMultimap<K, V> Q(int i10, int i11) {
        return new LinkedHashMultimap<>(Maps.o(i10), Maps.o(i11));
    }

    public static <K, V> LinkedHashMultimap<K, V> R(r1<? extends K, ? extends V> r1Var) {
        LinkedHashMultimap<K, V> linkedHashMultimapQ = Q(r1Var.keySet().size(), 2);
        linkedHashMultimapQ.A(r1Var);
        return linkedHashMultimapQ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void S(ValueEntry<K, V> valueEntry) {
        W(valueEntry.c(), valueEntry.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void T(c<K, V> cVar) {
        X(cVar.a(), cVar.g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o9.c
    private void V(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        ValueEntry<K, V> valueEntryH = ValueEntry.h();
        this.f57464j = valueEntryH;
        W(valueEntryH, valueEntryH);
        this.f57463i = 2;
        int i10 = objectInputStream.readInt();
        Map mapF = z1.f(12);
        for (int i11 = 0; i11 < i10; i11++) {
            Object object = objectInputStream.readObject();
            mapF.put(object, v(object));
        }
        int i12 = objectInputStream.readInt();
        for (int i13 = 0; i13 < i12; i13++) {
            Object object2 = objectInputStream.readObject();
            Object object3 = objectInputStream.readObject();
            Collection collection = (Collection) mapF.get(object2);
            Objects.requireNonNull(collection);
            collection.add(object3);
        }
        D(mapF);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void W(ValueEntry<K, V> valueEntry, ValueEntry<K, V> valueEntry2) {
        valueEntry.j(valueEntry2);
        valueEntry2.i(valueEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void X(c<K, V> cVar, c<K, V> cVar2) {
        cVar.b(cVar2);
        cVar2.e(cVar);
    }

    @o9.c
    private void Y(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(keySet().size());
        Iterator<K> it = keySet().iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
        objectOutputStream.writeInt(size());
        for (Map.Entry<K, V> entry : i()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    @s9.a
    public /* bridge */ /* synthetic */ boolean A(r1 r1Var) {
        return super.A(r1Var);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    public /* bridge */ /* synthetic */ boolean D0(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return super.D0(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    /* JADX INFO: renamed from: H */
    public Set<V> u() {
        return z1.g(this.f57463i);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    public /* bridge */ /* synthetic */ Set a(@CheckForNull Object obj) {
        return super.a(obj);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c, com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    public Set<V> b(@x1 K k10, Iterable<? extends V> iterable) {
        return super.b((Object) k10, (Iterable) iterable);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.r1
    public void clear() {
        super.clear();
        ValueEntry<K, V> valueEntry = this.f57464j;
        W(valueEntry, valueEntry);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.r1
    public /* bridge */ /* synthetic */ boolean containsKey(@CheckForNull Object obj) {
        return super.containsKey(obj);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    public /* bridge */ /* synthetic */ boolean containsValue(@CheckForNull Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.c, com.google.common.collect.r1, com.google.common.collect.o1
    public /* bridge */ /* synthetic */ Map e() {
        return super.e();
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.c, com.google.common.collect.r1, com.google.common.collect.o1
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.r1, com.google.common.collect.o1
    /* JADX INFO: renamed from: get */
    public /* bridge */ /* synthetic */ Set v(@x1 Object obj) {
        return super.v(obj);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c, com.google.common.collect.r1
    public Set<Map.Entry<K, V>> i() {
        return super.i();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c
    Iterator<Map.Entry<K, V>> k() {
        return new a();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    public Set<K> keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c
    Iterator<V> l() {
        return Maps.O0(k());
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    public /* bridge */ /* synthetic */ s1 n0() {
        return super.n0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c, com.google.common.collect.r1
    @s9.a
    public /* bridge */ /* synthetic */ boolean put(@x1 Object obj, @x1 Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    @s9.a
    public /* bridge */ /* synthetic */ boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.r1
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.c, com.google.common.collect.r1
    @s9.a
    public /* bridge */ /* synthetic */ boolean t0(@x1 Object obj, Iterable iterable) {
        return super.t0(obj, iterable);
    }

    @Override // com.google.common.collect.c
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    Collection<V> v(@x1 K k10) {
        return new b(k10, this.f57463i);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c, com.google.common.collect.r1
    public Collection<V> values() {
        return super.values();
    }
}
