package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"kotlinx/coroutines/h2", "kotlinx/coroutines/i2"}, d2 = {}, k = 4, mv = {1, 6, 0})
public final class g2 {
    public static final void A(@dl.d d2 d2Var) {
        i2.y(d2Var);
    }

    @dl.d
    public static final d2 B(@dl.d CoroutineContext coroutineContext) {
        return i2.z(coroutineContext);
    }

    public static final boolean C(@dl.d CoroutineContext coroutineContext) {
        return i2.A(coroutineContext);
    }

    @dl.d
    public static final b0 a(@dl.e d2 d2Var) {
        return i2.a(d2Var);
    }

    public static final void f(@dl.d CoroutineContext coroutineContext, @dl.e CancellationException cancellationException) {
        i2.f(coroutineContext, cancellationException);
    }

    public static final void g(@dl.d d2 d2Var, @dl.d String str, @dl.e Throwable th2) {
        i2.g(d2Var, str, th2);
    }

    @dl.e
    public static final Object l(@dl.d d2 d2Var, @dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return i2.l(d2Var, cVar);
    }

    public static final void o(@dl.d CoroutineContext coroutineContext, @dl.e CancellationException cancellationException) {
        i2.o(coroutineContext, cancellationException);
    }

    public static final void r(@dl.d d2 d2Var, @dl.e CancellationException cancellationException) {
        i2.r(d2Var, cancellationException);
    }

    public static final void w(@dl.d p<?> pVar, @dl.d Future<?> future) {
        h2.a(pVar, future);
    }

    @dl.d
    @z1
    public static final h1 x(@dl.d d2 d2Var, @dl.d Future<?> future) {
        return h2.b(d2Var, future);
    }

    @dl.d
    public static final h1 y(@dl.d d2 d2Var, @dl.d h1 h1Var) {
        return i2.w(d2Var, h1Var);
    }

    public static final void z(@dl.d CoroutineContext coroutineContext) {
        i2.x(coroutineContext);
    }
}
