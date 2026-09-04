package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.d2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Collect.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
public final class CachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1$invokeSuspend$$inlined$collect$1<T> implements kotlinx.coroutines.flow.f<kotlin.collections.h0<? extends PageEvent<T>>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ CachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1 f25418b;

    /* JADX INFO: renamed from: androidx.paging.CachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1$invokeSuspend$$inlined$collect$1$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "value", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "continuation", "", "kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3$emit$1", "emit"}, k = 3, mv = {1, 4, 2})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1$invokeSuspend$$inlined$collect$1", f = "CachedPageEventFlow.kt", i = {0, 0}, l = {135, 138}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f25419b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f25420c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f25422e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f25423f;

        public AnonymousClass1(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) {
            this.f25419b = obj;
            this.f25420c |= Integer.MIN_VALUE;
            return CachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1$invokeSuspend$$inlined$collect$1.this.emit(null, this);
        }
    }

    public CachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1$invokeSuspend$$inlined$collect$1(CachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1 cachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1) {
        this.f25418b = cachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.f
    @dl.e
    public Object emit(Object obj, @dl.d kotlin.coroutines.c cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        kotlin.collections.h0 h0Var;
        CachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1$invokeSuspend$$inlined$collect$1<T> cachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1$invokeSuspend$$inlined$collect$1;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.f25420c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.f25420c = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj2 = anonymousClass1.f25419b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = anonymousClass1.f25420c;
        if (i11 != 0) {
            if (i11 == 1) {
                h0Var = (kotlin.collections.h0) anonymousClass1.f25423f;
                cachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1$invokeSuspend$$inlined$collect$1 = (CachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1$invokeSuspend$$inlined$collect$1) anonymousClass1.f25422e;
                kotlin.t0.n(obj2);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj2);
            }
            return b2.f124493a;
        }
        kotlin.t0.n(obj2);
        h0Var = (kotlin.collections.h0) obj;
        this.f25418b.f25411e.a();
        d2 d2Var = this.f25418b.f25412f;
        anonymousClass1.f25422e = this;
        anonymousClass1.f25423f = h0Var;
        anonymousClass1.f25420c = 1;
        if (d2Var.g0(anonymousClass1) == objH) {
            return objH;
        }
        cachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1$invokeSuspend$$inlined$collect$1 = this;
        int iE = h0Var.e();
        CachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1 cachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1 = cachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1$invokeSuspend$$inlined$collect$1.f25418b;
        if (iE > cachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1.f25413g.f124889b) {
            b1 b1Var = cachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1.f25410d;
            Object objF = h0Var.f();
            anonymousClass1.f25422e = null;
            anonymousClass1.f25423f = null;
            anonymousClass1.f25420c = 2;
            if (b1Var.X(objF, anonymousClass1) == objH) {
                return objH;
            }
        }
        return b2.f124493a;
    }
}
