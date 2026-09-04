package com.google.common.graph;

import com.google.common.collect.Iterators;
import com.google.common.collect.b3;
import com.meituan.robust.Constants;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: EndpointPair.java */
/* JADX INFO: loaded from: classes7.dex */
@s9.j(containerOf = {"N"})
@o9.a
@t
public abstract class u<N> implements Iterable<N> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final N f58442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final N f58443c;

    /* JADX INFO: compiled from: EndpointPair.java */
    public static final class b<N> extends u<N> {
        private b(N n10, N n11) {
            super(n10, n11);
        }

        @Override // com.google.common.graph.u
        public boolean b() {
            return true;
        }

        @Override // com.google.common.graph.u
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            if (b() != uVar.b()) {
                return false;
            }
            return m().equals(uVar.m()) && o().equals(uVar.o());
        }

        @Override // com.google.common.graph.u
        public int hashCode() {
            return com.google.common.base.s.b(m(), o());
        }

        @Override // com.google.common.graph.u, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.graph.u
        public N m() {
            return g();
        }

        @Override // com.google.common.graph.u
        public N o() {
            return h();
        }

        public String toString() {
            String strValueOf = String.valueOf(m());
            String strValueOf2 = String.valueOf(o());
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 6 + strValueOf2.length());
            sb2.append("<");
            sb2.append(strValueOf);
            sb2.append(" -> ");
            sb2.append(strValueOf2);
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: EndpointPair.java */
    public static final class c<N> extends u<N> {
        private c(N n10, N n11) {
            super(n10, n11);
        }

        @Override // com.google.common.graph.u
        public boolean b() {
            return false;
        }

        @Override // com.google.common.graph.u
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            if (b() != uVar.b()) {
                return false;
            }
            if (g().equals(uVar.g())) {
                return h().equals(uVar.h());
            }
            return g().equals(uVar.h()) && h().equals(uVar.g());
        }

        @Override // com.google.common.graph.u
        public int hashCode() {
            return g().hashCode() + h().hashCode();
        }

        @Override // com.google.common.graph.u, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.graph.u
        public N m() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        @Override // com.google.common.graph.u
        public N o() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        public String toString() {
            String strValueOf = String.valueOf(g());
            String strValueOf2 = String.valueOf(h());
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 4 + strValueOf2.length());
            sb2.append(Constants.ARRAY_TYPE);
            sb2.append(strValueOf);
            sb2.append(", ");
            sb2.append(strValueOf2);
            sb2.append("]");
            return sb2.toString();
        }
    }

    private u(N n10, N n11) {
        this.f58442b = (N) com.google.common.base.w.E(n10);
        this.f58443c = (N) com.google.common.base.w.E(n11);
    }

    static <N> u<N> i(a0<?> a0Var, N n10, N n11) {
        return a0Var.c() ? l(n10, n11) : q(n10, n11);
    }

    static <N> u<N> j(s0<?, ?> s0Var, N n10, N n11) {
        return s0Var.c() ? l(n10, n11) : q(n10, n11);
    }

    public static <N> u<N> l(N n10, N n11) {
        return new b(n10, n11);
    }

    public static <N> u<N> q(N n10, N n11) {
        return new c(n11, n10);
    }

    public final N a(N n10) {
        if (n10.equals(this.f58442b)) {
            return this.f58443c;
        }
        if (n10.equals(this.f58443c)) {
            return this.f58442b;
        }
        String strValueOf = String.valueOf(this);
        String strValueOf2 = String.valueOf(n10);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 36 + strValueOf2.length());
        sb2.append("EndpointPair ");
        sb2.append(strValueOf);
        sb2.append(" does not contain node ");
        sb2.append(strValueOf2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public abstract boolean b();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final b3<N> iterator() {
        return Iterators.B(this.f58442b, this.f58443c);
    }

    public abstract boolean equals(@CheckForNull Object obj);

    public final N g() {
        return this.f58442b;
    }

    public final N h() {
        return this.f58443c;
    }

    public abstract int hashCode();

    public abstract N m();

    public abstract N o();
}
