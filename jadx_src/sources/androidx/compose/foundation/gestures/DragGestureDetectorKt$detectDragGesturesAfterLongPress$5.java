package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.i0;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;

/* JADX INFO: compiled from: DragGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/i0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", i = {}, l = {bb.c.b.D1}, m = "invokeSuspend", n = {}, s = {})
public final class DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 extends SuspendLambda implements yh.p<i0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f5297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f5298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ yh.a<b2> f5299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.l<b1.f, b2> f5300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ yh.a<b2> f5301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ yh.p<PointerInputChange, b1.f, b2> f5302g;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1, reason: invalid class name */
    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/d;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1", f = "DragGestureDetector.kt", i = {0, 1, 2}, l = {bb.c.b.E1, bb.c.b.F1, 244}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "$this$awaitPointerEventScope"}, s = {"L$0", "L$0", "L$0"})
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements yh.p<androidx.compose.ui.input.pointer.d, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f5303c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f5304d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ yh.l<b1.f, b2> f5305e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f5306f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f5307g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ yh.p<PointerInputChange, b1.f, b2> f5308h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(yh.l<? super b1.f, b2> lVar, yh.a<b2> aVar, yh.a<b2> aVar2, yh.p<? super PointerInputChange, ? super b1.f, b2> pVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f5305e = lVar;
            this.f5306f = aVar;
            this.f5307g = aVar2;
            this.f5308h = pVar;
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f5305e, this.f5306f, this.f5307g, this.f5308h, cVar);
            anonymousClass1.f5304d = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x005a  */
        /* JADX WARN: Code duplicated, block: B:22:0x007c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x007d  */
        /* JADX WARN: Code duplicated, block: B:26:0x0086  */
        /* JADX WARN: Code duplicated, block: B:28:0x0094  */
        /* JADX WARN: Code duplicated, block: B:30:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:33:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:38:0x00a3 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            androidx.compose.ui.input.pointer.d dVar;
            PointerInputChange pointerInputChange;
            androidx.compose.ui.input.pointer.d dVar2;
            List<PointerInputChange> listE;
            int size;
            PointerInputChange pointerInputChange2;
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f5303c;
            if (i10 != 0) {
                if (i10 == 1) {
                    dVar = (androidx.compose.ui.input.pointer.d) this.f5304d;
                    t0.n(obj);
                } else {
                    if (i10 == 2) {
                        dVar = (androidx.compose.ui.input.pointer.d) this.f5304d;
                        t0.n(obj);
                        pointerInputChange = (PointerInputChange) obj;
                        if (pointerInputChange != null) {
                            this.f5305e.invoke(b1.f.d(pointerInputChange.getPosition()));
                            long id2 = pointerInputChange.getId();
                            final yh.p<PointerInputChange, b1.f, b2> pVar = this.f5308h;
                            yh.l<PointerInputChange, b2> lVar = new yh.l<PointerInputChange, b2>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.5.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                public final void a(@dl.d PointerInputChange it) {
                                    f0.p(it, "it");
                                    pVar.invoke(it, b1.f.d(androidx.compose.ui.input.pointer.q.k(it)));
                                    it.a();
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(PointerInputChange pointerInputChange3) {
                                    a(pointerInputChange3);
                                    return b2.f124493a;
                                }
                            };
                            this.f5304d = dVar;
                            this.f5303c = 3;
                            obj = DragGestureDetectorKt.x(dVar, id2, lVar, this);
                            if (obj == objH) {
                                return objH;
                            }
                            dVar2 = dVar;
                        }
                        return b2.f124493a;
                    }
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar2 = (androidx.compose.ui.input.pointer.d) this.f5304d;
                    t0.n(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    listE = dVar2.s1().e();
                    size = listE.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        pointerInputChange2 = listE.get(i11);
                        if (androidx.compose.ui.input.pointer.q.d(pointerInputChange2)) {
                            pointerInputChange2.a();
                        }
                    }
                    this.f5306f.invoke();
                } else {
                    this.f5307g.invoke();
                }
                return b2.f124493a;
            }
            t0.n(obj);
            dVar = (androidx.compose.ui.input.pointer.d) this.f5304d;
            this.f5304d = dVar;
            this.f5303c = 1;
            obj = TapGestureDetectorKt.d(dVar, false, this);
            if (obj == objH) {
                return objH;
            }
            long id3 = ((PointerInputChange) obj).getId();
            this.f5304d = dVar;
            this.f5303c = 2;
            obj = DragGestureDetectorKt.g(dVar, id3, this);
            if (obj == objH) {
                return objH;
            }
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null) {
                this.f5305e.invoke(b1.f.d(pointerInputChange.getPosition()));
                long id4 = pointerInputChange.getId();
                final yh.p<? super PointerInputChange, ? super b1.f, b2> pVar2 = this.f5308h;
                yh.l<PointerInputChange, b2> lVar2 = new yh.l<PointerInputChange, b2>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGesturesAfterLongPress.5.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void a(@dl.d PointerInputChange it) {
                        f0.p(it, "it");
                        pVar2.invoke(it, b1.f.d(androidx.compose.ui.input.pointer.q.k(it)));
                        it.a();
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(PointerInputChange pointerInputChange3) {
                        a(pointerInputChange3);
                        return b2.f124493a;
                    }
                };
                this.f5304d = dVar;
                this.f5303c = 3;
                obj = DragGestureDetectorKt.x(dVar, id4, lVar2, this);
                if (obj == objH) {
                    return objH;
                }
                dVar2 = dVar;
                if (((Boolean) obj).booleanValue()) {
                    listE = dVar2.s1().e();
                    size = listE.size();
                    while (i11 < size) {
                        pointerInputChange2 = listE.get(i11);
                        if (androidx.compose.ui.input.pointer.q.d(pointerInputChange2)) {
                            pointerInputChange2.a();
                        }
                    }
                    this.f5306f.invoke();
                } else {
                    this.f5307g.invoke();
                }
            }
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(yh.a<b2> aVar, yh.l<? super b1.f, b2> lVar, yh.a<b2> aVar2, yh.p<? super PointerInputChange, ? super b1.f, b2> pVar, kotlin.coroutines.c<? super DragGestureDetectorKt$detectDragGesturesAfterLongPress$5> cVar) {
        super(2, cVar);
        this.f5299d = aVar;
        this.f5300e = lVar;
        this.f5301f = aVar2;
        this.f5302g = pVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d i0 i0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((DragGestureDetectorKt$detectDragGesturesAfterLongPress$5) create(i0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 dragGestureDetectorKt$detectDragGesturesAfterLongPress$5 = new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(this.f5299d, this.f5300e, this.f5301f, this.f5302g, cVar);
        dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.f5298c = obj;
        return dragGestureDetectorKt$detectDragGesturesAfterLongPress$5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f5297b;
        try {
            if (i10 == 0) {
                t0.n(obj);
                i0 i0Var = (i0) this.f5298c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f5300e, this.f5301f, this.f5299d, this.f5302g, null);
                this.f5297b = 1;
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
        } catch (CancellationException e10) {
            this.f5299d.invoke();
            throw e10;
        }
    }
}
