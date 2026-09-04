package io.reactivex.internal.operators.completable;

/* JADX INFO: compiled from: CompletableLift.java */
/* JADX INFO: loaded from: classes12.dex */
public final class q extends io.reactivex.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g f119826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.f f119827c;

    public q(io.reactivex.g gVar, io.reactivex.f fVar) {
        this.f119826b = gVar;
        this.f119827c = fVar;
    }

    @Override // io.reactivex.a
    protected void J0(io.reactivex.d dVar) {
        try {
            this.f119826b.d(this.f119827c.a(dVar));
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            io.reactivex.plugins.a.Y(th2);
        }
    }
}
