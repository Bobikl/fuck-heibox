package kotlinx.coroutines.flow.internal;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.w;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H¤@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\fJ\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", androidx.exifinterface.media.a.R4, androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/coroutines/CoroutineContext;", "newContext", "Lkotlin/b2;", "r", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/c;)Ljava/lang/Object;", ak.aB, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/w;", "scope", "i", "(Lkotlinx/coroutines/channels/w;Lkotlin/coroutines/c;)Ljava/lang/Object;", ak.av, "", "toString", "Lkotlinx/coroutines/flow/e;", "e", "Lkotlinx/coroutines/flow/e;", "flow", com.umeng.analytics.pro.d.R, "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class ChannelFlowOperator<S, T> extends ChannelFlow<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    protected final kotlinx.coroutines.flow.e<S> flow;

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowOperator(@dl.d kotlinx.coroutines.flow.e<? extends S> eVar, @dl.d CoroutineContext coroutineContext, int i10, @dl.d BufferOverflow bufferOverflow) {
        super(coroutineContext, i10, bufferOverflow);
        this.flow = eVar;
    }

    static /* synthetic */ Object p(ChannelFlowOperator channelFlowOperator, kotlinx.coroutines.flow.f fVar, kotlin.coroutines.c cVar) {
        if (channelFlowOperator.capacity == -3) {
            CoroutineContext context = cVar.getContext();
            CoroutineContext coroutineContextI = context.I(channelFlowOperator.context);
            if (f0.g(coroutineContextI, context)) {
                Object objS = channelFlowOperator.s(fVar, cVar);
                return objS == kotlin.coroutines.intrinsics.b.h() ? objS : b2.f124493a;
            }
            kotlin.coroutines.d.b bVar = kotlin.coroutines.d.f124698w1;
            if (f0.g(coroutineContextI.f(bVar), context.f(bVar))) {
                Object objR = channelFlowOperator.r(fVar, coroutineContextI, cVar);
                return objR == kotlin.coroutines.intrinsics.b.h() ? objR : b2.f124493a;
            }
        }
        Object objA = super.a(fVar, cVar);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
    }

    static /* synthetic */ Object q(ChannelFlowOperator channelFlowOperator, w wVar, kotlin.coroutines.c cVar) {
        Object objS = channelFlowOperator.s(new m(wVar), cVar);
        return objS == kotlin.coroutines.intrinsics.b.h() ? objS : b2.f124493a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r(kotlinx.coroutines.flow.f<? super T> fVar, CoroutineContext coroutineContext, kotlin.coroutines.c<? super b2> cVar) {
        Object objD = d.d(coroutineContext, d.e(fVar, cVar.getContext()), null, new ChannelFlowOperator$collectWithContextUndispatched$2(this, null), cVar, 4, null);
        return objD == kotlin.coroutines.intrinsics.b.h() ? objD : b2.f124493a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.e
    @dl.e
    public Object a(@dl.d kotlinx.coroutines.flow.f<? super T> fVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        return p(this, fVar, cVar);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @dl.e
    protected Object i(@dl.d w<? super T> wVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        return q(this, wVar, cVar);
    }

    @dl.e
    protected abstract Object s(@dl.d kotlinx.coroutines.flow.f<? super T> fVar, @dl.d kotlin.coroutines.c<? super b2> cVar);

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @dl.d
    public String toString() {
        return this.flow + " -> " + super.toString();
    }
}
