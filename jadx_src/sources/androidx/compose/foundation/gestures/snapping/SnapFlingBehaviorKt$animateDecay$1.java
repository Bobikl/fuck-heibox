package androidx.compose.foundation.gestures.snapping;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", i = {0}, l = {301}, m = "animateDecay", n = {"animationState"}, s = {"L$0"})
public final class SnapFlingBehaviorKt$animateDecay$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f5812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f5813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f5814d;

    SnapFlingBehaviorKt$animateDecay$1(kotlin.coroutines.c<? super SnapFlingBehaviorKt$animateDecay$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f5813c = obj;
        this.f5814d |= Integer.MIN_VALUE;
        return SnapFlingBehaviorKt.f(null, 0.0f, null, null, this);
    }
}
