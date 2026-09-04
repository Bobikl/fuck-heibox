package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.i0;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: TapGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
public final class TapGestureDetectorKt$detectTapGestures$2 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f5632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f5633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ i0 f5634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.q<k, b1.f, kotlin.coroutines.c<? super b2>, Object> f5635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ yh.l<b1.f, b2> f5636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ yh.l<b1.f, b2> f5637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ yh.l<b1.f, b2> f5638h;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/i0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<i0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f5639b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f5640c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ PressGestureScopeImpl f5641d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ yh.q<k, b1.f, kotlin.coroutines.c<? super b2>, Object> f5642e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ q0 f5643f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ yh.l<b1.f, b2> f5644g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ yh.l<b1.f, b2> f5645h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ yh.l<b1.f, b2> f5646i;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: TapGestureDetector.kt */
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/d;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", i = {0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4}, l = {101, 113, 124, 134, 147, 165}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "down", "upOrCancel", "longPressTimeout", "$this$awaitPointerEventScope", "upOrCancel", "longPressTimeout", "$this$awaitPointerEventScope", "upOrCancel", "longPressTimeout", "$this$awaitPointerEventScope", "upOrCancel", "secondDown"}, s = {"L$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "L$2"})
        public static final class C00431 extends RestrictedSuspendLambda implements yh.p<androidx.compose.ui.input.pointer.d, kotlin.coroutines.c<? super b2>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f5647c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f5648d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f5649e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            long f5650f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f5651g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private /* synthetic */ Object f5652h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ PressGestureScopeImpl f5653i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ yh.q<k, b1.f, kotlin.coroutines.c<? super b2>, Object> f5654j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ q0 f5655k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ yh.l<b1.f, b2> f5656l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ yh.l<b1.f, b2> f5657m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ yh.l<b1.f, b2> f5658n;

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$1", f = "TapGestureDetector.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
            public static final class C00441 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f5659b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ yh.q<k, b1.f, kotlin.coroutines.c<? super b2>, Object> f5660c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ PressGestureScopeImpl f5661d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ PointerInputChange f5662e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C00441(yh.q<? super k, ? super b1.f, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, kotlin.coroutines.c<? super C00441> cVar) {
                    super(2, cVar);
                    this.f5660c = qVar;
                    this.f5661d = pressGestureScopeImpl;
                    this.f5662e = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    return new C00441(this.f5660c, this.f5661d, this.f5662e, cVar);
                }

                @Override // yh.p
                @dl.e
                public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                    return ((C00441) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i10 = this.f5659b;
                    if (i10 == 0) {
                        t0.n(obj);
                        yh.q<k, b1.f, kotlin.coroutines.c<? super b2>, Object> qVar = this.f5660c;
                        PressGestureScopeImpl pressGestureScopeImpl = this.f5661d;
                        b1.f fVarD = b1.f.d(this.f5662e.getPosition());
                        this.f5659b = 1;
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

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/d;", "Landroidx/compose/ui/input/pointer/y;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$2", f = "TapGestureDetector.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass2 extends RestrictedSuspendLambda implements yh.p<androidx.compose.ui.input.pointer.d, kotlin.coroutines.c<? super PointerInputChange>, Object> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                int f5663c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private /* synthetic */ Object f5664d;

                AnonymousClass2(kotlin.coroutines.c<? super AnonymousClass2> cVar) {
                    super(2, cVar);
                }

                @Override // yh.p
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@dl.d androidx.compose.ui.input.pointer.d dVar, @dl.e kotlin.coroutines.c<? super PointerInputChange> cVar) {
                    return ((AnonymousClass2) create(dVar, cVar)).invokeSuspend(b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar);
                    anonymousClass2.f5664d = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i10 = this.f5663c;
                    if (i10 == 0) {
                        t0.n(obj);
                        androidx.compose.ui.input.pointer.d dVar = (androidx.compose.ui.input.pointer.d) this.f5664d;
                        this.f5663c = 1;
                        obj = TapGestureDetectorKt.m(dVar, this);
                        if (obj == objH) {
                            return objH;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t0.n(obj);
                    }
                    return obj;
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$3, reason: invalid class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$3", f = "TapGestureDetector.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass3 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f5665b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ yh.q<k, b1.f, kotlin.coroutines.c<? super b2>, Object> f5666c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ PressGestureScopeImpl f5667d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ PointerInputChange f5668e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass3(yh.q<? super k, ? super b1.f, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, kotlin.coroutines.c<? super AnonymousClass3> cVar) {
                    super(2, cVar);
                    this.f5666c = qVar;
                    this.f5667d = pressGestureScopeImpl;
                    this.f5668e = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    return new AnonymousClass3(this.f5666c, this.f5667d, this.f5668e, cVar);
                }

                @Override // yh.p
                @dl.e
                public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                    return ((AnonymousClass3) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i10 = this.f5665b;
                    if (i10 == 0) {
                        t0.n(obj);
                        yh.q<k, b1.f, kotlin.coroutines.c<? super b2>, Object> qVar = this.f5666c;
                        PressGestureScopeImpl pressGestureScopeImpl = this.f5667d;
                        b1.f fVarD = b1.f.d(this.f5668e.getPosition());
                        this.f5665b = 1;
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

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$4, reason: invalid class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/d;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$4", f = "TapGestureDetector.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass4 extends RestrictedSuspendLambda implements yh.p<androidx.compose.ui.input.pointer.d, kotlin.coroutines.c<? super b2>, Object> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                int f5669c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private /* synthetic */ Object f5670d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ PressGestureScopeImpl f5671e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ yh.l<b1.f, b2> f5672f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ yh.l<b1.f, b2> f5673g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ Ref.ObjectRef<PointerInputChange> f5674h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass4(PressGestureScopeImpl pressGestureScopeImpl, yh.l<? super b1.f, b2> lVar, yh.l<? super b1.f, b2> lVar2, Ref.ObjectRef<PointerInputChange> objectRef, kotlin.coroutines.c<? super AnonymousClass4> cVar) {
                    super(2, cVar);
                    this.f5671e = pressGestureScopeImpl;
                    this.f5672f = lVar;
                    this.f5673g = lVar2;
                    this.f5674h = objectRef;
                }

                @Override // yh.p
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@dl.d androidx.compose.ui.input.pointer.d dVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                    return ((AnonymousClass4) create(dVar, cVar)).invokeSuspend(b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.f5671e, this.f5672f, this.f5673g, this.f5674h, cVar);
                    anonymousClass4.f5670d = obj;
                    return anonymousClass4;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    Object objH = kotlin.coroutines.intrinsics.b.h();
                    int i10 = this.f5669c;
                    if (i10 == 0) {
                        t0.n(obj);
                        androidx.compose.ui.input.pointer.d dVar = (androidx.compose.ui.input.pointer.d) this.f5670d;
                        this.f5669c = 1;
                        obj = TapGestureDetectorKt.m(dVar, this);
                        if (obj == objH) {
                            return objH;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t0.n(obj);
                    }
                    PointerInputChange pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null) {
                        pointerInputChange.a();
                        this.f5671e.g();
                        this.f5672f.invoke(b1.f.d(pointerInputChange.getPosition()));
                        return b2.f124493a;
                    }
                    this.f5671e.b();
                    yh.l<b1.f, b2> lVar = this.f5673g;
                    if (lVar == null) {
                        return null;
                    }
                    lVar.invoke(b1.f.d(this.f5674h.f124891b.getPosition()));
                    return b2.f124493a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00431(PressGestureScopeImpl pressGestureScopeImpl, yh.q<? super k, ? super b1.f, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar, q0 q0Var, yh.l<? super b1.f, b2> lVar, yh.l<? super b1.f, b2> lVar2, yh.l<? super b1.f, b2> lVar3, kotlin.coroutines.c<? super C00431> cVar) {
                super(2, cVar);
                this.f5653i = pressGestureScopeImpl;
                this.f5654j = qVar;
                this.f5655k = q0Var;
                this.f5656l = lVar;
                this.f5657m = lVar2;
                this.f5658n = lVar3;
            }

            @Override // yh.p
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@dl.d androidx.compose.ui.input.pointer.d dVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                return ((C00431) create(dVar, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                C00431 c00431 = new C00431(this.f5653i, this.f5654j, this.f5655k, this.f5656l, this.f5657m, this.f5658n, cVar);
                c00431.f5652h = obj;
                return c00431;
            }

            /* JADX WARN: Code duplicated, block: B:23:0x009e  */
            /* JADX WARN: Code duplicated, block: B:26:0x00b4  */
            /* JADX WARN: Code duplicated, block: B:27:0x00bd  */
            /* JADX WARN: Code duplicated, block: B:31:0x00df A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:32:0x00e0  */
            /* JADX WARN: Code duplicated, block: B:35:0x00e9 A[Catch: PointerEventTimeoutCancellationException -> 0x00fa, TryCatch #0 {PointerEventTimeoutCancellationException -> 0x00fa, blocks: (B:33:0x00e3, B:35:0x00e9, B:36:0x00ef), top: B:84:0x00e3 }] */
            /* JADX WARN: Code duplicated, block: B:36:0x00ef A[Catch: PointerEventTimeoutCancellationException -> 0x00fa, TRY_LEAVE, TryCatch #0 {PointerEventTimeoutCancellationException -> 0x00fa, blocks: (B:33:0x00e3, B:35:0x00e9, B:36:0x00ef), top: B:84:0x00e3 }] */
            /* JADX WARN: Code duplicated, block: B:41:0x0101  */
            /* JADX WARN: Code duplicated, block: B:44:0x011f A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:48:0x012b  */
            /* JADX WARN: Code duplicated, block: B:50:0x012f  */
            /* JADX WARN: Code duplicated, block: B:52:0x0133  */
            /* JADX WARN: Code duplicated, block: B:53:0x0142  */
            /* JADX WARN: Code duplicated, block: B:55:0x0157 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:56:0x0158  */
            /* JADX WARN: Code duplicated, block: B:59:0x015e  */
            /* JADX WARN: Code duplicated, block: B:61:0x0162  */
            /* JADX WARN: Code duplicated, block: B:62:0x0173  */
            /* JADX WARN: Code duplicated, block: B:64:0x0180  */
            /* JADX WARN: Code duplicated, block: B:67:0x01b4 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:71:0x01bb  */
            /* JADX WARN: Code duplicated, block: B:74:0x01ce  */
            /* JADX WARN: Code duplicated, block: B:77:0x01e8 A[RETURN] */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                androidx.compose.ui.input.pointer.d dVar;
                Object objE;
                androidx.compose.ui.input.pointer.d dVar2;
                PointerInputChange pointerInputChange;
                long jD;
                Ref.ObjectRef objectRef;
                Object objF0;
                androidx.compose.ui.input.pointer.d dVar3;
                PointerInputChange pointerInputChange2;
                Ref.ObjectRef objectRef2;
                androidx.compose.ui.input.pointer.d dVar4;
                yh.l<b1.f, b2> lVar;
                T t10;
                T t11;
                T t12;
                Object objG;
                Ref.ObjectRef objectRef3;
                androidx.compose.ui.input.pointer.d dVar5;
                yh.l<b1.f, b2> lVar2;
                PointerInputChange pointerInputChange3;
                Ref.ObjectRef objectRef4;
                androidx.compose.ui.input.pointer.d dVar6;
                AnonymousClass4 anonymousClass4;
                yh.l<b1.f, b2> lVar3;
                yh.l<b1.f, b2> lVar4;
                yh.l<b1.f, b2> lVar5;
                Object objH = kotlin.coroutines.intrinsics.b.h();
                switch (this.f5651g) {
                    case 0:
                        t0.n(obj);
                        dVar = (androidx.compose.ui.input.pointer.d) this.f5652h;
                        this.f5652h = dVar;
                        this.f5651g = 1;
                        objE = TapGestureDetectorKt.e(dVar, false, this, 1, null);
                        if (objE == objH) {
                            return objH;
                        }
                        dVar2 = dVar;
                        pointerInputChange = (PointerInputChange) objE;
                        pointerInputChange.a();
                        this.f5653i.h();
                        if (this.f5654j != TapGestureDetectorKt.f5597a) {
                            kotlinx.coroutines.k.f(this.f5655k, null, null, new C00441(this.f5654j, this.f5653i, pointerInputChange, null), 3, null);
                        }
                        if (this.f5656l != null) {
                            jD = dVar2.getViewConfiguration().d();
                        } else {
                            jD = kotlin.time.g.f128637c;
                        }
                        objectRef = new Ref.ObjectRef();
                        try {
                            AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
                            this.f5652h = dVar2;
                            this.f5647c = pointerInputChange;
                            this.f5648d = objectRef;
                            this.f5649e = objectRef;
                            this.f5650f = jD;
                            this.f5651g = 2;
                            objF0 = dVar2.f0(jD, anonymousClass2, this);
                            if (objF0 == objH) {
                                return objH;
                            }
                            dVar3 = dVar2;
                            pointerInputChange2 = pointerInputChange;
                            objectRef2 = objectRef;
                            t10 = objF0;
                            try {
                                objectRef.f124891b = t10;
                                t11 = objectRef2.f124891b;
                                if (t11 == 0) {
                                    this.f5653i.b();
                                } else {
                                    ((PointerInputChange) t11).a();
                                    this.f5653i.g();
                                }
                                break;
                            } catch (PointerEventTimeoutCancellationException unused) {
                                objectRef = objectRef2;
                                pointerInputChange = pointerInputChange2;
                                dVar4 = dVar3;
                                lVar = this.f5656l;
                                if (lVar != null) {
                                    lVar.invoke(b1.f.d(pointerInputChange.getPosition()));
                                }
                                this.f5652h = dVar4;
                                this.f5647c = objectRef;
                                this.f5648d = null;
                                this.f5649e = null;
                                this.f5650f = jD;
                                this.f5651g = 3;
                                if (TapGestureDetectorKt.h(dVar4, this) == objH) {
                                    return objH;
                                }
                                this.f5653i.g();
                                objectRef2 = objectRef;
                                dVar3 = dVar4;
                            }
                            t12 = objectRef2.f124891b;
                            if (t12 != 0) {
                                if (this.f5657m == null) {
                                    lVar2 = this.f5658n;
                                    if (lVar2 != null) {
                                        lVar2.invoke(b1.f.d(((PointerInputChange) t12).getPosition()));
                                    }
                                } else {
                                    this.f5652h = dVar3;
                                    this.f5647c = objectRef2;
                                    this.f5648d = null;
                                    this.f5649e = null;
                                    this.f5650f = jD;
                                    this.f5651g = 4;
                                    objG = TapGestureDetectorKt.g(dVar3, (PointerInputChange) t12, this);
                                    if (objG == objH) {
                                        return objH;
                                    }
                                    objectRef3 = objectRef2;
                                    dVar5 = dVar3;
                                    pointerInputChange3 = (PointerInputChange) objG;
                                    if (pointerInputChange3 == null) {
                                        lVar3 = this.f5658n;
                                        if (lVar3 != null) {
                                            lVar3.invoke(b1.f.d(((PointerInputChange) objectRef3.f124891b).getPosition()));
                                        }
                                    } else {
                                        this.f5653i.h();
                                        if (this.f5654j != TapGestureDetectorKt.f5597a) {
                                            kotlinx.coroutines.k.f(this.f5655k, null, null, new AnonymousClass3(this.f5654j, this.f5653i, pointerInputChange3, null), 3, null);
                                        }
                                        try {
                                            anonymousClass4 = new AnonymousClass4(this.f5653i, this.f5657m, this.f5658n, objectRef3, null);
                                            this.f5652h = dVar5;
                                            this.f5647c = objectRef3;
                                            this.f5648d = pointerInputChange3;
                                            this.f5651g = 5;
                                            if (dVar5.f0(jD, anonymousClass4, this) == objH) {
                                                return objH;
                                            }
                                        } catch (PointerEventTimeoutCancellationException unused2) {
                                            objectRef4 = objectRef3;
                                            dVar6 = dVar5;
                                            lVar4 = this.f5658n;
                                            if (lVar4 != null) {
                                                lVar4.invoke(b1.f.d(((PointerInputChange) objectRef4.f124891b).getPosition()));
                                            }
                                            lVar5 = this.f5656l;
                                            if (lVar5 != null) {
                                                lVar5.invoke(b1.f.d(pointerInputChange3.getPosition()));
                                            }
                                            this.f5652h = null;
                                            this.f5647c = null;
                                            this.f5648d = null;
                                            this.f5651g = 6;
                                            if (TapGestureDetectorKt.h(dVar6, this) == objH) {
                                                return objH;
                                            }
                                            this.f5653i.g();
                                        }
                                    }
                                }
                            }
                            return b2.f124493a;
                        } catch (PointerEventTimeoutCancellationException unused3) {
                            dVar4 = dVar2;
                            lVar = this.f5656l;
                            if (lVar != null) {
                                lVar.invoke(b1.f.d(pointerInputChange.getPosition()));
                            }
                            this.f5652h = dVar4;
                            this.f5647c = objectRef;
                            this.f5648d = null;
                            this.f5649e = null;
                            this.f5650f = jD;
                            this.f5651g = 3;
                            if (TapGestureDetectorKt.h(dVar4, this) == objH) {
                                return objH;
                            }
                            this.f5653i.g();
                            objectRef2 = objectRef;
                            dVar3 = dVar4;
                            t12 = objectRef2.f124891b;
                            if (t12 != 0) {
                                if (this.f5657m == null) {
                                    lVar2 = this.f5658n;
                                    if (lVar2 != null) {
                                        lVar2.invoke(b1.f.d(((PointerInputChange) t12).getPosition()));
                                    }
                                } else {
                                    this.f5652h = dVar3;
                                    this.f5647c = objectRef2;
                                    this.f5648d = null;
                                    this.f5649e = null;
                                    this.f5650f = jD;
                                    this.f5651g = 4;
                                    objG = TapGestureDetectorKt.g(dVar3, (PointerInputChange) t12, this);
                                    if (objG == objH) {
                                        return objH;
                                    }
                                    objectRef3 = objectRef2;
                                    dVar5 = dVar3;
                                    pointerInputChange3 = (PointerInputChange) objG;
                                    if (pointerInputChange3 == null) {
                                        lVar3 = this.f5658n;
                                        if (lVar3 != null) {
                                            lVar3.invoke(b1.f.d(((PointerInputChange) objectRef3.f124891b).getPosition()));
                                        }
                                    } else {
                                        this.f5653i.h();
                                        if (this.f5654j != TapGestureDetectorKt.f5597a) {
                                            kotlinx.coroutines.k.f(this.f5655k, null, null, new AnonymousClass3(this.f5654j, this.f5653i, pointerInputChange3, null), 3, null);
                                        }
                                        anonymousClass4 = new AnonymousClass4(this.f5653i, this.f5657m, this.f5658n, objectRef3, null);
                                        this.f5652h = dVar5;
                                        this.f5647c = objectRef3;
                                        this.f5648d = pointerInputChange3;
                                        this.f5651g = 5;
                                        if (dVar5.f0(jD, anonymousClass4, this) == objH) {
                                            return objH;
                                        }
                                    }
                                }
                            }
                            return b2.f124493a;
                        }
                    case 1:
                        dVar = (androidx.compose.ui.input.pointer.d) this.f5652h;
                        t0.n(obj);
                        objE = obj;
                        dVar2 = dVar;
                        pointerInputChange = (PointerInputChange) objE;
                        pointerInputChange.a();
                        this.f5653i.h();
                        if (this.f5654j != TapGestureDetectorKt.f5597a) {
                            kotlinx.coroutines.k.f(this.f5655k, null, null, new C00441(this.f5654j, this.f5653i, pointerInputChange, null), 3, null);
                        }
                        if (this.f5656l != null) {
                            jD = dVar2.getViewConfiguration().d();
                        } else {
                            jD = kotlin.time.g.f128637c;
                        }
                        objectRef = new Ref.ObjectRef();
                        AnonymousClass2 anonymousClass3 = new AnonymousClass2(null);
                        this.f5652h = dVar2;
                        this.f5647c = pointerInputChange;
                        this.f5648d = objectRef;
                        this.f5649e = objectRef;
                        this.f5650f = jD;
                        this.f5651g = 2;
                        objF0 = dVar2.f0(jD, anonymousClass3, this);
                        if (objF0 == objH) {
                            return objH;
                        }
                        dVar3 = dVar2;
                        pointerInputChange2 = pointerInputChange;
                        objectRef2 = objectRef;
                        t10 = objF0;
                        objectRef.f124891b = t10;
                        t11 = objectRef2.f124891b;
                        if (t11 == 0) {
                            this.f5653i.b();
                        } else {
                            ((PointerInputChange) t11).a();
                            this.f5653i.g();
                        }
                        t12 = objectRef2.f124891b;
                        if (t12 != 0) {
                            if (this.f5657m == null) {
                                lVar2 = this.f5658n;
                                if (lVar2 != null) {
                                    lVar2.invoke(b1.f.d(((PointerInputChange) t12).getPosition()));
                                }
                            } else {
                                this.f5652h = dVar3;
                                this.f5647c = objectRef2;
                                this.f5648d = null;
                                this.f5649e = null;
                                this.f5650f = jD;
                                this.f5651g = 4;
                                objG = TapGestureDetectorKt.g(dVar3, (PointerInputChange) t12, this);
                                if (objG == objH) {
                                    return objH;
                                }
                                objectRef3 = objectRef2;
                                dVar5 = dVar3;
                                pointerInputChange3 = (PointerInputChange) objG;
                                if (pointerInputChange3 == null) {
                                    lVar3 = this.f5658n;
                                    if (lVar3 != null) {
                                        lVar3.invoke(b1.f.d(((PointerInputChange) objectRef3.f124891b).getPosition()));
                                    }
                                } else {
                                    this.f5653i.h();
                                    if (this.f5654j != TapGestureDetectorKt.f5597a) {
                                        kotlinx.coroutines.k.f(this.f5655k, null, null, new AnonymousClass3(this.f5654j, this.f5653i, pointerInputChange3, null), 3, null);
                                    }
                                    anonymousClass4 = new AnonymousClass4(this.f5653i, this.f5657m, this.f5658n, objectRef3, null);
                                    this.f5652h = dVar5;
                                    this.f5647c = objectRef3;
                                    this.f5648d = pointerInputChange3;
                                    this.f5651g = 5;
                                    if (dVar5.f0(jD, anonymousClass4, this) == objH) {
                                        return objH;
                                    }
                                }
                            }
                        }
                        return b2.f124493a;
                    case 2:
                        jD = this.f5650f;
                        objectRef = (Ref.ObjectRef) this.f5649e;
                        Ref.ObjectRef objectRef5 = (Ref.ObjectRef) this.f5648d;
                        pointerInputChange = (PointerInputChange) this.f5647c;
                        dVar2 = (androidx.compose.ui.input.pointer.d) this.f5652h;
                        try {
                            t0.n(obj);
                            dVar3 = dVar2;
                            pointerInputChange2 = pointerInputChange;
                            objectRef2 = objectRef5;
                            t10 = obj;
                            objectRef.f124891b = t10;
                            t11 = objectRef2.f124891b;
                            if (t11 == 0) {
                                this.f5653i.b();
                            } else {
                                ((PointerInputChange) t11).a();
                                this.f5653i.g();
                            }
                            break;
                        } catch (PointerEventTimeoutCancellationException unused4) {
                            objectRef = objectRef5;
                            dVar4 = dVar2;
                            lVar = this.f5656l;
                            if (lVar != null) {
                                lVar.invoke(b1.f.d(pointerInputChange.getPosition()));
                            }
                            this.f5652h = dVar4;
                            this.f5647c = objectRef;
                            this.f5648d = null;
                            this.f5649e = null;
                            this.f5650f = jD;
                            this.f5651g = 3;
                            if (TapGestureDetectorKt.h(dVar4, this) == objH) {
                                return objH;
                            }
                            this.f5653i.g();
                            objectRef2 = objectRef;
                            dVar3 = dVar4;
                            t12 = objectRef2.f124891b;
                            if (t12 != 0) {
                                if (this.f5657m == null) {
                                    lVar2 = this.f5658n;
                                    if (lVar2 != null) {
                                        lVar2.invoke(b1.f.d(((PointerInputChange) t12).getPosition()));
                                    }
                                } else {
                                    this.f5652h = dVar3;
                                    this.f5647c = objectRef2;
                                    this.f5648d = null;
                                    this.f5649e = null;
                                    this.f5650f = jD;
                                    this.f5651g = 4;
                                    objG = TapGestureDetectorKt.g(dVar3, (PointerInputChange) t12, this);
                                    if (objG == objH) {
                                        return objH;
                                    }
                                    objectRef3 = objectRef2;
                                    dVar5 = dVar3;
                                    pointerInputChange3 = (PointerInputChange) objG;
                                    if (pointerInputChange3 == null) {
                                        lVar3 = this.f5658n;
                                        if (lVar3 != null) {
                                            lVar3.invoke(b1.f.d(((PointerInputChange) objectRef3.f124891b).getPosition()));
                                        }
                                    } else {
                                        this.f5653i.h();
                                        if (this.f5654j != TapGestureDetectorKt.f5597a) {
                                            kotlinx.coroutines.k.f(this.f5655k, null, null, new AnonymousClass3(this.f5654j, this.f5653i, pointerInputChange3, null), 3, null);
                                        }
                                        anonymousClass4 = new AnonymousClass4(this.f5653i, this.f5657m, this.f5658n, objectRef3, null);
                                        this.f5652h = dVar5;
                                        this.f5647c = objectRef3;
                                        this.f5648d = pointerInputChange3;
                                        this.f5651g = 5;
                                        if (dVar5.f0(jD, anonymousClass4, this) == objH) {
                                            return objH;
                                        }
                                    }
                                }
                            }
                            return b2.f124493a;
                        }
                        t12 = objectRef2.f124891b;
                        if (t12 != 0) {
                            if (this.f5657m == null) {
                                lVar2 = this.f5658n;
                                if (lVar2 != null) {
                                    lVar2.invoke(b1.f.d(((PointerInputChange) t12).getPosition()));
                                }
                            } else {
                                this.f5652h = dVar3;
                                this.f5647c = objectRef2;
                                this.f5648d = null;
                                this.f5649e = null;
                                this.f5650f = jD;
                                this.f5651g = 4;
                                objG = TapGestureDetectorKt.g(dVar3, (PointerInputChange) t12, this);
                                if (objG == objH) {
                                    return objH;
                                }
                                objectRef3 = objectRef2;
                                dVar5 = dVar3;
                                pointerInputChange3 = (PointerInputChange) objG;
                                if (pointerInputChange3 == null) {
                                    lVar3 = this.f5658n;
                                    if (lVar3 != null) {
                                        lVar3.invoke(b1.f.d(((PointerInputChange) objectRef3.f124891b).getPosition()));
                                    }
                                } else {
                                    this.f5653i.h();
                                    if (this.f5654j != TapGestureDetectorKt.f5597a) {
                                        kotlinx.coroutines.k.f(this.f5655k, null, null, new AnonymousClass3(this.f5654j, this.f5653i, pointerInputChange3, null), 3, null);
                                    }
                                    anonymousClass4 = new AnonymousClass4(this.f5653i, this.f5657m, this.f5658n, objectRef3, null);
                                    this.f5652h = dVar5;
                                    this.f5647c = objectRef3;
                                    this.f5648d = pointerInputChange3;
                                    this.f5651g = 5;
                                    if (dVar5.f0(jD, anonymousClass4, this) == objH) {
                                        return objH;
                                    }
                                }
                            }
                        }
                        return b2.f124493a;
                    case 3:
                        jD = this.f5650f;
                        objectRef = (Ref.ObjectRef) this.f5647c;
                        dVar4 = (androidx.compose.ui.input.pointer.d) this.f5652h;
                        t0.n(obj);
                        this.f5653i.g();
                        objectRef2 = objectRef;
                        dVar3 = dVar4;
                        t12 = objectRef2.f124891b;
                        if (t12 != 0) {
                            if (this.f5657m == null) {
                                lVar2 = this.f5658n;
                                if (lVar2 != null) {
                                    lVar2.invoke(b1.f.d(((PointerInputChange) t12).getPosition()));
                                }
                            } else {
                                this.f5652h = dVar3;
                                this.f5647c = objectRef2;
                                this.f5648d = null;
                                this.f5649e = null;
                                this.f5650f = jD;
                                this.f5651g = 4;
                                objG = TapGestureDetectorKt.g(dVar3, (PointerInputChange) t12, this);
                                if (objG == objH) {
                                    return objH;
                                }
                                objectRef3 = objectRef2;
                                dVar5 = dVar3;
                                pointerInputChange3 = (PointerInputChange) objG;
                                if (pointerInputChange3 == null) {
                                    lVar3 = this.f5658n;
                                    if (lVar3 != null) {
                                        lVar3.invoke(b1.f.d(((PointerInputChange) objectRef3.f124891b).getPosition()));
                                    }
                                } else {
                                    this.f5653i.h();
                                    if (this.f5654j != TapGestureDetectorKt.f5597a) {
                                        kotlinx.coroutines.k.f(this.f5655k, null, null, new AnonymousClass3(this.f5654j, this.f5653i, pointerInputChange3, null), 3, null);
                                    }
                                    anonymousClass4 = new AnonymousClass4(this.f5653i, this.f5657m, this.f5658n, objectRef3, null);
                                    this.f5652h = dVar5;
                                    this.f5647c = objectRef3;
                                    this.f5648d = pointerInputChange3;
                                    this.f5651g = 5;
                                    if (dVar5.f0(jD, anonymousClass4, this) == objH) {
                                        return objH;
                                    }
                                }
                            }
                        }
                        return b2.f124493a;
                    case 4:
                        jD = this.f5650f;
                        Ref.ObjectRef objectRef6 = (Ref.ObjectRef) this.f5647c;
                        androidx.compose.ui.input.pointer.d dVar7 = (androidx.compose.ui.input.pointer.d) this.f5652h;
                        t0.n(obj);
                        objectRef3 = objectRef6;
                        dVar5 = dVar7;
                        objG = obj;
                        pointerInputChange3 = (PointerInputChange) objG;
                        if (pointerInputChange3 == null) {
                            lVar3 = this.f5658n;
                            if (lVar3 != null) {
                                lVar3.invoke(b1.f.d(((PointerInputChange) objectRef3.f124891b).getPosition()));
                            }
                        } else {
                            this.f5653i.h();
                            if (this.f5654j != TapGestureDetectorKt.f5597a) {
                                kotlinx.coroutines.k.f(this.f5655k, null, null, new AnonymousClass3(this.f5654j, this.f5653i, pointerInputChange3, null), 3, null);
                            }
                            anonymousClass4 = new AnonymousClass4(this.f5653i, this.f5657m, this.f5658n, objectRef3, null);
                            this.f5652h = dVar5;
                            this.f5647c = objectRef3;
                            this.f5648d = pointerInputChange3;
                            this.f5651g = 5;
                            if (dVar5.f0(jD, anonymousClass4, this) == objH) {
                                return objH;
                            }
                        }
                        return b2.f124493a;
                    case 5:
                        pointerInputChange3 = (PointerInputChange) this.f5648d;
                        objectRef4 = (Ref.ObjectRef) this.f5647c;
                        dVar6 = (androidx.compose.ui.input.pointer.d) this.f5652h;
                        try {
                            t0.n(obj);
                            break;
                        } catch (PointerEventTimeoutCancellationException unused5) {
                            lVar4 = this.f5658n;
                            if (lVar4 != null) {
                                lVar4.invoke(b1.f.d(((PointerInputChange) objectRef4.f124891b).getPosition()));
                            }
                            lVar5 = this.f5656l;
                            if (lVar5 != null) {
                                lVar5.invoke(b1.f.d(pointerInputChange3.getPosition()));
                            }
                            this.f5652h = null;
                            this.f5647c = null;
                            this.f5648d = null;
                            this.f5651g = 6;
                            if (TapGestureDetectorKt.h(dVar6, this) == objH) {
                                return objH;
                            }
                            this.f5653i.g();
                        }
                        return b2.f124493a;
                    case 6:
                        t0.n(obj);
                        this.f5653i.g();
                        return b2.f124493a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(PressGestureScopeImpl pressGestureScopeImpl, yh.q<? super k, ? super b1.f, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar, q0 q0Var, yh.l<? super b1.f, b2> lVar, yh.l<? super b1.f, b2> lVar2, yh.l<? super b1.f, b2> lVar3, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f5641d = pressGestureScopeImpl;
            this.f5642e = qVar;
            this.f5643f = q0Var;
            this.f5644g = lVar;
            this.f5645h = lVar2;
            this.f5646i = lVar3;
        }

        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d i0 i0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(i0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f5641d, this.f5642e, this.f5643f, this.f5644g, this.f5645h, this.f5646i, cVar);
            anonymousClass1.f5640c = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f5639b;
            if (i10 == 0) {
                t0.n(obj);
                i0 i0Var = (i0) this.f5640c;
                C00431 c00431 = new C00431(this.f5641d, this.f5642e, this.f5643f, this.f5644g, this.f5645h, this.f5646i, null);
                this.f5639b = 1;
                if (i0Var.n1(c00431, this) == objH) {
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
    TapGestureDetectorKt$detectTapGestures$2(i0 i0Var, yh.q<? super k, ? super b1.f, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar, yh.l<? super b1.f, b2> lVar, yh.l<? super b1.f, b2> lVar2, yh.l<? super b1.f, b2> lVar3, kotlin.coroutines.c<? super TapGestureDetectorKt$detectTapGestures$2> cVar) {
        super(2, cVar);
        this.f5634d = i0Var;
        this.f5635e = qVar;
        this.f5636f = lVar;
        this.f5637g = lVar2;
        this.f5638h = lVar3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        TapGestureDetectorKt$detectTapGestures$2 tapGestureDetectorKt$detectTapGestures$2 = new TapGestureDetectorKt$detectTapGestures$2(this.f5634d, this.f5635e, this.f5636f, this.f5637g, this.f5638h, cVar);
        tapGestureDetectorKt$detectTapGestures$2.f5633c = obj;
        return tapGestureDetectorKt$detectTapGestures$2;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((TapGestureDetectorKt$detectTapGestures$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f5632b;
        if (i10 == 0) {
            t0.n(obj);
            q0 q0Var = (q0) this.f5633c;
            PressGestureScopeImpl pressGestureScopeImpl = new PressGestureScopeImpl(this.f5634d);
            i0 i0Var = this.f5634d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(pressGestureScopeImpl, this.f5635e, q0Var, this.f5636f, this.f5637g, this.f5638h, null);
            this.f5632b = 1;
            if (ForEachGestureKt.d(i0Var, anonymousClass1, this) == objH) {
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
