package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true, serializable = true)
@u
public class LinkedListMultimap<K, V> extends com.google.common.collect.c<K, V> implements o1<K, V>, Serializable {

    @o9.c
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @CheckForNull
    private transient g<K, V> f57485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @CheckForNull
    private transient g<K, V> f57486h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private transient Map<K, f<K, V>> f57487i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private transient int f57488j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private transient int f57489k;

    public class a extends AbstractSequentialList<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f57490b;

        a(Object obj) {
            this.f57490b = obj;
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<V> listIterator(int i10) {
            return new i(this.f57490b, i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            f fVar = (f) LinkedListMultimap.this.f57487i.get(this.f57490b);
            if (fVar == null) {
                return 0;
            }
            return fVar.f57503c;
        }
    }

    public class b extends AbstractSequentialList<Map.Entry<K, V>> {
        b() {
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<Map.Entry<K, V>> listIterator(int i10) {
            return new h(i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return LinkedListMultimap.this.f57488j;
        }
    }

    public class c extends Sets.j<K> {
        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return LinkedListMultimap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new e(LinkedListMultimap.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            return !LinkedListMultimap.this.a(obj).isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedListMultimap.this.f57487i.size();
        }
    }

    public class d extends AbstractSequentialList<V> {

        public class a extends x2<Map.Entry<K, V>, V> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ h f57495c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, ListIterator listIterator, h hVar) {
                super(listIterator);
                this.f57495c = hVar;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.w2
            @x1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public V a(Map.Entry<K, V> entry) {
                return entry.getValue();
            }

            @Override // com.google.common.collect.x2, java.util.ListIterator
            public void set(@x1 V v10) {
                this.f57495c.f(v10);
            }
        }

        d() {
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<V> listIterator(int i10) {
            h hVar = new h(i10);
            return new a(this, hVar, hVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return LinkedListMultimap.this.f57488j;
        }
    }

    public class e implements Iterator<K> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Set<K> f57496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        g<K, V> f57497c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        g<K, V> f57498d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f57499e;

        private e() {
            this.f57496b = Sets.y(LinkedListMultimap.this.keySet().size());
            this.f57497c = LinkedListMultimap.this.f57485g;
            this.f57499e = LinkedListMultimap.this.f57489k;
        }

        /* synthetic */ e(LinkedListMultimap linkedListMultimap, a aVar) {
            this();
        }

        private void a() {
            if (LinkedListMultimap.this.f57489k != this.f57499e) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f57497c != null;
        }

        @Override // java.util.Iterator
        @x1
        public K next() {
            g<K, V> gVar;
            a();
            g<K, V> gVar2 = this.f57497c;
            if (gVar2 == null) {
                throw new NoSuchElementException();
            }
            this.f57498d = gVar2;
            this.f57496b.add(gVar2.f57504b);
            do {
                gVar = this.f57497c.f57506d;
                this.f57497c = gVar;
                if (gVar == null) {
                    break;
                }
            } while (!this.f57496b.add(gVar.f57504b));
            return this.f57498d.f57504b;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            com.google.common.base.w.h0(this.f57498d != null, "no calls to next() since the last call to remove()");
            LinkedListMultimap.this.E(this.f57498d.f57504b);
            this.f57498d = null;
            this.f57499e = LinkedListMultimap.this.f57489k;
        }
    }

    public static class f<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g<K, V> f57501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g<K, V> f57502b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f57503c;

        f(g<K, V> gVar) {
            this.f57501a = gVar;
            this.f57502b = gVar;
            gVar.f57509g = null;
            gVar.f57508f = null;
            this.f57503c = 1;
        }
    }

    public static final class g<K, V> extends com.google.common.collect.b<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @x1
        final K f57504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @x1
        V f57505c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        g<K, V> f57506d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @CheckForNull
        g<K, V> f57507e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @CheckForNull
        g<K, V> f57508f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @CheckForNull
        g<K, V> f57509g;

        g(@x1 K k10, @x1 V v10) {
            this.f57504b = k10;
            this.f57505c = v10;
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        @x1
        public K getKey() {
            return this.f57504b;
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        @x1
        public V getValue() {
            return this.f57505c;
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        @x1
        public V setValue(@x1 V v10) {
            V v11 = this.f57505c;
            this.f57505c = v10;
            return v11;
        }
    }

    public class h implements ListIterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f57510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        g<K, V> f57511c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        g<K, V> f57512d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @CheckForNull
        g<K, V> f57513e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f57514f;

        h(int i10) {
            this.f57514f = LinkedListMultimap.this.f57489k;
            int size = LinkedListMultimap.this.size();
            com.google.common.base.w.d0(i10, size);
            if (i10 < size / 2) {
                this.f57511c = LinkedListMultimap.this.f57485g;
                while (true) {
                    int i11 = i10 - 1;
                    if (i10 <= 0) {
                        break;
                    }
                    next();
                    i10 = i11;
                }
            } else {
                this.f57513e = LinkedListMultimap.this.f57486h;
                this.f57510b = size;
                while (true) {
                    int i12 = i10 + 1;
                    if (i10 >= size) {
                        break;
                    }
                    previous();
                    i10 = i12;
                }
            }
            this.f57512d = null;
        }

        private void b() {
            if (LinkedListMultimap.this.f57489k != this.f57514f) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @s9.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public g<K, V> next() {
            b();
            g<K, V> gVar = this.f57511c;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            this.f57512d = gVar;
            this.f57513e = gVar;
            this.f57511c = gVar.f57506d;
            this.f57510b++;
            return gVar;
        }

        @Override // java.util.ListIterator
        @s9.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public g<K, V> previous() {
            b();
            g<K, V> gVar = this.f57513e;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            this.f57512d = gVar;
            this.f57511c = gVar;
            this.f57513e = gVar.f57507e;
            this.f57510b--;
            return gVar;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        void f(@x1 V v10) {
            com.google.common.base.w.g0(this.f57512d != null);
            this.f57512d.f57505c = v10;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            b();
            return this.f57511c != null;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            b();
            return this.f57513e != null;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f57510b;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f57510b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            b();
            com.google.common.base.w.h0(this.f57512d != null, "no calls to next() since the last call to remove()");
            g<K, V> gVar = this.f57512d;
            if (gVar != this.f57511c) {
                this.f57513e = gVar.f57507e;
                this.f57510b--;
            } else {
                this.f57511c = gVar.f57506d;
            }
            LinkedListMultimap.this.F(gVar);
            this.f57512d = null;
            this.f57514f = LinkedListMultimap.this.f57489k;
        }
    }

    public class i implements ListIterator<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @x1
        final K f57516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f57517c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @CheckForNull
        g<K, V> f57518d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @CheckForNull
        g<K, V> f57519e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @CheckForNull
        g<K, V> f57520f;

        i(K k10) {
            this.f57516b = k10;
            f fVar = (f) LinkedListMultimap.this.f57487i.get(k10);
            this.f57518d = fVar == null ? null : fVar.f57501a;
        }

        public i(K k10, int i10) {
            f fVar = (f) LinkedListMultimap.this.f57487i.get(k10);
            int i11 = fVar == null ? 0 : fVar.f57503c;
            com.google.common.base.w.d0(i10, i11);
            if (i10 < i11 / 2) {
                this.f57518d = fVar == null ? null : fVar.f57501a;
                while (true) {
                    int i12 = i10 - 1;
                    if (i10 <= 0) {
                        break;
                    }
                    next();
                    i10 = i12;
                }
            } else {
                this.f57520f = fVar == null ? null : fVar.f57502b;
                this.f57517c = i11;
                while (true) {
                    int i13 = i10 + 1;
                    if (i10 >= i11) {
                        break;
                    }
                    previous();
                    i10 = i13;
                }
            }
            this.f57516b = k10;
            this.f57519e = null;
        }

        @Override // java.util.ListIterator
        public void add(@x1 V v10) {
            this.f57520f = LinkedListMultimap.this.u(this.f57516b, v10, this.f57518d);
            this.f57517c++;
            this.f57519e = null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f57518d != null;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f57520f != null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @x1
        @s9.a
        public V next() {
            g<K, V> gVar = this.f57518d;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            this.f57519e = gVar;
            this.f57520f = gVar;
            this.f57518d = gVar.f57508f;
            this.f57517c++;
            return gVar.f57505c;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f57517c;
        }

        @Override // java.util.ListIterator
        @x1
        @s9.a
        public V previous() {
            g<K, V> gVar = this.f57520f;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            this.f57519e = gVar;
            this.f57518d = gVar;
            this.f57520f = gVar.f57509g;
            this.f57517c--;
            return gVar.f57505c;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f57517c - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            com.google.common.base.w.h0(this.f57519e != null, "no calls to next() since the last call to remove()");
            g<K, V> gVar = this.f57519e;
            if (gVar != this.f57518d) {
                this.f57520f = gVar.f57509g;
                this.f57517c--;
            } else {
                this.f57518d = gVar.f57508f;
            }
            LinkedListMultimap.this.F(gVar);
            this.f57519e = null;
        }

        @Override // java.util.ListIterator
        public void set(@x1 V v10) {
            com.google.common.base.w.g0(this.f57519e != null);
            this.f57519e.f57505c = v10;
        }
    }

    LinkedListMultimap() {
        this(12);
    }

    private LinkedListMultimap(int i10) {
        this.f57487i = z1.d(i10);
    }

    private LinkedListMultimap(r1<? extends K, ? extends V> r1Var) {
        this(r1Var.keySet().size());
        A(r1Var);
    }

    private List<V> C(@x1 K k10) {
        return Collections.unmodifiableList(Lists.s(new i(k10)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o9.c
    private void D(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f57487i = CompactLinkedHashMap.l0();
        int i10 = objectInputStream.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(@x1 K k10) {
        Iterators.h(new i(k10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f57507e;
        if (gVar2 != null) {
            gVar2.f57506d = gVar.f57506d;
        } else {
            this.f57485g = gVar.f57506d;
        }
        g<K, V> gVar3 = gVar.f57506d;
        if (gVar3 != null) {
            gVar3.f57507e = gVar2;
        } else {
            this.f57486h = gVar2;
        }
        if (gVar.f57509g == null && gVar.f57508f == null) {
            f<K, V> fVarRemove = this.f57487i.remove(gVar.f57504b);
            Objects.requireNonNull(fVarRemove);
            fVarRemove.f57503c = 0;
            this.f57489k++;
        } else {
            f<K, V> fVar = this.f57487i.get(gVar.f57504b);
            Objects.requireNonNull(fVar);
            fVar.f57503c--;
            g<K, V> gVar4 = gVar.f57509g;
            if (gVar4 == null) {
                g<K, V> gVar5 = gVar.f57508f;
                Objects.requireNonNull(gVar5);
                fVar.f57501a = gVar5;
            } else {
                gVar4.f57508f = gVar.f57508f;
            }
            g<K, V> gVar6 = gVar.f57508f;
            if (gVar6 == null) {
                g<K, V> gVar7 = gVar.f57509g;
                Objects.requireNonNull(gVar7);
                fVar.f57502b = gVar7;
            } else {
                gVar6.f57509g = gVar.f57509g;
            }
        }
        this.f57488j--;
    }

    @o9.c
    private void H(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        for (Map.Entry<K, V> entry : i()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @s9.a
    public g<K, V> u(@x1 K k10, @x1 V v10, @CheckForNull g<K, V> gVar) {
        g<K, V> gVar2 = new g<>(k10, v10);
        if (this.f57485g == null) {
            this.f57486h = gVar2;
            this.f57485g = gVar2;
            this.f57487i.put(k10, new f<>(gVar2));
            this.f57489k++;
        } else if (gVar == null) {
            g<K, V> gVar3 = this.f57486h;
            Objects.requireNonNull(gVar3);
            gVar3.f57506d = gVar2;
            gVar2.f57507e = this.f57486h;
            this.f57486h = gVar2;
            f<K, V> fVar = this.f57487i.get(k10);
            if (fVar == null) {
                this.f57487i.put(k10, new f<>(gVar2));
                this.f57489k++;
            } else {
                fVar.f57503c++;
                g<K, V> gVar4 = fVar.f57502b;
                gVar4.f57508f = gVar2;
                gVar2.f57509g = gVar4;
                fVar.f57502b = gVar2;
            }
        } else {
            f<K, V> fVar2 = this.f57487i.get(k10);
            Objects.requireNonNull(fVar2);
            fVar2.f57503c++;
            gVar2.f57507e = gVar.f57507e;
            gVar2.f57509g = gVar.f57509g;
            gVar2.f57506d = gVar;
            gVar2.f57508f = gVar;
            g<K, V> gVar5 = gVar.f57509g;
            if (gVar5 == null) {
                fVar2.f57501a = gVar2;
            } else {
                gVar5.f57508f = gVar2;
            }
            g<K, V> gVar6 = gVar.f57507e;
            if (gVar6 == null) {
                this.f57485g = gVar2;
            } else {
                gVar6.f57506d = gVar2;
            }
            gVar.f57507e = gVar2;
            gVar.f57509g = gVar2;
        }
        this.f57488j++;
        return gVar2;
    }

    public static <K, V> LinkedListMultimap<K, V> v() {
        return new LinkedListMultimap<>();
    }

    public static <K, V> LinkedListMultimap<K, V> w(int i10) {
        return new LinkedListMultimap<>(i10);
    }

    public static <K, V> LinkedListMultimap<K, V> x(r1<? extends K, ? extends V> r1Var) {
        return new LinkedListMultimap<>(r1Var);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    @s9.a
    public /* bridge */ /* synthetic */ boolean A(r1 r1Var) {
        return super.A(r1Var);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public List<Map.Entry<K, V>> i() {
        return (List) super.i();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    public /* bridge */ /* synthetic */ boolean D0(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return super.D0(obj, obj2);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public List<V> values() {
        return (List) super.values();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    public List<V> a(Object obj) {
        List<V> listC = C(obj);
        E(obj);
        return listC;
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1, com.google.common.collect.o1
    @s9.a
    public List<V> b(@x1 K k10, Iterable<? extends V> iterable) {
        List<V> listC = C(k10);
        i iVar = new i(k10);
        Iterator<? extends V> it = iterable.iterator();
        while (iVar.hasNext() && it.hasNext()) {
            iVar.next();
            iVar.set(it.next());
        }
        while (iVar.hasNext()) {
            iVar.next();
            iVar.remove();
        }
        while (it.hasNext()) {
            iVar.add(it.next());
        }
        return listC;
    }

    @Override // com.google.common.collect.c
    Map<K, Collection<V>> c() {
        return new Multimaps.a(this);
    }

    @Override // com.google.common.collect.r1
    public void clear() {
        this.f57485g = null;
        this.f57486h = null;
        this.f57487i.clear();
        this.f57488j = 0;
        this.f57489k++;
    }

    @Override // com.google.common.collect.r1
    public boolean containsKey(@CheckForNull Object obj) {
        return this.f57487i.containsKey(obj);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    public boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1, com.google.common.collect.o1
    public /* bridge */ /* synthetic */ Map e() {
        return super.e();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1, com.google.common.collect.o1
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.c
    Set<K> f() {
        return new c();
    }

    @Override // com.google.common.collect.r1, com.google.common.collect.o1
    /* JADX INFO: renamed from: get */
    public List<V> v(@x1 K k10) {
        return new a(k10);
    }

    @Override // com.google.common.collect.c
    s1<K> h() {
        return new Multimaps.c(this);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    public boolean isEmpty() {
        return this.f57485g == null;
    }

    @Override // com.google.common.collect.c
    Iterator<Map.Entry<K, V>> k() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    public /* bridge */ /* synthetic */ s1 n0() {
        return super.n0();
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    @s9.a
    public boolean put(@x1 K k10, @x1 V v10) {
        u(k10, v10, null);
        return true;
    }

    @Override // com.google.common.collect.c, com.google.common.collect.r1
    @s9.a
    public /* bridge */ /* synthetic */ boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.r1
    public int size() {
        return this.f57488j;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.c
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public List<Map.Entry<K, V>> d() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.c
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public List<V> j() {
        return new d();
    }
}
