package com.max.xiaoheihe.module.favour;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.gson.JsonObject;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.WikiArticelObj;
import com.max.xiaoheihe.bean.bbs.WikiListObj;
import com.max.xiaoheihe.bean.bbs.WikiOrArticleWrapperObj;
import com.max.xiaoheihe.bean.favour.FavourWikiResult;
import com.max.xiaoheihe.module.bbs.adapter.a0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
@com.max.hbcommon.analytics.m(path = lb.d.A1)
public class FavourWikiListFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f83839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a0 f83840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<WikiOrArticleWrapperObj> f83841d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f83842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f83843f;

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
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 32005, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            FavourWikiListFragment.this.f83839b = 0;
            FavourWikiListFragment.this.P3();
        }
    }

    public class b implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 32006, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            FavourWikiListFragment.M3(FavourWikiListFragment.this, 30);
            FavourWikiListFragment.this.P3();
        }
    }

    public class c extends com.max.hbcommon.network.d<Result<FavourWikiResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32007, new Class[0], Void.TYPE).isSupported && FavourWikiListFragment.this.isActive()) {
                super.onComplete();
                FavourWikiListFragment.this.mRefreshLayout.A(0);
                FavourWikiListFragment.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 32008, new Class[]{Throwable.class}, Void.TYPE).isSupported && FavourWikiListFragment.this.isActive()) {
                super.onError(th2);
                FavourWikiListFragment.N3(FavourWikiListFragment.this);
                FavourWikiListFragment.this.mRefreshLayout.A(0);
                FavourWikiListFragment.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<FavourWikiResult> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 32009, new Class[]{Result.class}, Void.TYPE).isSupported && FavourWikiListFragment.this.isActive()) {
                super.onNext(result);
                FavourWikiListFragment.O3(FavourWikiListFragment.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 32010, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<FavourWikiResult>) obj);
        }
    }

    static /* synthetic */ int M3(FavourWikiListFragment favourWikiListFragment, int i10) {
        int i11 = favourWikiListFragment.f83839b + i10;
        favourWikiListFragment.f83839b = i11;
        return i11;
    }

    static /* synthetic */ void N3(FavourWikiListFragment favourWikiListFragment) {
        if (PatchProxy.proxy(new Object[]{favourWikiListFragment}, null, changeQuickRedirect, true, 32003, new Class[]{FavourWikiListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        favourWikiListFragment.showError();
    }

    static /* synthetic */ void O3(FavourWikiListFragment favourWikiListFragment, FavourWikiResult favourWikiResult) {
        if (PatchProxy.proxy(new Object[]{favourWikiListFragment, favourWikiResult}, null, changeQuickRedirect, true, 32004, new Class[]{FavourWikiListFragment.class, FavourWikiResult.class}, Void.TYPE).isSupported) {
            return;
        }
        favourWikiListFragment.S3(favourWikiResult);
    }

    private void Q3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31998, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mRecyclerView.setPadding(ViewUtils.f(this.mContext, 8.0f), 0, ViewUtils.f(this.mContext, 8.0f), 0);
        this.mRecyclerView.setLayoutManager(new GridLayoutManager(this.mContext, 2));
        this.mRecyclerView.setBackgroundColor(com.max.xiaoheihe.utils.d.E(R.color.white));
        this.mRecyclerView.setAdapter(this.f83840c);
    }

    public static FavourWikiListFragment R3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 31996, new Class[0], FavourWikiListFragment.class);
        return patchProxyResultProxy.isSupported ? (FavourWikiListFragment) patchProxyResultProxy.result : new FavourWikiListFragment();
    }

    private void S3(FavourWikiResult favourWikiResult) {
        if (PatchProxy.proxy(new Object[]{favourWikiResult}, this, changeQuickRedirect, false, 32000, new Class[]{FavourWikiResult.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (favourWikiResult != null) {
            if (this.f83839b == 0) {
                this.f83841d.clear();
                if (!com.max.hbcommon.utils.c.w(favourWikiResult.getFavours_wiki())) {
                    WikiOrArticleWrapperObj wikiOrArticleWrapperObj = new WikiOrArticleWrapperObj();
                    wikiOrArticleWrapperObj.setItemType(2);
                    wikiOrArticleWrapperObj.setTitle(com.max.xiaoheihe.utils.d.n0(R.string.wiki_list_title));
                    this.f83841d.add(wikiOrArticleWrapperObj);
                    for (WikiListObj wikiListObj : favourWikiResult.getFavours_wiki()) {
                        WikiOrArticleWrapperObj wikiOrArticleWrapperObj2 = new WikiOrArticleWrapperObj();
                        wikiOrArticleWrapperObj2.setItemType(1);
                        wikiOrArticleWrapperObj2.setWiki(wikiListObj);
                        this.f83841d.add(wikiOrArticleWrapperObj2);
                    }
                }
                if (!com.max.hbcommon.utils.c.w(favourWikiResult.getFavours_article())) {
                    WikiOrArticleWrapperObj wikiOrArticleWrapperObj3 = new WikiOrArticleWrapperObj();
                    wikiOrArticleWrapperObj3.setItemType(2);
                    wikiOrArticleWrapperObj3.setTitle(com.max.xiaoheihe.utils.d.n0(R.string.wiki_article_title));
                    this.f83841d.add(wikiOrArticleWrapperObj3);
                    for (WikiArticelObj wikiArticelObj : favourWikiResult.getFavours_article()) {
                        WikiOrArticleWrapperObj wikiOrArticleWrapperObj4 = new WikiOrArticleWrapperObj();
                        wikiOrArticleWrapperObj4.setItemType(0);
                        wikiOrArticleWrapperObj4.setArticle(wikiArticelObj);
                        this.f83841d.add(wikiOrArticleWrapperObj4);
                    }
                }
            } else if (!com.max.hbcommon.utils.c.w(favourWikiResult.getFavours_article())) {
                for (WikiArticelObj wikiArticelObj2 : favourWikiResult.getFavours_article()) {
                    WikiOrArticleWrapperObj wikiOrArticleWrapperObj5 = new WikiOrArticleWrapperObj();
                    wikiOrArticleWrapperObj5.setItemType(0);
                    wikiOrArticleWrapperObj5.setArticle(wikiArticelObj2);
                    this.f83841d.add(wikiOrArticleWrapperObj5);
                }
            }
            this.f83840c.notifyDataSetChanged();
        }
        if (this.f83841d.isEmpty()) {
            showEmpty();
        } else {
            showContentView();
        }
    }

    public void P3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31999, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().g5(this.f83839b, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32002, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", "3");
        return jsonObject.toString();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31997, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        this.mUnBinder = ButterKnife.f(this, view);
        this.f83840c = new a0(this.mContext, this.f83841d);
        this.f83843f = ViewUtils.f(this.mContext, 22.0f);
        this.f83842e = ViewUtils.f(this.mContext, 4.0f);
        Q3();
        this.mRefreshLayout.S(new a());
        this.mRefreshLayout.f0(new b());
        showLoading();
        P3();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32001, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        this.f83839b = 0;
        P3();
    }
}
