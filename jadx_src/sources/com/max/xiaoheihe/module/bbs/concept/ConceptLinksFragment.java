package com.max.xiaoheihe.module.bbs.concept;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.adapter.OneTimeValidExposureWatcher;
import com.max.hbcommon.base.adapter.u;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.news.ConceptFeedsResult;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.module.bbs.adapter.z;
import com.max.xiaoheihe.module.bbs.i;
import com.max.xiaoheihe.module.bbs.s0;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;
import ng.j;

/* JADX INFO: loaded from: classes10.dex */
public class ConceptLinksFragment extends com.max.hbcommon.base.d implements com.max.xiaoheihe.module.news.adapter.a.b, com.max.xiaoheihe.view.callback.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f81087o = "topic";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f81088p = "idx";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f81089q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f81090r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f81091s = "concept_link_cache_key";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u<FeedsContentBaseObj> f81092b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f81096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f81097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f81098h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f81099i;

    @BindView(R.id.iv_write_post)
    View iv_write_post;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f81100j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f81101k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.max.xiaoheihe.utils.u f81103m;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private i<u<FeedsContentBaseObj>> f81104n;

    @BindView(R.id.v_gradient)
    View v_gradient;

    @BindView(R.id.v_scroll_container_divier)
    View v_scroll_container_divier;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<FeedsContentBaseObj> f81093c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<BBSLinkObj> f81094d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<BBSLinkObj> f81095e = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f81102l = true;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28136, new Class[]{View.class}, Void.TYPE).isSupported && i0.e(((com.max.hbcommon.base.d) ConceptLinksFragment.this).mContext)) {
                s0.h4("bbs", null, null).show(ConceptLinksFragment.this.getChildFragmentManager(), "writeposttype");
            }
        }
    }

    public class b extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 28137, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            if (Math.abs(i11) > ConceptLinksFragment.this.f81101k) {
                if (i11 > 0) {
                    ConceptLinksFragment.this.f81103m.d();
                } else {
                    ConceptLinksFragment.this.f81103m.i();
                }
            }
            ConceptLinksFragment.T3(ConceptLinksFragment.this);
        }
    }

    public class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public void k(j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 28138, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            ConceptLinksFragment.this.f81094d.clear();
            ConceptLinksFragment.this.f81095e.clear();
            ConceptLinksFragment.this.f81098h = true;
            ConceptLinksFragment.Y3(ConceptLinksFragment.this, 1);
        }
    }

    public class d implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.b
        public void f(j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 28139, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            if (ConceptLinksFragment.this.f81099i) {
                ConceptLinksFragment.this.mRefreshLayout.w();
            } else {
                ConceptLinksFragment.Y3(ConceptLinksFragment.this, 0);
            }
        }
    }

    public class e extends com.max.hbcommon.network.d<Result<ConceptFeedsResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f81109b;

        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28144, new Class[0], Void.TYPE).isSupported || ConceptLinksFragment.this.f81104n == null) {
                    return;
                }
                ConceptLinksFragment.this.f81104n.q();
            }
        }

        e(int i10) {
            this.f81109b = i10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28140, new Class[0], Void.TYPE).isSupported && ConceptLinksFragment.this.isActive()) {
                ConceptLinksFragment.this.mRefreshLayout.A(0);
                ConceptLinksFragment.this.mRefreshLayout.p(0);
                super.onComplete();
                if (ConceptLinksFragment.this.f81098h) {
                    ConceptLinksFragment.this.f81098h = false;
                    ConceptLinksFragment.this.mRecyclerView.post(new a());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 28141, new Class[]{Throwable.class}, Void.TYPE).isSupported && ConceptLinksFragment.this.isActive()) {
                ConceptLinksFragment.this.f81098h = false;
                ConceptLinksFragment.this.mRefreshLayout.A(0);
                ConceptLinksFragment.this.mRefreshLayout.p(0);
                super.onError(th2);
                if (ConceptLinksFragment.this.getViewStatus() != 0) {
                    ConceptLinksFragment.N3(ConceptLinksFragment.this);
                }
            }
        }

        public void onNext(Result<ConceptFeedsResult> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 28142, new Class[]{Result.class}, Void.TYPE).isSupported && ConceptLinksFragment.this.isActive()) {
                ConceptLinksFragment.O3(ConceptLinksFragment.this, result.getResult(), this.f81109b);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28143, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ConceptFeedsResult>) obj);
        }
    }

    public class f extends com.max.hbcommon.network.d<List<FeedsContentBaseObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f81112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f81113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ConceptFeedsResult f81114d;

        f(int i10, int i11, ConceptFeedsResult conceptFeedsResult) {
            this.f81112b = i10;
            this.f81113c = i11;
            this.f81114d = conceptFeedsResult;
        }

        public void a(List<FeedsContentBaseObj> list) {
            if (!PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 28147, new Class[]{List.class}, Void.TYPE).isSupported && ConceptLinksFragment.this.isActive()) {
                ConceptLinksFragment.this.f81093c.addAll(list);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28146, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            if (1 == this.f81112b) {
                ConceptLinksFragment.P3(ConceptLinksFragment.this);
            } else {
                ConceptLinksFragment.Q3(ConceptLinksFragment.this, this.f81113c, this.f81114d.getLinks().size());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 28145, new Class[]{Throwable.class}, Void.TYPE).isSupported && ConceptLinksFragment.this.isActive()) {
                super.onError(th2);
                if (1 == this.f81112b) {
                    ConceptLinksFragment.P3(ConceptLinksFragment.this);
                } else {
                    ConceptLinksFragment.Q3(ConceptLinksFragment.this, this.f81113c, this.f81114d.getLinks().size());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 28148, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((List) obj);
        }
    }

    static /* synthetic */ void N3(ConceptLinksFragment conceptLinksFragment) {
        if (PatchProxy.proxy(new Object[]{conceptLinksFragment}, null, changeQuickRedirect, true, 28132, new Class[]{ConceptLinksFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        conceptLinksFragment.showError();
    }

    static /* synthetic */ void O3(ConceptLinksFragment conceptLinksFragment, ConceptFeedsResult conceptFeedsResult, int i10) {
        if (PatchProxy.proxy(new Object[]{conceptLinksFragment, conceptFeedsResult, new Integer(i10)}, null, changeQuickRedirect, true, 28133, new Class[]{ConceptLinksFragment.class, ConceptFeedsResult.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        conceptLinksFragment.k4(conceptFeedsResult, i10);
    }

    static /* synthetic */ void P3(ConceptLinksFragment conceptLinksFragment) {
        if (PatchProxy.proxy(new Object[]{conceptLinksFragment}, null, changeQuickRedirect, true, 28134, new Class[]{ConceptLinksFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        conceptLinksFragment.e4();
    }

    static /* synthetic */ void Q3(ConceptLinksFragment conceptLinksFragment, int i10, int i11) {
        Object[] objArr = {conceptLinksFragment, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 28135, new Class[]{ConceptLinksFragment.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        conceptLinksFragment.f4(i10, i11);
    }

    static /* synthetic */ void T3(ConceptLinksFragment conceptLinksFragment) {
        if (PatchProxy.proxy(new Object[]{conceptLinksFragment}, null, changeQuickRedirect, true, 28130, new Class[]{ConceptLinksFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        conceptLinksFragment.h4();
    }

    static /* synthetic */ void Y3(ConceptLinksFragment conceptLinksFragment, int i10) {
        if (PatchProxy.proxy(new Object[]{conceptLinksFragment, new Integer(i10)}, null, changeQuickRedirect, true, 28131, new Class[]{ConceptLinksFragment.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        conceptLinksFragment.c4(i10);
    }

    private void c4(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 28118, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().z1(this.f81100j, i10, this.f81096f, this.f81097g).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e(i10)));
    }

    public static ConceptLinksFragment d4(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 28115, new Class[]{String.class, String.class}, ConceptLinksFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (ConceptLinksFragment) patchProxyResultProxy.result;
        }
        ConceptLinksFragment conceptLinksFragment = new ConceptLinksFragment();
        Bundle bundle = new Bundle();
        bundle.putString("topic", str);
        bundle.putString(f81088p, str2);
        conceptLinksFragment.setArguments(bundle);
        return conceptLinksFragment;
    }

    private void e4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28121, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f81092b.notifyDataSetChanged();
        showContentView();
    }

    private void f4(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 28123, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f81092b.notifyItemRangeInserted(i10, i11);
        showContentView();
    }

    private void g4(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 28122, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        g.x("ConceptFeedsFragment, onGetMore, positionStart = " + i10 + ", itemCount = " + i11);
        this.f81092b.notifyItemRangeInserted(i10, i11);
    }

    private void h4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28117, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null && (recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.mRecyclerView.getLayoutManager();
            int itemCount = linearLayoutManager.getItemCount();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (itemCount <= 1 || iFindLastVisibleItemPosition + 2 < itemCount || this.f81099i) {
                return;
            }
            c4(0);
            this.f81099i = true;
            return;
        }
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == null || !(recyclerView2.getLayoutManager() instanceof StaggeredGridLayoutManager)) {
            return;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.mRecyclerView.getLayoutManager();
        int itemCount2 = staggeredGridLayoutManager.getItemCount();
        int[] iArrFindLastVisibleItemPositions = staggeredGridLayoutManager.findLastVisibleItemPositions(null);
        int i10 = iArrFindLastVisibleItemPositions[0];
        for (int i11 : iArrFindLastVisibleItemPositions) {
            if (i11 > i10) {
                i10 = i11;
            }
        }
        if (itemCount2 <= 1 || i10 + 2 < itemCount2 || this.f81099i) {
            return;
        }
        c4(0);
        this.f81099i = true;
    }

    private void i4(List<FeedsContentBaseObj> list) {
        if (!PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 28119, new Class[]{List.class}, Void.TYPE).isSupported && this.f81093c.size() > 0 && list.size() > 0) {
            List<FeedsContentBaseObj> list2 = this.f81093c;
            FeedsContentBaseObj feedsContentBaseObj = list2.get(list2.size() - 1);
            int i10 = 0;
            for (FeedsContentBaseObj feedsContentBaseObj2 : list) {
                if (feedsContentBaseObj2.getContent_type() != null && com.max.xiaoheihe.module.bbs.utils.b.c(feedsContentBaseObj2, feedsContentBaseObj)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0 || i10 >= list.size()) {
                return;
            }
            if (i10 + 1 >= list.size()) {
                list.clear();
                return;
            }
            for (int i11 = 0; i11 <= i10; i11++) {
                list.remove(0);
            }
        }
    }

    private void k4(ConceptFeedsResult conceptFeedsResult, int i10) {
        if (PatchProxy.proxy(new Object[]{conceptFeedsResult, new Integer(i10)}, this, changeQuickRedirect, false, 28120, new Class[]{ConceptFeedsResult.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f81096f = conceptFeedsResult.getUse_history();
        this.f81097g = conceptFeedsResult.getLastval();
        int size = this.f81093c.size();
        if (1 == i10 && !com.max.hbcommon.utils.c.w(conceptFeedsResult.getLinks())) {
            this.f81093c.clear();
        } else if (!com.max.hbcommon.utils.c.w(conceptFeedsResult.getLinks())) {
            i4(conceptFeedsResult.getLinks());
        }
        int size2 = this.f81093c.size();
        int size3 = conceptFeedsResult.getLinks().size();
        if (!com.max.hbcommon.utils.c.w(conceptFeedsResult.getLinks())) {
            this.f81099i = false;
            if (1 == i10) {
                this.f81093c.addAll(conceptFeedsResult.getLinks());
            } else {
                this.f81093c.addAll(conceptFeedsResult.getLinks());
            }
        }
        if (1 != i10) {
            if (size2 > 0) {
                g4(size2, size3);
                return;
            } else {
                e4();
                return;
            }
        }
        if (com.max.hbcommon.utils.c.w(this.f81093c)) {
            addDisposable((io.reactivex.disposables.b) com.max.hbcache.b.f(f81091s, FeedsContentBaseObj.class).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f(i10, size, conceptFeedsResult)));
            return;
        }
        com.max.hbcache.b.k(f81091s, this.f81093c);
        if (1 == i10) {
            e4();
        } else {
            f4(size, conceptFeedsResult.getLinks().size());
        }
    }

    @Override // com.max.xiaoheihe.module.news.adapter.a.b
    public void B3(int i10) {
        u<FeedsContentBaseObj> uVar;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 28126, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || !isActive() || (uVar = this.f81092b) == null) {
            return;
        }
        uVar.notifyItemRemoved(i10);
    }

    @Override // com.max.xiaoheihe.view.callback.a
    public void D3() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28125, new Class[0], Void.TYPE).isSupported && isActive()) {
            this.f81098h = true;
            this.mRecyclerView.scrollToPosition(0);
            this.mRefreshLayout.F();
        }
    }

    @Override // com.max.xiaoheihe.module.news.adapter.a.b
    public void G2(int i10) {
        u<FeedsContentBaseObj> uVar;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 28127, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (isActive() && (uVar = this.f81092b) != null) {
            uVar.notifyItemChanged(i10);
        }
        i<u<FeedsContentBaseObj>> iVar = this.f81104n;
        if (iVar != null) {
            iVar.q();
        }
    }

    public void b4(int i10) {
        if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 28128, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && isActive()) {
            this.iv_write_post.setTranslationY(i10);
        }
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 28116, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.fragment_news_list);
        this.mUnBinder = ButterKnife.f(this, view);
        this.f81101k = ViewConfiguration.get(this.mContext).getScaledTouchSlop();
        if (getArguments() != null) {
            this.f81100j = getArguments().getString("topic");
        }
        this.v_gradient.setVisibility(0);
        this.iv_write_post.setVisibility(0);
        this.iv_write_post.setOnClickListener(new a());
        Activity activity = this.mContext;
        com.max.xiaoheihe.module.bbs.utils.b.V(activity, this.mRecyclerView, ViewUtils.f(activity, 4.0f) / 2, ViewUtils.f(this.mContext, 4.0f), ViewUtils.f(this.mContext, 4.0f));
        this.f81092b = new z(this.mContext, this.f81093c, this.mRecyclerView);
        this.mRefreshLayout.setBackgroundResource(R.color.divider_color);
        this.mRecyclerView.clearOnScrollListeners();
        this.mRecyclerView.addOnScrollListener(new b());
        this.mRecyclerView.setAdapter(this.f81092b);
        this.f81104n = new i<>(this, this.mRecyclerView, BBSLinkObj.class);
        new OneTimeValidExposureWatcher(this, this.mRecyclerView);
        ViewUtils.b(this.mRecyclerView, this.v_scroll_container_divier);
        this.mRefreshLayout.a(true);
        this.mRefreshLayout.S(new c());
        this.mRefreshLayout.f0(new d());
        this.mRefreshLayout.setBackgroundResource(R.color.transparent);
        this.mRecyclerView.setBackgroundResource(R.color.transparent);
        com.max.xiaoheihe.utils.u uVar = new com.max.xiaoheihe.utils.u(this, this.iv_write_post, ViewUtils.f(this.mContext, 74.0f));
        this.f81103m = uVar;
        uVar.f(this.f81102l);
        showLoading();
        c4(1);
    }

    public void j4(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 28129, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f81102l = z10;
        View view = this.iv_write_post;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28124, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        c4(1);
    }
}
