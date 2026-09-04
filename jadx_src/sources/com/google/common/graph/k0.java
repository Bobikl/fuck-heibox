package com.google.common.graph;

import java.util.AbstractSet;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: IncidentEdgeSet.java */
/* JADX INFO: loaded from: classes7.dex */
@t
public abstract class k0<N> extends AbstractSet<u<N>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final N f58396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final l<N> f58397c;

    k0(l<N> lVar, N n10) {
        this.f58397c = lVar;
        this.f58396b = n10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f58397c.c()) {
            if (!uVar.b()) {
                return false;
            }
            Object objM = uVar.m();
            Object objO = uVar.o();
            return (this.f58396b.equals(objM) && this.f58397c.a((Object) this.f58396b).contains(objO)) || (this.f58396b.equals(objO) && this.f58397c.b((Object) this.f58396b).contains(objM));
        }
        if (uVar.b()) {
            return false;
        }
        Set<N> setD = this.f58397c.d(this.f58396b);
        Object objG = uVar.g();
        Object objH = uVar.h();
        return (this.f58396b.equals(objH) && setD.contains(objG)) || (this.f58396b.equals(objG) && setD.contains(objH));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f58397c.c() ? (this.f58397c.f(this.f58396b) + this.f58397c.l(this.f58396b)) - (this.f58397c.a((Object) this.f58396b).contains(this.f58396b) ? 1 : 0) : this.f58397c.d(this.f58396b).size();
    }
}
