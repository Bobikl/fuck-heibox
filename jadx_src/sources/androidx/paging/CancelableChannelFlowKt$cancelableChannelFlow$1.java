package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.d2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: CancelableChannelFlow.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/b1;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1", f = "CancelableChannelFlow.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
public final class CancelableChannelFlowKt$cancelableChannelFlow$1<T> extends SuspendLambda implements yh.p<b1<T>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f25456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f25457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ d2 f25458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.p f25459e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CancelableChannelFlowKt$cancelableChannelFlow$1(d2 d2Var, yh.p pVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f25458d = d2Var;
        this.f25459e = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        CancelableChannelFlowKt$cancelableChannelFlow$1 cancelableChannelFlowKt$cancelableChannelFlow$1 = new CancelableChannelFlowKt$cancelableChannelFlow$1(this.f25458d, this.f25459e, completion);
        cancelableChannelFlowKt$cancelableChannelFlow$1.f25456b = obj;
        return cancelableChannelFlowKt$cancelableChannelFlow$1;
    }

    @Override // yh.p
    public final Object invoke(Object obj, kotlin.coroutines.c<? super b2> cVar) {
        return ((CancelableChannelFlowKt$cancelableChannelFlow$1) create(obj, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f25457c;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            final b1 b1Var = (b1) this.f25456b;
            this.f25458d.K(new yh.l<Throwable, b2>() { // from class: androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1.1
                {
                    super(1);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                    invoke2(th2);
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@dl.e Throwable th2) {
                    kotlinx.coroutines.channels.b0.a.a(b1Var, null, 1, null);
                }
            });
            yh.p pVar = this.f25459e;
            this.f25457c = 1;
            if (pVar.invoke(b1Var, this) == objH) {
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
