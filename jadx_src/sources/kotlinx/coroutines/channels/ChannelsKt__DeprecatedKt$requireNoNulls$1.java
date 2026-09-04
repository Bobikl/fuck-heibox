package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u008a@"}, d2 = {"", androidx.exifinterface.media.a.S4, "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ChannelsKt__DeprecatedKt$requireNoNulls$1 extends SuspendLambda implements yh.p<Object, kotlin.coroutines.c<Object>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f128940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f128941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ReceiveChannel<Object> f128942d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__DeprecatedKt$requireNoNulls$1(ReceiveChannel<Object> receiveChannel, kotlin.coroutines.c<? super ChannelsKt__DeprecatedKt$requireNoNulls$1> cVar) {
        super(2, cVar);
        this.f128942d = receiveChannel;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.e Object obj, @dl.e kotlin.coroutines.c<Object> cVar) {
        return ((ChannelsKt__DeprecatedKt$requireNoNulls$1) create(obj, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ChannelsKt__DeprecatedKt$requireNoNulls$1 channelsKt__DeprecatedKt$requireNoNulls$1 = new ChannelsKt__DeprecatedKt$requireNoNulls$1(this.f128942d, cVar);
        channelsKt__DeprecatedKt$requireNoNulls$1.f128941c = obj;
        return channelsKt__DeprecatedKt$requireNoNulls$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f128940b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        Object obj2 = this.f128941c;
        if (obj2 != null) {
            return obj2;
        }
        throw new IllegalArgumentException("null element found in " + this.f128942d + lg.a.f131414g);
    }
}
