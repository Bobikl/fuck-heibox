package androidx.work.impl;

import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.p0;

/* JADX INFO: compiled from: OperationImpl.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class o implements androidx.work.q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.lifecycle.i0<androidx.work.q.b> f29231c = new androidx.lifecycle.i0<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.work.impl.utils.futures.a<androidx.work.q.b.c> f29232d = androidx.work.impl.utils.futures.a.u();

    public o() {
        a(androidx.work.q.f29463b);
    }

    public void a(@androidx.annotation.n0 androidx.work.q.b bVar) {
        this.f29231c.o(bVar);
        if (bVar instanceof androidx.work.q.b.c) {
            this.f29232d.p((androidx.work.q.b.c) bVar);
        } else if (bVar instanceof androidx.work.q.b.a) {
            this.f29232d.q(((androidx.work.q.b.a) bVar).a());
        }
    }

    @Override // androidx.work.q
    @androidx.annotation.n0
    public p0<androidx.work.q.b.c> getResult() {
        return this.f29232d;
    }

    @Override // androidx.work.q
    @androidx.annotation.n0
    public LiveData<androidx.work.q.b> getState() {
        return this.f29231c;
    }
}
