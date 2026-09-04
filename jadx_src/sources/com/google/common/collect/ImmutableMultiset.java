package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true, serializable = true)
@u
public abstract class ImmutableMultiset<E> extends ImmutableMultisetGwtSerializationDependencies<E> implements s1<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    @t9.b
    private transient ImmutableList<E> f57336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @CheckForNull
    @t9.b
    private transient ImmutableSet<s1.a<E>> f57337d;

    public final class EntrySet extends IndexedImmutableSet<s1.a<E>> {
        private static final long serialVersionUID = 0;

        private EntrySet() {
        }

        /* synthetic */ EntrySet(ImmutableMultiset immutableMultiset, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.IndexedImmutableSet
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public s1.a<E> get(int i10) {
            return ImmutableMultiset.this.y(i10);
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof s1.a)) {
                return false;
            }
            s1.a aVar = (s1.a) obj;
            return aVar.getCount() > 0 && ImmutableMultiset.this.E1(aVar.a()) == aVar.getCount();
        }

        @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return ImmutableMultiset.this.hashCode();
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean i() {
            return ImmutableMultiset.this.i();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @o9.c
        Object l() {
            return new EntrySetSerializedForm(ImmutableMultiset.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ImmutableMultiset.this.c().size();
        }
    }

    @o9.c
    public static class EntrySetSerializedForm<E> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ImmutableMultiset<E> f57339b;

        EntrySetSerializedForm(ImmutableMultiset<E> immutableMultiset) {
            this.f57339b = immutableMultiset;
        }

        Object a() {
            return this.f57339b.entrySet();
        }
    }

    public class a extends b3<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f57340b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        E f57341c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Iterator f57342d;

        a(ImmutableMultiset immutableMultiset, Iterator it) {
            this.f57342d = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f57340b > 0 || this.f57342d.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            if (this.f57340b <= 0) {
                s1.a aVar = (s1.a) this.f57342d.next();
                this.f57341c = (E) aVar.a();
                this.f57340b = aVar.getCount();
            }
            this.f57340b--;
            E e10 = this.f57341c;
            Objects.requireNonNull(e10);
            return e10;
        }
    }

    public static class b<E> extends ImmutableCollection.b<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        v1<E> f57343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f57344c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f57345d;

        public b() {
            this(4);
        }

        b(int i10) {
            this.f57344c = false;
            this.f57345d = false;
            this.f57343b = v1.d(i10);
        }

        b(boolean z10) {
            this.f57344c = false;
            this.f57345d = false;
            this.f57343b = null;
        }

        @CheckForNull
        static <T> v1<T> n(Iterable<T> iterable) {
            if (iterable instanceof RegularImmutableMultiset) {
                return ((RegularImmutableMultiset) iterable).f57820e;
            }
            if (iterable instanceof AbstractMapBasedMultiset) {
                return ((AbstractMapBasedMultiset) iterable).f57066d;
            }
            return null;
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        @s9.a
        public b<E> g(E e10) {
            return k(e10, 1);
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        @s9.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public b<E> b(E... eArr) {
            super.b(eArr);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection.b
        @s9.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public b<E> c(Iterable<? extends E> iterable) {
            Objects.requireNonNull(this.f57343b);
            if (iterable instanceof s1) {
                s1 s1VarD = Multisets.d(iterable);
                v1 v1VarN = n(s1VarD);
                if (v1VarN != null) {
                    v1<E> v1Var = this.f57343b;
                    v1Var.e(Math.max(v1Var.D(), v1VarN.D()));
                    for (int iF = v1VarN.f(); iF >= 0; iF = v1VarN.t(iF)) {
                        k(v1VarN.j(iF), v1VarN.l(iF));
                    }
                } else {
                    Set<s1.a<E>> setEntrySet = s1VarD.entrySet();
                    v1<E> v1Var2 = this.f57343b;
                    v1Var2.e(Math.max(v1Var2.D(), setEntrySet.size()));
                    for (s1.a<E> aVar : s1VarD.entrySet()) {
                        k(aVar.a(), aVar.getCount());
                    }
                }
            } else {
                super.c(iterable);
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        @s9.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public b<E> d(Iterator<? extends E> it) {
            super.d(it);
            return this;
        }

        @s9.a
        public b<E> k(E e10, int i10) {
            Objects.requireNonNull(this.f57343b);
            if (i10 == 0) {
                return this;
            }
            if (this.f57344c) {
                this.f57343b = new v1<>(this.f57343b);
                this.f57345d = false;
            }
            this.f57344c = false;
            com.google.common.base.w.E(e10);
            v1<E> v1Var = this.f57343b;
            v1Var.v(e10, i10 + v1Var.g(e10));
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public ImmutableMultiset<E> e() {
            Objects.requireNonNull(this.f57343b);
            if (this.f57343b.D() == 0) {
                return ImmutableMultiset.A();
            }
            if (this.f57345d) {
                this.f57343b = new v1<>(this.f57343b);
                this.f57345d = false;
            }
            this.f57344c = true;
            return new RegularImmutableMultiset(this.f57343b);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @s9.a
        public b<E> m(E e10, int i10) {
            Objects.requireNonNull(this.f57343b);
            if (i10 == 0 && !this.f57345d) {
                this.f57343b = new w1(this.f57343b);
                this.f57345d = true;
            } else if (this.f57344c) {
                this.f57343b = new v1<>(this.f57343b);
                this.f57345d = false;
            }
            this.f57344c = false;
            com.google.common.base.w.E(e10);
            if (i10 == 0) {
                this.f57343b.w(e10);
            } else {
                this.f57343b.v((E) com.google.common.base.w.E(e10), i10);
            }
            return this;
        }
    }

    ImmutableMultiset() {
    }

    public static <E> ImmutableMultiset<E> A() {
        return RegularImmutableMultiset.f57819h;
    }

    public static <E> ImmutableMultiset<E> B(E e10) {
        return o(e10);
    }

    public static <E> ImmutableMultiset<E> D(E e10, E e11) {
        return o(e10, e11);
    }

    public static <E> ImmutableMultiset<E> E(E e10, E e11, E e12) {
        return o(e10, e11, e12);
    }

    public static <E> ImmutableMultiset<E> F(E e10, E e11, E e12, E e13) {
        return o(e10, e11, e12, e13);
    }

    public static <E> ImmutableMultiset<E> G(E e10, E e11, E e12, E e13, E e14) {
        return o(e10, e11, e12, e13, e14);
    }

    public static <E> ImmutableMultiset<E> H(E e10, E e11, E e12, E e13, E e14, E e15, E... eArr) {
        return new b().g(e10).g(e11).g(e12).g(e13).g(e14).g(e15).b(eArr).e();
    }

    public static <E> b<E> m() {
        return new b<>();
    }

    private static <E> ImmutableMultiset<E> o(E... eArr) {
        return new b().b(eArr).e();
    }

    static <E> ImmutableMultiset<E> q(Collection<? extends s1.a<? extends E>> collection) {
        b bVar = new b(collection.size());
        for (s1.a<? extends E> aVar : collection) {
            bVar.k(aVar.a(), aVar.getCount());
        }
        return bVar.e();
    }

    public static <E> ImmutableMultiset<E> s(Iterable<? extends E> iterable) {
        if (iterable instanceof ImmutableMultiset) {
            ImmutableMultiset<E> immutableMultiset = (ImmutableMultiset) iterable;
            if (!immutableMultiset.i()) {
                return immutableMultiset;
            }
        }
        b bVar = new b(Multisets.l(iterable));
        bVar.c(iterable);
        return bVar.e();
    }

    public static <E> ImmutableMultiset<E> t(Iterator<? extends E> it) {
        return new b().d(it).e();
    }

    public static <E> ImmutableMultiset<E> u(E[] eArr) {
        return o(eArr);
    }

    private ImmutableSet<s1.a<E>> v() {
        return isEmpty() ? ImmutableSet.D() : new EntrySet(this, null);
    }

    @Override // com.google.common.collect.s1
    @s9.a
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final int I0(E e10, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> a() {
        ImmutableList<E> immutableList = this.f57336c;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> immutableListA = super.a();
        this.f57336c = immutableListA;
        return immutableListA;
    }

    @Override // com.google.common.collect.ImmutableCollection
    @o9.c
    int b(Object[] objArr, int i10) {
        b3<s1.a<E>> it = entrySet().iterator();
        while (it.hasNext()) {
            s1.a<E> next = it.next();
            Arrays.fill(objArr, i10, next.getCount() + i10, next.a());
            i10 += next.getCount();
        }
        return i10;
    }

    @Override // com.google.common.collect.s1
    @s9.a
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final int c0(E e10, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return E1(obj) > 0;
    }

    @Override // java.util.Collection, com.google.common.collect.s1
    public boolean equals(@CheckForNull Object obj) {
        return Multisets.i(this, obj);
    }

    @Override // com.google.common.collect.s1
    @s9.a
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean g0(E e10, int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, com.google.common.collect.s1
    public int hashCode() {
        return Sets.k(entrySet());
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.j2
    /* JADX INFO: renamed from: j */
    public b3<E> iterator() {
        return new a(this, entrySet().iterator());
    }

    @Override // com.google.common.collect.ImmutableCollection
    @o9.c
    abstract Object l();

    @Override // com.google.common.collect.s1
    @s9.a
    @s9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final int n1(@CheckForNull Object obj, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, com.google.common.collect.s1
    public String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.s1
    /* JADX INFO: renamed from: w */
    public abstract ImmutableSet<E> c();

    @Override // com.google.common.collect.s1
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<s1.a<E>> entrySet() {
        ImmutableSet<s1.a<E>> immutableSet = this.f57337d;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<s1.a<E>> immutableSetV = v();
        this.f57337d = immutableSetV;
        return immutableSetV;
    }

    abstract s1.a<E> y(int i10);
}
