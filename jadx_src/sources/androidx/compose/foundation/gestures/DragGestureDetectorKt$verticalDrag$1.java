package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: DragGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0}, l = {bb.c.b.f30658ge}, m = "verticalDrag-jO51t88", n = {"onDrag", "$this$drag_u2dVnAYq1g$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
public final class DragGestureDetectorKt$verticalDrag$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f5356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f5357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f5358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f5359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f5360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f5361g;

    DragGestureDetectorKt$verticalDrag$1(kotlin.coroutines.c<? super DragGestureDetectorKt$verticalDrag$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f5360f = obj;
        this.f5361g |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.E(null, 0L, null, this);
    }
}
