package kotlinx.coroutines.flow.internal;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/flow/internal/e;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "j", "Lkotlinx/coroutines/flow/e;", "k", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/b2;", ak.aB, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "flow", "<init>", "(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class e<T> extends ChannelFlowOperator<T, T> {
    public e(@dl.d kotlinx.coroutines.flow.e<? extends T> eVar, @dl.d CoroutineContext coroutineContext, int i10, @dl.d BufferOverflow bufferOverflow) {
        super(eVar, coroutineContext, i10, bufferOverflow);
    }

    public /* synthetic */ e(kotlinx.coroutines.flow.e eVar, CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow, int i11, u uVar) {
        this(eVar, (i11 & 2) != 0 ? EmptyCoroutineContext.f124694b : coroutineContext, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @dl.d
    protected ChannelFlow<T> j(@dl.d CoroutineContext context, int capacity, @dl.d BufferOverflow onBufferOverflow) {
        return new e(this.flow, context, capacity, onBufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @dl.d
    public kotlinx.coroutines.flow.e<T> k() {
        return (kotlinx.coroutines.flow.e<T>) this.flow;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    @dl.e
    protected Object s(@dl.d kotlinx.coroutines.flow.f<? super T> fVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objA = this.flow.a((kotlinx.coroutines.flow.f<? super S>) fVar, cVar);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
    }
}
