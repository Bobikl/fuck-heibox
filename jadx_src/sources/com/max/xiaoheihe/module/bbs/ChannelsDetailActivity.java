package com.max.xiaoheihe.module.bbs;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.appbar.AppBarLayout;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.HeyBoxTabLayout;
import com.max.hbcommon.component.TitleBar;
import com.max.hbcustomview.EZTabLayout;
import com.max.hbminiprogram.bean.MiniProgramObj;
import com.max.hbminiprogram.component.MiniProgramView;
import com.max.hbsearch.SearchNewFragment;
import com.max.hbsearch.config.HotWordTypeV2;
import com.max.hbshare.bean.HBShareData;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.video.AbsVideoView;
import com.max.video.player.VideoPlayerManager;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSTopicLinksObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicMenuObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicMenusObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.game.GameDetailsObj;
import com.max.xiaoheihe.bean.game.GameDetailsWrapperObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.MobileGameDetailsObj;
import com.max.xiaoheihe.module.account.ShareImageDialogFragment;
import com.max.xiaoheihe.module.bbs.post.FloatingPostButton;
import com.max.xiaoheihe.module.game.AppMgrActivity;
import com.max.xiaoheihe.module.game.GameDetailFragment;
import com.max.xiaoheihe.module.game.GetGameFragment;
import com.max.xiaoheihe.module.game.dota2.ImageCacheManager;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.module.littleprogram.fragment.dota2.Dota2GameDetailFragment;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
@com.max.hbcommon.analytics.m(path = lb.d.f131164g1)
@ig.d(interceptors = {com.max.xiaoheihe.router.interceptors.b.class}, path = {lb.d.X2, lb.d.f131164g1, lb.d.Z2})
public class ChannelsDetailActivity extends BaseActivity implements ChannelsLinkFragment.i, com.max.xiaoheihe.module.video.b, GameDetailFragment.a2, com.max.xiaoheihe.app.c, com.max.xiaoheihe.module.account.p0, com.max.hbcoco.b {
    public static final String S3 = "h_src";
    public static final String T3 = "topic_id";
    public static final String U3 = "app_id";
    public static final String V3 = "game_type";
    public static final String W3 = "user_id";
    public static final String X3 = "steam_id";
    public static final String Y3 = "player_id";
    public static final String Z3 = "sku_id";

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    public static final String f79591a4 = "page";

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    public static final String f79592b4 = "page_index";

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    public static final String f79593c4 = "topic_page";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    public static final String f79594d4 = "topic_page_index";

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    public static final String f79595e4 = "download";

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    public static final String f79596f4 = "game_platf";

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    public static final String f79597g4 = "hashtag_name";

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    public static final String f79598h4 = "top_comment_id";

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public static final String f79599i4 = "auto_play_url";

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    public static final String f79600j4 = "auto_play_seek";

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    public static final String f79601k4 = "auto_play";

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    public static final String f79602l4 = "menu_id";

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    private static final String f79603m4 = "float_button_mode_post";

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    private static final String f79604n4 = "float_button_mode_refresh";

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    private static final String f79605o4 = "share_image";

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    public static final String f79606p4 = "fragment_tag";

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    public static final String f79607q4 = "ChannelsDetail";

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    private static final SearchNewFragment.ContainerConfig f79608r4 = kd.a.a();
    private int G3;
    private String K3;
    private String L;
    private EZTabLayout L3;
    private String M;
    private int M3;
    private String N;
    private View N3;
    private String O;
    private AppBarLayout.f O3;
    private String P;
    private com.max.xiaoheihe.utils.u P3;
    private String Q;
    private String R;
    private String S;
    private String T;
    private String U;
    private String V;
    private String W;
    private String X;
    private String Y;
    private String Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private String f79609a0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f79611c0;

    @BindView(R.id.abl)
    AppBarLayout mAppBarLayout;

    @BindView(R.id.vg_fullscreen_video_container)
    FrameLayout mFullscreenVideoContainerView;

    @BindView(R.id.vg_header)
    View mHeaderView;

    @BindView(R.id.status_bar)
    View mStatusBar;

    @BindView(R.id.tl)
    HeyBoxTabLayout mTabLayout;

    @BindView(R.id.toolbar)
    TitleBar mToolbar;

    @BindView(R.id.vp)
    ViewPager mViewPager;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private View f79613p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private GameDetailsWrapperObj f79614p3;

    @BindView(R.id.rv_mini_program)
    RecyclerView rv_mini_program;

    @BindView(R.id.v_top_header_bg)
    View v_top_header_bg;

    @BindView(R.id.vg_post)
    FloatingPostButton vg_post;

    @BindView(R.id.vg_tab)
    ViewGroup vg_tab;

    @BindView(R.id.vg_tab_container)
    ViewGroup vg_tab_container;

    @BindView(R.id.vg_title)
    ViewGroup vg_title;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private androidx.viewpager.widget.a f79615x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private NewMsgBroadcastReceiver f79616x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private BBSTopicMenusObj f79617y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private RefreshBbsTabBroadcastReceiver f79618y2;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private long f79610b0 = 0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private String f79612p1 = null;
    private int G2 = -1;
    private final boolean J3 = true;
    private boolean Q3 = false;
    private final UMShareListener R3 = new h();

    public class NewMsgBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private NewMsgBroadcastReceiver() {
        }

        /* synthetic */ NewMsgBroadcastReceiver(ChannelsDetailActivity channelsDetailActivity, i iVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 25943, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported && lb.a.f131025q.equals(intent.getAction())) {
                ChannelsDetailActivity.J2(ChannelsDetailActivity.this);
            }
        }
    }

    public class RefreshBbsTabBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private RefreshBbsTabBroadcastReceiver() {
        }

        /* synthetic */ RefreshBbsTabBroadcastReceiver(ChannelsDetailActivity channelsDetailActivity, i iVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 25944, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported && lb.a.S.equals(intent.getAction())) {
                Object objInstantiateItem = ChannelsDetailActivity.this.f79615x1.instantiateItem((ViewGroup) ChannelsDetailActivity.this.mViewPager, ChannelsDetailActivity.this.mViewPager.getCurrentItem());
                if (objInstantiateItem instanceof ChannelsLinkFragment) {
                    ((ChannelsLinkFragment) objInstantiateItem).L4((HashMap) intent.getSerializableExtra("extra_params"));
                }
            }
        }
    }

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f79621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BBSTopicMenuObj f79622c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f79623d;

        a(String str, BBSTopicMenuObj bBSTopicMenuObj, int i10) {
            this.f79621b = str;
            this.f79622c = bBSTopicMenuObj;
            this.f79623d = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25912, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if ("wiki".equals(this.f79621b)) {
                ChannelsDetailActivity.u2(ChannelsDetailActivity.this, this.f79622c.getWiki_id());
                return;
            }
            if ("webview".equals(this.f79621b)) {
                if (this.f79622c.getShare_info() != null) {
                    if (com.max.hbcommon.utils.c.u(this.f79622c.getShare_info().getProtocol())) {
                        ChannelsDetailActivity.x2(ChannelsDetailActivity.this, this.f79622c.getShare_info(), this.f79622c.getUrl());
                        return;
                    } else {
                        com.max.xiaoheihe.base.router.b.k0(((BaseActivity) ChannelsDetailActivity.this).f66601b, this.f79622c.getShare_info().getProtocol());
                        return;
                    }
                }
                return;
            }
            if ("game_data".equals(this.f79621b)) {
                Object objInstantiateItem = ChannelsDetailActivity.this.f79615x1.instantiateItem((ViewGroup) ChannelsDetailActivity.this.mViewPager, this.f79623d);
                if (objInstantiateItem instanceof com.max.xiaoheihe.module.game.z.a) {
                    ((com.max.xiaoheihe.module.game.z.a) objInstantiateItem).T2();
                    return;
                }
                return;
            }
            if (!BBSTopicMenuObj.TYPE_STATISTIC.equals(this.f79621b) || this.f79622c.getShare_info() == null || com.max.hbcommon.utils.c.u(this.f79622c.getShare_info().getProtocol())) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(((BaseActivity) ChannelsDetailActivity.this).f66601b, this.f79622c.getShare_info().getProtocol());
        }
    }

    public class b extends com.max.hbcommon.network.d<Result<MobileGameDetailsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f79625b;

        b(boolean z10) {
            this.f79625b = z10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 25913, new Class[]{Throwable.class}, Void.TYPE).isSupported && ChannelsDetailActivity.this.isActive()) {
                super.onError(th2);
                ChannelsDetailActivity.z2(ChannelsDetailActivity.this, this.f79625b);
            }
        }

        public void onNext(Result<MobileGameDetailsObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 25914, new Class[]{Result.class}, Void.TYPE).isSupported && ChannelsDetailActivity.this.isActive()) {
                super.onNext(result);
                ChannelsDetailActivity channelsDetailActivity = ChannelsDetailActivity.this;
                channelsDetailActivity.f79614p3 = new GameDetailsWrapperObj(channelsDetailActivity.P, result.getResult(), null);
                ChannelsDetailActivity.z2(ChannelsDetailActivity.this, this.f79625b);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25915, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MobileGameDetailsObj>) obj);
        }
    }

    public class c extends com.max.hbcommon.network.d<Result<GameDetailsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f79627b;

        c(boolean z10) {
            this.f79627b = z10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 25916, new Class[]{Throwable.class}, Void.TYPE).isSupported && ChannelsDetailActivity.this.isActive()) {
                super.onError(th2);
                ChannelsDetailActivity.z2(ChannelsDetailActivity.this, this.f79627b);
            }
        }

        public void onNext(Result<GameDetailsObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 25917, new Class[]{Result.class}, Void.TYPE).isSupported && ChannelsDetailActivity.this.isActive()) {
                super.onNext(result);
                ChannelsDetailActivity channelsDetailActivity = ChannelsDetailActivity.this;
                channelsDetailActivity.f79614p3 = new GameDetailsWrapperObj(channelsDetailActivity.P, null, result.getResult());
                ChannelsDetailActivity.z2(ChannelsDetailActivity.this, this.f79627b);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25918, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GameDetailsObj>) obj);
        }
    }

    public class d extends com.max.hbcommon.network.d<Result<GameDetailsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f79629b;

        d(boolean z10) {
            this.f79629b = z10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 25919, new Class[]{Throwable.class}, Void.TYPE).isSupported && ChannelsDetailActivity.this.isActive()) {
                super.onError(th2);
                ChannelsDetailActivity.z2(ChannelsDetailActivity.this, this.f79629b);
            }
        }

        public void onNext(Result<GameDetailsObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 25920, new Class[]{Result.class}, Void.TYPE).isSupported && ChannelsDetailActivity.this.isActive()) {
                super.onNext(result);
                ChannelsDetailActivity channelsDetailActivity = ChannelsDetailActivity.this;
                channelsDetailActivity.f79614p3 = new GameDetailsWrapperObj(channelsDetailActivity.P, null, result.getResult());
                ChannelsDetailActivity.z2(ChannelsDetailActivity.this, this.f79629b);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25921, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GameDetailsObj>) obj);
        }
    }

    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ChannelsLinkFragment f79631b;

        e(ChannelsLinkFragment channelsLinkFragment) {
            this.f79631b = channelsLinkFragment;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25922, new Class[]{View.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(((BaseActivity) ChannelsDetailActivity.this).f66601b)) {
                String topic_id = ChannelsDetailActivity.this.N;
                if (com.max.hbcommon.utils.c.u(topic_id) && ChannelsDetailActivity.this.f79617y1 != null) {
                    topic_id = ChannelsDetailActivity.this.f79617y1.getTopic().getTopic_id();
                }
                BBSTopicMenuObj bBSTopicMenuObjY4 = this.f79631b.y4();
                if (bBSTopicMenuObjY4 != null && bBSTopicMenuObjY4.getPost_btn() != null) {
                    ChannelsDetailActivity.C2(ChannelsDetailActivity.this);
                }
                if (bBSTopicMenuObjY4 != null && bBSTopicMenuObjY4.getPost_btn() != null && !com.max.hbcommon.utils.c.u(bBSTopicMenuObjY4.getPost_btn().getProtocol())) {
                    com.max.xiaoheihe.base.router.b.j0(((BaseActivity) ChannelsDetailActivity.this).f66601b, bBSTopicMenuObjY4.getPost_btn().getProtocol());
                    return;
                }
                ArrayList arrayList = null;
                if (bBSTopicMenuObjY4 != null && bBSTopicMenuObjY4.getPost_btn() != null) {
                    arrayList = new ArrayList();
                    arrayList.add(bBSTopicMenuObjY4);
                }
                s0 s0VarH4 = s0.h4(s0.f83220w, topic_id, arrayList);
                Bundle arguments = s0VarH4.getArguments() != null ? s0VarH4.getArguments() : new Bundle();
                arguments.putString("source", "topic_bbs");
                s0VarH4.setArguments(arguments);
                s0VarH4.show(ChannelsDetailActivity.this.getSupportFragmentManager(), "writeposttype");
            }
        }
    }

    public class f extends com.max.hbcommon.network.d<Result<BBSTopicMenusObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 25923, new Class[]{Throwable.class}, Void.TYPE).isSupported && ChannelsDetailActivity.this.isActive()) {
                super.onError(th2);
                ChannelsDetailActivity.G2(ChannelsDetailActivity.this);
            }
        }

        public void onNext(Result<BBSTopicMenusObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 25924, new Class[]{Result.class}, Void.TYPE).isSupported && ChannelsDetailActivity.this.isActive()) {
                super.onNext(result);
                ChannelsDetailActivity.this.f79617y1 = result.getResult();
                ChannelsDetailActivity.H2(ChannelsDetailActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25925, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSTopicMenusObj>) obj);
        }
    }

    public class g extends com.max.hbcommon.network.d<Result<KeyDescObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        public void onNext(Result<KeyDescObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 25926, new Class[]{Result.class}, Void.TYPE).isSupported && ChannelsDetailActivity.this.isActive()) {
                super.onNext(result);
                ChannelsDetailActivity.x2(ChannelsDetailActivity.this, result.getResult(), null);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25927, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<KeyDescObj>) obj);
        }
    }

    public class h implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(SHARE_MEDIA share_media, Throwable th2) {
            if (PatchProxy.proxy(new Object[]{share_media, th2}, this, changeQuickRedirect, false, 25929, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(ChannelsDetailActivity.this.getString(R.string.share_fail));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 25928, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(ChannelsDetailActivity.this.getString(R.string.share_success));
            com.max.hbshare.d.F(ChannelsDetailActivity.this.S0(), ChannelsDetailActivity.this.L, "game", null, null);
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(SHARE_MEDIA share_media) {
        }
    }

    public class i implements EZTabLayout.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // com.max.hbcustomview.EZTabLayout.b
        public void a(EZTabLayout.c cVar) {
            if (PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 25911, new Class[]{EZTabLayout.c.class}, Void.TYPE).isSupported) {
                return;
            }
            Object objInstantiateItem = ChannelsDetailActivity.this.f79615x1.instantiateItem((ViewGroup) ChannelsDetailActivity.this.mViewPager, cVar.f());
            if (objInstantiateItem instanceof ChannelsLinkFragment) {
                ((ChannelsLinkFragment) objInstantiateItem).P4();
            }
        }

        @Override // com.max.hbcustomview.EZTabLayout.b
        public void b(EZTabLayout.c cVar) {
        }

        @Override // com.max.hbcustomview.EZTabLayout.b
        public void c(EZTabLayout.c cVar) {
        }
    }

    public class j implements AppBarLayout.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f79637a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f79638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f79639c;

        j(int i10) {
            this.f79639c = i10;
            this.f79638b = ViewUtils.f(((BaseActivity) ChannelsDetailActivity.this).f66601b, 46.0f);
        }

        private void b(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 25931, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            ChannelsDetailActivity.L2(ChannelsDetailActivity.this, i10);
            ChannelsDetailActivity.O2(ChannelsDetailActivity.this, i10);
            ChannelsDetailActivity.P2(ChannelsDetailActivity.this, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.f, com.google.android.material.appbar.AppBarLayout.b
        public void a(AppBarLayout appBarLayout, int i10) {
            if (PatchProxy.proxy(new Object[]{appBarLayout, new Integer(i10)}, this, changeQuickRedirect, false, 25930, new Class[]{AppBarLayout.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            int iAbs = Math.abs(i10);
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            if (ChannelsDetailActivity.this.rv_mini_program.getVisibility() != 0) {
                float f10 = (iAbs * 1.0f) / totalScrollRange;
                int i11 = (int) (((-ChannelsDetailActivity.this.M3) * f10) + ChannelsDetailActivity.this.M3);
                ChannelsDetailActivity.q2(ChannelsDetailActivity.this, true, 1.0f);
                ChannelsDetailActivity.E2(ChannelsDetailActivity.this, f10);
                ChannelsDetailActivity.this.v_top_header_bg.setBackgroundResource(R.color.background_layer_2_color);
                ChannelsDetailActivity.this.vg_tab.setBackgroundResource(R.color.transparent);
                b(i11);
                return;
            }
            int i12 = this.f79639c;
            if (iAbs <= i12) {
                ChannelsDetailActivity.c2(ChannelsDetailActivity.this);
                int i13 = this.f79638b;
                float f11 = iAbs < i13 ? 0.0f : (iAbs - i13) / (this.f79639c - i13);
                ChannelsDetailActivity.q2(ChannelsDetailActivity.this, false, f11);
                ChannelsDetailActivity.E2(ChannelsDetailActivity.this, 0.0f);
                ChannelsDetailActivity.this.vg_title.setBackgroundColor(ViewUtils.k(f11, com.max.xiaoheihe.utils.d.E(R.color.background_layer_2_color)));
                ChannelsDetailActivity.this.vg_tab.setBackgroundResource(R.color.background_layer_2_color);
                ChannelsDetailActivity.this.rv_mini_program.setAlpha(1.0f);
            } else {
                ChannelsDetailActivity.q2(ChannelsDetailActivity.this, true, 1.0f);
                ChannelsDetailActivity.E2(ChannelsDetailActivity.this, (iAbs - i12) / (totalScrollRange - i12));
                ChannelsDetailActivity.this.v_top_header_bg.setBackgroundResource(R.color.background_layer_2_color);
                ChannelsDetailActivity.this.vg_tab.setBackgroundResource(R.color.transparent);
                ChannelsDetailActivity.this.rv_mini_program.setAlpha(0.0f);
            }
            b(Math.max(0, Math.min(ChannelsDetailActivity.this.M3 + this.f79639c, ChannelsDetailActivity.this.M3 - (iAbs - this.f79639c))));
            this.f79637a = iAbs;
        }
    }

    public class k extends androidx.fragment.app.n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        k(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25933, new Class[0], Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            List<BBSTopicMenuObj> menu = ChannelsDetailActivity.this.f79617y1 != null ? ChannelsDetailActivity.this.f79617y1.getMenu() : null;
            if (menu != null) {
                return menu.size();
            }
            return 0;
        }

        @Override // androidx.fragment.app.n0
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 25932, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            Fragment fragmentR1 = null;
            List<BBSTopicMenuObj> menu = ChannelsDetailActivity.this.f79617y1 != null ? ChannelsDetailActivity.this.f79617y1.getMenu() : null;
            if (menu != null && i10 < menu.size()) {
                fragmentR1 = ChannelsDetailActivity.R1(ChannelsDetailActivity.this, menu.get(i10));
                if (i10 == 0 && ChannelsDetailActivity.this.Q3 && (fragmentR1 instanceof com.max.hbcommon.base.d)) {
                    ((com.max.hbcommon.base.d) fragmentR1).setIgnorePageEvent(true);
                    ChannelsDetailActivity.this.Q3 = false;
                }
            }
            if (fragmentR1 != null) {
                Bundle arguments = fragmentR1.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putString(ChannelsDetailActivity.f79606p4, ChannelsDetailActivity.f79606p4 + i10);
            }
            return fragmentR1;
        }

        @Override // androidx.viewpager.widget.a
        @androidx.annotation.p0
        public CharSequence getPageTitle(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 25934, new Class[]{Integer.TYPE}, CharSequence.class);
            if (patchProxyResultProxy.isSupported) {
                return (CharSequence) patchProxyResultProxy.result;
            }
            List<BBSTopicMenuObj> menu = ChannelsDetailActivity.this.f79617y1 != null ? ChannelsDetailActivity.this.f79617y1.getMenu() : null;
            return (menu == null || i10 >= menu.size()) ? super.getPageTitle(i10) : menu.get(i10).getTitle();
        }
    }

    public class l extends ViewPager.l {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // androidx.viewpager.widget.ViewPager.l, androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 25935, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            ChannelsDetailActivity.W1(ChannelsDetailActivity.this, i10);
        }
    }

    public class m extends com.max.hbcommon.base.adapter.s<MiniProgramObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f79643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f79644c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f79645d;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MiniProgramObj f79647b;

            a(MiniProgramObj miniProgramObj) {
                this.f79647b = miniProgramObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25938, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.base.router.b.k0(((BaseActivity) ChannelsDetailActivity.this).f66601b, this.f79647b.getProto());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Context context, List list, int i10, int i11, boolean z10, int i12) {
            super(context, list, i10);
            this.f79643b = i11;
            this.f79644c = z10;
            this.f79645d = i12;
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, MiniProgramObj miniProgramObj) {
            if (PatchProxy.proxy(new Object[]{eVar, miniProgramObj}, this, changeQuickRedirect, false, 25936, new Class[]{com.max.hbcommon.base.adapter.s.e.class, MiniProgramObj.class}, Void.TYPE).isSupported) {
                return;
            }
            MiniProgramView miniProgramView = (MiniProgramView) eVar.i(R.id.v_mini_program);
            miniProgramView.getLayoutParams().width = this.f79643b;
            if (this.f79644c) {
                miniProgramView.getLayoutParams().height = this.f79645d;
            }
            miniProgramView.setData(miniProgramObj);
            miniProgramView.setOnClickListener(new a(miniProgramObj));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, MiniProgramObj miniProgramObj) {
            if (PatchProxy.proxy(new Object[]{eVar, miniProgramObj}, this, changeQuickRedirect, false, 25937, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, miniProgramObj);
        }
    }

    public class n implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25939, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.accelworld.d.a(((BaseActivity) ChannelsDetailActivity.this).f66601b, ChannelsDetailActivity.f79607q4, ChannelsDetailActivity.this.N, ChannelsDetailActivity.f79608r4);
        }
    }

    public class o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25940, new Class[]{View.class}, Void.TYPE).isSupported || com.max.xiaoheihe.utils.d.b1(((BaseActivity) ChannelsDetailActivity.this).f66601b)) {
                return;
            }
            com.max.xiaoheihe.base.router.b.w(((BaseActivity) ChannelsDetailActivity.this).f66601b).A();
            if (ChannelsDetailActivity.this.f79613p2 != null) {
                ChannelsDetailActivity.this.f79613p2.setVisibility(8);
            }
            com.max.hbcache.c.M(false);
            Intent intent = new Intent();
            intent.setAction(lb.a.f131025q);
            ChannelsDetailActivity.this.sendBroadcast(intent);
        }
    }

    public class p implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25941, new Class[]{View.class}, Void.TYPE).isSupported || ChannelsDetailActivity.this.f79614p3 == null) {
                return;
            }
            ChannelsDetailActivity channelsDetailActivity = ChannelsDetailActivity.this;
            ChannelsDetailActivity.k2(channelsDetailActivity, channelsDetailActivity.O);
            UMImage uMImage = !com.max.hbcommon.utils.c.u(ChannelsDetailActivity.this.f79614p3.getShare_img()) ? new UMImage(((BaseActivity) ChannelsDetailActivity.this).f66601b, ChannelsDetailActivity.this.f79614p3.getShare_img()) : new UMImage(((BaseActivity) ChannelsDetailActivity.this).f66601b, R.drawable.share_thumbnail);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("appid", ChannelsDetailActivity.this.O);
            com.max.hbshare.d.E(((BaseActivity) ChannelsDetailActivity.this).f66601b, new HBShareData(false, true, ChannelsDetailActivity.this.f79614p3.getShare_title(), ChannelsDetailActivity.this.f79614p3.getShare_desc(), ChannelsDetailActivity.this.f79614p3.getShare_url(), null, uMImage, new com.max.hbshare.c.b("game_detail", ChannelsDetailActivity.this.R3, jsonObject)));
        }
    }

    public class q implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25942, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) ChannelsDetailActivity.this).f66601b.startActivity(AppMgrActivity.M1(((BaseActivity) ChannelsDetailActivity.this).f66601b));
        }
    }

    private void A3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25844, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        P3();
        int iM = com.max.hbutils.utils.t.m(this.f66601b);
        int iF = ViewUtils.f(this.f66601b, 56.0f);
        int iF2 = ViewUtils.f(this.f66601b, 44.0f);
        if (!R3()) {
            this.v_top_header_bg.getLayoutParams().height = iF2 + iM;
            ViewGroup.LayoutParams layoutParams = this.mHeaderView.getLayoutParams();
            layoutParams.height = iF2 + this.M3 + iM;
            this.mHeaderView.setLayoutParams(layoutParams);
            this.rv_mini_program.setVisibility(8);
            return;
        }
        int i10 = iF + iF2;
        this.v_top_header_bg.getLayoutParams().height = i10 + iM;
        ((ViewGroup.MarginLayoutParams) this.rv_mini_program.getLayoutParams()).topMargin = ViewUtils.f(this.f66601b, 48.0f) + iM;
        ViewGroup.LayoutParams layoutParams2 = this.mHeaderView.getLayoutParams();
        layoutParams2.height = i10 + this.M3 + iM;
        this.mHeaderView.setLayoutParams(layoutParams2);
        this.rv_mini_program.setVisibility(0);
        this.rv_mini_program.setLayoutManager(new LinearLayoutManager(this.f66601b, 0, false));
        if (this.rv_mini_program.getItemDecorationCount() == 0) {
            this.rv_mini_program.addItemDecoration(new com.max.hbcustomview.d(ViewUtils.f(this.f66601b, 8.0f), ViewUtils.f(this.f66601b, 12.0f)));
        }
        this.rv_mini_program.setAdapter(new m(this.f66601b, this.f79617y1.getMini_programs(), R.layout.item_mini_program_v2, ViewUtils.f(this.f66601b, 80.0f), ViewUtils.L(this.f66601b) >= ViewUtils.f(this.f66601b, 390.0f), ViewUtils.f(this.f66601b, 46.0f)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void B3(WeakReference weakReference, WeakReference weakReference2, WeakReference weakReference3) {
        if (PatchProxy.proxy(new Object[]{weakReference, weakReference2, weakReference3}, null, changeQuickRedirect, true, 25894, new Class[]{WeakReference.class, WeakReference.class, WeakReference.class}, Void.TYPE).isSupported) {
            return;
        }
        HeyBoxTabLayout heyBoxTabLayout = (HeyBoxTabLayout) weakReference.get();
        EZTabLayout eZTabLayout = (EZTabLayout) weakReference2.get();
        ViewPager viewPager = (ViewPager) weakReference3.get();
        if (heyBoxTabLayout == null || eZTabLayout == null || viewPager == null) {
            return;
        }
        int currentItem = viewPager.getCurrentItem();
        heyBoxTabLayout.setScrollPosition(currentItem, 0.0f, true);
        eZTabLayout.setScrollPosition(currentItem, 0.0f, true);
    }

    static /* synthetic */ void C2(ChannelsDetailActivity channelsDetailActivity) {
        if (PatchProxy.proxy(new Object[]{channelsDetailActivity}, null, changeQuickRedirect, true, 25907, new Class[]{ChannelsDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        channelsDetailActivity.L3();
    }

    private void C3(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 25858, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        GameDetailFragment gameDetailFragmentK3 = k3();
        if (gameDetailFragmentK3 != null && gameDetailFragmentK3.isAdded()) {
            gameDetailFragmentK3.t8(this.f79614p3, z10);
        }
        F3(this.mViewPager.getCurrentItem());
    }

    private void D3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25851, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        x1();
        if (this.f79617y1 == null) {
            return;
        }
        b0.f().c(this.f79617y1.getTopic());
        A3();
        List<BBSTopicMenuObj> menu = this.f79617y1.getMenu();
        this.mViewPager.setPadding(0, 0, 0, 0);
        if (!com.max.hbcommon.utils.c.w(menu)) {
            this.vg_tab_container.setVisibility(0);
            this.vg_tab.getLayoutParams().height = -2;
            if (menu.size() == 1) {
                if (com.max.hbcommon.utils.c.w(this.f79617y1.getMini_programs())) {
                    this.mHeaderView.setVisibility(8);
                    this.mAppBarLayout.z(this.O3);
                    I3(0.0f);
                    Q3(true, 0.0f);
                } else {
                    this.vg_tab_container.setVisibility(8);
                    this.mViewPager.setPadding(0, ViewUtils.f(this.f66601b, 12.0f), 0, 0);
                    this.M3 = 0;
                }
            }
        }
        if (this.f79617y1.getTopic() != null) {
            this.N = this.f79617y1.getTopic().getTopic_id();
            g3();
        }
        if (this.f79617y1.getHashtag() != null) {
            this.R = this.f79617y1.getHashtag().getName();
        }
        if (menu != null) {
            Iterator<BBSTopicMenuObj> it = menu.iterator();
            while (it.hasNext()) {
                if (r3(it.next()) == null) {
                    it.remove();
                }
            }
        }
        this.Q3 = s3(this.V, this.W, this.X) > 0;
        this.f79615x1.notifyDataSetChanged();
        N3(this.V, this.W, this.X);
        this.mTabLayout.setupWithViewPager(this.mViewPager);
        this.L3.setupWithViewPager(this.mViewPager);
        V3();
        F3(this.mViewPager.getCurrentItem());
    }

    static /* synthetic */ void E2(ChannelsDetailActivity channelsDetailActivity, float f10) {
        if (PatchProxy.proxy(new Object[]{channelsDetailActivity, new Float(f10)}, null, changeQuickRedirect, true, 25897, new Class[]{ChannelsDetailActivity.class, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        channelsDetailActivity.I3(f10);
    }

    private void F3(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 25850, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        O3(i10);
    }

    static /* synthetic */ void G2(ChannelsDetailActivity channelsDetailActivity) {
        if (PatchProxy.proxy(new Object[]{channelsDetailActivity}, null, changeQuickRedirect, true, 25908, new Class[]{ChannelsDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        channelsDetailActivity.C1();
    }

    private void G3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25868, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int currentItem = this.mViewPager.getCurrentItem();
        BBSTopicMenusObj bBSTopicMenusObj = this.f79617y1;
        List<BBSTopicMenuObj> menu = bBSTopicMenusObj != null ? bBSTopicMenusObj.getMenu() : null;
        if (menu == null || menu.size() <= 0) {
            return;
        }
        menu.get(currentItem);
        Object objInstantiateItem = this.f79615x1.instantiateItem((ViewGroup) this.mViewPager, currentItem);
        if (objInstantiateItem instanceof ChannelsLinkFragment) {
            this.vg_post.setText("参与讨论");
            this.vg_post.setOnClickListener(new e((ChannelsLinkFragment) objInstantiateItem));
        }
    }

    static /* synthetic */ void H2(ChannelsDetailActivity channelsDetailActivity) {
        if (PatchProxy.proxy(new Object[]{channelsDetailActivity}, null, changeQuickRedirect, true, 25909, new Class[]{ChannelsDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        channelsDetailActivity.D3();
    }

    private void H3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25863, new Class[0], Void.TYPE).isSupported || this.f79613p2 == null) {
            return;
        }
        int currentItem = this.mViewPager.getCurrentItem();
        BBSTopicMenusObj bBSTopicMenusObj = this.f79617y1;
        List<BBSTopicMenuObj> menu = bBSTopicMenusObj != null ? bBSTopicMenusObj.getMenu() : null;
        if (menu != null && currentItem < menu.size() && "game".equals(menu.get(currentItem).getType())) {
            this.f79613p2.setVisibility(8);
        } else if (com.max.xiaoheihe.utils.i0.s() && com.max.hbcache.c.v()) {
            this.f79613p2.setVisibility(0);
        } else {
            this.f79613p2.setVisibility(8);
        }
    }

    private void I3(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 25841, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (f10 <= 0.0f) {
            this.mTabLayout.setVisibility(0);
            this.mTabLayout.setAlpha(1.0f);
            this.mToolbar.getAppbarTitleTextView().setVisibility(0);
            this.mToolbar.getAppbarTitleTextView().setAlpha(1.0f);
            this.N3.setVisibility(0);
            this.N3.setAlpha(1.0f);
            this.L3.setVisibility(8);
            return;
        }
        if (f10 > 0.5f) {
            this.mTabLayout.setVisibility(8);
            this.mToolbar.getAppbarTitleTextView().setVisibility(8);
            this.N3.setVisibility(8);
            this.L3.setVisibility(0);
            this.L3.setAlpha((f10 * 2.0f) - 1.0f);
            return;
        }
        float f11 = (f10 * (-2.0f)) + 1.0f;
        this.mTabLayout.setVisibility(0);
        this.mTabLayout.setAlpha(f11);
        this.mToolbar.getAppbarTitleTextView().setVisibility(0);
        this.mToolbar.getAppbarTitleTextView().setAlpha(f11);
        this.N3.setVisibility(0);
        this.N3.setAlpha(f11);
        this.L3.setVisibility(8);
    }

    static /* synthetic */ void J2(ChannelsDetailActivity channelsDetailActivity) {
        if (PatchProxy.proxy(new Object[]{channelsDetailActivity}, null, changeQuickRedirect, true, 25910, new Class[]{ChannelsDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        channelsDetailActivity.H3();
    }

    private void K3(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25886, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("app_id", str);
        com.max.hbcommon.analytics.l.f66572a.l(lb.d.f131208m3, jsonObject);
    }

    static /* synthetic */ void L2(ChannelsDetailActivity channelsDetailActivity, int i10) {
        if (PatchProxy.proxy(new Object[]{channelsDetailActivity, new Integer(i10)}, null, changeQuickRedirect, true, 25898, new Class[]{ChannelsDetailActivity.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        channelsDetailActivity.W2(i10);
    }

    private void L3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25885, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        com.max.hbcommon.analytics.l lVar = com.max.hbcommon.analytics.l.f66572a;
        jsonObject.addProperty("page", lVar.e());
        lVar.l(lb.d.B0, jsonObject);
    }

    static /* synthetic */ void O2(ChannelsDetailActivity channelsDetailActivity, int i10) {
        if (PatchProxy.proxy(new Object[]{channelsDetailActivity, new Integer(i10)}, null, changeQuickRedirect, true, 25899, new Class[]{ChannelsDetailActivity.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        channelsDetailActivity.V2(i10);
    }

    private void O3(int i10) {
        GameDetailsWrapperObj gameDetailsWrapperObj;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 25849, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        BBSTopicMenusObj bBSTopicMenusObj = this.f79617y1;
        List<BBSTopicMenuObj> menu = bBSTopicMenusObj != null ? bBSTopicMenusObj.getMenu() : null;
        BBSTopicMenusObj bBSTopicMenusObj2 = this.f79617y1;
        BBSTopicObj topic = bBSTopicMenusObj2 != null ? bBSTopicMenusObj2.getTopic() : null;
        if (menu != null && i10 < menu.size()) {
            BBSTopicMenuObj bBSTopicMenuObj = menu.get(i10);
            String type = bBSTopicMenuObj.getType();
            boolean zEquals = "game".equals(type);
            boolean z11 = ("webview".equals(type) && bBSTopicMenuObj.getShare_info() != null) || "game_data".equals(type) || "wiki".equals(type) || (BBSTopicMenuObj.TYPE_STATISTIC.equals(type) && bBSTopicMenuObj.getShare_info() != null);
            boolean z12 = "link".equals(type) || BBSTopicMenuObj.TYPE_TEAM_ORG.equals(type);
            Object objInstantiateItem = this.f79615x1.instantiateItem((ViewGroup) this.mViewPager, i10);
            if (z12 && (objInstantiateItem instanceof ChannelsLinkFragment)) {
                ChannelsLinkFragment channelsLinkFragment = (ChannelsLinkFragment) objInstantiateItem;
                BBSTopicMenuObj bBSTopicMenuObjY4 = channelsLinkFragment.y4();
                z12 = channelsLinkFragment.z4() == 0 || !(bBSTopicMenuObjY4 == null || bBSTopicMenuObjY4.getPost_btn() == null);
            }
            if (z12) {
                T3(true);
                if (objInstantiateItem instanceof ChannelsLinkFragment) {
                    X2(((ChannelsLinkFragment) objInstantiateItem).x4());
                }
            } else {
                T3(false);
            }
            this.mToolbar.setActionXIcon(this.f66601b.getResources().getDrawable(R.drawable.common_search));
            this.mToolbar.setActionXIconOnClickListener(new n());
            this.mToolbar.setActionIcon(R.drawable.common_notice);
            this.mToolbar.setActionIconOnClickListener(new o());
            if (zEquals) {
                GameDetailsWrapperObj gameDetailsWrapperObj2 = this.f79614p3;
                if (gameDetailsWrapperObj2 == null || com.max.hbcommon.utils.c.u(gameDetailsWrapperObj2.getShare_url())) {
                    this.mToolbar.setActionMoreIcon((Drawable) null);
                } else {
                    this.mToolbar.setActionMoreIcon(R.drawable.common_share);
                    this.mToolbar.setActionMoreIconOnClickListener(new p());
                }
                if ("mobile".equals(this.P) && com.max.xiaoheihe.module.account.utils.d.f()) {
                    this.mToolbar.setActionXIcon(R.drawable.common_download);
                    this.mToolbar.setActionXIconOnClickListener(new q());
                }
            } else if (z11) {
                this.mToolbar.setActionMoreIcon(R.drawable.common_share);
                this.mToolbar.setActionMoreIconOnClickListener(new a(type, bBSTopicMenuObj, i10));
            } else {
                this.mToolbar.setActionMoreIcon((Drawable) null);
            }
            if (menu.size() > 1) {
                this.mToolbar.setTitle(topic != null ? topic.getName() : null);
            } else if (zEquals && (gameDetailsWrapperObj = this.f79614p3) != null) {
                this.mToolbar.setTitle(gameDetailsWrapperObj.getName());
            } else if (topic != null) {
                this.mToolbar.setTitle(topic.getName());
            }
            if ("webview".equals(type) && "0".equals(bBSTopicMenuObj.getNestscroll())) {
                z10 = true;
            }
            if (z10) {
                this.mAppBarLayout.setExpanded(true, true);
            }
        }
        H3();
    }

    static /* synthetic */ void P2(ChannelsDetailActivity channelsDetailActivity, int i10) {
        if (PatchProxy.proxy(new Object[]{channelsDetailActivity, new Integer(i10)}, null, changeQuickRedirect, true, 25900, new Class[]{ChannelsDetailActivity.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        channelsDetailActivity.T2(i10);
    }

    private void P3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25847, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (S3()) {
            this.v_top_header_bg.setBackground(ViewUtils.i(0, com.max.xiaoheihe.utils.d.e1(this.f79617y1.getBg_color().getStart()), com.max.xiaoheihe.utils.d.e1(this.f79617y1.getBg_color().getEnd())));
            this.mTabLayout.setSelectedTabIndicator(ViewUtils.i(ViewUtils.f(this.f66601b, 3.0f), com.max.xiaoheihe.utils.d.e1(this.f79617y1.getBg_color().getStart()), com.max.xiaoheihe.utils.d.e1(this.f79617y1.getBg_color().getEnd())));
            this.mTabLayout.setTabTextColors(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color), com.max.xiaoheihe.utils.d.E(R.color.white));
        } else {
            this.v_top_header_bg.setBackgroundResource(R.color.background_layer_2_color);
            this.mTabLayout.setSelectedTabIndicator(ViewUtils.i(ViewUtils.f(this.f66601b, 3.0f), this.f66601b.getResources().getColor(R.color.black_start), this.f66601b.getResources().getColor(R.color.black_end)));
        }
        HeyBoxTabLayout heyBoxTabLayout = this.mTabLayout;
        heyBoxTabLayout.f67066o = true;
        heyBoxTabLayout.invalidate();
    }

    private void Q3(boolean z10, float f10) {
        int iB;
        int iE;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), new Float(f10)}, this, changeQuickRedirect, false, 25840, new Class[]{Boolean.TYPE, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        boolean zS3 = S3();
        int i10 = R.color.background_layer_2_color;
        int i11 = R.color.text_primary_1_color;
        if (z10) {
            iB = com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color);
            iE = com.max.xiaoheihe.utils.d.E(R.color.background_layer_2_color);
        } else {
            if (zS3) {
                i10 = R.color.white;
            }
            int iE2 = com.max.xiaoheihe.utils.d.E(i10);
            if (zS3) {
                i11 = R.color.text_primary_1_dark_white_color;
            }
            iB = ViewUtils.B(f10, iE2, com.max.xiaoheihe.utils.d.E(i11));
            iE = com.max.xiaoheihe.utils.d.E(R.color.transparent);
        }
        com.max.hbutils.utils.t.M(this.f66601b, z10);
        this.mToolbar.setThemeColor(iB);
        this.vg_title.setBackgroundColor(iE);
    }

    static /* synthetic */ Fragment R1(ChannelsDetailActivity channelsDetailActivity, BBSTopicMenuObj bBSTopicMenuObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{channelsDetailActivity, bBSTopicMenuObj}, null, changeQuickRedirect, true, 25901, new Class[]{ChannelsDetailActivity.class, BBSTopicMenuObj.class}, Fragment.class);
        return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : channelsDetailActivity.r3(bBSTopicMenuObj);
    }

    private boolean R3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25845, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        BBSTopicMenusObj bBSTopicMenusObj = this.f79617y1;
        return (bBSTopicMenusObj == null || com.max.hbcommon.utils.c.w(bBSTopicMenusObj.getMini_programs())) ? false : true;
    }

    private boolean S3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25846, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return R3() && this.f79617y1.getBg_color() != null;
    }

    private void T2(int i10) {
        Dota2GameDetailFragment dota2GameDetailFragmentH3;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 25865, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        BBSTopicMenusObj bBSTopicMenusObj = this.f79617y1;
        List<BBSTopicMenuObj> menu = bBSTopicMenusObj != null ? bBSTopicMenusObj.getMenu() : null;
        if (menu == null || menu.size() <= 0 || (dota2GameDetailFragmentH3 = h3()) == null || !dota2GameDetailFragmentH3.isAdded() || !dota2GameDetailFragmentH3.isActive()) {
            return;
        }
        dota2GameDetailFragmentH3.o5(i10);
    }

    private void U3(KeyDescObj keyDescObj, String str) {
        if (PatchProxy.proxy(new Object[]{keyDescObj, str}, this, changeQuickRedirect, false, 25874, new Class[]{KeyDescObj.class, String.class}, Void.TYPE).isSupported || keyDescObj == null) {
            return;
        }
        UMImage uMImage = !com.max.hbcommon.utils.c.u(keyDescObj.getImg()) ? new UMImage(this.f66601b, keyDescObj.getImg()) : new UMImage(this.f66601b, R.drawable.share_thumbnail);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("web_url", str);
        com.max.hbshare.d.E(this.f66601b, new HBShareData(false, true, keyDescObj.getTitle(), keyDescObj.getDesc(), keyDescObj.getUrl(), null, uMImage, new com.max.hbshare.c.b("game_detail", this.R3, jsonObject)));
    }

    private void V2(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 25866, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int currentItem = this.mViewPager.getCurrentItem();
        BBSTopicMenusObj bBSTopicMenusObj = this.f79617y1;
        List<BBSTopicMenuObj> menu = bBSTopicMenusObj != null ? bBSTopicMenusObj.getMenu() : null;
        if (menu != null && menu.size() > 0 && currentItem < menu.size() && ("addfreelicense".equals(menu.get(currentItem).getType()) || "addfreelicense_epic".equals(menu.get(currentItem).getType()))) {
            List<GetGameFragment> listI3 = i3();
            if (com.max.hbcommon.utils.c.w(listI3)) {
                return;
            }
            for (int i11 = 0; i11 < listI3.size(); i11++) {
                if (listI3.get(i11).isAdded()) {
                    listI3.get(i11).o4(i10);
                }
            }
        }
    }

    private void V3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25857, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        final WeakReference weakReference = new WeakReference(this.mTabLayout);
        final WeakReference weakReference2 = new WeakReference(this.L3);
        final WeakReference weakReference3 = new WeakReference(this.mViewPager);
        this.mTabLayout.post(new Runnable() { // from class: com.max.xiaoheihe.module.bbs.b
            @Override // java.lang.Runnable
            public final void run() {
                ChannelsDetailActivity.B3(weakReference, weakReference2, weakReference3);
            }
        });
    }

    static /* synthetic */ void W1(ChannelsDetailActivity channelsDetailActivity, int i10) {
        if (PatchProxy.proxy(new Object[]{channelsDetailActivity, new Integer(i10)}, null, changeQuickRedirect, true, 25902, new Class[]{ChannelsDetailActivity.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        channelsDetailActivity.F3(i10);
    }

    private void W2(int i10) {
        GameDetailFragment gameDetailFragmentK3;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 25864, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int currentItem = this.mViewPager.getCurrentItem();
        BBSTopicMenusObj bBSTopicMenusObj = this.f79617y1;
        List<BBSTopicMenuObj> menu = bBSTopicMenusObj != null ? bBSTopicMenusObj.getMenu() : null;
        if (menu == null || menu.size() <= 0 || currentItem >= menu.size() || !"game".equals(menu.get(currentItem).getType()) || (gameDetailFragmentK3 = k3()) == null || !gameDetailFragmentK3.isAdded()) {
            return;
        }
        gameDetailFragmentK3.q8(i10);
    }

    private void X2(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 25867, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.K3 = i10 > ViewUtils.J(this.f66601b) * 3 ? f79604n4 : f79603m4;
        G3();
    }

    public static Intent Y2(Intent intent, String str, long j10, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{intent, str, new Long(j10), str2}, null, changeQuickRedirect, true, 25834, new Class[]{Intent.class, String.class, Long.TYPE, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        intent.putExtra(f79599i4, str);
        intent.putExtra(f79600j4, j10);
        intent.putExtra(f79601k4, str2);
        return intent;
    }

    public static Intent a3(Intent intent, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{intent, str}, null, changeQuickRedirect, true, 25836, new Class[]{Intent.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        intent.putExtra(f79602l4, str);
        return intent;
    }

    static /* synthetic */ void c2(ChannelsDetailActivity channelsDetailActivity) {
        if (PatchProxy.proxy(new Object[]{channelsDetailActivity}, null, changeQuickRedirect, true, 25895, new Class[]{ChannelsDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        channelsDetailActivity.P3();
    }

    public static Intent e3(Intent intent, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{intent, str}, null, changeQuickRedirect, true, 25835, new Class[]{Intent.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        intent.putExtra("game_platf", str);
        return intent;
    }

    public static Intent f3(Intent intent, String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{intent, str, str2}, null, changeQuickRedirect, true, 25837, new Class[]{Intent.class, String.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        intent.putExtra(f79593c4, str);
        intent.putExtra(f79594d4, str2);
        return intent;
    }

    private void g3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25877, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        HotWordTypeV2 hotWordTypeV2N = f79608r4.n();
        if (hotWordTypeV2N == HotWordTypeV2.GENERAL || hotWordTypeV2N == HotWordTypeV2.CHANNEL_CONTENT) {
            com.max.hbsearch.o.h(hotWordTypeV2N.getValue(), this.N);
        }
    }

    private List<GetGameFragment> i3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25862, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        BBSTopicMenusObj bBSTopicMenusObj = this.f79617y1;
        List<BBSTopicMenuObj> menu = bBSTopicMenusObj != null ? bBSTopicMenusObj.getMenu() : null;
        if (menu != null) {
            for (int i10 = 0; i10 < menu.size(); i10++) {
                Object objInstantiateItem = this.f79615x1.instantiateItem((ViewGroup) this.mViewPager, i10);
                if (objInstantiateItem instanceof GetGameFragment) {
                    arrayList.add((GetGameFragment) objInstantiateItem);
                }
            }
        }
        return arrayList;
    }

    static /* synthetic */ void k2(ChannelsDetailActivity channelsDetailActivity, String str) {
        if (PatchProxy.proxy(new Object[]{channelsDetailActivity, str}, null, changeQuickRedirect, true, 25903, new Class[]{ChannelsDetailActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        channelsDetailActivity.K3(str);
    }

    public static Intent l3(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3, str4, str5, str6, str7, str8, str9}, null, changeQuickRedirect, true, 25831, new Class[]{Context.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : p3(context, str, str2, str3, str4, str5, str6, str7, str8, str9, null, false);
    }

    public static Intent n3(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3, str4, str5, str6, str7, str8, str9, str10}, null, changeQuickRedirect, true, 25832, new Class[]{Context.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : p3(context, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, false);
    }

    public static Intent p3(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 25833, new Class[]{Context.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Boolean.TYPE}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) ChannelsDetailActivity.class);
        intent.putExtra("h_src", str);
        intent.putExtra("topic_id", str2);
        intent.putExtra("app_id", str3);
        intent.putExtra(V3, str4);
        intent.putExtra("user_id", str5);
        intent.putExtra("steam_id", str6);
        intent.putExtra("player_id", str7);
        intent.putExtra("sku_id", str8);
        intent.putExtra("page", str9);
        intent.putExtra("page_index", str10);
        intent.putExtra(f79595e4, z10);
        return intent;
    }

    static /* synthetic */ void q2(ChannelsDetailActivity channelsDetailActivity, boolean z10, float f10) {
        if (PatchProxy.proxy(new Object[]{channelsDetailActivity, new Byte(z10 ? (byte) 1 : (byte) 0), new Float(f10)}, null, changeQuickRedirect, true, 25896, new Class[]{ChannelsDetailActivity.class, Boolean.TYPE, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        channelsDetailActivity.Q3(z10, f10);
    }

    public static Intent q3(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3, str4, str5, str6, str7, str8, str9}, null, changeQuickRedirect, true, 25838, new Class[]{Context.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : p3(context, str, str2, str3, str4, str5, str6, str7, str8, str9, null, true);
    }

    private Fragment r3(BBSTopicMenuObj bBSTopicMenuObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSTopicMenuObj}, this, changeQuickRedirect, false, 25855, new Class[]{BBSTopicMenuObj.class}, Fragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (Fragment) patchProxyResultProxy.result;
        }
        String type = bBSTopicMenuObj.getType();
        String wiki_id = bBSTopicMenuObj.getWiki_id();
        String str = bBSTopicMenuObj.getParams() != null ? bBSTopicMenuObj.getParams().get("platform") : null;
        String str2 = this.T;
        if ("game".equals(type)) {
            this.O = bBSTopicMenuObj.getAppid();
            String game_type = bBSTopicMenuObj.getGame_type();
            this.P = game_type;
            return GameDetailFragment.p8(this.O, game_type, this.M, this.L, str2, this.S, this.Q, false, null, this.U, this.f79611c0, this.f79612p1, this.f79609a0, this.f79610b0, getIntent().getStringExtra(f79601k4), getIntent().getStringExtra(GameDetailFragment.S4));
        }
        if ("link".equals(type)) {
            return ChannelsLinkFragment.B4(this.N, this.R, bBSTopicMenuObj.getParams(), bBSTopicMenuObj.getFilters(), this.Y, this.Z);
        }
        if (BBSTopicMenuObj.TYPE_TEAM_ORG.equals(type)) {
            return ChannelsLinkFragment.B4(this.N, this.R, bBSTopicMenuObj.getParams(), bBSTopicMenuObj.getFilters(), null, null);
        }
        if ("news".equals(type)) {
            return ChannelsNewsFragment.K4(this.N, bBSTopicMenuObj.getParams());
        }
        if ("wiki".equals(type)) {
            return u3(String.format(lb.a.N2, wiki_id), bBSTopicMenuObj, false);
        }
        if ("game_data".equals(type)) {
            return r1.d0(bBSTopicMenuObj.getAppid(), str, this.Q, this.S, str2);
        }
        if (BBSTopicMenuObj.TYPE_STATISTIC.equals(type)) {
            return u3(String.format(lb.a.f130939b3, this.Q, bBSTopicMenuObj.getAppid(), this.S), bBSTopicMenuObj, true);
        }
        if ("webview".equals(type)) {
            return u3(bBSTopicMenuObj.getUrl(), bBSTopicMenuObj, true);
        }
        if ("addfreelicense".equals(type) || "addfreelicense_epic".equals(type)) {
            return GetGameFragment.n4(type, bBSTopicMenuObj.getUrl());
        }
        return null;
    }

    private int s3(String str, String str2, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 25854, new Class[]{String.class, String.class, String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        BBSTopicMenusObj bBSTopicMenusObj = this.f79617y1;
        List<BBSTopicMenuObj> menu = bBSTopicMenusObj != null ? bBSTopicMenusObj.getMenu() : null;
        if (menu == null) {
            return -1;
        }
        if (!com.max.hbcommon.utils.c.u(str3)) {
            for (int i10 = 0; i10 < menu.size(); i10++) {
                if (str3.equals(menu.get(i10).getMenu_id())) {
                    return i10;
                }
            }
        }
        if (!com.max.hbcommon.utils.c.u(str)) {
            int i11 = 0;
            for (int i12 = 0; i12 < menu.size(); i12++) {
                BBSTopicMenuObj bBSTopicMenuObj = menu.get(i12);
                if (str.equals(bBSTopicMenuObj.getType())) {
                    if (com.max.hbcommon.utils.c.u(str2) || TextUtils.isDigitsOnly(str2)) {
                        if (i11 == com.max.hbutils.utils.n.q(str2)) {
                            return i12;
                        }
                        i11++;
                    } else if (bBSTopicMenuObj.getParams() == null || bBSTopicMenuObj.getParams().get("platform") == null || str2.equals(bBSTopicMenuObj.getParams().get("platform"))) {
                        return i12;
                    }
                }
            }
        }
        return -1;
    }

    private void t3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25875, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().p5(this.Q, this.N, this.O, this.L).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    static /* synthetic */ void u2(ChannelsDetailActivity channelsDetailActivity, String str) {
        if (PatchProxy.proxy(new Object[]{channelsDetailActivity, str}, null, changeQuickRedirect, true, 25904, new Class[]{ChannelsDetailActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        channelsDetailActivity.w3(str);
    }

    private WebviewFragment u3(String str, BBSTopicMenuObj bBSTopicMenuObj, boolean z10) {
        int iP;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, bBSTopicMenuObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 25856, new Class[]{String.class, BBSTopicMenuObj.class, Boolean.TYPE}, WebviewFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebviewFragment) patchProxyResultProxy.result;
        }
        String str2 = com.max.hbcommon.utils.c.x(bBSTopicMenuObj.getShow_loading()) ? WebviewFragment.V4 : null;
        boolean z11 = !"0".equals(bBSTopicMenuObj.getNestscroll());
        int iE = com.max.mediaselector.lib.utils.h.e(this.f66601b);
        if (z11) {
            iP = -1;
        } else {
            iP = (((iE - com.max.hbutils.utils.t.p(this.f66601b)) - com.max.hbutils.utils.t.f73585f) - ViewUtils.f(this.f66601b, this.rv_mini_program.getVisibility() == 0 ? 100.0f : 44.0f)) - ViewUtils.f(this.f66601b, this.mTabLayout.getVisibility() == 0 ? 48.0f : 0.0f);
        }
        WebviewFragment webviewFragmentA = new com.max.xiaoheihe.module.webview.u(str).p(str2).m(z11).i(iP).w(z10 ? "1" : "0").z(bBSTopicMenuObj.getBg_config() != null).g(bBSTopicMenuObj.getBg_config()).a();
        webviewFragmentA.n4(true);
        webviewFragmentA.Q7(true);
        return webviewFragmentA;
    }

    private void w3(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25876, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().M5(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g()));
    }

    static /* synthetic */ void x2(ChannelsDetailActivity channelsDetailActivity, KeyDescObj keyDescObj, String str) {
        if (PatchProxy.proxy(new Object[]{channelsDetailActivity, keyDescObj, str}, null, changeQuickRedirect, true, 25905, new Class[]{ChannelsDetailActivity.class, KeyDescObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        channelsDetailActivity.U3(keyDescObj, str);
    }

    private void y3(Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 25843, new Class[]{Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if (!"android.intent.action.VIEW".equals(action) || data == null) {
            String stringExtra = intent.getStringExtra("topic_id");
            String stringExtra2 = intent.getStringExtra("app_id");
            String stringExtra3 = intent.getStringExtra("hashtag_name");
            if (com.max.hbcommon.utils.c.u(stringExtra) && com.max.hbcommon.utils.c.u(stringExtra2)) {
                return;
            }
            this.N = stringExtra;
            this.O = stringExtra2;
            this.R = stringExtra3;
            this.L = intent.getStringExtra("h_src");
            this.M = intent.getStringExtra("game_platf");
            this.P = intent.getStringExtra(V3);
            this.Q = intent.getStringExtra("user_id");
            this.S = intent.getStringExtra("steam_id");
            this.T = intent.getStringExtra("player_id");
            this.U = intent.getStringExtra("sku_id");
            this.V = intent.getStringExtra("page");
            this.W = intent.getStringExtra("page_index");
            this.X = intent.getStringExtra(f79602l4);
            this.f79611c0 = intent.getBooleanExtra(f79595e4, false);
            this.f79612p1 = intent.getStringExtra(f79598h4);
            this.f79609a0 = intent.getStringExtra(f79599i4);
            this.f79610b0 = intent.getLongExtra(f79600j4, 0L);
        } else {
            this.O = data.getQueryParameter(com.max.xiaoheihe.module.game.d0.f87248t);
            this.V = "game";
        }
        if (com.max.hbcommon.utils.c.u(this.Q)) {
            this.Q = com.max.xiaoheihe.utils.i0.j();
        }
        if (com.max.hbcommon.utils.c.u(this.S)) {
            this.S = com.max.xiaoheihe.utils.i0.m();
        }
        if (com.max.hbcommon.utils.c.u(this.T)) {
            this.T = com.max.xiaoheihe.utils.i0.l(this.O, null);
        }
        this.Y = intent.getStringExtra(f79593c4);
        this.Z = intent.getStringExtra(f79594d4);
        t3();
    }

    static /* synthetic */ void z2(ChannelsDetailActivity channelsDetailActivity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{channelsDetailActivity, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 25906, new Class[]{ChannelsDetailActivity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        channelsDetailActivity.C3(z10);
    }

    @Override // com.max.xiaoheihe.module.game.GameDetailFragment.a2
    public boolean I() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25870, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return getSupportFragmentManager().s0("share_image") != null;
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
    public void M3(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25887, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        androidx.viewpager.widget.a aVar = this.f79615x1;
        ViewPager viewPager = this.mViewPager;
        Object objInstantiateItem = aVar.instantiateItem((ViewGroup) viewPager, viewPager.getCurrentItem());
        if (objInstantiateItem instanceof ChannelsLinkFragment) {
            ((ChannelsLinkFragment) objInstantiateItem).e1(str);
        }
    }

    public void N1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25879, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mAppBarLayout.setExpanded(false, false);
    }

    public void N3(String str, String str2, String str3) {
        ViewPager viewPager;
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 25853, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported || (viewPager = this.mViewPager) == null) {
            return;
        }
        viewPager.setCurrentItem(s3(str, str2, str3), false);
    }

    @Override // com.max.xiaoheihe.app.c
    public void P(@androidx.annotation.n0 Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 25888, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        z0(1);
    }

    @Override // com.max.xiaoheihe.module.account.p0
    public void P1(@androidx.annotation.p0 String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25893, new Class[]{String.class}, Void.TYPE).isSupported && isActive()) {
            androidx.activity.result.b bVarT = T();
            if (bVarT instanceof com.max.xiaoheihe.module.account.p0) {
                ((com.max.xiaoheihe.module.account.p0) bVarT).P1(str);
            }
        }
    }

    public Fragment T() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25883, new Class[0], Fragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (Fragment) patchProxyResultProxy.result;
        }
        for (Fragment fragment : getSupportFragmentManager().J0()) {
            if (fragment.getArguments() != null) {
                if ((f79606p4 + this.mViewPager.getCurrentItem()).equals(fragment.getArguments().getString(f79606p4))) {
                    return fragment;
                }
            }
        }
        return null;
    }

    public void T3(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 25848, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.P3.f(z10);
    }

    public boolean W3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25852, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        BBSTopicMenusObj bBSTopicMenusObj = this.f79617y1;
        return bBSTopicMenusObj != null && com.max.hbcommon.utils.c.x(bBSTopicMenusObj.getMedia_view_new_style());
    }

    @Override // com.max.xiaoheihe.app.c
    public void Y(@androidx.annotation.n0 Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 25890, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        z0(2);
    }

    @Override // com.max.xiaoheihe.module.game.GameDetailFragment.a2
    public void Z(boolean z10, String str, String str2) {
        boolean zEquals = false;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), str, str2}, this, changeQuickRedirect, false, 25859, new Class[]{Boolean.TYPE, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.u(str2)) {
            str2 = this.O;
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            zEquals = GameObj.GAME_TYPE_CONSOLE.equals(this.P);
        } else if ("ps4".equals(str) || "switch".equals(str) || "xbox".equals(str)) {
            zEquals = true;
        }
        if ("mobile".equals(this.P)) {
            V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Ia(this.L, this.O).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(z10)));
        } else if (zEquals) {
            V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().I1(this.L, str2, str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c(z10)));
        } else {
            V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().O9(this.L, str2, this.U, str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(z10)));
        }
    }

    @Override // com.max.xiaoheihe.app.c
    public void b0(@androidx.annotation.n0 Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 25889, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        z0(3);
    }

    @Override // com.max.xiaoheihe.module.video.b
    public void c(AbsVideoView absVideoView, ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{absVideoView, viewGroup}, this, changeQuickRedirect, false, 25872, new Class[]{AbsVideoView.class, ViewGroup.class}, Void.TYPE).isSupported || absVideoView == null) {
            return;
        }
        this.G2 = com.max.hbutils.utils.t.q(this.f66601b);
        VideoPlayerManager.f76079a.w(this, absVideoView, viewGroup, 0);
    }

    @Override // com.max.xiaoheihe.module.game.GameDetailFragment.a2
    public void d(ShareImageDialogFragment shareImageDialogFragment) {
        if (PatchProxy.proxy(new Object[]{shareImageDialogFragment}, this, changeQuickRedirect, false, 25869, new Class[]{ShareImageDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        shareImageDialogFragment.show(getSupportFragmentManager(), "share_image");
    }

    @Override // com.max.xiaoheihe.module.video.b
    public void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25873, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        VideoPlayerManager.f76079a.e(this);
        int i10 = this.G2;
        if (i10 != -1) {
            com.max.hbutils.utils.t.P(this.f66601b, i10);
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.ChannelsLinkFragment.i
    public void f(View view, int i10, int i11) {
        Object[] objArr = {view, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 25871, new Class[]{View.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 != 0) {
            X2(i11);
        }
        if (Math.abs(i10) <= this.G3 || i10 > 0) {
            return;
        }
        this.P3.i();
    }

    @Override // com.max.hbcommon.base.BaseActivity, com.max.hbcommon.analytics.d.f
    @androidx.annotation.p0
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25884, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("topic_id", this.N);
        if (!com.max.hbcommon.utils.c.u(this.L)) {
            jsonObject.addProperty("h_src", this.L);
        }
        return jsonObject.toString();
    }

    public Dota2GameDetailFragment h3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25861, new Class[0], Dota2GameDetailFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dota2GameDetailFragment) patchProxyResultProxy.result;
        }
        BBSTopicMenusObj bBSTopicMenusObj = this.f79617y1;
        List<BBSTopicMenuObj> menu = bBSTopicMenusObj != null ? bBSTopicMenusObj.getMenu() : null;
        if (menu == null) {
            return null;
        }
        for (int i10 = 0; i10 < menu.size(); i10++) {
            Object objInstantiateItem = this.f79615x1.instantiateItem((ViewGroup) this.mViewPager, i10);
            if (objInstantiateItem instanceof Dota2GameDetailFragment) {
                return (Dota2GameDetailFragment) objInstantiateItem;
            }
        }
        return null;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25839, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_channels_detail);
        ButterKnife.a(this);
        this.G3 = ViewConfiguration.get(this.f66601b).getScaledTouchSlop();
        com.max.hbutils.utils.t.h0(getWindow());
        com.max.hbutils.utils.t.M(this.f66601b, true);
        y3(getIntent());
        this.M3 = ViewUtils.V(this.mTabLayout);
        this.mToolbar.a0();
        int iM = com.max.hbutils.utils.t.m(this.f66601b);
        ViewGroup.LayoutParams layoutParams = this.mStatusBar.getLayoutParams();
        layoutParams.height = iM;
        this.mStatusBar.setLayoutParams(layoutParams);
        this.vg_title.setPadding(0, iM, 0, 0);
        this.f79613p2 = this.mToolbar.findViewById(R.id.iv_action_point);
        this.mToolbar.getAppbarActionButtonView().setPadding(ViewUtils.f(this.f66601b, 10.0f), 0, ViewUtils.f(this.f66601b, 14.0f), 0);
        this.mToolbar.getAppbarActionButtonXView().setPadding(ViewUtils.f(this.f66601b, 10.0f), 0, ViewUtils.f(this.f66601b, 10.0f), 0);
        this.mToolbar.getAppbarActionButtonMoreView().setPadding(ViewUtils.f(this.f66601b, 10.0f), 0, ViewUtils.f(this.f66601b, 10.0f), 0);
        EZTabLayout eZTabLayout = (EZTabLayout) this.mToolbar.V(R.layout.layout_title_tab_dark);
        this.L3 = eZTabLayout;
        eZTabLayout.setTabMarginBottom(0);
        this.L3.setAlpha(0.0f);
        this.L3.c(new i());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.leftMargin = ViewUtils.f(this.f66601b, 40.0f);
        layoutParams2.rightMargin = ViewUtils.f(this.f66601b, 110.0f);
        this.L3.setLayoutParams(layoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mToolbar.getAppbarTitleTextView().getLayoutParams();
        int iF = ViewUtils.f(this.f66601b, 120.0f);
        marginLayoutParams.rightMargin = iF;
        marginLayoutParams.leftMargin = iF;
        this.mToolbar.getAppbarTitleTextView().setLayoutParams(marginLayoutParams);
        i iVar = null;
        this.N3 = this.f66602c.inflate(R.layout.layout_concept_topic_title, (ViewGroup) null, false);
        j jVar = new j(ViewUtils.f(this.f66601b, 56.0f));
        this.O3 = jVar;
        this.mAppBarLayout.e(jVar);
        this.f79615x1 = new k(getSupportFragmentManager());
        this.mViewPager.c(new l());
        this.P3 = new com.max.xiaoheihe.utils.u(this, this.vg_post, ViewUtils.f(this.f66601b, 74.0f));
        this.mViewPager.setOffscreenPageLimit(6);
        this.mViewPager.setAdapter(this.f79615x1);
        this.mTabLayout.setupWithViewPager(this.mViewPager);
        this.L3.setupWithViewPager(this.mViewPager);
        NewMsgBroadcastReceiver newMsgBroadcastReceiver = new NewMsgBroadcastReceiver(this, iVar);
        this.f79616x2 = newMsgBroadcastReceiver;
        t1(newMsgBroadcastReceiver, lb.a.f131025q);
        RefreshBbsTabBroadcastReceiver refreshBbsTabBroadcastReceiver = new RefreshBbsTabBroadcastReceiver(this, iVar);
        this.f79618y2 = refreshBbsTabBroadcastReceiver;
        t1(refreshBbsTabBroadcastReceiver, lb.a.S);
        if (lb.a.Y0.equals(this.O) || "40".equals(this.N)) {
            ImageCacheManager.i().g(ImageCacheManager.f87358e);
        }
    }

    public GameDetailFragment k3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25860, new Class[0], GameDetailFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameDetailFragment) patchProxyResultProxy.result;
        }
        BBSTopicMenusObj bBSTopicMenusObj = this.f79617y1;
        List<BBSTopicMenuObj> menu = bBSTopicMenusObj != null ? bBSTopicMenusObj.getMenu() : null;
        if (menu == null) {
            return null;
        }
        for (int i10 = 0; i10 < menu.size(); i10++) {
            if ("game".equals(menu.get(i10).getType())) {
                Object objInstantiateItem = this.f79615x1.instantiateItem((ViewGroup) this.mViewPager, i10);
                if (objInstantiateItem instanceof GameDetailFragment) {
                    return (GameDetailFragment) objInstantiateItem;
                }
                return null;
            }
        }
        return null;
    }

    @Override // com.max.xiaoheihe.module.bbs.ChannelsLinkFragment.i
    public void n0(BBSTopicLinksObj bBSTopicLinksObj) {
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25882, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        t3();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        boolean z10 = false;
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 25880, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        UMShareAPI.get(this.f66601b).onActivityResult(i10, i11, intent);
        GameDetailFragment gameDetailFragmentK3 = k3();
        if (gameDetailFragmentK3 == null || !gameDetailFragmentK3.isActive()) {
            return;
        }
        if ((i10 == 1 || i10 == 2) && intent != null) {
            z10 = true;
        }
        if (z10 || i10 == 9991 || i10 == 3) {
            gameDetailFragmentK3.onActivityResult(i10, i11, intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        GameDetailFragment gameDetailFragmentK3;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25878, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int currentItem = this.mViewPager.getCurrentItem();
        BBSTopicMenusObj bBSTopicMenusObj = this.f79617y1;
        List<BBSTopicMenuObj> menu = bBSTopicMenusObj != null ? bBSTopicMenusObj.getMenu() : null;
        if (menu != null && menu.size() > 0 && currentItem < menu.size() && "game".equals(menu.get(currentItem).getType()) && (gameDetailFragmentK3 = k3()) != null && gameDetailFragmentK3.isAdded() && gameDetailFragmentK3.onBackPressed()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25881, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        UMShareAPI.get(this).release();
        NewMsgBroadcastReceiver newMsgBroadcastReceiver = this.f79616x2;
        if (newMsgBroadcastReceiver != null) {
            unregisterReceiver(newMsgBroadcastReceiver);
        }
        RefreshBbsTabBroadcastReceiver refreshBbsTabBroadcastReceiver = this.f79618y2;
        if (refreshBbsTabBroadcastReceiver != null) {
            unregisterReceiver(refreshBbsTabBroadcastReceiver);
        }
        if (ad.a.d()) {
            this.f79615x1 = null;
            this.mViewPager = null;
            this.rv_mini_program = null;
        }
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 25842, new Class[]{Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onNewIntent(intent);
        y3(intent);
    }

    @Override // com.max.xiaoheihe.app.c
    public void u(@androidx.annotation.n0 Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 25891, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        z0(0);
    }

    public void z0(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 25892, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        for (Fragment fragment : getSupportFragmentManager().J0()) {
            if (fragment instanceof WebviewFragment) {
                WebviewFragment webviewFragment = (WebviewFragment) fragment;
                if (webviewFragment.isActive()) {
                    webviewFragment.L7(i10);
                }
            }
        }
    }
}
