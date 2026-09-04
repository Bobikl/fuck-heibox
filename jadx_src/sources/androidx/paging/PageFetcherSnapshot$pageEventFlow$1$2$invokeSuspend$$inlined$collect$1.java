package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.ClosedSendChannelException;

/* JADX INFO: Add missing generic type declarations: [Value] */
/* JADX INFO: compiled from: Collect.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
public final class PageFetcherSnapshot$pageEventFlow$1$2$invokeSuspend$$inlined$collect$1<Value> implements kotlinx.coroutines.flow.f<PageEvent<Value>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ PageFetcherSnapshot$pageEventFlow$1.AnonymousClass2 f25852b;

    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$invokeSuspend$$inlined$collect$1$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "value", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "continuation", "", "kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3$emit$1", "emit"}, k = 3, mv = {1, 4, 2})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$invokeSuspend$$inlined$collect$1", f = "PageFetcherSnapshot.kt", i = {}, l = {134}, m = "emit", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f25853b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f25854c;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) {
            this.f25853b = obj;
            this.f25854c |= Integer.MIN_VALUE;
            return PageFetcherSnapshot$pageEventFlow$1$2$invokeSuspend$$inlined$collect$1.this.emit(null, this);
        }
    }

    public PageFetcherSnapshot$pageEventFlow$1$2$invokeSuspend$$inlined$collect$1(PageFetcherSnapshot$pageEventFlow$1.AnonymousClass2 anonymousClass2) {
        this.f25852b = anonymousClass2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.f
    @dl.e
    public Object emit(Object obj, @dl.d kotlin.coroutines.c cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.f25854c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.f25854c = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj2 = anonymousClass1.f25853b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = anonymousClass1.f25854c;
        try {
            if (i11 == 0) {
                kotlin.t0.n(obj2);
                PageEvent pageEvent = (PageEvent) obj;
                b1 b1Var = this.f25852b.f25851d;
                anonymousClass1.f25854c = 1;
                if (b1Var.X(pageEvent, anonymousClass1) == objH) {
                    return objH;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj2);
            }
        } catch (ClosedSendChannelException unused) {
        }
        return b2.f124493a;
    }
}
