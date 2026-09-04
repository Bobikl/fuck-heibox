package com.max.xiaoheihe.module.bbs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.gson.JsonObject;
import com.max.basebbs.utils.AccelWorldBBSKt;
import com.max.hbcommon.base.adapter.OneTimeValidExposureWatcher;
import com.max.hbcommon.bean.AdsBannerObj;
import com.max.hbcommon.component.triplebanner.TripleBannerViewPager;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.hbcustomview.video.VideoViewX;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.video.AbsVideoView;
import com.max.video.impl.PlainVideoUI;
import com.max.video.impl.StatusInfoTopPanel;
import com.max.video.player.VideoPlayerManager;
import com.max.video.ui.widget.BasicBottomPanel;
import com.max.video.ui.widget.BasicCenterPanel;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.FeedsContentAdObj;
import com.max.xiaoheihe.bean.news.ConceptFeedsResult;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.max.xiaoheihe.bean.news.FeedsContentRecNewsObj;
import com.max.xiaoheihe.module.news.NewsTagListFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class ChannelsNewsFragment extends rb.a implements com.max.xiaoheihe.view.callback.a {
    private static final String A = "tag";
    private static final String B = "idx";
    private static final String C = "extra_params";
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;
    public static final String G = "rec";
    public static final String H = "normal";
    public static final String I = "direction_top";
    public static final String J = "direction_bottom";
    private static final int K = 1;
    private static final int L = 2;
    private static final int M = 1500;
    public static String O = null;
    public static String P = null;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f79696x = "state_post_list";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f79697y = "state_last_val";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f79698z = "topic_id";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f79699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f79700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f79701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, String> f79702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f79703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f79704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.max.xiaoheihe.module.news.adapter.a f79705h;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.max.xiaoheihe.module.video.b f79710m;

    @BindView(R.id.rv)
    RecyclerView mRecyclerView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    @BindView(R.id.tv_update_tips)
    TextView mUpdateTipsTextView;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f79712o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f79713p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BannerViewPager<List<BBSLinkObj>> f79714q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TripleBannerViewPager<AdsBannerObj> f79715r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f79716s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private NewMsgBroadcastReceiver f79718u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private i f79719v;
    private static final String[] N = {"20", "10", "23"};
    public static boolean Q = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList<FeedsContentBaseObj> f79706i = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<BBSLinkObj> f79707j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<BBSLinkObj> f79708k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<AbsVideoView> f79709l = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f79711n = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private h f79717t = new h(this);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final com.max.xiaoheihe.module.news.adapter.a.b f79720w = new a();

    public class NewMsgBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private NewMsgBroadcastReceiver() {
        }

        /* synthetic */ NewMsgBroadcastReceiver(ChannelsNewsFragment channelsNewsFragment, a aVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 26102, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported && lb.a.K.equals(intent.getAction())) {
                ChannelsNewsFragment.this.f79713p = true;
                ChannelsNewsFragment.this.f79707j.clear();
                ChannelsNewsFragment.this.f79708k.clear();
                ChannelsNewsFragment.this.f79704g = null;
                ChannelsNewsFragment.this.f79703f = 0;
                ChannelsNewsFragment.this.f79712o = true;
                ChannelsNewsFragment.o4(ChannelsNewsFragment.this, ChannelsNewsFragment.I);
            }
        }
    }

    public class a implements com.max.xiaoheihe.module.news.adapter.a.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.xiaoheihe.module.news.adapter.a.b
        public void B3(int i10) {
        }

        @Override // com.max.xiaoheihe.module.news.adapter.a.b
        public void G2(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 26081, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (ChannelsNewsFragment.this.isActive() && ChannelsNewsFragment.this.f79705h != null) {
                ChannelsNewsFragment.this.f79705h.notifyItemChanged(i10);
            }
            if (ChannelsNewsFragment.this.f79719v != null) {
                ChannelsNewsFragment.this.f79719v.q();
            }
        }
    }

    public class b extends com.max.xiaoheihe.module.bbs.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26088, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                RecyclerView recyclerView = b.this.r().get();
                if (recyclerView != null) {
                    recyclerView.scrollToPosition(0);
                }
                ChannelsNewsFragment.this.mRefreshLayout.F();
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.ChannelsNewsFragment$b$b, reason: collision with other inner class name */
        public class ViewOnClickListenerC0666b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ FeedsContentRecNewsObj f79725b;

            ViewOnClickListenerC0666b(FeedsContentRecNewsObj feedsContentRecNewsObj) {
                this.f79725b = feedsContentRecNewsObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26089, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (com.max.hbcommon.utils.c.u(this.f79725b.getTopic_id())) {
                    ChannelsNewsFragment channelsNewsFragment = ChannelsNewsFragment.this;
                    channelsNewsFragment.startActivity(MainActivity.k3(((com.max.hbcommon.base.d) channelsNewsFragment).mContext, MainActivity.f76175u4));
                } else {
                    ChannelsNewsFragment channelsNewsFragment2 = ChannelsNewsFragment.this;
                    channelsNewsFragment2.startActivity(ChannelsDetailActivity.l3(((com.max.hbcommon.base.d) channelsNewsFragment2).mContext, null, this.f79725b.getTopic_id(), null, null, null, null, null, null, "link"));
                }
            }
        }

        public class c extends com.max.hbcustomview.bannerview.d<List<BBSLinkObj>> {
            public static ChangeQuickRedirect changeQuickRedirect;

            c() {
            }

            public void A(com.max.hbcustomview.bannerview.e<List<BBSLinkObj>> eVar, List<BBSLinkObj> list, int i10, int i11) {
                Object[] objArr = {eVar, list, new Integer(i10), new Integer(i11)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 26090, new Class[]{com.max.hbcustomview.bannerview.e.class, List.class, cls, cls}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(list)) {
                    return;
                }
                View viewFindViewById = eVar.itemView.findViewById(R.id.item1);
                View viewFindViewById2 = eVar.itemView.findViewById(R.id.item2);
                View viewFindViewById3 = eVar.itemView.findViewById(R.id.item3);
                b bVar = b.this;
                b.u(bVar, ((com.max.hbcommon.base.d) ChannelsNewsFragment.this).mContext, list.get(0), viewFindViewById);
                if (list.size() > 1) {
                    b bVar2 = b.this;
                    b.u(bVar2, ((com.max.hbcommon.base.d) ChannelsNewsFragment.this).mContext, list.get(1), viewFindViewById2);
                } else {
                    viewFindViewById2.setVisibility(i10 == 0 ? 8 : 4);
                }
                if (list.size() <= 2) {
                    viewFindViewById3.setVisibility(i10 == 0 ? 8 : 4);
                } else {
                    b bVar3 = b.this;
                    b.u(bVar3, ((com.max.hbcommon.base.d) ChannelsNewsFragment.this).mContext, list.get(2), viewFindViewById3);
                }
            }

            @Override // com.max.hbcustomview.bannerview.d
            public /* bridge */ /* synthetic */ void n(com.max.hbcustomview.bannerview.e<List<BBSLinkObj>> eVar, List<BBSLinkObj> list, int i10, int i11) {
                Object[] objArr = {eVar, list, new Integer(i10), new Integer(i11)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 26091, new Class[]{com.max.hbcustomview.bannerview.e.class, Object.class, cls, cls}, Void.TYPE).isSupported) {
                    return;
                }
                A(eVar, list, i10, i11);
            }

            @Override // com.max.hbcustomview.bannerview.d
            public int q(int i10) {
                return R.layout.item_hot_link_x3;
            }
        }

        public class d implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f79728b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ BBSLinkObj f79729c;

            d(Context context, BBSLinkObj bBSLinkObj) {
                this.f79728b = context;
                this.f79729c = bBSLinkObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26092, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.module.bbs.utils.b.E(this.f79728b, this.f79729c);
            }
        }

        b(Context context, List list, com.max.xiaoheihe.module.news.adapter.a.b bVar, RecyclerView recyclerView) {
            super(context, list, bVar, recyclerView);
        }

        static /* synthetic */ void u(b bVar, Context context, BBSLinkObj bBSLinkObj, View view) {
            if (PatchProxy.proxy(new Object[]{bVar, context, bBSLinkObj, view}, null, changeQuickRedirect, true, 26087, new Class[]{b.class, Context.class, BBSLinkObj.class, View.class}, Void.TYPE).isSupported) {
                return;
            }
            bVar.x(context, bBSLinkObj, view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void v() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26086, new Class[0], Void.TYPE).isSupported && VideoPlayerManager.f76079a.c(((com.max.hbcommon.base.d) ChannelsNewsFragment.this).mContext) == null) {
                ((com.max.hbcommon.base.d) ChannelsNewsFragment.this).mContext.finish();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void w(ViewGroup viewGroup, VideoViewX videoViewX, boolean z10) {
            if (PatchProxy.proxy(new Object[]{viewGroup, videoViewX, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 26085, new Class[]{ViewGroup.class, VideoViewX.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            ChannelsNewsFragment.c4(ChannelsNewsFragment.this, viewGroup, videoViewX, z10);
        }

        private void x(Context context, BBSLinkObj bBSLinkObj, View view) {
            if (PatchProxy.proxy(new Object[]{context, bBSLinkObj, view}, this, changeQuickRedirect, false, 26083, new Class[]{Context.class, BBSLinkObj.class, View.class}, Void.TYPE).isSupported || bBSLinkObj == null) {
                return;
            }
            view.setVisibility(0);
            ImageView imageView = (ImageView) view.findViewById(R.id.iv_img);
            TextView textView = (TextView) view.findViewById(R.id.tv_title);
            if (com.max.hbcommon.utils.c.w(bBSLinkObj.getImgs())) {
                imageView.setImageDrawable(null);
            } else {
                com.max.hbimage.b.K(bBSLinkObj.getImgs().get(0), imageView);
            }
            textView.setText(bBSLinkObj.getTitle());
            view.setOnClickListener(new d(context, bBSLinkObj));
        }

        @Override // com.max.xiaoheihe.module.news.adapter.a, com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 26084, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            p(eVar, (FeedsContentBaseObj) obj);
        }

        @Override // com.max.xiaoheihe.module.news.adapter.a
        public void p(com.max.hbcommon.base.adapter.s.e eVar, FeedsContentBaseObj feedsContentBaseObj) {
            if (PatchProxy.proxy(new Object[]{eVar, feedsContentBaseObj}, this, changeQuickRedirect, false, 26082, new Class[]{com.max.hbcommon.base.adapter.s.e.class, FeedsContentBaseObj.class}, Void.TYPE).isSupported) {
                return;
            }
            super.p(eVar, feedsContentBaseObj);
            if (eVar.d() == R.layout.item_concept_update) {
                eVar.i(R.id.vg_update).setOnClickListener(new a());
                return;
            }
            if (eVar.d() == R.layout.item_concept_feeds_mobile_video) {
                final ViewGroup viewGroup = (ViewGroup) eVar.i(R.id.vg_screenshots);
                final VideoViewX videoViewX = (VideoViewX) eVar.i(R.id.video_view);
                if (videoViewX.getUi() == null) {
                    ze.d plainVideoUI = new PlainVideoUI(((com.max.hbcommon.base.d) ChannelsNewsFragment.this).mContext);
                    StatusInfoTopPanel statusInfoTopPanel = new StatusInfoTopPanel(((com.max.hbcommon.base.d) ChannelsNewsFragment.this).mContext);
                    BasicCenterPanel basicCenterPanel = new BasicCenterPanel(((com.max.hbcommon.base.d) ChannelsNewsFragment.this).mContext);
                    BasicBottomPanel basicBottomPanel = new BasicBottomPanel(((com.max.hbcommon.base.d) ChannelsNewsFragment.this).mContext);
                    statusInfoTopPanel.setBackwardAction(new ze.e() { // from class: com.max.xiaoheihe.module.bbs.e
                        @Override // ze.e
                        public final void invoke() {
                            this.f81164a.v();
                        }
                    });
                    basicBottomPanel.setFullScreenAction(new ze.a() { // from class: com.max.xiaoheihe.module.bbs.f
                        @Override // ze.a
                        public final void a(boolean z10) {
                            this.f81166a.w(viewGroup, videoViewX, z10);
                        }
                    });
                    plainVideoUI.m(statusInfoTopPanel).k(basicCenterPanel).q(basicBottomPanel);
                    videoViewX.p(plainVideoUI).n(ChannelsNewsFragment.this.getViewLifecycleOwner()).s(((com.max.hbcommon.base.d) ChannelsNewsFragment.this).mContext);
                }
                if (!ChannelsNewsFragment.this.f79709l.contains(videoViewX)) {
                    ChannelsNewsFragment.this.f79709l.add(videoViewX);
                }
                if (ChannelsNewsFragment.this.f79709l.contains(videoViewX)) {
                    return;
                }
                ChannelsNewsFragment.this.f79709l.add(videoViewX);
                return;
            }
            if (eVar.d() != R.layout.item_concept_rec_news) {
                if (eVar.d() == R.layout.item_banner_large && (feedsContentBaseObj instanceof FeedsContentAdObj)) {
                    ChannelsNewsFragment.this.f79715r = (TripleBannerViewPager) eVar.i(R.id.banner);
                    com.max.hbcommon.utils.b.j(ChannelsNewsFragment.this.f79715r, ((FeedsContentAdObj) feedsContentBaseObj).getBanners(), ViewUtils.L(((com.max.hbcommon.base.d) ChannelsNewsFragment.this).mContext), 0.0f, true);
                    return;
                }
                return;
            }
            FeedsContentRecNewsObj feedsContentRecNewsObj = (FeedsContentRecNewsObj) feedsContentBaseObj;
            eVar.i(R.id.vg_more).setOnClickListener(new ViewOnClickListenerC0666b(feedsContentRecNewsObj));
            ChannelsNewsFragment.this.f79714q = (BannerViewPager) eVar.i(R.id.banner);
            if (com.max.hbcommon.utils.c.w(feedsContentRecNewsObj.getLinks())) {
                ChannelsNewsFragment.this.f79714q.setVisibility(8);
                return;
            }
            ChannelsNewsFragment.this.f79714q.setVisibility(0);
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < feedsContentRecNewsObj.getLinks().size(); i10 += 3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(feedsContentRecNewsObj.getLinks().get(i10));
                int i11 = i10 + 1;
                if (i11 < feedsContentRecNewsObj.getLinks().size()) {
                    arrayList2.add(feedsContentRecNewsObj.getLinks().get(i11));
                }
                int i12 = i10 + 2;
                if (i12 < feedsContentRecNewsObj.getLinks().size()) {
                    arrayList2.add(feedsContentRecNewsObj.getLinks().get(i12));
                }
                arrayList.add(arrayList2);
            }
            ChannelsNewsFragment.this.f79714q.J(arrayList);
            if (arrayList.size() > 1) {
                ChannelsNewsFragment.this.f79714q.getLayoutParams().height = ViewUtils.f(((com.max.hbcommon.base.d) ChannelsNewsFragment.this).mContext, 116.0f);
            } else if (arrayList.size() > 0) {
                ChannelsNewsFragment.this.f79714q.getLayoutParams().height = ViewUtils.f(((com.max.hbcommon.base.d) ChannelsNewsFragment.this).mContext, (((List) arrayList.get(0)).size() * 32.0f) + 10.0f);
            }
            ChannelsNewsFragment.this.f79714q.V(ViewUtils.f(((com.max.hbcommon.base.d) ChannelsNewsFragment.this).mContext, 2.0f));
            ChannelsNewsFragment.this.f79714q.c0(ViewUtils.f(((com.max.hbcommon.base.d) ChannelsNewsFragment.this).mContext, 8.0f));
            ChannelsNewsFragment.this.f79714q.Z(ViewUtils.f(((com.max.hbcommon.base.d) ChannelsNewsFragment.this).mContext, 6.0f));
            ChannelsNewsFragment.this.f79714q.j0(ChannelsNewsFragment.this.getLifecycle()).R(new c()).k();
        }
    }

    public class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 26093, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            ChannelsNewsFragment.this.f79707j.clear();
            ChannelsNewsFragment.this.f79708k.clear();
            ChannelsNewsFragment.this.f79704g = null;
            ChannelsNewsFragment.this.f79703f = 0;
            ChannelsNewsFragment.this.f79712o = true;
            ChannelsNewsFragment channelsNewsFragment = ChannelsNewsFragment.this;
            ChannelsNewsFragment.n4(channelsNewsFragment, channelsNewsFragment.f79715r);
            ChannelsNewsFragment.o4(ChannelsNewsFragment.this, ChannelsNewsFragment.I);
        }
    }

    public class d implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 26094, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            ChannelsNewsFragment.j4(ChannelsNewsFragment.this, 30);
            ChannelsNewsFragment.o4(ChannelsNewsFragment.this, ChannelsNewsFragment.J);
        }
    }

    public class e extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 26095, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            ChannelsNewsFragment.this.f79705h.q(recyclerView, i10, i11);
            if (i11 != 0) {
                ChannelsNewsFragment.p4(ChannelsNewsFragment.this, i11);
            }
        }
    }

    public class f extends AnimatorListenerAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, 26096, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            ChannelsNewsFragment.this.mUpdateTipsTextView.setVisibility(8);
        }
    }

    public class g extends com.max.hbcommon.network.d<Result<ConceptFeedsResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f79735b;

        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26101, new Class[0], Void.TYPE).isSupported || ChannelsNewsFragment.this.f79719v == null) {
                    return;
                }
                ChannelsNewsFragment.this.f79719v.q();
            }
        }

        g(String str) {
            this.f79735b = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26097, new Class[0], Void.TYPE).isSupported && ChannelsNewsFragment.this.isActive()) {
                super.onComplete();
                ChannelsNewsFragment.this.mRefreshLayout.A(0);
                ChannelsNewsFragment.this.mRefreshLayout.p(0);
                ChannelsNewsFragment channelsNewsFragment = ChannelsNewsFragment.this;
                ChannelsNewsFragment.q4(channelsNewsFragment, channelsNewsFragment.f79715r);
                if (ChannelsNewsFragment.this.f79712o) {
                    ChannelsNewsFragment.this.f79712o = false;
                    ChannelsNewsFragment.this.mRecyclerView.post(new a());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 26098, new Class[]{Throwable.class}, Void.TYPE).isSupported && ChannelsNewsFragment.this.isActive()) {
                super.onError(th2);
                ChannelsNewsFragment.r4(ChannelsNewsFragment.this);
                ChannelsNewsFragment.this.mRefreshLayout.A(0);
                ChannelsNewsFragment.this.mRefreshLayout.p(0);
                ChannelsNewsFragment channelsNewsFragment = ChannelsNewsFragment.this;
                ChannelsNewsFragment.q4(channelsNewsFragment, channelsNewsFragment.f79715r);
                ChannelsNewsFragment.this.f79712o = false;
            }
        }

        public void onNext(Result<ConceptFeedsResult> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 26099, new Class[]{Result.class}, Void.TYPE).isSupported && ChannelsNewsFragment.this.isActive()) {
                super.onNext(result);
                ChannelsNewsFragment.s4(ChannelsNewsFragment.this, result.getResult() != null ? result.getResult().getLinks() : null, this.f79735b, result.getResult() != null ? result.getResult().getLastval() : null);
                if (ChannelsNewsFragment.this.getParentFragment() instanceof NewsTagListFragment) {
                    com.max.hbcache.c.C("news_refresh_time", System.currentTimeMillis() + "");
                }
                String notify_msg = result.getResult() != null ? result.getResult().getNotify_msg() : null;
                if (com.max.hbcommon.utils.c.u(notify_msg)) {
                    return;
                }
                if (!com.max.hbcache.c.e(((com.max.hbcommon.base.d) ChannelsNewsFragment.this).mContext).booleanValue() && notify_msg.contains("推荐")) {
                    notify_msg = notify_msg.replaceAll("推荐", "更新");
                }
                ChannelsNewsFragment.this.f79717t.removeMessages(1);
                Message messageObtainMessage = ChannelsNewsFragment.this.f79717t.obtainMessage(1);
                messageObtainMessage.obj = notify_msg;
                ChannelsNewsFragment.this.f79717t.sendMessageDelayed(messageObtainMessage, 250L);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26100, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ConceptFeedsResult>) obj);
        }
    }

    public static class h extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<ChannelsNewsFragment> f79738a;

        public h(ChannelsNewsFragment channelsNewsFragment) {
            this.f79738a = new WeakReference<>(channelsNewsFragment);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 26103, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            super.handleMessage(message);
            ChannelsNewsFragment channelsNewsFragment = this.f79738a.get();
            if (channelsNewsFragment == null || !channelsNewsFragment.isActive()) {
                return;
            }
            int i10 = message.what;
            if (i10 == 1) {
                ChannelsNewsFragment.x4(channelsNewsFragment, (String) message.obj);
            } else {
                if (i10 != 2) {
                    return;
                }
                ChannelsNewsFragment.y4(channelsNewsFragment);
            }
        }
    }

    private void E4(String str) {
        io.reactivex.z<Result<ConceptFeedsResult>> zVarF9;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 26056, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        int i10 = this.f79711n;
        if (i10 == 2) {
            Map<String, String> mapH4 = H4();
            mapH4.put("is_first", Q ? "1" : "0");
            if ("-1".equals(this.f79700c)) {
                String strF4 = F4();
                String strG4 = G4();
                if (!com.max.hbcommon.utils.c.u(strF4)) {
                    mapH4.put("news_list_group", strF4);
                }
                if (!com.max.hbcommon.utils.c.u(strG4)) {
                    mapH4.put("news_list_type", strG4);
                }
            }
            Q = false;
            zVarF9 = com.max.xiaoheihe.network.i.a().E8(this.f79703f, 30, this.f79700c, this.f79704g, mapH4);
        } else if (i10 == 1) {
            zVarF9 = com.max.xiaoheihe.network.i.a().E8(this.f79703f, 30, null, this.f79704g, H4());
        } else {
            HashMap map = new HashMap(16);
            Map<String, String> map2 = this.f79702e;
            if (map2 != null) {
                map.putAll(map2);
            }
            zVarF9 = com.max.xiaoheihe.network.i.a().f9(this.f79699b, map, this.f79704g);
        }
        addDisposable((io.reactivex.disposables.b) zVarF9.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g(str)));
    }

    public static String F4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 26042, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (!com.max.hbcommon.utils.c.u(O)) {
            return O;
        }
        String strO = com.max.hbcache.c.o("news_list_group", null);
        O = strO;
        return strO;
    }

    public static String G4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 26043, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (!com.max.hbcommon.utils.c.u(P)) {
            return P;
        }
        String strO = com.max.hbcache.c.o("news_list_type", "normal");
        P = strO;
        return strO;
    }

    private Map<String, String> H4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26067, new Class[0], Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        return AccelWorldBBSKt.h(null, null, null, null, "-1".equals(this.f79700c) ? BBSLinkObj.REC_MARK_TIMELINE : "tags", null, null, null, null, null);
    }

    private void I4() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26054, new Class[0], Void.TYPE).isSupported && this.f79716s) {
            try {
                this.f79717t.removeMessages(1);
                this.mUpdateTipsTextView.setVisibility(0);
                float fV = ViewUtils.V(this.mUpdateTipsTextView) + ((ViewGroup.MarginLayoutParams) this.mUpdateTipsTextView.getLayoutParams()).bottomMargin;
                this.mUpdateTipsTextView.setTranslationY(0.0f);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.mUpdateTipsTextView, "translationY", 0.0f, fV);
                objectAnimatorOfFloat.addListener(new f());
                addValueAnimator(objectAnimatorOfFloat);
                objectAnimatorOfFloat.start();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            this.f79716s = false;
        }
    }

    public static ChannelsNewsFragment J4(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 26044, new Class[]{String.class, String.class}, ChannelsNewsFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (ChannelsNewsFragment) patchProxyResultProxy.result;
        }
        ChannelsNewsFragment channelsNewsFragment = new ChannelsNewsFragment();
        Bundle bundle = new Bundle();
        bundle.putString("tag", str);
        bundle.putString(B, str2);
        channelsNewsFragment.setArguments(bundle);
        return channelsNewsFragment;
    }

    public static ChannelsNewsFragment K4(String str, HashMap<String, String> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, map}, null, changeQuickRedirect, true, 26045, new Class[]{String.class, HashMap.class}, ChannelsNewsFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (ChannelsNewsFragment) patchProxyResultProxy.result;
        }
        ChannelsNewsFragment channelsNewsFragment = new ChannelsNewsFragment();
        Bundle bundle = new Bundle();
        bundle.putString("topic_id", str);
        bundle.putSerializable("extra_params", map);
        channelsNewsFragment.setArguments(bundle);
        return channelsNewsFragment;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private void L4(int i10, int i11, int i12) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 26060, new Class[]{cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        U4();
        if (i10 > 0) {
            this.f79705h.notifyItemRangeInserted(i11, i12);
        } else {
            this.f79705h.notifyDataSetChanged();
        }
    }

    private void M4(List<FeedsContentBaseObj> list, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{list, str, str2}, this, changeQuickRedirect, false, 26057, new Class[]{List.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        N4(str, list);
        this.f79704g = str2;
    }

    private void N4(String str, List<FeedsContentBaseObj> list) {
        if (PatchProxy.proxy(new Object[]{str, list}, this, changeQuickRedirect, false, 26059, new Class[]{String.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (list != null) {
            boolean z10 = "-1".equals(this.f79700c) && "rec".equals(P);
            int i10 = this.f79711n;
            if (i10 == 2) {
                if (this.f79713p) {
                    this.f79713p = false;
                    this.f79706i.clear();
                } else if (z10 || this.f79703f != 0) {
                    O4(list);
                } else {
                    this.f79706i.clear();
                }
            } else if (i10 == 1) {
                if (this.f79703f == 0) {
                    this.f79706i.clear();
                } else {
                    O4(list);
                }
            } else if (this.f79704g == null) {
                this.f79706i.clear();
            }
            int size = this.f79706i.size();
            int size2 = list.size();
            if (!z10) {
                this.f79706i.addAll(list);
                L4(size, size, size2);
                return;
            }
            if (!I.equals(str)) {
                this.f79706i.addAll(list);
                L4(size, size, size2);
                return;
            }
            if (this.f79706i.size() > 0 && list.size() > 0) {
                Iterator<FeedsContentBaseObj> it = this.f79706i.iterator();
                while (it.hasNext()) {
                    if ("1".equals(it.next().getIs_update())) {
                        it.remove();
                    }
                }
                FeedsContentBaseObj feedsContentBaseObj = new FeedsContentBaseObj();
                feedsContentBaseObj.setIs_update("1");
                this.f79706i.add(0, feedsContentBaseObj);
                size2++;
            }
            this.f79706i.addAll(0, list);
            L4(size, 0, size2);
        }
    }

    private void O4(List<FeedsContentBaseObj> list) {
        if (!PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 26058, new Class[]{List.class}, Void.TYPE).isSupported && this.f79706i.size() > 0 && list.size() > 0) {
            ArrayList<FeedsContentBaseObj> arrayList = this.f79706i;
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

    private void P4(int i10) {
        RecyclerView recyclerView;
        int i11;
        AbsVideoView absVideoView;
        int i12 = 0;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 26065, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (recyclerView = this.mRecyclerView) == null || !(recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.mRecyclerView.getLayoutManager();
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition != -1 && iFindLastVisibleItemPosition != -1) {
            i12 = (iFindLastVisibleItemPosition - iFindFirstVisibleItemPosition) + 1;
        }
        if (i12 > 0) {
            while (iFindFirstVisibleItemPosition < iFindLastVisibleItemPosition + 1) {
                View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                if (viewFindViewByPosition != null && (viewFindViewByPosition.getTag() instanceof BBSLinkObj) && "12".equals(((BBSLinkObj) viewFindViewByPosition.getTag()).getContent_type())) {
                    Rect rect = new Rect();
                    int height = viewFindViewByPosition.getHeight();
                    if (height > 0 && viewFindViewByPosition.getLocalVisibleRect(rect) && (i11 = rect.top) > 0 && ((height - i11) * 100) / height < 50 && (absVideoView = (AbsVideoView) viewFindViewByPosition.findViewById(R.id.video_view)) != null && i10 > 0) {
                        absVideoView.Z();
                    }
                }
                iFindFirstVisibleItemPosition++;
            }
        }
    }

    private void Q4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 26053, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V4(str);
        if (!this.f79716s) {
            this.mUpdateTipsTextView.setVisibility(0);
            float fV = ViewUtils.V(this.mUpdateTipsTextView) + ((ViewGroup.MarginLayoutParams) this.mUpdateTipsTextView.getLayoutParams()).bottomMargin;
            this.mUpdateTipsTextView.setTranslationY(fV);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.mUpdateTipsTextView, "translationY", fV, 0.0f);
            addValueAnimator(objectAnimatorOfFloat);
            objectAnimatorOfFloat.start();
            this.f79716s = true;
        }
        this.f79717t.removeMessages(2);
        this.f79717t.sendMessageDelayed(this.f79717t.obtainMessage(2), 1500L);
    }

    private void R4(BannerViewPager bannerViewPager) {
        if (PatchProxy.proxy(new Object[]{bannerViewPager}, this, changeQuickRedirect, false, 26070, new Class[]{BannerViewPager.class}, Void.TYPE).isSupported || bannerViewPager == null) {
            return;
        }
        bannerViewPager.B0();
    }

    private void S4(BannerViewPager bannerViewPager) {
        if (PatchProxy.proxy(new Object[]{bannerViewPager}, this, changeQuickRedirect, false, 26069, new Class[]{BannerViewPager.class}, Void.TYPE).isSupported || bannerViewPager == null) {
            return;
        }
        bannerViewPager.D0();
    }

    private void T4(ViewGroup viewGroup, AbsVideoView absVideoView, boolean z10) {
        if (PatchProxy.proxy(new Object[]{viewGroup, absVideoView, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 26064, new Class[]{ViewGroup.class, AbsVideoView.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            com.max.xiaoheihe.module.video.b bVar = this.f79710m;
            if (bVar != null) {
                bVar.c(absVideoView, viewGroup);
                return;
            }
            return;
        }
        com.max.xiaoheihe.module.video.b bVar2 = this.f79710m;
        if (bVar2 != null) {
            bVar2.e();
        }
    }

    private void U4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26061, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (int i10 = 0; i10 < this.f79706i.size(); i10++) {
            if (BBSLinkObj.CONTENT_TYPE_REC_WRITE_ARTICLE.equals(this.f79706i.get(i10).getContent_type()) && i10 > 0) {
                this.f79706i.get(i10 - 1).setShowDivider(false);
            }
        }
    }

    private void V4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 26055, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.mUpdateTipsTextView.setText(str);
    }

    static /* synthetic */ void c4(ChannelsNewsFragment channelsNewsFragment, ViewGroup viewGroup, AbsVideoView absVideoView, boolean z10) {
        if (PatchProxy.proxy(new Object[]{channelsNewsFragment, viewGroup, absVideoView, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 26072, new Class[]{ChannelsNewsFragment.class, ViewGroup.class, AbsVideoView.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        channelsNewsFragment.T4(viewGroup, absVideoView, z10);
    }

    static /* synthetic */ int j4(ChannelsNewsFragment channelsNewsFragment, int i10) {
        int i11 = channelsNewsFragment.f79703f + i10;
        channelsNewsFragment.f79703f = i11;
        return i11;
    }

    static /* synthetic */ void n4(ChannelsNewsFragment channelsNewsFragment, BannerViewPager bannerViewPager) {
        if (PatchProxy.proxy(new Object[]{channelsNewsFragment, bannerViewPager}, null, changeQuickRedirect, true, 26073, new Class[]{ChannelsNewsFragment.class, BannerViewPager.class}, Void.TYPE).isSupported) {
            return;
        }
        channelsNewsFragment.S4(bannerViewPager);
    }

    static /* synthetic */ void o4(ChannelsNewsFragment channelsNewsFragment, String str) {
        if (PatchProxy.proxy(new Object[]{channelsNewsFragment, str}, null, changeQuickRedirect, true, 26074, new Class[]{ChannelsNewsFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        channelsNewsFragment.E4(str);
    }

    static /* synthetic */ void p4(ChannelsNewsFragment channelsNewsFragment, int i10) {
        if (PatchProxy.proxy(new Object[]{channelsNewsFragment, new Integer(i10)}, null, changeQuickRedirect, true, 26075, new Class[]{ChannelsNewsFragment.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        channelsNewsFragment.P4(i10);
    }

    static /* synthetic */ void q4(ChannelsNewsFragment channelsNewsFragment, BannerViewPager bannerViewPager) {
        if (PatchProxy.proxy(new Object[]{channelsNewsFragment, bannerViewPager}, null, changeQuickRedirect, true, 26076, new Class[]{ChannelsNewsFragment.class, BannerViewPager.class}, Void.TYPE).isSupported) {
            return;
        }
        channelsNewsFragment.R4(bannerViewPager);
    }

    static /* synthetic */ void r4(ChannelsNewsFragment channelsNewsFragment) {
        if (PatchProxy.proxy(new Object[]{channelsNewsFragment}, null, changeQuickRedirect, true, 26077, new Class[]{ChannelsNewsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        channelsNewsFragment.showError();
    }

    static /* synthetic */ void s4(ChannelsNewsFragment channelsNewsFragment, List list, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{channelsNewsFragment, list, str, str2}, null, changeQuickRedirect, true, 26078, new Class[]{ChannelsNewsFragment.class, List.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        channelsNewsFragment.M4(list, str, str2);
    }

    static /* synthetic */ void x4(ChannelsNewsFragment channelsNewsFragment, String str) {
        if (PatchProxy.proxy(new Object[]{channelsNewsFragment, str}, null, changeQuickRedirect, true, 26079, new Class[]{ChannelsNewsFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        channelsNewsFragment.Q4(str);
    }

    static /* synthetic */ void y4(ChannelsNewsFragment channelsNewsFragment) {
        if (PatchProxy.proxy(new Object[]{channelsNewsFragment}, null, changeQuickRedirect, true, 26080, new Class[]{ChannelsNewsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        channelsNewsFragment.I4();
    }

    @Override // com.max.xiaoheihe.view.callback.a
    public void D3() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26068, new Class[0], Void.TYPE).isSupported && isActive()) {
            this.f79712o = true;
            this.mRecyclerView.scrollToPosition(0);
            this.mRefreshLayout.F();
        }
    }

    @Override // rb.a, rb.c
    @androidx.annotation.p0
    public Bundle M() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26063, new Class[0], Bundle.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bundle) patchProxyResultProxy.result;
        }
        Bundle bundle = new Bundle();
        if (!com.max.hbcommon.utils.c.w(this.f79706i)) {
            bundle.putSerializable(f79696x, this.f79706i);
        }
        if (!com.max.hbcommon.utils.c.u(this.f79704g)) {
            bundle.putString(f79697y, this.f79704g);
        }
        return bundle;
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @androidx.annotation.p0
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26071, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        int i10 = this.f79711n;
        if (i10 == 2) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("tag", this.f79700c);
            jsonObject.addProperty(B, this.f79701d);
            return jsonObject.toString();
        }
        if (i10 != 0) {
            return null;
        }
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("topic_id", this.f79699b);
        Map<String, String> map = this.f79702e;
        if (map != null) {
            for (String str : map.keySet()) {
                jsonObject2.addProperty(str, this.f79702e.get(str));
            }
        }
        return jsonObject2.toString();
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @androidx.annotation.p0
    public String getPagePath() {
        int i10 = this.f79711n;
        if (i10 == 2) {
            return lb.d.f131246s;
        }
        if (i10 == 0) {
            return lb.d.f131185j1;
        }
        return null;
    }

    @Override // com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26050, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.x("ChannelsNewsFragment, initData, mList = " + this.f79706i.size() + ", lastval = " + this.f79704g);
        if (!this.f79706i.isEmpty()) {
            L4(0, 0, this.f79706i.size());
        } else {
            showLoading();
            E4(I);
        }
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26049, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.fragment_news_list);
        this.mUnBinder = ButterKnife.f(this, view);
        if (getArguments() != null) {
            this.f79699b = getArguments().getString("topic_id");
            this.f79700c = getArguments().getString("tag");
            this.f79701d = getArguments().getString(B);
            this.f79702e = (HashMap) getArguments().getSerializable("extra_params");
        }
        String str = this.f79700c;
        if (str != null) {
            this.f79711n = 2;
        } else if (str == null && this.f79702e == null) {
            this.f79711n = 1;
        } else {
            this.f79711n = 0;
        }
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        b bVar = new b(this.mContext, this.f79706i, this.f79720w, this.mRecyclerView);
        this.f79705h = bVar;
        this.mRecyclerView.setAdapter(bVar);
        this.mRefreshLayout.setBackgroundResource(R.color.background_layer_2_color);
        this.mRefreshLayout.S(new c());
        this.mRefreshLayout.f0(new d());
        this.mRecyclerView.setItemAnimator(null);
        this.mRecyclerView.clearOnScrollListeners();
        this.mRecyclerView.addOnScrollListener(new e());
        this.f79719v = new i(this, this.mRecyclerView, FeedsContentBaseObj.class);
        new OneTimeValidExposureWatcher(this, this.mRecyclerView);
        NewMsgBroadcastReceiver newMsgBroadcastReceiver = new NewMsgBroadcastReceiver(this, null);
        this.f79718u = newMsgBroadcastReceiver;
        registerReceiver(newMsgBroadcastReceiver, lb.a.K);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 26046, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onAttach(context);
        if (getParentFragment() instanceof com.max.xiaoheihe.module.video.b) {
            this.f79710m = (com.max.xiaoheihe.module.video.b) getParentFragment();
            return;
        }
        if (context instanceof com.max.xiaoheihe.module.video.b) {
            this.f79710m = (com.max.xiaoheihe.module.video.b) context;
            return;
        }
        throw new RuntimeException(getParentFragment() + " or " + context + " must implement NewsListInteractionListener");
    }

    @Override // rb.a, com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26066, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (ad.a.d()) {
            this.f79715r = null;
            this.f79714q = null;
            this.f79717t = null;
            this.f79718u = null;
            this.f79705h = null;
            this.f79710m = null;
            this.f79719v = null;
        }
        this.f79706i.clear();
        this.f79707j.clear();
        this.f79708k.clear();
        this.f79709l.clear();
        super.onDestroy();
    }

    @Override // rb.a, com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26052, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        unregisterReceiver(this.f79718u);
        this.f79717t.removeCallbacksAndMessages(null);
        if (this.f79709l.size() > 0) {
            Iterator<AbsVideoView> it = this.f79709l.iterator();
            while (it.hasNext()) {
                it.next().Q();
            }
            this.f79709l.clear();
        }
        com.max.xiaoheihe.module.news.adapter.a aVar = this.f79705h;
        if (aVar != null) {
            aVar.n();
        }
        super.onDestroyView();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26047, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetach();
        this.f79710m = null;
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26062, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        E4(I);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26051, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStop();
        if (this.f79709l.size() > 0) {
            Iterator<AbsVideoView> it = this.f79709l.iterator();
            while (it.hasNext()) {
                it.next().Z();
            }
        }
    }

    @Override // rb.a, rb.c
    public void p3(@androidx.annotation.p0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 26048, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.p3(bundle);
        if (bundle != null) {
            Serializable serializable = bundle.getSerializable(f79696x);
            if (serializable instanceof ArrayList) {
                ArrayList<FeedsContentBaseObj> arrayList = (ArrayList) serializable;
                this.f79706i = arrayList;
                this.f79703f = arrayList.size();
            }
            this.f79704g = bundle.getString(f79697y);
        }
    }
}
