package androidx.lifecycle;

import java.time.Duration;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.e1;

/* JADX INFO: compiled from: CoroutineLiveData.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class CoroutineLiveDataKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f23977a = 5000;

    /* JADX INFO: compiled from: CoroutineLiveData.kt */
    public static final /* synthetic */ class a implements j0, kotlin.jvm.internal.a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ yh.l f23978a;

        a(yh.l function) {
            kotlin.jvm.internal.f0.p(function, "function");
            this.f23978a = function;
        }

        @Override // androidx.lifecycle.j0
        public final /* synthetic */ void a(Object obj) {
            this.f23978a.invoke(obj);
        }

        @Override // kotlin.jvm.internal.a0
        @dl.d
        public final kotlin.u<?> b() {
            return this.f23978a;
        }

        public final boolean equals(@dl.e Object obj) {
            if ((obj instanceof j0) && (obj instanceof kotlin.jvm.internal.a0)) {
                return kotlin.jvm.internal.f0.g(b(), ((kotlin.jvm.internal.a0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @dl.e
    public static final <T> Object a(@dl.d g0<T> g0Var, @dl.d LiveData<T> liveData, @dl.d kotlin.coroutines.c<? super EmittedSource> cVar) {
        return kotlinx.coroutines.i.h(e1.e().t0(), new CoroutineLiveDataKt$addDisposableSource$2(g0Var, liveData, null), cVar);
    }

    @dl.d
    public static final <T> LiveData<T> b(@dl.d CoroutineContext context, long j10, @dl.d yh.p<? super f0<T>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> block) {
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(block, "block");
        return new CoroutineLiveData(context, j10, block);
    }

    @dl.d
    @androidx.annotation.w0(26)
    public static final <T> LiveData<T> c(@dl.d CoroutineContext context, @dl.d Duration timeout, @dl.d yh.p<? super f0<T>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> block) {
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(timeout, "timeout");
        kotlin.jvm.internal.f0.p(block, "block");
        return new CoroutineLiveData(context, c.f24180a.a(timeout), block);
    }

    public static /* synthetic */ LiveData d(CoroutineContext coroutineContext, long j10, yh.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f124694b;
        }
        if ((i10 & 2) != 0) {
            j10 = 5000;
        }
        return b(coroutineContext, j10, pVar);
    }

    public static /* synthetic */ LiveData e(CoroutineContext coroutineContext, Duration duration, yh.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f124694b;
        }
        return c(coroutineContext, duration, pVar);
    }
}
