package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.d2;

/* JADX INFO: compiled from: CachedPageEventFlow.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1", f = "CachedPageEventFlow.kt", i = {}, l = {bb.c.b.G2}, m = "invokeSuspend", n = {}, s = {})
public final class CachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f25408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ CachedPageEventFlow$downstreamFlow$1 f25409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ b1 f25410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ TemporaryDownstream f25411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ d2 f25412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Ref.IntRef f25413g;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.paging.CachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: CachedPageEventFlow.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u008a@¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/f;", "Lkotlin/collections/h0;", "Landroidx/paging/PageEvent;", "", "throwable", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1$1", f = "CachedPageEventFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1<T> extends SuspendLambda implements yh.q<kotlinx.coroutines.flow.f<? super kotlin.collections.h0<? extends PageEvent<T>>>, Throwable, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f25414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f25415c;

        AnonymousClass1(kotlin.coroutines.c cVar) {
            super(3, cVar);
        }

        @dl.d
        public final kotlin.coroutines.c<b2> a(@dl.d kotlinx.coroutines.flow.f<? super kotlin.collections.h0<? extends PageEvent<T>>> create, @dl.d Throwable throwable, @dl.d kotlin.coroutines.c<? super b2> continuation) {
            kotlin.jvm.internal.f0.p(create, "$this$create");
            kotlin.jvm.internal.f0.p(throwable, "throwable");
            kotlin.jvm.internal.f0.p(continuation, "continuation");
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.f25414b = throwable;
            return anonymousClass1;
        }

        @Override // yh.q
        public final Object invoke(Object obj, Throwable th2, kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) a((kotlinx.coroutines.flow.f) obj, th2, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            kotlin.coroutines.intrinsics.b.h();
            if (this.f25415c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            Throwable th2 = (Throwable) this.f25414b;
            if (th2 instanceof ClosedSendChannelException) {
                return b2.f124493a;
            }
            throw th2;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.paging.CachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: CachedPageEventFlow.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u008a@¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/f;", "Lkotlin/collections/h0;", "Landroidx/paging/PageEvent;", "", "it", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1$2", f = "CachedPageEventFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2<T> extends SuspendLambda implements yh.q<kotlinx.coroutines.flow.f<? super kotlin.collections.h0<? extends PageEvent<T>>>, Throwable, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f25416b;

        AnonymousClass2(kotlin.coroutines.c cVar) {
            super(3, cVar);
        }

        @dl.d
        public final kotlin.coroutines.c<b2> a(@dl.d kotlinx.coroutines.flow.f<? super kotlin.collections.h0<? extends PageEvent<T>>> create, @dl.e Throwable th2, @dl.d kotlin.coroutines.c<? super b2> continuation) {
            kotlin.jvm.internal.f0.p(create, "$this$create");
            kotlin.jvm.internal.f0.p(continuation, "continuation");
            return CachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1.this.new AnonymousClass2(continuation);
        }

        @Override // yh.q
        public final Object invoke(Object obj, Throwable th2, kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass2) a((kotlinx.coroutines.flow.f) obj, th2, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            kotlin.coroutines.intrinsics.b.h();
            if (this.f25416b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            CachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1.this.f25411e.a();
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1(CachedPageEventFlow$downstreamFlow$1 cachedPageEventFlow$downstreamFlow$1, b1 b1Var, TemporaryDownstream temporaryDownstream, d2 d2Var, Ref.IntRef intRef, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f25409c = cachedPageEventFlow$downstreamFlow$1;
        this.f25410d = b1Var;
        this.f25411e = temporaryDownstream;
        this.f25412f = d2Var;
        this.f25413g = intRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        return new CachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1(this.f25409c, this.f25410d, this.f25411e, this.f25412f, this.f25413g, completion);
    }

    @Override // yh.p
    public final Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        return ((CachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f25408b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            kotlinx.coroutines.flow.e eVarD1 = kotlinx.coroutines.flow.g.d1(kotlinx.coroutines.flow.g.u(this.f25409c.f25407d.multicastedSrc.i(), new AnonymousClass1(null)), new AnonymousClass2(null));
            CachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1$invokeSuspend$$inlined$collect$1 cachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1$invokeSuspend$$inlined$collect$1 = new CachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1$invokeSuspend$$inlined$collect$1(this);
            this.f25408b = 1;
            if (eVarD1.a(cachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1$invokeSuspend$$inlined$collect$1, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        return b2.f124493a;
    }
}
