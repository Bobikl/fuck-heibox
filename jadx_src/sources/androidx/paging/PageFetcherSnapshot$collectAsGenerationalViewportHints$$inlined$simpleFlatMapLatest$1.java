package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "Lkotlinx/coroutines/flow/f;", "it", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "androidx/paging/FlowExtKt$simpleFlatMapLatest$1", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1", f = "PageFetcherSnapshot.kt", i = {0, 0}, l = {109, 130}, m = "invokeSuspend", n = {"this_$iv", "generationId"}, s = {"L$1", "I$0"})
public final class PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 extends SuspendLambda implements yh.q<kotlinx.coroutines.flow.f<? super GenerationalViewportHint>, Integer, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f25794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f25795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f25796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ PageFetcherSnapshot f25797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ LoadType f25798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Object f25799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f25800h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(kotlin.coroutines.c cVar, PageFetcherSnapshot pageFetcherSnapshot, LoadType loadType) {
        super(3, cVar);
        this.f25797e = pageFetcherSnapshot;
        this.f25798f = loadType;
    }

    @dl.d
    public final kotlin.coroutines.c<b2> a(@dl.d kotlinx.coroutines.flow.f<? super GenerationalViewportHint> create, Integer num, @dl.d kotlin.coroutines.c<? super b2> continuation) {
        kotlin.jvm.internal.f0.p(create, "$this$create");
        kotlin.jvm.internal.f0.p(continuation, "continuation");
        PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 = new PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(continuation, this.f25797e, this.f25798f);
        pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.f25794b = create;
        pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.f25795c = num;
        return pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1;
    }

    @Override // yh.q
    public final Object invoke(kotlinx.coroutines.flow.f<? super GenerationalViewportHint> fVar, Integer num, kotlin.coroutines.c<? super b2> cVar) {
        return ((PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1) a(fVar, num, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlinx.coroutines.flow.f<? super GenerationalViewportHint> fVar;
        final int iIntValue;
        PageFetcherSnapshotState.Holder holder;
        kotlinx.coroutines.sync.c cVar;
        kotlinx.coroutines.flow.e<GenerationalViewportHint> eVarM0;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f25796d;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    iIntValue = this.f25800h;
                    cVar = (kotlinx.coroutines.sync.c) this.f25799g;
                    holder = (PageFetcherSnapshotState.Holder) this.f25795c;
                    fVar = (kotlinx.coroutines.flow.f) this.f25794b;
                    kotlin.t0.n(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.t0.n(obj);
                }
                return b2.f124493a;
            }
            kotlin.t0.n(obj);
            fVar = (kotlinx.coroutines.flow.f) this.f25794b;
            iIntValue = ((Number) this.f25795c).intValue();
            holder = this.f25797e.stateHolder;
            cVar = holder.lock;
            this.f25794b = fVar;
            this.f25795c = holder;
            this.f25799g = cVar;
            this.f25800h = iIntValue;
            this.f25796d = 1;
            if (cVar.e(null, this) == objH) {
                return objH;
            }
            PageFetcherSnapshotState pageFetcherSnapshotState = holder.state;
            v vVarH = pageFetcherSnapshotState.getSourceLoadStates().h(this.f25798f);
            v.NotLoading.Companion companion = v.NotLoading.INSTANCE;
            if (kotlin.jvm.internal.f0.g(vVarH, companion.a())) {
                eVarM0 = kotlinx.coroutines.flow.g.M0(new GenerationalViewportHint[0]);
                cVar.f(null);
            } else {
                if (!(pageFetcherSnapshotState.getSourceLoadStates().h(this.f25798f) instanceof v.Error)) {
                    pageFetcherSnapshotState.w(this.f25798f, companion.b());
                }
                b2 b2Var = b2.f124493a;
                cVar.f(null);
                final kotlinx.coroutines.flow.e eVarJ0 = kotlinx.coroutines.flow.g.j0(this.f25797e.hintSharedFlow, iIntValue == 0 ? 0 : 1);
                eVarM0 = new kotlinx.coroutines.flow.e<GenerationalViewportHint>() { // from class: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1$lambda$1

                    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1$lambda$1$1, reason: invalid class name */
                    /* JADX INFO: compiled from: Collect.kt */
                    @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core", "androidx/paging/PageFetcherSnapshot$$special$$inlined$map$1$2"}, k = 1, mv = {1, 4, 2})
                    public static final class AnonymousClass1 implements kotlinx.coroutines.flow.f<f1> {

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        final /* synthetic */ kotlinx.coroutines.flow.f f25803b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        final /* synthetic */ PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1$lambda$1 f25804c;

                        /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1$lambda$1$1$1, reason: invalid class name and collision with other inner class name */
                        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "value", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "continuation", "", "androidx/paging/PageFetcherSnapshot$$special$$inlined$map$1$2$1", "emit"}, k = 3, mv = {1, 4, 2})
                        public static final class C01951 extends ContinuationImpl {

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            /* synthetic */ Object f25805b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            int f25806c;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            Object f25807d;

                            public C01951(kotlin.coroutines.c cVar) {
                                super(cVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @dl.e
                            public final Object invokeSuspend(@dl.d Object obj) {
                                this.f25805b = obj;
                                this.f25806c |= Integer.MIN_VALUE;
                                return AnonymousClass1.this.emit(null, this);
                            }
                        }

                        public AnonymousClass1(kotlinx.coroutines.flow.f fVar, PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1$lambda$1 pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1$lambda$1) {
                            this.f25803b = fVar;
                            this.f25804c = pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1$lambda$1;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.f
                        @dl.e
                        public Object emit(f1 f1Var, @dl.d kotlin.coroutines.c cVar) throws Throwable {
                            C01951 c01951;
                            if (cVar instanceof C01951) {
                                c01951 = (C01951) cVar;
                                int i10 = c01951.f25806c;
                                if ((i10 & Integer.MIN_VALUE) != 0) {
                                    c01951.f25806c = i10 - Integer.MIN_VALUE;
                                } else {
                                    c01951 = new C01951(cVar);
                                }
                            } else {
                                c01951 = new C01951(cVar);
                            }
                            Object obj = c01951.f25805b;
                            Object objH = kotlin.coroutines.intrinsics.b.h();
                            int i11 = c01951.f25806c;
                            if (i11 == 0) {
                                kotlin.t0.n(obj);
                                kotlinx.coroutines.flow.f fVar = this.f25803b;
                                GenerationalViewportHint generationalViewportHint = new GenerationalViewportHint(iIntValue, f1Var);
                                c01951.f25806c = 1;
                                if (fVar.emit(generationalViewportHint, c01951) == objH) {
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
                    public Object a(@dl.d kotlinx.coroutines.flow.f<? super GenerationalViewportHint> fVar2, @dl.d kotlin.coroutines.c cVar2) {
                        Object objA = eVarJ0.a(new AnonymousClass1(fVar2, this), cVar2);
                        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
                    }
                };
            }
            this.f25794b = null;
            this.f25795c = null;
            this.f25799g = null;
            this.f25796d = 2;
            if (eVarM0.a(fVar, this) == objH) {
                return objH;
            }
            return b2.f124493a;
        } catch (Throwable th2) {
            cVar.f(null);
            throw th2;
        }
    }
}
