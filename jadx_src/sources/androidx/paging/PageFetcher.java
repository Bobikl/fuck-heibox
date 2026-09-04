package androidx.paging;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: PageFetcher.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0013\u0016B^\u0012(\u0010+\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r0*\u0012\u0006\u0012\u0004\u0018\u00010\u00010)\u0012\b\u0010 \u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010$\u001a\u00020!\u0012\u0016\b\u0002\u0010(\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010%ø\u0001\u0000¢\u0006\u0004\b,\u0010-J:\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\u0007*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u0006\u0010\f\u001a\u00020\nJ5\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R#\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00180\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010(\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Landroidx/paging/PageFetcher;", "", "Key", "Value", "Landroidx/paging/PageFetcherSnapshot;", "Landroidx/paging/x0;", "accessor", "Lkotlinx/coroutines/flow/e;", "Landroidx/paging/PageEvent;", "j", "Lkotlin/b2;", "k", "l", "Landroidx/paging/q0;", "previousPagingSource", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/paging/q0;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/paging/ConflatedEventBus;", "", ak.av, "Landroidx/paging/ConflatedEventBus;", "refreshEvents", "b", "retryEvents", "Landroidx/paging/o0;", ak.aF, "Lkotlinx/coroutines/flow/e;", "i", "()Lkotlinx/coroutines/flow/e;", "flow", "e", "Ljava/lang/Object;", "initialKey", "Landroidx/paging/n0;", "f", "Landroidx/paging/n0;", "config", "Landroidx/paging/RemoteMediator;", "g", "Landroidx/paging/RemoteMediator;", "remoteMediator", "Lkotlin/Function1;", "Lkotlin/coroutines/c;", "pagingSourceFactory", "<init>", "(Lyh/l;Ljava/lang/Object;Landroidx/paging/n0;Landroidx/paging/RemoteMediator;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class PageFetcher<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ConflatedEventBus<Boolean> refreshEvents;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ConflatedEventBus<b2> retryEvents;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlinx.coroutines.flow.e<o0<Value>> flow;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final yh.l<kotlin.coroutines.c<? super q0<Key, Value>>, Object> f25718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Key initialKey;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final n0 config;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final RemoteMediator<Key, Value> remoteMediator;

    /* JADX INFO: compiled from: PageFetcher.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001B1\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/paging/PageFetcher$a;", "", "Key", "Value", "Landroidx/paging/PageFetcherSnapshot;", ak.av, "Landroidx/paging/PageFetcherSnapshot;", "()Landroidx/paging/PageFetcherSnapshot;", "snapshot", "Landroidx/paging/t0;", "b", "Landroidx/paging/t0;", "()Landroidx/paging/t0;", "state", "<init>", "(Landroidx/paging/PageFetcherSnapshot;Landroidx/paging/t0;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class a<Key, Value> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final PageFetcherSnapshot<Key, Value> snapshot;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private final PagingState<Key, Value> state;

        public a(@dl.d PageFetcherSnapshot<Key, Value> snapshot, @dl.e PagingState<Key, Value> pagingState) {
            kotlin.jvm.internal.f0.p(snapshot, "snapshot");
            this.snapshot = snapshot;
            this.state = pagingState;
        }

        @dl.d
        public final PageFetcherSnapshot<Key, Value> a() {
            return this.snapshot;
        }

        @dl.e
        public final PagingState<Key, Value> b() {
            return this.state;
        }
    }

    /* JADX INFO: compiled from: PageFetcher.kt */
    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0004B)\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000b\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Landroidx/paging/PageFetcher$b;", "", "Key", "Value", "Landroidx/paging/e1;", "Landroidx/paging/f1;", "viewportHint", "Lkotlin/b2;", "I", "H", "refresh", "Landroidx/paging/PageFetcherSnapshot;", ak.av, "Landroidx/paging/PageFetcherSnapshot;", "pageFetcherSnapshot", "Landroidx/paging/ConflatedEventBus;", "b", "Landroidx/paging/ConflatedEventBus;", "retryEventBus", "<init>", "(Landroidx/paging/PageFetcher;Landroidx/paging/PageFetcherSnapshot;Landroidx/paging/ConflatedEventBus;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public final class b<Key, Value> implements e1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final PageFetcherSnapshot<Key, Value> pageFetcherSnapshot;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ConflatedEventBus<b2> retryEventBus;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PageFetcher f25726c;

        public b(@dl.d PageFetcher pageFetcher, @dl.d PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, ConflatedEventBus<b2> retryEventBus) {
            kotlin.jvm.internal.f0.p(pageFetcherSnapshot, "pageFetcherSnapshot");
            kotlin.jvm.internal.f0.p(retryEventBus, "retryEventBus");
            this.f25726c = pageFetcher;
            this.pageFetcherSnapshot = pageFetcherSnapshot;
            this.retryEventBus = retryEventBus;
        }

        @Override // androidx.paging.e1
        public void H() {
            this.retryEventBus.b(b2.f124493a);
        }

        @Override // androidx.paging.e1
        public void I(@dl.d f1 viewportHint) {
            kotlin.jvm.internal.f0.p(viewportHint, "viewportHint");
            this.pageFetcherSnapshot.m(viewportHint);
        }

        @Override // androidx.paging.e1
        public void refresh() {
            this.f25726c.l();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PageFetcher(@dl.d yh.l<? super kotlin.coroutines.c<? super q0<Key, Value>>, ? extends Object> pagingSourceFactory, @dl.e Key key, @dl.d n0 config, @dl.e RemoteMediator<Key, Value> remoteMediator) {
        kotlin.jvm.internal.f0.p(pagingSourceFactory, "pagingSourceFactory");
        kotlin.jvm.internal.f0.p(config, "config");
        this.f25718d = pagingSourceFactory;
        this.initialKey = key;
        this.config = config;
        this.remoteMediator = remoteMediator;
        this.refreshEvents = new ConflatedEventBus<>(null, 1, null);
        this.retryEvents = new ConflatedEventBus<>(null, 1, null);
        this.flow = SimpleChannelFlowKt.a(new PageFetcher$flow$1(this, null));
    }

    public /* synthetic */ PageFetcher(yh.l lVar, Object obj, n0 n0Var, RemoteMediator remoteMediator, int i10, kotlin.jvm.internal.u uVar) {
        this(lVar, obj, n0Var, (i10 & 8) != 0 ? null : remoteMediator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.coroutines.flow.e<PageEvent<Value>> j(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, x0<Key, Value> x0Var) {
        return x0Var == null ? pageFetcherSnapshot.t() : SimpleChannelFlowKt.a(new PageFetcher$injectRemoteEvents$1(pageFetcherSnapshot, x0Var, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        this.refreshEvents.b(Boolean.FALSE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    final /* synthetic */ Object h(q0<Key, Value> q0Var, kotlin.coroutines.c<? super q0<Key, Value>> cVar) throws Throwable {
        PageFetcher$generateNewPagingSource$1 pageFetcher$generateNewPagingSource$1;
        PageFetcher<Key, Value> pageFetcher;
        if (cVar instanceof PageFetcher$generateNewPagingSource$1) {
            pageFetcher$generateNewPagingSource$1 = (PageFetcher$generateNewPagingSource$1) cVar;
            int i10 = pageFetcher$generateNewPagingSource$1.f25747c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pageFetcher$generateNewPagingSource$1.f25747c = i10 - Integer.MIN_VALUE;
            } else {
                pageFetcher$generateNewPagingSource$1 = new PageFetcher$generateNewPagingSource$1(this, cVar);
            }
        } else {
            pageFetcher$generateNewPagingSource$1 = new PageFetcher$generateNewPagingSource$1(this, cVar);
        }
        Object objInvoke = pageFetcher$generateNewPagingSource$1.f25746b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = pageFetcher$generateNewPagingSource$1.f25747c;
        if (i11 == 0) {
            kotlin.t0.n(objInvoke);
            yh.l<kotlin.coroutines.c<? super q0<Key, Value>>, Object> lVar = this.f25718d;
            pageFetcher$generateNewPagingSource$1.f25749e = this;
            pageFetcher$generateNewPagingSource$1.f25750f = q0Var;
            pageFetcher$generateNewPagingSource$1.f25747c = 1;
            objInvoke = lVar.invoke(pageFetcher$generateNewPagingSource$1);
            if (objInvoke == objH) {
                return objH;
            }
            pageFetcher = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q0Var = (q0) pageFetcher$generateNewPagingSource$1.f25750f;
            pageFetcher = (PageFetcher) pageFetcher$generateNewPagingSource$1.f25749e;
            kotlin.t0.n(objInvoke);
        }
        q0<Key, Value> q0Var2 = (q0) objInvoke;
        if (q0Var2 instanceof LegacyPagingSource) {
            ((LegacyPagingSource) q0Var2).m(pageFetcher.config.pageSize);
        }
        if (!(q0Var2 != q0Var)) {
            throw new IllegalStateException("An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource.".toString());
        }
        q0Var2.i(new PageFetcher$generateNewPagingSource$3(pageFetcher));
        if (q0Var != null) {
            q0Var.j(new PageFetcher$generateNewPagingSource$4(pageFetcher));
        }
        if (q0Var != null) {
            q0Var.g();
        }
        return q0Var2;
    }

    @dl.d
    public final kotlinx.coroutines.flow.e<o0<Value>> i() {
        return this.flow;
    }

    public final void l() {
        this.refreshEvents.b(Boolean.TRUE);
    }
}
