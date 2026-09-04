package com.max.xiaoheihe.module.trade;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.EncryptionParamsObj;
import com.max.hbcommon.bean.PostEncryptParamsObj;
import com.max.hbcustomview.ProgressBgView;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.WebProtocolObj;
import com.max.xiaoheihe.bean.game.SteamAcceptGameParams;
import com.max.xiaoheihe.bean.trade.BindFailedInfoObj;
import com.max.xiaoheihe.bean.trade.ConflictUserInfo;
import com.max.xiaoheihe.bean.trade.TradeSteamParams;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.max.xiaoheihe.utils.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.message.common.inter.ITagManager;
import df.q6;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: TradeAutoGetInfoActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class TradeAutoGetInfoActivity extends BaseActivity {

    @dl.d
    public static final b L3 = new b(null);
    public static final int M3 = 8;

    @dl.d
    private static final String N3 = "inventory";

    @dl.d
    private static final String O3 = "trade_url";

    @dl.d
    private static final String P3 = "api_key";

    @dl.d
    private static final String Q3 = "bind";

    @dl.d
    private static final String R3 = "unbind";

    @dl.d
    private static final String S3 = "all";
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private View G2;

    @dl.e
    private TextView G3;

    @dl.e
    private String J3;

    @dl.d
    private final a K3 = new a(this);

    @dl.e
    private List<? extends SteamAcceptGameParams> L;

    @dl.e
    private SteamAcceptGameParams M;
    private int N;

    @dl.e
    private LoadingDialog O;
    private String P;

    @dl.e
    private Dialog Q;

    @dl.e
    private View R;

    @dl.e
    private TextView S;

    @dl.e
    private ProgressBar T;

    @dl.e
    private View U;

    @dl.e
    private TextView V;

    @dl.e
    private TextView W;

    @dl.e
    private TextView X;

    @dl.e
    private ProgressBgView Y;

    @dl.e
    private View Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @dl.e
    private TextView f92674a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @dl.e
    private TextView f92675b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @dl.e
    private TextView f92676c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @dl.e
    private ProgressBgView f92677p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @dl.e
    private TextView f92678p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @dl.e
    private TextView f92679p3;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @dl.e
    private View f92680x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @dl.e
    private TextView f92681x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    @dl.e
    private TextView f92682y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    @dl.e
    private ProgressBgView f92683y2;

    /* JADX INFO: compiled from: TradeAutoGetInfoActivity.kt */
    public static final class a extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final WeakReference<TradeAutoGetInfoActivity> f92684a;

        public a(@dl.d TradeAutoGetInfoActivity activity) {
            f0.p(activity, "activity");
            this.f92684a = new WeakReference<>(activity);
        }

        @Override // android.os.Handler
        public void handleMessage(@dl.d Message msg) {
            if (PatchProxy.proxy(new Object[]{msg}, this, changeQuickRedirect, false, 44802, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(msg, "msg");
            super.handleMessage(msg);
            TradeAutoGetInfoActivity tradeAutoGetInfoActivity = this.f92684a.get();
            if (tradeAutoGetInfoActivity != null) {
                tradeAutoGetInfoActivity.N3();
            }
        }
    }

    /* JADX INFO: compiled from: TradeAutoGetInfoActivity.kt */
    public static final class b {
        public static ChangeQuickRedirect changeQuickRedirect;

        private b() {
        }

        public /* synthetic */ b(u uVar) {
            this();
        }

        @dl.d
        public final String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44808, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : TradeAutoGetInfoActivity.S3;
        }

        @dl.d
        public final String b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44805, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : TradeAutoGetInfoActivity.P3;
        }

        @dl.d
        public final String c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44806, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : TradeAutoGetInfoActivity.Q3;
        }

        @dl.d
        public final Intent d(@dl.e Context context, @dl.d String key) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, key}, this, changeQuickRedirect, false, 44809, new Class[]{Context.class, String.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(key, "key");
            Intent intent = new Intent(context, (Class<?>) TradeAutoGetInfoActivity.class);
            intent.putExtra("params_key", key);
            return intent;
        }

        @dl.d
        public final String e() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44803, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : TradeAutoGetInfoActivity.N3;
        }

        @dl.d
        public final String f() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44804, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : TradeAutoGetInfoActivity.O3;
        }

        @dl.d
        public final String g() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44807, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : TradeAutoGetInfoActivity.R3;
        }
    }

    /* JADX INFO: compiled from: TradeAutoGetInfoActivity.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<BindFailedInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 44810, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradeAutoGetInfoActivity.this.isActive()) {
                super.onError(e10);
                TradeAutoGetInfoActivity.n2(TradeAutoGetInfoActivity.this);
            }
        }

        public void onNext(@dl.d Result<BindFailedInfoObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44811, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradeAutoGetInfoActivity.this.isActive()) {
                BindFailedInfoObj result2 = result.getResult();
                if ((result2 != null ? result2.getUser() : null) == null) {
                    TradeAutoGetInfoActivity.n2(TradeAutoGetInfoActivity.this);
                    return;
                }
                TradeAutoGetInfoActivity tradeAutoGetInfoActivity = TradeAutoGetInfoActivity.this;
                BindFailedInfoObj result3 = result.getResult();
                ConflictUserInfo user = result3 != null ? result3.getUser() : null;
                f0.m(user);
                TradeAutoGetInfoActivity.o2(tradeAutoGetInfoActivity, user);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44812, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BindFailedInfoObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeAutoGetInfoActivity.kt */
    public static final class d extends com.max.hbcommon.network.d<Result<TradeSteamParams>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 44813, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradeAutoGetInfoActivity.this.isActive()) {
                super.onError(e10);
                TradeAutoGetInfoActivity.q2(TradeAutoGetInfoActivity.this);
            }
        }

        public void onNext(@dl.d Result<TradeSteamParams> result) {
            String url;
            SteamAcceptGameParams data;
            List<SteamAcceptGameParams> datas;
            SteamAcceptGameParams steamAcceptGameParams;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44814, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradeAutoGetInfoActivity.this.isActive()) {
                TradeSteamParams result2 = result.getResult();
                String str = TradeAutoGetInfoActivity.this.P;
                String url2 = null;
                if (str == null) {
                    f0.S("mKey");
                    str = null;
                }
                b bVar = TradeAutoGetInfoActivity.L3;
                if (!(f0.g(str, bVar.c()) ? true : f0.g(str, bVar.g()))) {
                    if (f0.g(str, bVar.a())) {
                        url = (result2 == null || (datas = result2.getDatas()) == null || (steamAcceptGameParams = datas.get(0)) == null) ? null : steamAcceptGameParams.getUrl();
                        TradeAutoGetInfoActivity tradeAutoGetInfoActivity = TradeAutoGetInfoActivity.this;
                        TradeSteamParams result3 = result.getResult();
                        tradeAutoGetInfoActivity.L = result3 != null ? result3.getDatas() : null;
                        TradeAutoGetInfoActivity.this.N = 0;
                    } else {
                        url = (result2 == null || (data = result2.getData()) == null) ? null : data.getUrl();
                        TradeAutoGetInfoActivity tradeAutoGetInfoActivity2 = TradeAutoGetInfoActivity.this;
                        TradeSteamParams result4 = result.getResult();
                        tradeAutoGetInfoActivity2.M = result4 != null ? result4.getData() : null;
                    }
                    url2 = url;
                } else if (result2 != null) {
                    url2 = result2.getUrl();
                }
                TradeAutoGetInfoActivity.p2(TradeAutoGetInfoActivity.this);
                Fragment fragmentR0 = TradeAutoGetInfoActivity.this.getSupportFragmentManager().r0(R.id.fragment_container);
                if (fragmentR0 != null) {
                    ((WebviewFragment) fragmentR0).t7(url2);
                    return;
                }
                WebviewFragment webviewFragmentU7 = WebviewFragment.u7(url2);
                TradeAutoGetInfoActivity.k2(TradeAutoGetInfoActivity.this, webviewFragmentU7);
                TradeAutoGetInfoActivity.this.getSupportFragmentManager().u().y(R.id.fragment_container, webviewFragmentU7).n();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44815, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeSteamParams>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeAutoGetInfoActivity.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44816, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            TradeAutoGetInfoActivity.this.finish();
        }
    }

    /* JADX INFO: compiled from: TradeAutoGetInfoActivity.kt */
    public static final class f extends WebviewFragment.o0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: TradeAutoGetInfoActivity.kt */
        public static final class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TradeAutoGetInfoActivity f92689b;

            a(TradeAutoGetInfoActivity tradeAutoGetInfoActivity) {
                this.f92689b = tradeAutoGetInfoActivity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44821, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                TradeAutoGetInfoActivity.l2(this.f92689b);
            }
        }

        f() {
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void b(@dl.d WebProtocolObj webProtocolObj) {
            SteamAcceptGameParams steamAcceptGameParams;
            if (PatchProxy.proxy(new Object[]{webProtocolObj}, this, changeQuickRedirect, false, 44820, new Class[]{WebProtocolObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(webProtocolObj, "webProtocolObj");
            if (f0.g(WebProtocolObj.PROTOCOL_TYPE_STEAM_CALLBACK, webProtocolObj.getProtocol_type())) {
                String strValueOf = webProtocolObj.valueOf("type");
                String strValueOf2 = webProtocolObj.valueOf("state");
                String url = null;
                if (strValueOf != null) {
                    int iHashCode = strValueOf.hashCode();
                    if (iHashCode != -1411271163) {
                        if (iHashCode != -977423767) {
                            if (iHashCode == 110621028 && strValueOf.equals("trade") && f0.g(ITagManager.SUCCESS, strValueOf2)) {
                                String strValueOf3 = webProtocolObj.valueOf("url");
                                TradeAutoGetInfoActivity.this.D3(strValueOf3);
                                TradeAutoGetInfoActivity.this.O3(null, strValueOf3, null);
                            }
                        } else if (strValueOf.equals("public") && f0.g(ITagManager.SUCCESS, strValueOf2)) {
                            TradeAutoGetInfoActivity.this.O3("1", null, null);
                        }
                    } else if (strValueOf.equals("apikey") && f0.g(ITagManager.SUCCESS, strValueOf2)) {
                        String strValueOf4 = webProtocolObj.valueOf("key");
                        TradeAutoGetInfoActivity.this.D3(strValueOf4);
                        TradeAutoGetInfoActivity.this.O3(null, null, strValueOf4);
                    }
                }
                String strA = TradeAutoGetInfoActivity.L3.a();
                String str = TradeAutoGetInfoActivity.this.P;
                if (str == null) {
                    f0.S("mKey");
                    str = null;
                }
                if (f0.g(strA, str)) {
                    TradeAutoGetInfoActivity.this.N++;
                    int i10 = TradeAutoGetInfoActivity.this.N;
                    List list = TradeAutoGetInfoActivity.this.L;
                    if (i10 < (list != null ? list.size() : 0)) {
                        Fragment fragmentR0 = TradeAutoGetInfoActivity.this.getSupportFragmentManager().r0(R.id.fragment_container);
                        f0.n(fragmentR0, "null cannot be cast to non-null type com.max.xiaoheihe.module.webview.WebviewFragment");
                        WebviewFragment webviewFragment = (WebviewFragment) fragmentR0;
                        List list2 = TradeAutoGetInfoActivity.this.L;
                        if (list2 != null && (steamAcceptGameParams = (SteamAcceptGameParams) list2.get(TradeAutoGetInfoActivity.this.N)) != null) {
                            url = steamAcceptGameParams.getUrl();
                        }
                        webviewFragment.t7(url);
                        TradeAutoGetInfoActivity tradeAutoGetInfoActivity = TradeAutoGetInfoActivity.this;
                        TradeAutoGetInfoActivity.v2(tradeAutoGetInfoActivity, tradeAutoGetInfoActivity.N, f0.g(ITagManager.SUCCESS, strValueOf2));
                    } else {
                        TradeAutoGetInfoActivity.e2(TradeAutoGetInfoActivity.this);
                        TradeAutoGetInfoActivity.u2(TradeAutoGetInfoActivity.this);
                    }
                } else if (!f0.g(ITagManager.SUCCESS, strValueOf2)) {
                    TradeAutoGetInfoActivity.r2(TradeAutoGetInfoActivity.this);
                }
                com.max.hbcommon.utils.d.b("zzzztest", "type==" + strValueOf + "  state ==" + strValueOf2);
            }
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void c(@dl.d WebView view, @dl.d String html) {
            if (PatchProxy.proxy(new Object[]{view, html}, this, changeQuickRedirect, false, 44819, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(view, "view");
            f0.p(html, "html");
            if (com.max.hbcommon.utils.c.u(html) || !StringsKt__StringsKt.W2(html, "失败", false, 2, null)) {
                TradeAutoGetInfoActivity.this.Z0().post(new a(TradeAutoGetInfoActivity.this));
            } else {
                TradeAutoGetInfoActivity.R1(TradeAutoGetInfoActivity.this);
            }
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void g(@dl.d WebView view, @dl.d String url, int i10, int i11) {
            Object[] objArr = {view, url, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 44818, new Class[]{WebView.class, String.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(view, "view");
            f0.p(url, "url");
            if (i11 - 1 == 0) {
                String str = TradeAutoGetInfoActivity.this.P;
                SteamAcceptGameParams steamAcceptGameParams = null;
                if (str == null) {
                    f0.S("mKey");
                    str = null;
                }
                b bVar = TradeAutoGetInfoActivity.L3;
                if (!(f0.g(str, bVar.c()) ? true : f0.g(str, bVar.g()))) {
                    if (f0.g(str, bVar.a())) {
                        List list = TradeAutoGetInfoActivity.this.L;
                        if (list != null) {
                            steamAcceptGameParams = (SteamAcceptGameParams) list.get(TradeAutoGetInfoActivity.this.N);
                        }
                    } else {
                        steamAcceptGameParams = TradeAutoGetInfoActivity.this.M;
                    }
                }
                if (steamAcceptGameParams != null) {
                    String regular = steamAcceptGameParams.getRegular();
                    f0.m(regular);
                    if (new Regex(regular).b(url)) {
                        EncryptionParamsObj js = steamAcceptGameParams.getJs();
                        f0.o(js, "jsparams.js");
                        String js2 = com.max.hbcommon.utils.e.c(js.getP1(), w.c(js.getP3()));
                        if (f0.g(com.max.xiaoheihe.utils.d.a1(js2), js.getP2())) {
                            TradeAutoGetInfoActivity tradeAutoGetInfoActivity = TradeAutoGetInfoActivity.this;
                            f0.o(js2, "js");
                            TradeAutoGetInfoActivity.M1(tradeAutoGetInfoActivity, js2);
                            return;
                        }
                        return;
                    }
                }
                if (Pattern.compile("openid/steam/trade_login_complete/(\\d+)/").matcher(url).find()) {
                    TradeAutoGetInfoActivity.M1(TradeAutoGetInfoActivity.this, WebviewFragment.Y4);
                }
            }
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void o(@dl.d WebView view, @dl.d String receivedTitle) {
            if (PatchProxy.proxy(new Object[]{view, receivedTitle}, this, changeQuickRedirect, false, 44817, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(view, "view");
            f0.p(receivedTitle, "receivedTitle");
            if (com.max.hbcommon.utils.c.u(receivedTitle) || ((BaseActivity) TradeAutoGetInfoActivity.this).f66616q == null || ((BaseActivity) TradeAutoGetInfoActivity.this).f66616q.getVisibility() != 0) {
                return;
            }
            if (kotlin.text.u.L1("about:blank", receivedTitle, true)) {
                receivedTitle = TradeAutoGetInfoActivity.this.getString(R.string.loading);
            }
            ((BaseActivity) TradeAutoGetInfoActivity.this).f66616q.setTitle(receivedTitle);
        }
    }

    /* JADX INFO: compiled from: TradeAutoGetInfoActivity.kt */
    public static final class g implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 44822, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            TradeAutoGetInfoActivity.this.P = TradeAutoGetInfoActivity.L3.a();
            TradeAutoGetInfoActivity.Y1(TradeAutoGetInfoActivity.this);
            TradeAutoGetInfoActivity.m2(TradeAutoGetInfoActivity.this);
        }
    }

    /* JADX INFO: compiled from: TradeAutoGetInfoActivity.kt */
    public static final class h implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 44823, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            TradeAutoGetInfoActivity.this.setResult(-1);
            TradeAutoGetInfoActivity.this.finish();
        }
    }

    /* JADX INFO: compiled from: TradeAutoGetInfoActivity.kt */
    public static final class i implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 44824, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            TradeAutoGetInfoActivity.this.finish();
        }
    }

    /* JADX INFO: compiled from: TradeAutoGetInfoActivity.kt */
    public static final class j implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 44825, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            TradeAutoGetInfoActivity.this.finish();
        }
    }

    /* JADX INFO: compiled from: TradeAutoGetInfoActivity.kt */
    public static final class k implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 44826, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            TradeAutoGetInfoActivity.this.finish();
        }
    }

    /* JADX INFO: compiled from: TradeAutoGetInfoActivity.kt */
    public static final class l implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 44827, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            String str = TradeAutoGetInfoActivity.this.P;
            String str2 = null;
            if (str == null) {
                f0.S("mKey");
                str = null;
            }
            b bVar = TradeAutoGetInfoActivity.L3;
            if (f0.g(str, bVar.f())) {
                TradeAutoGetInfoActivity.this.setResult(-1, new Intent().putExtra(bVar.f(), TradeAutoGetInfoActivity.this.a3()));
            } else {
                String strB = bVar.b();
                String str3 = TradeAutoGetInfoActivity.this.P;
                if (str3 == null) {
                    f0.S("mKey");
                } else {
                    str2 = str3;
                }
                if (f0.g(strB, str2)) {
                    TradeAutoGetInfoActivity.this.setResult(-1, new Intent().putExtra(bVar.b(), TradeAutoGetInfoActivity.this.a3()));
                } else {
                    TradeAutoGetInfoActivity.this.setResult(-1);
                }
            }
            TradeAutoGetInfoActivity.this.finish();
        }
    }

    /* JADX INFO: compiled from: TradeAutoGetInfoActivity.kt */
    public static final class m extends com.max.hbcommon.network.d<Result<Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        public void onNext(@dl.d Result<Object> t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 44828, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(t10, "t");
            String str = TradeAutoGetInfoActivity.this.P;
            if (str == null) {
                f0.S("mKey");
                str = null;
            }
            if (f0.g(str, "all")) {
                return;
            }
            TradeAutoGetInfoActivity.u2(TradeAutoGetInfoActivity.this);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44829, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<Object>) obj);
        }
    }

    private final void F3(WebviewFragment webviewFragment) {
        if (PatchProxy.proxy(new Object[]{webviewFragment}, this, changeQuickRedirect, false, 44771, new Class[]{WebviewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        webviewFragment.Y7(new f());
    }

    private final void G3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44778, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(this.f66601b);
        fVar.y("自动绑定授权").l("为了更快捷安全的使用" + com.max.xiaoheihe.utils.d.A() + "饰品交易功能，\n我们建议您授权" + com.max.xiaoheihe.utils.d.A() + com.max.xiaoheihe.utils.d.A() + "进行自动绑定流程。").u("自动绑定", new g()).g(false).o("我要手动", new h());
        fVar.F();
    }

    private final void H3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44783, new Class[0], Void.TYPE).isSupported || this.f66601b.isFinishing()) {
            return;
        }
        if (this.Q == null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f66601b);
            this.R = this.f66602c.inflate(R.layout.dialog_purchase, (ViewGroup) null, false);
            g3();
            AlertDialog alertDialogCreate = builder.setView(this.R).setCancelable(false).create();
            this.Q = alertDialogCreate;
            Window window = alertDialogCreate != null ? alertDialogCreate.getWindow() : null;
            if (window != null) {
                window.setBackgroundDrawableResource(android.R.color.transparent);
            }
        }
        Dialog dialog = this.Q;
        if (dialog != null) {
            dialog.show();
        }
        this.K3.removeMessages(0);
        this.K3.sendEmptyMessageDelayed(0, 40000L);
    }

    private final void I3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44781, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(this.f66601b);
        fVar.y("绑定冲突").l("该Steam账号已被绑定，请检查小黑盒&MAXApp中的饰品交易功能是否已完成绑定，请先解绑原账号后再完成绑定。").u("我知道了", new j()).g(false);
        fVar.F();
    }

    private final void K3(ConflictUserInfo conflictUserInfo) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{conflictUserInfo}, this, changeQuickRedirect, false, 44780, new Class[]{ConflictUserInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        q6 q6VarC = q6.c(LayoutInflater.from(this.f66601b));
        f0.o(q6VarC, "inflate(LayoutInflater.from(mContext))");
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, ViewUtils.f(this.f66601b, 60.0f));
        marginLayoutParams.topMargin = ViewUtils.f(this.f66601b, 10.0f);
        marginLayoutParams.bottomMargin = ViewUtils.f(this.f66601b, 23.0f);
        q6VarC.b().setLayoutParams(marginLayoutParams);
        q6VarC.f114742f.setText(conflictUserInfo.getUsername());
        String max_id = conflictUserInfo.getMax_id();
        if (max_id != null && max_id.length() != 0) {
            z10 = false;
        }
        if (z10) {
            q6VarC.f114741e.setText("ID: " + conflictUserInfo.getHeybox_id());
            q6VarC.f114740d.setVisibility(8);
            q6VarC.f114739c.setVisibility(0);
        } else {
            q6VarC.f114741e.setText("ID: " + conflictUserInfo.getMax_id());
            q6VarC.f114740d.setVisibility(0);
            q6VarC.f114739c.setVisibility(8);
        }
        com.max.hbimage.b.H(conflictUserInfo.getAvatar(), q6VarC.f114738b);
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(this.f66601b);
        fVar.y("绑定冲突").l("该Steam账号已被绑定，\n请先解绑原账号后再完成绑定").i(q6VarC.b()).u("我知道了", new i()).g(false);
        fVar.F();
    }

    private final void L3() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44777, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(this.f66601b);
        String str2 = this.P;
        if (str2 == null) {
            f0.S("mKey");
            str2 = null;
        }
        if (f0.g(str2, N3)) {
            str = "公开Steam库存";
        } else if (f0.g(str2, O3)) {
            str = "设置Steam交易链接";
        } else if (f0.g(str2, P3)) {
            str = "设置API Key";
        } else {
            str = f0.g(str2, R3) ? "解除绑定" : "自动绑定";
        }
        fVar.l(str + "失败,请手动操作").u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new k()).g(false);
        fVar.F();
    }

    public static final /* synthetic */ void M1(TradeAutoGetInfoActivity tradeAutoGetInfoActivity, String str) {
        if (PatchProxy.proxy(new Object[]{tradeAutoGetInfoActivity, str}, null, changeQuickRedirect, true, 44791, new Class[]{TradeAutoGetInfoActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeAutoGetInfoActivity.x2(str);
    }

    private final void M3() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44776, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(this.f66601b);
        String str2 = this.P;
        if (str2 == null) {
            f0.S("mKey");
            str2 = null;
        }
        if (f0.g(str2, N3)) {
            str = "公开Steam库存";
        } else if (f0.g(str2, O3)) {
            str = "设置Steam交易链接";
        } else if (f0.g(str2, P3)) {
            str = "设置API Key";
        } else {
            str = f0.g(str2, R3) ? "解除绑定" : "自动绑定";
        }
        fVar.l(str + "成功!").u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new l()).g(false);
        fVar.F();
    }

    private final void P3(int i10, boolean z10) {
        TextView textView;
        TextView textView2;
        ProgressBgView progressBgView;
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 44785, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView3 = null;
        if (i10 == 0) {
            textView3 = this.W;
            textView = this.V;
            textView2 = this.X;
            progressBgView = this.Y;
        } else if (i10 == 1) {
            textView3 = this.f92675b0;
            textView = this.f92674a0;
            textView2 = this.f92676c0;
            progressBgView = this.f92677p1;
        } else if (i10 != 2) {
            textView = null;
            textView2 = null;
            progressBgView = null;
        } else {
            textView3 = this.f92678p2;
            textView = this.f92682y1;
            textView2 = this.f92681x2;
            progressBgView = this.f92683y2;
        }
        if (!z10) {
            if (textView3 != null) {
                textView3.setText(getString(R.string.overtime));
            }
            if (textView3 != null) {
                textView3.setTextColor(getResources().getColor(R.color.badge_bg_color));
            }
            if (textView != null) {
                textView.setTextColor(getResources().getColor(R.color.badge_bg_color));
            }
            TradeInfoUtilKt.G(progressBgView);
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(8);
            return;
        }
        if (textView3 != null) {
            textView3.setText(getString(R.string.complete));
        }
        if (textView3 != null) {
            textView3.setTextColor(getResources().getColor(R.color.text_primary_1_color));
        }
        if (textView != null) {
            textView.setTextColor(getResources().getColor(R.color.text_primary_1_color));
        }
        if (progressBgView != null) {
            progressBgView.c();
        }
        if (progressBgView != null) {
            progressBgView.setBackgroundResource(R.color.text_primary_1_color);
        }
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(0);
    }

    public static final /* synthetic */ void R1(TradeAutoGetInfoActivity tradeAutoGetInfoActivity) {
        if (PatchProxy.proxy(new Object[]{tradeAutoGetInfoActivity}, null, changeQuickRedirect, true, 44792, new Class[]{TradeAutoGetInfoActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeAutoGetInfoActivity.y2();
    }

    public static final /* synthetic */ void Y1(TradeAutoGetInfoActivity tradeAutoGetInfoActivity) {
        if (PatchProxy.proxy(new Object[]{tradeAutoGetInfoActivity}, null, changeQuickRedirect, true, 44798, new Class[]{TradeAutoGetInfoActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeAutoGetInfoActivity.Y2();
    }

    private final void Y2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44769, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str = this.P;
        if (str == null) {
            f0.S("mKey");
            str = null;
        }
        V((io.reactivex.disposables.b) eVarA.t9(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    public static final /* synthetic */ void e2(TradeAutoGetInfoActivity tradeAutoGetInfoActivity) {
        if (PatchProxy.proxy(new Object[]{tradeAutoGetInfoActivity}, null, changeQuickRedirect, true, 44795, new Class[]{TradeAutoGetInfoActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeAutoGetInfoActivity.f3();
    }

    private final void e3() {
        LoadingDialog loadingDialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44773, new Class[0], Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing() || (loadingDialog = this.O) == null) {
            return;
        }
        f0.m(loadingDialog);
        loadingDialog.c();
    }

    private final void f3() {
        Dialog dialog;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44782, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.K3.removeMessages(0);
        if (this.f66601b.isFinishing()) {
            return;
        }
        Dialog dialog2 = this.Q;
        if (dialog2 != null && dialog2.isShowing()) {
            z10 = true;
        }
        if (!z10 || (dialog = this.Q) == null) {
            return;
        }
        dialog.dismiss();
    }

    private final void g3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44784, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View view = this.R;
        if (view != null) {
            View viewFindViewById = view.findViewById(R.id.tv_title);
            f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
            this.S = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.pb_title);
            f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.ProgressBar");
            this.T = (ProgressBar) viewFindViewById2;
            this.U = view.findViewById(R.id.vg_progress_desc_0);
            View viewFindViewById3 = view.findViewById(R.id.tv_progress_0);
            f0.n(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
            this.V = (TextView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R.id.tv_progress_desc_0);
            f0.n(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
            this.W = (TextView) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(R.id.tv_progress_checked_0);
            f0.n(viewFindViewById5, "null cannot be cast to non-null type android.widget.TextView");
            this.X = (TextView) viewFindViewById5;
            View viewFindViewById6 = view.findViewById(R.id.pb_0);
            f0.n(viewFindViewById6, "null cannot be cast to non-null type com.max.hbcustomview.ProgressBgView");
            this.Y = (ProgressBgView) viewFindViewById6;
            this.Z = view.findViewById(R.id.vg_progress_desc_1);
            View viewFindViewById7 = view.findViewById(R.id.tv_progress_1);
            f0.n(viewFindViewById7, "null cannot be cast to non-null type android.widget.TextView");
            this.f92674a0 = (TextView) viewFindViewById7;
            View viewFindViewById8 = view.findViewById(R.id.tv_progress_desc_1);
            f0.n(viewFindViewById8, "null cannot be cast to non-null type android.widget.TextView");
            this.f92675b0 = (TextView) viewFindViewById8;
            View viewFindViewById9 = view.findViewById(R.id.tv_progress_checked_1);
            f0.n(viewFindViewById9, "null cannot be cast to non-null type android.widget.TextView");
            this.f92676c0 = (TextView) viewFindViewById9;
            View viewFindViewById10 = view.findViewById(R.id.pb_1);
            f0.n(viewFindViewById10, "null cannot be cast to non-null type com.max.hbcustomview.ProgressBgView");
            this.f92677p1 = (ProgressBgView) viewFindViewById10;
            this.f92680x1 = view.findViewById(R.id.vg_progress_desc_2);
            View viewFindViewById11 = view.findViewById(R.id.tv_progress_2);
            f0.n(viewFindViewById11, "null cannot be cast to non-null type android.widget.TextView");
            this.f92682y1 = (TextView) viewFindViewById11;
            View viewFindViewById12 = view.findViewById(R.id.tv_progress_desc_2);
            f0.n(viewFindViewById12, "null cannot be cast to non-null type android.widget.TextView");
            this.f92678p2 = (TextView) viewFindViewById12;
            View viewFindViewById13 = view.findViewById(R.id.tv_progress_checked_2);
            f0.n(viewFindViewById13, "null cannot be cast to non-null type android.widget.TextView");
            this.f92681x2 = (TextView) viewFindViewById13;
            View viewFindViewById14 = view.findViewById(R.id.pb_2);
            f0.n(viewFindViewById14, "null cannot be cast to non-null type com.max.hbcustomview.ProgressBgView");
            this.f92683y2 = (ProgressBgView) viewFindViewById14;
            this.G2 = view.findViewById(R.id.vg_button_panel);
            View viewFindViewById15 = view.findViewById(R.id.tv_negative_button);
            f0.n(viewFindViewById15, "null cannot be cast to non-null type android.widget.TextView");
            this.f92679p3 = (TextView) viewFindViewById15;
            View viewFindViewById16 = view.findViewById(R.id.tv_positive_button);
            f0.n(viewFindViewById16, "null cannot be cast to non-null type android.widget.TextView");
            this.G3 = (TextView) viewFindViewById16;
        }
        TextView textView = this.S;
        if (textView != null) {
            textView.setText("处理中,请稍后");
        }
        TextView textView2 = this.V;
        if (textView2 != null) {
            textView2.setText("Step 1:公开库存");
        }
        TextView textView3 = this.f92674a0;
        if (textView3 != null) {
            textView3.setText("Step 2:获取交易链接");
        }
        TextView textView4 = this.f92682y1;
        if (textView4 != null) {
            textView4.setText("Step 3:获取APIKey");
        }
        TextView textView5 = this.f92679p3;
        if (textView5 != null) {
            textView5.setVisibility(8);
        }
        TextView textView6 = this.G3;
        if (textView6 != null) {
            textView6.setText("确定");
        }
        TextView textView7 = this.G3;
        if (textView7 != null) {
            textView7.setOnClickListener(new e());
        }
        TextView textView8 = this.W;
        f0.m(textView8);
        textView8.setText(getString(R.string.doing));
        TextView textView9 = this.W;
        f0.m(textView9);
        textView9.setTextColor(getResources().getColor(R.color.text_primary_1_color));
        TextView textView10 = this.V;
        f0.m(textView10);
        textView10.setTextColor(getResources().getColor(R.color.text_primary_1_color));
        TradeInfoUtilKt.F(this.Y);
        TextView textView11 = this.X;
        f0.m(textView11);
        textView11.setVisibility(8);
        TextView textView12 = this.f92675b0;
        if (textView12 != null) {
            textView12.setText(getString(R.string.wait));
        }
        TextView textView13 = this.f92675b0;
        if (textView13 != null) {
            textView13.setTextColor(getResources().getColor(R.color.text_secondary_2_color));
        }
        TextView textView14 = this.f92674a0;
        if (textView14 != null) {
            textView14.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
        }
        ProgressBgView progressBgView = this.f92677p1;
        if (progressBgView != null) {
            progressBgView.removeAllViews();
        }
        ProgressBgView progressBgView2 = this.f92677p1;
        if (progressBgView2 != null) {
            progressBgView2.setBackgroundResource(R.color.divider_secondary_2_color);
        }
        TextView textView15 = this.f92676c0;
        if (textView15 != null) {
            textView15.setVisibility(8);
        }
        TextView textView16 = this.f92678p2;
        if (textView16 != null) {
            textView16.setText(getString(R.string.wait));
        }
        TextView textView17 = this.f92678p2;
        if (textView17 != null) {
            textView17.setTextColor(getResources().getColor(R.color.text_secondary_2_color));
        }
        TextView textView18 = this.f92682y1;
        if (textView18 != null) {
            textView18.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
        }
        ProgressBgView progressBgView3 = this.f92683y2;
        if (progressBgView3 != null) {
            progressBgView3.removeAllViews();
        }
        ProgressBgView progressBgView4 = this.f92683y2;
        if (progressBgView4 != null) {
            progressBgView4.setBackgroundResource(R.color.divider_secondary_2_color);
        }
        TextView textView19 = this.f92681x2;
        if (textView19 == null) {
            return;
        }
        textView19.setVisibility(8);
    }

    public static final /* synthetic */ void k2(TradeAutoGetInfoActivity tradeAutoGetInfoActivity, WebviewFragment webviewFragment) {
        if (PatchProxy.proxy(new Object[]{tradeAutoGetInfoActivity, webviewFragment}, null, changeQuickRedirect, true, 44790, new Class[]{TradeAutoGetInfoActivity.class, WebviewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeAutoGetInfoActivity.F3(webviewFragment);
    }

    public static final /* synthetic */ void l2(TradeAutoGetInfoActivity tradeAutoGetInfoActivity) {
        if (PatchProxy.proxy(new Object[]{tradeAutoGetInfoActivity}, null, changeQuickRedirect, true, 44793, new Class[]{TradeAutoGetInfoActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeAutoGetInfoActivity.G3();
    }

    public static final /* synthetic */ void m2(TradeAutoGetInfoActivity tradeAutoGetInfoActivity) {
        if (PatchProxy.proxy(new Object[]{tradeAutoGetInfoActivity}, null, changeQuickRedirect, true, 44799, new Class[]{TradeAutoGetInfoActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeAutoGetInfoActivity.H3();
    }

    public static final /* synthetic */ void n2(TradeAutoGetInfoActivity tradeAutoGetInfoActivity) {
        if (PatchProxy.proxy(new Object[]{tradeAutoGetInfoActivity}, null, changeQuickRedirect, true, 44800, new Class[]{TradeAutoGetInfoActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeAutoGetInfoActivity.I3();
    }

    public static final /* synthetic */ void o2(TradeAutoGetInfoActivity tradeAutoGetInfoActivity, ConflictUserInfo conflictUserInfo) {
        if (PatchProxy.proxy(new Object[]{tradeAutoGetInfoActivity, conflictUserInfo}, null, changeQuickRedirect, true, 44801, new Class[]{TradeAutoGetInfoActivity.class, ConflictUserInfo.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeAutoGetInfoActivity.K3(conflictUserInfo);
    }

    public static final /* synthetic */ void p2(TradeAutoGetInfoActivity tradeAutoGetInfoActivity) {
        if (PatchProxy.proxy(new Object[]{tradeAutoGetInfoActivity}, null, changeQuickRedirect, true, 44789, new Class[]{TradeAutoGetInfoActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeAutoGetInfoActivity.x1();
    }

    public static final /* synthetic */ void q2(TradeAutoGetInfoActivity tradeAutoGetInfoActivity) {
        if (PatchProxy.proxy(new Object[]{tradeAutoGetInfoActivity}, null, changeQuickRedirect, true, 44788, new Class[]{TradeAutoGetInfoActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeAutoGetInfoActivity.C1();
    }

    public static final /* synthetic */ void r2(TradeAutoGetInfoActivity tradeAutoGetInfoActivity) {
        if (PatchProxy.proxy(new Object[]{tradeAutoGetInfoActivity}, null, changeQuickRedirect, true, 44797, new Class[]{TradeAutoGetInfoActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeAutoGetInfoActivity.L3();
    }

    private final void showLoadingDialog() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44772, new Class[0], Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing()) {
            return;
        }
        LoadingDialog loadingDialog = this.O;
        if (loadingDialog != null) {
            f0.m(loadingDialog);
            if (loadingDialog.i()) {
                return;
            }
        }
        Activity mContext = this.f66601b;
        f0.o(mContext, "mContext");
        this.O = new LoadingDialog(mContext, "", false).r();
    }

    public static final /* synthetic */ void u2(TradeAutoGetInfoActivity tradeAutoGetInfoActivity) {
        if (PatchProxy.proxy(new Object[]{tradeAutoGetInfoActivity}, null, changeQuickRedirect, true, 44796, new Class[]{TradeAutoGetInfoActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeAutoGetInfoActivity.M3();
    }

    public static final /* synthetic */ void v2(TradeAutoGetInfoActivity tradeAutoGetInfoActivity, int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{tradeAutoGetInfoActivity, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 44794, new Class[]{TradeAutoGetInfoActivity.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        tradeAutoGetInfoActivity.P3(i10, z10);
    }

    private final void x2(String str) {
        WebviewFragment webviewFragment;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 44774, new Class[]{String.class}, Void.TYPE).isSupported || (webviewFragment = (WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            return;
        }
        webviewFragment.H6(str, null);
    }

    private final void y2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44779, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().m8().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    @dl.e
    public final TextView A2() {
        return this.f92679p3;
    }

    public final void A3(@dl.e TextView textView) {
        this.f92678p2 = textView;
    }

    @dl.e
    public final TextView B2() {
        return this.G3;
    }

    public final void B3(@dl.e TextView textView) {
        this.S = textView;
    }

    @dl.e
    public final TextView C2() {
        return this.V;
    }

    public final void C3(@dl.e ProgressBar progressBar) {
        this.T = progressBar;
    }

    @dl.e
    public final TextView D2() {
        return this.f92674a0;
    }

    public final void D3(@dl.e String str) {
        this.J3 = str;
    }

    @dl.e
    public final TextView E2() {
        return this.f92682y1;
    }

    @dl.e
    public final ProgressBgView G2() {
        return this.Y;
    }

    @dl.e
    public final ProgressBgView H2() {
        return this.f92677p1;
    }

    @dl.e
    public final ProgressBgView I2() {
        return this.f92683y2;
    }

    @dl.e
    public final TextView J2() {
        return this.X;
    }

    @dl.e
    public final TextView K2() {
        return this.f92676c0;
    }

    @dl.e
    public final TextView L2() {
        return this.f92681x2;
    }

    public final void N3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44786, new Class[0], Void.TYPE).isSupported || this.f66601b.isFinishing()) {
            return;
        }
        Dialog dialog = this.Q;
        if (dialog != null && dialog.isShowing()) {
            P3(this.N, false);
            View view = this.G2;
            if (view != null) {
                view.setVisibility(0);
            }
            ProgressBar progressBar = this.T;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            TextView textView = this.S;
            if (textView == null) {
                return;
            }
            textView.setText("自动处理失败,请手动操作");
        }
    }

    @dl.e
    public final TextView O2() {
        return this.W;
    }

    public final void O3(@dl.e String str, @dl.e String str2, @dl.e String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 44775, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        if (!(str == null || str.length() == 0)) {
            jsonObject.addProperty("open_inventory", str);
        }
        if (!(str2 == null || str2.length() == 0)) {
            jsonObject.addProperty("trade_url", str2);
        }
        if (!(str3 == null || str3.length() == 0)) {
            jsonObject.addProperty("api_key", str3);
        }
        PostEncryptParamsObj postEncryptParamsObjU0 = com.max.xiaoheihe.utils.d.u0(com.max.hbutils.utils.k.p(jsonObject));
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().j3(postEncryptParamsObjU0.getData(), postEncryptParamsObjU0.getKey(), postEncryptParamsObjU0.getSid(), postEncryptParamsObjU0.getTime()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new m()));
    }

    @dl.e
    public final TextView P2() {
        return this.f92675b0;
    }

    @dl.e
    public final TextView Q2() {
        return this.f92678p2;
    }

    @dl.e
    public final View S2() {
        return this.U;
    }

    @dl.e
    public final View T2() {
        return this.Z;
    }

    @dl.e
    public final View V2() {
        return this.f92680x1;
    }

    @dl.e
    public final TextView W2() {
        return this.S;
    }

    @dl.e
    public final ProgressBar X2() {
        return this.T;
    }

    @dl.e
    public final String a3() {
        return this.J3;
    }

    public final void h3(@dl.e TextView textView) {
        this.f92679p3 = textView;
    }

    public final void i3(@dl.e TextView textView) {
        this.G3 = textView;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44768, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_fragment_container);
        this.f66616q.setTitle("登录Steam");
        Z0().setBackgroundColor(com.max.xiaoheihe.utils.d.E(R.color.white));
        String stringExtra = getIntent().getStringExtra("params_key");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.P = stringExtra;
        E1();
        Y2();
    }

    public final void k3(@dl.e TextView textView) {
        this.V = textView;
    }

    public final void l3(@dl.e TextView textView) {
        this.f92674a0 = textView;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44770, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        Y2();
    }

    public final void n3(@dl.e TextView textView) {
        this.f92682y1 = textView;
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44787, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.K3.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    public final void p3(@dl.e ProgressBgView progressBgView) {
        this.Y = progressBgView;
    }

    public final void q3(@dl.e ProgressBgView progressBgView) {
        this.f92677p1 = progressBgView;
    }

    public final void r3(@dl.e ProgressBgView progressBgView) {
        this.f92683y2 = progressBgView;
    }

    public final void s3(@dl.e TextView textView) {
        this.X = textView;
    }

    public final void setMDialogButtonPanelView(@dl.e View view) {
        this.G2 = view;
    }

    public final void setMDialogProgressDescViewGroup0(@dl.e View view) {
        this.U = view;
    }

    public final void setMDialogProgressDescViewGroup1(@dl.e View view) {
        this.Z = view;
    }

    public final void setMDialogProgressDescViewGroup2(@dl.e View view) {
        this.f92680x1 = view;
    }

    public final void t3(@dl.e TextView textView) {
        this.f92676c0 = textView;
    }

    public final void u3(@dl.e TextView textView) {
        this.f92681x2 = textView;
    }

    public final void w3(@dl.e TextView textView) {
        this.W = textView;
    }

    public final void y3(@dl.e TextView textView) {
        this.f92675b0 = textView;
    }

    @dl.e
    public final View z2() {
        return this.G2;
    }
}
