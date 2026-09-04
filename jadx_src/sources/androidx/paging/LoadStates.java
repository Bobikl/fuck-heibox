package androidx.paging;

import androidx.annotation.RestrictTo;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;

/* JADX INFO: renamed from: androidx.paging.x, reason: from toString */
/* JADX INFO: compiled from: LoadStates.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010#J&\u0010\u0007\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\u0087\bø\u0001\u0000J\u001f\u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b!\u0010\u001f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006$"}, d2 = {"Landroidx/paging/x;", "", "Lkotlin/Function2;", "Landroidx/paging/LoadType;", "Landroidx/paging/v;", "Lkotlin/b2;", "op", "g", "loadType", "newState", "l", "(Landroidx/paging/LoadType;Landroidx/paging/v;)Landroidx/paging/x;", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/paging/LoadType;)Landroidx/paging/v;", "b", ak.aF, "d", "refresh", "prepend", "append", "e", "", "toString", "", "hashCode", "other", "", "equals", ak.av, "Landroidx/paging/v;", "k", "()Landroidx/paging/v;", "j", "i", "<init>", "(Landroidx/paging/v;Landroidx/paging/v;Landroidx/paging/v;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final /* data */ class LoadStates {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final LoadStates f26665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final v refresh;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final v prepend;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final v append;

    /* JADX INFO: renamed from: androidx.paging.x$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: LoadStates.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/paging/x$a;", "", "Landroidx/paging/x;", "IDLE", "Landroidx/paging/x;", ak.av, "()Landroidx/paging/x;", "<init>", "()V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final LoadStates a() {
            return LoadStates.f26665d;
        }
    }

    static {
        v.NotLoading.Companion companion = v.NotLoading.INSTANCE;
        f26665d = new LoadStates(companion.b(), companion.b(), companion.b());
    }

    public LoadStates(@dl.d v refresh, @dl.d v prepend, @dl.d v append) {
        kotlin.jvm.internal.f0.p(refresh, "refresh");
        kotlin.jvm.internal.f0.p(prepend, "prepend");
        kotlin.jvm.internal.f0.p(append, "append");
        this.refresh = refresh;
        this.prepend = prepend;
        this.append = append;
    }

    public static /* synthetic */ LoadStates f(LoadStates loadStates, v vVar, v vVar2, v vVar3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            vVar = loadStates.refresh;
        }
        if ((i10 & 2) != 0) {
            vVar2 = loadStates.prepend;
        }
        if ((i10 & 4) != 0) {
            vVar3 = loadStates.append;
        }
        return loadStates.e(vVar, vVar2, vVar3);
    }

    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final v getRefresh() {
        return this.refresh;
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final v getPrepend() {
        return this.prepend;
    }

    @dl.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final v getAppend() {
        return this.append;
    }

    @dl.d
    public final LoadStates e(@dl.d v refresh, @dl.d v prepend, @dl.d v append) {
        kotlin.jvm.internal.f0.p(refresh, "refresh");
        kotlin.jvm.internal.f0.p(prepend, "prepend");
        kotlin.jvm.internal.f0.p(append, "append");
        return new LoadStates(refresh, prepend, append);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadStates)) {
            return false;
        }
        LoadStates loadStates = (LoadStates) other;
        return kotlin.jvm.internal.f0.g(this.refresh, loadStates.refresh) && kotlin.jvm.internal.f0.g(this.prepend, loadStates.prepend) && kotlin.jvm.internal.f0.g(this.append, loadStates.append);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void g(@dl.d yh.p<? super LoadType, ? super v, b2> op) {
        kotlin.jvm.internal.f0.p(op, "op");
        op.invoke(LoadType.REFRESH, k());
        op.invoke(LoadType.PREPEND, j());
        op.invoke(LoadType.APPEND, i());
    }

    @dl.d
    public final v h(@dl.d LoadType loadType) {
        kotlin.jvm.internal.f0.p(loadType, "loadType");
        int i10 = y.f26671b[loadType.ordinal()];
        if (i10 == 1) {
            return this.refresh;
        }
        if (i10 == 2) {
            return this.append;
        }
        if (i10 == 3) {
            return this.prepend;
        }
        throw new NoWhenBranchMatchedException();
    }

    public int hashCode() {
        v vVar = this.refresh;
        int iHashCode = (vVar != null ? vVar.hashCode() : 0) * 31;
        v vVar2 = this.prepend;
        int iHashCode2 = (iHashCode + (vVar2 != null ? vVar2.hashCode() : 0)) * 31;
        v vVar3 = this.append;
        return iHashCode2 + (vVar3 != null ? vVar3.hashCode() : 0);
    }

    @dl.d
    public final v i() {
        return this.append;
    }

    @dl.d
    public final v j() {
        return this.prepend;
    }

    @dl.d
    public final v k() {
        return this.refresh;
    }

    @dl.d
    public final LoadStates l(@dl.d LoadType loadType, @dl.d v newState) {
        kotlin.jvm.internal.f0.p(loadType, "loadType");
        kotlin.jvm.internal.f0.p(newState, "newState");
        int i10 = y.f26670a[loadType.ordinal()];
        if (i10 == 1) {
            return f(this, null, null, newState, 3, null);
        }
        if (i10 == 2) {
            return f(this, null, newState, null, 5, null);
        }
        if (i10 == 3) {
            return f(this, newState, null, null, 6, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    @dl.d
    public String toString() {
        return "LoadStates(refresh=" + this.refresh + ", prepend=" + this.prepend + ", append=" + this.append + ")";
    }
}
