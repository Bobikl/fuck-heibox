package androidx.compose.foundation.gestures.snapping;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {}, l = {95, 97}, m = "performFling", n = {}, s = {})
public final class SnapFlingBehavior$performFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f5806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ SnapFlingBehavior f5807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f5808d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnapFlingBehavior$performFling$1(SnapFlingBehavior snapFlingBehavior, kotlin.coroutines.c<? super SnapFlingBehavior$performFling$1> cVar) {
        super(cVar);
        this.f5807c = snapFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f5806b = obj;
        this.f5808d |= Integer.MIN_VALUE;
        return this.f5807c.a(null, 0.0f, this);
    }
}
