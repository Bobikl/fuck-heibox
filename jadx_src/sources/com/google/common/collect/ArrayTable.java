package com.google.common.collect;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.a
@o9.b(emulated = true)
@u
public final class ArrayTable<R, C, V> extends i<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ImmutableList<R> f57077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ImmutableList<C> f57078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ImmutableMap<R, Integer> f57079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ImmutableMap<C, Integer> f57080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final V[][] f57081h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @CheckForNull
    private transient ArrayTable<R, C, V>.f f57082i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @CheckForNull
    private transient ArrayTable<R, C, V>.h f57083j;

    public class a extends com.google.common.collect.a<u2.a<R, C, V>> {
        a(int i10) {
            super(i10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public u2.a<R, C, V> a(int i10) {
            return ArrayTable.this.t(i10);
        }
    }

    public class b extends Tables.b<R, C, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f57085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f57086c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f57087d;

        b(int i10) {
            this.f57087d = i10;
            this.f57085b = i10 / ArrayTable.this.f57078e.size();
            this.f57086c = i10 % ArrayTable.this.f57078e.size();
        }

        @Override // com.google.common.collect.u2.a
        public C a() {
            return (C) ArrayTable.this.f57078e.get(this.f57086c);
        }

        @Override // com.google.common.collect.u2.a
        public R b() {
            return (R) ArrayTable.this.f57077d.get(this.f57085b);
        }

        @Override // com.google.common.collect.u2.a
        @CheckForNull
        public V getValue() {
            return (V) ArrayTable.this.m(this.f57085b, this.f57086c);
        }
    }

    public class c extends com.google.common.collect.a<V> {
        c(int i10) {
            super(i10);
        }

        @Override // com.google.common.collect.a
        @CheckForNull
        protected V a(int i10) {
            return (V) ArrayTable.this.u(i10);
        }
    }

    public static abstract class d<K, V> extends Maps.y<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ImmutableMap<K, Integer> f57090b;

        public class a extends com.google.common.collect.b<K, V> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f57091b;

            a(int i10) {
                this.f57091b = i10;
            }

            @Override // com.google.common.collect.b, java.util.Map.Entry
            public K getKey() {
                return (K) d.this.c(this.f57091b);
            }

            @Override // com.google.common.collect.b, java.util.Map.Entry
            @x1
            public V getValue() {
                return (V) d.this.e(this.f57091b);
            }

            @Override // com.google.common.collect.b, java.util.Map.Entry
            @x1
            public V setValue(@x1 V v10) {
                return (V) d.this.f(this.f57091b, v10);
            }
        }

        public class b extends com.google.common.collect.a<Map.Entry<K, V>> {
            b(int i10) {
                super(i10);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> a(int i10) {
                return d.this.b(i10);
            }
        }

        private d(ImmutableMap<K, Integer> immutableMap) {
            this.f57090b = immutableMap;
        }

        /* synthetic */ d(ImmutableMap immutableMap, a aVar) {
            this(immutableMap);
        }

        @Override // com.google.common.collect.Maps.y
        Iterator<Map.Entry<K, V>> a() {
            return new b(size());
        }

        Map.Entry<K, V> b(int i10) {
            com.google.common.base.w.C(i10, size());
            return new a(i10);
        }

        K c(int i10) {
            return this.f57090b.keySet().a().get(i10);
        }

        @Override // com.google.common.collect.Maps.y, java.util.AbstractMap, java.util.Map
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return this.f57090b.containsKey(obj);
        }

        abstract String d();

        @x1
        abstract V e(int i10);

        @x1
        abstract V f(int i10, @x1 V v10);

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V get(@CheckForNull Object obj) {
            Integer num = this.f57090b.get(obj);
            if (num == null) {
                return null;
            }
            return e(num.intValue());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f57090b.isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.f57090b.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V put(K k10, @x1 V v10) {
            Integer num = this.f57090b.get(k10);
            if (num != null) {
                return f(num.intValue(), v10);
            }
            String strD = d();
            String strValueOf = String.valueOf(k10);
            String strValueOf2 = String.valueOf(this.f57090b.keySet());
            StringBuilder sb2 = new StringBuilder(String.valueOf(strD).length() + 9 + strValueOf.length() + strValueOf2.length());
            sb2.append(strD);
            sb2.append(" ");
            sb2.append(strValueOf);
            sb2.append(" not in ");
            sb2.append(strValueOf2);
            throw new IllegalArgumentException(sb2.toString());
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V remove(@CheckForNull Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Maps.y, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f57090b.size();
        }
    }

    public class e extends d<R, V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f57094c;

        e(int i10) {
            super(ArrayTable.this.f57079f, null);
            this.f57094c = i10;
        }

        @Override // com.google.common.collect.ArrayTable.d
        String d() {
            return "Row";
        }

        @Override // com.google.common.collect.ArrayTable.d
        @CheckForNull
        V e(int i10) {
            return (V) ArrayTable.this.m(i10, this.f57094c);
        }

        @Override // com.google.common.collect.ArrayTable.d
        @CheckForNull
        V f(int i10, @CheckForNull V v10) {
            return (V) ArrayTable.this.x(i10, this.f57094c, v10);
        }
    }

    public class f extends d<C, Map<R, V>> {
        private f() {
            super(ArrayTable.this.f57080g, null);
        }

        /* synthetic */ f(ArrayTable arrayTable, a aVar) {
            this();
        }

        @Override // com.google.common.collect.ArrayTable.d
        String d() {
            return "Column";
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ArrayTable.d
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Map<R, V> e(int i10) {
            return new e(i10);
        }

        @Override // com.google.common.collect.ArrayTable.d, java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Map<R, V> put(C c10, Map<R, V> map) {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ArrayTable.d
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Map<R, V> f(int i10, Map<R, V> map) {
            throw new UnsupportedOperationException();
        }
    }

    public class g extends d<C, V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f57097c;

        g(int i10) {
            super(ArrayTable.this.f57080g, null);
            this.f57097c = i10;
        }

        @Override // com.google.common.collect.ArrayTable.d
        String d() {
            return "Column";
        }

        @Override // com.google.common.collect.ArrayTable.d
        @CheckForNull
        V e(int i10) {
            return (V) ArrayTable.this.m(this.f57097c, i10);
        }

        @Override // com.google.common.collect.ArrayTable.d
        @CheckForNull
        V f(int i10, @CheckForNull V v10) {
            return (V) ArrayTable.this.x(this.f57097c, i10, v10);
        }
    }

    public class h extends d<R, Map<C, V>> {
        private h() {
            super(ArrayTable.this.f57079f, null);
        }

        /* synthetic */ h(ArrayTable arrayTable, a aVar) {
            this();
        }

        @Override // com.google.common.collect.ArrayTable.d
        String d() {
            return "Row";
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ArrayTable.d
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Map<C, V> e(int i10) {
            return new g(i10);
        }

        @Override // com.google.common.collect.ArrayTable.d, java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Map<C, V> put(R r10, Map<C, V> map) {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ArrayTable.d
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Map<C, V> f(int i10, Map<C, V> map) {
            throw new UnsupportedOperationException();
        }
    }

    private ArrayTable(ArrayTable<R, C, V> arrayTable) {
        ImmutableList<R> immutableList = arrayTable.f57077d;
        this.f57077d = immutableList;
        ImmutableList<C> immutableList2 = arrayTable.f57078e;
        this.f57078e = immutableList2;
        this.f57079f = arrayTable.f57079f;
        this.f57080g = arrayTable.f57080g;
        V[][] vArr = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, immutableList.size(), immutableList2.size()));
        this.f57081h = vArr;
        for (int i10 = 0; i10 < this.f57077d.size(); i10++) {
            V[] vArr2 = arrayTable.f57081h[i10];
            System.arraycopy(vArr2, 0, vArr[i10], 0, vArr2.length);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ArrayTable(u2<R, C, ? extends V> u2Var) {
        this(u2Var.j(), u2Var.y0());
        s0(u2Var);
    }

    private ArrayTable(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        ImmutableList<R> immutableListU = ImmutableList.u(iterable);
        this.f57077d = immutableListU;
        ImmutableList<C> immutableListU2 = ImmutableList.u(iterable2);
        this.f57078e = immutableListU2;
        com.google.common.base.w.d(immutableListU.isEmpty() == immutableListU2.isEmpty());
        this.f57079f = Maps.Q(immutableListU);
        this.f57080g = Maps.Q(immutableListU2);
        this.f57081h = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, immutableListU.size(), immutableListU2.size()));
        s();
    }

    public static <R, C, V> ArrayTable<R, C, V> p(u2<R, C, ? extends V> u2Var) {
        return u2Var instanceof ArrayTable ? new ArrayTable<>((ArrayTable) u2Var) : new ArrayTable<>(u2Var);
    }

    public static <R, C, V> ArrayTable<R, C, V> q(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        return new ArrayTable<>(iterable, iterable2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public u2.a<R, C, V> t(int i10) {
        return new b(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CheckForNull
    public V u(int i10) {
        return m(i10 / this.f57078e.size(), i10 % this.f57078e.size());
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    public boolean A0(@CheckForNull Object obj) {
        return this.f57079f.containsKey(obj);
    }

    @Override // com.google.common.collect.u2
    public Map<C, V> E0(R r10) {
        com.google.common.base.w.E(r10);
        Integer num = this.f57079f.get(r10);
        return num == null ? Collections.emptyMap() : new g(num.intValue());
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    @CheckForNull
    public V Y(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Integer num = this.f57079f.get(obj);
        Integer num2 = this.f57080g.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return m(num.intValue(), num2.intValue());
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    public boolean Z(@CheckForNull Object obj) {
        return this.f57080g.containsKey(obj);
    }

    @Override // com.google.common.collect.i
    Iterator<u2.a<R, C, V>> a() {
        return new a(size());
    }

    @Override // com.google.common.collect.u2
    public Map<C, Map<R, V>> a0() {
        ArrayTable<R, C, V>.f fVar = this.f57082i;
        if (fVar != null) {
            return fVar;
        }
        ArrayTable<R, C, V>.f fVar2 = new f(this, null);
        this.f57082i = fVar2;
        return fVar2;
    }

    @Override // com.google.common.collect.u2
    public Map<R, V> b0(C c10) {
        com.google.common.base.w.E(c10);
        Integer num = this.f57080g.get(c10);
        return num == null ? Collections.emptyMap() : new e(num.intValue());
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    public boolean containsValue(@CheckForNull Object obj) {
        for (V[] vArr : this.f57081h) {
            for (V v10 : vArr) {
                if (com.google.common.base.s.a(obj, v10)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.i
    Iterator<V> d() {
        return new c(size());
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    @s9.a
    @CheckForNull
    public V d0(R r10, C c10, @CheckForNull V v10) {
        com.google.common.base.w.E(r10);
        com.google.common.base.w.E(c10);
        Integer num = this.f57079f.get(r10);
        com.google.common.base.w.y(num != null, "Row %s not in %s", r10, this.f57077d);
        Integer num2 = this.f57080g.get(c10);
        com.google.common.base.w.y(num2 != null, "Column %s not in %s", c10, this.f57078e);
        return x(num.intValue(), num2.intValue(), v10);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.u2
    public Map<R, Map<C, V>> h() {
        ArrayTable<R, C, V>.h hVar = this.f57083j;
        if (hVar != null) {
            return hVar;
        }
        ArrayTable<R, C, V>.h hVar2 = new h(this, null);
        this.f57083j = hVar2;
        return hVar2;
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    public boolean h0(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return A0(obj) && Z(obj2);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    public boolean isEmpty() {
        return this.f57077d.isEmpty() || this.f57078e.isEmpty();
    }

    @CheckForNull
    public V m(int i10, int i11) {
        com.google.common.base.w.C(i10, this.f57077d.size());
        com.google.common.base.w.C(i11, this.f57078e.size());
        return this.f57081h[i10][i11];
    }

    public ImmutableList<C> n() {
        return this.f57078e;
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<C> y0() {
        return this.f57080g.keySet();
    }

    @s9.a
    @CheckForNull
    public V r(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Integer num = this.f57079f.get(obj);
        Integer num2 = this.f57080g.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return x(num.intValue(), num2.intValue(), null);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    @s9.a
    @CheckForNull
    @Deprecated
    @s9.e("Always throws UnsupportedOperationException")
    public V remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        throw new UnsupportedOperationException();
    }

    public void s() {
        for (V[] vArr : this.f57081h) {
            Arrays.fill(vArr, (Object) null);
        }
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    public void s0(u2<? extends R, ? extends C, ? extends V> u2Var) {
        super.s0(u2Var);
    }

    @Override // com.google.common.collect.u2
    public int size() {
        return this.f57077d.size() * this.f57078e.size();
    }

    @Override // com.google.common.collect.i
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public ImmutableList<R> v() {
        return this.f57077d;
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
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<R> j() {
        return this.f57079f.keySet();
    }

    @s9.a
    @CheckForNull
    public V x(int i10, int i11, @CheckForNull V v10) {
        com.google.common.base.w.C(i10, this.f57077d.size());
        com.google.common.base.w.C(i11, this.f57078e.size());
        V[] vArr = this.f57081h[i10];
        V v11 = vArr[i11];
        vArr[i11] = v10;
        return v11;
    }

    @o9.c
    public V[][] y(Class<V> cls) {
        V[][] vArr = (V[][]) ((Object[][]) Array.newInstance((Class<?>) cls, this.f57077d.size(), this.f57078e.size()));
        for (int i10 = 0; i10 < this.f57077d.size(); i10++) {
            V[] vArr2 = this.f57081h[i10];
            System.arraycopy(vArr2, 0, vArr[i10], 0, vArr2.length);
        }
        return vArr;
    }
}
