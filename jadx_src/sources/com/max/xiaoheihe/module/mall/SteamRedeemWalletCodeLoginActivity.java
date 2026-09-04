package com.max.xiaoheihe.module.mall;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.EncryptionParamsObj;
import com.max.hbcommon.bean.PostEncryptParamsObj;
import com.max.hbcommon.network.ApiException;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.CoffeeDialogDataObj;
import com.max.xiaoheihe.bean.game.CoffeeDialogProgressObj;
import com.max.xiaoheihe.bean.mall.MallSteamInfoUploadObj;
import com.max.xiaoheihe.bean.mall.SteamWalletJsObj;
import com.max.xiaoheihe.bean.proxy.ProxyAddressObj;
import com.max.xiaoheihe.bean.webintercept.IpDirectObj;
import com.max.xiaoheihe.bean.webintercept.TagJsObj;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.max.xiaoheihe.module.webview.u;
import com.max.xiaoheihe.utils.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class SteamRedeemWalletCodeLoginActivity extends BaseActivity {
    private static final String Q = "url_data";
    private static final String R = "order_id";
    private static final String S = "order_type";
    public static final String T = "https://store.steampowered.com";
    public static final String U = "status";
    public static final String V = "header";
    public static final String W = "pending";
    public static final String X = "logged";
    public static final String Y = "need_login";
    public static ChangeQuickRedirect changeQuickRedirect;
    private SteamWalletJsObj L;
    private String M;
    private String N;
    private String O = "pending";
    private HashMap<String, String> P = new HashMap<>();

    @BindView(R.id.tv_status)
    TextView mStatusTextView;

    public class a extends WebviewFragment.o0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void c(WebView webView, String str) {
            if (PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 40993, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            if (com.max.hbcommon.utils.c.u(str) || !str.contains("parental_notice")) {
                SteamRedeemWalletCodeLoginActivity.Q1(SteamRedeemWalletCodeLoginActivity.this);
            } else {
                SteamRedeemWalletCodeLoginActivity.c2(SteamRedeemWalletCodeLoginActivity.this);
                SteamRedeemWalletCodeLoginActivity.O1(SteamRedeemWalletCodeLoginActivity.this);
            }
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void d(WebView webView, WebResourceRequest webResourceRequest) {
            if (!PatchProxy.proxy(new Object[]{webView, webResourceRequest}, this, changeQuickRedirect, false, 40992, new Class[]{WebView.class, WebResourceRequest.class}, Void.TYPE).isSupported && webResourceRequest.getUrl().toString().matches(SteamRedeemWalletCodeLoginActivity.this.L.getLoadcookie().getRegular())) {
                for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                    SteamRedeemWalletCodeLoginActivity.this.P.put(entry.getKey(), entry.getValue());
                }
            }
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void g(WebView webView, String str, int i10, int i11) {
            Object[] objArr = {webView, str, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (!PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 40991, new Class[]{WebView.class, String.class, cls, cls}, Void.TYPE).isSupported && i11 - 1 == 0) {
                if (str.matches(SteamRedeemWalletCodeLoginActivity.this.L.getLoadcookie().getRegular())) {
                    CookieManager cookieManager = CookieManager.getInstance();
                    cookieManager.setAcceptCookie(true);
                    SteamRedeemWalletCodeLoginActivity.this.P.put("Cookie", cookieManager.getCookie(SteamRedeemWalletCodeLoginActivity.this.L.getLoadcookie().getUrl()));
                    SteamRedeemWalletCodeLoginActivity.Y1(SteamRedeemWalletCodeLoginActivity.this, WebviewFragment.Y4);
                } else if (str.contains("/login")) {
                    SteamRedeemWalletCodeLoginActivity.this.O = "need_login";
                    if (SteamRedeemWalletCodeLoginActivity.this.L.getRemember_js() != null) {
                        EncryptionParamsObj js = SteamRedeemWalletCodeLoginActivity.this.L.getRemember_js().getJs();
                        String strC = com.max.hbcommon.utils.e.c(js.getP1(), w.c(js.getP3()));
                        if (com.max.xiaoheihe.utils.d.a1(strC).equals(js.getP2())) {
                            SteamRedeemWalletCodeLoginActivity.Y1(SteamRedeemWalletCodeLoginActivity.this, strC);
                        }
                    }
                }
                SteamRedeemWalletCodeLoginActivity.b2(SteamRedeemWalletCodeLoginActivity.this);
            }
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void i(WebView webView, String str, int i10, int i11) {
            Object[] objArr = {webView, str, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (!PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 40990, new Class[]{WebView.class, String.class, cls, cls}, Void.TYPE).isSupported && str.matches(SteamRedeemWalletCodeLoginActivity.this.L.getLoadcookie().getRegular())) {
                SteamRedeemWalletCodeLoginActivity.W1(SteamRedeemWalletCodeLoginActivity.this);
            }
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void o(WebView webView, String str) {
            if (PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 40989, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(str) || ((BaseActivity) SteamRedeemWalletCodeLoginActivity.this).f66616q == null || ((BaseActivity) SteamRedeemWalletCodeLoginActivity.this).f66616q.getVisibility() != 0) {
                return;
            }
            if ("about:blank".equalsIgnoreCase(str)) {
                str = SteamRedeemWalletCodeLoginActivity.this.getString(R.string.loading);
            }
            ((BaseActivity) SteamRedeemWalletCodeLoginActivity.this).f66616q.setTitle(str);
        }
    }

    public class b extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 40994, new Class[]{Throwable.class}, Void.TYPE).isSupported && SteamRedeemWalletCodeLoginActivity.this.isActive()) {
                SteamRedeemWalletCodeLoginActivity.c2(SteamRedeemWalletCodeLoginActivity.this);
                SteamRedeemWalletCodeLoginActivity.R1(SteamRedeemWalletCodeLoginActivity.this, (!(th2 instanceof ApiException) || TextUtils.isEmpty(th2.getMessage())) ? "" : th2.getMessage());
            }
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40995, new Class[]{Result.class}, Void.TYPE).isSupported && SteamRedeemWalletCodeLoginActivity.this.isActive()) {
                super.onNext(result);
                SteamRedeemWalletCodeLoginActivity.this.O = "logged";
                SteamRedeemWalletCodeLoginActivity.b2(SteamRedeemWalletCodeLoginActivity.this);
                SteamRedeemWalletCodeLoginActivity.this.setResult(-1);
                SteamRedeemWalletCodeLoginActivity.this.finish();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40996, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40997, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            SteamRedeemWalletCodeLoginActivity.this.finish();
        }
    }

    public class d extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 40998, new Class[]{Throwable.class}, Void.TYPE).isSupported && SteamRedeemWalletCodeLoginActivity.this.isActive()) {
                SteamRedeemWalletCodeLoginActivity.c2(SteamRedeemWalletCodeLoginActivity.this);
                SteamRedeemWalletCodeLoginActivity.R1(SteamRedeemWalletCodeLoginActivity.this, (!(th2 instanceof ApiException) || TextUtils.isEmpty(th2.getMessage())) ? "" : th2.getMessage());
            }
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40999, new Class[]{Result.class}, Void.TYPE).isSupported && SteamRedeemWalletCodeLoginActivity.this.isActive()) {
                super.onNext(result);
                SteamRedeemWalletCodeLoginActivity.this.O = "logged";
                SteamRedeemWalletCodeLoginActivity.b2(SteamRedeemWalletCodeLoginActivity.this);
                Intent intent = new Intent();
                intent.putExtra("header", SteamRedeemWalletCodeLoginActivity.this.P);
                intent.putExtra("status", SteamRedeemWalletCodeLoginActivity.this.O);
                SteamRedeemWalletCodeLoginActivity.this.setResult(-1, intent);
                SteamRedeemWalletCodeLoginActivity.this.finish();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41000, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 41001, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    static /* synthetic */ void O1(SteamRedeemWalletCodeLoginActivity steamRedeemWalletCodeLoginActivity) {
        if (PatchProxy.proxy(new Object[]{steamRedeemWalletCodeLoginActivity}, null, changeQuickRedirect, true, 40986, new Class[]{SteamRedeemWalletCodeLoginActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamRedeemWalletCodeLoginActivity.p2();
    }

    static /* synthetic */ void Q1(SteamRedeemWalletCodeLoginActivity steamRedeemWalletCodeLoginActivity) {
        if (PatchProxy.proxy(new Object[]{steamRedeemWalletCodeLoginActivity}, null, changeQuickRedirect, true, 40987, new Class[]{SteamRedeemWalletCodeLoginActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamRedeemWalletCodeLoginActivity.m2();
    }

    static /* synthetic */ void R1(SteamRedeemWalletCodeLoginActivity steamRedeemWalletCodeLoginActivity, String str) {
        if (PatchProxy.proxy(new Object[]{steamRedeemWalletCodeLoginActivity, str}, null, changeQuickRedirect, true, 40988, new Class[]{SteamRedeemWalletCodeLoginActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        steamRedeemWalletCodeLoginActivity.q2(str);
    }

    static /* synthetic */ void W1(SteamRedeemWalletCodeLoginActivity steamRedeemWalletCodeLoginActivity) {
        if (PatchProxy.proxy(new Object[]{steamRedeemWalletCodeLoginActivity}, null, changeQuickRedirect, true, 40982, new Class[]{SteamRedeemWalletCodeLoginActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamRedeemWalletCodeLoginActivity.showLoadingDialog();
    }

    static /* synthetic */ void Y1(SteamRedeemWalletCodeLoginActivity steamRedeemWalletCodeLoginActivity, String str) {
        if (PatchProxy.proxy(new Object[]{steamRedeemWalletCodeLoginActivity, str}, null, changeQuickRedirect, true, 40983, new Class[]{SteamRedeemWalletCodeLoginActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        steamRedeemWalletCodeLoginActivity.e2(str);
    }

    static /* synthetic */ void b2(SteamRedeemWalletCodeLoginActivity steamRedeemWalletCodeLoginActivity) {
        if (PatchProxy.proxy(new Object[]{steamRedeemWalletCodeLoginActivity}, null, changeQuickRedirect, true, 40984, new Class[]{SteamRedeemWalletCodeLoginActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamRedeemWalletCodeLoginActivity.o2();
    }

    static /* synthetic */ void c2(SteamRedeemWalletCodeLoginActivity steamRedeemWalletCodeLoginActivity) {
        if (PatchProxy.proxy(new Object[]{steamRedeemWalletCodeLoginActivity}, null, changeQuickRedirect, true, 40985, new Class[]{SteamRedeemWalletCodeLoginActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamRedeemWalletCodeLoginActivity.j2();
    }

    private void e2(String str) {
        WebviewFragment webviewFragment;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 40980, new Class[]{String.class}, Void.TYPE).isSupported || (webviewFragment = (WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            return;
        }
        webviewFragment.H6(str, null);
    }

    public static Intent f2(Context context, SteamWalletJsObj steamWalletJsObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, steamWalletJsObj}, null, changeQuickRedirect, true, 40968, new Class[]{Context.class, SteamWalletJsObj.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) SteamRedeemWalletCodeLoginActivity.class);
        intent.putExtra(Q, steamWalletJsObj);
        return intent;
    }

    public static Intent h2(Context context, SteamWalletJsObj steamWalletJsObj, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, steamWalletJsObj, str}, null, changeQuickRedirect, true, 40969, new Class[]{Context.class, SteamWalletJsObj.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) SteamRedeemWalletCodeLoginActivity.class);
        intent.putExtra(Q, steamWalletJsObj);
        intent.putExtra("order_id", str);
        return intent;
    }

    public static Intent i2(Context context, SteamWalletJsObj steamWalletJsObj, String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, steamWalletJsObj, str, str2}, null, changeQuickRedirect, true, 40970, new Class[]{Context.class, SteamWalletJsObj.class, String.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) SteamRedeemWalletCodeLoginActivity.class);
        intent.putExtra(Q, steamWalletJsObj);
        intent.putExtra("order_id", str);
        intent.putExtra(S, str2);
        return intent;
    }

    private void j2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40973, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.view.l.m();
    }

    private void k2(String str) {
        WebviewFragment webviewFragment;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 40981, new Class[]{String.class}, Void.TYPE).isSupported || (webviewFragment = (WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            return;
        }
        webviewFragment.t7(str);
    }

    private void l2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40976, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MallSteamInfoUploadObj mallSteamInfoUploadObj = new MallSteamInfoUploadObj();
        mallSteamInfoUploadObj.setHeader(this.P);
        PostEncryptParamsObj postEncryptParamsObjV0 = com.max.xiaoheihe.utils.d.v0(com.max.hbutils.utils.k.q(mallSteamInfoUploadObj), true);
        V((io.reactivex.disposables.b) ("steam".equals(this.N) ? com.max.xiaoheihe.network.i.a().V8(postEncryptParamsObjV0.getData(), postEncryptParamsObjV0.getKey(), postEncryptParamsObjV0.getSid(), postEncryptParamsObjV0.getTime()) : com.max.xiaoheihe.network.i.a().z5(postEncryptParamsObjV0.getData(), postEncryptParamsObjV0.getKey(), postEncryptParamsObjV0.getSid(), postEncryptParamsObjV0.getTime())).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private void m2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40975, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.u(this.M)) {
            l2();
        } else {
            n2();
        }
    }

    private void n2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40978, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MallSteamInfoUploadObj mallSteamInfoUploadObj = new MallSteamInfoUploadObj();
        mallSteamInfoUploadObj.setHeader(this.P);
        mallSteamInfoUploadObj.setOrder_id(this.M);
        PostEncryptParamsObj postEncryptParamsObjV0 = com.max.xiaoheihe.utils.d.v0(com.max.hbutils.utils.k.q(mallSteamInfoUploadObj), true);
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Ca(this.M, postEncryptParamsObjV0.getData(), postEncryptParamsObjV0.getKey(), postEncryptParamsObjV0.getSid(), postEncryptParamsObjV0.getTime()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    private void o2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40974, new Class[0], Void.TYPE).isSupported || !isActive() || this.mStatusTextView == null) {
            return;
        }
        if ("pending".equals(this.O)) {
            this.mStatusTextView.setText(getString(R.string.login_expire));
        } else if ("logged".equals(this.O)) {
            this.mStatusTextView.setText(getString(R.string.login_success));
        } else if ("need_login".equals(this.O)) {
            this.mStatusTextView.setText(getString(R.string.login_expire));
        }
    }

    private void p2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40979, new Class[0], Void.TYPE).isSupported || this.f66601b.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f66601b).y(getString(R.string.parental_notice_tips_title)).l(getString(R.string.parental_notice_tips_desc)).t(R.string.confirm, new e()).F();
    }

    private void q2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 40977, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(this.f66601b);
        fVar.y("获取Steam账号状态失败").l(str).u("我知道了", new c());
        fVar.F();
    }

    private void showLoadingDialog() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40972, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CoffeeDialogProgressObj("", "1", null));
        com.max.xiaoheihe.view.l.A(new CoffeeDialogDataObj("正在获取Steam账号状态，请耐心等待", arrayList, "1", null, null, false, null, null));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00bb  */
    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        HashMap<String, String> host;
        String str;
        ArrayList<TagJsObj> js_list;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40971, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_steam_redeem_wallet_code_login);
        ButterKnife.a(this);
        this.L = (SteamWalletJsObj) getIntent().getSerializableExtra(Q);
        this.M = getIntent().getStringExtra("order_id");
        this.N = getIntent().getStringExtra(S);
        this.f66616q.setTitle(getString(R.string.loading));
        this.f66617r.setVisibility(0);
        SteamWalletJsObj steamWalletJsObj = this.L;
        String str2 = null;
        if (steamWalletJsObj == null) {
            host = null;
            str = null;
            js_list = null;
        } else if (steamWalletJsObj.getHost() != null && !com.max.hbcommon.utils.c.w(this.L.getJs_list())) {
            host = this.L.getHost();
            js_list = this.L.getJs_list();
            str = null;
        } else if (this.L.getSteam_proxy() == null || this.L.getSteam_proxy().getProxy() == null) {
            host = null;
            str = null;
            js_list = null;
        } else {
            String strV = com.max.xiaoheihe.utils.d.v(this.L.getSteam_proxy().getProxy());
            if (com.max.hbcommon.utils.c.u(strV)) {
                host = null;
                str = null;
                js_list = null;
            } else {
                String[] strArrSplit = strV.split(":");
                if (strArrSplit.length > 1) {
                    String str3 = strArrSplit[0];
                    str = strArrSplit[1];
                    js_list = null;
                    str2 = str3;
                    host = null;
                } else {
                    host = null;
                    str = null;
                    js_list = null;
                }
            }
        }
        com.max.xiaoheihe.utils.d.k(this.f66601b, "https://store.steampowered.com");
        if (((WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            WebviewFragment webviewFragmentA = new u(this.L.getLoadcookie().getUrl()).t(new ProxyAddressObj(str2, str)).l(new IpDirectObj(host, js_list)).v(true).a();
            webviewFragmentA.Y7(new a());
            getSupportFragmentManager().u().b(R.id.fragment_container, webviewFragmentA).m();
        }
    }
}
