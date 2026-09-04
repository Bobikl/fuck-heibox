package retrofit2.adapter.rxjava2;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.g0;
import io.reactivex.z;
import retrofit2.s;

/* JADX INFO: compiled from: CallEnqueueObservable.java */
/* JADX INFO: loaded from: classes5.dex */
public final class b<T> extends z<s<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final retrofit2.b<T> f138918b;

    /* JADX INFO: compiled from: CallEnqueueObservable.java */
    public static final class a<T> implements io.reactivex.disposables.b, retrofit2.d<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final retrofit2.b<?> f138919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g0<? super s<T>> f138920c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile boolean f138921d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f138922e = false;

        a(retrofit2.b<?> bVar, g0<? super s<T>> g0Var) {
            this.f138919b = bVar;
            this.f138920c = g0Var;
        }

        @Override // retrofit2.d
        public void a(retrofit2.b<T> bVar, Throwable th2) {
            if (bVar.isCanceled()) {
                return;
            }
            try {
                this.f138920c.onError(th2);
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                io.reactivex.plugins.a.Y(new CompositeException(th2, th3));
            }
        }

        @Override // retrofit2.d
        public void b(retrofit2.b<T> bVar, s<T> sVar) {
            if (this.f138921d) {
                return;
            }
            try {
                this.f138920c.onNext(sVar);
                if (this.f138921d) {
                    return;
                }
                this.f138922e = true;
                this.f138920c.onComplete();
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                if (this.f138922e) {
                    io.reactivex.plugins.a.Y(th2);
                    return;
                }
                if (this.f138921d) {
                    return;
                }
                try {
                    this.f138920c.onError(th2);
                } catch (Throwable th3) {
                    io.reactivex.exceptions.a.b(th3);
                    io.reactivex.plugins.a.Y(new CompositeException(th2, th3));
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f138921d = true;
            this.f138919b.cancel();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f138921d;
        }
    }

    b(retrofit2.b<T> bVar) {
        this.f138918b = bVar;
    }

    @Override // io.reactivex.z
    protected void H5(g0<? super s<T>> g0Var) {
        retrofit2.b<T> bVarClone = this.f138918b.clone();
        a aVar = new a(bVarClone, g0Var);
        g0Var.onSubscribe(aVar);
        if (aVar.isDisposed()) {
            return;
        }
        bVarClone.N(aVar);
    }
}
