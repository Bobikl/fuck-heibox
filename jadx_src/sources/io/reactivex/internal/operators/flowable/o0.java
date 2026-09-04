package io.reactivex.internal.operators.flowable;

/* JADX INFO: compiled from: FlowableLift.java */
/* JADX INFO: loaded from: classes12.dex */
public final class o0<R, T> extends a<T, R> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.n<? extends R, ? super T> f121281d;

    public o0(io.reactivex.j<T> jVar, io.reactivex.n<? extends R, ? super T> nVar) {
        super(jVar);
        this.f121281d = nVar;
    }

    @Override // io.reactivex.j
    public void k6(org.reactivestreams.d<? super R> dVar) {
        try {
            org.reactivestreams.d<? super Object> dVarA = this.f121281d.a(dVar);
            if (dVarA != null) {
                this.f121039c.g(dVarA);
                return;
            }
            throw new NullPointerException("Operator " + this.f121281d + " returned a null Subscriber");
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
