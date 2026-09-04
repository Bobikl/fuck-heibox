package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: Add missing generic type declarations: [Value] */
/* JADX INFO: compiled from: PageFetcher.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Landroidx/paging/b1;", "Landroidx/paging/o0;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PageFetcher$flow$1", f = "PageFetcher.kt", i = {}, l = {254}, m = "invokeSuspend", n = {}, s = {})
public final class PageFetcher$flow$1<Value> extends SuspendLambda implements yh.p<b1<o0<Value>>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f25727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f25728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ PageFetcher f25729d;

    /* JADX INFO: renamed from: androidx.paging.PageFetcher$flow$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: PageFetcher.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/flow/f;", "", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PageFetcher$flow$1$1", f = "PageFetcher.kt", i = {}, l = {58, 58}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.flow.f<? super Boolean>, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f25730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f25731c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ x0 f25732d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(x0 x0Var, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f25732d = x0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
            kotlin.jvm.internal.f0.p(completion, "completion");
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f25732d, completion);
            anonymousClass1.f25730b = obj;
            return anonymousClass1;
        }

        @Override // yh.p
        public final Object invoke(kotlinx.coroutines.flow.f<? super Boolean> fVar, kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(fVar, cVar)).invokeSuspend(b2.f124493a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0043  */
        /* JADX WARN: Code duplicated, block: B:23:0x0052 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            kotlinx.coroutines.flow.f fVar;
            RemoteMediator.InitializeAction initializeAction;
            Boolean boolA;
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f25731c;
            if (i10 != 0) {
                if (i10 == 1) {
                    fVar = (kotlinx.coroutines.flow.f) this.f25730b;
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
            fVar = (kotlinx.coroutines.flow.f) this.f25730b;
            x0 x0Var = this.f25732d;
            if (x0Var != null) {
                this.f25730b = fVar;
                this.f25731c = 1;
                obj = x0Var.a(this);
                if (obj == objH) {
                    return objH;
                }
            } else {
                initializeAction = null;
            }
            boolA = kotlin.coroutines.jvm.internal.a.a(initializeAction == RemoteMediator.InitializeAction.LAUNCH_INITIAL_REFRESH);
            this.f25730b = null;
            this.f25731c = 2;
            if (fVar.emit(boolA, this) == objH) {
                return objH;
            }
            return b2.f124493a;
            initializeAction = (RemoteMediator.InitializeAction) obj;
            boolA = kotlin.coroutines.jvm.internal.a.a(initializeAction == RemoteMediator.InitializeAction.LAUNCH_INITIAL_REFRESH);
            this.f25730b = null;
            this.f25731c = 2;
            if (fVar.emit(boolA, this) == objH) {
                return objH;
            }
            return b2.f124493a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [Key] */
    /* JADX INFO: renamed from: androidx.paging.PageFetcher$flow$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: PageFetcher.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Key", "Value", "Landroidx/paging/PageFetcher$a;", "previousGeneration", "", "triggerRemoteRefresh", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PageFetcher$flow$1$2", f = "PageFetcher.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {63, 66, 69}, m = "invokeSuspend", n = {"previousGeneration", "pagingSource", "triggerRemoteRefresh", "previousGeneration", "pagingSource", "triggerRemoteRefresh", "previousGeneration", "pagingSource", "triggerRemoteRefresh"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
    public static final class AnonymousClass2<Key> extends SuspendLambda implements yh.q<PageFetcher.a<Key, Value>, Boolean, kotlin.coroutines.c<? super PageFetcher.a<Key, Value>>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f25733b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ boolean f25734c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f25735d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f25736e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f25737f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ x0 f25739h;

        /* JADX INFO: renamed from: androidx.paging.PageFetcher$flow$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: PageFetcher.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Key", "Value", "Lkotlin/b2;", "i", "()V"}, k = 3, mv = {1, 4, 2})
        public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements yh.a<b2> {
            AnonymousClass1(PageFetcher pageFetcher) {
                super(0, pageFetcher, PageFetcher.class, "refresh", "refresh()V", 0);
            }

            public final void i() {
                ((PageFetcher) this.receiver).l();
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                i();
                return b2.f124493a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(x0 x0Var, kotlin.coroutines.c cVar) {
            super(3, cVar);
            this.f25739h = x0Var;
        }

        @dl.d
        public final kotlin.coroutines.c<b2> a(@dl.e PageFetcher.a<Key, Value> aVar, boolean z10, @dl.d kotlin.coroutines.c<? super PageFetcher.a<Key, Value>> continuation) {
            kotlin.jvm.internal.f0.p(continuation, "continuation");
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f25739h, continuation);
            anonymousClass2.f25733b = aVar;
            anonymousClass2.f25734c = z10;
            return anonymousClass2;
        }

        @Override // yh.q
        public final Object invoke(Object obj, Boolean bool, Object obj2) {
            return ((AnonymousClass2) a((PageFetcher.a) obj, bool.booleanValue(), (kotlin.coroutines.c) obj2)).invokeSuspend(b2.f124493a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:27:0x00c2 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:28:0x00c3  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v12, types: [T, androidx.paging.q0] */
        /* JADX WARN: Type inference failed for: r8v4, types: [T, androidx.paging.q0] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c3 -> B:29:0x00c7). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 404
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcher$flow$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: Collect.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    public static final class a implements kotlinx.coroutines.flow.f<o0<Value>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b1 f25740b;

        public a(b1 b1Var) {
            this.f25740b = b1Var;
        }

        @Override // kotlinx.coroutines.flow.f
        @dl.e
        public Object emit(Object obj, @dl.d kotlin.coroutines.c cVar) {
            Object objX = this.f25740b.X((o0) obj, cVar);
            return objX == kotlin.coroutines.intrinsics.b.h() ? objX : b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcher$flow$1(PageFetcher pageFetcher, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f25729d = pageFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        PageFetcher$flow$1 pageFetcher$flow$1 = new PageFetcher$flow$1(this.f25729d, completion);
        pageFetcher$flow$1.f25727b = obj;
        return pageFetcher$flow$1;
    }

    @Override // yh.p
    public final Object invoke(Object obj, kotlin.coroutines.c<? super b2> cVar) {
        return ((PageFetcher$flow$1) create(obj, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f25728c;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            b1 b1Var = (b1) this.f25727b;
            RemoteMediator remoteMediator = this.f25729d.remoteMediator;
            x0 x0VarA = remoteMediator != null ? y0.a(b1Var, remoteMediator) : null;
            kotlinx.coroutines.flow.e eVarF = FlowExtKt.f(kotlinx.coroutines.flow.g.s0(FlowExtKt.e(kotlinx.coroutines.flow.g.l1(this.f25729d.refreshEvents.a(), new AnonymousClass1(x0VarA, null)), null, new AnonymousClass2(x0VarA, null))), new PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1(null, this, x0VarA));
            a aVar = new a(b1Var);
            this.f25728c = 1;
            if (eVarF.a(aVar, this) == objH) {
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
