package androidx.paging;

import androidx.recyclerview.widget.AdapterListUpdateCallback;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: AsyncPagedListDiffer.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.k(message = "AsyncPagedListDiffer is deprecated and has been replaced by AsyncPagingDataDiffer", replaceWith = @kotlin.s0(expression = "AsyncPagingDataDiffer<T>", imports = {"androidx.paging.AsyncPagingDataDiffer"}))
@Metadata(bv = {}, d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002$\u001cB#\b\u0017\u0012\n\u0010i\u001a\u0006\u0012\u0002\b\u00030h\u0012\f\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00000j¢\u0006\u0004\bl\u0010mB\u001f\b\u0017\u0012\u0006\u0010n\u001a\u00020&\u0012\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000-¢\u0006\u0004\bl\u0010oJ2\u0010\t\u001a\u00020\b2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0019\u0010\f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016J\"\u0010\u0010\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016JM\u0010\u0018\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001c\u001a\u00020\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016J0\u0010\u001f\u001a\u00020\b2(\u0010\u001e\u001a$\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u0012\u0004\u0012\u00020\b0\u001dJ\u0016\u0010 \u001a\u00020\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016J0\u0010!\u001a\u00020\b2(\u0010\u001e\u001a$\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u0012\u0004\u0012\u00020\b0\u001dJ\"\u0010$\u001a\u00020\b2\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\b0\u001dH\u0016J\"\u0010%\u001a\u00020\b2\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\b0\u001dH\u0016R\"\u0010,\u001a\u00020&8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b$\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R&\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000-8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010.\u0012\u0004\b1\u00102\u001a\u0004\b/\u00100R\"\u0010:\u001a\u0002048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R,\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0;8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b/\u0010<\u0012\u0004\b?\u00102\u001a\u0004\b=\u0010>R$\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bA\u0010B\u0012\u0004\bC\u00102R$\u0010F\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bD\u0010B\u0012\u0004\bE\u00102R(\u0010N\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\bG\u0010H\u0012\u0004\bM\u00102\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001a\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\f\u0010P\u0012\u0004\bQ\u00102RD\u0010Z\u001a2\u0012\u0013\u0012\u00110\"¢\u0006\f\bT\u0012\b\bU\u0012\u0004\b\b(V\u0012\u0013\u0012\u00110#¢\u0006\f\bT\u0012\b\bU\u0012\u0004\b\b(W\u0012\u0004\u0012\u00020\b0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR2\u0010_\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\b0\u001d0[8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010\\\u001a\u0004\b]\u0010^R\u001a\u0010d\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\f\n\u0004\ba\u0010b\u0012\u0004\bc\u00102R\u0014\u0010e\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010JR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038VX\u0096\u0004¢\u0006\f\u0012\u0004\bg\u00102\u001a\u0004\bD\u0010f¨\u0006p"}, d2 = {"Landroidx/paging/AsyncPagedListDiffer;", "", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/PagedList;", "previousList", "currentList", "Ljava/lang/Runnable;", "commitCallback", "Lkotlin/b2;", "v", "", UCropPlusActivity.ARG_INDEX, RXScreenCaptureService.KEY_HEIGHT, "(I)Ljava/lang/Object;", "pagedList", "C", "D", "newList", "diffSnapshot", "Landroidx/paging/a0;", "diffResult", "Landroidx/paging/v0;", "recordingCallback", "lastAccessIndex", ak.aG, "(Landroidx/paging/PagedList;Landroidx/paging/PagedList;Landroidx/paging/a0;Landroidx/paging/v0;ILjava/lang/Runnable;)V", "Landroidx/paging/AsyncPagedListDiffer$b;", com.google.android.gms.common.internal.s.a.f52543a, "b", "Lkotlin/Function2;", "callback", ak.aF, "x", "y", "Landroidx/paging/LoadType;", "Landroidx/paging/v;", ak.av, RXScreenCaptureService.KEY_WIDTH, "Landroidx/recyclerview/widget/ListUpdateCallback;", "Landroidx/recyclerview/widget/ListUpdateCallback;", "t", "()Landroidx/recyclerview/widget/ListUpdateCallback;", "B", "(Landroidx/recyclerview/widget/ListUpdateCallback;)V", "updateCallback", "Landroidx/recyclerview/widget/AsyncDifferConfig;", "Landroidx/recyclerview/widget/AsyncDifferConfig;", "d", "()Landroidx/recyclerview/widget/AsyncDifferConfig;", "getConfig$paging_runtime_release$annotations", "()V", "config", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "n", "()Ljava/util/concurrent/Executor;", ak.aD, "(Ljava/util/concurrent/Executor;)V", "mainThreadExecutor", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "j", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getListeners$paging_runtime_release$annotations", "listeners", "e", "Landroidx/paging/PagedList;", "getPagedList$annotations", "f", "getSnapshot$annotations", "snapshot", "g", "I", "o", "()I", androidx.exifinterface.media.a.W4, "(I)V", "getMaxScheduledGeneration$paging_runtime_release$annotations", "maxScheduledGeneration", "Landroidx/paging/PagedList$e;", "Landroidx/paging/PagedList$e;", "getLoadStateManager$annotations", "loadStateManager", "Lkotlin/reflect/KFunction2;", "Lkotlin/m0;", "name", "type", "state", "i", "Lkotlin/reflect/i;", "loadStateListener", "", "Ljava/util/List;", "l", "()Ljava/util/List;", "loadStateListeners", "Landroidx/paging/PagedList$c;", "k", "Landroidx/paging/PagedList$c;", "getPagedListCallback$annotations", "pagedListCallback", "itemCount", "()Landroidx/paging/PagedList;", "getCurrentList$annotations", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "adapter", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "diffCallback", "<init>", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "listUpdateCallback", "(Landroidx/recyclerview/widget/ListUpdateCallback;Landroidx/recyclerview/widget/AsyncDifferConfig;)V", "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
public class AsyncPagedListDiffer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public ListUpdateCallback updateCallback;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AsyncDifferConfig<T> config;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private Executor mainThreadExecutor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final CopyOnWriteArrayList<b<T>> listeners;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private PagedList<T> pagedList;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private PagedList<T> snapshot;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int maxScheduledGeneration;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final PagedList.e loadStateManager;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final kotlin.reflect.i<b2> loadStateListener;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<yh.p<LoadType, v, b2>> loadStateListeners;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final PagedList.c pagedListCallback;

    /* JADX INFO: compiled from: AsyncPagedListDiffer.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B1\u0012(\u0010\n\u001a$\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\b\u001a\u00020\u00072\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016R9\u0010\n\u001a$\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/paging/AsyncPagedListDiffer$a;", "", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/AsyncPagedListDiffer$b;", "Landroidx/paging/PagedList;", "previousList", "currentList", "Lkotlin/b2;", ak.av, "Lkotlin/Function2;", "callback", "Lyh/p;", "b", "()Lyh/p;", "<init>", "(Lyh/p;)V", "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
    public static final class a<T> implements b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final yh.p<PagedList<T>, PagedList<T>, b2> f25361a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@dl.d yh.p<? super PagedList<T>, ? super PagedList<T>, b2> callback) {
            kotlin.jvm.internal.f0.p(callback, "callback");
            this.f25361a = callback;
        }

        @Override // androidx.paging.AsyncPagedListDiffer.b
        public void a(@dl.e PagedList<T> pagedList, @dl.e PagedList<T> pagedList2) {
            this.f25361a.invoke(pagedList, pagedList2);
        }

        @dl.d
        public final yh.p<PagedList<T>, PagedList<T>, b2> b() {
            return this.f25361a;
        }
    }

    /* JADX INFO: compiled from: AsyncPagedListDiffer.kt */
    @kotlin.k(message = "PagedList is deprecated and has been replaced by PagingData")
    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0001J(\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00032\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003H&¨\u0006\b"}, d2 = {"Landroidx/paging/AsyncPagedListDiffer$b;", "", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/PagedList;", "previousList", "currentList", "Lkotlin/b2;", ak.av, "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
    public interface b<T> {
        void a(@dl.e PagedList<T> pagedList, @dl.e PagedList<T> pagedList2);
    }

    /* JADX INFO: compiled from: AsyncPagedListDiffer.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"androidx/paging/AsyncPagedListDiffer$c", "Landroidx/paging/PagedList$e;", "Landroidx/paging/LoadType;", "type", "Landroidx/paging/v;", "state", "Lkotlin/b2;", "e", "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
    public static final class c extends PagedList.e {
        c() {
        }

        @Override // androidx.paging.PagedList.e
        public void e(@dl.d LoadType type, @dl.d v state) {
            kotlin.jvm.internal.f0.p(type, "type");
            kotlin.jvm.internal.f0.p(state, "state");
            Iterator<T> it = AsyncPagedListDiffer.this.l().iterator();
            while (it.hasNext()) {
                ((yh.p) it.next()).invoke(type, state);
            }
        }
    }

    /* JADX INFO: compiled from: AsyncPagedListDiffer.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"androidx/paging/AsyncPagedListDiffer$d", "Landroidx/paging/PagedList$c;", "", CommonNetImpl.POSITION, "count", "Lkotlin/b2;", "b", ak.aF, ak.av, "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
    public static final class d extends PagedList.c {
        d() {
        }

        @Override // androidx.paging.PagedList.c
        public void a(int i10, int i11) {
            AsyncPagedListDiffer.this.t().onChanged(i10, i11, null);
        }

        @Override // androidx.paging.PagedList.c
        public void b(int i10, int i11) {
            AsyncPagedListDiffer.this.t().onInserted(i10, i11);
        }

        @Override // androidx.paging.PagedList.c
        public void c(int i10, int i11) {
            AsyncPagedListDiffer.this.t().onRemoved(i10, i11);
        }
    }

    /* JADX INFO: compiled from: AsyncPagedListDiffer.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "Lkotlin/b2;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    public static final class e implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PagedList f25365c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ PagedList f25366d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f25367e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ PagedList f25368f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ v0 f25369g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Runnable f25370h;

        /* JADX INFO: compiled from: AsyncPagedListDiffer.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "Lkotlin/b2;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
        public static final class a implements Runnable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ a0 f25372c;

            a(a0 a0Var) {
                this.f25372c = a0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int maxScheduledGeneration = AsyncPagedListDiffer.this.getMaxScheduledGeneration();
                e eVar = e.this;
                if (maxScheduledGeneration == eVar.f25367e) {
                    AsyncPagedListDiffer.this.u(eVar.f25368f, eVar.f25366d, this.f25372c, eVar.f25369g, eVar.f25365c.S(), e.this.f25370h);
                }
            }
        }

        e(PagedList pagedList, PagedList pagedList2, int i10, PagedList pagedList3, v0 v0Var, Runnable runnable) {
            this.f25365c = pagedList;
            this.f25366d = pagedList2;
            this.f25367e = i10;
            this.f25368f = pagedList3;
            this.f25369g = v0Var;
            this.f25370h = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b0<T> b0VarF = this.f25365c.F();
            b0<T> b0VarF2 = this.f25366d.F();
            DiffUtil.ItemCallback<T> diffCallback = AsyncPagedListDiffer.this.d().getDiffCallback();
            kotlin.jvm.internal.f0.o(diffCallback, "config.diffCallback");
            AsyncPagedListDiffer.this.getMainThreadExecutor().execute(new a(c0.a(b0VarF, b0VarF2, diffCallback)));
        }
    }

    @kotlin.k(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @kotlin.s0(expression = "AsyncPagingDataDiffer(\n                Dispatchers.Main,\n                Dispatchers.IO,\n                config.diffCallback,\n                listUpdateCallback\n            )", imports = {"androidx.paging.AsyncPagingDataDiffer", "kotlinx.coroutines.Dispatchers"}))
    public AsyncPagedListDiffer(@dl.d ListUpdateCallback listUpdateCallback, @dl.d AsyncDifferConfig<T> config) {
        kotlin.jvm.internal.f0.p(listUpdateCallback, "listUpdateCallback");
        kotlin.jvm.internal.f0.p(config, "config");
        Executor executorI = androidx.arch.core.executor.c.i();
        kotlin.jvm.internal.f0.o(executorI, "ArchTaskExecutor.getMainThreadExecutor()");
        this.mainThreadExecutor = executorI;
        this.listeners = new CopyOnWriteArrayList<>();
        c cVar = new c();
        this.loadStateManager = cVar;
        this.loadStateListener = new AsyncPagedListDiffer$loadStateListener$1(cVar);
        this.loadStateListeners = new CopyOnWriteArrayList();
        this.pagedListCallback = new d();
        this.updateCallback = listUpdateCallback;
        this.config = config;
    }

    @kotlin.k(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @kotlin.s0(expression = "AsyncPagingDataDiffer(\n                Dispatchers.Main,\n                Dispatchers.IO,\n                diffCallback,\n                listUpdateCallback\n            )", imports = {"androidx.paging.AsyncPagingDataDiffer", "kotlinx.coroutines.Dispatchers"}))
    public AsyncPagedListDiffer(@dl.d RecyclerView.Adapter<?> adapter, @dl.d DiffUtil.ItemCallback<T> diffCallback) {
        kotlin.jvm.internal.f0.p(adapter, "adapter");
        kotlin.jvm.internal.f0.p(diffCallback, "diffCallback");
        Executor executorI = androidx.arch.core.executor.c.i();
        kotlin.jvm.internal.f0.o(executorI, "ArchTaskExecutor.getMainThreadExecutor()");
        this.mainThreadExecutor = executorI;
        this.listeners = new CopyOnWriteArrayList<>();
        c cVar = new c();
        this.loadStateManager = cVar;
        this.loadStateListener = new AsyncPagedListDiffer$loadStateListener$1(cVar);
        this.loadStateListeners = new CopyOnWriteArrayList();
        this.pagedListCallback = new d();
        this.updateCallback = new AdapterListUpdateCallback(adapter);
        AsyncDifferConfig<T> asyncDifferConfigBuild = new AsyncDifferConfig.Builder(diffCallback).build();
        kotlin.jvm.internal.f0.o(asyncDifferConfigBuild, "AsyncDifferConfig.Builder(diffCallback).build()");
        this.config = asyncDifferConfigBuild;
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void g() {
    }

    @androidx.annotation.j1
    public static /* synthetic */ void k() {
    }

    private static /* synthetic */ void m() {
    }

    public static /* synthetic */ void p() {
    }

    private static /* synthetic */ void q() {
    }

    private static /* synthetic */ void r() {
    }

    private static /* synthetic */ void s() {
    }

    private final void v(PagedList<T> pagedList, PagedList<T> pagedList2, Runnable runnable) {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(pagedList, pagedList2);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void A(int i10) {
        this.maxScheduledGeneration = i10;
    }

    public final void B(@dl.d ListUpdateCallback listUpdateCallback) {
        kotlin.jvm.internal.f0.p(listUpdateCallback, "<set-?>");
        this.updateCallback = listUpdateCallback;
    }

    public void C(@dl.e PagedList<T> pagedList) {
        D(pagedList, null);
    }

    public void D(@dl.e PagedList<T> pagedList, @dl.e Runnable runnable) {
        int i10 = this.maxScheduledGeneration + 1;
        this.maxScheduledGeneration = i10;
        if (pagedList == this.pagedList) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        PagedList<T> pagedListF = f();
        if (pagedList == null) {
            int i11 = i();
            PagedList<T> pagedList2 = this.pagedList;
            if (pagedList2 != null) {
                pagedList2.Z(this.pagedListCallback);
                pagedList2.a0((yh.p) this.loadStateListener);
                this.pagedList = null;
            } else if (this.snapshot != null) {
                this.snapshot = null;
            }
            ListUpdateCallback listUpdateCallback = this.updateCallback;
            if (listUpdateCallback == null) {
                kotlin.jvm.internal.f0.S("updateCallback");
            }
            listUpdateCallback.onRemoved(0, i11);
            v(pagedListF, null, runnable);
            return;
        }
        if (f() == null) {
            this.pagedList = pagedList;
            pagedList.q((yh.p) this.loadStateListener);
            pagedList.m(this.pagedListCallback);
            ListUpdateCallback listUpdateCallback2 = this.updateCallback;
            if (listUpdateCallback2 == null) {
                kotlin.jvm.internal.f0.S("updateCallback");
            }
            listUpdateCallback2.onInserted(0, pagedList.size());
            v(null, pagedList, runnable);
            return;
        }
        PagedList<T> pagedList3 = this.pagedList;
        if (pagedList3 != null) {
            pagedList3.Z(this.pagedListCallback);
            pagedList3.a0((yh.p) this.loadStateListener);
            List<T> listK0 = pagedList3.k0();
            if (listK0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.paging.PagedList<T>");
            }
            this.snapshot = (PagedList) listK0;
            this.pagedList = null;
        }
        PagedList<T> pagedList4 = this.snapshot;
        if (pagedList4 == null || this.pagedList != null) {
            throw new IllegalStateException("must be in snapshot state to diff");
        }
        List<T> listK1 = pagedList.k0();
        if (listK1 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.paging.PagedList<T>");
        }
        v0 v0Var = new v0();
        pagedList.m(v0Var);
        this.config.getBackgroundThreadExecutor().execute(new e(pagedList4, (PagedList) listK1, i10, pagedList, v0Var, runnable));
    }

    public void a(@dl.d yh.p<? super LoadType, ? super v, b2> listener) {
        kotlin.jvm.internal.f0.p(listener, "listener");
        PagedList<T> pagedList = this.pagedList;
        if (pagedList != null) {
            pagedList.q(listener);
        } else {
            this.loadStateManager.a(listener);
        }
        this.loadStateListeners.add(listener);
    }

    public void b(@dl.d b<T> listener) {
        kotlin.jvm.internal.f0.p(listener, "listener");
        this.listeners.add(listener);
    }

    public final void c(@dl.d yh.p<? super PagedList<T>, ? super PagedList<T>, b2> callback) {
        kotlin.jvm.internal.f0.p(callback, "callback");
        this.listeners.add(new a(callback));
    }

    @dl.d
    public final AsyncDifferConfig<T> d() {
        return this.config;
    }

    @dl.e
    public PagedList<T> f() {
        PagedList<T> pagedList = this.snapshot;
        return pagedList != null ? pagedList : this.pagedList;
    }

    @dl.e
    public T h(int index) {
        PagedList<T> pagedList = this.snapshot;
        PagedList<T> pagedList2 = this.pagedList;
        if (pagedList != null) {
            return pagedList.get(index);
        }
        if (pagedList2 == null) {
            throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
        }
        pagedList2.T(index);
        return pagedList2.get(index);
    }

    public int i() {
        PagedList<T> pagedListF = f();
        if (pagedListF != null) {
            return pagedListF.size();
        }
        return 0;
    }

    @dl.d
    public final CopyOnWriteArrayList<b<T>> j() {
        return this.listeners;
    }

    @dl.d
    public final List<yh.p<LoadType, v, b2>> l() {
        return this.loadStateListeners;
    }

    @dl.d
    /* JADX INFO: renamed from: n, reason: from getter */
    public final Executor getMainThreadExecutor() {
        return this.mainThreadExecutor;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getMaxScheduledGeneration() {
        return this.maxScheduledGeneration;
    }

    @dl.d
    public final ListUpdateCallback t() {
        ListUpdateCallback listUpdateCallback = this.updateCallback;
        if (listUpdateCallback == null) {
            kotlin.jvm.internal.f0.S("updateCallback");
        }
        return listUpdateCallback;
    }

    public final void u(@dl.d PagedList<T> newList, @dl.d PagedList<T> diffSnapshot, @dl.d a0 diffResult, @dl.d v0 recordingCallback, int lastAccessIndex, @dl.e Runnable commitCallback) {
        kotlin.jvm.internal.f0.p(newList, "newList");
        kotlin.jvm.internal.f0.p(diffSnapshot, "diffSnapshot");
        kotlin.jvm.internal.f0.p(diffResult, "diffResult");
        kotlin.jvm.internal.f0.p(recordingCallback, "recordingCallback");
        PagedList<T> pagedList = this.snapshot;
        if (pagedList == null || this.pagedList != null) {
            throw new IllegalStateException("must be in snapshot state to apply diff");
        }
        this.pagedList = newList;
        newList.q((yh.p) this.loadStateListener);
        this.snapshot = null;
        b0<T> b0VarF = pagedList.F();
        ListUpdateCallback listUpdateCallback = this.updateCallback;
        if (listUpdateCallback == null) {
            kotlin.jvm.internal.f0.S("updateCallback");
        }
        c0.b(b0VarF, listUpdateCallback, diffSnapshot.F(), diffResult);
        recordingCallback.d(this.pagedListCallback);
        newList.m(this.pagedListCallback);
        if (!newList.isEmpty()) {
            newList.T(fi.u.I(c0.c(pagedList.F(), diffResult, diffSnapshot.F(), lastAccessIndex), 0, newList.size() - 1));
        }
        v(pagedList, this.pagedList, commitCallback);
    }

    public void w(@dl.d yh.p<? super LoadType, ? super v, b2> listener) {
        kotlin.jvm.internal.f0.p(listener, "listener");
        this.loadStateListeners.remove(listener);
        PagedList<T> pagedList = this.pagedList;
        if (pagedList != null) {
            pagedList.a0(listener);
        }
    }

    public void x(@dl.d b<T> listener) {
        kotlin.jvm.internal.f0.p(listener, "listener");
        this.listeners.remove(listener);
    }

    public final void y(@dl.d final yh.p<? super PagedList<T>, ? super PagedList<T>, b2> callback) {
        kotlin.jvm.internal.f0.p(callback, "callback");
        kotlin.collections.x.I0(this.listeners, new yh.l<b<T>, Boolean>() { // from class: androidx.paging.AsyncPagedListDiffer$removePagedListListener$1
            {
                super(1);
            }

            public final boolean a(AsyncPagedListDiffer.b<T> bVar) {
                return (bVar instanceof AsyncPagedListDiffer.a) && ((AsyncPagedListDiffer.a) bVar).b() == callback;
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                return Boolean.valueOf(a((AsyncPagedListDiffer.b) obj));
            }
        });
    }

    public final void z(@dl.d Executor executor) {
        kotlin.jvm.internal.f0.p(executor, "<set-?>");
        this.mainThreadExecutor = executor;
    }
}
