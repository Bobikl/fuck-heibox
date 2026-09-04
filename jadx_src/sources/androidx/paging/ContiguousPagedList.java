package androidx.paging;

import androidx.annotation.RestrictTo;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: compiled from: ContiguousPagedList.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 i*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u00042\u00020\u00052\b\u0012\u0004\u0012\u00028\u00010\u0006:\u0001-Bi\u0012\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010J\u0012\u0006\u0010`\u001a\u00020_\u0012\u0006\u0010b\u001a\u00020a\u0012\u0006\u0010c\u001a\u00020a\u0012\u000e\u0010T\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010O\u0012\u0006\u0010e\u001a\u00020d\u0012\u0012\u0010f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013\u0012\b\u0010W\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\bg\u0010hJ\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0002J\"\u0010\u0014\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0010\u0010\n\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J'\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u000bH\u0016J\"\u0010 \u001a\u00020\u000b2\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000b0\u001eH\u0016J\u0018\u0010#\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0015H\u0016J\u0010\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$H\u0017J\b\u0010'\u001a\u00020\u000bH\u0016J\u0010\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020$H\u0017J \u0010-\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020$H\u0017J \u0010/\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020$2\u0006\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020$H\u0017J\u0018\u00101\u001a\u00020\u000b2\u0006\u00100\u001a\u00020$2\u0006\u0010(\u001a\u00020$H\u0016J\u0018\u00102\u001a\u00020\u000b2\u0006\u00100\u001a\u00020$2\u0006\u0010(\u001a\u00020$H\u0016R\u0016\u00105\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00104R\u0016\u0010:\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010<\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00109R\u0016\u0010>\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00104R\u0016\u0010@\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00104R\u0016\u0010B\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00109R\u0014\u0010D\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00109R&\u0010I\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010E8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b'\u0010F\u0012\u0004\bG\u0010HR#\u0010N\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010J8\u0006¢\u0006\f\n\u0004\b \u0010K\u001a\u0004\bL\u0010MR\"\u0010T\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010O8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0016\u0010W\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001c\u0010[\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\f\u0012\u0004\bZ\u0010H\u001a\u0004\bX\u0010YR\u0014\u0010^\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]¨\u0006j"}, d2 = {"Landroidx/paging/ContiguousPagedList;", "", "K", androidx.exifinterface.media.a.X4, "Landroidx/paging/PagedList;", "Landroidx/paging/m0$a;", "Landroidx/paging/LegacyPageFetcher$b;", "Landroidx/paging/LoadType;", "type", "", "page", "Lkotlin/b2;", "B0", "", ad.e.f1248a, "C0", "begin", com.google.android.exoplayer2.text.ttml.d.f49800p0, "v0", "Landroidx/paging/q0$b$b;", "b", "Landroidx/paging/v;", "state", "g", "deferEmpty", "deferBegin", "deferEnd", "u0", "(ZZZ)V", "b0", "Lkotlin/Function2;", "callback", ak.aG, "loadType", "loadState", "d0", "", UCropPlusActivity.ARG_INDEX, "U", "t", "count", "e", "leadingNulls", "changed", "added", ak.av, "endPosition", "j", "startOfDrops", "i", RXScreenCaptureService.KEY_HEIGHT, "l", "I", "prependItemsRequested", "m", "appendItemsRequested", "n", "Z", "boundaryCallbackBeginDeferred", "o", "boundaryCallbackEndDeferred", "p", "lowestIndexAccessed", "q", "highestIndexAccessed", "r", "replacePagesWithNulls", ak.aB, "shouldTrim", "Landroidx/paging/LegacyPageFetcher;", "Landroidx/paging/LegacyPageFetcher;", "getPager$annotations", "()V", "pager", "Landroidx/paging/q0;", "Landroidx/paging/q0;", "G", "()Landroidx/paging/q0;", "pagingSource", "Landroidx/paging/PagedList$a;", "v", "Landroidx/paging/PagedList$a;", "w0", "()Landroidx/paging/PagedList$a;", "boundaryCallback", RXScreenCaptureService.KEY_WIDTH, "Ljava/lang/Object;", "initialLastKey", "B", "()Ljava/lang/Object;", "getLastKey$annotations", "lastKey", "Q", "()Z", "isDetached", "Lkotlinx/coroutines/q0;", "coroutineScope", "Lkotlinx/coroutines/CoroutineDispatcher;", "notifyDispatcher", "backgroundDispatcher", "Landroidx/paging/PagedList$d;", "config", "initialPage", "<init>", "(Landroidx/paging/q0;Lkotlinx/coroutines/q0;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/paging/PagedList$a;Landroidx/paging/PagedList$d;Landroidx/paging/q0$b$b;Ljava/lang/Object;)V", "x", "paging-common"}, k = 1, mv = {1, 4, 2})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ContiguousPagedList<K, V> extends PagedList<V> implements m0.a, LegacyPageFetcher.b<V> {

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int prependItemsRequested;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int appendItemsRequested;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean boundaryCallbackBeginDeferred;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean boundaryCallbackEndDeferred;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int lowestIndexAccessed;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int highestIndexAccessed;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean replacePagesWithNulls;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldTrim;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final LegacyPageFetcher<K, V> pager;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final q0<K, V> pagingSource;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final PagedList.a<V> boundaryCallback;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final K initialLastKey;

    /* JADX INFO: renamed from: androidx.paging.ContiguousPagedList$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ContiguousPagedList.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\u0007¨\u0006\f"}, d2 = {"Landroidx/paging/ContiguousPagedList$a;", "", "", "prefetchDistance", UCropPlusActivity.ARG_INDEX, "leadingNulls", "b", "(III)I", "itemsBeforeTrailingNulls", ak.av, "<init>", "()V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final int a(int prefetchDistance, int index, int itemsBeforeTrailingNulls) {
            return ((index + prefetchDistance) + 1) - itemsBeforeTrailingNulls;
        }

        public final int b(int prefetchDistance, int index, int leadingNulls) {
            return prefetchDistance - (index - leadingNulls);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContiguousPagedList(@dl.d q0<K, V> pagingSource, @dl.d kotlinx.coroutines.q0 coroutineScope, @dl.d CoroutineDispatcher notifyDispatcher, @dl.d CoroutineDispatcher backgroundDispatcher, @dl.e PagedList.a<V> aVar, @dl.d PagedList.d config, @dl.d q0.b.Page<K, V> initialPage, @dl.e K k10) {
        super(pagingSource, coroutineScope, notifyDispatcher, new m0(), config);
        kotlin.jvm.internal.f0.p(pagingSource, "pagingSource");
        kotlin.jvm.internal.f0.p(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.f0.p(notifyDispatcher, "notifyDispatcher");
        kotlin.jvm.internal.f0.p(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.f0.p(config, "config");
        kotlin.jvm.internal.f0.p(initialPage, "initialPage");
        this.pagingSource = pagingSource;
        this.boundaryCallback = aVar;
        this.initialLastKey = k10;
        this.lowestIndexAccessed = Integer.MAX_VALUE;
        this.highestIndexAccessed = Integer.MIN_VALUE;
        this.shouldTrim = config.maxSize != Integer.MAX_VALUE;
        m0<V> m0VarN = N();
        if (m0VarN == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.paging.LegacyPageFetcher.KeyProvider<K>");
        }
        this.pager = new LegacyPageFetcher<>(coroutineScope, config, pagingSource, notifyDispatcher, backgroundDispatcher, this, m0VarN);
        if (config.enablePlaceholders) {
            N().x(initialPage.k() != Integer.MIN_VALUE ? initialPage.k() : 0, initialPage, initialPage.j() != Integer.MIN_VALUE ? initialPage.j() : 0, 0, this, (initialPage.k() == Integer.MIN_VALUE || initialPage.j() == Integer.MIN_VALUE) ? false : true);
        } else {
            N().x(0, initialPage, 0, initialPage.k() != Integer.MIN_VALUE ? initialPage.k() : 0, this, false);
        }
        B0(LoadType.REFRESH, initialPage.i());
    }

    private static /* synthetic */ void A0() {
    }

    private final void B0(LoadType loadType, List<? extends V> list) {
        if (this.boundaryCallback != null) {
            boolean z10 = N().size() == 0;
            u0(z10, !z10 && loadType == LoadType.PREPEND && list.isEmpty(), !z10 && loadType == LoadType.APPEND && list.isEmpty());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C0(boolean z10) {
        boolean z11 = this.boundaryCallbackBeginDeferred && this.lowestIndexAccessed <= getConfig().prefetchDistance;
        boolean z12 = this.boundaryCallbackEndDeferred && this.highestIndexAccessed >= (size() - 1) - getConfig().prefetchDistance;
        if (z11 || z12) {
            if (z11) {
                this.boundaryCallbackBeginDeferred = false;
            }
            if (z12) {
                this.boundaryCallbackEndDeferred = false;
            }
            if (z10) {
                kotlinx.coroutines.k.f(getCoroutineScope(), getNotifyDispatcher(), null, new ContiguousPagedList$tryDispatchBoundaryCallbacks$1(this, z11, z12, null), 2, null);
            } else {
                v0(z11, z12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(boolean z10, boolean z11) {
        if (z10) {
            PagedList.a<V> aVar = this.boundaryCallback;
            kotlin.jvm.internal.f0.m(aVar);
            aVar.b(N().q());
        }
        if (z11) {
            PagedList.a<V> aVar2 = this.boundaryCallback;
            kotlin.jvm.internal.f0.m(aVar2);
            aVar2.a(N().t());
        }
    }

    public static /* synthetic */ void y0() {
    }

    @Override // androidx.paging.PagedList
    @dl.e
    public K B() {
        K kF;
        PagingState<?, V> pagingStateW = N().w(getConfig());
        return (pagingStateW == null || (kF = this.pagingSource.f(pagingStateW)) == null) ? this.initialLastKey : kF;
    }

    @Override // androidx.paging.PagedList
    @dl.d
    public final q0<K, V> G() {
        return this.pagingSource;
    }

    @Override // androidx.paging.PagedList
    /* JADX INFO: renamed from: Q */
    public boolean getIsDetached() {
        return this.pager.j();
    }

    @Override // androidx.paging.PagedList
    @androidx.annotation.k0
    public void U(int i10) {
        Companion companion = INSTANCE;
        int iB = companion.b(getConfig().prefetchDistance, i10, N().getPlaceholdersBefore());
        int iA = companion.a(getConfig().prefetchDistance, i10, N().getPlaceholdersBefore() + N().getStorageCount());
        int iMax = Math.max(iB, this.prependItemsRequested);
        this.prependItemsRequested = iMax;
        if (iMax > 0) {
            this.pager.s();
        }
        int iMax2 = Math.max(iA, this.appendItemsRequested);
        this.appendItemsRequested = iMax2;
        if (iMax2 > 0) {
            this.pager.r();
        }
        this.lowestIndexAccessed = Math.min(this.lowestIndexAccessed, i10);
        this.highestIndexAccessed = Math.max(this.highestIndexAccessed, i10);
        C0(true);
    }

    @Override // androidx.paging.m0.a
    @androidx.annotation.k0
    public void a(int i10, int i11, int i12) {
        V(i10, i11);
        W(0, i12);
        this.lowestIndexAccessed += i12;
        this.highestIndexAccessed += i12;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    @Override // androidx.paging.LegacyPageFetcher.b
    public boolean b(@dl.d LoadType type, @dl.d q0.b.Page<?, V> page) {
        kotlin.jvm.internal.f0.p(type, "type");
        kotlin.jvm.internal.f0.p(page, "page");
        List<? extends V> listI = page.i();
        boolean z10 = false;
        boolean z11 = S() > N().u();
        boolean z12 = this.shouldTrim && N().J(getConfig().maxSize, getRequiredRemainder(), listI.size());
        LoadType loadType = LoadType.APPEND;
        if (type == loadType) {
            if (!z12 || z11) {
                N().m(page, this);
                int size = this.appendItemsRequested - listI.size();
                this.appendItemsRequested = size;
                if (size > 0 && (!listI.isEmpty())) {
                    z10 = true;
                }
            } else {
                this.appendItemsRequested = 0;
            }
        } else {
            if (type != LoadType.PREPEND) {
                throw new IllegalArgumentException("unexpected result type " + type);
            }
            if (z12 && z11) {
                this.prependItemsRequested = 0;
            } else {
                N().F(page, this);
                int size2 = this.prependItemsRequested - listI.size();
                this.prependItemsRequested = size2;
                if (size2 > 0 && (!listI.isEmpty())) {
                    z10 = true;
                }
            }
        }
        if (this.shouldTrim) {
            if (z11) {
                if (!(this.pager.getLoadStateManager().getStartState() instanceof v.Loading) && N().R(this.replacePagesWithNulls, getConfig().maxSize, getRequiredRemainder(), this)) {
                    this.pager.getLoadStateManager().i(LoadType.PREPEND, v.NotLoading.INSTANCE.b());
                }
            } else if (!(this.pager.getLoadStateManager().getEndState() instanceof v.Loading) && N().Q(this.replacePagesWithNulls, getConfig().maxSize, getRequiredRemainder(), this)) {
                this.pager.getLoadStateManager().i(loadType, v.NotLoading.INSTANCE.b());
            }
        }
        B0(type, listI);
        return z10;
    }

    @Override // androidx.paging.PagedList
    public void b0() {
        Runnable runnableI;
        super.b0();
        this.pager.m();
        if (!(this.pager.getLoadStateManager().getRefreshState() instanceof v.Error) || (runnableI = getRefreshRetryCallback()) == null) {
            return;
        }
        runnableI.run();
    }

    @Override // androidx.paging.PagedList
    public void d0(@dl.d LoadType loadType, @dl.d v loadState) {
        kotlin.jvm.internal.f0.p(loadType, "loadType");
        kotlin.jvm.internal.f0.p(loadState, "loadState");
        this.pager.getLoadStateManager().i(loadType, loadState);
    }

    @Override // androidx.paging.m0.a
    @androidx.annotation.k0
    public void e(int i10) {
        W(0, i10);
        this.replacePagesWithNulls = N().getPlaceholdersBefore() > 0 || N().getPlaceholdersAfter() > 0;
    }

    @Override // androidx.paging.LegacyPageFetcher.b
    public void g(@dl.d LoadType type, @dl.d v state) {
        kotlin.jvm.internal.f0.p(type, "type");
        kotlin.jvm.internal.f0.p(state, "state");
        v(type, state);
    }

    @Override // androidx.paging.m0.a
    public void h(int i10, int i11) {
        V(i10, i11);
    }

    @Override // androidx.paging.m0.a
    public void i(int i10, int i11) {
        X(i10, i11);
    }

    @Override // androidx.paging.m0.a
    @androidx.annotation.k0
    public void j(int i10, int i11, int i12) {
        V(i10, i11);
        W(i10 + i11, i12);
    }

    @Override // androidx.paging.PagedList
    public void t() {
        this.pager.d();
    }

    @Override // androidx.paging.PagedList
    public void u(@dl.d yh.p<? super LoadType, ? super v, b2> callback) {
        kotlin.jvm.internal.f0.p(callback, "callback");
        this.pager.getLoadStateManager().a(callback);
    }

    @androidx.annotation.d
    public final void u0(boolean deferEmpty, boolean deferBegin, boolean deferEnd) {
        if (this.boundaryCallback == null) {
            throw new IllegalStateException("Can't defer BoundaryCallback, no instance");
        }
        if (this.lowestIndexAccessed == Integer.MAX_VALUE) {
            this.lowestIndexAccessed = N().size();
        }
        if (this.highestIndexAccessed == Integer.MIN_VALUE) {
            this.highestIndexAccessed = 0;
        }
        if (deferEmpty || deferBegin || deferEnd) {
            kotlinx.coroutines.k.f(getCoroutineScope(), getNotifyDispatcher(), null, new ContiguousPagedList$deferBoundaryCallbacks$1(this, deferEmpty, deferBegin, deferEnd, null), 2, null);
        }
    }

    @dl.e
    public final PagedList.a<V> w0() {
        return this.boundaryCallback;
    }
}
