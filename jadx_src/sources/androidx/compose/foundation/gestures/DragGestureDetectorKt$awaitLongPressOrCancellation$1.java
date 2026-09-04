package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: DragGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0}, l = {bb.c.b.Kc}, m = "awaitLongPressOrCancellation-rnUCldI", n = {"initialDown", "longPress"}, s = {"L$0", "L$1"})
public final class DragGestureDetectorKt$awaitLongPressOrCancellation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f5210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f5211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f5212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f5213e;

    DragGestureDetectorKt$awaitLongPressOrCancellation$1(kotlin.coroutines.c<? super DragGestureDetectorKt$awaitLongPressOrCancellation$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f5212d = obj;
        this.f5213e |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.g(null, 0L, this);
    }
}
