package androidx.paging;

import androidx.paging.multicast.Multicaster;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: CachedPageEventFlow.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B#\u0012\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR&\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R#\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u00148\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Landroidx/paging/CachedPageEventFlow;", "", androidx.exifinterface.media.a.f23244d5, "Lkotlin/b2;", "d", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/paging/FlattenedPageController;", ak.av, "Landroidx/paging/FlattenedPageController;", "pageController", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "collectedFromSource", "Landroidx/paging/multicast/Multicaster;", "Lkotlin/collections/h0;", "Landroidx/paging/PageEvent;", ak.aF, "Landroidx/paging/multicast/Multicaster;", "multicastedSrc", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/e;", "e", "()Lkotlinx/coroutines/flow/e;", "downstreamFlow", com.max.hbsearch.l.W, "Lkotlinx/coroutines/q0;", "scope", "<init>", "(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/q0;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class CachedPageEventFlow<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final FlattenedPageController<T> pageController;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean collectedFromSource;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Multicaster<kotlin.collections.h0<PageEvent<T>>> multicastedSrc;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlinx.coroutines.flow.e<PageEvent<T>> downstreamFlow;

    public CachedPageEventFlow(@dl.d kotlinx.coroutines.flow.e<? extends PageEvent<T>> src, @dl.d kotlinx.coroutines.q0 scope) {
        kotlin.jvm.internal.f0.p(src, "src");
        kotlin.jvm.internal.f0.p(scope, "scope");
        FlattenedPageController<T> flattenedPageController = new FlattenedPageController<>();
        this.pageController = flattenedPageController;
        this.collectedFromSource = new AtomicBoolean(false);
        this.multicastedSrc = new Multicaster<>(scope, 0, kotlinx.coroutines.flow.g.I0(new CachedPageEventFlow$multicastedSrc$1(this, src, null)), false, new CachedPageEventFlow$multicastedSrc$2(flattenedPageController), true, 8, null);
        this.downstreamFlow = SimpleChannelFlowKt.a(new CachedPageEventFlow$downstreamFlow$1(this, null));
    }

    @dl.e
    public final Object d(@dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objG = this.multicastedSrc.g(cVar);
        return objG == kotlin.coroutines.intrinsics.b.h() ? objG : b2.f124493a;
    }

    @dl.d
    public final kotlinx.coroutines.flow.e<PageEvent<T>> e() {
        return this.downstreamFlow;
    }
}
