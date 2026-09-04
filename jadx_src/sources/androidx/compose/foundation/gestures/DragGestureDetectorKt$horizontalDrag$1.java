package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: DragGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0}, l = {bb.c.b.f30658ge}, m = "horizontalDrag-jO51t88", n = {"onDrag", "$this$drag_u2dVnAYq1g$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
public final class DragGestureDetectorKt$horizontalDrag$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f5350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f5351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f5352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f5353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f5354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f5355g;

    DragGestureDetectorKt$horizontalDrag$1(kotlin.coroutines.c<? super DragGestureDetectorKt$horizontalDrag$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f5354f = obj;
        this.f5355g |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.A(null, 0L, null, this);
    }
}
