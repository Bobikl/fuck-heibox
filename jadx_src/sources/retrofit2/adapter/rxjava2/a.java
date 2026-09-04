package retrofit2.adapter.rxjava2;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.g0;
import io.reactivex.z;
import retrofit2.s;

/* JADX INFO: compiled from: BodyObservable.java */
/* JADX INFO: loaded from: classes5.dex */
public final class a<T> extends z<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z<s<T>> f138915b;

    /* JADX INFO: renamed from: retrofit2.adapter.rxjava2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BodyObservable.java */
    public static class C1262a<R> implements g0<s<R>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g0<? super R> f138916b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f138917c;

        C1262a(g0<? super R> g0Var) {
            this.f138916b = g0Var;
        }

        @Override // io.reactivex.g0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(s<R> sVar) {
            if (sVar.g()) {
                this.f138916b.onNext(sVar.a());
                return;
            }
            this.f138917c = true;
            HttpException httpException = new HttpException(sVar);
            try {
                this.f138916b.onError(httpException);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                io.reactivex.plugins.a.Y(new CompositeException(httpException, th2));
            }
        }

        @Override // io.reactivex.g0
        public void onComplete() {
            if (this.f138917c) {
                return;
            }
            this.f138916b.onComplete();
        }

        @Override // io.reactivex.g0
        public void onError(Throwable th2) {
            if (!this.f138917c) {
                this.f138916b.onError(th2);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th2);
            io.reactivex.plugins.a.Y(assertionError);
        }

        @Override // io.reactivex.g0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f138916b.onSubscribe(bVar);
        }
    }

    a(z<s<T>> zVar) {
        this.f138915b = zVar;
    }

    @Override // io.reactivex.z
    protected void H5(g0<? super T> g0Var) {
        this.f138915b.g(new C1262a(g0Var));
    }
}
