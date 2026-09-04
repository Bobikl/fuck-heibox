package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.t0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BW\u0012-\u0010\u0014\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010¢\u0006\u0002\b\u0013\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/flow/CallbackFlowBuilder;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/c;", "Lkotlinx/coroutines/channels/w;", "scope", "Lkotlin/b2;", "i", "(Lkotlinx/coroutines/channels/w;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "j", "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "", "Lkotlin/t;", "block", "<init>", "(Lyh/p;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class CallbackFlowBuilder<T> extends c<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final yh.p<kotlinx.coroutines.channels.w<? super T>, kotlin.coroutines.c<? super b2>, Object> f129195f;

    /* JADX WARN: Multi-variable type inference failed */
    public CallbackFlowBuilder(@dl.d yh.p<? super kotlinx.coroutines.channels.w<? super T>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, @dl.d CoroutineContext coroutineContext, int i10, @dl.d BufferOverflow bufferOverflow) {
        super(pVar, coroutineContext, i10, bufferOverflow);
        this.f129195f = pVar;
    }

    public /* synthetic */ CallbackFlowBuilder(yh.p pVar, CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow, int i11, kotlin.jvm.internal.u uVar) {
        this(pVar, (i11 & 2) != 0 ? EmptyCoroutineContext.f124694b : coroutineContext, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.c, kotlinx.coroutines.flow.internal.ChannelFlow
    @dl.e
    protected Object i(@dl.d kotlinx.coroutines.channels.w<? super T> wVar, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        CallbackFlowBuilder$collectTo$1 callbackFlowBuilder$collectTo$1;
        if (cVar instanceof CallbackFlowBuilder$collectTo$1) {
            callbackFlowBuilder$collectTo$1 = (CallbackFlowBuilder$collectTo$1) cVar;
            int i10 = callbackFlowBuilder$collectTo$1.f129199e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                callbackFlowBuilder$collectTo$1.f129199e = i10 - Integer.MIN_VALUE;
            } else {
                callbackFlowBuilder$collectTo$1 = new CallbackFlowBuilder$collectTo$1(this, cVar);
            }
        } else {
            callbackFlowBuilder$collectTo$1 = new CallbackFlowBuilder$collectTo$1(this, cVar);
        }
        Object obj = callbackFlowBuilder$collectTo$1.f129197c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = callbackFlowBuilder$collectTo$1.f129199e;
        if (i11 == 0) {
            t0.n(obj);
            callbackFlowBuilder$collectTo$1.f129196b = wVar;
            callbackFlowBuilder$collectTo$1.f129199e = 1;
            if (super.i(wVar, callbackFlowBuilder$collectTo$1) == objH) {
                return objH;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wVar = (kotlinx.coroutines.channels.w) callbackFlowBuilder$collectTo$1.f129196b;
            t0.n(obj);
        }
        if (wVar.O()) {
            return b2.f124493a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    @Override // kotlinx.coroutines.flow.c, kotlinx.coroutines.flow.internal.ChannelFlow
    @dl.d
    protected ChannelFlow<T> j(@dl.d CoroutineContext context, int capacity, @dl.d BufferOverflow onBufferOverflow) {
        return new CallbackFlowBuilder(this.f129195f, context, capacity, onBufferOverflow);
    }
}
