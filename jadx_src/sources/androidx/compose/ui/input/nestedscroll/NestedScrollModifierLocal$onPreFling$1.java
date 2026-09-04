package androidx.compose.ui.input.nestedscroll;

import dl.e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

/* JADX INFO: compiled from: NestedScrollModifierLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@d(c = "androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal", f = "NestedScrollModifierLocal.kt", i = {0, 0, 1}, l = {88, 89}, m = "onPreFling-QWom1Mo", n = {"this", "available", "parentPreConsumed"}, s = {"L$0", "J$0", "J$0"})
public final class NestedScrollModifierLocal$onPreFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f14648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f14649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f14650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ NestedScrollModifierLocal f14651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f14652f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NestedScrollModifierLocal$onPreFling$1(NestedScrollModifierLocal nestedScrollModifierLocal, kotlin.coroutines.c<? super NestedScrollModifierLocal$onPreFling$1> cVar) {
        super(cVar);
        this.f14651e = nestedScrollModifierLocal;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f14650d = obj;
        this.f14652f |= Integer.MIN_VALUE;
        return this.f14651e.d(0L, this);
    }
}
