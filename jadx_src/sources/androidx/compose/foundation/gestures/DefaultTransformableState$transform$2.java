package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: TransformableState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2", f = "TransformableState.kt", i = {}, l = {bb.c.b.P1}, m = "invokeSuspend", n = {}, s = {})
public final class DefaultTransformableState$transform$2 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f5167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ DefaultTransformableState f5168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ MutatePriority f5169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.p<r, kotlin.coroutines.c<? super b2>, Object> f5170e;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: TransformableState.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/r;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1", f = "TransformableState.kt", i = {}, l = {252}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<r, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f5171b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f5172c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ DefaultTransformableState f5173d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ yh.p<r, kotlin.coroutines.c<? super b2>, Object> f5174e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(DefaultTransformableState defaultTransformableState, yh.p<? super r, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f5173d = defaultTransformableState;
            this.f5174e = pVar;
        }

        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d r rVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(rVar, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f5173d, this.f5174e, cVar);
            anonymousClass1.f5172c = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f5171b;
            try {
                if (i10 == 0) {
                    t0.n(obj);
                    r rVar = (r) this.f5172c;
                    this.f5173d.isTransformingState.setValue(kotlin.coroutines.jvm.internal.a.a(true));
                    yh.p<r, kotlin.coroutines.c<? super b2>, Object> pVar = this.f5174e;
                    this.f5171b = 1;
                    if (pVar.invoke(rVar, this) == objH) {
                        return objH;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t0.n(obj);
                }
                this.f5173d.isTransformingState.setValue(kotlin.coroutines.jvm.internal.a.a(false));
                return b2.f124493a;
            } catch (Throwable th2) {
                this.f5173d.isTransformingState.setValue(kotlin.coroutines.jvm.internal.a.a(false));
                throw th2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DefaultTransformableState$transform$2(DefaultTransformableState defaultTransformableState, MutatePriority mutatePriority, yh.p<? super r, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, kotlin.coroutines.c<? super DefaultTransformableState$transform$2> cVar) {
        super(2, cVar);
        this.f5168c = defaultTransformableState;
        this.f5169d = mutatePriority;
        this.f5170e = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new DefaultTransformableState$transform$2(this.f5168c, this.f5169d, this.f5170e, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((DefaultTransformableState$transform$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f5167b;
        if (i10 == 0) {
            t0.n(obj);
            MutatorMutex mutatorMutex = this.f5168c.transformMutex;
            r rVar = this.f5168c.transformScope;
            MutatePriority mutatePriority = this.f5169d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f5168c, this.f5170e, null);
            this.f5167b = 1;
            if (mutatorMutex.f(rVar, mutatePriority, anonymousClass1, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
