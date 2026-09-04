package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1", f = "AppBar.kt", i = {0, 0}, l = {bb.c.b.Fq, bb.c.b.Gq}, m = "onPostFling-RZ2iAVY", n = {"this", "available"}, s = {"L$0", "J$0"})
public final class ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f9383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f9384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f9385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 f9386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f9387f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1(ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 exitUntilCollapsedScrollBehavior$nestedScrollConnection$1, kotlin.coroutines.c<? super ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1> cVar) {
        super(cVar);
        this.f9386e = exitUntilCollapsedScrollBehavior$nestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f9385d = obj;
        this.f9387f |= Integer.MIN_VALUE;
        return this.f9386e.a(0L, 0L, this);
    }
}
