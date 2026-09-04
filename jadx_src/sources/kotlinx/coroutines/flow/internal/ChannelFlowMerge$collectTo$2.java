package kotlinx.coroutines.flow.internal;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.channels.w;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.g2;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/e;", ak.au, "Lkotlin/b2;", ak.av, "(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
public final class ChannelFlowMerge$collectTo$2<T> implements kotlinx.coroutines.flow.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ d2 f129949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.sync.d f129950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ w<T> f129951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ m<T> f129952e;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: Merge.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f129953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.e<T> f129954c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ m<T> f129955d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.sync.d f129956e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlinx.coroutines.flow.e<? extends T> eVar, m<T> mVar, kotlinx.coroutines.sync.d dVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f129954c = eVar;
            this.f129955d = mVar;
            this.f129956e = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.f129954c, this.f129955d, this.f129956e, cVar);
        }

        @Override // yh.p
        @dl.e
        public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f129953b;
            try {
                if (i10 == 0) {
                    t0.n(obj);
                    kotlinx.coroutines.flow.e<T> eVar = this.f129954c;
                    m<T> mVar = this.f129955d;
                    this.f129953b = 1;
                    if (eVar.a(mVar, this) == objH) {
                        return objH;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t0.n(obj);
                }
                this.f129956e.release();
                return b2.f124493a;
            } catch (Throwable th2) {
                this.f129956e.release();
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    ChannelFlowMerge$collectTo$2(d2 d2Var, kotlinx.coroutines.sync.d dVar, w<? super T> wVar, m<T> mVar) {
        this.f129949b = d2Var;
        this.f129950c = dVar;
        this.f129951d = wVar;
        this.f129952e = mVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.f
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object emit(@dl.d kotlinx.coroutines.flow.e<? extends T> eVar, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        ChannelFlowMerge$collectTo$2$emit$1 channelFlowMerge$collectTo$2$emit$1;
        ChannelFlowMerge$collectTo$2<T> channelFlowMerge$collectTo$2;
        if (cVar instanceof ChannelFlowMerge$collectTo$2$emit$1) {
            channelFlowMerge$collectTo$2$emit$1 = (ChannelFlowMerge$collectTo$2$emit$1) cVar;
            int i10 = channelFlowMerge$collectTo$2$emit$1.f129961f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                channelFlowMerge$collectTo$2$emit$1.f129961f = i10 - Integer.MIN_VALUE;
            } else {
                channelFlowMerge$collectTo$2$emit$1 = new ChannelFlowMerge$collectTo$2$emit$1(this, cVar);
            }
        } else {
            channelFlowMerge$collectTo$2$emit$1 = new ChannelFlowMerge$collectTo$2$emit$1(this, cVar);
        }
        Object obj = channelFlowMerge$collectTo$2$emit$1.f129959d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = channelFlowMerge$collectTo$2$emit$1.f129961f;
        if (i11 == 0) {
            t0.n(obj);
            d2 d2Var = this.f129949b;
            if (d2Var != null) {
                g2.A(d2Var);
            }
            kotlinx.coroutines.sync.d dVar = this.f129950c;
            channelFlowMerge$collectTo$2$emit$1.f129957b = this;
            channelFlowMerge$collectTo$2$emit$1.f129958c = eVar;
            channelFlowMerge$collectTo$2$emit$1.f129961f = 1;
            if (dVar.c(channelFlowMerge$collectTo$2$emit$1) == objH) {
                return objH;
            }
            channelFlowMerge$collectTo$2 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = (kotlinx.coroutines.flow.e) channelFlowMerge$collectTo$2$emit$1.f129958c;
            channelFlowMerge$collectTo$2 = (ChannelFlowMerge$collectTo$2) channelFlowMerge$collectTo$2$emit$1.f129957b;
            t0.n(obj);
        }
        kotlinx.coroutines.k.f(channelFlowMerge$collectTo$2.f129951d, null, null, new AnonymousClass1(eVar, channelFlowMerge$collectTo$2.f129952e, channelFlowMerge$collectTo$2.f129950c, null), 3, null);
        return b2.f124493a;
    }
}
