package androidx.compose.ui.input.nestedscroll;

import dl.e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

/* JADX INFO: compiled from: NestedScrollModifierLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@d(c = "androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal", f = "NestedScrollModifierLocal.kt", i = {0, 0, 0, 1}, l = {94, 96}, m = "onPostFling-RZ2iAVY", n = {"this", "consumed", "available", "selfConsumed"}, s = {"L$0", "J$0", "J$1", "J$0"})
public final class NestedScrollModifierLocal$onPostFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f14642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f14643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f14644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f14645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ NestedScrollModifierLocal f14646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f14647g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NestedScrollModifierLocal$onPostFling$1(NestedScrollModifierLocal nestedScrollModifierLocal, kotlin.coroutines.c<? super NestedScrollModifierLocal$onPostFling$1> cVar) {
        super(cVar);
        this.f14646f = nestedScrollModifierLocal;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f14645e = obj;
        this.f14647g |= Integer.MIN_VALUE;
        return this.f14646f.a(0L, 0L, this);
    }
}
