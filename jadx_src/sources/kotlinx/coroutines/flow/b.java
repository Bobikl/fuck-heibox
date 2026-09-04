package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0006\u0010&\u001a\u00020#\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b'\u0010(J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0012\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lkotlinx/coroutines/flow/b;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlin/b2;", "o", "()V", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "j", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlinx/coroutines/flow/e;", "k", "()Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/channels/w;", "scope", "i", "(Lkotlinx/coroutines/channels/w;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/q0;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "n", "(Lkotlinx/coroutines/q0;)Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlinx/coroutines/flow/f;", "collector", ak.av, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "g", "()Ljava/lang/String;", "e", "Lkotlinx/coroutines/channels/ReceiveChannel;", "channel", "", "f", "Z", "consume", "<init>", "(Lkotlinx/coroutines/channels/ReceiveChannel;ZLkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class b<T> extends ChannelFlow<T> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f129930g = AtomicIntegerFieldUpdater.newUpdater(b.class, "consumed");

    @dl.d
    private volatile /* synthetic */ int consumed;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final ReceiveChannel<T> channel;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean consume;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@dl.d ReceiveChannel<? extends T> receiveChannel, boolean z10, @dl.d CoroutineContext coroutineContext, int i10, @dl.d BufferOverflow bufferOverflow) {
        super(coroutineContext, i10, bufferOverflow);
        this.channel = receiveChannel;
        this.consume = z10;
        this.consumed = 0;
    }

    public /* synthetic */ b(ReceiveChannel receiveChannel, boolean z10, CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow, int i11, kotlin.jvm.internal.u uVar) {
        this(receiveChannel, z10, (i11 & 4) != 0 ? EmptyCoroutineContext.f124694b : coroutineContext, (i11 & 8) != 0 ? -3 : i10, (i11 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    private final void o() {
        if (this.consume) {
            if (!(f129930g.getAndSet(this, 1) == 0)) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
        }
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.e
    @dl.e
    public Object a(@dl.d f<? super T> fVar, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        if (this.capacity != -3) {
            Object objA = super.a(fVar, cVar);
            return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
        }
        o();
        Object objE = FlowKt__ChannelsKt.e(fVar, this.channel, this.consume, cVar);
        return objE == kotlin.coroutines.intrinsics.b.h() ? objE : b2.f124493a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @dl.d
    protected String g() {
        return "channel=" + this.channel;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @dl.e
    protected Object i(@dl.d kotlinx.coroutines.channels.w<? super T> wVar, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        Object objE = FlowKt__ChannelsKt.e(new kotlinx.coroutines.flow.internal.m(wVar), this.channel, this.consume, cVar);
        return objE == kotlin.coroutines.intrinsics.b.h() ? objE : b2.f124493a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @dl.d
    protected ChannelFlow<T> j(@dl.d CoroutineContext context, int capacity, @dl.d BufferOverflow onBufferOverflow) {
        return new b(this.channel, this.consume, context, capacity, onBufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @dl.d
    public e<T> k() {
        return new b(this.channel, this.consume, null, 0, null, 28, null);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @dl.d
    public ReceiveChannel<T> n(@dl.d q0 scope) {
        o();
        return this.capacity == -3 ? this.channel : super.n(scope);
    }
}
