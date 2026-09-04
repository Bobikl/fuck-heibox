package androidx.paging;

import androidx.recyclerview.widget.AdapterListUpdateCallback;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: PagedListAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.k(message = "PagedListAdapter is deprecated and has been replaced by PagingDataAdapter", replaceWith = @kotlin.s0(expression = "PagingDataAdapter<T, VH>", imports = {"androidx.paging.PagingDataAdapter"}))
@Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u0005B\u0017\b\u0014\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.¢\u0006\u0004\b0\u00101B\u0017\b\u0014\u0012\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u000002¢\u0006\u0004\b0\u00104J\u0018\u0010\t\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006H\u0016J\"\u0010\f\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0019\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\rH\u0016J\u0018\u0010\u0013\u001a\u00020\b2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006H\u0017J(\u0010\u0015\u001a\u00020\b2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00062\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006H\u0016J\"\u0010\u001a\u001a\u00020\b2\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\b0\u0016H\u0016J\"\u0010\u001b\u001a\u00020\b2\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\b0\u0016H\u0016J\u0012\u0010\u001f\u001a\u00020\u001e2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001cJ\u0012\u0010!\u001a\u00020\u001e2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\u001cJ\u001e\u0010\"\u001a\u00020\u001e2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001c2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\u001cR&\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000#8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068VX\u0096\u0004¢\u0006\f\u0012\u0004\b-\u0010)\u001a\u0004\b+\u0010,¨\u00065"}, d2 = {"Landroidx/paging/PagedListAdapter;", "", androidx.exifinterface.media.a.f23244d5, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VH", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/paging/PagedList;", "pagedList", "Lkotlin/b2;", "v", "Ljava/lang/Runnable;", "commitCallback", RXScreenCaptureService.KEY_WIDTH, "", CommonNetImpl.POSITION, "getItem", "(I)Ljava/lang/Object;", "getItemCount", "currentList", ak.aB, "previousList", "t", "Lkotlin/Function2;", "Landroidx/paging/LoadType;", "Landroidx/paging/v;", com.google.android.gms.common.internal.s.a.f52543a, "m", ak.aG, "Landroidx/paging/w;", "header", "Landroidx/recyclerview/widget/ConcatAdapter;", "y", "footer", "x", ak.aD, "Landroidx/paging/AsyncPagedListDiffer;", "b", "Landroidx/paging/AsyncPagedListDiffer;", "p", "()Landroidx/paging/AsyncPagedListDiffer;", "getDiffer$paging_runtime_release$annotations", "()V", "differ", "n", "()Landroidx/paging/PagedList;", "getCurrentList$annotations", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "diffCallback", "<init>", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "Landroidx/recyclerview/widget/AsyncDifferConfig;", "config", "(Landroidx/recyclerview/widget/AsyncDifferConfig;)V", "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
public abstract class PagedListAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AsyncPagedListDiffer<T> differ;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final yh.p<PagedList<T>, PagedList<T>, b2> f25997c;

    protected PagedListAdapter(@dl.d AsyncDifferConfig<T> config) {
        kotlin.jvm.internal.f0.p(config, "config");
        yh.p<PagedList<T>, PagedList<T>, b2> pVar = new yh.p<PagedList<T>, PagedList<T>, b2>() { // from class: androidx.paging.PagedListAdapter$listener$1
            {
                super(2);
            }

            public final void a(@dl.e PagedList<T> pagedList, @dl.e PagedList<T> pagedList2) {
                this.f25998b.s(pagedList2);
                this.f25998b.t(pagedList, pagedList2);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(Object obj, Object obj2) {
                a((PagedList) obj, (PagedList) obj2);
                return b2.f124493a;
            }
        };
        this.f25997c = pVar;
        AsyncPagedListDiffer<T> asyncPagedListDiffer = new AsyncPagedListDiffer<>(new AdapterListUpdateCallback(this), config);
        this.differ = asyncPagedListDiffer;
        asyncPagedListDiffer.c(pVar);
    }

    protected PagedListAdapter(@dl.d DiffUtil.ItemCallback<T> diffCallback) {
        kotlin.jvm.internal.f0.p(diffCallback, "diffCallback");
        yh.p<PagedList<T>, PagedList<T>, b2> pVar = new yh.p<PagedList<T>, PagedList<T>, b2>() { // from class: androidx.paging.PagedListAdapter$listener$1
            {
                super(2);
            }

            public final void a(@dl.e PagedList<T> pagedList, @dl.e PagedList<T> pagedList2) {
                this.f25998b.s(pagedList2);
                this.f25998b.t(pagedList, pagedList2);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(Object obj, Object obj2) {
                a((PagedList) obj, (PagedList) obj2);
                return b2.f124493a;
            }
        };
        this.f25997c = pVar;
        AsyncPagedListDiffer<T> asyncPagedListDiffer = new AsyncPagedListDiffer<>(this, diffCallback);
        this.differ = asyncPagedListDiffer;
        asyncPagedListDiffer.c(pVar);
    }

    public static /* synthetic */ void o() {
    }

    public static /* synthetic */ void q() {
    }

    private static /* synthetic */ void r() {
    }

    @dl.e
    protected T getItem(int position) {
        return this.differ.h(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.differ.i();
    }

    public void m(@dl.d yh.p<? super LoadType, ? super v, b2> listener) {
        kotlin.jvm.internal.f0.p(listener, "listener");
        this.differ.a(listener);
    }

    @dl.e
    public PagedList<T> n() {
        return this.differ.f();
    }

    @dl.d
    public final AsyncPagedListDiffer<T> p() {
        return this.differ;
    }

    @kotlin.k(message = "Use the two argument variant instead.", replaceWith = @kotlin.s0(expression = "onCurrentListChanged(previousList, currentList)", imports = {}))
    public void s(@dl.e PagedList<T> pagedList) {
    }

    public void t(@dl.e PagedList<T> pagedList, @dl.e PagedList<T> pagedList2) {
    }

    public void u(@dl.d yh.p<? super LoadType, ? super v, b2> listener) {
        kotlin.jvm.internal.f0.p(listener, "listener");
        this.differ.w(listener);
    }

    public void v(@dl.e PagedList<T> pagedList) {
        this.differ.C(pagedList);
    }

    public void w(@dl.e PagedList<T> pagedList, @dl.e Runnable runnable) {
        this.differ.D(pagedList, runnable);
    }

    @dl.d
    public final ConcatAdapter x(@dl.d final w<?> footer) {
        kotlin.jvm.internal.f0.p(footer, "footer");
        m(new yh.p<LoadType, v, b2>() { // from class: androidx.paging.PagedListAdapter$withLoadStateFooter$1
            {
                super(2);
            }

            public final void a(@dl.d LoadType loadType, @dl.d v loadState) {
                kotlin.jvm.internal.f0.p(loadType, "loadType");
                kotlin.jvm.internal.f0.p(loadState, "loadState");
                if (loadType == LoadType.APPEND) {
                    footer.r(loadState);
                }
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(LoadType loadType, v vVar) {
                a(loadType, vVar);
                return b2.f124493a;
            }
        });
        return new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{this, footer});
    }

    @dl.d
    public final ConcatAdapter y(@dl.d final w<?> header) {
        kotlin.jvm.internal.f0.p(header, "header");
        m(new yh.p<LoadType, v, b2>() { // from class: androidx.paging.PagedListAdapter$withLoadStateHeader$1
            {
                super(2);
            }

            public final void a(@dl.d LoadType loadType, @dl.d v loadState) {
                kotlin.jvm.internal.f0.p(loadType, "loadType");
                kotlin.jvm.internal.f0.p(loadState, "loadState");
                if (loadType == LoadType.PREPEND) {
                    header.r(loadState);
                }
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(LoadType loadType, v vVar) {
                a(loadType, vVar);
                return b2.f124493a;
            }
        });
        return new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{header, this});
    }

    @dl.d
    public final ConcatAdapter z(@dl.d final w<?> header, @dl.d final w<?> footer) {
        kotlin.jvm.internal.f0.p(header, "header");
        kotlin.jvm.internal.f0.p(footer, "footer");
        m(new yh.p<LoadType, v, b2>() { // from class: androidx.paging.PagedListAdapter$withLoadStateHeaderAndFooter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.d LoadType loadType, @dl.d v loadState) {
                kotlin.jvm.internal.f0.p(loadType, "loadType");
                kotlin.jvm.internal.f0.p(loadState, "loadState");
                if (loadType == LoadType.PREPEND) {
                    header.r(loadState);
                } else if (loadType == LoadType.APPEND) {
                    footer.r(loadState);
                }
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(LoadType loadType, v vVar) {
                a(loadType, vVar);
                return b2.f124493a;
            }
        });
        return new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{header, this, footer});
    }
}
