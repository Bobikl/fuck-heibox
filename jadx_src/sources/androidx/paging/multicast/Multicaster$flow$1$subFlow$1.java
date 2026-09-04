package androidx.paging.multicast;

import dl.e;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.channels.k;
import kotlinx.coroutines.flow.f;
import yh.p;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Multicaster.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/f;", "Landroidx/paging/multicast/ChannelManager$b$b$c;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.multicast.Multicaster$flow$1$subFlow$1", f = "Multicaster.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
public final class Multicaster$flow$1$subFlow$1<T> extends SuspendLambda implements p<f<? super ChannelManager.b.AbstractC0200b.c<T>>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f26532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Multicaster$flow$1 f26533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ k f26534d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Multicaster$flow$1$subFlow$1(Multicaster$flow$1 multicaster$flow$1, k kVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f26533c = multicaster$flow$1;
        this.f26534d = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        f0.p(completion, "completion");
        return new Multicaster$flow$1$subFlow$1(this.f26533c, this.f26534d, completion);
    }

    @Override // yh.p
    public final Object invoke(Object obj, kotlin.coroutines.c<? super b2> cVar) {
        return ((Multicaster$flow$1$subFlow$1) create(obj, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f26532b;
        if (i10 == 0) {
            t0.n(obj);
            ChannelManager channelManagerH = this.f26533c.f26522d.h();
            k kVar = this.f26534d;
            this.f26532b = 1;
            if (channelManagerH.g(kVar, this) == objH) {
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
