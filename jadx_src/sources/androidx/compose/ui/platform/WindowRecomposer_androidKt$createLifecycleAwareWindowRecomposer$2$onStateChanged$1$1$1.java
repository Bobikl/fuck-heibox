package androidx.compose.ui.platform;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: WindowRecomposer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", i = {}, l = {bb.c.b.f31010w4}, m = "invokeSuspend", n = {}, s = {})
public final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f15755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.flow.u<Float> f15756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ c1 f15757d;

    /* JADX INFO: compiled from: WindowRecomposer.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "scaleFactor", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class a implements kotlinx.coroutines.flow.f<Float> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c1 f15758b;

        a(c1 c1Var) {
            this.f15758b = c1Var;
        }

        @dl.e
        public final Object a(float f10, @dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
            this.f15758b.c(f10);
            return kotlin.b2.f124493a;
        }

        @Override // kotlinx.coroutines.flow.f
        public /* bridge */ /* synthetic */ Object emit(Float f10, kotlin.coroutines.c cVar) {
            return a(f10.floatValue(), cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(kotlinx.coroutines.flow.u<Float> uVar, c1 c1Var, kotlin.coroutines.c<? super WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1> cVar) {
        super(2, cVar);
        this.f15756c = uVar;
        this.f15757d = c1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(this.f15756c, this.f15757d, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f15755b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            kotlinx.coroutines.flow.u<Float> uVar = this.f15756c;
            a aVar = new a(this.f15757d);
            this.f15755b = 1;
            if (uVar.a(aVar, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        throw new KotlinNothingValueException();
    }
}
