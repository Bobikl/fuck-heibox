package com.max.xiaoheihe.module.game;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcustomview.ProgressBgView;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.bean.game.AutoAcceptGameParamsObj;
import com.max.xiaoheihe.bean.game.GamePurchaseOrderProgressObj;
import com.max.xiaoheihe.bean.game.SteamAcceptGameParams;
import com.max.xiaoheihe.bean.proxy.ProxyAddressObj;
import com.max.xiaoheihe.module.trade.TradeInfoUtilKt;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.analytics.MobclickAgent;
import com.umeng.message.common.inter.ITagManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class GameStoreSteamTradingActivity extends BaseActivity {
    private static final String A4 = "js_remember_login_automatically";
    private static final int B4 = 15;
    private static final int C4 = 2000;
    private static final int D4 = 60;
    private static final String R3 = "order_id";
    private static final String S3 = "buy_type";
    private static final String T3 = "auto_accept_game_params";
    private static final String U3 = "friend";
    private static final String V3 = "automatically";
    private static final String W3 = "status_not_invite_friend";
    private static final String X3 = "status_invite_friend";
    private static final String Y3 = "status_accept_friend";
    private static final String Z3 = "status_invite_gift";

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private static final String f85111a4 = "status_accept_gift_succeed";

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private static final String f85112b4 = "status_accept_gift_failed";

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private static final String f85113c4 = "status_accept_gift_declined";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    private static final String f85114d4 = "status_community_relogin";

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    private static final String f85115e4 = "status_community_login";

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private static final String f85116f4 = "status_store_relogin";

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    private static final String f85117g4 = "status_store_login";

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    private static final String f85118h4 = "status_invite_friend_timeout";

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    private static final String f85119i4 = "status_invite_gift_timeout";

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    private static final String f85120j4 = "status_not_activate_cdkey";

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    private static final String f85121k4 = "status_activating_cdkey";

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    private static final String f85122l4 = "status_activate_cdkey_succeed";

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    private static final String f85123m4 = "status_activate_cdkey_failed";

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    private static final String f85124n4 = "relogin";

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    private static final String f85125o4 = "login";

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    private static final String f85126p4 = "accept_gift";

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    private static final String f85127q4 = "decline_gift";

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    private static final String f85128r4 = "friend";

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    private static final String f85129s4 = "register";

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    private static final String f85130t4 = "step_waiting";

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    private static final String f85131u4 = "step_ongoing";

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    private static final String f85132v4 = "step_completed";

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    private static final String f85133w4 = "step_timeout";

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    private static final String f85134x4 = "js_add_friend_automatically";

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    private static final String f85135y4 = "js_accept_gift_automatically";

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    private static final String f85136z4 = "js_activate_cdkey_automatically";
    private boolean G2;
    private String G3;
    private String J3;
    private String K3;
    ProgressBar L;
    private SteamAcceptGameParams L3;
    TextView M;
    View N;
    TextView O;
    private String O3;
    TextView P;
    private String P3;
    TextView Q;
    private Dialog Q3;
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
    TextView f85137a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    ProgressBgView f85138b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    View f85139c0;

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
    TextView f85140p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private String f85141p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private int f85142p3;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    TextView f85143x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private AutoAcceptGameParamsObj f85144x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private String f85145y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private boolean f85146y2;
    private Map<String, String> M3 = new LinkedHashMap(16);
    private final l N3 = new l(this);

    public class a implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34428, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(((BaseActivity) GameStoreSteamTradingActivity.this).f66601b, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.C2);
            intent.putExtra("title", GameStoreSteamTradingActivity.this.getString(R.string.region_error_solution));
            ((BaseActivity) GameStoreSteamTradingActivity.this).f66601b.startActivity(intent);
            dialogInterface.dismiss();
            GameStoreSteamTradingActivity.this.finish();
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34429, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class c extends WebviewFragment.o0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void b(WebProtocolObj webProtocolObj) {
            if (!PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 34427, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported && WebProtocolObj.PROTOCOL_TYPE_STEAM_CALLBACK.equals(webProtocolObj.getProtocol_type())) {
                String strValueOf = webProtocolObj.valueOf("type");
                String strValueOf2 = webProtocolObj.valueOf("state");
                String strValueOf3 = webProtocolObj.valueOf("error");
                if ("relogin".equals(strValueOf)) {
                    com.max.xiaoheihe.utils.d.h(((BaseActivity) GameStoreSteamTradingActivity.this).f66601b);
                    if (GameStoreSteamTradingActivity.this.L3 != null && GameStoreSteamTradingActivity.X3.equals(GameStoreSteamTradingActivity.this.L3.getType())) {
                        GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.f85114d4;
                        GameStoreSteamTradingActivity gameStoreSteamTradingActivity = GameStoreSteamTradingActivity.this;
                        GameStoreSteamTradingActivity.Q1(gameStoreSteamTradingActivity, "1".equals(gameStoreSteamTradingActivity.L3.getUse_proxy()));
                        GameStoreSteamTradingActivity gameStoreSteamTradingActivity2 = GameStoreSteamTradingActivity.this;
                        GameStoreSteamTradingActivity.R1(gameStoreSteamTradingActivity2, gameStoreSteamTradingActivity2.L3.getLogin_url());
                    } else if (GameStoreSteamTradingActivity.this.L3 != null && GameStoreSteamTradingActivity.Z3.equals(GameStoreSteamTradingActivity.this.L3.getType())) {
                        GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.f85116f4;
                        GameStoreSteamTradingActivity gameStoreSteamTradingActivity3 = GameStoreSteamTradingActivity.this;
                        GameStoreSteamTradingActivity.Q1(gameStoreSteamTradingActivity3, "1".equals(gameStoreSteamTradingActivity3.L3.getUse_proxy()));
                        GameStoreSteamTradingActivity gameStoreSteamTradingActivity4 = GameStoreSteamTradingActivity.this;
                        GameStoreSteamTradingActivity.R1(gameStoreSteamTradingActivity4, gameStoreSteamTradingActivity4.L3.getLogin_url());
                    } else if (GameStoreSteamTradingActivity.this.L3 != null && GameStoreSteamTradingActivity.f85121k4.equals(GameStoreSteamTradingActivity.this.L3.getType())) {
                        GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.f85116f4;
                        GameStoreSteamTradingActivity gameStoreSteamTradingActivity5 = GameStoreSteamTradingActivity.this;
                        GameStoreSteamTradingActivity.Q1(gameStoreSteamTradingActivity5, "1".equals(gameStoreSteamTradingActivity5.L3.getUse_proxy()));
                        GameStoreSteamTradingActivity gameStoreSteamTradingActivity6 = GameStoreSteamTradingActivity.this;
                        GameStoreSteamTradingActivity.R1(gameStoreSteamTradingActivity6, gameStoreSteamTradingActivity6.L3.getLogin_url());
                    }
                    GameStoreSteamTradingActivity.T1(GameStoreSteamTradingActivity.this);
                } else if ("login".equals(strValueOf)) {
                    if (GameStoreSteamTradingActivity.this.L3 != null && GameStoreSteamTradingActivity.X3.equals(GameStoreSteamTradingActivity.this.L3.getType())) {
                        GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.f85115e4;
                        GameStoreSteamTradingActivity gameStoreSteamTradingActivity7 = GameStoreSteamTradingActivity.this;
                        GameStoreSteamTradingActivity.Q1(gameStoreSteamTradingActivity7, "1".equals(gameStoreSteamTradingActivity7.L3.getUse_proxy()));
                        GameStoreSteamTradingActivity gameStoreSteamTradingActivity8 = GameStoreSteamTradingActivity.this;
                        GameStoreSteamTradingActivity.R1(gameStoreSteamTradingActivity8, gameStoreSteamTradingActivity8.L3.getLogin_url());
                    } else if (GameStoreSteamTradingActivity.this.L3 != null && GameStoreSteamTradingActivity.Z3.equals(GameStoreSteamTradingActivity.this.L3.getType())) {
                        GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.f85117g4;
                        GameStoreSteamTradingActivity gameStoreSteamTradingActivity9 = GameStoreSteamTradingActivity.this;
                        GameStoreSteamTradingActivity.Q1(gameStoreSteamTradingActivity9, "1".equals(gameStoreSteamTradingActivity9.L3.getUse_proxy()));
                        GameStoreSteamTradingActivity gameStoreSteamTradingActivity10 = GameStoreSteamTradingActivity.this;
                        GameStoreSteamTradingActivity.R1(gameStoreSteamTradingActivity10, gameStoreSteamTradingActivity10.L3.getLogin_url());
                    } else if (GameStoreSteamTradingActivity.this.L3 != null && GameStoreSteamTradingActivity.f85121k4.equals(GameStoreSteamTradingActivity.this.L3.getType())) {
                        GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.f85117g4;
                        GameStoreSteamTradingActivity gameStoreSteamTradingActivity11 = GameStoreSteamTradingActivity.this;
                        GameStoreSteamTradingActivity.Q1(gameStoreSteamTradingActivity11, "1".equals(gameStoreSteamTradingActivity11.L3.getUse_proxy()));
                        GameStoreSteamTradingActivity gameStoreSteamTradingActivity12 = GameStoreSteamTradingActivity.this;
                        GameStoreSteamTradingActivity.R1(gameStoreSteamTradingActivity12, gameStoreSteamTradingActivity12.L3.getLogin_url());
                    }
                } else if (GameStoreSteamTradingActivity.f85126p4.equals(strValueOf)) {
                    if (ITagManager.SUCCESS.equalsIgnoreCase(strValueOf2)) {
                        GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.f85111a4;
                    } else {
                        GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.f85112b4;
                        if ("2".equals(strValueOf3)) {
                            GameStoreSteamTradingActivity.V1(GameStoreSteamTradingActivity.this);
                        }
                    }
                } else if (GameStoreSteamTradingActivity.f85127q4.equals(strValueOf)) {
                    if (ITagManager.SUCCESS.equalsIgnoreCase(strValueOf2)) {
                        GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.f85113c4;
                    } else {
                        GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.f85112b4;
                    }
                } else if ("friend".equals(strValueOf)) {
                    if (ITagManager.SUCCESS.equalsIgnoreCase(strValueOf2)) {
                        GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.Y3;
                        if (GameStoreSteamTradingActivity.this.f85142p3 <= 15) {
                            GameStoreSteamTradingActivity.Z1(GameStoreSteamTradingActivity.this, 0L);
                        }
                    } else {
                        GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.f85112b4;
                    }
                } else if ("register".equals(strValueOf)) {
                    GameStoreSteamTradingActivity.this.J3 = webProtocolObj.valueOf("msg");
                    if (ITagManager.SUCCESS.equalsIgnoreCase(strValueOf2)) {
                        GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.f85122l4;
                    } else {
                        GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.f85123m4;
                    }
                }
                GameStoreSteamTradingActivity.y2(GameStoreSteamTradingActivity.this);
            }
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void g(WebView webView, String str, int i10, int i11) {
            String str2;
            Object[] objArr = {webView, str, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 34425, new Class[]{WebView.class, String.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            if (i11 - 1 == 0 && GameStoreSteamTradingActivity.this.L3 != null && str.matches(GameStoreSteamTradingActivity.this.L3.getRegular())) {
                if (GameStoreSteamTradingActivity.this.G2) {
                    if (GameStoreSteamTradingActivity.this.L3.getJs() != null) {
                        String strC = com.max.hbcommon.utils.e.c(GameStoreSteamTradingActivity.this.L3.getJs().getP1(), com.max.xiaoheihe.utils.w.c(GameStoreSteamTradingActivity.this.L3.getJs().getP3()));
                        String strA1 = com.max.xiaoheihe.utils.d.a1(strC);
                        if (GameStoreSteamTradingActivity.X3.equals(GameStoreSteamTradingActivity.this.L3.getType())) {
                            str2 = GameStoreSteamTradingActivity.f85134x4;
                        } else if (GameStoreSteamTradingActivity.Z3.equals(GameStoreSteamTradingActivity.this.L3.getType())) {
                            str2 = GameStoreSteamTradingActivity.f85135y4;
                        } else {
                            str2 = GameStoreSteamTradingActivity.f85121k4.equals(GameStoreSteamTradingActivity.this.L3.getType()) ? GameStoreSteamTradingActivity.f85136z4 : "null";
                        }
                        if (strA1.equals(GameStoreSteamTradingActivity.this.L3.getJs().getP2())) {
                            GameStoreSteamTradingActivity.A2(GameStoreSteamTradingActivity.this, str2 + lg.a.f131412e + com.max.hbutils.utils.w.C(), strC);
                        }
                    }
                } else if (GameStoreSteamTradingActivity.X3.equals(GameStoreSteamTradingActivity.this.L3.getType())) {
                    GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.W3;
                } else if (GameStoreSteamTradingActivity.Z3.equals(GameStoreSteamTradingActivity.this.L3.getType())) {
                    if ("1".equals(GameStoreSteamTradingActivity.this.L3.getSend())) {
                        GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.Z3;
                    } else {
                        GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.Y3;
                    }
                } else if (GameStoreSteamTradingActivity.f85121k4.equals(GameStoreSteamTradingActivity.this.L3.getType())) {
                    GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.f85121k4;
                }
            } else if (str.contains("/login") && !GameStoreSteamTradingActivity.f85111a4.equals(GameStoreSteamTradingActivity.this.G3) && !GameStoreSteamTradingActivity.f85122l4.equals(GameStoreSteamTradingActivity.this.G3)) {
                GameStoreSteamTradingActivity.z2(GameStoreSteamTradingActivity.this);
                if (GameStoreSteamTradingActivity.f85114d4.equals(GameStoreSteamTradingActivity.this.G3)) {
                    GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.f85115e4;
                } else if (GameStoreSteamTradingActivity.f85116f4.equals(GameStoreSteamTradingActivity.this.G3)) {
                    GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.f85117g4;
                }
            }
            GameStoreSteamTradingActivity.y2(GameStoreSteamTradingActivity.this);
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void i(WebView webView, String str, int i10, int i11) {
            Object[] objArr = {webView, str, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 34424, new Class[]{WebView.class, String.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            if (GameStoreSteamTradingActivity.this.G2 && GameStoreSteamTradingActivity.this.L3 != null && str.matches(GameStoreSteamTradingActivity.this.L3.getRegular())) {
                GameStoreSteamTradingActivity.x2(GameStoreSteamTradingActivity.this);
                GameStoreSteamTradingActivity.y2(GameStoreSteamTradingActivity.this);
            } else if (str.contains("/login")) {
                GameStoreSteamTradingActivity.z2(GameStoreSteamTradingActivity.this);
            }
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void k(WebView webView, int i10) {
            if (PatchProxy.proxy(new Object[]{webView, new Integer(i10)}, this, changeQuickRedirect, false, 34426, new Class[]{WebView.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            String url = webView.getUrl();
            if (i10 != 100 || url == null || !url.contains("/login") || GameStoreSteamTradingActivity.this.L3 == null || GameStoreSteamTradingActivity.this.L3.getRemember_js() == null) {
                return;
            }
            String strC = com.max.hbcommon.utils.e.c(GameStoreSteamTradingActivity.this.L3.getRemember_js().getP1(), com.max.xiaoheihe.utils.w.c(GameStoreSteamTradingActivity.this.L3.getRemember_js().getP3()));
            if (com.max.xiaoheihe.utils.d.a1(strC).equals(GameStoreSteamTradingActivity.this.L3.getRemember_js().getP2())) {
                GameStoreSteamTradingActivity.A2(GameStoreSteamTradingActivity.this, "js_remember_login_automatically_" + com.max.hbutils.utils.w.C(), strC);
            }
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void o(WebView webView, String str) {
            if (PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 34423, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(str) || ((BaseActivity) GameStoreSteamTradingActivity.this).f66616q == null || ((BaseActivity) GameStoreSteamTradingActivity.this).f66616q.getVisibility() != 0) {
                return;
            }
            if ("about:blank".equalsIgnoreCase(str)) {
                str = GameStoreSteamTradingActivity.this.getString(R.string.loading);
            }
            ((BaseActivity) GameStoreSteamTradingActivity.this).f66616q.setTitle(str);
        }
    }

    public class d implements ValueCallback<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        public void a(String str) {
        }

        @Override // android.webkit.ValueCallback
        public /* bridge */ /* synthetic */ void onReceiveValue(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 34430, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a(str);
        }
    }

    public class e extends com.max.hbcommon.network.d<Result<GamePurchaseOrderProgressObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34431, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameStoreSteamTradingActivity.this.isActive()) {
                super.onError(th2);
                GameStoreSteamTradingActivity.this.finish();
            }
        }

        public void onNext(Result<GamePurchaseOrderProgressObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34432, new Class[]{Result.class}, Void.TYPE).isSupported && GameStoreSteamTradingActivity.this.isActive()) {
                super.onNext(result);
                GamePurchaseOrderProgressObj result2 = result.getResult();
                if (result2 != null) {
                    if (!"1".equals(result2.getFriend()) && !"2".equals(result2.getFriend())) {
                        GameStoreSteamTradingActivity.this.f85142p3 = 0;
                        GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.W3;
                        GameStoreSteamTradingActivity.b2(GameStoreSteamTradingActivity.this, 2000L);
                        GameStoreSteamTradingActivity.y2(GameStoreSteamTradingActivity.this);
                        return;
                    }
                    GameStoreSteamTradingActivity.this.f85146y2 = "1".equals(result2.getFriend());
                    if ("1".equals(result2.getSend_game())) {
                        GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.Z3;
                    } else if (GameStoreSteamTradingActivity.this.f85146y2) {
                        GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.Y3;
                    } else {
                        GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.W3;
                    }
                    GameStoreSteamTradingActivity.this.f85142p3 = 0;
                    GameStoreSteamTradingActivity.Z1(GameStoreSteamTradingActivity.this, 0L);
                    GameStoreSteamTradingActivity.y2(GameStoreSteamTradingActivity.this);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34433, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GamePurchaseOrderProgressObj>) obj);
        }
    }

    public class f extends com.max.hbcommon.network.d<Result<GamePurchaseOrderProgressObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34434, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreSteamTradingActivity.Y1(GameStoreSteamTradingActivity.this);
            if (GameStoreSteamTradingActivity.this.isActive()) {
                super.onError(th2);
                GameStoreSteamTradingActivity.this.finish();
            }
        }

        public void onNext(Result<GamePurchaseOrderProgressObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34435, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreSteamTradingActivity.Y1(GameStoreSteamTradingActivity.this);
            if (GameStoreSteamTradingActivity.this.isActive()) {
                super.onNext(result);
                GamePurchaseOrderProgressObj result2 = result.getResult();
                if (result2 != null) {
                    if (!"1".equals(result2.getFriend()) && !"2".equals(result2.getFriend()) && GameStoreSteamTradingActivity.this.f85142p3 <= 15) {
                        GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.W3;
                        GameStoreSteamTradingActivity.h2(GameStoreSteamTradingActivity.this);
                        GameStoreSteamTradingActivity.y2(GameStoreSteamTradingActivity.this);
                        return;
                    }
                    GameStoreSteamTradingActivity.this.f85146y2 = "1".equals(result2.getFriend());
                    if ("1".equals(result2.getSend_game())) {
                        GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.Z3;
                    } else if (GameStoreSteamTradingActivity.this.f85146y2) {
                        GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.Y3;
                    } else {
                        GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.W3;
                    }
                    GameStoreSteamTradingActivity.this.f85142p3 = 0;
                    GameStoreSteamTradingActivity.Z1(GameStoreSteamTradingActivity.this, 0L);
                    GameStoreSteamTradingActivity.y2(GameStoreSteamTradingActivity.this);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34436, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GamePurchaseOrderProgressObj>) obj);
        }
    }

    public class g extends com.max.hbcommon.network.d<Result<AutoAcceptGameParamsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34437, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreSteamTradingActivity.Y1(GameStoreSteamTradingActivity.this);
            if (GameStoreSteamTradingActivity.this.isActive()) {
                super.onError(th2);
                if (GameStoreSteamTradingActivity.W3.equals(GameStoreSteamTradingActivity.this.G3)) {
                    GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.f85118h4;
                } else if (GameStoreSteamTradingActivity.Y3.equals(GameStoreSteamTradingActivity.this.G3)) {
                    GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.f85119i4;
                }
                GameStoreSteamTradingActivity.y2(GameStoreSteamTradingActivity.this);
            }
        }

        public void onNext(Result<AutoAcceptGameParamsObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34438, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreSteamTradingActivity.Y1(GameStoreSteamTradingActivity.this);
            if (GameStoreSteamTradingActivity.this.isActive()) {
                super.onNext(result);
                AutoAcceptGameParamsObj result2 = result.getResult();
                if (result2 == null) {
                    return;
                }
                GameStoreSteamTradingActivity.i2(GameStoreSteamTradingActivity.this, result2);
                if (result2.getAndroid_proxy() != null && result2.getAndroid_proxy().getEncrypted_proxy_info() != null && GameStoreSteamTradingActivity.this.O3 == null) {
                    String strC = com.max.hbcommon.utils.e.c(result2.getAndroid_proxy().getEncrypted_proxy_info().getP1(), com.max.xiaoheihe.utils.w.c(result2.getAndroid_proxy().getEncrypted_proxy_info().getP3()));
                    if (com.max.xiaoheihe.utils.d.a1(strC).equals(result2.getAndroid_proxy().getEncrypted_proxy_info().getP2())) {
                        String[] strArrSplit = strC.split(":");
                        if (strArrSplit.length > 1) {
                            GameStoreSteamTradingActivity.this.O3 = strArrSplit[0];
                            GameStoreSteamTradingActivity.this.P3 = strArrSplit[1];
                        }
                    }
                }
                if ("12".equals(result2.getProduct_state())) {
                    GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.f85111a4;
                    GameStoreSteamTradingActivity.this.L3 = result2.getAccept_gift();
                    GameStoreSteamTradingActivity.this.L3.setType(GameStoreSteamTradingActivity.Z3);
                    GameStoreSteamTradingActivity gameStoreSteamTradingActivity = GameStoreSteamTradingActivity.this;
                    GameStoreSteamTradingActivity.Q1(gameStoreSteamTradingActivity, "1".equals(gameStoreSteamTradingActivity.L3.getUse_proxy()));
                    GameStoreSteamTradingActivity gameStoreSteamTradingActivity2 = GameStoreSteamTradingActivity.this;
                    GameStoreSteamTradingActivity.R1(gameStoreSteamTradingActivity2, gameStoreSteamTradingActivity2.G2 ? GameStoreSteamTradingActivity.this.L3.getUrl() : GameStoreSteamTradingActivity.this.L3.getLogin_url());
                    return;
                }
                if (GameStoreSteamTradingActivity.W3.equals(GameStoreSteamTradingActivity.this.G3)) {
                    if ("1".equals(result2.getNo_bot())) {
                        if (GameStoreSteamTradingActivity.this.f85142p3 <= 15) {
                            GameStoreSteamTradingActivity.Z1(GameStoreSteamTradingActivity.this, 2000L);
                            return;
                        }
                        GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.f85118h4;
                        com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.f(GameStoreSteamTradingActivity.this.getString(R.string.purchase_timeout));
                        return;
                    }
                    GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.X3;
                    GameStoreSteamTradingActivity.this.L3 = result2.getAccept_friend();
                    GameStoreSteamTradingActivity.this.L3.setType(GameStoreSteamTradingActivity.X3);
                    GameStoreSteamTradingActivity.y2(GameStoreSteamTradingActivity.this);
                    GameStoreSteamTradingActivity gameStoreSteamTradingActivity3 = GameStoreSteamTradingActivity.this;
                    GameStoreSteamTradingActivity.Q1(gameStoreSteamTradingActivity3, "1".equals(gameStoreSteamTradingActivity3.L3.getUse_proxy()));
                    GameStoreSteamTradingActivity gameStoreSteamTradingActivity4 = GameStoreSteamTradingActivity.this;
                    GameStoreSteamTradingActivity.R1(gameStoreSteamTradingActivity4, gameStoreSteamTradingActivity4.G2 ? GameStoreSteamTradingActivity.this.L3.getUrl() : GameStoreSteamTradingActivity.this.L3.getLogin_url());
                    return;
                }
                if (!GameStoreSteamTradingActivity.Y3.equals(GameStoreSteamTradingActivity.this.G3)) {
                    if (GameStoreSteamTradingActivity.Z3.equals(GameStoreSteamTradingActivity.this.G3)) {
                        GameStoreSteamTradingActivity.this.L3 = result2.getAccept_gift();
                        GameStoreSteamTradingActivity.this.L3.setType(GameStoreSteamTradingActivity.Z3);
                        GameStoreSteamTradingActivity gameStoreSteamTradingActivity5 = GameStoreSteamTradingActivity.this;
                        GameStoreSteamTradingActivity.Q1(gameStoreSteamTradingActivity5, "1".equals(gameStoreSteamTradingActivity5.L3.getUse_proxy()));
                        GameStoreSteamTradingActivity gameStoreSteamTradingActivity6 = GameStoreSteamTradingActivity.this;
                        GameStoreSteamTradingActivity.R1(gameStoreSteamTradingActivity6, gameStoreSteamTradingActivity6.G2 ? GameStoreSteamTradingActivity.this.L3.getUrl() : GameStoreSteamTradingActivity.this.L3.getLogin_url());
                        return;
                    }
                    return;
                }
                GameStoreSteamTradingActivity.this.L3 = result2.getAccept_gift();
                GameStoreSteamTradingActivity.this.L3.setType(GameStoreSteamTradingActivity.Z3);
                if ("1".equals(GameStoreSteamTradingActivity.this.L3.getSend())) {
                    GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.Z3;
                    GameStoreSteamTradingActivity.y2(GameStoreSteamTradingActivity.this);
                    GameStoreSteamTradingActivity gameStoreSteamTradingActivity7 = GameStoreSteamTradingActivity.this;
                    GameStoreSteamTradingActivity.Q1(gameStoreSteamTradingActivity7, "1".equals(gameStoreSteamTradingActivity7.L3.getUse_proxy()));
                    GameStoreSteamTradingActivity gameStoreSteamTradingActivity8 = GameStoreSteamTradingActivity.this;
                    GameStoreSteamTradingActivity.R1(gameStoreSteamTradingActivity8, gameStoreSteamTradingActivity8.G2 ? GameStoreSteamTradingActivity.this.L3.getUrl() : GameStoreSteamTradingActivity.this.L3.getLogin_url());
                    return;
                }
                if (GameStoreSteamTradingActivity.this.f85142p3 <= 15) {
                    GameStoreSteamTradingActivity.Z1(GameStoreSteamTradingActivity.this, 2000L);
                    return;
                }
                GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.f85119i4;
                com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(GameStoreSteamTradingActivity.this.getString(R.string.purchase_timeout));
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34439, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<AutoAcceptGameParamsObj>) obj);
        }
    }

    public class h extends com.max.hbcommon.network.d<Result<AutoAcceptGameParamsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements yh.a<kotlin.b2> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AutoAcceptGameParamsObj f85155b;

            a(AutoAcceptGameParamsObj autoAcceptGameParamsObj) {
                this.f85155b = autoAcceptGameParamsObj;
            }

            public kotlin.b2 a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34442, new Class[0], kotlin.b2.class);
                if (patchProxyResultProxy.isSupported) {
                    return (kotlin.b2) patchProxyResultProxy.result;
                }
                GameStoreSteamTradingActivity.i2(GameStoreSteamTradingActivity.this, this.f85155b);
                if (this.f85155b.getSteam_proxy() != null && this.f85155b.getSteam_proxy().getProxy() != null && GameStoreSteamTradingActivity.this.O3 == null) {
                    String strC = com.max.hbcommon.utils.e.c(this.f85155b.getSteam_proxy().getProxy().getP1(), com.max.xiaoheihe.utils.w.c(this.f85155b.getSteam_proxy().getProxy().getP3()));
                    if (com.max.xiaoheihe.utils.d.a1(strC).equals(this.f85155b.getSteam_proxy().getProxy().getP2())) {
                        String[] strArrSplit = strC.split(":");
                        if (strArrSplit.length > 1) {
                            GameStoreSteamTradingActivity.this.O3 = strArrSplit[0];
                            GameStoreSteamTradingActivity.this.P3 = strArrSplit[1];
                        }
                    }
                }
                GameStoreSteamTradingActivity.this.G3 = GameStoreSteamTradingActivity.f85121k4;
                GameStoreSteamTradingActivity.this.L3 = this.f85155b.getUse_cdkey();
                GameStoreSteamTradingActivity.this.L3.setType(GameStoreSteamTradingActivity.f85121k4);
                GameStoreSteamTradingActivity.y2(GameStoreSteamTradingActivity.this);
                GameStoreSteamTradingActivity gameStoreSteamTradingActivity = GameStoreSteamTradingActivity.this;
                GameStoreSteamTradingActivity.Q1(gameStoreSteamTradingActivity, "1".equals(gameStoreSteamTradingActivity.L3.getUse_proxy()));
                GameStoreSteamTradingActivity gameStoreSteamTradingActivity2 = GameStoreSteamTradingActivity.this;
                GameStoreSteamTradingActivity.R1(gameStoreSteamTradingActivity2, gameStoreSteamTradingActivity2.L3.getUrl());
                return null;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34443, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        }

        h() {
        }

        public void onNext(Result<AutoAcceptGameParamsObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34440, new Class[]{Result.class}, Void.TYPE).isSupported && GameStoreSteamTradingActivity.this.isActive()) {
                super.onNext(result);
                AutoAcceptGameParamsObj result2 = result.getResult();
                if (result2 == null) {
                    return;
                }
                TradeInfoUtilKt.p(((BaseActivity) GameStoreSteamTradingActivity.this).f66601b, result2.getAcc_proxy(), new a(result2));
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34441, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<AutoAcceptGameParamsObj>) obj);
        }
    }

    public class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34444, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.i0(((BaseActivity) GameStoreSteamTradingActivity.this).f66601b, lb.d.f131195k4);
            GameStoreSteamTradingActivity.z2(GameStoreSteamTradingActivity.this);
        }
    }

    public class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34445, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreSteamTradingActivity.this.G2 = false;
            GameStoreSteamTradingActivity.z2(GameStoreSteamTradingActivity.this);
        }
    }

    public class k implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34446, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            GameStoreSteamTradingActivity.this.finish();
        }
    }

    public static class l extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<GameStoreSteamTradingActivity> f85160a;

        public l(GameStoreSteamTradingActivity gameStoreSteamTradingActivity) {
            this.f85160a = new WeakReference<>(gameStoreSteamTradingActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 34447, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            super.handleMessage(message);
            GameStoreSteamTradingActivity gameStoreSteamTradingActivity = this.f85160a.get();
            if (gameStoreSteamTradingActivity != null) {
                gameStoreSteamTradingActivity.T2();
            }
        }
    }

    static /* synthetic */ void A2(GameStoreSteamTradingActivity gameStoreSteamTradingActivity, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{gameStoreSteamTradingActivity, str, str2}, null, changeQuickRedirect, true, 34414, new Class[]{GameStoreSteamTradingActivity.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreSteamTradingActivity.E2(str, str2);
    }

    private void D2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34403, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().c9(this.f85145y1).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new com.max.hbcommon.network.d());
    }

    private void E2(String str, String str2) {
        WebviewFragment webviewFragment;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 34397, new Class[]{String.class, String.class}, Void.TYPE).isSupported || (webviewFragment = (WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null || webviewFragment.U6() == null) {
            return;
        }
        WebView webViewU6 = webviewFragment.U6();
        if (this.M3.size() < 60) {
            this.M3.put(str, str2);
            webViewU6.evaluateJavascript(str2, new d());
        } else {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(getString(R.string.operation_automatically_timeout_tips));
        }
    }

    private void G2(long j10) {
        if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 34401, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().P6(this.f85145y1).w1(j10, TimeUnit.MILLISECONDS).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g()));
    }

    private void H2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34402, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().ya(this.f85145y1).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h()));
    }

    public static Intent I2(Context context, String str, String str2, AutoAcceptGameParamsObj autoAcceptGameParamsObj, boolean z10, boolean z11) {
        Object[] objArr = {context, str, str2, autoAcceptGameParamsObj, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 34393, new Class[]{Context.class, String.class, String.class, AutoAcceptGameParamsObj.class, cls, cls}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) GameStoreSteamTradingActivity.class);
        intent.putExtra("order_id", str);
        intent.putExtra("buy_type", str2);
        intent.putExtra(T3, autoAcceptGameParamsObj);
        intent.putExtra("friend", z10);
        intent.putExtra(V3, z11);
        return intent;
    }

    private void J2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34399, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().X5(this.f85145y1).I5(io.reactivex.schedulers.b.d()).M4(3L).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    private void K2(long j10) {
        if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 34400, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().X5(this.f85145y1).w1(j10, TimeUnit.MILLISECONDS).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    private void L2() {
        Dialog dialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34408, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.N3.removeCallbacksAndMessages(null);
        if (this.f66601b.isFinishing() || (dialog = this.Q3) == null || !dialog.isShowing()) {
            return;
        }
        this.Q3.dismiss();
    }

    private void O2(String str) {
        WebviewFragment webviewFragment;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 34396, new Class[]{String.class}, Void.TYPE).isSupported || (webviewFragment = (WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            return;
        }
        webviewFragment.t7(str);
    }

    private void P2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34406, new Class[0], Void.TYPE).isSupported || this.f66601b.isFinishing()) {
            return;
        }
        if (this.Q3 == null) {
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
            this.f85137a0 = (TextView) viewInflate.findViewById(R.id.tv_progress_checked_2);
            this.f85138b0 = (ProgressBgView) viewInflate.findViewById(R.id.pb_2);
            this.f85139c0 = viewInflate.findViewById(R.id.vg_button_panel);
            this.f85140p1 = (TextView) viewInflate.findViewById(R.id.tv_negative_button);
            this.f85143x1 = (TextView) viewInflate.findViewById(R.id.tv_positive_button);
            bb.d.d(this.Q, 0);
            this.Q.setText(lb.b.f131100p);
            bb.d.d(this.V, 0);
            this.V.setText(lb.b.f131100p);
            if ("cdkey".equals(this.f85141p2)) {
                this.O.setText(getString(R.string.activate_cdkey));
                this.f85143x1.setText(getString(R.string.confirm));
                this.S.setVisibility(8);
                this.W.setVisibility(8);
                this.X.setVisibility(8);
                this.f85138b0.setVisibility(8);
            }
            this.f85140p1.setOnClickListener(new i());
            this.f85143x1.setOnClickListener(new j());
            AlertDialog alertDialogCreate = builder.setView(viewInflate).setCancelable(false).create();
            this.Q3 = alertDialogCreate;
            Window window = alertDialogCreate.getWindow();
            if (window != null) {
                window.setBackgroundDrawableResource(android.R.color.transparent);
            }
        }
        this.Q3.show();
        this.N3.removeCallbacksAndMessages(null);
        this.N3.sendEmptyMessageDelayed(0, 60000L);
    }

    static /* synthetic */ void Q1(GameStoreSteamTradingActivity gameStoreSteamTradingActivity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{gameStoreSteamTradingActivity, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 34415, new Class[]{GameStoreSteamTradingActivity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreSteamTradingActivity.V2(z10);
    }

    private void Q2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34409, new Class[0], Void.TYPE).isSupported || this.f66601b.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f66601b).y(getString(R.string.accept_failed)).l(getString(R.string.region_error_tips)).u(getString(R.string.view_solution), new a()).o(getString(R.string.do_return), new k()).g(false).F();
    }

    static /* synthetic */ void R1(GameStoreSteamTradingActivity gameStoreSteamTradingActivity, String str) {
        if (PatchProxy.proxy(new Object[]{gameStoreSteamTradingActivity, str}, null, changeQuickRedirect, true, 34416, new Class[]{GameStoreSteamTradingActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreSteamTradingActivity.O2(str);
    }

    private void S2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34410, new Class[0], Void.TYPE).isSupported || this.f66601b.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f66601b).y(getString(R.string.prompt)).l(getString(R.string.purchase_relogin)).u(getString(R.string.confirm), new b()).g(false).F();
    }

    static /* synthetic */ void T1(GameStoreSteamTradingActivity gameStoreSteamTradingActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreSteamTradingActivity}, null, changeQuickRedirect, true, 34417, new Class[]{GameStoreSteamTradingActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreSteamTradingActivity.S2();
    }

    static /* synthetic */ void V1(GameStoreSteamTradingActivity gameStoreSteamTradingActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreSteamTradingActivity}, null, changeQuickRedirect, true, 34418, new Class[]{GameStoreSteamTradingActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreSteamTradingActivity.Q2();
    }

    private void V2(boolean z10) {
        WebviewFragment webviewFragment;
        String str;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 34398, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || (webviewFragment = (WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null || (str = this.O3) == null) {
            return;
        }
        if (z10) {
            webviewFragment.C7(str, this.P3);
        } else {
            webviewFragment.C6();
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:163:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x0206  */
    /* JADX WARN: Code duplicated, block: B:91:0x0223  */
    /* JADX WARN: Code duplicated, block: B:94:0x022b  */
    /* JADX WARN: Code duplicated, block: B:95:0x02c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:97:0x0369 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x036b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0409  */
    /* JADX WARN: Instruction removed from duplicated block: B:87:0x01ef, please report this as an issue */
    private void W2() {
        String string;
        Object obj;
        Object obj2;
        Object obj3;
        int i10;
        String str;
        View view;
        Dialog dialog;
        char c10 = 0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34405, new Class[0], Void.TYPE).isSupported || this.mStatusTextView == null) {
            return;
        }
        if (!W3.equals(this.G3)) {
            if (!X3.equals(this.G3)) {
                if (Y3.equals(this.G3)) {
                    string = getString(R.string.purchase_sending_gift);
                    c10 = 1;
                } else {
                    if (!Z3.equals(this.G3)) {
                        if (f85111a4.equals(this.G3)) {
                            string = getString(R.string.accept_gift_success);
                            c10 = 3;
                            i10 = R.color.interactive_color;
                            obj = f85132v4;
                            obj2 = obj;
                            obj3 = obj2;
                        } else {
                            if (f85112b4.equals(this.G3)) {
                                string = getString(R.string.accept_gift_failed);
                            } else {
                                if (f85113c4.equals(this.G3)) {
                                    string = getString(R.string.purchase_failed_by_has_game);
                                } else if (f85114d4.equals(this.G3)) {
                                    string = getString(R.string.purchase_relogin);
                                } else {
                                    if (f85115e4.equals(this.G3)) {
                                        string = getString(R.string.purchase_login);
                                    } else if (f85116f4.equals(this.G3)) {
                                        string = getString(R.string.purchase_store_relogin);
                                    } else if (f85117g4.equals(this.G3)) {
                                        string = getString(R.string.purchase_store_login);
                                    } else if (f85118h4.equals(this.G3)) {
                                        string = getString(R.string.invite_friend_timeout);
                                        obj2 = f85133w4;
                                        c10 = 0;
                                        obj3 = f85130t4;
                                        obj = f85132v4;
                                    } else if (f85119i4.equals(this.G3)) {
                                        string = getString(R.string.invite_gift_timeout);
                                        c10 = 1;
                                        obj3 = f85133w4;
                                        obj = f85132v4;
                                        obj2 = obj;
                                    } else if (!f85120j4.equals(this.G3)) {
                                        if (f85121k4.equals(this.G3)) {
                                            if (com.max.hbcommon.utils.c.u(this.J3)) {
                                                string = this.G2 ? getString(R.string.activating) : getString(R.string.paste_into_the_input_box_to_activate);
                                            } else {
                                                string = this.J3;
                                            }
                                        } else if (f85122l4.equals(this.G3)) {
                                            string = getString(R.string.success);
                                            obj2 = f85130t4;
                                            obj3 = obj2;
                                        } else if (f85123m4.equals(this.G3)) {
                                            string = !com.max.hbcommon.utils.c.u(this.J3) ? this.J3 : getString(R.string.fail);
                                            obj = f85133w4;
                                            c10 = 0;
                                            obj2 = f85130t4;
                                            obj3 = obj2;
                                        } else {
                                            string = "";
                                            obj = f85130t4;
                                            obj2 = obj;
                                            obj3 = obj2;
                                        }
                                        i10 = R.color.interactive_color;
                                    } else if (com.max.hbcommon.utils.c.u(this.J3)) {
                                        string = this.G2 ? getString(R.string.activating) : getString(R.string.paste_into_the_input_box_to_activate);
                                    } else {
                                        string = this.J3;
                                    }
                                    i10 = R.color.interactive_color;
                                    obj = f85132v4;
                                }
                                i10 = R.color.badge_bg_color;
                            }
                            c10 = 2;
                            obj3 = f85133w4;
                            obj = f85132v4;
                            obj2 = obj;
                            i10 = R.color.badge_bg_color;
                        }
                        if (com.max.hbcommon.utils.c.u(this.K3)) {
                            str = string;
                        } else {
                            str = string + "\n" + this.K3;
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
                        dialog = this.Q3;
                        if (dialog == null && dialog.isShowing()) {
                            if ((this.G2 && f85111a4.equals(this.G3)) || f85122l4.equals(this.G3)) {
                                this.G2 = false;
                                L2();
                                com.max.xiaoheihe.module.account.utils.l.Y();
                                D2();
                                Intent intent = new Intent(lb.a.A);
                                intent.putExtra(lb.a.f130996l0, lb.a.f131056v0);
                                this.f66601b.sendBroadcast(intent);
                                Activity activity = this.f66601b;
                                activity.startActivity(GameStorePurchaseShareActivity.f2(activity, this.f85145y1, "gift"));
                                finish();
                                return;
                            }
                            if (f85130t4.equals(obj)) {
                                this.P.setText(getString(R.string.wait));
                                this.P.setTextColor(getResources().getColor(R.color.text_secondary_2_color));
                                this.O.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                                this.R.setBackgroundResource(R.color.divider_secondary_2_color);
                                this.Q.setVisibility(8);
                            } else if (f85131u4.equals(obj)) {
                                this.P.setText(getString(R.string.doing));
                                this.P.setTextColor(getResources().getColor(R.color.text_primary_1_color));
                                this.O.setTextColor(getResources().getColor(R.color.text_primary_1_color));
                                TradeInfoUtilKt.F(this.R);
                                this.Q.setVisibility(8);
                            } else if (f85132v4.equals(obj)) {
                                this.P.setText(getString(R.string.complete));
                                this.P.setTextColor(getResources().getColor(R.color.text_primary_1_color));
                                this.O.setTextColor(getResources().getColor(R.color.text_primary_1_color));
                                this.R.setBackgroundResource(R.color.text_primary_1_color);
                                this.R.c();
                                this.Q.setVisibility(0);
                            } else {
                                this.P.setText(getString(R.string.overtime));
                                this.P.setTextColor(getResources().getColor(R.color.badge_bg_color));
                                this.O.setTextColor(getResources().getColor(R.color.badge_bg_color));
                                TradeInfoUtilKt.G(this.R);
                                this.Q.setVisibility(8);
                            }
                            Object obj4 = obj2;
                            if (f85130t4.equals(obj4)) {
                                this.U.setText(getString(R.string.wait));
                                this.U.setTextColor(getResources().getColor(R.color.text_secondary_2_color));
                                this.T.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                                this.R.setBackgroundResource(R.color.divider_secondary_2_color);
                                this.V.setVisibility(8);
                            } else if (f85131u4.equals(obj4)) {
                                this.U.setText(getString(R.string.doing));
                                this.U.setTextColor(getResources().getColor(R.color.text_primary_1_color));
                                this.T.setTextColor(getResources().getColor(R.color.text_primary_1_color));
                                TradeInfoUtilKt.F(this.W);
                                this.V.setVisibility(8);
                            } else if (f85132v4.equals(obj4)) {
                                this.U.setText(getString(R.string.complete));
                                this.U.setTextColor(getResources().getColor(R.color.text_primary_1_color));
                                this.T.setTextColor(getResources().getColor(R.color.text_primary_1_color));
                                this.W.setBackgroundResource(R.color.text_primary_1_color);
                                this.W.c();
                                this.V.setVisibility(0);
                            } else {
                                this.U.setText(getString(R.string.overtime));
                                this.U.setTextColor(getResources().getColor(R.color.badge_bg_color));
                                this.T.setTextColor(getResources().getColor(R.color.badge_bg_color));
                                TradeInfoUtilKt.G(this.W);
                                this.V.setVisibility(8);
                            }
                            Object obj5 = obj3;
                            if (f85130t4.equals(obj5)) {
                                this.Z.setText(getString(R.string.wait));
                                this.Z.setTextColor(getResources().getColor(R.color.text_secondary_2_color));
                                this.Y.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                                this.f85138b0.setBackgroundResource(R.color.divider_secondary_2_color);
                                this.f85137a0.setVisibility(8);
                            } else if (f85131u4.equals(obj5)) {
                                this.Z.setText(getString(R.string.doing));
                                this.Z.setTextColor(getResources().getColor(R.color.text_primary_1_color));
                                this.Y.setTextColor(getResources().getColor(R.color.text_primary_1_color));
                                TradeInfoUtilKt.F(this.f85138b0);
                                this.f85137a0.setVisibility(8);
                            } else if (f85132v4.equals(obj5)) {
                                this.Z.setText(getString(R.string.complete));
                                this.Z.setTextColor(getResources().getColor(R.color.text_primary_1_color));
                                this.Y.setTextColor(getResources().getColor(R.color.text_primary_1_color));
                                this.f85138b0.setBackgroundResource(R.color.text_primary_1_color);
                                this.f85138b0.c();
                                this.f85137a0.setVisibility(0);
                            } else {
                                this.Z.setText(getString(R.string.overtime));
                                this.Z.setTextColor(getResources().getColor(R.color.badge_bg_color));
                                this.Y.setTextColor(getResources().getColor(R.color.badge_bg_color));
                                TradeInfoUtilKt.G(this.f85138b0);
                                this.f85137a0.setVisibility(8);
                            }
                            if (!f85133w4.equals(obj) && !f85133w4.equals(obj4) && !f85133w4.equals(obj5)) {
                                if ("cdkey".equals(this.f85141p2)) {
                                    this.M.setText(getString(R.string.activate_in_progress));
                                } else {
                                    this.M.setText(getString(R.string.purchase_in_progress_please_wait));
                                }
                                this.L.setVisibility(0);
                                return;
                            }
                            if ("cdkey".equals(this.f85141p2)) {
                                string = !com.max.hbcommon.utils.c.u(this.J3) ? this.J3 : getString(R.string.activate_cdkey_timeout_tips);
                            }
                            this.M.setText(string);
                            this.f85139c0.setVisibility(0);
                            this.L.setVisibility(8);
                            return;
                        }
                    }
                    string = getString(R.string.purchase_waiting_accept_gift);
                    c10 = 2;
                }
                obj3 = f85131u4;
                i10 = R.color.interactive_color;
                obj = f85132v4;
                obj2 = obj;
                if (com.max.hbcommon.utils.c.u(this.K3)) {
                    str = string + "\n" + this.K3;
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
                dialog = this.Q3;
                if (dialog == null) {
                }
            }
            string = getString(R.string.purchase_add_friend);
            obj3 = f85130t4;
            obj2 = f85131u4;
            i10 = R.color.interactive_color;
            obj = f85132v4;
            if (com.max.hbcommon.utils.c.u(this.K3)) {
                str = string + "\n" + this.K3;
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
            dialog = this.Q3;
            if (dialog == null) {
            }
        }
        string = getString(R.string.purchase_add_friend);
        obj2 = f85130t4;
        obj3 = obj2;
        obj = f85131u4;
        i10 = R.color.interactive_color;
        if (com.max.hbcommon.utils.c.u(this.K3)) {
            str = string + "\n" + this.K3;
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
        dialog = this.Q3;
        if (dialog == null) {
        }
    }

    private void X2(AutoAcceptGameParamsObj autoAcceptGameParamsObj) {
        if (PatchProxy.proxy(new Object[]{autoAcceptGameParamsObj}, this, changeQuickRedirect, false, 34404, new Class[]{AutoAcceptGameParamsObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (autoAcceptGameParamsObj == null || com.max.hbcommon.utils.c.u(autoAcceptGameParamsObj.getSys_msg())) {
            this.K3 = null;
        } else {
            this.K3 = autoAcceptGameParamsObj.getSys_msg();
        }
    }

    static /* synthetic */ int Y1(GameStoreSteamTradingActivity gameStoreSteamTradingActivity) {
        int i10 = gameStoreSteamTradingActivity.f85142p3;
        gameStoreSteamTradingActivity.f85142p3 = i10 + 1;
        return i10;
    }

    static /* synthetic */ void Z1(GameStoreSteamTradingActivity gameStoreSteamTradingActivity, long j10) {
        if (PatchProxy.proxy(new Object[]{gameStoreSteamTradingActivity, new Long(j10)}, null, changeQuickRedirect, true, 34419, new Class[]{GameStoreSteamTradingActivity.class, Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreSteamTradingActivity.G2(j10);
    }

    static /* synthetic */ void b2(GameStoreSteamTradingActivity gameStoreSteamTradingActivity, long j10) {
        if (PatchProxy.proxy(new Object[]{gameStoreSteamTradingActivity, new Long(j10)}, null, changeQuickRedirect, true, 34420, new Class[]{GameStoreSteamTradingActivity.class, Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreSteamTradingActivity.K2(j10);
    }

    static /* synthetic */ void h2(GameStoreSteamTradingActivity gameStoreSteamTradingActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreSteamTradingActivity}, null, changeQuickRedirect, true, 34421, new Class[]{GameStoreSteamTradingActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreSteamTradingActivity.J2();
    }

    static /* synthetic */ void i2(GameStoreSteamTradingActivity gameStoreSteamTradingActivity, AutoAcceptGameParamsObj autoAcceptGameParamsObj) {
        if (PatchProxy.proxy(new Object[]{gameStoreSteamTradingActivity, autoAcceptGameParamsObj}, null, changeQuickRedirect, true, 34422, new Class[]{GameStoreSteamTradingActivity.class, AutoAcceptGameParamsObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreSteamTradingActivity.X2(autoAcceptGameParamsObj);
    }

    static /* synthetic */ void x2(GameStoreSteamTradingActivity gameStoreSteamTradingActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreSteamTradingActivity}, null, changeQuickRedirect, true, 34411, new Class[]{GameStoreSteamTradingActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreSteamTradingActivity.P2();
    }

    static /* synthetic */ void y2(GameStoreSteamTradingActivity gameStoreSteamTradingActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreSteamTradingActivity}, null, changeQuickRedirect, true, 34412, new Class[]{GameStoreSteamTradingActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreSteamTradingActivity.W2();
    }

    static /* synthetic */ void z2(GameStoreSteamTradingActivity gameStoreSteamTradingActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreSteamTradingActivity}, null, changeQuickRedirect, true, 34413, new Class[]{GameStoreSteamTradingActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreSteamTradingActivity.L2();
    }

    public void T2() {
        Dialog dialog;
        View view;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34407, new Class[0], Void.TYPE).isSupported || f85111a4.equals(this.G3) || f85122l4.equals(this.G3) || (dialog = this.Q3) == null || !dialog.isShowing() || (view = this.f85139c0) == null) {
            return;
        }
        view.setVisibility(0);
        Iterator<Map.Entry<String, String>> it = this.M3.entrySet().iterator();
        String strSubstring = Constants.ARRAY_TYPE;
        while (it.hasNext()) {
            strSubstring = strSubstring + it.next().getKey() + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP;
        }
        if (strSubstring.length() > 1) {
            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
        }
        MobclickAgent.reportError(HeyBoxApplication.C(), new IllegalArgumentException("Task of automatic purchase blocked for more than 40 seconds. user id:" + com.max.xiaoheihe.utils.i0.j() + ", current status:" + this.G3 + ", executed javascript:" + (strSubstring + "]")));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x01ae  */
    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        String str;
        String str2;
        String str3;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34394, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_game_store_steam_trading);
        ButterKnife.a(this);
        this.f85145y1 = getIntent().getStringExtra("order_id");
        this.f85141p2 = getIntent().getStringExtra("buy_type");
        this.f85144x2 = (AutoAcceptGameParamsObj) getIntent().getSerializableExtra(T3);
        this.f85146y2 = getIntent().getBooleanExtra("friend", false);
        this.G2 = getIntent().getBooleanExtra(V3, false);
        this.f85142p3 = 0;
        this.M3.clear();
        AutoAcceptGameParamsObj autoAcceptGameParamsObj = this.f85144x2;
        if (autoAcceptGameParamsObj != null && autoAcceptGameParamsObj.getAndroid_proxy() != null && this.f85144x2.getAndroid_proxy().getEncrypted_proxy_info() != null && this.O3 == null) {
            String strC = com.max.hbcommon.utils.e.c(this.f85144x2.getAndroid_proxy().getEncrypted_proxy_info().getP1(), com.max.xiaoheihe.utils.w.c(this.f85144x2.getAndroid_proxy().getEncrypted_proxy_info().getP3()));
            if (com.max.xiaoheihe.utils.d.a1(strC).equals(this.f85144x2.getAndroid_proxy().getEncrypted_proxy_info().getP2())) {
                String[] strArrSplit = strC.split(":");
                if (strArrSplit.length > 1) {
                    this.O3 = strArrSplit[0];
                    this.P3 = strArrSplit[1];
                }
            }
        }
        this.f66616q.setTitle(getString(R.string.loading));
        this.f66617r.setVisibility(0);
        if ("gift".equals(this.f85141p2)) {
            this.G3 = W3;
            this.mProgressBarView.setVisibility(0);
        } else {
            this.G3 = f85120j4;
            this.mProgressBarView.setVisibility(8);
        }
        X2(this.f85144x2);
        if (((WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            AutoAcceptGameParamsObj autoAcceptGameParamsObj2 = this.f85144x2;
            String url = "";
            if (autoAcceptGameParamsObj2 == null) {
                str = "";
                str2 = str;
            } else if (autoAcceptGameParamsObj2.getUse_cdkey() != null) {
                this.G3 = f85121k4;
                SteamAcceptGameParams use_cdkey = this.f85144x2.getUse_cdkey();
                this.L3 = use_cdkey;
                use_cdkey.setType(f85121k4);
                str2 = "";
                url = this.L3.getUrl();
                str = str2;
            } else if (this.G2) {
                if (this.f85146y2 || this.f85144x2.getAccept_friend() == null) {
                    this.G3 = Y3;
                    SteamAcceptGameParams accept_gift = this.f85144x2.getAccept_gift();
                    this.L3 = accept_gift;
                    accept_gift.setType(Z3);
                    if ("1".equals(this.f85144x2.getAccept_gift().getUse_proxy())) {
                        url = this.O3;
                        str3 = this.P3;
                    } else {
                        str3 = "";
                    }
                    if (this.f85142p3 <= 15) {
                        G2(0L);
                    }
                } else {
                    this.G3 = W3;
                    SteamAcceptGameParams accept_friend = this.f85144x2.getAccept_friend();
                    this.L3 = accept_friend;
                    accept_friend.setType(X3);
                    if ("1".equals(this.f85144x2.getAccept_friend().getUse_proxy())) {
                        url = this.O3;
                        str3 = this.P3;
                    } else {
                        str3 = "";
                    }
                }
                str2 = str3;
                str = url;
                url = this.L3.getUrl();
            } else {
                str = "";
                str2 = str;
            }
            WebviewFragment webviewFragmentA = new com.max.xiaoheihe.module.webview.u(url).p(WebviewFragment.W4).t(new ProxyAddressObj(str, str2)).v(true).a();
            webviewFragmentA.Y7(new c());
            getSupportFragmentManager().u().b(R.id.fragment_container, webviewFragmentA).m();
        }
        if (this.G2) {
            P2();
        } else if ("cdkey".equals(this.f85141p2)) {
            H2();
        } else if ("gift".equals(this.f85141p2)) {
            J2();
        }
        W2();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34395, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.N3.removeCallbacksAndMessages(null);
        super.onDestroy();
    }
}
