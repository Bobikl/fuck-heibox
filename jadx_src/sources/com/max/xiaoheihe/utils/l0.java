package com.max.xiaoheihe.utils;

import android.app.Activity;
import android.app.Dialog;
import android.app.DownloadManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.DatePicker;
import android.widget.TimePicker;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import anet.channel.util.HttpConstant;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.max.basebbs.bean.BBSLinkRecObj;
import com.max.basebbs.utils.AccelWorldBBSKt;
import com.max.hbcommon.bean.PostEncryptParamsObj;
import com.max.hbcommon.bean.RequestTagMapObj;
import com.max.hbshare.bean.HBShareData;
import com.max.hbshare.bean.HBShareProtocolData;
import com.max.hbshare.bean.PostOptionObj;
import com.max.hbshare.bean.ProtocolPostOptionObj;
import com.max.hbutils.bean.Result;
import com.max.security.SecurityTool;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.RouterActivity;
import com.max.xiaoheihe.accelworld.AccelWorldLottieKt;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.NavBarCfgObj;
import com.max.xiaoheihe.bean.StatusBarCfgObj;
import com.max.xiaoheihe.bean.WebCfgObj;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.PostInfoObj;
import com.max.xiaoheihe.bean.bbs.WikiEntryObj;
import com.max.xiaoheihe.bean.game.GameListHeaderObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.max.xiaoheihe.module.bbs.post.PostPageFactory;
import com.max.xiaoheihe.module.bbs.post.PostPageParam;
import com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment;
import com.max.xiaoheihe.module.bbs.post_edit.PostTabActivity;
import com.max.xiaoheihe.module.game.GameCompilationDetailActivity;
import com.max.xiaoheihe.module.game.GameWikiActivity;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import com.max.xiaoheihe.module.littleprogram.fragment.GameWikiFragment;
import com.max.xiaoheihe.module.mall.MallProductDetailActivity;
import com.max.xiaoheihe.module.miniprogram.MiniProgramHostActivity;
import com.max.xiaoheihe.module.webview.JsCoreManager;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.max.xiaoheihe.module.webview.t0;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.max.xiaoheihe.router.protocol.HeyboxWebProtocolHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.media.UMImage;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: compiled from: WebUtils.java */
/* JADX INFO: loaded from: classes13.dex */
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f95686a = "99928032";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static HeyboxWebProtocolHandler f95687b = new HeyboxWebProtocolHandler();
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: WebUtils.java */
    public class a extends TypeToken<Map<String, Object>> {
        a() {
        }
    }

    /* JADX INFO: compiled from: WebUtils.java */
    public class b extends com.max.hbcommon.network.l<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f95688b;

        b(j jVar) {
            this.f95688b = jVar;
        }

        @Override // com.max.hbcommon.network.l, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 49059, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
            j jVar = this.f95688b;
            if (jVar != null) {
                jVar.onError(th2);
            }
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 49060, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(result);
            j jVar = this.f95688b;
            if (jVar != null) {
                jVar.a(result);
            }
        }

        @Override // com.max.hbcommon.network.l, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 49061, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    /* JADX INFO: compiled from: WebUtils.java */
    public class c implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebView f95689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f95690c;

        c(WebView webView, String str) {
            this.f95689b = webView;
            this.f95690c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49062, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f95689b.evaluateJavascript(this.f95690c, null);
        }
    }

    /* JADX INFO: compiled from: WebUtils.java */
    public class d implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebviewFragment f95691b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f95692c;

        d(WebviewFragment webviewFragment, String str) {
            this.f95691b = webviewFragment;
            this.f95692c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49063, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            this.f95691b.H6(this.f95692c, null);
        }
    }

    /* JADX INFO: compiled from: WebUtils.java */
    public class e extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f95693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WebView f95694c;

        e(String str, WebView webView) {
            this.f95693b = str;
            this.f95694c = webView;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            WebView webView;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49064, new Class[0], Void.TYPE).isSupported || !GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING.equalsIgnoreCase(this.f95693b) || (webView = this.f95694c) == null) {
                return;
            }
            webView.loadUrl("javascript:subscribeSuccessCallback()");
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            WebView webView;
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 49065, new Class[]{Throwable.class}, Void.TYPE).isSupported || (webView = this.f95694c) == null) {
                return;
            }
            webView.loadUrl("javascript:subscribeFailedCallback()");
        }
    }

    /* JADX INFO: compiled from: WebUtils.java */
    public class f implements com.max.xiaoheihe.view.m {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f95695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f95696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f95697c;

        f(Context context, String str, String str2) {
            this.f95695a = context;
            this.f95696b = str;
            this.f95697c = str2;
        }

        @Override // com.max.xiaoheihe.view.m
        public void a(Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 49067, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            dialog.dismiss();
            l0.v0(this.f95695a, this.f95696b, this.f95697c);
        }

        @Override // com.max.xiaoheihe.view.m
        public void b(Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 49066, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            dialog.dismiss();
        }
    }

    /* JADX INFO: compiled from: WebUtils.java */
    public interface g {
        void a();
    }

    /* JADX INFO: compiled from: WebUtils.java */
    public interface h<T> {
        void a(T t10);

        void b(T t10);
    }

    /* JADX INFO: compiled from: WebUtils.java */
    public interface i {
        void a(String str);

        boolean b();
    }

    /* JADX INFO: compiled from: WebUtils.java */
    public interface j {
        void a(Result result);

        void b();

        void onError(Throwable th2);
    }

    public static WebProtocolObj A(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        Object[] objArr = {str, str2, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0), new Byte(z13 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 49011, new Class[]{String.class, String.class, cls, cls, cls, cls}, WebProtocolObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebProtocolObj) patchProxyResultProxy.result;
        }
        WebProtocolObj webProtocolObj = new WebProtocolObj();
        WebCfgObj webCfgObj = new WebCfgObj();
        HashMap map = new HashMap();
        NavBarCfgObj navBarCfgObj = new NavBarCfgObj();
        webCfgObj.setUrl(str);
        webCfgObj.setRefresh(z10);
        webProtocolObj.setFull_screen(z11);
        webProtocolObj.setProtocol_type("openWindow");
        map.put("protocol_type", "openWindow");
        map.put(WebviewFragment.D4, z11 ? "true" : "false");
        if (z13) {
            map.put(ob.b.f132259k, "1");
        }
        if (z12) {
            StatusBarCfgObj statusBarCfgObj = new StatusBarCfgObj();
            statusBarCfgObj.setStyle(AccelWorldLottieKt.f76443a);
            webProtocolObj.setStatus_bar(statusBarCfgObj);
        }
        navBarCfgObj.setTitle(str2);
        map.put("navigation_bar", new Gson().toJson(navBarCfgObj));
        webProtocolObj.setWebview(webCfgObj);
        webProtocolObj.setKvPair(map);
        return webProtocolObj;
    }

    public static BBSLinkRecObj A0(BBSLinkObj bBSLinkObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSLinkObj}, null, changeQuickRedirect, true, 49001, new Class[]{BBSLinkObj.class}, BBSLinkRecObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BBSLinkRecObj) patchProxyResultProxy.result;
        }
        BBSLinkRecObj bBSLinkRecObj = new BBSLinkRecObj();
        bBSLinkRecObj.setFrom(bBSLinkObj.getFrom());
        bBSLinkRecObj.setAl(bBSLinkObj.getAl());
        bBSLinkRecObj.setIndex(bBSLinkObj.getIndex());
        bBSLinkRecObj.setPage_tab(bBSLinkObj.getPage_tab());
        bBSLinkRecObj.setRec_mark(bBSLinkObj.getRec_mark());
        bBSLinkRecObj.setRecTags(bBSLinkObj.getRecTags());
        bBSLinkRecObj.setImpressionID(bBSLinkObj.getImpressionID());
        bBSLinkRecObj.setSessionID(bBSLinkObj.getSessionID());
        bBSLinkRecObj.setPos(bBSLinkObj.getPos());
        bBSLinkRecObj.setNewsid(bBSLinkObj.getNewsid());
        return bBSLinkRecObj;
    }

    public static ArrayList<String> B(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 49005, new Class[]{String.class}, ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        int iIndexOf = str.indexOf("#/");
        if (iIndexOf == -1) {
            return arrayList;
        }
        while (true) {
            int i10 = iIndexOf + 2;
            int iIndexOf2 = str.indexOf("#/", i10);
            if (iIndexOf2 == -1) {
                return arrayList;
            }
            arrayList.add(str.substring(i10, iIndexOf2));
            iIndexOf = iIndexOf2;
        }
    }

    public static String C(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48994, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            return null;
        }
        try {
            return Uri.parse(str).getPath();
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static String D() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 49033, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : "heybox".replaceAll("hey", "clien").replaceAll("box", "t_type");
    }

    public static Map<String, String> E(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 49051, new Class[]{String.class}, Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        HashMap map = new HashMap();
        int iIndexOf = str.indexOf(63);
        if (iIndexOf != -1) {
            String[] strArrSplit = str.substring(iIndexOf + 1).split("&");
            for (String str2 : strArrSplit) {
                int iIndexOf2 = str2.indexOf(61);
                if (iIndexOf2 != -1) {
                    map.put(str2.substring(0, iIndexOf2), str2.substring(iIndexOf2 + 1));
                }
            }
        }
        return map;
    }

    public static String F() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 49036, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : "heybox".replaceAll("hey", "os_ve").replaceAll("box", "rsion");
    }

    public static String G() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 49039, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : "heybox".replaceAll("hey", "bu").replaceAll("box", "ild");
    }

    public static String H() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 49042, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : "heybox".replaceAll("hey", "chan").replaceAll("box", "nel");
    }

    public static String I() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 49030, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : "heybox".replaceAll(RXScreenCaptureService.KEY_HEIGHT, "im").replaceAll("ybox", "i");
    }

    public static String J() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 49046, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : "heybox".replaceAll("hey", "devi").replaceAll("box", "ce_info");
    }

    public static String K() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 49047, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : "heybox".replaceAll("hey", "netm").replaceAll("box", "ode");
    }

    public static String L() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 49041, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : "heybox".replaceAll("hey", "non").replaceAll("box", "ce");
    }

    public static String M() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 49045, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : "hey".replaceAll(RXScreenCaptureService.KEY_HEIGHT, "pk");
    }

    public static String N() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 49043, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : "hey".replaceAll("e", "ke");
    }

    public static String O() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 49040, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : "heybox".replaceAll("hey", "_t").replaceAll("box", "ime");
    }

    public static String P() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 49038, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : "heybox".replaceAll("hey", "time_").replaceAll("box", "zone");
    }

    public static String Q() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 49031, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : "heybox".replaceAll("hey", "os_t").replaceAll("box", "ype");
    }

    public static String R() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 49037, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : "heybox".replaceAll("hey", "ve").replaceAll("box", "rsion");
    }

    public static String S() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 49044, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : "heybox".replaceAll("hey", "d").replaceAll("box", RXScreenCaptureService.KEY_WIDTH);
    }

    public static String T(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 48988, new Class[]{String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            return null;
        }
        try {
            return Uri.parse(str).getQueryParameter(str2);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static String U() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 49035, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : "heybox".replaceAll("hey", "x_a").replaceAll("box", "pp");
    }

    public static String V() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 49034, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : "heybox".replaceAll("hey", "x_clien").replaceAll("box", "t_type");
    }

    public static String W() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 49032, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : "heybox".replaceAll("hey", "x_os_t").replaceAll("box", "ype");
    }

    public static Map<String, String> X(BBSLinkRecObj bBSLinkRecObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSLinkRecObj}, null, changeQuickRedirect, true, 49000, new Class[]{BBSLinkRecObj.class}, Map.class);
        return patchProxyResultProxy.isSupported ? (Map) patchProxyResultProxy.result : AccelWorldBBSKt.g(bBSLinkRecObj);
    }

    public static Map<String, String> Y(BBSLinkObj bBSLinkObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSLinkObj}, null, changeQuickRedirect, true, 48999, new Class[]{BBSLinkObj.class}, Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        HashMap<String, String> mapH = bBSLinkObj != null ? AccelWorldBBSKt.h(bBSLinkObj.getFrom(), bBSLinkObj.getAl(), bBSLinkObj.getIndex(), bBSLinkObj.getPage_tab(), bBSLinkObj.getRec_mark(), bBSLinkObj.getRecTags(), bBSLinkObj.getImpressionID(), bBSLinkObj.getSessionID(), bBSLinkObj.getPos(), bBSLinkObj.getNewsid()) : null;
        return mapH == null ? new HashMap(16) : mapH;
    }

    public static String Z(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48992, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            return null;
        }
        try {
            return Uri.parse(str).getScheme();
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static HBShareProtocolData a0(WebProtocolObj webProtocolObj) {
        ArrayList arrayList;
        Bundle bundle;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webProtocolObj}, null, changeQuickRedirect, true, 49055, new Class[]{WebProtocolObj.class}, HBShareProtocolData.class);
        if (patchProxyResultProxy.isSupported) {
            return (HBShareProtocolData) patchProxyResultProxy.result;
        }
        if (webProtocolObj == null) {
            return null;
        }
        HBShareProtocolData hBShareProtocolData = new HBShareProtocolData();
        String strI = i(webProtocolObj.valueOf("title"), "utf-8");
        String strI2 = i(webProtocolObj.valueOf(SocialConstants.PARAM_APP_DESC), "utf-8");
        String strI3 = i(webProtocolObj.valueOf("share_url"), "utf-8");
        String strI4 = i(webProtocolObj.valueOf("img_url"), "utf-8");
        String strI5 = i(webProtocolObj.valueOf("share_type"), "utf-8");
        String strI6 = i(webProtocolObj.valueOf(PostTabActivity.J3), "utf-8");
        String strI7 = i(webProtocolObj.valueOf("act_id"), "utf-8");
        String strI8 = i(webProtocolObj.valueOf(com.max.hbsearch.l.W), "utf-8");
        String strI9 = i(webProtocolObj.valueOf(NewLinkEditFragment.f82063f5), "utf-8");
        String strI10 = i(webProtocolObj.valueOf("custom_buttons"), "utf-8");
        JsonObject jsonObject = !com.max.hbcommon.utils.c.u(strI6) ? (JsonObject) com.max.hbutils.utils.k.a(strI6, JsonObject.class) : null;
        if (jsonObject != null) {
            String strE = com.max.hbutils.utils.k.e(strI6, "act_id");
            if (com.max.hbcommon.utils.c.u(strE)) {
                jsonObject.addProperty("act_id", strI7);
            } else {
                strI7 = strE;
            }
        } else if (!com.max.hbcommon.utils.c.u(strI7)) {
            jsonObject = new JsonObject();
            jsonObject.addProperty("act_id", strI7);
        }
        if (com.max.hbcommon.utils.c.u(strI9)) {
            arrayList = null;
        } else {
            PostInfoObj postInfoObj = (PostInfoObj) com.max.hbutils.utils.k.a(strI9, PostInfoObj.class);
            arrayList = new ArrayList();
            PostOptionObj postOptionObj = new PostOptionObj();
            arrayList.add(postOptionObj);
            BBSTopicObj topic_info = postInfoObj.getTopic_info();
            if (topic_info != null) {
                postOptionObj.setName(topic_info.getName());
                postOptionObj.setImage_url(topic_info.getPic_url());
            } else {
                postOptionObj.setName(com.max.xiaoheihe.utils.d.n0(R.string.post));
                postOptionObj.setImage_resource_id(R.drawable.bbs_share_button_post_46x46);
            }
            postOptionObj.setProtocol(postInfoObj.getProtocol());
        }
        if (com.max.hbcommon.utils.c.u(strI10)) {
            bundle = null;
        } else {
            bundle = new Bundle();
            r0(strI10, bundle);
        }
        hBShareProtocolData.setTitle(strI);
        hBShareProtocolData.setDesc(strI2);
        hBShareProtocolData.setShare_url(strI3);
        hBShareProtocolData.setImg_url(strI4);
        hBShareProtocolData.setShare_platform(strI5);
        hBShareProtocolData.setAct_id(strI7);
        hBShareProtocolData.setReport_extra(jsonObject);
        hBShareProtocolData.setSrc(strI8);
        hBShareProtocolData.setExtraShareActionList(arrayList);
        hBShareProtocolData.setExtraOpts(bundle);
        com.max.heybox.hblog.g.W("getShareDataFromProtocol webProtocol: " + com.max.hbutils.utils.k.p(webProtocolObj) + "  hbShareProtocolData: " + com.max.hbutils.utils.k.p(hBShareProtocolData));
        return hBShareProtocolData;
    }

    public static String b0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 49054, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            return new WebView(HeyBoxApplication.C()).getSettings().getUserAgentString();
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static String c(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 49053, new Class[]{Context.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (str == null) {
            return null;
        }
        CookieSyncManager.createInstance(context);
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        String strS = s(str);
        if (com.max.hbcommon.network.b.g().p(C(str))) {
            if (lb.a.f130943c1.equals(strS)) {
                str = str.replaceFirst(lb.a.f130943c1, lb.a.f131033r1);
            } else if (lb.a.f130991k1.equals(strS)) {
                str = str.replaceFirst(lb.a.f130991k1, lb.a.f131033r1);
            }
            strS = lb.a.f131033r1;
        }
        String[] strArrSplit = strS.split("\\.");
        int length = strArrSplit.length;
        String str2 = "." + strArrSplit[length - 2] + "." + strArrSplit[length - 1];
        cookieManager.setCookie(strS, "pkey=; Expires=Wed, 31 Dec 2000 23:59:59 GMT; Max-Age=0;");
        cookieManager.setCookie(strS, "x_pkey=; Expires=Wed, 31 Dec 2000 23:59:59 GMT; Max-Age=0;");
        cookieManager.setCookie(strS, "x_heybox_id=; Expires=Wed, 31 Dec 2000 23:59:59 GMT; Max-Age=0;");
        cookieManager.setCookie(strS, "x_xhh_tokenid=; Expires=Wed, 31 Dec 2000 23:59:59 GMT; Max-Age=0;");
        if (!com.max.hbcommon.utils.c.u(i0.o().getPkey())) {
            cookieManager.setCookie(str2, "pkey=" + i0.o().getPkey() + ";HTTPOnly");
            cookieManager.setCookie(str2, "x_pkey=" + i0.o().getPkey() + ";HTTPOnly");
            cookieManager.setCookie(str2, "x_heybox_id=" + i0.o().getAccount_detail().getUserid() + ";HTTPOnly");
        }
        if (!com.max.hbcommon.utils.c.u(com.max.xiaoheihe.utils.h.f())) {
            cookieManager.setCookie(str2, "x_xhh_tokenid=" + com.max.xiaoheihe.utils.h.f() + ";HTTPOnly");
        }
        CookieSyncManager.getInstance().sync();
        return str;
    }

    public static Intent c0(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 49025, new Class[]{Context.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : d0(context, false);
    }

    public static void d(WebSettings webSettings, String str) {
    }

    public static Intent d0(Context context, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 49026, new Class[]{Context.class, Boolean.TYPE}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        return z10 ? MiniProgramHostActivity.j4(context, null) : new Intent(context, (Class<?>) WebActionActivity.class);
    }

    public static String e(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48997, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            return str;
        }
        String strZ = Z(str);
        String strS = s(str);
        String strC = C(str);
        if (!"file".equals(strZ) && !t0.f(str)) {
            return str;
        }
        if (com.max.hbcommon.network.b.g().p(strC)) {
            if (lb.a.f130943c1.equals(strS)) {
                str = str.replaceFirst(lb.a.f130943c1, lb.a.f131033r1);
            } else if (lb.a.f130991k1.equals(strS)) {
                str = str.replaceFirst(lb.a.f130991k1, lb.a.f131033r1);
            }
        }
        String str2 = (System.currentTimeMillis() / 1000) + "";
        if (com.max.hbcommon.utils.c.x(com.max.hbcache.c.j(com.max.hbcache.c.G0))) {
            HashMap map = new HashMap(16);
            map.put("is_limitted_visitor", "1");
            map.put(J(), Build.MODEL);
            map.put(Q(), "Android");
            map.put(F(), Build.VERSION.RELEASE.trim());
            map.put(W(), "Android");
            map.put(V(), "mobile");
            map.put(U(), g0());
            map.put(R(), com.max.xiaoheihe.utils.d.x0());
            map.put(G(), com.max.xiaoheihe.a.f76430g);
            map.put(O(), str2);
            map.put(H(), com.max.xiaoheihe.utils.d.t0());
            return f(str, map);
        }
        if (strC.contains("heybox/ad/redirect")) {
            String strX0 = com.max.xiaoheihe.utils.d.x0();
            String str3 = com.max.xiaoheihe.utils.h.f95395c;
            String strReplaceAll = str.replaceAll("__version__", strX0).replaceAll("__os_type__", "Android").replaceAll("__os_version__", Build.VERSION.RELEASE.trim()).replaceAll("__android_id__", com.max.xiaoheihe.utils.d.U());
            return !com.max.hbcommon.utils.c.u(str3) ? strReplaceAll.replaceAll("__oaid__", str3).replaceAll("__oaid_m__", com.max.xiaoheihe.utils.d.a1(str3)) : strReplaceAll;
        }
        HashMap map2 = new HashMap(16);
        User userO = i0.o();
        Log.d("HBSecurity", "\n\n\n************ WebUtils *************\n\n");
        String vd2 = SecurityTool.getVD(HeyBoxApplication.C(), SecurityTool.getVX(HeyBoxApplication.C(), "PAENEHAMGACOBHIEMIHIJLKJPMMHJMMQABCNGBPPENCENP"), str2, i0.j());
        map2.put("heybox_id", userO.isLoginFlag() ? userO.getAccount_detail().getUserid() : "-1");
        if ("1".equals(com.max.hbcache.c.j(lb.a.f130931a1))) {
            map2.put(I(), com.max.xiaoheihe.utils.d.U());
        }
        map2.put(J(), Build.MODEL);
        map2.put(Q(), "Android");
        map2.put(F(), Build.VERSION.RELEASE.trim());
        map2.put(W(), "Android");
        map2.put(V(), "mobile");
        map2.put(U(), g0());
        map2.put(R(), com.max.xiaoheihe.utils.d.x0());
        map2.put(G(), com.max.xiaoheihe.a.f76430g);
        map2.put(P(), com.max.hbutils.utils.w.D());
        if (strC.endsWith("/")) {
            strC = strC.substring(0, strC.length() - 1);
        }
        String str4 = strC + "/";
        SecurityTool.setKN(str2, vd2);
        SecurityTool.setKB(str4, vd2);
        SecurityTool.setKM(str2, vd2);
        map2.put(O(), str2);
        map2.put(L(), vd2);
        NDKTools.encode(HeyBoxApplication.C(), str4, str2, vd2);
        map2.put(N(), SecurityTool.getVA(HeyBoxApplication.C(), vd2));
        map2.put(H(), com.max.xiaoheihe.utils.d.t0());
        return f(str, map2);
    }

    public static WebProtocolObj e0(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 49003, new Class[]{String.class}, WebProtocolObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebProtocolObj) patchProxyResultProxy.result;
        }
        try {
            String strSubstring = str.substring(9);
            if (!strSubstring.startsWith("{") || !strSubstring.endsWith(z5.g.f141884d)) {
                strSubstring = i(strSubstring, "utf-8");
            }
            return (WebProtocolObj) com.max.hbutils.utils.k.a(strSubstring, WebProtocolObj.class);
        } catch (Exception e10) {
            com.max.hbcommon.utils.d.d("zzzz", "Parse WebProtocol failed:" + str);
            e10.printStackTrace();
            return null;
        }
    }

    public static String f(String str, Map<String, String> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, map}, null, changeQuickRedirect, true, 48989, new Class[]{String.class, Map.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.u(str) || map == null || map.size() <= 0) {
            return str;
        }
        try {
            return q0(Uri.parse(str), map).toString();
        } catch (Exception e10) {
            e10.printStackTrace();
            return str;
        }
    }

    public static JSONObject f0(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 49004, new Class[]{String.class}, JSONObject.class);
        if (patchProxyResultProxy.isSupported) {
            return (JSONObject) patchProxyResultProxy.result;
        }
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(i(str, "utf-8").substring(9));
        } catch (Throwable unused) {
            com.max.hbcommon.utils.d.d("zzzz", "Could not parse malformed JSON: \"" + str + "\"");
            return null;
        }
    }

    public static URI g(URI uri, String str) throws URISyntaxException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri, str}, null, changeQuickRedirect, true, 49050, new Class[]{URI.class, String.class}, URI.class);
        if (patchProxyResultProxy.isSupported) {
            return (URI) patchProxyResultProxy.result;
        }
        String query = uri.getQuery();
        if (query != null) {
            str = query + "&" + str;
        }
        return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), str, uri.getFragment());
    }

    public static final String g0() {
        return "heybox";
    }

    public static byte[] h(InputStream inputStream) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inputStream}, null, changeQuickRedirect, true, 49049, new Class[]{InputStream.class}, byte[].class);
        if (patchProxyResultProxy.isSupported) {
            return (byte[]) patchProxyResultProxy.result;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    public static boolean h0(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48996, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            return uri.getQueryParameterNames() != null && uri.getQueryParameterNames().size() > 0;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static String i(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 49007, new Class[]{String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (str == null) {
            return "";
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            return "";
        } catch (IllegalArgumentException e11) {
            e11.printStackTrace();
            return str;
        }
    }

    public static boolean i0(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 48986, new Class[]{String.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return (com.max.hbcommon.utils.c.u(str2) || "Title".equals(str2) || str2.equalsIgnoreCase("about:blank") || str == null || str.contains(str2) || str.replace("%20", " ").contains(str2)) ? false : true;
    }

    public static void j(boolean z10, String str, WebView webView) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), str, webView}, null, changeQuickRedirect, true, 49016, new Class[]{Boolean.TYPE, String.class, WebView.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        boolean zK = DynamicSoManager.k(com.max.xiaoheihe.loader.dynamic_so.a.f77295a);
        if (!z10 && !zK) {
            com.max.xiaoheihe.dynamic_so.a.a(com.max.xiaoheihe.loader.dynamic_so.a.f77295a);
        }
        Fragment fragmentT = null;
        if (!z10 && zK) {
            JsCoreManager.l().j(str, null);
            return;
        }
        if (webView != null) {
            (webView.getContext() instanceof Activity ? (Activity) webView.getContext() : com.max.hbutils.utils.e.b().a()).runOnUiThread(new c(webView, str));
            return;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) com.max.hbutils.utils.e.b().a();
        if (fragmentActivity instanceof ChannelsDetailActivity) {
            fragmentT = ((ChannelsDetailActivity) fragmentActivity).T();
        } else {
            List<Fragment> listJ0 = fragmentActivity.getSupportFragmentManager().J0();
            if (!com.max.hbcommon.utils.c.w(listJ0)) {
                for (int i10 = 0; i10 < listJ0.size(); i10++) {
                    if (listJ0.get(i10) instanceof WebviewFragment) {
                        fragmentT = listJ0.get(i10);
                        break;
                    }
                }
            }
        }
        if (fragmentT instanceof WebviewFragment) {
            WebviewFragment webviewFragment = (WebviewFragment) fragmentT;
            if (fragmentActivity.isFinishing()) {
                return;
            }
            fragmentActivity.runOnUiThread(new d(webviewFragment, str));
        }
    }

    public static boolean j0(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48995, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            return false;
        }
        try {
            String scheme = Uri.parse(str).getScheme();
            return "http".equals(scheme) || "https".equals(scheme);
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static void k(final boolean z10, final String str, final WebView webView, com.max.xiaoheihe.module.webview.t.b bVar, com.max.xiaoheihe.module.webview.t tVar) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), str, webView, bVar, tVar}, null, changeQuickRedirect, true, 49015, new Class[]{Boolean.TYPE, String.class, WebView.class, com.max.xiaoheihe.module.webview.t.b.class, com.max.xiaoheihe.module.webview.t.class}, Void.TYPE).isSupported) {
            return;
        }
        if (tVar == null) {
            j(z10, str, webView);
            return;
        }
        String strH = com.max.xiaoheihe.accelworld.j.h(str);
        if (strH == null || com.max.hbcommon.utils.c.u(strH)) {
            return;
        }
        com.max.xiaoheihe.accelworld.j.b(str, tVar, bVar, new com.max.xiaoheihe.module.webview.t.a() { // from class: com.max.xiaoheihe.utils.j0
            @Override // com.max.xiaoheihe.module.webview.t.a
            public final void a() {
                l0.l0(z10, str, webView);
            }
        }, null);
    }

    public static boolean k0(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 48987, new Class[]{String.class, String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : !com.max.hbcommon.utils.c.u(T(str, str2));
    }

    @Deprecated
    public static boolean l(Context context, HBShareProtocolData hBShareProtocolData, UMShareListener uMShareListener) {
        if (hBShareProtocolData == null) {
            return false;
        }
        HBShareData hBShareData = hBShareProtocolData.toHBShareData();
        String img_url = hBShareProtocolData.getImg_url();
        String share_platform = hBShareProtocolData.getShare_platform();
        hBShareData.setUmImage(!com.max.hbcommon.utils.c.u(img_url) ? new UMImage(context, img_url) : new UMImage(context, R.drawable.share_thumbnail));
        hBShareData.setShareListener(uMShareListener);
        if (com.max.hbshare.d.f72581c.equals(share_platform)) {
            com.max.hbshare.d.D(context, hBShareData);
        } else if (com.max.hbshare.d.f72582d.equals(share_platform)) {
            com.max.hbshare.d.C(context, hBShareData);
        } else if (com.max.hbshare.d.f72583e.equals(share_platform)) {
            com.max.hbshare.d.B(context, hBShareData);
        } else if (com.max.hbshare.d.f72584f.equals(share_platform)) {
            com.max.hbshare.d.z(context, hBShareData);
        } else {
            if (!com.max.hbshare.d.f72585g.equals(share_platform)) {
                return false;
            }
            com.max.hbshare.d.A(context, hBShareData);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l0(boolean z10, String str, WebView webView) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), str, webView}, null, changeQuickRedirect, true, 49058, new Class[]{Boolean.TYPE, String.class, WebView.class}, Void.TYPE).isSupported) {
            return;
        }
        j(z10, str, webView);
    }

    public static String m(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 49006, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (Exception e10) {
            e10.printStackTrace();
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m0(DatePicker datePicker, TimePicker timePicker, int i10, WebView webView, DialogInterface dialogInterface, int i11) {
        String strS;
        Object[] objArr = {datePicker, timePicker, new Integer(i10), webView, dialogInterface, new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 49057, new Class[]{DatePicker.class, TimePicker.class, cls, WebView.class, DialogInterface.class, cls}, Void.TYPE).isSupported) {
            return;
        }
        String str = datePicker.getYear() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + (datePicker.getMonth() + 1) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + datePicker.getDayOfMonth();
        String str2 = timePicker.getCurrentHour() + ":" + timePicker.getCurrentMinute();
        if (i10 == 0) {
            strS = com.max.hbutils.utils.w.S(str2, "HH:mm");
        } else if (i10 != 1) {
            strS = com.max.hbutils.utils.w.S(str + " " + str2, com.max.hbutils.utils.w.f73605l);
        } else {
            strS = com.max.hbutils.utils.w.S(str, "yyyy-MM-dd");
        }
        t0(strS, webView);
        dialogInterface.dismiss();
    }

    private static void n(WebView webView, String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{webView, str, str2, str3}, null, changeQuickRedirect, true, 49019, new Class[]{WebView.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        io.reactivex.z<Result> zVarNb = null;
        if ("unfollowing".equalsIgnoreCase(str)) {
            zVarNb = com.max.xiaoheihe.network.i.a().x3(str3);
        } else if ("following".equalsIgnoreCase(str)) {
            zVarNb = com.max.xiaoheihe.network.i.a().cb(str3);
        } else if (GameObj.SUBSCRIBE_STATE_UNSUBSCRIBING.equalsIgnoreCase(str)) {
            zVarNb = com.max.xiaoheihe.network.i.a().l8(str3);
        } else if (GameObj.SUBSCRIBE_STATE_SUBSCRIBING.equalsIgnoreCase(str)) {
            zVarNb = com.max.xiaoheihe.network.i.a().nb(str3, str2);
        }
        if (zVarNb != null) {
            zVarNb.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e(str, webView));
        }
    }

    public static boolean n0(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 49020, new Class[]{Context.class, String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : o0(context, str, null);
    }

    public static List<String> o() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 49029, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        if (com.max.hbcommon.network.b.f68052i) {
            arrayList.add("fc93b13ec28646dfb6359ec7949f6215");
            arrayList.add("836e0edc80564aa9bf05f2ba85ac4836");
        } else {
            arrayList.add("02216ac31ba74a23bcc1ad963a08e580");
            arrayList.add("8a323b1d1e6547fe81920d4dde238398");
        }
        return arrayList;
    }

    public static boolean o0(Context context, String str, WebProtocolObj webProtocolObj) {
        boolean z10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, webProtocolObj}, null, changeQuickRedirect, true, 49021, new Class[]{Context.class, String.class, WebProtocolObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            return false;
        }
        okhttp3.t tVarJ = okhttp3.t.J(str);
        String strX = tVarJ != null ? tVarJ.x() : "";
        Log.d("nativeDisplay", "path: " + strX);
        if (tVarJ == null || !t0.e(tVarJ.getHost())) {
            return false;
        }
        Matcher matcher = Pattern.compile("www.xiaoheihe.cn/community/(.*?)/list/(.*?)$").matcher(str);
        Matcher matcher2 = Pattern.compile("app/bbs/link/(\\d+)").matcher(str);
        if (str.contains("bbs/app/api/web/share")) {
            String strT = T(str, "link_id");
            String strT2 = T(str, "link_tag");
            String strT3 = T(str, PostPageFactory.f81484t);
            if (!com.max.hbcommon.utils.c.u(strT) && !com.max.hbcommon.utils.c.u(strT2)) {
                com.max.xiaoheihe.module.bbs.utils.b.F(context, null, strT, strT2, strT3, null);
            } else if (!(context instanceof FragmentActivity) || (context instanceof RouterActivity)) {
                BBSLinkObj bBSLinkObj = new BBSLinkObj();
                bBSLinkObj.setLinkid(strT);
                bBSLinkObj.setLink_tag(strT2);
                bBSLinkObj.setHas_video(strT3);
                com.max.xiaoheihe.module.bbs.utils.b.E(context, bBSLinkObj);
            } else {
                com.max.xiaoheihe.module.bbs.z.P3(strT).show(((FragmentActivity) context).getSupportFragmentManager(), "PostNativeRouterDialogFragment");
            }
            return true;
        }
        if (!"/mall/detail/".equals(strX) && !lb.a.Y2.equals(strX)) {
            if ("/wiki/get_article_for_app/".equals(strX)) {
                String strT4 = T(str, "article_id");
                String strT5 = T(str, "wiki_id");
                String strT6 = T(str, "name");
                WikiEntryObj wikiEntryObj = new WikiEntryObj();
                wikiEntryObj.setArticle_id(strT4);
                wikiEntryObj.setWiki_id(strT5);
                wikiEntryObj.setName(strT6);
                HashMap map = new HashMap();
                map.put("wiki", wikiEntryObj);
                if (!com.max.xiaoheihe.module.littleprogram.b.r(context, strX, webProtocolObj, map)) {
                    com.max.xiaoheihe.utils.d.G1(context, PostPageFactory.a(new PostPageParam(context, null, null, null, null, null, null, null, 0L, wikiEntryObj, 0, null, null, null, null), PostPageFactory.PostType.WIKI));
                }
            } else if (lb.d.R2.equals(strX)) {
                String strT7 = T(str, "wiki_id");
                HashMap map2 = new HashMap();
                map2.put(GameWikiFragment.f88830t.a(), strT7);
                if (!com.max.xiaoheihe.module.littleprogram.b.r(context, strX, webProtocolObj, map2)) {
                    com.max.xiaoheihe.utils.d.G1(context, GameWikiActivity.R1(context, strT7));
                }
            } else if ("/game/get_game_detail_share/".equals(strX)) {
                com.max.xiaoheihe.utils.d.G1(context, ChannelsDetailActivity.l3(context, null, null, T(str, "appid"), null, null, null, null, null, "game"));
            } else if ("/game/console/get_game_detail_share/".equals(strX)) {
                com.max.xiaoheihe.utils.d.G1(context, ChannelsDetailActivity.l3(context, null, null, T(str, com.max.xiaoheihe.module.game.d0.f87248t), GameObj.GAME_TYPE_CONSOLE, null, null, null, null, "game"));
            } else if ("/game/game_compilation_share/".equals(strX)) {
                GameListHeaderObj gameListHeaderObj = new GameListHeaderObj();
                gameListHeaderObj.setCompilation_id(T(str, "id"));
                com.max.xiaoheihe.utils.d.G1(context, GameCompilationDetailActivity.r2(context, gameListHeaderObj));
            } else if (com.max.xiaoheihe.utils.d.n0(R.string.PATH_PATTERN_PROTOCOL).equals(strX)) {
                com.max.xiaoheihe.base.router.b.k0(context, T(str, SwitchDetailActivity.P));
            } else if (matcher.find() && (context instanceof FragmentActivity)) {
                com.max.xiaoheihe.module.bbs.z.P3(v(str)).show(((FragmentActivity) context).getSupportFragmentManager(), "PostNativeRouterDialogFragment");
            } else {
                if (!matcher2.find()) {
                    return false;
                }
                z10 = true;
                if (com.max.hbcommon.utils.c.u(matcher2.group(1)) || !(context instanceof FragmentActivity)) {
                    return false;
                }
                com.max.xiaoheihe.module.bbs.z.P3(matcher2.group(1)).show(((FragmentActivity) context).getSupportFragmentManager(), "PostNativeRouterDialogFragment");
            }
            return true;
        }
        z10 = true;
        com.max.xiaoheihe.utils.d.G1(context, MallProductDetailActivity.n2(context, T(str, "sku_id"), T(str, "h_src")));
        return z10;
    }

    public static Map<String, String> p(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48998, new Class[]{String.class}, Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        String strS = s(str);
        if (strS == null) {
            return null;
        }
        if ((!strS.contains(org.apache.tools.ant.types.selectors.o.f136589m) && !strS.contains(com.max.xiaoheihe.a.f76428e) && !strS.contains("heybox")) || strS.contains("api.douyutv.com")) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("Referer", "http://api.maxjia.com/");
        return map;
    }

    public static void p0(Context context, String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 49010, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            com.max.hbcommon.utils.d.b("webutil", "openUrlByBrowser+url " + str);
            intent.setData(Uri.parse(str));
            com.max.xiaoheihe.utils.d.G1(context, intent);
        } catch (ActivityNotFoundException unused) {
        }
    }

    public static String q(Map<String, String> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, null, changeQuickRedirect, true, 49052, new Class[]{Map.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (map != null) {
            return map.get(com.max.hbcommon.utils.c.u(map.get("Content-Type")) ? "content-type" : "Content-Type");
        }
        return null;
    }

    private static Uri q0(Uri uri, Map<String, String> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri, map}, null, changeQuickRedirect, true, 48990, new Class[]{Uri.class, Map.class}, Uri.class);
        if (patchProxyResultProxy.isSupported) {
            return (Uri) patchProxyResultProxy.result;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        HashMap map2 = new HashMap(16);
        for (String str : queryParameterNames) {
            if (!TextUtils.isEmpty(str)) {
                map2.put(str, uri.getQueryParameter(str));
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            map2.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry2.getKey(), (String) entry2.getValue());
        }
        return builderBuildUpon.build();
    }

    public static String r(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 49002, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        int iIndexOf = str.indexOf(HttpConstant.SCHEME_SPLIT, 0) + 3;
        int iIndexOf2 = str.indexOf("#/", iIndexOf);
        return iIndexOf2 != -1 ? str.substring(iIndexOf, iIndexOf2) : str.substring(iIndexOf);
    }

    private static void r0(@androidx.annotation.n0 String str, @androidx.annotation.n0 Bundle bundle) {
        List<ProtocolPostOptionObj> listB;
        if (PatchProxy.proxy(new Object[]{str, bundle}, null, changeQuickRedirect, true, 49056, new Class[]{String.class, Bundle.class}, Void.TYPE).isSupported || (listB = com.max.hbutils.utils.k.b(str, ProtocolPostOptionObj.class)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (ProtocolPostOptionObj protocolPostOptionObj : listB) {
            if (protocolPostOptionObj != null) {
                PostOptionObj postOptionObj = new PostOptionObj();
                postOptionObj.setName(protocolPostOptionObj.getTitle());
                postOptionObj.setImage_url(protocolPostOptionObj.getFull_icon());
                postOptionObj.setIcon_url(protocolPostOptionObj.getIcon());
                postOptionObj.setIcon_tint_color(protocolPostOptionObj.getIcon_tint_color());
                postOptionObj.setProtocol(protocolPostOptionObj.getProtocol());
                arrayList.add(postOptionObj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        bundle.putSerializable(com.max.hbshare.d.f72592n, arrayList);
    }

    public static String s(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48993, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            return null;
        }
        try {
            return Uri.parse(str).getHost();
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static void s0(String str, String str2, Map<String, String> map, String str3, String str4, String str5, String str6, j jVar) {
        String strReplace = str2;
        if (PatchProxy.proxy(new Object[]{str, strReplace, map, str3, str4, str5, str6, jVar}, null, changeQuickRedirect, true, 49014, new Class[]{String.class, String.class, Map.class, String.class, String.class, String.class, String.class, j.class}, Void.TYPE).isSupported || strReplace == null) {
            return;
        }
        if (strReplace.startsWith("/")) {
            strReplace = strReplace.substring(1);
        }
        String host = Uri.parse(strReplace).getHost();
        if (com.max.hbcommon.utils.c.u(host)) {
            strReplace = com.max.hbcommon.network.b.c() + strReplace;
        } else if (!host.equals(com.max.hbcommon.network.b.d())) {
            strReplace = strReplace.replace(host, com.max.hbcommon.network.b.d());
        }
        io.reactivex.z<Result> zVarY2 = null;
        RequestTagMapObj requestTagMapObj = new RequestTagMapObj();
        if (str5 != null) {
            requestTagMapObj.put(com.max.hbcommon.network.b.f68049f, str5);
        }
        if (str6 != null) {
            requestTagMapObj.put(com.max.hbcommon.network.b.f68050g, str6);
        }
        if ("GET".equals(str)) {
            HashMap map2 = new HashMap(16);
            HashMap map3 = new HashMap(16);
            if (map != null) {
                map3.putAll(map);
            }
            zVarY2 = com.max.xiaoheihe.network.i.a().u5(map2, strReplace, map3, requestTagMapObj);
        } else if ("POST".equals(str)) {
            HashMap map4 = new HashMap(16);
            HashMap map5 = new HashMap(16);
            HashMap map6 = new HashMap(16);
            if (map != null) {
                map5.putAll(map);
            }
            if (!com.max.hbcommon.utils.c.u(str3)) {
                try {
                    Map map7 = (Map) new Gson().fromJson(str3, new a().getType());
                    if (map7 != null) {
                        if (com.max.hbcommon.utils.c.x(str4)) {
                            PostEncryptParamsObj postEncryptParamsObjV0 = com.max.xiaoheihe.utils.d.v0(com.max.hbutils.utils.k.p(map7), true);
                            map6.put("data", postEncryptParamsObjV0.getData());
                            map6.put("key", postEncryptParamsObjV0.getKey());
                            map6.put("sid", postEncryptParamsObjV0.getSid());
                            map5.put("time_", postEncryptParamsObjV0.getTime());
                        } else {
                            map6.putAll(map7);
                        }
                    }
                } catch (Exception e10) {
                    Log.d("", e10.getMessage());
                }
            }
            zVarY2 = com.max.xiaoheihe.network.i.a().Y2(map4, strReplace, map5, map6, requestTagMapObj);
        }
        if (zVarY2 != null) {
            zVarY2.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new b(jVar));
        }
    }

    private static int t(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 49009, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iIndexOf = str.indexOf("#/", 0);
        int i10 = iIndexOf + 2;
        int iIndexOf2 = str.indexOf("#/", i10);
        if (iIndexOf == -1 || iIndexOf2 == -1) {
            return -1;
        }
        return Integer.parseInt(str.substring(i10, iIndexOf2));
    }

    private static void t0(String str, WebView webView) {
        if (PatchProxy.proxy(new Object[]{str, webView}, null, changeQuickRedirect, true, 49018, new Class[]{String.class, WebView.class}, Void.TYPE).isSupported) {
            return;
        }
        webView.loadUrl(String.format("javascript:clientDateCallback(%s)", str));
    }

    private static String u(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 49008, new Class[]{String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : str.substring(str.indexOf("#/", str.indexOf("#/", 0) + 2) + 2);
    }

    private static void u0(final WebView webView, Context context, final int i10, long j10, long j11, String str) {
        Object[] objArr = {webView, context, new Integer(i10), new Long(j10), new Long(j11), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 49017, new Class[]{WebView.class, Context.class, Integer.TYPE, cls, cls, String.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.dialog_date_time_picker, (ViewGroup) null, false);
        final DatePicker datePicker = (DatePicker) viewInflate.findViewById(R.id.dp_date);
        final TimePicker timePicker = (TimePicker) viewInflate.findViewById(R.id.tp_time);
        datePicker.setMaxDate(j10 * 1000);
        datePicker.setMinDate(j11 * 1000);
        if (str != null) {
            Date date = new Date(Long.parseLong(str) * 1000);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            datePicker.updateDate(calendar.get(1), calendar.get(2), calendar.get(5));
        }
        if (i10 == 0) {
            datePicker.setVisibility(8);
        } else if (i10 == 1) {
            timePicker.setVisibility(8);
        }
        new com.max.hbcommon.view.a.f(context).i(viewInflate).u("确定", new DialogInterface.OnClickListener() { // from class: com.max.xiaoheihe.utils.k0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                l0.m0(datePicker, timePicker, i10, webView, dialogInterface, i11);
            }
        }).d().show();
    }

    public static String v(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48991, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            return null;
        }
        try {
            return Uri.parse(str).getLastPathSegment();
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static void v0(Context context, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, 49024, new Class[]{Context.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!com.max.hbcommon.utils.c.u(str2) && com.max.hbcache.c.h(str2) != -1) {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f("任务已存在...");
            return;
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        DownloadManager downloadManager = (DownloadManager) context.getSystemService(ChannelsDetailActivity.f79595e4);
        String strM1 = com.max.xiaoheihe.utils.d.M1(str);
        try {
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(strM1));
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            if (!externalStoragePublicDirectory.exists()) {
                externalStoragePublicDirectory.mkdirs();
            }
            String strSubstring = strM1.substring(strM1.lastIndexOf("/") + 1);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strSubstring);
            long jEnqueue = downloadManager.enqueue(request);
            if (com.max.hbcommon.utils.c.u(str2)) {
                com.max.hbcache.c.y(strSubstring, jEnqueue);
            } else {
                com.max.hbcache.c.y(str2, jEnqueue);
            }
            com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f("开始下载...");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static String w(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48985, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (str == null || "null".equals(str)) {
            return null;
        }
        return (str.length() >= 2 && str.startsWith("\"") && str.endsWith("\"")) ? str.substring(1, str.length() - 1).replace("\\\\", "\\").replace("\\\"", "\"") : str;
    }

    public static void w0(Context context, Intent intent) {
        if (PatchProxy.proxy(new Object[]{context, intent}, null, changeQuickRedirect, true, 49027, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        x0(context, intent, -1);
    }

    public static String x() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 49048, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < 32; i10++) {
            stringBuffer.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(random.nextInt(62)));
        }
        return stringBuffer.toString();
    }

    public static void x0(Context context, Intent intent, int i10) {
        if (PatchProxy.proxy(new Object[]{context, intent, new Integer(i10)}, null, changeQuickRedirect, true, 49028, new Class[]{Context.class, Intent.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        boolean z10 = context instanceof Activity;
        if (!z10) {
            intent.addFlags(268435456);
        }
        if (!z10) {
            context.startActivity(intent);
            return;
        }
        Activity activity = (Activity) context;
        if (com.max.xiaoheihe.module.littleprogram.b.s(activity, intent)) {
            return;
        }
        activity.startActivityForResult(intent, i10);
    }

    public static WebProtocolObj y(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        Object[] objArr = {str, str2, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0), new Byte(z13 ? (byte) 1 : (byte) 0), new Byte(z14 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 49012, new Class[]{String.class, String.class, cls, cls, cls, cls, cls}, WebProtocolObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebProtocolObj) patchProxyResultProxy.result;
        }
        WebProtocolObj webProtocolObj = new WebProtocolObj();
        WebCfgObj webCfgObj = new WebCfgObj();
        HashMap map = new HashMap();
        NavBarCfgObj navBarCfgObj = new NavBarCfgObj();
        webCfgObj.setRefresh(z10);
        webProtocolObj.setFull_screen(z11);
        webProtocolObj.setProtocol_type("openRouterPath");
        map.put("protocol_type", "openRouterPath");
        map.put(FlutterActivityLaunchConfigs.EXTRA_PATH, str);
        map.put(WebviewFragment.D4, z11 ? "true" : "false");
        if (z13) {
            map.put("need_login", "1");
        } else {
            map.put("need_login", "0");
        }
        if (z14) {
            map.put(ob.b.f132259k, "1");
        }
        if (z12) {
            StatusBarCfgObj statusBarCfgObj = new StatusBarCfgObj();
            statusBarCfgObj.setStyle(AccelWorldLottieKt.f76443a);
            webProtocolObj.setStatus_bar(statusBarCfgObj);
        }
        navBarCfgObj.setTitle(str2);
        map.put("navigation_bar", new Gson().toJson(navBarCfgObj));
        webProtocolObj.setWebview(webCfgObj);
        webProtocolObj.setKvPair(map);
        return webProtocolObj;
    }

    public static void y0(Context context, String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 49022, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        z0(context, str, null);
    }

    public static WebProtocolObj z(String str, Map<String, Object> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, map}, null, changeQuickRedirect, true, 49013, new Class[]{String.class, Map.class}, WebProtocolObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebProtocolObj) patchProxyResultProxy.result;
        }
        WebProtocolObj webProtocolObj = new WebProtocolObj();
        webProtocolObj.setProtocol_type("openRouterPath");
        HashMap map2 = new HashMap();
        map2.put(FlutterActivityLaunchConfigs.EXTRA_PATH, str);
        map2.put("protocol_type", "openRouterPath");
        map2.put("params", com.max.hbutils.utils.k.p(map));
        webProtocolObj.setKvPair(map2);
        return webProtocolObj;
    }

    public static void z0(Context context, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, 49023, new Class[]{Context.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.i.e(context)) {
            v0(context, str, str2);
        } else {
            com.max.xiaoheihe.view.l.D(context, "", context.getString(R.string.no_wifi_download_notify), context.getString(R.string.confirm), context.getString(R.string.cancel), new f(context, str, str2));
        }
    }
}
