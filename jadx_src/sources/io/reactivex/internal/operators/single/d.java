package io.reactivex.internal.operators.single;

import io.reactivex.h0;
import io.reactivex.i0;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.l0;
import io.reactivex.o0;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: SingleDelay.java */
/* JADX INFO: loaded from: classes5.dex */
public final class d<T> extends i0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final o0<? extends T> f123501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f123502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f123503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final h0 f123504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f123505f;

    /* JADX INFO: compiled from: SingleDelay.java */
    public final class a implements l0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SequentialDisposable f123506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final l0<? super T> f123507c;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.single.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SingleDelay.java */
        public final class RunnableC1109a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Throwable f123509b;

            RunnableC1109a(Throwable th2) {
                this.f123509b = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f123507c.onError(this.f123509b);
            }
        }

        /* JADX INFO: compiled from: SingleDelay.java */
        public final class b implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final T f123511b;

            b(T t10) {
                this.f123511b = t10;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f123507c.onSuccess(this.f123511b);
            }
        }

        a(SequentialDisposable sequentialDisposable, l0<? super T> l0Var) {
            this.f123506b = sequentialDisposable;
            this.f123507c = l0Var;
        }

        @Override // io.reactivex.l0
        public void onError(Throwable th2) {
            SequentialDisposable sequentialDisposable = this.f123506b;
            h0 h0Var = d.this.f123504e;
            RunnableC1109a runnableC1109a = new RunnableC1109a(th2);
            d dVar = d.this;
            sequentialDisposable.a(h0Var.g(runnableC1109a, dVar.f123505f ? dVar.f123502c : 0L, dVar.f123503d));
        }

        @Override // io.reactivex.l0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f123506b.a(bVar);
        }

        @Override // io.reactivex.l0
        public void onSuccess(T t10) {
            SequentialDisposable sequentialDisposable = this.f123506b;
            h0 h0Var = d.this.f123504e;
            b bVar = new b(t10);
            d dVar = d.this;
            sequentialDisposable.a(h0Var.g(bVar, dVar.f123502c, dVar.f123503d));
        }
    }

    public d(o0<? extends T> o0Var, long j10, TimeUnit timeUnit, h0 h0Var, boolean z10) {
        this.f123501b = o0Var;
        this.f123502c = j10;
        this.f123503d = timeUnit;
        this.f123504e = h0Var;
        this.f123505f = z10;
    }

    @Override // io.reactivex.i0
    protected void c1(l0<? super T> l0Var) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        l0Var.onSubscribe(sequentialDisposable);
        this.f123501b.f(new a(sequentialDisposable, l0Var));
    }
}
