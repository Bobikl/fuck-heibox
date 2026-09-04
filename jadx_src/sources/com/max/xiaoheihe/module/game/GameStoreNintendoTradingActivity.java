package com.max.xiaoheihe.module.game;

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
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.SwitchProxyObj;
import com.max.xiaoheihe.bean.mall.MallSwitchTokenObj;
import com.max.xiaoheihe.bean.proxy.ProxyAddressObj;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import okhttp3.internal.Util;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes11.dex */
public class GameStoreNintendoTradingActivity extends BaseActivity {
    private static final String G2 = "https://ec.nintendo.com/api/add_funds/prepaid_card2";
    public static final String G3 = "status_activate_succeed";
    public static final String J3 = "status_activate_failed";
    public static final String K3 = "status_not_activate";
    public static final String L3 = "status_activating";
    public static final String M3 = "status_region_error";
    public static final String N3 = "status_unknown_error";
    public static final String O3 = "status_all_activate_succeed";
    public static final String P3 = "status_all_activate_failed";
    public static final String Q3 = "key_list";
    private static final String R3 = "activate_url";
    private static final String S3 = "activate_message";
    private static final String T3 = "keys";
    private static final String U3 = "proxy";
    private static final String V3 = "proxy_string";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final String f84912p2 = ".*ec.nintendo.com/oauth2/callback.*";

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final String f84913p3 = "https://ec.nintendo.com/api/prepaid_card2";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f84914x2 = ".*_purchase_confirm\\?.*";

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static final String f84915y2 = "www.google.com";
    ProgressBar L;
    TextView M;
    View N;
    TextView O;
    TextView P;
    TextView Q;
    ImageView R;
    View S;
    TextView T;
    TextView U;
    private String V;
    private ArrayList<KeyDescObj> W;
    private SwitchProxyObj X;
    private String Y;
    private String Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f84916a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f84917b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private String f84918c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private String f84919p1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private Dialog f84920x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private final l f84921y1 = new l(this);

    public class a implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 33943, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            GameStoreNintendoTradingActivity.this.finish();
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 33944, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreNintendoTradingActivity gameStoreNintendoTradingActivity = GameStoreNintendoTradingActivity.this;
            GameStoreNintendoTradingActivity.X1(gameStoreNintendoTradingActivity, gameStoreNintendoTradingActivity.V);
            dialogInterface.dismiss();
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
            if (!PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 33942, new Class[]{WebView.class, String.class, cls, cls}, Void.TYPE).isSupported && i11 - 1 == 0) {
                if (str.matches(GameStoreNintendoTradingActivity.f84912p2)) {
                    GameStoreNintendoTradingActivity.e2(GameStoreNintendoTradingActivity.this);
                    return;
                }
                if (str.matches(GameStoreNintendoTradingActivity.f84914x2) && "status_not_activate".equals(GameStoreNintendoTradingActivity.this.Z)) {
                    GameStoreNintendoTradingActivity.this.Z = "status_activating";
                    GameStoreNintendoTradingActivity.this.f84916a0 = 0;
                    com.max.xiaoheihe.module.game.ow.a.d(((BaseActivity) GameStoreNintendoTradingActivity.this).f66601b, GameStoreNintendoTradingActivity.this.V);
                    if (GameStoreNintendoTradingActivity.this.W == null || GameStoreNintendoTradingActivity.this.W.size() <= 0) {
                        return;
                    }
                    for (KeyDescObj keyDescObj : GameStoreNintendoTradingActivity.this.W) {
                        GameStoreNintendoTradingActivity gameStoreNintendoTradingActivity = GameStoreNintendoTradingActivity.this;
                        GameStoreNintendoTradingActivity.R1(gameStoreNintendoTradingActivity, com.max.xiaoheihe.module.game.ow.a.b(((BaseActivity) gameStoreNintendoTradingActivity).f66601b, GameStoreNintendoTradingActivity.this.V), keyDescObj);
                    }
                }
            }
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void l(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (PatchProxy.proxy(new Object[]{webView, webResourceRequest, webResourceError}, this, changeQuickRedirect, false, 33941, new Class[]{WebView.class, WebResourceRequest.class, WebResourceError.class}, Void.TYPE).isSupported || !GameStoreNintendoTradingActivity.f84915y2.equals(com.max.xiaoheihe.utils.l0.s(webResourceRequest.getUrl().toString())) || webResourceError == null) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(GameStoreNintendoTradingActivity.this.getString(R.string.loading_failed_try_again));
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void m(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            if (PatchProxy.proxy(new Object[]{webView, webResourceRequest, webResourceResponse}, this, changeQuickRedirect, false, 33940, new Class[]{WebView.class, WebResourceRequest.class, WebResourceResponse.class}, Void.TYPE).isSupported || webResourceResponse == null || !webResourceRequest.getUrl().toString().matches(GameStoreNintendoTradingActivity.f84914x2)) {
                return;
            }
            GameStoreNintendoTradingActivity.Z1(GameStoreNintendoTradingActivity.this);
            int statusCode = webResourceResponse.getStatusCode();
            if (400 == statusCode || 404 == statusCode) {
                GameStoreNintendoTradingActivity.this.Z = GameStoreNintendoTradingActivity.M3;
                GameStoreNintendoTradingActivity.c2(GameStoreNintendoTradingActivity.this);
                return;
            }
            GameStoreNintendoTradingActivity.this.Z = GameStoreNintendoTradingActivity.N3;
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.d(GameStoreNintendoTradingActivity.this.getString(R.string.fail) + statusCode);
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void o(WebView webView, String str) {
            if (PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 33939, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(str) || ((BaseActivity) GameStoreNintendoTradingActivity.this).f66616q == null || ((BaseActivity) GameStoreNintendoTradingActivity.this).f66616q.getVisibility() != 0) {
                return;
            }
            if ("about:blank".equalsIgnoreCase(str)) {
                str = GameStoreNintendoTradingActivity.this.getString(R.string.loading);
            }
            ((BaseActivity) GameStoreNintendoTradingActivity.this).f66616q.setTitle(str);
        }
    }

    public class d extends com.max.hbcommon.network.d<okhttp3.d0> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ KeyDescObj f84925b;

        d(KeyDescObj keyDescObj) {
            this.f84925b = keyDescObj;
        }

        public void a(okhttp3.d0 d0Var) {
            if (!PatchProxy.proxy(new Object[]{d0Var}, this, changeQuickRedirect, false, 33946, new Class[]{okhttp3.d0.class}, Void.TYPE).isSupported && GameStoreNintendoTradingActivity.this.isActive()) {
                GameStoreNintendoTradingActivity.i2(GameStoreNintendoTradingActivity.this);
                GameStoreNintendoTradingActivity.V1(GameStoreNintendoTradingActivity.this);
                this.f84925b.setStatus(GameStoreNintendoTradingActivity.G3);
                if (GameStoreNintendoTradingActivity.this.f84916a0 <= 0) {
                    if (GameStoreNintendoTradingActivity.this.f84917b0 == GameStoreNintendoTradingActivity.this.W.size()) {
                        GameStoreNintendoTradingActivity.this.Z = "status_all_activate_succeed";
                    } else {
                        GameStoreNintendoTradingActivity.this.Z = "status_all_activate_failed";
                    }
                }
                GameStoreNintendoTradingActivity.W1(GameStoreNintendoTradingActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 33945, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameStoreNintendoTradingActivity.this.isActive()) {
                super.onError(th2);
                GameStoreNintendoTradingActivity.i2(GameStoreNintendoTradingActivity.this);
                this.f84925b.setStatus(GameStoreNintendoTradingActivity.J3);
                if (GameStoreNintendoTradingActivity.this.f84916a0 <= 0) {
                    if (GameStoreNintendoTradingActivity.this.f84917b0 == GameStoreNintendoTradingActivity.this.W.size()) {
                        GameStoreNintendoTradingActivity.this.Z = "status_all_activate_succeed";
                    } else {
                        GameStoreNintendoTradingActivity.this.Z = "status_all_activate_failed";
                    }
                    GameStoreNintendoTradingActivity.W1(GameStoreNintendoTradingActivity.this);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33947, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((okhttp3.d0) obj);
        }
    }

    public class e implements kh.o<MallSwitchTokenObj, io.reactivex.z<okhttp3.d0>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f84927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f84928c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Map f84929d;

        e(Map map, Map map2, Map map3) {
            this.f84927b = map;
            this.f84928c = map2;
            this.f84929d = map3;
        }

        public io.reactivex.z<okhttp3.d0> a(MallSwitchTokenObj mallSwitchTokenObj) throws Exception {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallSwitchTokenObj}, this, changeQuickRedirect, false, 33948, new Class[]{MallSwitchTokenObj.class}, io.reactivex.z.class);
            if (patchProxyResultProxy.isSupported) {
                return (io.reactivex.z) patchProxyResultProxy.result;
            }
            this.f84927b.put("token", mallSwitchTokenObj.getRedeemable_token());
            return com.max.xiaoheihe.network.i.b(false).j1(this.f84928c, GameStoreNintendoTradingActivity.G2, this.f84929d, this.f84927b);
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [io.reactivex.z<okhttp3.d0>, java.lang.Object] */
        @Override // kh.o
        public /* bridge */ /* synthetic */ io.reactivex.z<okhttp3.d0> apply(MallSwitchTokenObj mallSwitchTokenObj) throws Exception {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallSwitchTokenObj}, this, changeQuickRedirect, false, 33949, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(mallSwitchTokenObj);
        }
    }

    public class f implements kh.o<String, MallSwitchTokenObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        public MallSwitchTokenObj a(String str) throws Exception {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 33950, new Class[]{String.class}, MallSwitchTokenObj.class);
            return patchProxyResultProxy.isSupported ? (MallSwitchTokenObj) patchProxyResultProxy.result : (MallSwitchTokenObj) com.max.hbutils.utils.k.a(str, MallSwitchTokenObj.class);
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [com.max.xiaoheihe.bean.mall.MallSwitchTokenObj, java.lang.Object] */
        @Override // kh.o
        public /* bridge */ /* synthetic */ MallSwitchTokenObj apply(String str) throws Exception {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 33951, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(str);
        }
    }

    public class g implements kh.o<okhttp3.d0, String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        public String a(okhttp3.d0 d0Var) throws Exception {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{d0Var}, this, changeQuickRedirect, false, 33952, new Class[]{okhttp3.d0.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            BufferedSource source = d0Var.getBodySource();
            try {
                return source.readString(Charset.forName("utf-8"));
            } finally {
                Util.closeQuietly(source);
            }
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.lang.String] */
        @Override // kh.o
        public /* bridge */ /* synthetic */ String apply(okhttp3.d0 d0Var) throws Exception {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{d0Var}, this, changeQuickRedirect, false, 33953, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(d0Var);
        }
    }

    public class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33954, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("key_list", GameStoreNintendoTradingActivity.this.W);
            GameStoreNintendoTradingActivity.this.setResult(-1, intent);
            GameStoreNintendoTradingActivity.this.finish();
        }
    }

    public class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33955, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("key_list", GameStoreNintendoTradingActivity.this.W);
            GameStoreNintendoTradingActivity.this.setResult(-1, intent);
            GameStoreNintendoTradingActivity.this.finish();
        }
    }

    public static class l extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<GameStoreNintendoTradingActivity> f84937a;

        public l(GameStoreNintendoTradingActivity gameStoreNintendoTradingActivity) {
            this.f84937a = new WeakReference<>(gameStoreNintendoTradingActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 33956, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            super.handleMessage(message);
            GameStoreNintendoTradingActivity gameStoreNintendoTradingActivity = this.f84937a.get();
            if (gameStoreNintendoTradingActivity != null) {
                gameStoreNintendoTradingActivity.u2();
            }
        }
    }

    static /* synthetic */ void R1(GameStoreNintendoTradingActivity gameStoreNintendoTradingActivity, String str, KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{gameStoreNintendoTradingActivity, str, keyDescObj}, null, changeQuickRedirect, true, 33936, new Class[]{GameStoreNintendoTradingActivity.class, String.class, KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreNintendoTradingActivity.l2(str, keyDescObj);
    }

    static /* synthetic */ int V1(GameStoreNintendoTradingActivity gameStoreNintendoTradingActivity) {
        int i10 = gameStoreNintendoTradingActivity.f84917b0;
        gameStoreNintendoTradingActivity.f84917b0 = i10 + 1;
        return i10;
    }

    static /* synthetic */ void W1(GameStoreNintendoTradingActivity gameStoreNintendoTradingActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreNintendoTradingActivity}, null, changeQuickRedirect, true, 33937, new Class[]{GameStoreNintendoTradingActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreNintendoTradingActivity.v2();
    }

    static /* synthetic */ void X1(GameStoreNintendoTradingActivity gameStoreNintendoTradingActivity, String str) {
        if (PatchProxy.proxy(new Object[]{gameStoreNintendoTradingActivity, str}, null, changeQuickRedirect, true, 33938, new Class[]{GameStoreNintendoTradingActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreNintendoTradingActivity.p2(str);
    }

    static /* synthetic */ void Z1(GameStoreNintendoTradingActivity gameStoreNintendoTradingActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreNintendoTradingActivity}, null, changeQuickRedirect, true, 33933, new Class[]{GameStoreNintendoTradingActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreNintendoTradingActivity.o2();
    }

    static /* synthetic */ void c2(GameStoreNintendoTradingActivity gameStoreNintendoTradingActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreNintendoTradingActivity}, null, changeQuickRedirect, true, 33934, new Class[]{GameStoreNintendoTradingActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreNintendoTradingActivity.r2();
    }

    static /* synthetic */ void e2(GameStoreNintendoTradingActivity gameStoreNintendoTradingActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreNintendoTradingActivity}, null, changeQuickRedirect, true, 33935, new Class[]{GameStoreNintendoTradingActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreNintendoTradingActivity.q2();
    }

    static /* synthetic */ int i2(GameStoreNintendoTradingActivity gameStoreNintendoTradingActivity) {
        int i10 = gameStoreNintendoTradingActivity.f84916a0;
        gameStoreNintendoTradingActivity.f84916a0 = i10 - 1;
        return i10;
    }

    private void l2(String str, KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{str, keyDescObj}, this, changeQuickRedirect, false, 33926, new Class[]{String.class, KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap(16);
        HashMap map2 = new HashMap(16);
        map.put("Cookie", str);
        HashMap map3 = new HashMap(16);
        map3.put("card_number", keyDescObj.getKey());
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.b(false).j1(map, f84913p3, map2, map3).z3(new g()).z3(new f()).k2(new e(map3, map, map2)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(keyDescObj)));
    }

    public static Intent m2(Context context, String str, String str2, ArrayList<KeyDescObj> arrayList, SwitchProxyObj switchProxyObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, arrayList, switchProxyObj}, null, changeQuickRedirect, true, 33922, new Class[]{Context.class, String.class, String.class, ArrayList.class, SwitchProxyObj.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) GameStoreNintendoTradingActivity.class);
        intent.putExtra(R3, str);
        intent.putExtra(S3, str2);
        intent.putExtra("keys", arrayList);
        intent.putExtra("proxy", switchProxyObj);
        return intent;
    }

    public static Intent n2(Context context, String str, String str2, ArrayList<KeyDescObj> arrayList, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, arrayList, str3}, null, changeQuickRedirect, true, 33923, new Class[]{Context.class, String.class, String.class, ArrayList.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) GameStoreNintendoTradingActivity.class);
        intent.putExtra(R3, str);
        intent.putExtra(S3, str2);
        intent.putExtra("keys", arrayList);
        intent.putExtra(V3, str3);
        return intent;
    }

    private void o2() {
        Dialog dialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33928, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f84921y1.removeCallbacksAndMessages(null);
        if (this.f66601b.isFinishing() || (dialog = this.f84920x1) == null || !dialog.isShowing()) {
            return;
        }
        this.f84920x1.dismiss();
    }

    private void p2(String str) {
        WebviewFragment webviewFragment;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 33932, new Class[]{String.class}, Void.TYPE).isSupported || (webviewFragment = (WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            return;
        }
        webviewFragment.t7(str);
    }

    private void q2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33927, new Class[0], Void.TYPE).isSupported || this.f66601b.isFinishing()) {
            return;
        }
        if (this.f84920x1 == null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f66601b);
            View viewInflate = this.f66602c.inflate(R.layout.dialog_activation, (ViewGroup) null, false);
            this.L = (ProgressBar) viewInflate.findViewById(R.id.pb_title);
            this.M = (TextView) viewInflate.findViewById(R.id.tv_title);
            this.N = viewInflate.findViewById(R.id.vg_progress_desc_0);
            this.O = (TextView) viewInflate.findViewById(R.id.tv_progress_0);
            this.P = (TextView) viewInflate.findViewById(R.id.tv_progress_desc_0);
            this.Q = (TextView) viewInflate.findViewById(R.id.tv_progress_checked_0);
            this.R = (ImageView) viewInflate.findViewById(R.id.pb_0);
            this.S = viewInflate.findViewById(R.id.vg_button_panel);
            this.T = (TextView) viewInflate.findViewById(R.id.tv_negative_button);
            this.U = (TextView) viewInflate.findViewById(R.id.tv_positive_button);
            bb.d.d(this.Q, 0);
            this.Q.setText(lb.b.f131100p);
            this.T.setOnClickListener(new h());
            this.U.setOnClickListener(new i());
            AlertDialog alertDialogCreate = builder.setView(viewInflate).setCancelable(false).create();
            this.f84920x1 = alertDialogCreate;
            Window window = alertDialogCreate.getWindow();
            if (window != null) {
                window.setBackgroundDrawableResource(android.R.color.transparent);
            }
        }
        if (this.f84920x1.isShowing()) {
            return;
        }
        this.f84920x1.show();
        v2();
        this.f84921y1.removeCallbacksAndMessages(null);
        this.f84921y1.sendEmptyMessageDelayed(0, 10000L);
    }

    private void r2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33931, new Class[0], Void.TYPE).isSupported || this.f66601b.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f66601b).y(getString(R.string.activate_failed)).l(getString(R.string.activate_failed_region_error)).u(getString(R.string.login), new b()).o(getString(R.string.do_return), new a()).g(false).F();
    }

    private void v2() {
        Dialog dialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33929, new Class[0], Void.TYPE).isSupported || (dialog = this.f84920x1) == null || !dialog.isShowing()) {
            return;
        }
        int color = getResources().getColor(R.color.text_secondary_1_color);
        int color2 = getResources().getColor(R.color.interactive_color);
        int color3 = getResources().getColor(R.color.badge_bg_color);
        if ("status_activating".equals(this.Z)) {
            this.L.setVisibility(0);
            this.M.setText(getString(R.string.activating_please_wait));
            this.O.setText(getString(R.string.recharge_card_activating));
            this.O.setTextColor(color);
            this.P.setTextColor(color);
            AnimationDrawable animationDrawable = (AnimationDrawable) getResources().getDrawable(R.drawable.pb_loading);
            this.R.setImageDrawable(animationDrawable);
            animationDrawable.start();
            this.S.setVisibility(8);
        } else if ("status_all_activate_succeed".equals(this.Z)) {
            this.L.setVisibility(8);
            this.M.setText(getString(R.string.activate_success));
            this.O.setText(getString(R.string.all_activated));
            this.O.setTextColor(color2);
            this.P.setTextColor(color2);
            this.R.setImageResource(R.color.interactive_color);
            this.S.setVisibility(0);
            this.T.setVisibility(0);
            this.T.setOnClickListener(new j());
            this.U.setVisibility(8);
        } else if ("status_all_activate_failed".equals(this.Z)) {
            this.L.setVisibility(8);
            this.M.setText(getString(R.string.activate_failed));
            this.O.setText(getString(R.string.activate_failed));
            this.O.setTextColor(color3);
            this.P.setTextColor(color3);
            this.R.setImageDrawable((AnimationDrawable) getResources().getDrawable(R.drawable.pb_loading_timeout));
            this.S.setVisibility(0);
            this.U.setVisibility(0);
            this.U.setOnClickListener(new k());
            this.T.setVisibility(8);
        }
        this.P.setText(String.format(Locale.US, "%d / %d", Integer.valueOf(this.f84917b0), Integer.valueOf(this.W.size())));
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33924, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_game_store_nintendo_trading);
        ButterKnife.a(this);
        this.V = getIntent().getStringExtra(R3);
        String stringExtra = getIntent().getStringExtra(S3);
        this.W = (ArrayList) getIntent().getSerializableExtra("keys");
        this.X = (SwitchProxyObj) getIntent().getSerializableExtra("proxy");
        this.Y = getIntent().getStringExtra(V3);
        this.Z = "status_not_activate";
        this.f84916a0 = this.W.size();
        if (com.max.hbcommon.utils.c.u(this.Y)) {
            SwitchProxyObj switchProxyObj = this.X;
            if (switchProxyObj != null) {
                String strC = com.max.hbcommon.utils.e.c(this.X.getP1(), com.max.xiaoheihe.utils.w.c(switchProxyObj.getP3()));
                if (com.max.xiaoheihe.utils.d.a1(strC).equals(this.X.getP2())) {
                    String[] strArrSplit = strC.split(":");
                    if (strArrSplit.length > 1) {
                        this.f84918c0 = strArrSplit[0];
                        this.f84919p1 = strArrSplit[1];
                    }
                }
            }
        } else {
            String[] strArrSplit2 = this.Y.split(":");
            if (strArrSplit2.length > 1) {
                this.f84918c0 = strArrSplit2[0];
                this.f84919p1 = strArrSplit2[1];
            }
        }
        this.f66616q.setTitle(getString(R.string.loading));
        this.f66617r.setVisibility(0);
        if (((WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            WebviewFragment webviewFragmentA = new com.max.xiaoheihe.module.webview.u(this.V).p(WebviewFragment.W4).q(stringExtra).t(new ProxyAddressObj(this.f84918c0, this.f84919p1)).a();
            webviewFragmentA.Y7(new c());
            getSupportFragmentManager().u().b(R.id.fragment_container, webviewFragmentA).m();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33925, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f84921y1.removeCallbacksAndMessages(null);
        o2();
        super.onDestroy();
    }

    public void u2() {
        Dialog dialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33930, new Class[0], Void.TYPE).isSupported || (dialog = this.f84920x1) == null || !dialog.isShowing() || this.S == null) {
            return;
        }
        this.f84920x1.setCancelable(true);
    }
}
