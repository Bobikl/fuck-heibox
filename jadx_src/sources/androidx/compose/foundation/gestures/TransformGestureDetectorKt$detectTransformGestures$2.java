package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.i0;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: TransformGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/i0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", f = "TransformGestureDetector.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
public final class TransformGestureDetectorKt$detectTransformGestures$2 extends SuspendLambda implements yh.p<i0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f5678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f5679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f5680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ yh.r<b1.f, b1.f, Float, Float, b2> f5681e;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: TransformGestureDetector.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/d;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2$1", f = "TransformGestureDetector.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {60, 62}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", androidx.constraintlayout.motion.widget.f.f18721i, "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$awaitPointerEventScope", androidx.constraintlayout.motion.widget.f.f18721i, "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom"}, s = {"L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1"})
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements yh.p<androidx.compose.ui.input.pointer.d, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f5682c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f5683d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f5684e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f5685f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f5686g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f5687h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f5688i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f5689j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f5690k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ yh.r<b1.f, b1.f, Float, Float, b2> f5691l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(boolean z10, yh.r<? super b1.f, ? super b1.f, ? super Float, ? super Float, b2> rVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f5690k = z10;
            this.f5691l = rVar;
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f5690k, this.f5691l, cVar);
            anonymousClass1.f5689j = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x009e  */
        /* JADX WARN: Code duplicated, block: B:23:0x00ac A[LOOP:0: B:19:0x009c->B:23:0x00ac, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:82:0x00af A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:83:0x00aa A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x008e -> B:18:0x0091). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r24) {
            /*
                Method dump skipped, instruction units count: 422
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TransformGestureDetectorKt$detectTransformGestures$2(boolean z10, yh.r<? super b1.f, ? super b1.f, ? super Float, ? super Float, b2> rVar, kotlin.coroutines.c<? super TransformGestureDetectorKt$detectTransformGestures$2> cVar) {
        super(2, cVar);
        this.f5680d = z10;
        this.f5681e = rVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d i0 i0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((TransformGestureDetectorKt$detectTransformGestures$2) create(i0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        TransformGestureDetectorKt$detectTransformGestures$2 transformGestureDetectorKt$detectTransformGestures$2 = new TransformGestureDetectorKt$detectTransformGestures$2(this.f5680d, this.f5681e, cVar);
        transformGestureDetectorKt$detectTransformGestures$2.f5679c = obj;
        return transformGestureDetectorKt$detectTransformGestures$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f5678b;
        if (i10 == 0) {
            t0.n(obj);
            i0 i0Var = (i0) this.f5679c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f5680d, this.f5681e, null);
            this.f5678b = 1;
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
