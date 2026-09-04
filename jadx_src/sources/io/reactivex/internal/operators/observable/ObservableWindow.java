package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.subjects.UnicastSubject;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableWindow<T> extends a<T, io.reactivex.z<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f122693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f122694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f122695e;

    public static final class WindowExactObserver<T> extends AtomicInteger implements io.reactivex.g0<T>, io.reactivex.disposables.b, Runnable {
        private static final long serialVersionUID = -7481782523886138128L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super io.reactivex.z<T>> f122696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f122697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f122698d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f122699e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        io.reactivex.disposables.b f122700f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        UnicastSubject<T> f122701g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f122702h;

        WindowExactObserver(io.reactivex.g0<? super io.reactivex.z<T>> g0Var, long j10, int i10) {
            this.f122696b = g0Var;
            this.f122697c = j10;
            this.f122698d = i10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122702h = true;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122702h;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            UnicastSubject<T> unicastSubject = this.f122701g;
            if (unicastSubject != null) {
                this.f122701g = null;
                unicastSubject.onComplete();
            }
            this.f122696b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            UnicastSubject<T> unicastSubject = this.f122701g;
            if (unicastSubject != null) {
                this.f122701g = null;
                unicastSubject.onError(th2);
            }
            this.f122696b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            UnicastSubject<T> unicastSubjectO8 = this.f122701g;
            if (unicastSubjectO8 == null && !this.f122702h) {
                unicastSubjectO8 = UnicastSubject.o8(this.f122698d, this);
                this.f122701g = unicastSubjectO8;
                this.f122696b.onNext(unicastSubjectO8);
            }
            if (unicastSubjectO8 != null) {
                unicastSubjectO8.onNext(t10);
                long j10 = this.f122699e + 1;
                this.f122699e = j10;
                if (j10 >= this.f122697c) {
                    this.f122699e = 0L;
                    this.f122701g = null;
                    unicastSubjectO8.onComplete();
                    if (this.f122702h) {
                        this.f122700f.dispose();
                    }
                }
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122700f, bVar)) {
                this.f122700f = bVar;
                this.f122696b.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f122702h) {
                this.f122700f.dispose();
            }
        }
    }

    public static final class WindowSkipObserver<T> extends AtomicBoolean implements io.reactivex.g0<T>, io.reactivex.disposables.b, Runnable {
        private static final long serialVersionUID = 3366976432059579510L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.g0<? super io.reactivex.z<T>> f122703b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f122704c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f122705d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f122706e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f122708g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f122709h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        long f122710i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        io.reactivex.disposables.b f122711j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final AtomicInteger f122712k = new AtomicInteger();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final ArrayDeque<UnicastSubject<T>> f122707f = new ArrayDeque<>();

        WindowSkipObserver(io.reactivex.g0<? super io.reactivex.z<T>> g0Var, long j10, long j11, int i10) {
            this.f122703b = g0Var;
            this.f122704c = j10;
            this.f122705d = j11;
            this.f122706e = i10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f122709h = true;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f122709h;
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            ArrayDeque<UnicastSubject<T>> arrayDeque = this.f122707f;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onComplete();
            }
            this.f122703b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            ArrayDeque<UnicastSubject<T>> arrayDeque = this.f122707f;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onError(th2);
            }
            this.f122703b.onError(th2);
        }

        @Override // io.reactivex.g0
        public void onNext(T t10) {
            ArrayDeque<UnicastSubject<T>> arrayDeque = this.f122707f;
            long j10 = this.f122708g;
            long j11 = this.f122705d;
            if (j10 % j11 == 0 && !this.f122709h) {
                this.f122712k.getAndIncrement();
                UnicastSubject<T> unicastSubjectO8 = UnicastSubject.o8(this.f122706e, this);
                arrayDeque.offer(unicastSubjectO8);
                this.f122703b.onNext(unicastSubjectO8);
            }
            long j12 = this.f122710i + 1;
            Iterator<UnicastSubject<T>> it = arrayDeque.iterator();
            while (it.hasNext()) {
                it.next().onNext(t10);
            }
            if (j12 >= this.f122704c) {
                arrayDeque.poll().onComplete();
                if (arrayDeque.isEmpty() && this.f122709h) {
                    this.f122711j.dispose();
                    return;
                }
                this.f122710i = j12 - j11;
            } else {
                this.f122710i = j12;
            }
            this.f122708g = j10 + 1;
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f122711j, bVar)) {
                this.f122711j = bVar;
                this.f122703b.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f122712k.decrementAndGet() == 0 && this.f122709h) {
                this.f122711j.dispose();
            }
        }
    }

    public ObservableWindow(io.reactivex.e0<T> e0Var, long j10, long j11, int i10) {
        super(e0Var);
        this.f122693c = j10;
        this.f122694d = j11;
        this.f122695e = i10;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super io.reactivex.z<T>> g0Var) {
        if (this.f122693c == this.f122694d) {
            this.f122785b.g(new WindowExactObserver(g0Var, this.f122693c, this.f122695e));
        } else {
            this.f122785b.g(new WindowSkipObserver(g0Var, this.f122693c, this.f122694d, this.f122695e));
        }
    }
}
