package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", i = {0}, l = {311}, m = "awaitScrollEvent", n = {"$this$awaitScrollEvent"}, s = {"L$0"})
public final class ScrollableKt$awaitScrollEvent$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f5527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f5528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f5529d;

    ScrollableKt$awaitScrollEvent$1(kotlin.coroutines.c<? super ScrollableKt$awaitScrollEvent$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f5528c = obj;
        this.f5529d |= Integer.MIN_VALUE;
        return ScrollableKt.e(null, this);
    }
}
