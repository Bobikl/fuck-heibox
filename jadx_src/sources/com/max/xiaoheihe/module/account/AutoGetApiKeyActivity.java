package com.max.xiaoheihe.module.account;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.EncryptionParamsObj;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.bean.account.steaminfo.SteamApiKeySettingObj;
import com.max.xiaoheihe.bean.game.SteamAcceptGameParams;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.message.common.inter.ITagManager;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import kotlin.text.Regex;

/* JADX INFO: compiled from: AutoGetApiKeyActivity.kt */
/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class AutoGetApiKeyActivity extends BaseActivity {

    @dl.d
    public static final b P = new b(null);
    public static final int Q = 8;

    @dl.d
    private static final String R = "params";

    @dl.d
    private static final String S = "api_key";
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private SteamApiKeySettingObj L;

    @dl.e
    private LoadingDialog M;

    @dl.e
    private String N;

    @dl.d
    private final a O = new a(this);

    /* JADX INFO: compiled from: AutoGetApiKeyActivity.kt */
    public static final class a extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final WeakReference<AutoGetApiKeyActivity> f77488a;

        public a(@dl.d AutoGetApiKeyActivity activity) {
            kotlin.jvm.internal.f0.p(activity, "activity");
            this.f77488a = new WeakReference<>(activity);
        }

        @Override // android.os.Handler
        public void handleMessage(@dl.d Message msg) {
            if (PatchProxy.proxy(new Object[]{msg}, this, changeQuickRedirect, false, 22428, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(msg, "msg");
            super.handleMessage(msg);
            AutoGetApiKeyActivity autoGetApiKeyActivity = this.f77488a.get();
            if (autoGetApiKeyActivity != null) {
                autoGetApiKeyActivity.h2();
            }
        }
    }

    /* JADX INFO: compiled from: AutoGetApiKeyActivity.kt */
    public static final class b {
        public static ChangeQuickRedirect changeQuickRedirect;

        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22430, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : AutoGetApiKeyActivity.S;
        }

        @dl.d
        public final String b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22429, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : AutoGetApiKeyActivity.R;
        }

        @dl.d
        public final Intent c(@dl.e Context context, @dl.d SteamApiKeySettingObj params) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, params}, this, changeQuickRedirect, false, 22431, new Class[]{Context.class, SteamApiKeySettingObj.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(params, "params");
            Intent intent = new Intent(context, (Class<?>) AutoGetApiKeyActivity.class);
            intent.putExtra(b(), params);
            return intent;
        }
    }

    /* JADX INFO: compiled from: AutoGetApiKeyActivity.kt */
    public static final class c extends WebviewFragment.o0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void b(@dl.d WebProtocolObj webProtocolObj) {
            if (PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 22434, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(webProtocolObj, "webProtocolObj");
            if (kotlin.jvm.internal.f0.g(WebProtocolObj.PROTOCOL_TYPE_STEAM_CALLBACK, webProtocolObj.getProtocol_type())) {
                String strValueOf = webProtocolObj.valueOf("type");
                String strValueOf2 = webProtocolObj.valueOf("state");
                AutoGetApiKeyActivity.T1(AutoGetApiKeyActivity.this);
                if (kotlin.jvm.internal.f0.g(ITagManager.SUCCESS, strValueOf2)) {
                    AutoGetApiKeyActivity.this.b2(webProtocolObj.valueOf("key"));
                    AutoGetApiKeyActivity.X1(AutoGetApiKeyActivity.this);
                } else {
                    AutoGetApiKeyActivity.V1(AutoGetApiKeyActivity.this);
                }
                com.max.heybox.hblog.g.f74531b.M("AutoGetApiKeyActivity onExecuteWebProtocol type==" + strValueOf + "  state ==" + strValueOf2 + " apiKey=" + AutoGetApiKeyActivity.this.Z1());
            }
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void g(@dl.d WebView view, @dl.d String url, int i10, int i11) {
            SteamApiKeySettingObj steamApiKeySettingObj;
            SteamAcceptGameParams data;
            SteamAcceptGameParams data2;
            boolean z10 = false;
            Object[] objArr = {view, url, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 22433, new Class[]{WebView.class, String.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(view, "view");
            kotlin.jvm.internal.f0.p(url, "url");
            com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AutoGetApiKeyActivity onPageFinished running: ");
            sb2.append(i11);
            sb2.append("  regular: ");
            SteamApiKeySettingObj steamApiKeySettingObj2 = AutoGetApiKeyActivity.this.L;
            sb2.append((steamApiKeySettingObj2 == null || (data2 = steamApiKeySettingObj2.getData()) == null) ? null : data2.getRegular());
            sb2.append("  url: ");
            sb2.append(url);
            aVar.M(sb2.toString());
            if (i11 - 1 != 0 || (steamApiKeySettingObj = AutoGetApiKeyActivity.this.L) == null || (data = steamApiKeySettingObj.getData()) == null) {
                return;
            }
            AutoGetApiKeyActivity autoGetApiKeyActivity = AutoGetApiKeyActivity.this;
            String regular = data.getRegular();
            if (regular != null && new Regex(regular).b(url)) {
                z10 = true;
            }
            if (z10) {
                AutoGetApiKeyActivity.W1(autoGetApiKeyActivity);
                EncryptionParamsObj js = data.getJs();
                kotlin.jvm.internal.f0.o(js, "jsparams.js");
                String js2 = com.max.hbcommon.utils.e.c(js.getP1(), com.max.xiaoheihe.utils.w.c(js.getP3()));
                String strA1 = com.max.xiaoheihe.utils.d.a1(js2);
                if (kotlin.jvm.internal.f0.g(strA1, js.getP2())) {
                    kotlin.jvm.internal.f0.o(js2, "js");
                    AutoGetApiKeyActivity.M1(autoGetApiKeyActivity, js2);
                }
                aVar.M("AutoGetApiKeyActivity onPageFinished md5js: " + strA1 + "  p2: " + js.getP2() + "  url: " + url + "  js: " + js2);
            }
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void o(@dl.d WebView view, @dl.d String receivedTitle) {
            if (PatchProxy.proxy(new Object[]{view, receivedTitle}, this, changeQuickRedirect, false, 22432, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(view, "view");
            kotlin.jvm.internal.f0.p(receivedTitle, "receivedTitle");
            if (com.max.hbcommon.utils.c.u(receivedTitle) || ((BaseActivity) AutoGetApiKeyActivity.this).f66616q == null || ((BaseActivity) AutoGetApiKeyActivity.this).f66616q.getVisibility() != 0) {
                return;
            }
            if (kotlin.text.u.L1("about:blank", receivedTitle, true)) {
                receivedTitle = AutoGetApiKeyActivity.this.getString(R.string.loading);
            }
            ((BaseActivity) AutoGetApiKeyActivity.this).f66616q.setTitle(receivedTitle);
        }
    }

    /* JADX INFO: compiled from: AutoGetApiKeyActivity.kt */
    public static final class d implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 22435, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            AutoGetApiKeyActivity.this.finish();
        }
    }

    /* JADX INFO: compiled from: AutoGetApiKeyActivity.kt */
    public static final class e implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 22436, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            AutoGetApiKeyActivity.this.setResult(-1, new Intent().putExtra(AutoGetApiKeyActivity.P.a(), AutoGetApiKeyActivity.this.Z1()));
            AutoGetApiKeyActivity.this.finish();
        }
    }

    public static final /* synthetic */ void M1(AutoGetApiKeyActivity autoGetApiKeyActivity, String str) {
        if (PatchProxy.proxy(new Object[]{autoGetApiKeyActivity, str}, null, changeQuickRedirect, true, 22427, new Class[]{AutoGetApiKeyActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        autoGetApiKeyActivity.Y1(str);
    }

    public static final /* synthetic */ void T1(AutoGetApiKeyActivity autoGetApiKeyActivity) {
        if (PatchProxy.proxy(new Object[]{autoGetApiKeyActivity}, null, changeQuickRedirect, true, 22423, new Class[]{AutoGetApiKeyActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        autoGetApiKeyActivity.a2();
    }

    public static final /* synthetic */ void V1(AutoGetApiKeyActivity autoGetApiKeyActivity) {
        if (PatchProxy.proxy(new Object[]{autoGetApiKeyActivity}, null, changeQuickRedirect, true, 22425, new Class[]{AutoGetApiKeyActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        autoGetApiKeyActivity.e2();
    }

    public static final /* synthetic */ void W1(AutoGetApiKeyActivity autoGetApiKeyActivity) {
        if (PatchProxy.proxy(new Object[]{autoGetApiKeyActivity}, null, changeQuickRedirect, true, 22426, new Class[]{AutoGetApiKeyActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        autoGetApiKeyActivity.showLoadingDialog();
    }

    public static final /* synthetic */ void X1(AutoGetApiKeyActivity autoGetApiKeyActivity) {
        if (PatchProxy.proxy(new Object[]{autoGetApiKeyActivity}, null, changeQuickRedirect, true, 22424, new Class[]{AutoGetApiKeyActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        autoGetApiKeyActivity.f2();
    }

    private final void Y1(String str) {
        WebviewFragment webviewFragment;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 22418, new Class[]{String.class}, Void.TYPE).isSupported || (webviewFragment = (WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            return;
        }
        webviewFragment.H6(str, null);
    }

    private final void a2() {
        LoadingDialog loadingDialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22417, new Class[0], Void.TYPE).isSupported || this.f66601b.isFinishing() || (loadingDialog = this.M) == null) {
            return;
        }
        loadingDialog.c();
    }

    private final void c2(WebviewFragment webviewFragment) {
        if (PatchProxy.proxy(new Object[]{webviewFragment}, this, changeQuickRedirect, false, 22415, new Class[]{WebviewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        webviewFragment.Y7(new c());
    }

    private final void e2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22420, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.O.removeCallbacksAndMessages(null);
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(this.f66601b);
        fVar.y("获取API Key失败,请手动操作").u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new d()).g(false);
        fVar.F();
    }

    private final void f2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22419, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.O.removeCallbacksAndMessages(null);
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(this.f66601b);
        fVar.y("获取API Key成功!").u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new e()).g(false);
        fVar.F();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    private final void showLoadingDialog() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22416, new Class[0], Void.TYPE).isSupported || this.f66601b.isFinishing()) {
            return;
        }
        LoadingDialog loadingDialog = this.M;
        if (loadingDialog != null) {
            kotlin.jvm.internal.f0.m(loadingDialog);
            if (!loadingDialog.i()) {
                Activity mContext = this.f66601b;
                kotlin.jvm.internal.f0.o(mContext, "mContext");
                this.M = new LoadingDialog(mContext, "自动获取中", false);
            }
        } else {
            Activity mContext2 = this.f66601b;
            kotlin.jvm.internal.f0.o(mContext2, "mContext");
            this.M = new LoadingDialog(mContext2, "自动获取中", false);
        }
        LoadingDialog loadingDialog2 = this.M;
        if (loadingDialog2 != null) {
            loadingDialog2.r();
        }
    }

    @dl.e
    public final String Z1() {
        return this.N;
    }

    public final void b2(@dl.e String str) {
        this.N = str;
    }

    public final void h2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22421, new Class[0], Void.TYPE).isSupported || this.f66601b.isFinishing()) {
            return;
        }
        a2();
        com.max.hbutils.utils.c.d("自动处理失败,请手动操作");
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22414, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_fragment_container);
        this.f66616q.setTitle("登录Steam");
        Z0().setBackgroundColor(com.max.xiaoheihe.utils.d.E(R.color.white));
        Serializable serializableExtra = getIntent().getSerializableExtra(R);
        kotlin.jvm.internal.f0.n(serializableExtra, "null cannot be cast to non-null type com.max.xiaoheihe.bean.account.steaminfo.SteamApiKeySettingObj");
        SteamApiKeySettingObj steamApiKeySettingObj = (SteamApiKeySettingObj) serializableExtra;
        this.L = steamApiKeySettingObj;
        if (steamApiKeySettingObj != null) {
            SteamAcceptGameParams data = steamApiKeySettingObj.getData();
            String url = data != null ? data.getUrl() : null;
            Fragment fragmentR0 = getSupportFragmentManager().r0(R.id.fragment_container);
            if (fragmentR0 == null) {
                WebviewFragment webviewFragmentU7 = WebviewFragment.u7(url);
                c2(webviewFragmentU7);
                getSupportFragmentManager().u().y(R.id.fragment_container, webviewFragmentU7).n();
            } else {
                ((WebviewFragment) fragmentR0).t7(url);
            }
            this.O.sendEmptyMessageDelayed(0, 40000L);
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22422, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.O.removeCallbacksAndMessages(null);
        super.onDestroy();
    }
}
