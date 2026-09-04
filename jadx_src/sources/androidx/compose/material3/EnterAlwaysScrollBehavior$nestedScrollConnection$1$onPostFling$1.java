package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1", f = "AppBar.kt", i = {0, 0}, l = {bb.c.b.Yo, bb.c.b.Zo}, m = "onPostFling-RZ2iAVY", n = {"this", "available"}, s = {"L$0", "J$0"})
public final class EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f9370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f9371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f9372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ EnterAlwaysScrollBehavior$nestedScrollConnection$1 f9373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f9374f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1(EnterAlwaysScrollBehavior$nestedScrollConnection$1 enterAlwaysScrollBehavior$nestedScrollConnection$1, kotlin.coroutines.c<? super EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1> cVar) {
        super(cVar);
        this.f9373e = enterAlwaysScrollBehavior$nestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f9372d = obj;
        this.f9374f |= Integer.MIN_VALUE;
        return this.f9373e.a(0L, 0L, this);
    }
}
