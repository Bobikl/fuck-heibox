package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.i0;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: TapGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/i0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", i = {}, l = {218}, m = "invokeSuspend", n = {}, s = {})
public final class TapGestureDetectorKt$detectTapAndPress$2 extends SuspendLambda implements yh.p<i0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f5611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f5612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ PressGestureScopeImpl f5613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.q<k, b1.f, kotlin.coroutines.c<? super b2>, Object> f5614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ yh.l<b1.f, b2> f5615f;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", i = {}, l = {220}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f5616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f5617c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ PressGestureScopeImpl f5618d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ i0 f5619e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ yh.q<k, b1.f, kotlin.coroutines.c<? super b2>, Object> f5620f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ yh.l<b1.f, b2> f5621g;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: TapGestureDetector.kt */
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/d;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", i = {0}, l = {bb.c.b.f30829o1, bb.c.b.f30963u1}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
        public static final class C00411 extends RestrictedSuspendLambda implements yh.p<androidx.compose.ui.input.pointer.d, kotlin.coroutines.c<? super b2>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f5622c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f5623d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ yh.q<k, b1.f, kotlin.coroutines.c<? super b2>, Object> f5624e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ q0 f5625f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ PressGestureScopeImpl f5626g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ yh.l<b1.f, b2> f5627h;

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1$1", f = "TapGestureDetector.kt", i = {}, l = {bb.c.b.f30897r1}, m = "invokeSuspend", n = {}, s = {})
            public static final class C00421 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f5628b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ yh.q<k, b1.f, kotlin.coroutines.c<? super b2>, Object> f5629c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ PressGestureScopeImpl f5630d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ PointerInputChange f5631e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C00421(yh.q<? super k, ? super b1.f, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, kotlin.coroutines.c<? super C00421> cVar) {
                    super(2, cVar);
                    this.f5629c = qVar;
                    this.f5630d = pressGestureScopeImpl;
                    this.f5631e = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    return new C00421(this.f5629c, this.f5630d, this.f5631e, cVar);
                }

                @Override // yh.p
                @dl.e
                public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                    return ((C00421) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i10 = this.f5628b;
                    if (i10 == 0) {
                        t0.n(obj);
                        yh.q<k, b1.f, kotlin.coroutines.c<? super b2>, Object> qVar = this.f5629c;
                        PressGestureScopeImpl pressGestureScopeImpl = this.f5630d;
                        b1.f fVarD = b1.f.d(this.f5631e.getPosition());
                        this.f5628b = 1;
                        if (qVar.invoke(pressGestureScopeImpl, fVarD, this) == objH) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00411(yh.q<? super k, ? super b1.f, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar, q0 q0Var, PressGestureScopeImpl pressGestureScopeImpl, yh.l<? super b1.f, b2> lVar, kotlin.coroutines.c<? super C00411> cVar) {
                super(2, cVar);
                this.f5624e = qVar;
                this.f5625f = q0Var;
                this.f5626g = pressGestureScopeImpl;
                this.f5627h = lVar;
            }

            @Override // yh.p
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@dl.d androidx.compose.ui.input.pointer.d dVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                return ((C00411) create(dVar, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                C00411 c00411 = new C00411(this.f5624e, this.f5625f, this.f5626g, this.f5627h, cVar);
                c00411.f5623d = obj;
                return c00411;
            }

            /* JADX WARN: Code duplicated, block: B:21:0x0065  */
            /* JADX WARN: Code duplicated, block: B:22:0x006b  */
            /* JADX WARN: Code duplicated, block: B:24:0x0077  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                androidx.compose.ui.input.pointer.d dVar;
                PointerInputChange pointerInputChange;
                yh.l<b1.f, b2> lVar;
                Object objH = kotlin.coroutines.intrinsics.b.h();
                int i10 = this.f5622c;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dVar = (androidx.compose.ui.input.pointer.d) this.f5623d;
                        t0.n(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t0.n(obj);
                    }
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange == null) {
                        this.f5626g.b();
                    } else {
                        pointerInputChange.a();
                        this.f5626g.g();
                        lVar = this.f5627h;
                        if (lVar != null) {
                            lVar.invoke(b1.f.d(pointerInputChange.getPosition()));
                        }
                    }
                    return b2.f124493a;
                }
                t0.n(obj);
                dVar = (androidx.compose.ui.input.pointer.d) this.f5623d;
                this.f5623d = dVar;
                this.f5622c = 1;
                obj = TapGestureDetectorKt.e(dVar, false, this, 1, null);
                if (obj == objH) {
                    return objH;
                }
                PointerInputChange pointerInputChange2 = (PointerInputChange) obj;
                pointerInputChange2.a();
                if (this.f5624e != TapGestureDetectorKt.f5597a) {
                    kotlinx.coroutines.k.f(this.f5625f, null, null, new C00421(this.f5624e, this.f5626g, pointerInputChange2, null), 3, null);
                }
                this.f5623d = null;
                this.f5622c = 2;
                obj = TapGestureDetectorKt.m(dVar, this);
                if (obj == objH) {
                    return objH;
                }
                pointerInputChange = (PointerInputChange) obj;
                if (pointerInputChange == null) {
                    this.f5626g.b();
                } else {
                    pointerInputChange.a();
                    this.f5626g.g();
                    lVar = this.f5627h;
                    if (lVar != null) {
                        lVar.invoke(b1.f.d(pointerInputChange.getPosition()));
                    }
                }
                return b2.f124493a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(PressGestureScopeImpl pressGestureScopeImpl, i0 i0Var, yh.q<? super k, ? super b1.f, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar, yh.l<? super b1.f, b2> lVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f5618d = pressGestureScopeImpl;
            this.f5619e = i0Var;
            this.f5620f = qVar;
            this.f5621g = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f5618d, this.f5619e, this.f5620f, this.f5621g, cVar);
            anonymousClass1.f5617c = obj;
            return anonymousClass1;
        }

        @Override // yh.p
        @dl.e
        public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f5616b;
            if (i10 == 0) {
                t0.n(obj);
                q0 q0Var = (q0) this.f5617c;
                this.f5618d.h();
                i0 i0Var = this.f5619e;
                C00411 c00411 = new C00411(this.f5620f, q0Var, this.f5618d, this.f5621g, null);
                this.f5616b = 1;
                if (i0Var.n1(c00411, this) == objH) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TapGestureDetectorKt$detectTapAndPress$2(PressGestureScopeImpl pressGestureScopeImpl, yh.q<? super k, ? super b1.f, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar, yh.l<? super b1.f, b2> lVar, kotlin.coroutines.c<? super TapGestureDetectorKt$detectTapAndPress$2> cVar) {
        super(2, cVar);
        this.f5613d = pressGestureScopeImpl;
        this.f5614e = qVar;
        this.f5615f = lVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d i0 i0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((TapGestureDetectorKt$detectTapAndPress$2) create(i0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        TapGestureDetectorKt$detectTapAndPress$2 tapGestureDetectorKt$detectTapAndPress$2 = new TapGestureDetectorKt$detectTapAndPress$2(this.f5613d, this.f5614e, this.f5615f, cVar);
        tapGestureDetectorKt$detectTapAndPress$2.f5612c = obj;
        return tapGestureDetectorKt$detectTapAndPress$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f5611b;
        if (i10 == 0) {
            t0.n(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f5613d, (i0) this.f5612c, this.f5614e, this.f5615f, null);
            this.f5611b = 1;
            if (r0.g(anonymousClass1, this) == objH) {
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
