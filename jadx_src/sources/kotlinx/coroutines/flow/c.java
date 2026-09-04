package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BW\u0012-\u0010\u0015\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011¢\u0006\u0002\b\u0014\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J!\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0094@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/flow/c;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "j", "Lkotlinx/coroutines/channels/w;", "scope", "Lkotlin/b2;", "i", "(Lkotlinx/coroutines/channels/w;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "toString", "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "", "Lkotlin/t;", "block", "<init>", "(Lyh/p;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class c<T> extends ChannelFlow<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final yh.p<kotlinx.coroutines.channels.w<? super T>, kotlin.coroutines.c<? super b2>, Object> f129933e;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@dl.d yh.p<? super kotlinx.coroutines.channels.w<? super T>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, @dl.d CoroutineContext coroutineContext, int i10, @dl.d BufferOverflow bufferOverflow) {
        super(coroutineContext, i10, bufferOverflow);
        this.f129933e = pVar;
    }

    public /* synthetic */ c(yh.p pVar, CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow, int i11, kotlin.jvm.internal.u uVar) {
        this(pVar, (i11 & 2) != 0 ? EmptyCoroutineContext.f124694b : coroutineContext, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    static /* synthetic */ Object o(c cVar, kotlinx.coroutines.channels.w wVar, kotlin.coroutines.c cVar2) {
        Object objInvoke = cVar.f129933e.invoke(wVar, cVar2);
        return objInvoke == kotlin.coroutines.intrinsics.b.h() ? objInvoke : b2.f124493a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @dl.e
    protected Object i(@dl.d kotlinx.coroutines.channels.w<? super T> wVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        return o(this, wVar, cVar);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @dl.d
    protected ChannelFlow<T> j(@dl.d CoroutineContext context, int capacity, @dl.d BufferOverflow onBufferOverflow) {
        return new c(this.f129933e, context, capacity, onBufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @dl.d
    public String toString() {
        return "block[" + this.f129933e + "] -> " + super.toString();
    }
}
