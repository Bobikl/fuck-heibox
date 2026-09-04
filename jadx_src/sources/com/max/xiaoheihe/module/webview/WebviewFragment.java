package com.max.xiaoheihe.module.webview;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Base64;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.webkit.ClientCertRequest;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.core.view.j1;
import androidx.core.view.n3;
import androidx.core.view.z0;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.y0;
import anet.channel.entity.ConnType;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.framework.common.ContainerUtils;
import com.jd.jdcache.JDCache;
import com.jd.jdcache.JDCacheLoader;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbcommon.component.TitleBar;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbexpression.bean.ExpressionObj;
import com.max.hbminiprogram.bean.MiniProgramMenuInfoObj;
import com.max.hbminiprogram.bean.ScreenStyleInfoObj;
import com.max.hbminiprogram.bean.TopicInfoObj;
import com.max.hbminiprogram.fragment.BaseLittleProgramFragment;
import com.max.hbmmkv.MMKVManager;
import com.max.hbpermission.PermissionManager;
import com.max.hbshare.bean.HBShareData;
import com.max.hbshare.bean.HBShareProtocolData;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.video.player.VideoPlayerManager;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.AccelWorldLottieKt;
import com.max.xiaoheihe.accelworld.AccelWorldShareKt;
import com.max.xiaoheihe.bean.BgConfigObj;
import com.max.xiaoheihe.bean.BindAccountGameInfo;
import com.max.xiaoheihe.bean.IconCfgObj;
import com.max.xiaoheihe.bean.NavBarCfgObj;
import com.max.xiaoheihe.bean.PrefetchObj;
import com.max.xiaoheihe.bean.RectObj;
import com.max.xiaoheihe.bean.StatusBarCfgObj;
import com.max.xiaoheihe.bean.WebCfgObj;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.bean.account.steaminfo.SteamPrivacyJsObj;
import com.max.xiaoheihe.bean.analytics.PageEventConfig;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.mall.cart.MallOrderNotifyObj;
import com.max.xiaoheihe.bean.proxy.ProxyAddressObj;
import com.max.xiaoheihe.bean.share.DouYinConfig;
import com.max.xiaoheihe.bean.share.PostConfigObj;
import com.max.xiaoheihe.bean.share.ScreenImageInfo;
import com.max.xiaoheihe.bean.share.ScreenReportObj;
import com.max.xiaoheihe.bean.share.ScreenShareInfoObj;
import com.max.xiaoheihe.bean.share.ScreenUploadInfo;
import com.max.xiaoheihe.bean.share.ShareImageDialogConfigObj;
import com.max.xiaoheihe.bean.webintercept.IpDirectObj;
import com.max.xiaoheihe.module.account.MeHomeActivity;
import com.max.xiaoheihe.module.account.ShareImageDialogFragment;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.max.xiaoheihe.module.bbs.post.ui.activitys.BasePostPageActivity;
import com.max.xiaoheihe.module.bbs.post.utils.PostUtils;
import com.max.xiaoheihe.module.bbs.post_edit.PictureVideoEditPostFragment;
import com.max.xiaoheihe.module.littleprogram.MiniProgramNativeAndWebDelegate;
import com.max.xiaoheihe.module.mall.cart.MallCartUtils;
import com.max.xiaoheihe.module.trade.TradeHandleOfferActivity;
import com.max.xiaoheihe.module.webview.component.LinkWebView;
import com.max.xiaoheihe.module.webview.component.NestedWebView;
import com.max.xiaoheihe.module.webview.component.WebViewProgressBar;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.max.xiaoheihe.router.protocol.HeyboxWebProtocolHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes12.dex */
public class WebviewFragment extends BaseLittleProgramFragment implements com.max.xiaoheihe.module.webview.t, com.max.hbcommon.analytics.h, com.max.xiaoheihe.view.callback.a, com.max.hbexpression.q.a, com.max.hbexpression.q.b {
    public static final String A4 = "proxy";
    public static final String B4 = "has_title";
    public static final String C4 = "web_protocol";
    public static final String D4 = "full_screen";
    public static final String E4 = "title";
    public static final String F4 = "web_pack_key";
    public static final String G4 = "is_consecutive";
    public static final String H4 = "current_height";
    public static final String I4 = "ip_direct";
    public static final String J4 = "hosts";
    public static final String K4 = "js_List";
    public static final String L4 = "report_stay";
    public static final String M4 = "report_visit";
    public static final String N4 = "report_result";
    public static final String O4 = "r_proxy";
    public static final String P4 = "transparent_bg";
    public static final String Q4 = "use_system_dark";
    public static final String R4 = "bg_config";
    public static final String S4 = "wrap_height";
    public static final String T4 = "alert_window_style";
    public static final String U4 = "loading_style_default";
    public static final String V4 = "loading_style_native";
    public static final String W4 = "loading_style_linear";
    private static final String X4 = "share_image";
    public static final String Y4 = "local_obj.fetchHtml(document.documentElement.innerHTML)";
    private static final String Z4 = "didTakeScreenshot()";

    /* JADX INFO: renamed from: a5, reason: collision with root package name */
    public static final String f94359a5 = "onBackPressed()";

    /* JADX INFO: renamed from: b5, reason: collision with root package name */
    public static final String f94360b5 = "_stayStatusCallback()";

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final int f94361c5 = 0;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d5, reason: collision with root package name */
    public static final int f94362d5 = 1;

    /* JADX INFO: renamed from: e5, reason: collision with root package name */
    public static final int f94363e5 = 2;

    /* JADX INFO: renamed from: f5, reason: collision with root package name */
    public static final int f94364f5 = 3;

    /* JADX INFO: renamed from: g5, reason: collision with root package name */
    public static final int f94365g5 = 100;

    /* JADX INFO: renamed from: h5, reason: collision with root package name */
    public static final int f94366h5 = 100;

    /* JADX INFO: renamed from: i5, reason: collision with root package name */
    public static final int f94367i5 = 101;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    private static final String f94368o4 = "HeyBoxWebView";

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    public static final String f94369p4 = "url";

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    public static final String f94370q4 = "bg";

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    public static final String f94371r4 = "loading_style";

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    public static final String f94372s4 = "pull_to_refresh_enable";

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    public static final String f94373t4 = "disable_navi";

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    public static final String f94374u4 = "allow_display_keyboard";

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    public static final String f94375v4 = "message";

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    public static final String f94376w4 = "notify_message";

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public static final String f94377x4 = "come_from_welcome";

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    public static final String f94378y4 = "js";

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    public static final String f94379z4 = "init_js";
    private boolean A;
    private com.max.xiaoheihe.module.webview.t B;
    private String D;
    private boolean E;
    private int F;
    private int G;
    private int H;
    private int I;
    private LoadingDialog J;
    private o0 K;
    private OnLoginReceiver M3;
    private float N;
    private OnPostSuccessReceiver N3;
    private SteamPrivacyJsObj O;
    private BindAccountGameInfo P;
    private int Q;
    private String R;
    private Dialog S;
    private WebProtocolObj T3;
    protected WebProtocolObj U;
    private String U3;
    protected boolean V;
    private JsonObject V3;
    protected String W;
    protected BgConfigObj X3;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private String f94384c0;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    public NestedWebView f94385c4;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    private JDCacheLoader f94391i4;

    @BindView(R.id.img_progress)
    CircularProgressIndicator img_progress;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    private com.max.xiaoheihe.module.webview.component.b f94392j4;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    private WebviewBottomEditorDelegate f94393k4;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    private androidx.activity.o f94394l4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f94395m;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    private com.max.xiaoheihe.module.littleprogram.fragment.webwithnative.a f94396m4;

    @BindView(R.id.vg_message)
    View mMessageView;

    @BindView(R.id.webView_progress)
    WebViewProgressBar mProgressBar;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f94397n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f94399o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f94400p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private String f94401p1;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private ImageView f94403p3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f94404q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f94405r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private MallOrderNotifyObj f94406s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f94407t;

    @BindView(R.id.tb_web)
    TitleBar tb_web;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f94408u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f94409v;

    @BindView(R.id.v_bg)
    ImageView v_bg;

    @BindView(R.id.vg_bg)
    ViewGroup vg_bg;

    @BindView(R.id.vg_bottom_bar_root)
    ViewStub vg_bottom_bar_root;

    @BindView(R.id.vg_loading)
    View vg_loading;

    @BindView(R.id.vg_title_root)
    ViewGroup vg_title_root;

    @BindView(R.id.vg_webview_container)
    ViewGroup vg_webview_container;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ProxyAddressObj f94410w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private IpDirectObj f94411x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private String f94412x1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f94414y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f94417z = false;
    private ArrayList<Bitmap> C = new ArrayList<>();
    private boolean L = false;
    private boolean M = false;
    private boolean T = false;
    private boolean X = true;
    private List<String> Y = new ArrayList();
    private int Z = 0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f94380a0 = false;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f94382b0 = 1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public boolean f94415y1 = false;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public Bitmap f94402p2 = null;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public Bitmap f94413x2 = null;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private boolean f94416y2 = false;
    private boolean G2 = false;
    private boolean G3 = false;
    private String J3 = null;
    private boolean K3 = false;
    private boolean L3 = false;
    private boolean O3 = false;
    private boolean P3 = false;
    private boolean Q3 = false;
    private boolean R3 = false;
    private boolean S3 = false;
    private boolean W3 = false;
    private boolean Y3 = false;
    private String Z3 = null;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private boolean f94381a4 = false;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private boolean f94383b4 = true;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    private boolean f94386d4 = false;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    private int f94387e4 = -1;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private com.max.xiaoheihe.module.webview.c0 f94388f4 = null;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    private HashMap<String, com.max.hbcommon.analytics.p> f94389g4 = new HashMap<>();

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    private String f94390h4 = null;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    private UMShareListener f94398n4 = new y();

    public class OnLoginReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        OnLoginReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 47474, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
                return;
            }
            WebviewFragment.this.onRefresh();
        }
    }

    public class OnPostSuccessReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        OnPostSuccessReceiver() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void c(String str, JsonObject jsonObject) {
            if (PatchProxy.proxy(new Object[]{str, jsonObject}, null, changeQuickRedirect, true, 47477, new Class[]{String.class, JsonObject.class}, Void.TYPE).isSupported) {
                return;
            }
            jsonObject.addProperty("link_id", str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47476, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("link_id", str);
            WebviewFragment webviewFragment = WebviewFragment.this;
            webviewFragment.H6(HeyboxWebProtocolHandler.m(webviewFragment.Z3, jsonObject.toString()), null);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 47475, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
                return;
            }
            if (WebviewFragment.this.isActive() && !com.max.hbcommon.utils.c.u(WebviewFragment.this.Z3) && intent != null && !com.max.hbcommon.utils.c.u(intent.getStringExtra("link_id"))) {
                final String stringExtra = intent.getStringExtra("link_id");
                com.max.xiaoheihe.accelworld.j.b(WebviewFragment.this.Z3, WebviewFragment.this, new com.max.xiaoheihe.module.webview.t.b() { // from class: com.max.xiaoheihe.module.webview.r0
                    @Override // com.max.xiaoheihe.module.webview.t.b
                    public final void a(JsonObject jsonObject) {
                        WebviewFragment.OnPostSuccessReceiver.c(stringExtra, jsonObject);
                    }
                }, new com.max.xiaoheihe.module.webview.t.a() { // from class: com.max.xiaoheihe.module.webview.s0
                    @Override // com.max.xiaoheihe.module.webview.t.a
                    public final void a() {
                        this.f94773a.d(stringExtra);
                    }
                }, null);
            }
            if (WebviewFragment.this.N3 != null) {
                WebviewFragment webviewFragment = WebviewFragment.this;
                webviewFragment.unregisterReceiver(webviewFragment.N3);
                WebviewFragment.this.N3 = null;
            }
        }
    }

    public class a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WeakReference f94420b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f94421c;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.webview.WebviewFragment$a$a, reason: collision with other inner class name */
        public class C0891a extends androidx.activity.o {
            public static ChangeQuickRedirect changeQuickRedirect;

            C0891a(boolean z10) {
                super(z10);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void f(JsonObject jsonObject) {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void g() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47385, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                com.max.heybox.hblog.g.x("WebviewFragment, handleOnBackPressed " + this);
                WebviewFragment.this.H6(WebviewFragment.f94359a5, null);
            }

            @Override // androidx.activity.o
            public void handleOnBackPressed() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47384, new Class[0], Void.TYPE).isSupported || a.this.f94420b.get() == null || a.this.f94421c.get() == null) {
                    return;
                }
                com.max.xiaoheihe.accelworld.j.e(com.max.xiaoheihe.accelworld.j.h(WebviewFragment.f94359a5), (com.max.xiaoheihe.module.webview.t) a.this.f94421c.get(), new com.max.xiaoheihe.module.webview.t.b() { // from class: com.max.xiaoheihe.module.webview.n0
                    @Override // com.max.xiaoheihe.module.webview.t.b
                    public final void a(JsonObject jsonObject) {
                        WebviewFragment.a.C0891a.f(jsonObject);
                    }
                }, new com.max.xiaoheihe.module.webview.t.a() { // from class: com.max.xiaoheihe.module.webview.o0
                    @Override // com.max.xiaoheihe.module.webview.t.a
                    public final void a() {
                        this.f94761a.g();
                    }
                }, null);
            }
        }

        a(WeakReference weakReference, WeakReference weakReference2) {
            this.f94420b = weakReference;
            this.f94421c = weakReference2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47383, new Class[0], Void.TYPE).isSupported || this.f94420b.get() == null || this.f94421c.get() == null) {
                return;
            }
            WebviewFragment webviewFragment = WebviewFragment.this;
            webviewFragment.f94394l4 = new C0891a(webviewFragment.Q3);
            if (this.f94420b.get() instanceof ComponentActivity) {
                ((ComponentActivity) this.f94420b.get()).getOnBackPressedDispatcher().c((androidx.lifecycle.y) this.f94421c.get(), WebviewFragment.this.f94394l4);
            }
        }
    }

    public class a0 implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f94424b;

        public class a implements l0 {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f94426a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f94427b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f94428c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f94429d;

            a(int i10, int i11, int i12, int i13) {
                this.f94426a = i10;
                this.f94427b = i11;
                this.f94428c = i12;
                this.f94429d = i13;
            }

            @Override // com.max.xiaoheihe.module.webview.WebviewFragment.l0
            public void a(Bitmap bitmap) {
                if (PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, 47441, new Class[]{Bitmap.class}, Void.TYPE).isSupported) {
                    return;
                }
                WebviewFragment.this.c7();
                Bitmap bitmapCreateBitmap = null;
                if (bitmap != null) {
                    WebviewFragment.this.C.add(bitmap);
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmap, this.f94426a, this.f94427b, this.f94428c, this.f94429d);
                    WebviewFragment.this.C.add(bitmapCreateBitmap);
                }
                if (WebviewFragment.this.K != null) {
                    WebviewFragment.this.K.n(WebviewFragment.this.f94385c4, bitmapCreateBitmap);
                }
            }
        }

        a0(String str) {
            this.f94424b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            WebProtocolObj webProtocolObj;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47440, new Class[0], Void.TYPE).isSupported || !WebviewFragment.this.isActive() || (webProtocolObj = (WebProtocolObj) com.max.hbutils.utils.k.a(this.f94424b, WebProtocolObj.class)) == null) {
                return;
            }
            WebviewFragment webviewFragment = WebviewFragment.this;
            if (webviewFragment.f94385c4 != null) {
                try {
                    webviewFragment.G6();
                    int iL = ViewUtils.L(((com.max.hbcommon.base.d) WebviewFragment.this).mContext);
                    int contentHeight = (int) (((double) (WebviewFragment.this.f94385c4.getContentHeight() * WebviewFragment.this.f94385c4.getScale())) + 0.5d);
                    int iF = ViewUtils.f(((com.max.hbcommon.base.d) WebviewFragment.this).mContext, com.max.hbutils.utils.n.q(webProtocolObj.valueOf(com.google.android.exoplayer2.text.ttml.d.f49793l0)));
                    int iF2 = ViewUtils.f(((com.max.hbcommon.base.d) WebviewFragment.this).mContext, com.max.hbutils.utils.n.q(webProtocolObj.valueOf("top")));
                    int iG = com.max.hbcommon.component.ezcalendarview.utils.a.g(ViewUtils.f(((com.max.hbcommon.base.d) WebviewFragment.this).mContext, com.max.hbutils.utils.n.q(webProtocolObj.valueOf("width"))), 0, iL - iF);
                    int iG2 = com.max.hbcommon.component.ezcalendarview.utils.a.g(ViewUtils.f(((com.max.hbcommon.base.d) WebviewFragment.this).mContext, com.max.hbutils.utils.n.q(webProtocolObj.valueOf("height"))), 0, contentHeight - iF2);
                    if (iG <= 0 || iG2 <= 0) {
                        return;
                    }
                    WebviewFragment.this.C.clear();
                    WebviewFragment.this.d8();
                    WebviewFragment webviewFragment2 = WebviewFragment.this;
                    webviewFragment2.V6(webviewFragment2.f94385c4, iG, iF2 + iG2, new a(iF, iF2, iG, iG2));
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public class b extends com.max.xiaoheihe.module.webview.interceptrequest.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f94431h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f94432i;

        public class a implements ValueCallback<String> {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            public void a(String str) {
                if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47398, new Class[]{String.class}, Void.TYPE).isSupported && "false".equals(str)) {
                    WebviewFragment.this.t7("javascript:" + WebviewFragment.this.O.getOpenSteamPrivacyJs());
                }
            }

            @Override // android.webkit.ValueCallback
            public /* bridge */ /* synthetic */ void onReceiveValue(String str) {
                if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47399, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                a(str);
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.webview.WebviewFragment$b$b, reason: collision with other inner class name */
        public class C0892b implements com.max.xiaoheihe.view.m {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ SslErrorHandler f94435a;

            C0892b(SslErrorHandler sslErrorHandler) {
                this.f94435a = sslErrorHandler;
            }

            @Override // com.max.xiaoheihe.view.m
            public void a(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 47401, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f94435a.proceed();
                dialog.dismiss();
            }

            @Override // com.max.xiaoheihe.view.m
            public void b(Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 47400, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f94435a.cancel();
                dialog.dismiss();
            }
        }

        b(WebView webView, IpDirectObj ipDirectObj, boolean z10, String str) {
            super(webView, ipDirectObj, z10, str);
            this.f94431h = 0;
            this.f94432i = 0;
        }

        @Override // com.max.xiaoheihe.module.webview.interceptrequest.d
        @androidx.annotation.p0
        public WebResourceResponse n(WebView webView, com.max.xiaoheihe.module.webview.interceptrequest.c cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webView, cVar}, this, changeQuickRedirect, false, 47387, new Class[]{WebView.class, com.max.xiaoheihe.module.webview.interceptrequest.c.class}, WebResourceResponse.class);
            if (patchProxyResultProxy.isSupported) {
                return (WebResourceResponse) patchProxyResultProxy.result;
            }
            if (WebviewFragment.this.K != null) {
                WebviewFragment.this.K.d(webView, cVar);
            }
            WebResourceResponse webResourceResponseA = WebviewFragment.this.K != null ? WebviewFragment.this.K.a(webView, cVar) : null;
            if (webResourceResponseA == null) {
                webResourceResponseA = super.n(webView, cVar);
            }
            if (webResourceResponseA != null && (webResourceResponseA instanceof com.max.xiaoheihe.module.webview.f)) {
                this.f94432i++;
                com.max.hbcommon.utils.d.b(WebviewFragment.f94368o4, "Intercept redirect redirectNum==" + this.f94432i);
            }
            return webResourceResponseA;
        }

        @Override // com.max.xiaoheihe.module.webview.interceptrequest.d
        public boolean o(WebView webView, String str, boolean z10) {
            Object[] objArr = {webView, str, new Byte(z10 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 47396, new Class[]{WebView.class, String.class, cls}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            com.max.hbcommon.utils.d.b(WebviewFragment.f94368o4, "shouldOverrideUrlLoading:" + str);
            if ((str.startsWith("http://") || str.startsWith("https://")) && !str.endsWith(".apk") && !"yes".equals(WebviewFragment.this.f94407t)) {
                this.f94431h = (this.f94431h + 1) - this.f94432i;
                this.f94432i = 0;
            }
            com.max.xiaoheihe.base.router.b.z0(com.max.xiaoheihe.base.router.b.A0(((com.max.hbcommon.base.d) WebviewFragment.this).mContext, str, webView, WebviewFragment.this.f94407t, WebviewFragment.this.B));
            WebProtocolObj webProtocolObj = WebviewFragment.this.U;
            if (webProtocolObj != null && "openH5PayWindow".equals(webProtocolObj.getProtocol_type())) {
                Uri uri = Uri.parse(str);
                if (!"http://".equals(uri.getScheme()) && !"https://".equals(uri.getScheme())) {
                    WebviewFragment.this.G2 = true;
                }
            }
            com.max.hbcommon.utils.d.b(WebviewFragment.f94368o4, "shouldOverrideUrlLoading: mGoWxPayFlag: " + WebviewFragment.this.G2);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            if (PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 47388, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onLoadResource(webView, str);
            com.max.hbcommon.utils.d.b(WebviewFragment.f94368o4, "onLoadResource:" + str);
            if (WebviewFragment.this.K != null) {
                WebviewFragment.this.K.f(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(WebView webView, String str) {
            if (PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 47386, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            if (WebviewFragment.this.K != null) {
                WebviewFragment.this.K.e(webView, str);
            }
            super.onPageCommitVisible(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 47390, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onPageFinished(webView, str);
            if (str != null && WebviewFragment.this.f94391i4 != null) {
                WebviewFragment.this.f94391i4.onPageFinished(str);
            }
            com.max.hbcommon.utils.d.b(WebviewFragment.f94368o4, "onPageFinished:" + str + ", " + WebviewFragment.this.Q + ", " + this.f94431h);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onPageFinished:");
            sb2.append(str);
            sb2.append(", getprogrss");
            sb2.append(webView.getProgress());
            com.max.hbcommon.utils.d.b(WebviewFragment.f94368o4, sb2.toString());
            if (WebviewFragment.this.K != null) {
                WebviewFragment.this.K.g(webView, str, WebviewFragment.this.Q, this.f94431h);
            }
            if (WebviewFragment.this.O != null) {
                WebviewFragment.this.f94385c4.evaluateJavascript("javascript:" + WebviewFragment.this.O.getGetSteamPrivacyJs(), new a());
            }
            int i10 = this.f94431h - 1;
            this.f94431h = i10;
            if (i10 == 0) {
                if (WebviewFragment.this.f94404q) {
                    WebviewFragment.this.f94404q = false;
                    WebviewFragment.this.f94385c4.requestFocus();
                    com.max.xiaoheihe.utils.d.B1(((com.max.hbcommon.base.d) WebviewFragment.this).mContext);
                }
                if (!WebviewFragment.this.f94414y) {
                    WebviewFragment.k5(WebviewFragment.this, "1", str);
                }
            }
            if (WebviewFragment.this.A || com.max.hbcommon.utils.c.u(WebviewFragment.this.f94408u)) {
                return;
            }
            WebviewFragment.this.A = true;
            WebviewFragment.this.t7("javascript:" + WebviewFragment.this.f94408u + "('" + com.max.hbcommon.utils.i.b(((com.max.hbcommon.base.d) WebviewFragment.this).mContext) + "')");
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            WebViewProgressBar webViewProgressBar;
            if (PatchProxy.proxy(new Object[]{webView, str, bitmap}, this, changeQuickRedirect, false, 47389, new Class[]{WebView.class, String.class, Bitmap.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onPageStarted(webView, str, bitmap);
            if (str != null && WebviewFragment.this.f94391i4 != null) {
                WebviewFragment.this.f94391i4.onPageStarted(str);
            }
            com.max.hbcommon.utils.d.b(WebviewFragment.f94368o4, "onPageStarted:" + str);
            if (WebviewFragment.this.K != null) {
                WebviewFragment.this.K.i(webView, str, WebviewFragment.this.Q, this.f94431h);
            }
            this.f94431h = Math.max(this.f94431h, 1);
            if (WebviewFragment.W4.equals(WebviewFragment.this.f94399o) && (webViewProgressBar = WebviewFragment.this.mProgressBar) != null) {
                webViewProgressBar.setVisibility(0);
            }
            WebviewFragment.f5(WebviewFragment.this, str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
            if (PatchProxy.proxy(new Object[]{webView, clientCertRequest}, this, changeQuickRedirect, false, 47394, new Class[]{WebView.class, ClientCertRequest.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onReceivedClientCertRequest(webView, clientCertRequest);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            if (PatchProxy.proxy(new Object[]{webView, new Integer(i10), str, str2}, this, changeQuickRedirect, false, 47395, new Class[]{WebView.class, Integer.TYPE, String.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.d("zzzzwebreport", "onReceivedError" + str + "   code=" + i10);
            WebviewFragment.this.f94414y = true;
            if (i10 == -8) {
                WebviewFragment.k5(WebviewFragment.this, "2", str2);
            } else {
                WebviewFragment.k5(WebviewFragment.this, "0", str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (PatchProxy.proxy(new Object[]{webView, webResourceRequest, webResourceError}, this, changeQuickRedirect, false, 47391, new Class[]{WebView.class, WebResourceRequest.class, WebResourceError.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceError != null) {
                com.max.hbcommon.utils.d.d(WebviewFragment.f94368o4, "onReceivedError:" + webResourceRequest.getUrl() + ", " + webResourceError.getErrorCode() + ", " + ((Object) webResourceError.getDescription()));
            }
            if (WebviewFragment.this.K != null) {
                WebviewFragment.this.K.l(webView, webResourceRequest, webResourceError);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            if (PatchProxy.proxy(new Object[]{webView, webResourceRequest, webResourceResponse}, this, changeQuickRedirect, false, 47392, new Class[]{WebView.class, WebResourceRequest.class, WebResourceResponse.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceResponse != null) {
                com.max.hbcommon.utils.d.d(WebviewFragment.f94368o4, "onReceivedHttpError:" + webResourceRequest.getUrl() + ", " + webResourceResponse.getStatusCode() + ", " + webResourceResponse.getReasonPhrase());
            }
            if (WebviewFragment.this.K != null) {
                WebviewFragment.this.K.m(webView, webResourceRequest, webResourceResponse);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (PatchProxy.proxy(new Object[]{webView, sslErrorHandler, sslError}, this, changeQuickRedirect, false, 47393, new Class[]{WebView.class, SslErrorHandler.class, SslError.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.d(WebviewFragment.f94368o4, "onReceivedSslError:" + sslError);
            if (WebviewFragment.this.isAdded()) {
                if (com.max.xiaoheihe.a.f76429f.equals(com.max.xiaoheihe.utils.d.t0())) {
                    com.max.xiaoheihe.view.l.D(((com.max.hbcommon.base.d) WebviewFragment.this).mContext, WebviewFragment.this.getString(R.string.prompt), WebviewFragment.this.getString(R.string.ssl_error_hint), WebviewFragment.this.getString(R.string.confirm), WebviewFragment.this.getString(R.string.cancel), new C0892b(sslErrorHandler));
                    return;
                }
                if (WebviewFragment.this.f94395m.contains("epicgames.com")) {
                    sslErrorHandler.cancel();
                    return;
                }
                JsonObject jsonObject = new JsonObject();
                if (!com.max.hbcommon.utils.c.u(WebviewFragment.this.f94395m)) {
                    jsonObject.addProperty("url", WebviewFragment.this.f94395m);
                }
                com.max.hbcommon.analytics.d.d("3", lb.d.f131258t4, null, jsonObject);
                sslErrorHandler.proceed();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, SafeBrowsingResponse safeBrowsingResponse) {
            if (PatchProxy.proxy(new Object[]{webView, webResourceRequest, new Integer(i10), safeBrowsingResponse}, this, changeQuickRedirect, false, 47397, new Class[]{WebView.class, WebResourceRequest.class, Integer.TYPE, SafeBrowsingResponse.class}, Void.TYPE).isSupported) {
                return;
            }
            if (webResourceRequest.getUrl().getHost().equals("steamhost.info") && Build.VERSION.SDK_INT >= 27) {
                safeBrowsingResponse.proceed(true);
            }
            super.onSafeBrowsingHit(webView, webResourceRequest, i10, safeBrowsingResponse);
        }
    }

    public class b0 implements ValueCallback<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b0() {
        }

        public void a(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47442, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!str.startsWith("{") && !str.endsWith(z5.g.f141884d)) {
                str = str.substring(1, str.length() - 1);
            }
            String strReplaceAll = str.replaceAll("\\\\", "");
            com.max.hbcommon.utils.d.b("zzzzwebpagestay", "result ==" + strReplaceAll);
            if (com.max.hbcommon.utils.c.u(strReplaceAll)) {
                return;
            }
            JsonObject jsonObject = (JsonObject) new Gson().fromJson(strReplaceAll, JsonObject.class);
            Iterator it = WebviewFragment.this.f94389g4.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jsonObject.get((String) entry.getKey()) == null) {
                    it.remove();
                } else {
                    ((com.max.hbcommon.analytics.p) entry.getValue()).e();
                }
            }
        }

        @Override // android.webkit.ValueCallback
        public /* bridge */ /* synthetic */ void onReceiveValue(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47443, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a(str);
        }
    }

    public class c implements View.OnTouchListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, motionEvent}, this, changeQuickRedirect, false, 47402, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            WebviewFragment.this.f94385c4.getParent().requestDisallowInterceptTouchEvent(true);
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            if (motionEvent.getAction() == 2) {
                if (Math.abs(rawX - 0) < Math.abs(rawY - 0)) {
                    WebviewFragment.this.f94385c4.getParent().requestDisallowInterceptTouchEvent(false);
                } else {
                    WebviewFragment.this.f94385c4.getParent().requestDisallowInterceptTouchEvent(true);
                }
            }
            return false;
        }
    }

    public class c0 implements com.max.xiaoheihe.utils.l0.i {
        public static ChangeQuickRedirect changeQuickRedirect;

        c0() {
        }

        @Override // com.max.xiaoheihe.utils.l0.i
        public void a(String str) {
            if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47444, new Class[]{String.class}, Void.TYPE).isSupported && WebviewFragment.this.isActive() && !com.max.hbcommon.utils.c.u(str) && com.max.hbcommon.utils.c.x(com.max.hbutils.utils.k.e(str, "value"))) {
                WebviewFragment.p6(WebviewFragment.this);
            }
        }

        @Override // com.max.xiaoheihe.utils.l0.i
        public boolean b() {
            return false;
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 47403, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class d0 implements com.max.xiaoheihe.utils.l0.i {
        public static ChangeQuickRedirect changeQuickRedirect;

        d0() {
        }

        @Override // com.max.xiaoheihe.utils.l0.i
        public void a(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47445, new Class[]{String.class}, Void.TYPE).isSupported || !WebviewFragment.this.isActive() || com.max.hbcommon.utils.c.u(str)) {
                return;
            }
            WebviewFragment.this.w7(str);
        }

        @Override // com.max.xiaoheihe.utils.l0.i
        public boolean b() {
            return false;
        }
    }

    public class e implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f94442b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ValueCallback f94443c;

        e(String str, ValueCallback valueCallback) {
            this.f94442b = str;
            this.f94443c = valueCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47404, new Class[0], Void.TYPE).isSupported && WebviewFragment.this.isActive()) {
                WebviewFragment.this.f94385c4.evaluateJavascript(this.f94442b, this.f94443c);
            }
        }
    }

    public class e0 implements com.max.xiaoheihe.utils.l0.j {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f94445a;

        e0(int i10) {
            this.f94445a = i10;
        }

        @Override // com.max.xiaoheihe.utils.l0.j
        public void a(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 47429, new Class[]{Result.class}, Void.TYPE).isSupported && WebviewFragment.this.isActive()) {
                try {
                    WebviewFragment.this.Y.add(this.f94445a, com.max.hbutils.utils.k.p(result));
                    WebviewFragment.c5(WebviewFragment.this);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        }

        @Override // com.max.xiaoheihe.utils.l0.j
        public void b() {
        }

        @Override // com.max.xiaoheihe.utils.l0.j
        public void onError(Throwable th2) {
        }
    }

    public class f implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f94447b;

        f(String str) {
            this.f94447b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47405, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            WebviewFragment.this.H6(this.f94447b, null);
        }
    }

    public class f0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IconCfgObj f94449b;

        f0(IconCfgObj iconCfgObj) {
            this.f94449b = iconCfgObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 47446, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.l0.f95687b.C(((com.max.hbcommon.base.d) WebviewFragment.this).mContext, WebviewFragment.this.U6(), this.f94449b.getProtocol(), WebviewFragment.this);
        }
    }

    public class g extends TypeToken<List<List<RectObj>>> {
        g() {
        }
    }

    public class g0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IconCfgObj f94452b;

        g0(IconCfgObj iconCfgObj) {
            this.f94452b = iconCfgObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 47447, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.l0.f95687b.C(((com.max.hbcommon.base.d) WebviewFragment.this).mContext, WebviewFragment.this.U6(), this.f94452b.getProtocol(), WebviewFragment.this);
        }
    }

    public class h implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f94454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f94455c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f94456d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f94457e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f94458f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ WebProtocolObj f94459g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f94460h;

        public class a implements l0 {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.xiaoheihe.module.webview.WebviewFragment.l0
            public void a(Bitmap bitmap) {
                if (PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, 47407, new Class[]{Bitmap.class}, Void.TYPE).isSupported) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (List list : h.this.f94456d) {
                    h hVar = h.this;
                    arrayList.add(WebviewFragment.w5(WebviewFragment.this, 0, list, bitmap, hVar.f94457e, hVar.f94455c));
                }
                h hVar2 = h.this;
                Bitmap bitmapW5 = WebviewFragment.w5(WebviewFragment.this, 0, hVar2.f94458f, bitmap, hVar2.f94457e, hVar2.f94455c);
                h hVar3 = h.this;
                WebviewFragment.x5(WebviewFragment.this, arrayList, hVar3.f94459g, bitmapW5, hVar3.f94460h);
            }
        }

        h(int i10, int i11, List list, int i12, List list2, WebProtocolObj webProtocolObj, boolean z10) {
            this.f94454b = i10;
            this.f94455c = i11;
            this.f94456d = list;
            this.f94457e = i12;
            this.f94458f = list2;
            this.f94459g = webProtocolObj;
            this.f94460h = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47406, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            WebviewFragment webviewFragment = WebviewFragment.this;
            webviewFragment.V6(webviewFragment.f94385c4, this.f94454b, this.f94455c, new a());
        }
    }

    public class h0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 47448, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((com.max.hbcommon.base.d) WebviewFragment.this).mContext.onBackPressed();
        }
    }

    public class i implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f94464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f94465c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f94466d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f94467e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f94468f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ WebProtocolObj f94469g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f94470h;

        public class a implements l0 {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.xiaoheihe.module.webview.WebviewFragment.l0
            public void a(Bitmap bitmap) {
                if (PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, 47409, new Class[]{Bitmap.class}, Void.TYPE).isSupported) {
                    return;
                }
                for (List list : i.this.f94466d) {
                    i iVar = i.this;
                    WebviewFragment webviewFragment = WebviewFragment.this;
                    i.this.f94467e.add(WebviewFragment.w5(webviewFragment, iVar.f94464b, list, bitmap, ViewUtils.L(((com.max.hbcommon.base.d) webviewFragment).mContext), i.this.f94465c));
                }
                i iVar2 = i.this;
                WebviewFragment webviewFragment2 = WebviewFragment.this;
                Bitmap bitmapW5 = WebviewFragment.w5(webviewFragment2, iVar2.f94464b, iVar2.f94468f, bitmap, ViewUtils.L(((com.max.hbcommon.base.d) webviewFragment2).mContext), i.this.f94465c);
                i iVar3 = i.this;
                WebviewFragment.x5(WebviewFragment.this, iVar3.f94467e, iVar3.f94469g, bitmapW5, iVar3.f94470h);
            }
        }

        i(int i10, int i11, List list, List list2, List list3, WebProtocolObj webProtocolObj, boolean z10) {
            this.f94464b = i10;
            this.f94465c = i11;
            this.f94466d = list;
            this.f94467e = list2;
            this.f94468f = list3;
            this.f94469g = webProtocolObj;
            this.f94470h = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47408, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            WebviewFragment webviewFragment = WebviewFragment.this;
            webviewFragment.Q6(webviewFragment.f94385c4, 0, this.f94464b, this.f94465c, new a(), true);
        }
    }

    public class i0 implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        i0() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 47449, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            WebviewFragment.X5(WebviewFragment.this);
            WebviewFragment.i6(WebviewFragment.this);
        }
    }

    public class j implements com.max.xiaoheihe.module.upload.g.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f94474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f94475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f94476c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ WebProtocolObj f94477d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f94478e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Bitmap f94479f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f94480g;

        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String[] f94482b;

            a(String[] strArr) {
                this.f94482b = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47413, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                JsonObject jsonObject = new JsonObject();
                String[] strArr = this.f94482b;
                if (strArr.length == 1) {
                    jsonObject.addProperty("img_url", strArr[0]);
                } else {
                    JsonArray jsonArray = new JsonArray();
                    for (String str : this.f94482b) {
                        jsonArray.add(str);
                    }
                    jsonObject.add("img_urls", jsonArray);
                }
                String strM = HeyboxWebProtocolHandler.m(j.this.f94474a, jsonObject.toString());
                j jVar = j.this;
                if (jVar.f94475b) {
                    WebviewFragment.D5(WebviewFragment.this, strM);
                } else if (jVar.f94476c) {
                    WebviewFragment.A5(WebviewFragment.this, jVar.f94477d, jVar.f94478e, strM, jVar.f94479f);
                } else {
                    WebviewFragment.C5(WebviewFragment.this, jVar.f94478e, jVar.f94477d, strM, jVar.f94479f);
                }
            }
        }

        public class b implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47414, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                j jVar = j.this;
                WebviewFragment.F5(WebviewFragment.this, jVar.f94474a);
            }
        }

        j(String str, boolean z10, boolean z11, WebProtocolObj webProtocolObj, List list, Bitmap bitmap, List list2) {
            this.f94474a = str;
            this.f94475b = z10;
            this.f94476c = z11;
            this.f94477d = webProtocolObj;
            this.f94478e = list;
            this.f94479f = bitmap;
            this.f94480g = list2;
        }

        private void f() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47412, new Class[0], Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(this.f94480g)) {
                return;
            }
            for (File file : this.f94480g) {
                if (file != null) {
                    file.delete();
                }
            }
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ void a(float f10) {
            com.max.xiaoheihe.module.upload.h.b(this, f10);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean b() {
            return com.max.xiaoheihe.module.upload.h.a(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void c(String[] strArr, String str) {
            if (PatchProxy.proxy(new Object[]{strArr, str}, this, changeQuickRedirect, false, 47410, new Class[]{String[].class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            f();
            ((com.max.hbcommon.base.d) WebviewFragment.this).mContext.runOnUiThread(new a(strArr));
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public boolean d() {
            return false;
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void e(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47411, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            f();
            ((com.max.hbcommon.base.d) WebviewFragment.this).mContext.runOnUiThread(new b());
        }
    }

    public class j0 extends com.max.xiaoheihe.module.webview.component.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47451, new Class[0], Void.TYPE).isSupported && WebviewFragment.this.isActive()) {
                    float fO6 = WebviewFragment.this.O6();
                    if (fO6 > WebviewFragment.this.N) {
                        WebviewFragment.this.N = fO6;
                    }
                }
            }
        }

        j0(o0 o0Var, NestedWebView nestedWebView) {
            super(o0Var, nestedWebView);
        }

        @Override // com.max.xiaoheihe.module.webview.component.a, com.max.xiaoheihe.module.webview.component.NestedWebView.a
        public void a(int i10, int i11, int i12, int i13) {
            Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 47450, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            o0 o0Var = b().get();
            if (o0Var != null) {
                o0Var.h(WebviewFragment.this.f94385c4, i10, i11, i12, i13);
            }
            if (!WebviewFragment.this.isActive() || c().get() == null) {
                return;
            }
            WebviewFragment.this.f94385c4.post(new a());
        }
    }

    public class k implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47415, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            WebviewFragment.H5(WebviewFragment.this);
        }
    }

    public class k0 extends WebChromeClient {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements com.max.hbpermission.c {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ PermissionRequest f94489a;

            a(PermissionRequest permissionRequest) {
                this.f94489a = permissionRequest;
            }

            @Override // com.max.hbpermission.c
            public void onResult() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47461, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                PermissionRequest permissionRequest = this.f94489a;
                permissionRequest.grant(permissionRequest.getResources());
            }
        }

        public class b implements ValueCallback<String> {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            public void a(String str) {
            }

            @Override // android.webkit.ValueCallback
            public /* bridge */ /* synthetic */ void onReceiveValue(String str) {
                if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47462, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                a(str);
            }
        }

        public class c implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47463, new Class[0], Void.TYPE).isSupported && WebviewFragment.this.isActive()) {
                    WebviewFragment.P4(WebviewFragment.this, false);
                }
            }
        }

        k0() {
        }

        @Override // android.webkit.WebChromeClient
        @androidx.annotation.p0
        public Bitmap getDefaultVideoPoster() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47454, new Class[0], Bitmap.class);
            if (patchProxyResultProxy.isSupported) {
                return (Bitmap) patchProxyResultProxy.result;
            }
            return super.getDefaultVideoPoster() == null ? BitmapFactory.decodeResource(((com.max.hbcommon.base.d) WebviewFragment.this).mContext.getResources(), R.drawable.share_thumbnail) : super.getDefaultVideoPoster();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{consoleMessage}, this, changeQuickRedirect, false, 47458, new Class[]{ConsoleMessage.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            com.max.xiaoheihe.utils.d.C0(consoleMessage);
            return super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47460, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            super.onHideCustomView();
            VideoPlayerManager.f76079a.e(((com.max.hbcommon.base.d) WebviewFragment.this).mContext);
            if (((com.max.hbcommon.base.d) WebviewFragment.this).mContext instanceof com.max.hbminiprogram.h) {
                if (WebviewFragment.this.getParentFragment() == null) {
                    WebviewFragment.this.f7();
                }
            } else if (((com.max.hbcommon.base.d) WebviewFragment.this).mContext instanceof WebActionActivity) {
                ((WebActionActivity) ((com.max.hbcommon.base.d) WebviewFragment.this).mContext).a3();
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webView, str, str2, jsResult}, this, changeQuickRedirect, false, 47457, new Class[]{WebView.class, String.class, String.class, JsResult.class}, Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : super.onJsAlert(webView, str, str2, jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            WebProtocolObj webProtocolObjE0;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webView, str, str2, str3, jsPromptResult}, this, changeQuickRedirect, false, 47453, new Class[]{WebView.class, String.class, String.class, String.class, JsPromptResult.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            com.max.hbcommon.utils.d.b(WebviewFragment.f94368o4, "defaultValue==" + str3);
            if (str3.startsWith("heybox") && (webProtocolObjE0 = com.max.xiaoheihe.utils.l0.e0(str3)) != null) {
                if (WebviewFragment.this.Z6(webProtocolObjE0)) {
                    return true;
                }
                jsPromptResult.confirm(com.max.xiaoheihe.utils.l0.f95687b.C(((com.max.hbcommon.base.d) WebviewFragment.this).mContext, webView, webProtocolObjE0, WebviewFragment.this.B));
                return true;
            }
            return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            if (PatchProxy.proxy(new Object[]{permissionRequest}, this, changeQuickRedirect, false, 47452, new Class[]{PermissionRequest.class}, Void.TYPE).isSupported || permissionRequest.getResources() == null) {
                return;
            }
            for (String str : permissionRequest.getResources()) {
                if ("android.webkit.resource.AUDIO_CAPTURE".equals(str)) {
                    PermissionManager.f71603a.X((FragmentActivity) ((com.max.hbcommon.base.d) WebviewFragment.this).mContext, new a(permissionRequest));
                }
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            if (PatchProxy.proxy(new Object[]{webView, new Integer(i10)}, this, changeQuickRedirect, false, 47455, new Class[]{WebView.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            WebviewFragment.this.Q = i10;
            com.max.hbcommon.utils.d.b(WebviewFragment.f94368o4, "view.getProgress():" + webView.getProgress());
            com.max.hbcommon.utils.d.b(WebviewFragment.f94368o4, "onProgressChanged:" + i10);
            if (WebviewFragment.this.K != null) {
                WebviewFragment.this.K.k(webView, i10);
            }
            if (WebviewFragment.this.isAdded()) {
                if (WebviewFragment.W4.equals(WebviewFragment.this.f94399o)) {
                    WebviewFragment.this.mProgressBar.setProgress(i10);
                }
                if (i10 == 100) {
                    if (!com.max.hbcommon.utils.c.u(WebviewFragment.this.f94409v)) {
                        WebviewFragment webviewFragment = WebviewFragment.this;
                        webviewFragment.f94385c4.evaluateJavascript(webviewFragment.f94409v, new b());
                    }
                    if (WebviewFragment.this.f94414y) {
                        if (((WebviewFragment.this.f94410w != null && WebviewFragment.this.f94410w.isValid()) || WebviewFragment.this.G3) && !com.max.hbcommon.utils.i.d()) {
                            if (WebviewFragment.this.S == null) {
                                WebviewFragment webviewFragment2 = WebviewFragment.this;
                                webviewFragment2.S = com.max.xiaoheihe.utils.d.c1(((com.max.hbcommon.base.d) webviewFragment2).mContext, WebviewFragment.this.J3);
                            }
                            if (!WebviewFragment.this.S.isShowing()) {
                                WebviewFragment.this.S.show();
                            }
                        }
                        WebviewFragment.X4(WebviewFragment.this);
                    } else if (!WebviewFragment.V4.equals(WebviewFragment.this.f94399o)) {
                        new Handler().postDelayed(new c(), 0L);
                    }
                    if (WebviewFragment.W4.equals(WebviewFragment.this.f94399o)) {
                        WebviewFragment.this.mProgressBar.setVisibility(8);
                    }
                    WebviewFragment.this.mRefreshLayout.A(0);
                }
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            if (PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 47456, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported || WebviewFragment.this.K == null) {
                return;
            }
            WebviewFragment.this.K.o(webView, str);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (PatchProxy.proxy(new Object[]{view, customViewCallback}, this, changeQuickRedirect, false, 47459, new Class[]{View.class, WebChromeClient.CustomViewCallback.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onShowCustomView(view, customViewCallback);
            VideoPlayerManager.f76079a.w(((com.max.hbcommon.base.d) WebviewFragment.this).mContext, view, null, 0);
        }
    }

    public class l implements com.max.hbimage.b.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f94493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RectObj f94494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WebProtocolObj f94495c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f94496d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f94497e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Bitmap f94498f;

        l(String str, RectObj rectObj, WebProtocolObj webProtocolObj, List list, String str2, Bitmap bitmap) {
            this.f94493a = str;
            this.f94494b = rectObj;
            this.f94495c = webProtocolObj;
            this.f94496d = list;
            this.f94497e = str2;
            this.f94498f = bitmap;
        }

        @Override // com.max.hbimage.b.q
        public void a(Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 47416, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                return;
            }
            Bitmap bitmapB = com.max.hbimage.image.a.f70419a.b(drawable);
            Bitmap bitmapQ = com.max.xiaoheihe.utils.d.q(this.f94493a, com.max.hbutils.utils.n.q(this.f94494b.getWidth()));
            if (bitmapB == null || bitmapQ == null) {
                WebviewFragment.I5(WebviewFragment.this, this.f94495c, this.f94496d, null, this.f94497e, this.f94498f);
                return;
            }
            Bitmap bitmapQ2 = com.max.mediaselector.lib.utils.c.q(bitmapB.getHeight(), bitmapB.getWidth(), bitmapB, 0.0f, 0.0f, bitmapQ, com.max.hbutils.utils.n.p(this.f94494b.getLeft()), com.max.hbutils.utils.n.p(this.f94494b.getTop()));
            Log.d("showShareScreenDialog", "bitmap: " + bitmapB.getWidth() + " x " + bitmapB.getHeight() + "qrImage: " + bitmapQ.getWidth() + " x " + bitmapQ.getHeight() + "merge: " + bitmapQ2.getWidth() + " x " + bitmapQ2.getHeight());
            WebviewFragment.I5(WebviewFragment.this, this.f94495c, this.f94496d, bitmapQ2, this.f94497e, this.f94498f);
        }

        @Override // com.max.hbimage.b.q
        public /* synthetic */ void b(Drawable drawable) {
            com.max.hbimage.d.a(this, drawable);
        }

        @Override // com.max.hbimage.b.q
        public void onLoadFailed(Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 47417, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                return;
            }
            WebviewFragment.I5(WebviewFragment.this, this.f94495c, this.f94496d, null, this.f94497e, this.f94498f);
        }
    }

    public interface l0 {
        void a(Bitmap bitmap);
    }

    public class m extends com.max.xiaoheihe.module.webview.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        m(Context context, String str, WebProtocolObj webProtocolObj, List list, String str2, Bitmap bitmap, RectObj rectObj) {
            super(context, str, webProtocolObj, list, str2, bitmap, rectObj);
        }

        @Override // com.max.xiaoheihe.module.webview.a
        public void c(WebProtocolObj webProtocolObj, List<Bitmap> list, Bitmap bitmap, String str, Bitmap bitmap2) {
            if (PatchProxy.proxy(new Object[]{webProtocolObj, list, bitmap, str, bitmap2}, this, changeQuickRedirect, false, 47418, new Class[]{WebProtocolObj.class, List.class, Bitmap.class, String.class, Bitmap.class}, Void.TYPE).isSupported) {
                return;
            }
            WebviewFragment.I5(WebviewFragment.this, webProtocolObj, list, bitmap, str, bitmap2);
        }
    }

    public class m0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47472, new Class[0], Void.TYPE).isSupported && WebviewFragment.this.isActive()) {
                    WebviewFragment.this.mRefreshLayout.i0(false);
                }
            }
        }

        public class b implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ WebProtocolObj f94503b;

            b(WebProtocolObj webProtocolObj) {
                this.f94503b = webProtocolObj;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47473, new Class[0], Void.TYPE).isSupported && WebviewFragment.this.isActive()) {
                    HeyboxWebProtocolHandler heyboxWebProtocolHandler = com.max.xiaoheihe.utils.l0.f95687b;
                    Activity activity = ((com.max.hbcommon.base.d) WebviewFragment.this).mContext;
                    WebviewFragment webviewFragment = WebviewFragment.this;
                    heyboxWebProtocolHandler.C(activity, webviewFragment.f94385c4, this.f94503b, webviewFragment.B);
                }
            }
        }

        m0() {
        }

        @JavascriptInterface
        public void allowEvaluateJS() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47470, new Class[0], Void.TYPE).isSupported && WebviewFragment.this.isActive()) {
                WebviewFragment.this.f94380a0 = true;
                WebviewFragment.c5(WebviewFragment.this);
            }
        }

        @JavascriptInterface
        public void fetchHtml(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47465, new Class[]{String.class}, Void.TYPE).isSupported || WebviewFragment.this.K == null) {
                return;
            }
            WebviewFragment.this.K.c(WebviewFragment.this.f94385c4, str);
        }

        @JavascriptInterface
        public String getHeyboxEnv() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47469, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("user_id", Integer.valueOf(com.max.hbutils.utils.n.q(com.max.xiaoheihe.utils.i0.j())));
            jsonObject.addProperty("version", com.max.xiaoheihe.utils.d.x0());
            jsonObject.addProperty("os_type", "Android");
            jsonObject.addProperty("debug", Boolean.FALSE);
            if (MMKVManager.f71329a.d("webview", ad.c.f1223c, false, false)) {
                ArrayList<ArrayList<PathSrcNode>> arrayListG = com.max.hbcommon.analytics.l.f66572a.g();
                if (!com.max.hbcommon.utils.c.w(arrayListG) && !arrayListG.isEmpty()) {
                    ArrayList<PathSrcNode> arrayList = arrayListG.get(0);
                    if (!arrayList.isEmpty()) {
                        jsonObject.addProperty(com.max.hbsearch.l.W, com.max.hbutils.utils.k.p(arrayList.get(0)));
                    }
                }
            }
            String string = jsonObject.toString();
            com.max.heybox.hblog.g.W("[HeyboxEnv] env: " + string);
            return string;
        }

        @JavascriptInterface
        public void hbBridge(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47471, new Class[]{String.class}, Void.TYPE).isSupported || WebviewFragment.this.f94388f4 == null) {
                return;
            }
            WebviewFragment.this.f94388f4.d(str);
        }

        @JavascriptInterface
        public String hbProtocol(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47468, new Class[]{String.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            com.max.hbcommon.utils.d.b(WebviewFragment.f94368o4, "hbProtocol==" + str);
            WebProtocolObj webProtocolObjE0 = com.max.xiaoheihe.utils.l0.e0(str);
            if (!WebviewFragment.this.Z6(webProtocolObjE0) && webProtocolObjE0 != null) {
                WebviewFragment.this.f94385c4.post(new b(webProtocolObjE0));
            }
            return null;
        }

        @JavascriptInterface
        public void onGetScreenshotCompleted(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47464, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            WebviewFragment.this.w7(str);
        }

        @JavascriptInterface
        public void onScrollStateChanged(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47466, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b("onScrollStateChanged", "enablePull==" + str);
            if (WebviewFragment.this.f94400p) {
                if ("1".equals(str)) {
                    WebviewFragment.this.mRefreshLayout.i0(true);
                    WebviewFragment.this.f94385c4.setNestedScrollingEnabled(false);
                } else {
                    WebviewFragment.this.mRefreshLayout.A(0);
                    WebviewFragment.this.mRefreshLayout.postDelayed(new a(), 100L);
                }
            }
        }

        @JavascriptInterface
        public void tradeConfirm() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47467, new Class[0], Void.TYPE).isSupported && (((com.max.hbcommon.base.d) WebviewFragment.this).mContext instanceof TradeHandleOfferActivity)) {
                ((TradeHandleOfferActivity) ((com.max.hbcommon.base.d) WebviewFragment.this).mContext).b2();
            }
        }
    }

    public class n implements com.max.hbpermission.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f94505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f94506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f94507c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f94508d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f94509e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f94510f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f94511g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f94512h;

        n(List list, boolean z10, String str, List list2, List list3, String str2, String str3, String str4) {
            this.f94505a = list;
            this.f94506b = z10;
            this.f94507c = str;
            this.f94508d = list2;
            this.f94509e = list3;
            this.f94510f = str2;
            this.f94511g = str3;
            this.f94512h = str4;
        }

        @Override // com.max.hbpermission.c
        public void onResult() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47419, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Bitmap bitmap : this.f94505a) {
                File fileQ0 = com.max.hbimage.b.q0(bitmap, this.f94506b ? com.max.xiaoheihe.utils.d.T() : com.max.xiaoheihe.utils.d.Q());
                if (fileQ0 != null) {
                    com.max.hbimage.b.l0(((com.max.hbcommon.base.d) WebviewFragment.this).mContext, fileQ0.getAbsolutePath());
                    if (fileQ0.exists()) {
                        arrayList.add(fileQ0);
                        arrayList2.add(bitmap);
                    }
                }
            }
            if (com.max.hbcommon.utils.c.w(arrayList)) {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.save_fail));
                WebviewFragment.F5(WebviewFragment.this, this.f94512h);
            } else {
                if (this.f94506b) {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f("保存成功");
                }
                PostUtils.v(((com.max.hbcommon.base.d) WebviewFragment.this).mContext, arrayList, arrayList2, this.f94507c, this.f94508d, this.f94509e, this.f94510f, this.f94511g, AccelWorldShareKt.e(((com.max.hbcommon.base.d) WebviewFragment.this).mContext));
                WebviewFragment.D5(WebviewFragment.this, this.f94512h);
            }
        }
    }

    public static class n0 implements com.max.hbcommon.analytics.d.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f94514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final JsonObject f94515c;

        public n0(String str, JsonObject jsonObject) {
            this.f94514b = str;
            this.f94515c = jsonObject;
        }

        @Override // com.max.hbcommon.analytics.d.f
        public /* synthetic */ String H() {
            return com.max.hbcommon.analytics.e.a(this);
        }

        @Override // com.max.hbcommon.analytics.d.f
        public /* synthetic */ boolean d2() {
            return com.max.hbcommon.analytics.e.c(this);
        }

        @Override // com.max.hbcommon.analytics.d.f
        @androidx.annotation.p0
        public PathSrcNode getClickSrc() {
            return null;
        }

        @Override // com.max.hbcommon.analytics.d.f
        @androidx.annotation.p0
        public String getPageAdditional() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47478, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            JsonObject jsonObject = this.f94515c;
            if (jsonObject != null) {
                return jsonObject.toString();
            }
            return null;
        }

        @Override // com.max.hbcommon.analytics.d.f
        @androidx.annotation.p0
        public String getPagePath() {
            return this.f94514b;
        }

        @Override // com.max.hbcommon.analytics.d.f
        public /* synthetic */ boolean isPageVisited() {
            return com.max.hbcommon.analytics.e.e(this);
        }

        @Override // com.max.hbcommon.analytics.d.f
        public /* synthetic */ void l1(View view) {
            com.max.hbcommon.analytics.e.f(this, view);
        }

        @Override // com.max.hbcommon.analytics.d.f
        public /* synthetic */ boolean o3() {
            return com.max.hbcommon.analytics.e.d(this);
        }

        @Override // com.max.hbcommon.analytics.d.f
        public /* synthetic */ void onPageVisitSuccess() {
            com.max.hbcommon.analytics.e.g(this);
        }

        @Override // com.max.hbcommon.analytics.d.f
        public void setClickSrc(@androidx.annotation.p0 PathSrcNode pathSrcNode) {
        }

        @Override // com.max.hbcommon.analytics.d.f
        public /* synthetic */ void setPageVisited(boolean z10) {
            com.max.hbcommon.analytics.e.h(this, z10);
        }

        @Override // com.max.hbcommon.analytics.d.f
        public /* synthetic */ String v3() {
            return com.max.hbcommon.analytics.e.b(this);
        }
    }

    public class o implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f94516a;

        o(String str) {
            this.f94516a = str;
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(SHARE_MEDIA share_media, Throwable th2) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 47420, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.f94516a)) {
                return;
            }
            com.max.hbshare.d.F(WebviewFragment.this.getBaseView(), null, ((com.max.hbcommon.base.d) WebviewFragment.this).mContext instanceof BasePostPageActivity ? "normal" : "web", com.max.hbshare.d.i(share_media.name()), this.f94516a);
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(SHARE_MEDIA share_media) {
        }
    }

    public static class o0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        public WebResourceResponse a(WebView webView, WebResourceRequest webResourceRequest) {
            return null;
        }

        public void b(WebProtocolObj webProtocolObj) {
        }

        public void c(WebView webView, String str) {
        }

        public void d(WebView webView, WebResourceRequest webResourceRequest) {
        }

        public void e(WebView webView, String str) {
        }

        public void f(WebView webView, String str) {
        }

        public void g(WebView webView, String str, int i10, int i11) {
        }

        public void h(WebView webView, int i10, int i11, int i12, int i13) {
        }

        public void i(WebView webView, String str, int i10, int i11) {
        }

        public void j(boolean z10) {
        }

        public void k(WebView webView, int i10) {
        }

        public void l(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        }

        public void m(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        }

        public void n(WebView webView, Bitmap bitmap) {
        }

        public void o(WebView webView, String str) {
        }
    }

    public class p implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47421, new Class[0], Void.TYPE).isSupported && WebviewFragment.this.isActive()) {
                try {
                    if (WebviewFragment.this.getParentFragment() instanceof WebviewFragment) {
                        ((WebviewFragment) WebviewFragment.this.getParentFragment()).G6();
                    }
                    int iW = ViewUtils.W(WebviewFragment.this.f94385c4);
                    int iV = ViewUtils.V(WebviewFragment.this.f94385c4);
                    int iG = com.max.hbcommon.component.ezcalendarview.utils.a.g(WebviewFragment.this.G, 0, iW);
                    int iG2 = com.max.hbcommon.component.ezcalendarview.utils.a.g(WebviewFragment.this.F, 0, iV);
                    int iG3 = com.max.hbcommon.component.ezcalendarview.utils.a.g(WebviewFragment.this.H, 0, iW - iG);
                    int iG4 = com.max.hbcommon.component.ezcalendarview.utils.a.g(WebviewFragment.this.I, 0, iV - iG2);
                    WebviewFragment.this.C.clear();
                    Bitmap bitmapL = com.max.hbimage.b.l(WebviewFragment.this.f94385c4, iW, iV);
                    if (bitmapL != null) {
                        WebviewFragment.this.C.add(bitmapL);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapL, iG, iG2, iG3, iG4);
                        WebviewFragment.this.C.add(bitmapCreateBitmap);
                        com.max.xiaoheihe.module.account.o0.P3(bitmapCreateBitmap, com.max.hbimage.image.c.d(((com.max.hbcommon.base.d) WebviewFragment.this).mContext)).show(WebviewFragment.this.getFragmentManager(), "ShareMyPCDialogFragment");
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(WebviewFragment.this.getString(R.string.fail) + ": " + e10.getMessage());
                }
                WebviewFragment.this.E = false;
            }
        }
    }

    public class q implements com.max.xiaoheihe.utils.l0.i {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f94519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f94520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f94521c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f94522d;

        public class a implements UMShareListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.umeng.socialize.UMShareListener
            public void onCancel(SHARE_MEDIA share_media) {
            }

            @Override // com.umeng.socialize.UMShareListener
            public void onError(SHARE_MEDIA share_media, Throwable th2) {
            }

            @Override // com.umeng.socialize.UMShareListener
            public void onResult(SHARE_MEDIA share_media) {
                if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 47423, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(q.this.f94522d)) {
                    return;
                }
                com.max.hbshare.d.F(WebviewFragment.this.getBaseView(), null, ((com.max.hbcommon.base.d) WebviewFragment.this).mContext instanceof BasePostPageActivity ? "normal" : "web", com.max.hbshare.d.i(share_media.name()), q.this.f94522d);
            }

            @Override // com.umeng.socialize.UMShareListener
            public void onStart(SHARE_MEDIA share_media) {
            }
        }

        q(String str, String str2, String str3, String str4) {
            this.f94519a = str;
            this.f94520b = str2;
            this.f94521c = str3;
            this.f94522d = str4;
        }

        @Override // com.max.xiaoheihe.utils.l0.i
        public void a(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47422, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b("chromium", "imageBase64==" + str);
            if (com.max.hbcommon.utils.c.u(str) || !str.contains("data:image")) {
                return;
            }
            byte[] bArrDecode = Base64.decode(str.replaceAll("\"", "").split(Constants.ACCEPT_TIME_SEPARATOR_SP)[1], 0);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
            BBSTopicObj bBSTopicObj = !com.max.hbcommon.utils.c.u(this.f94519a) ? (BBSTopicObj) com.max.hbutils.utils.k.a(this.f94519a, BBSTopicObj.class) : null;
            ShareImageDialogFragment shareImageDialogFragmentX4 = ShareImageDialogFragment.x4();
            shareImageDialogFragmentX4.A4(bitmapDecodeByteArray);
            shareImageDialogFragmentX4.J4(this.f94520b);
            shareImageDialogFragmentX4.V4(!"0".equals(this.f94521c));
            shareImageDialogFragmentX4.Y4(bBSTopicObj);
            shareImageDialogFragmentX4.S4(new com.max.hbshare.c.b("web", new a(), WebviewFragment.W5(WebviewFragment.this, null)));
            shareImageDialogFragmentX4.show(WebviewFragment.this.getChildFragmentManager(), "share_image");
        }

        @Override // com.max.xiaoheihe.utils.l0.i
        public boolean b() {
            return true;
        }
    }

    public class r implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f94525a;

        r(String str) {
            this.f94525a = str;
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(SHARE_MEDIA share_media, Throwable th2) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 47424, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.f94525a)) {
                return;
            }
            com.max.hbshare.d.F(WebviewFragment.this.getBaseView(), null, ((com.max.hbcommon.base.d) WebviewFragment.this).mContext instanceof BasePostPageActivity ? "normal" : "web", com.max.hbshare.d.i(share_media.name()), this.f94525a);
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(SHARE_MEDIA share_media) {
        }
    }

    public class s implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47425, new Class[0], Void.TYPE).isSupported && WebviewFragment.this.isActive()) {
                WebviewFragment.P4(WebviewFragment.this, false);
            }
        }
    }

    public class t implements l0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebView f94528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f94529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f94530c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l0 f94531d;

        t(WebView webView, int i10, int i11, l0 l0Var) {
            this.f94528a = webView;
            this.f94529b = i10;
            this.f94530c = i11;
            this.f94531d = l0Var;
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.l0
        public void a(Bitmap bitmap) {
            if (PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, 47426, new Class[]{Bitmap.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f94528a.scrollTo(this.f94529b, this.f94530c);
            this.f94531d.a(bitmap);
        }
    }

    public class u implements l0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f94533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f94534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WebView f94535c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f94536d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ l0 f94537e;

        public class a implements ValueAnimator.AnimatorUpdateListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (!PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, 47428, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported && WebviewFragment.this.isActive()) {
                    int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    u.this.f94535c.scrollTo(iIntValue, 0);
                    if (iIntValue == WebviewFragment.this.f94413x2.getWidth()) {
                        u uVar = u.this;
                        WebviewFragment webviewFragment = WebviewFragment.this;
                        WebView webView = uVar.f94535c;
                        int i10 = uVar.f94533a;
                        int i11 = uVar.f94536d;
                        webviewFragment.K6(webView, i10, i11, Math.min(i11, uVar.f94534b), u.this.f94537e);
                    }
                }
            }
        }

        u(int i10, int i11, WebView webView, int i12, l0 l0Var) {
            this.f94533a = i10;
            this.f94534b = i11;
            this.f94535c = webView;
            this.f94536d = i12;
            this.f94537e = l0Var;
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.l0
        public void a(Bitmap bitmap) {
            if (!PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, 47427, new Class[]{Bitmap.class}, Void.TYPE).isSupported && WebviewFragment.this.isActive()) {
                WebviewFragment webviewFragment = WebviewFragment.this;
                Bitmap bitmap2 = webviewFragment.f94413x2;
                if (bitmap2 == null) {
                    webviewFragment.f94413x2 = bitmap;
                } else {
                    webviewFragment.f94413x2 = com.max.mediaselector.lib.utils.c.q(this.f94533a, bitmap2.getWidth() + this.f94534b, bitmap, WebviewFragment.this.f94413x2.getWidth() - (this.f94535c.getWidth() - this.f94534b), 0.0f, WebviewFragment.this.f94413x2, 0.0f, 0.0f);
                }
                if (this.f94536d <= 0) {
                    this.f94537e.a(WebviewFragment.this.f94413x2);
                    WebviewFragment.Y5(WebviewFragment.this, this.f94535c);
                } else {
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f94535c.getScrollX(), WebviewFragment.this.f94413x2.getWidth());
                    valueAnimatorOfInt.setDuration(100L);
                    valueAnimatorOfInt.addUpdateListener(new a());
                    valueAnimatorOfInt.start();
                }
            }
        }
    }

    public class v extends TypeToken<List<PrefetchObj>> {
        v() {
        }
    }

    public class w implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebView f94541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f94542c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f94543d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f94544e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f94545f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f94546g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ l0 f94547h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f94548i;

        public class a implements l0 {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.xiaoheihe.module.webview.WebviewFragment.l0
            public void a(Bitmap bitmap) {
                if (PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, 47431, new Class[]{Bitmap.class}, Void.TYPE).isSupported) {
                    return;
                }
                w wVar = w.this;
                if (wVar.f94548i) {
                    wVar.f94541b.scrollTo(0, wVar.f94544e);
                    w wVar2 = w.this;
                    WebviewFragment.Y5(WebviewFragment.this, wVar2.f94541b);
                }
                w.this.f94547h.a(bitmap);
            }
        }

        w(WebView webView, int i10, int i11, int i12, int i13, int i14, l0 l0Var, boolean z10) {
            this.f94541b = webView;
            this.f94542c = i10;
            this.f94543d = i11;
            this.f94544e = i12;
            this.f94545f = i13;
            this.f94546g = i14;
            this.f94547h = l0Var;
            this.f94548i = z10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, 47430, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported && WebviewFragment.this.isActive()) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f94541b.scrollTo(((this.f94542c * iIntValue) / 100) + this.f94543d, ((this.f94544e * iIntValue) / 100) + this.f94545f);
                if (iIntValue == 0) {
                    WebviewFragment.this.f94402p2 = WebviewFragment.R6(this.f94541b);
                    int height = this.f94541b.getHeight();
                    int i10 = this.f94546g;
                    if (this.f94545f == 0 && height >= i10) {
                        this.f94547h.a(WebviewFragment.this.f94402p2);
                    } else {
                        int i11 = i10 - height;
                        WebviewFragment.Z5(WebviewFragment.this, this.f94541b, this.f94543d, i11, Math.min(i11, height), new a());
                    }
                }
            }
        }
    }

    public class x implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebView f94551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f94552c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f94553d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f94554e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f94555f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f94556g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ l0 f94557h;

        x(WebView webView, int i10, int i11, int i12, int i13, int i14, l0 l0Var) {
            this.f94551b = webView;
            this.f94552c = i10;
            this.f94553d = i11;
            this.f94554e = i12;
            this.f94555f = i13;
            this.f94556g = i14;
            this.f94557h = l0Var;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, 47432, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported && WebviewFragment.this.isActive()) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f94551b.scrollTo(this.f94552c, this.f94553d + iIntValue);
                if (iIntValue == this.f94554e) {
                    Bitmap bitmapR6 = WebviewFragment.R6(this.f94551b);
                    WebviewFragment webviewFragment = WebviewFragment.this;
                    webviewFragment.f94402p2 = com.max.mediaselector.lib.utils.c.q(webviewFragment.f94402p2.getHeight() + this.f94554e, this.f94555f, bitmapR6, 0.0f, WebviewFragment.this.f94402p2.getHeight() - (this.f94551b.getHeight() - this.f94554e), WebviewFragment.this.f94402p2, 0.0f, 0.0f);
                    int i10 = this.f94556g;
                    int i11 = this.f94554e;
                    if (i10 > i11) {
                        WebviewFragment.Z5(WebviewFragment.this, this.f94551b, this.f94552c, i10, i11, this.f94557h);
                        return;
                    }
                    if (i10 > 0) {
                        WebviewFragment.Z5(WebviewFragment.this, this.f94551b, this.f94552c, 0, i10, this.f94557h);
                        return;
                    }
                    l0 l0Var = this.f94557h;
                    if (l0Var != null) {
                        l0Var.a(WebviewFragment.this.f94402p2);
                    }
                }
            }
        }
    }

    public class y implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        y() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 47435, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            WebviewFragment.this.H7();
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(SHARE_MEDIA share_media, Throwable th2) {
            if (PatchProxy.proxy(new Object[]{share_media, th2}, this, changeQuickRedirect, false, 47434, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(WebviewFragment.this.getString(R.string.share_fail));
            WebviewFragment.this.H7();
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(SHARE_MEDIA share_media) {
            if (!PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 47433, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported && WebviewFragment.this.isActive()) {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.share_success));
                String strI = com.max.hbshare.d.i(share_media.name());
                String mini_program_share = ((com.max.hbcommon.base.d) WebviewFragment.this).mContext instanceof BasePostPageActivity ? "normal" : "web";
                String src = null;
                String act_id = WebviewFragment.this.D;
                if (WebviewFragment.this.W3() != null) {
                    src = WebviewFragment.this.W3().getSrc();
                    if (!com.max.hbcommon.utils.c.u(WebviewFragment.this.W3().getAct_id())) {
                        act_id = WebviewFragment.this.W3().getAct_id();
                    }
                    if (!com.max.hbcommon.utils.c.u(WebviewFragment.this.W3().getMini_program_share())) {
                        mini_program_share = WebviewFragment.this.W3().getMini_program_share();
                    }
                }
                com.max.hbshare.d.F(WebviewFragment.this.getBaseView(), src, mini_program_share, strI, act_id);
                WebviewFragment.this.H7();
            }
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(SHARE_MEDIA share_media) {
        }
    }

    public class z implements com.max.xiaoheihe.module.upload.g.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f94560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebviewFragment f94561b;

        z(String str, WebviewFragment webviewFragment) {
            this.f94560a = str;
            this.f94561b = webviewFragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void h(JsonObject jsonObject, JsonObject jsonObject2) {
            if (PatchProxy.proxy(new Object[]{jsonObject, jsonObject2}, null, changeQuickRedirect, true, 47439, new Class[]{JsonObject.class, JsonObject.class}, Void.TYPE).isSupported) {
                return;
            }
            jsonObject2.add("data", jsonObject);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47438, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            WebviewFragment.this.H6(str, null);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ void a(float f10) {
            com.max.xiaoheihe.module.upload.h.b(this, f10);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean b() {
            return com.max.xiaoheihe.module.upload.h.a(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void c(String[] strArr, String str) {
            if (PatchProxy.proxy(new Object[]{strArr, str}, this, changeQuickRedirect, false, 47436, new Class[]{String[].class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            WebviewFragment.this.G6();
            com.max.hbcommon.utils.d.b("zzzzfiletest", "onUploadSuccess ==" + strArr[0]);
            final JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("url", strArr[0]);
            final String strM = HeyboxWebProtocolHandler.m(this.f94560a, jsonObject.toString());
            com.max.hbcommon.utils.d.b("zzzzfiletest", "jscallback ==" + strM);
            com.max.xiaoheihe.accelworld.j.b(this.f94560a, this.f94561b, new com.max.xiaoheihe.module.webview.t.b() { // from class: com.max.xiaoheihe.module.webview.p0
                @Override // com.max.xiaoheihe.module.webview.t.b
                public final void a(JsonObject jsonObject2) {
                    WebviewFragment.z.h(jsonObject, jsonObject2);
                }
            }, new com.max.xiaoheihe.module.webview.t.a() { // from class: com.max.xiaoheihe.module.webview.q0
                @Override // com.max.xiaoheihe.module.webview.t.a
                public final void a() {
                    this.f94766a.i(strM);
                }
            }, null);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean d() {
            return com.max.xiaoheihe.module.upload.h.c(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void e(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47437, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            WebviewFragment.this.G6();
            com.max.hbcommon.utils.d.b("zzzzfiletest", "onUploadFail ==" + str);
        }
    }

    static /* synthetic */ void A5(WebviewFragment webviewFragment, WebProtocolObj webProtocolObj, List list, String str, Bitmap bitmap) {
        if (PatchProxy.proxy(new Object[]{webviewFragment, webProtocolObj, list, str, bitmap}, null, changeQuickRedirect, true, 47373, new Class[]{WebviewFragment.class, WebProtocolObj.class, List.class, String.class, Bitmap.class}, Void.TYPE).isSupported) {
            return;
        }
        webviewFragment.k8(webProtocolObj, list, str, bitmap);
    }

    private void A6(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47274, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        String strS = com.max.xiaoheihe.utils.l0.s(str);
        if (com.max.hbcommon.utils.c.u(strS) || !strS.contains("steam")) {
            return;
        }
        B6();
        if (this.f94383b4) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.mContext).y("您的浏览器内核版本过低，可能无法使用此功能，建议您升级系统后使用").u("确定", new d()).g(false).d().show();
    }

    private void B6() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47275, new Class[0], Void.TYPE).isSupported && this.f94383b4) {
            Matcher matcher = Pattern.compile("Chrome/(\\d+).").matcher(this.f94385c4.getSettings().getUserAgentString());
            if (matcher.find()) {
                int iQ = com.max.hbutils.utils.n.q(matcher.group(1));
                if (iQ <= 66 && iQ >= 51) {
                    this.f94383b4 = false;
                }
                com.max.heybox.hblog.g.W("Chrome Version:" + iQ);
            }
        }
    }

    private void B7(ProxyAddressObj proxyAddressObj) {
        if (PatchProxy.proxy(new Object[]{proxyAddressObj}, this, changeQuickRedirect, false, 47265, new Class[]{ProxyAddressObj.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.i.d() || k7() || this.L || this.f94385c4 == null || proxyAddressObj == null || !proxyAddressObj.isValid()) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzztest", "openProxy");
        this.L = true;
        this.f94410w = proxyAddressObj;
        com.max.xiaoheihe.utils.z.f(this.f94385c4, proxyAddressObj.getHost(), com.max.hbutils.utils.n.q(this.f94410w.getPort()), this.P == null, com.max.xiaoheihe.utils.z.f95790b);
    }

    static /* synthetic */ void C5(WebviewFragment webviewFragment, List list, WebProtocolObj webProtocolObj, String str, Bitmap bitmap) {
        if (PatchProxy.proxy(new Object[]{webviewFragment, list, webProtocolObj, str, bitmap}, null, changeQuickRedirect, true, 47374, new Class[]{WebviewFragment.class, List.class, WebProtocolObj.class, String.class, Bitmap.class}, Void.TYPE).isSupported) {
            return;
        }
        webviewFragment.e8(list, webProtocolObj, str, bitmap);
    }

    static /* synthetic */ void D5(WebviewFragment webviewFragment, String str) {
        if (PatchProxy.proxy(new Object[]{webviewFragment, str}, null, changeQuickRedirect, true, 47375, new Class[]{WebviewFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        webviewFragment.y7(str);
    }

    private Bitmap D6(int i10, List<RectObj> list, Bitmap bitmap, int i11, int i12) {
        int height = 0;
        Object[] objArr = {new Integer(i10), list, bitmap, new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 47286, new Class[]{cls, List.class, Bitmap.class, cls, cls}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        if (bitmap == null || com.max.hbcommon.utils.c.w(list)) {
            return null;
        }
        this.C.add(bitmap);
        ArrayList<Bitmap> arrayList = new ArrayList();
        int width = 0;
        int height2 = 0;
        for (RectObj rectObj : list) {
            try {
                int iF = ViewUtils.f(this.mContext, com.max.hbutils.utils.n.q(rectObj.getLeft()));
                int iF2 = ViewUtils.f(this.mContext, com.max.hbutils.utils.n.q(rectObj.getTop())) - i10;
                int iF3 = ViewUtils.f(this.mContext, com.max.hbutils.utils.n.q(rectObj.getWidth()));
                int iF4 = ViewUtils.f(this.mContext, com.max.hbutils.utils.n.q(rectObj.getHeight()));
                int iG = com.max.hbcommon.component.ezcalendarview.utils.a.g(iF, 0, i11);
                int iG2 = com.max.hbcommon.component.ezcalendarview.utils.a.g(iF2, 0, i12);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, iG, iG2, com.max.hbcommon.component.ezcalendarview.utils.a.g(iF3, 0, i11 - iG), com.max.hbcommon.component.ezcalendarview.utils.a.g(iF4, 0, i12 - iG2));
                if (bitmapCreateBitmap.getWidth() > width) {
                    width = bitmapCreateBitmap.getWidth();
                }
                height2 += bitmapCreateBitmap.getHeight();
                this.C.add(bitmapCreateBitmap);
                arrayList.add(bitmapCreateBitmap);
            } catch (Exception e10) {
                e10.printStackTrace();
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(getString(R.string.fail) + ": " + e10.getMessage());
            }
        }
        if (arrayList.size() <= 0 || width <= 0 || height2 <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(width, height2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        for (Bitmap bitmap2 : arrayList) {
            canvas.drawBitmap(bitmap2, 0.0f, height, (Paint) null);
            height += bitmap2.getHeight();
        }
        return bitmapCreateBitmap2;
    }

    private void E6(WebView webView) {
        if (PatchProxy.proxy(new Object[]{webView}, this, changeQuickRedirect, false, 47315, new Class[]{WebView.class}, Void.TYPE).isSupported) {
            return;
        }
        webView.setVerticalScrollBarEnabled(true);
        webView.setHorizontalScrollBarEnabled(true);
        webView.setDrawingCacheEnabled(false);
        webView.destroyDrawingCache();
    }

    private void E7() {
        WebProtocolObj webProtocolObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47247, new Class[0], Void.TYPE).isSupported || (webProtocolObj = this.U) == null) {
            return;
        }
        String strValueOf = webProtocolObj.valueOf("prefetch");
        if (com.max.hbcommon.utils.c.u(strValueOf)) {
            return;
        }
        List list = (List) new Gson().fromJson(strValueOf, new v().getType());
        if (com.max.hbcommon.utils.c.w(list)) {
            return;
        }
        this.Z = list.size();
        this.Y.clear();
        for (int i10 = 0; i10 < this.Z; i10++) {
            com.max.xiaoheihe.utils.l0.s0(((PrefetchObj) list.get(i10)).getType(), ((PrefetchObj) list.get(i10)).getUrl(), ((PrefetchObj) list.get(i10)).getQuery(), ((PrefetchObj) list.get(i10)).getBody(), ((PrefetchObj) list.get(i10)).getNeed_encrypt(), null, null, new e0(i10));
        }
    }

    static /* synthetic */ void F5(WebviewFragment webviewFragment, String str) {
        if (PatchProxy.proxy(new Object[]{webviewFragment, str}, null, changeQuickRedirect, true, 47376, new Class[]{WebviewFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        webviewFragment.x7(str);
    }

    private boolean F6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47345, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : ad.a.a(ad.a.f1208o, false);
    }

    private void F7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47249, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        H6(String.format("window.prefetchCallback(%s)", new Gson().toJson(this.Y)), null);
    }

    private void G7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47258, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (a8()) {
            x6(true);
        }
        g7();
    }

    static /* synthetic */ void H5(WebviewFragment webviewFragment) {
        if (PatchProxy.proxy(new Object[]{webviewFragment}, null, changeQuickRedirect, true, 47377, new Class[]{WebviewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        webviewFragment.b7();
    }

    static /* synthetic */ void I5(WebviewFragment webviewFragment, WebProtocolObj webProtocolObj, List list, Bitmap bitmap, String str, Bitmap bitmap2) {
        if (PatchProxy.proxy(new Object[]{webviewFragment, webProtocolObj, list, bitmap, str, bitmap2}, null, changeQuickRedirect, true, 47378, new Class[]{WebviewFragment.class, WebProtocolObj.class, List.class, Bitmap.class, String.class, Bitmap.class}, Void.TYPE).isSupported) {
            return;
        }
        webviewFragment.j8(webProtocolObj, list, bitmap, str, bitmap2);
    }

    private void I7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47335, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (t0.f(this.f94395m)) {
            this.f94417z = true;
        } else {
            this.f94417z = false;
        }
        if (this.f94417z) {
            com.max.xiaoheihe.utils.l0.d(this.f94385c4.getSettings(), this.f94395m);
            com.max.xiaoheihe.utils.l0.c(this.mContext, this.f94395m);
        }
        String strE = com.max.xiaoheihe.utils.l0.e(this.f94395m);
        this.f94395m = strE;
        this.f94414y = false;
        h7(strE);
    }

    private JsonObject J6(JsonObject jsonObject) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jsonObject}, this, changeQuickRedirect, false, 47323, new Class[]{JsonObject.class}, JsonObject.class);
        if (patchProxyResultProxy.isSupported) {
            return (JsonObject) patchProxyResultProxy.result;
        }
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        jsonObject.addProperty("web_url", this.f94395m);
        return jsonObject;
    }

    private void K7(WebView webView, int i10, int i11, int i12, l0 l0Var) {
        Object[] objArr = {webView, new Integer(i10), new Integer(i11), new Integer(i12), l0Var};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (!PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 47318, new Class[]{WebView.class, cls, cls, cls, l0.class}, Void.TYPE).isSupported && isActive()) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, i12);
            valueAnimatorOfInt.setDuration(100L);
            valueAnimatorOfInt.addUpdateListener(new x(webView, i10, webView.getScrollY(), i12, ViewUtils.L(this.mContext), i11 - i12, l0Var));
            valueAnimatorOfInt.start();
        }
    }

    private void L6() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47248, new Class[0], Void.TYPE).isSupported && this.Z == this.Y.size() && this.f94380a0) {
            F7();
        }
    }

    private String M6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47340, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (this.V3 != null) {
            return new Gson().toJson((JsonElement) this.V3);
        }
        if (com.max.hbcommon.utils.c.u(this.f94395m)) {
            return null;
        }
        String query = Uri.parse(this.f94395m).getQuery();
        if (com.max.hbcommon.utils.c.u(query)) {
            return null;
        }
        String[] strArrSplit = query.split("&");
        JsonObject jsonObject = new JsonObject();
        for (String str : strArrSplit) {
            try {
                String[] strArrSplit2 = str.split(ContainerUtils.KEY_VALUE_DELIMITER);
                jsonObject.addProperty(strArrSplit2[0], strArrSplit2[1]);
            } catch (Exception unused) {
            }
        }
        jsonObject.remove("type");
        return new Gson().toJson((JsonElement) jsonObject);
    }

    static /* synthetic */ void P4(WebviewFragment webviewFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{webviewFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 47367, new Class[]{WebviewFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        webviewFragment.x6(z10);
    }

    private void P6(WebProtocolObj webProtocolObj, List<List<RectObj>> list, List<RectObj> list2, RectObj rectObj, int i10) {
        if (PatchProxy.proxy(new Object[]{webProtocolObj, list, list2, rectObj, new Integer(i10)}, this, changeQuickRedirect, false, 47284, new Class[]{WebProtocolObj.class, List.class, List.class, RectObj.class, Integer.TYPE}, Void.TYPE).isSupported || this.f94403p3 != null || com.max.hbcommon.utils.c.w(list)) {
            return;
        }
        boolean zEquals = "screenShotShareV2".equals(webProtocolObj.getProtocol_type());
        d8();
        this.C.clear();
        if (rectObj != null) {
            int iF = ViewUtils.f(this.mContext, com.max.hbutils.utils.n.q(rectObj.getWidth()));
            int iF2 = ViewUtils.f(this.mContext, com.max.hbutils.utils.n.q(rectObj.getHeight()));
            int iF3 = ViewUtils.f(this.mContext, com.max.hbutils.utils.n.q(rectObj.getWidth()));
            if (iF2 <= 0 || iF3 <= 0) {
                return;
            }
            this.f94385c4.postDelayed(new h(iF3, iF2, list, iF, list2, webProtocolObj, zEquals), i10);
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = Integer.MAX_VALUE;
        Iterator<List<RectObj>> it = list.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            int i13 = 0;
            for (RectObj rectObj2 : it.next()) {
                int iF4 = ViewUtils.f(this.mContext, com.max.hbutils.utils.n.q(rectObj2.getTop()));
                int iF5 = ViewUtils.f(this.mContext, com.max.hbutils.utils.n.q(rectObj2.getHeight())) + iF4;
                if (iF5 > i13) {
                    i13 = iF5;
                }
                if (iF4 < i11) {
                    i11 = iF4;
                }
            }
            if (i12 < i13) {
                i12 = i13;
            }
        }
        int i14 = i12 - i11 > this.f94385c4.getHeight() ? i11 : 0;
        int i15 = i12 - i14;
        if (i15 > 0) {
            this.f94385c4.postDelayed(new i(i14, i15, list, arrayList, list2, webProtocolObj, zEquals), i10);
        }
    }

    public static Bitmap R6(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 47313, new Class[]{View.class}, Bitmap.class);
        return patchProxyResultProxy.isSupported ? (Bitmap) patchProxyResultProxy.result : ViewUtils.U(view);
    }

    private void S6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47350, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        H6(f94360b5, new b0());
    }

    private void T6() {
        com.max.xiaoheihe.module.webview.c0 c0Var;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47270, new Class[0], Void.TYPE).isSupported || (c0Var = this.f94388f4) == null) {
            return;
        }
        String strA = com.max.xiaoheihe.module.webview.c0.a(c0Var.b("getScreenshotRect", com.max.xiaoheihe.module.webview.c0.f94587i));
        if (com.max.hbcommon.utils.c.u(strA)) {
            return;
        }
        H6(strA, null);
    }

    static /* synthetic */ JsonObject W5(WebviewFragment webviewFragment, JsonObject jsonObject) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webviewFragment, jsonObject}, null, changeQuickRedirect, true, 47379, new Class[]{WebviewFragment.class, JsonObject.class}, JsonObject.class);
        return patchProxyResultProxy.isSupported ? (JsonObject) patchProxyResultProxy.result : webviewFragment.J6(jsonObject);
    }

    static /* synthetic */ void X4(WebviewFragment webviewFragment) {
        if (PatchProxy.proxy(new Object[]{webviewFragment}, null, changeQuickRedirect, true, 47368, new Class[]{WebviewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        webviewFragment.showError();
    }

    static /* synthetic */ void X5(WebviewFragment webviewFragment) {
        if (PatchProxy.proxy(new Object[]{webviewFragment}, null, changeQuickRedirect, true, 47365, new Class[]{WebviewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        webviewFragment.I7();
    }

    static /* synthetic */ void Y5(WebviewFragment webviewFragment, WebView webView) {
        if (PatchProxy.proxy(new Object[]{webviewFragment, webView}, null, changeQuickRedirect, true, 47380, new Class[]{WebviewFragment.class, WebView.class}, Void.TYPE).isSupported) {
            return;
        }
        webviewFragment.E6(webView);
    }

    private void Y6(List<Bitmap> list, WebProtocolObj webProtocolObj, Bitmap bitmap, boolean z10) {
        boolean zX;
        boolean zX2;
        File fileQ0;
        if (PatchProxy.proxy(new Object[]{list, webProtocolObj, bitmap, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 47287, new Class[]{List.class, WebProtocolObj.class, Bitmap.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        String strM = null;
        if (z10) {
            ScreenUploadInfo screenUploadInfo = (ScreenUploadInfo) webProtocolObj.objectOf("upload_info", ScreenUploadInfo.class);
            if (screenUploadInfo != null) {
                strM = HeyboxWebProtocolHandler.m(screenUploadInfo.getJsCallbackFunc(), null);
                Boolean bool = Boolean.TRUE;
                zX = bool.equals(screenUploadInfo.getUpload());
                zX2 = bool.equals(screenUploadInfo.getOnly_upload());
            } else {
                zX2 = false;
                zX = false;
            }
        } else {
            strM = HeyboxWebProtocolHandler.m(webProtocolObj.valueOf("jsCallbackFunc"), null);
            zX = com.max.hbcommon.utils.c.x(webProtocolObj.valueOf(ConnType.PK_CDN));
            zX2 = com.max.hbcommon.utils.c.x(webProtocolObj.valueOf("no_gui"));
        }
        String str = strM;
        boolean z11 = zX2;
        if (com.max.hbcommon.utils.c.w(list)) {
            x7(str);
            return;
        }
        if (!zX) {
            if (z10) {
                k8(webProtocolObj, list, str, bitmap);
                return;
            } else {
                e8(list, webProtocolObj, str, bitmap);
                return;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Bitmap bitmap2 : list) {
            if (bitmap2 != null && (fileQ0 = com.max.hbimage.b.q0(bitmap2, com.max.xiaoheihe.utils.d.Q())) != null && fileQ0.exists()) {
                arrayList.add(fileQ0.getAbsolutePath());
                arrayList2.add(fileQ0);
            }
        }
        if (com.max.hbcommon.utils.c.w(arrayList)) {
            x7(str);
        } else {
            com.max.xiaoheihe.module.upload.g.h(this.mContext, getCompositeDisposable(), arrayList, "bbs", new j(str, z11, z10, webProtocolObj, list, bitmap, arrayList2));
        }
    }

    static /* synthetic */ void Z5(WebviewFragment webviewFragment, WebView webView, int i10, int i11, int i12, l0 l0Var) {
        Object[] objArr = {webviewFragment, webView, new Integer(i10), new Integer(i11), new Integer(i12), l0Var};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 47381, new Class[]{WebviewFragment.class, WebView.class, cls, cls, cls, l0.class}, Void.TYPE).isSupported) {
            return;
        }
        webviewFragment.K7(webView, i10, i11, i12, l0Var);
    }

    private void Z7(WebProtocolObj webProtocolObj, List<List<RectObj>> list, List<RectObj> list2, RectObj rectObj, int i10) {
        if (PatchProxy.proxy(new Object[]{webProtocolObj, list, list2, rectObj, new Integer(i10)}, this, changeQuickRedirect, false, 47285, new Class[]{WebProtocolObj.class, List.class, List.class, RectObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (!com.max.hbcommon.utils.c.w(list)) {
            P6(webProtocolObj, list, list2, rectObj, i10);
            return;
        }
        LoadingDialog loadingDialog = this.J;
        if (loadingDialog == null || !loadingDialog.i()) {
            this.J = new LoadingDialog(this.mContext, getString(R.string.loading), true).r();
        }
        this.G = ViewUtils.f(this.mContext, com.max.hbutils.utils.n.q(webProtocolObj.valueOf("screenshot_left")));
        this.F = ViewUtils.f(this.mContext, com.max.hbutils.utils.n.q(webProtocolObj.valueOf("screenshot_top")));
        this.H = ViewUtils.f(this.mContext, com.max.hbutils.utils.n.q(webProtocolObj.valueOf("screenshot_width")));
        this.I = ViewUtils.f(this.mContext, com.max.hbutils.utils.n.q(webProtocolObj.valueOf("screenshot_height")));
        WebviewFragment webviewFragmentU7 = u7(this.f94395m + "&screenshot=1");
        webviewFragmentU7.V7(true);
        webviewFragmentU7.S7(this.G);
        webviewFragmentU7.T7(this.F);
        webviewFragmentU7.U7(this.H);
        webviewFragmentU7.R7(this.I);
        getChildFragmentManager().u().y(R.id.fragment_container, webviewFragmentU7).m();
    }

    private boolean a7() {
        return this.f94388f4 != null;
    }

    private boolean a8() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47346, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return U4.equals(this.f94399o) || V4.equals(this.f94399o);
    }

    private void b7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47293, new Class[0], Void.TYPE).isSupported || !isActive() || this.f94403p3 == null) {
            return;
        }
        this.mContext.getWindowManager().removeView(this.f94403p3);
        this.f94403p3 = null;
    }

    private void b8() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47292, new Class[0], Void.TYPE).isSupported && isActive() && this.f94403p3 == null) {
            this.f94403p3 = new ImageView(this.mContext);
            this.f94403p3.setImageBitmap(getParentFragment() instanceof WebFragmentDialog ? R6(((WebFragmentDialog) getParentFragment()).getDialog().getWindow().getDecorView()) : R6(this.mContext.getWindow().getDecorView()));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(2, 134219544, -2);
            layoutParams.width = -1;
            layoutParams.height = ViewUtils.u(this.mContext);
            layoutParams.gravity = 51;
            layoutParams.y = 0;
            layoutParams.x = 0;
            this.mContext.getWindowManager().addView(this.f94403p3, layoutParams);
        }
    }

    static /* synthetic */ void c5(WebviewFragment webviewFragment) {
        if (PatchProxy.proxy(new Object[]{webviewFragment}, null, changeQuickRedirect, true, 47364, new Class[]{WebviewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        webviewFragment.L6();
    }

    private void e7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47257, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (k7()) {
            this.G3 = true;
        } else {
            B7(this.f94410w);
        }
        i7();
        G7();
    }

    private void e8(List<Bitmap> list, WebProtocolObj webProtocolObj, String str, Bitmap bitmap) {
        if (PatchProxy.proxy(new Object[]{list, webProtocolObj, str, bitmap}, this, changeQuickRedirect, false, 47294, new Class[]{List.class, WebProtocolObj.class, String.class, Bitmap.class}, Void.TYPE).isSupported) {
            return;
        }
        if (ad.a.c() > 1) {
            h8(list, webProtocolObj, str, bitmap);
        } else {
            g8(list, webProtocolObj, str, bitmap);
        }
    }

    static /* synthetic */ void f5(WebviewFragment webviewFragment, String str) {
        if (PatchProxy.proxy(new Object[]{webviewFragment, str}, null, changeQuickRedirect, true, 47369, new Class[]{WebviewFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        webviewFragment.A6(str);
    }

    private void f8(List<Bitmap> list, ShareImageDialogConfigObj shareImageDialogConfigObj, String str, String str2, JsonObject jsonObject, String str3) {
        JsonObject jsonObject2 = jsonObject;
        if (PatchProxy.proxy(new Object[]{list, shareImageDialogConfigObj, str, str2, jsonObject2, str3}, this, changeQuickRedirect, false, 47300, new Class[]{List.class, ShareImageDialogConfigObj.class, String.class, String.class, JsonObject.class, String.class}, Void.TYPE).isSupported || shareImageDialogConfigObj == null) {
            return;
        }
        if (jsonObject2 != null) {
            String strE = com.max.hbutils.utils.k.e(jsonObject.toString(), "act_id");
            if (com.max.hbcommon.utils.c.u(strE)) {
                jsonObject2.addProperty("act_id", str3);
                this.D = str3;
            } else {
                this.D = strE;
            }
        } else if (!com.max.hbcommon.utils.c.u(str3)) {
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty("act_id", str3);
            this.D = str3;
            jsonObject2 = jsonObject3;
        }
        y7(str2);
        ShareImageDialogFragment shareImageDialogFragmentX4 = ShareImageDialogFragment.x4();
        shareImageDialogFragmentX4.B4(list);
        shareImageDialogFragmentX4.C4(shareImageDialogConfigObj);
        JsonObject jsonObjectE = AccelWorldShareKt.e(this.mContext);
        if (jsonObjectE != null) {
            shareImageDialogFragmentX4.O4(com.max.hbutils.utils.k.p(jsonObjectE));
        }
        shareImageDialogFragmentX4.S4(new com.max.hbshare.c.b(str, new o(str3), J6(jsonObject2)));
        try {
            shareImageDialogFragmentX4.show(getChildFragmentManager(), "share_image");
        } catch (Exception e10) {
            com.max.heybox.hblog.g.F(e10);
        }
    }

    private void g7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47272, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        h7(this.f94395m);
    }

    private void g8(List<Bitmap> list, WebProtocolObj webProtocolObj, String str, Bitmap bitmap) {
        if (PatchProxy.proxy(new Object[]{list, webProtocolObj, str, bitmap}, this, changeQuickRedirect, false, 47295, new Class[]{List.class, WebProtocolObj.class, String.class, Bitmap.class}, Void.TYPE).isSupported) {
            return;
        }
        String strValueOf = webProtocolObj.valueOf("share_url");
        String strValueOf2 = webProtocolObj.valueOf("qr_code_img_url");
        RectObj rectObj = (RectObj) webProtocolObj.objectOf("qr_code_img_rect", RectObj.class);
        if (com.max.hbcommon.utils.c.u(strValueOf2) || rectObj == null) {
            j8(webProtocolObj, list, null, str, bitmap);
        } else {
            com.max.hbimage.b.Y(getContext(), strValueOf2, new l(strValueOf, rectObj, webProtocolObj, list, str, bitmap));
        }
    }

    private void h7(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47273, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f94380a0 = false;
        if (this.f94385c4 == null || com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        com.max.hbcommon.utils.d.b(f94368o4, "loadUrl: " + str);
        if (!com.max.hbcommon.utils.c.u(this.R)) {
            HashMap map = new HashMap();
            map.put("Referer", this.R);
            this.f94385c4.loadUrl(str, map);
        } else if (this.f94417z) {
            this.f94385c4.loadUrl(str, com.max.xiaoheihe.utils.l0.p(this.f94395m));
        } else {
            this.f94385c4.loadUrl(str);
        }
    }

    private void h8(List<Bitmap> list, WebProtocolObj webProtocolObj, String str, Bitmap bitmap) {
        if (PatchProxy.proxy(new Object[]{list, webProtocolObj, str, bitmap}, this, changeQuickRedirect, false, 47296, new Class[]{List.class, WebProtocolObj.class, String.class, Bitmap.class}, Void.TYPE).isSupported) {
            return;
        }
        String strValueOf = webProtocolObj.valueOf("share_url");
        String strValueOf2 = webProtocolObj.valueOf("qr_code_img_url");
        RectObj rectObj = (RectObj) webProtocolObj.objectOf("qr_code_img_rect", RectObj.class);
        if (com.max.hbcommon.utils.c.u(strValueOf2) || rectObj == null || this.mContext == null) {
            j8(webProtocolObj, list, null, str, bitmap);
        } else {
            com.max.hbimage.b.Y(getContext(), strValueOf2, new m(this.mContext, strValueOf, webProtocolObj, list, str, bitmap, rectObj));
        }
    }

    static /* synthetic */ void i6(WebviewFragment webviewFragment) {
        if (PatchProxy.proxy(new Object[]{webviewFragment}, null, changeQuickRedirect, true, 47366, new Class[]{WebviewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        webviewFragment.E7();
    }

    private void i7() {
        WebProtocolObj webProtocolObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47259, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        WebSettings settings = this.f94385c4.getSettings();
        if (R3()) {
            this.f94385c4.setmNestedInViewPager(R3());
        }
        WebProtocolObj webProtocolObj2 = this.U;
        if (webProtocolObj2 != null && "openH5PayWindow".equals(webProtocolObj2.getProtocol_type())) {
            String strValueOf = this.U.valueOf(j5.b.f124277b);
            if (!com.max.hbcommon.utils.c.u(strValueOf)) {
                settings.setUserAgentString(strValueOf);
            }
        }
        Bundle arguments = getArguments();
        boolean zX = arguments != null ? com.max.hbcommon.utils.c.x(arguments.getString("reset_ua")) : false;
        if (!zX && (webProtocolObj = this.U) != null) {
            zX = com.max.hbcommon.utils.c.x(webProtocolObj.valueOf("reset_ua"));
        }
        if (zX) {
            settings.setUserAgentString(null);
        }
        if (this.f94417z) {
            com.max.xiaoheihe.utils.l0.d(settings, this.f94395m);
        }
        com.max.xiaoheihe.module.webview.d0.j(this.f94385c4);
        com.max.xiaoheihe.module.webview.d0.l(this.f94385c4, this.W3);
        String str = this.f94395m;
        if (str != null && str.endsWith(".apk")) {
            com.max.xiaoheihe.utils.l0.y0(this.mContext, this.f94395m);
        }
        if (this.f94417z) {
            com.max.xiaoheihe.utils.l0.c(this.mContext, this.f94395m);
        }
        this.f94395m = com.max.xiaoheihe.utils.l0.e(this.f94395m);
        this.mRefreshLayout.S(new i0());
        if (this.S3) {
            this.f94385c4.setBackgroundColor(0);
            if (this.f94385c4.getBackground() != null) {
                this.f94385c4.getBackground().setAlpha(0);
            }
        } else {
            this.f94385c4.setBackgroundColor(this.f94397n);
        }
        if (this.f94400p) {
            this.mRefreshLayout.i0(true);
            this.f94385c4.setNestedScrollingEnabled(false);
        } else {
            this.mRefreshLayout.i0(false);
        }
        this.mRefreshLayout.b0(false);
        this.f94385c4.setScrollChangeListener(new j0(this.K, this.f94385c4));
        this.f94385c4.addJavascriptInterface(new m0(), "local_obj");
        this.f94385c4.setWebChromeClient(new k0());
        WebProtocolObj webProtocolObj3 = this.U;
        this.f94385c4.setWebViewClient(new b(this.f94385c4, this.f94411x, (webProtocolObj3 == null || webProtocolObj3.getWebview() == null || !com.max.hbcommon.utils.c.x(this.U.getWebview().getInject_images())) ? false : true, this.f94390h4));
        if (this.M) {
            this.f94385c4.setOnTouchListener(new c());
        }
    }

    private void j8(WebProtocolObj webProtocolObj, List<Bitmap> list, Bitmap bitmap, String str, Bitmap bitmap2) {
        if (PatchProxy.proxy(new Object[]{webProtocolObj, list, bitmap, str, bitmap2}, this, changeQuickRedirect, false, 47297, new Class[]{WebProtocolObj.class, List.class, Bitmap.class, String.class, Bitmap.class}, Void.TYPE).isSupported) {
            return;
        }
        String strValueOf = webProtocolObj.valueOf("qr_code");
        String strValueOf2 = webProtocolObj.valueOf("image_src");
        String strValueOf3 = webProtocolObj.valueOf("douyin_hashtag");
        String strValueOf4 = webProtocolObj.valueOf("topic_info");
        String strValueOf5 = webProtocolObj.valueOf("douyin_bg_url");
        List<String> listB = com.max.hbutils.utils.k.b(webProtocolObj.valueOf("hashtags"), String.class);
        String strValueOf6 = webProtocolObj.valueOf("default_content");
        boolean zX = com.max.hbcommon.utils.c.x(webProtocolObj.valueOf("only_post"));
        boolean zX2 = com.max.hbcommon.utils.c.x(webProtocolObj.valueOf("save_to_disk"));
        String strI = com.max.xiaoheihe.utils.l0.i(webProtocolObj.valueOf("title"), "utf-8");
        String strI2 = com.max.xiaoheihe.utils.l0.i(webProtocolObj.valueOf("share_url"), "utf-8");
        String strI3 = com.max.xiaoheihe.utils.l0.i(webProtocolObj.valueOf(PictureVideoEditPostFragment.f82341j4), "utf-8");
        HBShareProtocolData hBShareProtocolDataA0 = com.max.xiaoheihe.utils.l0.a0(webProtocolObj);
        if (com.max.hbcommon.utils.c.u(hBShareProtocolDataA0.getSrc())) {
            hBShareProtocolDataA0.setSrc("web");
        }
        BBSTopicObj bBSTopicObj = (BBSTopicObj) com.max.hbutils.utils.k.a(strValueOf4, BBSTopicObj.class);
        ArrayList arrayList = null;
        if (bBSTopicObj != null) {
            arrayList = new ArrayList();
            arrayList.add(bBSTopicObj);
        }
        ArrayList arrayList2 = arrayList;
        if (zX) {
            z7(list, zX2, strValueOf2, arrayList2, listB, null, strI3, str);
        } else {
            f8(list, new ShareImageDialogConfigObj(strI, strI2, strValueOf, strValueOf2, arrayList2, strValueOf3, strValueOf5, bitmap, listB, strValueOf6, bitmap2, null, null, null, strI3), hBShareProtocolDataA0.getSrc(), str, hBShareProtocolDataA0.getReport_extra(), hBShareProtocolDataA0.getAct_id());
        }
    }

    static /* synthetic */ void k5(WebviewFragment webviewFragment, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{webviewFragment, str, str2}, null, changeQuickRedirect, true, 47370, new Class[]{WebviewFragment.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        webviewFragment.z6(str, str2);
    }

    private boolean k7() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47267, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        IpDirectObj ipDirectObj = this.f94411x;
        return (ipDirectObj == null || ipDirectObj.getDomain_ip_list() == null || this.f94411x.getIntercept_request_js_list() == null || com.max.hbcommon.utils.i.d()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void k8(WebProtocolObj webProtocolObj, List<Bitmap> list, String str, Bitmap bitmap) {
        JsonObject jsonObject;
        String str2;
        List<BBSTopicObj> list2;
        String str3;
        String str4;
        List<String> list3;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z10;
        List<BBSTopicObj> topic_infos;
        String string;
        String default_content;
        String tips;
        String string2;
        String strE;
        boolean zEquals;
        List<String> hashtags;
        String douyin_bg_url;
        String douyin_hashtag;
        String str9;
        boolean z11 = false;
        if (PatchProxy.proxy(new Object[]{webProtocolObj, list, str, bitmap}, this, changeQuickRedirect, false, 47298, new Class[]{WebProtocolObj.class, List.class, String.class, Bitmap.class}, Void.TYPE).isSupported) {
            return;
        }
        ScreenShareInfoObj screenShareInfoObj = (ScreenShareInfoObj) webProtocolObj.objectOf("share_info", ScreenShareInfoObj.class);
        ScreenStyleInfoObj screenStyleInfoObj = (ScreenStyleInfoObj) webProtocolObj.objectOf("style_info", ScreenStyleInfoObj.class);
        String str10 = null;
        JsonObject jsonObject2 = null;
        if (screenShareInfoObj != null) {
            PostConfigObj post_config = screenShareInfoObj.getPost_config();
            if (post_config != null) {
                topic_infos = post_config.getTopic_infos();
                zEquals = Boolean.TRUE.equals(post_config.getPost_now());
                JsonObject image_extra = post_config.getImage_extra();
                if (image_extra == null) {
                    image_extra = new JsonObject();
                    Activity activity = this.mContext;
                    if (activity instanceof com.max.hbminiprogram.h) {
                        image_extra.addProperty("mini_program_id", ((com.max.hbminiprogram.h) activity).B());
                    }
                    image_extra.addProperty("web_url", this.f94395m);
                }
                string = image_extra.toString();
                default_content = post_config.getDefault_content();
                hashtags = post_config.getHashtags();
                tips = post_config.getTips();
                if (post_config.getPost_extra_params() != null) {
                    string2 = post_config.getPost_extra_params().toString();
                    strE = com.max.hbutils.utils.k.e(string2, PictureVideoEditPostFragment.f82341j4);
                } else {
                    string2 = null;
                    strE = null;
                }
                if (!com.max.hbcommon.utils.c.u(post_config.getPost_success_js_callback())) {
                    V0(post_config.getPost_success_js_callback());
                }
            } else {
                topic_infos = null;
                string = null;
                default_content = null;
                tips = null;
                string2 = null;
                strE = null;
                zEquals = false;
                hashtags = null;
            }
            DouYinConfig douyin_config = screenShareInfoObj.getDouyin_config();
            if (douyin_config != null) {
                douyin_hashtag = douyin_config.getDouyin_hashtag();
                douyin_bg_url = douyin_config.getDouyin_bg_url();
            } else {
                douyin_bg_url = null;
                douyin_hashtag = null;
            }
            boolean zX = com.max.hbcommon.utils.c.x(screenShareInfoObj.getSave_to_disk());
            ScreenReportObj report = screenShareInfoObj.getReport();
            if (report != null) {
                String src = report.getSrc();
                jsonObject2 = report.getExtra();
                str9 = src;
            } else {
                str9 = null;
            }
            if (jsonObject2 == null) {
                jsonObject2 = new JsonObject();
            }
            jsonObject2.addProperty("mini_program_id", Q3());
            str4 = douyin_bg_url;
            list2 = topic_infos;
            str5 = default_content;
            list3 = hashtags;
            str7 = tips;
            str6 = string2;
            str8 = strE;
            str3 = douyin_hashtag;
            z10 = zX;
            z11 = zEquals;
            str2 = string;
            jsonObject = jsonObject2;
            str10 = str9;
        } else {
            jsonObject = null;
            str2 = null;
            list2 = null;
            str3 = null;
            str4 = null;
            list3 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            str8 = null;
            z10 = false;
        }
        if (z11) {
            z7(list, z10, str2, list2, list3, str6, str8, str);
        } else {
            f8(list, new ShareImageDialogConfigObj(this.W, null, null, str2, list2, str3, str4, null, list3, str5, bitmap, screenStyleInfoObj, str6, str7, str8), !com.max.hbcommon.utils.c.u(str10) ? str10 : "web", str, jsonObject, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ n3 l7(View view, n3 n3Var) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, n3Var}, this, changeQuickRedirect, false, 47356, new Class[]{View.class, n3.class}, n3.class);
        if (patchProxyResultProxy.isSupported) {
            return (n3) patchProxyResultProxy.result;
        }
        int iMax = Math.max(0, n3Var.f(n3.m.d()).f20745d - (this.mContext instanceof ChannelsDetailActivity ? 0 : com.max.hbutils.utils.t.f73585f));
        int i10 = this.f94387e4;
        if (i10 > 0) {
            int i11 = i10 - iMax;
            NestedWebView nestedWebView = this.f94385c4;
            if (i11 <= 0) {
                i11 = -1;
            }
            nestedWebView.setLayoutParams(new SmartRefreshLayout.LayoutParams(-1, i11));
        } else {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), iMax);
        }
        return n3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ n3 m7(View view, n3 n3Var) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, n3Var}, null, changeQuickRedirect, true, 47363, new Class[]{View.class, n3.class}, n3.class);
        if (patchProxyResultProxy.isSupported) {
            return (n3) patchProxyResultProxy.result;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), n3Var.f(n3.m.i()).f20745d);
        return n3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n7(MiniProgramMenuInfoObj miniProgramMenuInfoObj) {
        if (PatchProxy.proxy(new Object[]{miniProgramMenuInfoObj}, this, changeQuickRedirect, false, 47362, new Class[]{MiniProgramMenuInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        MiniProgramNativeAndWebDelegate.b(this.mContext, this.f94395m, this.U, Q3(), miniProgramMenuInfoObj, this.f94398n4);
        com.max.hbminiprogram.utils.b.g(lb.d.f131147d5, Q3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o7(String str, JsonObject jsonObject) {
        if (PatchProxy.proxy(new Object[]{str, jsonObject}, null, changeQuickRedirect, true, 47359, new Class[]{String.class, JsonObject.class}, Void.TYPE).isSupported || str == null) {
            return;
        }
        jsonObject.add("data", (JsonElement) com.max.hbutils.utils.k.a(str, JsonObject.class));
    }

    static /* synthetic */ void p6(WebviewFragment webviewFragment) {
        if (PatchProxy.proxy(new Object[]{webviewFragment}, null, changeQuickRedirect, true, 47382, new Class[]{WebviewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        webviewFragment.T6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p7(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47358, new Class[]{String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        H6(str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q7(String str, JsonObject jsonObject) {
        String strG;
        if (PatchProxy.proxy(new Object[]{str, jsonObject}, null, changeQuickRedirect, true, 47361, new Class[]{String.class, JsonObject.class}, Void.TYPE).isSupported || (strG = com.max.xiaoheihe.accelworld.j.g(str)) == null) {
            return;
        }
        jsonObject.addProperty("data", strG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r7(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47360, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        y7(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s7(String str, String str2, String str3, String str4, String str5) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, this, changeQuickRedirect, false, 47357, new Class[]{String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("chromium", "imageBase64==" + str5);
        if (com.max.hbcommon.utils.c.u(str5) || !str5.contains("data:image")) {
            return;
        }
        byte[] bArrDecode = Base64.decode(str5.replaceAll("\"", "").split(Constants.ACCEPT_TIME_SEPARATOR_SP)[1], 0);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        BBSTopicObj bBSTopicObj = !com.max.hbcommon.utils.c.u(str) ? (BBSTopicObj) com.max.hbutils.utils.k.a(str, BBSTopicObj.class) : null;
        ShareImageDialogFragment shareImageDialogFragmentX4 = ShareImageDialogFragment.x4();
        shareImageDialogFragmentX4.A4(bitmapDecodeByteArray);
        shareImageDialogFragmentX4.J4(str2);
        shareImageDialogFragmentX4.V4(!"0".equals(str3));
        shareImageDialogFragmentX4.Y4(bBSTopicObj);
        shareImageDialogFragmentX4.S4(new com.max.hbshare.c.b("web", new r(str4), J6(null)));
        shareImageDialogFragmentX4.show(getChildFragmentManager(), "share_image");
    }

    public static WebviewFragment u7(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 47242, new Class[]{String.class}, WebviewFragment.class);
        return patchProxyResultProxy.isSupported ? (WebviewFragment) patchProxyResultProxy.result : new com.max.xiaoheihe.module.webview.u(str).a();
    }

    private void v7(final String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47301, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        String strH = com.max.xiaoheihe.accelworld.j.h(str);
        final String strG = com.max.xiaoheihe.accelworld.j.g(str);
        com.max.xiaoheihe.accelworld.j.b(strH, this, new com.max.xiaoheihe.module.webview.t.b() { // from class: com.max.xiaoheihe.module.webview.f0
            @Override // com.max.xiaoheihe.module.webview.t.b
            public final void a(JsonObject jsonObject) {
                WebviewFragment.o7(strG, jsonObject);
            }
        }, new com.max.xiaoheihe.module.webview.t.a() { // from class: com.max.xiaoheihe.module.webview.g0
            @Override // com.max.xiaoheihe.module.webview.t.a
            public final void a() {
                this.f94695a.p7(str);
            }
        }, null);
    }

    static /* synthetic */ Bitmap w5(WebviewFragment webviewFragment, int i10, List list, Bitmap bitmap, int i11, int i12) {
        Object[] objArr = {webviewFragment, new Integer(i10), list, bitmap, new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 47371, new Class[]{WebviewFragment.class, cls, List.class, Bitmap.class, cls, cls}, Bitmap.class);
        return patchProxyResultProxy.isSupported ? (Bitmap) patchProxyResultProxy.result : webviewFragment.D6(i10, list, bitmap, i11, i12);
    }

    static /* synthetic */ void x5(WebviewFragment webviewFragment, List list, WebProtocolObj webProtocolObj, Bitmap bitmap, boolean z10) {
        if (PatchProxy.proxy(new Object[]{webviewFragment, list, webProtocolObj, bitmap, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 47372, new Class[]{WebviewFragment.class, List.class, WebProtocolObj.class, Bitmap.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        webviewFragment.Y6(list, webProtocolObj, bitmap, z10);
    }

    private void x6(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 47246, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (z10) {
            this.vg_loading.setVisibility(0);
            this.img_progress.p();
        } else {
            this.vg_loading.setVisibility(8);
            this.img_progress.j();
        }
    }

    private void x7(final String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47288, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbutils.utils.c.f(getString(R.string.fail));
        com.max.xiaoheihe.accelworld.j.b(str, this, new com.max.xiaoheihe.module.webview.t.b() { // from class: com.max.xiaoheihe.module.webview.i0
            @Override // com.max.xiaoheihe.module.webview.t.b
            public final void a(JsonObject jsonObject) {
                WebviewFragment.q7(str, jsonObject);
            }
        }, new com.max.xiaoheihe.module.webview.t.a() { // from class: com.max.xiaoheihe.module.webview.j0
            @Override // com.max.xiaoheihe.module.webview.t.a
            public final void a() {
                this.f94721a.r7(str);
            }
        }, null);
    }

    private void y7(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47289, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        c7();
        v7(str);
    }

    private void z6(String str, String str2) {
        if (!PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 47347, new Class[]{String.class, String.class}, Void.TYPE).isSupported && this.K3) {
            try {
                Uri uri = Uri.parse(str2);
                String host = uri.getHost();
                if (com.max.hbcommon.network.b.d().equals(host)) {
                    return;
                }
                HashMap map = new HashMap();
                map.put("host", uri.getHost());
                String path = uri.getPath();
                if (path != null && path.contains(com.max.xiaoheihe.module.webview.interceptrequest.d.f94714g)) {
                    path = path.substring(0, path.indexOf(com.max.xiaoheihe.module.webview.interceptrequest.d.f94714g));
                }
                map.put(FlutterActivityLaunchConfigs.EXTRA_PATH, path);
                map.put("state", str);
                com.max.xiaoheihe.network.i.a().x8("408", map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new com.max.hbcommon.network.p());
                this.L3 = true;
                com.max.hbcommon.utils.d.b("checkReportResult", "host " + host + "  path ==" + path + "   state==" + str);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private void z7(List<Bitmap> list, boolean z10, String str, List<BBSTopicObj> list2, List<String> list3, String str2, String str3, String str4) {
        if (PatchProxy.proxy(new Object[]{list, new Byte(z10 ? (byte) 1 : (byte) 0), str, list2, list3, str2, str3, str4}, this, changeQuickRedirect, false, 47299, new Class[]{List.class, Boolean.TYPE, String.class, List.class, List.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        PermissionManager.f71603a.T(getActivity(), new n(list, z10, str, list2, list3, str2, str3, str4));
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public void A1(WebProtocolObj webProtocolObj, Throwable th2) {
        if (PatchProxy.proxy(new Object[]{webProtocolObj, th2}, this, changeQuickRedirect, false, 47308, new Class[]{WebProtocolObj.class, Throwable.class}, Void.TYPE).isSupported || !isActive() || this.mContext == null) {
            return;
        }
        if (com.max.hbcommon.utils.c.x(webProtocolObj.valueOf("show_toast")) && th2 != null && !com.max.hbcommon.utils.c.u(th2.getMessage())) {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(th2.getMessage());
        }
        if (com.max.hbcommon.utils.c.u(webProtocolObj.valueOf(z5.f.f141859j))) {
            return;
        }
        com.max.xiaoheihe.base.router.b.l0(this.mContext, webProtocolObj.valueOf(z5.f.f141859j), this.f94385c4, null, this.B);
    }

    public void A7(WebProtocolObj webProtocolObj) {
        WebviewBottomEditorDelegate webviewBottomEditorDelegate;
        if (PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 47331, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported || (webviewBottomEditorDelegate = this.f94393k4) == null) {
            return;
        }
        webviewBottomEditorDelegate.m(webProtocolObj);
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public void B0(boolean z10) {
        this.O3 = z10;
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public void C1(WebProtocolObj webProtocolObj) {
        if (PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 47349, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported) {
            return;
        }
        String strValueOf = webProtocolObj.valueOf(FlutterActivityLaunchConfigs.EXTRA_PATH);
        JsonObject jsonObject = (JsonObject) webProtocolObj.objectOf("addition", JsonObject.class);
        this.f94384c0 = webProtocolObj.valueOf(L4);
        if (!com.max.hbcommon.utils.c.u(webProtocolObj.valueOf("report_imt"))) {
            this.f94401p1 = webProtocolObj.valueOf("report_imt");
        }
        if (Y2() || n0()) {
            this.reporter.m(new PageEventConfig(Boolean.valueOf(true ^ m2()), Boolean.valueOf(Y2()), Boolean.valueOf(n0())));
        } else {
            this.reporter.m(null);
        }
        if (!com.max.hbcommon.utils.c.u(strValueOf)) {
            this.U3 = strValueOf;
        }
        if (jsonObject != null) {
            this.V3 = jsonObject;
        }
    }

    public void C6() {
        NestedWebView nestedWebView;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47266, new Class[0], Void.TYPE).isSupported || !this.L || (nestedWebView = this.f94385c4) == null) {
            return;
        }
        this.L = false;
        com.max.xiaoheihe.utils.z.b(nestedWebView, com.max.xiaoheihe.utils.z.f95790b);
    }

    public void C7(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 47264, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        B7(new ProxyAddressObj(str, str2));
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public /* synthetic */ void D1(boolean z10) {
        com.max.xiaoheihe.module.webview.s.t(this, z10);
    }

    @Override // com.max.xiaoheihe.view.callback.a
    public void D3() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47319, new Class[0], Void.TYPE).isSupported && isActive()) {
            this.mRefreshLayout.F();
        }
    }

    public void D7() {
        this.K3 = true;
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public void E0(WebProtocolObj webProtocolObj) {
        if (!PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 47302, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported && this.E) {
            this.f94385c4.postDelayed(new p(), 500L);
        }
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public void E1(String str) {
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public void F3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47354, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        H6(com.max.xiaoheihe.module.webview.a0.c().d(), null);
        HashMap map = new HashMap();
        map.put(com.max.xiaoheihe.module.webview.c0.f94586h, new c0());
        map.put(com.max.xiaoheihe.module.webview.c0.f94587i, new d0());
        this.f94388f4 = new com.max.xiaoheihe.module.webview.c0(this, map);
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public void G3(WebProtocolObj webProtocolObj) {
        String strM;
        if (PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 47303, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported || this.f94385c4 == null || (strM = HeyboxWebProtocolHandler.m(webProtocolObj.valueOf("jsfunc"), null)) == null) {
            return;
        }
        this.f94385c4.evaluateJavascript(strM, null);
    }

    public void G6() {
        LoadingDialog loadingDialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47312, new Class[0], Void.TYPE).isSupported || (loadingDialog = this.J) == null) {
            return;
        }
        loadingDialog.c();
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @androidx.annotation.p0
    public String H() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47339, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : M6();
    }

    public void H6(String str, ValueCallback<String> valueCallback) {
        if (PatchProxy.proxy(new Object[]{str, valueCallback}, this, changeQuickRedirect, false, 47277, new Class[]{String.class, ValueCallback.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.W("evaluateJavascript: " + str);
        NestedWebView nestedWebView = this.f94385c4;
        if (nestedWebView != null) {
            nestedWebView.post(new e(str, valueCallback));
        }
    }

    public void H7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47271, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (Bitmap bitmap : this.C) {
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        System.gc();
    }

    public boolean I6(String str, String str2, com.max.xiaoheihe.utils.l0.i iVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, iVar}, this, changeQuickRedirect, false, 47304, new Class[]{String.class, String.class, com.max.xiaoheihe.utils.l0.i.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        com.max.xiaoheihe.module.webview.c0 c0Var = this.f94388f4;
        if (c0Var == null) {
            return false;
        }
        String strA = com.max.xiaoheihe.module.webview.c0.a(c0Var.c(str, str2, iVar));
        if (!com.max.hbcommon.utils.c.u(strA)) {
            H6(strA, null);
        }
        return true;
    }

    public void J7(WebProtocolObj webProtocolObj) {
        WebviewBottomEditorDelegate webviewBottomEditorDelegate;
        if (PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 47330, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported || (webviewBottomEditorDelegate = this.f94393k4) == null) {
            return;
        }
        webviewBottomEditorDelegate.n(webProtocolObj);
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public void K2(WebProtocolObj webProtocolObj) {
        if (PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 47283, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported || webProtocolObj == null) {
            return;
        }
        boolean zX = com.max.hbcommon.utils.c.x(webProtocolObj.valueOf("custom"));
        ScreenImageInfo screenImageInfo = (ScreenImageInfo) com.max.hbutils.utils.k.a(webProtocolObj.valueOf("img_info"), ScreenImageInfo.class);
        if (!zX || screenImageInfo == null || com.max.hbcommon.utils.c.w(screenImageInfo.getRects())) {
            Bitmap bitmapU = ViewUtils.U(this.f94385c4);
            ArrayList arrayList = new ArrayList();
            arrayList.add(bitmapU);
            Y6(arrayList, webProtocolObj, null, true);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        try {
            if (!com.max.hbcommon.utils.c.w(screenImageInfo.getSingle_image_rects())) {
                Iterator<Integer> it = screenImageInfo.getSingle_image_rects().iterator();
                while (it.hasNext()) {
                    arrayList2.addAll(screenImageInfo.getRects().get(it.next().intValue()));
                }
            }
        } catch (Throwable th2) {
            com.max.heybox.hblog.g.G("DoShareImageActionV2 getSingle_image_rects " + th2.getMessage());
        }
        int iQ = com.max.hbutils.utils.n.q(screenImageInfo.getDelay());
        if (screenImageInfo.getRects().size() <= 1 || com.max.hbcommon.utils.c.w(arrayList2)) {
            P6(webProtocolObj, screenImageInfo.getRects(), null, screenImageInfo.getTarget_size(), iQ);
        } else {
            P6(webProtocolObj, screenImageInfo.getRects(), arrayList2, screenImageInfo.getTarget_size(), iQ);
        }
    }

    public void K6(WebView webView, int i10, int i11, int i12, l0 l0Var) {
        Object[] objArr = {webView, new Integer(i10), new Integer(i11), new Integer(i12), l0Var};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 47316, new Class[]{WebView.class, cls, cls, cls, l0.class}, Void.TYPE).isSupported) {
            return;
        }
        Q6(webView, webView.getScrollX(), 0, i10, new u(i10, i12, webView, i11 - i12, l0Var), false);
    }

    public void L7(int i10) {
        String str;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 47278, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || !isActive() || this.f94385c4 == null || this.mContext == null) {
            return;
        }
        if (i10 == 0) {
            str = "pageVisibleFromBackend";
        } else if (i10 == 1) {
            str = "pageVisibleFromOthersPage";
        } else if (i10 != 2) {
            str = i10 != 3 ? "" : "pageHiddenToOthersPage";
        } else {
            str = "pageHiddenToBackend";
        }
        com.max.xiaoheihe.module.webview.c0 c0Var = this.f94388f4;
        if (c0Var != null) {
            String strA = com.max.xiaoheihe.module.webview.c0.a(c0Var.b(str, null));
            if (com.max.hbcommon.utils.c.u(strA)) {
                return;
            }
            H6(strA, null);
            return;
        }
        String str2 = "javascript:" + str + "()";
        com.max.hbcommon.utils.d.b("sendAppResumeStopState", "injectedBridgeJS: " + str2);
        this.mContext.runOnUiThread(new f(str2));
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public String M0(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47279, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (t0.f(str)) {
            com.max.xiaoheihe.utils.l0.c(this.mContext, str);
        }
        return str;
    }

    public void M7(String str) {
        this.J3 = str;
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public void N0(ArrayList<String> arrayList) {
    }

    public String N6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47338, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.u(this.U3)) {
            return com.max.hbcommon.utils.c.u(this.f94395m) ? "unknown" : Uri.parse(this.f94395m).getPath();
        }
        return this.U3;
    }

    public void N7(com.max.xiaoheihe.module.littleprogram.fragment.webwithnative.a aVar) {
        this.f94396m4 = aVar;
    }

    public float O6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47268, new Class[0], Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        NestedWebView nestedWebView = this.f94385c4;
        if (nestedWebView == null) {
            return 0.0f;
        }
        return (nestedWebView.getScrollY() * 1.0f) / (((int) ((this.f94385c4.getContentHeight() * this.f94385c4.getScale()) + 0.5f)) - this.f94385c4.getHeight());
    }

    public void O7(String str) {
        this.f94409v = str;
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public void P0(ArrayList<String> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 47280, new Class[]{ArrayList.class}, Void.TYPE).isSupported || arrayList == null || arrayList.size() < 4) {
            return;
        }
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            String strI = com.max.xiaoheihe.utils.l0.i(arrayList.get(i10), "utf-8");
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
            } else if (i10 == 5) {
                this.D = strI;
            }
        }
        HBShareProtocolData hBShareProtocolData = new HBShareProtocolData(str, str2, str3, str4, null, this.D, "web", str5, null);
        if (com.max.xiaoheihe.utils.l0.l(this.mContext, hBShareProtocolData, new com.max.hbshare.c.b("web", this.f94398n4, J6(null)))) {
            return;
        }
        hBShareProtocolData.setSrc("web");
        i8(hBShareProtocolData);
    }

    public void P7(boolean z10) {
        this.M = z10;
    }

    public void Q6(WebView webView, int i10, int i11, int i12, l0 l0Var, boolean z10) {
        Object[] objArr = {webView, new Integer(i10), new Integer(i11), new Integer(i12), l0Var, new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 47317, new Class[]{WebView.class, cls, cls, cls, l0.class, Boolean.TYPE}, Void.TYPE).isSupported || webView == null) {
            return;
        }
        int scrollY = webView.getScrollY();
        int scrollX = webView.getScrollX();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(100, 0);
        valueAnimatorOfInt.setDuration((i10 == scrollX && i11 == scrollY) ? 10L : 100L);
        valueAnimatorOfInt.addUpdateListener(new w(webView, scrollX, i10, scrollY, i11, i12, l0Var, z10));
        valueAnimatorOfInt.start();
    }

    public void Q7(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 47334, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        p4(z10);
        NestedWebView nestedWebView = this.f94385c4;
        if (nestedWebView != null) {
            nestedWebView.setmNestedInViewPager(z10);
        }
    }

    public void R7(int i10) {
        this.I = i10;
    }

    public void S7(int i10) {
        this.G = i10;
    }

    public void T7(int i10) {
        this.F = i10;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.max.xiaoheihe.module.webview.t
    public void U(boolean z10, boolean z11) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 47310, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.Q3 = z10;
        this.R3 = z11;
        o0 o0Var = this.K;
        if (o0Var != null) {
            o0Var.j(!z11);
        }
        androidx.activity.o oVar = this.f94394l4;
        if (oVar != null) {
            oVar.setEnabled(z10);
        }
    }

    public WebView U6() {
        return this.f94385c4;
    }

    public void U7(int i10) {
        this.H = i10;
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public void V0(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47355, new Class[]{String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        this.Z3 = str;
        if (this.N3 == null) {
            OnPostSuccessReceiver onPostSuccessReceiver = new OnPostSuccessReceiver();
            this.N3 = onPostSuccessReceiver;
            registerReceiver(onPostSuccessReceiver, lb.a.f130972h0);
        }
    }

    public void V6(WebView webView, int i10, int i11, l0 l0Var) {
        Object[] objArr = {webView, new Integer(i10), new Integer(i11), l0Var};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 47314, new Class[]{WebView.class, cls, cls, l0.class}, Void.TYPE).isSupported || webView == null) {
            return;
        }
        int scrollX = webView.getScrollX();
        int scrollY = webView.getScrollY();
        webView.scrollTo(0, 0);
        int height = webView.getHeight();
        int width = webView.getWidth();
        if (height >= i11 && width >= i10) {
            l0Var.a(R6(webView));
            webView.scrollTo(scrollY, scrollX);
            E6(webView);
        } else {
            if (width < i10) {
                this.f94413x2 = null;
                K6(webView, i11, i10, width, new t(webView, scrollY, scrollX, l0Var));
                return;
            }
            Q6(webView, 0, 0, i11, l0Var, true);
        }
    }

    public void V7(boolean z10) {
        this.E = z10;
    }

    public o0 W6() {
        return this.K;
    }

    public void W7(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47251, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        TitleBar titleBar = this.mTitleBar;
        if (titleBar != null && titleBar.getVisibility() == 0) {
            this.mTitleBar.setTitle(str);
        }
        TitleBar titleBar2 = this.tb_web;
        if (titleBar2 == null || titleBar2.getVisibility() != 0) {
            return;
        }
        this.tb_web.setTitle(str);
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public Bitmap X3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47352, new Class[0], Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        return ViewUtils.U(this.S3 ? this.rootView : this.f94385c4);
    }

    public void X6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47269, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.webview.c0 c0Var = this.f94388f4;
        if (c0Var == null) {
            t7("javascript:if(loadingFinished().value){setTimeout(function(){window.local_obj.onGetScreenshotCompleted(JSON.stringify(getScreenshotRect()))},100)}");
            return;
        }
        String strA = com.max.xiaoheihe.module.webview.c0.a(c0Var.b(com.max.xiaoheihe.module.webview.c0.f94586h, com.max.xiaoheihe.module.webview.c0.f94586h));
        if (com.max.hbcommon.utils.c.u(strA)) {
            return;
        }
        H6(strA, null);
    }

    public void X7(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 47252, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TitleBar titleBar = this.mTitleBar.getVisibility() == 0 ? this.mTitleBar : this.tb_web;
        TextView appbarTitleTextView = titleBar.getAppbarTitleTextView();
        ImageView appbarNavButtonView = titleBar.getAppbarNavButtonView();
        ImageView appbarActionButtonView = titleBar.getAppbarActionButtonView();
        TextView appbarActionTextView = titleBar.getAppbarActionTextView();
        int color = this.mContext.getResources().getColor(z10 ? R.color.text_primary_1_color : R.color.white);
        if (appbarTitleTextView != null) {
            appbarTitleTextView.setTextColor(color);
        }
        if (appbarNavButtonView != null) {
            appbarNavButtonView.setColorFilter(color);
        }
        if (appbarActionButtonView != null) {
            appbarActionButtonView.setColorFilter(color);
        }
        if (appbarActionTextView != null) {
            appbarActionTextView.setTextColor(color);
        }
        this.X = z10;
    }

    @Override // com.max.hbcommon.analytics.h
    public boolean Y2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47344, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (F6()) {
            return "1".equals(this.f94412x1);
        }
        return true;
    }

    public void Y7(o0 o0Var) {
        this.K = o0Var;
    }

    public boolean Z6(WebProtocolObj webProtocolObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 47332, new Class[]{WebProtocolObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (webProtocolObj == null) {
            return false;
        }
        if (com.max.xiaoheihe.module.webview.t.f94778v1.equals(webProtocolObj.getProtocol_type())) {
            w6();
            return true;
        }
        if (com.max.xiaoheihe.module.webview.t.f94775s1.equals(webProtocolObj.getProtocol_type())) {
            c8(webProtocolObj);
            return true;
        }
        if (com.max.xiaoheihe.module.webview.t.f94776t1.equals(webProtocolObj.getProtocol_type())) {
            J7(webProtocolObj);
            return true;
        }
        if (!com.max.xiaoheihe.module.webview.t.f94777u1.equals(webProtocolObj.getProtocol_type())) {
            return false;
        }
        A7(webProtocolObj);
        return true;
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void a4(View view, boolean z10) {
        WebProtocolObj webProtocolObj;
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 47243, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.a4(view, z10);
        setContentView(R.layout.fragment_webview);
        this.f94392j4 = (com.max.xiaoheihe.module.webview.component.b) new y0(this).a(com.max.xiaoheihe.module.webview.component.b.class);
        this.B = this;
        this.mUnBinder = ButterKnife.f(this, view);
        if (getArguments() != null) {
            this.f94395m = getArguments().getString("url", "");
            this.f94397n = getArguments().getInt(f94370q4, -1);
            this.f94399o = getArguments().getString(f94371r4, W4);
            this.f94400p = getArguments().getBoolean(f94372s4, false);
            this.f94404q = getArguments().getBoolean(f94374u4, false);
            this.f94405r = getArguments().getString("message");
            this.f94406s = (MallOrderNotifyObj) getArguments().getSerializable(f94376w4);
            this.f94407t = getArguments().getString(f94377x4);
            this.f94408u = getArguments().getString(f94378y4);
            if (!com.max.hbcommon.utils.c.u(getArguments().getString(f94379z4))) {
                this.f94409v = getArguments().getString(f94379z4);
            }
            this.f94410w = (ProxyAddressObj) getArguments().getSerializable(A4);
            this.O = (SteamPrivacyJsObj) getArguments().getSerializable("steam_privacy_js");
            this.P = (BindAccountGameInfo) getArguments().getSerializable("destiny2_bind_params");
            this.T = getArguments().getBoolean(B4);
            if (getArguments().getSerializable("web_protocol") != null) {
                this.U = (WebProtocolObj) getArguments().getSerializable("web_protocol");
            }
            this.W = getArguments().getString("title");
            this.f94390h4 = getArguments().getString(F4);
            this.V = getArguments().getBoolean(D4);
            this.f94386d4 = getArguments().getBoolean(G4);
            this.f94387e4 = getArguments().getInt(H4);
            this.f94411x = (IpDirectObj) getArguments().getSerializable(I4);
            this.K3 = getArguments().getBoolean(N4);
            this.S3 = getArguments().getBoolean(P4);
            this.W3 = com.max.hbcommon.utils.c.x(getArguments().getString(Q4, "0"));
            this.X3 = (BgConfigObj) getArguments().getSerializable(R4);
            this.Y3 = getArguments().getBoolean(S4);
            this.f94381a4 = getArguments().getBoolean(T4);
        }
        if (this.f94381a4) {
            this.S3 = true;
            this.f94399o = null;
        }
        if (!com.max.hbcommon.utils.c.u(this.f94390h4)) {
            this.f94391i4 = JDCache.INSTANCE.getLoader(this.f94390h4);
        }
        if (this.f94406s == null && (webProtocolObj = this.U) != null) {
            this.f94406s = (MallOrderNotifyObj) webProtocolObj.objectOf("msg", MallOrderNotifyObj.class);
        }
        MallCartUtils mallCartUtils = MallCartUtils.f90196a;
        mallCartUtils.s(this.mMessageView, this.f94406s);
        if (this.f94406s == null) {
            mallCartUtils.t(this.mMessageView, this.f94405r);
        }
        if (this.Y3) {
            this.mRefreshLayout.setVisibility(8);
            LinkWebView linkWebView = new LinkWebView(this.mContext);
            this.f94385c4 = linkWebView;
            linkWebView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            ((ViewGroup) findViewById(R.id.vg_wrap_webview_container)).addView(this.f94385c4);
            ViewUtils.m0(this.f94385c4);
        } else if (this.f94386d4) {
            this.f94385c4 = new NestedWebView(this.mContext);
            this.mRefreshLayout.removeAllViews();
            ConsecutiveScrollerLayout consecutiveScrollerLayout = new ConsecutiveScrollerLayout(this.mContext);
            consecutiveScrollerLayout.setOverScrollMode(2);
            this.f94385c4.setLayoutParams(new ConsecutiveScrollerLayout.LayoutParams(-1, -1));
            this.mRefreshLayout.addView(consecutiveScrollerLayout, new SmartRefreshLayout.LayoutParams(-1, -1));
            consecutiveScrollerLayout.addView(this.f94385c4);
        } else {
            this.f94385c4 = new NestedWebView(this.mContext);
            this.mRefreshLayout.removeAllViews();
            NestedWebView nestedWebView = this.f94385c4;
            int i10 = this.f94387e4;
            if (i10 <= 0) {
                i10 = -1;
            }
            nestedWebView.setLayoutParams(new SmartRefreshLayout.LayoutParams(-1, i10));
            this.mRefreshLayout.addView(this.f94385c4);
        }
        if (this.S3) {
            this.mRefreshLayout.setBackgroundColor(0);
            this.vg_webview_container.setBackgroundColor(0);
            this.f94385c4.setBackgroundColor(0);
            if (this.f94385c4.getBackground() != null) {
                this.f94385c4.getBackground().setAlpha(0);
            }
            if (this.X3 != null) {
                this.vg_bg.setVisibility(0);
                this.vg_bg.setBackgroundColor(com.max.xiaoheihe.utils.d.e1(this.X3.getBg_color()));
                int iJ = ViewUtils.J(this.mContext);
                this.vg_bg.getLayoutParams().width = iJ;
                this.vg_bg.getLayoutParams().height = iJ;
                com.max.xiaoheihe.utils.d.f1(this.mContext, this.X3, this.v_bg);
                com.max.xiaoheihe.module.littleprogram.fragment.dota2.c.f(this.mContext, this.vg_bg);
            } else {
                this.vg_bg.setVisibility(8);
            }
        }
        if (t0.f(this.f94395m)) {
            this.f94417z = true;
        }
        com.max.hbcommon.utils.d.b(f94368o4, "System.setProperty" + System.getProperties().toString());
        if (this.T) {
            f7();
            this.f94400p = false;
        }
        WebProtocolObj webProtocolObj2 = this.U;
        if (webProtocolObj2 != null && !com.max.hbcommon.utils.c.u(webProtocolObj2.valueOf(MeHomeActivity.O))) {
            this.R = this.U.valueOf(MeHomeActivity.O);
        }
        E7();
        if (!P3()) {
            e7();
        } else if (this.mIsFirst && a8()) {
            x6(true);
        }
        WebProtocolObj webProtocolObj3 = this.U;
        if (webProtocolObj3 != null) {
            this.f94384c0 = webProtocolObj3.valueOf(L4);
            this.f94401p1 = this.U.valueOf("report_imt");
            this.f94412x1 = this.U.valueOf(M4);
        } else if (getArguments() != null) {
            this.f94384c0 = getArguments().getString(L4, "0");
            this.f94412x1 = getArguments().getString(M4, "0");
        }
        if (this.mContentView != null && d4()) {
            j1.a2(this.mContentView, new z0() { // from class: com.max.xiaoheihe.module.webview.l0
                @Override // androidx.core.view.z0
                public final n3 a(View view2, n3 n3Var) {
                    return WebviewFragment.m7(view2, n3Var);
                }
            });
        }
        this.f94393k4 = new WebviewBottomEditorDelegate(this.mContext, this.f94392j4, this, this.vg_bottom_bar_root);
        new Handler().postDelayed(new a(new WeakReference(this.mContext), new WeakReference(this)), 100L);
    }

    public void c7() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47291, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LoadingDialog loadingDialog = this.J;
        if (loadingDialog != null && loadingDialog.i()) {
            this.J.c();
        }
        new Handler().postDelayed(new k(), 100L);
    }

    public void c8(WebProtocolObj webProtocolObj) {
        WebviewBottomEditorDelegate webviewBottomEditorDelegate;
        if (PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 47329, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported || (webviewBottomEditorDelegate = this.f94393k4) == null) {
            return;
        }
        webviewBottomEditorDelegate.r(webProtocolObj);
    }

    public void d7(Map<String, Object> map, String str) {
        if (PatchProxy.proxy(new Object[]{map, str}, this, changeQuickRedirect, false, 47256, new Class[]{Map.class, String.class}, Void.TYPE).isSupported || str == null) {
            return;
        }
        this.f94395m = str;
        if (map != null && map.size() > 0) {
            if (map.get(I4) instanceof IpDirectObj) {
                this.f94411x = (IpDirectObj) map.get(I4);
            }
            if (map.get(A4) instanceof ProxyAddressObj) {
                this.f94410w = (ProxyAddressObj) map.get(A4);
            }
        }
        e7();
    }

    public void d8() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47290, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        b8();
        LoadingDialog loadingDialog = this.J;
        if (loadingDialog == null || !loadingDialog.i()) {
            this.J = new LoadingDialog(this.mContext, getString(R.string.screenshotting), true).r();
        }
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public void e0(boolean z10) {
        this.P3 = z10;
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public void e3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47309, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        NestedWebView nestedWebView = this.f94385c4;
        if (nestedWebView != null) {
            nestedWebView.post(new s());
        }
        com.max.xiaoheihe.module.littleprogram.fragment.webwithnative.a aVar = this.f94396m4;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public boolean e4() {
        return this.X;
    }

    @Override // com.max.hbexpression.q.b
    public void expressionDeleteClick(View view) {
        WebviewBottomEditorDelegate webviewBottomEditorDelegate;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 47321, new Class[]{View.class}, Void.TYPE).isSupported || (webviewBottomEditorDelegate = this.f94393k4) == null) {
            return;
        }
        webviewBottomEditorDelegate.expressionDeleteClick(view);
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public void f0(WebProtocolObj webProtocolObj) {
        if (PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 47282, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported) {
            return;
        }
        String strValueOf = webProtocolObj.valueOf("rects");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            try {
                List<RectObj> listB = com.max.hbutils.utils.k.b(strValueOf, RectObj.class);
                if (!com.max.hbcommon.utils.c.w(listB)) {
                    listB.get(0).getHeight();
                    arrayList.add(listB);
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            List<List<RectObj>> list = (List) new Gson().fromJson(strValueOf, new g().getType());
            if (!com.max.hbcommon.utils.c.w(list)) {
                for (List<RectObj> list2 : list) {
                    if (!com.max.hbcommon.utils.c.w(list2)) {
                        arrayList.add(list2);
                    }
                }
            }
            List listB2 = com.max.hbutils.utils.k.b(webProtocolObj.valueOf("single_image_rects"), RectObj.class);
            if (!com.max.hbcommon.utils.c.w(listB2)) {
                arrayList2.addAll(listB2);
            }
        }
        int iQ = com.max.hbutils.utils.n.q(webProtocolObj.valueOf("delay"));
        RectObj rectObj = (RectObj) webProtocolObj.objectOf("target_size", RectObj.class);
        if (arrayList.size() <= 1 || com.max.hbcommon.utils.c.w(arrayList2)) {
            Z7(webProtocolObj, arrayList, null, rectObj, iQ);
        } else {
            Z7(webProtocolObj, arrayList, arrayList2, rectObj, iQ);
        }
    }

    public void f7() {
        int color;
        TitleBar titleBar;
        TextView appbarTitleTextView;
        ImageView appbarNavButtonView;
        ImageView appbarActionButtonView;
        TextView appbarActionTextView;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47250, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        WebProtocolObj webProtocolObj = this.U;
        if (webProtocolObj != null) {
            this.f94399o = null;
            boolean z10 = webProtocolObj.isFull_screen() || this.V;
            if (z10) {
                this.vg_title_root.setVisibility(0);
                this.vg_title_root.setPadding(0, com.max.hbutils.utils.t.p(this.mContext), 0, 0);
            } else {
                this.vg_title_root.setVisibility(8);
            }
            StatusBarCfgObj status_bar = this.U.getStatus_bar();
            if (status_bar == null || !AccelWorldLottieKt.f76443a.equalsIgnoreCase(status_bar.getStyle())) {
                this.X = true;
                color = this.mContext.getResources().getColor(R.color.text_primary_1_color);
                com.max.hbutils.utils.t.M(this.mContext, true);
            } else {
                this.X = false;
                com.max.hbutils.utils.t.M(this.mContext, false);
                color = this.mContext.getResources().getColor(R.color.white);
            }
            NavBarCfgObj navBarCfgObj = (NavBarCfgObj) this.U.objectOf("navigation_bar", NavBarCfgObj.class);
            if (navBarCfgObj != null) {
                if (z10) {
                    viewGroup2 = this.vg_title_root;
                    appbarTitleTextView = this.tb_web.getAppbarTitleTextView();
                    appbarNavButtonView = this.tb_web.getAppbarNavButtonView();
                    appbarActionButtonView = this.tb_web.getAppbarActionButtonView();
                    appbarActionTextView = this.tb_web.getAppbarActionTextView();
                    this.tb_web.a0();
                    if (this.backIconInvisible) {
                        viewGroup = viewGroup2;
                        this.tb_web.getAppbarNavButtonView().setVisibility(4);
                        viewGroup = viewGroup2;
                    }
                } else {
                    titleBar = this.mTitleBar;
                    appbarTitleTextView = titleBar.getAppbarTitleTextView();
                    appbarNavButtonView = this.mTitleBar.getAppbarNavButtonView();
                    appbarActionButtonView = this.mTitleBar.getAppbarActionButtonView();
                    appbarActionTextView = this.mTitleBar.getAppbarActionTextView();
                    this.mTitleBar.a0();
                    if (this.backIconInvisible) {
                        viewGroup = titleBar;
                        this.mTitleBar.getAppbarNavButtonView().setVisibility(4);
                        viewGroup = titleBar;
                    }
                }
                viewGroup = titleBar;
                viewGroup = viewGroup2;
                viewGroup.setVisibility(0);
                appbarTitleTextView.setVisibility(0);
                if (navBarCfgObj.getTitle() != null) {
                    appbarTitleTextView.setText(navBarCfgObj.getTitle());
                    this.f94415y1 = true;
                }
                appbarTitleTextView.setTextColor(color);
                appbarNavButtonView.setColorFilter(color);
                appbarActionButtonView.setColorFilter(color);
                appbarActionTextView.setTextColor(color);
                if (z10) {
                    viewGroup.setBackgroundColor(getResources().getColor(R.color.transparent));
                } else {
                    viewGroup.setBackgroundColor(getResources().getColor(R.color.appbar_bg_color));
                    getVgBaseFragmentView().addView(com.max.hbutils.utils.t.j(this.mContext, getResources().getColor(R.color.appbar_bg_color)), 0);
                }
                IconCfgObj right_icon = navBarCfgObj.getRight_icon();
                if (right_icon != null && right_icon.isEnabled()) {
                    if (com.max.hbcommon.utils.c.u(right_icon.getTitle())) {
                        appbarActionButtonView.setImageResource(R.drawable.common_share);
                        appbarActionButtonView.setOnClickListener(new g0(right_icon));
                        appbarActionButtonView.setVisibility(0);
                    } else {
                        appbarActionTextView.setText(right_icon.getTitle());
                        appbarActionTextView.setOnClickListener(new f0(right_icon));
                        appbarActionTextView.setVisibility(0);
                    }
                }
            } else if (!z10) {
                this.mTitleBar.a0();
                this.mTitleBar.setVisibility(0);
                this.mTitleBar.getAppbarTitleTextView().setVisibility(0);
                if (this.backIconInvisible) {
                    this.mTitleBar.getAppbarNavButtonView().setVisibility(4);
                }
                getVgBaseFragmentView().addView(com.max.hbutils.utils.t.j(this.mContext, getResources().getColor(R.color.appbar_bg_color)), 0);
            }
            WebCfgObj webview = this.U.getWebview();
            if (webview != null) {
                this.f94395m = webview.getUrl();
                this.f94400p = webview.isRefresh();
                this.f94404q = webview.isAllow_display_keyboard();
            }
            if (com.max.hbcommon.utils.c.x(this.U.valueOf("show_loading"))) {
                this.f94399o = V4;
            }
            if (this.U.getOrientation() == 1) {
                this.f94382b0 = 0;
                this.mContext.setRequestedOrientation(0);
            } else if (this.U.getOrientation() == 2) {
                this.f94382b0 = 8;
                this.mContext.setRequestedOrientation(8);
            }
        } else if (this.V) {
            this.vg_title_root.setPadding(0, com.max.hbutils.utils.t.p(this.mContext), 0, 0);
            this.vg_title_root.setVisibility(0);
            this.tb_web.a0();
            if (this.backIconInvisible) {
                this.tb_web.getAppbarNavButtonView().setVisibility(4);
            }
        } else {
            getVgBaseFragmentView().addView(com.max.hbutils.utils.t.j(this.mContext, getResources().getColor(R.color.appbar_bg_color)), 0);
            this.mTitleBar.a0();
            String str = this.W;
            if (str != null) {
                this.mTitleBar.setTitle(str);
                this.f94415y1 = true;
            }
            if (this.backIconInvisible) {
                this.mTitleBar.getAppbarNavButtonView().setVisibility(4);
            }
        }
        h0 h0Var = new h0();
        this.tb_web.setNavigationOnClickListener(h0Var);
        this.mTitleBar.setNavigationOnClickListener(h0Var);
        this.tb_web.U();
        this.mTitleBar.U();
        int iF = ViewUtils.f(this.mContext, 94.0f);
        ViewUtils.n0(this.mTitleBar.getAppbarTitleTextView(), iF, 0, iF, 0);
        ViewUtils.n0(this.tb_web.getAppbarTitleTextView(), iF, 0, iF, 0);
        ComponentCallbacks2 componentCallbacks2 = this.mContext;
        if (componentCallbacks2 instanceof com.max.hbminiprogram.h) {
            if (((com.max.hbminiprogram.h) componentCallbacks2).p0()) {
                this.tb_web.getAppbarNavButtonView().setVisibility(8);
                this.mTitleBar.getAppbarNavButtonView().setVisibility(8);
            } else {
                if (this.mTitleBar.getVisibility() == 0) {
                    this.mTitleBar.setInStack();
                    this.mTitleBar.a0();
                    this.mTitleBar.getAppbarNavButtonView().setVisibility(0);
                }
                if (this.tb_web.getVisibility() == 0) {
                    this.tb_web.setInStack();
                    this.tb_web.a0();
                    this.tb_web.getAppbarNavButtonView().setVisibility(0);
                }
            }
        }
        X7(this.X);
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public void g0(WebProtocolObj webProtocolObj) {
        if (PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 47305, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported) {
            return;
        }
        String strM = HeyboxWebProtocolHandler.m(webProtocolObj.valueOf("jsfunc"), null);
        final String strValueOf = webProtocolObj.valueOf("act_id");
        final String strValueOf2 = webProtocolObj.valueOf("qr_code");
        final String strValueOf3 = webProtocolObj.valueOf("topic_info");
        final String strValueOf4 = webProtocolObj.valueOf("image_src");
        if (strM == null) {
            return;
        }
        String strH = com.max.xiaoheihe.accelworld.j.h(strM);
        if (strH != null ? I6(strH, com.max.xiaoheihe.module.webview.c0.f94588j, new q(strValueOf3, strValueOf4, strValueOf2, strValueOf)) : false) {
            return;
        }
        this.f94385c4.evaluateJavascript(strM, new ValueCallback() { // from class: com.max.xiaoheihe.module.webview.k0
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                this.f94750a.s7(strValueOf3, strValueOf4, strValueOf2, strValueOf, (String) obj);
            }
        });
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public void g1(WebProtocolObj webProtocolObj) {
        if (PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 47326, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.T3 = webProtocolObj;
        String strValueOf = webProtocolObj.valueOf("file_suffix");
        if (com.max.hbcommon.utils.c.u(strValueOf)) {
            strValueOf = "*/*";
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType(strValueOf);
        intent.addCategory("android.intent.category.OPENABLE");
        intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
        startActivityForResult(Intent.createChooser(intent, "选择文件"), 101);
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void g4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47253, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        T3(new com.max.hbminiprogram.c() { // from class: com.max.xiaoheihe.module.webview.h0
            @Override // com.max.hbminiprogram.c
            public final void a(MiniProgramMenuInfoObj miniProgramMenuInfoObj) {
                this.f94697a.n7(miniProgramMenuInfoObj);
            }
        });
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @androidx.annotation.p0
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47341, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return (n0() || Y2()) ? M6() : super.getPageAdditional();
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @androidx.annotation.p0
    public String getPagePath() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47336, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return (n0() || Y2()) ? N6() : super.getPagePath();
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void h4(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 47351, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.O3) {
            H6(Z4, null);
        }
        if (this.P3) {
            return;
        }
        super.h4(str, this.f94395m);
    }

    public void i8(HBShareProtocolData hBShareProtocolData) {
        if (PatchProxy.proxy(new Object[]{hBShareProtocolData}, this, changeQuickRedirect, false, 47322, new Class[]{HBShareProtocolData.class}, Void.TYPE).isSupported || hBShareProtocolData == null) {
            return;
        }
        UMImage uMImage = !com.max.hbcommon.utils.c.u(hBShareProtocolData.getImg_url()) ? new UMImage(this.mContext, hBShareProtocolData.getImg_url()) : new UMImage(this.mContext, R.drawable.share_thumbnail);
        com.max.hbshare.c.b bVar = new com.max.hbshare.c.b(hBShareProtocolData.getSrc(), this.f94398n4, J6(hBShareProtocolData.getReport_extra()));
        HBShareData hBShareData = hBShareProtocolData.toHBShareData();
        hBShareData.setUmImage(uMImage);
        hBShareData.setShareListener(bVar);
        com.max.hbshare.d.E(this.mContext, hBShareData);
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d
    public void initData() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47255, new Class[0], Void.TYPE).isSupported && P3()) {
            e7();
        }
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public int j4() {
        return this.f94382b0;
    }

    public boolean j7() {
        return this.Q3 && !this.R3;
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public String l3() {
        return this.R;
    }

    @Override // com.max.hbcommon.analytics.h
    public boolean m2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47343, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : "1".equals(this.f94401p1);
    }

    @Override // com.max.hbcommon.analytics.h
    public boolean n0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47342, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (F6()) {
            return "1".equals(this.f94384c0);
        }
        return true;
    }

    @Override // com.max.hbexpression.q.a
    public void o0(ExpressionObj expressionObj) {
        WebviewBottomEditorDelegate webviewBottomEditorDelegate;
        if (PatchProxy.proxy(new Object[]{expressionObj}, this, changeQuickRedirect, false, 47320, new Class[]{ExpressionObj.class}, Void.TYPE).isSupported || (webviewBottomEditorDelegate = this.f94393k4) == null) {
            return;
        }
        webviewBottomEditorDelegate.o0(expressionObj);
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public void o2(WebProtocolObj webProtocolObj) {
        if (PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 47348, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported) {
            return;
        }
        String strValueOf = webProtocolObj.valueOf("type");
        String strValueOf2 = webProtocolObj.valueOf(FlutterActivityLaunchConfigs.EXTRA_PATH);
        String strValueOf3 = webProtocolObj.valueOf("key");
        JsonObject jsonObject = (JsonObject) webProtocolObj.objectOf("addition", JsonObject.class);
        com.max.hbcommon.utils.d.b("zzzzwebpagestay", "  path=" + strValueOf2 + "  key=" + strValueOf3 + "type=" + strValueOf);
        com.max.hbcommon.analytics.p pVar = this.f94389g4.get(strValueOf3);
        if (pVar == null) {
            pVar = new com.max.hbcommon.analytics.p(new n0(strValueOf2, jsonObject));
            this.f94389g4.put(strValueOf3, pVar);
        }
        if (!"1".equals(strValueOf)) {
            pVar.d();
        } else {
            if (this.mFragmentHidden) {
                return;
            }
            pVar.e();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        Uri data;
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 47327, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        UMShareAPI.get(this.mContext).onActivityResult(i10, i11, intent);
        if (i10 != 101 || i11 != -1 || this.T3 == null || intent == null || (data = intent.getData()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(data);
        LoadingDialog loadingDialog = this.J;
        if (loadingDialog == null || !loadingDialog.i()) {
            this.J = new LoadingDialog(this.mContext, "正在上传", true).r();
        }
        com.max.xiaoheihe.module.upload.g.j(this.mContext, getCompositeDisposable(), arrayList, this.T3.valueOf("scope"), new z(this.T3.valueOf("jsCallBackFunc"), this));
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47262, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b(f94368o4, "onDestroy:" + System.getProperties().toString());
        super.onDestroy();
        H7();
        com.max.xiaoheihe.utils.b0.c(true);
        if (this.f94385c4 != null) {
            C6();
            t7("");
            this.f94385c4.stopLoading();
            this.f94385c4.setWebChromeClient(null);
            this.f94385c4.setWebViewClient(null);
            ViewGroup viewGroup = (ViewGroup) this.f94385c4.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f94385c4);
            }
            this.f94385c4.removeAllViews();
            this.f94385c4.destroy();
            this.f94385c4 = null;
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47261, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f94385c4 != null && !shouldKeepViewOnDestroyView()) {
            if (!this.L3) {
                z6("3", this.f94385c4.getUrl() != null ? this.f94385c4.getUrl() : this.f94395m);
            }
            C6();
            t7("");
            this.f94385c4.stopLoading();
            this.f94385c4.setWebChromeClient(null);
            this.f94385c4.setWebViewClient(null);
            ViewGroup viewGroup = (ViewGroup) this.f94385c4.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f94385c4);
            }
            this.f94385c4.removeAllViews();
            this.f94385c4.destroy();
            this.f94385c4 = null;
        }
        this.f94394l4 = null;
        this.f94389g4.clear();
        super.onDestroyView();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47325, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onPause();
        if (this.f94389g4.size() > 0) {
            Iterator<com.max.hbcommon.analytics.p> it = this.f94389g4.values().iterator();
            while (it.hasNext()) {
                it.next().d();
            }
        }
        C6();
        if (this.G2) {
            this.f94416y2 = true;
        }
        com.max.hbcommon.utils.d.b(f94368o4, "onPause  mGoWxPayFlag: " + this.G2 + "  mReturnFromWxPay: " + this.f94416y2);
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47260, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        x6(true);
        I7();
        E7();
    }

    @Override // com.max.hbcommon.base.d
    public void onRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47244, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRegisterReceiver();
        OnLoginReceiver onLoginReceiver = new OnLoginReceiver();
        this.M3 = onLoginReceiver;
        registerReceiver(onLoginReceiver, lb.a.f130942c0);
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47324, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        if (this.f94389g4.size() > 0) {
            S6();
        }
        B7(this.f94410w);
        if (this.G2 && this.f94416y2) {
            this.mContext.finish();
        }
        com.max.hbcommon.utils.d.b(f94368o4, "onResume mGoWxPayFlag: " + this.G2 + "  mReturnFromWxPay: " + this.f94416y2);
    }

    @Override // com.max.hbcommon.base.d
    public void onUnRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47263, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onUnRegisterReceiver();
        OnLoginReceiver onLoginReceiver = this.M3;
        if (onLoginReceiver != null) {
            unregisterReceiver(onLoginReceiver);
        }
        OnPostSuccessReceiver onPostSuccessReceiver = this.N3;
        if (onPostSuccessReceiver != null) {
            unregisterReceiver(onPostSuccessReceiver);
        }
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void r4(@androidx.annotation.p0 TopicInfoObj topicInfoObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{topicInfoObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 47254, new Class[]{TopicInfoObj.class, Boolean.TYPE}, Void.TYPE).isSupported || topicInfoObj == null) {
            return;
        }
        l4(this.mTitleBar, topicInfoObj, z10);
        l4(this.tb_web, topicInfoObj, z10);
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public void reload() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47311, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        onRefresh();
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public boolean t0(@androidx.annotation.p0 String str, @androidx.annotation.p0 String str2, @androidx.annotation.p0 com.max.xiaoheihe.module.webview.t.b bVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, bVar}, this, changeQuickRedirect, false, 47353, new Class[]{String.class, String.class, com.max.xiaoheihe.module.webview.t.b.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (str == null || com.max.hbcommon.utils.c.u(str) || !a7()) {
            return false;
        }
        JsonObject jsonObjectB = this.f94388f4.b(str, str2);
        if (bVar != null) {
            bVar.a(jsonObjectB);
        }
        String strA = com.max.xiaoheihe.module.webview.c0.a(jsonObjectB);
        if (com.max.hbcommon.utils.c.u(strA)) {
            return false;
        }
        H6(strA, null);
        com.max.heybox.hblog.g.X("Heybox Javascript", "Javascript:" + strA);
        return true;
    }

    public void t7(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47276, new Class[]{String.class}, Void.TYPE).isSupported || this.f94385c4 == null) {
            return;
        }
        this.f94395m = str;
        I7();
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public void u(WebProtocolObj webProtocolObj) {
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @androidx.annotation.p0
    public String v3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47337, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : N6();
    }

    public void w6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47328, new Class[0], Void.TYPE).isSupported || this.mContentView == null) {
            return;
        }
        j1.a2(this.mRefreshLayout, new z0() { // from class: com.max.xiaoheihe.module.webview.m0
            @Override // androidx.core.view.z0
            public final n3 a(View view, n3 n3Var) {
                return this.f94758b.l7(view, n3Var);
            }
        });
    }

    public void w7(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47333, new Class[]{String.class}, Void.TYPE).isSupported && this.f94403p3 == null) {
            this.f94385c4.postDelayed(new a0(str), 0L);
        }
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public void x0(WebProtocolObj webProtocolObj) {
        HBShareProtocolData hBShareProtocolDataA0;
        if (PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 47281, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported || webProtocolObj == null || (hBShareProtocolDataA0 = com.max.xiaoheihe.utils.l0.a0(webProtocolObj)) == null) {
            return;
        }
        if (com.max.hbcommon.utils.c.u(hBShareProtocolDataA0.getSrc())) {
            hBShareProtocolDataA0.setSrc("web");
        }
        this.D = hBShareProtocolDataA0.getAct_id();
        if (com.max.xiaoheihe.utils.l0.l(this.mContext, hBShareProtocolDataA0, new com.max.hbshare.c.b(hBShareProtocolDataA0.getSrc(), this.f94398n4, J6(hBShareProtocolDataA0.getReport_extra())))) {
            return;
        }
        i8(hBShareProtocolDataA0);
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public void y3(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47306, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        Activity activity = this.mContext;
        if (activity instanceof WebActionActivity) {
            ((WebActionActivity) activity).D3(str);
        }
    }

    public void y6(boolean z10) {
        if (!PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 47245, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported && (this.f94385c4.getParent() instanceof ConsecutiveScrollerLayout)) {
            ConsecutiveScrollerLayout.LayoutParams layoutParams = (ConsecutiveScrollerLayout.LayoutParams) this.f94385c4.getLayoutParams();
            layoutParams.f42334a = z10;
            this.f94385c4.setLayoutParams(layoutParams);
        }
    }

    @Override // com.max.xiaoheihe.module.webview.t
    public void z2(WebProtocolObj webProtocolObj) {
        o0 o0Var;
        if (PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 47307, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported || (o0Var = this.K) == null) {
            return;
        }
        o0Var.b(webProtocolObj);
    }
}
