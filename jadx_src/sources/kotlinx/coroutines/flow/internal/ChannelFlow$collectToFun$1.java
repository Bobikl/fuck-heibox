package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.channels.w;
import yh.p;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/channels/w;", "it", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
public final class ChannelFlow$collectToFun$1<T> extends SuspendLambda implements p<w<? super T>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f129944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f129945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ChannelFlow<T> f129946d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelFlow$collectToFun$1(ChannelFlow<T> channelFlow, kotlin.coroutines.c<? super ChannelFlow$collectToFun$1> cVar) {
        super(2, cVar);
        this.f129946d = channelFlow;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d w<? super T> wVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((ChannelFlow$collectToFun$1) create(wVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this.f129946d, cVar);
        channelFlow$collectToFun$1.f129945c = obj;
        return channelFlow$collectToFun$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f129944b;
        if (i10 == 0) {
            t0.n(obj);
            w<? super T> wVar = (w) this.f129945c;
            ChannelFlow<T> channelFlow = this.f129946d;
            this.f129944b = 1;
            if (channelFlow.i(wVar, this) == objH) {
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
