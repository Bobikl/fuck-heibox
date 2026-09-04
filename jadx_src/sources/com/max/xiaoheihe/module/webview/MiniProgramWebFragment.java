package com.max.xiaoheihe.module.webview;

import android.content.ComponentCallbacks2;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.b1;
import androidx.lifecycle.y0;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphViewModelLazyKt;
import com.max.hbcommon.component.TitleBar;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: MiniProgramWebFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@kotlin.jvm.internal.t0({"SMAP\nMiniProgramWebFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiniProgramWebFragment.kt\ncom/max/xiaoheihe/module/webview/MiniProgramWebFragment\n+ 2 NavGraphViewModelLazy.kt\nandroidx/navigation/NavGraphViewModelLazyKt\n*L\n1#1,126:1\n102#2,12:127\n*S KotlinDebug\n*F\n+ 1 MiniProgramWebFragment.kt\ncom/max/xiaoheihe/module/webview/MiniProgramWebFragment\n*L\n27#1:127,12\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
@com.max.hbcommon.base.hblifeevent.fragment.b(lifeEvents = {com.max.xiaoheihe.module.proxy.b.class})
public final class MiniProgramWebFragment extends WebviewFragment {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: m5, reason: collision with root package name */
    public static final int f94229m5 = 8;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    @dl.d
    private final kotlin.z f94230j5;

    /* JADX INFO: renamed from: k5, reason: collision with root package name */
    private boolean f94231k5;

    /* JADX INFO: renamed from: l5, reason: collision with root package name */
    @dl.e
    private View f94232l5;

    /* JADX INFO: compiled from: MiniProgramWebFragment.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46938, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MiniProgramWebFragment.this.onRefresh();
        }
    }

    /* JADX INFO: compiled from: MiniProgramWebFragment.kt */
    public static final class b extends WebviewFragment.o0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void b(@dl.e WebProtocolObj webProtocolObj) {
            if (PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 46941, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported) {
                return;
            }
            super.b(webProtocolObj);
            if (((com.max.hbcommon.base.d) MiniProgramWebFragment.this).mContext instanceof com.max.xiaoheihe.module.miniprogram.a) {
                ComponentCallbacks2 componentCallbacks2 = ((com.max.hbcommon.base.d) MiniProgramWebFragment.this).mContext;
                kotlin.jvm.internal.f0.n(componentCallbacks2, "null cannot be cast to non-null type com.max.xiaoheihe.module.miniprogram.MiniProgramHost");
                ((com.max.xiaoheihe.module.miniprogram.a) componentCallbacks2).E0(webProtocolObj);
            }
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void n(@dl.e WebView webView, @dl.e Bitmap bitmap) {
            if (PatchProxy.proxy(new Object[]{webView, bitmap}, this, changeQuickRedirect, false, 46939, new Class[]{WebView.class, Bitmap.class}, Void.TYPE).isSupported) {
                return;
            }
            super.n(webView, bitmap);
            if (((com.max.hbcommon.base.d) MiniProgramWebFragment.this).mContext instanceof com.max.xiaoheihe.module.miniprogram.a) {
                ComponentCallbacks2 componentCallbacks2 = ((com.max.hbcommon.base.d) MiniProgramWebFragment.this).mContext;
                kotlin.jvm.internal.f0.n(componentCallbacks2, "null cannot be cast to non-null type com.max.xiaoheihe.module.miniprogram.MiniProgramHost");
                ((com.max.xiaoheihe.module.miniprogram.a) componentCallbacks2).q(webView, bitmap);
            }
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void o(@dl.e WebView webView, @dl.e String str) {
            if (PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 46940, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            super.o(webView, str);
            if (((com.max.hbcommon.base.d) MiniProgramWebFragment.this).mContext instanceof com.max.xiaoheihe.module.miniprogram.a) {
                kotlin.jvm.internal.f0.m(webView);
                if (com.max.xiaoheihe.utils.l0.i0(webView.getUrl(), str)) {
                    MiniProgramWebFragment miniProgramWebFragment = MiniProgramWebFragment.this;
                    if (miniProgramWebFragment.f94415y1) {
                        return;
                    }
                    miniProgramWebFragment.W7(str);
                }
            }
        }
    }

    public MiniProgramWebFragment() {
        final int i10 = R.id.nav_host_fragment;
        final kotlin.z zVarC = kotlin.b0.c(new yh.a<NavBackStackEntry>() { // from class: com.max.xiaoheihe.module.webview.MiniProgramWebFragment$special$$inlined$navGraphViewModels$default$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public final NavBackStackEntry a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46942, new Class[0], NavBackStackEntry.class);
                return patchProxyResultProxy.isSupported ? (NavBackStackEntry) patchProxyResultProxy.result : androidx.navigation.fragment.e.a(this).N(i10);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.navigation.NavBackStackEntry, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ NavBackStackEntry invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46943, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        final yh.a aVar = null;
        this.f94230j5 = FragmentViewModelLazyKt.h(this, kotlin.jvm.internal.n0.d(e.class), new yh.a<b1>() { // from class: com.max.xiaoheihe.module.webview.MiniProgramWebFragment$special$$inlined$navGraphViewModels$default$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            public final b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46944, new Class[0], b1.class);
                return patchProxyResultProxy.isSupported ? (b1) patchProxyResultProxy.result : NavGraphViewModelLazyKt.n(zVarC).getViewModelStore();
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.b1, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46945, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        }, new yh.a<u2.a>() { // from class: com.max.xiaoheihe.module.webview.MiniProgramWebFragment$special$$inlined$navGraphViewModels$default$3
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, u2.a] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ u2.a invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46947, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }

            @Override // yh.a
            public final u2.a invoke() {
                u2.a aVar2;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46946, new Class[0], u2.a.class);
                if (patchProxyResultProxy.isSupported) {
                    return (u2.a) patchProxyResultProxy.result;
                }
                yh.a aVar3 = aVar;
                return (aVar3 == null || (aVar2 = (u2.a) aVar3.invoke()) == null) ? NavGraphViewModelLazyKt.n(zVarC).getDefaultViewModelCreationExtras() : aVar2;
            }
        }, new yh.a<y0.b>() { // from class: com.max.xiaoheihe.module.webview.MiniProgramWebFragment$special$$inlined$navGraphViewModels$default$4
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            public final y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46948, new Class[0], y0.b.class);
                return patchProxyResultProxy.isSupported ? (y0.b) patchProxyResultProxy.result : NavGraphViewModelLazyKt.n(zVarC).getDefaultViewModelProviderFactory();
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.y0$b, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46949, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        });
    }

    private final View o8(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, 46934, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        com.max.heybox.hblog.g.f74531b.q("MiniProgramWebFragment(" + this + "), getPersistentView, currentRootView = " + this.f94232l5);
        View view = this.f94232l5;
        if (view == null) {
            this.f94232l5 = layoutInflater.inflate(R.layout.fragment_base, viewGroup, false);
            this.mInflater = layoutInflater;
            initBaseData();
            installViews(this.f94232l5);
            this.mViewAvailable = true;
            registerEvents();
            this.reporter = new com.max.hbcommon.analytics.j(this, bundle != null);
            com.max.hbcommon.analytics.d.z(this, this.f94232l5, bundle);
            if (this.isInFragmentStack) {
                this.mTitleBar.setInStack();
            }
            if (this.backIconInvisible) {
                this.mTitleBar.setBackIconInvisible();
                this.mTitleBar.getAppbarNavButtonView().setVisibility(4);
            }
        } else {
            ViewParent parent = view != null ? view.getParent() : null;
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f94232l5);
            }
        }
        return this.f94232l5;
    }

    @Override // com.max.hbcommon.base.d
    public void initBaseData() {
        View view;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46937, new Class[0], Void.TYPE).isSupported || (view = this.f94232l5) == null) {
            return;
        }
        this.mVgBaseFragmentView = (ViewGroup) view.findViewById(R.id.vg_base_fragment);
        View viewFindViewById = view.findViewById(R.id.multi_status_view_container);
        kotlin.jvm.internal.f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.FrameLayout");
        ((com.max.hbcommon.base.d) this).mContainer = (FrameLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.vg_title);
        kotlin.jvm.internal.f0.n(viewFindViewById2, "null cannot be cast to non-null type android.view.ViewGroup");
        this.vg_title = (ViewGroup) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.tb_title);
        kotlin.jvm.internal.f0.n(viewFindViewById3, "null cannot be cast to non-null type com.max.hbcommon.component.TitleBar");
        this.mTitleBar = (TitleBar) viewFindViewById3;
        this.mTitleBarDivider = view.findViewById(R.id.title_bar_divider);
        this.mOnRetryClickListener = new a();
    }

    @dl.e
    public final View m8() {
        return this.f94232l5;
    }

    public final boolean n8() {
        return this.f94231k5;
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 46932, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(inflater, "inflater");
        if (d4()) {
            this.isInFragmentStack = true;
            this.backIconInvisible = f4();
        }
        return o8(inflater, viewGroup, bundle);
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 46935, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "view");
        super.onViewCreated(view, bundle);
        com.max.heybox.hblog.g.f74531b.q("MiniProgramWebFragment(" + this + "), onViewCreated, rootView = " + this.rootView);
        if (this.f94231k5) {
            return;
        }
        this.f94231k5 = true;
    }

    @dl.d
    public final e p8() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46931, new Class[0], e.class);
        return patchProxyResultProxy.isSupported ? (e) patchProxyResultProxy.result : (e) this.f94230j5.getValue();
    }

    public final void q8(@dl.e View view) {
        this.f94232l5 = view;
    }

    public final void r8(boolean z10) {
        this.f94231k5 = z10;
    }

    @Override // com.max.hbcommon.base.d
    public void registerEvents() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46933, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.registerEvents();
        Y7(new b());
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d
    public boolean shouldKeepViewOnDestroyView() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46936, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : super.shouldKeepViewOnDestroyView();
    }
}
