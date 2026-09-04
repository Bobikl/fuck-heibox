package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableSequenceEqual<T> extends io.reactivex.z<Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.e0<? extends T> f122506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.e0<? extends T> f122507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.d<? super T, ? super T> f122508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f122509e;

    public static final class EqualCoordinator<T> extends AtomicInteger implements io.reactivex.disposables.b {
        private static final long serialVersionUID = -6178010334400373240L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super Boolean> f122510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.d<? super T, ? super T> f122511c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final ArrayCompositeDisposable f122512d = new ArrayCompositeDisposable(2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.e0<? extends T> f122513e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.e0<? extends T> f122514f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final a<T>[] f122515g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f122516h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        T f122517i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        T f122518j;

        EqualCoordinator(io.reactivex.g0<? super Boolean> g0Var, int i10, io.reactivex.e0<? extends T> e0Var, io.reactivex.e0<? extends T> e0Var2, kh.d<? super T, ? super T> dVar) {
            this.f122510b = g0Var;
            this.f122513e = e0Var;
            this.f122514f = e0Var2;
            this.f122511c = dVar;
            this.f122515g = new a[]{new a<>(this, 0, i10), new a<>(this, 1, i10)};
        }

        void a(io.reactivex.internal.queue.a<T> aVar, io.reactivex.internal.queue.a<T> aVar2) {
            this.f122516h = true;
            aVar.clear();
            aVar2.clear();
        }

        void b() {
            Throwable th2;
            Throwable th3;
            if (getAndIncrement() != 0) {
                return;
            }
            a<T>[] aVarArr = this.f122515g;
            a<T> aVar = aVarArr[0];
            io.reactivex.internal.queue.a<T> aVar2 = aVar.f122520c;
            a<T> aVar3 = aVarArr[1];
            io.reactivex.internal.queue.a<T> aVar4 = aVar3.f122520c;
            int iAddAndGet = 1;
            while (!this.f122516h) {
                boolean z10 = aVar.f122522e;
                if (z10 && (th3 = aVar.f122523f) != null) {
                    a(aVar2, aVar4);
                    this.f122510b.onError(th3);
                    return;
                }
                boolean z11 = aVar3.f122522e;
                if (z11 && (th2 = aVar3.f122523f) != null) {
                    a(aVar2, aVar4);
                    this.f122510b.onError(th2);
                    return;
                }
                if (this.f122517i == null) {
                    this.f122517i = aVar2.poll();
                }
                boolean z12 = this.f122517i == null;
                if (this.f122518j == null) {
                    this.f122518j = aVar4.poll();
                }
                T t10 = this.f122518j;
                boolean z13 = t10 == null;
                if (z10 && z11 && z12 && z13) {
                    this.f122510b.onNext(Boolean.TRUE);
                    this.f122510b.onComplete();
                    return;
                }
                if (z10 && z11 && z12 != z13) {
                    a(aVar2, aVar4);
                    this.f122510b.onNext(Boolean.FALSE);
                    this.f122510b.onComplete();
                    return;
                }
                if (!z12 && !z13) {
                    try {
                        if (!this.f122511c.test(this.f122517i, t10)) {
                            a(aVar2, aVar4);
                            this.f122510b.onNext(Boolean.FALSE);
                            this.f122510b.onComplete();
                            return;
                        }
                        this.f122517i = null;
                        this.f122518j = null;
                    } catch (Throwable th4) {
                        io.reactivex.exceptions.a.b(th4);
                        a(aVar2, aVar4);
                        this.f122510b.onError(th4);
                        return;
                    }
                }
                if (z12 || z13) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            aVar2.clear();
            aVar4.clear();
        }

        boolean c(io.reactivex.disposables.b bVar, int i10) {
            return this.f122512d.b(i10, bVar);
        }

        void d() {
            a<T>[] aVarArr = this.f122515g;
            this.f122513e.g(aVarArr[0]);
            this.f122514f.g(aVarArr[1]);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f122516h) {
                return;
            }
            this.f122516h = true;
            this.f122512d.dispose();
            if (getAndIncrement() == 0) {
                a<T>[] aVarArr = this.f122515g;
                aVarArr[0].f122520c.clear();
                aVarArr[1].f122520c.clear();
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122516h;
        }
    }

    public static final class a<T> implements io.reactivex.g0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final EqualCoordinator<T> f122519b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.internal.queue.a<T> f122520c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f122521d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f122522e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Throwable f122523f;

        a(EqualCoordinator<T> equalCoordinator, int i10, int i11) {
            this.f122519b = equalCoordinator;
            this.f122521d = i10;
            this.f122520c = new io.reactivex.internal.queue.a<>(i11);
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122522e = true;
            this.f122519b.b();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122523f = th2;
            this.f122522e = true;
            this.f122519b.b();
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f122520c.offer(t10);
            this.f122519b.b();
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f122519b.c(bVar, this.f122521d);
        }
    }

    public ObservableSequenceEqual(io.reactivex.e0<? extends T> e0Var, io.reactivex.e0<? extends T> e0Var2, kh.d<? super T, ? super T> dVar, int i10) {
        this.f122506b = e0Var;
        this.f122507c = e0Var2;
        this.f122508d = dVar;
        this.f122509e = i10;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super Boolean> g0Var) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(g0Var, this.f122509e, this.f122506b, this.f122507c, this.f122508d);
        g0Var.onSubscribe(equalCoordinator);
        equalCoordinator.d();
    }
}
