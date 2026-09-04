package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.SnackbarHostState", f = "SnackbarHost.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {bb.c.b.W5, bb.c.b.Z5}, m = "showSnackbar", n = {"this", "visuals", "$this$withLock_u24default$iv", "this", "visuals", "$this$withLock_u24default$iv", "$completion$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
public final class SnackbarHostState$showSnackbar$2 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f10864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f10865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f10866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f10867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f10868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ SnackbarHostState f10869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f10870h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnackbarHostState$showSnackbar$2(SnackbarHostState snackbarHostState, kotlin.coroutines.c<? super SnackbarHostState$showSnackbar$2> cVar) {
        super(cVar);
        this.f10869g = snackbarHostState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f10868f = obj;
        this.f10870h |= Integer.MIN_VALUE;
        return this.f10869g.d(null, this);
    }
}
