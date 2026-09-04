package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection", f = "WindowInsetsConnection.android.kt", i = {0, 0, 0, 1, 1, 1, 2, 2}, l = {304, bb.c.b.f30921s3, bb.c.b.R3}, m = "fling-huYlsQE", n = {"this", "available", "flingAmount", "this", "endVelocity", "available", "this", "available"}, s = {"L$0", "J$0", "F$0", "L$0", "L$1", "J$0", "L$0", "J$0"})
public final class WindowInsetsNestedScrollConnection$fling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f6210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f6211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f6212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f6213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f6214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ WindowInsetsNestedScrollConnection f6215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f6216h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowInsetsNestedScrollConnection$fling$1(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, kotlin.coroutines.c<? super WindowInsetsNestedScrollConnection$fling$1> cVar) {
        super(cVar);
        this.f6215g = windowInsetsNestedScrollConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f6214f = obj;
        this.f6216h |= Integer.MIN_VALUE;
        return this.f6215g.p(0L, 0.0f, false, this);
    }
}
