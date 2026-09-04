package kotlinx.coroutines.flow.internal;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.w0;
import kotlinx.coroutines.internal.ThreadContextKt;
import yh.p;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a]\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00012\b\b\u0002\u0010\f\u001a\u00020\u000b2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\rH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "b", "Lkotlinx/coroutines/flow/f;", "Lkotlin/coroutines/CoroutineContext;", "emitContext", "e", androidx.exifinterface.media.a.X4, "newContext", "value", "", "countOrElement", "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "block", ak.aF, "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Ljava/lang/Object;Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class d {
    @dl.d
    public static final <T> ChannelFlow<T> b(@dl.d kotlinx.coroutines.flow.e<? extends T> eVar) {
        ChannelFlow<T> channelFlow = eVar instanceof ChannelFlow ? (ChannelFlow) eVar : null;
        return channelFlow == null ? new e(eVar, null, 0, null, 14, null) : channelFlow;
    }

    @dl.e
    public static final <T, V> Object c(@dl.d CoroutineContext coroutineContext, V v10, @dl.d Object obj, @dl.d p<? super V, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super T> cVar) {
        Object objC = ThreadContextKt.c(coroutineContext, obj);
        try {
            Object objInvoke = ((p) w0.q(pVar, 2)).invoke(v10, new n(cVar, coroutineContext));
            ThreadContextKt.a(coroutineContext, objC);
            if (objInvoke == kotlin.coroutines.intrinsics.b.h()) {
                kotlin.coroutines.jvm.internal.f.c(cVar);
            }
            return objInvoke;
        } catch (Throwable th2) {
            ThreadContextKt.a(coroutineContext, objC);
            throw th2;
        }
    }

    public static /* synthetic */ Object d(CoroutineContext coroutineContext, Object obj, Object obj2, p pVar, kotlin.coroutines.c cVar, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = ThreadContextKt.b(coroutineContext);
        }
        return c(coroutineContext, obj, obj2, pVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> kotlinx.coroutines.flow.f<T> e(kotlinx.coroutines.flow.f<? super T> fVar, CoroutineContext coroutineContext) {
        return fVar instanceof m ? true : fVar instanceof k ? fVar : new UndispatchedContextCollector(fVar, coroutineContext);
    }
}
