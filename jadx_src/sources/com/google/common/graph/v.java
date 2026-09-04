package com.google.common.graph;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: EndpointPairIterator.java */
/* JADX INFO: loaded from: classes7.dex */
@t
public abstract class v<N> extends AbstractIterator<u<N>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l<N> f58444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Iterator<N> f58445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @CheckForNull
    N f58446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Iterator<N> f58447g;

    /* JADX INFO: compiled from: EndpointPairIterator.java */
    public static final class b<N> extends v<N> {
        private b(l<N> lVar) {
            super(lVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractIterator
        @CheckForNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public u<N> a() {
            while (!this.f58447g.hasNext()) {
                if (!d()) {
                    return b();
                }
            }
            N n10 = this.f58446f;
            Objects.requireNonNull(n10);
            return u.l(n10, this.f58447g.next());
        }
    }

    /* JADX INFO: compiled from: EndpointPairIterator.java */
    public static final class c<N> extends v<N> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @CheckForNull
        private Set<N> f58448h;

        private c(l<N> lVar) {
            super(lVar);
            this.f58448h = Sets.y(lVar.e().size() + 1);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractIterator
        @CheckForNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public u<N> a() {
            do {
                Objects.requireNonNull(this.f58448h);
                while (this.f58447g.hasNext()) {
                    N next = this.f58447g.next();
                    if (!this.f58448h.contains(next)) {
                        N n10 = this.f58446f;
                        Objects.requireNonNull(n10);
                        return u.q(n10, next);
                    }
                }
                this.f58448h.add(this.f58446f);
            } while (d());
            this.f58448h = null;
            return b();
        }
    }

    private v(l<N> lVar) {
        this.f58446f = null;
        this.f58447g = ImmutableSet.D().iterator();
        this.f58444d = lVar;
        this.f58445e = lVar.e().iterator();
    }

    static <N> v<N> e(l<N> lVar) {
        return lVar.c() ? new b(lVar) : new c(lVar);
    }

    final boolean d() {
        com.google.common.base.w.g0(!this.f58447g.hasNext());
        if (!this.f58445e.hasNext()) {
            return false;
        }
        N next = this.f58445e.next();
        this.f58446f = next;
        this.f58447g = this.f58444d.a((Object) next).iterator();
        return true;
    }
}
