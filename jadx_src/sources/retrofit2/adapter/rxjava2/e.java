package retrofit2.adapter.rxjava2;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.g0;
import io.reactivex.z;
import retrofit2.s;

/* JADX INFO: compiled from: ResultObservable.java */
/* JADX INFO: loaded from: classes5.dex */
public final class e<T> extends z<d<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z<s<T>> f138928b;

    /* JADX INFO: compiled from: ResultObservable.java */
    public static class a<R> implements g0<s<R>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g0<? super d<R>> f138929b;

        a(g0<? super d<R>> g0Var) {
            this.f138929b = g0Var;
        }

        @Override // io.reactivex.g0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(s<R> sVar) {
            this.f138929b.onNext(d.e(sVar));
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            this.f138929b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            try {
                this.f138929b.onNext(d.b(th2));
                this.f138929b.onComplete();
            } catch (Throwable th3) {
                try {
                    this.f138929b.onError(th3);
                } catch (Throwable th4) {
                    io.reactivex.exceptions.a.b(th4);
                    io.reactivex.plugins.a.Y(new CompositeException(th3, th4));
                }
            }
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f138929b.onSubscribe(bVar);
        }
    }

    e(z<s<T>> zVar) {
        this.f138928b = zVar;
    }

    @Override // io.reactivex.z
    protected void H5(g0<? super d<T>> g0Var) {
        this.f138928b.g(new a(g0Var));
    }
}
