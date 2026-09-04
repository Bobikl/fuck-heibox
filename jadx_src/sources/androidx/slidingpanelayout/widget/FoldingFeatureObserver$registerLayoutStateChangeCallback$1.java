package androidx.slidingpanelayout.widget;

import android.app.Activity;
import androidx.window.sidecar.m;
import androidx.window.sidecar.v;
import dl.e;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: FoldingFeatureObserver.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@d(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1", f = "FoldingFeatureObserver.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
public final class FoldingFeatureObserver$registerLayoutStateChangeCallback$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f27405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ FoldingFeatureObserver f27406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Activity f27407d;

    /* JADX INFO: compiled from: Collect.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a implements f<m> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FoldingFeatureObserver f27408b;

        public a(FoldingFeatureObserver foldingFeatureObserver) {
            this.f27408b = foldingFeatureObserver;
        }

        @Override // kotlinx.coroutines.flow.f
        @e
        public Object emit(m mVar, @dl.d c<? super b2> cVar) {
            b2 b2Var;
            m mVar2 = mVar;
            FoldingFeatureObserver.a aVar = this.f27408b.onFoldingFeatureChangeListener;
            if (aVar == null) {
                b2Var = null;
            } else {
                aVar.a(mVar2);
                b2Var = b2.f124493a;
            }
            return b2Var == b.h() ? b2Var : b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FoldingFeatureObserver$registerLayoutStateChangeCallback$1(FoldingFeatureObserver foldingFeatureObserver, Activity activity, c<? super FoldingFeatureObserver$registerLayoutStateChangeCallback$1> cVar) {
        super(2, cVar);
        this.f27406c = foldingFeatureObserver;
        this.f27407d = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        return new FoldingFeatureObserver$registerLayoutStateChangeCallback$1(this.f27406c, this.f27407d, cVar);
    }

    @Override // yh.p
    @e
    public final Object invoke(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        return ((FoldingFeatureObserver$registerLayoutStateChangeCallback$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = b.h();
        int i10 = this.f27405b;
        if (i10 == 0) {
            t0.n(obj);
            final kotlinx.coroutines.flow.e<v> eVarA = this.f27406c.windowInfoTracker.a(this.f27407d);
            final FoldingFeatureObserver foldingFeatureObserver = this.f27406c;
            kotlinx.coroutines.flow.e eVarG0 = g.g0(new kotlinx.coroutines.flow.e<m>() { // from class: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1

                /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Collect.kt */
                @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 6, 0})
                public static final class AnonymousClass2 implements f<v> {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ f f27411b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ FoldingFeatureObserver f27412c;

                    /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                    @d(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "FoldingFeatureObserver.kt", i = {}, l = {138}, m = "emit", n = {}, s = {})
                    public static final class AnonymousClass1 extends ContinuationImpl {

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        /* synthetic */ Object f27413b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        int f27414c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        Object f27415d;

                        public AnonymousClass1(c cVar) {
                            super(cVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @e
                        public final Object invokeSuspend(@dl.d Object obj) {
                            this.f27413b = obj;
                            this.f27414c |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(f fVar, FoldingFeatureObserver foldingFeatureObserver) {
                        this.f27411b = fVar;
                        this.f27412c = foldingFeatureObserver;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.f
                    @e
                    public Object emit(v vVar, @dl.d c cVar) throws Throwable {
                        AnonymousClass1 anonymousClass1;
                        if (cVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) cVar;
                            int i10 = anonymousClass1.f27414c;
                            if ((i10 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.f27414c = i10 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(cVar);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                        Object obj = anonymousClass1.f27413b;
                        Object objH = b.h();
                        int i11 = anonymousClass1.f27414c;
                        if (i11 == 0) {
                            t0.n(obj);
                            f fVar = this.f27411b;
                            m mVarD = this.f27412c.d(vVar);
                            if (mVarD != null) {
                                anonymousClass1.f27414c = 1;
                                if (fVar.emit(mVarD, anonymousClass1) == objH) {
                                    return objH;
                                }
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t0.n(obj);
                        }
                        return b2.f124493a;
                    }
                }

                @Override // kotlinx.coroutines.flow.e
                @e
                public Object a(@dl.d f<? super m> fVar, @dl.d c cVar) {
                    Object objA = eVarA.a(new AnonymousClass2(fVar, foldingFeatureObserver), cVar);
                    return objA == b.h() ? objA : b2.f124493a;
                }
            });
            a aVar = new a(this.f27406c);
            this.f27405b = 1;
            if (eVarG0.a(aVar, this) == objH) {
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
