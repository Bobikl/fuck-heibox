package com.max.xiaoheihe.module.mall;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.EncryptionParamsObj;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcustomview.ProgressBgView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.EpicAddFreeGameObj;
import com.max.xiaoheihe.bean.mall.SteamWalletJsObj;
import com.max.xiaoheihe.bean.proxy.ProxyAddressObj;
import com.max.xiaoheihe.bean.webintercept.IpDirectObj;
import com.max.xiaoheihe.bean.webintercept.TagJsObj;
import com.max.xiaoheihe.module.trade.TradeInfoUtilKt;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.max.xiaoheihe.module.webview.u;
import com.max.xiaoheihe.utils.l0;
import com.max.xiaoheihe.utils.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class SteamStoreAddFreeGamesActivity extends BaseActivity {
    public static final long G2 = 35000;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final String f89884a0 = "ids";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f89885b0 = "url_data";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f89886c0 = "status_not_activate";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final String f89887p1 = "status_activating";

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final String f89888p2 = "status_all_activate_succeed";

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public static final int f89889p3 = 3;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final String f89890x1 = "status_show_cancel";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final String f89891x2 = "status_all_activate_failed";

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final String f89892y1 = "status_login";

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public static final int f89893y2 = 1;
    ProgressBar L;
    TextView M;
    TextView N;
    ProgressBgView O;
    BottomButtonLeftItemView P;
    ViewGroup Q;
    private String R;
    private SteamWalletJsObj S;
    private String T;
    private Dialog U;
    private boolean V;
    private int W;
    private int X;
    private final i Y = new i(this);
    private boolean Z = false;

    @BindView(R.id.progress)
    View mProgressView;

    @BindView(R.id.tv_status)
    TextView mStatusTextView;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41026, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            SteamStoreAddFreeGamesActivity.this.Z = true;
            SteamStoreAddFreeGamesActivity steamStoreAddFreeGamesActivity = SteamStoreAddFreeGamesActivity.this;
            steamStoreAddFreeGamesActivity.mStatusTextView.setText(steamStoreAddFreeGamesActivity.getString(R.string.manual_get));
            SteamStoreAddFreeGamesActivity.O1(SteamStoreAddFreeGamesActivity.this);
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41027, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            SteamStoreAddFreeGamesActivity.O1(SteamStoreAddFreeGamesActivity.this);
            if (com.max.hbcommon.utils.c.u(SteamStoreAddFreeGamesActivity.this.S.getAddfreelicense().getBind_id())) {
                SteamStoreAddFreeGamesActivity.e2(SteamStoreAddFreeGamesActivity.this);
            }
        }
    }

    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41028, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            SteamStoreAddFreeGamesActivity.O1(SteamStoreAddFreeGamesActivity.this);
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 41029, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 41030, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.account.utils.l.D(SteamStoreAddFreeGamesActivity.this.V0(), ((BaseActivity) SteamStoreAddFreeGamesActivity.this).f66601b, false, true, 3);
            dialogInterface.dismiss();
        }
    }

    public class f implements ValueCallback<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        public void a(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41031, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            SteamStoreAddFreeGamesActivity.this.W = com.max.hbutils.utils.n.q(l0.w(str));
            Log.d("jsCheckCntBefore", "" + SteamStoreAddFreeGamesActivity.this.W);
        }

        @Override // android.webkit.ValueCallback
        public /* bridge */ /* synthetic */ void onReceiveValue(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41032, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a(str);
        }
    }

    public class g implements ValueCallback<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        public void a(String str) {
            int length;
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41033, new Class[]{String.class}, Void.TYPE).isSupported || SteamStoreAddFreeGamesActivity.this.Z) {
                return;
            }
            SteamStoreAddFreeGamesActivity.this.X = com.max.hbutils.utils.n.q(l0.w(str));
            try {
                length = com.max.hbutils.utils.k.b(SteamStoreAddFreeGamesActivity.this.R, EpicAddFreeGameObj.class).size();
            } catch (Throwable unused) {
                length = SteamStoreAddFreeGamesActivity.this.R.split(Constants.ACCEPT_TIME_SEPARATOR_SP).length;
            }
            int i10 = SteamStoreAddFreeGamesActivity.this.X - SteamStoreAddFreeGamesActivity.this.W;
            int i11 = length - i10;
            Log.d("jsCheckCntAfter", "mGameCntBefore:" + SteamStoreAddFreeGamesActivity.this.W + "  mGameCntAfter:" + SteamStoreAddFreeGamesActivity.this.X + "  succeedCnt:" + i10 + "  failedCnt:" + i11);
            if (i11 == 0) {
                SteamStoreAddFreeGamesActivity.this.T = "status_all_activate_succeed";
                SteamStoreAddFreeGamesActivity steamStoreAddFreeGamesActivity = SteamStoreAddFreeGamesActivity.this;
                SteamStoreAddFreeGamesActivity.n2(steamStoreAddFreeGamesActivity, String.format(Locale.US, steamStoreAddFreeGamesActivity.getString(R.string.receive_succeed_format), Integer.valueOf(i10)));
            } else {
                SteamStoreAddFreeGamesActivity.this.T = "status_all_activate_failed";
                SteamStoreAddFreeGamesActivity steamStoreAddFreeGamesActivity2 = SteamStoreAddFreeGamesActivity.this;
                SteamStoreAddFreeGamesActivity.n2(steamStoreAddFreeGamesActivity2, String.format(Locale.US, steamStoreAddFreeGamesActivity2.getString(R.string.receive_failed_format), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
        }

        @Override // android.webkit.ValueCallback
        public /* bridge */ /* synthetic */ void onReceiveValue(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41034, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a(str);
        }
    }

    public class h extends WebviewFragment.o0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41038, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                SteamStoreAddFreeGamesActivity.Y1(SteamStoreAddFreeGamesActivity.this);
                SteamStoreAddFreeGamesActivity.Z1(SteamStoreAddFreeGamesActivity.this);
            }
        }

        public class b implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41039, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                SteamStoreAddFreeGamesActivity.a2(SteamStoreAddFreeGamesActivity.this);
            }
        }

        h() {
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void g(WebView webView, String str, int i10, int i11) {
            Object[] objArr = {webView, str, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 41037, new Class[]{WebView.class, String.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b("zzzzwebtest", "onPageFinished  url==" + str);
            if (SteamStoreAddFreeGamesActivity.this.Z || i11 - 1 != 0) {
                return;
            }
            if (SteamStoreAddFreeGamesActivity.this.S == null || !str.matches(SteamStoreAddFreeGamesActivity.this.S.getAddfreelicense().getRegular())) {
                if (str.contains("/login")) {
                    SteamStoreAddFreeGamesActivity.this.T = "status_login";
                    SteamStoreAddFreeGamesActivity.this.V = false;
                    if (SteamStoreAddFreeGamesActivity.this.S != null && SteamStoreAddFreeGamesActivity.this.S.getRemember_js() != null) {
                        EncryptionParamsObj js = SteamStoreAddFreeGamesActivity.this.S.getRemember_js().getJs();
                        String strC = com.max.hbcommon.utils.e.c(js.getP1(), w.c(js.getP3()));
                        if (com.max.xiaoheihe.utils.d.a1(strC).equals(js.getP2())) {
                            SteamStoreAddFreeGamesActivity.b2(SteamStoreAddFreeGamesActivity.this, strC, null);
                        }
                    }
                }
            } else if (SteamStoreAddFreeGamesActivity.this.V) {
                SteamStoreAddFreeGamesActivity.this.mStatusTextView.postDelayed(new b(), 300L);
            } else {
                SteamStoreAddFreeGamesActivity.this.V = true;
                SteamStoreAddFreeGamesActivity.this.T = "status_activating";
                SteamStoreAddFreeGamesActivity.this.mStatusTextView.postDelayed(new a(), 300L);
            }
            SteamStoreAddFreeGamesActivity.n2(SteamStoreAddFreeGamesActivity.this, null);
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void i(WebView webView, String str, int i10, int i11) {
            Object[] objArr = {webView, str, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 41036, new Class[]{WebView.class, String.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b("zzzzwebtest", "onPageStarted  url==" + str);
            if (SteamStoreAddFreeGamesActivity.this.Z) {
                return;
            }
            if (SteamStoreAddFreeGamesActivity.this.S != null && str.matches(SteamStoreAddFreeGamesActivity.this.S.getAddfreelicense().getRegular())) {
                SteamStoreAddFreeGamesActivity.V1(SteamStoreAddFreeGamesActivity.this);
            } else if (str.contains("/login")) {
                SteamStoreAddFreeGamesActivity.O1(SteamStoreAddFreeGamesActivity.this);
            }
            SteamStoreAddFreeGamesActivity.n2(SteamStoreAddFreeGamesActivity.this, null);
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void o(WebView webView, String str) {
            if (PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 41035, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(str) || ((BaseActivity) SteamStoreAddFreeGamesActivity.this).f66616q == null || ((BaseActivity) SteamStoreAddFreeGamesActivity.this).f66616q.getVisibility() != 0) {
                return;
            }
            if ("about:blank".equalsIgnoreCase(str)) {
                str = SteamStoreAddFreeGamesActivity.this.getString(R.string.loading);
            }
            ((BaseActivity) SteamStoreAddFreeGamesActivity.this).f66616q.setTitle(str);
        }
    }

    public static class i extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<SteamStoreAddFreeGamesActivity> f89904a;

        public i(SteamStoreAddFreeGamesActivity steamStoreAddFreeGamesActivity) {
            this.f89904a = new WeakReference<>(steamStoreAddFreeGamesActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 41040, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            super.handleMessage(message);
            SteamStoreAddFreeGamesActivity steamStoreAddFreeGamesActivity = this.f89904a.get();
            if (steamStoreAddFreeGamesActivity == null || !steamStoreAddFreeGamesActivity.isActive() || message == null || message.what != 1) {
                return;
            }
            steamStoreAddFreeGamesActivity.B2();
        }
    }

    private void A2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41007, new Class[0], Void.TYPE).isSupported || this.f66601b.isFinishing()) {
            return;
        }
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(this.f66601b);
        fVar.y("是否需要绑定该账户？").u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new e()).o(com.max.xiaoheihe.utils.d.n0(R.string.cancel), new d());
        fVar.F();
    }

    private void C2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41005, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if ("status_login".equals(this.T)) {
            this.mStatusTextView.setText(getString(R.string.login_steam_account));
        } else if ("status_not_activate".equals(this.T) || "status_activating".equals(this.T)) {
            this.mStatusTextView.setText(getString(R.string.receiving_please_wait));
        } else if ("status_all_activate_succeed".equals(this.T)) {
            this.mStatusTextView.setText(getString(R.string.receive_succeed));
        } else if ("status_all_activate_failed".equals(this.T)) {
            this.mStatusTextView.setText(getString(R.string.receive_failed));
        }
        Dialog dialog = this.U;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        if ("status_not_activate".equals(this.T) || "status_activating".equals(this.T) || "status_show_cancel".equals(this.T)) {
            this.L.setVisibility(0);
            this.M.setText(getString(R.string.receiving_please_wait));
            this.N.setText((CharSequence) null);
            this.Q.setVisibility(8);
            TradeInfoUtilKt.F(this.O);
            if (!"status_show_cancel".equals(this.T)) {
                this.P.setVisibility(8);
                return;
            }
            this.P.setVisibility(0);
            this.P.setRightText(this.f66601b.getResources().getText(R.string.manual_get));
            this.P.setRightClickListener(new a());
            return;
        }
        if ("status_all_activate_succeed".equals(this.T)) {
            this.L.setVisibility(8);
            this.M.setText(getString(R.string.receive_succeed));
            this.N.setText(str);
            this.N.setTextColor(getResources().getColor(R.color.text_primary_1_color));
            this.Q.setVisibility(0);
            this.O.setBackgroundResource(R.color.text_primary_1_color);
            this.O.c();
            this.P.setVisibility(0);
            this.P.setRightText(this.f66601b.getResources().getText(R.string.confirm));
            this.P.setRightClickListener(new b());
            return;
        }
        if ("status_all_activate_failed".equals(this.T)) {
            this.L.setVisibility(8);
            this.M.setText(getString(R.string.receive_failed));
            this.N.setText(str);
            this.N.setTextColor(getResources().getColor(R.color.badge_bg_color));
            this.Q.setVisibility(0);
            this.O.setBackground((AnimationDrawable) getResources().getDrawable(R.drawable.pb_loading_timeout));
            this.O.c();
            this.P.setVisibility(0);
            this.P.setRightText(this.f66601b.getResources().getText(R.string.confirm));
            this.P.setRightClickListener(new c());
        }
    }

    static /* synthetic */ void O1(SteamStoreAddFreeGamesActivity steamStoreAddFreeGamesActivity) {
        if (PatchProxy.proxy(new Object[]{steamStoreAddFreeGamesActivity}, null, changeQuickRedirect, true, 41018, new Class[]{SteamStoreAddFreeGamesActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamStoreAddFreeGamesActivity.q2();
    }

    static /* synthetic */ void V1(SteamStoreAddFreeGamesActivity steamStoreAddFreeGamesActivity) {
        if (PatchProxy.proxy(new Object[]{steamStoreAddFreeGamesActivity}, null, changeQuickRedirect, true, 41021, new Class[]{SteamStoreAddFreeGamesActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamStoreAddFreeGamesActivity.z2();
    }

    static /* synthetic */ void Y1(SteamStoreAddFreeGamesActivity steamStoreAddFreeGamesActivity) {
        if (PatchProxy.proxy(new Object[]{steamStoreAddFreeGamesActivity}, null, changeQuickRedirect, true, 41022, new Class[]{SteamStoreAddFreeGamesActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamStoreAddFreeGamesActivity.x2();
    }

    static /* synthetic */ void Z1(SteamStoreAddFreeGamesActivity steamStoreAddFreeGamesActivity) {
        if (PatchProxy.proxy(new Object[]{steamStoreAddFreeGamesActivity}, null, changeQuickRedirect, true, 41023, new Class[]{SteamStoreAddFreeGamesActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamStoreAddFreeGamesActivity.u2();
    }

    static /* synthetic */ void a2(SteamStoreAddFreeGamesActivity steamStoreAddFreeGamesActivity) {
        if (PatchProxy.proxy(new Object[]{steamStoreAddFreeGamesActivity}, null, changeQuickRedirect, true, 41024, new Class[]{SteamStoreAddFreeGamesActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamStoreAddFreeGamesActivity.v2();
    }

    static /* synthetic */ void b2(SteamStoreAddFreeGamesActivity steamStoreAddFreeGamesActivity, String str, ValueCallback valueCallback) {
        if (PatchProxy.proxy(new Object[]{steamStoreAddFreeGamesActivity, str, valueCallback}, null, changeQuickRedirect, true, 41025, new Class[]{SteamStoreAddFreeGamesActivity.class, String.class, ValueCallback.class}, Void.TYPE).isSupported) {
            return;
        }
        steamStoreAddFreeGamesActivity.o2(str, valueCallback);
    }

    static /* synthetic */ void e2(SteamStoreAddFreeGamesActivity steamStoreAddFreeGamesActivity) {
        if (PatchProxy.proxy(new Object[]{steamStoreAddFreeGamesActivity}, null, changeQuickRedirect, true, 41019, new Class[]{SteamStoreAddFreeGamesActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamStoreAddFreeGamesActivity.A2();
    }

    static /* synthetic */ void n2(SteamStoreAddFreeGamesActivity steamStoreAddFreeGamesActivity, String str) {
        if (PatchProxy.proxy(new Object[]{steamStoreAddFreeGamesActivity, str}, null, changeQuickRedirect, true, 41020, new Class[]{SteamStoreAddFreeGamesActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        steamStoreAddFreeGamesActivity.C2(str);
    }

    private void o2(String str, ValueCallback<String> valueCallback) {
        WebviewFragment webviewFragment;
        if (PatchProxy.proxy(new Object[]{str, valueCallback}, this, changeQuickRedirect, false, 41010, new Class[]{String.class, ValueCallback.class}, Void.TYPE).isSupported || (webviewFragment = (WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            return;
        }
        webviewFragment.H6(str, valueCallback);
    }

    public static Intent p2(Context context, String str, SteamWalletJsObj steamWalletJsObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, steamWalletJsObj}, null, changeQuickRedirect, true, 41003, new Class[]{Context.class, String.class, SteamWalletJsObj.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) SteamStoreAddFreeGamesActivity.class);
        intent.putExtra("ids", str);
        intent.putExtra(f89885b0, steamWalletJsObj);
        return intent;
    }

    private void q2() {
        Dialog dialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41008, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.Y.removeCallbacksAndMessages(null);
        if (this.f66601b.isFinishing() || (dialog = this.U) == null || !dialog.isShowing()) {
            return;
        }
        this.U.dismiss();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008d  */
    private void r2() {
        HashMap<String, String> host;
        String str;
        ArrayList<TagJsObj> js_list;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41015, new Class[0], Void.TYPE).isSupported || this.S == null || ((WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container)) != null) {
            return;
        }
        String str2 = null;
        if (this.S.getHost() != null && !com.max.hbcommon.utils.c.w(this.S.getJs_list())) {
            host = this.S.getHost();
            js_list = this.S.getJs_list();
            str = null;
        } else if (this.S.getSteam_proxy() == null || this.S.getSteam_proxy().getProxy() == null) {
            host = null;
            str = null;
            js_list = null;
        } else {
            String strV = com.max.xiaoheihe.utils.d.v(this.S.getSteam_proxy().getProxy());
            if (com.max.hbcommon.utils.c.u(strV)) {
                host = null;
                str = null;
                js_list = null;
            } else {
                String[] strArrSplit = strV.split(":");
                if (strArrSplit.length > 1) {
                    String str3 = strArrSplit[0];
                    str = strArrSplit[1];
                    js_list = null;
                    str2 = str3;
                    host = null;
                } else {
                    host = null;
                    str = null;
                    js_list = null;
                }
            }
        }
        WebviewFragment webviewFragmentA = new u(this.S.getAddfreelicense().getUrl()).t(new ProxyAddressObj(str2, str)).l(new IpDirectObj(host, js_list)).a();
        webviewFragmentA.Y7(new h());
        getSupportFragmentManager().u().b(R.id.fragment_container, webviewFragmentA).m();
    }

    private void u2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41011, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        EncryptionParamsObj js = this.S.getAddfreelicense().getJs();
        String strC = com.max.hbcommon.utils.e.c(js.getP1(), w.c(js.getP3()));
        String strA1 = com.max.xiaoheihe.utils.d.a1(strC);
        if (strC == null || !strA1.equals(js.getP2())) {
            return;
        }
        o2(strC.replaceAll(this.S.getAddfreelicense().getKey(), this.R), null);
        Log.d("jsAddFreeLicense", this.R);
        Log.d("jsAddFreeLicense", strC);
    }

    private void v2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41013, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        o2(com.max.xiaoheihe.utils.d.v(this.S.getLicense_count_js().getJs()), new g());
    }

    private void x2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41012, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        o2(com.max.xiaoheihe.utils.d.v(this.S.getLicense_count_js().getJs()), new f());
    }

    private void y2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41014, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        r2();
    }

    private void z2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41006, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f66601b.isFinishing() && this.Z) {
            return;
        }
        if (this.U == null) {
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
            this.U = alertDialogCreate;
            Window window = alertDialogCreate.getWindow();
            if (window != null) {
                window.setBackgroundDrawableResource(android.R.color.transparent);
            }
        }
        if (this.U.isShowing()) {
            return;
        }
        this.U.show();
        C2(null);
        this.Y.removeCallbacksAndMessages(null);
        this.Y.sendEmptyMessageDelayed(1, G2);
    }

    public void B2() {
        Dialog dialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41009, new Class[0], Void.TYPE).isSupported || (dialog = this.U) == null || !dialog.isShowing()) {
            return;
        }
        if ("status_not_activate".equals(this.T) || "status_activating".equals(this.T)) {
            this.T = "status_show_cancel";
            C2(null);
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41004, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_steam_store_add_free_games);
        ButterKnife.a(this);
        this.R = getIntent().getStringExtra("ids");
        this.S = (SteamWalletJsObj) getIntent().getSerializableExtra(f89885b0);
        this.f66616q.setTitle(getString(R.string.loading));
        this.f66617r.setVisibility(0);
        this.T = "status_not_activate";
        y2();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 41017, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i10 == 3) {
            com.max.xiaoheihe.utils.d.x1(this.f66601b);
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41016, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.Y.removeCallbacksAndMessages(null);
        q2();
        super.onDestroy();
    }
}
