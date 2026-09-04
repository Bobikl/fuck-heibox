package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", i = {0}, l = {bb.c.b.E5}, m = "doFlingAnimation-QWom1Mo", n = {"result"}, s = {"L$0"})
public final class ScrollingLogic$doFlingAnimation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f5576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f5577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ScrollingLogic f5578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f5579e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingLogic$doFlingAnimation$1(ScrollingLogic scrollingLogic, kotlin.coroutines.c<? super ScrollingLogic$doFlingAnimation$1> cVar) {
        super(cVar);
        this.f5578d = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f5577c = obj;
        this.f5579e |= Integer.MIN_VALUE;
        return this.f5578d.b(0L, this);
    }
}
