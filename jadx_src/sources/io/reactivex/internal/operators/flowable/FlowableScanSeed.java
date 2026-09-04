package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableScanSeed<T, R> extends a<T, R> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.c<R, ? super T, R> f120685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Callable<R> f120686e;

    public static final class ScanSeedSubscriber<T, R> extends AtomicInteger implements io.reactivex.o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -1776795561228106469L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.d<? super R> f120687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.c<R, ? super T, R> f120688c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final lh.n<R> f120689d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicLong f120690e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f120691f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final int f120692g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f120693h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f120694i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Throwable f120695j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        org.reactivestreams.e f120696k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        R f120697l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f120698m;

        ScanSeedSubscriber(org.reactivestreams.d<? super R> dVar, kh.c<R, ? super T, R> cVar, R r10, int i10) {
            this.f120687b = dVar;
            this.f120688c = cVar;
            this.f120697l = r10;
            this.f120691f = i10;
            this.f120692g = i10 - (i10 >> 2);
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(i10);
            this.f120689d = spscArrayQueue;
            spscArrayQueue.offer(r10);
            this.f120690e = new AtomicLong();
        }

        void a() {
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.d<? super R> dVar = this.f120687b;
            lh.n<R> nVar = this.f120689d;
            int i10 = this.f120692g;
            int i11 = this.f120698m;
            int iAddAndGet = 1;
            do {
                long j10 = this.f120690e.get();
                long j11 = 0;
                while (j11 != j10) {
                    if (this.f120693h) {
                        nVar.clear();
                        return;
                    }
                    boolean z10 = this.f120694i;
                    if (z10 && (th2 = this.f120695j) != null) {
                        nVar.clear();
                        dVar.onError(th2);
                        return;
                    }
                    R rPoll = nVar.poll();
                    boolean z11 = rPoll == null;
                    if (z10 && z11) {
                        dVar.onComplete();
                        return;
                    }
                    if (z11) {
                        break;
                    }
                    dVar.onNext(rPoll);
                    j11++;
                    i11++;
                    if (i11 == i10) {
                        this.f120696k.request(i10);
                        i11 = 0;
                    }
                }
                if (j11 == j10 && this.f120694i) {
                    Throwable th3 = this.f120695j;
                    if (th3 != null) {
                        nVar.clear();
                        dVar.onError(th3);
                        return;
                    } else if (nVar.isEmpty()) {
                        dVar.onComplete();
                        return;
                    }
                }
                if (j11 != 0) {
                    io.reactivex.internal.util.b.e(this.f120690e, j11);
                }
                this.f120698m = i11;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f120693h = true;
            this.f120696k.cancel();
            if (getAndIncrement() == 0) {
                this.f120689d.clear();
            }
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            if (this.f120694i) {
                return;
            }
            this.f120694i = true;
            a();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f120694i) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f120695j = th2;
            this.f120694i = true;
            a();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f120694i) {
                return;
            }
            try {
                R r10 = (R) io.reactivex.internal.functions.a.g(this.f120688c.apply(this.f120697l, t10), "The accumulator returned a null value");
                this.f120697l = r10;
                this.f120689d.offer(r10);
                a();
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f120696k.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.o, org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.validate(this.f120696k, eVar)) {
                this.f120696k = eVar;
                this.f120687b.onSubscribe(this);
                eVar.request(this.f120691f - 1);
            }
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f120690e, j10);
                a();
            }
        }
    }

    public FlowableScanSeed(io.reactivex.j<T> jVar, Callable<R> callable, kh.c<R, ? super T, R> cVar) {
        super(jVar);
        this.f120685d = cVar;
        this.f120686e = callable;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super R> dVar) {
        try {
            this.f121039c.j6(new ScanSeedSubscriber(dVar, this.f120685d, io.reactivex.internal.functions.a.g(this.f120686e.call(), "The seed supplied is null"), io.reactivex.j.Y()));
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            EmptySubscription.error(th2, dVar);
        }
    }
}
