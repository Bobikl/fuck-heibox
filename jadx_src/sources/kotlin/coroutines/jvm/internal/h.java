package kotlin.coroutines.jvm.internal;

import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.f0;
import kotlin.t0;

/* JADX INFO: compiled from: RunSuspend.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h implements kotlin.coroutines.c<b2> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private Result<b2> f124728b;

    public final void a() {
        synchronized (this) {
            while (true) {
                Result<b2> result = this.f124728b;
                if (result == null) {
                    f0.n(this, "null cannot be cast to non-null type java.lang.Object");
                    wait();
                } else {
                    t0.n(result.l());
                }
            }
        }
    }

    @dl.e
    public final Result<b2> c() {
        return this.f124728b;
    }

    public final void d(@dl.e Result<b2> result) {
        this.f124728b = result;
    }

    @Override // kotlin.coroutines.c
    @dl.d
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.f124694b;
    }

    @Override // kotlin.coroutines.c
    public void resumeWith(@dl.d Object obj) {
        synchronized (this) {
            this.f124728b = Result.a(obj);
            f0.n(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            b2 b2Var = b2.f124493a;
        }
    }
}
