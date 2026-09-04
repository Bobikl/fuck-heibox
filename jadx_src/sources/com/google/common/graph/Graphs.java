package com.google.common.graph;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.l1;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.a
@t
public final class Graphs {

    public enum NodeVisitState {
        PENDING,
        COMPLETE
    }

    public static class a<N> extends w<N> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a0<N> f58322a;

        /* JADX INFO: renamed from: com.google.common.graph.Graphs$a$a, reason: collision with other inner class name */
        public class C0472a extends k0<N> {

            /* JADX INFO: renamed from: com.google.common.graph.Graphs$a$a$a, reason: collision with other inner class name */
            public class C0473a implements com.google.common.base.n<u<N>, u<N>> {
                C0473a() {
                }

                @Override // com.google.common.base.n
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public u<N> apply(u<N> uVar) {
                    return u.i(a.this.Q(), uVar.h(), uVar.g());
                }
            }

            C0472a(l lVar, Object obj) {
                super(lVar, obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<u<N>> iterator() {
                return Iterators.c0(a.this.Q().n(this.f58396b).iterator(), new C0473a());
            }
        }

        a(a0<N> a0Var) {
            this.f58322a = a0Var;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.graph.w
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public a0<N> Q() {
            return this.f58322a;
        }

        @Override // com.google.common.graph.w, com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.c1, com.google.common.graph.a0
        public Set<N> a(N n10) {
            return Q().b((Object) n10);
        }

        @Override // com.google.common.graph.w, com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.w0, com.google.common.graph.a0
        public Set<N> b(N n10) {
            return Q().a((Object) n10);
        }

        @Override // com.google.common.graph.w, com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
        public int f(N n10) {
            return Q().l(n10);
        }

        @Override // com.google.common.graph.w, com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
        public boolean h(N n10, N n11) {
            return Q().h(n11, n10);
        }

        @Override // com.google.common.graph.w, com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
        public boolean i(u<N> uVar) {
            return Q().i(Graphs.q(uVar));
        }

        @Override // com.google.common.graph.w, com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
        public int l(N n10) {
            return Q().f(n10);
        }

        @Override // com.google.common.graph.w, com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
        public Set<u<N>> n(N n10) {
            return new C0472a(this, n10);
        }
    }

    public static class b<N, E> extends x<N, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s0<N, E> f58325a;

        b(s0<N, E> s0Var) {
            this.f58325a = s0Var;
        }

        @Override // com.google.common.graph.x, com.google.common.graph.h, com.google.common.graph.s0
        public Set<E> G(u<N> uVar) {
            return R().G(Graphs.q(uVar));
        }

        @Override // com.google.common.graph.x, com.google.common.graph.h, com.google.common.graph.s0
        @CheckForNull
        public E H(N n10, N n11) {
            return R().H(n11, n10);
        }

        @Override // com.google.common.graph.x, com.google.common.graph.s0
        public u<N> I(E e10) {
            u<N> uVarI = R().I(e10);
            return u.j(this.f58325a, uVarI.h(), uVarI.g());
        }

        @Override // com.google.common.graph.x, com.google.common.graph.h, com.google.common.graph.s0
        @CheckForNull
        public E K(u<N> uVar) {
            return R().K(Graphs.q(uVar));
        }

        @Override // com.google.common.graph.x
        s0<N, E> R() {
            return this.f58325a;
        }

        @Override // com.google.common.graph.x, com.google.common.graph.h, com.google.common.graph.s0, com.google.common.graph.c1, com.google.common.graph.a0
        public Set<N> a(N n10) {
            return R().b((Object) n10);
        }

        @Override // com.google.common.graph.x, com.google.common.graph.h, com.google.common.graph.s0, com.google.common.graph.w0, com.google.common.graph.a0
        public Set<N> b(N n10) {
            return R().a((Object) n10);
        }

        @Override // com.google.common.graph.x, com.google.common.graph.h, com.google.common.graph.s0
        public int f(N n10) {
            return R().l(n10);
        }

        @Override // com.google.common.graph.x, com.google.common.graph.h, com.google.common.graph.s0
        public boolean h(N n10, N n11) {
            return R().h(n11, n10);
        }

        @Override // com.google.common.graph.x, com.google.common.graph.h, com.google.common.graph.s0
        public boolean i(u<N> uVar) {
            return R().i(Graphs.q(uVar));
        }

        @Override // com.google.common.graph.x, com.google.common.graph.h, com.google.common.graph.s0
        public int l(N n10) {
            return R().f(n10);
        }

        @Override // com.google.common.graph.x, com.google.common.graph.h, com.google.common.graph.s0
        public Set<E> u(N n10, N n11) {
            return R().u(n11, n10);
        }

        @Override // com.google.common.graph.x, com.google.common.graph.s0
        public Set<E> w(N n10) {
            return R().z(n10);
        }

        @Override // com.google.common.graph.x, com.google.common.graph.s0
        public Set<E> z(N n10) {
            return R().w(n10);
        }
    }

    public static class c<N, V> extends y<N, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i1<N, V> f58326a;

        c(i1<N, V> i1Var) {
            this.f58326a = i1Var;
        }

        @Override // com.google.common.graph.y, com.google.common.graph.i1
        @CheckForNull
        public V C(N n10, N n11, @CheckForNull V v10) {
            return R().C(n11, n10, v10);
        }

        @Override // com.google.common.graph.y
        i1<N, V> R() {
            return this.f58326a;
        }

        @Override // com.google.common.graph.y, com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.c1, com.google.common.graph.a0
        public Set<N> a(N n10) {
            return R().b((Object) n10);
        }

        @Override // com.google.common.graph.y, com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.w0, com.google.common.graph.a0
        public Set<N> b(N n10) {
            return R().a((Object) n10);
        }

        @Override // com.google.common.graph.y, com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
        public int f(N n10) {
            return R().l(n10);
        }

        @Override // com.google.common.graph.y, com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
        public boolean h(N n10, N n11) {
            return R().h(n11, n10);
        }

        @Override // com.google.common.graph.y, com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
        public boolean i(u<N> uVar) {
            return R().i(Graphs.q(uVar));
        }

        @Override // com.google.common.graph.y, com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
        public int l(N n10) {
            return R().f(n10);
        }

        @Override // com.google.common.graph.y, com.google.common.graph.i1
        @CheckForNull
        public V y(u<N> uVar, @CheckForNull V v10) {
            return R().y(Graphs.q(uVar), v10);
        }
    }

    private Graphs() {
    }

    private static boolean a(a0<?> a0Var, Object obj, @CheckForNull Object obj2) {
        return a0Var.c() || !com.google.common.base.s.a(obj2, obj);
    }

    @s9.a
    static int b(int i10) {
        com.google.common.base.w.k(i10 >= 0, "Not true that %s is non-negative.", i10);
        return i10;
    }

    @s9.a
    static long c(long j10) {
        com.google.common.base.w.p(j10 >= 0, "Not true that %s is non-negative.", j10);
        return j10;
    }

    @s9.a
    static int d(int i10) {
        com.google.common.base.w.k(i10 > 0, "Not true that %s is positive.", i10);
        return i10;
    }

    @s9.a
    static long e(long j10) {
        com.google.common.base.w.p(j10 > 0, "Not true that %s is positive.", j10);
        return j10;
    }

    public static <N> o0<N> f(a0<N> a0Var) {
        o0<N> o0Var = (o0<N>) b0.g(a0Var).f(a0Var.e().size()).b();
        Iterator<N> it = a0Var.e().iterator();
        while (it.hasNext()) {
            o0Var.p(it.next());
        }
        for (u<N> uVar : a0Var.g()) {
            o0Var.J(uVar.g(), uVar.h());
        }
        return o0Var;
    }

    public static <N, E> p0<N, E> g(s0<N, E> s0Var) {
        p0<N, E> p0Var = (p0<N, E>) t0.i(s0Var).h(s0Var.e().size()).g(s0Var.g().size()).c();
        Iterator<N> it = s0Var.e().iterator();
        while (it.hasNext()) {
            p0Var.p(it.next());
        }
        for (E e10 : s0Var.g()) {
            u<N> uVarI = s0Var.I(e10);
            p0Var.M(uVarI.g(), uVarI.h(), e10);
        }
        return p0Var;
    }

    public static <N, V> q0<N, V> h(i1<N, V> i1Var) {
        q0<N, V> q0Var = (q0<N, V>) j1.g(i1Var).f(i1Var.e().size()).b();
        Iterator<N> it = i1Var.e().iterator();
        while (it.hasNext()) {
            q0Var.p(it.next());
        }
        for (u<N> uVar : i1Var.g()) {
            N nG = uVar.g();
            N nH = uVar.h();
            V vC = i1Var.C(uVar.g(), uVar.h(), null);
            Objects.requireNonNull(vC);
            q0Var.x(nG, nH, vC);
        }
        return q0Var;
    }

    public static <N> boolean i(a0<N> a0Var) {
        int size = a0Var.g().size();
        if (size == 0) {
            return false;
        }
        if (!a0Var.c() && size >= a0Var.e().size()) {
            return true;
        }
        HashMap mapA0 = Maps.a0(a0Var.e().size());
        Iterator<N> it = a0Var.e().iterator();
        while (it.hasNext()) {
            if (o(a0Var, mapA0, it.next(), null)) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(s0<?, ?> s0Var) {
        if (s0Var.c() || !s0Var.B() || s0Var.g().size() <= s0Var.t().g().size()) {
            return i(s0Var.t());
        }
        return true;
    }

    public static <N> o0<N> k(a0<N> a0Var, Iterable<? extends N> iterable) {
        x0 x0Var = iterable instanceof Collection ? (o0<N>) b0.g(a0Var).f(((Collection) iterable).size()).b() : (o0<N>) b0.g(a0Var).b();
        Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            x0Var.p(it.next());
        }
        for (N n10 : x0Var.e()) {
            for (N n11 : a0Var.a((Object) n10)) {
                if (x0Var.e().contains(n11)) {
                    x0Var.J(n10, n11);
                }
            }
        }
        return x0Var;
    }

    public static <N, E> p0<N, E> l(s0<N, E> s0Var, Iterable<? extends N> iterable) {
        y0 y0Var = iterable instanceof Collection ? (p0<N, E>) t0.i(s0Var).h(((Collection) iterable).size()).c() : (p0<N, E>) t0.i(s0Var).c();
        Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            y0Var.p(it.next());
        }
        for (E e10 : y0Var.e()) {
            for (E e11 : s0Var.z(e10)) {
                N nA = s0Var.I(e11).a(e10);
                if (y0Var.e().contains(nA)) {
                    y0Var.M(e10, nA, e11);
                }
            }
        }
        return y0Var;
    }

    public static <N, V> q0<N, V> m(i1<N, V> i1Var, Iterable<? extends N> iterable) {
        z0 z0Var = iterable instanceof Collection ? (q0<N, V>) j1.g(i1Var).f(((Collection) iterable).size()).b() : (q0<N, V>) j1.g(i1Var).b();
        Iterator<? extends N> it = iterable.iterator();
        while (it.hasNext()) {
            z0Var.p(it.next());
        }
        for (N n10 : z0Var.e()) {
            for (N n11 : i1Var.a((Object) n10)) {
                if (z0Var.e().contains(n11)) {
                    V vC = i1Var.C(n10, n11, null);
                    Objects.requireNonNull(vC);
                    z0Var.x(n10, n11, vC);
                }
            }
        }
        return z0Var;
    }

    public static <N> Set<N> n(a0<N> a0Var, N n10) {
        com.google.common.base.w.u(a0Var.e().contains(n10), "Node %s is not an element of this graph.", n10);
        return ImmutableSet.v(Traverser.g(a0Var).b(n10));
    }

    private static <N> boolean o(a0<N> a0Var, Map<Object, NodeVisitState> map, N n10, @CheckForNull N n11) {
        NodeVisitState nodeVisitState = map.get(n10);
        if (nodeVisitState == NodeVisitState.COMPLETE) {
            return false;
        }
        NodeVisitState nodeVisitState2 = NodeVisitState.PENDING;
        if (nodeVisitState == nodeVisitState2) {
            return true;
        }
        map.put(n10, nodeVisitState2);
        for (N n12 : a0Var.a((Object) n10)) {
            if (a(a0Var, n12, n11) && o(a0Var, map, n12, n10)) {
                return true;
            }
        }
        map.put(n10, NodeVisitState.COMPLETE);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <N> a0<N> p(a0<N> a0Var) {
        x0 x0VarB = b0.g(a0Var).a(true).b();
        if (a0Var.c()) {
            for (N n10 : a0Var.e()) {
                Iterator it = n(a0Var, n10).iterator();
                while (it.hasNext()) {
                    x0VarB.J(n10, it.next());
                }
            }
        } else {
            HashSet hashSet = new HashSet();
            for (N n11 : a0Var.e()) {
                if (!hashSet.contains(n11)) {
                    Set setN = n(a0Var, n11);
                    hashSet.addAll(setN);
                    int i10 = 1;
                    for (Object obj : setN) {
                        int i11 = i10 + 1;
                        Iterator it2 = l1.D(setN, i10).iterator();
                        while (it2.hasNext()) {
                            x0VarB.J(obj, it2.next());
                        }
                        i10 = i11;
                    }
                }
            }
        }
        return x0VarB;
    }

    static <N> u<N> q(u<N> uVar) {
        return uVar.b() ? u.l(uVar.o(), uVar.m()) : uVar;
    }

    public static <N> a0<N> r(a0<N> a0Var) {
        if (a0Var.c()) {
            return a0Var instanceof a ? ((a) a0Var).f58322a : new a(a0Var);
        }
        return a0Var;
    }

    public static <N, E> s0<N, E> s(s0<N, E> s0Var) {
        if (s0Var.c()) {
            return s0Var instanceof b ? ((b) s0Var).f58325a : new b(s0Var);
        }
        return s0Var;
    }

    public static <N, V> i1<N, V> t(i1<N, V> i1Var) {
        if (i1Var.c()) {
            return i1Var instanceof c ? ((c) i1Var).f58326a : new c(i1Var);
        }
        return i1Var;
    }
}
