package com.max.xiaoheihe.module.webview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.SlidingTabLayout;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.component.TitleBar;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.AccelWorldLottieKt;
import com.max.xiaoheihe.bean.IconCfgObj;
import com.max.xiaoheihe.bean.NavBarCfgObj;
import com.max.xiaoheihe.bean.StatusBarCfgObj;
import com.max.xiaoheihe.bean.WebCfgObj;
import com.max.xiaoheihe.bean.WebPageObj;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.router.protocol.HeyboxWebProtocolHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareAPI;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: WebPageActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@kotlin.jvm.internal.t0({"SMAP\nWebPageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebPageActivity.kt\ncom/max/xiaoheihe/module/webview/WebPageActivity\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,160:1\n37#2,2:161\n*S KotlinDebug\n*F\n+ 1 WebPageActivity.kt\ncom/max/xiaoheihe/module/webview/WebPageActivity\n*L\n147#1:161,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class WebPageActivity extends BaseActivity {

    @dl.d
    public static final a Q = new a(null);
    public static final int R = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    private final ArrayList<Fragment> L = new ArrayList<>();
    private SlidingTabLayout M;
    private ViewPager N;

    @dl.e
    private androidx.fragment.app.n0 O;
    private WebProtocolObj P;

    /* JADX INFO: compiled from: WebPageActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final Intent a(@dl.d Context context, @dl.d WebProtocolObj protocol) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, protocol}, this, changeQuickRedirect, false, 47144, new Class[]{Context.class, WebProtocolObj.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(context, "context");
            kotlin.jvm.internal.f0.p(protocol, "protocol");
            Intent intent = new Intent(context, (Class<?>) WebPageActivity.class);
            intent.putExtra("arg_protocol", protocol);
            return intent;
        }
    }

    /* JADX INFO: compiled from: WebPageActivity.kt */
    public static final class b extends androidx.fragment.app.n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        b(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47146, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : WebPageActivity.this.L.size();
        }

        @Override // androidx.fragment.app.n0
        @dl.d
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 47145, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            Object obj = WebPageActivity.this.L.get(i10);
            kotlin.jvm.internal.f0.o(obj, "mFragments[position]");
            return (Fragment) obj;
        }
    }

    /* JADX INFO: compiled from: WebPageActivity.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ IconCfgObj f94330c;

        c(IconCfgObj iconCfgObj) {
            this.f94330c = iconCfgObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 47147, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            HeyboxWebProtocolHandler heyboxWebProtocolHandler = com.max.xiaoheihe.utils.l0.f95687b;
            Activity mContext = ((BaseActivity) WebPageActivity.this).f66601b;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            WebView webViewU6 = WebPageActivity.M1(WebPageActivity.this).U6();
            WebProtocolObj protocol = this.f94330c.getProtocol();
            kotlin.jvm.internal.f0.o(protocol, "iconCfgObj.protocol");
            heyboxWebProtocolHandler.C(mContext, webViewU6, protocol, WebPageActivity.M1(WebPageActivity.this));
        }
    }

    /* JADX INFO: compiled from: WebPageActivity.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ IconCfgObj f94332c;

        d(IconCfgObj iconCfgObj) {
            this.f94332c = iconCfgObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 47148, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            HeyboxWebProtocolHandler heyboxWebProtocolHandler = com.max.xiaoheihe.utils.l0.f95687b;
            Activity mContext = ((BaseActivity) WebPageActivity.this).f66601b;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            WebView webViewU6 = WebPageActivity.M1(WebPageActivity.this).U6();
            WebProtocolObj protocol = this.f94332c.getProtocol();
            kotlin.jvm.internal.f0.o(protocol, "iconCfgObj.protocol");
            heyboxWebProtocolHandler.C(mContext, webViewU6, protocol, WebPageActivity.M1(WebPageActivity.this));
        }
    }

    public static final /* synthetic */ WebviewFragment M1(WebPageActivity webPageActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webPageActivity}, null, changeQuickRedirect, true, 47143, new Class[]{WebPageActivity.class}, WebviewFragment.class);
        return patchProxyResultProxy.isSupported ? (WebviewFragment) patchProxyResultProxy.result : webPageActivity.Q1();
    }

    private final WebviewFragment Q1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47140, new Class[0], WebviewFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebviewFragment) patchProxyResultProxy.result;
        }
        androidx.fragment.app.n0 n0Var = this.O;
        Object objInstantiateItem = null;
        ViewPager viewPager = null;
        if (n0Var != null) {
            ViewPager viewPager2 = this.N;
            if (viewPager2 == null) {
                kotlin.jvm.internal.f0.S("vp");
                viewPager2 = null;
            }
            ViewPager viewPager3 = this.N;
            if (viewPager3 == null) {
                kotlin.jvm.internal.f0.S("vp");
            } else {
                viewPager = viewPager3;
            }
            objInstantiateItem = n0Var.instantiateItem((ViewGroup) viewPager2, viewPager.getCurrentItem());
        }
        kotlin.jvm.internal.f0.n(objInstantiateItem, "null cannot be cast to non-null type com.max.xiaoheihe.module.webview.WebviewFragment");
        return (WebviewFragment) objInstantiateItem;
    }

    private final void T1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47141, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.L.clear();
        WebProtocolObj webProtocolObj = this.P;
        SlidingTabLayout slidingTabLayout = null;
        if (webProtocolObj == null) {
            kotlin.jvm.internal.f0.S("mWebProtocolObj");
            webProtocolObj = null;
        }
        List<WebPageObj> listListOf = webProtocolObj.listOf("page", WebPageObj.class);
        if (listListOf != null) {
            for (WebPageObj webPageObj : listListOf) {
                WebCfgObj webview = webPageObj.getWebview();
                u uVarP = new u(webview != null ? webview.getUrl() : null).p(WebviewFragment.U4);
                WebCfgObj webview2 = webPageObj.getWebview();
                u uVarU = uVarP.u(webview2 != null ? webview2.isRefresh() : false);
                WebCfgObj webview3 = webPageObj.getWebview();
                u uVarR = uVarU.r(webview3 != null ? webview3.isDisable_navi() : false);
                WebCfgObj webview4 = webPageObj.getWebview();
                WebviewFragment webviewFragmentA = uVarR.e(webview4 != null ? webview4.isAllow_display_keyboard() : false).a();
                webviewFragmentA.Q7(true);
                this.L.add(webviewFragmentA);
            }
        }
        this.O = new b(getSupportFragmentManager());
        ViewPager viewPager = this.N;
        if (viewPager == null) {
            kotlin.jvm.internal.f0.S("vp");
            viewPager = null;
        }
        viewPager.setAdapter(this.O);
        WebProtocolObj webProtocolObj2 = this.P;
        if (webProtocolObj2 == null) {
            kotlin.jvm.internal.f0.S("mWebProtocolObj");
            webProtocolObj2 = null;
        }
        List listListOf2 = webProtocolObj2.listOf("title", String.class);
        SlidingTabLayout slidingTabLayout2 = this.M;
        if (slidingTabLayout2 == null) {
            kotlin.jvm.internal.f0.S("mSlidingTabLayout");
            slidingTabLayout2 = null;
        }
        ViewPager viewPager2 = this.N;
        if (viewPager2 == null) {
            kotlin.jvm.internal.f0.S("vp");
            viewPager2 = null;
        }
        slidingTabLayout2.setViewPager(viewPager2, listListOf2 != null ? (String[]) listListOf2.toArray(new String[0]) : null);
        SlidingTabLayout slidingTabLayout3 = this.M;
        if (slidingTabLayout3 == null) {
            kotlin.jvm.internal.f0.S("mSlidingTabLayout");
        } else {
            slidingTabLayout = slidingTabLayout3;
        }
        slidingTabLayout.setCurrentTab(0);
    }

    private final void V1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47139, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        WebProtocolObj webProtocolObj = this.P;
        WebProtocolObj webProtocolObj2 = null;
        if (webProtocolObj == null) {
            kotlin.jvm.internal.f0.S("mWebProtocolObj");
            webProtocolObj = null;
        }
        NavBarCfgObj navBarCfgObj = (NavBarCfgObj) webProtocolObj.objectOf("navigation_bar", NavBarCfgObj.class);
        WebProtocolObj webProtocolObj3 = this.P;
        if (webProtocolObj3 == null) {
            kotlin.jvm.internal.f0.S("mWebProtocolObj");
            webProtocolObj3 = null;
        }
        StatusBarCfgObj status_bar = webProtocolObj3.getStatus_bar();
        this.f66616q.a0();
        int color = (status_bar == null || !AccelWorldLottieKt.f76443a.equals(status_bar.getStyle())) ? this.f66601b.getResources().getColor(R.color.text_primary_1_color) : this.f66601b.getResources().getColor(R.color.white);
        if (navBarCfgObj != null) {
            TitleBar mTitleBar = this.f66616q;
            kotlin.jvm.internal.f0.o(mTitleBar, "mTitleBar");
            TextView appbarTitleTextView = this.f66616q.getAppbarTitleTextView();
            kotlin.jvm.internal.f0.o(appbarTitleTextView, "mTitleBar.appbarTitleTextView");
            ImageView appbarNavButtonView = this.f66616q.getAppbarNavButtonView();
            kotlin.jvm.internal.f0.o(appbarNavButtonView, "mTitleBar.appbarNavButtonView");
            ImageView appbarActionButtonView = this.f66616q.getAppbarActionButtonView();
            kotlin.jvm.internal.f0.o(appbarActionButtonView, "mTitleBar.appbarActionButtonView");
            TextView appbarActionTextView = this.f66616q.getAppbarActionTextView();
            kotlin.jvm.internal.f0.o(appbarActionTextView, "mTitleBar.appbarActionTextView");
            mTitleBar.setVisibility(0);
            appbarTitleTextView.setVisibility(0);
            if (!com.max.hbcommon.utils.c.u(navBarCfgObj.getTitle())) {
                appbarTitleTextView.setText(navBarCfgObj.getTitle());
            }
            appbarTitleTextView.setTextColor(color);
            appbarNavButtonView.setColorFilter(color);
            appbarActionButtonView.setColorFilter(color);
            appbarActionTextView.setTextColor(color);
            WebProtocolObj webProtocolObj4 = this.P;
            if (webProtocolObj4 == null) {
                kotlin.jvm.internal.f0.S("mWebProtocolObj");
            } else {
                webProtocolObj2 = webProtocolObj4;
            }
            if (webProtocolObj2.isFull_screen()) {
                mTitleBar.setBackgroundColor(getResources().getColor(R.color.transparent));
            } else {
                mTitleBar.setBackgroundColor(getResources().getColor(R.color.appbar_bg_color));
                if (this.f66616q.getVisibility() == 0) {
                    this.f66617r.setVisibility(0);
                }
            }
            IconCfgObj right_icon = navBarCfgObj.getRight_icon();
            if (right_icon == null || !right_icon.isEnabled()) {
                return;
            }
            if (com.max.hbcommon.utils.c.u(right_icon.getTitle())) {
                appbarActionButtonView.setImageResource(R.drawable.common_share);
                appbarActionButtonView.setOnClickListener(new d(right_icon));
                appbarActionButtonView.setVisibility(0);
            } else {
                appbarActionTextView.setText(right_icon.getTitle());
                appbarActionTextView.setOnClickListener(new c(right_icon));
                appbarActionTextView.setVisibility(0);
            }
        }
    }

    @dl.e
    public final androidx.fragment.app.n0 R1() {
        return this.O;
    }

    public final void W1(@dl.e androidx.fragment.app.n0 n0Var) {
        this.O = n0Var;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47138, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_vp);
        View viewFindViewById = findViewById(R.id.vp);
        kotlin.jvm.internal.f0.o(viewFindViewById, "findViewById(R.id.vp)");
        this.N = (ViewPager) viewFindViewById;
        Serializable serializableExtra = getIntent().getSerializableExtra("arg_protocol");
        kotlin.jvm.internal.f0.n(serializableExtra, "null cannot be cast to non-null type com.max.xiaoheihe.bean.WebProtocolObj");
        this.P = (WebProtocolObj) serializableExtra;
        V1();
        SlidingTabLayout titleTabLayout = this.f66616q.getTitleTabLayout();
        kotlin.jvm.internal.f0.o(titleTabLayout, "mTitleBar.titleTabLayout");
        this.M = titleTabLayout;
        T1();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 47142, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        UMShareAPI.get(this).onActivityResult(i10, i11, intent);
    }
}
