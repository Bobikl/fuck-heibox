package com.google.common.util.concurrent;

import java.lang.Throwable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: AbstractCatchingFuture.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@o9.b
public abstract class a<V, X extends Throwable, F, T> extends y.a<V> implements Runnable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @CheckForNull
    p0<? extends V> f59378j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @CheckForNull
    Class<X> f59379k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @CheckForNull
    F f59380l;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractCatchingFuture.java */
    public static final class C0484a<V, X extends Throwable> extends a<V, X, m<? super X, ? extends V>, p0<? extends V>> {
        C0484a(p0<? extends V> p0Var, Class<X> cls, m<? super X, ? extends V> mVar) {
            super(p0Var, cls, mVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.a
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public p0<? extends V> P(m<? super X, ? extends V> mVar, X x10) throws Exception {
            p0<? extends V> p0VarApply = mVar.apply(x10);
            com.google.common.base.w.V(p0VarApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", mVar);
            return p0VarApply;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.a
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public void Q(p0<? extends V> p0Var) {
            D(p0Var);
        }
    }

    /* JADX INFO: compiled from: AbstractCatchingFuture.java */
    public static final class b<V, X extends Throwable> extends a<V, X, com.google.common.base.n<? super X, ? extends V>, V> {
        b(p0<? extends V> p0Var, Class<X> cls, com.google.common.base.n<? super X, ? extends V> nVar) {
            super(p0Var, cls, nVar);
        }

        @Override // com.google.common.util.concurrent.a
        void Q(@b1 V v10) {
            B(v10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.a
        @b1
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public V P(com.google.common.base.n<? super X, ? extends V> nVar, X x10) throws Exception {
            return nVar.apply(x10);
        }
    }

    a(p0<? extends V> p0Var, Class<X> cls, F f10) {
        this.f59378j = (p0) com.google.common.base.w.E(p0Var);
        this.f59379k = (Class) com.google.common.base.w.E(cls);
        this.f59380l = (F) com.google.common.base.w.E(f10);
    }

    static <V, X extends Throwable> p0<V> N(p0<? extends V> p0Var, Class<X> cls, com.google.common.base.n<? super X, ? extends V> nVar, Executor executor) {
        b bVar = new b(p0Var, cls, nVar);
        p0Var.V(bVar, y0.p(executor, bVar));
        return bVar;
    }

    static <X extends Throwable, V> p0<V> O(p0<? extends V> p0Var, Class<X> cls, m<? super X, ? extends V> mVar, Executor executor) {
        C0484a c0484a = new C0484a(p0Var, cls, mVar);
        p0Var.V(c0484a, y0.p(executor, c0484a));
        return c0484a;
    }

    @s9.g
    @b1
    abstract T P(F f10, X x10) throws Exception;

    @s9.g
    abstract void Q(@b1 T t10);

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected final void m() {
        x(this.f59378j);
        this.f59378j = null;
        this.f59379k = null;
        this.f59380l = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [F, java.lang.Class<X extends java.lang.Throwable>] */
    @Override // java.lang.Runnable
    public final void run() {
        Object objH;
        p0<? extends V> p0Var = this.f59378j;
        Class<X> cls = this.f59379k;
        F f10 = this.f59380l;
        if (((f10 == null) || ((p0Var == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        ?? r10 = (Class<X>) null;
        this.f59378j = null;
        try {
            th = p0Var instanceof com.google.common.util.concurrent.internal.a ? com.google.common.util.concurrent.internal.b.a((com.google.common.util.concurrent.internal.a) p0Var) : null;
            objH = th == null ? j0.h(p0Var) : null;
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                String strValueOf = String.valueOf(p0Var.getClass());
                String strValueOf2 = String.valueOf(e10.getClass());
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 35 + strValueOf2.length());
                sb2.append("Future type ");
                sb2.append(strValueOf);
                sb2.append(" threw ");
                sb2.append(strValueOf2);
                sb2.append(" without a cause");
                cause = new NullPointerException(sb2.toString());
            }
            th = cause;
        } catch (Throwable th2) {
            th = th2;
        }
        if (th == null) {
            B(z0.a(objH));
            return;
        }
        if (!d1.a(th, cls)) {
            D(p0Var);
            return;
        }
        try {
            Object objP = P(f10, th);
            this.f59379k = null;
            this.f59380l = null;
            Q(objP);
        } catch (Throwable th3) {
            try {
                C(th3);
            } finally {
                this.f59379k = null;
                this.f59380l = null;
            }
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @CheckForNull
    protected String y() {
        String string;
        p0<? extends V> p0Var = this.f59378j;
        Class<X> cls = this.f59379k;
        F f10 = this.f59380l;
        String strY = super.y();
        if (p0Var != null) {
            String strValueOf = String.valueOf(p0Var);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 16);
            sb2.append("inputFuture=[");
            sb2.append(strValueOf);
            sb2.append("], ");
            string = sb2.toString();
        } else {
            string = "";
        }
        if (cls == null || f10 == null) {
            if (strY == null) {
                return null;
            }
            String strValueOf2 = String.valueOf(string);
            return strY.length() != 0 ? strValueOf2.concat(strY) : new String(strValueOf2);
        }
        String strValueOf3 = String.valueOf(cls);
        String strValueOf4 = String.valueOf(f10);
        StringBuilder sb3 = new StringBuilder(String.valueOf(string).length() + 29 + strValueOf3.length() + strValueOf4.length());
        sb3.append(string);
        sb3.append("exceptionType=[");
        sb3.append(strValueOf3);
        sb3.append("], fallback=[");
        sb3.append(strValueOf4);
        sb3.append("]");
        return sb3.toString();
    }
}
