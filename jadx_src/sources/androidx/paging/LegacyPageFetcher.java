package androidx.paging;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: compiled from: LegacyPageFetcher.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0017\u001bBW\u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010,\u001a\u00020(\u0012\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010-\u0012\u0006\u00104\u001a\u000202\u0012\u0006\u00106\u001a\u000202\u0012\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u000107\u0012\f\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000<¢\u0006\u0004\bC\u0010DJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002J$\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0002J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\bH\u0002J\b\u0010\u0011\u001a\u00020\bH\u0002J\u0006\u0010\u0012\u001a\u00020\bJ\u0006\u0010\u0013\u001a\u00020\bJ\u0006\u0010\u0014\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\bR\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R(\u0010#\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0017\u0010,\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b\u0015\u0010)\u001a\u0004\b*\u0010+R#\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010-8\u0006¢\u0006\f\n\u0004\b*\u0010.\u001a\u0004\b/\u00100R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00103R\u0014\u00106\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00103R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00028\u0001078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b8\u0010:R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010=R\u0011\u0010B\u001a\u00020?8F¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006E"}, d2 = {"Landroidx/paging/LegacyPageFetcher;", "", "K", androidx.exifinterface.media.a.X4, "Landroidx/paging/LoadType;", "type", "Landroidx/paging/q0$a;", "params", "Lkotlin/b2;", "o", "Landroidx/paging/q0$b$b;", "value", "l", "", "throwable", "k", "p", "n", ak.aB, "r", "m", "d", "Ljava/util/concurrent/atomic/AtomicBoolean;", ak.av, "Ljava/util/concurrent/atomic/AtomicBoolean;", "detached", "Landroidx/paging/PagedList$e;", "b", "Landroidx/paging/PagedList$e;", "f", "()Landroidx/paging/PagedList$e;", "q", "(Landroidx/paging/PagedList$e;)V", "getLoadStateManager$annotations", "()V", "loadStateManager", "Lkotlinx/coroutines/q0;", ak.aF, "Lkotlinx/coroutines/q0;", "pagedListScope", "Landroidx/paging/PagedList$d;", "Landroidx/paging/PagedList$d;", "e", "()Landroidx/paging/PagedList$d;", "config", "Landroidx/paging/q0;", "Landroidx/paging/q0;", "i", "()Landroidx/paging/q0;", "source", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "notifyDispatcher", "g", "fetchDispatcher", "Landroidx/paging/LegacyPageFetcher$b;", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/paging/LegacyPageFetcher$b;", "()Landroidx/paging/LegacyPageFetcher$b;", "pageConsumer", "Landroidx/paging/LegacyPageFetcher$a;", "Landroidx/paging/LegacyPageFetcher$a;", "keyProvider", "", "j", "()Z", "isDetached", "<init>", "(Lkotlinx/coroutines/q0;Landroidx/paging/PagedList$d;Landroidx/paging/q0;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/paging/LegacyPageFetcher$b;Landroidx/paging/LegacyPageFetcher$a;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class LegacyPageFetcher<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean detached;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private PagedList.e loadStateManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final kotlinx.coroutines.q0 pagedListScope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final PagedList.d config;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final q0<K, V> source;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final CoroutineDispatcher notifyDispatcher;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final CoroutineDispatcher fetchDispatcher;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final b<V> pageConsumer;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final a<K> keyProvider;

    /* JADX INFO: compiled from: LegacyPageFetcher.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b`\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00018\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00018\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"Landroidx/paging/LegacyPageFetcher$a;", "", "K", "j", "()Ljava/lang/Object;", "prevKey", "i", "nextKey", "paging-common"}, k = 1, mv = {1, 4, 2})
    public interface a<K> {
        @dl.e
        K i();

        @dl.e
        K j();
    }

    /* JADX INFO: compiled from: LegacyPageFetcher.kt */
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00020\u0005H&J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH&¨\u0006\r"}, d2 = {"Landroidx/paging/LegacyPageFetcher$b;", "", androidx.exifinterface.media.a.X4, "Landroidx/paging/LoadType;", "type", "Landroidx/paging/q0$b$b;", "page", "", "b", "Landroidx/paging/v;", "state", "Lkotlin/b2;", "g", "paging-common"}, k = 1, mv = {1, 4, 2})
    public interface b<V> {
        boolean b(@dl.d LoadType type, @dl.d q0.b.Page<?, V> page);

        void g(@dl.d LoadType loadType, @dl.d v vVar);
    }

    /* JADX INFO: compiled from: LegacyPageFetcher.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"androidx/paging/LegacyPageFetcher$c", "Landroidx/paging/PagedList$e;", "Landroidx/paging/LoadType;", "type", "Landroidx/paging/v;", "state", "Lkotlin/b2;", "e", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class c extends PagedList.e {
        c() {
        }

        @Override // androidx.paging.PagedList.e
        public void e(@dl.d LoadType type, @dl.d v state) {
            kotlin.jvm.internal.f0.p(type, "type");
            kotlin.jvm.internal.f0.p(state, "state");
            LegacyPageFetcher.this.h().g(type, state);
        }
    }

    public LegacyPageFetcher(@dl.d kotlinx.coroutines.q0 pagedListScope, @dl.d PagedList.d config, @dl.d q0<K, V> source, @dl.d CoroutineDispatcher notifyDispatcher, @dl.d CoroutineDispatcher fetchDispatcher, @dl.d b<V> pageConsumer, @dl.d a<K> keyProvider) {
        kotlin.jvm.internal.f0.p(pagedListScope, "pagedListScope");
        kotlin.jvm.internal.f0.p(config, "config");
        kotlin.jvm.internal.f0.p(source, "source");
        kotlin.jvm.internal.f0.p(notifyDispatcher, "notifyDispatcher");
        kotlin.jvm.internal.f0.p(fetchDispatcher, "fetchDispatcher");
        kotlin.jvm.internal.f0.p(pageConsumer, "pageConsumer");
        kotlin.jvm.internal.f0.p(keyProvider, "keyProvider");
        this.pagedListScope = pagedListScope;
        this.config = config;
        this.source = source;
        this.notifyDispatcher = notifyDispatcher;
        this.fetchDispatcher = fetchDispatcher;
        this.pageConsumer = pageConsumer;
        this.keyProvider = keyProvider;
        this.detached = new AtomicBoolean(false);
        this.loadStateManager = new c();
    }

    public static /* synthetic */ void g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(LoadType loadType, Throwable th2) {
        if (j()) {
            return;
        }
        this.loadStateManager.i(loadType, new v.Error(th2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(LoadType loadType, q0.b.Page<K, V> page) {
        if (j()) {
            return;
        }
        if (!this.pageConsumer.b(loadType, page)) {
            this.loadStateManager.i(loadType, page.i().isEmpty() ? v.NotLoading.INSTANCE.a() : v.NotLoading.INSTANCE.b());
            return;
        }
        int i10 = q.f26591a[loadType.ordinal()];
        if (i10 == 1) {
            p();
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("Can only fetch more during append/prepend");
            }
            n();
        }
    }

    private final void n() {
        K kI = this.keyProvider.i();
        if (kI == null) {
            l(LoadType.APPEND, q0.b.Page.INSTANCE.a());
            return;
        }
        PagedList.e eVar = this.loadStateManager;
        LoadType loadType = LoadType.APPEND;
        eVar.i(loadType, v.Loading.f26654b);
        PagedList.d dVar = this.config;
        o(loadType, new q0.a.C0204a(kI, dVar.pageSize, dVar.enablePlaceholders));
    }

    private final void o(LoadType loadType, q0.a<K> aVar) {
        kotlinx.coroutines.k.f(this.pagedListScope, this.fetchDispatcher, null, new LegacyPageFetcher$scheduleLoad$1(this, aVar, loadType, null), 2, null);
    }

    private final void p() {
        K kJ = this.keyProvider.j();
        if (kJ == null) {
            l(LoadType.PREPEND, q0.b.Page.INSTANCE.a());
            return;
        }
        PagedList.e eVar = this.loadStateManager;
        LoadType loadType = LoadType.PREPEND;
        eVar.i(loadType, v.Loading.f26654b);
        PagedList.d dVar = this.config;
        o(loadType, new q0.a.c(kJ, dVar.pageSize, dVar.enablePlaceholders));
    }

    public final void d() {
        this.detached.set(true);
    }

    @dl.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public final PagedList.d getConfig() {
        return this.config;
    }

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final PagedList.e getLoadStateManager() {
        return this.loadStateManager;
    }

    @dl.d
    public final b<V> h() {
        return this.pageConsumer;
    }

    @dl.d
    public final q0<K, V> i() {
        return this.source;
    }

    public final boolean j() {
        return this.detached.get();
    }

    public final void m() {
        if (this.loadStateManager.getStartState() instanceof v.Error) {
            p();
        }
        if (this.loadStateManager.getEndState() instanceof v.Error) {
            n();
        }
    }

    public final void q(@dl.d PagedList.e eVar) {
        kotlin.jvm.internal.f0.p(eVar, "<set-?>");
        this.loadStateManager = eVar;
    }

    public final void r() {
        v endState = this.loadStateManager.getEndState();
        if (!(endState instanceof v.NotLoading) || endState.getEndOfPaginationReached()) {
            return;
        }
        n();
    }

    public final void s() {
        v startState = this.loadStateManager.getStartState();
        if (!(startState instanceof v.NotLoading) || startState.getEndOfPaginationReached()) {
            return;
        }
        p();
    }
}
