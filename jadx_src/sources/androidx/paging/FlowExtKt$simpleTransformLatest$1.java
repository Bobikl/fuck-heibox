package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "Landroidx/paging/b1;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1", f = "FlowExt.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
public final class FlowExtKt$simpleTransformLatest$1<R> extends SuspendLambda implements yh.p<b1<R>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f25574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f25575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.flow.e f25576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.q f25577e;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.paging.FlowExtKt$simpleTransformLatest$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: FlowExt.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "value", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1$1", f = "FlowExt.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1<T> extends SuspendLambda implements yh.p<T, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f25578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f25579c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c f25581e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(c cVar, kotlin.coroutines.c cVar2) {
            super(2, cVar2);
            this.f25581e = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
            kotlin.jvm.internal.f0.p(completion, "completion");
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f25581e, completion);
            anonymousClass1.f25578b = obj;
            return anonymousClass1;
        }

        @Override // yh.p
        public final Object invoke(Object obj, kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(obj, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f25579c;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                Object obj2 = this.f25578b;
                yh.q qVar = FlowExtKt$simpleTransformLatest$1.this.f25577e;
                c cVar = this.f25581e;
                this.f25579c = 1;
                if (qVar.invoke(cVar, obj2, this) == objH) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowExtKt$simpleTransformLatest$1(kotlinx.coroutines.flow.e eVar, yh.q qVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f25576d = eVar;
        this.f25577e = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        FlowExtKt$simpleTransformLatest$1 flowExtKt$simpleTransformLatest$1 = new FlowExtKt$simpleTransformLatest$1(this.f25576d, this.f25577e, completion);
        flowExtKt$simpleTransformLatest$1.f25574b = obj;
        return flowExtKt$simpleTransformLatest$1;
    }

    @Override // yh.p
    public final Object invoke(Object obj, kotlin.coroutines.c<? super b2> cVar) {
        return ((FlowExtKt$simpleTransformLatest$1) create(obj, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f25575c;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            b1 b1Var = (b1) this.f25574b;
            kotlinx.coroutines.flow.e eVar = this.f25576d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(new c(b1Var), null);
            this.f25575c = 1;
            if (kotlinx.coroutines.flow.g.A(eVar, anonymousClass1, this) == objH) {
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
