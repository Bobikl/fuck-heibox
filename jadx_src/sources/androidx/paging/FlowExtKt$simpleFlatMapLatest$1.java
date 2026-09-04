package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [R, T] */
/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "Lkotlinx/coroutines/flow/f;", "it", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.FlowExtKt$simpleFlatMapLatest$1", f = "FlowExt.kt", i = {0}, l = {86, 102}, m = "invokeSuspend", n = {"$this$emitAll$iv"}, s = {"L$0"})
public final class FlowExtKt$simpleFlatMapLatest$1<R, T> extends SuspendLambda implements yh.q<kotlinx.coroutines.flow.f<? super R>, T, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f25540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f25541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f25542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.p f25543e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$simpleFlatMapLatest$1(yh.p pVar, kotlin.coroutines.c cVar) {
        super(3, cVar);
        this.f25543e = pVar;
    }

    @dl.d
    public final kotlin.coroutines.c<b2> a(@dl.d kotlinx.coroutines.flow.f<? super R> create, T t10, @dl.d kotlin.coroutines.c<? super b2> continuation) {
        kotlin.jvm.internal.f0.p(create, "$this$create");
        kotlin.jvm.internal.f0.p(continuation, "continuation");
        FlowExtKt$simpleFlatMapLatest$1 flowExtKt$simpleFlatMapLatest$1 = new FlowExtKt$simpleFlatMapLatest$1(this.f25543e, continuation);
        flowExtKt$simpleFlatMapLatest$1.f25540b = create;
        flowExtKt$simpleFlatMapLatest$1.f25541c = t10;
        return flowExtKt$simpleFlatMapLatest$1;
    }

    @dl.e
    public final Object f(@dl.d Object obj) {
        kotlinx.coroutines.flow.f<? super T> fVar = (kotlinx.coroutines.flow.f) this.f25540b;
        kotlinx.coroutines.flow.e eVar = (kotlinx.coroutines.flow.e) this.f25543e.invoke(this.f25541c, this);
        kotlin.jvm.internal.c0.e(0);
        eVar.a(fVar, this);
        kotlin.jvm.internal.c0.e(2);
        kotlin.jvm.internal.c0.e(1);
        return b2.f124493a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yh.q
    public final Object invoke(Object obj, Object obj2, kotlin.coroutines.c<? super b2> cVar) {
        return ((FlowExtKt$simpleFlatMapLatest$1) a((kotlinx.coroutines.flow.f) obj, obj2, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlinx.coroutines.flow.f<? super T> fVar;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f25542d;
        if (i10 != 0) {
            if (i10 == 1) {
                fVar = (kotlinx.coroutines.flow.f) this.f25540b;
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
        fVar = (kotlinx.coroutines.flow.f) this.f25540b;
        Object obj2 = this.f25541c;
        yh.p pVar = this.f25543e;
        this.f25540b = fVar;
        this.f25542d = 1;
        obj = pVar.invoke(obj2, this);
        if (obj == objH) {
            return objH;
        }
        this.f25540b = null;
        this.f25542d = 2;
        if (((kotlinx.coroutines.flow.e) obj).a(fVar, this) == objH) {
            return objH;
        }
        return b2.f124493a;
    }
}
