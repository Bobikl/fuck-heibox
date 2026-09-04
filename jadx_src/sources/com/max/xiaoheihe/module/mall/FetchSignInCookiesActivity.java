package com.max.xiaoheihe.module.mall;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.EncryptionParamsObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.PostEncryptParamsObj;
import com.max.hbcommon.network.ApiException;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.CoffeeDialogDataObj;
import com.max.xiaoheihe.bean.game.CoffeeDialogProgressObj;
import com.max.xiaoheihe.bean.game.SteamAcceptGameParams;
import com.max.xiaoheihe.bean.mall.MallSteamInfoUploadObj;
import com.max.xiaoheihe.bean.mall.SteamWalletJsObj;
import com.max.xiaoheihe.bean.proxy.ProxyAddressObj;
import com.max.xiaoheihe.bean.webintercept.IpDirectObj;
import com.max.xiaoheihe.module.trade.TradeInfoUtilKt;
import com.max.xiaoheihe.module.webview.HostPingHelper;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.max.xiaoheihe.utils.l0;
import com.max.xiaoheihe.utils.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.f2;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: FetchSignInCookiesActivity.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nFetchSignInCookiesActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FetchSignInCookiesActivity.kt\ncom/max/xiaoheihe/module/mall/FetchSignInCookiesActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,453:1\n731#2,9:454\n37#3,2:463\n*S KotlinDebug\n*F\n+ 1 FetchSignInCookiesActivity.kt\ncom/max/xiaoheihe/module/mall/FetchSignInCookiesActivity\n*L\n356#1:454,9\n357#1:463,2\n*E\n"})
@ig.d(path = {lb.d.f131120a})
@androidx.compose.runtime.internal.o(parameters = 0)
@com.max.hbcommon.base.hblifeevent.activity.b(lifeEvents = {com.max.xiaoheihe.module.proxy.a.class})
public final class FetchSignInCookiesActivity extends BaseActivity {

    @dl.d
    public static final a R = new a(null);
    public static final int S = 8;

    @dl.d
    private static final String T = "pending";

    @dl.d
    private static final String U = "logged";

    @dl.d
    private static final String V = "need_login";
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private SteamWalletJsObj L;

    @dl.d
    private final HashMap<String, String> M = new HashMap<>();

    @dl.d
    private String N = "pending";

    @dl.d
    private ProxyType O = ProxyType.DIRECT;

    @dl.e
    private ArrayList<String> P;
    private f2 Q;

    /* JADX INFO: compiled from: FetchSignInCookiesActivity.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: FetchSignInCookiesActivity.kt */
    public static final class b implements HostPingHelper.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ yh.q<ProxyType, String, HashMap<String, String>, b2> f89449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f89450b;

        /* JADX WARN: Multi-variable type inference failed */
        b(yh.q<? super ProxyType, ? super String, ? super HashMap<String, String>, b2> qVar, String str) {
            this.f89449a = qVar;
            this.f89450b = str;
        }

        @Override // com.max.xiaoheihe.module.webview.HostPingHelper.a
        public void a(@dl.e HashMap<String, String> map) {
            if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 39892, new Class[]{HashMap.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f89449a.invoke(ProxyType.DNS_IP_DIRECT, this.f89450b, map);
        }
    }

    /* JADX INFO: compiled from: FetchSignInCookiesActivity.kt */
    public static final class c implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f89451b = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 39902, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: FetchSignInCookiesActivity.kt */
    public static final class d implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 39903, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            FetchSignInCookiesActivity.this.finish();
        }
    }

    /* JADX INFO: compiled from: FetchSignInCookiesActivity.kt */
    public static final class e extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 39904, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (FetchSignInCookiesActivity.this.isActive()) {
                FetchSignInCookiesActivity.Y1(FetchSignInCookiesActivity.this);
                FetchSignInCookiesActivity.h2(FetchSignInCookiesActivity.this, (!(e10 instanceof ApiException) || TextUtils.isEmpty(e10.getMessage())) ? "" : e10.getMessage());
            }
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 39905, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (FetchSignInCookiesActivity.this.isActive()) {
                super.onNext(result);
                com.max.hbcommon.base.hblifeevent.activity.a.d(FetchSignInCookiesActivity.this, true);
                FetchSignInCookiesActivity.this.N = "logged";
                FetchSignInCookiesActivity.Z1(FetchSignInCookiesActivity.this);
                FetchSignInCookiesActivity.this.setResult(-1);
                FetchSignInCookiesActivity.this.finish();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39906, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    public static final /* synthetic */ void M1(FetchSignInCookiesActivity fetchSignInCookiesActivity, String str) {
        if (PatchProxy.proxy(new Object[]{fetchSignInCookiesActivity, str}, null, changeQuickRedirect, true, 39889, new Class[]{FetchSignInCookiesActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        fetchSignInCookiesActivity.k2(str);
    }

    public static final /* synthetic */ void N1(FetchSignInCookiesActivity fetchSignInCookiesActivity, String str, EncryptionParamsObj encryptionParamsObj) {
        if (PatchProxy.proxy(new Object[]{fetchSignInCookiesActivity, str, encryptionParamsObj}, null, changeQuickRedirect, true, 39888, new Class[]{FetchSignInCookiesActivity.class, String.class, EncryptionParamsObj.class}, Void.TYPE).isSupported) {
            return;
        }
        fetchSignInCookiesActivity.l2(str, encryptionParamsObj);
    }

    public static final /* synthetic */ void O1(FetchSignInCookiesActivity fetchSignInCookiesActivity, String str, HashMap map) {
        if (PatchProxy.proxy(new Object[]{fetchSignInCookiesActivity, str, map}, null, changeQuickRedirect, true, 39887, new Class[]{FetchSignInCookiesActivity.class, String.class, HashMap.class}, Void.TYPE).isSupported) {
            return;
        }
        fetchSignInCookiesActivity.m2(str, map);
    }

    public static final /* synthetic */ void Q1(FetchSignInCookiesActivity fetchSignInCookiesActivity, String str) {
        if (PatchProxy.proxy(new Object[]{fetchSignInCookiesActivity, str}, null, changeQuickRedirect, true, 39884, new Class[]{FetchSignInCookiesActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        fetchSignInCookiesActivity.n2(str);
    }

    public static final /* synthetic */ void Y1(FetchSignInCookiesActivity fetchSignInCookiesActivity) {
        if (PatchProxy.proxy(new Object[]{fetchSignInCookiesActivity}, null, changeQuickRedirect, true, 39880, new Class[]{FetchSignInCookiesActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        fetchSignInCookiesActivity.o2();
    }

    public static final /* synthetic */ void Z1(FetchSignInCookiesActivity fetchSignInCookiesActivity) {
        if (PatchProxy.proxy(new Object[]{fetchSignInCookiesActivity}, null, changeQuickRedirect, true, 39882, new Class[]{FetchSignInCookiesActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        fetchSignInCookiesActivity.u2();
    }

    public static final /* synthetic */ void e2(FetchSignInCookiesActivity fetchSignInCookiesActivity) {
        if (PatchProxy.proxy(new Object[]{fetchSignInCookiesActivity}, null, changeQuickRedirect, true, 39883, new Class[]{FetchSignInCookiesActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        fetchSignInCookiesActivity.showLoadingDialog();
    }

    public static final /* synthetic */ void f2(FetchSignInCookiesActivity fetchSignInCookiesActivity) {
        if (PatchProxy.proxy(new Object[]{fetchSignInCookiesActivity}, null, changeQuickRedirect, true, 39885, new Class[]{FetchSignInCookiesActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        fetchSignInCookiesActivity.v2();
    }

    public static final /* synthetic */ void h2(FetchSignInCookiesActivity fetchSignInCookiesActivity, String str) {
        if (PatchProxy.proxy(new Object[]{fetchSignInCookiesActivity, str}, null, changeQuickRedirect, true, 39881, new Class[]{FetchSignInCookiesActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        fetchSignInCookiesActivity.x2(str);
    }

    public static final /* synthetic */ void i2(FetchSignInCookiesActivity fetchSignInCookiesActivity) {
        if (PatchProxy.proxy(new Object[]{fetchSignInCookiesActivity}, null, changeQuickRedirect, true, 39886, new Class[]{FetchSignInCookiesActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        fetchSignInCookiesActivity.y2();
    }

    private final void j2(final yh.q<? super ProxyType, ? super String, ? super HashMap<String, String>, b2> qVar) {
        SteamWalletJsObj steamWalletJsObj;
        String str;
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{qVar}, this, changeQuickRedirect, false, 39878, new Class[]{yh.q.class}, Void.TYPE).isSupported || (steamWalletJsObj = this.L) == null) {
            return;
        }
        SteamAcceptGameParams loadcookie = steamWalletJsObj.getLoadcookie();
        final String url = loadcookie != null ? loadcookie.getUrl() : null;
        String str2 = "";
        if (url == null) {
            url = "";
        } else {
            f0.o(url, "it.loadcookie?.url ?: \"\"");
        }
        SteamAcceptGameParams loadcookie2 = steamWalletJsObj.getLoadcookie();
        String r_url = loadcookie2 != null ? loadcookie2.getR_url() : null;
        if (r_url != null) {
            f0.o(r_url, "it.loadcookie?.r_url ?: \"\"");
            str2 = r_url;
        }
        if (com.max.hbcommon.utils.i.d()) {
            qVar.invoke(ProxyType.ACC, url, null);
            return;
        }
        KeyDescObj r_proxy = steamWalletJsObj.getR_proxy();
        if (com.max.hbcommon.utils.c.x(r_proxy != null ? r_proxy.getEnable() : null) && !TextUtils.isEmpty(str2)) {
            String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
            String strJ = com.max.hbcommon.utils.e.j("RNRo8mYanAI7MIZV" + str2 + strValueOf);
            if (StringsKt__StringsKt.V2(str2, '?', false, 2, null)) {
                str = str2 + "&xhh_sign=" + strJ + "&xhh_t=" + strValueOf;
            } else {
                str = str2 + "?xhh_sign=" + strJ + "&xhh_t=" + strValueOf;
            }
            qVar.invoke(ProxyType.R_PROXY, str, null);
            return;
        }
        if (steamWalletJsObj.getAcc_proxy() != null) {
            TradeInfoUtilKt.Y(this, false, steamWalletJsObj.getAcc_proxy().getAppid(), steamWalletJsObj.getAcc_proxy().getMsg(), new yh.a<b2>() { // from class: com.max.xiaoheihe.module.mall.FetchSignInCookiesActivity$checkProxyType$1$1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39891, new Class[0], Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39890, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    qVar.invoke(ProxyType.ACC, url, null);
                }
            });
            return;
        }
        HashMap<String, String> host = steamWalletJsObj.getHost();
        if (host != null && !host.isEmpty()) {
            z10 = false;
        }
        if (!z10) {
            qVar.invoke(ProxyType.DNS_IP_DIRECT, url, steamWalletJsObj.getHost());
            return;
        }
        SteamAcceptGameParams steam_proxy = steamWalletJsObj.getSteam_proxy();
        if ((steam_proxy != null ? steam_proxy.getHosts() : null) != null && steamWalletJsObj.getSteam_proxy().getHosts().size() > 0) {
            HostPingHelper.Companion companion = HostPingHelper.f94175a;
            HashMap<String, ArrayList<String>> hosts = steamWalletJsObj.getSteam_proxy().getHosts();
            f0.o(hosts, "it.steam_proxy.hosts");
            companion.b(this, hosts, new b(qVar, url));
            return;
        }
        SteamAcceptGameParams steam_proxy2 = steamWalletJsObj.getSteam_proxy();
        if ((steam_proxy2 != null ? steam_proxy2.getProxy() : null) != null) {
            qVar.invoke(ProxyType.PROXY, url, null);
        } else {
            qVar.invoke(ProxyType.DIRECT, url, null);
        }
    }

    private final void k2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 39876, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        WebviewFragment webviewFragmentA = (WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container);
        if (webviewFragmentA == null) {
            webviewFragmentA = new com.max.xiaoheihe.module.webview.u(str).v(true).a();
        }
        p2(webviewFragmentA);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0092  */
    private final void l2(String str, EncryptionParamsObj encryptionParamsObj) {
        String str2;
        List listE;
        if (PatchProxy.proxy(new Object[]{str, encryptionParamsObj}, this, changeQuickRedirect, false, 39875, new Class[]{String.class, EncryptionParamsObj.class}, Void.TYPE).isSupported) {
            return;
        }
        WebviewFragment webviewFragmentA = (WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container);
        if (webviewFragmentA == null) {
            String text = com.max.xiaoheihe.utils.d.v(encryptionParamsObj);
            String str3 = null;
            if (com.max.hbcommon.utils.c.u(text)) {
                str2 = null;
            } else {
                f0.o(text, "text");
                List<String> listP = new Regex(":").p(text, 0);
                if (!listP.isEmpty()) {
                    ListIterator<String> listIterator = listP.listIterator(listP.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            listE = CollectionsKt__CollectionsKt.E();
                            break;
                        } else {
                            if (!(listIterator.previous().length() == 0)) {
                                listE = CollectionsKt___CollectionsKt.E5(listP, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                    }
                } else {
                    listE = CollectionsKt__CollectionsKt.E();
                    break;
                }
                String[] strArr = (String[]) listE.toArray(new String[0]);
                if (strArr.length > 1) {
                    str3 = strArr[0];
                    str2 = strArr[1];
                } else {
                    str2 = null;
                }
            }
            webviewFragmentA = new com.max.xiaoheihe.module.webview.u(str).v(true).t(new ProxyAddressObj(str3, str2)).a();
        }
        p2(webviewFragmentA);
    }

    private final void m2(String str, HashMap<String, String> map) {
        if (PatchProxy.proxy(new Object[]{str, map}, this, changeQuickRedirect, false, 39874, new Class[]{String.class, HashMap.class}, Void.TYPE).isSupported) {
            return;
        }
        WebviewFragment webviewFragmentA = (WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container);
        if (webviewFragmentA == null) {
            com.max.xiaoheihe.module.webview.u uVarV = new com.max.xiaoheihe.module.webview.u(str).v(true);
            if (map != null) {
                SteamWalletJsObj steamWalletJsObj = this.L;
                f0.m(steamWalletJsObj);
                uVarV.l(new IpDirectObj(map, steamWalletJsObj.getJs_list()));
            }
            webviewFragmentA = uVarV.a();
        }
        p2(webviewFragmentA);
    }

    private final void n2(String str) {
        WebviewFragment webviewFragment;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 39872, new Class[]{String.class}, Void.TYPE).isSupported || (webviewFragment = (WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            return;
        }
        webviewFragment.H6(str, null);
    }

    private final void o2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39867, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.view.l.m();
    }

    private final void p2(WebviewFragment webviewFragment) {
        SteamAcceptGameParams loadcookie;
        if (PatchProxy.proxy(new Object[]{webviewFragment}, this, changeQuickRedirect, false, 39873, new Class[]{WebviewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        SteamWalletJsObj steamWalletJsObj = this.L;
        final Regex regex = null;
        String regular = (steamWalletJsObj == null || (loadcookie = steamWalletJsObj.getLoadcookie()) == null) ? null : loadcookie.getRegular();
        if (!TextUtils.isEmpty(regular)) {
            f0.m(regular);
            regex = new Regex(regular);
        }
        webviewFragment.Y7(new WebviewFragment.o0() { // from class: com.max.xiaoheihe.module.mall.FetchSignInCookiesActivity$initFragment$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
            public void c(@dl.d WebView view, @dl.d String html) {
                if (PatchProxy.proxy(new Object[]{view, html}, this, changeQuickRedirect, false, 39897, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(view, "view");
                f0.p(html, "html");
                if (com.max.hbcommon.utils.c.u(html) || !StringsKt__StringsKt.W2(html, "parental_notice", false, 2, null)) {
                    FetchSignInCookiesActivity.i2(this.f89456a);
                } else {
                    FetchSignInCookiesActivity.Y1(this.f89456a);
                    FetchSignInCookiesActivity.f2(this.f89456a);
                }
            }

            @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
            public void d(@dl.d WebView view, @dl.d WebResourceRequest request) {
                if (PatchProxy.proxy(new Object[]{view, request}, this, changeQuickRedirect, false, 39896, new Class[]{WebView.class, WebResourceRequest.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(view, "view");
                f0.p(request, "request");
                if (regex != null) {
                    String string = request.getUrl().toString();
                    f0.o(string, "request.url.toString()");
                    if (regex.k(string)) {
                        Map<String, String> requestHeaders = request.getRequestHeaders();
                        f0.o(requestHeaders, "requestHeaders");
                        for (Map.Entry<String, String> entry : requestHeaders.entrySet()) {
                            if (entry.getKey() != null) {
                                HashMap map = this.f89456a.M;
                                String key = entry.getKey();
                                f0.o(key, "entry.key");
                                map.put(key, entry.getValue());
                            }
                        }
                    }
                }
            }

            /* JADX WARN: Code duplicated, block: B:36:0x00e6  */
            /* JADX WARN: Code duplicated, block: B:38:0x00ee  */
            /* JADX WARN: Code duplicated, block: B:42:0x00f8  */
            /* JADX WARN: Code duplicated, block: B:44:0x0100  */
            /* JADX WARN: Code duplicated, block: B:46:0x0114  */
            /* JADX WARN: Code duplicated, block: B:47:0x0117  */
            @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
            public void g(@dl.d WebView view, @dl.d String url, int i10, int i11) {
                SteamAcceptGameParams remember_js;
                ArrayList arrayList;
                String cookie;
                ArrayList arrayList2;
                SteamAcceptGameParams loadcookie2;
                boolean z10 = false;
                Object[] objArr = {view, url, new Integer(i10), new Integer(i11)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 39895, new Class[]{WebView.class, String.class, cls, cls}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(view, "view");
                f0.p(url, "url");
                if (i11 - 1 == 0) {
                    Regex regex2 = regex;
                    String cookie_version = null;
                    if (regex2 != null && regex2.k(url)) {
                        final CookieManager cookieManager = CookieManager.getInstance();
                        cookieManager.setAcceptCookie(true);
                        SteamWalletJsObj steamWalletJsObj2 = this.f89456a.L;
                        if (steamWalletJsObj2 != null && (loadcookie2 = steamWalletJsObj2.getLoadcookie()) != null) {
                            cookie_version = loadcookie2.getCookie_version();
                        }
                        if (f0.g(cookie_version, "2")) {
                            ArrayList arrayList3 = this.f89456a.P;
                            if (arrayList3 != null && (arrayList3.isEmpty() ^ true)) {
                                ArrayList arrayList4 = this.f89456a.P;
                                f0.m(arrayList4);
                                if (arrayList4.size() > 1) {
                                    HashMap map = new HashMap();
                                    ArrayList<String> arrayList5 = this.f89456a.P;
                                    if (arrayList5 != null) {
                                        for (String str : arrayList5) {
                                            String strS = l0.s(str);
                                            String strC = l0.C(str);
                                            String kv = cookieManager.getCookie(str);
                                            if (kv != null) {
                                                f0.o(kv, "kv");
                                                map.put(strS + strC, kv);
                                            }
                                        }
                                    }
                                    cookie = com.max.hbutils.utils.k.p(map);
                                    f0.o(cookie, "serialize(r)");
                                } else {
                                    arrayList = this.f89456a.P;
                                    if (arrayList != null) {
                                        z10 = true;
                                    }
                                    if (z10) {
                                        arrayList2 = this.f89456a.P;
                                        if (arrayList2 != null) {
                                            cookie = "";
                                        } else {
                                            cookie = "";
                                        }
                                    } else {
                                        cookie = cookieManager.getCookie(url);
                                        f0.o(cookie, "{\n                      …                        }");
                                    }
                                }
                            } else {
                                arrayList = this.f89456a.P;
                                if (arrayList != null) {
                                    z10 = true;
                                }
                                if (z10) {
                                    arrayList2 = this.f89456a.P;
                                    if (arrayList2 != null) {
                                        cookie = "";
                                    } else {
                                        cookie = "";
                                    }
                                } else {
                                    cookie = cookieManager.getCookie(url);
                                    f0.o(cookie, "{\n                      …                        }");
                                }
                            }
                        } else {
                            arrayList = this.f89456a.P;
                            if (arrayList != null && (!arrayList.isEmpty())) {
                                z10 = true;
                            }
                            if (z10) {
                                arrayList2 = this.f89456a.P;
                                if (arrayList2 != null || (cookie = CollectionsKt___CollectionsKt.h3(arrayList2, ";", null, null, 0, null, new yh.l<String, CharSequence>() { // from class: com.max.xiaoheihe.module.mall.FetchSignInCookiesActivity$initFragment$1$onPageFinished$2
                                    public static ChangeQuickRedirect changeQuickRedirect;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @dl.d
                                    public final CharSequence a(@dl.d String it) {
                                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 39898, new Class[]{String.class}, CharSequence.class);
                                        if (patchProxyResultProxy.isSupported) {
                                            return (CharSequence) patchProxyResultProxy.result;
                                        }
                                        f0.p(it, "it");
                                        String cookie2 = cookieManager.getCookie(it);
                                        return cookie2 == null ? "" : cookie2;
                                    }

                                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.CharSequence, java.lang.Object] */
                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ CharSequence invoke(String str2) {
                                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 39899, new Class[]{Object.class}, Object.class);
                                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(str2);
                                    }
                                }, 30, null)) == null) {
                                    cookie = "";
                                }
                            } else {
                                cookie = cookieManager.getCookie(url);
                                f0.o(cookie, "{\n                      …                        }");
                            }
                        }
                        com.max.heybox.hblog.g.f74531b.M("[SteamCookie] cookieString: " + cookie);
                        this.f89456a.M.put("Cookie", cookie);
                        FetchSignInCookiesActivity.Q1(this.f89456a, WebviewFragment.Y4);
                    } else if (StringsKt__StringsKt.W2(url, "/login", false, 2, null)) {
                        this.f89456a.N = "need_login";
                        SteamWalletJsObj steamWalletJsObj3 = this.f89456a.L;
                        if (steamWalletJsObj3 != null && (remember_js = steamWalletJsObj3.getRemember_js()) != null) {
                            FetchSignInCookiesActivity fetchSignInCookiesActivity = this.f89456a;
                            EncryptionParamsObj js = remember_js.getJs();
                            String js2 = com.max.hbcommon.utils.e.c(js != null ? js.getP1() : null, w.c(js != null ? js.getP3() : null));
                            String strA1 = com.max.xiaoheihe.utils.d.a1(js2);
                            if (strA1 != null) {
                                if (f0.g(strA1, js != null ? js.getP2() : null)) {
                                    f0.o(js2, "js");
                                    FetchSignInCookiesActivity.Q1(fetchSignInCookiesActivity, js2);
                                }
                            }
                        }
                    }
                    FetchSignInCookiesActivity.Z1(this.f89456a);
                }
            }

            @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
            public void i(@dl.d WebView view, @dl.d String url, int i10, int i11) {
                Object[] objArr = {view, url, new Integer(i10), new Integer(i11)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 39894, new Class[]{WebView.class, String.class, cls, cls}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(view, "view");
                f0.p(url, "url");
                Regex regex2 = regex;
                if (regex2 == null || !regex2.k(url)) {
                    return;
                }
                FetchSignInCookiesActivity.e2(this.f89456a);
            }

            @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
            public void o(@dl.d WebView view, @dl.e String str) {
                if (PatchProxy.proxy(new Object[]{view, str}, this, changeQuickRedirect, false, 39893, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(view, "view");
                if (com.max.hbcommon.utils.c.u(str) || ((BaseActivity) this.f89456a).f66616q == null || ((BaseActivity) this.f89456a).f66616q.getVisibility() != 0) {
                    return;
                }
                if (kotlin.text.u.L1("about:blank", str, true)) {
                    str = this.f89456a.getString(R.string.loading);
                }
                ((BaseActivity) this.f89456a).f66616q.setTitle(str);
            }
        });
        getSupportFragmentManager().u().y(R.id.fragment_container, webviewFragment).m();
    }

    private final void q2() {
        Intent intent;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39879, new Class[0], Void.TYPE).isSupported || (intent = getIntent()) == null) {
            return;
        }
        this.L = (SteamWalletJsObj) intent.getSerializableExtra(lb.c.f131105a);
    }

    private final void r2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39877, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66616q.setTitle(getString(R.string.loading));
        this.f66617r.setVisibility(0);
        j2(new yh.q<ProxyType, String, HashMap<String, String>, b2>() { // from class: com.max.xiaoheihe.module.mall.FetchSignInCookiesActivity$loadWebViewFragment$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: compiled from: FetchSignInCookiesActivity.kt */
            public final /* synthetic */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f89460a;

                static {
                    int[] iArr = new int[ProxyType.valuesCustom().length];
                    try {
                        iArr[ProxyType.R_PROXY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ProxyType.DNS_IP_DIRECT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ProxyType.PROXY.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f89460a = iArr;
                }
            }

            {
                super(3);
            }

            /* JADX WARN: Code duplicated, block: B:17:0x008c  */
            public final void a(@dl.d ProxyType proxyType, @dl.d String url, @dl.e HashMap<String, String> map) {
                SteamAcceptGameParams loadcookie;
                ArrayList<String> cookie_urls;
                SteamAcceptGameParams steam_proxy;
                SteamAcceptGameParams loadcookie2;
                if (PatchProxy.proxy(new Object[]{proxyType, url, map}, this, changeQuickRedirect, false, 39900, new Class[]{ProxyType.class, String.class, HashMap.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(proxyType, "proxyType");
                f0.p(url, "url");
                com.max.heybox.hblog.g.f74531b.M("checkProxyType callback proxyType: " + proxyType + " url: " + url);
                this.f89459b.O = proxyType;
                FetchSignInCookiesActivity fetchSignInCookiesActivity = this.f89459b;
                EncryptionParamsObj proxy = null;
                if (a.f89460a[proxyType.ordinal()] == 1) {
                    SteamWalletJsObj steamWalletJsObj = this.f89459b.L;
                    if (steamWalletJsObj == null || (loadcookie2 = steamWalletJsObj.getLoadcookie()) == null) {
                        cookie_urls = null;
                    } else {
                        cookie_urls = loadcookie2.getR_cookie_urls();
                    }
                } else {
                    SteamWalletJsObj steamWalletJsObj2 = this.f89459b.L;
                    if (steamWalletJsObj2 == null || (loadcookie = steamWalletJsObj2.getLoadcookie()) == null) {
                        cookie_urls = null;
                    } else {
                        cookie_urls = loadcookie.getCookie_urls();
                    }
                }
                fetchSignInCookiesActivity.P = cookie_urls;
                ArrayList arrayList = this.f89459b.P;
                if (arrayList != null && (arrayList.isEmpty() ^ true)) {
                    ArrayList arrayList2 = this.f89459b.P;
                    if (arrayList2 != null) {
                        FetchSignInCookiesActivity fetchSignInCookiesActivity2 = this.f89459b;
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            com.max.xiaoheihe.utils.d.k(((BaseActivity) fetchSignInCookiesActivity2).f66601b, (String) it.next());
                        }
                    }
                } else {
                    com.max.xiaoheihe.utils.d.k(((BaseActivity) this.f89459b).f66601b, url);
                }
                int i10 = a.f89460a[proxyType.ordinal()];
                if (i10 == 2) {
                    FetchSignInCookiesActivity.O1(this.f89459b, url, map);
                    return;
                }
                if (i10 != 3) {
                    FetchSignInCookiesActivity.M1(this.f89459b, url);
                    return;
                }
                FetchSignInCookiesActivity fetchSignInCookiesActivity3 = this.f89459b;
                SteamWalletJsObj steamWalletJsObj3 = fetchSignInCookiesActivity3.L;
                if (steamWalletJsObj3 != null && (steam_proxy = steamWalletJsObj3.getSteam_proxy()) != null) {
                    proxy = steam_proxy.getProxy();
                }
                f0.m(proxy);
                FetchSignInCookiesActivity.N1(fetchSignInCookiesActivity3, url, proxy);
            }

            /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.q
            public /* bridge */ /* synthetic */ b2 invoke(ProxyType proxyType, String str, HashMap<String, String> map) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{proxyType, str, map}, this, changeQuickRedirect, false, 39901, new Class[]{Object.class, Object.class, Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(proxyType, str, map);
                return b2.f124493a;
            }
        });
    }

    private final void showLoadingDialog() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39866, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CoffeeDialogProgressObj("", "1", null));
        com.max.xiaoheihe.view.l.A(new CoffeeDialogDataObj("正在获取Steam账号状态，请耐心等待", arrayList, "1", null, null, false, null, null));
    }

    private final void u2() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39871, new Class[0], Void.TYPE).isSupported && isActive()) {
            f2 f2Var = null;
            if (f0.g("pending", this.N)) {
                f2 f2Var2 = this.Q;
                if (f2Var2 == null) {
                    f0.S("binding");
                } else {
                    f2Var = f2Var2;
                }
                f2Var.f110376c.setText(getString(R.string.login_expire));
                return;
            }
            if (f0.g("logged", this.N)) {
                f2 f2Var3 = this.Q;
                if (f2Var3 == null) {
                    f0.S("binding");
                } else {
                    f2Var = f2Var3;
                }
                f2Var.f110376c.setText(getString(R.string.login_success));
                return;
            }
            if (f0.g("need_login", this.N)) {
                f2 f2Var4 = this.Q;
                if (f2Var4 == null) {
                    f0.S("binding");
                } else {
                    f2Var = f2Var4;
                }
                f2Var.f110376c.setText(getString(R.string.login_expire));
            }
        }
    }

    private final void v2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39868, new Class[0], Void.TYPE).isSupported || this.f66601b.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f66601b).y(getString(R.string.parental_notice_tips_title)).l(getString(R.string.parental_notice_tips_desc)).t(R.string.confirm, c.f89451b).F();
    }

    private final void x2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 39869, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(this.f66601b);
        fVar.y("获取Steam账号状态失败").l(str).u("我知道了", new d());
        fVar.F();
    }

    @SuppressLint({"AutoDispose"})
    private final void y2() {
        z<Result> zVarV8;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39870, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MallSteamInfoUploadObj mallSteamInfoUploadObj = new MallSteamInfoUploadObj();
        mallSteamInfoUploadObj.setHeader(this.M);
        PostEncryptParamsObj postEncryptParamsObjV0 = com.max.xiaoheihe.utils.d.v0(com.max.hbutils.utils.k.q(mallSteamInfoUploadObj), true);
        SteamWalletJsObj steamWalletJsObj = this.L;
        if (steamWalletJsObj != null && steamWalletJsObj.isGameDlc()) {
            zVarV8 = com.max.xiaoheihe.network.i.a().ha(postEncryptParamsObjV0.getData(), postEncryptParamsObjV0.getKey(), postEncryptParamsObjV0.getSid(), postEncryptParamsObjV0.getTime());
            f0.o(zVarV8, "{\n            ServiceGen…              )\n        }");
        } else {
            SteamWalletJsObj steamWalletJsObj2 = this.L;
            if (steamWalletJsObj2 != null && steamWalletJsObj2.isCheckAccount()) {
                zVarV8 = com.max.xiaoheihe.network.i.a().a9(postEncryptParamsObjV0.getData(), postEncryptParamsObjV0.getKey(), postEncryptParamsObjV0.getSid(), postEncryptParamsObjV0.getTime());
                f0.o(zVarV8, "{\n            ServiceGen…              )\n        }");
            } else {
                SteamWalletJsObj steamWalletJsObj3 = this.L;
                if (steamWalletJsObj3 != null && steamWalletJsObj3.isSteamBalance()) {
                    z10 = true;
                }
                if (z10) {
                    com.max.heybox.hblog.g.f74531b.M("[余额交易]上报余额交易cookie");
                    zVarV8 = com.max.xiaoheihe.network.i.a().z5(postEncryptParamsObjV0.getData(), postEncryptParamsObjV0.getKey(), postEncryptParamsObjV0.getSid(), postEncryptParamsObjV0.getTime());
                    f0.o(zVarV8, "{\n            HBLogger.i…              )\n        }");
                } else {
                    zVarV8 = com.max.xiaoheihe.network.i.a().V8(postEncryptParamsObjV0.getData(), postEncryptParamsObjV0.getKey(), postEncryptParamsObjV0.getSid(), postEncryptParamsObjV0.getTime());
                    f0.o(zVarV8, "{\n            ServiceGen…              )\n        }");
                }
            }
        }
        V((io.reactivex.disposables.b) zVarV8.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39865, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        f2 f2VarC = f2.c(LayoutInflater.from(this));
        f0.o(f2VarC, "inflate(LayoutInflater.from(this))");
        this.Q = f2VarC;
        if (f2VarC == null) {
            f0.S("binding");
            f2VarC = null;
        }
        setContentView(f2VarC.b());
        q2();
        r2();
    }
}
