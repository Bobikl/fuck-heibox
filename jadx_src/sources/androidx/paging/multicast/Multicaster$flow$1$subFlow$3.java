package androidx.paging.multicast;

import dl.e;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.channels.k;
import kotlinx.coroutines.flow.f;
import yh.q;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Multicaster.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/f;", "", "it", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.multicast.Multicaster$flow$1$subFlow$3", f = "Multicaster.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
public final class Multicaster$flow$1$subFlow$3<T> extends SuspendLambda implements q<f<? super T>, Throwable, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f26535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Multicaster$flow$1 f26536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ k f26537d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Multicaster$flow$1$subFlow$3(Multicaster$flow$1 multicaster$flow$1, k kVar, kotlin.coroutines.c cVar) {
        super(3, cVar);
        this.f26536c = multicaster$flow$1;
        this.f26537d = kVar;
    }

    @dl.d
    public final kotlin.coroutines.c<b2> a(@dl.d f<? super T> create, @e Throwable th2, @dl.d kotlin.coroutines.c<? super b2> continuation) {
        f0.p(create, "$this$create");
        f0.p(continuation, "continuation");
        return new Multicaster$flow$1$subFlow$3(this.f26536c, this.f26537d, continuation);
    }

    @Override // yh.q
    public final Object invoke(Object obj, Throwable th2, kotlin.coroutines.c<? super b2> cVar) {
        return ((Multicaster$flow$1$subFlow$3) a((f) obj, th2, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f26535b;
        if (i10 == 0) {
            t0.n(obj);
            ChannelManager channelManagerH = this.f26536c.f26522d.h();
            k kVar = this.f26537d;
            this.f26535b = 1;
            if (channelManagerH.i(kVar, this) == objH) {
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
