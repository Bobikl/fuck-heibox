package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"kotlinx/coroutines/j", "kotlinx/coroutines/k"}, d2 = {}, k = 4, mv = {1, 6, 0})
public final class i {
    @dl.d
    public static final <T> w0<T> a(@dl.d q0 q0Var, @dl.d CoroutineContext coroutineContext, @dl.d CoroutineStart coroutineStart, @dl.d yh.p<? super q0, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar) {
        return k.a(q0Var, coroutineContext, coroutineStart, pVar);
    }

    @dl.e
    public static final <T> Object c(@dl.d CoroutineDispatcher coroutineDispatcher, @dl.d yh.p<? super q0, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super T> cVar) {
        return k.c(coroutineDispatcher, pVar, cVar);
    }

    @dl.d
    public static final d2 d(@dl.d q0 q0Var, @dl.d CoroutineContext coroutineContext, @dl.d CoroutineStart coroutineStart, @dl.d yh.p<? super q0, ? super kotlin.coroutines.c<? super kotlin.b2>, ? extends Object> pVar) {
        return k.e(q0Var, coroutineContext, coroutineStart, pVar);
    }

    public static final <T> T f(@dl.d CoroutineContext coroutineContext, @dl.d yh.p<? super q0, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar) throws InterruptedException {
        return (T) j.a(coroutineContext, pVar);
    }

    @dl.e
    public static final <T> Object h(@dl.d CoroutineContext coroutineContext, @dl.d yh.p<? super q0, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super T> cVar) throws Throwable {
        return k.g(coroutineContext, pVar, cVar);
    }
}
