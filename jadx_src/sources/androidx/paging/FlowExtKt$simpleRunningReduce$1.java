package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/f;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1", f = "FlowExt.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
public final class FlowExtKt$simpleRunningReduce$1<T> extends SuspendLambda implements yh.p<kotlinx.coroutines.flow.f<? super T>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f25548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f25549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.flow.e f25550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.q f25551e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowExtKt$simpleRunningReduce$1(kotlinx.coroutines.flow.e eVar, yh.q qVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f25550d = eVar;
        this.f25551e = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        FlowExtKt$simpleRunningReduce$1 flowExtKt$simpleRunningReduce$1 = new FlowExtKt$simpleRunningReduce$1(this.f25550d, this.f25551e, completion);
        flowExtKt$simpleRunningReduce$1.f25548b = obj;
        return flowExtKt$simpleRunningReduce$1;
    }

    @Override // yh.p
    public final Object invoke(Object obj, kotlin.coroutines.c<? super b2> cVar) {
        return ((FlowExtKt$simpleRunningReduce$1) create(obj, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f25549c;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            kotlinx.coroutines.flow.f fVar = (kotlinx.coroutines.flow.f) this.f25548b;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.f124891b = (T) FlowExtKt.f25539a;
            kotlinx.coroutines.flow.e eVar = this.f25550d;
            FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1 flowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1 = new FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1(this, fVar, objectRef);
            this.f25549c = 1;
            if (eVar.a(flowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1, this) == objH) {
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
