package androidx.paging;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a~\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u00012F\u0010\u000b\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001ap\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022F\u0010\u000b\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001ar\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022B\u0010\u0013\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0010\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004¢\u0006\u0002\b\u0012H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u000f\u001aj\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000229\b\u0004\u0010\u0013\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0015H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001ad\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000223\b\u0004\u0010\u0013\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0015H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0017\"\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "Lkotlinx/coroutines/flow/e;", "initial", "Lkotlin/Function3;", "Lkotlin/m0;", "name", "accumulator", "value", "Lkotlin/coroutines/c;", "", "operation", "e", "(Lkotlinx/coroutines/flow/e;Ljava/lang/Object;Lyh/q;)Lkotlinx/coroutines/flow/e;", "d", "(Lkotlinx/coroutines/flow/e;Lyh/q;)Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "Lkotlin/b2;", "Lkotlin/t;", "transform", "f", "Lkotlin/Function2;", "b", "(Lkotlinx/coroutines/flow/e;Lyh/p;)Lkotlinx/coroutines/flow/e;", ak.aF, ak.av, "Ljava/lang/Object;", "NULL", "paging-common"}, k = 2, mv = {1, 4, 2})
public final class FlowExtKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f25539a = new Object();

    @dl.d
    public static final <T, R> kotlinx.coroutines.flow.e<R> b(@dl.d kotlinx.coroutines.flow.e<? extends T> simpleFlatMapLatest, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super kotlinx.coroutines.flow.e<? extends R>>, ? extends Object> transform) {
        kotlin.jvm.internal.f0.p(simpleFlatMapLatest, "$this$simpleFlatMapLatest");
        kotlin.jvm.internal.f0.p(transform, "transform");
        return f(simpleFlatMapLatest, new FlowExtKt$simpleFlatMapLatest$1(transform, null));
    }

    @dl.d
    public static final <T, R> kotlinx.coroutines.flow.e<R> c(@dl.d kotlinx.coroutines.flow.e<? extends T> simpleMapLatest, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> transform) {
        kotlin.jvm.internal.f0.p(simpleMapLatest, "$this$simpleMapLatest");
        kotlin.jvm.internal.f0.p(transform, "transform");
        return f(simpleMapLatest, new FlowExtKt$simpleMapLatest$1(transform, null));
    }

    @dl.d
    public static final <T> kotlinx.coroutines.flow.e<T> d(@dl.d kotlinx.coroutines.flow.e<? extends T> simpleRunningReduce, @dl.d yh.q<? super T, ? super T, ? super kotlin.coroutines.c<? super T>, ? extends Object> operation) {
        kotlin.jvm.internal.f0.p(simpleRunningReduce, "$this$simpleRunningReduce");
        kotlin.jvm.internal.f0.p(operation, "operation");
        return kotlinx.coroutines.flow.g.I0(new FlowExtKt$simpleRunningReduce$1(simpleRunningReduce, operation, null));
    }

    @dl.d
    public static final <T, R> kotlinx.coroutines.flow.e<R> e(@dl.d kotlinx.coroutines.flow.e<? extends T> simpleScan, R r10, @dl.d yh.q<? super R, ? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> operation) {
        kotlin.jvm.internal.f0.p(simpleScan, "$this$simpleScan");
        kotlin.jvm.internal.f0.p(operation, "operation");
        return kotlinx.coroutines.flow.g.I0(new FlowExtKt$simpleScan$1(simpleScan, r10, operation, null));
    }

    @dl.d
    public static final <T, R> kotlinx.coroutines.flow.e<R> f(@dl.d kotlinx.coroutines.flow.e<? extends T> simpleTransformLatest, @dl.d yh.q<? super kotlinx.coroutines.flow.f<? super R>, ? super T, ? super kotlin.coroutines.c<? super b2>, ? extends Object> transform) {
        kotlin.jvm.internal.f0.p(simpleTransformLatest, "$this$simpleTransformLatest");
        kotlin.jvm.internal.f0.p(transform, "transform");
        return SimpleChannelFlowKt.a(new FlowExtKt$simpleTransformLatest$1(simpleTransformLatest, transform, null));
    }
}
