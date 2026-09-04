package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.w;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.sync.SemaphoreKt;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BA\u0012\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0012H\u0014R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowMerge;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "j", "Lkotlinx/coroutines/q0;", "scope", "Lkotlinx/coroutines/channels/ReceiveChannel;", "n", "Lkotlinx/coroutines/channels/w;", "Lkotlin/b2;", "i", "(Lkotlinx/coroutines/channels/w;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "g", "Lkotlinx/coroutines/flow/e;", "e", "Lkotlinx/coroutines/flow/e;", "flow", "f", "I", "concurrency", "<init>", "(Lkotlinx/coroutines/flow/e;ILkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class ChannelFlowMerge<T> extends ChannelFlow<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlinx.coroutines.flow.e<kotlinx.coroutines.flow.e<T>> flow;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int concurrency;

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowMerge(@dl.d kotlinx.coroutines.flow.e<? extends kotlinx.coroutines.flow.e<? extends T>> eVar, int i10, @dl.d CoroutineContext coroutineContext, int i11, @dl.d BufferOverflow bufferOverflow) {
        super(coroutineContext, i11, bufferOverflow);
        this.flow = eVar;
        this.concurrency = i10;
    }

    public /* synthetic */ ChannelFlowMerge(kotlinx.coroutines.flow.e eVar, int i10, CoroutineContext coroutineContext, int i11, BufferOverflow bufferOverflow, int i12, u uVar) {
        this(eVar, i10, (i12 & 4) != 0 ? EmptyCoroutineContext.f124694b : coroutineContext, (i12 & 8) != 0 ? -2 : i11, (i12 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @dl.d
    protected String g() {
        return "concurrency=" + this.concurrency;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @dl.e
    protected Object i(@dl.d w<? super T> wVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objA = this.flow.a(new ChannelFlowMerge$collectTo$2((d2) cVar.getCom.umeng.analytics.pro.d.R java.lang.String().f(d2.INSTANCE), SemaphoreKt.b(this.concurrency, 0, 2, null), wVar, new m(wVar)), cVar);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @dl.d
    protected ChannelFlow<T> j(@dl.d CoroutineContext context, int capacity, @dl.d BufferOverflow onBufferOverflow) {
        return new ChannelFlowMerge(this.flow, this.concurrency, context, capacity, onBufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @dl.d
    public ReceiveChannel<T> n(@dl.d q0 scope) {
        return ProduceKt.e(scope, this.com.umeng.analytics.pro.d.R java.lang.String, this.capacity, l());
    }
}
