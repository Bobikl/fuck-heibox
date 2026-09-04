package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.i0;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.t0;

/* JADX INFO: compiled from: DragGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/i0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5", f = "DragGestureDetector.kt", i = {}, l = {bb.c.b.f31079z7}, m = "invokeSuspend", n = {}, s = {})
public final class DragGestureDetectorKt$detectHorizontalDragGestures$5 extends SuspendLambda implements yh.p<i0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f5313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f5314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ yh.l<b1.f, b2> f5315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.p<PointerInputChange, Float, b2> f5316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ yh.a<b2> f5317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ yh.a<b2> f5318g;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1, reason: invalid class name */
    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/d;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1", f = "DragGestureDetector.kt", i = {0, 1, 1}, l = {bb.c.b.A7, bb.c.b.C7, bb.c.b.N7}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "overSlop"}, s = {"L$0", "L$0", "L$1"})
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements yh.p<androidx.compose.ui.input.pointer.d, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f5319c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f5320d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f5321e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ yh.l<b1.f, b2> f5322f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ yh.p<PointerInputChange, Float, b2> f5323g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f5324h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f5325i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(yh.l<? super b1.f, b2> lVar, yh.p<? super PointerInputChange, ? super Float, b2> pVar, yh.a<b2> aVar, yh.a<b2> aVar2, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f5322f = lVar;
            this.f5323g = pVar;
            this.f5324h = aVar;
            this.f5325i = aVar2;
        }

        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d androidx.compose.ui.input.pointer.d dVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(dVar, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f5322f, this.f5323g, this.f5324h, this.f5325i, cVar);
            anonymousClass1.f5321e = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0071  */
        /* JADX WARN: Code duplicated, block: B:24:0x00a1 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            androidx.compose.ui.input.pointer.d dVar;
            androidx.compose.ui.input.pointer.d dVar2;
            Ref.FloatRef floatRef;
            PointerInputChange pointerInputChange;
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f5320d;
            if (i10 != 0) {
                if (i10 == 1) {
                    dVar = (androidx.compose.ui.input.pointer.d) this.f5321e;
                    t0.n(obj);
                } else {
                    if (i10 == 2) {
                        floatRef = (Ref.FloatRef) this.f5319c;
                        dVar2 = (androidx.compose.ui.input.pointer.d) this.f5321e;
                        t0.n(obj);
                        pointerInputChange = (PointerInputChange) obj;
                        if (pointerInputChange != null) {
                            this.f5322f.invoke(b1.f.d(pointerInputChange.getPosition()));
                            this.f5323g.invoke(pointerInputChange, kotlin.coroutines.jvm.internal.a.e(floatRef.f124888b));
                            long id2 = pointerInputChange.getId();
                            final yh.p<PointerInputChange, Float, b2> pVar = this.f5323g;
                            yh.l<PointerInputChange, b2> lVar = new yh.l<PointerInputChange, b2>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.5.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                public final void a(@dl.d PointerInputChange it) {
                                    f0.p(it, "it");
                                    pVar.invoke(it, Float.valueOf(b1.f.p(androidx.compose.ui.input.pointer.q.k(it))));
                                    it.a();
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(PointerInputChange pointerInputChange2) {
                                    a(pointerInputChange2);
                                    return b2.f124493a;
                                }
                            };
                            this.f5321e = null;
                            this.f5319c = null;
                            this.f5320d = 3;
                            obj = DragGestureDetectorKt.A(dVar2, id2, lVar, this);
                            if (obj == objH) {
                                return objH;
                            }
                        }
                        return b2.f124493a;
                    }
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t0.n(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    this.f5324h.invoke();
                } else {
                    this.f5325i.invoke();
                }
                return b2.f124493a;
            }
            t0.n(obj);
            androidx.compose.ui.input.pointer.d dVar3 = (androidx.compose.ui.input.pointer.d) this.f5321e;
            this.f5321e = dVar3;
            this.f5320d = 1;
            Object objD = TapGestureDetectorKt.d(dVar3, false, this);
            if (objD == objH) {
                return objH;
            }
            dVar = dVar3;
            obj = objD;
            PointerInputChange pointerInputChange2 = (PointerInputChange) obj;
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            long id3 = pointerInputChange2.getId();
            int type = pointerInputChange2.getType();
            yh.p<PointerInputChange, Float, b2> pVar2 = new yh.p<PointerInputChange, Float, b2>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1$drag$1
                {
                    super(2);
                }

                public final void a(@dl.d PointerInputChange change, float f10) {
                    f0.p(change, "change");
                    change.a();
                    floatRef2.f124888b = f10;
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(PointerInputChange pointerInputChange3, Float f10) {
                    a(pointerInputChange3, f10.floatValue());
                    return b2.f124493a;
                }
            };
            this.f5321e = dVar;
            this.f5319c = floatRef2;
            this.f5320d = 2;
            obj = DragGestureDetectorKt.e(dVar, id3, type, pVar2, this);
            if (obj == objH) {
                return objH;
            }
            dVar2 = dVar;
            floatRef = floatRef2;
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null) {
                this.f5322f.invoke(b1.f.d(pointerInputChange.getPosition()));
                this.f5323g.invoke(pointerInputChange, kotlin.coroutines.jvm.internal.a.e(floatRef.f124888b));
                long id4 = pointerInputChange.getId();
                final yh.p<? super PointerInputChange, ? super Float, b2> pVar3 = this.f5323g;
                yh.l<PointerInputChange, b2> lVar2 = new yh.l<PointerInputChange, b2>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectHorizontalDragGestures.5.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void a(@dl.d PointerInputChange it) {
                        f0.p(it, "it");
                        pVar3.invoke(it, Float.valueOf(b1.f.p(androidx.compose.ui.input.pointer.q.k(it))));
                        it.a();
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(PointerInputChange pointerInputChange3) {
                        a(pointerInputChange3);
                        return b2.f124493a;
                    }
                };
                this.f5321e = null;
                this.f5319c = null;
                this.f5320d = 3;
                obj = DragGestureDetectorKt.A(dVar2, id4, lVar2, this);
                if (obj == objH) {
                    return objH;
                }
                if (((Boolean) obj).booleanValue()) {
                    this.f5324h.invoke();
                } else {
                    this.f5325i.invoke();
                }
            }
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DragGestureDetectorKt$detectHorizontalDragGestures$5(yh.l<? super b1.f, b2> lVar, yh.p<? super PointerInputChange, ? super Float, b2> pVar, yh.a<b2> aVar, yh.a<b2> aVar2, kotlin.coroutines.c<? super DragGestureDetectorKt$detectHorizontalDragGestures$5> cVar) {
        super(2, cVar);
        this.f5315d = lVar;
        this.f5316e = pVar;
        this.f5317f = aVar;
        this.f5318g = aVar2;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d i0 i0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((DragGestureDetectorKt$detectHorizontalDragGestures$5) create(i0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        DragGestureDetectorKt$detectHorizontalDragGestures$5 dragGestureDetectorKt$detectHorizontalDragGestures$5 = new DragGestureDetectorKt$detectHorizontalDragGestures$5(this.f5315d, this.f5316e, this.f5317f, this.f5318g, cVar);
        dragGestureDetectorKt$detectHorizontalDragGestures$5.f5314c = obj;
        return dragGestureDetectorKt$detectHorizontalDragGestures$5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f5313b;
        if (i10 == 0) {
            t0.n(obj);
            i0 i0Var = (i0) this.f5314c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f5315d, this.f5316e, this.f5317f, this.f5318g, null);
            this.f5313b = 1;
            if (i0Var.n1(anonymousClass1, this) == objH) {
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
