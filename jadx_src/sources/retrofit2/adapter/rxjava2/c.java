package retrofit2.adapter.rxjava2;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.g0;
import io.reactivex.z;
import retrofit2.s;

/* JADX INFO: compiled from: CallExecuteObservable.java */
/* JADX INFO: loaded from: classes5.dex */
public final class c<T> extends z<s<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final retrofit2.b<T> f138923b;

    /* JADX INFO: compiled from: CallExecuteObservable.java */
    public static final class a implements io.reactivex.disposables.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final retrofit2.b<?> f138924b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile boolean f138925c;

        a(retrofit2.b<?> bVar) {
            this.f138924b = bVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f138925c = true;
            this.f138924b.cancel();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f138925c;
        }
    }

    c(retrofit2.b<T> bVar) {
        this.f138923b = bVar;
    }

    @Override // io.reactivex.z
    protected void H5(g0<? super s<T>> g0Var) {
        boolean z10;
        retrofit2.b<T> bVarClone = this.f138923b.clone();
        a aVar = new a(bVarClone);
        g0Var.onSubscribe(aVar);
        if (aVar.isDisposed()) {
            return;
        }
        try {
            s<T> sVarExecute = bVarClone.execute();
            if (!aVar.isDisposed()) {
                g0Var.onNext(sVarExecute);
            }
            if (aVar.isDisposed()) {
                return;
            }
            try {
                g0Var.onComplete();
            } catch (Throwable th2) {
                th = th2;
                z10 = true;
                io.reactivex.exceptions.a.b(th);
                if (z10) {
                    io.reactivex.plugins.a.Y(th);
                    return;
                }
                if (aVar.isDisposed()) {
                    return;
                }
                try {
                    g0Var.onError(th);
                } catch (Throwable th3) {
                    io.reactivex.exceptions.a.b(th3);
                    io.reactivex.plugins.a.Y(new CompositeException(th, th3));
                }
            }
        } catch (Throwable th4) {
            th = th4;
            z10 = false;
        }
    }
}
