package androidx.compose.animation.core;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: Add missing generic type declarations: [T, V] */
/* JADX INFO: compiled from: Animatable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Landroidx/compose/animation/core/f;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", i = {0, 0}, l = {305}, m = "invokeSuspend", n = {"endState", "clampingNeeded"}, s = {"L$0", "L$1"})
public final class Animatable$runAnimation$2<T, V> extends SuspendLambda implements yh.l<kotlin.coroutines.c<? super AnimationResult<T, V>>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f4114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f4115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f4116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Animatable<T, V> f4117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ T f4118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ d<T, V> f4119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ long f4120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ yh.l<Animatable<T, V>, b2> f4121i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Animatable$runAnimation$2(Animatable<T, V> animatable, T t10, d<T, V> dVar, long j10, yh.l<? super Animatable<T, V>, b2> lVar, kotlin.coroutines.c<? super Animatable$runAnimation$2> cVar) {
        super(1, cVar);
        this.f4117e = animatable;
        this.f4118f = t10;
        this.f4119g = dVar;
        this.f4120h = j10;
        this.f4121i = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.d kotlin.coroutines.c<?> cVar) {
        return new Animatable$runAnimation$2(this.f4117e, this.f4118f, this.f4119g, this.f4120h, this.f4121i, cVar);
    }

    @Override // yh.l
    @dl.e
    public final Object invoke(@dl.e kotlin.coroutines.c<? super AnimationResult<T, V>> cVar) {
        return ((Animatable$runAnimation$2) create(cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        AnimationState animationState;
        Ref.BooleanRef booleanRef;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f4116d;
        try {
            if (i10 == 0) {
                kotlin.t0.n(obj);
                this.f4117e.o().r((p) this.f4117e.s().a().invoke(this.f4118f));
                this.f4117e.A(this.f4119g.f());
                this.f4117e.z(true);
                final AnimationState animationStateH = k.h(this.f4117e.o(), null, null, 0L, Long.MIN_VALUE, false, 23, null);
                final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                d<T, V> dVar = this.f4119g;
                long j10 = this.f4120h;
                final Animatable<T, V> animatable = this.f4117e;
                final yh.l<Animatable<T, V>, b2> lVar = this.f4121i;
                yh.l<g<T, V>, b2> lVar2 = new yh.l<g<T, V>, b2>() { // from class: androidx.compose.animation.core.Animatable$runAnimation$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final void a(@dl.d g<T, V> animate) {
                        kotlin.jvm.internal.f0.p(animate, "$this$animate");
                        SuspendAnimationKt.r(animate, animatable.o());
                        Object objK = animatable.k(animate.g());
                        if (kotlin.jvm.internal.f0.g(objK, animate.g())) {
                            yh.l<Animatable<T, V>, b2> lVar3 = lVar;
                            if (lVar3 != null) {
                                lVar3.invoke(animatable);
                                return;
                            }
                            return;
                        }
                        animatable.o().q(objK);
                        animationStateH.q((T) objK);
                        yh.l<Animatable<T, V>, b2> lVar4 = lVar;
                        if (lVar4 != null) {
                            lVar4.invoke(animatable);
                        }
                        animate.a();
                        booleanRef2.f124884b = true;
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(Object obj2) {
                        a((g) obj2);
                        return b2.f124493a;
                    }
                };
                this.f4114b = animationStateH;
                this.f4115c = booleanRef2;
                this.f4116d = 1;
                if (SuspendAnimationKt.d(animationStateH, dVar, j10, lVar2, this) == objH) {
                    return objH;
                }
                animationState = animationStateH;
                booleanRef = booleanRef2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef = (Ref.BooleanRef) this.f4115c;
                animationState = (AnimationState) this.f4114b;
                kotlin.t0.n(obj);
            }
            AnimationEndReason animationEndReason = booleanRef.f124884b ? AnimationEndReason.BoundReached : AnimationEndReason.Finished;
            this.f4117e.m();
            return new AnimationResult(animationState, animationEndReason);
        } catch (CancellationException e10) {
            this.f4117e.m();
            throw e10;
        }
    }
}
