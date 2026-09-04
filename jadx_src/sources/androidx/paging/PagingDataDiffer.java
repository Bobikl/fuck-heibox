package androidx.paging;

import androidx.annotation.RestrictTo;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.tencent.open.SocialConstants;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.b2;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: compiled from: PagingDataDiffer.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0099\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001<\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0019\u0012\u0006\u0010G\u001a\u00020D\u0012\b\b\u0002\u0010K\u001a\u00020H¢\u0006\u0004\bS\u0010TJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002JO\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\rH¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0012\u001a\u00020\u0011H\u0016J!\u0010\u0015\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0018\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010\u0017\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u0019J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bJ\u0006\u0010\u001d\u001a\u00020\u0005J\u0006\u0010\u001e\u001a\u00020\u0005J\u001a\u0010!\u001a\u00020\u00052\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u001fJ\u001a\u0010\"\u001a\u00020\u00052\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u001fR\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R&\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u001f0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00109\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00030@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0011\u0010N\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0017\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00030O8F¢\u0006\u0006\u001a\u0004\bP\u0010Q\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006U"}, d2 = {"Landroidx/paging/PagingDataDiffer;", "", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/d;", "states", "Lkotlin/b2;", "r", "Landroidx/paging/b0;", "previousList", "newList", "newCombinedLoadStates", "", "lastAccessedIndex", "Lkotlin/Function0;", "onListPresentable", "x", "(Landroidx/paging/b0;Landroidx/paging/b0;Landroidx/paging/d;ILyh/a;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", RXScreenCaptureService.KEY_WIDTH, "Landroidx/paging/o0;", "pagingData", "q", "(Landroidx/paging/o0;Lkotlin/coroutines/c;)Ljava/lang/Object;", UCropPlusActivity.ARG_INDEX, ak.aB, "(I)Ljava/lang/Object;", "v", "Landroidx/paging/p;", "B", androidx.exifinterface.media.a.W4, "y", "Lkotlin/Function1;", com.google.android.gms.common.internal.s.a.f52543a, "p", ak.aD, "Landroidx/paging/PagePresenter;", ak.av, "Landroidx/paging/PagePresenter;", "presenter", "Landroidx/paging/e1;", "b", "Landroidx/paging/e1;", SocialConstants.PARAM_RECEIVER, "Landroidx/paging/z;", ak.aF, "Landroidx/paging/z;", "combinedLoadStates", "Ljava/util/concurrent/CopyOnWriteArrayList;", "d", "Ljava/util/concurrent/CopyOnWriteArrayList;", "loadStateListeners", "Landroidx/paging/SingleRunner;", "e", "Landroidx/paging/SingleRunner;", "collectFromRunner", "f", "Z", "lastAccessedIndexUnfulfilled", "g", "I", "androidx/paging/PagingDataDiffer$a", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/paging/PagingDataDiffer$a;", "processPageEventCallback", "Lkotlinx/coroutines/flow/j;", "i", "Lkotlinx/coroutines/flow/j;", "_combinedLoadState", "Landroidx/paging/e;", "j", "Landroidx/paging/e;", "differCallback", "Lkotlinx/coroutines/CoroutineDispatcher;", "k", "Lkotlinx/coroutines/CoroutineDispatcher;", "mainDispatcher", ak.aG, "()I", UiKitSpanObj.TYPE_SIZE, "Lkotlinx/coroutines/flow/e;", "t", "()Lkotlinx/coroutines/flow/e;", "loadStateFlow", "<init>", "(Landroidx/paging/e;Lkotlinx/coroutines/CoroutineDispatcher;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class PagingDataDiffer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private PagePresenter<T> presenter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private e1 receiver;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final z combinedLoadStates;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<yh.l<CombinedLoadStates, b2>> loadStateListeners;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final SingleRunner collectFromRunner;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private volatile boolean lastAccessedIndexUnfulfilled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private volatile int lastAccessedIndex;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final a processPageEventCallback;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final kotlinx.coroutines.flow.j<CombinedLoadStates> _combinedLoadState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final e differCallback;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final CoroutineDispatcher mainDispatcher;

    /* JADX INFO: compiled from: PagingDataDiffer.kt */
    @Metadata(bv = {}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J \u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¨\u0006\u0010"}, d2 = {"androidx/paging/PagingDataDiffer$a", "Landroidx/paging/PagePresenter$b;", "", CommonNetImpl.POSITION, "count", "Lkotlin/b2;", ak.av, "onInserted", "onRemoved", "Landroidx/paging/LoadType;", "loadType", "", "fromMediator", "Landroidx/paging/v;", "loadState", "b", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class a implements PagePresenter.b {
        a() {
        }

        @Override // androidx.paging.PagePresenter.b
        public void a(int i10, int i11) {
            PagingDataDiffer.this.differCallback.a(i10, i11);
        }

        @Override // androidx.paging.PagePresenter.b
        public void b(@dl.d LoadType loadType, boolean z10, @dl.d v loadState) {
            kotlin.jvm.internal.f0.p(loadType, "loadType");
            kotlin.jvm.internal.f0.p(loadState, "loadState");
            if (kotlin.jvm.internal.f0.g(PagingDataDiffer.this.combinedLoadStates.g(loadType, z10), loadState)) {
                return;
            }
            PagingDataDiffer.this.combinedLoadStates.j(loadType, z10, loadState);
            CombinedLoadStates combinedLoadStatesK = PagingDataDiffer.this.combinedLoadStates.k();
            Iterator<T> it = PagingDataDiffer.this.loadStateListeners.iterator();
            while (it.hasNext()) {
                ((yh.l) it.next()).invoke(combinedLoadStatesK);
            }
        }

        @Override // androidx.paging.PagePresenter.b
        public void onInserted(int i10, int i11) {
            PagingDataDiffer.this.differCallback.onInserted(i10, i11);
        }

        @Override // androidx.paging.PagePresenter.b
        public void onRemoved(int i10, int i11) {
            PagingDataDiffer.this.differCallback.onRemoved(i10, i11);
        }
    }

    public PagingDataDiffer(@dl.d e differCallback, @dl.d CoroutineDispatcher mainDispatcher) {
        kotlin.jvm.internal.f0.p(differCallback, "differCallback");
        kotlin.jvm.internal.f0.p(mainDispatcher, "mainDispatcher");
        this.differCallback = differCallback;
        this.mainDispatcher = mainDispatcher;
        this.presenter = PagePresenter.INSTANCE.a();
        z zVar = new z();
        this.combinedLoadStates = zVar;
        this.loadStateListeners = new CopyOnWriteArrayList<>();
        this.collectFromRunner = new SingleRunner(false, 1, null);
        this.processPageEventCallback = new a();
        this._combinedLoadState = kotlinx.coroutines.flow.v.a(zVar.k());
        p(new yh.l<CombinedLoadStates, b2>() { // from class: androidx.paging.PagingDataDiffer.1
            {
                super(1);
            }

            public final void a(@dl.d CombinedLoadStates it) {
                kotlin.jvm.internal.f0.p(it, "it");
                PagingDataDiffer.this._combinedLoadState.setValue(it);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(CombinedLoadStates combinedLoadStates) {
                a(combinedLoadStates);
                return b2.f124493a;
            }
        });
    }

    public /* synthetic */ PagingDataDiffer(e eVar, CoroutineDispatcher coroutineDispatcher, int i10, kotlin.jvm.internal.u uVar) {
        this(eVar, (i10 & 2) != 0 ? kotlinx.coroutines.e1.e() : coroutineDispatcher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(CombinedLoadStates combinedLoadStates) {
        if (kotlin.jvm.internal.f0.g(this.combinedLoadStates.k(), combinedLoadStates)) {
            return;
        }
        this.combinedLoadStates.h(combinedLoadStates);
        Iterator<T> it = this.loadStateListeners.iterator();
        while (it.hasNext()) {
            ((yh.l) it.next()).invoke(combinedLoadStates);
        }
    }

    public final void A() {
        e1 e1Var = this.receiver;
        if (e1Var != null) {
            e1Var.H();
        }
    }

    @dl.d
    public final p<T> B() {
        return this.presenter.r();
    }

    public final void p(@dl.d yh.l<? super CombinedLoadStates, b2> listener) {
        kotlin.jvm.internal.f0.p(listener, "listener");
        this.loadStateListeners.add(listener);
        listener.invoke(this.combinedLoadStates.k());
    }

    @dl.e
    public final Object q(@dl.d o0<T> o0Var, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objC = SingleRunner.c(this.collectFromRunner, 0, new PagingDataDiffer$collectFrom$2(this, o0Var, null), cVar, 1, null);
        return objC == kotlin.coroutines.intrinsics.b.h() ? objC : b2.f124493a;
    }

    @dl.e
    public final T s(@androidx.annotation.f0(from = 0) int index) {
        this.lastAccessedIndexUnfulfilled = true;
        this.lastAccessedIndex = index;
        e1 e1Var = this.receiver;
        if (e1Var != null) {
            e1Var.I(this.presenter.d(index));
        }
        return this.presenter.l(index);
    }

    @dl.d
    public final kotlinx.coroutines.flow.e<CombinedLoadStates> t() {
        return this._combinedLoadState;
    }

    public final int u() {
        return this.presenter.a();
    }

    @dl.e
    public final T v(@androidx.annotation.f0(from = 0) int index) {
        return this.presenter.l(index);
    }

    public boolean w() {
        return false;
    }

    @dl.e
    public abstract Object x(@dl.d b0<T> b0Var, @dl.d b0<T> b0Var2, @dl.d CombinedLoadStates combinedLoadStates, int i10, @dl.d yh.a<b2> aVar, @dl.d kotlin.coroutines.c<? super Integer> cVar);

    public final void y() {
        e1 e1Var = this.receiver;
        if (e1Var != null) {
            e1Var.refresh();
        }
    }

    public final void z(@dl.d yh.l<? super CombinedLoadStates, b2> listener) {
        kotlin.jvm.internal.f0.p(listener, "listener");
        this.loadStateListeners.remove(listener);
    }
}
