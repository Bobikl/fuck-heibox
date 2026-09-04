package androidx.paging.multicast;

import com.taobao.accs.utl.BaseMonitor;
import dl.e;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.t0;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.y;
import yh.p;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Collect.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
public final class SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1<T> implements f<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ SharedFlowProducer$collectionJob$1 f26547b;

    /* JADX INFO: renamed from: androidx.paging.multicast.SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "value", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "continuation", "", "kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3$emit$1", "emit"}, k = 3, mv = {1, 4, 2})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.multicast.SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1", f = "SharedFlowProducer.kt", i = {0}, l = {135, 141}, m = "emit", n = {BaseMonitor.COUNT_ACK}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f26548b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f26549c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f26551e;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@dl.d Object obj) {
            this.f26548b = obj;
            this.f26549c |= Integer.MIN_VALUE;
            return SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1.this.emit(null, this);
        }
    }

    public SharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1(SharedFlowProducer$collectionJob$1 sharedFlowProducer$collectionJob$1) {
        this.f26547b = sharedFlowProducer$collectionJob$1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.f
    @e
    public Object emit(Object obj, @dl.d kotlin.coroutines.c cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        y yVar;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.f26549c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.f26549c = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj2 = anonymousClass1.f26548b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = anonymousClass1.f26549c;
        if (i11 != 0) {
            if (i11 == 1) {
                yVar = (y) anonymousClass1.f26551e;
                t0.n(obj2);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj2);
            }
            return b2.f124493a;
        }
        t0.n(obj2);
        y yVarC = a0.c(null, 1, null);
        p pVar = this.f26547b.f26543c.f26541d;
        ChannelManager.b.AbstractC0200b.c cVar2 = new ChannelManager.b.AbstractC0200b.c(obj, yVarC);
        anonymousClass1.f26551e = yVarC;
        anonymousClass1.f26549c = 1;
        if (pVar.invoke(cVar2, anonymousClass1) == objH) {
            return objH;
        }
        yVar = yVarC;
        anonymousClass1.f26551e = null;
        anonymousClass1.f26549c = 2;
        if (yVar.p(anonymousClass1) == objH) {
            return objH;
        }
        return b2.f124493a;
    }
}
