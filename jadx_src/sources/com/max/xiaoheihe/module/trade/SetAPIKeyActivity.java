package com.max.xiaoheihe.module.trade;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.PostEncryptParamsObj;
import com.max.hbcommon.network.q;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.trade.TradeSteamParams;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: SetAPIKeyActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class SetAPIKeyActivity extends BaseActivity {

    @dl.d
    public static final a T = new a(null);
    public static final int U = 8;
    private static final int V = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private EditText L;
    private TextView M;
    private TextView N;
    private WebView O;
    private boolean P;
    private boolean Q;
    private boolean R = true;

    @dl.e
    private String S;

    /* JADX INFO: compiled from: SetAPIKeyActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final Intent a(@dl.d Context context, boolean z10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 44629, new Class[]{Context.class, Boolean.TYPE}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) SetAPIKeyActivity.class);
            intent.putExtra("api_key", z10);
            return intent;
        }

        public final int b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44628, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : SetAPIKeyActivity.V;
        }
    }

    /* JADX INFO: compiled from: SetAPIKeyActivity.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<TradeSteamParams>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 44630, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (SetAPIKeyActivity.this.isActive()) {
                super.onError(e10);
                SetAPIKeyActivity.Z1(SetAPIKeyActivity.this);
            }
        }

        public void onNext(@dl.d Result<TradeSteamParams> result) {
            String html;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44631, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (SetAPIKeyActivity.this.isActive()) {
                SetAPIKeyActivity.Y1(SetAPIKeyActivity.this);
                TradeSteamParams result2 = result.getResult();
                if (result2 == null || (html = result2.getHtml()) == null) {
                    return;
                }
                WebView webView = SetAPIKeyActivity.this.O;
                if (webView == null) {
                    f0.S("tv_desc");
                    webView = null;
                }
                webView.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44632, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeSteamParams>) obj);
        }
    }

    /* JADX INFO: compiled from: SetAPIKeyActivity.kt */
    public static final class c implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@dl.d Editable s10) {
            if (PatchProxy.proxy(new Object[]{s10}, this, changeQuickRedirect, false, 44635, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(s10, "s");
            if (SetAPIKeyActivity.this.R) {
                SetAPIKeyActivity.this.Q = true;
                TextView textView = SetAPIKeyActivity.this.N;
                if (textView == null) {
                    f0.S("tv_btn_confirm");
                    textView = null;
                }
                textView.setEnabled(s10.length() > 0);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@dl.d CharSequence s10, int i10, int i11, int i12) {
            Object[] objArr = {s10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 44633, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(s10, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@dl.d CharSequence s10, int i10, int i11, int i12) {
            Object[] objArr = {s10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 44634, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(s10, "s");
        }
    }

    /* JADX INFO: compiled from: SetAPIKeyActivity.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44636, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (SetAPIKeyActivity.this.Q) {
                SetAPIKeyActivity setAPIKeyActivity = SetAPIKeyActivity.this;
                EditText editText = setAPIKeyActivity.L;
                if (editText == null) {
                    f0.S("et_info");
                    editText = null;
                }
                setAPIKeyActivity.e2(editText.getText().toString());
                return;
            }
            String str = SetAPIKeyActivity.this.S;
            if (str != null) {
                SetAPIKeyActivity.this.e2(str);
                return;
            }
            SetAPIKeyActivity setAPIKeyActivity2 = SetAPIKeyActivity.this;
            com.max.hbutils.utils.c.f("成功");
            setAPIKeyActivity2.finish();
        }
    }

    /* JADX INFO: compiled from: SetAPIKeyActivity.kt */
    public static final class e extends WebViewClient {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@dl.d WebView view, @dl.d String url) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, url}, this, changeQuickRedirect, false, 44640, new Class[]{WebView.class, String.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(view, "view");
            f0.p(url, "url");
            Activity mContext = ((BaseActivity) SetAPIKeyActivity.this).f66601b;
            f0.o(mContext, "mContext");
            com.max.xiaoheihe.base.router.b.l0(mContext, url, view, null, null);
            return true;
        }
    }

    /* JADX INFO: compiled from: SetAPIKeyActivity.kt */
    public static final class f extends q {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.hbcommon.network.q
        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44641, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            super.onNext((Result) result);
            SetAPIKeyActivity.this.setResult(-1);
            SetAPIKeyActivity.this.finish();
        }

        @Override // com.max.hbcommon.network.q, com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44642, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    public static final /* synthetic */ void Y1(SetAPIKeyActivity setAPIKeyActivity) {
        if (PatchProxy.proxy(new Object[]{setAPIKeyActivity}, null, changeQuickRedirect, true, 44627, new Class[]{SetAPIKeyActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        setAPIKeyActivity.x1();
    }

    public static final /* synthetic */ void Z1(SetAPIKeyActivity setAPIKeyActivity) {
        if (PatchProxy.proxy(new Object[]{setAPIKeyActivity}, null, changeQuickRedirect, true, 44626, new Class[]{SetAPIKeyActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        setAPIKeyActivity.C1();
    }

    private final void a2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44620, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = findViewById(R.id.et_info);
        f0.o(viewFindViewById, "findViewById(R.id.et_info)");
        this.L = (EditText) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.tv_auto_fetch);
        f0.o(viewFindViewById2, "findViewById(R.id.tv_auto_fetch)");
        this.M = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.tv_btn_confirm);
        f0.o(viewFindViewById3, "findViewById(R.id.tv_btn_confirm)");
        this.N = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.tv_desc);
        f0.o(viewFindViewById4, "findViewById(R.id.tv_desc)");
        this.O = (WebView) viewFindViewById4;
    }

    private final void b2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44622, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) i.a().t9(TradeAutoGetInfoActivity.L3.b()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final void c2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44621, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        EditText editText = this.L;
        WebView webView = null;
        if (editText == null) {
            f0.S("et_info");
            editText = null;
        }
        editText.setHint("请输入API Key");
        EditText editText2 = this.L;
        if (editText2 == null) {
            f0.S("et_info");
            editText2 = null;
        }
        editText2.setInputType(129);
        if (this.P) {
            EditText editText3 = this.L;
            if (editText3 == null) {
                f0.S("et_info");
                editText3 = null;
            }
            editText3.setText("1234567890");
            EditText editText4 = this.L;
            if (editText4 == null) {
                f0.S("et_info");
                editText4 = null;
            }
            editText4.setSelection(10);
            TextView textView = this.N;
            if (textView == null) {
                f0.S("tv_btn_confirm");
                textView = null;
            }
            textView.setEnabled(true);
        }
        EditText editText5 = this.L;
        if (editText5 == null) {
            f0.S("et_info");
            editText5 = null;
        }
        editText5.addTextChangedListener(new c());
        TextView textView2 = this.N;
        if (textView2 == null) {
            f0.S("tv_btn_confirm");
            textView2 = null;
        }
        textView2.setOnClickListener(new d());
        TextView textView3 = this.M;
        if (textView3 == null) {
            f0.S("tv_auto_fetch");
            textView3 = null;
        }
        textView3.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.trade.SetAPIKeyActivity$initView$3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44637, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Activity mContext = ((BaseActivity) this.f92611b).f66601b;
                f0.o(mContext, "mContext");
                final SetAPIKeyActivity setAPIKeyActivity = this.f92611b;
                TradeInfoUtilKt.b0(mContext, false, null, null, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.SetAPIKeyActivity$initView$3.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44639, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44638, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        Activity activity = ((BaseActivity) setAPIKeyActivity).f66601b;
                        TradeAutoGetInfoActivity.b bVar = TradeAutoGetInfoActivity.L3;
                        activity.startActivityForResult(bVar.d(((BaseActivity) setAPIKeyActivity).f66601b, bVar.b()), SetAPIKeyActivity.T.b());
                    }
                }, 14, null);
            }
        });
        WebView webView2 = this.O;
        if (webView2 == null) {
            f0.S("tv_desc");
        } else {
            webView = webView2;
        }
        webView.setWebViewClient(new e());
    }

    public final void e2(@dl.d String api_key) {
        if (PatchProxy.proxy(new Object[]{api_key}, this, changeQuickRedirect, false, 44624, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(api_key, "api_key");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("api_key", api_key);
        PostEncryptParamsObj postEncryptParamsObjU0 = com.max.xiaoheihe.utils.d.u0(k.p(jsonObject));
        V((io.reactivex.disposables.b) i.a().j3(postEncryptParamsObjU0.getData(), postEncryptParamsObjU0.getKey(), postEncryptParamsObjU0.getSid(), postEncryptParamsObjU0.getTime()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44619, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_set_trade_url);
        this.P = getIntent().getBooleanExtra("api_key", false);
        this.f66616q.setTitle("API Key设置");
        this.f66617r.setVisibility(0);
        a2();
        c2();
        E1();
        b2();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44623, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        b2();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 44625, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i10 == V && i11 == -1 && intent != null) {
            this.S = intent.getStringExtra(TradeAutoGetInfoActivity.L3.b());
            this.R = false;
            EditText editText = this.L;
            TextView textView = null;
            if (editText == null) {
                f0.S("et_info");
                editText = null;
            }
            editText.setText("1234567890");
            EditText editText2 = this.L;
            if (editText2 == null) {
                f0.S("et_info");
                editText2 = null;
            }
            editText2.setSelection(10);
            TextView textView2 = this.N;
            if (textView2 == null) {
                f0.S("tv_btn_confirm");
            } else {
                textView = textView2;
            }
            textView.setEnabled(true);
            this.R = true;
        }
    }
}
