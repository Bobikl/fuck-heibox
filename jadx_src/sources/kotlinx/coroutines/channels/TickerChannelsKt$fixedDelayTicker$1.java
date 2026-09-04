package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: TickerChannels.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 1, 1, 2, 2}, l = {106, 108, 109}, m = "fixedDelayTicker", n = {"channel", "delayMillis", "channel", "delayMillis", "channel", "delayMillis"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
public final class TickerChannelsKt$fixedDelayTicker$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f129006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f129007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f129008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f129009e;

    TickerChannelsKt$fixedDelayTicker$1(kotlin.coroutines.c<? super TickerChannelsKt$fixedDelayTicker$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f129008d = obj;
        this.f129009e |= Integer.MIN_VALUE;
        return TickerChannelsKt.c(0L, 0L, null, this);
    }
}
