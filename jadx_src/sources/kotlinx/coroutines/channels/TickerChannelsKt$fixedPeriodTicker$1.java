package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: TickerChannels.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, l = {84, 88, 94, 96}, m = "fixedPeriodTicker", n = {"channel", "delayMillis", "deadline", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs"}, s = {"L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1"})
public final class TickerChannelsKt$fixedPeriodTicker$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f129010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f129011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f129012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f129013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f129014f;

    TickerChannelsKt$fixedPeriodTicker$1(kotlin.coroutines.c<? super TickerChannelsKt$fixedPeriodTicker$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f129013e = obj;
        this.f129014f |= Integer.MIN_VALUE;
        return TickerChannelsKt.d(0L, 0L, null, this);
    }
}
