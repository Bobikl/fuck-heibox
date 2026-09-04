package androidx.compose.ui.input.nestedscroll;

import dl.e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

/* JADX INFO: compiled from: NestedScrollModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@d(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", i = {}, l = {202}, m = "dispatchPreFling-QWom1Mo", n = {}, s = {})
public final class NestedScrollDispatcher$dispatchPreFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f14631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ NestedScrollDispatcher f14632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f14633d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NestedScrollDispatcher$dispatchPreFling$1(NestedScrollDispatcher nestedScrollDispatcher, kotlin.coroutines.c<? super NestedScrollDispatcher$dispatchPreFling$1> cVar) {
        super(cVar);
        this.f14632c = nestedScrollDispatcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f14631b = obj;
        this.f14633d |= Integer.MIN_VALUE;
        return this.f14632c.c(0L, this);
    }
}
