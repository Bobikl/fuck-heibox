package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableSequenceEqualSingle<T> extends io.reactivex.i0<Boolean> implements lh.d<Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.e0<? extends T> f122524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.e0<? extends T> f122525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.d<? super T, ? super T> f122526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f122527e;

    public static final class EqualCoordinator<T> extends AtomicInteger implements io.reactivex.disposables.b {
        private static final long serialVersionUID = -6178010334400373240L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.l0<? super Boolean> f122528b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kh.d<? super T, ? super T> f122529c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final ArrayCompositeDisposable f122530d = new ArrayCompositeDisposable(2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.e0<? extends T> f122531e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.e0<? extends T> f122532f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final a<T>[] f122533g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f122534h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        T f122535i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        T f122536j;

        EqualCoordinator(io.reactivex.l0<? super Boolean> l0Var, int i10, io.reactivex.e0<? extends T> e0Var, io.reactivex.e0<? extends T> e0Var2, kh.d<? super T, ? super T> dVar) {
            this.f122528b = l0Var;
            this.f122531e = e0Var;
            this.f122532f = e0Var2;
            this.f122529c = dVar;
            this.f122533g = new a[]{new a<>(this, 0, i10), new a<>(this, 1, i10)};
        }

        void a(io.reactivex.internal.queue.a<T> aVar, io.reactivex.internal.queue.a<T> aVar2) {
            this.f122534h = true;
            aVar.clear();
            aVar2.clear();
        }

        void b() {
            Throwable th2;
            Throwable th3;
            if (getAndIncrement() != 0) {
                return;
            }
            a<T>[] aVarArr = this.f122533g;
            a<T> aVar = aVarArr[0];
            io.reactivex.internal.queue.a<T> aVar2 = aVar.f122538c;
            a<T> aVar3 = aVarArr[1];
            io.reactivex.internal.queue.a<T> aVar4 = aVar3.f122538c;
            int iAddAndGet = 1;
            while (!this.f122534h) {
                boolean z10 = aVar.f122540e;
                if (z10 && (th3 = aVar.f122541f) != null) {
                    a(aVar2, aVar4);
                    this.f122528b.onError(th3);
                    return;
                }
                boolean z11 = aVar3.f122540e;
                if (z11 && (th2 = aVar3.f122541f) != null) {
                    a(aVar2, aVar4);
                    this.f122528b.onError(th2);
                    return;
                }
                if (this.f122535i == null) {
                    this.f122535i = aVar2.poll();
                }
                boolean z12 = this.f122535i == null;
                if (this.f122536j == null) {
                    this.f122536j = aVar4.poll();
                }
                T t10 = this.f122536j;
                boolean z13 = t10 == null;
                if (z10 && z11 && z12 && z13) {
                    this.f122528b.onSuccess(Boolean.TRUE);
                    return;
                }
                if (z10 && z11 && z12 != z13) {
                    a(aVar2, aVar4);
                    this.f122528b.onSuccess(Boolean.FALSE);
                    return;
                }
                if (!z12 && !z13) {
                    try {
                        if (!this.f122529c.test(this.f122535i, t10)) {
                            a(aVar2, aVar4);
                            this.f122528b.onSuccess(Boolean.FALSE);
                            return;
                        } else {
                            this.f122535i = null;
                            this.f122536j = null;
                        }
                    } catch (Throwable th4) {
                        io.reactivex.exceptions.a.b(th4);
                        a(aVar2, aVar4);
                        this.f122528b.onError(th4);
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
            return this.f122530d.b(i10, bVar);
        }

        void d() {
            a<T>[] aVarArr = this.f122533g;
            this.f122531e.g(aVarArr[0]);
            this.f122532f.g(aVarArr[1]);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f122534h) {
                return;
            }
            this.f122534h = true;
            this.f122530d.dispose();
            if (getAndIncrement() == 0) {
                a<T>[] aVarArr = this.f122533g;
                aVarArr[0].f122538c.clear();
                aVarArr[1].f122538c.clear();
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122534h;
        }
    }

    public static final class a<T> implements io.reactivex.g0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final EqualCoordinator<T> f122537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.internal.queue.a<T> f122538c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f122539d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f122540e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Throwable f122541f;

        a(EqualCoordinator<T> equalCoordinator, int i10, int i11) {
            this.f122537b = equalCoordinator;
            this.f122539d = i10;
            this.f122538c = new io.reactivex.internal.queue.a<>(i11);
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f122540e = true;
            this.f122537b.b();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            this.f122541f = th2;
            this.f122540e = true;
            this.f122537b.b();
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            this.f122538c.offer(t10);
            this.f122537b.b();
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f122537b.c(bVar, this.f122539d);
        }
    }

    public ObservableSequenceEqualSingle(io.reactivex.e0<? extends T> e0Var, io.reactivex.e0<? extends T> e0Var2, kh.d<? super T, ? super T> dVar, int i10) {
        this.f122524b = e0Var;
        this.f122525c = e0Var2;
        this.f122526d = dVar;
        this.f122527e = i10;
    }

    @Override // lh.d
    public io.reactivex.z<Boolean> a() {
        return io.reactivex.plugins.a.R(new ObservableSequenceEqual(this.f122524b, this.f122525c, this.f122526d, this.f122527e));
    }

    @Override // io.reactivex.i0
    public void c1(io.reactivex.l0<? super Boolean> l0Var) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(l0Var, this.f122527e, this.f122524b, this.f122525c, this.f122526d);
        l0Var.onSubscribe(equalCoordinator);
        equalCoordinator.d();
    }
}
