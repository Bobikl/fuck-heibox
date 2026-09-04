package androidx.paging;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Pager.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001BM\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00018\u0000\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\r\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013B7\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00018\u0000\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0014R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\u0015"}, d2 = {"Landroidx/paging/Pager;", "", "Key", "Value", "Lkotlinx/coroutines/flow/e;", "Landroidx/paging/o0;", ak.av, "Lkotlinx/coroutines/flow/e;", "()Lkotlinx/coroutines/flow/e;", "flow", "Landroidx/paging/n0;", "config", "initialKey", "Landroidx/paging/RemoteMediator;", "remoteMediator", "Lkotlin/Function0;", "Landroidx/paging/q0;", "pagingSourceFactory", "<init>", "(Landroidx/paging/n0;Ljava/lang/Object;Landroidx/paging/RemoteMediator;Lyh/a;)V", "(Landroidx/paging/n0;Ljava/lang/Object;Lyh/a;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class Pager<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlinx.coroutines.flow.e<o0<Value>> flow;

    @g
    public Pager(@dl.d n0 config, @dl.e Key key, @dl.e RemoteMediator<Key, Value> remoteMediator, @dl.d yh.a<? extends q0<Key, Value>> pagingSourceFactory) {
        kotlin.jvm.internal.f0.p(config, "config");
        kotlin.jvm.internal.f0.p(pagingSourceFactory, "pagingSourceFactory");
        this.flow = new PageFetcher(pagingSourceFactory instanceof SuspendingPagingSourceFactory ? new Pager$flow$1(pagingSourceFactory) : new Pager$flow$2(pagingSourceFactory, null), key, config, remoteMediator).i();
    }

    public /* synthetic */ Pager(n0 n0Var, Object obj, RemoteMediator remoteMediator, yh.a aVar, int i10, kotlin.jvm.internal.u uVar) {
        this(n0Var, (i10 & 2) != 0 ? null : obj, remoteMediator, aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @xh.i
    public Pager(@dl.d n0 config, @dl.e Key key, @dl.d yh.a<? extends q0<Key, Value>> pagingSourceFactory) {
        this(config, key, null, pagingSourceFactory);
        kotlin.jvm.internal.f0.p(config, "config");
        kotlin.jvm.internal.f0.p(pagingSourceFactory, "pagingSourceFactory");
    }

    public /* synthetic */ Pager(n0 n0Var, Object obj, yh.a aVar, int i10, kotlin.jvm.internal.u uVar) {
        this(n0Var, (i10 & 2) != 0 ? null : obj, aVar);
    }

    @xh.i
    public Pager(@dl.d n0 n0Var, @dl.d yh.a<? extends q0<Key, Value>> aVar) {
        this(n0Var, null, aVar, 2, null);
    }

    @dl.d
    public final kotlinx.coroutines.flow.e<o0<Value>> a() {
        return this.flow;
    }
}
