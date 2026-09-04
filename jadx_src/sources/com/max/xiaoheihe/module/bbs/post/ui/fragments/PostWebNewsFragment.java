package com.max.xiaoheihe.module.bbs.post.ui.fragments;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.adapter.OneTimeValidExposureViewWatcher;
import com.max.hbcommon.bean.AdsBannerObj;
import com.max.hbcommon.network.ApiException;
import com.max.hbshare.bean.HBShareProtocolData;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.WebCallbackObj;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkTreeObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.BBSWebShareObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.module.analytics.LogcatPrinter;
import com.max.xiaoheihe.module.bbs.p0;
import com.max.xiaoheihe.module.bbs.post.PostPageFactory;
import com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity;
import com.max.xiaoheihe.module.bbs.post.ui.activitys.WebNewsPostPageActivity;
import com.max.xiaoheihe.module.webview.component.LinkWebView;
import com.max.xiaoheihe.module.webview.d0;
import com.max.xiaoheihe.module.webview.s;
import com.max.xiaoheihe.module.webview.t;
import com.max.xiaoheihe.module.webview.y;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.l0;
import com.max.xiaoheihe.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.media.UMImage;
import com.umeng.umcrash.UMCrash;
import dl.d;
import io.reactivex.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: PostWebNewsFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class PostWebNewsFragment extends PostCommentFragment implements t {

    @dl.d
    public static final a J3 = new a(null);
    public static final int K3 = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean G2;

    @dl.e
    private LinkWebView Y;

    @dl.e
    private kf.b Z;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f81932p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @dl.e
    private String f81933p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private float f81934p3;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private boolean f81935x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @dl.e
    private String f81936x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private int f81937y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private int f81938y2;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @dl.d
    private final e f81929a0 = new e(this);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f81930b0 = -1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f81931c0 = true;
    private int G3 = -1;

    /* JADX INFO: compiled from: PostWebNewsFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final PostWebNewsFragment a(@dl.e String str, @dl.e LinkInfoObj linkInfoObj, @dl.e String str2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, linkInfoObj, str2}, this, changeQuickRedirect, false, 29395, new Class[]{String.class, LinkInfoObj.class, String.class}, PostWebNewsFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (PostWebNewsFragment) patchProxyResultProxy.result;
            }
            Bundle bundle = new Bundle();
            bundle.putString(PostPageFactory.f81483s, str);
            bundle.putSerializable(PostPageFactory.f81482r, linkInfoObj);
            bundle.putString(PostPageFactory.f81471g, str2);
            PostWebNewsFragment postWebNewsFragment = new PostWebNewsFragment();
            postWebNewsFragment.setArguments(bundle);
            return postWebNewsFragment;
        }
    }

    /* JADX INFO: compiled from: PostWebNewsFragment.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static class b implements d0.g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f81939c = 8;
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final WeakReference<PostWebNewsFragment> f81940b;

        public b(@dl.d PostWebNewsFragment fragment) {
            f0.p(fragment, "fragment");
            this.f81940b = new WeakReference<>(fragment);
        }

        @Override // com.max.xiaoheihe.module.webview.d0.g
        public void a() {
            PostWebNewsFragment postWebNewsFragment;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29396, new Class[0], Void.TYPE).isSupported || (postWebNewsFragment = this.f81940b.get()) == null) {
                return;
            }
            PostWebNewsFragment.c8(postWebNewsFragment, false, 1, null);
        }

        @Override // com.max.xiaoheihe.module.webview.d0.g
        public void b(@dl.e String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29397, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            PostWebNewsFragment postWebNewsFragment = this.f81940b.get();
            Log.d("LinkJsCallback", "request: " + str);
            if (postWebNewsFragment != null) {
                Object objA = com.max.hbutils.utils.k.a(str, WebCallbackObj.class);
                f0.o(objA, "deserialize(json, WebCallbackObj::class.java)");
                PostWebNewsFragment.E7(postWebNewsFragment, (WebCallbackObj) objA);
            }
        }

        @Override // com.max.xiaoheihe.module.webview.d0.g
        public void c(@dl.e String str) {
            PostWebNewsFragment postWebNewsFragment;
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29398, new Class[]{String.class}, Void.TYPE).isSupported || !f0.g(d0.g.f94688a, str) || (postWebNewsFragment = this.f81940b.get()) == null) {
                return;
            }
            postWebNewsFragment.W7();
        }
    }

    /* JADX INFO: compiled from: PostWebNewsFragment.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static class c extends WebChromeClient {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f81941b = 8;
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final WeakReference<PostWebNewsFragment> f81942a;

        public c(@dl.d PostWebNewsFragment fragment) {
            f0.p(fragment, "fragment");
            this.f81942a = new WeakReference<>(fragment);
        }

        @Override // android.webkit.WebChromeClient
        @dl.e
        public Bitmap getDefaultVideoPoster() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29399, new Class[0], Bitmap.class);
            if (patchProxyResultProxy.isSupported) {
                return (Bitmap) patchProxyResultProxy.result;
            }
            return super.getDefaultVideoPoster() == null ? BitmapFactory.decodeResource(com.max.xiaoheihe.utils.d.l0(), R.drawable.share_thumbnail) : super.getDefaultVideoPoster();
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(@dl.e WebView webView, int i10) {
            if (PatchProxy.proxy(new Object[]{webView, new Integer(i10)}, this, changeQuickRedirect, false, 29400, new Class[]{WebView.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.onProgressChanged(webView, i10);
            PostWebNewsFragment postWebNewsFragment = this.f81942a.get();
            if (postWebNewsFragment != null) {
                PostWebNewsFragment.m7(postWebNewsFragment);
            }
        }
    }

    /* JADX INFO: compiled from: PostWebNewsFragment.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static class d extends d0.h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f81943b = 8;
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final WeakReference<PostWebNewsFragment> f81944a;

        public d(@dl.d PostWebNewsFragment fragment) {
            f0.p(fragment, "fragment");
            this.f81944a = new WeakReference<>(fragment);
        }

        @Override // android.webkit.WebViewClient
        @dl.e
        public WebResourceResponse shouldInterceptRequest(@dl.e WebView webView, @dl.d WebResourceRequest webResourceRequest) {
            WebResourceResponse webResourceResponseD;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webView, webResourceRequest}, this, changeQuickRedirect, false, 29402, new Class[]{WebView.class, WebResourceRequest.class}, WebResourceResponse.class);
            if (patchProxyResultProxy.isSupported) {
                return (WebResourceResponse) patchProxyResultProxy.result;
            }
            f0.p(webResourceRequest, "webResourceRequest");
            if (y.j(webResourceRequest.getUrl())) {
                com.max.hbcommon.utils.d.b("zzzzwebpost", "try intercept");
                try {
                    if (y.i(webResourceRequest.getUrl()) && (webResourceResponseD = y.d(webView, y.f(webResourceRequest.getUrl()))) != null) {
                        return webResourceResponseD;
                    }
                } catch (Throwable unused) {
                }
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // com.max.xiaoheihe.module.webview.d0.h, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@dl.e WebView webView, @dl.e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 29401, new Class[]{WebView.class, String.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            PostWebNewsFragment postWebNewsFragment = this.f81944a.get();
            if (postWebNewsFragment != null && postWebNewsFragment.isAdded() && postWebNewsFragment.getContext() != null && str != null) {
                Context contextRequireContext = postWebNewsFragment.requireContext();
                f0.o(contextRequireContext, "fragment.requireContext()");
                com.max.xiaoheihe.base.router.b.l0(contextRequireContext, str, webView, null, postWebNewsFragment);
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: PostWebNewsFragment.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static class e extends Handler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f81945b = 8;
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final WeakReference<PostWebNewsFragment> f81946a;

        public e(@dl.d PostWebNewsFragment fragment) {
            f0.p(fragment, "fragment");
            this.f81946a = new WeakReference<>(fragment);
        }

        @Override // android.os.Handler
        public void handleMessage(@dl.d Message msg) {
            if (PatchProxy.proxy(new Object[]{msg}, this, changeQuickRedirect, false, 29403, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(msg, "msg");
            super.handleMessage(msg);
            PostWebNewsFragment postWebNewsFragment = this.f81946a.get();
            if (postWebNewsFragment != null) {
                int i10 = msg.what;
                if (i10 == 1) {
                    PostWebNewsFragment.y7(postWebNewsFragment);
                    return;
                }
                if (i10 == 2) {
                    PostWebNewsFragment.n7(postWebNewsFragment);
                    return;
                }
                if (i10 == 4) {
                    PostWebNewsFragment.A7(postWebNewsFragment);
                } else if (i10 == 8) {
                    PostWebNewsFragment.z7(postWebNewsFragment);
                } else if (i10 == 16) {
                    postWebNewsFragment.p6();
                }
            }
        }
    }

    /* JADX INFO: compiled from: PostWebNewsFragment.kt */
    public static final class f implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f81948c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ValueCallback<String> f81949d;

        f(String str, ValueCallback<String> valueCallback) {
            this.f81948c = str;
            this.f81949d = valueCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            LinkWebView linkWebView;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29404, new Class[0], Void.TYPE).isSupported || (linkWebView = PostWebNewsFragment.this.Y) == null) {
                return;
            }
            linkWebView.evaluateJavascript(this.f81948c, this.f81949d);
        }
    }

    /* JADX INFO: compiled from: PostWebNewsFragment.kt */
    public static final class g extends c {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.e
        private View f81950c;

        /* JADX INFO: compiled from: PostWebNewsFragment.kt */
        public final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f81952a;

            static {
                int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
                try {
                    iArr[ConsoleMessage.MessageLevel.LOG.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ConsoleMessage.MessageLevel.TIP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f81952a = iArr;
            }
        }

        g() {
            super(PostWebNewsFragment.this);
        }

        @dl.e
        public final View a() {
            return this.f81950c;
        }

        public final void b(@dl.e View view) {
            this.f81950c = view;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(@dl.e ConsoleMessage consoleMessage) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{consoleMessage}, this, changeQuickRedirect, false, 29407, new Class[]{ConsoleMessage.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            String strMessage = consoleMessage != null ? consoleMessage.message() : null;
            com.max.heybox.hblog.g gVarJ = com.max.heybox.hblog.g.f74531b.J();
            if (strMessage != null && gVarJ != null) {
                ConsoleMessage.MessageLevel messageLevel = consoleMessage.messageLevel();
                int i10 = messageLevel == null ? -1 : a.f81952a[messageLevel.ordinal()];
                if (i10 == 1) {
                    gVarJ.k0(strMessage);
                } else if (i10 == 2) {
                    gVarJ.a0(strMessage);
                } else if (i10 == 3) {
                    gVarJ.L(strMessage);
                } else if (i10 != 4) {
                    gVarJ.C(strMessage);
                } else {
                    gVarJ.s0(strMessage);
                }
            }
            return super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29406, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            super.onHideCustomView();
            if (PostWebNewsFragment.this.Z == null || this.f81950c == null) {
                return;
            }
            kf.b bVar = PostWebNewsFragment.this.Z;
            if (bVar != null) {
                bVar.G();
            }
            PostWebNewsFragment.this.E5().f112942c.addView(PostWebNewsFragment.this.Y, 0, new ConsecutiveScrollerLayout.LayoutParams(-1, -2));
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(@dl.d View view, @dl.d WebChromeClient.CustomViewCallback customViewCallback) {
            if (PatchProxy.proxy(new Object[]{view, customViewCallback}, this, changeQuickRedirect, false, 29405, new Class[]{View.class, WebChromeClient.CustomViewCallback.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(view, "view");
            f0.p(customViewCallback, "customViewCallback");
            super.onShowCustomView(view, customViewCallback);
            if (PostWebNewsFragment.this.Z != null) {
                kf.b bVar = PostWebNewsFragment.this.Z;
                if (bVar != null) {
                    bVar.showCustomView(view);
                }
                LinkWebView linkWebView = PostWebNewsFragment.this.Y;
                ViewGroup viewGroup = (ViewGroup) (linkWebView != null ? linkWebView.getParent() : null);
                if (viewGroup != null) {
                    viewGroup.removeView(PostWebNewsFragment.this.Y);
                }
                this.f81950c = view;
            }
        }
    }

    /* JADX INFO: compiled from: PostWebNewsFragment.kt */
    public static final class h implements ConsecutiveScrollerLayout.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout.h
        public final void a(View v10, int i10, int i11, int i12) {
            Object[] objArr = {v10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 29408, new Class[]{View.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            PostWebNewsFragment postWebNewsFragment = PostWebNewsFragment.this;
            f0.o(v10, "v");
            postWebNewsFragment.u6(v10, i10, i11, i12, PostWebNewsFragment.this.G3);
            PostWebNewsFragment.this.G3 = i12;
            PostWebNewsFragment.l7(PostWebNewsFragment.this);
            PostWebNewsFragment.this.B6();
            if (ad.a.b(ad.a.f1199f, false, 2, null)) {
                Activity mContext = ((com.max.hbcommon.base.d) PostWebNewsFragment.this).mContext;
                f0.o(mContext, "mContext");
                int iC = com.max.xiaoheihe.accelworld.l.c(44.0f, mContext);
                if (PostWebNewsFragment.this.f81934p3 > 0.0f) {
                    Activity activity = ((com.max.hbcommon.base.d) PostWebNewsFragment.this).mContext;
                    BasePostPageActivity basePostPageActivity = activity instanceof BasePostPageActivity ? (BasePostPageActivity) activity : null;
                    if (basePostPageActivity != null) {
                        float f10 = PostWebNewsFragment.this.f81934p3;
                        Activity mContext2 = ((com.max.hbcommon.base.d) PostWebNewsFragment.this).mContext;
                        f0.o(mContext2, "mContext");
                        basePostPageActivity.e5((i10 - com.max.accelworld.c.a(f10, mContext2)) / iC);
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: PostWebNewsFragment.kt */
    public static final class i implements l0.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // com.max.xiaoheihe.utils.l0.g
        public final void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29409, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            PostWebNewsFragment.w7(PostWebNewsFragment.this);
        }
    }

    /* JADX INFO: compiled from: PostWebNewsFragment.kt */
    public static final class j<T> implements ValueCallback {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0.g f81956b;

        j(l0.g gVar) {
            this.f81956b = gVar;
        }

        public final void a(String str) {
            if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29412, new Class[]{String.class}, Void.TYPE).isSupported && PostWebNewsFragment.this.isActive()) {
                BBSWebShareObj bBSWebShareObj = str != null ? (BBSWebShareObj) com.max.hbutils.utils.k.a(str, BBSWebShareObj.class) : null;
                if (bBSWebShareObj != null) {
                    String desc = bBSWebShareObj.getDesc();
                    String firstImg = bBSWebShareObj.getFirstImg();
                    if (!com.max.hbcommon.utils.c.u(desc) && PostWebNewsFragment.this.k4() == null) {
                        PostWebNewsFragment.this.Q4(desc);
                    }
                    if (!com.max.hbcommon.utils.c.u(firstImg) && PostWebNewsFragment.this.l4() == null) {
                        if (y.j(Uri.parse(firstImg))) {
                            String string = y.f(Uri.parse(firstImg)).toString();
                            f0.o(string, "getOriginRequestUri(Uri.…              .toString()");
                            PostWebNewsFragment.this.R4(new UMImage(((com.max.hbcommon.base.d) PostWebNewsFragment.this).mContext, string));
                        } else {
                            PostWebNewsFragment.this.R4(new UMImage(((com.max.hbcommon.base.d) PostWebNewsFragment.this).mContext, firstImg));
                        }
                    }
                    l0.g gVar = this.f81956b;
                    if (gVar != null) {
                        gVar.a();
                    }
                }
            }
        }

        @Override // android.webkit.ValueCallback
        public /* bridge */ /* synthetic */ void onReceiveValue(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29413, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((String) obj);
        }
    }

    /* JADX INFO: compiled from: PostWebNewsFragment.kt */
    public static final class k implements l0.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // com.max.xiaoheihe.utils.l0.g
        public final void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29414, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            PostWebNewsFragment.x7(PostWebNewsFragment.this);
        }
    }

    /* JADX INFO: compiled from: PostWebNewsFragment.kt */
    public static final class l implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29415, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            PostWebNewsFragment postWebNewsFragment = PostWebNewsFragment.this;
            postWebNewsFragment.D6(postWebNewsFragment.a6(), true);
            PostWebNewsFragment.this.Z6(null);
        }
    }

    /* JADX INFO: compiled from: PostWebNewsFragment.kt */
    public static final class m<T, R> implements kh.o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final m<T, R> f81959b = new m<>();
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        public final String a(@dl.d okhttp3.d0 responseBody) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{responseBody}, this, changeQuickRedirect, false, 29416, new Class[]{okhttp3.d0.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            f0.p(responseBody, "responseBody");
            return responseBody.string();
        }

        @Override // kh.o
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29417, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a((okhttp3.d0) obj);
        }
    }

    /* JADX INFO: compiled from: PostWebNewsFragment.kt */
    public static final class n extends com.max.hbcommon.network.d<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        public void a(@dl.d String s10) {
            if (PatchProxy.proxy(new Object[]{s10}, this, changeQuickRedirect, false, 29419, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(s10, "s");
            if (PostWebNewsFragment.this.isActive()) {
                super.onNext(s10);
                LinkWebView linkWebView = PostWebNewsFragment.this.Y;
                if (linkWebView != null) {
                    linkWebView.setTag(R.id.rb_1, s10);
                }
                PostWebNewsFragment.c8(PostWebNewsFragment.this, false, 1, null);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 29418, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (PostWebNewsFragment.this.isActive()) {
                super.onError(e10);
                PostWebNewsFragment.D7(PostWebNewsFragment.this);
                PostWebNewsFragment.v7(PostWebNewsFragment.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29420, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((String) obj);
        }
    }

    /* JADX INFO: compiled from: PostWebNewsFragment.kt */
    public static final class o implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: PostWebNewsFragment.kt */
        public static final class a<T> implements ValueCallback {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ PostWebNewsFragment f81962a;

            a(PostWebNewsFragment postWebNewsFragment) {
                this.f81962a = postWebNewsFragment;
            }

            public final void a(@dl.d String s10) {
                if (PatchProxy.proxy(new Object[]{s10}, this, changeQuickRedirect, false, 29422, new Class[]{String.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(s10, "s");
                if (!this.f81962a.isActive() || com.max.hbcommon.utils.c.u(s10) || f0.g("null", s10)) {
                    return;
                }
                PostWebNewsFragment postWebNewsFragment = this.f81962a;
                postWebNewsFragment.f81930b0 = ViewUtils.f(((com.max.hbcommon.base.d) postWebNewsFragment).mContext, 300.0f) + ViewUtils.f(((com.max.hbcommon.base.d) this.f81962a).mContext, Float.parseFloat(s10));
            }

            @Override // android.webkit.ValueCallback
            public /* bridge */ /* synthetic */ void onReceiveValue(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29423, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                a((String) obj);
            }
        }

        o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29421, new Class[0], Void.TYPE).isSupported && PostWebNewsFragment.this.isActive()) {
                PostWebNewsFragment postWebNewsFragment = PostWebNewsFragment.this;
                PostWebNewsFragment.o7(postWebNewsFragment, "getAuthorBoundingTop()", new a(postWebNewsFragment));
            }
        }
    }

    /* JADX INFO: compiled from: PostWebNewsFragment.kt */
    public static final class p implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 29424, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            PostWebNewsFragment.p7(PostWebNewsFragment.this);
        }
    }

    /* JADX INFO: compiled from: PostWebNewsFragment.kt */
    public static final class q extends com.max.hbcommon.network.d<JsonObject> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f81965b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PostWebNewsFragment f81966c;

        q(String str, PostWebNewsFragment postWebNewsFragment) {
            this.f81965b = str;
            this.f81966c = postWebNewsFragment;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 29425, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (!(e10 instanceof ApiException)) {
                super.onError(e10);
                return;
            }
            WebCallbackObj webCallbackObj = new WebCallbackObj();
            webCallbackObj.setId(this.f81965b);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("status", ((ApiException) e10).d());
            jsonObject.addProperty("msg", e10.getMessage());
            webCallbackObj.setContent(jsonObject);
            this.f81966c.T3("httpCallback(" + com.max.hbutils.utils.k.p(webCallbackObj) + ");");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("httpCallback==");
            sb2.append(com.max.hbutils.utils.k.p(webCallbackObj));
            com.max.hbcommon.utils.d.b("zzzzwebpost", sb2.toString());
            if (f0.g(z5.f.f141859j, ((ApiException) e10).d())) {
                return;
            }
            super.onError(e10);
        }

        public void onNext(@dl.d JsonObject result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 29426, new Class[]{JsonObject.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (this.f81966c.isActive()) {
                WebCallbackObj webCallbackObj = new WebCallbackObj();
                webCallbackObj.setId(this.f81965b);
                webCallbackObj.setContent(result);
                this.f81966c.T3("httpCallback(" + com.max.hbutils.utils.k.p(webCallbackObj) + ");");
                if (f0.g("follow", this.f81965b)) {
                    v.a(((com.max.hbcommon.base.d) this.f81966c).mContext, v.f95763d, null);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29427, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((JsonObject) obj);
        }
    }

    public static final /* synthetic */ void A7(PostWebNewsFragment postWebNewsFragment) {
        if (PatchProxy.proxy(new Object[]{postWebNewsFragment}, null, changeQuickRedirect, true, 29393, new Class[]{PostWebNewsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postWebNewsFragment.d8();
    }

    public static final /* synthetic */ void D7(PostWebNewsFragment postWebNewsFragment) {
        if (PatchProxy.proxy(new Object[]{postWebNewsFragment}, null, changeQuickRedirect, true, 29384, new Class[]{PostWebNewsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postWebNewsFragment.showError();
    }

    public static final /* synthetic */ void E7(PostWebNewsFragment postWebNewsFragment, WebCallbackObj webCallbackObj) {
        if (PatchProxy.proxy(new Object[]{postWebNewsFragment, webCallbackObj}, null, changeQuickRedirect, true, 29389, new Class[]{PostWebNewsFragment.class, WebCallbackObj.class}, Void.TYPE).isSupported) {
            return;
        }
        postWebNewsFragment.h8(webCallbackObj);
    }

    private final void G7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29368, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (R7()) {
            N6(false);
            s6();
        } else {
            N6(true);
            r6();
        }
        if (j6()) {
            K6(false);
            o6();
        } else {
            K6(true);
            n6();
        }
    }

    private final void H7() {
    }

    private final void I7() {
        LinkWebView linkWebView;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29379, new Class[0], Void.TYPE).isSupported || (linkWebView = this.Y) == null) {
            return;
        }
        f0.m(linkWebView);
        linkWebView.loadUrl("");
        LinkWebView linkWebView2 = this.Y;
        f0.m(linkWebView2);
        linkWebView2.stopLoading();
        LinkWebView linkWebView3 = this.Y;
        f0.m(linkWebView3);
        linkWebView3.setWebChromeClient(null);
        LinkWebView linkWebView4 = this.Y;
        f0.m(linkWebView4);
        ViewParent parent = linkWebView4.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.Y);
        }
        LinkWebView linkWebView5 = this.Y;
        f0.m(linkWebView5);
        linkWebView5.destroy();
        this.Y = null;
    }

    private final void J7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29343, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        U4();
        if (E5().f112950k.getVisibility() != 0) {
            this.f81929a0.sendEmptyMessageDelayed(8, 100L);
        }
    }

    private final void K7(String str, ValueCallback<String> valueCallback) {
        if (PatchProxy.proxy(new Object[]{str, valueCallback}, this, changeQuickRedirect, false, 29335, new Class[]{String.class, ValueCallback.class}, Void.TYPE).isSupported) {
            return;
        }
        LinkWebView linkWebView = this.Y;
        Boolean bool = (Boolean) (linkWebView != null ? linkWebView.getTag(R.id.webview_allow_ev_js) : null);
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        aVar.M("web贴 try to evaluateJavascript js allowEvaluateJS: " + bool + "  " + str);
        if (f0.g(bool, Boolean.TRUE) || ad.a.a(ad.a.f1207n, false)) {
            aVar.M("web贴 evaluateJavascript js: " + str);
            Activity activity = this.mContext;
            if (activity == null || str == null) {
                return;
            }
            activity.runOnUiThread(new f(str, valueCallback));
        }
    }

    private final void L7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29321, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        K7("linkRefresh()", null);
    }

    private final String M7(LinkInfoObj linkInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{linkInfoObj}, this, changeQuickRedirect, false, 29380, new Class[]{LinkInfoObj.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (linkInfoObj != null) {
            return linkInfoObj.getCustom_origin_gson_str();
        }
        return null;
    }

    private final String N7(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29339, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        Map<String, String> mapO4 = o4();
        if (!com.max.hbcommon.utils.c.u(b4())) {
            mapO4.put("h_src", b4());
        }
        return l0.f(str, mapO4);
    }

    private final String O7(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 29338, new Class[]{Boolean.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String str = com.max.hbcommon.network.b.c() + lb.a.W2;
        Map<String, String> mapO4 = o4();
        mapO4.put("link_id", c4());
        if (z10) {
            mapO4.put("return_json", "1");
        }
        if (!m4()) {
            mapO4.put("in_topic", "1");
        }
        if (!com.max.hbcommon.utils.c.u(b4())) {
            mapO4.put("h_src", b4());
        }
        return l0.f(str, mapO4);
    }

    private final String P7(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 29337, new Class[]{Boolean.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String str = this.f81936x2;
        if (str == null) {
            str = com.max.hbcommon.network.b.c() + lb.a.W2;
        }
        String strE = l0.e(str);
        Map<String, String> mapO4 = o4();
        mapO4.put("link_id", c4());
        if (z10) {
            mapO4.put("return_json", "1");
        }
        if (!m4()) {
            mapO4.put("in_topic", "1");
        }
        if (!com.max.hbcommon.utils.c.u(b4())) {
            mapO4.put("h_src", b4());
        }
        String url = l0.f(strE, mapO4);
        f0.o(url, "url");
        return url;
    }

    private final void Q7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29346, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E5().E.setVisibility(8);
        E5().f112948i.j();
    }

    private final boolean R7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29325, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        LinkWebView linkWebView = this.Y;
        return linkWebView != null && ViewUtils.f0(linkWebView);
    }

    private final void S7(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29370, new Class[]{String.class}, Void.TYPE).isSupported || d4() == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        linkInfoObjD4.setFollow_status(str);
        j5();
    }

    private final void T7() {
        int i10;
        WebSettings settings;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29350, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LinkWebView linkWebView = this.Y;
        String userAgentString = null;
        Object tag = linkWebView != null ? linkWebView.getTag(R.id.rb_0) : null;
        LinkWebView linkWebView2 = this.Y;
        Object tag2 = linkWebView2 != null ? linkWebView2.getTag(R.id.rb_1) : null;
        Integer num = d0.f94672c;
        boolean zG = f0.g(num, tag);
        boolean z10 = tag2 instanceof String;
        LinkWebView linkWebView3 = this.Y;
        if (linkWebView3 != null && (settings = linkWebView3.getSettings()) != null) {
            userAgentString = settings.getUserAgentString();
        }
        UMCrash.generateCustomLog(new IllegalArgumentException("Render failed: linkId: " + c4() + ", template: " + zG + ", content: " + z10 + ", stopLoad: " + this.f81935x1 + ", ua: " + userAgentString), "link RenderFailed");
        LogcatPrinter.c("chromium | grep CONSOLE", new yh.l<String, b2>() { // from class: com.max.xiaoheihe.module.bbs.post.ui.fragments.PostWebNewsFragment$onRenderFailed$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(String str) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29411, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2(str);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@d String it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 29410, new Class[]{String.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(it, "it");
                UMCrash.generateCustomLog(it, "link RenderFailed log");
            }
        });
        if (zG || (i10 = this.f81938y2) >= 3) {
            showError();
            Q7();
            return;
        }
        this.f81938y2 = i10 + 1;
        LinkWebView linkWebView4 = this.Y;
        if (linkWebView4 != null) {
            linkWebView4.setTag(R.id.rb_0, num);
        }
        g8();
    }

    private final void U7(l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, 29347, new Class[]{l0.g.class}, Void.TYPE).isSupported) {
            return;
        }
        K7("getWebShareContent()", new j(gVar));
    }

    private final void V7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29340, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f81935x1 = true;
        H7();
        this.f81929a0.sendEmptyMessage(2);
        a6();
    }

    private final void X7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29331, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().a(new HashMap(16), O7(true), new HashMap(16)).z3(m.f81959b).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new n()));
    }

    private final void Y7() {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29329, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!f0.g("0", com.max.hbcache.c.j("local_html_enabled")) && (com.max.hbcommon.utils.c.u(this.f81936x2) || !f0.g(e4(), "29"))) {
            z10 = true;
        }
        this.f81932p1 = z10;
    }

    private final void Z7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29367, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        G7();
        n5();
        l5();
        h5();
        j5();
        kf.a aVarG4 = g4();
        if (aVarG4 != null) {
            aVarG4.p1();
        }
    }

    private final void a8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29351, new Class[0], Void.TYPE).isSupported || !isActive() || E5().f112950k.getVisibility() == 0) {
            return;
        }
        E5().f112950k.setVisibility(0);
    }

    private final void b8(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 29332, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        LinkWebView linkWebView = this.Y;
        List listB = null;
        Object tag = linkWebView != null ? linkWebView.getTag(R.id.rb_0) : null;
        LinkWebView linkWebView2 = this.Y;
        Object tag2 = linkWebView2 != null ? linkWebView2.getTag(R.id.rb_1) : null;
        if (!f0.g(d0.f94672c, tag) || !(tag2 instanceof String)) {
            if (tag2 instanceof String) {
                this.f81929a0.removeMessages(4);
                this.f81929a0.sendEmptyMessageDelayed(4, 3000L);
                return;
            }
            return;
        }
        JsonObject jsonObject = (JsonObject) com.max.hbutils.utils.k.a((String) tag2, JsonObject.class);
        if (jsonObject.has("result")) {
            JsonObject asJsonObject = jsonObject.getAsJsonObject("result");
            if (asJsonObject.has("ads_banner")) {
                listB = com.max.hbutils.utils.k.b(asJsonObject.getAsJsonArray("ads_banner").toString(), AdsBannerObj.class);
            }
        }
        if (listB == null || listB.size() <= 0) {
            E5().f112941b.b().setVisibility(8);
            E5().f112961v.getRoot().setVisibility(0);
        } else {
            E5().f112941b.b().setVisibility(0);
            E5().f112961v.getRoot().setVisibility(8);
            com.max.hbcommon.utils.b.f(E5().f112941b.b(), listB);
        }
        WebCallbackObj webCallbackObj = new WebCallbackObj();
        webCallbackObj.setUrl(P7(false));
        webCallbackObj.setContent(jsonObject);
        if (z10) {
            webCallbackObj.setType("preload");
            com.max.hbcommon.utils.d.b("zzzzwebpagetime", "preload render" + System.currentTimeMillis());
        }
        T3("linkCallback(" + com.max.hbutils.utils.k.p(webCallbackObj) + ");");
        new Handler().postDelayed(new o(), 100L);
        this.f81929a0.removeMessages(4);
        this.f81929a0.sendEmptyMessageDelayed(4, 3000L);
    }

    static /* synthetic */ void c8(PostWebNewsFragment postWebNewsFragment, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{postWebNewsFragment, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 29333, new Class[]{PostWebNewsFragment.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        postWebNewsFragment.b8(z10);
    }

    private final void d8() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29348, new Class[0], Void.TYPE).isSupported && f0.g("page_style_news_content", i4()) && E5().E.getVisibility() == 0) {
            T7();
        }
    }

    private final void g8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29330, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f81932p1) {
            X7();
            return;
        }
        String strP7 = P7(false);
        l0.c(this.mContext, strP7);
        LinkWebView linkWebView = this.Y;
        if (linkWebView != null) {
            linkWebView.loadUrl(strP7);
        }
    }

    private final void h8(WebCallbackObj webCallbackObj) {
        if (PatchProxy.proxy(new Object[]{webCallbackObj}, this, changeQuickRedirect, false, 29334, new Class[]{WebCallbackObj.class}, Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap(16);
        z<JsonObject> zVarU7 = null;
        String strN7 = N7(webCallbackObj.getUrl());
        String id2 = webCallbackObj.getId();
        if (kotlin.text.u.L1("get", webCallbackObj.getMethods(), true)) {
            zVarU7 = com.max.xiaoheihe.network.i.a().F1(map, strN7, webCallbackObj.getData());
        } else if (kotlin.text.u.L1(ad.e.f1248a, webCallbackObj.getMethods(), true)) {
            zVarU7 = com.max.xiaoheihe.network.i.a().u7(map, strN7, webCallbackObj.getData());
        }
        if (zVarU7 == null) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) zVarU7.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new q(id2, this)));
    }

    public static final /* synthetic */ void l7(PostWebNewsFragment postWebNewsFragment) {
        if (PatchProxy.proxy(new Object[]{postWebNewsFragment}, null, changeQuickRedirect, true, 29382, new Class[]{PostWebNewsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postWebNewsFragment.G7();
    }

    public static final /* synthetic */ void m7(PostWebNewsFragment postWebNewsFragment) {
        if (PatchProxy.proxy(new Object[]{postWebNewsFragment}, null, changeQuickRedirect, true, 29390, new Class[]{PostWebNewsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postWebNewsFragment.H7();
    }

    public static final /* synthetic */ void n7(PostWebNewsFragment postWebNewsFragment) {
        if (PatchProxy.proxy(new Object[]{postWebNewsFragment}, null, changeQuickRedirect, true, 29392, new Class[]{PostWebNewsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postWebNewsFragment.J7();
    }

    public static final /* synthetic */ void o7(PostWebNewsFragment postWebNewsFragment, String str, ValueCallback valueCallback) {
        if (PatchProxy.proxy(new Object[]{postWebNewsFragment, str, valueCallback}, null, changeQuickRedirect, true, 29386, new Class[]{PostWebNewsFragment.class, String.class, ValueCallback.class}, Void.TYPE).isSupported) {
            return;
        }
        postWebNewsFragment.K7(str, valueCallback);
    }

    public static final /* synthetic */ void p7(PostWebNewsFragment postWebNewsFragment) {
        if (PatchProxy.proxy(new Object[]{postWebNewsFragment}, null, changeQuickRedirect, true, 29383, new Class[]{PostWebNewsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postWebNewsFragment.L7();
    }

    public static final /* synthetic */ void v7(PostWebNewsFragment postWebNewsFragment) {
        if (PatchProxy.proxy(new Object[]{postWebNewsFragment}, null, changeQuickRedirect, true, 29385, new Class[]{PostWebNewsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postWebNewsFragment.Q7();
    }

    public static final /* synthetic */ void w7(PostWebNewsFragment postWebNewsFragment) {
        if (PatchProxy.proxy(new Object[]{postWebNewsFragment}, null, changeQuickRedirect, true, 29387, new Class[]{PostWebNewsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        super.D4();
    }

    public static final /* synthetic */ void x7(PostWebNewsFragment postWebNewsFragment) {
        if (PatchProxy.proxy(new Object[]{postWebNewsFragment}, null, changeQuickRedirect, true, 29388, new Class[]{PostWebNewsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        super.E4();
    }

    public static final /* synthetic */ void y7(PostWebNewsFragment postWebNewsFragment) {
        if (PatchProxy.proxy(new Object[]{postWebNewsFragment}, null, changeQuickRedirect, true, 29391, new Class[]{PostWebNewsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postWebNewsFragment.V7();
    }

    public static final /* synthetic */ void z7(PostWebNewsFragment postWebNewsFragment) {
        if (PatchProxy.proxy(new Object[]{postWebNewsFragment}, null, changeQuickRedirect, true, 29394, new Class[]{PostWebNewsFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        postWebNewsFragment.a8();
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public /* synthetic */ void A1(WebProtocolObj webProtocolObj, Throwable th2) {
        s.o(this, webProtocolObj, th2);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void A4(@dl.e Result<BBSLinkTreeObj> result) {
        if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 29366, new Class[]{Result.class}, Void.TYPE).isSupported && isActive()) {
            super.A4(result);
            if (result != null) {
                if (com.max.hbcommon.utils.c.u(this.f81936x2) && f0.g(e4(), "29")) {
                    LinkInfoObj linkInfoObjD4 = d4();
                    this.f81936x2 = linkInfoObjD4 != null ? linkInfoObjD4.getPage_url() : null;
                    X4();
                    Y7();
                    g8();
                }
                if (this.f81931c0 || r4()) {
                    this.f81931c0 = false;
                    G4(false);
                    Z7();
                }
            }
        }
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public /* synthetic */ void B0(boolean z10) {
        s.v(this, z10);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void B4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29355, new Class[0], Void.TYPE).isSupported || !i0.e(this.mContext) || d4() == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        String str = f0.g("2", linkInfoObjD4.getIs_award_link()) ? "0" : "2";
        o5(str);
        m5(str);
        LinkInfoObj linkInfoObjD5 = d4();
        f0.m(linkInfoObjD5);
        Q3(linkInfoObjD5.getLinkid(), str);
        T3("syncWeb('award')");
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public /* synthetic */ void C1(WebProtocolObj webProtocolObj) {
        s.A(this, webProtocolObj);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void C4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29354, new Class[0], Void.TYPE).isSupported || !i0.e(this.mContext) || d4() == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        String str = f0.g("1", linkInfoObjD4.getIs_award_link()) ? "0" : "1";
        o5(str);
        m5(str);
        LinkInfoObj linkInfoObjD5 = d4();
        f0.m(linkInfoObjD5);
        Q3(linkInfoObjD5.getLinkid(), str);
        T3("syncWeb('award')");
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public void D1(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 29322, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (!z10) {
            E5().f112953n.i0(false);
        } else {
            E5().f112953n.i0(true);
            E5().f112953n.S(new p());
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void D4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29341, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (k4() == null || l4() == null) {
            U7(new i());
        } else {
            super.D4();
        }
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public /* synthetic */ void E0(WebProtocolObj webProtocolObj) {
        s.d(this, webProtocolObj);
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public /* synthetic */ void E1(String str) {
        s.s(this, str);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void E4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29342, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (k4() == null || l4() == null) {
            U7(new k());
        } else {
            super.E4();
        }
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public /* synthetic */ void F3() {
        s.m(this);
    }

    @dl.e
    public final String F7(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29369, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        CookieSyncManager.createInstance(this.mContext);
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        if (!com.max.hbcommon.utils.c.u(i0.o().getPkey())) {
            cookieManager.setCookie(str, "pkey=" + i0.o().getPkey() + ";HTTPOnly");
            cookieManager.setCookie(str, "x_pkey=" + i0.o().getPkey() + ";HTTPOnly");
            cookieManager.setCookie(str, "x_heybox_id=" + i0.o().getAccount_detail().getUserid() + ";HTTPOnly");
        }
        CookieSyncManager.getInstance().sync();
        return str;
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public void G3(@dl.d WebProtocolObj protocol) {
        if (PatchProxy.proxy(new Object[]{protocol}, this, changeQuickRedirect, false, 29375, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(protocol, "protocol");
        T3(protocol.valueOf("jsfunc"));
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public /* synthetic */ void K2(WebProtocolObj webProtocolObj) {
        s.f(this, webProtocolObj);
    }

    @Override // com.max.xiaoheihe.module.webview.t
    @dl.e
    public String M0(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29371, new Class[]{String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : F7(str);
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public /* synthetic */ void N0(ArrayList arrayList) {
        s.g(this, arrayList);
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public void P0(@dl.e ArrayList<String> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 29372, new Class[]{ArrayList.class}, Void.TYPE).isSupported || arrayList == null || arrayList.size() < 4) {
            return;
        }
        u4();
        int size = arrayList.size();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        for (int i10 = 0; i10 < size; i10++) {
            String strI = l0.i(arrayList.get(i10), "utf-8");
            if (i10 == 0) {
                str = strI;
            } else if (i10 == 1) {
                str3 = strI;
            } else if (i10 == 2) {
                str2 = strI;
            } else if (i10 == 3) {
                str4 = strI;
            } else if (i10 == 4) {
                str5 = strI;
            }
        }
        if (l0.l(this.mContext, new HBShareProtocolData(str, str2, str3, str4, null, null, null, str5, null, null, null, bb.c.b.Cq, null), q4(false))) {
            return;
        }
        e5(str, str2, str3, !com.max.hbcommon.utils.c.u(str4) ? new UMImage(this.mContext, str4) : new UMImage(this.mContext, R.drawable.share_thumbnail));
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void T3(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29336, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        K7(str, null);
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public /* synthetic */ void U(boolean z10, boolean z11) {
        s.n(this, z10, z11);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void U3(@dl.e String str, @dl.e String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 29356, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        i5(str);
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        String linkid = linkInfoObjD4.getLinkid();
        f0.m(str);
        V3(linkid, null, str);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void U4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29345, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.U4();
        Q7();
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public /* synthetic */ void V0(String str) {
        s.q(this, str);
    }

    public final void W7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29353, new Class[0], Void.TYPE).isSupported || !i0.e(this.mContext) || d4() == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        if (f0.g("1", linkInfoObjD4 != null ? linkInfoObjD4.getIs_award_link() : null)) {
            return;
        }
        o5("1");
        m5("1");
        LinkInfoObj linkInfoObjD5 = d4();
        f0.m(linkInfoObjD5);
        Q3(linkInfoObjD5.getLinkid(), "1");
        T3("syncWeb('award')");
        Log.d("[PostWevNewsFragment-dbg]", "[performStoryModeLike] trigger success");
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void X4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29344, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E5().E.setVisibility(0);
        E5().f112948i.p();
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public /* synthetic */ void e0(boolean z10) {
        s.w(this, z10);
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public void e3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29376, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzwebpagetime", "stopLoading" + System.currentTimeMillis());
        if (this.f81932p1 && d4() != null && f4() == null) {
            Activity activity = this.mContext;
            if ((activity instanceof WebNewsPostPageActivity) && !this.G2) {
                this.G2 = true;
                f0.n(activity, "null cannot be cast to non-null type com.max.xiaoheihe.module.bbs.post.ui.activitys.WebNewsPostPageActivity");
                ((WebNewsPostPageActivity) activity).H2();
            }
        }
        this.f81929a0.sendEmptyMessage(1);
        E5().f112953n.A(0);
    }

    public final void e8(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 29378, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || this.Y == null) {
            return;
        }
        String str = "javascript:";
        if (i10 == 0) {
            str = "javascript:pageVisibleFromBackend()";
        } else if (i10 == 1) {
            str = "javascript:pageVisibleFromOthersPage()";
        } else if (i10 == 2) {
            str = "javascript:pageHiddenToBackend()";
        } else if (i10 == 3) {
            str = "javascript:pageHiddenToOthersPage()";
        }
        com.max.hbcommon.utils.d.b("sendAppResumeStopState", str);
        K7(str, null);
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public /* synthetic */ void f0(WebProtocolObj webProtocolObj) {
        s.e(this, webProtocolObj);
    }

    public final void f8(float f10) {
        if (!PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 29320, new Class[]{Float.TYPE}, Void.TYPE).isSupported && ad.a.b(ad.a.f1199f, false, 2, null)) {
            this.f81934p3 = f10;
        }
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public /* synthetic */ void g0(WebProtocolObj webProtocolObj) {
        s.p(this, webProtocolObj);
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public /* synthetic */ void g1(WebProtocolObj webProtocolObj) {
        s.l(this, webProtocolObj);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void h5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29361, new Class[0], Void.TYPE).isSupported || d4() == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        i5(linkInfoObjD4.getIs_favour());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void i5(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29362, new Class[]{String.class}, Void.TYPE).isSupported || g4() == null) {
            return;
        }
        kf.a aVarG4 = g4();
        f0.m(aVarG4);
        aVarG4.y(str);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment, com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 29319, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        super.installViews(view);
        Bundle arguments = getArguments();
        this.f81936x2 = arguments != null ? arguments.getString(PostPageFactory.f81483s) : null;
        Bundle arguments2 = getArguments();
        J4((LinkInfoObj) (arguments2 != null ? arguments2.getSerializable(PostPageFactory.f81482r) : null));
        Y7();
        this.f81937y1 = ViewUtils.f(this.mContext, 54.0f);
        O4("page_style_news_content");
        if (this.f81932p1) {
            LinkWebView linkWebViewI = d0.g().i(this.mContext);
            this.Y = linkWebViewI;
            d0.l(linkWebViewI, false);
        } else {
            LinkWebView linkWebView = new LinkWebView(this.mContext.getApplicationContext());
            this.Y = linkWebView;
            d0.k(linkWebView, false);
        }
        LinkWebView linkWebView2 = this.Y;
        if (linkWebView2 != null) {
            linkWebView2.setmNestedInViewPager(false);
        }
        LinkWebView linkWebView3 = this.Y;
        if (linkWebView3 != null) {
            linkWebView3.setWebViewClient(new d(this));
        }
        LinkWebView linkWebView4 = this.Y;
        if (linkWebView4 != null) {
            linkWebView4.setWebChromeClient(new g());
        }
        LinkWebView linkWebView5 = this.Y;
        f0.m(linkWebView5);
        Object tag = linkWebView5.getTag(R.id.rb_2);
        f0.o(tag, "mWebLinkWebView!!.getTag(R.id.rb_2)");
        if (tag instanceof d0.f) {
            ((d0.f) tag).h(new b(this));
        }
        LinkWebView linkWebView6 = this.Y;
        if (linkWebView6 != null) {
            ComponentCallbacks2 componentCallbacks2 = this.mContext;
            if (componentCallbacks2 instanceof com.max.hbcommon.analytics.d.f) {
                f0.n(componentCallbacks2, "null cannot be cast to non-null type com.max.hbcommon.analytics.EventLogManager.IEventLogPage");
                new OneTimeValidExposureViewWatcher((com.max.hbcommon.analytics.d.f) componentCallbacks2, linkWebView6);
            }
        }
        E5().f112942c.addView(this.Y, 0, new ConsecutiveScrollerLayout.LayoutParams(-1, -2));
        if (this.f81932p1 && d4() != null) {
            String strM7 = M7(d4());
            LinkWebView linkWebView7 = this.Y;
            if (linkWebView7 != null) {
                linkWebView7.setTag(R.id.rb_1, strM7);
            }
            b8(true);
            Z7();
        }
        g8();
        E5().f112953n.i0(false);
        E5().f112950k.setVisibility(8);
        E5().f112942c.setOnVerticalScrollChangeListener(new h());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void j5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29364, new Class[0], Void.TYPE).isSupported || d4() == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        k5(linkInfoObjD4.getFollow_status());
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void k5(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29365, new Class[]{String.class}, Void.TYPE).isSupported || g4() == null || d4() == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        f0.m(linkInfoObjD4);
        if (linkInfoObjD4.getUser() != null) {
            kf.a aVarG4 = g4();
            f0.m(aVarG4);
            LinkInfoObj linkInfoObjD5 = d4();
            f0.m(linkInfoObjD5);
            aVarG4.r1(linkInfoObjD5.getUser(), str);
        }
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public /* synthetic */ String l3() {
        return s.k(this);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void l5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29359, new Class[0], Void.TYPE).isSupported || d4() == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        m5(linkInfoObjD4 != null ? linkInfoObjD4.getIs_award_link() : null);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void m5(@dl.e String str) {
        kf.a aVarG4;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29360, new Class[]{String.class}, Void.TYPE).isSupported || (aVarG4 = g4()) == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        aVarG4.M2(str, linkInfoObjD4 != null ? linkInfoObjD4.getLink_award_num() : null);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void n5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29357, new Class[0], Void.TYPE).isSupported || d4() == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        o5(linkInfoObjD4 != null ? linkInfoObjD4.getIs_award_link() : null);
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public /* synthetic */ void o2(WebProtocolObj webProtocolObj) {
        s.z(this, webProtocolObj);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void o5(@dl.e String str) {
        kf.a aVarG4;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29358, new Class[]{String.class}, Void.TYPE).isSupported || (aVarG4 = g4()) == null) {
            return;
        }
        LinkInfoObj linkInfoObjD4 = d4();
        aVarG4.v(str, linkInfoObjD4 != null ? linkInfoObjD4.getLink_award_num() : null);
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment, com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onAttach(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 29326, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        super.onAttach(context);
        if (getParentFragment() instanceof kf.b) {
            this.Z = (kf.b) getParentFragment();
        } else if (context instanceof kf.b) {
            this.Z = (kf.b) context;
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29381, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        q6();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29328, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f81929a0.removeCallbacksAndMessages(null);
        I7();
        d0.g().n();
        super.onDestroyView();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.hbcommon.base.d
    public void onFragmentHide() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29324, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onFragmentHide();
        if (!l6()) {
            r6();
        }
        if (i6()) {
            return;
        }
        n6();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.hbcommon.base.d
    public void onFragmentShow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29323, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onFragmentShow();
        if (!l6()) {
            s6();
        }
        if (i6()) {
            return;
        }
        o6();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment, com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29349, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (d4() == null) {
            Activity activity = this.mContext;
            f0.n(activity, "null cannot be cast to non-null type com.max.xiaoheihe.module.bbs.post.ui.activitys.WebNewsPostPageActivity");
            ((WebNewsPostPageActivity) activity).H2();
        }
        g8();
        super.onRefresh();
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29327, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        if (com.max.hbcommon.utils.c.u(this.f81933p2)) {
            return;
        }
        T3(this.f81933p2);
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public void reload() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29377, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        onRefresh();
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public /* synthetic */ boolean t0(String str, String str2, t.b bVar) {
        return s.j(this, str, str2, bVar);
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public void u(@dl.d WebProtocolObj protocol) {
        BBSUserInfoObj user;
        if (PatchProxy.proxy(new Object[]{protocol}, this, changeQuickRedirect, false, 29374, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(protocol, "protocol");
        String strValueOf = protocol.valueOf("action");
        String strValueOf2 = protocol.valueOf("state");
        if (kotlin.text.u.L1("favor", strValueOf, true)) {
            y4(strValueOf2);
            return;
        }
        if (kotlin.text.u.L1(p0.f81454v, strValueOf, true)) {
            v4(strValueOf2);
            return;
        }
        if (kotlin.text.u.L1("follow", strValueOf, true)) {
            S7(f0.g("0", strValueOf2) ? "0" : "1");
            com.max.hbcommon.analytics.l lVar = com.max.hbcommon.analytics.l.f66572a;
            String str = f0.g("0", strValueOf2) ? "0" : "1";
            LinkInfoObj linkInfoObjD4 = d4();
            lVar.p(str, "link", (linkInfoObjD4 == null || (user = linkInfoObjD4.getUser()) == null) ? null : user.getUserid(), c4());
        }
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public void x0(@dl.e WebProtocolObj webProtocolObj) {
        if (PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 29373, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported || webProtocolObj == null) {
            return;
        }
        u4();
        HBShareProtocolData hBShareProtocolDataA0 = l0.a0(webProtocolObj);
        if (hBShareProtocolDataA0 == null || l0.l(this.mContext, hBShareProtocolDataA0, q4(false))) {
            return;
        }
        e5(hBShareProtocolDataA0.getTitle(), hBShareProtocolDataA0.getDesc(), hBShareProtocolDataA0.getShare_url(), !com.max.hbcommon.utils.c.u(hBShareProtocolDataA0.getImg_url()) ? new UMImage(this.mContext, hBShareProtocolDataA0.getImg_url()) : new UMImage(this.mContext, R.drawable.share_thumbnail));
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment
    public void x6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29352, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.x6();
        getArguments();
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public void y3(@dl.e String str) {
        this.f81933p2 = str;
    }

    @Override // com.max.xiaoheihe.module.bbs.post.ui.fragments.PostCommentFragment, com.max.xiaoheihe.module.bbs.post.ui.fragments.BasePostFragment
    public void y4(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29363, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (d4() != null) {
            LinkInfoObj linkInfoObjD4 = d4();
            f0.m(linkInfoObjD4);
            linkInfoObjD4.setIs_favour(str);
            h5();
        }
        if (g4() == null || !f0.g("1", str)) {
            return;
        }
        kf.a aVarG4 = g4();
        f0.m(aVarG4);
        aVarG4.l("action_favour", true);
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public /* synthetic */ void z2(WebProtocolObj webProtocolObj) {
        s.x(this, webProtocolObj);
    }
}
