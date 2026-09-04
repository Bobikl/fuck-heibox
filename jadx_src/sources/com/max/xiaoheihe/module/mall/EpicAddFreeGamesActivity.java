package com.max.xiaoheihe.module.mall;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.app.o0;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.gson.JsonObject;
import com.jd.jdcache.JDCache;
import com.jd.jdcache.JDCacheLoader;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.PostEncryptParamsObj;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcustomview.ProgressBgView;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.EpicAddFreeGameObj;
import com.max.xiaoheihe.bean.game.SteamAcceptGameParams;
import com.max.xiaoheihe.bean.mall.SteamWalletJsObj;
import com.max.xiaoheihe.module.account.AliVerifyDialogActivity;
import com.max.xiaoheihe.module.trade.TradeInfoUtilKt;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.max.xiaoheihe.module.webview.u;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.message.common.inter.ITagManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class EpicAddFreeGamesActivity extends BaseActivity {
    private static final int G2 = 1;
    private static final int G3 = 60;
    private static final long J3 = 1000;
    public static final String K3 = "status_not_activate";
    public static final String L3 = "status_activating";
    public static final String M3 = "status_show_cancel";
    public static final String N3 = "status_login";
    public static final String O3 = "status_all_activate_succeed";
    public static final String P3 = "status_all_activate_failed";
    public static final int Q3 = 1;
    public static final int R3 = 2;
    public static final int S3 = 3;
    public static final int T3 = 4;
    public static final int U3 = 0;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final String f89423p2 = "bundle";

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final int f89424p3 = 2;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private static final String f89425x1 = "ids";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f89426x2 = "game";

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private static final String f89427y1 = "ARG_USE_WEB_PACK";

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static final int f89428y2 = 0;
    ProgressBar L;
    TextView M;
    TextView N;
    ProgressBgView O;
    BottomButtonLeftItemView P;
    ViewGroup Q;
    private String R;
    private List<EpicAddFreeGameObj> S;
    private int U;
    private SteamWalletJsObj V;
    private String W;
    private Dialog X;
    private int Y;
    private int Z;

    @BindView(R.id.progress)
    View mProgressView;

    @BindView(R.id.tv_status)
    TextView mStatusTextView;
    private int T = -1;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final l f89429a0 = new l(this);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private List<String> f89430b0 = new ArrayList();

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f89431c0 = false;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f89432p1 = false;

    public class a implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 39848, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            EpicAddFreeGamesActivity.this.finish();
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 39849, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.O(((BaseActivity) EpicAddFreeGamesActivity.this).f66601b, "epic_bind", null).A();
            dialogInterface.dismiss();
            EpicAddFreeGamesActivity.this.finish();
        }
    }

    public class c extends WebviewFragment.o0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void g(WebView webView, String str, int i10, int i11) {
            Object[] objArr = {webView, str, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 39847, new Class[]{WebView.class, String.class, cls, cls}, Void.TYPE).isSupported || EpicAddFreeGamesActivity.this.f89431c0 || i11 - 1 != 0) {
                return;
            }
            String strR2 = EpicAddFreeGamesActivity.r2(EpicAddFreeGamesActivity.this);
            if (strR2 != null && str.matches(strR2)) {
                EpicAddFreeGamesActivity.x2(EpicAddFreeGamesActivity.this);
                EpicAddFreeGamesActivity.this.f89429a0.sendEmptyMessageDelayed(0, 1000L);
            } else if (str.contains("/login")) {
                EpicAddFreeGamesActivity.this.W = "status_login";
                EpicAddFreeGamesActivity.O1(EpicAddFreeGamesActivity.this);
                if (EpicAddFreeGamesActivity.this.V != null && EpicAddFreeGamesActivity.this.V.getRemember_js() != null) {
                    EpicAddFreeGamesActivity epicAddFreeGamesActivity = EpicAddFreeGamesActivity.this;
                    EpicAddFreeGamesActivity.T1(epicAddFreeGamesActivity, com.max.xiaoheihe.utils.d.v(epicAddFreeGamesActivity.V.getRemember_js().getJs()), null);
                }
            }
            EpicAddFreeGamesActivity.v2(EpicAddFreeGamesActivity.this, null);
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void i(WebView webView, String str, int i10, int i11) {
            Object[] objArr = {webView, str, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 39846, new Class[]{WebView.class, String.class, cls, cls}, Void.TYPE).isSupported || EpicAddFreeGamesActivity.this.f89431c0) {
                return;
            }
            String strR2 = EpicAddFreeGamesActivity.r2(EpicAddFreeGamesActivity.this);
            if (strR2 != null && str.matches(strR2)) {
                EpicAddFreeGamesActivity.u2(EpicAddFreeGamesActivity.this);
            }
            EpicAddFreeGamesActivity.v2(EpicAddFreeGamesActivity.this, null);
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void o(WebView webView, String str) {
            if (PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 39845, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(str) || ((BaseActivity) EpicAddFreeGamesActivity.this).f66616q == null || ((BaseActivity) EpicAddFreeGamesActivity.this).f66616q.getVisibility() != 0) {
                return;
            }
            if ("about:blank".equalsIgnoreCase(str)) {
                str = EpicAddFreeGamesActivity.this.getString(R.string.loading);
            }
            ((BaseActivity) EpicAddFreeGamesActivity.this).f66616q.setTitle(str);
        }
    }

    public class d implements ValueCallback<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        public void a(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 39850, new Class[]{String.class}, Void.TYPE).isSupported || EpicAddFreeGamesActivity.this.f89431c0) {
                return;
            }
            com.max.hbcommon.utils.d.b("zzzzepic", "tryInitialOrder onReceiveValue ==" + str);
            String strW = l0.w(str);
            if (SteamStoreLoginActivity.f89907b0.equals(strW)) {
                EpicAddFreeGamesActivity.O1(EpicAddFreeGamesActivity.this);
                return;
            }
            if (ITagManager.SUCCESS.equals(strW)) {
                EpicAddFreeGamesActivity.this.f89429a0.sendEmptyMessageDelayed(1, 1000L);
                return;
            }
            if (!"repeat".equals(strW) && strW != null) {
                if (com.heybox.imageviewer.l.f59758c.equals(strW)) {
                    EpicAddFreeGamesActivity.O1(EpicAddFreeGamesActivity.this);
                    return;
                }
                if ("您已拥有该游戏".equals(strW)) {
                    EpicAddFreeGamesActivity.this.f89432p1 = true;
                }
                EpicAddFreeGamesActivity.this.f89429a0.removeMessages(0);
                EpicAddFreeGamesActivity.b2(EpicAddFreeGamesActivity.this, strW);
                return;
            }
            if (EpicAddFreeGamesActivity.this.Y < 60) {
                EpicAddFreeGamesActivity.this.f89429a0.sendEmptyMessageDelayed(0, 1000L);
                EpicAddFreeGamesActivity.W1(EpicAddFreeGamesActivity.this);
                return;
            }
            EpicAddFreeGamesActivity.this.f89429a0.removeMessages(0);
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(EpicAddFreeGamesActivity.this.getString(R.string.receive_failed));
            EpicAddFreeGamesActivity epicAddFreeGamesActivity = EpicAddFreeGamesActivity.this;
            EpicAddFreeGamesActivity.Z1(epicAddFreeGamesActivity, ((EpicAddFreeGameObj) epicAddFreeGamesActivity.S.get(EpicAddFreeGamesActivity.this.T)).getAppid(), 2, null);
            EpicAddFreeGamesActivity.O1(EpicAddFreeGamesActivity.this);
        }

        @Override // android.webkit.ValueCallback
        public /* bridge */ /* synthetic */ void onReceiveValue(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 39851, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a(str);
        }
    }

    public class e implements ValueCallback<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        public void a(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 39852, new Class[]{String.class}, Void.TYPE).isSupported || EpicAddFreeGamesActivity.this.f89431c0) {
                return;
            }
            com.max.hbcommon.utils.d.b("zzzzepic", "trySubmitOrder onReceiveValue ==" + str);
            String strW = l0.w(str);
            if (ITagManager.SUCCESS.equals(strW)) {
                EpicAddFreeGamesActivity.this.f89432p1 = true;
                EpicAddFreeGamesActivity.e2(EpicAddFreeGamesActivity.this);
                if (EpicAddFreeGamesActivity.this.S == null || EpicAddFreeGamesActivity.this.U != EpicAddFreeGamesActivity.this.S.size()) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(EpicAddFreeGamesActivity.this.getString(R.string.receive_succeed));
                } else {
                    EpicAddFreeGamesActivity.this.W = "status_all_activate_succeed";
                    EpicAddFreeGamesActivity epicAddFreeGamesActivity = EpicAddFreeGamesActivity.this;
                    EpicAddFreeGamesActivity.v2(epicAddFreeGamesActivity, epicAddFreeGamesActivity.getString(R.string.receive_succeed));
                }
                EpicAddFreeGamesActivity epicAddFreeGamesActivity2 = EpicAddFreeGamesActivity.this;
                EpicAddFreeGamesActivity.Z1(epicAddFreeGamesActivity2, ((EpicAddFreeGameObj) epicAddFreeGamesActivity2.S.get(EpicAddFreeGamesActivity.this.T)).getAppid(), 1, null);
                EpicAddFreeGamesActivity.h2(EpicAddFreeGamesActivity.this);
                return;
            }
            if (AliVerifyDialogActivity.f77461k.equals(strW)) {
                EpicAddFreeGamesActivity.O1(EpicAddFreeGamesActivity.this);
                EpicAddFreeGamesActivity.this.f89429a0.sendEmptyMessageDelayed(1, 1000L);
                return;
            }
            if ("order_click".equals(strW)) {
                EpicAddFreeGamesActivity.u2(EpicAddFreeGamesActivity.this);
                EpicAddFreeGamesActivity.this.f89429a0.sendEmptyMessageDelayed(1, 1000L);
                return;
            }
            if (!"repeat".equals(strW) && strW != null) {
                EpicAddFreeGamesActivity.this.f89429a0.removeMessages(1);
                EpicAddFreeGamesActivity.b2(EpicAddFreeGamesActivity.this, strW);
            } else {
                if (EpicAddFreeGamesActivity.this.Z < 60) {
                    EpicAddFreeGamesActivity.this.f89429a0.sendEmptyMessageDelayed(1, 1000L);
                    EpicAddFreeGamesActivity.j2(EpicAddFreeGamesActivity.this);
                    return;
                }
                EpicAddFreeGamesActivity.this.f89429a0.removeMessages(1);
                com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(EpicAddFreeGamesActivity.this.getString(R.string.receive_failed));
                EpicAddFreeGamesActivity.O1(EpicAddFreeGamesActivity.this);
                EpicAddFreeGamesActivity epicAddFreeGamesActivity3 = EpicAddFreeGamesActivity.this;
                EpicAddFreeGamesActivity.Z1(epicAddFreeGamesActivity3, ((EpicAddFreeGameObj) epicAddFreeGamesActivity3.S.get(EpicAddFreeGamesActivity.this.T)).getAppid(), 3, null);
            }
        }

        @Override // android.webkit.ValueCallback
        public /* bridge */ /* synthetic */ void onReceiveValue(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 39853, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a(str);
        }
    }

    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39854, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            EpicAddFreeGamesActivity.this.f89431c0 = true;
            EpicAddFreeGamesActivity epicAddFreeGamesActivity = EpicAddFreeGamesActivity.this;
            epicAddFreeGamesActivity.mStatusTextView.setText(epicAddFreeGamesActivity.getString(R.string.manual_get));
            EpicAddFreeGamesActivity.O1(EpicAddFreeGamesActivity.this);
        }
    }

    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39855, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            EpicAddFreeGamesActivity.O1(EpicAddFreeGamesActivity.this);
            if (com.max.hbcommon.utils.c.u(EpicAddFreeGamesActivity.this.V.getAddfreelicense_epic().getBind_id())) {
                EpicAddFreeGamesActivity.k2(EpicAddFreeGamesActivity.this);
            } else {
                EpicAddFreeGamesActivity.this.finish();
            }
        }
    }

    public class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39856, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            EpicAddFreeGamesActivity.O1(EpicAddFreeGamesActivity.this);
        }
    }

    public class i extends com.max.hbcommon.network.d<Result<SteamWalletJsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 39857, new Class[]{Throwable.class}, Void.TYPE).isSupported && EpicAddFreeGamesActivity.this.isActive()) {
                super.onError(th2);
                EpicAddFreeGamesActivity.this.mProgressView.setVisibility(8);
            }
        }

        public void onNext(Result<SteamWalletJsObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 39858, new Class[]{Result.class}, Void.TYPE).isSupported && EpicAddFreeGamesActivity.this.isActive()) {
                super.onNext(result);
                EpicAddFreeGamesActivity.this.mProgressView.setVisibility(8);
                EpicAddFreeGamesActivity.this.V = result.getResult();
                EpicAddFreeGamesActivity.h2(EpicAddFreeGamesActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39859, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SteamWalletJsObj>) obj);
        }
    }

    public class j implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39860, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.view.l.E("epic_add_free");
        }
    }

    public class k implements ValueCallback<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f89443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f89444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f89445c;

        k(String str, int i10, String str2) {
            this.f89443a = str;
            this.f89444b = i10;
            this.f89445c = str2;
        }

        public void a(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 39861, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            if (com.max.hbcommon.utils.c.u(str)) {
                EpicAddFreeGamesActivity.n2(EpicAddFreeGamesActivity.this, this.f89443a, this.f89444b, this.f89445c, null);
            } else {
                EpicAddFreeGamesActivity.n2(EpicAddFreeGamesActivity.this, this.f89443a, this.f89444b, this.f89445c, str.replaceAll("\"", ""));
            }
        }

        @Override // android.webkit.ValueCallback
        public /* bridge */ /* synthetic */ void onReceiveValue(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 39862, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a(str);
        }
    }

    public static class l extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<EpicAddFreeGamesActivity> f89447a;

        public l(EpicAddFreeGamesActivity epicAddFreeGamesActivity) {
            this.f89447a = new WeakReference<>(epicAddFreeGamesActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 39863, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            super.handleMessage(message);
            EpicAddFreeGamesActivity epicAddFreeGamesActivity = this.f89447a.get();
            if (epicAddFreeGamesActivity == null || !epicAddFreeGamesActivity.isActive() || message == null) {
                return;
            }
            int i10 = message.what;
            if (i10 == 0) {
                EpicAddFreeGamesActivity.l2(epicAddFreeGamesActivity);
            } else if (i10 == 1) {
                EpicAddFreeGamesActivity.m2(epicAddFreeGamesActivity);
            } else if (i10 == 2) {
                epicAddFreeGamesActivity.Q2();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    private void A2() {
        List<EpicAddFreeGameObj> list;
        String str;
        String str2;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39826, new Class[0], Void.TYPE).isSupported || (list = this.S) == null || this.T + 1 >= list.size()) {
            return;
        }
        this.T++;
        WebviewFragment webviewFragment = (WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container);
        SteamWalletJsObj steamWalletJsObj = this.V;
        if (steamWalletJsObj == null || webviewFragment == null) {
            return;
        }
        if (steamWalletJsObj.getSteam_proxy() == null || this.V.getSteam_proxy().getProxy() == null) {
            str = null;
            str2 = null;
        } else {
            String strV = com.max.xiaoheihe.utils.d.v(this.V.getSteam_proxy().getProxy());
            if (com.max.hbcommon.utils.c.u(strV)) {
                str = null;
                str2 = null;
            } else {
                String[] strArrSplit = strV.split(":");
                if (strArrSplit.length > 1) {
                    str2 = strArrSplit[0];
                    str = strArrSplit[1];
                } else {
                    str = null;
                    str2 = null;
                }
            }
        }
        if (!com.max.hbcommon.utils.c.u(str2) && !com.max.hbcommon.utils.c.u(str)) {
            webviewFragment.C7(str2, str);
        }
        String strD2 = D2();
        if (com.max.hbcommon.utils.c.u(strD2)) {
            return;
        }
        webviewFragment.t7(strD2);
        W2(this.S.get(this.T).getAppid(), 0, null, null);
    }

    private void B2(String str, ValueCallback<String> valueCallback) {
        WebviewFragment webviewFragment;
        if (PatchProxy.proxy(new Object[]{str, valueCallback}, this, changeQuickRedirect, false, 39823, new Class[]{String.class, ValueCallback.class}, Void.TYPE).isSupported || (webviewFragment = (WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            return;
        }
        webviewFragment.H6(str, valueCallback);
    }

    private String C2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39817, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (this.V == null) {
            return null;
        }
        EpicAddFreeGameObj epicAddFreeGameObj = this.S.get(this.T);
        SteamAcceptGameParams addfreelicense_epic = this.V.getAddfreelicense_epic();
        return "bundle".equals(epicAddFreeGameObj.getType()) ? addfreelicense_epic.getRegular_bundle() : addfreelicense_epic.getRegular();
    }

    private String D2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39818, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        SteamWalletJsObj steamWalletJsObj = this.V;
        if (steamWalletJsObj == null) {
            return null;
        }
        SteamAcceptGameParams addfreelicense_epic = steamWalletJsObj.getAddfreelicense_epic();
        EpicAddFreeGameObj epicAddFreeGameObj = this.S.get(this.T);
        return ("bundle".equals(epicAddFreeGameObj.getType()) ? addfreelicense_epic.getUrl_bundle() : addfreelicense_epic.getUrl()).replaceAll(addfreelicense_epic.getKey(), epicAddFreeGameObj.getName());
    }

    public static Intent E2(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 39812, new Class[]{Context.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) EpicAddFreeGamesActivity.class);
        intent.putExtra("ids", str);
        return intent;
    }

    public static Intent G2(Context context, String str, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 39813, new Class[]{Context.class, String.class, Boolean.TYPE}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) EpicAddFreeGamesActivity.class);
        intent.putExtra("ids", str);
        intent.putExtra(f89427y1, z10);
        return intent;
    }

    private void H2() {
        Dialog dialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39821, new Class[0], Void.TYPE).isSupported || this.f66601b.isFinishing() || (dialog = this.X) == null || !dialog.isShowing()) {
            return;
        }
        this.X.dismiss();
    }

    private void I2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39824, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mProgressView.setVisibility(0);
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().h7("addfreelicense_epic").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i()));
    }

    private void J2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 39825, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
        com.max.hbutils.utils.c.d(str);
        List<EpicAddFreeGameObj> list = this.S;
        if (list != null && this.T == list.size() - 1) {
            H2();
            if (this.f89432p1 && com.max.hbcommon.utils.c.u(this.V.getAddfreelicense_epic().getBind_id())) {
                P2();
            }
        }
        K2(this.S.get(this.T).getAppid(), 4, str);
        A2();
    }

    private void K2(String str, int i10, String str2) {
        if (PatchProxy.proxy(new Object[]{str, new Integer(i10), str2}, this, changeQuickRedirect, false, 39829, new Class[]{String.class, Integer.TYPE, String.class}, Void.TYPE).isSupported || this.f89430b0.contains(str)) {
            return;
        }
        this.f89430b0.add(str);
        B2("window.__epic_client_state.account.account.id;", new k(str, i10, str2));
    }

    private void L2() {
        int i10;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39827, new Class[0], Void.TYPE).isSupported && (i10 = this.T) >= 0 && i10 < this.S.size()) {
            B2("origin_name='" + this.S.get(this.T).getHome_name() + "'", null);
        }
    }

    static /* synthetic */ void O1(EpicAddFreeGamesActivity epicAddFreeGamesActivity) {
        if (PatchProxy.proxy(new Object[]{epicAddFreeGamesActivity}, null, changeQuickRedirect, true, 39836, new Class[]{EpicAddFreeGamesActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        epicAddFreeGamesActivity.H2();
    }

    private void O2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39820, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f66601b.isFinishing() && this.f89431c0) {
            return;
        }
        if (this.X == null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f66601b);
            View viewInflate = this.f66602c.inflate(R.layout.dialog_add_free_games, (ViewGroup) null, false);
            this.L = (ProgressBar) viewInflate.findViewById(R.id.pb_title);
            this.M = (TextView) viewInflate.findViewById(R.id.tv_title);
            this.N = (TextView) viewInflate.findViewById(R.id.tv_progress_0);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_progress_desc_0);
            this.O = (ProgressBgView) viewInflate.findViewById(R.id.pb_0);
            this.P = (BottomButtonLeftItemView) viewInflate.findViewById(R.id.vg_button_panel);
            this.Q = (ViewGroup) viewInflate.findViewById(R.id.vg_progress_desc_0);
            this.N.setText((CharSequence) null);
            textView.setText((CharSequence) null);
            AlertDialog alertDialogCreate = builder.setView(viewInflate).setCancelable(false).create();
            this.X = alertDialogCreate;
            Window window = alertDialogCreate.getWindow();
            if (window != null) {
                window.setBackgroundDrawableResource(android.R.color.transparent);
            }
        }
        if (!this.X.isShowing()) {
            this.X.show();
        }
        V2(null);
        this.f89429a0.removeMessages(2);
        this.f89429a0.sendEmptyMessageDelayed(2, SteamStoreAddFreeGamesActivity.G2);
    }

    private void P2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39831, new Class[0], Void.TYPE).isSupported || this.f66601b.isFinishing()) {
            return;
        }
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(this.f66601b);
        fVar.y("是否需要绑定该账户？").u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new b()).o(com.max.xiaoheihe.utils.d.n0(R.string.cancel), new a());
        fVar.F();
    }

    private void S2() {
        SteamWalletJsObj steamWalletJsObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39815, new Class[0], Void.TYPE).isSupported || !isActive() || (steamWalletJsObj = this.V) == null) {
            return;
        }
        this.W = "status_activating";
        B2(com.max.xiaoheihe.utils.d.v(steamWalletJsObj.getAddfreelicense_epic().getJs()), new d());
    }

    static /* synthetic */ void T1(EpicAddFreeGamesActivity epicAddFreeGamesActivity, String str, ValueCallback valueCallback) {
        if (PatchProxy.proxy(new Object[]{epicAddFreeGamesActivity, str, valueCallback}, null, changeQuickRedirect, true, 39837, new Class[]{EpicAddFreeGamesActivity.class, String.class, ValueCallback.class}, Void.TYPE).isSupported) {
            return;
        }
        epicAddFreeGamesActivity.B2(str, valueCallback);
    }

    private void T2() {
        SteamWalletJsObj steamWalletJsObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39816, new Class[0], Void.TYPE).isSupported || !isActive() || (steamWalletJsObj = this.V) == null) {
            return;
        }
        this.W = "status_activating";
        B2(com.max.xiaoheihe.utils.d.v(steamWalletJsObj.getSubmit_order_js().getJs()), new e());
    }

    private void V2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 39819, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if ("status_login".equals(this.W)) {
            this.mStatusTextView.setText(getString(R.string.login_epic_account));
        } else if ("status_not_activate".equals(this.W) || "status_activating".equals(this.W)) {
            this.mStatusTextView.setText(getString(R.string.receiving_please_wait));
        } else if ("status_all_activate_succeed".equals(this.W)) {
            this.mStatusTextView.setText(getString(R.string.receive_succeed));
        } else if ("status_all_activate_failed".equals(this.W)) {
            this.mStatusTextView.setText(getString(R.string.receive_failed));
        }
        Dialog dialog = this.X;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        if ("status_not_activate".equals(this.W) || "status_activating".equals(this.W) || "status_show_cancel".equals(this.W)) {
            this.L.setVisibility(0);
            this.M.setText(getString(R.string.receiving_please_wait));
            this.N.setText((CharSequence) null);
            this.Q.setVisibility(8);
            TradeInfoUtilKt.F(this.O);
            if (!"status_show_cancel".equals(this.W)) {
                this.P.setVisibility(8);
                return;
            }
            this.P.setVisibility(0);
            this.P.setRightText(this.f66601b.getResources().getText(R.string.manual_get));
            this.P.setRightClickListener(new f());
            return;
        }
        if ("status_all_activate_succeed".equals(this.W)) {
            this.L.setVisibility(8);
            this.M.setText(getString(R.string.receive_succeed));
            this.N.setText(str);
            this.N.setTextColor(getResources().getColor(R.color.text_primary_1_color));
            this.Q.setVisibility(0);
            this.O.setBackgroundResource(R.color.text_primary_1_color);
            this.O.c();
            this.P.setVisibility(0);
            this.P.setRightText(this.f66601b.getResources().getText(R.string.confirm));
            this.P.setRightClickListener(new g());
            return;
        }
        if ("status_all_activate_failed".equals(this.W)) {
            this.L.setVisibility(8);
            this.M.setText(getString(R.string.receive_failed));
            this.N.setText(str);
            this.N.setTextColor(getResources().getColor(R.color.badge_bg_color));
            this.Q.setVisibility(0);
            this.O.setBackground((AnimationDrawable) getResources().getDrawable(R.drawable.pb_loading_timeout));
            this.O.c();
            this.P.setVisibility(0);
            this.P.setRightText(this.f66601b.getResources().getText(R.string.confirm));
            this.P.setRightClickListener(new h());
        }
    }

    static /* synthetic */ int W1(EpicAddFreeGamesActivity epicAddFreeGamesActivity) {
        int i10 = epicAddFreeGamesActivity.Y;
        epicAddFreeGamesActivity.Y = i10 + 1;
        return i10;
    }

    private void W2(String str, int i10, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{str, new Integer(i10), str2, str3}, this, changeQuickRedirect, false, 39830, new Class[]{String.class, Integer.TYPE, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("appid", str);
        jsonObject.addProperty("result_type", Integer.valueOf(i10));
        if (!com.max.hbcommon.utils.c.u(str2)) {
            jsonObject.addProperty(o0.N0, str2);
        }
        if (!com.max.hbcommon.utils.c.u(str3)) {
            jsonObject.addProperty("epic_id", str3);
        }
        com.max.hbcommon.utils.d.b("zzzzepictest", jsonObject.toString());
        PostEncryptParamsObj postEncryptParamsObjU0 = com.max.xiaoheihe.utils.d.u0(com.max.hbutils.utils.k.q(jsonObject));
        com.max.xiaoheihe.network.i.a().K9("epic", postEncryptParamsObjU0.getData(), postEncryptParamsObjU0.getKey(), postEncryptParamsObjU0.getSid(), postEncryptParamsObjU0.getTime()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.p());
    }

    static /* synthetic */ void Z1(EpicAddFreeGamesActivity epicAddFreeGamesActivity, String str, int i10, String str2) {
        if (PatchProxy.proxy(new Object[]{epicAddFreeGamesActivity, str, new Integer(i10), str2}, null, changeQuickRedirect, true, 39838, new Class[]{EpicAddFreeGamesActivity.class, String.class, Integer.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        epicAddFreeGamesActivity.K2(str, i10, str2);
    }

    static /* synthetic */ void b2(EpicAddFreeGamesActivity epicAddFreeGamesActivity, String str) {
        if (PatchProxy.proxy(new Object[]{epicAddFreeGamesActivity, str}, null, changeQuickRedirect, true, 39839, new Class[]{EpicAddFreeGamesActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        epicAddFreeGamesActivity.J2(str);
    }

    static /* synthetic */ int e2(EpicAddFreeGamesActivity epicAddFreeGamesActivity) {
        int i10 = epicAddFreeGamesActivity.U;
        epicAddFreeGamesActivity.U = i10 + 1;
        return i10;
    }

    static /* synthetic */ void h2(EpicAddFreeGamesActivity epicAddFreeGamesActivity) {
        if (PatchProxy.proxy(new Object[]{epicAddFreeGamesActivity}, null, changeQuickRedirect, true, 39840, new Class[]{EpicAddFreeGamesActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        epicAddFreeGamesActivity.A2();
    }

    static /* synthetic */ int j2(EpicAddFreeGamesActivity epicAddFreeGamesActivity) {
        int i10 = epicAddFreeGamesActivity.Z;
        epicAddFreeGamesActivity.Z = i10 + 1;
        return i10;
    }

    static /* synthetic */ void k2(EpicAddFreeGamesActivity epicAddFreeGamesActivity) {
        if (PatchProxy.proxy(new Object[]{epicAddFreeGamesActivity}, null, changeQuickRedirect, true, 39841, new Class[]{EpicAddFreeGamesActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        epicAddFreeGamesActivity.P2();
    }

    static /* synthetic */ void l2(EpicAddFreeGamesActivity epicAddFreeGamesActivity) {
        if (PatchProxy.proxy(new Object[]{epicAddFreeGamesActivity}, null, changeQuickRedirect, true, 39842, new Class[]{EpicAddFreeGamesActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        epicAddFreeGamesActivity.S2();
    }

    static /* synthetic */ void m2(EpicAddFreeGamesActivity epicAddFreeGamesActivity) {
        if (PatchProxy.proxy(new Object[]{epicAddFreeGamesActivity}, null, changeQuickRedirect, true, 39843, new Class[]{EpicAddFreeGamesActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        epicAddFreeGamesActivity.T2();
    }

    static /* synthetic */ void n2(EpicAddFreeGamesActivity epicAddFreeGamesActivity, String str, int i10, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{epicAddFreeGamesActivity, str, new Integer(i10), str2, str3}, null, changeQuickRedirect, true, 39844, new Class[]{EpicAddFreeGamesActivity.class, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        epicAddFreeGamesActivity.W2(str, i10, str2, str3);
    }

    static /* synthetic */ String r2(EpicAddFreeGamesActivity epicAddFreeGamesActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{epicAddFreeGamesActivity}, null, changeQuickRedirect, true, 39832, new Class[]{EpicAddFreeGamesActivity.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : epicAddFreeGamesActivity.C2();
    }

    static /* synthetic */ void u2(EpicAddFreeGamesActivity epicAddFreeGamesActivity) {
        if (PatchProxy.proxy(new Object[]{epicAddFreeGamesActivity}, null, changeQuickRedirect, true, 39833, new Class[]{EpicAddFreeGamesActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        epicAddFreeGamesActivity.O2();
    }

    static /* synthetic */ void v2(EpicAddFreeGamesActivity epicAddFreeGamesActivity, String str) {
        if (PatchProxy.proxy(new Object[]{epicAddFreeGamesActivity, str}, null, changeQuickRedirect, true, 39834, new Class[]{EpicAddFreeGamesActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        epicAddFreeGamesActivity.V2(str);
    }

    static /* synthetic */ void x2(EpicAddFreeGamesActivity epicAddFreeGamesActivity) {
        if (PatchProxy.proxy(new Object[]{epicAddFreeGamesActivity}, null, changeQuickRedirect, true, 39835, new Class[]{EpicAddFreeGamesActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        epicAddFreeGamesActivity.L2();
    }

    public void Q2() {
        Dialog dialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39822, new Class[0], Void.TYPE).isSupported || (dialog = this.X) == null || !dialog.isShowing() || "status_all_activate_succeed".equals(this.W)) {
            return;
        }
        this.W = "status_show_cancel";
        V2(null);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39814, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_epic_add_free_games);
        ButterKnife.a(this);
        this.R = getIntent().getStringExtra("ids");
        boolean booleanExtra = getIntent().getBooleanExtra(f89427y1, false);
        this.S = com.max.hbutils.utils.k.b(this.R, EpicAddFreeGameObj.class);
        this.f66616q.setTitle(getString(R.string.loading));
        this.f66617r.setVisibility(0);
        this.W = "status_not_activate";
        WebviewFragment webviewFragment = (WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container);
        String key = null;
        if (booleanExtra) {
            com.max.hbcommon.utils.d.b("zzzzjdcache", "preloadUrl==https://www.epicgames.com/id/login");
            JDCacheLoader jDCacheLoaderCreateDefaultLoader = JDCache.INSTANCE.createDefaultLoader("https://www.epicgames.com/id/login", new String[]{"epic_add_free", com.max.xiaoheihe.module.webview.b.f94579d}, this);
            if (jDCacheLoaderCreateDefaultLoader != null) {
                key = jDCacheLoaderCreateDefaultLoader.getKey();
            }
        }
        if (webviewFragment == null) {
            WebviewFragment webviewFragmentA = new u("").v(true).C(key).a();
            webviewFragmentA.Y7(new c());
            getSupportFragmentManager().u().b(R.id.fragment_container, webviewFragmentA).m();
        }
        I2();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39828, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f89429a0.removeCallbacksAndMessages(null);
        H2();
        if (!this.f89432p1) {
            this.f89429a0.postDelayed(new j(), 600L);
        }
        super.onDestroy();
    }
}
