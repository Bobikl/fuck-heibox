package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: TapGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0, 1}, l = {bb.c.b.f30830o2, bb.c.b.D2}, m = "waitForUpOrCancellation", n = {"$this$waitForUpOrCancellation", "$this$waitForUpOrCancellation"}, s = {"L$0", "L$0"})
public final class TapGestureDetectorKt$waitForUpOrCancellation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f5675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f5676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f5677d;

    TapGestureDetectorKt$waitForUpOrCancellation$1(kotlin.coroutines.c<? super TapGestureDetectorKt$waitForUpOrCancellation$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f5676c = obj;
        this.f5677d |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.m(null, this);
    }
}
