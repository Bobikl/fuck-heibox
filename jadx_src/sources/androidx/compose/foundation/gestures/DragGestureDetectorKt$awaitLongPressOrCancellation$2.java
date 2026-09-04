package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.core.app.o0;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: DragGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/d;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", i = {0, 0, 1, 1, 1}, l = {bb.c.b.Nc, bb.c.b.f30611ed}, m = "invokeSuspend", n = {"$this$withTimeout", "finished", "$this$withTimeout", o0.I0, "finished"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
public final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends RestrictedSuspendLambda implements yh.p<androidx.compose.ui.input.pointer.d, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f5214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f5215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f5216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f5217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef<PointerInputChange> f5218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef<PointerInputChange> f5219h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragGestureDetectorKt$awaitLongPressOrCancellation$2(Ref.ObjectRef<PointerInputChange> objectRef, Ref.ObjectRef<PointerInputChange> objectRef2, kotlin.coroutines.c<? super DragGestureDetectorKt$awaitLongPressOrCancellation$2> cVar) {
        super(2, cVar);
        this.f5218g = objectRef;
        this.f5219h = objectRef2;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d androidx.compose.ui.input.pointer.d dVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) create(dVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(this.f5218g, this.f5219h, cVar);
        dragGestureDetectorKt$awaitLongPressOrCancellation$2.f5217f = obj;
        return dragGestureDetectorKt$awaitLongPressOrCancellation$2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0068  */
    /* JADX WARN: Code duplicated, block: B:21:0x0076 A[LOOP:2: B:17:0x0066->B:21:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [T, androidx.compose.ui.input.pointer.y] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00c3 -> B:44:0x00c5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
