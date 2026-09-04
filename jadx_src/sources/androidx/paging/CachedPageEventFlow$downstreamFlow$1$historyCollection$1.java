package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: CachedPageEventFlow.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$historyCollection$1", f = "CachedPageEventFlow.kt", i = {}, l = {bb.c.b.G2}, m = "invokeSuspend", n = {}, s = {})
public final class CachedPageEventFlow$downstreamFlow$1$historyCollection$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f25424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ b1 f25425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ TemporaryDownstream f25426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Ref.IntRef f25427e;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Collect.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    public static final class a<T> implements kotlinx.coroutines.flow.f<kotlin.collections.h0<? extends PageEvent<T>>> {
        public a() {
        }

        @Override // kotlinx.coroutines.flow.f
        @dl.e
        public Object emit(Object obj, @dl.d kotlin.coroutines.c cVar) {
            kotlin.collections.h0 h0Var = (kotlin.collections.h0) obj;
            CachedPageEventFlow$downstreamFlow$1$historyCollection$1.this.f25427e.f124889b = h0Var.e();
            Object objX = CachedPageEventFlow$downstreamFlow$1$historyCollection$1.this.f25425c.X(h0Var.f(), cVar);
            return objX == kotlin.coroutines.intrinsics.b.h() ? objX : b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CachedPageEventFlow$downstreamFlow$1$historyCollection$1(b1 b1Var, TemporaryDownstream temporaryDownstream, Ref.IntRef intRef, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f25425c = b1Var;
        this.f25426d = temporaryDownstream;
        this.f25427e = intRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        return new CachedPageEventFlow$downstreamFlow$1$historyCollection$1(this.f25425c, this.f25426d, this.f25427e, completion);
    }

    @Override // yh.p
    public final Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        return ((CachedPageEventFlow$downstreamFlow$1$historyCollection$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f25424b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            kotlinx.coroutines.flow.e eVarB = this.f25426d.b();
            a aVar = new a();
            this.f25424b = 1;
            if (eVarB.a(aVar, this) == objH) {
                return objH;
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
