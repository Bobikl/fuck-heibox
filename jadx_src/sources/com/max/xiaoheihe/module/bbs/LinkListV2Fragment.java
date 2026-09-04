package com.max.xiaoheihe.module.bbs;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.base.adapter.OneTimeValidExposureWatcher;
import com.max.hbcommon.bean.AdsBannerObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkListHeaderObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkListResultObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicBannerResult;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class LinkListV2Fragment extends com.max.hbcommon.base.d implements com.max.xiaoheihe.view.callback.a {
    public static final String A = "game_reviews_posts";
    public static final String B = "swipe_post";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f79971s = "h_src";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f79972t = "page_type";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f79973u = "topic_id";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f79974v = "type_filter";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f79975w = "sort_filter";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f79976x = "default_post";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f79977y = "followed_topic_post";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f79978z = "hot_topic_post";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f79979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f79980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f79981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f79982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f79983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f79984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private j f79985h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private i f79987j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f79988k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f79989l;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    @BindView(R.id.iv_write_post)
    ImageView mWritePostImageView;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private BannerViewPager<AdsBannerObj> f79992o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f79993p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.max.xiaoheihe.utils.u f79994q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.max.xiaoheihe.module.bbs.i<j> f79995r;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<BBSLinkObj> f79986i = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<BBSLinkObj> f79990m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<BBSLinkObj> f79991n = new ArrayList();

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26689, new Class[]{View.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(((com.max.hbcommon.base.d) LinkListV2Fragment.this).mContext)) {
                if (com.max.hbcommon.utils.c.u(LinkListV2Fragment.this.f79981d)) {
                    s0.g4().show(LinkListV2Fragment.this.getFragmentManager(), "writeposttype");
                } else {
                    com.max.xiaoheihe.base.router.b.p(((com.max.hbcommon.base.d) LinkListV2Fragment.this).mContext, LinkListV2Fragment.this.f79981d, null).A();
                }
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
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 26690, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            if (LinkListV2Fragment.this.f79987j != null) {
                LinkListV2Fragment.this.f79987j.f(recyclerView, i10, i11);
            }
            if (Math.abs(i11) > LinkListV2Fragment.this.f79988k) {
                if (i11 > 0) {
                    LinkListV2Fragment.this.f79994q.d();
                } else {
                    LinkListV2Fragment.this.f79994q.i();
                }
            }
        }
    }

    public class c implements com.max.xiaoheihe.module.bbs.adapter.m.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.xiaoheihe.module.bbs.adapter.m.b
        public void a(BBSLinkObj bBSLinkObj) {
            if (PatchProxy.proxy(new Object[]{bBSLinkObj}, this, changeQuickRedirect, false, 26691, new Class[]{BBSLinkObj.class}, Void.TYPE).isSupported || LinkListV2Fragment.this.f79995r == null) {
                return;
            }
            LinkListV2Fragment.this.f79995r.q();
        }

        @Override // com.max.xiaoheihe.module.bbs.adapter.m.b
        public void b(BBSLinkObj bBSLinkObj) {
        }

        @Override // com.max.xiaoheihe.module.bbs.adapter.m.b
        public void c(BBSLinkObj bBSLinkObj, String str) {
        }

        @Override // com.max.xiaoheihe.module.bbs.adapter.m.b
        public void d(BBSLinkObj bBSLinkObj) {
        }
    }

    public class d implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 26692, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            LinkListV2Fragment.this.f79990m.clear();
            LinkListV2Fragment.this.f79993p = true;
            LinkListV2Fragment.k4(LinkListV2Fragment.this);
        }
    }

    public class e implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 26693, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            LinkListV2Fragment.N3(LinkListV2Fragment.this, 30);
            LinkListV2Fragment.O3(LinkListV2Fragment.this);
        }
    }

    public class f extends com.max.hbcommon.network.d<Result<BBSLinkListResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26698, new Class[0], Void.TYPE).isSupported || LinkListV2Fragment.this.f79995r == null) {
                    return;
                }
                LinkListV2Fragment.this.f79995r.q();
            }
        }

        f() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26694, new Class[0], Void.TYPE).isSupported && LinkListV2Fragment.this.isActive()) {
                super.onComplete();
                LinkListV2Fragment.this.mRefreshLayout.A(0);
                LinkListV2Fragment.this.mRefreshLayout.p(0);
                if (LinkListV2Fragment.this.f79993p) {
                    LinkListV2Fragment.this.f79993p = false;
                    LinkListV2Fragment.this.mRecyclerView.post(new a());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 26695, new Class[]{Throwable.class}, Void.TYPE).isSupported && LinkListV2Fragment.this.isActive()) {
                super.onError(th2);
                LinkListV2Fragment.P3(LinkListV2Fragment.this);
                LinkListV2Fragment.this.mRefreshLayout.A(0);
                LinkListV2Fragment.this.mRefreshLayout.p(0);
                LinkListV2Fragment.this.f79993p = false;
            }
        }

        public void onNext(Result<BBSLinkListResultObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 26696, new Class[]{Result.class}, Void.TYPE).isSupported && LinkListV2Fragment.this.isActive()) {
                super.onNext(result);
                if (LinkListV2Fragment.this.f79987j != null) {
                    LinkListV2Fragment.this.f79987j.W0(result.getResult());
                }
                LinkListV2Fragment.Q3(LinkListV2Fragment.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26697, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSLinkListResultObj>) obj);
        }
    }

    public class g extends com.max.hbcommon.network.d<Result<BBSTopicBannerResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        public void onNext(Result<BBSTopicBannerResult> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 26699, new Class[]{Result.class}, Void.TYPE).isSupported && LinkListV2Fragment.this.isActive()) {
                super.onNext(result);
                LinkListV2Fragment.R3(LinkListV2Fragment.this, result);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26700, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSTopicBannerResult>) obj);
        }
    }

    public class h implements HeyBoxPopupMenu.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f80004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f80005b;

        h(ArrayList arrayList, TextView textView) {
            this.f80004a = arrayList;
            this.f80005b = textView;
        }

        @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
        public void a(View view, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 26701, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            for (KeyDescObj keyDescObj2 : this.f80004a) {
                keyDescObj2.setChecked(keyDescObj.getKey().equals(keyDescObj2.getKey()));
            }
            LinkListV2Fragment.S3(LinkListV2Fragment.this, keyDescObj, this.f80005b);
            LinkListV2Fragment.this.s4(keyDescObj.getKey());
        }
    }

    public interface i {
        String N();

        void W0(BBSLinkListResultObj bBSLinkListResultObj);

        void f(View view, int i10, int i11);
    }

    public class j extends com.max.hbcommon.base.adapter.t {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements TabLayout.f {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f80008a;

            a(List list) {
                this.f80008a = list;
            }

            @Override // com.google.android.material.tabs.TabLayout.c
            public void a(TabLayout.h hVar) {
                if (PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, 26705, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
                    return;
                }
                LinkListV2Fragment.this.t4(((KeyDescObj) this.f80008a.get(hVar.k())).getKey());
            }

            @Override // com.google.android.material.tabs.TabLayout.c
            public void b(TabLayout.h hVar) {
            }

            @Override // com.google.android.material.tabs.TabLayout.c
            public void c(TabLayout.h hVar) {
            }
        }

        public class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TextView f80010b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f80011c;

            b(TextView textView, List list) {
                this.f80010b = textView;
                this.f80011c = list;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26706, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                LinkListV2Fragment.c4(LinkListV2Fragment.this, this.f80010b, this.f80011c);
            }
        }

        public j(com.max.hbcommon.base.adapter.s sVar) {
            super(sVar);
        }

        private void J(com.max.hbcommon.base.adapter.s.e eVar, BBSLinkListResultObj bBSLinkListResultObj) {
            TabLayout.h hVarD;
            if (PatchProxy.proxy(new Object[]{eVar, bBSLinkListResultObj}, this, changeQuickRedirect, false, 26704, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSLinkListResultObj.class}, Void.TYPE).isSupported) {
                return;
            }
            TabLayout tabLayout = (TabLayout) eVar.i(R.id.tl);
            TextView textView = (TextView) eVar.i(R.id.tv_filter_desc);
            View viewI = eVar.i(R.id.filter_desc_divider);
            List<KeyDescObj> type_filter = bBSLinkListResultObj.getType_filter();
            if (type_filter != null && type_filter.size() > 0) {
                tabLayout.t();
                tabLayout.L();
                int i10 = -1;
                for (int i11 = 0; i11 < type_filter.size(); i11++) {
                    KeyDescObj keyDescObj = type_filter.get(i11);
                    if (keyDescObj.getKey().equals(LinkListV2Fragment.this.f79982e)) {
                        i10 = i11;
                    }
                    tabLayout.i(tabLayout.I().D(keyDescObj.getText()));
                }
                if (i10 != -1 && (hVarD = tabLayout.D(i10)) != null) {
                    hVarD.r();
                }
                tabLayout.h(new a(type_filter));
            }
            List<KeyDescObj> sort_filter = bBSLinkListResultObj.getSort_filter();
            if (sort_filter == null || sort_filter.size() <= 0) {
                textView.setVisibility(8);
                viewI.setVisibility(8);
                return;
            }
            textView.setVisibility(0);
            viewI.setVisibility(0);
            KeyDescObj keyDescObj2 = null;
            if (com.max.hbcommon.utils.c.u(LinkListV2Fragment.this.f79983f)) {
                keyDescObj2 = sort_filter.get(0);
                keyDescObj2.setChecked(true);
            } else {
                for (KeyDescObj keyDescObj3 : sort_filter) {
                    if (LinkListV2Fragment.this.f79983f.equals(keyDescObj3.getKey())) {
                        keyDescObj3.setChecked(true);
                        keyDescObj2 = keyDescObj3;
                    } else {
                        keyDescObj3.setChecked(false);
                    }
                }
            }
            if (keyDescObj2 != null) {
                LinkListV2Fragment.S3(LinkListV2Fragment.this, keyDescObj2, textView);
            }
            textView.setOnClickListener(new b(textView, sort_filter));
        }

        private void K(com.max.hbcommon.base.adapter.s.e eVar, BBSTopicBannerResult bBSTopicBannerResult) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSTopicBannerResult}, this, changeQuickRedirect, false, 26703, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSTopicBannerResult.class}, Void.TYPE).isSupported) {
                return;
            }
            LinkListV2Fragment.this.f79992o = (BannerViewPager) eVar.i(R.id.banner);
            RecyclerView recyclerView = (RecyclerView) eVar.i(R.id.rv_topic);
            recyclerView.setLayoutManager(new LinearLayoutManager(((com.max.hbcommon.base.d) LinkListV2Fragment.this).mContext, 0, false));
            recyclerView.setPadding(ViewUtils.f(((com.max.hbcommon.base.d) LinkListV2Fragment.this).mContext, 1.0f), 0, ViewUtils.f(((com.max.hbcommon.base.d) LinkListV2Fragment.this).mContext, 1.0f), 0);
            recyclerView.setClipToPadding(false);
            List arrayList = new ArrayList();
            BBSLinkListHeaderObj topic_banner = bBSTopicBannerResult.getTopic_banner();
            if (topic_banner == null || (com.max.hbcommon.utils.c.w(topic_banner.getTopics()) && com.max.hbcommon.utils.c.w(topic_banner.getSubscribed_topics()))) {
                recyclerView.setVisibility(8);
            } else {
                if (!com.max.hbcommon.utils.c.w(topic_banner.getSubscribed_topics())) {
                    arrayList.addAll(topic_banner.getSubscribed_topics());
                }
                if (!com.max.hbcommon.utils.c.w(topic_banner.getTopics())) {
                    arrayList.addAll(topic_banner.getTopics());
                }
                if (arrayList.size() > 8) {
                    arrayList = arrayList.subList(0, 8);
                }
                BBSTopicObj bBSTopicObj = new BBSTopicObj();
                bBSTopicObj.setVirtual_topic_tag(BBSTopicObj.VIRTUAL_TAG_MORE);
                arrayList.add(bBSTopicObj);
                recyclerView.setAdapter(new com.max.xiaoheihe.module.news.adapter.c(((com.max.hbcommon.base.d) LinkListV2Fragment.this).mContext, arrayList, null));
                recyclerView.setVisibility(0);
            }
            com.max.hbcommon.utils.b.f(LinkListV2Fragment.this.f79992o, bBSTopicBannerResult.getAds_banner());
        }

        @Override // com.max.hbcommon.base.adapter.t
        public void C(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 26702, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            if (eVar.d() == R.layout.item_concept_feeds_header) {
                K(eVar, (BBSTopicBannerResult) obj);
            } else if (eVar.d() == R.layout.item_tab_and_filter_desc) {
                J(eVar, (BBSLinkListResultObj) obj);
            }
        }
    }

    static /* synthetic */ int N3(LinkListV2Fragment linkListV2Fragment, int i10) {
        int i11 = linkListV2Fragment.f79984g + i10;
        linkListV2Fragment.f79984g = i11;
        return i11;
    }

    static /* synthetic */ void O3(LinkListV2Fragment linkListV2Fragment) {
        if (PatchProxy.proxy(new Object[]{linkListV2Fragment}, null, changeQuickRedirect, true, 26683, new Class[]{LinkListV2Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        linkListV2Fragment.l4();
    }

    static /* synthetic */ void P3(LinkListV2Fragment linkListV2Fragment) {
        if (PatchProxy.proxy(new Object[]{linkListV2Fragment}, null, changeQuickRedirect, true, 26684, new Class[]{LinkListV2Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        linkListV2Fragment.showError();
    }

    static /* synthetic */ void Q3(LinkListV2Fragment linkListV2Fragment, BBSLinkListResultObj bBSLinkListResultObj) {
        if (PatchProxy.proxy(new Object[]{linkListV2Fragment, bBSLinkListResultObj}, null, changeQuickRedirect, true, 26685, new Class[]{LinkListV2Fragment.class, BBSLinkListResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        linkListV2Fragment.p4(bBSLinkListResultObj);
    }

    static /* synthetic */ void R3(LinkListV2Fragment linkListV2Fragment, Result result) {
        if (PatchProxy.proxy(new Object[]{linkListV2Fragment, result}, null, changeQuickRedirect, true, 26686, new Class[]{LinkListV2Fragment.class, Result.class}, Void.TYPE).isSupported) {
            return;
        }
        linkListV2Fragment.q4(result);
    }

    static /* synthetic */ void S3(LinkListV2Fragment linkListV2Fragment, KeyDescObj keyDescObj, TextView textView) {
        if (PatchProxy.proxy(new Object[]{linkListV2Fragment, keyDescObj, textView}, null, changeQuickRedirect, true, 26687, new Class[]{LinkListV2Fragment.class, KeyDescObj.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        linkListV2Fragment.u4(keyDescObj, textView);
    }

    static /* synthetic */ void c4(LinkListV2Fragment linkListV2Fragment, TextView textView, List list) {
        if (PatchProxy.proxy(new Object[]{linkListV2Fragment, textView, list}, null, changeQuickRedirect, true, 26688, new Class[]{LinkListV2Fragment.class, TextView.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        linkListV2Fragment.w4(textView, list);
    }

    static /* synthetic */ void k4(LinkListV2Fragment linkListV2Fragment) {
        if (PatchProxy.proxy(new Object[]{linkListV2Fragment}, null, changeQuickRedirect, true, 26682, new Class[]{LinkListV2Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        linkListV2Fragment.r4();
    }

    private void l4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26668, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().B4(this.f79979b, this.f79984g, 30, null, this.f79981d, this.f79982e, this.f79983f).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    private void m4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26669, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().u4().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g()));
    }

    public static LinkListV2Fragment n4(String str, String str2, String str3, String str4, String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, null, changeQuickRedirect, true, 26661, new Class[]{String.class, String.class, String.class, String.class, String.class}, LinkListV2Fragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinkListV2Fragment) patchProxyResultProxy.result;
        }
        LinkListV2Fragment linkListV2Fragment = new LinkListV2Fragment();
        Bundle bundle = new Bundle();
        bundle.putString("h_src", str);
        bundle.putString("page_type", str2);
        bundle.putString("topic_id", str3);
        bundle.putString(f79974v, str4);
        bundle.putString(f79975w, str5);
        linkListV2Fragment.setArguments(bundle);
        return linkListV2Fragment;
    }

    private void p4(BBSLinkListResultObj bBSLinkListResultObj) {
        if (PatchProxy.proxy(new Object[]{bBSLinkListResultObj}, this, changeQuickRedirect, false, 26670, new Class[]{BBSLinkListResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (bBSLinkListResultObj != null) {
            if (this.f79984g == 0) {
                if (f79976x.equals(this.f79980c)) {
                    if (bBSLinkListResultObj.getType_filter() == null || bBSLinkListResultObj.getType_filter().size() <= 0) {
                        this.f79985h.F(R.layout.item_tab_and_filter_desc);
                    } else if (!this.f79985h.H(R.layout.item_tab_and_filter_desc, bBSLinkListResultObj)) {
                        this.f79985h.q(R.layout.item_tab_and_filter_desc, this.mInflater.inflate(R.layout.item_tab_and_filter_desc, (ViewGroup) this.mRecyclerView, false), bBSLinkListResultObj);
                    }
                }
                this.f79986i.clear();
            }
            List<BBSLinkObj> links = bBSLinkListResultObj.getLinks();
            if (links != null) {
                for (BBSLinkObj bBSLinkObj : links) {
                    if (f79976x.equals(this.f79980c)) {
                        bBSLinkObj.setFrom("2");
                    } else if (f79977y.equals(this.f79980c)) {
                        bBSLinkObj.setFrom("4");
                    } else if (f79978z.equals(this.f79980c)) {
                        bBSLinkObj.setFrom("5");
                    }
                    if (!this.f79986i.contains(bBSLinkObj)) {
                        this.f79986i.add(bBSLinkObj);
                    }
                }
            }
            if (!com.max.hbcommon.utils.c.w(this.f79986i)) {
                this.f79985h.E(R.layout.empty_view);
            } else if (!this.f79985h.G(R.layout.empty_view, bBSLinkListResultObj)) {
                View viewInflate = this.mInflater.inflate(R.layout.empty_view, (ViewGroup) this.mRecyclerView, false);
                ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_empty);
                ((TextView) viewInflate.findViewById(R.id.tv_empty)).setText(com.max.xiaoheihe.utils.d.n0(R.string.no_post));
                imageView.setImageResource(R.drawable.common_tag_post_46x45);
                this.f79985h.n(R.layout.empty_view, viewInflate, bBSLinkListResultObj);
            }
            this.f79985h.notifyDataSetChanged();
        }
        showContentView();
    }

    private void q4(Result<BBSTopicBannerResult> result) {
        if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 26671, new Class[]{Result.class}, Void.TYPE).isSupported || result == null) {
            return;
        }
        BBSTopicBannerResult result2 = result.getResult();
        boolean z10 = (result2 == null || (com.max.hbcommon.utils.c.w(result2.getAds_banner()) && (result2.getTopic_banner() == null || (com.max.hbcommon.utils.c.w(result2.getTopic_banner().getTopics()) && com.max.hbcommon.utils.c.w(result2.getTopic_banner().getSubscribed_topics()))))) ? false : true;
        View viewInflate = this.mInflater.inflate(R.layout.item_concept_feeds_header, (ViewGroup) this.mRecyclerView, false);
        viewInflate.setFocusable(true);
        viewInflate.setFocusableInTouchMode(true);
        if (!z10) {
            this.f79985h.F(R.layout.item_concept_feeds_header);
            this.f79985h.notifyDataSetChanged();
        } else if (this.f79985h.H(R.layout.item_concept_feeds_header, result2)) {
            this.f79985h.notifyDataSetChanged();
        } else {
            this.f79985h.r(R.layout.item_concept_feeds_header, viewInflate, result2, 0);
            this.f79985h.notifyItemInserted(0);
        }
    }

    private void r4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26667, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f79984g = 0;
        if (!f79976x.equals(this.f79980c)) {
            l4();
        } else {
            m4();
            l4();
        }
    }

    private void u4(KeyDescObj keyDescObj, TextView textView) {
        if (PatchProxy.proxy(new Object[]{keyDescObj, textView}, this, changeQuickRedirect, false, 26672, new Class[]{KeyDescObj.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        bb.d.d(textView, 0);
        textView.setText(String.format("%s %s", keyDescObj.getText(), lb.b.f131094j));
    }

    private void w4(TextView textView, List<KeyDescObj> list) {
        if (PatchProxy.proxy(new Object[]{textView, list}, this, changeQuickRedirect, false, 26673, new Class[]{TextView.class, List.class}, Void.TYPE).isSupported || this.mContext.isFinishing() || list == null || list.size() <= 0) {
            return;
        }
        ArrayList<KeyDescObj> arrayList = new ArrayList(list);
        for (KeyDescObj keyDescObj : arrayList) {
            String str = this.f79983f;
            keyDescObj.setChecked(str != null && str.equals(keyDescObj.getKey()));
            keyDescObj.setDesc(keyDescObj.getText());
        }
        if (this.f79983f == null) {
            ((KeyDescObj) arrayList.get(0)).setChecked(true);
        }
        HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(this.mContext, arrayList);
        heyBoxPopupMenu.R(new h(arrayList, textView));
        heyBoxPopupMenu.show();
    }

    @Override // com.max.xiaoheihe.view.callback.a
    public void D3() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26679, new Class[0], Void.TYPE).isSupported && isActive()) {
            this.f79993p = true;
            this.mRecyclerView.scrollToPosition(0);
            this.mRefreshLayout.F();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void initData() {
        i iVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26666, new Class[0], Void.TYPE).isSupported || (iVar = this.f79987j) == null) {
            return;
        }
        if (com.max.hbcommon.utils.c.u(iVar.N())) {
            if (this.mIsFirst) {
                this.mIsFirst = false;
                r4();
                return;
            }
            return;
        }
        if (this.f79987j.N().equalsIgnoreCase(this.f79983f)) {
            r4();
        } else {
            s4(this.f79987j.N());
        }
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26664, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.fragment_link_list);
        this.mUnBinder = ButterKnife.f(this, view);
        if (getArguments() != null) {
            this.f79979b = getArguments().getString("h_src");
            this.f79980c = getArguments().getString("page_type");
            this.f79981d = getArguments().getString("topic_id");
            this.f79982e = getArguments().getString(f79974v);
            this.f79983f = getArguments().getString(f79975w);
        }
        this.f79988k = ViewConfiguration.get(this.mContext).getScaledTouchSlop();
        this.f79994q = new com.max.xiaoheihe.utils.u(this, this.mWritePostImageView, ViewUtils.f(this.mContext, 70.0f));
        if (f79977y.equals(this.f79980c) || f79978z.equals(this.f79980c)) {
            this.f79994q.f(false);
        } else {
            this.f79994q.f(true);
            this.f79994q.b().setOnClickListener(new a());
        }
        this.mRecyclerView.clearOnScrollListeners();
        this.mRecyclerView.addOnScrollListener(new b());
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        com.max.xiaoheihe.module.bbs.adapter.m mVar = new com.max.xiaoheihe.module.bbs.adapter.m(this.mContext, this.f79986i, this.f79980c);
        mVar.w(new c());
        j jVar = new j(mVar);
        this.f79985h = jVar;
        this.mRecyclerView.setAdapter(jVar);
        this.f79995r = new com.max.xiaoheihe.module.bbs.i<>(this, this.mRecyclerView, BBSLinkObj.class);
        new OneTimeValidExposureWatcher(this, this.mRecyclerView);
        this.mRefreshLayout.S(new d());
        this.mRefreshLayout.f0(new e());
        if (this.mIsFirst) {
            showLoading();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void loadData() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26665, new Class[0], Void.TYPE).isSupported && this.mIsPrepared && this.mIsVisible) {
            initData();
        }
    }

    public void o4(String str, String str2) {
        boolean z10 = false;
        boolean z11 = true;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 26676, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        String str3 = this.f79982e;
        if (str3 == null ? str != null : !str3.equals(str)) {
            this.f79982e = str;
            z10 = true;
        }
        String str4 = this.f79983f;
        if (str4 == null ? str2 == null : str4.equals(str2)) {
            z11 = z10;
        } else {
            this.f79983f = str2;
        }
        if (z11) {
            r4();
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 26662, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onAttach(context);
        if (getParentFragment() instanceof i) {
            this.f79987j = (i) getParentFragment();
            return;
        }
        if (context instanceof i) {
            this.f79987j = (i) context;
            return;
        }
        throw new RuntimeException(getParentFragment() + " or " + context + " must implement LinkListListener");
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26663, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetach();
        this.f79987j = null;
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26678, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        r4();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26680, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStop();
    }

    public void s4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 26675, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        o4(this.f79982e, str);
    }

    public void t4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 26674, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        o4(str, this.f79983f);
    }

    public void v4() {
        RecyclerView recyclerView;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26677, new Class[0], Void.TYPE).isSupported || (recyclerView = this.mRecyclerView) == null) {
            return;
        }
        recyclerView.scrollToPosition(0);
    }

    public void x4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26681, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        m4();
    }
}
