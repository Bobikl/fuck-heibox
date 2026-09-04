package com.max.xiaoheihe.module.game;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.google.gson.JsonObject;
import com.max.hbcommon.component.TitleBar;
import com.max.hbcommon.network.eventlistener.HBNetEventListener;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.SyncSteamCommentObj;
import com.max.xiaoheihe.bean.mall.SteamWalletJsObj;
import com.max.xiaoheihe.bean.proxy.ProxyAddressObj;
import com.max.xiaoheihe.bean.webintercept.IpDirectObj;
import com.max.xiaoheihe.bean.webintercept.TagJsObj;
import com.max.xiaoheihe.module.magic.MagicUtil;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.analytics.pro.ak;
import df.y6;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Cookie;

/* JADX INFO: compiled from: SyncCommentToSteamFragment.java */
/* JADX INFO: loaded from: classes11.dex */
public class d2 extends com.max.hbcommon.base.c {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f87285v = "ARG_SYNC_INFO";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f87286w = "https://store.steampowered.com/account/";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static Handler f87287x = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f87288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SteamWalletJsObj f87289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b2 f87290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private okhttp3.z f87291h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Activity f87292i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MagicUtil.ConnectType f87293j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f87294k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f87295l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f87296m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f87297n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f87298o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private LoadingDialog f87299p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f87300q = "3";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f87301r = "";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private SyncSteamCommentObj f87302s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private LinearLayout f87303t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private TitleBar f87304u;

    /* JADX INFO: compiled from: SyncCommentToSteamFragment.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f87305b;

        a(com.max.hbcommon.component.i iVar) {
            this.f87305b = iVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35277, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f87305b.dismiss();
            d2.b4(d2.this);
        }
    }

    /* JADX INFO: compiled from: SyncCommentToSteamFragment.java */
    public class b implements com.max.xiaoheihe.network.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: SyncCommentToSteamFragment.java */
        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ JsonObject f87308b;

            a(JsonObject jsonObject) {
                this.f87308b = jsonObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35280, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                com.max.heybox.hblog.g.W("editComment onResponse " + this.f87308b.toString());
                d2.d4(d2.this, this.f87308b);
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.d2$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SyncCommentToSteamFragment.java */
        public class RunnableC0789b implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            RunnableC0789b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35281, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                d2.e4(d2.this);
            }
        }

        b() {
        }

        @Override // com.max.xiaoheihe.network.h
        public void a(Exception exc) {
            if (PatchProxy.proxy(new Object[]{exc}, this, changeQuickRedirect, false, 35279, new Class[]{Exception.class}, Void.TYPE).isSupported) {
                return;
            }
            d2.f87287x.post(new RunnableC0789b());
        }

        @Override // com.max.xiaoheihe.network.h
        public void b(@androidx.annotation.p0 JsonObject jsonObject, @androidx.annotation.p0 String str, @androidx.annotation.p0 okhttp3.s sVar, int i10) {
            if (PatchProxy.proxy(new Object[]{jsonObject, str, sVar, new Integer(i10)}, this, changeQuickRedirect, false, 35278, new Class[]{JsonObject.class, String.class, okhttp3.s.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            try {
                d2.f87287x.post(new a(jsonObject));
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: compiled from: SyncCommentToSteamFragment.java */
    public class c implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 35282, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            d2.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: SyncCommentToSteamFragment.java */
    public class d implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f87312b;

        d(Activity activity) {
            this.f87312b = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 35283, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.Q1(this.f87312b, null);
            com.max.xiaoheihe.utils.d.h(this.f87312b);
            dialogInterface.dismiss();
            d2.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: SyncCommentToSteamFragment.java */
    public class e implements okhttp3.u {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // okhttp3.u
        public okhttp3.c0 intercept(okhttp3.u.a aVar) throws IOException {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, 35276, new Class[]{okhttp3.u.a.class}, okhttp3.c0.class);
            if (patchProxyResultProxy.isSupported) {
                return (okhttp3.c0) patchProxyResultProxy.result;
            }
            okhttp3.a0 a0VarRequest = aVar.request();
            return aVar.proceed(a0VarRequest.n().n("User-Agent", "Mozilla/5.0 AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.118 Safari/537.36 ApiMaxJia/1.0").D(a0VarRequest.q().H().h()).b());
        }
    }

    /* JADX INFO: compiled from: SyncCommentToSteamFragment.java */
    public class f implements okhttp3.o {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // okhttp3.o
        @androidx.annotation.n0
        public List<InetAddress> lookup(@androidx.annotation.n0 String str) throws UnknownHostException {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 35284, new Class[]{String.class}, List.class);
            if (patchProxyResultProxy.isSupported) {
                return (List) patchProxyResultProxy.result;
            }
            com.max.heybox.hblog.g.W("lookup  hostname: " + str);
            if (d2.this.f87289f == null || d2.this.f87289f.getHost() == null || !d2.this.f87289f.getHost().containsKey(str)) {
                return okhttp3.o.f132626a.lookup(str);
            }
            com.max.heybox.hblog.g.W("lookup  hostname: " + str + "  ip: " + d2.this.f87289f.getHost().get(str));
            return Arrays.asList(InetAddress.getAllByName(d2.this.f87289f.getHost().get(str)));
        }
    }

    /* JADX INFO: compiled from: SyncCommentToSteamFragment.java */
    public class g extends com.max.hbcommon.network.d<Result<SteamWalletJsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: SyncCommentToSteamFragment.java */
        public class a implements yh.a<kotlin.b2> {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            public kotlin.b2 a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35288, new Class[0], kotlin.b2.class);
                if (patchProxyResultProxy.isSupported) {
                    return (kotlin.b2) patchProxyResultProxy.result;
                }
                if (!d2.this.isActive()) {
                    return null;
                }
                d2 d2Var = d2.this;
                d2Var.f87293j = MagicUtil.f89378a.a(d2Var.f87289f);
                d2.g4(d2.this);
                d2.h4(d2.this);
                return null;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35289, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        }

        g() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 35285, new Class[]{Throwable.class}, Void.TYPE).isSupported && d2.this.isActive()) {
                super.onError(th2);
                d2.this.f87300q = "2";
                d2.this.dismiss();
            }
        }

        public void onNext(Result<SteamWalletJsObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 35286, new Class[]{Result.class}, Void.TYPE).isSupported && d2.this.isActive()) {
                d2.this.f87289f = result.getResult();
                MagicUtil.f89378a.c(d2.this.f87292i, d2.this.f87289f, new a());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35287, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SteamWalletJsObj>) obj);
        }
    }

    /* JADX INFO: compiled from: SyncCommentToSteamFragment.java */
    public class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35290, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            d2.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: SyncCommentToSteamFragment.java */
    public class i extends WebviewFragment.o0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: SyncCommentToSteamFragment.java */
        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35293, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                d2.P3(d2.this);
            }
        }

        i() {
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void c(WebView webView, String str) {
            if (PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 35292, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            Matcher matcher = Pattern.compile("var g_AccountID = (\\d+);").matcher(str);
            if (matcher.find()) {
                d2.this.f87295l = String.valueOf(com.max.hbutils.utils.n.r(matcher.group(1)) + 76561197960265728L);
                List<Cookie> listA = d2.this.f87290g.a(okhttp3.t.J(d2.f87286w));
                if (listA != null) {
                    for (Cookie cookie : listA) {
                        if ("sessionid".equals(cookie.name())) {
                            d2.this.f87294k = cookie.value();
                        }
                    }
                }
                d2.f87287x.post(new a());
            }
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void g(WebView webView, String str, int i10, int i11) {
            Object[] objArr = {webView, str, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (!PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 35291, new Class[]{WebView.class, String.class, cls, cls}, Void.TYPE).isSupported && i11 - 1 == 0 && str.contains("/account/")) {
                d2.i4(d2.this, WebviewFragment.Y4);
            }
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void o(WebView webView, String str) {
        }
    }

    /* JADX INFO: compiled from: SyncCommentToSteamFragment.java */
    public class j implements okhttp3.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: SyncCommentToSteamFragment.java */
        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35296, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                d2.S3(d2.this);
            }
        }

        /* JADX INFO: compiled from: SyncCommentToSteamFragment.java */
        public class b implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35297, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                d2.S3(d2.this);
            }
        }

        /* JADX INFO: compiled from: SyncCommentToSteamFragment.java */
        public class c implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35298, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                d2.S3(d2.this);
            }
        }

        /* JADX INFO: compiled from: SyncCommentToSteamFragment.java */
        public class d implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35299, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                d2.P3(d2.this);
            }
        }

        /* JADX INFO: compiled from: SyncCommentToSteamFragment.java */
        public class e implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            e() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35300, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                d2.S3(d2.this);
            }
        }

        /* JADX INFO: compiled from: SyncCommentToSteamFragment.java */
        public class f implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            f() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35301, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                d2.S3(d2.this);
            }
        }

        j() {
        }

        @Override // okhttp3.f
        public void onFailure(okhttp3.e eVar, IOException iOException) {
            if (PatchProxy.proxy(new Object[]{eVar, iOException}, this, changeQuickRedirect, false, 35294, new Class[]{okhttp3.e.class, IOException.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.G("checkForCookie error: " + iOException.getMessage());
            d2.f87287x.post(new a());
        }

        @Override // okhttp3.f
        public void onResponse(okhttp3.e eVar, okhttp3.c0 c0Var) throws IOException {
            if (PatchProxy.proxy(new Object[]{eVar, c0Var}, this, changeQuickRedirect, false, 35295, new Class[]{okhttp3.e.class, okhttp3.c0.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.W("checkForCookie onResponse");
            try {
                try {
                    try {
                        if (eVar.getCanceled()) {
                            d2.f87287x.post(new b());
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
                            d2.f87287x.post(new c());
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
                        com.max.heybox.hblog.g.W("checkForCookie onResponse result: " + strString);
                        Matcher matcher = Pattern.compile("var g_AccountID = (\\d+);").matcher(strString);
                        if (matcher.find()) {
                            d2.this.f87295l = String.valueOf(com.max.hbutils.utils.n.r(matcher.group(1)) + 76561197960265728L);
                            d2 d2Var = d2.this;
                            d2Var.f87294k = d2.T3(d2Var, d2.f87286w);
                            d2.f87287x.post(new d());
                            okhttp3.d0 d0VarQ3 = c0Var.q();
                            if (d0VarQ3 != null) {
                                d0VarQ3.close();
                                return;
                            }
                            return;
                        }
                        d2.f87287x.post(new e());
                        try {
                            okhttp3.d0 d0VarQ4 = c0Var.q();
                            if (d0VarQ4 != null) {
                                d0VarQ4.close();
                            }
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                    } catch (Exception e13) {
                        e13.printStackTrace();
                        d2.f87287x.post(new f());
                        okhttp3.d0 d0VarQ5 = c0Var.q();
                        if (d0VarQ5 != null) {
                            d0VarQ5.close();
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        okhttp3.d0 d0VarQ6 = c0Var.q();
                        if (d0VarQ6 != null) {
                            d0VarQ6.close();
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

    /* JADX INFO: compiled from: SyncCommentToSteamFragment.java */
    public class k implements okhttp3.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: SyncCommentToSteamFragment.java */
        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35304, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                d2.U3(d2.this);
            }
        }

        /* JADX INFO: compiled from: SyncCommentToSteamFragment.java */
        public class b implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35305, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                d2.U3(d2.this);
            }
        }

        /* JADX INFO: compiled from: SyncCommentToSteamFragment.java */
        public class c implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35306, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                d2.U3(d2.this);
            }
        }

        /* JADX INFO: compiled from: SyncCommentToSteamFragment.java */
        public class d implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f87332b;

            d(String str) {
                this.f87332b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35307, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                if (!this.f87332b.replaceAll(d2.this.f87301r, "").equals(d2.this.f87297n.replaceAll(d2.this.f87301r, ""))) {
                    d2.c4(d2.this, this.f87332b);
                } else if (this.f87332b.contains(d2.this.f87301r) || !com.max.hbcommon.utils.c.x(d2.this.f87298o)) {
                    d2.Z3(d2.this);
                } else {
                    d2.b4(d2.this);
                }
            }
        }

        /* JADX INFO: compiled from: SyncCommentToSteamFragment.java */
        public class e implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            e() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35308, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                d2.U3(d2.this);
            }
        }

        /* JADX INFO: compiled from: SyncCommentToSteamFragment.java */
        public class f implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            f() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35309, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                d2.U3(d2.this);
            }
        }

        k() {
        }

        @Override // okhttp3.f
        public void onFailure(okhttp3.e eVar, IOException iOException) {
            if (PatchProxy.proxy(new Object[]{eVar, iOException}, this, changeQuickRedirect, false, 35302, new Class[]{okhttp3.e.class, IOException.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.G("getCommentStatus  error: " + iOException.getMessage());
            d2.f87287x.post(new a());
        }

        @Override // okhttp3.f
        public void onResponse(okhttp3.e eVar, okhttp3.c0 c0Var) throws IOException {
            try {
                try {
                    if (PatchProxy.proxy(new Object[]{eVar, c0Var}, this, changeQuickRedirect, false, 35303, new Class[]{okhttp3.e.class, okhttp3.c0.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    try {
                        com.max.heybox.hblog.g.W("getCommentStatus onResponse");
                        if (eVar.getCanceled()) {
                            d2.f87287x.post(new b());
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
                            d2.f87287x.post(new c());
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
                        com.max.heybox.hblog.g.W("getCommentStatus onResponse result: " + strString);
                        Pattern patternCompile = Pattern.compile("UserReview_Report\\( '(\\d+)', 'https://steamcommunity.com'");
                        Pattern patternCompile2 = Pattern.compile("<div id=\"ReviewText\">([\\s\\S]*?)</div>");
                        Matcher matcher = patternCompile.matcher(strString);
                        Matcher matcher2 = patternCompile2.matcher(strString);
                        if (matcher.find() && matcher2.find()) {
                            d2.this.f87296m = matcher.group(1);
                            d2.f87287x.post(new d(matcher2.group(1).trim().replaceAll("<br>", "\n")));
                            okhttp3.d0 d0VarQ3 = c0Var.q();
                            if (d0VarQ3 != null) {
                                d0VarQ3.close();
                                return;
                            }
                            return;
                        }
                        d2.f87287x.post(new e());
                        try {
                            okhttp3.d0 d0VarQ4 = c0Var.q();
                            if (d0VarQ4 != null) {
                                d0VarQ4.close();
                            }
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                    } catch (Exception e13) {
                        e13.printStackTrace();
                        d2.f87287x.post(new f());
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

    /* JADX INFO: compiled from: SyncCommentToSteamFragment.java */
    public class l implements com.max.xiaoheihe.network.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: SyncCommentToSteamFragment.java */
        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ JsonObject f87337b;

            a(JsonObject jsonObject) {
                this.f87337b = jsonObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35312, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                d2.d4(d2.this, this.f87337b);
            }
        }

        /* JADX INFO: compiled from: SyncCommentToSteamFragment.java */
        public class b implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35313, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                d2.e4(d2.this);
            }
        }

        l() {
        }

        @Override // com.max.xiaoheihe.network.h
        public void a(Exception exc) {
            if (PatchProxy.proxy(new Object[]{exc}, this, changeQuickRedirect, false, 35311, new Class[]{Exception.class}, Void.TYPE).isSupported) {
                return;
            }
            d2.f87287x.post(new b());
        }

        @Override // com.max.xiaoheihe.network.h
        public void b(@androidx.annotation.p0 JsonObject jsonObject, @androidx.annotation.p0 String str, @androidx.annotation.p0 okhttp3.s sVar, int i10) {
            if (PatchProxy.proxy(new Object[]{jsonObject, str, sVar, new Integer(i10)}, this, changeQuickRedirect, false, 35310, new Class[]{JsonObject.class, String.class, okhttp3.s.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            try {
                d2.f87287x.post(new a(jsonObject));
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: compiled from: SyncCommentToSteamFragment.java */
    public class m implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f87340b;

        m(com.max.hbcommon.component.i iVar) {
            this.f87340b = iVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 35314, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f87340b.dismiss();
            d2.this.f87300q = "3";
            d2.this.dismiss();
        }
    }

    private void A4(WebviewFragment webviewFragment) {
        if (PatchProxy.proxy(new Object[]{webviewFragment}, this, changeQuickRedirect, false, 35245, new Class[]{WebviewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        webviewFragment.Y7(new i());
    }

    private void B4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35237, new Class[0], Void.TYPE).isSupported || !isActive() || this.f87292i.isFinishing()) {
            return;
        }
        LoadingDialog loadingDialog = this.f87299p;
        if (loadingDialog == null || !loadingDialog.i()) {
            this.f87299p = new LoadingDialog(this.f87292i, "", false).r();
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008d  */
    private void C4() {
        HashMap<String, String> host;
        ArrayList<TagJsObj> js_list;
        String str;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35243, new Class[0], Void.TYPE).isSupported && isActive()) {
            com.max.xiaoheihe.utils.d.k(this.f87292i, f87286w);
            t4();
            SteamWalletJsObj steamWalletJsObj = this.f87289f;
            String str2 = null;
            if (steamWalletJsObj != null) {
                if (steamWalletJsObj.getHost() == null || com.max.hbcommon.utils.c.w(this.f87289f.getJs_list())) {
                    host = null;
                    js_list = null;
                } else {
                    host = this.f87289f.getHost();
                    js_list = this.f87289f.getJs_list();
                }
                if (this.f87289f.getSteam_proxy() == null || this.f87289f.getSteam_proxy().getProxy() == null) {
                    str = null;
                } else {
                    String strV = com.max.xiaoheihe.utils.d.v(this.f87289f.getSteam_proxy().getProxy());
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
            } else {
                host = null;
                js_list = null;
                str = null;
            }
            com.max.xiaoheihe.module.webview.u uVarV = new com.max.xiaoheihe.module.webview.u(f87286w).v(true);
            MagicUtil.ConnectType connectType = this.f87293j;
            if (connectType == MagicUtil.ConnectType.Proxy) {
                uVarV.t(new ProxyAddressObj(str2, str));
            } else if (connectType == MagicUtil.ConnectType.IP_Direct) {
                uVarV.l(new IpDirectObj(host, js_list));
            }
            WebviewFragment webviewFragmentA = uVarV.a();
            A4(webviewFragmentA);
            getChildFragmentManager().u().y(R.id.fragment_container, webviewFragmentA).n();
            this.f87304u.setTitle(GameObj.PLATFORM_STEAM_NAME);
            this.f87304u.setNavigationOnClickListener(new h());
            this.f87303t.setPadding(0, com.max.hbutils.utils.t.p(this.f87292i), 0, 0);
            try {
                com.max.hbutils.utils.t.N(getDialog().getWindow(), true);
                getDialog().getWindow().setStatusBarColor(com.max.xiaoheihe.utils.d.E(R.color.background_layer_2_color));
            } catch (Throwable unused) {
            }
        }
    }

    private void D4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 35257, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        t4();
        E4(str);
    }

    private void E4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 35258, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        y6 y6VarD = y6.d(LayoutInflater.from(this.f87292i), null, false);
        com.max.hbcommon.component.i iVar = new com.max.hbcommon.component.i((Context) this.f87292i, true, (View) y6VarD.b());
        y6VarD.f117795c.setOnClickListener(new m(iVar));
        y6VarD.f117800h.setBackground(com.max.hbutils.utils.q.E(this.f87292i, R.color.divider_secondary_2_color, 12.0f));
        GradientDrawable gradientDrawableM = com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.o(this.f87292i, R.color.white, 4.0f), this.f87292i, R.color.divider_secondary_1_color, 0.5f);
        y6VarD.f117797e.setText(str);
        y6VarD.f117796d.setBackground(gradientDrawableM);
        y6VarD.f117794b.setRightClickListener(new a(iVar));
        iVar.show();
        iVar.f(false);
    }

    private void F4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35253, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        G4("同步失败");
    }

    private void G4(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 35254, new Class[]{String.class}, Void.TYPE).isSupported && isActive()) {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(str);
            this.f87300q = "2";
            dismiss();
        }
    }

    @SuppressLint({"AutoDispose"})
    private void H4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 35251, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().m4(this.f87302s.getComment_link_id(), str, this.f87302s.getFrom()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new com.max.hbcommon.network.p());
    }

    private void I4() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35252, new Class[0], Void.TYPE).isSupported && isActive()) {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f("同步成功");
            this.f87300q = "1";
            dismiss();
        }
    }

    static /* synthetic */ void P3(d2 d2Var) {
        if (PatchProxy.proxy(new Object[]{d2Var}, null, changeQuickRedirect, true, 35267, new Class[]{d2.class}, Void.TYPE).isSupported) {
            return;
        }
        d2Var.q4();
    }

    static /* synthetic */ void S3(d2 d2Var) {
        if (PatchProxy.proxy(new Object[]{d2Var}, null, changeQuickRedirect, true, 35268, new Class[]{d2.class}, Void.TYPE).isSupported) {
            return;
        }
        d2Var.C4();
    }

    static /* synthetic */ String T3(d2 d2Var, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{d2Var, str}, null, changeQuickRedirect, true, 35269, new Class[]{d2.class, String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : d2Var.s4(str);
    }

    static /* synthetic */ void U3(d2 d2Var) {
        if (PatchProxy.proxy(new Object[]{d2Var}, null, changeQuickRedirect, true, 35270, new Class[]{d2.class}, Void.TYPE).isSupported) {
            return;
        }
        d2Var.n4();
    }

    static /* synthetic */ void Z3(d2 d2Var) {
        if (PatchProxy.proxy(new Object[]{d2Var}, null, changeQuickRedirect, true, 35271, new Class[]{d2.class}, Void.TYPE).isSupported) {
            return;
        }
        d2Var.I4();
    }

    static /* synthetic */ void b4(d2 d2Var) {
        if (PatchProxy.proxy(new Object[]{d2Var}, null, changeQuickRedirect, true, 35272, new Class[]{d2.class}, Void.TYPE).isSupported) {
            return;
        }
        d2Var.o4();
    }

    static /* synthetic */ void c4(d2 d2Var, String str) {
        if (PatchProxy.proxy(new Object[]{d2Var, str}, null, changeQuickRedirect, true, 35273, new Class[]{d2.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        d2Var.D4(str);
    }

    static /* synthetic */ void d4(d2 d2Var, JsonObject jsonObject) {
        if (PatchProxy.proxy(new Object[]{d2Var, jsonObject}, null, changeQuickRedirect, true, 35274, new Class[]{d2.class, JsonObject.class}, Void.TYPE).isSupported) {
            return;
        }
        d2Var.w4(jsonObject);
    }

    static /* synthetic */ void e4(d2 d2Var) {
        if (PatchProxy.proxy(new Object[]{d2Var}, null, changeQuickRedirect, true, 35275, new Class[]{d2.class}, Void.TYPE).isSupported) {
            return;
        }
        d2Var.F4();
    }

    static /* synthetic */ void g4(d2 d2Var) {
        if (PatchProxy.proxy(new Object[]{d2Var}, null, changeQuickRedirect, true, 35264, new Class[]{d2.class}, Void.TYPE).isSupported) {
            return;
        }
        d2Var.u4();
    }

    static /* synthetic */ void h4(d2 d2Var) {
        if (PatchProxy.proxy(new Object[]{d2Var}, null, changeQuickRedirect, true, 35265, new Class[]{d2.class}, Void.TYPE).isSupported) {
            return;
        }
        d2Var.m4();
    }

    static /* synthetic */ void i4(d2 d2Var, String str) {
        if (PatchProxy.proxy(new Object[]{d2Var, str}, null, changeQuickRedirect, true, 35266, new Class[]{d2.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        d2Var.p4(str);
    }

    private void m4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35246, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f87291h.a(new okhttp3.a0.a().B(f87286w).b()).enqueue(new j());
    }

    private void n4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35248, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        okhttp3.q.a aVar = new okhttp3.q.a();
        aVar.a("sessionid", s4("https://store.steampowered.com/friends/recommendgame"));
        aVar.a("appid", this.f87288e);
        aVar.a("steamworksappid", this.f87288e);
        aVar.a("comment", this.f87297n);
        aVar.a("rated_up", this.f87298o);
        aVar.a("is_public", "true");
        aVar.a(ak.N, "schinese");
        aVar.a("received_compensation", "0");
        aVar.a("disable_comments", "0");
        z4("https://store.steampowered.com/friends/recommendgame", aVar.c(), new l());
    }

    private void o4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35259, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String str = "https://steamcommunity.com/userreviews/update/" + this.f87296m;
        String strS4 = s4(str);
        B4();
        okhttp3.q.a aVar = new okhttp3.q.a();
        com.max.heybox.hblog.g.W("editComment sessionId: " + strS4);
        aVar.a("sessionid", strS4);
        aVar.a("review_text", this.f87297n);
        aVar.a("voted_up", this.f87298o);
        aVar.a("received_compensation", "false");
        z4(str, aVar.c(), new b());
    }

    private void p4(String str) {
        WebviewFragment webviewFragment;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 35244, new Class[]{String.class}, Void.TYPE).isSupported || (webviewFragment = (WebviewFragment) getChildFragmentManager().r0(R.id.fragment_container)) == null) {
            return;
        }
        webviewFragment.H6(str, null);
    }

    private void q4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35247, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.W("getCommentStatus");
        B4();
        this.f87291h.a(new okhttp3.a0.a().B(String.format("https://steamcommunity.com/profiles/%s/recommended/%s/", this.f87295l, this.f87288e)).b()).enqueue(new k());
    }

    private void r4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35242, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        B4();
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().g4().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g()));
    }

    private String s4(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 35262, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String strValue = this.f87294k;
        com.max.heybox.hblog.g.G("getSessionIdByCookies before sessionId: " + strValue);
        try {
            List<Cookie> listA = this.f87290g.a(okhttp3.t.J(str));
            if (!com.max.hbcommon.utils.c.w(listA)) {
                for (Cookie cookie : listA) {
                    if ("sessionid".equals(cookie.name()) && !com.max.hbcommon.utils.c.u(cookie.value())) {
                        strValue = cookie.value();
                        com.max.heybox.hblog.g.G("getSessionIdByCookies middle sessionId: " + strValue);
                        break;
                    }
                }
            }
        } catch (Throwable th2) {
            com.max.heybox.hblog.g.G("getSessionIdByCookies error " + th2.getMessage());
        }
        com.max.heybox.hblog.g.G("getSessionIdByCookies after sessionId: " + strValue);
        return strValue;
    }

    private void t4() {
        LoadingDialog loadingDialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35238, new Class[0], Void.TYPE).isSupported || !isActive() || this.f87292i.isFinishing() || (loadingDialog = this.f87299p) == null) {
            return;
        }
        loadingDialog.c();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00a2  */
    private void u4() {
        String str;
        String str2;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35240, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f87290g = new b2(new ka.d(this.f87292i));
        MagicUtil.ConnectType connectType = this.f87293j;
        if (connectType == MagicUtil.ConnectType.IP_Direct) {
            this.f87291h = new okhttp3.z().e0().o(this.f87290g).r(new HBNetEventListener()).d(new com.max.xiaoheihe.network.g()).q(new f()).c(new e()).f();
            return;
        }
        if (connectType != MagicUtil.ConnectType.Proxy) {
            this.f87291h = new okhttp3.z().e0().o(this.f87290g).d(new com.max.xiaoheihe.network.g()).f();
            return;
        }
        if (this.f87289f.getSteam_proxy() == null || this.f87289f.getSteam_proxy().getProxy() == null) {
            str = null;
            str2 = null;
        } else {
            String strV = com.max.xiaoheihe.utils.d.v(this.f87289f.getSteam_proxy().getProxy());
            if (com.max.hbcommon.utils.c.u(strV)) {
                str = null;
                str2 = null;
            } else {
                String[] strArrSplit = strV.split(":");
                if (strArrSplit.length > 1) {
                    str = strArrSplit[0];
                    str2 = strArrSplit[1];
                } else {
                    str = null;
                    str2 = null;
                }
            }
        }
        this.f87291h = new okhttp3.z().e0().o(this.f87290g).g0(com.max.hbcommon.utils.c.u(str) ? null : new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str, com.max.hbutils.utils.n.q(str2)))).d(new com.max.xiaoheihe.network.g()).f();
    }

    public static d2 v4(SyncSteamCommentObj syncSteamCommentObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{syncSteamCommentObj}, null, changeQuickRedirect, true, 35235, new Class[]{SyncSteamCommentObj.class}, d2.class);
        if (patchProxyResultProxy.isSupported) {
            return (d2) patchProxyResultProxy.result;
        }
        d2 d2Var = new d2();
        Bundle bundle = new Bundle();
        bundle.putSerializable(f87285v, syncSteamCommentObj);
        d2Var.setArguments(bundle);
        return d2Var;
    }

    private void w4(JsonObject jsonObject) {
        if (PatchProxy.proxy(new Object[]{jsonObject}, this, changeQuickRedirect, false, 35260, new Class[]{JsonObject.class}, Void.TYPE).isSupported) {
            return;
        }
        if (jsonObject == null) {
            F4();
            return;
        }
        String asString = jsonObject.get("success").getAsString();
        if (com.max.hbcommon.utils.c.x(asString)) {
            I4();
            return;
        }
        if (!"15".equals(asString)) {
            G4(jsonObject.get("strError") != null ? jsonObject.get("strError").getAsString() : "同步失败");
        } else if (com.max.hbcommon.utils.i.d()) {
            com.max.xiaoheihe.utils.d.h(this.f87292i);
            G4("自动同步失败，请稍后重试");
        } else {
            this.f87300q = "2";
            y4(this.f87292i);
        }
    }

    private void x4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 35250, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        H4(str);
    }

    private void z4(String str, okhttp3.b0 b0Var, com.max.xiaoheihe.network.h hVar) {
        if (PatchProxy.proxy(new Object[]{str, b0Var, hVar}, this, changeQuickRedirect, false, 35263, new Class[]{String.class, okhttp3.b0.class, com.max.xiaoheihe.network.h.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.f.a(this.f87291h.a(new okhttp3.a0.a().r(b0Var).n("Accept-Language", "zh-CN,zh-Hans;q=0.9").B(str).b()), hVar);
    }

    @Override // com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    @Override // androidx.fragment.app.j
    public void dismiss() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35255, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.dismiss();
        t4();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, 35236, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        com.max.xiaoheihe.utils.b0.c(false);
        if (getArguments() != null) {
            SyncSteamCommentObj syncSteamCommentObj = (SyncSteamCommentObj) getArguments().getSerializable(f87285v);
            this.f87302s = syncSteamCommentObj;
            if (syncSteamCommentObj != null) {
                this.f87288e = syncSteamCommentObj.getApp_id();
                this.f87297n = this.f87302s.getComment();
                this.f87298o = com.max.hbutils.utils.n.q(this.f87302s.getScore()) > 3 ? "true" : "false";
            }
        }
        this.f87301r = "\n——来自" + com.max.xiaoheihe.utils.d.A() + "用户" + com.max.xiaoheihe.utils.i0.k() + "的评价";
        if (com.max.hbcommon.utils.c.x(this.f87298o)) {
            this.f87297n += this.f87301r;
        }
        this.f87292i = getActivity();
        return layoutInflater.inflate(R.layout.fragment_sync_comment_to_steam, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35256, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        com.max.xiaoheihe.utils.b0.c(true);
        t4();
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35249, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        x4(this.f87300q);
        super.onDestroyView();
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35241, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        if (this.f87289f == null) {
            r4();
        }
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 35239, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        this.f87303t = (LinearLayout) view.findViewById(R.id.vg_sync_container);
        this.f87304u = (TitleBar) view.findViewById(R.id.title_bar);
    }

    public void y4(Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 35261, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        new com.max.hbcommon.view.a.f(activity).y("自动同步失败").l("请开启小黑盒加速器后重试").u("去开启", new d(activity)).o(com.max.xiaoheihe.utils.d.n0(R.string.cancel), new c()).g(false).F();
    }
}
