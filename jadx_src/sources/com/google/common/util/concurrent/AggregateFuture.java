package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.b3;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@u
@o9.b
public abstract class AggregateFuture<InputT, OutputT> extends k<OutputT> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Logger f59196q = Logger.getLogger(AggregateFuture.class.getName());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @CheckForNull
    private ImmutableCollection<? extends p0<? extends InputT>> f59197n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f59198o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f59199p;

    public enum ReleaseResourcesReason {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    AggregateFuture(ImmutableCollection<? extends p0<? extends InputT>> immutableCollection, boolean z10, boolean z11) {
        super(immutableCollection.size());
        this.f59197n = (ImmutableCollection) com.google.common.base.w.E(immutableCollection);
        this.f59198o = z10;
        this.f59199p = z11;
    }

    private static boolean O(Set<Throwable> set, Throwable th2) {
        while (th2 != null) {
            if (!set.add(th2)) {
                return false;
            }
            th2 = th2.getCause();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Q(int i10, Future<? extends InputT> future) {
        try {
            P(i10, j0.h(future));
        } catch (ExecutionException e10) {
            T(e10.getCause());
        } catch (Throwable th2) {
            T(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void X(@CheckForNull ImmutableCollection<? extends Future<? extends InputT>> immutableCollection) {
        int iK = K();
        com.google.common.base.w.h0(iK >= 0, "Less than 0 remaining futures");
        if (iK == 0) {
            Z(immutableCollection);
        }
    }

    private void T(Throwable th2) {
        com.google.common.base.w.E(th2);
        if (this.f59198o && !C(th2) && O(L(), th2)) {
            Y(th2);
        } else if (th2 instanceof Error) {
            Y(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W(p0 p0Var, int i10) {
        try {
            if (p0Var.isCancelled()) {
                this.f59197n = null;
                cancel(false);
            } else {
                Q(i10, p0Var);
            }
        } finally {
            X(null);
        }
    }

    private static void Y(Throwable th2) {
        f59196q.log(Level.SEVERE, th2 instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th2);
    }

    private void Z(@CheckForNull ImmutableCollection<? extends Future<? extends InputT>> immutableCollection) {
        if (immutableCollection != null) {
            int i10 = 0;
            b3<? extends Future<? extends InputT>> it = immutableCollection.iterator();
            while (it.hasNext()) {
                Future<? extends InputT> next = it.next();
                if (!next.isCancelled()) {
                    Q(i10, next);
                }
                i10++;
            }
        }
        J();
        S();
        a0(ReleaseResourcesReason.ALL_INPUT_FUTURES_PROCESSED);
    }

    @Override // com.google.common.util.concurrent.k
    final void I(Set<Throwable> set) {
        com.google.common.base.w.E(set);
        if (isCancelled()) {
            return;
        }
        Throwable thA = a();
        Objects.requireNonNull(thA);
        O(set, thA);
    }

    abstract void P(int i10, @b1 InputT inputt);

    abstract void S();

    final void U() {
        Objects.requireNonNull(this.f59197n);
        if (this.f59197n.isEmpty()) {
            S();
            return;
        }
        if (!this.f59198o) {
            final ImmutableCollection<? extends p0<? extends InputT>> immutableCollection = this.f59199p ? this.f59197n : null;
            Runnable runnable = new Runnable() { // from class: com.google.common.util.concurrent.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f59467b.X(immutableCollection);
                }
            };
            b3<? extends p0<? extends InputT>> it = this.f59197n.iterator();
            while (it.hasNext()) {
                it.next().V(runnable, y0.c());
            }
            return;
        }
        final int i10 = 0;
        b3<? extends p0<? extends InputT>> it2 = this.f59197n.iterator();
        while (it2.hasNext()) {
            final p0<? extends InputT> next = it2.next();
            next.V(new Runnable() { // from class: com.google.common.util.concurrent.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f59461b.W(next, i10);
                }
            }, y0.c());
            i10++;
        }
    }

    @s9.q
    @s9.g
    void a0(ReleaseResourcesReason releaseResourcesReason) {
        com.google.common.base.w.E(releaseResourcesReason);
        this.f59197n = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected final void m() {
        super.m();
        ImmutableCollection<? extends p0<? extends InputT>> immutableCollection = this.f59197n;
        a0(ReleaseResourcesReason.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (immutableCollection != null)) {
            boolean zE = E();
            b3<? extends p0<? extends InputT>> it = immutableCollection.iterator();
            while (it.hasNext()) {
                it.next().cancel(zE);
            }
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @CheckForNull
    protected final String y() {
        ImmutableCollection<? extends p0<? extends InputT>> immutableCollection = this.f59197n;
        if (immutableCollection == null) {
            return super.y();
        }
        String strValueOf = String.valueOf(immutableCollection);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 8);
        sb2.append("futures=");
        sb2.append(strValueOf);
        return sb2.toString();
    }
}
