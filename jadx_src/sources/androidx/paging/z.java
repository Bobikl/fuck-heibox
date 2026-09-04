package androidx.paging;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.model.StickerGroupInfo;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: MutableLoadStateCollection.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0002J*\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0002J\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\nJ\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eJ\u001e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0004J\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014J3\u0010\u001b\u001a\u00020\u00022\u001e\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0019H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010!R\u0016\u0010)\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010(\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006-"}, d2 = {"Landroidx/paging/z;", "", "Lkotlin/b2;", "m", "Landroidx/paging/v;", "previousState", "sourceRefreshState", "sourceState", "remoteState", "e", "Landroidx/paging/d;", "k", "combinedLoadStates", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/paging/x;", "sourceLoadStates", "remoteLoadStates", "i", "Landroidx/paging/LoadType;", "type", "", StickerGroupInfo.STICKER_TYPE_REMOTE, "state", "j", "g", "Lkotlin/Function3;", "op", "f", "(Lyh/q;)V", "loadType", "l", "(Landroidx/paging/LoadType;)Z", ak.av, "Landroidx/paging/v;", "refresh", "b", "prepend", ak.aF, "append", "d", "Landroidx/paging/x;", "source", "mediator", "<init>", "()V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private v refresh;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private v prepend;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private v append;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private LoadStates source;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private LoadStates mediator;

    public z() {
        v.NotLoading.Companion companion = v.NotLoading.INSTANCE;
        this.refresh = companion.b();
        this.prepend = companion.b();
        this.append = companion.b();
        this.source = LoadStates.INSTANCE.a();
    }

    private final v e(v previousState, v sourceRefreshState, v sourceState, v remoteState) {
        if (remoteState == null) {
            return sourceState;
        }
        return (!(previousState instanceof v.Loading) || ((sourceRefreshState instanceof v.NotLoading) && (remoteState instanceof v.NotLoading)) || (remoteState instanceof v.Error)) ? remoteState : previousState;
    }

    private final void m() {
        v vVar = this.refresh;
        v vVarK = this.source.k();
        v vVarK2 = this.source.k();
        LoadStates loadStates = this.mediator;
        this.refresh = e(vVar, vVarK, vVarK2, loadStates != null ? loadStates.k() : null);
        v vVar2 = this.prepend;
        v vVarK3 = this.source.k();
        v vVarJ = this.source.j();
        LoadStates loadStates2 = this.mediator;
        this.prepend = e(vVar2, vVarK3, vVarJ, loadStates2 != null ? loadStates2.j() : null);
        v vVar3 = this.append;
        v vVarK4 = this.source.k();
        v vVarI = this.source.i();
        LoadStates loadStates3 = this.mediator;
        this.append = e(vVar3, vVarK4, vVarI, loadStates3 != null ? loadStates3.i() : null);
    }

    public final void f(@dl.d yh.q<? super LoadType, ? super Boolean, ? super v, b2> op) {
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

    @dl.e
    public final v g(@dl.d LoadType type, boolean remote) {
        kotlin.jvm.internal.f0.p(type, "type");
        LoadStates loadStates = remote ? this.mediator : this.source;
        if (loadStates != null) {
            return loadStates.h(type);
        }
        return null;
    }

    public final void h(@dl.d CombinedLoadStates combinedLoadStates) {
        kotlin.jvm.internal.f0.p(combinedLoadStates, "combinedLoadStates");
        this.refresh = combinedLoadStates.getRefresh();
        this.prepend = combinedLoadStates.getPrepend();
        this.append = combinedLoadStates.getAppend();
        this.source = combinedLoadStates.getSource();
        this.mediator = combinedLoadStates.getMediator();
    }

    public final void i(@dl.d LoadStates sourceLoadStates, @dl.e LoadStates loadStates) {
        kotlin.jvm.internal.f0.p(sourceLoadStates, "sourceLoadStates");
        this.source = sourceLoadStates;
        this.mediator = loadStates;
        m();
    }

    public final boolean j(@dl.d LoadType type, boolean remote, @dl.d v state) {
        boolean zG;
        kotlin.jvm.internal.f0.p(type, "type");
        kotlin.jvm.internal.f0.p(state, "state");
        if (remote) {
            LoadStates loadStates = this.mediator;
            LoadStates loadStatesL = (loadStates != null ? loadStates : LoadStates.INSTANCE.a()).l(type, state);
            this.mediator = loadStatesL;
            zG = kotlin.jvm.internal.f0.g(loadStatesL, loadStates);
        } else {
            LoadStates loadStates2 = this.source;
            LoadStates loadStatesL2 = loadStates2.l(type, state);
            this.source = loadStatesL2;
            zG = kotlin.jvm.internal.f0.g(loadStatesL2, loadStates2);
        }
        boolean z10 = !zG;
        m();
        return z10;
    }

    @dl.d
    public final CombinedLoadStates k() {
        return new CombinedLoadStates(this.refresh, this.prepend, this.append, this.source, this.mediator);
    }

    public final boolean l(@dl.d LoadType loadType) {
        kotlin.jvm.internal.f0.p(loadType, "loadType");
        v vVarG = g(loadType, false);
        kotlin.jvm.internal.f0.m(vVarG);
        if (!vVarG.getEndOfPaginationReached()) {
            return false;
        }
        v vVarG2 = g(loadType, true);
        return vVarG2 == null || vVarG2.getEndOfPaginationReached();
    }
}
