package com.google.android.gms.tasks;

import android.app.Activity;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* JADX INFO: loaded from: classes7.dex */
public final class q0<TResult> extends k<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f52786a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l0 f52787b = new l0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    private boolean f52788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f52789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @GuardedBy("mLock")
    @androidx.annotation.p0
    private Object f52790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @GuardedBy("mLock")
    private Exception f52791f;

    q0() {
    }

    @GuardedBy("mLock")
    private final void D() {
        com.google.android.gms.common.internal.p.s(this.f52788c, "Task is not yet complete");
    }

    @GuardedBy("mLock")
    private final void E() {
        if (this.f52789d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    @GuardedBy("mLock")
    private final void F() {
        if (this.f52788c) {
            throw DuplicateTaskCompletionException.a(this);
        }
    }

    private final void G() {
        synchronized (this.f52786a) {
            if (this.f52788c) {
                this.f52787b.b(this);
            }
        }
    }

    public final boolean A() {
        synchronized (this.f52786a) {
            if (this.f52788c) {
                return false;
            }
            this.f52788c = true;
            this.f52789d = true;
            this.f52787b.b(this);
            return true;
        }
    }

    public final boolean B(@androidx.annotation.n0 Exception exc) {
        com.google.android.gms.common.internal.p.m(exc, "Exception must not be null");
        synchronized (this.f52786a) {
            if (this.f52788c) {
                return false;
            }
            this.f52788c = true;
            this.f52791f = exc;
            this.f52787b.b(this);
            return true;
        }
    }

    public final boolean C(@androidx.annotation.p0 Object obj) {
        synchronized (this.f52786a) {
            if (this.f52788c) {
                return false;
            }
            this.f52788c = true;
            this.f52790e = obj;
            this.f52787b.b(this);
            return true;
        }
    }

    @Override // com.google.android.gms.tasks.k
    @androidx.annotation.n0
    public final k<TResult> a(@androidx.annotation.n0 Activity activity, @androidx.annotation.n0 d dVar) {
        b0 b0Var = new b0(m.f52778a, dVar);
        this.f52787b.a(b0Var);
        p0.m(activity).n(b0Var);
        G();
        return this;
    }

    @Override // com.google.android.gms.tasks.k
    @androidx.annotation.n0
    public final k<TResult> b(@androidx.annotation.n0 d dVar) {
        c(m.f52778a, dVar);
        return this;
    }

    @Override // com.google.android.gms.tasks.k
    @androidx.annotation.n0
    public final k<TResult> c(@androidx.annotation.n0 Executor executor, @androidx.annotation.n0 d dVar) {
        this.f52787b.a(new b0(executor, dVar));
        G();
        return this;
    }

    @Override // com.google.android.gms.tasks.k
    @androidx.annotation.n0
    public final k<TResult> d(@androidx.annotation.n0 Activity activity, @androidx.annotation.n0 e<TResult> eVar) {
        d0 d0Var = new d0(m.f52778a, eVar);
        this.f52787b.a(d0Var);
        p0.m(activity).n(d0Var);
        G();
        return this;
    }

    @Override // com.google.android.gms.tasks.k
    @androidx.annotation.n0
    public final k<TResult> e(@androidx.annotation.n0 e<TResult> eVar) {
        this.f52787b.a(new d0(m.f52778a, eVar));
        G();
        return this;
    }

    @Override // com.google.android.gms.tasks.k
    @androidx.annotation.n0
    public final k<TResult> f(@androidx.annotation.n0 Executor executor, @androidx.annotation.n0 e<TResult> eVar) {
        this.f52787b.a(new d0(executor, eVar));
        G();
        return this;
    }

    @Override // com.google.android.gms.tasks.k
    @androidx.annotation.n0
    public final k<TResult> g(@androidx.annotation.n0 Activity activity, @androidx.annotation.n0 f fVar) {
        f0 f0Var = new f0(m.f52778a, fVar);
        this.f52787b.a(f0Var);
        p0.m(activity).n(f0Var);
        G();
        return this;
    }

    @Override // com.google.android.gms.tasks.k
    @androidx.annotation.n0
    public final k<TResult> h(@androidx.annotation.n0 f fVar) {
        i(m.f52778a, fVar);
        return this;
    }

    @Override // com.google.android.gms.tasks.k
    @androidx.annotation.n0
    public final k<TResult> i(@androidx.annotation.n0 Executor executor, @androidx.annotation.n0 f fVar) {
        this.f52787b.a(new f0(executor, fVar));
        G();
        return this;
    }

    @Override // com.google.android.gms.tasks.k
    @androidx.annotation.n0
    public final k<TResult> j(@androidx.annotation.n0 Activity activity, @androidx.annotation.n0 g<? super TResult> gVar) {
        h0 h0Var = new h0(m.f52778a, gVar);
        this.f52787b.a(h0Var);
        p0.m(activity).n(h0Var);
        G();
        return this;
    }

    @Override // com.google.android.gms.tasks.k
    @androidx.annotation.n0
    public final k<TResult> k(@androidx.annotation.n0 g<? super TResult> gVar) {
        l(m.f52778a, gVar);
        return this;
    }

    @Override // com.google.android.gms.tasks.k
    @androidx.annotation.n0
    public final k<TResult> l(@androidx.annotation.n0 Executor executor, @androidx.annotation.n0 g<? super TResult> gVar) {
        this.f52787b.a(new h0(executor, gVar));
        G();
        return this;
    }

    @Override // com.google.android.gms.tasks.k
    @androidx.annotation.n0
    public final <TContinuationResult> k<TContinuationResult> m(@androidx.annotation.n0 c<TResult, TContinuationResult> cVar) {
        return n(m.f52778a, cVar);
    }

    @Override // com.google.android.gms.tasks.k
    @androidx.annotation.n0
    public final <TContinuationResult> k<TContinuationResult> n(@androidx.annotation.n0 Executor executor, @androidx.annotation.n0 c<TResult, TContinuationResult> cVar) {
        q0 q0Var = new q0();
        this.f52787b.a(new x(executor, cVar, q0Var));
        G();
        return q0Var;
    }

    @Override // com.google.android.gms.tasks.k
    @androidx.annotation.n0
    public final <TContinuationResult> k<TContinuationResult> o(@androidx.annotation.n0 c<TResult, k<TContinuationResult>> cVar) {
        return p(m.f52778a, cVar);
    }

    @Override // com.google.android.gms.tasks.k
    @androidx.annotation.n0
    public final <TContinuationResult> k<TContinuationResult> p(@androidx.annotation.n0 Executor executor, @androidx.annotation.n0 c<TResult, k<TContinuationResult>> cVar) {
        q0 q0Var = new q0();
        this.f52787b.a(new z(executor, cVar, q0Var));
        G();
        return q0Var;
    }

    @Override // com.google.android.gms.tasks.k
    @androidx.annotation.p0
    public final Exception q() {
        Exception exc;
        synchronized (this.f52786a) {
            exc = this.f52791f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.k
    public final TResult r() {
        TResult tresult;
        synchronized (this.f52786a) {
            D();
            E();
            Exception exc = this.f52791f;
            if (exc != null) {
                throw new RuntimeExecutionException(exc);
            }
            tresult = (TResult) this.f52790e;
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.k
    public final <X extends Throwable> TResult s(@androidx.annotation.n0 Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f52786a) {
            D();
            E();
            if (cls.isInstance(this.f52791f)) {
                throw cls.cast(this.f52791f);
            }
            Exception exc = this.f52791f;
            if (exc != null) {
                throw new RuntimeExecutionException(exc);
            }
            tresult = (TResult) this.f52790e;
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.k
    public final boolean t() {
        return this.f52789d;
    }

    @Override // com.google.android.gms.tasks.k
    public final boolean u() {
        boolean z10;
        synchronized (this.f52786a) {
            z10 = this.f52788c;
        }
        return z10;
    }

    @Override // com.google.android.gms.tasks.k
    public final boolean v() {
        boolean z10;
        synchronized (this.f52786a) {
            z10 = false;
            if (this.f52788c && !this.f52789d && this.f52791f == null) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.tasks.k
    @androidx.annotation.n0
    public final <TContinuationResult> k<TContinuationResult> w(@androidx.annotation.n0 j<TResult, TContinuationResult> jVar) {
        Executor executor = m.f52778a;
        q0 q0Var = new q0();
        this.f52787b.a(new j0(executor, jVar, q0Var));
        G();
        return q0Var;
    }

    @Override // com.google.android.gms.tasks.k
    @androidx.annotation.n0
    public final <TContinuationResult> k<TContinuationResult> x(Executor executor, j<TResult, TContinuationResult> jVar) {
        q0 q0Var = new q0();
        this.f52787b.a(new j0(executor, jVar, q0Var));
        G();
        return q0Var;
    }

    public final void y(@androidx.annotation.n0 Exception exc) {
        com.google.android.gms.common.internal.p.m(exc, "Exception must not be null");
        synchronized (this.f52786a) {
            F();
            this.f52788c = true;
            this.f52791f = exc;
        }
        this.f52787b.b(this);
    }

    public final void z(@androidx.annotation.p0 Object obj) {
        synchronized (this.f52786a) {
            F();
            this.f52788c = true;
            this.f52790e = obj;
        }
        this.f52787b.b(this);
    }
}
