package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.DraggableKt", f = "Draggable.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {313, bb.c.b.f30739k3, bb.c.b.O5, 506}, m = "awaitDownAndSlop", n = {"$this$awaitDownAndSlop", "canDrag", "startDragImmediately", "velocityTracker", "orientation", "$this$awaitDownAndSlop", "velocityTracker", "orientation", "initialDelta", "postPointerSlop", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv", "pointerDirectionConfig$iv", "pointer$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv", "initialDelta", "postPointerSlop", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv", "pointerDirectionConfig$iv", "pointer$iv", "dragEvent$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "F$0", "F$1", "F$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "F$0", "F$1", "F$2"})
public final class DraggableKt$awaitDownAndSlop$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f5384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f5385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f5386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f5387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f5388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Object f5389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f5390h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f5391i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f5392j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    float f5393k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    /* synthetic */ Object f5394l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f5395m;

    DraggableKt$awaitDownAndSlop$1(kotlin.coroutines.c<? super DraggableKt$awaitDownAndSlop$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f5394l = obj;
        this.f5395m |= Integer.MIN_VALUE;
        return DraggableKt.f(null, null, null, null, null, this);
    }
}
