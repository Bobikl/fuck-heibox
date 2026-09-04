package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.c0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Collect.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class FlowKt__CollectKt$collect$3<T> implements f<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ yh.p<T, kotlin.coroutines.c<? super b2>, Object> f129289b;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__CollectKt$collect$3(yh.p<? super T, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar) {
        this.f129289b = pVar;
    }

    @dl.e
    public Object a(T t10, @dl.d final kotlin.coroutines.c<? super b2> cVar) {
        c0.e(4);
        new ContinuationImpl(cVar) { // from class: kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3$emit$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f129290b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f129292d;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) {
                this.f129290b = obj;
                this.f129292d |= Integer.MIN_VALUE;
                return this.f129291c.emit(null, this);
            }
        };
        c0.e(5);
        this.f129289b.invoke(t10, cVar);
        return b2.f124493a;
    }

    @Override // kotlinx.coroutines.flow.f
    @dl.e
    public Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objInvoke = this.f129289b.invoke(t10, cVar);
        return objInvoke == kotlin.coroutines.intrinsics.b.h() ? objInvoke : b2.f124493a;
    }
}
