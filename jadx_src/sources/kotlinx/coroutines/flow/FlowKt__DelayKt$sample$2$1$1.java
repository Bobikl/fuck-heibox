package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.t0;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/channels/n;", "", "result", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FlowKt__DelayKt$sample$2$1$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.channels.n<? extends Object>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f129352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f129353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef<Object> f129354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ ReceiveChannel<b2> f129355e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__DelayKt$sample$2$1$1(Ref.ObjectRef<Object> objectRef, ReceiveChannel<b2> receiveChannel, kotlin.coroutines.c<? super FlowKt__DelayKt$sample$2$1$1> cVar) {
        super(2, cVar);
        this.f129354d = objectRef;
        this.f129355e = receiveChannel;
    }

    @dl.e
    public final Object a(@dl.d Object obj, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((FlowKt__DelayKt$sample$2$1$1) create(kotlinx.coroutines.channels.n.b(obj), cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = new FlowKt__DelayKt$sample$2$1$1(this.f129354d, this.f129355e, cVar);
        flowKt__DelayKt$sample$2$1$1.f129353c = obj;
        return flowKt__DelayKt$sample$2$1$1;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.channels.n<? extends Object> nVar, kotlin.coroutines.c<? super b2> cVar) {
        return a(nVar.getHolder(), cVar);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [T, kotlinx.coroutines.internal.o0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f129352b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        ?? holder = ((kotlinx.coroutines.channels.n) this.f129353c).getHolder();
        Ref.ObjectRef<Object> objectRef = this.f129354d;
        boolean z10 = holder instanceof kotlinx.coroutines.channels.n.c;
        if (!z10) {
            objectRef.f124891b = holder;
        }
        ReceiveChannel<b2> receiveChannel = this.f129355e;
        if (z10) {
            Throwable thF = kotlinx.coroutines.channels.n.f(holder);
            if (thF != null) {
                throw thF;
            }
            receiveChannel.e(new ChildCancelledException());
            objectRef.f124891b = kotlinx.coroutines.flow.internal.l.f130084c;
        }
        return b2.f124493a;
    }
}
