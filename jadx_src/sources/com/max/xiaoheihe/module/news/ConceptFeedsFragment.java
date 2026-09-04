package com.max.xiaoheihe.module.news;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.lifecycle.y;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.adapter.Event;
import com.max.hbcommon.base.adapter.OneTimeValidExposureWatcher;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.t;
import com.max.hbcommon.bean.AdsBannerObj;
import com.max.hbcustomview.CubicBezierInterpolators;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.video.AbsVideoView;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkListHeaderObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicBannerResult;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.FeedsHistoryLinkInfo;
import com.max.xiaoheihe.bean.news.ConceptFeedsResult;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.module.bbs.s0;
import com.max.xiaoheihe.module.news.viewholderbinder.h0;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import io.reactivex.z;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
@com.max.hbcommon.analytics.m(path = lb.d.M)
public class ConceptFeedsFragment extends rb.a implements com.max.xiaoheihe.module.news.adapter.a.b, com.max.xiaoheihe.view.callback.a {
    private static final String G = "state_post_list";
    private static final String H = "state_last_request_list";
    private static final String I = "state_last_val";
    private static final int J = 1;
    private static final int K = 2;
    private static final int L = 1500;
    private static final int M = 1;
    private static final int N = 0;
    private static final String O = "recommend_news_cache_key";
    public static ChangeQuickRedirect changeQuickRedirect;
    private ObjectAnimator A;
    private ObjectAnimator B;
    private ObjectAnimator C;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    View f91140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    TextView f91141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    View f91142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f91143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.max.xiaoheihe.module.news.a f91144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.max.xiaoheihe.module.news.adapter.a f91145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private m f91146h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private GridLayoutManager f91150l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f91151m;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.max.xiaoheihe.module.video.b f91154p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BannerViewPager<AdsBannerObj> f91155q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f91156r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f91157s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f91158t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f91159u;

    @BindView(R.id.v_scroll_container_divier)
    View v_scroll_container_divier;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f91162x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f91163y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private com.max.xiaoheihe.module.bbs.i f91164z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList<FeedsContentBaseObj> f91147i = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList<FeedsContentBaseObj> f91148j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<FeedsHistoryLinkInfo> f91149k = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<AbsVideoView> f91152n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private n f91153o = new n(this);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f91160v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f91161w = true;
    private boolean D = false;
    private long E = 0;
    private final BroadcastReceiver F = new BroadcastReceiver() { // from class: com.max.xiaoheihe.module.news.ConceptFeedsFragment.12
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 42378, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.x("MainAcitivty, Login Broadcast onReceive");
            if (ConceptFeedsFragment.this.isActive()) {
                ConceptFeedsFragment.this.D3();
            }
        }
    };

    public class a extends AnimatorListenerAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, 42376, new Class[]{Animator.class}, Void.TYPE).isSupported && ConceptFeedsFragment.this.isActive()) {
                ConceptFeedsFragment.this.f91140b.setVisibility(8);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, 42375, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onAnimationStart(animator);
            if (ConceptFeedsFragment.this.isActive()) {
                ConceptFeedsFragment.this.f91140b.setVisibility(0);
            }
        }
    }

    public class b extends AnimatorListenerAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f91167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ObjectAnimator f91168c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ObjectAnimator f91169d;

        b(String str, ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2) {
            this.f91167b = str;
            this.f91168c = objectAnimator;
            this.f91169d = objectAnimator2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, 42377, new Class[]{Animator.class}, Void.TYPE).isSupported && ConceptFeedsFragment.this.isActive()) {
                ConceptFeedsFragment.this.f91141c.setText(this.f91167b);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(this.f91168c, this.f91169d);
                animatorSet.setInterpolator(CubicBezierInterpolators.a(CubicBezierInterpolators.Type.EASE));
                animatorSet.start();
            }
        }
    }

    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42374, new Class[]{View.class}, Void.TYPE).isSupported && i0.e(((com.max.hbcommon.base.d) ConceptFeedsFragment.this).mContext)) {
                s0.h4("bbs", null, null).show(ConceptFeedsFragment.this.getChildFragmentManager(), "writeposttype");
            }
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
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42381, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                ConceptFeedsFragment.this.mRecyclerView.scrollToPosition(0);
                ConceptFeedsFragment.this.mRefreshLayout.F();
            }
        }

        public class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42382, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                ConceptFeedsFragment.this.mRecyclerView.scrollToPosition(0);
                ConceptFeedsFragment.this.mRefreshLayout.F();
            }
        }

        d(Context context, List list, com.max.xiaoheihe.module.news.adapter.a.b bVar) {
            super(context, list, bVar);
        }

        @Override // com.max.xiaoheihe.module.news.adapter.a, com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 42380, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            p(eVar, (FeedsContentBaseObj) obj);
        }

        @Override // com.max.xiaoheihe.module.news.adapter.a
        public void p(s.e eVar, FeedsContentBaseObj feedsContentBaseObj) {
            if (PatchProxy.proxy(new Object[]{eVar, feedsContentBaseObj}, this, changeQuickRedirect, false, 42379, new Class[]{s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
                return;
            }
            super.p(eVar, feedsContentBaseObj);
            if (feedsContentBaseObj instanceof BBSLinkObj) {
                h0.v((BBSLinkObj) feedsContentBaseObj);
            }
            if (eVar.d() == R.layout.item_concept_update) {
                eVar.i(R.id.vg_update).setOnClickListener(new a());
                return;
            }
            if (eVar.d() == R.layout.item_feeds_previous_tips) {
                View viewI = eVar.i(R.id.vg_previous_tips);
                viewI.setBackground(q.o(((com.max.hbcommon.base.d) ConceptFeedsFragment.this).mContext, R.color.background_card_1_color, ViewUtils.h0(((com.max.hbcommon.base.d) ConceptFeedsFragment.this).mContext, ViewUtils.o(((com.max.hbcommon.base.d) ConceptFeedsFragment.this).mContext, viewI))));
                viewI.setOnClickListener(new b());
            } else if (eVar.d() == R.layout.item_concept_feeds_mobile_video) {
            }
        }
    }

    public class e extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@n0 RecyclerView recyclerView, int i10) {
            if (PatchProxy.proxy(new Object[]{recyclerView, new Integer(i10)}, this, changeQuickRedirect, false, 42383, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.onScrollStateChanged(recyclerView, i10);
            if (i10 == 0) {
                ConceptFeedsFragment.h4(ConceptFeedsFragment.this);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 42384, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            if (ConceptFeedsFragment.this.f91143e && Math.abs(i11) > ConceptFeedsFragment.this.f91163y) {
                ConceptFeedsFragment.j4(ConceptFeedsFragment.this);
            }
            ConceptFeedsFragment.k4(ConceptFeedsFragment.this);
        }
    }

    public class f extends com.max.xiaoheihe.module.bbs.i<m> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f(y yVar, RecyclerView recyclerView, Class cls) {
            super(yVar, recyclerView, cls);
        }

        @Override // com.max.xiaoheihe.module.bbs.i, com.max.hbcommon.base.adapter.AbsListItemReportHelper
        public void m(@n0 Object obj, @n0 Event event) {
            if (PatchProxy.proxy(new Object[]{obj, event}, this, changeQuickRedirect, false, 42385, new Class[]{Object.class, Event.class}, Void.TYPE).isSupported) {
                return;
            }
            super.m(obj, event);
            if (event == Event.SCROLL_IN && (obj instanceof BBSLinkObj)) {
                BBSLinkObj bBSLinkObj = (BBSLinkObj) obj;
                if (com.max.hbcommon.utils.c.u(bBSLinkObj.getLinkid())) {
                    return;
                }
                ConceptFeedsFragment.this.f91149k.remove(new FeedsHistoryLinkInfo(bBSLinkObj.getLinkid(), 0L));
            }
        }
    }

    public class g implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 42386, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            ConceptFeedsFragment.this.f91158t = true;
            ConceptFeedsFragment.O3(ConceptFeedsFragment.this, 1);
        }
    }

    public class h implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 42387, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            if (ConceptFeedsFragment.this.f91159u) {
                ConceptFeedsFragment.this.clearCompositeDisposable();
            }
            ConceptFeedsFragment.O3(ConceptFeedsFragment.this, 0);
        }
    }

    public class i extends com.max.hbcommon.network.d<Result<ConceptFeedsResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f91179b;

        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42392, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                ConceptFeedsFragment.S3(ConceptFeedsFragment.this);
            }
        }

        i(int i10) {
            this.f91179b = i10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42388, new Class[0], Void.TYPE).isSupported && ConceptFeedsFragment.this.isActive()) {
                ConceptFeedsFragment.this.mRefreshLayout.A(0);
                ConceptFeedsFragment.this.mRefreshLayout.p(0);
                if (ConceptFeedsFragment.this.f91161w) {
                    ConceptFeedsFragment.this.f91161w = false;
                }
                super.onComplete();
                if (ConceptFeedsFragment.this.f91158t) {
                    ConceptFeedsFragment.this.f91158t = false;
                    ConceptFeedsFragment.this.mRecyclerView.post(new a());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 42389, new Class[]{Throwable.class}, Void.TYPE).isSupported && ConceptFeedsFragment.this.isActive()) {
                ConceptFeedsFragment.this.f91158t = false;
                ConceptFeedsFragment.this.mRefreshLayout.A(0);
                ConceptFeedsFragment.this.mRefreshLayout.p(0);
                super.onError(th2);
                if (ConceptFeedsFragment.this.getViewStatus() != 0) {
                    ConceptFeedsFragment.T3(ConceptFeedsFragment.this);
                }
            }
        }

        public void onNext(Result<ConceptFeedsResult> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 42390, new Class[]{Result.class}, Void.TYPE).isSupported && ConceptFeedsFragment.this.isActive()) {
                ConceptFeedsFragment.U3(ConceptFeedsFragment.this, result.getResult(), this.f91179b);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 42391, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ConceptFeedsResult>) obj);
        }
    }

    public class j extends com.max.hbcommon.network.d<List<FeedsContentBaseObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        public void a(List<FeedsContentBaseObj> list) {
            if (!PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 42395, new Class[]{List.class}, Void.TYPE).isSupported && ConceptFeedsFragment.this.isActive()) {
                ConceptFeedsFragment.this.f91147i.addAll(list);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42394, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            ConceptFeedsFragment.V3(ConceptFeedsFragment.this);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 42393, new Class[]{Throwable.class}, Void.TYPE).isSupported && ConceptFeedsFragment.this.isActive()) {
                super.onError(th2);
                ConceptFeedsFragment.V3(ConceptFeedsFragment.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 42396, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((List) obj);
        }
    }

    public class k extends AnimatorListenerAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, 42397, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onAnimationStart(animator);
            if (ConceptFeedsFragment.this.isActive()) {
                ConceptFeedsFragment.this.f91140b.setVisibility(0);
            }
        }
    }

    public interface l {
        View Q1();

        View U0();
    }

    public class m extends t {
        public static ChangeQuickRedirect changeQuickRedirect;

        public m(s sVar) {
            super(sVar);
        }

        private void J(s.e eVar, BBSTopicBannerResult bBSTopicBannerResult) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSTopicBannerResult}, this, changeQuickRedirect, false, 42399, new Class[]{s.e.class, BBSTopicBannerResult.class}, Void.TYPE).isSupported) {
                return;
            }
            ConceptFeedsFragment.this.f91155q = (BannerViewPager) eVar.i(R.id.banner);
            RecyclerView recyclerView = (RecyclerView) eVar.i(R.id.rv_topic);
            recyclerView.setLayoutManager(new LinearLayoutManager(((com.max.hbcommon.base.d) ConceptFeedsFragment.this).mContext, 0, false));
            recyclerView.setPadding(ViewUtils.f(((com.max.hbcommon.base.d) ConceptFeedsFragment.this).mContext, 1.0f), 0, ViewUtils.f(((com.max.hbcommon.base.d) ConceptFeedsFragment.this).mContext, 1.0f), 0);
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
                recyclerView.setAdapter(new com.max.xiaoheihe.module.news.adapter.c(((com.max.hbcommon.base.d) ConceptFeedsFragment.this).mContext, arrayList, null));
                recyclerView.setVisibility(0);
            }
            com.max.hbcommon.utils.b.f(ConceptFeedsFragment.this.f91155q, bBSTopicBannerResult.getAds_banner());
        }

        @Override // com.max.hbcommon.base.adapter.t
        public void C(s.e eVar, Object obj) {
            if (!PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 42398, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported && eVar.d() == R.layout.item_concept_feeds_header) {
                J(eVar, (BBSTopicBannerResult) obj);
            }
        }
    }

    public static class n extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<ConceptFeedsFragment> f91185a;

        public n(ConceptFeedsFragment conceptFeedsFragment) {
            this.f91185a = new WeakReference<>(conceptFeedsFragment);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 42400, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            super.handleMessage(message);
            ConceptFeedsFragment conceptFeedsFragment = this.f91185a.get();
            if (conceptFeedsFragment == null || !conceptFeedsFragment.isActive()) {
                return;
            }
            int i10 = message.what;
            if (i10 == 1) {
                ConceptFeedsFragment.X3(conceptFeedsFragment, (String) message.obj);
            } else {
                if (i10 != 2) {
                    return;
                }
                ConceptFeedsFragment.Y3(conceptFeedsFragment);
            }
        }
    }

    private void A4() {
        RecyclerView recyclerView;
        int i10;
        AbsVideoView absVideoView;
        int i11 = 0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42357, new Class[0], Void.TYPE).isSupported || (recyclerView = this.mRecyclerView) == null || !(recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.mRecyclerView.getLayoutManager();
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition != -1 && iFindLastVisibleItemPosition != -1) {
            i11 = (iFindLastVisibleItemPosition - iFindFirstVisibleItemPosition) + 1;
        }
        if (i11 > 0) {
            while (iFindFirstVisibleItemPosition < iFindLastVisibleItemPosition + 1) {
                View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                if (viewFindViewByPosition != null && (viewFindViewByPosition.getTag() instanceof BBSLinkObj) && "12".equals(((BBSLinkObj) viewFindViewByPosition.getTag()).getContent_type())) {
                    Rect rect = new Rect();
                    int height = viewFindViewByPosition.getHeight();
                    if (height > 0 && viewFindViewByPosition.getLocalVisibleRect(rect) && (i10 = rect.top) > 0 && ((height - i10) * 100) / height < 50 && (absVideoView = (AbsVideoView) viewFindViewByPosition.findViewById(R.id.video_view)) != null) {
                        absVideoView.Z();
                    }
                }
                iFindFirstVisibleItemPosition++;
            }
        }
    }

    private void B4(String str, long j10) {
        if (PatchProxy.proxy(new Object[]{str, new Long(j10)}, this, changeQuickRedirect, false, 42352, new Class[]{String.class, Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f91153o.removeMessages(2);
        this.f91153o.removeMessages(1);
        Message messageObtainMessage = this.f91153o.obtainMessage(1);
        messageObtainMessage.obj = str;
        this.f91153o.sendMessageDelayed(messageObtainMessage, j10);
    }

    private void C4(ConceptFeedsResult conceptFeedsResult, int i10) {
        if (PatchProxy.proxy(new Object[]{conceptFeedsResult, new Integer(i10)}, this, changeQuickRedirect, false, 42345, new Class[]{ConceptFeedsResult.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f91156r = conceptFeedsResult.getUse_history();
        this.f91157s = conceptFeedsResult.getLastval();
        if (!com.max.hbcommon.utils.c.w(conceptFeedsResult.getLinks())) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (FeedsContentBaseObj feedsContentBaseObj : conceptFeedsResult.getLinks()) {
                if (feedsContentBaseObj instanceof BBSLinkObj) {
                    String linkid = ((BBSLinkObj) feedsContentBaseObj).getLinkid();
                    if (!com.max.hbcommon.utils.c.u(linkid)) {
                        FeedsHistoryLinkInfo feedsHistoryLinkInfo = new FeedsHistoryLinkInfo(linkid, jCurrentTimeMillis);
                        this.f91149k.remove(feedsHistoryLinkInfo);
                        this.f91149k.add(feedsHistoryLinkInfo);
                    }
                }
            }
        }
        if (1 == i10 && !com.max.hbcommon.utils.c.w(conceptFeedsResult.getLinks())) {
            this.f91147i.clear();
        } else if (!com.max.hbcommon.utils.c.w(conceptFeedsResult.getLinks())) {
            x4(conceptFeedsResult.getLinks());
        }
        int size = this.f91147i.size();
        int size2 = conceptFeedsResult.getLinks().size();
        if (!com.max.hbcommon.utils.c.w(conceptFeedsResult.getLinks())) {
            this.f91159u = false;
            if (1 == i10) {
                this.f91147i.addAll(conceptFeedsResult.getLinks());
                if (com.max.hbcommon.utils.c.x(conceptFeedsResult.getKeep_previous()) && this.f91148j.size() > 0) {
                    BBSLinkObj bBSLinkObj = new BBSLinkObj();
                    bBSLinkObj.setCustom_previous_tips("1");
                    this.f91147i.add(bBSLinkObj);
                    this.f91147i.addAll(this.f91148j);
                    size2++;
                }
                if ("1".equals(conceptFeedsResult.getShow_view_point())) {
                    BBSLinkObj bBSLinkObj2 = new BBSLinkObj();
                    bBSLinkObj2.setIs_update("1");
                    this.f91147i.add(bBSLinkObj2);
                    size2++;
                }
            } else {
                this.f91147i.addAll(conceptFeedsResult.getLinks());
            }
            this.f91148j.clear();
            this.f91148j.addAll(conceptFeedsResult.getLinks());
        }
        if (1 == i10) {
            if (com.max.hbcommon.utils.c.w(this.f91147i)) {
                addDisposable((io.reactivex.disposables.b) com.max.hbcache.b.f(O, FeedsContentBaseObj.class).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new j()));
            } else {
                com.max.hbcache.b.k(O, conceptFeedsResult.getLinks());
                u4();
            }
        } else if (size > 0) {
            v4(size, size2);
        } else {
            u4();
        }
        if (com.max.hbcommon.utils.c.u(conceptFeedsResult.getNotify_msg())) {
            return;
        }
        String notify_msg = conceptFeedsResult.getNotify_msg();
        if (!com.max.hbcache.c.e(this.mContext).booleanValue() && notify_msg.contains("推荐")) {
            notify_msg = notify_msg.replaceAll("推荐", "更新");
        }
        B4(notify_msg, 250L);
    }

    private void D4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42360, new Class[0], Void.TYPE).isSupported || this.f91160v || this.C.isRunning()) {
            return;
        }
        this.C.start();
        this.f91160v = true;
    }

    private void E4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 42353, new Class[]{String.class}, Void.TYPE).isSupported || this.A == null) {
            return;
        }
        F4(str);
        if (!this.f91151m && !this.A.isRunning()) {
            this.f91153o.removeMessages(2);
            this.f91140b.setVisibility(0);
            this.A.start();
            this.f91151m = true;
        }
        this.f91153o.removeMessages(2);
        this.f91153o.sendMessageDelayed(this.f91153o.obtainMessage(2), 1500L);
    }

    private void F4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 42356, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!this.f91151m) {
            this.f91141c.setText(str);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f91141c, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f91141c, "translationY", 0.0f, ViewUtils.f(this.mContext, 10.0f));
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat2.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f91141c, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f91141c, "translationY", ViewUtils.f(this.mContext, 10.0f), 0.0f);
        objectAnimatorOfFloat3.setDuration(300L);
        objectAnimatorOfFloat4.setDuration(300L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(CubicBezierInterpolators.a(CubicBezierInterpolators.Type.EASE));
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.addListener(new b(str, objectAnimatorOfFloat3, objectAnimatorOfFloat4));
        animatorSet.start();
    }

    static /* synthetic */ void O3(ConceptFeedsFragment conceptFeedsFragment, int i10) {
        if (PatchProxy.proxy(new Object[]{conceptFeedsFragment, new Integer(i10)}, null, changeQuickRedirect, true, 42367, new Class[]{ConceptFeedsFragment.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        conceptFeedsFragment.o4(i10);
    }

    static /* synthetic */ void S3(ConceptFeedsFragment conceptFeedsFragment) {
        if (PatchProxy.proxy(new Object[]{conceptFeedsFragment}, null, changeQuickRedirect, true, 42368, new Class[]{ConceptFeedsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        conceptFeedsFragment.z4();
    }

    static /* synthetic */ void T3(ConceptFeedsFragment conceptFeedsFragment) {
        if (PatchProxy.proxy(new Object[]{conceptFeedsFragment}, null, changeQuickRedirect, true, 42369, new Class[]{ConceptFeedsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        conceptFeedsFragment.showError();
    }

    static /* synthetic */ void U3(ConceptFeedsFragment conceptFeedsFragment, ConceptFeedsResult conceptFeedsResult, int i10) {
        if (PatchProxy.proxy(new Object[]{conceptFeedsFragment, conceptFeedsResult, new Integer(i10)}, null, changeQuickRedirect, true, 42370, new Class[]{ConceptFeedsFragment.class, ConceptFeedsResult.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        conceptFeedsFragment.C4(conceptFeedsResult, i10);
    }

    static /* synthetic */ void V3(ConceptFeedsFragment conceptFeedsFragment) {
        if (PatchProxy.proxy(new Object[]{conceptFeedsFragment}, null, changeQuickRedirect, true, 42371, new Class[]{ConceptFeedsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        conceptFeedsFragment.u4();
    }

    static /* synthetic */ void X3(ConceptFeedsFragment conceptFeedsFragment, String str) {
        if (PatchProxy.proxy(new Object[]{conceptFeedsFragment, str}, null, changeQuickRedirect, true, 42372, new Class[]{ConceptFeedsFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        conceptFeedsFragment.E4(str);
    }

    static /* synthetic */ void Y3(ConceptFeedsFragment conceptFeedsFragment) {
        if (PatchProxy.proxy(new Object[]{conceptFeedsFragment}, null, changeQuickRedirect, true, 42373, new Class[]{ConceptFeedsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        conceptFeedsFragment.r4();
    }

    static /* synthetic */ void h4(ConceptFeedsFragment conceptFeedsFragment) {
        if (PatchProxy.proxy(new Object[]{conceptFeedsFragment}, null, changeQuickRedirect, true, 42364, new Class[]{ConceptFeedsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        conceptFeedsFragment.A4();
    }

    static /* synthetic */ void j4(ConceptFeedsFragment conceptFeedsFragment) {
        if (PatchProxy.proxy(new Object[]{conceptFeedsFragment}, null, changeQuickRedirect, true, 42365, new Class[]{ConceptFeedsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        conceptFeedsFragment.D4();
    }

    static /* synthetic */ void k4(ConceptFeedsFragment conceptFeedsFragment) {
        if (PatchProxy.proxy(new Object[]{conceptFeedsFragment}, null, changeQuickRedirect, true, 42366, new Class[]{ConceptFeedsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        conceptFeedsFragment.w4();
    }

    private void o4(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 42342, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        p4(i10, false);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0088  */
    /* JADX WARN: Code duplicated, block: B:31:0x008b  */
    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0093  */
    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    private synchronized void p4(int i10, boolean z10) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 42343, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (this.D && System.currentTimeMillis() - this.E < 1000) {
            this.D = false;
            this.mRefreshLayout.A(0);
            this.mRefreshLayout.p(0);
            return;
        }
        if (1 == i10) {
            this.E = System.currentTimeMillis();
        }
        String strQ4 = q4(i10);
        if (MainActivity.G4) {
            str2 = com.alipay.sdk.m.x.d.f39542v;
            MainActivity.G4 = false;
        } else {
            if (!MainActivity.H4) {
                if (MainActivity.I4) {
                    str2 = "recommend_tab";
                    MainActivity.I4 = false;
                } else {
                    str = null;
                }
                com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
                String str6 = this.f91156r;
                String str7 = this.f91157s;
                String str8 = this.f91162x;
                if (this.f91161w) {
                    str3 = "1";
                } else {
                    str3 = "0";
                }
                if (z10) {
                    str4 = "1";
                } else {
                    str4 = null;
                }
                z<Result<ConceptFeedsResult>> zVarW3 = eVarA.W3(i10, str6, str7, strQ4, str8, str3, str4, str);
                if (i10 == 1) {
                    str5 = "1";
                } else {
                    str5 = "0";
                }
                this.f91162x = str5;
                addDisposable((io.reactivex.disposables.b) zVarW3.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i(i10)));
            }
            str2 = "icon";
            MainActivity.H4 = false;
        }
        str = str2;
        com.max.xiaoheihe.network.e eVarA2 = com.max.xiaoheihe.network.i.a();
        String str9 = this.f91156r;
        String str10 = this.f91157s;
        String str11 = this.f91162x;
        if (this.f91161w) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        if (z10) {
            str4 = "1";
        } else {
            str4 = null;
        }
        z<Result<ConceptFeedsResult>> zVarW4 = eVarA2.W3(i10, str9, str10, strQ4, str11, str3, str4, str);
        if (i10 == 1) {
            str5 = "1";
        } else {
            str5 = "0";
        }
        this.f91162x = str5;
        addDisposable((io.reactivex.disposables.b) zVarW4.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i(i10)));
    }

    private String q4(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 42361, new Class[]{Integer.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (!com.max.hbcommon.utils.c.w(this.f91149k)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator<FeedsHistoryLinkInfo> it = this.f91149k.iterator();
            while (it.hasNext() && (jCurrentTimeMillis - it.next().getTimestamp() > 3600000 || this.f91149k.size() > 60)) {
                it.remove();
            }
            com.max.hbcommon.utils.d.b("zzzzrefresh", "mHistoryLinks size " + this.f91149k.size());
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator<FeedsHistoryLinkInfo> it2 = this.f91149k.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getLinkid());
            }
            y4(arrayList, this.f91148j);
            if (i10 == 0) {
                y4(arrayList, this.f91147i);
            }
            com.max.hbcommon.utils.d.b("zzzzrefresh", "unexposedLinks size " + arrayList.size());
            if (arrayList.size() > 50) {
                return com.max.xiaoheihe.utils.d.T0(arrayList.subList(0, 50), ',');
            }
            if (arrayList.size() > 0) {
                return com.max.xiaoheihe.utils.d.T0(arrayList, ',');
            }
        }
        return null;
    }

    private void r4() {
        ObjectAnimator objectAnimator;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42354, new Class[0], Void.TYPE).isSupported || (objectAnimator = this.B) == null || !this.f91151m || objectAnimator.isRunning()) {
            return;
        }
        try {
            this.f91153o.removeMessages(1);
            this.f91140b.setVisibility(0);
            this.B.start();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f91151m = false;
    }

    private void s4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42355, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        float f10 = ViewUtils.f(this.mContext, 42.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f91140b, "translationY", f10, 0.0f);
        this.A = objectAnimatorOfFloat;
        objectAnimatorOfFloat.addListener(new k());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f91140b, "translationY", 0.0f, f10);
        this.B = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.addListener(new a());
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f91142d, "translationX", ViewUtils.f(this.mContext, 74.0f) + 0.0f, 0.0f);
        this.C = objectAnimatorOfFloat3;
        addValueAnimator(objectAnimatorOfFloat3);
        addValueAnimator(this.A);
        addValueAnimator(this.B);
    }

    public static ConceptFeedsFragment t4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 42330, new Class[0], ConceptFeedsFragment.class);
        return patchProxyResultProxy.isSupported ? (ConceptFeedsFragment) patchProxyResultProxy.result : new ConceptFeedsFragment();
    }

    private void u4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42346, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.x("ConceptFeedsFragment, onGetList");
        this.f91146h.notifyDataSetChanged();
        showContentView();
    }

    private void v4(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 42347, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.x("ConceptFeedsFragment, onGetMore, positionStart = " + i10 + ", itemCount = " + i11);
        this.f91146h.notifyItemRangeInserted(i10, i11);
    }

    private void w4() {
        RecyclerView recyclerView;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42337, new Class[0], Void.TYPE).isSupported || (recyclerView = this.mRecyclerView) == null || !(recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.mRecyclerView.getLayoutManager();
        int itemCount = linearLayoutManager.getItemCount();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (itemCount <= 1 || iFindLastVisibleItemPosition + 2 < itemCount || this.f91159u) {
            return;
        }
        o4(0);
        this.f91159u = true;
    }

    private void x4(List<FeedsContentBaseObj> list) {
        if (!PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 42344, new Class[]{List.class}, Void.TYPE).isSupported && this.f91147i.size() > 0 && list.size() > 0) {
            ArrayList<FeedsContentBaseObj> arrayList = this.f91147i;
            FeedsContentBaseObj feedsContentBaseObj = arrayList.get(arrayList.size() - 1);
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

    private void y4(ArrayList<String> arrayList, List<FeedsContentBaseObj> list) {
        if (PatchProxy.proxy(new Object[]{arrayList, list}, this, changeQuickRedirect, false, 42362, new Class[]{ArrayList.class, List.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(arrayList) || com.max.hbcommon.utils.c.w(list)) {
            return;
        }
        for (FeedsContentBaseObj feedsContentBaseObj : list) {
            if (feedsContentBaseObj instanceof BBSLinkObj) {
                String linkid = ((BBSLinkObj) feedsContentBaseObj).getLinkid();
                if (!com.max.hbcommon.utils.c.u(linkid)) {
                    arrayList.remove(linkid);
                }
            }
        }
    }

    private void z4() {
        com.max.xiaoheihe.module.bbs.i iVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42363, new Class[0], Void.TYPE).isSupported || (iVar = this.f91164z) == null) {
            return;
        }
        iVar.q();
    }

    @Override // com.max.xiaoheihe.module.news.adapter.a.b
    public void B3(int i10) {
        m mVar;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 42358, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || !isActive() || (mVar = this.f91146h) == null) {
            return;
        }
        mVar.notifyItemRemoved(mVar.u() + i10);
    }

    @Override // com.max.xiaoheihe.view.callback.a
    public void D3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42351, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g gVarS = com.max.heybox.hblog.g.S();
        if (gVarS != null) {
            gVarS.a0("ConceptFeedsFragment : onAutoRefresh");
        }
        if (isActive()) {
            if (MainActivity.G4) {
                B4(com.max.xiaoheihe.utils.d.n0(R.string.click_again_to_exit), 0L);
                this.D = true;
            }
            if (this.f91159u) {
                clearCompositeDisposable();
            }
            if (this.mRefreshLayout.getState().isHeader) {
                MainActivity.G4 = false;
                MainActivity.H4 = false;
                return;
            }
            this.mRefreshLayout.A(0);
            this.mRefreshLayout.p(0);
            this.f91158t = true;
            this.mRecyclerView.scrollToPosition(0);
            this.mRefreshLayout.F();
        }
    }

    @Override // com.max.xiaoheihe.module.news.adapter.a.b
    public void G2(int i10) {
        m mVar;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 42359, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (isActive() && (mVar = this.f91146h) != null) {
            mVar.notifyItemChanged(mVar.u() + i10);
        }
        z4();
    }

    @Override // rb.a, rb.c
    @p0
    public Bundle M() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42350, new Class[0], Bundle.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bundle) patchProxyResultProxy.result;
        }
        Bundle bundle = new Bundle();
        if (!com.max.hbcommon.utils.c.w(this.f91147i)) {
            bundle.putSerializable(G, this.f91147i);
        }
        if (!com.max.hbcommon.utils.c.w(this.f91148j)) {
            bundle.putSerializable(H, this.f91148j);
        }
        if (!com.max.hbcommon.utils.c.u(this.f91157s)) {
            bundle.putString(I, this.f91157s);
        }
        return bundle;
    }

    @Override // com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42336, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!com.max.hbcommon.utils.c.w(this.f91147i)) {
            u4();
            return;
        }
        showLoading();
        this.f91158t = true;
        com.max.heybox.hblog.g gVarS = com.max.heybox.hblog.g.S();
        if (gVarS != null) {
            gVarS.a0("ConceptFeedsFragment : initData");
        }
        this.mRecyclerView.scrollToPosition(0);
        o4(1);
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42335, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.fragment_news_list);
        this.mUnBinder = ButterKnife.f(this, view);
        this.f91140b = ((l) getParentFragment()).Q1();
        this.f91142d = ((l) getParentFragment()).U0();
        this.f91141c = (TextView) this.f91140b.findViewById(R.id.tv_update_tips);
        this.f91163y = ViewConfiguration.get(this.mContext).getScaledTouchSlop();
        this.mRecyclerView.setClipToPadding(false);
        this.mRecyclerView.setClipChildren(false);
        boolean z10 = !MainActivity.E4;
        this.f91143e = z10;
        this.f91142d.setVisibility(z10 ? 0 : 8);
        this.f91142d.setOnClickListener(new c());
        d dVar = new d(this.mContext, this.f91147i, this);
        this.f91145g = dVar;
        this.f91146h = new m(dVar);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.mContext, 1);
        this.f91150l = gridLayoutManager;
        this.mRecyclerView.setLayoutManager(gridLayoutManager);
        this.mRecyclerView.clearOnScrollListeners();
        this.mRecyclerView.addOnScrollListener(new e());
        this.mRecyclerView.setAdapter(this.f91146h);
        this.f91164z = new f(this, this.mRecyclerView, BBSLinkObj.class);
        new OneTimeValidExposureWatcher(this, this.mRecyclerView);
        s4();
        ViewUtils.b(this.mRecyclerView, this.v_scroll_container_divier);
        this.mRefreshLayout.a(true);
        this.mRefreshLayout.S(new g());
        this.mRefreshLayout.f0(new h());
        registerReceiver(this.F, lb.a.f130942c0);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 42331, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onAttach(context);
        if (getParentFragment() instanceof com.max.xiaoheihe.module.video.b) {
            this.f91154p = (com.max.xiaoheihe.module.video.b) getParentFragment();
            return;
        }
        if (context instanceof com.max.xiaoheihe.module.video.b) {
            this.f91154p = (com.max.xiaoheihe.module.video.b) context;
            return;
        }
        throw new RuntimeException(getParentFragment() + " or " + context + " must implement NewsListInteractionListener");
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, 42332, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        com.max.xiaoheihe.module.news.a aVar = (com.max.xiaoheihe.module.news.a) new y0(this).a(com.max.xiaoheihe.module.news.a.class);
        this.f91144f = aVar;
        this.f91161w = aVar.f();
        this.f91162x = this.f91144f.c();
        this.f91156r = this.f91144f.e();
        com.max.heybox.hblog.g.x("ConceptFeedsFragment, onCreate, isFirstRequest = " + this.f91161w + ", lastPull = " + this.f91162x + ", mUseHistory = " + this.f91156r);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // rb.a, com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42341, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        unregisterReceiver(this.F);
    }

    @Override // rb.a, com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42340, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f91153o.removeCallbacksAndMessages(null);
        if (this.f91152n.size() > 0) {
            Iterator<AbsVideoView> it = this.f91152n.iterator();
            while (it.hasNext()) {
                it.next().Q();
            }
            this.f91152n.clear();
        }
        com.max.xiaoheihe.module.news.adapter.a aVar = this.f91145g;
        if (aVar != null) {
            aVar.n();
        }
        super.onDestroyView();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42334, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetach();
        this.f91154p = null;
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42348, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        o4(1);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42338, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        if (bb.a.f30448c.booleanValue() && ad.a.a(ad.a.B, false)) {
            bb.a.f30448c = Boolean.FALSE;
            this.D = true;
            showLoading();
            this.f91158t = true;
            this.mRecyclerView.scrollToPosition(0);
            this.f91158t = true;
            p4(1, true);
        }
    }

    @Override // rb.a, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@n0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 42349, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onSaveInstanceState(bundle);
        com.max.heybox.hblog.g.x("ConceptFeedsFragment, onSaveInstanceState, isFirstRequest = " + this.f91161w + ", lastPull = " + this.f91162x + ", mUseHistory = " + this.f91156r);
        this.f91144f.h(this.f91162x);
        this.f91144f.i(this.f91156r);
        this.f91144f.g(this.f91161w);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42339, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStop();
    }

    @Override // rb.a, rb.c
    public void p3(@p0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 42333, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.p3(bundle);
        com.max.heybox.hblog.g.x("ConceptFeedsFragment, restoreKilledState, bundle = " + bundle);
        if (bundle != null) {
            Serializable serializable = bundle.getSerializable(G);
            Serializable serializable2 = bundle.getSerializable(H);
            if (serializable instanceof ArrayList) {
                this.f91147i = (ArrayList) serializable;
            }
            if (serializable2 instanceof ArrayList) {
                this.f91148j = (ArrayList) serializable2;
            }
            this.f91157s = bundle.getString(I);
        }
        com.max.heybox.hblog.g.x("ConceptFeedsFragment, restoreKilledState, mNewList = " + this.f91147i.size() + ", mLastRequestList = " + this.f91148j.size() + ", lastval = " + this.f91157s);
    }
}
