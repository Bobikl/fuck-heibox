package com.google.common.graph;

import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ForwardingNetwork.java */
/* JADX INFO: loaded from: classes7.dex */
@t
public abstract class x<N, E> extends h<N, E> {
    x() {
    }

    @Override // com.google.common.graph.h, com.google.common.graph.s0
    public Set<E> A(E e10) {
        return R().A(e10);
    }

    @Override // com.google.common.graph.s0
    public boolean B() {
        return R().B();
    }

    @Override // com.google.common.graph.h, com.google.common.graph.s0
    public Set<E> G(u<N> uVar) {
        return R().G(uVar);
    }

    @Override // com.google.common.graph.h, com.google.common.graph.s0
    @CheckForNull
    public E H(N n10, N n11) {
        return R().H(n10, n11);
    }

    @Override // com.google.common.graph.s0
    public u<N> I(E e10) {
        return R().I(e10);
    }

    @Override // com.google.common.graph.h, com.google.common.graph.s0
    @CheckForNull
    public E K(u<N> uVar) {
        return R().K(uVar);
    }

    abstract s0<N, E> R();

    @Override // com.google.common.graph.h, com.google.common.graph.s0, com.google.common.graph.c1, com.google.common.graph.a0
    public Set<N> a(N n10) {
        return R().a((Object) n10);
    }

    @Override // com.google.common.graph.h, com.google.common.graph.s0, com.google.common.graph.w0, com.google.common.graph.a0
    public Set<N> b(N n10) {
        return R().b((Object) n10);
    }

    @Override // com.google.common.graph.s0
    public boolean c() {
        return R().c();
    }

    @Override // com.google.common.graph.s0
    public Set<N> d(N n10) {
        return R().d(n10);
    }

    @Override // com.google.common.graph.s0
    public Set<N> e() {
        return R().e();
    }

    @Override // com.google.common.graph.h, com.google.common.graph.s0
    public int f(N n10) {
        return R().f(n10);
    }

    @Override // com.google.common.graph.s0
    public Set<E> g() {
        return R().g();
    }

    @Override // com.google.common.graph.h, com.google.common.graph.s0
    public boolean h(N n10, N n11) {
        return R().h(n10, n11);
    }

    @Override // com.google.common.graph.h, com.google.common.graph.s0
    public boolean i(u<N> uVar) {
        return R().i(uVar);
    }

    @Override // com.google.common.graph.h, com.google.common.graph.s0
    public int j(N n10) {
        return R().j(n10);
    }

    @Override // com.google.common.graph.s0
    public ElementOrder<N> k() {
        return R().k();
    }

    @Override // com.google.common.graph.h, com.google.common.graph.s0
    public int l(N n10) {
        return R().l(n10);
    }

    @Override // com.google.common.graph.s0
    public boolean m() {
        return R().m();
    }

    @Override // com.google.common.graph.s0
    public Set<E> n(N n10) {
        return R().n(n10);
    }

    @Override // com.google.common.graph.h, com.google.common.graph.s0
    public Set<E> u(N n10, N n11) {
        return R().u(n10, n11);
    }

    @Override // com.google.common.graph.s0
    public ElementOrder<E> v() {
        return R().v();
    }

    @Override // com.google.common.graph.s0
    public Set<E> w(N n10) {
        return R().w(n10);
    }

    @Override // com.google.common.graph.s0
    public Set<E> z(N n10) {
        return R().z(n10);
    }
}
