package com.max.xiaoheihe.module.littleprogram.fragment.webwithnative;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.gson.JsonObject;
import com.max.hbcommon.component.TitleBar;
import com.max.hbminiprogram.NativeLittleProgramFragment;
import com.max.hbminiprogram.d;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.t;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.AccelWorldLottieKt;
import com.max.xiaoheihe.bean.BgConfigObj;
import com.max.xiaoheihe.bean.IconCfgObj;
import com.max.xiaoheihe.bean.NavBarCfgObj;
import com.max.xiaoheihe.bean.StatusBarCfgObj;
import com.max.xiaoheihe.bean.WebCfgObj;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.bean.bbs.webwithnative.WebWithNativeRecommendInfoObj;
import com.max.xiaoheihe.module.littleprogram.fragment.dota2.Dota2GameDetailFragment;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.max.xiaoheihe.router.protocol.HeyboxWebProtocolHandler;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.bc;
import dl.e;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.r0;
import xh.m;

/* JADX INFO: compiled from: WebWithNativeContainerFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nWebWithNativeContainerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebWithNativeContainerFragment.kt\ncom/max/xiaoheihe/module/littleprogram/fragment/webwithnative/WebWithNativeContainerFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,315:1\n262#2,2:316\n262#2,2:318\n262#2,2:321\n262#2,2:323\n1#3:320\n*S KotlinDebug\n*F\n+ 1 WebWithNativeContainerFragment.kt\ncom/max/xiaoheihe/module/littleprogram/fragment/webwithnative/WebWithNativeContainerFragment\n*L\n112#1:316,2\n118#1:318,2\n202#1:321,2\n213#1:323,2\n*E\n"})
@n9.a({d.class})
@o(parameters = 0)
public final class WebWithNativeContainerFragment extends NativeLittleProgramFragment implements d {

    @dl.d
    public static final String F = "recommend_info";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private bc f89355p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @e
    private String f89356q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @e
    private String f89357r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @e
    private String f89358s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @e
    private WebProtocolObj f89359t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @e
    private WebWithNativeRecommendInfoObj f89360u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f89361v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f89362w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @e
    private WebviewFragment f89363x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @e
    private com.max.xiaoheihe.module.littleprogram.fragment.webwithnative.b f89364y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    public static final a f89354z = new a(null);
    public static final int A = 8;

    @dl.d
    private static final String B = "url";

    @dl.d
    private static final String C = "link_id";

    @dl.d
    private static final String D = "native_type";

    @dl.d
    private static final String E = "open_window_config";

    @dl.d
    private static final String G = "comment";

    /* JADX INFO: compiled from: WebWithNativeContainerFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39742, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : WebWithNativeContainerFragment.C;
        }

        @dl.d
        public final String b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39743, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : WebWithNativeContainerFragment.D;
        }

        @dl.d
        public final String c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39744, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : WebWithNativeContainerFragment.E;
        }

        @dl.d
        public final String d() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39741, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : WebWithNativeContainerFragment.B;
        }

        @dl.d
        public final String e() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39745, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : WebWithNativeContainerFragment.G;
        }

        @dl.d
        public final Fragment f(@e Map<String, ? extends Object> map) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 39747, new Class[]{Map.class}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            return g((String) (map != null ? map.get(d()) : null), (String) (map != null ? map.get(a()) : null), (String) (map != null ? map.get(b()) : null), (Serializable) (map != null ? map.get(c()) : null), (Serializable) (map != null ? map.get(WebWithNativeContainerFragment.F) : null));
        }

        @dl.d
        @m
        public final Dota2GameDetailFragment g(@e String str, @e String str2, @e String str3, @e Serializable serializable, @e Serializable serializable2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, serializable, serializable2}, this, changeQuickRedirect, false, 39746, new Class[]{String.class, String.class, String.class, Serializable.class, Serializable.class}, Dota2GameDetailFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Dota2GameDetailFragment) patchProxyResultProxy.result;
            }
            Bundle bundle = new Bundle();
            bundle.putString(d(), str);
            bundle.putString(a(), str2);
            bundle.putString(b(), str3);
            bundle.putSerializable(c(), serializable);
            bundle.putSerializable(WebWithNativeContainerFragment.F, serializable2);
            Dota2GameDetailFragment dota2GameDetailFragment = new Dota2GameDetailFragment();
            dota2GameDetailFragment.setArguments(bundle);
            return dota2GameDetailFragment;
        }
    }

    /* JADX INFO: compiled from: WebWithNativeContainerFragment.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ IconCfgObj f89366c;

        b(IconCfgObj iconCfgObj) {
            this.f89366c = iconCfgObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39762, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            HeyboxWebProtocolHandler heyboxWebProtocolHandler = l0.f95687b;
            Activity mContext = ((com.max.hbcommon.base.d) WebWithNativeContainerFragment.this).mContext;
            f0.o(mContext, "mContext");
            WebView webViewY4 = WebWithNativeContainerFragment.this.Y4();
            WebProtocolObj protocol = this.f89366c.getProtocol();
            f0.o(protocol, "iconCfgObj.protocol");
            heyboxWebProtocolHandler.C(mContext, webViewY4, protocol, WebWithNativeContainerFragment.this.f89363x);
        }
    }

    /* JADX INFO: compiled from: WebWithNativeContainerFragment.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ IconCfgObj f89368c;

        c(IconCfgObj iconCfgObj) {
            this.f89368c = iconCfgObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39763, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            HeyboxWebProtocolHandler heyboxWebProtocolHandler = l0.f95687b;
            Activity mContext = ((com.max.hbcommon.base.d) WebWithNativeContainerFragment.this).mContext;
            f0.o(mContext, "mContext");
            WebView webViewY4 = WebWithNativeContainerFragment.this.Y4();
            WebProtocolObj protocol = this.f89368c.getProtocol();
            f0.o(protocol, "iconCfgObj.protocol");
            heyboxWebProtocolHandler.C(mContext, webViewY4, protocol, WebWithNativeContainerFragment.this.f89363x);
        }
    }

    public static final /* synthetic */ void I4(WebWithNativeContainerFragment webWithNativeContainerFragment) {
        if (PatchProxy.proxy(new Object[]{webWithNativeContainerFragment}, null, changeQuickRedirect, true, 39738, new Class[]{WebWithNativeContainerFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        webWithNativeContainerFragment.W4();
    }

    public static final /* synthetic */ void T4(WebWithNativeContainerFragment webWithNativeContainerFragment) {
        if (PatchProxy.proxy(new Object[]{webWithNativeContainerFragment}, null, changeQuickRedirect, true, 39739, new Class[]{WebWithNativeContainerFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        webWithNativeContainerFragment.Z4();
    }

    public static final /* synthetic */ boolean V4(WebWithNativeContainerFragment webWithNativeContainerFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webWithNativeContainerFragment}, null, changeQuickRedirect, true, 39740, new Class[]{WebWithNativeContainerFragment.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : webWithNativeContainerFragment.f5();
    }

    private final void W4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39730, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        k.f(r0.a(e1.c()), null, null, new WebWithNativeContainerFragment$createWebViewFragment$1(this, null), 3, null);
    }

    private final void Z4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39728, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        bc bcVar = this.f89355p;
        bc bcVar2 = null;
        if (bcVar == null) {
            f0.S("binding");
            bcVar = null;
        }
        bcVar.f108903g.setVisibility(0);
        bc bcVar3 = this.f89355p;
        if (bcVar3 == null) {
            f0.S("binding");
            bcVar3 = null;
        }
        CircularProgressIndicator circularProgressIndicator = bcVar3.f108899c;
        f0.o(circularProgressIndicator, "binding.imgProgress");
        circularProgressIndicator.setVisibility(8);
        bc bcVar4 = this.f89355p;
        if (bcVar4 == null) {
            f0.S("binding");
        } else {
            bcVar2 = bcVar4;
        }
        bcVar2.f108899c.j();
    }

    private final void a5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39732, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        WebProtocolObj webProtocolObj = this.f89359t;
        bc bcVar = null;
        BgConfigObj bgConfigObj = webProtocolObj != null ? (BgConfigObj) webProtocolObj.objectOf(WebviewFragment.R4, BgConfigObj.class) : null;
        if (bgConfigObj == null) {
            bc bcVar2 = this.f89355p;
            if (bcVar2 == null) {
                f0.S("binding");
            } else {
                bcVar = bcVar2;
            }
            RelativeLayout relativeLayout = bcVar.f108902f;
            f0.o(relativeLayout, "binding.vgBg");
            relativeLayout.setVisibility(8);
            return;
        }
        bc bcVar3 = this.f89355p;
        if (bcVar3 == null) {
            f0.S("binding");
            bcVar3 = null;
        }
        RelativeLayout initBgConfig$lambda$3 = bcVar3.f108902f;
        f0.o(initBgConfig$lambda$3, "initBgConfig$lambda$3");
        initBgConfig$lambda$3.setVisibility(0);
        initBgConfig$lambda$3.setBackgroundColor(com.max.xiaoheihe.utils.d.e1(bgConfigObj.getBg_color()));
        if (com.max.hbcommon.utils.c.x(bgConfigObj.getPure_bg_color())) {
            return;
        }
        int iJ = ViewUtils.J(this.mContext);
        initBgConfig$lambda$3.getLayoutParams().width = iJ;
        initBgConfig$lambda$3.getLayoutParams().height = iJ;
        Activity activity = this.mContext;
        bc bcVar4 = this.f89355p;
        if (bcVar4 == null) {
            f0.S("binding");
        } else {
            bcVar = bcVar4;
        }
        com.max.xiaoheihe.utils.d.f1(activity, bgConfigObj, bcVar.f108900d);
        Activity mContext = this.mContext;
        f0.o(mContext, "mContext");
        com.max.xiaoheihe.module.littleprogram.fragment.dota2.c.f(mContext, initBgConfig$lambda$3);
    }

    private final void b5() {
        String pure_bg_color;
        BgConfigObj bgConfigObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39729, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        androidx.activity.result.b bVarR0 = getChildFragmentManager().r0(R.id.fragment_container);
        if (bVarR0 instanceof com.max.xiaoheihe.module.littleprogram.fragment.webwithnative.b) {
            this.f89364y = (com.max.xiaoheihe.module.littleprogram.fragment.webwithnative.b) bVarR0;
        } else if (f0.g(this.f89358s, G)) {
            NativePostCommentFragment.a aVar = NativePostCommentFragment.R3;
            String str = this.f89357r;
            boolean zF5 = f5();
            WebWithNativeRecommendInfoObj webWithNativeRecommendInfoObj = this.f89360u;
            WebProtocolObj webProtocolObj = this.f89359t;
            if (webProtocolObj == null || (bgConfigObj = (BgConfigObj) webProtocolObj.objectOf(WebviewFragment.R4, BgConfigObj.class)) == null) {
                pure_bg_color = null;
            } else {
                pure_bg_color = bgConfigObj.getPure_bg_color();
                if (pure_bg_color == null) {
                    pure_bg_color = bgConfigObj.getBg_color();
                }
            }
            NativePostCommentFragment nativePostCommentFragmentA = aVar.a(str, zF5, webWithNativeRecommendInfoObj, pure_bg_color);
            getChildFragmentManager().u().y(R.id.fragment_container, nativePostCommentFragmentA).n();
            this.f89364y = nativePostCommentFragmentA;
        }
        k.f(r0.a(e1.c()), null, null, new WebWithNativeContainerFragment$initFragment$1(this, null), 3, null);
    }

    private final void c5() {
        int color;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39733, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mTitleBarDivider.setVisibility(8);
        bc bcVar = this.f89355p;
        bc bcVar2 = null;
        if (bcVar == null) {
            f0.S("binding");
            bcVar = null;
        }
        TitleBar titleBar = bcVar.f108901e;
        titleBar.setBackgroundResource(R.color.transparent);
        int iE = com.max.xiaoheihe.utils.d.E(R.color.transparent);
        bc bcVar3 = this.f89355p;
        if (bcVar3 == null) {
            f0.S("binding");
            bcVar3 = null;
        }
        t.c(iE, bcVar3.f108903g, null);
        WebProtocolObj webProtocolObj = this.f89359t;
        if (webProtocolObj != null) {
            boolean zIsFull_screen = webProtocolObj.isFull_screen();
            StatusBarCfgObj status_bar = webProtocolObj.getStatus_bar();
            if (status_bar == null || !kotlin.text.u.L1(AccelWorldLottieKt.f76443a, status_bar.getStyle(), true)) {
                this.f89361v = true;
                color = this.mContext.getResources().getColor(R.color.text_primary_1_color);
                t.M(this.mContext, true);
            } else {
                this.f89361v = false;
                t.M(this.mContext, false);
                color = this.mContext.getResources().getColor(R.color.white);
            }
            if (zIsFull_screen) {
                t.A(this.mContext, 0, 0);
                bc bcVar4 = this.f89355p;
                if (bcVar4 == null) {
                    f0.S("binding");
                } else {
                    bcVar2 = bcVar4;
                }
                bcVar2.f108903g.setBackgroundColor(0);
            } else {
                bc bcVar5 = this.f89355p;
                if (bcVar5 == null) {
                    f0.S("binding");
                } else {
                    bcVar2 = bcVar5;
                }
                bcVar2.f108903g.setBackgroundColor(com.max.xiaoheihe.utils.d.F(this.mContext, R.color.background_layer_2_color));
            }
            NavBarCfgObj navBarCfgObj = (NavBarCfgObj) webProtocolObj.objectOf("navigation_bar", NavBarCfgObj.class);
            if (navBarCfgObj != null) {
                TextView appbarTitleTextView = titleBar.getAppbarTitleTextView();
                f0.o(appbarTitleTextView, "titleBar.appbarTitleTextView");
                ImageView appbarNavButtonView = titleBar.getAppbarNavButtonView();
                f0.o(appbarNavButtonView, "titleBar.appbarNavButtonView");
                ImageView appbarActionButtonView = titleBar.getAppbarActionButtonView();
                f0.o(appbarActionButtonView, "titleBar.appbarActionButtonView");
                TextView appbarActionTextView = titleBar.getAppbarActionTextView();
                f0.o(appbarActionTextView, "titleBar.appbarActionTextView");
                titleBar.a0();
                if (this.backIconInvisible) {
                    titleBar.getAppbarNavButtonView().setVisibility(4);
                }
                titleBar.setVisibility(0);
                appbarTitleTextView.setVisibility(0);
                if (navBarCfgObj.getTitle() != null) {
                    appbarTitleTextView.setText(navBarCfgObj.getTitle());
                }
                appbarTitleTextView.setTextColor(color);
                appbarNavButtonView.setColorFilter(color);
                appbarActionButtonView.setColorFilter(color);
                appbarActionTextView.setTextColor(color);
                IconCfgObj right_icon = navBarCfgObj.getRight_icon();
                if (right_icon != null && right_icon.isEnabled()) {
                    if (com.max.hbcommon.utils.c.u(right_icon.getTitle())) {
                        appbarActionButtonView.setImageResource(R.drawable.common_share);
                        appbarActionButtonView.setOnClickListener(new c(right_icon));
                        appbarActionButtonView.setVisibility(0);
                    } else {
                        appbarActionTextView.setText(right_icon.getTitle());
                        appbarActionTextView.setOnClickListener(new b(right_icon));
                        appbarActionTextView.setVisibility(0);
                    }
                }
            }
            WebCfgObj webview = webProtocolObj.getWebview();
            if (webview != null) {
                this.f89362w = webview.isRefresh();
            }
        }
        titleBar.setInStack(Boolean.TRUE);
    }

    @dl.d
    @m
    public static final Dota2GameDetailFragment d5(@e String str, @e String str2, @e String str3, @e Serializable serializable, @e Serializable serializable2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, serializable, serializable2}, null, changeQuickRedirect, true, 39737, new Class[]{String.class, String.class, String.class, Serializable.class, Serializable.class}, Dota2GameDetailFragment.class);
        return patchProxyResultProxy.isSupported ? (Dota2GameDetailFragment) patchProxyResultProxy.result : f89354z.g(str, str2, str3, serializable, serializable2);
    }

    private final void e5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39727, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        bc bcVar = this.f89355p;
        bc bcVar2 = null;
        if (bcVar == null) {
            f0.S("binding");
            bcVar = null;
        }
        bcVar.f108903g.setVisibility(4);
        bc bcVar3 = this.f89355p;
        if (bcVar3 == null) {
            f0.S("binding");
            bcVar3 = null;
        }
        CircularProgressIndicator circularProgressIndicator = bcVar3.f108899c;
        f0.o(circularProgressIndicator, "binding.imgProgress");
        circularProgressIndicator.setVisibility(0);
        bc bcVar4 = this.f89355p;
        if (bcVar4 == null) {
            f0.S("binding");
        } else {
            bcVar2 = bcVar4;
        }
        bcVar2.f108899c.p();
    }

    private final boolean f5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39731, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        WebProtocolObj webProtocolObj = this.f89359t;
        if (webProtocolObj != null) {
            return ((BgConfigObj) webProtocolObj.objectOf(WebviewFragment.R4, BgConfigObj.class)) != null || com.max.hbcommon.utils.c.x(webProtocolObj.valueOf(WebviewFragment.P4));
        }
        return false;
    }

    @e
    public final com.max.xiaoheihe.module.littleprogram.fragment.webwithnative.b X4() {
        return this.f89364y;
    }

    @e
    public final WebView Y4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39734, new Class[0], WebView.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebView) patchProxyResultProxy.result;
        }
        WebviewFragment webviewFragment = this.f89363x;
        if (webviewFragment != null) {
            return webviewFragment.U6();
        }
        return null;
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.d
    @dl.d
    public Fragment a2(@e Map<String, ? extends Object> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 39735, new Class[]{Map.class}, Fragment.class);
        return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : Dota2GameDetailFragment.C.c(map);
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void a4(@e View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 39726, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.a4(view, z10);
        bc bcVarC = bc.c(this.mInflater);
        f0.o(bcVarC, "inflate(mInflater)");
        this.f89355p = bcVarC;
        if (bcVarC == null) {
            f0.S("binding");
            bcVarC = null;
        }
        setContentView(bcVarC);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f89356q = arguments.getString(B);
            this.f89357r = arguments.getString(C);
            this.f89358s = arguments.getString(D);
            this.f89359t = (WebProtocolObj) com.max.hbutils.utils.k.a(com.max.hbutils.utils.k.p(arguments.getSerializable(E)), WebProtocolObj.class);
            this.f89360u = (WebWithNativeRecommendInfoObj) com.max.hbutils.utils.k.a(com.max.hbutils.utils.k.p(arguments.getSerializable(F)), WebWithNativeRecommendInfoObj.class);
        }
        Log.d("WebWithNative", "url: " + this.f89356q + "  link_id: " + this.f89357r + "  native_type: " + this.f89358s + "  config: " + com.max.hbutils.utils.k.p(this.f89359t));
        WebProtocolObj webProtocolObj = this.f89359t;
        if (com.max.hbcommon.utils.c.A(webProtocolObj != null ? webProtocolObj.valueOf("show_loading") : null)) {
            e5();
        } else {
            Z4();
        }
        a5();
        b5();
        c5();
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public boolean e4() {
        return this.f89361v;
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @e
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39736, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(B, this.f89356q);
        jsonObject.addProperty(C, this.f89357r);
        jsonObject.addProperty(D, this.f89358s);
        return jsonObject.toString();
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    public boolean x4() {
        return false;
    }
}
