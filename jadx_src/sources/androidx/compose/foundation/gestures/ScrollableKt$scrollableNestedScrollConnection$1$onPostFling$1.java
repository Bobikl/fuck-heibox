package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1", f = "Scrollable.kt", i = {0, 0}, l = {bb.c.b.f30812n7}, m = "onPostFling-RZ2iAVY", n = {"this", "available"}, s = {"L$0", "J$0"})
public final class ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f5563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f5564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f5565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ ScrollableKt$scrollableNestedScrollConnection$1 f5566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f5567f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1(ScrollableKt$scrollableNestedScrollConnection$1 scrollableKt$scrollableNestedScrollConnection$1, kotlin.coroutines.c<? super ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1> cVar) {
        super(cVar);
        this.f5566e = scrollableKt$scrollableNestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f5565d = obj;
        this.f5567f |= Integer.MIN_VALUE;
        return this.f5566e.a(0L, 0L, this);
    }
}
