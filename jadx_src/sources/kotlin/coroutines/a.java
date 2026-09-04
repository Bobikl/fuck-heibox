package kotlin.coroutines;

import kotlin.jvm.internal.f0;
import kotlin.u0;
import yh.p;

/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.3")
public abstract class a implements CoroutineContext.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final CoroutineContext.b<?> f124695b;

    public a(@dl.d CoroutineContext.b<?> key) {
        f0.p(key, "key");
        this.f124695b = key;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @dl.d
    public CoroutineContext I(@dl.d CoroutineContext coroutineContext) {
        return CoroutineContext.a.C1128a.d(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    @dl.d
    public CoroutineContext d(@dl.d CoroutineContext.b<?> bVar) {
        return CoroutineContext.a.C1128a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    @dl.e
    public <E extends CoroutineContext.a> E f(@dl.d CoroutineContext.b<E> bVar) {
        return (E) CoroutineContext.a.C1128a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public <R> R g(R r10, @dl.d p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
        return (R) CoroutineContext.a.C1128a.a(this, r10, pVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a
    @dl.d
    public CoroutineContext.b<?> getKey() {
        return this.f124695b;
    }
}
