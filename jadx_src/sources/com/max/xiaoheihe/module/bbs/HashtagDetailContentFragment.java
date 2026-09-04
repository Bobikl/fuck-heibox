package com.max.xiaoheihe.module.bbs;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.bean.AdsBannerObj;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.video.AbsVideoView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.HashtagLinkListResultObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.b2;

/* JADX INFO: loaded from: classes10.dex */
public class HashtagDetailContentFragment extends com.max.hbcommon.base.d implements com.max.xiaoheihe.module.news.adapter.a.b {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static String f79883t = "arg_count";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static String f79884u = "arg_layout_type";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static String f79885v = "arg_hash_id";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static String f79886w = "arg_hashtag_name";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static String f79887x = "arg_sortfilter";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f79888y = "quick_from";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f79889z = "extra_params";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f79890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f79891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f79892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f79893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f79894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f79895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f79896h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f79897i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f79898j;

    @BindView(R.id.banner)
    BannerViewPager<AdsBannerObj> mBanner;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private RecyclerView.Adapter f79903o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.t f79904p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private e f79905q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.max.xiaoheihe.module.video.b f79906r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private i f79907s;

    @BindView(R.id.v_space_waterfall)
    View vSpaceWaterfall;

    @BindView(R.id.v_waterfall_bg)
    View vWaterfallBg;

    @BindView(R.id.v_waterfall_bg_top)
    View vWaterfallBgTop;

    @BindView(R.id.vg_banner)
    View vgBanner;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f79899k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<BBSLinkObj> f79900l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<FeedsContentBaseObj> f79901m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<AbsVideoView> f79902n = new ArrayList();

    public class a extends com.max.hbcommon.network.d<Result<HashtagLinkListResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            SmartRefreshLayout smartRefreshLayout;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26533, new Class[0], Void.TYPE).isSupported || !HashtagDetailContentFragment.this.isActive() || (smartRefreshLayout = HashtagDetailContentFragment.this.mRefreshLayout) == null) {
                return;
            }
            smartRefreshLayout.A(0);
            HashtagDetailContentFragment.this.mRefreshLayout.p(0);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 26532, new Class[]{Throwable.class}, Void.TYPE).isSupported && HashtagDetailContentFragment.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = HashtagDetailContentFragment.this.mRefreshLayout;
                if (smartRefreshLayout != null) {
                    smartRefreshLayout.A(0);
                    HashtagDetailContentFragment.this.mRefreshLayout.p(0);
                }
                super.onError(th2);
                HashtagDetailContentFragment.O3(HashtagDetailContentFragment.this);
                th2.printStackTrace();
            }
        }

        public void onNext(Result<HashtagLinkListResultObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 26534, new Class[]{Result.class}, Void.TYPE).isSupported && HashtagDetailContentFragment.this.isActive()) {
                if (result != null) {
                    HashtagDetailContentFragment.P3(HashtagDetailContentFragment.this, result.getResult());
                } else {
                    HashtagDetailContentFragment.Q3(HashtagDetailContentFragment.this);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26535, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<HashtagLinkListResultObj>) obj);
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
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 26536, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            if (HashtagDetailContentFragment.this.f79903o instanceof com.max.xiaoheihe.module.news.adapter.a) {
                ((com.max.xiaoheihe.module.news.adapter.a) HashtagDetailContentFragment.this.f79903o).q(recyclerView, i10, i11);
            }
            if (Math.abs(i11) > HashtagDetailContentFragment.this.f79898j) {
                if (i11 > 0) {
                    HashtagDetailContentFragment.this.f79905q.t(false);
                } else {
                    HashtagDetailContentFragment.this.f79905q.t(true);
                }
            }
        }
    }

    public class c extends com.max.hbcommon.base.adapter.s<BBSLinkObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements com.max.xiaoheihe.module.bbs.utils.b.y {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.xiaoheihe.module.bbs.utils.b.y
            public void a(com.max.hbcommon.base.adapter.s.e eVar, BBSLinkObj bBSLinkObj) {
            }
        }

        c(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, BBSLinkObj bBSLinkObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSLinkObj}, this, changeQuickRedirect, false, 26537, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkObj.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.bbs.utils.b.N(eVar, bBSLinkObj, com.max.xiaoheihe.module.bbs.utils.b.f83401f, 0, null, null, true);
            ((BBSUserSectionView) eVar.i(R.id.vg_title)).setDesc(com.max.xiaoheihe.module.bbs.utils.b.t(((com.max.hbcommon.base.d) HashtagDetailContentFragment.this).mContext, bBSLinkObj));
            ViewGroup viewGroup = (ViewGroup) eVar.i(R.id.ll_origin_post);
            viewGroup.setVisibility(8);
            if (bBSLinkObj.getForward() != null) {
                View viewInflate = this.mInflater.inflate(R.layout.item_forward_post, (ViewGroup) eVar.b(), false);
                com.max.xiaoheihe.module.bbs.utils.b.P(((com.max.hbcommon.base.d) HashtagDetailContentFragment.this).mContext, viewInflate, bBSLinkObj.getForward(), com.max.xiaoheihe.module.bbs.utils.b.f83401f, 0, null, new a());
                viewGroup.removeAllViews();
                viewGroup.setVisibility(0);
                viewGroup.addView(viewInflate);
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, BBSLinkObj bBSLinkObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSLinkObj}, this, changeQuickRedirect, false, 26538, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, bBSLinkObj);
        }
    }

    public class d extends com.max.xiaoheihe.module.news.adapter.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26541, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                HashtagDetailContentFragment.this.mRecyclerView.scrollToPosition(0);
                HashtagDetailContentFragment.this.mRefreshLayout.F();
            }
        }

        d(Context context, List list, com.max.xiaoheihe.module.news.adapter.a.b bVar) {
            super(context, list, bVar);
        }

        @Override // com.max.xiaoheihe.module.news.adapter.a, com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 26540, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            p(eVar, (FeedsContentBaseObj) obj);
        }

        @Override // com.max.xiaoheihe.module.news.adapter.a
        public void p(com.max.hbcommon.base.adapter.s.e eVar, FeedsContentBaseObj feedsContentBaseObj) {
            if (PatchProxy.proxy(new Object[]{eVar, feedsContentBaseObj}, this, changeQuickRedirect, false, 26539, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
                return;
            }
            super.p(eVar, feedsContentBaseObj);
            if (eVar.d() == R.layout.item_concept_update) {
                eVar.i(R.id.vg_update).setOnClickListener(new a());
                return;
            }
            if (eVar.d() == R.layout.item_concept_feeds_mobile_video) {
                AbsVideoView absVideoView = (AbsVideoView) eVar.i(R.id.video_view);
                if (HashtagDetailContentFragment.this.f79902n.contains(absVideoView)) {
                    return;
                }
                HashtagDetailContentFragment.this.f79902n.add(absVideoView);
            }
        }
    }

    public interface e {
        void r0();

        void t(boolean z10);
    }

    static /* synthetic */ void O3(HashtagDetailContentFragment hashtagDetailContentFragment) {
        if (PatchProxy.proxy(new Object[]{hashtagDetailContentFragment}, null, changeQuickRedirect, true, 26529, new Class[]{HashtagDetailContentFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        hashtagDetailContentFragment.showError();
    }

    static /* synthetic */ void P3(HashtagDetailContentFragment hashtagDetailContentFragment, HashtagLinkListResultObj hashtagLinkListResultObj) {
        if (PatchProxy.proxy(new Object[]{hashtagDetailContentFragment, hashtagLinkListResultObj}, null, changeQuickRedirect, true, 26530, new Class[]{HashtagDetailContentFragment.class, HashtagLinkListResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        hashtagDetailContentFragment.h4(hashtagLinkListResultObj);
    }

    static /* synthetic */ void Q3(HashtagDetailContentFragment hashtagDetailContentFragment) {
        if (PatchProxy.proxy(new Object[]{hashtagDetailContentFragment}, null, changeQuickRedirect, true, 26531, new Class[]{HashtagDetailContentFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        hashtagDetailContentFragment.showError();
    }

    @androidx.annotation.n0
    private com.max.xiaoheihe.module.bbs.adapter.z<BBSLinkObj> X3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26522, new Class[0], com.max.xiaoheihe.module.bbs.adapter.z.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.xiaoheihe.module.bbs.adapter.z) patchProxyResultProxy.result;
        }
        com.max.xiaoheihe.module.bbs.adapter.z<BBSLinkObj> zVar = new com.max.xiaoheihe.module.bbs.adapter.z<>(this.mContext, this.f79900l, this.mRecyclerView);
        zVar.v(R.layout.item_waterfall_hashtag_detal_link);
        zVar.w(new yh.l() { // from class: com.max.xiaoheihe.module.bbs.x
            @Override // yh.l
            public final Object invoke(Object obj) {
                return this.f83505b.c4((Integer) obj);
            }
        });
        return zVar;
    }

    @SuppressLint({"AutoDispose"})
    private void Y3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26517, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().ka(this.f79890b, this.f79891c, this.f79893e, this.f79895g, this.f79897i, 30, this.f79892d, g4(), 0).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a()));
    }

    private void Z3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26521, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f79896h == 3) {
            com.max.xiaoheihe.module.bbs.utils.b.V(this.mContext, this.mRecyclerView, ViewUtils.f(this.mContext, 4.5f), ViewUtils.f(this.mContext, 9.0f), ViewUtils.f(this.mContext, 12.0f));
        } else {
            this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
            this.mRecyclerView.setBackgroundResource(R.color.background_layer_2_color);
        }
        this.mRecyclerView.clearOnScrollListeners();
        this.mRecyclerView.addOnScrollListener(new b());
        int i10 = this.f79896h;
        if (i10 == 3) {
            this.f79903o = X3();
        } else if (i10 == 1) {
            this.f79903o = new c(this.mContext, this.f79900l, R.layout.item_channels_link);
        } else {
            Iterator<BBSLinkObj> it = this.f79900l.iterator();
            while (it.hasNext()) {
                this.f79901m.add(it.next());
            }
            this.f79903o = new d(this.mContext, this.f79901m, this);
        }
        this.mRecyclerView.setAdapter(this.f79903o);
        this.f79907s = new i(this, this.mRecyclerView, BBSLinkObj.class);
    }

    private void a4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26520, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SmartRefreshLayout smartRefreshLayout = this.mRefreshLayout;
        if (smartRefreshLayout == null) {
            com.max.hbcommon.utils.d.b("cqtest", "mRefreshLayout is null");
        } else {
            smartRefreshLayout.S(new pg.d() { // from class: com.max.xiaoheihe.module.bbs.v
                @Override // pg.d
                public final void k(ng.j jVar) {
                    this.f83499b.d4(jVar);
                }
            });
            this.mRefreshLayout.f0(new pg.b() { // from class: com.max.xiaoheihe.module.bbs.w
                @Override // pg.b
                public final void f(ng.j jVar) {
                    this.f83500b.e4(jVar);
                }
            });
        }
    }

    private void b4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26523, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f79896h != 3) {
            this.vWaterfallBgTop.setVisibility(8);
            this.vWaterfallBg.setVisibility(8);
            this.vSpaceWaterfall.setVisibility(8);
        } else {
            this.vWaterfallBgTop.setBackground(ViewUtils.w(0, this.mContext.getColor(R.color.background_layer_2_color), this.mContext.getColor(R.color.background_card_1_color), GradientDrawable.Orientation.TOP_BOTTOM));
            this.vWaterfallBgTop.setVisibility(0);
            this.vWaterfallBg.setVisibility(0);
            this.vSpaceWaterfall.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ b2 c4(Integer num) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 26526, new Class[]{Integer.class}, b2.class);
        if (patchProxyResultProxy.isSupported) {
            return (b2) patchProxyResultProxy.result;
        }
        if (num.intValue() == R.id.vg_like) {
            Activity activity = this.mContext;
            if (activity instanceof HashtagDetailActivity) {
                com.max.hbcommon.analytics.d.d("4", lb.d.S1, null, ((HashtagDetailActivity) activity).A2());
            }
        }
        return b2.f124493a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d4(ng.j jVar) {
        if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 26528, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f79897i = 0;
        this.f79895g = null;
        Y3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e4(ng.j jVar) {
        if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 26527, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f79897i += 30;
        Y3();
    }

    public static HashtagDetailContentFragment f4(int i10, String str, String str2, String str3, int i11, String str4, String str5) {
        Object[] objArr = {new Integer(i10), str, str2, str3, new Integer(i11), str4, str5};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 26511, new Class[]{cls, String.class, String.class, String.class, cls, String.class, String.class}, HashtagDetailContentFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (HashtagDetailContentFragment) patchProxyResultProxy.result;
        }
        HashtagDetailContentFragment hashtagDetailContentFragment = new HashtagDetailContentFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(f79884u, i10);
        bundle.putInt(f79883t, i11);
        bundle.putString(f79885v, str);
        bundle.putString(f79886w, str2);
        bundle.putString(f79887x, str3);
        bundle.putString("quick_from", str4);
        bundle.putString("extra_params", str5);
        hashtagDetailContentFragment.setArguments(bundle);
        return hashtagDetailContentFragment;
    }

    private Map<String, String> g4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26518, new Class[0], Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        HashMap map = new HashMap();
        String str = this.f79894f;
        if (str != null && !str.isEmpty()) {
            try {
                HashMap map2 = (HashMap) com.max.hbutils.utils.k.a(this.f79894f, HashMap.class);
                if (map2 == null) {
                    return map;
                }
                for (Map.Entry entry : map2.entrySet()) {
                    if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                        map.put(entry.getKey().toString(), entry.getValue().toString());
                    }
                }
            } catch (Exception e10) {
                com.max.heybox.hblog.g.G("[HashtagDetailActivity#retrieveExtraParam] json resolve fail, cause: " + e10);
            }
        }
        return map;
    }

    private void h4(HashtagLinkListResultObj hashtagLinkListResultObj) {
        if (PatchProxy.proxy(new Object[]{hashtagLinkListResultObj}, this, changeQuickRedirect, false, 26519, new Class[]{HashtagLinkListResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f79899k = true;
        showContentView();
        this.f79895g = hashtagLinkListResultObj.getLastval();
        if (this.f79897i == 0) {
            if (com.max.hbcommon.utils.c.w(hashtagLinkListResultObj.getAds_banner())) {
                this.vgBanner.setVisibility(8);
            } else {
                this.vgBanner.setVisibility(0);
                com.max.hbcommon.utils.b.h(this.mBanner, hashtagLinkListResultObj.getAds_banner(), ViewUtils.L(this.mContext) - ViewUtils.f(this.mContext, 24.0f), 4.0f, 12.0f, false);
            }
        }
        RecyclerView.Adapter adapter = this.f79903o;
        if (adapter instanceof com.max.xiaoheihe.module.news.adapter.a) {
            List<FeedsContentBaseObj> list = this.f79901m;
            if (list != null && this.f79900l != null) {
                if (this.f79897i == 0) {
                    list.clear();
                }
                if (!com.max.hbcommon.utils.c.w(hashtagLinkListResultObj.getLinks())) {
                    Iterator<FeedsContentBaseObj> it = hashtagLinkListResultObj.getLinks().iterator();
                    while (it.hasNext()) {
                        this.f79901m.add(it.next());
                    }
                }
                this.f79903o.notifyDataSetChanged();
            }
        } else if (adapter instanceof com.max.xiaoheihe.module.bbs.adapter.z) {
            List<BBSLinkObj> list2 = this.f79900l;
            if (list2 != null) {
                if (this.f79897i == 0) {
                    int size = list2.size();
                    this.f79900l.clear();
                    this.f79903o.notifyItemRangeRemoved(0, size);
                }
                if (!com.max.hbcommon.utils.c.w(hashtagLinkListResultObj.getLinks())) {
                    int size2 = this.f79900l.size();
                    for (FeedsContentBaseObj feedsContentBaseObj : hashtagLinkListResultObj.getLinks()) {
                        if (feedsContentBaseObj instanceof BBSLinkObj) {
                            this.f79900l.add((BBSLinkObj) feedsContentBaseObj);
                        }
                    }
                    this.f79903o.notifyItemRangeInserted(size2, hashtagLinkListResultObj.getLinks().size());
                }
            }
        } else {
            List<BBSLinkObj> list3 = this.f79900l;
            if (list3 != null) {
                if (this.f79897i == 0) {
                    list3.clear();
                }
                if (!com.max.hbcommon.utils.c.w(hashtagLinkListResultObj.getLinks())) {
                    for (FeedsContentBaseObj feedsContentBaseObj2 : hashtagLinkListResultObj.getLinks()) {
                        if (feedsContentBaseObj2 instanceof BBSLinkObj) {
                            this.f79900l.add((BBSLinkObj) feedsContentBaseObj2);
                        }
                    }
                }
                this.f79903o.notifyDataSetChanged();
            }
        }
        if (getArguments().getInt(f79883t) == 0) {
            this.f79905q.r0();
        }
    }

    private void i4(ViewGroup viewGroup, AbsVideoView absVideoView, boolean z10) {
        if (PatchProxy.proxy(new Object[]{viewGroup, absVideoView, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 26524, new Class[]{ViewGroup.class, AbsVideoView.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            com.max.xiaoheihe.module.video.b bVar = this.f79906r;
            if (bVar != null) {
                bVar.c(absVideoView, viewGroup);
                return;
            }
            return;
        }
        com.max.xiaoheihe.module.video.b bVar2 = this.f79906r;
        if (bVar2 != null) {
            bVar2.e();
        }
    }

    @Override // com.max.xiaoheihe.module.news.adapter.a.b
    public void B3(int i10) {
    }

    @Override // com.max.xiaoheihe.module.news.adapter.a.b
    public void G2(int i10) {
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        HashtagLinkListResultObj hashtagLinkListResultObjV2;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26513, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_hashtag_content);
        this.mUnBinder = ButterKnife.f(this, view);
        if (getArguments() == null) {
            showError();
            return;
        }
        this.f79896h = getArguments().getInt(f79884u);
        this.f79890b = getArguments().getString(f79885v);
        this.f79891c = getArguments().getString(f79886w);
        this.f79893e = getArguments().getString(f79887x);
        this.f79892d = getArguments().getString("quick_from");
        this.f79894f = getArguments().getString("extra_params");
        this.f79898j = ViewConfiguration.get(this.mContext).getScaledTouchSlop();
        a4();
        Z3();
        b4();
        if (getArguments().getInt(f79883t) == 0) {
            Activity activity = this.mContext;
            if (!(activity instanceof HashtagDetailActivity) || (hashtagLinkListResultObjV2 = ((HashtagDetailActivity) activity).v2()) == null || hashtagLinkListResultObjV2.getHashtag() == null) {
                return;
            }
            h4(hashtagLinkListResultObjV2);
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 26512, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onAttach(context);
        this.f79905q = (e) getActivity();
        if (getParentFragment() instanceof com.max.xiaoheihe.module.video.b) {
            this.f79906r = (com.max.xiaoheihe.module.video.b) getParentFragment();
            return;
        }
        if (context instanceof com.max.xiaoheihe.module.video.b) {
            this.f79906r = (com.max.xiaoheihe.module.video.b) context;
            return;
        }
        throw new RuntimeException(getParentFragment() + " or " + context + " must implement NewsListInteractionListener");
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26516, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f79902n.size() > 0) {
            Iterator<AbsVideoView> it = this.f79902n.iterator();
            while (it.hasNext()) {
                it.next().Q();
            }
            this.f79902n.clear();
        }
        super.onDestroyView();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26515, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetach();
        this.f79906r = null;
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26514, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        Y3();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 26525, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.setUserVisibleHint(z10);
        if (!isActive() || this.f79899k || !this.mIsVisible || getArguments() == null || getArguments().getInt(f79883t) == 0) {
            return;
        }
        showLoading();
        Y3();
    }
}
