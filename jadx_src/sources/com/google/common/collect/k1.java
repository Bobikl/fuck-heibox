package com.google.common.collect;

import com.google.common.base.Equivalence;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Interners.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.c
@u
public final class k1 {

    /* JADX INFO: compiled from: Interners.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MapMaker f58090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f58091b;

        private b() {
            this.f58090a = new MapMaker();
            this.f58091b = true;
        }

        public <E> j1<E> a() {
            if (!this.f58091b) {
                this.f58090a.l();
            }
            return new d(this.f58090a);
        }

        public b b(int i10) {
            this.f58090a.a(i10);
            return this;
        }

        public b c() {
            this.f58091b = true;
            return this;
        }

        @o9.c("java.lang.ref.WeakReference")
        public b d() {
            this.f58091b = false;
            return this;
        }
    }

    /* JADX INFO: compiled from: Interners.java */
    public static class c<E> implements com.google.common.base.n<E, E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final j1<E> f58092b;

        public c(j1<E> j1Var) {
            this.f58092b = j1Var;
        }

        @Override // com.google.common.base.n
        public E apply(E e10) {
            return this.f58092b.a(e10);
        }

        @Override // com.google.common.base.n
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof c) {
                return this.f58092b.equals(((c) obj).f58092b);
            }
            return false;
        }

        public int hashCode() {
            return this.f58092b.hashCode();
        }
    }

    /* JADX INFO: compiled from: Interners.java */
    @o9.d
    public static final class d<E> implements j1<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @o9.d
        final MapMakerInternalMap<E, MapMaker.Dummy, ?, ?> f58093a;

        private d(MapMaker mapMaker) {
            this.f58093a = MapMakerInternalMap.e(mapMaker.h(Equivalence.c()));
        }

        @Override // com.google.common.collect.j1
        public E a(E e10) {
            E e11;
            do {
                MapMakerInternalMap.i iVarF = this.f58093a.f(e10);
                if (iVarF != null && (e11 = (E) iVarF.getKey()) != null) {
                    return e11;
                }
            } while (this.f58093a.putIfAbsent(e10, MapMaker.Dummy.VALUE) != null);
            return e10;
        }
    }

    private k1() {
    }

    public static <E> com.google.common.base.n<E, E> a(j1<E> j1Var) {
        return new c((j1) com.google.common.base.w.E(j1Var));
    }

    public static b b() {
        return new b();
    }

    public static <E> j1<E> c() {
        return b().c().a();
    }

    @o9.c("java.lang.ref.WeakReference")
    public static <E> j1<E> d() {
        return b().d().a();
    }
}
