package com.max.xiaoheihe.module.account;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.base.adapter.OneTimeValidExposureViewWatcher;
import com.max.hbcommon.bean.FiltersObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbcommon.component.SearchView;
import com.max.hbcommon.component.bubble.BubbleTipPopup;
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.hbcustomview.viewpager2.widget.HBViewPager2;
import com.max.hbminiprogram.bean.MiniProgramObj;
import com.max.hbminiprogram.component.MiniProgramView;
import com.max.hbmmkv.MMKVManager;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.Resultx;
import com.max.xiaoheihe.bean.SteamNativeListObj;
import com.max.xiaoheihe.bean.account.FollowingListObj;
import com.max.xiaoheihe.bean.account.FriendRankResultObj;
import com.max.xiaoheihe.bean.account.HomeDataObj;
import com.max.xiaoheihe.bean.account.ImageConfigObj;
import com.max.xiaoheihe.bean.account.MyGameListObj;
import com.max.xiaoheihe.bean.account.PlatformBindStatus;
import com.max.xiaoheihe.bean.account.PlayerRankObj;
import com.max.xiaoheihe.bean.account.SteamNativeObj;
import com.max.xiaoheihe.bean.account.UpdateObj;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.bean.account.steaminfo.BindTaskInfoObj;
import com.max.xiaoheihe.bean.account.steaminfo.DialogMsgObj;
import com.max.xiaoheihe.bean.game.BindGameCardV2;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.dota2.Dota2MatchListObj;
import com.max.xiaoheihe.bean.game.dota2.Dota2TeammateListObj;
import com.max.xiaoheihe.bean.game.gameoverview.Dota2UserObj;
import com.max.xiaoheihe.bean.game.gameoverview.MatchObj;
import com.max.xiaoheihe.bean.game.xbox.XboxPresenceInfo;
import com.max.xiaoheihe.module.account.component.GamePlatformsCardContainer;
import com.max.xiaoheihe.module.account.utils.HBSteamInfoUtilsKt;
import com.max.xiaoheihe.module.game.component.GameItemView;
import com.max.xiaoheihe.module.game.component.GameTimeAchieveItemView;
import com.max.xiaoheihe.module.game.component.dota2.Dota2FollowMatchItemView;
import com.max.xiaoheihe.module.game.component.dota2.Dota2FollowUserItemView;
import com.max.xiaoheihe.module.game.dota2.ImageCacheManager;
import com.max.xiaoheihe.module.game.r1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.starlightc.ucropplus.util.ModuleUtil;
import com.xiaomi.mipush.sdk.Constants;
import df.da;
import df.s00;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class MeHomeFragmentx extends com.max.hbcommon.base.d implements GameBindingFragment.n, com.max.xiaoheihe.module.account.mine.k {
    private static final int J3 = 5;
    private static final int K3 = 291;
    private static final String L3 = "hey_box_id";
    private static final String M3 = "steam_id";
    private static final String N3 = "home_data";
    private static final String O3 = "list_owned";
    private static final String P3 = "list_followed";
    private static final String Q3 = "list_prefect";
    private static final String R3 = "list_comment";
    public static final String S3 = "match";
    public static final String T3 = "user";
    private static final int U3 = 5;
    private static final int V3 = 6;
    private static final int W3 = 7;
    private static final int X3 = 0;
    public static final int Y3 = 2;
    public static boolean Z3 = false;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    public static int f77985a4;
    public static ChangeQuickRedirect changeQuickRedirect;
    private com.max.hbcommon.base.adapter.t C;
    private r0 D;
    private com.max.hbcommon.base.adapter.s<MatchObj> E;
    private com.max.hbcommon.base.adapter.s<Dota2UserObj> F;
    private com.max.hbcommon.base.adapter.s<MiniProgramObj> G;
    private com.max.xiaoheihe.module.account.mine.c G3;
    private com.max.hbcustomview.bannerview.d<List<MiniProgramObj>> H;
    private BannerViewPager<List<MiniProgramObj>> M;
    private int O;
    private List<KeyDescObj> Q;
    private String R;
    private LinearLayout S;
    private View T;
    private View U;
    private SearchView V;
    private int W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private String f77986a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private da f77987b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private String f77988b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SmartRefreshLayout f77989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RecyclerView f77991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ConsecutiveScrollerLayout f77992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ImageView f77993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private GamePlatformsCardContainer f77994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ViewGroup f77995h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ViewGroup f77996i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SegmentFilterView f77997j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View f77998k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f77999l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f78000m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private HomeDataObj f78001n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private SteamNativeObj f78007q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private UserProfileUpdatedBroadcastReceiver f78010t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private UserBindGameCardTypeBroadcastReceiver f78011u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f78012v;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private com.max.xiaoheihe.module.game.adapter.v f78018y1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f78020z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f78002o = "-1";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f78003p = "-1";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    List<PlayerRankObj> f78008r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    List<PlayerRankObj> f78009s = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f78013w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f78014x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f78017y = true;
    private String A = "match";
    private String B = GameObj.PLATFORM_STEAM;
    private List<GameObj> I = new ArrayList();
    private List<MatchObj> J = new ArrayList();
    private List<Dota2UserObj> K = new ArrayList();
    private List<List<MiniProgramObj>> L = new ArrayList();
    private Map<String, List<GameObj>> N = new HashMap();
    private String P = "";
    private Map<String, String> X = new HashMap();
    private List<KeyDescObj> Y = new ArrayList();
    private Map<String, List<KeyDescObj>> Z = new HashMap();

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f77990c0 = true;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private Map<String, FollowingListObj> f78004p1 = new HashMap();

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private Map<String, String> f78015x1 = new HashMap();

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private BubbleTipPopup f78005p2 = null;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private BubbleTipPopup f78016x2 = null;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private com.max.hbcommon.component.curtain.c f78019y2 = null;
    private String G2 = "";

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private String f78006p3 = "";

    public class UserBindGameCardTypeBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private UserBindGameCardTypeBroadcastReceiver() {
        }

        /* synthetic */ UserBindGameCardTypeBroadcastReceiver(MeHomeFragmentx meHomeFragmentx, a aVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 23518, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported && lb.a.P.equals(intent.getAction())) {
                MeHomeFragmentx.this.U6();
            }
        }
    }

    public class UserProfileUpdatedBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private UserProfileUpdatedBroadcastReceiver() {
        }

        /* synthetic */ UserProfileUpdatedBroadcastReceiver(MeHomeFragmentx meHomeFragmentx, a aVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 23519, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
                return;
            }
            String action = intent.getAction();
            if (lb.a.f131055v.equals(action) || lb.a.X.equals(action)) {
                MeHomeFragmentx.this.a6();
            }
        }
    }

    public class a extends com.max.hbcommon.base.adapter.s<MatchObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.MeHomeFragmentx$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0637a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MatchObj f78024b;

            ViewOnClickListenerC0637a(MatchObj matchObj) {
                this.f78024b = matchObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23407, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.base.router.b.s0(((com.max.hbcommon.base.d) MeHomeFragmentx.this).mContext, this.f78024b.getMatch_id(), MeHomeFragmentx.this.f78002o, MeHomeFragmentx.this.f78001n.getDota2_platform_info() != null ? MeHomeFragmentx.this.f78001n.getDota2_platform_info().getSteam_id() : null);
            }
        }

        a(Context context, List list, int i10) {
            super(context, list, i10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i10) {
            return -1;
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, MatchObj matchObj) {
            if (PatchProxy.proxy(new Object[]{eVar, matchObj}, this, changeQuickRedirect, false, 23405, new Class[]{com.max.hbcommon.base.adapter.s.e.class, MatchObj.class}, Void.TYPE).isSupported) {
                return;
            }
            Dota2FollowMatchItemView dota2FollowMatchItemView = (Dota2FollowMatchItemView) eVar.i(R.id.v_match);
            dota2FollowMatchItemView.setMatch(matchObj);
            dota2FollowMatchItemView.setLightStyle();
            dota2FollowMatchItemView.setOnClickListener(new ViewOnClickListenerC0637a(matchObj));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, MatchObj matchObj) {
            if (PatchProxy.proxy(new Object[]{eVar, matchObj}, this, changeQuickRedirect, false, 23406, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, matchObj);
        }
    }

    public class a0 implements TextView.OnEditorActionListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EditText f78026b;

        a0(EditText editText) {
            this.f78026b = editText;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{textView, new Integer(i10), keyEvent}, this, changeQuickRedirect, false, 23475, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (i10 == 3) {
                com.max.xiaoheihe.utils.d.E0(((com.max.hbcommon.base.d) MeHomeFragmentx.this).mContext, this.f78026b);
                String string = this.f78026b.getText().toString();
                if (!com.max.hbcommon.utils.c.u(string)) {
                    MeHomeFragmentx.this.O = 0;
                    MeHomeFragmentx.this.f77988b0 = string;
                    com.max.xiaoheihe.utils.d.E0(((com.max.hbcommon.base.d) MeHomeFragmentx.this).mContext, this.f78026b);
                    MeHomeFragmentx.P3(MeHomeFragmentx.this);
                    return true;
                }
            }
            return false;
        }
    }

    public class b extends com.max.hbcommon.network.d<Result<HomeDataObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23408, new Class[]{Throwable.class}, Void.TYPE).isSupported && MeHomeFragmentx.this.isActive()) {
                super.onError(th2);
                MeHomeFragmentx.Z3(MeHomeFragmentx.this);
            }
        }

        public void onNext(Result<HomeDataObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23409, new Class[]{Result.class}, Void.TYPE).isSupported && MeHomeFragmentx.this.isActive()) {
                r1.f88212a.clear();
                com.max.hbcache.b.h(MeHomeFragmentx.a4(MeHomeFragmentx.this), result.getResult());
                MeHomeFragmentx.this.L6(result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23410, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<HomeDataObj>) obj);
        }
    }

    public class b0 extends com.max.hbcommon.network.d<Result<XboxPresenceInfo>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f78029b;

        b0(TextView textView) {
            this.f78029b = textView;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23477, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f78029b.setVisibility(8);
        }

        public void onNext(Result<XboxPresenceInfo> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23476, new Class[]{Result.class}, Void.TYPE).isSupported || result.getResult() == null) {
                return;
            }
            this.f78029b.setVisibility(0);
            if ("1".equals(result.getResult().getOnline_state()) || "2".equals(result.getResult().getOnline_state())) {
                this.f78029b.setTextColor(MeHomeFragmentx.this.getResources().getColor(R.color.user_level_2_start));
            } else {
                this.f78029b.setTextColor(MeHomeFragmentx.this.getResources().getColor(R.color.white_alpha50));
            }
            this.f78029b.setText(result.getResult().getPresence_state_desc());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23478, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<XboxPresenceInfo>) obj);
        }
    }

    public class c implements SegmentFilterView.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.component.segmentfilters.SegmentFilterView.a
        public void a(@androidx.annotation.n0 KeyDescObj keyDescObj, int i10) {
            if (PatchProxy.proxy(new Object[]{keyDescObj, new Integer(i10)}, this, changeQuickRedirect, false, 23411, new Class[]{KeyDescObj.class, Integer.TYPE}, Void.TYPE).isSupported || MeHomeFragmentx.this.A.equals(keyDescObj.getKey())) {
                return;
            }
            MeHomeFragmentx.this.A = keyDescObj.getKey();
            MeHomeFragmentx.d4(MeHomeFragmentx.this);
            MeHomeFragmentx.e4(MeHomeFragmentx.this);
            MeHomeFragmentx.P3(MeHomeFragmentx.this);
        }
    }

    public class c0 extends com.max.hbcommon.network.d<Result<FriendRankResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f78032b;

        c0(boolean z10) {
            this.f78032b = z10;
        }

        public void onNext(Result<FriendRankResultObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23479, new Class[]{Result.class}, Void.TYPE).isSupported && MeHomeFragmentx.this.isActive()) {
                MeHomeFragmentx.this.f78008r.clear();
                MeHomeFragmentx.this.f78009s.clear();
                if (com.max.hbcommon.utils.c.o(result.getResult().getFriends()) > 0) {
                    MeHomeFragmentx.this.f78008r.addAll(result.getResult().getFriends());
                }
                if (com.max.hbcommon.utils.c.o(MeHomeFragmentx.this.f78008r) > 0) {
                    for (int i10 = 0; i10 < Math.min(12, com.max.hbcommon.utils.c.o(MeHomeFragmentx.this.f78008r)); i10++) {
                        MeHomeFragmentx meHomeFragmentx = MeHomeFragmentx.this;
                        meHomeFragmentx.f78009s.add(meHomeFragmentx.f78008r.get(i10));
                    }
                }
                MeHomeFragmentx.H5(MeHomeFragmentx.this, true);
                if (com.max.hbcommon.utils.c.o(result.getResult().getSummary_url()) > 0) {
                    List<String> summary_url = result.getResult().getSummary_url();
                    if (com.max.hbcommon.utils.c.w(summary_url)) {
                        return;
                    }
                    Iterator<String> it = summary_url.iterator();
                    while (it.hasNext()) {
                        MeHomeFragmentx.I5(MeHomeFragmentx.this, it.next(), this.f78032b);
                    }
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23480, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<FriendRankResultObj>) obj);
        }
    }

    public class d extends com.max.hbcommon.network.d<List<GameObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f78034b;

        d(String str) {
            this.f78034b = str;
        }

        public void a(List<GameObj> list) {
            if (!PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 23414, new Class[]{List.class}, Void.TYPE).isSupported && MeHomeFragmentx.this.isActive()) {
                com.max.hbcommon.utils.d.b("zzzzcache", "game cache valid");
                MeHomeFragmentx.g4(MeHomeFragmentx.this, list, this.f78034b, true);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23413, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            MeHomeFragmentx.f4(MeHomeFragmentx.this);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23412, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b("zzzzcache", "game cache error");
            MeHomeFragmentx.f4(MeHomeFragmentx.this);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23415, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((List) obj);
        }
    }

    public class d0 extends com.max.hbcommon.network.d<Resultx<SteamNativeListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f78036b;

        d0(Fragment fragment) {
            this.f78036b = fragment;
        }

        public void a(Resultx<SteamNativeListObj> resultx) {
            if (PatchProxy.proxy(new Object[]{resultx}, this, changeQuickRedirect, false, 23483, new Class[]{Resultx.class}, Void.TYPE).isSupported || !MeHomeFragmentx.this.isActive() || resultx == null || resultx.getResponse() == null || resultx.getResponse().getPlayers() == null) {
                return;
            }
            List<SteamNativeObj> players = resultx.getResponse().getPlayers();
            StringBuilder sb2 = new StringBuilder("");
            for (SteamNativeObj steamNativeObj : players) {
                if (!com.max.hbcommon.utils.c.u(steamNativeObj.getSteamid()) && com.max.hbcommon.utils.c.C(steamNativeObj.getSteamid(), MeHomeFragmentx.this.f78003p)) {
                    MeHomeFragmentx.this.f78007q = steamNativeObj;
                }
                String gameid = steamNativeObj.getGameid();
                if (!com.max.hbcommon.utils.c.u(gameid) && com.max.xiaoheihe.module.account.utils.g.f79313a.d(gameid)) {
                    if (sb2.length() > 0) {
                        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                    sb2.append(gameid);
                }
            }
            if (sb2.length() > 0) {
                HBSteamInfoUtilsKt.j(sb2.toString(), null, this.f78036b);
            }
            com.max.xiaoheihe.module.account.utils.l.U(players, MeHomeFragmentx.this.f78008r, 0);
            com.max.xiaoheihe.module.account.utils.l.e0(MeHomeFragmentx.this.f78008r);
            MeHomeFragmentx.this.f78009s.clear();
            for (int i10 = 0; i10 < Math.min(12, com.max.hbcommon.utils.c.o(MeHomeFragmentx.this.f78008r)); i10++) {
                MeHomeFragmentx meHomeFragmentx = MeHomeFragmentx.this;
                meHomeFragmentx.f78009s.add(meHomeFragmentx.f78008r.get(i10));
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23481, new Class[0], Void.TYPE).isSupported && MeHomeFragmentx.this.isActive()) {
                super.onComplete();
                MeHomeFragmentx.H5(MeHomeFragmentx.this, true);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23482, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
            com.max.heybox.hblog.g.G("MeHomeFragmentx, mSteamId = " + MeHomeFragmentx.this.f78003p + ", " + th2);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23484, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((Resultx) obj);
        }
    }

    public class e implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23416, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            MeHomeFragmentx.h4(MeHomeFragmentx.this);
            View viewInflate = MeHomeFragmentx.this.getLayoutInflater().inflate(R.layout.item_empty_content, (ViewGroup) MeHomeFragmentx.this.f77991d, false);
            ((TextView) viewInflate.findViewById(R.id.tv_empty_status)).setText(r1.N0(MeHomeFragmentx.this.B) ? R.string.empty_content : R.string.have_no_game_temporarily);
            MeHomeFragmentx.this.C.m(R.layout.item_empty_content, viewInflate);
            MeHomeFragmentx.this.C.notifyDataSetChanged();
        }
    }

    public class e0 extends com.max.hbcommon.network.d<Result<UpdateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e0() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23485, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
            MeHomeFragmentx.this.f78013w = true;
        }

        public void onNext(Result<UpdateObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23486, new Class[]{Result.class}, Void.TYPE).isSupported && MeHomeFragmentx.this.isActive()) {
                UpdateObj result2 = result.getResult();
                if (result2 == null) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.update_fail));
                    return;
                }
                String state = result2.getState();
                if (state == null) {
                    state = "";
                }
                switch (state) {
                    case "failed":
                        MeHomeFragmentx.this.f78013w = true;
                        com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.update_fail));
                        break;
                    case "ok":
                        MeHomeFragmentx.this.a6();
                        MeHomeFragmentx.this.f78013w = true;
                        break;
                    case "waiting":
                    case "updating":
                        com.max.hbutils.utils.c cVar3 = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.f("正在更新");
                        MeHomeFragmentx.N5(MeHomeFragmentx.this, 1);
                        break;
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23487, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<UpdateObj>) obj);
        }
    }

    public class f implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23417, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            MeHomeFragmentx.this.I.clear();
            if (!MeHomeFragmentx.P3.equals(MeHomeFragmentx.this.f78020z) && com.max.hbcommon.utils.c.u(MeHomeFragmentx.this.f77988b0)) {
                MeHomeFragmentx.q4(MeHomeFragmentx.this);
            }
            MeHomeFragmentx.h4(MeHomeFragmentx.this);
            View viewInflate = ((com.max.hbcommon.base.d) MeHomeFragmentx.this).mInflater.inflate(R.layout.loading_view, (ViewGroup) MeHomeFragmentx.this.f77991d, false);
            viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, ViewUtils.f(((com.max.hbcommon.base.d) MeHomeFragmentx.this).mContext, 182)));
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) viewInflate.findViewById(R.id.img_progress);
            if (circularProgressIndicator != null) {
                circularProgressIndicator.p();
            }
            MeHomeFragmentx.this.C.m(R.layout.loading_view, viewInflate);
            MeHomeFragmentx.this.C.notifyDataSetChanged();
        }
    }

    public class f0 extends com.max.hbcommon.network.d<Result<UpdateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f78041b;

        f0(int i10) {
            this.f78041b = i10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23488, new Class[]{Throwable.class}, Void.TYPE).isSupported && MeHomeFragmentx.this.isActive()) {
                super.onError(th2);
                MeHomeFragmentx.this.f78013w = true;
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.update_fail));
            }
        }

        public void onNext(Result<UpdateObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23489, new Class[]{Result.class}, Void.TYPE).isSupported && MeHomeFragmentx.this.isActive()) {
                UpdateObj result2 = result.getResult();
                if (result2 == null) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.update_fail));
                    MeHomeFragmentx.this.f78013w = true;
                    return;
                }
                String state = result2.getState();
                if (state == null) {
                    state = "";
                }
                switch (state) {
                    case "failed":
                        com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.update_fail));
                        MeHomeFragmentx.this.f78013w = true;
                        break;
                    case "ok":
                        MeHomeFragmentx.this.a6();
                        MeHomeFragmentx.this.f78013w = true;
                        break;
                    case "waiting":
                    case "updating":
                        int i10 = this.f78041b;
                        if (i10 < 5) {
                            MeHomeFragmentx.N5(MeHomeFragmentx.this, i10 + 1);
                            break;
                        }
                        break;
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23490, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<UpdateObj>) obj);
        }
    }

    public class g implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23419, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                MeHomeFragmentx.e4(MeHomeFragmentx.this);
                MeHomeFragmentx.P3(MeHomeFragmentx.this);
            }
        }

        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23418, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            MeHomeFragmentx.h4(MeHomeFragmentx.this);
            View viewInflate = ((com.max.hbcommon.base.d) MeHomeFragmentx.this).mInflater.inflate(R.layout.item_error_content, (ViewGroup) MeHomeFragmentx.this.f77991d, false);
            viewInflate.setOnClickListener(new a());
            MeHomeFragmentx.this.C.m(R.layout.item_error_content, viewInflate);
            MeHomeFragmentx.this.C.notifyDataSetChanged();
        }
    }

    public class g0 implements com.max.xiaoheihe.view.m {
        public static ChangeQuickRedirect changeQuickRedirect;

        g0() {
        }

        @Override // com.max.xiaoheihe.view.m
        public void a(Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 23492, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            dialog.dismiss();
        }

        @Override // com.max.xiaoheihe.view.m
        public void b(Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 23491, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            dialog.dismiss();
        }
    }

    public class h extends com.max.hbcommon.network.d<Result<MyGameListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f78046b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f78047c;

        h(String str, String str2) {
            this.f78046b = str;
            this.f78047c = str2;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23420, new Class[0], Void.TYPE).isSupported && MeHomeFragmentx.u4(MeHomeFragmentx.this, this.f78046b) && MeHomeFragmentx.this.isActive()) {
                super.onComplete();
                MeHomeFragmentx.v4(MeHomeFragmentx.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23421, new Class[]{Throwable.class}, Void.TYPE).isSupported && MeHomeFragmentx.u4(MeHomeFragmentx.this, this.f78046b) && MeHomeFragmentx.this.isActive()) {
                super.onError(th2);
                MeHomeFragmentx.v4(MeHomeFragmentx.this);
                if (MeHomeFragmentx.this.O == 0) {
                    MeHomeFragmentx.w4(MeHomeFragmentx.this);
                }
            }
        }

        public void onNext(Result<MyGameListObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23422, new Class[]{Result.class}, Void.TYPE).isSupported && MeHomeFragmentx.u4(MeHomeFragmentx.this, this.f78046b) && MeHomeFragmentx.this.isActive() && result.getResult() != null) {
                super.onNext(result);
                if (MeHomeFragmentx.this.O == 0) {
                    MeHomeFragmentx.x4(MeHomeFragmentx.this, result.getResult());
                }
                if (!com.max.hbcommon.utils.c.u(result.getResult().getNot_in_db_desc())) {
                    GameTimeAchieveItemView.f86832z.b(result.getResult().getNot_in_db_desc());
                }
                List<GameObj> game_list = result.getResult().getGame_list();
                com.max.hbcache.b.k(MeHomeFragmentx.y4(MeHomeFragmentx.this), game_list);
                String string = MeHomeFragmentx.this.B + MeHomeFragmentx.this.f78020z + "";
                String str = (String) MeHomeFragmentx.this.X.get(string);
                MeHomeFragmentx meHomeFragmentx = MeHomeFragmentx.this;
                if (this.f78047c.equals(string)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(string);
                    sb2.append(str != null ? str : "");
                    string = sb2.toString();
                }
                MeHomeFragmentx.g4(meHomeFragmentx, game_list, string, true);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23423, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MyGameListObj>) obj);
        }
    }

    public class h0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 23494, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.account.utils.l.D(MeHomeFragmentx.this.getCompositeDisposable(), ((com.max.hbcommon.base.d) MeHomeFragmentx.this).mContext, false, true, 291);
            dialogInterface.dismiss();
        }
    }

    public class i extends com.max.hbcommon.network.d<Result<MyGameListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f78050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f78051c;

        i(String str, String str2) {
            this.f78050b = str;
            this.f78051c = str2;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23424, new Class[0], Void.TYPE).isSupported && MeHomeFragmentx.B4(MeHomeFragmentx.this, this.f78050b) && MeHomeFragmentx.this.isActive()) {
                super.onComplete();
                MeHomeFragmentx.v4(MeHomeFragmentx.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23425, new Class[]{Throwable.class}, Void.TYPE).isSupported && MeHomeFragmentx.B4(MeHomeFragmentx.this, this.f78050b) && MeHomeFragmentx.this.isActive()) {
                super.onError(th2);
                MeHomeFragmentx.v4(MeHomeFragmentx.this);
                if (MeHomeFragmentx.this.O == 0) {
                    MeHomeFragmentx.w4(MeHomeFragmentx.this);
                }
            }
        }

        public void onNext(Result<MyGameListObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23426, new Class[]{Result.class}, Void.TYPE).isSupported && MeHomeFragmentx.B4(MeHomeFragmentx.this, this.f78050b) && MeHomeFragmentx.this.isActive() && result.getResult() != null) {
                super.onNext(result);
                if (MeHomeFragmentx.this.O == 0) {
                    MeHomeFragmentx.x4(MeHomeFragmentx.this, result.getResult());
                }
                MeHomeFragmentx.g4(MeHomeFragmentx.this, result.getResult().getGame_list(), this.f78051c, true);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23427, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MyGameListObj>) obj);
        }
    }

    public class i0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 23495, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            r1.e1(((com.max.hbcommon.base.d) MeHomeFragmentx.this).mContext, MeHomeFragmentx.this.f78003p);
            dialogInterface.dismiss();
        }
    }

    public class j extends com.max.hbcommon.network.d<Result<MyGameListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f78054b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f78055c;

        j(String str, String str2) {
            this.f78054b = str;
            this.f78055c = str2;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23428, new Class[0], Void.TYPE).isSupported && MeHomeFragmentx.C4(MeHomeFragmentx.this, this.f78054b) && MeHomeFragmentx.this.isActive()) {
                super.onComplete();
                MeHomeFragmentx.v4(MeHomeFragmentx.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23429, new Class[]{Throwable.class}, Void.TYPE).isSupported && MeHomeFragmentx.C4(MeHomeFragmentx.this, this.f78054b) && MeHomeFragmentx.this.isActive()) {
                super.onError(th2);
                MeHomeFragmentx.v4(MeHomeFragmentx.this);
                if (MeHomeFragmentx.this.O == 0) {
                    MeHomeFragmentx.w4(MeHomeFragmentx.this);
                }
            }
        }

        public void onNext(Result<MyGameListObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23430, new Class[]{Result.class}, Void.TYPE).isSupported && MeHomeFragmentx.C4(MeHomeFragmentx.this, this.f78054b) && MeHomeFragmentx.this.isActive() && result.getResult() != null) {
                super.onNext(result);
                List<GameObj> game_list = result.getResult().getGame_list();
                if (MeHomeFragmentx.this.O == 0) {
                    MeHomeFragmentx.x4(MeHomeFragmentx.this, result.getResult());
                }
                MeHomeFragmentx.g4(MeHomeFragmentx.this, game_list, this.f78055c, true);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23431, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MyGameListObj>) obj);
        }
    }

    public class j0 implements r1.z0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        j0() {
        }

        @Override // com.max.xiaoheihe.module.game.r1.z0
        public void a(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 23499, new Class[]{String.class}, Void.TYPE).isSupported || GameObj.PLATFORM_HARDWARE.equals(str) || MeHomeFragmentx.this.B.equals(str)) {
                return;
            }
            MeHomeFragmentx.this.B = str;
            MeHomeFragmentx.C5(MeHomeFragmentx.this);
            MeHomeFragmentx.d4(MeHomeFragmentx.this);
        }

        @Override // com.max.xiaoheihe.module.game.r1.z0
        public void b() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23500, new Class[0], Void.TYPE).isSupported || GameObj.PLATFORM_HARDWARE.equals(MeHomeFragmentx.this.B)) {
                return;
            }
            MeHomeFragmentx.j5(MeHomeFragmentx.this);
        }

        @Override // com.max.xiaoheihe.module.game.r1.z0
        public io.reactivex.disposables.a c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23498, new Class[0], io.reactivex.disposables.a.class);
            return patchProxyResultProxy.isSupported ? (io.reactivex.disposables.a) patchProxyResultProxy.result : MeHomeFragmentx.this.getCompositeDisposable();
        }

        @Override // com.max.xiaoheihe.module.game.r1.z0
        public void d(View view, String str) {
            if (PatchProxy.proxy(new Object[]{view, str}, this, changeQuickRedirect, false, 23497, new Class[]{View.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            MeHomeFragmentx.B5(MeHomeFragmentx.this, view, str);
        }

        @Override // com.max.xiaoheihe.module.game.r1.z0
        public void e() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23496, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            MeHomeFragmentx.A5(MeHomeFragmentx.this);
        }
    }

    public class k extends com.max.hbcommon.network.d<Result<FollowingListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f78058b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f78059c;

        k(Map map, String str) {
            this.f78058b = map;
            this.f78059c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23432, new Class[0], Void.TYPE).isSupported && MeHomeFragmentx.D4(MeHomeFragmentx.this, this.f78058b) && MeHomeFragmentx.this.isActive()) {
                super.onComplete();
                MeHomeFragmentx.v4(MeHomeFragmentx.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23433, new Class[]{Throwable.class}, Void.TYPE).isSupported && MeHomeFragmentx.D4(MeHomeFragmentx.this, this.f78058b) && MeHomeFragmentx.this.isActive()) {
                super.onError(th2);
                MeHomeFragmentx.v4(MeHomeFragmentx.this);
                if (MeHomeFragmentx.this.O == 0) {
                    MeHomeFragmentx.w4(MeHomeFragmentx.this);
                }
            }
        }

        public void onNext(Result<FollowingListObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23434, new Class[]{Result.class}, Void.TYPE).isSupported && MeHomeFragmentx.D4(MeHomeFragmentx.this, this.f78058b) && MeHomeFragmentx.this.isActive() && result.getResult() != null) {
                super.onNext(result);
                List<GameObj> following = result.getResult().getFollowing();
                if (following != null) {
                    Iterator<GameObj> it = following.iterator();
                    while (it.hasNext()) {
                        it.next().setItemType(GameObj.ITEM_TYPE_NORMAL);
                    }
                    if (MeHomeFragmentx.this.O == 0) {
                        MeHomeFragmentx.this.s7();
                        MeHomeFragmentx.E4(MeHomeFragmentx.this, result.getResult());
                        MeHomeFragmentx.this.f78004p1.put(MeHomeFragmentx.F4(MeHomeFragmentx.this), result.getResult());
                        if (com.max.hbcommon.utils.c.u(MeHomeFragmentx.this.P)) {
                            MeHomeFragmentx.J4(MeHomeFragmentx.this);
                        }
                        String strK4 = MeHomeFragmentx.K4(MeHomeFragmentx.this);
                        Map map = MeHomeFragmentx.this.N;
                        if (!strK4.contains(this.f78059c)) {
                            strK4 = this.f78059c;
                        }
                        map.put(strK4, ModuleUtil.INSTANCE.copyList((ArrayList) following));
                        MeHomeFragmentx.this.I.clear();
                    }
                    MeHomeFragmentx.this.I.addAll(following);
                    MeHomeFragmentx.this.C.notifyDataSetChanged();
                }
                if (MeHomeFragmentx.this.I.isEmpty()) {
                    MeHomeFragmentx.N4(MeHomeFragmentx.this);
                } else {
                    MeHomeFragmentx.h4(MeHomeFragmentx.this);
                }
                MeHomeFragmentx.this.f77989c.b0(true ^ MeHomeFragmentx.this.I.isEmpty());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23435, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<FollowingListObj>) obj);
        }
    }

    public class k0 implements SegmentFilterView.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        k0() {
        }

        @Override // com.max.hbcommon.component.segmentfilters.SegmentFilterView.a
        public void a(@androidx.annotation.n0 KeyDescObj keyDescObj, int i10) {
            if (PatchProxy.proxy(new Object[]{keyDescObj, new Integer(i10)}, this, changeQuickRedirect, false, 23501, new Class[]{KeyDescObj.class, Integer.TYPE}, Void.TYPE).isSupported || MeHomeFragmentx.this.f78020z.equals(keyDescObj.getKey())) {
                return;
            }
            MeHomeFragmentx.this.f78020z = keyDescObj.getKey();
            MeHomeFragmentx.this.f78015x1.put(MeHomeFragmentx.this.B, MeHomeFragmentx.this.f78020z);
            MeHomeFragmentx.d4(MeHomeFragmentx.this);
            MeHomeFragmentx.j5(MeHomeFragmentx.this);
        }
    }

    public class l extends com.max.hbcommon.network.d<Result<Dota2MatchListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Result f78063b;

            a(Result result) {
                this.f78063b = result;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23441, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                MeHomeFragmentx.h4(MeHomeFragmentx.this);
                MeHomeFragmentx.this.J.clear();
                MeHomeFragmentx.this.J.addAll(((Dota2MatchListObj) this.f78063b.getResult()).getMatch_list());
                MeHomeFragmentx.this.C.notifyDataSetChanged();
            }
        }

        l() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23438, new Class[]{Throwable.class}, Void.TYPE).isSupported && MeHomeFragmentx.this.isActive()) {
                super.onError(th2);
                MeHomeFragmentx.v4(MeHomeFragmentx.this);
                MeHomeFragmentx.w4(MeHomeFragmentx.this);
            }
        }

        public void onNext(Result<Dota2MatchListObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23439, new Class[]{Result.class}, Void.TYPE).isSupported && MeHomeFragmentx.this.isActive()) {
                super.onNext(result);
                MeHomeFragmentx.v4(MeHomeFragmentx.this);
                if (result.getResult() == null || com.max.hbcommon.utils.c.w(result.getResult().getMatch_list())) {
                    MeHomeFragmentx.N4(MeHomeFragmentx.this);
                } else {
                    if (!MeHomeFragmentx.this.isActive() || ((com.max.hbcommon.base.d) MeHomeFragmentx.this).mContext == null) {
                        return;
                    }
                    ((com.max.hbcommon.base.d) MeHomeFragmentx.this).mContext.runOnUiThread(new a(result));
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23440, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<Dota2MatchListObj>) obj);
        }
    }

    public class l0 implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        l0() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 23493, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            if (MeHomeFragmentx.this.getParentFragment() instanceof MehomefragmentV2) {
                ((MehomefragmentV2) MeHomeFragmentx.this.getParentFragment()).B5();
            }
            MeHomeFragmentx.this.a6();
        }
    }

    public class m extends com.max.hbcommon.network.d<Result<Dota2TeammateListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Result f78067b;

            a(Result result) {
                this.f78067b = result;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23445, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                if (this.f78067b.getResult() == null) {
                    MeHomeFragmentx.N4(MeHomeFragmentx.this);
                    return;
                }
                if (MeHomeFragmentx.this.O == 0) {
                    MeHomeFragmentx.this.K.clear();
                    if (com.max.hbcommon.utils.c.w(((Dota2TeammateListObj) this.f78067b.getResult()).getUser_list())) {
                        MeHomeFragmentx.N4(MeHomeFragmentx.this);
                    } else {
                        MeHomeFragmentx.h4(MeHomeFragmentx.this);
                    }
                }
                if (com.max.hbcommon.utils.c.w(((Dota2TeammateListObj) this.f78067b.getResult()).getUser_list())) {
                    return;
                }
                MeHomeFragmentx.this.K.addAll(((Dota2TeammateListObj) this.f78067b.getResult()).getUser_list());
                MeHomeFragmentx.this.C.notifyDataSetChanged();
            }
        }

        m() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23442, new Class[]{Throwable.class}, Void.TYPE).isSupported && MeHomeFragmentx.this.isActive()) {
                super.onError(th2);
                MeHomeFragmentx.v4(MeHomeFragmentx.this);
                MeHomeFragmentx.w4(MeHomeFragmentx.this);
            }
        }

        public void onNext(Result<Dota2TeammateListObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23443, new Class[]{Result.class}, Void.TYPE).isSupported && MeHomeFragmentx.this.isActive()) {
                super.onNext(result);
                MeHomeFragmentx.v4(MeHomeFragmentx.this);
                if (!MeHomeFragmentx.this.isActive() || ((com.max.hbcommon.base.d) MeHomeFragmentx.this).mContext == null) {
                    return;
                }
                ((com.max.hbcommon.base.d) MeHomeFragmentx.this).mContext.runOnUiThread(new a(result));
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23444, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<Dota2TeammateListObj>) obj);
        }
    }

    public class m0 implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        m0() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 23502, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            MeHomeFragmentx.z5(MeHomeFragmentx.this, 30);
            MeHomeFragmentx.this.f78017y = false;
            MeHomeFragmentx.P3(MeHomeFragmentx.this);
        }
    }

    public class n extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23447, new Class[0], Void.TYPE).isSupported && MeHomeFragmentx.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23446, new Class[]{Throwable.class}, Void.TYPE).isSupported && MeHomeFragmentx.this.isActive()) {
                super.onError(th2);
            }
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23448, new Class[]{Result.class}, Void.TYPE).isSupported && MeHomeFragmentx.this.isActive()) {
                super.onNext(result);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23449, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class n0 implements ConsecutiveScrollerLayout.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        n0() {
        }

        @Override // com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout.h
        public void a(View view, int i10, int i11, int i12) {
            Object[] objArr = {view, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 23503, new Class[]{View.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            if (i12 == 0) {
                com.max.xiaoheihe.module.game.l.c(MeHomeFragmentx.this.f77991d, MeHomeFragmentx.this.I, MeHomeFragmentx.this.C);
            }
            MeHomeFragmentx.this.f78018y1.q();
        }
    }

    public class o implements com.max.hbcommon.component.curtain.c.InterfaceC0544c {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23452, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                MeHomeFragmentx.this.f78019y2.c();
            }
        }

        o() {
        }

        @Override // com.max.hbcommon.component.curtain.c.InterfaceC0544c
        public void a(int i10, gb.a aVar) {
            if (!PatchProxy.proxy(new Object[]{new Integer(i10), aVar}, this, changeQuickRedirect, false, 23450, new Class[]{Integer.TYPE, gb.a.class}, Void.TYPE).isSupported && MeHomeFragmentx.this.isActive()) {
                try {
                    FrameLayout frameLayout = (FrameLayout) aVar.b(R.id.vg_pure_empty);
                    if (frameLayout != null) {
                        a aVar2 = new a();
                        if (i10 == 1) {
                            if (MeHomeFragmentx.this.f78005p2 == null) {
                                MeHomeFragmentx meHomeFragmentx = MeHomeFragmentx.this;
                                meHomeFragmentx.f78005p2 = com.max.xiaoheihe.utils.d.Y(((com.max.hbcommon.base.d) meHomeFragmentx).mContext, frameLayout, MeHomeFragmentx.this.f77994g.findViewById(R.id.vg_container), "🎉 点击游戏图标，切换游戏战绩和小程序", 48, aVar2);
                            }
                            MeHomeFragmentx.this.f78005p2.O();
                            return;
                        }
                        if (i10 == 2) {
                            if (MeHomeFragmentx.this.f78005p2 != null) {
                                MeHomeFragmentx.this.f78005p2.G();
                            }
                            View viewC5 = MeHomeFragmentx.c5(MeHomeFragmentx.this, R.id.vp_mini_app);
                            if (viewC5 == null || viewC5.getVisibility() != 0 || ViewUtils.V(viewC5) <= 0) {
                                aVar.c();
                                return;
                            }
                            if (MeHomeFragmentx.this.f78016x2 == null) {
                                MeHomeFragmentx meHomeFragmentx2 = MeHomeFragmentx.this;
                                meHomeFragmentx2.f78016x2 = com.max.xiaoheihe.utils.d.Y(((com.max.hbcommon.base.d) meHomeFragmentx2).mContext, frameLayout, viewC5, "🎉 游戏对应小程序在这里查看", 80, aVar2);
                            }
                            MeHomeFragmentx.this.f78016x2.O();
                        }
                    }
                } catch (Throwable th2) {
                    MeHomeFragmentx.g5(MeHomeFragmentx.this);
                    if (MeHomeFragmentx.this.f78019y2 != null) {
                        MeHomeFragmentx.this.f78019y2.finish();
                        MeHomeFragmentx.this.f78019y2 = null;
                    }
                    com.max.heybox.hblog.g.G("showInitGuide error: " + th2.getMessage());
                }
            }
        }

        @Override // com.max.hbcommon.component.curtain.c.InterfaceC0544c
        public void onFinish() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23451, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            MeHomeFragmentx.g5(MeHomeFragmentx.this);
            MeHomeFragmentx.this.f78019y2 = null;
        }
    }

    public class o0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23504, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) MeHomeFragmentx.this).mContext, MehomefragmentV2.K.getProtocol());
        }
    }

    public class p implements HeyBoxPopupMenu.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f78075a;

        p(View view) {
            this.f78075a = view;
        }

        @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
        public void a(View view, KeyDescObj keyDescObj) {
            TextView textView;
            if (!PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 23453, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported && MeHomeFragmentx.h5(MeHomeFragmentx.this, keyDescObj)) {
                View view2 = this.f78075a;
                if (view2 != null && (textView = (TextView) view2.findViewById(R.id.text1)) != null) {
                    textView.setText(keyDescObj.getDesc());
                }
                MeHomeFragmentx.i5(MeHomeFragmentx.this, keyDescObj);
                MeHomeFragmentx.d4(MeHomeFragmentx.this);
                MeHomeFragmentx.this.f78017y = false;
                MeHomeFragmentx.J4(MeHomeFragmentx.this);
                MeHomeFragmentx.j5(MeHomeFragmentx.this);
                ((com.max.hbcommon.base.d) MeHomeFragmentx.this).mContext.sendBroadcast(new Intent(lb.a.D));
            }
        }
    }

    public class p0 extends com.max.hbcommon.network.d<Result<HomeDataObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        p0() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23505, new Class[]{Throwable.class}, Void.TYPE).isSupported && MeHomeFragmentx.this.isActive()) {
                super.onError(th2);
                MeHomeFragmentx.W3(MeHomeFragmentx.this);
            }
        }

        public void onNext(Result<HomeDataObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23506, new Class[]{Result.class}, Void.TYPE).isSupported && MeHomeFragmentx.this.isActive()) {
                super.onNext(result);
                MeHomeFragmentx.this.L6(result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23507, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<HomeDataObj>) obj);
        }
    }

    public class q implements DialogInterface.OnDismissListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (PatchProxy.proxy(new Object[]{dialogInterface}, this, changeQuickRedirect, false, 23454, new Class[]{DialogInterface.class}, Void.TYPE).isSupported || MeHomeFragmentx.this.f77993f == null) {
                return;
            }
            MeHomeFragmentx.this.f77993f.setColorFilter((ColorFilter) null);
        }
    }

    public class q0 extends com.max.hbcommon.network.d<HomeDataObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        q0() {
        }

        public void a(HomeDataObj homeDataObj) {
            if (!PatchProxy.proxy(new Object[]{homeDataObj}, this, changeQuickRedirect, false, 23510, new Class[]{HomeDataObj.class}, Void.TYPE).isSupported && MeHomeFragmentx.this.isActive()) {
                com.max.hbcommon.utils.d.b("zzzzcache", "home cache valid");
                homeDataObj.setReport(false);
                MeHomeFragmentx.this.M6(homeDataObj, true);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23509, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            MeHomeFragmentx.X3(MeHomeFragmentx.this);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23508, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b("zzzzcache", " home cache error");
            MeHomeFragmentx.X3(MeHomeFragmentx.this);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23511, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((HomeDataObj) obj);
        }
    }

    public class r implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RelativeLayout f78080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f78081c;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        public class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23456, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (com.max.xiaoheihe.utils.d.N0(((com.max.hbcommon.base.d) MeHomeFragmentx.this).mContext)) {
                    MeHomeFragmentx.o5(MeHomeFragmentx.this);
                } else {
                    MeHomeFragmentx meHomeFragmentx = MeHomeFragmentx.this;
                    meHomeFragmentx.startActivityForResult(SetPushStateActivity.X1(((com.max.hbcommon.base.d) meHomeFragmentx).mContext), 0);
                }
                MeHomeFragmentx.q5(MeHomeFragmentx.this, false, true);
            }
        }

        public class c implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            c() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23457, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                MeHomeFragmentx.q5(MeHomeFragmentx.this, false, true);
                com.max.hbcache.c.C(com.max.hbcache.c.Y, "" + System.currentTimeMillis());
            }
        }

        r(RelativeLayout relativeLayout, int i10) {
            this.f78080b = relativeLayout;
            this.f78081c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23455, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.anim.b.c(this.f78080b, this.f78081c, true);
            this.f78080b.setOnClickListener(new a());
            this.f78080b.findViewById(R.id.tv_open).setOnClickListener(new b());
            this.f78080b.findViewById(R.id.iv_close).setOnClickListener(new c());
        }
    }

    public class r0 extends com.max.hbcommon.base.adapter.u<GameObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23516, new Class[0], Void.TYPE).isSupported && MeHomeFragmentx.this.f77991d.getScrollState() == 0) {
                    com.max.xiaoheihe.module.game.l.c(MeHomeFragmentx.this.f77991d, MeHomeFragmentx.this.I, MeHomeFragmentx.this.C);
                }
            }
        }

        public class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23517, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                MeHomeFragmentx.this.f78018y1.q();
            }
        }

        public r0() {
            super(((com.max.hbcommon.base.d) MeHomeFragmentx.this).mContext, MeHomeFragmentx.this.I);
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, GameObj gameObj) {
            Object[] objArr = {new Integer(i10), gameObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 23514, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, gameObj);
        }

        public int n(int i10, GameObj gameObj) {
            Object[] objArr = {new Integer(i10), gameObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 23512, new Class[]{cls, GameObj.class}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            if (gameObj.getItemType() == GameObj.ITEM_TYPE_DATA_CARD) {
                return R.layout.item_my_game_with_time_and_achieve;
            }
            return gameObj.getItemType() == GameObj.ITEM_TYPE_GAMECOMMENT_TIPS ? com.max.xiaoheihe.module.game.l.d() : R.layout.item_game_followed;
        }

        public void o(com.max.hbcommon.base.adapter.s.e eVar, GameObj gameObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameObj}, this, changeQuickRedirect, false, 23513, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameObj.class}, Void.TYPE).isSupported || gameObj == ((GameObj) eVar.itemView.getTag(R.id.game_item))) {
                return;
            }
            if (eVar.d() == R.layout.item_my_game_with_time_and_achieve) {
                GameTimeAchieveItemView.Type type = GameTimeAchieveItemView.Type.Normal;
                if (MeHomeFragmentx.Q3.equals(MeHomeFragmentx.this.f78020z)) {
                    type = GameTimeAchieveItemView.Type.Achievement;
                } else if (MeHomeFragmentx.R3.equals(MeHomeFragmentx.this.f78020z)) {
                    type = GameTimeAchieveItemView.Type.GameRate;
                }
                com.max.xiaoheihe.module.account.utils.l.P((GameTimeAchieveItemView) eVar.i(R.id.gtaiv), gameObj, MeHomeFragmentx.S5(MeHomeFragmentx.this, r1.Z(gameObj)), false, MeHomeFragmentx.this.f78003p, null, MeHomeFragmentx.this.f78002o, type, MeHomeFragmentx.this.B);
                eVar.itemView.setTag(gameObj);
                if (!com.max.hbcommon.utils.c.u(gameObj.getNeed_to_comment()) && MeHomeFragmentx.this.f77991d.getScrollState() == 0) {
                    eVar.itemView.postDelayed(new a(), 300L);
                }
            } else if (eVar.d() == R.layout.item_game_followed) {
                GameItemView gameItemView = (GameItemView) eVar.i(R.id.giv);
                gameItemView.g(gameObj, GameObj.KEY_POINT_FOLLOW_LIST, null, true, new b(), eVar);
                gameItemView.m();
            } else if (eVar.d() == com.max.xiaoheihe.module.game.l.d()) {
                com.max.xiaoheihe.module.game.l.e(((com.max.hbcommon.base.d) MeHomeFragmentx.this).mContext, eVar, gameObj, MeHomeFragmentx.this.I, MeHomeFragmentx.this.C);
            }
            eVar.itemView.setTag(R.id.game_item, gameObj);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 23515, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, (GameObj) obj);
        }
    }

    public class s implements TabLayout.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FollowingListObj f78089a;

        s(FollowingListObj followingListObj) {
            this.f78089a = followingListObj;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.h hVar) {
            if (PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, 23458, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
                return;
            }
            MeHomeFragmentx.this.P = (String) hVar.m();
            MeHomeFragmentx.d4(MeHomeFragmentx.this);
            List list = (List) MeHomeFragmentx.this.N.get(MeHomeFragmentx.K4(MeHomeFragmentx.this));
            if (com.max.hbcommon.utils.c.w(list)) {
                MeHomeFragmentx.e4(MeHomeFragmentx.this);
                MeHomeFragmentx.P3(MeHomeFragmentx.this);
            } else {
                MeHomeFragmentx.this.I.clear();
                MeHomeFragmentx.this.I.addAll(list);
                MeHomeFragmentx.this.C.notifyDataSetChanged();
            }
            MeHomeFragmentx.this.P = (String) hVar.m();
            if (!"1".equals(this.f78089a.getFilter_head().get(hVar.k()).getMulti())) {
                View viewG = hVar.g();
                if (viewG != null) {
                    TextView textView = (TextView) viewG.findViewById(R.id.text1);
                    textView.setTextColor(((com.max.hbcommon.base.d) MeHomeFragmentx.this).mContext.getResources().getColor(R.color.text_primary_1_color));
                    textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
                    return;
                }
                return;
            }
            View viewG2 = hVar.g();
            if (viewG2 != null) {
                TextView textView2 = (TextView) viewG2.findViewById(R.id.text1);
                ImageView imageView = (ImageView) viewG2.findViewById(R.id.icon);
                textView2.setTextColor(((com.max.hbcommon.base.d) MeHomeFragmentx.this).mContext.getResources().getColor(R.color.text_primary_1_color));
                imageView.setImageTintList(ColorStateList.valueOf(((com.max.hbcommon.base.d) MeHomeFragmentx.this).mContext.getResources().getColor(R.color.text_primary_1_color)));
                textView2.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.h hVar) {
            if (!PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, 23459, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported && hVar.k() < this.f78089a.getFilter_head().size()) {
                if (!"1".equals(this.f78089a.getFilter_head().get(hVar.k()).getMulti())) {
                    View viewG = hVar.g();
                    if (viewG != null) {
                        TextView textView = (TextView) viewG.findViewById(R.id.text1);
                        textView.setTextColor(((com.max.hbcommon.base.d) MeHomeFragmentx.this).mContext.getResources().getColor(R.color.text_secondary_1_color));
                        textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
                        return;
                    }
                    return;
                }
                View viewG2 = hVar.g();
                if (viewG2 != null) {
                    TextView textView2 = (TextView) viewG2.findViewById(R.id.text1);
                    ImageView imageView = (ImageView) viewG2.findViewById(R.id.icon);
                    textView2.setTextColor(((com.max.hbcommon.base.d) MeHomeFragmentx.this).mContext.getResources().getColor(R.color.text_secondary_1_color));
                    imageView.setImageTintList(ColorStateList.valueOf(((com.max.hbcommon.base.d) MeHomeFragmentx.this).mContext.getResources().getColor(R.color.text_secondary_1_color)));
                    textView2.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.h hVar) {
        }
    }

    public class t implements r1.z0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        t() {
        }

        @Override // com.max.xiaoheihe.module.game.r1.z0
        public void a(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 23463, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!GameObj.PLATFORM_HARDWARE.equals(str) && !MeHomeFragmentx.this.B.equals(str)) {
                MeHomeFragmentx.this.B = str;
                MeHomeFragmentx.C5(MeHomeFragmentx.this);
                MeHomeFragmentx.d4(MeHomeFragmentx.this);
            }
            MeHomeFragmentx.this.B = str;
        }

        @Override // com.max.xiaoheihe.module.game.r1.z0
        public void b() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23464, new Class[0], Void.TYPE).isSupported || GameObj.PLATFORM_HARDWARE.equals(MeHomeFragmentx.this.B)) {
                return;
            }
            MeHomeFragmentx.j5(MeHomeFragmentx.this);
        }

        @Override // com.max.xiaoheihe.module.game.r1.z0
        public io.reactivex.disposables.a c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23462, new Class[0], io.reactivex.disposables.a.class);
            return patchProxyResultProxy.isSupported ? (io.reactivex.disposables.a) patchProxyResultProxy.result : MeHomeFragmentx.this.getCompositeDisposable();
        }

        @Override // com.max.xiaoheihe.module.game.r1.z0
        public void d(View view, String str) {
            if (PatchProxy.proxy(new Object[]{view, str}, this, changeQuickRedirect, false, 23461, new Class[]{View.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            MeHomeFragmentx.B5(MeHomeFragmentx.this, view, str);
        }

        @Override // com.max.xiaoheihe.module.game.r1.z0
        public void e() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23460, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            MeHomeFragmentx.A5(MeHomeFragmentx.this);
        }
    }

    public class u implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23465, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcache.c.C(com.max.hbcache.c.Q, "1");
            MeHomeFragmentx.this.U6();
        }
    }

    public class v extends com.max.hbcommon.base.adapter.s<Dota2UserObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        v(Context context, List list, int i10) {
            super(context, list, i10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i10) {
            return -2;
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, Dota2UserObj dota2UserObj) {
            if (PatchProxy.proxy(new Object[]{eVar, dota2UserObj}, this, changeQuickRedirect, false, 23436, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Dota2UserObj.class}, Void.TYPE).isSupported) {
                return;
            }
            Dota2FollowUserItemView dota2FollowUserItemView = (Dota2FollowUserItemView) eVar.i(R.id.v_dota2_follow);
            dota2FollowUserItemView.b();
            dota2FollowUserItemView.setData(dota2UserObj);
            dota2FollowUserItemView.setLightStyle();
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Dota2UserObj dota2UserObj) {
            if (PatchProxy.proxy(new Object[]{eVar, dota2UserObj}, this, changeQuickRedirect, false, 23437, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, dota2UserObj);
        }
    }

    public class w extends com.max.hbcustomview.bannerview.d<List<MiniProgramObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a extends com.max.hbcommon.base.adapter.s<MiniProgramObj> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.account.MeHomeFragmentx$w$a$a, reason: collision with other inner class name */
            public class ViewOnClickListenerC0638a implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ MiniProgramObj f78096b;

                ViewOnClickListenerC0638a(MiniProgramObj miniProgramObj) {
                    this.f78096b = miniProgramObj;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23470, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) MeHomeFragmentx.this).mContext, this.f78096b.getProto());
                }
            }

            a(Context context, List list, int i10) {
                super(context, list, i10);
            }

            public void m(com.max.hbcommon.base.adapter.s.e eVar, MiniProgramObj miniProgramObj) {
                if (PatchProxy.proxy(new Object[]{eVar, miniProgramObj}, this, changeQuickRedirect, false, 23468, new Class[]{com.max.hbcommon.base.adapter.s.e.class, MiniProgramObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                MiniProgramView miniProgramView = (MiniProgramView) eVar.i(R.id.v_mini_program);
                ViewGroup.LayoutParams layoutParams = miniProgramView.getLayoutParams();
                layoutParams.width = (MeHomeFragmentx.this.M.getWidth() - ViewUtils.f(((com.max.hbcommon.base.d) MeHomeFragmentx.this).mContext, 48.0f)) / 4;
                miniProgramView.setLayoutParams(layoutParams);
                miniProgramView.setData(miniProgramObj);
                miniProgramView.setOnClickListener(new ViewOnClickListenerC0638a(miniProgramObj));
            }

            @Override // com.max.hbcommon.base.adapter.s
            public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, MiniProgramObj miniProgramObj) {
                if (PatchProxy.proxy(new Object[]{eVar, miniProgramObj}, this, changeQuickRedirect, false, 23469, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                m(eVar, miniProgramObj);
            }
        }

        w() {
        }

        public void A(com.max.hbcustomview.bannerview.e<List<MiniProgramObj>> eVar, List<MiniProgramObj> list, int i10, int i11) {
            Object[] objArr = {eVar, list, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 23466, new Class[]{com.max.hbcustomview.bannerview.e.class, List.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            RecyclerView recyclerView = (RecyclerView) eVar.itemView;
            recyclerView.setLayoutManager(new GridLayoutManager(MeHomeFragmentx.this.getContext(), 4, 1, false));
            MeHomeFragmentx meHomeFragmentx = MeHomeFragmentx.this;
            meHomeFragmentx.G = new a(((com.max.hbcommon.base.d) meHomeFragmentx).mContext, list, R.layout.item_mini_program_v2);
            recyclerView.setAdapter(MeHomeFragmentx.this.G);
            if (recyclerView.getItemDecorationCount() == 0) {
                recyclerView.addItemDecoration(new fc.b(4, ViewUtils.f(MeHomeFragmentx.this.getContext(), 8.0f), false));
            }
        }

        @Override // com.max.hbcustomview.bannerview.d
        public /* bridge */ /* synthetic */ void n(com.max.hbcustomview.bannerview.e<List<MiniProgramObj>> eVar, List<MiniProgramObj> list, int i10, int i11) {
            Object[] objArr = {eVar, list, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 23467, new Class[]{com.max.hbcustomview.bannerview.e.class, Object.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            A(eVar, list, i10, i11);
        }

        @Override // com.max.hbcustomview.bannerview.d
        public int q(int i10) {
            return R.layout.view_rv_mini_program;
        }
    }

    public class x implements com.max.xiaoheihe.module.account.utils.l.k0<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f78098a;

        x(String str) {
            this.f78098a = str;
        }

        @Override // com.max.xiaoheihe.module.account.utils.l.k0
        public /* bridge */ /* synthetic */ void a(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 23472, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(str);
        }

        public void b(String str) {
            boolean zX = false;
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 23471, new Class[]{String.class}, Void.TYPE).isSupported || str == null || com.max.hbcommon.utils.c.w(MeHomeFragmentx.this.Y)) {
                return;
            }
            for (KeyDescObj keyDescObj : MeHomeFragmentx.this.Y) {
                if (str.equals(keyDescObj.getKey())) {
                    zX = com.max.hbcommon.utils.c.x(keyDescObj.getEnable());
                    break;
                }
            }
            if (!str.equals(this.f78098a)) {
                MeHomeFragmentx.this.X.put(MeHomeFragmentx.this.B + MeHomeFragmentx.this.f78020z, str);
                MeHomeFragmentx.d4(MeHomeFragmentx.this);
                MeHomeFragmentx.j5(MeHomeFragmentx.this);
                return;
            }
            if (zX) {
                MeHomeFragmentx.this.X.remove(MeHomeFragmentx.this.B + MeHomeFragmentx.this.f78020z);
                MeHomeFragmentx.d4(MeHomeFragmentx.this);
                MeHomeFragmentx.j5(MeHomeFragmentx.this);
            }
        }
    }

    public class y implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        y() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23473, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MeHomeFragmentx.d4(MeHomeFragmentx.this);
            MeHomeFragmentx.P3(MeHomeFragmentx.this);
        }
    }

    public class z implements View.OnFocusChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        z() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 23474, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            Log.d("mSearchEditText", "onFocusChange: " + z10);
            if (z10) {
                MeHomeFragmentx.this.V.f67176f.setVisibility(0);
                MeHomeFragmentx.this.V.getLayoutParams().width = -1;
            }
        }
    }

    static /* synthetic */ void A5(MeHomeFragmentx meHomeFragmentx) {
        if (PatchProxy.proxy(new Object[]{meHomeFragmentx}, null, changeQuickRedirect, true, 23398, new Class[]{MeHomeFragmentx.class}, Void.TYPE).isSupported) {
            return;
        }
        meHomeFragmentx.r7();
    }

    private void A6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23277, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int iE = com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color);
        this.f77987b.f109704c.f115364g.f110607b.setTextColor(iE);
        this.f77987b.f109704c.f115364g.f110609d.setTextColor(iE);
        this.f77987b.f109704c.f115364g.f110608c.setTextColor(iE);
        this.f77987b.f109704c.f115363f.f117369b.setTextColor(iE);
        this.f77987b.f109704c.f115363f.f117371d.setTextColor(iE);
        this.f77987b.f109704c.f115363f.f117370c.setTextColor(iE);
    }

    static /* synthetic */ boolean B4(MeHomeFragmentx meHomeFragmentx, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{meHomeFragmentx, str}, null, changeQuickRedirect, true, 23383, new Class[]{MeHomeFragmentx.class, String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : meHomeFragmentx.E6(str);
    }

    static /* synthetic */ void B5(MeHomeFragmentx meHomeFragmentx, View view, String str) {
        if (PatchProxy.proxy(new Object[]{meHomeFragmentx, view, str}, null, changeQuickRedirect, true, 23399, new Class[]{MeHomeFragmentx.class, View.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        meHomeFragmentx.Z6(view, str);
    }

    private boolean B6() {
        byte b10 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23360, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        PlatformBindStatus platformBindStatusH0 = r1.h0(this.f78001n);
        String str = this.B;
        str.hashCode();
        switch (str.hashCode()) {
            case -889473228:
                if (!str.equals("switch")) {
                    b10 = -1;
                }
                break;
            case 3119877:
                b10 = !str.equals("epic") ? (byte) -1 : (byte) 1;
                break;
            case 538159775:
                b10 = !str.equals(GameObj.PLATFORM_XBOX) ? (byte) -1 : (byte) 2;
                break;
            case 1251955023:
                b10 = !str.equals(GameObj.PLATFORM_PS) ? (byte) -1 : (byte) 3;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return platformBindStatusH0.isBindSwitch();
            case 1:
                return platformBindStatusH0.isBindEpic();
            case 2:
                return platformBindStatusH0.isBindXbox();
            case 3:
                return platformBindStatusH0.isBindPSN();
            default:
                return platformBindStatusH0.isBindSteam();
        }
    }

    static /* synthetic */ boolean C4(MeHomeFragmentx meHomeFragmentx, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{meHomeFragmentx, str}, null, changeQuickRedirect, true, 23384, new Class[]{MeHomeFragmentx.class, String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : meHomeFragmentx.C6(str);
    }

    static /* synthetic */ void C5(MeHomeFragmentx meHomeFragmentx) {
        if (PatchProxy.proxy(new Object[]{meHomeFragmentx}, null, changeQuickRedirect, true, 23400, new Class[]{MeHomeFragmentx.class}, Void.TYPE).isSupported) {
            return;
        }
        meHomeFragmentx.b7();
    }

    private boolean C6(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 23302, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return (str == null || str.equals(this.B)) && R3.equals(this.f78020z);
    }

    static /* synthetic */ boolean D4(MeHomeFragmentx meHomeFragmentx, Map map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{meHomeFragmentx, map}, null, changeQuickRedirect, true, 23385, new Class[]{MeHomeFragmentx.class, Map.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : meHomeFragmentx.F6(map);
    }

    private boolean D6(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 23297, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return (str == null || str.equals(this.B)) && O3.equals(this.f78020z);
    }

    static /* synthetic */ void E4(MeHomeFragmentx meHomeFragmentx, FollowingListObj followingListObj) {
        if (PatchProxy.proxy(new Object[]{meHomeFragmentx, followingListObj}, null, changeQuickRedirect, true, 23386, new Class[]{MeHomeFragmentx.class, FollowingListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        meHomeFragmentx.Y6(followingListObj);
    }

    private boolean E6(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 23300, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return (str == null || str.equals(this.B)) && Q3.equals(this.f78020z);
    }

    static /* synthetic */ String F4(MeHomeFragmentx meHomeFragmentx) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{meHomeFragmentx}, null, changeQuickRedirect, true, 23387, new Class[]{MeHomeFragmentx.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : meHomeFragmentx.h6();
    }

    private boolean F6(Map<String, String> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 23308, new Class[]{Map.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return P3.equals(this.f78020z) && map.equals(getFilter());
    }

    private boolean G6(KeyDescObj keyDescObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{keyDescObj}, this, changeQuickRedirect, false, 23322, new Class[]{KeyDescObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        List<KeyDescObj> list = this.Q;
        if (list != null) {
            for (KeyDescObj keyDescObj2 : list) {
                if (keyDescObj2.isChecked() && !keyDescObj.getKey().equals(keyDescObj2.getKey())) {
                    return true;
                }
            }
        }
        return false;
    }

    static /* synthetic */ void H5(MeHomeFragmentx meHomeFragmentx, boolean z10) {
        if (PatchProxy.proxy(new Object[]{meHomeFragmentx, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 23401, new Class[]{MeHomeFragmentx.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        meHomeFragmentx.R6(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H6(TabLayout.h hVar, TabLayout tabLayout, View view) {
        if (PatchProxy.proxy(new Object[]{hVar, tabLayout, view}, this, changeQuickRedirect, false, 23366, new Class[]{TabLayout.h.class, TabLayout.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        if (hVar.o()) {
            m7(hVar.g());
        } else {
            tabLayout.R(hVar);
        }
    }

    static /* synthetic */ void I5(MeHomeFragmentx meHomeFragmentx, String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{meHomeFragmentx, str, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 23402, new Class[]{MeHomeFragmentx.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        meHomeFragmentx.t6(str, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void I6(TabLayout.h hVar, TabLayout tabLayout, View view) {
        if (PatchProxy.proxy(new Object[]{hVar, tabLayout, view}, null, changeQuickRedirect, true, 23365, new Class[]{TabLayout.h.class, TabLayout.class, View.class}, Void.TYPE).isSupported || hVar.o()) {
            return;
        }
        tabLayout.R(hVar);
    }

    static /* synthetic */ void J4(MeHomeFragmentx meHomeFragmentx) {
        if (PatchProxy.proxy(new Object[]{meHomeFragmentx}, null, changeQuickRedirect, true, 23388, new Class[]{MeHomeFragmentx.class}, Void.TYPE).isSupported) {
            return;
        }
        meHomeFragmentx.c7();
    }

    private void J6() {
        ImageConfigObj imageConfigObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23278, new Class[0], Void.TYPE).isSupported || !this.f78012v || (imageConfigObj = (ImageConfigObj) com.max.hbutils.utils.k.a(MMKVManager.f71329a.i(ad.c.f1235o, ad.c.f1237q, "", false), ImageConfigObj.class)) == null) {
            return;
        }
        this.G2 = imageConfigObj.getImg_task();
        this.f78006p3 = imageConfigObj.getImg_hcoin();
    }

    static /* synthetic */ String K4(MeHomeFragmentx meHomeFragmentx) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{meHomeFragmentx}, null, changeQuickRedirect, true, 23389, new Class[]{MeHomeFragmentx.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : meHomeFragmentx.i6();
    }

    public static MeHomeFragmentx K6(String str, String str2, HomeDataObj homeDataObj, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, homeDataObj, str3}, null, changeQuickRedirect, true, 23274, new Class[]{String.class, String.class, HomeDataObj.class, String.class}, MeHomeFragmentx.class);
        if (patchProxyResultProxy.isSupported) {
            return (MeHomeFragmentx) patchProxyResultProxy.result;
        }
        MeHomeFragmentx meHomeFragmentx = new MeHomeFragmentx();
        Bundle bundle = new Bundle();
        bundle.putString(L3, str);
        bundle.putString("steam_id", str2);
        bundle.putSerializable(N3, homeDataObj);
        bundle.putString(MainActivity.C4, str3);
        meHomeFragmentx.setArguments(bundle);
        return meHomeFragmentx;
    }

    static /* synthetic */ void N4(MeHomeFragmentx meHomeFragmentx) {
        if (PatchProxy.proxy(new Object[]{meHomeFragmentx}, null, changeQuickRedirect, true, 23390, new Class[]{MeHomeFragmentx.class}, Void.TYPE).isSupported) {
            return;
        }
        meHomeFragmentx.j7();
    }

    static /* synthetic */ void N5(MeHomeFragmentx meHomeFragmentx, int i10) {
        if (PatchProxy.proxy(new Object[]{meHomeFragmentx, new Integer(i10)}, null, changeQuickRedirect, true, 23403, new Class[]{MeHomeFragmentx.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        meHomeFragmentx.x6(i10);
    }

    private void N6(List<GameObj> list, String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{list, str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 23304, new Class[]{List.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (this.O == 0) {
            this.I.clear();
            s7();
            if (z10 && com.max.hbcommon.utils.c.u(this.f77988b0)) {
                if (list != null) {
                    this.N.put(str, ModuleUtil.INSTANCE.copyList((ArrayList) list));
                }
                List<KeyDescObj> list2 = this.Y;
                if (list2 != null) {
                    this.Z.put(str, ModuleUtil.INSTANCE.copyList((ArrayList) list2));
                }
            }
        }
        if (!com.max.hbcommon.utils.c.w(list)) {
            Iterator<GameObj> it = list.iterator();
            while (it.hasNext()) {
                it.next().setItemType(GameObj.ITEM_TYPE_DATA_CARD);
            }
            this.I.addAll(list);
            if (this.O == 0) {
                X6();
            }
            this.C.notifyDataSetChanged();
        }
        if (this.I.isEmpty()) {
            if (com.max.hbcommon.utils.c.u(this.f77988b0)) {
                z6();
            }
            j7();
        } else {
            W5();
        }
        this.f77989c.b0(!this.I.isEmpty());
    }

    private void O6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23291, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!r1.N0(this.B)) {
            this.C.I(this.D);
        } else if ("dota2".equals(this.B)) {
            if ("user".equals(this.A)) {
                this.C.I(this.F);
            } else {
                this.C.I(this.E);
            }
        }
    }

    static /* synthetic */ void P3(MeHomeFragmentx meHomeFragmentx) {
        if (PatchProxy.proxy(new Object[]{meHomeFragmentx}, null, changeQuickRedirect, true, 23367, new Class[]{MeHomeFragmentx.class}, Void.TYPE).isSupported) {
            return;
        }
        meHomeFragmentx.n6();
    }

    private void P6() {
        GameBindingFragment gameBindingFragment;
        HomeDataObj homeDataObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23328, new Class[0], Void.TYPE).isSupported || (gameBindingFragment = (GameBindingFragment) getChildFragmentManager().r0(R.id.bindingFragment)) == null) {
            return;
        }
        gameBindingFragment.w4(GameBindingFragment.C, (com.max.xiaoheihe.utils.i0.s() && this.f78012v && (homeDataObj = this.f78001n) != null) ? homeDataObj.getStats_orders() : null, true);
    }

    private void Q6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23288, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f77991d.setVisibility(0);
        this.f77989c.b0(true);
        O6();
        if (!r1.N0(this.B)) {
            this.f77987b.f109704c.f115367j.setVisibility(0);
            this.f77987b.f109704c.f115369l.setVisibility(8);
            return;
        }
        this.f77987b.f109704c.f115367j.setVisibility(8);
        this.f77987b.f109704c.f115369l.setVisibility(0);
        List<MiniProgramObj> mini_program_list = null;
        if ("csgo".equals(this.B)) {
            this.f77991d.setVisibility(8);
            this.f77987b.f109704c.f115370m.setVisibility(8);
            if (this.f78001n.getCsgo_platform_info() != null) {
                mini_program_list = this.f78001n.getCsgo_platform_info().getMini_program_list();
            }
        } else {
            if (this.f78012v) {
                HomeDataObj homeDataObj = this.f78001n;
                if (homeDataObj == null || homeDataObj.getDota2_platform_info() == null || !this.f78001n.getDota2_platform_info().is_bind().booleanValue()) {
                    this.f77987b.f109704c.f115370m.setVisibility(8);
                    this.f77991d.setVisibility(8);
                    W5();
                } else {
                    this.f77987b.f109704c.f115370m.setVisibility(0);
                    if (this.f77987b.f109704c.f115361d.getChildCount() == 0) {
                        ArrayList arrayList = new ArrayList();
                        KeyDescObj keyDescObj = new KeyDescObj();
                        keyDescObj.setDesc("关注比赛");
                        keyDescObj.setKey("match");
                        arrayList.add(keyDescObj);
                        KeyDescObj keyDescObj2 = new KeyDescObj();
                        keyDescObj2.setDesc("关注列表");
                        keyDescObj2.setKey("user");
                        arrayList.add(keyDescObj2);
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            if (((KeyDescObj) arrayList.get(i10)).getKey().equals(this.A)) {
                                ((KeyDescObj) arrayList.get(i10)).setChecked(true);
                            } else {
                                ((KeyDescObj) arrayList.get(i10)).setChecked(false);
                            }
                        }
                        this.f77987b.f109704c.f115361d.setData(arrayList);
                        this.f77987b.f109704c.f115361d.setMOnTabCheckedListener(new c());
                        this.f77987b.f109704c.f115361d.d();
                    }
                    if ("user".equals(this.A)) {
                        this.f77987b.f109704c.f115364g.b().setVisibility(0);
                        this.f77987b.f109704c.f115363f.b().setVisibility(8);
                    } else {
                        this.f77987b.f109704c.f115364g.b().setVisibility(8);
                        this.f77987b.f109704c.f115363f.b().setVisibility(0);
                        this.f77989c.b0(false);
                    }
                }
            } else {
                this.f77991d.setVisibility(8);
                this.f77987b.f109704c.f115370m.setVisibility(8);
                W5();
            }
            if (this.f78001n.getDota2_platform_info() != null) {
                mini_program_list = this.f78001n.getDota2_platform_info().getMini_program_list();
            }
        }
        if (com.max.hbcommon.utils.c.w(mini_program_list)) {
            this.M.setVisibility(8);
            return;
        }
        this.L.clear();
        int i11 = 0;
        while (i11 < mini_program_list.size()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i12 = 0; i12 < 8 && i11 < mini_program_list.size(); i12++) {
                arrayList2.add(mini_program_list.get(i11));
                i11++;
            }
            this.L.add(arrayList2);
        }
        this.M.setVisibility(0);
        if (mini_program_list.size() <= 4) {
            this.M.setLayoutHeight(ViewUtils.f(getContext(), 52.0f));
        } else {
            this.M.setLayoutHeight(ViewUtils.f(getContext(), 104.0f));
        }
        this.M.J(this.L);
    }

    private void R6(boolean z10) {
        ViewGroup viewGroup;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 23329, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || this.f78001n == null) {
            return;
        }
        V6();
        if (z10) {
            HBViewPager2 hBViewPager2 = (HBViewPager2) this.f77994g.findViewById(R.id.vp_platform);
            if (hBViewPager2 == null || !this.f78014x) {
                return;
            }
            ViewGroup viewGroup2 = (ViewGroup) hBViewPager2.getChildAt(0);
            int iW0 = r1.w0();
            if (iW0 < 0 || iW0 >= viewGroup2.getChildCount() || (viewGroup = (ViewGroup) viewGroup2.getChildAt(iW0)) == null) {
                return;
            }
            r1.q1((ViewGroup) viewGroup.findViewById(R.id.vg_friends), this.f78009s, this.f78001n.getSteam_id_info() != null ? this.f78001n.getSteam_id_info().getFriend_list_protocol() : null);
            return;
        }
        this.f77994g.a(this.f78001n, this.f78009s, this.B, new t(), this, this);
        int childCount = this.f77994g.getChildCount();
        if (childCount > 1) {
            this.f77994g.removeViews(1, childCount - 1);
        }
        int size = this.f78001n.getCard_orders() != null ? this.f78001n.getCard_orders().size() : 0;
        this.W = size;
        if (size > 0) {
            LinearLayout linearLayout = new LinearLayout(this.mContext);
            this.S = linearLayout;
            linearLayout.setOrientation(1);
            for (int i10 = 0; i10 < this.W; i10++) {
                String str = this.f78001n.getCard_orders().get(i10);
                View viewInflate = this.mInflater.inflate(R.layout.layout_game_data_card, (ViewGroup) this.f77994g, false);
                r1.s1(viewInflate, str, this.f78001n, false);
                ((LinearLayout.LayoutParams) viewInflate.getLayoutParams()).setMargins(0, ViewUtils.f(this.mContext, -4.0f), 0, 0);
                this.S.addView(viewInflate);
            }
            this.f77994g.addView(this.S);
        }
        List<BindGameCardV2> game_cards = this.f78001n.getGame_cards();
        if (!com.max.hbcommon.utils.c.w(game_cards)) {
            View viewInflate2 = this.mInflater.inflate(R.layout.layout_hor_game_bind_card_list, (ViewGroup) this.f77994g, false);
            this.T = viewInflate2;
            viewInflate2.setPadding(0, ViewUtils.f(this.mContext, 4.0f), 0, 0);
            RecyclerView recyclerView = (RecyclerView) this.T.findViewById(R.id.rv_game_bind_list);
            int i11 = 0;
            while (i11 < game_cards.size()) {
                if ("true".equals(com.max.hbcache.c.o(GameBindingFragment.E + game_cards.get(i11).getGame_type(), ""))) {
                    game_cards.remove(i11);
                    i11--;
                }
                i11++;
            }
            com.max.xiaoheihe.module.account.adapter.f fVar = new com.max.xiaoheihe.module.account.adapter.f(this.mContext, game_cards);
            recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext, 0, false));
            recyclerView.setAdapter(fVar);
            this.f77994g.addView(this.T);
            View viewFindViewById = this.T.findViewById(R.id.vg_change_to_list);
            if (this.f78012v) {
                viewFindViewById.setVisibility(0);
                viewFindViewById.setOnClickListener(new u());
            } else {
                viewFindViewById.setVisibility(8);
            }
        }
        if (this.f78012v) {
            U6();
        } else {
            S6();
        }
    }

    static /* synthetic */ int S5(MeHomeFragmentx meHomeFragmentx, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{meHomeFragmentx, str}, null, changeQuickRedirect, true, 23404, new Class[]{MeHomeFragmentx.class, String.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : meHomeFragmentx.p6(str);
    }

    private void S6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23334, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.W > 2) {
            f7();
        } else {
            n7();
        }
    }

    @SuppressLint({"AutoDispose"})
    private void T5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23287, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().F8().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private void T6(View view, FollowingListObj followingListObj) {
        if (PatchProxy.proxy(new Object[]{view, followingListObj}, this, changeQuickRedirect, false, 23324, new Class[]{View.class, FollowingListObj.class}, Void.TYPE).isSupported || followingListObj == null) {
            return;
        }
        if ("1".equals(followingListObj.getPush_state()) || System.currentTimeMillis() - com.max.hbutils.utils.n.r(com.max.hbcache.c.o(com.max.hbcache.c.Y, "0")) <= 604800000) {
            h7(false, false);
        } else {
            h7(true, false);
        }
        if (view == null) {
            return;
        }
        final TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tab);
        if (!com.max.hbcommon.utils.c.y(followingListObj.getFilter_head(), (List) tabLayout.getTag(R.id.tab))) {
            tabLayout.L();
        }
        if (!com.max.hbcommon.utils.c.w(followingListObj.getFilter_head()) && tabLayout.getTabCount() == 0) {
            tabLayout.setTag(R.id.tab, ModuleUtil.INSTANCE.copyList((ArrayList) followingListObj.getFilter_head()));
            KeyDescObj keyDescObjN = com.max.xiaoheihe.utils.d.N(this.Q);
            if (keyDescObjN != null) {
                followingListObj.getFilter_head().get(0).setDesc(keyDescObjN.getDesc());
            }
            tabLayout.t();
            for (int i10 = 0; i10 < followingListObj.getFilter_head().size(); i10++) {
                KeyDescObj keyDescObj = followingListObj.getFilter_head().get(i10);
                final TabLayout.h hVarB = tabLayout.I().D(keyDescObj.getDesc()).B(keyDescObj.getKey());
                tabLayout.i(hVarB);
                if (i10 == 0) {
                    hVarB.r();
                }
                if ("1".equals(keyDescObj.getMulti())) {
                    hVarB.v(e6(keyDescObj, hVarB));
                    hVarB.f55494i.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.account.p
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            this.f79125b.H6(hVarB, tabLayout, view2);
                        }
                    });
                } else {
                    hVarB.f55494i.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.account.q
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            MeHomeFragmentx.I6(hVarB, tabLayout, view2);
                        }
                    });
                    hVarB.v(d6(keyDescObj, hVarB));
                }
            }
            tabLayout.h(new s(followingListObj));
        }
        if (com.max.hbcommon.utils.c.u(this.P)) {
            return;
        }
        for (int i11 = 0; i11 < tabLayout.getTabCount(); i11++) {
            TabLayout.h hVarD = tabLayout.D(i11);
            if (hVarD != null && this.P.equals(hVarD.m())) {
                tabLayout.R(hVarD);
                return;
            }
        }
    }

    private void U5(KeyDescObj keyDescObj) {
        List<KeyDescObj> list;
        if (PatchProxy.proxy(new Object[]{keyDescObj}, this, changeQuickRedirect, false, 23323, new Class[]{KeyDescObj.class}, Void.TYPE).isSupported || (list = this.Q) == null) {
            return;
        }
        for (KeyDescObj keyDescObj2 : list) {
            if (keyDescObj.getKey().equals(keyDescObj2.getKey())) {
                keyDescObj2.setChecked(true);
            } else {
                keyDescObj2.setChecked(false);
            }
        }
    }

    private void V5() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23357, new Class[0], Void.TYPE).isSupported && this.f78012v) {
            int iQ = com.max.hbutils.utils.n.q(com.max.hbcache.c.j("me_tab_show_count")) + 1;
            com.max.hbcache.c.z("me_tab_show_count", iQ + "");
            BindTaskInfoObj task_info = this.f78001n.getTask_info();
            if (task_info == null || task_info.getTask_message() == null) {
                return;
            }
            if (iQ == 2 || iQ % 50 == 0) {
                if (com.max.xiaoheihe.utils.i0.o().getSteam_id_info() == null || TextUtils.isEmpty(com.max.xiaoheihe.utils.i0.o().getSteam_id_info().getSteamid())) {
                    if ("1".equals(task_info.getBind_steam())) {
                        return;
                    }
                    o7(task_info.getTask_message());
                } else {
                    if ("1".equals(task_info.getOpen_steam_info())) {
                        return;
                    }
                    i7(task_info.getTask_message());
                }
            }
        }
    }

    private void V6() {
        com.max.xiaoheihe.module.account.mine.c cVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23331, new Class[0], Void.TYPE).isSupported || (cVar = this.G3) == null) {
            return;
        }
        cVar.a(this.f78007q);
    }

    static /* synthetic */ void W3(MeHomeFragmentx meHomeFragmentx) {
        if (PatchProxy.proxy(new Object[]{meHomeFragmentx}, null, changeQuickRedirect, true, 23368, new Class[]{MeHomeFragmentx.class}, Void.TYPE).isSupported) {
            return;
        }
        meHomeFragmentx.showError();
    }

    private void W5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23295, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.C.z(R.layout.item_empty_content)) {
            this.C.E(R.layout.item_empty_content);
        }
        if (this.C.z(R.layout.loading_view)) {
            this.C.E(R.layout.loading_view);
        }
        if (this.C.z(R.layout.item_error_content)) {
            this.C.E(R.layout.item_error_content);
        }
    }

    private void W6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23345, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.O = 0;
        this.f77988b0 = null;
        SearchView searchView = this.V;
        if (searchView != null) {
            searchView.f67174d.setText("");
            this.V.f67176f.setVisibility(8);
            this.V.getLayoutParams().width = ViewUtils.f(this.mContext, 83.0f);
            com.max.xiaoheihe.utils.d.E0(this.mContext, this.V.f67174d);
            this.V.f67174d.clearFocus();
        }
    }

    static /* synthetic */ void X3(MeHomeFragmentx meHomeFragmentx) {
        if (PatchProxy.proxy(new Object[]{meHomeFragmentx}, null, changeQuickRedirect, true, 23369, new Class[]{MeHomeFragmentx.class}, Void.TYPE).isSupported) {
            return;
        }
        meHomeFragmentx.T5();
    }

    private void X5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23363, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f77989c.A(0);
        this.f77989c.p(0);
    }

    private void X6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23337, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (P3.equals(this.f78020z)) {
            this.f77995h.setVisibility(8);
            this.f77996i.setVisibility(0);
            return;
        }
        this.f77995h.setVisibility(this.I.isEmpty() ? 8 : 0);
        this.f77996i.setVisibility(8);
        String str = this.X.get(this.B + this.f78020z);
        com.max.xiaoheihe.module.account.utils.l.N(this.f77995h, this.Y, "", str, new x(str), O3.equals(this.f78020z));
        if (O3.equals(this.f78020z)) {
            SearchView searchView = (SearchView) this.f77995h.findViewById(R.id.sv_game);
            this.V = searchView;
            EditText et_search = searchView.getEt_search();
            et_search.setFocusable(true);
            et_search.setFocusableInTouchMode(true);
            et_search.setImeOptions(3);
            this.V.f67176f.setOnClickListener(new y());
            et_search.setOnFocusChangeListener(new z());
            et_search.setOnEditorActionListener(new a0(et_search));
        }
    }

    @SuppressLint({"AutoDispose"})
    private void Y5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23283, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().r7(this.f78002o).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new p0()));
    }

    private void Y6(FollowingListObj followingListObj) {
        if (PatchProxy.proxy(new Object[]{followingListObj}, this, changeQuickRedirect, false, 23339, new Class[]{FollowingListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!P3.equals(this.f78020z)) {
            this.f77995h.setVisibility(0);
            this.f77996i.setVisibility(8);
            return;
        }
        this.f77995h.setVisibility(8);
        this.f77996i.setVisibility(0);
        if (followingListObj != null) {
            this.f77986a0 = followingListObj.getPush_type();
            if (!com.max.hbcommon.utils.c.w(followingListObj.getFilter_head()) && !com.max.hbcommon.utils.c.w(followingListObj.getFilters())) {
                followingListObj.getFilter_head().get(0).setMulti("1");
                followingListObj.getFilter_head().get(0).setData(followingListObj.getFilters().get(0).getFilters());
            }
            T6(this.f77996i, followingListObj);
            if (this.f78017y) {
                q7(followingListObj.getFilters());
                this.f78017y = false;
            }
        }
    }

    static /* synthetic */ void Z3(MeHomeFragmentx meHomeFragmentx) {
        if (PatchProxy.proxy(new Object[]{meHomeFragmentx}, null, changeQuickRedirect, true, 23370, new Class[]{MeHomeFragmentx.class}, Void.TYPE).isSupported) {
            return;
        }
        meHomeFragmentx.showError();
    }

    @SuppressLint({"AutoDispose"})
    private void Z6(View view, String str) {
        if (PatchProxy.proxy(new Object[]{view, str}, this, changeQuickRedirect, false, 23340, new Class[]{View.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().L0(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b0((TextView) view.findViewById(R.id.tv_online_state))));
    }

    static /* synthetic */ String a4(MeHomeFragmentx meHomeFragmentx) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{meHomeFragmentx}, null, changeQuickRedirect, true, 23371, new Class[]{MeHomeFragmentx.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : meHomeFragmentx.m6();
    }

    private void b7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23362, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String str = this.f78015x1.get(this.B);
        if (com.max.hbcommon.utils.c.u(str)) {
            this.f78020z = B6() ? O3 : P3;
        } else {
            this.f78020z = str;
        }
    }

    static /* synthetic */ View c5(MeHomeFragmentx meHomeFragmentx, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{meHomeFragmentx, new Integer(i10)}, null, changeQuickRedirect, true, 23391, new Class[]{MeHomeFragmentx.class, Integer.TYPE}, View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : meHomeFragmentx.findViewById(i10);
    }

    @SuppressLint({"AutoDispose"})
    private void c6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23301, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().L5(this.f78002o, r1.o0(this.B), this.O, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new j(this.B, this.B + this.f78020z)));
    }

    private void c7() {
        FollowingListObj followingListObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23319, new Class[0], Void.TYPE).isSupported || (followingListObj = this.f78004p1.get(h6())) == null) {
            return;
        }
        try {
            this.P = followingListObj.getFilter_head().get(0).getKey();
        } catch (Throwable unused) {
        }
    }

    static /* synthetic */ void d4(MeHomeFragmentx meHomeFragmentx) {
        if (PatchProxy.proxy(new Object[]{meHomeFragmentx}, null, changeQuickRedirect, true, 23372, new Class[]{MeHomeFragmentx.class}, Void.TYPE).isSupported) {
            return;
        }
        meHomeFragmentx.W6();
    }

    private View d6(KeyDescObj keyDescObj, TabLayout.h hVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{keyDescObj, hVar}, this, changeQuickRedirect, false, 23326, new Class[]{KeyDescObj.class, TabLayout.h.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View viewInflate = View.inflate(this.mContext, R.layout.item_text_view_2_padding, null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.text1);
        textView.setTextSize(1, 12.0f);
        if (hVar == null) {
            return viewInflate;
        }
        textView.setText(keyDescObj.getDesc());
        if (hVar.o()) {
            textView.setTextColor(this.mContext.getResources().getColor(R.color.text_primary_1_color));
            textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        } else {
            textView.setTextColor(this.mContext.getResources().getColor(R.color.text_secondary_1_color));
            textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
        }
        return viewInflate;
    }

    @SuppressLint({"AutoDispose"})
    private void d7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23311, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().l2(this.f77986a0, "1").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new n()));
    }

    static /* synthetic */ void e4(MeHomeFragmentx meHomeFragmentx) {
        if (PatchProxy.proxy(new Object[]{meHomeFragmentx}, null, changeQuickRedirect, true, 23373, new Class[]{MeHomeFragmentx.class}, Void.TYPE).isSupported) {
            return;
        }
        meHomeFragmentx.l7();
    }

    private View e6(KeyDescObj keyDescObj, TabLayout.h hVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{keyDescObj, hVar}, this, changeQuickRedirect, false, 23325, new Class[]{KeyDescObj.class, TabLayout.h.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View viewInflate = View.inflate(this.mContext, R.layout.item_button_drop_down, null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.text1);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.icon);
        textView.setText((com.max.hbcommon.utils.c.u(keyDescObj.getDesc()) && "1".equals(keyDescObj.getMulti()) && !com.max.hbcommon.utils.c.w(keyDescObj.getData())) ? keyDescObj.getData().get(0).getDesc() : keyDescObj.getDesc());
        textView.setTextSize(1, 12.0f);
        if (hVar == null) {
            return viewInflate;
        }
        if (hVar.o()) {
            textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            textView.setTextColor(this.mContext.getResources().getColor(R.color.text_primary_1_color));
            imageView.setImageTintList(ColorStateList.valueOf(this.mContext.getResources().getColor(R.color.text_primary_1_color)));
        } else {
            textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
            textView.setTextColor(this.mContext.getResources().getColor(R.color.text_secondary_1_color));
            imageView.setImageTintList(ColorStateList.valueOf(this.mContext.getResources().getColor(R.color.text_secondary_1_color)));
        }
        return viewInflate;
    }

    private void e7() {
        String string;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23332, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        boolean zEquals = P3.equals(this.f78020z);
        String str = this.X.get(this.B + this.f78020z);
        if (zEquals) {
            string = i6();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.B);
            sb2.append(this.f78020z);
            if (str == null) {
                str = "";
            }
            sb2.append(str);
            string = sb2.toString();
        }
        this.Y = this.Z.get(string);
        List<GameObj> list = this.N.get(string);
        if (com.max.hbcommon.utils.c.w(list)) {
            l7();
            n6();
            return;
        }
        Q6();
        if (!zEquals) {
            N6(list, string, false);
            return;
        }
        s7();
        Y6(this.f78004p1.get(h6()));
        this.I.clear();
        this.I.addAll(list);
        this.C.notifyDataSetChanged();
        if (this.I.isEmpty()) {
            j7();
        } else {
            W5();
        }
    }

    static /* synthetic */ void f4(MeHomeFragmentx meHomeFragmentx) {
        if (PatchProxy.proxy(new Object[]{meHomeFragmentx}, null, changeQuickRedirect, true, 23374, new Class[]{MeHomeFragmentx.class}, Void.TYPE).isSupported) {
            return;
        }
        meHomeFragmentx.q6();
    }

    @SuppressLint({"AutoDispose"})
    private void f6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23306, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Ra(this.f78002o, this.f78001n.getDota2_platform_info() != null ? this.f78001n.getDota2_platform_info().getSteam_id() : null, "1").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new l()));
    }

    private void f7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23335, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LinearLayout linearLayout = this.S;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        View view = this.T;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.U;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    static /* synthetic */ void g4(MeHomeFragmentx meHomeFragmentx, List list, String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{meHomeFragmentx, list, str, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 23375, new Class[]{MeHomeFragmentx.class, List.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        meHomeFragmentx.N6(list, str, z10);
    }

    static /* synthetic */ void g5(MeHomeFragmentx meHomeFragmentx) {
        if (PatchProxy.proxy(new Object[]{meHomeFragmentx}, null, changeQuickRedirect, true, 23392, new Class[]{MeHomeFragmentx.class}, Void.TYPE).isSupported) {
            return;
        }
        meHomeFragmentx.y6();
    }

    @SuppressLint({"AutoDispose"})
    private void g6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23307, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().t(this.f78002o, this.f78001n.getDota2_platform_info() != null ? this.f78001n.getDota2_platform_info().getSteam_id() : null, this.O, 30, "follows").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new m()));
    }

    private void g7() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23314, new Class[0], Void.TYPE).isSupported && this.f78019y2 == null) {
            com.max.hbcommon.component.curtain.c cVarA = new com.max.hbcommon.component.curtain.c.b().b(1, v6()).b(2, u6()).a();
            this.f78019y2 = cVarA;
            cVarA.i(new o());
        }
    }

    private Map<String, String> getFilter() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23327, new Class[0], Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        HashMap map = new HashMap(16);
        map.put("filter_head", this.P);
        List<KeyDescObj> list = this.Q;
        if (list != null && !this.f78017y) {
            map.put(this.R, com.max.xiaoheihe.utils.d.N(list).getKey());
        }
        return map;
    }

    static /* synthetic */ void h4(MeHomeFragmentx meHomeFragmentx) {
        if (PatchProxy.proxy(new Object[]{meHomeFragmentx}, null, changeQuickRedirect, true, 23376, new Class[]{MeHomeFragmentx.class}, Void.TYPE).isSupported) {
            return;
        }
        meHomeFragmentx.W5();
    }

    static /* synthetic */ boolean h5(MeHomeFragmentx meHomeFragmentx, KeyDescObj keyDescObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{meHomeFragmentx, keyDescObj}, null, changeQuickRedirect, true, 23393, new Class[]{MeHomeFragmentx.class, KeyDescObj.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : meHomeFragmentx.G6(keyDescObj);
    }

    private String h6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23310, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        KeyDescObj keyDescObjN = com.max.xiaoheihe.utils.d.N(this.Q);
        String key = keyDescObjN == null ? null : keyDescObjN.getKey();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(P3);
        if (key == null) {
            key = "";
        }
        sb2.append(key);
        return sb2.toString();
    }

    private void h7(boolean z10, boolean z11) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (!PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 23321, new Class[]{cls, cls}, Void.TYPE).isSupported && (getParentFragment() instanceof MehomefragmentV2)) {
            RelativeLayout relativeLayout = ((MehomefragmentV2) getParentFragment()).vg_horn;
            if (z10) {
                if (relativeLayout.getVisibility() != 0 || relativeLayout.getAlpha() < 1.0f) {
                    new Handler().postDelayed(new r(relativeLayout, 500), 2000L);
                    return;
                }
                return;
            }
            if (!z11) {
                relativeLayout.setVisibility(8);
            } else if (relativeLayout.getAlpha() > 0.0f) {
                com.max.hbutils.anim.b.c(relativeLayout, 500, false);
            }
        }
    }

    static /* synthetic */ void i5(MeHomeFragmentx meHomeFragmentx, KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{meHomeFragmentx, keyDescObj}, null, changeQuickRedirect, true, 23394, new Class[]{MeHomeFragmentx.class, KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        meHomeFragmentx.U5(keyDescObj);
    }

    private String i6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23309, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        KeyDescObj keyDescObjN = com.max.xiaoheihe.utils.d.N(this.Q);
        String key = keyDescObjN == null ? null : keyDescObjN.getKey();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(P3);
        String str = this.P;
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        if (key == null) {
            key = "";
        }
        sb2.append(key);
        return sb2.toString();
    }

    private void i7(DialogMsgObj dialogMsgObj) {
        if (PatchProxy.proxy(new Object[]{dialogMsgObj}, this, changeQuickRedirect, false, 23359, new Class[]{DialogMsgObj.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(this.mContext);
        fVar.y(dialogMsgObj.getTitle());
        fVar.l(dialogMsgObj.getDesc());
        com.max.hbcommon.view.a aVarD = fVar.d();
        aVarD.w(true);
        aVarD.u(dialogMsgObj.getButton(), new i0());
        aVarD.show();
    }

    static /* synthetic */ void j5(MeHomeFragmentx meHomeFragmentx) {
        if (PatchProxy.proxy(new Object[]{meHomeFragmentx}, null, changeQuickRedirect, true, 23395, new Class[]{MeHomeFragmentx.class}, Void.TYPE).isSupported) {
            return;
        }
        meHomeFragmentx.e7();
    }

    @SuppressLint({"AutoDispose"})
    private void j6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23305, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String strI6 = i6();
        Map<String, String> filter = getFilter();
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Gb(this.f78002o, this.O, 30, filter).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new k(filter, strI6)));
    }

    private void j7() {
        Activity activity;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23292, new Class[0], Void.TYPE).isSupported || !isActive() || (activity = this.mContext) == null) {
            return;
        }
        activity.runOnUiThread(new e());
    }

    @SuppressLint({"AutoDispose"})
    private void k6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23341, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().H8(this.f78002o, this.f78003p).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c0(this.f77989c.getState() == RefreshState.Refreshing)));
    }

    private void k7() {
        Activity activity;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23294, new Class[0], Void.TYPE).isSupported || !isActive() || (activity = this.mContext) == null) {
            return;
        }
        activity.runOnUiThread(new g());
    }

    private String l6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23285, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "game_list_" + com.max.xiaoheihe.utils.i0.j() + this.B + this.f78020z;
    }

    private void l7() {
        Activity activity;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23293, new Class[0], Void.TYPE).isSupported || !isActive() || (activity = this.mContext) == null) {
            return;
        }
        activity.runOnUiThread(new f());
    }

    private String m6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23284, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "home_data_" + com.max.xiaoheihe.utils.i0.j();
    }

    private void m7(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23318, new Class[]{View.class}, Void.TYPE).isSupported || this.mContext.isFinishing() || this.Q == null) {
            return;
        }
        ImageView imageView = this.f77993f;
        if (imageView != null) {
            imageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
        }
        ArrayList arrayList = new ArrayList();
        for (KeyDescObj keyDescObj : this.Q) {
            KeyDescObj keyDescObj2 = new KeyDescObj();
            keyDescObj2.setDesc(keyDescObj.getDesc());
            keyDescObj2.setKey(keyDescObj.getKey());
            keyDescObj2.setChecked(keyDescObj.isChecked());
            arrayList.add(keyDescObj2);
        }
        HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(this.mContext, arrayList);
        heyBoxPopupMenu.R(new p(view));
        heyBoxPopupMenu.setOnDismissListener(new q());
        heyBoxPopupMenu.show();
    }

    private void n6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23289, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        o6(Boolean.FALSE);
    }

    private void n7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23336, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LinearLayout linearLayout = this.S;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        View view = this.T;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.U;
        if (view2 != null) {
            view2.setVisibility(0);
            P6();
        }
    }

    static /* synthetic */ void o5(MeHomeFragmentx meHomeFragmentx) {
        if (PatchProxy.proxy(new Object[]{meHomeFragmentx}, null, changeQuickRedirect, true, 23396, new Class[]{MeHomeFragmentx.class}, Void.TYPE).isSupported) {
            return;
        }
        meHomeFragmentx.d7();
    }

    @SuppressLint({"AutoDispose"})
    private void o6(Boolean bool) {
        HomeDataObj homeDataObj;
        if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 23290, new Class[]{Boolean.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.O == 0) {
            Q6();
        }
        if (r1.N0(this.B)) {
            if (!"dota2".equals(this.B) || (homeDataObj = this.f78001n) == null || homeDataObj.getDota2_platform_info() == null || !this.f78001n.getDota2_platform_info().is_bind().booleanValue()) {
                if (this.C.y() != null) {
                    this.C.y().getDataList().clear();
                }
                this.C.notifyDataSetChanged();
                X5();
                return;
            }
            if ("user".equals(this.A)) {
                g6();
                return;
            } else {
                f6();
                return;
            }
        }
        String str = this.B + this.f78020z;
        if (P3.equals(this.f78020z)) {
            j6();
            return;
        }
        if (Q3.equals(this.f78020z)) {
            s6();
            return;
        }
        if (R3.equals(this.f78020z)) {
            c6();
        } else if (bool.booleanValue()) {
            addDisposable((io.reactivex.disposables.b) com.max.hbcache.b.f(l6(), GameObj.class).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(str)));
        } else {
            q6();
        }
    }

    private void o7(DialogMsgObj dialogMsgObj) {
        if (PatchProxy.proxy(new Object[]{dialogMsgObj}, this, changeQuickRedirect, false, 23358, new Class[]{DialogMsgObj.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(this.mContext);
        fVar.y(dialogMsgObj.getTitle());
        fVar.l(dialogMsgObj.getDesc());
        com.max.hbcommon.view.a aVarD = fVar.d();
        aVarD.w(true);
        aVarD.u(dialogMsgObj.getButton(), new h0());
        aVarD.show();
    }

    private int p6(String str) {
        int i10 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 23342, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<PlayerRankObj> list = this.f78008r;
        if (list != null && str != null) {
            Iterator<PlayerRankObj> it = list.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getGameid())) {
                    i10++;
                }
            }
        }
        return i10;
    }

    private void p7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23354, new Class[0], Void.TYPE).isSupported || r1.h0(this.f78001n).isBindXbox() || this.f78001n == null) {
            return;
        }
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) this.f77994g.findViewById(R.id.cp_loading);
        View viewFindViewById = this.f77994g.findViewById(R.id.tv_bind_btn);
        if (circularProgressIndicator != null) {
            circularProgressIndicator.p();
        }
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    static /* synthetic */ void q4(MeHomeFragmentx meHomeFragmentx) {
        if (PatchProxy.proxy(new Object[]{meHomeFragmentx}, null, changeQuickRedirect, true, 23377, new Class[]{MeHomeFragmentx.class}, Void.TYPE).isSupported) {
            return;
        }
        meHomeFragmentx.z6();
    }

    static /* synthetic */ void q5(MeHomeFragmentx meHomeFragmentx, boolean z10, boolean z11) {
        Object[] objArr = {meHomeFragmentx, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 23397, new Class[]{MeHomeFragmentx.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        meHomeFragmentx.h7(z10, z11);
    }

    @SuppressLint({"AutoDispose"})
    private void q6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23296, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) r6().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h(this.B, this.B + this.f78020z + "")));
    }

    private void q7(List<FiltersObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 23320, new Class[]{List.class}, Void.TYPE).isSupported || list == null || list.size() <= 0) {
            return;
        }
        this.Q = new ArrayList();
        List<KeyDescObj> filters = list.get(0).getFilters();
        this.R = list.get(0).getKey();
        if (filters == null || filters.size() <= 0) {
            return;
        }
        for (int i10 = 0; i10 < filters.size(); i10++) {
            KeyDescObj keyDescObj = filters.get(i10);
            keyDescObj.setIndex(i10);
            if (i10 == 0) {
                keyDescObj.setChecked(true);
            } else {
                keyDescObj.setChecked(false);
            }
            this.Q.add(keyDescObj);
        }
    }

    private io.reactivex.z<Result<MyGameListObj>> r6() {
        byte b10 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23298, new Class[0], io.reactivex.z.class);
        if (patchProxyResultProxy.isSupported) {
            return (io.reactivex.z) patchProxyResultProxy.result;
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str = this.X.get(this.B + this.f78020z);
        String str2 = this.B;
        str2.hashCode();
        switch (str2.hashCode()) {
            case -889473228:
                if (!str2.equals("switch")) {
                    b10 = -1;
                }
                break;
            case 3119877:
                b10 = !str2.equals("epic") ? (byte) -1 : (byte) 1;
                break;
            case 538159775:
                b10 = !str2.equals(GameObj.PLATFORM_XBOX) ? (byte) -1 : (byte) 2;
                break;
            case 1251955023:
                b10 = !str2.equals(GameObj.PLATFORM_PS) ? (byte) -1 : (byte) 3;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return eVarA.j2(this.f78002o, this.O, 30, str, "Android", this.f77988b0);
            case 1:
                return eVarA.U4(this.f78002o, this.O, 30, this.f77988b0);
            case 2:
                return eVarA.D7(this.f78002o, this.O, 30, str, this.f77988b0);
            case 3:
                return eVarA.A2(this.f78002o, this.O, 30, str, this.f77988b0);
            default:
                return eVarA.E2(this.f78002o, this.f78003p, this.O, 30, str, this.f77988b0);
        }
    }

    @SuppressLint({"AutoDispose"})
    private void r7() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23347, new Class[0], Void.TYPE).isSupported && this.f78013w) {
            this.f78013w = false;
            addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().G7("info", this.f78003p, this.f78002o).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e0()));
        }
    }

    @SuppressLint({"AutoDispose"})
    private void s6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23299, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().k9(this.f78002o, r1.o0(this.B), this.O, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i(this.B, this.B + this.f78020z)));
    }

    @SuppressLint({"AutoDispose"})
    private void t6(String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 23343, new Class[]{String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.x("MeHomeFragmentx, getMineAndFriendState, mSteamId = " + this.f78003p + ", url = " + str);
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.module.account.mine.l.f79078a.c(str, z10).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d0(this)));
    }

    private void t7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23275, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        da daVarC = da.c(getLayoutInflater());
        this.f77987b = daVarC;
        setContentView(daVarC);
        da daVar = this.f77987b;
        this.f77989c = daVar.f109706e;
        this.f77991d = daVar.f109705d;
        this.f77992e = daVar.f109703b;
        s00 s00Var = daVar.f109704c;
        this.f77994g = s00Var.f115366i;
        this.U = s00Var.f115362e;
        this.f77995h = s00Var.f115373p.b();
        this.f77996i = this.f77987b.f109704c.f115365h.b();
        s00 s00Var2 = this.f77987b.f109704c;
        this.f77997j = s00Var2.f115360c;
        this.f77998k = s00Var2.f115368k;
        this.f77999l = s00Var2.f115372o.b();
        this.f78000m = this.f77987b.f109704c.f115371n.b();
        new OneTimeValidExposureViewWatcher(this, this.f77987b.f109704c.f115368k);
    }

    static /* synthetic */ boolean u4(MeHomeFragmentx meHomeFragmentx, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{meHomeFragmentx, str}, null, changeQuickRedirect, true, 23378, new Class[]{MeHomeFragmentx.class, String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : meHomeFragmentx.D6(str);
    }

    private com.max.hbcommon.component.curtain.b u6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23317, new Class[0], com.max.hbcommon.component.curtain.b.class);
        return patchProxyResultProxy.isSupported ? (com.max.hbcommon.component.curtain.b) patchProxyResultProxy.result : new com.max.hbcommon.component.curtain.b((FragmentActivity) this.mContext).q(findViewById(R.id.vp_mini_app), com.max.hbcommon.component.curtain.i.a(ViewUtils.f(this.mContext, 4.0f))).k(R.layout.layout_pure_empty);
    }

    static /* synthetic */ void v4(MeHomeFragmentx meHomeFragmentx) {
        if (PatchProxy.proxy(new Object[]{meHomeFragmentx}, null, changeQuickRedirect, true, 23379, new Class[]{MeHomeFragmentx.class}, Void.TYPE).isSupported) {
            return;
        }
        meHomeFragmentx.X5();
    }

    private com.max.hbcommon.component.curtain.b v6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23316, new Class[0], com.max.hbcommon.component.curtain.b.class);
        return patchProxyResultProxy.isSupported ? (com.max.hbcommon.component.curtain.b) patchProxyResultProxy.result : new com.max.hbcommon.component.curtain.b((FragmentActivity) this.mContext).q(this.f77994g.findViewById(R.id.vg_container), com.max.hbcommon.component.curtain.i.a(ViewUtils.f(this.mContext, 4.0f))).k(R.layout.layout_pure_empty);
    }

    static /* synthetic */ void w4(MeHomeFragmentx meHomeFragmentx) {
        if (PatchProxy.proxy(new Object[]{meHomeFragmentx}, null, changeQuickRedirect, true, 23380, new Class[]{MeHomeFragmentx.class}, Void.TYPE).isSupported) {
            return;
        }
        meHomeFragmentx.k7();
    }

    private void w6(MyGameListObj myGameListObj) {
        if (PatchProxy.proxy(new Object[]{myGameListObj}, this, changeQuickRedirect, false, 23303, new Class[]{MyGameListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.Y = myGameListObj.getTh_list();
        if (myGameListObj.getSelected_sort() != null) {
            this.X.put(this.B + this.f78020z, myGameListObj.getSelected_sort());
        }
    }

    static /* synthetic */ void x4(MeHomeFragmentx meHomeFragmentx, MyGameListObj myGameListObj) {
        if (PatchProxy.proxy(new Object[]{meHomeFragmentx, myGameListObj}, null, changeQuickRedirect, true, 23381, new Class[]{MeHomeFragmentx.class, MyGameListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        meHomeFragmentx.w6(myGameListObj);
    }

    @SuppressLint({"AutoDispose"})
    private void x6(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 23348, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().K("info", null, this.f78002o).w1((i10 - 1) * 2, TimeUnit.SECONDS).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f0(i10)));
    }

    static /* synthetic */ String y4(MeHomeFragmentx meHomeFragmentx) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{meHomeFragmentx}, null, changeQuickRedirect, true, 23382, new Class[]{MeHomeFragmentx.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : meHomeFragmentx.l6();
    }

    private void y6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23315, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        BubbleTipPopup bubbleTipPopup = this.f78005p2;
        if (bubbleTipPopup != null) {
            bubbleTipPopup.G();
        }
        BubbleTipPopup bubbleTipPopup2 = this.f78016x2;
        if (bubbleTipPopup2 != null) {
            bubbleTipPopup2.G();
        }
        this.f78005p2 = null;
        this.f78016x2 = null;
    }

    static /* synthetic */ int z5(MeHomeFragmentx meHomeFragmentx, int i10) {
        int i11 = meHomeFragmentx.O + i10;
        meHomeFragmentx.O = i11;
        return i11;
    }

    private void z6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23338, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f77995h.setVisibility(8);
        this.f77996i.setVisibility(8);
    }

    @Override // com.max.xiaoheihe.module.account.mine.k
    public void B(@androidx.annotation.n0 com.max.xiaoheihe.module.account.mine.c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 23330, new Class[]{com.max.xiaoheihe.module.account.mine.c.class}, Void.TYPE).isSupported) {
            return;
        }
        this.G3 = cVar;
        cVar.a(this.f78007q);
    }

    @Override // com.max.xiaoheihe.module.account.GameBindingFragment.n
    public void B1(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 23351, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.mIsVisible && !this.mFragmentHidden) {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.logging_data_succuess));
        }
        com.max.xiaoheihe.utils.d.x1(this.mContext);
        onRefresh();
    }

    @Override // com.max.xiaoheihe.module.account.GameBindingFragment.n
    public void C0(String str, Throwable th2) {
        if (PatchProxy.proxy(new Object[]{str, th2}, this, changeQuickRedirect, false, 23350, new Class[]{String.class, Throwable.class}, Void.TYPE).isSupported) {
            return;
        }
        th2.printStackTrace();
        com.max.heybox.hblog.g.x("MeHomeFragmentx, onBindFailed, gameType = " + str + ", " + Log.getStackTraceString(new Throwable()));
        if (GameBindingFragment.f77868u.equals(th2.getMessage()) || GameBindingFragment.f77867t.equals(th2.getMessage())) {
            com.max.xiaoheihe.view.l.D(this.mContext, "", com.max.xiaoheihe.utils.d.n0(R.string.bind_pubg_fail_message), com.max.xiaoheihe.utils.d.n0(R.string.confirm), null, new g0());
        } else {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.logging_data_fail));
        }
    }

    public void L6(HomeDataObj homeDataObj) {
        if (PatchProxy.proxy(new Object[]{homeDataObj}, this, changeQuickRedirect, false, 23312, new Class[]{HomeDataObj.class}, Void.TYPE).isSupported) {
            return;
        }
        M6(homeDataObj, false);
    }

    public void M6(HomeDataObj homeDataObj, boolean z10) {
        if (!PatchProxy.proxy(new Object[]{homeDataObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 23313, new Class[]{HomeDataObj.class, Boolean.TYPE}, Void.TYPE).isSupported && isActive()) {
            this.f78001n = homeDataObj;
            if (homeDataObj != null && homeDataObj.getSteam_id_info() != null) {
                this.f78003p = this.f78001n.getSteam_id_info().getSteamid() == null ? "-1" : this.f78001n.getSteam_id_info().getSteamid();
            }
            b7();
            HomeDataObj homeDataObj2 = this.f78001n;
            if (homeDataObj2 != null) {
                if (!com.max.hbcommon.utils.c.w(homeDataObj2.getPlatform_list())) {
                    r1.J1(this.f78001n.getPlatform_list());
                }
                if (this.f77990c0) {
                    this.f77990c0 = false;
                    if (!this.f78012v) {
                        String strV = r1.V(this.f78001n);
                        this.B = strV;
                        if (strV == null) {
                            this.B = GameObj.PLATFORM_STEAM;
                        }
                        n6();
                    } else if (!z10) {
                        n6();
                    }
                    l7();
                } else {
                    n6();
                }
                showContentView();
                if (this.f78012v) {
                    User userI = com.max.xiaoheihe.utils.i0.i();
                    userI.setGameAccountInfo(this.f78001n);
                    userI.setInvite_info(this.f78001n.getInvite_info());
                    com.max.xiaoheihe.utils.i0.z(com.max.xiaoheihe.utils.i0.o());
                }
                this.f78014x = (this.f78001n.getSteam_id_info() == null || com.max.hbcommon.utils.c.u(this.f78001n.getSteam_id_info().getSteamid())) ? false : true;
                P6();
                R6(false);
                V5();
                if (this.f78014x && !z10) {
                    k6();
                }
                X6();
                P6();
                if (this.f78012v) {
                    this.f77998k.setVisibility(0);
                    com.max.xiaoheihe.module.account.utils.f.d(this.f77999l, com.max.xiaoheihe.module.account.utils.f.f79302a, this.f78001n.getTask_desc(), this.G2, null, "1".equals(this.f78001n.getTask_red_point()));
                    com.max.xiaoheihe.module.account.utils.f.c(this.f78000m, com.max.xiaoheihe.module.account.utils.f.f79303b, this.f78001n.getStore_desc(), this.f78006p3, null);
                } else {
                    this.f77998k.setVisibility(8);
                }
                s7();
            } else {
                this.f77989c.A(0);
                showError();
            }
            HomeDataObj homeDataObj3 = this.f78001n;
            if (homeDataObj3 == null || !com.max.hbcommon.utils.c.x(homeDataObj3.getIs_bind_dota2())) {
                return;
            }
            ImageCacheManager.i().g(ImageCacheManager.f87358e);
        }
    }

    public void U6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23333, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String strO = com.max.hbcache.c.o(com.max.hbcache.c.Q, "-1");
        if ("-1".equals(strO)) {
            S6();
        } else if ("0".equals(strO)) {
            f7();
        } else {
            n7();
        }
    }

    @SuppressLint({"AutoDispose"})
    public void Z5(Boolean bool) {
        if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 23286, new Class[]{Boolean.class}, Void.TYPE).isSupported) {
            return;
        }
        if (bool.booleanValue()) {
            addDisposable((io.reactivex.disposables.b) com.max.hbcache.b.a(m6(), HomeDataObj.class).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new q0()));
        } else {
            T5();
        }
    }

    public void a6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23281, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        b6(Boolean.FALSE);
    }

    public void a7(String str) {
        String str2;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 23361, new Class[]{String.class}, Void.TYPE).isSupported || (str2 = this.B) == null || str2.equals(str)) {
            return;
        }
        this.B = str;
        com.max.hbcache.c.C(com.max.hbcache.c.f66158y, str);
        W6();
        this.f77994g.c(this.f78001n, this.f78009s, this.B, new j0(), this, this);
        n6();
    }

    public void b6(Boolean bool) {
        if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 23282, new Class[]{Boolean.class}, Void.TYPE).isSupported) {
            return;
        }
        W6();
        if (com.max.xiaoheihe.module.account.utils.c.c(this.f78002o) == 2) {
            Y5();
        } else {
            Z5(bool);
        }
    }

    @Override // com.max.xiaoheihe.module.account.GameBindingFragment.n
    public boolean g2(String str, View view, EditText editText) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, view, editText}, this, changeQuickRedirect, false, 23349, new Class[]{String.class, View.class, EditText.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (lb.a.T0.equals(str)) {
            com.max.xiaoheihe.module.account.utils.l.B(lb.a.T0, getCompositeDisposable(), this.mContext, this, false, true, 5);
            return true;
        }
        if ("csgo".equals(str)) {
            com.max.xiaoheihe.module.account.utils.l.B("csgo", getCompositeDisposable(), this.mContext, this, false, true, 6);
            return true;
        }
        if (!lb.a.V0.equals(str)) {
            return false;
        }
        com.max.xiaoheihe.module.account.utils.l.B(lb.a.V0, getCompositeDisposable(), this.mContext, this, false, true, 7);
        return true;
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @androidx.annotation.p0
    public String getPagePath() {
        if (this.mContext instanceof MainActivity) {
            return lb.d.f131269v1;
        }
        return null;
    }

    @Override // com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23280, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        b6(Boolean.TRUE);
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23276, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        t7();
        A6();
        String string = null;
        if (getArguments() != null) {
            this.f78002o = getArguments().getString(L3);
            this.f78003p = getArguments().getString("steam_id");
            this.f78001n = (HomeDataObj) getArguments().getSerializable(N3);
            string = getArguments().getString(MainActivity.C4);
        }
        this.f78012v = com.max.xiaoheihe.module.account.utils.c.c(this.f78002o) == 1;
        J6();
        if (string != null) {
            String strQ0 = r1.q0(string);
            this.B = strQ0;
            com.max.hbcache.c.C(com.max.hbcache.c.f66158y, strQ0);
        } else {
            boolean z10 = this.f78012v;
            String strO = GameObj.PLATFORM_STEAM;
            if (z10) {
                strO = com.max.hbcache.c.o(com.max.hbcache.c.f66158y, GameObj.PLATFORM_STEAM);
            }
            this.B = strO;
        }
        this.f77991d.setBackgroundColor(getResources().getColor(R.color.background_layer_2_color));
        this.f77991d.setLayoutManager(new LinearLayoutManager(this.mContext));
        r0 r0Var = new r0();
        this.D = r0Var;
        this.C = new com.max.hbcommon.base.adapter.t(r0Var);
        this.E = new a(this.mContext, this.J, R.layout.item_game_overview_follow_match);
        this.F = new v(this.mContext, this.K, R.layout.item_game_overview_auth);
        this.f77991d.setAdapter(this.C);
        this.f78018y1 = new com.max.xiaoheihe.module.game.adapter.v(this, this.f77991d);
        this.M = this.f77987b.f109704c.f115374q;
        this.H = new w();
        this.M.j0(getLifecycle()).R(this.H).k();
        this.M.J(this.L);
        this.M.V(ViewUtils.f(getContext(), 2.0f));
        this.M.e0(4);
        this.M.Y(getResources().getColor(R.color.divider_primary_1_not_change_color), getResources().getColor(R.color.brand_color));
        this.M.c0(ViewUtils.f(getContext(), 8.0f));
        this.M.Z(ViewUtils.f(getContext(), 6.0f));
        this.M.S(false);
        this.M.W(0, ViewUtils.f(getContext(), 9.0f), 0, 0);
        this.f77989c.S(new l0());
        this.f77989c.f0(new m0());
        this.f77992e.setOnVerticalScrollChangeListener(new n0());
        if (!this.f78012v || MehomefragmentV2.K == null) {
            this.f77987b.f109704c.f115359b.setVisibility(8);
        } else {
            this.f77987b.f109704c.f115359b.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = this.f77987b.f109704c.f115359b.getLayoutParams();
            layoutParams.height = ((ViewUtils.L(this.mContext) - ViewUtils.f(this.mContext, 8.0f)) * 70) / bb.c.b.f30579d4;
            this.f77987b.f109704c.f115359b.setLayoutParams(layoutParams);
            com.max.hbimage.b.K(MehomefragmentV2.K.getImg(), this.f77987b.f109704c.f115359b);
            this.f77987b.f109704c.f115359b.setOnClickListener(new o0());
        }
        if (this.mIsFirst) {
            showTopLoading(200);
        }
    }

    @Override // com.max.xiaoheihe.module.account.GameBindingFragment.n
    public void m1(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 23352, new Class[]{String.class}, Void.TYPE).isSupported || !this.mIsVisible || this.mFragmentHidden) {
            return;
        }
        com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
        com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.unbind_data_succuess));
        com.max.xiaoheihe.utils.d.y1(this.mContext, lb.a.f131068x0);
        onRefresh();
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    public boolean o3() {
        return !(this.mContext instanceof MainActivity);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 23346, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i10 == 291) {
            onRefresh();
            return;
        }
        if (i10 == 5 && i11 == -1) {
            GameBindingFragment gameBindingFragment = (GameBindingFragment) getChildFragmentManager().r0(R.id.vg_bind_card_container);
            if (gameBindingFragment != null) {
                gameBindingFragment.p4(lb.a.T0);
                return;
            }
            return;
        }
        if (i10 == 6 && i11 == -1) {
            GameBindingFragment gameBindingFragment2 = (GameBindingFragment) getChildFragmentManager().r0(R.id.vg_bind_card_container);
            if (gameBindingFragment2 != null) {
                gameBindingFragment2.p4("csgo");
                return;
            }
            return;
        }
        if (i10 == 7 && i11 == -1) {
            GameBindingFragment gameBindingFragment3 = (GameBindingFragment) getChildFragmentManager().r0(R.id.vg_bind_card_container);
            if (gameBindingFragment3 != null) {
                gameBindingFragment3.p4(lb.a.V0);
                return;
            }
            return;
        }
        if (i10 == 0 && i11 == -1 && P3.equals(this.f78020z)) {
            j6();
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23355, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Z3 = false;
        y6();
        super.onDestroyView();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23344, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showTopLoading(200);
        a6();
    }

    @Override // com.max.hbcommon.base.d
    public void onRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23279, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRegisterReceiver();
        a aVar = null;
        UserProfileUpdatedBroadcastReceiver userProfileUpdatedBroadcastReceiver = new UserProfileUpdatedBroadcastReceiver(this, aVar);
        this.f78010t = userProfileUpdatedBroadcastReceiver;
        registerReceiver(userProfileUpdatedBroadcastReceiver, lb.a.f131055v);
        registerReceiver(this.f78010t, lb.a.X);
        UserBindGameCardTypeBroadcastReceiver userBindGameCardTypeBroadcastReceiver = new UserBindGameCardTypeBroadcastReceiver(this, aVar);
        this.f78011u = userBindGameCardTypeBroadcastReceiver;
        registerReceiver(userBindGameCardTypeBroadcastReceiver, lb.a.P);
    }

    @Override // com.max.hbcommon.base.d
    public void onUnRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23356, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onUnRegisterReceiver();
        unregisterReceiver(this.f78010t);
        unregisterReceiver(this.f78011u);
    }

    public void s7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23364, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setDesc(getString(R.string.followed_games));
        keyDescObj.setKey(P3);
        arrayList.add(keyDescObj);
        if (B6()) {
            KeyDescObj keyDescObj2 = new KeyDescObj();
            keyDescObj2.setDesc(getString(R.string.owned_games));
            keyDescObj2.setKey(O3);
            keyDescObj2.setShowIcon(true);
            keyDescObj2.setIconId(r1.m0(this.B));
            arrayList.add(keyDescObj2);
            if (!this.B.equals("switch")) {
                KeyDescObj keyDescObj3 = new KeyDescObj();
                keyDescObj3.setDesc("完美通关");
                keyDescObj3.setKey(Q3);
                arrayList.add(keyDescObj3);
            }
        }
        KeyDescObj keyDescObj4 = new KeyDescObj();
        keyDescObj4.setDesc(getResources().getString(this.f78012v ? R.string.my_comment : R.string.other_comment));
        keyDescObj4.setKey(R3);
        arrayList.add(keyDescObj4);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            String str = this.f78020z;
            if (str == null || !str.equals(((KeyDescObj) arrayList.get(i10)).getKey())) {
                ((KeyDescObj) arrayList.get(i10)).setChecked(false);
            } else {
                ((KeyDescObj) arrayList.get(i10)).setChecked(true);
            }
        }
        this.f77997j.setData(arrayList);
        this.f77997j.setMOnTabCheckedListener(new k0());
        this.f77997j.d();
    }

    @Override // com.max.xiaoheihe.module.account.GameBindingFragment.n
    public void u1(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 23353, new Class[]{String.class}, Void.TYPE).isSupported && "xbox".equals(str) && this.B.equals(GameObj.PLATFORM_XBOX)) {
            p7();
        }
    }

    @Override // com.max.xiaoheihe.module.account.GameBindingFragment.n
    public /* synthetic */ void w2(String str, Throwable th2) {
        com.max.xiaoheihe.module.account.e.a(this, str, th2);
    }
}
