package androidx.paging;

import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.AdapterListUpdateCallback;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: compiled from: PagingDataAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u0005B+\b\u0007\u0012\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:\u0012\b\b\u0002\u0010=\u001a\u00020<\u0012\b\b\u0002\u0010>\u001a\u00020<¢\u0006\u0004\b?\u0010@J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eJ!\u0010\u0013\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0006\u0010\u0018\u001a\u00020\bJ\u0006\u0010\u0019\u001a\u00020\bJ\u001b\u0010\u001a\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001bJ\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eJ\b\u0010 \u001a\u00020\nH\u0016J\u001a\u0010$\u001a\u00020\b2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\b0!J\u001a\u0010%\u001a\u00020\b2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\b0!J\u0012\u0010)\u001a\u00020(2\n\u0010'\u001a\u0006\u0012\u0002\b\u00030&J\u0012\u0010+\u001a\u00020(2\n\u0010*\u001a\u0006\u0012\u0002\b\u00030&J\u001e\u0010,\u001a\u00020(2\n\u0010'\u001a\u0006\u0012\u0002\b\u00030&2\n\u0010*\u001a\u0006\u0012\u0002\b\u00030&R\u0016\u0010/\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00028\u0000008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001d\u00109\u001a\b\u0012\u0004\u0012\u00020\"048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006A"}, d2 = {"Landroidx/paging/PagingDataAdapter;", "", androidx.exifinterface.media.a.f23244d5, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VH", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter$StateRestorationPolicy;", Constants.KEY_STRATEGY, "Lkotlin/b2;", "setStateRestorationPolicy", "", CommonNetImpl.POSITION, "", "getItemId", "", "hasStableIds", "setHasStableIds", "Landroidx/paging/o0;", "pagingData", "v", "(Landroidx/paging/o0;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", RXScreenCaptureService.KEY_WIDTH, "t", "r", "getItem", "(I)Ljava/lang/Object;", UCropPlusActivity.ARG_INDEX, "q", "Landroidx/paging/p;", ak.aG, "getItemCount", "Lkotlin/Function1;", "Landroidx/paging/d;", com.google.android.gms.common.internal.s.a.f52543a, "o", ak.aB, "Landroidx/paging/w;", "header", "Landroidx/recyclerview/widget/ConcatAdapter;", "y", "footer", "x", ak.aD, "b", "Z", "userSetRestorationPolicy", "Landroidx/paging/AsyncPagingDataDiffer;", ak.aF, "Landroidx/paging/AsyncPagingDataDiffer;", "differ", "Lkotlinx/coroutines/flow/e;", "d", "Lkotlinx/coroutines/flow/e;", "p", "()Lkotlinx/coroutines/flow/e;", "loadStateFlow", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "diffCallback", "Lkotlinx/coroutines/CoroutineDispatcher;", "mainDispatcher", "workerDispatcher", "<init>", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
public abstract class PagingDataAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean userSetRestorationPolicy;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AsyncPagingDataDiffer<T> differ;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlinx.coroutines.flow.e<CombinedLoadStates> loadStateFlow;

    /* JADX INFO: renamed from: androidx.paging.PagingDataAdapter$1, reason: invalid class name */
    /* JADX INFO: compiled from: PagingDataAdapter.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VH", "Lkotlin/b2;", "invoke", "()V", "considerAllowingStateRestoration"}, k = 3, mv = {1, 4, 2})
    public static final class AnonymousClass1 extends Lambda implements yh.a<b2> {
        AnonymousClass1() {
            super(0);
        }

        @Override // yh.a
        public /* bridge */ /* synthetic */ b2 invoke() {
            invoke2();
            return b2.f124493a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (PagingDataAdapter.this.getStateRestorationPolicy() != RecyclerView.Adapter.StateRestorationPolicy.PREVENT || PagingDataAdapter.this.userSetRestorationPolicy) {
                return;
            }
            PagingDataAdapter.this.setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.ALLOW);
        }
    }

    /* JADX INFO: compiled from: PagingDataAdapter.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"androidx/paging/PagingDataAdapter$a", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "", "positionStart", "itemCount", "Lkotlin/b2;", "onItemRangeInserted", "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
    public static final class a extends RecyclerView.AdapterDataObserver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AnonymousClass1 f26011b;

        a(AnonymousClass1 anonymousClass1) {
            this.f26011b = anonymousClass1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i10, int i11) {
            this.f26011b.invoke2();
            PagingDataAdapter.this.unregisterAdapterDataObserver(this);
            super.onItemRangeInserted(i10, i11);
        }
    }

    /* JADX INFO: compiled from: PagingDataAdapter.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0011\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"androidx/paging/PagingDataAdapter$b", "Lkotlin/Function1;", "Landroidx/paging/d;", "Lkotlin/b2;", "loadStates", ak.av, "", "b", "Z", "ignoreNextEvent", "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
    public static final class b implements yh.l<CombinedLoadStates, b2> {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean ignoreNextEvent = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AnonymousClass1 f26014d;

        b(AnonymousClass1 anonymousClass1) {
            this.f26014d = anonymousClass1;
        }

        public void a(@dl.d CombinedLoadStates loadStates) {
            kotlin.jvm.internal.f0.p(loadStates, "loadStates");
            if (this.ignoreNextEvent) {
                this.ignoreNextEvent = false;
            } else if (loadStates.getSource().k() instanceof v.NotLoading) {
                this.f26014d.invoke2();
                PagingDataAdapter.this.s(this);
            }
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ b2 invoke(CombinedLoadStates combinedLoadStates) {
            a(combinedLoadStates);
            return b2.f124493a;
        }
    }

    @xh.i
    public PagingDataAdapter(@dl.d DiffUtil.ItemCallback<T> itemCallback) {
        this(itemCallback, null, null, 6, null);
    }

    @xh.i
    public PagingDataAdapter(@dl.d DiffUtil.ItemCallback<T> itemCallback, @dl.d CoroutineDispatcher coroutineDispatcher) {
        this(itemCallback, coroutineDispatcher, null, 4, null);
    }

    @xh.i
    public PagingDataAdapter(@dl.d DiffUtil.ItemCallback<T> diffCallback, @dl.d CoroutineDispatcher mainDispatcher, @dl.d CoroutineDispatcher workerDispatcher) {
        kotlin.jvm.internal.f0.p(diffCallback, "diffCallback");
        kotlin.jvm.internal.f0.p(mainDispatcher, "mainDispatcher");
        kotlin.jvm.internal.f0.p(workerDispatcher, "workerDispatcher");
        AsyncPagingDataDiffer<T> asyncPagingDataDiffer = new AsyncPagingDataDiffer<>(diffCallback, new AdapterListUpdateCallback(this), mainDispatcher, workerDispatcher);
        this.differ = asyncPagingDataDiffer;
        super.setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.PREVENT);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        registerAdapterDataObserver(new a(anonymousClass1));
        o(new b(anonymousClass1));
        this.loadStateFlow = asyncPagingDataDiffer.m();
    }

    public /* synthetic */ PagingDataAdapter(DiffUtil.ItemCallback itemCallback, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, int i10, kotlin.jvm.internal.u uVar) {
        this(itemCallback, (i10 & 2) != 0 ? kotlinx.coroutines.e1.e() : coroutineDispatcher, (i10 & 4) != 0 ? kotlinx.coroutines.e1.a() : coroutineDispatcher2);
    }

    @dl.e
    protected final T getItem(@androidx.annotation.f0(from = 0) int position) {
        return this.differ.k(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.differ.l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int position) {
        return super.getItemId(position);
    }

    public final void o(@dl.d yh.l<? super CombinedLoadStates, b2> listener) {
        kotlin.jvm.internal.f0.p(listener, "listener");
        this.differ.f(listener);
    }

    @dl.d
    public final kotlinx.coroutines.flow.e<CombinedLoadStates> p() {
        return this.loadStateFlow;
    }

    @dl.e
    public final T q(@androidx.annotation.f0(from = 0) int index) {
        return this.differ.n(index);
    }

    public final void r() {
        this.differ.o();
    }

    public final void s(@dl.d yh.l<? super CombinedLoadStates, b2> listener) {
        kotlin.jvm.internal.f0.p(listener, "listener");
        this.differ.p(listener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z10) {
        throw new UnsupportedOperationException("Stable ids are unsupported on PagingDataAdapter.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setStateRestorationPolicy(@dl.d RecyclerView.Adapter.StateRestorationPolicy strategy) {
        kotlin.jvm.internal.f0.p(strategy, "strategy");
        this.userSetRestorationPolicy = true;
        super.setStateRestorationPolicy(strategy);
    }

    public final void t() {
        this.differ.q();
    }

    @dl.d
    public final p<T> u() {
        return this.differ.s();
    }

    @dl.e
    public final Object v(@dl.d o0<T> o0Var, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objT = this.differ.t(o0Var, cVar);
        return objT == kotlin.coroutines.intrinsics.b.h() ? objT : b2.f124493a;
    }

    public final void w(@dl.d Lifecycle lifecycle, @dl.d o0<T> pagingData) {
        kotlin.jvm.internal.f0.p(lifecycle, "lifecycle");
        kotlin.jvm.internal.f0.p(pagingData, "pagingData");
        this.differ.u(lifecycle, pagingData);
    }

    @dl.d
    public final ConcatAdapter x(@dl.d final w<?> footer) {
        kotlin.jvm.internal.f0.p(footer, "footer");
        o(new yh.l<CombinedLoadStates, b2>() { // from class: androidx.paging.PagingDataAdapter$withLoadStateFooter$1
            {
                super(1);
            }

            public final void a(@dl.d CombinedLoadStates loadStates) {
                kotlin.jvm.internal.f0.p(loadStates, "loadStates");
                footer.r(loadStates.getAppend());
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(CombinedLoadStates combinedLoadStates) {
                a(combinedLoadStates);
                return b2.f124493a;
            }
        });
        return new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{this, footer});
    }

    @dl.d
    public final ConcatAdapter y(@dl.d final w<?> header) {
        kotlin.jvm.internal.f0.p(header, "header");
        o(new yh.l<CombinedLoadStates, b2>() { // from class: androidx.paging.PagingDataAdapter$withLoadStateHeader$1
            {
                super(1);
            }

            public final void a(@dl.d CombinedLoadStates loadStates) {
                kotlin.jvm.internal.f0.p(loadStates, "loadStates");
                header.r(loadStates.getPrepend());
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(CombinedLoadStates combinedLoadStates) {
                a(combinedLoadStates);
                return b2.f124493a;
            }
        });
        return new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{header, this});
    }

    @dl.d
    public final ConcatAdapter z(@dl.d final w<?> header, @dl.d final w<?> footer) {
        kotlin.jvm.internal.f0.p(header, "header");
        kotlin.jvm.internal.f0.p(footer, "footer");
        o(new yh.l<CombinedLoadStates, b2>() { // from class: androidx.paging.PagingDataAdapter$withLoadStateHeaderAndFooter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d CombinedLoadStates loadStates) {
                kotlin.jvm.internal.f0.p(loadStates, "loadStates");
                header.r(loadStates.getPrepend());
                footer.r(loadStates.getAppend());
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(CombinedLoadStates combinedLoadStates) {
                a(combinedLoadStates);
                return b2.f124493a;
            }
        });
        return new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{header, this, footer});
    }
}
