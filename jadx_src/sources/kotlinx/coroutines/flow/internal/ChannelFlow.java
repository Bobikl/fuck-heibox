package kotlinx.coroutines.flow.internal;

import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.w;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.z1;
import yh.p;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
@z1
@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J&\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH$J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH¤@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u000e\u001a\u00020\u0012H\u0016J!\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001b\u001a\u00020\u0019H\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010!R9\u0010'\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0#\u0012\u0006\u0012\u0004\u0018\u00010$0\"8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlow;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/internal/i;", "Lkotlinx/coroutines/flow/e;", "k", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "f", "j", "Lkotlinx/coroutines/channels/w;", "scope", "Lkotlin/b2;", "i", "(Lkotlinx/coroutines/channels/w;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/q0;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "n", "Lkotlinx/coroutines/flow/f;", "collector", ak.av, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "g", "toString", "b", "Lkotlin/coroutines/CoroutineContext;", ak.aF, "I", "d", "Lkotlinx/coroutines/channels/BufferOverflow;", "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "", "l", "()Lyh/p;", "collectToFun", "m", "()I", "produceCapacity", "<init>", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class ChannelFlow<T> implements i<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final CoroutineContext context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @xh.e
    public final int capacity;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final BufferOverflow onBufferOverflow;

    public ChannelFlow(@dl.d CoroutineContext coroutineContext, int i10, @dl.d BufferOverflow bufferOverflow) {
        this.context = coroutineContext;
        this.capacity = i10;
        this.onBufferOverflow = bufferOverflow;
    }

    static /* synthetic */ Object h(ChannelFlow channelFlow, kotlinx.coroutines.flow.f fVar, kotlin.coroutines.c cVar) {
        Object objG = r0.g(new ChannelFlow$collect$2(fVar, channelFlow, null), cVar);
        return objG == kotlin.coroutines.intrinsics.b.h() ? objG : b2.f124493a;
    }

    @Override // kotlinx.coroutines.flow.e
    @dl.e
    public Object a(@dl.d kotlinx.coroutines.flow.f<? super T> fVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        return h(this, fVar, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013 A[PHI: r4
  0x0013: PHI (r4v5 int) = (r4v2 int), (r4v2 int), (r4v4 int) binds: [B:8:0x0011, B:13:0x0019, B:16:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlinx.coroutines.flow.internal.i
    @dl.d
    public kotlinx.coroutines.flow.e<T> f(@dl.d CoroutineContext context, int capacity, @dl.d BufferOverflow onBufferOverflow) {
        CoroutineContext coroutineContextI = context.I(this.context);
        if (onBufferOverflow == BufferOverflow.SUSPEND) {
            int i10 = this.capacity;
            if (i10 != -3) {
                if (capacity == -3) {
                    capacity = i10;
                } else if (i10 != -2) {
                    if (capacity != -2 && (i10 = i10 + capacity) < 0) {
                        capacity = Integer.MAX_VALUE;
                    } else {
                        capacity = i10;
                    }
                }
            }
            onBufferOverflow = this.onBufferOverflow;
        }
        return (f0.g(coroutineContextI, this.context) && capacity == this.capacity && onBufferOverflow == this.onBufferOverflow) ? this : j(coroutineContextI, capacity, onBufferOverflow);
    }

    @dl.e
    protected String g() {
        return null;
    }

    @dl.e
    protected abstract Object i(@dl.d w<? super T> wVar, @dl.d kotlin.coroutines.c<? super b2> cVar);

    @dl.d
    protected abstract ChannelFlow<T> j(@dl.d CoroutineContext context, int capacity, @dl.d BufferOverflow onBufferOverflow);

    @dl.e
    public kotlinx.coroutines.flow.e<T> k() {
        return null;
    }

    @dl.d
    public final p<w<? super T>, kotlin.coroutines.c<? super b2>, Object> l() {
        return new ChannelFlow$collectToFun$1(this, null);
    }

    public final int m() {
        int i10 = this.capacity;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    @dl.d
    public ReceiveChannel<T> n(@dl.d q0 scope) {
        return ProduceKt.g(scope, this.context, m(), this.onBufferOverflow, CoroutineStart.ATOMIC, null, l(), 16, null);
    }

    @dl.d
    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strG = g();
        if (strG != null) {
            arrayList.add(strG);
        }
        if (this.context != EmptyCoroutineContext.f124694b) {
            arrayList.add("context=" + this.context);
        }
        if (this.capacity != -3) {
            arrayList.add("capacity=" + this.capacity);
        }
        if (this.onBufferOverflow != BufferOverflow.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.onBufferOverflow);
        }
        return t0.a(this) + '[' + CollectionsKt___CollectionsKt.h3(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
