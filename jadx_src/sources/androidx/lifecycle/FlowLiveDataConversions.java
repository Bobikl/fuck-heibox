package androidx.lifecycle;

import com.max.hbcommon.network.ConnectivityLiveData;
import java.time.Duration;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: compiled from: FlowLiveData.kt */
/* JADX INFO: loaded from: classes6.dex */
@xh.h(name = "FlowLiveDataConversions")
public final class FlowLiveDataConversions {
    @dl.d
    public static final <T> kotlinx.coroutines.flow.e<T> a(@dl.d LiveData<T> liveData) {
        kotlin.jvm.internal.f0.p(liveData, "<this>");
        return kotlinx.coroutines.flow.g.W(kotlinx.coroutines.flow.g.s(new FlowLiveDataConversions$asFlow$1(liveData, null)));
    }

    @dl.d
    @xh.i
    public static final <T> LiveData<T> b(@dl.d kotlinx.coroutines.flow.e<? extends T> eVar) {
        kotlin.jvm.internal.f0.p(eVar, "<this>");
        return f(eVar, null, 0L, 3, null);
    }

    @dl.d
    @xh.i
    public static final <T> LiveData<T> c(@dl.d kotlinx.coroutines.flow.e<? extends T> eVar, @dl.d CoroutineContext context) {
        kotlin.jvm.internal.f0.p(eVar, "<this>");
        kotlin.jvm.internal.f0.p(context, "context");
        return f(eVar, context, 0L, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    @xh.i
    public static final <T> LiveData<T> d(@dl.d kotlinx.coroutines.flow.e<? extends T> eVar, @dl.d CoroutineContext context, long j10) {
        kotlin.jvm.internal.f0.p(eVar, "<this>");
        kotlin.jvm.internal.f0.p(context, "context");
        ConnectivityLiveData connectivityLiveData = (LiveData<T>) CoroutineLiveDataKt.b(context, j10, new FlowLiveDataConversions$asLiveData$1(eVar, null));
        if (eVar instanceof kotlinx.coroutines.flow.u) {
            if (androidx.arch.core.executor.c.h().c()) {
                connectivityLiveData.r(((kotlinx.coroutines.flow.u) eVar).getValue());
            } else {
                connectivityLiveData.o(((kotlinx.coroutines.flow.u) eVar).getValue());
            }
        }
        return connectivityLiveData;
    }

    @dl.d
    @androidx.annotation.w0(26)
    public static final <T> LiveData<T> e(@dl.d kotlinx.coroutines.flow.e<? extends T> eVar, @dl.d CoroutineContext context, @dl.d Duration timeout) {
        kotlin.jvm.internal.f0.p(eVar, "<this>");
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(timeout, "timeout");
        return d(eVar, context, c.f24180a.a(timeout));
    }

    public static /* synthetic */ LiveData f(kotlinx.coroutines.flow.e eVar, CoroutineContext coroutineContext, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f124694b;
        }
        if ((i10 & 2) != 0) {
            j10 = 5000;
        }
        return d(eVar, coroutineContext, j10);
    }

    public static /* synthetic */ LiveData g(kotlinx.coroutines.flow.e eVar, CoroutineContext coroutineContext, Duration duration, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f124694b;
        }
        return e(eVar, coroutineContext, duration);
    }
}
