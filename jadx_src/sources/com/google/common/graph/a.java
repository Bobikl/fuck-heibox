package com.google.common.graph;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.common.collect.b3;
import com.google.common.primitives.Ints;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: AbstractBaseGraph.java */
/* JADX INFO: loaded from: classes7.dex */
@t
public abstract class a<N> implements l<N> {

    /* JADX INFO: renamed from: com.google.common.graph.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractBaseGraph.java */
    public class C0474a extends AbstractSet<u<N>> {
        C0474a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b3<u<N>> iterator() {
            return v.e(a.this);
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

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return Ints.x(a.this.N());
        }
    }

    /* JADX INFO: compiled from: AbstractBaseGraph.java */
    public class b extends k0<N> {
        b(a aVar, l lVar, Object obj) {
            super(lVar, obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ u h(Object obj) {
            return u.l(obj, this.f58396b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ u i(Object obj) {
            return u.l(this.f58396b, obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ u j(Object obj) {
            return u.q(this.f58396b, obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b3<u<N>> iterator() {
            return this.f58397c.c() ? Iterators.f0(Iterators.j(Iterators.c0(this.f58397c.b((Object) this.f58396b).iterator(), new com.google.common.base.n() { // from class: com.google.common.graph.b
                @Override // com.google.common.base.n
                public final Object apply(Object obj) {
                    return this.f58352b.h(obj);
                }
            }), Iterators.c0(Sets.f(this.f58397c.a((Object) this.f58396b), ImmutableSet.E(this.f58396b)).iterator(), new com.google.common.base.n() { // from class: com.google.common.graph.c
                @Override // com.google.common.base.n
                public final Object apply(Object obj) {
                    return this.f58359b.i(obj);
                }
            }))) : Iterators.f0(Iterators.c0(this.f58397c.d(this.f58396b).iterator(), new com.google.common.base.n() { // from class: com.google.common.graph.d
                @Override // com.google.common.base.n
                public final Object apply(Object obj) {
                    return this.f58360b.j(obj);
                }
            }));
        }
    }

    a() {
    }

    protected long N() {
        Iterator<N> it = e().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            j10 += (long) j(it.next());
        }
        com.google.common.base.w.g0((1 & j10) == 0);
        return j10 >>> 1;
    }

    protected final boolean O(u<?> uVar) {
        return uVar.b() || !c();
    }

    protected final void P(u<?> uVar) {
        com.google.common.base.w.E(uVar);
        com.google.common.base.w.e(O(uVar), "Mismatch: unordered endpoints cannot be used with directed graphs");
    }

    @Override // com.google.common.graph.l, com.google.common.graph.c1, com.google.common.graph.a0
    public /* bridge */ /* synthetic */ Iterable a(Object obj) {
        return a(obj);
    }

    @Override // com.google.common.graph.l, com.google.common.graph.w0, com.google.common.graph.a0
    public /* bridge */ /* synthetic */ Iterable b(Object obj) {
        return b(obj);
    }

    @Override // com.google.common.graph.l, com.google.common.graph.a0
    public int f(N n10) {
        return c() ? b((Object) n10).size() : j(n10);
    }

    @Override // com.google.common.graph.l
    public Set<u<N>> g() {
        return new C0474a();
    }

    @Override // com.google.common.graph.l, com.google.common.graph.a0
    public boolean h(N n10, N n11) {
        com.google.common.base.w.E(n10);
        com.google.common.base.w.E(n11);
        return e().contains(n10) && a((Object) n10).contains(n11);
    }

    @Override // com.google.common.graph.l, com.google.common.graph.a0
    public boolean i(u<N> uVar) {
        com.google.common.base.w.E(uVar);
        if (!O(uVar)) {
            return false;
        }
        N nG = uVar.g();
        return e().contains(nG) && a((Object) nG).contains(uVar.h());
    }

    @Override // com.google.common.graph.l
    public int j(N n10) {
        if (c()) {
            return com.google.common.math.f.t(b((Object) n10).size(), a((Object) n10).size());
        }
        Set<N> setD = d(n10);
        return com.google.common.math.f.t(setD.size(), (m() && setD.contains(n10)) ? 1 : 0);
    }

    @Override // com.google.common.graph.l, com.google.common.graph.a0
    public int l(N n10) {
        return c() ? a((Object) n10).size() : j(n10);
    }

    @Override // com.google.common.graph.l, com.google.common.graph.a0
    public Set<u<N>> n(N n10) {
        com.google.common.base.w.E(n10);
        com.google.common.base.w.u(e().contains(n10), "Node %s is not an element of this graph.", n10);
        return new b(this, this, n10);
    }

    @Override // com.google.common.graph.l
    public ElementOrder<N> q() {
        return ElementOrder.i();
    }
}
