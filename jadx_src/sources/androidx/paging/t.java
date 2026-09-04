package androidx.paging;

import androidx.lifecycle.LiveData;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.s1;
import kotlinx.coroutines.v1;

/* JADX INFO: compiled from: LivePagedListBuilder.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.k(message = "PagedList is deprecated and has been replaced by PagingData")
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B%\b\u0017\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013\u0012\u0006\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b%\u0010&B%\b\u0017\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b%\u0010)B+\b\u0017\u0012\u0018\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010+0*\u0012\u0006\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b%\u0010-B+\b\u0017\u0012\u0018\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010+0*\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b%\u0010.J\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004J#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJ\"\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\nJ\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000e\u001a\u00020\rJ\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00110\u0010R\"\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR$\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u000f\u0010 \u0012\u0004\b!\u0010\u001bR\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010#¨\u0006/"}, d2 = {"Landroidx/paging/t;", "", "Key", "Value", "Lkotlinx/coroutines/q0;", "coroutineScope", "e", "key", "g", "(Ljava/lang/Object;)Landroidx/paging/t;", "Landroidx/paging/PagedList$a;", "boundaryCallback", "d", "Ljava/util/concurrent/Executor;", "fetchExecutor", "f", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", ak.av, "Landroidx/paging/DataSource$Factory;", "b", "Landroidx/paging/DataSource$Factory;", "dataSourceFactory", "Landroidx/paging/PagedList$d;", ak.aF, "Landroidx/paging/PagedList$d;", "getConfig$annotations", "()V", "config", "Lkotlinx/coroutines/q0;", "Ljava/lang/Object;", "initialLoadKey", "Landroidx/paging/PagedList$a;", "getBoundaryCallback$annotations", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "fetchDispatcher", "<init>", "(Landroidx/paging/DataSource$Factory;Landroidx/paging/PagedList$d;)V", "", "pageSize", "(Landroidx/paging/DataSource$Factory;I)V", "Lkotlin/Function0;", "Landroidx/paging/q0;", "pagingSourceFactory", "(Lyh/a;Landroidx/paging/PagedList$d;)V", "(Lyh/a;I)V", "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
public final class t<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yh.a<q0<Key, Value>> f26624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final DataSource.Factory<Key, Value> dataSourceFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final PagedList.d config;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private kotlinx.coroutines.q0 coroutineScope;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Key initialLoadKey;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private PagedList.a<Value> boundaryCallback;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private CoroutineDispatcher fetchDispatcher;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.k(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @kotlin.s0(expression = "Pager(\n                PagingConfig(pageSize),\n                initialLoadKey,\n                dataSourceFactory.asPagingSourceFactory(Dispatchers.IO)\n            ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData", "kotlinx.coroutines.Dispatchers"}))
    public t(@dl.d DataSource.Factory<Key, Value> dataSourceFactory, int i10) {
        this(dataSourceFactory, new PagedList.d.a().e(i10).a());
        kotlin.jvm.internal.f0.p(dataSourceFactory, "dataSourceFactory");
    }

    @kotlin.k(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @kotlin.s0(expression = "Pager(\n                PagingConfig(\n                    config.pageSize,\n                    config.prefetchDistance,\n                    config.enablePlaceholders,\n                    config.initialLoadSizeHint,\n                    config.maxSize\n                ),\n                initialLoadKey,\n                dataSourceFactory.asPagingSourceFactory(Dispatchers.IO)\n            ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData", "kotlinx.coroutines.Dispatchers"}))
    public t(@dl.d DataSource.Factory<Key, Value> dataSourceFactory, @dl.d PagedList.d config) {
        kotlin.jvm.internal.f0.p(dataSourceFactory, "dataSourceFactory");
        kotlin.jvm.internal.f0.p(config, "config");
        this.coroutineScope = v1.f130503b;
        Executor executorG = androidx.arch.core.executor.c.g();
        kotlin.jvm.internal.f0.o(executorG, "ArchTaskExecutor.getIOThreadExecutor()");
        this.fetchDispatcher = s1.c(executorG);
        this.f26624a = null;
        this.dataSourceFactory = dataSourceFactory;
        this.config = config;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.k(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @kotlin.s0(expression = "Pager(\n                PagingConfig(pageSize),\n                initialLoadKey,\n                this\n            ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData"}))
    public t(@dl.d yh.a<? extends q0<Key, Value>> pagingSourceFactory, int i10) {
        this(pagingSourceFactory, new PagedList.d.a().e(i10).a());
        kotlin.jvm.internal.f0.p(pagingSourceFactory, "pagingSourceFactory");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.k(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @kotlin.s0(expression = "Pager(\n                PagingConfig(\n                    config.pageSize,\n                    config.prefetchDistance,\n                    config.enablePlaceholders,\n                    config.initialLoadSizeHint,\n                    config.maxSize\n                ),\n                initialLoadKey,\n                this\n            ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData"}))
    public t(@dl.d yh.a<? extends q0<Key, Value>> pagingSourceFactory, @dl.d PagedList.d config) {
        kotlin.jvm.internal.f0.p(pagingSourceFactory, "pagingSourceFactory");
        kotlin.jvm.internal.f0.p(config, "config");
        this.coroutineScope = v1.f130503b;
        Executor executorG = androidx.arch.core.executor.c.g();
        kotlin.jvm.internal.f0.o(executorG, "ArchTaskExecutor.getIOThreadExecutor()");
        this.fetchDispatcher = s1.c(executorG);
        this.f26624a = pagingSourceFactory;
        this.dataSourceFactory = null;
        this.config = config;
    }

    private static /* synthetic */ void b() {
    }

    private static /* synthetic */ void c() {
    }

    @dl.d
    public final LiveData<PagedList<Value>> a() {
        yh.a<q0<Key, Value>> aVarB = this.f26624a;
        if (aVarB == null) {
            DataSource.Factory<Key, Value> factory = this.dataSourceFactory;
            aVarB = factory != null ? factory.b(this.fetchDispatcher) : null;
        }
        yh.a<q0<Key, Value>> aVar = aVarB;
        if (!(aVar != null)) {
            throw new IllegalStateException("LivePagedList cannot be built without a PagingSourceFactory or DataSource.Factory".toString());
        }
        kotlinx.coroutines.q0 q0Var = this.coroutineScope;
        Key key = this.initialLoadKey;
        PagedList.d dVar = this.config;
        PagedList.a<Value> aVar2 = this.boundaryCallback;
        Executor executorI = androidx.arch.core.executor.c.i();
        kotlin.jvm.internal.f0.o(executorI, "ArchTaskExecutor.getMainThreadExecutor()");
        return new LivePagedList(q0Var, key, dVar, aVar2, aVar, s1.c(executorI), this.fetchDispatcher);
    }

    @dl.d
    public final t<Key, Value> d(@dl.e PagedList.a<Value> boundaryCallback) {
        this.boundaryCallback = boundaryCallback;
        return this;
    }

    @dl.d
    public final t<Key, Value> e(@dl.d kotlinx.coroutines.q0 coroutineScope) {
        kotlin.jvm.internal.f0.p(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        return this;
    }

    @dl.d
    public final t<Key, Value> f(@dl.d Executor fetchExecutor) {
        kotlin.jvm.internal.f0.p(fetchExecutor, "fetchExecutor");
        this.fetchDispatcher = s1.c(fetchExecutor);
        return this;
    }

    @dl.d
    public final t<Key, Value> g(@dl.e Key key) {
        this.initialLoadKey = key;
        return this;
    }
}
