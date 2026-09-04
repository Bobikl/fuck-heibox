package com.google.common.util.concurrent;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: AbstractTransformFuture.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@o9.b
public abstract class h<I, O, F, T> extends y.a<O> implements Runnable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @CheckForNull
    p0<? extends I> f59459j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @CheckForNull
    F f59460k;

    /* JADX INFO: compiled from: AbstractTransformFuture.java */
    public static final class a<I, O> extends h<I, O, m<? super I, ? extends O>, p0<? extends O>> {
        a(p0<? extends I> p0Var, m<? super I, ? extends O> mVar) {
            super(p0Var, mVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.h
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public p0<? extends O> P(m<? super I, ? extends O> mVar, @b1 I i10) throws Exception {
            p0<? extends O> p0VarApply = mVar.apply(i10);
            com.google.common.base.w.V(p0VarApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", mVar);
            return p0VarApply;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.h
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public void Q(p0<? extends O> p0Var) {
            D(p0Var);
        }
    }

    /* JADX INFO: compiled from: AbstractTransformFuture.java */
    public static final class b<I, O> extends h<I, O, com.google.common.base.n<? super I, ? extends O>, O> {
        b(p0<? extends I> p0Var, com.google.common.base.n<? super I, ? extends O> nVar) {
            super(p0Var, nVar);
        }

        @Override // com.google.common.util.concurrent.h
        void Q(@b1 O o10) {
            B(o10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.h
        @b1
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public O P(com.google.common.base.n<? super I, ? extends O> nVar, @b1 I i10) {
            return nVar.apply(i10);
        }
    }

    h(p0<? extends I> p0Var, F f10) {
        this.f59459j = (p0) com.google.common.base.w.E(p0Var);
        this.f59460k = (F) com.google.common.base.w.E(f10);
    }

    static <I, O> p0<O> N(p0<I> p0Var, com.google.common.base.n<? super I, ? extends O> nVar, Executor executor) {
        com.google.common.base.w.E(nVar);
        b bVar = new b(p0Var, nVar);
        p0Var.V(bVar, y0.p(executor, bVar));
        return bVar;
    }

    static <I, O> p0<O> O(p0<I> p0Var, m<? super I, ? extends O> mVar, Executor executor) {
        com.google.common.base.w.E(executor);
        a aVar = new a(p0Var, mVar);
        p0Var.V(aVar, y0.p(executor, aVar));
        return aVar;
    }

    @s9.g
    @b1
    abstract T P(F f10, @b1 I i10) throws Exception;

    @s9.g
    abstract void Q(@b1 T t10);

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected final void m() {
        x(this.f59459j);
        this.f59459j = null;
        this.f59460k = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        p0<? extends I> p0Var = this.f59459j;
        F f10 = this.f59460k;
        if ((isCancelled() | (p0Var == null)) || (f10 == null)) {
            return;
        }
        this.f59459j = null;
        if (p0Var.isCancelled()) {
            D(p0Var);
            return;
        }
        try {
            try {
                Object objP = P(f10, j0.h(p0Var));
                this.f59460k = null;
                Q(objP);
            } catch (Throwable th2) {
                try {
                    C(th2);
                } finally {
                    this.f59460k = null;
                }
            }
        } catch (Error e10) {
            C(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e11) {
            C(e11);
        } catch (ExecutionException e12) {
            C(e12.getCause());
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @CheckForNull
    protected String y() {
        String string;
        p0<? extends I> p0Var = this.f59459j;
        F f10 = this.f59460k;
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
        if (f10 == null) {
            if (strY == null) {
                return null;
            }
            String strValueOf2 = String.valueOf(string);
            return strY.length() != 0 ? strValueOf2.concat(strY) : new String(strValueOf2);
        }
        String strValueOf3 = String.valueOf(f10);
        StringBuilder sb3 = new StringBuilder(String.valueOf(string).length() + 11 + strValueOf3.length());
        sb3.append(string);
        sb3.append("function=[");
        sb3.append(strValueOf3);
        sb3.append("]");
        return sb3.toString();
    }
}
