package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
public final class ChannelFlow$collect$2 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f129940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f129941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.flow.f<T> f129942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ ChannelFlow<T> f129943e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelFlow$collect$2(kotlinx.coroutines.flow.f<? super T> fVar, ChannelFlow<T> channelFlow, kotlin.coroutines.c<? super ChannelFlow$collect$2> cVar) {
        super(2, cVar);
        this.f129942d = fVar;
        this.f129943e = channelFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ChannelFlow$collect$2 channelFlow$collect$2 = new ChannelFlow$collect$2(this.f129942d, this.f129943e, cVar);
        channelFlow$collect$2.f129941c = obj;
        return channelFlow$collect$2;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((ChannelFlow$collect$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f129940b;
        if (i10 == 0) {
            t0.n(obj);
            q0 q0Var = (q0) this.f129941c;
            kotlinx.coroutines.flow.f<T> fVar = this.f129942d;
            ReceiveChannel receiveChannelN = this.f129943e.n(q0Var);
            this.f129940b = 1;
            if (kotlinx.coroutines.flow.g.l0(fVar, receiveChannelN, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
