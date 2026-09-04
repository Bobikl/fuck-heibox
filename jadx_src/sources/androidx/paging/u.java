package androidx.paging;

import androidx.lifecycle.LiveData;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.s1;
import kotlinx.coroutines.v1;

/* JADX INFO: compiled from: LivePagedList.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ao\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f0\u000b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001ao\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f0\u000b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u007f\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f0\u000b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00140\u00132\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u007f\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f0\u000b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00140\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"", "Key", "Value", "Landroidx/paging/DataSource$Factory;", "Landroidx/paging/PagedList$d;", "config", "initialLoadKey", "Landroidx/paging/PagedList$a;", "boundaryCallback", "Ljava/util/concurrent/Executor;", "fetchExecutor", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "b", "(Landroidx/paging/DataSource$Factory;Landroidx/paging/PagedList$d;Ljava/lang/Object;Landroidx/paging/PagedList$a;Ljava/util/concurrent/Executor;)Landroidx/lifecycle/LiveData;", "", "pageSize", ak.av, "(Landroidx/paging/DataSource$Factory;ILjava/lang/Object;Landroidx/paging/PagedList$a;Ljava/util/concurrent/Executor;)Landroidx/lifecycle/LiveData;", "Lkotlin/Function0;", "Landroidx/paging/q0;", "Lkotlinx/coroutines/q0;", "coroutineScope", "Lkotlinx/coroutines/CoroutineDispatcher;", "fetchDispatcher", "d", "(Lyh/a;Landroidx/paging/PagedList$d;Ljava/lang/Object;Landroidx/paging/PagedList$a;Lkotlinx/coroutines/q0;Lkotlinx/coroutines/CoroutineDispatcher;)Landroidx/lifecycle/LiveData;", ak.aF, "(Lyh/a;ILjava/lang/Object;Landroidx/paging/PagedList$a;Lkotlinx/coroutines/q0;Lkotlinx/coroutines/CoroutineDispatcher;)Landroidx/lifecycle/LiveData;", "paging-runtime_release"}, k = 2, mv = {1, 4, 2})
public final class u {
    @dl.d
    @kotlin.k(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @kotlin.s0(expression = "Pager(\n            PagingConfig(pageSize),\n            initialLoadKey,\n            this.asPagingSourceFactory(fetchExecutor.asCoroutineDispatcher())\n        ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData", "kotlinx.coroutines.asCoroutineDispatcher"}))
    public static final <Key, Value> LiveData<PagedList<Value>> a(@dl.d DataSource.Factory<Key, Value> toLiveData, int i10, @dl.e Key key, @dl.e PagedList.a<Value> aVar, @dl.d Executor fetchExecutor) {
        kotlin.jvm.internal.f0.p(toLiveData, "$this$toLiveData");
        kotlin.jvm.internal.f0.p(fetchExecutor, "fetchExecutor");
        return new t(toLiveData, k0.b(i10, 0, false, 0, 0, 30, null)).g(key).d(aVar).f(fetchExecutor).a();
    }

    @dl.d
    @kotlin.k(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @kotlin.s0(expression = "Pager(\n            PagingConfig(\n                config.pageSize,\n                config.prefetchDistance,\n                config.enablePlaceholders,\n                config.initialLoadSizeHint,\n                config.maxSize\n            ),\n            initialLoadKey,\n            this.asPagingSourceFactory(fetchExecutor.asCoroutineDispatcher())\n        ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData", "kotlinx.coroutines.asCoroutineDispatcher"}))
    public static final <Key, Value> LiveData<PagedList<Value>> b(@dl.d DataSource.Factory<Key, Value> toLiveData, @dl.d PagedList.d config, @dl.e Key key, @dl.e PagedList.a<Value> aVar, @dl.d Executor fetchExecutor) {
        kotlin.jvm.internal.f0.p(toLiveData, "$this$toLiveData");
        kotlin.jvm.internal.f0.p(config, "config");
        kotlin.jvm.internal.f0.p(fetchExecutor, "fetchExecutor");
        return new t(toLiveData, config).g(key).d(aVar).f(fetchExecutor).a();
    }

    @dl.d
    @kotlin.k(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @kotlin.s0(expression = "Pager(\n            PagingConfig(pageSize),\n            initialLoadKey,\n            this\n        ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData"}))
    public static final <Key, Value> LiveData<PagedList<Value>> c(@dl.d yh.a<? extends q0<Key, Value>> toLiveData, int i10, @dl.e Key key, @dl.e PagedList.a<Value> aVar, @dl.d kotlinx.coroutines.q0 coroutineScope, @dl.d CoroutineDispatcher fetchDispatcher) {
        kotlin.jvm.internal.f0.p(toLiveData, "$this$toLiveData");
        kotlin.jvm.internal.f0.p(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.f0.p(fetchDispatcher, "fetchDispatcher");
        PagedList.d dVarA = new PagedList.d.a().e(i10).a();
        Executor executorI = androidx.arch.core.executor.c.i();
        kotlin.jvm.internal.f0.o(executorI, "ArchTaskExecutor.getMainThreadExecutor()");
        return new LivePagedList(coroutineScope, key, dVarA, aVar, toLiveData, s1.c(executorI), fetchDispatcher);
    }

    @dl.d
    @kotlin.k(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @kotlin.s0(expression = "Pager(\n            PagingConfig(\n                config.pageSize,\n                config.prefetchDistance,\n                config.enablePlaceholders,\n                config.initialLoadSizeHint,\n                config.maxSize\n            ),\n            initialLoadKey,\n            this\n        ).liveData", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.liveData"}))
    public static final <Key, Value> LiveData<PagedList<Value>> d(@dl.d yh.a<? extends q0<Key, Value>> toLiveData, @dl.d PagedList.d config, @dl.e Key key, @dl.e PagedList.a<Value> aVar, @dl.d kotlinx.coroutines.q0 coroutineScope, @dl.d CoroutineDispatcher fetchDispatcher) {
        kotlin.jvm.internal.f0.p(toLiveData, "$this$toLiveData");
        kotlin.jvm.internal.f0.p(config, "config");
        kotlin.jvm.internal.f0.p(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.f0.p(fetchDispatcher, "fetchDispatcher");
        Executor executorI = androidx.arch.core.executor.c.i();
        kotlin.jvm.internal.f0.o(executorI, "ArchTaskExecutor.getMainThreadExecutor()");
        return new LivePagedList(coroutineScope, key, config, aVar, toLiveData, s1.c(executorI), fetchDispatcher);
    }

    public static /* synthetic */ LiveData e(DataSource.Factory factory, int i10, Object obj, PagedList.a aVar, Executor executor, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            obj = null;
        }
        if ((i11 & 4) != 0) {
            aVar = null;
        }
        if ((i11 & 8) != 0) {
            executor = androidx.arch.core.executor.c.g();
            kotlin.jvm.internal.f0.o(executor, "ArchTaskExecutor.getIOThreadExecutor()");
        }
        return a(factory, i10, obj, aVar, executor);
    }

    public static /* synthetic */ LiveData f(DataSource.Factory factory, PagedList.d dVar, Object obj, PagedList.a aVar, Executor executor, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        if ((i10 & 8) != 0) {
            executor = androidx.arch.core.executor.c.g();
            kotlin.jvm.internal.f0.o(executor, "ArchTaskExecutor.getIOThreadExecutor()");
        }
        return b(factory, dVar, obj, aVar, executor);
    }

    public static /* synthetic */ LiveData g(yh.a aVar, int i10, Object obj, PagedList.a aVar2, kotlinx.coroutines.q0 q0Var, CoroutineDispatcher coroutineDispatcher, int i11, Object obj2) {
        Object obj3 = (i11 & 2) != 0 ? null : obj;
        PagedList.a aVar3 = (i11 & 4) != 0 ? null : aVar2;
        if ((i11 & 8) != 0) {
            q0Var = v1.f130503b;
        }
        kotlinx.coroutines.q0 q0Var2 = q0Var;
        if ((i11 & 16) != 0) {
            Executor executorG = androidx.arch.core.executor.c.g();
            kotlin.jvm.internal.f0.o(executorG, "ArchTaskExecutor.getIOThreadExecutor()");
            coroutineDispatcher = s1.c(executorG);
        }
        return c(aVar, i10, obj3, aVar3, q0Var2, coroutineDispatcher);
    }

    public static /* synthetic */ LiveData h(yh.a aVar, PagedList.d dVar, Object obj, PagedList.a aVar2, kotlinx.coroutines.q0 q0Var, CoroutineDispatcher coroutineDispatcher, int i10, Object obj2) {
        Object obj3 = (i10 & 2) != 0 ? null : obj;
        PagedList.a aVar3 = (i10 & 4) != 0 ? null : aVar2;
        if ((i10 & 8) != 0) {
            q0Var = v1.f130503b;
        }
        kotlinx.coroutines.q0 q0Var2 = q0Var;
        if ((i10 & 16) != 0) {
            Executor executorG = androidx.arch.core.executor.c.g();
            kotlin.jvm.internal.f0.o(executorG, "ArchTaskExecutor.getIOThreadExecutor()");
            coroutineDispatcher = s1.c(executorG);
        }
        return d(aVar, dVar, obj3, aVar3, q0Var2, coroutineDispatcher);
    }
}
