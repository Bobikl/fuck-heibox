package com.max.xiaoheihe.module.account;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.flyco.tablayout.SlidingTabLayout;
import com.flyco.tablayout.widget.MsgView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.adapter.OneTimeValidExposureViewWatcher;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.account.AvatarDecorationObj;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.hbcommon.component.HomeTitleBar;
import com.max.hbcommon.component.TitleBar;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcommon.component.bottombutton.base.BaseBottomButton;
import com.max.hbcustomview.EZTabLayout;
import com.max.hbmmkv.MMKVManager;
import com.max.hbshare.bean.HBShareData;
import com.max.hbshare.bean.PostOptionObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.AccountDetailObj;
import com.max.xiaoheihe.bean.account.BBSInfoObj;
import com.max.xiaoheihe.bean.account.HomeDataObj;
import com.max.xiaoheihe.bean.account.ProfileBannerObj;
import com.max.xiaoheihe.bean.account.UnloginStatsObj;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.bean.account.UserProfileResultObj;
import com.max.xiaoheihe.bean.account.UserShareInfoObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.ForbidReasonResult;
import com.max.xiaoheihe.bean.bbs.RecUsersResult;
import com.max.xiaoheihe.bean.game.GameListObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.account.specificsearch.UserCenteredSearchActivity;
import com.max.xiaoheihe.module.bbs.ReportReasonFragment;
import com.max.xiaoheihe.module.bbs.UserBBSInfoFragment;
import com.max.xiaoheihe.module.chat.MsgConversationActivity;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.utils.imageviewer.ImageViewerHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.mmkv.MMKV;
import com.umeng.socialize.media.UMImage;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class MehomefragmentV2 extends com.max.hbcommon.base.d implements GameBindingFragment.n {
    public static final String C = "update_sub_fragment_target";
    private static final String D = "heyboxId";
    private static final String E = "steamId";
    private static final String F = "pages";
    private static final String G = "my_data";
    private static final String H = "my_bbs";
    private static final String I = "my_device";
    private static final boolean J = false;
    public static ProfileBannerObj K = null;
    static final int L = 291;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    EZTabLayout f78102b;

    @BindView(R.id.bottom_button)
    BottomButtonLeftItemView bottom_button;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    SlidingTabLayout f78103c;

    @BindView(R.id.ctl)
    CollapsingToolbarLayout ctl;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ViewGroup f78104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Unbinder f78105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String[] f78106f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f78109i;

    @BindView(R.id.iv_default_medal)
    ImageView iv_default_medal;

    @BindView(R.id.iv_no_friends)
    ImageView iv_no_friends;

    @BindView(R.id.iv_not_friend_red_point)
    ImageView iv_not_friend_red_point;

    @BindView(R.id.iv_red_dot_history)
    ImageView iv_red_dot_history;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private androidx.fragment.app.n0 f78112l;

    @BindView(R.id.ll_award)
    ViewGroup ll_award;

    @BindView(R.id.ll_fans)
    ViewGroup ll_fans;

    @BindView(R.id.ll_follow)
    ViewGroup ll_follow;

    @BindView(R.id.ll_friends)
    ViewGroup ll_friends;

    @BindView(R.id.ll_history)
    ViewGroup ll_history;

    @BindView(R.id.abl)
    AppBarLayout mAppBarLayout;

    @BindView(R.id.vg_home_menu)
    View mHomeMenuView;

    @BindView(R.id.iv_me_home_fragment_avatar)
    HeyBoxAvatarView mIvAvatar;

    @BindView(R.id.toolbar)
    TitleBar mToolbar;

    @BindView(R.id.tv_me_home_fragment_username)
    TextView mTvUsername;

    @BindView(R.id.rl_me_home_fragment_level)
    RelativeLayout mUserLevelContainer;

    @BindView(R.id.vg_me_home_fragment_login)
    RelativeLayout mVgLogin;

    @BindView(R.id.msg_friend_online_num)
    MsgView msg_friend_online_num;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f78115o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private NewMsgBroadcastReceiver f78116p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private UserProfileUpdatedBroadcastReceiver f78117q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AchieveBadgeUpdatedBroadcastReceiver f78118r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private AccountDetailObj f78120t;

    @BindView(R.id.tb_home)
    HomeTitleBar tb_home;

    @BindView(R.id.tv_award_num)
    TextView tv_award_num;

    @BindView(R.id.tv_fan_desc)
    TextView tv_fan_desc;

    @BindView(R.id.tv_fan_num)
    TextView tv_fan_num;

    @BindView(R.id.tv_favour_desc)
    TextView tv_favour_desc;

    @BindView(R.id.tv_follow_desc)
    TextView tv_follow_desc;

    @BindView(R.id.tv_follow_num)
    TextView tv_follow_num;

    @BindView(R.id.tv_forbid_info)
    TextView tv_forbid_info;

    @BindView(R.id.tv_friend_desc)
    TextView tv_friend_desc;

    @BindView(R.id.tv_friend_num)
    TextView tv_friend_num;

    @BindView(R.id.tv_game_state)
    TextView tv_game_state;

    @BindView(R.id.tv_history_desc)
    TextView tv_history_desc;

    @BindView(R.id.tv_history_num)
    TextView tv_history_num;

    @BindView(R.id.tv_person_award)
    TextView tv_person_award;

    @BindView(R.id.tv_signature)
    TextView tv_signature;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private UnloginStatsObj f78121u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f78122v;

    @BindView(R.id.v_login_mask)
    View v_login_mask;

    @BindView(R.id.vg_bbs_info)
    ViewGroup vg_bbs_info;

    @BindView(R.id.vg_horn)
    RelativeLayout vg_horn;

    @BindView(R.id.vg_menu_mall)
    View vg_menu_mall;

    @BindView(R.id.vg_menu_task)
    View vg_menu_task;

    @BindView(R.id.vg_person_award)
    View vg_person_award;

    @BindView(R.id.vg_platform_card)
    ViewGroup vg_platform_card;

    @BindView(R.id.vg_room_Info)
    ViewGroup vg_room_Info;

    @BindView(R.id.vp)
    ViewPager vp;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f78123w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private com.max.hbcommon.view.a f78125y;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f78107g = "-1";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f78108h = "-1";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<Fragment> f78110j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<KeyDescObj> f78111k = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f78113m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f78114n = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f78119s = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f78124x = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Bundle f78126z = null;
    private boolean A = false;
    private UserShareInfoObj B = null;

    public class AchieveBadgeUpdatedBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private AchieveBadgeUpdatedBroadcastReceiver() {
        }

        /* synthetic */ AchieveBadgeUpdatedBroadcastReceiver(MehomefragmentV2 mehomefragmentV2, k kVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 23682, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported && lb.a.f131079z.equals(intent.getAction())) {
                MehomefragmentV2.this.d6();
            }
        }
    }

    public class NewMsgBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private NewMsgBroadcastReceiver() {
        }

        /* synthetic */ NewMsgBroadcastReceiver(MehomefragmentV2 mehomefragmentV2, k kVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 23683, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported && lb.a.f131025q.equals(intent.getAction())) {
                MehomefragmentV2.e5(MehomefragmentV2.this);
            }
        }
    }

    public class UserProfileUpdatedBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private UserProfileUpdatedBroadcastReceiver() {
        }

        /* synthetic */ UserProfileUpdatedBroadcastReceiver(MehomefragmentV2 mehomefragmentV2, k kVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 23690, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
                return;
            }
            String action = intent.getAction();
            if (!lb.a.f131055v.equals(action) && !lb.a.f130960f0.equals(action)) {
                if (lb.a.f131061w.equals(action)) {
                    MehomefragmentV2.this.iv_not_friend_red_point.setVisibility(8);
                    return;
                }
                return;
            }
            MehomefragmentV2.b5(MehomefragmentV2.this);
            String stringExtra = intent.getStringExtra(lb.a.f131002m0);
            com.max.heybox.hblog.g.x("MehomefragmentV2, UserProfileUpdatedBroadcastReceiver, action = " + action + ", stringExtra = " + stringExtra);
            if (lb.a.f131062w0.equals(stringExtra)) {
                MehomefragmentV2.c5(MehomefragmentV2.this);
            }
        }
    }

    public class a implements ViewPager.i {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23606, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.z0(UserCenteredSearchActivity.X1(((com.max.hbcommon.base.d) MehomefragmentV2.this).mContext, MehomefragmentV2.this.f78107g, MehomefragmentV2.this.mTvUsername.getText()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23605, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.z0(UserCenteredSearchActivity.X1(((com.max.hbcommon.base.d) MehomefragmentV2.this).mContext, MehomefragmentV2.this.f78107g, MehomefragmentV2.this.mTvUsername.getText()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23604, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.i0(((com.max.hbcommon.base.d) MehomefragmentV2.this).mContext, lb.d.f131244r4);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrollStateChanged(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrolled(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 23603, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || ad.a.a(ad.a.D, false) || MehomefragmentV2.this.f78112l == null) {
                return;
            }
            if (!(MehomefragmentV2.this.f78112l.getItem(i10) instanceof UserBBSInfoFragment)) {
                if (MehomefragmentV2.this.f78112l.getItem(i10) instanceof MeHomeFragmentx) {
                    if (!(MehomefragmentV2.this.getActivity() instanceof MainActivity)) {
                        MehomefragmentV2.this.mToolbar.setActionXIcon((Drawable) null);
                        return;
                    } else {
                        MehomefragmentV2.this.tb_home.getIv_home_scan().setImageResource(R.drawable.common_scan);
                        MehomefragmentV2.this.tb_home.getIv_home_scan().setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.account.f0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.f78927b.g(view);
                            }
                        });
                        return;
                    }
                }
                return;
            }
            MMKVManager.f71329a.n(ad.c.f1239s, ad.c.f1241u, System.currentTimeMillis() / 1000, false);
            MehomefragmentV2.Z3(MehomefragmentV2.this, false);
            if (MehomefragmentV2.this.getActivity() instanceof MainActivity) {
                MehomefragmentV2.this.tb_home.getIv_home_scan().setImageResource(R.drawable.common_search);
                MehomefragmentV2.this.tb_home.getIv_home_scan().setColorFilter(((com.max.hbcommon.base.d) MehomefragmentV2.this).mContext.getColor(R.color.brand_color));
                MehomefragmentV2.this.tb_home.getIv_home_scan().setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.account.d0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f78917b.e(view);
                    }
                });
            } else {
                MehomefragmentV2.this.mToolbar.setActionXIcon(R.drawable.common_search);
                ImageView appbarActionButtonXView = MehomefragmentV2.this.mToolbar.getAppbarActionButtonXView();
                if (appbarActionButtonXView != null) {
                    appbarActionButtonXView.setColorFilter(((com.max.hbcommon.base.d) MehomefragmentV2.this).mContext.getColor(R.color.brand_color));
                }
                MehomefragmentV2.this.mToolbar.setActionXIconOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.account.e0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f78925b.f(view);
                    }
                });
            }
        }
    }

    public class a0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23649, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.i0(((com.max.hbcommon.base.d) MehomefragmentV2.this).mContext, lb.d.F1);
        }
    }

    public class b implements com.max.xiaoheihe.view.m {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.xiaoheihe.view.m
        public void a(Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 23608, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            MehomefragmentV2 mehomefragmentV2 = MehomefragmentV2.this;
            MehomefragmentV2.f4(mehomefragmentV2, mehomefragmentV2.f78107g);
            dialog.dismiss();
        }

        @Override // com.max.xiaoheihe.view.m
        public void b(Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 23607, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            dialog.dismiss();
        }
    }

    public class b0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AccountDetailObj f78135b;

        b0(AccountDetailObj accountDetailObj) {
            this.f78135b = accountDetailObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23650, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.D1(((com.max.hbcommon.base.d) MehomefragmentV2.this).mContext, view, this.f78135b, false);
        }
    }

    public class c implements com.max.xiaoheihe.view.m {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.xiaoheihe.view.m
        public void a(Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 23610, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            MehomefragmentV2 mehomefragmentV2 = MehomefragmentV2.this;
            MehomefragmentV2.g4(mehomefragmentV2, mehomefragmentV2.f78107g);
            dialog.dismiss();
        }

        @Override // com.max.xiaoheihe.view.m
        public void b(Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 23609, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            dialog.dismiss();
        }
    }

    public class c0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23651, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.i0(((com.max.hbcommon.base.d) MehomefragmentV2.this).mContext, lb.d.f131174h4);
        }
    }

    public class d implements ReportReasonFragment.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.xiaoheihe.module.bbs.ReportReasonFragment.b
        public void a(@androidx.annotation.n0 String str, @androidx.annotation.p0 String str2) {
            if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 23611, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            MehomefragmentV2 mehomefragmentV2 = MehomefragmentV2.this;
            MehomefragmentV2.h4(mehomefragmentV2, mehomefragmentV2.f78107g, str, str2);
        }
    }

    public class d0 extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d0() {
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23652, new Class[]{Result.class}, Void.TYPE).isSupported && MehomefragmentV2.this.isActive()) {
                if (MehomefragmentV2.this.f78120t != null && MehomefragmentV2.this.f78120t.getBbs_info() != null) {
                    MehomefragmentV2.this.f78120t.getBbs_info().setBlocking("0");
                }
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(MehomefragmentV2.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23653, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class e implements com.max.xiaoheihe.view.m {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.xiaoheihe.view.m
        public void a(Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 23613, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            dialog.dismiss();
            MehomefragmentV2.i4(MehomefragmentV2.this);
        }

        @Override // com.max.xiaoheihe.view.m
        public void b(Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 23612, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            dialog.dismiss();
        }
    }

    public class e0 extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e0() {
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23654, new Class[]{Result.class}, Void.TYPE).isSupported && MehomefragmentV2.this.isActive()) {
                if (MehomefragmentV2.this.f78120t != null && MehomefragmentV2.this.f78120t.getBbs_info() != null) {
                    MehomefragmentV2.this.f78120t.getBbs_info().setBlocking("1");
                }
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(MehomefragmentV2.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23655, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class f extends com.max.hbcommon.network.d<Result<UserProfileResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23614, new Class[]{Throwable.class}, Void.TYPE).isSupported && MehomefragmentV2.this.isActive()) {
                super.onError(th2);
                if (MehomefragmentV2.this.f78120t == null) {
                    MehomefragmentV2 mehomefragmentV2 = MehomefragmentV2.this;
                    MehomefragmentV2.n4(mehomefragmentV2, (int) (com.max.hbutils.utils.t.p(((com.max.hbcommon.base.d) mehomefragmentV2).mContext) + ((com.max.hbcommon.base.d) MehomefragmentV2.this).mContext.getResources().getDimension(R.dimen.title_bar_height)));
                }
            }
        }

        public void onNext(Result<UserProfileResultObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23615, new Class[]{Result.class}, Void.TYPE).isSupported && MehomefragmentV2.this.isActive()) {
                if (MehomefragmentV2.this.f78113m) {
                    MehomefragmentV2.K = result.getResult().getProfile_banner();
                }
                MehomefragmentV2.this.R5(result.getResult().getAccount_detail());
                MehomefragmentV2.this.B = result.getResult().getShare_info();
                MehomefragmentV2.p4(MehomefragmentV2.this);
                if (com.max.hbutils.utils.n.r(result.getResult().getEvents_alert_at()) > MMKVManager.f71329a.g(ad.c.f1239s, ad.c.f1241u, 0L, false)) {
                    MehomefragmentV2.Z3(MehomefragmentV2.this, true);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23616, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<UserProfileResultObj>) obj);
        }
    }

    public class f0 extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f0() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23657, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.x.p(MehomefragmentV2.this.getString(R.string.focus_success));
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23656, new Class[]{Result.class}, Void.TYPE).isSupported && MehomefragmentV2.this.isActive()) {
                if (((com.max.hbcommon.base.d) MehomefragmentV2.this).mContext instanceof MeHomeActivity) {
                    Intent intent = new Intent();
                    intent.putExtra("follow", "1");
                    ((MeHomeActivity) ((com.max.hbcommon.base.d) MehomefragmentV2.this).mContext).setResult(-1, intent);
                }
                if ("2".equals(MehomefragmentV2.this.f78115o)) {
                    MehomefragmentV2.U4(MehomefragmentV2.this, "3");
                } else {
                    MehomefragmentV2.U4(MehomefragmentV2.this, "1");
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23658, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class g extends com.max.hbcommon.network.d<Result<UnloginStatsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23617, new Class[]{Throwable.class}, Void.TYPE).isSupported && MehomefragmentV2.this.isActive()) {
                super.onError(th2);
                if (MehomefragmentV2.this.f78121u == null) {
                    MehomefragmentV2 mehomefragmentV2 = MehomefragmentV2.this;
                    MehomefragmentV2.w4(mehomefragmentV2, (int) (com.max.hbutils.utils.t.p(((com.max.hbcommon.base.d) mehomefragmentV2).mContext) + ((com.max.hbcommon.base.d) MehomefragmentV2.this).mContext.getResources().getDimension(R.dimen.title_bar_height)));
                }
            }
        }

        public void onNext(Result<UnloginStatsObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23618, new Class[]{Result.class}, Void.TYPE).isSupported || !MehomefragmentV2.this.isActive() || result.getResult() == null) {
                return;
            }
            MehomefragmentV2.x4(MehomefragmentV2.this);
            MehomefragmentV2.this.f78121u = result.getResult();
            MehomefragmentV2 mehomefragmentV2 = MehomefragmentV2.this;
            com.max.xiaoheihe.module.account.utils.f.c(mehomefragmentV2.vg_menu_task, com.max.xiaoheihe.module.account.utils.f.f79302a, mehomefragmentV2.f78121u.getTask_desc(), null, null);
            MehomefragmentV2 mehomefragmentV3 = MehomefragmentV2.this;
            com.max.xiaoheihe.module.account.utils.f.c(mehomefragmentV3.vg_menu_mall, com.max.xiaoheihe.module.account.utils.f.f79303b, mehomefragmentV3.f78121u.getStore_desc(), null, null);
            MehomefragmentV2.this.f78110j.clear();
            MehomefragmentV2.this.f78110j.add(GameBindingFragment.n4(GameBindingFragment.C, MehomefragmentV2.this.f78121u.getStats_orders()));
            MehomefragmentV2.this.f78112l.notifyDataSetChanged();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23619, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<UnloginStatsObj>) obj);
        }
    }

    public class g0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23644, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.R1(((com.max.hbcommon.base.d) MehomefragmentV2.this).mContext);
        }
    }

    public class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f78147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AccountDetailObj f78148c;

        h(String str, AccountDetailObj accountDetailObj) {
            this.f78147b = str;
            this.f78148c = accountDetailObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23620, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!MehomefragmentV2.this.f78113m) {
                ImageViewerHelper.a(((com.max.hbcommon.base.d) MehomefragmentV2.this).mContext).i(MehomefragmentV2.this.mIvAvatar, this.f78147b, R.id.iv_avartar).a().p();
            } else {
                MehomefragmentV2 mehomefragmentV2 = MehomefragmentV2.this;
                mehomefragmentV2.startActivity(ChangeAvatarActivity.S.a(((com.max.hbcommon.base.d) mehomefragmentV2).mContext, this.f78147b, this.f78148c.getAvatar_config()));
            }
        }
    }

    public class h0 extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        h0() {
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23660, new Class[]{Result.class}, Void.TYPE).isSupported && MehomefragmentV2.this.isActive()) {
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(MehomefragmentV2.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                if (((com.max.hbcommon.base.d) MehomefragmentV2.this).mContext instanceof MeHomeActivity) {
                    Intent intent = new Intent();
                    intent.putExtra("follow", "0");
                    ((MeHomeActivity) ((com.max.hbcommon.base.d) MehomefragmentV2.this).mContext).setResult(-1, intent);
                }
                if ("3".equals(MehomefragmentV2.this.f78115o)) {
                    MehomefragmentV2.U4(MehomefragmentV2.this, "2");
                } else {
                    MehomefragmentV2.U4(MehomefragmentV2.this, "0");
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23661, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AccountDetailObj f78151b;

        i(AccountDetailObj accountDetailObj) {
            this.f78151b = accountDetailObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23621, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.D1(((com.max.hbcommon.base.d) MehomefragmentV2.this).mContext, view, this.f78151b, MehomefragmentV2.this.f78113m);
        }
    }

    public class i0 implements com.max.xiaoheihe.module.bbs.n.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f78153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f78154b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f78155c;

        public class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 23664, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        public class b implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ RadioGroup f78158b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ EditText f78159c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f78160d;

            b(RadioGroup radioGroup, EditText editText, String str) {
                this.f78158b = radioGroup;
                this.f78159c = editText;
                this.f78160d = str;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                String str;
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 23665, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                if (this.f78158b.getCheckedRadioButtonId() == R.id.rb_1) {
                    str = "259200";
                } else if (this.f78158b.getCheckedRadioButtonId() == R.id.rb_2) {
                    str = "604800";
                } else {
                    str = this.f78158b.getCheckedRadioButtonId() == R.id.rb_3 ? "1296000" : "86400";
                }
                String str2 = str;
                String string = !com.max.hbcommon.utils.c.u(this.f78159c.getText().toString()) ? this.f78159c.getText().toString() : null;
                i0 i0Var = i0.this;
                MehomefragmentV2.Z4(MehomefragmentV2.this, i0Var.f78153a, this.f78160d, str2, null, i0Var.f78154b, i0Var.f78155c, string);
                dialogInterface.dismiss();
            }
        }

        i0(String str, String str2, String str3) {
            this.f78153a = str;
            this.f78154b = str2;
            this.f78155c = str3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void c(View view, RadioButton[] radioButtonArr, RadioGroup radioGroup, int i10) {
            if (PatchProxy.proxy(new Object[]{view, radioButtonArr, radioGroup, new Integer(i10)}, null, changeQuickRedirect, true, 23663, new Class[]{View.class, RadioButton[].class, RadioGroup.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            RadioButton radioButton = (RadioButton) view.findViewById(i10);
            RadioButton radioButton2 = radioButtonArr[0];
            if (radioButton2 != null) {
                radioButton2.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
            }
            if (radioButton != null) {
                radioButton.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            }
            radioButtonArr[0] = radioButton;
        }

        @Override // com.max.xiaoheihe.module.bbs.n.d
        public void a(View view, int i10, ForbidReasonResult<List<String>> forbidReasonResult, String str) {
            String str2;
            if (PatchProxy.proxy(new Object[]{view, new Integer(i10), forbidReasonResult, str}, this, changeQuickRedirect, false, 23662, new Class[]{View.class, Integer.TYPE, ForbidReasonResult.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            final View viewInflate = ((com.max.hbcommon.base.d) MehomefragmentV2.this).mInflater.inflate(R.layout.layout_forbid_user, (ViewGroup) null);
            viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(R.id.rg_forbid_time);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_forbid_time_remained);
            EditText editText = (EditText) viewInflate.findViewById(R.id.et_forbid_comment);
            final RadioButton[] radioButtonArr = {null};
            RadioButton radioButton = (RadioButton) viewInflate.findViewById(radioGroup.getCheckedRadioButtonId());
            radioButtonArr[0] = radioButton;
            if (radioButton != null) {
                radioButton.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            }
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.max.xiaoheihe.module.account.g0
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(RadioGroup radioGroup2, int i11) {
                    MehomefragmentV2.i0.c(viewInflate, radioButtonArr, radioGroup2, i11);
                }
            });
            if (forbidReasonResult == null || forbidReasonResult.getForbid_info() == null) {
                str2 = "0";
            } else {
                str2 = String.format(Locale.US, "%.0f", Double.valueOf(Math.ceil(com.max.hbutils.utils.n.r(forbidReasonResult.getForbid_info().getRemained_seconds()) / 86400.0d)));
            }
            textView.setText(String.format(MehomefragmentV2.this.getString(R.string.forbid_remained), str2));
            com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(((com.max.hbcommon.base.d) MehomefragmentV2.this).mContext);
            fVar.y(MehomefragmentV2.this.getString(R.string.please_choose_forbid_time)).i(viewInflate).u(MehomefragmentV2.this.getString(R.string.bbs_mute), new b(radioGroup, editText, str)).o(MehomefragmentV2.this.getString(R.string.cancel), new a());
            fVar.F();
        }
    }

    public class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23622, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MehomefragmentV2 mehomefragmentV2 = MehomefragmentV2.this;
            mehomefragmentV2.startActivity(UpdateAccountActivity.e2(((com.max.hbcommon.base.d) mehomefragmentV2).mContext, UpdateAccountActivity.U));
        }
    }

    public class j0 extends com.max.hbcommon.network.d<Result<HomeDataObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        j0() {
        }

        public void onNext(Result<HomeDataObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23666, new Class[]{Result.class}, Void.TYPE).isSupported && MehomefragmentV2.this.isActive()) {
                super.onNext(result);
                if (result == null || result.getResult() == null) {
                    return;
                }
                HomeDataObj result2 = result.getResult();
                if ((result2.getSteam_id_info() == null || com.max.hbcommon.utils.c.u(result2.getSteam_id_info().getSteamid())) ? false : true) {
                    MehomefragmentV2.d5(MehomefragmentV2.this);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23667, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<HomeDataObj>) obj);
        }
    }

    public class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23602, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.i0(((com.max.hbcommon.base.d) MehomefragmentV2.this).mContext, lb.d.f131244r4);
        }
    }

    public class k0 extends com.max.hbcommon.network.d<Result<RecUsersResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        k0() {
        }

        public void onNext(Result<RecUsersResult> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23668, new Class[]{Result.class}, Void.TYPE).isSupported && MehomefragmentV2.this.isActive()) {
                MehomefragmentV2.f5(MehomefragmentV2.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23669, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<RecUsersResult>) obj);
        }
    }

    public class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AccountDetailObj f78166b;

        l(AccountDetailObj accountDetailObj) {
            this.f78166b = accountDetailObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23624, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.account.utils.l.d0(((com.max.hbcommon.base.d) MehomefragmentV2.this).mContext, MehomefragmentV2.this.tv_signature, this.f78166b.getSignature(), false, 0, 10, true);
        }
    }

    public class l0 extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f78168b;

        l0(int i10) {
            this.f78168b = i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@androidx.annotation.n0 Rect rect, @androidx.annotation.n0 View view, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, 23670, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int iF = childAdapterPosition < 3 ? ViewUtils.f(((com.max.hbcommon.base.d) MehomefragmentV2.this).mContext, 10.0f) : 0;
            if (childAdapterPosition % 3 != 0) {
                rect.set(0, iF, this.f78168b, 0);
            } else {
                int i10 = this.f78168b;
                rect.set(i10, iF, i10, 0);
            }
        }
    }

    public class m extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23625, new Class[]{Result.class}, Void.TYPE).isSupported && MehomefragmentV2.this.isActive()) {
                super.onNext(result);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(MehomefragmentV2.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23626, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class m0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RecUsersResult f78171b;

        public class a extends com.max.hbcommon.network.d<Result> {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            public void onNext(Result result) {
                if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23672, new Class[]{Result.class}, Void.TYPE).isSupported && MehomefragmentV2.this.isActive()) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f("已为您关注" + m0.this.f78171b.getRec_users().size() + "位好友");
                    TextView textView = MehomefragmentV2.this.tv_follow_num;
                    if (textView != null) {
                        int iQ = com.max.hbutils.utils.n.q(textView.getText().toString()) + m0.this.f78171b.getRec_users().size();
                        MehomefragmentV2.this.tv_follow_num.setText(iQ + "");
                    }
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23673, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result) obj);
            }
        }

        m0(RecUsersResult recUsersResult) {
            this.f78171b = recUsersResult;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 23671, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            for (BBSUserInfoObj bBSUserInfoObj : this.f78171b.getRec_users()) {
                if (sb2.length() > 0) {
                    sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb2.append(bBSUserInfoObj.getUserid());
            }
            com.max.xiaoheihe.network.i.a().V6(null, sb2.length() > 0 ? com.meituan.robust.Constants.ARRAY_TYPE + sb2.toString() + "]" : null, null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new a());
            dialogInterface.dismiss();
        }
    }

    public class n extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23627, new Class[]{Result.class}, Void.TYPE).isSupported && MehomefragmentV2.this.isActive()) {
                super.onNext(result);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(MehomefragmentV2.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23628, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class n0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        n0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23659, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MehomefragmentV2.this.getActivity().onBackPressed();
        }
    }

    public class o extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23629, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(result);
            if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(MehomefragmentV2.this.getString(R.string.report_success));
            } else {
                com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(result.getMsg());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23630, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class o0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f78177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f78178c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f78179d;

        o0(boolean z10, boolean z11, boolean z12) {
            this.f78177b = z10;
            this.f78178c = z11;
            this.f78179d = z12;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23674, new Class[]{View.class}, Void.TYPE).isSupported || MehomefragmentV2.this.B == null) {
                return;
            }
            MehomefragmentV2 mehomefragmentV2 = MehomefragmentV2.this;
            MehomefragmentV2.E4(mehomefragmentV2, mehomefragmentV2.B.getTitle(), MehomefragmentV2.this.B.getDesc(), MehomefragmentV2.this.B.getShare_link(), MehomefragmentV2.this.B.getImage(), this.f78177b, this.f78178c, this.f78179d);
        }
    }

    public class p extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23631, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            super.onComplete();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23632, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23633, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(result);
            if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(MehomefragmentV2.this.getString(R.string.success));
            } else {
                com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(result.getMsg());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23634, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class p0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        p0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23675, new Class[]{View.class}, Void.TYPE).isSupported && com.max.xiaoheihe.module.account.utils.c.c(MehomefragmentV2.this.f78107g) == 0) {
                MehomefragmentV2.this.m6();
            }
        }
    }

    public class q implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23635, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MehomefragmentV2.D4(MehomefragmentV2.this);
            com.max.hbcommon.analytics.l.f66572a.o("1", GameListObj.ROLL_PAGE_TYPE_HOME, MehomefragmentV2.this.f78107g);
        }
    }

    public class q0 implements AppBarLayout.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        q0() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.f, com.google.android.material.appbar.AppBarLayout.b
        public void a(AppBarLayout appBarLayout, int i10) {
            UserBBSInfoFragment userBBSInfoFragmentA5;
            if (PatchProxy.proxy(new Object[]{appBarLayout, new Integer(i10)}, this, changeQuickRedirect, false, 23678, new Class[]{AppBarLayout.class, Integer.TYPE}, Void.TYPE).isSupported || (userBBSInfoFragmentA5 = MehomefragmentV2.a5(MehomefragmentV2.this)) == null) {
                return;
            }
            userBBSInfoFragmentA5.a5(i10);
        }
    }

    public class r implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements com.max.xiaoheihe.view.m {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.xiaoheihe.view.m
            public void a(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 23638, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                dialog.dismiss();
                MehomefragmentV2.G4(MehomefragmentV2.this);
                com.max.hbcommon.analytics.l.f66572a.o("0", GameListObj.ROLL_PAGE_TYPE_HOME, MehomefragmentV2.this.f78107g);
            }

            @Override // com.max.xiaoheihe.view.m
            public void b(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 23637, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                dialog.dismiss();
            }
        }

        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23636, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.view.l.D(((com.max.hbcommon.base.d) MehomefragmentV2.this).mContext, MehomefragmentV2.this.getString(R.string.cancel_follow_user_confirm), "", MehomefragmentV2.this.getString(R.string.confirm), MehomefragmentV2.this.getString(R.string.cancel), new a());
        }
    }

    public class r0 extends androidx.fragment.app.n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        r0(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23680, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : MehomefragmentV2.this.f78110j.size();
        }

        @Override // androidx.fragment.app.n0
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 23679, new Class[]{Integer.TYPE}, Fragment.class);
            return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : (Fragment) MehomefragmentV2.this.f78110j.get(i10);
        }

        @Override // androidx.viewpager.widget.a
        @androidx.annotation.p0
        public CharSequence getPageTitle(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 23681, new Class[]{Integer.TYPE}, CharSequence.class);
            return patchProxyResultProxy.isSupported ? (CharSequence) patchProxyResultProxy.result : ((KeyDescObj) MehomefragmentV2.this.f78111k.get(i10)).getTitle();
        }
    }

    public class s implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23639, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MehomefragmentV2.D4(MehomefragmentV2.this);
            com.max.hbcommon.analytics.l.f66572a.o("1", GameListObj.ROLL_PAGE_TYPE_HOME, MehomefragmentV2.this.f78107g);
        }
    }

    public class s0 extends com.max.hbcommon.base.adapter.s<BBSUserInfoObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BBSUserInfoObj f78190b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.max.hbcommon.base.adapter.s.e f78191c;

            a(BBSUserInfoObj bBSUserInfoObj, com.max.hbcommon.base.adapter.s.e eVar) {
                this.f78190b = bBSUserInfoObj;
                this.f78191c = eVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23688, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                if ("1".equals(this.f78190b.getIs_follow())) {
                    this.f78190b.setIs_follow("0");
                } else if ("3".equals(this.f78190b.getIs_follow())) {
                    this.f78190b.setIs_follow("2");
                } else if ("0".equals(this.f78190b.getIs_follow())) {
                    this.f78190b.setIs_follow("1");
                } else if ("2".equals(this.f78190b.getIs_follow())) {
                    this.f78190b.setIs_follow("3");
                }
                s0.m(s0.this, this.f78191c, this.f78190b.getIs_follow());
                if ("1".equals(this.f78190b.getIs_follow()) || "3".equals(this.f78190b.getIs_follow())) {
                    com.max.hbcommon.analytics.l.f66572a.o("0", "steam", this.f78190b.getUserid());
                    com.max.xiaoheihe.network.i.a().m5(this.f78190b.getUserid(), this.f78190b.getH_src()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new com.max.hbcommon.network.d());
                } else {
                    com.max.hbcommon.analytics.l.f66572a.o("1", "steam", this.f78190b.getUserid());
                    com.max.xiaoheihe.network.i.a().V6(this.f78190b.getUserid(), null, this.f78190b.getH_src()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new com.max.hbcommon.network.d());
                }
            }
        }

        public class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BBSUserInfoObj f78193b;

            b(BBSUserInfoObj bBSUserInfoObj) {
                this.f78193b = bBSUserInfoObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23689, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.base.router.b.T(((com.max.hbcommon.base.d) MehomefragmentV2.this).mContext, this.f78193b.getUserid()).A();
            }
        }

        public s0(List<BBSUserInfoObj> list) {
            super(((com.max.hbcommon.base.d) MehomefragmentV2.this).mContext, list, R.layout.item_recommend_following);
        }

        static /* synthetic */ void m(s0 s0Var, com.max.hbcommon.base.adapter.s.e eVar, String str) {
            if (PatchProxy.proxy(new Object[]{s0Var, eVar, str}, null, changeQuickRedirect, true, 23687, new Class[]{s0.class, com.max.hbcommon.base.adapter.s.e.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            s0Var.o(eVar, str);
        }

        private void o(com.max.hbcommon.base.adapter.s.e eVar, String str) {
            boolean z10 = true;
            if (PatchProxy.proxy(new Object[]{eVar, str}, this, changeQuickRedirect, false, 23685, new Class[]{com.max.hbcommon.base.adapter.s.e.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            ImageView imageView = (ImageView) eVar.i(R.id.iv_action);
            TextView textView = (TextView) eVar.i(R.id.tv_action);
            if (!"1".equals(str) && !"3".equals(str)) {
                z10 = false;
            }
            imageView.setVisibility(z10 ? 8 : 0);
            textView.setText(z10 ? MehomefragmentV2.this.getString(R.string.has_followed) : MehomefragmentV2.this.getString(R.string.follow));
            textView.setTextColor(z10 ? MehomefragmentV2.this.getResources().getColor(R.color.text_primary_1_color) : MehomefragmentV2.this.getResources().getColor(R.color.click_blue));
        }

        public void n(com.max.hbcommon.base.adapter.s.e eVar, BBSUserInfoObj bBSUserInfoObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSUserInfoObj}, this, changeQuickRedirect, false, 23684, new Class[]{com.max.hbcommon.base.adapter.s.e.class, BBSUserInfoObj.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbimage.b.I(bBSUserInfoObj.getAvartar(), (ImageView) eVar.i(R.id.iv_avatar), R.drawable.common_default_avatar_40x40);
            eVar.p(R.id.tv_name, bBSUserInfoObj.getUsername());
            eVar.p(R.id.tv_desc, bBSUserInfoObj.getRec_tag());
            o(eVar, bBSUserInfoObj.getIs_follow());
            eVar.i(R.id.vg_action).setOnClickListener(new a(bBSUserInfoObj, eVar));
            eVar.b().setOnClickListener(new b(bBSUserInfoObj));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, BBSUserInfoObj bBSUserInfoObj) {
            if (PatchProxy.proxy(new Object[]{eVar, bBSUserInfoObj}, this, changeQuickRedirect, false, 23686, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            n(eVar, bBSUserInfoObj);
        }
    }

    public class t implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements com.max.xiaoheihe.view.m {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.xiaoheihe.view.m
            public void a(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 23642, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                dialog.dismiss();
                MehomefragmentV2.G4(MehomefragmentV2.this);
                com.max.hbcommon.analytics.l.f66572a.o("0", GameListObj.ROLL_PAGE_TYPE_HOME, MehomefragmentV2.this.f78107g);
            }

            @Override // com.max.xiaoheihe.view.m
            public void b(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 23641, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                dialog.dismiss();
            }
        }

        t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23640, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.view.l.D(((com.max.hbcommon.base.d) MehomefragmentV2.this).mContext, MehomefragmentV2.this.getString(R.string.cancel_follow_user_confirm), "", MehomefragmentV2.this.getString(R.string.confirm), MehomefragmentV2.this.getString(R.string.cancel), new a());
        }
    }

    public class u implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23643, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MsgConversationActivity.R1(((com.max.hbcommon.base.d) MehomefragmentV2.this).mContext, MehomefragmentV2.this.f78107g, MehomefragmentV2.this.mTvUsername.getText().toString());
        }
    }

    public class v implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23623, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.i0(((com.max.hbcommon.base.d) MehomefragmentV2.this).mContext, lb.d.f131153e4);
        }
    }

    public class w implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23645, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MehomefragmentV2.this.iv_not_friend_red_point.setVisibility(8);
            com.max.hbcache.c.C(com.max.hbcache.c.B0, "0");
            com.max.xiaoheihe.base.router.b.I(((com.max.hbcommon.base.d) MehomefragmentV2.this).mContext, MehomefragmentV2.this.f78107g, "friend", null).A();
        }
    }

    public class x implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        x() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23646, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.I(((com.max.hbcommon.base.d) MehomefragmentV2.this).mContext, MehomefragmentV2.this.f78107g, "following", null).A();
        }
    }

    public class y implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        y() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23647, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.I(((com.max.hbcommon.base.d) MehomefragmentV2.this).mContext, MehomefragmentV2.this.f78107g, lb.c.f131110f, null).A();
        }
    }

    public class z implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        z() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23648, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.analytics.d.d("4", lb.d.f131297z1, null, new JsonObject());
            com.max.xiaoheihe.base.router.b.i0(((com.max.hbcommon.base.d) MehomefragmentV2.this).mContext, lb.d.f131290y1);
        }
    }

    private void A5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23542, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        if ((TextUtils.isEmpty(this.f78107g) || "-1".equals(this.f78107g)) ? false : true) {
            this.mHomeMenuView.setVisibility(8);
            B5();
            return;
        }
        this.mIvAvatar.setAvatar(R.drawable.common_default_avatar_40x40, (AvatarDecorationObj) null);
        this.mTvUsername.setText(getString(R.string.click_to_login));
        this.tv_signature.setText(R.string.login_tips);
        this.vg_bbs_info.setVisibility(8);
        this.mUserLevelContainer.setVisibility(8);
        this.tb_home.getTv_title().setVisibility(0);
        this.tb_home.getTv_title().setText("个人中心");
        this.tb_home.getTv_title().setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        this.mHomeMenuView.setVisibility(0);
        com.max.xiaoheihe.module.account.utils.f.c(this.vg_menu_task, com.max.xiaoheihe.module.account.utils.f.f79302a, "", null, null);
        com.max.xiaoheihe.module.account.utils.f.c(this.vg_menu_mall, com.max.xiaoheihe.module.account.utils.f.f79303b, "", null, null);
        ViewGroup.LayoutParams layoutParams = this.mVgLogin.getLayoutParams();
        int iM = com.max.hbutils.utils.t.m(this.mContext) + ViewUtils.f(this.mContext, 132.0f);
        if (layoutParams.height != iM) {
            layoutParams.height = iM;
            this.mVgLogin.setLayoutParams(layoutParams);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mIvAvatar.getLayoutParams();
        marginLayoutParams.bottomMargin = 0;
        this.mIvAvatar.setLayoutParams(marginLayoutParams);
        r1.j2(this.f78104d, GameObj.ALL_PLATFORMS, null, null);
        y5();
    }

    private void C5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23526, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f78112l = new r0(getChildFragmentManager());
        this.vp.setOffscreenPageLimit(3);
        this.vp.setAdapter(this.f78112l);
        this.vp.c(new a());
    }

    static /* synthetic */ void D4(MehomefragmentV2 mehomefragmentV2) {
        if (PatchProxy.proxy(new Object[]{mehomefragmentV2}, null, changeQuickRedirect, true, 23593, new Class[]{MehomefragmentV2.class}, Void.TYPE).isSupported) {
            return;
        }
        mehomefragmentV2.r5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D5(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23581, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.base.router.b.z0(UserCenteredSearchActivity.X1(this.mContext, this.f78107g, this.mTvUsername.getText()));
    }

    static /* synthetic */ void E4(MehomefragmentV2 mehomefragmentV2, String str, String str2, String str3, String str4, boolean z10, boolean z11, boolean z12) {
        Object[] objArr = {mehomefragmentV2, str, str2, str3, str4, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 23582, new Class[]{MehomefragmentV2.class, String.class, String.class, String.class, String.class, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        mehomefragmentV2.l6(str, str2, str3, str4, z10, z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E5(AppBarLayout appBarLayout, int i10) {
        UserBBSInfoFragment userBBSInfoFragmentZ5;
        if (PatchProxy.proxy(new Object[]{appBarLayout, new Integer(i10)}, this, changeQuickRedirect, false, 23580, new Class[]{AppBarLayout.class, Integer.TYPE}, Void.TYPE).isSupported || (userBBSInfoFragmentZ5 = z5()) == null) {
            return;
        }
        userBBSInfoFragmentZ5.a5(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F5(Dialog dialog, View view, ImageView imageView, TextView textView) {
        if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, 23579, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        Z5();
        com.max.hbshare.d.n(this.mContext, dialog);
    }

    static /* synthetic */ void G4(MehomefragmentV2 mehomefragmentV2) {
        if (PatchProxy.proxy(new Object[]{mehomefragmentV2}, null, changeQuickRedirect, true, 23594, new Class[]{MehomefragmentV2.class}, Void.TYPE).isSupported) {
            return;
        }
        mehomefragmentV2.n5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G5(Dialog dialog, View view, ImageView imageView, TextView textView) {
        if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, 23578, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        U5();
        com.max.hbshare.d.n(this.mContext, dialog);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H5(Dialog dialog, View view, ImageView imageView, TextView textView) {
        if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, 23577, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        Y5();
        com.max.hbshare.d.n(this.mContext, dialog);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I5(Dialog dialog, View view, ImageView imageView, TextView textView) {
        if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, 23576, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        V5();
        com.max.hbshare.d.n(this.mContext, dialog);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J5(Dialog dialog, View view, ImageView imageView, TextView textView) {
        if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, 23575, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        T5();
        com.max.hbshare.d.n(this.mContext, dialog);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K5(Dialog dialog, View view, ImageView imageView, TextView textView) {
        if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, 23574, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        W5();
        com.max.hbshare.d.n(this.mContext, dialog);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L5(Dialog dialog, View view, ImageView imageView, TextView textView) {
        if (PatchProxy.proxy(new Object[]{dialog, view, imageView, textView}, this, changeQuickRedirect, false, 23573, new Class[]{Dialog.class, View.class, ImageView.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        X5();
        com.max.hbshare.d.n(this.mContext, dialog);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M5(View view, int i10, ForbidReasonResult forbidReasonResult, String str) {
        if (PatchProxy.proxy(new Object[]{view, new Integer(i10), forbidReasonResult, str}, this, changeQuickRedirect, false, 23572, new Class[]{View.class, Integer.TYPE, ForbidReasonResult.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        s5(this.f78107g, str, "forever", "device", null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N5(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23571, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        this.mUserLevelContainer.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O5(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23570, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        this.mUserLevelContainer.performClick();
    }

    private ArrayList<PostOptionObj> P5(boolean z10, boolean z11, boolean z12) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 23523, new Class[]{cls, cls, cls}, ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        ArrayList<PostOptionObj> arrayList = new ArrayList<>();
        arrayList.add(m5(getString(R.string.report), R.drawable.bbs_sharebutton_report_46x46, new PostOptionObj.OnClickListener() { // from class: com.max.xiaoheihe.module.account.r
            @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
            public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
                this.f79176a.F5(dialog, view, imageView, textView);
            }
        }));
        AccountDetailObj accountDetailObj = this.f78120t;
        arrayList.add(m5((accountDetailObj == null || accountDetailObj.getBbs_info() == null || !"1".equals(this.f78120t.getBbs_info().getBlocking())) ? getString(R.string.pull_sb_into_blacklist) : getString(R.string.drop_sb_from_blacklist), R.drawable.bbs_sharebutton_block_46x46_3x, new PostOptionObj.OnClickListener() { // from class: com.max.xiaoheihe.module.account.u
            @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
            public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
                this.f79273a.G5(dialog, view, imageView, textView);
            }
        }));
        if (z10) {
            arrayList.add(m5(getString(R.string.forbid_history), R.drawable.bbs_sharebutton_ban_record_46x46_3x, new PostOptionObj.OnClickListener() { // from class: com.max.xiaoheihe.module.account.v
                @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
                public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
                    this.f79430a.H5(dialog, view, imageView, textView);
                }
            }));
        }
        if (z11) {
            arrayList.add(m5(getString(R.string.cancel_forbid), R.drawable.bbs_sharebutton_unsilence_46x46_3x, new PostOptionObj.OnClickListener() { // from class: com.max.xiaoheihe.module.account.w
                @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
                public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
                    this.f79453a.I5(dialog, view, imageView, textView);
                }
            }));
            arrayList.add(m5(getString(R.string.bbs_mute), R.drawable.bbs_sharebutton_silence_46x46_3x, new PostOptionObj.OnClickListener() { // from class: com.max.xiaoheihe.module.account.x
                @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
                public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
                    this.f79454a.J5(dialog, view, imageView, textView);
                }
            }));
        }
        if (z12) {
            arrayList.add(m5(getString(R.string.delete_user_posts), R.drawable.bbs_sharebutton_delete_46x46, new PostOptionObj.OnClickListener() { // from class: com.max.xiaoheihe.module.account.y
                @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
                public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
                    this.f79455a.K5(dialog, view, imageView, textView);
                }
            }));
            arrayList.add(m5(getString(R.string.forbid_forever_device), R.drawable.bbs_sharebutton_silence_forever_46x46_3x, new PostOptionObj.OnClickListener() { // from class: com.max.xiaoheihe.module.account.z
                @Override // com.max.hbshare.bean.PostOptionObj.OnClickListener
                public final void onClick(Dialog dialog, View view, ImageView imageView, TextView textView) {
                    this.f79456a.L5(dialog, view, imageView, textView);
                }
            }));
        }
        return arrayList;
    }

    public static MehomefragmentV2 Q5(String str, String str2, String[] strArr, String str3, int i10, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, strArr, str3, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 23520, new Class[]{String.class, String.class, String[].class, String.class, Integer.TYPE, Boolean.TYPE}, MehomefragmentV2.class);
        if (patchProxyResultProxy.isSupported) {
            return (MehomefragmentV2) patchProxyResultProxy.result;
        }
        MehomefragmentV2 mehomefragmentV2 = new MehomefragmentV2();
        Bundle bundle = new Bundle();
        bundle.putString("heyboxId", str);
        bundle.putString("steamId", str2);
        bundle.putStringArray("pages", strArr);
        bundle.putString(MainActivity.C4, str3);
        bundle.putInt("page_index", i10);
        bundle.putBoolean(com.max.xiaoheihe.module.account.q0.f79173f, z10);
        mehomefragmentV2.setArguments(bundle);
        return mehomefragmentV2;
    }

    private void S5(List<KeyDescObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 23546, new Class[]{List.class}, Void.TYPE).isSupported || list == null) {
            return;
        }
        this.f78110j.clear();
        this.f78111k.clear();
        for (KeyDescObj keyDescObj : list) {
            if ("native".equalsIgnoreCase(keyDescObj.getType())) {
                if (G.equalsIgnoreCase(keyDescObj.getKey())) {
                    this.f78110j.add(MeHomeFragmentx.K6(this.f78107g, this.f78108h, null, this.f78123w));
                    this.f78111k.add(keyDescObj);
                } else if (H.equalsIgnoreCase(keyDescObj.getKey())) {
                    this.f78110j.add(UserBBSInfoFragment.v5(this.f78107g, this.f78126z));
                    this.f78111k.add(keyDescObj);
                    this.f78126z = null;
                }
            }
        }
        this.f78112l.notifyDataSetChanged();
        if (this.f78119s) {
            this.f78102b.setupWithViewPager(this.vp);
            o5(this.f78106f, null);
        } else {
            this.f78103c.setViewPager(this.vp, x5());
            this.vp.setCurrentItem(this.f78124x, false);
        }
    }

    private void T5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23529, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        j6(this.f78107g, null, null);
    }

    static /* synthetic */ void U4(MehomefragmentV2 mehomefragmentV2, String str) {
        if (PatchProxy.proxy(new Object[]{mehomefragmentV2, str}, null, changeQuickRedirect, true, 23595, new Class[]{MehomefragmentV2.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        mehomefragmentV2.p6(str);
    }

    private void U5() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23533, new Class[0], Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(this.mContext)) {
            AccountDetailObj accountDetailObj = this.f78120t;
            if (accountDetailObj == null || accountDetailObj.getBbs_info() == null || !"1".equals(this.f78120t.getBbs_info().getBlocking())) {
                com.max.xiaoheihe.view.l.D(this.mContext, getString(R.string.prompt), getString(R.string.pull_sb_into_blacklist_tips), getString(R.string.pull_sb_into_blacklist), getString(R.string.cancel), new e());
            } else {
                q5();
            }
        }
    }

    private void V5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23530, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Activity activity = this.mContext;
        com.max.xiaoheihe.view.l.D(activity, activity.getString(R.string.cancel_forbid_tips), "", this.mContext.getString(R.string.cancel_forbid), this.mContext.getString(R.string.cancel), new c());
    }

    private void W5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23528, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.view.l.D(this.mContext, getString(R.string.delete_user_posts), "", getString(R.string.confirm), getString(R.string.cancel), new b());
    }

    private void X5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23527, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.bbs.n.V3(this.f78107g, new com.max.xiaoheihe.module.bbs.n.d() { // from class: com.max.xiaoheihe.module.account.t
            @Override // com.max.xiaoheihe.module.bbs.n.d
            public final void a(View view, int i10, ForbidReasonResult forbidReasonResult, String str) {
                this.f79271a.M5(view, i10, forbidReasonResult, str);
            }
        }).show(getChildFragmentManager(), "ForbidReasonFragment");
    }

    private void Y5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23531, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.bbs.m.S3(this.f78107g).show(getChildFragmentManager(), "ForbidHistoryFragment");
    }

    static /* synthetic */ void Z3(MehomefragmentV2 mehomefragmentV2, boolean z10) {
        if (PatchProxy.proxy(new Object[]{mehomefragmentV2, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 23584, new Class[]{MehomefragmentV2.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        mehomefragmentV2.e6(z10);
    }

    static /* synthetic */ void Z4(MehomefragmentV2 mehomefragmentV2, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (PatchProxy.proxy(new Object[]{mehomefragmentV2, str, str2, str3, str4, str5, str6, str7}, null, changeQuickRedirect, true, 23596, new Class[]{MehomefragmentV2.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        mehomefragmentV2.s5(str, str2, str3, str4, str5, str6, str7);
    }

    private void Z5() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23532, new Class[0], Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(this.mContext)) {
            ReportReasonFragment.f80025u.a(new d(), ReportReasonFragment.ObjectType.user, this.f78107g, null, null).show(getChildFragmentManager(), "ForbidReasonFragment");
        }
    }

    static /* synthetic */ UserBBSInfoFragment a5(MehomefragmentV2 mehomefragmentV2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mehomefragmentV2}, null, changeQuickRedirect, true, 23583, new Class[]{MehomefragmentV2.class}, UserBBSInfoFragment.class);
        return patchProxyResultProxy.isSupported ? (UserBBSInfoFragment) patchProxyResultProxy.result : mehomefragmentV2.z5();
    }

    @SuppressLint({"AutoDispose"})
    private void a6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23557, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().L6(this.f78107g, "-1").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e0()));
    }

    static /* synthetic */ void b5(MehomefragmentV2 mehomefragmentV2) {
        if (PatchProxy.proxy(new Object[]{mehomefragmentV2}, null, changeQuickRedirect, true, 23597, new Class[]{MehomefragmentV2.class}, Void.TYPE).isSupported) {
            return;
        }
        mehomefragmentV2.A5();
    }

    private void b6(AccountDetailObj accountDetailObj) {
        if (PatchProxy.proxy(new Object[]{accountDetailObj}, this, changeQuickRedirect, false, 23555, new Class[]{AccountDetailObj.class}, Void.TYPE).isSupported || accountDetailObj == null || accountDetailObj.getBbs_info() == null) {
            return;
        }
        BBSInfoObj bbs_info = accountDetailObj.getBbs_info();
        this.vg_bbs_info.setVisibility(0);
        accountDetailObj.getFriends_count();
        String follow_num = bbs_info.getFollow_num();
        String fan_num = bbs_info.getFan_num();
        bbs_info.getFavour_num();
        bbs_info.getFavour_unread();
        String visit_num = bbs_info.getVisit_num();
        p6(bbs_info.getFollow_status());
        this.ll_friends.setOnClickListener(new w());
        TextView textView = this.tv_follow_num;
        if (com.max.hbcommon.utils.c.u(follow_num)) {
            follow_num = "0";
        }
        textView.setText(follow_num);
        TextView textView2 = this.tv_fan_num;
        if (com.max.hbcommon.utils.c.u(fan_num)) {
            fan_num = "0";
        }
        textView2.setText(fan_num);
        if (this.f78113m) {
            this.tv_award_num.setText(!com.max.hbcommon.utils.c.u(bbs_info.getFavour_num()) ? bbs_info.getFavour_num() : "0");
        } else {
            this.tv_award_num.setText((com.max.hbutils.utils.n.q(bbs_info.getBe_favoured_num()) + com.max.hbutils.utils.n.q(bbs_info.getAwd_num())) + "");
        }
        this.ll_follow.setOnClickListener(new x());
        this.ll_fans.setOnClickListener(new y());
        this.ll_award.setOnClickListener(null);
        if (this.f78113m) {
            this.ll_history.setVisibility(0);
            this.tv_favour_desc.setText("收藏");
            this.ll_award.setOnClickListener(new z());
            TextView textView3 = this.tv_history_num;
            if (com.max.hbcommon.utils.c.u(visit_num)) {
                visit_num = "0";
            }
            textView3.setText(visit_num);
            this.tv_history_num.setBackground(null);
            this.ll_history.setOnClickListener(new a0());
            MeHomeFragmentx.f77985a4 = com.max.hbutils.utils.n.q(bbs_info.getFriend_num());
            if (com.max.hbutils.utils.n.q(bbs_info.getFriend_num()) > 0) {
                this.ll_friends.setVisibility(0);
                this.tv_friend_num.setVisibility(0);
                this.iv_no_friends.setVisibility(8);
                this.iv_not_friend_red_point.setVisibility(8);
                this.tv_friend_num.setText(bbs_info.getFriend_num());
                int iQ = com.max.hbutils.utils.n.q(bbs_info.getFriend_online_num());
                if (iQ > 0) {
                    this.msg_friend_online_num.setVisibility(0);
                    if (iQ < 100) {
                        this.msg_friend_online_num.setText(String.valueOf(iQ));
                    } else {
                        this.msg_friend_online_num.setText("99+");
                    }
                } else {
                    this.msg_friend_online_num.setVisibility(8);
                }
            } else {
                this.ll_friends.setVisibility(8);
                this.tv_friend_num.setVisibility(8);
                this.iv_no_friends.setVisibility(0);
                this.msg_friend_online_num.setVisibility(8);
                if (com.max.hbcommon.utils.c.x(com.max.hbcache.c.o(com.max.hbcache.c.B0, "1"))) {
                    this.iv_not_friend_red_point.setVisibility(0);
                } else {
                    this.iv_not_friend_red_point.setVisibility(8);
                }
            }
        } else {
            this.ll_history.setClickable(false);
            this.ll_history.setVisibility(8);
            this.tv_favour_desc.setText("获赞与收藏");
            this.ll_award.setOnClickListener(new b0(accountDetailObj));
            this.tv_history_num.setText((CharSequence) null);
            this.tv_history_num.setBackgroundResource(R.drawable.ic_closed_eyes);
            this.tv_friend_num.setVisibility(0);
            this.iv_no_friends.setVisibility(8);
            this.iv_not_friend_red_point.setVisibility(8);
            this.msg_friend_online_num.setVisibility(8);
            this.tv_friend_num.setText((CharSequence) null);
            this.ll_friends.setOnClickListener(null);
            this.tv_friend_num.setBackgroundResource(R.drawable.ic_closed_eyes);
        }
        this.mIvAvatar.setOnlineState(bbs_info.getOnline_state());
        if (com.max.hbcommon.utils.c.u(bbs_info.getOnline_desc())) {
            this.tv_game_state.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) this.tv_signature.getLayoutParams()).topMargin = ViewUtils.f(this.mContext, 3.0f);
            this.tv_signature.getLayoutParams().height = ViewUtils.f(this.mContext, 24.0f);
            return;
        }
        this.tv_game_state.setVisibility(0);
        this.tv_game_state.setText(bbs_info.getOnline_desc());
        TextView textView4 = this.tv_game_state;
        textView4.setBackground(ViewUtils.G(ViewUtils.o(this.mContext, textView4), com.max.xiaoheihe.utils.d.E(R.color.correct_color)));
        this.tv_game_state.setOnClickListener(new c0());
        ((ViewGroup.MarginLayoutParams) this.tv_signature.getLayoutParams()).topMargin = ViewUtils.f(this.mContext, 0.0f);
        this.tv_signature.getLayoutParams().height = -2;
    }

    static /* synthetic */ void c5(MehomefragmentV2 mehomefragmentV2) {
        if (PatchProxy.proxy(new Object[]{mehomefragmentV2}, null, changeQuickRedirect, true, 23598, new Class[]{MehomefragmentV2.class}, Void.TYPE).isSupported) {
            return;
        }
        mehomefragmentV2.t5();
    }

    static /* synthetic */ void d5(MehomefragmentV2 mehomefragmentV2) {
        if (PatchProxy.proxy(new Object[]{mehomefragmentV2}, null, changeQuickRedirect, true, 23599, new Class[]{MehomefragmentV2.class}, Void.TYPE).isSupported) {
            return;
        }
        mehomefragmentV2.v5();
    }

    static /* synthetic */ void e5(MehomefragmentV2 mehomefragmentV2) {
        if (PatchProxy.proxy(new Object[]{mehomefragmentV2}, null, changeQuickRedirect, true, 23600, new Class[]{MehomefragmentV2.class}, Void.TYPE).isSupported) {
            return;
        }
        mehomefragmentV2.f6();
    }

    private void e6(boolean z10) {
        if (!PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 23565, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported && this.f78119s && isActive()) {
            try {
                this.f78102b.w(1).r(z10);
            } catch (Throwable th2) {
                com.max.heybox.hblog.g.G("refreshMomentPoint error " + th2.getMessage());
            }
        }
    }

    static /* synthetic */ void f4(MehomefragmentV2 mehomefragmentV2, String str) {
        if (PatchProxy.proxy(new Object[]{mehomefragmentV2, str}, null, changeQuickRedirect, true, 23585, new Class[]{MehomefragmentV2.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        mehomefragmentV2.p5(str);
    }

    static /* synthetic */ void f5(MehomefragmentV2 mehomefragmentV2, RecUsersResult recUsersResult) {
        if (PatchProxy.proxy(new Object[]{mehomefragmentV2, recUsersResult}, null, changeQuickRedirect, true, 23601, new Class[]{MehomefragmentV2.class, RecUsersResult.class}, Void.TYPE).isSupported) {
            return;
        }
        mehomefragmentV2.k6(recUsersResult);
    }

    private void f6() {
        HomeTitleBar homeTitleBar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23566, new Class[0], Void.TYPE).isSupported || (homeTitleBar = this.tb_home) == null || homeTitleBar.getIv_point_home_msg() == null) {
            return;
        }
        if (com.max.xiaoheihe.utils.i0.s() && com.max.hbcache.c.v()) {
            this.tb_home.getIv_point_home_msg().setVisibility(0);
        } else {
            this.tb_home.getIv_point_home_msg().setVisibility(8);
        }
    }

    static /* synthetic */ void g4(MehomefragmentV2 mehomefragmentV2, String str) {
        if (PatchProxy.proxy(new Object[]{mehomefragmentV2, str}, null, changeQuickRedirect, true, 23586, new Class[]{MehomefragmentV2.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        mehomefragmentV2.n6(str);
    }

    private void g6(AccountDetailObj accountDetailObj) {
        if (PatchProxy.proxy(new Object[]{accountDetailObj}, this, changeQuickRedirect, false, 23547, new Class[]{AccountDetailObj.class}, Void.TYPE).isSupported || accountDetailObj == null) {
            return;
        }
        String avartar = accountDetailObj.getAvartar();
        this.mIvAvatar.setAvatar(avartar, accountDetailObj.getAvatar_decoration());
        this.mIvAvatar.setOnClickListener(new h(avartar, accountDetailObj));
        this.mTvUsername.setText(accountDetailObj.getUsername());
        if (this.f78113m) {
            User userO = com.max.xiaoheihe.utils.i0.o();
            userO.getAccount_detail().setAvartar(accountDetailObj.getAvartar());
            userO.getAccount_detail().setUsername(accountDetailObj.getUsername());
            userO.getAccount_detail().setSignature(accountDetailObj.getSignature());
            com.max.xiaoheihe.utils.i0.z(userO);
        }
        this.mTvUsername.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.account.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78815b.N5(view);
            }
        });
        com.max.xiaoheihe.utils.d.m1(this.mUserLevelContainer, accountDetailObj.getBbs_medal(), accountDetailObj.getMedals(), accountDetailObj.getLevel_info(), accountDetailObj.getUserid(), accountDetailObj.getIp_location(), 16);
        if (this.f78113m && this.mUserLevelContainer.getChildCount() > 0 && com.max.hbcommon.utils.c.w(accountDetailObj.getBbs_medal())) {
            this.iv_default_medal.setVisibility(0);
            this.iv_default_medal.setEnabled(true);
            this.iv_default_medal.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.account.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f79179b.O5(view);
                }
            });
        } else {
            this.iv_default_medal.setEnabled(false);
            this.iv_default_medal.setVisibility(8);
        }
        if (!this.f78113m || accountDetailObj.getBbs_info() == null) {
            this.vg_person_award.setVisibility(8);
        } else {
            this.vg_person_award.setVisibility(0);
            this.tv_person_award.setText(accountDetailObj.getBbs_info().getAwd_num());
            this.vg_person_award.setOnClickListener(new i(accountDetailObj));
        }
        if (com.max.hbcommon.utils.c.u(accountDetailObj.getSignature())) {
            this.tv_signature.setText(this.f78113m ? R.string.tap_to_edit_signature : R.string.no_signature_tips);
        } else {
            this.tv_signature.setText(accountDetailObj.getSignature());
        }
        if (this.f78113m) {
            this.tv_signature.setOnClickListener(new j());
        } else if (com.max.hbcommon.utils.c.u(accountDetailObj.getSignature())) {
            this.tv_signature.setClickable(false);
        } else {
            this.tv_signature.setOnClickListener(new l(accountDetailObj));
        }
    }

    static /* synthetic */ void h4(MehomefragmentV2 mehomefragmentV2, String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{mehomefragmentV2, str, str2, str3}, null, changeQuickRedirect, true, 23587, new Class[]{MehomefragmentV2.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        mehomefragmentV2.h6(str, str2, str3);
    }

    @SuppressLint({"AutoDispose"})
    private void h6(String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 23551, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().u6(str, str2, str3).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new o()));
    }

    static /* synthetic */ void i4(MehomefragmentV2 mehomefragmentV2) {
        if (PatchProxy.proxy(new Object[]{mehomefragmentV2}, null, changeQuickRedirect, true, 23588, new Class[]{MehomefragmentV2.class}, Void.TYPE).isSupported) {
            return;
        }
        mehomefragmentV2.a6();
    }

    private void i6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23534, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int iE = com.max.xiaoheihe.utils.d.E(R.color.white);
        int iE2 = com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_not_change_color);
        int iE3 = com.max.xiaoheihe.utils.d.E(R.color.max_main_color);
        this.mVgLogin.setBackgroundColor(iE3);
        this.mTvUsername.setTextColor(iE);
        this.tv_signature.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_not_change_color));
        this.tv_follow_num.setTextColor(iE);
        this.tv_friend_num.setTextColor(iE);
        this.tv_fan_num.setTextColor(iE);
        this.tv_history_num.setTextColor(iE);
        this.tv_award_num.setTextColor(iE);
        this.tv_friend_desc.setTextColor(iE2);
        this.tv_follow_desc.setTextColor(iE2);
        this.tv_fan_desc.setTextColor(iE2);
        this.tv_history_desc.setTextColor(iE2);
        this.tv_favour_desc.setTextColor(iE2);
        this.v_login_mask.setVisibility(8);
        this.ctl.setContentScrimColor(iE3);
    }

    private void j6(String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 23560, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.bbs.n.V3(str, new i0(str, str2, str3)).show(getChildFragmentManager(), "ForbidReasonFragment");
    }

    private void k6(RecUsersResult recUsersResult) {
        if (PatchProxy.proxy(new Object[]{recUsersResult}, this, changeQuickRedirect, false, 23568, new Class[]{RecUsersResult.class}, Void.TYPE).isSupported || recUsersResult == null || recUsersResult.getRec_users() == null || recUsersResult.getRec_users().size() <= 0) {
            return;
        }
        int iF = ViewUtils.f(this.mContext, 18.0f);
        RecyclerView recyclerView = new RecyclerView(this.mContext);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, ViewUtils.f(this.mContext, 410.0f)));
        recyclerView.setLayoutManager(new GridLayoutManager(this.mContext, 3));
        recyclerView.addItemDecoration(new l0(iF));
        recyclerView.setAdapter(new s0(recUsersResult.getRec_users()));
        com.max.hbcommon.view.a aVar = this.f78125y;
        if (aVar != null && aVar.isShowing()) {
            this.f78125y.dismiss();
        }
        this.f78125y = new com.max.hbcommon.view.a.f(this.mContext).x(R.string.recommend_base_on_steam_friends).i(recyclerView).t(R.string.fast_follow, new m0(recUsersResult)).w(true).F();
    }

    private void l6(String str, String str2, String str3, String str4, boolean z10, boolean z11, boolean z12) {
        Object[] objArr = {str, str2, str3, str4, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 23522, new Class[]{String.class, String.class, String.class, String.class, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable(com.max.hbshare.d.f72592n, P5(z10, z11, z12));
        com.max.hbshare.d.E(this.mContext, new HBShareData(false, true, str, str2, str3, bundle, new UMImage(this.mContext, str4), null, null, null));
    }

    private PostOptionObj m5(String str, @androidx.annotation.v int i10, PostOptionObj.OnClickListener onClickListener) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Integer(i10), onClickListener}, this, changeQuickRedirect, false, 23524, new Class[]{String.class, Integer.TYPE, PostOptionObj.OnClickListener.class}, PostOptionObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostOptionObj) patchProxyResultProxy.result;
        }
        PostOptionObj postOptionObj = new PostOptionObj();
        postOptionObj.setImage_resource_id(i10);
        postOptionObj.setName(str);
        postOptionObj.setClick_listener(onClickListener);
        return postOptionObj;
    }

    static /* synthetic */ void n4(MehomefragmentV2 mehomefragmentV2, int i10) {
        if (PatchProxy.proxy(new Object[]{mehomefragmentV2, new Integer(i10)}, null, changeQuickRedirect, true, 23589, new Class[]{MehomefragmentV2.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        mehomefragmentV2.showErrorWithTopPadding(i10);
    }

    @SuppressLint({"AutoDispose"})
    private void n5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23559, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().f6(this.f78107g).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h0()));
    }

    @SuppressLint({"AutoDispose"})
    private void n6(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 23550, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().f(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new n()));
    }

    private void o6(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 23540, new Class[]{Bundle.class}, Void.TYPE).isSupported || bundle == null || !bundle.containsKey(C)) {
            return;
        }
        if (!bundle.getString(C, "").equals(lb.d.K1)) {
            com.max.heybox.hblog.g.x("[updateArgBundle] extras: " + bundle);
            return;
        }
        UserBBSInfoFragment userBBSInfoFragmentZ5 = z5();
        if (userBBSInfoFragmentZ5 != null) {
            userBBSInfoFragmentZ5.F5(bundle);
        } else {
            this.f78126z = bundle;
        }
    }

    static /* synthetic */ void p4(MehomefragmentV2 mehomefragmentV2) {
        if (PatchProxy.proxy(new Object[]{mehomefragmentV2}, null, changeQuickRedirect, true, 23590, new Class[]{MehomefragmentV2.class}, Void.TYPE).isSupported) {
            return;
        }
        mehomefragmentV2.showContentView();
    }

    @SuppressLint({"AutoDispose"})
    private void p5(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 23552, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().u1(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new p()));
    }

    private void p6(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 23554, new Class[]{String.class}, Void.TYPE).isSupported || this.f78113m) {
            return;
        }
        this.f78115o = str;
        if (com.max.hbcommon.utils.c.u(str) || !com.max.xiaoheihe.utils.i0.o().isLoginFlag()) {
            this.bottom_button.setVisibility(8);
            this.vp.setPadding(0, 0, 0, 0);
            return;
        }
        this.bottom_button.setVisibility(0);
        this.bottom_button.setElevation(10.0f);
        this.vp.setPadding(0, 0, 0, ViewUtils.f(this.mContext, 54.0f));
        if ("0".equals(str)) {
            this.bottom_button.setRightText("关注");
            this.bottom_button.setRightIcon(getResources().getDrawable(R.drawable.ic_0icon_action_add_16));
            this.bottom_button.setRightButtonStyle(BaseBottomButton.BaseBottomButtonStyle.BlackWhite);
            this.bottom_button.setRightClickListener(new q());
        } else if ("1".equals(str)) {
            this.bottom_button.setRightText("已关注");
            this.bottom_button.setRightIcon(getResources().getDrawable(R.drawable.ic_0icon_action_select_16));
            this.bottom_button.setRightButtonStyle(BaseBottomButton.BaseBottomButtonStyle.GrayGray);
            this.bottom_button.setRightClickListener(new r());
        } else if ("2".equals(str)) {
            this.bottom_button.setRightText("回关");
            this.bottom_button.setRightIcon(getResources().getDrawable(R.drawable.ic_0icon_action_interact_16));
            this.bottom_button.setRightButtonStyle(BaseBottomButton.BaseBottomButtonStyle.BlackWhite);
            this.bottom_button.setRightClickListener(new s());
        } else if ("3".equals(str)) {
            this.bottom_button.setRightText("互相关注");
            this.bottom_button.setRightIcon(getResources().getDrawable(R.drawable.ic_0icon_action_interact_16));
            this.bottom_button.setRightButtonStyle(BaseBottomButton.BaseBottomButtonStyle.GrayGray);
            this.bottom_button.setRightClickListener(new t());
        }
        this.bottom_button.setLeftClickListener(new u());
    }

    @SuppressLint({"AutoDispose"})
    private void q5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23556, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().R(this.f78107g, "-1").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d0()));
    }

    @SuppressLint({"AutoDispose"})
    private void r5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23558, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().J7(this.f78107g, null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f0()));
    }

    @SuppressLint({"AutoDispose"})
    private void s5(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7}, this, changeQuickRedirect, false, 23549, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().n6(str, str2, str3, str4, str5, str6, str7).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new m()));
    }

    @SuppressLint({"AutoDispose"})
    private void t5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23564, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().i5().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new j0()));
    }

    private int u5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23537, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String strP3 = MainActivity.p3(this.f78106f, 0);
        if ("data".equals(strP3)) {
            return w5(G);
        }
        if (MainActivity.f76158k4.equals(strP3)) {
            return w5(H);
        }
        return 0;
    }

    @SuppressLint({"AutoDispose"})
    private void v5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23567, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().e9("steam", 0, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new k0()));
    }

    static /* synthetic */ void w4(MehomefragmentV2 mehomefragmentV2, int i10) {
        if (PatchProxy.proxy(new Object[]{mehomefragmentV2, new Integer(i10)}, null, changeQuickRedirect, true, 23591, new Class[]{MehomefragmentV2.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        mehomefragmentV2.showErrorWithTopPadding(i10);
    }

    private int w5(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 23538, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (this.f78111k == null) {
            return 0;
        }
        for (int i10 = 0; i10 < this.f78111k.size(); i10++) {
            KeyDescObj keyDescObj = this.f78111k.get(i10);
            if (str != null && str.equals(keyDescObj.getKey())) {
                return i10;
            }
        }
        return 0;
    }

    static /* synthetic */ void x4(MehomefragmentV2 mehomefragmentV2) {
        if (PatchProxy.proxy(new Object[]{mehomefragmentV2}, null, changeQuickRedirect, true, 23592, new Class[]{MehomefragmentV2.class}, Void.TYPE).isSupported) {
            return;
        }
        mehomefragmentV2.showContentView();
    }

    private String[] x5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23548, new Class[0], String[].class);
        if (patchProxyResultProxy.isSupported) {
            return (String[]) patchProxyResultProxy.result;
        }
        String[] strArr = new String[this.f78111k.size()];
        for (int i10 = 0; i10 < this.f78111k.size(); i10++) {
            strArr[i10] = this.f78111k.get(i10).getTitle() + "";
        }
        return strArr;
    }

    @SuppressLint({"AutoDispose"})
    private void y5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23544, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().G0().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g()));
    }

    private UserBBSInfoFragment z5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23536, new Class[0], UserBBSInfoFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (UserBBSInfoFragment) patchProxyResultProxy.result;
        }
        UserBBSInfoFragment userBBSInfoFragment = null;
        for (Fragment fragment : this.f78110j) {
            if (fragment instanceof UserBBSInfoFragment) {
                userBBSInfoFragment = (UserBBSInfoFragment) fragment;
            }
        }
        return userBBSInfoFragment;
    }

    @Override // com.max.xiaoheihe.module.account.GameBindingFragment.n
    public void B1(String str) {
    }

    @SuppressLint({"AutoDispose"})
    public void B5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23543, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().i8(this.f78107g).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    @Override // com.max.xiaoheihe.module.account.GameBindingFragment.n
    public void C0(String str, Throwable th2) {
    }

    public void R5(AccountDetailObj accountDetailObj) {
        if (PatchProxy.proxy(new Object[]{accountDetailObj}, this, changeQuickRedirect, false, 23545, new Class[]{AccountDetailObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.vp.setBackgroundColor(getResources().getColor(R.color.transparent));
        this.f78120t = accountDetailObj;
        if (this.f78113m) {
            User userI = com.max.xiaoheihe.utils.i0.i();
            userI.setAccount_detail(accountDetailObj);
            com.max.xiaoheihe.utils.i0.z(userI);
        }
        g6(this.f78120t);
        b6(this.f78120t);
        if (com.max.hbcommon.utils.c.u(accountDetailObj.getForbid_info())) {
            this.tv_forbid_info.setVisibility(8);
        } else {
            this.tv_forbid_info.setVisibility(0);
            this.tv_forbid_info.setText(accountDetailObj.getForbid_info());
        }
        this.vg_bbs_info.setVisibility(0);
        if (this.f78110j.size() <= 0) {
            ArrayList arrayList = new ArrayList();
            KeyDescObj keyDescObj = new KeyDescObj();
            keyDescObj.setKey(H);
            keyDescObj.setTitle(getString(R.string.bbs_timeline));
            keyDescObj.setType("native");
            KeyDescObj keyDescObj2 = new KeyDescObj();
            keyDescObj2.setKey(G);
            keyDescObj2.setTitle(getString(R.string.data));
            keyDescObj2.setType("native");
            if (this.f78119s) {
                arrayList.add(keyDescObj2);
                arrayList.add(keyDescObj);
            } else {
                arrayList.add(keyDescObj);
                arrayList.add(keyDescObj2);
            }
            S5(arrayList);
        }
    }

    public void c6() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23525, new Class[0], Void.TYPE).isSupported && isActive()) {
            A5();
        }
    }

    public void d6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23561, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        A5();
        for (Fragment fragment : this.f78110j) {
            if (fragment instanceof UserBBSInfoFragment) {
                ((UserBBSInfoFragment) fragment).x5();
            }
        }
    }

    @Override // com.max.xiaoheihe.module.account.GameBindingFragment.n
    public boolean g2(String str, View view, EditText editText) {
        return false;
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @androidx.annotation.p0
    public String getPagePath() {
        if (this.f78119s) {
            return lb.d.f131262u1;
        }
        return null;
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23521, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.fragment_me_home_v2);
        this.mUnBinder = ButterKnife.f(this, view);
        if (getArguments() != null) {
            this.f78107g = getArguments().getString("heyboxId");
            String string = getArguments().getString("steamId");
            this.f78108h = string;
            String str = this.f78107g;
            if (str == null) {
                str = "-1";
            }
            this.f78107g = str;
            if (string == null) {
                string = "-1";
            }
            this.f78108h = string;
            this.f78106f = getArguments().getStringArray("pages");
            this.f78123w = getArguments().getString(MainActivity.C4);
            this.f78124x = getArguments().getInt("page_index", 0);
            this.A = getArguments().getBoolean(com.max.xiaoheihe.module.account.q0.f79173f);
        }
        this.f78113m = com.max.xiaoheihe.module.account.utils.c.c(this.f78107g) != 2;
        this.f78114n = com.max.xiaoheihe.module.account.utils.c.c(this.f78107g) == 0;
        this.mToolbar.setBackgroundColor(com.max.xiaoheihe.utils.d.E(R.color.transparent));
        this.tb_home.getVg_title_root().setBackgroundColor(com.max.xiaoheihe.utils.d.E(R.color.transparent));
        SlidingTabLayout titleTabLayout = this.mToolbar.getTitleTabLayout();
        this.f78103c = titleTabLayout;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) titleTabLayout.getLayoutParams();
        layoutParams.width = -2;
        layoutParams.gravity = 17;
        this.f78103c.setTabSpaceEqual(false);
        this.f78103c.setTabPadding(25.0f);
        this.f78103c.setLayoutParams(layoutParams);
        this.f78102b = this.tb_home.getTl_home();
        ViewGroup.LayoutParams layoutParams2 = this.mVgLogin.getLayoutParams();
        int iM = com.max.hbutils.utils.t.m(this.mContext) + ViewUtils.f(this.mContext, 184.0f);
        if (layoutParams2.height != iM) {
            layoutParams2.height = iM;
            this.mVgLogin.setLayoutParams(layoutParams2);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mToolbar.getLayoutParams();
        marginLayoutParams.topMargin = com.max.hbutils.utils.t.m(this.mContext);
        this.mToolbar.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.tb_home.getLayoutParams();
        marginLayoutParams2.topMargin = com.max.hbutils.utils.t.m(this.mContext);
        this.tb_home.setLayoutParams(marginLayoutParams2);
        View viewInflate = this.mInflater.inflate(R.layout.layout_platforms_card_v2, this.vg_platform_card, false);
        CardView cardView = (CardView) viewInflate.findViewById(R.id.vg_container);
        if (cardView != null) {
            Activity activity = this.mContext;
            cardView.setRadius(ViewUtils.n(activity, ViewUtils.L(activity), ViewUtils.f(this.mContext, 150.0f), ViewUtils.ViewType.IMAGE));
        }
        this.vg_platform_card.removeAllViews();
        this.vg_platform_card.addView(viewInflate);
        this.f78104d = (ViewGroup) viewInflate.findViewById(R.id.vg_platforms_container);
        if (getActivity() instanceof MainActivity) {
            this.f78119s = true;
            this.tb_home.getIv_home_search().setImageResource(R.drawable.common_set);
            this.tb_home.getIv_home_scan().setVisibility(0);
            this.tb_home.getIv_home_scan().setOnClickListener(new k());
            this.tb_home.getIv_home_search().setOnClickListener(new v());
            this.tb_home.getIv_home_msg().setOnClickListener(new g0());
            f6();
            this.ctl.removeView(this.mToolbar);
        } else {
            this.ctl.removeView(this.tb_home);
            this.mToolbar.a0();
            this.mToolbar.getAppbarActionButtonView().setVisibility(8);
            this.mToolbar.setNavigationOnClickListener(new n0());
            boolean z10 = com.max.xiaoheihe.utils.i0.o().getPermission() != null && "1".equals(com.max.xiaoheihe.utils.i0.o().getPermission().getBbs_basic_permission());
            boolean z11 = com.max.xiaoheihe.utils.i0.o().getPermission() != null && "1".equals(com.max.xiaoheihe.utils.i0.o().getPermission().getBbs_super_permission());
            boolean z12 = com.max.xiaoheihe.utils.i0.o().getPermission() != null && "1".equals(com.max.xiaoheihe.utils.i0.o().getPermission().getBbs_root_permission());
            this.mToolbar.setActionIcon(R.drawable.common_more);
            this.mToolbar.setActionIconOnClickListener(new o0(z10, z11, z12));
            if (!ad.a.a(ad.a.D, false)) {
                this.mToolbar.setActionXIcon(R.drawable.common_search);
                ImageView appbarActionButtonXView = this.mToolbar.getAppbarActionButtonXView();
                if (appbarActionButtonXView != null) {
                    appbarActionButtonXView.setColorFilter(this.mContext.getColor(R.color.brand_color));
                }
                this.mToolbar.setActionXIconOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.account.a0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f78718b.D5(view2);
                    }
                });
            }
        }
        this.mVgLogin.setOnClickListener(new p0());
        this.f78110j.clear();
        C5();
        this.f78103c.setSaveEnabled(false);
        if (MMKV.mmkvWithID("improve_ab_test").decodeInt(ad.a.f1195b) > 4) {
            final AppBarLayout.f fVar = new AppBarLayout.f() { // from class: com.max.xiaoheihe.module.account.b0
                @Override // com.google.android.material.appbar.AppBarLayout.f, com.google.android.material.appbar.AppBarLayout.b
                public final void a(AppBarLayout appBarLayout, int i10) {
                    this.f78813a.E5(appBarLayout, i10);
                }
            };
            getLifecycle().a(new androidx.lifecycle.j() { // from class: com.max.xiaoheihe.module.account.MehomefragmentV2.7
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // androidx.lifecycle.j
                public /* synthetic */ void j(androidx.lifecycle.y yVar) {
                    androidx.lifecycle.i.d(this, yVar);
                }

                @Override // androidx.lifecycle.j
                public /* synthetic */ void l(androidx.lifecycle.y yVar) {
                    androidx.lifecycle.i.c(this, yVar);
                }

                @Override // androidx.lifecycle.j
                public void onDestroy(@androidx.annotation.n0 androidx.lifecycle.y yVar) {
                    if (PatchProxy.proxy(new Object[]{yVar}, this, changeQuickRedirect, false, 23677, new Class[]{androidx.lifecycle.y.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    AppBarLayout appBarLayout = MehomefragmentV2.this.mAppBarLayout;
                    if (appBarLayout != null) {
                        appBarLayout.z(fVar);
                    }
                    MehomefragmentV2.this.getLifecycle().d(this);
                }

                @Override // androidx.lifecycle.j
                public /* synthetic */ void onStart(androidx.lifecycle.y yVar) {
                    androidx.lifecycle.i.e(this, yVar);
                }

                @Override // androidx.lifecycle.j
                public /* synthetic */ void onStop(androidx.lifecycle.y yVar) {
                    androidx.lifecycle.i.f(this, yVar);
                }

                @Override // androidx.lifecycle.j
                public void q(@androidx.annotation.n0 androidx.lifecycle.y yVar) {
                    AppBarLayout appBarLayout;
                    if (PatchProxy.proxy(new Object[]{yVar}, this, changeQuickRedirect, false, 23676, new Class[]{androidx.lifecycle.y.class}, Void.TYPE).isSupported || (appBarLayout = MehomefragmentV2.this.mAppBarLayout) == null) {
                        return;
                    }
                    appBarLayout.e(fVar);
                }
            });
        } else {
            AppBarLayout appBarLayout = this.mAppBarLayout;
            if (appBarLayout != null) {
                appBarLayout.e(new q0());
            }
        }
        this.tv_history_desc.setText("历史浏览");
        this.ll_friends.setVisibility(this.f78113m ? 0 : 8);
        this.vg_bbs_info.setVisibility(4);
        if ((TextUtils.isEmpty(this.f78107g) || "-1".equals(this.f78107g)) ? false : true) {
            new OneTimeValidExposureViewWatcher(this, this.vp);
        } else {
            new OneTimeValidExposureViewWatcher(this, this.f78104d);
        }
        if (this.A) {
            showLoading();
        } else {
            A5();
        }
    }

    @Override // com.max.xiaoheihe.module.account.GameBindingFragment.n
    public /* synthetic */ void m1(String str) {
        com.max.xiaoheihe.module.account.e.b(this, str);
    }

    public void m6() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23553, new Class[0], Void.TYPE).isSupported && (getContext() instanceof Activity)) {
            com.max.xiaoheihe.utils.d.W0(getContext());
        }
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    public boolean o3() {
        return !this.f78119s;
    }

    public void o5(String[] strArr, Intent intent) {
        ViewPager viewPager;
        if (PatchProxy.proxy(new Object[]{strArr, intent}, this, changeQuickRedirect, false, 23539, new Class[]{String[].class, Intent.class}, Void.TYPE).isSupported || (viewPager = this.vp) == null) {
            return;
        }
        this.f78106f = strArr;
        viewPager.setCurrentItem(u5());
        if (intent != null) {
            o6(intent.getExtras());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 23563, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i10 == 291) {
            for (Fragment fragment : this.f78110j) {
                if (fragment instanceof MeHomeFragmentx) {
                    ((MeHomeFragmentx) fragment).onRefresh();
                }
            }
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23569, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f78112l = null;
        super.onDestroy();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23562, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        A5();
    }

    @Override // com.max.hbcommon.base.d
    public void onRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23535, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRegisterReceiver();
        k kVar = null;
        NewMsgBroadcastReceiver newMsgBroadcastReceiver = new NewMsgBroadcastReceiver(this, kVar);
        this.f78116p = newMsgBroadcastReceiver;
        registerReceiver(newMsgBroadcastReceiver, lb.a.f131025q);
        UserProfileUpdatedBroadcastReceiver userProfileUpdatedBroadcastReceiver = new UserProfileUpdatedBroadcastReceiver(this, kVar);
        this.f78117q = userProfileUpdatedBroadcastReceiver;
        registerReceiver(userProfileUpdatedBroadcastReceiver, lb.a.f131055v);
        registerReceiver(this.f78117q, lb.a.f130960f0);
        registerReceiver(this.f78117q, lb.a.f131061w);
        AchieveBadgeUpdatedBroadcastReceiver achieveBadgeUpdatedBroadcastReceiver = new AchieveBadgeUpdatedBroadcastReceiver(this, kVar);
        this.f78118r = achieveBadgeUpdatedBroadcastReceiver;
        registerReceiver(achieveBadgeUpdatedBroadcastReceiver, lb.a.f131079z);
    }

    @Override // com.max.hbcommon.base.d
    public void onUnRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23541, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onUnRegisterReceiver();
        unregisterReceiver(this.f78116p);
        unregisterReceiver(this.f78117q);
        unregisterReceiver(this.f78118r);
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
