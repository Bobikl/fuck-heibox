package androidx.paging.multicast;

import dl.e;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: SharedFlowProducer.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.multicast.SharedFlowProducer$start$1", f = "SharedFlowProducer.kt", i = {}, l = {75, 80, 80}, m = "invokeSuspend", n = {}, s = {})
public final class SharedFlowProducer$start$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f26552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f26553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SharedFlowProducer f26554d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedFlowProducer$start$1(SharedFlowProducer sharedFlowProducer, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f26554d = sharedFlowProducer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        f0.p(completion, "completion");
        return new SharedFlowProducer$start$1(this.f26554d, completion);
    }

    @Override // yh.p
    public final Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        return ((SharedFlowProducer$start$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.paging.multicast.SharedFlowProducer] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f26553c;
        int i11 = 3;
        try {
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        t0.n(obj);
                    } else {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th2 = (Throwable) this.f26552b;
                            try {
                                t0.n(obj);
                                throw th2;
                            } catch (ClosedSendChannelException unused) {
                                throw th2;
                            }
                        }
                        t0.n(obj);
                    }
                    return b2.f124493a;
                }
                t0.n(obj);
                d2 d2Var = this.f26554d.collectionJob;
                this.f26553c = 1;
                if (d2Var.g0(this) == objH) {
                    return objH;
                }
                p pVar = this.f26554d.f26541d;
                i11 = this.f26554d;
                ChannelManager.b.AbstractC0200b.C0201b c0201b = new ChannelManager.b.AbstractC0200b.C0201b(i11);
                this.f26553c = 2;
                if (pVar.invoke(c0201b, this) == objH) {
                    return objH;
                }
            } catch (ClosedSendChannelException unused2) {
            }
            return b2.f124493a;
        } catch (Throwable th3) {
            try {
                p pVar2 = this.f26554d.f26541d;
                ChannelManager.b.AbstractC0200b.C0201b c0201b2 = new ChannelManager.b.AbstractC0200b.C0201b(this.f26554d);
                this.f26552b = th3;
                this.f26553c = i11;
                if (pVar2.invoke(c0201b2, this) == objH) {
                    return objH;
                }
            } catch (ClosedSendChannelException unused3) {
            }
            throw th3;
        }
    }
}
