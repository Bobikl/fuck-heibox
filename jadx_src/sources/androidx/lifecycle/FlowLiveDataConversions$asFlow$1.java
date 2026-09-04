package androidx.lifecycle;

import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.v1;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: FlowLiveData.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", i = {0, 0}, l = {110, 114}, m = "invokeSuspend", n = {"$this$callbackFlow", "observer"}, s = {"L$0", "L$1"})
public final class FlowLiveDataConversions$asFlow$1<T> extends SuspendLambda implements yh.p<kotlinx.coroutines.channels.w<? super T>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f24002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f24003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f24004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ LiveData<T> f24005e;

    /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: FlowLiveData.kt */
    @kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f24006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LiveData<T> f24007c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j0<T> f24008d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LiveData<T> liveData, j0<T> j0Var, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f24007c = liveData;
            this.f24008d = j0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.f24007c, this.f24008d, cVar);
        }

        @Override // yh.p
        @dl.e
        public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            kotlin.coroutines.intrinsics.b.h();
            if (this.f24006b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            this.f24007c.l((j0<? super T>) this.f24008d);
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowLiveDataConversions$asFlow$1(LiveData<T> liveData, kotlin.coroutines.c<? super FlowLiveDataConversions$asFlow$1> cVar) {
        super(2, cVar);
        this.f24005e = liveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(kotlinx.coroutines.channels.w wVar, Object obj) {
        wVar.v(obj);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        FlowLiveDataConversions$asFlow$1 flowLiveDataConversions$asFlow$1 = new FlowLiveDataConversions$asFlow$1(this.f24005e, cVar);
        flowLiveDataConversions$asFlow$1.f24004d = obj;
        return flowLiveDataConversions$asFlow$1;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d kotlinx.coroutines.channels.w<? super T> wVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((FlowLiveDataConversions$asFlow$1) create(wVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        final j0 j0Var;
        kotlinx.coroutines.channels.w wVar;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f24003c;
        if (i10 != 0) {
            if (i10 == 1) {
                j0Var = (j0) this.f24002b;
                wVar = (kotlinx.coroutines.channels.w) this.f24004d;
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
        final kotlinx.coroutines.channels.w wVar2 = (kotlinx.coroutines.channels.w) this.f24004d;
        j0Var = new j0() { // from class: androidx.lifecycle.n
            @Override // androidx.lifecycle.j0
            public final void a(Object obj2) {
                FlowLiveDataConversions$asFlow$1.h(wVar2, obj2);
            }
        };
        n2 n2VarT0 = e1.e().t0();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f24005e, j0Var, null);
        this.f24004d = wVar2;
        this.f24002b = j0Var;
        this.f24003c = 1;
        if (kotlinx.coroutines.i.h(n2VarT0, anonymousClass1, this) == objH) {
            return objH;
        }
        wVar = wVar2;
        final LiveData<T> liveData = this.f24005e;
        yh.a<b2> aVar = new yh.a<b2>() { // from class: androidx.lifecycle.FlowLiveDataConversions$asFlow$1.2

            /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2$1, reason: invalid class name */
            /* JADX INFO: compiled from: FlowLiveData.kt */
            @kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2$1", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f24011b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ LiveData<T> f24012c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ j0<T> f24013d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(LiveData<T> liveData, j0<T> j0Var, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.f24012c = liveData;
                    this.f24013d = j0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    return new AnonymousClass1(this.f24012c, this.f24013d, cVar);
                }

                @Override // yh.p
                @dl.e
                public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                    return ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    kotlin.coroutines.intrinsics.b.h();
                    if (this.f24011b != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.t0.n(obj);
                    this.f24012c.p((j0<? super T>) this.f24013d);
                    return b2.f124493a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                kotlinx.coroutines.k.f(v1.f130503b, e1.e().t0(), null, new AnonymousClass1(liveData, j0Var, null), 2, null);
            }
        };
        this.f24004d = null;
        this.f24002b = null;
        this.f24003c = 2;
        if (ProduceKt.a(wVar, aVar, this) == objH) {
            return objH;
        }
        return b2.f124493a;
    }
}
