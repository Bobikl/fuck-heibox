package kotlinx.coroutines.flow;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.t0;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/q0;", "Lkotlinx/coroutines/flow/f;", "downstream", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", i = {0, 0, 0, 0}, l = {bb.c.b.O3}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", RemoteMessageConst.Notification.TICKER}, s = {"L$0", "L$1", "L$2", "L$3"})
public final class FlowKt__DelayKt$sample$2<T> extends SuspendLambda implements yh.q<q0, f<? super T>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f129345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f129346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f129347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f129348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f129349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f129350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ e<T> f129351h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__DelayKt$sample$2(long j10, e<? extends T> eVar, kotlin.coroutines.c<? super FlowKt__DelayKt$sample$2> cVar) {
        super(3, cVar);
        this.f129350g = j10;
        this.f129351h = eVar;
    }

    @Override // yh.q
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d q0 q0Var, @dl.d f<? super T> fVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        FlowKt__DelayKt$sample$2 flowKt__DelayKt$sample$2 = new FlowKt__DelayKt$sample$2(this.f129350g, this.f129351h, cVar);
        flowKt__DelayKt$sample$2.f129348e = q0Var;
        flowKt__DelayKt$sample$2.f129349f = fVar;
        return flowKt__DelayKt$sample$2.invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        f fVar;
        ReceiveChannel receiveChannel;
        Ref.ObjectRef objectRef;
        ReceiveChannel receiveChannelG;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f129347d;
        if (i10 == 0) {
            t0.n(obj);
            q0 q0Var = (q0) this.f129348e;
            f fVar2 = (f) this.f129349f;
            ReceiveChannel receiveChannelH = ProduceKt.h(q0Var, null, -1, new FlowKt__DelayKt$sample$2$values$1(this.f129351h, null), 1, null);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            fVar = fVar2;
            receiveChannel = receiveChannelH;
            objectRef = objectRef2;
            receiveChannelG = FlowKt__DelayKt.g(q0Var, this.f129350g, 0L, 2, null);
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            receiveChannelG = (ReceiveChannel) this.f129346c;
            objectRef = (Ref.ObjectRef) this.f129345b;
            receiveChannel = (ReceiveChannel) this.f129349f;
            fVar = (f) this.f129348e;
            t0.n(obj);
        }
        while (objectRef.f124891b != kotlinx.coroutines.flow.internal.l.f130084c) {
            this.f129348e = fVar;
            this.f129349f = receiveChannel;
            this.f129345b = objectRef;
            this.f129346c = receiveChannelG;
            this.f129347d = 1;
            SelectInstance selectInstance = new SelectInstance(this);
            try {
                selectInstance.h(receiveChannel.y(), new FlowKt__DelayKt$sample$2$1$1(objectRef, receiveChannelG, null));
                selectInstance.h(receiveChannelG.T(), new FlowKt__DelayKt$sample$2$1$2(objectRef, fVar, null));
            } catch (Throwable th2) {
                selectInstance.x0(th2);
            }
            Object objW0 = selectInstance.w0();
            if (objW0 == kotlin.coroutines.intrinsics.b.h()) {
                kotlin.coroutines.jvm.internal.f.c(this);
            }
            if (objW0 == objH) {
                return objH;
            }
        }
        return b2.f124493a;
    }
}
