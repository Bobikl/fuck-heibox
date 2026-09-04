package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.t0;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BG\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\u0013\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000e¢\u0006\u0002\b\u0012ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/flow/SubscribedSharedFlow;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/n;", "Lkotlinx/coroutines/flow/f;", "collector", "", ak.av, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "b", "Lkotlinx/coroutines/flow/n;", "sharedFlow", "", "()Ljava/util/List;", "replayCache", "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "", "Lkotlin/t;", "action", "<init>", "(Lkotlinx/coroutines/flow/n;Lyh/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class SubscribedSharedFlow<T> implements n<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final n<T> sharedFlow;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final yh.p<f<? super T>, kotlin.coroutines.c<? super b2>, Object> f129926c;

    /* JADX WARN: Multi-variable type inference failed */
    public SubscribedSharedFlow(@dl.d n<? extends T> nVar, @dl.d yh.p<? super f<? super T>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar) {
        this.sharedFlow = nVar;
        this.f129926c = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.n, kotlinx.coroutines.flow.e
    @dl.e
    public Object a(@dl.d f<? super T> fVar, @dl.d kotlin.coroutines.c<?> cVar) throws Throwable {
        SubscribedSharedFlow$collect$1 subscribedSharedFlow$collect$1;
        if (cVar instanceof SubscribedSharedFlow$collect$1) {
            subscribedSharedFlow$collect$1 = (SubscribedSharedFlow$collect$1) cVar;
            int i10 = subscribedSharedFlow$collect$1.f129929d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                subscribedSharedFlow$collect$1.f129929d = i10 - Integer.MIN_VALUE;
            } else {
                subscribedSharedFlow$collect$1 = new SubscribedSharedFlow$collect$1(this, cVar);
            }
        } else {
            subscribedSharedFlow$collect$1 = new SubscribedSharedFlow$collect$1(this, cVar);
        }
        Object obj = subscribedSharedFlow$collect$1.f129927b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = subscribedSharedFlow$collect$1.f129929d;
        if (i11 == 0) {
            t0.n(obj);
            n<T> nVar = this.sharedFlow;
            SubscribedFlowCollector subscribedFlowCollector = new SubscribedFlowCollector(fVar, this.f129926c);
            subscribedSharedFlow$collect$1.f129929d = 1;
            if (nVar.a(subscribedFlowCollector, subscribedSharedFlow$collect$1) == objH) {
                return objH;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.flow.n
    @dl.d
    public List<T> b() {
        return this.sharedFlow.b();
    }
}
