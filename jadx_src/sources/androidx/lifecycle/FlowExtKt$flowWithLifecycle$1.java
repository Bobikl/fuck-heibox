package androidx.lifecycle;

import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", i = {0}, l = {91}, m = "invokeSuspend", n = {"$this$callbackFlow"}, s = {"L$0"})
public final class FlowExtKt$flowWithLifecycle$1<T> extends SuspendLambda implements yh.p<kotlinx.coroutines.channels.w<? super T>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f23993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f23994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Lifecycle f23995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Lifecycle.State f23996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.flow.e<T> f23997f;

    /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: FlowExt.kt */
    @kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f23998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.e<T> f23999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.w<T> f24000d;

        /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1$a */
        /* JADX INFO: compiled from: FlowExt.kt */
        public static final class a<T> implements kotlinx.coroutines.flow.f {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.w<T> f24001b;

            /* JADX WARN: Multi-variable type inference failed */
            a(kotlinx.coroutines.channels.w<? super T> wVar) {
                this.f24001b = wVar;
            }

            @Override // kotlinx.coroutines.flow.f
            @dl.e
            public final Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
                Object objX = this.f24001b.X(t10, cVar);
                return objX == kotlin.coroutines.intrinsics.b.h() ? objX : b2.f124493a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlinx.coroutines.flow.e<? extends T> eVar, kotlinx.coroutines.channels.w<? super T> wVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f23999c = eVar;
            this.f24000d = wVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.f23999c, this.f24000d, cVar);
        }

        @Override // yh.p
        @dl.e
        public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f23998b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                kotlinx.coroutines.flow.e<T> eVar = this.f23999c;
                a aVar = new a(this.f24000d);
                this.f23998b = 1;
                if (eVar.a(aVar, this) == objH) {
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
    /* JADX WARN: Multi-variable type inference failed */
    FlowExtKt$flowWithLifecycle$1(Lifecycle lifecycle, Lifecycle.State state, kotlinx.coroutines.flow.e<? extends T> eVar, kotlin.coroutines.c<? super FlowExtKt$flowWithLifecycle$1> cVar) {
        super(2, cVar);
        this.f23995d = lifecycle;
        this.f23996e = state;
        this.f23997f = eVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d kotlinx.coroutines.channels.w<? super T> wVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((FlowExtKt$flowWithLifecycle$1) create(wVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        FlowExtKt$flowWithLifecycle$1 flowExtKt$flowWithLifecycle$1 = new FlowExtKt$flowWithLifecycle$1(this.f23995d, this.f23996e, this.f23997f, cVar);
        flowExtKt$flowWithLifecycle$1.f23994c = obj;
        return flowExtKt$flowWithLifecycle$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlinx.coroutines.channels.w wVar;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f23993b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            kotlinx.coroutines.channels.w wVar2 = (kotlinx.coroutines.channels.w) this.f23994c;
            Lifecycle lifecycle = this.f23995d;
            Lifecycle.State state = this.f23996e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23997f, wVar2, null);
            this.f23994c = wVar2;
            this.f23993b = 1;
            if (RepeatOnLifecycleKt.a(lifecycle, state, anonymousClass1, this) == objH) {
                return objH;
            }
            wVar = wVar2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wVar = (kotlinx.coroutines.channels.w) this.f23994c;
            kotlin.t0.n(obj);
        }
        kotlinx.coroutines.channels.b0.a.a(wVar, null, 1, null);
        return b2.f124493a;
    }
}
