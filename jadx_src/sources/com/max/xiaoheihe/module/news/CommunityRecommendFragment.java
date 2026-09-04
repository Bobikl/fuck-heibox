package com.max.xiaoheihe.module.news;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.p0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.appbar.AppBarLayout;
import com.max.hbcommon.analytics.m;
import com.max.hbcommon.base.adapter.OneTimeValidExposureWatcher;
import com.max.hbcommon.bean.AdsBannerObj;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkListHeaderObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicBannerResult;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
@m(path = lb.d.L)
public class CommunityRecommendFragment extends rb.a implements ConceptFeedsFragment.l, com.max.xiaoheihe.view.callback.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f91132e = "state_topic_banner_result";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f91133f = "pages";

    @BindView(R.id.appBarLayout)
    AppBarLayout appBarLayout;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Result<BBSTopicBannerResult> f91134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.viewpager.widget.a f91135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String[] f91136d;

    @BindView(R.id.banner)
    BannerViewPager<AdsBannerObj> mBanner;

    @BindView(R.id.fb_write_post)
    View mWritePostImageView;

    @BindView(R.id.rv_topic)
    RecyclerView rv_topic;

    @BindView(R.id.vg_recommend_header)
    LinearLayout vg_recommend_header;

    @BindView(R.id.vg_update_tips)
    ViewGroup vg_update_tips;

    @BindView(R.id.vp)
    ViewPager vp;

    public class a extends n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            return 1;
        }

        @Override // androidx.fragment.app.n0
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 42325, new Class[]{Integer.TYPE}, Fragment.class);
            return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : ConceptFeedsFragment.t4();
        }

        @Override // androidx.viewpager.widget.a
        @p0
        public CharSequence getPageTitle(int i10) {
            return "热榜";
        }
    }

    public class b extends com.max.hbcommon.network.d<Result<BBSTopicBannerResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 42326, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
            CommunityRecommendFragment.M3(CommunityRecommendFragment.this);
        }

        public void onNext(Result<BBSTopicBannerResult> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 42327, new Class[]{Result.class}, Void.TYPE).isSupported && CommunityRecommendFragment.this.isActive()) {
                super.onNext(result);
                CommunityRecommendFragment.N3(CommunityRecommendFragment.this, result);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 42328, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSTopicBannerResult>) obj);
        }
    }

    static /* synthetic */ void M3(CommunityRecommendFragment communityRecommendFragment) {
        if (PatchProxy.proxy(new Object[]{communityRecommendFragment}, null, changeQuickRedirect, true, 42323, new Class[]{CommunityRecommendFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        communityRecommendFragment.showError();
    }

    static /* synthetic */ void N3(CommunityRecommendFragment communityRecommendFragment, Result result) {
        if (PatchProxy.proxy(new Object[]{communityRecommendFragment, result}, null, changeQuickRedirect, true, 42324, new Class[]{CommunityRecommendFragment.class, Result.class}, Void.TYPE).isSupported) {
            return;
        }
        communityRecommendFragment.S3(result);
    }

    private void P3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42316, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) i.a().u4().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private void Q3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42312, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Result<BBSTopicBannerResult> result = this.f91134b;
        if (result != null) {
            S3(result);
        } else {
            showLoading();
            P3();
        }
    }

    public static CommunityRecommendFragment R3(String[] strArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{strArr}, null, changeQuickRedirect, true, 42309, new Class[]{String[].class}, CommunityRecommendFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (CommunityRecommendFragment) patchProxyResultProxy.result;
        }
        CommunityRecommendFragment communityRecommendFragment = new CommunityRecommendFragment();
        Bundle bundle = new Bundle();
        bundle.putStringArray("pages", strArr);
        communityRecommendFragment.setArguments(bundle);
        return communityRecommendFragment;
    }

    private void S3(Result<BBSTopicBannerResult> result) {
        if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 42317, new Class[]{Result.class}, Void.TYPE).isSupported) {
            return;
        }
        if (result != null) {
            this.f91134b = result;
            BBSTopicBannerResult result2 = result.getResult();
            this.rv_topic.setLayoutManager(new LinearLayoutManager(this.mContext, 0, false));
            this.rv_topic.setPadding(ViewUtils.f(this.mContext, 1.0f), ViewUtils.f(this.mContext, 20.0f), ViewUtils.f(this.mContext, 1.0f), 0);
            this.rv_topic.setClipToPadding(false);
            this.rv_topic.setClipChildren(false);
            ViewUtils.n0(this.rv_topic, 0, 0, 0, ViewUtils.f(this.mContext, 10.0f));
            ArrayList arrayList = new ArrayList();
            BBSLinkListHeaderObj topic_banner = result2.getTopic_banner();
            if (topic_banner == null || (com.max.hbcommon.utils.c.w(topic_banner.getTopics()) && com.max.hbcommon.utils.c.w(topic_banner.getSubscribed_topics()))) {
                this.rv_topic.setVisibility(8);
            } else {
                if (!com.max.hbcommon.utils.c.w(topic_banner.getTop_topics())) {
                    arrayList.addAll(topic_banner.getTop_topics());
                }
                if (!com.max.hbcommon.utils.c.w(topic_banner.getSubscribed_topics())) {
                    arrayList.addAll(topic_banner.getSubscribed_topics());
                }
                if (!com.max.hbcommon.utils.c.w(topic_banner.getTopics())) {
                    arrayList.addAll(topic_banner.getTopics());
                }
                this.rv_topic.setAdapter(new com.max.xiaoheihe.module.news.adapter.c(this.mContext, arrayList, null));
                this.rv_topic.setVisibility(0);
            }
            com.max.hbcommon.utils.b.f(this.mBanner, result2.getAds_banner());
        }
        showContentView();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.max.xiaoheihe.view.callback.a
    public void D3() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42319, new Class[0], Void.TYPE).isSupported && isActive()) {
            androidx.viewpager.widget.a aVar = this.f91135c;
            ViewPager viewPager = this.vp;
            Object objInstantiateItem = aVar.instantiateItem((ViewGroup) viewPager, viewPager.getCurrentItem());
            if (objInstantiateItem instanceof com.max.xiaoheihe.view.callback.a) {
                ((com.max.xiaoheihe.view.callback.a) objInstantiateItem).D3();
            }
            this.appBarLayout.setExpanded(true, true);
        }
    }

    @Override // rb.a, rb.c
    @p0
    public Bundle M() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42318, new Class[0], Bundle.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bundle) patchProxyResultProxy.result;
        }
        Bundle bundle = new Bundle();
        Result<BBSTopicBannerResult> result = this.f91134b;
        if (result != null) {
            bundle.putSerializable(f91132e, result);
        }
        return bundle;
    }

    public void O3(String[] strArr) {
        ViewPager viewPager;
        if (PatchProxy.proxy(new Object[]{strArr}, this, changeQuickRedirect, false, 42321, new Class[]{String[].class}, Void.TYPE).isSupported || (viewPager = this.vp) == null) {
            return;
        }
        this.f91136d = strArr;
        viewPager.setCurrentItem(0);
    }

    @Override // com.max.xiaoheihe.module.news.ConceptFeedsFragment.l
    public View Q1() {
        return this.vg_update_tips;
    }

    public void T3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42315, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        P3();
    }

    @Override // com.max.xiaoheihe.module.news.ConceptFeedsFragment.l
    public View U0() {
        return this.mWritePostImageView;
    }

    @Override // com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42313, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Q3();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42311, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.fragment_community_recommend);
        this.mUnBinder = ButterKnife.f(this, view);
        if (getArguments() != null) {
            this.f91136d = getArguments().getStringArray("pages");
        }
        if (getParentFragment() instanceof DiscoveryFragment) {
            this.appBarLayout.setExpanded(false);
        }
        this.f91135c = new a(getChildFragmentManager());
        this.vp.setOffscreenPageLimit(1);
        this.vp.setAdapter(this.f91135c);
        O3(this.f91136d);
        new OneTimeValidExposureWatcher(this, this.rv_topic);
    }

    @Override // rb.a, com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42322, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f91135c = null;
        super.onDestroy();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42320, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        P3();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42314, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStop();
    }

    @Override // rb.a, rb.c
    public void p3(@p0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 42310, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.p3(bundle);
        if (bundle != null) {
            Serializable serializable = bundle.getSerializable(f91132e);
            if (serializable instanceof Result) {
                this.f91134b = (Result) serializable;
            }
        }
    }
}
