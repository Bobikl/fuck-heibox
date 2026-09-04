package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: PagingDataDiffer.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PagingDataDiffer$collectFrom$2", f = "PagingDataDiffer.kt", i = {}, l = {bb.c.b.A4}, m = "invokeSuspend", n = {}, s = {})
public final class PagingDataDiffer$collectFrom$2 extends SuspendLambda implements yh.l<kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f26032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ PagingDataDiffer f26033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ o0 f26034d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagingDataDiffer$collectFrom$2(PagingDataDiffer pagingDataDiffer, o0 o0Var, kotlin.coroutines.c cVar) {
        super(1, cVar);
        this.f26033c = pagingDataDiffer;
        this.f26034d = o0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        return new PagingDataDiffer$collectFrom$2(this.f26033c, this.f26034d, completion);
    }

    @Override // yh.l
    public final Object invoke(kotlin.coroutines.c<? super b2> cVar) {
        return ((PagingDataDiffer$collectFrom$2) create(cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f26032b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            this.f26033c.com.tencent.open.SocialConstants.PARAM_RECEIVER java.lang.String = this.f26034d.getCom.tencent.open.SocialConstants.PARAM_RECEIVER java.lang.String();
            kotlinx.coroutines.flow.e eVarE = this.f26034d.e();
            PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 pagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 = new PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1(this);
            this.f26032b = 1;
            if (eVarE.a(pagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1, this) == objH) {
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
