package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: CachedPageEventFlow.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/f;", "Lkotlin/collections/h0;", "Landroidx/paging/PageEvent;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.CachedPageEventFlow$multicastedSrc$1", f = "CachedPageEventFlow.kt", i = {}, l = {bb.c.b.G2}, m = "invokeSuspend", n = {}, s = {})
public final class CachedPageEventFlow$multicastedSrc$1<T> extends SuspendLambda implements yh.p<kotlinx.coroutines.flow.f<? super kotlin.collections.h0<? extends PageEvent<T>>>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f25429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f25430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ CachedPageEventFlow f25431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.flow.e f25432e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CachedPageEventFlow$multicastedSrc$1(CachedPageEventFlow cachedPageEventFlow, kotlinx.coroutines.flow.e eVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f25431d = cachedPageEventFlow;
        this.f25432e = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        CachedPageEventFlow$multicastedSrc$1 cachedPageEventFlow$multicastedSrc$1 = new CachedPageEventFlow$multicastedSrc$1(this.f25431d, this.f25432e, completion);
        cachedPageEventFlow$multicastedSrc$1.f25429b = obj;
        return cachedPageEventFlow$multicastedSrc$1;
    }

    @Override // yh.p
    public final Object invoke(Object obj, kotlin.coroutines.c<? super b2> cVar) {
        return ((CachedPageEventFlow$multicastedSrc$1) create(obj, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f25430c;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            kotlinx.coroutines.flow.f<? super T> fVar = (kotlinx.coroutines.flow.f) this.f25429b;
            if (this.f25431d.collectedFromSource.compareAndSet(false, true)) {
                kotlinx.coroutines.flow.e eVarE2 = kotlinx.coroutines.flow.g.e2(this.f25432e);
                this.f25430c = 1;
                if (eVarE2.a(fVar, this) == objH) {
                    return objH;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        return b2.f124493a;
    }
}
