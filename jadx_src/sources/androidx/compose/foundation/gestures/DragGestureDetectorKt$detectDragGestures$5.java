package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.i0;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: DragGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/i0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5", f = "DragGestureDetector.kt", i = {}, l = {176}, m = "invokeSuspend", n = {}, s = {})
public final class DragGestureDetectorKt$detectDragGestures$5 extends SuspendLambda implements yh.p<i0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f5271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f5272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ yh.l<b1.f, b2> f5273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.p<PointerInputChange, b1.f, b2> f5274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ yh.a<b2> f5275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ yh.a<b2> f5276g;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$1, reason: invalid class name */
    /* JADX INFO: compiled from: DragGestureDetector.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/d;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$1", f = "DragGestureDetector.kt", i = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {177, bb.c.b.f30842oe, bb.c.b.f30797mf, 194}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "down", "overSlop", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv", "pointerDirectionConfig$iv", "pointer$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv", "$this$awaitPointerEventScope", "down", "overSlop", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv", "pointerDirectionConfig$iv", "pointer$iv", "dragEvent$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "F$0", "F$1", "F$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "F$0", "F$1", "F$2"})
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements yh.p<androidx.compose.ui.input.pointer.d, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f5277c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f5278d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f5279e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f5280f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f5281g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f5282h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f5283i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f5284j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f5285k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f5286l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f5287m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private /* synthetic */ Object f5288n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ yh.l<b1.f, b2> f5289o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ yh.p<PointerInputChange, b1.f, b2> f5290p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f5291q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ yh.a<b2> f5292r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(yh.l<? super b1.f, b2> lVar, yh.p<? super PointerInputChange, ? super b1.f, b2> pVar, yh.a<b2> aVar, yh.a<b2> aVar2, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f5289o = lVar;
            this.f5290p = pVar;
            this.f5291q = aVar;
            this.f5292r = aVar2;
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f5289o, this.f5290p, this.f5291q, this.f5292r, cVar);
            anonymousClass1.f5288n = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0121  */
        /* JADX WARN: Code duplicated, block: B:30:0x013e A[LOOP:0: B:26:0x011f->B:30:0x013e, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:92:0x014f A[EDGE_INSN: B:92:0x014f->B:32:0x014f BREAK  A[LOOP:0: B:26:0x011f->B:30:0x013e], SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00d8 -> B:74:0x024d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0155 -> B:65:0x020b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01f4 -> B:62:0x0201). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0247 -> B:74:0x024d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 698
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DragGestureDetectorKt$detectDragGestures$5(yh.l<? super b1.f, b2> lVar, yh.p<? super PointerInputChange, ? super b1.f, b2> pVar, yh.a<b2> aVar, yh.a<b2> aVar2, kotlin.coroutines.c<? super DragGestureDetectorKt$detectDragGestures$5> cVar) {
        super(2, cVar);
        this.f5273d = lVar;
        this.f5274e = pVar;
        this.f5275f = aVar;
        this.f5276g = aVar2;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d i0 i0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((DragGestureDetectorKt$detectDragGestures$5) create(i0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        DragGestureDetectorKt$detectDragGestures$5 dragGestureDetectorKt$detectDragGestures$5 = new DragGestureDetectorKt$detectDragGestures$5(this.f5273d, this.f5274e, this.f5275f, this.f5276g, cVar);
        dragGestureDetectorKt$detectDragGestures$5.f5272c = obj;
        return dragGestureDetectorKt$detectDragGestures$5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f5271b;
        if (i10 == 0) {
            t0.n(obj);
            i0 i0Var = (i0) this.f5272c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f5273d, this.f5274e, this.f5275f, this.f5276g, null);
            this.f5271b = 1;
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
