package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: DragGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 176)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {bb.c.b.f30654ga, bb.c.b.Oa}, m = "awaitPointerSlopOrCancellation-wtdNQyU", n = {"$this$awaitPointerSlopOrCancellation_u2dwtdNQyU", "pointerDirectionConfig", "onPointerSlopReached", "pointer", "triggerOnMainAxisSlop", "touchSlop", "totalMainPositionChange", "totalCrossPositionChange", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU", "pointerDirectionConfig", "onPointerSlopReached", "pointer", "dragEvent", "triggerOnMainAxisSlop", "touchSlop", "totalMainPositionChange", "totalCrossPositionChange"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "F$0", "F$1", "F$2", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "F$0", "F$1", "F$2"})
public final class DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f5220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f5221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f5222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f5223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f5224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f5225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f5226h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f5227i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f5228j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    /* synthetic */ Object f5229k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f5230l;

    DragGestureDetectorKt$awaitPointerSlopOrCancellation$1(kotlin.coroutines.c<? super DragGestureDetectorKt$awaitPointerSlopOrCancellation$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f5229k = obj;
        this.f5230l |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.h(null, 0L, 0, null, false, null, this);
    }
}
