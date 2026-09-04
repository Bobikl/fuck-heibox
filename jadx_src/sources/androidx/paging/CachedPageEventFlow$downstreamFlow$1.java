package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.d2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: CachedPageEventFlow.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/b1;", "Landroidx/paging/PageEvent;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1", f = "CachedPageEventFlow.kt", i = {0}, l = {83, 117}, m = "invokeSuspend", n = {"$this$simpleChannelFlow"}, s = {"L$0"})
public final class CachedPageEventFlow$downstreamFlow$1<T> extends SuspendLambda implements yh.p<b1<PageEvent<T>>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f25405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f25406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ CachedPageEventFlow f25407d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CachedPageEventFlow$downstreamFlow$1(CachedPageEventFlow cachedPageEventFlow, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f25407d = cachedPageEventFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        CachedPageEventFlow$downstreamFlow$1 cachedPageEventFlow$downstreamFlow$1 = new CachedPageEventFlow$downstreamFlow$1(this.f25407d, completion);
        cachedPageEventFlow$downstreamFlow$1.f25405b = obj;
        return cachedPageEventFlow$downstreamFlow$1;
    }

    @Override // yh.p
    public final Object invoke(Object obj, kotlin.coroutines.c<? super b2> cVar) {
        return ((CachedPageEventFlow$downstreamFlow$1) create(obj, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        b1 b1Var;
        Object objA;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f25406c;
        if (i10 != 0) {
            if (i10 == 1) {
                b1Var = (b1) this.f25405b;
                kotlin.t0.n(obj);
                objA = obj;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            return b2.f124493a;
        }
        kotlin.t0.n(obj);
        b1Var = (b1) this.f25405b;
        FlattenedPageController flattenedPageController = this.f25407d.pageController;
        this.f25405b = b1Var;
        this.f25406c = 1;
        objA = flattenedPageController.a(this);
        if (objA == objH) {
            return objH;
        }
        b1 b1Var2 = b1Var;
        TemporaryDownstream temporaryDownstream = (TemporaryDownstream) objA;
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.f124889b = Integer.MIN_VALUE;
        d2 d2VarF = kotlinx.coroutines.k.f(b1Var2, null, null, new CachedPageEventFlow$downstreamFlow$1$historyCollection$1(b1Var2, temporaryDownstream, intRef, null), 3, null);
        d2[] d2VarArr = {kotlinx.coroutines.k.f(b1Var2, null, null, new CachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1(this, b1Var2, temporaryDownstream, d2VarF, intRef, null), 3, null), d2VarF};
        this.f25405b = null;
        this.f25406c = 2;
        if (AwaitKt.d(d2VarArr, this) == objH) {
            return objH;
        }
        return b2.f124493a;
    }
}
