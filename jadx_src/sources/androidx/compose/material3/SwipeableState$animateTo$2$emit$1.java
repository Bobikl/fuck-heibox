package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.SwipeableState$animateTo$2", f = "Swipeable.kt", i = {0, 0}, l = {bb.c.b.f31031x3}, m = "emit", n = {"this", "anchors"}, s = {"L$0", "L$1"})
public final class SwipeableState$animateTo$2$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f11092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f11093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f11094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ SwipeableState$animateTo$2 f11095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f11096f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeableState$animateTo$2$emit$1(SwipeableState$animateTo$2 swipeableState$animateTo$2, kotlin.coroutines.c<? super SwipeableState$animateTo$2$emit$1> cVar) {
        super(cVar);
        this.f11095e = swipeableState$animateTo$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f11094d = obj;
        this.f11096f |= Integer.MIN_VALUE;
        return this.f11095e.emit(null, this);
    }
}
