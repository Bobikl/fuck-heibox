package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.animation.core.Transition$animateTo$1$1", f = "Transition.kt", i = {0}, l = {bb.c.b.f30923s5}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
public final class Transition$animateTo$1$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f4279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f4280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Transition<S> f4281d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Transition$animateTo$1$1(Transition<S> transition, kotlin.coroutines.c<? super Transition$animateTo$1$1> cVar) {
        super(2, cVar);
        this.f4281d = transition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        Transition$animateTo$1$1 transition$animateTo$1$1 = new Transition$animateTo$1$1(this.f4281d, cVar);
        transition$animateTo$1$1.f4280c = obj;
        return transition$animateTo$1$1;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((Transition$animateTo$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlinx.coroutines.q0 q0Var;
        yh.l<Long, b2> lVar;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f4279b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            q0Var = (kotlinx.coroutines.q0) this.f4280c;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q0Var = (kotlinx.coroutines.q0) this.f4280c;
            kotlin.t0.n(obj);
        }
        do {
            final float fQ = SuspendAnimationKt.q(q0Var.getCoroutineContext());
            final Transition<S> transition = this.f4281d;
            lVar = new yh.l<Long, b2>() { // from class: androidx.compose.animation.core.Transition$animateTo$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                public final void a(long j10) {
                    if (transition.t()) {
                        return;
                    }
                    transition.w(j10 / 1, fQ);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Long l10) {
                    a(l10.longValue());
                    return b2.f124493a;
                }
            };
            this.f4280c = q0Var;
            this.f4279b = 1;
        } while (MonotonicFrameClockKt.f(lVar, this) != objH);
        return objH;
    }
}
