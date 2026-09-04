package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: PausableMonotonicFrameClock.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", i = {0, 0}, l = {62, 63}, m = "withFrameNanos", n = {"this", "onFrame"}, s = {"L$0", "L$1"})
public final class PausableMonotonicFrameClock$withFrameNanos$1<R> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f12412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f12413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f12414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ PausableMonotonicFrameClock f12415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f12416f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PausableMonotonicFrameClock$withFrameNanos$1(PausableMonotonicFrameClock pausableMonotonicFrameClock, kotlin.coroutines.c<? super PausableMonotonicFrameClock$withFrameNanos$1> cVar) {
        super(cVar);
        this.f12415e = pausableMonotonicFrameClock;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f12414d = obj;
        this.f12416f |= Integer.MIN_VALUE;
        return this.f12415e.h0(null, this);
    }
}
