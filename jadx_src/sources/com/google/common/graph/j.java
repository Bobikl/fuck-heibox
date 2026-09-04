package com.google.common.graph;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: AbstractValueGraph.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.a
@t
public abstract class j<N, V> extends com.google.common.graph.a<N> implements i1<N, V> {

    /* JADX INFO: compiled from: AbstractValueGraph.java */
    public class a extends f<N> {
        a() {
        }

        @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.c1, com.google.common.graph.a0
        public Set<N> a(N n10) {
            return j.this.a((Object) n10);
        }

        @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.w0, com.google.common.graph.a0
        public Set<N> b(N n10) {
            return j.this.b((Object) n10);
        }

        @Override // com.google.common.graph.l
        public boolean c() {
            return j.this.c();
        }

        @Override // com.google.common.graph.l
        public Set<N> d(N n10) {
            return j.this.d(n10);
        }

        @Override // com.google.common.graph.l
        public Set<N> e() {
            return j.this.e();
        }

        @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
        public int f(N n10) {
            return j.this.f(n10);
        }

        @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l
        public Set<u<N>> g() {
            return j.this.g();
        }

        @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l
        public int j(N n10) {
            return j.this.j(n10);
        }

        @Override // com.google.common.graph.l
        public ElementOrder<N> k() {
            return j.this.k();
        }

        @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
        public int l(N n10) {
            return j.this.l(n10);
        }

        @Override // com.google.common.graph.l
        public boolean m() {
            return j.this.m();
        }

        @Override // com.google.common.graph.f, com.google.common.graph.a, com.google.common.graph.l
        public ElementOrder<N> q() {
            return j.this.q();
        }
    }

    /* JADX INFO: compiled from: AbstractValueGraph.java */
    public class b implements com.google.common.base.n<u<N>, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1 f58394b;

        b(i1 i1Var) {
            this.f58394b = i1Var;
        }

        @Override // com.google.common.base.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public V apply(u<N> uVar) {
            V v10 = (V) this.f58394b.C(uVar.g(), uVar.h(), null);
            Objects.requireNonNull(v10);
            return v10;
        }
    }

    private static <N, V> Map<u<N>, V> Q(i1<N, V> i1Var) {
        return Maps.j(i1Var.g(), new b(i1Var));
    }

    @Override // com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.c1, com.google.common.graph.a0
    public /* bridge */ /* synthetic */ Iterable a(Object obj) {
        return a(obj);
    }

    @Override // com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.w0, com.google.common.graph.a0
    public /* bridge */ /* synthetic */ Iterable b(Object obj) {
        return b(obj);
    }

    @Override // com.google.common.graph.i1
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return c() == i1Var.c() && e().equals(i1Var.e()) && Q(this).equals(Q(i1Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
    public /* bridge */ /* synthetic */ int f(Object obj) {
        return super.f(obj);
    }

    @Override // com.google.common.graph.a, com.google.common.graph.l
    public /* bridge */ /* synthetic */ Set g() {
        return super.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
    public /* bridge */ /* synthetic */ boolean h(Object obj, Object obj2) {
        return super.h(obj, obj2);
    }

    @Override // com.google.common.graph.i1
    public final int hashCode() {
        return Q(this).hashCode();
    }

    @Override // com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
    public /* bridge */ /* synthetic */ boolean i(u uVar) {
        return super.i(uVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.a, com.google.common.graph.l
    public /* bridge */ /* synthetic */ int j(Object obj) {
        return super.j(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
    public /* bridge */ /* synthetic */ int l(Object obj) {
        return super.l(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
    public /* bridge */ /* synthetic */ Set n(Object obj) {
        return super.n(obj);
    }

    @Override // com.google.common.graph.a, com.google.common.graph.l
    public /* bridge */ /* synthetic */ ElementOrder q() {
        return super.q();
    }

    @Override // com.google.common.graph.i1
    public a0<N> t() {
        return new a();
    }

    public String toString() {
        boolean zC = c();
        boolean zM = m();
        String strValueOf = String.valueOf(e());
        String strValueOf2 = String.valueOf(Q(this));
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 59 + strValueOf2.length());
        sb2.append("isDirected: ");
        sb2.append(zC);
        sb2.append(", allowsSelfLoops: ");
        sb2.append(zM);
        sb2.append(", nodes: ");
        sb2.append(strValueOf);
        sb2.append(", edges: ");
        sb2.append(strValueOf2);
        return sb2.toString();
    }
}
