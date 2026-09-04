package com.max.xiaoheihe.module.favour;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.favour.FavourLinksResult;
import com.max.xiaoheihe.module.bbs.LinkListV2Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class FavourLinkListFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f83832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    com.max.xiaoheihe.module.bbs.adapter.m f83833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    List<BBSLinkObj> f83834d = new ArrayList();

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    public class a implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 31989, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            FavourLinkListFragment.this.f83832b = 0;
            FavourLinkListFragment.this.P3();
        }
    }

    public class b implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 31990, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            FavourLinkListFragment.M3(FavourLinkListFragment.this, 30);
            FavourLinkListFragment.this.P3();
        }
    }

    public class c extends com.max.hbcommon.network.d<Result<FavourLinksResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31991, new Class[0], Void.TYPE).isSupported && FavourLinkListFragment.this.isActive()) {
                super.onComplete();
                FavourLinkListFragment.this.mRefreshLayout.A(0);
                FavourLinkListFragment.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 31992, new Class[]{Throwable.class}, Void.TYPE).isSupported && FavourLinkListFragment.this.isActive()) {
                super.onError(th2);
                FavourLinkListFragment.N3(FavourLinkListFragment.this);
                FavourLinkListFragment.this.mRefreshLayout.A(0);
                FavourLinkListFragment.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<FavourLinksResult> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 31993, new Class[]{Result.class}, Void.TYPE).isSupported && FavourLinkListFragment.this.isActive()) {
                super.onNext(result);
                FavourLinkListFragment.O3(FavourLinkListFragment.this, result.getResult().getFavours());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31994, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<FavourLinksResult>) obj);
        }
    }

    static /* synthetic */ int M3(FavourLinkListFragment favourLinkListFragment, int i10) {
        int i11 = favourLinkListFragment.f83832b + i10;
        favourLinkListFragment.f83832b = i11;
        return i11;
    }

    static /* synthetic */ void N3(FavourLinkListFragment favourLinkListFragment) {
        if (PatchProxy.proxy(new Object[]{favourLinkListFragment}, null, changeQuickRedirect, true, 31987, new Class[]{FavourLinkListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        favourLinkListFragment.showError();
    }

    static /* synthetic */ void O3(FavourLinkListFragment favourLinkListFragment, List list) {
        if (PatchProxy.proxy(new Object[]{favourLinkListFragment, list}, null, changeQuickRedirect, true, 31988, new Class[]{FavourLinkListFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        favourLinkListFragment.R3(list);
    }

    public static FavourLinkListFragment Q3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 31982, new Class[0], FavourLinkListFragment.class);
        return patchProxyResultProxy.isSupported ? (FavourLinkListFragment) patchProxyResultProxy.result : new FavourLinkListFragment();
    }

    private void R3(List<BBSLinkObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 31985, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (list != null) {
            if (this.f83832b == 0) {
                this.f83834d.clear();
            }
            this.f83834d.addAll(list);
            this.f83833c.notifyDataSetChanged();
        }
        if (this.f83834d.isEmpty()) {
            showEmpty(R.drawable.common_tag_common_45x45, R.string.empty_content);
        } else {
            showContentView();
        }
    }

    public void P3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31984, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().f4(this.f83832b, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31983, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        this.mUnBinder = ButterKnife.f(this, view);
        this.f83833c = new com.max.xiaoheihe.module.bbs.adapter.m(this.mContext, this.f83834d, LinkListV2Fragment.f79976x);
        this.mRecyclerView.setClipToPadding(false);
        this.mRecyclerView.setClipChildren(false);
        this.mRecyclerView.setPadding(0, ViewUtils.f(this.mContext, 4.0f), 0, 0);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext, 1, false));
        this.mRecyclerView.setAdapter(this.f83833c);
        this.mRefreshLayout.S(new a());
        this.mRefreshLayout.f0(new b());
        showLoading();
        P3();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31986, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        this.f83832b = 0;
        P3();
    }
}
