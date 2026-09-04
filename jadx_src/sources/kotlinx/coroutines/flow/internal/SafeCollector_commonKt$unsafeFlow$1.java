package kotlinx.coroutines.flow.internal;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.c0;
import yh.p;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/b2;", ak.av, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class SafeCollector_commonKt$unsafeFlow$1<T> implements kotlinx.coroutines.flow.e<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ p<kotlinx.coroutines.flow.f<? super T>, kotlin.coroutines.c<? super b2>, Object> f130062b;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector_commonKt$unsafeFlow$1(p<? super kotlinx.coroutines.flow.f<? super T>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar) {
        this.f130062b = pVar;
    }

    @Override // kotlinx.coroutines.flow.e
    @dl.e
    public Object a(@dl.d kotlinx.coroutines.flow.f<? super T> fVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objInvoke = this.f130062b.invoke(fVar, cVar);
        return objInvoke == kotlin.coroutines.intrinsics.b.h() ? objInvoke : b2.f124493a;
    }

    @dl.e
    public Object g(@dl.d kotlinx.coroutines.flow.f<? super T> fVar, @dl.d final kotlin.coroutines.c<? super b2> cVar) {
        c0.e(4);
        new ContinuationImpl(cVar) { // from class: kotlinx.coroutines.flow.internal.SafeCollector_commonKt$unsafeFlow$1$collect$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f130063b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f130065d;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) {
                this.f130063b = obj;
                this.f130065d |= Integer.MIN_VALUE;
                return this.f130064c.a(null, this);
            }
        };
        c0.e(5);
        this.f130062b.invoke(fVar, cVar);
        return b2.f124493a;
    }
}
