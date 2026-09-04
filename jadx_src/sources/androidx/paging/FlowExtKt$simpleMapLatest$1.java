package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [R, T] */
/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "Lkotlinx/coroutines/flow/f;", "it", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.FlowExtKt$simpleMapLatest$1", f = "FlowExt.kt", i = {}, l = {93, 93}, m = "invokeSuspend", n = {}, s = {})
public final class FlowExtKt$simpleMapLatest$1<R, T> extends SuspendLambda implements yh.q<kotlinx.coroutines.flow.f<? super R>, T, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f25544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f25545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f25546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.p f25547e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$simpleMapLatest$1(yh.p pVar, kotlin.coroutines.c cVar) {
        super(3, cVar);
        this.f25547e = pVar;
    }

    @dl.d
    public final kotlin.coroutines.c<b2> a(@dl.d kotlinx.coroutines.flow.f<? super R> create, T t10, @dl.d kotlin.coroutines.c<? super b2> continuation) {
        kotlin.jvm.internal.f0.p(create, "$this$create");
        kotlin.jvm.internal.f0.p(continuation, "continuation");
        FlowExtKt$simpleMapLatest$1 flowExtKt$simpleMapLatest$1 = new FlowExtKt$simpleMapLatest$1(this.f25547e, continuation);
        flowExtKt$simpleMapLatest$1.f25544b = create;
        flowExtKt$simpleMapLatest$1.f25545c = t10;
        return flowExtKt$simpleMapLatest$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.e
    public final Object f(@dl.d Object obj) {
        kotlinx.coroutines.flow.f fVar = (kotlinx.coroutines.flow.f) this.f25544b;
        Object objInvoke = this.f25547e.invoke(this.f25545c, this);
        kotlin.jvm.internal.c0.e(0);
        fVar.emit(objInvoke, this);
        kotlin.jvm.internal.c0.e(2);
        kotlin.jvm.internal.c0.e(1);
        return b2.f124493a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yh.q
    public final Object invoke(Object obj, Object obj2, kotlin.coroutines.c<? super b2> cVar) {
        return ((FlowExtKt$simpleMapLatest$1) a((kotlinx.coroutines.flow.f) obj, obj2, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlinx.coroutines.flow.f fVar;
        kotlinx.coroutines.flow.f fVar2;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f25546d;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlinx.coroutines.flow.f fVar3 = (kotlinx.coroutines.flow.f) this.f25544b;
                kotlin.t0.n(obj);
                fVar2 = fVar3;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            return b2.f124493a;
        }
        kotlin.t0.n(obj);
        fVar = (kotlinx.coroutines.flow.f) this.f25544b;
        Object obj2 = this.f25545c;
        yh.p pVar = this.f25547e;
        this.f25544b = fVar;
        this.f25546d = 1;
        obj = pVar.invoke(obj2, this);
        if (obj == objH) {
            fVar2 = fVar;
            return objH;
        }
        fVar2 = fVar;
        this.f25544b = null;
        this.f25546d = 2;
        if (fVar2.emit(obj, this) == objH) {
            return objH;
        }
        return b2.f124493a;
    }
}
