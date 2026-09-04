package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4}, l = {421, bb.c.b.f30764l5, bb.c.b.f30810n5, bb.c.b.f30856p5, bb.c.b.f30989v5}, m = "onDragStopped-sF-c-tU", n = {"this", "availableVelocity", "this", "velocity", "this", "available", "this", "velocityLeft", "this"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0", "L$0", "J$0", "L$0"})
public final class ScrollingLogic$onDragStopped$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f5592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f5593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f5594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ ScrollingLogic f5595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f5596f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingLogic$onDragStopped$1(ScrollingLogic scrollingLogic, kotlin.coroutines.c<? super ScrollingLogic$onDragStopped$1> cVar) {
        super(cVar);
        this.f5595e = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f5594d = obj;
        this.f5596f |= Integer.MIN_VALUE;
        return this.f5595e.i(0L, this);
    }
}
