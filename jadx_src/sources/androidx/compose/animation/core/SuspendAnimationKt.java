package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: SuspendAnimation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000p\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\u001au\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u000426\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001ac\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000f26\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u009b\u0001\u0010\u0017\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00152\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000426\u0010\f\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a|\u0010\u001f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u0002\u001a\u00028\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u001a2%\b\u0002\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d\u0012\u0004\u0012\u00020\u000b0\u001c¢\u0006\u0002\b\u001eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001ar\u0010\"\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000!2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2%\b\u0002\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d\u0012\u0004\u0012\u00020\u000b0\u001c¢\u0006\u0002\b\u001eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001ax\u0010(\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$2\b\b\u0002\u0010'\u001a\u00020&2%\b\u0002\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d\u0012\u0004\u0012\u00020\u000b0\u001c¢\u0006\u0002\b\u001eH\u0080@ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a\\\u0010-\u001a\u00028\u0000\"\u0004\b\u0000\u0010*\"\u0004\b\u0001\u0010\u0012\"\b\b\u0002\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020$2!\u0010,\u001a\u001d\u0012\u0013\u0012\u00110&¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(+\u0012\u0004\u0012\u00028\u00000\u001cH\u0082@ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a<\u00100\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019H\u0000\u001a\u0085\u0001\u00103\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d2\u0006\u0010+\u001a\u00020&2\u0006\u00101\u001a\u00020\u00002\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192#\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d\u0012\u0004\u0012\u00020\u000b0\u001c¢\u0006\u0002\b\u001eH\u0002\u001a\u0085\u0001\u00105\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0012\"\b\b\u0001\u0010\u0014*\u00020\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d2\u0006\u0010+\u001a\u00020&2\u0006\u00104\u001a\u00020&2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192#\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d\u0012\u0004\u0012\u00020\u000b0\u001c¢\u0006\u0002\b\u001eH\u0002\"\u0018\u00101\u001a\u00020\u0000*\u0002068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b7\u00108\u0082\u0002\u0004\n\u0002\b\u0019¨\u00069"}, d2 = {"", "initialValue", "targetValue", "initialVelocity", "Landroidx/compose/animation/core/h;", "animationSpec", "Lkotlin/Function2;", "Lkotlin/m0;", "name", "value", "velocity", "Lkotlin/b2;", "block", ak.aF, "(FFFLandroidx/compose/animation/core/h;Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/animation/core/i0;", "i", "(FFLandroidx/compose/animation/core/i0;Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Landroidx/compose/animation/core/f1;", "typeConverter", "e", "(Landroidx/compose/animation/core/f1;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/h;Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/animation/core/j;", "", "sequentialAnimation", "Lkotlin/Function1;", "Landroidx/compose/animation/core/g;", "Lkotlin/t;", "l", "(Landroidx/compose/animation/core/j;Ljava/lang/Object;Landroidx/compose/animation/core/h;ZLyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/animation/core/x;", "j", "(Landroidx/compose/animation/core/j;Landroidx/compose/animation/core/x;ZLyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/animation/core/d;", "animation", "", "startTimeNanos", "d", "(Landroidx/compose/animation/core/j;Landroidx/compose/animation/core/d;JLyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "R", "frameTimeNanos", "onFrame", "n", "(Landroidx/compose/animation/core/d;Lyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "state", "r", "durationScale", "anim", "p", "playTimeNanos", "o", "Lkotlin/coroutines/CoroutineContext;", "q", "(Lkotlin/coroutines/CoroutineContext;)F", "animation-core_release"}, k = 2, mv = {1, 7, 1})
public final class SuspendAnimationKt {
    @dl.e
    public static final Object c(float f10, float f11, float f12, @dl.d h<Float> hVar, @dl.d yh.p<? super Float, ? super Float, b2> pVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objE = e(VectorConvertersKt.e(kotlin.jvm.internal.y.f124996a), kotlin.coroutines.jvm.internal.a.e(f10), kotlin.coroutines.jvm.internal.a.e(f11), kotlin.coroutines.jvm.internal.a.e(f12), hVar, pVar, cVar);
        return objE == kotlin.coroutines.intrinsics.b.h() ? objE : b2.f124493a;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0128  */
    /* JADX WARN: Code duplicated, block: B:51:0x013e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0141  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, androidx.compose.animation.core.g] */
    @dl.e
    public static final <T, V extends p> Object d(@dl.d final AnimationState<T, V> animationState, @dl.d final d<T, V> dVar, long j10, @dl.d final yh.l<? super g<T, V>, b2> lVar, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        SuspendAnimationKt$animate$4 suspendAnimationKt$animate$4;
        Ref.ObjectRef objectRef;
        yh.l<? super g<T, V>, b2> lVar2;
        AnimationState<T, V> animationState2;
        g gVar;
        g gVar2;
        yh.l<Long, b2> lVar3;
        final AnimationState<T, V> animationState3 = animationState;
        d<T, V> dVar2 = dVar;
        if (cVar instanceof SuspendAnimationKt$animate$4) {
            suspendAnimationKt$animate$4 = (SuspendAnimationKt$animate$4) cVar;
            int i10 = suspendAnimationKt$animate$4.f4239g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                suspendAnimationKt$animate$4.f4239g = i10 - Integer.MIN_VALUE;
            } else {
                suspendAnimationKt$animate$4 = new SuspendAnimationKt$animate$4(cVar);
            }
        } else {
            suspendAnimationKt$animate$4 = new SuspendAnimationKt$animate$4(cVar);
        }
        SuspendAnimationKt$animate$4 suspendAnimationKt$animate$5 = suspendAnimationKt$animate$4;
        Object obj = suspendAnimationKt$animate$5.f4238f;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = suspendAnimationKt$animate$5.f4239g;
        if (i11 == 0) {
            kotlin.t0.n(obj);
            final T tE = dVar2.e(0L);
            final p pVarG = dVar2.g(0L);
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                if (j10 == Long.MIN_VALUE) {
                    final float fQ = q(suspendAnimationKt$animate$5.getContext());
                    yh.l<Long, b2> lVar4 = new yh.l<Long, b2>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/internal/Ref$ObjectRef<Landroidx/compose/animation/core/g<TT;TV;>;>;TT;Landroidx/compose/animation/core/d<TT;TV;>;TV;Landroidx/compose/animation/core/j<TT;TV;>;FLyh/l<-Landroidx/compose/animation/core/g<TT;TV;>;Lkotlin/b2;>;)V */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        /* JADX WARN: Type inference failed for: r12v0, types: [T, androidx.compose.animation.core.g] */
                        public final void a(long j11) {
                            Ref.ObjectRef<g<T, V>> objectRef3 = objectRef2;
                            T t10 = tE;
                            f1 f1VarD = dVar.d();
                            p pVar = pVarG;
                            Object objF = dVar.f();
                            final AnimationState<T, V> animationState4 = animationState;
                            ?? gVar3 = new g(t10, f1VarD, pVar, j11, objF, j11, true, new yh.a<b2>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$6.1
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
                                    animationState4.p(false);
                                }
                            });
                            SuspendAnimationKt.p(gVar3, j11, fQ, dVar, animationState, lVar);
                            objectRef3.f124891b = gVar3;
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(Long l10) {
                            a(l10.longValue());
                            return b2.f124493a;
                        }
                    };
                    suspendAnimationKt$animate$5.f4234b = animationState3;
                    suspendAnimationKt$animate$5.f4235c = dVar2;
                    lVar2 = lVar;
                    suspendAnimationKt$animate$5.f4236d = lVar2;
                    suspendAnimationKt$animate$5.f4237e = objectRef2;
                    suspendAnimationKt$animate$5.f4239g = 1;
                    if (n(dVar2, lVar4, suspendAnimationKt$animate$5) == objH) {
                        return objH;
                    }
                } else {
                    lVar2 = lVar;
                    try {
                        ?? r10 = (T) new g(tE, dVar.d(), pVarG, j10, dVar.f(), j10, true, new yh.a<b2>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$7
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
                                animationState3.p(false);
                            }
                        });
                        objectRef2 = objectRef2;
                        p(r10, j10, q(suspendAnimationKt$animate$5.getContext()), dVar, animationState, lVar);
                        objectRef2.f124891b = r10;
                    } catch (CancellationException e10) {
                        e = e10;
                        objectRef2 = objectRef2;
                        objectRef = objectRef2;
                        gVar = (g) objectRef.f124891b;
                        if (gVar != null) {
                            gVar.m(false);
                        }
                        gVar2 = (g) objectRef.f124891b;
                        if (gVar2 == null && gVar2.getLastFrameTimeNanos() == animationState3.getLastFrameTimeNanos()) {
                            animationState3.p(false);
                        }
                        throw e;
                    }
                }
                animationState2 = animationState3;
                objectRef = objectRef2;
            } catch (CancellationException e11) {
                e = e11;
            }
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) suspendAnimationKt$animate$5.f4237e;
            yh.l<? super g<T, V>, b2> lVar5 = (yh.l) suspendAnimationKt$animate$5.f4236d;
            d<T, V> dVar3 = (d) suspendAnimationKt$animate$5.f4235c;
            animationState2 = (AnimationState) suspendAnimationKt$animate$5.f4234b;
            try {
                kotlin.t0.n(obj);
                lVar2 = lVar5;
                dVar2 = dVar3;
            } catch (CancellationException e12) {
                e = e12;
                animationState3 = animationState2;
                gVar = (g) objectRef.f124891b;
                if (gVar != null) {
                    gVar.m(false);
                }
                gVar2 = (g) objectRef.f124891b;
                if (gVar2 == null && gVar2.getLastFrameTimeNanos() == animationState3.getLastFrameTimeNanos()) {
                    animationState3.p(false);
                }
                throw e;
            }
        }
        do {
            T t10 = objectRef.f124891b;
            kotlin.jvm.internal.f0.m(t10);
            if (!((g) t10).j()) {
                return b2.f124493a;
            }
            final float fQ2 = q(suspendAnimationKt$animate$5.getContext());
            final Ref.ObjectRef objectRef3 = objectRef;
            final d<T, V> dVar4 = dVar2;
            final AnimationState<T, V> animationState4 = animationState2;
            final yh.l<? super g<T, V>, b2> lVar6 = lVar2;
            lVar3 = new yh.l<Long, b2>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void a(long j11) {
                    T t11 = objectRef3.f124891b;
                    kotlin.jvm.internal.f0.m(t11);
                    SuspendAnimationKt.p((g) t11, j11, fQ2, dVar4, animationState4, lVar6);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Long l10) {
                    a(l10.longValue());
                    return b2.f124493a;
                }
            };
            suspendAnimationKt$animate$5.f4234b = animationState2;
            suspendAnimationKt$animate$5.f4235c = dVar2;
            suspendAnimationKt$animate$5.f4236d = lVar2;
            suspendAnimationKt$animate$5.f4237e = objectRef;
            suspendAnimationKt$animate$5.f4239g = 2;
        } while (n(dVar2, lVar3, suspendAnimationKt$animate$5) != objH);
        return objH;
    }

    @dl.e
    public static final <T, V extends p> Object e(@dl.d final f1<T, V> f1Var, T t10, T t11, @dl.e T t12, @dl.d h<T> hVar, @dl.d final yh.p<? super T, ? super T, b2> pVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        V vG;
        if (t12 == null || (vG = f1Var.a().invoke(t12)) == null) {
            vG = q.g(f1Var.a().invoke(t10));
        }
        Object objG = g(new AnimationState(f1Var, t10, vG, 0L, 0L, false, 56, null), new c1(hVar, f1Var, t10, t11, vG), 0L, new yh.l<g<T, V>, b2>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void a(@dl.d g<T, V> animate) {
                kotlin.jvm.internal.f0.p(animate, "$this$animate");
                pVar.invoke(animate.g(), f1Var.b().invoke(animate.i()));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Object obj) {
                a((g) obj);
                return b2.f124493a;
            }
        }, cVar, 2, null);
        return objG == kotlin.coroutines.intrinsics.b.h() ? objG : b2.f124493a;
    }

    public static /* synthetic */ Object f(float f10, float f11, float f12, h hVar, yh.p pVar, kotlin.coroutines.c cVar, int i10, Object obj) {
        float f13 = (i10 & 4) != 0 ? 0.0f : f12;
        if ((i10 & 8) != 0) {
            hVar = i.o(0.0f, 0.0f, null, 7, null);
        }
        return c(f10, f11, f13, hVar, pVar, cVar);
    }

    public static /* synthetic */ Object g(AnimationState animationState, d dVar, long j10, yh.l lVar, kotlin.coroutines.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Long.MIN_VALUE;
        }
        long j11 = j10;
        if ((i10 & 4) != 0) {
            lVar = new yh.l<g<Object, Object>, b2>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$5
                public final void a(@dl.d g<Object, Object> gVar) {
                    kotlin.jvm.internal.f0.p(gVar, "$this$null");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(g<Object, Object> gVar) {
                    a(gVar);
                    return b2.f124493a;
                }
            };
        }
        return d(animationState, dVar, j11, lVar, cVar);
    }

    @dl.e
    public static final Object i(float f10, float f11, @dl.d i0 i0Var, @dl.d final yh.p<? super Float, ? super Float, b2> pVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objG = g(k.c(f10, f11, 0L, 0L, false, 28, null), AnimationKt.a(i0Var, f10, f11), 0L, new yh.l<g<Float, l>, b2>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animateDecay$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void a(@dl.d g<Float, l> animate) {
                kotlin.jvm.internal.f0.p(animate, "$this$animate");
                pVar.invoke(animate.g(), Float.valueOf(((l) animate.i()).getValue()));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(g<Float, l> gVar) {
                a(gVar);
                return b2.f124493a;
            }
        }, cVar, 2, null);
        return objG == kotlin.coroutines.intrinsics.b.h() ? objG : b2.f124493a;
    }

    @dl.e
    public static final <T, V extends p> Object j(@dl.d AnimationState<T, V> animationState, @dl.d x<T> xVar, boolean z10, @dl.d yh.l<? super g<T, V>, b2> lVar, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        Object objD = d(animationState, new w((x) xVar, (f1<T, p>) animationState.g(), (Object) animationState.getValue(), animationState.i()), z10 ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, lVar, cVar);
        return objD == kotlin.coroutines.intrinsics.b.h() ? objD : b2.f124493a;
    }

    public static /* synthetic */ Object k(AnimationState animationState, x xVar, boolean z10, yh.l lVar, kotlin.coroutines.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            lVar = new yh.l<g<Object, Object>, b2>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animateDecay$4
                public final void a(@dl.d g<Object, Object> gVar) {
                    kotlin.jvm.internal.f0.p(gVar, "$this$null");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(g<Object, Object> gVar) {
                    a(gVar);
                    return b2.f124493a;
                }
            };
        }
        return j(animationState, xVar, z10, lVar, cVar);
    }

    @dl.e
    public static final <T, V extends p> Object l(@dl.d AnimationState<T, V> animationState, T t10, @dl.d h<T> hVar, boolean z10, @dl.d yh.l<? super g<T, V>, b2> lVar, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        Object objD = d(animationState, new c1(hVar, animationState.g(), animationState.getValue(), t10, animationState.i()), z10 ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, lVar, cVar);
        return objD == kotlin.coroutines.intrinsics.b.h() ? objD : b2.f124493a;
    }

    public static /* synthetic */ Object m(AnimationState animationState, Object obj, h hVar, boolean z10, yh.l lVar, kotlin.coroutines.c cVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            hVar = i.o(0.0f, 0.0f, null, 7, null);
        }
        h hVar2 = hVar;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            lVar = new yh.l<g<Object, Object>, b2>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animateTo$2
                public final void a(@dl.d g<Object, Object> gVar) {
                    kotlin.jvm.internal.f0.p(gVar, "$this$null");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(g<Object, Object> gVar) {
                    a(gVar);
                    return b2.f124493a;
                }
            };
        }
        return l(animationState, obj, hVar2, z11, lVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <R, T, V extends p> Object n(d<T, V> dVar, final yh.l<? super Long, ? extends R> lVar, kotlin.coroutines.c<? super R> cVar) {
        return dVar.getIsInfinite() ? InfiniteAnimationPolicyKt.c(lVar, cVar) : MonotonicFrameClockKt.f(new yh.l<Long, R>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$callWithFrameNanos$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final R a(long j10) {
                return lVar.invoke(Long.valueOf(j10 / 1));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Object invoke(Long l10) {
                return a(l10.longValue());
            }
        }, cVar);
    }

    private static final <T, V extends p> void o(g<T, V> gVar, long j10, long j11, d<T, V> dVar, AnimationState<T, V> animationState, yh.l<? super g<T, V>, b2> lVar) {
        gVar.l(j10);
        gVar.n(dVar.e(j11));
        gVar.o(dVar.g(j11));
        if (dVar.b(j11)) {
            gVar.k(gVar.getLastFrameTimeNanos());
            gVar.m(false);
        }
        r(gVar, animationState);
        lVar.invoke(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends p> void p(g<T, V> gVar, long j10, float f10, d<T, V> dVar, AnimationState<T, V> animationState, yh.l<? super g<T, V>, b2> lVar) {
        o(gVar, j10, (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) == 0 ? dVar.getDurationNanos() : (long) ((j10 - gVar.getStartTimeNanos()) / f10), dVar, animationState, lVar);
    }

    public static final float q(@dl.d CoroutineContext coroutineContext) {
        kotlin.jvm.internal.f0.p(coroutineContext, "<this>");
        androidx.compose.ui.q qVar = (androidx.compose.ui.q) coroutineContext.f(androidx.compose.ui.q.INSTANCE);
        float fA0 = qVar != null ? qVar.a0() : 1.0f;
        if (fA0 >= 0.0f) {
            return fA0;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final <T, V extends p> void r(@dl.d g<T, V> gVar, @dl.d AnimationState<T, V> state) {
        kotlin.jvm.internal.f0.p(gVar, "<this>");
        kotlin.jvm.internal.f0.p(state, "state");
        state.q(gVar.g());
        q.f(state.i(), gVar.i());
        state.l(gVar.getFinishedTimeNanos());
        state.m(gVar.getLastFrameTimeNanos());
        state.p(gVar.j());
    }
}
