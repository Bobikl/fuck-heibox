package com.max.xiaoheihe.module.bbs;

import android.animation.ArgbEvaluator;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbcommon.component.TitleBar;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.WebExtraObj;
import com.max.xiaoheihe.bean.account.TimestampResultObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkListResultObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.TopicNavObj;
import com.max.xiaoheihe.module.account.WriteFeedbackActivity;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class TopicDetailFragment extends com.max.hbcommon.base.d implements LinkListV2Fragment.i {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f80092u = "h_src";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f80093v = "topic";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f80094w = "prefer";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f80095x = "all_tab";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f80096y = "current_tab_position";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f80097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BBSTopicObj f80098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f80099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BBSUserInfoObj f80100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f80101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f80102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f80103h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f80104i;

    @BindView(R.id.iv_follow_status)
    ImageView iv_follow_status;

    @BindView(R.id.iv_game_arrow)
    ImageView iv_game_arrow;

    @BindView(R.id.iv_game_icon)
    ImageView iv_game_icon;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList<KeyDescObj> f80105j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private androidx.viewpager.widget.a f80106k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f80107l;

    @BindView(R.id.ll_nav)
    LinearLayout ll_nav;

    @BindView(R.id.ll_related_topics)
    LinearLayout ll_related_topics;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f80108m;

    @BindView(R.id.abl)
    AppBarLayout mAppBarLayout;

    @BindView(R.id.iv_bg_bottom_gradient)
    ImageView mBGBottomGradientImageView;

    @BindView(R.id.iv_bg_bottom_scrim)
    ImageView mBGBottomScrimImageView;

    @BindView(R.id.iv_bg_color)
    ImageView mBGColorImageView;

    @BindView(R.id.bg_container)
    View mBGContainer;

    @BindView(R.id.iv_bg_img)
    ImageView mBGImageView;

    @BindView(R.id.iv_bg_scrim)
    ImageView mBGScrimImageView;

    @BindView(R.id.iv_bg_top_scrim)
    ImageView mBGTopScrimImageView;

    @BindView(R.id.ctl)
    CollapsingToolbarLayout mCollapsingToolbarLayout;

    @BindView(R.id.vg_header_container)
    View mHeaderContainerView;

    @BindView(R.id.filter_desc_divider)
    View mSortFilterDividerView;

    @BindView(R.id.tv_filter_desc)
    TextView mSortFilterTextView;

    @BindView(R.id.vg_sort_header)
    View mSortView;

    @BindView(R.id.status_bar)
    View mStatusBar;

    @BindView(R.id.toolbar)
    TitleBar mToolbar;

    @BindView(R.id.tv_topic_name)
    TextView mTopicNameTextView;

    @BindView(R.id.vg_topic_provisions)
    View mTopicProvisionsView;

    @BindView(R.id.vg_topic_to_forbid_history)
    View mTopicToForbidHistoryView;

    @BindView(R.id.vg_topic_to_wiki)
    View mTopicToWikiView;

    @BindView(R.id.tl)
    TabLayout mTypeFilterTabLayout;

    @BindView(R.id.iv_user_avatar)
    ImageView mUserAvatarImageView;

    @BindView(R.id.vg_user_forbid_info)
    View mUserForbidInfoView;

    @BindView(R.id.tv_user_name)
    TextView mUserNameTextView;

    @BindView(R.id.vp)
    ViewPager mViewPager;

    @BindView(R.id.iv_write_post)
    ImageView mWritePostImageView;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f80109n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f80110o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f80111p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private AppBarLayout.f f80112q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private NewMsgBroadcastReceiver f80113r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private View f80114s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.max.xiaoheihe.utils.u f80115t;

    @BindView(R.id.v_related_topics_divider)
    View v_related_topics_divider;

    @BindView(R.id.vg_game_icon)
    ViewGroup vg_game_icon;

    @BindView(R.id.vg_related_topics)
    ViewGroup vg_related_topics;

    @BindView(R.id.vg_topic_entry)
    ViewGroup vg_topic_entry;

    @BindView(R.id.vg_topic_name)
    ViewGroup vg_topic_name;

    public class NewMsgBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private NewMsgBroadcastReceiver() {
        }

        /* synthetic */ NewMsgBroadcastReceiver(TopicDetailFragment topicDetailFragment, k kVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 26931, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported && lb.a.f131025q.equals(intent.getAction())) {
                TopicDetailFragment.u4(TopicDetailFragment.this);
            }
        }
    }

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26902, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            androidx.viewpager.widget.a aVar = TopicDetailFragment.this.f80106k;
            ViewPager viewPager = TopicDetailFragment.this.mViewPager;
            Object objInstantiateItem = aVar.instantiateItem((ViewGroup) viewPager, viewPager.getCurrentItem());
            if (objInstantiateItem instanceof LinkListV2Fragment) {
                ((LinkListV2Fragment) objInstantiateItem).v4();
                TopicDetailFragment.this.f80111p = 0;
                TopicDetailFragment.this.mAppBarLayout.setExpanded(true);
                TopicDetailFragment.U3(TopicDetailFragment.this, false);
            }
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26903, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            WebExtraObj webExtraObj = new WebExtraObj();
            webExtraObj.setChooseTopic("1");
            TopicDetailFragment topicDetailFragment = TopicDetailFragment.this;
            topicDetailFragment.startActivity(WriteFeedbackActivity.u2(((com.max.hbcommon.base.d) topicDetailFragment).mContext, "0", "0", null, webExtraObj));
        }
    }

    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26904, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) TopicDetailFragment.this).mContext, TopicDetailFragment.this.f80098c.getProvisions().getProtocol());
        }
    }

    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f80120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f80121c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f80122d;

        d(String str, String str2, String str3) {
            this.f80120b = str;
            this.f80121c = str2;
            this.f80122d = str3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26905, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!com.max.hbcommon.utils.c.u(this.f80120b) && !this.f80120b.contains(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
                ((com.max.hbcommon.base.d) TopicDetailFragment.this).mContext.startActivity(com.max.xiaoheihe.module.game.z.b(((com.max.hbcommon.base.d) TopicDetailFragment.this).mContext, TopicDetailFragment.this.f80098c.getH_src(), this.f80120b, this.f80121c, null, com.max.xiaoheihe.utils.i0.m(), com.max.xiaoheihe.utils.i0.j(), com.max.xiaoheihe.module.game.z.f88582c));
                return;
            }
            Intent intent = new Intent(((com.max.hbcommon.base.d) TopicDetailFragment.this).mContext, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", String.format(lb.a.N2, this.f80122d));
            intent.putExtra("title", TopicDetailFragment.this.getString(R.string.wiki));
            ((com.max.hbcommon.base.d) TopicDetailFragment.this).mContext.startActivity(intent);
        }
    }

    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f80124b;

        e(String str) {
            this.f80124b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26906, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) TopicDetailFragment.this).mContext, this.f80124b);
        }
    }

    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f80126b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f80127c;

        f(String str, String str2) {
            this.f80126b = str;
            this.f80127c = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26907, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((com.max.hbcommon.base.d) TopicDetailFragment.this).mContext.startActivity(com.max.xiaoheihe.module.game.z.b(((com.max.hbcommon.base.d) TopicDetailFragment.this).mContext, TopicDetailFragment.this.f80098c.getH_src(), this.f80126b, this.f80127c, null, com.max.xiaoheihe.utils.i0.m(), com.max.xiaoheihe.utils.i0.j(), null));
        }
    }

    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26908, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.bbs.m.S3(com.max.xiaoheihe.utils.i0.j()).show(TopicDetailFragment.this.getChildFragmentManager(), "ForbidHistoryFragment");
        }
    }

    public class h implements HeyBoxPopupMenu.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f80130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f80131b;

        h(ArrayList arrayList, TextView textView) {
            this.f80130a = arrayList;
            this.f80131b = textView;
        }

        @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
        public void a(View view, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 26909, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            for (KeyDescObj keyDescObj2 : this.f80130a) {
                keyDescObj2.setChecked(keyDescObj.getKey().equals(keyDescObj2.getKey()));
            }
            TopicDetailFragment.this.f80108m = keyDescObj.getKey();
            TopicDetailFragment.f4(TopicDetailFragment.this, keyDescObj, this.f80131b);
            int currentItem = TopicDetailFragment.this.mViewPager.getCurrentItem();
            Object objInstantiateItem = TopicDetailFragment.this.f80106k.instantiateItem((ViewGroup) TopicDetailFragment.this.mViewPager, currentItem);
            if (objInstantiateItem instanceof LinkListV2Fragment) {
                ((LinkListV2Fragment) objInstantiateItem).o4(((KeyDescObj) TopicDetailFragment.this.f80105j.get(currentItem)).getKey(), TopicDetailFragment.this.f80108m);
            }
        }
    }

    public class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements com.max.xiaoheihe.view.m {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.xiaoheihe.view.m
            public void a(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 26912, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                dialog.dismiss();
                TopicDetailFragment.m4(TopicDetailFragment.this, false);
                TopicDetailFragment topicDetailFragment = TopicDetailFragment.this;
                TopicDetailFragment.n4(topicDetailFragment, topicDetailFragment.f80098c.getTopic_id());
            }

            @Override // com.max.xiaoheihe.view.m
            public void b(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 26911, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                dialog.dismiss();
            }
        }

        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26910, new Class[]{View.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(((com.max.hbcommon.base.d) TopicDetailFragment.this).mContext)) {
                if (TopicDetailFragment.this.f80098c.getIs_follow() == 1) {
                    com.max.xiaoheihe.view.l.D(((com.max.hbcommon.base.d) TopicDetailFragment.this).mContext, "", ((com.max.hbcommon.base.d) TopicDetailFragment.this).mContext.getString(R.string.cancel_follow_topic_confirm), ((com.max.hbcommon.base.d) TopicDetailFragment.this).mContext.getString(R.string.confirm), ((com.max.hbcommon.base.d) TopicDetailFragment.this).mContext.getString(R.string.cancel), new a());
                    return;
                }
                TopicDetailFragment.m4(TopicDetailFragment.this, true);
                TopicDetailFragment topicDetailFragment = TopicDetailFragment.this;
                TopicDetailFragment.o4(topicDetailFragment, topicDetailFragment.f80098c.getTopic_id());
            }
        }
    }

    public class j extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 26913, new Class[]{Throwable.class}, Void.TYPE).isSupported && TopicDetailFragment.this.isActive()) {
                super.onError(th2);
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(TopicDetailFragment.this.getString(R.string.fail));
                TopicDetailFragment.p4(TopicDetailFragment.this);
            }
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 26914, new Class[]{Result.class}, Void.TYPE).isSupported && TopicDetailFragment.this.isActive()) {
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(TopicDetailFragment.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                super.onNext(result);
                TopicDetailFragment.this.f80098c.setIs_follow(1);
                Intent intent = new Intent();
                intent.setAction("com.heybox.refresh.topic");
                ((com.max.hbcommon.base.d) TopicDetailFragment.this).mContext.sendBroadcast(intent);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26915, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26901, new Class[]{View.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(((com.max.hbcommon.base.d) TopicDetailFragment.this).mContext)) {
                com.max.xiaoheihe.base.router.b.m(((com.max.hbcommon.base.d) TopicDetailFragment.this).mContext, TopicDetailFragment.this.f80098c).A();
            }
        }
    }

    public class l extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 26917, new Class[]{Throwable.class}, Void.TYPE).isSupported && TopicDetailFragment.this.isActive()) {
                super.onError(th2);
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(TopicDetailFragment.this.getString(R.string.fail));
                TopicDetailFragment.p4(TopicDetailFragment.this);
            }
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 26918, new Class[]{Result.class}, Void.TYPE).isSupported && TopicDetailFragment.this.isActive()) {
                super.onNext(result);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(TopicDetailFragment.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                TopicDetailFragment.this.f80098c.setIs_follow(0);
                Intent intent = new Intent();
                intent.setAction("com.heybox.refresh.topic");
                ((com.max.hbcommon.base.d) TopicDetailFragment.this).mContext.sendBroadcast(intent);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26919, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class m extends com.max.hbcommon.network.d<Result<TimestampResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        public void onNext(Result<TimestampResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 26920, new Class[]{Result.class}, Void.TYPE).isSupported || result == null || result.getResult() == null) {
                return;
            }
            String timestamp = result.getResult().getTimestamp();
            if (com.max.hbcommon.utils.c.u(timestamp) || com.max.hbutils.utils.n.r(timestamp) <= com.max.hbutils.utils.n.r(com.max.hbcache.c.o(com.max.hbcache.c.f66138o, ""))) {
                return;
            }
            com.max.hbcache.c.M(true);
            com.max.hbcache.c.C(com.max.hbcache.c.f66138o, String.valueOf(timestamp));
            Intent intent = new Intent();
            intent.setAction(lb.a.f131025q);
            ((com.max.hbcommon.base.d) TopicDetailFragment.this).mContext.sendBroadcast(intent);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26921, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TimestampResultObj>) obj);
        }
    }

    public class n implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26916, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.x0(((com.max.hbcommon.base.d) TopicDetailFragment.this).mContext, com.max.xiaoheihe.module.search.page.d.K.a(TopicDetailFragment.this.f80098c.getTopic_id())).A();
        }
    }

    public class o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26922, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.x0(((com.max.hbcommon.base.d) TopicDetailFragment.this).mContext, com.max.xiaoheihe.module.search.page.h.N.a(TopicDetailFragment.this.f80098c.getTopic_id())).A();
        }
    }

    public class p implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26923, new Class[]{View.class}, Void.TYPE).isSupported || com.max.xiaoheihe.utils.d.b1(TopicDetailFragment.this.getContext())) {
                return;
            }
            if (TopicDetailFragment.this.getContext() != null) {
                com.max.xiaoheihe.base.router.b.w(TopicDetailFragment.this.getContext()).A();
            }
            if (TopicDetailFragment.this.f80114s != null) {
                TopicDetailFragment.this.f80114s.setVisibility(8);
            }
            com.max.hbcache.c.M(false);
            Intent intent = new Intent();
            intent.setAction(lb.a.f131025q);
            TopicDetailFragment.this.getContext().sendBroadcast(intent);
        }
    }

    public class q extends androidx.fragment.app.n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        q(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26925, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : TopicDetailFragment.this.f80105j.size();
        }

        @Override // androidx.fragment.app.n0
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 26924, new Class[]{Integer.TYPE}, Fragment.class);
            return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : LinkListV2Fragment.n4(TopicDetailFragment.this.f80097b, LinkListV2Fragment.f79978z, TopicDetailFragment.this.f80098c.getTopic_id(), ((KeyDescObj) TopicDetailFragment.this.f80105j.get(i10)).getKey(), TopicDetailFragment.this.f80108m);
        }

        @Override // androidx.viewpager.widget.a
        @androidx.annotation.p0
        public CharSequence getPageTitle(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 26926, new Class[]{Integer.TYPE}, CharSequence.class);
            return patchProxyResultProxy.isSupported ? (CharSequence) patchProxyResultProxy.result : ((KeyDescObj) TopicDetailFragment.this.f80105j.get(i10)).getText();
        }
    }

    public class r implements AppBarLayout.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        r() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.f, com.google.android.material.appbar.AppBarLayout.b
        public void a(AppBarLayout appBarLayout, int i10) {
            int color;
            int color2;
            int color3;
            boolean z10 = false;
            if (PatchProxy.proxy(new Object[]{appBarLayout, new Integer(i10)}, this, changeQuickRedirect, false, 26927, new Class[]{AppBarLayout.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            float fAbs = (Math.abs(i10) * 1.0f) / (appBarLayout.getTotalScrollRange() - TopicDetailFragment.this.f80104i);
            if (fAbs <= 0.2f) {
                float f10 = ((-5.0f) * fAbs) + 1.0f;
                TopicDetailFragment.this.vg_topic_name.setAlpha(f10);
                TopicDetailFragment.this.mUserForbidInfoView.setAlpha(f10);
            } else {
                TopicDetailFragment.this.vg_topic_name.setAlpha(0.0f);
                TopicDetailFragment.this.mUserForbidInfoView.setAlpha(0.0f);
            }
            if (fAbs <= 0.2f) {
                color = TopicDetailFragment.this.getResources().getColor(R.color.transparent);
                color2 = TopicDetailFragment.this.getResources().getColor(R.color.transparent);
                color3 = TopicDetailFragment.this.getResources().getColor(R.color.white);
            } else {
                if (fAbs <= 0.3f) {
                    float f11 = (10.0f * fAbs) - 2.0f;
                    color = ((Integer) new ArgbEvaluator().evaluate(f11, Integer.valueOf(TopicDetailFragment.this.getResources().getColor(R.color.transparent)), Integer.valueOf(TopicDetailFragment.this.getResources().getColor(R.color.white)))).intValue();
                    color2 = ((Integer) new ArgbEvaluator().evaluate(f11, Integer.valueOf(TopicDetailFragment.this.getResources().getColor(R.color.transparent)), Integer.valueOf(TopicDetailFragment.this.getResources().getColor(R.color.text_primary_1_color)))).intValue();
                    color3 = ((Integer) new ArgbEvaluator().evaluate(f11, Integer.valueOf(TopicDetailFragment.this.getResources().getColor(R.color.white)), Integer.valueOf(TopicDetailFragment.this.getResources().getColor(R.color.text_primary_1_color)))).intValue();
                } else {
                    color = TopicDetailFragment.this.getResources().getColor(R.color.white);
                    color2 = TopicDetailFragment.this.getResources().getColor(R.color.text_primary_1_color);
                    color3 = TopicDetailFragment.this.getResources().getColor(R.color.text_primary_1_color);
                }
                z10 = true;
            }
            TopicDetailFragment.this.mToolbar.setBackgroundColor(color);
            TopicDetailFragment.this.mStatusBar.setBackgroundColor(color);
            com.max.hbutils.utils.t.M(((com.max.hbcommon.base.d) TopicDetailFragment.this).mContext, z10);
            TopicDetailFragment.this.mToolbar.getAppbarNavButtonView().setColorFilter(color3);
            TopicDetailFragment.this.mToolbar.getAppbarTitleTextView().setTextColor(color2);
            TopicDetailFragment.this.mToolbar.getAppbarActionTextView().setTextColor(color3);
            TopicDetailFragment.this.mToolbar.getAppbarActionButtonView().setColorFilter(color3);
            TopicDetailFragment.this.mToolbar.getAppbarActionButtonXView().setColorFilter(color3);
            float f12 = fAbs >= 0.75f ? (fAbs * (-4.0f)) + 4.0f : 1.0f;
            TopicDetailFragment.this.mBGContainer.setAlpha(f12);
            TopicDetailFragment.this.mTopicToWikiView.setAlpha(f12);
            TopicDetailFragment.this.mTopicProvisionsView.setAlpha(f12);
            TopicDetailFragment.this.mTopicToForbidHistoryView.setAlpha(f12);
        }
    }

    public class s implements AppBarLayout.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        s() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.f, com.google.android.material.appbar.AppBarLayout.b
        public void a(AppBarLayout appBarLayout, int i10) {
            if (PatchProxy.proxy(new Object[]{appBarLayout, new Integer(i10)}, this, changeQuickRedirect, false, 26928, new Class[]{AppBarLayout.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            float fAbs = (Math.abs(i10) * 1.0f) / (appBarLayout.getTotalScrollRange() - TopicDetailFragment.this.f80104i);
            float f10 = fAbs >= 0.75f ? (fAbs * (-4.0f)) + 4.0f : 1.0f;
            TopicDetailFragment.this.mBGContainer.setAlpha(f10);
            TopicDetailFragment.this.mTopicToWikiView.setAlpha(f10);
            TopicDetailFragment.this.mTopicProvisionsView.setAlpha(f10);
            TopicDetailFragment.this.mTopicToForbidHistoryView.setAlpha(f10);
        }
    }

    public class t implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BBSTopicObj f80145b;

        t(BBSTopicObj bBSTopicObj) {
            this.f80145b = bBSTopicObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26929, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((com.max.hbcommon.base.d) TopicDetailFragment.this).mContext.startActivity(TopicDetailActivity.M1(((com.max.hbcommon.base.d) TopicDetailFragment.this).mContext, this.f80145b.getH_src(), this.f80145b, null));
        }
    }

    public class u implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f80147b;

        u(List list) {
            this.f80147b = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26930, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            TopicDetailFragment topicDetailFragment = TopicDetailFragment.this;
            TopicDetailFragment.R3(topicDetailFragment, topicDetailFragment.mSortFilterTextView, this.f80147b);
        }
    }

    private void A4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 26889, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().n5(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new l()));
    }

    private void B4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26891, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().ob().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new m()));
    }

    private void C4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 26888, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Y6(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new j()));
    }

    private void E4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 26887, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbsearch.o.i(str);
    }

    private void F4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26882, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mBGColorImageView.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = this.mBGImageView.getLayoutParams();
        int i10 = layoutParams.height;
        int i11 = this.f80101f;
        if (i10 != i11) {
            layoutParams.height = i11;
            this.mBGImageView.setLayoutParams(layoutParams);
        }
        this.mBGImageView.setImageDrawable(getResources().getDrawable(R.drawable.bbs_default_placeholder_topic_375x336));
        this.mBGScrimImageView.setVisibility(8);
        this.mBGTopScrimImageView.setVisibility(8);
        this.mBGBottomGradientImageView.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, this.f80103h);
        layoutParams2.addRule(8, R.id.iv_bg_img);
        this.mBGBottomScrimImageView.setLayoutParams(layoutParams2);
        this.mBGBottomScrimImageView.setBackgroundDrawable(getResources().getDrawable(R.drawable.topic_bg_gradient_to_top));
    }

    private void G4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26875, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (getActivity() instanceof TopicDetailActivity) {
            CollapsingToolbarLayout.LayoutParams layoutParams = (CollapsingToolbarLayout.LayoutParams) this.mToolbar.getLayoutParams();
            layoutParams.c(1);
            this.mToolbar.setLayoutParams(layoutParams);
            this.mToolbar.a0();
            com.max.hbutils.utils.t.h0(this.mContext.getWindow());
            AppBarLayout.LayoutParams layoutParams2 = (AppBarLayout.LayoutParams) this.mCollapsingToolbarLayout.getLayoutParams();
            layoutParams2.h(3);
            this.mCollapsingToolbarLayout.setLayoutParams(layoutParams2);
            if (this.f80112q == null) {
                r rVar = new r();
                this.f80112q = rVar;
                this.mAppBarLayout.e(rVar);
                return;
            }
            return;
        }
        CollapsingToolbarLayout.LayoutParams layoutParams3 = (CollapsingToolbarLayout.LayoutParams) this.mToolbar.getLayoutParams();
        layoutParams3.c(0);
        this.mToolbar.setLayoutParams(layoutParams3);
        AppBarLayout.LayoutParams layoutParams4 = (AppBarLayout.LayoutParams) this.mCollapsingToolbarLayout.getLayoutParams();
        layoutParams4.h(1);
        this.mCollapsingToolbarLayout.setLayoutParams(layoutParams4);
        this.mToolbar.getAppbarActionButtonView().setColorFilter(getResources().getColor(R.color.white));
        this.mToolbar.getAppbarActionButtonXView().setColorFilter(getResources().getColor(R.color.white));
        if (this.f80112q == null) {
            s sVar = new s();
            this.f80112q = sVar;
            this.mAppBarLayout.e(sVar);
        }
    }

    public static TopicDetailFragment H4(String str, BBSTopicObj bBSTopicObj, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, bBSTopicObj, str2}, null, changeQuickRedirect, true, 26871, new Class[]{String.class, BBSTopicObj.class, String.class}, TopicDetailFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (TopicDetailFragment) patchProxyResultProxy.result;
        }
        TopicDetailFragment topicDetailFragment = new TopicDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putString("h_src", str);
        bundle.putSerializable("topic", bBSTopicObj);
        bundle.putString(f80094w, str2);
        topicDetailFragment.setArguments(bundle);
        return topicDetailFragment;
    }

    private void I4(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 26879, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            this.mToolbar.setTitle(getString(R.string.back_to_top));
            this.mToolbar.getAppbarTitleTextView().setOnClickListener(new a());
        } else {
            this.mToolbar.setTitle(this.f80098c.getName());
            this.mToolbar.getAppbarTitleTextView().setClickable(false);
        }
    }

    private void J4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26881, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f80098c.getHb2style() == null) {
            F4();
            return;
        }
        if (com.max.hbcommon.utils.c.u(this.f80098c.getHb2style().getBg_pic())) {
            if (com.max.hbcommon.utils.c.u(this.f80098c.getHb2style().getBg_color())) {
                F4();
                return;
            }
            this.mBGColorImageView.setVisibility(0);
            this.mBGColorImageView.setBackgroundColor(com.max.xiaoheihe.utils.d.e1(this.f80098c.getHb2style().getBg_color()));
            ViewGroup.LayoutParams layoutParams = this.mBGImageView.getLayoutParams();
            int i10 = layoutParams.height;
            int i11 = this.f80101f;
            if (i10 != i11) {
                layoutParams.height = i11;
                this.mBGImageView.setLayoutParams(layoutParams);
            }
            this.mBGImageView.setImageDrawable(getResources().getDrawable(R.drawable.bbs_default_placeholder_topic_375x336));
            this.mBGScrimImageView.setVisibility(8);
            this.mBGTopScrimImageView.setVisibility(8);
            this.mBGBottomGradientImageView.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, this.f80103h);
            layoutParams2.addRule(8, R.id.iv_bg_img);
            this.mBGBottomScrimImageView.setLayoutParams(layoutParams2);
            this.mBGBottomScrimImageView.setBackgroundDrawable(getResources().getDrawable(R.drawable.topic_bg_gradient_to_top));
            return;
        }
        this.mBGColorImageView.setVisibility(8);
        int i12 = this.f80101f - this.f80103h;
        ViewGroup.LayoutParams layoutParams3 = this.mBGImageView.getLayoutParams();
        if (layoutParams3.height != i12) {
            layoutParams3.height = i12;
            this.mBGImageView.setLayoutParams(layoutParams3);
        }
        com.max.hbimage.b.M(this.f80098c.getHb2style().getBg_pic(), this.mBGImageView, 0, -1);
        this.mBGScrimImageView.setVisibility(0);
        this.mBGTopScrimImageView.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.mBGTopScrimImageView.getLayoutParams();
        layoutParams4.height = this.f80102g;
        this.mBGTopScrimImageView.setLayoutParams(layoutParams4);
        this.mBGTopScrimImageView.setBackgroundDrawable(getResources().getDrawable(R.drawable.img_scrim_gradient_to_top));
        this.mBGBottomGradientImageView.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, this.f80103h);
        layoutParams5.addRule(3, R.id.iv_bg_img);
        this.mBGBottomGradientImageView.setLayoutParams(layoutParams5);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, this.f80103h);
        layoutParams6.addRule(3, R.id.iv_bg_img);
        this.mBGBottomScrimImageView.setLayoutParams(layoutParams6);
        this.mBGBottomScrimImageView.setBackgroundDrawable(getResources().getDrawable(R.drawable.topic_bg_gradient_to_top));
    }

    private void K4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26874, new Class[0], Void.TYPE).isSupported || this.f80114s == null) {
            return;
        }
        if (com.max.xiaoheihe.utils.i0.s() && com.max.hbcache.c.v()) {
            this.f80114s.setVisibility(0);
        } else {
            this.f80114s.setVisibility(8);
        }
    }

    private void L4(KeyDescObj keyDescObj, TextView textView) {
        if (PatchProxy.proxy(new Object[]{keyDescObj, textView}, this, changeQuickRedirect, false, 26883, new Class[]{KeyDescObj.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        bb.d.d(textView, 0);
        textView.setText(String.format("%s %s", keyDescObj.getText(), lb.b.f131094j));
    }

    private void M4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26880, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String appid = this.f80098c.getGame() != null ? this.f80098c.getGame().getAppid() : null;
        String game_type = this.f80098c.getGame() != null ? this.f80098c.getGame().getGame_type() : null;
        String wiki_id = this.f80098c.getWiki() != null ? this.f80098c.getWiki().getWiki_id() : null;
        if (getActivity() instanceof TopicDetailActivity) {
            this.mToolbar.setTitle(this.f80098c.getName());
        }
        this.mTopicNameTextView.setText(this.f80098c.getName());
        if (BBSTopicObj.TOPIC_ID_FORBID.equals(this.f80098c.getTopic_id())) {
            this.iv_follow_status.setImageResource(R.drawable.ic_appeal);
            this.iv_follow_status.setOnClickListener(new b());
        } else {
            N4();
        }
        if (BBSTopicObj.TOPIC_ID_FORBID.equals(this.f80098c.getTopic_id()) && com.max.xiaoheihe.utils.i0.s() && this.f80100e != null) {
            this.mUserForbidInfoView.setVisibility(0);
            com.max.hbimage.b.I(this.f80100e.getAvartar(), this.mUserAvatarImageView, R.drawable.common_default_avatar_40x40);
            if (com.max.hbcommon.utils.c.u(this.f80100e.getForbid_duration())) {
                this.mUserNameTextView.setText(this.f80100e.getForbid_info());
                this.iv_follow_status.setVisibility(8);
            } else {
                String forbid_duration = this.f80100e.getForbid_duration();
                SpannableString spannableString = new SpannableString(this.f80100e.getForbid_info() + "，" + forbid_duration);
                spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.badge_bg_color)), spannableString.length() - forbid_duration.length(), spannableString.length(), 33);
                this.mUserNameTextView.setText(spannableString);
                this.iv_follow_status.setVisibility(0);
            }
        } else {
            this.mUserForbidInfoView.setVisibility(8);
        }
        J4();
        if (this.f80098c.getProvisions() == null || com.max.hbcommon.utils.c.u(this.f80098c.getProvisions().getProtocol())) {
            this.mTopicProvisionsView.setVisibility(8);
        } else {
            this.mTopicProvisionsView.setVisibility(0);
            this.mTopicProvisionsView.setOnClickListener(new c());
        }
        if (BBSTopicObj.TOPIC_ID_FORBID.equals(this.f80098c.getTopic_id()) || this.f80098c.getWiki() == null || com.max.hbcommon.utils.c.u(this.f80098c.getWiki().getWiki_id())) {
            this.mTopicToWikiView.setVisibility(8);
        } else {
            this.mTopicToWikiView.setVisibility(0);
            this.mTopicToWikiView.setOnClickListener(new d(appid, game_type, wiki_id));
        }
        if (com.max.hbcommon.utils.c.w(this.f80098c.getHeader_nav())) {
            this.ll_nav.setVisibility(8);
        } else {
            this.ll_nav.setVisibility(0);
            this.ll_nav.removeAllViews();
            for (TopicNavObj topicNavObj : this.f80098c.getHeader_nav()) {
                View viewInflate = this.mInflater.inflate(R.layout.layout_topic_nav_item, (ViewGroup) this.ll_nav, false);
                TextView textView = (TextView) viewInflate.findViewById(R.id.tv_topic_nav);
                ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_topic_nav);
                textView.setText(topicNavObj.getText());
                com.max.hbimage.b.K(topicNavObj.getImg(), imageView);
                viewInflate.setOnClickListener(new e(topicNavObj.getProtocol()));
                this.ll_nav.addView(viewInflate);
            }
        }
        if (BBSTopicObj.TOPIC_ID_FORBID.equals(this.f80098c.getTopic_id()) || !(getActivity() instanceof TopicDetailActivity) || com.max.hbcommon.utils.c.u(appid)) {
            this.vg_game_icon.setVisibility(8);
            this.iv_game_arrow.setVisibility(8);
        } else {
            this.iv_game_arrow.setVisibility(0);
            this.vg_game_icon.setVisibility(0);
            com.max.hbimage.b.d0(this.f80098c.getPic_url(), this.iv_game_icon, ViewUtils.f(this.mContext, 2.0f));
            this.vg_topic_name.setOnClickListener(new f(appid, game_type));
        }
        if (BBSTopicObj.TOPIC_ID_FORBID.equals(this.f80098c.getTopic_id()) && com.max.xiaoheihe.utils.i0.s()) {
            this.mTopicToForbidHistoryView.setVisibility(0);
            this.mTopicToForbidHistoryView.setOnClickListener(new g());
        } else {
            this.mTopicToForbidHistoryView.setVisibility(8);
        }
    }

    private void N4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26885, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        O4(this.f80098c.getIs_follow() == 1);
    }

    private void O4(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 26886, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            this.iv_follow_status.setImageResource(R.drawable.ic_followed);
        } else {
            this.iv_follow_status.setImageResource(R.drawable.ic_follow);
        }
        this.iv_follow_status.setOnClickListener(new i());
    }

    private void P4(TextView textView, List<KeyDescObj> list) {
        if (PatchProxy.proxy(new Object[]{textView, list}, this, changeQuickRedirect, false, 26884, new Class[]{TextView.class, List.class}, Void.TYPE).isSupported || this.mContext.isFinishing() || list == null || list.size() <= 0) {
            return;
        }
        ArrayList<KeyDescObj> arrayList = new ArrayList(list);
        for (KeyDescObj keyDescObj : arrayList) {
            String str = this.f80108m;
            keyDescObj.setChecked(str != null && str.equals(keyDescObj.getKey()));
            keyDescObj.setDesc(keyDescObj.getText());
        }
        if (this.f80108m == null) {
            ((KeyDescObj) arrayList.get(0)).setChecked(true);
        }
        HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(this.mContext, arrayList);
        heyBoxPopupMenu.R(new h(arrayList, textView));
        heyBoxPopupMenu.show();
    }

    static /* synthetic */ void R3(TopicDetailFragment topicDetailFragment, TextView textView, List list) {
        if (PatchProxy.proxy(new Object[]{topicDetailFragment, textView, list}, null, changeQuickRedirect, true, 26893, new Class[]{TopicDetailFragment.class, TextView.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        topicDetailFragment.P4(textView, list);
    }

    static /* synthetic */ void U3(TopicDetailFragment topicDetailFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{topicDetailFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 26894, new Class[]{TopicDetailFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        topicDetailFragment.I4(z10);
    }

    static /* synthetic */ void f4(TopicDetailFragment topicDetailFragment, KeyDescObj keyDescObj, TextView textView) {
        if (PatchProxy.proxy(new Object[]{topicDetailFragment, keyDescObj, textView}, null, changeQuickRedirect, true, 26895, new Class[]{TopicDetailFragment.class, KeyDescObj.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        topicDetailFragment.L4(keyDescObj, textView);
    }

    static /* synthetic */ void m4(TopicDetailFragment topicDetailFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{topicDetailFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 26896, new Class[]{TopicDetailFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        topicDetailFragment.O4(z10);
    }

    static /* synthetic */ void n4(TopicDetailFragment topicDetailFragment, String str) {
        if (PatchProxy.proxy(new Object[]{topicDetailFragment, str}, null, changeQuickRedirect, true, 26897, new Class[]{TopicDetailFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        topicDetailFragment.A4(str);
    }

    static /* synthetic */ void o4(TopicDetailFragment topicDetailFragment, String str) {
        if (PatchProxy.proxy(new Object[]{topicDetailFragment, str}, null, changeQuickRedirect, true, 26898, new Class[]{TopicDetailFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        topicDetailFragment.C4(str);
    }

    static /* synthetic */ void p4(TopicDetailFragment topicDetailFragment) {
        if (PatchProxy.proxy(new Object[]{topicDetailFragment}, null, changeQuickRedirect, true, 26899, new Class[]{TopicDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        topicDetailFragment.N4();
    }

    static /* synthetic */ void u4(TopicDetailFragment topicDetailFragment) {
        if (PatchProxy.proxy(new Object[]{topicDetailFragment}, null, changeQuickRedirect, true, 26900, new Class[]{TopicDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        topicDetailFragment.K4();
    }

    public TitleBar D4() {
        return this.mToolbar;
    }

    @Override // com.max.xiaoheihe.module.bbs.LinkListV2Fragment.i
    public String N() {
        return this.f80108m;
    }

    @Override // com.max.xiaoheihe.module.bbs.LinkListV2Fragment.i
    public void W0(BBSLinkListResultObj bBSLinkListResultObj) {
        if (PatchProxy.proxy(new Object[]{bBSLinkListResultObj}, this, changeQuickRedirect, false, 26877, new Class[]{BBSLinkListResultObj.class}, Void.TYPE).isSupported || bBSLinkListResultObj == null || bBSLinkListResultObj.getTopic() == null) {
            return;
        }
        BBSTopicObj topic = bBSLinkListResultObj.getTopic();
        this.f80098c = topic;
        if (topic == null || com.max.hbcommon.utils.c.w(topic.getRelated_topics())) {
            this.vg_related_topics.setVisibility(8);
            this.v_related_topics_divider.setVisibility(8);
        } else {
            this.vg_related_topics.setVisibility(0);
            this.v_related_topics_divider.setVisibility(0);
        }
        if (!com.max.hbcommon.utils.c.w(this.f80098c.getRelated_topics())) {
            this.ll_related_topics.removeAllViews();
            for (BBSTopicObj bBSTopicObj : this.f80098c.getRelated_topics()) {
                View viewInflate = this.mInflater.inflate(R.layout.item_topics, (ViewGroup) this.ll_related_topics, false);
                ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_topic_icon);
                TextView textView = (TextView) viewInflate.findViewById(R.id.tv_topic_name);
                com.max.hbimage.b.d0(bBSTopicObj.getPic_url(), imageView, ViewUtils.f(this.mContext, 2.0f));
                textView.setText(bBSTopicObj.getName());
                viewInflate.setOnClickListener(new t(bBSTopicObj));
                this.ll_related_topics.addView(viewInflate);
            }
        }
        this.f80100e = bBSLinkListResultObj.getCurrent_user();
        M4();
        if (this.f80109n) {
            return;
        }
        List<KeyDescObj> sort_filter = bBSLinkListResultObj.getSort_filter();
        if (BBSTopicObj.TOPIC_ID_FORBID.equals(this.f80098c.getTopic_id()) || sort_filter == null || sort_filter.size() <= 0) {
            this.mSortFilterTextView.setVisibility(8);
            this.mSortFilterDividerView.setVisibility(8);
        } else {
            this.mSortFilterTextView.setVisibility(0);
            this.mSortFilterDividerView.setVisibility(0);
            KeyDescObj keyDescObj = null;
            if (com.max.hbcommon.utils.c.u(this.f80108m)) {
                keyDescObj = sort_filter.get(0);
                keyDescObj.setChecked(true);
            } else {
                for (KeyDescObj keyDescObj2 : sort_filter) {
                    if (this.f80108m.equals(keyDescObj2.getKey())) {
                        keyDescObj2.setChecked(true);
                        keyDescObj = keyDescObj2;
                    } else {
                        keyDescObj2.setChecked(false);
                    }
                }
            }
            if (keyDescObj != null) {
                L4(keyDescObj, this.mSortFilterTextView);
            }
            this.mSortFilterTextView.setOnClickListener(new u(sort_filter));
        }
        if (!BBSTopicObj.TOPIC_ID_FORBID.equals(this.f80098c.getTopic_id()) && bBSLinkListResultObj.getType_filter() != null) {
            this.f80105j.clear();
            this.f80105j.addAll(bBSLinkListResultObj.getType_filter());
            this.f80106k.notifyDataSetChanged();
            this.mTypeFilterTabLayout.setupWithViewPager(this.mViewPager);
            if (this.f80107l <= 0) {
                int i10 = -1;
                for (int i11 = 0; i11 < this.f80105j.size(); i11++) {
                    if ("video".equalsIgnoreCase(this.f80105j.get(i11).getKey())) {
                        i10 = i11;
                    }
                }
                if (TopicDetailActivity.O.equals(this.f80099d) && i10 != -1) {
                    this.mViewPager.setCurrentItem(i10, false);
                }
            }
        }
        this.f80109n = true;
    }

    @Override // com.max.xiaoheihe.module.bbs.LinkListV2Fragment.i
    public void f(View view, int i10, int i11) {
        Object[] objArr = {view, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 26878, new Class[]{View.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f80111p += i11;
        if (Math.abs(i11) > this.f80110o) {
            if (i11 > 0) {
                this.f80115t.d();
            } else {
                this.f80115t.i();
            }
        }
        if (getActivity() instanceof TopicDetailActivity) {
            if (this.f80111p > ViewUtils.J(this.mContext) * 3) {
                I4(true);
            } else {
                I4(false);
            }
        }
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26873, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.fragment_topic_detail);
        this.mUnBinder = ButterKnife.f(this, view);
        if (getArguments() != null) {
            this.f80097b = getArguments().getString("h_src");
            this.f80098c = (BBSTopicObj) getArguments().getSerializable("topic");
            this.f80099d = getArguments().getString(f80094w);
        }
        this.f80115t = new com.max.xiaoheihe.utils.u(this, this.mWritePostImageView, ViewUtils.f(this.mContext, 70.0f));
        this.f80110o = ViewConfiguration.get(this.mContext).getScaledTouchSlop();
        if (BBSTopicObj.TOPIC_ID_FORBID.equals(this.f80098c.getTopic_id())) {
            this.f80115t.f(false);
        } else {
            this.f80115t.f(true);
            this.f80115t.b().setOnClickListener(new k());
        }
        int iM = getActivity() instanceof TopicDetailActivity ? com.max.hbutils.utils.t.m(this.mContext) : 0;
        BBSTopicObj bBSTopicObj = this.f80098c;
        if (bBSTopicObj == null || com.max.hbcommon.utils.c.w(bBSTopicObj.getRelated_topics())) {
            this.vg_related_topics.setVisibility(8);
            this.v_related_topics_divider.setVisibility(8);
        } else {
            this.vg_related_topics.setVisibility(0);
            this.v_related_topics_divider.setVisibility(0);
        }
        this.f80101f = ((int) (((ViewUtils.L(this.mContext) * 316.0f) / 375.0f) + 0.5f)) + iM;
        this.f80102g = (int) (((ViewUtils.L(this.mContext) * 60.0f) / 375.0f) + 0.5f);
        this.f80103h = (int) (((ViewUtils.L(this.mContext) * 126.0f) / 375.0f) + 0.5f);
        int iV = ViewUtils.V(this.mSortView);
        this.f80104i = iV;
        int i10 = (this.f80101f - this.f80103h) + iV;
        ViewGroup.LayoutParams layoutParams = this.mHeaderContainerView.getLayoutParams();
        if (layoutParams.height != i10) {
            layoutParams.height = i10;
            this.mHeaderContainerView.setLayoutParams(layoutParams);
        }
        ViewGroup.LayoutParams layoutParams2 = this.mBGColorImageView.getLayoutParams();
        int i11 = layoutParams2.height;
        int i12 = this.f80101f;
        if (i11 != i12) {
            layoutParams2.height = i12;
            this.mBGColorImageView.setLayoutParams(layoutParams2);
        }
        ViewGroup.LayoutParams layoutParams3 = this.mBGScrimImageView.getLayoutParams();
        int i13 = layoutParams3.height;
        int i14 = this.f80101f;
        if (i13 != i14) {
            layoutParams3.height = i14;
            this.mBGScrimImageView.setLayoutParams(layoutParams3);
        }
        ViewGroup.LayoutParams layoutParams4 = this.mStatusBar.getLayoutParams();
        layoutParams4.height = iM;
        this.mStatusBar.setLayoutParams(layoutParams4);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mToolbar.getLayoutParams();
        marginLayoutParams.topMargin = iM;
        this.mToolbar.setLayoutParams(marginLayoutParams);
        this.f80114s = this.mToolbar.findViewById(R.id.iv_action_point);
        if (BBSTopicObj.TOPIC_ID_FORBID.equals(this.f80098c.getTopic_id())) {
            this.mToolbar.setActionXIcon(this.mContext.getResources().getDrawable(R.drawable.common_search));
            this.mToolbar.setActionXIconOnClickListener(new n());
        } else {
            this.mToolbar.setActionXIcon(this.mContext.getResources().getDrawable(R.drawable.common_search));
            this.mToolbar.setActionXIconOnClickListener(new o());
        }
        this.mToolbar.setActionIcon(R.drawable.appbar_msg);
        K4();
        this.mToolbar.setActionIconOnClickListener(new p());
        G4();
        q qVar = new q(getChildFragmentManager());
        this.f80106k = qVar;
        this.mViewPager.setAdapter(qVar);
        int i15 = this.f80107l;
        if (i15 > 0) {
            this.mViewPager.setCurrentItem(i15);
        }
        E4(this.f80098c.getTopic_id());
        NewMsgBroadcastReceiver newMsgBroadcastReceiver = new NewMsgBroadcastReceiver(this, null);
        this.f80113r = newMsgBroadcastReceiver;
        registerReceiver(newMsgBroadcastReceiver, lb.a.f131025q);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, 26872, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (bundle != null) {
            if (bundle.containsKey(f80095x)) {
                this.f80105j = (ArrayList) bundle.getSerializable(f80095x);
            }
            if (bundle.containsKey(f80096y)) {
                this.f80107l = bundle.getInt(f80096y);
            }
        }
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (bundle == null) {
            KeyDescObj keyDescObj = new KeyDescObj();
            keyDescObj.setText(getString(R.string.all));
            this.f80105j.add(keyDescObj);
            this.f80106k.notifyDataSetChanged();
        }
        this.mTypeFilterTabLayout.setupWithViewPager(this.mViewPager);
        M4();
        return viewOnCreateView;
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26892, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroyView();
        unregisterReceiver(this.f80113r);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26890, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        B4();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 26876, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onSaveInstanceState(bundle);
        if (this.f80106k != null) {
            bundle.putSerializable(f80095x, this.f80105j);
            bundle.putInt(f80096y, this.mViewPager.getCurrentItem());
        }
    }
}
