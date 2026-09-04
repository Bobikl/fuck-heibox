package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: DragGestureDetectorCopy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.DragGestureDetectorCopyKt", f = "DragGestureDetectorCopy.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {144, 182}, m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", n = {"onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlop$iv", "totalPositionChange$iv", "onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "dragEvent$iv", "touchSlop$iv", "totalPositionChange$iv"}, s = {"L$0", "L$1", "L$2", "F$0", "F$1", "L$0", "L$1", "L$2", "L$3", "F$0", "F$1"})
public final class DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f9345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f9346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f9347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f9348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f9349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f9350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f9351h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f9352i;

    DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1(kotlin.coroutines.c<? super DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f9351h = obj;
        this.f9352i |= Integer.MIN_VALUE;
        return DragGestureDetectorCopyKt.a(null, 0L, 0, null, this);
    }
}
