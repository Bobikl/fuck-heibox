package androidx.paging.multicast;

import dl.e;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.q0;
import yh.p;
import yh.q;

/* JADX INFO: compiled from: SharedFlowProducer.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.multicast.SharedFlowProducer$collectionJob$1", f = "SharedFlowProducer.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
public final class SharedFlowProducer$collectionJob$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f26542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ SharedFlowProducer f26543c;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.paging.multicast.SharedFlowProducer$collectionJob$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SharedFlowProducer.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/f;", "", "it", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.multicast.SharedFlowProducer$collectionJob$1$1", f = "SharedFlowProducer.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1<T> extends SuspendLambda implements q<f<? super T>, Throwable, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f26544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f26545c;

        AnonymousClass1(kotlin.coroutines.c cVar) {
            super(3, cVar);
        }

        @dl.d
        public final kotlin.coroutines.c<b2> a(@dl.d f<? super T> create, @dl.d Throwable it, @dl.d kotlin.coroutines.c<? super b2> continuation) {
            f0.p(create, "$this$create");
            f0.p(it, "it");
            f0.p(continuation, "continuation");
            AnonymousClass1 anonymousClass1 = SharedFlowProducer$collectionJob$1.this.new AnonymousClass1(continuation);
            anonymousClass1.f26544b = it;
            return anonymousClass1;
        }

        @Override // yh.q
        public final Object invoke(Object obj, Throwable th2, kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) a((f) obj, th2, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f26545c;
            if (i10 == 0) {
                t0.n(obj);
                Throwable th2 = (Throwable) this.f26544b;
                p pVar = SharedFlowProducer$collectionJob$1.this.f26543c.f26541d;
                ChannelManager.b.AbstractC0200b.a aVar = new ChannelManager.b.AbstractC0200b.a(th2);
                this.f26545c = 1;
                if (pVar.invoke(aVar, this) == objH) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedFlowProducer$collectionJob$1(SharedFlowProducer sharedFlowProducer, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f26543c = sharedFlowProducer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        f0.p(completion, "completion");
        return new SharedFlowProducer$collectionJob$1(this.f26543c, completion);
    }

    @Override // yh.p
    public final Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        return ((SharedFlowProducer$collectionJob$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f26542b;
        try {
            if (i10 == 0) {
                t0.n(obj);
                kotlinx.coroutines.flow.e eVarU = g.u(this.f26543c.src, new AnonymousClass1(null));
                SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1 sharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1 = new SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1(this);
                this.f26542b = 1;
                if (eVarU.a(sharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
        } catch (ClosedSendChannelException unused) {
        }
        return b2.f124493a;
    }
}
