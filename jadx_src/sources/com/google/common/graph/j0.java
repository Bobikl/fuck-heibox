package com.google.common.graph;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ImmutableValueGraph.java */
/* JADX INFO: loaded from: classes7.dex */
@s9.j(containerOf = {"N", androidx.exifinterface.media.a.X4})
@o9.a
@t
public final class j0<N, V> extends b1<N, V> {

    /* JADX INFO: compiled from: ImmutableValueGraph.java */
    public static class a<N, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q0<N, V> f58395a;

        a(j1<N, V> j1Var) {
            this.f58395a = j1Var.d().i(ElementOrder.g()).b();
        }

        @s9.a
        public a<N, V> a(N n10) {
            this.f58395a.p(n10);
            return this;
        }

        public j0<N, V> b() {
            return j0.Z(this.f58395a);
        }

        @s9.a
        public a<N, V> c(u<N> uVar, V v10) {
            this.f58395a.F(uVar, v10);
            return this;
        }

        @s9.a
        public a<N, V> d(N n10, N n11, V v10) {
            this.f58395a.x(n10, n11, v10);
            return this;
        }
    }

    private j0(i1<N, V> i1Var) {
        super(j1.g(i1Var), a0(i1Var), i1Var.g().size());
    }

    private static <N, V> c0<N, V> X(final i1<N, V> i1Var, final N n10) {
        com.google.common.base.n nVar = new com.google.common.base.n() { // from class: com.google.common.graph.i0
            @Override // com.google.common.base.n
            public final Object apply(Object obj) {
                return j0.b0(i1Var, n10, obj);
            }
        };
        return i1Var.c() ? p.y(n10, i1Var.n(n10), nVar) : e1.m(Maps.j(i1Var.d(n10), nVar));
    }

    @Deprecated
    public static <N, V> j0<N, V> Y(j0<N, V> j0Var) {
        return (j0) com.google.common.base.w.E(j0Var);
    }

    public static <N, V> j0<N, V> Z(i1<N, V> i1Var) {
        return i1Var instanceof j0 ? (j0) i1Var : new j0<>(i1Var);
    }

    private static <N, V> ImmutableMap<N, c0<N, V>> a0(i1<N, V> i1Var) {
        ImmutableMap.b bVarB = ImmutableMap.b();
        for (N n10 : i1Var.e()) {
            bVarB.i(n10, X(i1Var, n10));
        }
        return bVarB.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object b0(i1 i1Var, Object obj, Object obj2) {
        Object objC = i1Var.C(obj, obj2, null);
        Objects.requireNonNull(objC);
        return objC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.b1, com.google.common.graph.i1
    @CheckForNull
    public /* bridge */ /* synthetic */ Object C(Object obj, Object obj2, @CheckForNull Object obj3) {
        return super.C(obj, obj2, obj3);
    }

    @Override // com.google.common.graph.j, com.google.common.graph.i1
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public d0<N> t() {
        return new d0<>(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.b1, com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.c1, com.google.common.graph.a0
    public /* bridge */ /* synthetic */ Set a(Object obj) {
        return super.a(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.b1, com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.w0, com.google.common.graph.a0
    public /* bridge */ /* synthetic */ Set b(Object obj) {
        return super.b(obj);
    }

    @Override // com.google.common.graph.b1, com.google.common.graph.l
    public /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.b1, com.google.common.graph.l
    public /* bridge */ /* synthetic */ Set d(Object obj) {
        return super.d(obj);
    }

    @Override // com.google.common.graph.b1, com.google.common.graph.l
    public /* bridge */ /* synthetic */ Set e() {
        return super.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.b1, com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
    public /* bridge */ /* synthetic */ boolean h(Object obj, Object obj2) {
        return super.h(obj, obj2);
    }

    @Override // com.google.common.graph.b1, com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
    public /* bridge */ /* synthetic */ boolean i(u uVar) {
        return super.i(uVar);
    }

    @Override // com.google.common.graph.b1, com.google.common.graph.l
    public /* bridge */ /* synthetic */ ElementOrder k() {
        return super.k();
    }

    @Override // com.google.common.graph.b1, com.google.common.graph.l
    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.b1, com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.a0
    public /* bridge */ /* synthetic */ Set n(Object obj) {
        return super.n(obj);
    }

    @Override // com.google.common.graph.j, com.google.common.graph.a, com.google.common.graph.l
    public ElementOrder<N> q() {
        return ElementOrder.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.b1, com.google.common.graph.i1
    @CheckForNull
    public /* bridge */ /* synthetic */ Object y(u uVar, @CheckForNull Object obj) {
        return super.y(uVar, obj);
    }
}
