package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: DragGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {bb.c.b.f30842oe, bb.c.b.f30797mf}, m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", n = {"onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv", "pointer$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv", "onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv", "pointer$iv", "dragEvent$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv"}, s = {"L$0", "L$2", "L$3", "I$0", "F$0", "F$1", "F$2", "L$0", "L$2", "L$3", "L$4", "I$0", "F$0", "F$1", "F$2"})
public final class DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f5188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f5189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f5190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f5191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f5192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f5193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f5194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f5195i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f5196j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    /* synthetic */ Object f5197k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f5198l;

    DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1(kotlin.coroutines.c<? super DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f5197k = obj;
        this.f5198l |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.e(null, 0L, 0, null, this);
    }
}
