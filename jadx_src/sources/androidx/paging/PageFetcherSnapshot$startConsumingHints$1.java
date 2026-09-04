package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: PageFetcherSnapshot.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1", f = "PageFetcherSnapshot.kt", i = {}, l = {212}, m = "invokeSuspend", n = {}, s = {})
public final class PageFetcherSnapshot$startConsumingHints$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f25879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ PageFetcherSnapshot f25880c;

    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$startConsumingHints$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: PageFetcherSnapshot.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Landroidx/paging/f1;", "it", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$2", f = "PageFetcherSnapshot.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements yh.p<f1, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f25881b;

        AnonymousClass2(kotlin.coroutines.c cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
            kotlin.jvm.internal.f0.p(completion, "completion");
            return PageFetcherSnapshot$startConsumingHints$1.this.new AnonymousClass2(completion);
        }

        @Override // yh.p
        public final Object invoke(f1 f1Var, kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass2) create(f1Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            kotlin.coroutines.intrinsics.b.h();
            if (this.f25881b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            PageFetcherSnapshot$startConsumingHints$1.this.f25880c.f25790o.invoke();
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot$startConsumingHints$1(PageFetcherSnapshot pageFetcherSnapshot, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f25880c = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        return new PageFetcherSnapshot$startConsumingHints$1(this.f25880c, completion);
    }

    @Override // yh.p
    public final Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        return ((PageFetcherSnapshot$startConsumingHints$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f25879b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            final kotlinx.coroutines.flow.i iVar = this.f25880c.hintSharedFlow;
            kotlinx.coroutines.flow.e<f1> eVar = new kotlinx.coroutines.flow.e<f1>() { // from class: androidx.paging.PageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1

                /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Collect.kt */
                @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 4, 2})
                public static final class AnonymousClass2 implements kotlinx.coroutines.flow.f<f1> {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ kotlinx.coroutines.flow.f f25885b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ PageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1 f25886c;

                    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "value", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "continuation", "", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2$1", "emit"}, k = 3, mv = {1, 4, 2})
                    @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1$2", f = "PageFetcherSnapshot.kt", i = {}, l = {136}, m = "emit", n = {}, s = {})
                    public static final class AnonymousClass1 extends ContinuationImpl {

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        /* synthetic */ Object f25887b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        int f25888c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        Object f25889d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        Object f25890e;

                        public AnonymousClass1(kotlin.coroutines.c cVar) {
                            super(cVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @dl.e
                        public final Object invokeSuspend(@dl.d Object obj) {
                            this.f25887b = obj;
                            this.f25888c |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(kotlinx.coroutines.flow.f fVar, PageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1 pageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1) {
                        this.f25885b = fVar;
                        this.f25886c = pageFetcherSnapshot$startConsumingHints$1$invokeSuspend$$inlined$filter$1;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.f
                    @dl.e
                    public Object emit(f1 f1Var, @dl.d kotlin.coroutines.c cVar) throws Throwable {
                        AnonymousClass1 anonymousClass1;
                        if (cVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) cVar;
                            int i10 = anonymousClass1.f25888c;
                            if ((i10 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.f25888c = i10 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(cVar);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                        Object obj = anonymousClass1.f25887b;
                        Object objH = kotlin.coroutines.intrinsics.b.h();
                        int i11 = anonymousClass1.f25888c;
                        if (i11 == 0) {
                            kotlin.t0.n(obj);
                            kotlinx.coroutines.flow.f fVar = this.f25885b;
                            f1 f1Var2 = f1Var;
                            if (!kotlin.coroutines.jvm.internal.a.a(f1Var2.getPresentedItemsBefore() * (-1) > this.f25880c.config.jumpThreshold || f1Var2.getPresentedItemsAfter() * (-1) > this.f25880c.config.jumpThreshold).booleanValue()) {
                                return b2.f124493a;
                            }
                            anonymousClass1.f25888c = 1;
                            if (fVar.emit(f1Var, anonymousClass1) == objH) {
                                return objH;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.t0.n(obj);
                        }
                        return b2.f124493a;
                    }
                }

                @Override // kotlinx.coroutines.flow.e
                @dl.e
                public Object a(@dl.d kotlinx.coroutines.flow.f<? super f1> fVar, @dl.d kotlin.coroutines.c cVar) {
                    Object objA = iVar.a(new AnonymousClass2(fVar, this), cVar);
                    return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
                }
            };
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
            this.f25879b = 1;
            if (kotlinx.coroutines.flow.g.A(eVar, anonymousClass2, this) == objH) {
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
