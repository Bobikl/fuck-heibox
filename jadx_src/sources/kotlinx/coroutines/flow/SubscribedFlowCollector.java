package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.t0;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BG\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\u0010\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/flow/SubscribedFlowCollector;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", ak.av, "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "b", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "", "Lkotlin/t;", "action", "<init>", "(Lkotlinx/coroutines/flow/f;Lyh/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class SubscribedFlowCollector<T> implements f<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f<T> collector;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final yh.p<f<? super T>, kotlin.coroutines.c<? super b2>, Object> f129919c;

    /* JADX WARN: Multi-variable type inference failed */
    public SubscribedFlowCollector(@dl.d f<? super T> fVar, @dl.d yh.p<? super f<? super T>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar) {
        this.collector = fVar;
        this.f129919c = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.internal.SafeCollector] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    @dl.e
    public final Object a(@dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        SubscribedFlowCollector$onSubscription$1 subscribedFlowCollector$onSubscription$1;
        SafeCollector safeCollector;
        SubscribedFlowCollector<T> subscribedFlowCollector;
        if (cVar instanceof SubscribedFlowCollector$onSubscription$1) {
            subscribedFlowCollector$onSubscription$1 = (SubscribedFlowCollector$onSubscription$1) cVar;
            int i10 = subscribedFlowCollector$onSubscription$1.f129924f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                subscribedFlowCollector$onSubscription$1.f129924f = i10 - Integer.MIN_VALUE;
            } else {
                subscribedFlowCollector$onSubscription$1 = new SubscribedFlowCollector$onSubscription$1(this, cVar);
            }
        } else {
            subscribedFlowCollector$onSubscription$1 = new SubscribedFlowCollector$onSubscription$1(this, cVar);
        }
        Object obj = subscribedFlowCollector$onSubscription$1.f129922d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        ?? r10 = subscribedFlowCollector$onSubscription$1.f129924f;
        try {
            if (r10 != 0) {
                if (r10 == 1) {
                    safeCollector = (SafeCollector) subscribedFlowCollector$onSubscription$1.f129921c;
                    subscribedFlowCollector = (SubscribedFlowCollector) subscribedFlowCollector$onSubscription$1.f129920b;
                    t0.n(obj);
                } else {
                    if (r10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t0.n(obj);
                }
                return b2.f124493a;
            }
            t0.n(obj);
            safeCollector = new SafeCollector(this.collector, subscribedFlowCollector$onSubscription$1.getContext());
            yh.p<f<? super T>, kotlin.coroutines.c<? super b2>, Object> pVar = this.f129919c;
            subscribedFlowCollector$onSubscription$1.f129920b = this;
            subscribedFlowCollector$onSubscription$1.f129921c = safeCollector;
            subscribedFlowCollector$onSubscription$1.f129924f = 1;
            if (pVar.invoke(safeCollector, subscribedFlowCollector$onSubscription$1) == objH) {
                return objH;
            }
            subscribedFlowCollector = this;
            safeCollector.releaseIntercepted();
            f<T> fVar = subscribedFlowCollector.collector;
            r10 = fVar instanceof SubscribedFlowCollector;
            if (r10 == 0) {
                return b2.f124493a;
            }
            subscribedFlowCollector$onSubscription$1.f129920b = null;
            subscribedFlowCollector$onSubscription$1.f129921c = null;
            subscribedFlowCollector$onSubscription$1.f129924f = 2;
            if (((SubscribedFlowCollector) fVar).a(subscribedFlowCollector$onSubscription$1) == objH) {
                return objH;
            }
            return b2.f124493a;
        } catch (Throwable th2) {
            r10.releaseIntercepted();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.flow.f
    @dl.e
    public Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        return this.collector.emit(t10, cVar);
    }
}
