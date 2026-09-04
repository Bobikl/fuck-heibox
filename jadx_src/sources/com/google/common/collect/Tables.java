package com.google.common.collect;

import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public final class Tables {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.common.base.n<? extends Map<?, ?>, ? extends Map<?, ?>> f57959a = new a();

    public static final class ImmutableCell<R, C, V> extends b<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @x1
        private final R f57960b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @x1
        private final C f57961c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @x1
        private final V f57962d;

        ImmutableCell(@x1 R r10, @x1 C c10, @x1 V v10) {
            this.f57960b = r10;
            this.f57961c = c10;
            this.f57962d = v10;
        }

        @Override // com.google.common.collect.u2.a
        @x1
        public C a() {
            return this.f57961c;
        }

        @Override // com.google.common.collect.u2.a
        @x1
        public R b() {
            return this.f57960b;
        }

        @Override // com.google.common.collect.u2.a
        @x1
        public V getValue() {
            return this.f57962d;
        }
    }

    public static final class UnmodifiableRowSortedMap<R, C, V> extends UnmodifiableTable<R, C, V> implements f2<R, C, V> {
        private static final long serialVersionUID = 0;

        public UnmodifiableRowSortedMap(f2<R, ? extends C, ? extends V> f2Var) {
            super(f2Var);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.g1
        /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public f2<R, C, V> X0() {
            return (f2) super.X0();
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.g1, com.google.common.collect.u2
        public SortedMap<R, Map<C, V>> h() {
            return Collections.unmodifiableSortedMap(Maps.D0(H0().h(), Tables.j()));
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.g1, com.google.common.collect.u2
        public SortedSet<R> j() {
            return Collections.unmodifiableSortedSet(H0().j());
        }
    }

    public static class UnmodifiableTable<R, C, V> extends g1<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final u2<? extends R, ? extends C, ? extends V> f57963b;

        UnmodifiableTable(u2<? extends R, ? extends C, ? extends V> u2Var) {
            this.f57963b = (u2) com.google.common.base.w.E(u2Var);
        }

        @Override // com.google.common.collect.g1, com.google.common.collect.u2
        public Map<C, V> E0(@x1 R r10) {
            return Collections.unmodifiableMap(super.E0(r10));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.g1, com.google.common.collect.y0
        /* JADX INFO: renamed from: H0 */
        public u2<R, C, V> H0() {
            return this.f57963b;
        }

        @Override // com.google.common.collect.g1, com.google.common.collect.u2
        public Map<C, Map<R, V>> a0() {
            return Collections.unmodifiableMap(Maps.B0(super.a0(), Tables.j()));
        }

        @Override // com.google.common.collect.g1, com.google.common.collect.u2
        public Map<R, V> b0(@x1 C c10) {
            return Collections.unmodifiableMap(super.b0(c10));
        }

        @Override // com.google.common.collect.g1, com.google.common.collect.u2
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.g1, com.google.common.collect.u2
        @CheckForNull
        public V d0(@x1 R r10, @x1 C c10, @x1 V v10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.g1, com.google.common.collect.u2
        public Map<R, Map<C, V>> h() {
            return Collections.unmodifiableMap(Maps.B0(super.h(), Tables.j()));
        }

        @Override // com.google.common.collect.g1, com.google.common.collect.u2
        public Set<R> j() {
            return Collections.unmodifiableSet(super.j());
        }

        @Override // com.google.common.collect.g1, com.google.common.collect.u2
        @CheckForNull
        public V remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.g1, com.google.common.collect.u2
        public void s0(u2<? extends R, ? extends C, ? extends V> u2Var) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.g1, com.google.common.collect.u2
        public Set<u2.a<R, C, V>> v0() {
            return Collections.unmodifiableSet(super.v0());
        }

        @Override // com.google.common.collect.g1, com.google.common.collect.u2
        public Collection<V> values() {
            return Collections.unmodifiableCollection(super.values());
        }

        @Override // com.google.common.collect.g1, com.google.common.collect.u2
        public Set<C> y0() {
            return Collections.unmodifiableSet(super.y0());
        }
    }

    public class a implements com.google.common.base.n<Map<Object, Object>, Map<Object, Object>> {
        a() {
        }

        @Override // com.google.common.base.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<Object, Object> apply(Map<Object, Object> map) {
            return Collections.unmodifiableMap(map);
        }
    }

    public static abstract class b<R, C, V> implements u2.a<R, C, V> {
        b() {
        }

        @Override // com.google.common.collect.u2.a
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof u2.a)) {
                return false;
            }
            u2.a aVar = (u2.a) obj;
            return com.google.common.base.s.a(b(), aVar.b()) && com.google.common.base.s.a(a(), aVar.a()) && com.google.common.base.s.a(getValue(), aVar.getValue());
        }

        @Override // com.google.common.collect.u2.a
        public int hashCode() {
            return com.google.common.base.s.b(b(), a(), getValue());
        }

        public String toString() {
            String strValueOf = String.valueOf(b());
            String strValueOf2 = String.valueOf(a());
            String strValueOf3 = String.valueOf(getValue());
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 4 + strValueOf2.length() + strValueOf3.length());
            sb2.append("(");
            sb2.append(strValueOf);
            sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb2.append(strValueOf2);
            sb2.append(")=");
            sb2.append(strValueOf3);
            return sb2.toString();
        }
    }

    public static class c<R, C, V1, V2> extends i<R, C, V2> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final u2<R, C, V1> f57964d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final com.google.common.base.n<? super V1, V2> f57965e;

        public class a implements com.google.common.base.n<u2.a<R, C, V1>, u2.a<R, C, V2>> {
            a() {
            }

            @Override // com.google.common.base.n
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public u2.a<R, C, V2> apply(u2.a<R, C, V1> aVar) {
                return Tables.c(aVar.b(), aVar.a(), c.this.f57965e.apply(aVar.getValue()));
            }
        }

        public class b implements com.google.common.base.n<Map<C, V1>, Map<C, V2>> {
            b() {
            }

            @Override // com.google.common.base.n
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<C, V2> apply(Map<C, V1> map) {
                return Maps.B0(map, c.this.f57965e);
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.Tables$c$c, reason: collision with other inner class name */
        public class C0463c implements com.google.common.base.n<Map<R, V1>, Map<R, V2>> {
            C0463c() {
            }

            @Override // com.google.common.base.n
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<R, V2> apply(Map<R, V1> map) {
                return Maps.B0(map, c.this.f57965e);
            }
        }

        c(u2<R, C, V1> u2Var, com.google.common.base.n<? super V1, V2> nVar) {
            this.f57964d = (u2) com.google.common.base.w.E(u2Var);
            this.f57965e = (com.google.common.base.n) com.google.common.base.w.E(nVar);
        }

        @Override // com.google.common.collect.u2
        public Map<C, V2> E0(@x1 R r10) {
            return Maps.B0(this.f57964d.E0(r10), this.f57965e);
        }

        @Override // com.google.common.collect.i, com.google.common.collect.u2
        @CheckForNull
        public V2 Y(@CheckForNull Object obj, @CheckForNull Object obj2) {
            if (h0(obj, obj2)) {
                return this.f57965e.apply((Object) t1.a(this.f57964d.Y(obj, obj2)));
            }
            return null;
        }

        @Override // com.google.common.collect.i
        Iterator<u2.a<R, C, V2>> a() {
            return Iterators.c0(this.f57964d.v0().iterator(), e());
        }

        @Override // com.google.common.collect.u2
        public Map<C, Map<R, V2>> a0() {
            return Maps.B0(this.f57964d.a0(), new C0463c());
        }

        @Override // com.google.common.collect.u2
        public Map<R, V2> b0(@x1 C c10) {
            return Maps.B0(this.f57964d.b0(c10), this.f57965e);
        }

        @Override // com.google.common.collect.i
        Collection<V2> c() {
            return o.m(this.f57964d.values(), this.f57965e);
        }

        @Override // com.google.common.collect.i, com.google.common.collect.u2
        public void clear() {
            this.f57964d.clear();
        }

        @Override // com.google.common.collect.i, com.google.common.collect.u2
        @CheckForNull
        public V2 d0(@x1 R r10, @x1 C c10, @x1 V2 v10) {
            throw new UnsupportedOperationException();
        }

        com.google.common.base.n<u2.a<R, C, V1>, u2.a<R, C, V2>> e() {
            return new a();
        }

        @Override // com.google.common.collect.u2
        public Map<R, Map<C, V2>> h() {
            return Maps.B0(this.f57964d.h(), new b());
        }

        @Override // com.google.common.collect.i, com.google.common.collect.u2
        public boolean h0(@CheckForNull Object obj, @CheckForNull Object obj2) {
            return this.f57964d.h0(obj, obj2);
        }

        @Override // com.google.common.collect.i, com.google.common.collect.u2
        public Set<R> j() {
            return this.f57964d.j();
        }

        @Override // com.google.common.collect.i, com.google.common.collect.u2
        @CheckForNull
        public V2 remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
            if (h0(obj, obj2)) {
                return this.f57965e.apply((Object) t1.a(this.f57964d.remove(obj, obj2)));
            }
            return null;
        }

        @Override // com.google.common.collect.i, com.google.common.collect.u2
        public void s0(u2<? extends R, ? extends C, ? extends V2> u2Var) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.u2
        public int size() {
            return this.f57964d.size();
        }

        @Override // com.google.common.collect.i, com.google.common.collect.u2
        public Set<C> y0() {
            return this.f57964d.y0();
        }
    }

    public static class d<C, R, V> extends i<C, R, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final com.google.common.base.n<u2.a<?, ?, ?>, u2.a<?, ?, ?>> f57969e = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final u2<R, C, V> f57970d;

        public class a implements com.google.common.base.n<u2.a<?, ?, ?>, u2.a<?, ?, ?>> {
            a() {
            }

            @Override // com.google.common.base.n
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public u2.a<?, ?, ?> apply(u2.a<?, ?, ?> aVar) {
                return Tables.c(aVar.a(), aVar.b(), aVar.getValue());
            }
        }

        d(u2<R, C, V> u2Var) {
            this.f57970d = (u2) com.google.common.base.w.E(u2Var);
        }

        @Override // com.google.common.collect.i, com.google.common.collect.u2
        public boolean A0(@CheckForNull Object obj) {
            return this.f57970d.Z(obj);
        }

        @Override // com.google.common.collect.u2
        public Map<R, V> E0(@x1 C c10) {
            return this.f57970d.b0(c10);
        }

        @Override // com.google.common.collect.i, com.google.common.collect.u2
        @CheckForNull
        public V Y(@CheckForNull Object obj, @CheckForNull Object obj2) {
            return this.f57970d.Y(obj2, obj);
        }

        @Override // com.google.common.collect.i, com.google.common.collect.u2
        public boolean Z(@CheckForNull Object obj) {
            return this.f57970d.A0(obj);
        }

        @Override // com.google.common.collect.i
        Iterator<u2.a<C, R, V>> a() {
            return Iterators.c0(this.f57970d.v0().iterator(), f57969e);
        }

        @Override // com.google.common.collect.u2
        public Map<R, Map<C, V>> a0() {
            return this.f57970d.h();
        }

        @Override // com.google.common.collect.u2
        public Map<C, V> b0(@x1 R r10) {
            return this.f57970d.E0(r10);
        }

        @Override // com.google.common.collect.i, com.google.common.collect.u2
        public void clear() {
            this.f57970d.clear();
        }

        @Override // com.google.common.collect.i, com.google.common.collect.u2
        public boolean containsValue(@CheckForNull Object obj) {
            return this.f57970d.containsValue(obj);
        }

        @Override // com.google.common.collect.i, com.google.common.collect.u2
        @CheckForNull
        public V d0(@x1 C c10, @x1 R r10, @x1 V v10) {
            return this.f57970d.d0(r10, c10, v10);
        }

        @Override // com.google.common.collect.u2
        public Map<C, Map<R, V>> h() {
            return this.f57970d.a0();
        }

        @Override // com.google.common.collect.i, com.google.common.collect.u2
        public boolean h0(@CheckForNull Object obj, @CheckForNull Object obj2) {
            return this.f57970d.h0(obj2, obj);
        }

        @Override // com.google.common.collect.i, com.google.common.collect.u2
        public Set<C> j() {
            return this.f57970d.y0();
        }

        @Override // com.google.common.collect.i, com.google.common.collect.u2
        @CheckForNull
        public V remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
            return this.f57970d.remove(obj2, obj);
        }

        @Override // com.google.common.collect.i, com.google.common.collect.u2
        public void s0(u2<? extends C, ? extends R, ? extends V> u2Var) {
            this.f57970d.s0(Tables.g(u2Var));
        }

        @Override // com.google.common.collect.u2
        public int size() {
            return this.f57970d.size();
        }

        @Override // com.google.common.collect.i, com.google.common.collect.u2
        public Collection<V> values() {
            return this.f57970d.values();
        }

        @Override // com.google.common.collect.i, com.google.common.collect.u2
        public Set<R> y0() {
            return this.f57970d.j();
        }
    }

    private Tables() {
    }

    static boolean b(u2<?, ?, ?> u2Var, @CheckForNull Object obj) {
        if (obj == u2Var) {
            return true;
        }
        if (obj instanceof u2) {
            return u2Var.v0().equals(((u2) obj).v0());
        }
        return false;
    }

    public static <R, C, V> u2.a<R, C, V> c(@x1 R r10, @x1 C c10, @x1 V v10) {
        return new ImmutableCell(r10, c10, v10);
    }

    @o9.a
    public static <R, C, V> u2<R, C, V> d(Map<R, Map<C, V>> map, com.google.common.base.c0<? extends Map<C, V>> c0Var) {
        com.google.common.base.w.d(map.isEmpty());
        com.google.common.base.w.E(c0Var);
        return new StandardTable(map, c0Var);
    }

    public static <R, C, V> u2<R, C, V> e(u2<R, C, V> u2Var) {
        return Synchronized.z(u2Var, null);
    }

    @o9.a
    public static <R, C, V1, V2> u2<R, C, V2> f(u2<R, C, V1> u2Var, com.google.common.base.n<? super V1, V2> nVar) {
        return new c(u2Var, nVar);
    }

    public static <R, C, V> u2<C, R, V> g(u2<R, C, V> u2Var) {
        return u2Var instanceof d ? ((d) u2Var).f57970d : new d(u2Var);
    }

    @o9.a
    public static <R, C, V> f2<R, C, V> h(f2<R, ? extends C, ? extends V> f2Var) {
        return new UnmodifiableRowSortedMap(f2Var);
    }

    public static <R, C, V> u2<R, C, V> i(u2<? extends R, ? extends C, ? extends V> u2Var) {
        return new UnmodifiableTable(u2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> com.google.common.base.n<Map<K, V>, Map<K, V>> j() {
        return (com.google.common.base.n<Map<K, V>, Map<K, V>>) f57959a;
    }
}
