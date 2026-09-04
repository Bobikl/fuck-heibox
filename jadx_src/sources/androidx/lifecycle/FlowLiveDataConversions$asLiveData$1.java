package androidx.lifecycle;

import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: FlowLiveData.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.coroutines.jvm.internal.d(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
public final class FlowLiveDataConversions$asLiveData$1<T> extends SuspendLambda implements yh.p<f0<T>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f24014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f24015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.flow.e<T> f24016d;

    /* JADX INFO: compiled from: FlowLiveData.kt */
    public static final class a<T> implements kotlinx.coroutines.flow.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f0<T> f24017b;

        a(f0<T> f0Var) {
            this.f24017b = f0Var;
        }

        @Override // kotlinx.coroutines.flow.f
        @dl.e
        public final Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            Object objEmit = this.f24017b.emit(t10, cVar);
            return objEmit == kotlin.coroutines.intrinsics.b.h() ? objEmit : b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowLiveDataConversions$asLiveData$1(kotlinx.coroutines.flow.e<? extends T> eVar, kotlin.coroutines.c<? super FlowLiveDataConversions$asLiveData$1> cVar) {
        super(2, cVar);
        this.f24016d = eVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d f0<T> f0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((FlowLiveDataConversions$asLiveData$1) create(f0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        FlowLiveDataConversions$asLiveData$1 flowLiveDataConversions$asLiveData$1 = new FlowLiveDataConversions$asLiveData$1(this.f24016d, cVar);
        flowLiveDataConversions$asLiveData$1.f24015c = obj;
        return flowLiveDataConversions$asLiveData$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f24014b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            f0 f0Var = (f0) this.f24015c;
            kotlinx.coroutines.flow.e<T> eVar = this.f24016d;
            a aVar = new a(f0Var);
            this.f24014b = 1;
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
