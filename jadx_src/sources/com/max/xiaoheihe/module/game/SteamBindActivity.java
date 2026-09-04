package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.webkit.WebView;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.component.TitleBar;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.Resultx;
import com.max.xiaoheihe.bean.SteamNativeListObj;
import com.max.xiaoheihe.bean.account.steaminfo.DialogMsgObj;
import com.max.xiaoheihe.bean.account.steaminfo.SteamPublicSettingObj;
import com.max.xiaoheihe.bean.mall.cart.MallOrderNotifyObj;
import com.max.xiaoheihe.bean.proxy.ProxyAddressObj;
import com.max.xiaoheihe.bean.webintercept.IpDirectObj;
import com.max.xiaoheihe.bean.webintercept.TagJsObj;
import com.max.xiaoheihe.module.mall.ProxyType;
import com.max.xiaoheihe.module.voice.HeyboxMicFragment;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: SteamBindActivity.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@com.max.hbcommon.base.hblifeevent.activity.b(lifeEvents = {com.max.xiaoheihe.module.proxy.a.class})
public final class SteamBindActivity extends BaseActivity {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @dl.d
    public static final a f85379a0 = new a(null);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f85380b0 = 8;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @dl.d
    public static final String f85381c0 = "bind";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @dl.d
    public static final String f85382p1 = "proxy_type";

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @dl.d
    public static final String f85383x1 = "/account/steam/bind/success";

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    @dl.d
    public static final String f85384y1 = "/account/steam/bind/failed";
    private WebviewFragment L;

    @dl.e
    private String M;

    @dl.e
    private String N;

    @dl.e
    private MallOrderNotifyObj O;

    @dl.e
    private String P;

    @dl.e
    private String Q;

    @dl.e
    private String R;

    @dl.e
    private String S;

    @dl.e
    private HashMap<String, String> T;

    @dl.e
    private ArrayList<TagJsObj> U;
    private boolean V;
    private boolean W;
    private boolean X = true;
    private boolean Y = true;

    @dl.e
    private ProxyType Z;

    /* JADX INFO: compiled from: SteamBindActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public static /* synthetic */ Intent b(a aVar, Context context, String str, ProxyType proxyType, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, context, str, proxyType, new Integer(i10), obj}, null, changeQuickRedirect, true, 35152, new Class[]{a.class, Context.class, String.class, ProxyType.class, Integer.TYPE, Object.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            if ((i10 & 2) != 0) {
                str = "1";
            }
            return aVar.a(context, str, proxyType);
        }

        @dl.d
        @xh.m
        public final Intent a(@dl.d Context context, @dl.e String str, @dl.e ProxyType proxyType) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, proxyType}, this, changeQuickRedirect, false, 35151, new Class[]{Context.class, String.class, ProxyType.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) SteamBindActivity.class);
            intent.putExtra("bind", str);
            intent.putExtra("proxy_type", proxyType);
            return intent;
        }
    }

    /* JADX INFO: compiled from: SteamBindActivity.kt */
    public static final class b extends com.max.hbcommon.network.d<Resultx<SteamNativeListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SteamPublicSettingObj f85386c;

        /* JADX INFO: compiled from: SteamBindActivity.kt */
        public static final class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ SteamBindActivity f85387b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ SteamPublicSettingObj f85388c;

            a(SteamBindActivity steamBindActivity, SteamPublicSettingObj steamPublicSettingObj) {
                this.f85387b = steamBindActivity;
                this.f85388c = steamPublicSettingObj;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 35157, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
                com.max.xiaoheihe.module.account.utils.l.z(((BaseActivity) this.f85387b).f66601b, this.f85388c, true);
            }
        }

        b(SteamPublicSettingObj steamPublicSettingObj) {
            this.f85386c = steamPublicSettingObj;
        }

        public void a(@dl.d Resultx<SteamNativeListObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 35155, new Class[]{Resultx.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (SteamBindActivity.this.isActive()) {
                SteamNativeListObj response = result.getResponse();
                if ((response != null ? response.getGame_count() : null) != null || this.f85386c.getTask_info() == null || this.f85386c.getTask_info().getTask_message() == null) {
                    return;
                }
                DialogMsgObj task_message = this.f85386c.getTask_info().getTask_message();
                com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(((BaseActivity) SteamBindActivity.this).f66601b);
                fVar.y(task_message.getTitle());
                fVar.l(task_message.getDesc());
                com.max.hbcommon.view.a aVarD = fVar.d();
                aVarD.u(task_message.getButton(), new a(SteamBindActivity.this, this.f85386c));
                aVarD.show();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35153, new Class[0], Void.TYPE).isSupported && SteamBindActivity.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 35154, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (SteamBindActivity.this.isActive()) {
                super.onError(e10);
                e10.printStackTrace();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35156, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((Resultx) obj);
        }
    }

    /* JADX INFO: compiled from: SteamBindActivity.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<SteamPublicSettingObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35158, new Class[0], Void.TYPE).isSupported && SteamBindActivity.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 35159, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (SteamBindActivity.this.isActive()) {
                super.onError(e10);
                e10.printStackTrace();
            }
        }

        public void onNext(@dl.d Result<SteamPublicSettingObj> stringResult) {
            if (PatchProxy.proxy(new Object[]{stringResult}, this, changeQuickRedirect, false, 35160, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(stringResult, "stringResult");
            if (SteamBindActivity.this.isActive() && stringResult.getResult() != null) {
                SteamPublicSettingObj result = stringResult.getResult();
                kotlin.jvm.internal.f0.m(result);
                if (com.max.hbcommon.utils.c.u(result.getGames_url())) {
                    return;
                }
                SteamBindActivity steamBindActivity = SteamBindActivity.this;
                SteamPublicSettingObj result2 = stringResult.getResult();
                kotlin.jvm.internal.f0.m(result2);
                SteamBindActivity.M1(steamBindActivity, result2);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35161, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SteamPublicSettingObj>) obj);
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.SteamBindActivity$onDestroy$1, reason: invalid class name */
    /* JADX INFO: compiled from: SteamBindActivity.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.SteamBindActivity$onDestroy$1", f = "SteamBindActivity.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f85393b;

        AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 35169, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super kotlin.b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 35171, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 35170, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35168, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f85393b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                this.f85393b = 1;
                if (DelayKt.b(600L, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            com.max.xiaoheihe.view.l.E("bind_steam");
            return kotlin.b2.f124493a;
        }
    }

    public static final /* synthetic */ void M1(SteamBindActivity steamBindActivity, SteamPublicSettingObj steamPublicSettingObj) {
        if (PatchProxy.proxy(new Object[]{steamBindActivity, steamPublicSettingObj}, null, changeQuickRedirect, true, 35150, new Class[]{SteamBindActivity.class, SteamPublicSettingObj.class}, Void.TYPE).isSupported) {
            return;
        }
        steamBindActivity.X1(steamPublicSettingObj);
    }

    public static final /* synthetic */ void R1(SteamBindActivity steamBindActivity) {
        if (PatchProxy.proxy(new Object[]{steamBindActivity}, null, changeQuickRedirect, true, 35148, new Class[]{SteamBindActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamBindActivity.Z1();
    }

    public static final /* synthetic */ void V1(SteamBindActivity steamBindActivity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{steamBindActivity, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 35149, new Class[]{SteamBindActivity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        steamBindActivity.b2(z10);
    }

    private final void X1(SteamPublicSettingObj steamPublicSettingObj) {
        if (PatchProxy.proxy(new Object[]{steamPublicSettingObj}, this, changeQuickRedirect, false, 35145, new Class[]{SteamPublicSettingObj.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.b(false).d6(steamPublicSettingObj.getGames_url()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(steamPublicSettingObj)));
    }

    @dl.d
    @xh.m
    public static final Intent Y1(@dl.d Context context, @dl.e String str, @dl.e ProxyType proxyType) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, proxyType}, null, changeQuickRedirect, true, 35147, new Class[]{Context.class, String.class, ProxyType.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : f85379a0.a(context, str, proxyType);
    }

    private final void Z1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35144, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().y5().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private final void a2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35143, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        androidx.fragment.app.p0 p0VarU = getSupportFragmentManager().u();
        kotlin.jvm.internal.f0.o(p0VarU, "supportFragmentManager\n …      .beginTransaction()");
        WebviewFragment webviewFragment = null;
        com.max.xiaoheihe.module.webview.u uVarL = new com.max.xiaoheihe.module.webview.u(this.M).f(-1).u(false).t(new ProxyAddressObj(this.Q, this.R)).j(false).n(false).y(null).l(new IpDirectObj(this.T, this.U));
        if (this.V) {
            uVarL.v(true);
        }
        WebviewFragment webviewFragmentA = uVarL.a();
        this.L = webviewFragmentA;
        if (webviewFragmentA == null) {
            kotlin.jvm.internal.f0.S("mWebviewFragment");
            webviewFragmentA = null;
        }
        webviewFragmentA.O7(this.S);
        WebviewFragment webviewFragment2 = this.L;
        if (webviewFragment2 == null) {
            kotlin.jvm.internal.f0.S("mWebviewFragment");
            webviewFragment2 = null;
        }
        webviewFragment2.Y7(new WebviewFragment.o0() { // from class: com.max.xiaoheihe.module.game.SteamBindActivity$initWebFragment$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
            public void g(@dl.e WebView webView, @dl.e String str, int i10, int i11) {
                Object[] objArr = {webView, str, new Integer(i10), new Integer(i11)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 35163, new Class[]{WebView.class, String.class, cls, cls}, Void.TYPE).isSupported) {
                    return;
                }
                super.g(webView, str, i10, i11);
                if (i11 - 1 != 0 || str == null) {
                    return;
                }
                SteamBindActivity steamBindActivity = this.f85390a;
                if (steamBindActivity.W) {
                    return;
                }
                if (StringsKt__StringsKt.W2(str, "/openid/steam/hey_box_login_for_android_complete", false, 2, null) || StringsKt__StringsKt.W2(str, "/account/third_login/steam/bind_callback", false, 2, null)) {
                    steamBindActivity.W = true;
                    if (!steamBindActivity.Y) {
                        kotlinx.coroutines.k.f(kotlinx.coroutines.r0.a(kotlinx.coroutines.e1.e()), null, null, new SteamBindActivity$initWebFragment$1$onPageFinished$1$1(steamBindActivity, null), 3, null);
                    }
                    SteamBindActivity.V1(steamBindActivity, true);
                    com.max.xiaoheihe.utils.d.y1(((BaseActivity) steamBindActivity).f66601b, lb.a.f131062w0);
                }
            }

            @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
            public void o(@dl.d WebView view, @dl.d String receivedTitle) {
                if (PatchProxy.proxy(new Object[]{view, receivedTitle}, this, changeQuickRedirect, false, 35162, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(view, "view");
                kotlin.jvm.internal.f0.p(receivedTitle, "receivedTitle");
                if (com.max.xiaoheihe.utils.l0.i0(view.getUrl(), receivedTitle) && ((BaseActivity) this.f85390a).f66616q != null && ((BaseActivity) this.f85390a).f66616q.getVisibility() == 0) {
                    ((BaseActivity) this.f85390a).f66616q.setTitle(receivedTitle);
                }
            }
        });
        WebviewFragment webviewFragment3 = this.L;
        if (webviewFragment3 == null) {
            kotlin.jvm.internal.f0.S("mWebviewFragment");
            webviewFragment3 = null;
        }
        p0VarU.z(R.id.fragment_container, webviewFragment3, "");
        WebviewFragment webviewFragment4 = this.L;
        if (webviewFragment4 == null) {
            kotlin.jvm.internal.f0.S("mWebviewFragment");
        } else {
            webviewFragment = webviewFragment4;
        }
        p0VarU.P(webviewFragment);
        p0VarU.n();
        getSupportFragmentManager().n0();
    }

    private final void b2(boolean z10) {
        if (!PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 35146, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported && this.X) {
            String str = z10 ? f85383x1 : f85384y1;
            JsonObject jsonObject = new JsonObject();
            ProxyType proxyType = this.Z;
            if (proxyType != null) {
                jsonObject.addProperty(WebviewFragment.A4, proxyType != null ? Integer.valueOf(proxyType.getValue()) : null);
            }
            kotlin.b2 b2Var = kotlin.b2.f124493a;
            com.max.hbcommon.analytics.d.d("3", str, null, jsonObject);
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35141, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.k1();
        setContentView(R.layout.layout_sample_fragment_container);
        TitleBar titleBar = this.f66616q;
        Intent intent = getIntent();
        titleBar.setTitle(intent != null ? intent.getStringExtra("title") : null);
        this.f66616q.a0();
        if (getIntent() != null) {
            this.M = getIntent().getStringExtra("pageurl");
            this.S = getIntent().getStringExtra(WebviewFragment.f94379z4);
            this.N = getIntent().getStringExtra("message");
            this.O = (MallOrderNotifyObj) getIntent().getSerializableExtra(WebviewFragment.f94376w4);
            this.P = getIntent().getStringExtra("title");
            this.Q = getIntent().getStringExtra("host");
            this.R = getIntent().getStringExtra(HeyboxMicFragment.f93763y);
            this.T = (HashMap) getIntent().getSerializableExtra("hosts");
            this.U = (ArrayList) getIntent().getSerializableExtra(WebviewFragment.K4);
            this.V = getIntent().getBooleanExtra(WebviewFragment.N4, false);
            this.X = com.max.hbcommon.utils.c.A(getIntent().getStringExtra("bind"));
            this.Y = getIntent().getBooleanExtra("bind_game", false);
            this.Z = (ProxyType) getIntent().getSerializableExtra("proxy_type");
        }
        a2();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35142, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        Intent intent = getIntent();
        if (com.max.hbcommon.utils.c.u(intent != null ? intent.getStringExtra(com.max.xiaoheihe.module.proxy.a.f91563d) : null) && this.X && !this.W) {
            b2(false);
            kotlinx.coroutines.k.f(kotlinx.coroutines.r0.a(kotlinx.coroutines.e1.e()), null, null, new AnonymousClass1(null), 3, null);
        }
    }
}
