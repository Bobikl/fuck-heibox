package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.SwipeableKt$PreUpPostDownNestedScrollConnection$1", f = "Swipeable.kt", i = {0}, l = {bb.c.b.Ld}, m = "onPreFling-QWom1Mo", n = {"available"}, s = {"J$0"})
public final class SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f11007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f11008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SwipeableKt$PreUpPostDownNestedScrollConnection$1 f11009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f11010e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1(SwipeableKt$PreUpPostDownNestedScrollConnection$1 swipeableKt$PreUpPostDownNestedScrollConnection$1, kotlin.coroutines.c<? super SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1> cVar) {
        super(cVar);
        this.f11009d = swipeableKt$PreUpPostDownNestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f11008c = obj;
        this.f11010e |= Integer.MIN_VALUE;
        return this.f11009d.d(0L, this);
    }
}
