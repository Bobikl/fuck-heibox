package com.max.xiaoheihe.module.news;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.p0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.analytics.m;
import com.max.hbcommon.base.adapter.OneTimeValidExposureViewWatcher;
import com.max.hbcommon.component.HeyBoxTabLayout;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSTopicCategoryObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.news.NewsFavourResultObj;
import com.max.xiaoheihe.module.bbs.ChannelsNewsFragment;
import com.max.xiaoheihe.module.bbs.FollowedMomentsFragment;
import com.max.xiaoheihe.module.bbs.HotNewsFragment;
import com.max.xiaoheihe.network.i;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
@m(path = "/home/recommend")
public class NewsTagListFragment extends com.max.hbcommon.base.d implements com.max.xiaoheihe.view.callback.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f91236f = "save__instance__current__page__index";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f91237g = 50;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f91238h = 500;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f91239i = "moments";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f91240j = "news_topic";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f91241k = "hot_news";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private NewMsgBroadcastReceiver f91242b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.viewpager.widget.a f91244d;

    @BindView(R.id.iv_setting_point)
    ImageView iv_setting_point;

    @BindView(R.id.tab_news_tag)
    HeyBoxTabLayout tabNewsTag;

    @BindView(R.id.v_divider)
    View v_divider;

    @BindView(R.id.vg_setting)
    ViewGroup vg_setting;

    @BindView(R.id.vp_news_tag)
    ViewPager vpNewsTag;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<BBSTopicObj> f91243c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f91245e = 0;

    public class NewMsgBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private NewMsgBroadcastReceiver() {
        }

        /* synthetic */ NewMsgBroadcastReceiver(NewsTagListFragment newsTagListFragment, a aVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 42513, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported && lb.a.E.equals(intent.getAction())) {
                NewsTagListFragment.this.onRefresh();
            }
        }
    }

    public class a implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 42503, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcache.c.z("news_tab_show_count", "500");
            com.max.xiaoheihe.base.router.b.m0(((com.max.hbcommon.base.d) NewsTagListFragment.this).mContext, "帮助", lb.a.f131060v4);
            dialogInterface.dismiss();
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 42504, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcache.c.z("news_tab_show_count", "500");
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + ((com.max.hbcommon.base.d) NewsTagListFragment.this).mContext.getPackageName()));
                intent.addFlags(268435456);
                NewsTagListFragment.this.startActivity(intent);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            dialogInterface.dismiss();
        }
    }

    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42505, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.f(((com.max.hbcommon.base.d) NewsTagListFragment.this).mContext, lb.d.f131171h1).U("key", "news").A();
        }
    }

    public class d extends n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        d(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42507, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : NewsTagListFragment.this.f91243c.size();
        }

        @Override // androidx.fragment.app.n0
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 42506, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            String key = ((BBSTopicObj) NewsTagListFragment.this.f91243c.get(i10)).getTag().getKey();
            if (NewsTagListFragment.f91239i.equals(key)) {
                return FollowedMomentsFragment.n4();
            }
            if (NewsTagListFragment.f91240j.equals(key)) {
                return SubjectListFragment.V3();
            }
            if (!NewsTagListFragment.f91241k.equals(key)) {
                return ChannelsNewsFragment.J4(key, String.valueOf(i10));
            }
            HotNewsFragment hotNewsFragmentV3 = HotNewsFragment.V3();
            hotNewsFragmentV3.setUserVisibleHint(true);
            return hotNewsFragmentV3;
        }

        @Override // androidx.viewpager.widget.a
        public int getItemPosition(@androidx.annotation.n0 Object obj) {
            return -2;
        }

        @Override // androidx.viewpager.widget.a
        @p0
        public CharSequence getPageTitle(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 42508, new Class[]{Integer.TYPE}, CharSequence.class);
            if (patchProxyResultProxy.isSupported) {
                return (CharSequence) patchProxyResultProxy.result;
            }
            String name = ((BBSTopicObj) NewsTagListFragment.this.f91243c.get(i10)).getName();
            return (com.max.hbcache.c.e(((com.max.hbcommon.base.d) NewsTagListFragment.this).mContext).booleanValue() || !"推荐".equals(name)) ? name : "热门";
        }
    }

    public class e extends com.max.hbcommon.network.d<Result<NewsFavourResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42510, new Class[0], Void.TYPE).isSupported && NewsTagListFragment.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 42509, new Class[]{Throwable.class}, Void.TYPE).isSupported && NewsTagListFragment.this.isActive()) {
                super.onError(th2);
                NewsTagListFragment.Q3(NewsTagListFragment.this);
            }
        }

        public void onNext(Result<NewsFavourResultObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 42511, new Class[]{Result.class}, Void.TYPE).isSupported && NewsTagListFragment.this.isActive()) {
                super.onNext(result);
                List<BBSTopicCategoryObj> options = result.getResult() != null ? result.getResult().getOptions() : null;
                BBSTopicCategoryObj bBSTopicCategoryObj = (options == null || options.size() <= 0) ? null : options.get(0);
                NewsTagListFragment.R3(NewsTagListFragment.this, bBSTopicCategoryObj != null ? bBSTopicCategoryObj.getChildren() : null);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 42512, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<NewsFavourResultObj>) obj);
        }
    }

    static /* synthetic */ void Q3(NewsTagListFragment newsTagListFragment) {
        if (PatchProxy.proxy(new Object[]{newsTagListFragment}, null, changeQuickRedirect, true, 42501, new Class[]{NewsTagListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        newsTagListFragment.showError();
    }

    static /* synthetic */ void R3(NewsTagListFragment newsTagListFragment, List list) {
        if (PatchProxy.proxy(new Object[]{newsTagListFragment, list}, null, changeQuickRedirect, true, 42502, new Class[]{NewsTagListFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        newsTagListFragment.U3(list);
    }

    private void S3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42494, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) i.a().C(ChannelsNewsFragment.F4(), ChannelsNewsFragment.G4(), "/home/recommend").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    public static NewsTagListFragment T3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 42490, new Class[0], NewsTagListFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (NewsTagListFragment) patchProxyResultProxy.result;
        }
        NewsTagListFragment newsTagListFragment = new NewsTagListFragment();
        newsTagListFragment.setArguments(new Bundle());
        return newsTagListFragment;
    }

    private void U3(List<BBSTopicObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 42495, new Class[]{List.class}, Void.TYPE).isSupported || list == null) {
            return;
        }
        this.f91243c.clear();
        this.f91243c.addAll(list);
        this.f91244d.notifyDataSetChanged();
        this.tabNewsTag.setupWithViewPager(this.vpNewsTag);
        showContentView();
        this.vpNewsTag.setCurrentItem(this.f91245e, false);
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
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42498, new Class[0], Void.TYPE).isSupported && isActive() && this.vpNewsTag.getCurrentItem() < this.f91243c.size()) {
            androidx.viewpager.widget.a aVar = this.f91244d;
            ViewPager viewPager = this.vpNewsTag;
            Object objInstantiateItem = aVar.instantiateItem((ViewGroup) viewPager, viewPager.getCurrentItem());
            if (objInstantiateItem instanceof com.max.xiaoheihe.view.callback.a) {
                ((com.max.xiaoheihe.view.callback.a) objInstantiateItem).D3();
            }
        }
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42492, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.fragment_news_tag_list);
        this.mUnBinder = ButterKnife.f(this, view);
        if (i0.s()) {
            int iQ = n.q(com.max.hbcache.c.j("news_tab_show_count")) + 1;
            com.max.hbcache.c.z("news_tab_show_count", iQ + "");
            com.max.hbcommon.utils.d.b("zzzzzzzz", "count==" + iQ);
            if (iQ == 50 || iQ == 500) {
                new com.max.hbcommon.view.a.f(this.mContext).y("给我们打个分吧").l("占用您两分钟时间，来给我们打个分吧").u("五星好评", new b()).o("我要吐槽", new a()).w(true).g(false).F();
            }
        }
        this.vg_setting.setVisibility(0);
        this.v_divider.setVisibility(0);
        this.vg_setting.setOnClickListener(new c());
        this.f91242b = new NewMsgBroadcastReceiver(this, null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(lb.a.E);
        intentFilter.addAction(lb.a.f131031r);
        intentFilter.addAction(lb.a.f131037s);
        intentFilter.addAction("com.max.xiaoheihe.news.gotop");
        registerReceiver(this.f91242b, intentFilter);
        d dVar = new d(getChildFragmentManager());
        this.f91244d = dVar;
        this.vpNewsTag.setAdapter(dVar);
        new OneTimeValidExposureViewWatcher(this, this.tabNewsTag);
        showLoading();
        S3();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onCreate(@p0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 42491, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        if (bundle != null) {
            this.f91245e = bundle.getInt(f91236f, 0);
        } else {
            this.f91245e = 0;
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42499, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (ad.a.d()) {
            this.f91244d = null;
            this.tabNewsTag = null;
            this.vpNewsTag = null;
            this.vg_setting = null;
            this.v_divider = null;
            this.iv_setting_point = null;
            this.f91242b = null;
        }
        this.f91243c.clear();
        super.onDestroy();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42493, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroyView();
        unregisterReceiver(this.f91242b);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 42497, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.onHiddenChanged(z10);
        if (z10) {
            return;
        }
        String strO = com.max.hbcache.c.o("news_refresh_time", "");
        if (System.currentTimeMillis() - (!TextUtils.isEmpty(strO) ? Long.parseLong(strO) : 0L) >= 180000) {
            D3();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42496, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        S3();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@androidx.annotation.n0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 42500, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        bundle.putInt(f91236f, this.vpNewsTag.getCurrentItem());
        super.onSaveInstanceState(bundle);
    }
}
