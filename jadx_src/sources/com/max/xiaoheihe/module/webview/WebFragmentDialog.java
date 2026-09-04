package com.max.xiaoheihe.module.webview;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.hbcustomview.swipebacklayout.SwipeBackLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import com.max.xiaoheihe.module.webview.component.NestedWebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.i2;

/* JADX INFO: compiled from: WebFragmentDialog.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class WebFragmentDialog extends com.max.hbcommon.base.swipeback.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    public static final a f94313n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f94314o = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final String f94315p = "url";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private static final String f94316q = SwitchDetailActivity.P;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private String f94317j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private WebProtocolObj f94318k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private WebviewFragment f94319l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final kotlinx.coroutines.q0 f94320m = kotlinx.coroutines.r0.a(i2.c(null, 1, null).I(e1.a()));

    /* JADX INFO: compiled from: WebFragmentDialog.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @xh.m
        public static /* synthetic */ void b() {
        }

        @xh.m
        public static /* synthetic */ void d() {
        }

        @dl.d
        public final String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47119, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : WebFragmentDialog.f94316q;
        }

        @dl.d
        public final String c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47118, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : WebFragmentDialog.f94315p;
        }

        @dl.d
        @xh.m
        public final WebFragmentDialog e(@dl.e WebProtocolObj webProtocolObj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 47121, new Class[]{WebProtocolObj.class}, WebFragmentDialog.class);
            if (patchProxyResultProxy.isSupported) {
                return (WebFragmentDialog) patchProxyResultProxy.result;
            }
            WebFragmentDialog webFragmentDialog = new WebFragmentDialog();
            Bundle bundle = new Bundle();
            bundle.putSerializable(a(), webProtocolObj);
            webFragmentDialog.setArguments(bundle);
            return webFragmentDialog;
        }

        @dl.d
        @xh.m
        public final WebFragmentDialog f(@dl.e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47120, new Class[]{String.class}, WebFragmentDialog.class);
            if (patchProxyResultProxy.isSupported) {
                return (WebFragmentDialog) patchProxyResultProxy.result;
            }
            WebFragmentDialog webFragmentDialog = new WebFragmentDialog();
            Bundle bundle = new Bundle();
            bundle.putSerializable(c(), str);
            webFragmentDialog.setArguments(bundle);
            return webFragmentDialog;
        }
    }

    /* JADX INFO: compiled from: WebFragmentDialog.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 47126, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            WebFragmentDialog.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.webview.WebFragmentDialog$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: compiled from: WebFragmentDialog.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.webview.WebFragmentDialog$onViewCreated$1", f = "WebFragmentDialog.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f94322b;

        AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 47123, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : WebFragmentDialog.this.new AnonymousClass1(cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 47125, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 47124, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 47122, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f94322b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                WebFragmentDialog webFragmentDialog = WebFragmentDialog.this;
                this.f94322b = 1;
                if (WebFragmentDialog.X3(webFragmentDialog, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            return b2.f124493a;
        }
    }

    public static final /* synthetic */ Object X3(WebFragmentDialog webFragmentDialog, kotlin.coroutines.c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webFragmentDialog, cVar}, null, changeQuickRedirect, true, 47117, new Class[]{WebFragmentDialog.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : webFragmentDialog.e4(cVar);
    }

    @dl.d
    public static final String Y3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 47114, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : f94313n.a();
    }

    @dl.d
    public static final String Z3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 47113, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : f94313n.c();
    }

    @dl.d
    @xh.m
    public static final WebFragmentDialog c4(@dl.e WebProtocolObj webProtocolObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webProtocolObj}, null, changeQuickRedirect, true, 47116, new Class[]{WebProtocolObj.class}, WebFragmentDialog.class);
        return patchProxyResultProxy.isSupported ? (WebFragmentDialog) patchProxyResultProxy.result : f94313n.e(webProtocolObj);
    }

    @dl.d
    @xh.m
    public static final WebFragmentDialog d4(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 47115, new Class[]{String.class}, WebFragmentDialog.class);
        return patchProxyResultProxy.isSupported ? (WebFragmentDialog) patchProxyResultProxy.result : f94313n.f(str);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    private final Object e4(kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        WebFragmentDialog$refreshSwipeBackLayoutInnerScrollView$1 webFragmentDialog$refreshSwipeBackLayoutInnerScrollView$1;
        WebFragmentDialog webFragmentDialog;
        NestedWebView nestedWebView;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 47112, new Class[]{kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (cVar instanceof WebFragmentDialog$refreshSwipeBackLayoutInnerScrollView$1) {
            webFragmentDialog$refreshSwipeBackLayoutInnerScrollView$1 = (WebFragmentDialog$refreshSwipeBackLayoutInnerScrollView$1) cVar;
            int i10 = webFragmentDialog$refreshSwipeBackLayoutInnerScrollView$1.f94327e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                webFragmentDialog$refreshSwipeBackLayoutInnerScrollView$1.f94327e = i10 - Integer.MIN_VALUE;
            } else {
                webFragmentDialog$refreshSwipeBackLayoutInnerScrollView$1 = new WebFragmentDialog$refreshSwipeBackLayoutInnerScrollView$1(this, cVar);
            }
        } else {
            webFragmentDialog$refreshSwipeBackLayoutInnerScrollView$1 = new WebFragmentDialog$refreshSwipeBackLayoutInnerScrollView$1(this, cVar);
        }
        Object obj = webFragmentDialog$refreshSwipeBackLayoutInnerScrollView$1.f94325c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = webFragmentDialog$refreshSwipeBackLayoutInnerScrollView$1.f94327e;
        if (i11 != 0) {
            if (i11 == 1) {
                webFragmentDialog = (WebFragmentDialog) webFragmentDialog$refreshSwipeBackLayoutInnerScrollView$1.f94324b;
                kotlin.t0.n(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            Log.d("InnerScroll", "null");
            return b2.f124493a;
        }
        kotlin.t0.n(obj);
        webFragmentDialog$refreshSwipeBackLayoutInnerScrollView$1.f94324b = this;
        webFragmentDialog$refreshSwipeBackLayoutInnerScrollView$1.f94327e = 1;
        if (DelayKt.b(100L, webFragmentDialog$refreshSwipeBackLayoutInnerScrollView$1) == objH) {
            return objH;
        }
        webFragmentDialog = this;
        WebviewFragment webviewFragment = webFragmentDialog.f94319l;
        if ((webviewFragment != null ? webviewFragment.f94385c4 : null) != null) {
            if (((webviewFragment == null || (nestedWebView = webviewFragment.f94385c4) == null) ? null : nestedWebView.getParent()) != null) {
                SwipeBackLayout swipeBackLayout = webFragmentDialog.f66927e;
                WebviewFragment webviewFragment2 = webFragmentDialog.f94319l;
                swipeBackLayout.f69555k = webviewFragment2 != null ? webviewFragment2.f94385c4 : null;
                Log.d("InnerScroll", "get");
            }
            return b2.f124493a;
        }
        webFragmentDialog$refreshSwipeBackLayoutInnerScrollView$1.f94324b = null;
        webFragmentDialog$refreshSwipeBackLayoutInnerScrollView$1.f94327e = 2;
        if (webFragmentDialog.e4(webFragmentDialog$refreshSwipeBackLayoutInnerScrollView$1) == objH) {
            return objH;
        }
        Log.d("InnerScroll", "null");
        return b2.f124493a;
    }

    @dl.e
    public final WebviewFragment a4() {
        return this.f94319l;
    }

    @dl.d
    public final kotlinx.coroutines.q0 b4() {
        return this.f94320m;
    }

    public final void f4(@dl.e WebviewFragment webviewFragment) {
        this.f94319l = webviewFragment;
    }

    @Override // androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 47110, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(inflater, "inflater");
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f94317j = arguments.getString(f94315p);
            this.f94318k = (WebProtocolObj) arguments.getSerializable(f94316q);
        }
        return inflater.inflate(R.layout.dialog_fragment_user_game_data, viewGroup, false);
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 47111, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "view");
        super.onViewCreated(view, bundle);
        WebviewFragment webviewFragment = (WebviewFragment) getChildFragmentManager().r0(R.id.fragment_container);
        this.f94319l = webviewFragment;
        if (webviewFragment == null) {
            if (this.f94318k != null) {
                WebProtocolObj webProtocolObj = this.f94318k;
                kotlin.jvm.internal.f0.m(webProtocolObj);
                this.f94319l = new u(webProtocolObj.getWebview().getUrl()).B(this.f94318k).a();
            } else {
                this.f94319l = WebviewFragment.u7(this.f94317j);
            }
            androidx.fragment.app.p0 p0VarU = getChildFragmentManager().u();
            WebviewFragment webviewFragment2 = this.f94319l;
            kotlin.jvm.internal.f0.m(webviewFragment2);
            p0VarU.b(R.id.fragment_container, webviewFragment2).m();
            kotlinx.coroutines.k.f(this.f94320m, null, null, new AnonymousClass1(null), 3, null);
        }
        view.findViewById(R.id.view_top).setOnClickListener(new b());
    }
}
