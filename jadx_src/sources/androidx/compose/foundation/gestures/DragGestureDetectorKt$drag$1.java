package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: DragGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0}, l = {109}, m = "drag-jO51t88", n = {"$this$drag_u2djO51t88", "onDrag"}, s = {"L$0", "L$1"})
public final class DragGestureDetectorKt$drag$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f5346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f5347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f5348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f5349e;

    DragGestureDetectorKt$drag$1(kotlin.coroutines.c<? super DragGestureDetectorKt$drag$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f5348d = obj;
        this.f5349e |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.x(null, 0L, null, this);
    }
}
