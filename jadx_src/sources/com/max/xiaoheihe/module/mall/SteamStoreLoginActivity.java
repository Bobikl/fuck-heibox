package com.max.xiaoheihe.module.mall;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.webkit.WebView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.EncryptionParamsObj;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.bean.mall.SteamBalanceObj;
import com.max.xiaoheihe.bean.mall.SteamWalletJsObj;
import com.max.xiaoheihe.bean.proxy.ProxyAddressObj;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.max.xiaoheihe.module.webview.u;
import com.max.xiaoheihe.utils.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.message.common.inter.ITagManager;

/* JADX INFO: loaded from: classes11.dex */
public class SteamStoreLoginActivity extends BaseActivity {
    private static final String R = "url_data";
    private static final String S = "login";
    private static final String T = "steam_id";
    public static final String U = "https://store.steampowered.com";
    public static final String V = "logged_steam_id";
    public static final String W = "steam_balance";
    public static final String X = "status";
    public static final String Y = "cookie";
    public static final String Z = "balance";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f89906a0 = "relogin";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f89907b0 = "login";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f89908c0 = "alert";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final String f89909p1 = "pending";

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final String f89910p2 = "need_login";

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final String f89911x1 = "logged";

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final String f89912y1 = "relogin";
    private SteamWalletJsObj L;
    private boolean M;
    private String N;
    private String O = "pending";
    private String P;
    private String Q;

    @BindView(R.id.tv_status)
    TextView mStatusTextView;

    public class a extends WebviewFragment.o0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void b(WebProtocolObj webProtocolObj) {
            if (!PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 41056, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported && WebProtocolObj.PROTOCOL_TYPE_STEAM_CALLBACK.equals(webProtocolObj.getProtocol_type())) {
                String strValueOf = webProtocolObj.valueOf("type");
                String strValueOf2 = webProtocolObj.valueOf("state");
                String strValueOf3 = webProtocolObj.valueOf("msg");
                SteamBalanceObj steamBalanceObj = (SteamBalanceObj) webProtocolObj.objectOf("info", SteamBalanceObj.class);
                if (!"balance".equals(strValueOf)) {
                    if ("relogin".equals(strValueOf)) {
                        SteamStoreLoginActivity.this.O = "relogin";
                        Intent intent = new Intent();
                        intent.putExtra("status", SteamStoreLoginActivity.this.O);
                        SteamStoreLoginActivity.this.setResult(-1, intent);
                        com.max.xiaoheihe.utils.d.k(((BaseActivity) SteamStoreLoginActivity.this).f66601b, SteamStoreLoginActivity.this.L.getBalance().getRelogin_url());
                        SteamStoreLoginActivity steamStoreLoginActivity = SteamStoreLoginActivity.this;
                        SteamStoreLoginActivity.Q1(steamStoreLoginActivity, steamStoreLoginActivity.L.getBalance().getRelogin_url());
                        SteamStoreLoginActivity.R1(SteamStoreLoginActivity.this);
                        return;
                    }
                    return;
                }
                if (!ITagManager.SUCCESS.equalsIgnoreCase(strValueOf2) || steamBalanceObj == null) {
                    if (z5.f.f141859j.equalsIgnoreCase(strValueOf2)) {
                        SteamStoreLoginActivity.T1(SteamStoreLoginActivity.this, strValueOf3);
                        return;
                    }
                    return;
                }
                SteamStoreLoginActivity.this.P = steamBalanceObj.getCurrent_balance();
                SteamStoreLoginActivity.this.Q = steamBalanceObj.getSteam_id();
                if (SteamStoreLoginActivity.this.Q == null || !SteamStoreLoginActivity.this.Q.equals(SteamStoreLoginActivity.this.N)) {
                    SteamStoreLoginActivity.this.O = "relogin";
                    Intent intent2 = new Intent();
                    intent2.putExtra("status", SteamStoreLoginActivity.this.O);
                    SteamStoreLoginActivity.this.setResult(-1, intent2);
                    com.max.xiaoheihe.utils.d.k(((BaseActivity) SteamStoreLoginActivity.this).f66601b, SteamStoreLoginActivity.this.L.getBalance().getRelogin_url());
                    SteamStoreLoginActivity steamStoreLoginActivity2 = SteamStoreLoginActivity.this;
                    SteamStoreLoginActivity.Q1(steamStoreLoginActivity2, steamStoreLoginActivity2.L.getBalance().getRelogin_url());
                    SteamStoreLoginActivity.R1(SteamStoreLoginActivity.this);
                } else {
                    SteamStoreLoginActivity.this.O = "logged";
                    Intent intent3 = new Intent();
                    intent3.putExtra(SteamStoreLoginActivity.V, SteamStoreLoginActivity.this.Q);
                    intent3.putExtra("steam_balance", SteamStoreLoginActivity.this.P);
                    intent3.putExtra("status", SteamStoreLoginActivity.this.O);
                    SteamStoreLoginActivity.this.setResult(-1, intent3);
                    SteamStoreLoginActivity.this.finish();
                }
                SteamStoreLoginActivity.b2(SteamStoreLoginActivity.this);
            }
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void g(WebView webView, String str, int i10, int i11) {
            Object[] objArr = {webView, str, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (!PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 41055, new Class[]{WebView.class, String.class, cls, cls}, Void.TYPE).isSupported && i11 - 1 == 0) {
                if (str.matches(SteamStoreLoginActivity.this.L.getBalance().getRegular())) {
                    EncryptionParamsObj js = SteamStoreLoginActivity.this.L.getBalance().getJs();
                    String strC = com.max.hbcommon.utils.e.c(js.getP1(), w.c(js.getP3()));
                    if (com.max.xiaoheihe.utils.d.a1(strC).equals(js.getP2())) {
                        SteamStoreLoginActivity.Y1(SteamStoreLoginActivity.this, strC);
                    }
                } else if (str.contains("/login")) {
                    SteamStoreLoginActivity.this.O = "need_login";
                    if (SteamStoreLoginActivity.this.L.getRemember_js() != null) {
                        EncryptionParamsObj js2 = SteamStoreLoginActivity.this.L.getRemember_js().getJs();
                        String strC2 = com.max.hbcommon.utils.e.c(js2.getP1(), w.c(js2.getP3()));
                        if (com.max.xiaoheihe.utils.d.a1(strC2).equals(js2.getP2())) {
                            SteamStoreLoginActivity.Y1(SteamStoreLoginActivity.this, strC2);
                        }
                    }
                }
                SteamStoreLoginActivity.b2(SteamStoreLoginActivity.this);
            }
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void o(WebView webView, String str) {
            if (PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 41054, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(str) || ((BaseActivity) SteamStoreLoginActivity.this).f66616q == null || ((BaseActivity) SteamStoreLoginActivity.this).f66616q.getVisibility() != 0) {
                return;
            }
            if ("about:blank".equalsIgnoreCase(str)) {
                str = SteamStoreLoginActivity.this.getString(R.string.loading);
            }
            ((BaseActivity) SteamStoreLoginActivity.this).f66616q.setTitle(str);
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 41057, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 41058, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    static /* synthetic */ void Q1(SteamStoreLoginActivity steamStoreLoginActivity, String str) {
        if (PatchProxy.proxy(new Object[]{steamStoreLoginActivity, str}, null, changeQuickRedirect, true, 41051, new Class[]{SteamStoreLoginActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        steamStoreLoginActivity.l2(str);
    }

    static /* synthetic */ void R1(SteamStoreLoginActivity steamStoreLoginActivity) {
        if (PatchProxy.proxy(new Object[]{steamStoreLoginActivity}, null, changeQuickRedirect, true, 41052, new Class[]{SteamStoreLoginActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamStoreLoginActivity.o2();
    }

    static /* synthetic */ void T1(SteamStoreLoginActivity steamStoreLoginActivity, String str) {
        if (PatchProxy.proxy(new Object[]{steamStoreLoginActivity, str}, null, changeQuickRedirect, true, 41053, new Class[]{SteamStoreLoginActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        steamStoreLoginActivity.n2(str);
    }

    static /* synthetic */ void Y1(SteamStoreLoginActivity steamStoreLoginActivity, String str) {
        if (PatchProxy.proxy(new Object[]{steamStoreLoginActivity, str}, null, changeQuickRedirect, true, 41049, new Class[]{SteamStoreLoginActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        steamStoreLoginActivity.j2(str);
    }

    static /* synthetic */ void b2(SteamStoreLoginActivity steamStoreLoginActivity) {
        if (PatchProxy.proxy(new Object[]{steamStoreLoginActivity}, null, changeQuickRedirect, true, 41050, new Class[]{SteamStoreLoginActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamStoreLoginActivity.m2();
    }

    private void j2(String str) {
        WebviewFragment webviewFragment;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41047, new Class[]{String.class}, Void.TYPE).isSupported || (webviewFragment = (WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            return;
        }
        webviewFragment.H6(str, null);
    }

    public static Intent k2(Context context, SteamWalletJsObj steamWalletJsObj, boolean z10, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, steamWalletJsObj, new Byte(z10 ? (byte) 1 : (byte) 0), str}, null, changeQuickRedirect, true, 41042, new Class[]{Context.class, SteamWalletJsObj.class, Boolean.TYPE, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) SteamStoreLoginActivity.class);
        intent.putExtra(R, steamWalletJsObj);
        intent.putExtra("login", z10);
        intent.putExtra("steam_id", str);
        return intent;
    }

    private void l2(String str) {
        WebviewFragment webviewFragment;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41048, new Class[]{String.class}, Void.TYPE).isSupported || (webviewFragment = (WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            return;
        }
        webviewFragment.t7(str);
    }

    private void m2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41044, new Class[0], Void.TYPE).isSupported || !isActive() || this.mStatusTextView == null) {
            return;
        }
        if ("pending".equals(this.O)) {
            this.mStatusTextView.setText(getString(R.string.purchase_login));
            return;
        }
        if ("logged".equals(this.O)) {
            this.mStatusTextView.setText(getString(R.string.login_success));
        } else if ("relogin".equals(this.O)) {
            this.mStatusTextView.setText(getString(R.string.purchase_store_relogin));
        } else if ("need_login".equals(this.O)) {
            this.mStatusTextView.setText(getString(R.string.purchase_login));
        }
    }

    private void n2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41046, new Class[]{String.class}, Void.TYPE).isSupported || this.f66601b.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f66601b).x(R.string.prompt).l(str).t(R.string.confirm, new c()).F();
    }

    private void o2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41045, new Class[0], Void.TYPE).isSupported || this.f66601b.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f66601b).y(getString(R.string.prompt)).l(getString(R.string.purchase_relogin)).t(R.string.confirm, new b()).F();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x008f  */
    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41043, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_steam_store_login);
        ButterKnife.a(this);
        this.L = (SteamWalletJsObj) getIntent().getSerializableExtra(R);
        this.M = getIntent().getBooleanExtra("login", false);
        this.N = getIntent().getStringExtra("steam_id");
        this.f66616q.setTitle(getString(R.string.loading));
        this.f66617r.setVisibility(0);
        String str2 = null;
        if (this.L.getSteam_proxy() == null || this.L.getSteam_proxy().getProxy() == null) {
            str = null;
        } else {
            String strV = com.max.xiaoheihe.utils.d.v(this.L.getSteam_proxy().getProxy());
            if (com.max.hbcommon.utils.c.u(strV)) {
                str = null;
            } else {
                String[] strArrSplit = strV.split(":");
                if (strArrSplit.length > 1) {
                    str2 = strArrSplit[0];
                    str = strArrSplit[1];
                } else {
                    str = null;
                }
            }
        }
        if (((WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            WebviewFragment webviewFragmentA = new u(this.M ? this.L.getBalance().getRelogin_url() : this.L.getBalance().getUrl()).t(new ProxyAddressObj(str2, str)).a();
            webviewFragmentA.Y7(new a());
            getSupportFragmentManager().u().b(R.id.fragment_container, webviewFragmentA).m();
        }
    }
}
