package androidx.paging;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: PageFetcherSnapshotState.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0001WB\u0011\b\u0002\u0012\u0006\u0010J\u001a\u00020H¢\u0006\u0004\bU\u0010VJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\tJ\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011H\u0007J\u0014\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0018J\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cJ%\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0000¢\u0006\u0004\b\"\u0010#R&\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00110$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R,\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00110(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010+R$\u00102\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0016\u00104\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010/R\u0016\u00106\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010/R\u0016\u00108\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010/R\u0016\u00109\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010/R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00060:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010;R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00060:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010;R&\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c0>8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010?\u001a\u0004\b@\u0010AR$\u0010G\u001a\u00020C2\u0006\u0010-\u001a\u00020C8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001e\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010IR\u0014\u0010L\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u00101R$\u0010Q\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\u00068@@@X\u0080\u000e¢\u0006\f\u001a\u0004\bN\u00101\"\u0004\bO\u0010PR$\u0010T\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\u00068@@@X\u0080\u000e¢\u0006\f\u001a\u0004\bR\u00101\"\u0004\bS\u0010P¨\u0006X"}, d2 = {"Landroidx/paging/PageFetcherSnapshotState;", "", "Key", "Value", "Landroidx/paging/LoadType;", "loadType", "", "l", "(Landroidx/paging/LoadType;)I", "Lkotlinx/coroutines/flow/e;", RXScreenCaptureService.KEY_HEIGHT, "g", "type", "Landroidx/paging/v;", "newState", "", RXScreenCaptureService.KEY_WIDTH, "Landroidx/paging/q0$b$b;", "Landroidx/paging/PageEvent;", "x", "(Landroidx/paging/q0$b$b;Landroidx/paging/LoadType;)Landroidx/paging/PageEvent;", "loadId", "page", "t", "Landroidx/paging/PageEvent$a;", androidx.core.app.o0.I0, "Lkotlin/b2;", "j", "Landroidx/paging/f1;", "hint", "k", "Landroidx/paging/f1$a;", "viewportHint", "Landroidx/paging/t0;", "i", "(Landroidx/paging/f1$a;)Landroidx/paging/t0;", "", ak.av, "Ljava/util/List;", "_pages", "", "b", "o", "()Ljava/util/List;", "pages", "<set-?>", ak.aF, "I", "n", "()I", "initialPageIndex", "d", "_placeholdersBefore", "e", "_placeholdersAfter", "f", "prependGenerationId", "appendGenerationId", "Lkotlinx/coroutines/channels/k;", "Lkotlinx/coroutines/channels/k;", "prependGenerationIdCh", "appendGenerationIdCh", "", "Ljava/util/Map;", "m", "()Ljava/util/Map;", "failedHintsByLoadType", "Landroidx/paging/x;", "Landroidx/paging/x;", "r", "()Landroidx/paging/x;", "sourceLoadStates", "Landroidx/paging/n0;", "Landroidx/paging/n0;", "config", ak.aB, "storageCount", "value", "q", "v", "(I)V", "placeholdersBefore", "p", ak.aG, "placeholdersAfter", "<init>", "(Landroidx/paging/n0;)V", "Holder", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class PageFetcherSnapshotState<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<q0.b.Page<Key, Value>> _pages;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<q0.b.Page<Key, Value>> pages;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int initialPageIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int _placeholdersBefore;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int _placeholdersAfter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int prependGenerationId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int appendGenerationId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final kotlinx.coroutines.channels.k<Integer> prependGenerationIdCh;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final kotlinx.coroutines.channels.k<Integer> appendGenerationIdCh;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<LoadType, f1> failedHintsByLoadType;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private LoadStates sourceLoadStates;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final n0 config;

    /* JADX INFO: compiled from: PageFetcherSnapshotState.kt */
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017JH\u0010\u000b\u001a\u00028\u0004\"\u0004\b\u0004\u0010\u00042-\u0010\n\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00040\u0005H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/paging/PageFetcherSnapshotState$Holder;", "", "Key", "Value", androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function1;", "Landroidx/paging/PageFetcherSnapshotState;", "Lkotlin/m0;", "name", "state", "block", ak.aF, "(Lyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/sync/c;", ak.av, "Lkotlinx/coroutines/sync/c;", "lock", "b", "Landroidx/paging/PageFetcherSnapshotState;", "Landroidx/paging/n0;", "Landroidx/paging/n0;", "config", "<init>", "(Landroidx/paging/n0;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class Holder<Key, Value> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final kotlinx.coroutines.sync.c lock;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final PageFetcherSnapshotState<Key, Value> state;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final n0 config;

        public Holder(@dl.d n0 config) {
            kotlin.jvm.internal.f0.p(config, "config");
            this.config = config;
            this.lock = MutexKt.b(false, 1, null);
            this.state = new PageFetcherSnapshotState<>(config, null);
        }

        @dl.e
        private final Object d(@dl.d yh.l lVar, @dl.d kotlin.coroutines.c cVar) {
            kotlinx.coroutines.sync.c cVar2 = this.lock;
            kotlin.jvm.internal.c0.e(0);
            cVar2.e(null, cVar);
            kotlin.jvm.internal.c0.e(2);
            kotlin.jvm.internal.c0.e(1);
            try {
                return lVar.invoke(this.state);
            } finally {
                kotlin.jvm.internal.c0.d(1);
                cVar2.f(null);
                kotlin.jvm.internal.c0.c(1);
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @dl.e
        public final <T> Object c(@dl.d yh.l<? super PageFetcherSnapshotState<Key, Value>, ? extends T> lVar, @dl.d kotlin.coroutines.c<? super T> cVar) throws Throwable {
            PageFetcherSnapshotState$Holder$withLock$1 pageFetcherSnapshotState$Holder$withLock$1;
            kotlinx.coroutines.sync.c cVar2;
            Holder<Key, Value> holder;
            if (cVar instanceof PageFetcherSnapshotState$Holder$withLock$1) {
                pageFetcherSnapshotState$Holder$withLock$1 = (PageFetcherSnapshotState$Holder$withLock$1) cVar;
                int i10 = pageFetcherSnapshotState$Holder$withLock$1.f25918c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    pageFetcherSnapshotState$Holder$withLock$1.f25918c = i10 - Integer.MIN_VALUE;
                } else {
                    pageFetcherSnapshotState$Holder$withLock$1 = new PageFetcherSnapshotState$Holder$withLock$1(this, cVar);
                }
            } else {
                pageFetcherSnapshotState$Holder$withLock$1 = new PageFetcherSnapshotState$Holder$withLock$1(this, cVar);
            }
            Object obj = pageFetcherSnapshotState$Holder$withLock$1.f25917b;
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i11 = pageFetcherSnapshotState$Holder$withLock$1.f25918c;
            if (i11 == 0) {
                kotlin.t0.n(obj);
                cVar2 = this.lock;
                pageFetcherSnapshotState$Holder$withLock$1.f25920e = this;
                pageFetcherSnapshotState$Holder$withLock$1.f25921f = lVar;
                pageFetcherSnapshotState$Holder$withLock$1.f25922g = cVar2;
                pageFetcherSnapshotState$Holder$withLock$1.f25918c = 1;
                if (cVar2.e(null, pageFetcherSnapshotState$Holder$withLock$1) == objH) {
                    return objH;
                }
                holder = this;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlinx.coroutines.sync.c cVar3 = (kotlinx.coroutines.sync.c) pageFetcherSnapshotState$Holder$withLock$1.f25922g;
                yh.l<? super PageFetcherSnapshotState<Key, Value>, ? extends T> lVar2 = (yh.l) pageFetcherSnapshotState$Holder$withLock$1.f25921f;
                holder = (Holder) pageFetcherSnapshotState$Holder$withLock$1.f25920e;
                kotlin.t0.n(obj);
                cVar2 = cVar3;
                lVar = lVar2;
            }
            try {
                return lVar.invoke(holder.state);
            } finally {
                kotlin.jvm.internal.c0.d(1);
                cVar2.f(null);
                kotlin.jvm.internal.c0.c(1);
            }
        }
    }

    private PageFetcherSnapshotState(n0 n0Var) {
        this.config = n0Var;
        ArrayList arrayList = new ArrayList();
        this._pages = arrayList;
        this.pages = arrayList;
        this.prependGenerationIdCh = kotlinx.coroutines.channels.m.d(-1, null, null, 6, null);
        this.appendGenerationIdCh = kotlinx.coroutines.channels.m.d(-1, null, null, 6, null);
        this.failedHintsByLoadType = new LinkedHashMap();
        this.sourceLoadStates = LoadStates.INSTANCE.a();
    }

    public /* synthetic */ PageFetcherSnapshotState(n0 n0Var, kotlin.jvm.internal.u uVar) {
        this(n0Var);
    }

    @dl.d
    public final kotlinx.coroutines.flow.e<Integer> g() {
        return kotlinx.coroutines.flow.g.l1(kotlinx.coroutines.flow.g.X(this.appendGenerationIdCh), new PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1(this, null));
    }

    @dl.d
    public final kotlinx.coroutines.flow.e<Integer> h() {
        return kotlinx.coroutines.flow.g.l1(kotlinx.coroutines.flow.g.X(this.prependGenerationIdCh), new PageFetcherSnapshotState$consumePrependGenerationIdAsFlow$1(this, null));
    }

    @dl.d
    public final PagingState<Key, Value> i(@dl.e f1.a viewportHint) {
        Integer numValueOf;
        List listQ5 = CollectionsKt___CollectionsKt.Q5(this.pages);
        if (viewportHint != null) {
            int iQ = q();
            int i10 = -this.initialPageIndex;
            int iG = CollectionsKt__CollectionsKt.G(this.pages) - this.initialPageIndex;
            int pageOffset = viewportHint.getPageOffset();
            int i11 = i10;
            while (i11 < pageOffset) {
                iQ += i11 > iG ? this.config.pageSize : this.pages.get(this.initialPageIndex + i11).i().size();
                i11++;
            }
            int indexInPage = iQ + viewportHint.getIndexInPage();
            if (viewportHint.getPageOffset() < i10) {
                indexInPage -= this.config.pageSize;
            }
            numValueOf = Integer.valueOf(indexInPage);
        } else {
            numValueOf = null;
        }
        return new PagingState<>(listQ5, numValueOf, this.config, q());
    }

    public final void j(@dl.d PageEvent.Drop<Value> event) {
        kotlin.jvm.internal.f0.p(event, "event");
        if (!(event.p() <= this.pages.size())) {
            throw new IllegalStateException(("invalid drop count. have " + this.pages.size() + " but wanted to drop " + event.p()).toString());
        }
        this.failedHintsByLoadType.remove(event.m());
        this.sourceLoadStates = this.sourceLoadStates.l(event.m(), v.NotLoading.INSTANCE.b());
        int i10 = h0.f26426e[event.m().ordinal()];
        if (i10 == 1) {
            int iP = event.p();
            for (int i11 = 0; i11 < iP; i11++) {
                this._pages.remove(0);
            }
            this.initialPageIndex -= event.p();
            v(event.q());
            int i12 = this.prependGenerationId + 1;
            this.prependGenerationId = i12;
            this.prependGenerationIdCh.offer(Integer.valueOf(i12));
            return;
        }
        if (i10 != 2) {
            throw new IllegalArgumentException("cannot drop " + event.m());
        }
        int iP2 = event.p();
        for (int i13 = 0; i13 < iP2; i13++) {
            this._pages.remove(this.pages.size() - 1);
        }
        u(event.q());
        int i14 = this.appendGenerationId + 1;
        this.appendGenerationId = i14;
        this.appendGenerationIdCh.offer(Integer.valueOf(i14));
    }

    @dl.e
    public final PageEvent.Drop<Value> k(@dl.d LoadType loadType, @dl.d f1 hint) {
        int iG;
        int i10;
        int size;
        kotlin.jvm.internal.f0.p(loadType, "loadType");
        kotlin.jvm.internal.f0.p(hint, "hint");
        PageEvent.Drop<Value> drop = null;
        if (this.config.maxSize == Integer.MAX_VALUE || this.pages.size() <= 2 || s() <= this.config.maxSize) {
            return null;
        }
        int iQ = 0;
        if (!(loadType != LoadType.REFRESH)) {
            throw new IllegalArgumentException(("Drop LoadType must be PREPEND or APPEND, but got " + loadType).toString());
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < this.pages.size() && s() - i12 > this.config.maxSize) {
            if (h0.f26427f[loadType.ordinal()] != 1) {
                List<q0.b.Page<Key, Value>> list = this.pages;
                size = list.get(CollectionsKt__CollectionsKt.G(list) - i11).i().size();
            } else {
                size = this.pages.get(i11).i().size();
            }
            if (((h0.f26428g[loadType.ordinal()] != 1 ? hint.getPresentedItemsAfter() : hint.getPresentedItemsBefore()) - i12) - size < this.config.prefetchDistance) {
                break;
            }
            i12 += size;
            i11++;
        }
        if (i11 != 0) {
            int iG2 = h0.f26429h[loadType.ordinal()] != 1 ? (CollectionsKt__CollectionsKt.G(this.pages) - this.initialPageIndex) - (i11 - 1) : -this.initialPageIndex;
            if (h0.f26430i[loadType.ordinal()] != 1) {
                iG = CollectionsKt__CollectionsKt.G(this.pages);
                i10 = this.initialPageIndex;
            } else {
                iG = i11 - 1;
                i10 = this.initialPageIndex;
            }
            int i13 = iG - i10;
            if (this.config.enablePlaceholders) {
                iQ = (loadType == LoadType.PREPEND ? q() : p()) + i12;
            }
            drop = new PageEvent.Drop<>(loadType, iG2, i13, iQ);
        }
        return drop;
    }

    public final int l(@dl.d LoadType loadType) {
        kotlin.jvm.internal.f0.p(loadType, "loadType");
        int i10 = h0.f26422a[loadType.ordinal()];
        if (i10 == 1) {
            throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
        }
        if (i10 == 2) {
            return this.prependGenerationId;
        }
        if (i10 == 3) {
            return this.appendGenerationId;
        }
        throw new NoWhenBranchMatchedException();
    }

    @dl.d
    public final Map<LoadType, f1> m() {
        return this.failedHintsByLoadType;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getInitialPageIndex() {
        return this.initialPageIndex;
    }

    @dl.d
    public final List<q0.b.Page<Key, Value>> o() {
        return this.pages;
    }

    public final int p() {
        if (this.config.enablePlaceholders) {
            return this._placeholdersAfter;
        }
        return 0;
    }

    public final int q() {
        if (this.config.enablePlaceholders) {
            return this._placeholdersBefore;
        }
        return 0;
    }

    @dl.d
    /* JADX INFO: renamed from: r, reason: from getter */
    public final LoadStates getSourceLoadStates() {
        return this.sourceLoadStates;
    }

    public final int s() {
        Iterator<T> it = this.pages.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((q0.b.Page) it.next()).i().size();
        }
        return size;
    }

    @androidx.annotation.j
    public final boolean t(int loadId, @dl.d LoadType loadType, @dl.d q0.b.Page<Key, Value> page) {
        kotlin.jvm.internal.f0.p(loadType, "loadType");
        kotlin.jvm.internal.f0.p(page, "page");
        int i10 = h0.f26425d[loadType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    if (!(!this.pages.isEmpty())) {
                        throw new IllegalStateException("should've received an init before append".toString());
                    }
                    if (loadId != this.appendGenerationId) {
                        return false;
                    }
                    this._pages.add(page);
                    u(page.j() == Integer.MIN_VALUE ? fi.u.u(p() - page.i().size(), 0) : page.j());
                    this.failedHintsByLoadType.remove(LoadType.APPEND);
                }
            } else {
                if (!(!this.pages.isEmpty())) {
                    throw new IllegalStateException("should've received an init before prepend".toString());
                }
                if (loadId != this.prependGenerationId) {
                    return false;
                }
                this._pages.add(0, page);
                this.initialPageIndex++;
                v(page.k() == Integer.MIN_VALUE ? fi.u.u(q() - page.i().size(), 0) : page.k());
                this.failedHintsByLoadType.remove(LoadType.PREPEND);
            }
        } else {
            if (!this.pages.isEmpty()) {
                throw new IllegalStateException("cannot receive multiple init calls".toString());
            }
            if (!(loadId == 0)) {
                throw new IllegalStateException("init loadId must be the initial value, 0".toString());
            }
            this._pages.add(page);
            this.initialPageIndex = 0;
            u(page.j());
            v(page.k());
        }
        return true;
    }

    public final void u(int i10) {
        if (i10 == Integer.MIN_VALUE) {
            i10 = 0;
        }
        this._placeholdersAfter = i10;
    }

    public final void v(int i10) {
        if (i10 == Integer.MIN_VALUE) {
            i10 = 0;
        }
        this._placeholdersBefore = i10;
    }

    public final boolean w(@dl.d LoadType type, @dl.d v newState) {
        kotlin.jvm.internal.f0.p(type, "type");
        kotlin.jvm.internal.f0.p(newState, "newState");
        if (kotlin.jvm.internal.f0.g(this.sourceLoadStates.h(type), newState)) {
            return false;
        }
        this.sourceLoadStates = this.sourceLoadStates.l(type, newState);
        return true;
    }

    @dl.d
    public final PageEvent<Value> x(@dl.d q0.b.Page<Key, Value> toPageEvent, @dl.d LoadType loadType) {
        kotlin.jvm.internal.f0.p(toPageEvent, "$this$toPageEvent");
        kotlin.jvm.internal.f0.p(loadType, "loadType");
        int i10 = h0.f26423b[loadType.ordinal()];
        int size = 0;
        if (i10 != 1) {
            if (i10 == 2) {
                size = 0 - this.initialPageIndex;
            } else {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                size = (this.pages.size() - this.initialPageIndex) - 1;
            }
        }
        List listK = kotlin.collections.s.k(new TransformablePage(size, toPageEvent.i()));
        int i11 = h0.f26424c[loadType.ordinal()];
        if (i11 == 1) {
            return PageEvent.Insert.INSTANCE.c(listK, q(), p(), new CombinedLoadStates(this.sourceLoadStates.k(), this.sourceLoadStates.j(), this.sourceLoadStates.i(), this.sourceLoadStates, null));
        }
        if (i11 == 2) {
            return PageEvent.Insert.INSTANCE.b(listK, q(), new CombinedLoadStates(this.sourceLoadStates.k(), this.sourceLoadStates.j(), this.sourceLoadStates.i(), this.sourceLoadStates, null));
        }
        if (i11 == 3) {
            return PageEvent.Insert.INSTANCE.a(listK, p(), new CombinedLoadStates(this.sourceLoadStates.k(), this.sourceLoadStates.j(), this.sourceLoadStates.i(), this.sourceLoadStates, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
