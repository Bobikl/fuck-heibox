package com.max.xiaoheihe.module.game.destiny2;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.webkit.WebView;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.huawei.hms.framework.common.ContainerUtils;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.PostEncryptParamsObj;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.StateObj;
import com.max.xiaoheihe.bean.game.BindGameParamsObj;
import com.max.xiaoheihe.bean.proxy.ProxyAddressObj;
import com.max.xiaoheihe.bean.webintercept.IpDirectObj;
import com.max.xiaoheihe.module.mall.cart.MallCartUtils;
import com.max.xiaoheihe.module.proxy.ProxyManager;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.max.xiaoheihe.module.webview.u;
import com.max.xiaoheihe.network.i;
import com.max.xiaoheihe.utils.w;
import com.max.xiaoheihe.view.l;
import com.max.xiaoheihe.view.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.w0;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.d0;

/* JADX INFO: loaded from: classes11.dex */
@com.max.hbcommon.base.hblifeevent.activity.b(lifeEvents = {com.max.xiaoheihe.module.proxy.a.class})
public class DestinyBindActivity extends BaseActivity {
    public static final String O = "ARG_BIND_PARAMS";
    public static ChangeQuickRedirect changeQuickRedirect;
    private BindGameParamsObj L;
    private LoadingDialog M;
    private w0 N;

    public class a extends WebviewFragment.o0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void g(WebView webView, String str, int i10, int i11) {
            Object[] objArr = {webView, str, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 37437, new Class[]{WebView.class, String.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            if (i11 - 1 == 0) {
                Matcher matcher = com.max.xiaoheihe.module.game.destiny2.a.f87350a.matcher(str);
                String strV1 = DestinyBindActivity.V1(DestinyBindActivity.this, str, "bungleme");
                String strV2 = DestinyBindActivity.V1(DestinyBindActivity.this, str, "bungled");
                if (!com.max.hbcommon.utils.c.u(strV1) && !com.max.hbcommon.utils.c.u(strV2)) {
                    DestinyBindActivity.W1(DestinyBindActivity.this, strV1, strV2);
                } else if (matcher.find()) {
                    DestinyBindActivity.X1(DestinyBindActivity.this, com.max.xiaoheihe.module.game.destiny2.a.f87351b);
                }
            }
            if (!Pattern.compile(DestinyBindActivity.this.L.getDestiny2().getRegular()).matcher(str).find()) {
                MallCartUtils.f90196a.t(DestinyBindActivity.this.N.f116966d.b(), com.max.xiaoheihe.utils.d.n0(R.string.bind_steam_login_msg));
                return;
            }
            MallCartUtils.f90196a.t(DestinyBindActivity.this.N.f116966d.b(), com.max.xiaoheihe.utils.d.n0(R.string.bind_bungie_login_msg));
            String strC = com.max.hbcommon.utils.e.c(DestinyBindActivity.this.L.getDestiny2().getJs().getP1(), w.c(DestinyBindActivity.this.L.getDestiny2().getJs().getP3()));
            if (com.max.xiaoheihe.utils.d.a1(strC).equals(DestinyBindActivity.this.L.getDestiny2().getJs().getP2())) {
                DestinyBindActivity.X1(DestinyBindActivity.this, "javascript:" + strC);
            }
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void o(WebView webView, String str) {
            if (PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 37436, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(str) || ((BaseActivity) DestinyBindActivity.this).f66616q == null || ((BaseActivity) DestinyBindActivity.this).f66616q.getVisibility() != 0) {
                return;
            }
            if ("about:blank".equalsIgnoreCase(str)) {
                str = DestinyBindActivity.this.getString(R.string.loading);
            }
            ((BaseActivity) DestinyBindActivity.this).f66616q.setTitle(str);
        }
    }

    public class b extends com.max.hbcommon.network.d<d0> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f87343b;

        b(String str) {
            this.f87343b = str;
        }

        public void a(d0 d0Var) {
            JsonElement jsonElement;
            if (PatchProxy.proxy(new Object[]{d0Var}, this, changeQuickRedirect, false, 37439, new Class[]{d0.class}, Void.TYPE).isSupported) {
                return;
            }
            try {
                String strString = d0Var.string();
                if (com.max.hbcommon.utils.c.u(strString) || (jsonElement = ((JsonObject) new Gson().fromJson(strString, JsonObject.class)).get("Response")) == null || !jsonElement.isJsonArray()) {
                    return;
                }
                DestinyBindActivity.a2(DestinyBindActivity.this, this.f87343b, jsonElement.getAsJsonArray().get(0).getAsJsonObject());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 37438, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b("zzzzdestiny2", "getBungieInfo onError");
            super.onError(th2);
            DestinyBindActivity.this.f2();
            th2.printStackTrace();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37440, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((d0) obj);
        }
    }

    public class c extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 37441, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            if (DestinyBindActivity.this.isActive()) {
                DestinyBindActivity.this.f2();
            }
            super.onError(th2);
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 37442, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            DestinyBindActivity.b2(DestinyBindActivity.this, lb.a.R0, 1);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37443, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class d extends com.max.hbcommon.network.d<Result<StateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f87346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f87347c;

        d(int i10, String str) {
            this.f87346b = i10;
            this.f87347c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 37444, new Class[]{Throwable.class}, Void.TYPE).isSupported && DestinyBindActivity.this.isActive()) {
                DestinyBindActivity.this.f2();
                super.onError(th2);
            }
        }

        public void onNext(Result<StateObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 37445, new Class[]{Result.class}, Void.TYPE).isSupported && DestinyBindActivity.this.isActive()) {
                if (result == null || result.getResult().getState() == null) {
                    DestinyBindActivity.O1(DestinyBindActivity.this, null);
                    return;
                }
                String state = result.getResult().getState();
                state.hashCode();
                switch (state) {
                    case "failed":
                        DestinyBindActivity.O1(DestinyBindActivity.this, result.getMsg());
                        break;
                    case "ok":
                        DestinyBindActivity.Q1(DestinyBindActivity.this);
                        break;
                    case "waiting":
                        int i10 = this.f87346b;
                        if (i10 <= 5) {
                            DestinyBindActivity.b2(DestinyBindActivity.this, this.f87347c, i10 + 1);
                            break;
                        } else {
                            DestinyBindActivity.O1(DestinyBindActivity.this, null);
                            break;
                        }
                        break;
                    default:
                        DestinyBindActivity.O1(DestinyBindActivity.this, null);
                        break;
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37446, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<StateObj>) obj);
        }
    }

    public class e implements m {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.xiaoheihe.view.m
        public void a(Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 37448, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            dialog.dismiss();
            ((BaseActivity) DestinyBindActivity.this).f66601b.finish();
        }

        @Override // com.max.xiaoheihe.view.m
        public void b(Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 37447, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            dialog.dismiss();
        }
    }

    static /* synthetic */ void O1(DestinyBindActivity destinyBindActivity, String str) {
        if (PatchProxy.proxy(new Object[]{destinyBindActivity, str}, null, changeQuickRedirect, true, 37434, new Class[]{DestinyBindActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        destinyBindActivity.c2(str);
    }

    static /* synthetic */ void Q1(DestinyBindActivity destinyBindActivity) {
        if (PatchProxy.proxy(new Object[]{destinyBindActivity}, null, changeQuickRedirect, true, 37435, new Class[]{DestinyBindActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        destinyBindActivity.e2();
    }

    static /* synthetic */ String V1(DestinyBindActivity destinyBindActivity, String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{destinyBindActivity, str, str2}, null, changeQuickRedirect, true, 37429, new Class[]{DestinyBindActivity.class, String.class, String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : destinyBindActivity.j2(str, str2);
    }

    static /* synthetic */ void W1(DestinyBindActivity destinyBindActivity, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{destinyBindActivity, str, str2}, null, changeQuickRedirect, true, 37430, new Class[]{DestinyBindActivity.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        destinyBindActivity.i2(str, str2);
    }

    static /* synthetic */ void X1(DestinyBindActivity destinyBindActivity, String str) {
        if (PatchProxy.proxy(new Object[]{destinyBindActivity, str}, null, changeQuickRedirect, true, 37431, new Class[]{DestinyBindActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        destinyBindActivity.l2(str);
    }

    static /* synthetic */ void a2(DestinyBindActivity destinyBindActivity, String str, JsonObject jsonObject) {
        if (PatchProxy.proxy(new Object[]{destinyBindActivity, str, jsonObject}, null, changeQuickRedirect, true, 37432, new Class[]{DestinyBindActivity.class, String.class, JsonObject.class}, Void.TYPE).isSupported) {
            return;
        }
        destinyBindActivity.m2(str, jsonObject);
    }

    static /* synthetic */ void b2(DestinyBindActivity destinyBindActivity, String str, int i10) {
        if (PatchProxy.proxy(new Object[]{destinyBindActivity, str, new Integer(i10)}, null, changeQuickRedirect, true, 37433, new Class[]{DestinyBindActivity.class, String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        destinyBindActivity.h2(str, i10);
    }

    private void c2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 37427, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f2();
        Activity activity = this.f66601b;
        if (com.max.hbcommon.utils.c.u(str)) {
            str = com.max.xiaoheihe.utils.d.n0(R.string.bind_destiny_timeout);
        }
        l.D(activity, "", str, com.max.xiaoheihe.utils.d.n0(R.string.confirm), null, new e());
    }

    private void e2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37426, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
        com.max.hbutils.utils.c.d(com.max.xiaoheihe.utils.d.n0(R.string.logging_data_succuess));
        com.max.hbcommon.base.hblifeevent.activity.a.d(this, true);
        com.max.xiaoheihe.utils.d.x1(this.f66601b);
        Intent intent = new Intent();
        intent.putExtra(ProxyManager.f91544j, true);
        this.f66601b.setResult(-1, intent);
        this.f66601b.finish();
        f2();
    }

    private void h2(String str, int i10) {
        if (PatchProxy.proxy(new Object[]{str, new Integer(i10)}, this, changeQuickRedirect, false, 37425, new Class[]{String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) i.a().r5(null, str, null).w1((i10 - 1) * 2, TimeUnit.SECONDS).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(i10, str)));
    }

    private void i2(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 37423, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        LoadingDialog loadingDialog = this.M;
        if (loadingDialog == null || !loadingDialog.i()) {
            this.M = new LoadingDialog(this.f66601b, getString(R.string.loading), true).r();
        }
        com.max.hbcommon.utils.d.b("zzzzdestiny2", "getBungieInfo bungleme==" + str + "   bungled  " + str2);
        HashMap map = new HashMap();
        map.put("User-Agent", com.max.xiaoheihe.module.game.destiny2.a.f87353d);
        map.put("X-API-Key", this.L.getDestiny2().getApi_key());
        map.put("x-csrf", str2);
        String strB = com.max.xiaoheihe.module.game.ow.a.b(this.f66601b, com.max.xiaoheihe.module.game.destiny2.a.f87352c);
        map.put("Cookie", strB);
        com.max.hbcommon.utils.d.b("zzzzdestiny2", "getBungieInfo Cookie3==" + strB);
        V((io.reactivex.disposables.b) i.b(false).R3(map, com.max.xiaoheihe.module.game.destiny2.a.f87354e).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(str)));
    }

    private String j2(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 37422, new Class[]{String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String cookie = com.max.xiaoheihe.utils.d.K(this.f66601b).getCookie(str);
        if (com.max.hbcommon.utils.c.u(cookie)) {
            return null;
        }
        for (String str3 : cookie.split(";")) {
            String strTrim = str3.trim();
            if (strTrim.startsWith(str2)) {
                return strTrim.replace(str2 + ContainerUtils.KEY_VALUE_DELIMITER, "");
            }
        }
        return null;
    }

    public static Intent k2(Context context, BindGameParamsObj bindGameParamsObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, bindGameParamsObj}, null, changeQuickRedirect, true, 37419, new Class[]{Context.class, BindGameParamsObj.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) DestinyBindActivity.class);
        intent.putExtra(O, bindGameParamsObj);
        return intent;
    }

    private void l2(String str) {
        WebviewFragment webviewFragment;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 37421, new Class[]{String.class}, Void.TYPE).isSupported || (webviewFragment = (WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            return;
        }
        webviewFragment.t7(str);
    }

    private void m2(String str, JsonObject jsonObject) {
        if (PatchProxy.proxy(new Object[]{str, jsonObject}, this, changeQuickRedirect, false, 37424, new Class[]{String.class, JsonObject.class}, Void.TYPE).isSupported || jsonObject == null) {
            return;
        }
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("bungleme", str);
        jsonObject2.add(ad.c.f1239s, jsonObject);
        PostEncryptParamsObj postEncryptParamsObjU0 = com.max.xiaoheihe.utils.d.u0(k.p(jsonObject2));
        V((io.reactivex.disposables.b) i.a().Za(postEncryptParamsObjU0.getData(), postEncryptParamsObjU0.getKey(), postEncryptParamsObjU0.getSid(), postEncryptParamsObjU0.getTime()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    public void f2() {
        LoadingDialog loadingDialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37428, new Class[0], Void.TYPE).isSupported || (loadingDialog = this.M) == null) {
            return;
        }
        loadingDialog.c();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0092  */
    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37420, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        w0 w0VarC = w0.c(this.f66602c);
        this.N = w0VarC;
        setContentView(w0VarC.b());
        this.L = (BindGameParamsObj) getIntent().getSerializableExtra(O);
        this.f66616q.setTitle(com.max.xiaoheihe.utils.d.n0(R.string.login_steam_to_verify));
        if (((WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            u uVar = new u(this.L.getBind_url());
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
            if (str2 != null && str != null) {
                uVar.t(new ProxyAddressObj(str2, str));
            }
            if (this.L.getHost() != null && this.L.getJs_list() != null) {
                uVar.l(new IpDirectObj(this.L.getHost(), this.L.getJs_list()));
            }
            WebviewFragment webviewFragmentA = uVar.a();
            webviewFragmentA.getArguments().putSerializable("destiny2_bind_params", this.L.getDestiny2());
            webviewFragmentA.Y7(new a());
            getSupportFragmentManager().u().b(R.id.fragment_container, webviewFragmentA).m();
        }
    }
}
