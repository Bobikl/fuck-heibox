package io.reactivex.internal.schedulers;

import io.reactivex.h0;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.processors.UnicastProcessor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kh.o;

/* JADX INFO: loaded from: classes5.dex */
public class SchedulerWhen extends h0 implements io.reactivex.disposables.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final io.reactivex.disposables.b f123647f = new d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final io.reactivex.disposables.b f123648g = io.reactivex.disposables.c.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h0 f123649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.reactivex.processors.a<io.reactivex.j<io.reactivex.a>> f123650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private io.reactivex.disposables.b f123651e;

    public static class DelayedAction extends ScheduledAction {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runnable f123652b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f123653c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final TimeUnit f123654d;

        DelayedAction(Runnable runnable, long j10, TimeUnit timeUnit) {
            this.f123652b = runnable;
            this.f123653c = j10;
            this.f123654d = timeUnit;
        }

        @Override // io.reactivex.internal.schedulers.SchedulerWhen.ScheduledAction
        protected io.reactivex.disposables.b b(h0.c cVar, io.reactivex.d dVar) {
            return cVar.c(new b(this.f123652b, dVar), this.f123653c, this.f123654d);
        }
    }

    public static class ImmediateAction extends ScheduledAction {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runnable f123655b;

        ImmediateAction(Runnable runnable) {
            this.f123655b = runnable;
        }

        @Override // io.reactivex.internal.schedulers.SchedulerWhen.ScheduledAction
        protected io.reactivex.disposables.b b(h0.c cVar, io.reactivex.d dVar) {
            return cVar.b(new b(this.f123655b, dVar));
        }
    }

    public static abstract class ScheduledAction extends AtomicReference<io.reactivex.disposables.b> implements io.reactivex.disposables.b {
        ScheduledAction() {
            super(SchedulerWhen.f123647f);
        }

        void a(h0.c cVar, io.reactivex.d dVar) {
            io.reactivex.disposables.b bVar;
            io.reactivex.disposables.b bVar2 = get();
            if (bVar2 != SchedulerWhen.f123648g && bVar2 == (bVar = SchedulerWhen.f123647f)) {
                io.reactivex.disposables.b bVarB = b(cVar, dVar);
                if (compareAndSet(bVar, bVarB)) {
                    return;
                }
                bVarB.dispose();
            }
        }

        protected abstract io.reactivex.disposables.b b(h0.c cVar, io.reactivex.d dVar);

        @Override // io.reactivex.disposables.b
        public void dispose() {
            io.reactivex.disposables.b bVar;
            io.reactivex.disposables.b bVar2 = SchedulerWhen.f123648g;
            do {
                bVar = get();
                if (bVar == SchedulerWhen.f123648g) {
                    return;
                }
            } while (!compareAndSet(bVar, bVar2));
            if (bVar != SchedulerWhen.f123647f) {
                bVar.dispose();
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return get().isDisposed();
        }
    }

    public static final class a implements o<ScheduledAction, io.reactivex.a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final h0.c f123656b;

        /* JADX INFO: renamed from: io.reactivex.internal.schedulers.SchedulerWhen$a$a, reason: collision with other inner class name */
        public final class C1110a extends io.reactivex.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final ScheduledAction f123657b;

            C1110a(ScheduledAction scheduledAction) {
                this.f123657b = scheduledAction;
            }

            @Override // io.reactivex.a
            protected void J0(io.reactivex.d dVar) {
                dVar.onSubscribe(this.f123657b);
                this.f123657b.a(a.this.f123656b, dVar);
            }
        }

        a(h0.c cVar) {
            this.f123656b = cVar;
        }

        @Override // kh.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public io.reactivex.a apply(ScheduledAction scheduledAction) {
            return new C1110a(scheduledAction);
        }
    }

    public static class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.d f123659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Runnable f123660c;

        b(Runnable runnable, io.reactivex.d dVar) {
            this.f123660c = runnable;
            this.f123659b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f123660c.run();
            } finally {
                this.f123659b.onComplete();
            }
        }
    }

    public static final class c extends h0.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f123661b = new AtomicBoolean();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.reactivex.processors.a<ScheduledAction> f123662c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final h0.c f123663d;

        c(io.reactivex.processors.a<ScheduledAction> aVar, h0.c cVar) {
            this.f123662c = aVar;
            this.f123663d = cVar;
        }

        @Override // io.reactivex.h0.c
        @jh.e
        public io.reactivex.disposables.b b(@jh.e Runnable runnable) {
            ImmediateAction immediateAction = new ImmediateAction(runnable);
            this.f123662c.onNext(immediateAction);
            return immediateAction;
        }

        @Override // io.reactivex.h0.c
        @jh.e
        public io.reactivex.disposables.b c(@jh.e Runnable runnable, long j10, @jh.e TimeUnit timeUnit) {
            DelayedAction delayedAction = new DelayedAction(runnable, j10, timeUnit);
            this.f123662c.onNext(delayedAction);
            return delayedAction;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f123661b.compareAndSet(false, true)) {
                this.f123662c.onComplete();
                this.f123663d.dispose();
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f123661b.get();
        }
    }

    public static final class d implements io.reactivex.disposables.b {
        d() {
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SchedulerWhen(o<io.reactivex.j<io.reactivex.j<io.reactivex.a>>, io.reactivex.a> oVar, h0 h0Var) {
        this.f123649c = h0Var;
        io.reactivex.processors.a aVarQ8 = UnicastProcessor.S8().Q8();
        this.f123650d = aVarQ8;
        try {
            this.f123651e = ((io.reactivex.a) oVar.apply(aVarQ8)).G0();
        } catch (Throwable th2) {
            throw ExceptionHelper.f(th2);
        }
    }

    @Override // io.reactivex.h0
    @jh.e
    public h0.c c() {
        h0.c cVarC = this.f123649c.c();
        io.reactivex.processors.a<T> aVarQ8 = UnicastProcessor.S8().Q8();
        io.reactivex.j<io.reactivex.a> jVarK3 = aVarQ8.K3(new a(cVarC));
        c cVar = new c(aVarQ8, cVarC);
        this.f123650d.onNext(jVarK3);
        return cVar;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        this.f123651e.dispose();
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return this.f123651e.isDisposed();
    }
}
