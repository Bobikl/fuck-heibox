package com.alipay.sdk.m.x;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.JsPromptResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.lang.reflect.Method;
import z5.i;
import z5.l;

/* JADX INFO: loaded from: classes6.dex */
public class e extends LinearLayout {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Handler f39571n = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f39572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f39573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f39574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ProgressBar f39575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WebView f39576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0301e f39577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f39578h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f39579i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f39580j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final x5.a f39581k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View.OnClickListener f39582l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f39583m;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: com.alipay.sdk.m.x.e$a$a, reason: collision with other inner class name */
        public class RunnableC0300a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f39585b;

            public RunnableC0300a(View view) {
                this.f39585b = view;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f39585b.setEnabled(true);
            }
        }

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h hVar = e.this.f39580j;
            if (hVar != null) {
                view.setEnabled(false);
                e.f39571n.postDelayed(new RunnableC0300a(view), 256L);
                if (view == e.this.f39572b) {
                    hVar.h(e.this);
                } else if (view == e.this.f39574d) {
                    hVar.g(e.this);
                }
            }
        }
    }

    public class b implements DownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f39587a;

        public b(Context context) {
            this.f39587a = context;
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                this.f39587a.startActivity(intent);
            } catch (Throwable unused) {
            }
        }
    }

    public class c extends WebChromeClient {
        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            return e.this.f39578h.a(e.this, str, str2, str3, jsPromptResult);
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            if (!e.this.f39577g.f39592b) {
                e.this.f39575e.setVisibility(8);
            } else {
                if (i10 > 90) {
                    e.this.f39575e.setVisibility(4);
                    return;
                }
                if (e.this.f39575e.getVisibility() == 4) {
                    e.this.f39575e.setVisibility(0);
                }
                e.this.f39575e.setProgress(i10);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            e.this.f39578h.e(e.this, str);
        }
    }

    public class d extends WebViewClient {
        public d() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (e.this.f39579i.b(e.this, str)) {
                return;
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (e.this.f39579i.d(e.this, str)) {
                return;
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            if (e.this.f39579i.f(e.this, i10, str, str2)) {
                return;
            }
            super.onReceivedError(webView, i10, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (e.this.f39579i.i(e.this, sslErrorHandler, sslError)) {
                return;
            }
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (e.this.f39579i.c(e.this, str)) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.x.e$e, reason: collision with other inner class name */
    public static final class C0301e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f39591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f39592b;

        public C0301e(boolean z10, boolean z11) {
            this.f39591a = z10;
            this.f39592b = z11;
        }
    }

    public interface f {
        boolean a(e eVar, String str, String str2, String str3, JsPromptResult jsPromptResult);

        void e(e eVar, String str);
    }

    public interface g {
        boolean b(e eVar, String str);

        boolean c(e eVar, String str);

        boolean d(e eVar, String str);

        boolean f(e eVar, int i10, String str, String str2);

        boolean i(e eVar, SslErrorHandler sslErrorHandler, SslError sslError);
    }

    public interface h {
        void g(e eVar);

        void h(e eVar);
    }

    public e(Context context, AttributeSet attributeSet, x5.a aVar, C0301e c0301e) {
        super(context, attributeSet);
        this.f39582l = new a();
        this.f39577g = c0301e == null ? new C0301e(false, false) : c0301e;
        this.f39581k = aVar;
        this.f39583m = context.getResources().getDisplayMetrics().density;
        setOrientation(1);
        d(context);
        j(context);
        l(context);
    }

    public e(Context context, x5.a aVar, C0301e c0301e) {
        this(context, null, aVar, c0301e);
    }

    private int a(int i10) {
        return (int) (i10 * this.f39583m);
    }

    private void d(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundColor(-218103809);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setVisibility(this.f39577g.f39591a ? 0 : 8);
        ImageView imageView = new ImageView(context);
        this.f39572b = imageView;
        imageView.setOnClickListener(this.f39582l);
        this.f39572b.setScaleType(ImageView.ScaleType.CENTER);
        this.f39572b.setImageDrawable(i.a(i.f141889a, context));
        this.f39572b.setPadding(a(12), 0, a(12), 0);
        linearLayout.addView(this.f39572b, new LinearLayout.LayoutParams(-2, -2));
        View view = new View(context);
        view.setBackgroundColor(-2500135);
        linearLayout.addView(view, new LinearLayout.LayoutParams(a(1), a(25)));
        TextView textView = new TextView(context);
        this.f39573c = textView;
        textView.setTextColor(-15658735);
        this.f39573c.setTextSize(17.0f);
        this.f39573c.setMaxLines(1);
        this.f39573c.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(a(17), 0, 0, 0);
        layoutParams.weight = 1.0f;
        linearLayout.addView(this.f39573c, layoutParams);
        ImageView imageView2 = new ImageView(context);
        this.f39574d = imageView2;
        imageView2.setOnClickListener(this.f39582l);
        this.f39574d.setScaleType(ImageView.ScaleType.CENTER);
        this.f39574d.setImageDrawable(i.a(i.f141890b, context));
        this.f39574d.setPadding(a(12), 0, a(12), 0);
        linearLayout.addView(this.f39574d, new LinearLayout.LayoutParams(-2, -2));
        addView(linearLayout, new LinearLayout.LayoutParams(-1, a(48)));
    }

    private void j(Context context) {
        ProgressBar progressBar = new ProgressBar(context, null, R.style.Widget.ProgressBar.Horizontal);
        this.f39575e = progressBar;
        progressBar.setProgressDrawable(context.getResources().getDrawable(R.drawable.progress_horizontal));
        this.f39575e.setMax(100);
        this.f39575e.setBackgroundColor(-218103809);
        addView(this.f39575e, new LinearLayout.LayoutParams(-1, a(2)));
    }

    private void l(Context context) {
        WebView webView = new WebView(context);
        this.f39576f = webView;
        webView.setVerticalScrollbarOverlay(true);
        e(this.f39576f, context);
        WebSettings settings = this.f39576f.getSettings();
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setSupportMultipleWindows(true);
        settings.setUseWideViewPort(true);
        settings.setAppCacheMaxSize(5242880L);
        settings.setAppCachePath(context.getCacheDir().getAbsolutePath());
        settings.setAllowFileAccess(false);
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAppCacheEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setCacheMode(1);
        settings.setDomStorageEnabled(true);
        settings.setAllowContentAccess(false);
        this.f39576f.setVerticalScrollbarOverlay(true);
        this.f39576f.setDownloadListener(new b(context));
        try {
            try {
                this.f39576f.removeJavascriptInterface("searchBoxJavaBridge_");
                this.f39576f.removeJavascriptInterface("accessibility");
                this.f39576f.removeJavascriptInterface("accessibilityTraversal");
            } catch (Exception unused) {
                Method method = this.f39576f.getClass().getMethod("removeJavascriptInterface", new Class[0]);
                if (method != null) {
                    method.invoke(this.f39576f, "searchBoxJavaBridge_");
                    method.invoke(this.f39576f, "accessibility");
                    method.invoke(this.f39576f, "accessibilityTraversal");
                }
            }
        } catch (Throwable unused2) {
        }
        com.alipay.sdk.m.x.c.j(this.f39576f);
        addView(this.f39576f, new LinearLayout.LayoutParams(-1, -1));
    }

    public void c() {
        removeAllViews();
        this.f39576f.removeAllViews();
        this.f39576f.setWebViewClient(null);
        this.f39576f.setWebChromeClient(null);
        this.f39576f.destroy();
    }

    public void e(WebView webView, Context context) {
        String userAgentString = webView.getSettings().getUserAgentString();
        webView.getSettings().setUserAgentString(userAgentString + l.a0(context));
    }

    public void f(String str) {
        this.f39576f.loadUrl(str);
        com.alipay.sdk.m.x.c.j(this.f39576f);
    }

    public void g(String str, byte[] bArr) {
        this.f39576f.postUrl(str, bArr);
    }

    public ImageView getBackButton() {
        return this.f39572b;
    }

    public ProgressBar getProgressbar() {
        return this.f39575e;
    }

    public ImageView getRefreshButton() {
        return this.f39574d;
    }

    public TextView getTitle() {
        return this.f39573c;
    }

    public String getUrl() {
        return this.f39576f.getUrl();
    }

    public WebView getWebView() {
        return this.f39576f;
    }

    public void setChromeProxy(f fVar) {
        this.f39578h = fVar;
        if (fVar == null) {
            this.f39576f.setWebChromeClient(null);
        } else {
            this.f39576f.setWebChromeClient(new c());
        }
    }

    public void setWebClientProxy(g gVar) {
        this.f39579i = gVar;
        if (gVar == null) {
            this.f39576f.setWebViewClient(null);
        } else {
            this.f39576f.setWebViewClient(new d());
        }
    }

    public void setWebEventProxy(h hVar) {
        this.f39580j = hVar;
    }
}
