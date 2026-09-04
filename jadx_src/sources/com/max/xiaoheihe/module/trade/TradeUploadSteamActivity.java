package com.max.xiaoheihe.module.trade;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.compose.runtime.internal.o;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.EncryptionParamsObj;
import com.max.hbcommon.bean.PostEncryptParamsObj;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.SteamAcceptGameParams;
import com.max.xiaoheihe.bean.mall.MallSteamInfoUploadObj;
import com.max.xiaoheihe.bean.trade.TradeSteamParams;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.max.xiaoheihe.network.i;
import com.max.xiaoheihe.utils.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: TradeUploadSteamActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class TradeUploadSteamActivity extends BaseActivity {

    @dl.d
    public static final a P = new a(null);
    public static final int Q = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private TradeSteamParams L;

    @dl.d
    private final HashMap<String, String> M = new HashMap<>();

    @dl.e
    private LoadingDialog N;

    @dl.e
    private String O;

    /* JADX INFO: compiled from: TradeUploadSteamActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final Intent a(@dl.e Context context, @dl.e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, 46010, new Class[]{Context.class, String.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            Intent intent = new Intent(context, (Class<?>) TradeUploadSteamActivity.class);
            intent.putExtra("order_id", str);
            return intent;
        }
    }

    /* JADX INFO: compiled from: TradeUploadSteamActivity.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<TradeSteamParams>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 46011, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradeUploadSteamActivity.this.isActive()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<TradeSteamParams> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 46012, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradeUploadSteamActivity.this.isActive()) {
                super.onNext(result);
                TradeUploadSteamActivity.this.L = result.getResult();
                Activity activity = ((BaseActivity) TradeUploadSteamActivity.this).f66601b;
                TradeSteamParams tradeSteamParams = TradeUploadSteamActivity.this.L;
                f0.m(tradeSteamParams);
                SteamAcceptGameParams data = tradeSteamParams.getData();
                f0.m(data);
                com.max.xiaoheihe.utils.d.k(activity, data.getUrl());
                TradeSteamParams tradeSteamParams2 = TradeUploadSteamActivity.this.L;
                f0.m(tradeSteamParams2);
                SteamAcceptGameParams data2 = tradeSteamParams2.getData();
                f0.m(data2);
                WebviewFragment loginFragment = WebviewFragment.u7(data2.getUrl());
                TradeUploadSteamActivity tradeUploadSteamActivity = TradeUploadSteamActivity.this;
                f0.o(loginFragment, "loginFragment");
                TradeUploadSteamActivity.Y1(tradeUploadSteamActivity, loginFragment);
                TradeUploadSteamActivity.Z1(TradeUploadSteamActivity.this);
                TradeUploadSteamActivity.this.getSupportFragmentManager().u().y(R.id.fragment_container, loginFragment).m();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46013, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeSteamParams>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeUploadSteamActivity.kt */
    public static final class c implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46014, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            TradeUploadSteamActivity.a2(TradeUploadSteamActivity.this);
        }
    }

    /* JADX INFO: compiled from: TradeUploadSteamActivity.kt */
    public static final class d extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 46015, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradeUploadSteamActivity.this.isActive()) {
                super.onError(e10);
                e10.printStackTrace();
                TradeUploadSteamActivity.T1(TradeUploadSteamActivity.this);
                TradeUploadSteamActivity.this.finish();
            }
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 46016, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradeUploadSteamActivity.this.isActive()) {
                TradeUploadSteamActivity tradeUploadSteamActivity = TradeUploadSteamActivity.this;
                tradeUploadSteamActivity.setResult(-1, tradeUploadSteamActivity.getIntent());
                TradeUploadSteamActivity.this.finish();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46017, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeUploadSteamActivity.kt */
    public static final class e extends WebviewFragment.o0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void c(@dl.d WebView view, @dl.d String html) {
            if (PatchProxy.proxy(new Object[]{view, html}, this, changeQuickRedirect, false, 46021, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(view, "view");
            f0.p(html, "html");
            if (!com.max.hbcommon.utils.c.u(html) && StringsKt__StringsKt.W2(html, "parental_notice", false, 2, null)) {
                TradeUploadSteamActivity.b2(TradeUploadSteamActivity.this);
                return;
            }
            Matcher matcher = Pattern.compile("g_steamID = \"(\\d+)\";").matcher(html);
            if (!matcher.find()) {
                com.max.hbcommon.utils.d.b("zzzzmatchtest", "not find");
                return;
            }
            String strGroup = matcher.group(1);
            TradeSteamParams tradeSteamParams = TradeUploadSteamActivity.this.L;
            f0.m(tradeSteamParams);
            SteamAcceptGameParams data = tradeSteamParams.getData();
            f0.m(data);
            if (f0.g(strGroup, data.getSteam_id())) {
                TradeUploadSteamActivity.V1(TradeUploadSteamActivity.this);
                return;
            }
            com.max.hbutils.utils.c.f("您登录的账号与绑定的账号不一致，请重新登录");
            com.max.xiaoheihe.utils.d.h(((BaseActivity) TradeUploadSteamActivity.this).f66601b);
            TradeUploadSteamActivity.W1(TradeUploadSteamActivity.this);
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void d(@dl.d WebView view, @dl.d WebResourceRequest request) {
            if (PatchProxy.proxy(new Object[]{view, request}, this, changeQuickRedirect, false, 46020, new Class[]{WebView.class, WebResourceRequest.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(view, "view");
            f0.p(request, "request");
            TradeSteamParams tradeSteamParams = TradeUploadSteamActivity.this.L;
            f0.m(tradeSteamParams);
            SteamAcceptGameParams data = tradeSteamParams.getData();
            f0.m(data);
            String regular = data.getRegular();
            f0.o(regular, "mUrlData!!.data!!.regular");
            Regex regex = new Regex(regular);
            String string = request.getUrl().toString();
            f0.o(string, "request.url.toString()");
            if (regex.b(string)) {
                Map<String, String> requestHeaders = request.getRequestHeaders();
                f0.o(requestHeaders, "requestHeaders");
                for (Map.Entry<String, String> entry : requestHeaders.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    HashMap map = TradeUploadSteamActivity.this.M;
                    f0.o(key, "key");
                    f0.o(value, "value");
                    map.put(key, value);
                }
            }
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void g(@dl.d WebView view, @dl.d String url, int i10, int i11) {
            Object[] objArr = {view, url, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 46019, new Class[]{WebView.class, String.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(view, "view");
            f0.p(url, "url");
            if (i11 - 1 == 0) {
                TradeSteamParams tradeSteamParams = TradeUploadSteamActivity.this.L;
                f0.m(tradeSteamParams);
                SteamAcceptGameParams data = tradeSteamParams.getData();
                f0.m(data);
                String regular = data.getRegular();
                f0.o(regular, "mUrlData!!.data!!.regular");
                if (new Regex(regular).b(url)) {
                    CookieManager cookieManager = CookieManager.getInstance();
                    cookieManager.setAcceptCookie(true);
                    TradeSteamParams tradeSteamParams2 = TradeUploadSteamActivity.this.L;
                    f0.m(tradeSteamParams2);
                    SteamAcceptGameParams data2 = tradeSteamParams2.getData();
                    f0.m(data2);
                    String cookieString = cookieManager.getCookie(data2.getUrl());
                    HashMap map = TradeUploadSteamActivity.this.M;
                    f0.o(cookieString, "cookieString");
                    map.put("Cookie", cookieString);
                    TradeUploadSteamActivity.M1(TradeUploadSteamActivity.this, WebviewFragment.Y4);
                    return;
                }
                if (StringsKt__StringsKt.W2(url, "/login", false, 2, null)) {
                    TradeSteamParams tradeSteamParams3 = TradeUploadSteamActivity.this.L;
                    f0.m(tradeSteamParams3);
                    SteamAcceptGameParams data3 = tradeSteamParams3.getData();
                    f0.m(data3);
                    if (data3.getRemember_js() != null) {
                        TradeSteamParams tradeSteamParams4 = TradeUploadSteamActivity.this.L;
                        f0.m(tradeSteamParams4);
                        SteamAcceptGameParams data4 = tradeSteamParams4.getData();
                        f0.m(data4);
                        EncryptionParamsObj remember_js = data4.getRemember_js();
                        String js = com.max.hbcommon.utils.e.c(remember_js.getP1(), w.c(remember_js.getP3()));
                        if (f0.g(com.max.xiaoheihe.utils.d.a1(js), remember_js.getP2())) {
                            TradeUploadSteamActivity tradeUploadSteamActivity = TradeUploadSteamActivity.this;
                            f0.o(js, "js");
                            TradeUploadSteamActivity.M1(tradeUploadSteamActivity, js);
                        }
                    }
                }
            }
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void o(@dl.d WebView view, @dl.d String receivedTitle) {
            if (PatchProxy.proxy(new Object[]{view, receivedTitle}, this, changeQuickRedirect, false, 46018, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(view, "view");
            f0.p(receivedTitle, "receivedTitle");
            if (com.max.hbcommon.utils.c.u(receivedTitle) || ((BaseActivity) TradeUploadSteamActivity.this).f66616q == null || ((BaseActivity) TradeUploadSteamActivity.this).f66616q.getVisibility() != 0) {
                return;
            }
            if (kotlin.text.u.L1("about:blank", receivedTitle, true)) {
                receivedTitle = TradeUploadSteamActivity.this.getString(R.string.loading);
            }
            ((BaseActivity) TradeUploadSteamActivity.this).f66616q.setTitle(receivedTitle);
        }
    }

    /* JADX INFO: compiled from: TradeUploadSteamActivity.kt */
    public static final class f implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f93275b = new f();
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 46022, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public static final /* synthetic */ void M1(TradeUploadSteamActivity tradeUploadSteamActivity, String str) {
        if (PatchProxy.proxy(new Object[]{tradeUploadSteamActivity, str}, null, changeQuickRedirect, true, 46004, new Class[]{TradeUploadSteamActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeUploadSteamActivity.c2(str);
    }

    public static final /* synthetic */ void T1(TradeUploadSteamActivity tradeUploadSteamActivity) {
        if (PatchProxy.proxy(new Object[]{tradeUploadSteamActivity}, null, changeQuickRedirect, true, 46009, new Class[]{TradeUploadSteamActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeUploadSteamActivity.f2();
    }

    public static final /* synthetic */ void V1(TradeUploadSteamActivity tradeUploadSteamActivity) {
        if (PatchProxy.proxy(new Object[]{tradeUploadSteamActivity}, null, changeQuickRedirect, true, 46006, new Class[]{TradeUploadSteamActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeUploadSteamActivity.h2();
    }

    public static final /* synthetic */ void W1(TradeUploadSteamActivity tradeUploadSteamActivity) {
        if (PatchProxy.proxy(new Object[]{tradeUploadSteamActivity}, null, changeQuickRedirect, true, 46007, new Class[]{TradeUploadSteamActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeUploadSteamActivity.i2();
    }

    public static final /* synthetic */ void Y1(TradeUploadSteamActivity tradeUploadSteamActivity, WebviewFragment webviewFragment) {
        if (PatchProxy.proxy(new Object[]{tradeUploadSteamActivity, webviewFragment}, null, changeQuickRedirect, true, 46002, new Class[]{TradeUploadSteamActivity.class, WebviewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeUploadSteamActivity.j2(webviewFragment);
    }

    public static final /* synthetic */ void Z1(TradeUploadSteamActivity tradeUploadSteamActivity) {
        if (PatchProxy.proxy(new Object[]{tradeUploadSteamActivity}, null, changeQuickRedirect, true, 46003, new Class[]{TradeUploadSteamActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeUploadSteamActivity.x1();
    }

    public static final /* synthetic */ void a2(TradeUploadSteamActivity tradeUploadSteamActivity) {
        if (PatchProxy.proxy(new Object[]{tradeUploadSteamActivity}, null, changeQuickRedirect, true, 46008, new Class[]{TradeUploadSteamActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeUploadSteamActivity.showLoadingDialog();
    }

    public static final /* synthetic */ void b2(TradeUploadSteamActivity tradeUploadSteamActivity) {
        if (PatchProxy.proxy(new Object[]{tradeUploadSteamActivity}, null, changeQuickRedirect, true, 46005, new Class[]{TradeUploadSteamActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeUploadSteamActivity.k2();
    }

    private final void c2(String str) {
        WebviewFragment webviewFragment;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 46001, new Class[]{String.class}, Void.TYPE).isSupported || (webviewFragment = (WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            return;
        }
        webviewFragment.H6(str, null);
    }

    private final void e2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45994, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) i.a().t9("community").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final void f2() {
        LoadingDialog loadingDialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45998, new Class[0], Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing() || (loadingDialog = this.N) == null) {
            return;
        }
        f0.m(loadingDialog);
        loadingDialog.c();
    }

    private final void h2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45999, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        runOnUiThread(new c());
        MallSteamInfoUploadObj mallSteamInfoUploadObj = new MallSteamInfoUploadObj();
        mallSteamInfoUploadObj.setHeader(this.M);
        mallSteamInfoUploadObj.setOrder_id(this.O);
        PostEncryptParamsObj postEncryptParamsObjV0 = com.max.xiaoheihe.utils.d.v0(k.q(mallSteamInfoUploadObj), true);
        V((io.reactivex.disposables.b) i.a().A4(this.O, postEncryptParamsObjV0.getData(), postEncryptParamsObjV0.getKey(), postEncryptParamsObjV0.getSid(), postEncryptParamsObjV0.getTime()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    private final void i2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45995, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TradeSteamParams tradeSteamParams = this.L;
        f0.m(tradeSteamParams);
        SteamAcceptGameParams data = tradeSteamParams.getData();
        f0.m(data);
        WebviewFragment loginFragment = WebviewFragment.u7(data.getUrl());
        f0.o(loginFragment, "loginFragment");
        j2(loginFragment);
        getSupportFragmentManager().u().y(R.id.fragment_container, loginFragment).m();
    }

    private final void j2(WebviewFragment webviewFragment) {
        if (PatchProxy.proxy(new Object[]{webviewFragment}, this, changeQuickRedirect, false, 45996, new Class[]{WebviewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        webviewFragment.Y7(new e());
    }

    private final void k2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46000, new Class[0], Void.TYPE).isSupported || this.f66601b.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f66601b).y(getString(R.string.parental_notice_tips_title)).l(getString(R.string.parental_notice_tips_desc)).t(R.string.confirm, f.f93275b).F();
    }

    private final void showLoadingDialog() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45997, new Class[0], Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing()) {
            return;
        }
        LoadingDialog loadingDialog = this.N;
        if (loadingDialog != null) {
            f0.m(loadingDialog);
            if (loadingDialog.i()) {
                return;
            }
        }
        Activity mContext = this.f66601b;
        f0.o(mContext, "mContext");
        this.N = new LoadingDialog(mContext, "", false).r();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45993, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_fragment_container);
        ButterKnife.a(this);
        this.f66616q.setTitle("登录Steam");
        this.O = getIntent().getStringExtra("order_id");
        Z0().setBackgroundColor(com.max.xiaoheihe.utils.d.E(R.color.white));
        E1();
        e2();
    }
}
