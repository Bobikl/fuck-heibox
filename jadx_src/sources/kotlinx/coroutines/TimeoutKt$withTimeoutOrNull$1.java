package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", i = {0, 0, 0}, l = {100}, m = "withTimeoutOrNull", n = {"block", "coroutine", "timeMillis"}, s = {"L$0", "L$1", "J$0"})
public final class TimeoutKt$withTimeoutOrNull$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f128712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f128714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f128715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f128716f;

    TimeoutKt$withTimeoutOrNull$1(kotlin.coroutines.c<? super TimeoutKt$withTimeoutOrNull$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f128715e = obj;
        this.f128716f |= Integer.MIN_VALUE;
        return TimeoutKt.e(0L, null, this);
    }
}
