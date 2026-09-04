package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import org.apache.tools.ant.taskdefs.a6;

/* JADX INFO: loaded from: classes7.dex */
@o9.b
@u
public abstract class ImmutableTable<R, C, V> extends i<R, C, V> implements Serializable {

    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object[] f57420b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object[] f57421c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object[] f57422d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f57423e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[] f57424f;

        private SerializedForm(Object[] objArr, Object[] objArr2, Object[] objArr3, int[] iArr, int[] iArr2) {
            this.f57420b = objArr;
            this.f57421c = objArr2;
            this.f57422d = objArr3;
            this.f57423e = iArr;
            this.f57424f = iArr2;
        }

        static SerializedForm a(ImmutableTable<?, ?, ?> immutableTable, int[] iArr, int[] iArr2) {
            return new SerializedForm(immutableTable.j().toArray(), immutableTable.y0().toArray(), immutableTable.values().toArray(), iArr, iArr2);
        }

        Object b() {
            Object[] objArr = this.f57422d;
            if (objArr.length == 0) {
                return ImmutableTable.s();
            }
            int i10 = 0;
            if (objArr.length == 1) {
                return ImmutableTable.t(this.f57420b[0], this.f57421c[0], objArr[0]);
            }
            ImmutableList.a aVar = new ImmutableList.a(objArr.length);
            while (true) {
                Object[] objArr2 = this.f57422d;
                if (i10 >= objArr2.length) {
                    return RegularImmutableTable.E(aVar.e(), ImmutableSet.y(this.f57420b), ImmutableSet.y(this.f57421c));
                }
                aVar.a(ImmutableTable.g(this.f57420b[this.f57423e[i10]], this.f57421c[this.f57424f[i10]], objArr2[i10]));
                i10++;
            }
        }
    }

    @s9.f
    public static final class a<R, C, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<u2.a<R, C, V>> f57425a = Lists.q();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        private Comparator<? super R> f57426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        private Comparator<? super C> f57427c;

        public ImmutableTable<R, C, V> a() {
            return b();
        }

        public ImmutableTable<R, C, V> b() {
            int size = this.f57425a.size();
            if (size != 0) {
                return size != 1 ? RegularImmutableTable.C(this.f57425a, this.f57426b, this.f57427c) : new SingletonImmutableTable((u2.a) l1.z(this.f57425a));
            }
            return ImmutableTable.s();
        }

        @s9.a
        a<R, C, V> c(a<R, C, V> aVar) {
            this.f57425a.addAll(aVar.f57425a);
            return this;
        }

        @s9.a
        public a<R, C, V> d(Comparator<? super C> comparator) {
            this.f57427c = (Comparator) com.google.common.base.w.F(comparator, "columnComparator");
            return this;
        }

        @s9.a
        public a<R, C, V> e(Comparator<? super R> comparator) {
            this.f57426b = (Comparator) com.google.common.base.w.F(comparator, "rowComparator");
            return this;
        }

        @s9.a
        public a<R, C, V> f(u2.a<? extends R, ? extends C, ? extends V> aVar) {
            if (aVar instanceof Tables.ImmutableCell) {
                com.google.common.base.w.F(aVar.b(), a6.a.f133725d);
                com.google.common.base.w.F(aVar.a(), "column");
                com.google.common.base.w.F(aVar.getValue(), "value");
                this.f57425a.add(aVar);
            } else {
                g(aVar.b(), aVar.a(), aVar.getValue());
            }
            return this;
        }

        @s9.a
        public a<R, C, V> g(R r10, C c10, V v10) {
            this.f57425a.add(ImmutableTable.g(r10, c10, v10));
            return this;
        }

        @s9.a
        public a<R, C, V> h(u2<? extends R, ? extends C, ? extends V> u2Var) {
            Iterator<u2.a<? extends R, ? extends C, ? extends V>> it = u2Var.v0().iterator();
            while (it.hasNext()) {
                f(it.next());
            }
            return this;
        }
    }

    ImmutableTable() {
    }

    public static <R, C, V> a<R, C, V> e() {
        return new a<>();
    }

    static <R, C, V> u2.a<R, C, V> g(R r10, C c10, V v10) {
        return Tables.c(com.google.common.base.w.F(r10, "rowKey"), com.google.common.base.w.F(c10, "columnKey"), com.google.common.base.w.F(v10, "value"));
    }

    public static <R, C, V> ImmutableTable<R, C, V> n(u2<? extends R, ? extends C, ? extends V> u2Var) {
        return u2Var instanceof ImmutableTable ? (ImmutableTable) u2Var : o(u2Var.v0());
    }

    static <R, C, V> ImmutableTable<R, C, V> o(Iterable<? extends u2.a<? extends R, ? extends C, ? extends V>> iterable) {
        a aVarE = e();
        Iterator<? extends u2.a<? extends R, ? extends C, ? extends V>> it = iterable.iterator();
        while (it.hasNext()) {
            aVarE.f(it.next());
        }
        return aVarE.a();
    }

    public static <R, C, V> ImmutableTable<R, C, V> s() {
        return (ImmutableTable<R, C, V>) SparseImmutableTable.f57889h;
    }

    public static <R, C, V> ImmutableTable<R, C, V> t(R r10, C c10, V v10) {
        return new SingletonImmutableTable(r10, c10, v10);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ boolean A0(@CheckForNull Object obj) {
        return super.A0(obj);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    @CheckForNull
    public /* bridge */ /* synthetic */ Object Y(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return super.Y(obj, obj2);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ boolean Z(@CheckForNull Object obj) {
        return super.Z(obj);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    public boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    @Override // com.google.common.collect.i
    final Iterator<V> d() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    @s9.a
    @CheckForNull
    @Deprecated
    @s9.e("Always throws UnsupportedOperationException")
    public final V d0(R r10, C c10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.i
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final b3<u2.a<R, C, V>> a() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    public boolean h0(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return Y(obj, obj2) != null;
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<u2.a<R, C, V>> v0() {
        return (ImmutableSet) super.v0();
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.u2
    /* JADX INFO: renamed from: k */
    public ImmutableMap<R, V> b0(C c10) {
        com.google.common.base.w.F(c10, "columnKey");
        return (ImmutableMap) com.google.common.base.q.a((ImmutableMap) a0().get(c10), ImmutableMap.v());
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<C> y0() {
        return a0().keySet();
    }

    @Override // com.google.common.collect.u2
    /* JADX INFO: renamed from: m */
    public abstract ImmutableMap<C, Map<R, V>> a0();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.i
    /* JADX INFO: renamed from: p */
    public abstract ImmutableSet<u2.a<R, C, V>> b();

    abstract SerializedForm q();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.i
    /* JADX INFO: renamed from: r */
    public abstract ImmutableCollection<V> c();

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    @s9.a
    @CheckForNull
    @Deprecated
    @s9.e("Always throws UnsupportedOperationException")
    public final V remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void s0(u2<? extends R, ? extends C, ? extends V> u2Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.i
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.u2
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public ImmutableMap<C, V> E0(R r10) {
        com.google.common.base.w.F(r10, "rowKey");
        return (ImmutableMap) com.google.common.base.q.a((ImmutableMap) h().get(r10), ImmutableMap.v());
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<R> j() {
        return h().keySet();
    }

    @Override // com.google.common.collect.u2
    /* JADX INFO: renamed from: w */
    public abstract ImmutableMap<R, Map<C, V>> h();

    @Override // com.google.common.collect.i, com.google.common.collect.u2
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection<V> values() {
        return (ImmutableCollection) super.values();
    }

    final Object y() {
        return q();
    }
}
