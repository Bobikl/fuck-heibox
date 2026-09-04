package androidx.compose.foundation.gestures.snapping;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", i = {0, 0}, l = {bb.c.b.f30897r1}, m = "approach", n = {"snapLayoutInfoProvider", "density"}, s = {"L$0", "L$1"})
public final class SnapFlingBehaviorKt$approach$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f5825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f5826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f5827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f5828e;

    SnapFlingBehaviorKt$approach$1(kotlin.coroutines.c<? super SnapFlingBehaviorKt$approach$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f5827d = obj;
        this.f5828e |= Integer.MIN_VALUE;
        return SnapFlingBehaviorKt.i(null, 0.0f, 0.0f, null, null, null, this);
    }
}
