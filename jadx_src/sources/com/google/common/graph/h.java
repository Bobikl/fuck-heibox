package com.google.common.graph;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: AbstractNetwork.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.a
@t
public abstract class h<N, E> implements s0<N, E> {

    /* JADX INFO: compiled from: AbstractNetwork.java */
    public class a extends f<N> {

        /* JADX INFO: renamed from: com.google.common.graph.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AbstractNetwork.java */
        public class C0475a extends AbstractSet<u<N>> {

            /* JADX INFO: renamed from: com.google.common.graph.h$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: AbstractNetwork.java */
            public class C0476a implements com.google.common.base.n<E, u<N>> {
                C0476a() {
                }

                @Override // com.google.common.base.n
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public u<N> apply(E e10) {
                    return h.this.I(e10);
                }
            }

            C0475a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                if (!(obj instanceof u)) {
                    return false;
                }
                u<?> uVar = (u) obj;
                return a.this.O(uVar) && a.this.e().contains(uVar.g()) && a.this.a(uVar.g()).contains(uVar.h());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<u<N>> iterator() {
                return Iterators.c0(h.this.g().iterator(), new C0476a());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return h.this.g().size();
            }
        }

        a() {
        }

        @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.c1, com.google.common.graph.a0
        public Set<N> a(N n10) {
            return h.this.a((Object) n10);
        }

        @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.w0, com.google.common.graph.a0
        public Set<N> b(N n10) {
            return h.this.b((Object) n10);
        }

        @Override // com.google.common.graph.l
        public boolean c() {
            return h.this.c();
        }

        @Override // com.google.common.graph.l
        public Set<N> d(N n10) {
            return h.this.d(n10);
        }

        @Override // com.google.common.graph.l
        public Set<N> e() {
            return h.this.e();
        }

        @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l
        public Set<u<N>> g() {
            return h.this.B() ? super.g() : new C0475a();
        }

        @Override // com.google.common.graph.l
        public ElementOrder<N> k() {
            return h.this.k();
        }

        @Override // com.google.common.graph.l
        public boolean m() {
            return h.this.m();
        }

        @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l
        public ElementOrder<N> q() {
            return ElementOrder.i();
        }
    }

    /* JADX INFO: compiled from: AbstractNetwork.java */
    public class b implements com.google.common.base.x<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f58385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f58386c;

        b(Object obj, Object obj2) {
            this.f58385b = obj;
            this.f58386c = obj2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.base.x
        public boolean apply(E e10) {
            return h.this.I(e10).a(this.f58385b).equals(this.f58386c);
        }
    }

    /* JADX INFO: compiled from: AbstractNetwork.java */
    public class c implements com.google.common.base.n<E, u<N>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s0 f58388b;

        c(s0 s0Var) {
            this.f58388b = s0Var;
        }

        @Override // com.google.common.base.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u<N> apply(E e10) {
            return this.f58388b.I(e10);
        }
    }

    private com.google.common.base.x<E> N(N n10, N n11) {
        return new b(n10, n11);
    }

    private static <N, E> Map<E, u<N>> O(s0<N, E> s0Var) {
        return Maps.j(s0Var.g(), new c(s0Var));
    }

    @Override // com.google.common.graph.s0
    public Set<E> A(E e10) {
        u<N> uVarI = I(e10);
        return Sets.f(Sets.N(n(uVarI.g()), n(uVarI.h())), ImmutableSet.E(e10));
    }

    @Override // com.google.common.graph.s0
    public Set<E> G(u<N> uVar) {
        Q(uVar);
        return u(uVar.g(), uVar.h());
    }

    @Override // com.google.common.graph.s0
    @CheckForNull
    public E H(N n10, N n11) {
        Set<E> setU = u(n10, n11);
        int size = setU.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return setU.iterator().next();
        }
        throw new IllegalArgumentException(String.format("Cannot call edgeConnecting() when parallel edges exist between %s and %s. Consider calling edgesConnecting() instead.", n10, n11));
    }

    @Override // com.google.common.graph.s0
    @CheckForNull
    public E K(u<N> uVar) {
        Q(uVar);
        return H(uVar.g(), uVar.h());
    }

    protected final boolean P(u<?> uVar) {
        return uVar.b() || !c();
    }

    protected final void Q(u<?> uVar) {
        com.google.common.base.w.E(uVar);
        com.google.common.base.w.e(P(uVar), "Mismatch: unordered endpoints cannot be used with directed graphs");
    }

    @Override // com.google.common.graph.s0, com.google.common.graph.c1, com.google.common.graph.a0
    public /* bridge */ /* synthetic */ Iterable a(Object obj) {
        return a(obj);
    }

    @Override // com.google.common.graph.s0, com.google.common.graph.w0, com.google.common.graph.a0
    public /* bridge */ /* synthetic */ Iterable b(Object obj) {
        return b(obj);
    }

    @Override // com.google.common.graph.s0
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return c() == s0Var.c() && e().equals(s0Var.e()) && O(this).equals(O(s0Var));
    }

    @Override // com.google.common.graph.s0
    public int f(N n10) {
        return c() ? w(n10).size() : j(n10);
    }

    @Override // com.google.common.graph.s0
    public boolean h(N n10, N n11) {
        com.google.common.base.w.E(n10);
        com.google.common.base.w.E(n11);
        return e().contains(n10) && a((Object) n10).contains(n11);
    }

    @Override // com.google.common.graph.s0
    public final int hashCode() {
        return O(this).hashCode();
    }

    @Override // com.google.common.graph.s0
    public boolean i(u<N> uVar) {
        com.google.common.base.w.E(uVar);
        if (P(uVar)) {
            return h(uVar.g(), uVar.h());
        }
        return false;
    }

    @Override // com.google.common.graph.s0
    public int j(N n10) {
        return c() ? com.google.common.math.f.t(w(n10).size(), z(n10).size()) : com.google.common.math.f.t(n(n10).size(), u(n10, n10).size());
    }

    @Override // com.google.common.graph.s0
    public int l(N n10) {
        return c() ? z(n10).size() : j(n10);
    }

    @Override // com.google.common.graph.s0
    public a0<N> t() {
        return new a();
    }

    public String toString() {
        boolean zC = c();
        boolean zB = B();
        boolean zM = m();
        String strValueOf = String.valueOf(e());
        String strValueOf2 = String.valueOf(O(this));
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 87 + strValueOf2.length());
        sb2.append("isDirected: ");
        sb2.append(zC);
        sb2.append(", allowsParallelEdges: ");
        sb2.append(zB);
        sb2.append(", allowsSelfLoops: ");
        sb2.append(zM);
        sb2.append(", nodes: ");
        sb2.append(strValueOf);
        sb2.append(", edges: ");
        sb2.append(strValueOf2);
        return sb2.toString();
    }

    @Override // com.google.common.graph.s0
    public Set<E> u(N n10, N n11) {
        Set<E> setZ = z(n10);
        Set<E> setW = w(n11);
        return setZ.size() <= setW.size() ? Collections.unmodifiableSet(Sets.i(setZ, N(n10, n11))) : Collections.unmodifiableSet(Sets.i(setW, N(n11, n10)));
    }
}
