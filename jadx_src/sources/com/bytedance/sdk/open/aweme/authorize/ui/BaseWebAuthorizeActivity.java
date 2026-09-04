package com.bytedance.sdk.open.aweme.authorize.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.open.aweme.R;
import com.bytedance.sdk.open.aweme.authorize.model.Authorization;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseWebAuthorizeActivity extends Activity implements j7.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f42232q = "id";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f42233r = "layout";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f42234s = "string";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f42235t = "wap_authorize_url";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f42236u = 100;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WebView f42240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Authorization.Request f42241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AlertDialog f42242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RelativeLayout f42243h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RelativeLayout f42244i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public FrameLayout f42245j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f42246k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f42247l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Context f42250o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ImageView f42251p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42237b = -12;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42238c = -13;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42239d = -15;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f42248m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f42249n = false;

    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            BaseWebAuthorizeActivity baseWebAuthorizeActivity = BaseWebAuthorizeActivity.this;
            baseWebAuthorizeActivity.f42247l = false;
            WebView webView2 = baseWebAuthorizeActivity.f42240e;
            if (webView2 == null || webView2.getProgress() != 100) {
                return;
            }
            BaseWebAuthorizeActivity.this.G();
            if (BaseWebAuthorizeActivity.this.f42246k == 0) {
                BaseWebAuthorizeActivity baseWebAuthorizeActivity2 = BaseWebAuthorizeActivity.this;
                if (baseWebAuthorizeActivity2.f42249n) {
                    return;
                }
                o7.c.a(baseWebAuthorizeActivity2.f42240e, 0);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            BaseWebAuthorizeActivity baseWebAuthorizeActivity = BaseWebAuthorizeActivity.this;
            if (baseWebAuthorizeActivity.f42247l) {
                return;
            }
            baseWebAuthorizeActivity.f42246k = 0;
            BaseWebAuthorizeActivity baseWebAuthorizeActivity2 = BaseWebAuthorizeActivity.this;
            baseWebAuthorizeActivity2.f42247l = true;
            baseWebAuthorizeActivity2.F();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            BaseWebAuthorizeActivity.this.f42246k = i10;
            BaseWebAuthorizeActivity baseWebAuthorizeActivity = BaseWebAuthorizeActivity.this;
            baseWebAuthorizeActivity.D(baseWebAuthorizeActivity.f42239d);
            BaseWebAuthorizeActivity.this.f42249n = true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            BaseWebAuthorizeActivity.this.E(sslErrorHandler, sslError);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!BaseWebAuthorizeActivity.this.v()) {
                BaseWebAuthorizeActivity baseWebAuthorizeActivity = BaseWebAuthorizeActivity.this;
                baseWebAuthorizeActivity.D(baseWebAuthorizeActivity.f42237b);
            } else {
                if (BaseWebAuthorizeActivity.this.q(str)) {
                    return true;
                }
                BaseWebAuthorizeActivity.this.f42240e.loadUrl(str);
            }
            return true;
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseWebAuthorizeActivity.this.w(-2);
        }
    }

    public class c implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SslErrorHandler f42254b;

        public c(SslErrorHandler sslErrorHandler) {
            this.f42254b = sslErrorHandler;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            BaseWebAuthorizeActivity.this.h(this.f42254b);
        }
    }

    public class d implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SslErrorHandler f42256b;

        public d(SslErrorHandler sslErrorHandler) {
            this.f42256b = sslErrorHandler;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            BaseWebAuthorizeActivity.this.h(this.f42256b);
        }
    }

    public class e implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f42258b;

        public e(int i10) {
            this.f42258b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseWebAuthorizeActivity.this.w(this.f42258b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q(String str) {
        Authorization.Request request;
        String str2;
        if (TextUtils.isEmpty(str) || (request = this.f42241f) == null || (str2 = request.redirectUri) == null || !str.startsWith(str2)) {
            return false;
        }
        Uri uri = Uri.parse(str);
        String queryParameter = uri.getQueryParameter("code");
        String queryParameter2 = uri.getQueryParameter("state");
        String queryParameter3 = uri.getQueryParameter(i7.a.i.f119321p);
        if (!TextUtils.isEmpty(queryParameter)) {
            z(queryParameter, queryParameter2, queryParameter3, 0);
            return true;
        }
        String queryParameter4 = uri.getQueryParameter(i7.a.i.f119320o);
        int i10 = -1;
        if (!TextUtils.isEmpty(queryParameter4)) {
            try {
                i10 = Integer.parseInt(queryParameter4);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        x("", i10);
        return false;
    }

    private void t() {
        this.f42244i = (RelativeLayout) findViewById(R.id.open_rl_container);
        int i10 = R.id.open_header_view;
        this.f42243h = (RelativeLayout) findViewById(i10);
        ImageView imageView = (ImageView) findViewById(R.id.cancel);
        this.f42251p = imageView;
        imageView.setOnClickListener(new b());
        C();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.open_loading_group);
        this.f42245j = frameLayout;
        View viewN = n(frameLayout);
        if (viewN != null) {
            this.f42245j.removeAllViews();
            this.f42245j.addView(viewN);
        }
        u(this);
        if (this.f42240e.getParent() != null) {
            ((ViewGroup) this.f42240e.getParent()).removeView(this.f42240e);
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f42240e.getLayoutParams();
        layoutParams.addRule(3, i10);
        this.f42240e.setLayoutParams(layoutParams);
        this.f42240e.setVisibility(4);
        this.f42244i.addView(this.f42240e);
    }

    private void u(Context context) {
        this.f42240e = new WebView(context);
        this.f42240e.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        WebSettings settings = this.f42240e.getSettings();
        settings.setDomStorageEnabled(true);
        settings.setCacheMode(-1);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setAllowFileAccess(false);
    }

    private void x(String str, int i10) {
        y(str, null, i10);
    }

    private void y(String str, String str2, int i10) {
        Authorization.Response response = new Authorization.Response();
        response.authCode = str;
        response.errorCode = i10;
        response.state = str2;
        A(this.f42241f, response);
        finish();
    }

    private void z(String str, String str2, String str3, int i10) {
        Authorization.Response response = new Authorization.Response();
        response.authCode = str;
        response.errorCode = i10;
        response.state = str2;
        response.grantedPermissions = str3;
        A(this.f42241f, response);
        finish();
    }

    public abstract void A(Authorization.Request request, k7.b bVar);

    public boolean B(String str, Authorization.Request request, k7.b bVar) {
        if (bVar == null || this.f42250o == null || request == null || !bVar.checkArgs()) {
            return false;
        }
        Bundle bundle = new Bundle();
        bVar.toBundle(bundle);
        String packageName = this.f42250o.getPackageName();
        String strA = TextUtils.isEmpty(request.callerLocalEntry) ? n7.a.a(packageName, str) : request.callerLocalEntry;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(packageName, strA));
        intent.putExtras(bundle);
        intent.addFlags(67108864);
        intent.addFlags(536870912);
        try {
            this.f42250o.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void C() {
        RelativeLayout relativeLayout = this.f42244i;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(Color.parseColor("#ffffff"));
        }
    }

    public void D(int i10) {
        AlertDialog alertDialog = this.f42242g;
        if (alertDialog == null || !alertDialog.isShowing()) {
            if (this.f42242g == null) {
                View viewInflate = LayoutInflater.from(this).inflate(R.layout.layout_open_network_error_dialog, (ViewGroup) null, false);
                viewInflate.findViewById(R.id.tv_confirm).setOnClickListener(new e(i10));
                this.f42242g = new AlertDialog.Builder(new ContextThemeWrapper(this, android.R.style.Theme.Holo)).setView(viewInflate).setCancelable(false).create();
            }
            if (isFinishing()) {
                return;
            }
            this.f42242g.show();
        }
    }

    public void E(SslErrorHandler sslErrorHandler, SslError sslError) {
        Context context;
        int i10;
        try {
            AlertDialog alertDialogCreate = new AlertDialog.Builder(this.f42250o).create();
            String string = this.f42250o.getString(R.string.aweme_open_ssl_error);
            int primaryError = sslError.getPrimaryError();
            if (primaryError == 0) {
                context = this.f42250o;
                i10 = R.string.aweme_open_ssl_notyetvalid;
            } else if (primaryError == 1) {
                context = this.f42250o;
                i10 = R.string.aweme_open_ssl_expired;
            } else {
                if (primaryError != 2) {
                    if (primaryError == 3) {
                        context = this.f42250o;
                        i10 = R.string.aweme_open_ssl_untrusted;
                    }
                    String str = string + this.f42250o.getString(R.string.aweme_open_ssl_continue);
                    alertDialogCreate.setTitle(R.string.aweme_open_ssl_warning);
                    alertDialogCreate.setTitle(str);
                    alertDialogCreate.setButton(-1, this.f42250o.getString(R.string.aweme_open_ssl_ok), new c(sslErrorHandler));
                    alertDialogCreate.setButton(-2, this.f42250o.getString(R.string.aweme_open_ssl_cancel), new d(sslErrorHandler));
                    alertDialogCreate.setCanceledOnTouchOutside(false);
                    alertDialogCreate.show();
                }
                context = this.f42250o;
                i10 = R.string.aweme_open_ssl_mismatched;
            }
            string = context.getString(i10);
            String str2 = string + this.f42250o.getString(R.string.aweme_open_ssl_continue);
            alertDialogCreate.setTitle(R.string.aweme_open_ssl_warning);
            alertDialogCreate.setTitle(str2);
            alertDialogCreate.setButton(-1, this.f42250o.getString(R.string.aweme_open_ssl_ok), new c(sslErrorHandler));
            alertDialogCreate.setButton(-2, this.f42250o.getString(R.string.aweme_open_ssl_cancel), new d(sslErrorHandler));
            alertDialogCreate.setCanceledOnTouchOutside(false);
            alertDialogCreate.show();
        } catch (Exception unused) {
            h(sslErrorHandler);
        }
    }

    public void F() {
        o7.c.a(this.f42245j, 0);
    }

    public void G() {
        o7.c.a(this.f42245j, 8);
    }

    @Override // j7.a
    public void a(k7.a aVar) {
        if (aVar instanceof Authorization.Request) {
            Authorization.Request request = (Authorization.Request) aVar;
            this.f42241f = request;
            request.redirectUri = "https://" + l() + i7.a.f119233e;
            setRequestedOrientation(-1);
        }
    }

    @Override // j7.a
    public void b(Intent intent) {
    }

    @Override // j7.a
    public void c(k7.b bVar) {
    }

    public String g(Authorization.Request request) {
        return o7.b.a(this, request, o(), m(), k());
    }

    public void h(SslErrorHandler sslErrorHandler) {
        if (sslErrorHandler != null) {
            sslErrorHandler.cancel();
        }
        D(this.f42239d);
        this.f42249n = true;
    }

    public void i() {
        this.f42240e.setWebViewClient(new a());
    }

    @Override // android.app.Activity
    public boolean isDestroyed() {
        try {
            return super.isDestroyed();
        } catch (Throwable unused) {
            return this.f42248m;
        }
    }

    public abstract String j(int i10);

    public abstract String k();

    public abstract String l();

    public abstract String m();

    public View n(ViewGroup viewGroup) {
        return LayoutInflater.from(this).inflate(R.layout.layout_open_loading_view, viewGroup, false);
    }

    public abstract String o();

    @Override // android.app.Activity
    public void onBackPressed() {
        x("", -2);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f42250o = this;
        p(getIntent(), this);
        setContentView(R.layout.layout_open_web_authorize);
        t();
        s();
        r();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f42248m = true;
        WebView webView = this.f42240e;
        if (webView != null) {
            ViewParent parent = webView.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.f42240e);
            }
            this.f42240e.stopLoading();
            this.f42240e.setWebViewClient(null);
            this.f42240e.removeAllViews();
            this.f42240e.destroy();
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        AlertDialog alertDialog = this.f42242g;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        this.f42242g.dismiss();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
    }

    public abstract boolean p(Intent intent, j7.a aVar);

    public final void r() {
        Authorization.Request request = this.f42241f;
        if (request == null) {
            finish();
            return;
        }
        if (!v()) {
            this.f42249n = true;
            D(this.f42237b);
        } else {
            F();
            i();
            this.f42240e.loadUrl(g(request));
        }
    }

    public void s() {
    }

    public abstract boolean v();

    public void w(int i10) {
        x("", i10);
    }
}
