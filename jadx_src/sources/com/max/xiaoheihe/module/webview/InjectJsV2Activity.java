package com.max.xiaoheihe.module.webview;

import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.max.xiaoheihe.bean.game.SteamAcceptGameParams;
import com.max.xiaoheihe.bean.game.steamproxy.BaseProxyParamObj;
import com.max.xiaoheihe.bean.game.steamproxy.SteamHttpProxyObj;
import com.max.xiaoheihe.bean.mall.cart.MallOrderNotifyObj;
import com.max.xiaoheihe.bean.proxy.ProxyItemObj;
import com.max.xiaoheihe.bean.webintercept.IpDirectObj;
import com.max.xiaoheihe.bean.webintercept.TagJsObj;
import com.max.xiaoheihe.module.mall.cart.MallCartUtils;
import com.max.xiaoheihe.module.proxy.ProxyManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.jvm.internal.w0;
import kotlin.text.Regex;

/* JADX INFO: compiled from: InjectJsV2Activity.kt */
/* JADX INFO: loaded from: classes12.dex */
@kotlin.jvm.internal.t0({"SMAP\nInjectJsV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InjectJsV2Activity.kt\ncom/max/xiaoheihe/module/webview/InjectJsV2Activity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,180:1\n1855#2,2:181\n1855#2,2:183\n*S KotlinDebug\n*F\n+ 1 InjectJsV2Activity.kt\ncom/max/xiaoheihe/module/webview/InjectJsV2Activity\n*L\n116#1:181,2\n161#1:183,2\n*E\n"})
@ig.d(interceptors = {com.max.xiaoheihe.router.interceptors.h.class}, path = {lb.d.N5})
@androidx.compose.runtime.internal.o(parameters = 0)
@com.max.hbcommon.base.hblifeevent.activity.b(lifeEvents = {com.max.xiaoheihe.module.proxy.a.class})
public final class InjectJsV2Activity extends WebActionActivity {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    @dl.e
    private BaseProxyParamObj f94209q4;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    @dl.e
    private ProxyItemObj f94210r4;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    @dl.e
    private String f94211s4;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    private boolean f94212t4;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    @dl.d
    private final HashSet<String> f94213u4 = new HashSet<>();

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    @dl.d
    public static final a f94204v4 = new a(null);

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    public static final int f94205w4 = 8;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    @dl.d
    private static final String f94206x4 = "key";

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    @dl.d
    private static final String f94207y4 = "params";

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    @dl.d
    private static final String f94208z4 = "proxy_params";

    @dl.d
    private static final String A4 = "proxy_item";

    /* JADX INFO: compiled from: InjectJsV2Activity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46903, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : InjectJsV2Activity.f94206x4;
        }

        @dl.d
        public final String b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46904, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : InjectJsV2Activity.f94207y4;
        }

        @dl.d
        public final String c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46906, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : InjectJsV2Activity.A4;
        }

        @dl.d
        public final String d() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46905, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : InjectJsV2Activity.f94208z4;
        }
    }

    /* JADX INFO: compiled from: InjectJsV2Activity.kt */
    public static final class b implements com.max.xiaoheihe.module.account.utils.l.l0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.xiaoheihe.module.account.utils.l.l0
        public final void a(Map<String, Object> map, String str) {
            if (PatchProxy.proxy(new Object[]{map, str}, this, changeQuickRedirect, false, 46911, new Class[]{Map.class, String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(str)) {
                return;
            }
            try {
                InjectJsV2Activity.this.f94212t4 = com.max.hbcommon.utils.c.x((String) map.get(WebviewFragment.O4));
            } catch (Throwable th2) {
                Log.e(WebviewFragment.O4, "error: " + th2.getMessage());
            }
            InjectJsV2Activity.this.N2().d7(map, str);
        }
    }

    public static final /* synthetic */ void U3(InjectJsV2Activity injectJsV2Activity) {
        if (PatchProxy.proxy(new Object[]{injectJsV2Activity}, null, changeQuickRedirect, true, 46901, new Class[]{InjectJsV2Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        injectJsV2Activity.initViews();
    }

    public static final /* synthetic */ void W3(InjectJsV2Activity injectJsV2Activity) {
        if (PatchProxy.proxy(new Object[]{injectJsV2Activity}, null, changeQuickRedirect, true, 46902, new Class[]{InjectJsV2Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        injectJsV2Activity.x1();
    }

    private final void X3(String str, boolean z10) {
        BaseProxyParamObj baseProxyParamObj;
        ArrayList<SteamAcceptGameParams> injectJS;
        if (PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 46898, new Class[]{String.class, Boolean.TYPE}, Void.TYPE).isSupported || (baseProxyParamObj = this.f94209q4) == null || (injectJS = baseProxyParamObj.getInjectJS()) == null) {
            return;
        }
        for (SteamAcceptGameParams steamAcceptGameParams : injectJS) {
            if (steamAcceptGameParams != null) {
                String regular = steamAcceptGameParams.getRegular();
                kotlin.jvm.internal.f0.o(regular, "it.regular");
                if (new Regex(regular).k(str) && z10 == com.max.hbcommon.utils.c.x(steamAcceptGameParams.getInject_js_on_ready())) {
                    String strV = com.max.xiaoheihe.utils.d.v(this.f94212t4 ? steamAcceptGameParams.getR_js() : steamAcceptGameParams.getJs());
                    com.max.heybox.hblog.g.f74531b.M("[InjectJS] js: " + strV);
                    N2().H6(strV, null);
                }
            }
        }
    }

    private final void Y3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46892, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.account.utils.l.g0(this.f66601b, this.f94209q4, new b());
    }

    private final void Z3() {
        ProxyItemObj proxyItemObj;
        SteamHttpProxyObj steam_proxy;
        SteamHttpProxyObj steam_proxy2;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46893, new Class[0], Void.TYPE).isSupported || (proxyItemObj = this.f94210r4) == null) {
            return;
        }
        String url = proxyItemObj.getUrl();
        if (com.max.hbcommon.utils.c.u(url)) {
            return;
        }
        this.f94212t4 = kotlin.jvm.internal.f0.g(proxyItemObj.getKey(), ProxyManager.ProxyType.r_proxy.getKey()) || kotlin.jvm.internal.f0.g(proxyItemObj.getKey(), ProxyManager.ProxyType.web_proxy.getKey());
        HashMap map = new HashMap();
        if (kotlin.jvm.internal.f0.g(proxyItemObj.getKey(), ProxyManager.ProxyType.ip_direct.getKey())) {
            map.put("hosts", proxyItemObj.getFilter_hosts());
            BaseProxyParamObj baseProxyParamObj = this.f94209q4;
            ArrayList<TagJsObj> js_list = null;
            map.put(WebviewFragment.K4, (baseProxyParamObj == null || (steam_proxy2 = baseProxyParamObj.getSteam_proxy()) == null) ? null : steam_proxy2.getJs_list());
            HashMap<String, String> filter_hosts = proxyItemObj.getFilter_hosts();
            BaseProxyParamObj baseProxyParamObj2 = this.f94209q4;
            if (baseProxyParamObj2 != null && (steam_proxy = baseProxyParamObj2.getSteam_proxy()) != null) {
                js_list = steam_proxy.getJs_list();
            }
            map.put(WebviewFragment.I4, new IpDirectObj(filter_hosts, js_list));
        }
        N2().d7(map, url);
    }

    private final void a4(MallOrderNotifyObj mallOrderNotifyObj) {
        if (PatchProxy.proxy(new Object[]{mallOrderNotifyObj}, this, changeQuickRedirect, false, 46899, new Class[]{MallOrderNotifyObj.class}, Void.TYPE).isSupported) {
            return;
        }
        MallCartUtils.f90196a.s(this.P3.mMessageView, mallOrderNotifyObj);
    }

    private final void b4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 46900, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        MallCartUtils.f90196a.t(this.P3.mMessageView, str);
    }

    private final void initViews() {
        BaseProxyParamObj baseProxyParamObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46891, new Class[0], Void.TYPE).isSupported || (baseProxyParamObj = this.f94209q4) == null) {
            return;
        }
        String msg = baseProxyParamObj.getMsg();
        if (msg != null) {
            b4(msg);
        }
        if (this.f94210r4 != null) {
            Z3();
        } else {
            Y3();
        }
    }

    @Override // com.max.xiaoheihe.module.webview.WebActionActivity
    @dl.e
    public WebResourceResponse L3(@dl.e WebView webView, @dl.e WebResourceRequest webResourceRequest) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webView, webResourceRequest}, this, changeQuickRedirect, false, 46894, new Class[]{WebView.class, WebResourceRequest.class}, WebResourceResponse.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebResourceResponse) patchProxyResultProxy.result;
        }
        BaseProxyParamObj baseProxyParamObj = this.f94209q4;
        if (baseProxyParamObj == null) {
            return null;
        }
        kotlin.jvm.internal.f0.m(baseProxyParamObj);
        if (com.max.hbcommon.utils.c.x(baseProxyParamObj.getSwitch_bind_nonacc())) {
            return x.c().f(webView, webResourceRequest);
        }
        return null;
    }

    @Override // com.max.xiaoheihe.module.webview.WebActionActivity
    public void M3(@dl.e WebView webView, @dl.e String str) {
        String str2;
        if (PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 46896, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported || (str2 = this.f94211s4) == null || !kotlin.jvm.internal.f0.g(str2, str) || str == null) {
            return;
        }
        X3(str, true);
    }

    @Override // com.max.xiaoheihe.module.webview.WebActionActivity
    public void N3(@dl.e WebView webView, @dl.e String str, int i10, int i11) {
    }

    @Override // com.max.xiaoheihe.module.webview.WebActionActivity
    public void O3(@dl.e WebView webView, @dl.e String str, int i10, int i11) {
        ArrayList<SteamAcceptGameParams> injectJS;
        String regular;
        Object[] objArr = {webView, str, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 46895, new Class[]{WebView.class, String.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f94211s4 = str;
        w0.a(this.f94213u4).remove(str);
        BaseProxyParamObj baseProxyParamObj = this.f94209q4;
        if (baseProxyParamObj == null || (injectJS = baseProxyParamObj.getInjectJS()) == null) {
            return;
        }
        for (SteamAcceptGameParams steamAcceptGameParams : injectJS) {
            if (steamAcceptGameParams != null && (regular = steamAcceptGameParams.getRegular()) != null) {
                if (str != null && new Regex(regular).k(str)) {
                    if (steamAcceptGameParams.getNoti_msg() != null) {
                        MallOrderNotifyObj noti_msg = steamAcceptGameParams.getNoti_msg();
                        kotlin.jvm.internal.f0.o(noti_msg, "item.noti_msg");
                        a4(noti_msg);
                    } else if (steamAcceptGameParams.getMsg() != null) {
                        String msg = steamAcceptGameParams.getMsg();
                        kotlin.jvm.internal.f0.o(msg, "item.msg");
                        b4(msg);
                    }
                }
            }
        }
    }

    @Override // com.max.xiaoheihe.module.webview.WebActionActivity
    public void P3(@dl.e WebView webView, int i10) {
        String url;
        if (PatchProxy.proxy(new Object[]{webView, new Integer(i10)}, this, changeQuickRedirect, false, 46897, new Class[]{WebView.class, Integer.TYPE}, Void.TYPE).isSupported || webView == null || (url = webView.getUrl()) == null || i10 < 90 || this.f94213u4.contains(url)) {
            return;
        }
        com.max.heybox.hblog.g.f74531b.M("[InjectJSV2] onProgressChanged url: " + url);
        this.f94213u4.add(url);
        X3(url, false);
    }

    @Override // com.max.xiaoheihe.module.webview.WebActionActivity, com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46890, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.k1();
        this.f94209q4 = (BaseProxyParamObj) getIntent().getSerializableExtra(f94208z4);
        this.f94210r4 = (ProxyItemObj) getIntent().getSerializableExtra(A4);
        E1();
        kotlinx.coroutines.k.f(androidx.lifecycle.z.a(this), null, null, new InjectJsV2Activity$installViews$1(this, null), 3, null);
    }
}
