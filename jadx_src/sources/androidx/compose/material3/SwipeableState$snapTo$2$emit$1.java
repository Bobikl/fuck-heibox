package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.SwipeableState$snapTo$2", f = "Swipeable.kt", i = {0}, l = {316}, m = "emit", n = {"this"}, s = {"L$0"})
public final class SwipeableState$snapTo$2$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f11111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f11112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SwipeableState$snapTo$2 f11113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f11114e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeableState$snapTo$2$emit$1(SwipeableState$snapTo$2 swipeableState$snapTo$2, kotlin.coroutines.c<? super SwipeableState$snapTo$2$emit$1> cVar) {
        super(cVar);
        this.f11113d = swipeableState$snapTo$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f11112c = obj;
        this.f11114e |= Integer.MIN_VALUE;
        return this.f11113d.emit(null, this);
    }
}
