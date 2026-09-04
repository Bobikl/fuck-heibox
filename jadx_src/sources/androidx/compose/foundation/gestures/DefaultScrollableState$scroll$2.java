package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: ScrollableState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
public final class DefaultScrollableState$scroll$2 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f5154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ DefaultScrollableState f5155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ MutatePriority f5156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.p<m, kotlin.coroutines.c<? super b2>, Object> f5157e;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScrollableState.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/m;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<m, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f5158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f5159c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ DefaultScrollableState f5160d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ yh.p<m, kotlin.coroutines.c<? super b2>, Object> f5161e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(DefaultScrollableState defaultScrollableState, yh.p<? super m, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f5160d = defaultScrollableState;
            this.f5161e = pVar;
        }

        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d m mVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(mVar, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f5160d, this.f5161e, cVar);
            anonymousClass1.f5159c = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f5158b;
            try {
                if (i10 == 0) {
                    t0.n(obj);
                    m mVar = (m) this.f5159c;
                    this.f5160d.isScrollingState.setValue(kotlin.coroutines.jvm.internal.a.a(true));
                    yh.p<m, kotlin.coroutines.c<? super b2>, Object> pVar = this.f5161e;
                    this.f5158b = 1;
                    if (pVar.invoke(mVar, this) == objH) {
                        return objH;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t0.n(obj);
                }
                this.f5160d.isScrollingState.setValue(kotlin.coroutines.jvm.internal.a.a(false));
                return b2.f124493a;
            } catch (Throwable th2) {
                this.f5160d.isScrollingState.setValue(kotlin.coroutines.jvm.internal.a.a(false));
                throw th2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DefaultScrollableState$scroll$2(DefaultScrollableState defaultScrollableState, MutatePriority mutatePriority, yh.p<? super m, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, kotlin.coroutines.c<? super DefaultScrollableState$scroll$2> cVar) {
        super(2, cVar);
        this.f5155c = defaultScrollableState;
        this.f5156d = mutatePriority;
        this.f5157e = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new DefaultScrollableState$scroll$2(this.f5155c, this.f5156d, this.f5157e, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((DefaultScrollableState$scroll$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f5154b;
        if (i10 == 0) {
            t0.n(obj);
            MutatorMutex mutatorMutex = this.f5155c.scrollMutex;
            m mVar = this.f5155c.scrollScope;
            MutatePriority mutatePriority = this.f5156d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f5155c, this.f5157e, null);
            this.f5154b = 1;
            if (mutatorMutex.f(mVar, mutatePriority, anonymousClass1, this) == objH) {
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
