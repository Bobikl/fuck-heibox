package kotlinx.coroutines.flow.internal;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.r0;
import yh.q;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003Bz\u0012B\u0010\u0018\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0011¢\u0006\u0002\b\u0017\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014J!\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest;", androidx.exifinterface.media.a.f23244d5, "R", "Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "j", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/b2;", ak.aB, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lkotlin/m0;", "name", "value", "Lkotlin/coroutines/c;", "", "Lkotlin/t;", "transform", "Lkotlinx/coroutines/flow/e;", "flow", "<init>", "(Lyh/q;Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class ChannelFlowTransformLatest<T, R> extends ChannelFlowOperator<T, R> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final q<kotlinx.coroutines.flow.f<? super R>, T, kotlin.coroutines.c<? super b2>, Object> f129966f;

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowTransformLatest(@dl.d q<? super kotlinx.coroutines.flow.f<? super R>, ? super T, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar, @dl.d kotlinx.coroutines.flow.e<? extends T> eVar, @dl.d CoroutineContext coroutineContext, int i10, @dl.d BufferOverflow bufferOverflow) {
        super(eVar, coroutineContext, i10, bufferOverflow);
        this.f129966f = qVar;
    }

    public /* synthetic */ ChannelFlowTransformLatest(q qVar, kotlinx.coroutines.flow.e eVar, CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow, int i11, u uVar) {
        this(qVar, eVar, (i11 & 4) != 0 ? EmptyCoroutineContext.f124694b : coroutineContext, (i11 & 8) != 0 ? -2 : i10, (i11 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @dl.d
    protected ChannelFlow<R> j(@dl.d CoroutineContext context, int capacity, @dl.d BufferOverflow onBufferOverflow) {
        return new ChannelFlowTransformLatest(this.f129966f, this.flow, context, capacity, onBufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    @dl.e
    protected Object s(@dl.d kotlinx.coroutines.flow.f<? super R> fVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objG = r0.g(new ChannelFlowTransformLatest$flowCollect$3(this, fVar, null), cVar);
        return objG == kotlin.coroutines.intrinsics.b.h() ? objG : b2.f124493a;
    }
}
