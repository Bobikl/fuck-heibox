package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: MonotonicFrameClock.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aB\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012#\b\u0004\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00028\u00000\u0002H\u0086Hø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a<\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a<\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\f\"\u001e\u0010\u0013\u001a\u00020\u0001*\u00020\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"R", "Landroidx/compose/runtime/w0;", "Lkotlin/Function1;", "", "Lkotlin/m0;", "name", "frameTimeMillis", "onFrame", ak.aF, "(Landroidx/compose/runtime/w0;Lyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "frameTimeNanos", "f", "(Lyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "d", "Lkotlin/coroutines/CoroutineContext;", ak.av, "(Lkotlin/coroutines/CoroutineContext;)Landroidx/compose/runtime/w0;", "getMonotonicFrameClock$annotations", "(Lkotlin/coroutines/CoroutineContext;)V", "monotonicFrameClock", "runtime_release"}, k = 2, mv = {1, 7, 1})
public final class MonotonicFrameClockKt {
    @dl.d
    public static final w0 a(@dl.d CoroutineContext coroutineContext) {
        kotlin.jvm.internal.f0.p(coroutineContext, "<this>");
        w0 w0Var = (w0) coroutineContext.f(w0.INSTANCE);
        if (w0Var != null) {
            return w0Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }

    @h0
    public static /* synthetic */ void b(CoroutineContext coroutineContext) {
    }

    @dl.e
    public static final <R> Object c(@dl.d w0 w0Var, @dl.d yh.l<? super Long, ? extends R> lVar, @dl.d kotlin.coroutines.c<? super R> cVar) {
        return w0Var.h0(new MonotonicFrameClockKt$withFrameMillis$2(lVar), cVar);
    }

    @dl.e
    public static final <R> Object d(@dl.d yh.l<? super Long, ? extends R> lVar, @dl.d kotlin.coroutines.c<? super R> cVar) {
        return a(cVar.getContext()).h0(new MonotonicFrameClockKt$withFrameMillis$2(lVar), cVar);
    }

    private static final <R> Object e(w0 w0Var, yh.l<? super Long, ? extends R> lVar, kotlin.coroutines.c<? super R> cVar) {
        MonotonicFrameClockKt$withFrameMillis$2 monotonicFrameClockKt$withFrameMillis$2 = new MonotonicFrameClockKt$withFrameMillis$2(lVar);
        kotlin.jvm.internal.c0.e(0);
        Object objH0 = w0Var.h0(monotonicFrameClockKt$withFrameMillis$2, cVar);
        kotlin.jvm.internal.c0.e(1);
        return objH0;
    }

    @dl.e
    public static final <R> Object f(@dl.d yh.l<? super Long, ? extends R> lVar, @dl.d kotlin.coroutines.c<? super R> cVar) {
        return a(cVar.getContext()).h0(lVar, cVar);
    }
}
