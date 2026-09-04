package com.max.xiaoheihe.module.mall;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.EncryptionParamsObj;
import com.max.hbcommon.bean.PostEncryptParamsObj;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.bean.mall.MallSteamReportObj;
import com.max.xiaoheihe.bean.mall.SteamWalletJsObj;
import com.max.xiaoheihe.bean.proxy.ProxyAddressObj;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.max.xiaoheihe.module.webview.u;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.analytics.MobclickAgent;
import com.umeng.message.common.inter.ITagManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class SteamStorePurchaseGameActivity extends BaseActivity {
    private static final String Z = "url_data";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final String f89917a0 = "order_id";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f89918b0 = "package_id";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final String f89919c0 = "https://store.steampowered.com/account/";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final String f89920p1 = "checkout";

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final String f89921p2 = "status_failed";

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final String f89922x1 = "status_purchasing";

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final String f89923y1 = "status_succeed";
    ProgressBar L;
    TextView M;
    TextView N;
    ImageView O;
    View P;
    TextView Q;
    private SteamWalletJsObj R;
    private String S;
    private String T;
    private String U;
    private String V;
    private Dialog W;
    private final d X = new d(this);
    private List<String> Y = new ArrayList();

    @BindView(R.id.tv_status)
    TextView mStatusTextView;

    public class a extends WebviewFragment.o0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void b(WebProtocolObj webProtocolObj) {
            if (!PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 41077, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported && WebProtocolObj.PROTOCOL_TYPE_STEAM_CALLBACK.equals(webProtocolObj.getProtocol_type())) {
                String strValueOf = webProtocolObj.valueOf("type");
                String strValueOf2 = webProtocolObj.valueOf("state");
                String strValueOf3 = webProtocolObj.valueOf("msg");
                if ("checkout".equals(strValueOf)) {
                    if (ITagManager.SUCCESS.equalsIgnoreCase(strValueOf2)) {
                        SteamStorePurchaseGameActivity.this.V = SteamStorePurchaseGameActivity.f89923y1;
                        SteamStorePurchaseGameActivity.this.setResult(-1, new Intent());
                        com.max.xiaoheihe.module.account.utils.l.Y();
                        SteamStorePurchaseGameActivity.this.Y.add("checkout ok");
                        SteamStorePurchaseGameActivity.W1(SteamStorePurchaseGameActivity.this);
                    } else {
                        SteamStorePurchaseGameActivity.this.Y.add("checkout not ok: " + strValueOf3);
                        SteamStorePurchaseGameActivity.this.V = SteamStorePurchaseGameActivity.f89921p2;
                    }
                    SteamStorePurchaseGameActivity.X1(SteamStorePurchaseGameActivity.this, strValueOf3);
                }
            }
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void g(WebView webView, String str, int i10, int i11) {
            Object[] objArr = {webView, str, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 41076, new Class[]{WebView.class, String.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            if (i11 - 1 == 0 && SteamStorePurchaseGameActivity.f89919c0.equals(str)) {
                SteamStorePurchaseGameActivity.this.Y.add("jsPurchase()");
                SteamStorePurchaseGameActivity.R1(SteamStorePurchaseGameActivity.this);
            } else if (str.contains("/login")) {
                SteamStorePurchaseGameActivity.this.Y.add("url.contains(login)");
                SteamStorePurchaseGameActivity.T1(SteamStorePurchaseGameActivity.this);
            }
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void o(WebView webView, String str) {
            if (PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 41075, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(str) || ((BaseActivity) SteamStorePurchaseGameActivity.this).f66616q == null || ((BaseActivity) SteamStorePurchaseGameActivity.this).f66616q.getVisibility() != 0) {
                return;
            }
            if ("about:blank".equalsIgnoreCase(str)) {
                str = SteamStorePurchaseGameActivity.this.getString(R.string.loading);
            }
            ((BaseActivity) SteamStorePurchaseGameActivity.this).f66616q.setTitle(str);
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41078, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            SteamStorePurchaseGameActivity.T1(SteamStorePurchaseGameActivity.this);
            SteamStorePurchaseGameActivity.this.finish();
        }
    }

    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41079, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            SteamStorePurchaseGameActivity.T1(SteamStorePurchaseGameActivity.this);
            SteamStorePurchaseGameActivity.this.finish();
        }
    }

    public static class d extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<SteamStorePurchaseGameActivity> f89927a;

        public d(SteamStorePurchaseGameActivity steamStorePurchaseGameActivity) {
            this.f89927a = new WeakReference<>(steamStorePurchaseGameActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 41080, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            super.handleMessage(message);
            SteamStorePurchaseGameActivity steamStorePurchaseGameActivity = this.f89927a.get();
            if (steamStorePurchaseGameActivity != null) {
                steamStorePurchaseGameActivity.h2();
            }
        }
    }

    static /* synthetic */ void R1(SteamStorePurchaseGameActivity steamStorePurchaseGameActivity) {
        if (PatchProxy.proxy(new Object[]{steamStorePurchaseGameActivity}, null, changeQuickRedirect, true, 41071, new Class[]{SteamStorePurchaseGameActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamStorePurchaseGameActivity.c2();
    }

    static /* synthetic */ void T1(SteamStorePurchaseGameActivity steamStorePurchaseGameActivity) {
        if (PatchProxy.proxy(new Object[]{steamStorePurchaseGameActivity}, null, changeQuickRedirect, true, 41072, new Class[]{SteamStorePurchaseGameActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamStorePurchaseGameActivity.b2();
    }

    static /* synthetic */ void W1(SteamStorePurchaseGameActivity steamStorePurchaseGameActivity) {
        if (PatchProxy.proxy(new Object[]{steamStorePurchaseGameActivity}, null, changeQuickRedirect, true, 41073, new Class[]{SteamStorePurchaseGameActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamStorePurchaseGameActivity.e2();
    }

    static /* synthetic */ void X1(SteamStorePurchaseGameActivity steamStorePurchaseGameActivity, String str) {
        if (PatchProxy.proxy(new Object[]{steamStorePurchaseGameActivity, str}, null, changeQuickRedirect, true, 41074, new Class[]{SteamStorePurchaseGameActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        steamStorePurchaseGameActivity.i2(str);
    }

    private void Y1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41069, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(Constants.ARRAY_TYPE);
        for (int i10 = 0; i10 < this.Y.size(); i10++) {
            if (i10 != 0) {
                sb2.append(", ");
            }
            sb2.append(this.Y.get(i10));
        }
        sb2.append("]");
        MobclickAgent.reportError(HeyBoxApplication.C(), new IllegalArgumentException("Checkout: userId: " + i0.j() + ", status: " + this.V + ", options: " + ((Object) sb2)));
    }

    private void Z1(String str) {
        WebviewFragment webviewFragment;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41067, new Class[]{String.class}, Void.TYPE).isSupported || (webviewFragment = (WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            return;
        }
        webviewFragment.H6(str, null);
    }

    public static Intent a2(Context context, SteamWalletJsObj steamWalletJsObj, String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, steamWalletJsObj, str, str2}, null, changeQuickRedirect, true, 41060, new Class[]{Context.class, SteamWalletJsObj.class, String.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) SteamStorePurchaseGameActivity.class);
        intent.putExtra(Z, steamWalletJsObj);
        intent.putExtra("order_id", str);
        intent.putExtra("package_id", str2);
        return intent;
    }

    private void b2() {
        Dialog dialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41064, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.X.removeCallbacksAndMessages(null);
        if (this.f66601b.isFinishing() || (dialog = this.W) == null || !dialog.isShowing()) {
            return;
        }
        this.W.dismiss();
    }

    private void c2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41066, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        EncryptionParamsObj js = this.R.getPay().getJs();
        String strC = com.max.hbcommon.utils.e.c(js.getP1(), w.c(js.getP3()));
        String strA1 = com.max.xiaoheihe.utils.d.a1(strC);
        if (strC == null || !strA1.equals(js.getP2()) || com.max.hbcommon.utils.c.u(this.U)) {
            return;
        }
        Z1(strC.replace("{{HB_sessionid}}", this.U).replace("{{HB_subid}}", this.T));
    }

    private void e2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41068, new Class[0], Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.S)) {
            return;
        }
        MallSteamReportObj mallSteamReportObj = new MallSteamReportObj();
        mallSteamReportObj.setData_type(2);
        PostEncryptParamsObj postEncryptParamsObjV0 = com.max.xiaoheihe.utils.d.v0(com.max.hbutils.utils.k.p(mallSteamReportObj), true);
        com.max.xiaoheihe.network.i.a().g6(this.S, postEncryptParamsObjV0.getData(), postEncryptParamsObjV0.getKey(), postEncryptParamsObjV0.getSid(), postEncryptParamsObjV0.getTime()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new com.max.hbcommon.network.p());
    }

    private void f2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41063, new Class[0], Void.TYPE).isSupported || this.f66601b.isFinishing()) {
            return;
        }
        if (this.W == null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f66601b);
            View viewInflate = this.f66602c.inflate(R.layout.dialog_activation, (ViewGroup) null, false);
            this.L = (ProgressBar) viewInflate.findViewById(R.id.pb_title);
            this.M = (TextView) viewInflate.findViewById(R.id.tv_title);
            this.N = (TextView) viewInflate.findViewById(R.id.tv_progress_0);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_progress_desc_0);
            this.O = (ImageView) viewInflate.findViewById(R.id.pb_0);
            this.P = viewInflate.findViewById(R.id.vg_button_panel);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_negative_button);
            this.Q = (TextView) viewInflate.findViewById(R.id.tv_positive_button);
            this.N.setText((CharSequence) null);
            this.N.setTextColor(getResources().getColor(R.color.badge_bg_color));
            textView.setText((CharSequence) null);
            textView2.setVisibility(8);
            AlertDialog alertDialogCreate = builder.setView(viewInflate).setCancelable(false).create();
            this.W = alertDialogCreate;
            Window window = alertDialogCreate.getWindow();
            if (window != null) {
                window.setBackgroundDrawableResource(android.R.color.transparent);
            }
        }
        if (this.W.isShowing()) {
            return;
        }
        this.W.show();
        i2(null);
        this.X.removeCallbacksAndMessages(null);
        this.X.sendEmptyMessageDelayed(0, 10000L);
    }

    private void i2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41062, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (f89922x1.equals(this.V)) {
            this.mStatusTextView.setText(getString(R.string.purchasing_please_wait));
        } else if (f89923y1.equals(this.V)) {
            this.mStatusTextView.setText(getString(R.string.purchase_succeed));
        } else if (f89921p2.equals(this.V)) {
            this.mStatusTextView.setText(getString(R.string.purchase_failed));
        }
        Dialog dialog = this.W;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        if (f89922x1.equals(this.V)) {
            this.L.setVisibility(0);
            this.M.setText(getString(R.string.purchasing_please_wait));
            this.N.setText((CharSequence) null);
            AnimationDrawable animationDrawable = (AnimationDrawable) getResources().getDrawable(R.drawable.pb_loading);
            this.O.setImageDrawable(animationDrawable);
            animationDrawable.start();
            this.P.setVisibility(8);
            return;
        }
        if (f89923y1.equals(this.V)) {
            this.L.setVisibility(8);
            this.M.setText(getString(R.string.purchase_succeed));
            this.N.setText((CharSequence) null);
            this.O.setImageResource(R.color.interactive_color);
            this.P.setVisibility(0);
            this.Q.setVisibility(0);
            this.Q.setOnClickListener(new b());
            return;
        }
        if (f89921p2.equals(this.V)) {
            this.L.setVisibility(8);
            this.M.setText(getString(R.string.purchase_failed));
            this.N.setText(str);
            this.O.setImageDrawable((AnimationDrawable) getResources().getDrawable(R.drawable.pb_loading_timeout));
            this.P.setVisibility(0);
            this.Q.setVisibility(0);
            this.Q.setOnClickListener(new c());
        }
    }

    public void h2() {
        Dialog dialog;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41065, new Class[0], Void.TYPE).isSupported && (dialog = this.W) != null && dialog.isShowing() && f89922x1.equals(this.V)) {
            this.Y.add("setCancelable(true)");
            this.W.setCancelable(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00fa  */
    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41061, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_steam_store_purchase_game);
        ButterKnife.a(this);
        this.R = (SteamWalletJsObj) getIntent().getSerializableExtra(Z);
        this.S = getIntent().getStringExtra("order_id");
        this.T = getIntent().getStringExtra("package_id");
        this.f66616q.setTitle(getString(R.string.loading));
        this.f66617r.setVisibility(0);
        this.V = f89922x1;
        CookieSyncManager.createInstance(this.f66601b);
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        String cookie = cookieManager.getCookie("https://store.steampowered.com");
        if (!com.max.hbcommon.utils.c.u(cookie)) {
            for (String str2 : cookie.split(";")) {
                String strTrim = str2.trim();
                if (strTrim.startsWith("sessionid")) {
                    this.U = strTrim.replace("sessionid=", "");
                }
            }
            cookieManager.setCookie("https://store.steampowered.com", "shoppingCartGID=-1");
            cookieManager.setCookie("https://store.steampowered.com", "workshopShoppingCartGID=-1");
            cookieManager.setCookie("https://store.steampowered.com", "lastagecheckage=1-0-1989");
            cookieManager.setCookie("https://store.steampowered.com", "wants_mature_content=1");
            cookieManager.setCookie("https://store.steampowered.com", "birthtime=596908801");
            cookieManager.setCookie("https://store.steampowered.com", "Domain=store.steampowered.com");
            cookieManager.setCookie("https://store.steampowered.com", "Path=/");
            CookieSyncManager.getInstance().sync();
        }
        String str3 = null;
        if (this.R.getSteam_proxy() == null || this.R.getSteam_proxy().getProxy() == null) {
            str = null;
        } else {
            String strV = com.max.xiaoheihe.utils.d.v(this.R.getSteam_proxy().getProxy());
            if (com.max.hbcommon.utils.c.u(strV)) {
                str = null;
            } else {
                String[] strArrSplit = strV.split(":");
                if (strArrSplit.length > 1) {
                    str3 = strArrSplit[0];
                    str = strArrSplit[1];
                } else {
                    str = null;
                }
            }
        }
        if (((WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            WebviewFragment webviewFragmentA = new u(f89919c0).t(new ProxyAddressObj(str3, str)).a();
            webviewFragmentA.Y7(new a());
            getSupportFragmentManager().u().b(R.id.fragment_container, webviewFragmentA).m();
        }
        f2();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41070, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!f89923y1.equals(this.V)) {
            Y1();
        }
        this.X.removeCallbacksAndMessages(null);
        b2();
        super.onDestroy();
    }
}
