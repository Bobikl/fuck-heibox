package com.max.xiaoheihe.module.game;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.EncryptionParamsObj;
import com.max.hbcustomview.ProgressBgView;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.game.AutoAcceptGameParamsObj;
import com.max.xiaoheihe.bean.mall.MallOrderStateObj;
import com.max.xiaoheihe.bean.proxy.ProxyAddressObj;
import com.max.xiaoheihe.module.trade.TradeInfoUtilKt;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.analytics.MobclickAgent;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Cookie;

/* JADX INFO: loaded from: classes11.dex */
public class GameStoreSteamTradingActivityV2 extends BaseActivity {
    private static final String T3 = "steam_id";
    private static final String U3 = "order_id";
    private static final String V3 = "auto_accept_game_params";
    private static final String W3 = "https://store.steampowered.com/account/";
    private static final String X3 = "https://steamcommunity.com/invites/ajaxredeem?sessionid=%s&steamid_user=%s&invite_token=%s";
    private static final String Y3 = "status_not_invite_friend";
    private static final String Z3 = "status_invite_friend";

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private static final String f85161a4 = "status_accept_friend";

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private static final String f85162b4 = "status_invite_gift";

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private static final String f85163c4 = "status_accept_gift_succeed";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    private static final String f85164d4 = "status_accept_gift_failed";

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    private static final String f85165e4 = "status_accept_gift_declined";

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private static final String f85166f4 = "status_community_relogin";

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    private static final String f85167g4 = "status_community_login";

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    private static final String f85168h4 = "status_store_relogin";

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    private static final String f85169i4 = "status_store_login";

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    private static final String f85170j4 = "status_invite_friend_timeout";

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    private static final String f85171k4 = "status_invite_gift_timeout";

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    private static final String f85172l4 = "status_not_activate_cdkey";

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    private static final String f85173m4 = "status_activating_cdkey";

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    private static final String f85174n4 = "status_activate_cdkey_succeed";

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    private static final String f85175o4 = "status_activate_cdkey_failed";

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    private static final String f85176p4 = "step_waiting";

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    private static final String f85177q4 = "step_ongoing";

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    private static final String f85178r4 = "step_completed";

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    private static final String f85179s4 = "step_timeout";

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    private static Handler f85180t4 = new Handler(Looper.getMainLooper());
    private String J3;
    private b2 K3;
    ProgressBar L;
    private int L3;
    TextView M;
    private int M3;
    View N;
    TextView O;
    TextView P;
    private okhttp3.z P3;
    TextView Q;
    private okhttp3.z Q3;
    ProgressBgView R;
    View S;
    TextView T;
    TextView U;
    TextView V;
    ProgressBgView W;
    View X;
    TextView Y;
    TextView Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    TextView f85181a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    ProgressBgView f85182b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    View f85183c0;

    @BindView(R.id.progress_bar_l_0)
    View mProgressBarL0;

    @BindView(R.id.progress_bar_l_1)
    View mProgressBarL1;

    @BindView(R.id.progress_bar_l_2)
    View mProgressBarL2;

    @BindView(R.id.progress_bar_r_0)
    View mProgressBarR0;

    @BindView(R.id.progress_bar_r_1)
    View mProgressBarR1;

    @BindView(R.id.progress_bar_r_2)
    View mProgressBarR2;

    @BindView(R.id.vg_progress_bar)
    View mProgressBarView;

    @BindView(R.id.tv_progress_desc_0)
    TextView mProgressDesc0;

    @BindView(R.id.tv_progress_desc_1)
    TextView mProgressDesc1;

    @BindView(R.id.tv_progress_desc_2)
    TextView mProgressDesc2;

    @BindView(R.id.progress_indicator_0)
    TextView mProgressIndicator0;

    @BindView(R.id.progress_indicator_1)
    TextView mProgressIndicator1;

    @BindView(R.id.progress_indicator_2)
    TextView mProgressIndicator2;

    @BindView(R.id.tv_status)
    TextView mStatusTextView;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    TextView f85184p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private AutoAcceptGameParamsObj f85185p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private Dialog f85186p3;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    TextView f85187x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private String f85188x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private String f85189y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private String f85190y2;
    private final u G2 = new u(this);
    private String G3 = "";
    private boolean N3 = false;
    private boolean O3 = false;
    String R3 = null;
    String S3 = null;

    public class a implements com.max.xiaoheihe.network.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.GameStoreSteamTradingActivityV2$a$a, reason: collision with other inner class name */
        public class RunnableC0755a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            RunnableC0755a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34496, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                GameStoreSteamTradingActivityV2.this.f85188x2 = GameStoreSteamTradingActivityV2.f85163c4;
                GameStoreSteamTradingActivityV2.X1(GameStoreSteamTradingActivityV2.this);
            }
        }

        public class b implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34497, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                GameStoreSteamTradingActivityV2.m2(GameStoreSteamTradingActivityV2.this);
            }
        }

        a() {
        }

        @Override // com.max.xiaoheihe.network.h
        public void a(Exception exc) {
            if (PatchProxy.proxy(new Object[]{exc}, this, changeQuickRedirect, false, 34495, new Class[]{Exception.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreSteamTradingActivityV2.n2(GameStoreSteamTradingActivityV2.this);
        }

        @Override // com.max.xiaoheihe.network.h
        public void b(@androidx.annotation.p0 JsonObject jsonObject, @androidx.annotation.p0 String str, @androidx.annotation.p0 okhttp3.s sVar, int i10) {
            if (PatchProxy.proxy(new Object[]{jsonObject, str, sVar, new Integer(i10)}, this, changeQuickRedirect, false, 34494, new Class[]{JsonObject.class, String.class, okhttp3.s.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            try {
                com.max.hbcommon.utils.d.b("zzzzgifttest", "onResponse acceptGift" + jsonObject.toString());
                if ("1".equals(jsonObject.get("success").getAsString())) {
                    GameStoreSteamTradingActivityV2.f85180t4.post(new RunnableC0755a());
                } else if ("83".equals(jsonObject.get("success").getAsString())) {
                    GameStoreSteamTradingActivityV2.f85180t4.post(new b());
                } else {
                    GameStoreSteamTradingActivityV2.n2(GameStoreSteamTradingActivityV2.this);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public class b implements com.max.xiaoheihe.network.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34500, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                GameStoreSteamTradingActivityV2.this.f85188x2 = GameStoreSteamTradingActivityV2.f85165e4;
                GameStoreSteamTradingActivityV2.X1(GameStoreSteamTradingActivityV2.this);
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.GameStoreSteamTradingActivityV2$b$b, reason: collision with other inner class name */
        public class RunnableC0756b implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.GameStoreSteamTradingActivityV2$b$b$a */
            public class a implements DialogInterface.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                a() {
                }

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i10) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34502, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    dialogInterface.dismiss();
                    GameStoreSteamTradingActivityV2.this.finish();
                }
            }

            RunnableC0756b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34501, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                GameStoreSteamTradingActivityV2.k2(GameStoreSteamTradingActivityV2.this);
                com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(((BaseActivity) GameStoreSteamTradingActivityV2.this).f66601b);
                fVar.l("自动领取失败,请稍后再试").g(false).u(GameStoreSteamTradingActivityV2.this.getString(R.string.confirm), new a());
                fVar.F();
            }
        }

        public class c implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            public class a implements DialogInterface.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                a() {
                }

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i10) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34504, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                        return;
                    }
                    dialogInterface.dismiss();
                    GameStoreSteamTradingActivityV2.this.finish();
                }
            }

            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34503, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                GameStoreSteamTradingActivityV2.k2(GameStoreSteamTradingActivityV2.this);
                com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(((BaseActivity) GameStoreSteamTradingActivityV2.this).f66601b);
                fVar.l("自动领取失败,请稍后再试").g(false).u(GameStoreSteamTradingActivityV2.this.getString(R.string.confirm), new a());
                fVar.F();
            }
        }

        b() {
        }

        @Override // com.max.xiaoheihe.network.h
        public void a(Exception exc) {
            if (PatchProxy.proxy(new Object[]{exc}, this, changeQuickRedirect, false, 34499, new Class[]{Exception.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreSteamTradingActivityV2.f85180t4.post(new c());
        }

        @Override // com.max.xiaoheihe.network.h
        public void b(@androidx.annotation.p0 JsonObject jsonObject, @androidx.annotation.p0 String str, @androidx.annotation.p0 okhttp3.s sVar, int i10) {
            if (PatchProxy.proxy(new Object[]{jsonObject, str, sVar, new Integer(i10)}, this, changeQuickRedirect, false, 34498, new Class[]{JsonObject.class, String.class, okhttp3.s.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            try {
                com.max.hbcommon.utils.d.b("zzzzgifttest", "onResponse declineGift" + jsonObject.toString());
                if ("1".equals(jsonObject.get("success").getAsString())) {
                    GameStoreSteamTradingActivityV2.f85180t4.post(new a());
                } else {
                    GameStoreSteamTradingActivityV2.f85180t4.post(new RunnableC0756b());
                }
            } catch (Exception unused) {
            }
        }
    }

    public class c implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34506, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
                GameStoreSteamTradingActivityV2.this.finish();
            }
        }

        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34505, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            GameStoreSteamTradingActivityV2.k2(GameStoreSteamTradingActivityV2.this);
            com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(((BaseActivity) GameStoreSteamTradingActivityV2.this).f66601b);
            fVar.l("自动领取失败,请稍后再试").g(false).u(GameStoreSteamTradingActivityV2.this.getString(R.string.confirm), new a());
            fVar.F();
        }
    }

    public class d extends com.max.hbcommon.network.d<Result<MallOrderStateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34510, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
                GameStoreSteamTradingActivityV2.this.finish();
            }
        }

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34507, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreSteamTradingActivityV2.W2(GameStoreSteamTradingActivityV2.this);
            if (GameStoreSteamTradingActivityV2.this.isActive()) {
                super.onError(th2);
                if (GameStoreSteamTradingActivityV2.this.L3 < 15) {
                    GameStoreSteamTradingActivityV2.X2(GameStoreSteamTradingActivityV2.this, 2000L);
                    return;
                }
                GameStoreSteamTradingActivityV2.k2(GameStoreSteamTradingActivityV2.this);
                com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(((BaseActivity) GameStoreSteamTradingActivityV2.this).f66601b);
                fVar.l("自动领取失败,请稍后再试").g(false).u(GameStoreSteamTradingActivityV2.this.getString(R.string.confirm), new a());
                fVar.F();
            }
        }

        public void onNext(Result<MallOrderStateObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34508, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreSteamTradingActivityV2.W2(GameStoreSteamTradingActivityV2.this);
            if (GameStoreSteamTradingActivityV2.this.isActive()) {
                super.onNext(result);
                String state = result.getResult().getState();
                GameStoreSteamTradingActivityV2.this.J3 = result.getResult().getBot_steamid();
                com.max.hbcommon.utils.d.b("zzzzgifttest", "getGiftOrderProgress state==" + state);
                if ("1".equals(state) && !GameStoreSteamTradingActivityV2.this.O3) {
                    if (!"1".equals(result.getResult().getNeed_add_friends())) {
                        if (GameStoreSteamTradingActivityV2.this.L3 < 15) {
                            GameStoreSteamTradingActivityV2.X2(GameStoreSteamTradingActivityV2.this, 2000L);
                            return;
                        } else {
                            GameStoreSteamTradingActivityV2.G2(GameStoreSteamTradingActivityV2.this);
                            return;
                        }
                    }
                    if (!com.max.hbcommon.utils.c.u(result.getResult().getAdd_friends_token())) {
                        GameStoreSteamTradingActivityV2.A2(GameStoreSteamTradingActivityV2.this, result.getResult().getAdd_friends_token(), GameStoreSteamTradingActivityV2.this.J3);
                        return;
                    }
                    GameStoreSteamTradingActivityV2.this.M3 = 0;
                    GameStoreSteamTradingActivityV2 gameStoreSteamTradingActivityV2 = GameStoreSteamTradingActivityV2.this;
                    GameStoreSteamTradingActivityV2.E2(gameStoreSteamTradingActivityV2, gameStoreSteamTradingActivityV2.J3);
                    return;
                }
                if ("4".equals(state) && !GameStoreSteamTradingActivityV2.this.N3 && !GameStoreSteamTradingActivityV2.this.O3) {
                    GameStoreSteamTradingActivityV2.this.f85188x2 = GameStoreSteamTradingActivityV2.Z3;
                    GameStoreSteamTradingActivityV2.X1(GameStoreSteamTradingActivityV2.this);
                    GameStoreSteamTradingActivityV2 gameStoreSteamTradingActivityV3 = GameStoreSteamTradingActivityV2.this;
                    GameStoreSteamTradingActivityV2.H2(gameStoreSteamTradingActivityV3, gameStoreSteamTradingActivityV3.J3);
                    List<String> hb_bot_steamids = result.getResult().getHb_bot_steamids();
                    if (com.max.hbcommon.utils.c.w(hb_bot_steamids)) {
                        return;
                    }
                    Iterator<String> it = hb_bot_steamids.iterator();
                    while (it.hasNext()) {
                        GameStoreSteamTradingActivityV2.f2(GameStoreSteamTradingActivityV2.this, it.next(), 0);
                    }
                    return;
                }
                if (("10".equals(state) || "11".equals(state)) && !com.max.hbcommon.utils.c.u(result.getResult().getGift_id())) {
                    GameStoreSteamTradingActivityV2.this.f85188x2 = GameStoreSteamTradingActivityV2.f85161a4;
                    GameStoreSteamTradingActivityV2.X1(GameStoreSteamTradingActivityV2.this);
                    GameStoreSteamTradingActivityV2.I2(GameStoreSteamTradingActivityV2.this, result.getResult().getGift_id());
                } else if ("12".equals(state) || "-1".equals(state) || "-3".equals(state)) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f("订单已结束");
                    GameStoreSteamTradingActivityV2.this.finish();
                } else if (GameStoreSteamTradingActivityV2.this.L3 < 15) {
                    GameStoreSteamTradingActivityV2.X2(GameStoreSteamTradingActivityV2.this, 2000L);
                } else {
                    GameStoreSteamTradingActivityV2.G2(GameStoreSteamTradingActivityV2.this);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34509, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallOrderStateObj>) obj);
        }
    }

    public class e implements okhttp3.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f85204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f85205c;

        e(String str, String str2) {
            this.f85204b = str;
            this.f85205c = str2;
        }

        @Override // okhttp3.f
        public void onFailure(okhttp3.e eVar, IOException iOException) {
            if (PatchProxy.proxy(new Object[]{eVar, iOException}, this, changeQuickRedirect, false, 34511, new Class[]{okhttp3.e.class, IOException.class}, Void.TYPE).isSupported) {
                return;
            }
            iOException.printStackTrace();
            GameStoreSteamTradingActivityV2.J2(GameStoreSteamTradingActivityV2.this, this.f85204b, this.f85205c);
        }

        @Override // okhttp3.f
        public void onResponse(okhttp3.e eVar, okhttp3.c0 c0Var) throws IOException {
            try {
                try {
                    if (PatchProxy.proxy(new Object[]{eVar, c0Var}, this, changeQuickRedirect, false, 34512, new Class[]{okhttp3.e.class, okhttp3.c0.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    try {
                        if (eVar.getCanceled()) {
                            try {
                                okhttp3.d0 d0VarQ = c0Var.q();
                                if (d0VarQ != null) {
                                    d0VarQ.close();
                                    return;
                                }
                                return;
                            } catch (Exception e10) {
                                e10.printStackTrace();
                                return;
                            }
                        }
                        if (!c0Var.c1()) {
                            GameStoreSteamTradingActivityV2.J2(GameStoreSteamTradingActivityV2.this, this.f85204b, this.f85205c);
                            try {
                                okhttp3.d0 d0VarQ2 = c0Var.q();
                                if (d0VarQ2 != null) {
                                    d0VarQ2.close();
                                    return;
                                }
                                return;
                            } catch (Exception e11) {
                                e11.printStackTrace();
                                return;
                            }
                        }
                        JsonObject jsonObject = null;
                        try {
                            jsonObject = (JsonObject) com.max.hbutils.utils.k.a(c0Var.q().string(), JsonObject.class);
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                        if (jsonObject == null || !"1".equals(jsonObject.get("success").getAsString())) {
                            GameStoreSteamTradingActivityV2.J2(GameStoreSteamTradingActivityV2.this, this.f85204b, this.f85205c);
                        } else {
                            GameStoreSteamTradingActivityV2.this.O3 = true;
                            GameStoreSteamTradingActivityV2.this.L3 = 0;
                            GameStoreSteamTradingActivityV2.X2(GameStoreSteamTradingActivityV2.this, 2000L);
                        }
                        okhttp3.d0 d0VarQ3 = c0Var.q();
                        if (d0VarQ3 != null) {
                            d0VarQ3.close();
                        }
                    } catch (Exception e13) {
                        e13.printStackTrace();
                        GameStoreSteamTradingActivityV2.J2(GameStoreSteamTradingActivityV2.this, this.f85204b, this.f85205c);
                        okhttp3.d0 d0VarQ4 = c0Var.q();
                        if (d0VarQ4 != null) {
                            d0VarQ4.close();
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        okhttp3.d0 d0VarQ5 = c0Var.q();
                        if (d0VarQ5 != null) {
                            d0VarQ5.close();
                        }
                    } catch (Exception e14) {
                        e14.printStackTrace();
                    }
                    throw th2;
                }
            } catch (Exception e15) {
                e15.printStackTrace();
            }
        }
    }

    public class f implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f85207b;

        f(String str) {
            this.f85207b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34513, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b("zzzzgifttest", "onAddFriendWithTokenFailed mAddFriendCount > 5");
            GameStoreSteamTradingActivityV2.this.M3 = 0;
            GameStoreSteamTradingActivityV2.E2(GameStoreSteamTradingActivityV2.this, this.f85207b);
        }
    }

    public class g implements okhttp3.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f85209b;

        g(String str) {
            this.f85209b = str;
        }

        @Override // okhttp3.f
        public void onFailure(okhttp3.e eVar, IOException iOException) {
            if (PatchProxy.proxy(new Object[]{eVar, iOException}, this, changeQuickRedirect, false, 34514, new Class[]{okhttp3.e.class, IOException.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreSteamTradingActivityV2.D2(GameStoreSteamTradingActivityV2.this);
            com.max.hbcommon.utils.d.b("zzzzgifttest", "onFailure" + iOException.toString());
            iOException.printStackTrace();
            GameStoreSteamTradingActivityV2.K2(GameStoreSteamTradingActivityV2.this, this.f85209b);
        }

        @Override // okhttp3.f
        public void onResponse(okhttp3.e eVar, okhttp3.c0 c0Var) throws IOException {
            if (PatchProxy.proxy(new Object[]{eVar, c0Var}, this, changeQuickRedirect, false, 34515, new Class[]{okhttp3.e.class, okhttp3.c0.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreSteamTradingActivityV2.D2(GameStoreSteamTradingActivityV2.this);
            try {
                try {
                    try {
                        if (eVar.getCanceled()) {
                            try {
                                okhttp3.d0 d0VarQ = c0Var.q();
                                if (d0VarQ != null) {
                                    d0VarQ.close();
                                    return;
                                }
                                return;
                            } catch (Exception e10) {
                                e10.printStackTrace();
                                return;
                            }
                        }
                        if (!c0Var.c1()) {
                            GameStoreSteamTradingActivityV2.K2(GameStoreSteamTradingActivityV2.this, this.f85209b);
                            try {
                                okhttp3.d0 d0VarQ2 = c0Var.q();
                                if (d0VarQ2 != null) {
                                    d0VarQ2.close();
                                    return;
                                }
                                return;
                            } catch (Exception e11) {
                                e11.printStackTrace();
                                return;
                            }
                        }
                        JsonObject jsonObject = null;
                        try {
                            jsonObject = (JsonObject) com.max.hbutils.utils.k.a(c0Var.q().string(), JsonObject.class);
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                        if (jsonObject == null || !"1".equals(jsonObject.get("success").getAsString())) {
                            GameStoreSteamTradingActivityV2.e2(GameStoreSteamTradingActivityV2.this);
                        } else {
                            GameStoreSteamTradingActivityV2.this.O3 = true;
                            GameStoreSteamTradingActivityV2.this.L3 = 0;
                            GameStoreSteamTradingActivityV2.X2(GameStoreSteamTradingActivityV2.this, 2000L);
                        }
                        okhttp3.d0 d0VarQ3 = c0Var.q();
                        if (d0VarQ3 != null) {
                            d0VarQ3.close();
                        }
                    } catch (Exception e13) {
                        e13.printStackTrace();
                        okhttp3.d0 d0VarQ4 = c0Var.q();
                        if (d0VarQ4 != null) {
                            d0VarQ4.close();
                        }
                    }
                } catch (Exception e14) {
                    e14.printStackTrace();
                }
            } catch (Throwable th2) {
                try {
                    okhttp3.d0 d0VarQ5 = c0Var.q();
                    if (d0VarQ5 != null) {
                        d0VarQ5.close();
                    }
                } catch (Exception e15) {
                    e15.printStackTrace();
                }
                throw th2;
            }
        }
    }

    public class h implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f85211b;

        h(String str) {
            this.f85211b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34516, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            if (GameStoreSteamTradingActivityV2.this.M3 <= 5) {
                GameStoreSteamTradingActivityV2.E2(GameStoreSteamTradingActivityV2.this, this.f85211b);
                return;
            }
            com.max.hbcommon.utils.d.b("zzzzgifttest", "onInviteFriendFailed mInviteFriendCount > 5");
            MobclickAgent.reportError(HeyBoxApplication.C(), new IllegalArgumentException("onInviteFriendFailed: userId = " + com.max.xiaoheihe.utils.i0.j() + ", orderId = " + GameStoreSteamTradingActivityV2.this.f85189y1));
        }
    }

    public class i implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34517, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            GameStoreSteamTradingActivityV2.this.finish();
        }
    }

    public class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34518, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.i0(((BaseActivity) GameStoreSteamTradingActivityV2.this).f66601b, lb.d.f131195k4);
            GameStoreSteamTradingActivityV2.k2(GameStoreSteamTradingActivityV2.this);
        }
    }

    public class k implements okhttp3.u {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // okhttp3.u
        public okhttp3.c0 intercept(okhttp3.u.a aVar) throws IOException {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, 34493, new Class[]{okhttp3.u.a.class}, okhttp3.c0.class);
            if (patchProxyResultProxy.isSupported) {
                return (okhttp3.c0) patchProxyResultProxy.result;
            }
            okhttp3.a0 a0VarRequest = aVar.request();
            return aVar.proceed(a0VarRequest.n().n("Host", "store.steampowered.com").n("User-Agent", "Mozilla/5.0 AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.118 Safari/537.36 ApiMaxJia/1.0").D(a0VarRequest.q().H().h()).b());
        }
    }

    public class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34520, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreSteamTradingActivityV2.this.finish();
            GameStoreSteamTradingActivityV2.k2(GameStoreSteamTradingActivityV2.this);
        }
    }

    public class m implements okhttp3.u {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // okhttp3.u
        public okhttp3.c0 intercept(okhttp3.u.a aVar) throws IOException {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, 34519, new Class[]{okhttp3.u.a.class}, okhttp3.c0.class);
            if (patchProxyResultProxy.isSupported) {
                return (okhttp3.c0) patchProxyResultProxy.result;
            }
            okhttp3.a0 a0VarRequest = aVar.request();
            return aVar.proceed(a0VarRequest.n().n("Host", "steamcommunity.com").n("User-Agent", "Mozilla/5.0 AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.118 Safari/537.36 ApiMaxJia/1.0").D(a0VarRequest.q().H().h()).b());
        }
    }

    public class n extends WebviewFragment.o0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebviewFragment f85218a;

        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34524, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                GameStoreSteamTradingActivityV2.S2(GameStoreSteamTradingActivityV2.this);
                GameStoreSteamTradingActivityV2.this.L3 = 0;
                GameStoreSteamTradingActivityV2.X2(GameStoreSteamTradingActivityV2.this, 0L);
            }
        }

        public class b implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34525, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                GameStoreSteamTradingActivityV2.this.f85188x2 = GameStoreSteamTradingActivityV2.f85168h4;
                n nVar = n.this;
                WebviewFragment webviewFragment = nVar.f85218a;
                GameStoreSteamTradingActivityV2 gameStoreSteamTradingActivityV2 = GameStoreSteamTradingActivityV2.this;
                webviewFragment.C7(gameStoreSteamTradingActivityV2.R3, gameStoreSteamTradingActivityV2.S3);
                n.this.f85218a.t7(GameStoreSteamTradingActivityV2.W3);
                GameStoreSteamTradingActivityV2.X1(GameStoreSteamTradingActivityV2.this);
            }
        }

        n(WebviewFragment webviewFragment) {
            this.f85218a = webviewFragment;
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void c(WebView webView, String str) {
            if (PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 34523, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            Matcher matcher = Pattern.compile("var g_AccountID = (\\d+);").matcher(str);
            if (!matcher.find()) {
                com.max.hbcommon.utils.d.b("zzzzgifttest", "not find==");
                return;
            }
            String strValueOf = String.valueOf(com.max.hbutils.utils.n.r(matcher.group(1)) + 76561197960265728L);
            this.f85218a.C6();
            if (!GameStoreSteamTradingActivityV2.this.f85185p2.getBind_steamid_64().equals(strValueOf)) {
                com.max.hbcommon.utils.d.b("zzzzgifttest", "not  same  need relogin");
                GameStoreSteamTradingActivityV2.f85180t4.post(new b());
                return;
            }
            com.max.hbcommon.utils.d.b("zzzzgifttest", "go check order");
            List<Cookie> listA = GameStoreSteamTradingActivityV2.this.K3.a(okhttp3.t.J(GameStoreSteamTradingActivityV2.W3));
            if (listA != null) {
                for (Cookie cookie : listA) {
                    if ("sessionid".equals(cookie.name())) {
                        GameStoreSteamTradingActivityV2.this.G3 = cookie.value();
                    }
                }
            }
            GameStoreSteamTradingActivityV2.f85180t4.post(new a());
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void g(WebView webView, String str, int i10, int i11) {
            Object[] objArr = {webView, str, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (!PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 34522, new Class[]{WebView.class, String.class, cls, cls}, Void.TYPE).isSupported && i11 - 1 == 0) {
                if (str.contains("/account/")) {
                    GameStoreSteamTradingActivityV2.x2(GameStoreSteamTradingActivityV2.this, WebviewFragment.Y4);
                    return;
                }
                if (!str.contains("/login") || GameStoreSteamTradingActivityV2.this.f85185p2.getRemember_store_login() == null || GameStoreSteamTradingActivityV2.this.f85185p2.getRemember_store_login().getJs() == null) {
                    return;
                }
                EncryptionParamsObj js = GameStoreSteamTradingActivityV2.this.f85185p2.getRemember_store_login().getJs();
                String strC = com.max.hbcommon.utils.e.c(js.getP1(), com.max.xiaoheihe.utils.w.c(js.getP3()));
                if (com.max.xiaoheihe.utils.d.a1(strC).equals(js.getP2())) {
                    com.max.hbcommon.utils.d.b("zzzzgifttest", "js ==" + strC);
                    GameStoreSteamTradingActivityV2.x2(GameStoreSteamTradingActivityV2.this, strC);
                }
            }
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void o(WebView webView, String str) {
            if (PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 34521, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(str) || ((BaseActivity) GameStoreSteamTradingActivityV2.this).f66616q == null || ((BaseActivity) GameStoreSteamTradingActivityV2.this).f66616q.getVisibility() != 0) {
                return;
            }
            if ("about:blank".equalsIgnoreCase(str)) {
                str = GameStoreSteamTradingActivityV2.this.getString(R.string.loading);
            }
            ((BaseActivity) GameStoreSteamTradingActivityV2.this).f66616q.setTitle(str);
        }
    }

    public class o implements okhttp3.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34528, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                GameStoreSteamTradingActivityV2.Y1(GameStoreSteamTradingActivityV2.this);
            }
        }

        public class b implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34529, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                GameStoreSteamTradingActivityV2.Y1(GameStoreSteamTradingActivityV2.this);
            }
        }

        public class c implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34530, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                GameStoreSteamTradingActivityV2.Y1(GameStoreSteamTradingActivityV2.this);
            }
        }

        public class d implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34531, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                GameStoreSteamTradingActivityV2.this.L3 = 0;
                GameStoreSteamTradingActivityV2.X2(GameStoreSteamTradingActivityV2.this, 0L);
            }
        }

        public class e implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            e() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34532, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                GameStoreSteamTradingActivityV2.Y1(GameStoreSteamTradingActivityV2.this);
            }
        }

        public class f implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            f() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34533, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                GameStoreSteamTradingActivityV2.Y1(GameStoreSteamTradingActivityV2.this);
            }
        }

        o() {
        }

        @Override // okhttp3.f
        public void onFailure(okhttp3.e eVar, IOException iOException) {
            if (PatchProxy.proxy(new Object[]{eVar, iOException}, this, changeQuickRedirect, false, 34526, new Class[]{okhttp3.e.class, IOException.class}, Void.TYPE).isSupported) {
                return;
            }
            iOException.printStackTrace();
            GameStoreSteamTradingActivityV2.f85180t4.post(new a());
        }

        @Override // okhttp3.f
        public void onResponse(okhttp3.e eVar, okhttp3.c0 c0Var) throws IOException {
            try {
                try {
                    if (PatchProxy.proxy(new Object[]{eVar, c0Var}, this, changeQuickRedirect, false, 34527, new Class[]{okhttp3.e.class, okhttp3.c0.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    try {
                        if (eVar.getCanceled()) {
                            GameStoreSteamTradingActivityV2.f85180t4.post(new b());
                            try {
                                okhttp3.d0 d0VarQ = c0Var.q();
                                if (d0VarQ != null) {
                                    d0VarQ.close();
                                    return;
                                }
                                return;
                            } catch (Exception e10) {
                                e10.printStackTrace();
                                return;
                            }
                        }
                        if (!c0Var.c1()) {
                            GameStoreSteamTradingActivityV2.f85180t4.post(new c());
                            try {
                                okhttp3.d0 d0VarQ2 = c0Var.q();
                                if (d0VarQ2 != null) {
                                    d0VarQ2.close();
                                    return;
                                }
                                return;
                            } catch (Exception e11) {
                                e11.printStackTrace();
                                return;
                            }
                        }
                        String strString = c0Var.q().string();
                        com.max.hbcommon.utils.d.b("zzzzgifttest", "result==" + strString);
                        Matcher matcher = Pattern.compile("var g_AccountID = (\\d+);").matcher(strString);
                        if (!matcher.find() || !GameStoreSteamTradingActivityV2.this.f85185p2.getBind_steamid_64().equals(String.valueOf(com.max.hbutils.utils.n.r(matcher.group(1)) + 76561197960265728L))) {
                            com.max.hbcommon.utils.d.b("zzzzgifttest", "cookie invalid ---");
                            GameStoreSteamTradingActivityV2.f85180t4.post(new e());
                            try {
                                okhttp3.d0 d0VarQ3 = c0Var.q();
                                if (d0VarQ3 != null) {
                                    d0VarQ3.close();
                                    return;
                                }
                                return;
                            } catch (Exception e12) {
                                e12.printStackTrace();
                                return;
                            }
                        }
                        com.max.hbcommon.utils.d.b("zzzzgifttest", "cookie valid !!!");
                        com.max.hbcommon.utils.d.b("zzzzmatchtest", "steamid==" + String.valueOf(com.max.hbutils.utils.n.r(matcher.group(1)) + 76561197960265728L));
                        List<Cookie> listA = GameStoreSteamTradingActivityV2.this.K3.a(okhttp3.t.J(GameStoreSteamTradingActivityV2.W3));
                        if (listA != null) {
                            for (Cookie cookie : listA) {
                                if ("sessionid".equals(cookie.name())) {
                                    GameStoreSteamTradingActivityV2.this.G3 = cookie.value();
                                }
                            }
                        }
                        GameStoreSteamTradingActivityV2.f85180t4.post(new d());
                        okhttp3.d0 d0VarQ4 = c0Var.q();
                        if (d0VarQ4 != null) {
                            d0VarQ4.close();
                        }
                    } catch (Exception e13) {
                        e13.printStackTrace();
                        GameStoreSteamTradingActivityV2.f85180t4.post(new f());
                        okhttp3.d0 d0VarQ5 = c0Var.q();
                        if (d0VarQ5 != null) {
                            d0VarQ5.close();
                        }
                    }
                } catch (Exception e14) {
                    e14.printStackTrace();
                }
            } catch (Throwable th2) {
                try {
                    okhttp3.d0 d0VarQ6 = c0Var.q();
                    if (d0VarQ6 != null) {
                        d0VarQ6.close();
                    }
                } catch (Exception e15) {
                    e15.printStackTrace();
                }
                throw th2;
            }
        }
    }

    public class p implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34534, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            GameStoreSteamTradingActivityV2.this.finish();
        }
    }

    public class q implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34535, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(((BaseActivity) GameStoreSteamTradingActivityV2.this).f66601b, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.C2);
            intent.putExtra("title", GameStoreSteamTradingActivityV2.this.getString(R.string.region_error_solution));
            ((BaseActivity) GameStoreSteamTradingActivityV2.this).f66601b.startActivity(intent);
            dialogInterface.dismiss();
            GameStoreSteamTradingActivityV2.this.finish();
        }
    }

    public class r implements com.max.xiaoheihe.network.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34538, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                GameStoreSteamTradingActivityV2.this.f85188x2 = GameStoreSteamTradingActivityV2.f85161a4;
                GameStoreSteamTradingActivityV2.X1(GameStoreSteamTradingActivityV2.this);
                GameStoreSteamTradingActivityV2.this.N3 = true;
                GameStoreSteamTradingActivityV2.this.L3 = 0;
                GameStoreSteamTradingActivityV2.X2(GameStoreSteamTradingActivityV2.this, 2000L);
            }
        }

        r() {
        }

        @Override // com.max.xiaoheihe.network.h
        public void a(Exception exc) {
            if (PatchProxy.proxy(new Object[]{exc}, this, changeQuickRedirect, false, 34537, new Class[]{Exception.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreSteamTradingActivityV2.e2(GameStoreSteamTradingActivityV2.this);
        }

        @Override // com.max.xiaoheihe.network.h
        public void b(@androidx.annotation.p0 JsonObject jsonObject, @androidx.annotation.p0 String str, @androidx.annotation.p0 okhttp3.s sVar, int i10) {
            if (PatchProxy.proxy(new Object[]{jsonObject, str, sVar, new Integer(i10)}, this, changeQuickRedirect, false, 34536, new Class[]{JsonObject.class, String.class, okhttp3.s.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            try {
                com.max.hbcommon.utils.d.b("zzzzgifttest", "onResponse acceptFriend" + jsonObject.toString());
                if ("1".equals(jsonObject.get("success").getAsString())) {
                    GameStoreSteamTradingActivityV2.f85180t4.post(new a());
                } else {
                    GameStoreSteamTradingActivityV2.e2(GameStoreSteamTradingActivityV2.this);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public class s implements com.max.xiaoheihe.network.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f85233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f85234b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f85235c;

        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34541, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                s sVar = s.this;
                GameStoreSteamTradingActivityV2.f2(GameStoreSteamTradingActivityV2.this, sVar.f85235c, sVar.f85233a + 1);
            }
        }

        public class b implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34542, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                s sVar = s.this;
                GameStoreSteamTradingActivityV2.f2(GameStoreSteamTradingActivityV2.this, sVar.f85235c, sVar.f85233a + 1);
            }
        }

        s(int i10, int i11, String str) {
            this.f85233a = i10;
            this.f85234b = i11;
            this.f85235c = str;
        }

        @Override // com.max.xiaoheihe.network.h
        public void a(Exception exc) {
            if (!PatchProxy.proxy(new Object[]{exc}, this, changeQuickRedirect, false, 34540, new Class[]{Exception.class}, Void.TYPE).isSupported && this.f85233a < this.f85234b) {
                GameStoreSteamTradingActivityV2.this.G2.postDelayed(new b(), 2000L);
            }
        }

        @Override // com.max.xiaoheihe.network.h
        public void b(@androidx.annotation.p0 JsonObject jsonObject, @androidx.annotation.p0 String str, @androidx.annotation.p0 okhttp3.s sVar, int i10) {
            if (PatchProxy.proxy(new Object[]{jsonObject, str, sVar, new Integer(i10)}, this, changeQuickRedirect, false, 34539, new Class[]{JsonObject.class, String.class, okhttp3.s.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            try {
                if ("1".equals(jsonObject.get("success").getAsString()) || this.f85233a >= this.f85234b) {
                    return;
                }
                GameStoreSteamTradingActivityV2.this.G2.postDelayed(new a(), 2000L);
            } catch (Throwable unused) {
            }
        }
    }

    public class t implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34544, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
                GameStoreSteamTradingActivityV2.this.finish();
            }
        }

        t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34543, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            MobclickAgent.reportError(HeyBoxApplication.C(), new IllegalArgumentException("onAcceptFriendFailed: userId = " + com.max.xiaoheihe.utils.i0.j() + ", orderId = " + GameStoreSteamTradingActivityV2.this.f85189y1));
            GameStoreSteamTradingActivityV2.k2(GameStoreSteamTradingActivityV2.this);
            com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(((BaseActivity) GameStoreSteamTradingActivityV2.this).f66601b);
            fVar.l("接受好友失败,请稍后再试").g(false).u(GameStoreSteamTradingActivityV2.this.getString(R.string.confirm), new a());
            fVar.F();
        }
    }

    public static class u extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<GameStoreSteamTradingActivityV2> f85241a;

        public u(GameStoreSteamTradingActivityV2 gameStoreSteamTradingActivityV2) {
            this.f85241a = new WeakReference<>(gameStoreSteamTradingActivityV2);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 34545, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            super.handleMessage(message);
            GameStoreSteamTradingActivityV2 gameStoreSteamTradingActivityV2 = this.f85241a.get();
            if (gameStoreSteamTradingActivityV2 != null) {
                gameStoreSteamTradingActivityV2.B3();
            }
        }
    }

    static /* synthetic */ void A2(GameStoreSteamTradingActivityV2 gameStoreSteamTradingActivityV2, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{gameStoreSteamTradingActivityV2, str, str2}, null, changeQuickRedirect, true, 34486, new Class[]{GameStoreSteamTradingActivityV2.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreSteamTradingActivityV2.Y2(str, str2);
    }

    private void A3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34455, new Class[0], Void.TYPE).isSupported || this.f66601b.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f66601b).y(getString(R.string.accept_failed)).l(getString(R.string.region_error_tips)).u(getString(R.string.view_solution), new q()).o(getString(R.string.do_return), new p()).g(false).F();
    }

    /* JADX WARN: Code duplicated, block: B:126:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0171  */
    /* JADX WARN: Code duplicated, block: B:62:0x0188  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x024b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x024d  */
    /* JADX WARN: Code duplicated, block: B:71:0x02eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:73:0x038b  */
    /* JADX WARN: Code duplicated, block: B:76:0x042b  */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x0171, please report this as an issue */
    private void C3() {
        String string;
        Object obj;
        Object obj2;
        Object obj3;
        int i10;
        String str;
        View view;
        Dialog dialog;
        char c10 = 0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34472, new Class[0], Void.TYPE).isSupported || this.mStatusTextView == null) {
            return;
        }
        if (!Y3.equals(this.f85188x2)) {
            if (!Z3.equals(this.f85188x2)) {
                if (f85161a4.equals(this.f85188x2)) {
                    string = getString(R.string.purchase_sending_gift);
                    c10 = 1;
                } else {
                    if (!f85162b4.equals(this.f85188x2)) {
                        if (f85163c4.equals(this.f85188x2)) {
                            string = getString(R.string.accept_gift_success);
                            c10 = 3;
                            i10 = R.color.interactive_color;
                            obj = f85178r4;
                            obj2 = obj;
                            obj3 = obj2;
                        } else {
                            if (f85164d4.equals(this.f85188x2)) {
                                string = getString(R.string.accept_gift_failed);
                            } else {
                                if (f85165e4.equals(this.f85188x2)) {
                                    string = getString(R.string.purchase_failed_by_has_game);
                                } else if (f85166f4.equals(this.f85188x2)) {
                                    string = getString(R.string.purchase_relogin);
                                } else {
                                    if (f85167g4.equals(this.f85188x2)) {
                                        string = getString(R.string.purchase_login);
                                    } else if (f85168h4.equals(this.f85188x2)) {
                                        string = getString(R.string.purchase_store_relogin);
                                    } else if (f85169i4.equals(this.f85188x2)) {
                                        string = getString(R.string.purchase_store_login);
                                    } else if (f85170j4.equals(this.f85188x2)) {
                                        string = getString(R.string.invite_friend_timeout);
                                        obj2 = f85179s4;
                                        c10 = 0;
                                        obj3 = f85176p4;
                                        obj = f85178r4;
                                    } else if (f85171k4.equals(this.f85188x2)) {
                                        string = getString(R.string.invite_gift_timeout);
                                        c10 = 1;
                                        obj3 = f85179s4;
                                        obj = f85178r4;
                                        obj2 = obj;
                                    } else if (f85174n4.equals(this.f85188x2)) {
                                        string = getString(R.string.success);
                                        obj2 = f85176p4;
                                        obj3 = obj2;
                                    } else {
                                        string = "";
                                        obj = f85176p4;
                                        obj2 = obj;
                                    }
                                    i10 = R.color.interactive_color;
                                    obj = f85178r4;
                                }
                                i10 = R.color.badge_bg_color;
                            }
                            c10 = 2;
                            obj3 = f85179s4;
                            obj = f85178r4;
                            obj2 = obj;
                            i10 = R.color.badge_bg_color;
                        }
                        if (com.max.hbcommon.utils.c.u(this.f85190y2)) {
                            str = string;
                        } else {
                            str = string + "\n" + this.f85190y2;
                        }
                        this.mStatusTextView.setText(str);
                        this.mStatusTextView.setBackgroundDrawable(getResources().getDrawable(i10));
                        view = this.mProgressBarView;
                        if (view != null && view.getVisibility() == 0) {
                            if (c10 == 0) {
                                this.mProgressBarL0.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                                this.mProgressBarR0.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                                this.mProgressIndicator0.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                                this.mProgressDesc0.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                                this.mProgressBarL1.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                                this.mProgressBarR1.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                                this.mProgressIndicator1.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                                this.mProgressDesc1.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                                this.mProgressBarL2.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                                this.mProgressBarR2.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                                this.mProgressIndicator2.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                                this.mProgressDesc2.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                            } else if (c10 == 1) {
                                this.mProgressBarL0.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                                this.mProgressBarR0.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                                this.mProgressIndicator0.setTextColor(getResources().getColor(R.color.interactive_color));
                                this.mProgressDesc0.setTextColor(getResources().getColor(R.color.interactive_color));
                                this.mProgressBarL1.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                                this.mProgressBarR1.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                                this.mProgressIndicator1.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                                this.mProgressDesc1.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                                this.mProgressBarL2.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                                this.mProgressBarR2.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                                this.mProgressIndicator2.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                                this.mProgressDesc2.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                            } else if (c10 == 2) {
                                this.mProgressBarL0.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                                this.mProgressBarR0.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                                this.mProgressIndicator0.setTextColor(getResources().getColor(R.color.interactive_color));
                                this.mProgressDesc0.setTextColor(getResources().getColor(R.color.interactive_color));
                                this.mProgressBarL1.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                                this.mProgressBarR1.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                                this.mProgressIndicator1.setTextColor(getResources().getColor(R.color.interactive_color));
                                this.mProgressDesc1.setTextColor(getResources().getColor(R.color.interactive_color));
                                this.mProgressBarL2.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                                this.mProgressBarR2.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                                this.mProgressIndicator2.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                                this.mProgressDesc2.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                            } else {
                                this.mProgressBarL0.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                                this.mProgressBarR0.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                                this.mProgressIndicator0.setTextColor(getResources().getColor(R.color.interactive_color));
                                this.mProgressDesc0.setTextColor(getResources().getColor(R.color.interactive_color));
                                this.mProgressBarL1.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                                this.mProgressBarR1.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                                this.mProgressIndicator1.setTextColor(getResources().getColor(R.color.interactive_color));
                                this.mProgressDesc1.setTextColor(getResources().getColor(R.color.interactive_color));
                                this.mProgressBarL2.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                                this.mProgressBarR2.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                                this.mProgressIndicator2.setTextColor(getResources().getColor(R.color.interactive_color));
                                this.mProgressDesc2.setTextColor(getResources().getColor(R.color.interactive_color));
                            }
                        }
                        dialog = this.f85186p3;
                        if (dialog == null && dialog.isShowing()) {
                            if (f85163c4.equals(this.f85188x2) || f85174n4.equals(this.f85188x2)) {
                                k3();
                                com.max.xiaoheihe.module.account.utils.l.Y();
                                a3();
                                Intent intent = new Intent(lb.a.A);
                                intent.putExtra(lb.a.f130996l0, lb.a.f131056v0);
                                this.f66601b.sendBroadcast(intent);
                                Activity activity = this.f66601b;
                                activity.startActivity(GameStorePurchaseShareActivity.f2(activity, this.f85189y1, "gift"));
                                finish();
                                return;
                            }
                            if (f85176p4.equals(obj)) {
                                this.P.setText(getString(R.string.wait));
                                this.P.setTextColor(getResources().getColor(R.color.text_secondary_2_color));
                                this.O.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                                this.R.setBackgroundResource(R.color.divider_secondary_2_color);
                                this.Q.setVisibility(8);
                            } else if (f85177q4.equals(obj)) {
                                this.P.setText(getString(R.string.doing));
                                this.P.setTextColor(getResources().getColor(R.color.text_primary_1_color));
                                this.O.setTextColor(getResources().getColor(R.color.text_primary_1_color));
                                TradeInfoUtilKt.F(this.R);
                                this.Q.setVisibility(8);
                            } else if (f85178r4.equals(obj)) {
                                this.P.setText(getString(R.string.complete));
                                this.P.setTextColor(getResources().getColor(R.color.text_primary_1_color));
                                this.O.setTextColor(getResources().getColor(R.color.text_primary_1_color));
                                this.R.c();
                                this.R.setBackgroundResource(R.color.text_primary_1_color);
                                this.Q.setVisibility(0);
                            } else {
                                this.P.setText(getString(R.string.overtime));
                                this.P.setTextColor(getResources().getColor(R.color.badge_bg_color));
                                this.O.setTextColor(getResources().getColor(R.color.badge_bg_color));
                                TradeInfoUtilKt.G(this.R);
                                this.Q.setVisibility(8);
                            }
                            Object obj4 = obj2;
                            if (f85176p4.equals(obj4)) {
                                this.U.setText(getString(R.string.wait));
                                this.U.setTextColor(getResources().getColor(R.color.text_secondary_2_color));
                                this.T.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                                this.W.setBackgroundResource(R.color.divider_secondary_2_color);
                                this.V.setVisibility(8);
                            } else if (f85177q4.equals(obj4)) {
                                this.U.setText(getString(R.string.doing));
                                this.U.setTextColor(getResources().getColor(R.color.text_primary_1_color));
                                this.T.setTextColor(getResources().getColor(R.color.text_primary_1_color));
                                TradeInfoUtilKt.F(this.W);
                                this.V.setVisibility(8);
                            } else if (f85178r4.equals(obj4)) {
                                this.U.setText(getString(R.string.complete));
                                this.U.setTextColor(getResources().getColor(R.color.text_primary_1_color));
                                this.T.setTextColor(getResources().getColor(R.color.text_primary_1_color));
                                this.W.c();
                                this.W.setBackgroundResource(R.color.text_primary_1_color);
                                this.V.setVisibility(0);
                            } else {
                                this.U.setText(getString(R.string.overtime));
                                this.U.setTextColor(getResources().getColor(R.color.badge_bg_color));
                                this.T.setTextColor(getResources().getColor(R.color.badge_bg_color));
                                TradeInfoUtilKt.G(this.W);
                                this.V.setVisibility(8);
                            }
                            Object obj5 = obj3;
                            if (f85176p4.equals(obj5)) {
                                this.Z.setText(getString(R.string.wait));
                                this.Z.setTextColor(getResources().getColor(R.color.text_secondary_2_color));
                                this.Y.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                                this.f85182b0.setBackgroundResource(R.color.divider_secondary_2_color);
                                this.f85181a0.setVisibility(8);
                            } else if (f85177q4.equals(obj5)) {
                                this.Z.setText(getString(R.string.doing));
                                this.Z.setTextColor(getResources().getColor(R.color.text_primary_1_color));
                                this.Y.setTextColor(getResources().getColor(R.color.text_primary_1_color));
                                TradeInfoUtilKt.F(this.f85182b0);
                                this.f85181a0.setVisibility(8);
                            } else if (f85178r4.equals(obj5)) {
                                this.Z.setText(getString(R.string.complete));
                                this.Z.setTextColor(getResources().getColor(R.color.text_primary_1_color));
                                this.Y.setTextColor(getResources().getColor(R.color.text_primary_1_color));
                                this.f85182b0.c();
                                this.f85182b0.setBackgroundResource(R.color.text_primary_1_color);
                                this.f85181a0.setVisibility(0);
                            } else {
                                this.Z.setText(getString(R.string.overtime));
                                this.Z.setTextColor(getResources().getColor(R.color.badge_bg_color));
                                this.Y.setTextColor(getResources().getColor(R.color.badge_bg_color));
                                TradeInfoUtilKt.G(this.f85182b0);
                                this.f85181a0.setVisibility(8);
                            }
                            if (!f85179s4.equals(obj) && !f85179s4.equals(obj4) && !f85179s4.equals(obj5)) {
                                this.M.setText(getString(R.string.purchase_in_progress_please_wait));
                                this.L.setVisibility(0);
                                return;
                            } else {
                                this.M.setText(string);
                                this.f85183c0.setVisibility(0);
                                this.L.setVisibility(8);
                                return;
                            }
                        }
                    }
                    string = getString(R.string.purchase_waiting_accept_gift);
                    c10 = 2;
                }
                obj3 = f85177q4;
                i10 = R.color.interactive_color;
                obj = f85178r4;
                obj2 = obj;
                if (com.max.hbcommon.utils.c.u(this.f85190y2)) {
                    str = string + "\n" + this.f85190y2;
                } else {
                    str = string;
                }
                this.mStatusTextView.setText(str);
                this.mStatusTextView.setBackgroundDrawable(getResources().getDrawable(i10));
                view = this.mProgressBarView;
                if (view != null) {
                    if (c10 == 0) {
                        this.mProgressBarL0.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                        this.mProgressBarR0.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                        this.mProgressIndicator0.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                        this.mProgressDesc0.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                        this.mProgressBarL1.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                        this.mProgressBarR1.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                        this.mProgressIndicator1.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                        this.mProgressDesc1.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                        this.mProgressBarL2.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                        this.mProgressBarR2.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                        this.mProgressIndicator2.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                        this.mProgressDesc2.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                    } else if (c10 == 1) {
                        this.mProgressBarL0.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                        this.mProgressBarR0.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                        this.mProgressIndicator0.setTextColor(getResources().getColor(R.color.interactive_color));
                        this.mProgressDesc0.setTextColor(getResources().getColor(R.color.interactive_color));
                        this.mProgressBarL1.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                        this.mProgressBarR1.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                        this.mProgressIndicator1.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                        this.mProgressDesc1.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                        this.mProgressBarL2.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                        this.mProgressBarR2.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                        this.mProgressIndicator2.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                        this.mProgressDesc2.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                    } else if (c10 == 2) {
                        this.mProgressBarL0.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                        this.mProgressBarR0.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                        this.mProgressIndicator0.setTextColor(getResources().getColor(R.color.interactive_color));
                        this.mProgressDesc0.setTextColor(getResources().getColor(R.color.interactive_color));
                        this.mProgressBarL1.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                        this.mProgressBarR1.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                        this.mProgressIndicator1.setTextColor(getResources().getColor(R.color.interactive_color));
                        this.mProgressDesc1.setTextColor(getResources().getColor(R.color.interactive_color));
                        this.mProgressBarL2.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                        this.mProgressBarR2.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                        this.mProgressIndicator2.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                        this.mProgressDesc2.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                    } else {
                        this.mProgressBarL0.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                        this.mProgressBarR0.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                        this.mProgressIndicator0.setTextColor(getResources().getColor(R.color.interactive_color));
                        this.mProgressDesc0.setTextColor(getResources().getColor(R.color.interactive_color));
                        this.mProgressBarL1.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                        this.mProgressBarR1.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                        this.mProgressIndicator1.setTextColor(getResources().getColor(R.color.interactive_color));
                        this.mProgressDesc1.setTextColor(getResources().getColor(R.color.interactive_color));
                        this.mProgressBarL2.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                        this.mProgressBarR2.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                        this.mProgressIndicator2.setTextColor(getResources().getColor(R.color.interactive_color));
                        this.mProgressDesc2.setTextColor(getResources().getColor(R.color.interactive_color));
                    }
                }
                dialog = this.f85186p3;
                if (dialog == null) {
                }
            }
            string = getString(R.string.purchase_add_friend);
            obj2 = f85177q4;
            obj3 = f85176p4;
            i10 = R.color.interactive_color;
            obj = f85178r4;
            if (com.max.hbcommon.utils.c.u(this.f85190y2)) {
                str = string + "\n" + this.f85190y2;
            } else {
                str = string;
            }
            this.mStatusTextView.setText(str);
            this.mStatusTextView.setBackgroundDrawable(getResources().getDrawable(i10));
            view = this.mProgressBarView;
            if (view != null) {
                if (c10 == 0) {
                    this.mProgressBarL0.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                    this.mProgressBarR0.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                    this.mProgressIndicator0.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                    this.mProgressDesc0.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                    this.mProgressBarL1.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                    this.mProgressBarR1.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                    this.mProgressIndicator1.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                    this.mProgressDesc1.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                    this.mProgressBarL2.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                    this.mProgressBarR2.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                    this.mProgressIndicator2.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                    this.mProgressDesc2.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                } else if (c10 == 1) {
                    this.mProgressBarL0.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                    this.mProgressBarR0.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                    this.mProgressIndicator0.setTextColor(getResources().getColor(R.color.interactive_color));
                    this.mProgressDesc0.setTextColor(getResources().getColor(R.color.interactive_color));
                    this.mProgressBarL1.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                    this.mProgressBarR1.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                    this.mProgressIndicator1.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                    this.mProgressDesc1.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                    this.mProgressBarL2.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                    this.mProgressBarR2.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                    this.mProgressIndicator2.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                    this.mProgressDesc2.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                } else if (c10 == 2) {
                    this.mProgressBarL0.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                    this.mProgressBarR0.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                    this.mProgressIndicator0.setTextColor(getResources().getColor(R.color.interactive_color));
                    this.mProgressDesc0.setTextColor(getResources().getColor(R.color.interactive_color));
                    this.mProgressBarL1.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                    this.mProgressBarR1.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                    this.mProgressIndicator1.setTextColor(getResources().getColor(R.color.interactive_color));
                    this.mProgressDesc1.setTextColor(getResources().getColor(R.color.interactive_color));
                    this.mProgressBarL2.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                    this.mProgressBarR2.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                    this.mProgressIndicator2.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                    this.mProgressDesc2.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                } else {
                    this.mProgressBarL0.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                    this.mProgressBarR0.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                    this.mProgressIndicator0.setTextColor(getResources().getColor(R.color.interactive_color));
                    this.mProgressDesc0.setTextColor(getResources().getColor(R.color.interactive_color));
                    this.mProgressBarL1.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                    this.mProgressBarR1.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                    this.mProgressIndicator1.setTextColor(getResources().getColor(R.color.interactive_color));
                    this.mProgressDesc1.setTextColor(getResources().getColor(R.color.interactive_color));
                    this.mProgressBarL2.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                    this.mProgressBarR2.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                    this.mProgressIndicator2.setTextColor(getResources().getColor(R.color.interactive_color));
                    this.mProgressDesc2.setTextColor(getResources().getColor(R.color.interactive_color));
                }
            }
            dialog = this.f85186p3;
            if (dialog == null) {
            }
        }
        string = getString(R.string.purchase_add_friend);
        obj = f85177q4;
        obj2 = f85176p4;
        obj3 = obj2;
        i10 = R.color.interactive_color;
        if (com.max.hbcommon.utils.c.u(this.f85190y2)) {
            str = string + "\n" + this.f85190y2;
        } else {
            str = string;
        }
        this.mStatusTextView.setText(str);
        this.mStatusTextView.setBackgroundDrawable(getResources().getDrawable(i10));
        view = this.mProgressBarView;
        if (view != null) {
            if (c10 == 0) {
                this.mProgressBarL0.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                this.mProgressBarR0.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                this.mProgressIndicator0.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                this.mProgressDesc0.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                this.mProgressBarL1.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                this.mProgressBarR1.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                this.mProgressIndicator1.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                this.mProgressDesc1.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                this.mProgressBarL2.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                this.mProgressBarR2.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                this.mProgressIndicator2.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                this.mProgressDesc2.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
            } else if (c10 == 1) {
                this.mProgressBarL0.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                this.mProgressBarR0.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                this.mProgressIndicator0.setTextColor(getResources().getColor(R.color.interactive_color));
                this.mProgressDesc0.setTextColor(getResources().getColor(R.color.interactive_color));
                this.mProgressBarL1.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                this.mProgressBarR1.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                this.mProgressIndicator1.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                this.mProgressDesc1.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                this.mProgressBarL2.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                this.mProgressBarR2.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                this.mProgressIndicator2.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                this.mProgressDesc2.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
            } else if (c10 == 2) {
                this.mProgressBarL0.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                this.mProgressBarR0.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                this.mProgressIndicator0.setTextColor(getResources().getColor(R.color.interactive_color));
                this.mProgressDesc0.setTextColor(getResources().getColor(R.color.interactive_color));
                this.mProgressBarL1.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                this.mProgressBarR1.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                this.mProgressIndicator1.setTextColor(getResources().getColor(R.color.interactive_color));
                this.mProgressDesc1.setTextColor(getResources().getColor(R.color.interactive_color));
                this.mProgressBarL2.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                this.mProgressBarR2.setBackgroundDrawable(getResources().getDrawable(R.color.divider_secondary_2_color));
                this.mProgressIndicator2.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                this.mProgressDesc2.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
            } else {
                this.mProgressBarL0.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                this.mProgressBarR0.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                this.mProgressIndicator0.setTextColor(getResources().getColor(R.color.interactive_color));
                this.mProgressDesc0.setTextColor(getResources().getColor(R.color.interactive_color));
                this.mProgressBarL1.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                this.mProgressBarR1.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                this.mProgressIndicator1.setTextColor(getResources().getColor(R.color.interactive_color));
                this.mProgressDesc1.setTextColor(getResources().getColor(R.color.interactive_color));
                this.mProgressBarL2.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                this.mProgressBarR2.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                this.mProgressIndicator2.setTextColor(getResources().getColor(R.color.interactive_color));
                this.mProgressDesc2.setTextColor(getResources().getColor(R.color.interactive_color));
            }
        }
        dialog = this.f85186p3;
        if (dialog == null) {
        }
    }

    static /* synthetic */ int D2(GameStoreSteamTradingActivityV2 gameStoreSteamTradingActivityV2) {
        int i10 = gameStoreSteamTradingActivityV2.M3;
        gameStoreSteamTradingActivityV2.M3 = i10 + 1;
        return i10;
    }

    private void D3(AutoAcceptGameParamsObj autoAcceptGameParamsObj) {
        if (PatchProxy.proxy(new Object[]{autoAcceptGameParamsObj}, this, changeQuickRedirect, false, 34471, new Class[]{AutoAcceptGameParamsObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (autoAcceptGameParamsObj == null || com.max.hbcommon.utils.c.u(autoAcceptGameParamsObj.getSys_msg())) {
            this.f85190y2 = null;
        } else {
            this.f85190y2 = autoAcceptGameParamsObj.getSys_msg();
        }
    }

    static /* synthetic */ void E2(GameStoreSteamTradingActivityV2 gameStoreSteamTradingActivityV2, String str) {
        if (PatchProxy.proxy(new Object[]{gameStoreSteamTradingActivityV2, str}, null, changeQuickRedirect, true, 34487, new Class[]{GameStoreSteamTradingActivityV2.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreSteamTradingActivityV2.l3(str);
    }

    static /* synthetic */ void G2(GameStoreSteamTradingActivityV2 gameStoreSteamTradingActivityV2) {
        if (PatchProxy.proxy(new Object[]{gameStoreSteamTradingActivityV2}, null, changeQuickRedirect, true, 34488, new Class[]{GameStoreSteamTradingActivityV2.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreSteamTradingActivityV2.s3();
    }

    static /* synthetic */ void H2(GameStoreSteamTradingActivityV2 gameStoreSteamTradingActivityV2, String str) {
        if (PatchProxy.proxy(new Object[]{gameStoreSteamTradingActivityV2, str}, null, changeQuickRedirect, true, 34489, new Class[]{GameStoreSteamTradingActivityV2.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreSteamTradingActivityV2.M1(str);
    }

    static /* synthetic */ void I2(GameStoreSteamTradingActivityV2 gameStoreSteamTradingActivityV2, String str) {
        if (PatchProxy.proxy(new Object[]{gameStoreSteamTradingActivityV2, str}, null, changeQuickRedirect, true, 34490, new Class[]{GameStoreSteamTradingActivityV2.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreSteamTradingActivityV2.O1(str);
    }

    static /* synthetic */ void J2(GameStoreSteamTradingActivityV2 gameStoreSteamTradingActivityV2, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{gameStoreSteamTradingActivityV2, str, str2}, null, changeQuickRedirect, true, 34491, new Class[]{GameStoreSteamTradingActivityV2.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreSteamTradingActivityV2.q3(str, str2);
    }

    static /* synthetic */ void K2(GameStoreSteamTradingActivityV2 gameStoreSteamTradingActivityV2, String str) {
        if (PatchProxy.proxy(new Object[]{gameStoreSteamTradingActivityV2, str}, null, changeQuickRedirect, true, 34492, new Class[]{GameStoreSteamTradingActivityV2.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreSteamTradingActivityV2.r3(str);
    }

    private void M1(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 34456, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        N1(str, new r());
    }

    private void N1(String str, com.max.xiaoheihe.network.h hVar) {
        if (PatchProxy.proxy(new Object[]{str, hVar}, this, changeQuickRedirect, false, 34458, new Class[]{String.class, com.max.xiaoheihe.network.h.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzgifttest", "acceptFriend   " + str);
        String strReplaceAll = "https://steamcommunity.com/profiles/steam_id/friends/action";
        for (String str2 : this.f85185p2.getHost().keySet()) {
            strReplaceAll = strReplaceAll.replaceAll(str2, this.f85185p2.getHost().get(str2));
        }
        String strReplaceAll2 = strReplaceAll.replaceAll("steam_id", this.f85185p2.getBind_steamid_64());
        okhttp3.q.a aVar = new okhttp3.q.a();
        aVar.a("sessionid", this.G3);
        aVar.a("steamid", this.f85185p2.getBind_steamid_64());
        aVar.a("ajax", "1");
        aVar.a("action", "accept");
        aVar.a("steamids[]", str);
        t3(true, strReplaceAll2, aVar.c(), hVar);
    }

    private void O1(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 34460, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzgifttest", "acceptGift   " + str);
        String strReplaceAll = "https://store.steampowered.com/gifts/gift_id/unpack";
        for (String str2 : this.f85185p2.getHost().keySet()) {
            strReplaceAll = strReplaceAll.replaceAll(str2, this.f85185p2.getHost().get(str2));
        }
        String strReplaceAll2 = strReplaceAll.replaceAll("gift_id", str);
        okhttp3.q.a aVar = new okhttp3.q.a();
        aVar.a("sessionid", this.G3);
        t3(false, strReplaceAll2, aVar.c(), new a());
    }

    private void Q1(String str, int i10) {
        if (PatchProxy.proxy(new Object[]{str, new Integer(i10)}, this, changeQuickRedirect, false, 34457, new Class[]{String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzgifttest", "acceptHbFriend  friendId==  " + str + "count== " + i10);
        N1(str, new s(i10, 10, str));
    }

    static /* synthetic */ void S2(GameStoreSteamTradingActivityV2 gameStoreSteamTradingActivityV2) {
        if (PatchProxy.proxy(new Object[]{gameStoreSteamTradingActivityV2}, null, changeQuickRedirect, true, 34477, new Class[]{GameStoreSteamTradingActivityV2.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreSteamTradingActivityV2.y3();
    }

    static /* synthetic */ int W2(GameStoreSteamTradingActivityV2 gameStoreSteamTradingActivityV2) {
        int i10 = gameStoreSteamTradingActivityV2.L3;
        gameStoreSteamTradingActivityV2.L3 = i10 + 1;
        return i10;
    }

    static /* synthetic */ void X1(GameStoreSteamTradingActivityV2 gameStoreSteamTradingActivityV2) {
        if (PatchProxy.proxy(new Object[]{gameStoreSteamTradingActivityV2}, null, changeQuickRedirect, true, 34479, new Class[]{GameStoreSteamTradingActivityV2.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreSteamTradingActivityV2.C3();
    }

    static /* synthetic */ void X2(GameStoreSteamTradingActivityV2 gameStoreSteamTradingActivityV2, long j10) {
        if (PatchProxy.proxy(new Object[]{gameStoreSteamTradingActivityV2, new Long(j10)}, null, changeQuickRedirect, true, 34478, new Class[]{GameStoreSteamTradingActivityV2.class, Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreSteamTradingActivityV2.h3(j10);
    }

    static /* synthetic */ void Y1(GameStoreSteamTradingActivityV2 gameStoreSteamTradingActivityV2) {
        if (PatchProxy.proxy(new Object[]{gameStoreSteamTradingActivityV2}, null, changeQuickRedirect, true, 34480, new Class[]{GameStoreSteamTradingActivityV2.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreSteamTradingActivityV2.w3();
    }

    private void Y2(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 34464, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        String strReplaceAll = String.format(X3, this.G3, str2, str);
        for (String str3 : this.f85185p2.getHost().keySet()) {
            strReplaceAll = strReplaceAll.replaceAll(str3, this.f85185p2.getHost().get(str3));
        }
        this.Q3.a(new okhttp3.a0.a().B(strReplaceAll).b()).enqueue(new e(str, str2));
    }

    private void a3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34470, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().c9(this.f85189y1).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new com.max.hbcommon.network.d());
    }

    static /* synthetic */ void e2(GameStoreSteamTradingActivityV2 gameStoreSteamTradingActivityV2) {
        if (PatchProxy.proxy(new Object[]{gameStoreSteamTradingActivityV2}, null, changeQuickRedirect, true, 34481, new Class[]{GameStoreSteamTradingActivityV2.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreSteamTradingActivityV2.p3();
    }

    private void e3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34453, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.P3.a(new okhttp3.a0.a().B(W3).b()).enqueue(new o());
    }

    static /* synthetic */ void f2(GameStoreSteamTradingActivityV2 gameStoreSteamTradingActivityV2, String str, int i10) {
        if (PatchProxy.proxy(new Object[]{gameStoreSteamTradingActivityV2, str, new Integer(i10)}, null, changeQuickRedirect, true, 34482, new Class[]{GameStoreSteamTradingActivityV2.class, String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreSteamTradingActivityV2.Q1(str, i10);
    }

    private void f3(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 34461, new Class[]{String.class, String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.v(str, str2)) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzgifttest", "declineGift   " + str + "   botSteamid==" + str2);
        String strReplaceAll = "https://store.steampowered.com/gifts/gift_id/decline".replaceAll("gift_id", str);
        okhttp3.q.a aVar = new okhttp3.q.a();
        aVar.a("sessionid", this.G3);
        aVar.a("steamid_sender", str2);
        aVar.a("note", "");
        t3(false, strReplaceAll, aVar.c(), new b());
    }

    private void g3(String str) {
        WebviewFragment webviewFragment;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 34451, new Class[]{String.class}, Void.TYPE).isSupported || (webviewFragment = (WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            return;
        }
        webviewFragment.H6(str, null);
    }

    private void h3(long j10) {
        if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 34463, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().F5(this.f85189y1).w1(j10, TimeUnit.MILLISECONDS).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    public static Intent i3(Context context, String str, AutoAcceptGameParamsObj autoAcceptGameParamsObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, autoAcceptGameParamsObj}, null, changeQuickRedirect, true, 34448, new Class[]{Context.class, String.class, AutoAcceptGameParamsObj.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) GameStoreSteamTradingActivityV2.class);
        intent.putExtra("order_id", str);
        intent.putExtra(V3, autoAcceptGameParamsObj);
        return intent;
    }

    static /* synthetic */ void k2(GameStoreSteamTradingActivityV2 gameStoreSteamTradingActivityV2) {
        if (PatchProxy.proxy(new Object[]{gameStoreSteamTradingActivityV2}, null, changeQuickRedirect, true, 34483, new Class[]{GameStoreSteamTradingActivityV2.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreSteamTradingActivityV2.k3();
    }

    private void k3() {
        Dialog dialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34475, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.G2.removeMessages(0);
        if (this.f66601b.isFinishing() || (dialog = this.f85186p3) == null || !dialog.isShowing()) {
            return;
        }
        this.f85186p3.dismiss();
    }

    private void l3(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 34466, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        String strReplaceAll = "https://steamcommunity.com/actions/AddFriendAjax";
        for (String str2 : this.f85185p2.getHost().keySet()) {
            strReplaceAll = strReplaceAll.replaceAll(str2, this.f85185p2.getHost().get(str2));
        }
        okhttp3.q.a aVar = new okhttp3.q.a();
        aVar.a("sessionID", this.G3);
        aVar.a("steamid", str);
        aVar.a("accept_invite", "0");
        this.Q3.a(new okhttp3.a0.a().r(aVar.c()).B(strReplaceAll).b()).enqueue(new g(str));
    }

    static /* synthetic */ void m2(GameStoreSteamTradingActivityV2 gameStoreSteamTradingActivityV2) {
        if (PatchProxy.proxy(new Object[]{gameStoreSteamTradingActivityV2}, null, changeQuickRedirect, true, 34484, new Class[]{GameStoreSteamTradingActivityV2.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreSteamTradingActivityV2.A3();
    }

    static /* synthetic */ void n2(GameStoreSteamTradingActivityV2 gameStoreSteamTradingActivityV2) {
        if (PatchProxy.proxy(new Object[]{gameStoreSteamTradingActivityV2}, null, changeQuickRedirect, true, 34485, new Class[]{GameStoreSteamTradingActivityV2.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreSteamTradingActivityV2.n3();
    }

    private void n3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34462, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        f85180t4.post(new c());
    }

    private void p3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34459, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        f85180t4.post(new t());
    }

    private void q3(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 34465, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f85180t4.post(new f(str2));
    }

    private void r3(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 34467, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f85180t4.post(new h(str));
    }

    private void s3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34468, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        k3();
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(this.f66601b);
        fVar.l("自动领取超时,请稍后再试").g(false).u(getString(R.string.confirm), new i());
        fVar.F();
    }

    private void t3(boolean z10, String str, okhttp3.b0 b0Var, com.max.xiaoheihe.network.h hVar) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), str, b0Var, hVar}, this, changeQuickRedirect, false, 34454, new Class[]{Boolean.TYPE, String.class, okhttp3.b0.class, com.max.xiaoheihe.network.h.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.f.a((z10 ? this.Q3 : this.P3).a(new okhttp3.a0.a().r(b0Var).B(str).b()), hVar);
    }

    private void u3(WebviewFragment webviewFragment) {
        if (PatchProxy.proxy(new Object[]{webviewFragment}, this, changeQuickRedirect, false, 34452, new Class[]{WebviewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        webviewFragment.Y7(new n(webviewFragment));
    }

    private void w3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34450, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f85188x2 = f85167g4;
        C3();
        k3();
        com.max.xiaoheihe.utils.d.h(this.f66601b);
        AutoAcceptGameParamsObj autoAcceptGameParamsObj = this.f85185p2;
        if (autoAcceptGameParamsObj != null && autoAcceptGameParamsObj.getAndroid_proxy() != null && this.f85185p2.getAndroid_proxy().getEncrypted_proxy_info() != null) {
            String strC = com.max.hbcommon.utils.e.c(this.f85185p2.getAndroid_proxy().getEncrypted_proxy_info().getP1(), com.max.xiaoheihe.utils.w.c(this.f85185p2.getAndroid_proxy().getEncrypted_proxy_info().getP3()));
            if (com.max.xiaoheihe.utils.d.a1(strC).equals(this.f85185p2.getAndroid_proxy().getEncrypted_proxy_info().getP2())) {
                String[] strArrSplit = strC.split(":");
                if (strArrSplit.length > 1) {
                    this.R3 = strArrSplit[0];
                    this.S3 = strArrSplit[1];
                    com.max.hbcommon.utils.d.b("zzzzgift", "host = " + this.R3 + "    port" + this.S3);
                }
            }
        }
        WebviewFragment webviewFragmentA = new com.max.xiaoheihe.module.webview.u(W3).t(new ProxyAddressObj(this.R3, this.S3)).a();
        if (this.f85185p2.getAcc_proxy() != null) {
            String appid = this.f85185p2.getAcc_proxy().getAppid();
            com.max.hbcommon.utils.d.b("zzzzgift", "acc_appid = " + appid);
            webviewFragmentA.M7(appid);
        }
        u3(webviewFragmentA);
        if (isFinishing()) {
            return;
        }
        getSupportFragmentManager().u().y(R.id.fragment_container, webviewFragmentA).n();
    }

    static /* synthetic */ void x2(GameStoreSteamTradingActivityV2 gameStoreSteamTradingActivityV2, String str) {
        if (PatchProxy.proxy(new Object[]{gameStoreSteamTradingActivityV2, str}, null, changeQuickRedirect, true, 34476, new Class[]{GameStoreSteamTradingActivityV2.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreSteamTradingActivityV2.g3(str);
    }

    private void y3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34473, new Class[0], Void.TYPE).isSupported || this.f66601b.isFinishing()) {
            return;
        }
        if (this.f85186p3 == null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f66601b);
            View viewInflate = this.f66602c.inflate(R.layout.dialog_purchase, (ViewGroup) null, false);
            this.L = (ProgressBar) viewInflate.findViewById(R.id.pb_title);
            this.M = (TextView) viewInflate.findViewById(R.id.tv_title);
            this.N = viewInflate.findViewById(R.id.vg_progress_desc_0);
            this.O = (TextView) viewInflate.findViewById(R.id.tv_progress_0);
            this.P = (TextView) viewInflate.findViewById(R.id.tv_progress_desc_0);
            this.Q = (TextView) viewInflate.findViewById(R.id.tv_progress_checked_0);
            this.R = (ProgressBgView) viewInflate.findViewById(R.id.pb_0);
            this.S = viewInflate.findViewById(R.id.vg_progress_desc_1);
            this.T = (TextView) viewInflate.findViewById(R.id.tv_progress_1);
            this.U = (TextView) viewInflate.findViewById(R.id.tv_progress_desc_1);
            this.V = (TextView) viewInflate.findViewById(R.id.tv_progress_checked_1);
            this.W = (ProgressBgView) viewInflate.findViewById(R.id.pb_1);
            this.X = viewInflate.findViewById(R.id.vg_progress_desc_2);
            this.Y = (TextView) viewInflate.findViewById(R.id.tv_progress_2);
            this.Z = (TextView) viewInflate.findViewById(R.id.tv_progress_desc_2);
            this.f85181a0 = (TextView) viewInflate.findViewById(R.id.tv_progress_checked_2);
            this.f85182b0 = (ProgressBgView) viewInflate.findViewById(R.id.pb_2);
            this.f85183c0 = viewInflate.findViewById(R.id.vg_button_panel);
            this.f85184p1 = (TextView) viewInflate.findViewById(R.id.tv_negative_button);
            this.f85187x1 = (TextView) viewInflate.findViewById(R.id.tv_positive_button);
            bb.d.d(this.Q, 0);
            this.Q.setText(lb.b.f131100p);
            bb.d.d(this.V, 0);
            this.V.setText(lb.b.f131100p);
            this.f85184p1.setOnClickListener(new j());
            this.f85187x1.setText("确定");
            this.f85187x1.setOnClickListener(new l());
            AlertDialog alertDialogCreate = builder.setView(viewInflate).setCancelable(false).create();
            this.f85186p3 = alertDialogCreate;
            Window window = alertDialogCreate.getWindow();
            if (window != null) {
                window.setBackgroundDrawableResource(android.R.color.transparent);
            }
        }
        this.f85186p3.show();
        this.G2.removeMessages(0);
        this.G2.sendEmptyMessageDelayed(0, 40000L);
    }

    public void B3() {
        Dialog dialog;
        View view;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34474, new Class[0], Void.TYPE).isSupported || f85163c4.equals(this.f85188x2) || f85174n4.equals(this.f85188x2) || (dialog = this.f85186p3) == null || !dialog.isShowing() || (view = this.f85183c0) == null) {
            return;
        }
        view.setVisibility(0);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34449, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_game_store_steam_trading);
        ButterKnife.a(this);
        this.f85189y1 = getIntent().getStringExtra("order_id");
        this.f85185p2 = (AutoAcceptGameParamsObj) getIntent().getSerializableExtra(V3);
        this.K3 = new b2(new ka.d(this.f66601b));
        this.P3 = new okhttp3.z().e0().o(this.K3).Z(new e2("store.steampowered.com")).d(new com.max.xiaoheihe.network.g()).c(new k()).f();
        this.Q3 = new okhttp3.z().e0().o(this.K3).Z(new e2()).d(new com.max.xiaoheihe.network.g()).c(new m()).f();
        this.f66616q.setTitle(getString(R.string.loading));
        this.f66617r.setVisibility(0);
        this.f85188x2 = Y3;
        this.mProgressBarView.setVisibility(0);
        D3(this.f85185p2);
        y3();
        e3();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34469, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.G2.removeCallbacksAndMessages(null);
        super.onDestroy();
    }
}
