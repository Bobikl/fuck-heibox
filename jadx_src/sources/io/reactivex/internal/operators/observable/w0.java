package io.reactivex.internal.operators.observable;

/* JADX INFO: compiled from: ObservableLift.java */
/* JADX INFO: loaded from: classes5.dex */
public final class w0<R, T> extends a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.d0<? extends R, ? super T> f123123c;

    public w0(io.reactivex.e0<T> e0Var, io.reactivex.d0<? extends R, ? super T> d0Var) {
        super(e0Var);
        this.f123123c = d0Var;
    }

    @Override // io.reactivex.z
    public void H5(io.reactivex.g0<? super R> g0Var) {
        try {
            this.f122785b.g((io.reactivex.g0) io.reactivex.internal.functions.a.g(this.f123123c.a(g0Var), "Operator " + this.f123123c + " returned a null Observer"));
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            io.reactivex.plugins.a.Y(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }
}
