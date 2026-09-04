package androidx.paging;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.i2;

/* JADX INFO: compiled from: PageFetcherSnapshot.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0085\u0001\u0012\b\u0010H\u001a\u0004\u0018\u00018\u0000\u0012\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010I\u0012\u0006\u0010R\u001a\u00020O\u0012\f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c\u0012\b\b\u0002\u0010X\u001a\u00020U\u0012\u0016\b\u0002\u0010]\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010Y\u0012\u0016\b\u0002\u0010_\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0019\u0012\u000e\b\u0002\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00050`¢\u0006\u0004\bb\u0010cJ\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002J'\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u0011\u001a\u0004\u0018\u00018\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0018\u001a\u00020\u0005J\u001f\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001d\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u000e0\u001c2\u0006\u0010\b\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001bJ#\u0010\"\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 H\u0082@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J+\u0010$\u001a\u00020\u0005*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\b\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b$\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R \u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000103028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R \u0010:\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R#\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0001030\u001c8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010H\u001a\u0004\u0018\u00018\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR&\u0010N\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010I8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010@R\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR%\u0010]\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010Y8\u0006¢\u0006\f\n\u0004\b\u0017\u0010Z\u001a\u0004\b[\u0010\\R\"\u0010_\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010^\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006d"}, d2 = {"Landroidx/paging/PageFetcherSnapshot;", "", "Key", "Value", "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", androidx.exifinterface.media.a.W4, "Landroidx/paging/LoadType;", "loadType", "key", "Landroidx/paging/q0$a;", RXScreenCaptureService.KEY_WIDTH, "(Landroidx/paging/LoadType;Ljava/lang/Object;)Landroidx/paging/q0$a;", "Landroidx/paging/PageFetcherSnapshotState;", "", "generationId", "presentedItemsBeyondAnchor", "x", "(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;II)Ljava/lang/Object;", "Landroidx/paging/f1;", "viewportHint", "y", "(Landroidx/paging/LoadType;Landroidx/paging/f1;Lkotlin/coroutines/c;)Ljava/lang/Object;", "m", "n", "Landroidx/paging/t0;", "p", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/e;", "o", "(Lkotlinx/coroutines/flow/e;Landroidx/paging/LoadType;Lkotlin/coroutines/c;)Ljava/lang/Object;", "q", "Landroidx/paging/k;", "generationalHint", "r", "(Landroidx/paging/LoadType;Landroidx/paging/k;Lkotlin/coroutines/c;)Ljava/lang/Object;", ak.aD, "(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/i;", ak.av, "Lkotlinx/coroutines/flow/i;", "hintSharedFlow", "Landroidx/paging/f1$a;", "b", "Landroidx/paging/f1$a;", "lastHint", "Ljava/util/concurrent/atomic/AtomicBoolean;", ak.aF, "Ljava/util/concurrent/atomic/AtomicBoolean;", "pageEventChCollected", "Lkotlinx/coroutines/channels/k;", "Landroidx/paging/PageEvent;", "d", "Lkotlinx/coroutines/channels/k;", "pageEventCh", "Landroidx/paging/PageFetcherSnapshotState$Holder;", "e", "Landroidx/paging/PageFetcherSnapshotState$Holder;", "stateHolder", "Lkotlinx/coroutines/b0;", "f", "Lkotlinx/coroutines/b0;", "pageEventChannelFlowJob", "g", "Lkotlinx/coroutines/flow/e;", "t", "()Lkotlinx/coroutines/flow/e;", "pageEventFlow", RXScreenCaptureService.KEY_HEIGHT, "Ljava/lang/Object;", ak.aB, "()Ljava/lang/Object;", "initialKey", "Landroidx/paging/q0;", "i", "Landroidx/paging/q0;", ak.aG, "()Landroidx/paging/q0;", "pagingSource", "Landroidx/paging/n0;", "j", "Landroidx/paging/n0;", "config", "k", "retryFlow", "", "l", "Z", "triggerRemoteRefresh", "Landroidx/paging/z0;", "Landroidx/paging/z0;", "v", "()Landroidx/paging/z0;", "remoteMediatorConnection", "Landroidx/paging/t0;", "previousPagingState", "Lkotlin/Function0;", "invalidate", "<init>", "(Ljava/lang/Object;Landroidx/paging/q0;Landroidx/paging/n0;Lkotlinx/coroutines/flow/e;ZLandroidx/paging/z0;Landroidx/paging/t0;Lyh/a;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class PageFetcherSnapshot<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final kotlinx.coroutines.flow.i<f1> hintSharedFlow;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private f1.a lastHint;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean pageEventChCollected;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final kotlinx.coroutines.channels.k<PageEvent<Value>> pageEventCh;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final PageFetcherSnapshotState.Holder<Key, Value> stateHolder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final kotlinx.coroutines.b0 pageEventChannelFlowJob;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlinx.coroutines.flow.e<PageEvent<Value>> pageEventFlow;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final Key initialKey;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final q0<Key, Value> pagingSource;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final n0 config;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final kotlinx.coroutines.flow.e<b2> retryFlow;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final boolean triggerRemoteRefresh;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final z0<Key, Value> remoteMediatorConnection;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final PagingState<Key, Value> previousPagingState;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final yh.a<b2> f25790o;

    /* JADX INFO: compiled from: Collect.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    public static final class a implements kotlinx.coroutines.flow.f<GenerationalViewportHint> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ LoadType f25793c;

        public a(LoadType loadType) {
            this.f25793c = loadType;
        }

        @Override // kotlinx.coroutines.flow.f
        @dl.e
        public Object emit(GenerationalViewportHint generationalViewportHint, @dl.d kotlin.coroutines.c cVar) throws Throwable {
            Object objR = PageFetcherSnapshot.this.r(this.f25793c, generationalViewportHint, cVar);
            return objR == kotlin.coroutines.intrinsics.b.h() ? objR : b2.f124493a;
        }
    }

    public PageFetcherSnapshot(@dl.e Key key, @dl.d q0<Key, Value> pagingSource, @dl.d n0 config, @dl.d kotlinx.coroutines.flow.e<b2> retryFlow, boolean z10, @dl.e z0<Key, Value> z0Var, @dl.e PagingState<Key, Value> pagingState, @dl.d yh.a<b2> invalidate) {
        kotlin.jvm.internal.f0.p(pagingSource, "pagingSource");
        kotlin.jvm.internal.f0.p(config, "config");
        kotlin.jvm.internal.f0.p(retryFlow, "retryFlow");
        kotlin.jvm.internal.f0.p(invalidate, "invalidate");
        this.initialKey = key;
        this.pagingSource = pagingSource;
        this.config = config;
        this.retryFlow = retryFlow;
        this.triggerRemoteRefresh = z10;
        this.remoteMediatorConnection = z0Var;
        this.previousPagingState = pagingState;
        this.f25790o = invalidate;
        if (!(config.jumpThreshold == Integer.MIN_VALUE || pagingSource.b())) {
            throw new IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.".toString());
        }
        this.hintSharedFlow = kotlinx.coroutines.flow.o.b(1, 0, null, 6, null);
        this.pageEventChCollected = new AtomicBoolean(false);
        this.pageEventCh = kotlinx.coroutines.channels.m.d(-2, null, null, 6, null);
        this.stateHolder = new PageFetcherSnapshotState.Holder<>(config);
        kotlinx.coroutines.b0 b0VarC = i2.c(null, 1, null);
        this.pageEventChannelFlowJob = b0VarC;
        this.pageEventFlow = CancelableChannelFlowKt.a(b0VarC, new PageFetcherSnapshot$pageEventFlow$1(this, null));
    }

    public /* synthetic */ PageFetcherSnapshot(Object obj, q0 q0Var, n0 n0Var, kotlinx.coroutines.flow.e eVar, boolean z10, z0 z0Var, PagingState pagingState, yh.a aVar, int i10, kotlin.jvm.internal.u uVar) {
        this(obj, q0Var, n0Var, eVar, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? null : z0Var, (i10 & 64) != 0 ? null : pagingState, (i10 & 128) != 0 ? new yh.a<b2>() { // from class: androidx.paging.PageFetcherSnapshot.1
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        } : aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(kotlinx.coroutines.q0 q0Var) {
        if (this.config.jumpThreshold != Integer.MIN_VALUE) {
            kotlinx.coroutines.k.f(q0Var, null, null, new PageFetcherSnapshot$startConsumingHints$1(this, null), 3, null);
        }
        kotlinx.coroutines.k.f(q0Var, null, null, new PageFetcherSnapshot$startConsumingHints$2(this, null), 3, null);
        kotlinx.coroutines.k.f(q0Var, null, null, new PageFetcherSnapshot$startConsumingHints$3(this, null), 3, null);
    }

    private final q0.a<Key> w(LoadType loadType, Key key) {
        return q0.a.INSTANCE.a(loadType, key, loadType == LoadType.REFRESH ? this.config.initialLoadSize : this.config.pageSize, this.config.enablePlaceholders);
    }

    private final Key x(PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, LoadType loadType, int i10, int i11) {
        if (i10 == pageFetcherSnapshotState.l(loadType) && !(pageFetcherSnapshotState.getSourceLoadStates().h(loadType) instanceof v.Error) && i11 < this.config.prefetchDistance) {
            return loadType == LoadType.PREPEND ? (Key) ((q0.b.Page) CollectionsKt___CollectionsKt.w2(pageFetcherSnapshotState.o())).m() : (Key) ((q0.b.Page) CollectionsKt___CollectionsKt.k3(pageFetcherSnapshotState.o())).l();
        }
        return null;
    }

    public final void m(@dl.d f1 viewportHint) {
        kotlin.jvm.internal.f0.p(viewportHint, "viewportHint");
        if (viewportHint instanceof f1.a) {
            this.lastHint = (f1.a) viewportHint;
        }
        this.hintSharedFlow.d(viewportHint);
    }

    public final void n() {
        d2.a.b(this.pageEventChannelFlowJob, null, 1, null);
    }

    final /* synthetic */ Object o(kotlinx.coroutines.flow.e<Integer> eVar, LoadType loadType, kotlin.coroutines.c<? super b2> cVar) {
        Object objA = kotlinx.coroutines.flow.g.W(FlowExtKt.d(FlowExtKt.f(eVar, new PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(null, this, loadType)), new PageFetcherSnapshot$collectAsGenerationalViewportHints$3(loadType, null))).a(new a(loadType), cVar);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public final Object p(@dl.d kotlin.coroutines.c<? super PagingState<Key, Value>> cVar) throws Throwable {
        PageFetcherSnapshot$currentPagingState$1 pageFetcherSnapshot$currentPagingState$1;
        PageFetcherSnapshotState.Holder<Key, Value> holder;
        PageFetcherSnapshot<Key, Value> pageFetcherSnapshot;
        kotlinx.coroutines.sync.c cVar2;
        if (cVar instanceof PageFetcherSnapshot$currentPagingState$1) {
            pageFetcherSnapshot$currentPagingState$1 = (PageFetcherSnapshot$currentPagingState$1) cVar;
            int i10 = pageFetcherSnapshot$currentPagingState$1.f25814c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pageFetcherSnapshot$currentPagingState$1.f25814c = i10 - Integer.MIN_VALUE;
            } else {
                pageFetcherSnapshot$currentPagingState$1 = new PageFetcherSnapshot$currentPagingState$1(this, cVar);
            }
        } else {
            pageFetcherSnapshot$currentPagingState$1 = new PageFetcherSnapshot$currentPagingState$1(this, cVar);
        }
        Object obj = pageFetcherSnapshot$currentPagingState$1.f25813b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = pageFetcherSnapshot$currentPagingState$1.f25814c;
        if (i11 == 0) {
            kotlin.t0.n(obj);
            holder = this.stateHolder;
            kotlinx.coroutines.sync.c cVar3 = ((PageFetcherSnapshotState.Holder) holder).lock;
            pageFetcherSnapshot$currentPagingState$1.f25816e = this;
            pageFetcherSnapshot$currentPagingState$1.f25817f = holder;
            pageFetcherSnapshot$currentPagingState$1.f25818g = cVar3;
            pageFetcherSnapshot$currentPagingState$1.f25814c = 1;
            if (cVar3.e(null, pageFetcherSnapshot$currentPagingState$1) == objH) {
                return objH;
            }
            pageFetcherSnapshot = this;
            cVar2 = cVar3;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar2 = (kotlinx.coroutines.sync.c) pageFetcherSnapshot$currentPagingState$1.f25818g;
            holder = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$currentPagingState$1.f25817f;
            pageFetcherSnapshot = (PageFetcherSnapshot) pageFetcherSnapshot$currentPagingState$1.f25816e;
            kotlin.t0.n(obj);
        }
        try {
            return ((PageFetcherSnapshotState.Holder) holder).state.i(pageFetcherSnapshot.lastHint);
        } finally {
            cVar2.f(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x026e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0272  */
    /* JADX WARN: Code duplicated, block: B:108:0x028a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:111:0x02a2 A[Catch: all -> 0x02c3, TRY_LEAVE, TryCatch #0 {all -> 0x02c3, blocks: (B:109:0x028b, B:111:0x02a2), top: B:125:0x028b }] */
    /* JADX WARN: Code duplicated, block: B:113:0x02bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0112 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0113  */
    /* JADX WARN: Code duplicated, block: B:45:0x0130 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x0131  */
    /* JADX WARN: Code duplicated, block: B:49:0x0139  */
    /* JADX WARN: Code duplicated, block: B:51:0x0150 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0182 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x019b A[Catch: all -> 0x0264, TryCatch #1 {all -> 0x0264, blocks: (B:56:0x0183, B:58:0x019b, B:59:0x01a4, B:61:0x01ad, B:62:0x01b6), top: B:127:0x0183 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x01ad A[Catch: all -> 0x0264, TryCatch #1 {all -> 0x0264, blocks: (B:56:0x0183, B:58:0x019b, B:59:0x01a4, B:61:0x01ad, B:62:0x01b6), top: B:127:0x0183 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:72:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:77:0x0205  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x020b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0214  */
    /* JADX WARN: Code duplicated, block: B:86:0x0232 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:87:0x0233  */
    /* JADX WARN: Code duplicated, block: B:91:0x024a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0257  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.c] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.sync.c] */
    /* JADX WARN: Type inference failed for: r2v33, types: [kotlinx.coroutines.sync.c] */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlinx.coroutines.sync.c] */
    final /* synthetic */ Object q(kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        PageFetcherSnapshot$doInitialLoad$1 pageFetcherSnapshot$doInitialLoad$1;
        PageFetcherSnapshotState.Holder<Key, Value> holder;
        PageFetcherSnapshot pageFetcherSnapshot;
        kotlinx.coroutines.sync.c cVar2;
        PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState;
        LoadType loadType;
        PageFetcherSnapshot pageFetcherSnapshot2;
        PageFetcherSnapshot pageFetcherSnapshot3;
        q0.b bVar;
        PageFetcherSnapshotState.Holder<Key, Value> holder2;
        kotlinx.coroutines.sync.c cVar3;
        PageFetcherSnapshotState.Holder<Key, Value> holder3;
        kotlinx.coroutines.sync.c cVar4;
        boolean zBooleanValue;
        PageFetcherSnapshotState.Holder<Key, Value> holder4;
        kotlinx.coroutines.sync.c cVar5;
        PageFetcherSnapshotState pageFetcherSnapshotState2;
        v.NotLoading.Companion companion;
        q0.b bVar2;
        PageFetcherSnapshot pageFetcherSnapshot4;
        PageFetcherSnapshotState.Holder<Key, Value> holder5;
        kotlinx.coroutines.sync.c cVar6;
        kotlinx.coroutines.sync.c cVar7;
        q0.b bVar3;
        PageFetcherSnapshot pageFetcherSnapshot5;
        kotlinx.coroutines.channels.k<PageEvent<Value>> kVar;
        PageEvent<Value> pageEventX;
        q0.b.Page page;
        PageFetcherSnapshotState.Holder<Key, Value> holder6;
        kotlinx.coroutines.sync.c cVar8;
        kotlinx.coroutines.sync.c cVar9;
        PageFetcherSnapshot pageFetcherSnapshot6;
        PagingState<Key, Value> pagingStateI;
        q0.b.Page page2;
        kotlinx.coroutines.sync.c cVar10;
        Throwable th2;
        PageFetcherSnapshotState pageFetcherSnapshotState3;
        v.Error error;
        LoadType loadType2;
        kotlinx.coroutines.channels.k<PageEvent<Value>> kVar2;
        PageEvent.LoadStateUpdate loadStateUpdate;
        if (cVar instanceof PageFetcherSnapshot$doInitialLoad$1) {
            pageFetcherSnapshot$doInitialLoad$1 = (PageFetcherSnapshot$doInitialLoad$1) cVar;
            int i10 = pageFetcherSnapshot$doInitialLoad$1.f25820c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pageFetcherSnapshot$doInitialLoad$1.f25820c = i10 - Integer.MIN_VALUE;
            } else {
                pageFetcherSnapshot$doInitialLoad$1 = new PageFetcherSnapshot$doInitialLoad$1(this, cVar);
            }
        } else {
            pageFetcherSnapshot$doInitialLoad$1 = new PageFetcherSnapshot$doInitialLoad$1(this, cVar);
        }
        Object objH = pageFetcherSnapshot$doInitialLoad$1.f25819b;
        Object objH2 = kotlin.coroutines.intrinsics.b.h();
        ?? r10 = pageFetcherSnapshot$doInitialLoad$1.f25820c;
        try {
            try {
                switch (r10) {
                    case 0:
                        kotlin.t0.n(objH);
                        holder = this.stateHolder;
                        kotlinx.coroutines.sync.c cVar11 = ((PageFetcherSnapshotState.Holder) holder).lock;
                        pageFetcherSnapshot$doInitialLoad$1.f25822e = this;
                        pageFetcherSnapshot$doInitialLoad$1.f25823f = holder;
                        pageFetcherSnapshot$doInitialLoad$1.f25824g = cVar11;
                        pageFetcherSnapshot$doInitialLoad$1.f25820c = 1;
                        if (cVar11.e(null, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                            return objH2;
                        }
                        pageFetcherSnapshot = this;
                        cVar2 = cVar11;
                        pageFetcherSnapshotState = ((PageFetcherSnapshotState.Holder) holder).state;
                        loadType = LoadType.REFRESH;
                        pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot;
                        pageFetcherSnapshot$doInitialLoad$1.f25823f = cVar2;
                        pageFetcherSnapshot$doInitialLoad$1.f25824g = null;
                        pageFetcherSnapshot$doInitialLoad$1.f25820c = 2;
                        if (pageFetcherSnapshot.z(pageFetcherSnapshotState, loadType, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                            return objH2;
                        }
                        pageFetcherSnapshot2 = pageFetcherSnapshot;
                        r10 = cVar2;
                        b2 b2Var = b2.f124493a;
                        r10.f(null);
                        q0.a<Key> aVarW = pageFetcherSnapshot2.w(LoadType.REFRESH, pageFetcherSnapshot2.initialKey);
                        q0<Key, Value> q0Var = pageFetcherSnapshot2.pagingSource;
                        pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot2;
                        pageFetcherSnapshot$doInitialLoad$1.f25823f = null;
                        pageFetcherSnapshot$doInitialLoad$1.f25820c = 3;
                        objH = q0Var.h(aVarW, pageFetcherSnapshot$doInitialLoad$1);
                        if (objH == objH2) {
                            return objH2;
                        }
                        pageFetcherSnapshot3 = pageFetcherSnapshot2;
                        bVar = (q0.b) objH;
                        if (bVar instanceof q0.b.Page) {
                            holder3 = pageFetcherSnapshot3.stateHolder;
                            cVar4 = ((PageFetcherSnapshotState.Holder) holder3).lock;
                            pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot3;
                            pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar;
                            pageFetcherSnapshot$doInitialLoad$1.f25824g = holder3;
                            pageFetcherSnapshot$doInitialLoad$1.f25825h = cVar4;
                            pageFetcherSnapshot$doInitialLoad$1.f25820c = 4;
                            if (cVar4.e(null, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                return objH2;
                            }
                            try {
                                Boolean boolA = kotlin.coroutines.jvm.internal.a.a(((PageFetcherSnapshotState.Holder) holder3).state.t(0, LoadType.REFRESH, (q0.b.Page) bVar));
                                cVar4.f(null);
                                zBooleanValue = boolA.booleanValue();
                                holder4 = pageFetcherSnapshot3.stateHolder;
                                cVar5 = ((PageFetcherSnapshotState.Holder) holder4).lock;
                                pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot3;
                                pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar;
                                pageFetcherSnapshot$doInitialLoad$1.f25824g = holder4;
                                pageFetcherSnapshot$doInitialLoad$1.f25825h = cVar5;
                                pageFetcherSnapshot$doInitialLoad$1.f25826i = zBooleanValue;
                                pageFetcherSnapshot$doInitialLoad$1.f25820c = 5;
                                if (cVar5.e(null, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                    return objH2;
                                }
                                try {
                                    pageFetcherSnapshotState2 = ((PageFetcherSnapshotState.Holder) holder4).state;
                                    LoadType loadType3 = LoadType.REFRESH;
                                    companion = v.NotLoading.INSTANCE;
                                    pageFetcherSnapshotState2.w(loadType3, companion.b());
                                    if (((q0.b.Page) bVar).m() == null) {
                                        pageFetcherSnapshotState2.w(LoadType.PREPEND, companion.a());
                                    }
                                    if (((q0.b.Page) bVar).l() == null) {
                                        pageFetcherSnapshotState2.w(LoadType.APPEND, companion.a());
                                    }
                                    b2 b2Var2 = b2.f124493a;
                                    cVar5.f(null);
                                    if (zBooleanValue) {
                                        holder5 = pageFetcherSnapshot3.stateHolder;
                                        cVar6 = ((PageFetcherSnapshotState.Holder) holder5).lock;
                                        pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot3;
                                        pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar;
                                        pageFetcherSnapshot$doInitialLoad$1.f25824g = holder5;
                                        pageFetcherSnapshot$doInitialLoad$1.f25825h = cVar6;
                                        pageFetcherSnapshot$doInitialLoad$1.f25820c = 6;
                                        if (cVar6.e(null, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                            return objH2;
                                        }
                                        cVar7 = cVar6;
                                        bVar3 = bVar;
                                        pageFetcherSnapshot5 = pageFetcherSnapshot3;
                                        PageFetcherSnapshotState pageFetcherSnapshotState4 = ((PageFetcherSnapshotState.Holder) holder5).state;
                                        kVar = pageFetcherSnapshot5.pageEventCh;
                                        pageEventX = pageFetcherSnapshotState4.x((q0.b.Page) bVar3, LoadType.REFRESH);
                                        pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot5;
                                        pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar3;
                                        pageFetcherSnapshot$doInitialLoad$1.f25824g = cVar7;
                                        pageFetcherSnapshot$doInitialLoad$1.f25825h = null;
                                        pageFetcherSnapshot$doInitialLoad$1.f25820c = 7;
                                        if (kVar.X(pageEventX, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                            return objH2;
                                        }
                                        bVar2 = bVar3;
                                        pageFetcherSnapshot4 = pageFetcherSnapshot5;
                                        r10 = cVar7;
                                        b2 b2Var3 = b2.f124493a;
                                        r10.f(null);
                                    } else {
                                        bVar2 = bVar;
                                        pageFetcherSnapshot4 = pageFetcherSnapshot3;
                                    }
                                    if (pageFetcherSnapshot4.remoteMediatorConnection != null) {
                                        page = (q0.b.Page) bVar2;
                                        if (page.m() != null || page.l() == null) {
                                            holder6 = pageFetcherSnapshot4.stateHolder;
                                            cVar8 = ((PageFetcherSnapshotState.Holder) holder6).lock;
                                            pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot4;
                                            pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar2;
                                            pageFetcherSnapshot$doInitialLoad$1.f25824g = holder6;
                                            pageFetcherSnapshot$doInitialLoad$1.f25825h = cVar8;
                                            pageFetcherSnapshot$doInitialLoad$1.f25820c = 8;
                                            if (cVar8.e(null, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                                return objH2;
                                            }
                                            cVar9 = cVar8;
                                            pageFetcherSnapshot6 = pageFetcherSnapshot4;
                                            try {
                                                pagingStateI = ((PageFetcherSnapshotState.Holder) holder6).state.i(pageFetcherSnapshot6.lastHint);
                                                cVar9.f(null);
                                                page2 = (q0.b.Page) bVar2;
                                                if (page2.m() == null) {
                                                    pageFetcherSnapshot6.remoteMediatorConnection.c(LoadType.PREPEND, pagingStateI);
                                                }
                                                if (page2.l() == null) {
                                                    pageFetcherSnapshot6.remoteMediatorConnection.c(LoadType.APPEND, pagingStateI);
                                                }
                                            } catch (Throwable th3) {
                                                cVar9.f(null);
                                                throw th3;
                                            }
                                        }
                                    }
                                } catch (Throwable th4) {
                                    cVar5.f(null);
                                    throw th4;
                                }
                            } catch (Throwable th5) {
                                cVar4.f(null);
                                throw th5;
                            }
                        } else if (bVar instanceof q0.b.Error) {
                            holder2 = pageFetcherSnapshot3.stateHolder;
                            cVar3 = ((PageFetcherSnapshotState.Holder) holder2).lock;
                            pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot3;
                            pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar;
                            pageFetcherSnapshot$doInitialLoad$1.f25824g = holder2;
                            pageFetcherSnapshot$doInitialLoad$1.f25825h = cVar3;
                            pageFetcherSnapshot$doInitialLoad$1.f25820c = 9;
                            if (cVar3.e(null, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                return objH2;
                            }
                            try {
                                pageFetcherSnapshotState3 = ((PageFetcherSnapshotState.Holder) holder2).state;
                                error = new v.Error(((q0.b.Error) bVar).d());
                                loadType2 = LoadType.REFRESH;
                                if (pageFetcherSnapshotState3.w(loadType2, error)) {
                                    kVar2 = pageFetcherSnapshot3.pageEventCh;
                                    loadStateUpdate = new PageEvent.LoadStateUpdate(loadType2, false, error);
                                    pageFetcherSnapshot$doInitialLoad$1.f25822e = cVar3;
                                    pageFetcherSnapshot$doInitialLoad$1.f25823f = null;
                                    pageFetcherSnapshot$doInitialLoad$1.f25824g = null;
                                    pageFetcherSnapshot$doInitialLoad$1.f25825h = null;
                                    pageFetcherSnapshot$doInitialLoad$1.f25820c = 10;
                                    if (kVar2.X(loadStateUpdate, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                        return objH2;
                                    }
                                }
                                cVar10 = cVar3;
                                b2 b2Var4 = b2.f124493a;
                                cVar10.f(null);
                            } catch (Throwable th6) {
                                cVar10 = cVar3;
                                th2 = th6;
                                cVar10.f(null);
                                throw th2;
                            }
                        }
                        return b2.f124493a;
                    case 1:
                        kotlinx.coroutines.sync.c cVar12 = (kotlinx.coroutines.sync.c) pageFetcherSnapshot$doInitialLoad$1.f25824g;
                        holder = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doInitialLoad$1.f25823f;
                        pageFetcherSnapshot = (PageFetcherSnapshot) pageFetcherSnapshot$doInitialLoad$1.f25822e;
                        kotlin.t0.n(objH);
                        cVar2 = cVar12;
                        pageFetcherSnapshotState = ((PageFetcherSnapshotState.Holder) holder).state;
                        loadType = LoadType.REFRESH;
                        pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot;
                        pageFetcherSnapshot$doInitialLoad$1.f25823f = cVar2;
                        pageFetcherSnapshot$doInitialLoad$1.f25824g = null;
                        pageFetcherSnapshot$doInitialLoad$1.f25820c = 2;
                        if (pageFetcherSnapshot.z(pageFetcherSnapshotState, loadType, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                            return objH2;
                        }
                        pageFetcherSnapshot2 = pageFetcherSnapshot;
                        r10 = cVar2;
                        b2 b2Var5 = b2.f124493a;
                        r10.f(null);
                        q0.a<Key> aVarW2 = pageFetcherSnapshot2.w(LoadType.REFRESH, pageFetcherSnapshot2.initialKey);
                        q0<Key, Value> q0Var2 = pageFetcherSnapshot2.pagingSource;
                        pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot2;
                        pageFetcherSnapshot$doInitialLoad$1.f25823f = null;
                        pageFetcherSnapshot$doInitialLoad$1.f25820c = 3;
                        objH = q0Var2.h(aVarW2, pageFetcherSnapshot$doInitialLoad$1);
                        if (objH == objH2) {
                            return objH2;
                        }
                        pageFetcherSnapshot3 = pageFetcherSnapshot2;
                        bVar = (q0.b) objH;
                        if (bVar instanceof q0.b.Page) {
                            holder3 = pageFetcherSnapshot3.stateHolder;
                            cVar4 = ((PageFetcherSnapshotState.Holder) holder3).lock;
                            pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot3;
                            pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar;
                            pageFetcherSnapshot$doInitialLoad$1.f25824g = holder3;
                            pageFetcherSnapshot$doInitialLoad$1.f25825h = cVar4;
                            pageFetcherSnapshot$doInitialLoad$1.f25820c = 4;
                            if (cVar4.e(null, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                return objH2;
                            }
                            Boolean boolA2 = kotlin.coroutines.jvm.internal.a.a(((PageFetcherSnapshotState.Holder) holder3).state.t(0, LoadType.REFRESH, (q0.b.Page) bVar));
                            cVar4.f(null);
                            zBooleanValue = boolA2.booleanValue();
                            holder4 = pageFetcherSnapshot3.stateHolder;
                            cVar5 = ((PageFetcherSnapshotState.Holder) holder4).lock;
                            pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot3;
                            pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar;
                            pageFetcherSnapshot$doInitialLoad$1.f25824g = holder4;
                            pageFetcherSnapshot$doInitialLoad$1.f25825h = cVar5;
                            pageFetcherSnapshot$doInitialLoad$1.f25826i = zBooleanValue;
                            pageFetcherSnapshot$doInitialLoad$1.f25820c = 5;
                            if (cVar5.e(null, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                return objH2;
                            }
                            pageFetcherSnapshotState2 = ((PageFetcherSnapshotState.Holder) holder4).state;
                            LoadType loadType4 = LoadType.REFRESH;
                            companion = v.NotLoading.INSTANCE;
                            pageFetcherSnapshotState2.w(loadType4, companion.b());
                            if (((q0.b.Page) bVar).m() == null) {
                                pageFetcherSnapshotState2.w(LoadType.PREPEND, companion.a());
                            }
                            if (((q0.b.Page) bVar).l() == null) {
                                pageFetcherSnapshotState2.w(LoadType.APPEND, companion.a());
                            }
                            b2 b2Var6 = b2.f124493a;
                            cVar5.f(null);
                            if (zBooleanValue) {
                                holder5 = pageFetcherSnapshot3.stateHolder;
                                cVar6 = ((PageFetcherSnapshotState.Holder) holder5).lock;
                                pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot3;
                                pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar;
                                pageFetcherSnapshot$doInitialLoad$1.f25824g = holder5;
                                pageFetcherSnapshot$doInitialLoad$1.f25825h = cVar6;
                                pageFetcherSnapshot$doInitialLoad$1.f25820c = 6;
                                if (cVar6.e(null, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                    return objH2;
                                }
                                cVar7 = cVar6;
                                bVar3 = bVar;
                                pageFetcherSnapshot5 = pageFetcherSnapshot3;
                                PageFetcherSnapshotState pageFetcherSnapshotState5 = ((PageFetcherSnapshotState.Holder) holder5).state;
                                kVar = pageFetcherSnapshot5.pageEventCh;
                                pageEventX = pageFetcherSnapshotState5.x((q0.b.Page) bVar3, LoadType.REFRESH);
                                pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot5;
                                pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar3;
                                pageFetcherSnapshot$doInitialLoad$1.f25824g = cVar7;
                                pageFetcherSnapshot$doInitialLoad$1.f25825h = null;
                                pageFetcherSnapshot$doInitialLoad$1.f25820c = 7;
                                if (kVar.X(pageEventX, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                    return objH2;
                                }
                                bVar2 = bVar3;
                                pageFetcherSnapshot4 = pageFetcherSnapshot5;
                                r10 = cVar7;
                                b2 b2Var7 = b2.f124493a;
                                r10.f(null);
                            } else {
                                bVar2 = bVar;
                                pageFetcherSnapshot4 = pageFetcherSnapshot3;
                            }
                            if (pageFetcherSnapshot4.remoteMediatorConnection != null) {
                                page = (q0.b.Page) bVar2;
                                if (page.m() != null) {
                                }
                                holder6 = pageFetcherSnapshot4.stateHolder;
                                cVar8 = ((PageFetcherSnapshotState.Holder) holder6).lock;
                                pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot4;
                                pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar2;
                                pageFetcherSnapshot$doInitialLoad$1.f25824g = holder6;
                                pageFetcherSnapshot$doInitialLoad$1.f25825h = cVar8;
                                pageFetcherSnapshot$doInitialLoad$1.f25820c = 8;
                                if (cVar8.e(null, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                    return objH2;
                                }
                                cVar9 = cVar8;
                                pageFetcherSnapshot6 = pageFetcherSnapshot4;
                                pagingStateI = ((PageFetcherSnapshotState.Holder) holder6).state.i(pageFetcherSnapshot6.lastHint);
                                cVar9.f(null);
                                page2 = (q0.b.Page) bVar2;
                                if (page2.m() == null) {
                                    pageFetcherSnapshot6.remoteMediatorConnection.c(LoadType.PREPEND, pagingStateI);
                                }
                                if (page2.l() == null) {
                                    pageFetcherSnapshot6.remoteMediatorConnection.c(LoadType.APPEND, pagingStateI);
                                }
                            }
                            break;
                        } else if (bVar instanceof q0.b.Error) {
                            holder2 = pageFetcherSnapshot3.stateHolder;
                            cVar3 = ((PageFetcherSnapshotState.Holder) holder2).lock;
                            pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot3;
                            pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar;
                            pageFetcherSnapshot$doInitialLoad$1.f25824g = holder2;
                            pageFetcherSnapshot$doInitialLoad$1.f25825h = cVar3;
                            pageFetcherSnapshot$doInitialLoad$1.f25820c = 9;
                            if (cVar3.e(null, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                return objH2;
                            }
                            pageFetcherSnapshotState3 = ((PageFetcherSnapshotState.Holder) holder2).state;
                            error = new v.Error(((q0.b.Error) bVar).d());
                            loadType2 = LoadType.REFRESH;
                            if (pageFetcherSnapshotState3.w(loadType2, error)) {
                                kVar2 = pageFetcherSnapshot3.pageEventCh;
                                loadStateUpdate = new PageEvent.LoadStateUpdate(loadType2, false, error);
                                pageFetcherSnapshot$doInitialLoad$1.f25822e = cVar3;
                                pageFetcherSnapshot$doInitialLoad$1.f25823f = null;
                                pageFetcherSnapshot$doInitialLoad$1.f25824g = null;
                                pageFetcherSnapshot$doInitialLoad$1.f25825h = null;
                                pageFetcherSnapshot$doInitialLoad$1.f25820c = 10;
                                if (kVar2.X(loadStateUpdate, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                    return objH2;
                                }
                            }
                            cVar10 = cVar3;
                            b2 b2Var8 = b2.f124493a;
                            cVar10.f(null);
                        }
                        return b2.f124493a;
                    case 2:
                        kotlinx.coroutines.sync.c cVar13 = (kotlinx.coroutines.sync.c) pageFetcherSnapshot$doInitialLoad$1.f25823f;
                        pageFetcherSnapshot2 = (PageFetcherSnapshot) pageFetcherSnapshot$doInitialLoad$1.f25822e;
                        kotlin.t0.n(objH);
                        r10 = cVar13;
                        b2 b2Var9 = b2.f124493a;
                        r10.f(null);
                        q0.a<Key> aVarW3 = pageFetcherSnapshot2.w(LoadType.REFRESH, pageFetcherSnapshot2.initialKey);
                        q0<Key, Value> q0Var3 = pageFetcherSnapshot2.pagingSource;
                        pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot2;
                        pageFetcherSnapshot$doInitialLoad$1.f25823f = null;
                        pageFetcherSnapshot$doInitialLoad$1.f25820c = 3;
                        objH = q0Var3.h(aVarW3, pageFetcherSnapshot$doInitialLoad$1);
                        if (objH == objH2) {
                            return objH2;
                        }
                        pageFetcherSnapshot3 = pageFetcherSnapshot2;
                        bVar = (q0.b) objH;
                        if (bVar instanceof q0.b.Page) {
                            holder3 = pageFetcherSnapshot3.stateHolder;
                            cVar4 = ((PageFetcherSnapshotState.Holder) holder3).lock;
                            pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot3;
                            pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar;
                            pageFetcherSnapshot$doInitialLoad$1.f25824g = holder3;
                            pageFetcherSnapshot$doInitialLoad$1.f25825h = cVar4;
                            pageFetcherSnapshot$doInitialLoad$1.f25820c = 4;
                            if (cVar4.e(null, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                return objH2;
                            }
                            Boolean boolA3 = kotlin.coroutines.jvm.internal.a.a(((PageFetcherSnapshotState.Holder) holder3).state.t(0, LoadType.REFRESH, (q0.b.Page) bVar));
                            cVar4.f(null);
                            zBooleanValue = boolA3.booleanValue();
                            holder4 = pageFetcherSnapshot3.stateHolder;
                            cVar5 = ((PageFetcherSnapshotState.Holder) holder4).lock;
                            pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot3;
                            pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar;
                            pageFetcherSnapshot$doInitialLoad$1.f25824g = holder4;
                            pageFetcherSnapshot$doInitialLoad$1.f25825h = cVar5;
                            pageFetcherSnapshot$doInitialLoad$1.f25826i = zBooleanValue;
                            pageFetcherSnapshot$doInitialLoad$1.f25820c = 5;
                            if (cVar5.e(null, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                return objH2;
                            }
                            pageFetcherSnapshotState2 = ((PageFetcherSnapshotState.Holder) holder4).state;
                            LoadType loadType5 = LoadType.REFRESH;
                            companion = v.NotLoading.INSTANCE;
                            pageFetcherSnapshotState2.w(loadType5, companion.b());
                            if (((q0.b.Page) bVar).m() == null) {
                                pageFetcherSnapshotState2.w(LoadType.PREPEND, companion.a());
                            }
                            if (((q0.b.Page) bVar).l() == null) {
                                pageFetcherSnapshotState2.w(LoadType.APPEND, companion.a());
                            }
                            b2 b2Var10 = b2.f124493a;
                            cVar5.f(null);
                            if (zBooleanValue) {
                                holder5 = pageFetcherSnapshot3.stateHolder;
                                cVar6 = ((PageFetcherSnapshotState.Holder) holder5).lock;
                                pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot3;
                                pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar;
                                pageFetcherSnapshot$doInitialLoad$1.f25824g = holder5;
                                pageFetcherSnapshot$doInitialLoad$1.f25825h = cVar6;
                                pageFetcherSnapshot$doInitialLoad$1.f25820c = 6;
                                if (cVar6.e(null, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                    return objH2;
                                }
                                cVar7 = cVar6;
                                bVar3 = bVar;
                                pageFetcherSnapshot5 = pageFetcherSnapshot3;
                                PageFetcherSnapshotState pageFetcherSnapshotState6 = ((PageFetcherSnapshotState.Holder) holder5).state;
                                kVar = pageFetcherSnapshot5.pageEventCh;
                                pageEventX = pageFetcherSnapshotState6.x((q0.b.Page) bVar3, LoadType.REFRESH);
                                pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot5;
                                pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar3;
                                pageFetcherSnapshot$doInitialLoad$1.f25824g = cVar7;
                                pageFetcherSnapshot$doInitialLoad$1.f25825h = null;
                                pageFetcherSnapshot$doInitialLoad$1.f25820c = 7;
                                if (kVar.X(pageEventX, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                    return objH2;
                                }
                                bVar2 = bVar3;
                                pageFetcherSnapshot4 = pageFetcherSnapshot5;
                                r10 = cVar7;
                                b2 b2Var11 = b2.f124493a;
                                r10.f(null);
                            } else {
                                bVar2 = bVar;
                                pageFetcherSnapshot4 = pageFetcherSnapshot3;
                            }
                            if (pageFetcherSnapshot4.remoteMediatorConnection != null) {
                                page = (q0.b.Page) bVar2;
                                if (page.m() != null) {
                                }
                                holder6 = pageFetcherSnapshot4.stateHolder;
                                cVar8 = ((PageFetcherSnapshotState.Holder) holder6).lock;
                                pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot4;
                                pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar2;
                                pageFetcherSnapshot$doInitialLoad$1.f25824g = holder6;
                                pageFetcherSnapshot$doInitialLoad$1.f25825h = cVar8;
                                pageFetcherSnapshot$doInitialLoad$1.f25820c = 8;
                                if (cVar8.e(null, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                    return objH2;
                                }
                                cVar9 = cVar8;
                                pageFetcherSnapshot6 = pageFetcherSnapshot4;
                                pagingStateI = ((PageFetcherSnapshotState.Holder) holder6).state.i(pageFetcherSnapshot6.lastHint);
                                cVar9.f(null);
                                page2 = (q0.b.Page) bVar2;
                                if (page2.m() == null) {
                                    pageFetcherSnapshot6.remoteMediatorConnection.c(LoadType.PREPEND, pagingStateI);
                                }
                                if (page2.l() == null) {
                                    pageFetcherSnapshot6.remoteMediatorConnection.c(LoadType.APPEND, pagingStateI);
                                }
                            }
                            break;
                        } else if (bVar instanceof q0.b.Error) {
                            holder2 = pageFetcherSnapshot3.stateHolder;
                            cVar3 = ((PageFetcherSnapshotState.Holder) holder2).lock;
                            pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot3;
                            pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar;
                            pageFetcherSnapshot$doInitialLoad$1.f25824g = holder2;
                            pageFetcherSnapshot$doInitialLoad$1.f25825h = cVar3;
                            pageFetcherSnapshot$doInitialLoad$1.f25820c = 9;
                            if (cVar3.e(null, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                return objH2;
                            }
                            pageFetcherSnapshotState3 = ((PageFetcherSnapshotState.Holder) holder2).state;
                            error = new v.Error(((q0.b.Error) bVar).d());
                            loadType2 = LoadType.REFRESH;
                            if (pageFetcherSnapshotState3.w(loadType2, error)) {
                                kVar2 = pageFetcherSnapshot3.pageEventCh;
                                loadStateUpdate = new PageEvent.LoadStateUpdate(loadType2, false, error);
                                pageFetcherSnapshot$doInitialLoad$1.f25822e = cVar3;
                                pageFetcherSnapshot$doInitialLoad$1.f25823f = null;
                                pageFetcherSnapshot$doInitialLoad$1.f25824g = null;
                                pageFetcherSnapshot$doInitialLoad$1.f25825h = null;
                                pageFetcherSnapshot$doInitialLoad$1.f25820c = 10;
                                if (kVar2.X(loadStateUpdate, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                    return objH2;
                                }
                            }
                            cVar10 = cVar3;
                            b2 b2Var12 = b2.f124493a;
                            cVar10.f(null);
                        }
                        return b2.f124493a;
                    case 3:
                        PageFetcherSnapshot pageFetcherSnapshot7 = (PageFetcherSnapshot) pageFetcherSnapshot$doInitialLoad$1.f25822e;
                        kotlin.t0.n(objH);
                        pageFetcherSnapshot3 = pageFetcherSnapshot7;
                        bVar = (q0.b) objH;
                        if (bVar instanceof q0.b.Page) {
                            holder3 = pageFetcherSnapshot3.stateHolder;
                            cVar4 = ((PageFetcherSnapshotState.Holder) holder3).lock;
                            pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot3;
                            pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar;
                            pageFetcherSnapshot$doInitialLoad$1.f25824g = holder3;
                            pageFetcherSnapshot$doInitialLoad$1.f25825h = cVar4;
                            pageFetcherSnapshot$doInitialLoad$1.f25820c = 4;
                            if (cVar4.e(null, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                return objH2;
                            }
                            Boolean boolA4 = kotlin.coroutines.jvm.internal.a.a(((PageFetcherSnapshotState.Holder) holder3).state.t(0, LoadType.REFRESH, (q0.b.Page) bVar));
                            cVar4.f(null);
                            zBooleanValue = boolA4.booleanValue();
                            holder4 = pageFetcherSnapshot3.stateHolder;
                            cVar5 = ((PageFetcherSnapshotState.Holder) holder4).lock;
                            pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot3;
                            pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar;
                            pageFetcherSnapshot$doInitialLoad$1.f25824g = holder4;
                            pageFetcherSnapshot$doInitialLoad$1.f25825h = cVar5;
                            pageFetcherSnapshot$doInitialLoad$1.f25826i = zBooleanValue;
                            pageFetcherSnapshot$doInitialLoad$1.f25820c = 5;
                            if (cVar5.e(null, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                return objH2;
                            }
                            pageFetcherSnapshotState2 = ((PageFetcherSnapshotState.Holder) holder4).state;
                            LoadType loadType6 = LoadType.REFRESH;
                            companion = v.NotLoading.INSTANCE;
                            pageFetcherSnapshotState2.w(loadType6, companion.b());
                            if (((q0.b.Page) bVar).m() == null) {
                                pageFetcherSnapshotState2.w(LoadType.PREPEND, companion.a());
                            }
                            if (((q0.b.Page) bVar).l() == null) {
                                pageFetcherSnapshotState2.w(LoadType.APPEND, companion.a());
                            }
                            b2 b2Var13 = b2.f124493a;
                            cVar5.f(null);
                            if (zBooleanValue) {
                                holder5 = pageFetcherSnapshot3.stateHolder;
                                cVar6 = ((PageFetcherSnapshotState.Holder) holder5).lock;
                                pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot3;
                                pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar;
                                pageFetcherSnapshot$doInitialLoad$1.f25824g = holder5;
                                pageFetcherSnapshot$doInitialLoad$1.f25825h = cVar6;
                                pageFetcherSnapshot$doInitialLoad$1.f25820c = 6;
                                if (cVar6.e(null, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                    return objH2;
                                }
                                cVar7 = cVar6;
                                bVar3 = bVar;
                                pageFetcherSnapshot5 = pageFetcherSnapshot3;
                                PageFetcherSnapshotState pageFetcherSnapshotState7 = ((PageFetcherSnapshotState.Holder) holder5).state;
                                kVar = pageFetcherSnapshot5.pageEventCh;
                                pageEventX = pageFetcherSnapshotState7.x((q0.b.Page) bVar3, LoadType.REFRESH);
                                pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot5;
                                pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar3;
                                pageFetcherSnapshot$doInitialLoad$1.f25824g = cVar7;
                                pageFetcherSnapshot$doInitialLoad$1.f25825h = null;
                                pageFetcherSnapshot$doInitialLoad$1.f25820c = 7;
                                if (kVar.X(pageEventX, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                    return objH2;
                                }
                                bVar2 = bVar3;
                                pageFetcherSnapshot4 = pageFetcherSnapshot5;
                                r10 = cVar7;
                                b2 b2Var14 = b2.f124493a;
                                r10.f(null);
                            } else {
                                bVar2 = bVar;
                                pageFetcherSnapshot4 = pageFetcherSnapshot3;
                            }
                            if (pageFetcherSnapshot4.remoteMediatorConnection != null) {
                                page = (q0.b.Page) bVar2;
                                if (page.m() != null) {
                                }
                                holder6 = pageFetcherSnapshot4.stateHolder;
                                cVar8 = ((PageFetcherSnapshotState.Holder) holder6).lock;
                                pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot4;
                                pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar2;
                                pageFetcherSnapshot$doInitialLoad$1.f25824g = holder6;
                                pageFetcherSnapshot$doInitialLoad$1.f25825h = cVar8;
                                pageFetcherSnapshot$doInitialLoad$1.f25820c = 8;
                                if (cVar8.e(null, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                    return objH2;
                                }
                                cVar9 = cVar8;
                                pageFetcherSnapshot6 = pageFetcherSnapshot4;
                                pagingStateI = ((PageFetcherSnapshotState.Holder) holder6).state.i(pageFetcherSnapshot6.lastHint);
                                cVar9.f(null);
                                page2 = (q0.b.Page) bVar2;
                                if (page2.m() == null) {
                                    pageFetcherSnapshot6.remoteMediatorConnection.c(LoadType.PREPEND, pagingStateI);
                                }
                                if (page2.l() == null) {
                                    pageFetcherSnapshot6.remoteMediatorConnection.c(LoadType.APPEND, pagingStateI);
                                }
                            }
                            break;
                        } else if (bVar instanceof q0.b.Error) {
                            holder2 = pageFetcherSnapshot3.stateHolder;
                            cVar3 = ((PageFetcherSnapshotState.Holder) holder2).lock;
                            pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot3;
                            pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar;
                            pageFetcherSnapshot$doInitialLoad$1.f25824g = holder2;
                            pageFetcherSnapshot$doInitialLoad$1.f25825h = cVar3;
                            pageFetcherSnapshot$doInitialLoad$1.f25820c = 9;
                            if (cVar3.e(null, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                return objH2;
                            }
                            pageFetcherSnapshotState3 = ((PageFetcherSnapshotState.Holder) holder2).state;
                            error = new v.Error(((q0.b.Error) bVar).d());
                            loadType2 = LoadType.REFRESH;
                            if (pageFetcherSnapshotState3.w(loadType2, error)) {
                                kVar2 = pageFetcherSnapshot3.pageEventCh;
                                loadStateUpdate = new PageEvent.LoadStateUpdate(loadType2, false, error);
                                pageFetcherSnapshot$doInitialLoad$1.f25822e = cVar3;
                                pageFetcherSnapshot$doInitialLoad$1.f25823f = null;
                                pageFetcherSnapshot$doInitialLoad$1.f25824g = null;
                                pageFetcherSnapshot$doInitialLoad$1.f25825h = null;
                                pageFetcherSnapshot$doInitialLoad$1.f25820c = 10;
                                if (kVar2.X(loadStateUpdate, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                    return objH2;
                                }
                            }
                            cVar10 = cVar3;
                            b2 b2Var15 = b2.f124493a;
                            cVar10.f(null);
                        }
                        return b2.f124493a;
                    case 4:
                        cVar4 = (kotlinx.coroutines.sync.c) pageFetcherSnapshot$doInitialLoad$1.f25825h;
                        holder3 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doInitialLoad$1.f25824g;
                        bVar = (q0.b) pageFetcherSnapshot$doInitialLoad$1.f25823f;
                        pageFetcherSnapshot3 = (PageFetcherSnapshot) pageFetcherSnapshot$doInitialLoad$1.f25822e;
                        kotlin.t0.n(objH);
                        Boolean boolA5 = kotlin.coroutines.jvm.internal.a.a(((PageFetcherSnapshotState.Holder) holder3).state.t(0, LoadType.REFRESH, (q0.b.Page) bVar));
                        cVar4.f(null);
                        zBooleanValue = boolA5.booleanValue();
                        holder4 = pageFetcherSnapshot3.stateHolder;
                        cVar5 = ((PageFetcherSnapshotState.Holder) holder4).lock;
                        pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot3;
                        pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar;
                        pageFetcherSnapshot$doInitialLoad$1.f25824g = holder4;
                        pageFetcherSnapshot$doInitialLoad$1.f25825h = cVar5;
                        pageFetcherSnapshot$doInitialLoad$1.f25826i = zBooleanValue;
                        pageFetcherSnapshot$doInitialLoad$1.f25820c = 5;
                        if (cVar5.e(null, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                            return objH2;
                        }
                        pageFetcherSnapshotState2 = ((PageFetcherSnapshotState.Holder) holder4).state;
                        LoadType loadType7 = LoadType.REFRESH;
                        companion = v.NotLoading.INSTANCE;
                        pageFetcherSnapshotState2.w(loadType7, companion.b());
                        if (((q0.b.Page) bVar).m() == null) {
                            pageFetcherSnapshotState2.w(LoadType.PREPEND, companion.a());
                        }
                        if (((q0.b.Page) bVar).l() == null) {
                            pageFetcherSnapshotState2.w(LoadType.APPEND, companion.a());
                        }
                        b2 b2Var16 = b2.f124493a;
                        cVar5.f(null);
                        if (zBooleanValue) {
                            holder5 = pageFetcherSnapshot3.stateHolder;
                            cVar6 = ((PageFetcherSnapshotState.Holder) holder5).lock;
                            pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot3;
                            pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar;
                            pageFetcherSnapshot$doInitialLoad$1.f25824g = holder5;
                            pageFetcherSnapshot$doInitialLoad$1.f25825h = cVar6;
                            pageFetcherSnapshot$doInitialLoad$1.f25820c = 6;
                            if (cVar6.e(null, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                return objH2;
                            }
                            cVar7 = cVar6;
                            bVar3 = bVar;
                            pageFetcherSnapshot5 = pageFetcherSnapshot3;
                            PageFetcherSnapshotState pageFetcherSnapshotState8 = ((PageFetcherSnapshotState.Holder) holder5).state;
                            kVar = pageFetcherSnapshot5.pageEventCh;
                            pageEventX = pageFetcherSnapshotState8.x((q0.b.Page) bVar3, LoadType.REFRESH);
                            pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot5;
                            pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar3;
                            pageFetcherSnapshot$doInitialLoad$1.f25824g = cVar7;
                            pageFetcherSnapshot$doInitialLoad$1.f25825h = null;
                            pageFetcherSnapshot$doInitialLoad$1.f25820c = 7;
                            if (kVar.X(pageEventX, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                return objH2;
                            }
                            bVar2 = bVar3;
                            pageFetcherSnapshot4 = pageFetcherSnapshot5;
                            r10 = cVar7;
                            b2 b2Var17 = b2.f124493a;
                            r10.f(null);
                        } else {
                            bVar2 = bVar;
                            pageFetcherSnapshot4 = pageFetcherSnapshot3;
                        }
                        if (pageFetcherSnapshot4.remoteMediatorConnection != null) {
                            page = (q0.b.Page) bVar2;
                            if (page.m() != null) {
                            }
                            holder6 = pageFetcherSnapshot4.stateHolder;
                            cVar8 = ((PageFetcherSnapshotState.Holder) holder6).lock;
                            pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot4;
                            pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar2;
                            pageFetcherSnapshot$doInitialLoad$1.f25824g = holder6;
                            pageFetcherSnapshot$doInitialLoad$1.f25825h = cVar8;
                            pageFetcherSnapshot$doInitialLoad$1.f25820c = 8;
                            if (cVar8.e(null, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                return objH2;
                            }
                            cVar9 = cVar8;
                            pageFetcherSnapshot6 = pageFetcherSnapshot4;
                            pagingStateI = ((PageFetcherSnapshotState.Holder) holder6).state.i(pageFetcherSnapshot6.lastHint);
                            cVar9.f(null);
                            page2 = (q0.b.Page) bVar2;
                            if (page2.m() == null) {
                                pageFetcherSnapshot6.remoteMediatorConnection.c(LoadType.PREPEND, pagingStateI);
                            }
                            if (page2.l() == null) {
                                pageFetcherSnapshot6.remoteMediatorConnection.c(LoadType.APPEND, pagingStateI);
                            }
                            break;
                        }
                        return b2.f124493a;
                    case 5:
                        zBooleanValue = pageFetcherSnapshot$doInitialLoad$1.f25826i;
                        cVar5 = (kotlinx.coroutines.sync.c) pageFetcherSnapshot$doInitialLoad$1.f25825h;
                        holder4 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doInitialLoad$1.f25824g;
                        bVar = (q0.b) pageFetcherSnapshot$doInitialLoad$1.f25823f;
                        pageFetcherSnapshot3 = (PageFetcherSnapshot) pageFetcherSnapshot$doInitialLoad$1.f25822e;
                        kotlin.t0.n(objH);
                        pageFetcherSnapshotState2 = ((PageFetcherSnapshotState.Holder) holder4).state;
                        LoadType loadType8 = LoadType.REFRESH;
                        companion = v.NotLoading.INSTANCE;
                        pageFetcherSnapshotState2.w(loadType8, companion.b());
                        if (((q0.b.Page) bVar).m() == null) {
                            pageFetcherSnapshotState2.w(LoadType.PREPEND, companion.a());
                        }
                        if (((q0.b.Page) bVar).l() == null) {
                            pageFetcherSnapshotState2.w(LoadType.APPEND, companion.a());
                        }
                        b2 b2Var18 = b2.f124493a;
                        cVar5.f(null);
                        if (zBooleanValue) {
                            holder5 = pageFetcherSnapshot3.stateHolder;
                            cVar6 = ((PageFetcherSnapshotState.Holder) holder5).lock;
                            pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot3;
                            pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar;
                            pageFetcherSnapshot$doInitialLoad$1.f25824g = holder5;
                            pageFetcherSnapshot$doInitialLoad$1.f25825h = cVar6;
                            pageFetcherSnapshot$doInitialLoad$1.f25820c = 6;
                            if (cVar6.e(null, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                return objH2;
                            }
                            cVar7 = cVar6;
                            bVar3 = bVar;
                            pageFetcherSnapshot5 = pageFetcherSnapshot3;
                            PageFetcherSnapshotState pageFetcherSnapshotState9 = ((PageFetcherSnapshotState.Holder) holder5).state;
                            kVar = pageFetcherSnapshot5.pageEventCh;
                            pageEventX = pageFetcherSnapshotState9.x((q0.b.Page) bVar3, LoadType.REFRESH);
                            pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot5;
                            pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar3;
                            pageFetcherSnapshot$doInitialLoad$1.f25824g = cVar7;
                            pageFetcherSnapshot$doInitialLoad$1.f25825h = null;
                            pageFetcherSnapshot$doInitialLoad$1.f25820c = 7;
                            if (kVar.X(pageEventX, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                return objH2;
                            }
                            bVar2 = bVar3;
                            pageFetcherSnapshot4 = pageFetcherSnapshot5;
                            r10 = cVar7;
                            b2 b2Var19 = b2.f124493a;
                            r10.f(null);
                        } else {
                            bVar2 = bVar;
                            pageFetcherSnapshot4 = pageFetcherSnapshot3;
                        }
                        if (pageFetcherSnapshot4.remoteMediatorConnection != null) {
                            page = (q0.b.Page) bVar2;
                            if (page.m() != null) {
                            }
                            holder6 = pageFetcherSnapshot4.stateHolder;
                            cVar8 = ((PageFetcherSnapshotState.Holder) holder6).lock;
                            pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot4;
                            pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar2;
                            pageFetcherSnapshot$doInitialLoad$1.f25824g = holder6;
                            pageFetcherSnapshot$doInitialLoad$1.f25825h = cVar8;
                            pageFetcherSnapshot$doInitialLoad$1.f25820c = 8;
                            if (cVar8.e(null, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                return objH2;
                            }
                            cVar9 = cVar8;
                            pageFetcherSnapshot6 = pageFetcherSnapshot4;
                            pagingStateI = ((PageFetcherSnapshotState.Holder) holder6).state.i(pageFetcherSnapshot6.lastHint);
                            cVar9.f(null);
                            page2 = (q0.b.Page) bVar2;
                            if (page2.m() == null) {
                                pageFetcherSnapshot6.remoteMediatorConnection.c(LoadType.PREPEND, pagingStateI);
                            }
                            if (page2.l() == null) {
                                pageFetcherSnapshot6.remoteMediatorConnection.c(LoadType.APPEND, pagingStateI);
                            }
                            break;
                        }
                        return b2.f124493a;
                    case 6:
                        kotlinx.coroutines.sync.c cVar14 = (kotlinx.coroutines.sync.c) pageFetcherSnapshot$doInitialLoad$1.f25825h;
                        holder5 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doInitialLoad$1.f25824g;
                        bVar3 = (q0.b) pageFetcherSnapshot$doInitialLoad$1.f25823f;
                        pageFetcherSnapshot5 = (PageFetcherSnapshot) pageFetcherSnapshot$doInitialLoad$1.f25822e;
                        kotlin.t0.n(objH);
                        cVar7 = cVar14;
                        PageFetcherSnapshotState pageFetcherSnapshotState10 = ((PageFetcherSnapshotState.Holder) holder5).state;
                        kVar = pageFetcherSnapshot5.pageEventCh;
                        pageEventX = pageFetcherSnapshotState10.x((q0.b.Page) bVar3, LoadType.REFRESH);
                        pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot5;
                        pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar3;
                        pageFetcherSnapshot$doInitialLoad$1.f25824g = cVar7;
                        pageFetcherSnapshot$doInitialLoad$1.f25825h = null;
                        pageFetcherSnapshot$doInitialLoad$1.f25820c = 7;
                        if (kVar.X(pageEventX, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                            return objH2;
                        }
                        bVar2 = bVar3;
                        pageFetcherSnapshot4 = pageFetcherSnapshot5;
                        r10 = cVar7;
                        b2 b2Var110 = b2.f124493a;
                        r10.f(null);
                        if (pageFetcherSnapshot4.remoteMediatorConnection != null) {
                            page = (q0.b.Page) bVar2;
                            if (page.m() != null) {
                            }
                            holder6 = pageFetcherSnapshot4.stateHolder;
                            cVar8 = ((PageFetcherSnapshotState.Holder) holder6).lock;
                            pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot4;
                            pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar2;
                            pageFetcherSnapshot$doInitialLoad$1.f25824g = holder6;
                            pageFetcherSnapshot$doInitialLoad$1.f25825h = cVar8;
                            pageFetcherSnapshot$doInitialLoad$1.f25820c = 8;
                            if (cVar8.e(null, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                return objH2;
                            }
                            cVar9 = cVar8;
                            pageFetcherSnapshot6 = pageFetcherSnapshot4;
                            pagingStateI = ((PageFetcherSnapshotState.Holder) holder6).state.i(pageFetcherSnapshot6.lastHint);
                            cVar9.f(null);
                            page2 = (q0.b.Page) bVar2;
                            if (page2.m() == null) {
                                pageFetcherSnapshot6.remoteMediatorConnection.c(LoadType.PREPEND, pagingStateI);
                            }
                            if (page2.l() == null) {
                                pageFetcherSnapshot6.remoteMediatorConnection.c(LoadType.APPEND, pagingStateI);
                            }
                            break;
                        }
                        return b2.f124493a;
                    case 7:
                        kotlinx.coroutines.sync.c cVar15 = (kotlinx.coroutines.sync.c) pageFetcherSnapshot$doInitialLoad$1.f25824g;
                        bVar2 = (q0.b) pageFetcherSnapshot$doInitialLoad$1.f25823f;
                        pageFetcherSnapshot4 = (PageFetcherSnapshot) pageFetcherSnapshot$doInitialLoad$1.f25822e;
                        kotlin.t0.n(objH);
                        r10 = cVar15;
                        b2 b2Var111 = b2.f124493a;
                        r10.f(null);
                        if (pageFetcherSnapshot4.remoteMediatorConnection != null) {
                            page = (q0.b.Page) bVar2;
                            if (page.m() != null) {
                            }
                            holder6 = pageFetcherSnapshot4.stateHolder;
                            cVar8 = ((PageFetcherSnapshotState.Holder) holder6).lock;
                            pageFetcherSnapshot$doInitialLoad$1.f25822e = pageFetcherSnapshot4;
                            pageFetcherSnapshot$doInitialLoad$1.f25823f = bVar2;
                            pageFetcherSnapshot$doInitialLoad$1.f25824g = holder6;
                            pageFetcherSnapshot$doInitialLoad$1.f25825h = cVar8;
                            pageFetcherSnapshot$doInitialLoad$1.f25820c = 8;
                            if (cVar8.e(null, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                return objH2;
                            }
                            cVar9 = cVar8;
                            pageFetcherSnapshot6 = pageFetcherSnapshot4;
                            pagingStateI = ((PageFetcherSnapshotState.Holder) holder6).state.i(pageFetcherSnapshot6.lastHint);
                            cVar9.f(null);
                            page2 = (q0.b.Page) bVar2;
                            if (page2.m() == null) {
                                pageFetcherSnapshot6.remoteMediatorConnection.c(LoadType.PREPEND, pagingStateI);
                            }
                            if (page2.l() == null) {
                                pageFetcherSnapshot6.remoteMediatorConnection.c(LoadType.APPEND, pagingStateI);
                            }
                            break;
                        }
                        return b2.f124493a;
                    case 8:
                        cVar9 = (kotlinx.coroutines.sync.c) pageFetcherSnapshot$doInitialLoad$1.f25825h;
                        holder6 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doInitialLoad$1.f25824g;
                        bVar2 = (q0.b) pageFetcherSnapshot$doInitialLoad$1.f25823f;
                        pageFetcherSnapshot6 = (PageFetcherSnapshot) pageFetcherSnapshot$doInitialLoad$1.f25822e;
                        kotlin.t0.n(objH);
                        pagingStateI = ((PageFetcherSnapshotState.Holder) holder6).state.i(pageFetcherSnapshot6.lastHint);
                        cVar9.f(null);
                        page2 = (q0.b.Page) bVar2;
                        if (page2.m() == null) {
                            pageFetcherSnapshot6.remoteMediatorConnection.c(LoadType.PREPEND, pagingStateI);
                        }
                        if (page2.l() == null) {
                            pageFetcherSnapshot6.remoteMediatorConnection.c(LoadType.APPEND, pagingStateI);
                        }
                        return b2.f124493a;
                    case 9:
                        kotlinx.coroutines.sync.c cVar16 = (kotlinx.coroutines.sync.c) pageFetcherSnapshot$doInitialLoad$1.f25825h;
                        holder2 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doInitialLoad$1.f25824g;
                        bVar = (q0.b) pageFetcherSnapshot$doInitialLoad$1.f25823f;
                        pageFetcherSnapshot3 = (PageFetcherSnapshot) pageFetcherSnapshot$doInitialLoad$1.f25822e;
                        kotlin.t0.n(objH);
                        cVar3 = cVar16;
                        pageFetcherSnapshotState3 = ((PageFetcherSnapshotState.Holder) holder2).state;
                        error = new v.Error(((q0.b.Error) bVar).d());
                        loadType2 = LoadType.REFRESH;
                        if (pageFetcherSnapshotState3.w(loadType2, error)) {
                            kVar2 = pageFetcherSnapshot3.pageEventCh;
                            loadStateUpdate = new PageEvent.LoadStateUpdate(loadType2, false, error);
                            pageFetcherSnapshot$doInitialLoad$1.f25822e = cVar3;
                            pageFetcherSnapshot$doInitialLoad$1.f25823f = null;
                            pageFetcherSnapshot$doInitialLoad$1.f25824g = null;
                            pageFetcherSnapshot$doInitialLoad$1.f25825h = null;
                            pageFetcherSnapshot$doInitialLoad$1.f25820c = 10;
                            if (kVar2.X(loadStateUpdate, pageFetcherSnapshot$doInitialLoad$1) == objH2) {
                                return objH2;
                            }
                        }
                        cVar10 = cVar3;
                        b2 b2Var112 = b2.f124493a;
                        cVar10.f(null);
                        return b2.f124493a;
                    case 10:
                        cVar10 = (kotlinx.coroutines.sync.c) pageFetcherSnapshot$doInitialLoad$1.f25822e;
                        try {
                            kotlin.t0.n(objH);
                            b2 b2Var113 = b2.f124493a;
                            cVar10.f(null);
                            return b2.f124493a;
                        } catch (Throwable th7) {
                            th2 = th7;
                            cVar10.f(null);
                            throw th2;
                        }
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th8) {
                r10.f(null);
                throw th8;
            }
        } catch (Throwable th9) {
            r10.f(null);
            throw th9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:103:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:107:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:109:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:111:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:112:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:115:0x0401  */
    /* JADX WARN: Code duplicated, block: B:117:0x0425 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:118:0x0426  */
    /* JADX WARN: Code duplicated, block: B:123:0x044b  */
    /* JADX WARN: Code duplicated, block: B:125:0x045f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0468  */
    /* JADX WARN: Code duplicated, block: B:139:0x0483  */
    /* JADX WARN: Code duplicated, block: B:141:0x0487  */
    /* JADX WARN: Code duplicated, block: B:143:0x04a5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:144:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:147:0x04bf A[Catch: all -> 0x0108, TRY_LEAVE, TryCatch #4 {all -> 0x0108, blocks: (B:145:0x04aa, B:147:0x04bf, B:151:0x04d5, B:158:0x04e6, B:23:0x0103), top: B:258:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x04dd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:154:0x04de  */
    /* JADX WARN: Code duplicated, block: B:163:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:166:0x0508  */
    /* JADX WARN: Code duplicated, block: B:167:0x050b  */
    /* JADX WARN: Code duplicated, block: B:170:0x0536 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:171:0x0537  */
    /* JADX WARN: Code duplicated, block: B:174:0x0550 A[Catch: all -> 0x0681, TRY_LEAVE, TryCatch #0 {all -> 0x0681, blocks: (B:172:0x0542, B:174:0x0550, B:178:0x056e), top: B:251:0x0542 }] */
    /* JADX WARN: Code duplicated, block: B:180:0x0576 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:181:0x0577  */
    /* JADX WARN: Code duplicated, block: B:188:0x05a3 A[Catch: all -> 0x00bd, TryCatch #8 {all -> 0x00bd, blocks: (B:182:0x0580, B:186:0x0590, B:188:0x05a3, B:190:0x05af, B:192:0x05b3, B:194:0x05c0, B:193:0x05ba, B:195:0x05c3, B:199:0x05e5, B:203:0x05f9, B:14:0x0082, B:17:0x00b8), top: B:258:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x05b3 A[Catch: all -> 0x00bd, TryCatch #8 {all -> 0x00bd, blocks: (B:182:0x0580, B:186:0x0590, B:188:0x05a3, B:190:0x05af, B:192:0x05b3, B:194:0x05c0, B:193:0x05ba, B:195:0x05c3, B:199:0x05e5, B:203:0x05f9, B:14:0x0082, B:17:0x00b8), top: B:258:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:193:0x05ba A[Catch: all -> 0x00bd, TryCatch #8 {all -> 0x00bd, blocks: (B:182:0x0580, B:186:0x0590, B:188:0x05a3, B:190:0x05af, B:192:0x05b3, B:194:0x05c0, B:193:0x05ba, B:195:0x05c3, B:199:0x05e5, B:203:0x05f9, B:14:0x0082, B:17:0x00b8), top: B:258:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:201:0x05ed A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:202:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:206:0x0603  */
    /* JADX WARN: Code duplicated, block: B:209:0x060e  */
    /* JADX WARN: Code duplicated, block: B:212:0x0613  */
    /* JADX WARN: Code duplicated, block: B:215:0x061d  */
    /* JADX WARN: Code duplicated, block: B:218:0x0622 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:222:0x064d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:226:0x065e  */
    /* JADX WARN: Code duplicated, block: B:228:0x0667  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:87:0x035b  */
    /* JADX WARN: Code duplicated, block: B:89:0x037d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:90:0x037e  */
    /* JADX WARN: Code duplicated, block: B:93:0x038c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0397  */
    /* JADX WARN: Code duplicated, block: B:97:0x039a  */
    /* JADX WARN: Code duplicated, block: B:98:0x03a2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43, types: [androidx.paging.PageFetcherSnapshot, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r10v55 */
    /* JADX WARN: Type inference failed for: r10v57, types: [androidx.paging.PageFetcherSnapshot] */
    /* JADX WARN: Type inference failed for: r10v60 */
    /* JADX WARN: Type inference failed for: r10v61 */
    /* JADX WARN: Type inference failed for: r12v54, types: [androidx.paging.PageFetcherSnapshot, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v56 */
    /* JADX WARN: Type inference failed for: r12v60 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v16, types: [T] */
    /* JADX WARN: Type inference failed for: r13v46 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r1v16, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlinx.coroutines.sync.c] */
    /* JADX WARN: Type inference failed for: r4v6, types: [kotlinx.coroutines.sync.c] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [kotlinx.coroutines.sync.c] */
    /* JADX WARN: Type inference failed for: r5v40, types: [kotlinx.coroutines.sync.c] */
    /* JADX WARN: Type inference failed for: r5v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v74 */
    /* JADX WARN: Type inference failed for: r5v75 */
    /* JADX WARN: Type inference failed for: r5v76 */
    /* JADX WARN: Type inference failed for: r5v77 */
    /* JADX WARN: Type inference failed for: r5v78 */
    /* JADX WARN: Type inference failed for: r5v79 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v22, types: [androidx.paging.PageFetcherSnapshot] */
    /* JADX WARN: Type inference failed for: r9v23, types: [androidx.paging.PageFetcherSnapshot, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25, types: [androidx.paging.PageFetcherSnapshot, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v26, types: [androidx.paging.PageFetcherSnapshot, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29, types: [androidx.paging.PageFetcherSnapshot, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:217:0x0620 -> B:229:0x066e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:219:0x0624 -> B:229:0x066e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:221:0x064b -> B:256:0x064e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    final /* synthetic */ java.lang.Object r(androidx.paging.LoadType r18, androidx.paging.GenerationalViewportHint r19, kotlin.coroutines.c<? super kotlin.b2> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.r(androidx.paging.LoadType, androidx.paging.k, kotlin.coroutines.c):java.lang.Object");
    }

    @dl.e
    public final Key s() {
        return this.initialKey;
    }

    @dl.d
    public final kotlinx.coroutines.flow.e<PageEvent<Value>> t() {
        return this.pageEventFlow;
    }

    @dl.d
    public final q0<Key, Value> u() {
        return this.pagingSource;
    }

    @dl.e
    public final z0<Key, Value> v() {
        return this.remoteMediatorConnection;
    }

    final /* synthetic */ Object y(LoadType loadType, f1 f1Var, kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        if (f0.f26409b[loadType.ordinal()] != 1) {
            if (!(f1Var != null)) {
                throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint".toString());
            }
            this.hintSharedFlow.d(f1Var);
        } else {
            Object objQ = q(cVar);
            if (objQ == kotlin.coroutines.intrinsics.b.h()) {
                return objQ;
            }
        }
        return b2.f124493a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    final /* synthetic */ Object z(PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, LoadType loadType, kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        PageFetcherSnapshot$setLoading$1 pageFetcherSnapshot$setLoading$1;
        if (cVar instanceof PageFetcherSnapshot$setLoading$1) {
            pageFetcherSnapshot$setLoading$1 = (PageFetcherSnapshot$setLoading$1) cVar;
            int i10 = pageFetcherSnapshot$setLoading$1.f25877c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pageFetcherSnapshot$setLoading$1.f25877c = i10 - Integer.MIN_VALUE;
            } else {
                pageFetcherSnapshot$setLoading$1 = new PageFetcherSnapshot$setLoading$1(this, cVar);
            }
        } else {
            pageFetcherSnapshot$setLoading$1 = new PageFetcherSnapshot$setLoading$1(this, cVar);
        }
        Object obj = pageFetcherSnapshot$setLoading$1.f25876b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = pageFetcherSnapshot$setLoading$1.f25877c;
        if (i11 == 0) {
            kotlin.t0.n(obj);
            v.Loading loading = v.Loading.f26654b;
            if (pageFetcherSnapshotState.w(loadType, loading)) {
                kotlinx.coroutines.channels.k<PageEvent<Value>> kVar = this.pageEventCh;
                PageEvent.LoadStateUpdate loadStateUpdate = new PageEvent.LoadStateUpdate(loadType, false, loading);
                pageFetcherSnapshot$setLoading$1.f25877c = 1;
                if (kVar.X(loadStateUpdate, pageFetcherSnapshot$setLoading$1) == objH) {
                    return objH;
                }
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
