package com.google.common.graph;

import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: AbstractGraph.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.a
@t
public abstract class f<N> extends a<N> implements a0<N> {
    @Override // com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.c1, com.google.common.graph.a0
    public /* bridge */ /* synthetic */ Iterable a(Object obj) {
        return a(obj);
    }

    @Override // com.google.common.graph.a, com.google.common.graph.l, com.google.common.graph.w0, com.google.common.graph.a0
    public /* bridge */ /* synthetic */ Iterable b(Object obj) {
        return b(obj);
    }

    @Override // com.google.common.graph.a0
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return c() == a0Var.c() && e().equals(a0Var.e()) && g().equals(a0Var.g());
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

    @Override // com.google.common.graph.a0
    public final int hashCode() {
        return g().hashCode();
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

    public String toString() {
        boolean zC = c();
        boolean zM = m();
        String strValueOf = String.valueOf(e());
        String strValueOf2 = String.valueOf(g());
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
