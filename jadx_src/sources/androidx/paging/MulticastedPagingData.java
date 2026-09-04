package androidx.paging;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: CachedPagingData.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B)\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003J\u0013\u0010\u0006\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\tR\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/paging/MulticastedPagingData;", "", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/o0;", ak.av, "Lkotlin/b2;", "b", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/paging/CachedPageEventFlow;", "Landroidx/paging/CachedPageEventFlow;", "accumulated", "Lkotlinx/coroutines/q0;", "Lkotlinx/coroutines/q0;", "d", "()Lkotlinx/coroutines/q0;", "scope", ak.aF, "Landroidx/paging/o0;", "()Landroidx/paging/o0;", "parent", "Landroidx/paging/ActiveFlowTracker;", "Landroidx/paging/ActiveFlowTracker;", "e", "()Landroidx/paging/ActiveFlowTracker;", "tracker", "<init>", "(Lkotlinx/coroutines/q0;Landroidx/paging/o0;Landroidx/paging/ActiveFlowTracker;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class MulticastedPagingData<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CachedPageEventFlow<T> accumulated;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlinx.coroutines.q0 scope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final o0<T> parent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final ActiveFlowTracker tracker;

    public MulticastedPagingData(@dl.d kotlinx.coroutines.q0 scope, @dl.d o0<T> parent, @dl.e ActiveFlowTracker activeFlowTracker) {
        kotlin.jvm.internal.f0.p(scope, "scope");
        kotlin.jvm.internal.f0.p(parent, "parent");
        this.scope = scope;
        this.parent = parent;
        this.tracker = activeFlowTracker;
        this.accumulated = new CachedPageEventFlow<>(kotlinx.coroutines.flow.g.d1(kotlinx.coroutines.flow.g.l1(parent.e(), new MulticastedPagingData$accumulated$1(this, null)), new MulticastedPagingData$accumulated$2(this, null)), scope);
    }

    public /* synthetic */ MulticastedPagingData(kotlinx.coroutines.q0 q0Var, o0 o0Var, ActiveFlowTracker activeFlowTracker, int i10, kotlin.jvm.internal.u uVar) {
        this(q0Var, o0Var, (i10 & 4) != 0 ? null : activeFlowTracker);
    }

    @dl.d
    public final o0<T> a() {
        return new o0<>(this.accumulated.e(), this.parent.getCom.tencent.open.SocialConstants.PARAM_RECEIVER java.lang.String());
    }

    @dl.e
    public final Object b(@dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objD = this.accumulated.d(cVar);
        return objD == kotlin.coroutines.intrinsics.b.h() ? objD : b2.f124493a;
    }

    @dl.d
    public final o0<T> c() {
        return this.parent;
    }

    @dl.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final kotlinx.coroutines.q0 getScope() {
        return this.scope;
    }

    @dl.e
    /* JADX INFO: renamed from: e, reason: from getter */
    public final ActiveFlowTracker getTracker() {
        return this.tracker;
    }
}
