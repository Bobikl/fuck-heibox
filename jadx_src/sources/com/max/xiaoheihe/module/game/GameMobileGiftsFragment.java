package com.max.xiaoheihe.module.game;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.TopicNavObj;
import com.max.xiaoheihe.bean.game.GameMobileBundleObj;
import com.max.xiaoheihe.bean.game.GameMobileBundleTitleObj;
import com.max.xiaoheihe.bean.game.GameMobileBundleWrapperObj;
import com.max.xiaoheihe.bean.game.GameMobileBundlesCategoryObj;
import com.max.xiaoheihe.bean.game.GameMobileBundlesObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class GameMobileGiftsFragment extends com.max.hbcommon.base.d implements com.max.xiaoheihe.view.callback.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f84497b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BannerViewPager<TopicNavObj> f84499d;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<GameMobileBundleWrapperObj> f84498c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.max.xiaoheihe.module.game.adapter.d0 f84500e = new com.max.xiaoheihe.module.game.adapter.d0();

    public class a extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@androidx.annotation.n0 Rect rect, @androidx.annotation.n0 View view, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 33238, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int itemType = childAdapterPosition < GameMobileGiftsFragment.this.f84498c.size() ? ((GameMobileBundleWrapperObj) GameMobileGiftsFragment.this.f84498c.get(childAdapterPosition)).getItemType() : 0;
            int iF = ViewUtils.f(((com.max.hbcommon.base.d) GameMobileGiftsFragment.this).mContext, 12.0f);
            int iF2 = ViewUtils.f(((com.max.hbcommon.base.d) GameMobileGiftsFragment.this).mContext, 10.0f);
            if (itemType != 0) {
                rect.set(iF, iF2, iF, 0);
            } else {
                rect.set(0, 0, 0, 0);
            }
        }
    }

    public class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 33239, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameMobileGiftsFragment.a4(GameMobileGiftsFragment.this);
        }
    }

    public class c extends com.max.hbcommon.network.d<Result<GameMobileBundlesObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33240, new Class[0], Void.TYPE).isSupported && GameMobileGiftsFragment.this.isActive()) {
                super.onComplete();
                GameMobileGiftsFragment.this.mRefreshLayout.A(0);
                GameMobileGiftsFragment.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 33241, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameMobileGiftsFragment.this.isActive()) {
                super.onError(th2);
                GameMobileGiftsFragment.b4(GameMobileGiftsFragment.this);
                GameMobileGiftsFragment.this.mRefreshLayout.A(0);
                GameMobileGiftsFragment.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<GameMobileBundlesObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33242, new Class[]{Result.class}, Void.TYPE).isSupported && GameMobileGiftsFragment.this.isActive()) {
                super.onNext(result);
                GameMobileGiftsFragment.c4(GameMobileGiftsFragment.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33243, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GameMobileBundlesObj>) obj);
        }
    }

    public class d extends com.max.hbcommon.base.adapter.u<GameMobileBundleWrapperObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a extends com.max.hbcustomview.bannerview.d<TopicNavObj> {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            public void A(com.max.hbcustomview.bannerview.e<TopicNavObj> eVar, TopicNavObj topicNavObj, int i10, int i11) {
                Object[] objArr = {eVar, topicNavObj, new Integer(i10), new Integer(i11)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 33250, new Class[]{com.max.hbcustomview.bannerview.e.class, TopicNavObj.class, cls, cls}, Void.TYPE).isSupported) {
                    return;
                }
                d.n(d.this, (ViewGroup) eVar.itemView, topicNavObj);
            }

            @Override // com.max.hbcustomview.bannerview.d
            public /* bridge */ /* synthetic */ void n(com.max.hbcustomview.bannerview.e<TopicNavObj> eVar, TopicNavObj topicNavObj, int i10, int i11) {
                Object[] objArr = {eVar, topicNavObj, new Integer(i10), new Integer(i11)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 33251, new Class[]{com.max.hbcustomview.bannerview.e.class, Object.class, cls, cls}, Void.TYPE).isSupported) {
                    return;
                }
                A(eVar, topicNavObj, i10, i11);
            }

            @Override // com.max.hbcustomview.bannerview.d
            public int q(int i10) {
                return R.layout.layout_null;
            }
        }

        public class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ GameMobileBundleTitleObj f84506b;

            b(GameMobileBundleTitleObj gameMobileBundleTitleObj) {
                this.f84506b = gameMobileBundleTitleObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33252, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                GameMobileGiftsFragment gameMobileGiftsFragment = GameMobileGiftsFragment.this;
                gameMobileGiftsFragment.startActivity(GameMobileSortedGiftsActivity.M1(((com.max.hbcommon.base.d) gameMobileGiftsFragment).mContext, this.f84506b.getDesc(), this.f84506b.getKey()));
            }
        }

        public class c implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TopicNavObj f84508b;

            c(TopicNavObj topicNavObj) {
                this.f84508b = topicNavObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33253, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) GameMobileGiftsFragment.this).mContext, this.f84508b.getProtocol());
            }
        }

        public d() {
            super(((com.max.hbcommon.base.d) GameMobileGiftsFragment.this).mContext, GameMobileGiftsFragment.this.f84498c);
        }

        static /* synthetic */ void n(d dVar, ViewGroup viewGroup, TopicNavObj topicNavObj) {
            if (PatchProxy.proxy(new Object[]{dVar, viewGroup, topicNavObj}, null, changeQuickRedirect, true, 33249, new Class[]{d.class, ViewGroup.class, TopicNavObj.class}, Void.TYPE).isSupported) {
                return;
            }
            dVar.q(viewGroup, topicNavObj);
        }

        private void q(ViewGroup viewGroup, TopicNavObj topicNavObj) {
            if (PatchProxy.proxy(new Object[]{viewGroup, topicNavObj}, this, changeQuickRedirect, false, 33246, new Class[]{ViewGroup.class, TopicNavObj.class}, Void.TYPE).isSupported) {
                return;
            }
            RelativeLayout relativeLayout = new RelativeLayout(((com.max.hbcommon.base.d) GameMobileGiftsFragment.this).mContext);
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, ViewUtils.f(((com.max.hbcommon.base.d) GameMobileGiftsFragment.this).mContext, 155.0f)));
            ImageView imageView = new ImageView(((com.max.hbcommon.base.d) GameMobileGiftsFragment.this).mContext);
            imageView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            com.max.hbimage.b.d0(topicNavObj.getImg(), imageView, ViewUtils.f(((com.max.hbcommon.base.d) GameMobileGiftsFragment.this).mContext, 10.0f));
            relativeLayout.addView(imageView);
            ImageView imageView2 = new ImageView(((com.max.hbcommon.base.d) GameMobileGiftsFragment.this).mContext);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = ViewUtils.f(((com.max.hbcommon.base.d) GameMobileGiftsFragment.this).mContext, 4.0f);
            layoutParams.leftMargin = ViewUtils.f(((com.max.hbcommon.base.d) GameMobileGiftsFragment.this).mContext, 4.0f);
            imageView2.setLayoutParams(layoutParams);
            imageView2.setImageResource(R.drawable.game_label_ads_26x14);
            if ("advertise".equals(topicNavObj.getLabel())) {
                imageView2.setVisibility(0);
            } else {
                imageView2.setVisibility(8);
            }
            relativeLayout.addView(imageView2);
            relativeLayout.setOnClickListener(new c(topicNavObj));
            viewGroup.removeAllViews();
            viewGroup.addView(relativeLayout);
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, GameMobileBundleWrapperObj gameMobileBundleWrapperObj) {
            Object[] objArr = {new Integer(i10), gameMobileBundleWrapperObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 33247, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : o(i10, gameMobileBundleWrapperObj);
        }

        public int o(int i10, GameMobileBundleWrapperObj gameMobileBundleWrapperObj) {
            Object[] objArr = {new Integer(i10), gameMobileBundleWrapperObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 33244, new Class[]{cls, GameMobileBundleWrapperObj.class}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            int itemType = gameMobileBundleWrapperObj.getItemType();
            if (1 == itemType) {
                return R.layout.item_banner;
            }
            if (2 == itemType) {
                return R.layout.component_2_col_l_title_16;
            }
            return itemType == 0 ? R.layout.item_game_mobile_bundle : R.layout.empty_layout;
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 33248, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            p(eVar, (GameMobileBundleWrapperObj) obj);
        }

        public void p(com.max.hbcommon.base.adapter.s.e eVar, GameMobileBundleWrapperObj gameMobileBundleWrapperObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameMobileBundleWrapperObj}, this, changeQuickRedirect, false, 33245, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameMobileBundleWrapperObj.class}, Void.TYPE).isSupported) {
                return;
            }
            if (R.layout.item_banner == eVar.d()) {
                GameMobileGiftsFragment.this.f84499d = (BannerViewPager) eVar.b();
                GameMobileGiftsFragment.this.f84499d.J(gameMobileBundleWrapperObj.getHeader());
                GameMobileGiftsFragment.this.f84499d.getLayoutParams().height = ViewUtils.f(((com.max.hbcommon.base.d) GameMobileGiftsFragment.this).mContext, 155.0f);
                GameMobileGiftsFragment.this.f84499d.V(ViewUtils.f(((com.max.hbcommon.base.d) GameMobileGiftsFragment.this).mContext, 2.0f));
                GameMobileGiftsFragment.this.f84499d.c0(ViewUtils.f(((com.max.hbcommon.base.d) GameMobileGiftsFragment.this).mContext, 8.0f));
                GameMobileGiftsFragment.this.f84499d.Z(ViewUtils.f(((com.max.hbcommon.base.d) GameMobileGiftsFragment.this).mContext, 6.0f));
                GameMobileGiftsFragment.this.f84499d.j0(GameMobileGiftsFragment.this.getLifecycle()).R(new a()).k();
                return;
            }
            if (R.layout.component_2_col_l_title_16 != eVar.d()) {
                if (R.layout.item_game_mobile_bundle == eVar.d()) {
                    GameMobileBundleObj bundle = gameMobileBundleWrapperObj.getBundle();
                    r1.D1(eVar, bundle);
                    GameMobileGiftsFragment.this.f84500e.b(eVar, bundle, true);
                    return;
                }
                return;
            }
            GameMobileBundleTitleObj title = gameMobileBundleWrapperObj.getTitle();
            eVar.p(R.id.tv_title, title.getDesc());
            View viewI = eVar.i(R.id.vg_more);
            if (!"1".equals(title.getMore())) {
                viewI.setVisibility(8);
            } else {
                viewI.setVisibility(0);
                viewI.setOnClickListener(new b(title));
            }
        }
    }

    static /* synthetic */ void a4(GameMobileGiftsFragment gameMobileGiftsFragment) {
        if (PatchProxy.proxy(new Object[]{gameMobileGiftsFragment}, null, changeQuickRedirect, true, 33235, new Class[]{GameMobileGiftsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameMobileGiftsFragment.i4();
    }

    static /* synthetic */ void b4(GameMobileGiftsFragment gameMobileGiftsFragment) {
        if (PatchProxy.proxy(new Object[]{gameMobileGiftsFragment}, null, changeQuickRedirect, true, 33236, new Class[]{GameMobileGiftsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameMobileGiftsFragment.showError();
    }

    static /* synthetic */ void c4(GameMobileGiftsFragment gameMobileGiftsFragment, GameMobileBundlesObj gameMobileBundlesObj) {
        if (PatchProxy.proxy(new Object[]{gameMobileGiftsFragment, gameMobileBundlesObj}, null, changeQuickRedirect, true, 33237, new Class[]{GameMobileGiftsFragment.class, GameMobileBundlesObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameMobileGiftsFragment.k4(gameMobileBundlesObj);
    }

    private void i4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33228, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().A7().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    public static GameMobileGiftsFragment j4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 33225, new Class[0], GameMobileGiftsFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameMobileGiftsFragment) patchProxyResultProxy.result;
        }
        GameMobileGiftsFragment gameMobileGiftsFragment = new GameMobileGiftsFragment();
        gameMobileGiftsFragment.setArguments(new Bundle());
        return gameMobileGiftsFragment;
    }

    private void k4(GameMobileBundlesObj gameMobileBundlesObj) {
        if (PatchProxy.proxy(new Object[]{gameMobileBundlesObj}, this, changeQuickRedirect, false, 33229, new Class[]{GameMobileBundlesObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (gameMobileBundlesObj != null) {
            this.f84498c.clear();
            if (gameMobileBundlesObj.getHeader() != null && gameMobileBundlesObj.getHeader().size() > 0) {
                GameMobileBundleWrapperObj gameMobileBundleWrapperObj = new GameMobileBundleWrapperObj();
                gameMobileBundleWrapperObj.setItemType(1);
                gameMobileBundleWrapperObj.setHeader(gameMobileBundlesObj.getHeader());
                this.f84498c.add(gameMobileBundleWrapperObj);
            }
            if (gameMobileBundlesObj.getAll_list() != null) {
                for (GameMobileBundlesCategoryObj gameMobileBundlesCategoryObj : gameMobileBundlesObj.getAll_list()) {
                    if (!com.max.hbcommon.utils.c.u(gameMobileBundlesCategoryObj.getTitle())) {
                        GameMobileBundleWrapperObj gameMobileBundleWrapperObj2 = new GameMobileBundleWrapperObj();
                        gameMobileBundleWrapperObj2.setItemType(2);
                        GameMobileBundleTitleObj gameMobileBundleTitleObj = new GameMobileBundleTitleObj();
                        gameMobileBundleTitleObj.setKey(gameMobileBundlesCategoryObj.getSort_type());
                        gameMobileBundleTitleObj.setDesc(gameMobileBundlesCategoryObj.getTitle());
                        gameMobileBundleTitleObj.setMore(gameMobileBundlesCategoryObj.getHas_more());
                        gameMobileBundleWrapperObj2.setTitle(gameMobileBundleTitleObj);
                        this.f84498c.add(gameMobileBundleWrapperObj2);
                    }
                    if (gameMobileBundlesCategoryObj.getList() != null) {
                        for (GameMobileBundleObj gameMobileBundleObj : gameMobileBundlesCategoryObj.getList()) {
                            GameMobileBundleWrapperObj gameMobileBundleWrapperObj3 = new GameMobileBundleWrapperObj();
                            gameMobileBundleWrapperObj3.setItemType(0);
                            gameMobileBundleWrapperObj3.setBundle(gameMobileBundleObj);
                            this.f84498c.add(gameMobileBundleWrapperObj3);
                        }
                    }
                }
            }
            this.f84497b.notifyDataSetChanged();
        }
        if (this.f84498c.isEmpty()) {
            showEmpty();
        } else {
            showContentView();
        }
    }

    @Override // com.max.xiaoheihe.view.callback.a
    public void D3() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33230, new Class[0], Void.TYPE).isSupported && isActive()) {
            this.mRecyclerView.scrollToPosition(0);
            this.mRefreshLayout.F();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33227, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        i4();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33226, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        this.mUnBinder = ButterKnife.f(this, view);
        this.mRefreshLayout.setBackgroundColor(getResources().getColor(R.color.white));
        this.mRecyclerView.addItemDecoration(new a());
        this.f84497b = new d();
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.mRecyclerView.setAdapter(this.f84497b);
        this.mRefreshLayout.S(new b());
        this.mRefreshLayout.b0(false);
        if (this.mIsFirst) {
            showLoading();
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33234, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f84500e.c();
        super.onDestroyView();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33231, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        i4();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33232, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33233, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStop();
    }
}
