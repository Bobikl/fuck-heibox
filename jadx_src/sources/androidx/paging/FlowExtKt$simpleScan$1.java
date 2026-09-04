package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "Lkotlinx/coroutines/flow/f;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.FlowExtKt$simpleScan$1", f = "FlowExt.kt", i = {0, 0}, l = {42, 102}, m = "invokeSuspend", n = {"$this$flow", "accumulator"}, s = {"L$0", "L$1"})
public final class FlowExtKt$simpleScan$1<R> extends SuspendLambda implements yh.p<kotlinx.coroutines.flow.f<? super R>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f25560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f25561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f25562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.flow.e f25563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ Object f25564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ yh.q f25565g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowExtKt$simpleScan$1(kotlinx.coroutines.flow.e eVar, Object obj, yh.q qVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f25563e = eVar;
        this.f25564f = obj;
        this.f25565g = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        FlowExtKt$simpleScan$1 flowExtKt$simpleScan$1 = new FlowExtKt$simpleScan$1(this.f25563e, this.f25564f, this.f25565g, completion);
        flowExtKt$simpleScan$1.f25560b = obj;
        return flowExtKt$simpleScan$1;
    }

    @Override // yh.p
    public final Object invoke(Object obj, kotlin.coroutines.c<? super b2> cVar) {
        return ((FlowExtKt$simpleScan$1) create(obj, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        kotlinx.coroutines.flow.f fVar;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f25562d;
        if (i10 != 0) {
            if (i10 == 1) {
                objectRef = (Ref.ObjectRef) this.f25561c;
                fVar = (kotlinx.coroutines.flow.f) this.f25560b;
                kotlin.t0.n(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            return b2.f124493a;
        }
        kotlin.t0.n(obj);
        kotlinx.coroutines.flow.f fVar2 = (kotlinx.coroutines.flow.f) this.f25560b;
        objectRef = new Ref.ObjectRef();
        ?? r10 = this.f25564f;
        objectRef.f124891b = r10;
        this.f25560b = fVar2;
        this.f25561c = objectRef;
        this.f25562d = 1;
        if (fVar2.emit(r10, this) == objH) {
            return objH;
        }
        fVar = fVar2;
        kotlinx.coroutines.flow.e eVar = this.f25563e;
        FlowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1 flowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1 = new FlowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1(this, fVar, objectRef);
        this.f25560b = null;
        this.f25561c = null;
        this.f25562d = 2;
        if (eVar.a(flowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1, this) == objH) {
            return objH;
        }
        return b2.f124493a;
    }
}
