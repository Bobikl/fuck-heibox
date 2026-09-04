package com.max.xiaoheihe.module.trade;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.EncryptionParamsObj;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.SteamAcceptGameParams;
import com.max.xiaoheihe.bean.trade.TradeSteamParams;
import com.max.xiaoheihe.module.bbs.post.PostPageFactory;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.max.xiaoheihe.network.i;
import com.max.xiaoheihe.utils.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: TradeHandleOfferActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class TradeHandleOfferActivity extends BaseActivity implements com.max.xiaoheihe.app.c {

    @dl.d
    public static final a P = new a(null);
    public static final int Q = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private String L;

    @dl.e
    private String M;

    @dl.e
    private SteamAcceptGameParams N;
    private boolean O;

    /* JADX INFO: compiled from: TradeHandleOfferActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final Intent a(@dl.e Context context, @dl.d String page_url, @dl.e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, page_url, str}, this, changeQuickRedirect, false, 45172, new Class[]{Context.class, String.class, String.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(page_url, "page_url");
            Intent intent = new Intent(context, (Class<?>) TradeHandleOfferActivity.class);
            intent.putExtra(PostPageFactory.f81483s, page_url);
            intent.putExtra("create_time", str);
            return intent;
        }
    }

    /* JADX INFO: compiled from: TradeHandleOfferActivity.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<TradeSteamParams>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45173, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradeHandleOfferActivity.this.isActive()) {
                super.onError(e10);
                TradeHandleOfferActivity.W1(TradeHandleOfferActivity.this);
            }
        }

        public void onNext(@dl.d Result<TradeSteamParams> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45174, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradeHandleOfferActivity.this.isActive()) {
                TradeHandleOfferActivity tradeHandleOfferActivity = TradeHandleOfferActivity.this;
                TradeSteamParams result2 = result.getResult();
                String str = null;
                tradeHandleOfferActivity.N = result2 != null ? result2.getData() : null;
                TradeHandleOfferActivity.V1(TradeHandleOfferActivity.this);
                Fragment fragmentR0 = TradeHandleOfferActivity.this.getSupportFragmentManager().r0(R.id.fragment_container);
                if (fragmentR0 != null) {
                    WebviewFragment webviewFragment = (WebviewFragment) fragmentR0;
                    String str2 = TradeHandleOfferActivity.this.L;
                    if (str2 == null) {
                        f0.S(PostPageFactory.f81483s);
                    } else {
                        str = str2;
                    }
                    webviewFragment.t7(str);
                    return;
                }
                String str3 = TradeHandleOfferActivity.this.L;
                if (str3 == null) {
                    f0.S(PostPageFactory.f81483s);
                } else {
                    str = str3;
                }
                WebviewFragment webviewFragmentU7 = WebviewFragment.u7(str);
                TradeHandleOfferActivity.T1(TradeHandleOfferActivity.this, webviewFragmentU7);
                TradeHandleOfferActivity.this.getSupportFragmentManager().u().y(R.id.fragment_container, webviewFragmentU7).n();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45175, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeSteamParams>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeHandleOfferActivity.kt */
    public static final class c extends WebviewFragment.o0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void e(@dl.e WebView webView, @dl.d String url) {
            String regular;
            boolean z10 = false;
            if (PatchProxy.proxy(new Object[]{webView, url}, this, changeQuickRedirect, false, 45176, new Class[]{WebView.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(url, "url");
            if (TradeHandleOfferActivity.this.N != null) {
                SteamAcceptGameParams steamAcceptGameParams = TradeHandleOfferActivity.this.N;
                if (steamAcceptGameParams != null && (regular = steamAcceptGameParams.getRegular()) != null && new Regex(regular).b(url)) {
                    z10 = true;
                }
                if (z10) {
                    SteamAcceptGameParams steamAcceptGameParams2 = TradeHandleOfferActivity.this.N;
                    EncryptionParamsObj js = steamAcceptGameParams2 != null ? steamAcceptGameParams2.getJs() : null;
                    f0.m(js);
                    String js2 = com.max.hbcommon.utils.e.c(js.getP1(), w.c(js.getP3()));
                    if (f0.g(com.max.xiaoheihe.utils.d.a1(js2), js.getP2())) {
                        TradeHandleOfferActivity tradeHandleOfferActivity = TradeHandleOfferActivity.this;
                        f0.o(js2, "js");
                        TradeHandleOfferActivity.M1(tradeHandleOfferActivity, js2);
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: TradeHandleOfferActivity.kt */
    public static final class d extends WebviewFragment.o0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.xiaoheihe.module.webview.WebviewFragment.o0
        public void g(@dl.d WebView view, @dl.d String url, int i10, int i11) {
            String regular;
            boolean z10 = false;
            Object[] objArr = {view, url, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 45177, new Class[]{WebView.class, String.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(view, "view");
            f0.p(url, "url");
            if (i11 - 1 != 0 || TradeHandleOfferActivity.this.N == null) {
                return;
            }
            SteamAcceptGameParams steamAcceptGameParams = TradeHandleOfferActivity.this.N;
            if (steamAcceptGameParams != null && (regular = steamAcceptGameParams.getRegular()) != null && new Regex(regular).b(url)) {
                z10 = true;
            }
            if (z10) {
                SteamAcceptGameParams steamAcceptGameParams2 = TradeHandleOfferActivity.this.N;
                EncryptionParamsObj js = steamAcceptGameParams2 != null ? steamAcceptGameParams2.getJs() : null;
                f0.m(js);
                String js2 = com.max.hbcommon.utils.e.c(js.getP1(), w.c(js.getP3()));
                if (f0.g(com.max.xiaoheihe.utils.d.a1(js2), js.getP2())) {
                    TradeHandleOfferActivity tradeHandleOfferActivity = TradeHandleOfferActivity.this;
                    f0.o(js2, "js");
                    TradeHandleOfferActivity.M1(tradeHandleOfferActivity, js2);
                }
            }
        }
    }

    /* JADX INFO: compiled from: TradeHandleOfferActivity.kt */
    public static final class e implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45178, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            TradeHandleOfferActivity.this.O = true;
            dialogInterface.dismiss();
        }
    }

    public static final /* synthetic */ void M1(TradeHandleOfferActivity tradeHandleOfferActivity, String str) {
        if (PatchProxy.proxy(new Object[]{tradeHandleOfferActivity, str}, null, changeQuickRedirect, true, 45171, new Class[]{TradeHandleOfferActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeHandleOfferActivity.Y1(str);
    }

    public static final /* synthetic */ void T1(TradeHandleOfferActivity tradeHandleOfferActivity, WebviewFragment webviewFragment) {
        if (PatchProxy.proxy(new Object[]{tradeHandleOfferActivity, webviewFragment}, null, changeQuickRedirect, true, 45170, new Class[]{TradeHandleOfferActivity.class, WebviewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeHandleOfferActivity.a2(webviewFragment);
    }

    public static final /* synthetic */ void V1(TradeHandleOfferActivity tradeHandleOfferActivity) {
        if (PatchProxy.proxy(new Object[]{tradeHandleOfferActivity}, null, changeQuickRedirect, true, 45169, new Class[]{TradeHandleOfferActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeHandleOfferActivity.x1();
    }

    public static final /* synthetic */ void W1(TradeHandleOfferActivity tradeHandleOfferActivity) {
        if (PatchProxy.proxy(new Object[]{tradeHandleOfferActivity}, null, changeQuickRedirect, true, 45168, new Class[]{TradeHandleOfferActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeHandleOfferActivity.C1();
    }

    private final void Y1(String str) {
        WebviewFragment webviewFragment;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 45164, new Class[]{String.class}, Void.TYPE).isSupported || (webviewFragment = (WebviewFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            return;
        }
        webviewFragment.H6(str, null);
    }

    private final void Z1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45161, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) i.a().t9("confirm_tradeoffer").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final void a2(WebviewFragment webviewFragment) {
        if (PatchProxy.proxy(new Object[]{webviewFragment}, this, changeQuickRedirect, false, 45163, new Class[]{WebviewFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        webviewFragment.Y7(new c());
    }

    @Override // com.max.xiaoheihe.app.c
    public /* synthetic */ void P(Activity activity) {
        com.max.xiaoheihe.app.b.a(this, activity);
    }

    public final void X1() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45166, new Class[0], Void.TYPE).isSupported && this.O) {
            String str = this.M;
            if (str == null || str.length() == 0) {
                return;
            }
            this.O = false;
            String strI = com.max.hbutils.utils.w.i(this.M, "yyyy-MM-dd");
            com.max.hbutils.utils.c.f73533a.e("买家加入时间：" + strI, "请务必在令牌确认页面内仔细核对时间！");
        }
    }

    @Override // com.max.xiaoheihe.app.c
    public void Y(@dl.d Activity activity) {
        if (PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 45167, new Class[]{Activity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        X1();
    }

    @Override // com.max.xiaoheihe.app.c
    public /* synthetic */ void b0(Activity activity) {
        com.max.xiaoheihe.app.b.b(this, activity);
    }

    public final void b2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45165, new Class[0], Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing()) {
            return;
        }
        String str = this.M;
        if (str == null || str.length() == 0) {
            return;
        }
        View viewInflate = LayoutInflater.from(this.f66601b).inflate(R.layout.dialog_trade_offer_token_confirm, (ViewGroup) null, false);
        viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_desc);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_year_desc);
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.tv_month_desc);
        TextView textView5 = (TextView) viewInflate.findViewById(R.id.tv_day_desc);
        bb.d.d(textView3, 5);
        bb.d.d(textView4, 5);
        bb.d.d(textView5, 5);
        textView.setText("请前往Steam APP完成令牌确认\n并核对买家加入时间");
        textView2.setText("如有异常请立刻拒绝报价，谨防被骗");
        textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.delete_red));
        String strI = com.max.hbutils.utils.w.i(this.M, "yyyy-MM-dd");
        List listU4 = strI != null ? StringsKt__StringsKt.U4(strI, new String[]{Constants.ACCEPT_TIME_SEPARATOR_SERVER}, false, 0, 6, null) : null;
        if (listU4 != null) {
            textView3.setText((CharSequence) listU4.get(0));
            textView4.setText((CharSequence) listU4.get(1));
            textView5.setText((CharSequence) listU4.get(2));
        }
        com.max.hbcommon.view.a.f fVarI = new com.max.hbcommon.view.a.f(this.f66601b).i(viewInflate);
        fVarI.u("我知道了", new e());
        fVarI.F();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45160, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_fragment_container);
        this.f66616q.setTitle("回应报价");
        Z0().setBackgroundColor(com.max.xiaoheihe.utils.d.E(R.color.white));
        String stringExtra = getIntent().getStringExtra(PostPageFactory.f81483s);
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.L = stringExtra;
        this.M = getIntent().getStringExtra("create_time");
        E1();
        Z1();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45162, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        Z1();
    }

    @Override // com.max.xiaoheihe.app.c
    public /* synthetic */ void u(Activity activity) {
        com.max.xiaoheihe.app.b.d(this, activity);
    }
}
