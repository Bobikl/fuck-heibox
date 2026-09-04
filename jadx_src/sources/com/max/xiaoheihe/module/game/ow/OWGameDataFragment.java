package com.max.xiaoheihe.module.game.ow;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.webkit.ClientCertRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.widget.l0;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.PostEncryptParamsObj;
import com.max.hbcommon.component.QRCodeShareView;
import com.max.hbshare.bean.HBShareData;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.ActivityObj;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.bean.game.GameGridDataCardObj;
import com.max.xiaoheihe.bean.game.ac.AcContentMenuObj;
import com.max.xiaoheihe.bean.game.ow.OWAccountInfo;
import com.max.xiaoheihe.bean.game.ow.OWPlayerOverviewObj;
import com.max.xiaoheihe.bean.game.ow.OWSeasonObj;
import com.max.xiaoheihe.module.account.GameBindingFragment;
import com.max.xiaoheihe.module.game.PlayerLeaderboardsActivity;
import com.max.xiaoheihe.module.game.z;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import okhttp3.d0;
import org.apache.tools.ant.taskdefs.z0;

/* JADX INFO: loaded from: classes11.dex */
@com.max.hbcommon.analytics.m(path = lb.d.Q3)
@n9.a({com.max.hbminiprogram.d.class})
public class OWGameDataFragment extends com.max.xiaoheihe.module.game.d implements GameBindingFragment.n, z.a {
    private static final String N = "player_id";
    public static final String O = "userid";
    private static final String P = "OWGameDataFragment";
    public static ChangeQuickRedirect changeQuickRedirect;
    private ObjectAnimator D;
    private int E;
    private String F;
    private OWSeasonObj G;
    private com.max.hbcommon.base.adapter.u<GameGridDataCardObj> H;
    private com.max.hbcommon.base.adapter.u<GameGridDataCardObj> I;
    private GameBindingFragment J;
    private UserProfileUpdatedBroadcastReceiver K;

    @BindView(R.id.iv_level_frame)
    ImageView iv_level_frame;

    @BindView(R.id.iv_level_frame_icon)
    ImageView iv_level_frame_icon;

    @BindView(R.id.iv_rank_img)
    ImageView iv_rank_img;

    @BindView(R.id.ll_expanded_data)
    View ll_expanded_data;

    @BindView(R.id.bottom_space)
    View mBottomSpaceView;

    @BindView(R.id.iv_fragment_r6_data_avatar)
    ImageView mIvAvatar;

    @BindView(R.id.iv_r6_data_head_image)
    ImageView mIvHeadImage;

    @BindView(R.id.iv_fragment_r6_data_update_icon)
    ImageView mIvUpdateIcon;

    @BindView(R.id.cv_player_info)
    CardView mPlayerInfoCardView;

    @BindView(R.id.view_radar_chart)
    ViewGroup mRadarChartWarpper;

    @BindView(R.id.srl_fragment_r6_data)
    SmartRefreshLayout mSmartRefreshLayout;

    @BindView(R.id.tv_fragment_r6_data_nickname)
    TextView mTvNickname;

    @BindView(R.id.tv_fragment_r6_data_update_text)
    TextView mTvUpdateBtnDesc;

    @BindView(R.id.tv_fragment_r6_data_update_time)
    TextView mTvUpdateDesc;

    @BindView(R.id.v_fragment_r6_game_data)
    View mVSpace;

    @BindView(R.id.vg_fragment_r6_bind_hint)
    ViewGroup mVgBindHint;

    @BindView(R.id.rl_message)
    ViewGroup mVgMessage;

    @BindView(R.id.vg_r6_data_player_info_wrapper)
    ViewGroup mVgPlayerInfoWrapper;

    @BindView(R.id.vg_fragment_r6_data_update)
    ViewGroup mVgUpdate;

    @BindView(R.id.webview_update)
    WebView mWebView;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f87850q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f87851r;

    @BindView(R.id.rv_expanded_data)
    RecyclerView rv_expanded_data;

    @BindView(R.id.rv_header_data)
    RecyclerView rv_header_data;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f87852s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.s<AcContentMenuObj> f87853t;

    @BindView(R.id.tv_data_expand)
    TextView tv_data_expand;

    @BindView(R.id.tv_level)
    TextView tv_level;

    @BindView(R.id.tv_medal_bronze)
    TextView tv_medal_bronze;

    @BindView(R.id.tv_medal_gold)
    TextView tv_medal_gold;

    @BindView(R.id.tv_medal_silver)
    TextView tv_medal_silver;

    @BindView(R.id.tv_r6_data_desc1)
    TextView tv_r6_data_desc1;

    @BindView(R.id.tv_r6_data_desc2)
    TextView tv_r6_data_desc2;

    @BindView(R.id.tv_season)
    TextView tv_season;

    @BindView(R.id.tv_season_arrow)
    TextView tv_season_arrow;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f87854u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f87855v;

    @BindView(R.id.vg_content_list)
    ViewGroup vg_content_list;

    @BindView(R.id.vg_data_container)
    View vg_data_container;

    @BindView(R.id.vg_medal)
    ViewGroup vg_medal;

    @BindView(R.id.vg_season)
    ViewGroup vg_season;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f87856w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private OWPlayerOverviewObj f87859z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f87857x = 500;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f87858y = 0;
    private List<AcContentMenuObj> A = new ArrayList();
    private List<GameGridDataCardObj> B = new ArrayList();
    private List<GameGridDataCardObj> C = new ArrayList();
    private ArrayList<Bitmap> L = new ArrayList<>();
    private UMShareListener M = new com.max.hbshare.c.b(com.max.hbshare.c.f72565u, new p());

    public class UserProfileUpdatedBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private UserProfileUpdatedBroadcastReceiver() {
        }

        /* synthetic */ UserProfileUpdatedBroadcastReceiver(OWGameDataFragment oWGameDataFragment, j jVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 38004, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported && lb.a.f131055v.equals(intent.getAction())) {
                OWGameDataFragment.L4(OWGameDataFragment.this);
            }
        }
    }

    public class a extends com.max.hbcommon.network.d<Result<OWPlayerOverviewObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37950, new Class[0], Void.TYPE).isSupported && OWGameDataFragment.this.isActive()) {
                OWGameDataFragment.this.mSmartRefreshLayout.A(500);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 37949, new Class[]{Throwable.class}, Void.TYPE).isSupported && OWGameDataFragment.this.isActive()) {
                super.onError(th2);
                OWGameDataFragment.this.mSmartRefreshLayout.A(500);
                OWGameDataFragment.W4(OWGameDataFragment.this);
                th2.printStackTrace();
            }
        }

        public void onNext(Result<OWPlayerOverviewObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 37951, new Class[]{Result.class}, Void.TYPE).isSupported && OWGameDataFragment.this.isActive()) {
                if (result == null) {
                    OWGameDataFragment.X4(OWGameDataFragment.this);
                    return;
                }
                OWGameDataFragment.this.f87859z = result.getResult();
                if (OWGameDataFragment.this.G == null && !com.max.hbcommon.utils.c.w(OWGameDataFragment.this.f87859z.getSeasons())) {
                    OWGameDataFragment oWGameDataFragment = OWGameDataFragment.this;
                    oWGameDataFragment.G = oWGameDataFragment.f87859z.getSeasons().get(0);
                }
                if (OWGameDataFragment.this.f87859z.getPlayer_info() != null) {
                    OWGameDataFragment oWGameDataFragment2 = OWGameDataFragment.this;
                    oWGameDataFragment2.f87851r = oWGameDataFragment2.f87859z.getPlayer_info().getNickname();
                }
                OWGameDataFragment.e5(OWGameDataFragment.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37952, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<OWPlayerOverviewObj>) obj);
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements l0.e {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // androidx.appcompat.widget.l0.e
            public boolean onMenuItemClick(MenuItem menuItem) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{menuItem}, this, changeQuickRedirect, false, 37954, new Class[]{MenuItem.class}, Boolean.TYPE);
                if (patchProxyResultProxy.isSupported) {
                    return ((Boolean) patchProxyResultProxy.result).booleanValue();
                }
                int itemId = menuItem.getItemId();
                OWGameDataFragment oWGameDataFragment = OWGameDataFragment.this;
                oWGameDataFragment.G = oWGameDataFragment.f87859z.getSeasons().get(itemId);
                OWGameDataFragment.L4(OWGameDataFragment.this);
                return true;
            }
        }

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37953, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            l0 l0Var = new l0(((com.max.hbcommon.base.d) OWGameDataFragment.this).mContext, view);
            Menu menuD = l0Var.d();
            for (int i10 = 0; i10 < OWGameDataFragment.this.f87859z.getSeasons().size(); i10++) {
                menuD.add(0, i10, 0, OWGameDataFragment.this.f87859z.getSeasons().get(i10).getDesc());
            }
            l0Var.k(new a());
            l0Var.l();
        }
    }

    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37955, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((com.max.hbcommon.base.d) OWGameDataFragment.this).mContext.startActivity(OWPlayerHeroActivity.i2(((com.max.hbcommon.base.d) OWGameDataFragment.this).mContext, OWGameDataFragment.this.f87850q, OWGameDataFragment.this.G.getSeason(), "1".equals(OWGameDataFragment.this.f87859z.getShow_hero_dtl())));
        }
    }

    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f87868b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ActivityObj f87869c;

        public class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 37957, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        public class b implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 37958, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                d.this.f87868b.setVisibility(8);
                com.max.hbcache.c.C("activity_shown" + d.this.f87869c.getActivity_id(), "0");
                dialogInterface.dismiss();
            }
        }

        d(ViewGroup viewGroup, ActivityObj activityObj) {
            this.f87868b = viewGroup;
            this.f87869c = activityObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37956, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            new com.max.hbcommon.view.a.f(((com.max.hbcommon.base.d) OWGameDataFragment.this).mContext).y(OWGameDataFragment.this.getString(R.string.prompt)).l(OWGameDataFragment.this.getString(R.string.do_not_display_activity_tips)).t(R.string.dont_display, new b()).n(R.string.cancel, new a()).F();
        }
    }

    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ActivityObj f87873b;

        e(ActivityObj activityObj) {
            this.f87873b = activityObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37959, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            String maxjia = this.f87873b.getMaxjia();
            if (com.max.hbcommon.utils.c.u(maxjia)) {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.not_bind_account));
                return;
            }
            int need_login = this.f87873b.getNeed_login();
            int need_bind_steam_id = this.f87873b.getNeed_bind_steam_id();
            if (need_login != 1) {
                com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) OWGameDataFragment.this).mContext, maxjia);
                return;
            }
            if (com.max.xiaoheihe.utils.d.b1(((com.max.hbcommon.base.d) OWGameDataFragment.this).mContext)) {
                return;
            }
            if (need_bind_steam_id != 1) {
                com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) OWGameDataFragment.this).mContext, maxjia);
            } else if (i0.i().getSteam_id_info() != null) {
                com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) OWGameDataFragment.this).mContext, maxjia);
            } else {
                com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.not_bind_account));
            }
        }
    }

    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37960, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((com.max.hbcommon.base.d) OWGameDataFragment.this).mContext.startActivity(OWPlayerAchievementsActivity.c2(((com.max.hbcommon.base.d) OWGameDataFragment.this).mContext, OWGameDataFragment.this.f87850q));
        }
    }

    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f87876b;

        g(String str) {
            this.f87876b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37961, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcache.c.C("ow_message_time", this.f87876b);
            OWGameDataFragment.this.mVgMessage.setVisibility(8);
        }
    }

    public class h implements com.max.xiaoheihe.view.m {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // com.max.xiaoheihe.view.m
        public void a(Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 37963, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            dialog.dismiss();
        }

        @Override // com.max.xiaoheihe.view.m
        public void b(Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 37962, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            dialog.dismiss();
        }
    }

    public class i extends com.max.hbcommon.network.d<Result<Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 37964, new Class[]{Throwable.class}, Void.TYPE).isSupported && OWGameDataFragment.this.isActive()) {
                super.onError(th2);
                th2.printStackTrace();
            }
        }

        public void onNext(Result<Object> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 37965, new Class[]{Result.class}, Void.TYPE).isSupported && OWGameDataFragment.this.isActive()) {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f("解除绑定成功");
                if (i0.o() != null) {
                    i0.o().setOw_account_info(null);
                }
                OWGameDataFragment.L4(OWGameDataFragment.this);
                com.max.xiaoheihe.utils.d.x1(((com.max.hbcommon.base.d) OWGameDataFragment.this).mContext);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37966, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<Object>) obj);
        }
    }

    public class j implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 37948, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            OWGameDataFragment.this.clearCompositeDisposable();
            OWGameDataFragment.L4(OWGameDataFragment.this);
        }
    }

    public class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37968, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            OWGameDataFragment oWGameDataFragment = OWGameDataFragment.this;
            oWGameDataFragment.f87855v = true ^ oWGameDataFragment.f87855v;
            OWGameDataFragment.t5(OWGameDataFragment.this);
        }
    }

    public class l implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, 37969, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) OWGameDataFragment.this.ll_expanded_data.getLayoutParams();
            layoutParams.height = iIntValue;
            OWGameDataFragment.this.ll_expanded_data.setLayoutParams(layoutParams);
        }
    }

    public class m implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, 37970, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) OWGameDataFragment.this.ll_expanded_data.getLayoutParams();
            layoutParams.height = iIntValue;
            OWGameDataFragment.this.ll_expanded_data.setLayoutParams(layoutParams);
        }
    }

    public class n extends com.max.hbcommon.network.d<d0> {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        public void a(d0 d0Var) {
            if (PatchProxy.proxy(new Object[]{d0Var}, this, changeQuickRedirect, false, 37972, new Class[]{d0.class}, Void.TYPE).isSupported) {
                return;
            }
            try {
                String strString = d0Var.string();
                com.max.hbcommon.utils.d.b("owlogin", "result=" + strString);
                OWGameDataFragment.u5(OWGameDataFragment.this, strString);
            } catch (Exception e10) {
                super.onError(e10);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 37971, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            if (OWGameDataFragment.this.isActive()) {
                OWGameDataFragment.this.mIvUpdateIcon.setVisibility(8);
                if (OWGameDataFragment.this.D.isRunning()) {
                    OWGameDataFragment.this.D.end();
                }
                OWGameDataFragment.this.mTvUpdateBtnDesc.setText(com.max.xiaoheihe.utils.d.n0(R.string.click_update));
                OWGameDataFragment.this.mVgUpdate.setClickable(true);
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.d("更新失败请稍后再试");
            }
            super.onError(th2);
            th2.printStackTrace();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37973, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((d0) obj);
        }
    }

    public class o extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 37974, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            if (OWGameDataFragment.this.isActive()) {
                OWGameDataFragment.this.mIvUpdateIcon.setVisibility(8);
                if (OWGameDataFragment.this.D.isRunning()) {
                    OWGameDataFragment.this.D.end();
                }
                OWGameDataFragment.this.mTvUpdateBtnDesc.setText(com.max.xiaoheihe.utils.d.n0(R.string.click_update));
                OWGameDataFragment.this.mVgUpdate.setClickable(true);
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.d("更新失败请稍后再试");
            }
            super.onError(th2);
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 37975, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            OWGameDataFragment.this.mIvUpdateIcon.setVisibility(8);
            if (OWGameDataFragment.this.D.isRunning()) {
                OWGameDataFragment.this.D.end();
            }
            OWGameDataFragment.this.mTvUpdateBtnDesc.setText(com.max.xiaoheihe.utils.d.n0(R.string.click_update));
            OWGameDataFragment.this.mVgUpdate.setClickable(true);
            OWGameDataFragment.L4(OWGameDataFragment.this);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37976, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class p implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 37979, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            OWGameDataFragment.this.I5();
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(SHARE_MEDIA share_media, Throwable th2) {
            if (PatchProxy.proxy(new Object[]{share_media, th2}, this, changeQuickRedirect, false, 37978, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(OWGameDataFragment.this.getString(R.string.share_fail));
            OWGameDataFragment.this.I5();
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 37977, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(OWGameDataFragment.this.getString(R.string.share_success));
            OWGameDataFragment.this.I5();
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(SHARE_MEDIA share_media) {
        }
    }

    public class q implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37967, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - OWGameDataFragment.this.f87858y > 500) {
                OWGameDataFragment.this.f87858y = jCurrentTimeMillis;
                OWGameDataFragment.Y4(OWGameDataFragment.this);
            }
        }
    }

    public class r extends WebViewClient {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f87888a = 0;

        public class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 37989, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        public class b implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 37990, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                Intent intent = new Intent(((com.max.hbcommon.base.d) OWGameDataFragment.this).mContext, (Class<?>) WebActionActivity.class);
                intent.putExtra("pageurl", com.max.xiaoheihe.module.game.ow.a.f87960a);
                intent.putExtra("title", com.max.xiaoheihe.utils.d.n0(R.string.login_bn));
                OWGameDataFragment.this.startActivity(intent);
                dialogInterface.dismiss();
            }
        }

        public class c implements com.max.xiaoheihe.view.m {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SslErrorHandler f87892a;

            c(SslErrorHandler sslErrorHandler) {
                this.f87892a = sslErrorHandler;
            }

            @Override // com.max.xiaoheihe.view.m
            public void a(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 37992, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f87892a.proceed();
                dialog.dismiss();
            }

            @Override // com.max.xiaoheihe.view.m
            public void b(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 37991, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f87892a.cancel();
                dialog.dismiss();
            }
        }

        r() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            if (PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 37980, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onLoadResource(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 37982, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onPageFinished(webView, str);
            if (OWGameDataFragment.this.isActive()) {
                int i10 = this.f87888a - 1;
                this.f87888a = i10;
                if (i10 != 0 || com.max.hbcommon.utils.c.u(str)) {
                    return;
                }
                if (str.contains(com.max.xiaoheihe.module.game.ow.a.f87963d)) {
                    com.max.xiaoheihe.module.game.ow.a.d(((com.max.hbcommon.base.d) OWGameDataFragment.this).mContext, com.max.xiaoheihe.module.game.ow.a.f87964e);
                    OWGameDataFragment oWGameDataFragment = OWGameDataFragment.this;
                    OWGameDataFragment.x5(oWGameDataFragment, com.max.xiaoheihe.module.game.ow.a.b(((com.max.hbcommon.base.d) oWGameDataFragment).mContext, com.max.xiaoheihe.module.game.ow.a.f87964e));
                } else if (str.contains("www.battlenet.com.cn/login")) {
                    OWGameDataFragment.this.mIvUpdateIcon.setVisibility(8);
                    if (OWGameDataFragment.this.D.isRunning()) {
                        OWGameDataFragment.this.D.end();
                    }
                    OWGameDataFragment.this.mTvUpdateBtnDesc.setText(com.max.xiaoheihe.utils.d.n0(R.string.click_update));
                    OWGameDataFragment.this.mVgUpdate.setClickable(true);
                    new com.max.hbcommon.view.a.f(((com.max.hbcommon.base.d) OWGameDataFragment.this).mContext).y(com.max.xiaoheihe.utils.d.n0(R.string.ow_update_need_login)).t(R.string.login, new b()).n(R.string.cancel, new a()).F();
                }
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (PatchProxy.proxy(new Object[]{webView, str, bitmap}, this, changeQuickRedirect, false, 37981, new Class[]{WebView.class, String.class, Bitmap.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onPageStarted(webView, str, bitmap);
            this.f87888a = Math.max(this.f87888a, 1);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
            if (PatchProxy.proxy(new Object[]{webView, clientCertRequest}, this, changeQuickRedirect, false, 37986, new Class[]{WebView.class, ClientCertRequest.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onReceivedClientCertRequest(webView, clientCertRequest);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            if (PatchProxy.proxy(new Object[]{webView, new Integer(i10), str, str2}, this, changeQuickRedirect, false, 37987, new Class[]{WebView.class, Integer.TYPE, String.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b(OWGameDataFragment.P, "onReceivedError" + str + "   code=" + i10);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (PatchProxy.proxy(new Object[]{webView, webResourceRequest, webResourceError}, this, changeQuickRedirect, false, 37983, new Class[]{WebView.class, WebResourceRequest.class, WebResourceError.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            if (PatchProxy.proxy(new Object[]{webView, webResourceRequest, webResourceResponse}, this, changeQuickRedirect, false, 37984, new Class[]{WebView.class, WebResourceRequest.class, WebResourceResponse.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (PatchProxy.proxy(new Object[]{webView, sslErrorHandler, sslError}, this, changeQuickRedirect, false, 37985, new Class[]{WebView.class, SslErrorHandler.class, SslError.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b(OWGameDataFragment.P, "onReceivedSslError:" + sslError);
            if (OWGameDataFragment.this.isAdded()) {
                com.max.xiaoheihe.view.l.D(((com.max.hbcommon.base.d) OWGameDataFragment.this).mContext, OWGameDataFragment.this.getString(R.string.prompt), OWGameDataFragment.this.getString(R.string.ssl_error_hint), OWGameDataFragment.this.getString(R.string.confirm), OWGameDataFragment.this.getString(R.string.cancel), new c(sslErrorHandler));
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 37988, new Class[]{WebView.class, String.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if ((str.startsWith("http://") || str.startsWith("https://")) && !str.endsWith(".apk")) {
                this.f87888a++;
            }
            com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) OWGameDataFragment.this).mContext, str);
            return true;
        }
    }

    public class s implements com.max.xiaoheihe.view.m {
        public static ChangeQuickRedirect changeQuickRedirect;

        s() {
        }

        @Override // com.max.xiaoheihe.view.m
        public void a(Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 37994, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            dialog.dismiss();
        }

        @Override // com.max.xiaoheihe.view.m
        public void b(Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 37993, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            dialog.dismiss();
        }
    }

    public class t extends com.max.hbcommon.base.adapter.u<GameGridDataCardObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        t(Context context, List list) {
            super(context, list);
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, GameGridDataCardObj gameGridDataCardObj) {
            Object[] objArr = {new Integer(i10), gameGridDataCardObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 37996, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, gameGridDataCardObj);
        }

        public int n(int i10, GameGridDataCardObj gameGridDataCardObj) {
            return R.layout.item_grid_layout;
        }

        public void o(com.max.hbcommon.base.adapter.s.e eVar, GameGridDataCardObj gameGridDataCardObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameGridDataCardObj}, this, changeQuickRedirect, false, 37995, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameGridDataCardObj.class}, Void.TYPE).isSupported) {
                return;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, ViewUtils.f(OWGameDataFragment.this.getContext(), 50.0f));
            layoutParams.setMargins(ViewUtils.f(OWGameDataFragment.this.getContext(), 5.0f), ViewUtils.f(OWGameDataFragment.this.getContext(), 5.0f), ViewUtils.f(OWGameDataFragment.this.getContext(), 5.0f), ViewUtils.f(OWGameDataFragment.this.getContext(), 5.0f));
            eVar.itemView.setLayoutParams(layoutParams);
            TextView textView = (TextView) eVar.i(R.id.tv_item_grid_layout_value);
            TextView textView2 = (TextView) eVar.i(R.id.tv_item_grid_layout_desc);
            TextView textView3 = (TextView) eVar.i(R.id.tv_score);
            ImageView imageView = (ImageView) eVar.i(R.id.iv_item_grid_layout_icon);
            textView.setText(gameGridDataCardObj.getValue());
            textView2.setText(gameGridDataCardObj.getDesc());
            if (com.max.hbcommon.utils.c.u(gameGridDataCardObj.getScore())) {
                textView3.setVisibility(8);
            } else {
                textView3.setVisibility(0);
                textView3.setText(gameGridDataCardObj.getScore());
            }
            if (com.max.hbcommon.utils.c.u(gameGridDataCardObj.getIcon())) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                com.max.hbimage.b.K(gameGridDataCardObj.getIcon(), imageView);
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 37997, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, (GameGridDataCardObj) obj);
        }
    }

    public class u extends com.max.hbcommon.base.adapter.u<GameGridDataCardObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        u(Context context, List list) {
            super(context, list);
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, GameGridDataCardObj gameGridDataCardObj) {
            Object[] objArr = {new Integer(i10), gameGridDataCardObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 37999, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, gameGridDataCardObj);
        }

        public int n(int i10, GameGridDataCardObj gameGridDataCardObj) {
            return R.layout.item_grid_layout_x;
        }

        public void o(com.max.hbcommon.base.adapter.s.e eVar, GameGridDataCardObj gameGridDataCardObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameGridDataCardObj}, this, changeQuickRedirect, false, 37998, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameGridDataCardObj.class}, Void.TYPE).isSupported) {
                return;
            }
            View viewI = eVar.i(R.id.v_item_grid_layout_divider);
            viewI.setBackgroundColor(com.max.xiaoheihe.utils.d.E(R.color.divider_color_alpha_20));
            if (eVar.getAdapterPosition() == 3) {
                viewI.setVisibility(8);
            }
            TextView textView = (TextView) eVar.i(R.id.tv_item_grid_layout_value);
            TextView textView2 = (TextView) eVar.i(R.id.tv_item_grid_layout_desc);
            TextView textView3 = (TextView) eVar.i(R.id.tv_score);
            ImageView imageView = (ImageView) eVar.i(R.id.iv_item_grid_layout_icon);
            textView.setText(gameGridDataCardObj.getValue());
            textView2.setText(gameGridDataCardObj.getDesc());
            if (com.max.hbcommon.utils.c.u(gameGridDataCardObj.getScore())) {
                textView3.setVisibility(8);
            } else {
                textView3.setVisibility(0);
                textView3.setText(gameGridDataCardObj.getScore());
            }
            if (com.max.hbcommon.utils.c.u(gameGridDataCardObj.getIcon())) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                com.max.hbimage.b.K(gameGridDataCardObj.getIcon(), imageView);
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 38000, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, (GameGridDataCardObj) obj);
        }
    }

    public class v extends com.max.hbcommon.base.adapter.s<AcContentMenuObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f87898b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f87899c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f87900d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ ImageView f87901e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ AcContentMenuObj f87902f;

            a(long j10, long j11, String str, ImageView imageView, AcContentMenuObj acContentMenuObj) {
                this.f87898b = j10;
                this.f87899c = j11;
                this.f87900d = str;
                this.f87901e = imageView;
                this.f87902f = acContentMenuObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38003, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                long j10 = this.f87898b;
                if (j10 > this.f87899c) {
                    com.max.hbcache.c.C(this.f87900d, String.valueOf(j10));
                    this.f87901e.setVisibility(4);
                }
                if ("1".equals(this.f87902f.getEnable()) && "h5".equals(this.f87902f.getType())) {
                    if (!this.f87902f.getContent_url().startsWith("http")) {
                        com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) OWGameDataFragment.this).mContext, this.f87902f.getContent_url());
                        return;
                    }
                    Intent intent = new Intent(OWGameDataFragment.this.getContext(), (Class<?>) WebActionActivity.class);
                    intent.putExtra("pageurl", this.f87902f.getContent_url());
                    intent.putExtra("title", this.f87902f.getDesc());
                    OWGameDataFragment.this.startActivity(intent);
                    return;
                }
                if ("1".equals(this.f87902f.getEnable()) && "leaderboards".equals(this.f87902f.getKey())) {
                    PlayerLeaderboardsActivity.N1(((com.max.hbcommon.base.d) OWGameDataFragment.this).mContext, lb.a.M0);
                    return;
                }
                if (!"1".equals(this.f87902f.getEnable()) || !"search".equals(this.f87902f.getKey())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f("敬请期待");
                } else if (i0.e(((com.max.hbcommon.base.d) OWGameDataFragment.this).mContext)) {
                    com.max.xiaoheihe.base.router.b.w0(((com.max.hbcommon.base.d) OWGameDataFragment.this).mContext, 13).A();
                }
            }
        }

        v(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, AcContentMenuObj acContentMenuObj) {
            if (PatchProxy.proxy(new Object[]{eVar, acContentMenuObj}, this, changeQuickRedirect, false, 38001, new Class[]{com.max.hbcommon.base.adapter.s.e.class, AcContentMenuObj.class}, Void.TYPE).isSupported) {
                return;
            }
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) eVar.itemView.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).height = ViewUtils.f(OWGameDataFragment.this.getContext(), 74.0f);
            int iL = ViewUtils.L(((com.max.hbcommon.base.d) OWGameDataFragment.this).mContext) - ViewUtils.f(((com.max.hbcommon.base.d) OWGameDataFragment.this).mContext, 8.0f);
            if (iL > ((ViewGroup.MarginLayoutParams) layoutParams).height * getItemCount()) {
                ((ViewGroup.MarginLayoutParams) layoutParams).width = iL / getItemCount();
            } else {
                float f10 = iL;
                ((ViewGroup.MarginLayoutParams) layoutParams).width = (int) (f10 / (((int) ((f10 / ((ViewGroup.MarginLayoutParams) layoutParams).height) - 0.5f)) + 0.5f));
            }
            ImageView imageView = (ImageView) eVar.i(R.id.iv_item_menu_icon);
            ImageView imageView2 = (ImageView) eVar.i(R.id.iv_tips);
            TextView textView = (TextView) eVar.i(R.id.tv_item_menu_content);
            com.max.hbimage.b.K(acContentMenuObj.getImage_url(), imageView);
            textView.setText(acContentMenuObj.getDesc());
            String str = "ow_tips_time" + acContentMenuObj.getKey();
            long jR = com.max.hbutils.utils.n.r(acContentMenuObj.getTips_time());
            long jR2 = com.max.hbutils.utils.n.r(com.max.hbcache.c.o(str, ""));
            if (jR > jR2) {
                imageView2.setVisibility(0);
            } else {
                imageView2.setVisibility(4);
            }
            eVar.itemView.setOnClickListener(new a(jR, jR2, str, imageView2, acContentMenuObj));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, AcContentMenuObj acContentMenuObj) {
            if (PatchProxy.proxy(new Object[]{eVar, acContentMenuObj}, this, changeQuickRedirect, false, 38002, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, acContentMenuObj);
        }
    }

    private void B5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37924, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f87851r = null;
        if (TextUtils.isEmpty(this.f87850q) && i0.o() != null && i0.o().getOw_account_info() != null) {
            this.f87850q = i0.o().getOw_account_info().getPlayer_id();
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str = this.f87850q;
        String str2 = this.f87852s;
        OWSeasonObj oWSeasonObj = this.G;
        addDisposable((io.reactivex.disposables.b) eVarA.Fa(str, str2, oWSeasonObj != null ? oWSeasonObj.getSeason() : null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a()));
    }

    private void C5(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 37935, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap();
        map.put("Cookie", str);
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.b(false).R3(map, "http://ow.blizzard.cn/action/career/profile?" + System.currentTimeMillis()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new n()));
    }

    private boolean D5(OWPlayerOverviewObj oWPlayerOverviewObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{oWPlayerOverviewObj}, this, changeQuickRedirect, false, 37928, new Class[]{OWPlayerOverviewObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        String strO = com.max.hbcache.c.o("ow_message_time", "");
        return !com.max.hbcommon.utils.c.u(oWPlayerOverviewObj.getMessage()) && (com.max.hbcommon.utils.c.u(strO) ? 0L : Long.parseLong(strO)) < (!com.max.hbcommon.utils.c.u(oWPlayerOverviewObj.getMessage_time()) ? (long) Float.parseFloat(oWPlayerOverviewObj.getMessage_time()) : 0L);
    }

    private void E5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37923, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int i10 = 4;
        this.rv_expanded_data.setLayoutManager(new GridLayoutManager(this.mContext, i10) { // from class: com.max.xiaoheihe.module.game.ow.OWGameDataFragment.5
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        this.rv_header_data.setLayoutManager(new GridLayoutManager(this.mContext, i10) { // from class: com.max.xiaoheihe.module.game.ow.OWGameDataFragment.6
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        this.H = new t(this.mContext, this.B);
        u uVar = new u(this.mContext, this.C);
        this.I = uVar;
        this.rv_header_data.setAdapter(uVar);
        this.rv_expanded_data.setAdapter(this.H);
        this.f87853t = new v(this.mContext, this.A, R.layout.item_menu);
    }

    private void F5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37917, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        WebSettings settings = this.mWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setMixedContentMode(0);
        this.mWebView.setWebViewClient(new r());
    }

    public static OWGameDataFragment G5(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 37912, new Class[]{String.class}, OWGameDataFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (OWGameDataFragment) patchProxyResultProxy.result;
        }
        OWGameDataFragment oWGameDataFragment = new OWGameDataFragment();
        Bundle bundle = new Bundle();
        bundle.putString("player_id", str);
        oWGameDataFragment.setArguments(bundle);
        return oWGameDataFragment;
    }

    public static OWGameDataFragment H5(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 37913, new Class[]{String.class, String.class}, OWGameDataFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (OWGameDataFragment) patchProxyResultProxy.result;
        }
        OWGameDataFragment oWGameDataFragment = new OWGameDataFragment();
        Bundle bundle = new Bundle();
        bundle.putString("player_id", str);
        bundle.putString("userid", str2);
        oWGameDataFragment.setArguments(bundle);
        return oWGameDataFragment;
    }

    private void J5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37932, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b(P, "setGameQueues");
        if (this.f87859z.getPlayer_info().getRanked() != null) {
            this.iv_rank_img.setVisibility(0);
            com.max.hbimage.b.K(this.f87859z.getPlayer_info().getRanked().getRank_img(), this.iv_rank_img);
            this.tv_r6_data_desc1.setText(this.f87859z.getPlayer_info().getRanked().getLevel());
            this.tv_r6_data_desc2.setText(this.f87859z.getPlayer_info().getRanked().getLevel_rank());
        } else {
            this.tv_r6_data_desc1.setText(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            this.tv_r6_data_desc2.setText(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            this.iv_rank_img.setVisibility(8);
        }
        if (this.f87859z.getSummary() != null) {
            this.B.clear();
            this.B.addAll(this.f87859z.getSummary().subList(4, this.f87859z.getSummary().size()));
            this.C.clear();
            this.C.addAll(this.f87859z.getSummary().subList(0, 4));
        }
        this.I.notifyDataSetChanged();
        this.H.notifyDataSetChanged();
        this.f87855v = false;
        bb.d.d(this.tv_data_expand, 0);
        this.tv_data_expand.setOnClickListener(new k());
        Q5();
        this.mPlayerInfoCardView.setVisibility(0);
        this.mVSpace.setVisibility(8);
    }

    private void K5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37926, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        OWPlayerOverviewObj oWPlayerOverviewObj = this.f87859z;
        if (oWPlayerOverviewObj == null || com.max.hbcommon.utils.c.w(oWPlayerOverviewObj.getMedal())) {
            this.vg_medal.setVisibility(8);
            return;
        }
        this.vg_medal.setVisibility(0);
        for (int i10 = 0; i10 < this.f87859z.getMedal().size(); i10++) {
            if (i10 == 0) {
                this.tv_medal_gold.setText(this.f87859z.getMedal().get(i10).getValue());
            } else if (i10 == 1) {
                this.tv_medal_silver.setText(this.f87859z.getMedal().get(i10).getValue());
            } else if (i10 == 2) {
                this.tv_medal_bronze.setText(this.f87859z.getMedal().get(i10).getValue());
            }
        }
    }

    static /* synthetic */ void L4(OWGameDataFragment oWGameDataFragment) {
        if (PatchProxy.proxy(new Object[]{oWGameDataFragment}, null, changeQuickRedirect, true, 37940, new Class[]{OWGameDataFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        oWGameDataFragment.B5();
    }

    private void L5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37925, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        OWSeasonObj oWSeasonObj = this.G;
        if (oWSeasonObj == null) {
            this.vg_season.setVisibility(8);
            return;
        }
        this.tv_season.setText(oWSeasonObj.getDesc());
        bb.d.d(this.tv_season_arrow, 0);
        this.tv_season_arrow.setText(lb.b.f131094j);
        this.vg_season.setVisibility(0);
        if (this.vg_season.hasOnClickListeners()) {
            return;
        }
        this.vg_season.setOnClickListener(new b());
    }

    private void M5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37929, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.view.l.D(this.mContext, "", com.max.xiaoheihe.utils.d.n0(R.string.bind_pubg_fail_message), com.max.xiaoheihe.utils.d.n0(R.string.confirm), null, new h());
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0290  */
    /* JADX WARN: Multi-variable type inference failed */
    private void N5() {
        boolean z10;
        int i10 = 0;
        Object[] objArr = 0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37927, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (this.f87859z == null) {
            return;
        }
        L5();
        if (this.f87859z.getPlayer_info() != null) {
            J5();
        }
        com.max.xiaoheihe.module.game.pubg.utils.b.q(this.mRadarChartWarpper, null);
        K5();
        ViewGroup.LayoutParams layoutParams = this.mIvHeadImage.getLayoutParams();
        layoutParams.height = ViewUtils.V(this.mVgPlayerInfoWrapper) + ViewUtils.V(this.tv_data_expand) + ViewUtils.V(this.rv_header_data);
        this.mIvHeadImage.setLayoutParams(layoutParams);
        if (this.f87859z.getPlayer_info() != null) {
            this.mPlayerInfoCardView.setVisibility(0);
            this.mIvHeadImage.setVisibility(0);
            com.max.hbimage.b.e0(this.f87859z.getPlayer_info().getPortraitAvatar(), this.mIvAvatar, ViewUtils.f(getContext(), 2.0f), R.drawable.common_default_game_avatar_74x74);
            this.mTvNickname.setText(this.f87859z.getPlayer_info().getNickname());
            if (com.max.hbcommon.utils.c.u(this.f87859z.getPlayer_info().getLevel())) {
                this.tv_level.setText("");
            } else {
                bb.d.d(this.tv_level, 1);
                this.tv_level.setText(this.f87859z.getPlayer_info().getLevel());
                com.max.hbimage.b.K(this.f87859z.getPlayer_info().getPortraitFrame(), this.iv_level_frame);
                com.max.hbimage.b.K(this.f87859z.getPlayer_info().getPortraitFrameIcon(), this.iv_level_frame_icon);
            }
            this.rootView.findViewById(R.id.vg_bind_card_container).setVisibility(8);
        } else {
            this.mPlayerInfoCardView.setVisibility(8);
            this.mIvHeadImage.setVisibility(8);
            if (this.f87854u) {
                this.rootView.findViewById(R.id.vg_bind_card_container).setVisibility(0);
                GameBindingFragment gameBindingFragment = (GameBindingFragment) getChildFragmentManager().r0(R.id.vg_bind_card_container);
                this.J = gameBindingFragment;
                if (gameBindingFragment == null) {
                    this.J = GameBindingFragment.m4(lb.a.M0);
                    getChildFragmentManager().u().b(R.id.vg_bind_card_container, this.J).n();
                }
            }
        }
        GameBindingFragment gameBindingFragment2 = this.J;
        if (gameBindingFragment2 != null && gameBindingFragment2.isActive()) {
            this.J.r4();
        }
        if ("true".equals(this.f87859z.getIs_me())) {
            if ("auto_update".equals(this.f87859z.getUpdate())) {
                P5();
            } else if ("manual_update".equals(this.f87859z.getUpdate())) {
                this.mIvUpdateIcon.setVisibility(8);
                if (this.D.isRunning()) {
                    this.D.end();
                }
                this.mTvUpdateBtnDesc.setText(com.max.xiaoheihe.utils.d.n0(R.string.click_update));
                this.mVgUpdate.setClickable(true);
            } else if (z0.b.f136024i.equals(this.f87859z.getUpdate())) {
                this.mVgUpdate.setVisibility(8);
            } else {
                this.mVgUpdate.setVisibility(8);
            }
            this.mTvUpdateDesc.setText(this.f87859z.getUpdate_desc());
        } else {
            this.mVgUpdate.setVisibility(8);
            this.mTvUpdateDesc.setVisibility(8);
        }
        this.vg_content_list.removeAllViews();
        if (!com.max.hbcommon.utils.c.w(this.f87859z.getMenu())) {
            View viewInflate = LayoutInflater.from(this.mContext).inflate(R.layout.layout_list_content_cardview, this.vg_content_list, false);
            RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv);
            recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext, i10, objArr == true ? 1 : 0) { // from class: com.max.xiaoheihe.module.game.ow.OWGameDataFragment.12
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public boolean canScrollVertically() {
                    return false;
                }
            });
            recyclerView.setAdapter(this.f87853t);
            this.A.clear();
            this.A.addAll(this.f87859z.getMenu());
            this.f87853t.notifyDataSetChanged();
            this.vg_content_list.addView(viewInflate);
        }
        if (!com.max.hbcommon.utils.c.w(this.f87859z.getHeros())) {
            View viewInflate2 = LayoutInflater.from(this.mContext).inflate(R.layout.view_ow_heroes_card, this.vg_content_list, false);
            com.max.xiaoheihe.module.game.pubg.utils.b.n(viewInflate2, this.f87859z.getHeros(), com.max.xiaoheihe.utils.d.n0(R.string.my_hero), new c(), this.f87850q, this.G.getSeason(), "1".equals(this.f87859z.getShow_hero_dtl()));
            this.vg_content_list.addView(viewInflate2);
        }
        if (this.f87859z.getActivity() != null) {
            ActivityObj activity = this.f87859z.getActivity();
            if (activity != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("activity_shown");
                sb2.append(activity.getActivity_id());
                z10 = "1".equals(com.max.hbcache.c.o(sb2.toString(), "1"));
            }
            if (z10) {
                ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.mContext).inflate(R.layout.item_game_data_activity_card, this.vg_content_list, false);
                ((TextView) viewGroup.findViewById(R.id.tv_dont_display)).setOnClickListener(new d(viewGroup, activity));
                com.max.xiaoheihe.module.game.pubg.utils.b.e(viewGroup, activity, new e(activity));
                this.vg_content_list.addView(viewGroup);
            }
        }
        if (this.f87859z.getAchievements() != null) {
            View viewInflate3 = LayoutInflater.from(this.mContext).inflate(R.layout.view_ow_achievements_card, this.vg_content_list, false);
            com.max.xiaoheihe.module.game.pubg.utils.b.m(viewInflate3, this.f87859z.getAchievements(), com.max.xiaoheihe.utils.d.n0(R.string.my_achievements), new f(), this.f87850q);
            this.vg_content_list.addView(viewInflate3);
        }
        if (!D5(this.f87859z)) {
            this.mVgMessage.setVisibility(8);
            return;
        }
        this.mVgMessage.setVisibility(0);
        ((TextView) this.mVgMessage.findViewById(R.id.tv_content)).setText(this.f87859z.getMessage());
        ((ImageView) this.mVgMessage.findViewById(R.id.iv_cancel)).setOnClickListener(new g(this.f87859z.getMessage_time()));
    }

    private void O5(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 37930, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().da(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i()));
    }

    private void P5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37934, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("owlogin", " updateGameData");
        this.mIvUpdateIcon.setVisibility(0);
        if (!this.D.isRunning()) {
            this.D.start();
        }
        this.mTvUpdateBtnDesc.setText(com.max.xiaoheihe.utils.d.n0(R.string.updating));
        this.mVgUpdate.setClickable(false);
        this.mWebView.loadUrl(com.max.xiaoheihe.module.game.ow.a.f87960a);
    }

    private void Q5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37933, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int iV = ViewUtils.V(this.ll_expanded_data);
        this.f87856w = iV;
        if (this.f87855v) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, iV);
            valueAnimatorOfInt.addUpdateListener(new l());
            valueAnimatorOfInt.setDuration(500L);
            valueAnimatorOfInt.start();
            addValueAnimator(valueAnimatorOfInt);
            this.tv_data_expand.setText(com.max.xiaoheihe.utils.d.n0(R.string.fold) + " " + lb.b.f131095k);
            return;
        }
        if (this.tv_data_expand.getText().toString().contains(com.max.xiaoheihe.utils.d.n0(R.string.fold))) {
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(this.f87856w, 0);
            valueAnimatorOfInt2.addUpdateListener(new m());
            valueAnimatorOfInt2.setDuration(500L);
            valueAnimatorOfInt2.start();
            addValueAnimator(valueAnimatorOfInt2);
        } else {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.ll_expanded_data.getLayoutParams();
            layoutParams.height = 0;
            this.ll_expanded_data.setLayoutParams(layoutParams);
        }
        this.tv_data_expand.setText(com.max.xiaoheihe.utils.d.n0(R.string.view_more_data) + " " + lb.b.f131094j);
    }

    private void R5(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 37936, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("owlogin", "profile=" + str);
        if (com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(com.google.android.gms.common.m.f52595a, str);
        PostEncryptParamsObj postEncryptParamsObjU0 = com.max.xiaoheihe.utils.d.u0(com.max.hbutils.utils.k.p(jsonObject));
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().x1(postEncryptParamsObjU0.getData(), postEncryptParamsObjU0.getKey(), postEncryptParamsObjU0.getSid(), postEncryptParamsObjU0.getTime()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new o()));
    }

    static /* synthetic */ void W4(OWGameDataFragment oWGameDataFragment) {
        if (PatchProxy.proxy(new Object[]{oWGameDataFragment}, null, changeQuickRedirect, true, 37943, new Class[]{OWGameDataFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        oWGameDataFragment.showError();
    }

    static /* synthetic */ void X4(OWGameDataFragment oWGameDataFragment) {
        if (PatchProxy.proxy(new Object[]{oWGameDataFragment}, null, changeQuickRedirect, true, 37944, new Class[]{OWGameDataFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        oWGameDataFragment.showError();
    }

    static /* synthetic */ void Y4(OWGameDataFragment oWGameDataFragment) {
        if (PatchProxy.proxy(new Object[]{oWGameDataFragment}, null, changeQuickRedirect, true, 37941, new Class[]{OWGameDataFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        oWGameDataFragment.P5();
    }

    static /* synthetic */ void e5(OWGameDataFragment oWGameDataFragment) {
        if (PatchProxy.proxy(new Object[]{oWGameDataFragment}, null, changeQuickRedirect, true, 37945, new Class[]{OWGameDataFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        oWGameDataFragment.N5();
    }

    static /* synthetic */ void t5(OWGameDataFragment oWGameDataFragment) {
        if (PatchProxy.proxy(new Object[]{oWGameDataFragment}, null, changeQuickRedirect, true, 37946, new Class[]{OWGameDataFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        oWGameDataFragment.Q5();
    }

    static /* synthetic */ void u5(OWGameDataFragment oWGameDataFragment, String str) {
        if (PatchProxy.proxy(new Object[]{oWGameDataFragment, str}, null, changeQuickRedirect, true, 37947, new Class[]{OWGameDataFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        oWGameDataFragment.R5(str);
    }

    static /* synthetic */ void x5(OWGameDataFragment oWGameDataFragment, String str) {
        if (PatchProxy.proxy(new Object[]{oWGameDataFragment, str}, null, changeQuickRedirect, true, 37942, new Class[]{OWGameDataFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        oWGameDataFragment.C5(str);
    }

    @Override // com.max.xiaoheihe.module.account.GameBindingFragment.n
    public void B1(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 37919, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
        com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.logging_data_succuess));
        this.f87854u = true;
        User userI = i0.i();
        OWAccountInfo oWAccountInfo = new OWAccountInfo();
        oWAccountInfo.setNickname(this.f87851r);
        userI.setOw_account_info(oWAccountInfo);
        com.max.xiaoheihe.utils.d.x1(this.mContext);
    }

    @Override // com.max.xiaoheihe.module.account.GameBindingFragment.n
    public void C0(String str, Throwable th2) {
        if (PatchProxy.proxy(new Object[]{str, th2}, this, changeQuickRedirect, false, 37918, new Class[]{String.class, Throwable.class}, Void.TYPE).isSupported) {
            return;
        }
        th2.printStackTrace();
        if (GameBindingFragment.f77868u.equals(th2.getMessage()) || GameBindingFragment.f77867t.equals(th2.getMessage())) {
            com.max.xiaoheihe.view.l.D(this.mContext, "", com.max.xiaoheihe.utils.d.n0(R.string.bind_pubg_fail_message), com.max.xiaoheihe.utils.d.n0(R.string.confirm), null, new s());
        } else {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.logging_data_fail));
        }
    }

    public void I5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37937, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (Bitmap bitmap : this.L) {
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        this.L.clear();
        System.gc();
    }

    @Override // com.max.xiaoheihe.module.game.d
    @n0
    public com.max.xiaoheihe.module.game.d J4(@p0 String str, @p0 String str2, @p0 String str3, @p0 String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 37939, new Class[]{String.class, String.class, String.class, String.class}, com.max.xiaoheihe.module.game.d.class);
        return patchProxyResultProxy.isSupported ? (com.max.xiaoheihe.module.game.d) patchProxyResultProxy.result : H5(str, str2);
    }

    @Override // com.max.xiaoheihe.module.game.z.a
    public void T2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37938, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int iL = ViewUtils.L(this.mContext);
        int measuredHeight = this.vg_data_container.getMeasuredHeight();
        if (measuredHeight < 0) {
            measuredHeight = this.vg_data_container.getMeasuredHeight();
        }
        Bitmap bitmapL = com.max.hbimage.b.l(this.vg_data_container, iL, measuredHeight);
        if (bitmapL == null) {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(getString(R.string.fail));
            return;
        }
        this.L.add(bitmapL);
        RelativeLayout relativeLayout = (RelativeLayout) this.mInflater.inflate(R.layout.layout_share_dac, (ViewGroup) getContentView(), false);
        ImageView imageView = (ImageView) relativeLayout.findViewById(R.id.iv_share_image);
        QRCodeShareView qRCodeShareView = (QRCodeShareView) relativeLayout.findViewById(R.id.v_qr_code);
        imageView.setImageBitmap(bitmapL);
        qRCodeShareView.setTitle(String.format(com.max.xiaoheihe.utils.d.n0(R.string.share_tips), com.max.xiaoheihe.utils.d.n0(R.string.game_name_ow)));
        relativeLayout.measure(0, 0);
        Bitmap bitmapL2 = com.max.hbimage.b.l(relativeLayout, relativeLayout.getMeasuredWidth(), relativeLayout.getMeasuredHeight());
        this.L.add(bitmapL2);
        if (bitmapL2 != null) {
            com.max.hbshare.d.E(this.mContext, new HBShareData(true, false, null, null, null, null, new UMImage(this.mContext, bitmapL2), this.M));
        } else {
            com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(getString(R.string.fail));
        }
    }

    @Override // com.max.xiaoheihe.module.game.d, com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void a4(View view, boolean z10) {
        boolean z11 = false;
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 37914, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.a4(view, z10);
        setContentView(R.layout.fragment_ow_game_data);
        this.mUnBinder = ButterKnife.f(this, view);
        if (getArguments() != null) {
            this.f87850q = getArguments().getString("player_id");
            this.f87852s = getArguments().getString("userid");
        }
        if ((com.max.hbcommon.utils.c.u(this.f87850q) && com.max.hbcommon.utils.c.u(this.f87852s)) || ((!com.max.hbcommon.utils.c.u(this.f87850q) && com.max.xiaoheihe.module.account.utils.c.d(this.f87850q) == 1) || (!com.max.hbcommon.utils.c.u(this.f87852s) && i0.q(this.f87852s)))) {
            z11 = true;
        }
        this.f87854u = z11;
        this.mSmartRefreshLayout.S(new j());
        this.E = ViewUtils.f(this.mContext, 10.0f);
        this.mVgUpdate.setOnClickListener(new q());
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.mIvUpdateIcon, androidx.constraintlayout.motion.widget.f.f18721i, 0.0f, 360.0f);
        this.D = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setRepeatMode(1);
        this.D.setDuration(1000L);
        this.D.setInterpolator(new LinearInterpolator());
        this.D.setRepeatCount(-1);
        addValueAnimator(this.D);
        E5();
        F5();
        if (this.mIsFirst) {
            showLoading();
        }
    }

    @Override // com.max.xiaoheihe.module.account.GameBindingFragment.n
    public boolean g2(String str, View view, EditText editText) {
        return false;
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37916, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        B5();
    }

    @Override // com.max.xiaoheihe.module.account.GameBindingFragment.n
    public /* synthetic */ void m1(String str) {
        com.max.xiaoheihe.module.account.e.b(this, str);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37922, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        WebView webView = this.mWebView;
        if (webView != null) {
            webView.stopLoading();
            this.mWebView.setWebChromeClient(null);
            this.mWebView.setWebViewClient(null);
            this.mWebView.destroy();
            this.mWebView = null;
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37920, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        WebView webView = this.mWebView;
        if (webView != null) {
            webView.stopLoading();
            this.mWebView.setWebChromeClient(null);
            this.mWebView.setWebViewClient(null);
            this.mWebView.destroy();
            this.mWebView = null;
        }
        super.onDestroyView();
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37931, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        B5();
    }

    @Override // com.max.hbcommon.base.d
    public void onRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37915, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRegisterReceiver();
        UserProfileUpdatedBroadcastReceiver userProfileUpdatedBroadcastReceiver = new UserProfileUpdatedBroadcastReceiver(this, null);
        this.K = userProfileUpdatedBroadcastReceiver;
        registerReceiver(userProfileUpdatedBroadcastReceiver, lb.a.f131055v);
    }

    @Override // com.max.hbcommon.base.d
    public void onUnRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37921, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onUnRegisterReceiver();
        unregisterReceiver(this.K);
    }

    @Override // com.max.xiaoheihe.module.account.GameBindingFragment.n
    public /* synthetic */ void u1(String str) {
        com.max.xiaoheihe.module.account.e.c(this, str);
    }

    @Override // com.max.xiaoheihe.module.account.GameBindingFragment.n
    public /* synthetic */ void w2(String str, Throwable th2) {
        com.max.xiaoheihe.module.account.e.a(this, str, th2);
    }
}
