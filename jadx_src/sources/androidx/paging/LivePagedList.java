package androidx.paging;

import androidx.lifecycle.LiveData;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.d2;

/* JADX INFO: compiled from: LivePagedList.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u0004B[\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\b\u0010*\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010 \u0012\u0018\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010,0+\u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010)\u001a\u00020$¢\u0006\u0004\b.\u0010/J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J$\u0010\f\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0002J\b\u0010\r\u001a\u00020\bH\u0014R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010#\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&¨\u00060"}, d2 = {"Landroidx/paging/LivePagedList;", "", "Key", "Value", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "", "force", "Lkotlin/b2;", androidx.exifinterface.media.a.S4, "previous", "next", "F", "m", "Landroidx/paging/PagedList;", "currentData", "Lkotlinx/coroutines/d2;", "n", "Lkotlinx/coroutines/d2;", "currentJob", "Ljava/lang/Runnable;", "p", "Ljava/lang/Runnable;", "refreshRetryCallback", "Lkotlinx/coroutines/q0;", "q", "Lkotlinx/coroutines/q0;", "coroutineScope", "Landroidx/paging/PagedList$d;", "r", "Landroidx/paging/PagedList$d;", "config", "Landroidx/paging/PagedList$a;", ak.aB, "Landroidx/paging/PagedList$a;", "boundaryCallback", "Lkotlinx/coroutines/CoroutineDispatcher;", ak.aG, "Lkotlinx/coroutines/CoroutineDispatcher;", "notifyDispatcher", "v", "fetchDispatcher", "initialKey", "Lkotlin/Function0;", "Landroidx/paging/q0;", "pagingSourceFactory", "<init>", "(Lkotlinx/coroutines/q0;Ljava/lang/Object;Landroidx/paging/PagedList$d;Landroidx/paging/PagedList$a;Lyh/a;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
public final class LivePagedList<Key, Value> extends LiveData<PagedList<Value>> {

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private PagedList<Value> currentData;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private d2 currentJob;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final yh.a<b2> f25630o;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Runnable refreshRetryCallback;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final kotlinx.coroutines.q0 coroutineScope;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final PagedList.d config;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final PagedList.a<Value> boundaryCallback;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final yh.a<q0<Key, Value>> f25635t;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final CoroutineDispatcher notifyDispatcher;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final CoroutineDispatcher fetchDispatcher;

    /* JADX INFO: compiled from: LivePagedList.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Key", "Value", "Lkotlin/b2;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    public static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            LivePagedList.this.E(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LivePagedList(@dl.d kotlinx.coroutines.q0 coroutineScope, @dl.e Key key, @dl.d PagedList.d config, @dl.e PagedList.a<Value> aVar, @dl.d yh.a<? extends q0<Key, Value>> pagingSourceFactory, @dl.d CoroutineDispatcher notifyDispatcher, @dl.d CoroutineDispatcher fetchDispatcher) {
        super(new m(coroutineScope, notifyDispatcher, fetchDispatcher, config, key));
        kotlin.jvm.internal.f0.p(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.f0.p(config, "config");
        kotlin.jvm.internal.f0.p(pagingSourceFactory, "pagingSourceFactory");
        kotlin.jvm.internal.f0.p(notifyDispatcher, "notifyDispatcher");
        kotlin.jvm.internal.f0.p(fetchDispatcher, "fetchDispatcher");
        this.coroutineScope = coroutineScope;
        this.config = config;
        this.boundaryCallback = aVar;
        this.f25635t = pagingSourceFactory;
        this.notifyDispatcher = notifyDispatcher;
        this.fetchDispatcher = fetchDispatcher;
        this.f25630o = new yh.a<b2>() { // from class: androidx.paging.LivePagedList$callback$1
            {
                super(0);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f25639b.E(true);
            }
        };
        a aVar2 = new a();
        this.refreshRetryCallback = aVar2;
        PagedList<Value> pagedListF = f();
        kotlin.jvm.internal.f0.m(pagedListF);
        this.currentData = pagedListF;
        pagedListF.i0(aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(boolean z10) {
        d2 d2Var = this.currentJob;
        if (d2Var == null || z10) {
            if (d2Var != null) {
                d2.a.b(d2Var, null, 1, null);
            }
            this.currentJob = kotlinx.coroutines.k.f(this.coroutineScope, this.fetchDispatcher, null, new LivePagedList$invalidate$1(this, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(PagedList<Value> pagedList, PagedList<Value> pagedList2) {
        pagedList.i0(null);
        pagedList2.i0(this.refreshRetryCallback);
    }

    @Override // androidx.lifecycle.LiveData
    protected void m() {
        super.m();
        E(false);
    }
}
