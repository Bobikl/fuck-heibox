package com.google.common.util.concurrent;

import com.google.common.collect.Sets;
import com.google.j2objc.annotations.ReflectionSupport;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: AggregateFutureState.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@ReflectionSupport(ReflectionSupport.Level.FULL)
@o9.b(emulated = true)
public abstract class k<OutputT> extends AbstractFuture.i<OutputT> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final b f59493l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Logger f59494m = Logger.getLogger(k.class.getName());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @CheckForNull
    private volatile Set<Throwable> f59495j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile int f59496k;

    /* JADX INFO: compiled from: AggregateFutureState.java */
    public static abstract class b {
        private b() {
        }

        abstract void a(k<?> kVar, @CheckForNull Set<Throwable> set, Set<Throwable> set2);

        abstract int b(k<?> kVar);
    }

    /* JADX INFO: compiled from: AggregateFutureState.java */
    public static final class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<k<?>, Set<Throwable>> f59497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicIntegerFieldUpdater<k<?>> f59498b;

        c(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.f59497a = atomicReferenceFieldUpdater;
            this.f59498b = atomicIntegerFieldUpdater;
        }

        @Override // com.google.common.util.concurrent.k.b
        void a(k<?> kVar, @CheckForNull Set<Throwable> set, Set<Throwable> set2) {
            androidx.concurrent.futures.a.a(this.f59497a, kVar, set, set2);
        }

        @Override // com.google.common.util.concurrent.k.b
        int b(k<?> kVar) {
            return this.f59498b.decrementAndGet(kVar);
        }
    }

    /* JADX INFO: compiled from: AggregateFutureState.java */
    public static final class d extends b {
        private d() {
            super();
        }

        @Override // com.google.common.util.concurrent.k.b
        void a(k<?> kVar, @CheckForNull Set<Throwable> set, Set<Throwable> set2) {
            synchronized (kVar) {
                if (((k) kVar).f59495j == set) {
                    ((k) kVar).f59495j = set2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.k.b
        int b(k<?> kVar) {
            int iH;
            synchronized (kVar) {
                iH = k.H(kVar);
            }
            return iH;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        b cVar;
        Throwable th2 = null;
        Object[] objArr = 0;
        try {
            cVar = new c(AtomicReferenceFieldUpdater.newUpdater(k.class, Set.class, "j"), AtomicIntegerFieldUpdater.newUpdater(k.class, "k"));
        } catch (Throwable th3) {
            d dVar = new d();
            th2 = th3;
            cVar = dVar;
        }
        f59493l = cVar;
        if (th2 != null) {
            f59494m.log(Level.SEVERE, "SafeAtomicHelper is broken!", th2);
        }
    }

    k(int i10) {
        this.f59496k = i10;
    }

    static /* synthetic */ int H(k kVar) {
        int i10 = kVar.f59496k - 1;
        kVar.f59496k = i10;
        return i10;
    }

    abstract void I(Set<Throwable> set);

    final void J() {
        this.f59495j = null;
    }

    final int K() {
        return f59493l.b(this);
    }

    final Set<Throwable> L() {
        Set<Throwable> set = this.f59495j;
        if (set != null) {
            return set;
        }
        Set<Throwable> setP = Sets.p();
        I(setP);
        f59493l.a(this, null, setP);
        Set<Throwable> set2 = this.f59495j;
        Objects.requireNonNull(set2);
        return set2;
    }
}
