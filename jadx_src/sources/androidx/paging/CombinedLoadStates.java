package androidx.paging;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: renamed from: androidx.paging.d, reason: from toString */
/* JADX INFO: compiled from: CombinedLoadStates.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0010B3\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b \u0010!J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J/\u0010\u000e\u001a\u00020\f2\u001e\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\tH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u001a\u0010\u001d¨\u0006\""}, d2 = {"Landroidx/paging/d;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lkotlin/Function3;", "Landroidx/paging/LoadType;", "Landroidx/paging/v;", "Lkotlin/b2;", "op", "b", "(Lyh/q;)V", ak.av, "Landroidx/paging/v;", "f", "()Landroidx/paging/v;", "refresh", "e", "prepend", ak.aF, "append", "Landroidx/paging/x;", "d", "Landroidx/paging/x;", "g", "()Landroidx/paging/x;", "source", "mediator", "<init>", "(Landroidx/paging/v;Landroidx/paging/v;Landroidx/paging/v;Landroidx/paging/x;Landroidx/paging/x;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class CombinedLoadStates {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final CombinedLoadStates f26379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
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

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final LoadStates source;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final LoadStates mediator;

    /* JADX INFO: renamed from: androidx.paging.d$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: CombinedLoadStates.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/paging/d$a;", "", "Landroidx/paging/d;", "IDLE_SOURCE", "Landroidx/paging/d;", ak.av, "()Landroidx/paging/d;", "<init>", "()V", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final CombinedLoadStates a() {
            return CombinedLoadStates.f26379f;
        }
    }

    static {
        v.NotLoading.Companion companion = v.NotLoading.INSTANCE;
        f26379f = new CombinedLoadStates(companion.b(), companion.b(), companion.b(), LoadStates.INSTANCE.a(), null, 16, null);
    }

    public CombinedLoadStates(@dl.d v refresh, @dl.d v prepend, @dl.d v append, @dl.d LoadStates source, @dl.e LoadStates loadStates) {
        kotlin.jvm.internal.f0.p(refresh, "refresh");
        kotlin.jvm.internal.f0.p(prepend, "prepend");
        kotlin.jvm.internal.f0.p(append, "append");
        kotlin.jvm.internal.f0.p(source, "source");
        this.refresh = refresh;
        this.prepend = prepend;
        this.append = append;
        this.source = source;
        this.mediator = loadStates;
    }

    public /* synthetic */ CombinedLoadStates(v vVar, v vVar2, v vVar3, LoadStates loadStates, LoadStates loadStates2, int i10, kotlin.jvm.internal.u uVar) {
        this(vVar, vVar2, vVar3, loadStates, (i10 & 16) != 0 ? null : loadStates2);
    }

    public final void b(@dl.d yh.q<? super LoadType, ? super Boolean, ? super v, b2> op) {
        kotlin.jvm.internal.f0.p(op, "op");
        LoadStates loadStates = this.source;
        LoadType loadType = LoadType.REFRESH;
        v vVarK = loadStates.k();
        Boolean bool = Boolean.FALSE;
        op.invoke(loadType, bool, vVarK);
        LoadType loadType2 = LoadType.PREPEND;
        op.invoke(loadType2, bool, loadStates.j());
        LoadType loadType3 = LoadType.APPEND;
        op.invoke(loadType3, bool, loadStates.i());
        LoadStates loadStates2 = this.mediator;
        if (loadStates2 != null) {
            v vVarK2 = loadStates2.k();
            Boolean bool2 = Boolean.TRUE;
            op.invoke(loadType, bool2, vVarK2);
            op.invoke(loadType2, bool2, loadStates2.j());
            op.invoke(loadType3, bool2, loadStates2.i());
        }
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final v getAppend() {
        return this.append;
    }

    @dl.e
    /* JADX INFO: renamed from: d, reason: from getter */
    public final LoadStates getMediator() {
        return this.mediator;
    }

    @dl.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public final v getPrepend() {
        return this.prepend;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.f0.g(CombinedLoadStates.class, other != null ? other.getClass() : null)) {
            return false;
        }
        if (other == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.paging.CombinedLoadStates");
        }
        CombinedLoadStates combinedLoadStates = (CombinedLoadStates) other;
        return ((kotlin.jvm.internal.f0.g(this.refresh, combinedLoadStates.refresh) ^ true) || (kotlin.jvm.internal.f0.g(this.prepend, combinedLoadStates.prepend) ^ true) || (kotlin.jvm.internal.f0.g(this.append, combinedLoadStates.append) ^ true) || (kotlin.jvm.internal.f0.g(this.source, combinedLoadStates.source) ^ true) || (kotlin.jvm.internal.f0.g(this.mediator, combinedLoadStates.mediator) ^ true)) ? false : true;
    }

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final v getRefresh() {
        return this.refresh;
    }

    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final LoadStates getSource() {
        return this.source;
    }

    public int hashCode() {
        int iHashCode = ((((((this.refresh.hashCode() * 31) + this.prepend.hashCode()) * 31) + this.append.hashCode()) * 31) + this.source.hashCode()) * 31;
        LoadStates loadStates = this.mediator;
        return iHashCode + (loadStates != null ? loadStates.hashCode() : 0);
    }

    @dl.d
    public String toString() {
        return "CombinedLoadStates(refresh=" + this.refresh + ", prepend=" + this.prepend + ", append=" + this.append + ", source=" + this.source + ", mediator=" + this.mediator + ')';
    }
}
