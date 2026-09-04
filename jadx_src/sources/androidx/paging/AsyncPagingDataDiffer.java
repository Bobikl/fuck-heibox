package androidx.paging;

import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.b2;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: compiled from: AsyncPagingDataDiffer.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000y\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001*\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B3\b\u0007\u0012\f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u000008\u0012\u0006\u0010=\u001a\u00020;\u0012\b\b\u0002\u0010A\u001a\u00020>\u0012\b\b\u0002\u0010B\u001a\u00020>¢\u0006\u0004\bF\u0010GJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003J\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0005J\u0019\u0010\u000f\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0010J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012J\u001a\u0010\u0017\u001a\u00020\u00052\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\u0014J\u001a\u0010\u0018\u001a\u00020\u00052\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\u0014R \u0010 \u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR(\u0010)\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\b\"\u0010#\u0012\u0004\b(\u0010\u001f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020\u0015028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00028\u0000088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00109R\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010@R\u0011\u0010E\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bC\u0010D\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006H"}, d2 = {"Landroidx/paging/AsyncPagingDataDiffer;", "", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/o0;", "pagingData", "Lkotlin/b2;", "t", "(Landroidx/paging/o0;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", ak.aG, "q", "o", "", UCropPlusActivity.ARG_INDEX, "k", "(I)Ljava/lang/Object;", "n", "Landroidx/paging/p;", ak.aB, "Lkotlin/Function1;", "Landroidx/paging/d;", com.google.android.gms.common.internal.s.a.f52543a, "f", "p", "Landroidx/paging/e;", ak.av, "Landroidx/paging/e;", "g", "()Landroidx/paging/e;", "getDifferCallback$paging_runtime_release$annotations", "()V", "differCallback", "", "b", "Z", "i", "()Z", "r", "(Z)V", "getInGetItem$paging_runtime_release$annotations", "inGetItem", "androidx/paging/AsyncPagingDataDiffer$differBase$1", ak.aF, "Landroidx/paging/AsyncPagingDataDiffer$differBase$1;", "differBase", "Ljava/util/concurrent/atomic/AtomicInteger;", "d", "Ljava/util/concurrent/atomic/AtomicInteger;", "submitDataId", "Lkotlinx/coroutines/flow/e;", "e", "Lkotlinx/coroutines/flow/e;", "m", "()Lkotlinx/coroutines/flow/e;", "loadStateFlow", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "diffCallback", "Landroidx/recyclerview/widget/ListUpdateCallback;", "Landroidx/recyclerview/widget/ListUpdateCallback;", "updateCallback", "Lkotlinx/coroutines/CoroutineDispatcher;", RXScreenCaptureService.KEY_HEIGHT, "Lkotlinx/coroutines/CoroutineDispatcher;", "mainDispatcher", "workerDispatcher", "l", "()I", "itemCount", "<init>", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Landroidx/recyclerview/widget/ListUpdateCallback;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
public final class AsyncPagingDataDiffer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final e differCallback;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean inGetItem;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AsyncPagingDataDiffer$differBase$1 differBase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AtomicInteger submitDataId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlinx.coroutines.flow.e<CombinedLoadStates> loadStateFlow;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final DiffUtil.ItemCallback<T> diffCallback;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ListUpdateCallback updateCallback;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final CoroutineDispatcher mainDispatcher;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final CoroutineDispatcher workerDispatcher;

    /* JADX INFO: compiled from: AsyncPagingDataDiffer.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"androidx/paging/AsyncPagingDataDiffer$a", "Landroidx/paging/e;", "", CommonNetImpl.POSITION, "count", "Lkotlin/b2;", "onInserted", "onRemoved", ak.av, "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
    public static final class a implements e {
        a() {
        }

        @Override // androidx.paging.e
        public void a(int i10, int i11) {
            if (i11 > 0) {
                AsyncPagingDataDiffer.this.updateCallback.onChanged(i10, i11, null);
            }
        }

        @Override // androidx.paging.e
        public void onInserted(int i10, int i11) {
            if (i11 > 0) {
                AsyncPagingDataDiffer.this.updateCallback.onInserted(i10, i11);
            }
        }

        @Override // androidx.paging.e
        public void onRemoved(int i10, int i11) {
            if (i11 > 0) {
                AsyncPagingDataDiffer.this.updateCallback.onRemoved(i10, i11);
            }
        }
    }

    @xh.i
    public AsyncPagingDataDiffer(@dl.d DiffUtil.ItemCallback<T> itemCallback, @dl.d ListUpdateCallback listUpdateCallback) {
        this(itemCallback, listUpdateCallback, null, null, 12, null);
    }

    @xh.i
    public AsyncPagingDataDiffer(@dl.d DiffUtil.ItemCallback<T> itemCallback, @dl.d ListUpdateCallback listUpdateCallback, @dl.d CoroutineDispatcher coroutineDispatcher) {
        this(itemCallback, listUpdateCallback, coroutineDispatcher, null, 8, null);
    }

    @xh.i
    public AsyncPagingDataDiffer(@dl.d DiffUtil.ItemCallback<T> diffCallback, @dl.d ListUpdateCallback updateCallback, @dl.d CoroutineDispatcher mainDispatcher, @dl.d CoroutineDispatcher workerDispatcher) {
        kotlin.jvm.internal.f0.p(diffCallback, "diffCallback");
        kotlin.jvm.internal.f0.p(updateCallback, "updateCallback");
        kotlin.jvm.internal.f0.p(mainDispatcher, "mainDispatcher");
        kotlin.jvm.internal.f0.p(workerDispatcher, "workerDispatcher");
        this.diffCallback = diffCallback;
        this.updateCallback = updateCallback;
        this.mainDispatcher = mainDispatcher;
        this.workerDispatcher = workerDispatcher;
        a aVar = new a();
        this.differCallback = aVar;
        AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1 = new AsyncPagingDataDiffer$differBase$1(this, aVar, mainDispatcher);
        this.differBase = asyncPagingDataDiffer$differBase$1;
        this.submitDataId = new AtomicInteger(0);
        this.loadStateFlow = asyncPagingDataDiffer$differBase$1.t();
    }

    public /* synthetic */ AsyncPagingDataDiffer(DiffUtil.ItemCallback itemCallback, ListUpdateCallback listUpdateCallback, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, int i10, kotlin.jvm.internal.u uVar) {
        this(itemCallback, listUpdateCallback, (i10 & 4) != 0 ? kotlinx.coroutines.e1.e() : coroutineDispatcher, (i10 & 8) != 0 ? kotlinx.coroutines.e1.a() : coroutineDispatcher2);
    }

    public static /* synthetic */ void h() {
    }

    public static /* synthetic */ void j() {
    }

    public final void f(@dl.d yh.l<? super CombinedLoadStates, b2> listener) {
        kotlin.jvm.internal.f0.p(listener, "listener");
        this.differBase.p(listener);
    }

    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final e getDifferCallback() {
        return this.differCallback;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getInGetItem() {
        return this.inGetItem;
    }

    @dl.e
    public final T k(@androidx.annotation.f0(from = 0) int index) {
        try {
            this.inGetItem = true;
            return this.differBase.s(index);
        } finally {
            this.inGetItem = false;
        }
    }

    public final int l() {
        return this.differBase.u();
    }

    @dl.d
    public final kotlinx.coroutines.flow.e<CombinedLoadStates> m() {
        return this.loadStateFlow;
    }

    @dl.e
    public final T n(@androidx.annotation.f0(from = 0) int index) {
        return this.differBase.v(index);
    }

    public final void o() {
        this.differBase.y();
    }

    public final void p(@dl.d yh.l<? super CombinedLoadStates, b2> listener) {
        kotlin.jvm.internal.f0.p(listener, "listener");
        this.differBase.z(listener);
    }

    public final void q() {
        this.differBase.A();
    }

    public final void r(boolean z10) {
        this.inGetItem = z10;
    }

    @dl.d
    public final p<T> s() {
        return this.differBase.B();
    }

    @dl.e
    public final Object t(@dl.d o0<T> o0Var, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        this.submitDataId.incrementAndGet();
        Object objQ = this.differBase.q(o0Var, cVar);
        return objQ == kotlin.coroutines.intrinsics.b.h() ? objQ : b2.f124493a;
    }

    public final void u(@dl.d Lifecycle lifecycle, @dl.d o0<T> pagingData) {
        kotlin.jvm.internal.f0.p(lifecycle, "lifecycle");
        kotlin.jvm.internal.f0.p(pagingData, "pagingData");
        kotlinx.coroutines.k.f(androidx.lifecycle.w.a(lifecycle), null, null, new AsyncPagingDataDiffer$submitData$2(this, this.submitDataId.incrementAndGet(), pagingData, null), 3, null);
    }
}
