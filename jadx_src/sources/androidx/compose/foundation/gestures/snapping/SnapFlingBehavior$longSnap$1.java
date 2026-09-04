package androidx.compose.foundation.gestures.snapping;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {0, 0}, l = {114, 116}, m = "longSnap", n = {"this", "$this$longSnap"}, s = {"L$0", "L$1"})
public final class SnapFlingBehavior$longSnap$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f5801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f5802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f5803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ SnapFlingBehavior f5804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f5805f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnapFlingBehavior$longSnap$1(SnapFlingBehavior snapFlingBehavior, kotlin.coroutines.c<? super SnapFlingBehavior$longSnap$1> cVar) {
        super(cVar);
        this.f5804e = snapFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f5803d = obj;
        this.f5805f |= Integer.MIN_VALUE;
        return this.f5804e.f(null, 0.0f, this);
    }
}
