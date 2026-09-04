package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Channels.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {104}, m = "consumeEach", n = {"action", "$this$consume$iv"}, s = {"L$0", "L$1"})
public final class ChannelsKt__Channels_commonKt$consumeEach$1<E> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f128787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f128789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f128790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f128791f;

    ChannelsKt__Channels_commonKt$consumeEach$1(kotlin.coroutines.c<? super ChannelsKt__Channels_commonKt$consumeEach$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f128790e = obj;
        this.f128791f |= Integer.MIN_VALUE;
        return ChannelsKt__Channels_commonKt.e(null, null, this);
    }
}
