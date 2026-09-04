package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", i = {0, 0, 0, 1, 1, 1}, l = {51, 62}, m = "emitAllImpl$FlowKt__ChannelsKt", n = {"$this$emitAllImpl", "channel", "consume", "$this$emitAllImpl", "channel", "consume"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
public final class FlowKt__ChannelsKt$emitAllImpl$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f129284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f129285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f129286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f129287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f129288f;

    FlowKt__ChannelsKt$emitAllImpl$1(kotlin.coroutines.c<? super FlowKt__ChannelsKt$emitAllImpl$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f129287e = obj;
        this.f129288f |= Integer.MIN_VALUE;
        return FlowKt__ChannelsKt.e(null, null, false, this);
    }
}
