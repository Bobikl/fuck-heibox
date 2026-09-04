package kotlinx.coroutines.flow.internal;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.r0;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.internal.k0;
import yh.p;

/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0080\u0010\u001aP\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\b2/\b\u0005\u0010\u000e\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rH\u0081\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", "Lkotlin/coroutines/CoroutineContext;", "currentContext", "Lkotlin/b2;", ak.av, "Lkotlinx/coroutines/d2;", "collectJob", "b", androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/f;", "Lkotlin/coroutines/c;", "", "Lkotlin/t;", "block", "Lkotlinx/coroutines/flow/e;", ak.aF, "(Lyh/p;)Lkotlinx/coroutines/flow/e;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class SafeCollector_commonKt {
    @xh.h(name = "checkContext")
    public static final void a(@dl.d final SafeCollector<?> safeCollector, @dl.d CoroutineContext coroutineContext) {
        if (((Number) coroutineContext.g(0, new p<Integer, CoroutineContext.a, Integer>() { // from class: kotlinx.coroutines.flow.internal.SafeCollector_commonKt$checkContext$result$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @dl.d
            public final Integer a(int i10, @dl.d CoroutineContext.a aVar) {
                CoroutineContext.b<?> key = aVar.getKey();
                CoroutineContext.a aVarF = safeCollector.collectContext.f(key);
                if (key != d2.INSTANCE) {
                    return Integer.valueOf(aVar != aVarF ? Integer.MIN_VALUE : i10 + 1);
                }
                d2 d2Var = (d2) aVarF;
                d2 d2VarB = SafeCollector_commonKt.b((d2) aVar, d2Var);
                if (d2VarB == d2Var) {
                    if (d2Var != null) {
                        i10++;
                    }
                    return Integer.valueOf(i10);
                }
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + d2VarB + ", expected child of " + d2Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, CoroutineContext.a aVar) {
                return a(num.intValue(), aVar);
            }
        })).intValue() == safeCollector.collectContextSize) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + safeCollector.collectContext + ",\n\t\tbut emission happened in " + coroutineContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    @dl.e
    public static final d2 b(@dl.e d2 d2Var, @dl.e d2 d2Var2) {
        while (d2Var != null) {
            if (d2Var == d2Var2 || !(d2Var instanceof k0)) {
                return d2Var;
            }
            d2Var = ((k0) d2Var).K1();
        }
        return null;
    }

    @dl.d
    @r0
    public static final <T> kotlinx.coroutines.flow.e<T> c(@kotlin.b @dl.d p<? super kotlinx.coroutines.flow.f<? super T>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar) {
        return new SafeCollector_commonKt$unsafeFlow$1(pVar);
    }
}
